package androidx.compose.foundation.selection;

import androidx.compose.animation.D;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.z;
import androidx.compose.ui.h;
import androidx.compose.ui.node.C1185f;
import androidx.compose.ui.node.H;
import androidx.compose.ui.semantics.i;
import androidx.compose.ui.state.ToggleableState;
import p293xa.r;

/* JADX INFO: compiled from: Toggleable.kt */
/* JADX INFO: loaded from: classes.dex */
final class TriStateToggleableElement extends H<e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ToggleableState f11043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f11044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f11045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f11046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f11047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Ia.a<r> f11048g;

    public TriStateToggleableElement() {
        throw null;
    }

    public TriStateToggleableElement(ToggleableState toggleableState, k kVar, z zVar, boolean z10, i iVar, Ia.a aVar) {
        this.f11043b = toggleableState;
        this.f11044c = kVar;
        this.f11045d = zVar;
        this.f11046e = z10;
        this.f11047f = iVar;
        this.f11048g = aVar;
    }

    @Override // androidx.compose.ui.node.H
    public final h.c a() {
        e eVar = new e(this.f11044c, this.f11045d, this.f11046e, null, this.f11047f, this.f11048g);
        eVar.f11053I = this.f11043b;
        return eVar;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(h.c cVar) {
        e eVar = (e) cVar;
        ToggleableState toggleableState = eVar.f11053I;
        ToggleableState toggleableState2 = this.f11043b;
        if (toggleableState != toggleableState2) {
            eVar.f11053I = toggleableState2;
            C1185f.f(eVar).P();
        }
        eVar.a2(this.f11044c, this.f11045d, this.f11046e, null, this.f11047f, this.f11048g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f11043b == triStateToggleableElement.f11043b && kotlin.jvm.internal.i.a(this.f11044c, triStateToggleableElement.f11044c) && kotlin.jvm.internal.i.a(this.f11045d, triStateToggleableElement.f11045d) && this.f11046e == triStateToggleableElement.f11046e && kotlin.jvm.internal.i.a(this.f11047f, triStateToggleableElement.f11047f) && this.f11048g == triStateToggleableElement.f11048g;
    }

    public final int hashCode() {
        int iHashCode = this.f11043b.hashCode() * 31;
        k kVar = this.f11044c;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        z zVar = this.f11045d;
        int iB = D.b((iHashCode2 + (zVar != null ? zVar.hashCode() : 0)) * 31, 31, this.f11046e);
        i iVar = this.f11047f;
        return this.f11048g.hashCode() + ((iB + (iVar != null ? Integer.hashCode(iVar.f15203a) : 0)) * 31);
    }
}
