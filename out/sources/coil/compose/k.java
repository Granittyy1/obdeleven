package coil.compose;

import android.os.SystemClock;
import androidx.compose.runtime.C1079c0;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.ui.graphics.I;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.InterfaceC1161g;

/* JADX INFO: compiled from: CrossfadePainter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Painter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Painter f22780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Painter f22781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC1161g f22782i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f22783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f22784l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22787o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1081d0 f22785m = new C1081d0(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f22786n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1079c0 f22788p = new C1079c0(1.0f);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1085f0 f22789q = J0.f(null);

    public k(Painter painter, Painter painter2, InterfaceC1161g interfaceC1161g, int i10, boolean z10, boolean z11) {
        this.f22780g = painter;
        this.f22781h = painter2;
        this.f22782i = interfaceC1161g;
        this.j = i10;
        this.f22783k = z10;
        this.f22784l = z11;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean a(float f10) {
        this.f22788p.f(f10);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean e(I i10) {
        this.f22789q.setValue(i10);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final long h() {
        Painter painter = this.f22780g;
        long jH = painter != null ? painter.h() : 0L;
        Painter painter2 = this.f22781h;
        long jH2 = painter2 != null ? painter2.h() : 0L;
        boolean z10 = jH != 9205357640488583168L;
        boolean z11 = jH2 != 9205357640488583168L;
        if (z10 && z11) {
            return Cb.a.b(Math.max(I.h.d(jH), I.h.d(jH2)), Math.max(I.h.b(jH), I.h.b(jH2)));
        }
        if (this.f22784l) {
            if (z10) {
                return jH;
            }
            if (z11) {
                return jH2;
            }
        }
        return 9205357640488583168L;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void i(J.e eVar) {
        boolean z10 = this.f22787o;
        Painter painter = this.f22781h;
        C1079c0 c1079c0 = this.f22788p;
        if (z10) {
            j(eVar, painter, c1079c0.j());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f22786n == -1) {
            this.f22786n = jUptimeMillis;
        }
        float f10 = (jUptimeMillis - this.f22786n) / this.j;
        float fJ = c1079c0.j() * Na.l.C(f10, 0.0f, 1.0f);
        float fJ2 = this.f22783k ? c1079c0.j() - fJ : c1079c0.j();
        this.f22787o = f10 >= 1.0f;
        j(eVar, this.f22780g, fJ2);
        j(eVar, painter, fJ);
        if (this.f22787o) {
            this.f22780g = null;
        } else {
            C1081d0 c1081d0 = this.f22785m;
            c1081d0.m(c1081d0.o() + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(J.e eVar, Painter painter, float f10) {
        if (painter == null || f10 <= 0.0f) {
            return;
        }
        long j = eVar.j();
        long jH = painter.h();
        long jN = (jH == 9205357640488583168L || I.h.e(jH) || j == 9205357640488583168L || I.h.e(j)) ? j : O.h.n(jH, this.f22782i.a(jH, j));
        C1085f0 c1085f0 = this.f22789q;
        if (j == 9205357640488583168L || I.h.e(j)) {
            painter.g(eVar, jN, f10, (I) c1085f0.getValue());
            return;
        }
        float f11 = 2;
        float fD = (I.h.d(j) - I.h.d(jN)) / f11;
        float fB = (I.h.b(j) - I.h.b(jN)) / f11;
        eVar.W0().f3948a.e(fD, fB, fD, fB);
        painter.g(eVar, jN, f10, (I) c1085f0.getValue());
        float f12 = -fD;
        float f13 = -fB;
        eVar.W0().f3948a.e(f12, f13, f12, f13);
    }
}
