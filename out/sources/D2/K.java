package D2;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import androidx.collection.C0873a;
import androidx.collection.C0891t;
import com.voltasit.obdeleven.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: TransitionManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0675b f2533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<WeakReference<C0873a<ViewGroup, ArrayList<F>>>> f2534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList<ViewGroup> f2535c;

    static {
        C0675b c0675b = new C0675b();
        c0675b.Q();
        f2533a = c0675b;
        f2534b = new ThreadLocal<>();
        f2535c = new ArrayList<>();
    }

    public static void a(ViewGroup viewGroup, F f10) {
        ArrayList<ViewGroup> arrayList = f2535c;
        if (arrayList.contains(viewGroup)) {
            return;
        }
        WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
        if (viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (f10 == null) {
                f10 = f2533a;
            }
            F fClone = f10.clone();
            ArrayList<F> arrayList2 = b().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<F> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().A(viewGroup);
                }
            }
            if (fClone != null) {
                fClone.l(viewGroup, true);
            }
            if (((B) viewGroup.getTag(R.id.transition_current_scene)) != null) {
                throw null;
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (fClone != null) {
                a aVar = new a();
                aVar.f2536b = fClone;
                aVar.f2537c = viewGroup;
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }

    public static C0873a<ViewGroup, ArrayList<F>> b() {
        C0873a<ViewGroup, ArrayList<F>> c0873a;
        ThreadLocal<WeakReference<C0873a<ViewGroup, ArrayList<F>>>> threadLocal = f2534b;
        WeakReference<C0873a<ViewGroup, ArrayList<F>>> weakReference = threadLocal.get();
        if (weakReference != null && (c0873a = weakReference.get()) != null) {
            return c0873a;
        }
        C0873a<ViewGroup, ArrayList<F>> c0873a2 = new C0873a<>();
        threadLocal.set(new WeakReference<>(c0873a2));
        return c0873a2;
    }

    /* JADX INFO: compiled from: TransitionManager.java */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public F f2536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ViewGroup f2537c;

        /* JADX INFO: renamed from: D2.K$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TransitionManager.java */
        public class C0026a extends J {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0873a f2538b;

            public C0026a(C0873a c0873a) {
                this.f2538b = c0873a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // D2.F.e
            public final void e(F f10) {
                ((ArrayList) this.f2538b.get(a.this.f2537c)).remove(f10);
                f10.B(this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:103:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:105:0x020a  */
        /* JADX WARN: Code duplicated, block: B:107:0x0217  */
        /* JADX WARN: Code duplicated, block: B:111:0x022b  */
        /* JADX WARN: Code duplicated, block: B:140:0x01d6 A[EDGE_INSN: B:140:0x01d6->B:93:0x01d6 BREAK  A[LOOP:1: B:19:0x0083->B:92:0x01ce], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:14:0x004e  */
        /* JADX WARN: Code duplicated, block: B:170:0x01f4 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:15:0x0052->B:17:0x0058, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:21:0x0088  */
        /* JADX WARN: Code duplicated, block: B:23:0x008c  */
        /* JADX WARN: Code duplicated, block: B:25:0x008f  */
        /* JADX WARN: Code duplicated, block: B:27:0x0092  */
        /* JADX WARN: Code duplicated, block: B:30:0x0099  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:44:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:61:0x013e  */
        /* JADX WARN: Code duplicated, block: B:64:0x0147  */
        /* JADX WARN: Code duplicated, block: B:66:0x0151  */
        /* JADX WARN: Code duplicated, block: B:80:0x0196  */
        /* JADX WARN: Code duplicated, block: B:82:0x019d  */
        /* JADX WARN: Code duplicated, block: B:96:0x01db  */
        /* JADX WARN: Code duplicated, block: B:98:0x01e9  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ArrayList arrayList;
            F f10;
            int i10;
            P p10;
            P p11;
            C0873a c0873a;
            C0873a c0873a2;
            int i11;
            int[] iArr;
            int i12;
            int i13;
            C0873a<Animator, F.b> c0873aV;
            int i14;
            Animator animatorH;
            F.b bVar;
            View view;
            g0 g0Var;
            O o10;
            O o11;
            int i15;
            P p12;
            int i16;
            View view2;
            O o12;
            int i17;
            C0873a<String, View> c0873a3;
            int i18;
            int i19;
            View viewM;
            View view3;
            SparseArray<View> sparseArray;
            int size;
            int i20;
            View viewValueAt;
            int i21;
            View view4;
            C0891t<View> c0891t;
            int iG;
            int i22;
            View viewH;
            P p13;
            Iterator it;
            int i23 = 1;
            ViewGroup viewGroup = this.f2537c;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList2 = K.f2535c;
            ViewGroup viewGroup2 = this.f2537c;
            if (!arrayList2.remove(viewGroup2)) {
                return true;
            }
            C0873a<ViewGroup, ArrayList<F>> c0873aB = K.b();
            ArrayList<F> arrayList3 = c0873aB.get(viewGroup2);
            if (arrayList3 != null) {
                arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
                f10 = this.f2536b;
                arrayList3.add(f10);
                f10.a(new C0026a(c0873aB));
                i10 = 0;
                f10.l(viewGroup2, false);
                if (arrayList != null) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((F) it.next()).E(viewGroup2);
                    }
                }
                f10.f2512q = new ArrayList<>();
                f10.f2513r = new ArrayList<>();
                p10 = f10.f2508m;
                p11 = f10.f2509n;
                c0873a = new C0873a(p10.f2556a);
                c0873a2 = new C0873a(p11.f2556a);
                i11 = 0;
                while (true) {
                    iArr = f10.f2511p;
                    if (i11 < iArr.length) {
                        break;
                    }
                    i15 = iArr[i11];
                    if (i15 != i23) {
                        if (i15 != 2) {
                            p12 = p10;
                            c0873a3 = p12.f2559d;
                            C0873a<String, View> c0873a4 = p11.f2559d;
                            i18 = c0873a3.f9139d;
                            for (i19 = 0; i19 < i18; i19++) {
                                viewM = c0873a3.m(i19);
                                if (viewM == null && f10.z(viewM) && (view3 = c0873a4.get(c0873a3.h(i19))) != null && f10.z(view3)) {
                                    O o13 = (O) c0873a.get(viewM);
                                    O o14 = (O) c0873a2.get(view3);
                                    if (o13 != null && o14 != null) {
                                        f10.f2512q.add(o13);
                                        f10.f2513r.add(o14);
                                        c0873a.remove(viewM);
                                        c0873a2.remove(view3);
                                    }
                                }
                            }
                        } else if (i15 != 3) {
                            if (i15 == 4) {
                                c0891t = p10.f2558c;
                                iG = c0891t.g();
                                i22 = i10;
                                while (i22 < iG) {
                                    viewH = c0891t.h(i22);
                                    if (viewH == null && f10.z(viewH)) {
                                        p13 = p10;
                                        View viewB = p11.f2558c.b(c0891t.d(i22));
                                        if (viewB != null && f10.z(viewB)) {
                                            O o15 = (O) c0873a.get(viewH);
                                            O o16 = (O) c0873a2.get(viewB);
                                            if (o15 != null && o16 != null) {
                                                f10.f2512q.add(o15);
                                                f10.f2513r.add(o16);
                                                c0873a.remove(viewH);
                                                c0873a2.remove(viewB);
                                            }
                                        }
                                    } else {
                                        p13 = p10;
                                    }
                                    i22 += i23;
                                    p10 = p13;
                                }
                            }
                            i17 = i23;
                            p12 = p10;
                        } else {
                            p12 = p10;
                            sparseArray = p12.f2557b;
                            SparseArray<View> sparseArray2 = p11.f2557b;
                            size = sparseArray.size();
                            i20 = 0;
                            while (i20 < size) {
                                viewValueAt = sparseArray.valueAt(i20);
                                if (viewValueAt == null && f10.z(viewValueAt) && (view4 = sparseArray2.get(sparseArray.keyAt(i20))) != null && f10.z(view4)) {
                                    O o17 = (O) c0873a.get(viewValueAt);
                                    O o18 = (O) c0873a2.get(view4);
                                    if (o17 != null && o18 != null) {
                                        f10.f2512q.add(o17);
                                        f10.f2513r.add(o18);
                                        c0873a.remove(viewValueAt);
                                        c0873a2.remove(view4);
                                    }
                                    i21 = 1;
                                } else {
                                    i21 = i23;
                                }
                                i20 += i21;
                                i23 = i21;
                            }
                            i17 = i23;
                        }
                        i11 += i17;
                        i23 = i17;
                        p10 = p12;
                        i10 = 0;
                    } else {
                        p12 = p10;
                        for (i16 = c0873a.f9139d - i23; i16 >= 0; i16--) {
                            view2 = (View) c0873a.h(i16);
                            if (view2 == null && f10.z(view2) && (o12 = (O) c0873a2.remove(view2)) != null && f10.z(o12.f2554b)) {
                                f10.f2512q.add((O) c0873a.k(i16));
                                f10.f2513r.add(o12);
                            }
                        }
                    }
                    i17 = 1;
                    i11 += i17;
                    i23 = i17;
                    p10 = p12;
                    i10 = 0;
                }
                for (i12 = 0; i12 < c0873a.f9139d; i12++) {
                    o11 = (O) c0873a.m(i12);
                    if (f10.z(o11.f2554b)) {
                        f10.f2512q.add(o11);
                        f10.f2513r.add(null);
                    }
                }
                for (i13 = 0; i13 < c0873a2.f9139d; i13++) {
                    o10 = (O) c0873a2.m(i13);
                    if (f10.z(o10.f2554b)) {
                        f10.f2513r.add(o10);
                        f10.f2512q.add(null);
                    }
                }
                c0873aV = F.v();
                int i24 = c0873aV.f9139d;
                b0 b0Var = T.f2571a;
                WindowId windowId = viewGroup2.getWindowId();
                for (i14 = i24 - 1; i14 >= 0; i14--) {
                    animatorH = c0873aV.h(i14);
                    if (animatorH == null && (bVar = c0873aV.get(animatorH)) != null && (view = bVar.f2522a) != null && (g0Var = bVar.f2525d) != null && g0Var.f2641a.equals(windowId)) {
                        O oX = f10.x(view, true);
                        O oU = f10.u(view, true);
                        if (oX == null && oU == null) {
                            oU = f10.f2509n.f2556a.get(view);
                        }
                        if ((oX != null || oU != null) && bVar.f2526e.y(bVar.f2524c, oU)) {
                            if (animatorH.isRunning() || animatorH.isStarted()) {
                                animatorH.cancel();
                            } else {
                                c0873aV.remove(animatorH);
                            }
                        }
                    }
                }
                f10.p(viewGroup2, f10.f2508m, f10.f2509n, f10.f2512q, f10.f2513r);
                f10.F();
                return true;
            }
            arrayList3 = new ArrayList<>();
            c0873aB.put(viewGroup2, arrayList3);
            f10 = this.f2536b;
            arrayList3.add(f10);
            f10.a(new C0026a(c0873aB));
            i10 = 0;
            f10.l(viewGroup2, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((F) it.next()).E(viewGroup2);
                }
            }
            f10.f2512q = new ArrayList<>();
            f10.f2513r = new ArrayList<>();
            p10 = f10.f2508m;
            p11 = f10.f2509n;
            c0873a = new C0873a(p10.f2556a);
            c0873a2 = new C0873a(p11.f2556a);
            i11 = 0;
            while (true) {
                iArr = f10.f2511p;
                if (i11 < iArr.length) {
                    break;
                    break;
                }
                i15 = iArr[i11];
                if (i15 != i23) {
                    if (i15 != 2) {
                        p12 = p10;
                        c0873a3 = p12.f2559d;
                        C0873a<String, View> c0873a5 = p11.f2559d;
                        i18 = c0873a3.f9139d;
                        while (i19 < i18) {
                            viewM = c0873a3.m(i19);
                            if (viewM == null) {
                            }
                        }
                    } else if (i15 != 3) {
                        if (i15 == 4) {
                            c0891t = p10.f2558c;
                            iG = c0891t.g();
                            i22 = i10;
                            while (i22 < iG) {
                                viewH = c0891t.h(i22);
                                if (viewH == null) {
                                    p13 = p10;
                                } else {
                                    p13 = p10;
                                }
                                i22 += i23;
                                p10 = p13;
                            }
                        }
                        i17 = i23;
                        p12 = p10;
                    } else {
                        p12 = p10;
                        sparseArray = p12.f2557b;
                        SparseArray<View> sparseArray3 = p11.f2557b;
                        size = sparseArray.size();
                        i20 = 0;
                        while (i20 < size) {
                            viewValueAt = sparseArray.valueAt(i20);
                            if (viewValueAt == null) {
                                i21 = i23;
                            } else {
                                i21 = i23;
                            }
                            i20 += i21;
                            i23 = i21;
                        }
                        i17 = i23;
                    }
                    i11 += i17;
                    i23 = i17;
                    p10 = p12;
                    i10 = 0;
                } else {
                    p12 = p10;
                    while (i16 >= 0) {
                        view2 = (View) c0873a.h(i16);
                        if (view2 == null) {
                        }
                    }
                }
                i17 = 1;
                i11 += i17;
                i23 = i17;
                p10 = p12;
                i10 = 0;
            }
            while (i12 < c0873a.f9139d) {
                o11 = (O) c0873a.m(i12);
                if (f10.z(o11.f2554b)) {
                    f10.f2512q.add(o11);
                    f10.f2513r.add(null);
                }
            }
            while (i13 < c0873a2.f9139d) {
                o10 = (O) c0873a2.m(i13);
                if (f10.z(o10.f2554b)) {
                    f10.f2513r.add(o10);
                    f10.f2512q.add(null);
                }
            }
            c0873aV = F.v();
            int i25 = c0873aV.f9139d;
            b0 b0Var2 = T.f2571a;
            WindowId windowId2 = viewGroup2.getWindowId();
            while (i14 >= 0) {
                animatorH = c0873aV.h(i14);
                if (animatorH == null) {
                }
            }
            f10.p(viewGroup2, f10.f2508m, f10.f2509n, f10.f2512q, f10.f2513r);
            f10.F();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f2537c;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            ArrayList<ViewGroup> arrayList = K.f2535c;
            ViewGroup viewGroup2 = this.f2537c;
            arrayList.remove(viewGroup2);
            ArrayList<F> arrayList2 = K.b().get(viewGroup2);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<F> it = arrayList2.iterator();
                while (it.hasNext()) {
                    it.next().E(viewGroup2);
                }
            }
            this.f2536b.m(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
