package com.parse;

import C7.g;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.gestures.d;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ParseObject implements Parcelable {
    private final Map<String, Object> estimatedData;
    boolean isDeleted;
    boolean isDeleting;
    int isDeletingEventually;
    private boolean ldsEnabledWhenParceling;
    String localId;
    final Object mutex;
    final LinkedList<ParseOperationSet> operationSetQueue;
    private final ParseMulticastDelegate<ParseObject> saveEvent;
    private State state;
    final TaskQueue taskQueue;
    private static final ThreadLocal<String> isCreatingPointerForObjectId = new ThreadLocal<String>() { // from class: com.parse.ParseObject.1
        @Override // java.lang.ThreadLocal
        public String initialValue() {
            return null;
        }
    };
    public static final Parcelable.Creator<ParseObject> CREATOR = new Parcelable.Creator<ParseObject>() { // from class: com.parse.ParseObject.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseObject createFromParcel(Parcel parcel) {
            return ParseObject.createFromParcel(parcel, new ParseObjectParcelDecoder());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseObject[] newArray(int i10) {
            return new ParseObject[i10];
        }
    };

    public static class State {
        private final Set<String> availableKeys;
        private final String className;
        private final long createdAt;
        private final boolean isComplete;
        private final String objectId;
        private final Map<String, Object> serverData;
        private final long updatedAt;

        public static class Builder extends Init<Builder> {
            public Builder(String str) {
                super(str);
            }

            @Override // com.parse.ParseObject.State.Init
            public State build() {
                return new State(this);
            }

            @Override // com.parse.ParseObject.State.Init
            public Builder self() {
                return this;
            }

            public Builder(State state) {
                super(state);
            }
        }

        public State(Init<?> init) {
            this.className = ((Init) init).className;
            this.objectId = ((Init) init).objectId;
            long j = ((Init) init).createdAt;
            this.createdAt = j;
            this.updatedAt = ((Init) init).updatedAt > 0 ? ((Init) init).updatedAt : j;
            this.serverData = Collections.unmodifiableMap(new HashMap(init.serverData));
            this.isComplete = ((Init) init).isComplete;
            this.availableKeys = Collections.synchronizedSet(((Init) init).availableKeys);
        }

        public static State createFromParcel(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
            String string = parcel.readString();
            return "_User".equals(string) ? new ParseUser.State(parcel, string, parseParcelDecoder) : new State(parcel, string, parseParcelDecoder);
        }

        public static Init<?> newBuilder(String str) {
            return "_User".equals(str) ? new ParseUser.State.Builder() : new Builder(str);
        }

        public Set<String> availableKeys() {
            return this.availableKeys;
        }

        public String className() {
            return this.className;
        }

        public long createdAt() {
            return this.createdAt;
        }

        public Object get(String str) {
            return this.serverData.get(str);
        }

        public boolean isComplete() {
            return this.isComplete;
        }

        public Set<String> keySet() {
            return this.serverData.keySet();
        }

        public String objectId() {
            return this.objectId;
        }

        public String toString() {
            return String.format(Locale.US, "%s@%s[className=%s, objectId=%s, createdAt=%d, updatedAt=%d, isComplete=%s, serverData=%s, availableKeys=%s]", getClass().getName(), Integer.toHexString(hashCode()), this.className, this.objectId, Long.valueOf(this.createdAt), Long.valueOf(this.updatedAt), Boolean.valueOf(this.isComplete), this.serverData, this.availableKeys);
        }

        public long updatedAt() {
            return this.updatedAt;
        }

        public void writeToParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
            parcel.writeString(this.className);
            parcel.writeByte(this.objectId != null ? (byte) 1 : (byte) 0);
            String str = this.objectId;
            if (str != null) {
                parcel.writeString(str);
            }
            parcel.writeLong(this.createdAt);
            parcel.writeLong(this.updatedAt);
            parcel.writeInt(this.serverData.size());
            for (String str2 : this.serverData.keySet()) {
                parcel.writeString(str2);
                parseParcelEncoder.encode(this.serverData.get(str2), parcel);
            }
            parcel.writeByte(this.isComplete ? (byte) 1 : (byte) 0);
            parcel.writeStringList(new ArrayList(this.availableKeys));
        }

        public static abstract class Init<T extends Init> {
            private Set<String> availableKeys;
            private final String className;
            private long createdAt;
            private boolean isComplete;
            private String objectId;
            Map<String, Object> serverData;
            private long updatedAt;

            public Init(String str) {
                this.serverData = new HashMap();
                this.createdAt = -1L;
                this.updatedAt = -1L;
                this.availableKeys = new HashSet();
                this.className = str;
            }

            public T apply(State state) {
                if (state.objectId() != null) {
                    objectId(state.objectId());
                }
                if (state.createdAt() > 0) {
                    createdAt(state.createdAt());
                }
                if (state.updatedAt() > 0) {
                    updatedAt(state.updatedAt());
                }
                isComplete(this.isComplete || state.isComplete());
                for (String str : state.keySet()) {
                    put(str, state.get(str));
                }
                availableKeys(state.availableKeys());
                return (T) self();
            }

            public T availableKeys(Collection<String> collection) {
                this.availableKeys.addAll(collection);
                return (T) self();
            }

            public abstract <S extends State> S build();

            public T clear() {
                this.objectId = null;
                this.createdAt = -1L;
                this.updatedAt = -1L;
                this.isComplete = false;
                this.serverData.clear();
                this.availableKeys.clear();
                return (T) self();
            }

            public T createdAt(Date date) {
                this.createdAt = date.getTime();
                return (T) self();
            }

            public T isComplete(boolean z10) {
                this.isComplete = z10;
                return (T) self();
            }

            public T objectId(String str) {
                this.objectId = str;
                return (T) self();
            }

            public T put(String str, Object obj) {
                this.serverData.put(str, obj);
                this.availableKeys.add(str);
                return (T) self();
            }

            public T remove(String str) {
                this.serverData.remove(str);
                return (T) self();
            }

            public abstract T self();

            public T updatedAt(Date date) {
                this.updatedAt = date.getTime();
                return (T) self();
            }

            public T createdAt(long j) {
                this.createdAt = j;
                return (T) self();
            }

            public T updatedAt(long j) {
                this.updatedAt = j;
                return (T) self();
            }

            public Init(State state) {
                this.serverData = new HashMap();
                this.createdAt = -1L;
                this.updatedAt = -1L;
                this.availableKeys = new HashSet();
                this.className = state.className();
                this.objectId = state.objectId();
                this.createdAt = state.createdAt();
                this.updatedAt = state.updatedAt();
                this.availableKeys = Collections.synchronizedSet(new HashSet(state.availableKeys()));
                for (String str : state.keySet()) {
                    this.serverData.put(str, state.get(str));
                    this.availableKeys.add(str);
                }
                this.isComplete = state.isComplete();
            }

            public T apply(ParseOperationSet parseOperationSet) {
                for (String str : parseOperationSet.keySet()) {
                    Object objApply = ((ParseFieldOperation) parseOperationSet.get(str)).apply(this.serverData.get(str), str);
                    if (objApply != null) {
                        put(str, objApply);
                    } else {
                        remove(str);
                    }
                }
                return (T) self();
            }
        }

        public <T extends Init<?>> T newBuilder() {
            return new Builder(this);
        }

        public State(Parcel parcel, String str, ParseParcelDecoder parseParcelDecoder) {
            this.className = str;
            this.objectId = parcel.readByte() == 1 ? parcel.readString() : null;
            long j = parcel.readLong();
            this.createdAt = j;
            long j10 = parcel.readLong();
            this.updatedAt = j10 > 0 ? j10 : j;
            int i10 = parcel.readInt();
            HashMap map = new HashMap();
            for (int i11 = 0; i11 < i10; i11++) {
                map.put(parcel.readString(), parseParcelDecoder.decode(parcel));
            }
            this.serverData = Collections.unmodifiableMap(map);
            this.isComplete = parcel.readByte() == 1;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.availableKeys = new HashSet(arrayList);
        }
    }

    public ParseObject() {
        this("_Automatic");
    }

    private void applyOperations(ParseOperationSet parseOperationSet, Map<String, Object> map) {
        for (String str : parseOperationSet.keySet()) {
            Object objApply = parseOperationSet.get(str).apply(map.get(str), str);
            if (objApply != null) {
                map.put(str, objApply);
            } else {
                map.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canBeSerialized() {
        boolean zBooleanValue;
        synchronized (this.mutex) {
            final Capture capture = new Capture(Boolean.TRUE);
            new ParseTraverser() { // from class: com.parse.ParseObject.53
                @Override // com.parse.ParseTraverser
                public boolean visit(Object obj) {
                    if ((obj instanceof ParseFile) && ((ParseFile) obj).isDirty()) {
                        capture.set(Boolean.FALSE);
                    }
                    if ((obj instanceof ParseObject) && ((ParseObject) obj).getObjectId() == null) {
                        capture.set(Boolean.FALSE);
                    }
                    return ((Boolean) capture.get()).booleanValue();
                }
            }.setYieldRoot(false).setTraverseParseObjects(true).traverse(this);
            zBooleanValue = ((Boolean) capture.get()).booleanValue();
        }
        return zBooleanValue;
    }

    private void checkGetAccess(String str) {
        if (!isDataAvailable(str)) {
            throw new IllegalStateException(d.b("ParseObject has no data for '", str, "'. Call fetchIfNeeded() to get the data."));
        }
    }

    private void checkKeyIsMutable(String str) {
        if (isKeyMutable(str)) {
            return;
        }
        StringBuilder sbA = g.a("Cannot modify `", str, "` property of an ");
        sbA.append(getClassName());
        sbA.append(" object.");
        throw new IllegalArgumentException(sbA.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void collectDirtyChildren(Object obj, final Collection<ParseObject> collection, final Collection<ParseFile> collection2, final Set<ParseObject> set, final Set<ParseObject> set2) {
        new ParseTraverser() { // from class: com.parse.ParseObject.8
            @Override // com.parse.ParseTraverser
            public boolean visit(Object obj2) {
                HashSet hashSet;
                if (obj2 instanceof ParseFile) {
                    if (collection2 == null) {
                        return true;
                    }
                    ParseFile parseFile = (ParseFile) obj2;
                    if (parseFile.getUrl() == null) {
                        collection2.add(parseFile);
                    }
                    return true;
                }
                if (!(obj2 instanceof ParseObject) || collection == null) {
                    return true;
                }
                ParseObject parseObject = (ParseObject) obj2;
                Set set3 = set;
                Set set4 = set2;
                if (parseObject.getObjectId() != null) {
                    hashSet = new HashSet();
                } else {
                    if (set4.contains(parseObject)) {
                        throw new RuntimeException("Found a circular dependency while saving.");
                    }
                    HashSet hashSet2 = new HashSet(set4);
                    hashSet2.add(parseObject);
                    hashSet = hashSet2;
                }
                if (set3.contains(parseObject)) {
                    return true;
                }
                HashSet hashSet3 = new HashSet(set3);
                hashSet3.add(parseObject);
                ParseObject.collectDirtyChildren(parseObject.estimatedData, collection, collection2, hashSet3, hashSet);
                if (parseObject.isDirty(false)) {
                    collection.add(parseObject);
                }
                return true;
            }
        }.setYieldRoot(true).traverse(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, ParseObject> collectFetchedObjects() {
        final HashMap map = new HashMap();
        new ParseTraverser() { // from class: com.parse.ParseObject.22
            @Override // com.parse.ParseTraverser
            public boolean visit(Object obj) {
                if (!(obj instanceof ParseObject)) {
                    return true;
                }
                ParseObject parseObject = (ParseObject) obj;
                State state = parseObject.getState();
                if (state.objectId() == null || !state.isComplete()) {
                    return true;
                }
                map.put(state.objectId(), parseObject);
                return true;
            }
        }.traverse(this.estimatedData);
        return map;
    }

    public static ParseObject create(String str) {
        return getSubclassingController().newInstance(str);
    }

    public static ParseObject createFromParcel(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
        ParseObject parseObjectCreateWithoutData = createWithoutData(parcel.readString(), parcel.readByte() == 1 ? parcel.readString() : null);
        if (parseParcelDecoder instanceof ParseObjectParcelDecoder) {
            ((ParseObjectParcelDecoder) parseParcelDecoder).addKnownObject(parseObjectCreateWithoutData);
        }
        parseObjectCreateWithoutData.setState(State.createFromParcel(parcel, parseParcelDecoder));
        if (parcel.readByte() == 1) {
            parseObjectCreateWithoutData.localId = parcel.readString();
        }
        if (parcel.readByte() == 1) {
            parseObjectCreateWithoutData.isDeleted = true;
        }
        boolean z10 = parseObjectCreateWithoutData.ldsEnabledWhenParceling;
        ParseOperationSet parseOperationSetFromParcel = ParseOperationSet.fromParcel(parcel, parseParcelDecoder);
        if (!z10) {
            for (String str : parseOperationSetFromParcel.keySet()) {
                parseObjectCreateWithoutData.performOperation(str, parseOperationSetFromParcel.get(str));
            }
        }
        parseObjectCreateWithoutData.onRestoreInstanceState(parcel.readBundle(ParseObject.class.getClassLoader()));
        return parseObjectCreateWithoutData;
    }

    public static ParseObject createWithoutData(String str, String str2) {
        OfflineStore localDatastore = Parse.getLocalDatastore();
        try {
            try {
                if (str2 == null) {
                    isCreatingPointerForObjectId.set("*** Offline Object ***");
                } else {
                    isCreatingPointerForObjectId.set(str2);
                }
                ParseObject object = (localDatastore == null || str2 == null) ? null : localDatastore.getObject(str, str2);
                if (object == null) {
                    object = create(str);
                    if (object.hasChanges()) {
                        throw new IllegalStateException("A ParseObject subclass default constructor must not make changes to the object that cause it to be dirty.");
                    }
                }
                isCreatingPointerForObjectId.set(null);
                return object;
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException("Failed to create instance of subclass.", e11);
            }
        } catch (Throwable th) {
            isCreatingPointerForObjectId.set(null);
            throw th;
        }
    }

    private ParseOperationSet currentOperations() {
        ParseOperationSet last;
        synchronized (this.mutex) {
            last = this.operationSetQueue.getLast();
        }
        return last;
    }

    private ParseRESTObjectCommand currentSaveEventuallyCommand(ParseOperationSet parseOperationSet, ParseEncoder parseEncoder, String str) {
        State state = getState();
        return ParseRESTObjectCommand.saveObjectCommand(state, toJSONObjectForSaving(state, parseOperationSet, parseEncoder), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Task<Void> deepSaveAsync(Object obj, final String str) {
        HashSet<ParseObject> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        collectDirtyChildren(obj, hashSet, hashSet2);
        HashSet hashSet3 = new HashSet();
        for (ParseObject parseObject : hashSet) {
            if (parseObject instanceof ParseUser) {
                ParseUser parseUser = (ParseUser) parseObject;
                if (parseUser.isLazy()) {
                    hashSet3.add(parseUser);
                }
            }
        }
        hashSet.removeAll(hashSet3);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ParseFile) it.next()).saveAsync(str, null, null));
        }
        Task<TContinuationResult> taskContinueWith = Task.whenAll(arrayList).continueWith(new Continuation<Void, Void>() { // from class: com.parse.ParseObject.9
            @Override // com.parse.boltsinternal.Continuation
            public Void then(Task<Void> task) {
                atomicBoolean.set(true);
                return null;
            }
        });
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = hashSet3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ParseUser) it2.next()).saveAsync(str));
        }
        Task<TContinuationResult> taskContinueWith2 = Task.whenAll(arrayList2).continueWith(new Continuation<Void, Void>() { // from class: com.parse.ParseObject.10
            @Override // com.parse.boltsinternal.Continuation
            public Void then(Task<Void> task) {
                atomicBoolean2.set(true);
                return null;
            }
        });
        final Capture capture = new Capture(hashSet);
        return Task.whenAll(Arrays.asList(taskContinueWith, taskContinueWith2, Task.forResult(null).continueWhile(new Callable<Boolean>() { // from class: com.parse.ParseObject.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                return Boolean.valueOf(((Set) capture.get()).size() > 0);
            }
        }, new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                final ArrayList arrayList3 = new ArrayList();
                HashSet hashSet4 = new HashSet();
                for (ParseObject parseObject2 : (Set) capture.get()) {
                    if (parseObject2.canBeSerialized()) {
                        arrayList3.add(parseObject2);
                    } else {
                        hashSet4.add(parseObject2);
                    }
                }
                capture.set(hashSet4);
                if (arrayList3.size() == 0 && atomicBoolean.get() && atomicBoolean2.get()) {
                    throw new RuntimeException("Unable to save a ParseObject with a relation to a cycle.");
                }
                return arrayList3.size() == 0 ? Task.forResult(null) : ParseObject.enqueueForAll(arrayList3, new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.12.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<Void> task2) {
                        return ParseObject.saveAllAsync(arrayList3, str, task2);
                    }
                });
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> deleteAsync(final String str, Task<Void> task) {
        validateDelete();
        return task.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.50
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task2) {
                ParseObject parseObject = ParseObject.this;
                parseObject.isDeleting = true;
                return parseObject.state.objectId() == null ? task2.cast() : ParseObject.this.deleteAsync(str);
            }
        }).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.49
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task2) {
                return ParseObject.this.handleDeleteResultAsync();
            }
        }).continueWith(new Continuation<Void, Void>() { // from class: com.parse.ParseObject.48
            @Override // com.parse.boltsinternal.Continuation
            public Void then(Task<Void> task2) throws Exception {
                ParseObject.this.isDeleting = false;
                if (task2.isFaulted()) {
                    throw task2.getError();
                }
                return null;
            }
        });
    }

    public static <T> Task<T> enqueueForAll(List<? extends ParseObject> list, Continuation<Void, Task<T>> continuation) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<? extends ParseObject> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().taskQueue.getLock());
        }
        LockSet lockSet = new LockSet(arrayList);
        lockSet.lock();
        try {
            try {
                final Task<T> taskThen = continuation.then(taskCompletionSource.getTask());
                final ArrayList arrayList2 = new ArrayList();
                Iterator<? extends ParseObject> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().taskQueue.enqueue(new Continuation<Void, Task<T>>() { // from class: com.parse.ParseObject.3
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<T> then(Task<Void> task) {
                            arrayList2.add(task);
                            return taskThen;
                        }
                    });
                }
                Task.whenAll(arrayList2).continueWith(new Continuation<Void, Void>() { // from class: com.parse.ParseObject.4
                    @Override // com.parse.boltsinternal.Continuation
                    public Void then(Task<Void> task) {
                        taskCompletionSource.setResult(null);
                        return null;
                    }
                });
                lockSet.unlock();
                return taskThen;
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        } catch (Throwable th) {
            lockSet.unlock();
            throw th;
        }
    }

    private void enqueueSaveEventuallyOperationAsync(final ParseOperationSet parseOperationSet) {
        if (!parseOperationSet.isSaveEventually()) {
            throw new IllegalStateException("This should only be used to enqueue saveEventually operation sets");
        }
        this.taskQueue.enqueue(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.34
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                return task.continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.34.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<Void> task2) {
                        return Parse.getEventuallyQueue().waitForOperationSetAndEventuallyPin(parseOperationSet, null).makeVoid();
                    }
                });
            }
        });
    }

    public static <T extends ParseObject> T from(State state) {
        T t8 = (T) createWithoutData(state.className(), state.objectId());
        synchronized (t8.mutex) {
            if (!state.isComplete()) {
                state = t8.getState().newBuilder().apply(state).build();
            }
            t8.setState(state);
        }
        return t8;
    }

    public static <T extends ParseObject> T fromJSON(JSONObject jSONObject, String str, ParseDecoder parseDecoder, Set<String> set) {
        if (set != null && !set.isEmpty()) {
            try {
                jSONObject.put("__selectedKeys", new JSONArray((Collection) set));
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }
        return (T) fromJSON(jSONObject, str, parseDecoder);
    }

    private static LocalIdManager getLocalIdManager() {
        return ParseCorePlugins.getInstance().getLocalIdManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ParseObjectController getObjectController() {
        return ParseCorePlugins.getInstance().getObjectController();
    }

    private static ParseObjectSubclassingController getSubclassingController() {
        return ParseCorePlugins.getInstance().getSubclassingController();
    }

    private boolean hasDirtyChildren() {
        boolean z10;
        synchronized (this.mutex) {
            ArrayList arrayList = new ArrayList();
            collectDirtyChildren(this.estimatedData, arrayList, null);
            z10 = arrayList.size() > 0;
        }
        return z10;
    }

    private void notifyObjectIdChanged(String str, String str2) {
        synchronized (this.mutex) {
            try {
                OfflineStore localDatastore = Parse.getLocalDatastore();
                if (localDatastore != null) {
                    localDatastore.updateObjectId(this, str, str2);
                }
                if (this.localId != null) {
                    getLocalIdManager().setObjectId(this.localId, str2);
                    this.localId = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static <T extends ParseObject> Task<Void> pinAllInBackground(String str, List<T> list) {
        return pinAllInBackground(str, list, true);
    }

    private void rebuildEstimatedData() {
        synchronized (this.mutex) {
            try {
                this.estimatedData.clear();
                for (String str : this.state.keySet()) {
                    this.estimatedData.put(str, this.state.get(str));
                }
                Iterator<ParseOperationSet> it = this.operationSetQueue.iterator();
                while (it.hasNext()) {
                    applyOperations(it.next(), this.estimatedData);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void registerParseSubclasses() {
        registerSubclass(ParseUser.class);
        registerSubclass(ParseRole.class);
        registerSubclass(ParseInstallation.class);
        registerSubclass(ParseSession.class);
        registerSubclass(ParsePin.class);
        registerSubclass(EventuallyPin.class);
    }

    public static void registerSubclass(Class<? extends ParseObject> cls) {
        getSubclassingController().registerSubclass(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends ParseObject> Task<Void> saveAllAsync(final List<T> list, final String str, Task<Void> task) {
        return task.continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task2) {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                ArrayList arrayList2 = new ArrayList(size);
                ArrayList arrayList3 = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    ParseObject parseObject = (ParseObject) list.get(i10);
                    parseObject.updateBeforeSave();
                    parseObject.validateSave();
                    arrayList.add(parseObject.getState());
                    arrayList2.add(parseObject.startSave());
                    arrayList3.add(new KnownParseObjectDecoder(parseObject.collectFetchedObjects()));
                }
                List<Task<State>> listSaveAllAsync = ParseObject.getObjectController().saveAllAsync(arrayList, arrayList2, str, arrayList3);
                ArrayList arrayList4 = new ArrayList(size);
                for (int i11 = 0; i11 < size; i11++) {
                    Task<State> task3 = listSaveAllAsync.get(i11);
                    final ParseObject parseObject2 = (ParseObject) list.get(i11);
                    final ParseOperationSet parseOperationSet = (ParseOperationSet) arrayList2.get(i11);
                    arrayList4.add(task3.continueWithTask(new Continuation<State, Task<Void>>() { // from class: com.parse.ParseObject.13.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<Void> then(final Task<State> task4) {
                            return parseObject2.handleSaveResultAsync(task4.getResult(), parseOperationSet).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.13.1.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // com.parse.boltsinternal.Continuation
                                public Task<Void> then(Task<Void> task5) {
                                    return (task5.isFaulted() || task5.isCancelled()) ? task5 : task4.makeVoid();
                                }
                            });
                        }
                    }));
                }
                return Task.whenAll(arrayList4);
            }
        });
    }

    public static <T extends ParseObject> Task<Void> saveAllInBackground(final List<T> list) {
        return ParseUser.getCurrentUserAsync().onSuccessTask(new Continuation<ParseUser, Task<String>>() { // from class: com.parse.ParseObject.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<String> then(Task<ParseUser> task) {
                final ParseACL acl;
                final ParseUser unresolvedUser;
                ParseUser result = task.getResult();
                if (result == null) {
                    return Task.forResult(null);
                }
                if (!result.isLazy()) {
                    return Task.forResult(result.getSessionToken());
                }
                for (ParseObject parseObject : list) {
                    if (parseObject.isDataAvailable("ACL") && (acl = parseObject.getACL(false)) != null && (unresolvedUser = acl.getUnresolvedUser()) != null && unresolvedUser.isCurrentUser()) {
                        return unresolvedUser.saveAsync(null).onSuccess(new Continuation<Void, String>() { // from class: com.parse.ParseObject.15.1
                            @Override // com.parse.boltsinternal.Continuation
                            public String then(Task<Void> task2) {
                                if (acl.hasUnresolvedUser()) {
                                    throw new IllegalStateException("ACL has an unresolved ParseUser. Save or sign up before attempting to serialize the ACL.");
                                }
                                return unresolvedUser.getSessionToken();
                            }
                        });
                    }
                }
                return Task.forResult(null);
            }
        }).onSuccessTask(new Continuation<String, Task<Void>>() { // from class: com.parse.ParseObject.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<String> task) {
                return ParseObject.deepSaveAsync(list, task.getResult());
            }
        });
    }

    public static <T extends ParseObject> Task<Void> unpinAllInBackground(String str, List<T> list) {
        if (!Parse.isLocalDatastoreEnabled()) {
            throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
        }
        if (str == null) {
            str = "_default";
        }
        return Parse.getLocalDatastore().unpinAllObjectsAsync(str, list);
    }

    public void addAllUnique(String str, Collection<?> collection) {
        performOperation(str, new ParseAddUniqueOperation(collection));
    }

    public void addUnique(String str, Object obj) {
        addAllUnique(str, Collections.singletonList(obj));
    }

    public boolean containsKey(String str) {
        boolean zContainsKey;
        synchronized (this.mutex) {
            zContainsKey = this.estimatedData.containsKey(str);
        }
        return zContainsKey;
    }

    public void copyChangesFrom(ParseObject parseObject) {
        synchronized (this.mutex) {
            try {
                ParseOperationSet first = parseObject.operationSetQueue.getFirst();
                for (String str : first.keySet()) {
                    performOperation(str, first.get(str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void delete() throws ParseException {
        ParseTaskUtils.wait(deleteInBackground());
    }

    public final Task<Void> deleteEventually() {
        Task<JSONObject> taskEnqueueEventuallyAsync;
        synchronized (this.mutex) {
            try {
                validateDelete();
                this.isDeletingEventually++;
                String orCreateLocalId = getObjectId() == null ? getOrCreateLocalId() : null;
                ParseRESTObjectCommand parseRESTObjectCommandDeleteObjectCommand = ParseRESTObjectCommand.deleteObjectCommand(getState(), ParseUser.getCurrentSessionToken());
                parseRESTObjectCommandDeleteObjectCommand.setLocalId(orCreateLocalId);
                taskEnqueueEventuallyAsync = Parse.getEventuallyQueue().enqueueEventuallyAsync(parseRESTObjectCommandDeleteObjectCommand, this);
            } catch (Throwable th) {
                throw th;
            }
        }
        return Parse.isLocalDatastoreEnabled() ? taskEnqueueEventuallyAsync.makeVoid() : taskEnqueueEventuallyAsync.onSuccessTask(new Continuation<JSONObject, Task<Void>>() { // from class: com.parse.ParseObject.36
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<JSONObject> task) {
                return ParseObject.this.handleDeleteEventuallyResultAsync();
            }
        });
    }

    public final Task<Void> deleteInBackground() {
        return ParseUser.getCurrentSessionTokenAsync().onSuccessTask(new Continuation<String, Task<Void>>() { // from class: com.parse.ParseObject.52
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<String> task) {
                final String result = task.getResult();
                return ParseObject.this.taskQueue.enqueue(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.52.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<Void> task2) {
                        return ParseObject.this.deleteAsync(result, task2);
                    }
                });
            }
        });
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public <T extends ParseObject> T fetch() throws ParseException {
        return (T) ParseTaskUtils.wait(fetchInBackground());
    }

    public <T extends ParseObject> Task<T> fetchAsync(final String str, Task<Void> task) {
        return task.onSuccessTask(new Continuation<Void, Task<State>>() { // from class: com.parse.ParseObject.45
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<State> then(Task<Void> task2) {
                State state;
                Map mapCollectFetchedObjects;
                synchronized (ParseObject.this.mutex) {
                    state = ParseObject.this.getState();
                    mapCollectFetchedObjects = ParseObject.this.collectFetchedObjects();
                }
                return ParseObject.getObjectController().fetchAsync(state, str, new KnownParseObjectDecoder(mapCollectFetchedObjects));
            }
        }).onSuccessTask(new Continuation<State, Task<Void>>() { // from class: com.parse.ParseObject.44
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<State> task2) {
                return ParseObject.this.handleFetchResultAsync(task2.getResult());
            }
        }).onSuccess(new Continuation<Void, T>() { // from class: com.parse.ParseObject.43
            /* JADX WARN: Incorrect return type in method signature: (Lcom/parse/boltsinternal/Task<Ljava/lang/Void;>;)TT; */
            @Override // com.parse.boltsinternal.Continuation
            public ParseObject then(Task<Void> task2) {
                return ParseObject.this;
            }
        });
    }

    public <T extends ParseObject> Task<T> fetchFromLocalDatastoreAsync() {
        if (Parse.isLocalDatastoreEnabled()) {
            return Parse.getLocalDatastore().fetchLocallyAsync(this);
        }
        throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
    }

    public final <T extends ParseObject> Task<T> fetchInBackground() {
        return (Task<T>) ParseUser.getCurrentSessionTokenAsync().onSuccessTask(new Continuation<String, Task<T>>() { // from class: com.parse.ParseObject.46
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<T> then(Task<String> task) {
                final String result = task.getResult();
                return ParseObject.this.taskQueue.enqueue(new Continuation<Void, Task<T>>() { // from class: com.parse.ParseObject.46.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<T> then(Task<Void> task2) {
                        return ParseObject.this.fetchAsync(result, task2);
                    }
                });
            }
        });
    }

    public Object get(String str) {
        synchronized (this.mutex) {
            try {
                if (str.equals("ACL")) {
                    return getACL();
                }
                checkGetAccess(str);
                Object obj = this.estimatedData.get(str);
                if (obj instanceof ParseRelation) {
                    ((ParseRelation) obj).ensureParentAndKey(this, str);
                }
                return obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ParseACL getACL() {
        return getACL(true);
    }

    public boolean getBoolean(String str) {
        synchronized (this.mutex) {
            try {
                checkGetAccess(str);
                Object obj = this.estimatedData.get(str);
                if (!(obj instanceof Boolean)) {
                    return false;
                }
                return ((Boolean) obj).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getClassName() {
        String strClassName;
        synchronized (this.mutex) {
            strClassName = this.state.className();
        }
        return strClassName;
    }

    public Date getCreatedAt() {
        long jCreatedAt = getState().createdAt();
        if (jCreatedAt > 0) {
            return new Date(jCreatedAt);
        }
        return null;
    }

    public int getInt(String str) {
        Number number = getNumber(str);
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    public JSONArray getJSONArray(String str) {
        synchronized (this.mutex) {
            try {
                checkGetAccess(str);
                Object objEncode = this.estimatedData.get(str);
                if (objEncode instanceof List) {
                    objEncode = PointerOrLocalIdEncoder.get().encode(objEncode);
                }
                if (!(objEncode instanceof JSONArray)) {
                    return null;
                }
                return (JSONArray) objEncode;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public JSONObject getJSONObject(String str) {
        synchronized (this.mutex) {
            try {
                checkGetAccess(str);
                Object objEncode = this.estimatedData.get(str);
                if (objEncode instanceof Map) {
                    objEncode = PointerOrLocalIdEncoder.get().encode(objEncode);
                }
                if (!(objEncode instanceof JSONObject)) {
                    return null;
                }
                return (JSONObject) objEncode;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <T> List<T> getList(String str) {
        synchronized (this.mutex) {
            try {
                Object obj = this.estimatedData.get(str);
                if (!(obj instanceof List)) {
                    return null;
                }
                return (List) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long getLong(String str) {
        Number number = getNumber(str);
        if (number == null) {
            return 0L;
        }
        return number.longValue();
    }

    public <V> Map<String, V> getMap(String str) {
        synchronized (this.mutex) {
            try {
                Object obj = this.estimatedData.get(str);
                if (!(obj instanceof Map)) {
                    return null;
                }
                return (Map) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Number getNumber(String str) {
        synchronized (this.mutex) {
            try {
                checkGetAccess(str);
                Object obj = this.estimatedData.get(str);
                if (!(obj instanceof Number)) {
                    return null;
                }
                return (Number) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String getObjectId() {
        String strObjectId;
        synchronized (this.mutex) {
            strObjectId = this.state.objectId();
        }
        return strObjectId;
    }

    public String getOrCreateLocalId() {
        String str;
        synchronized (this.mutex) {
            try {
                if (this.localId == null) {
                    if (this.state.objectId() != null) {
                        throw new IllegalStateException("Attempted to get a localId for an object with an objectId.");
                    }
                    this.localId = getLocalIdManager().createLocalId();
                }
                str = this.localId;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public ParseFile getParseFile(String str) {
        Object obj = get(str);
        if (obj instanceof ParseFile) {
            return (ParseFile) obj;
        }
        return null;
    }

    public ParseObject getParseObject(String str) {
        Object obj = get(str);
        if (obj instanceof ParseObject) {
            return (ParseObject) obj;
        }
        return null;
    }

    public ParseUser getParseUser(String str) {
        Object obj = get(str);
        if (obj instanceof ParseUser) {
            return (ParseUser) obj;
        }
        return null;
    }

    public <T extends ParseObject> ParseRelation<T> getRelation(String str) {
        synchronized (this.mutex) {
            try {
                Object obj = this.estimatedData.get(str);
                if (obj instanceof ParseRelation) {
                    ParseRelation<T> parseRelation = (ParseRelation) obj;
                    parseRelation.ensureParentAndKey(this, str);
                    return parseRelation;
                }
                ParseRelation<T> parseRelation2 = new ParseRelation<>(this, str);
                this.estimatedData.put(str, parseRelation2);
                return parseRelation2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public State getState() {
        State state;
        synchronized (this.mutex) {
            state = this.state;
        }
        return state;
    }

    public String getString(String str) {
        synchronized (this.mutex) {
            try {
                checkGetAccess(str);
                Object obj = this.estimatedData.get(str);
                if (!(obj instanceof String)) {
                    return null;
                }
                return (String) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Date getUpdatedAt() {
        long jUpdatedAt = getState().updatedAt();
        if (jUpdatedAt > 0) {
            return new Date(jUpdatedAt);
        }
        return null;
    }

    public Task<Void> handleDeleteEventuallyResultAsync() {
        synchronized (this.mutex) {
            this.isDeletingEventually--;
        }
        return handleDeleteResultAsync().onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.37
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                Parse.getEventuallyQueue().notifyTestHelper(6);
                return task;
            }
        });
    }

    public Task<Void> handleDeleteResultAsync() {
        Task<Void> taskForResult = Task.forResult(null);
        synchronized (this.mutex) {
            this.isDeleted = true;
        }
        final OfflineStore localDatastore = Parse.getLocalDatastore();
        return localDatastore != null ? taskForResult.continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.51
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                synchronized (ParseObject.this.mutex) {
                    try {
                        ParseObject parseObject = ParseObject.this;
                        if (!parseObject.isDeleted) {
                            return localDatastore.updateDataForObjectAsync(parseObject);
                        }
                        localDatastore.unregisterObject(parseObject);
                        return localDatastore.deleteDataForObjectAsync(ParseObject.this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }) : taskForResult;
    }

    public Task<Void> handleFetchResultAsync(final State state) {
        Task taskForResult = Task.forResult(null);
        final OfflineStore localDatastore = Parse.getLocalDatastore();
        if (localDatastore != null) {
            taskForResult = taskForResult.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.39
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task) {
                    return localDatastore.fetchLocallyAsync(ParseObject.this).makeVoid();
                }
            }).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.38
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task) {
                    if ((task.getError() instanceof ParseException) && ((ParseException) task.getError()).getCode() == 120) {
                        return null;
                    }
                    return task;
                }
            });
        }
        Task<Void> taskOnSuccessTask = taskForResult.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.40
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                synchronized (ParseObject.this.mutex) {
                    try {
                        ParseObject.this.setState(state.isComplete() ? state : ParseObject.this.getState().newBuilder().apply(state).build());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return null;
            }
        });
        return localDatastore != null ? taskOnSuccessTask.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.42
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                return localDatastore.updateDataForObjectAsync(ParseObject.this);
            }
        }).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.41
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                if ((task.getError() instanceof ParseException) && ((ParseException) task.getError()).getCode() == 120) {
                    return null;
                }
                return task;
            }
        }) : taskOnSuccessTask;
    }

    public Task<Void> handleSaveEventuallyResultAsync(JSONObject jSONObject, ParseOperationSet parseOperationSet) {
        final boolean z10 = jSONObject != null;
        return handleSaveResultAsync(jSONObject, parseOperationSet).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.35
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                if (z10) {
                    Parse.getEventuallyQueue().notifyTestHelper(5);
                }
                return task;
            }
        });
    }

    public Task<Void> handleSaveResultAsync(JSONObject jSONObject, ParseOperationSet parseOperationSet) {
        State stateBuild;
        if (jSONObject != null) {
            synchronized (this.mutex) {
                stateBuild = ParseObjectCoder.get().decode(getState().newBuilder().clear(), jSONObject, new KnownParseObjectDecoder(collectFetchedObjects())).isComplete(false).build();
            }
        } else {
            stateBuild = null;
        }
        return handleSaveResultAsync(stateBuild, parseOperationSet);
    }

    public boolean has(String str) {
        return containsKey(str);
    }

    public boolean hasChanges() {
        boolean z10;
        synchronized (this.mutex) {
            z10 = currentOperations().size() > 0;
        }
        return z10;
    }

    public boolean hasOutstandingOperations() {
        boolean z10;
        synchronized (this.mutex) {
            z10 = true;
            if (this.operationSetQueue.size() <= 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public void increment(String str) {
        increment(str, 1);
    }

    public boolean isDataAvailable() {
        boolean zIsComplete;
        synchronized (this.mutex) {
            zIsComplete = this.state.isComplete();
        }
        return zIsComplete;
    }

    public boolean isDirty() {
        return isDirty(true);
    }

    public boolean isKeyMutable(String str) {
        return true;
    }

    public Set<String> keySet() {
        Set<String> setUnmodifiableSet;
        synchronized (this.mutex) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.estimatedData.keySet());
        }
        return setUnmodifiableSet;
    }

    public void markAllFieldsDirty() {
        synchronized (this.mutex) {
            try {
                for (String str : this.state.keySet()) {
                    performPut(str, this.state.get(str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void mergeFromObject(ParseObject parseObject) {
        synchronized (this.mutex) {
            try {
                if (this == parseObject) {
                    return;
                }
                setState(parseObject.getState().newBuilder().build(), false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public State mergeFromServer(State state, JSONObject jSONObject, ParseDecoder parseDecoder, boolean z10) {
        try {
            State.Init initNewBuilder = state.newBuilder();
            if (z10) {
                initNewBuilder.clear();
            }
            initNewBuilder.isComplete(state.isComplete() || z10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!next.equals("__type") && !next.equals("className")) {
                    if (next.equals("objectId")) {
                        initNewBuilder.objectId(jSONObject.getString(next));
                    } else if (next.equals("createdAt")) {
                        initNewBuilder.createdAt(ParseDateFormat.getInstance().parse(jSONObject.getString(next)));
                    } else if (next.equals("updatedAt")) {
                        initNewBuilder.updatedAt(ParseDateFormat.getInstance().parse(jSONObject.getString(next)));
                    } else if (next.equals("ACL")) {
                        initNewBuilder.put("ACL", ParseACL.createACLFromJSONObject(jSONObject.getJSONObject(next), parseDecoder));
                    } else if (next.equals("__selectedKeys")) {
                        JSONArray jSONArray = jSONObject.getJSONArray(next);
                        if (jSONArray.length() > 0) {
                            HashSet hashSet = new HashSet();
                            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                String string = jSONArray.getString(i10);
                                if (string.contains(".")) {
                                    string = string.split("\\.")[0];
                                }
                                hashSet.add(string);
                            }
                            initNewBuilder.availableKeys(hashSet);
                        }
                    } else {
                        Object obj = jSONObject.get(next);
                        if ((obj instanceof JSONObject) && jSONObject.has("__selectedKeys")) {
                            JSONArray jSONArray2 = jSONObject.getJSONArray("__selectedKeys");
                            JSONArray jSONArray3 = new JSONArray();
                            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                                String string2 = jSONArray2.getString(i11);
                                if (string2.startsWith(next + ".")) {
                                    jSONArray3.put(string2.substring(next.length() + 1));
                                }
                            }
                            if (jSONArray3.length() > 0) {
                                ((JSONObject) obj).put("__selectedKeys", jSONArray3);
                            }
                        }
                        initNewBuilder.put(next, parseDecoder.decode(obj));
                    }
                }
            }
            return initNewBuilder.build();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void mergeREST(State state, JSONObject jSONObject, ParseDecoder parseDecoder) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.mutex) {
            try {
                try {
                    boolean z10 = jSONObject.getBoolean("__complete");
                    this.isDeletingEventually = ParseJSONUtils.getInt(jSONObject, Arrays.asList("__isDeletingEventually", "isDeletingEventually"));
                    JSONArray jSONArray = jSONObject.getJSONArray("__operations");
                    ParseOperationSet parseOperationSetCurrentOperations = currentOperations();
                    this.operationSetQueue.clear();
                    ParseOperationSet parseOperationSet = null;
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        ParseOperationSet parseOperationSetFromRest = ParseOperationSet.fromRest(jSONArray.getJSONObject(i10), parseDecoder);
                        if (parseOperationSetFromRest.isSaveEventually()) {
                            if (parseOperationSet != null) {
                                this.operationSetQueue.add(parseOperationSet);
                                parseOperationSet = null;
                            }
                            arrayList.add(parseOperationSetFromRest);
                            this.operationSetQueue.add(parseOperationSetFromRest);
                        } else {
                            if (parseOperationSet != null) {
                                parseOperationSetFromRest.mergeFrom(parseOperationSet);
                            }
                            parseOperationSet = parseOperationSetFromRest;
                        }
                    }
                    if (parseOperationSet != null) {
                        this.operationSetQueue.add(parseOperationSet);
                    }
                    currentOperations().mergeFrom(parseOperationSetCurrentOperations);
                    if (state.updatedAt() >= 0) {
                        if (jSONObject.has("updatedAt")) {
                            if (new Date(state.updatedAt()).compareTo(ParseDateFormat.getInstance().parse(jSONObject.getString("updatedAt"))) < 0) {
                            }
                        }
                    }
                    setState(mergeFromServer(state, ParseJSONUtils.create(jSONObject, Arrays.asList("__complete", "__isDeletingEventually", "isDeletingEventually", "__operations")), parseDecoder, z10));
                } catch (JSONException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            enqueueSaveEventuallyOperationAsync((ParseOperationSet) it.next());
        }
    }

    public boolean needsDefaultACL() {
        return true;
    }

    public State.Init<?> newStateBuilder(String str) {
        return new State.Builder(str);
    }

    public void performOperation(String str, ParseFieldOperation parseFieldOperation) {
        synchronized (this.mutex) {
            try {
                Object objApply = parseFieldOperation.apply(this.estimatedData.get(str), str);
                if (objApply != null) {
                    this.estimatedData.put(str, objApply);
                } else {
                    this.estimatedData.remove(str);
                }
                currentOperations().put(str, parseFieldOperation.mergeWithPrevious(currentOperations().get(str)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void performPut(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("key may not be null.");
        }
        if (obj == null) {
            throw new IllegalArgumentException("value may not be null.");
        }
        if (obj instanceof JSONObject) {
            obj = ParseDecoder.get().convertJSONObjectToMap((JSONObject) obj);
        } else if (obj instanceof JSONArray) {
            obj = ParseDecoder.get().convertJSONArrayToList((JSONArray) obj);
        }
        if (ParseEncoder.isValidType(obj)) {
            performOperation(str, new ParseSetOperation(obj));
        } else {
            throw new IllegalArgumentException("invalid type for value: " + obj.getClass().toString());
        }
    }

    public void performRemove(String str) {
        synchronized (this.mutex) {
            try {
                if (get(str) != null) {
                    performOperation(str, ParseDeleteOperation.getInstance());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task<Void> pinInBackground(String str) {
        return pinAllInBackground(str, Collections.singletonList(this));
    }

    public void put(String str, Object obj) {
        checkKeyIsMutable(str);
        performPut(str, obj);
    }

    public void registerSaveListener(GetCallback<ParseObject> getCallback) {
        synchronized (this.mutex) {
            this.saveEvent.subscribe(getCallback);
        }
    }

    public void remove(String str) {
        checkKeyIsMutable(str);
        performRemove(str);
    }

    public void revert(String str) {
        synchronized (this.mutex) {
            try {
                if (isDirty(str)) {
                    currentOperations().remove(str);
                    rebuildEstimatedData();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void save() throws ParseException {
        ParseTaskUtils.wait(saveInBackground());
    }

    public Task<Void> saveAsync(final String str) {
        return this.taskQueue.enqueue(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.30
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                return ParseObject.this.saveAsync(str, task);
            }
        });
    }

    public final void saveEventually(SaveCallback saveCallback) {
        ParseTaskUtils.callbackOnMainThreadAsync(saveEventually(), saveCallback);
    }

    public final Task<Void> saveInBackground() {
        return ParseUser.getCurrentUserAsync().onSuccessTask(new Continuation<ParseUser, Task<String>>() { // from class: com.parse.ParseObject.29
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<String> then(Task<ParseUser> task) {
                ParseUser result = task.getResult();
                if (result == null) {
                    return Task.forResult(null);
                }
                if (!result.isLazy()) {
                    return Task.forResult(result.getSessionToken());
                }
                if (!ParseObject.this.isDataAvailable("ACL")) {
                    return Task.forResult(null);
                }
                final ParseACL acl = ParseObject.this.getACL(false);
                if (acl == null) {
                    return Task.forResult(null);
                }
                final ParseUser unresolvedUser = acl.getUnresolvedUser();
                return (unresolvedUser == null || !unresolvedUser.isCurrentUser()) ? Task.forResult(null) : unresolvedUser.saveAsync(null).onSuccess(new Continuation<Void, String>() { // from class: com.parse.ParseObject.29.1
                    @Override // com.parse.boltsinternal.Continuation
                    public String then(Task<Void> task2) {
                        if (acl.hasUnresolvedUser()) {
                            throw new IllegalStateException("ACL has an unresolved ParseUser. Save or sign up before attempting to serialize the ACL.");
                        }
                        return unresolvedUser.getSessionToken();
                    }
                });
            }
        }).onSuccessTask(new Continuation<String, Task<Void>>() { // from class: com.parse.ParseObject.28
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<String> task) {
                return ParseObject.this.saveAsync(task.getResult());
            }
        });
    }

    public void setACL(ParseACL parseACL) {
        put("ACL", parseACL);
    }

    public void setDefaultValues() {
        if (!needsDefaultACL() || ParseACL.getDefaultACL() == null) {
            return;
        }
        setACL(ParseACL.getDefaultACL());
    }

    public void setObjectId(String str) {
        synchronized (this.mutex) {
            try {
                String strObjectId = this.state.objectId();
                if (ParseTextUtils.equals(strObjectId, str)) {
                    return;
                }
                this.state = this.state.newBuilder().objectId(str).build();
                notifyObjectIdChanged(strObjectId, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setState(State state) {
        synchronized (this.mutex) {
            setState(state, true);
        }
    }

    public ParseOperationSet startSave() {
        ParseOperationSet parseOperationSetCurrentOperations;
        synchronized (this.mutex) {
            parseOperationSetCurrentOperations = currentOperations();
            this.operationSetQueue.addLast(new ParseOperationSet());
        }
        return parseOperationSetCurrentOperations;
    }

    public <T extends State> JSONObject toJSONObjectForSaving(T t8, ParseOperationSet parseOperationSet, ParseEncoder parseEncoder) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : parseOperationSet.keySet()) {
                jSONObject.put(str, parseEncoder.encode((ParseFieldOperation) parseOperationSet.get(str)));
            }
            if (t8.objectId() != null) {
                jSONObject.put("objectId", t8.objectId());
            }
            return jSONObject;
        } catch (JSONException unused) {
            throw new RuntimeException("could not serialize object to JSON");
        }
    }

    public JSONObject toRest(ParseEncoder parseEncoder) {
        State state;
        ArrayList arrayList;
        synchronized (this.mutex) {
            try {
                state = getState();
                int size = this.operationSetQueue.size();
                arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(new ParseOperationSet(this.operationSetQueue.get(i10)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return toRest(state, arrayList, parseEncoder);
    }

    public Task<Void> unpinInBackground(String str) {
        return unpinAllInBackground(str, Collections.singletonList(this));
    }

    public void unregisterSaveListener(GetCallback<ParseObject> getCallback) {
        synchronized (this.mutex) {
            this.saveEvent.unsubscribe(getCallback);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        writeToParcel(parcel, new ParseObjectParcelEncoder(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ParseObject(String str) {
        this.mutex = new Object();
        this.taskQueue = new TaskQueue();
        this.saveEvent = new ParseMulticastDelegate<>();
        String str2 = isCreatingPointerForObjectId.get();
        if (str == null) {
            throw new IllegalArgumentException("You must specify a Parse class name when creating a new ParseObject.");
        }
        str = "_Automatic".equals(str) ? getSubclassingController().getClassName(getClass()) : str;
        if (!getSubclassingController().isSubclassValid(str, getClass())) {
            throw new IllegalArgumentException("You must create this type of ParseObject using ParseObject.create() or the proper subclass.");
        }
        LinkedList<ParseOperationSet> linkedList = new LinkedList<>();
        this.operationSetQueue = linkedList;
        linkedList.add(new ParseOperationSet());
        this.estimatedData = new HashMap();
        State.Init<?> initNewStateBuilder = newStateBuilder(str);
        if (str2 == null) {
            setDefaultValues();
            initNewStateBuilder.isComplete(true);
        } else {
            if (!str2.equals("*** Offline Object ***")) {
                initNewStateBuilder.objectId(str2);
            }
            initNewStateBuilder.isComplete(false);
        }
        this.state = initNewStateBuilder.build();
        OfflineStore localDatastore = Parse.getLocalDatastore();
        if (localDatastore != null) {
            localDatastore.registerNewObject(this);
        }
    }

    public static <T extends ParseObject> T create(Class<T> cls) {
        return (T) create(getSubclassingController().getClassName(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ParseACL getACL(boolean z10) {
        synchronized (this.mutex) {
            try {
                checkGetAccess("ACL");
                Object obj = this.estimatedData.get("ACL");
                if (obj == null) {
                    return null;
                }
                if (!(obj instanceof ParseACL)) {
                    throw new RuntimeException("only ACLs can be stored in the ACL key");
                }
                if (!z10 || !((ParseACL) obj).isShared()) {
                    return (ParseACL) obj;
                }
                ParseACL parseACL = new ParseACL((ParseACL) obj);
                this.estimatedData.put("ACL", parseACL);
                return parseACL;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static <T extends ParseObject> Task<Void> pinAllInBackground(final String str, final List<T> list, final boolean z10) {
        if (!Parse.isLocalDatastoreEnabled()) {
            throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
        }
        Task taskForResult = Task.forResult(null);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            taskForResult = taskForResult.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.19
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task) {
                    if (!ParseObject.this.isDataAvailable("ACL")) {
                        return Task.forResult(null);
                    }
                    ParseACL acl = ParseObject.this.getACL(false);
                    if (acl == null) {
                        return Task.forResult(null);
                    }
                    ParseUser unresolvedUser = acl.getUnresolvedUser();
                    return (unresolvedUser == null || !unresolvedUser.isCurrentUser()) ? Task.forResult(null) : ParseUser.pinCurrentUserIfNeededAsync(unresolvedUser);
                }
            });
        }
        return taskForResult.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.21
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                OfflineStore localDatastore = Parse.getLocalDatastore();
                String str2 = str;
                if (str2 == null) {
                    str2 = "_default";
                }
                return localDatastore.pinAllObjectsAsync(str2, list, z10);
            }
        }).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.20
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                if ("_currentUser".equals(str)) {
                    return task;
                }
                for (ParseObject parseObject : list) {
                    if (parseObject instanceof ParseUser) {
                        ParseUser parseUser = (ParseUser) parseObject;
                        if (parseUser.isCurrentUser()) {
                            return ParseUser.pinCurrentUserIfNeededAsync(parseUser);
                        }
                    }
                }
                return task;
            }
        });
    }

    public final void deleteInBackground(DeleteCallback deleteCallback) {
        ParseTaskUtils.callbackOnMainThreadAsync(deleteInBackground(), deleteCallback);
    }

    public void increment(String str, Number number) {
        performOperation(str, new ParseIncrementOperation(number));
    }

    public boolean isDirty(boolean z10) {
        boolean z11;
        synchronized (this.mutex) {
            try {
                z11 = this.isDeleted || getObjectId() == null || hasChanges() || (z10 && hasDirtyChildren());
            } catch (Throwable th) {
                throw th;
            }
        }
        return z11;
    }

    public Task<Void> pinInBackground(String str, boolean z10) {
        return pinAllInBackground(str, Collections.singletonList(this), z10);
    }

    public Task<Void> saveAsync(final String str, Task<Void> task) {
        final ParseOperationSet parseOperationSetStartSave;
        Task<Void> taskDeepSaveAsync;
        if (!isDirty()) {
            return Task.forResult(null);
        }
        synchronized (this.mutex) {
            updateBeforeSave();
            validateSave();
            parseOperationSetStartSave = startSave();
        }
        synchronized (this.mutex) {
            taskDeepSaveAsync = deepSaveAsync(this.estimatedData, str);
        }
        return taskDeepSaveAsync.onSuccessTask(TaskQueue.waitFor(task)).onSuccessTask(new Continuation<Void, Task<State>>() { // from class: com.parse.ParseObject.32
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<State> then(Task<Void> task2) {
                return ParseObject.getObjectController().saveAsync(ParseObject.this.getState(), parseOperationSetStartSave, str, new KnownParseObjectDecoder(ParseObject.this.collectFetchedObjects()));
            }
        }).continueWithTask(new Continuation<State, Task<Void>>() { // from class: com.parse.ParseObject.31
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(final Task<State> task2) {
                return ParseObject.this.handleSaveResultAsync(task2.getResult(), parseOperationSetStartSave).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.31.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<Void> task3) {
                        return (task3.isFaulted() || task3.isCancelled()) ? task3 : task2.makeVoid();
                    }
                });
            }
        });
    }

    public final Task<Void> saveEventually() {
        final ParseOperationSet parseOperationSetStartSave;
        ParseRESTObjectCommand parseRESTObjectCommandCurrentSaveEventuallyCommand;
        if (!isDirty()) {
            Parse.getEventuallyQueue().fakeObjectUpdate();
            return Task.forResult(null);
        }
        synchronized (this.mutex) {
            try {
                updateBeforeSave();
                try {
                    validateSaveEventually();
                    ArrayList arrayList = new ArrayList();
                    collectDirtyChildren(this.estimatedData, arrayList, null);
                    String orCreateLocalId = getObjectId() == null ? getOrCreateLocalId() : null;
                    parseOperationSetStartSave = startSave();
                    parseOperationSetStartSave.setIsSaveEventually(true);
                    parseRESTObjectCommandCurrentSaveEventuallyCommand = currentSaveEventuallyCommand(parseOperationSetStartSave, PointerOrLocalIdEncoder.get(), ParseUser.getCurrentSessionToken());
                    parseRESTObjectCommandCurrentSaveEventuallyCommand.setLocalId(orCreateLocalId);
                    parseRESTObjectCommandCurrentSaveEventuallyCommand.setOperationSetUUID(parseOperationSetStartSave.getUUID());
                    parseRESTObjectCommandCurrentSaveEventuallyCommand.retainLocalIds();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ParseObject) it.next()).saveEventually();
                    }
                } catch (ParseException e10) {
                    return Task.forError(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Task<JSONObject> taskEnqueueEventuallyAsync = Parse.getEventuallyQueue().enqueueEventuallyAsync(parseRESTObjectCommandCurrentSaveEventuallyCommand, this);
        enqueueSaveEventuallyOperationAsync(parseOperationSetStartSave);
        parseRESTObjectCommandCurrentSaveEventuallyCommand.releaseLocalIds();
        return Parse.isLocalDatastoreEnabled() ? taskEnqueueEventuallyAsync.makeVoid() : taskEnqueueEventuallyAsync.onSuccessTask(new Continuation<JSONObject, Task<Void>>() { // from class: com.parse.ParseObject.33
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<JSONObject> task) {
                return ParseObject.this.handleSaveEventuallyResultAsync(task.getResult(), parseOperationSetStartSave);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeToParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        ParseOperationSet last;
        synchronized (this.mutex) {
            try {
                this.ldsEnabledWhenParceling = Parse.isLocalDatastoreEnabled();
                boolean zHasOutstandingOperations = hasOutstandingOperations();
                byte b10 = 1;
                Object[] objArr = this.isDeleting || this.isDeletingEventually > 0;
                if (zHasOutstandingOperations) {
                    PLog.w("ParseObject", "About to parcel a ParseObject while a save / saveEventually operation is going on. If recovered from LDS, the unparceled object will be internally updated when these tasks end. If not, it will act as if these tasks have failed. This means that the subsequent call to save() will update again the same keys, and this is dangerous for certain operations, like increment(). To avoid inconsistencies, wait for operations to end before parceling.");
                }
                if (objArr != false) {
                    PLog.w("ParseObject", "About to parcel a ParseObject while a delete / deleteEventually operation is going on. If recovered from LDS, the unparceled object will be internally updated when these tasks end. If not, it will assume it's not deleted, and might incorrectly return false for isDirty(). To avoid inconsistencies, wait for operations to end before parceling.");
                }
                parcel.writeString(getClassName());
                String objectId = getObjectId();
                parcel.writeByte(objectId != null ? (byte) 1 : (byte) 0);
                if (objectId != null) {
                    parcel.writeString(objectId);
                }
                this.state.writeToParcel(parcel, parseParcelEncoder);
                if (this.localId == null) {
                    b10 = 0;
                }
                parcel.writeByte(b10);
                String str = this.localId;
                if (str != null) {
                    parcel.writeString(str);
                }
                parcel.writeByte(this.isDeleted ? (byte) 1 : (byte) 0);
                if (hasOutstandingOperations()) {
                    last = new ParseOperationSet();
                    Iterator<ParseOperationSet> it = this.operationSetQueue.iterator();
                    while (it.hasNext()) {
                        ParseOperationSet parseOperationSet = new ParseOperationSet(it.next());
                        parseOperationSet.mergeFrom(last);
                        last = parseOperationSet;
                    }
                } else {
                    last = this.operationSetQueue.getLast();
                }
                last.setIsSaveEventually(false);
                last.toParcel(parcel, parseParcelEncoder);
                Bundle bundle = new Bundle();
                onSaveInstanceState(bundle);
                parcel.writeBundle(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void collectDirtyChildren(Object obj, Collection<ParseObject> collection, Collection<ParseFile> collection2) {
        collectDirtyChildren(obj, collection, collection2, new HashSet(), new HashSet());
    }

    public final void saveInBackground(SaveCallback saveCallback) {
        ParseTaskUtils.callbackOnMainThreadAsync(saveInBackground(), saveCallback);
    }

    private void setState(State state, boolean z10) {
        synchronized (this.mutex) {
            try {
                String strObjectId = this.state.objectId();
                String strObjectId2 = state.objectId();
                this.state = state;
                if (z10 && !ParseTextUtils.equals(strObjectId, strObjectId2)) {
                    notifyObjectIdChanged(strObjectId, strObjectId2);
                }
                rebuildEstimatedData();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isDataAvailable(String str) {
        boolean z10;
        synchronized (this.mutex) {
            try {
                z10 = isDataAvailable() || this.state.availableKeys().contains(str) || this.estimatedData.containsKey(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public static Task<Void> unpinAllInBackground(String str) {
        if (Parse.isLocalDatastoreEnabled()) {
            if (str == null) {
                str = "_default";
            }
            return Parse.getLocalDatastore().unpinAllObjectsAsync(str);
        }
        throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
    }

    public Task<Void> deleteAsync(String str) {
        return getObjectController().deleteAsync(getState(), str);
    }

    public boolean isDirty(String str) {
        boolean zContainsKey;
        synchronized (this.mutex) {
            zContainsKey = currentOperations().containsKey(str);
        }
        return zContainsKey;
    }

    public static <T extends ParseObject> T fromJSON(JSONObject jSONObject, String str, ParseDecoder parseDecoder) {
        String strOptString = jSONObject.optString("className", str);
        if (strOptString == null) {
            return null;
        }
        String strOptString2 = jSONObject.optString("objectId", null);
        boolean z10 = !jSONObject.has("__selectedKeys");
        T t8 = (T) createWithoutData(strOptString, strOptString2);
        t8.setState(t8.mergeFromServer(t8.getState(), jSONObject, parseDecoder, z10));
        return t8;
    }

    public void revert() {
        synchronized (this.mutex) {
            try {
                if (isDirty()) {
                    currentOperations().clear();
                    rebuildEstimatedData();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task<Void> handleSaveResultAsync(final State state, final ParseOperationSet parseOperationSet) {
        Task<Void> taskForResult = Task.forResult(null);
        final OfflineStore localDatastore = Parse.getLocalDatastore();
        if (localDatastore != null) {
            taskForResult = taskForResult.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.23
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task) {
                    return localDatastore.fetchLocallyAsync(ParseObject.this).makeVoid();
                }
            });
        }
        boolean z10 = state != null;
        synchronized (this.mutex) {
            try {
                LinkedList<ParseOperationSet> linkedList = this.operationSetQueue;
                ListIterator<ParseOperationSet> listIterator = linkedList.listIterator(linkedList.indexOf(parseOperationSet));
                listIterator.next();
                listIterator.remove();
                if (!z10) {
                    listIterator.next().mergeFrom(parseOperationSet);
                    if (localDatastore != null) {
                        taskForResult = taskForResult.continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.24
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.parse.boltsinternal.Continuation
                            public Task<Void> then(Task<Void> task) {
                                return task.isFaulted() ? Task.forResult(null) : localDatastore.updateDataForObjectAsync(ParseObject.this);
                            }
                        });
                    }
                    return taskForResult;
                }
                Task taskContinueWith = taskForResult.continueWith(new Continuation<Void, Void>() { // from class: com.parse.ParseObject.25
                    @Override // com.parse.boltsinternal.Continuation
                    public Void then(Task<Void> task) {
                        synchronized (ParseObject.this.mutex) {
                            try {
                                ParseObject.this.setState(state.isComplete() ? state : ParseObject.this.getState().newBuilder().apply(parseOperationSet).apply(state).build());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return null;
                    }
                });
                if (localDatastore != null) {
                    taskContinueWith = taskContinueWith.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseObject.26
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<Void> then(Task<Void> task) {
                            return localDatastore.updateDataForObjectAsync(ParseObject.this);
                        }
                    });
                }
                return taskContinueWith.onSuccess(new Continuation<Void, Void>() { // from class: com.parse.ParseObject.27
                    @Override // com.parse.boltsinternal.Continuation
                    public Void then(Task<Void> task) {
                        ParseObject.this.saveEvent.invoke(ParseObject.this, null);
                        return null;
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public JSONObject toRest(State state, List<ParseOperationSet> list, ParseEncoder parseEncoder) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("className", state.className());
            if (state.objectId() != null) {
                jSONObject.put("objectId", state.objectId());
            }
            if (state.createdAt() > 0) {
                jSONObject.put("createdAt", ParseDateFormat.getInstance().format(new Date(state.createdAt())));
            }
            if (state.updatedAt() > 0) {
                jSONObject.put("updatedAt", ParseDateFormat.getInstance().format(new Date(state.updatedAt())));
            }
            for (String str : state.keySet()) {
                jSONObject.put(str, parseEncoder.encode(state.get(str)));
            }
            jSONObject.put("__complete", state.isComplete());
            jSONObject.put("__isDeletingEventually", this.isDeletingEventually);
            jSONObject.put("__selectedKeys", new JSONArray((Collection) state.availableKeys()));
            JSONArray jSONArray = new JSONArray();
            Iterator<ParseOperationSet> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toRest(parseEncoder));
            }
            jSONObject.put("__operations", jSONArray);
            return jSONObject;
        } catch (JSONException unused) {
            throw new RuntimeException("could not serialize object to JSON");
        }
    }

    public void updateBeforeSave() {
    }

    public void validateDelete() {
    }

    public void validateSave() {
    }

    public void validateSaveEventually() throws ParseException {
    }

    public Task<JSONObject> saveAsync(ParseHttpClient parseHttpClient, ParseOperationSet parseOperationSet, String str) {
        return currentSaveEventuallyCommand(parseOperationSet, PointerEncoder.get(), str).executeAsync(parseHttpClient);
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }
}
