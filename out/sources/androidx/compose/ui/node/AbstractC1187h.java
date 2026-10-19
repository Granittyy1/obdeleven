package androidx.compose.ui.node;

/* JADX INFO: renamed from: androidx.compose.ui.node.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DelegatingNode.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1187h extends androidx.compose.ui.h.c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f14584p = N.e(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.compose.ui.h.c f14585q;

    @Override // androidx.compose.ui.h.c
    public final void G1() {
        super.G1();
        for (androidx.compose.ui.h.c cVar = this.f14585q; cVar != null; cVar = cVar.f13990g) {
            cVar.P1(this.f13992i);
            if (!cVar.f13997o) {
                cVar.G1();
            }
        }
    }

    @Override // androidx.compose.ui.h.c
    public final void H1() {
        for (androidx.compose.ui.h.c cVar = this.f14585q; cVar != null; cVar = cVar.f13990g) {
            cVar.H1();
        }
        super.H1();
    }

    @Override // androidx.compose.ui.h.c
    public final void L1() {
        super.L1();
        for (androidx.compose.ui.h.c cVar = this.f14585q; cVar != null; cVar = cVar.f13990g) {
            cVar.L1();
        }
    }

    @Override // androidx.compose.ui.h.c
    public final void M1() {
        for (androidx.compose.ui.h.c cVar = this.f14585q; cVar != null; cVar = cVar.f13990g) {
            cVar.M1();
        }
        super.M1();
    }

    @Override // androidx.compose.ui.h.c
    public final void N1() {
        super.N1();
        for (androidx.compose.ui.h.c cVar = this.f14585q; cVar != null; cVar = cVar.f13990g) {
            cVar.N1();
        }
    }

    @Override // androidx.compose.ui.h.c
    public final void O1(androidx.compose.ui.h.c cVar) {
        this.f13985b = cVar;
        for (androidx.compose.ui.h.c cVar2 = this.f14585q; cVar2 != null; cVar2 = cVar2.f13990g) {
            cVar2.O1(cVar);
        }
    }

    @Override // androidx.compose.ui.h.c
    public final void P1(NodeCoordinator nodeCoordinator) {
        this.f13992i = nodeCoordinator;
        for (androidx.compose.ui.h.c cVar = this.f14585q; cVar != null; cVar = cVar.f13990g) {
            cVar.P1(nodeCoordinator);
        }
    }

    public final <T extends InterfaceC1184e> T Q1(T t8) {
        androidx.compose.ui.h.c node = t8.getNode();
        if (node != t8) {
            androidx.compose.ui.h.c cVar = t8 instanceof androidx.compose.ui.h.c ? (androidx.compose.ui.h.c) t8 : null;
            androidx.compose.ui.h.c cVar2 = cVar != null ? cVar.f13989f : null;
            if (node == this.f13985b && kotlin.jvm.internal.i.a(cVar2, this)) {
                return t8;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (node.f13997o) {
            R.a.b("Cannot delegate to an already attached node");
        }
        node.O1(this.f13985b);
        int i10 = this.f13987d;
        int iF = N.f(node);
        node.f13987d = iF;
        int i11 = this.f13987d;
        int i12 = iF & 2;
        if (i12 != 0 && (i11 & 2) != 0 && !(this instanceof InterfaceC1198t)) {
            R.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
        }
        node.f13990g = this.f14585q;
        this.f14585q = node;
        node.f13989f = this;
        S1(iF | this.f13987d, false);
        if (this.f13997o) {
            if (i12 == 0 || (i10 & 2) != 0) {
                P1(this.f13992i);
            } else {
                K k10 = C1185f.f(this).f14389G;
                this.f13985b.P1(null);
                k10.h();
            }
            node.G1();
            node.M1();
            if (!node.f13997o) {
                R.a.b("autoInvalidateInsertedNode called on unattached node");
            }
            N.a(node, -1, 1);
        }
        return t8;
    }

    public final void R1(InterfaceC1184e interfaceC1184e) {
        androidx.compose.ui.h.c cVar = null;
        for (androidx.compose.ui.h.c cVar2 = this.f14585q; cVar2 != null; cVar2 = cVar2.f13990g) {
            if (cVar2 == interfaceC1184e) {
                boolean z10 = cVar2.f13997o;
                if (z10) {
                    androidx.collection.H<Object> h8 = N.f14506a;
                    if (!z10) {
                        R.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    N.a(cVar2, -1, 2);
                    cVar2.N1();
                    cVar2.H1();
                }
                cVar2.O1(cVar2);
                cVar2.f13988e = 0;
                if (cVar == null) {
                    this.f14585q = cVar2.f13990g;
                } else {
                    cVar.f13990g = cVar2.f13990g;
                }
                cVar2.f13990g = null;
                cVar2.f13989f = null;
                int i10 = this.f13987d;
                int iF = N.f(this);
                S1(iF, true);
                if (this.f13997o && (i10 & 2) != 0 && (iF & 2) == 0) {
                    K k10 = C1185f.f(this).f14389G;
                    this.f13985b.P1(null);
                    k10.h();
                    return;
                }
                return;
            }
            cVar = cVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC1184e).toString());
    }

    public final void S1(int i10, boolean z10) {
        androidx.compose.ui.h.c cVar;
        int i11 = this.f13987d;
        this.f13987d = i10;
        if (i11 != i10) {
            androidx.compose.ui.h.c cVar2 = this.f13985b;
            if (cVar2 == this) {
                this.f13988e = i10;
            }
            if (this.f13997o) {
                androidx.compose.ui.h.c cVar3 = this;
                while (cVar3 != null) {
                    i10 |= cVar3.f13987d;
                    cVar3.f13987d = i10;
                    if (cVar3 == cVar2) {
                        break;
                    } else {
                        cVar3 = cVar3.f13989f;
                    }
                }
                if (z10 && cVar3 == cVar2) {
                    i10 = N.f(cVar2);
                    cVar2.f13987d = i10;
                }
                int i12 = i10 | ((cVar3 == null || (cVar = cVar3.f13990g) == null) ? 0 : cVar.f13988e);
                while (cVar3 != null) {
                    i12 |= cVar3.f13987d;
                    cVar3.f13988e = i12;
                    cVar3 = cVar3.f13989f;
                }
            }
        }
    }
}
