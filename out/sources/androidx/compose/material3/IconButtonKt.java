package androidx.compose.material3;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: IconButton.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IconButtonKt {
    /* JADX WARN: Code duplicated, block: B:102:0x011d  */
    /* JADX WARN: Code duplicated, block: B:105:0x012e  */
    /* JADX WARN: Code duplicated, block: B:107:0x013a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0171  */
    /* JADX WARN: Code duplicated, block: B:113:0x0183  */
    /* JADX WARN: Code duplicated, block: B:115:0x0187  */
    /* JADX WARN: Code duplicated, block: B:117:0x018c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0190  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a A[PHI: r9 r10 r11 r12 r13
      0x010a: PHI (r9v25 int) = (r9v18 int), (r9v26 int), (r9v27 int) binds: [B:109:0x016f, B:93:0x0107, B:94:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r10v7 androidx.compose.ui.h) = (r10v3 androidx.compose.ui.h), (r10v2 androidx.compose.ui.h), (r10v2 androidx.compose.ui.h) binds: [B:109:0x016f, B:93:0x0107, B:94:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r11v18 boolean) = (r11v7 boolean), (r11v6 boolean), (r11v6 boolean) binds: [B:109:0x016f, B:93:0x0107, B:94:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r12v11 androidx.compose.ui.graphics.l0) = 
      (r12v7 androidx.compose.ui.graphics.l0)
      (r12v6 androidx.compose.ui.graphics.l0)
      (r12v6 androidx.compose.ui.graphics.l0)
     binds: [B:109:0x016f, B:93:0x0107, B:94:0x0109] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r13v7 androidx.compose.material3.L) = (r13v3 androidx.compose.material3.L), (r13v2 androidx.compose.material3.L), (r13v2 androidx.compose.material3.L) binds: [B:109:0x016f, B:93:0x0107, B:94:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    /* JADX WARN: Code duplicated, block: B:99:0x0118  */
    public static final void a(final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, boolean z10, androidx.compose.ui.graphics.l0 l0Var, L l10, androidx.compose.foundation.interaction.k kVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.l0 l0VarA;
        L l11;
        int i15;
        androidx.compose.foundation.interaction.k kVar2;
        int i16;
        int i17;
        androidx.compose.foundation.interaction.k kVar3;
        androidx.compose.ui.h hVar3;
        boolean z12;
        androidx.compose.ui.graphics.l0 l0Var2;
        L l12;
        C1061m c1061m;
        L l13;
        long j;
        long j10;
        final androidx.compose.foundation.interaction.k kVar4;
        final androidx.compose.ui.h hVar4;
        final L l14;
        final boolean z13;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(1594730011);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        l0VarA = l0Var;
                        int i19 = c1086gP.K(l0VarA) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        l0VarA = l0Var;
                    }
                    i12 |= i19;
                } else {
                    l0VarA = l0Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        l11 = l10;
                        int i20 = c1086gP.K(l11) ? 16384 : 8192;
                        i12 |= i20;
                    } else {
                        l11 = l10;
                    }
                    i12 |= i20;
                } else {
                    l11 = l10;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        kVar2 = kVar;
                        if (c1086gP.K(kVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(pVar)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((599187 & i12) == 599186 || !c1086gP.s()) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0 || c1086gP.a0()) {
                            if (i18 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                float f10 = B.m.f1297a;
                                i12 &= -7169;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                            }
                            if ((i11 & 16) != 0) {
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                l13 = c1061m.f12615R;
                                if (l13 == null) {
                                    float f11 = B.m.f1297a;
                                    ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.f12721n;
                                    long jC = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens);
                                    long jA = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens));
                                    ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.f12717i;
                                    l13 = new L(jC, jA, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens2)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens2)));
                                    c1061m.f12615R = l13;
                                }
                                i12 &= -57345;
                                l11 = l13;
                            }
                            if (i15 != 0) {
                                kVar3 = null;
                                hVar3 = hVar2;
                                z12 = z11;
                                l0Var2 = l0VarA;
                                l12 = l11;
                            }
                            c1086gP.U();
                            androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    androidx.compose.ui.semantics.t.k(wVar, 0);
                                    return p293xa.r.f47939a;
                                }
                            });
                            if (z12) {
                                j = l12.f12202a;
                            } else {
                                j = l12.f12204c;
                            }
                            long j11 = j;
                            if (z12) {
                                j10 = l12.f12203b;
                            } else {
                                j10 = l12.f12205d;
                            }
                            SurfaceKt.c(aVar, hVarB, z12, l0Var2, j11, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                                        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                        androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                        int iF = interfaceC1084f3.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                        androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
                            l0VarA = l0Var2;
                            kVar4 = kVar3;
                            hVar4 = hVar3;
                            l14 = l12;
                            z13 = z12;
                        } else {
                            c1086gP.w();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                        }
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                        kVar3 = kVar2;
                        c1086gP.U();
                        androidx.compose.ui.h hVarB2 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.t.k(wVar, 0);
                                return p293xa.r.f47939a;
                            }
                        });
                        if (z12) {
                            j = l12.f12202a;
                        } else {
                            j = l12.f12204c;
                        }
                        long j12 = j;
                        if (z12) {
                            j10 = l12.f12203b;
                        } else {
                            j10 = l12.f12205d;
                        }
                        SurfaceKt.c(aVar, hVarB2, z12, l0Var2, j12, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                                    androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
                        l0VarA = l0Var2;
                        kVar4 = kVar3;
                        hVar4 = hVar3;
                        l14 = l12;
                        z13 = z12;
                    } else {
                        c1086gP.w();
                        hVar4 = hVar2;
                        z13 = z11;
                        l14 = l11;
                        kVar4 = kVar2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final androidx.compose.ui.graphics.l0 l0Var3 = l0VarA;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                IconButtonKt.a(aVar, hVar4, z13, l0Var3, l14, kVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                kVar2 = kVar;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) == 599186) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            float f12 = B.m.f1297a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l13 = c1061m.f12615R;
                            if (l13 == null) {
                                float f13 = B.m.f1297a;
                                ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.f12721n;
                                long jC2 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens3);
                                long jA2 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens3));
                                ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.f12717i;
                                l13 = new L(jC2, jA2, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens4)));
                                c1061m.f12615R = l13;
                            }
                            i12 &= -57345;
                            l11 = l13;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                        } else {
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            float f14 = B.m.f1297a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l13 = c1061m.f12615R;
                            if (l13 == null) {
                                float f15 = B.m.f1297a;
                                ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.f12721n;
                                long jC3 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens5);
                                long jA3 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens5));
                                ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.f12717i;
                                l13 = new L(jC3, jA3, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens6)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens6)));
                                c1061m.f12615R = l13;
                            }
                            i12 &= -57345;
                            l11 = l13;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                        } else {
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    androidx.compose.ui.h hVarB3 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    });
                    if (z12) {
                        j = l12.f12202a;
                    } else {
                        j = l12.f12204c;
                    }
                    long j13 = j;
                    if (z12) {
                        j10 = l12.f12203b;
                    } else {
                        j10 = l12.f12205d;
                    }
                    SurfaceKt.c(aVar, hVarB3, z12, l0Var2, j13, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                                androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
                    l0VarA = l0Var2;
                    kVar4 = kVar3;
                    hVar4 = hVar3;
                    l14 = l12;
                    z13 = z12;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            float f16 = B.m.f1297a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l13 = c1061m.f12615R;
                            if (l13 == null) {
                                float f17 = B.m.f1297a;
                                ColorSchemeKeyTokens colorSchemeKeyTokens7 = ColorSchemeKeyTokens.f12721n;
                                long jC4 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens7);
                                long jA4 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens7));
                                ColorSchemeKeyTokens colorSchemeKeyTokens8 = ColorSchemeKeyTokens.f12717i;
                                l13 = new L(jC4, jA4, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens8)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens8)));
                                c1061m.f12615R = l13;
                            }
                            i12 &= -57345;
                            l11 = l13;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                        } else {
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            float f18 = B.m.f1297a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l13 = c1061m.f12615R;
                            if (l13 == null) {
                                float f19 = B.m.f1297a;
                                ColorSchemeKeyTokens colorSchemeKeyTokens9 = ColorSchemeKeyTokens.f12721n;
                                long jC5 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens9);
                                long jA5 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens9));
                                ColorSchemeKeyTokens colorSchemeKeyTokens10 = ColorSchemeKeyTokens.f12717i;
                                l13 = new L(jC5, jA5, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens10)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens10)));
                                c1061m.f12615R = l13;
                            }
                            i12 &= -57345;
                            l11 = l13;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                        } else {
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    androidx.compose.ui.h hVarB4 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    });
                    if (z12) {
                        j = l12.f12202a;
                    } else {
                        j = l12.f12204c;
                    }
                    long j14 = j;
                    if (z12) {
                        j10 = l12.f12203b;
                    } else {
                        j10 = l12.f12205d;
                    }
                    SurfaceKt.c(aVar, hVarB4, z12, l0Var2, j14, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                                androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
                    l0VarA = l0Var2;
                    kVar4 = kVar3;
                    hVar4 = hVar3;
                    l14 = l12;
                    z13 = z12;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.graphics.l0 l0Var4 = l0VarA;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            IconButtonKt.a(aVar, hVar4, z13, l0Var4, l14, kVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0VarA = l0Var;
                    if (c1086gP.K(l0VarA)) {
                    }
                    i12 |= i19;
                } else {
                    l0VarA = l0Var;
                }
                i12 |= i19;
            } else {
                l0VarA = l0Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    l11 = l10;
                    if (c1086gP.K(l11)) {
                    }
                    i12 |= i20;
                } else {
                    l11 = l10;
                }
                i12 |= i20;
            } else {
                l11 = l10;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    kVar2 = kVar;
                    if (c1086gP.K(kVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) == 599186) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            float f110 = B.m.f1297a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l13 = c1061m.f12615R;
                            if (l13 == null) {
                                float f111 = B.m.f1297a;
                                ColorSchemeKeyTokens colorSchemeKeyTokens11 = ColorSchemeKeyTokens.f12721n;
                                long jC6 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11);
                                long jA6 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11));
                                ColorSchemeKeyTokens colorSchemeKeyTokens12 = ColorSchemeKeyTokens.f12717i;
                                l13 = new L(jC6, jA6, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens12)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens12)));
                                c1061m.f12615R = l13;
                            }
                            i12 &= -57345;
                            l11 = l13;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                        } else {
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            float f112 = B.m.f1297a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l13 = c1061m.f12615R;
                            if (l13 == null) {
                                float f113 = B.m.f1297a;
                                ColorSchemeKeyTokens colorSchemeKeyTokens13 = ColorSchemeKeyTokens.f12721n;
                                long jC7 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens13);
                                long jA7 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens13));
                                ColorSchemeKeyTokens colorSchemeKeyTokens14 = ColorSchemeKeyTokens.f12717i;
                                l13 = new L(jC7, jA7, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens14)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens14)));
                                c1061m.f12615R = l13;
                            }
                            i12 &= -57345;
                            l11 = l13;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                        } else {
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    androidx.compose.ui.h hVarB5 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    });
                    if (z12) {
                        j = l12.f12202a;
                    } else {
                        j = l12.f12204c;
                    }
                    long j15 = j;
                    if (z12) {
                        j10 = l12.f12203b;
                    } else {
                        j10 = l12.f12205d;
                    }
                    SurfaceKt.c(aVar, hVarB5, z12, l0Var2, j15, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                                androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
                    l0VarA = l0Var2;
                    kVar4 = kVar3;
                    hVar4 = hVar3;
                    l14 = l12;
                    z13 = z12;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            float f114 = B.m.f1297a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l13 = c1061m.f12615R;
                            if (l13 == null) {
                                float f115 = B.m.f1297a;
                                ColorSchemeKeyTokens colorSchemeKeyTokens15 = ColorSchemeKeyTokens.f12721n;
                                long jC8 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens15);
                                long jA8 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens15));
                                ColorSchemeKeyTokens colorSchemeKeyTokens16 = ColorSchemeKeyTokens.f12717i;
                                l13 = new L(jC8, jA8, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens16)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens16)));
                                c1061m.f12615R = l13;
                            }
                            i12 &= -57345;
                            l11 = l13;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                        } else {
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            float f116 = B.m.f1297a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l13 = c1061m.f12615R;
                            if (l13 == null) {
                                float f117 = B.m.f1297a;
                                ColorSchemeKeyTokens colorSchemeKeyTokens17 = ColorSchemeKeyTokens.f12721n;
                                long jC9 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens17);
                                long jA9 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens17));
                                ColorSchemeKeyTokens colorSchemeKeyTokens18 = ColorSchemeKeyTokens.f12717i;
                                l13 = new L(jC9, jA9, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens18)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens18)));
                                c1061m.f12615R = l13;
                            }
                            i12 &= -57345;
                            l11 = l13;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                        } else {
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    androidx.compose.ui.h hVarB6 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    });
                    if (z12) {
                        j = l12.f12202a;
                    } else {
                        j = l12.f12204c;
                    }
                    long j16 = j;
                    if (z12) {
                        j10 = l12.f12203b;
                    } else {
                        j10 = l12.f12205d;
                    }
                    SurfaceKt.c(aVar, hVarB6, z12, l0Var2, j16, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                                androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
                    l0VarA = l0Var2;
                    kVar4 = kVar3;
                    hVar4 = hVar3;
                    l14 = l12;
                    z13 = z12;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.graphics.l0 l0Var5 = l0VarA;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            IconButtonKt.a(aVar, hVar4, z13, l0Var5, l14, kVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            kVar2 = kVar;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(pVar)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((599187 & i12) == 599186) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        float f118 = B.m.f1297a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l13 = c1061m.f12615R;
                        if (l13 == null) {
                            float f119 = B.m.f1297a;
                            ColorSchemeKeyTokens colorSchemeKeyTokens19 = ColorSchemeKeyTokens.f12721n;
                            long jC10 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens19);
                            long jA10 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens19));
                            ColorSchemeKeyTokens colorSchemeKeyTokens110 = ColorSchemeKeyTokens.f12717i;
                            l13 = new L(jC10, jA10, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens110)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens110)));
                            c1061m.f12615R = l13;
                        }
                        i12 &= -57345;
                        l11 = l13;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                    } else {
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                        kVar3 = kVar2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        float f1110 = B.m.f1297a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l13 = c1061m.f12615R;
                        if (l13 == null) {
                            float f1111 = B.m.f1297a;
                            ColorSchemeKeyTokens colorSchemeKeyTokens111 = ColorSchemeKeyTokens.f12721n;
                            long jC11 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111);
                            long jA11 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111));
                            ColorSchemeKeyTokens colorSchemeKeyTokens112 = ColorSchemeKeyTokens.f12717i;
                            l13 = new L(jC11, jA11, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens112)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens112)));
                            c1061m.f12615R = l13;
                        }
                        i12 &= -57345;
                        l11 = l13;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                    } else {
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                        kVar3 = kVar2;
                    }
                }
                c1086gP.U();
                androidx.compose.ui.h hVarB7 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                });
                if (z12) {
                    j = l12.f12202a;
                } else {
                    j = l12.f12204c;
                }
                long j17 = j;
                if (z12) {
                    j10 = l12.f12203b;
                } else {
                    j10 = l12.f12205d;
                }
                SurfaceKt.c(aVar, hVarB7, z12, l0Var2, j17, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
                l0VarA = l0Var2;
                kVar4 = kVar3;
                hVar4 = hVar3;
                l14 = l12;
                z13 = z12;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        float f1112 = B.m.f1297a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l13 = c1061m.f12615R;
                        if (l13 == null) {
                            float f1113 = B.m.f1297a;
                            ColorSchemeKeyTokens colorSchemeKeyTokens113 = ColorSchemeKeyTokens.f12721n;
                            long jC12 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens113);
                            long jA12 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens113));
                            ColorSchemeKeyTokens colorSchemeKeyTokens114 = ColorSchemeKeyTokens.f12717i;
                            l13 = new L(jC12, jA12, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens114)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens114)));
                            c1061m.f12615R = l13;
                        }
                        i12 &= -57345;
                        l11 = l13;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                    } else {
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                        kVar3 = kVar2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        float f1114 = B.m.f1297a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l13 = c1061m.f12615R;
                        if (l13 == null) {
                            float f1115 = B.m.f1297a;
                            ColorSchemeKeyTokens colorSchemeKeyTokens115 = ColorSchemeKeyTokens.f12721n;
                            long jC13 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens115);
                            long jA13 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens115));
                            ColorSchemeKeyTokens colorSchemeKeyTokens116 = ColorSchemeKeyTokens.f12717i;
                            l13 = new L(jC13, jA13, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens116)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens116)));
                            c1061m.f12615R = l13;
                        }
                        i12 &= -57345;
                        l11 = l13;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                    } else {
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                        kVar3 = kVar2;
                    }
                }
                c1086gP.U();
                androidx.compose.ui.h hVarB8 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                });
                if (z12) {
                    j = l12.f12202a;
                } else {
                    j = l12.f12204c;
                }
                long j18 = j;
                if (z12) {
                    j10 = l12.f12203b;
                } else {
                    j10 = l12.f12205d;
                }
                SurfaceKt.c(aVar, hVarB8, z12, l0Var2, j18, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
                l0VarA = l0Var2;
                kVar4 = kVar3;
                hVar4 = hVar3;
                l14 = l12;
                z13 = z12;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.graphics.l0 l0Var6 = l0VarA;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        IconButtonKt.a(aVar, hVar4, z13, l0Var6, l14, kVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                if (c1086gP.c(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l0VarA = l0Var;
                    if (c1086gP.K(l0VarA)) {
                    }
                    i12 |= i19;
                } else {
                    l0VarA = l0Var;
                }
                i12 |= i19;
            } else {
                l0VarA = l0Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    l11 = l10;
                    if (c1086gP.K(l11)) {
                    }
                    i12 |= i20;
                } else {
                    l11 = l10;
                }
                i12 |= i20;
            } else {
                l11 = l10;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    kVar2 = kVar;
                    if (c1086gP.K(kVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) == 599186) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            float f1116 = B.m.f1297a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l13 = c1061m.f12615R;
                            if (l13 == null) {
                                float f1117 = B.m.f1297a;
                                ColorSchemeKeyTokens colorSchemeKeyTokens117 = ColorSchemeKeyTokens.f12721n;
                                long jC14 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens117);
                                long jA14 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens117));
                                ColorSchemeKeyTokens colorSchemeKeyTokens118 = ColorSchemeKeyTokens.f12717i;
                                l13 = new L(jC14, jA14, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens118)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens118)));
                                c1061m.f12615R = l13;
                            }
                            i12 &= -57345;
                            l11 = l13;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                        } else {
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            float f1118 = B.m.f1297a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l13 = c1061m.f12615R;
                            if (l13 == null) {
                                float f1119 = B.m.f1297a;
                                ColorSchemeKeyTokens colorSchemeKeyTokens119 = ColorSchemeKeyTokens.f12721n;
                                long jC15 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens119);
                                long jA15 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens119));
                                ColorSchemeKeyTokens colorSchemeKeyTokens1110 = ColorSchemeKeyTokens.f12717i;
                                l13 = new L(jC15, jA15, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1110)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1110)));
                                c1061m.f12615R = l13;
                            }
                            i12 &= -57345;
                            l11 = l13;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                        } else {
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    androidx.compose.ui.h hVarB9 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    });
                    if (z12) {
                        j = l12.f12202a;
                    } else {
                        j = l12.f12204c;
                    }
                    long j19 = j;
                    if (z12) {
                        j10 = l12.f12203b;
                    } else {
                        j10 = l12.f12205d;
                    }
                    SurfaceKt.c(aVar, hVarB9, z12, l0Var2, j19, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                                androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
                    l0VarA = l0Var2;
                    kVar4 = kVar3;
                    hVar4 = hVar3;
                    l14 = l12;
                    z13 = z12;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            float f11110 = B.m.f1297a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l13 = c1061m.f12615R;
                            if (l13 == null) {
                                float f11111 = B.m.f1297a;
                                ColorSchemeKeyTokens colorSchemeKeyTokens1111 = ColorSchemeKeyTokens.f12721n;
                                long jC16 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1111);
                                long jA16 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1111));
                                ColorSchemeKeyTokens colorSchemeKeyTokens1112 = ColorSchemeKeyTokens.f12717i;
                                l13 = new L(jC16, jA16, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1112)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1112)));
                                c1061m.f12615R = l13;
                            }
                            i12 &= -57345;
                            l11 = l13;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                        } else {
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                            kVar3 = kVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            float f11112 = B.m.f1297a;
                            i12 &= -7169;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                        }
                        if ((i11 & 16) != 0) {
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l13 = c1061m.f12615R;
                            if (l13 == null) {
                                float f11113 = B.m.f1297a;
                                ColorSchemeKeyTokens colorSchemeKeyTokens1113 = ColorSchemeKeyTokens.f12721n;
                                long jC17 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1113);
                                long jA17 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1113));
                                ColorSchemeKeyTokens colorSchemeKeyTokens1114 = ColorSchemeKeyTokens.f12717i;
                                l13 = new L(jC17, jA17, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1114)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1114)));
                                c1061m.f12615R = l13;
                            }
                            i12 &= -57345;
                            l11 = l13;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                        } else {
                            hVar3 = hVar2;
                            z12 = z11;
                            l0Var2 = l0VarA;
                            l12 = l11;
                            kVar3 = kVar2;
                        }
                    }
                    c1086gP.U();
                    androidx.compose.ui.h hVarB10 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    });
                    if (z12) {
                        j = l12.f12202a;
                    } else {
                        j = l12.f12204c;
                    }
                    long j110 = j;
                    if (z12) {
                        j10 = l12.f12203b;
                    } else {
                        j10 = l12.f12205d;
                    }
                    SurfaceKt.c(aVar, hVarB10, z12, l0Var2, j110, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                                androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
                    l0VarA = l0Var2;
                    kVar4 = kVar3;
                    hVar4 = hVar3;
                    l14 = l12;
                    z13 = z12;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.graphics.l0 l0Var7 = l0VarA;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            IconButtonKt.a(aVar, hVar4, z13, l0Var7, l14, kVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            kVar2 = kVar;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(pVar)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((599187 & i12) == 599186) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        float f11114 = B.m.f1297a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l13 = c1061m.f12615R;
                        if (l13 == null) {
                            float f11115 = B.m.f1297a;
                            ColorSchemeKeyTokens colorSchemeKeyTokens1115 = ColorSchemeKeyTokens.f12721n;
                            long jC18 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1115);
                            long jA18 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1115));
                            ColorSchemeKeyTokens colorSchemeKeyTokens1116 = ColorSchemeKeyTokens.f12717i;
                            l13 = new L(jC18, jA18, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1116)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1116)));
                            c1061m.f12615R = l13;
                        }
                        i12 &= -57345;
                        l11 = l13;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                    } else {
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                        kVar3 = kVar2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        float f11116 = B.m.f1297a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l13 = c1061m.f12615R;
                        if (l13 == null) {
                            float f11117 = B.m.f1297a;
                            ColorSchemeKeyTokens colorSchemeKeyTokens1117 = ColorSchemeKeyTokens.f12721n;
                            long jC19 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1117);
                            long jA19 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1117));
                            ColorSchemeKeyTokens colorSchemeKeyTokens1118 = ColorSchemeKeyTokens.f12717i;
                            l13 = new L(jC19, jA19, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1118)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1118)));
                            c1061m.f12615R = l13;
                        }
                        i12 &= -57345;
                        l11 = l13;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                    } else {
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                        kVar3 = kVar2;
                    }
                }
                c1086gP.U();
                androidx.compose.ui.h hVarB11 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                });
                if (z12) {
                    j = l12.f12202a;
                } else {
                    j = l12.f12204c;
                }
                long j111 = j;
                if (z12) {
                    j10 = l12.f12203b;
                } else {
                    j10 = l12.f12205d;
                }
                SurfaceKt.c(aVar, hVarB11, z12, l0Var2, j111, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
                l0VarA = l0Var2;
                kVar4 = kVar3;
                hVar4 = hVar3;
                l14 = l12;
                z13 = z12;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        float f11118 = B.m.f1297a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l13 = c1061m.f12615R;
                        if (l13 == null) {
                            float f11119 = B.m.f1297a;
                            ColorSchemeKeyTokens colorSchemeKeyTokens1119 = ColorSchemeKeyTokens.f12721n;
                            long jC110 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1119);
                            long jA110 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens1119));
                            ColorSchemeKeyTokens colorSchemeKeyTokens11110 = ColorSchemeKeyTokens.f12717i;
                            l13 = new L(jC110, jA110, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11110)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11110)));
                            c1061m.f12615R = l13;
                        }
                        i12 &= -57345;
                        l11 = l13;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                    } else {
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                        kVar3 = kVar2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        float f111110 = B.m.f1297a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l13 = c1061m.f12615R;
                        if (l13 == null) {
                            float f111111 = B.m.f1297a;
                            ColorSchemeKeyTokens colorSchemeKeyTokens11111 = ColorSchemeKeyTokens.f12721n;
                            long jC111 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11111);
                            long jA111 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11111));
                            ColorSchemeKeyTokens colorSchemeKeyTokens11112 = ColorSchemeKeyTokens.f12717i;
                            l13 = new L(jC111, jA111, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11112)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11112)));
                            c1061m.f12615R = l13;
                        }
                        i12 &= -57345;
                        l11 = l13;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                    } else {
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                        kVar3 = kVar2;
                    }
                }
                c1086gP.U();
                androidx.compose.ui.h hVarB12 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                });
                if (z12) {
                    j = l12.f12202a;
                } else {
                    j = l12.f12204c;
                }
                long j112 = j;
                if (z12) {
                    j10 = l12.f12203b;
                } else {
                    j10 = l12.f12205d;
                }
                SurfaceKt.c(aVar, hVarB12, z12, l0Var2, j112, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
                l0VarA = l0Var2;
                kVar4 = kVar3;
                hVar4 = hVar3;
                l14 = l12;
                z13 = z12;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.graphics.l0 l0Var8 = l0VarA;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        IconButtonKt.a(aVar, hVar4, z13, l0Var8, l14, kVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                l0VarA = l0Var;
                if (c1086gP.K(l0VarA)) {
                }
                i12 |= i19;
            } else {
                l0VarA = l0Var;
            }
            i12 |= i19;
        } else {
            l0VarA = l0Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                l11 = l10;
                if (c1086gP.K(l11)) {
                }
                i12 |= i20;
            } else {
                l11 = l10;
            }
            i12 |= i20;
        } else {
            l11 = l10;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                kVar2 = kVar;
                if (c1086gP.K(kVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(pVar)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((599187 & i12) == 599186) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        float f111112 = B.m.f1297a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l13 = c1061m.f12615R;
                        if (l13 == null) {
                            float f111113 = B.m.f1297a;
                            ColorSchemeKeyTokens colorSchemeKeyTokens11113 = ColorSchemeKeyTokens.f12721n;
                            long jC112 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11113);
                            long jA112 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11113));
                            ColorSchemeKeyTokens colorSchemeKeyTokens11114 = ColorSchemeKeyTokens.f12717i;
                            l13 = new L(jC112, jA112, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11114)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11114)));
                            c1061m.f12615R = l13;
                        }
                        i12 &= -57345;
                        l11 = l13;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                    } else {
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                        kVar3 = kVar2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        float f111114 = B.m.f1297a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l13 = c1061m.f12615R;
                        if (l13 == null) {
                            float f111115 = B.m.f1297a;
                            ColorSchemeKeyTokens colorSchemeKeyTokens11115 = ColorSchemeKeyTokens.f12721n;
                            long jC113 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11115);
                            long jA113 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11115));
                            ColorSchemeKeyTokens colorSchemeKeyTokens11116 = ColorSchemeKeyTokens.f12717i;
                            l13 = new L(jC113, jA113, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11116)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11116)));
                            c1061m.f12615R = l13;
                        }
                        i12 &= -57345;
                        l11 = l13;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                    } else {
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                        kVar3 = kVar2;
                    }
                }
                c1086gP.U();
                androidx.compose.ui.h hVarB13 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                });
                if (z12) {
                    j = l12.f12202a;
                } else {
                    j = l12.f12204c;
                }
                long j113 = j;
                if (z12) {
                    j10 = l12.f12203b;
                } else {
                    j10 = l12.f12205d;
                }
                SurfaceKt.c(aVar, hVarB13, z12, l0Var2, j113, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
                l0VarA = l0Var2;
                kVar4 = kVar3;
                hVar4 = hVar3;
                l14 = l12;
                z13 = z12;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        float f111116 = B.m.f1297a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l13 = c1061m.f12615R;
                        if (l13 == null) {
                            float f111117 = B.m.f1297a;
                            ColorSchemeKeyTokens colorSchemeKeyTokens11117 = ColorSchemeKeyTokens.f12721n;
                            long jC114 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11117);
                            long jA114 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11117));
                            ColorSchemeKeyTokens colorSchemeKeyTokens11118 = ColorSchemeKeyTokens.f12717i;
                            l13 = new L(jC114, jA114, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11118)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11118)));
                            c1061m.f12615R = l13;
                        }
                        i12 &= -57345;
                        l11 = l13;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                    } else {
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                        kVar3 = kVar2;
                    }
                } else {
                    if (i18 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        float f111118 = B.m.f1297a;
                        i12 &= -7169;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                    }
                    if ((i11 & 16) != 0) {
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l13 = c1061m.f12615R;
                        if (l13 == null) {
                            float f111119 = B.m.f1297a;
                            ColorSchemeKeyTokens colorSchemeKeyTokens11119 = ColorSchemeKeyTokens.f12721n;
                            long jC115 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11119);
                            long jA115 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens11119));
                            ColorSchemeKeyTokens colorSchemeKeyTokens111110 = ColorSchemeKeyTokens.f12717i;
                            l13 = new L(jC115, jA115, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111110)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111110)));
                            c1061m.f12615R = l13;
                        }
                        i12 &= -57345;
                        l11 = l13;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                    } else {
                        hVar3 = hVar2;
                        z12 = z11;
                        l0Var2 = l0VarA;
                        l12 = l11;
                        kVar3 = kVar2;
                    }
                }
                c1086gP.U();
                androidx.compose.ui.h hVarB14 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                });
                if (z12) {
                    j = l12.f12202a;
                } else {
                    j = l12.f12204c;
                }
                long j114 = j;
                if (z12) {
                    j10 = l12.f12203b;
                } else {
                    j10 = l12.f12205d;
                }
                SurfaceKt.c(aVar, hVarB14, z12, l0Var2, j114, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                            interfaceC1084f3.w();
                        } else {
                            androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
                l0VarA = l0Var2;
                kVar4 = kVar3;
                hVar4 = hVar3;
                l14 = l12;
                z13 = z12;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.graphics.l0 l0Var9 = l0VarA;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        IconButtonKt.a(aVar, hVar4, z13, l0Var9, l14, kVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 196608;
        kVar2 = kVar;
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c1086gP.k(pVar)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        }
        if ((599187 & i12) == 599186) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    float f1111110 = B.m.f1297a;
                    i12 &= -7169;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                }
                if ((i11 & 16) != 0) {
                    c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                    l13 = c1061m.f12615R;
                    if (l13 == null) {
                        float f1111111 = B.m.f1297a;
                        ColorSchemeKeyTokens colorSchemeKeyTokens111111 = ColorSchemeKeyTokens.f12721n;
                        long jC116 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111111);
                        long jA116 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111111));
                        ColorSchemeKeyTokens colorSchemeKeyTokens111112 = ColorSchemeKeyTokens.f12717i;
                        l13 = new L(jC116, jA116, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111112)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111112)));
                        c1061m.f12615R = l13;
                    }
                    i12 &= -57345;
                    l11 = l13;
                }
                if (i15 != 0) {
                    kVar3 = null;
                    hVar3 = hVar2;
                    z12 = z11;
                    l0Var2 = l0VarA;
                    l12 = l11;
                } else {
                    hVar3 = hVar2;
                    z12 = z11;
                    l0Var2 = l0VarA;
                    l12 = l11;
                    kVar3 = kVar2;
                }
            } else {
                if (i18 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    float f1111112 = B.m.f1297a;
                    i12 &= -7169;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                }
                if ((i11 & 16) != 0) {
                    c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                    l13 = c1061m.f12615R;
                    if (l13 == null) {
                        float f1111113 = B.m.f1297a;
                        ColorSchemeKeyTokens colorSchemeKeyTokens111113 = ColorSchemeKeyTokens.f12721n;
                        long jC117 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111113);
                        long jA117 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111113));
                        ColorSchemeKeyTokens colorSchemeKeyTokens111114 = ColorSchemeKeyTokens.f12717i;
                        l13 = new L(jC117, jA117, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111114)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111114)));
                        c1061m.f12615R = l13;
                    }
                    i12 &= -57345;
                    l11 = l13;
                }
                if (i15 != 0) {
                    kVar3 = null;
                    hVar3 = hVar2;
                    z12 = z11;
                    l0Var2 = l0VarA;
                    l12 = l11;
                } else {
                    hVar3 = hVar2;
                    z12 = z11;
                    l0Var2 = l0VarA;
                    l12 = l11;
                    kVar3 = kVar2;
                }
            }
            c1086gP.U();
            androidx.compose.ui.h hVarB15 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                    androidx.compose.ui.semantics.t.k(wVar, 0);
                    return p293xa.r.f47939a;
                }
            });
            if (z12) {
                j = l12.f12202a;
            } else {
                j = l12.f12204c;
            }
            long j115 = j;
            if (z12) {
                j10 = l12.f12203b;
            } else {
                j10 = l12.f12205d;
            }
            SurfaceKt.c(aVar, hVarB15, z12, l0Var2, j115, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                        androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
            l0VarA = l0Var2;
            kVar4 = kVar3;
            hVar4 = hVar3;
            l14 = l12;
            z13 = z12;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    float f1111114 = B.m.f1297a;
                    i12 &= -7169;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                }
                if ((i11 & 16) != 0) {
                    c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                    l13 = c1061m.f12615R;
                    if (l13 == null) {
                        float f1111115 = B.m.f1297a;
                        ColorSchemeKeyTokens colorSchemeKeyTokens111115 = ColorSchemeKeyTokens.f12721n;
                        long jC118 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111115);
                        long jA118 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111115));
                        ColorSchemeKeyTokens colorSchemeKeyTokens111116 = ColorSchemeKeyTokens.f12717i;
                        l13 = new L(jC118, jA118, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111116)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111116)));
                        c1061m.f12615R = l13;
                    }
                    i12 &= -57345;
                    l11 = l13;
                }
                if (i15 != 0) {
                    kVar3 = null;
                    hVar3 = hVar2;
                    z12 = z11;
                    l0Var2 = l0VarA;
                    l12 = l11;
                } else {
                    hVar3 = hVar2;
                    z12 = z11;
                    l0Var2 = l0VarA;
                    l12 = l11;
                    kVar3 = kVar2;
                }
            } else {
                if (i18 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    float f1111116 = B.m.f1297a;
                    i12 &= -7169;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP);
                }
                if ((i11 & 16) != 0) {
                    c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                    l13 = c1061m.f12615R;
                    if (l13 == null) {
                        float f1111117 = B.m.f1297a;
                        ColorSchemeKeyTokens colorSchemeKeyTokens111117 = ColorSchemeKeyTokens.f12721n;
                        long jC119 = ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111117);
                        long jA119 = ColorSchemeKt.a(c1061m, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111117));
                        ColorSchemeKeyTokens colorSchemeKeyTokens111118 = ColorSchemeKeyTokens.f12717i;
                        l13 = new L(jC119, jA119, androidx.compose.ui.graphics.H.b(0.12f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111118)), androidx.compose.ui.graphics.H.b(0.38f, ColorSchemeKt.c(c1061m, colorSchemeKeyTokens111118)));
                        c1061m.f12615R = l13;
                    }
                    i12 &= -57345;
                    l11 = l13;
                }
                if (i15 != 0) {
                    kVar3 = null;
                    hVar3 = hVar2;
                    z12 = z11;
                    l0Var2 = l0VarA;
                    l12 = l11;
                } else {
                    hVar3 = hVar2;
                    z12 = z11;
                    l0Var2 = l0VarA;
                    l12 = l11;
                    kVar3 = kVar2;
                }
            }
            c1086gP.U();
            androidx.compose.ui.h hVarB16 = androidx.compose.ui.semantics.p.b(hVar3, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                    androidx.compose.ui.semantics.t.k(wVar, 0);
                    return p293xa.r.f47939a;
                }
            });
            if (z12) {
                j = l12.f12202a;
            } else {
                j = l12.f12204c;
            }
            long j116 = j;
            if (z12) {
                j10 = l12.f12203b;
            } else {
                j10 = l12.f12205d;
            }
            SurfaceKt.c(aVar, hVarB16, z12, l0Var2, j116, j10, 0.0f, 0.0f, null, kVar3, androidx.compose.runtime.internal.a.b(-1560623888, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    if ((num.intValue() & 3) == 2 && interfaceC1084f3.s()) {
                        interfaceC1084f3.w();
                    } else {
                        androidx.compose.ui.h hVarN = androidx.compose.foundation.layout.W.n(B.m.f1298b, B.m.f1297a, androidx.compose.ui.h.a.f13984b);
                        androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar2 = pVar;
                        androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarN);
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
                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f3, eD);
                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f3, interfaceC1089h0Z);
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        androidx.compose.foundation.gestures.d.c(pVar2, interfaceC1084f3, 0);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i12 & 8078) | ((i12 << 12) & 1879048192), 448);
            l0VarA = l0Var2;
            kVar4 = kVar3;
            hVar4 = hVar3;
            l14 = l12;
            z13 = z12;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.graphics.l0 l0Var10 = l0VarA;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$FilledIconButton$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    IconButtonKt.a(aVar, hVar4, z13, l0Var10, l14, kVar4, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016a  */
    /* JADX WARN: Code duplicated, block: B:103:0x018a  */
    /* JADX WARN: Code duplicated, block: B:104:0x018d  */
    /* JADX WARN: Code duplicated, block: B:107:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:121:0x021d  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x011a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0137  */
    /* JADX WARN: Code duplicated, block: B:94:0x013b  */
    /* JADX WARN: Code duplicated, block: B:96:0x015d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0162  */
    public static final void b(final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, boolean z10, L l10, androidx.compose.foundation.interaction.k kVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        boolean z11;
        int i14;
        L l11;
        int i15;
        androidx.compose.foundation.interaction.k kVar2;
        int i16;
        int i17;
        L l12;
        int i18;
        final L l13;
        androidx.compose.ui.h hVar3;
        long j;
        C1061m c1061m;
        long j10;
        int i19;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar2;
        long j11;
        final androidx.compose.foundation.interaction.k kVar3;
        final androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-1142896114);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 48) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    z11 = z10;
                    if (c1086gP.c(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        l11 = l10;
                        int i21 = c1086gP.K(l11) ? 2048 : 1024;
                        i12 |= i21;
                    } else {
                        l11 = l10;
                    }
                    i12 |= i21;
                } else {
                    l11 = l10;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        kVar2 = kVar;
                        if (c1086gP.K(kVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(pVar)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                    if ((74899 & i12) == 74898 || !c1086gP.s()) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0 || c1086gP.a0()) {
                            if (i20 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                c1086gP.L(-1519621781);
                                j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                                c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                                l12 = c1061m.f12614Q;
                                if (l12 == null) {
                                    long j12 = androidx.compose.ui.graphics.H.f13503k;
                                    l12 = new L(j12, j, j12, androidx.compose.ui.graphics.H.b(0.38f, j));
                                    c1061m.f12614Q = l12;
                                }
                                if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                                    c1086gP.T(false);
                                } else {
                                    L lA = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                                    c1086gP = c1086gP;
                                    c1086gP.T(false);
                                    l12 = lA;
                                }
                                i12 &= -7169;
                            } else {
                                l12 = l11;
                            }
                            if (i15 != 0) {
                                kVar2 = null;
                            }
                            i18 = i12;
                            l13 = l12;
                            hVar3 = hVar2;
                        } else {
                            c1086gP.w();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            i18 = i12;
                            hVar3 = hVar2;
                            z11 = z11;
                            l13 = l11;
                        }
                        c1086gP.U();
                        O0 o10 = InteractiveComponentSizeKt.f12188a;
                        androidx.compose.ui.h hVarI = hVar3.i(MinimumInteractiveModifier.f12219b);
                        float f10 = B.n.f1300b;
                        androidx.compose.ui.h hVarR = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI, f10), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
                        if (z11) {
                            j10 = l13.f12202a;
                        } else {
                            j10 = l13.f12204c;
                        }
                        androidx.compose.ui.h hVarB = ClickableKt.b(C0932d.b(hVarR, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f10 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                        i19 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarB);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                        pVar2 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i19))) {
                            J4.i.d(i19, c1086gP, i19, pVar2);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                        if (z11) {
                            j11 = l13.f12203b;
                        } else {
                            j11 = l13.f12205d;
                        }
                        CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                        c1086gP.T(true);
                        z11 = z11;
                        kVar3 = kVar2;
                        hVar4 = hVar3;
                    } else {
                        c1086gP.w();
                        kVar3 = kVar2;
                        hVar4 = hVar2;
                        l13 = l11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final boolean z12 = z11;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                IconButtonKt.b(aVar, hVar4, z12, l13, kVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                kVar2 = kVar;
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(pVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((74899 & i12) == 74898) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c1086gP.L(-1519621781);
                            j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l12 = c1061m.f12614Q;
                            if (l12 == null) {
                                long j13 = androidx.compose.ui.graphics.H.f13503k;
                                l12 = new L(j13, j, j13, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1061m.f12614Q = l12;
                            }
                            if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                                c1086gP.T(false);
                            } else {
                                L lA2 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1086gP = c1086gP;
                                c1086gP.T(false);
                                l12 = lA2;
                            }
                            i12 &= -7169;
                        } else {
                            l12 = l11;
                        }
                        if (i15 != 0) {
                            kVar2 = null;
                        }
                        i18 = i12;
                        l13 = l12;
                        hVar3 = hVar2;
                    } else {
                        if (i20 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c1086gP.L(-1519621781);
                            j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l12 = c1061m.f12614Q;
                            if (l12 == null) {
                                long j14 = androidx.compose.ui.graphics.H.f13503k;
                                l12 = new L(j14, j, j14, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1061m.f12614Q = l12;
                            }
                            if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                                c1086gP.T(false);
                            } else {
                                L lA3 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1086gP = c1086gP;
                                c1086gP.T(false);
                                l12 = lA3;
                            }
                            i12 &= -7169;
                        } else {
                            l12 = l11;
                        }
                        if (i15 != 0) {
                            kVar2 = null;
                        }
                        i18 = i12;
                        l13 = l12;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    O0 o11 = InteractiveComponentSizeKt.f12188a;
                    androidx.compose.ui.h hVarI2 = hVar3.i(MinimumInteractiveModifier.f12219b);
                    float f11 = B.n.f1300b;
                    androidx.compose.ui.h hVarR2 = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI2, f11), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
                    if (z11) {
                        j10 = l13.f12202a;
                    } else {
                        j10 = l13.f12204c;
                    }
                    androidx.compose.ui.h hVarB2 = ClickableKt.b(C0932d.b(hVarR2, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f11 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
                    androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                    androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarB2);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD2);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar2);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                    if (z11) {
                        j11 = l13.f12203b;
                    } else {
                        j11 = l13.f12205d;
                    }
                    CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    c1086gP.T(true);
                    z11 = z11;
                    kVar3 = kVar2;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c1086gP.L(-1519621781);
                            j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l12 = c1061m.f12614Q;
                            if (l12 == null) {
                                long j15 = androidx.compose.ui.graphics.H.f13503k;
                                l12 = new L(j15, j, j15, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1061m.f12614Q = l12;
                            }
                            if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                                c1086gP.T(false);
                            } else {
                                L lA4 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1086gP = c1086gP;
                                c1086gP.T(false);
                                l12 = lA4;
                            }
                            i12 &= -7169;
                        } else {
                            l12 = l11;
                        }
                        if (i15 != 0) {
                            kVar2 = null;
                        }
                        i18 = i12;
                        l13 = l12;
                        hVar3 = hVar2;
                    } else {
                        if (i20 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c1086gP.L(-1519621781);
                            j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l12 = c1061m.f12614Q;
                            if (l12 == null) {
                                long j16 = androidx.compose.ui.graphics.H.f13503k;
                                l12 = new L(j16, j, j16, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1061m.f12614Q = l12;
                            }
                            if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                                c1086gP.T(false);
                            } else {
                                L lA5 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1086gP = c1086gP;
                                c1086gP.T(false);
                                l12 = lA5;
                            }
                            i12 &= -7169;
                        } else {
                            l12 = l11;
                        }
                        if (i15 != 0) {
                            kVar2 = null;
                        }
                        i18 = i12;
                        l13 = l12;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    O0 o12 = InteractiveComponentSizeKt.f12188a;
                    androidx.compose.ui.h hVarI3 = hVar3.i(MinimumInteractiveModifier.f12219b);
                    float f12 = B.n.f1300b;
                    androidx.compose.ui.h hVarR3 = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI3, f12), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
                    if (z11) {
                        j10 = l13.f12202a;
                    } else {
                        j10 = l13.f12204c;
                    }
                    androidx.compose.ui.h hVarB3 = ClickableKt.b(C0932d.b(hVarR3, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f12 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
                    androidx.compose.ui.layout.E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarB3);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD3);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar2);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                    if (z11) {
                        j11 = l13.f12203b;
                    } else {
                        j11 = l13.f12205d;
                    }
                    CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    c1086gP.T(true);
                    z11 = z11;
                    kVar3 = kVar2;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z13 = z11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            IconButtonKt.b(aVar, hVar4, z13, l13, kVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l11 = l10;
                    if (c1086gP.K(l11)) {
                    }
                    i12 |= i21;
                } else {
                    l11 = l10;
                }
                i12 |= i21;
            } else {
                l11 = l10;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    kVar2 = kVar;
                    if (c1086gP.K(kVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(pVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((74899 & i12) == 74898) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c1086gP.L(-1519621781);
                            j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l12 = c1061m.f12614Q;
                            if (l12 == null) {
                                long j17 = androidx.compose.ui.graphics.H.f13503k;
                                l12 = new L(j17, j, j17, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1061m.f12614Q = l12;
                            }
                            if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                                c1086gP.T(false);
                            } else {
                                L lA6 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1086gP = c1086gP;
                                c1086gP.T(false);
                                l12 = lA6;
                            }
                            i12 &= -7169;
                        } else {
                            l12 = l11;
                        }
                        if (i15 != 0) {
                            kVar2 = null;
                        }
                        i18 = i12;
                        l13 = l12;
                        hVar3 = hVar2;
                    } else {
                        if (i20 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c1086gP.L(-1519621781);
                            j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l12 = c1061m.f12614Q;
                            if (l12 == null) {
                                long j18 = androidx.compose.ui.graphics.H.f13503k;
                                l12 = new L(j18, j, j18, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1061m.f12614Q = l12;
                            }
                            if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                                c1086gP.T(false);
                            } else {
                                L lA7 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1086gP = c1086gP;
                                c1086gP.T(false);
                                l12 = lA7;
                            }
                            i12 &= -7169;
                        } else {
                            l12 = l11;
                        }
                        if (i15 != 0) {
                            kVar2 = null;
                        }
                        i18 = i12;
                        l13 = l12;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    O0 o13 = InteractiveComponentSizeKt.f12188a;
                    androidx.compose.ui.h hVarI4 = hVar3.i(MinimumInteractiveModifier.f12219b);
                    float f13 = B.n.f1300b;
                    androidx.compose.ui.h hVarR4 = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI4, f13), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
                    if (z11) {
                        j10 = l13.f12202a;
                    } else {
                        j10 = l13.f12204c;
                    }
                    androidx.compose.ui.h hVarB4 = ClickableKt.b(C0932d.b(hVarR4, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f13 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
                    androidx.compose.ui.layout.E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                    androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarB4);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD4);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar2);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                    if (z11) {
                        j11 = l13.f12203b;
                    } else {
                        j11 = l13.f12205d;
                    }
                    CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    c1086gP.T(true);
                    z11 = z11;
                    kVar3 = kVar2;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c1086gP.L(-1519621781);
                            j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l12 = c1061m.f12614Q;
                            if (l12 == null) {
                                long j19 = androidx.compose.ui.graphics.H.f13503k;
                                l12 = new L(j19, j, j19, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1061m.f12614Q = l12;
                            }
                            if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                                c1086gP.T(false);
                            } else {
                                L lA8 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1086gP = c1086gP;
                                c1086gP.T(false);
                                l12 = lA8;
                            }
                            i12 &= -7169;
                        } else {
                            l12 = l11;
                        }
                        if (i15 != 0) {
                            kVar2 = null;
                        }
                        i18 = i12;
                        l13 = l12;
                        hVar3 = hVar2;
                    } else {
                        if (i20 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c1086gP.L(-1519621781);
                            j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l12 = c1061m.f12614Q;
                            if (l12 == null) {
                                long j110 = androidx.compose.ui.graphics.H.f13503k;
                                l12 = new L(j110, j, j110, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1061m.f12614Q = l12;
                            }
                            if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                                c1086gP.T(false);
                            } else {
                                L lA9 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1086gP = c1086gP;
                                c1086gP.T(false);
                                l12 = lA9;
                            }
                            i12 &= -7169;
                        } else {
                            l12 = l11;
                        }
                        if (i15 != 0) {
                            kVar2 = null;
                        }
                        i18 = i12;
                        l13 = l12;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    O0 o14 = InteractiveComponentSizeKt.f12188a;
                    androidx.compose.ui.h hVarI5 = hVar3.i(MinimumInteractiveModifier.f12219b);
                    float f14 = B.n.f1300b;
                    androidx.compose.ui.h hVarR5 = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI5, f14), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
                    if (z11) {
                        j10 = l13.f12202a;
                    } else {
                        j10 = l13.f12204c;
                    }
                    androidx.compose.ui.h hVarB5 = ClickableKt.b(C0932d.b(hVarR5, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f14 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
                    androidx.compose.ui.layout.E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                    androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarB5);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD5);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar2);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                    if (z11) {
                        j11 = l13.f12203b;
                    } else {
                        j11 = l13.f12205d;
                    }
                    CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    c1086gP.T(true);
                    z11 = z11;
                    kVar3 = kVar2;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z14 = z11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            IconButtonKt.b(aVar, hVar4, z14, l13, kVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            kVar2 = kVar;
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(pVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((74899 & i12) == 74898) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c1086gP.L(-1519621781);
                        j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l12 = c1061m.f12614Q;
                        if (l12 == null) {
                            long j111 = androidx.compose.ui.graphics.H.f13503k;
                            l12 = new L(j111, j, j111, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1061m.f12614Q = l12;
                        }
                        if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                            c1086gP.T(false);
                        } else {
                            L lA10 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1086gP = c1086gP;
                            c1086gP.T(false);
                            l12 = lA10;
                        }
                        i12 &= -7169;
                    } else {
                        l12 = l11;
                    }
                    if (i15 != 0) {
                        kVar2 = null;
                    }
                    i18 = i12;
                    l13 = l12;
                    hVar3 = hVar2;
                } else {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c1086gP.L(-1519621781);
                        j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l12 = c1061m.f12614Q;
                        if (l12 == null) {
                            long j112 = androidx.compose.ui.graphics.H.f13503k;
                            l12 = new L(j112, j, j112, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1061m.f12614Q = l12;
                        }
                        if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                            c1086gP.T(false);
                        } else {
                            L lA11 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1086gP = c1086gP;
                            c1086gP.T(false);
                            l12 = lA11;
                        }
                        i12 &= -7169;
                    } else {
                        l12 = l11;
                    }
                    if (i15 != 0) {
                        kVar2 = null;
                    }
                    i18 = i12;
                    l13 = l12;
                    hVar3 = hVar2;
                }
                c1086gP.U();
                O0 o15 = InteractiveComponentSizeKt.f12188a;
                androidx.compose.ui.h hVarI6 = hVar3.i(MinimumInteractiveModifier.f12219b);
                float f15 = B.n.f1300b;
                androidx.compose.ui.h hVarR6 = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI6, f15), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
                if (z11) {
                    j10 = l13.f12202a;
                } else {
                    j10 = l13.f12204c;
                }
                androidx.compose.ui.h hVarB6 = ClickableKt.b(C0932d.b(hVarR6, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f15 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
                androidx.compose.ui.layout.E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarB6);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD6);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
                if (z11) {
                    j11 = l13.f12203b;
                } else {
                    j11 = l13.f12205d;
                }
                CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                c1086gP.T(true);
                z11 = z11;
                kVar3 = kVar2;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c1086gP.L(-1519621781);
                        j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l12 = c1061m.f12614Q;
                        if (l12 == null) {
                            long j113 = androidx.compose.ui.graphics.H.f13503k;
                            l12 = new L(j113, j, j113, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1061m.f12614Q = l12;
                        }
                        if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                            c1086gP.T(false);
                        } else {
                            L lA12 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1086gP = c1086gP;
                            c1086gP.T(false);
                            l12 = lA12;
                        }
                        i12 &= -7169;
                    } else {
                        l12 = l11;
                    }
                    if (i15 != 0) {
                        kVar2 = null;
                    }
                    i18 = i12;
                    l13 = l12;
                    hVar3 = hVar2;
                } else {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c1086gP.L(-1519621781);
                        j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l12 = c1061m.f12614Q;
                        if (l12 == null) {
                            long j114 = androidx.compose.ui.graphics.H.f13503k;
                            l12 = new L(j114, j, j114, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1061m.f12614Q = l12;
                        }
                        if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                            c1086gP.T(false);
                        } else {
                            L lA13 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1086gP = c1086gP;
                            c1086gP.T(false);
                            l12 = lA13;
                        }
                        i12 &= -7169;
                    } else {
                        l12 = l11;
                    }
                    if (i15 != 0) {
                        kVar2 = null;
                    }
                    i18 = i12;
                    l13 = l12;
                    hVar3 = hVar2;
                }
                c1086gP.U();
                O0 o16 = InteractiveComponentSizeKt.f12188a;
                androidx.compose.ui.h hVarI7 = hVar3.i(MinimumInteractiveModifier.f12219b);
                float f16 = B.n.f1300b;
                androidx.compose.ui.h hVarR7 = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI7, f16), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
                if (z11) {
                    j10 = l13.f12202a;
                } else {
                    j10 = l13.f12204c;
                }
                androidx.compose.ui.h hVarB7 = ClickableKt.b(C0932d.b(hVarR7, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f16 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
                androidx.compose.ui.layout.E eD7 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarB7);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD7);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
                if (z11) {
                    j11 = l13.f12203b;
                } else {
                    j11 = l13.f12205d;
                }
                CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                c1086gP.T(true);
                z11 = z11;
                kVar3 = kVar2;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z15 = z11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        IconButtonKt.b(aVar, hVar4, z15, l13, kVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                z11 = z10;
                if (c1086gP.c(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    l11 = l10;
                    if (c1086gP.K(l11)) {
                    }
                    i12 |= i21;
                } else {
                    l11 = l10;
                }
                i12 |= i21;
            } else {
                l11 = l10;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    kVar2 = kVar;
                    if (c1086gP.K(kVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    i12 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(pVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((74899 & i12) == 74898) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c1086gP.L(-1519621781);
                            j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l12 = c1061m.f12614Q;
                            if (l12 == null) {
                                long j115 = androidx.compose.ui.graphics.H.f13503k;
                                l12 = new L(j115, j, j115, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1061m.f12614Q = l12;
                            }
                            if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                                c1086gP.T(false);
                            } else {
                                L lA14 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1086gP = c1086gP;
                                c1086gP.T(false);
                                l12 = lA14;
                            }
                            i12 &= -7169;
                        } else {
                            l12 = l11;
                        }
                        if (i15 != 0) {
                            kVar2 = null;
                        }
                        i18 = i12;
                        l13 = l12;
                        hVar3 = hVar2;
                    } else {
                        if (i20 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c1086gP.L(-1519621781);
                            j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l12 = c1061m.f12614Q;
                            if (l12 == null) {
                                long j116 = androidx.compose.ui.graphics.H.f13503k;
                                l12 = new L(j116, j, j116, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1061m.f12614Q = l12;
                            }
                            if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                                c1086gP.T(false);
                            } else {
                                L lA15 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1086gP = c1086gP;
                                c1086gP.T(false);
                                l12 = lA15;
                            }
                            i12 &= -7169;
                        } else {
                            l12 = l11;
                        }
                        if (i15 != 0) {
                            kVar2 = null;
                        }
                        i18 = i12;
                        l13 = l12;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    O0 o17 = InteractiveComponentSizeKt.f12188a;
                    androidx.compose.ui.h hVarI8 = hVar3.i(MinimumInteractiveModifier.f12219b);
                    float f17 = B.n.f1300b;
                    androidx.compose.ui.h hVarR8 = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI8, f17), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
                    if (z11) {
                        j10 = l13.f12202a;
                    } else {
                        j10 = l13.f12204c;
                    }
                    androidx.compose.ui.h hVarB8 = ClickableKt.b(C0932d.b(hVarR8, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f17 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
                    androidx.compose.ui.layout.E eD8 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                    androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarB8);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD8);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P8);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar2);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC8);
                    if (z11) {
                        j11 = l13.f12203b;
                    } else {
                        j11 = l13.f12205d;
                    }
                    CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    c1086gP.T(true);
                    z11 = z11;
                    kVar3 = kVar2;
                    hVar4 = hVar3;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c1086gP.L(-1519621781);
                            j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l12 = c1061m.f12614Q;
                            if (l12 == null) {
                                long j117 = androidx.compose.ui.graphics.H.f13503k;
                                l12 = new L(j117, j, j117, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1061m.f12614Q = l12;
                            }
                            if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                                c1086gP.T(false);
                            } else {
                                L lA16 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1086gP = c1086gP;
                                c1086gP.T(false);
                                l12 = lA16;
                            }
                            i12 &= -7169;
                        } else {
                            l12 = l11;
                        }
                        if (i15 != 0) {
                            kVar2 = null;
                        }
                        i18 = i12;
                        l13 = l12;
                        hVar3 = hVar2;
                    } else {
                        if (i20 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            c1086gP.L(-1519621781);
                            j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                            c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                            l12 = c1061m.f12614Q;
                            if (l12 == null) {
                                long j118 = androidx.compose.ui.graphics.H.f13503k;
                                l12 = new L(j118, j, j118, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1061m.f12614Q = l12;
                            }
                            if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                                c1086gP.T(false);
                            } else {
                                L lA17 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                                c1086gP = c1086gP;
                                c1086gP.T(false);
                                l12 = lA17;
                            }
                            i12 &= -7169;
                        } else {
                            l12 = l11;
                        }
                        if (i15 != 0) {
                            kVar2 = null;
                        }
                        i18 = i12;
                        l13 = l12;
                        hVar3 = hVar2;
                    }
                    c1086gP.U();
                    O0 o18 = InteractiveComponentSizeKt.f12188a;
                    androidx.compose.ui.h hVarI9 = hVar3.i(MinimumInteractiveModifier.f12219b);
                    float f18 = B.n.f1300b;
                    androidx.compose.ui.h hVarR9 = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI9, f18), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
                    if (z11) {
                        j10 = l13.f12202a;
                    } else {
                        j10 = l13.f12204c;
                    }
                    androidx.compose.ui.h hVarB9 = ClickableKt.b(C0932d.b(hVarR9, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f18 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
                    androidx.compose.ui.layout.E eD9 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                    androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVarB9);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD9);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P9);
                    pVar2 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar2);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar2);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC9);
                    if (z11) {
                        j11 = l13.f12203b;
                    } else {
                        j11 = l13.f12205d;
                    }
                    CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                    c1086gP.T(true);
                    z11 = z11;
                    kVar3 = kVar2;
                    hVar4 = hVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final boolean z16 = z11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            IconButtonKt.b(aVar, hVar4, z16, l13, kVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            kVar2 = kVar;
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(pVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((74899 & i12) == 74898) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c1086gP.L(-1519621781);
                        j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l12 = c1061m.f12614Q;
                        if (l12 == null) {
                            long j119 = androidx.compose.ui.graphics.H.f13503k;
                            l12 = new L(j119, j, j119, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1061m.f12614Q = l12;
                        }
                        if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                            c1086gP.T(false);
                        } else {
                            L lA18 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1086gP = c1086gP;
                            c1086gP.T(false);
                            l12 = lA18;
                        }
                        i12 &= -7169;
                    } else {
                        l12 = l11;
                    }
                    if (i15 != 0) {
                        kVar2 = null;
                    }
                    i18 = i12;
                    l13 = l12;
                    hVar3 = hVar2;
                } else {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c1086gP.L(-1519621781);
                        j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l12 = c1061m.f12614Q;
                        if (l12 == null) {
                            long j1110 = androidx.compose.ui.graphics.H.f13503k;
                            l12 = new L(j1110, j, j1110, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1061m.f12614Q = l12;
                        }
                        if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                            c1086gP.T(false);
                        } else {
                            L lA19 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1086gP = c1086gP;
                            c1086gP.T(false);
                            l12 = lA19;
                        }
                        i12 &= -7169;
                    } else {
                        l12 = l11;
                    }
                    if (i15 != 0) {
                        kVar2 = null;
                    }
                    i18 = i12;
                    l13 = l12;
                    hVar3 = hVar2;
                }
                c1086gP.U();
                O0 o19 = InteractiveComponentSizeKt.f12188a;
                androidx.compose.ui.h hVarI10 = hVar3.i(MinimumInteractiveModifier.f12219b);
                float f19 = B.n.f1300b;
                androidx.compose.ui.h hVarR10 = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI10, f19), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
                if (z11) {
                    j10 = l13.f12202a;
                } else {
                    j10 = l13.f12204c;
                }
                androidx.compose.ui.h hVarB10 = ClickableKt.b(C0932d.b(hVarR10, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f19 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
                androidx.compose.ui.layout.E eD10 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, hVarB10);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD10);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P10);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC10);
                if (z11) {
                    j11 = l13.f12203b;
                } else {
                    j11 = l13.f12205d;
                }
                CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                c1086gP.T(true);
                z11 = z11;
                kVar3 = kVar2;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c1086gP.L(-1519621781);
                        j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l12 = c1061m.f12614Q;
                        if (l12 == null) {
                            long j1111 = androidx.compose.ui.graphics.H.f13503k;
                            l12 = new L(j1111, j, j1111, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1061m.f12614Q = l12;
                        }
                        if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                            c1086gP.T(false);
                        } else {
                            L lA110 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1086gP = c1086gP;
                            c1086gP.T(false);
                            l12 = lA110;
                        }
                        i12 &= -7169;
                    } else {
                        l12 = l11;
                    }
                    if (i15 != 0) {
                        kVar2 = null;
                    }
                    i18 = i12;
                    l13 = l12;
                    hVar3 = hVar2;
                } else {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c1086gP.L(-1519621781);
                        j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l12 = c1061m.f12614Q;
                        if (l12 == null) {
                            long j1112 = androidx.compose.ui.graphics.H.f13503k;
                            l12 = new L(j1112, j, j1112, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1061m.f12614Q = l12;
                        }
                        if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                            c1086gP.T(false);
                        } else {
                            L lA111 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1086gP = c1086gP;
                            c1086gP.T(false);
                            l12 = lA111;
                        }
                        i12 &= -7169;
                    } else {
                        l12 = l11;
                    }
                    if (i15 != 0) {
                        kVar2 = null;
                    }
                    i18 = i12;
                    l13 = l12;
                    hVar3 = hVar2;
                }
                c1086gP.U();
                O0 o110 = InteractiveComponentSizeKt.f12188a;
                androidx.compose.ui.h hVarI11 = hVar3.i(MinimumInteractiveModifier.f12219b);
                float f110 = B.n.f1300b;
                androidx.compose.ui.h hVarR11 = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI11, f110), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
                if (z11) {
                    j10 = l13.f12202a;
                } else {
                    j10 = l13.f12204c;
                }
                androidx.compose.ui.h hVarB11 = ClickableKt.b(C0932d.b(hVarR11, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f110 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
                androidx.compose.ui.layout.E eD11 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                androidx.compose.ui.h hVarC11 = ComposedModifierKt.c(c1086gP, hVarB11);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD11);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P11);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC11);
                if (z11) {
                    j11 = l13.f12203b;
                } else {
                    j11 = l13.f12205d;
                }
                CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                c1086gP.T(true);
                z11 = z11;
                kVar3 = kVar2;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z17 = z11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        IconButtonKt.b(aVar, hVar4, z17, l13, kVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                l11 = l10;
                if (c1086gP.K(l11)) {
                }
                i12 |= i21;
            } else {
                l11 = l10;
            }
            i12 |= i21;
        } else {
            l11 = l10;
        }
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                kVar2 = kVar;
                if (c1086gP.K(kVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 32) != 0) {
                i12 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(pVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((74899 & i12) == 74898) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c1086gP.L(-1519621781);
                        j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l12 = c1061m.f12614Q;
                        if (l12 == null) {
                            long j1113 = androidx.compose.ui.graphics.H.f13503k;
                            l12 = new L(j1113, j, j1113, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1061m.f12614Q = l12;
                        }
                        if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                            c1086gP.T(false);
                        } else {
                            L lA112 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1086gP = c1086gP;
                            c1086gP.T(false);
                            l12 = lA112;
                        }
                        i12 &= -7169;
                    } else {
                        l12 = l11;
                    }
                    if (i15 != 0) {
                        kVar2 = null;
                    }
                    i18 = i12;
                    l13 = l12;
                    hVar3 = hVar2;
                } else {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c1086gP.L(-1519621781);
                        j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l12 = c1061m.f12614Q;
                        if (l12 == null) {
                            long j1114 = androidx.compose.ui.graphics.H.f13503k;
                            l12 = new L(j1114, j, j1114, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1061m.f12614Q = l12;
                        }
                        if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                            c1086gP.T(false);
                        } else {
                            L lA113 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1086gP = c1086gP;
                            c1086gP.T(false);
                            l12 = lA113;
                        }
                        i12 &= -7169;
                    } else {
                        l12 = l11;
                    }
                    if (i15 != 0) {
                        kVar2 = null;
                    }
                    i18 = i12;
                    l13 = l12;
                    hVar3 = hVar2;
                }
                c1086gP.U();
                O0 o111 = InteractiveComponentSizeKt.f12188a;
                androidx.compose.ui.h hVarI12 = hVar3.i(MinimumInteractiveModifier.f12219b);
                float f111 = B.n.f1300b;
                androidx.compose.ui.h hVarR12 = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI12, f111), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
                if (z11) {
                    j10 = l13.f12202a;
                } else {
                    j10 = l13.f12204c;
                }
                androidx.compose.ui.h hVarB12 = ClickableKt.b(C0932d.b(hVarR12, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f111 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
                androidx.compose.ui.layout.E eD12 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, hVarB12);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD12);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P12);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC12);
                if (z11) {
                    j11 = l13.f12203b;
                } else {
                    j11 = l13.f12205d;
                }
                CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                c1086gP.T(true);
                z11 = z11;
                kVar3 = kVar2;
                hVar4 = hVar3;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c1086gP.L(-1519621781);
                        j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l12 = c1061m.f12614Q;
                        if (l12 == null) {
                            long j1115 = androidx.compose.ui.graphics.H.f13503k;
                            l12 = new L(j1115, j, j1115, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1061m.f12614Q = l12;
                        }
                        if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                            c1086gP.T(false);
                        } else {
                            L lA114 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1086gP = c1086gP;
                            c1086gP.T(false);
                            l12 = lA114;
                        }
                        i12 &= -7169;
                    } else {
                        l12 = l11;
                    }
                    if (i15 != 0) {
                        kVar2 = null;
                    }
                    i18 = i12;
                    l13 = l12;
                    hVar3 = hVar2;
                } else {
                    if (i20 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        c1086gP.L(-1519621781);
                        j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                        c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                        l12 = c1061m.f12614Q;
                        if (l12 == null) {
                            long j1116 = androidx.compose.ui.graphics.H.f13503k;
                            l12 = new L(j1116, j, j1116, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1061m.f12614Q = l12;
                        }
                        if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                            c1086gP.T(false);
                        } else {
                            L lA115 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                            c1086gP = c1086gP;
                            c1086gP.T(false);
                            l12 = lA115;
                        }
                        i12 &= -7169;
                    } else {
                        l12 = l11;
                    }
                    if (i15 != 0) {
                        kVar2 = null;
                    }
                    i18 = i12;
                    l13 = l12;
                    hVar3 = hVar2;
                }
                c1086gP.U();
                O0 o112 = InteractiveComponentSizeKt.f12188a;
                androidx.compose.ui.h hVarI13 = hVar3.i(MinimumInteractiveModifier.f12219b);
                float f112 = B.n.f1300b;
                androidx.compose.ui.h hVarR13 = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI13, f112), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
                if (z11) {
                    j10 = l13.f12202a;
                } else {
                    j10 = l13.f12204c;
                }
                androidx.compose.ui.h hVarB13 = ClickableKt.b(C0932d.b(hVarR13, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f112 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
                androidx.compose.ui.layout.E eD13 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
                androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086gP, hVarB13);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD13);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P13);
                pVar2 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar2);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC13);
                if (z11) {
                    j11 = l13.f12203b;
                } else {
                    j11 = l13.f12205d;
                }
                CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                c1086gP.T(true);
                z11 = z11;
                kVar3 = kVar2;
                hVar4 = hVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final boolean z18 = z11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        IconButtonKt.b(aVar, hVar4, z18, l13, kVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        kVar2 = kVar;
        if ((i11 & 32) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.k(pVar)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        }
        if ((74899 & i12) == 74898) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    c1086gP.L(-1519621781);
                    j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                    c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                    l12 = c1061m.f12614Q;
                    if (l12 == null) {
                        long j1117 = androidx.compose.ui.graphics.H.f13503k;
                        l12 = new L(j1117, j, j1117, androidx.compose.ui.graphics.H.b(0.38f, j));
                        c1061m.f12614Q = l12;
                    }
                    if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                        c1086gP.T(false);
                    } else {
                        L lA116 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                        c1086gP = c1086gP;
                        c1086gP.T(false);
                        l12 = lA116;
                    }
                    i12 &= -7169;
                } else {
                    l12 = l11;
                }
                if (i15 != 0) {
                    kVar2 = null;
                }
                i18 = i12;
                l13 = l12;
                hVar3 = hVar2;
            } else {
                if (i20 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    c1086gP.L(-1519621781);
                    j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                    c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                    l12 = c1061m.f12614Q;
                    if (l12 == null) {
                        long j1118 = androidx.compose.ui.graphics.H.f13503k;
                        l12 = new L(j1118, j, j1118, androidx.compose.ui.graphics.H.b(0.38f, j));
                        c1061m.f12614Q = l12;
                    }
                    if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                        c1086gP.T(false);
                    } else {
                        L lA117 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                        c1086gP = c1086gP;
                        c1086gP.T(false);
                        l12 = lA117;
                    }
                    i12 &= -7169;
                } else {
                    l12 = l11;
                }
                if (i15 != 0) {
                    kVar2 = null;
                }
                i18 = i12;
                l13 = l12;
                hVar3 = hVar2;
            }
            c1086gP.U();
            O0 o113 = InteractiveComponentSizeKt.f12188a;
            androidx.compose.ui.h hVarI14 = hVar3.i(MinimumInteractiveModifier.f12219b);
            float f113 = B.n.f1300b;
            androidx.compose.ui.h hVarR14 = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI14, f113), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
            if (z11) {
                j10 = l13.f12202a;
            } else {
                j10 = l13.f12204c;
            }
            androidx.compose.ui.h hVarB14 = ClickableKt.b(C0932d.b(hVarR14, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f113 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
            androidx.compose.ui.layout.E eD14 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
            i19 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
            androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, hVarB14);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD14);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P14);
            pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i19, c1086gP, i19, pVar2);
            } else {
                J4.i.d(i19, c1086gP, i19, pVar2);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC14);
            if (z11) {
                j11 = l13.f12203b;
            } else {
                j11 = l13.f12205d;
            }
            CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            c1086gP.T(true);
            z11 = z11;
            kVar3 = kVar2;
            hVar4 = hVar3;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    c1086gP.L(-1519621781);
                    j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                    c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                    l12 = c1061m.f12614Q;
                    if (l12 == null) {
                        long j1119 = androidx.compose.ui.graphics.H.f13503k;
                        l12 = new L(j1119, j, j1119, androidx.compose.ui.graphics.H.b(0.38f, j));
                        c1061m.f12614Q = l12;
                    }
                    if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                        c1086gP.T(false);
                    } else {
                        L lA118 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                        c1086gP = c1086gP;
                        c1086gP.T(false);
                        l12 = lA118;
                    }
                    i12 &= -7169;
                } else {
                    l12 = l11;
                }
                if (i15 != 0) {
                    kVar2 = null;
                }
                i18 = i12;
                l13 = l12;
                hVar3 = hVar2;
            } else {
                if (i20 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    c1086gP.L(-1519621781);
                    j = ((androidx.compose.ui.graphics.H) c1086gP.x(ContentColorKt.f12125a)).f13506a;
                    c1061m = (C1061m) c1086gP.x(ColorSchemeKt.f12087a);
                    l12 = c1061m.f12614Q;
                    if (l12 == null) {
                        long j11110 = androidx.compose.ui.graphics.H.f13503k;
                        l12 = new L(j11110, j, j11110, androidx.compose.ui.graphics.H.b(0.38f, j));
                        c1061m.f12614Q = l12;
                    }
                    if (androidx.compose.ui.graphics.H.c(l12.f12203b, j)) {
                        c1086gP.T(false);
                    } else {
                        L lA119 = l12.a(l12.f12202a, j, l12.f12204c, androidx.compose.ui.graphics.H.b(0.38f, j));
                        c1086gP = c1086gP;
                        c1086gP.T(false);
                        l12 = lA119;
                    }
                    i12 &= -7169;
                } else {
                    l12 = l11;
                }
                if (i15 != 0) {
                    kVar2 = null;
                }
                i18 = i12;
                l13 = l12;
                hVar3 = hVar2;
            }
            c1086gP.U();
            O0 o114 = InteractiveComponentSizeKt.f12188a;
            androidx.compose.ui.h hVarI15 = hVar3.i(MinimumInteractiveModifier.f12219b);
            float f114 = B.n.f1300b;
            androidx.compose.ui.h hVarR15 = A8.p.r(androidx.compose.foundation.layout.W.m(hVarI15, f114), ShapesKt.a(ShapeKeyTokens.f12738f, c1086gP));
            if (z11) {
                j10 = l13.f12202a;
            } else {
                j10 = l13.f12204c;
            }
            androidx.compose.ui.h hVarB15 = ClickableKt.b(C0932d.b(hVarR15, j10, androidx.compose.ui.graphics.h0.f13629a), kVar2, RippleKt.c(false, f114 / 2, c1086gP, 54, 4), z11, new androidx.compose.ui.semantics.i(0), aVar, 8);
            androidx.compose.ui.layout.E eD15 = BoxKt.d(androidx.compose.ui.d.a.f13339e, false);
            i19 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P15 = c1086gP.P();
            androidx.compose.ui.h hVarC15 = ComposedModifierKt.c(c1086gP, hVarB15);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, eD15);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P15);
            pVar2 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i19, c1086gP, i19, pVar2);
            } else {
                J4.i.d(i19, c1086gP, i19, pVar2);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC15);
            if (z11) {
                j11 = l13.f12203b;
            } else {
                j11 = l13.f12205d;
            }
            CompositionLocalKt.a(B7.b.b(j11, ContentColorKt.f12125a), pVar, c1086gP, 8 | ((i18 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            c1086gP.T(true);
            z11 = z11;
            kVar3 = kVar2;
            hVar4 = hVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final boolean z19 = z11;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.IconButtonKt$IconButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    IconButtonKt.b(aVar, hVar4, z19, l13, kVar3, pVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
