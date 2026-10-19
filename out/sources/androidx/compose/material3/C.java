package androidx.compose.material3;

import androidx.compose.material3.internal.C1057c;
import androidx.compose.runtime.N0;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C implements androidx.compose.ui.window.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p013b0.c f12064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N0<p293xa.r> f12066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.p<p013b0.k, p013b0.k, p293xa.r> f12067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1057c f12068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1057c f12069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.compose.material3.internal.B f12070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.compose.material3.internal.B f12071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.compose.material3.internal.d f12072i;
    public final androidx.compose.material3.internal.d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.compose.material3.internal.C f12073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.compose.material3.internal.C f12074l;

    public C() {
        throw null;
    }

    public C(p013b0.c cVar, int i10, androidx.compose.runtime.X x10, Ia.p pVar) {
        int iE1 = cVar.e1(MenuKt.f12211a);
        this.f12064a = cVar;
        this.f12065b = i10;
        this.f12066c = x10;
        this.f12067d = pVar;
        androidx.compose.ui.f.a aVar = androidx.compose.ui.d.a.f13346m;
        this.f12068e = new C1057c(aVar, aVar, 0);
        androidx.compose.ui.f.a aVar2 = androidx.compose.ui.d.a.f13348o;
        this.f12069f = new C1057c(aVar2, aVar2, 0);
        this.f12070g = new androidx.compose.material3.internal.B(androidx.compose.ui.a.f13280c, 0);
        this.f12071h = new androidx.compose.material3.internal.B(androidx.compose.ui.a.f13281d, 0);
        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.j;
        androidx.compose.ui.f.b bVar2 = androidx.compose.ui.d.a.f13345l;
        this.f12072i = new androidx.compose.material3.internal.d(bVar, bVar2, 0);
        this.j = new androidx.compose.material3.internal.d(bVar2, bVar, 0);
        this.f12073k = new androidx.compose.material3.internal.C(bVar, iE1);
        this.f12074l = new androidx.compose.material3.internal.C(bVar2, iE1);
    }

    @Override // androidx.compose.ui.window.m
    public final long a(p013b0.k kVar, long j, LayoutDirection layoutDirection, long j10) {
        long j11;
        int iA;
        int i10;
        N0<p293xa.r> n10 = this.f12066c;
        if (n10 != null) {
            n10.getValue();
        }
        char c10 = ' ';
        long jA = A8.A.a((int) (j >> 32), ((int) (j & 4294967295L)) + this.f12065b);
        int i11 = (int) (jA >> 32);
        List listS = kotlin.collections.l.s(this.f12068e, this.f12069f, ((int) (kVar.a() >> 32)) < i11 / 2 ? this.f12070g : this.f12071h);
        int size = listS.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                j11 = jA;
                iA = 0;
                break;
            }
            int i13 = (int) (j10 >> c10);
            int i14 = i12;
            int i15 = i11;
            int i16 = size;
            j11 = jA;
            iA = ((androidx.compose.material3.internal.x) listS.get(i12)).a(kVar, jA, i13, layoutDirection);
            if (i14 == kotlin.collections.l.r(listS) || (iA >= 0 && i13 + iA <= i15)) {
                break;
            }
            i12 = i14 + 1;
            i11 = i15;
            size = i16;
            jA = j11;
            c10 = ' ';
        }
        long j12 = j11;
        int i17 = (int) (j12 & 4294967295L);
        List listS2 = kotlin.collections.l.s(this.f12072i, this.j, ((int) (kVar.a() & 4294967295L)) < i17 / 2 ? this.f12073k : this.f12074l);
        int size2 = listS2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            int i19 = (int) (j10 & 4294967295L);
            int iA2 = ((androidx.compose.material3.internal.y) listS2.get(i18)).a(kVar, j12, i19);
            if (i18 == kotlin.collections.l.r(listS2) || (iA2 >= 0 && i19 + iA2 <= i17)) {
                i10 = iA2;
                long jA2 = Cb.a.a(iA, i10);
                this.f12067d.invoke(kVar, A8.p.a(jA2, j10));
                return jA2;
            }
        }
        i10 = 0;
        long jA3 = Cb.a.a(iA, i10);
        this.f12067d.invoke(kVar, A8.p.a(jA3, j10));
        return jA3;
    }
}
