package androidx.compose.material;

import androidx.compose.animation.core.C0908h;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1101n0;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.node.ComposeUiNode;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ButtonKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0125  */
    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:103:0x012c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x0135  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:111:0x0144  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0162  */
    /* JADX WARN: Code duplicated, block: B:129:0x018d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x018f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0192  */
    /* JADX WARN: Code duplicated, block: B:133:0x0196  */
    /* JADX WARN: Code duplicated, block: B:135:0x0199  */
    /* JADX WARN: Code duplicated, block: B:137:0x019e  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:143:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:149:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:152:0x020c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0211  */
    /* JADX WARN: Code duplicated, block: B:157:0x0217  */
    /* JADX WARN: Code duplicated, block: B:158:0x0235  */
    /* JADX WARN: Code duplicated, block: B:160:0x0239  */
    /* JADX WARN: Code duplicated, block: B:161:0x0242  */
    /* JADX WARN: Code duplicated, block: B:164:0x024e  */
    /* JADX WARN: Code duplicated, block: B:166:0x025a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0269  */
    /* JADX WARN: Code duplicated, block: B:171:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:177:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:179:0x0309  */
    /* JADX WARN: Code duplicated, block: B:182:0x031d  */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final Ia.a<p293xa.r> aVar, androidx.compose.ui.h hVar, boolean z10, androidx.compose.foundation.interaction.k kVar, InterfaceC1031g interfaceC1031g, l0 l0Var, C0937i c0937i, InterfaceC1029e interfaceC1029e, androidx.compose.foundation.layout.L l10, final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        InterfaceC1031g interfaceC1031g2;
        l0 l0Var2;
        int i17;
        C0937i c0937i2;
        int i18;
        InterfaceC1029e interfaceC1029e2;
        int i19;
        int i20;
        int i21;
        boolean z12;
        boolean z13;
        final androidx.compose.ui.h hVar2;
        final C0937i c0937i3;
        androidx.compose.foundation.layout.L l11;
        final boolean z14;
        InterfaceC1029e interfaceC1029e3;
        final l0 l0Var3;
        final androidx.compose.foundation.interaction.k kVar2;
        InterfaceC1031g interfaceC1031g3;
        C1105p0 c1105p0V;
        int i22;
        InterfaceC1084f.a.C0153a c0153a;
        C0908h c0908hA;
        androidx.compose.ui.h hVar3;
        androidx.compose.foundation.interaction.k kVar3;
        InterfaceC1031g interfaceC1031g4;
        int i23;
        C0937i c0937i4;
        InterfaceC1084f.a.C0153a c0153a2;
        boolean z15;
        InterfaceC1029e interfaceC1029eA;
        androidx.compose.foundation.interaction.k kVar4;
        final androidx.compose.foundation.layout.L l12;
        int i24;
        androidx.compose.ui.h hVar4;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean zG;
        Object objF;
        InterfaceC1031g interfaceC1031g5;
        InterfaceC1029e interfaceC1029e4;
        androidx.compose.foundation.interaction.k kVar5;
        int i25;
        boolean z16;
        C0908h c0908h;
        float f14;
        Object objF2;
        InterfaceC1029e interfaceC1029e5;
        int i26;
        InterfaceC1029e interfaceC1029e6;
        InterfaceC1029e interfaceC1029e7;
        int i27;
        InterfaceC1031g interfaceC1031g6;
        int i28;
        InterfaceC1031g interfaceC1031g7;
        InterfaceC1031g interfaceC1031g8;
        C1086g c1086gP = interfaceC1084f.p(-2116133464);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i29 = i11 & 2;
        if (i29 == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.K(hVar) ? 32 : 16;
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
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        if (c1086gP.K(kVar)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        if ((i11 & 16) == 0) {
                            interfaceC1031g8 = interfaceC1031g;
                            if (c1086gP.K(interfaceC1031g8)) {
                                interfaceC1031g6 = interfaceC1031g8;
                                i28 = 16384;
                                interfaceC1031g7 = interfaceC1031g8;
                            }
                            i12 |= i28;
                            interfaceC1031g2 = interfaceC1031g7;
                        } else {
                            interfaceC1031g6 = interfaceC1031g;
                        }
                        interfaceC1031g6 = interfaceC1031g8;
                        i28 = 8192;
                        interfaceC1031g7 = interfaceC1031g6;
                        i12 |= i28;
                        interfaceC1031g2 = interfaceC1031g7;
                    } else {
                        interfaceC1031g2 = interfaceC1031g;
                    }
                    if ((i10 & 196608) == 0) {
                        l0Var2 = l0Var;
                        if ((i11 & 32) == 0 || !c1086gP.K(l0Var2)) {
                            i27 = 65536;
                        } else {
                            i27 = 131072;
                        }
                        i12 |= i27;
                    } else {
                        l0Var2 = l0Var;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                        c0937i2 = c0937i;
                    } else {
                        c0937i2 = c0937i;
                        if ((i10 & 1572864) == 0) {
                            if (c1086gP.K(c0937i2)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i10 & 12582912) == 0) {
                        if ((i11 & 128) == 0) {
                            interfaceC1029e7 = interfaceC1029e;
                            if (c1086gP.K(interfaceC1029e7)) {
                                interfaceC1029e5 = interfaceC1029e7;
                                i26 = 8388608;
                                interfaceC1029e6 = interfaceC1029e7;
                            }
                            i12 |= i26;
                            interfaceC1029e2 = interfaceC1029e6;
                        } else {
                            interfaceC1029e5 = interfaceC1029e;
                        }
                        interfaceC1029e5 = interfaceC1029e7;
                        i26 = 4194304;
                        interfaceC1029e6 = interfaceC1029e5;
                        i12 |= i26;
                        interfaceC1029e2 = interfaceC1029e6;
                    } else {
                        interfaceC1029e2 = interfaceC1029e;
                    }
                    i19 = 256 & i11;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(l10)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(qVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    if ((306783379 & i12) != 306783378) {
                        z12 = true;
                        z13 = true;
                    } else {
                        z12 = true;
                        z13 = false;
                    }
                    if (c1086gP.C(i12 & 1, z13)) {
                        c1086gP.r0();
                        i22 = i10 & 1;
                        c0153a = InterfaceC1084f.a.f12980a;
                        c0908hA = null;
                        if (i22 != 0 || c1086gP.a0()) {
                            if (i29 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i13 != 0) {
                                z11 = z12;
                            }
                            if (i15 != 0) {
                                kVar3 = null;
                            } else {
                                kVar3 = kVar;
                            }
                            if ((16 & i11) != 0) {
                                androidx.compose.foundation.layout.N n10 = C1030f.f11882a;
                                f10 = 2;
                                f11 = 8;
                                f12 = 0;
                                f13 = 4;
                                zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                                objF = c1086gP.f();
                                if (zG || objF == c0153a) {
                                    objF = new C1036l(f10, f11, f12, f13, f13);
                                    c1086gP.E(objF);
                                }
                                i12 &= -57345;
                                interfaceC1031g4 = (C1036l) objF;
                            } else {
                                interfaceC1031g4 = interfaceC1031g2;
                            }
                            if ((32 & i11) != 0) {
                                i12 &= -458753;
                                l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            }
                            i23 = i12;
                            if (i17 != 0) {
                                c0937i4 = null;
                            } else {
                                c0937i4 = c0937i;
                            }
                            if ((128 & i11) != 0) {
                                z15 = false;
                                i23 &= -29360129;
                                c0153a2 = c0153a;
                                interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                            } else {
                                c0153a2 = c0153a;
                                z15 = false;
                            }
                            if (i19 != 0) {
                                interfaceC1029eA = interfaceC1029e2;
                                i24 = i23;
                                l12 = C1030f.f11882a;
                                hVar4 = hVar3;
                                kVar4 = kVar3;
                                interfaceC1029e4 = interfaceC1029eA;
                                interfaceC1031g5 = interfaceC1031g4;
                            } else {
                                interfaceC1029eA = interfaceC1029e2;
                                kVar4 = kVar3;
                                l12 = l10;
                                i24 = i23;
                                hVar4 = hVar3;
                                interfaceC1029e4 = interfaceC1029eA;
                                interfaceC1031g5 = interfaceC1031g4;
                            }
                        } else {
                            c1086gP.w();
                            if ((16 & i11) != 0) {
                                i12 &= -57345;
                            }
                            if ((32 & i11) != 0) {
                                i12 &= -458753;
                            }
                            if ((128 & i11) != 0) {
                                i12 &= -29360129;
                            }
                            hVar4 = hVar;
                            kVar4 = kVar;
                            c0937i4 = c0937i2;
                            i24 = i12;
                            c0153a2 = c0153a;
                            z15 = false;
                            l12 = l10;
                            interfaceC1029e4 = interfaceC1029e2;
                            interfaceC1031g5 = interfaceC1031g2;
                        }
                        c1086gP.U();
                        if (kVar4 == null) {
                            c1086gP.L(1050689923);
                            objF2 = c1086gP.f();
                            if (objF2 == c0153a2) {
                                objF2 = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF2);
                            }
                            kVar5 = (androidx.compose.foundation.interaction.k) objF2;
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-243202092);
                            c1086gP.T(z15);
                            kVar5 = kVar4;
                        }
                        i25 = i24 >> 6;
                        androidx.compose.foundation.interaction.k kVar6 = kVar4;
                        final X xA = interfaceC1029e4.a(z11, c1086gP);
                        androidx.compose.ui.h hVarB = androidx.compose.ui.semantics.p.b(hVar4, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$1
                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                androidx.compose.ui.semantics.t.k(wVar, 0);
                                return p293xa.r.f47939a;
                            }
                        });
                        long j = ((androidx.compose.ui.graphics.H) interfaceC1029e4.b(z11, c1086gP).getValue()).f13506a;
                        androidx.compose.ui.h hVar5 = hVar4;
                        long jB = androidx.compose.ui.graphics.H.b(1.0f, ((androidx.compose.ui.graphics.H) xA.getValue()).f13506a);
                        if (interfaceC1031g5 == null) {
                            c1086gP.L(1051096580);
                            z16 = false;
                        } else {
                            z16 = false;
                            c1086gP.L(-243188323);
                            c0908hA = interfaceC1031g5.a(z11, kVar5, c1086gP, i25 & 910);
                        }
                        c1086gP.T(z16);
                        c0908h = c0908hA;
                        if (c0908h != null) {
                            f14 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                        } else {
                            f14 = 0;
                        }
                        SurfaceKt.b(aVar, hVarB, z11, l0Var2, j, jB, c0937i4, f14, kVar5, androidx.compose.runtime.internal.a.b(7524271, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    C1101n0 c1101n0B = ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(xA.getValue().f13506a)));
                                    final androidx.compose.foundation.layout.L l13 = l12;
                                    final Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                                    CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(-1699085201, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            int iIntValue2 = num2.intValue();
                                            if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                androidx.compose.ui.text.F f15 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).f11875k;
                                                final androidx.compose.foundation.layout.L l14 = l13;
                                                final Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar3 = qVar2;
                                                TextKt.a(f15, androidx.compose.runtime.internal.a.b(-630330208, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // Ia.p
                                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                        InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                        int iIntValue3 = num3.intValue();
                                                        if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            androidx.compose.ui.h hVarE = PaddingKt.e(W.a(C1030f.f11883b, C1030f.f11884c, androidx.compose.ui.h.a.f13984b), l14);
                                                            C0945e.c cVar = C0945e.f10288e;
                                                            androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                                            Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar4 = qVar3;
                                                            androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f7, 54);
                                                            int iF = interfaceC1084f7.F();
                                                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f7.z();
                                                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f7, hVarE);
                                                            ComposeUiNode.f14331c0.getClass();
                                                            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                                            if (interfaceC1084f7.u() == null) {
                                                                I.b.k();
                                                                throw null;
                                                            }
                                                            interfaceC1084f7.r();
                                                            if (interfaceC1084f7.m()) {
                                                                interfaceC1084f7.v(aVar2);
                                                            } else {
                                                                interfaceC1084f7.A();
                                                            }
                                                            R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f7, tA);
                                                            R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f7, interfaceC1089h0Z);
                                                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                                            if (interfaceC1084f7.m() || !kotlin.jvm.internal.i.a(interfaceC1084f7.f(), Integer.valueOf(iF))) {
                                                                androidx.compose.animation.k.b(iF, interfaceC1084f7, iF, pVar);
                                                            }
                                                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f7, hVarC);
                                                            qVar4.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f7, 6);
                                                            interfaceC1084f7.J();
                                                        } else {
                                                            interfaceC1084f7.w();
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }, interfaceC1084f5), interfaceC1084f5, 48);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 56);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (3670016 & i24), 0);
                        l11 = l12;
                        c0937i3 = c0937i4;
                        z14 = z11;
                        hVar2 = hVar5;
                        interfaceC1029e3 = interfaceC1029e4;
                        l0Var3 = l0Var2;
                        kVar2 = kVar6;
                        interfaceC1031g3 = interfaceC1031g5;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        c0937i3 = c0937i;
                        l11 = l10;
                        z14 = z11;
                        interfaceC1029e3 = interfaceC1029e2;
                        l0Var3 = l0Var2;
                        kVar2 = kVar;
                        interfaceC1031g3 = interfaceC1031g2;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final InterfaceC1031g interfaceC1031g9 = interfaceC1031g3;
                        final InterfaceC1029e interfaceC1029e8 = interfaceC1029e3;
                        final androidx.compose.foundation.layout.L l13 = l11;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ButtonKt.a(aVar, hVar2, z14, kVar2, interfaceC1031g9, l0Var3, c0937i3, interfaceC1029e8, l13, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 3072;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        interfaceC1031g8 = interfaceC1031g;
                        if (c1086gP.K(interfaceC1031g8)) {
                            interfaceC1031g6 = interfaceC1031g8;
                            i28 = 16384;
                            interfaceC1031g7 = interfaceC1031g8;
                        }
                        i12 |= i28;
                        interfaceC1031g2 = interfaceC1031g7;
                    } else {
                        interfaceC1031g6 = interfaceC1031g;
                    }
                    interfaceC1031g6 = interfaceC1031g8;
                    i28 = 8192;
                    interfaceC1031g7 = interfaceC1031g6;
                    i12 |= i28;
                    interfaceC1031g2 = interfaceC1031g7;
                } else {
                    interfaceC1031g2 = interfaceC1031g;
                }
                if ((i10 & 196608) == 0) {
                    l0Var2 = l0Var;
                    if ((i11 & 32) == 0) {
                        i27 = 65536;
                    } else {
                        i27 = 65536;
                    }
                    i12 |= i27;
                } else {
                    l0Var2 = l0Var;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    c0937i2 = c0937i;
                } else {
                    c0937i2 = c0937i;
                    if ((i10 & 1572864) == 0) {
                        if (c1086gP.K(c0937i2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 12582912) == 0) {
                    if ((i11 & 128) == 0) {
                        interfaceC1029e7 = interfaceC1029e;
                        if (c1086gP.K(interfaceC1029e7)) {
                            interfaceC1029e5 = interfaceC1029e7;
                            i26 = 8388608;
                            interfaceC1029e6 = interfaceC1029e7;
                        }
                        i12 |= i26;
                        interfaceC1029e2 = interfaceC1029e6;
                    } else {
                        interfaceC1029e5 = interfaceC1029e;
                    }
                    interfaceC1029e5 = interfaceC1029e7;
                    i26 = 4194304;
                    interfaceC1029e6 = interfaceC1029e5;
                    i12 |= i26;
                    interfaceC1029e2 = interfaceC1029e6;
                } else {
                    interfaceC1029e2 = interfaceC1029e;
                }
                i19 = 256 & i11;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(l10)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(qVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                    z13 = true;
                } else {
                    z12 = true;
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    i22 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    c0908hA = null;
                    if (i22 != 0) {
                        if (i29 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = z12;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n11 = C1030f.f11882a;
                            f10 = 2;
                            f11 = 8;
                            f12 = 0;
                            f13 = 4;
                            zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                            objF = c1086gP.f();
                            if (zG) {
                                objF = new C1036l(f10, f11, f12, f13, f13);
                                c1086gP.E(objF);
                            } else {
                                objF = new C1036l(f10, f11, f12, f13, f13);
                                c1086gP.E(objF);
                            }
                            i12 &= -57345;
                            interfaceC1031g4 = (C1036l) objF;
                        } else {
                            interfaceC1031g4 = interfaceC1031g2;
                        }
                        if ((32 & i11) != 0) {
                            i12 &= -458753;
                            l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        }
                        i23 = i12;
                        if (i17 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i;
                        }
                        if ((128 & i11) != 0) {
                            z15 = false;
                            i23 &= -29360129;
                            c0153a2 = c0153a;
                            interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                        } else {
                            c0153a2 = c0153a;
                            z15 = false;
                        }
                        if (i19 != 0) {
                            interfaceC1029eA = interfaceC1029e2;
                            i24 = i23;
                            l12 = C1030f.f11882a;
                            hVar4 = hVar3;
                            kVar4 = kVar3;
                            interfaceC1029e4 = interfaceC1029eA;
                            interfaceC1031g5 = interfaceC1031g4;
                        } else {
                            interfaceC1029eA = interfaceC1029e2;
                            kVar4 = kVar3;
                            l12 = l10;
                            i24 = i23;
                            hVar4 = hVar3;
                            interfaceC1029e4 = interfaceC1029eA;
                            interfaceC1031g5 = interfaceC1031g4;
                        }
                    } else {
                        if (i29 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = z12;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n12 = C1030f.f11882a;
                            f10 = 2;
                            f11 = 8;
                            f12 = 0;
                            f13 = 4;
                            zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                            objF = c1086gP.f();
                            if (zG) {
                                objF = new C1036l(f10, f11, f12, f13, f13);
                                c1086gP.E(objF);
                            } else {
                                objF = new C1036l(f10, f11, f12, f13, f13);
                                c1086gP.E(objF);
                            }
                            i12 &= -57345;
                            interfaceC1031g4 = (C1036l) objF;
                        } else {
                            interfaceC1031g4 = interfaceC1031g2;
                        }
                        if ((32 & i11) != 0) {
                            i12 &= -458753;
                            l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        }
                        i23 = i12;
                        if (i17 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i;
                        }
                        if ((128 & i11) != 0) {
                            z15 = false;
                            i23 &= -29360129;
                            c0153a2 = c0153a;
                            interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                        } else {
                            c0153a2 = c0153a;
                            z15 = false;
                        }
                        if (i19 != 0) {
                            interfaceC1029eA = interfaceC1029e2;
                            i24 = i23;
                            l12 = C1030f.f11882a;
                            hVar4 = hVar3;
                            kVar4 = kVar3;
                            interfaceC1029e4 = interfaceC1029eA;
                            interfaceC1031g5 = interfaceC1031g4;
                        } else {
                            interfaceC1029eA = interfaceC1029e2;
                            kVar4 = kVar3;
                            l12 = l10;
                            i24 = i23;
                            hVar4 = hVar3;
                            interfaceC1029e4 = interfaceC1029eA;
                            interfaceC1031g5 = interfaceC1031g4;
                        }
                    }
                    c1086gP.U();
                    if (kVar4 == null) {
                        c1086gP.L(1050689923);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a2) {
                            objF2 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF2);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF2;
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-243202092);
                        c1086gP.T(z15);
                        kVar5 = kVar4;
                    }
                    i25 = i24 >> 6;
                    androidx.compose.foundation.interaction.k kVar7 = kVar4;
                    final N0<androidx.compose.ui.graphics.H> xA2 = interfaceC1029e4.a(z11, c1086gP);
                    androidx.compose.ui.h hVarB2 = androidx.compose.ui.semantics.p.b(hVar4, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    });
                    long j10 = ((androidx.compose.ui.graphics.H) interfaceC1029e4.b(z11, c1086gP).getValue()).f13506a;
                    androidx.compose.ui.h hVar6 = hVar4;
                    long jB2 = androidx.compose.ui.graphics.H.b(1.0f, ((androidx.compose.ui.graphics.H) xA2.getValue()).f13506a);
                    if (interfaceC1031g5 == null) {
                        c1086gP.L(1051096580);
                        z16 = false;
                    } else {
                        z16 = false;
                        c1086gP.L(-243188323);
                        c0908hA = interfaceC1031g5.a(z11, kVar5, c1086gP, i25 & 910);
                    }
                    c1086gP.T(z16);
                    c0908h = c0908hA;
                    if (c0908h != null) {
                        f14 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                    } else {
                        f14 = 0;
                    }
                    SurfaceKt.b(aVar, hVarB2, z11, l0Var2, j10, jB2, c0937i4, f14, kVar5, androidx.compose.runtime.internal.a.b(7524271, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                C1101n0 c1101n0B = ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(xA2.getValue().f13506a)));
                                final androidx.compose.foundation.layout.L l14 = l12;
                                final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(-1699085201, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue2 = num2.intValue();
                                        if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            androidx.compose.ui.text.F f15 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).f11875k;
                                            final androidx.compose.foundation.layout.L l15 = l14;
                                            final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3 = qVar2;
                                            TextKt.a(f15, androidx.compose.runtime.internal.a.b(-630330208, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // Ia.p
                                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                    InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                    int iIntValue3 = num3.intValue();
                                                    if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        androidx.compose.ui.h hVarE = PaddingKt.e(W.a(C1030f.f11883b, C1030f.f11884c, androidx.compose.ui.h.a.f13984b), l15);
                                                        C0945e.c cVar = C0945e.f10288e;
                                                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                                        Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar4 = qVar3;
                                                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f7, 54);
                                                        int iF = interfaceC1084f7.F();
                                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f7.z();
                                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f7, hVarE);
                                                        ComposeUiNode.f14331c0.getClass();
                                                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                                        if (interfaceC1084f7.u() == null) {
                                                            I.b.k();
                                                            throw null;
                                                        }
                                                        interfaceC1084f7.r();
                                                        if (interfaceC1084f7.m()) {
                                                            interfaceC1084f7.v(aVar2);
                                                        } else {
                                                            interfaceC1084f7.A();
                                                        }
                                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f7, tA);
                                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f7, interfaceC1089h0Z);
                                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                                        if (interfaceC1084f7.m() || !kotlin.jvm.internal.i.a(interfaceC1084f7.f(), Integer.valueOf(iF))) {
                                                            androidx.compose.animation.k.b(iF, interfaceC1084f7, iF, pVar);
                                                        }
                                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f7, hVarC);
                                                        qVar4.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f7, 6);
                                                        interfaceC1084f7.J();
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), interfaceC1084f5, 48);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (3670016 & i24), 0);
                    l11 = l12;
                    c0937i3 = c0937i4;
                    z14 = z11;
                    hVar2 = hVar6;
                    interfaceC1029e3 = interfaceC1029e4;
                    l0Var3 = l0Var2;
                    kVar2 = kVar7;
                    interfaceC1031g3 = interfaceC1031g5;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    c0937i3 = c0937i;
                    l11 = l10;
                    z14 = z11;
                    interfaceC1029e3 = interfaceC1029e2;
                    l0Var3 = l0Var2;
                    kVar2 = kVar;
                    interfaceC1031g3 = interfaceC1031g2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final InterfaceC1031g interfaceC1031g10 = interfaceC1031g3;
                    final InterfaceC1029e interfaceC1029e9 = interfaceC1029e3;
                    final androidx.compose.foundation.layout.L l14 = l11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ButtonKt.a(aVar, hVar2, z14, kVar2, interfaceC1031g10, l0Var3, c0937i3, interfaceC1029e9, l14, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            z11 = z10;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c1086gP.K(kVar)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        interfaceC1031g8 = interfaceC1031g;
                        if (c1086gP.K(interfaceC1031g8)) {
                            interfaceC1031g6 = interfaceC1031g8;
                            i28 = 16384;
                            interfaceC1031g7 = interfaceC1031g8;
                        }
                        i12 |= i28;
                        interfaceC1031g2 = interfaceC1031g7;
                    } else {
                        interfaceC1031g6 = interfaceC1031g;
                    }
                    interfaceC1031g6 = interfaceC1031g8;
                    i28 = 8192;
                    interfaceC1031g7 = interfaceC1031g6;
                    i12 |= i28;
                    interfaceC1031g2 = interfaceC1031g7;
                } else {
                    interfaceC1031g2 = interfaceC1031g;
                }
                if ((i10 & 196608) == 0) {
                    l0Var2 = l0Var;
                    if ((i11 & 32) == 0) {
                        i27 = 65536;
                    } else {
                        i27 = 65536;
                    }
                    i12 |= i27;
                } else {
                    l0Var2 = l0Var;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    c0937i2 = c0937i;
                } else {
                    c0937i2 = c0937i;
                    if ((i10 & 1572864) == 0) {
                        if (c1086gP.K(c0937i2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 12582912) == 0) {
                    if ((i11 & 128) == 0) {
                        interfaceC1029e7 = interfaceC1029e;
                        if (c1086gP.K(interfaceC1029e7)) {
                            interfaceC1029e5 = interfaceC1029e7;
                            i26 = 8388608;
                            interfaceC1029e6 = interfaceC1029e7;
                        }
                        i12 |= i26;
                        interfaceC1029e2 = interfaceC1029e6;
                    } else {
                        interfaceC1029e5 = interfaceC1029e;
                    }
                    interfaceC1029e5 = interfaceC1029e7;
                    i26 = 4194304;
                    interfaceC1029e6 = interfaceC1029e5;
                    i12 |= i26;
                    interfaceC1029e2 = interfaceC1029e6;
                } else {
                    interfaceC1029e2 = interfaceC1029e;
                }
                i19 = 256 & i11;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(l10)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(qVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                    z13 = true;
                } else {
                    z12 = true;
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    i22 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    c0908hA = null;
                    if (i22 != 0) {
                        if (i29 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = z12;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n13 = C1030f.f11882a;
                            f10 = 2;
                            f11 = 8;
                            f12 = 0;
                            f13 = 4;
                            zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                            objF = c1086gP.f();
                            if (zG) {
                                objF = new C1036l(f10, f11, f12, f13, f13);
                                c1086gP.E(objF);
                            } else {
                                objF = new C1036l(f10, f11, f12, f13, f13);
                                c1086gP.E(objF);
                            }
                            i12 &= -57345;
                            interfaceC1031g4 = (C1036l) objF;
                        } else {
                            interfaceC1031g4 = interfaceC1031g2;
                        }
                        if ((32 & i11) != 0) {
                            i12 &= -458753;
                            l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        }
                        i23 = i12;
                        if (i17 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i;
                        }
                        if ((128 & i11) != 0) {
                            z15 = false;
                            i23 &= -29360129;
                            c0153a2 = c0153a;
                            interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                        } else {
                            c0153a2 = c0153a;
                            z15 = false;
                        }
                        if (i19 != 0) {
                            interfaceC1029eA = interfaceC1029e2;
                            i24 = i23;
                            l12 = C1030f.f11882a;
                            hVar4 = hVar3;
                            kVar4 = kVar3;
                            interfaceC1029e4 = interfaceC1029eA;
                            interfaceC1031g5 = interfaceC1031g4;
                        } else {
                            interfaceC1029eA = interfaceC1029e2;
                            kVar4 = kVar3;
                            l12 = l10;
                            i24 = i23;
                            hVar4 = hVar3;
                            interfaceC1029e4 = interfaceC1029eA;
                            interfaceC1031g5 = interfaceC1031g4;
                        }
                    } else {
                        if (i29 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = z12;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n14 = C1030f.f11882a;
                            f10 = 2;
                            f11 = 8;
                            f12 = 0;
                            f13 = 4;
                            zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                            objF = c1086gP.f();
                            if (zG) {
                                objF = new C1036l(f10, f11, f12, f13, f13);
                                c1086gP.E(objF);
                            } else {
                                objF = new C1036l(f10, f11, f12, f13, f13);
                                c1086gP.E(objF);
                            }
                            i12 &= -57345;
                            interfaceC1031g4 = (C1036l) objF;
                        } else {
                            interfaceC1031g4 = interfaceC1031g2;
                        }
                        if ((32 & i11) != 0) {
                            i12 &= -458753;
                            l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        }
                        i23 = i12;
                        if (i17 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i;
                        }
                        if ((128 & i11) != 0) {
                            z15 = false;
                            i23 &= -29360129;
                            c0153a2 = c0153a;
                            interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                        } else {
                            c0153a2 = c0153a;
                            z15 = false;
                        }
                        if (i19 != 0) {
                            interfaceC1029eA = interfaceC1029e2;
                            i24 = i23;
                            l12 = C1030f.f11882a;
                            hVar4 = hVar3;
                            kVar4 = kVar3;
                            interfaceC1029e4 = interfaceC1029eA;
                            interfaceC1031g5 = interfaceC1031g4;
                        } else {
                            interfaceC1029eA = interfaceC1029e2;
                            kVar4 = kVar3;
                            l12 = l10;
                            i24 = i23;
                            hVar4 = hVar3;
                            interfaceC1029e4 = interfaceC1029eA;
                            interfaceC1031g5 = interfaceC1031g4;
                        }
                    }
                    c1086gP.U();
                    if (kVar4 == null) {
                        c1086gP.L(1050689923);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a2) {
                            objF2 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF2);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF2;
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-243202092);
                        c1086gP.T(z15);
                        kVar5 = kVar4;
                    }
                    i25 = i24 >> 6;
                    androidx.compose.foundation.interaction.k kVar8 = kVar4;
                    final N0<androidx.compose.ui.graphics.H> xA3 = interfaceC1029e4.a(z11, c1086gP);
                    androidx.compose.ui.h hVarB3 = androidx.compose.ui.semantics.p.b(hVar4, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    });
                    long j11 = ((androidx.compose.ui.graphics.H) interfaceC1029e4.b(z11, c1086gP).getValue()).f13506a;
                    androidx.compose.ui.h hVar7 = hVar4;
                    long jB3 = androidx.compose.ui.graphics.H.b(1.0f, ((androidx.compose.ui.graphics.H) xA3.getValue()).f13506a);
                    if (interfaceC1031g5 == null) {
                        c1086gP.L(1051096580);
                        z16 = false;
                    } else {
                        z16 = false;
                        c1086gP.L(-243188323);
                        c0908hA = interfaceC1031g5.a(z11, kVar5, c1086gP, i25 & 910);
                    }
                    c1086gP.T(z16);
                    c0908h = c0908hA;
                    if (c0908h != null) {
                        f14 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                    } else {
                        f14 = 0;
                    }
                    SurfaceKt.b(aVar, hVarB3, z11, l0Var2, j11, jB3, c0937i4, f14, kVar5, androidx.compose.runtime.internal.a.b(7524271, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                C1101n0 c1101n0B = ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(xA3.getValue().f13506a)));
                                final androidx.compose.foundation.layout.L l15 = l12;
                                final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(-1699085201, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue2 = num2.intValue();
                                        if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            androidx.compose.ui.text.F f15 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).f11875k;
                                            final androidx.compose.foundation.layout.L l16 = l15;
                                            final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3 = qVar2;
                                            TextKt.a(f15, androidx.compose.runtime.internal.a.b(-630330208, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // Ia.p
                                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                    InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                    int iIntValue3 = num3.intValue();
                                                    if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        androidx.compose.ui.h hVarE = PaddingKt.e(W.a(C1030f.f11883b, C1030f.f11884c, androidx.compose.ui.h.a.f13984b), l16);
                                                        C0945e.c cVar = C0945e.f10288e;
                                                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                                        Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar4 = qVar3;
                                                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f7, 54);
                                                        int iF = interfaceC1084f7.F();
                                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f7.z();
                                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f7, hVarE);
                                                        ComposeUiNode.f14331c0.getClass();
                                                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                                        if (interfaceC1084f7.u() == null) {
                                                            I.b.k();
                                                            throw null;
                                                        }
                                                        interfaceC1084f7.r();
                                                        if (interfaceC1084f7.m()) {
                                                            interfaceC1084f7.v(aVar2);
                                                        } else {
                                                            interfaceC1084f7.A();
                                                        }
                                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f7, tA);
                                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f7, interfaceC1089h0Z);
                                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                                        if (interfaceC1084f7.m() || !kotlin.jvm.internal.i.a(interfaceC1084f7.f(), Integer.valueOf(iF))) {
                                                            androidx.compose.animation.k.b(iF, interfaceC1084f7, iF, pVar);
                                                        }
                                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f7, hVarC);
                                                        qVar4.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f7, 6);
                                                        interfaceC1084f7.J();
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), interfaceC1084f5, 48);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (3670016 & i24), 0);
                    l11 = l12;
                    c0937i3 = c0937i4;
                    z14 = z11;
                    hVar2 = hVar7;
                    interfaceC1029e3 = interfaceC1029e4;
                    l0Var3 = l0Var2;
                    kVar2 = kVar8;
                    interfaceC1031g3 = interfaceC1031g5;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    c0937i3 = c0937i;
                    l11 = l10;
                    z14 = z11;
                    interfaceC1029e3 = interfaceC1029e2;
                    l0Var3 = l0Var2;
                    kVar2 = kVar;
                    interfaceC1031g3 = interfaceC1031g2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final InterfaceC1031g interfaceC1031g11 = interfaceC1031g3;
                    final InterfaceC1029e interfaceC1029e10 = interfaceC1029e3;
                    final androidx.compose.foundation.layout.L l15 = l11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ButtonKt.a(aVar, hVar2, z14, kVar2, interfaceC1031g11, l0Var3, c0937i3, interfaceC1029e10, l15, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    interfaceC1031g8 = interfaceC1031g;
                    if (c1086gP.K(interfaceC1031g8)) {
                        interfaceC1031g6 = interfaceC1031g8;
                        i28 = 16384;
                        interfaceC1031g7 = interfaceC1031g8;
                    }
                    i12 |= i28;
                    interfaceC1031g2 = interfaceC1031g7;
                } else {
                    interfaceC1031g6 = interfaceC1031g;
                }
                interfaceC1031g6 = interfaceC1031g8;
                i28 = 8192;
                interfaceC1031g7 = interfaceC1031g6;
                i12 |= i28;
                interfaceC1031g2 = interfaceC1031g7;
            } else {
                interfaceC1031g2 = interfaceC1031g;
            }
            if ((i10 & 196608) == 0) {
                l0Var2 = l0Var;
                if ((i11 & 32) == 0) {
                    i27 = 65536;
                } else {
                    i27 = 65536;
                }
                i12 |= i27;
            } else {
                l0Var2 = l0Var;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                c0937i2 = c0937i;
            } else {
                c0937i2 = c0937i;
                if ((i10 & 1572864) == 0) {
                    if (c1086gP.K(c0937i2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 12582912) == 0) {
                if ((i11 & 128) == 0) {
                    interfaceC1029e7 = interfaceC1029e;
                    if (c1086gP.K(interfaceC1029e7)) {
                        interfaceC1029e5 = interfaceC1029e7;
                        i26 = 8388608;
                        interfaceC1029e6 = interfaceC1029e7;
                    }
                    i12 |= i26;
                    interfaceC1029e2 = interfaceC1029e6;
                } else {
                    interfaceC1029e5 = interfaceC1029e;
                }
                interfaceC1029e5 = interfaceC1029e7;
                i26 = 4194304;
                interfaceC1029e6 = interfaceC1029e5;
                i12 |= i26;
                interfaceC1029e2 = interfaceC1029e6;
            } else {
                interfaceC1029e2 = interfaceC1029e;
            }
            i19 = 256 & i11;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(l10)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(qVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
                z13 = true;
            } else {
                z12 = true;
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                i22 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                c0908hA = null;
                if (i22 != 0) {
                    if (i29 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = z12;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n15 = C1030f.f11882a;
                        f10 = 2;
                        f11 = 8;
                        f12 = 0;
                        f13 = 4;
                        zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                        objF = c1086gP.f();
                        if (zG) {
                            objF = new C1036l(f10, f11, f12, f13, f13);
                            c1086gP.E(objF);
                        } else {
                            objF = new C1036l(f10, f11, f12, f13, f13);
                            c1086gP.E(objF);
                        }
                        i12 &= -57345;
                        interfaceC1031g4 = (C1036l) objF;
                    } else {
                        interfaceC1031g4 = interfaceC1031g2;
                    }
                    if ((32 & i11) != 0) {
                        i12 &= -458753;
                        l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    }
                    i23 = i12;
                    if (i17 != 0) {
                        c0937i4 = null;
                    } else {
                        c0937i4 = c0937i;
                    }
                    if ((128 & i11) != 0) {
                        z15 = false;
                        i23 &= -29360129;
                        c0153a2 = c0153a;
                        interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                    } else {
                        c0153a2 = c0153a;
                        z15 = false;
                    }
                    if (i19 != 0) {
                        interfaceC1029eA = interfaceC1029e2;
                        i24 = i23;
                        l12 = C1030f.f11882a;
                        hVar4 = hVar3;
                        kVar4 = kVar3;
                        interfaceC1029e4 = interfaceC1029eA;
                        interfaceC1031g5 = interfaceC1031g4;
                    } else {
                        interfaceC1029eA = interfaceC1029e2;
                        kVar4 = kVar3;
                        l12 = l10;
                        i24 = i23;
                        hVar4 = hVar3;
                        interfaceC1029e4 = interfaceC1029eA;
                        interfaceC1031g5 = interfaceC1031g4;
                    }
                } else {
                    if (i29 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = z12;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n16 = C1030f.f11882a;
                        f10 = 2;
                        f11 = 8;
                        f12 = 0;
                        f13 = 4;
                        zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                        objF = c1086gP.f();
                        if (zG) {
                            objF = new C1036l(f10, f11, f12, f13, f13);
                            c1086gP.E(objF);
                        } else {
                            objF = new C1036l(f10, f11, f12, f13, f13);
                            c1086gP.E(objF);
                        }
                        i12 &= -57345;
                        interfaceC1031g4 = (C1036l) objF;
                    } else {
                        interfaceC1031g4 = interfaceC1031g2;
                    }
                    if ((32 & i11) != 0) {
                        i12 &= -458753;
                        l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    }
                    i23 = i12;
                    if (i17 != 0) {
                        c0937i4 = null;
                    } else {
                        c0937i4 = c0937i;
                    }
                    if ((128 & i11) != 0) {
                        z15 = false;
                        i23 &= -29360129;
                        c0153a2 = c0153a;
                        interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                    } else {
                        c0153a2 = c0153a;
                        z15 = false;
                    }
                    if (i19 != 0) {
                        interfaceC1029eA = interfaceC1029e2;
                        i24 = i23;
                        l12 = C1030f.f11882a;
                        hVar4 = hVar3;
                        kVar4 = kVar3;
                        interfaceC1029e4 = interfaceC1029eA;
                        interfaceC1031g5 = interfaceC1031g4;
                    } else {
                        interfaceC1029eA = interfaceC1029e2;
                        kVar4 = kVar3;
                        l12 = l10;
                        i24 = i23;
                        hVar4 = hVar3;
                        interfaceC1029e4 = interfaceC1029eA;
                        interfaceC1031g5 = interfaceC1031g4;
                    }
                }
                c1086gP.U();
                if (kVar4 == null) {
                    c1086gP.L(1050689923);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a2) {
                        objF2 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF2);
                    }
                    kVar5 = (androidx.compose.foundation.interaction.k) objF2;
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-243202092);
                    c1086gP.T(z15);
                    kVar5 = kVar4;
                }
                i25 = i24 >> 6;
                androidx.compose.foundation.interaction.k kVar9 = kVar4;
                final N0<androidx.compose.ui.graphics.H> xA4 = interfaceC1029e4.a(z11, c1086gP);
                androidx.compose.ui.h hVarB4 = androidx.compose.ui.semantics.p.b(hVar4, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                });
                long j12 = ((androidx.compose.ui.graphics.H) interfaceC1029e4.b(z11, c1086gP).getValue()).f13506a;
                androidx.compose.ui.h hVar8 = hVar4;
                long jB4 = androidx.compose.ui.graphics.H.b(1.0f, ((androidx.compose.ui.graphics.H) xA4.getValue()).f13506a);
                if (interfaceC1031g5 == null) {
                    c1086gP.L(1051096580);
                    z16 = false;
                } else {
                    z16 = false;
                    c1086gP.L(-243188323);
                    c0908hA = interfaceC1031g5.a(z11, kVar5, c1086gP, i25 & 910);
                }
                c1086gP.T(z16);
                c0908h = c0908hA;
                if (c0908h != null) {
                    f14 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                } else {
                    f14 = 0;
                }
                SurfaceKt.b(aVar, hVarB4, z11, l0Var2, j12, jB4, c0937i4, f14, kVar5, androidx.compose.runtime.internal.a.b(7524271, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            C1101n0 c1101n0B = ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(xA4.getValue().f13506a)));
                            final androidx.compose.foundation.layout.L l16 = l12;
                            final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(-1699085201, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        androidx.compose.ui.text.F f15 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).f11875k;
                                        final androidx.compose.foundation.layout.L l17 = l16;
                                        final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3 = qVar2;
                                        TextKt.a(f15, androidx.compose.runtime.internal.a.b(-630330208, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // Ia.p
                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                int iIntValue3 = num3.intValue();
                                                if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    androidx.compose.ui.h hVarE = PaddingKt.e(W.a(C1030f.f11883b, C1030f.f11884c, androidx.compose.ui.h.a.f13984b), l17);
                                                    C0945e.c cVar = C0945e.f10288e;
                                                    androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                                    Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar4 = qVar3;
                                                    androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f7, 54);
                                                    int iF = interfaceC1084f7.F();
                                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f7.z();
                                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f7, hVarE);
                                                    ComposeUiNode.f14331c0.getClass();
                                                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                                    if (interfaceC1084f7.u() == null) {
                                                        I.b.k();
                                                        throw null;
                                                    }
                                                    interfaceC1084f7.r();
                                                    if (interfaceC1084f7.m()) {
                                                        interfaceC1084f7.v(aVar2);
                                                    } else {
                                                        interfaceC1084f7.A();
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f7, tA);
                                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f7, interfaceC1089h0Z);
                                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                                    if (interfaceC1084f7.m() || !kotlin.jvm.internal.i.a(interfaceC1084f7.f(), Integer.valueOf(iF))) {
                                                        androidx.compose.animation.k.b(iF, interfaceC1084f7, iF, pVar);
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f7, hVarC);
                                                    qVar4.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f7, 6);
                                                    interfaceC1084f7.J();
                                                } else {
                                                    interfaceC1084f7.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f5), interfaceC1084f5, 48);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (3670016 & i24), 0);
                l11 = l12;
                c0937i3 = c0937i4;
                z14 = z11;
                hVar2 = hVar8;
                interfaceC1029e3 = interfaceC1029e4;
                l0Var3 = l0Var2;
                kVar2 = kVar9;
                interfaceC1031g3 = interfaceC1031g5;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                c0937i3 = c0937i;
                l11 = l10;
                z14 = z11;
                interfaceC1029e3 = interfaceC1029e2;
                l0Var3 = l0Var2;
                kVar2 = kVar;
                interfaceC1031g3 = interfaceC1031g2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final InterfaceC1031g interfaceC1031g12 = interfaceC1031g3;
                final InterfaceC1029e interfaceC1029e11 = interfaceC1029e3;
                final androidx.compose.foundation.layout.L l16 = l11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ButtonKt.a(aVar, hVar2, z14, kVar2, interfaceC1031g12, l0Var3, c0937i3, interfaceC1029e11, l16, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
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
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c1086gP.K(kVar)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        interfaceC1031g8 = interfaceC1031g;
                        if (c1086gP.K(interfaceC1031g8)) {
                            interfaceC1031g6 = interfaceC1031g8;
                            i28 = 16384;
                            interfaceC1031g7 = interfaceC1031g8;
                        }
                        i12 |= i28;
                        interfaceC1031g2 = interfaceC1031g7;
                    } else {
                        interfaceC1031g6 = interfaceC1031g;
                    }
                    interfaceC1031g6 = interfaceC1031g8;
                    i28 = 8192;
                    interfaceC1031g7 = interfaceC1031g6;
                    i12 |= i28;
                    interfaceC1031g2 = interfaceC1031g7;
                } else {
                    interfaceC1031g2 = interfaceC1031g;
                }
                if ((i10 & 196608) == 0) {
                    l0Var2 = l0Var;
                    if ((i11 & 32) == 0) {
                        i27 = 65536;
                    } else {
                        i27 = 65536;
                    }
                    i12 |= i27;
                } else {
                    l0Var2 = l0Var;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    c0937i2 = c0937i;
                } else {
                    c0937i2 = c0937i;
                    if ((i10 & 1572864) == 0) {
                        if (c1086gP.K(c0937i2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 12582912) == 0) {
                    if ((i11 & 128) == 0) {
                        interfaceC1029e7 = interfaceC1029e;
                        if (c1086gP.K(interfaceC1029e7)) {
                            interfaceC1029e5 = interfaceC1029e7;
                            i26 = 8388608;
                            interfaceC1029e6 = interfaceC1029e7;
                        }
                        i12 |= i26;
                        interfaceC1029e2 = interfaceC1029e6;
                    } else {
                        interfaceC1029e5 = interfaceC1029e;
                    }
                    interfaceC1029e5 = interfaceC1029e7;
                    i26 = 4194304;
                    interfaceC1029e6 = interfaceC1029e5;
                    i12 |= i26;
                    interfaceC1029e2 = interfaceC1029e6;
                } else {
                    interfaceC1029e2 = interfaceC1029e;
                }
                i19 = 256 & i11;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(l10)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(qVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                if ((306783379 & i12) != 306783378) {
                    z12 = true;
                    z13 = true;
                } else {
                    z12 = true;
                    z13 = false;
                }
                if (c1086gP.C(i12 & 1, z13)) {
                    c1086gP.r0();
                    i22 = i10 & 1;
                    c0153a = InterfaceC1084f.a.f12980a;
                    c0908hA = null;
                    if (i22 != 0) {
                        if (i29 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = z12;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n17 = C1030f.f11882a;
                            f10 = 2;
                            f11 = 8;
                            f12 = 0;
                            f13 = 4;
                            zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                            objF = c1086gP.f();
                            if (zG) {
                                objF = new C1036l(f10, f11, f12, f13, f13);
                                c1086gP.E(objF);
                            } else {
                                objF = new C1036l(f10, f11, f12, f13, f13);
                                c1086gP.E(objF);
                            }
                            i12 &= -57345;
                            interfaceC1031g4 = (C1036l) objF;
                        } else {
                            interfaceC1031g4 = interfaceC1031g2;
                        }
                        if ((32 & i11) != 0) {
                            i12 &= -458753;
                            l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        }
                        i23 = i12;
                        if (i17 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i;
                        }
                        if ((128 & i11) != 0) {
                            z15 = false;
                            i23 &= -29360129;
                            c0153a2 = c0153a;
                            interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                        } else {
                            c0153a2 = c0153a;
                            z15 = false;
                        }
                        if (i19 != 0) {
                            interfaceC1029eA = interfaceC1029e2;
                            i24 = i23;
                            l12 = C1030f.f11882a;
                            hVar4 = hVar3;
                            kVar4 = kVar3;
                            interfaceC1029e4 = interfaceC1029eA;
                            interfaceC1031g5 = interfaceC1031g4;
                        } else {
                            interfaceC1029eA = interfaceC1029e2;
                            kVar4 = kVar3;
                            l12 = l10;
                            i24 = i23;
                            hVar4 = hVar3;
                            interfaceC1029e4 = interfaceC1029eA;
                            interfaceC1031g5 = interfaceC1031g4;
                        }
                    } else {
                        if (i29 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            z11 = z12;
                        }
                        if (i15 != 0) {
                            kVar3 = null;
                        } else {
                            kVar3 = kVar;
                        }
                        if ((16 & i11) != 0) {
                            androidx.compose.foundation.layout.N n18 = C1030f.f11882a;
                            f10 = 2;
                            f11 = 8;
                            f12 = 0;
                            f13 = 4;
                            zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                            objF = c1086gP.f();
                            if (zG) {
                                objF = new C1036l(f10, f11, f12, f13, f13);
                                c1086gP.E(objF);
                            } else {
                                objF = new C1036l(f10, f11, f12, f13, f13);
                                c1086gP.E(objF);
                            }
                            i12 &= -57345;
                            interfaceC1031g4 = (C1036l) objF;
                        } else {
                            interfaceC1031g4 = interfaceC1031g2;
                        }
                        if ((32 & i11) != 0) {
                            i12 &= -458753;
                            l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        }
                        i23 = i12;
                        if (i17 != 0) {
                            c0937i4 = null;
                        } else {
                            c0937i4 = c0937i;
                        }
                        if ((128 & i11) != 0) {
                            z15 = false;
                            i23 &= -29360129;
                            c0153a2 = c0153a;
                            interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                        } else {
                            c0153a2 = c0153a;
                            z15 = false;
                        }
                        if (i19 != 0) {
                            interfaceC1029eA = interfaceC1029e2;
                            i24 = i23;
                            l12 = C1030f.f11882a;
                            hVar4 = hVar3;
                            kVar4 = kVar3;
                            interfaceC1029e4 = interfaceC1029eA;
                            interfaceC1031g5 = interfaceC1031g4;
                        } else {
                            interfaceC1029eA = interfaceC1029e2;
                            kVar4 = kVar3;
                            l12 = l10;
                            i24 = i23;
                            hVar4 = hVar3;
                            interfaceC1029e4 = interfaceC1029eA;
                            interfaceC1031g5 = interfaceC1031g4;
                        }
                    }
                    c1086gP.U();
                    if (kVar4 == null) {
                        c1086gP.L(1050689923);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a2) {
                            objF2 = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF2);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF2;
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-243202092);
                        c1086gP.T(z15);
                        kVar5 = kVar4;
                    }
                    i25 = i24 >> 6;
                    androidx.compose.foundation.interaction.k kVar10 = kVar4;
                    final N0<androidx.compose.ui.graphics.H> xA5 = interfaceC1029e4.a(z11, c1086gP);
                    androidx.compose.ui.h hVarB5 = androidx.compose.ui.semantics.p.b(hVar4, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$1
                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            androidx.compose.ui.semantics.t.k(wVar, 0);
                            return p293xa.r.f47939a;
                        }
                    });
                    long j13 = ((androidx.compose.ui.graphics.H) interfaceC1029e4.b(z11, c1086gP).getValue()).f13506a;
                    androidx.compose.ui.h hVar9 = hVar4;
                    long jB5 = androidx.compose.ui.graphics.H.b(1.0f, ((androidx.compose.ui.graphics.H) xA5.getValue()).f13506a);
                    if (interfaceC1031g5 == null) {
                        c1086gP.L(1051096580);
                        z16 = false;
                    } else {
                        z16 = false;
                        c1086gP.L(-243188323);
                        c0908hA = interfaceC1031g5.a(z11, kVar5, c1086gP, i25 & 910);
                    }
                    c1086gP.T(z16);
                    c0908h = c0908hA;
                    if (c0908h != null) {
                        f14 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                    } else {
                        f14 = 0;
                    }
                    SurfaceKt.b(aVar, hVarB5, z11, l0Var2, j13, jB5, c0937i4, f14, kVar5, androidx.compose.runtime.internal.a.b(7524271, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                C1101n0 c1101n0B = ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(xA5.getValue().f13506a)));
                                final androidx.compose.foundation.layout.L l17 = l12;
                                final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                                CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(-1699085201, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue2 = num2.intValue();
                                        if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            androidx.compose.ui.text.F f15 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).f11875k;
                                            final androidx.compose.foundation.layout.L l18 = l17;
                                            final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3 = qVar2;
                                            TextKt.a(f15, androidx.compose.runtime.internal.a.b(-630330208, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // Ia.p
                                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                    InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                    int iIntValue3 = num3.intValue();
                                                    if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                        androidx.compose.ui.h hVarE = PaddingKt.e(W.a(C1030f.f11883b, C1030f.f11884c, androidx.compose.ui.h.a.f13984b), l18);
                                                        C0945e.c cVar = C0945e.f10288e;
                                                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                                        Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar4 = qVar3;
                                                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f7, 54);
                                                        int iF = interfaceC1084f7.F();
                                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f7.z();
                                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f7, hVarE);
                                                        ComposeUiNode.f14331c0.getClass();
                                                        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                                        if (interfaceC1084f7.u() == null) {
                                                            I.b.k();
                                                            throw null;
                                                        }
                                                        interfaceC1084f7.r();
                                                        if (interfaceC1084f7.m()) {
                                                            interfaceC1084f7.v(aVar2);
                                                        } else {
                                                            interfaceC1084f7.A();
                                                        }
                                                        R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f7, tA);
                                                        R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f7, interfaceC1089h0Z);
                                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                                        if (interfaceC1084f7.m() || !kotlin.jvm.internal.i.a(interfaceC1084f7.f(), Integer.valueOf(iF))) {
                                                            androidx.compose.animation.k.b(iF, interfaceC1084f7, iF, pVar);
                                                        }
                                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f7, hVarC);
                                                        qVar4.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f7, 6);
                                                        interfaceC1084f7.J();
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), interfaceC1084f5, 48);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 56);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (3670016 & i24), 0);
                    l11 = l12;
                    c0937i3 = c0937i4;
                    z14 = z11;
                    hVar2 = hVar9;
                    interfaceC1029e3 = interfaceC1029e4;
                    l0Var3 = l0Var2;
                    kVar2 = kVar10;
                    interfaceC1031g3 = interfaceC1031g5;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    c0937i3 = c0937i;
                    l11 = l10;
                    z14 = z11;
                    interfaceC1029e3 = interfaceC1029e2;
                    l0Var3 = l0Var2;
                    kVar2 = kVar;
                    interfaceC1031g3 = interfaceC1031g2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final InterfaceC1031g interfaceC1031g13 = interfaceC1031g3;
                    final InterfaceC1029e interfaceC1029e12 = interfaceC1029e3;
                    final androidx.compose.foundation.layout.L l17 = l11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ButtonKt.a(aVar, hVar2, z14, kVar2, interfaceC1031g13, l0Var3, c0937i3, interfaceC1029e12, l17, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    interfaceC1031g8 = interfaceC1031g;
                    if (c1086gP.K(interfaceC1031g8)) {
                        interfaceC1031g6 = interfaceC1031g8;
                        i28 = 16384;
                        interfaceC1031g7 = interfaceC1031g8;
                    }
                    i12 |= i28;
                    interfaceC1031g2 = interfaceC1031g7;
                } else {
                    interfaceC1031g6 = interfaceC1031g;
                }
                interfaceC1031g6 = interfaceC1031g8;
                i28 = 8192;
                interfaceC1031g7 = interfaceC1031g6;
                i12 |= i28;
                interfaceC1031g2 = interfaceC1031g7;
            } else {
                interfaceC1031g2 = interfaceC1031g;
            }
            if ((i10 & 196608) == 0) {
                l0Var2 = l0Var;
                if ((i11 & 32) == 0) {
                    i27 = 65536;
                } else {
                    i27 = 65536;
                }
                i12 |= i27;
            } else {
                l0Var2 = l0Var;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                c0937i2 = c0937i;
            } else {
                c0937i2 = c0937i;
                if ((i10 & 1572864) == 0) {
                    if (c1086gP.K(c0937i2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 12582912) == 0) {
                if ((i11 & 128) == 0) {
                    interfaceC1029e7 = interfaceC1029e;
                    if (c1086gP.K(interfaceC1029e7)) {
                        interfaceC1029e5 = interfaceC1029e7;
                        i26 = 8388608;
                        interfaceC1029e6 = interfaceC1029e7;
                    }
                    i12 |= i26;
                    interfaceC1029e2 = interfaceC1029e6;
                } else {
                    interfaceC1029e5 = interfaceC1029e;
                }
                interfaceC1029e5 = interfaceC1029e7;
                i26 = 4194304;
                interfaceC1029e6 = interfaceC1029e5;
                i12 |= i26;
                interfaceC1029e2 = interfaceC1029e6;
            } else {
                interfaceC1029e2 = interfaceC1029e;
            }
            i19 = 256 & i11;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(l10)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(qVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
                z13 = true;
            } else {
                z12 = true;
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                i22 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                c0908hA = null;
                if (i22 != 0) {
                    if (i29 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = z12;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n19 = C1030f.f11882a;
                        f10 = 2;
                        f11 = 8;
                        f12 = 0;
                        f13 = 4;
                        zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                        objF = c1086gP.f();
                        if (zG) {
                            objF = new C1036l(f10, f11, f12, f13, f13);
                            c1086gP.E(objF);
                        } else {
                            objF = new C1036l(f10, f11, f12, f13, f13);
                            c1086gP.E(objF);
                        }
                        i12 &= -57345;
                        interfaceC1031g4 = (C1036l) objF;
                    } else {
                        interfaceC1031g4 = interfaceC1031g2;
                    }
                    if ((32 & i11) != 0) {
                        i12 &= -458753;
                        l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    }
                    i23 = i12;
                    if (i17 != 0) {
                        c0937i4 = null;
                    } else {
                        c0937i4 = c0937i;
                    }
                    if ((128 & i11) != 0) {
                        z15 = false;
                        i23 &= -29360129;
                        c0153a2 = c0153a;
                        interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                    } else {
                        c0153a2 = c0153a;
                        z15 = false;
                    }
                    if (i19 != 0) {
                        interfaceC1029eA = interfaceC1029e2;
                        i24 = i23;
                        l12 = C1030f.f11882a;
                        hVar4 = hVar3;
                        kVar4 = kVar3;
                        interfaceC1029e4 = interfaceC1029eA;
                        interfaceC1031g5 = interfaceC1031g4;
                    } else {
                        interfaceC1029eA = interfaceC1029e2;
                        kVar4 = kVar3;
                        l12 = l10;
                        i24 = i23;
                        hVar4 = hVar3;
                        interfaceC1029e4 = interfaceC1029eA;
                        interfaceC1031g5 = interfaceC1031g4;
                    }
                } else {
                    if (i29 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = z12;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n110 = C1030f.f11882a;
                        f10 = 2;
                        f11 = 8;
                        f12 = 0;
                        f13 = 4;
                        zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                        objF = c1086gP.f();
                        if (zG) {
                            objF = new C1036l(f10, f11, f12, f13, f13);
                            c1086gP.E(objF);
                        } else {
                            objF = new C1036l(f10, f11, f12, f13, f13);
                            c1086gP.E(objF);
                        }
                        i12 &= -57345;
                        interfaceC1031g4 = (C1036l) objF;
                    } else {
                        interfaceC1031g4 = interfaceC1031g2;
                    }
                    if ((32 & i11) != 0) {
                        i12 &= -458753;
                        l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    }
                    i23 = i12;
                    if (i17 != 0) {
                        c0937i4 = null;
                    } else {
                        c0937i4 = c0937i;
                    }
                    if ((128 & i11) != 0) {
                        z15 = false;
                        i23 &= -29360129;
                        c0153a2 = c0153a;
                        interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                    } else {
                        c0153a2 = c0153a;
                        z15 = false;
                    }
                    if (i19 != 0) {
                        interfaceC1029eA = interfaceC1029e2;
                        i24 = i23;
                        l12 = C1030f.f11882a;
                        hVar4 = hVar3;
                        kVar4 = kVar3;
                        interfaceC1029e4 = interfaceC1029eA;
                        interfaceC1031g5 = interfaceC1031g4;
                    } else {
                        interfaceC1029eA = interfaceC1029e2;
                        kVar4 = kVar3;
                        l12 = l10;
                        i24 = i23;
                        hVar4 = hVar3;
                        interfaceC1029e4 = interfaceC1029eA;
                        interfaceC1031g5 = interfaceC1031g4;
                    }
                }
                c1086gP.U();
                if (kVar4 == null) {
                    c1086gP.L(1050689923);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a2) {
                        objF2 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF2);
                    }
                    kVar5 = (androidx.compose.foundation.interaction.k) objF2;
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-243202092);
                    c1086gP.T(z15);
                    kVar5 = kVar4;
                }
                i25 = i24 >> 6;
                androidx.compose.foundation.interaction.k kVar11 = kVar4;
                final N0<androidx.compose.ui.graphics.H> xA6 = interfaceC1029e4.a(z11, c1086gP);
                androidx.compose.ui.h hVarB6 = androidx.compose.ui.semantics.p.b(hVar4, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                });
                long j14 = ((androidx.compose.ui.graphics.H) interfaceC1029e4.b(z11, c1086gP).getValue()).f13506a;
                androidx.compose.ui.h hVar10 = hVar4;
                long jB6 = androidx.compose.ui.graphics.H.b(1.0f, ((androidx.compose.ui.graphics.H) xA6.getValue()).f13506a);
                if (interfaceC1031g5 == null) {
                    c1086gP.L(1051096580);
                    z16 = false;
                } else {
                    z16 = false;
                    c1086gP.L(-243188323);
                    c0908hA = interfaceC1031g5.a(z11, kVar5, c1086gP, i25 & 910);
                }
                c1086gP.T(z16);
                c0908h = c0908hA;
                if (c0908h != null) {
                    f14 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                } else {
                    f14 = 0;
                }
                SurfaceKt.b(aVar, hVarB6, z11, l0Var2, j14, jB6, c0937i4, f14, kVar5, androidx.compose.runtime.internal.a.b(7524271, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            C1101n0 c1101n0B = ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(xA6.getValue().f13506a)));
                            final androidx.compose.foundation.layout.L l18 = l12;
                            final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(-1699085201, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        androidx.compose.ui.text.F f15 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).f11875k;
                                        final androidx.compose.foundation.layout.L l19 = l18;
                                        final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3 = qVar2;
                                        TextKt.a(f15, androidx.compose.runtime.internal.a.b(-630330208, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // Ia.p
                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                int iIntValue3 = num3.intValue();
                                                if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    androidx.compose.ui.h hVarE = PaddingKt.e(W.a(C1030f.f11883b, C1030f.f11884c, androidx.compose.ui.h.a.f13984b), l19);
                                                    C0945e.c cVar = C0945e.f10288e;
                                                    androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                                    Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar4 = qVar3;
                                                    androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f7, 54);
                                                    int iF = interfaceC1084f7.F();
                                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f7.z();
                                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f7, hVarE);
                                                    ComposeUiNode.f14331c0.getClass();
                                                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                                    if (interfaceC1084f7.u() == null) {
                                                        I.b.k();
                                                        throw null;
                                                    }
                                                    interfaceC1084f7.r();
                                                    if (interfaceC1084f7.m()) {
                                                        interfaceC1084f7.v(aVar2);
                                                    } else {
                                                        interfaceC1084f7.A();
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f7, tA);
                                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f7, interfaceC1089h0Z);
                                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                                    if (interfaceC1084f7.m() || !kotlin.jvm.internal.i.a(interfaceC1084f7.f(), Integer.valueOf(iF))) {
                                                        androidx.compose.animation.k.b(iF, interfaceC1084f7, iF, pVar);
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f7, hVarC);
                                                    qVar4.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f7, 6);
                                                    interfaceC1084f7.J();
                                                } else {
                                                    interfaceC1084f7.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f5), interfaceC1084f5, 48);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (3670016 & i24), 0);
                l11 = l12;
                c0937i3 = c0937i4;
                z14 = z11;
                hVar2 = hVar10;
                interfaceC1029e3 = interfaceC1029e4;
                l0Var3 = l0Var2;
                kVar2 = kVar11;
                interfaceC1031g3 = interfaceC1031g5;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                c0937i3 = c0937i;
                l11 = l10;
                z14 = z11;
                interfaceC1029e3 = interfaceC1029e2;
                l0Var3 = l0Var2;
                kVar2 = kVar;
                interfaceC1031g3 = interfaceC1031g2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final InterfaceC1031g interfaceC1031g14 = interfaceC1031g3;
                final InterfaceC1029e interfaceC1029e13 = interfaceC1029e3;
                final androidx.compose.foundation.layout.L l18 = l11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ButtonKt.a(aVar, hVar2, z14, kVar2, interfaceC1031g14, l0Var3, c0937i3, interfaceC1029e13, l18, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        z11 = z10;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                if (c1086gP.K(kVar)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    interfaceC1031g8 = interfaceC1031g;
                    if (c1086gP.K(interfaceC1031g8)) {
                        interfaceC1031g6 = interfaceC1031g8;
                        i28 = 16384;
                        interfaceC1031g7 = interfaceC1031g8;
                    }
                    i12 |= i28;
                    interfaceC1031g2 = interfaceC1031g7;
                } else {
                    interfaceC1031g6 = interfaceC1031g;
                }
                interfaceC1031g6 = interfaceC1031g8;
                i28 = 8192;
                interfaceC1031g7 = interfaceC1031g6;
                i12 |= i28;
                interfaceC1031g2 = interfaceC1031g7;
            } else {
                interfaceC1031g2 = interfaceC1031g;
            }
            if ((i10 & 196608) == 0) {
                l0Var2 = l0Var;
                if ((i11 & 32) == 0) {
                    i27 = 65536;
                } else {
                    i27 = 65536;
                }
                i12 |= i27;
            } else {
                l0Var2 = l0Var;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                c0937i2 = c0937i;
            } else {
                c0937i2 = c0937i;
                if ((i10 & 1572864) == 0) {
                    if (c1086gP.K(c0937i2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 12582912) == 0) {
                if ((i11 & 128) == 0) {
                    interfaceC1029e7 = interfaceC1029e;
                    if (c1086gP.K(interfaceC1029e7)) {
                        interfaceC1029e5 = interfaceC1029e7;
                        i26 = 8388608;
                        interfaceC1029e6 = interfaceC1029e7;
                    }
                    i12 |= i26;
                    interfaceC1029e2 = interfaceC1029e6;
                } else {
                    interfaceC1029e5 = interfaceC1029e;
                }
                interfaceC1029e5 = interfaceC1029e7;
                i26 = 4194304;
                interfaceC1029e6 = interfaceC1029e5;
                i12 |= i26;
                interfaceC1029e2 = interfaceC1029e6;
            } else {
                interfaceC1029e2 = interfaceC1029e;
            }
            i19 = 256 & i11;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(l10)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(qVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            if ((306783379 & i12) != 306783378) {
                z12 = true;
                z13 = true;
            } else {
                z12 = true;
                z13 = false;
            }
            if (c1086gP.C(i12 & 1, z13)) {
                c1086gP.r0();
                i22 = i10 & 1;
                c0153a = InterfaceC1084f.a.f12980a;
                c0908hA = null;
                if (i22 != 0) {
                    if (i29 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = z12;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n111 = C1030f.f11882a;
                        f10 = 2;
                        f11 = 8;
                        f12 = 0;
                        f13 = 4;
                        zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                        objF = c1086gP.f();
                        if (zG) {
                            objF = new C1036l(f10, f11, f12, f13, f13);
                            c1086gP.E(objF);
                        } else {
                            objF = new C1036l(f10, f11, f12, f13, f13);
                            c1086gP.E(objF);
                        }
                        i12 &= -57345;
                        interfaceC1031g4 = (C1036l) objF;
                    } else {
                        interfaceC1031g4 = interfaceC1031g2;
                    }
                    if ((32 & i11) != 0) {
                        i12 &= -458753;
                        l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    }
                    i23 = i12;
                    if (i17 != 0) {
                        c0937i4 = null;
                    } else {
                        c0937i4 = c0937i;
                    }
                    if ((128 & i11) != 0) {
                        z15 = false;
                        i23 &= -29360129;
                        c0153a2 = c0153a;
                        interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                    } else {
                        c0153a2 = c0153a;
                        z15 = false;
                    }
                    if (i19 != 0) {
                        interfaceC1029eA = interfaceC1029e2;
                        i24 = i23;
                        l12 = C1030f.f11882a;
                        hVar4 = hVar3;
                        kVar4 = kVar3;
                        interfaceC1029e4 = interfaceC1029eA;
                        interfaceC1031g5 = interfaceC1031g4;
                    } else {
                        interfaceC1029eA = interfaceC1029e2;
                        kVar4 = kVar3;
                        l12 = l10;
                        i24 = i23;
                        hVar4 = hVar3;
                        interfaceC1029e4 = interfaceC1029eA;
                        interfaceC1031g5 = interfaceC1031g4;
                    }
                } else {
                    if (i29 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        z11 = z12;
                    }
                    if (i15 != 0) {
                        kVar3 = null;
                    } else {
                        kVar3 = kVar;
                    }
                    if ((16 & i11) != 0) {
                        androidx.compose.foundation.layout.N n112 = C1030f.f11882a;
                        f10 = 2;
                        f11 = 8;
                        f12 = 0;
                        f13 = 4;
                        zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                        objF = c1086gP.f();
                        if (zG) {
                            objF = new C1036l(f10, f11, f12, f13, f13);
                            c1086gP.E(objF);
                        } else {
                            objF = new C1036l(f10, f11, f12, f13, f13);
                            c1086gP.E(objF);
                        }
                        i12 &= -57345;
                        interfaceC1031g4 = (C1036l) objF;
                    } else {
                        interfaceC1031g4 = interfaceC1031g2;
                    }
                    if ((32 & i11) != 0) {
                        i12 &= -458753;
                        l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    }
                    i23 = i12;
                    if (i17 != 0) {
                        c0937i4 = null;
                    } else {
                        c0937i4 = c0937i;
                    }
                    if ((128 & i11) != 0) {
                        z15 = false;
                        i23 &= -29360129;
                        c0153a2 = c0153a;
                        interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                    } else {
                        c0153a2 = c0153a;
                        z15 = false;
                    }
                    if (i19 != 0) {
                        interfaceC1029eA = interfaceC1029e2;
                        i24 = i23;
                        l12 = C1030f.f11882a;
                        hVar4 = hVar3;
                        kVar4 = kVar3;
                        interfaceC1029e4 = interfaceC1029eA;
                        interfaceC1031g5 = interfaceC1031g4;
                    } else {
                        interfaceC1029eA = interfaceC1029e2;
                        kVar4 = kVar3;
                        l12 = l10;
                        i24 = i23;
                        hVar4 = hVar3;
                        interfaceC1029e4 = interfaceC1029eA;
                        interfaceC1031g5 = interfaceC1031g4;
                    }
                }
                c1086gP.U();
                if (kVar4 == null) {
                    c1086gP.L(1050689923);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a2) {
                        objF2 = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF2);
                    }
                    kVar5 = (androidx.compose.foundation.interaction.k) objF2;
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-243202092);
                    c1086gP.T(z15);
                    kVar5 = kVar4;
                }
                i25 = i24 >> 6;
                androidx.compose.foundation.interaction.k kVar12 = kVar4;
                final N0<androidx.compose.ui.graphics.H> xA7 = interfaceC1029e4.a(z11, c1086gP);
                androidx.compose.ui.h hVarB7 = androidx.compose.ui.semantics.p.b(hVar4, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$1
                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        androidx.compose.ui.semantics.t.k(wVar, 0);
                        return p293xa.r.f47939a;
                    }
                });
                long j15 = ((androidx.compose.ui.graphics.H) interfaceC1029e4.b(z11, c1086gP).getValue()).f13506a;
                androidx.compose.ui.h hVar11 = hVar4;
                long jB7 = androidx.compose.ui.graphics.H.b(1.0f, ((androidx.compose.ui.graphics.H) xA7.getValue()).f13506a);
                if (interfaceC1031g5 == null) {
                    c1086gP.L(1051096580);
                    z16 = false;
                } else {
                    z16 = false;
                    c1086gP.L(-243188323);
                    c0908hA = interfaceC1031g5.a(z11, kVar5, c1086gP, i25 & 910);
                }
                c1086gP.T(z16);
                c0908h = c0908hA;
                if (c0908h != null) {
                    f14 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
                } else {
                    f14 = 0;
                }
                SurfaceKt.b(aVar, hVarB7, z11, l0Var2, j15, jB7, c0937i4, f14, kVar5, androidx.compose.runtime.internal.a.b(7524271, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            C1101n0 c1101n0B = ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(xA7.getValue().f13506a)));
                            final androidx.compose.foundation.layout.L l19 = l12;
                            final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                            CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(-1699085201, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue2 = num2.intValue();
                                    if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        androidx.compose.ui.text.F f15 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).f11875k;
                                        final androidx.compose.foundation.layout.L l110 = l19;
                                        final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3 = qVar2;
                                        TextKt.a(f15, androidx.compose.runtime.internal.a.b(-630330208, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // Ia.p
                                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                                InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                                int iIntValue3 = num3.intValue();
                                                if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    androidx.compose.ui.h hVarE = PaddingKt.e(W.a(C1030f.f11883b, C1030f.f11884c, androidx.compose.ui.h.a.f13984b), l110);
                                                    C0945e.c cVar = C0945e.f10288e;
                                                    androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                                    Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar4 = qVar3;
                                                    androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f7, 54);
                                                    int iF = interfaceC1084f7.F();
                                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f7.z();
                                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f7, hVarE);
                                                    ComposeUiNode.f14331c0.getClass();
                                                    Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                                    if (interfaceC1084f7.u() == null) {
                                                        I.b.k();
                                                        throw null;
                                                    }
                                                    interfaceC1084f7.r();
                                                    if (interfaceC1084f7.m()) {
                                                        interfaceC1084f7.v(aVar2);
                                                    } else {
                                                        interfaceC1084f7.A();
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f7, tA);
                                                    R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f7, interfaceC1089h0Z);
                                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                                    if (interfaceC1084f7.m() || !kotlin.jvm.internal.i.a(interfaceC1084f7.f(), Integer.valueOf(iF))) {
                                                        androidx.compose.animation.k.b(iF, interfaceC1084f7, iF, pVar);
                                                    }
                                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f7, hVarC);
                                                    qVar4.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f7, 6);
                                                    interfaceC1084f7.J();
                                                } else {
                                                    interfaceC1084f7.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f5), interfaceC1084f5, 48);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 56);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (3670016 & i24), 0);
                l11 = l12;
                c0937i3 = c0937i4;
                z14 = z11;
                hVar2 = hVar11;
                interfaceC1029e3 = interfaceC1029e4;
                l0Var3 = l0Var2;
                kVar2 = kVar12;
                interfaceC1031g3 = interfaceC1031g5;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                c0937i3 = c0937i;
                l11 = l10;
                z14 = z11;
                interfaceC1029e3 = interfaceC1029e2;
                l0Var3 = l0Var2;
                kVar2 = kVar;
                interfaceC1031g3 = interfaceC1031g2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final InterfaceC1031g interfaceC1031g15 = interfaceC1031g3;
                final InterfaceC1029e interfaceC1029e14 = interfaceC1029e3;
                final androidx.compose.foundation.layout.L l19 = l11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ButtonKt.a(aVar, hVar2, z14, kVar2, interfaceC1031g15, l0Var3, c0937i3, interfaceC1029e14, l19, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                interfaceC1031g8 = interfaceC1031g;
                if (c1086gP.K(interfaceC1031g8)) {
                    interfaceC1031g6 = interfaceC1031g8;
                    i28 = 16384;
                    interfaceC1031g7 = interfaceC1031g8;
                }
                i12 |= i28;
                interfaceC1031g2 = interfaceC1031g7;
            } else {
                interfaceC1031g6 = interfaceC1031g;
            }
            interfaceC1031g6 = interfaceC1031g8;
            i28 = 8192;
            interfaceC1031g7 = interfaceC1031g6;
            i12 |= i28;
            interfaceC1031g2 = interfaceC1031g7;
        } else {
            interfaceC1031g2 = interfaceC1031g;
        }
        if ((i10 & 196608) == 0) {
            l0Var2 = l0Var;
            if ((i11 & 32) == 0) {
                i27 = 65536;
            } else {
                i27 = 65536;
            }
            i12 |= i27;
        } else {
            l0Var2 = l0Var;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
            c0937i2 = c0937i;
        } else {
            c0937i2 = c0937i;
            if ((i10 & 1572864) == 0) {
                if (c1086gP.K(c0937i2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
        }
        if ((i10 & 12582912) == 0) {
            if ((i11 & 128) == 0) {
                interfaceC1029e7 = interfaceC1029e;
                if (c1086gP.K(interfaceC1029e7)) {
                    interfaceC1029e5 = interfaceC1029e7;
                    i26 = 8388608;
                    interfaceC1029e6 = interfaceC1029e7;
                }
                i12 |= i26;
                interfaceC1029e2 = interfaceC1029e6;
            } else {
                interfaceC1029e5 = interfaceC1029e;
            }
            interfaceC1029e5 = interfaceC1029e7;
            i26 = 4194304;
            interfaceC1029e6 = interfaceC1029e5;
            i12 |= i26;
            interfaceC1029e2 = interfaceC1029e6;
        } else {
            interfaceC1029e2 = interfaceC1029e;
        }
        i19 = 256 & i11;
        if (i19 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.K(l10)) {
                i20 = 67108864;
            } else {
                i20 = 33554432;
            }
            i12 |= i20;
        }
        if ((i11 & 512) != 0) {
            i12 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c1086gP.k(qVar)) {
                i21 = 536870912;
            } else {
                i21 = 268435456;
            }
            i12 |= i21;
        }
        if ((306783379 & i12) != 306783378) {
            z12 = true;
            z13 = true;
        } else {
            z12 = true;
            z13 = false;
        }
        if (c1086gP.C(i12 & 1, z13)) {
            c1086gP.r0();
            i22 = i10 & 1;
            c0153a = InterfaceC1084f.a.f12980a;
            c0908hA = null;
            if (i22 != 0) {
                if (i29 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if (i13 != 0) {
                    z11 = z12;
                }
                if (i15 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                }
                if ((16 & i11) != 0) {
                    androidx.compose.foundation.layout.N n113 = C1030f.f11882a;
                    f10 = 2;
                    f11 = 8;
                    f12 = 0;
                    f13 = 4;
                    zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                    objF = c1086gP.f();
                    if (zG) {
                        objF = new C1036l(f10, f11, f12, f13, f13);
                        c1086gP.E(objF);
                    } else {
                        objF = new C1036l(f10, f11, f12, f13, f13);
                        c1086gP.E(objF);
                    }
                    i12 &= -57345;
                    interfaceC1031g4 = (C1036l) objF;
                } else {
                    interfaceC1031g4 = interfaceC1031g2;
                }
                if ((32 & i11) != 0) {
                    i12 &= -458753;
                    l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                }
                i23 = i12;
                if (i17 != 0) {
                    c0937i4 = null;
                } else {
                    c0937i4 = c0937i;
                }
                if ((128 & i11) != 0) {
                    z15 = false;
                    i23 &= -29360129;
                    c0153a2 = c0153a;
                    interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                } else {
                    c0153a2 = c0153a;
                    z15 = false;
                }
                if (i19 != 0) {
                    interfaceC1029eA = interfaceC1029e2;
                    i24 = i23;
                    l12 = C1030f.f11882a;
                    hVar4 = hVar3;
                    kVar4 = kVar3;
                    interfaceC1029e4 = interfaceC1029eA;
                    interfaceC1031g5 = interfaceC1031g4;
                } else {
                    interfaceC1029eA = interfaceC1029e2;
                    kVar4 = kVar3;
                    l12 = l10;
                    i24 = i23;
                    hVar4 = hVar3;
                    interfaceC1029e4 = interfaceC1029eA;
                    interfaceC1031g5 = interfaceC1031g4;
                }
            } else {
                if (i29 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if (i13 != 0) {
                    z11 = z12;
                }
                if (i15 != 0) {
                    kVar3 = null;
                } else {
                    kVar3 = kVar;
                }
                if ((16 & i11) != 0) {
                    androidx.compose.foundation.layout.N n114 = C1030f.f11882a;
                    f10 = 2;
                    f11 = 8;
                    f12 = 0;
                    f13 = 4;
                    zG = c1086gP.g(f10) | c1086gP.g(f11) | c1086gP.g(f12) | c1086gP.g(f13) | c1086gP.g(f13);
                    objF = c1086gP.f();
                    if (zG) {
                        objF = new C1036l(f10, f11, f12, f13, f13);
                        c1086gP.E(objF);
                    } else {
                        objF = new C1036l(f10, f11, f12, f13, f13);
                        c1086gP.E(objF);
                    }
                    i12 &= -57345;
                    interfaceC1031g4 = (C1036l) objF;
                } else {
                    interfaceC1031g4 = interfaceC1031g2;
                }
                if ((32 & i11) != 0) {
                    i12 &= -458753;
                    l0Var2 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                }
                i23 = i12;
                if (i17 != 0) {
                    c0937i4 = null;
                } else {
                    c0937i4 = c0937i;
                }
                if ((128 & i11) != 0) {
                    z15 = false;
                    i23 &= -29360129;
                    c0153a2 = c0153a;
                    interfaceC1029eA = C1030f.a(0L, 0L, 0L, c1086gP, 24576, 15);
                } else {
                    c0153a2 = c0153a;
                    z15 = false;
                }
                if (i19 != 0) {
                    interfaceC1029eA = interfaceC1029e2;
                    i24 = i23;
                    l12 = C1030f.f11882a;
                    hVar4 = hVar3;
                    kVar4 = kVar3;
                    interfaceC1029e4 = interfaceC1029eA;
                    interfaceC1031g5 = interfaceC1031g4;
                } else {
                    interfaceC1029eA = interfaceC1029e2;
                    kVar4 = kVar3;
                    l12 = l10;
                    i24 = i23;
                    hVar4 = hVar3;
                    interfaceC1029e4 = interfaceC1029eA;
                    interfaceC1031g5 = interfaceC1031g4;
                }
            }
            c1086gP.U();
            if (kVar4 == null) {
                c1086gP.L(1050689923);
                objF2 = c1086gP.f();
                if (objF2 == c0153a2) {
                    objF2 = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF2);
                }
                kVar5 = (androidx.compose.foundation.interaction.k) objF2;
                c1086gP.T(false);
            } else {
                c1086gP.L(-243202092);
                c1086gP.T(z15);
                kVar5 = kVar4;
            }
            i25 = i24 >> 6;
            androidx.compose.foundation.interaction.k kVar13 = kVar4;
            final N0<androidx.compose.ui.graphics.H> xA8 = interfaceC1029e4.a(z11, c1086gP);
            androidx.compose.ui.h hVarB8 = androidx.compose.ui.semantics.p.b(hVar4, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$1
                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                    androidx.compose.ui.semantics.t.k(wVar, 0);
                    return p293xa.r.f47939a;
                }
            });
            long j16 = ((androidx.compose.ui.graphics.H) interfaceC1029e4.b(z11, c1086gP).getValue()).f13506a;
            androidx.compose.ui.h hVar12 = hVar4;
            long jB8 = androidx.compose.ui.graphics.H.b(1.0f, ((androidx.compose.ui.graphics.H) xA8.getValue()).f13506a);
            if (interfaceC1031g5 == null) {
                c1086gP.L(1051096580);
                z16 = false;
            } else {
                z16 = false;
                c1086gP.L(-243188323);
                c0908hA = interfaceC1031g5.a(z11, kVar5, c1086gP, i25 & 910);
            }
            c1086gP.T(z16);
            c0908h = c0908hA;
            if (c0908h != null) {
                f14 = ((p013b0.f) c0908h.f9544c.getValue()).f20481b;
            } else {
                f14 = 0;
            }
            SurfaceKt.b(aVar, hVarB8, z11, l0Var2, j16, jB8, c0937i4, f14, kVar5, androidx.compose.runtime.internal.a.b(7524271, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C1101n0 c1101n0B = ContentAlphaKt.f11713a.b(Float.valueOf(androidx.compose.ui.graphics.H.d(xA8.getValue().f13506a)));
                        final androidx.compose.foundation.layout.L l110 = l12;
                        final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2 = qVar;
                        CompositionLocalKt.a(c1101n0B, androidx.compose.runtime.internal.a.b(-1699085201, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f4, Integer num2) {
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                int iIntValue2 = num2.intValue();
                                if (interfaceC1084f5.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    androidx.compose.ui.text.F f15 = ((V) interfaceC1084f5.x(TypographyKt.f11864b)).f11875k;
                                    final androidx.compose.foundation.layout.L l111 = l110;
                                    final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3 = qVar2;
                                    TextKt.a(f15, androidx.compose.runtime.internal.a.b(-630330208, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt.Button.2.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // Ia.p
                                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f6, Integer num3) {
                                            InterfaceC1084f interfaceC1084f7 = interfaceC1084f6;
                                            int iIntValue3 = num3.intValue();
                                            if (interfaceC1084f7.C(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                androidx.compose.ui.h hVarE = PaddingKt.e(W.a(C1030f.f11883b, C1030f.f11884c, androidx.compose.ui.h.a.f13984b), l111);
                                                C0945e.c cVar = C0945e.f10288e;
                                                androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                                                Ia.q<androidx.compose.foundation.layout.U, InterfaceC1084f, Integer, p293xa.r> qVar4 = qVar3;
                                                androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(cVar, bVar, interfaceC1084f7, 54);
                                                int iF = interfaceC1084f7.F();
                                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f7.z();
                                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f7, hVarE);
                                                ComposeUiNode.f14331c0.getClass();
                                                Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
                                                if (interfaceC1084f7.u() == null) {
                                                    I.b.k();
                                                    throw null;
                                                }
                                                interfaceC1084f7.r();
                                                if (interfaceC1084f7.m()) {
                                                    interfaceC1084f7.v(aVar2);
                                                } else {
                                                    interfaceC1084f7.A();
                                                }
                                                R0.a(ComposeUiNode.Companion.f14337f, interfaceC1084f7, tA);
                                                R0.a(ComposeUiNode.Companion.f14336e, interfaceC1084f7, interfaceC1089h0Z);
                                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
                                                if (interfaceC1084f7.m() || !kotlin.jvm.internal.i.a(interfaceC1084f7.f(), Integer.valueOf(iF))) {
                                                    androidx.compose.animation.k.b(iF, interfaceC1084f7, iF, pVar);
                                                }
                                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f7, hVarC);
                                                qVar4.invoke(androidx.compose.foundation.layout.V.f10222a, interfaceC1084f7, 6);
                                                interfaceC1084f7.J();
                                            } else {
                                                interfaceC1084f7.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f5), interfaceC1084f5, 48);
                                } else {
                                    interfaceC1084f5.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 56);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (3670016 & i24), 0);
            l11 = l12;
            c0937i3 = c0937i4;
            z14 = z11;
            hVar2 = hVar12;
            interfaceC1029e3 = interfaceC1029e4;
            l0Var3 = l0Var2;
            kVar2 = kVar13;
            interfaceC1031g3 = interfaceC1031g5;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            c0937i3 = c0937i;
            l11 = l10;
            z14 = z11;
            interfaceC1029e3 = interfaceC1029e2;
            l0Var3 = l0Var2;
            kVar2 = kVar;
            interfaceC1031g3 = interfaceC1031g2;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final InterfaceC1031g interfaceC1031g16 = interfaceC1031g3;
            final InterfaceC1029e interfaceC1029e15 = interfaceC1029e3;
            final androidx.compose.foundation.layout.L l110 = l11;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ButtonKt$Button$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ButtonKt.a(aVar, hVar2, z14, kVar2, interfaceC1031g16, l0Var3, c0937i3, interfaceC1029e15, l110, qVar, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(Ia.a aVar, androidx.compose.ui.h hVar, C1035k c1035k, ComposableLambdaImpl composableLambdaImpl, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        a(aVar, (i11 & 2) != 0 ? androidx.compose.ui.h.a.f13984b : hVar, true, null, null, ((N) interfaceC1084f.x(ShapesKt.f11807a)).f11775a, null, (i11 & 128) != 0 ? C1030f.b(0L, interfaceC1084f, 7) : c1035k, C1030f.f11885d, composableLambdaImpl, interfaceC1084f, i10 & 2147483646, 0);
    }
}
