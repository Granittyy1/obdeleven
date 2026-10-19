package androidx.compose.ui.platform;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.layer.GraphicsLayerImpl;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: GraphicsLayerOwnerLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GraphicsLayerOwnerLayer implements androidx.compose.ui.node.T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.compose.ui.graphics.layer.b f14893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.compose.ui.graphics.S f14894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AndroidComposeView f14895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> f14896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Ia.a<p293xa.r> f14897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f14898g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14899h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f14900i;
    public float[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p013b0.c f14902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LayoutDirection f14903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final J.a f14904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14905o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f14906p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.compose.ui.graphics.b0 f14907q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14908r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14910t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14911u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Ia.l<J.e, p293xa.r> f14912v;

    public GraphicsLayerOwnerLayer(androidx.compose.ui.graphics.layer.b bVar, androidx.compose.ui.graphics.S s10, AndroidComposeView androidComposeView, Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> pVar, Ia.a<p293xa.r> aVar) {
        this.f14893b = bVar;
        this.f14894c = s10;
        this.f14895d = androidComposeView;
        this.f14896e = pVar;
        this.f14897f = aVar;
        long j = BrazeLogger.SUPPRESS;
        this.f14898g = (j & 4294967295L) | (j << 32);
        this.f14900i = androidx.compose.ui.graphics.a0.a();
        this.f14902l = p006a5.a.a();
        this.f14903m = LayoutDirection.f15717b;
        this.f14904n = new J.a();
        this.f14906p = androidx.compose.ui.graphics.q0.f13791b;
        this.f14910t = true;
        this.f14912v = new Ia.l<J.e, p293xa.r>() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(J.e eVar) {
                J.e eVar2 = eVar;
                GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.this$0;
                androidx.compose.ui.graphics.E eA = eVar2.W0().a();
                Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> pVar2 = graphicsLayerOwnerLayer.f14896e;
                if (pVar2 != null) {
                    pVar2.invoke(eA, eVar2.W0().f3949b);
                }
                return p293xa.r.f47939a;
            }
        };
    }

    @Override // androidx.compose.ui.node.T
    public final void a(float[] fArr) {
        androidx.compose.ui.graphics.a0.e(fArr, n());
    }

    @Override // androidx.compose.ui.node.T
    public final void b() {
        this.f14896e = null;
        this.f14897f = null;
        this.f14899h = true;
        boolean z10 = this.f14901k;
        AndroidComposeView androidComposeView = this.f14895d;
        if (z10) {
            this.f14901k = false;
            androidComposeView.E(this, false);
        }
        androidx.compose.ui.graphics.S s10 = this.f14894c;
        if (s10 != null) {
            s10.a(this.f14893b);
            androidComposeView.N(this);
        }
    }

    @Override // androidx.compose.ui.node.T
    public final boolean c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        androidx.compose.ui.graphics.layer.b bVar = this.f14893b;
        if (bVar.f13682w) {
            return L0.a(bVar.d(), fIntBitsToFloat, fIntBitsToFloat2, null, null);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.T
    public final void d(androidx.compose.ui.graphics.i0 i0Var) {
        View view;
        ViewParent parent;
        Ia.a<p293xa.r> aVar;
        int i10;
        Ia.a<p293xa.r> aVar2;
        int i11 = i0Var.f13630b | this.f14905o;
        this.f14903m = i0Var.f13648u;
        this.f14902l = i0Var.f13647t;
        int i12 = i11 & 4096;
        if (i12 != 0) {
            this.f14906p = i0Var.f13642o;
        }
        if ((i11 & 1) != 0) {
            androidx.compose.ui.graphics.layer.b bVar = this.f14893b;
            float f10 = i0Var.f13631c;
            GraphicsLayerImpl graphicsLayerImpl = bVar.f13661a;
            if (graphicsLayerImpl.o() != f10) {
                graphicsLayerImpl.i(f10);
            }
        }
        if ((i11 & 2) != 0) {
            androidx.compose.ui.graphics.layer.b bVar2 = this.f14893b;
            float f11 = i0Var.f13632d;
            GraphicsLayerImpl graphicsLayerImpl2 = bVar2.f13661a;
            if (graphicsLayerImpl2.I() != f11) {
                graphicsLayerImpl2.h(f11);
            }
        }
        if ((i11 & 4) != 0) {
            this.f14893b.f(i0Var.f13633e);
        }
        if ((i11 & 8) != 0) {
            androidx.compose.ui.graphics.layer.b bVar3 = this.f14893b;
            float f12 = i0Var.f13634f;
            GraphicsLayerImpl graphicsLayerImpl3 = bVar3.f13661a;
            if (graphicsLayerImpl3.C() != f12) {
                graphicsLayerImpl3.k(f12);
            }
        }
        if ((i11 & 16) != 0) {
            androidx.compose.ui.graphics.layer.b bVar4 = this.f14893b;
            float f13 = i0Var.f13635g;
            GraphicsLayerImpl graphicsLayerImpl4 = bVar4.f13661a;
            if (graphicsLayerImpl4.v() != f13) {
                graphicsLayerImpl4.g(f13);
            }
        }
        boolean z10 = true;
        if ((i11 & 32) != 0) {
            androidx.compose.ui.graphics.layer.b bVar5 = this.f14893b;
            float f14 = i0Var.f13636h;
            GraphicsLayerImpl graphicsLayerImpl5 = bVar5.f13661a;
            if (graphicsLayerImpl5.H() != f14) {
                graphicsLayerImpl5.n(f14);
                bVar5.f13667g = true;
                bVar5.a();
            }
            if (i0Var.f13636h > 0.0f && !this.f14911u && (aVar2 = this.f14897f) != null) {
                aVar2.invoke();
            }
        }
        if ((i11 & 64) != 0) {
            androidx.compose.ui.graphics.layer.b bVar6 = this.f14893b;
            long j = i0Var.f13637i;
            GraphicsLayerImpl graphicsLayerImpl6 = bVar6.f13661a;
            if (!androidx.compose.ui.graphics.H.c(j, graphicsLayerImpl6.u())) {
                graphicsLayerImpl6.y(j);
            }
        }
        if ((i11 & 128) != 0) {
            androidx.compose.ui.graphics.layer.b bVar7 = this.f14893b;
            long j10 = i0Var.j;
            GraphicsLayerImpl graphicsLayerImpl7 = bVar7.f13661a;
            if (!androidx.compose.ui.graphics.H.c(j10, graphicsLayerImpl7.w())) {
                graphicsLayerImpl7.A(j10);
            }
        }
        if ((i11 & 1024) != 0) {
            androidx.compose.ui.graphics.layer.b bVar8 = this.f14893b;
            float f15 = i0Var.f13640m;
            GraphicsLayerImpl graphicsLayerImpl8 = bVar8.f13661a;
            if (graphicsLayerImpl8.s() != f15) {
                graphicsLayerImpl8.f(f15);
            }
        }
        if ((i11 & 256) != 0) {
            androidx.compose.ui.graphics.layer.b bVar9 = this.f14893b;
            float f16 = i0Var.f13638k;
            GraphicsLayerImpl graphicsLayerImpl9 = bVar9.f13661a;
            if (graphicsLayerImpl9.D() != f16) {
                graphicsLayerImpl9.m(f16);
            }
        }
        if ((i11 & 512) != 0) {
            androidx.compose.ui.graphics.layer.b bVar10 = this.f14893b;
            float f17 = i0Var.f13639l;
            GraphicsLayerImpl graphicsLayerImpl10 = bVar10.f13661a;
            if (graphicsLayerImpl10.r() != f17) {
                graphicsLayerImpl10.d(f17);
            }
        }
        if ((i11 & 2048) != 0) {
            androidx.compose.ui.graphics.layer.b bVar11 = this.f14893b;
            float f18 = i0Var.f13641n;
            GraphicsLayerImpl graphicsLayerImpl11 = bVar11.f13661a;
            if (graphicsLayerImpl11.x() != f18) {
                graphicsLayerImpl11.l(f18);
            }
        }
        if (i12 != 0) {
            if (androidx.compose.ui.graphics.q0.a(this.f14906p, androidx.compose.ui.graphics.q0.f13791b)) {
                androidx.compose.ui.graphics.layer.b bVar12 = this.f14893b;
                if (!I.d.b(bVar12.f13681v, 9205357640488583168L)) {
                    bVar12.f13681v = 9205357640488583168L;
                    bVar12.f13661a.t(9205357640488583168L);
                }
            } else {
                androidx.compose.ui.graphics.layer.b bVar13 = this.f14893b;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.q0.c(this.f14906p) * ((int) (this.f14898g & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.q0.b(this.f14906p) * ((int) (this.f14898g >> 32)))) << 32);
                if (!I.d.b(bVar13.f13681v, jFloatToRawIntBits)) {
                    bVar13.f13681v = jFloatToRawIntBits;
                    bVar13.f13661a.t(jFloatToRawIntBits);
                }
            }
        }
        if ((i11 & 16384) != 0) {
            androidx.compose.ui.graphics.layer.b bVar14 = this.f14893b;
            boolean z11 = i0Var.f13644q;
            if (bVar14.f13682w != z11) {
                bVar14.f13682w = z11;
                bVar14.f13667g = true;
                bVar14.a();
            }
        }
        if ((131072 & i11) != 0) {
            GraphicsLayerImpl graphicsLayerImpl12 = this.f14893b.f13661a;
            if (!kotlin.jvm.internal.i.a(null, null)) {
                graphicsLayerImpl12.e();
            }
        }
        if ((32768 & i11) != 0) {
            androidx.compose.ui.graphics.layer.b bVar15 = this.f14893b;
            int i13 = i0Var.f13645r;
            if (androidx.compose.ui.graphics.O.a(i13, 0)) {
                i10 = 0;
            } else if (androidx.compose.ui.graphics.O.a(i13, 1)) {
                i10 = 1;
            } else {
                i10 = 2;
                if (!androidx.compose.ui.graphics.O.a(i13, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            GraphicsLayerImpl graphicsLayerImpl13 = bVar15.f13661a;
            if (!androidx.compose.ui.graphics.layer.a.a(graphicsLayerImpl13.q(), i10)) {
                graphicsLayerImpl13.E(i10);
            }
        }
        if ((i11 & 7963) != 0) {
            this.f14908r = true;
            this.f14909s = true;
        }
        if (kotlin.jvm.internal.i.a(this.f14907q, i0Var.f13649v)) {
            z10 = false;
        } else {
            androidx.compose.ui.graphics.b0 b0Var = i0Var.f13649v;
            this.f14907q = b0Var;
            if (b0Var != null) {
                androidx.compose.ui.graphics.layer.b bVar16 = this.f14893b;
                if (b0Var instanceof androidx.compose.ui.graphics.b0.b) {
                    I.f fVar = ((androidx.compose.ui.graphics.b0.b) b0Var).f13540a;
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fVar.f3757a);
                    float f19 = fVar.f3758b;
                    bVar16.g(0.0f, (jFloatToRawIntBits2 << 32) | (((long) Float.floatToRawIntBits(f19)) & 4294967295L), (((long) Float.floatToRawIntBits(fVar.f3759c - fVar.f3757a)) << 32) | (((long) Float.floatToRawIntBits(fVar.f3760d - f19)) & 4294967295L));
                } else if (b0Var instanceof androidx.compose.ui.graphics.b0.a) {
                    bVar16.f13670k = null;
                    bVar16.f13669i = 9205357640488583168L;
                    bVar16.f13668h = 0L;
                    bVar16.j = 0.0f;
                    bVar16.f13667g = true;
                    bVar16.f13673n = false;
                    bVar16.f13671l = ((androidx.compose.ui.graphics.b0.a) b0Var).f13539a;
                    bVar16.a();
                } else if (b0Var instanceof androidx.compose.ui.graphics.b0.c) {
                    androidx.compose.ui.graphics.b0.c cVar = (androidx.compose.ui.graphics.b0.c) b0Var;
                    C1144u c1144u = cVar.f13542b;
                    if (c1144u != null) {
                        bVar16.f13670k = null;
                        bVar16.f13669i = 9205357640488583168L;
                        bVar16.f13668h = 0L;
                        bVar16.j = 0.0f;
                        bVar16.f13667g = true;
                        bVar16.f13673n = false;
                        bVar16.f13671l = c1144u;
                        bVar16.a();
                    } else {
                        I.g gVar = cVar.f13541a;
                        bVar16.g(Float.intBitsToFloat((int) (gVar.f3768h >> 32)), (((long) Float.floatToRawIntBits(gVar.f3761a)) << 32) | (((long) Float.floatToRawIntBits(gVar.f3762b)) & 4294967295L), (((long) Float.floatToRawIntBits(gVar.b())) << 32) | (((long) Float.floatToRawIntBits(gVar.a())) & 4294967295L));
                    }
                }
                if ((b0Var instanceof androidx.compose.ui.graphics.b0.a) && Build.VERSION.SDK_INT < 33 && (aVar = this.f14897f) != null) {
                    aVar.invoke();
                }
            }
        }
        this.f14905o = i0Var.f13630b;
        if ((i11 != 0 || z10) && (parent = (view = this.f14895d).getParent()) != null) {
            parent.onDescendantInvalidated(view, view);
        }
    }

    @Override // androidx.compose.ui.node.T
    public final long e(long j, boolean z10) {
        float[] fArrN;
        if (z10) {
            fArrN = m();
            if (fArrN == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrN = n();
        }
        return this.f14910t ? j : androidx.compose.ui.graphics.a0.b(j, fArrN);
    }

    @Override // androidx.compose.ui.node.T
    public final void f(long j) {
        if (p013b0.l.b(j, this.f14898g)) {
            return;
        }
        this.f14898g = j;
        if (this.f14901k || this.f14899h) {
            return;
        }
        AndroidComposeView androidComposeView = this.f14895d;
        androidComposeView.invalidate();
        if (true != this.f14901k) {
            this.f14901k = true;
            androidComposeView.E(this, true);
        }
    }

    @Override // androidx.compose.ui.node.T
    public final void g(Ia.p<? super androidx.compose.ui.graphics.E, ? super androidx.compose.ui.graphics.layer.b, p293xa.r> pVar, Ia.a<p293xa.r> aVar) {
        androidx.compose.ui.graphics.S s10 = this.f14894c;
        if (s10 == null) {
            throw C4.v.g("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f14893b.f13678s) {
            R.a.a("layer should have been released before reuse");
        }
        this.f14893b = s10.b();
        this.f14899h = false;
        this.f14896e = pVar;
        this.f14897f = aVar;
        this.f14908r = false;
        this.f14909s = false;
        this.f14910t = true;
        androidx.compose.ui.graphics.a0.d(this.f14900i);
        float[] fArr = this.j;
        if (fArr != null) {
            androidx.compose.ui.graphics.a0.d(fArr);
        }
        this.f14906p = androidx.compose.ui.graphics.q0.f13791b;
        this.f14911u = false;
        long j = BrazeLogger.SUPPRESS;
        this.f14898g = (j & 4294967295L) | (j << 32);
        this.f14907q = null;
        this.f14905o = 0;
    }

    @Override // androidx.compose.ui.node.T
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo4getUnderlyingMatrixsQKQjiQ() {
        return n();
    }

    @Override // androidx.compose.ui.node.T
    public final void h(androidx.compose.ui.graphics.E e10, androidx.compose.ui.graphics.layer.b bVar) {
        l();
        this.f14911u = this.f14893b.f13661a.H() > 0.0f;
        J.a aVar = this.f14904n;
        J.a.b bVar2 = aVar.f3941c;
        bVar2.f(e10);
        bVar2.f3949b = bVar;
        androidx.compose.ui.graphics.layer.c.a(aVar, this.f14893b);
    }

    @Override // androidx.compose.ui.node.T
    public final void i(I.c cVar, boolean z10) {
        float[] fArrM = z10 ? m() : n();
        if (this.f14910t) {
            return;
        }
        if (fArrM != null) {
            androidx.compose.ui.graphics.a0.c(fArrM, cVar);
            return;
        }
        cVar.f3750a = 0.0f;
        cVar.f3751b = 0.0f;
        cVar.f3752c = 0.0f;
        cVar.f3753d = 0.0f;
    }

    @Override // androidx.compose.ui.node.T
    public final void invalidate() {
        if (this.f14901k || this.f14899h) {
            return;
        }
        AndroidComposeView androidComposeView = this.f14895d;
        androidComposeView.invalidate();
        if (true != this.f14901k) {
            this.f14901k = true;
            androidComposeView.E(this, true);
        }
    }

    @Override // androidx.compose.ui.node.T
    public final void j(float[] fArr) {
        float[] fArrM = m();
        if (fArrM != null) {
            androidx.compose.ui.graphics.a0.e(fArr, fArrM);
        }
    }

    @Override // androidx.compose.ui.node.T
    public final void k(long j) {
        androidx.compose.ui.graphics.layer.b bVar = this.f14893b;
        if (!p013b0.j.b(bVar.f13679t, j)) {
            bVar.f13679t = j;
            bVar.f13661a.B(bVar.f13680u, (int) (j >> 32), (int) (j & 4294967295L));
        }
        View view = this.f14895d;
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(view, view);
        }
    }

    @Override // androidx.compose.ui.node.T
    public final void l() {
        if (this.f14901k) {
            if (!androidx.compose.ui.graphics.q0.a(this.f14906p, androidx.compose.ui.graphics.q0.f13791b) && !p013b0.l.b(this.f14893b.f13680u, this.f14898g)) {
                androidx.compose.ui.graphics.layer.b bVar = this.f14893b;
                float fB = androidx.compose.ui.graphics.q0.b(this.f14906p) * ((int) (this.f14898g >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(androidx.compose.ui.graphics.q0.c(this.f14906p) * ((int) (this.f14898g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!I.d.b(bVar.f13681v, jFloatToRawIntBits)) {
                    bVar.f13681v = jFloatToRawIntBits;
                    bVar.f13661a.t(jFloatToRawIntBits);
                }
            }
            androidx.compose.ui.graphics.layer.b bVar2 = this.f14893b;
            p013b0.c cVar = this.f14902l;
            LayoutDirection layoutDirection = this.f14903m;
            long j = this.f14898g;
            p293xa.e eVar = this.f14912v;
            boolean zB = p013b0.l.b(bVar2.f13680u, j);
            GraphicsLayerImpl graphicsLayerImpl = bVar2.f13661a;
            if (!zB) {
                bVar2.f13680u = j;
                long j10 = bVar2.f13679t;
                graphicsLayerImpl.B(j, (int) (j10 >> 32), (int) (4294967295L & j10));
                if (bVar2.f13669i == 9205357640488583168L) {
                    bVar2.f13667g = true;
                    bVar2.a();
                }
            }
            bVar2.f13662b = cVar;
            bVar2.f13663c = layoutDirection;
            bVar2.f13664d = (Lambda) eVar;
            graphicsLayerImpl.G(cVar, layoutDirection, bVar2, bVar2.f13665e);
            if (this.f14901k) {
                this.f14901k = false;
                this.f14895d.E(this, false);
            }
        }
    }

    public final float[] m() {
        float[] fArrA = this.j;
        if (fArrA == null) {
            fArrA = androidx.compose.ui.graphics.a0.a();
            this.j = fArrA;
        }
        if (!this.f14909s) {
            if (Float.isNaN(fArrA[0])) {
                return null;
            }
            return fArrA;
        }
        this.f14909s = false;
        float[] fArrN = n();
        if (this.f14910t) {
            return fArrN;
        }
        if (A8.A.f(fArrN, fArrA)) {
            return fArrA;
        }
        fArrA[0] = Float.NaN;
        return null;
    }

    public final float[] n() {
        boolean z10 = this.f14908r;
        float[] fArr = this.f14900i;
        if (z10) {
            androidx.compose.ui.graphics.layer.b bVar = this.f14893b;
            long jG = bVar.f13681v;
            if ((9223372034707292159L & jG) == 9205357640488583168L) {
                jG = Cb.a.g(A8.A.k(this.f14898g));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jG >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jG & 4294967295L));
            GraphicsLayerImpl graphicsLayerImpl = bVar.f13661a;
            float fC = graphicsLayerImpl.C();
            float fV = graphicsLayerImpl.v();
            float fD = graphicsLayerImpl.D();
            float fR = graphicsLayerImpl.r();
            float fS = graphicsLayerImpl.s();
            float fO = graphicsLayerImpl.o();
            float fI = graphicsLayerImpl.I();
            double d10 = ((double) fD) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d10);
            float fCos = (float) Math.cos(d10);
            float f10 = -fSin;
            float f11 = (fV * fCos) - (1.0f * fSin);
            float f12 = (1.0f * fCos) + (fV * fSin);
            double d11 = ((double) fR) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d11);
            float fCos2 = (float) Math.cos(d11);
            float f13 = -fSin2;
            float f14 = fSin * fSin2;
            float f15 = fSin * fCos2;
            float f16 = fCos * fSin2;
            float f17 = fCos * fCos2;
            float f18 = (f12 * fSin2) + (fC * fCos2);
            float f19 = (f12 * fCos2) + ((-fC) * fSin2);
            double d12 = ((double) fS) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d12);
            float fCos3 = (float) Math.cos(d12);
            float f20 = -fSin3;
            float f21 = (fCos3 * f14) + (f20 * fCos2);
            float f22 = (f14 * fSin3) + (fCos2 * fCos3);
            float f23 = fSin3 * fCos;
            float f24 = fCos3 * f15;
            float f25 = fSin3 * f15;
            float f26 = f22 * fO;
            float f27 = f23 * fO;
            float f28 = (f25 + (fCos3 * f13)) * fO;
            float f29 = f21 * fI;
            float f30 = fCos * fCos3 * fI;
            float f31 = (f24 + (f20 * f13)) * fI;
            float f32 = f16 * 1.0f;
            float f33 = f10 * 1.0f;
            float f34 = f17 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f26;
                fArr[1] = f27;
                fArr[2] = f28;
                fArr[3] = 0.0f;
                fArr[4] = f29;
                fArr[5] = f30;
                fArr[6] = f31;
                fArr[7] = 0.0f;
                fArr[8] = f32;
                fArr[9] = f33;
                fArr[10] = f34;
                fArr[11] = 0.0f;
                float f35 = -fIntBitsToFloat;
                fArr[12] = ((f26 * f35) - (f29 * fIntBitsToFloat2)) + f18 + fIntBitsToFloat;
                fArr[13] = ((f27 * f35) - (f30 * fIntBitsToFloat2)) + f11 + fIntBitsToFloat2;
                fArr[14] = ((f35 * f28) - (fIntBitsToFloat2 * f31)) + f19;
                fArr[15] = 1.0f;
            }
            this.f14908r = false;
            this.f14910t = F8.a.h(fArr);
        }
        return fArr;
    }
}
