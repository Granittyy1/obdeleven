package androidx.compose.foundation;

import androidx.compose.ui.node.InterfaceC1184e;

/* JADX INFO: compiled from: Indication.kt */
/* JADX INFO: loaded from: classes.dex */
final class IndicationModifierElement extends androidx.compose.ui.node.H<y> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.compose.foundation.interaction.j f9776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f9777c;

    public IndicationModifierElement(androidx.compose.foundation.interaction.j jVar, z zVar) {
        this.f9776b = jVar;
        this.f9777c = zVar;
    }

    @Override // androidx.compose.ui.node.H
    public final androidx.compose.ui.h.c a() {
        InterfaceC1184e interfaceC1184eB = this.f9777c.b(this.f9776b);
        y yVar = new y();
        yVar.f11654r = interfaceC1184eB;
        yVar.Q1(interfaceC1184eB);
        return yVar;
    }

    @Override // androidx.compose.ui.node.H
    public final void e(androidx.compose.ui.h.c cVar) {
        y yVar = (y) cVar;
        InterfaceC1184e interfaceC1184eB = this.f9777c.b(this.f9776b);
        yVar.R1(yVar.f11654r);
        yVar.f11654r = interfaceC1184eB;
        yVar.Q1(interfaceC1184eB);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return kotlin.jvm.internal.i.a(this.f9776b, indicationModifierElement.f9776b) && kotlin.jvm.internal.i.a(this.f9777c, indicationModifierElement.f9777c);
    }

    public final int hashCode() {
        return this.f9777c.hashCode() + (this.f9776b.hashCode() * 31);
    }
}
