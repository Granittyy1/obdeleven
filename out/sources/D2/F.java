package D2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.collection.C0873a;
import androidx.collection.C0891t;
import com.braze.models.inappmessage.InAppMessageBase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Transition.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class F implements Cloneable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f2494B = {2, 1, 3, 4};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f2495C = new a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final ThreadLocal<C0873a<Animator, b>> f2496D = new ThreadLocal<>();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AbstractC0697y f2497A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f2501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<Integer> f2502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<View> f2503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<String> f2504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<Class<?>> f2505i;
    public ArrayList<Integer> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<Class<?>> f2506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<String> f2507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public P f2508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public P f2509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public L f2510o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f2511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<O> f2512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<O> f2513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList<Animator> f2514s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2515t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2516u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList<e> f2518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList<Animator> f2519x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f0 f2520y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public d f2521z;

    /* JADX INFO: compiled from: Transition.java */
    public static class a extends AbstractC0697y {
        @Override // D2.AbstractC0697y
        public final Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX INFO: compiled from: Transition.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f2522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f2523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public O f2524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public g0 f2525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public F f2526e;
    }

    /* JADX INFO: compiled from: Transition.java */
    public static class c {
        public static ArrayList a(ArrayList arrayList, Serializable serializable) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(serializable)) {
                arrayList.add(serializable);
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: Transition.java */
    public static abstract class d {
        public abstract Rect a();
    }

    /* JADX INFO: compiled from: Transition.java */
    public interface e {
        void a(F f10);

        void b(F f10);

        void c(F f10);

        void d(F f10);

        void e(F f10);
    }

    public F() {
        this.f2498b = getClass().getName();
        this.f2499c = -1L;
        this.f2500d = -1L;
        this.f2501e = null;
        this.f2502f = new ArrayList<>();
        this.f2503g = new ArrayList<>();
        this.f2504h = null;
        this.f2505i = null;
        this.j = null;
        this.f2506k = null;
        this.f2507l = null;
        this.f2508m = new P();
        this.f2509n = new P();
        this.f2510o = null;
        this.f2511p = f2494B;
        this.f2514s = new ArrayList<>();
        this.f2515t = 0;
        this.f2516u = false;
        this.f2517v = false;
        this.f2518w = null;
        this.f2519x = new ArrayList<>();
        this.f2497A = f2495C;
    }

    public static void f(P p10, View view, O o10) {
        p10.f2556a.put(view, o10);
        int id = view.getId();
        if (id >= 0) {
            SparseArray<View> sparseArray = p10.f2557b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
        String strK = androidx.core.view.O.d.k(view);
        if (strK != null) {
            C0873a<String, View> c0873a = p10.f2559d;
            if (c0873a.containsKey(strK)) {
                c0873a.put(strK, null);
            } else {
                c0873a.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0891t<View> c0891t = p10.f2558c;
                if (c0891t.c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c0891t.e(view, itemIdAtPosition);
                    return;
                }
                View viewB = c0891t.b(itemIdAtPosition);
                if (viewB != null) {
                    viewB.setHasTransientState(false);
                    c0891t.e(null, itemIdAtPosition);
                }
            }
        }
    }

    public static C0873a<Animator, b> v() {
        ThreadLocal<C0873a<Animator, b>> threadLocal = f2496D;
        C0873a<Animator, b> c0873a = threadLocal.get();
        if (c0873a != null) {
            return c0873a;
        }
        C0873a<Animator, b> c0873a2 = new C0873a<>();
        threadLocal.set(c0873a2);
        return c0873a2;
    }

    public void A(ViewGroup viewGroup) {
        g0 g0Var;
        if (this.f2517v) {
            return;
        }
        C0873a<Animator, b> c0873aV = v();
        int i10 = c0873aV.f9139d;
        b0 b0Var = T.f2571a;
        WindowId windowId = viewGroup.getWindowId();
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            b bVarM = c0873aV.m(i11);
            if (bVarM.f2522a != null && (g0Var = bVarM.f2525d) != null && g0Var.f2641a.equals(windowId)) {
                c0873aV.h(i11).pause();
            }
        }
        ArrayList<e> arrayList = this.f2518w;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f2518w.clone();
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((e) arrayList2.get(i12)).a(this);
            }
        }
        this.f2516u = true;
    }

    public void B(e eVar) {
        ArrayList<e> arrayList = this.f2518w;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(eVar);
        if (this.f2518w.size() == 0) {
            this.f2518w = null;
        }
    }

    public void D(View view) {
        this.f2503g.remove(view);
    }

    public void E(View view) {
        g0 g0Var;
        if (this.f2516u) {
            if (!this.f2517v) {
                C0873a<Animator, b> c0873aV = v();
                int i10 = c0873aV.f9139d;
                b0 b0Var = T.f2571a;
                WindowId windowId = view.getWindowId();
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    b bVarM = c0873aV.m(i11);
                    if (bVarM.f2522a != null && (g0Var = bVarM.f2525d) != null && g0Var.f2641a.equals(windowId)) {
                        c0873aV.h(i11).resume();
                    }
                }
                ArrayList<e> arrayList = this.f2518w;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f2518w.clone();
                    int size = arrayList2.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((e) arrayList2.get(i12)).c(this);
                    }
                }
            }
            this.f2516u = false;
        }
    }

    public void F() {
        M();
        C0873a<Animator, b> c0873aV = v();
        for (Animator animator : this.f2519x) {
            if (c0873aV.containsKey(animator)) {
                M();
                if (animator != null) {
                    animator.addListener(new G(this, c0873aV));
                    long j = this.f2500d;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j10 = this.f2499c;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.f2501e;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new H(this));
                    animator.start();
                }
            }
        }
        this.f2519x.clear();
        q();
    }

    public void G(long j) {
        this.f2500d = j;
    }

    public void H(d dVar) {
        this.f2521z = dVar;
    }

    public void I(TimeInterpolator timeInterpolator) {
        this.f2501e = timeInterpolator;
    }

    public void J(AbstractC0697y abstractC0697y) {
        if (abstractC0697y == null) {
            this.f2497A = f2495C;
        } else {
            this.f2497A = abstractC0697y;
        }
    }

    public void K(f0 f0Var) {
        this.f2520y = f0Var;
    }

    public void L(long j) {
        this.f2499c = j;
    }

    public final void M() {
        if (this.f2515t == 0) {
            ArrayList<e> arrayList = this.f2518w;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2518w.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((e) arrayList2.get(i10)).d(this);
                }
            }
            this.f2517v = false;
        }
        this.f2515t++;
    }

    public String N(String str) {
        StringBuilder sbE = C4.b.e(str);
        sbE.append(getClass().getSimpleName());
        sbE.append("@");
        sbE.append(Integer.toHexString(hashCode()));
        sbE.append(": ");
        String string = sbE.toString();
        if (this.f2500d != -1) {
            string = p005a4.o.d(this.f2500d, ") ", C4.b.f(string, "dur("));
        }
        if (this.f2499c != -1) {
            string = p005a4.o.d(this.f2499c, ") ", C4.b.f(string, "dly("));
        }
        if (this.f2501e != null) {
            StringBuilder sbF = C4.b.f(string, "interp(");
            sbF.append(this.f2501e);
            sbF.append(") ");
            string = sbF.toString();
        }
        ArrayList<Integer> arrayList = this.f2502f;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f2503g;
        if (size <= 0 && arrayList2.size() <= 0) {
            return string;
        }
        String strB = androidx.compose.ui.text.font.s.b(string, "tgts(");
        if (arrayList.size() > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (i10 > 0) {
                    strB = androidx.compose.ui.text.font.s.b(strB, ", ");
                }
                StringBuilder sbE2 = C4.b.e(strB);
                sbE2.append(arrayList.get(i10));
                strB = sbE2.toString();
            }
        }
        if (arrayList2.size() > 0) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (i11 > 0) {
                    strB = androidx.compose.ui.text.font.s.b(strB, ", ");
                }
                StringBuilder sbE3 = C4.b.e(strB);
                sbE3.append(arrayList2.get(i11));
                strB = sbE3.toString();
            }
        }
        return androidx.compose.ui.text.font.s.b(strB, ")");
    }

    public void a(e eVar) {
        if (this.f2518w == null) {
            this.f2518w = new ArrayList<>();
        }
        this.f2518w.add(eVar);
    }

    public void b(int i10) {
        if (i10 != 0) {
            this.f2502f.add(Integer.valueOf(i10));
        }
    }

    public void c(View view) {
        this.f2503g.add(view);
    }

    public void d(Class cls) {
        if (this.f2505i == null) {
            this.f2505i = new ArrayList<>();
        }
        this.f2505i.add(cls);
    }

    public void e(String str) {
        if (this.f2504h == null) {
            this.f2504h = new ArrayList<>();
        }
        this.f2504h.add(str);
    }

    public abstract void g(O o10);

    public final void h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.j;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<Class<?>> arrayList2 = this.f2506k;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f2506k.get(i10).isInstance(view)) {
                        return;
                    }
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                O o10 = new O(view);
                if (z10) {
                    j(o10);
                } else {
                    g(o10);
                }
                o10.f2555c.add(this);
                i(o10);
                if (z10) {
                    f(this.f2508m, view, o10);
                } else {
                    f(this.f2509n, view, o10);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    h(viewGroup.getChildAt(i11), z10);
                }
            }
        }
    }

    public void i(O o10) {
        if (this.f2520y != null) {
            HashMap map = o10.f2553a;
            if (map.isEmpty()) {
                return;
            }
            this.f2520y.getClass();
            String[] strArr = f0.f2639a;
            for (int i10 = 0; i10 < 2; i10++) {
                if (!map.containsKey(strArr[i10])) {
                    this.f2520y.getClass();
                    Integer numValueOf = (Integer) map.get("android:visibility:visibility");
                    View view = o10.f2554b;
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(view.getVisibility());
                    }
                    map.put("android:visibilityPropagation:visibility", numValueOf);
                    int[] iArr = {iRound, 0};
                    view.getLocationOnScreen(iArr);
                    int iRound = Math.round(view.getTranslationX()) + iArr[0];
                    iArr[0] = (view.getWidth() / 2) + iRound;
                    int iRound2 = Math.round(view.getTranslationY()) + iArr[1];
                    iArr[1] = iRound2;
                    iArr[1] = (view.getHeight() / 2) + iRound2;
                    map.put("android:visibilityPropagation:center", iArr);
                    return;
                }
            }
        }
    }

    public abstract void j(O o10);

    public final void l(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        m(z10);
        ArrayList<Integer> arrayList3 = this.f2502f;
        int size = arrayList3.size();
        ArrayList<View> arrayList4 = this.f2503g;
        if ((size <= 0 && arrayList4.size() <= 0) || (((arrayList = this.f2504h) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f2505i) != null && !arrayList2.isEmpty()))) {
            h(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            View viewFindViewById = viewGroup.findViewById(arrayList3.get(i10).intValue());
            if (viewFindViewById != null) {
                O o10 = new O(viewFindViewById);
                if (z10) {
                    j(o10);
                } else {
                    g(o10);
                }
                o10.f2555c.add(this);
                i(o10);
                if (z10) {
                    f(this.f2508m, viewFindViewById, o10);
                } else {
                    f(this.f2509n, viewFindViewById, o10);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
            View view = arrayList4.get(i11);
            O o11 = new O(view);
            if (z10) {
                j(o11);
            } else {
                g(o11);
            }
            o11.f2555c.add(this);
            i(o11);
            if (z10) {
                f(this.f2508m, view, o11);
            } else {
                f(this.f2509n, view, o11);
            }
        }
    }

    public final void m(boolean z10) {
        if (z10) {
            this.f2508m.f2556a.clear();
            this.f2508m.f2557b.clear();
            this.f2508m.f2558c.a();
        } else {
            this.f2509n.f2556a.clear();
            this.f2509n.f2557b.clear();
            this.f2509n.f2558c.a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public F clone() {
        try {
            F f10 = (F) super.clone();
            f10.f2519x = new ArrayList<>();
            f10.f2508m = new P();
            f10.f2509n = new P();
            f10.f2512q = null;
            f10.f2513r = null;
            return f10;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator o(ViewGroup viewGroup, O o10, O o11) {
        return null;
    }

    public void p(ViewGroup viewGroup, P p10, P p11, ArrayList<O> arrayList, ArrayList<O> arrayList2) {
        Animator animatorO;
        int i10;
        View view;
        O o10;
        O o11;
        C0873a<Animator, b> c0873aV = v();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < size) {
            O o12 = arrayList.get(i11);
            O o13 = arrayList2.get(i11);
            if (o12 != null && !o12.f2555c.contains(this)) {
                o12 = null;
            }
            if (o13 != null && !o13.f2555c.contains(this)) {
                o13 = null;
            }
            if (!(o12 == null && o13 == null) && ((o12 == null || o13 == null || y(o12, o13)) && (animatorO = o(viewGroup, o12, o13)) != null)) {
                String str = this.f2498b;
                if (o13 != null) {
                    String[] strArrW = w();
                    View view2 = o13.f2554b;
                    if (strArrW != null && strArrW.length > 0) {
                        o11 = new O(view2);
                        O o14 = p11.f2556a.get(view2);
                        if (o14 != null) {
                            int i12 = 0;
                            while (i12 < strArrW.length) {
                                HashMap map = o11.f2553a;
                                int i13 = i11;
                                String str2 = strArrW[i12];
                                map.put(str2, o14.f2553a.get(str2));
                                i12++;
                                i11 = i13;
                                strArrW = strArrW;
                            }
                            i10 = i11;
                        } else {
                            i10 = i11;
                        }
                        int i14 = c0873aV.f9139d;
                        for (int i15 = 0; i15 < i14; i15++) {
                            b bVar = c0873aV.get(c0873aV.h(i15));
                            if (bVar.f2524c != null && bVar.f2522a == view2 && bVar.f2523b.equals(str) && bVar.f2524c.equals(o11)) {
                                animatorO = null;
                                break;
                            }
                        }
                    } else {
                        i10 = i11;
                        animatorO = animatorO;
                        o11 = null;
                    }
                    animatorO = animatorO;
                    o10 = o11;
                    view = view2;
                } else {
                    i10 = i11;
                    view = o12.f2554b;
                    o10 = null;
                }
                if (animatorO != null) {
                    f0 f0Var = this.f2520y;
                    if (f0Var != null) {
                        long jA = f0Var.a(viewGroup, this, o12, o13);
                        sparseIntArray.put(this.f2519x.size(), (int) jA);
                        jMin = Math.min(jA, jMin);
                    }
                    b0 b0Var = T.f2571a;
                    g0 g0Var = new g0(viewGroup);
                    b bVar2 = new b();
                    bVar2.f2522a = view;
                    bVar2.f2523b = str;
                    bVar2.f2524c = o10;
                    bVar2.f2525d = g0Var;
                    bVar2.f2526e = this;
                    c0873aV.put(animatorO, bVar2);
                    this.f2519x.add(animatorO);
                }
            } else {
                size = size;
                i10 = i11;
            }
            i11 = i10 + 1;
            size = size;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                Animator animator = this.f2519x.get(sparseIntArray.keyAt(i16));
                animator.setStartDelay(animator.getStartDelay() + (((long) sparseIntArray.valueAt(i16)) - jMin));
            }
        }
    }

    public final void q() {
        int i10 = this.f2515t - 1;
        this.f2515t = i10;
        if (i10 == 0) {
            ArrayList<e> arrayList = this.f2518w;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2518w.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((e) arrayList2.get(i11)).e(this);
                }
            }
            for (int i12 = 0; i12 < this.f2508m.f2558c.g(); i12++) {
                View viewH = this.f2508m.f2558c.h(i12);
                if (viewH != null) {
                    WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
                    viewH.setHasTransientState(false);
                }
            }
            for (int i13 = 0; i13 < this.f2509n.f2558c.g(); i13++) {
                View viewH2 = this.f2509n.f2558c.h(i13);
                if (viewH2 != null) {
                    WeakHashMap<View, androidx.core.view.Z> weakHashMap2 = androidx.core.view.O.f16859a;
                    viewH2.setHasTransientState(false);
                }
            }
            this.f2517v = true;
        }
    }

    public void r(int i10) {
        ArrayList<Integer> arrayListA = this.j;
        if (i10 > 0) {
            arrayListA = c.a(arrayListA, Integer.valueOf(i10));
        }
        this.j = arrayListA;
    }

    public void s(Class cls) {
        this.f2506k = c.a(this.f2506k, cls);
    }

    public void t(String str) {
        this.f2507l = c.a(this.f2507l, str);
    }

    public final String toString() {
        return N("");
    }

    public final O u(View view, boolean z10) {
        L l10 = this.f2510o;
        if (l10 != null) {
            return l10.u(view, z10);
        }
        ArrayList<O> arrayList = z10 ? this.f2512q : this.f2513r;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            O o10 = arrayList.get(i10);
            if (o10 == null) {
                return null;
            }
            if (o10.f2554b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (z10 ? this.f2513r : this.f2512q).get(i10);
        }
        return null;
    }

    public String[] w() {
        return null;
    }

    public final O x(View view, boolean z10) {
        L l10 = this.f2510o;
        if (l10 != null) {
            return l10.x(view, z10);
        }
        return (z10 ? this.f2508m : this.f2509n).f2556a.get(view);
    }

    public boolean y(O o10, O o11) {
        if (o10 == null || o11 == null) {
            return false;
        }
        String[] strArrW = w();
        HashMap map = o10.f2553a;
        HashMap map2 = o11.f2553a;
        if (strArrW == null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                Object obj2 = map2.get(str);
                if ((obj == null && obj2 == null) ? false : (obj == null || obj2 == null) ? true : !obj.equals(obj2)) {
                }
            }
            return false;
        }
        for (String str2 : strArrW) {
            Object obj3 = map.get(str2);
            Object obj4 = map2.get(str2);
            if (!((obj3 == null && obj4 == null) ? false : (obj3 == null || obj4 == null) ? true : !obj3.equals(obj4))) {
            }
        }
        return false;
        return true;
    }

    public final boolean z(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<Class<?>> arrayList4 = this.f2506k;
        if (arrayList4 != null) {
            int size = arrayList4.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f2506k.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f2507l != null) {
            WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
            if (androidx.core.view.O.d.k(view) != null && this.f2507l.contains(androidx.core.view.O.d.k(view))) {
                return false;
            }
        }
        ArrayList<Integer> arrayList5 = this.f2502f;
        int size2 = arrayList5.size();
        ArrayList<View> arrayList6 = this.f2503g;
        if ((size2 == 0 && arrayList6.size() == 0 && (((arrayList = this.f2505i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f2504h) == null || arrayList2.isEmpty()))) || arrayList5.contains(Integer.valueOf(id)) || arrayList6.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList7 = this.f2504h;
        if (arrayList7 != null) {
            WeakHashMap<View, androidx.core.view.Z> weakHashMap2 = androidx.core.view.O.f16859a;
            if (arrayList7.contains(androidx.core.view.O.d.k(view))) {
                return true;
            }
        }
        if (this.f2505i != null) {
            for (int i11 = 0; i11 < this.f2505i.size(); i11++) {
                if (this.f2505i.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public F(Context context, AttributeSet attributeSet) {
        this.f2498b = getClass().getName();
        this.f2499c = -1L;
        this.f2500d = -1L;
        this.f2501e = null;
        this.f2502f = new ArrayList<>();
        this.f2503g = new ArrayList<>();
        this.f2504h = null;
        this.f2505i = null;
        this.j = null;
        this.f2506k = null;
        this.f2507l = null;
        this.f2508m = new P();
        this.f2509n = new P();
        this.f2510o = null;
        int[] iArr = f2494B;
        this.f2511p = iArr;
        this.f2514s = new ArrayList<>();
        this.f2515t = 0;
        this.f2516u = false;
        this.f2517v = false;
        this.f2518w = null;
        this.f2519x = new ArrayList<>();
        this.f2497A = f2495C;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E.f2486b);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jC = p211r0.j.c(typedArrayObtainStyledAttributes, xmlResourceParser, InAppMessageBase.DURATION, 1, -1);
        if (jC >= 0) {
            G(jC);
        }
        long j = p211r0.j.e(xmlResourceParser, "startDelay") ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
        if (j > 0) {
            L(j);
        }
        int resourceId = !p211r0.j.e(xmlResourceParser, "interpolator") ? 0 : typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            I(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String strD = p211r0.j.d(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strD != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(strD, ",");
            int[] iArr2 = new int[stringTokenizer.countTokens()];
            int i10 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String strTrim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(strTrim)) {
                    iArr2[i10] = 3;
                } else if ("instance".equalsIgnoreCase(strTrim)) {
                    iArr2[i10] = 1;
                } else if ("name".equalsIgnoreCase(strTrim)) {
                    iArr2[i10] = 2;
                } else if ("itemId".equalsIgnoreCase(strTrim)) {
                    iArr2[i10] = 4;
                } else if (strTrim.isEmpty()) {
                    int[] iArr3 = new int[iArr2.length - 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i10);
                    i10--;
                    iArr2 = iArr3;
                } else {
                    throw new InflateException(androidx.compose.foundation.gestures.d.b("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                i10++;
            }
            if (iArr2.length == 0) {
                this.f2511p = iArr;
            } else {
                for (int i11 = 0; i11 < iArr2.length; i11++) {
                    int i12 = iArr2[i11];
                    if (i12 < 1 || i12 > 4) {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                    for (int i13 = 0; i13 < i11; i13++) {
                        if (iArr2[i13] == i12) {
                            throw new IllegalArgumentException("matches contains a duplicate value");
                        }
                    }
                }
                this.f2511p = (int[]) iArr2.clone();
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
