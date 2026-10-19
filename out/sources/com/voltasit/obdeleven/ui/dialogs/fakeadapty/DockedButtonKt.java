package com.voltasit.obdeleven.ui.dialogs.fakeadapty;

import Ia.p;
import Ia.q;
import L4.b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.N;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.C1050e;
import androidx.compose.material3.C1051f;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.d;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.h;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.l;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: DockedButton.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DockedButtonKt {
    public static final void a(final String text, final boolean z10, final Ia.a<r> onClick, final Ia.a<r> onDismiss, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        i.e(text, "text");
        i.e(onClick, "onClick");
        i.e(onDismiss, "onDismiss");
        C1086g c1086gP = interfaceC1084f.p(1165239721);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(text) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i11 |= c1086gP.c(z10) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= c1086gP.k(onClick) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= c1086gP.k(onDismiss) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 5851) == 1170 && c1086gP.s()) {
            c1086gP.w();
        } else {
            h.a aVar = h.a.f13984b;
            h hVarH = PaddingKt.h(W.d(aVar, 1.0f), 24, 0.0f, 2);
            E eD = BoxKt.d(d.a.f13335a, false);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC = ComposedModifierKt.c(c1086gP, hVarH);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
            h hVarE = W.e(W.d(aVar, 1.0f), 52);
            N n10 = C1051f.f12444a;
            C1050e c1050eA = C1051f.a(Q3.d.e(4280908287L), 0L, 0L, 0L, c1086gP, 14);
            c1086gP.L(-581778559);
            boolean z11 = ((i12 & 896) == 256) | ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) | ((i12 & 7168) == 2048);
            Object objF = c1086gP.f();
            if (z11 || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.DockedButtonKt$DockedButton$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        if (z10) {
                            onClick.invoke();
                            onDismiss.invoke();
                        }
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            ButtonKt.a((Ia.a) objF, hVarE, z10, null, c1050eA, null, null, null, null, androidx.compose.runtime.internal.a.b(1369441907, new q<U, InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.DockedButtonKt$DockedButton$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // Ia.q
                public final r invoke(U u10, InterfaceC1084f interfaceC1084f2, Integer num) {
                    U Button = u10;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    i.e(Button, "$this$Button");
                    if ((iIntValue & 81) == 16 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        TextKt.b(text, null, H.f13499f, G0.a.g(18), null, l.j, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1084f3, 200064, 0, 131026);
                    }
                    return r.f47939a;
                }
            }, c1086gP), c1086gP, ((i12 << 3) & 896) | 805306416, 488);
            c1086gP = c1086gP;
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.ui.dialogs.fakeadapty.DockedButtonKt$DockedButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    DockedButtonKt.a(text, z10, onClick, onDismiss, interfaceC1084f2, b.l(i10 | 1));
                    return r.f47939a;
                }
            };
        }
    }
}
