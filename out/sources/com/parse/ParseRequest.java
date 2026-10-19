package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import com.parse.http.ParseHttpBody;
import com.parse.http.ParseHttpRequest;
import com.parse.http.ParseHttpResponse;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
abstract class ParseRequest<Response> {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int MAX_POOL_SIZE;
    protected static final ExecutorService NETWORK_EXECUTOR;
    private static long defaultInitialRetryDelay;
    private static final ThreadFactory sThreadFactory;
    ParseHttpRequest.Method method;
    String url;

    /* JADX INFO: renamed from: com.parse.ParseRequest$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$parse$http$ParseHttpRequest$Method;

        static {
            int[] iArr = new int[ParseHttpRequest.Method.values().length];
            $SwitchMap$com$parse$http$ParseHttpRequest$Method = iArr;
            try {
                iArr[ParseHttpRequest.Method.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[ParseHttpRequest.Method.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[ParseHttpRequest.Method.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$parse$http$ParseHttpRequest$Method[ParseHttpRequest.Method.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.parse.ParseRequest.1
            private final AtomicInteger mCount = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "ParseRequest.NETWORK_EXECUTOR-thread-" + this.mCount.getAndIncrement());
            }
        };
        sThreadFactory = threadFactory;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int i10 = (iAvailableProcessors * 2) + 1;
        CORE_POOL_SIZE = i10;
        int i11 = (iAvailableProcessors * 4) + 1;
        MAX_POOL_SIZE = i11;
        NETWORK_EXECUTOR = newThreadPoolExecutor(i10, i11, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), threadFactory);
        defaultInitialRetryDelay = 1000L;
    }

    public ParseRequest(ParseHttpRequest.Method method, String str) {
        this.method = method;
        this.url = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int maxRetries() {
        if (ParsePlugins.get() == null) {
            return 4;
        }
        return ParsePlugins.get().configuration().maxRetries;
    }

    private static ThreadPoolExecutor newThreadPoolExecutor(int i10, int i11, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i11, j, timeUnit, blockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    private Task<Response> sendOneRequestAsync(final ParseHttpClient parseHttpClient, final ParseHttpRequest parseHttpRequest, final ProgressCallback progressCallback) {
        return Task.forResult(null).onSuccessTask(new Continuation<Void, Task<Response>>() { // from class: com.parse.ParseRequest.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Response> then(Task<Void> task) throws Exception {
                return ParseRequest.this.onResponseAsync(parseHttpClient.execute(parseHttpRequest), progressCallback);
            }
        }, NETWORK_EXECUTOR).continueWithTask(new Continuation<Response, Task<Response>>() { // from class: com.parse.ParseRequest.2
            @Override // com.parse.boltsinternal.Continuation
            public Task<Response> then(Task<Response> task) {
                if (!task.isFaulted()) {
                    return task;
                }
                Exception error = task.getError();
                return error instanceof IOException ? Task.forError(ParseRequest.this.newTemporaryException("i/o failure", error)) : task;
            }
        }, Task.BACKGROUND_EXECUTOR);
    }

    public Task<Response> executeAsync(ParseHttpClient parseHttpClient) {
        return executeAsync(parseHttpClient, (ProgressCallback) null, (ProgressCallback) null, (Task<Void>) null);
    }

    public ParseHttpBody newBody(ProgressCallback progressCallback) {
        return null;
    }

    public ParseException newPermanentException(int i10, String str) {
        ParseRequestException parseRequestException = new ParseRequestException(i10, str);
        parseRequestException.isPermanentFailure = true;
        return parseRequestException;
    }

    public ParseHttpRequest newRequest(ParseHttpRequest.Method method, String str, ProgressCallback progressCallback) {
        ParseHttpRequest.Builder url = new ParseHttpRequest.Builder().setMethod(method).setUrl(str);
        int i10 = AnonymousClass5.$SwitchMap$com$parse$http$ParseHttpRequest$Method[method.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                throw new IllegalStateException("Invalid method " + method);
            }
            url.setBody(newBody(progressCallback));
        }
        return url.build();
    }

    public ParseException newTemporaryException(int i10, String str) {
        ParseRequestException parseRequestException = new ParseRequestException(i10, str);
        parseRequestException.isPermanentFailure = false;
        return parseRequestException;
    }

    public abstract Task<Response> onResponseAsync(ParseHttpResponse parseHttpResponse, ProgressCallback progressCallback);

    public static class ParseRequestException extends ParseException {
        boolean isPermanentFailure;

        public ParseRequestException(int i10, String str) {
            super(i10, str);
            this.isPermanentFailure = false;
        }

        public ParseRequestException(int i10, String str, Throwable th) {
            super(i10, str, th);
            this.isPermanentFailure = false;
        }
    }

    public Task<Response> executeAsync(ParseHttpClient parseHttpClient, Task<Void> task) {
        return executeAsync(parseHttpClient, (ProgressCallback) null, (ProgressCallback) null, task);
    }

    public Task<Response> executeAsync(ParseHttpClient parseHttpClient, ProgressCallback progressCallback, ProgressCallback progressCallback2, Task<Void> task) {
        return executeAsync(parseHttpClient, newRequest(this.method, this.url, progressCallback), progressCallback2, task);
    }

    public ParseException newTemporaryException(String str, Throwable th) {
        ParseRequestException parseRequestException = new ParseRequestException(100, str, th);
        parseRequestException.isPermanentFailure = false;
        return parseRequestException;
    }

    private Task<Response> executeAsync(ParseHttpClient parseHttpClient, ParseHttpRequest parseHttpRequest, ProgressCallback progressCallback, Task<Void> task) {
        long j = defaultInitialRetryDelay;
        return executeAsync(parseHttpClient, parseHttpRequest, 0, j + ((long) (Math.random() * j)), progressCallback, task);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Response> executeAsync(final ParseHttpClient parseHttpClient, final ParseHttpRequest parseHttpRequest, final int i10, final long j, final ProgressCallback progressCallback, final Task<Void> task) {
        if (task != null && task.isCancelled()) {
            return Task.cancelled();
        }
        return (Task<Response>) sendOneRequestAsync(parseHttpClient, parseHttpRequest, progressCallback).continueWithTask(new Continuation<Response, Task<Response>>() { // from class: com.parse.ParseRequest.4
            @Override // com.parse.boltsinternal.Continuation
            public Task<Response> then(Task<Response> task2) {
                Exception error = task2.getError();
                if (!task2.isFaulted() || !(error instanceof ParseException)) {
                    return task2;
                }
                Task task3 = task;
                if (task3 != null && task3.isCancelled()) {
                    return Task.cancelled();
                }
                if (((error instanceof ParseRequestException) && ((ParseRequestException) error).isPermanentFailure) || i10 >= ParseRequest.maxRetries()) {
                    return task2;
                }
                PLog.i("com.parse.ParseRequest", "Request failed. Waiting " + j + " milliseconds before attempt #" + (i10 + 1));
                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                ParseExecutors.scheduled().schedule(new Runnable() { // from class: com.parse.ParseRequest.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        ParseRequest.this.executeAsync(parseHttpClient, parseHttpRequest, i10 + 1, j * 2, progressCallback, task).continueWithTask(new Continuation<Response, Task<Void>>() { // from class: com.parse.ParseRequest.4.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.parse.boltsinternal.Continuation
                            public Task<Void> then(Task<Response> task4) {
                                if (task4.isCancelled()) {
                                    taskCompletionSource.setCancelled();
                                    return null;
                                }
                                if (task4.isFaulted()) {
                                    taskCompletionSource.setError(task4.getError());
                                    return null;
                                }
                                taskCompletionSource.setResult(task4.getResult());
                                return null;
                            }
                        });
                    }
                }, j, TimeUnit.MILLISECONDS);
                return taskCompletionSource.getTask();
            }
        });
    }
}
