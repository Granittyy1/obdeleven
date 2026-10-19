package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class L<T> extends Sa.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43195d;

    public L(int i10) {
        this.f43195d = i10;
    }

    public abstract kotlin.coroutines.c<T> b();

    public Throwable e(Object obj) {
        C2708s c2708s = obj instanceof C2708s ? (C2708s) obj : null;
        if (c2708s != null) {
            return c2708s.f43531a;
        }
        return null;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            D2.V.e(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.i.b(th);
        C2714y.a(b().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object objA;
        Object objA2;
        Sa.g gVar = this.f5710c;
        try {
            kotlin.coroutines.c<T> cVarB = b();
            kotlin.jvm.internal.i.c(cVarB, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            kotlinx.coroutines.internal.h hVar = (kotlinx.coroutines.internal.h) cVarB;
            ContinuationImpl continuationImpl = hVar.f43477f;
            Object obj = hVar.f43479h;
            kotlin.coroutines.e context = continuationImpl.getContext();
            Object objC = ThreadContextKt.c(context, obj);
            I0<?> i0D = objC != ThreadContextKt.f43460a ? CoroutineContextKt.d(continuationImpl, context, objC) : null;
            try {
                kotlin.coroutines.e context2 = continuationImpl.getContext();
                Object objH = h();
                Throwable thE = e(objH);
                InterfaceC2694i0 interfaceC2694i0 = (thE == null && A8.p.z(this.f43195d)) ? (InterfaceC2694i0) context2.get(InterfaceC2694i0.b.f43449b) : null;
                if (interfaceC2694i0 != null && !interfaceC2694i0.c()) {
                    CancellationException cancellationExceptionM = interfaceC2694i0.M();
                    a(objH, cancellationExceptionM);
                    continuationImpl.resumeWith(kotlin.b.a(cancellationExceptionM));
                } else if (thE != null) {
                    continuationImpl.resumeWith(kotlin.b.a(thE));
                } else {
                    continuationImpl.resumeWith(f(objH));
                }
                p293xa.r rVar = p293xa.r.f47939a;
                if (i0D == null || i0D.w0()) {
                    ThreadContextKt.a(context, objC);
                }
                try {
                    gVar.getClass();
                    objA2 = p293xa.r.f47939a;
                } catch (Throwable th) {
                    objA2 = kotlin.b.a(th);
                }
                g(null, Result.a(objA2));
            } catch (Throwable th2) {
                if (i0D == null || i0D.w0()) {
                    ThreadContextKt.a(context, objC);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                gVar.getClass();
                objA = p293xa.r.f47939a;
            } catch (Throwable th4) {
                objA = kotlin.b.a(th4);
            }
            g(th3, Result.a(objA));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(Object obj) {
        return obj;
    }

    public void a(Object obj, CancellationException cancellationException) {
    }
}
