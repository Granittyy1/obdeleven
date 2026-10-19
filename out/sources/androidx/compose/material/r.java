package androidx.compose.material;

import androidx.compose.animation.core.C0907g;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.X;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r implements U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f11940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f11941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11942i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f11943k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f11944l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f11945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f11946n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f11947o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f11948p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f11949q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f11950r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f11951s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f11952t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f11953u;

    public r(long j, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        this.f11934a = j;
        this.f11935b = j10;
        this.f11936c = j11;
        this.f11937d = j12;
        this.f11938e = j13;
        this.f11939f = j14;
        this.f11940g = j15;
        this.f11941h = j16;
        this.f11942i = j17;
        this.j = j18;
        this.f11943k = j19;
        this.f11944l = j20;
        this.f11945m = j21;
        this.f11946n = j22;
        this.f11947o = j23;
        this.f11948p = j24;
        this.f11949q = j25;
        this.f11950r = j26;
        this.f11951s = j27;
        this.f11952t = j28;
        this.f11953u = j29;
    }

    @Override // androidx.compose.material.U
    /* JADX INFO: renamed from: a */
    public final X mo2a(boolean z10, boolean z11, InterfaceC1084f interfaceC1084f) {
        long j;
        interfaceC1084f.L(225259054);
        if (z10) {
            j = z11 ? this.f11946n : this.f11944l;
        } else {
            j = this.f11945m;
        }
        X xI = J0.i(new androidx.compose.ui.graphics.H(j), interfaceC1084f);
        interfaceC1084f.D();
        return xI;
    }

    @Override // androidx.compose.material.U
    /* JADX INFO: renamed from: b */
    public final X mo3b(boolean z10, boolean z11, InterfaceC1084f interfaceC1084f) {
        long j;
        interfaceC1084f.L(1016171324);
        if (z10) {
            j = z11 ? this.f11943k : this.f11942i;
        } else {
            j = this.j;
        }
        X xI = J0.i(new androidx.compose.ui.graphics.H(j), interfaceC1084f);
        interfaceC1084f.D();
        return xI;
    }

    @Override // androidx.compose.material.U
    public final X c(boolean z10, InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.L(264799724);
        X xI = J0.i(new androidx.compose.ui.graphics.H(z10 ? this.f11952t : this.f11953u), interfaceC1084f);
        interfaceC1084f.D();
        return xI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material.U
    public final X d(boolean z10, boolean z11, androidx.compose.foundation.interaction.j jVar, InterfaceC1084f interfaceC1084f) {
        long j;
        interfaceC1084f.L(727091888);
        X xA = androidx.compose.foundation.interaction.f.a(jVar, interfaceC1084f, 0);
        if (!z10) {
            j = this.f11950r;
        } else if (z11) {
            j = this.f11951s;
        } else {
            j = ((Boolean) xA.getValue()).booleanValue() ? this.f11948p : this.f11949q;
        }
        X xI = J0.i(new androidx.compose.ui.graphics.H(j), interfaceC1084f);
        interfaceC1084f.D();
        return xI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.material.U
    public final N0<androidx.compose.ui.graphics.H> e(boolean z10, boolean z11, androidx.compose.foundation.interaction.j jVar, InterfaceC1084f interfaceC1084f, int i10) {
        long j;
        N0<androidx.compose.ui.graphics.H> n0I;
        interfaceC1084f.L(998675979);
        X xA = androidx.compose.foundation.interaction.f.a(jVar, interfaceC1084f, (i10 >> 6) & 14);
        if (!z10) {
            j = this.f11941h;
        } else if (z11) {
            j = this.f11940g;
        } else {
            j = ((Boolean) xA.getValue()).booleanValue() ? this.f11938e : this.f11939f;
        }
        long j10 = j;
        if (z10) {
            interfaceC1084f.L(1614254271);
            n0I = androidx.compose.animation.x.a(j10, C0907g.d(150, 0, null, 6), null, interfaceC1084f, 48, 12);
            interfaceC1084f.D();
        } else {
            interfaceC1084f.L(1614357129);
            n0I = J0.i(new androidx.compose.ui.graphics.H(j10), interfaceC1084f);
            interfaceC1084f.D();
        }
        interfaceC1084f.D();
        return n0I;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return androidx.compose.ui.graphics.H.c(this.f11934a, rVar.f11934a) && androidx.compose.ui.graphics.H.c(this.f11935b, rVar.f11935b) && androidx.compose.ui.graphics.H.c(this.f11936c, rVar.f11936c) && androidx.compose.ui.graphics.H.c(this.f11937d, rVar.f11937d) && androidx.compose.ui.graphics.H.c(this.f11938e, rVar.f11938e) && androidx.compose.ui.graphics.H.c(this.f11939f, rVar.f11939f) && androidx.compose.ui.graphics.H.c(this.f11940g, rVar.f11940g) && androidx.compose.ui.graphics.H.c(this.f11941h, rVar.f11941h) && androidx.compose.ui.graphics.H.c(this.f11942i, rVar.f11942i) && androidx.compose.ui.graphics.H.c(this.j, rVar.j) && androidx.compose.ui.graphics.H.c(this.f11943k, rVar.f11943k) && androidx.compose.ui.graphics.H.c(this.f11944l, rVar.f11944l) && androidx.compose.ui.graphics.H.c(this.f11945m, rVar.f11945m) && androidx.compose.ui.graphics.H.c(this.f11946n, rVar.f11946n) && androidx.compose.ui.graphics.H.c(this.f11947o, rVar.f11947o) && androidx.compose.ui.graphics.H.c(this.f11948p, rVar.f11948p) && androidx.compose.ui.graphics.H.c(this.f11949q, rVar.f11949q) && androidx.compose.ui.graphics.H.c(this.f11950r, rVar.f11950r) && androidx.compose.ui.graphics.H.c(this.f11951s, rVar.f11951s) && androidx.compose.ui.graphics.H.c(this.f11952t, rVar.f11952t) && androidx.compose.ui.graphics.H.c(this.f11953u, rVar.f11953u);
    }

    @Override // androidx.compose.material.U
    public final X f(boolean z10, InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.L(9804418);
        X xI = J0.i(new androidx.compose.ui.graphics.H(z10 ? this.f11934a : this.f11935b), interfaceC1084f);
        interfaceC1084f.D();
        return xI;
    }

    @Override // androidx.compose.material.U
    public final X g(boolean z10, InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.L(-1446422485);
        X xI = J0.i(new androidx.compose.ui.graphics.H(z10 ? this.f11937d : this.f11936c), interfaceC1084f);
        interfaceC1084f.D();
        return xI;
    }

    @Override // androidx.compose.material.U
    public final X h(InterfaceC1084f interfaceC1084f) {
        interfaceC1084f.L(-1423938813);
        X xI = J0.i(new androidx.compose.ui.graphics.H(this.f11947o), interfaceC1084f);
        interfaceC1084f.D();
        return xI;
    }

    public final int hashCode() {
        int i10 = androidx.compose.ui.graphics.H.f13505m;
        return Long.hashCode(this.f11953u) + C4.b.c(this.f11952t, C4.b.c(this.f11951s, C4.b.c(this.f11950r, C4.b.c(this.f11949q, C4.b.c(this.f11948p, C4.b.c(this.f11947o, C4.b.c(this.f11946n, C4.b.c(this.f11945m, C4.b.c(this.f11944l, C4.b.c(this.f11943k, C4.b.c(this.j, C4.b.c(this.f11942i, C4.b.c(this.f11941h, C4.b.c(this.f11940g, C4.b.c(this.f11939f, C4.b.c(this.f11938e, C4.b.c(this.f11937d, C4.b.c(this.f11936c, C4.b.c(this.f11935b, Long.hashCode(this.f11934a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // androidx.compose.material.U
    public final N0 a(boolean z10, boolean z11, InterfaceC1084f interfaceC1084f) {
        long j;
        interfaceC1084f.L(1383318157);
        if (!z10) {
            j = this.f11945m;
        } else if (z11) {
            j = this.f11946n;
        } else {
            j = this.f11944l;
        }
        X xI = J0.i(new androidx.compose.ui.graphics.H(j), interfaceC1084f);
        interfaceC1084f.D();
        return xI;
    }

    @Override // androidx.compose.material.U
    public final N0 b(boolean z10, boolean z11, InterfaceC1084f interfaceC1084f) {
        long j;
        interfaceC1084f.L(-1519634405);
        if (!z10) {
            j = this.j;
        } else if (z11) {
            j = this.f11943k;
        } else {
            j = this.f11942i;
        }
        X xI = J0.i(new androidx.compose.ui.graphics.H(j), interfaceC1084f);
        interfaceC1084f.D();
        return xI;
    }
}
