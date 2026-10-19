package p163n2;

import A8.f;
import C7.g;
import Ia.l;
import P9.b;
import Q8.d;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import androidx.navigation.compose.A;
import com.google.android.gms.internal.measurement.M1;
import io.intercom.android.sdk.m5.conversation.ui.C2410z;
import io.intercom.android.sdk.m5.conversation.ui.M;
import io.intercom.android.sdk.m5.conversation.ui.components.row.C2373e;
import io.intercom.android.sdk.survey.block.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.i;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.collections.y;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.o;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.m;
import kotlin.sequences.n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.B;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.s;
import kotlinx.coroutines.flow.v;
import p141l2.C;
import p141l2.C2749t;
import p141l2.E;
import p141l2.InterfaceC2739i;
import p141l2.J;
import p141l2.L;
import p141l2.P;
import p141l2.Q;
import p141l2.S;
import p141l2.u;
import p141l2.w;
import p141l2.x;
import p271w0.c;
import p293xa.r;

/* JADX INFO: compiled from: NavControllerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f44785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f44786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E f44787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bundle f44788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle[] f44789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i<C2749t> f44790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateFlowImpl f44791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StateFlowImpl f44792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f44793i;
    public final LinkedHashMap j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f44794k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f44795l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f44796m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC1376t f44797n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public x f44798o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f44799p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Lifecycle.State f44800q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f44801r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Q f44802s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final LinkedHashMap f44803t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l<? super C2749t, r> f44804u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h f44805v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f44806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f44807x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f44808y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final v f44809z;

    /* JADX WARN: Type inference failed for: r3v11, types: [n2.g] */
    public j(w navController, b bVar) {
        kotlin.jvm.internal.i.e(navController, "navController");
        this.f44785a = navController;
        this.f44786b = bVar;
        this.f44790f = new i<>();
        EmptyList emptyList = EmptyList.f42983b;
        this.f44791g = B.a(emptyList);
        StateFlowImpl stateFlowImplA = B.a(emptyList);
        this.f44792h = stateFlowImplA;
        this.f44793i = C2688e.b(stateFlowImplA);
        this.j = new LinkedHashMap();
        this.f44794k = new LinkedHashMap();
        this.f44795l = new LinkedHashMap();
        this.f44796m = new LinkedHashMap();
        this.f44799p = new ArrayList();
        this.f44800q = Lifecycle.State.f17750c;
        this.f44801r = new androidx.lifecycle.r() { // from class: n2.g
            @Override // androidx.lifecycle.r
            public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                Lifecycle.State stateA = event.a();
                j jVar = this.f44774b;
                jVar.f44800q = stateA;
                if (jVar.f44787c != null) {
                    for (C2749t c2749t : q.p0(jVar.f44790f)) {
                        c2749t.getClass();
                        c cVar = c2749t.f44305i;
                        cVar.getClass();
                        cVar.f44755d = event.a();
                        cVar.b();
                    }
                }
            }
        };
        this.f44802s = new Q();
        this.f44803t = new LinkedHashMap();
        this.f44806w = new LinkedHashMap();
        this.f44808y = new ArrayList();
        this.f44809z = kotlinx.coroutines.flow.w.b(1, 0, BufferOverflow.f43244c, 2);
    }

    public static C e(int i10, C c10, C c11, boolean z10) {
        if (c10.f44219c.f44813d == i10 && (c11 == null || (c10.equals(c11) && kotlin.jvm.internal.i.a(c10.f44220d, c11.f44220d)))) {
            return c10;
        }
        E e10 = c10 instanceof E ? (E) c10 : null;
        if (e10 == null) {
            e10 = c10.f44220d;
            kotlin.jvm.internal.i.b(e10);
        }
        return e10.f44235g.c(i10, e10, c11, z10);
    }

    public static /* synthetic */ void r(j jVar, C2749t c2749t) {
        jVar.q(c2749t, false, new i<>());
    }

    public final void a(C c10, Bundle bundle, C2749t c2749t, List<C2749t> list) {
        C2749t c2749tPrevious;
        C2749t c2749tPrevious2;
        C c11 = c2749t.f44299c;
        boolean z10 = c11 instanceof InterfaceC2739i;
        i<C2749t> iVar = this.f44790f;
        if (!z10) {
            while (!iVar.isEmpty() && (iVar.last().f44299c instanceof InterfaceC2739i) && o(iVar.last().f44299c.f44219c.f44813d, true, false)) {
            }
        }
        i<C2749t> iVar2 = new i();
        boolean z11 = c10 instanceof E;
        w wVar = this.f44785a;
        C2749t c2749t2 = null;
        if (z11) {
            C c12 = c11;
            do {
                kotlin.jvm.internal.i.b(c12);
                c12 = c12.f44220d;
                if (c12 != null) {
                    ListIterator<C2749t> listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            c2749tPrevious2 = null;
                            break;
                        }
                        c2749tPrevious2 = listIterator.previous();
                    } while (!kotlin.jvm.internal.i.a(c2749tPrevious2.f44299c, c12));
                    C2749t c2749tA = c2749tPrevious2;
                    if (c2749tA == null) {
                        c2749tA = C2749t.a.a(wVar.f44311c, c12, bundle, j(), this.f44798o);
                    }
                    iVar2.addFirst(c2749tA);
                    if (!iVar.isEmpty() && iVar.last().f44299c == c12) {
                        r(this, iVar.last());
                    }
                }
                if (c12 == null) {
                    break;
                }
            } while (c12 != c10);
        }
        C c13 = iVar2.isEmpty() ? c11 : ((C2749t) iVar2.first()).f44299c;
        while (c13 != null && d(c13.f44219c.f44813d, c13) != c13) {
            c13 = c13.f44220d;
            if (c13 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator<C2749t> listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        c2749tPrevious = null;
                        break;
                    }
                    c2749tPrevious = listIterator2.previous();
                } while (!kotlin.jvm.internal.i.a(c2749tPrevious.f44299c, c13));
                C2749t c2749tA2 = c2749tPrevious;
                if (c2749tA2 == null) {
                    c2749tA2 = C2749t.a.a(wVar.f44311c, c13, c13.e(bundle2), j(), this.f44798o);
                }
                iVar2.addFirst(c2749tA2);
            }
        }
        if (!iVar2.isEmpty()) {
            c11 = ((C2749t) iVar2.first()).f44299c;
        }
        while (!iVar.isEmpty() && (iVar.last().f44299c instanceof E)) {
            C c14 = iVar.last().f44299c;
            kotlin.jvm.internal.i.c(c14, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((E) c14).f44235g.f44820b.c(c11.f44219c.f44813d) != null) {
                break;
            } else {
                r(this, iVar.last());
            }
        }
        C2749t c2749tA3 = iVar.A();
        if (c2749tA3 == null) {
            c2749tA3 = (C2749t) iVar2.A();
        }
        if (!kotlin.jvm.internal.i.a(c2749tA3 != null ? c2749tA3.f44299c : null, this.f44787c)) {
            ListIterator<C2749t> listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                C2749t c2749tPrevious3 = listIterator3.previous();
                C c15 = c2749tPrevious3.f44299c;
                E e10 = this.f44787c;
                kotlin.jvm.internal.i.b(e10);
                if (kotlin.jvm.internal.i.a(c15, e10)) {
                    c2749t2 = c2749tPrevious3;
                    break;
                }
            }
            C2749t c2749tA4 = c2749t2;
            if (c2749tA4 == null) {
                e eVar = wVar.f44311c;
                E e11 = this.f44787c;
                kotlin.jvm.internal.i.b(e11);
                E e12 = this.f44787c;
                kotlin.jvm.internal.i.b(e12);
                c2749tA4 = C2749t.a.a(eVar, e11, e12.e(bundle), j(), this.f44798o);
            }
            iVar2.addFirst(c2749tA4);
        }
        for (C2749t c2749t3 : iVar2) {
            Object obj = this.f44803t.get(this.f44802s.b(c2749t3.f44299c.f44218b));
            if (obj == null) {
                throw new IllegalStateException(d.a(new StringBuilder("NavigatorBackStack for "), c10.f44218b, " should already be created").toString());
            }
            ((w.a) obj).g(c2749t3);
        }
        iVar.addAll(iVar2);
        iVar.addLast(c2749t);
        for (C2749t c2749t4 : q.d0(iVar2, c2749t)) {
            E e13 = c2749t4.f44299c.f44220d;
            if (e13 != null) {
                l(c2749t4, f(e13.f44219c.f44813d));
            }
        }
    }

    public final boolean b() {
        i<C2749t> iVar;
        while (true) {
            iVar = this.f44790f;
            if (iVar.isEmpty() || !(iVar.last().f44299c instanceof E)) {
                break;
            }
            r(this, iVar.last());
        }
        C2749t c2749tC = iVar.C();
        ArrayList arrayList = this.f44808y;
        if (c2749tC != null) {
            arrayList.add(c2749tC);
        }
        this.f44807x++;
        v();
        int i10 = this.f44807x - 1;
        this.f44807x = i10;
        if (i10 == 0) {
            ArrayList<C2749t> arrayListP0 = q.p0(arrayList);
            arrayList.clear();
            for (C2749t c2749t : arrayListP0) {
                for (w.b bVar : this.f44799p) {
                    C c10 = c2749t.f44299c;
                    c2749t.f44305i.a();
                    bVar.a();
                }
                this.f44809z.f(c2749t);
            }
            ArrayList arrayListP1 = q.p0(iVar);
            StateFlowImpl stateFlowImpl = this.f44791g;
            stateFlowImpl.getClass();
            stateFlowImpl.k(null, arrayListP1);
            ArrayList arrayListS = s();
            StateFlowImpl stateFlowImpl2 = this.f44792h;
            stateFlowImpl2.getClass();
            stateFlowImpl2.k(null, arrayListS);
        }
        return c2749tC != null;
    }

    public final boolean c(ArrayList arrayList, C c10, boolean z10, boolean z11) {
        d dVar;
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        i iVar = new i();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            P navigator = (P) it.next();
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            C2749t popUpTo = this.f44790f.last();
            h hVar = new h(ref$BooleanRef2, ref$BooleanRef, this, z11, iVar);
            kotlin.jvm.internal.i.e(navigator, "navigator");
            kotlin.jvm.internal.i.e(popUpTo, "popUpTo");
            this.f44805v = hVar;
            navigator.e(popUpTo, z11);
            this.f44805v = null;
            if (!ref$BooleanRef2.element) {
                break;
            }
        }
        if (z11) {
            LinkedHashMap linkedHashMap = this.f44795l;
            if (!z10) {
                m.a aVar = new m.a(new m(SequencesKt__SequencesKt.z(c10, new M(4)), new A(1, this)));
                while (aVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((C) aVar.next()).f44219c.f44813d);
                    u uVar = (u) iVar.A();
                    linkedHashMap.put(numValueOf, uVar != null ? uVar.f44306a.f44765a : null);
                }
            }
            if (!iVar.isEmpty()) {
                u uVar2 = (u) iVar.first();
                m.a aVar2 = new m.a(new m(SequencesKt__SequencesKt.z(d(uVar2.f44306a.f44766b, null), new C2373e(2)), new coil.compose.x(1, this)));
                while (true) {
                    boolean zHasNext = aVar2.hasNext();
                    dVar = uVar2.f44306a;
                    if (!zHasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((C) aVar2.next()).f44219c.f44813d), dVar.f44765a);
                }
                if (linkedHashMap.values().contains(dVar.f44765a)) {
                    this.f44796m.put(dVar.f44765a, iVar);
                }
            }
        }
        this.f44786b.invoke();
        return ref$BooleanRef.element;
    }

    public final C d(int i10, C c10) {
        C c11;
        E e10 = this.f44787c;
        if (e10 == null) {
            return null;
        }
        if (e10.f44219c.f44813d == i10) {
            if (c10 == null) {
                return e10;
            }
            if (kotlin.jvm.internal.i.a(e10, c10) && c10.f44220d == null) {
                return this.f44787c;
            }
        }
        C2749t c2749tC = this.f44790f.C();
        if (c2749tC == null || (c11 = c2749tC.f44299c) == null) {
            c11 = this.f44787c;
            kotlin.jvm.internal.i.b(c11);
        }
        return e(i10, c11, c10, false);
    }

    public final C2749t f(int i10) {
        C2749t c2749tPrevious;
        i<C2749t> iVar = this.f44790f;
        ListIterator<C2749t> listIterator = iVar.listIterator(iVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                c2749tPrevious = null;
                break;
            }
            c2749tPrevious = listIterator.previous();
        } while (c2749tPrevious.f44299c.f44219c.f44813d != i10);
        C2749t c2749t = c2749tPrevious;
        if (c2749t != null) {
            return c2749t;
        }
        StringBuilder sbE = f.e(i10, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbE.append(h());
        throw new IllegalArgumentException(sbE.toString().toString());
    }

    public final C2749t g() {
        return this.f44790f.C();
    }

    public final C h() {
        C2749t c2749tG = g();
        if (c2749tG != null) {
            return c2749tG.f44299c;
        }
        return null;
    }

    public final E i() {
        E e10 = this.f44787c;
        if (e10 == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        kotlin.jvm.internal.i.c(e10, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return e10;
    }

    public final Lifecycle.State j() {
        return this.f44797n == null ? Lifecycle.State.f17751d : this.f44800q;
    }

    public final E k() {
        C c10;
        C2749t c2749tC = this.f44790f.C();
        if (c2749tC == null || (c10 = c2749tC.f44299c) == null) {
            c10 = this.f44787c;
            kotlin.jvm.internal.i.b(c10);
        }
        E e10 = c10 instanceof E ? (E) c10 : null;
        if (e10 != null) {
            return e10;
        }
        E e11 = c10.f44220d;
        kotlin.jvm.internal.i.b(e11);
        return e11;
    }

    public final void l(C2749t c2749t, C2749t c2749t2) {
        this.j.put(c2749t, c2749t2);
        LinkedHashMap linkedHashMap = this.f44794k;
        if (linkedHashMap.get(c2749t2) == null) {
            linkedHashMap.put(c2749t2, new a());
        }
        Object obj = linkedHashMap.get(c2749t2);
        kotlin.jvm.internal.i.b(obj);
        ((a) obj).f44750a.incrementAndGet();
    }

    public final void m(String route, J j, P.a aVar) {
        kotlin.jvm.internal.i.e(route, "route");
        if (this.f44787c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        E eK = k();
        C.b bVarB = eK.B(route, true, eK);
        if (bVarB == null) {
            StringBuilder sbA = g.a("Navigation destination that matches route ", route, " cannot be found in the navigation graph ");
            sbA.append(this.f44787c);
            throw new IllegalArgumentException(sbA.toString());
        }
        Bundle bundle = bVarB.f44223c;
        C c10 = bVarB.f44222b;
        Bundle bundleE = c10.e(bundle);
        if (bundleE == null) {
            y.p();
            bundleE = c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
        }
        int i10 = C.f44217f;
        String uriString = C.a.a(c10.f44219c.f44814e);
        kotlin.jvm.internal.i.e(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        kotlin.jvm.internal.i.d(uri, "parse(...)");
        this.f44785a.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        p248u2.f.b(intent, bundleE);
        n(c10, bundleE, j, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[LOOP:7: B:74:0x0201->B:122:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    /* JADX WARN: Code duplicated, block: B:51:0x011c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0129 A[LOOP:4: B:52:0x0121->B:54:0x0129, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0198  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x0207 A[Catch: all -> 0x021c, TryCatch #0 {all -> 0x021c, blocks: (B:73:0x01eb, B:74:0x0201, B:76:0x0207, B:78:0x0217, B:82:0x021f), top: B:103:0x01eb }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0233  */
    public final void n(final C node, Bundle bundle, J j, P.a aVar) {
        boolean zO;
        boolean z10;
        boolean z11;
        int iNextIndex;
        C c10;
        i<C2749t> iVar;
        P pB;
        C c11;
        S sB;
        ListIterator listIterator;
        int iNextIndex2;
        E e10;
        int i10 = 2;
        kotlin.jvm.internal.i.e(node, "node");
        Iterator it = this.f44803t.values().iterator();
        while (it.hasNext()) {
            ((w.a) it.next()).f44277d = true;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        if (j == null) {
            zO = false;
        } else {
            String str = j.j;
            if (str != null) {
                zO = p(str, j.f44243d, j.f44244e);
            } else {
                int i11 = j.f44242c;
                if (i11 != -1) {
                    zO = o(i11, j.f44243d, j.f44244e);
                } else {
                    zO = false;
                }
            }
        }
        final Bundle bundleE = node.e(bundle);
        if (j != null && j.f44241b && this.f44795l.containsKey(Integer.valueOf(node.f44219c.f44813d))) {
            ref$BooleanRef.element = t(node.f44219c.f44813d, bundleE, j, aVar);
            z10 = zO;
            z11 = false;
        } else {
            if (j == null || !j.f44240a) {
                z10 = zO;
                z11 = false;
            } else {
                C2749t c2749tG = g();
                i<C2749t> iVar2 = this.f44790f;
                ListIterator<C2749t> listIterator2 = iVar2.listIterator(iVar2.e());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        if (listIterator2.previous().f44299c == node) {
                            iNextIndex = listIterator2.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    z10 = zO;
                    z11 = false;
                } else if (node instanceof E) {
                    int i12 = E.f44234h;
                    List listF = SequencesKt___SequencesKt.F(new n(SequencesKt__SequencesKt.z((E) node, new io.intercom.android.sdk.m5.home.ui.b(i10)), new e(i10)));
                    if (this.f44790f.f43019d - iNextIndex == listF.size()) {
                        i<C2749t> iVar3 = this.f44790f;
                        List<C2749t> listSubList = iVar3.subList(iNextIndex, iVar3.f43019d);
                        ArrayList arrayList = new ArrayList(kotlin.collections.m.y(listSubList, 10));
                        Iterator<T> it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((C2749t) it2.next()).f44299c.f44219c.f44813d));
                        }
                        if (arrayList.equals(listF)) {
                            iVar = new i();
                            while (kotlin.collections.l.r(this.f44790f) >= iNextIndex) {
                                C2749t c2749t = (C2749t) p.E(this.f44790f);
                                u(c2749t);
                                C2749t c2749t2 = new C2749t(c2749t.f44298b, c2749t.f44299c, c2749t.f44299c.e(bundle), c2749t.f44301e, c2749t.f44302f, c2749t.f44303g, c2749t.f44304h);
                                c cVar = c2749t2.f44305i;
                                Lifecycle.State state = c2749t.f44301e;
                                cVar.getClass();
                                kotlin.jvm.internal.i.e(state, "<set-?>");
                                cVar.f44755d = state;
                                c cVar2 = c2749t2.f44305i;
                                Lifecycle.State maxState = c2749t.f44305i.f44761k;
                                cVar2.getClass();
                                kotlin.jvm.internal.i.e(maxState, "maxState");
                                cVar2.f44761k = maxState;
                                cVar2.b();
                                iVar.addFirst(c2749t2);
                                iNextIndex = iNextIndex;
                                zO = zO;
                            }
                            z10 = zO;
                            for (C2749t c2749t3 : iVar) {
                                e10 = c2749t3.f44299c.f44220d;
                                if (e10 != null) {
                                    l(c2749t3, f(e10.f44219c.f44813d));
                                }
                                this.f44790f.addLast(c2749t3);
                            }
                            for (C2749t c2749t4 : iVar) {
                                pB = this.f44802s.b(c2749t4.f44299c.f44218b);
                                c11 = c2749t4.f44299c;
                                if (c11 == null) {
                                    c11 = null;
                                }
                                if (c11 == null) {
                                    Fa.d.e(new C2410z(3));
                                    pB.c(c11);
                                    sB = pB.b();
                                    synchronized (sB.f44274a) {
                                        try {
                                            ArrayList arrayListP0 = q.p0((Collection) sB.f44278e.f43418b.getValue());
                                            listIterator = arrayListP0.listIterator(arrayListP0.size());
                                            while (true) {
                                                if (listIterator.hasPrevious()) {
                                                    if (kotlin.jvm.internal.i.a(((C2749t) listIterator.previous()).f44303g, c2749t4.f44303g)) {
                                                        iNextIndex2 = listIterator.nextIndex();
                                                        break;
                                                    }
                                                } else {
                                                    iNextIndex2 = -1;
                                                    break;
                                                }
                                            }
                                            arrayListP0.set(iNextIndex2, c2749t4);
                                            StateFlowImpl stateFlowImpl = sB.f44275b;
                                            stateFlowImpl.getClass();
                                            stateFlowImpl.k(null, arrayListP0);
                                            r rVar = r.f47939a;
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z11 = true;
                        }
                    }
                    z10 = zO;
                    z11 = false;
                } else if (c2749tG == null || (c10 = c2749tG.f44299c) == null || node.f44219c.f44813d != c10.f44219c.f44813d) {
                    z10 = zO;
                    z11 = false;
                } else {
                    iVar = new i();
                    while (kotlin.collections.l.r(this.f44790f) >= iNextIndex) {
                        C2749t c2749t5 = (C2749t) p.E(this.f44790f);
                        u(c2749t5);
                        C2749t c2749t6 = new C2749t(c2749t5.f44298b, c2749t5.f44299c, c2749t5.f44299c.e(bundle), c2749t5.f44301e, c2749t5.f44302f, c2749t5.f44303g, c2749t5.f44304h);
                        c cVar3 = c2749t6.f44305i;
                        Lifecycle.State state2 = c2749t5.f44301e;
                        cVar3.getClass();
                        kotlin.jvm.internal.i.e(state2, "<set-?>");
                        cVar3.f44755d = state2;
                        c cVar4 = c2749t6.f44305i;
                        Lifecycle.State maxState2 = c2749t5.f44305i.f44761k;
                        cVar4.getClass();
                        kotlin.jvm.internal.i.e(maxState2, "maxState");
                        cVar4.f44761k = maxState2;
                        cVar4.b();
                        iVar.addFirst(c2749t6);
                        iNextIndex = iNextIndex;
                        zO = zO;
                    }
                    z10 = zO;
                    while (r6.hasNext()) {
                        e10 = c2749t3.f44299c.f44220d;
                        if (e10 != null) {
                            l(c2749t3, f(e10.f44219c.f44813d));
                        }
                        this.f44790f.addLast(c2749t3);
                    }
                    while (r4.hasNext()) {
                        pB = this.f44802s.b(c2749t4.f44299c.f44218b);
                        c11 = c2749t4.f44299c;
                        if (c11 == null) {
                            c11 = null;
                        }
                        if (c11 == null) {
                            Fa.d.e(new C2410z(3));
                            pB.c(c11);
                            sB = pB.b();
                            synchronized (sB.f44274a) {
                                ArrayList arrayListP1 = q.p0((Collection) sB.f44278e.f43418b.getValue());
                                listIterator = arrayListP1.listIterator(arrayListP1.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        if (kotlin.jvm.internal.i.a(((C2749t) listIterator.previous()).f44303g, c2749t4.f44303g)) {
                                            iNextIndex2 = listIterator.nextIndex();
                                            break;
                                        }
                                    } else {
                                        iNextIndex2 = -1;
                                        break;
                                    }
                                }
                                arrayListP1.set(iNextIndex2, c2749t4);
                                StateFlowImpl stateFlowImpl2 = sB.f44275b;
                                stateFlowImpl2.getClass();
                                stateFlowImpl2.k(null, arrayListP1);
                                r rVar2 = r.f47939a;
                            }
                        }
                    }
                    z11 = true;
                }
            }
            if (!z11) {
                C2749t c2749tA = C2749t.a.a(this.f44785a.f44311c, node, bundleE, j(), this.f44798o);
                P pB2 = this.f44802s.b(node.f44218b);
                List<C2749t> listK = M1.k(c2749tA);
                this.f44804u = new l() { // from class: n2.f
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        C2749t it3 = (C2749t) obj;
                        kotlin.jvm.internal.i.e(it3, "it");
                        ref$BooleanRef.element = true;
                        this.a(node, bundleE, it3, EmptyList.f42983b);
                        return r.f47939a;
                    }
                };
                pB2.d(listK, j, aVar);
                this.f44804u = null;
            }
        }
        this.f44786b.invoke();
        Iterator it3 = this.f44803t.values().iterator();
        while (it3.hasNext()) {
            ((w.a) it3.next()).f44277d = false;
        }
        if (z10 || ref$BooleanRef.element || z11) {
            b();
        } else {
            v();
        }
    }

    public final boolean o(int i10, boolean z10, boolean z11) {
        C c10;
        k kVar;
        i<C2749t> iVar = this.f44790f;
        if (iVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = q.e0(iVar).iterator();
        do {
            if (!it.hasNext()) {
                c10 = null;
                break;
            }
            c10 = ((C2749t) it.next()).f44299c;
            P pB = this.f44802s.b(c10.f44218b);
            kVar = c10.f44219c;
            if (z10 || kVar.f44813d != i10) {
                arrayList.add(pB);
            }
        } while (kVar.f44813d != i10);
        if (c10 != null) {
            return c(arrayList, c10, z10, z11);
        }
        int i11 = C.f44217f;
        String message = "Ignoring popBackStack to destination " + C.a.b(this.f44785a.f44311c, i10) + " as it was not found on the current back stack";
        kotlin.jvm.internal.i.e(message, "message");
        return false;
    }

    public final boolean p(String route, boolean z10, boolean z11) {
        C2749t c2749tPrevious;
        boolean z12;
        kotlin.jvm.internal.i.e(route, "route");
        i<C2749t> iVar = this.f44790f;
        if (iVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator<C2749t> listIterator = iVar.listIterator(iVar.e());
        do {
            if (!listIterator.hasPrevious()) {
                c2749tPrevious = null;
                break;
            }
            c2749tPrevious = listIterator.previous();
            C2749t c2749t = c2749tPrevious;
            C c10 = c2749t.f44299c;
            Bundle bundleA = c2749t.f44305i.a();
            c10.getClass();
            k kVar = c10.f44219c;
            kVar.getClass();
            z12 = true;
            if (!kotlin.jvm.internal.i.a(kVar.f44814e, route)) {
                C.b bVarA = kVar.a(route);
                if (!kotlin.jvm.internal.i.a(kVar.f44810a, bVarA != null ? bVarA.f44222b : null)) {
                    z12 = false;
                    break;
                }
                if (bundleA != null) {
                    Bundle bundle = bVarA.f44223c;
                    if (bundle != null) {
                        Set<String> setKeySet = bundle.keySet();
                        kotlin.jvm.internal.i.d(setKeySet, "keySet(...)");
                        for (String str : setKeySet) {
                            kotlin.jvm.internal.i.b(str);
                            if (bundleA.containsKey(str)) {
                                p141l2.r rVar = bVarA.f44222b.q().get(str);
                                L<Object> l10 = rVar != null ? rVar.f44288a : null;
                                Object obj = l10 != null ? l10.get(bundle, str) : null;
                                Object obj2 = l10 != null ? l10.get(bundleA, str) : null;
                                if (l10 == null || l10.valueEquals(obj, obj2)) {
                                }
                            }
                        }
                    }
                } else {
                    bVarA.getClass();
                }
                z12 = false;
                break;
            }
            if (z10 || !z12) {
                arrayList.add(this.f44802s.b(c2749t.f44299c.f44218b));
            }
        } while (!z12);
        C2749t c2749t2 = c2749tPrevious;
        C c11 = c2749t2 != null ? c2749t2.f44299c : null;
        if (c11 != null) {
            return c(arrayList, c11, z10, z11);
        }
        String message = "Ignoring popBackStack to route " + route + " as it was not found on the current back stack";
        kotlin.jvm.internal.i.e(message, "message");
        return false;
    }

    public final void q(C2749t popUpTo, boolean z10, i<u> savedState) {
        x xVar;
        s sVar;
        Set set;
        kotlin.jvm.internal.i.e(popUpTo, "popUpTo");
        kotlin.jvm.internal.i.e(savedState, "savedState");
        i<C2749t> iVar = this.f44790f;
        C2749t c2749tLast = iVar.last();
        if (!kotlin.jvm.internal.i.a(c2749tLast, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.f44299c + ", which is not the top of the back stack (" + c2749tLast.f44299c + ')').toString());
        }
        p.E(iVar);
        w.a aVar = (w.a) this.f44803t.get(this.f44802s.b(c2749tLast.f44299c.f44218b));
        boolean z11 = true;
        if ((aVar == null || (sVar = aVar.f44279f) == null || (set = (Set) sVar.f43418b.getValue()) == null || !set.contains(c2749tLast)) && !this.f44794k.containsKey(c2749tLast)) {
            z11 = false;
        }
        Lifecycle.State state = c2749tLast.f44305i.j.f17828d;
        Lifecycle.State state2 = Lifecycle.State.f17751d;
        if (state.compareTo(state2) >= 0) {
            if (z10) {
                c2749tLast.a(state2);
                savedState.addFirst(new u(c2749tLast));
            }
            if (z11) {
                c2749tLast.a(state2);
            } else {
                c2749tLast.a(Lifecycle.State.f17749b);
                u(c2749tLast);
            }
        }
        if (z10 || z11 || (xVar = this.f44798o) == null) {
            return;
        }
        String backStackEntryId = c2749tLast.f44303g;
        kotlin.jvm.internal.i.e(backStackEntryId, "backStackEntryId");
        b0 b0Var = (b0) xVar.f44319a.remove(backStackEntryId);
        if (b0Var != null) {
            b0Var.a();
        }
    }

    public final ArrayList s() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f44803t.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((w.a) it.next()).f44279f.f43418b.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C2749t c2749t = (C2749t) obj;
                if (!arrayList.contains(c2749t) && c2749t.f44305i.f44761k.compareTo(Lifecycle.State.f17752e) < 0) {
                    arrayList2.add(obj);
                }
            }
            p.z(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (C2749t c2749t2 : this.f44790f) {
            C2749t c2749t3 = c2749t2;
            if (!arrayList.contains(c2749t3) && c2749t3.f44305i.f44761k.compareTo(Lifecycle.State.f17752e) >= 0) {
                arrayList3.add(c2749t2);
            }
        }
        p.z(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((C2749t) obj2).f44299c instanceof E)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean t(int i10, final Bundle bundle, J j, P.a aVar) {
        C cI;
        C2749t c2749t;
        C c10;
        Bundle bundle2;
        LinkedHashMap linkedHashMap = this.f44795l;
        if (!linkedHashMap.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i10));
        Collection collectionValues = linkedHashMap.values();
        kotlin.jvm.internal.i.e(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.i.a((String) it.next(), str)) {
                it.remove();
            }
        }
        i<u> iVar = (i) o.c(this.f44796m).remove(str);
        final ArrayList arrayList = new ArrayList();
        C2749t c2749tC = this.f44790f.C();
        if (c2749tC == null || (cI = c2749tC.f44299c) == null) {
            cI = i();
        }
        if (iVar != null) {
            for (u uVar : iVar) {
                C cE = e(uVar.f44306a.f44766b, cI, null, true);
                d dVar = uVar.f44306a;
                w wVar = this.f44785a;
                if (cE == null) {
                    int i11 = C.f44217f;
                    throw new IllegalStateException(("Restore State failed: destination " + C.a.b(wVar.f44311c, dVar.f44766b) + " cannot be found from the current destination " + cI).toString());
                }
                e context = wVar.f44311c;
                Lifecycle.State hostLifecycleState = j();
                x xVar = this.f44798o;
                kotlin.jvm.internal.i.e(context, "context");
                kotlin.jvm.internal.i.e(hostLifecycleState, "hostLifecycleState");
                Bundle bundle3 = dVar.f44767c;
                if (bundle3 != null) {
                    Context context2 = context.f44769a;
                    bundle3.setClassLoader(context2 != null ? context2.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String id = dVar.f44765a;
                kotlin.jvm.internal.i.e(id, "id");
                arrayList.add(new C2749t(context, cE, bundle2, hostLifecycleState, xVar, id, dVar.f44768d));
                cI = cE;
            }
        }
        ArrayList<List<C2749t>> arrayList2 = new ArrayList();
        ArrayList<C2749t> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((C2749t) obj).f44299c instanceof E)) {
                arrayList3.add(obj);
            }
        }
        for (C2749t c2749t2 : arrayList3) {
            List list = (List) q.W(arrayList2);
            if (kotlin.jvm.internal.i.a((list == null || (c2749t = (C2749t) q.V(list)) == null || (c10 = c2749t.f44299c) == null) ? null : c10.f44218b, c2749t2.f44299c.f44218b)) {
                list.add(c2749t2);
            } else {
                arrayList2.add(kotlin.collections.l.t(c2749t2));
            }
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        for (List<C2749t> list2 : arrayList2) {
            P pB = this.f44802s.b(((C2749t) q.O(list2)).f44299c.f44218b);
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            this.f44804u = new l() { // from class: n2.i
                @Override // Ia.l
                public final Object invoke(Object obj2) {
                    List<C2749t> listSubList;
                    C2749t entry = (C2749t) obj2;
                    kotlin.jvm.internal.i.e(entry, "entry");
                    ref$BooleanRef.element = true;
                    ArrayList arrayList4 = arrayList;
                    int iIndexOf = arrayList4.indexOf(entry);
                    if (iIndexOf != -1) {
                        Ref$IntRef ref$IntRef2 = ref$IntRef;
                        int i12 = iIndexOf + 1;
                        listSubList = arrayList4.subList(ref$IntRef2.element, i12);
                        ref$IntRef2.element = i12;
                    } else {
                        listSubList = EmptyList.f42983b;
                    }
                    this.a(entry.f44299c, bundle, entry, listSubList);
                    return r.f47939a;
                }
            };
            pB.d(list2, j, aVar);
            this.f44804u = null;
        }
        return ref$BooleanRef.element;
    }

    public final void u(C2749t child) {
        kotlin.jvm.internal.i.e(child, "child");
        C2749t c2749t = (C2749t) this.j.remove(child);
        if (c2749t == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f44794k;
        a aVar = (a) linkedHashMap.get(c2749t);
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.f44750a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            w.a aVar2 = (w.a) this.f44803t.get(this.f44802s.b(c2749t.f44299c.f44218b));
            if (aVar2 != null) {
                aVar2.b(c2749t);
            }
            linkedHashMap.remove(c2749t);
        }
    }

    public final void v() {
        a aVar;
        s sVar;
        Set set;
        ArrayList<C2749t> arrayListP0 = q.p0(this.f44790f);
        if (arrayListP0.isEmpty()) {
            return;
        }
        ArrayList arrayListT = kotlin.collections.l.t(((C2749t) q.V(arrayListP0)).f44299c);
        ArrayList arrayList = new ArrayList();
        if (q.V(arrayListT) instanceof InterfaceC2739i) {
            Iterator it = q.e0(arrayListP0).iterator();
            while (it.hasNext()) {
                C c10 = ((C2749t) it.next()).f44299c;
                arrayList.add(c10);
                if (!(c10 instanceof InterfaceC2739i) && !(c10 instanceof E)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C2749t c2749t : q.e0(arrayListP0)) {
            Lifecycle.State state = c2749t.f44305i.f44761k;
            C c11 = c2749t.f44299c;
            C c12 = (C) q.P(arrayListT);
            if (c12 != null && c12.f44219c.f44813d == c11.f44219c.f44813d) {
                Lifecycle.State state2 = Lifecycle.State.f17753f;
                if (state != state2) {
                    w.a aVar2 = (w.a) this.f44803t.get(this.f44802s.b(c2749t.f44299c.f44218b));
                    if (kotlin.jvm.internal.i.a((aVar2 == null || (sVar = aVar2.f44279f) == null || (set = (Set) sVar.f43418b.getValue()) == null) ? null : Boolean.valueOf(set.contains(c2749t)), Boolean.TRUE) || ((aVar = (a) this.f44794k.get(c2749t)) != null && aVar.f44750a.get() == 0)) {
                        map.put(c2749t, Lifecycle.State.f17752e);
                    } else {
                        map.put(c2749t, state2);
                    }
                }
                C c13 = (C) q.P(arrayList);
                if (c13 != null && c13.f44219c.f44813d == c11.f44219c.f44813d) {
                    p.D(arrayList);
                }
                p.D(arrayListT);
                E e10 = c11.f44220d;
                if (e10 != null) {
                    arrayListT.add(e10);
                }
            } else if (arrayList.isEmpty() || c11.f44219c.f44813d != ((C) q.O(arrayList)).f44219c.f44813d) {
                c2749t.a(Lifecycle.State.f17751d);
            } else {
                C c14 = (C) p.D(arrayList);
                if (state == Lifecycle.State.f17753f) {
                    c2749t.a(Lifecycle.State.f17752e);
                } else {
                    Lifecycle.State state3 = Lifecycle.State.f17752e;
                    if (state != state3) {
                        map.put(c2749t, state3);
                    }
                }
                E e11 = c14.f44220d;
                if (e11 != null && !arrayList.contains(e11)) {
                    arrayList.add(e11);
                }
            }
        }
        for (C2749t c2749t2 : arrayListP0) {
            Lifecycle.State state4 = (Lifecycle.State) map.get(c2749t2);
            if (state4 != null) {
                c2749t2.a(state4);
            } else {
                c2749t2.f44305i.b();
            }
        }
    }
}
