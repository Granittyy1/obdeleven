package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.C1235n0;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
final class SizeElement extends androidx.compose.ui.node.H<SizeNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ia.l<C1235n0, p293xa.r> f10208g;

    public SizeElement() {
        throw null;
    }

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, Ia.l lVar, int i10) {
        this((i10 & 1) != 0 ? Float.NaN : f10, (i10 & 2) != 0 ? Float.NaN : f11, (i10 & 4) != 0 ? Float.NaN : f12, (i10 & 8) != 0 ? Float.NaN : f13, z10, lVar);
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        SizeNode sizeNode = new SizeNode();
        sizeNode.f10209p = this.f10203b;
        sizeNode.f10210q = this.f10204c;
        sizeNode.f10211r = this.f10205d;
        sizeNode.f10212s = this.f10206e;
        sizeNode.f10213t = this.f10207f;
        return sizeNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        SizeNode sizeNode = (SizeNode) cVar;
        sizeNode.f10209p = this.f10203b;
        sizeNode.f10210q = this.f10204c;
        sizeNode.f10211r = this.f10205d;
        sizeNode.f10212s = this.f10206e;
        sizeNode.f10213t = this.f10207f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return p013b0.f.a(this.f10203b, sizeElement.f10203b) && p013b0.f.a(this.f10204c, sizeElement.f10204c) && p013b0.f.a(this.f10205d, sizeElement.f10205d) && p013b0.f.a(this.f10206e, sizeElement.f10206e) && this.f10207f == sizeElement.f10207f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10207f) + O.a.d(this.f10206e, O.a.d(this.f10205d, O.a.d(this.f10204c, Float.hashCode(this.f10203b) * 31, 31), 31), 31);
    }

    public SizeElement(float f10, float f11, float f12, float f13, boolean z10, Ia.l lVar) {
        this.f10203b = f10;
        this.f10204c = f11;
        this.f10205d = f12;
        this.f10206e = f13;
        this.f10207f = z10;
        this.f10208g = lVar;
    }
}
