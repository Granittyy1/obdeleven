package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC1155a;
import androidx.compose.ui.layout.InterfaceC1170p;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class D extends LookaheadCapablePlaceable implements androidx.compose.ui.layout.D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final NodeCoordinator f14344n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinkedHashMap f14346p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.compose.ui.layout.F f14348r;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f14345o = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final androidx.compose.ui.layout.C f14347q = new androidx.compose.ui.layout.C(this);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final androidx.collection.H<AbstractC1155a> f14349s = androidx.collection.P.a();

    public D(NodeCoordinator nodeCoordinator) {
        this.f14344n = nodeCoordinator;
    }

    public static final void X0(D d10, androidx.compose.ui.layout.F f10) {
        p293xa.r rVar;
        LinkedHashMap linkedHashMap;
        if (f10 != null) {
            d10.t0((((long) f10.getHeight()) & 4294967295L) | (((long) f10.getWidth()) << 32));
            rVar = p293xa.r.f47939a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            d10.t0(0L);
        }
        if (!kotlin.jvm.internal.i.a(d10.f14348r, f10) && f10 != null && ((((linkedHashMap = d10.f14346p) != null && !linkedHashMap.isEmpty()) || !f10.o().isEmpty()) && !kotlin.jvm.internal.i.a(f10.o(), d10.f14346p))) {
            LookaheadPassDelegate lookaheadPassDelegate = d10.f14344n.f14525n.f14390H.f14642q;
            kotlin.jvm.internal.i.b(lookaheadPassDelegate);
            lookaheadPassDelegate.f14456t.g();
            LinkedHashMap linkedHashMap2 = d10.f14346p;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                d10.f14346p = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(f10.o());
        }
        d10.f14348r = f10;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final InterfaceC1170p C0() {
        return this.f14347q;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final boolean E0() {
        return this.f14348r != null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final androidx.compose.ui.layout.F F0() {
        androidx.compose.ui.layout.F f10 = this.f14348r;
        if (f10 != null) {
            return f10;
        }
        throw C4.v.g("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable G0() {
        NodeCoordinator nodeCoordinator = this.f14344n.f14529r;
        if (nodeCoordinator != null) {
            return nodeCoordinator.r1();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final long H0() {
        return this.f14345o;
    }

    @Override // p013b0.c
    public final float P0() {
        return this.f14344n.P0();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.InterfaceC1167m
    public final boolean S0() {
        return true;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final void V0() {
        q0(this.f14345o, 0.0f, null);
    }

    public final long a1() {
        return (((long) this.f14221c) & 4294967295L) | (((long) this.f14220b) << 32);
    }

    public void b1() {
        F0().p();
    }

    public final void c1(long j) {
        if (!p013b0.j.b(this.f14345o, j)) {
            this.f14345o = j;
            NodeCoordinator nodeCoordinator = this.f14344n;
            LookaheadPassDelegate lookaheadPassDelegate = nodeCoordinator.f14525n.f14390H.f14642q;
            if (lookaheadPassDelegate != null) {
                lookaheadPassDelegate.y0();
            }
            LookaheadCapablePlaceable.N0(nodeCoordinator);
        }
        if (this.f14440i) {
            return;
        }
        x0(new X(F0(), this));
    }

    public final long g1(D d10, boolean z10) {
        long jD = 0;
        D dR1 = this;
        while (!dR1.equals(d10)) {
            if (!dR1.f14438g || !z10) {
                jD = p013b0.j.d(jD, dR1.f14345o);
            }
            NodeCoordinator nodeCoordinator = dR1.f14344n.f14529r;
            kotlin.jvm.internal.i.b(nodeCoordinator);
            dR1 = nodeCoordinator.r1();
            kotlin.jvm.internal.i.b(dR1);
        }
        return jD;
    }

    @Override // p013b0.c
    public final float getDensity() {
        return this.f14344n.getDensity();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1167m
    public final LayoutDirection getLayoutDirection() {
        return this.f14344n.f14525n.f14383A;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.node.F
    public final LayoutNode n1() {
        return this.f14344n.f14525n;
    }

    @Override // androidx.compose.ui.layout.I, androidx.compose.ui.layout.InterfaceC1166l
    public final Object q() {
        return this.f14344n.q();
    }

    @Override // androidx.compose.ui.layout.Y
    public final void q0(long j, float f10, Ia.l<? super androidx.compose.ui.graphics.U, p293xa.r> lVar) {
        c1(j);
        if (this.f14439h) {
            return;
        }
        b1();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public final LookaheadCapablePlaceable y0() {
        NodeCoordinator nodeCoordinator = this.f14344n.f14528q;
        if (nodeCoordinator != null) {
            return nodeCoordinator.r1();
        }
        return null;
    }
}
