package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;

/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ClickableKt {
    public static final androidx.compose.ui.h a(androidx.compose.ui.h hVar, androidx.compose.foundation.interaction.k kVar, final v vVar, final boolean z10, final String str, final androidx.compose.ui.semantics.i iVar, final Ia.a<p293xa.r> aVar) {
        androidx.compose.ui.h hVarA;
        if (vVar instanceof z) {
            hVarA = new ClickableElement(kVar, (z) vVar, z10, str, iVar, aVar);
        } else if (vVar == null) {
            hVarA = new ClickableElement(kVar, null, z10, str, iVar, aVar);
        } else {
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            if (kVar != null) {
                hVarA = IndicationKt.a(aVar2, kVar, vVar).i(new ClickableElement(kVar, null, z10, str, iVar, aVar));
            } else {
                hVarA = ComposedModifierKt.a(aVar2, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar2, InterfaceC1084f interfaceC1084f, Integer num) {
                        InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                        num.intValue();
                        interfaceC1084f2.L(-1525724089);
                        Object objF = interfaceC1084f2.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            interfaceC1084f2.E(objF);
                        }
                        androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objF;
                        androidx.compose.ui.h hVarI = IndicationKt.a(androidx.compose.ui.h.a.f13984b, kVar2, vVar).i(new ClickableElement(kVar2, null, z10, str, iVar, aVar));
                        interfaceC1084f2.D();
                        return hVarI;
                    }
                });
            }
        }
        return hVar.i(hVarA);
    }

    public static /* synthetic */ androidx.compose.ui.h b(androidx.compose.ui.h hVar, androidx.compose.foundation.interaction.k kVar, v vVar, boolean z10, androidx.compose.ui.semantics.i iVar, Ia.a aVar, int i10) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            iVar = null;
        }
        return a(hVar, kVar, vVar, z11, null, iVar, aVar);
    }

    public static androidx.compose.ui.h c(androidx.compose.ui.h hVar, final boolean z10, final String str, final Ia.a aVar, int i10) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        final androidx.compose.ui.semantics.i iVar = null;
        if ((i10 & 2) != 0) {
            str = null;
        }
        return ComposedModifierKt.a(hVar, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // Ia.q
            public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar2, InterfaceC1084f interfaceC1084f, Integer num) {
                androidx.compose.foundation.interaction.k kVar;
                InterfaceC1084f interfaceC1084f2 = interfaceC1084f;
                num.intValue();
                interfaceC1084f2.L(-756081143);
                v vVar = (v) interfaceC1084f2.x(IndicationKt.f9774a);
                if (vVar instanceof z) {
                    interfaceC1084f2.L(617653824);
                    interfaceC1084f2.D();
                    kVar = null;
                } else {
                    interfaceC1084f2.L(617786442);
                    Object objF = interfaceC1084f2.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        interfaceC1084f2.E(objF);
                    }
                    kVar = (androidx.compose.foundation.interaction.k) objF;
                    interfaceC1084f2.D();
                }
                androidx.compose.ui.h hVarA = ClickableKt.a(androidx.compose.ui.h.a.f13984b, kVar, vVar, z10, str, iVar, aVar);
                interfaceC1084f2.D();
                return hVarA;
            }
        });
    }

    public static androidx.compose.ui.h d(androidx.compose.ui.h hVar, androidx.compose.foundation.interaction.k kVar, Ia.a aVar) {
        return hVar.i(new CombinedClickableElement(aVar, null, null, kVar, null, null, null, true, true));
    }

    public static final boolean e(KeyEvent keyEvent) {
        long jN = O.e.n(keyEvent);
        int i10 = O.b.f4720n;
        if (O.b.a(jN, O.b.f4713f) ? true : O.b.a(jN, O.b.f4716i) ? true : O.b.a(jN, O.b.f4719m)) {
            return true;
        }
        return O.b.a(jN, O.b.f4715h);
    }
}
