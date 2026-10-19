package D2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: renamed from: D2.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentTransitionSupport.java */
/* JADX INFO: loaded from: classes.dex */
public class C0689p extends androidx.fragment.app.P {

    /* JADX INFO: renamed from: D2.p$b */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class b extends F.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f2682a;

        public b(Rect rect) {
            this.f2682a = rect;
        }

        @Override // D2.F.d
        public final Rect a() {
            Rect rect = this.f2682a;
            if (rect.isEmpty()) {
                return null;
            }
            return rect;
        }
    }

    @Override // androidx.fragment.app.P
    public final void a(View view, Object obj) {
        ((F) obj).c(view);
    }

    @Override // androidx.fragment.app.P
    public final void b(Object obj, ArrayList<View> arrayList) {
        F f10 = (F) obj;
        if (f10 == null) {
            return;
        }
        int i10 = 0;
        if (f10 instanceof L) {
            L l10 = (L) f10;
            int size = l10.f2540E.size();
            while (i10 < size) {
                b((i10 < 0 || i10 >= l10.f2540E.size()) ? null : l10.f2540E.get(i10), arrayList);
                i10++;
            }
            return;
        }
        if (androidx.fragment.app.P.h(f10.f2502f) && androidx.fragment.app.P.h(f10.f2504h) && androidx.fragment.app.P.h(f10.f2505i) && androidx.fragment.app.P.h(f10.f2503g)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                f10.c(arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.P
    public final void c(ViewGroup viewGroup, Object obj) {
        K.a(viewGroup, (F) obj);
    }

    @Override // androidx.fragment.app.P
    public final boolean e(Object obj) {
        return obj instanceof F;
    }

    @Override // androidx.fragment.app.P
    public final Object f(Object obj) {
        if (obj != null) {
            return ((F) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.P
    public final Object j(Object obj, Object obj2, Object obj3) {
        F f10 = (F) obj;
        F f11 = (F) obj2;
        F f12 = (F) obj3;
        if (f10 != null && f11 != null) {
            L l10 = new L();
            l10.O(f10);
            l10.O(f11);
            l10.P(1);
            f10 = l10;
        } else if (f10 == null) {
            f10 = f11 != null ? f11 : null;
        }
        if (f12 == null) {
            return f10;
        }
        L l11 = new L();
        if (f10 != null) {
            l11.O(f10);
        }
        l11.O(f12);
        return l11;
    }

    @Override // androidx.fragment.app.P
    public final Object k(Object obj, Object obj2) {
        L l10 = new L();
        if (obj != null) {
            l10.O((F) obj);
        }
        l10.O((F) obj2);
        return l10;
    }

    @Override // androidx.fragment.app.P
    public final void l(Object obj, View view, ArrayList<View> arrayList) {
        ((F) obj).a(new a(view, arrayList));
    }

    @Override // androidx.fragment.app.P
    public final void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((F) obj).a(new C0690q(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.P
    public final void n(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            androidx.fragment.app.P.g(rect, view);
            ((F) obj).H(new C0688o(rect));
        }
    }

    @Override // androidx.fragment.app.P
    public final void o(Object obj, Rect rect) {
        ((F) obj).H(new b(rect));
    }

    @Override // androidx.fragment.app.P
    public final void q(Object obj, View view, ArrayList<View> arrayList) {
        L l10 = (L) obj;
        ArrayList<View> arrayList2 = l10.f2503g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.P.d(arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(l10, arrayList);
    }

    @Override // androidx.fragment.app.P
    public final void r(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        L l10 = (L) obj;
        if (l10 != null) {
            ArrayList<View> arrayList3 = l10.f2503g;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            t(l10, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.P
    public final Object s(Object obj) {
        if (obj == null) {
            return null;
        }
        L l10 = new L();
        l10.O((F) obj);
        return l10;
    }

    public final void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        F f10 = (F) obj;
        int i10 = 0;
        if (f10 instanceof L) {
            L l10 = (L) f10;
            int size = l10.f2540E.size();
            while (i10 < size) {
                t((i10 < 0 || i10 >= l10.f2540E.size()) ? null : l10.f2540E.get(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (androidx.fragment.app.P.h(f10.f2502f) && androidx.fragment.app.P.h(f10.f2504h) && androidx.fragment.app.P.h(f10.f2505i)) {
            ArrayList<View> arrayList3 = f10.f2503g;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size2) {
                    f10.c(arrayList2.get(i10));
                    i10++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    f10.D(arrayList.get(size3));
                }
            }
        }
    }

    /* JADX INFO: renamed from: D2.p$a */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    public class a implements F.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f2680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2681c;

        public a(View view, ArrayList arrayList) {
            this.f2680b = view;
            this.f2681c = arrayList;
        }

        @Override // D2.F.e
        public final void e(F f10) {
            f10.B(this);
            this.f2680b.setVisibility(8);
            ArrayList arrayList = this.f2681c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) arrayList.get(i10)).setVisibility(0);
            }
        }

        @Override // D2.F.e
        public final void a(F f10) {
        }

        @Override // D2.F.e
        public final void b(F f10) {
        }

        @Override // D2.F.e
        public final void c(F f10) {
        }

        @Override // D2.F.e
        public final void d(F f10) {
        }
    }
}
