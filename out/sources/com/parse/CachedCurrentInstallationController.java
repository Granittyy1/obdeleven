package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: loaded from: classes3.dex */
class CachedCurrentInstallationController implements ParseCurrentInstallationController {
    ParseInstallation currentInstallation;
    private final InstallationId installationId;
    private final ParseObjectStore<ParseInstallation> store;
    private final Object mutex = new Object();
    private final TaskQueue taskQueue = new TaskQueue();

    /* JADX INFO: renamed from: com.parse.CachedCurrentInstallationController$2, reason: invalid class name */
    public class AnonymousClass2 implements Continuation<Void, Task<ParseInstallation>> {
        public AnonymousClass2() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.parse.boltsinternal.Continuation
        public Task<ParseInstallation> then(Task<Void> task) {
            return task.continueWithTask(new Continuation<Void, Task<ParseInstallation>>() { // from class: com.parse.CachedCurrentInstallationController.2.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<ParseInstallation> then(Task<Void> task2) {
                    synchronized (CachedCurrentInstallationController.this.mutex) {
                        try {
                            CachedCurrentInstallationController cachedCurrentInstallationController = CachedCurrentInstallationController.this;
                            ParseInstallation parseInstallation = cachedCurrentInstallationController.currentInstallation;
                            if (parseInstallation == null) {
                                return cachedCurrentInstallationController.store.getAsync().continueWith(new Continuation<ParseInstallation, ParseInstallation>() { // from class: com.parse.CachedCurrentInstallationController.2.1.1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // com.parse.boltsinternal.Continuation
                                    public ParseInstallation then(Task<ParseInstallation> task3) {
                                        ParseInstallation result = task3.getResult();
                                        if (result == null) {
                                            result = (ParseInstallation) ParseObject.create(ParseInstallation.class);
                                            result.updateDeviceInfo(CachedCurrentInstallationController.this.installationId);
                                        } else {
                                            CachedCurrentInstallationController.this.installationId.set(result.getInstallationId());
                                            PLog.v("com.parse.CachedCurrentInstallationController", "Successfully deserialized Installation object");
                                        }
                                        synchronized (CachedCurrentInstallationController.this.mutex) {
                                            CachedCurrentInstallationController.this.currentInstallation = result;
                                        }
                                        return result;
                                    }
                                }, ParseExecutors.io());
                            }
                            return Task.forResult(parseInstallation);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    public CachedCurrentInstallationController(ParseObjectStore<ParseInstallation> parseObjectStore, InstallationId installationId) {
        this.store = parseObjectStore;
        this.installationId = installationId;
    }

    @Override // com.parse.ParseObjectCurrentController
    public void clearFromMemory() {
        synchronized (this.mutex) {
            this.currentInstallation = null;
        }
    }

    @Override // com.parse.ParseObjectCurrentController
    public Task<ParseInstallation> getAsync() {
        synchronized (this.mutex) {
            try {
                ParseInstallation parseInstallation = this.currentInstallation;
                if (parseInstallation == null) {
                    return this.taskQueue.enqueue(new AnonymousClass2());
                }
                return Task.forResult(parseInstallation);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseObjectCurrentController
    public boolean isCurrent(ParseInstallation parseInstallation) {
        boolean z10;
        synchronized (this.mutex) {
            z10 = this.currentInstallation == parseInstallation;
        }
        return z10;
    }

    @Override // com.parse.ParseObjectCurrentController
    public Task<Void> setAsync(final ParseInstallation parseInstallation) {
        return !isCurrent(parseInstallation) ? Task.forResult(null) : this.taskQueue.enqueue(new Continuation<Void, Task<Void>>() { // from class: com.parse.CachedCurrentInstallationController.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                return task.continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.CachedCurrentInstallationController.1.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<Void> task2) {
                        return CachedCurrentInstallationController.this.store.setAsync(parseInstallation);
                    }
                }).continueWithTask((Continuation<TContinuationResult, Task<TContinuationResult>>) new Continuation<Void, Task<Void>>() { // from class: com.parse.CachedCurrentInstallationController.1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<Void> task2) {
                        CachedCurrentInstallationController.this.installationId.set(parseInstallation.getInstallationId());
                        return task2;
                    }
                }, ParseExecutors.io());
            }
        });
    }
}
