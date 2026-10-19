package p141l2;

import Ia.l;
import Q8.d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import io.intercom.android.sdk.m5.conversation.ui.J;
import io.intercom.android.sdk.m5.conversation.ui.components.row.C2370b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.p;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import p163n2.e;
import p163n2.h;
import p163n2.j;
import p163n2.k;
import p248u2.f;
import p293xa.r;

/* JADX INFO: compiled from: NavController.android.kt */
/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f44310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f44311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f44312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f44313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f44314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f44315g;

    /* JADX INFO: compiled from: NavController.android.kt */
    public class a extends S {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final P<? extends C> f44316g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ w f44317h;

        public a(w wVar, P<? extends C> navigator) {
            i.e(navigator, "navigator");
            this.f44317h = wVar;
            this.f44316g = navigator;
        }

        @Override // p141l2.S
        public final C2749t a(C c10, Bundle bundle) {
            j jVar = this.f44317h.f44310b;
            jVar.getClass();
            return C2749t.a.a(jVar.f44785a.f44311c, c10, bundle, jVar.j(), jVar.f44798o);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0078  */
        @Override // p141l2.S
        public final void b(C2749t entry) {
            x xVar;
            b0 b0Var;
            i.e(entry, "entry");
            j jVar = this.f44317h.f44310b;
            jVar.getClass();
            LinkedHashMap linkedHashMap = jVar.f44806w;
            boolean zA = i.a(linkedHashMap.get(entry), Boolean.TRUE);
            super.b(entry);
            r rVar = r.f47939a;
            linkedHashMap.remove(entry);
            kotlin.collections.i<C2749t> iVar = jVar.f44790f;
            boolean zContains = iVar.contains(entry);
            StateFlowImpl stateFlowImpl = jVar.f44792h;
            if (zContains) {
                if (this.f44277d) {
                    return;
                }
                jVar.v();
                ArrayList arrayListP0 = q.p0(iVar);
                StateFlowImpl stateFlowImpl2 = jVar.f44791g;
                stateFlowImpl2.getClass();
                stateFlowImpl2.k(null, arrayListP0);
                ArrayList arrayListS = jVar.s();
                stateFlowImpl.getClass();
                stateFlowImpl.k(null, arrayListS);
                return;
            }
            jVar.u(entry);
            if (entry.f44305i.j.f17828d.compareTo(Lifecycle.State.f17751d) >= 0) {
                entry.a(Lifecycle.State.f17749b);
            }
            boolean zIsEmpty = iVar.isEmpty();
            String backStackEntryId = entry.f44303g;
            if (!zIsEmpty) {
                Iterator<C2749t> it = iVar.iterator();
                while (it.hasNext()) {
                    if (i.a(it.next().f44303g, backStackEntryId)) {
                    }
                }
                if (!zA) {
                    i.e(backStackEntryId, "backStackEntryId");
                    b0Var = (b0) xVar.f44319a.remove(backStackEntryId);
                    if (b0Var != null) {
                        b0Var.a();
                    }
                }
            } else if (!zA && (xVar = jVar.f44798o) != null) {
                i.e(backStackEntryId, "backStackEntryId");
                b0Var = (b0) xVar.f44319a.remove(backStackEntryId);
                if (b0Var != null) {
                    b0Var.a();
                }
            }
            jVar.v();
            ArrayList arrayListS2 = jVar.s();
            stateFlowImpl.getClass();
            stateFlowImpl.k(null, arrayListS2);
        }

        @Override // p141l2.S
        public final void c(C2749t c2749t, boolean z10) {
            j jVar = this.f44317h.f44310b;
            jVar.getClass();
            P pB = jVar.f44802s.b(c2749t.f44299c.f44218b);
            jVar.f44806w.put(c2749t, Boolean.valueOf(z10));
            if (!pB.equals(this.f44316g)) {
                Object obj = jVar.f44803t.get(pB);
                i.b(obj);
                ((a) obj).c(c2749t, z10);
                return;
            }
            h hVar = jVar.f44805v;
            if (hVar != null) {
                hVar.invoke(c2749t);
                super.c(c2749t, z10);
                r rVar = r.f47939a;
                return;
            }
            kotlin.collections.i<C2749t> iVar = jVar.f44790f;
            int iIndexOf = iVar.indexOf(c2749t);
            if (iIndexOf < 0) {
                String message = "Ignoring pop of " + c2749t + " as it was not found on the current back stack";
                i.e(message, "message");
                return;
            }
            int i10 = iIndexOf + 1;
            if (i10 != iVar.f43019d) {
                jVar.o(iVar.get(i10).f44299c.f44219c.f44813d, true, false);
            }
            j.r(jVar, c2749t);
            super.c(c2749t, z10);
            r rVar2 = r.f47939a;
            jVar.f44786b.invoke();
            jVar.b();
        }

        @Override // p141l2.S
        public final void e(C2749t entry) {
            i.e(entry, "entry");
            super.e(entry);
            j jVar = this.f44317h.f44310b;
            jVar.getClass();
            if (!jVar.f44790f.contains(entry)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            entry.a(Lifecycle.State.f17752e);
        }

        @Override // p141l2.S
        public final void f(C2749t backStackEntry) {
            i.e(backStackEntry, "backStackEntry");
            j jVar = this.f44317h.f44310b;
            jVar.getClass();
            P pB = jVar.f44802s.b(backStackEntry.f44299c.f44218b);
            if (!pB.equals(this.f44316g)) {
                Object obj = jVar.f44803t.get(pB);
                if (obj == null) {
                    throw new IllegalStateException(d.a(new StringBuilder("NavigatorBackStack for "), backStackEntry.f44299c.f44218b, " should already be created").toString());
                }
                ((a) obj).f(backStackEntry);
                return;
            }
            l<? super C2749t, r> lVar = jVar.f44804u;
            if (lVar != null) {
                lVar.invoke(backStackEntry);
                super.f(backStackEntry);
                return;
            }
            String message = "Ignoring add of destination " + backStackEntry.f44299c + " outside of the call to navigate(). ";
            i.e(message, "message");
        }

        public final void g(C2749t backStackEntry) {
            i.e(backStackEntry, "backStackEntry");
            super.f(backStackEntry);
        }
    }

    /* JADX INFO: compiled from: NavController.android.kt */
    public interface b {
        void a();
    }

    /* JADX INFO: compiled from: NavController.android.kt */
    public static final class c extends y {
        public c() {
            super(false);
        }

        @Override // androidx.activity.y
        public final void b() {
            w.this.f();
        }
    }

    public w(Context context) {
        i.e(context, "context");
        this.f44309a = context;
        this.f44310b = new j(this, new P9.b(3, this));
        this.f44311c = new e(context);
        for (Object obj : SequencesKt__SequencesKt.z(context, new C2370b(2))) {
            if (((Context) obj) instanceof Activity) {
                this.f44312d = (Activity) obj;
                this.f44314f = new c();
                this.f44315g = true;
                Q q10 = this.f44310b.f44802s;
                q10.a(new G(q10));
                this.f44310b.f44802s.a(new C2731a(this.f44309a));
                kotlin.a.a(new J(2, this));
            }
        }
        obj = null;
        this.f44312d = (Activity) obj;
        this.f44314f = new c();
        this.f44315g = true;
        Q q11 = this.f44310b.f44802s;
        q11.a(new G(q11));
        this.f44310b.f44802s.a(new C2731a(this.f44309a));
        kotlin.a.a(new J(2, this));
    }

    public static void d(w wVar, String route, J j, int i10) {
        if ((i10 & 2) != 0) {
            j = null;
        }
        wVar.getClass();
        i.e(route, "route");
        wVar.f44310b.m(route, j, null);
    }

    public static void g(w wVar, String route, boolean z10) {
        wVar.getClass();
        i.e(route, "route");
        j jVar = wVar.f44310b;
        jVar.getClass();
        if (jVar.p(route, z10, false)) {
            jVar.b();
        }
    }

    public final int a() {
        kotlin.collections.i<C2749t> iVar = this.f44310b.f44790f;
        int i10 = 0;
        if (iVar == null || !iVar.isEmpty()) {
            Iterator<C2749t> it = iVar.iterator();
            while (it.hasNext()) {
                if (!(it.next().f44299c instanceof E) && (i10 = i10 + 1) < 0) {
                    kotlin.collections.l.w();
                    throw null;
                }
            }
        }
        return i10;
    }

    public final C2749t b() {
        Object next;
        Iterator it = q.e0(this.f44310b.f44790f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ((kotlin.sequences.a) SequencesKt__SequencesKt.x(it)).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((C2749t) next).f44299c instanceof E)) {
                return (C2749t) next;
            }
        }
        next = null;
        return (C2749t) next;
    }

    public final void c(l lVar, String route) {
        i.e(route, "route");
        j jVar = this.f44310b;
        jVar.getClass();
        jVar.m(route, Fa.d.e(lVar), null);
    }

    public final boolean e() {
        Bundle bundleE;
        Intent intent;
        int i10 = 2;
        if (a() != 1) {
            return f();
        }
        Activity activity = this.f44312d;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        j jVar = this.f44310b;
        int i11 = 0;
        if (intArray == null) {
            C cH = jVar.h();
            i.b(cH);
            int i12 = cH.f44219c.f44813d;
            for (E e10 = cH.f44220d; e10 != null; e10 = e10.f44220d) {
                int i13 = e10.f44235g.f44821c;
                k kVar = e10.f44219c;
                if (i13 != i12) {
                    kotlin.collections.y.p();
                    Bundle bundleB = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        Intent intent2 = activity.getIntent();
                        i.d(intent2, "getIntent(...)");
                        f.b(intent2, bundleB);
                        E eK = jVar.k();
                        Intent intent3 = activity.getIntent();
                        i.d(intent3, "getIntent(...)");
                        C.b bVarA = eK.A(new B(intent3.getAction(), intent3.getType(), intent3.getData()), eK);
                        if ((bVarA != null ? bVarA.f44223c : null) != null && (bundleE = bVarA.f44222b.e(bVarA.f44223c)) != null) {
                            bundleB.putAll(bundleE);
                        }
                    }
                    A a10 = new A((H) this);
                    int i14 = kVar.f44813d;
                    ArrayList arrayList = a10.f44211e;
                    arrayList.clear();
                    arrayList.add(new A.a(i14, null));
                    if (a10.f44210d != null) {
                        a10.c();
                    }
                    a10.f44209c.putExtra("android-support-nav:controller:deepLinkExtras", bundleB);
                    a10.a().e();
                    if (activity == null) {
                        return true;
                    }
                    activity.finish();
                    return true;
                }
                i12 = kVar.f44813d;
            }
            return false;
        }
        if (this.f44313e) {
            i.b(activity);
            Intent intent4 = activity.getIntent();
            Bundle extras2 = intent4.getExtras();
            i.b(extras2);
            int[] intArray2 = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            i.b(intArray2);
            ArrayList arrayListE0 = kotlin.collections.k.e0(intArray2);
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            if (arrayListE0.size() >= 2) {
                int iIntValue = ((Number) p.E(arrayListE0)).intValue();
                if (parcelableArrayList != null) {
                }
                C cE = j.e(iIntValue, jVar.i(), null, false);
                if (cE instanceof E) {
                    int i15 = E.f44234h;
                    E e11 = (E) cE;
                    i.e(e11, "<this>");
                    iIntValue = ((C) SequencesKt___SequencesKt.E(SequencesKt__SequencesKt.z(e11, new io.intercom.android.sdk.m5.home.ui.b(i10)))).f44219c.f44813d;
                }
                C cH2 = jVar.h();
                if (cH2 != null && iIntValue == cH2.f44219c.f44813d) {
                    A a11 = new A((H) this);
                    kotlin.collections.y.p();
                    Bundle bundleB2 = p271w0.c.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    f.b(intent4, bundleB2);
                    Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                    if (bundle != null) {
                        bundleB2.putAll(bundle);
                    }
                    a11.f44209c.putExtra("android-support-nav:controller:deepLinkExtras", bundleB2);
                    for (Object obj : arrayListE0) {
                        int i16 = i11 + 1;
                        if (i11 < 0) {
                            kotlin.collections.l.x();
                            throw null;
                        }
                        a11.f44211e.add(new A.a(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i11) : null));
                        if (a11.f44210d != null) {
                            a11.c();
                        }
                        i11 = i16;
                    }
                    a11.a().e();
                    activity.finish();
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f() {
        j jVar = this.f44310b;
        if (jVar.f44790f.isEmpty()) {
            return false;
        }
        C cH = jVar.h();
        i.b(cH);
        return jVar.o(cH.f44219c.f44813d, true, false) && jVar.b();
    }
}
