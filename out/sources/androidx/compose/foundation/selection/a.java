package androidx.compose.foundation.selection;

import Ia.q;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.interaction.l;
import androidx.compose.foundation.v;
import androidx.compose.foundation.z;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.h;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.i;

/* JADX INFO: compiled from: Selectable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static h a(h hVar, final boolean z10, k kVar, final v vVar, final boolean z11, final Ia.a aVar) {
        h hVarA;
        final i iVar = null;
        if (vVar instanceof z) {
            hVarA = new SelectableElement(z10, kVar, (z) vVar, z11, null, aVar);
        } else if (vVar == null) {
            hVarA = new SelectableElement(z10, kVar, null, z11, null, aVar);
        } else {
            h.a aVar2 = h.a.f13984b;
            if (kVar != null) {
                hVarA = IndicationKt.a(aVar2, kVar, vVar).i(new SelectableElement(z10, kVar, null, z11, null, aVar));
            } else {
                hVarA = ComposedModifierKt.a(aVar2, InspectableValueKt.f14929a, new q<h, InterfaceC1084f, Integer, h>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final h invoke(h hVar2, InterfaceC1084f interfaceC1084f, Integer num) {
                        InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                        num.intValue();
                        interfaceC1084f2.L(-1525724089);
                        Object objF = interfaceC1084f2.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new l();
                            interfaceC1084f2.E(objF);
                        }
                        k kVar2 = (k) objF;
                        h hVarI = IndicationKt.a(h.a.f13984b, kVar2, vVar).i(new SelectableElement(z10, kVar2, null, z11, iVar, aVar));
                        interfaceC1084f2.D();
                        return hVarI;
                    }
                });
            }
        }
        return hVar.i(hVarA);
    }
}
