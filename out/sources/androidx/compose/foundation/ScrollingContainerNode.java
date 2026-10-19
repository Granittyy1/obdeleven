package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.ui.node.AbstractC1187h;
import androidx.compose.ui.node.C1183d;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.InterfaceC1182c;
import androidx.compose.ui.node.InterfaceC1184e;
import androidx.compose.ui.node.O;
import androidx.compose.ui.node.P;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: compiled from: ScrollingContainer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollingContainerNode extends AbstractC1187h implements InterfaceC1182c, O {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ScrollableNode f9842A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InterfaceC1184e f9843B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public F f9844C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public E f9845D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f9846E;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public androidx.compose.foundation.gestures.u f9847r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Orientation f9848s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9849t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9850u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.compose.foundation.gestures.j f9851v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public androidx.compose.foundation.interaction.l f9852w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public androidx.compose.foundation.gestures.c f9853x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9854y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public E f9855z;

    @Override // androidx.compose.ui.h.c
    public final boolean F1() {
        return false;
    }

    @Override // androidx.compose.ui.node.InterfaceC1184e
    public final void H0() {
        boolean zV1 = V1();
        if (this.f9846E != zV1) {
            this.f9846E = zV1;
            androidx.compose.foundation.gestures.u uVar = this.f9847r;
            Orientation orientation = this.f9848s;
            boolean z10 = this.f9854y;
            E eU1 = U1();
            boolean z11 = this.f9849t;
            boolean z12 = this.f9850u;
            W1(eU1, this.f9853x, this.f9851v, orientation, uVar, this.f9852w, z10, z11, z12);
        }
    }

    @Override // androidx.compose.ui.h.c
    public final void I1() {
        this.f9846E = V1();
        T1();
        if (this.f9842A == null) {
            androidx.compose.foundation.gestures.u uVar = this.f9847r;
            E eU1 = U1();
            androidx.compose.foundation.gestures.j jVar = this.f9851v;
            Orientation orientation = this.f9848s;
            boolean z10 = this.f9849t;
            boolean z11 = this.f9846E;
            ScrollableNode scrollableNode = new ScrollableNode(eU1, this.f9853x, jVar, orientation, uVar, this.f9852w, z10, z11);
            Q1(scrollableNode);
            this.f9842A = scrollableNode;
        }
    }

    @Override // androidx.compose.ui.h.c
    public final void J1() {
        InterfaceC1184e interfaceC1184e = this.f9843B;
        if (interfaceC1184e != null) {
            R1(interfaceC1184e);
        }
    }

    public final void T1() {
        InterfaceC1184e interfaceC1184e = this.f9843B;
        if (interfaceC1184e != null) {
            if (interfaceC1184e.getNode().f13997o) {
                return;
            }
            Q1(interfaceC1184e);
            return;
        }
        if (this.f9854y) {
            P.a(this, new Ia.a<p293xa.r>() { // from class: androidx.compose.foundation.ScrollingContainerNode$attachOverscrollNodeIfNeeded$1
                {
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    ScrollingContainerNode scrollingContainerNode = this.this$0;
                    scrollingContainerNode.f9844C = (F) C1183d.a(scrollingContainerNode, OverscrollKt.f9817a);
                    ScrollingContainerNode scrollingContainerNode2 = this.this$0;
                    F f10 = scrollingContainerNode2.f9844C;
                    scrollingContainerNode2.f9845D = f10 != null ? f10.a() : null;
                    return p293xa.r.f47939a;
                }
            });
        }
        E eU1 = U1();
        if (eU1 != null) {
            InterfaceC1184e node = eU1.getNode();
            if (node.getNode().f13997o) {
                return;
            }
            Q1(node);
            this.f9843B = node;
        }
    }

    public final E U1() {
        return this.f9854y ? this.f9845D : this.f9855z;
    }

    public final boolean V1() {
        LayoutDirection layoutDirection = LayoutDirection.f15717b;
        if (this.f13997o) {
            layoutDirection = C1185f.f(this).f14383A;
        }
        Orientation orientation = this.f9848s;
        boolean z10 = this.f9850u;
        return (layoutDirection != LayoutDirection.f15718c || orientation == Orientation.f9957b) ? !z10 : z10;
    }

    public final void W1(E e10, androidx.compose.foundation.gestures.c cVar, androidx.compose.foundation.gestures.j jVar, Orientation orientation, androidx.compose.foundation.gestures.u uVar, androidx.compose.foundation.interaction.l lVar, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        this.f9847r = uVar;
        this.f9848s = orientation;
        boolean z14 = true;
        if (this.f9854y != z10) {
            this.f9854y = z10;
            z13 = true;
        } else {
            z13 = false;
        }
        if (kotlin.jvm.internal.i.a(this.f9855z, e10)) {
            z14 = false;
        } else {
            this.f9855z = e10;
        }
        if (z13 || (z14 && !z10)) {
            InterfaceC1184e interfaceC1184e = this.f9843B;
            if (interfaceC1184e != null) {
                R1(interfaceC1184e);
            }
            this.f9843B = null;
            T1();
        }
        this.f9849t = z11;
        this.f9850u = z12;
        this.f9851v = jVar;
        this.f9852w = lVar;
        this.f9853x = cVar;
        this.f9846E = V1();
        ScrollableNode scrollableNode = this.f9842A;
        if (scrollableNode != null) {
            scrollableNode.c2(U1(), cVar, jVar, orientation, uVar, lVar, z11, this.f9846E);
        }
    }

    @Override // androidx.compose.ui.node.O
    public final void a1() {
        F f10 = (F) C1183d.a(this, OverscrollKt.f9817a);
        if (kotlin.jvm.internal.i.a(f10, this.f9844C)) {
            return;
        }
        this.f9844C = f10;
        this.f9845D = null;
        InterfaceC1184e interfaceC1184e = this.f9843B;
        if (interfaceC1184e != null) {
            R1(interfaceC1184e);
        }
        this.f9843B = null;
        T1();
        ScrollableNode scrollableNode = this.f9842A;
        if (scrollableNode != null) {
            androidx.compose.foundation.gestures.u uVar = this.f9847r;
            Orientation orientation = this.f9848s;
            E eU1 = U1();
            boolean z10 = this.f9849t;
            boolean z11 = this.f9846E;
            scrollableNode.c2(eU1, this.f9853x, this.f9851v, orientation, uVar, this.f9852w, z10, z11);
        }
    }
}
