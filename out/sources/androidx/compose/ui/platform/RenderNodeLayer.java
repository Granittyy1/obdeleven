package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.C1139o;
import androidx.compose.ui.graphics.C1142s;
import androidx.compose.ui.graphics.C1143t;
import androidx.compose.ui.graphics.Path;

/* JADX INFO: compiled from: RenderNodeLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RenderNodeLayer implements androidx.compose.ui.node.T {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Ia.p<InterfaceC1215d0, Matrix, p293xa.r> f14946o = new Ia.p<InterfaceC1215d0, Matrix, p293xa.r>() { // from class: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1
        @Override // Ia.p
        public final p293xa.r invoke(InterfaceC1215d0 interfaceC1215d0, Matrix matrix) {
            interfaceC1215d0.I(matrix);
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AndroidComposeView f14947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> f14948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ia.a<p293xa.r> f14949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14950e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C1142s f14954i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC1215d0 f14957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14958n;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1248u0 f14951f = new C1248u0();
    public final C1237o0<InterfaceC1215d0> j = new C1237o0<>(f14946o);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.compose.ui.graphics.F f14955k = new androidx.compose.ui.graphics.F();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f14956l = androidx.compose.ui.graphics.q0.f13791b;

    public RenderNodeLayer(AndroidComposeView androidComposeView, Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> pVar, Ia.a<p293xa.r> aVar) {
        this.f14947b = androidComposeView;
        this.f14948c = pVar;
        this.f14949d = aVar;
        InterfaceC1215d0 d10 = Build.VERSION.SDK_INT >= 29 ? new D0() : new B0(androidComposeView);
        d10.A();
        d10.u(false);
        this.f14957m = d10;
    }

    @Override // androidx.compose.ui.node.T
    public final void a(float[] fArr) {
        androidx.compose.ui.graphics.a0.e(fArr, this.j.b(this.f14957m));
    }

    @Override // androidx.compose.ui.node.T
    public final void b() {
        InterfaceC1215d0 interfaceC1215d0 = this.f14957m;
        if (interfaceC1215d0.j()) {
            interfaceC1215d0.c();
        }
        this.f14948c = null;
        this.f14949d = null;
        this.f14952g = true;
        m(false);
        AndroidComposeView androidComposeView = this.f14947b;
        androidComposeView.f14658G = true;
        androidComposeView.N(this);
    }

    @Override // androidx.compose.ui.node.T
    public final boolean c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        InterfaceC1215d0 interfaceC1215d0 = this.f14957m;
        if (interfaceC1215d0.n()) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) interfaceC1215d0.getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) interfaceC1215d0.getHeight());
        }
        if (interfaceC1215d0.F()) {
            return this.f14951f.c(j);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.T
    public final void d(androidx.compose.ui.graphics.i0 i0Var) {
        Ia.a<p293xa.r> aVar;
        int i10 = i0Var.f13630b | this.f14958n;
        int i11 = i10 & 4096;
        if (i11 != 0) {
            this.f14956l = i0Var.f13642o;
        }
        InterfaceC1215d0 interfaceC1215d0 = this.f14957m;
        boolean zF = interfaceC1215d0.F();
        C1248u0 c1248u0 = this.f14951f;
        boolean z10 = false;
        boolean z11 = zF && c1248u0.f15101g;
        if ((i10 & 1) != 0) {
            interfaceC1215d0.i(i0Var.f13631c);
        }
        if ((i10 & 2) != 0) {
            interfaceC1215d0.h(i0Var.f13632d);
        }
        if ((i10 & 4) != 0) {
            interfaceC1215d0.b(i0Var.f13633e);
        }
        if ((i10 & 8) != 0) {
            interfaceC1215d0.k(i0Var.f13634f);
        }
        if ((i10 & 16) != 0) {
            interfaceC1215d0.g(i0Var.f13635g);
        }
        if ((i10 & 32) != 0) {
            interfaceC1215d0.x(i0Var.f13636h);
        }
        if ((i10 & 64) != 0) {
            interfaceC1215d0.C(Q3.d.K(i0Var.f13637i));
        }
        if ((i10 & 128) != 0) {
            interfaceC1215d0.H(Q3.d.K(i0Var.j));
        }
        if ((i10 & 1024) != 0) {
            interfaceC1215d0.f(i0Var.f13640m);
        }
        if ((i10 & 256) != 0) {
            interfaceC1215d0.m(i0Var.f13638k);
        }
        if ((i10 & 512) != 0) {
            interfaceC1215d0.d(i0Var.f13639l);
        }
        if ((i10 & 2048) != 0) {
            interfaceC1215d0.l(i0Var.f13641n);
        }
        if (i11 != 0) {
            interfaceC1215d0.s(androidx.compose.ui.graphics.q0.b(this.f14956l) * interfaceC1215d0.getWidth());
            interfaceC1215d0.w(androidx.compose.ui.graphics.q0.c(this.f14956l) * interfaceC1215d0.getHeight());
        }
        boolean z12 = i0Var.f13644q;
        androidx.compose.ui.graphics.h0.a aVar2 = androidx.compose.ui.graphics.h0.f13629a;
        boolean z13 = z12 && i0Var.f13643p != aVar2;
        if ((i10 & 24576) != 0) {
            interfaceC1215d0.G(z13);
            interfaceC1215d0.u(i0Var.f13644q && i0Var.f13643p == aVar2);
        }
        if ((131072 & i10) != 0) {
            interfaceC1215d0.e();
        }
        if ((32768 & i10) != 0) {
            interfaceC1215d0.t(i0Var.f13645r);
        }
        boolean zD = this.f14951f.d(i0Var.f13649v, i0Var.f13633e, z13, i0Var.f13636h, i0Var.f13646s);
        if (c1248u0.f15100f) {
            interfaceC1215d0.z(c1248u0.b());
        }
        if (z13 && c1248u0.f15101g) {
            z10 = true;
        }
        View view = this.f14947b;
        if (z11 == z10 && (!z10 || !zD)) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(view, view);
            }
        } else if (!this.f14950e && !this.f14952g) {
            view.invalidate();
            m(true);
        }
        if (!this.f14953h && interfaceC1215d0.J() > 0.0f && (aVar = this.f14949d) != null) {
            aVar.invoke();
        }
        if ((i10 & 7963) != 0) {
            this.j.c();
        }
        this.f14958n = i0Var.f13630b;
    }

    @Override // androidx.compose.ui.node.T
    public final long e(long j, boolean z10) {
        InterfaceC1215d0 interfaceC1215d0 = this.f14957m;
        C1237o0<InterfaceC1215d0> c1237o0 = this.j;
        if (!z10) {
            return !c1237o0.f15081h ? androidx.compose.ui.graphics.a0.b(j, c1237o0.b(interfaceC1215d0)) : j;
        }
        float[] fArrA = c1237o0.a(interfaceC1215d0);
        if (fArrA == null) {
            return 9187343241974906880L;
        }
        return !c1237o0.f15081h ? androidx.compose.ui.graphics.a0.b(j, fArrA) : j;
    }

    @Override // androidx.compose.ui.node.T
    public final void f(long j) {
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        float fB = androidx.compose.ui.graphics.q0.b(this.f14956l) * i10;
        InterfaceC1215d0 interfaceC1215d0 = this.f14957m;
        interfaceC1215d0.s(fB);
        interfaceC1215d0.w(androidx.compose.ui.graphics.q0.c(this.f14956l) * i11);
        if (interfaceC1215d0.v(interfaceC1215d0.r(), interfaceC1215d0.B(), interfaceC1215d0.r() + i10, interfaceC1215d0.B() + i11)) {
            interfaceC1215d0.z(this.f14951f.b());
            if (!this.f14950e && !this.f14952g) {
                this.f14947b.invalidate();
                m(true);
            }
            this.j.c();
        }
    }

    @Override // androidx.compose.ui.node.T
    public final void g(Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> pVar, Ia.a<p293xa.r> aVar) {
        C1237o0<InterfaceC1215d0> c1237o0 = this.j;
        c1237o0.f15078e = false;
        c1237o0.f15079f = false;
        c1237o0.f15081h = true;
        c1237o0.f15080g = true;
        androidx.compose.ui.graphics.a0.d(c1237o0.f15076c);
        androidx.compose.ui.graphics.a0.d(c1237o0.f15077d);
        m(false);
        this.f14952g = false;
        this.f14953h = false;
        this.f14956l = androidx.compose.ui.graphics.q0.f13791b;
        this.f14948c = pVar;
        this.f14949d = aVar;
    }

    @Override // androidx.compose.ui.node.T
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo4getUnderlyingMatrixsQKQjiQ() {
        return this.j.b(this.f14957m);
    }

    @Override // androidx.compose.ui.node.T
    public final void h(androidx.compose.ui.graphics.E e10, androidx.compose.ui.graphics.layer.b bVar) {
        Canvas canvasA = C1139o.a(e10);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        InterfaceC1215d0 interfaceC1215d0 = this.f14957m;
        if (zIsHardwareAccelerated) {
            l();
            boolean z10 = interfaceC1215d0.J() > 0.0f;
            this.f14953h = z10;
            if (z10) {
                e10.t();
            }
            interfaceC1215d0.q(canvasA);
            if (this.f14953h) {
                e10.h();
                return;
            }
            return;
        }
        float fR = interfaceC1215d0.r();
        float fB = interfaceC1215d0.B();
        float fE = interfaceC1215d0.E();
        float fP = interfaceC1215d0.p();
        if (interfaceC1215d0.a() < 1.0f) {
            C1142s c1142sA = this.f14954i;
            if (c1142sA == null) {
                c1142sA = C1143t.a();
                this.f14954i = c1142sA;
            }
            c1142sA.b(interfaceC1215d0.a());
            canvasA.saveLayer(fR, fB, fE, fP, c1142sA.f13794a);
        } else {
            e10.g();
        }
        e10.m(fR, fB);
        e10.i(this.j.b(interfaceC1215d0));
        if (interfaceC1215d0.F() || interfaceC1215d0.n()) {
            this.f14951f.a(e10);
        }
        Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> pVar = this.f14948c;
        if (pVar != null) {
            pVar.invoke(e10, null);
        }
        e10.o();
        m(false);
    }

    @Override // androidx.compose.ui.node.T
    public final void i(I.c cVar, boolean z10) {
        InterfaceC1215d0 interfaceC1215d0 = this.f14957m;
        C1237o0<InterfaceC1215d0> c1237o0 = this.j;
        if (!z10) {
            float[] fArrB = c1237o0.b(interfaceC1215d0);
            if (c1237o0.f15081h) {
                return;
            }
            androidx.compose.ui.graphics.a0.c(fArrB, cVar);
            return;
        }
        float[] fArrA = c1237o0.a(interfaceC1215d0);
        if (fArrA != null) {
            if (c1237o0.f15081h) {
                return;
            }
            androidx.compose.ui.graphics.a0.c(fArrA, cVar);
        } else {
            cVar.f3750a = 0.0f;
            cVar.f3751b = 0.0f;
            cVar.f3752c = 0.0f;
            cVar.f3753d = 0.0f;
        }
    }

    @Override // androidx.compose.ui.node.T
    public final void invalidate() {
        if (this.f14950e || this.f14952g) {
            return;
        }
        this.f14947b.invalidate();
        m(true);
    }

    @Override // androidx.compose.ui.node.T
    public final void j(float[] fArr) {
        float[] fArrA = this.j.a(this.f14957m);
        if (fArrA != null) {
            androidx.compose.ui.graphics.a0.e(fArr, fArrA);
        }
    }

    @Override // androidx.compose.ui.node.T
    public final void k(long j) {
        InterfaceC1215d0 interfaceC1215d0 = this.f14957m;
        int iR = interfaceC1215d0.r();
        int iB = interfaceC1215d0.B();
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        if (iR == i10 && iB == i11) {
            return;
        }
        if (iR != i10) {
            interfaceC1215d0.o(i10 - iR);
        }
        if (iB != i11) {
            interfaceC1215d0.y(i11 - iB);
        }
        View view = this.f14947b;
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(view, view);
        }
        this.j.c();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    @Override // androidx.compose.ui.node.T
    public final void l() {
        Path path;
        boolean z10 = this.f14950e;
        InterfaceC1215d0 interfaceC1215d0 = this.f14957m;
        if (z10 || !interfaceC1215d0.j()) {
            if (interfaceC1215d0.F()) {
                C1248u0 c1248u0 = this.f14951f;
                if (c1248u0.f15101g) {
                    c1248u0.e();
                    path = c1248u0.f15099e;
                } else {
                    path = null;
                }
            } else {
                path = null;
            }
            Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> pVar = this.f14948c;
            if (pVar != null) {
                interfaceC1215d0.D(this.f14955k, path, new RenderNodeLayer$updateDisplayList$1$1(pVar));
            }
            m(false);
        }
    }

    public final void m(boolean z10) {
        if (z10 != this.f14950e) {
            this.f14950e = z10;
            this.f14947b.E(this, z10);
        }
    }
}
