package kotlinx.coroutines.selects;

import D3.l;
import Ia.p;
import Ia.q;
import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.InterfaceC2689g;
import kotlinx.coroutines.InterfaceC2691h;
import kotlinx.coroutines.K0;
import kotlinx.coroutines.P;
import kotlinx.coroutines.internal.v;
import p293xa.r;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d<R> implements InterfaceC2689g, e, K0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43575g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.coroutines.e f43576b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f43578d;
    private volatile /* synthetic */ Object state$volatile = SelectKt.f43559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f43577c = new ArrayList(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43579e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f43580f = SelectKt.f43562e;

    /* JADX INFO: compiled from: Select.kt */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f43581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q<Object, e<?>, Object, r> f43582b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q<Object, Object, Object, Object> f43583c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l f43584d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final p293xa.e f43585e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final q<e<?>, Object, Object, Ia.l<Throwable, r>> f43586f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f43587g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f43588h = -1;

        public a(Object obj, q qVar, q qVar2, l lVar, p293xa.e eVar, q qVar3) {
            this.f43581a = obj;
            this.f43582b = qVar;
            this.f43583c = qVar2;
            this.f43584d = lVar;
            this.f43585e = eVar;
            this.f43586f = qVar3;
        }

        public final void a() {
            Object obj = this.f43587g;
            if (obj instanceof v) {
                ((v) obj).h(this.f43588h, d.this.f43576b);
                return;
            }
            P p10 = obj instanceof P ? (P) obj : null;
            if (p10 != null) {
                p10.dispose();
            }
        }
    }

    public d(kotlin.coroutines.e eVar) {
        this.f43576b = eVar;
    }

    @Override // kotlinx.coroutines.InterfaceC2689g
    public final void a(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43575g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.f43560c) {
                return;
            }
            l lVar = SelectKt.f43561d;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                    ArrayList arrayList = this.f43577c;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a();
                    }
                    this.f43580f = SelectKt.f43562e;
                    this.f43577c = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // kotlinx.coroutines.selects.e
    public final void b(P p10) {
        this.f43578d = p10;
    }

    @Override // kotlinx.coroutines.selects.e
    public final boolean c(Object obj, Object obj2) {
        return k(obj, obj2) == 0;
    }

    @Override // kotlinx.coroutines.K0
    public final void d(v<?> vVar, int i10) {
        this.f43578d = vVar;
        this.f43579e = i10;
    }

    @Override // kotlinx.coroutines.selects.e
    public final void e(Object obj) {
        this.f43580f = obj;
    }

    public final Object f(ContinuationImpl continuationImpl) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43575g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.f43580f;
        ArrayList<a> arrayList = this.f43577c;
        if (arrayList != null) {
            for (a aVar2 : arrayList) {
                if (aVar2 != aVar) {
                    aVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, SelectKt.f43560c);
            this.f43580f = SelectKt.f43562e;
            this.f43577c = null;
        }
        Object objInvoke = aVar.f43583c.invoke(aVar.f43581a, aVar.f43584d, obj2);
        aVar.getClass();
        l lVar = SelectKt.f43563f;
        p293xa.e eVar = aVar.f43585e;
        return aVar.f43584d == lVar ? ((Ia.l) eVar).invoke(continuationImpl) : ((p) eVar).invoke(objInvoke, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ContinuationImpl continuationImpl) {
        SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1;
        d<R> dVar;
        if (continuationImpl instanceof SelectImplementation$doSelectSuspend$1) {
            selectImplementation$doSelectSuspend$1 = (SelectImplementation$doSelectSuspend$1) continuationImpl;
            int i10 = selectImplementation$doSelectSuspend$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                selectImplementation$doSelectSuspend$1.label = i10 - Integer.MIN_VALUE;
            } else {
                selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuationImpl);
            }
        } else {
            selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuationImpl);
        }
        Object objF = selectImplementation$doSelectSuspend$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = selectImplementation$doSelectSuspend$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                dVar = (d) selectImplementation$doSelectSuspend$1.L$0;
                kotlin.b.b(objF);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objF);
            }
        }
        kotlin.b.b(objF);
        selectImplementation$doSelectSuspend$1.L$0 = this;
        selectImplementation$doSelectSuspend$1.label = 1;
        C2693i c2693i = new C2693i(1, A8.p.y(selectImplementation$doSelectSuspend$1));
        c2693i.s();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43575g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            l lVar = SelectKt.f43559b;
            if (obj == lVar) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c2693i)) {
                        c2693i.v(this);
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            } else {
                if (!(obj instanceof List)) {
                    if (!(obj instanceof a)) {
                        throw new IllegalStateException(("unexpected state: " + obj).toString());
                    }
                    r rVar = r.f47939a;
                    a aVar = (a) obj;
                    Object obj2 = this.f43580f;
                    q<e<?>, Object, Object, Ia.l<Throwable, r>> qVar = aVar.f43586f;
                    c2693i.q(rVar, qVar != null ? qVar.invoke(this, aVar.f43584d, obj2) : null);
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                        Iterator it = ((Iterable) obj).iterator();
                        while (it.hasNext()) {
                            d<R>.a aVarH = h(it.next());
                            i.b(aVarH);
                            aVarH.f43587g = null;
                            aVarH.f43588h = -1;
                            j(aVarH, true);
                        }
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        Object objP = c2693i.p();
        if (objP != CoroutineSingletons.f43038b) {
            objP = r.f47939a;
        }
        if (objP == coroutineSingletons) {
            return coroutineSingletons;
        }
        dVar = this;
        selectImplementation$doSelectSuspend$1.L$0 = null;
        selectImplementation$doSelectSuspend$1.label = 2;
        objF = dVar.f(selectImplementation$doSelectSuspend$1);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }

    @Override // kotlinx.coroutines.selects.e
    public final kotlin.coroutines.e getContext() {
        return this.f43576b;
    }

    public final d<R>.a h(Object obj) {
        ArrayList arrayList = this.f43577c;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((a) obj3).f43581a == obj) {
                obj2 = obj3;
                break;
            }
        }
        d<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final <Q> void i(c cVar, p<? super Q, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar) {
        j(new a(cVar.f43571a, cVar.b(), cVar.a(), null, pVar, cVar.f43574d), false);
    }

    public final void j(d<R>.a aVar, boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43575g;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        Object obj = aVar.f43581a;
        if (!z10) {
            ArrayList arrayList = this.f43577c;
            i.b(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((a) it.next()).f43581a == obj) {
                        throw new IllegalStateException(coil.intercept.a.a(obj, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        aVar.f43582b.invoke(obj, this, aVar.f43584d);
        if (this.f43580f != SelectKt.f43562e) {
            atomicReferenceFieldUpdater.set(this, aVar);
            return;
        }
        if (!z10) {
            ArrayList arrayList2 = this.f43577c;
            i.b(arrayList2);
            arrayList2.add(aVar);
        }
        aVar.f43587g = this.f43578d;
        aVar.f43588h = this.f43579e;
        this.f43578d = null;
        this.f43579e = -1;
    }

    public final int k(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43575g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            boolean z10 = false;
            if (obj3 instanceof InterfaceC2691h) {
                d<R>.a aVarH = h(obj);
                if (aVarH != null) {
                    q<e<?>, Object, Object, Ia.l<Throwable, r>> qVar = aVarH.f43586f;
                    Ia.l<Throwable, r> lVarInvoke = qVar != null ? qVar.invoke(this, aVarH.f43584d, obj2) : null;
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, aVarH)) {
                            InterfaceC2691h interfaceC2691h = (InterfaceC2691h) obj3;
                            this.f43580f = obj2;
                            q<Object, Object, Object, Object> qVar2 = SelectKt.f43558a;
                            l lVarR = interfaceC2691h.r(r.f47939a, lVarInvoke);
                            if (lVarR == null) {
                                this.f43580f = SelectKt.f43562e;
                                return 2;
                            }
                            interfaceC2691h.w(lVarR);
                            return 0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                } else {
                    continue;
                }
            } else {
                if (i.a(obj3, SelectKt.f43560c) ? true : obj3 instanceof a) {
                    return 3;
                }
                if (i.a(obj3, SelectKt.f43561d)) {
                    return 2;
                }
                if (i.a(obj3, SelectKt.f43559b)) {
                    List listK = M1.k(obj);
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, listK)) {
                            z10 = true;
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                    if (z10) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    ArrayList arrayListD0 = kotlin.collections.q.d0((Collection) obj3, obj);
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListD0)) {
                            z10 = true;
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                    if (z10) {
                        return 1;
                    }
                }
            }
        }
    }
}
