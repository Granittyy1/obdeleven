package com.parse;

import com.parse.ParseObject;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ParseQuery<T extends ParseObject> {
    private final State.Builder<T> builder;
    private Set<TaskCompletionSource<?>> currentTasks;
    private ParseUser user;

    /* JADX INFO: Add missing generic type declarations: [TResult] */
    /* JADX INFO: renamed from: com.parse.ParseQuery$10, reason: invalid class name */
    public class AnonymousClass10<TResult> implements Callable<Task<TResult>> {
        final /* synthetic */ ParseCallback2 val$callback;
        final /* synthetic */ CacheThenNetworkCallable val$delegate;
        final /* synthetic */ State val$state;
        final /* synthetic */ TaskCompletionSource val$tcs;

        public AnonymousClass10(State state, CacheThenNetworkCallable cacheThenNetworkCallable, TaskCompletionSource taskCompletionSource, ParseCallback2 parseCallback2) {
            this.val$state = state;
            this.val$delegate = cacheThenNetworkCallable;
            this.val$tcs = taskCompletionSource;
            this.val$callback = parseCallback2;
        }

        @Override // java.util.concurrent.Callable
        public Task<TResult> call() {
            return (Task<TResult>) ParseQuery.this.getUserAsync(this.val$state).onSuccessTask(new Continuation<ParseUser, Task<TResult>>() { // from class: com.parse.ParseQuery.10.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<TResult> then(Task<ParseUser> task) {
                    final ParseUser result = task.getResult();
                    State<T> stateBuild = new State.Builder(AnonymousClass10.this.val$state).setCachePolicy(CachePolicy.CACHE_ONLY).build();
                    final State<T> stateBuild2 = new State.Builder(AnonymousClass10.this.val$state).setCachePolicy(CachePolicy.NETWORK_ONLY).build();
                    AnonymousClass10 anonymousClass10 = AnonymousClass10.this;
                    return ParseTaskUtils.callbackOnMainThreadAsync((Task) anonymousClass10.val$delegate.call(stateBuild, result, anonymousClass10.val$tcs.getTask()), AnonymousClass10.this.val$callback).continueWithTask(new Continuation<TResult, Task<TResult>>() { // from class: com.parse.ParseQuery.10.1.1
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<TResult> then(Task<TResult> task2) {
                            if (task2.isCancelled()) {
                                return task2;
                            }
                            AnonymousClass10 anonymousClass11 = AnonymousClass10.this;
                            return (Task) anonymousClass11.val$delegate.call(stateBuild2, result, anonymousClass11.val$tcs.getTask());
                        }
                    });
                }
            });
        }
    }

    public enum CachePolicy {
        IGNORE_CACHE,
        CACHE_ONLY,
        NETWORK_ONLY,
        CACHE_ELSE_NETWORK,
        NETWORK_ELSE_CACHE,
        CACHE_THEN_NETWORK
    }

    public interface CacheThenNetworkCallable<T extends ParseObject, TResult> {
        TResult call(State<T> state, ParseUser parseUser, Task<Void> task);
    }

    public static class KeyConstraints extends HashMap<String, Object> {
    }

    public static class QueryConstraints extends HashMap<String, Object> {
        public QueryConstraints() {
        }

        public QueryConstraints(Map<? extends String, ?> map) {
            super(map);
        }
    }

    public static class RelationConstraint {
        private String key;
        private ParseObject object;

        public RelationConstraint(String str, ParseObject parseObject) {
            if (str == null || parseObject == null) {
                throw new IllegalArgumentException("Arguments must not be null.");
            }
            this.key = str;
            this.object = parseObject;
        }

        public JSONObject encode(ParseEncoder parseEncoder) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key", this.key);
                jSONObject.put("object", parseEncoder.encodeRelatedObject(this.object));
                return jSONObject;
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }

        public ParseRelation<ParseObject> getRelation() {
            return this.object.getRelation(this.key);
        }
    }

    public static class State<T extends ParseObject> {
        private final CachePolicy cachePolicy;
        private final String className;
        private final Map<String, Object> extraOptions;
        private final boolean ignoreACLs;
        private final Set<String> include;
        private final boolean isFromLocalDatastore;
        private final int limit;
        private final long maxCacheAge;
        private final List<String> order;
        private final String pinName;
        private final Set<String> selectedKeys;
        private final int skip;
        private final boolean trace;
        private final QueryConstraints where;

        public static class Builder<T extends ParseObject> {
            private CachePolicy cachePolicy;
            private final String className;
            private final Map<String, Object> extraOptions;
            private boolean ignoreACLs;
            private final Set<String> includes;
            private boolean isFromLocalDatastore;
            private int limit;
            private long maxCacheAge;
            private List<String> order;
            private String pinName;
            private Set<String> selectedKeys;
            private int skip;
            private boolean trace;
            private final QueryConstraints where;

            public Builder(String str) {
                this.where = new QueryConstraints();
                this.includes = new HashSet();
                this.extraOptions = new HashMap();
                this.limit = -1;
                this.skip = 0;
                this.order = new ArrayList();
                this.cachePolicy = CachePolicy.IGNORE_CACHE;
                this.maxCacheAge = Long.MAX_VALUE;
                this.isFromLocalDatastore = false;
                this.className = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0015  */
            private Builder<T> addConditionInternal(String str, String str2, Object obj) {
                KeyConstraints keyConstraints;
                if (this.where.containsKey(str)) {
                    Object obj2 = this.where.get(str);
                    if (obj2 instanceof KeyConstraints) {
                        keyConstraints = (KeyConstraints) obj2;
                    } else {
                        keyConstraints = null;
                    }
                } else {
                    keyConstraints = null;
                }
                if (keyConstraints == null) {
                    keyConstraints = new KeyConstraints();
                }
                keyConstraints.put(str2, obj);
                this.where.put(str, keyConstraints);
                return this;
            }

            private Builder<T> addOrder(String str) {
                this.order.add(str);
                return this;
            }

            public static <T extends ParseObject> Builder<T> or(List<Builder<T>> list) {
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("Can't take an or of an empty list of queries");
                }
                ArrayList arrayList = new ArrayList();
                String str = null;
                for (Builder<T> builder : list) {
                    if (str != null && !((Builder) builder).className.equals(str)) {
                        throw new IllegalArgumentException("All of the queries in an or query must be on the same class ");
                    }
                    if (((Builder) builder).limit >= 0) {
                        throw new IllegalArgumentException("Cannot have limits in sub queries of an 'OR' query");
                    }
                    if (((Builder) builder).skip > 0) {
                        throw new IllegalArgumentException("Cannot have skips in sub queries of an 'OR' query");
                    }
                    if (!((Builder) builder).order.isEmpty()) {
                        throw new IllegalArgumentException("Cannot have an order in sub queries of an 'OR' query");
                    }
                    if (!((Builder) builder).includes.isEmpty()) {
                        throw new IllegalArgumentException("Cannot have an include in sub queries of an 'OR' query");
                    }
                    if (((Builder) builder).selectedKeys != null) {
                        throw new IllegalArgumentException("Cannot have an selectKeys in sub queries of an 'OR' query");
                    }
                    str = ((Builder) builder).className;
                    arrayList.add(((Builder) builder).where);
                }
                return new Builder(str).whereSatifiesAnyOf(arrayList);
            }

            private Builder<T> setOrder(String str) {
                this.order.clear();
                this.order.add(str);
                return this;
            }

            private Builder<T> whereSatifiesAnyOf(List<QueryConstraints> list) {
                this.where.put("$or", list);
                return this;
            }

            public Builder<T> addAscendingOrder(String str) {
                return addOrder(str);
            }

            public Builder<T> addCondition(String str, String str2, Collection<?> collection) {
                return addConditionInternal(str, str2, Collections.unmodifiableCollection(collection));
            }

            public Builder<T> addDescendingOrder(String str) {
                return addOrder(B7.b.c("-", str));
            }

            public State<T> build() {
                if (this.isFromLocalDatastore || !this.ignoreACLs) {
                    return new State<>(this);
                }
                throw new IllegalStateException("`ignoreACLs` cannot be combined with network queries");
            }

            public Builder<T> fromPin(String str) {
                ParseQuery.throwIfLDSDisabled();
                this.isFromLocalDatastore = true;
                this.pinName = str;
                return this;
            }

            public int getLimit() {
                return this.limit;
            }

            public int getSkip() {
                return this.skip;
            }

            public Builder<T> ignoreACLs() {
                ParseQuery.throwIfLDSDisabled();
                this.ignoreACLs = true;
                return this;
            }

            public Builder<T> include(String str) {
                this.includes.add(str);
                return this;
            }

            public Builder<T> orderByAscending(String str) {
                return setOrder(str);
            }

            public Builder<T> orderByDescending(String str) {
                return setOrder(B7.b.c("-", str));
            }

            public Builder<T> redirectClassNameForKey(String str) {
                this.extraOptions.put("redirectClassNameForKey", str);
                return this;
            }

            public Builder<T> selectKeys(Collection<String> collection) {
                if (this.selectedKeys == null) {
                    this.selectedKeys = new HashSet();
                }
                this.selectedKeys.addAll(collection);
                return this;
            }

            public Builder<T> setCachePolicy(CachePolicy cachePolicy) {
                ParseQuery.throwIfLDSEnabled();
                this.cachePolicy = cachePolicy;
                return this;
            }

            public Builder<T> setLimit(int i10) {
                this.limit = i10;
                return this;
            }

            public Builder<T> setSkip(int i10) {
                this.skip = i10;
                return this;
            }

            public Builder<T> whereEqualTo(String str, Object obj) {
                this.where.put(str, obj);
                return this;
            }

            public Builder<T> whereMatchesQuery(String str, Builder<?> builder) {
                return addConditionInternal(str, "$inQuery", builder);
            }

            public Builder<T> whereObjectIdEquals(String str) {
                this.where.clear();
                this.where.put("objectId", str);
                return this;
            }

            public Builder<T> whereRelatedTo(ParseObject parseObject, String str) {
                this.where.put("$relatedTo", new RelationConstraint(str, parseObject));
                return this;
            }

            public Builder<T> addCondition(String str, String str2, Object obj) {
                return addConditionInternal(str, str2, obj);
            }

            public Builder(Class<T> cls) {
                this(ParseQuery.getSubclassingController().getClassName(cls));
            }

            public Builder(State state) {
                QueryConstraints queryConstraints = new QueryConstraints();
                this.where = queryConstraints;
                HashSet hashSet = new HashSet();
                this.includes = hashSet;
                HashMap map = new HashMap();
                this.extraOptions = map;
                this.limit = -1;
                this.skip = 0;
                this.order = new ArrayList();
                this.cachePolicy = CachePolicy.IGNORE_CACHE;
                this.maxCacheAge = Long.MAX_VALUE;
                this.isFromLocalDatastore = false;
                this.className = state.className();
                queryConstraints.putAll(state.constraints());
                hashSet.addAll(state.includes());
                this.selectedKeys = state.selectedKeys() != null ? new HashSet(state.selectedKeys()) : null;
                this.limit = state.limit();
                this.skip = state.skip();
                this.order.addAll(state.order());
                map.putAll(state.extraOptions());
                this.trace = state.isTracingEnabled();
                this.cachePolicy = state.cachePolicy();
                this.maxCacheAge = state.maxCacheAge();
                this.isFromLocalDatastore = state.isFromLocalDatastore();
                this.pinName = state.pinName();
                this.ignoreACLs = state.ignoreACLs();
            }
        }

        public CachePolicy cachePolicy() {
            return this.cachePolicy;
        }

        public String className() {
            return this.className;
        }

        public QueryConstraints constraints() {
            return this.where;
        }

        public Map<String, Object> extraOptions() {
            return this.extraOptions;
        }

        public boolean ignoreACLs() {
            return this.ignoreACLs;
        }

        public Set<String> includes() {
            return this.include;
        }

        public boolean isFromLocalDatastore() {
            return this.isFromLocalDatastore;
        }

        public boolean isTracingEnabled() {
            return this.trace;
        }

        public int limit() {
            return this.limit;
        }

        public long maxCacheAge() {
            return this.maxCacheAge;
        }

        public List<String> order() {
            return this.order;
        }

        public String pinName() {
            return this.pinName;
        }

        public Set<String> selectedKeys() {
            return this.selectedKeys;
        }

        public int skip() {
            return this.skip;
        }

        public JSONObject toJSON(ParseEncoder parseEncoder) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("className", this.className);
                jSONObject.put("where", parseEncoder.encode(this.where));
                int i10 = this.limit;
                if (i10 >= 0) {
                    jSONObject.put("limit", i10);
                }
                int i11 = this.skip;
                if (i11 > 0) {
                    jSONObject.put(ActionType.SKIP, i11);
                }
                if (!this.order.isEmpty()) {
                    jSONObject.put("order", ParseTextUtils.join(",", this.order));
                }
                if (!this.include.isEmpty()) {
                    jSONObject.put("include", ParseTextUtils.join(",", this.include));
                }
                Set<String> set = this.selectedKeys;
                if (set != null) {
                    jSONObject.put("fields", ParseTextUtils.join(",", set));
                }
                if (this.trace) {
                    jSONObject.put("trace", 1);
                }
                for (String str : this.extraOptions.keySet()) {
                    jSONObject.put(str, parseEncoder.encode(this.extraOptions.get(str)));
                }
                return jSONObject;
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }

        public String toString() {
            return String.format(Locale.US, "%s[className=%s, where=%s, include=%s, selectedKeys=%s, limit=%s, skip=%s, order=%s, extraOptions=%s, cachePolicy=%s, maxCacheAge=%s, trace=%s]", getClass().getName(), this.className, this.where, this.include, this.selectedKeys, Integer.valueOf(this.limit), Integer.valueOf(this.skip), this.order, this.extraOptions, this.cachePolicy, Long.valueOf(this.maxCacheAge), Boolean.valueOf(this.trace));
        }

        private State(Builder<T> builder) {
            this.className = ((Builder) builder).className;
            this.where = new QueryConstraints(((Builder) builder).where);
            this.include = Collections.unmodifiableSet(new HashSet(((Builder) builder).includes));
            this.selectedKeys = ((Builder) builder).selectedKeys != null ? Collections.unmodifiableSet(new HashSet(((Builder) builder).selectedKeys)) : null;
            this.limit = ((Builder) builder).limit;
            this.skip = ((Builder) builder).skip;
            this.order = Collections.unmodifiableList(new ArrayList(((Builder) builder).order));
            this.extraOptions = Collections.unmodifiableMap(new HashMap(((Builder) builder).extraOptions));
            this.trace = ((Builder) builder).trace;
            this.cachePolicy = ((Builder) builder).cachePolicy;
            this.maxCacheAge = ((Builder) builder).maxCacheAge;
            this.isFromLocalDatastore = ((Builder) builder).isFromLocalDatastore;
            this.pinName = ((Builder) builder).pinName;
            this.ignoreACLs = ((Builder) builder).ignoreACLs;
        }
    }

    public ParseQuery(Class<T> cls) {
        this(getSubclassingController().getClassName(cls));
    }

    private String buildStartsWithRegex(String str) {
        return "^" + Pattern.quote(str);
    }

    private <TResult> Task<TResult> doCacheThenNetwork(State<T> state, ParseCallback2<TResult, ParseException> parseCallback2, CacheThenNetworkCallable<T, Task<TResult>> cacheThenNetworkCallable) {
        TaskCompletionSource<?> taskCompletionSource = new TaskCompletionSource<>();
        return perform(new AnonymousClass10(state, cacheThenNetworkCallable, taskCompletionSource, parseCallback2), taskCompletionSource);
    }

    private Task<List<T>> findAsync(final State<T> state) {
        final TaskCompletionSource<?> taskCompletionSource = new TaskCompletionSource<>();
        return (Task<List<T>>) perform(new Callable<Task<List<T>>>() { // from class: com.parse.ParseQuery.3
            @Override // java.util.concurrent.Callable
            public Task<List<T>> call() {
                return (Task<List<T>>) ParseQuery.this.getUserAsync(state).onSuccessTask(new Continuation<ParseUser, Task<List<T>>>() { // from class: com.parse.ParseQuery.3.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<List<T>> then(Task<ParseUser> task) {
                        ParseUser result = task.getResult();
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        return ParseQuery.this.findAsync(state, result, taskCompletionSource.getTask());
                    }
                });
            }
        }, taskCompletionSource);
    }

    private Task<T> getFirstAsync(final State<T> state) {
        final TaskCompletionSource<?> taskCompletionSource = new TaskCompletionSource<>();
        return (Task<T>) perform(new Callable<Task<T>>() { // from class: com.parse.ParseQuery.5
            @Override // java.util.concurrent.Callable
            public Task<T> call() {
                return (Task<T>) ParseQuery.this.getUserAsync(state).onSuccessTask(new Continuation<ParseUser, Task<T>>() { // from class: com.parse.ParseQuery.5.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<T> then(Task<ParseUser> task) {
                        ParseUser result = task.getResult();
                        AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                        return ParseQuery.this.getFirstAsync(state, result, taskCompletionSource.getTask());
                    }
                });
            }
        }, taskCompletionSource);
    }

    public static <T extends ParseObject> ParseQuery<T> getQuery(Class<T> cls) {
        return new ParseQuery<>(cls);
    }

    private static ParseQueryController getQueryController() {
        return ParseCorePlugins.getInstance().getQueryController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ParseObjectSubclassingController getSubclassingController() {
        return ParseCorePlugins.getInstance().getSubclassingController();
    }

    public static <T extends ParseObject> ParseQuery<T> or(List<ParseQuery<T>> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Can't take an or of an empty list of queries");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ParseQuery<T>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getBuilder());
        }
        return new ParseQuery<>(State.Builder.or(arrayList));
    }

    private <TResult> Task<TResult> perform(Callable<Task<TResult>> callable, final TaskCompletionSource<?> taskCompletionSource) {
        Task<TResult> taskForError;
        this.currentTasks.add(taskCompletionSource);
        try {
            taskForError = callable.call();
        } catch (Exception e10) {
            taskForError = Task.forError(e10);
        }
        return (Task<TResult>) taskForError.continueWithTask(new Continuation<TResult, Task<TResult>>() { // from class: com.parse.ParseQuery.1
            @Override // com.parse.boltsinternal.Continuation
            public Task<TResult> then(Task<TResult> task) {
                taskCompletionSource.trySetResult(null);
                ParseQuery.this.currentTasks.remove(taskCompletionSource);
                return task;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void throwIfLDSDisabled() {
        throwIfLDSEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void throwIfLDSEnabled() {
        throwIfLDSEnabled(false);
    }

    public ParseQuery<T> addAscendingOrder(String str) {
        this.builder.addAscendingOrder(str);
        return this;
    }

    public ParseQuery<T> addDescendingOrder(String str) {
        this.builder.addDescendingOrder(str);
        return this;
    }

    public void clearCachedResult() {
        ParseUser parseUser;
        throwIfLDSEnabled();
        State<T> stateBuild = this.builder.build();
        try {
            parseUser = (ParseUser) ParseTaskUtils.wait(getUserAsync(stateBuild));
        } catch (ParseException unused) {
            parseUser = null;
        }
        ParseKeyValueCache.clearFromKeyValueCache(ParseRESTQueryCommand.findCommand(stateBuild, parseUser != null ? parseUser.getSessionToken() : null).getCacheKey());
    }

    public List<T> find() throws ParseException {
        return (List) ParseTaskUtils.wait(findInBackground());
    }

    public Task<List<T>> findInBackground() {
        return findAsync(this.builder.build());
    }

    public ParseQuery<T> fromPin(String str) {
        this.builder.fromPin(str);
        return this;
    }

    public T get(String str) throws ParseException {
        return (T) ParseTaskUtils.wait(getInBackground(str));
    }

    public State.Builder<T> getBuilder() {
        return this.builder;
    }

    public T getFirst() throws ParseException {
        return (T) ParseTaskUtils.wait(getFirstInBackground());
    }

    public Task<T> getFirstInBackground() {
        return getFirstAsync(this.builder.setLimit(1).build());
    }

    public Task<T> getInBackground(String str) {
        return getFirstAsync(this.builder.setSkip(-1).whereObjectIdEquals(str).build());
    }

    public int getLimit() {
        return this.builder.getLimit();
    }

    public int getSkip() {
        return this.builder.getSkip();
    }

    public Task<ParseUser> getUserAsync(State<T> state) {
        if (state.ignoreACLs()) {
            return Task.forResult(null);
        }
        ParseUser parseUser = this.user;
        return parseUser != null ? Task.forResult(parseUser) : ParseUser.getCurrentUserAsync();
    }

    public ParseQuery<T> ignoreACLs() {
        this.builder.ignoreACLs();
        return this;
    }

    public ParseQuery<T> include(String str) {
        this.builder.include(str);
        return this;
    }

    public ParseQuery<T> orderByAscending(String str) {
        this.builder.orderByAscending(str);
        return this;
    }

    public ParseQuery<T> orderByDescending(String str) {
        this.builder.orderByDescending(str);
        return this;
    }

    public ParseQuery<T> selectKeys(Collection<String> collection) {
        this.builder.selectKeys(collection);
        return this;
    }

    public ParseQuery<T> setCachePolicy(CachePolicy cachePolicy) {
        this.builder.setCachePolicy(cachePolicy);
        return this;
    }

    public ParseQuery<T> setLimit(int i10) {
        this.builder.setLimit(i10);
        return this;
    }

    public ParseQuery<T> setSkip(int i10) {
        this.builder.setSkip(i10);
        return this;
    }

    public ParseQuery<T> whereContainedIn(String str, Collection<?> collection) {
        this.builder.addCondition(str, "$in", collection);
        return this;
    }

    public ParseQuery<T> whereContains(String str, String str2) {
        whereMatches(str, Pattern.quote(str2));
        return this;
    }

    public ParseQuery<T> whereDoesNotExist(String str) {
        this.builder.addCondition(str, "$exists", Boolean.FALSE);
        return this;
    }

    public ParseQuery<T> whereEqualTo(String str, Object obj) {
        this.builder.whereEqualTo(str, obj);
        return this;
    }

    public ParseQuery<T> whereExists(String str) {
        this.builder.addCondition(str, "$exists", Boolean.TRUE);
        return this;
    }

    public ParseQuery<T> whereGreaterThan(String str, Object obj) {
        this.builder.addCondition(str, "$gt", obj);
        return this;
    }

    public ParseQuery<T> whereGreaterThanOrEqualTo(String str, Object obj) {
        this.builder.addCondition(str, "$gte", obj);
        return this;
    }

    public ParseQuery<T> whereMatches(String str, String str2) {
        this.builder.addCondition(str, "$regex", str2);
        return this;
    }

    public ParseQuery<T> whereMatchesQuery(String str, ParseQuery<?> parseQuery) {
        this.builder.whereMatchesQuery(str, parseQuery.getBuilder());
        return this;
    }

    public ParseQuery<T> whereNotContainedIn(String str, Collection<?> collection) {
        this.builder.addCondition(str, "$nin", collection);
        return this;
    }

    public ParseQuery<T> whereNotEqualTo(String str, Object obj) {
        this.builder.addCondition(str, "$ne", obj);
        return this;
    }

    public ParseQuery<T> whereStartsWith(String str, String str2) {
        whereMatches(str, buildStartsWithRegex(str2));
        return this;
    }

    public ParseQuery(String str) {
        this(new State.Builder(str));
    }

    public static <T extends ParseObject> ParseQuery<T> getQuery(String str) {
        return new ParseQuery<>(str);
    }

    private static void throwIfLDSEnabled(boolean z10) {
        boolean zIsLocalDatastoreEnabled = Parse.isLocalDatastoreEnabled();
        if (z10 && !zIsLocalDatastoreEnabled) {
            throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
        }
        if (!z10 && zIsLocalDatastoreEnabled) {
            throw new IllegalStateException("Unsupported method when Local Datastore is enabled.");
        }
    }

    public ParseQuery(State.Builder<T> builder) {
        this.currentTasks = Collections.synchronizedSet(new HashSet());
        this.builder = builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<T> getFirstAsync(State<T> state, ParseUser parseUser, Task<Void> task) {
        return getQueryController().getFirstAsync(state, parseUser, task);
    }

    public Task<List<T>> findAsync(State<T> state, ParseUser parseUser, Task<Void> task) {
        return getQueryController().findAsync(state, parseUser, task);
    }

    public void getFirstInBackground(GetCallback<T> getCallback) {
        Task<T> firstAsync;
        State<T> stateBuild = this.builder.setLimit(1).build();
        if (stateBuild.cachePolicy() == CachePolicy.CACHE_THEN_NETWORK && !stateBuild.isFromLocalDatastore()) {
            firstAsync = doCacheThenNetwork(stateBuild, getCallback, new CacheThenNetworkCallable<T, Task<T>>() { // from class: com.parse.ParseQuery.4
                @Override // com.parse.ParseQuery.CacheThenNetworkCallable
                public /* bridge */ /* synthetic */ Object call(State state, ParseUser parseUser, Task task) {
                    return call(state, parseUser, (Task<Void>) task);
                }

                @Override // com.parse.ParseQuery.CacheThenNetworkCallable
                public Task<T> call(State<T> state, ParseUser parseUser, Task<Void> task) {
                    return ParseQuery.this.getFirstAsync(state, parseUser, task);
                }
            });
        } else {
            firstAsync = getFirstAsync(stateBuild);
        }
        ParseTaskUtils.callbackOnMainThreadAsync(firstAsync, getCallback);
    }

    public void getInBackground(String str, GetCallback<T> getCallback) {
        Task<T> firstAsync;
        State<T> stateBuild = this.builder.setSkip(-1).whereObjectIdEquals(str).build();
        if (stateBuild.cachePolicy() == CachePolicy.CACHE_THEN_NETWORK && !stateBuild.isFromLocalDatastore()) {
            firstAsync = doCacheThenNetwork(stateBuild, getCallback, new CacheThenNetworkCallable<T, Task<T>>() { // from class: com.parse.ParseQuery.9
                @Override // com.parse.ParseQuery.CacheThenNetworkCallable
                public /* bridge */ /* synthetic */ Object call(State state, ParseUser parseUser, Task task) {
                    return call(state, parseUser, (Task<Void>) task);
                }

                @Override // com.parse.ParseQuery.CacheThenNetworkCallable
                public Task<T> call(State<T> state, ParseUser parseUser, Task<Void> task) {
                    return ParseQuery.this.getFirstAsync(state, parseUser, task);
                }
            });
        } else {
            firstAsync = getFirstAsync(stateBuild);
        }
        ParseTaskUtils.callbackOnMainThreadAsync(firstAsync, getCallback);
    }
}
