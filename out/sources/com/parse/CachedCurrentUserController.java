package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class CachedCurrentUserController implements ParseCurrentUserController {
    ParseUser currentUser;
    private final ParseObjectStore<ParseUser> store;
    private final Object mutex = new Object();
    private final TaskQueue taskQueue = new TaskQueue();
    boolean currentUserMatchesDisk = false;

    /* JADX INFO: renamed from: com.parse.CachedCurrentUserController$1, reason: invalid class name */
    public class AnonymousClass1 implements Continuation<Void, Task<Void>> {
        final /* synthetic */ ParseUser val$user;

        public AnonymousClass1(ParseUser parseUser) {
            this.val$user = parseUser;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.parse.boltsinternal.Continuation
        public Task<Void> then(Task<Void> task) {
            return task.continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.CachedCurrentUserController.1.3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task2) {
                    AnonymousClass1 anonymousClass1;
                    ParseUser parseUser;
                    synchronized (CachedCurrentUserController.this.mutex) {
                        anonymousClass1 = AnonymousClass1.this;
                        parseUser = CachedCurrentUserController.this.currentUser;
                    }
                    return (parseUser == null || parseUser == anonymousClass1.val$user) ? task2 : parseUser.logOutAsync(false).continueWith(new Continuation<Void, Void>() { // from class: com.parse.CachedCurrentUserController.1.3.1
                        @Override // com.parse.boltsinternal.Continuation
                        public Void then(Task<Void> task3) {
                            return null;
                        }
                    });
                }
            }).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.CachedCurrentUserController.1.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task2) {
                    AnonymousClass1.this.val$user.setIsCurrentUser(true);
                    return AnonymousClass1.this.val$user.synchronizeAllAuthDataAsync();
                }
            }).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.CachedCurrentUserController.1.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task2) {
                    return CachedCurrentUserController.this.store.setAsync(AnonymousClass1.this.val$user).continueWith(new Continuation<Void, Void>() { // from class: com.parse.CachedCurrentUserController.1.1.1
                        @Override // com.parse.boltsinternal.Continuation
                        public Void then(Task<Void> task3) {
                            synchronized (CachedCurrentUserController.this.mutex) {
                                CachedCurrentUserController.this.currentUserMatchesDisk = !task3.isFaulted();
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                CachedCurrentUserController.this.currentUser = anonymousClass1.val$user;
                            }
                            return null;
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.parse.CachedCurrentUserController$4, reason: invalid class name */
    public class AnonymousClass4 implements Continuation<Void, Task<Void>> {
        public AnonymousClass4() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.parse.boltsinternal.Continuation
        public Task<Void> then(Task<Void> task) {
            final Task<ParseUser> async = CachedCurrentUserController.this.getAsync(false);
            return Task.whenAll(Arrays.asList(async, task)).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.CachedCurrentUserController.4.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task2) {
                    return Task.whenAll(Arrays.asList(async.onSuccessTask(new Continuation<ParseUser, Task<Void>>() { // from class: com.parse.CachedCurrentUserController.4.1.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<Void> then(Task<ParseUser> task3) {
                            ParseUser result = task3.getResult();
                            return result == null ? task3.cast() : result.logOutAsync();
                        }
                    }), CachedCurrentUserController.this.store.deleteAsync().continueWith(new Continuation<Void, Void>() { // from class: com.parse.CachedCurrentUserController.4.1.2
                        @Override // com.parse.boltsinternal.Continuation
                        public Void then(Task<Void> task3) {
                            boolean z10 = !task3.isFaulted();
                            synchronized (CachedCurrentUserController.this.mutex) {
                                CachedCurrentUserController cachedCurrentUserController = CachedCurrentUserController.this;
                                cachedCurrentUserController.currentUserMatchesDisk = z10;
                                cachedCurrentUserController.currentUser = null;
                            }
                            return null;
                        }
                    })));
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.parse.CachedCurrentUserController$5, reason: invalid class name */
    public class AnonymousClass5 implements Continuation<Void, Task<ParseUser>> {
        final /* synthetic */ boolean val$shouldAutoCreateUser;

        public AnonymousClass5(boolean z10) {
            this.val$shouldAutoCreateUser = z10;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.parse.boltsinternal.Continuation
        public Task<ParseUser> then(Task<Void> task) {
            return task.continueWithTask(new Continuation<Void, Task<ParseUser>>() { // from class: com.parse.CachedCurrentUserController.5.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<ParseUser> then(Task<Void> task2) {
                    AnonymousClass5 anonymousClass5;
                    CachedCurrentUserController cachedCurrentUserController;
                    ParseUser parseUser;
                    boolean z10;
                    synchronized (CachedCurrentUserController.this.mutex) {
                        anonymousClass5 = AnonymousClass5.this;
                        cachedCurrentUserController = CachedCurrentUserController.this;
                        parseUser = cachedCurrentUserController.currentUser;
                        z10 = cachedCurrentUserController.currentUserMatchesDisk;
                    }
                    if (parseUser != null) {
                        return Task.forResult(parseUser);
                    }
                    if (!z10) {
                        return cachedCurrentUserController.store.getAsync().continueWith(new Continuation<ParseUser, ParseUser>() { // from class: com.parse.CachedCurrentUserController.5.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.parse.boltsinternal.Continuation
                            public ParseUser then(Task<ParseUser> task3) {
                                AnonymousClass5 anonymousClass6;
                                CachedCurrentUserController cachedCurrentUserController2;
                                ParseUser result = task3.getResult();
                                boolean z11 = !task3.isFaulted();
                                synchronized (CachedCurrentUserController.this.mutex) {
                                    anonymousClass6 = AnonymousClass5.this;
                                    cachedCurrentUserController2 = CachedCurrentUserController.this;
                                    cachedCurrentUserController2.currentUser = result;
                                    cachedCurrentUserController2.currentUserMatchesDisk = z11;
                                }
                                if (result == null) {
                                    if (anonymousClass6.val$shouldAutoCreateUser) {
                                        return cachedCurrentUserController2.lazyLogIn();
                                    }
                                    return null;
                                }
                                synchronized (result.mutex) {
                                    result.setIsCurrentUser(true);
                                }
                                return result;
                            }
                        });
                    }
                    if (anonymousClass5.val$shouldAutoCreateUser) {
                        return Task.forResult(cachedCurrentUserController.lazyLogIn());
                    }
                    return null;
                }
            });
        }
    }

    public CachedCurrentUserController(ParseObjectStore<ParseUser> parseObjectStore) {
        this.store = parseObjectStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ParseUser lazyLogIn() {
        return lazyLogIn("anonymous", ParseAnonymousUtils.getAuthData());
    }

    @Override // com.parse.ParseObjectCurrentController
    public void clearFromMemory() {
        synchronized (this.mutex) {
            this.currentUser = null;
            this.currentUserMatchesDisk = false;
        }
    }

    @Override // com.parse.ParseObjectCurrentController
    public Task<ParseUser> getAsync() {
        return getAsync(ParseUser.isAutomaticUserEnabled());
    }

    @Override // com.parse.ParseCurrentUserController
    public Task<String> getCurrentSessionTokenAsync() {
        return getAsync(false).onSuccess(new Continuation<ParseUser, String>() { // from class: com.parse.CachedCurrentUserController.3
            @Override // com.parse.boltsinternal.Continuation
            public String then(Task<ParseUser> task) {
                ParseUser result = task.getResult();
                if (result != null) {
                    return result.getSessionToken();
                }
                return null;
            }
        });
    }

    @Override // com.parse.ParseCurrentUserController
    public Task<Void> logOutAsync() {
        return this.taskQueue.enqueue(new AnonymousClass4());
    }

    @Override // com.parse.ParseCurrentUserController
    public Task<Void> setIfNeededAsync(ParseUser parseUser) {
        synchronized (this.mutex) {
            if (parseUser.isCurrentUser() && !this.currentUserMatchesDisk) {
                return setAsync(parseUser);
            }
            return Task.forResult(null);
        }
    }

    @Override // com.parse.ParseCurrentUserController
    public Task<ParseUser> getAsync(boolean z10) {
        synchronized (this.mutex) {
            try {
                ParseUser parseUser = this.currentUser;
                if (parseUser == null) {
                    return this.taskQueue.enqueue(new AnonymousClass5(z10));
                }
                return Task.forResult(parseUser);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseObjectCurrentController
    public Task<Void> setAsync(ParseUser parseUser) {
        return this.taskQueue.enqueue(new AnonymousClass1(parseUser));
    }

    public ParseUser lazyLogIn(String str, Map<String, String> map) {
        ParseUser parseUser = (ParseUser) ParseObject.create(ParseUser.class);
        synchronized (parseUser.mutex) {
            parseUser.setIsCurrentUser(true);
            parseUser.putAuthData(str, map);
        }
        synchronized (this.mutex) {
            this.currentUserMatchesDisk = false;
            this.currentUser = parseUser;
        }
        return parseUser;
    }
}
