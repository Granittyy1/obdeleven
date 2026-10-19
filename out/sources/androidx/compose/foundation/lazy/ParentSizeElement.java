package androidx.compose.foundation.lazy;

import androidx.compose.runtime.C1081d0;
import androidx.compose.runtime.N0;
import androidx.compose.ui.node.H;

/* JADX INFO: compiled from: LazyItemScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
final class ParentSizeElement extends H<ParentSizeNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N0<Integer> f10377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N0<Integer> f10378d;

    public ParentSizeElement() {
        throw null;
    }

    public ParentSizeElement(float f10, C1081d0 c1081d0, C1081d0 c1081d1, int i10) {
        c1081d0 = (i10 & 2) != 0 ? null : c1081d0;
        c1081d1 = (i10 & 4) != 0 ? null : c1081d1;
        this.f10376b = f10;
        this.f10377c = c1081d0;
        this.f10378d = c1081d1;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        ParentSizeNode parentSizeNode = new ParentSizeNode();
        parentSizeNode.f10379p = this.f10376b;
        parentSizeNode.f10380q = this.f10377c;
        parentSizeNode.f10381r = this.f10378d;
        return parentSizeNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ParentSizeNode parentSizeNode = (ParentSizeNode) cVar;
        parentSizeNode.f10379p = this.f10376b;
        parentSizeNode.f10380q = this.f10377c;
        parentSizeNode.f10381r = this.f10378d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeElement)) {
            return false;
        }
        ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
        return this.f10376b == parentSizeElement.f10376b && kotlin.jvm.internal.i.a(this.f10377c, parentSizeElement.f10377c) && kotlin.jvm.internal.i.a(this.f10378d, parentSizeElement.f10378d);
    }

    public final int hashCode() {
        N0<Integer> n10 = this.f10377c;
        int iHashCode = (n10 != null ? n10.hashCode() : 0) * 31;
        N0<Integer> n11 = this.f10378d;
        return Float.hashCode(this.f10376b) + ((iHashCode + (n11 != null ? n11.hashCode() : 0)) * 31);
    }
}
