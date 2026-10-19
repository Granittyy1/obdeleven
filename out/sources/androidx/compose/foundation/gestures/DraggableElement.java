package androidx.compose.foundation.gestures;

import androidx.compose.animation.D;
import androidx.compose.ui.node.H;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: Draggable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DraggableElement extends H<DraggableNode> {
    public static final Ia.l<androidx.compose.ui.input.pointer.q, Boolean> j = new Ia.l<androidx.compose.ui.input.pointer.q, Boolean>() { // from class: androidx.compose.foundation.gestures.DraggableElement$Companion$CanDrag$1
        @Override // Ia.l
        public final /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.pointer.q qVar) {
            return Boolean.TRUE;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f9939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Orientation f9940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.k f9942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f9943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ia.q<A, I.d, kotlin.coroutines.c<? super p293xa.r>, Object> f9944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Ia.q<A, Float, kotlin.coroutines.c<? super p293xa.r>, Object> f9945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9946i;

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(i iVar, Orientation orientation, boolean z10, androidx.compose.foundation.interaction.k kVar, boolean z11, Ia.q<? super A, ? super I.d, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar, Ia.q<? super A, ? super Float, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar2, boolean z12) {
        this.f9939b = iVar;
        this.f9940c = orientation;
        this.f9941d = z10;
        this.f9942e = kVar;
        this.f9943f = z11;
        this.f9944g = qVar;
        this.f9945h = qVar2;
        this.f9946i = z12;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        Ia.l<androidx.compose.ui.input.pointer.q, Boolean> lVar = j;
        boolean z10 = this.f9941d;
        androidx.compose.foundation.interaction.k kVar = this.f9942e;
        Orientation orientation = this.f9940c;
        DraggableNode draggableNode = new DraggableNode(lVar, z10, kVar, orientation);
        draggableNode.f9955z = this.f9939b;
        draggableNode.f9950A = orientation;
        draggableNode.f9951B = this.f9943f;
        draggableNode.f9952C = this.f9944g;
        draggableNode.f9953D = this.f9945h;
        draggableNode.f9954E = this.f9946i;
        return draggableNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        boolean z10;
        boolean z11;
        DraggableNode draggableNode = (DraggableNode) cVar;
        Ia.l<androidx.compose.ui.input.pointer.q, Boolean> lVar = j;
        i iVar = draggableNode.f9955z;
        i iVar2 = this.f9939b;
        if (kotlin.jvm.internal.i.a(iVar, iVar2)) {
            z10 = false;
        } else {
            draggableNode.f9955z = iVar2;
            z10 = true;
        }
        Orientation orientation = draggableNode.f9950A;
        Orientation orientation2 = this.f9940c;
        if (orientation != orientation2) {
            draggableNode.f9950A = orientation2;
            z10 = true;
        }
        boolean z12 = draggableNode.f9954E;
        boolean z13 = this.f9946i;
        if (z12 != z13) {
            draggableNode.f9954E = z13;
            z11 = true;
        } else {
            z11 = z10;
        }
        draggableNode.f9952C = this.f9944g;
        draggableNode.f9953D = this.f9945h;
        draggableNode.f9951B = this.f9943f;
        draggableNode.b2(lVar, this.f9941d, this.f9942e, orientation2, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return kotlin.jvm.internal.i.a(this.f9939b, draggableElement.f9939b) && this.f9940c == draggableElement.f9940c && this.f9941d == draggableElement.f9941d && kotlin.jvm.internal.i.a(this.f9942e, draggableElement.f9942e) && this.f9943f == draggableElement.f9943f && kotlin.jvm.internal.i.a(this.f9944g, draggableElement.f9944g) && kotlin.jvm.internal.i.a(this.f9945h, draggableElement.f9945h) && this.f9946i == draggableElement.f9946i;
    }

    public final int hashCode() {
        int iB = D.b((this.f9940c.hashCode() + (this.f9939b.hashCode() * 31)) * 31, 31, this.f9941d);
        androidx.compose.foundation.interaction.k kVar = this.f9942e;
        return Boolean.hashCode(this.f9946i) + ((this.f9945h.hashCode() + ((this.f9944g.hashCode() + D.b((iB + (kVar != null ? kVar.hashCode() : 0)) * 31, 31, this.f9943f)) * 31)) * 31);
    }
}
