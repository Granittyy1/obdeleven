package com.voltasit.obdeleven.presentation.components;

import Ia.p;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.A;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.l;
import com.voltasit.obdeleven.presentation.e;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: InformationBox.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x011f  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    public static final void a(h hVar, final String text, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        final h hVar2;
        h.a aVar;
        int i13;
        Ia.a<ComposeUiNode> aVar2;
        p<ComposeUiNode, Integer, r> pVar;
        C1086g c1086g;
        C1105p0 c1105p0V;
        i.e(text, "text");
        C1086g c1086gP = interfaceC1084f.p(1203560113);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            if ((i12 & 91) == 18 || !c1086gP.s()) {
                aVar = h.a.f13984b;
                if (i14 != 0) {
                    hVar2 = aVar;
                }
                T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, c1086gP, 0);
                i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                h hVarC = ComposedModifierKt.c(c1086gP, hVar2);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                Painter painterA = U.c.a(com.voltasit.obdeleven.R.drawable.ic_about, c1086gP, 6);
                long j = e.a.f32283f;
                ImageKt.a(painterA, null, null, null, null, 0.0f, new A(5, j), c1086gP, 1572920, 60);
                Lb.a.a(c1086gP, W.q(aVar, 16));
                TextKt.b(text, null, j, 0L, null, l.f15442g, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | 196992, 0, 131034);
                c1086g = c1086gP;
                c1086g.T(true);
                hVar2 = hVar2;
            } else {
                c1086gP.w();
                c1086g = c1086gP;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.InformationBoxKt$InformationBox$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        String str = text;
                        c.a(hVar2, str, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        if ((i12 & 91) == 18) {
            aVar = h.a.f13984b;
            if (i14 != 0) {
                hVar2 = aVar;
            }
            T tA2 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, c1086gP, 0);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            h hVarC2 = ComposedModifierKt.c(c1086gP, hVar2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA2);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            Painter painterA2 = U.c.a(com.voltasit.obdeleven.R.drawable.ic_about, c1086gP, 6);
            long j10 = e.a.f32283f;
            ImageKt.a(painterA2, null, null, null, null, 0.0f, new A(5, j10), c1086gP, 1572920, 60);
            Lb.a.a(c1086gP, W.q(aVar, 16));
            TextKt.b(text, null, j10, 0L, null, l.f15442g, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | 196992, 0, 131034);
            c1086g = c1086gP;
            c1086g.T(true);
            hVar2 = hVar2;
        } else {
            aVar = h.a.f13984b;
            if (i14 != 0) {
                hVar2 = aVar;
            }
            T tA3 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.j, c1086gP, 0);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
            h hVarC3 = ComposedModifierKt.c(c1086gP, hVar2);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA3);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
            Painter painterA3 = U.c.a(com.voltasit.obdeleven.R.drawable.ic_about, c1086gP, 6);
            long j11 = e.a.f32283f;
            ImageKt.a(painterA3, null, null, null, null, 0.0f, new A(5, j11), c1086gP, 1572920, 60);
            Lb.a.a(c1086gP, W.q(aVar, 16));
            TextKt.b(text, null, j11, 0L, null, l.f15442g, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | 196992, 0, 131034);
            c1086g = c1086gP;
            c1086g.T(true);
            hVar2 = hVar2;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.InformationBoxKt$InformationBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    String str = text;
                    c.a(hVar2, str, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
