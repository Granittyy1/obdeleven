package androidx.compose.foundation;

import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;

/* JADX INFO: compiled from: Indication.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IndicationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O0 f9774a = new O0(new Ia.a<v>() { // from class: androidx.compose.foundation.IndicationKt$LocalIndication$1
        @Override // Ia.a
        public final /* bridge */ /* synthetic */ v invoke() {
            return DefaultDebugIndication.f9749a;
        }
    });

    public static final androidx.compose.ui.h a(androidx.compose.ui.h hVar, final androidx.compose.foundation.interaction.j jVar, final v vVar) {
        if (vVar == null) {
            return hVar;
        }
        return vVar instanceof z ? hVar.i(new IndicationModifierElement(jVar, (z) vVar)) : ComposedModifierKt.a(hVar, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.IndicationKt$indication$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // Ia.q
            public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar2, InterfaceC1084f interfaceC1084f, Integer num) {
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                num.intValue();
                interfaceC1084f2.L(-353972293);
                w wVarA = vVar.a(jVar, interfaceC1084f2);
                boolean zK = interfaceC1084f2.K(wVarA);
                Object objF = interfaceC1084f2.f();
                if (zK || objF == InterfaceC1084f.a.f12980a) {
                    objF = new x(wVarA);
                    interfaceC1084f2.E(objF);
                }
                x xVar = (x) objF;
                interfaceC1084f2.D();
                return xVar;
            }
        });
    }
}
