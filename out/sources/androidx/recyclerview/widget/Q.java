package androidx.recyclerview.widget;

import androidx.collection.C0891t;
import androidx.collection.C0892u;
import androidx.collection.X;

/* JADX INFO: compiled from: ViewInfoStore.java */
/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X<RecyclerView.B, a> f19568a = new X<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0891t<RecyclerView.B> f19569b = new C0891t<>();

    /* JADX INFO: compiled from: ViewInfoStore.java */
    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final A0.d f19570d = new A0.d(20);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.i.b f19572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public RecyclerView.i.b f19573c;

        public static a a() {
            a aVar = (a) f19570d.a();
            return aVar == null ? new a() : aVar;
        }
    }

    public final void a(RecyclerView.B b10, RecyclerView.i.b bVar) {
        X<RecyclerView.B, a> x10 = this.f19568a;
        a aVarA = x10.get(b10);
        if (aVarA == null) {
            aVarA = a.a();
            x10.put(b10, aVarA);
        }
        aVarA.f19573c = bVar;
        aVarA.f19571a |= 8;
    }

    public final RecyclerView.i.b b(RecyclerView.B b10, int i10) {
        a aVarM;
        RecyclerView.i.b bVar;
        X<RecyclerView.B, a> x10 = this.f19568a;
        int iE = x10.e(b10);
        if (iE >= 0 && (aVarM = x10.m(iE)) != null) {
            int i11 = aVarM.f19571a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                aVarM.f19571a = i12;
                if (i10 == 4) {
                    bVar = aVarM.f19572b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVarM.f19573c;
                }
                if ((i12 & 12) == 0) {
                    x10.k(iE);
                    aVarM.f19571a = 0;
                    aVarM.f19572b = null;
                    aVarM.f19573c = null;
                    a.f19570d.b(aVarM);
                }
                return bVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.B b10) {
        a aVar = this.f19568a.get(b10);
        if (aVar == null) {
            return;
        }
        aVar.f19571a &= -2;
    }

    public final void d(RecyclerView.B b10) {
        C0891t<RecyclerView.B> c0891t = this.f19569b;
        for (int iG = c0891t.g() - 1; iG >= 0; iG--) {
            if (b10 == c0891t.h(iG)) {
                Object[] objArr = c0891t.f9212d;
                Object obj = objArr[iG];
                Object obj2 = C0892u.f9214a;
                if (obj == obj2) {
                    break;
                }
                objArr[iG] = obj2;
                c0891t.f9210b = true;
                break;
            }
        }
        a aVarRemove = this.f19568a.remove(b10);
        if (aVarRemove != null) {
            aVarRemove.f19571a = 0;
            aVarRemove.f19572b = null;
            aVarRemove.f19573c = null;
            a.f19570d.b(aVarRemove);
        }
    }
}
