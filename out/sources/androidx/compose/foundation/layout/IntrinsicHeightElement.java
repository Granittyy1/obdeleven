package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.C1235n0;

/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: classes.dex */
final class IntrinsicHeightElement extends androidx.compose.ui.node.H<F> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntrinsicSize f10152b = IntrinsicSize.f10156c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10153c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.l<C1235n0, p293xa.r> f10154d;

    public IntrinsicHeightElement(Ia.l lVar) {
        this.f10154d = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        F f10 = new F();
        f10.f10117p = this.f10152b;
        f10.f10118q = this.f10153c;
        return f10;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        F f10 = (F) cVar;
        f10.f10117p = this.f10152b;
        f10.f10118q = this.f10153c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        if (intrinsicHeightElement == null) {
            return false;
        }
        return this.f10152b == intrinsicHeightElement.f10152b && this.f10153c == intrinsicHeightElement.f10153c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10153c) + (this.f10152b.hashCode() * 31);
    }
}
