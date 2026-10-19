package androidx.compose.runtime;

import android.util.Log;
import androidx.collection.ObjectList;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotKt;
import com.braze.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.C2693i;
import kotlinx.coroutines.C2700k0;
import kotlinx.coroutines.InterfaceC2691h;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.StateFlowImpl;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Recomposer extends AbstractC1094k {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final StateFlowImpl f12889x = kotlinx.coroutines.flow.B.a(F.b.f3174e);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AtomicReference<Boolean> f12890y = new AtomicReference<>(Boolean.FALSE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BroadcastFrameClock f12891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2694i0 f12893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f12894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f12895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f12896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.collection.L<Object> f12897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c<InterfaceC1115w> f12898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f12899i;
    public final ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.collection.K<Object, Object> f12900k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final NestedContentMap f12901l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final androidx.collection.K<T, S> f12902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.collection.K<Object, Object> f12903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f12904o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinkedHashSet f12905p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C2693i f12906q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f12907r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12908s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final StateFlowImpl f12909t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C2700k0 f12910u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final kotlin.coroutines.e f12911v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f12912w;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Recomposer.kt */
    public static final class State {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final State f12913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final State f12914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final State f12915d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final State f12916e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final State f12917f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final State f12918g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ State[] f12919h;

        static {
            State state = new State("ShutDown", 0);
            f12913b = state;
            State state2 = new State("ShuttingDown", 1);
            f12914c = state2;
            State state3 = new State("Inactive", 2);
            f12915d = state3;
            State state4 = new State("InactivePendingWork", 3);
            f12916e = state4;
            State state5 = new State("Idle", 4);
            f12917f = state5;
            State state6 = new State("PendingWork", 5);
            f12918g = state6;
            State[] stateArr = {state, state2, state3, state4, state5, state6};
            f12919h = stateArr;
            kotlin.enums.a.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f12919h.clone();
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    public static final class a {
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f12920a;

        public b(Throwable th) {
            this.f12920a = th;
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    public final class c {
    }

    public Recomposer(kotlin.coroutines.e eVar) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Recomposer$broadcastFrameClock$1(this));
        this.f12891a = broadcastFrameClock;
        this.f12892b = new Object();
        this.f12895e = new ArrayList();
        this.f12897g = new androidx.collection.L<>((Object) null);
        this.f12898h = new androidx.compose.runtime.collection.c<>(new InterfaceC1115w[16]);
        this.f12899i = new ArrayList();
        this.j = new ArrayList();
        this.f12900k = androidx.compose.runtime.collection.b.b();
        this.f12901l = new NestedContentMap();
        this.f12902m = androidx.collection.U.b();
        this.f12903n = androidx.compose.runtime.collection.b.b();
        this.f12909t = kotlinx.coroutines.flow.B.a(State.f12915d);
        new AtomicReference(androidx.compose.runtime.internal.g.f13067a);
        C2700k0 c2700k0 = new C2700k0((InterfaceC2694i0) eVar.get(InterfaceC2694i0.b.f43449b));
        c2700k0.B(new Ia.l<Throwable, p293xa.r>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Throwable th) {
                final Throwable th2 = th;
                CancellationException cancellationExceptionB = kotlin.jvm.internal.h.b("Recomposer effect job completed", th2);
                final Recomposer recomposer = this.this$0;
                synchronized (recomposer.f12892b) {
                    try {
                        InterfaceC2694i0 interfaceC2694i0 = recomposer.f12893c;
                        if (interfaceC2694i0 != null) {
                            StateFlowImpl stateFlowImpl = recomposer.f12909t;
                            Recomposer.State state = Recomposer.State.f12914c;
                            stateFlowImpl.getClass();
                            stateFlowImpl.k(null, state);
                            StateFlowImpl stateFlowImpl2 = Recomposer.f12889x;
                            interfaceC2694i0.i(cancellationExceptionB);
                            recomposer.f12906q = null;
                            interfaceC2694i0.B(new Ia.l<Throwable, p293xa.r>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(Throwable th3) {
                                    Throwable th4 = th3;
                                    Recomposer recomposer2 = recomposer;
                                    Object obj = recomposer2.f12892b;
                                    Throwable th5 = th2;
                                    synchronized (obj) {
                                        if (th5 == null) {
                                            th5 = null;
                                        } else if (th4 != null) {
                                            try {
                                                if (th4 instanceof CancellationException) {
                                                    th4 = null;
                                                }
                                                if (th4 != null) {
                                                    D2.V.e(th5, th4);
                                                }
                                            } catch (Throwable th6) {
                                                throw th6;
                                            }
                                        }
                                        recomposer2.f12894d = th5;
                                        StateFlowImpl stateFlowImpl3 = recomposer2.f12909t;
                                        Recomposer.State state2 = Recomposer.State.f12913b;
                                        stateFlowImpl3.getClass();
                                        stateFlowImpl3.k(null, state2);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            });
                        } else {
                            recomposer.f12894d = cancellationExceptionB;
                            StateFlowImpl stateFlowImpl3 = recomposer.f12909t;
                            Recomposer.State state2 = Recomposer.State.f12913b;
                            stateFlowImpl3.getClass();
                            stateFlowImpl3.k(null, state2);
                            p293xa.r rVar = p293xa.r.f47939a;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return p293xa.r.f47939a;
            }
        });
        this.f12910u = c2700k0;
        this.f12911v = eVar.plus(broadcastFrameClock).plus(c2700k0);
        this.f12912w = new c();
    }

    public static final void D(ArrayList arrayList, Recomposer recomposer, C1100n c1100n) {
        arrayList.clear();
        synchronized (recomposer.f12892b) {
            try {
                Iterator it = recomposer.j.iterator();
                while (it.hasNext()) {
                    T t8 = (T) it.next();
                    if (t8.f12926c.equals(c1100n)) {
                        arrayList.add(t8);
                        it.remove();
                    }
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void G(Recomposer recomposer, Throwable th, boolean z10, int i10) throws Throwable {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        recomposer.F(th, null, z10);
    }

    public static final InterfaceC1115w s(Recomposer recomposer, InterfaceC1115w interfaceC1115w, androidx.collection.L l10) {
        androidx.compose.runtime.snapshots.a aVarC;
        recomposer.getClass();
        if (interfaceC1115w.m() || interfaceC1115w.d()) {
            return null;
        }
        LinkedHashSet linkedHashSet = recomposer.f12905p;
        if (linkedHashSet != null && linkedHashSet.contains(interfaceC1115w)) {
            return null;
        }
        Recomposer$readObserverOf$1 recomposer$readObserverOf$1 = new Recomposer$readObserverOf$1(interfaceC1115w);
        Recomposer$writeObserverOf$1 recomposer$writeObserverOf$1 = new Recomposer$writeObserverOf$1(l10, interfaceC1115w);
        androidx.compose.runtime.snapshots.g gVarK = SnapshotKt.k();
        androidx.compose.runtime.snapshots.a aVar = gVarK instanceof androidx.compose.runtime.snapshots.a ? (androidx.compose.runtime.snapshots.a) gVarK : null;
        if (aVar == null || (aVarC = aVar.C(recomposer$readObserverOf$1, recomposer$writeObserverOf$1)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            androidx.compose.runtime.snapshots.g gVarJ = aVarC.j();
            if (l10 != null) {
                try {
                    if (l10.c()) {
                        interfaceC1115w.f(new Recomposer$performRecompose$1$1(l10, interfaceC1115w));
                    }
                } catch (Throwable th) {
                    androidx.compose.runtime.snapshots.g.q(gVarJ);
                    throw th;
                }
            }
            boolean zU = interfaceC1115w.u();
            androidx.compose.runtime.snapshots.g.q(gVarJ);
            u(aVarC);
            if (!zU) {
                interfaceC1115w = null;
            }
            return interfaceC1115w;
        } catch (Throwable th2) {
            u(aVarC);
            throw th2;
        }
    }

    public static final boolean t(Recomposer recomposer) {
        List<InterfaceC1115w> listA;
        boolean z10 = true;
        synchronized (recomposer.f12892b) {
            if (!recomposer.f12897g.b()) {
                ScatterSetWrapper scatterSetWrapper = new ScatterSetWrapper(recomposer.f12897g);
                recomposer.f12897g = new androidx.collection.L<>((Object) null);
                synchronized (recomposer.f12892b) {
                    listA = recomposer.A();
                }
                try {
                    int size = listA.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        listA.get(i10).e(scatterSetWrapper);
                        if (((State) recomposer.f12909t.getValue()).compareTo(State.f12914c) <= 0) {
                            break;
                        }
                    }
                    synchronized (recomposer.f12892b) {
                        recomposer.f12897g = new androidx.collection.L<>((Object) null);
                        p293xa.r rVar = p293xa.r.f47939a;
                    }
                    synchronized (recomposer.f12892b) {
                        if (recomposer.x() != null) {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                        }
                        if (recomposer.f12898h.f12945d == 0 && !recomposer.y()) {
                            z10 = false;
                        }
                    }
                } catch (Throwable th) {
                    synchronized (recomposer.f12892b) {
                        androidx.collection.L<Object> l10 = recomposer.f12897g;
                        l10.getClass();
                        Iterator<T> it = scatterSetWrapper.iterator();
                        while (it.hasNext()) {
                            l10.k(it.next());
                        }
                        throw th;
                    }
                }
            } else if (recomposer.f12898h.f12945d == 0 && !recomposer.y()) {
                z10 = false;
            }
        }
        return z10;
    }

    public static void u(androidx.compose.runtime.snapshots.a aVar) {
        try {
            if (aVar.w() instanceof androidx.compose.runtime.snapshots.h.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            aVar.c();
        } catch (Throwable th) {
            aVar.c();
            throw th;
        }
    }

    public static final void w(Recomposer recomposer, T t8, T t10) {
        ArrayList arrayList = t10.f12931h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                T t11 = (T) arrayList.get(i10);
                NestedContentMap nestedContentMap = recomposer.f12901l;
                Q<Object> q10 = t11.f12924a;
                androidx.compose.runtime.collection.b.a(nestedContentMap.f12882a, q10, new Y(t11, t8));
                androidx.compose.runtime.collection.b.a(nestedContentMap.f12883b, t8, q10);
                w(recomposer, t8, t11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<androidx.compose.runtime.w>] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List<InterfaceC1115w> A() {
        Object obj = this.f12896f;
        ?? r10 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f12895e;
            Object arrayList2 = arrayList.isEmpty() ? EmptyList.f42983b : new ArrayList(arrayList);
            this.f12896f = arrayList2;
            r10 = arrayList2;
        }
        return r10;
    }

    public final Object B(kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objI = C2688e.i(this.f12909t, new Recomposer$join$2(2, null), (ContinuationImpl) cVar);
        return objI == CoroutineSingletons.f43038b ? objI : p293xa.r.f47939a;
    }

    public final void C(C1100n c1100n) {
        synchronized (this.f12892b) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((T) arrayList.get(i10)).f12926c.equals(c1100n)) {
                    p293xa.r rVar = p293xa.r.f47939a;
                    ArrayList arrayList2 = new ArrayList();
                    D(arrayList2, this, c1100n);
                    while (!arrayList2.isEmpty()) {
                        E(arrayList2, null);
                        D(arrayList2, this, c1100n);
                    }
                    return;
                }
            }
        }
    }

    public final List<InterfaceC1115w> E(List<T> list, androidx.collection.L<Object> l10) {
        androidx.compose.runtime.snapshots.a aVarC;
        ArrayList<Pair> arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t8 = list.get(i10);
            C1100n c1100n = t8.f12926c;
            Object arrayList2 = map.get(c1100n);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(c1100n, arrayList2);
            }
            ((ArrayList) arrayList2).add(t8);
        }
        for (Map.Entry entry : map.entrySet()) {
            InterfaceC1115w interfaceC1115w = (InterfaceC1115w) entry.getKey();
            List list2 = (List) entry.getValue();
            if (interfaceC1115w.m()) {
                C1090i.c("Check failed");
            }
            Recomposer$readObserverOf$1 recomposer$readObserverOf$1 = new Recomposer$readObserverOf$1(interfaceC1115w);
            Recomposer$writeObserverOf$1 recomposer$writeObserverOf$1 = new Recomposer$writeObserverOf$1(l10, interfaceC1115w);
            androidx.compose.runtime.snapshots.g gVarK = SnapshotKt.k();
            androidx.compose.runtime.snapshots.a aVar = gVarK instanceof androidx.compose.runtime.snapshots.a ? (androidx.compose.runtime.snapshots.a) gVarK : null;
            if (aVar == null || (aVarC = aVar.C(recomposer$readObserverOf$1, recomposer$writeObserverOf$1)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                androidx.compose.runtime.snapshots.g gVarJ = aVarC.j();
                try {
                    synchronized (this.f12892b) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                T t10 = (T) list2.get(i11);
                                Object objC = androidx.compose.runtime.collection.b.c(this.f12900k, t10.f12924a);
                                T t11 = (T) objC;
                                if (t11 != null) {
                                    this.f12901l.a(t11);
                                }
                                arrayList.add(new Pair(t10, objC));
                            }
                            int size3 = arrayList.size();
                            for (int i12 = 0; i12 < size3; i12++) {
                                Pair pair = (Pair) arrayList.get(i12);
                                if (pair.d() == null) {
                                    if (this.f12901l.f12882a.a(((T) pair.c()).f12924a)) {
                                        ArrayList arrayList3 = new ArrayList(kotlin.collections.m.y(arrayList, 10));
                                        for (Pair pair2 : arrayList) {
                                            if (pair2.d() == null) {
                                                NestedContentMap nestedContentMap = this.f12901l;
                                                Q<Object> q10 = ((T) pair2.c()).f12924a;
                                                androidx.collection.K<Object, Object> k10 = nestedContentMap.f12882a;
                                                Y y10 = (Y) androidx.compose.runtime.collection.b.c(k10, q10);
                                                if (k10.e()) {
                                                    nestedContentMap.f12883b.f();
                                                }
                                                if (y10 != null) {
                                                    T t12 = y10.f12932a;
                                                    androidx.compose.runtime.collection.b.a(this.f12903n, y10.f12933b, t12);
                                                    pair2 = new Pair(pair2.c(), t12);
                                                }
                                            }
                                            arrayList3.add(pair2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size4 = arrayList.size();
                    for (int i13 = 0; i13 < size4; i13++) {
                        if (((Pair) arrayList.get(i13)).d() != null) {
                            int size5 = arrayList.size();
                            for (int i14 = 0; i14 < size5; i14++) {
                                if (((Pair) arrayList.get(i14)).d() == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size6 = arrayList.size();
                                    for (int i15 = 0; i15 < size6; i15++) {
                                        Pair pair3 = (Pair) arrayList.get(i15);
                                        T t13 = pair3.d() == null ? (T) pair3.c() : null;
                                        if (t13 != null) {
                                            arrayList4.add(t13);
                                        }
                                    }
                                    synchronized (this.f12892b) {
                                        kotlin.collections.p.z(this.j, arrayList4);
                                        p293xa.r rVar = p293xa.r.f47939a;
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i16 = 0; i16 < size7; i16++) {
                                        Object obj = arrayList.get(i16);
                                        if (((Pair) obj).d() != null) {
                                            arrayList5.add(obj);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    interfaceC1115w.j(arrayList);
                    p293xa.r rVar2 = p293xa.r.f47939a;
                    androidx.compose.runtime.snapshots.g.q(gVarJ);
                    u(aVarC);
                } catch (Throwable th2) {
                    androidx.compose.runtime.snapshots.g.q(gVarJ);
                    throw th2;
                }
            } catch (Throwable th3) {
                u(aVarC);
                throw th3;
            }
        }
        return kotlin.collections.q.o0(map.keySet());
    }

    public final void F(Throwable th, InterfaceC1115w interfaceC1115w, boolean z10) throws Throwable {
        if (!f12890y.get().booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.f12892b) {
                b bVar = this.f12907r;
                if (bVar != null) {
                    throw bVar.f12920a;
                }
                this.f12907r = new b(th);
                p293xa.r rVar = p293xa.r.f47939a;
            }
            throw th;
        }
        synchronized (this.f12892b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.f12899i.clear();
                this.f12898h.j();
                this.f12897g = new androidx.collection.L<>((Object) null);
                this.j.clear();
                this.f12900k.f();
                this.f12902m.f();
                this.f12907r = new b(th);
                if (interfaceC1115w != null) {
                    H(interfaceC1115w);
                }
                x();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void H(InterfaceC1115w interfaceC1115w) {
        ArrayList arrayList = this.f12904o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f12904o = arrayList;
        }
        if (!arrayList.contains(interfaceC1115w)) {
            arrayList.add(interfaceC1115w);
        }
        if (this.f12895e.remove(interfaceC1115w)) {
            this.f12896f = null;
        }
    }

    public final Object I(kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        Object objF = C2680e.f(this.f12891a, new Recomposer$recompositionRunner$2(this, new Recomposer$runRecomposeAndApplyChanges$2(this, null), P.a(cVar.getContext()), null), cVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (objF != coroutineSingletons) {
            objF = p293xa.r.f47939a;
        }
        return objF == coroutineSingletons ? objF : p293xa.r.f47939a;
    }

    @Override // androidx.compose.runtime.AbstractC1094k
    public final void a(C1100n c1100n, ComposableLambdaImpl composableLambdaImpl) throws Throwable {
        androidx.compose.runtime.snapshots.a aVarC;
        boolean z10 = c1100n.f13095t.f12985E;
        try {
            Recomposer$readObserverOf$1 recomposer$readObserverOf$1 = new Recomposer$readObserverOf$1(c1100n);
            Recomposer$writeObserverOf$1 recomposer$writeObserverOf$1 = new Recomposer$writeObserverOf$1(null, c1100n);
            androidx.compose.runtime.snapshots.g gVarK = SnapshotKt.k();
            androidx.compose.runtime.snapshots.a aVar = gVarK instanceof androidx.compose.runtime.snapshots.a ? (androidx.compose.runtime.snapshots.a) gVarK : null;
            if (aVar == null || (aVarC = aVar.C(recomposer$readObserverOf$1, recomposer$writeObserverOf$1)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                androidx.compose.runtime.snapshots.g gVarJ = aVarC.j();
                try {
                    c1100n.x(composableLambdaImpl);
                    p293xa.r rVar = p293xa.r.f47939a;
                    androidx.compose.runtime.snapshots.g.q(gVarJ);
                    u(aVarC);
                    if (!z10) {
                        SnapshotKt.k().m();
                    }
                    synchronized (this.f12892b) {
                        if (((State) this.f12909t.getValue()).compareTo(State.f12914c) > 0 && !A().contains(c1100n)) {
                            this.f12895e.add(c1100n);
                            this.f12896f = null;
                        }
                    }
                    try {
                        C(c1100n);
                        try {
                            c1100n.l();
                            c1100n.k();
                            if (z10) {
                                return;
                            }
                            SnapshotKt.k().m();
                        } catch (Throwable th) {
                            G(this, th, false, 6);
                        }
                    } catch (Throwable th2) {
                        F(th2, c1100n, true);
                    }
                } catch (Throwable th3) {
                    androidx.compose.runtime.snapshots.g.q(gVarJ);
                    throw th3;
                }
            } catch (Throwable th4) {
                u(aVarC);
                throw th4;
            }
        } catch (Throwable th5) {
            F(th5, c1100n, true);
        }
    }

    @Override // androidx.compose.runtime.AbstractC1094k
    public final void b(T t8) {
        synchronized (this.f12892b) {
            try {
                androidx.compose.runtime.collection.b.a(this.f12900k, t8.f12924a, t8);
                if (t8.f12931h != null) {
                    w(this, t8, t8);
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.AbstractC1094k
    public final boolean d() {
        return f12890y.get().booleanValue();
    }

    @Override // androidx.compose.runtime.AbstractC1094k
    public final boolean e() {
        return false;
    }

    @Override // androidx.compose.runtime.AbstractC1094k
    public final boolean f() {
        return false;
    }

    @Override // androidx.compose.runtime.AbstractC1094k
    public final int h() {
        return Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS;
    }

    @Override // androidx.compose.runtime.AbstractC1094k
    public final kotlin.coroutines.e i() {
        return this.f12911v;
    }

    @Override // androidx.compose.runtime.AbstractC1094k
    public final void j(C1100n c1100n) {
        InterfaceC2691h<p293xa.r> interfaceC2691hX;
        synchronized (this.f12892b) {
            if (this.f12898h.k(c1100n)) {
                interfaceC2691hX = null;
            } else {
                this.f12898h.b(c1100n);
                interfaceC2691hX = x();
            }
        }
        if (interfaceC2691hX != null) {
            ((C2693i) interfaceC2691hX).resumeWith(p293xa.r.f47939a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0088 A[Catch: all -> 0x007f, LOOP:0: B:16:0x0049->B:28:0x0088, LOOP_END, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x000a, B:6:0x0017, B:11:0x0031, B:13:0x0037, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006e, B:25:0x0081, B:28:0x0088, B:29:0x008a, B:7:0x001f, B:9:0x0023, B:10:0x0027), top: B:34:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008a A[EDGE_INSN: B:37:0x008a->B:29:0x008a BREAK  A[LOOP:0: B:16:0x0049->B:28:0x0088], SYNTHETIC] */
    @Override // androidx.compose.runtime.AbstractC1094k
    public final void k(T t8, S s10, InterfaceC1078c<?> interfaceC1078c) {
        ObjectList objectList;
        synchronized (this.f12892b) {
            try {
                this.f12902m.l(t8, s10);
                Object objD = this.f12903n.d(t8);
                if (objD == null) {
                    ObjectList objectList2 = androidx.collection.Q.f9120b;
                    kotlin.jvm.internal.i.c(objectList2, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                    objectList = objectList2;
                } else if (objD instanceof androidx.collection.I) {
                    objectList = (ObjectList) objD;
                } else {
                    Object[] objArr = androidx.collection.Q.f9119a;
                    androidx.collection.I i10 = new androidx.collection.I(1);
                    i10.g(objD);
                    objectList = i10;
                }
                if (objectList.e()) {
                    androidx.collection.K kB = s10.b(interfaceC1078c, objectList);
                    Object[] objArr2 = kB.f9128b;
                    Object[] objArr3 = kB.f9129c;
                    long[] jArr = kB.f9127a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j = jArr[i11];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i11 != length) {
                                    break;
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((255 & j) < 128) {
                                        int i14 = (i11 << 3) + i13;
                                        Object obj = objArr2[i14];
                                        this.f12902m.l((T) obj, (S) objArr3[i14]);
                                    }
                                    j >>= 8;
                                }
                                if (i12 != 8) {
                                    break;
                                } else if (i11 != length) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.AbstractC1094k
    public final S l(T t8) {
        S sJ;
        synchronized (this.f12892b) {
            sJ = this.f12902m.j(t8);
        }
        return sJ;
    }

    @Override // androidx.compose.runtime.AbstractC1094k
    public final void o(C1100n c1100n) {
        synchronized (this.f12892b) {
            try {
                LinkedHashSet linkedHashSet = this.f12905p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f12905p = linkedHashSet;
                }
                linkedHashSet.add(c1100n);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.AbstractC1094k
    public final void r(C1100n c1100n) {
        synchronized (this.f12892b) {
            if (this.f12895e.remove(c1100n)) {
                this.f12896f = null;
            }
            this.f12898h.m(c1100n);
            this.f12899i.remove(c1100n);
            p293xa.r rVar = p293xa.r.f47939a;
        }
    }

    public final void v() {
        synchronized (this.f12892b) {
            try {
                if (((State) this.f12909t.getValue()).compareTo(State.f12917f) >= 0) {
                    StateFlowImpl stateFlowImpl = this.f12909t;
                    State state = State.f12914c;
                    stateFlowImpl.getClass();
                    stateFlowImpl.k(null, state);
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12910u.i(null);
    }

    public final InterfaceC2691h<p293xa.r> x() {
        State state;
        StateFlowImpl stateFlowImpl = this.f12909t;
        int iCompareTo = ((State) stateFlowImpl.getValue()).compareTo(State.f12914c);
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.f12899i;
        androidx.compose.runtime.collection.c<InterfaceC1115w> cVar = this.f12898h;
        if (iCompareTo <= 0) {
            this.f12895e.clear();
            this.f12896f = EmptyList.f42983b;
            this.f12897g = new androidx.collection.L<>((Object) null);
            cVar.j();
            arrayList2.clear();
            arrayList.clear();
            this.f12904o = null;
            C2693i c2693i = this.f12906q;
            if (c2693i != null) {
                c2693i.o(null);
            }
            this.f12906q = null;
            this.f12907r = null;
            return null;
        }
        if (this.f12907r != null) {
            state = State.f12915d;
        } else if (this.f12893c == null) {
            this.f12897g = new androidx.collection.L<>((Object) null);
            cVar.j();
            state = y() ? State.f12916e : State.f12915d;
        } else {
            state = (cVar.f12945d == 0 && !this.f12897g.c() && arrayList2.isEmpty() && arrayList.isEmpty() && !y()) ? State.f12917f : State.f12918g;
        }
        stateFlowImpl.k(null, state);
        if (state != State.f12918g) {
            return null;
        }
        C2693i c2693i2 = this.f12906q;
        this.f12906q = null;
        return c2693i2;
    }

    public final boolean y() {
        return (this.f12908s || this.f12891a.f12788g.get() == 0) ? false : true;
    }

    public final boolean z() {
        boolean z10;
        synchronized (this.f12892b) {
            z10 = this.f12897g.c() || this.f12898h.f12945d != 0 || y();
        }
        return z10;
    }

    @Override // androidx.compose.runtime.AbstractC1094k
    public final void m(Set<H.a> set) {
    }
}
