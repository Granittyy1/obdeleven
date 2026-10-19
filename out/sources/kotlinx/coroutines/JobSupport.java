package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@p293xa.d
public class JobSupport implements InterfaceC2694i0, v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43184b = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43185c = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: compiled from: JobSupport.kt */
    public static final class a<T> extends C2693i<T> {
        public final JobSupport j;

        public a(kotlin.coroutines.c<? super T> cVar, JobSupport jobSupport) {
            super(1, cVar);
            this.j = jobSupport;
        }

        @Override // kotlinx.coroutines.C2693i
        public final String A() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.C2693i
        public final Throwable n(JobSupport jobSupport) {
            Throwable thB;
            Object objW = this.j.W();
            if (!(objW instanceof c) || (thB = ((c) objW).b()) == null) {
                return objW instanceof C2708s ? ((C2708s) objW).f43531a : jobSupport.M();
            }
            return thB;
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    public static final class b extends m0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final JobSupport f43186f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f43187g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final C2704n f43188h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Object f43189i;

        public b(JobSupport jobSupport, c cVar, C2704n c2704n, Object obj) {
            this.f43186f = jobSupport;
            this.f43187g = cVar;
            this.f43188h = c2704n;
            this.f43189i = obj;
        }

        @Override // kotlinx.coroutines.InterfaceC2681e0
        public final void a(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.f43184b;
            JobSupport jobSupport = this.f43186f;
            jobSupport.getClass();
            C2704n c2704nG0 = JobSupport.g0(this.f43188h);
            c cVar = this.f43187g;
            Object obj = this.f43189i;
            if (c2704nG0 != null) {
                while (C2702l0.g(c2704nG0.f43514f, false, new b(jobSupport, cVar, c2704nG0, obj), 1) == t0.f43613b) {
                    c2704nG0 = JobSupport.g0(c2704nG0);
                    if (c2704nG0 == null) {
                    }
                }
                return;
            }
            jobSupport.z(jobSupport.O(cVar, obj));
        }
    }

    /* JADX INFO: compiled from: JobSupport.kt */
    public static final class c implements InterfaceC2677c0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f43190c = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f43191d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f43192e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r0 f43193b;

        public c(r0 r0Var, Throwable th) {
            this.f43193b = r0Var;
            this._rootCause$volatile = th;
        }

        public final void a(Throwable th) {
            Throwable thB = b();
            if (thB == null) {
                f43191d.set(this, th);
                return;
            }
            if (th == thB) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43192e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }

        public final Throwable b() {
            return (Throwable) f43191d.get(this);
        }

        @Override // kotlinx.coroutines.InterfaceC2677c0
        public final boolean c() {
            return b() == null;
        }

        @Override // kotlinx.coroutines.InterfaceC2677c0
        public final r0 d() {
            return this.f43193b;
        }

        public final boolean e() {
            return b() != null;
        }

        public final boolean f() {
            return f43190c.get(this) != 0;
        }

        public final ArrayList g(Throwable th) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43192e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable thB = b();
            if (thB != null) {
                arrayList.add(0, thB);
            }
            if (th != null && !th.equals(thB)) {
                arrayList.add(th);
            }
            atomicReferenceFieldUpdater.set(this, o0.f43521e);
            return arrayList;
        }

        public final String toString() {
            return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + b() + ", exceptions=" + f43192e.get(this) + ", list=" + this.f43193b + ']';
        }
    }

    public JobSupport(boolean z10) {
        this._state$volatile = z10 ? o0.f43523g : o0.f43522f;
    }

    public static C2704n g0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.i()) {
            LockFreeLinkedListNode lockFreeLinkedListNodeE = lockFreeLinkedListNode.e();
            if (lockFreeLinkedListNodeE == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f43456c;
                Object obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
                while (true) {
                    lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
                    if (!lockFreeLinkedListNode.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
                }
            } else {
                lockFreeLinkedListNode = lockFreeLinkedListNodeE;
            }
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.h();
            if (!lockFreeLinkedListNode.i()) {
                if (lockFreeLinkedListNode instanceof C2704n) {
                    return (C2704n) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof r0) {
                    return null;
                }
            }
        }
    }

    public static String p0(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof InterfaceC2677c0) {
                return ((InterfaceC2677c0) obj).c() ? "Active" : "New";
            }
            return obj instanceof C2708s ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        if (cVar.e()) {
            return "Cancelling";
        }
        return cVar.f() ? "Completing" : "Active";
    }

    public void A(Object obj) {
        z(obj);
    }

    @Override // kotlinx.coroutines.v0
    public final CancellationException A0() {
        Throwable thB;
        Object objW = W();
        if (objW instanceof c) {
            thB = ((c) objW).b();
        } else if (objW instanceof C2708s) {
            thB = ((C2708s) objW).f43531a;
        } else {
            if (objW instanceof InterfaceC2677c0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objW).toString());
            }
            thB = null;
        }
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(p0(objW)), thB, this) : cancellationException;
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final P B(Ia.l<? super Throwable, p293xa.r> lVar) {
        return a0(false, true, new InterfaceC2681e0.a(lVar));
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final Object C(ContinuationImpl continuationImpl) {
        Object objW;
        do {
            objW = W();
            if (!(objW instanceof InterfaceC2677c0)) {
                C2702l0.e(continuationImpl.getContext());
                return p293xa.r.f47939a;
            }
        } while (o0(objW) < 0);
        C2693i c2693i = new C2693i(1, A8.p.y(continuationImpl));
        c2693i.s();
        c2693i.v(new Q(C2702l0.g(this, false, new x0(c2693i), 3)));
        Object objP = c2693i.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (objP != coroutineSingletons) {
            objP = p293xa.r.f47939a;
        }
        return objP == coroutineSingletons ? objP : p293xa.r.f47939a;
    }

    public final Object D(kotlin.coroutines.c<Object> cVar) {
        Object objW;
        do {
            objW = W();
            if (!(objW instanceof InterfaceC2677c0)) {
                if (objW instanceof C2708s) {
                    throw ((C2708s) objW).f43531a;
                }
                return o0.a(objW);
            }
        } while (o0(objW) < 0);
        a aVar = new a(A8.p.y(cVar), this);
        aVar.s();
        aVar.v(new Q(C2702l0.g(this, false, new w0(aVar), 3)));
        Object objP = aVar.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        return objP;
    }

    public final boolean E(Object obj) {
        D3.l lVar;
        Object objQ0 = o0.f43517a;
        if (T()) {
            do {
                Object objW = W();
                if (!(objW instanceof InterfaceC2677c0) || ((objW instanceof c) && ((c) objW).f())) {
                    objQ0 = o0.f43517a;
                    break;
                }
                objQ0 = q0(objW, new C2708s(L(obj), false));
            } while (objQ0 == o0.f43519c);
            if (objQ0 == o0.f43518b) {
                return true;
            }
        }
        if (objQ0 == o0.f43517a) {
            Throwable thL = null;
            loop1: while (true) {
                Object objW2 = W();
                if (objW2 instanceof c) {
                    synchronized (objW2) {
                        try {
                            c cVar = (c) objW2;
                            cVar.getClass();
                            if (c.f43192e.get(cVar) == o0.f43521e) {
                                lVar = o0.f43520d;
                            } else {
                                boolean zE = ((c) objW2).e();
                                if (obj != null || !zE) {
                                    if (thL == null) {
                                        thL = L(obj);
                                    }
                                    ((c) objW2).a(thL);
                                }
                                Throwable thB = zE ? null : ((c) objW2).b();
                                if (thB != null) {
                                    h0(((c) objW2).f43193b, thB);
                                }
                                lVar = o0.f43517a;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else if (objW2 instanceof InterfaceC2677c0) {
                    if (thL == null) {
                        thL = L(obj);
                    }
                    InterfaceC2677c0 interfaceC2677c0 = (InterfaceC2677c0) objW2;
                    if (interfaceC2677c0.c()) {
                        r0 r0VarV = V(interfaceC2677c0);
                        if (r0VarV == null) {
                            continue;
                        } else {
                            c cVar2 = new c(r0VarV, thL);
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43184b;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC2677c0, cVar2)) {
                                    h0(r0VarV, thL);
                                    lVar = o0.f43517a;
                                } else if (atomicReferenceFieldUpdater.get(this) != interfaceC2677c0) {
                                }
                            }
                        }
                    } else {
                        Object objQ1 = q0(objW2, new C2708s(thL, false));
                        if (objQ1 == o0.f43517a) {
                            throw new IllegalStateException(("Cannot happen in " + objW2).toString());
                        }
                        if (objQ1 != o0.f43519c) {
                            objQ0 = objQ1;
                            break;
                        }
                    }
                } else {
                    lVar = o0.f43520d;
                }
                objQ0 = lVar;
                break;
            }
        }
        if (objQ0 != o0.f43517a && objQ0 != o0.f43518b) {
            if (objQ0 == o0.f43520d) {
                return false;
            }
            z(objQ0);
        }
        return true;
    }

    public void F(CancellationException cancellationException) {
        E(cancellationException);
    }

    public final boolean G(Throwable th) {
        if (b0()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        InterfaceC2703m interfaceC2703m = (InterfaceC2703m) f43185c.get(this);
        if (interfaceC2703m == null || interfaceC2703m == t0.f43613b) {
            return z10;
        }
        return interfaceC2703m.b(th) || z10;
    }

    public String H() {
        return "Job was cancelled";
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final boolean I0() {
        return !(W() instanceof InterfaceC2677c0);
    }

    public boolean J(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return E(th) && Q();
    }

    public final void K(InterfaceC2677c0 interfaceC2677c0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43185c;
        InterfaceC2703m interfaceC2703m = (InterfaceC2703m) atomicReferenceFieldUpdater.get(this);
        if (interfaceC2703m != null) {
            interfaceC2703m.dispose();
            atomicReferenceFieldUpdater.set(this, t0.f43613b);
        }
        CompletionHandlerException completionHandlerException = null;
        C2708s c2708s = obj instanceof C2708s ? (C2708s) obj : null;
        Throwable th = c2708s != null ? c2708s.f43531a : null;
        if (interfaceC2677c0 instanceof m0) {
            try {
                ((m0) interfaceC2677c0).a(th);
                return;
            } catch (Throwable th2) {
                Y(new CompletionHandlerException("Exception in completion handler " + interfaceC2677c0 + " for " + this, th2));
                return;
            }
        }
        r0 r0VarD = interfaceC2677c0.d();
        if (r0VarD != null) {
            Object objG = r0VarD.g();
            kotlin.jvm.internal.i.c(objG, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (LockFreeLinkedListNode lockFreeLinkedListNodeH = (LockFreeLinkedListNode) objG; !lockFreeLinkedListNodeH.equals(r0VarD); lockFreeLinkedListNodeH = lockFreeLinkedListNodeH.h()) {
                if (lockFreeLinkedListNodeH instanceof m0) {
                    m0 m0Var = (m0) lockFreeLinkedListNodeH;
                    try {
                        m0Var.a(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            D2.V.e(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + m0Var + " for " + this, th3);
                            p293xa.r rVar = p293xa.r.f47939a;
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                Y(completionHandlerException);
            }
        }
    }

    public final Throwable L(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(H(), null, this) : th;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((v0) obj).A0();
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final CancellationException M() {
        CancellationException cancellationException;
        Object objW = W();
        if (!(objW instanceof c)) {
            if (objW instanceof InterfaceC2677c0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objW instanceof C2708s)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C2708s) objW).f43531a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new JobCancellationException(H(), th, this) : cancellationException;
        }
        Throwable thB = ((c) objW).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = H();
        }
        return new JobCancellationException(strConcat, thB, this);
    }

    public final Object O(c cVar, Object obj) {
        Throwable thP;
        C2708s c2708s = obj instanceof C2708s ? (C2708s) obj : null;
        Throwable th = c2708s != null ? c2708s.f43531a : null;
        synchronized (cVar) {
            cVar.e();
            ArrayList<Throwable> arrayListG = cVar.g(th);
            thP = P(cVar, arrayListG);
            if (thP != null && arrayListG.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                for (Throwable th2 : arrayListG) {
                    if (th2 != thP && th2 != thP && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        D2.V.e(thP, th2);
                    }
                }
            }
        }
        if (thP != null && thP != th) {
            obj = new C2708s(thP, false);
        }
        if (thP != null && (G(thP) || X(thP))) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C2708s.f43530b.compareAndSet((C2708s) obj, 0, 1);
        }
        k0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43184b;
        Object c2679d0 = obj instanceof InterfaceC2677c0 ? new C2679d0((InterfaceC2677c0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, c2679d0) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        K(cVar, obj);
        return obj;
    }

    public final Throwable P(c cVar, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (cVar.e()) {
                return new JobCancellationException(H(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean Q() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final InterfaceC2703m S(JobSupport jobSupport) {
        P pG = C2702l0.g(this, true, new C2704n(jobSupport), 2);
        kotlin.jvm.internal.i.c(pG, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC2703m) pG;
    }

    public boolean T() {
        return this instanceof C2706p;
    }

    public final r0 V(InterfaceC2677c0 interfaceC2677c0) {
        r0 r0VarD = interfaceC2677c0.d();
        if (r0VarD != null) {
            return r0VarD;
        }
        if (interfaceC2677c0 instanceof T) {
            return new r0();
        }
        if (interfaceC2677c0 instanceof m0) {
            m0((m0) interfaceC2677c0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC2677c0).toString());
    }

    public final Object W() {
        while (true) {
            Object obj = f43184b.get(this);
            if (!(obj instanceof kotlinx.coroutines.internal.r)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.r) obj).a(this);
        }
    }

    public boolean X(Throwable th) {
        return false;
    }

    public final void Z(InterfaceC2694i0 interfaceC2694i0) {
        t0 t0Var = t0.f43613b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43185c;
        if (interfaceC2694i0 == null) {
            atomicReferenceFieldUpdater.set(this, t0Var);
            return;
        }
        interfaceC2694i0.start();
        InterfaceC2703m interfaceC2703mS = interfaceC2694i0.S(this);
        atomicReferenceFieldUpdater.set(this, interfaceC2703mS);
        if (I0()) {
            interfaceC2703mS.dispose();
            atomicReferenceFieldUpdater.set(this, t0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:98:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00c8 A[SYNTHETIC] */
    public final P a0(boolean z10, boolean z11, InterfaceC2681e0 interfaceC2681e0) {
        m0 c2692h0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thB;
        if (z10) {
            c2692h0 = interfaceC2681e0 instanceof AbstractC2698j0 ? (AbstractC2698j0) interfaceC2681e0 : null;
            if (c2692h0 == null) {
                c2692h0 = new C2690g0(interfaceC2681e0);
            }
        } else {
            c2692h0 = interfaceC2681e0 instanceof m0 ? (m0) interfaceC2681e0 : null;
            if (c2692h0 == null) {
                c2692h0 = new C2692h0(interfaceC2681e0);
            }
        }
        c2692h0.f43513e = this;
        while (true) {
            Object objW = W();
            if (objW instanceof T) {
                T t8 = (T) objW;
                if (t8.f43204b) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43184b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, objW, c2692h0)) {
                        if (atomicReferenceFieldUpdater2.get(this) != objW) {
                        }
                    }
                    return c2692h0;
                }
                r0 r0Var = new r0();
                InterfaceC2677c0 c2675b0 = t8.f43204b ? r0Var : new C2675b0(r0Var);
                do {
                    atomicReferenceFieldUpdater = f43184b;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, t8, c2675b0)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == t8);
            } else {
                if (!(objW instanceof InterfaceC2677c0)) {
                    if (z11) {
                        C2708s c2708s = objW instanceof C2708s ? (C2708s) objW : null;
                        interfaceC2681e0.a(c2708s != null ? c2708s.f43531a : null);
                    }
                    return t0.f43613b;
                }
                r0 r0VarD = ((InterfaceC2677c0) objW).d();
                if (r0VarD == null) {
                    kotlin.jvm.internal.i.c(objW, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m0((m0) objW);
                } else {
                    P p10 = t0.f43613b;
                    if (z10 && (objW instanceof c)) {
                        synchronized (objW) {
                            try {
                                thB = ((c) objW).b();
                                if (thB == null || ((interfaceC2681e0 instanceof C2704n) && !((c) objW).f())) {
                                    if (y((InterfaceC2677c0) objW, r0VarD, c2692h0)) {
                                        if (thB == null) {
                                            return c2692h0;
                                        }
                                        p10 = c2692h0;
                                    }
                                }
                                p293xa.r rVar = p293xa.r.f47939a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thB != null) {
                            if (z11) {
                                interfaceC2681e0.a(thB);
                            }
                            return p10;
                        }
                        if (y((InterfaceC2677c0) objW, r0VarD, c2692h0)) {
                            return c2692h0;
                        }
                    } else {
                        thB = null;
                        if (thB != null) {
                            if (z11) {
                                interfaceC2681e0.a(thB);
                            }
                            return p10;
                        }
                        if (y((InterfaceC2677c0) objW, r0VarD, c2692h0)) {
                            return c2692h0;
                        }
                    }
                }
            }
        }
    }

    public boolean b0() {
        return this instanceof C2676c;
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public boolean c() {
        Object objW = W();
        return (objW instanceof InterfaceC2677c0) && ((InterfaceC2677c0) objW).c();
    }

    public final boolean c0(Object obj) {
        Object objQ0;
        do {
            objQ0 = q0(W(), obj);
            if (objQ0 == o0.f43517a) {
                return false;
            }
            if (objQ0 == o0.f43518b) {
                return true;
            }
        } while (objQ0 == o0.f43519c);
        z(objQ0);
        return true;
    }

    public final Object d0(Object obj) {
        Object objQ0;
        do {
            objQ0 = q0(W(), obj);
            if (objQ0 == o0.f43517a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C2708s c2708s = obj instanceof C2708s ? (C2708s) obj : null;
                throw new IllegalStateException(str, c2708s != null ? c2708s.f43531a : null);
            }
        } while (objQ0 == o0.f43519c);
        return objQ0;
    }

    public String e0() {
        return getClass().getSimpleName();
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final P f0(boolean z10, boolean z11, Ia.l<? super Throwable, p293xa.r> lVar) {
        return a0(z10, z11, new InterfaceC2681e0.a(lVar));
    }

    @Override // kotlin.coroutines.e
    public final <R> R fold(R r10, Ia.p<? super R, ? super kotlin.coroutines.e.a, ? extends R> pVar) {
        return (R) kotlin.coroutines.e.a.C0479a.a(this, r10, pVar);
    }

    @Override // kotlin.coroutines.e
    public final <E extends kotlin.coroutines.e.a> E get(kotlin.coroutines.e.b<E> bVar) {
        return (E) kotlin.coroutines.e.a.C0479a.b(this, bVar);
    }

    @Override // kotlin.coroutines.e.a
    public final kotlin.coroutines.e.b<?> getKey() {
        return InterfaceC2694i0.b.f43449b;
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final InterfaceC2694i0 getParent() {
        InterfaceC2703m interfaceC2703m = (InterfaceC2703m) f43185c.get(this);
        if (interfaceC2703m != null) {
            return interfaceC2703m.getParent();
        }
        return null;
    }

    public final void h0(r0 r0Var, Throwable th) {
        Object objG = r0Var.g();
        kotlin.jvm.internal.i.c(objG, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeH = (LockFreeLinkedListNode) objG; !lockFreeLinkedListNodeH.equals(r0Var); lockFreeLinkedListNodeH = lockFreeLinkedListNodeH.h()) {
            if (lockFreeLinkedListNodeH instanceof AbstractC2698j0) {
                m0 m0Var = (m0) lockFreeLinkedListNodeH;
                try {
                    m0Var.a(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        D2.V.e(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + m0Var + " for " + this, th2);
                        p293xa.r rVar = p293xa.r.f47939a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            Y(completionHandlerException);
        }
        G(th);
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public void i(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(H(), null, this);
        }
        F(cancellationException);
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final boolean isCancelled() {
        Object objW = W();
        return (objW instanceof C2708s) || ((objW instanceof c) && ((c) objW).e());
    }

    public final void m0(m0 m0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        r0 r0Var = new r0();
        m0Var.getClass();
        LockFreeLinkedListNode.f43456c.set(r0Var, m0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode.f43455b;
        atomicReferenceFieldUpdater2.set(r0Var, m0Var);
        loop0: while (m0Var.g() == m0Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(m0Var, m0Var, r0Var)) {
                    r0Var.f(m0Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(m0Var) == m0Var);
        }
        LockFreeLinkedListNode lockFreeLinkedListNodeH = m0Var.h();
        do {
            atomicReferenceFieldUpdater = f43184b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, m0Var, lockFreeLinkedListNodeH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == m0Var);
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.e minusKey(kotlin.coroutines.e.b<?> bVar) {
        return kotlin.coroutines.e.a.C0479a.c(this, bVar);
    }

    public final int o0(Object obj) {
        boolean z10 = obj instanceof T;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43184b;
        if (z10) {
            if (((T) obj).f43204b) {
                return 0;
            }
            T t8 = o0.f43523g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, t8)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            l0();
            return 1;
        }
        if (!(obj instanceof C2675b0)) {
            return 0;
        }
        r0 r0Var = ((C2675b0) obj).f43234b;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, r0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        l0();
        return 1;
    }

    @Override // kotlin.coroutines.e
    public final kotlin.coroutines.e plus(kotlin.coroutines.e eVar) {
        return kotlin.coroutines.e.a.C0479a.d(this, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, java.lang.Throwable] */
    public final Object q0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC2677c0)) {
            return o0.f43517a;
        }
        C2704n c2704nG0 = null;
        if (((obj instanceof T) || (obj instanceof m0)) && !(obj instanceof C2704n) && !(obj2 instanceof C2708s)) {
            InterfaceC2677c0 interfaceC2677c0 = (InterfaceC2677c0) obj;
            Object c2679d0 = obj2 instanceof InterfaceC2677c0 ? new C2679d0((InterfaceC2677c0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f43184b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC2677c0, c2679d0)) {
                    k0(obj2);
                    K(interfaceC2677c0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC2677c0);
            return o0.f43519c;
        }
        InterfaceC2677c0 interfaceC2677c1 = (InterfaceC2677c0) obj;
        r0 r0VarV = V(interfaceC2677c1);
        if (r0VarV == null) {
            return o0.f43519c;
        }
        c cVar = interfaceC2677c1 instanceof c ? (c) interfaceC2677c1 : null;
        if (cVar == null) {
            cVar = new c(r0VarV, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (cVar) {
            try {
                if (cVar.f()) {
                    return o0.f43517a;
                }
                c.f43190c.set(cVar, 1);
                if (cVar != interfaceC2677c1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43184b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC2677c1, cVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC2677c1) {
                            return o0.f43519c;
                        }
                    }
                }
                boolean zE = cVar.e();
                C2708s c2708s = obj2 instanceof C2708s ? (C2708s) obj2 : null;
                if (c2708s != null) {
                    cVar.a(c2708s.f43531a);
                }
                ?? B10 = !zE ? cVar.b() : 0;
                ref$ObjectRef.element = B10;
                p293xa.r rVar = p293xa.r.f47939a;
                if (B10 != 0) {
                    h0(r0VarV, B10);
                }
                C2704n c2704n = interfaceC2677c1 instanceof C2704n ? (C2704n) interfaceC2677c1 : null;
                if (c2704n == null) {
                    r0 r0VarD = interfaceC2677c1.d();
                    if (r0VarD != null) {
                        c2704nG0 = g0(r0VarD);
                    }
                } else {
                    c2704nG0 = c2704n;
                }
                if (c2704nG0 != null) {
                    while (C2702l0.g(c2704nG0.f43514f, false, new b(this, cVar, c2704nG0, obj2), 1) == t0.f43613b) {
                        c2704nG0 = g0(c2704nG0);
                        if (c2704nG0 == null) {
                        }
                    }
                    return o0.f43518b;
                }
                return O(cVar, obj2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean r0(Object obj) {
        return c0(obj);
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final boolean start() {
        int iO0;
        do {
            iO0 = o0(W());
            if (iO0 == 0) {
                return false;
            }
        } while (iO0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e0() + '{' + p0(W()) + '}');
        sb2.append('@');
        sb2.append(C.l(this));
        return sb2.toString();
    }

    @Override // kotlinx.coroutines.InterfaceC2694i0
    public final kotlin.sequences.g<InterfaceC2694i0> x() {
        return new kotlin.sequences.j(new JobSupport$children$1(null, this));
    }

    public final boolean y(InterfaceC2677c0 interfaceC2677c0, r0 r0Var, m0 m0Var) {
        char c10;
        n0 n0Var = new n0(m0Var, this, interfaceC2677c0);
        do {
            LockFreeLinkedListNode lockFreeLinkedListNodeE = r0Var.e();
            if (lockFreeLinkedListNodeE == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f43456c;
                Object obj = atomicReferenceFieldUpdater.get(r0Var);
                while (true) {
                    lockFreeLinkedListNodeE = (LockFreeLinkedListNode) obj;
                    if (!lockFreeLinkedListNodeE.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNodeE);
                }
            }
            LockFreeLinkedListNode.f43456c.set(m0Var, lockFreeLinkedListNodeE);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode.f43455b;
            atomicReferenceFieldUpdater2.set(m0Var, r0Var);
            n0Var.f43459c = r0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNodeE, r0Var, n0Var)) {
                    if (n0Var.a(lockFreeLinkedListNodeE) != null) {
                        c10 = 2;
                        break;
                    }
                    c10 = 1;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(lockFreeLinkedListNodeE) != r0Var) {
                    c10 = 0;
                    break;
                }
            }
            if (c10 == 1) {
                return true;
            }
        } while (c10 != 2);
        return false;
    }

    public void l0() {
    }

    public void Y(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public void i0(Throwable th) {
    }

    public void k0(Object obj) {
    }

    public void z(Object obj) {
    }
}
