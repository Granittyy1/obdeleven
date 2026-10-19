package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.C1235n0;

/* JADX INFO: compiled from: AspectRatio.kt */
/* JADX INFO: loaded from: classes.dex */
final class AspectRatioElement extends androidx.compose.ui.node.H<AspectRatioNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10086b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.l<C1235n0, p293xa.r> f10088d;

    public AspectRatioElement(Ia.l lVar, boolean z10) {
        this.f10087c = z10;
        this.f10088d = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        AspectRatioNode aspectRatioNode = new AspectRatioNode();
        aspectRatioNode.f10089p = this.f10086b;
        aspectRatioNode.f10090q = this.f10087c;
        return aspectRatioNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        AspectRatioNode aspectRatioNode = (AspectRatioNode) cVar;
        aspectRatioNode.f10089p = this.f10086b;
        aspectRatioNode.f10090q = this.f10087c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null) {
            return false;
        }
        if (this.f10086b == aspectRatioElement.f10086b) {
            if (this.f10087c == ((AspectRatioElement) obj).f10087c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10087c) + (Float.hashCode(this.f10086b) * 31);
    }
}
