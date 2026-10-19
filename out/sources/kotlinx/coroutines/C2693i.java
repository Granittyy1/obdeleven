package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: renamed from: kotlinx.coroutines.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes2.dex */
public class C2693i<T> extends L<T> implements InterfaceC2691h<T>, Aa.b, K0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43444g = AtomicIntegerFieldUpdater.newUpdater(C2693i.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43445h = AtomicReferenceFieldUpdater.newUpdater(C2693i.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43446i = AtomicReferenceFieldUpdater.newUpdater(C2693i.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlin.coroutines.c<T> f43447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlin.coroutines.e f43448f;

    public C2693i(int i10, kotlin.coroutines.c cVar) {
        super(i10);
        this.f43447e = cVar;
        this.f43448f = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C2674b.f43233b;
    }

    public static Object E(u0 u0Var, Object obj, int i10, Ia.l lVar) {
        if ((obj instanceof C2708s) || !A8.p.z(i10)) {
            return obj;
        }
        if (lVar != null || (u0Var instanceof InterfaceC2689g)) {
            return new r(obj, u0Var instanceof InterfaceC2689g ? (InterfaceC2689g) u0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void z(u0 u0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + u0Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        kotlin.coroutines.c<T> cVar = this.f43447e;
        Throwable th = null;
        kotlinx.coroutines.internal.h hVar = cVar instanceof kotlinx.coroutines.internal.h ? (kotlinx.coroutines.internal.h) cVar : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.h.f43475i;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                D3.l lVar = kotlinx.coroutines.internal.i.f43481b;
                if (obj != lVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, lVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(hVar) == lVar);
            }
            if (th == null) {
                return;
            }
            l();
            o(th);
        }
    }

    public final void C(int i10, Ia.l lVar, Object obj) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43445h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof u0)) {
                if (obj2 instanceof C2699k) {
                    C2699k c2699k = (C2699k) obj2;
                    c2699k.getClass();
                    if (C2699k.f43510c.compareAndSet(c2699k, 0, 1)) {
                        if (lVar != null) {
                            j(lVar, c2699k.f43531a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objE = E((u0) obj2, obj, i10, lVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                    if (!y()) {
                        l();
                    }
                    m(i10);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void D(AbstractC2712w abstractC2712w, p293xa.r rVar) {
        kotlin.coroutines.c<T> cVar = this.f43447e;
        kotlinx.coroutines.internal.h hVar = cVar instanceof kotlinx.coroutines.internal.h ? (kotlinx.coroutines.internal.h) cVar : null;
        C((hVar != null ? hVar.f43476e : null) == abstractC2712w ? 4 : this.f43195d, null, rVar);
    }

    @Override // kotlinx.coroutines.L
    public final void a(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43445h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof u0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C2708s) {
                return;
            }
            if (!(obj2 instanceof r)) {
                r rVar = new r(obj2, (InterfaceC2689g) null, (Ia.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, rVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            r rVar2 = (r) obj2;
            if (rVar2.f43529e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            r rVarA = r.a(rVar2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, rVarA)) {
                    InterfaceC2689g interfaceC2689g = rVar2.f43526b;
                    if (interfaceC2689g != null) {
                        i(interfaceC2689g, cancellationException);
                    }
                    Ia.l<Throwable, p293xa.r> lVar = rVar2.f43527c;
                    if (lVar != null) {
                        j(lVar, cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // kotlinx.coroutines.L
    public final kotlin.coroutines.c<T> b() {
        return this.f43447e;
    }

    @Override // kotlinx.coroutines.InterfaceC2691h
    public final boolean c() {
        return f43445h.get(this) instanceof u0;
    }

    @Override // kotlinx.coroutines.K0
    public final void d(kotlinx.coroutines.internal.v<?> vVar, int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f43444g;
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        v(vVar);
    }

    @Override // kotlinx.coroutines.L
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.L
    public final <T> T f(Object obj) {
        return obj instanceof r ? (T) ((r) obj).f43525a : obj;
    }

    @Override // Aa.b
    public final Aa.b getCallerFrame() {
        kotlin.coroutines.c<T> cVar = this.f43447e;
        if (cVar instanceof Aa.b) {
            return (Aa.b) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    public final kotlin.coroutines.e getContext() {
        return this.f43448f;
    }

    @Override // kotlinx.coroutines.L
    public final Object h() {
        return f43445h.get(this);
    }

    public final void i(InterfaceC2689g interfaceC2689g, Throwable th) {
        try {
            interfaceC2689g.a(th);
        } catch (Throwable th2) {
            C2714y.a(this.f43448f, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void j(Ia.l<? super Throwable, p293xa.r> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            C2714y.a(this.f43448f, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void k(kotlinx.coroutines.internal.v<?> vVar, Throwable th) {
        kotlin.coroutines.e eVar = this.f43448f;
        int i10 = f43444g.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            vVar.h(i10, eVar);
        } catch (Throwable th2) {
            C2714y.a(eVar, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43446i;
        P p10 = (P) atomicReferenceFieldUpdater.get(this);
        if (p10 == null) {
            return;
        }
        p10.dispose();
        atomicReferenceFieldUpdater.set(this, t0.f43613b);
    }

    public final void m(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f43444g;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z10 = i10 == 4;
                kotlin.coroutines.c<T> cVar = this.f43447e;
                if (z10 || !(cVar instanceof kotlinx.coroutines.internal.h) || A8.p.z(i10) != A8.p.z(this.f43195d)) {
                    A8.p.C(this, cVar, z10);
                    return;
                }
                AbstractC2712w abstractC2712w = ((kotlinx.coroutines.internal.h) cVar).f43476e;
                kotlin.coroutines.e context = ((kotlinx.coroutines.internal.h) cVar).f43477f.getContext();
                if (abstractC2712w.b1(context)) {
                    abstractC2712w.Z0(context, this);
                    return;
                }
                U uA = D0.a();
                if (uA.g1()) {
                    uA.e1(this);
                    return;
                }
                uA.f1(true);
                try {
                    A8.p.C(this, cVar, true);
                    do {
                    } while (uA.i1());
                } catch (Throwable th) {
                    try {
                        g(th, null);
                    } finally {
                        uA.d1(true);
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public Throwable n(JobSupport jobSupport) {
        return jobSupport.M();
    }

    @Override // kotlinx.coroutines.InterfaceC2691h
    public final boolean o(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43445h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof u0)) {
                return false;
            }
            C2699k c2699k = new C2699k(this, th, (obj instanceof InterfaceC2689g) || (obj instanceof kotlinx.coroutines.internal.v));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c2699k)) {
                    u0 u0Var = (u0) obj;
                    if (u0Var instanceof InterfaceC2689g) {
                        i((InterfaceC2689g) obj, th);
                    } else if (u0Var instanceof kotlinx.coroutines.internal.v) {
                        k((kotlinx.coroutines.internal.v) obj, th);
                    }
                    if (!y()) {
                        l();
                    }
                    m(this.f43195d);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final Object p() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = f43444g;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zY) {
                    B();
                }
                Object obj = f43445h.get(this);
                if (obj instanceof C2708s) {
                    throw ((C2708s) obj).f43531a;
                }
                if (A8.p.z(this.f43195d)) {
                    InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) this.f43448f.get(InterfaceC2694i0.b.f43449b);
                    if (interfaceC2694i0 != null && !interfaceC2694i0.c()) {
                        CancellationException cancellationExceptionM = interfaceC2694i0.M();
                        a(obj, cancellationExceptionM);
                        throw cancellationExceptionM;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((P) f43446i.get(this)) == null) {
            t();
        }
        if (zY) {
            B();
        }
        return CoroutineSingletons.f43038b;
    }

    @Override // kotlinx.coroutines.InterfaceC2691h
    public final void q(T t8, Ia.l<? super Throwable, p293xa.r> lVar) {
        C(this.f43195d, lVar, t8);
    }

    @Override // kotlinx.coroutines.InterfaceC2691h
    public final D3.l r(Object obj, Ia.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43445h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z10 = obj2 instanceof u0;
            D3.l lVar2 = C2697j.f43509a;
            if (!z10) {
                boolean z11 = obj2 instanceof r;
                return null;
            }
            Object objE = E((u0) obj2, obj, this.f43195d, lVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objE)) {
                    if (y()) {
                        return lVar2;
                    }
                    l();
                    return lVar2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            obj = new C2708s(thA, false);
        }
        C(this.f43195d, null, obj);
    }

    public final void s() {
        P pT = t();
        if (pT != null && x()) {
            pT.dispose();
            f43446i.set(this, t0.f43613b);
        }
    }

    public final P t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC2694i0 interfaceC2694i0 = (InterfaceC2694i0) this.f43448f.get(InterfaceC2694i0.b.f43449b);
        if (interfaceC2694i0 == null) {
            return null;
        }
        P pG = C2702l0.g(interfaceC2694i0, true, new C2701l(this), 2);
        do {
            atomicReferenceFieldUpdater = f43446i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, pG)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return pG;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(A());
        sb2.append('(');
        sb2.append(C.v(this.f43447e));
        sb2.append("){");
        Object obj = f43445h.get(this);
        if (obj instanceof u0) {
            str = "Active";
        } else {
            str = obj instanceof C2699k ? "Cancelled" : "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(C.l(this));
        return sb2.toString();
    }

    public final void u(Ia.l<? super Throwable, p293xa.r> lVar) {
        v(new InterfaceC2689g.a(lVar));
    }

    public final void v(u0 u0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43445h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C2674b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, u0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof InterfaceC2689g ? true : obj instanceof kotlinx.coroutines.internal.v) {
                z(u0Var, obj);
                throw null;
            }
            if (obj instanceof C2708s) {
                C2708s c2708s = (C2708s) obj;
                c2708s.getClass();
                if (!C2708s.f43530b.compareAndSet(c2708s, 0, 1)) {
                    z(u0Var, obj);
                    throw null;
                }
                if (obj instanceof C2699k) {
                    if (!(obj instanceof C2708s)) {
                        c2708s = null;
                    }
                    Throwable th = c2708s != null ? c2708s.f43531a : null;
                    if (u0Var instanceof InterfaceC2689g) {
                        i((InterfaceC2689g) u0Var, th);
                        return;
                    } else {
                        kotlin.jvm.internal.i.c(u0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        k((kotlinx.coroutines.internal.v) u0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof r)) {
                if (u0Var instanceof kotlinx.coroutines.internal.v) {
                    return;
                }
                kotlin.jvm.internal.i.c(u0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                r rVar = new r(obj, (InterfaceC2689g) u0Var, (Ia.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            r rVar2 = (r) obj;
            if (rVar2.f43526b != null) {
                z(u0Var, obj);
                throw null;
            }
            if (u0Var instanceof kotlinx.coroutines.internal.v) {
                return;
            }
            kotlin.jvm.internal.i.c(u0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            InterfaceC2689g interfaceC2689g = (InterfaceC2689g) u0Var;
            Throwable th2 = rVar2.f43529e;
            if (th2 != null) {
                i(interfaceC2689g, th2);
                return;
            }
            r rVarA = r.a(rVar2, interfaceC2689g, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rVarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC2691h
    public final void w(Object obj) {
        m(this.f43195d);
    }

    public final boolean x() {
        return !(f43445h.get(this) instanceof u0);
    }

    public final boolean y() {
        if (this.f43195d == 2) {
            kotlin.coroutines.c<T> cVar = this.f43447e;
            kotlin.jvm.internal.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (kotlinx.coroutines.internal.h.f43475i.get((kotlinx.coroutines.internal.h) cVar) != null) {
                return true;
            }
        }
        return false;
    }
}
