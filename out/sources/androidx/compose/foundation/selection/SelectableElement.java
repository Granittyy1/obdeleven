package androidx.compose.foundation.selection;

import androidx.compose.animation.D;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.z;
import androidx.compose.ui.h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.H;
import androidx.compose.ui.semantics.i;
import p293xa.r;

/* JADX INFO: compiled from: Selectable.kt */
/* JADX INFO: loaded from: classes.dex */
final class SelectableElement extends H<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f11032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f11033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f11035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ia.a<r> f11036g;

    public SelectableElement() {
        throw null;
    }

    public SelectableElement(boolean z10, k kVar, z zVar, boolean z11, i iVar, Ia.a aVar) {
        this.f11031b = z10;
        this.f11032c = kVar;
        this.f11033d = zVar;
        this.f11034e = z11;
        this.f11035f = iVar;
        this.f11036g = aVar;
    }

    @Override // androidx.compose.ui.node.H
    public final h.c a() {
        b bVar = new b(this.f11032c, this.f11033d, this.f11034e, null, this.f11035f, this.f11036g);
        bVar.f11049I = this.f11031b;
        return bVar;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(h.c cVar) {
        b bVar = (b) cVar;
        boolean z10 = bVar.f11049I;
        boolean z11 = this.f11031b;
        if (z10 != z11) {
            bVar.f11049I = z11;
            C1185f.f(bVar).P();
        }
        bVar.a2(this.f11032c, this.f11033d, this.f11034e, null, this.f11035f, this.f11036g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f11031b == selectableElement.f11031b && kotlin.jvm.internal.i.a(this.f11032c, selectableElement.f11032c) && kotlin.jvm.internal.i.a(this.f11033d, selectableElement.f11033d) && this.f11034e == selectableElement.f11034e && kotlin.jvm.internal.i.a(this.f11035f, selectableElement.f11035f) && this.f11036g == selectableElement.f11036g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f11031b) * 31;
        k kVar = this.f11032c;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        z zVar = this.f11033d;
        int iB = D.b((iHashCode2 + (zVar != null ? zVar.hashCode() : 0)) * 31, 31, this.f11034e);
        i iVar = this.f11035f;
        return this.f11036g.hashCode() + ((iB + (iVar != null ? Integer.hashCode(iVar.f15203a) : 0)) * 31);
    }
}
