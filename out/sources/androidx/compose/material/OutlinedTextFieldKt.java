package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: OutlinedTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class OutlinedTextFieldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11778a = 4;

    static {
        G0.a.g(8);
    }

    public static final void a(final androidx.compose.ui.h hVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final Ia.q<? super androidx.compose.ui.h, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, final boolean z10, final float f10, final Ia.l<? super I.h, p293xa.r> lVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5, final androidx.compose.foundation.layout.L l10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        boolean z11;
        C1086g c1086gP = interfaceC1084f.p(-2049536174);
        if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c1086gP.k(qVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c1086gP.k(pVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c1086gP.k(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c1086gP.k(pVar4) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c1086gP.c(z10) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= c1086gP.g(f10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= c1086gP.k(lVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i12 |= c1086gP.k(pVar5) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c1086gP.K(l10) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if (c1086gP.C(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true)) {
            boolean z12 = ((i13 & 14) == 4) | ((234881024 & i12) == 67108864) | ((3670016 & i12) == 1048576) | ((29360128 & i12) == 8388608);
            Object objF = c1086gP.f();
            if (z12 || objF == InterfaceC1084f.a.f12980a) {
                objF = new OutlinedTextFieldMeasurePolicy(lVar, z10, f10, l10);
                c1086gP.E(objF);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objF;
            LayoutDirection layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
            int i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar6 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar6, c1086gP, outlinedTextFieldMeasurePolicy);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar7 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar7, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar8 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                J4.i.d(i15, c1086gP, i15, pVar8);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar9 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar9, c1086gP, hVarC);
            pVar5.invoke(c1086gP, Integer.valueOf((i12 >> 27) & 14));
            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            if (pVar3 != null) {
                c1086gP.L(-978132235);
                androidx.compose.ui.h hVarB = C1171q.b(aVar2, "Leading");
                O0 o10 = InteractiveComponentSizeKt.f11762a;
                androidx.compose.ui.h hVarI = hVarB.i(MinimumInteractiveModifier.f11774b);
                androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                int i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarI);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar6, c1086gP, eD);
                R0.a(pVar7, c1086gP, interfaceC1089h0P2);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
                    J4.i.d(i16, c1086gP, i16, pVar8);
                }
                R0.a(pVar9, c1086gP, hVarC2);
                pVar3.invoke(c1086gP, Integer.valueOf((i12 >> 12) & 14));
                c1086gP.T(true);
                c1086gP.T(false);
            } else {
                c1086gP.L(-977887180);
                c1086gP.T(false);
            }
            if (pVar4 != null) {
                c1086gP.L(-977844493);
                androidx.compose.ui.h hVarB2 = C1171q.b(aVar2, "Trailing");
                O0 o11 = InteractiveComponentSizeKt.f11762a;
                androidx.compose.ui.h hVarI2 = hVarB2.i(MinimumInteractiveModifier.f11774b);
                androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
                int i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarI2);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar6, c1086gP, eD2);
                R0.a(pVar7, c1086gP, interfaceC1089h0P3);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i17))) {
                    J4.i.d(i17, c1086gP, i17, pVar8);
                }
                R0.a(pVar9, c1086gP, hVarC3);
                pVar4.invoke(c1086gP, Integer.valueOf((i12 >> 15) & 14));
                c1086gP.T(true);
                i14 = 0;
                c1086gP.T(false);
            } else {
                i14 = 0;
                c1086gP.L(-977597516);
                c1086gP.T(false);
            }
            float fD = PaddingKt.d(l10, layoutDirection);
            float fC = PaddingKt.c(l10, layoutDirection);
            if (pVar3 != null) {
                fD = Na.l.x(fD - TextFieldImplKt.f11840b, i14);
            }
            androidx.compose.ui.h hVarJ = PaddingKt.j(aVar2, fD, 0.0f, pVar4 != null ? Na.l.x(fC - TextFieldImplKt.f11840b, i14) : fC, 0.0f, 10);
            if (qVar != null) {
                c1086gP.L(-976746535);
                qVar.invoke(C1171q.b(aVar2, "Hint").i(hVarJ), c1086gP, Integer.valueOf((i12 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                c1086gP.T(false);
            } else {
                c1086gP.L(-976659084);
                c1086gP.T(false);
            }
            androidx.compose.ui.h hVarI3 = C1171q.b(aVar2, "TextField").i(hVarJ);
            androidx.compose.ui.f fVar2 = androidx.compose.ui.d.a.f13335a;
            androidx.compose.ui.layout.E eD3 = BoxKt.d(fVar2, true);
            int i18 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarI3);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(pVar6, c1086gP, eD3);
            R0.a(pVar7, c1086gP, interfaceC1089h0P4);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i18))) {
                J4.i.d(i18, c1086gP, i18, pVar8);
            }
            R0.a(pVar9, c1086gP, hVarC4);
            C7.g.b((i12 >> 3) & 14, pVar, c1086gP, true);
            if (pVar2 != null) {
                c1086gP.L(-976429250);
                androidx.compose.ui.h hVarB3 = C1171q.b(aVar2, "Label");
                androidx.compose.ui.layout.E eD4 = BoxKt.d(fVar2, false);
                int i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarB3);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar6, c1086gP, eD4);
                R0.a(pVar7, c1086gP, interfaceC1089h0P5);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i19))) {
                    J4.i.d(i19, c1086gP, i19, pVar8);
                }
                R0.a(pVar9, c1086gP, hVarC5);
                pVar2.invoke(c1086gP, Integer.valueOf((i12 >> 9) & 14));
                z11 = true;
                c1086gP.T(true);
                c1086gP.T(false);
            } else {
                z11 = true;
                c1086gP.L(-976346604);
                c1086gP.T(false);
            }
            c1086gP.T(z11);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    OutlinedTextFieldKt.a(hVar, pVar, qVar, pVar2, pVar3, pVar4, z10, f10, lVar, pVar5, l10, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final int b(int i10, int i11, int i12, int i13, int i14, float f10, long j, float f11, androidx.compose.foundation.layout.L l10) {
        int iMax = Math.max(i12, Math.max(i14, D9.o.o(f10, i13, 0)));
        float fD = l10.d() * f11;
        return p013b0.b.f(Math.max(i10, Math.max(i11, Ka.a.b(D9.o.n(fD, Math.max(fD, i13 / 2.0f), f10) + iMax + (l10.a() * f11)))), j);
    }

    public static final int c(int i10, int i11, int i12, int i13, int i14, float f10, long j, float f11, androidx.compose.foundation.layout.L l10) {
        int iMax = Math.max(i12, Math.max(D9.o.o(f10, i13, 0), i14)) + i10 + i11;
        LayoutDirection layoutDirection = LayoutDirection.f15717b;
        return p013b0.b.g(Math.max(iMax, Ka.a.b((i13 + ((l10.c(layoutDirection) + l10.b(layoutDirection)) * f11)) * f10)), j);
    }
}
