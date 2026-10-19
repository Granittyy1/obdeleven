package kotlinx.coroutines;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: renamed from: kotlinx.coroutines.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractCoroutine.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2672a<T> extends JobSupport implements kotlin.coroutines.c<T>, A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlin.coroutines.e f43222d;

    public AbstractC2672a(kotlin.coroutines.e eVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            Z((InterfaceC2694i0) eVar.get(InterfaceC2694i0.b.f43449b));
        }
        this.f43222d = eVar.plus(this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final String H() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void Y(CompletionHandlerException completionHandlerException) {
        C2714y.a(this.f43222d, completionHandlerException);
    }

    @Override // kotlin.coroutines.c
    public final kotlin.coroutines.e getContext() {
        return this.f43222d;
    }

    @Override // kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        return this.f43222d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    public final void k0(Object obj) {
        if (!(obj instanceof C2708s)) {
            u0(obj);
            return;
        }
        C2708s c2708s = (C2708s) obj;
        Throwable th = c2708s.f43531a;
        c2708s.getClass();
        t0(th, C2708s.f43530b.get(c2708s) != 0);
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            obj = new C2708s(thA, false);
        }
        Object objD0 = d0(obj);
        if (objD0 == o0.f43518b) {
            return;
        }
        A(objD0);
    }

    public final void v0(CoroutineStart coroutineStart, AbstractC2672a abstractC2672a, Ia.p pVar) {
        Object objInvoke;
        int iOrdinal = coroutineStart.ordinal();
        if (iOrdinal == 0) {
            p144l6.b.d(pVar, abstractC2672a, this);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                kotlin.jvm.internal.i.e(pVar, "<this>");
                A8.p.y(A8.p.u(pVar, abstractC2672a, this)).resumeWith(p293xa.r.f47939a);
                return;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                kotlin.coroutines.e eVar = this.f43222d;
                Object objC = ThreadContextKt.c(eVar, null);
                try {
                    if (pVar instanceof BaseContinuationImpl) {
                        kotlin.jvm.internal.o.d(2, pVar);
                        objInvoke = pVar.invoke(abstractC2672a, this);
                    } else {
                        objInvoke = A8.p.H(pVar, abstractC2672a, this);
                    }
                    ThreadContextKt.a(eVar, objC);
                    if (objInvoke != CoroutineSingletons.f43038b) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    ThreadContextKt.a(eVar, objC);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(kotlin.b.a(th2));
            }
        }
    }

    public void u0(T t8) {
    }

    public void t0(Throwable th, boolean z10) {
    }
}
