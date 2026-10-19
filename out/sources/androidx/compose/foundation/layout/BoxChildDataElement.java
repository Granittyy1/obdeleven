package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.C1235n0;

/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes.dex */
final class BoxChildDataElement extends androidx.compose.ui.node.H<C0947g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.ui.f f10092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.l<C1235n0, p293xa.r> f10094d;

    public BoxChildDataElement(androidx.compose.ui.f fVar, boolean z10, Ia.l lVar) {
        this.f10092b = fVar;
        this.f10093c = z10;
        this.f10094d = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        C0947g c0947g = new C0947g();
        c0947g.f10302p = this.f10092b;
        c0947g.f10303q = this.f10093c;
        return c0947g;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        C0947g c0947g = (C0947g) cVar;
        c0947g.f10302p = this.f10092b;
        c0947g.f10303q = this.f10093c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return kotlin.jvm.internal.i.a(this.f10092b, boxChildDataElement.f10092b) && this.f10093c == boxChildDataElement.f10093c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10093c) + (this.f10092b.hashCode() * 31);
    }
}
