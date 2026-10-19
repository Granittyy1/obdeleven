package androidx.compose.ui.graphics;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: GraphicsLayerScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements U {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f13631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f13632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f13633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f13634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f13635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f13636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f13637i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f13638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f13639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f13640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f13641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f13642o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l0 f13643p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13644q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13645r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f13646s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p013b0.c f13647t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LayoutDirection f13648u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b0 f13649v;

    @Override // androidx.compose.ui.graphics.U
    public final void A(long j) {
        if (H.c(this.j, j)) {
            return;
        }
        this.f13630b |= 128;
        this.j = j;
    }

    @Override // androidx.compose.ui.graphics.U
    public final void O0(l0 l0Var) {
        if (kotlin.jvm.internal.i.a(this.f13643p, l0Var)) {
            return;
        }
        this.f13630b |= 8192;
        this.f13643p = l0Var;
    }

    @Override // p013b0.c
    public final float P0() {
        return this.f13647t.P0();
    }

    @Override // androidx.compose.ui.graphics.U
    public final void b(float f10) {
        if (this.f13633e == f10) {
            return;
        }
        this.f13630b |= 4;
        this.f13633e = f10;
    }

    @Override // androidx.compose.ui.graphics.U
    public final void d(float f10) {
        if (this.f13639l == f10) {
            return;
        }
        this.f13630b |= 512;
        this.f13639l = f10;
    }

    @Override // androidx.compose.ui.graphics.U
    public final void e() {
        if (kotlin.jvm.internal.i.a(null, null)) {
            return;
        }
        this.f13630b |= 131072;
    }

    @Override // androidx.compose.ui.graphics.U
    public final void f(float f10) {
        if (this.f13640m == f10) {
            return;
        }
        this.f13630b |= 1024;
        this.f13640m = f10;
    }

    @Override // androidx.compose.ui.graphics.U
    public final void f1(long j) {
        if (q0.a(this.f13642o, j)) {
            return;
        }
        this.f13630b |= 4096;
        this.f13642o = j;
    }

    @Override // androidx.compose.ui.graphics.U
    public final void g(float f10) {
        if (this.f13635g == f10) {
            return;
        }
        this.f13630b |= 16;
        this.f13635g = f10;
    }

    @Override // p013b0.c
    public final float getDensity() {
        return this.f13647t.getDensity();
    }

    @Override // androidx.compose.ui.graphics.U
    public final void h(float f10) {
        if (this.f13632d == f10) {
            return;
        }
        this.f13630b |= 2;
        this.f13632d = f10;
    }

    @Override // androidx.compose.ui.graphics.U
    public final void i(float f10) {
        if (this.f13631c == f10) {
            return;
        }
        this.f13630b |= 1;
        this.f13631c = f10;
    }

    @Override // androidx.compose.ui.graphics.U
    public final long j() {
        return this.f13646s;
    }

    @Override // androidx.compose.ui.graphics.U
    public final void k(float f10) {
        if (this.f13634f == f10) {
            return;
        }
        this.f13630b |= 8;
        this.f13634f = f10;
    }

    @Override // androidx.compose.ui.graphics.U
    public final void l(float f10) {
        if (this.f13641n == f10) {
            return;
        }
        this.f13630b |= 2048;
        this.f13641n = f10;
    }

    @Override // androidx.compose.ui.graphics.U
    public final void m(float f10) {
        if (this.f13638k == f10) {
            return;
        }
        this.f13630b |= 256;
        this.f13638k = f10;
    }

    @Override // androidx.compose.ui.graphics.U
    public final void n(float f10) {
        if (this.f13636h == f10) {
            return;
        }
        this.f13630b |= 32;
        this.f13636h = f10;
    }

    @Override // androidx.compose.ui.graphics.U
    public final void t(int i10) {
        if (O.a(this.f13645r, i10)) {
            return;
        }
        this.f13630b |= 32768;
        this.f13645r = i10;
    }

    @Override // androidx.compose.ui.graphics.U
    public final void y(long j) {
        if (H.c(this.f13637i, j)) {
            return;
        }
        this.f13630b |= 64;
        this.f13637i = j;
    }

    @Override // androidx.compose.ui.graphics.U
    public final void z(boolean z10) {
        if (this.f13644q != z10) {
            this.f13630b |= 16384;
            this.f13644q = z10;
        }
    }
}
