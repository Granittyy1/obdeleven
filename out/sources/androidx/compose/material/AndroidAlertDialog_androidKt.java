package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0106  */
    /* JADX WARN: Code duplicated, block: B:101:0x010b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0111  */
    /* JADX WARN: Code duplicated, block: B:105:0x0117  */
    /* JADX WARN: Code duplicated, block: B:106:0x011a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0128  */
    /* JADX WARN: Code duplicated, block: B:111:0x012a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0133  */
    /* JADX WARN: Code duplicated, block: B:116:0x0143  */
    /* JADX WARN: Code duplicated, block: B:129:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x016e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0171  */
    /* JADX WARN: Code duplicated, block: B:134:0x0176  */
    /* JADX WARN: Code duplicated, block: B:136:0x0179  */
    /* JADX WARN: Code duplicated, block: B:139:0x017d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0183  */
    /* JADX WARN: Code duplicated, block: B:143:0x0190  */
    /* JADX WARN: Code duplicated, block: B:146:0x0196  */
    /* JADX WARN: Code duplicated, block: B:147:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:153:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:155:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:157:0x0227  */
    /* JADX WARN: Code duplicated, block: B:160:0x023d  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x00fe  */
    public static final void a(final Ia.a<p293xa.r> aVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, androidx.compose.ui.h hVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, l0 l0Var, long j, long j10, androidx.compose.ui.window.f fVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5;
        int i14;
        int i15;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6;
        int i16;
        int i17;
        int i18;
        long j11;
        int i19;
        int i20;
        boolean z10;
        final androidx.compose.ui.h hVar2;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9;
        final long jB;
        final l0 l0Var2;
        final long j12;
        final androidx.compose.ui.window.f fVar2;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar3;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar10;
        l0 l0Var3;
        long jH;
        androidx.compose.ui.window.f fVar3;
        int i21;
        l0 l0Var4;
        int i22;
        int i23;
        C1086g c1086gP = interfaceC1084f.p(-606536823);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c1086gP.k(pVar) ? 32 : 16;
        }
        int i24 = i11 & 4;
        if (i24 == 0) {
            if ((i10 & 384) == 0) {
                i12 |= c1086gP.K(hVar) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    pVar5 = pVar2;
                    if (c1086gP.k(pVar5)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        pVar6 = pVar3;
                        if (c1086gP.k(pVar6)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            if (c1086gP.k(pVar4)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((1572864 & i10) != 0) {
                            i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
                        }
                        if ((12582912 & i10) != 0) {
                            if ((i11 & 128) == 0 || !c1086gP.i(j)) {
                                i23 = 4194304;
                            } else {
                                i23 = 8388608;
                            }
                            i12 |= i23;
                        }
                        if ((100663296 & i10) == 0) {
                            j11 = j10;
                            if ((i11 & 256) == 0 || !c1086gP.i(j11)) {
                                i22 = 33554432;
                            } else {
                                i22 = 67108864;
                            }
                            i12 |= i22;
                        } else {
                            j11 = j10;
                        }
                        i19 = i11 & 512;
                        if (i19 != 0) {
                            i12 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c1086gP.K(fVar)) {
                                i20 = 536870912;
                            } else {
                                i20 = 268435456;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 306783379) != 306783378) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i12 & 1, z10)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0 || c1086gP.a0()) {
                                if (i24 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar;
                                }
                                if (i13 != 0) {
                                    pVar5 = null;
                                }
                                if (i15 != 0) {
                                    pVar6 = null;
                                }
                                pVar10 = i17 == 0 ? pVar4 : null;
                                if ((i11 & 64) != 0) {
                                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                    i12 &= -3670017;
                                } else {
                                    l0Var3 = l0Var;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                                } else {
                                    jH = j;
                                }
                                if ((i11 & 256) != 0) {
                                    jB = ColorsKt.b(jH, c1086gP);
                                    i12 &= -234881025;
                                } else {
                                    jB = j11;
                                }
                                if (i19 != 0) {
                                    fVar3 = new androidx.compose.ui.window.f(7);
                                } else {
                                    fVar3 = fVar;
                                }
                                i21 = i12;
                                l0Var4 = l0Var3;
                            } else {
                                c1086gP.w();
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                if ((i11 & 256) != 0) {
                                    i12 &= -234881025;
                                }
                                hVar3 = hVar;
                                pVar10 = pVar4;
                                jH = j;
                                fVar3 = fVar;
                                jB = j11;
                                i21 = i12;
                                l0Var4 = l0Var;
                            }
                            c1086gP.U();
                            int i25 = (i21 & 14) | 48 | (i21 & 896);
                            int i26 = (2147483646 & i21) >> 3;
                            b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                                        float f10 = 8;
                                        androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11 = pVar5;
                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar12 = pVar;
                                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        int iF = interfaceC1084f3.F();
                                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar13 = ComposeUiNode.Companion.f14338g;
                                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar13);
                                        }
                                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                        AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar14 = pVar11;
                                                    if (pVar14 == null) {
                                                        interfaceC1084f5.L(-1324738946);
                                                    } else {
                                                        interfaceC1084f5.L(1481287139);
                                                        pVar14.invoke(interfaceC1084f5, 0);
                                                    }
                                                    interfaceC1084f5.D();
                                                    pVar12.invoke(interfaceC1084f5, 0);
                                                } else {
                                                    interfaceC1084f5.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f3), interfaceC1084f3, 438);
                                        interfaceC1084f3.J();
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i25 | (i26 & 7168) | (57344 & i26) | (458752 & i26) | (3670016 & i26) | (29360128 & i26) | (i26 & 234881024), 0);
                            fVar2 = fVar3;
                            l0 l0Var5 = l0Var4;
                            hVar2 = hVar3;
                            Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11 = pVar5;
                            l0Var2 = l0Var5;
                            long j13 = jH;
                            pVar7 = pVar10;
                            pVar8 = pVar11;
                            pVar9 = pVar6;
                            j12 = j13;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            pVar7 = pVar4;
                            pVar8 = pVar5;
                            pVar9 = pVar6;
                            jB = j11;
                            l0Var2 = l0Var;
                            j12 = j;
                            fVar2 = fVar;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 196608;
                    if ((1572864 & i10) != 0) {
                        i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
                    }
                    if ((12582912 & i10) != 0) {
                        if ((i11 & 128) == 0) {
                            i23 = 4194304;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    if ((100663296 & i10) == 0) {
                        j11 = j10;
                        if ((i11 & 256) == 0) {
                            i22 = 33554432;
                        } else {
                            i22 = 33554432;
                        }
                        i12 |= i22;
                    } else {
                        j11 = j10;
                    }
                    i19 = i11 & 512;
                    if (i19 != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(fVar)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            }
                            if (i15 != 0) {
                                pVar6 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -3670017;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 256) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -234881025;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                            i21 = i12;
                            l0Var4 = l0Var3;
                        } else {
                            if (i24 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            }
                            if (i15 != 0) {
                                pVar6 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -3670017;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 256) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -234881025;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                            i21 = i12;
                            l0Var4 = l0Var3;
                        }
                        c1086gP.U();
                        int i27 = (i21 & 14) | 48 | (i21 & 896);
                        int i28 = (2147483646 & i21) >> 3;
                        b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                                    float f10 = 8;
                                    androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar5;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13 = pVar;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar14 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar14);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar12;
                                                if (pVar15 == null) {
                                                    interfaceC1084f5.L(-1324738946);
                                                } else {
                                                    interfaceC1084f5.L(1481287139);
                                                    pVar15.invoke(interfaceC1084f5, 0);
                                                }
                                                interfaceC1084f5.D();
                                                pVar13.invoke(interfaceC1084f5, 0);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 438);
                                    interfaceC1084f3.J();
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i27 | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (29360128 & i28) | (i28 & 234881024), 0);
                        fVar2 = fVar3;
                        l0 l0Var6 = l0Var4;
                        hVar2 = hVar3;
                        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar5;
                        l0Var2 = l0Var6;
                        long j14 = jH;
                        pVar7 = pVar10;
                        pVar8 = pVar12;
                        pVar9 = pVar6;
                        j12 = j14;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        pVar7 = pVar4;
                        pVar8 = pVar5;
                        pVar9 = pVar6;
                        jB = j11;
                        l0Var2 = l0Var;
                        j12 = j;
                        fVar2 = fVar;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                pVar6 = pVar3;
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c1086gP.k(pVar4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) != 0) {
                        i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
                    }
                    if ((12582912 & i10) != 0) {
                        if ((i11 & 128) == 0) {
                            i23 = 4194304;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    if ((100663296 & i10) == 0) {
                        j11 = j10;
                        if ((i11 & 256) == 0) {
                            i22 = 33554432;
                        } else {
                            i22 = 33554432;
                        }
                        i12 |= i22;
                    } else {
                        j11 = j10;
                    }
                    i19 = i11 & 512;
                    if (i19 != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(fVar)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            }
                            if (i15 != 0) {
                                pVar6 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -3670017;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 256) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -234881025;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                            i21 = i12;
                            l0Var4 = l0Var3;
                        } else {
                            if (i24 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            }
                            if (i15 != 0) {
                                pVar6 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -3670017;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 256) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -234881025;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                            i21 = i12;
                            l0Var4 = l0Var3;
                        }
                        c1086gP.U();
                        int i29 = (i21 & 14) | 48 | (i21 & 896);
                        int i210 = (2147483646 & i21) >> 3;
                        b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                                    float f10 = 8;
                                    androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13 = pVar5;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14 = pVar;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar15 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar15);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar16 = pVar13;
                                                if (pVar16 == null) {
                                                    interfaceC1084f5.L(-1324738946);
                                                } else {
                                                    interfaceC1084f5.L(1481287139);
                                                    pVar16.invoke(interfaceC1084f5, 0);
                                                }
                                                interfaceC1084f5.D();
                                                pVar14.invoke(interfaceC1084f5, 0);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 438);
                                    interfaceC1084f3.J();
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i29 | (i210 & 7168) | (57344 & i210) | (458752 & i210) | (3670016 & i210) | (29360128 & i210) | (i210 & 234881024), 0);
                        fVar2 = fVar3;
                        l0 l0Var7 = l0Var4;
                        hVar2 = hVar3;
                        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13 = pVar5;
                        l0Var2 = l0Var7;
                        long j15 = jH;
                        pVar7 = pVar10;
                        pVar8 = pVar13;
                        pVar9 = pVar6;
                        j12 = j15;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        pVar7 = pVar4;
                        pVar8 = pVar5;
                        pVar9 = pVar6;
                        jB = j11;
                        l0Var2 = l0Var;
                        j12 = j;
                        fVar2 = fVar;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                if ((1572864 & i10) != 0) {
                    i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
                }
                if ((12582912 & i10) != 0) {
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                if ((100663296 & i10) == 0) {
                    j11 = j10;
                    if ((i11 & 256) == 0) {
                        i22 = 33554432;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                } else {
                    j11 = j10;
                }
                i19 = i11 & 512;
                if (i19 != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(fVar)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        }
                        if (i15 != 0) {
                            pVar6 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -3670017;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 256) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                        i21 = i12;
                        l0Var4 = l0Var3;
                    } else {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        }
                        if (i15 != 0) {
                            pVar6 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -3670017;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 256) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                        i21 = i12;
                        l0Var4 = l0Var3;
                    }
                    c1086gP.U();
                    int i211 = (i21 & 14) | 48 | (i21 & 896);
                    int i212 = (2147483646 & i21) >> 3;
                    b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                                float f10 = 8;
                                androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14 = pVar5;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar16 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar16);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar17 = pVar14;
                                            if (pVar17 == null) {
                                                interfaceC1084f5.L(-1324738946);
                                            } else {
                                                interfaceC1084f5.L(1481287139);
                                                pVar17.invoke(interfaceC1084f5, 0);
                                            }
                                            interfaceC1084f5.D();
                                            pVar15.invoke(interfaceC1084f5, 0);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 438);
                                interfaceC1084f3.J();
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i211 | (i212 & 7168) | (57344 & i212) | (458752 & i212) | (3670016 & i212) | (29360128 & i212) | (i212 & 234881024), 0);
                    fVar2 = fVar3;
                    l0 l0Var8 = l0Var4;
                    hVar2 = hVar3;
                    Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14 = pVar5;
                    l0Var2 = l0Var8;
                    long j16 = jH;
                    pVar7 = pVar10;
                    pVar8 = pVar14;
                    pVar9 = pVar6;
                    j12 = j16;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    pVar7 = pVar4;
                    pVar8 = pVar5;
                    pVar9 = pVar6;
                    jB = j11;
                    l0Var2 = l0Var;
                    j12 = j;
                    fVar2 = fVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            pVar5 = pVar2;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    pVar6 = pVar3;
                    if (c1086gP.k(pVar6)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c1086gP.k(pVar4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) != 0) {
                        i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
                    }
                    if ((12582912 & i10) != 0) {
                        if ((i11 & 128) == 0) {
                            i23 = 4194304;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    if ((100663296 & i10) == 0) {
                        j11 = j10;
                        if ((i11 & 256) == 0) {
                            i22 = 33554432;
                        } else {
                            i22 = 33554432;
                        }
                        i12 |= i22;
                    } else {
                        j11 = j10;
                    }
                    i19 = i11 & 512;
                    if (i19 != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(fVar)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            }
                            if (i15 != 0) {
                                pVar6 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -3670017;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 256) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -234881025;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                            i21 = i12;
                            l0Var4 = l0Var3;
                        } else {
                            if (i24 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            }
                            if (i15 != 0) {
                                pVar6 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -3670017;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 256) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -234881025;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                            i21 = i12;
                            l0Var4 = l0Var3;
                        }
                        c1086gP.U();
                        int i213 = (i21 & 14) | 48 | (i21 & 896);
                        int i214 = (2147483646 & i21) >> 3;
                        b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                                    float f10 = 8;
                                    androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15 = pVar5;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16 = pVar;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar17 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar17);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar18 = pVar15;
                                                if (pVar18 == null) {
                                                    interfaceC1084f5.L(-1324738946);
                                                } else {
                                                    interfaceC1084f5.L(1481287139);
                                                    pVar18.invoke(interfaceC1084f5, 0);
                                                }
                                                interfaceC1084f5.D();
                                                pVar16.invoke(interfaceC1084f5, 0);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 438);
                                    interfaceC1084f3.J();
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i213 | (i214 & 7168) | (57344 & i214) | (458752 & i214) | (3670016 & i214) | (29360128 & i214) | (i214 & 234881024), 0);
                        fVar2 = fVar3;
                        l0 l0Var9 = l0Var4;
                        hVar2 = hVar3;
                        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15 = pVar5;
                        l0Var2 = l0Var9;
                        long j17 = jH;
                        pVar7 = pVar10;
                        pVar8 = pVar15;
                        pVar9 = pVar6;
                        j12 = j17;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        pVar7 = pVar4;
                        pVar8 = pVar5;
                        pVar9 = pVar6;
                        jB = j11;
                        l0Var2 = l0Var;
                        j12 = j;
                        fVar2 = fVar;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                if ((1572864 & i10) != 0) {
                    i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
                }
                if ((12582912 & i10) != 0) {
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                if ((100663296 & i10) == 0) {
                    j11 = j10;
                    if ((i11 & 256) == 0) {
                        i22 = 33554432;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                } else {
                    j11 = j10;
                }
                i19 = i11 & 512;
                if (i19 != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(fVar)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        }
                        if (i15 != 0) {
                            pVar6 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -3670017;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 256) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                        i21 = i12;
                        l0Var4 = l0Var3;
                    } else {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        }
                        if (i15 != 0) {
                            pVar6 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -3670017;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 256) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                        i21 = i12;
                        l0Var4 = l0Var3;
                    }
                    c1086gP.U();
                    int i215 = (i21 & 14) | 48 | (i21 & 896);
                    int i216 = (2147483646 & i21) >> 3;
                    b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                                float f10 = 8;
                                androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16 = pVar5;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar18 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar18);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar19 = pVar16;
                                            if (pVar19 == null) {
                                                interfaceC1084f5.L(-1324738946);
                                            } else {
                                                interfaceC1084f5.L(1481287139);
                                                pVar19.invoke(interfaceC1084f5, 0);
                                            }
                                            interfaceC1084f5.D();
                                            pVar17.invoke(interfaceC1084f5, 0);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 438);
                                interfaceC1084f3.J();
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i215 | (i216 & 7168) | (57344 & i216) | (458752 & i216) | (3670016 & i216) | (29360128 & i216) | (i216 & 234881024), 0);
                    fVar2 = fVar3;
                    l0 l0Var10 = l0Var4;
                    hVar2 = hVar3;
                    Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16 = pVar5;
                    l0Var2 = l0Var10;
                    long j18 = jH;
                    pVar7 = pVar10;
                    pVar8 = pVar16;
                    pVar9 = pVar6;
                    j12 = j18;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    pVar7 = pVar4;
                    pVar8 = pVar5;
                    pVar9 = pVar6;
                    jB = j11;
                    l0Var2 = l0Var;
                    j12 = j;
                    fVar2 = fVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            pVar6 = pVar3;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) != 0) {
                    i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
                }
                if ((12582912 & i10) != 0) {
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                if ((100663296 & i10) == 0) {
                    j11 = j10;
                    if ((i11 & 256) == 0) {
                        i22 = 33554432;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                } else {
                    j11 = j10;
                }
                i19 = i11 & 512;
                if (i19 != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(fVar)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        }
                        if (i15 != 0) {
                            pVar6 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -3670017;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 256) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                        i21 = i12;
                        l0Var4 = l0Var3;
                    } else {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        }
                        if (i15 != 0) {
                            pVar6 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -3670017;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 256) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                        i21 = i12;
                        l0Var4 = l0Var3;
                    }
                    c1086gP.U();
                    int i217 = (i21 & 14) | 48 | (i21 & 896);
                    int i218 = (2147483646 & i21) >> 3;
                    b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                                float f10 = 8;
                                androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17 = pVar5;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar19 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar19);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar110 = pVar17;
                                            if (pVar110 == null) {
                                                interfaceC1084f5.L(-1324738946);
                                            } else {
                                                interfaceC1084f5.L(1481287139);
                                                pVar110.invoke(interfaceC1084f5, 0);
                                            }
                                            interfaceC1084f5.D();
                                            pVar18.invoke(interfaceC1084f5, 0);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 438);
                                interfaceC1084f3.J();
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i217 | (i218 & 7168) | (57344 & i218) | (458752 & i218) | (3670016 & i218) | (29360128 & i218) | (i218 & 234881024), 0);
                    fVar2 = fVar3;
                    l0 l0Var11 = l0Var4;
                    hVar2 = hVar3;
                    Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17 = pVar5;
                    l0Var2 = l0Var11;
                    long j19 = jH;
                    pVar7 = pVar10;
                    pVar8 = pVar17;
                    pVar9 = pVar6;
                    j12 = j19;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    pVar7 = pVar4;
                    pVar8 = pVar5;
                    pVar9 = pVar6;
                    jB = j11;
                    l0Var2 = l0Var;
                    j12 = j;
                    fVar2 = fVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            if ((1572864 & i10) != 0) {
                i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
            }
            if ((12582912 & i10) != 0) {
                if ((i11 & 128) == 0) {
                    i23 = 4194304;
                } else {
                    i23 = 4194304;
                }
                i12 |= i23;
            }
            if ((100663296 & i10) == 0) {
                j11 = j10;
                if ((i11 & 256) == 0) {
                    i22 = 33554432;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            } else {
                j11 = j10;
            }
            i19 = i11 & 512;
            if (i19 != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.K(fVar)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((i12 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    }
                    if (i15 != 0) {
                        pVar6 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -3670017;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 256) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                    i21 = i12;
                    l0Var4 = l0Var3;
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    }
                    if (i15 != 0) {
                        pVar6 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -3670017;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 256) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                    i21 = i12;
                    l0Var4 = l0Var3;
                }
                c1086gP.U();
                int i219 = (i21 & 14) | 48 | (i21 & 896);
                int i2110 = (2147483646 & i21) >> 3;
                b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                            float f10 = 8;
                            androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18 = pVar5;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar110 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar110);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar111 = pVar18;
                                        if (pVar111 == null) {
                                            interfaceC1084f5.L(-1324738946);
                                        } else {
                                            interfaceC1084f5.L(1481287139);
                                            pVar111.invoke(interfaceC1084f5, 0);
                                        }
                                        interfaceC1084f5.D();
                                        pVar19.invoke(interfaceC1084f5, 0);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 438);
                            interfaceC1084f3.J();
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i219 | (i2110 & 7168) | (57344 & i2110) | (458752 & i2110) | (3670016 & i2110) | (29360128 & i2110) | (i2110 & 234881024), 0);
                fVar2 = fVar3;
                l0 l0Var12 = l0Var4;
                hVar2 = hVar3;
                Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18 = pVar5;
                l0Var2 = l0Var12;
                long j110 = jH;
                pVar7 = pVar10;
                pVar8 = pVar18;
                pVar9 = pVar6;
                j12 = j110;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                pVar7 = pVar4;
                pVar8 = pVar5;
                pVar9 = pVar6;
                jB = j11;
                l0Var2 = l0Var;
                j12 = j;
                fVar2 = fVar;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                pVar5 = pVar2;
                if (c1086gP.k(pVar5)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    pVar6 = pVar3;
                    if (c1086gP.k(pVar6)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        if (c1086gP.k(pVar4)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((1572864 & i10) != 0) {
                        i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
                    }
                    if ((12582912 & i10) != 0) {
                        if ((i11 & 128) == 0) {
                            i23 = 4194304;
                        } else {
                            i23 = 4194304;
                        }
                        i12 |= i23;
                    }
                    if ((100663296 & i10) == 0) {
                        j11 = j10;
                        if ((i11 & 256) == 0) {
                            i22 = 33554432;
                        } else {
                            i22 = 33554432;
                        }
                        i12 |= i22;
                    } else {
                        j11 = j10;
                    }
                    i19 = i11 & 512;
                    if (i19 != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.K(fVar)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 306783379) != 306783378) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            }
                            if (i15 != 0) {
                                pVar6 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -3670017;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 256) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -234881025;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                            i21 = i12;
                            l0Var4 = l0Var3;
                        } else {
                            if (i24 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i13 != 0) {
                                pVar5 = null;
                            }
                            if (i15 != 0) {
                                pVar6 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 64) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -3670017;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            if ((i11 & 256) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -234881025;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                            i21 = i12;
                            l0Var4 = l0Var3;
                        }
                        c1086gP.U();
                        int i2111 = (i21 & 14) | 48 | (i21 & 896);
                        int i2112 = (2147483646 & i21) >> 3;
                        b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                                    float f10 = 8;
                                    androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19 = pVar5;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar110 = pVar;
                                    androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    int iF = interfaceC1084f3.F();
                                    InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                                    Ia.p<ComposeUiNode, Integer, p293xa.r> pVar111 = ComposeUiNode.Companion.f14338g;
                                    if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                        androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar111);
                                    }
                                    R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                    AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar112 = pVar19;
                                                if (pVar112 == null) {
                                                    interfaceC1084f5.L(-1324738946);
                                                } else {
                                                    interfaceC1084f5.L(1481287139);
                                                    pVar112.invoke(interfaceC1084f5, 0);
                                                }
                                                interfaceC1084f5.D();
                                                pVar110.invoke(interfaceC1084f5, 0);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 438);
                                    interfaceC1084f3.J();
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i2111 | (i2112 & 7168) | (57344 & i2112) | (458752 & i2112) | (3670016 & i2112) | (29360128 & i2112) | (i2112 & 234881024), 0);
                        fVar2 = fVar3;
                        l0 l0Var13 = l0Var4;
                        hVar2 = hVar3;
                        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19 = pVar5;
                        l0Var2 = l0Var13;
                        long j111 = jH;
                        pVar7 = pVar10;
                        pVar8 = pVar19;
                        pVar9 = pVar6;
                        j12 = j111;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        pVar7 = pVar4;
                        pVar8 = pVar5;
                        pVar9 = pVar6;
                        jB = j11;
                        l0Var2 = l0Var;
                        j12 = j;
                        fVar2 = fVar;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 196608;
                if ((1572864 & i10) != 0) {
                    i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
                }
                if ((12582912 & i10) != 0) {
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                if ((100663296 & i10) == 0) {
                    j11 = j10;
                    if ((i11 & 256) == 0) {
                        i22 = 33554432;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                } else {
                    j11 = j10;
                }
                i19 = i11 & 512;
                if (i19 != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(fVar)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        }
                        if (i15 != 0) {
                            pVar6 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -3670017;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 256) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                        i21 = i12;
                        l0Var4 = l0Var3;
                    } else {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        }
                        if (i15 != 0) {
                            pVar6 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -3670017;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 256) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                        i21 = i12;
                        l0Var4 = l0Var3;
                    }
                    c1086gP.U();
                    int i2113 = (i21 & 14) | 48 | (i21 & 896);
                    int i2114 = (2147483646 & i21) >> 3;
                    b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                                float f10 = 8;
                                androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar110 = pVar5;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar112 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar112);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar113 = pVar110;
                                            if (pVar113 == null) {
                                                interfaceC1084f5.L(-1324738946);
                                            } else {
                                                interfaceC1084f5.L(1481287139);
                                                pVar113.invoke(interfaceC1084f5, 0);
                                            }
                                            interfaceC1084f5.D();
                                            pVar111.invoke(interfaceC1084f5, 0);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 438);
                                interfaceC1084f3.J();
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i2113 | (i2114 & 7168) | (57344 & i2114) | (458752 & i2114) | (3670016 & i2114) | (29360128 & i2114) | (i2114 & 234881024), 0);
                    fVar2 = fVar3;
                    l0 l0Var14 = l0Var4;
                    hVar2 = hVar3;
                    Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar110 = pVar5;
                    l0Var2 = l0Var14;
                    long j112 = jH;
                    pVar7 = pVar10;
                    pVar8 = pVar110;
                    pVar9 = pVar6;
                    j12 = j112;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    pVar7 = pVar4;
                    pVar8 = pVar5;
                    pVar9 = pVar6;
                    jB = j11;
                    l0Var2 = l0Var;
                    j12 = j;
                    fVar2 = fVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            pVar6 = pVar3;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) != 0) {
                    i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
                }
                if ((12582912 & i10) != 0) {
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                if ((100663296 & i10) == 0) {
                    j11 = j10;
                    if ((i11 & 256) == 0) {
                        i22 = 33554432;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                } else {
                    j11 = j10;
                }
                i19 = i11 & 512;
                if (i19 != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(fVar)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        }
                        if (i15 != 0) {
                            pVar6 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -3670017;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 256) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                        i21 = i12;
                        l0Var4 = l0Var3;
                    } else {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        }
                        if (i15 != 0) {
                            pVar6 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -3670017;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 256) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                        i21 = i12;
                        l0Var4 = l0Var3;
                    }
                    c1086gP.U();
                    int i2115 = (i21 & 14) | 48 | (i21 & 896);
                    int i2116 = (2147483646 & i21) >> 3;
                    b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                                float f10 = 8;
                                androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111 = pVar5;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar112 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar113 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar113);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar114 = pVar111;
                                            if (pVar114 == null) {
                                                interfaceC1084f5.L(-1324738946);
                                            } else {
                                                interfaceC1084f5.L(1481287139);
                                                pVar114.invoke(interfaceC1084f5, 0);
                                            }
                                            interfaceC1084f5.D();
                                            pVar112.invoke(interfaceC1084f5, 0);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 438);
                                interfaceC1084f3.J();
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i2115 | (i2116 & 7168) | (57344 & i2116) | (458752 & i2116) | (3670016 & i2116) | (29360128 & i2116) | (i2116 & 234881024), 0);
                    fVar2 = fVar3;
                    l0 l0Var15 = l0Var4;
                    hVar2 = hVar3;
                    Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111 = pVar5;
                    l0Var2 = l0Var15;
                    long j113 = jH;
                    pVar7 = pVar10;
                    pVar8 = pVar111;
                    pVar9 = pVar6;
                    j12 = j113;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    pVar7 = pVar4;
                    pVar8 = pVar5;
                    pVar9 = pVar6;
                    jB = j11;
                    l0Var2 = l0Var;
                    j12 = j;
                    fVar2 = fVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            if ((1572864 & i10) != 0) {
                i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
            }
            if ((12582912 & i10) != 0) {
                if ((i11 & 128) == 0) {
                    i23 = 4194304;
                } else {
                    i23 = 4194304;
                }
                i12 |= i23;
            }
            if ((100663296 & i10) == 0) {
                j11 = j10;
                if ((i11 & 256) == 0) {
                    i22 = 33554432;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            } else {
                j11 = j10;
            }
            i19 = i11 & 512;
            if (i19 != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.K(fVar)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((i12 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    }
                    if (i15 != 0) {
                        pVar6 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -3670017;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 256) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                    i21 = i12;
                    l0Var4 = l0Var3;
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    }
                    if (i15 != 0) {
                        pVar6 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -3670017;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 256) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                    i21 = i12;
                    l0Var4 = l0Var3;
                }
                c1086gP.U();
                int i2117 = (i21 & 14) | 48 | (i21 & 896);
                int i2118 = (2147483646 & i21) >> 3;
                b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                            float f10 = 8;
                            androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar112 = pVar5;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar113 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar114 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar114);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar115 = pVar112;
                                        if (pVar115 == null) {
                                            interfaceC1084f5.L(-1324738946);
                                        } else {
                                            interfaceC1084f5.L(1481287139);
                                            pVar115.invoke(interfaceC1084f5, 0);
                                        }
                                        interfaceC1084f5.D();
                                        pVar113.invoke(interfaceC1084f5, 0);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 438);
                            interfaceC1084f3.J();
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i2117 | (i2118 & 7168) | (57344 & i2118) | (458752 & i2118) | (3670016 & i2118) | (29360128 & i2118) | (i2118 & 234881024), 0);
                fVar2 = fVar3;
                l0 l0Var16 = l0Var4;
                hVar2 = hVar3;
                Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar112 = pVar5;
                l0Var2 = l0Var16;
                long j114 = jH;
                pVar7 = pVar10;
                pVar8 = pVar112;
                pVar9 = pVar6;
                j12 = j114;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                pVar7 = pVar4;
                pVar8 = pVar5;
                pVar9 = pVar6;
                jB = j11;
                l0Var2 = l0Var;
                j12 = j;
                fVar2 = fVar;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        pVar5 = pVar2;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                pVar6 = pVar3;
                if (c1086gP.k(pVar6)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((1572864 & i10) != 0) {
                    i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
                }
                if ((12582912 & i10) != 0) {
                    if ((i11 & 128) == 0) {
                        i23 = 4194304;
                    } else {
                        i23 = 4194304;
                    }
                    i12 |= i23;
                }
                if ((100663296 & i10) == 0) {
                    j11 = j10;
                    if ((i11 & 256) == 0) {
                        i22 = 33554432;
                    } else {
                        i22 = 33554432;
                    }
                    i12 |= i22;
                } else {
                    j11 = j10;
                }
                i19 = i11 & 512;
                if (i19 != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.K(fVar)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((i12 & 306783379) != 306783378) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        }
                        if (i15 != 0) {
                            pVar6 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -3670017;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 256) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                        i21 = i12;
                        l0Var4 = l0Var3;
                    } else {
                        if (i24 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i13 != 0) {
                            pVar5 = null;
                        }
                        if (i15 != 0) {
                            pVar6 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 64) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -3670017;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 128) != 0) {
                            i12 &= -29360129;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        if ((i11 & 256) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -234881025;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                        i21 = i12;
                        l0Var4 = l0Var3;
                    }
                    c1086gP.U();
                    int i2119 = (i21 & 14) | 48 | (i21 & 896);
                    int i21110 = (2147483646 & i21) >> 3;
                    b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                                float f10 = 8;
                                androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar113 = pVar5;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar114 = pVar;
                                androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                int iF = interfaceC1084f3.F();
                                InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                                androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                                Ia.p<ComposeUiNode, Integer, p293xa.r> pVar115 = ComposeUiNode.Companion.f14338g;
                                if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                    androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar115);
                                }
                                R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                                AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar116 = pVar113;
                                            if (pVar116 == null) {
                                                interfaceC1084f5.L(-1324738946);
                                            } else {
                                                interfaceC1084f5.L(1481287139);
                                                pVar116.invoke(interfaceC1084f5, 0);
                                            }
                                            interfaceC1084f5.D();
                                            pVar114.invoke(interfaceC1084f5, 0);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 438);
                                interfaceC1084f3.J();
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i2119 | (i21110 & 7168) | (57344 & i21110) | (458752 & i21110) | (3670016 & i21110) | (29360128 & i21110) | (i21110 & 234881024), 0);
                    fVar2 = fVar3;
                    l0 l0Var17 = l0Var4;
                    hVar2 = hVar3;
                    Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar113 = pVar5;
                    l0Var2 = l0Var17;
                    long j115 = jH;
                    pVar7 = pVar10;
                    pVar8 = pVar113;
                    pVar9 = pVar6;
                    j12 = j115;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    pVar7 = pVar4;
                    pVar8 = pVar5;
                    pVar9 = pVar6;
                    jB = j11;
                    l0Var2 = l0Var;
                    j12 = j;
                    fVar2 = fVar;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 196608;
            if ((1572864 & i10) != 0) {
                i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
            }
            if ((12582912 & i10) != 0) {
                if ((i11 & 128) == 0) {
                    i23 = 4194304;
                } else {
                    i23 = 4194304;
                }
                i12 |= i23;
            }
            if ((100663296 & i10) == 0) {
                j11 = j10;
                if ((i11 & 256) == 0) {
                    i22 = 33554432;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            } else {
                j11 = j10;
            }
            i19 = i11 & 512;
            if (i19 != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.K(fVar)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((i12 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    }
                    if (i15 != 0) {
                        pVar6 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -3670017;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 256) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                    i21 = i12;
                    l0Var4 = l0Var3;
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    }
                    if (i15 != 0) {
                        pVar6 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -3670017;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 256) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                    i21 = i12;
                    l0Var4 = l0Var3;
                }
                c1086gP.U();
                int i21111 = (i21 & 14) | 48 | (i21 & 896);
                int i21112 = (2147483646 & i21) >> 3;
                b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                            float f10 = 8;
                            androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar114 = pVar5;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar115 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar116 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar116);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar117 = pVar114;
                                        if (pVar117 == null) {
                                            interfaceC1084f5.L(-1324738946);
                                        } else {
                                            interfaceC1084f5.L(1481287139);
                                            pVar117.invoke(interfaceC1084f5, 0);
                                        }
                                        interfaceC1084f5.D();
                                        pVar115.invoke(interfaceC1084f5, 0);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 438);
                            interfaceC1084f3.J();
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i21111 | (i21112 & 7168) | (57344 & i21112) | (458752 & i21112) | (3670016 & i21112) | (29360128 & i21112) | (i21112 & 234881024), 0);
                fVar2 = fVar3;
                l0 l0Var18 = l0Var4;
                hVar2 = hVar3;
                Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar114 = pVar5;
                l0Var2 = l0Var18;
                long j116 = jH;
                pVar7 = pVar10;
                pVar8 = pVar114;
                pVar9 = pVar6;
                j12 = j116;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                pVar7 = pVar4;
                pVar8 = pVar5;
                pVar9 = pVar6;
                jB = j11;
                l0Var2 = l0Var;
                j12 = j;
                fVar2 = fVar;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        pVar6 = pVar3;
        i17 = i11 & 32;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                if (c1086gP.k(pVar4)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((1572864 & i10) != 0) {
                i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
            }
            if ((12582912 & i10) != 0) {
                if ((i11 & 128) == 0) {
                    i23 = 4194304;
                } else {
                    i23 = 4194304;
                }
                i12 |= i23;
            }
            if ((100663296 & i10) == 0) {
                j11 = j10;
                if ((i11 & 256) == 0) {
                    i22 = 33554432;
                } else {
                    i22 = 33554432;
                }
                i12 |= i22;
            } else {
                j11 = j10;
            }
            i19 = i11 & 512;
            if (i19 != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.K(fVar)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((i12 & 306783379) != 306783378) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    }
                    if (i15 != 0) {
                        pVar6 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -3670017;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 256) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                    i21 = i12;
                    l0Var4 = l0Var3;
                } else {
                    if (i24 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i13 != 0) {
                        pVar5 = null;
                    }
                    if (i15 != 0) {
                        pVar6 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 64) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -3670017;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 128) != 0) {
                        i12 &= -29360129;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    if ((i11 & 256) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -234881025;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                    i21 = i12;
                    l0Var4 = l0Var3;
                }
                c1086gP.U();
                int i21113 = (i21 & 14) | 48 | (i21 & 896);
                int i21114 = (2147483646 & i21) >> 3;
                b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                            float f10 = 8;
                            androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar115 = pVar5;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar116 = pVar;
                            androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            int iF = interfaceC1084f3.F();
                            InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar117 = ComposeUiNode.Companion.f14338g;
                            if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                                androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar117);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                            AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar118 = pVar115;
                                        if (pVar118 == null) {
                                            interfaceC1084f5.L(-1324738946);
                                        } else {
                                            interfaceC1084f5.L(1481287139);
                                            pVar118.invoke(interfaceC1084f5, 0);
                                        }
                                        interfaceC1084f5.D();
                                        pVar116.invoke(interfaceC1084f5, 0);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 438);
                            interfaceC1084f3.J();
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i21113 | (i21114 & 7168) | (57344 & i21114) | (458752 & i21114) | (3670016 & i21114) | (29360128 & i21114) | (i21114 & 234881024), 0);
                fVar2 = fVar3;
                l0 l0Var19 = l0Var4;
                hVar2 = hVar3;
                Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar115 = pVar5;
                l0Var2 = l0Var19;
                long j117 = jH;
                pVar7 = pVar10;
                pVar8 = pVar115;
                pVar9 = pVar6;
                j12 = j117;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                pVar7 = pVar4;
                pVar8 = pVar5;
                pVar9 = pVar6;
                jB = j11;
                l0Var2 = l0Var;
                j12 = j;
                fVar2 = fVar;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 196608;
        if ((1572864 & i10) != 0) {
            i12 |= ((i11 & 64) == 0 || !c1086gP.K(l0Var)) ? 524288 : 1048576;
        }
        if ((12582912 & i10) != 0) {
            if ((i11 & 128) == 0) {
                i23 = 4194304;
            } else {
                i23 = 4194304;
            }
            i12 |= i23;
        }
        if ((100663296 & i10) == 0) {
            j11 = j10;
            if ((i11 & 256) == 0) {
                i22 = 33554432;
            } else {
                i22 = 33554432;
            }
            i12 |= i22;
        } else {
            j11 = j10;
        }
        i19 = i11 & 512;
        if (i19 != 0) {
            i12 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c1086gP.K(fVar)) {
                i20 = 536870912;
            } else {
                i20 = 268435456;
            }
            i12 |= i20;
        }
        if ((i12 & 306783379) != 306783378) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if (i13 != 0) {
                    pVar5 = null;
                }
                if (i15 != 0) {
                    pVar6 = null;
                }
                if (i17 == 0) {
                }
                if ((i11 & 64) != 0) {
                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                    i12 &= -3670017;
                } else {
                    l0Var3 = l0Var;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                } else {
                    jH = j;
                }
                if ((i11 & 256) != 0) {
                    jB = ColorsKt.b(jH, c1086gP);
                    i12 &= -234881025;
                } else {
                    jB = j11;
                }
                if (i19 != 0) {
                    fVar3 = new androidx.compose.ui.window.f(7);
                } else {
                    fVar3 = fVar;
                }
                i21 = i12;
                l0Var4 = l0Var3;
            } else {
                if (i24 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if (i13 != 0) {
                    pVar5 = null;
                }
                if (i15 != 0) {
                    pVar6 = null;
                }
                if (i17 == 0) {
                }
                if ((i11 & 64) != 0) {
                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                    i12 &= -3670017;
                } else {
                    l0Var3 = l0Var;
                }
                if ((i11 & 128) != 0) {
                    i12 &= -29360129;
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                } else {
                    jH = j;
                }
                if ((i11 & 256) != 0) {
                    jB = ColorsKt.b(jH, c1086gP);
                    i12 &= -234881025;
                } else {
                    jB = j11;
                }
                if (i19 != 0) {
                    fVar3 = new androidx.compose.ui.window.f(7);
                } else {
                    fVar3 = fVar;
                }
                i21 = i12;
                l0Var4 = l0Var3;
            }
            c1086gP.U();
            int i21115 = (i21 & 14) | 48 | (i21 & 896);
            int i21116 = (2147483646 & i21) >> 3;
            b(aVar, androidx.compose.runtime.internal.a.b(1167440211, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1
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
                        float f10 = 8;
                        androidx.compose.ui.h hVarG = PaddingKt.g(f10, 2, W.d(androidx.compose.ui.h.a.f13984b, 1.0f));
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar116 = pVar5;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar117 = pVar;
                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        int iF = interfaceC1084f3.F();
                        InterfaceC1089h0 interfaceC1089h0Z = interfaceC1084f3.z();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(interfaceC1084f3, hVarG);
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
                        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar118 = ComposeUiNode.Companion.f14338g;
                        if (interfaceC1084f3.m() || !kotlin.jvm.internal.i.a(interfaceC1084f3.f(), Integer.valueOf(iF))) {
                            androidx.compose.animation.k.b(iF, interfaceC1084f3, iF, pVar118);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, interfaceC1084f3, hVarC);
                        AlertDialogKt.c(f10, 12, androidx.compose.runtime.internal.a.b(-563890224, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$1$1$1
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
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar119 = pVar116;
                                    if (pVar119 == null) {
                                        interfaceC1084f5.L(-1324738946);
                                    } else {
                                        interfaceC1084f5.L(1481287139);
                                        pVar119.invoke(interfaceC1084f5, 0);
                                    }
                                    interfaceC1084f5.D();
                                    pVar117.invoke(interfaceC1084f5, 0);
                                } else {
                                    interfaceC1084f5.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 438);
                        interfaceC1084f3.J();
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), hVar3, pVar6, pVar10, l0Var4, jH, jB, fVar3, c1086gP, i21115 | (i21116 & 7168) | (57344 & i21116) | (458752 & i21116) | (3670016 & i21116) | (29360128 & i21116) | (i21116 & 234881024), 0);
            fVar2 = fVar3;
            l0 l0Var110 = l0Var4;
            hVar2 = hVar3;
            Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar116 = pVar5;
            l0Var2 = l0Var110;
            long j118 = jH;
            pVar7 = pVar10;
            pVar8 = pVar116;
            pVar9 = pVar6;
            j12 = j118;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            pVar7 = pVar4;
            pVar8 = pVar5;
            pVar9 = pVar6;
            jB = j11;
            l0Var2 = l0Var;
            j12 = j;
            fVar2 = fVar;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidAlertDialog_androidKt.a(aVar, pVar, hVar2, pVar8, pVar9, pVar7, l0Var2, j12, jB, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0111  */
    /* JADX WARN: Code duplicated, block: B:104:0x011a  */
    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:119:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x014f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0155  */
    /* JADX WARN: Code duplicated, block: B:126:0x0159  */
    /* JADX WARN: Code duplicated, block: B:129:0x015f  */
    /* JADX WARN: Code duplicated, block: B:130:0x016c  */
    /* JADX WARN: Code duplicated, block: B:133:0x0172  */
    /* JADX WARN: Code duplicated, block: B:136:0x0184  */
    /* JADX WARN: Code duplicated, block: B:137:0x018a  */
    /* JADX WARN: Code duplicated, block: B:139:0x018d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0194  */
    /* JADX WARN: Code duplicated, block: B:142:0x01da  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00be  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:96:0x0101  */
    public static final void b(final Ia.a<p293xa.r> aVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, androidx.compose.ui.h hVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, l0 l0Var, long j, long j10, androidx.compose.ui.window.f fVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.ui.h hVar2;
        int i14;
        int i15;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4;
        int i16;
        int i17;
        int i18;
        long jH;
        final long j11;
        int i19;
        int i20;
        boolean z10;
        final l0 l0Var2;
        final androidx.compose.ui.window.f fVar2;
        final androidx.compose.ui.h hVar3;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5;
        final long j12;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6;
        C1105p0 c1105p0V;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7;
        l0 l0Var3;
        long jB;
        androidx.compose.ui.window.f fVar3;
        int i21;
        int i22;
        C1086g c1086gP = interfaceC1084f.p(1035523925);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c1086gP.k(pVar) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 384) == 0) {
                    hVar2 = hVar;
                    if (c1086gP.K(hVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        pVar4 = pVar2;
                        if (c1086gP.k(pVar4)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 24576) == 0) {
                            if (c1086gP.k(pVar3)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((196608 & i10) != 0) {
                            i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                        }
                        if ((1572864 & i10) == 0) {
                            jH = j;
                            if ((i11 & 64) == 0 || !c1086gP.i(jH)) {
                                i22 = 524288;
                            } else {
                                i22 = 1048576;
                            }
                            i12 |= i22;
                        } else {
                            jH = j;
                        }
                        if ((12582912 & i10) == 0) {
                            j11 = j10;
                            if ((i11 & 128) == 0 || !c1086gP.i(j11)) {
                                i21 = 4194304;
                            } else {
                                i21 = 8388608;
                            }
                            i12 |= i21;
                        } else {
                            j11 = j10;
                        }
                        i19 = i11 & 256;
                        if (i19 != 0) {
                            i12 |= 100663296;
                        } else if ((i10 & 100663296) == 0) {
                            if (c1086gP.K(fVar)) {
                                i20 = 67108864;
                            } else {
                                i20 = 33554432;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 38347923) != 38347922) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c1086gP.C(i12 & 1, z10)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0 || c1086gP.a0()) {
                                if (i13 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i15 != 0) {
                                    pVar4 = null;
                                }
                                pVar7 = i17 == 0 ? pVar3 : null;
                                if ((i11 & 32) != 0) {
                                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                    i12 &= -458753;
                                } else {
                                    l0Var3 = l0Var;
                                }
                                if ((i11 & 64) != 0) {
                                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                                    i12 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    jB = ColorsKt.b(jH, c1086gP);
                                    i12 &= -29360129;
                                } else {
                                    jB = j11;
                                }
                                if (i19 != 0) {
                                    fVar3 = new androidx.compose.ui.window.f(7);
                                } else {
                                    fVar3 = fVar;
                                }
                            } else {
                                c1086gP.w();
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                pVar7 = pVar3;
                                l0Var3 = l0Var;
                                fVar3 = fVar;
                                jB = j11;
                            }
                            c1086gP.U();
                            final androidx.compose.ui.h hVar4 = hVar2;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8 = pVar4;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9 = pVar7;
                            final l0 l0Var4 = l0Var3;
                            final long j13 = jH;
                            final long j14 = jB;
                            AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                                        AlertDialogKt.b(pVar, hVar4, pVar8, pVar9, l0Var4, j13, j14, interfaceC1084f3, 0, 0);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                            fVar2 = fVar3;
                            l0Var2 = l0Var3;
                            hVar3 = hVar2;
                            pVar5 = pVar4;
                            j11 = jB;
                            j12 = jH;
                            pVar6 = pVar7;
                        } else {
                            c1086gP.w();
                            l0Var2 = l0Var;
                            fVar2 = fVar;
                            hVar3 = hVar2;
                            pVar5 = pVar4;
                            j12 = jH;
                            pVar6 = pVar3;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i12 |= 24576;
                    if ((196608 & i10) != 0) {
                        i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                    }
                    if ((1572864 & i10) == 0) {
                        jH = j;
                        if ((i11 & 64) == 0) {
                            i22 = 524288;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    } else {
                        jH = j;
                    }
                    if ((12582912 & i10) == 0) {
                        j11 = j10;
                        if ((i11 & 128) == 0) {
                            i21 = 4194304;
                        } else {
                            i21 = 4194304;
                        }
                        i12 |= i21;
                    } else {
                        j11 = j10;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(fVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -458753;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                        } else {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -458753;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                        }
                        c1086gP.U();
                        final androidx.compose.ui.h hVar5 = hVar2;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar10 = pVar4;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11 = pVar7;
                        final l0 l0Var5 = l0Var3;
                        final long j15 = jH;
                        final long j16 = jB;
                        AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                                    AlertDialogKt.b(pVar, hVar5, pVar10, pVar11, l0Var5, j15, j16, interfaceC1084f3, 0, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                        fVar2 = fVar3;
                        l0Var2 = l0Var3;
                        hVar3 = hVar2;
                        pVar5 = pVar4;
                        j11 = jB;
                        j12 = jH;
                        pVar6 = pVar7;
                    } else {
                        c1086gP.w();
                        l0Var2 = l0Var;
                        fVar2 = fVar;
                        hVar3 = hVar2;
                        pVar5 = pVar4;
                        j12 = jH;
                        pVar6 = pVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 3072;
                pVar4 = pVar2;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.k(pVar3)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((196608 & i10) != 0) {
                        i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                    }
                    if ((1572864 & i10) == 0) {
                        jH = j;
                        if ((i11 & 64) == 0) {
                            i22 = 524288;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    } else {
                        jH = j;
                    }
                    if ((12582912 & i10) == 0) {
                        j11 = j10;
                        if ((i11 & 128) == 0) {
                            i21 = 4194304;
                        } else {
                            i21 = 4194304;
                        }
                        i12 |= i21;
                    } else {
                        j11 = j10;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(fVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -458753;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                        } else {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -458753;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                        }
                        c1086gP.U();
                        final androidx.compose.ui.h hVar6 = hVar2;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar4;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13 = pVar7;
                        final l0 l0Var6 = l0Var3;
                        final long j17 = jH;
                        final long j18 = jB;
                        AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                                    AlertDialogKt.b(pVar, hVar6, pVar12, pVar13, l0Var6, j17, j18, interfaceC1084f3, 0, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                        fVar2 = fVar3;
                        l0Var2 = l0Var3;
                        hVar3 = hVar2;
                        pVar5 = pVar4;
                        j11 = jB;
                        j12 = jH;
                        pVar6 = pVar7;
                    } else {
                        c1086gP.w();
                        l0Var2 = l0Var;
                        fVar2 = fVar;
                        hVar3 = hVar2;
                        pVar5 = pVar4;
                        j12 = jH;
                        pVar6 = pVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                }
                if ((1572864 & i10) == 0) {
                    jH = j;
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                } else {
                    jH = j;
                }
                if ((12582912 & i10) == 0) {
                    j11 = j10;
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                } else {
                    j11 = j10;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(fVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -458753;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -458753;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                    }
                    c1086gP.U();
                    final androidx.compose.ui.h hVar7 = hVar2;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14 = pVar4;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15 = pVar7;
                    final l0 l0Var7 = l0Var3;
                    final long j19 = jH;
                    final long j110 = jB;
                    AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                                AlertDialogKt.b(pVar, hVar7, pVar14, pVar15, l0Var7, j19, j110, interfaceC1084f3, 0, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                    fVar2 = fVar3;
                    l0Var2 = l0Var3;
                    hVar3 = hVar2;
                    pVar5 = pVar4;
                    j11 = jB;
                    j12 = jH;
                    pVar6 = pVar7;
                } else {
                    c1086gP.w();
                    l0Var2 = l0Var;
                    fVar2 = fVar;
                    hVar3 = hVar2;
                    pVar5 = pVar4;
                    j12 = jH;
                    pVar6 = pVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 384;
            hVar2 = hVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    pVar4 = pVar2;
                    if (c1086gP.k(pVar4)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.k(pVar3)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((196608 & i10) != 0) {
                        i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                    }
                    if ((1572864 & i10) == 0) {
                        jH = j;
                        if ((i11 & 64) == 0) {
                            i22 = 524288;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    } else {
                        jH = j;
                    }
                    if ((12582912 & i10) == 0) {
                        j11 = j10;
                        if ((i11 & 128) == 0) {
                            i21 = 4194304;
                        } else {
                            i21 = 4194304;
                        }
                        i12 |= i21;
                    } else {
                        j11 = j10;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(fVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -458753;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                        } else {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -458753;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                        }
                        c1086gP.U();
                        final androidx.compose.ui.h hVar8 = hVar2;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16 = pVar4;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17 = pVar7;
                        final l0 l0Var8 = l0Var3;
                        final long j111 = jH;
                        final long j112 = jB;
                        AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                                    AlertDialogKt.b(pVar, hVar8, pVar16, pVar17, l0Var8, j111, j112, interfaceC1084f3, 0, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                        fVar2 = fVar3;
                        l0Var2 = l0Var3;
                        hVar3 = hVar2;
                        pVar5 = pVar4;
                        j11 = jB;
                        j12 = jH;
                        pVar6 = pVar7;
                    } else {
                        c1086gP.w();
                        l0Var2 = l0Var;
                        fVar2 = fVar;
                        hVar3 = hVar2;
                        pVar5 = pVar4;
                        j12 = jH;
                        pVar6 = pVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                }
                if ((1572864 & i10) == 0) {
                    jH = j;
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                } else {
                    jH = j;
                }
                if ((12582912 & i10) == 0) {
                    j11 = j10;
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                } else {
                    j11 = j10;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(fVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -458753;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -458753;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                    }
                    c1086gP.U();
                    final androidx.compose.ui.h hVar9 = hVar2;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18 = pVar4;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19 = pVar7;
                    final l0 l0Var9 = l0Var3;
                    final long j113 = jH;
                    final long j114 = jB;
                    AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                                AlertDialogKt.b(pVar, hVar9, pVar18, pVar19, l0Var9, j113, j114, interfaceC1084f3, 0, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                    fVar2 = fVar3;
                    l0Var2 = l0Var3;
                    hVar3 = hVar2;
                    pVar5 = pVar4;
                    j11 = jB;
                    j12 = jH;
                    pVar6 = pVar7;
                } else {
                    c1086gP.w();
                    l0Var2 = l0Var;
                    fVar2 = fVar;
                    hVar3 = hVar2;
                    pVar5 = pVar4;
                    j12 = jH;
                    pVar6 = pVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            pVar4 = pVar2;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                }
                if ((1572864 & i10) == 0) {
                    jH = j;
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                } else {
                    jH = j;
                }
                if ((12582912 & i10) == 0) {
                    j11 = j10;
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                } else {
                    j11 = j10;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(fVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -458753;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -458753;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                    }
                    c1086gP.U();
                    final androidx.compose.ui.h hVar10 = hVar2;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar110 = pVar4;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111 = pVar7;
                    final l0 l0Var10 = l0Var3;
                    final long j115 = jH;
                    final long j116 = jB;
                    AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                                AlertDialogKt.b(pVar, hVar10, pVar110, pVar111, l0Var10, j115, j116, interfaceC1084f3, 0, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                    fVar2 = fVar3;
                    l0Var2 = l0Var3;
                    hVar3 = hVar2;
                    pVar5 = pVar4;
                    j11 = jB;
                    j12 = jH;
                    pVar6 = pVar7;
                } else {
                    c1086gP.w();
                    l0Var2 = l0Var;
                    fVar2 = fVar;
                    hVar3 = hVar2;
                    pVar5 = pVar4;
                    j12 = jH;
                    pVar6 = pVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            if ((196608 & i10) != 0) {
                i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
            }
            if ((1572864 & i10) == 0) {
                jH = j;
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            } else {
                jH = j;
            }
            if ((12582912 & i10) == 0) {
                j11 = j10;
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            } else {
                j11 = j10;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(fVar)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -458753;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                } else {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -458753;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                }
                c1086gP.U();
                final androidx.compose.ui.h hVar11 = hVar2;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar112 = pVar4;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar113 = pVar7;
                final l0 l0Var11 = l0Var3;
                final long j117 = jH;
                final long j118 = jB;
                AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                            AlertDialogKt.b(pVar, hVar11, pVar112, pVar113, l0Var11, j117, j118, interfaceC1084f3, 0, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                fVar2 = fVar3;
                l0Var2 = l0Var3;
                hVar3 = hVar2;
                pVar5 = pVar4;
                j11 = jB;
                j12 = jH;
                pVar6 = pVar7;
            } else {
                c1086gP.w();
                l0Var2 = l0Var;
                fVar2 = fVar;
                hVar3 = hVar2;
                pVar5 = pVar4;
                j12 = jH;
                pVar6 = pVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                if (c1086gP.K(hVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    pVar4 = pVar2;
                    if (c1086gP.k(pVar4)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.k(pVar3)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((196608 & i10) != 0) {
                        i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                    }
                    if ((1572864 & i10) == 0) {
                        jH = j;
                        if ((i11 & 64) == 0) {
                            i22 = 524288;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    } else {
                        jH = j;
                    }
                    if ((12582912 & i10) == 0) {
                        j11 = j10;
                        if ((i11 & 128) == 0) {
                            i21 = 4194304;
                        } else {
                            i21 = 4194304;
                        }
                        i12 |= i21;
                    } else {
                        j11 = j10;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c1086gP.K(fVar)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c1086gP.C(i12 & 1, z10)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -458753;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                        } else {
                            if (i13 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i15 != 0) {
                                pVar4 = null;
                            }
                            if (i17 == 0) {
                            }
                            if ((i11 & 32) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                                i12 &= -458753;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if ((i11 & 64) != 0) {
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i12 &= -29360129;
                            } else {
                                jB = j11;
                            }
                            if (i19 != 0) {
                                fVar3 = new androidx.compose.ui.window.f(7);
                            } else {
                                fVar3 = fVar;
                            }
                        }
                        c1086gP.U();
                        final androidx.compose.ui.h hVar12 = hVar2;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar114 = pVar4;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar115 = pVar7;
                        final l0 l0Var12 = l0Var3;
                        final long j119 = jH;
                        final long j1110 = jB;
                        AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                                    AlertDialogKt.b(pVar, hVar12, pVar114, pVar115, l0Var12, j119, j1110, interfaceC1084f3, 0, 0);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                        fVar2 = fVar3;
                        l0Var2 = l0Var3;
                        hVar3 = hVar2;
                        pVar5 = pVar4;
                        j11 = jB;
                        j12 = jH;
                        pVar6 = pVar7;
                    } else {
                        c1086gP.w();
                        l0Var2 = l0Var;
                        fVar2 = fVar;
                        hVar3 = hVar2;
                        pVar5 = pVar4;
                        j12 = jH;
                        pVar6 = pVar3;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i12 |= 24576;
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                }
                if ((1572864 & i10) == 0) {
                    jH = j;
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                } else {
                    jH = j;
                }
                if ((12582912 & i10) == 0) {
                    j11 = j10;
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                } else {
                    j11 = j10;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(fVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -458753;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -458753;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                    }
                    c1086gP.U();
                    final androidx.compose.ui.h hVar13 = hVar2;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar116 = pVar4;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar117 = pVar7;
                    final l0 l0Var13 = l0Var3;
                    final long j1111 = jH;
                    final long j1112 = jB;
                    AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                                AlertDialogKt.b(pVar, hVar13, pVar116, pVar117, l0Var13, j1111, j1112, interfaceC1084f3, 0, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                    fVar2 = fVar3;
                    l0Var2 = l0Var3;
                    hVar3 = hVar2;
                    pVar5 = pVar4;
                    j11 = jB;
                    j12 = jH;
                    pVar6 = pVar7;
                } else {
                    c1086gP.w();
                    l0Var2 = l0Var;
                    fVar2 = fVar;
                    hVar3 = hVar2;
                    pVar5 = pVar4;
                    j12 = jH;
                    pVar6 = pVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 3072;
            pVar4 = pVar2;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                }
                if ((1572864 & i10) == 0) {
                    jH = j;
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                } else {
                    jH = j;
                }
                if ((12582912 & i10) == 0) {
                    j11 = j10;
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                } else {
                    j11 = j10;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(fVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -458753;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -458753;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                    }
                    c1086gP.U();
                    final androidx.compose.ui.h hVar14 = hVar2;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar118 = pVar4;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar119 = pVar7;
                    final l0 l0Var14 = l0Var3;
                    final long j1113 = jH;
                    final long j1114 = jB;
                    AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                                AlertDialogKt.b(pVar, hVar14, pVar118, pVar119, l0Var14, j1113, j1114, interfaceC1084f3, 0, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                    fVar2 = fVar3;
                    l0Var2 = l0Var3;
                    hVar3 = hVar2;
                    pVar5 = pVar4;
                    j11 = jB;
                    j12 = jH;
                    pVar6 = pVar7;
                } else {
                    c1086gP.w();
                    l0Var2 = l0Var;
                    fVar2 = fVar;
                    hVar3 = hVar2;
                    pVar5 = pVar4;
                    j12 = jH;
                    pVar6 = pVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            if ((196608 & i10) != 0) {
                i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
            }
            if ((1572864 & i10) == 0) {
                jH = j;
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            } else {
                jH = j;
            }
            if ((12582912 & i10) == 0) {
                j11 = j10;
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            } else {
                j11 = j10;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(fVar)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -458753;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                } else {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -458753;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                }
                c1086gP.U();
                final androidx.compose.ui.h hVar15 = hVar2;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1110 = pVar4;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111 = pVar7;
                final l0 l0Var15 = l0Var3;
                final long j1115 = jH;
                final long j1116 = jB;
                AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                            AlertDialogKt.b(pVar, hVar15, pVar1110, pVar1111, l0Var15, j1115, j1116, interfaceC1084f3, 0, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                fVar2 = fVar3;
                l0Var2 = l0Var3;
                hVar3 = hVar2;
                pVar5 = pVar4;
                j11 = jB;
                j12 = jH;
                pVar6 = pVar7;
            } else {
                c1086gP.w();
                l0Var2 = l0Var;
                fVar2 = fVar;
                hVar3 = hVar2;
                pVar5 = pVar4;
                j12 = jH;
                pVar6 = pVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                pVar4 = pVar2;
                if (c1086gP.k(pVar4)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
                }
                if ((1572864 & i10) == 0) {
                    jH = j;
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                } else {
                    jH = j;
                }
                if ((12582912 & i10) == 0) {
                    j11 = j10;
                    if ((i11 & 128) == 0) {
                        i21 = 4194304;
                    } else {
                        i21 = 4194304;
                    }
                    i12 |= i21;
                } else {
                    j11 = j10;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c1086gP.K(fVar)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c1086gP.C(i12 & 1, z10)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -458753;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                    } else {
                        if (i13 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i15 != 0) {
                            pVar4 = null;
                        }
                        if (i17 == 0) {
                        }
                        if ((i11 & 32) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                            i12 &= -458753;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if ((i11 & 64) != 0) {
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            i12 &= -3670017;
                        }
                        if ((i11 & 128) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i12 &= -29360129;
                        } else {
                            jB = j11;
                        }
                        if (i19 != 0) {
                            fVar3 = new androidx.compose.ui.window.f(7);
                        } else {
                            fVar3 = fVar;
                        }
                    }
                    c1086gP.U();
                    final androidx.compose.ui.h hVar16 = hVar2;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1112 = pVar4;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1113 = pVar7;
                    final l0 l0Var16 = l0Var3;
                    final long j1117 = jH;
                    final long j1118 = jB;
                    AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                                AlertDialogKt.b(pVar, hVar16, pVar1112, pVar1113, l0Var16, j1117, j1118, interfaceC1084f3, 0, 0);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                    fVar2 = fVar3;
                    l0Var2 = l0Var3;
                    hVar3 = hVar2;
                    pVar5 = pVar4;
                    j11 = jB;
                    j12 = jH;
                    pVar6 = pVar7;
                } else {
                    c1086gP.w();
                    l0Var2 = l0Var;
                    fVar2 = fVar;
                    hVar3 = hVar2;
                    pVar5 = pVar4;
                    j12 = jH;
                    pVar6 = pVar3;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i12 |= 24576;
            if ((196608 & i10) != 0) {
                i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
            }
            if ((1572864 & i10) == 0) {
                jH = j;
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            } else {
                jH = j;
            }
            if ((12582912 & i10) == 0) {
                j11 = j10;
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            } else {
                j11 = j10;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(fVar)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -458753;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                } else {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -458753;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                }
                c1086gP.U();
                final androidx.compose.ui.h hVar17 = hVar2;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1114 = pVar4;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1115 = pVar7;
                final l0 l0Var17 = l0Var3;
                final long j1119 = jH;
                final long j11110 = jB;
                AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                            AlertDialogKt.b(pVar, hVar17, pVar1114, pVar1115, l0Var17, j1119, j11110, interfaceC1084f3, 0, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                fVar2 = fVar3;
                l0Var2 = l0Var3;
                hVar3 = hVar2;
                pVar5 = pVar4;
                j11 = jB;
                j12 = jH;
                pVar6 = pVar7;
            } else {
                c1086gP.w();
                l0Var2 = l0Var;
                fVar2 = fVar;
                hVar3 = hVar2;
                pVar5 = pVar4;
                j12 = jH;
                pVar6 = pVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 3072;
        pVar4 = pVar2;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 24576) == 0) {
                if (c1086gP.k(pVar3)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((196608 & i10) != 0) {
                i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
            }
            if ((1572864 & i10) == 0) {
                jH = j;
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            } else {
                jH = j;
            }
            if ((12582912 & i10) == 0) {
                j11 = j10;
                if ((i11 & 128) == 0) {
                    i21 = 4194304;
                } else {
                    i21 = 4194304;
                }
                i12 |= i21;
            } else {
                j11 = j10;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c1086gP.K(fVar)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c1086gP.C(i12 & 1, z10)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -458753;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                } else {
                    if (i13 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i15 != 0) {
                        pVar4 = null;
                    }
                    if (i17 == 0) {
                    }
                    if ((i11 & 32) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                        i12 &= -458753;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if ((i11 & 64) != 0) {
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        i12 &= -3670017;
                    }
                    if ((i11 & 128) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i12 &= -29360129;
                    } else {
                        jB = j11;
                    }
                    if (i19 != 0) {
                        fVar3 = new androidx.compose.ui.window.f(7);
                    } else {
                        fVar3 = fVar;
                    }
                }
                c1086gP.U();
                final androidx.compose.ui.h hVar18 = hVar2;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1116 = pVar4;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1117 = pVar7;
                final l0 l0Var18 = l0Var3;
                final long j11111 = jH;
                final long j11112 = jB;
                AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                            AlertDialogKt.b(pVar, hVar18, pVar1116, pVar1117, l0Var18, j11111, j11112, interfaceC1084f3, 0, 0);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
                fVar2 = fVar3;
                l0Var2 = l0Var3;
                hVar3 = hVar2;
                pVar5 = pVar4;
                j11 = jB;
                j12 = jH;
                pVar6 = pVar7;
            } else {
                c1086gP.w();
                l0Var2 = l0Var;
                fVar2 = fVar;
                hVar3 = hVar2;
                pVar5 = pVar4;
                j12 = jH;
                pVar6 = pVar3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i12 |= 24576;
        if ((196608 & i10) != 0) {
            i12 |= ((i11 & 32) == 0 || !c1086gP.K(l0Var)) ? 65536 : 131072;
        }
        if ((1572864 & i10) == 0) {
            jH = j;
            if ((i11 & 64) == 0) {
                i22 = 524288;
            } else {
                i22 = 524288;
            }
            i12 |= i22;
        } else {
            jH = j;
        }
        if ((12582912 & i10) == 0) {
            j11 = j10;
            if ((i11 & 128) == 0) {
                i21 = 4194304;
            } else {
                i21 = 4194304;
            }
            i12 |= i21;
        } else {
            j11 = j10;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c1086gP.K(fVar)) {
                i20 = 67108864;
            } else {
                i20 = 33554432;
            }
            i12 |= i20;
        }
        if ((i12 & 38347923) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c1086gP.C(i12 & 1, z10)) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i15 != 0) {
                    pVar4 = null;
                }
                if (i17 == 0) {
                }
                if ((i11 & 32) != 0) {
                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                    i12 &= -458753;
                } else {
                    l0Var3 = l0Var;
                }
                if ((i11 & 64) != 0) {
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jB = ColorsKt.b(jH, c1086gP);
                    i12 &= -29360129;
                } else {
                    jB = j11;
                }
                if (i19 != 0) {
                    fVar3 = new androidx.compose.ui.window.f(7);
                } else {
                    fVar3 = fVar;
                }
            } else {
                if (i13 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i15 != 0) {
                    pVar4 = null;
                }
                if (i17 == 0) {
                }
                if ((i11 & 32) != 0) {
                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11776b;
                    i12 &= -458753;
                } else {
                    l0Var3 = l0Var;
                }
                if ((i11 & 64) != 0) {
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    i12 &= -3670017;
                }
                if ((i11 & 128) != 0) {
                    jB = ColorsKt.b(jH, c1086gP);
                    i12 &= -29360129;
                } else {
                    jB = j11;
                }
                if (i19 != 0) {
                    fVar3 = new androidx.compose.ui.window.f(7);
                } else {
                    fVar3 = fVar;
                }
            }
            c1086gP.U();
            final androidx.compose.ui.h hVar19 = hVar2;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1118 = pVar4;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1119 = pVar7;
            final l0 l0Var19 = l0Var3;
            final long j11113 = jH;
            final long j11114 = jB;
            AndroidDialog_androidKt.a(aVar, fVar3, androidx.compose.runtime.internal.a.b(-66632952, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AlertDialogKt$AlertDialogImpl$2
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
                        AlertDialogKt.b(pVar, hVar19, pVar1118, pVar1119, l0Var19, j11113, j11114, interfaceC1084f3, 0, 0);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i12 & 14) | 384 | (((268435454 & i12) >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 0);
            fVar2 = fVar3;
            l0Var2 = l0Var3;
            hVar3 = hVar2;
            pVar5 = pVar4;
            j11 = jB;
            j12 = jH;
            pVar6 = pVar7;
        } else {
            c1086gP.w();
            l0Var2 = l0Var;
            fVar2 = fVar;
            hVar3 = hVar2;
            pVar5 = pVar4;
            j12 = jH;
            pVar6 = pVar3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.AndroidAlertDialog_androidKt$AlertDialog$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidAlertDialog_androidKt.b(aVar, pVar, hVar3, pVar5, pVar6, l0Var2, j12, j11, fVar2, interfaceC1084f2, L4.b.l(i10 | 1), i11);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
