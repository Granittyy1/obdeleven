package com.parse;

import android.os.Bundle;
import android.os.Parcel;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("_User")
public class ParseUser extends ParseObject {
    private static boolean autoUserEnabled;
    private boolean isCurrentUser = false;
    private static final List<String> READ_ONLY_KEYS = Collections.unmodifiableList(Arrays.asList("sessionToken", "authData"));
    private static final Object isAutoUserEnabledMutex = new Object();

    /* JADX INFO: renamed from: com.parse.ParseUser$13, reason: invalid class name */
    public class AnonymousClass13 implements Continuation<Void, Task<Void>> {
        final /* synthetic */ ParseOperationSet val$operations;
        final /* synthetic */ String val$sessionToken;

        public AnonymousClass13(ParseOperationSet parseOperationSet, String str) {
            this.val$operations = parseOperationSet;
            this.val$sessionToken = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.parse.boltsinternal.Continuation
        public Task<Void> then(Task<Void> task) {
            return ParseUser.getUserController().signUpAsync(ParseUser.this.getState(), this.val$operations, this.val$sessionToken).continueWithTask(new Continuation<State, Task<Void>>() { // from class: com.parse.ParseUser.13.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(final Task<State> task2) {
                    State result = task2.getResult();
                    AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                    return ParseUser.this.handleSaveResultAsync(result, anonymousClass13.val$operations).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseUser.13.1.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<Void> then(Task<Void> task3) {
                            return (task2.isCancelled() || task2.isFaulted()) ? task2.makeVoid() : ParseUser.saveCurrentUserAsync(ParseUser.this);
                        }
                    });
                }
            });
        }
    }

    public static class State extends ParseObject.State {
        private final boolean isNew;

        public static class Builder extends ParseObject.State.Init<Builder> {
            private boolean isNew;

            public Builder() {
                super("_User");
            }

            public Builder authData(Map<String, Map<String, String>> map) {
                return put("authData", map);
            }

            public Builder isNew(boolean z10) {
                this.isNew = z10;
                return this;
            }

            public Builder putAuthData(String str, Map<String, String> map) {
                Map map2 = (Map) this.serverData.get("authData");
                if (map2 == null) {
                    map2 = new HashMap();
                }
                map2.put(str, map);
                this.serverData.put("authData", map2);
                return this;
            }

            @Override // com.parse.ParseObject.State.Init
            public Builder self() {
                return this;
            }

            public Builder sessionToken(String str) {
                return put("sessionToken", str);
            }

            public Builder(State state) {
                super(state);
                this.isNew = state.isNew();
            }

            @Override // com.parse.ParseObject.State.Init
            public Builder apply(ParseObject.State state) {
                isNew(((State) state).isNew());
                return (Builder) super.apply(state);
            }

            @Override // com.parse.ParseObject.State.Init
            public State build() {
                return new State(this);
            }
        }

        public Map<String, Map<String, String>> authData() {
            Map<String, Map<String, String>> map = (Map) get("authData");
            return map == null ? new HashMap() : map;
        }

        public boolean isNew() {
            return this.isNew;
        }

        public String sessionToken() {
            return (String) get("sessionToken");
        }

        @Override // com.parse.ParseObject.State
        public void writeToParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
            super.writeToParcel(parcel, parseParcelEncoder);
            parcel.writeByte(this.isNew ? (byte) 1 : (byte) 0);
        }

        private State(Builder builder) {
            super(builder);
            this.isNew = builder.isNew;
        }

        @Override // com.parse.ParseObject.State
        public Builder newBuilder() {
            return new Builder(this);
        }

        public State(Parcel parcel, String str, ParseParcelDecoder parseParcelDecoder) {
            super(parcel, str, parseParcelDecoder);
            this.isNew = parcel.readByte() == 1;
        }
    }

    public static ParseUser become(String str) throws ParseException {
        return (ParseUser) ParseTaskUtils.wait(becomeInBackground(str));
    }

    public static Task<ParseUser> becomeInBackground(String str) {
        if (str != null) {
            return getUserController().getUserAsync(str).onSuccessTask(new Continuation<State, Task<ParseUser>>() { // from class: com.parse.ParseUser.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<ParseUser> then(Task<State> task) {
                    final ParseUser parseUser = (ParseUser) ParseObject.from(task.getResult());
                    return ParseUser.saveCurrentUserAsync(parseUser).onSuccess(new Continuation<Void, ParseUser>() { // from class: com.parse.ParseUser.2.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public ParseUser then(Task<Void> task2) {
                            return parseUser;
                        }
                    });
                }
            });
        }
        throw new IllegalArgumentException("Must specify a sessionToken for the user to log in with");
    }

    public static ParseAuthenticationManager getAuthenticationManager() {
        return ParseCorePlugins.getInstance().getAuthenticationManager();
    }

    public static String getCurrentSessionToken() {
        ParseUser currentUser = getCurrentUser();
        if (currentUser != null) {
            return currentUser.getSessionToken();
        }
        return null;
    }

    public static Task<String> getCurrentSessionTokenAsync() {
        return getCurrentUserController().getCurrentSessionTokenAsync();
    }

    public static ParseUser getCurrentUser() {
        return getCurrentUser(isAutomaticUserEnabled());
    }

    public static Task<ParseUser> getCurrentUserAsync() {
        return getCurrentUserController().getAsync();
    }

    public static ParseCurrentUserController getCurrentUserController() {
        return ParseCorePlugins.getInstance().getCurrentUserController();
    }

    public static ParseUserController getUserController() {
        return ParseCorePlugins.getInstance().getUserController();
    }

    public static boolean isAutomaticUserEnabled() {
        boolean z10;
        synchronized (isAutoUserEnabledMutex) {
            z10 = autoUserEnabled;
        }
        return z10;
    }

    public static Task<ParseUser> logInInBackground(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Must specify a username for the user to log in with");
        }
        if (str2 != null) {
            return getUserController().logInAsync(str, str2).onSuccessTask(new Continuation<State, Task<ParseUser>>() { // from class: com.parse.ParseUser.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<ParseUser> then(Task<State> task) {
                    final ParseUser parseUser = (ParseUser) ParseObject.from(task.getResult());
                    return ParseUser.saveCurrentUserAsync(parseUser).onSuccess(new Continuation<Void, ParseUser>() { // from class: com.parse.ParseUser.1.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public ParseUser then(Task<Void> task2) {
                            return parseUser;
                        }
                    });
                }
            });
        }
        throw new IllegalArgumentException("Must specify a password for the user to log in with");
    }

    public static void logOut() {
        try {
            ParseTaskUtils.wait(logOutInBackground());
        } catch (ParseException unused) {
        }
    }

    public static Task<Void> logOutInBackground() {
        return getCurrentUserController().logOutAsync();
    }

    public static Task<Void> pinCurrentUserIfNeededAsync(ParseUser parseUser) {
        if (Parse.isLocalDatastoreEnabled()) {
            return getCurrentUserController().setIfNeededAsync(parseUser);
        }
        throw new IllegalStateException("Method requires Local Datastore. Please refer to `Parse#enableLocalDatastore(Context)`.");
    }

    private void removeAuthData(String str) {
        synchronized (this.mutex) {
            Map<String, Map<String, String>> authData = getAuthData();
            authData.remove(str);
            performPut("authData", authData);
        }
    }

    public static Task<Void> requestPasswordResetInBackground(String str) {
        return getUserController().requestPasswordResetAsync(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restoreAnonymity(Map<String, String> map) {
        synchronized (this.mutex) {
            if (map != null) {
                try {
                    putAuthData("anonymous", map);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Task<Void> saveCurrentUserAsync(ParseUser parseUser) {
        return getCurrentUserController().setAsync(parseUser);
    }

    private void stripAnonymity() {
        synchronized (this.mutex) {
            try {
                if (ParseAnonymousUtils.isLinked(this)) {
                    if (getObjectId() != null) {
                        putAuthData("anonymous", null);
                    } else {
                        removeAuthData("anonymous");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task<Void> cleanUpAuthDataAsync() {
        ParseAuthenticationManager authenticationManager = getAuthenticationManager();
        synchronized (this.mutex) {
            try {
                Map<String, Map<String, String>> mapAuthData = getState().authData();
                if (mapAuthData.size() == 0) {
                    return Task.forResult(null);
                }
                ArrayList arrayList = new ArrayList();
                Iterator<Map.Entry<String, Map<String, String>>> it = mapAuthData.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Map<String, String>> next = it.next();
                    if (next.getValue() == null) {
                        it.remove();
                        arrayList.add(authenticationManager.restoreAuthenticationAsync(next.getKey(), null).makeVoid());
                    }
                }
                setState(getState().newBuilder().authData(mapAuthData).build());
                return Task.whenAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseObject
    public ParseUser fetch() throws ParseException {
        return (ParseUser) super.fetch();
    }

    @Override // com.parse.ParseObject
    public <T extends ParseObject> Task<T> fetchAsync(String str, Task<Void> task) {
        if (isLazy()) {
            return Task.forResult(this);
        }
        Task<T> taskFetchAsync = super.fetchAsync(str, task);
        return isCurrentUser() ? taskFetchAsync.onSuccessTask(new Continuation<T, Task<Void>>() { // from class: com.parse.ParseUser.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<T> task2) {
                return ParseUser.this.cleanUpAuthDataAsync();
            }
        }).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseUser.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task2) {
                return ParseUser.saveCurrentUserAsync(ParseUser.this);
            }
        }).onSuccess(new Continuation<Void, T>() { // from class: com.parse.ParseUser.8
            /* JADX WARN: Incorrect return type in method signature: (Lcom/parse/boltsinternal/Task<Ljava/lang/Void;>;)TT; */
            @Override // com.parse.boltsinternal.Continuation
            public ParseObject then(Task<Void> task2) {
                return ParseUser.this;
            }
        }) : taskFetchAsync;
    }

    @Override // com.parse.ParseObject
    public <T extends ParseObject> Task<T> fetchFromLocalDatastoreAsync() {
        return isLazy() ? Task.forResult(this) : super.fetchFromLocalDatastoreAsync();
    }

    public Map<String, Map<String, String>> getAuthData() {
        Map<String, Map<String, String>> map;
        synchronized (this.mutex) {
            try {
                map = getMap("authData");
                if (map == null) {
                    map = new HashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }

    public String getEmail() {
        return getString("email");
    }

    public String getPassword() {
        return getString("password");
    }

    public String getSessionToken() {
        return getState().sessionToken();
    }

    public String getUsername() {
        return getString("username");
    }

    @Override // com.parse.ParseObject
    public Task<Void> handleSaveResultAsync(ParseObject.State state, ParseOperationSet parseOperationSet) {
        if (state != null) {
            parseOperationSet.remove("password");
        }
        return super.handleSaveResultAsync(state, parseOperationSet);
    }

    public boolean isAuthenticated() {
        boolean z10;
        synchronized (this.mutex) {
            try {
                ParseUser currentUser = getCurrentUser();
                z10 = isLazy() || !(getState().sessionToken() == null || currentUser == null || !getObjectId().equals(currentUser.getObjectId()));
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public boolean isCurrentUser() {
        boolean z10;
        synchronized (this.mutex) {
            z10 = this.isCurrentUser;
        }
        return z10;
    }

    @Override // com.parse.ParseObject
    public boolean isKeyMutable(String str) {
        return !READ_ONLY_KEYS.contains(str);
    }

    public boolean isLazy() {
        boolean z10;
        synchronized (this.mutex) {
            try {
                z10 = getObjectId() == null && ParseAnonymousUtils.isLinked(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public boolean isLinked(String str) {
        Map<String, Map<String, String>> authData = getAuthData();
        return authData.containsKey(str) && authData.get(str) != null;
    }

    public Task<Void> logOutAsync() {
        return logOutAsync(true);
    }

    @Override // com.parse.ParseObject
    public boolean needsDefaultACL() {
        return false;
    }

    @Override // com.parse.ParseObject
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        setIsCurrentUser(bundle.getBoolean("_isCurrentUser", false));
    }

    @Override // com.parse.ParseObject
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        synchronized (this.mutex) {
            bundle.putBoolean("_isCurrentUser", this.isCurrentUser);
        }
    }

    @Override // com.parse.ParseObject
    public void put(String str, Object obj) {
        synchronized (this.mutex) {
            try {
                if ("username".equals(str)) {
                    stripAnonymity();
                }
                super.put(str, obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void putAuthData(String str, Map<String, String> map) {
        synchronized (this.mutex) {
            Map<String, Map<String, String>> authData = getAuthData();
            authData.put(str, map);
            performPut("authData", authData);
        }
    }

    public Task<Void> resolveLazinessAsync(Task<Void> task) {
        synchronized (this.mutex) {
            try {
                if (getAuthData().size() == 0) {
                    return signUpAsync(task);
                }
                final ParseOperationSet parseOperationSetStartSave = startSave();
                return task.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseUser.17
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<Void> task2) {
                        return ParseUser.getUserController().logInAsync(ParseUser.this.getState(), parseOperationSetStartSave).onSuccessTask(new Continuation<State, Task<Void>>() { // from class: com.parse.ParseUser.17.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.parse.boltsinternal.Continuation
                            public Task<Void> then(Task<State> task3) {
                                Task taskOnSuccess;
                                final State result = task3.getResult();
                                if (!Parse.isLocalDatastoreEnabled() || result.isNew()) {
                                    AnonymousClass17 anonymousClass17 = AnonymousClass17.this;
                                    taskOnSuccess = ParseUser.this.handleSaveResultAsync(result, parseOperationSetStartSave).onSuccess(new Continuation<Void, State>() { // from class: com.parse.ParseUser.17.1.1
                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // com.parse.boltsinternal.Continuation
                                        public State then(Task<Void> task4) {
                                            return result;
                                        }
                                    });
                                } else {
                                    taskOnSuccess = Task.forResult(result);
                                }
                                return taskOnSuccess.onSuccessTask(new Continuation<State, Task<Void>>() { // from class: com.parse.ParseUser.17.1.2
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // com.parse.boltsinternal.Continuation
                                    public Task<Void> then(Task<State> task4) {
                                        State result2 = task4.getResult();
                                        return !result2.isNew() ? ParseUser.saveCurrentUserAsync((ParseUser) ParseObject.from(result2)) : task4.makeVoid();
                                    }
                                });
                            }
                        });
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseObject
    public Task<Void> saveAsync(String str, Task<Void> task) {
        return saveAsync(str, isLazy(), task);
    }

    public void setEmail(String str) {
        put("email", str);
    }

    public void setIsCurrentUser(boolean z10) {
        synchronized (this.mutex) {
            this.isCurrentUser = z10;
        }
    }

    public void setPassword(String str) {
        put("password", str);
    }

    @Override // com.parse.ParseObject
    public void setState(ParseObject.State state) {
        if (isCurrentUser()) {
            State.Builder builder = (State.Builder) state.newBuilder();
            if (getSessionToken() != null && state.get("sessionToken") == null) {
                builder.put("sessionToken", getSessionToken());
            }
            if (getAuthData().size() > 0 && state.get("authData") == null) {
                builder.put("authData", getAuthData());
            }
            state = builder.build();
        }
        super.setState(state);
    }

    public void setUsername(String str) {
        put("username", str);
    }

    public Task<Void> signUpAsync(Task<Void> task) {
        String sessionToken;
        final ParseUser currentUser = getCurrentUser();
        synchronized (this.mutex) {
            if (currentUser != null) {
                try {
                    sessionToken = currentUser.getSessionToken();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                sessionToken = null;
            }
            if (ParseTextUtils.isEmpty(getUsername())) {
                return Task.forError(new IllegalArgumentException("Username cannot be missing or blank"));
            }
            if (ParseTextUtils.isEmpty(getPassword())) {
                return Task.forError(new IllegalArgumentException("Password cannot be missing or blank"));
            }
            if (getObjectId() != null) {
                Map<String, Map<String, String>> authData = getAuthData();
                if (authData.containsKey("anonymous") && authData.get("anonymous") == null) {
                    return saveAsync(sessionToken, task);
                }
                return Task.forError(new IllegalArgumentException("Cannot sign up a user that has already signed up."));
            }
            if (this.operationSetQueue.size() > 1) {
                return Task.forError(new IllegalArgumentException("Cannot sign up a user that is already signing up."));
            }
            if (currentUser == null || !ParseAnonymousUtils.isLinked(currentUser)) {
                return task.onSuccessTask(new AnonymousClass13(startSave(), sessionToken));
            }
            if (this == currentUser) {
                return Task.forError(new IllegalArgumentException("Attempt to merge currentUser with itself."));
            }
            boolean zIsLazy = currentUser.isLazy();
            final String username = currentUser.getUsername();
            final String password = currentUser.getPassword();
            final Map<String, String> authData2 = currentUser.getAuthData("anonymous");
            currentUser.copyChangesFrom(this);
            currentUser.setUsername(getUsername());
            currentUser.setPassword(getPassword());
            revert();
            return currentUser.saveAsync(sessionToken, zIsLazy, task).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseUser.12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task2) {
                    if (!task2.isCancelled() && !task2.isFaulted()) {
                        currentUser.revert("password");
                        ParseUser.this.revert("password");
                        ParseUser.this.mergeFromObject(currentUser);
                        return ParseUser.saveCurrentUserAsync(ParseUser.this);
                    }
                    synchronized (currentUser.mutex) {
                        try {
                            String str = username;
                            if (str != null) {
                                currentUser.setUsername(str);
                            } else {
                                currentUser.revert("username");
                            }
                            String str2 = password;
                            if (str2 != null) {
                                currentUser.setPassword(str2);
                            } else {
                                currentUser.revert("password");
                            }
                            currentUser.restoreAnonymity(authData2);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return task2;
                }
            });
        }
    }

    public Task<Void> signUpInBackground() {
        return this.taskQueue.enqueue(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseUser.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                return ParseUser.this.signUpAsync(task);
            }
        });
    }

    public Task<Void> synchronizeAllAuthDataAsync() {
        synchronized (this.mutex) {
            try {
                if (!isCurrentUser()) {
                    return Task.forResult(null);
                }
                Map<String, Map<String, String>> authData = getAuthData();
                ArrayList arrayList = new ArrayList(authData.size());
                Iterator<String> it = authData.keySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(synchronizeAuthDataAsync(it.next()));
                }
                return Task.whenAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task<Void> synchronizeAuthDataAsync(String str) {
        synchronized (this.mutex) {
            try {
                if (isCurrentUser()) {
                    return synchronizeAuthDataAsync(getAuthenticationManager(), str, getAuthData(str));
                }
                return Task.forResult(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseObject
    public JSONObject toRest(ParseObject.State state, List<ParseOperationSet> list, ParseEncoder parseEncoder) {
        List<ParseOperationSet> linkedList = list;
        for (int i10 = 0; i10 < list.size(); i10++) {
            ParseOperationSet parseOperationSet = list.get(i10);
            if (parseOperationSet.containsKey("password")) {
                if (linkedList == list) {
                    linkedList = new LinkedList<>(list);
                }
                ParseOperationSet parseOperationSet2 = new ParseOperationSet(parseOperationSet);
                parseOperationSet2.remove("password");
                linkedList.set(i10, parseOperationSet2);
            }
        }
        return super.toRest(state, linkedList, parseEncoder);
    }

    public Task<Void> unlinkFromInBackground(String str) {
        if (str == null) {
            return Task.forResult(null);
        }
        synchronized (this.mutex) {
            try {
                if (getAuthData().containsKey(str)) {
                    putAuthData(str, null);
                    return saveInBackground();
                }
                return Task.forResult(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseObject
    public void validateDelete() {
        synchronized (this.mutex) {
            try {
                super.validateDelete();
                if (!isAuthenticated() && isDirty()) {
                    throw new IllegalArgumentException("Cannot delete a ParseUser that is not authenticated.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseObject
    public void validateSave() {
        ParseUser currentUser;
        synchronized (this.mutex) {
            if (getObjectId() == null) {
                throw new IllegalArgumentException("Cannot save a ParseUser until it has been signed up. Call signUp first.");
            }
            if (!isAuthenticated() && isDirty() && !isCurrentUser()) {
                if (Parse.isLocalDatastoreEnabled() || (currentUser = getCurrentUser()) == null || !getObjectId().equals(currentUser.getObjectId())) {
                    throw new IllegalArgumentException("Cannot save a ParseUser that is not authenticated.");
                }
            }
        }
    }

    @Override // com.parse.ParseObject
    public void validateSaveEventually() throws ParseException {
        if (isDirty("password")) {
            throw new ParseException(-1, "Unable to saveEventually on a ParseUser with dirty password");
        }
    }

    private static ParseUser getCurrentUser(boolean z10) {
        try {
            return (ParseUser) ParseTaskUtils.wait(getCurrentUserController().getAsync(z10));
        } catch (ParseException unused) {
            return null;
        }
    }

    public static void logOutInBackground(LogOutCallback logOutCallback) {
        ParseTaskUtils.callbackOnMainThreadAsync(logOutInBackground(), logOutCallback);
    }

    public static void requestPasswordResetInBackground(String str, RequestPasswordResetCallback requestPasswordResetCallback) {
        ParseTaskUtils.callbackOnMainThreadAsync(requestPasswordResetInBackground(str), requestPasswordResetCallback);
    }

    @Override // com.parse.ParseObject
    public State getState() {
        return (State) super.getState();
    }

    public Task<Void> logOutAsync(boolean z10) {
        String strSessionToken;
        ParseAuthenticationManager authenticationManager = getAuthenticationManager();
        ArrayList arrayList = new ArrayList();
        synchronized (this.mutex) {
            try {
                strSessionToken = getState().sessionToken();
                Iterator<Map.Entry<String, Map<String, String>>> it = getAuthData().entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(authenticationManager.deauthenticateAsync(it.next().getKey()));
                }
                State stateBuild = getState().newBuilder().sessionToken(null).isNew(false).build();
                this.isCurrentUser = false;
                setState(stateBuild);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            arrayList.add(ParseSession.revokeAsync(strSessionToken));
        }
        return Task.whenAll(arrayList);
    }

    @Override // com.parse.ParseObject
    public State.Builder newStateBuilder(String str) {
        return new State.Builder();
    }

    public Task<Void> saveAsync(String str, boolean z10, Task<Void> task) {
        Task<Void> taskResolveLazinessAsync = z10 ? resolveLazinessAsync(task) : super.saveAsync(str, task);
        return isCurrentUser() ? taskResolveLazinessAsync.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseUser.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task2) {
                return ParseUser.this.cleanUpAuthDataAsync();
            }
        }).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseUser.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task2) {
                return ParseUser.saveCurrentUserAsync(ParseUser.this);
            }
        }) : taskResolveLazinessAsync;
    }

    public void signUpInBackground(SignUpCallback signUpCallback) {
        ParseTaskUtils.callbackOnMainThreadAsync(signUpInBackground(), signUpCallback);
    }

    public static void logInInBackground(String str, String str2, LogInCallback logInCallback) {
        ParseTaskUtils.callbackOnMainThreadAsync(logInInBackground(str, str2), logInCallback);
    }

    private Map<String, String> getAuthData(String str) {
        return getAuthData().get(str);
    }

    private Task<Void> synchronizeAuthDataAsync(ParseAuthenticationManager parseAuthenticationManager, final String str, Map<String, String> map) {
        return parseAuthenticationManager.restoreAuthenticationAsync(str, map).continueWithTask(new Continuation<Boolean, Task<Void>>() { // from class: com.parse.ParseUser.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Boolean> task) {
                return (task.isFaulted() || !task.getResult().booleanValue()) ? ParseUser.this.unlinkFromInBackground(str) : task.makeVoid();
            }
        });
    }
}
