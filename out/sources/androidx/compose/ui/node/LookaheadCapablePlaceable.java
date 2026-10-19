package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Map;

/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class LookaheadCapablePlaceable extends androidx.compose.ui.layout.Y implements F, I {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Ia.l<X, p293xa.r> f14437m = new Ia.l<X, p293xa.r>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        @Override // Ia.l
        public final p293xa.r invoke(X x10) {
            X x11 = x10;
            if (x11.a0()) {
                x11.f14574c.x0(x11);
            }
            return p293xa.r.f47939a;
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14440i;
    public final androidx.compose.ui.layout.B j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.collection.G<androidx.compose.ui.layout.b0> f14441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.collection.G<androidx.compose.ui.layout.b0> f14442l;

    public LookaheadCapablePlaceable() {
        Ia.l<androidx.compose.ui.graphics.U, p293xa.r> lVar = PlaceableKt.f14205a;
        this.j = new androidx.compose.ui.layout.B(this);
    }

    public static void N0(NodeCoordinator nodeCoordinator) {
        C1201w c1201w;
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f14528q;
        LayoutNode layoutNode = nodeCoordinator2 != null ? nodeCoordinator2.f14525n : null;
        LayoutNode layoutNode2 = nodeCoordinator.f14525n;
        if (!kotlin.jvm.internal.i.a(layoutNode, layoutNode2)) {
            layoutNode2.f14390H.f14641p.f14502z.g();
            return;
        }
        InterfaceC1180a interfaceC1180aE = layoutNode2.f14390H.f14641p.E();
        if (interfaceC1180aE == null || (c1201w = ((MeasurePassDelegate) interfaceC1180aE).f14502z) == null) {
            return;
        }
        c1201w.g();
    }

    public abstract InterfaceC1170p C0();

    public abstract boolean E0();

    public abstract androidx.compose.ui.layout.F F0();

    public abstract LookaheadCapablePlaceable G0();

    public abstract long H0();

    @Override // androidx.compose.ui.layout.H
    public final androidx.compose.ui.layout.F L0(int i10, int i11, Map map, Ia.l lVar) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            R.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new B(i10, i11, map, lVar, this);
    }

    public boolean S0() {
        return false;
    }

    @Override // androidx.compose.ui.layout.I
    public final int V(AbstractC1155a abstractC1155a) {
        int iV0;
        if (E0() && (iV0 = v0(abstractC1155a)) != Integer.MIN_VALUE) {
            return iV0 + ((int) (this.f14224f & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract void V0();

    @Override // androidx.compose.ui.node.I
    public final void Y(boolean z10) {
        LookaheadCapablePlaceable lookaheadCapablePlaceableG0 = G0();
        LayoutNode layoutNodeN1 = lookaheadCapablePlaceableG0 != null ? lookaheadCapablePlaceableG0.n1() : null;
        if (kotlin.jvm.internal.i.a(layoutNodeN1, n1())) {
            this.f14438g = z10;
            return;
        }
        if ((layoutNodeN1 != null ? layoutNodeN1.f14390H.f14630d : null) != LayoutNode.LayoutState.f14427d) {
            if ((layoutNodeN1 != null ? layoutNodeN1.f14390H.f14630d : null) != LayoutNode.LayoutState.f14428e) {
                return;
            }
        }
        this.f14438g = z10;
    }

    public abstract LayoutNode n1();

    public abstract int v0(AbstractC1155a abstractC1155a);

    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c A[LOOP:0: B:17:0x003c->B:29:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0084 A[EDGE_INSN: B:67:0x0084->B:30:0x0084 BREAK  A[LOOP:0: B:17:0x003c->B:29:0x007c], SYNTHETIC] */
    public final void x0(final X x10) {
        LookaheadCapablePlaceable lookaheadCapablePlaceableG0;
        OwnerSnapshotObserver snapshotObserver;
        if (this.f14440i || x10.f14573b.q() == null) {
            return;
        }
        androidx.collection.G<androidx.compose.ui.layout.b0> g10 = this.f14442l;
        if (g10 == null) {
            g10 = new androidx.collection.G<>((Object) null);
            this.f14442l = g10;
        }
        androidx.collection.G<androidx.compose.ui.layout.b0> g11 = this.f14441k;
        if (g11 == null) {
            g11 = new androidx.collection.G<>((Object) null);
            this.f14441k = g11;
        }
        Object[] objArr = g11.f9090b;
        float[] fArr = g11.f9091c;
        long[] jArr = g11.f9089a;
        int length = jArr.length - 2;
        long j = -9187201950435737472L;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                int i11 = i10;
                if ((((~j10) << 7) & j10 & j) != j) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j10 & 255) < 128) {
                            int i14 = (i11 << 3) + i13;
                            g10.e(fArr[i14], objArr[i14]);
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i11 != length) {
                        break;
                    }
                    i10 = i11 + 1;
                    j = -9187201950435737472L;
                } else if (i11 != length) {
                    break;
                    break;
                } else {
                    i10 = i11 + 1;
                    j = -9187201950435737472L;
                }
            }
        }
        g11.b();
        AndroidComposeView androidComposeView = n1().f14412o;
        if (androidComposeView != null && (snapshotObserver = androidComposeView.getSnapshotObserver()) != null) {
            snapshotObserver.b(x10, f14437m, new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    Ia.l<Object, p293xa.r> lVarQ = x10.f14573b.q();
                    if (lVarQ != null) {
                        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
                        lookaheadCapablePlaceable.getClass();
                        lVarQ.invoke(new C(lookaheadCapablePlaceable));
                    }
                    return p293xa.r.f47939a;
                }
            });
        }
        Object[] objArr2 = g11.f9090b;
        long[] jArr2 = g11.f9089a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i15 = 0;
            while (true) {
                long j11 = jArr2[i15];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j11 & 255) < 128) {
                            androidx.compose.ui.layout.b0 b0Var = (androidx.compose.ui.layout.b0) objArr2[(i15 << 3) + i17];
                            if (g10.a(b0Var) < 0 && (lookaheadCapablePlaceableG0 = G0()) != null) {
                                LookaheadCapablePlaceable lookaheadCapablePlaceableG1 = lookaheadCapablePlaceableG0;
                                do {
                                    androidx.collection.G<androidx.compose.ui.layout.b0> g12 = lookaheadCapablePlaceableG1.f14441k;
                                    if (g12 != null && g12.a(b0Var) >= 0) {
                                        break;
                                    } else {
                                        lookaheadCapablePlaceableG1 = lookaheadCapablePlaceableG1.G0();
                                    }
                                } while (lookaheadCapablePlaceableG1 != null);
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                }
                if (i15 == length2) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        g10.b();
    }

    public abstract LookaheadCapablePlaceable y0();
}
