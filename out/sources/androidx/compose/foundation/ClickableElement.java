package androidx.compose.foundation;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
final class ClickableElement extends androidx.compose.ui.node.H<C0938j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.k f9725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f9726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f9728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.compose.ui.semantics.i f9729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ia.a<p293xa.r> f9730g;

    public ClickableElement() {
        throw null;
    }

    public ClickableElement(androidx.compose.foundation.interaction.k kVar, z zVar, boolean z10, String str, androidx.compose.ui.semantics.i iVar, Ia.a aVar) {
        this.f9725b = kVar;
        this.f9726c = zVar;
        this.f9727d = z10;
        this.f9728e = str;
        this.f9729f = iVar;
        this.f9730g = aVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        return new C0938j(this.f9725b, this.f9726c, this.f9727d, this.f9728e, this.f9729f, this.f9730g);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        ((C0938j) cVar).a2(this.f9725b, this.f9726c, this.f9727d, this.f9728e, this.f9729f, this.f9730g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return kotlin.jvm.internal.i.a(this.f9725b, clickableElement.f9725b) && kotlin.jvm.internal.i.a(this.f9726c, clickableElement.f9726c) && this.f9727d == clickableElement.f9727d && kotlin.jvm.internal.i.a(this.f9728e, clickableElement.f9728e) && kotlin.jvm.internal.i.a(this.f9729f, clickableElement.f9729f) && this.f9730g == clickableElement.f9730g;
    }

    public final int hashCode() {
        androidx.compose.foundation.interaction.k kVar = this.f9725b;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        z zVar = this.f9726c;
        int iB = androidx.compose.animation.D.b((iHashCode + (zVar != null ? zVar.hashCode() : 0)) * 31, 31, this.f9727d);
        String str = this.f9728e;
        int iHashCode2 = (iB + (str != null ? str.hashCode() : 0)) * 31;
        androidx.compose.ui.semantics.i iVar = this.f9729f;
        return this.f9730g.hashCode() + ((iHashCode2 + (iVar != null ? Integer.hashCode(iVar.f15203a) : 0)) * 31);
    }
}
