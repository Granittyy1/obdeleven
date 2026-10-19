package com.voltasit.obdeleven.presentation.components;

import Ia.l;
import Ia.p;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material.C1034j;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.InterfaceC1033i;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.h;
import androidx.compose.ui.node.ComposeUiNode;
import com.voltasit.obdeleven.presentation.e;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class CheckboxKt {
    public static final void a(final String label, final boolean z10, final l<? super Boolean, r> onCheckedChange, InterfaceC1033i interfaceC1033i, androidx.compose.ui.text.font.l lVar, long j, long j10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        InterfaceC1033i interfaceC1033iE;
        androidx.compose.ui.text.font.l lVar2;
        long j11;
        long j12;
        long j13;
        InterfaceC1033i interfaceC1033i2;
        androidx.compose.ui.text.font.l lVar3;
        long j14;
        C1086g c1086g;
        final InterfaceC1033i interfaceC1033i3;
        final androidx.compose.ui.text.font.l lVar4;
        final long j15;
        final long j16;
        i.e(label, "label");
        i.e(onCheckedChange, "onCheckedChange");
        C1086g c1086gP = interfaceC1084f.p(147921685);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(label) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.c(z10) ? 32 : 16;
        }
        int i13 = 256;
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.k(onCheckedChange) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                interfaceC1033iE = interfaceC1033i;
                int i14 = c1086gP.K(interfaceC1033iE) ? 2048 : 1024;
                i12 |= i14;
            } else {
                interfaceC1033iE = interfaceC1033i;
            }
            i12 |= i14;
        } else {
            interfaceC1033iE = interfaceC1033i;
        }
        int i15 = i11 & 16;
        if (i15 != 0) {
            i12 |= 24576;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            if ((57344 & i10) == 0) {
                i12 |= c1086gP.K(lVar2) ? 16384 : 8192;
            }
        }
        int i16 = i11 & 32;
        if (i16 != 0) {
            i12 |= 196608;
            j11 = j;
        } else {
            j11 = j;
            if ((i10 & 458752) == 0) {
                i12 |= c1086gP.i(j11) ? 131072 : 65536;
            }
        }
        int i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
            j12 = j10;
        } else {
            j12 = j10;
            if ((3670016 & i10) == 0) {
                i12 |= c1086gP.i(j12) ? 1048576 : 524288;
            }
        }
        if ((2995931 & i12) == 599186 && c1086gP.s()) {
            c1086gP.w();
            interfaceC1033i3 = interfaceC1033iE;
            c1086g = c1086gP;
            j16 = j12;
            j15 = j11;
            lVar4 = lVar2;
        } else {
            c1086gP.r0();
            if ((i10 & 1) == 0 || c1086gP.a0()) {
                if ((i11 & 8) != 0) {
                    interfaceC1033iE = p111ia.c.e(e.a.f32288l, e.a.f32293q, ((C1034j) c1086gP.x(ColorsKt.f11693a)).d(), e.a.f32289m, c1086gP, 3126, 16);
                    i12 &= -7169;
                }
                androidx.compose.ui.text.font.l lVar5 = i15 != 0 ? androidx.compose.ui.text.font.l.f15442g : lVar;
                long jG = i16 != 0 ? G0.a.g(16) : j;
                if (i17 != 0) {
                    interfaceC1033i2 = interfaceC1033iE;
                    lVar3 = lVar5;
                    j14 = jG;
                    j13 = H.f13504l;
                } else {
                    j13 = j10;
                    interfaceC1033i2 = interfaceC1033iE;
                    lVar3 = lVar5;
                    j14 = jG;
                }
            } else {
                c1086gP.w();
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                }
                interfaceC1033i2 = interfaceC1033iE;
                j13 = j12;
                j14 = j11;
                i13 = 256;
                lVar3 = lVar2;
            }
            c1086gP.U();
            h hVarD = W.d(h.a.f13984b, 1.0f);
            c1086gP.L(2065332864);
            boolean z11 = ((i12 & 896) == i13) | ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32);
            Object objF = c1086gP.f();
            if (z11 || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.a<r>() { // from class: com.voltasit.obdeleven.presentation.components.CheckboxKt$Checkbox$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final r invoke() {
                        onCheckedChange.invoke(Boolean.valueOf(!z10));
                        return r.f47939a;
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            h hVarC = ClickableKt.c(hVarD, false, null, (Ia.a) objF, 7);
            T tA = S.a(C0945e.f10290g, androidx.compose.ui.d.a.j, c1086gP, 6);
            int i18 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            h hVarC2 = ComposedModifierKt.c(c1086gP, hVarC);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, tA);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i18))) {
                J4.i.d(i18, c1086gP, i18, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
            androidx.compose.material.CheckboxKt.a(z10, onCheckedChange, null, false, null, interfaceC1033i2, c1086gP, ((i12 >> 3) & R.styleable.AppCompatTheme_windowNoTitle) | ((i12 << 6) & 458752), 28);
            if (1.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            TextKt.b(label, new LayoutWeightElement(true, Na.l.z(1.0f, Float.MAX_VALUE)), j13, j14, null, lVar3, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, (i12 & 14) | ((i12 >> 12) & 896) | ((i12 >> 6) & 7168) | ((i12 << 3) & 458752), 0, 131024);
            c1086g = c1086gP;
            c1086g.T(true);
            interfaceC1033i3 = interfaceC1033i2;
            lVar4 = lVar3;
            j15 = j14;
            j16 = j13;
        }
        C1105p0 c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p<InterfaceC1084f, Integer, r>() { // from class: com.voltasit.obdeleven.presentation.components.CheckboxKt$Checkbox$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    CheckboxKt.a(label, z10, onCheckedChange, interfaceC1033i3, lVar4, j15, j16, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return r.f47939a;
                }
            };
        }
    }
}
