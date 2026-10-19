package com.parse;

import com.parse.boltsinternal.AggregateException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
class ParseTaskUtils {
    public static Task<Void> callbackOnMainThreadAsync(Task<Void> task, ParseCallback1<ParseException> parseCallback1) {
        return callbackOnMainThreadAsync(task, parseCallback1, false);
    }

    public static <T> T wait(Task<T> task) throws ParseException {
        try {
            task.waitForCompletion();
            if (!task.isFaulted()) {
                if (task.isCancelled()) {
                    throw new RuntimeException(new CancellationException());
                }
                return task.getResult();
            }
            Exception error = task.getError();
            if (error instanceof ParseException) {
                throw ((ParseException) error);
            }
            if (error instanceof AggregateException) {
                throw new ParseException(error);
            }
            if (error instanceof RuntimeException) {
                throw ((RuntimeException) error);
            }
            throw new RuntimeException(error);
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static Task<Void> callbackOnMainThreadAsync(Task<Void> task, final ParseCallback1<ParseException> parseCallback1, boolean z10) {
        return parseCallback1 == null ? task : callbackOnMainThreadAsync(task, new ParseCallback2<Void, ParseException>() { // from class: com.parse.ParseTaskUtils.1
            @Override // com.parse.ParseCallback2
            public void done(Void r10, ParseException parseException) {
                parseCallback1.done(parseException);
            }
        }, z10);
    }

    public static <T> Task<T> callbackOnMainThreadAsync(Task<T> task, ParseCallback2<T, ParseException> parseCallback2) {
        return callbackOnMainThreadAsync((Task) task, (ParseCallback2) parseCallback2, false);
    }

    public static <T> Task<T> callbackOnMainThreadAsync(Task<T> task, final ParseCallback2<T, ParseException> parseCallback2, final boolean z10) {
        if (parseCallback2 == null) {
            return task;
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        task.continueWith(new Continuation<T, Void>() { // from class: com.parse.ParseTaskUtils.2
            @Override // com.parse.boltsinternal.Continuation
            public Void then(final Task<T> task2) {
                if (!task2.isCancelled() || z10) {
                    ParseExecutors.main().execute(new Runnable() { // from class: com.parse.ParseTaskUtils.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                Exception error = task2.getError();
                                if (error != null && !(error instanceof ParseException)) {
                                    error = new ParseException(error);
                                }
                                parseCallback2.done(task2.getResult(), (ParseException) error);
                                if (task2.isCancelled()) {
                                    return;
                                }
                            } finally {
                                if (task2.isCancelled()) {
                                    taskCompletionSource.setCancelled();
                                } else if (task2.isFaulted()) {
                                    taskCompletionSource.setError(task2.getError());
                                } else {
                                    taskCompletionSource.setResult(task2.getResult());
                                }
                            }
                        }
                    });
                    return null;
                }
                taskCompletionSource.setCancelled();
                return null;
            }
        });
        return taskCompletionSource.getTask();
    }
}
