package androidx.recyclerview.widget;

import A1.C0575j;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.recyclerview.widget.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DefaultItemAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1445j extends M {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f19862s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<RecyclerView.B> f19863h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList<RecyclerView.B> f19864i = new ArrayList<>();
    public final ArrayList<e> j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<d> f19865k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<ArrayList<RecyclerView.B>> f19866l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<ArrayList<e>> f19867m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList<ArrayList<d>> f19868n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList<RecyclerView.B> f19869o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList<RecyclerView.B> f19870p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList<RecyclerView.B> f19871q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList<RecyclerView.B> f19872r = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.j$a */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f19873b;

        public a(ArrayList arrayList) {
            this.f19873b = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f19873b;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C1445j c1445j = C1445j.this;
                if (!zHasNext) {
                    arrayList.clear();
                    c1445j.f19867m.remove(arrayList);
                    return;
                }
                e eVar = (e) it.next();
                RecyclerView.B b10 = eVar.f19885a;
                c1445j.getClass();
                View view = b10.itemView;
                int i10 = eVar.f19888d - eVar.f19886b;
                int i11 = eVar.f19889e - eVar.f19887c;
                if (i10 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i11 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c1445j.f19870p.add(b10);
                viewPropertyAnimatorAnimate.setDuration(c1445j.f19676e).setListener(new C1448m(c1445j, b10, i10, view, i11, viewPropertyAnimatorAnimate)).start();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.j$b */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f19875b;

        public b(ArrayList arrayList) {
            this.f19875b = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f19875b;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C1445j c1445j = C1445j.this;
                if (!zHasNext) {
                    arrayList.clear();
                    c1445j.f19868n.remove(arrayList);
                    return;
                }
                d dVar = (d) it.next();
                c1445j.getClass();
                RecyclerView.B b10 = dVar.f19879a;
                View view = b10 == null ? null : b10.itemView;
                RecyclerView.B b11 = dVar.f19880b;
                View view2 = b11 != null ? b11.itemView : null;
                ArrayList<RecyclerView.B> arrayList2 = c1445j.f19872r;
                long j = c1445j.f19677f;
                if (view != null) {
                    ViewPropertyAnimator duration = view.animate().setDuration(j);
                    arrayList2.add(dVar.f19879a);
                    duration.translationX(dVar.f19883e - dVar.f19881c);
                    duration.translationY(dVar.f19884f - dVar.f19882d);
                    duration.alpha(0.0f).setListener(new C1449n(c1445j, dVar, duration, view)).start();
                }
                if (view2 != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    arrayList2.add(dVar.f19880b);
                    viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C1450o(c1445j, dVar, viewPropertyAnimatorAnimate, view2)).start();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.j$c */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f19877b;

        public c(ArrayList arrayList) {
            this.f19877b = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f19877b;
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C1445j c1445j = C1445j.this;
                if (!zHasNext) {
                    arrayList.clear();
                    c1445j.f19866l.remove(arrayList);
                    return;
                }
                RecyclerView.B b10 = (RecyclerView.B) it.next();
                c1445j.getClass();
                View view = b10.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c1445j.f19869o.add(b10);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(c1445j.f19674c).setListener(new C1447l(view, viewPropertyAnimatorAnimate, c1445j, b10)).start();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.j$d */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.B f19879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.B f19880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19881c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f19884f;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeInfo{oldHolder=");
            sb2.append(this.f19879a);
            sb2.append(", newHolder=");
            sb2.append(this.f19880b);
            sb2.append(", fromX=");
            sb2.append(this.f19881c);
            sb2.append(", fromY=");
            sb2.append(this.f19882d);
            sb2.append(", toX=");
            sb2.append(this.f19883e);
            sb2.append(", toY=");
            return C0575j.b(sb2, this.f19884f, '}');
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.j$e */
    /* JADX INFO: compiled from: DefaultItemAnimator.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.B f19885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19886b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19888d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19889e;
    }

    public static void q(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.B) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean g(RecyclerView.B b10, List<Object> list) {
        return !list.isEmpty() || f(b10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void i(RecyclerView.B b10) {
        View view = b10.itemView;
        view.animate().cancel();
        ArrayList<e> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (arrayList.get(size).f19885a == b10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                h(b10);
                arrayList.remove(size);
            }
        }
        s(this.f19865k, b10);
        if (this.f19863h.remove(b10)) {
            view.setAlpha(1.0f);
            h(b10);
        }
        if (this.f19864i.remove(b10)) {
            view.setAlpha(1.0f);
            h(b10);
        }
        ArrayList<ArrayList<d>> arrayList2 = this.f19868n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList<d> arrayList3 = arrayList2.get(size2);
            s(arrayList3, b10);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList<ArrayList<e>> arrayList4 = this.f19867m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList<e> arrayList5 = arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (arrayList5.get(size4).f19885a == b10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    h(b10);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList<ArrayList<RecyclerView.B>> arrayList6 = this.f19866l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.B> arrayList7 = arrayList6.get(size5);
            if (arrayList7.remove(b10)) {
                view.setAlpha(1.0f);
                h(b10);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f19871q.remove(b10);
        this.f19869o.remove(b10);
        this.f19872r.remove(b10);
        this.f19870p.remove(b10);
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void j() {
        ArrayList<e> arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            e eVar = arrayList.get(size);
            View view = eVar.f19885a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            h(eVar.f19885a);
            arrayList.remove(size);
        }
        ArrayList<RecyclerView.B> arrayList2 = this.f19863h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            h(arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList<RecyclerView.B> arrayList3 = this.f19864i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.B b10 = arrayList3.get(size3);
            b10.itemView.setAlpha(1.0f);
            h(b10);
            arrayList3.remove(size3);
        }
        ArrayList<d> arrayList4 = this.f19865k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            d dVar = arrayList4.get(size4);
            RecyclerView.B b11 = dVar.f19879a;
            if (b11 != null) {
                t(dVar, b11);
            }
            RecyclerView.B b12 = dVar.f19880b;
            if (b12 != null) {
                t(dVar, b12);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList<ArrayList<e>> arrayList5 = this.f19867m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList<e> arrayList6 = arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    e eVar2 = arrayList6.get(size6);
                    View view2 = eVar2.f19885a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    h(eVar2.f19885a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList<ArrayList<RecyclerView.B>> arrayList7 = this.f19866l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.B> arrayList8 = arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.B b13 = arrayList8.get(size8);
                    b13.itemView.setAlpha(1.0f);
                    h(b13);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList<ArrayList<d>> arrayList9 = this.f19868n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList<d> arrayList10 = arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    d dVar2 = arrayList10.get(size10);
                    RecyclerView.B b14 = dVar2.f19879a;
                    if (b14 != null) {
                        t(dVar2, b14);
                    }
                    RecyclerView.B b15 = dVar2.f19880b;
                    if (b15 != null) {
                        t(dVar2, b15);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            q(this.f19871q);
            q(this.f19870p);
            q(this.f19869o);
            q(this.f19872r);
            ArrayList<RecyclerView.i.a> arrayList11 = this.f19673b;
            int size11 = arrayList11.size();
            for (int i10 = 0; i10 < size11; i10++) {
                arrayList11.get(i10).a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final boolean k() {
        return (this.f19864i.isEmpty() && this.f19865k.isEmpty() && this.j.isEmpty() && this.f19863h.isEmpty() && this.f19870p.isEmpty() && this.f19871q.isEmpty() && this.f19869o.isEmpty() && this.f19872r.isEmpty() && this.f19867m.isEmpty() && this.f19866l.isEmpty() && this.f19868n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void l() {
        long j;
        ArrayList<RecyclerView.B> arrayList = this.f19863h;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList<e> arrayList2 = this.j;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList<d> arrayList3 = this.f19865k;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList<RecyclerView.B> arrayList4 = this.f19864i;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.B> it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            j = this.f19675d;
            if (!zHasNext) {
                break;
            }
            RecyclerView.B next = it.next();
            View view = next.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f19871q.add(next);
            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C1446k(view, viewPropertyAnimatorAnimate, this, next)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList<e> arrayList5 = new ArrayList<>();
            arrayList5.addAll(arrayList2);
            this.f19867m.add(arrayList5);
            arrayList2.clear();
            a aVar = new a(arrayList5);
            if (zIsEmpty) {
                aVar.run();
            } else {
                View view2 = arrayList5.get(0).f19885a.itemView;
                WeakHashMap<View, Z> weakHashMap = androidx.core.view.O.f16859a;
                view2.postOnAnimationDelayed(aVar, j);
            }
        }
        if (!zIsEmpty3) {
            ArrayList<d> arrayList6 = new ArrayList<>();
            arrayList6.addAll(arrayList3);
            this.f19868n.add(arrayList6);
            arrayList3.clear();
            b bVar = new b(arrayList6);
            if (zIsEmpty) {
                bVar.run();
            } else {
                View view3 = arrayList6.get(0).f19879a.itemView;
                WeakHashMap<View, Z> weakHashMap2 = androidx.core.view.O.f16859a;
                view3.postOnAnimationDelayed(bVar, j);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.B> arrayList7 = new ArrayList<>();
        arrayList7.addAll(arrayList4);
        this.f19866l.add(arrayList7);
        arrayList4.clear();
        c cVar = new c(arrayList7);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
            return;
        }
        if (zIsEmpty) {
            j = 0;
        }
        long jMax = Math.max(!zIsEmpty2 ? this.f19676e : 0L, zIsEmpty3 ? 0L : this.f19677f) + j;
        View view4 = arrayList7.get(0).itemView;
        WeakHashMap<View, Z> weakHashMap3 = androidx.core.view.O.f16859a;
        view4.postOnAnimationDelayed(cVar, jMax);
    }

    @Override // androidx.recyclerview.widget.M
    public final void m(RecyclerView.B b10) {
        u(b10);
        b10.itemView.setAlpha(0.0f);
        this.f19864i.add(b10);
    }

    @Override // androidx.recyclerview.widget.M
    public final boolean n(RecyclerView.B b10, RecyclerView.B b11, int i10, int i11, int i12, int i13) {
        if (b10 == b11) {
            return o(b10, i10, i11, i12, i13);
        }
        float translationX = b10.itemView.getTranslationX();
        float translationY = b10.itemView.getTranslationY();
        float alpha = b10.itemView.getAlpha();
        u(b10);
        b10.itemView.setTranslationX(translationX);
        b10.itemView.setTranslationY(translationY);
        b10.itemView.setAlpha(alpha);
        u(b11);
        b11.itemView.setTranslationX(-((int) ((i12 - i10) - translationX)));
        b11.itemView.setTranslationY(-((int) ((i13 - i11) - translationY)));
        b11.itemView.setAlpha(0.0f);
        ArrayList<d> arrayList = this.f19865k;
        d dVar = new d();
        dVar.f19879a = b10;
        dVar.f19880b = b11;
        dVar.f19881c = i10;
        dVar.f19882d = i11;
        dVar.f19883e = i12;
        dVar.f19884f = i13;
        arrayList.add(dVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.M
    public final boolean o(RecyclerView.B b10, int i10, int i11, int i12, int i13) {
        View view = b10.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) b10.itemView.getTranslationY());
        u(b10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            h(b10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        ArrayList<e> arrayList = this.j;
        e eVar = new e();
        eVar.f19885a = b10;
        eVar.f19886b = translationX;
        eVar.f19887c = translationY;
        eVar.f19888d = i12;
        eVar.f19889e = i13;
        arrayList.add(eVar);
        return true;
    }

    @Override // androidx.recyclerview.widget.M
    public final void p(RecyclerView.B b10) {
        u(b10);
        this.f19863h.add(b10);
    }

    public final void r() {
        if (k()) {
            return;
        }
        ArrayList<RecyclerView.i.a> arrayList = this.f19673b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.get(i10).a();
        }
        arrayList.clear();
    }

    public final void s(ArrayList arrayList, RecyclerView.B b10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (t(dVar, b10) && dVar.f19879a == null && dVar.f19880b == null) {
                arrayList.remove(dVar);
            }
        }
    }

    public final boolean t(d dVar, RecyclerView.B b10) {
        if (dVar.f19880b == b10) {
            dVar.f19880b = null;
        } else {
            if (dVar.f19879a != b10) {
                return false;
            }
            dVar.f19879a = null;
        }
        b10.itemView.setAlpha(1.0f);
        b10.itemView.setTranslationX(0.0f);
        b10.itemView.setTranslationY(0.0f);
        h(b10);
        return true;
    }

    public final void u(RecyclerView.B b10) {
        if (f19862s == null) {
            f19862s = new ValueAnimator().getInterpolator();
        }
        b10.itemView.animate().setInterpolator(f19862s);
        i(b10);
    }
}
