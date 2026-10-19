package androidx.compose.foundation;

import androidx.compose.ui.node.C1185f;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
final class CombinedClickableElement extends androidx.compose.ui.node.H<CombinedClickableNode> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.k f9731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f9733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.compose.ui.semantics.i f9734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Ia.a<p293xa.r> f9735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f9736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Ia.a<p293xa.r> f9737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Ia.a<p293xa.r> f9738i;
    public final boolean j;

    public CombinedClickableElement() {
        throw null;
    }

    public CombinedClickableElement(Ia.a aVar, Ia.a aVar2, Ia.a aVar3, androidx.compose.foundation.interaction.k kVar, androidx.compose.ui.semantics.i iVar, String str, String str2, boolean z10, boolean z11) {
        this.f9731b = kVar;
        this.f9732c = z10;
        this.f9733d = str;
        this.f9734e = iVar;
        this.f9735f = aVar;
        this.f9736g = str2;
        this.f9737h = aVar2;
        this.f9738i = aVar3;
        this.j = z11;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        androidx.compose.foundation.interaction.k kVar = this.f9731b;
        androidx.compose.ui.semantics.i iVar = this.f9734e;
        Ia.a<p293xa.r> aVar = this.f9735f;
        String str = this.f9736g;
        return new CombinedClickableNode(aVar, this.f9737h, this.f9738i, kVar, iVar, str, this.f9733d, this.j, this.f9732c);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        boolean z10;
        androidx.compose.ui.input.pointer.D d10;
        CombinedClickableNode combinedClickableNode = (CombinedClickableNode) cVar;
        combinedClickableNode.f9742L = this.j;
        String str = combinedClickableNode.f9739I;
        String str2 = this.f9736g;
        if (!kotlin.jvm.internal.i.a(str, str2)) {
            combinedClickableNode.f9739I = str2;
            C1185f.f(combinedClickableNode).P();
        }
        boolean z11 = combinedClickableNode.f9740J == null;
        Ia.a<p293xa.r> aVar = this.f9737h;
        if (z11 != (aVar == null)) {
            combinedClickableNode.V1();
            C1185f.f(combinedClickableNode).P();
            z10 = true;
        } else {
            z10 = false;
        }
        combinedClickableNode.f9740J = aVar;
        boolean z12 = combinedClickableNode.f9741K == null;
        Ia.a<p293xa.r> aVar2 = this.f9738i;
        if (z12 != (aVar2 == null)) {
            z10 = true;
        }
        combinedClickableNode.f9741K = aVar2;
        boolean z13 = combinedClickableNode.f9690v;
        boolean z14 = this.f9732c;
        boolean z15 = z13 != z14 ? true : z10;
        combinedClickableNode.a2(this.f9731b, null, z14, this.f9733d, this.f9734e, this.f9735f);
        if (!z15 || (d10 = combinedClickableNode.f9693y) == null) {
            return;
        }
        d10.D1();
        p293xa.r rVar = p293xa.r.f47939a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return kotlin.jvm.internal.i.a(this.f9731b, combinedClickableElement.f9731b) && kotlin.jvm.internal.i.a(null, null) && this.f9732c == combinedClickableElement.f9732c && kotlin.jvm.internal.i.a(this.f9733d, combinedClickableElement.f9733d) && kotlin.jvm.internal.i.a(this.f9734e, combinedClickableElement.f9734e) && this.f9735f == combinedClickableElement.f9735f && kotlin.jvm.internal.i.a(this.f9736g, combinedClickableElement.f9736g) && this.f9737h == combinedClickableElement.f9737h && this.f9738i == combinedClickableElement.f9738i && this.j == combinedClickableElement.j;
    }

    public final int hashCode() {
        androidx.compose.foundation.interaction.k kVar = this.f9731b;
        int iB = androidx.compose.animation.D.b((kVar != null ? kVar.hashCode() : 0) * 961, 31, this.f9732c);
        String str = this.f9733d;
        int iHashCode = (iB + (str != null ? str.hashCode() : 0)) * 31;
        androidx.compose.ui.semantics.i iVar = this.f9734e;
        int iHashCode2 = (this.f9735f.hashCode() + ((iHashCode + (iVar != null ? Integer.hashCode(iVar.f15203a) : 0)) * 31)) * 31;
        String str2 = this.f9736g;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Ia.a<p293xa.r> aVar = this.f9737h;
        int iHashCode4 = (iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        Ia.a<p293xa.r> aVar2 = this.f9738i;
        return Boolean.hashCode(this.j) + ((iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
    }
}
