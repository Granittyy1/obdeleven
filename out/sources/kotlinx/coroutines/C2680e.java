package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: renamed from: kotlinx.coroutines.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2680e {
    public static G a(A a10, kotlin.coroutines.e eVar, Ia.p pVar, int i10) {
        if ((i10 & 1) != 0) {
            eVar = EmptyCoroutineContext.f43032b;
        }
        CoroutineStart coroutineStart = CoroutineStart.f43166b;
        kotlin.coroutines.e eVarC = CoroutineContextKt.c(a10, eVar);
        CoroutineStart coroutineStart2 = CoroutineStart.f43166b;
        G g10 = new G(eVarC, true, true);
        g10.v0(coroutineStart, g10, pVar);
        return g10;
    }

    public static final z0 b(A a10, kotlin.coroutines.e eVar, CoroutineStart coroutineStart, Ia.p pVar) {
        kotlin.coroutines.e eVarC = CoroutineContextKt.c(a10, eVar);
        coroutineStart.getClass();
        z0 p0Var = coroutineStart == CoroutineStart.f43167c ? new p0(eVarC, pVar) : new z0(eVarC, true, true);
        p0Var.v0(coroutineStart, p0Var, pVar);
        return p0Var;
    }

    public static /* synthetic */ z0 c(A a10, kotlin.coroutines.e eVar, CoroutineStart coroutineStart, Ia.p pVar, int i10) {
        if ((i10 & 1) != 0) {
            eVar = EmptyCoroutineContext.f43032b;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.f43166b;
        }
        return b(a10, eVar, coroutineStart, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T d(kotlin.coroutines.e eVar, Ia.p<? super A, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar) throws Throwable {
        U uA;
        kotlin.coroutines.e eVarA;
        Thread threadCurrentThread = Thread.currentThread();
        kotlin.coroutines.d.a aVar = kotlin.coroutines.d.a.f43035b;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) eVar.get(aVar);
        if (dVar == null) {
            uA = D0.a();
            eVarA = CoroutineContextKt.a(EmptyCoroutineContext.f43032b, eVar.plus(uA), true);
            Sa.b bVar = N.f43198a;
            if (eVarA != bVar && eVarA.get(aVar) == null) {
                eVarA = eVarA.plus(bVar);
            }
        } else {
            if (dVar instanceof U) {
            }
            uA = D0.f43172a.get();
            eVarA = CoroutineContextKt.a(EmptyCoroutineContext.f43032b, eVar, true);
            Sa.b bVar2 = N.f43198a;
            if (eVarA != bVar2 && eVarA.get(aVar) == null) {
                eVarA = eVarA.plus(bVar2);
            }
        }
        C2676c c2676c = new C2676c(eVarA, threadCurrentThread, uA);
        c2676c.v0(CoroutineStart.f43166b, c2676c, pVar);
        U u10 = c2676c.f43236f;
        if (u10 != null) {
            int i10 = U.f43206f;
            u10.f1(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jH1 = u10 != null ? u10.h1() : Long.MAX_VALUE;
                if (c2676c.I0()) {
                    if (u10 != null) {
                        int i11 = U.f43206f;
                        u10.d1(false);
                    }
                    T t8 = (T) o0.a(c2676c.W());
                    C2708s c2708s = t8 instanceof C2708s ? (C2708s) t8 : null;
                    if (c2708s == null) {
                        return t8;
                    }
                    throw c2708s.f43531a;
                }
                LockSupport.parkNanos(c2676c, jH1);
            } catch (Throwable th) {
                if (u10 != null) {
                    int i12 = U.f43206f;
                    u10.d1(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c2676c.E(interruptedException);
        throw interruptedException;
    }

    public static final <T> Object f(kotlin.coroutines.e eVar, Ia.p<? super A, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, kotlin.coroutines.c<? super T> cVar) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        Object objA;
        kotlin.coroutines.e context = cVar.getContext();
        kotlin.coroutines.e eVarPlus = !((Boolean) eVar.fold(Boolean.FALSE, CoroutineContextKt$hasCopyableElements$1.f43164h)).booleanValue() ? context.plus(eVar) : CoroutineContextKt.a(context, eVar, false);
        C2702l0.e(eVarPlus);
        if (eVarPlus == context) {
            kotlinx.coroutines.internal.u uVar = new kotlinx.coroutines.internal.u(cVar, eVarPlus);
            objA = com.google.android.gms.internal.measurement.Y.l(uVar, uVar, pVar);
        } else {
            kotlin.coroutines.d.a aVar = kotlin.coroutines.d.a.f43035b;
            if (kotlin.jvm.internal.i.a(eVarPlus.get(aVar), context.get(aVar))) {
                I0 i10 = new I0(cVar, eVarPlus);
                kotlin.coroutines.e eVar2 = i10.f43222d;
                Object objC = ThreadContextKt.c(eVar2, null);
                try {
                    Object objL = com.google.android.gms.internal.measurement.Y.l(i10, i10, pVar);
                    ThreadContextKt.a(eVar2, objC);
                    objA = objL;
                } catch (Throwable th) {
                    ThreadContextKt.a(eVar2, objC);
                    throw th;
                }
            } else {
                K k10 = new K(cVar, eVarPlus);
                p144l6.b.d(pVar, k10, k10);
                do {
                    atomicIntegerFieldUpdater = K.f43194f;
                    int i11 = atomicIntegerFieldUpdater.get(k10);
                    if (i11 != 0) {
                        if (i11 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objA = o0.a(k10.W());
                        if (objA instanceof C2708s) {
                            throw ((C2708s) objA).f43531a;
                        }
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(k10, 0, 1));
                objA = CoroutineSingletons.f43038b;
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objA;
    }
}
