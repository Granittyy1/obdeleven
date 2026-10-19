package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.C1235n0;

/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: classes.dex */
final class IntrinsicWidthElement extends androidx.compose.ui.node.H<H> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntrinsicSize f10158b = IntrinsicSize.f10156c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10159c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.l<C1235n0, p293xa.r> f10160d;

    public IntrinsicWidthElement(Ia.l lVar) {
        this.f10160d = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        H h8 = new H();
        h8.f10144p = this.f10158b;
        h8.f10145q = this.f10159c;
        return h8;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        H h8 = (H) cVar;
        h8.f10144p = this.f10158b;
        h8.f10145q = this.f10159c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        if (intrinsicWidthElement == null) {
            return false;
        }
        return this.f10158b == intrinsicWidthElement.f10158b && this.f10159c == intrinsicWidthElement.f10159c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10159c) + (this.f10158b.hashCode() * 31);
    }
}
