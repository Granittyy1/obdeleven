package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
class TaskQueue {
    private final Lock lock = new ReentrantLock();
    private Task<Void> tail;

    private Task<Void> getTaskToAwait() {
        this.lock.lock();
        try {
            Task<Void> taskForResult = this.tail;
            if (taskForResult == null) {
                taskForResult = Task.forResult(null);
            }
            return taskForResult.continueWith(new Continuation<Void, Void>() { // from class: com.parse.TaskQueue.2
                @Override // com.parse.boltsinternal.Continuation
                public Void then(Task<Void> task) {
                    return null;
                }
            });
        } finally {
            this.lock.unlock();
        }
    }

    public static <T> Continuation<T, Task<T>> waitFor(final Task<Void> task) {
        return new Continuation<T, Task<T>>() { // from class: com.parse.TaskQueue.1
            @Override // com.parse.boltsinternal.Continuation
            public Task<T> then(final Task<T> task2) {
                return task.continueWithTask(new Continuation<Void, Task<T>>() { // from class: com.parse.TaskQueue.1.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<T> then(Task<Void> task3) {
                        return task2;
                    }
                });
            }
        };
    }

    public <T> Task<T> enqueue(Continuation<Void, Task<T>> continuation) {
        this.lock.lock();
        try {
            Task<Void> taskForResult = this.tail;
            if (taskForResult == null) {
                taskForResult = Task.forResult(null);
            }
            try {
                Task<T> taskThen = continuation.then(getTaskToAwait());
                this.tail = Task.whenAll(Arrays.asList(taskForResult, taskThen));
                this.lock.unlock();
                return taskThen;
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public Lock getLock() {
        return this.lock;
    }
}
