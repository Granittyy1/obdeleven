package com.google.firebase.concurrent;

import U4.C0804l;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class SequentialExecutor implements Executor {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f28056g = Logger.getLogger(SequentialExecutor.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f28057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f28058c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WorkerRunningState f28059d = WorkerRunningState.f28062b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f28060e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f28061f = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WorkerRunningState {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final WorkerRunningState f28062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final WorkerRunningState f28063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final WorkerRunningState f28064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final WorkerRunningState f28065e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ WorkerRunningState[] f28066f;

        static {
            WorkerRunningState workerRunningState = new WorkerRunningState("IDLE", 0);
            f28062b = workerRunningState;
            WorkerRunningState workerRunningState2 = new WorkerRunningState("QUEUING", 1);
            f28063c = workerRunningState2;
            WorkerRunningState workerRunningState3 = new WorkerRunningState("QUEUED", 2);
            f28064d = workerRunningState3;
            WorkerRunningState workerRunningState4 = new WorkerRunningState("RUNNING", 3);
            f28065e = workerRunningState4;
            f28066f = new WorkerRunningState[]{workerRunningState, workerRunningState2, workerRunningState3, workerRunningState4};
        }

        public WorkerRunningState() {
            throw null;
        }

        public static WorkerRunningState valueOf(String str) {
            return (WorkerRunningState) Enum.valueOf(WorkerRunningState.class, str);
        }

        public static WorkerRunningState[] values() {
            return (WorkerRunningState[]) f28066f.clone();
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f28067b;

        public a(Runnable runnable) {
            this.f28067b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f28067b.run();
        }

        public final String toString() {
            return this.f28067b.toString();
        }
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f28068b;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        
            if (r1 == false) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
        
            r9.f28068b.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
        
            com.google.firebase.concurrent.SequentialExecutor.f28056g.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.f28068b, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
        
            r9.f28068b = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.firebase.concurrent.SequentialExecutor r2 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L56
                java.util.ArrayDeque r2 = r2.f28058c     // Catch: java.lang.Throwable -> L56
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L56
                if (r0 != 0) goto L28
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = r0.f28059d     // Catch: java.lang.Throwable -> L1c
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r4 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.f28065e     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                r0 = move-exception
                goto L79
            L1e:
                long r5 = r0.f28060e     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.f28060e = r5     // Catch: java.lang.Throwable -> L1c
                r0.f28059d = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                com.google.firebase.concurrent.SequentialExecutor r3 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                java.util.ArrayDeque r3 = r3.f28058c     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                r9.f28068b = r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L47
                com.google.firebase.concurrent.SequentialExecutor r0 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.f28062b     // Catch: java.lang.Throwable -> L1c
                r0.f28059d = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L46
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L46:
                return
            L47:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L56
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r9.f28068b     // Catch: java.lang.Throwable -> L58 java.lang.RuntimeException -> L5a
                r3.run()     // Catch: java.lang.Throwable -> L58 java.lang.RuntimeException -> L5a
            L53:
                r9.f28068b = r2     // Catch: java.lang.Throwable -> L56
                goto L2
            L56:
                r0 = move-exception
                goto L7b
            L58:
                r0 = move-exception
                goto L76
            L5a:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.firebase.concurrent.SequentialExecutor.f28056g     // Catch: java.lang.Throwable -> L58
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L58
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
                r6.<init>()     // Catch: java.lang.Throwable -> L58
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L58
                java.lang.Runnable r7 = r9.f28068b     // Catch: java.lang.Throwable -> L58
                r6.append(r7)     // Catch: java.lang.Throwable -> L58
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L58
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L58
                goto L53
            L76:
                r9.f28068b = r2     // Catch: java.lang.Throwable -> L56
                throw r0     // Catch: java.lang.Throwable -> L56
            L79:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L56
            L7b:
                if (r1 == 0) goto L84
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L84:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.SequentialExecutor.b.a():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (SequentialExecutor.this.f28058c) {
                    SequentialExecutor.this.f28059d = WorkerRunningState.f28062b;
                    throw e10;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.f28068b;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + SequentialExecutor.this.f28059d + "}";
        }
    }

    public SequentialExecutor(Executor executor) {
        C0804l.h(executor);
        this.f28057b = executor;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        WorkerRunningState workerRunningState;
        boolean z10;
        C0804l.h(runnable);
        synchronized (this.f28058c) {
            WorkerRunningState workerRunningState2 = this.f28059d;
            if (workerRunningState2 != WorkerRunningState.f28065e && workerRunningState2 != (workerRunningState = WorkerRunningState.f28064d)) {
                long j = this.f28060e;
                a aVar = new a(runnable);
                this.f28058c.add(aVar);
                WorkerRunningState workerRunningState3 = WorkerRunningState.f28063c;
                this.f28059d = workerRunningState3;
                try {
                    this.f28057b.execute(this.f28061f);
                    if (this.f28059d != workerRunningState3) {
                        return;
                    }
                    synchronized (this.f28058c) {
                        try {
                            if (this.f28060e == j && this.f28059d == workerRunningState3) {
                                this.f28059d = workerRunningState;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f28058c) {
                        try {
                            WorkerRunningState workerRunningState4 = this.f28059d;
                            if (workerRunningState4 != WorkerRunningState.f28062b && workerRunningState4 != WorkerRunningState.f28063c) {
                                z10 = false;
                            } else if (this.f28058c.removeLastOccurrence(aVar)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z10) {
                                throw e10;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f28058c.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f28057b + "}";
    }
}
