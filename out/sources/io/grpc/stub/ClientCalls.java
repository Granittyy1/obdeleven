package io.grpc.stub;

import A8.p;
import com.braze.Constants;
import com.google.common.base.d;
import com.google.common.util.concurrent.AbstractFuture;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.StatusRuntimeException;
import io.grpc.m;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class ClientCalls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f38030a = Logger.getLogger(ClientCalls.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f38031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final io.grpc.b.C0388b<StubType> f38032c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StubType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final StubType f38033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ StubType[] f38034c;

        static {
            StubType stubType = new StubType("BLOCKING", 0);
            f38033b = stubType;
            f38034c = new StubType[]{stubType, new StubType("FUTURE", 1), new StubType("ASYNC", 2)};
        }

        public StubType() {
            throw null;
        }

        public static StubType valueOf(String str) {
            return (StubType) Enum.valueOf(StubType.class, str);
        }

        public static StubType[] values() {
            return (StubType[]) f38034c.clone();
        }
    }

    public static final class ThreadlessExecutor extends ConcurrentLinkedQueue<Runnable> implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Logger f38035b = Logger.getLogger(ThreadlessExecutor.class.getName());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Object f38036c = new Object();
        private volatile Object waiter;

        public final void d() throws InterruptedException {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            Runnable runnablePoll = poll();
            if (runnablePoll == null) {
                this.waiter = Thread.currentThread();
                while (true) {
                    try {
                        Runnable runnablePoll2 = poll();
                        if (runnablePoll2 != null) {
                            this.waiter = null;
                            runnablePoll = runnablePoll2;
                            break;
                        } else {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                throw new InterruptedException();
                            }
                        }
                    } catch (Throwable th) {
                        this.waiter = null;
                        throw th;
                    }
                }
            }
            do {
                try {
                    runnablePoll.run();
                } catch (Throwable th2) {
                    f38035b.log(Level.WARNING, "Runnable threw exception", th2);
                }
                runnablePoll = poll();
            } while (runnablePoll != null);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            add(runnable);
            Object obj = this.waiter;
            if (obj != f38036c) {
                LockSupport.unpark((Thread) obj);
            } else if (remove(runnable) && ClientCalls.f38031b) {
                throw new RejectedExecutionException();
            }
        }

        public final void shutdown() {
            this.waiter = f38036c;
            while (true) {
                Runnable runnablePoll = poll();
                if (runnablePoll == null) {
                    return;
                }
                try {
                    runnablePoll.run();
                } catch (Throwable th) {
                    f38035b.log(Level.WARNING, "Runnable threw exception", th);
                }
            }
        }
    }

    public static final class a<RespT> extends AbstractFuture<RespT> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final D9.b<?, RespT> f38037i;

        public a(D9.b<?, RespT> bVar) {
            this.f38037i = bVar;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final void i() {
            this.f38037i.a("GrpcFuture was cancelled", null);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public final String j() {
            d.a aVarB = d.b(this);
            aVarB.c(this.f38037i, "clientCall");
            return aVarB.toString();
        }
    }

    public static abstract class b<T> extends D9.b.a<T> {
    }

    static {
        f38031b = !Cb.a.m(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f38032c = new io.grpc.b.C0388b<>("internal-stub-type", null);
    }

    public static Object a(D9.a aVar, MethodDescriptor methodDescriptor, io.grpc.b bVar, N7.d dVar) throws Throwable {
        ThreadlessExecutor threadlessExecutor = new ThreadlessExecutor();
        io.grpc.b.a aVarB = io.grpc.b.b(bVar.c(f38032c, StubType.f38033b));
        aVarB.f36946b = threadlessExecutor;
        D9.b bVarF = aVar.f(methodDescriptor, new io.grpc.b(aVarB));
        boolean z10 = false;
        try {
            try {
                a aVarC = c(bVarF, dVar);
                while (!aVarC.isDone()) {
                    try {
                        threadlessExecutor.d();
                    } catch (InterruptedException e10) {
                        try {
                            bVarF.a("Thread interrupted", e10);
                            z10 = true;
                        } catch (Error e11) {
                            e = e11;
                            b(bVarF, e);
                            throw null;
                        } catch (RuntimeException e12) {
                            e = e12;
                            b(bVarF, e);
                            throw null;
                        } catch (Throwable th) {
                            th = th;
                            z10 = true;
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                }
                threadlessExecutor.shutdown();
                Object objD = d(aVarC);
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                return objD;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Error e13) {
            e = e13;
        } catch (RuntimeException e14) {
            e = e14;
        }
    }

    public static void b(D9.b bVar, Throwable th) {
        try {
            bVar.a(null, th);
        } catch (Throwable th2) {
            f38030a.log(Level.SEVERE, "RuntimeException encountered while closing call", th2);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
    }

    public static a c(D9.b bVar, N7.d dVar) {
        a aVar = new a(bVar);
        c cVar = new c(aVar);
        bVar.e(cVar, new m());
        cVar.f38038a.f38037i.c();
        try {
            bVar.d(dVar);
            bVar.b();
            return aVar;
        } catch (Error e10) {
            b(bVar, e10);
            throw null;
        } catch (RuntimeException e11) {
            b(bVar, e11);
            throw null;
        }
    }

    public static Object d(a aVar) {
        try {
            return aVar.get();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw Status.f36900f.h("Thread interrupted").g(e10).a();
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            p.j(cause, Constants.BRAZE_PUSH_TITLE_KEY);
            for (Throwable cause2 = cause; cause2 != null; cause2 = cause2.getCause()) {
                if (cause2 instanceof StatusException) {
                    StatusException statusException = (StatusException) cause2;
                    throw new StatusRuntimeException(statusException.a(), statusException.b());
                }
                if (cause2 instanceof StatusRuntimeException) {
                    StatusRuntimeException statusRuntimeException = (StatusRuntimeException) cause2;
                    throw new StatusRuntimeException(statusRuntimeException.a(), statusRuntimeException.b());
                }
            }
            throw Status.f36901g.h("unexpected exception").g(cause).a();
        }
    }

    public static final class c<RespT> extends b<RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a<RespT> f38038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RespT f38039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f38040c = false;

        public c(a<RespT> aVar) {
            this.f38038a = aVar;
        }

        @Override // D9.b.a
        public final void a(Status status, m mVar) {
            boolean zF = status.f();
            a<RespT> aVar = this.f38038a;
            if (!zF) {
                StatusRuntimeException statusRuntimeException = new StatusRuntimeException(status, mVar);
                aVar.getClass();
                if (AbstractFuture.f28015g.b(aVar, null, new AbstractFuture.Failure(statusRuntimeException))) {
                    AbstractFuture.e(aVar, false);
                    return;
                }
                return;
            }
            if (!this.f38040c) {
                StatusRuntimeException statusRuntimeException2 = new StatusRuntimeException(Status.f36904k.h("No value received for unary call"), mVar);
                aVar.getClass();
                if (AbstractFuture.f28015g.b(aVar, null, new AbstractFuture.Failure(statusRuntimeException2))) {
                    AbstractFuture.e(aVar, false);
                }
            }
            Object obj = this.f38039b;
            aVar.getClass();
            if (obj == null) {
                obj = AbstractFuture.f28016h;
            }
            if (AbstractFuture.f28015g.b(aVar, null, obj)) {
                AbstractFuture.e(aVar, false);
            }
        }

        @Override // D9.b.a
        public final void c(RespT respt) {
            if (this.f38040c) {
                throw Status.f36904k.h("More than one value received for unary call").a();
            }
            this.f38039b = respt;
            this.f38040c = true;
        }

        @Override // D9.b.a
        public final void b(m mVar) {
        }
    }
}
