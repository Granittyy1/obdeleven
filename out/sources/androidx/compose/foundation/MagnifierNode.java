package androidx.compose.foundation;

import android.view.View;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.Z;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.C1186g;
import androidx.compose.ui.node.C1202x;
import androidx.compose.ui.node.InterfaceC1191l;
import androidx.compose.ui.node.InterfaceC1193n;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.O;
import androidx.compose.ui.node.P;
import androidx.compose.ui.node.b0;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: compiled from: Magnifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MagnifierNode extends androidx.compose.ui.h.c implements InterfaceC1193n, InterfaceC1191l, b0, O {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p013b0.c f9791A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public G f9792B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1085f0 f9793C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public DerivedSnapshotState f9794D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f9795E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p013b0.l f9796F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public BufferedChannel f9797G;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Ia.l<? super p013b0.c, I.d> f9798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Ia.l<? super p013b0.c, I.d> f9799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Ia.l<? super p013b0.h, p293xa.r> f9800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f9801s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9802t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f9803u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f9804v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f9805w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9806x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public H f9807y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f9808z;

    public MagnifierNode() {
        throw null;
    }

    public MagnifierNode(Ia.l lVar, Ia.l lVar2, Ia.l lVar3, float f10, boolean z10, long j, float f11, float f12, boolean z11, H h8) {
        this.f9798p = lVar;
        this.f9799q = lVar2;
        this.f9800r = lVar3;
        this.f9801s = f10;
        this.f9802t = z10;
        this.f9803u = j;
        this.f9804v = f11;
        this.f9805w = f12;
        this.f9806x = z11;
        this.f9807y = h8;
        this.f9793C = new C1085f0(null, Z.f12934a);
        this.f9795E = 9205357640488583168L;
    }

    @Override // androidx.compose.ui.h.c
    public final void I1() {
        a1();
        this.f9797G = kotlinx.coroutines.channels.g.a(0, 7, null);
        C2680e.c(E1(), null, CoroutineStart.f43169e, new MagnifierNode$onAttach$1(this, null), 1);
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        G g10 = this.f9792B;
        if (g10 != null) {
            g10.dismiss();
        }
        this.f9792B = null;
    }

    public final long Q1() {
        if (this.f9794D == null) {
            this.f9794D = J0.d(new Ia.a<I.d>() { // from class: androidx.compose.foundation.MagnifierNode$anchorPositionInRoot$1
                {
                    super(0);
                }

                @Override // Ia.a
                public final I.d invoke() {
                    InterfaceC1170p interfaceC1170p = (InterfaceC1170p) this.this$0.f9793C.getValue();
                    return new I.d(interfaceC1170p != null ? interfaceC1170p.g0(0L) : 9205357640488583168L);
                }
            });
        }
        DerivedSnapshotState derivedSnapshotState = this.f9794D;
        if (derivedSnapshotState != null) {
            return ((I.d) derivedSnapshotState.getValue()).f3754a;
        }
        return 9205357640488583168L;
    }

    public final void R1() {
        G g10 = this.f9792B;
        if (g10 != null) {
            g10.dismiss();
        }
        View viewA = this.f9808z;
        if (viewA == null) {
            viewA = C1186g.a(this);
        }
        View view = viewA;
        this.f9808z = view;
        p013b0.c cVar = this.f9791A;
        if (cVar == null) {
            cVar = C1185f.f(this).f14423z;
        }
        p013b0.c cVar2 = cVar;
        this.f9791A = cVar2;
        this.f9792B = this.f9807y.b(view, this.f9802t, this.f9803u, this.f9804v, this.f9805w, this.f9806x, cVar2, this.f9801s);
        T1();
    }

    public final void S1() {
        p013b0.c cVar = this.f9791A;
        if (cVar == null) {
            cVar = C1185f.f(this).f14423z;
            this.f9791A = cVar;
        }
        long j = this.f9798p.invoke(cVar).f3754a;
        long jG = 9205357640488583168L;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (Q1() & 9223372034707292159L) == 9205357640488583168L) {
            this.f9795E = 9205357640488583168L;
            G g10 = this.f9792B;
            if (g10 != null) {
                g10.dismiss();
                return;
            }
            return;
        }
        this.f9795E = I.d.g(Q1(), j);
        Ia.l<? super p013b0.c, I.d> lVar = this.f9799q;
        if (lVar != null) {
            long j10 = lVar.invoke(cVar).f3754a;
            I.d dVar = new I.d(j10);
            if ((j10 & 9223372034707292159L) == 9205357640488583168L) {
                dVar = null;
            }
            if (dVar != null) {
                jG = I.d.g(Q1(), dVar.f3754a);
            }
        }
        long j11 = jG;
        if (this.f9792B == null) {
            R1();
        }
        G g11 = this.f9792B;
        if (g11 != null) {
            g11.c(this.f9801s, this.f9795E, j11);
        }
        T1();
    }

    public final void T1() {
        p013b0.c cVar;
        G g10 = this.f9792B;
        if (g10 == null || (cVar = this.f9791A) == null) {
            return;
        }
        if (p013b0.l.a(this.f9796F, g10.a())) {
            return;
        }
        Ia.l<? super p013b0.h, p293xa.r> lVar = this.f9800r;
        if (lVar != null) {
            lVar.invoke(new p013b0.h(cVar.p(A8.A.k(g10.a()))));
        }
        this.f9796F = new p013b0.l(g10.a());
    }

    @Override // androidx.compose.ui.node.O
    public final void a1() {
        P.a(this, new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.MagnifierNode$onObservedReadsChanged$1
            {
                super(0);
            }

            @Override // Ia.a
            public final p293xa.r invoke() {
                this.this$0.S1();
                return p293xa.r.f47939a;
            }
        });
    }

    @Override // androidx.compose.ui.node.b0
    public final void p1(androidx.compose.ui.semantics.w wVar) {
        wVar.e(A.f9677a, new Ia.a<I.d>() { // from class: androidx.compose.foundation.MagnifierNode$applySemantics$1
            {
                super(0);
            }

            @Override // Ia.a
            public final I.d invoke() {
                return new I.d(this.this$0.f9795E);
            }
        });
    }

    @Override // androidx.compose.ui.node.InterfaceC1193n
    public final void w1(NodeCoordinator nodeCoordinator) {
        this.f9793C.setValue(nodeCoordinator);
    }

    @Override // androidx.compose.ui.node.InterfaceC1191l
    public final void x(C1202x c1202x) {
        c1202x.A1();
        BufferedChannel bufferedChannel = this.f9797G;
        if (bufferedChannel != null) {
            bufferedChannel.n(p293xa.r.f47939a);
        }
    }
}
