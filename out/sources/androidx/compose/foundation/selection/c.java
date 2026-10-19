package androidx.compose.foundation.selection;

import Ia.l;
import Ia.q;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.k;
import androidx.compose.material.K;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.h;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.i;
import androidx.compose.ui.state.ToggleableState;

/* JADX INFO: compiled from: Toggleable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final h a(boolean z10, k kVar, boolean z11, i iVar, l lVar) {
        return new ToggleableElement(z10, kVar, z11, iVar, lVar);
    }

    public static final h b(final ToggleableState toggleableState, k kVar, final K k10, final boolean z10, final i iVar, final Ia.a aVar) {
        if (k10 != null) {
            return new TriStateToggleableElement(toggleableState, kVar, k10, z10, iVar, aVar);
        }
        if (k10 == null) {
            return new TriStateToggleableElement(toggleableState, kVar, null, z10, iVar, aVar);
        }
        h.a aVar2 = h.a.f13984b;
        if (kVar != null) {
            return IndicationKt.a(aVar2, kVar, k10).i(new TriStateToggleableElement(toggleableState, kVar, null, z10, iVar, aVar));
        }
        return ComposedModifierKt.a(aVar2, InspectableValueKt.f14929a, new q<h, InterfaceC1084f, Integer, h>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // Ia.q
            public final h invoke(h hVar, InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                num.intValue();
                interfaceC1084f2.L(-1525724089);
                Object objF = interfaceC1084f2.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = new androidx.compose.foundation.interaction.l();
                    interfaceC1084f2.E(objF);
                }
                k kVar2 = (k) objF;
                h hVarI = IndicationKt.a(h.a.f13984b, kVar2, k10).i(new TriStateToggleableElement(toggleableState, kVar2, null, z10, iVar, aVar));
                interfaceC1084f2.D();
                return hVarI;
            }
        });
    }
}
