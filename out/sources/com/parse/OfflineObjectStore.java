package com.parse;

import com.parse.ParseObject;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class OfflineObjectStore<T extends ParseObject> implements ParseObjectStore<T> {
    private final String className;
    private final ParseObjectStore<T> legacy;
    private final String pinName;

    public OfflineObjectStore(Class<T> cls, String str, ParseObjectStore<T> parseObjectStore) {
        this(getSubclassingController().getClassName(cls), str, parseObjectStore);
    }

    private static ParseObjectSubclassingController getSubclassingController() {
        return ParseCorePlugins.getInstance().getSubclassingController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends ParseObject> Task<T> migrate(final ParseObjectStore<T> parseObjectStore, final ParseObjectStore<T> parseObjectStore2) {
        return (Task<T>) parseObjectStore.getAsync().onSuccessTask(new Continuation<T, Task<T>>() { // from class: com.parse.OfflineObjectStore.1
            @Override // com.parse.boltsinternal.Continuation
            public Task<T> then(Task<T> task) {
                final T result = task.getResult();
                return result == null ? task : (Task<T>) Task.whenAll(Arrays.asList(parseObjectStore.deleteAsync(), parseObjectStore2.setAsync(result))).continueWith(new Continuation<Void, T>() { // from class: com.parse.OfflineObjectStore.1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public T then(Task<Void> task2) {
                        return (T) result;
                    }
                });
            }
        });
    }

    @Override // com.parse.ParseObjectStore
    public Task<Void> deleteAsync() {
        final Task<Void> taskUnpinAllInBackground = ParseObject.unpinAllInBackground(this.pinName);
        return Task.whenAll(Arrays.asList(this.legacy.deleteAsync(), taskUnpinAllInBackground)).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineObjectStore.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                return taskUnpinAllInBackground;
            }
        });
    }

    @Override // com.parse.ParseObjectStore
    public Task<T> getAsync() {
        return ParseQuery.getQuery(this.className).fromPin(this.pinName).ignoreACLs().findInBackground().onSuccessTask(new Continuation<List<T>, Task<T>>() { // from class: com.parse.OfflineObjectStore.4
            @Override // com.parse.boltsinternal.Continuation
            public Task<T> then(Task<List<T>> task) {
                List<T> result = task.getResult();
                if (result != null) {
                    return result.size() == 1 ? Task.forResult(result.get(0)) : (Task<T>) ParseObject.unpinAllInBackground(OfflineObjectStore.this.pinName).cast();
                }
                return Task.forResult(null);
            }
        }).onSuccessTask(new Continuation<T, Task<T>>() { // from class: com.parse.OfflineObjectStore.3
            @Override // com.parse.boltsinternal.Continuation
            public Task<T> then(Task<T> task) {
                return task.getResult() != null ? task : OfflineObjectStore.migrate(OfflineObjectStore.this.legacy, OfflineObjectStore.this).cast();
            }
        });
    }

    @Override // com.parse.ParseObjectStore
    public Task<Void> setAsync(final T t8) {
        return ParseObject.unpinAllInBackground(this.pinName).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineObjectStore.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                return t8.pinInBackground(OfflineObjectStore.this.pinName, false);
            }
        });
    }

    public OfflineObjectStore(String str, String str2, ParseObjectStore<T> parseObjectStore) {
        this.className = str;
        this.pinName = str2;
        this.legacy = parseObjectStore;
    }
}
