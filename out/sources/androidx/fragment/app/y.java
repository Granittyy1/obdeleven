package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.C0845b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.e0;
import androidx.core.view.InterfaceC1299n;
import androidx.core.view.InterfaceC1303s;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.voltasit.obdeleven.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: FragmentManager.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Fragment f17657A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public p063f.f f17660D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public p063f.f f17661E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p063f.f f17662F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f17664H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f17665I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f17666J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f17667K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f17668L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList<C1336a> f17669M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList<Boolean> f17670N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ArrayList<Fragment> f17671O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public B f17672P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17675b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<Fragment> f17678e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OnBackPressedDispatcher f17680g;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractC1352q<?> f17696x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AbstractC1349n f17697y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Fragment f17698z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<q> f17674a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H f17676c = new H();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<C1336a> f17677d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.fragment.app.r f17679f = new androidx.fragment.app.r(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1336a f17681h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17682i = false;
    public final b j = new b();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicInteger f17683k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, C1338c> f17684l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map<String, Bundle> f17685m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map<String, o> f17686n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList<p> f17687o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1353s f17688p = new C1353s(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList<C> f17689q = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1354t f17690r = new A0.a() { // from class: androidx.fragment.app.t
        @Override // A0.a
        public final void a(Object obj) {
            Configuration configuration = (Configuration) obj;
            y yVar = this.f17652a;
            if (yVar.N()) {
                yVar.i(false, configuration);
            }
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1355u f17691s = new A0.a() { // from class: androidx.fragment.app.u
        @Override // A0.a
        public final void a(Object obj) {
            Integer num = (Integer) obj;
            y yVar = this.f17653a;
            if (yVar.N() && num.intValue() == 80) {
                yVar.m(false);
            }
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1356v f17692t = new A0.a() { // from class: androidx.fragment.app.v
        @Override // A0.a
        public final void a(Object obj) {
            androidx.core.app.m mVar = (androidx.core.app.m) obj;
            y yVar = this.f17654a;
            if (yVar.N()) {
                yVar.n(mVar.f16747a, false);
            }
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1357w f17693u = new A0.a() { // from class: androidx.fragment.app.w
        @Override // A0.a
        public final void a(Object obj) {
            androidx.core.app.G g10 = (androidx.core.app.G) obj;
            y yVar = this.f17655a;
            if (yVar.N()) {
                yVar.s(g10.f16688a, false);
            }
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f17694v = new c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17695w = -1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final d f17658B = new d();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final e f17659C = new e();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayDeque<n> f17663G = new ArrayDeque<>();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final f f17673Q = new f();

    /* JADX INFO: compiled from: FragmentManager.java */
    public class a implements p063f.b<Map<String, Boolean>> {
        public a() {
        }

        @Override // p063f.b
        public final void b(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            y yVar = y.this;
            n nVarPollFirst = yVar.f17663G.pollFirst();
            if (nVarPollFirst == null) {
                return;
            }
            Fragment fragmentC = yVar.f17676c.c(nVarPollFirst.f17711b);
            if (fragmentC == null) {
                return;
            }
            fragmentC.onRequestPermissionsResult(nVarPollFirst.f17712c, strArr, iArr);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public class b extends androidx.activity.y {
        public b() {
            super(false);
        }

        @Override // androidx.activity.y
        public final void a() {
            boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
            y yVar = y.this;
            if (zIsLoggable) {
                Objects.toString(yVar);
            }
            yVar.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(yVar.f17681h);
            }
            C1336a c1336a = yVar.f17681h;
            if (c1336a != null) {
                c1336a.f17570s = false;
                c1336a.h();
                C1336a c1336a2 = yVar.f17681h;
                e0 e0Var = new e0(1, yVar);
                if (c1336a2.f17499q == null) {
                    c1336a2.f17499q = new ArrayList<>();
                }
                c1336a2.f17499q.add(e0Var);
                yVar.f17681h.i();
                yVar.f17682i = true;
                yVar.z(true);
                yVar.E();
                yVar.f17682i = false;
                yVar.f17681h = null;
            }
        }

        @Override // androidx.activity.y
        public final void b() {
            boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
            y yVar = y.this;
            if (zIsLoggable) {
                Objects.toString(yVar);
            }
            yVar.f17682i = true;
            yVar.z(true);
            yVar.f17682i = false;
            C1336a c1336a = yVar.f17681h;
            b bVar = yVar.j;
            if (c1336a == null) {
                if (bVar.f8270a) {
                    Log.isLoggable("FragmentManager", 3);
                    yVar.S();
                    return;
                } else {
                    Log.isLoggable("FragmentManager", 3);
                    yVar.f17680g.c();
                    return;
                }
            }
            ArrayList<p> arrayList = yVar.f17687o;
            if (!arrayList.isEmpty()) {
                LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet(y.F(yVar.f17681h));
                for (p pVar : arrayList) {
                    for (Fragment fragment : linkedHashSet) {
                        pVar.getClass();
                    }
                }
            }
            Iterator<I.a> it = yVar.f17681h.f17484a.iterator();
            while (it.hasNext()) {
                Fragment fragment2 = it.next().f17501b;
                if (fragment2 != null) {
                    fragment2.mTransitioning = false;
                }
            }
            for (SpecialEffectsController specialEffectsController : yVar.f(new ArrayList(Collections.singletonList(yVar.f17681h)), 0, 1)) {
                specialEffectsController.getClass();
                Log.isLoggable("FragmentManager", 3);
                ArrayList arrayList2 = specialEffectsController.f17536c;
                specialEffectsController.l(arrayList2);
                specialEffectsController.c(arrayList2);
            }
            Iterator<I.a> it2 = yVar.f17681h.f17484a.iterator();
            while (it2.hasNext()) {
                Fragment fragment3 = it2.next().f17501b;
                if (fragment3 != null && fragment3.mContainer == null) {
                    yVar.g(fragment3).i();
                }
            }
            yVar.f17681h = null;
            yVar.g0();
            if (Log.isLoggable("FragmentManager", 3)) {
                boolean z10 = bVar.f8270a;
                yVar.toString();
            }
        }

        @Override // androidx.activity.y
        public final void c(C0845b backEvent) {
            boolean zIsLoggable = Log.isLoggable("FragmentManager", 2);
            y yVar = y.this;
            if (zIsLoggable) {
                Objects.toString(yVar);
            }
            if (yVar.f17681h != null) {
                for (SpecialEffectsController specialEffectsController : yVar.f(new ArrayList(Collections.singletonList(yVar.f17681h)), 0, 1)) {
                    specialEffectsController.getClass();
                    kotlin.jvm.internal.i.e(backEvent, "backEvent");
                    Log.isLoggable("FragmentManager", 2);
                    ArrayList arrayList = specialEffectsController.f17536c;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        kotlin.collections.p.z(arrayList2, ((SpecialEffectsController.Operation) it.next()).f17549k);
                    }
                    List listO0 = kotlin.collections.q.o0(kotlin.collections.q.s0(arrayList2));
                    int size = listO0.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((SpecialEffectsController.a) listO0.get(i10)).d(backEvent, specialEffectsController.f17534a);
                    }
                }
                Iterator<p> it2 = yVar.f17687o.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        }

        @Override // androidx.activity.y
        public final void d(C0845b c0845b) {
            boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
            y yVar = y.this;
            if (zIsLoggable) {
                Objects.toString(yVar);
            }
            yVar.w();
            yVar.getClass();
            yVar.x(yVar.new s(), false);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public class c implements InterfaceC1303s {
        public c() {
        }

        @Override // androidx.core.view.InterfaceC1303s
        public final boolean a(MenuItem menuItem) {
            return y.this.p(menuItem);
        }

        @Override // androidx.core.view.InterfaceC1303s
        public final void b(Menu menu) {
            y.this.q(menu);
        }

        @Override // androidx.core.view.InterfaceC1303s
        public final void c(Menu menu, MenuInflater menuInflater) {
            y.this.k(menu, menuInflater);
        }

        @Override // androidx.core.view.InterfaceC1303s
        public final void d(Menu menu) {
            y.this.t(menu);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public class d extends C1351p {
        public d() {
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public class e implements W {
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y.this.z(true);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public class g implements androidx.lifecycle.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f17704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ E f17705c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f17706d;

        public g(String str, E e10, Lifecycle lifecycle) {
            this.f17704b = str;
            this.f17705c = e10;
            this.f17706d = lifecycle;
        }

        @Override // androidx.lifecycle.r
        public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
            Bundle bundle;
            Lifecycle.Event event2 = Lifecycle.Event.ON_START;
            y yVar = y.this;
            String str = this.f17704b;
            if (event == event2 && (bundle = yVar.f17685m.get(str)) != null) {
                this.f17705c.h(bundle, str);
                yVar.f17685m.remove(str);
                Log.isLoggable("FragmentManager", 2);
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f17706d.c(this);
                yVar.f17686n.remove(str);
            }
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public class h implements C {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f17708b;

        public h(Fragment fragment) {
            this.f17708b = fragment;
        }

        @Override // androidx.fragment.app.C
        public final void a(Fragment fragment) {
            this.f17708b.onAttachFragment(fragment);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public class i implements p063f.b<p063f.a> {
        public i() {
        }

        @Override // p063f.b
        public final void b(p063f.a aVar) {
            p063f.a aVar2 = aVar;
            y yVar = y.this;
            n nVarPollLast = yVar.f17663G.pollLast();
            if (nVarPollLast == null) {
                return;
            }
            Fragment fragmentC = yVar.f17676c.c(nVarPollLast.f17711b);
            if (fragmentC == null) {
                return;
            }
            fragmentC.onActivityResult(nVarPollLast.f17712c, aVar2.f34886b, aVar2.f34887c);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public class j implements p063f.b<p063f.a> {
        public j() {
        }

        @Override // p063f.b
        public final void b(p063f.a aVar) {
            p063f.a aVar2 = aVar;
            y yVar = y.this;
            n nVarPollFirst = yVar.f17663G.pollFirst();
            if (nVarPollFirst == null) {
                return;
            }
            Fragment fragmentC = yVar.f17676c.c(nVarPollFirst.f17711b);
            if (fragmentC == null) {
                return;
            }
            fragmentC.onActivityResult(nVarPollFirst.f17712c, aVar2.f34886b, aVar2.f34887c);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public interface k {
        String getName();
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public static class l extends p076g.a<p063f.h, p063f.a> {
        @Override // p076g.a
        public final Intent createIntent(Context context, p063f.h hVar) {
            Bundle bundleExtra;
            p063f.h hVar2 = hVar;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = hVar2.f34899c;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = hVar2.f34898b;
                    kotlin.jvm.internal.i.e(intentSender, "intentSender");
                    hVar2 = new p063f.h(intentSender, null, hVar2.f34900d, hVar2.f34901e);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar2);
            if (Log.isLoggable("FragmentManager", 2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // p076g.a
        public final p063f.a parseResult(int i10, Intent intent) {
            return new p063f.a(i10, intent);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f17711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17712c;

        /* JADX INFO: compiled from: FragmentManager.java */
        public class a implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            public final n createFromParcel(Parcel parcel) {
                n nVar = new n();
                nVar.f17711b = parcel.readString();
                nVar.f17712c = parcel.readInt();
                return nVar;
            }

            @Override // android.os.Parcelable.Creator
            public final n[] newArray(int i10) {
                return new n[i10];
            }
        }

        public n(String str, int i10) {
            this.f17711b = str;
            this.f17712c = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f17711b);
            parcel.writeInt(this.f17712c);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public static class o implements E {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Lifecycle f17713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final E f17714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g f17715d;

        public o(Lifecycle lifecycle, E e10, g gVar) {
            this.f17713b = lifecycle;
            this.f17714c = e10;
            this.f17715d = gVar;
        }

        @Override // androidx.fragment.app.E
        public final void h(Bundle bundle, String str) {
            this.f17714c.h(bundle, str);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public interface p {
        void a();
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public interface q {
        boolean a(ArrayList<C1336a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public class r implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17718c;

        public r(String str, int i10, int i11) {
            this.f17716a = str;
            this.f17717b = i10;
            this.f17718c = i11;
        }

        @Override // androidx.fragment.app.y.q
        public final boolean a(ArrayList<C1336a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = y.this.f17657A;
            if (fragment != null && this.f17717b < 0 && this.f17716a == null && fragment.getChildFragmentManager().S()) {
                return false;
            }
            return y.this.U(arrayList, arrayList2, this.f17716a, this.f17717b, this.f17718c);
        }
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public class s implements q {
        public s() {
        }

        @Override // androidx.fragment.app.y.q
        public final boolean a(ArrayList<C1336a> arrayList, ArrayList<Boolean> arrayList2) {
            boolean zU;
            y yVar = y.this;
            yVar.getClass();
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(yVar.f17674a);
            }
            if (yVar.f17677d.isEmpty()) {
                zU = false;
            } else {
                C1336a c1336a = (C1336a) Z3.n.f(1, yVar.f17677d);
                yVar.f17681h = c1336a;
                Iterator<I.a> it = c1336a.f17484a.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f17501b;
                    if (fragment != null) {
                        fragment.mTransitioning = true;
                    }
                }
                zU = yVar.U(arrayList, arrayList2, null, -1, 0);
            }
            if (!yVar.f17687o.isEmpty() && arrayList.size() > 0) {
                arrayList2.get(arrayList.size() - 1).getClass();
                LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
                Iterator<C1336a> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.addAll(y.F(it2.next()));
                }
                for (p pVar : yVar.f17687o) {
                    for (Fragment fragment2 : linkedHashSet) {
                        pVar.getClass();
                    }
                }
            }
            return zU;
        }
    }

    public static HashSet F(C1336a c1336a) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < c1336a.f17484a.size(); i10++) {
            Fragment fragment = c1336a.f17484a.get(i10).f17501b;
            if (fragment != null && c1336a.f17490g) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean M(Fragment fragment) {
        if (!fragment.mHasMenu || !fragment.mMenuVisible) {
            boolean zM = false;
            for (Fragment fragment2 : fragment.mChildFragmentManager.f17676c.e()) {
                if (fragment2 != null) {
                    zM = M(fragment2);
                }
                if (zM) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean O(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        y yVar = fragment.mFragmentManager;
        return fragment.equals(yVar.f17657A) && O(yVar.f17698z);
    }

    public final void A(C1336a c1336a, boolean z10) {
        if (z10 && (this.f17696x == null || this.f17667K)) {
            return;
        }
        y(z10);
        C1336a c1336a2 = this.f17681h;
        if (c1336a2 != null) {
            c1336a2.f17570s = false;
            c1336a2.h();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(this.f17681h);
                Objects.toString(c1336a);
            }
            this.f17681h.j(false, false);
            this.f17681h.a(this.f17669M, this.f17670N);
            Iterator<I.a> it = this.f17681h.f17484a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f17501b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f17681h = null;
        }
        c1336a.a(this.f17669M, this.f17670N);
        this.f17675b = true;
        try {
            W(this.f17669M, this.f17670N);
            d();
            g0();
            boolean z11 = this.f17668L;
            H h8 = this.f17676c;
            if (z11) {
                this.f17668L = false;
                for (G g10 : h8.d()) {
                    Fragment fragment2 = g10.f17476c;
                    if (fragment2.mDeferStart) {
                        if (this.f17675b) {
                            this.f17668L = true;
                        } else {
                            fragment2.mDeferStart = false;
                            g10.i();
                        }
                    }
                }
            }
            h8.f17481b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0229 A[PHI: r15
      0x0229: PHI (r15v9 int) = (r15v8 int), (r15v11 int) binds: [B:103:0x0216, B:107:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    public final void B(ArrayList<C1336a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        ArrayList<I.a> arrayList3;
        C1336a c1336a;
        ArrayList<I.a> arrayList4;
        boolean z10;
        H h8;
        H h10;
        int i12;
        int i13;
        ArrayList<C1336a> arrayList5 = arrayList;
        boolean z11 = arrayList5.get(i10).f17498p;
        ArrayList<Fragment> arrayList6 = this.f17671O;
        if (arrayList6 == null) {
            this.f17671O = new ArrayList<>();
        } else {
            arrayList6.clear();
        }
        ArrayList<Fragment> arrayList7 = this.f17671O;
        H h11 = this.f17676c;
        arrayList7.addAll(h11.f());
        Fragment fragment = this.f17657A;
        int i14 = i10;
        boolean z12 = false;
        while (true) {
            int i15 = 1;
            if (i14 >= i11) {
                H h12 = h11;
                this.f17671O.clear();
                if (!z11 && this.f17695w >= 1) {
                    for (int i16 = i10; i16 < i11; i16++) {
                        Iterator<I.a> it = arrayList.get(i16).f17484a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment2 = it.next().f17501b;
                            if (fragment2 == null || fragment2.mFragmentManager == null) {
                                h8 = h12;
                            } else {
                                h8 = h12;
                                h8.g(g(fragment2));
                            }
                            h12 = h8;
                        }
                    }
                }
                for (int i17 = i10; i17 < i11; i17++) {
                    C1336a c1336a2 = arrayList.get(i17);
                    if (arrayList2.get(i17).booleanValue()) {
                        c1336a2.g(-1);
                        ArrayList<I.a> arrayList8 = c1336a2.f17484a;
                        boolean z13 = true;
                        int size = arrayList8.size() - 1;
                        while (size >= 0) {
                            I.a aVar = arrayList8.get(size);
                            Fragment fragment3 = aVar.f17501b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = false;
                                fragment3.setPopDirection(z13);
                                int i18 = c1336a2.f17489f;
                                int i19 = 8194;
                                int i20 = 4097;
                                if (i18 != 4097) {
                                    if (i18 != 8194) {
                                        i19 = 4100;
                                        if (i18 != 8197) {
                                            i20 = 4099;
                                            if (i18 != 4099) {
                                                i19 = i18 != 4100 ? 0 : 8197;
                                            } else {
                                                i19 = i20;
                                            }
                                        }
                                    } else {
                                        i19 = i20;
                                    }
                                }
                                fragment3.setNextTransition(i19);
                                fragment3.setSharedElementNames(c1336a2.f17497o, c1336a2.f17496n);
                            }
                            int i21 = aVar.f17500a;
                            y yVar = c1336a2.f17569r;
                            switch (i21) {
                                case 1:
                                    arrayList4 = arrayList8;
                                    fragment3.setAnimations(aVar.f17503d, aVar.f17504e, aVar.f17505f, aVar.f17506g);
                                    z10 = true;
                                    yVar.a0(fragment3, true);
                                    yVar.V(fragment3);
                                    size--;
                                    z13 = z10;
                                    arrayList8 = arrayList4;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f17500a);
                                case 3:
                                    arrayList4 = arrayList8;
                                    fragment3.setAnimations(aVar.f17503d, aVar.f17504e, aVar.f17505f, aVar.f17506g);
                                    yVar.a(fragment3);
                                    z10 = true;
                                    size--;
                                    z13 = z10;
                                    arrayList8 = arrayList4;
                                    break;
                                case 4:
                                    arrayList4 = arrayList8;
                                    fragment3.setAnimations(aVar.f17503d, aVar.f17504e, aVar.f17505f, aVar.f17506g);
                                    yVar.getClass();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (fragment3.mHidden) {
                                        fragment3.mHidden = false;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                    }
                                    z10 = true;
                                    size--;
                                    z13 = z10;
                                    arrayList8 = arrayList4;
                                    break;
                                case 5:
                                    arrayList4 = arrayList8;
                                    fragment3.setAnimations(aVar.f17503d, aVar.f17504e, aVar.f17505f, aVar.f17506g);
                                    yVar.a0(fragment3, true);
                                    yVar.L(fragment3);
                                    z10 = true;
                                    size--;
                                    z13 = z10;
                                    arrayList8 = arrayList4;
                                    break;
                                case 6:
                                    arrayList4 = arrayList8;
                                    fragment3.setAnimations(aVar.f17503d, aVar.f17504e, aVar.f17505f, aVar.f17506g);
                                    yVar.c(fragment3);
                                    z10 = true;
                                    size--;
                                    z13 = z10;
                                    arrayList8 = arrayList4;
                                    break;
                                case 7:
                                    arrayList4 = arrayList8;
                                    fragment3.setAnimations(aVar.f17503d, aVar.f17504e, aVar.f17505f, aVar.f17506g);
                                    yVar.a0(fragment3, true);
                                    yVar.h(fragment3);
                                    z10 = true;
                                    size--;
                                    z13 = z10;
                                    arrayList8 = arrayList4;
                                    break;
                                case 8:
                                    yVar.d0(null);
                                    arrayList4 = arrayList8;
                                    z10 = true;
                                    size--;
                                    z13 = z10;
                                    arrayList8 = arrayList4;
                                    break;
                                case 9:
                                    yVar.d0(fragment3);
                                    arrayList4 = arrayList8;
                                    z10 = true;
                                    size--;
                                    z13 = z10;
                                    arrayList8 = arrayList4;
                                    break;
                                case 10:
                                    yVar.c0(fragment3, aVar.f17507h);
                                    arrayList4 = arrayList8;
                                    z10 = true;
                                    size--;
                                    z13 = z10;
                                    arrayList8 = arrayList4;
                                    break;
                            }
                        }
                    } else {
                        c1336a2.g(1);
                        ArrayList<I.a> arrayList9 = c1336a2.f17484a;
                        int size2 = arrayList9.size();
                        int i22 = 0;
                        while (i22 < size2) {
                            I.a aVar2 = arrayList9.get(i22);
                            Fragment fragment4 = aVar2.f17501b;
                            if (fragment4 != null) {
                                fragment4.mBeingSaved = false;
                                fragment4.setPopDirection(false);
                                fragment4.setNextTransition(c1336a2.f17489f);
                                fragment4.setSharedElementNames(c1336a2.f17496n, c1336a2.f17497o);
                            }
                            int i23 = aVar2.f17500a;
                            y yVar2 = c1336a2.f17569r;
                            switch (i23) {
                                case 1:
                                    arrayList3 = arrayList9;
                                    c1336a = c1336a2;
                                    fragment4.setAnimations(aVar2.f17503d, aVar2.f17504e, aVar2.f17505f, aVar2.f17506g);
                                    yVar2.a0(fragment4, false);
                                    yVar2.a(fragment4);
                                    i22++;
                                    arrayList9 = arrayList3;
                                    c1336a2 = c1336a;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar2.f17500a);
                                case 3:
                                    arrayList3 = arrayList9;
                                    c1336a = c1336a2;
                                    fragment4.setAnimations(aVar2.f17503d, aVar2.f17504e, aVar2.f17505f, aVar2.f17506g);
                                    yVar2.V(fragment4);
                                    i22++;
                                    arrayList9 = arrayList3;
                                    c1336a2 = c1336a;
                                    break;
                                case 4:
                                    arrayList3 = arrayList9;
                                    c1336a = c1336a2;
                                    fragment4.setAnimations(aVar2.f17503d, aVar2.f17504e, aVar2.f17505f, aVar2.f17506g);
                                    yVar2.L(fragment4);
                                    i22++;
                                    arrayList9 = arrayList3;
                                    c1336a2 = c1336a;
                                    break;
                                case 5:
                                    arrayList3 = arrayList9;
                                    c1336a = c1336a2;
                                    fragment4.setAnimations(aVar2.f17503d, aVar2.f17504e, aVar2.f17505f, aVar2.f17506g);
                                    yVar2.a0(fragment4, false);
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Objects.toString(fragment4);
                                    }
                                    if (fragment4.mHidden) {
                                        fragment4.mHidden = false;
                                        fragment4.mHiddenChanged = !fragment4.mHiddenChanged;
                                    }
                                    i22++;
                                    arrayList9 = arrayList3;
                                    c1336a2 = c1336a;
                                    break;
                                case 6:
                                    arrayList3 = arrayList9;
                                    c1336a = c1336a2;
                                    fragment4.setAnimations(aVar2.f17503d, aVar2.f17504e, aVar2.f17505f, aVar2.f17506g);
                                    yVar2.h(fragment4);
                                    i22++;
                                    arrayList9 = arrayList3;
                                    c1336a2 = c1336a;
                                    break;
                                case 7:
                                    arrayList3 = arrayList9;
                                    c1336a = c1336a2;
                                    fragment4.setAnimations(aVar2.f17503d, aVar2.f17504e, aVar2.f17505f, aVar2.f17506g);
                                    yVar2.a0(fragment4, false);
                                    yVar2.c(fragment4);
                                    i22++;
                                    arrayList9 = arrayList3;
                                    c1336a2 = c1336a;
                                    break;
                                case 8:
                                    yVar2.d0(fragment4);
                                    arrayList3 = arrayList9;
                                    c1336a = c1336a2;
                                    i22++;
                                    arrayList9 = arrayList3;
                                    c1336a2 = c1336a;
                                    break;
                                case 9:
                                    yVar2.d0(null);
                                    arrayList3 = arrayList9;
                                    c1336a = c1336a2;
                                    i22++;
                                    arrayList9 = arrayList3;
                                    c1336a2 = c1336a;
                                    break;
                                case 10:
                                    yVar2.c0(fragment4, aVar2.f17508i);
                                    arrayList3 = arrayList9;
                                    c1336a = c1336a2;
                                    i22++;
                                    arrayList9 = arrayList3;
                                    c1336a2 = c1336a;
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = arrayList2.get(i11 - 1).booleanValue();
                ArrayList<p> arrayList10 = this.f17687o;
                if (z12 && !arrayList10.isEmpty()) {
                    LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
                    Iterator<C1336a> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(F(it2.next()));
                    }
                    if (this.f17681h == null) {
                        for (p pVar : arrayList10) {
                            for (Fragment fragment5 : linkedHashSet) {
                                pVar.getClass();
                            }
                        }
                        for (p pVar2 : arrayList10) {
                            for (Fragment fragment6 : linkedHashSet) {
                                pVar2.getClass();
                            }
                        }
                    }
                }
                for (int i24 = i10; i24 < i11; i24++) {
                    C1336a c1336a3 = arrayList.get(i24);
                    if (zBooleanValue) {
                        for (int size3 = c1336a3.f17484a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment7 = c1336a3.f17484a.get(size3).f17501b;
                            if (fragment7 != null) {
                                g(fragment7).i();
                            }
                        }
                    } else {
                        Iterator<I.a> it3 = c1336a3.f17484a.iterator();
                        while (it3.hasNext()) {
                            Fragment fragment8 = it3.next().f17501b;
                            if (fragment8 != null) {
                                g(fragment8).i();
                            }
                        }
                    }
                }
                P(this.f17695w, true);
                int i25 = i10;
                for (SpecialEffectsController specialEffectsController : f(arrayList, i25, i11)) {
                    specialEffectsController.f17538e = zBooleanValue;
                    specialEffectsController.k();
                    specialEffectsController.e();
                }
                while (i25 < i11) {
                    C1336a c1336a4 = arrayList.get(i25);
                    if (arrayList2.get(i25).booleanValue() && c1336a4.f17571t >= 0) {
                        c1336a4.f17571t = -1;
                    }
                    if (c1336a4.f17499q != null) {
                        for (int i26 = 0; i26 < c1336a4.f17499q.size(); i26++) {
                            c1336a4.f17499q.get(i26).run();
                        }
                        c1336a4.f17499q = null;
                    }
                    i25++;
                }
                if (z12) {
                    for (int i27 = 0; i27 < arrayList10.size(); i27++) {
                        arrayList10.get(i27).a();
                    }
                    return;
                }
                return;
            }
            C1336a c1336a5 = arrayList5.get(i14);
            if (arrayList2.get(i14).booleanValue()) {
                h10 = h11;
                int i28 = 1;
                ArrayList<Fragment> arrayList11 = this.f17671O;
                ArrayList<I.a> arrayList12 = c1336a5.f17484a;
                int size4 = arrayList12.size() - 1;
                while (size4 >= 0) {
                    I.a aVar3 = arrayList12.get(size4);
                    int i29 = aVar3.f17500a;
                    if (i29 != i28) {
                        if (i29 != 3) {
                            switch (i29) {
                                case 6:
                                    arrayList11.add(aVar3.f17501b);
                                    break;
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = aVar3.f17501b;
                                    break;
                                case 10:
                                    aVar3.f17508i = aVar3.f17507h;
                                    break;
                            }
                        } else {
                            arrayList11.add(aVar3.f17501b);
                        }
                        size4--;
                        i28 = 1;
                    }
                    arrayList11.remove(aVar3.f17501b);
                    size4--;
                    i28 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList13 = this.f17671O;
                int i30 = 0;
                while (true) {
                    ArrayList<I.a> arrayList14 = c1336a5.f17484a;
                    if (i30 < arrayList14.size()) {
                        I.a aVar4 = arrayList14.get(i30);
                        int i31 = aVar4.f17500a;
                        if (i31 != i15) {
                            if (i31 != 2) {
                                if (i31 == 3 || i31 == 6) {
                                    arrayList13.remove(aVar4.f17501b);
                                    Fragment fragment9 = aVar4.f17501b;
                                    if (fragment9 == fragment) {
                                        arrayList14.add(i30, new I.a(fragment9, 9));
                                        i30++;
                                        h11 = h11;
                                        i12 = 1;
                                        fragment = null;
                                    }
                                } else if (i31 == 7) {
                                    i12 = 1;
                                } else if (i31 == 8) {
                                    arrayList14.add(i30, new I.a(9, fragment, 0));
                                    aVar4.f17502c = true;
                                    i30++;
                                    fragment = aVar4.f17501b;
                                }
                                h11 = h11;
                                i12 = 1;
                            } else {
                                Fragment fragment10 = aVar4.f17501b;
                                int i32 = fragment10.mContainerId;
                                int size5 = arrayList13.size() - 1;
                                boolean z14 = false;
                                while (size5 >= 0) {
                                    H h13 = h11;
                                    Fragment fragment11 = arrayList13.get(size5);
                                    if (fragment11.mContainerId != i32) {
                                        i32 = i32;
                                    } else if (fragment11 == fragment10) {
                                        i32 = i32;
                                        z14 = true;
                                    } else {
                                        if (fragment11 == fragment) {
                                            arrayList14.add(i30, new I.a(9, fragment11, 0));
                                            i30++;
                                            i13 = 0;
                                            fragment = null;
                                        } else {
                                            i13 = 0;
                                        }
                                        I.a aVar5 = new I.a(3, fragment11, i13);
                                        aVar5.f17503d = aVar4.f17503d;
                                        aVar5.f17505f = aVar4.f17505f;
                                        aVar5.f17504e = aVar4.f17504e;
                                        aVar5.f17506g = aVar4.f17506g;
                                        arrayList14.add(i30, aVar5);
                                        arrayList13.remove(fragment11);
                                        i30++;
                                        fragment = fragment;
                                    }
                                    size5--;
                                    i32 = i32;
                                    h11 = h13;
                                }
                                h11 = h11;
                                i12 = 1;
                                if (z14) {
                                    arrayList14.remove(i30);
                                    i30--;
                                } else {
                                    aVar4.f17500a = 1;
                                    aVar4.f17502c = true;
                                    arrayList13.add(fragment10);
                                }
                            }
                            i30 += i12;
                            i15 = i12;
                            h11 = h11;
                        } else {
                            i12 = i15;
                        }
                        arrayList13.add(aVar4.f17501b);
                        i30 += i12;
                        i15 = i12;
                        h11 = h11;
                    } else {
                        h10 = h11;
                    }
                }
            }
            z12 = z12 || c1336a5.f17490g;
            i14++;
            arrayList5 = arrayList;
            h11 = h10;
        }
    }

    public final Fragment C(int i10) {
        H h8 = this.f17676c;
        ArrayList<Fragment> arrayList = h8.f17480a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (G g10 : h8.f17481b.values()) {
            if (g10 != null) {
                Fragment fragment2 = g10.f17476c;
                if (fragment2.mFragmentId == i10) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment D(String str) {
        H h8 = this.f17676c;
        if (str != null) {
            ArrayList<Fragment> arrayList = h8.f17480a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (G g10 : h8.f17481b.values()) {
                if (g10 != null) {
                    Fragment fragment2 = g10.f17476c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            h8.getClass();
        }
        return null;
    }

    public final void E() {
        for (SpecialEffectsController specialEffectsController : e()) {
            if (specialEffectsController.f17539f) {
                Log.isLoggable("FragmentManager", 2);
                specialEffectsController.f17539f = false;
                specialEffectsController.e();
            }
        }
    }

    public final k G(int i10) {
        if (i10 != this.f17677d.size()) {
            return this.f17677d.get(i10);
        }
        C1336a c1336a = this.f17681h;
        if (c1336a != null) {
            return c1336a;
        }
        throw new IndexOutOfBoundsException();
    }

    public final int H() {
        return this.f17677d.size() + (this.f17681h != null ? 1 : 0);
    }

    public final ViewGroup I(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f17697y.c()) {
            View viewB = this.f17697y.b(fragment.mContainerId);
            if (viewB instanceof ViewGroup) {
                return (ViewGroup) viewB;
            }
        }
        return null;
    }

    public final C1351p J() {
        Fragment fragment = this.f17698z;
        return fragment != null ? fragment.mFragmentManager.J() : this.f17658B;
    }

    public final W K() {
        Fragment fragment = this.f17698z;
        return fragment != null ? fragment.mFragmentManager.K() : this.f17659C;
    }

    public final void L(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        e0(fragment);
    }

    public final boolean N() {
        Fragment fragment = this.f17698z;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.f17698z.getParentFragmentManager().N();
    }

    public final void P(int i10, boolean z10) {
        HashMap<String, G> map;
        AbstractC1352q<?> abstractC1352q;
        if (this.f17696x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f17695w) {
            this.f17695w = i10;
            H h8 = this.f17676c;
            Iterator<Fragment> it = h8.f17480a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = h8.f17481b;
                if (!zHasNext) {
                    break;
                }
                G g10 = map.get(it.next().mWho);
                if (g10 != null) {
                    g10.i();
                }
            }
            for (G g11 : map.values()) {
                if (g11 != null) {
                    g11.i();
                    Fragment fragment = g11.f17476c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !h8.f17482c.containsKey(fragment.mWho)) {
                            h8.i(g11.l(), fragment.mWho);
                        }
                        h8.h(g11);
                    }
                }
            }
            for (G g12 : h8.d()) {
                Fragment fragment2 = g12.f17476c;
                if (fragment2.mDeferStart) {
                    if (this.f17675b) {
                        this.f17668L = true;
                    } else {
                        fragment2.mDeferStart = false;
                        g12.i();
                    }
                }
            }
            if (this.f17664H && (abstractC1352q = this.f17696x) != null && this.f17695w == 7) {
                abstractC1352q.h();
                this.f17664H = false;
            }
        }
    }

    public final void Q() {
        if (this.f17696x == null) {
            return;
        }
        this.f17665I = false;
        this.f17666J = false;
        this.f17672P.f17385f = false;
        for (Fragment fragment : this.f17676c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void R() {
        x(new r(null, -1, 0), false);
    }

    public final boolean S() {
        return T(null, -1, 0);
    }

    public final boolean T(String str, int i10, int i11) {
        z(false);
        y(true);
        Fragment fragment = this.f17657A;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().S()) {
            return true;
        }
        boolean zU = U(this.f17669M, this.f17670N, str, i10, i11);
        if (zU) {
            this.f17675b = true;
            try {
                W(this.f17669M, this.f17670N);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        g0();
        boolean z10 = this.f17668L;
        H h8 = this.f17676c;
        if (z10) {
            this.f17668L = false;
            for (G g10 : h8.d()) {
                Fragment fragment2 = g10.f17476c;
                if (fragment2.mDeferStart) {
                    if (this.f17675b) {
                        this.f17668L = true;
                    } else {
                        fragment2.mDeferStart = false;
                        g10.i();
                    }
                }
            }
        }
        h8.f17481b.values().removeAll(Collections.singleton(null));
        return zU;
    }

    public final boolean U(ArrayList<C1336a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        boolean z10 = (i11 & 1) != 0;
        int size = -1;
        if (!this.f17677d.isEmpty()) {
            if (str != null || i10 >= 0) {
                int size2 = this.f17677d.size() - 1;
                while (size2 >= 0) {
                    C1336a c1336a = this.f17677d.get(size2);
                    if ((str != null && str.equals(c1336a.f17492i)) || (i10 >= 0 && i10 == c1336a.f17571t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z10) {
                        while (size2 > 0) {
                            C1336a c1336a2 = this.f17677d.get(size2 - 1);
                            if ((str == null || !str.equals(c1336a2.f17492i)) && (i10 < 0 || i10 != c1336a2.f17571t)) {
                                break;
                            }
                            size2--;
                        }
                    } else if (size2 != this.f17677d.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            } else {
                size = z10 ? 0 : this.f17677d.size() - 1;
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f17677d.size() - 1; size3 >= size; size3--) {
            arrayList.add(this.f17677d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
            int i10 = fragment.mBackStackNesting;
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        H h8 = this.f17676c;
        synchronized (h8.f17480a) {
            h8.f17480a.remove(fragment);
        }
        fragment.mAdded = false;
        if (M(fragment)) {
            this.f17664H = true;
        }
        fragment.mRemoving = true;
        e0(fragment);
    }

    public final void W(ArrayList<C1336a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f17498p) {
                if (i11 != i10) {
                    B(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f17498p) {
                        i11++;
                    }
                }
                B(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            B(arrayList, arrayList2, i11, size);
        }
    }

    public final void X(Bundle bundle) {
        C1353s c1353s;
        int i10;
        G g10;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f17696x.f17632c.getClassLoader());
                this.f17685m.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f17696x.f17632c.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        H h8 = this.f17676c;
        HashMap<String, Bundle> map2 = h8.f17482c;
        map2.clear();
        map2.putAll(map);
        A a10 = (A) bundle.getParcelable("state");
        if (a10 == null) {
            return;
        }
        HashMap<String, G> map3 = h8.f17481b;
        map3.clear();
        Iterator<String> it = a10.f17371b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c1353s = this.f17688p;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = h8.i(null, it.next());
            if (bundleI != null) {
                Fragment fragment = this.f17672P.f17380a.get(((F) bundleI.getParcelable("state")).f17422c);
                if (fragment != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        fragment.toString();
                    }
                    g10 = new G(c1353s, h8, fragment, bundleI);
                } else {
                    g10 = new G(this.f17688p, this.f17676c, this.f17696x.f17632c.getClassLoader(), J(), bundleI);
                }
                Fragment fragment2 = g10.f17476c;
                fragment2.mSavedFragmentState = bundleI;
                fragment2.mFragmentManager = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragment2.toString();
                }
                g10.j(this.f17696x.f17632c.getClassLoader());
                h8.g(g10);
                g10.f17478e = this.f17695w;
            }
        }
        B b10 = this.f17672P;
        b10.getClass();
        for (Fragment fragment3 : new ArrayList(b10.f17380a.values())) {
            if (map3.get(fragment3.mWho) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragment3.toString();
                    Objects.toString(a10.f17371b);
                }
                this.f17672P.e(fragment3);
                fragment3.mFragmentManager = this;
                G g11 = new G(c1353s, h8, fragment3);
                g11.f17478e = 1;
                g11.i();
                fragment3.mRemoving = true;
                g11.i();
            }
        }
        ArrayList<String> arrayList = a10.f17372c;
        h8.f17480a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentB = h8.b(str3);
                if (fragmentB == null) {
                    throw new IllegalStateException(androidx.compose.foundation.gestures.d.b("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragmentB.toString();
                }
                h8.a(fragmentB);
            }
        }
        if (a10.f17373d != null) {
            this.f17677d = new ArrayList<>(a10.f17373d.length);
            int i11 = 0;
            while (true) {
                C1337b[] c1337bArr = a10.f17373d;
                if (i11 >= c1337bArr.length) {
                    break;
                }
                C1337b c1337b = c1337bArr[i11];
                c1337b.getClass();
                C1336a c1336a = new C1336a(this);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int[] iArr = c1337b.f17572b;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    I.a aVar = new I.a();
                    int i14 = i12 + 1;
                    aVar.f17500a = iArr[i12];
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(c1336a);
                        int i15 = iArr[i14];
                    }
                    aVar.f17507h = Lifecycle.State.values()[c1337b.f17574d[i13]];
                    aVar.f17508i = Lifecycle.State.values()[c1337b.f17575e[i13]];
                    int i16 = i12 + 2;
                    aVar.f17502c = iArr[i14] != 0;
                    int i17 = iArr[i16];
                    aVar.f17503d = i17;
                    int i18 = iArr[i12 + 3];
                    aVar.f17504e = i18;
                    int i19 = i12 + 5;
                    int i20 = iArr[i12 + 4];
                    aVar.f17505f = i20;
                    i12 += 6;
                    int i21 = iArr[i19];
                    aVar.f17506g = i21;
                    c1336a.f17485b = i17;
                    c1336a.f17486c = i18;
                    c1336a.f17487d = i20;
                    c1336a.f17488e = i21;
                    c1336a.b(aVar);
                    i13++;
                }
                c1336a.f17489f = c1337b.f17576f;
                c1336a.f17492i = c1337b.f17577g;
                c1336a.f17490g = true;
                c1336a.j = c1337b.f17579i;
                c1336a.f17493k = c1337b.j;
                c1336a.f17494l = c1337b.f17580k;
                c1336a.f17495m = c1337b.f17581l;
                c1336a.f17496n = c1337b.f17582m;
                c1336a.f17497o = c1337b.f17583n;
                c1336a.f17498p = c1337b.f17584o;
                c1336a.f17571t = c1337b.f17578h;
                int i22 = 0;
                while (true) {
                    ArrayList<String> arrayList2 = c1337b.f17573c;
                    if (i22 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = arrayList2.get(i22);
                    if (str4 != null) {
                        c1336a.f17484a.get(i22).f17501b = h8.b(str4);
                    }
                    i22++;
                }
                c1336a.g(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    c1336a.toString();
                    PrintWriter printWriter = new PrintWriter(new T());
                    c1336a.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.f17677d.add(c1336a);
                i11++;
            }
            i10 = 0;
        } else {
            i10 = 0;
            this.f17677d = new ArrayList<>();
        }
        this.f17683k.set(a10.f17374e);
        String str5 = a10.f17375f;
        if (str5 != null) {
            Fragment fragmentB2 = h8.b(str5);
            this.f17657A = fragmentB2;
            r(fragmentB2);
        }
        ArrayList<String> arrayList3 = a10.f17376g;
        if (arrayList3 != null) {
            for (int i23 = i10; i23 < arrayList3.size(); i23++) {
                this.f17684l.put(arrayList3.get(i23), a10.f17377h.get(i23));
            }
        }
        this.f17663G = new ArrayDeque<>(a10.f17378i);
    }

    public final Bundle Y() {
        C1337b[] c1337bArr;
        ArrayList<String> arrayList;
        Bundle bundle = new Bundle();
        E();
        w();
        z(true);
        this.f17665I = true;
        this.f17672P.f17385f = true;
        H h8 = this.f17676c;
        h8.getClass();
        HashMap<String, G> map = h8.f17481b;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        for (G g10 : map.values()) {
            if (g10 != null) {
                Fragment fragment = g10.f17476c;
                h8.i(g10.l(), fragment.mWho);
                arrayList2.add(fragment.mWho);
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        HashMap<String, Bundle> map2 = this.f17676c.f17482c;
        if (map2.isEmpty()) {
            Log.isLoggable("FragmentManager", 2);
        } else {
            H h10 = this.f17676c;
            synchronized (h10.f17480a) {
                try {
                    c1337bArr = null;
                    if (h10.f17480a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList<>(h10.f17480a.size());
                        for (Fragment fragment2 : h10.f17480a) {
                            arrayList.add(fragment2.mWho);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                fragment2.toString();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = this.f17677d.size();
            if (size > 0) {
                c1337bArr = new C1337b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    c1337bArr[i10] = new C1337b(this.f17677d.get(i10));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(this.f17677d.get(i10));
                    }
                }
            }
            A a10 = new A();
            a10.f17371b = arrayList2;
            a10.f17372c = arrayList;
            a10.f17373d = c1337bArr;
            a10.f17374e = this.f17683k.get();
            Fragment fragment3 = this.f17657A;
            if (fragment3 != null) {
                a10.f17375f = fragment3.mWho;
            }
            a10.f17376g.addAll(this.f17684l.keySet());
            a10.f17377h.addAll(this.f17684l.values());
            a10.f17378i = new ArrayList<>(this.f17663G);
            bundle.putParcelable("state", a10);
            for (String str : this.f17685m.keySet()) {
                bundle.putBundle(B7.b.c("result_", str), this.f17685m.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(B7.b.c("fragment_", str2), map2.get(str2));
            }
        }
        return bundle;
    }

    public final void Z() {
        synchronized (this.f17674a) {
            try {
                if (this.f17674a.size() == 1) {
                    this.f17696x.f17633d.removeCallbacks(this.f17673Q);
                    this.f17696x.f17633d.post(this.f17673Q);
                    g0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final G a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.c(fragment, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
        G g10 = g(fragment);
        fragment.mFragmentManager = this;
        H h8 = this.f17676c;
        h8.g(g10);
        if (!fragment.mDetached) {
            h8.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (M(fragment)) {
                this.f17664H = true;
            }
        }
        return g10;
    }

    public final void a0(Fragment fragment, boolean z10) {
        ViewGroup viewGroupI = I(fragment);
        if (viewGroupI == null || !(viewGroupI instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupI).setDrawDisappearingViewsLast(!z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(AbstractC1352q<?> abstractC1352q, AbstractC1349n abstractC1349n, Fragment fragment) {
        InterfaceC1376t interfaceC1376t;
        if (this.f17696x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f17696x = abstractC1352q;
        this.f17697y = abstractC1349n;
        this.f17698z = fragment;
        CopyOnWriteArrayList<C> copyOnWriteArrayList = this.f17689q;
        if (fragment != null) {
            copyOnWriteArrayList.add(new h(fragment));
        } else if (abstractC1352q instanceof C) {
            copyOnWriteArrayList.add((C) abstractC1352q);
        }
        if (this.f17698z != null) {
            g0();
        }
        if (abstractC1352q instanceof androidx.activity.C) {
            androidx.activity.C c10 = (androidx.activity.C) abstractC1352q;
            OnBackPressedDispatcher onBackPressedDispatcher = c10.getOnBackPressedDispatcher();
            this.f17680g = onBackPressedDispatcher;
            if (fragment != null) {
                interfaceC1376t = c10;
                interfaceC1376t = fragment;
            }
            interfaceC1376t = c10;
            onBackPressedDispatcher.a(interfaceC1376t, this.j);
        }
        if (fragment != null) {
            B b10 = fragment.mFragmentManager.f17672P;
            HashMap<String, B> map = b10.f17381b;
            B b11 = map.get(fragment.mWho);
            if (b11 == null) {
                b11 = new B(b10.f17383d);
                map.put(fragment.mWho, b11);
            }
            this.f17672P = b11;
        } else if (abstractC1352q instanceof c0) {
            b0 store = ((c0) abstractC1352q).getViewModelStore();
            B.a aVar = B.f17379g;
            kotlin.jvm.internal.i.e(store, "store");
            p014b1.a.C0207a defaultCreationExtras = p014b1.a.C0207a.f20498b;
            kotlin.jvm.internal.i.e(defaultCreationExtras, "defaultCreationExtras");
            p014b1.f fVar = new p014b1.f(store, aVar, defaultCreationExtras);
            kotlin.jvm.internal.c cVarA = kotlin.jvm.internal.l.a(B.class);
            String strI = cVarA.i();
            if (strI == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f17672P = (B) fVar.a(cVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        } else {
            this.f17672P = new B(false);
        }
        B b12 = this.f17672P;
        b12.f17385f = this.f17665I || this.f17666J;
        this.f17676c.f17483d = b12;
        Object obj = this.f17696x;
        if ((obj instanceof p248u2.e) && fragment == null) {
            p248u2.c savedStateRegistry = ((p248u2.e) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new u2.c.b() { // from class: androidx.fragment.app.x
                @Override // u2.c.b
                public final Bundle a() {
                    return this.f17656a.Y();
                }
            });
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                X(bundleA);
            }
        }
        Object obj2 = this.f17696x;
        if (obj2 instanceof p063f.g) {
            androidx.activity.result.a activityResultRegistry = ((p063f.g) obj2).getActivityResultRegistry();
            String strC = B7.b.c("FragmentManager:", fragment != null ? Q8.d.a(new StringBuilder(), fragment.mWho, ":") : "");
            this.f17660D = activityResultRegistry.d(androidx.compose.ui.text.font.s.b(strC, "StartActivityForResult"), new p076g.d(), new i());
            this.f17661E = activityResultRegistry.d(androidx.compose.ui.text.font.s.b(strC, "StartIntentSenderForResult"), new l(), new j());
            this.f17662F = activityResultRegistry.d(androidx.compose.ui.text.font.s.b(strC, "RequestPermissions"), new p076g.b(), new a());
        }
        Object obj3 = this.f17696x;
        if (obj3 instanceof p186p0.c) {
            ((p186p0.c) obj3).addOnConfigurationChangedListener(this.f17690r);
        }
        Object obj4 = this.f17696x;
        if (obj4 instanceof p186p0.d) {
            ((p186p0.d) obj4).addOnTrimMemoryListener(this.f17691s);
        }
        Object obj5 = this.f17696x;
        if (obj5 instanceof androidx.core.app.D) {
            ((androidx.core.app.D) obj5).addOnMultiWindowModeChangedListener(this.f17692t);
        }
        Object obj6 = this.f17696x;
        if (obj6 instanceof androidx.core.app.E) {
            ((androidx.core.app.E) obj6).addOnPictureInPictureModeChangedListener(this.f17693u);
        }
        Object obj7 = this.f17696x;
        if ((obj7 instanceof InterfaceC1299n) && fragment == null) {
            ((InterfaceC1299n) obj7).addMenuProvider(this.f17694v);
        }
    }

    public final void b0(String str, InterfaceC1376t interfaceC1376t, E e10) {
        Lifecycle lifecycle = interfaceC1376t.getLifecycle();
        if (lifecycle.b() == Lifecycle.State.f17749b) {
            return;
        }
        g gVar = new g(str, e10, lifecycle);
        o oVarPut = this.f17686n.put(str, new o(lifecycle, e10, gVar));
        if (oVarPut != null) {
            oVarPut.f17713b.c(oVarPut.f17715d);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            lifecycle.toString();
            Objects.toString(e10);
        }
        lifecycle.a(gVar);
    }

    public final void c(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f17676c.a(fragment);
            if (Log.isLoggable("FragmentManager", 2)) {
                fragment.toString();
            }
            if (M(fragment)) {
                this.f17664H = true;
            }
        }
    }

    public final void c0(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(this.f17676c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void d() {
        this.f17675b = false;
        this.f17670N.clear();
        this.f17669M.clear();
    }

    public final void d0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f17676c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.f17657A;
        this.f17657A = fragment;
        r(fragment2);
        r(this.f17657A);
    }

    public final HashSet e() {
        Object defaultSpecialEffectsController;
        HashSet hashSet = new HashSet();
        Iterator it = this.f17676c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((G) it.next()).f17476c.mContainer;
            if (viewGroup != null) {
                W factory = K();
                kotlin.jvm.internal.i.e(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof SpecialEffectsController) {
                    defaultSpecialEffectsController = (SpecialEffectsController) tag;
                } else {
                    defaultSpecialEffectsController = new DefaultSpecialEffectsController(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, defaultSpecialEffectsController);
                }
                hashSet.add(defaultSpecialEffectsController);
            }
        }
        return hashSet;
    }

    public final void e0(Fragment fragment) {
        ViewGroup viewGroupI = I(fragment);
        if (viewGroupI != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupI.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupI.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupI.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<I.a> it = ((C1336a) arrayList.get(i10)).f17484a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f17501b;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(SpecialEffectsController.i(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public final void f0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new T());
        AbstractC1352q<?> abstractC1352q = this.f17696x;
        if (abstractC1352q != null) {
            try {
                abstractC1352q.d(printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw illegalStateException;
            }
        }
        try {
            v("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw illegalStateException;
        }
    }

    public final G g(Fragment fragment) {
        String str = fragment.mWho;
        H h8 = this.f17676c;
        G g10 = h8.f17481b.get(str);
        if (g10 != null) {
            return g10;
        }
        G g11 = new G(this.f17688p, h8, fragment);
        g11.j(this.f17696x.f17632c.getClassLoader());
        g11.f17478e = this.f17695w;
        return g11;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Ia.a, kotlin.jvm.internal.FunctionReferenceImpl] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Ia.a, kotlin.jvm.internal.FunctionReferenceImpl] */
    public final void g0() {
        synchronized (this.f17674a) {
            try {
                if (!this.f17674a.isEmpty()) {
                    b bVar = this.j;
                    bVar.f8270a = true;
                    ?? r10 = bVar.f8272c;
                    if (r10 != 0) {
                        r10.invoke();
                    }
                    if (Log.isLoggable("FragmentManager", 3)) {
                        toString();
                    }
                    return;
                }
                boolean z10 = H() > 0 && O(this.f17698z);
                if (Log.isLoggable("FragmentManager", 3)) {
                    toString();
                }
                b bVar2 = this.j;
                bVar2.f8270a = z10;
                ?? r11 = bVar2.f8272c;
                if (r11 != 0) {
                    r11.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(Fragment fragment) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (Log.isLoggable("FragmentManager", 2)) {
                fragment.toString();
            }
            H h8 = this.f17676c;
            synchronized (h8.f17480a) {
                h8.f17480a.remove(fragment);
            }
            fragment.mAdded = false;
            if (M(fragment)) {
                this.f17664H = true;
            }
            e0(fragment);
        }
    }

    public final void i(boolean z10, Configuration configuration) {
        if (z10 && (this.f17696x instanceof p186p0.c)) {
            f0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f17676c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z10) {
                    fragment.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.f17695w < 1) {
            return false;
        }
        for (Fragment fragment : this.f17676c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f17695w < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f17676c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f17678e != null) {
            for (int i10 = 0; i10 < this.f17678e.size(); i10++) {
                Fragment fragment2 = this.f17678e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f17678e = arrayList;
        return z10;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.f17667K = true;
        z(true);
        w();
        AbstractC1352q<?> abstractC1352q = this.f17696x;
        boolean z10 = abstractC1352q instanceof c0;
        H h8 = this.f17676c;
        if (z10) {
            zIsChangingConfigurations = h8.f17483d.f17384e;
        } else {
            ActivityC1347l activityC1347l = abstractC1352q.f17632c;
            if (activityC1347l != null) {
                zIsChangingConfigurations = true ^ activityC1347l.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<C1338c> it = this.f17684l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = it.next().f17585b.iterator();
                while (it2.hasNext()) {
                    h8.f17483d.c((String) it2.next(), false);
                }
            }
        }
        u(-1);
        Object obj = this.f17696x;
        if (obj instanceof p186p0.d) {
            ((p186p0.d) obj).removeOnTrimMemoryListener(this.f17691s);
        }
        Object obj2 = this.f17696x;
        if (obj2 instanceof p186p0.c) {
            ((p186p0.c) obj2).removeOnConfigurationChangedListener(this.f17690r);
        }
        Object obj3 = this.f17696x;
        if (obj3 instanceof androidx.core.app.D) {
            ((androidx.core.app.D) obj3).removeOnMultiWindowModeChangedListener(this.f17692t);
        }
        Object obj4 = this.f17696x;
        if (obj4 instanceof androidx.core.app.E) {
            ((androidx.core.app.E) obj4).removeOnPictureInPictureModeChangedListener(this.f17693u);
        }
        Object obj5 = this.f17696x;
        if ((obj5 instanceof InterfaceC1299n) && this.f17698z == null) {
            ((InterfaceC1299n) obj5).removeMenuProvider(this.f17694v);
        }
        this.f17696x = null;
        this.f17697y = null;
        this.f17698z = null;
        if (this.f17680g != null) {
            this.j.e();
            this.f17680g = null;
        }
        p063f.f fVar = this.f17660D;
        if (fVar != null) {
            fVar.b();
            this.f17661E.b();
            this.f17662F.b();
        }
    }

    public final void m(boolean z10) {
        if (z10 && (this.f17696x instanceof p186p0.d)) {
            f0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f17676c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z10) {
                    fragment.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z10, boolean z11) {
        if (z11 && (this.f17696x instanceof androidx.core.app.D)) {
            f0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f17676c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.n(z10, true);
                }
            }
        }
    }

    public final void o() {
        for (Fragment fragment : this.f17676c.e()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f17695w < 1) {
            return false;
        }
        for (Fragment fragment : this.f17676c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.f17695w < 1) {
            return;
        }
        for (Fragment fragment : this.f17676c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void r(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f17676c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z10, boolean z11) {
        if (z11 && (this.f17696x instanceof androidx.core.app.E)) {
            f0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.f17676c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z10);
                if (z11) {
                    fragment.mChildFragmentManager.s(z10, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z10 = false;
        if (this.f17695w < 1) {
            return false;
        }
        for (Fragment fragment : this.f17676c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f17698z;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f17698z)));
            sb2.append("}");
        } else {
            AbstractC1352q<?> abstractC1352q = this.f17696x;
            if (abstractC1352q != null) {
                sb2.append(abstractC1352q.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f17696x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i10) {
        try {
            this.f17675b = true;
            for (G g10 : this.f17676c.f17481b.values()) {
                if (g10 != null) {
                    g10.f17478e = i10;
                }
            }
            P(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).h();
            }
            this.f17675b = false;
            z(true);
        } catch (Throwable th) {
            this.f17675b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strB = androidx.compose.ui.text.font.s.b(str, "    ");
        H h8 = this.f17676c;
        h8.getClass();
        String str2 = str + "    ";
        HashMap<String, G> map = h8.f17481b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (G g10 : map.values()) {
                printWriter.print(str);
                if (g10 != null) {
                    Fragment fragment = g10.f17476c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList<Fragment> arrayList = h8.f17480a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size2; i10++) {
                Fragment fragment2 = arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.f17678e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size; i11++) {
                Fragment fragment3 = this.f17678e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        int size3 = this.f17677d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size3; i12++) {
                C1336a c1336a = this.f17677d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(c1336a.toString());
                c1336a.k(strB, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f17683k.get());
        synchronized (this.f17674a) {
            try {
                int size4 = this.f17674a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (q) this.f17674a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f17696x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f17697y);
        if (this.f17698z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f17698z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f17695w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f17665I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f17666J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f17667K);
        if (this.f17664H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f17664H);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).h();
        }
    }

    public final void x(q qVar, boolean z10) {
        if (!z10) {
            if (this.f17696x == null) {
                if (!this.f17667K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f17665I || this.f17666J) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f17674a) {
            try {
                if (this.f17696x == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f17674a.add(qVar);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z10) {
        if (this.f17675b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f17696x == null) {
            if (!this.f17667K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f17696x.f17633d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && (this.f17665I || this.f17666J)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f17669M == null) {
            this.f17669M = new ArrayList<>();
            this.f17670N = new ArrayList<>();
        }
    }

    public final boolean z(boolean z10) {
        boolean zA;
        C1336a c1336a;
        y(z10);
        if (!this.f17682i && (c1336a = this.f17681h) != null) {
            c1336a.f17570s = false;
            c1336a.h();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(this.f17681h);
                Objects.toString(this.f17674a);
            }
            this.f17681h.j(false, false);
            this.f17674a.add(0, this.f17681h);
            Iterator<I.a> it = this.f17681h.f17484a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f17501b;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.f17681h = null;
        }
        boolean z11 = false;
        while (true) {
            ArrayList<C1336a> arrayList = this.f17669M;
            ArrayList<Boolean> arrayList2 = this.f17670N;
            synchronized (this.f17674a) {
                if (this.f17674a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f17674a.size();
                        zA = false;
                        for (int i10 = 0; i10 < size; i10++) {
                            zA |= this.f17674a.get(i10).a(arrayList, arrayList2);
                        }
                        this.f17674a.clear();
                        this.f17696x.f17633d.removeCallbacks(this.f17673Q);
                    } catch (Throwable th) {
                        this.f17674a.clear();
                        this.f17696x.f17633d.removeCallbacks(this.f17673Q);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            this.f17675b = true;
            try {
                W(this.f17669M, this.f17670N);
                d();
                z11 = true;
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        g0();
        if (this.f17668L) {
            this.f17668L = false;
            for (G g10 : this.f17676c.d()) {
                Fragment fragment2 = g10.f17476c;
                if (fragment2.mDeferStart) {
                    if (this.f17675b) {
                        this.f17668L = true;
                    } else {
                        fragment2.mDeferStart = false;
                        g10.i();
                    }
                }
            }
        }
        this.f17676c.f17481b.values().removeAll(Collections.singleton(null));
        return z11;
    }

    /* JADX INFO: compiled from: FragmentManager.java */
    public static abstract class m {
        public void a(y yVar, Fragment fragment) {
        }

        public void b(y yVar, Fragment fragment) {
        }

        public void c(y yVar, Fragment fragment, View view) {
        }
    }
}
