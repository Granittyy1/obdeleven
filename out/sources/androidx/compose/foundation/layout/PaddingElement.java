package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
final class PaddingElement extends androidx.compose.ui.node.H<PaddingNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f10190f;

    public PaddingElement() {
        throw null;
    }

    public PaddingElement(float f10, float f11, float f12, float f13, Ia.l lVar) {
        this.f10186b = f10;
        this.f10187c = f11;
        this.f10188d = f12;
        this.f10189e = f13;
        boolean z10 = true;
        this.f10190f = true;
        boolean z11 = (f10 >= 0.0f || Float.isNaN(f10)) & (f11 >= 0.0f || Float.isNaN(f11)) & (f12 >= 0.0f || Float.isNaN(f12));
        if (f13 < 0.0f && !Float.isNaN(f13)) {
            z10 = false;
        }
        if (!z11 || !z10) {
            p258v.a.a("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        PaddingNode paddingNode = new PaddingNode();
        paddingNode.f10191p = this.f10186b;
        paddingNode.f10192q = this.f10187c;
        paddingNode.f10193r = this.f10188d;
        paddingNode.f10194s = this.f10189e;
        paddingNode.f10195t = this.f10190f;
        return paddingNode;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        PaddingNode paddingNode = (PaddingNode) cVar;
        paddingNode.f10191p = this.f10186b;
        paddingNode.f10192q = this.f10187c;
        paddingNode.f10193r = this.f10188d;
        paddingNode.f10194s = this.f10189e;
        paddingNode.f10195t = this.f10190f;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && p013b0.f.a(this.f10186b, paddingElement.f10186b) && p013b0.f.a(this.f10187c, paddingElement.f10187c) && p013b0.f.a(this.f10188d, paddingElement.f10188d) && p013b0.f.a(this.f10189e, paddingElement.f10189e) && this.f10190f == paddingElement.f10190f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10190f) + O.a.d(this.f10189e, O.a.d(this.f10188d, O.a.d(this.f10187c, Float.hashCode(this.f10186b) * 31, 31), 31), 31);
    }
}
