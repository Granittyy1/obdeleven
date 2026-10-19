package androidx.compose.foundation.selection;

import Ia.l;
import androidx.compose.animation.D;
import androidx.compose.foundation.interaction.k;
import androidx.compose.ui.h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.H;
import androidx.compose.ui.semantics.i;
import p293xa.r;

/* JADX INFO: compiled from: Toggleable.kt */
/* JADX INFO: loaded from: classes.dex */
final class ToggleableElement extends H<d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f11039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f11041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l<Boolean, r> f11042f;

    public ToggleableElement() {
        throw null;
    }

    public ToggleableElement(boolean z10, k kVar, boolean z11, i iVar, l lVar) {
        this.f11038b = z10;
        this.f11039c = kVar;
        this.f11040d = z11;
        this.f11041e = iVar;
        this.f11042f = lVar;
    }

    @Override // androidx.compose.ui.node.H
    public final h.c a() {
        return new d(this.f11038b, this.f11039c, this.f11040d, this.f11041e, this.f11042f);
    }

    @Override // androidx.compose.ui.node.H
    public final void e(h.c cVar) {
        d dVar = (d) cVar;
        boolean z10 = dVar.f11050I;
        boolean z11 = this.f11038b;
        if (z10 != z11) {
            dVar.f11050I = z11;
            C1185f.f(dVar).P();
        }
        dVar.f11051J = this.f11042f;
        dVar.a2(this.f11039c, null, this.f11040d, null, this.f11041e, dVar.f11052K);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f11038b == toggleableElement.f11038b && kotlin.jvm.internal.i.a(this.f11039c, toggleableElement.f11039c) && kotlin.jvm.internal.i.a(null, null) && this.f11040d == toggleableElement.f11040d && kotlin.jvm.internal.i.a(this.f11041e, toggleableElement.f11041e) && this.f11042f == toggleableElement.f11042f;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f11038b) * 31;
        k kVar = this.f11039c;
        int iB = D.b((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 961, 31, this.f11040d);
        i iVar = this.f11041e;
        return this.f11042f.hashCode() + ((iB + (iVar != null ? Integer.hashCode(iVar.f15203a) : 0)) * 31);
    }
}
