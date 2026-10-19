package androidx.compose.material3.internal;

import androidx.compose.material3.MenuKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: compiled from: MenuPosition.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s implements androidx.compose.ui.window.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p013b0.c f12561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.p<p013b0.k, p013b0.k, p293xa.r> f12563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1057c f12564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1057c f12565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final B f12566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B f12567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d f12568i;
    public final d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f12569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C f12570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C f12571m;

    public s() {
        throw null;
    }

    public s(long j, p013b0.c cVar, Ia.p pVar) {
        int iE1 = cVar.e1(MenuKt.f12211a);
        this.f12560a = j;
        this.f12561b = cVar;
        this.f12562c = iE1;
        this.f12563d = pVar;
        int iE2 = cVar.e1(Float.intBitsToFloat((int) (j >> 32)));
        androidx.compose.ui.f.a aVar = androidx.compose.ui.d.a.f13346m;
        this.f12564e = new C1057c(aVar, aVar, iE2);
        androidx.compose.ui.f.a aVar2 = androidx.compose.ui.d.a.f13348o;
        this.f12565f = new C1057c(aVar2, aVar2, iE2);
        this.f12566g = new B(androidx.compose.ui.a.f13280c, 0);
        this.f12567h = new B(androidx.compose.ui.a.f13281d, 0);
        int iE3 = cVar.e1(Float.intBitsToFloat((int) (j & 4294967295L)));
        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.j;
        androidx.compose.ui.f.b bVar2 = androidx.compose.ui.d.a.f13345l;
        this.f12568i = new d(bVar, bVar2, iE3);
        this.j = new d(bVar2, bVar, iE3);
        this.f12569k = new d(androidx.compose.ui.d.a.f13344k, bVar, iE3);
        this.f12570l = new C(bVar, iE1);
        this.f12571m = new C(bVar2, iE1);
    }

    @Override // androidx.compose.ui.window.m
    public final long a(p013b0.k kVar, long j, LayoutDirection layoutDirection, long j10) {
        int iA;
        int iA2;
        int i10;
        int i11 = (int) (j >> 32);
        List listS = kotlin.collections.l.s(this.f12564e, this.f12565f, ((int) (kVar.a() >> 32)) < i11 / 2 ? this.f12566g : this.f12567h);
        int size = listS.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                iA = 0;
                break;
            }
            int i13 = (int) (j10 >> 32);
            int i14 = size;
            int i15 = i12;
            List list = listS;
            int i16 = i11;
            iA = ((x) listS.get(i12)).a(kVar, j, i13, layoutDirection);
            if (i15 == kotlin.collections.l.r(list) || (iA >= 0 && i13 + iA <= i16)) {
                break;
            }
            i12 = i15 + 1;
            size = i14;
            i11 = i16;
            listS = list;
        }
        int i17 = (int) (j & 4294967295L);
        List listS2 = kotlin.collections.l.s(this.f12568i, this.j, this.f12569k, ((int) (kVar.a() & 4294967295L)) < i17 / 2 ? this.f12570l : this.f12571m);
        int size2 = listS2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            int i19 = (int) (j10 & 4294967295L);
            iA2 = ((y) listS2.get(i18)).a(kVar, j, i19);
            if (i18 == kotlin.collections.l.r(listS2) || (iA2 >= (i10 = this.f12562c) && i19 + iA2 <= i17 - i10)) {
                long jA = Cb.a.a(iA, iA2);
                this.f12563d.invoke(kVar, A8.p.a(jA, j10));
                return jA;
            }
        }
        iA2 = 0;
        long jA2 = Cb.a.a(iA, iA2);
        this.f12563d.invoke(kVar, A8.p.a(jA2, j10));
        return jA2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f12560a == sVar.f12560a && kotlin.jvm.internal.i.a(this.f12561b, sVar.f12561b) && this.f12562c == sVar.f12562c && kotlin.jvm.internal.i.a(this.f12563d, sVar.f12563d);
    }

    public final int hashCode() {
        return this.f12563d.hashCode() + p005a4.q.b(this.f12562c, (this.f12561b.hashCode() + (Long.hashCode(this.f12560a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) p013b0.g.a(this.f12560a)) + ", density=" + this.f12561b + ", verticalMargin=" + this.f12562c + ", onPositionCalculated=" + this.f12563d + ')';
    }
}
