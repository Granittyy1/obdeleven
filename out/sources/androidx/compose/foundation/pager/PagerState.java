package androidx.compose.foundation.pager;

import androidx.compose.animation.core.InterfaceC0906f;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.u;
import androidx.compose.foundation.lazy.layout.C0968c;
import androidx.compose.foundation.lazy.layout.C0973h;
import androidx.compose.foundation.lazy.layout.G;
import androidx.compose.foundation.lazy.layout.H;
import androidx.compose.foundation.lazy.layout.Q;
import androidx.compose.foundation.lazy.layout.S;
import androidx.compose.foundation.lazy.layout.V;
import androidx.compose.runtime.C1079c0;
import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.Q0;
import androidx.compose.runtime.X;
import androidx.compose.ui.layout.Z;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.LayoutNode;
import java.util.Collection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class PagerState implements u {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final G f10922A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final X<p293xa.r> f10923B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final X<p293xa.r> f10924C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C1085f0 f10925D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C1085f0 f10926E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C1085f0 f10927F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C1085f0 f10928G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f10930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1085f0 f10931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f10932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f10936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f10937i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final DefaultScrollableState f10938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public H.b f10941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10942o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1085f0 f10943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p013b0.c f10944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.l f10945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1081d0 f10946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1081d0 f10947t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final H f10948u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0973h f10949v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0968c f10950w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1085f0 f10951x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a f10952y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f10953z;

    /* JADX INFO: compiled from: PagerState.kt */
    public static final class a implements a0 {
        public a() {
        }

        @Override // androidx.compose.ui.layout.a0
        public final void s(LayoutNode layoutNode) {
            PagerState.this.f10951x.setValue(layoutNode);
        }
    }

    public PagerState(int i10, float f10, V v10) {
        double d10 = f10;
        if (-0.5d > d10 || d10 > 0.5d) {
            p245u.c.a("currentPageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5");
        }
        this.f10931c = J0.f(new I.d(0L));
        this.f10932d = new p(i10, f10, this);
        this.f10933e = i10;
        this.f10935g = Long.MAX_VALUE;
        this.f10938k = new DefaultScrollableState(new Ia.l<Float, Float>() { // from class: androidx.compose.foundation.pager.PagerState$scrollableState$1
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.l
            public final Float invoke(Float f11) {
                m mVar;
                float fFloatValue = f11.floatValue();
                PagerState pagerState = this.this$0;
                pagerState.getClass();
                long jE = H3.c.e(pagerState);
                float f12 = pagerState.f10937i + fFloatValue;
                long jC = Ka.a.c(f12);
                pagerState.f10937i = f12 - jC;
                if (Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j = jC + jE;
                    long jE2 = Na.l.E(j, pagerState.f10936h, pagerState.f10935g);
                    boolean z10 = j != jE2;
                    long j10 = jE2 - jE;
                    float f13 = j10;
                    pagerState.j = f13;
                    if (Math.abs(j10) != 0) {
                        pagerState.f10927F.setValue(Boolean.valueOf(f13 > 0.0f));
                        pagerState.f10928G.setValue(Boolean.valueOf(f13 < 0.0f));
                    }
                    int i11 = (int) j10;
                    int i12 = -i11;
                    m mVarI = ((m) pagerState.f10943p.getValue()).i(i12);
                    if (mVarI != null && (mVar = pagerState.f10930b) != null) {
                        m mVarI2 = mVar.i(i12);
                        if (mVarI2 != null) {
                            pagerState.f10930b = mVarI2;
                        } else {
                            mVarI = null;
                        }
                    }
                    if (mVarI != null) {
                        pagerState.h(mVarI, pagerState.f10929a, true);
                        S.b(pagerState.f10923B);
                    } else {
                        p pVar = pagerState.f10932d;
                        PagerState pagerState2 = pVar.f11004a;
                        float fO = pagerState2.o() != 0 ? i11 / pagerState2.o() : 0.0f;
                        C1079c0 c1079c0 = pVar.f11006c;
                        c1079c0.f(c1079c0.j() + fO);
                        Z z11 = (Z) pagerState.f10951x.getValue();
                        if (z11 != null) {
                            z11.j();
                        }
                    }
                    fFloatValue = (z10 ? Long.valueOf(j10) : Float.valueOf(fFloatValue)).floatValue();
                }
                return Float.valueOf(fFloatValue);
            }
        });
        this.f10939l = true;
        this.f10940m = -1;
        this.f10943p = new C1085f0(s.f11013b, androidx.compose.runtime.Z.f12934a);
        this.f10944q = s.f11014c;
        this.f10945r = new androidx.compose.foundation.interaction.l();
        this.f10946s = new C1081d0(-1);
        this.f10947t = new C1081d0(i10);
        Q0 q10 = Q0.f12888a;
        J0.e(new Ia.a<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$settledPage$2
            {
                super(0);
            }

            @Override // Ia.a
            public final Integer invoke() {
                return Integer.valueOf(this.this$0.f10938k.a() ? this.this$0.f10947t.o() : this.this$0.j());
            }
        }, q10);
        J0.e(new Ia.a<Integer>() { // from class: androidx.compose.foundation.pager.PagerState$targetPage$2
            {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ia.a
            public final Integer invoke() {
                int iJ;
                if (!this.this$0.f10938k.a()) {
                    iJ = this.this$0.j();
                } else if (this.this$0.f10946s.o() != -1) {
                    iJ = this.this$0.f10946s.o();
                } else {
                    float fAbs = Math.abs(this.this$0.k());
                    PagerState pagerState = this.this$0;
                    if (fAbs >= Math.abs(Math.min(pagerState.f10944q.T0(s.f11012a), pagerState.n() / 2.0f) / pagerState.n())) {
                        iJ = ((Boolean) this.this$0.f10927F.getValue()).booleanValue() ? this.this$0.f10933e + 1 : this.this$0.f10933e;
                    } else {
                        iJ = this.this$0.j();
                    }
                }
                return Integer.valueOf(this.this$0.i(iJ));
            }
        }, q10);
        this.f10948u = new H(v10, new Ia.l<Q, p293xa.r>() { // from class: androidx.compose.foundation.pager.PagerState$prefetchState$1
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(Q q11) {
                Q q12 = q11;
                PagerState pagerState = this.this$0;
                androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
                Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
                androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
                try {
                    q12.a(pagerState.f10933e);
                    p293xa.r rVar = p293xa.r.f47939a;
                    return p293xa.r.f47939a;
                } finally {
                    androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
                }
            }
        });
        this.f10949v = new C0973h();
        this.f10950w = new C0968c();
        this.f10951x = J0.f(null);
        this.f10952y = new a();
        this.f10953z = p013b0.b.b(0, 0, 15);
        this.f10922A = new G();
        this.f10923B = S.a();
        this.f10924C = S.a();
        Boolean bool = Boolean.FALSE;
        this.f10925D = J0.f(bool);
        this.f10926E = J0.f(bool);
        this.f10927F = J0.f(bool);
        this.f10928G = J0.f(bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object s(PagerState pagerState, MutatePriority mutatePriority, Ia.p<? super androidx.compose.foundation.gestures.s, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        PagerState$scroll$1 pagerState$scroll$1;
        if (cVar instanceof PagerState$scroll$1) {
            pagerState$scroll$1 = (PagerState$scroll$1) cVar;
            int i10 = pagerState$scroll$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pagerState$scroll$1.label = i10 - Integer.MIN_VALUE;
            } else {
                pagerState$scroll$1 = new PagerState$scroll$1(pagerState, cVar);
            }
        } else {
            pagerState$scroll$1 = new PagerState$scroll$1(pagerState, cVar);
        }
        Object obj = pagerState$scroll$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = pagerState$scroll$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                pVar = (Ia.p) pagerState$scroll$1.L$2;
                mutatePriority = (MutatePriority) pagerState$scroll$1.L$1;
                pagerState = (PagerState) pagerState$scroll$1.L$0;
                kotlin.b.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pagerState = (PagerState) pagerState$scroll$1.L$0;
                kotlin.b.b(obj);
            }
            pagerState.f10946s.m(-1);
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        pagerState$scroll$1.L$0 = pagerState;
        pagerState$scroll$1.L$1 = mutatePriority;
        pagerState$scroll$1.L$2 = pVar;
        pagerState$scroll$1.label = 1;
        Object objA = pagerState.f10950w.a(pagerState$scroll$1);
        if (objA != coroutineSingletons) {
            objA = p293xa.r.f47939a;
        }
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (!pagerState.f10938k.a()) {
            pagerState.f10947t.m(pagerState.j());
        }
        pagerState$scroll$1.L$0 = pagerState;
        pagerState$scroll$1.L$1 = null;
        pagerState$scroll$1.L$2 = null;
        pagerState$scroll$1.label = 2;
        if (pagerState.f10938k.b(mutatePriority, pVar, pagerState$scroll$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        pagerState.f10946s.m(-1);
        return p293xa.r.f47939a;
    }

    public static Object t(PagerState pagerState, int i10, kotlin.coroutines.c cVar) {
        pagerState.getClass();
        Object objB = pagerState.b(MutatePriority.f9810b, new PagerState$scrollToPage$2(pagerState, 0.0f, i10, null), cVar);
        return objB == CoroutineSingletons.f43038b ? objB : p293xa.r.f47939a;
    }

    @Override // androidx.compose.foundation.gestures.u
    public final boolean a() {
        return this.f10938k.a();
    }

    @Override // androidx.compose.foundation.gestures.u
    public final Object b(MutatePriority mutatePriority, Ia.p<? super androidx.compose.foundation.gestures.s, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return s(this, mutatePriority, pVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.u
    public final boolean c() {
        return ((Boolean) this.f10926E.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.u
    public final boolean d() {
        return ((Boolean) this.f10925D.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.u
    public final float e(float f10) {
        return this.f10938k.e(f10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(int i10, float f10, InterfaceC0906f interfaceC0906f, ContinuationImpl continuationImpl) {
        PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$1;
        PagerState pagerState;
        if (continuationImpl instanceof PagerState$animateScrollToPage$1) {
            pagerState$animateScrollToPage$1 = (PagerState$animateScrollToPage$1) continuationImpl;
            int i11 = pagerState$animateScrollToPage$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pagerState$animateScrollToPage$1.label = i11 - Integer.MIN_VALUE;
            } else {
                pagerState$animateScrollToPage$1 = new PagerState$animateScrollToPage$1(this, continuationImpl);
            }
        } else {
            pagerState$animateScrollToPage$1 = new PagerState$animateScrollToPage$1(this, continuationImpl);
        }
        Object obj = pagerState$animateScrollToPage$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = pagerState$animateScrollToPage$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                f10 = pagerState$animateScrollToPage$1.F$0;
                i10 = pagerState$animateScrollToPage$1.I$0;
                interfaceC0906f = (InterfaceC0906f) pagerState$animateScrollToPage$1.L$1;
                pagerState = (PagerState) pagerState$animateScrollToPage$1.L$0;
                kotlin.b.b(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
        kotlin.b.b(obj);
        if ((i10 == j() && k() == f10) || m() == 0) {
            return p293xa.r.f47939a;
        }
        pagerState$animateScrollToPage$1.L$0 = this;
        pagerState$animateScrollToPage$1.L$1 = interfaceC0906f;
        pagerState$animateScrollToPage$1.I$0 = i10;
        pagerState$animateScrollToPage$1.F$0 = f10;
        pagerState$animateScrollToPage$1.label = 1;
        Object objA = this.f10950w.a(pagerState$animateScrollToPage$1);
        if (objA != coroutineSingletons) {
            objA = p293xa.r.f47939a;
        }
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        pagerState = this;
        InterfaceC0906f interfaceC0906f2 = interfaceC0906f;
        double d10 = f10;
        if (-0.5d > d10 || d10 > 0.5d) {
            p245u.c.a("pageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5");
        }
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(pagerState, pagerState.i(i10), f10 * pagerState.o(), interfaceC0906f2, null);
        pagerState$animateScrollToPage$1.L$0 = null;
        pagerState$animateScrollToPage$1.L$1 = null;
        pagerState$animateScrollToPage$1.label = 2;
        if (pagerState.b(MutatePriority.f9810b, pagerState$animateScrollToPage$3, pagerState$animateScrollToPage$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return p293xa.r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x012c A[Catch: all -> 0x0138, TryCatch #0 {all -> 0x0138, blocks: (B:55:0x00d7, B:57:0x00ea, B:59:0x00ee, B:61:0x00fc, B:69:0x0132, B:67:0x012c, B:64:0x0114, B:72:0x013a), top: B:82:0x00d7 }] */
    public final void h(m mVar, boolean z10, boolean z11) {
        if (!z10 && this.f10929a) {
            this.f10930b = mVar;
            return;
        }
        boolean z12 = true;
        if (z10) {
            this.f10929a = true;
        }
        float f10 = mVar.f10994l;
        p pVar = this.f10932d;
        if (z11) {
            pVar.f11006c.f(f10);
        } else {
            pVar.getClass();
            c cVar = mVar.f10993k;
            pVar.f11008e = cVar != null ? cVar.f10962e : null;
            if (pVar.f11007d || !((Collection) mVar.f10984a).isEmpty()) {
                pVar.f11007d = true;
                int i10 = cVar != null ? cVar.f10958a : 0;
                pVar.f11005b.m(i10);
                pVar.f11009f.e(i10);
                pVar.f11006c.f(f10);
            }
            if (this.f10940m != -1 && !mVar.e().isEmpty()) {
                boolean z13 = this.f10942o;
                int i11 = mVar.f10992i;
                if (this.f10940m != (z13 ? i11 + ((d) kotlin.collections.q.V(mVar.e())).getIndex() + 1 : (((d) kotlin.collections.q.O(mVar.e())).getIndex() - i11) - 1)) {
                    this.f10940m = -1;
                    H.b bVar = this.f10941n;
                    if (bVar != null) {
                        bVar.cancel();
                    }
                    this.f10941n = null;
                }
            }
        }
        this.f10943p.setValue(mVar);
        this.f10925D.setValue(Boolean.valueOf(mVar.f10996n));
        c cVar2 = mVar.j;
        int i12 = cVar2 != null ? cVar2.f10958a : 0;
        int i13 = mVar.f10995m;
        if (i12 == 0 && i13 == 0) {
            z12 = false;
        }
        this.f10926E.setValue(Boolean.valueOf(z12));
        if (cVar2 != null) {
            this.f10933e = cVar2.f10958a;
        }
        this.f10934f = i13;
        androidx.compose.runtime.snapshots.g gVarA = androidx.compose.runtime.snapshots.g.a.a();
        Ia.l<Object, p293xa.r> lVarE = gVarA != null ? gVarA.e() : null;
        androidx.compose.runtime.snapshots.g gVarB = androidx.compose.runtime.snapshots.g.a.b(gVarA);
        try {
            if (Math.abs(this.j) > 0.5f && this.f10939l) {
                float f11 = this.j;
                if (l().getOrientation() == Orientation.f9957b) {
                    if (Math.signum(f11) != Math.signum(-Float.intBitsToFloat((int) (p() & 4294967295L)))) {
                        if (q()) {
                        }
                    }
                } else if (Math.signum(f11) != Math.signum(-Float.intBitsToFloat((int) (p() >> 32)))) {
                    if (q()) {
                    }
                }
                r(this.j, mVar);
            }
            p293xa.r rVar = p293xa.r.f47939a;
            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
            this.f10935g = s.a(mVar, m());
            m();
            int iA = (int) (mVar.f10988e == Orientation.f9958c ? mVar.a() >> 32 : mVar.a() & 4294967295L);
            this.f10936h = Na.l.D(mVar.f10997o.f(iA, mVar.f10985b, -mVar.f10989f, mVar.f10987d), 0, iA);
        } catch (Throwable th) {
            androidx.compose.runtime.snapshots.g.a.d(gVarA, gVarB, lVarE);
            throw th;
        }
    }

    public final int i(int i10) {
        if (m() > 0) {
            return Na.l.D(i10, 0, m() - 1);
        }
        return 0;
    }

    public final int j() {
        return this.f10932d.f11005b.o();
    }

    public final float k() {
        return this.f10932d.f11006c.j();
    }

    public final i l() {
        return (i) this.f10943p.getValue();
    }

    public abstract int m();

    /* JADX WARN: Multi-variable type inference failed */
    public final int n() {
        return ((m) this.f10943p.getValue()).f10985b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int o() {
        return ((m) this.f10943p.getValue()).f10986c + n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long p() {
        return ((I.d) this.f10931c.getValue()).f3754a;
    }

    public final boolean q() {
        return ((int) Float.intBitsToFloat((int) (p() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (p() & 4294967295L))) == 0;
    }

    public final void r(float f10, m mVar) {
        H.b bVar;
        H.b bVar2;
        H.b bVar3;
        if (this.f10939l && !mVar.e().isEmpty()) {
            boolean z10 = f10 > 0.0f;
            int i10 = mVar.f10992i;
            int index = z10 ? i10 + ((d) kotlin.collections.q.V(mVar.e())).getIndex() + 1 : (((d) kotlin.collections.q.O(mVar.e())).getIndex() - i10) - 1;
            if (index < 0 || index >= m()) {
                return;
            }
            if (index != this.f10940m) {
                if (this.f10942o != z10 && (bVar3 = this.f10941n) != null) {
                    bVar3.cancel();
                }
                this.f10942o = z10;
                this.f10940m = index;
                this.f10941n = this.f10948u.a(index, this.f10953z);
            }
            if (z10) {
                if ((((d) kotlin.collections.q.V(mVar.e())).getOffset() + (mVar.f10986c + mVar.f10985b)) - mVar.f10990g >= f10 || (bVar2 = this.f10941n) == null) {
                    return;
                }
                bVar2.b();
                return;
            }
            if (mVar.f10989f - ((d) kotlin.collections.q.O(mVar.e())).getOffset() >= (-f10) || (bVar = this.f10941n) == null) {
                return;
            }
            bVar.b();
        }
    }

    public final void u(float f10, int i10, boolean z10) {
        p pVar = this.f10932d;
        pVar.f11005b.m(i10);
        pVar.f11009f.e(i10);
        pVar.f11006c.f(f10);
        pVar.f11008e = null;
        if (!z10) {
            S.b(this.f10924C);
            return;
        }
        Z z11 = (Z) this.f10951x.getValue();
        if (z11 != null) {
            z11.j();
        }
    }

    public PagerState() {
        this(0, 0.0f, null);
    }
}
