package com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock;

import Ia.l;
import Ia.p;
import S4.o;
import androidx.compose.animation.k;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.d;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import com.voltasit.obdeleven.presentation.components.LabeledSwitchKt;
import com.voltasit.obdeleven.presentation.e;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: UnlockSfdDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class UnlockSfdDialogKt {
    public static final void a(final boolean z10, final l<? super Boolean, r> lVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(582831049);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.k(lVar) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && c1086gP.s()) {
            c1086gP.w();
        } else {
            MaterialThemeKt.a(e.f32277b, e.f32276a, null, androidx.compose.runtime.internal.a.b(-1674349451, new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.UnlockSfdDialogKt$UnlockSfdDialogContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 11) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        h.a aVar = h.a.f13984b;
                        h hVarH = PaddingKt.h(aVar, 24, 0.0f, 2);
                        boolean z11 = z10;
                        l<Boolean, r> lVar2 = lVar;
                        C0953m c0953mA = C0952l.a(C0945e.f10286c, d.a.f13346m, interfaceC1084f3, 0);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarH);
                        ComposeUiNode.f14331c0.getClass();
                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                        if (interfaceC1084f3.u() == null) {
                            I.b.k();
                            throw null;
                        }
                        interfaceC1084f3.r();
                        if (interfaceC1084f3.m()) {
                            interfaceC1084f3.v(aVar2);
                        } else {
                            interfaceC1084f3.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, c0953mA);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            k.b(iF, interfaceC1084f3, iF, pVar);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        float f10 = 8;
                        Lb.a.a(interfaceC1084f3, W.e(aVar, f10));
                        String strP = o.p(interfaceC1084f3, com.voltasit.obdeleven.R.string.dialog_sfd_lock_message);
                        long jG = G0.a.g(16);
                        long j = e.a.f32292p;
                        TextKt.b(strP, null, j, jG, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 3456, 0, 131058);
                        Lb.a.a(interfaceC1084f3, W.e(aVar, 16));
                        LabeledSwitchKt.a(o.p(interfaceC1084f3, com.voltasit.obdeleven.R.string.common_unlock_sfd_automatically), z11, lVar2, null, null, 0L, j, interfaceC1084f3, 1572864, 56);
                        Lb.a.a(interfaceC1084f3, W.e(aVar, f10));
                        TextKt.b(o.p(interfaceC1084f3, com.voltasit.obdeleven.R.string.dialog_sfd_unlock_automatically_message), null, j, G0.a.g(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 3456, 0, 131058);
                        interfaceC1084f3.J();
                    }
                    return r.f47939a;
                }
            }, c1086gP), c1086gP, 3120, 4);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.UnlockSfdDialogKt$UnlockSfdDialogContent$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    UnlockSfdDialogKt.a(z10, lVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final b bVar, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(502764279);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            a(((Boolean) bVar.f31886q.getValue()).booleanValue(), new l<Boolean, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.UnlockSfdDialogKt$UnlockSfdDialogContent$1
                {
                    super(1);
                }

                @Override // Ia.l
                public final r invoke(Boolean bool) {
                    Boolean bool2 = bool;
                    bool2.getClass();
                    bVar.f31885p.setValue(bool2);
                    return r.f47939a;
                }
            }, c1086gP, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.controlUnit.sfd.unlock.UnlockSfdDialogKt$UnlockSfdDialogContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    UnlockSfdDialogKt.b(bVar, interfaceC1084f2, L4.b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
