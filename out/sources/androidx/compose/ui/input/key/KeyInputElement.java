package androidx.compose.ui.input.key;

import Ia.l;
import O.c;
import O.g;
import androidx.compose.ui.h;
import androidx.compose.ui.node.H;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: KeyInputModifier.kt */
/* JADX INFO: loaded from: classes.dex */
final class KeyInputElement extends H<g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<c, Boolean> f13999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lambda f14000c;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(l<? super c, Boolean> lVar, l<? super c, Boolean> lVar2) {
        this.f13999b = lVar;
        this.f14000c = (Lambda) lVar2;
    }

    @Override // androidx.compose.ui.node.H
    public final h.c a() {
        g gVar = new g();
        gVar.f4723p = this.f13999b;
        gVar.f4724q = this.f14000c;
        return gVar;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(h.c cVar) {
        g gVar = (g) cVar;
        gVar.f4723p = this.f13999b;
        gVar.f4724q = this.f14000c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.f13999b == keyInputElement.f13999b && this.f14000c == keyInputElement.f14000c;
    }

    public final int hashCode() {
        l<c, Boolean> lVar = this.f13999b;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        Lambda lambda = this.f14000c;
        return iHashCode + (lambda != null ? lambda.hashCode() : 0);
    }
}
