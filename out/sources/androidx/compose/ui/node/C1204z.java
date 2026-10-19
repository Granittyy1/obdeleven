package androidx.compose.ui.node;

import p114j1.C2479a;

/* JADX INFO: renamed from: androidx.compose.ui.node.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: LayoutNodeLayoutDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1204z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutNode f14627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14629c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14635i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14640o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LookaheadPassDelegate f14642q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutNode.LayoutState f14630d = LayoutNode.LayoutState.f14429f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MeasurePassDelegate f14641p = new MeasurePassDelegate(this);

    public C1204z(LayoutNode layoutNode) {
        this.f14627a = layoutNode;
    }

    public final NodeCoordinator a() {
        return this.f14627a.f14389G.f14366c;
    }

    public final void b(int i10) {
        int i11 = this.f14637l;
        this.f14637l = i10;
        if ((i11 == 0) != (i10 == 0)) {
            LayoutNode layoutNodeG = this.f14627a.G();
            C1204z c1204z = layoutNodeG != null ? layoutNodeG.f14390H : null;
            if (c1204z != null) {
                if (i10 == 0) {
                    c1204z.b(c1204z.f14637l - 1);
                } else {
                    c1204z.b(c1204z.f14637l + 1);
                }
            }
        }
    }

    public final void c(int i10) {
        int i11 = this.f14640o;
        this.f14640o = i10;
        if ((i11 == 0) != (i10 == 0)) {
            LayoutNode layoutNodeG = this.f14627a.G();
            C1204z c1204z = layoutNodeG != null ? layoutNodeG.f14390H : null;
            if (c1204z != null) {
                if (i10 == 0) {
                    c1204z.c(c1204z.f14640o - 1);
                } else {
                    c1204z.c(c1204z.f14640o + 1);
                }
            }
        }
    }

    public final void d(boolean z10) {
        if (this.f14636k != z10) {
            this.f14636k = z10;
            if (z10 && !this.j) {
                b(this.f14637l + 1);
            } else {
                if (z10 || this.j) {
                    return;
                }
                b(this.f14637l - 1);
            }
        }
    }

    public final void e(boolean z10) {
        if (this.j != z10) {
            this.j = z10;
            if (z10 && !this.f14636k) {
                b(this.f14637l + 1);
            } else {
                if (z10 || this.f14636k) {
                    return;
                }
                b(this.f14637l - 1);
            }
        }
    }

    public final void f(boolean z10) {
        if (this.f14639n != z10) {
            this.f14639n = z10;
            if (z10 && !this.f14638m) {
                c(this.f14640o + 1);
            } else {
                if (z10 || this.f14638m) {
                    return;
                }
                c(this.f14640o - 1);
            }
        }
    }

    public final void g(boolean z10) {
        if (this.f14638m != z10) {
            this.f14638m = z10;
            if (z10 && !this.f14639n) {
                c(this.f14640o + 1);
            } else {
                if (z10 || this.f14639n) {
                    return;
                }
                c(this.f14640o - 1);
            }
        }
    }

    public final void h() {
        MeasurePassDelegate measurePassDelegate = this.f14641p;
        Object obj = measurePassDelegate.f14496t;
        LayoutNode layoutNode = this.f14627a;
        C1204z c1204z = measurePassDelegate.f14484g;
        if ((obj != null || c1204z.a().q() != null) && measurePassDelegate.f14495s) {
            measurePassDelegate.f14495s = false;
            measurePassDelegate.f14496t = c1204z.a().q();
            LayoutNode layoutNodeG = layoutNode.G();
            if (layoutNodeG != null) {
                LayoutNode.f0(layoutNodeG, false, 7);
            }
        }
        LookaheadPassDelegate lookaheadPassDelegate = this.f14642q;
        if (lookaheadPassDelegate != null) {
            Object obj2 = lookaheadPassDelegate.f14461y;
            C1204z c1204z2 = lookaheadPassDelegate.f14444g;
            if (obj2 == null) {
                D dR1 = c1204z2.a().r1();
                kotlin.jvm.internal.i.b(dR1);
                if (dR1.f14344n.q() == null) {
                    return;
                }
            }
            if (lookaheadPassDelegate.f14460x) {
                lookaheadPassDelegate.f14460x = false;
                D dR2 = c1204z2.a().r1();
                kotlin.jvm.internal.i.b(dR2);
                lookaheadPassDelegate.f14461y = dR2.f14344n.q();
                if (C2479a.l(layoutNode)) {
                    LayoutNode layoutNodeG2 = layoutNode.G();
                    if (layoutNodeG2 != null) {
                        LayoutNode.f0(layoutNodeG2, false, 7);
                        return;
                    }
                    return;
                }
                LayoutNode layoutNodeG3 = layoutNode.G();
                if (layoutNodeG3 != null) {
                    LayoutNode.d0(layoutNodeG3, false, 7);
                }
            }
        }
    }
}
