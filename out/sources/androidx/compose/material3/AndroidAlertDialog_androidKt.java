package androidx.compose.material3;

import B.C0610e;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;

/* JADX INFO: compiled from: AndroidAlertDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0123  */
    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x0132  */
    /* JADX WARN: Code duplicated, block: B:107:0x0136  */
    /* JADX WARN: Code duplicated, block: B:110:0x013c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0142  */
    /* JADX WARN: Code duplicated, block: B:114:0x014a  */
    /* JADX WARN: Code duplicated, block: B:115:0x014d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0154  */
    /* JADX WARN: Code duplicated, block: B:121:0x015c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0162  */
    /* JADX WARN: Code duplicated, block: B:126:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x0176  */
    /* JADX WARN: Code duplicated, block: B:133:0x017d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0182  */
    /* JADX WARN: Code duplicated, block: B:137:0x0186  */
    /* JADX WARN: Code duplicated, block: B:139:0x018e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0191  */
    /* JADX WARN: Code duplicated, block: B:142:0x0196  */
    /* JADX WARN: Code duplicated, block: B:145:0x019c  */
    /* JADX WARN: Code duplicated, block: B:147:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:152:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:156:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:164:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:184:0x0238 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x023a  */
    /* JADX WARN: Code duplicated, block: B:188:0x0240  */
    /* JADX WARN: Code duplicated, block: B:190:0x0244  */
    /* JADX WARN: Code duplicated, block: B:191:0x0247  */
    /* JADX WARN: Code duplicated, block: B:193:0x024b  */
    /* JADX WARN: Code duplicated, block: B:194:0x024e  */
    /* JADX WARN: Code duplicated, block: B:197:0x0255  */
    /* JADX WARN: Code duplicated, block: B:200:0x025b  */
    /* JADX WARN: Code duplicated, block: B:202:0x0268  */
    /* JADX WARN: Code duplicated, block: B:205:0x026e  */
    /* JADX WARN: Code duplicated, block: B:206:0x027b  */
    /* JADX WARN: Code duplicated, block: B:209:0x0281  */
    /* JADX WARN: Code duplicated, block: B:211:0x0291  */
    /* JADX WARN: Code duplicated, block: B:214:0x0297  */
    /* JADX WARN: Code duplicated, block: B:216:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:219:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:220:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:222:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:223:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:225:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:226:0x02db  */
    /* JADX WARN: Code duplicated, block: B:230:0x0333  */
    /* JADX WARN: Code duplicated, block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    public static final void a(final Ia.a<p293xa.r> aVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, androidx.compose.ui.h hVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5, androidx.compose.ui.graphics.l0 l0Var, long j, long j10, long j11, long j12, float f10, androidx.compose.ui.window.f fVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        androidx.compose.ui.h hVar2;
        int i15;
        int i16;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        long j13;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9;
        androidx.compose.ui.graphics.l0 l0VarA;
        long jD;
        long jD2;
        long jD3;
        long jD4;
        float f11;
        int i30;
        float f12;
        long j14;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar10;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12;
        long j15;
        long j16;
        long j17;
        int i31;
        androidx.compose.ui.window.f fVar2;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13;
        final float f13;
        final androidx.compose.ui.window.f fVar3;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16;
        long j18;
        androidx.compose.ui.graphics.l0 l0Var2;
        final androidx.compose.ui.h hVar3;
        C1105p0 c1105p0V;
        int i32;
        int i33;
        C1086g c1086gP = interfaceC1084f.p(-2081346864);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c1086gP.k(aVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i13 |= c1086gP.k(pVar) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i10 & 384) == 0) {
                    hVar2 = hVar;
                    if (c1086gP.K(hVar2)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i10 & 3072) == 0) {
                        pVar6 = pVar2;
                        if (c1086gP.k(pVar6)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        if ((i10 & 24576) == 0) {
                            if (c1086gP.k(pVar3)) {
                                i19 = 16384;
                            } else {
                                i19 = 8192;
                            }
                            i13 |= i19;
                        }
                        i20 = i12 & 32;
                        if (i20 != 0) {
                            i13 |= 196608;
                        } else if ((i10 & 196608) == 0) {
                            if (c1086gP.k(pVar4)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                        i22 = i12 & 64;
                        if (i22 != 0) {
                            i13 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (c1086gP.k(pVar5)) {
                                i23 = 1048576;
                            } else {
                                i23 = 524288;
                            }
                            i13 |= i23;
                        }
                        if ((i10 & 12582912) != 0) {
                            i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
                        }
                        if ((i10 & 100663296) != 0) {
                            if ((i12 & 256) == 0 || !c1086gP.i(j)) {
                                i33 = 33554432;
                            } else {
                                i33 = 67108864;
                            }
                            i13 |= i33;
                        }
                        if ((i10 & 805306368) != 0) {
                            if ((i12 & 512) == 0 || !c1086gP.i(j10)) {
                                i32 = 268435456;
                            } else {
                                i32 = 536870912;
                            }
                            i13 |= i32;
                        }
                        if ((i11 & 6) == 0) {
                            if ((i12 & 1024) == 0) {
                                j13 = j11;
                                int i34 = c1086gP.i(j13) ? 4 : 2;
                                i24 = i11 | i34;
                            } else {
                                j13 = j11;
                            }
                            i24 = i11 | i34;
                        } else {
                            j13 = j11;
                            i24 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
                        }
                        i25 = i24;
                        i26 = i12 & 4096;
                        if (i26 != 0) {
                            i25 |= 384;
                        } else if ((i11 & 384) != 0) {
                            if (c1086gP.g(f10)) {
                                i27 = 256;
                            } else {
                                i27 = 128;
                            }
                            i25 |= i27;
                        }
                        i28 = 8192 & i12;
                        if (i28 != 0) {
                            if ((i11 & 3072) == 0) {
                                if (c1086gP.K(fVar)) {
                                    i29 = 2048;
                                } else {
                                    i29 = 1024;
                                }
                                i25 |= i29;
                            }
                            if ((306783379 & i13) != 306783378 && (i25 & 1171) == 1170 && c1086gP.s()) {
                                c1086gP.w();
                                pVar13 = pVar5;
                                j16 = j10;
                                j17 = j12;
                                f13 = f10;
                                fVar3 = fVar;
                                j14 = j13;
                                hVar3 = hVar2;
                                pVar16 = pVar6;
                                pVar15 = pVar3;
                                pVar14 = pVar4;
                                l0Var2 = l0Var;
                                j18 = j;
                            } else {
                                c1086gP.r0();
                                if ((i10 & 1) != 0 || c1086gP.a0()) {
                                    if (i14 != 0) {
                                        hVar2 = androidx.compose.ui.h.a.f13984b;
                                    }
                                    if (i16 != 0) {
                                        pVar6 = null;
                                    }
                                    if (i18 != 0) {
                                        pVar7 = null;
                                    } else {
                                        pVar7 = pVar3;
                                    }
                                    if (i20 != 0) {
                                        pVar8 = null;
                                    } else {
                                        pVar8 = pVar4;
                                    }
                                    pVar9 = i22 == 0 ? pVar5 : null;
                                    if ((128 & i12) != 0) {
                                        float f14 = C1046a.f12418a;
                                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                        i13 &= -29360129;
                                    } else {
                                        l0VarA = l0Var;
                                    }
                                    if ((256 & i12) != 0) {
                                        float f15 = C1046a.f12418a;
                                        ShapeKeyTokens shapeKeyTokens = C0610e.f1258a;
                                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                        i13 &= -234881025;
                                    } else {
                                        jD = j;
                                    }
                                    if ((i12 & 512) != 0) {
                                        float f16 = C1046a.f12418a;
                                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                        i13 = (-1879048193) & i13;
                                    } else {
                                        jD2 = j10;
                                    }
                                    if ((1024 & i12) != 0) {
                                        float f17 = C1046a.f12418a;
                                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                        i25 &= -15;
                                    } else {
                                        jD3 = j13;
                                    }
                                    if ((2048 & i12) != 0) {
                                        float f18 = C1046a.f12418a;
                                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                        i25 &= -113;
                                    } else {
                                        jD4 = j12;
                                    }
                                    if (i26 != 0) {
                                        f11 = C1046a.f12418a;
                                    } else {
                                        f11 = f10;
                                    }
                                    if (i28 != 0) {
                                        i30 = i25;
                                        f12 = f11;
                                        j14 = jD3;
                                        pVar11 = pVar7;
                                        pVar12 = pVar8;
                                        j15 = jD;
                                        j16 = jD2;
                                        j17 = jD4;
                                        int i35 = i13;
                                        fVar2 = new androidx.compose.ui.window.f(7);
                                        pVar10 = pVar9;
                                        i31 = i35;
                                    } else {
                                        i30 = i25;
                                        f12 = f11;
                                        j14 = jD3;
                                        pVar10 = pVar9;
                                        pVar11 = pVar7;
                                        pVar12 = pVar8;
                                        j15 = jD;
                                        j16 = jD2;
                                        j17 = jD4;
                                        i31 = i13;
                                    }
                                    c1086gP.U();
                                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                                    pVar13 = pVar10;
                                    f13 = f12;
                                    fVar3 = fVar2;
                                    pVar14 = pVar12;
                                    long j19 = j15;
                                    pVar15 = pVar11;
                                    pVar16 = pVar6;
                                    j18 = j19;
                                    androidx.compose.ui.h hVar4 = hVar2;
                                    l0Var2 = l0VarA;
                                    hVar3 = hVar4;
                                } else {
                                    c1086gP.w();
                                    if ((128 & i12) != 0) {
                                        i13 &= -29360129;
                                    }
                                    if ((256 & i12) != 0) {
                                        i13 &= -234881025;
                                    }
                                    if ((i12 & 512) != 0) {
                                        i13 &= -1879048193;
                                    }
                                    if ((1024 & i12) != 0) {
                                        i25 &= -15;
                                    }
                                    if ((2048 & i12) != 0) {
                                        i25 &= -113;
                                    }
                                    pVar12 = pVar4;
                                    pVar10 = pVar5;
                                    l0VarA = l0Var;
                                    j16 = j10;
                                    j17 = j12;
                                    i30 = i25;
                                    j14 = j13;
                                    i31 = i13;
                                    pVar11 = pVar3;
                                    j15 = j;
                                    f12 = f10;
                                }
                                fVar2 = fVar;
                                c1086gP.U();
                                AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                                pVar13 = pVar10;
                                f13 = f12;
                                fVar3 = fVar2;
                                pVar14 = pVar12;
                                long j110 = j15;
                                pVar15 = pVar11;
                                pVar16 = pVar6;
                                j18 = j110;
                                androidx.compose.ui.h hVar5 = hVar2;
                                l0Var2 = l0VarA;
                                hVar3 = hVar5;
                            }
                            c1105p0V = c1086gP.V();
                            if (c1105p0V != null) {
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17 = pVar13;
                                final androidx.compose.ui.graphics.l0 l0Var3 = l0Var2;
                                final long j20 = j18;
                                final long j21 = j16;
                                final long j22 = j14;
                                final long j23 = j17;
                                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        num.intValue();
                                        AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar17, l0Var3, j20, j21, j22, j23, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        }
                        i25 |= 3072;
                        if ((306783379 & i13) != 306783378) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f19 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f110 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens2 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f111 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f112 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f113 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i36 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i36;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f114 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f115 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens3 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f116 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f117 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f118 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i37 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i37;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            }
                            c1086gP.U();
                            AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                            pVar13 = pVar10;
                            f13 = f12;
                            fVar3 = fVar2;
                            pVar14 = pVar12;
                            long j111 = j15;
                            pVar15 = pVar11;
                            pVar16 = pVar6;
                            j18 = j111;
                            androidx.compose.ui.h hVar6 = hVar2;
                            l0Var2 = l0VarA;
                            hVar3 = hVar6;
                        } else {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f119 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f1110 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens4 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f1111 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f1112 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f1113 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i38 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i38;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f1114 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f1115 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens5 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f1116 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f1117 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f1118 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i39 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i39;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            }
                            c1086gP.U();
                            AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                            pVar13 = pVar10;
                            f13 = f12;
                            fVar3 = fVar2;
                            pVar14 = pVar12;
                            long j112 = j15;
                            pVar15 = pVar11;
                            pVar16 = pVar6;
                            j18 = j112;
                            androidx.compose.ui.h hVar7 = hVar2;
                            l0Var2 = l0VarA;
                            hVar3 = hVar7;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18 = pVar13;
                            final androidx.compose.ui.graphics.l0 l0Var4 = l0Var2;
                            final long j24 = j18;
                            final long j25 = j16;
                            final long j26 = j14;
                            final long j27 = j17;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar18, l0Var4, j24, j25, j26, j27, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i13 |= 24576;
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(pVar4)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    i22 = i12 & 64;
                    if (i22 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(pVar5)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i13 |= i23;
                    }
                    if ((i10 & 12582912) != 0) {
                        i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i12 & 256) == 0) {
                            i33 = 33554432;
                        } else {
                            i33 = 33554432;
                        }
                        i13 |= i33;
                    }
                    if ((i10 & 805306368) != 0) {
                        if ((i12 & 512) == 0) {
                            i32 = 268435456;
                        } else {
                            i32 = 268435456;
                        }
                        i13 |= i32;
                    }
                    if ((i11 & 6) == 0) {
                        if ((i12 & 1024) == 0) {
                            j13 = j11;
                            if (c1086gP.i(j13)) {
                            }
                            i24 = i11 | i34;
                        } else {
                            j13 = j11;
                        }
                        i24 = i11 | i34;
                    } else {
                        j13 = j11;
                        i24 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
                    }
                    i25 = i24;
                    i26 = i12 & 4096;
                    if (i26 != 0) {
                        i25 |= 384;
                    } else if ((i11 & 384) != 0) {
                        if (c1086gP.g(f10)) {
                            i27 = 256;
                        } else {
                            i27 = 128;
                        }
                        i25 |= i27;
                    }
                    i28 = 8192 & i12;
                    if (i28 != 0) {
                        if ((i11 & 3072) == 0) {
                            if (c1086gP.K(fVar)) {
                                i29 = 2048;
                            } else {
                                i29 = 1024;
                            }
                            i25 |= i29;
                        }
                        if ((306783379 & i13) != 306783378) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f1119 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f11110 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens6 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f11111 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f11112 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f11113 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i310 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i310;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f11114 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f11115 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens7 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f11116 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f11117 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f11118 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i311 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i311;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            }
                            c1086gP.U();
                            AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                            pVar13 = pVar10;
                            f13 = f12;
                            fVar3 = fVar2;
                            pVar14 = pVar12;
                            long j113 = j15;
                            pVar15 = pVar11;
                            pVar16 = pVar6;
                            j18 = j113;
                            androidx.compose.ui.h hVar8 = hVar2;
                            l0Var2 = l0VarA;
                            hVar3 = hVar8;
                        } else {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f11119 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f111110 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens8 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f111111 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f111112 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f111113 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i312 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i312;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f111114 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f111115 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens9 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f111116 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f111117 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f111118 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i313 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i313;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            }
                            c1086gP.U();
                            AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                            pVar13 = pVar10;
                            f13 = f12;
                            fVar3 = fVar2;
                            pVar14 = pVar12;
                            long j114 = j15;
                            pVar15 = pVar11;
                            pVar16 = pVar6;
                            j18 = j114;
                            androidx.compose.ui.h hVar9 = hVar2;
                            l0Var2 = l0VarA;
                            hVar3 = hVar9;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19 = pVar13;
                            final androidx.compose.ui.graphics.l0 l0Var5 = l0Var2;
                            final long j28 = j18;
                            final long j29 = j16;
                            final long j210 = j14;
                            final long j211 = j17;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar19, l0Var5, j28, j29, j210, j211, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i25 |= 3072;
                    if ((306783379 & i13) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f1111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens10 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f1111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f1111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f1111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i314 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i314;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f1111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens11 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f1111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f1111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f1111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i315 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i315;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j115 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j115;
                        androidx.compose.ui.h hVar10 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar10;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens12 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i316 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i316;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f11111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens13 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i317 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i317;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j116 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j116;
                        androidx.compose.ui.h hVar11 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar110 = pVar13;
                        final androidx.compose.ui.graphics.l0 l0Var6 = l0Var2;
                        final long j212 = j18;
                        final long j213 = j16;
                        final long j214 = j14;
                        final long j215 = j17;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar110, l0Var6, j212, j213, j214, j215, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 3072;
                pVar6 = pVar2;
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.k(pVar3)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(pVar4)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    i22 = i12 & 64;
                    if (i22 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(pVar5)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i13 |= i23;
                    }
                    if ((i10 & 12582912) != 0) {
                        i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i12 & 256) == 0) {
                            i33 = 33554432;
                        } else {
                            i33 = 33554432;
                        }
                        i13 |= i33;
                    }
                    if ((i10 & 805306368) != 0) {
                        if ((i12 & 512) == 0) {
                            i32 = 268435456;
                        } else {
                            i32 = 268435456;
                        }
                        i13 |= i32;
                    }
                    if ((i11 & 6) == 0) {
                        if ((i12 & 1024) == 0) {
                            j13 = j11;
                            if (c1086gP.i(j13)) {
                            }
                            i24 = i11 | i34;
                        } else {
                            j13 = j11;
                        }
                        i24 = i11 | i34;
                    } else {
                        j13 = j11;
                        i24 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
                    }
                    i25 = i24;
                    i26 = i12 & 4096;
                    if (i26 != 0) {
                        i25 |= 384;
                    } else if ((i11 & 384) != 0) {
                        if (c1086gP.g(f10)) {
                            i27 = 256;
                        } else {
                            i27 = 128;
                        }
                        i25 |= i27;
                    }
                    i28 = 8192 & i12;
                    if (i28 != 0) {
                        if ((i11 & 3072) == 0) {
                            if (c1086gP.K(fVar)) {
                                i29 = 2048;
                            } else {
                                i29 = 1024;
                            }
                            i25 |= i29;
                        }
                        if ((306783379 & i13) != 306783378) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f11111119 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f111111110 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens14 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f111111111 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f111111112 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f111111113 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i318 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i318;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f111111114 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f111111115 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens15 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f111111116 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f111111117 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f111111118 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i319 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i319;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            }
                            c1086gP.U();
                            AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                            pVar13 = pVar10;
                            f13 = f12;
                            fVar3 = fVar2;
                            pVar14 = pVar12;
                            long j117 = j15;
                            pVar15 = pVar11;
                            pVar16 = pVar6;
                            j18 = j117;
                            androidx.compose.ui.h hVar12 = hVar2;
                            l0Var2 = l0VarA;
                            hVar3 = hVar12;
                        } else {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f111111119 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f1111111110 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens16 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f1111111111 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f1111111112 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f1111111113 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i3110 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i3110;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f1111111114 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f1111111115 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens17 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f1111111116 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f1111111117 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f1111111118 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i3111 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i3111;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            }
                            c1086gP.U();
                            AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                            pVar13 = pVar10;
                            f13 = f12;
                            fVar3 = fVar2;
                            pVar14 = pVar12;
                            long j118 = j15;
                            pVar15 = pVar11;
                            pVar16 = pVar6;
                            j18 = j118;
                            androidx.compose.ui.h hVar13 = hVar2;
                            l0Var2 = l0VarA;
                            hVar3 = hVar13;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111 = pVar13;
                            final androidx.compose.ui.graphics.l0 l0Var7 = l0Var2;
                            final long j216 = j18;
                            final long j217 = j16;
                            final long j218 = j14;
                            final long j219 = j17;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar111, l0Var7, j216, j217, j218, j219, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i25 |= 3072;
                    if ((306783379 & i13) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens18 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3112 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3112;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f11111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens19 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3113 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3113;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j119 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j119;
                        androidx.compose.ui.h hVar14 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar14;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f11111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens110 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3114 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3114;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens111 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3115 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3115;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j1110 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j1110;
                        androidx.compose.ui.h hVar15 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar15;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar112 = pVar13;
                        final androidx.compose.ui.graphics.l0 l0Var8 = l0Var2;
                        final long j2110 = j18;
                        final long j2111 = j16;
                        final long j2112 = j14;
                        final long j2113 = j17;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar112, l0Var8, j2110, j2111, j2112, j2113, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar5)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i13 |= i23;
                }
                if ((i10 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i12 & 256) == 0) {
                        i33 = 33554432;
                    } else {
                        i33 = 33554432;
                    }
                    i13 |= i33;
                }
                if ((i10 & 805306368) != 0) {
                    if ((i12 & 512) == 0) {
                        i32 = 268435456;
                    } else {
                        i32 = 268435456;
                    }
                    i13 |= i32;
                }
                if ((i11 & 6) == 0) {
                    if ((i12 & 1024) == 0) {
                        j13 = j11;
                        if (c1086gP.i(j13)) {
                        }
                        i24 = i11 | i34;
                    } else {
                        j13 = j11;
                    }
                    i24 = i11 | i34;
                } else {
                    j13 = j11;
                    i24 = i11;
                }
                if ((i11 & 48) != 0) {
                    i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
                }
                i25 = i24;
                i26 = i12 & 4096;
                if (i26 != 0) {
                    i25 |= 384;
                } else if ((i11 & 384) != 0) {
                    if (c1086gP.g(f10)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i25 |= i27;
                }
                i28 = 8192 & i12;
                if (i28 != 0) {
                    if ((i11 & 3072) == 0) {
                        if (c1086gP.K(fVar)) {
                            i29 = 2048;
                        } else {
                            i29 = 1024;
                        }
                        i25 |= i29;
                    }
                    if ((306783379 & i13) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f1111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens112 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f1111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f1111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f1111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3116 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3116;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f1111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens113 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f1111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f1111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f1111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3117 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3117;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j1111 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j1111;
                        androidx.compose.ui.h hVar16 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar16;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens114 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3118 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3118;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f11111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens115 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3119 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3119;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j1112 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j1112;
                        androidx.compose.ui.h hVar17 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar17;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar113 = pVar13;
                        final androidx.compose.ui.graphics.l0 l0Var9 = l0Var2;
                        final long j2114 = j18;
                        final long j2115 = j16;
                        final long j2116 = j14;
                        final long j2117 = j17;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar113, l0Var9, j2114, j2115, j2116, j2117, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i25 |= 3072;
                if ((306783379 & i13) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f11111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens116 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i31110 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i31110;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens117 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i31111 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i31111;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j1113 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j1113;
                    androidx.compose.ui.h hVar18 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar18;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f1111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens118 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f1111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f1111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f1111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i31112 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i31112;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f1111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f1111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens119 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f1111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f1111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f1111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i31113 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i31113;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j1114 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j1114;
                    androidx.compose.ui.h hVar19 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar19;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar114 = pVar13;
                    final androidx.compose.ui.graphics.l0 l0Var10 = l0Var2;
                    final long j2118 = j18;
                    final long j2119 = j16;
                    final long j21110 = j14;
                    final long j21111 = j17;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar114, l0Var10, j2118, j2119, j21110, j21111, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 384;
            hVar2 = hVar;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i10 & 3072) == 0) {
                    pVar6 = pVar2;
                    if (c1086gP.k(pVar6)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.k(pVar3)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(pVar4)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    i22 = i12 & 64;
                    if (i22 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(pVar5)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i13 |= i23;
                    }
                    if ((i10 & 12582912) != 0) {
                        i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i12 & 256) == 0) {
                            i33 = 33554432;
                        } else {
                            i33 = 33554432;
                        }
                        i13 |= i33;
                    }
                    if ((i10 & 805306368) != 0) {
                        if ((i12 & 512) == 0) {
                            i32 = 268435456;
                        } else {
                            i32 = 268435456;
                        }
                        i13 |= i32;
                    }
                    if ((i11 & 6) == 0) {
                        if ((i12 & 1024) == 0) {
                            j13 = j11;
                            if (c1086gP.i(j13)) {
                            }
                            i24 = i11 | i34;
                        } else {
                            j13 = j11;
                        }
                        i24 = i11 | i34;
                    } else {
                        j13 = j11;
                        i24 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
                    }
                    i25 = i24;
                    i26 = i12 & 4096;
                    if (i26 != 0) {
                        i25 |= 384;
                    } else if ((i11 & 384) != 0) {
                        if (c1086gP.g(f10)) {
                            i27 = 256;
                        } else {
                            i27 = 128;
                        }
                        i25 |= i27;
                    }
                    i28 = 8192 & i12;
                    if (i28 != 0) {
                        if ((i11 & 3072) == 0) {
                            if (c1086gP.K(fVar)) {
                                i29 = 2048;
                            } else {
                                i29 = 1024;
                            }
                            i25 |= i29;
                        }
                        if ((306783379 & i13) != 306783378) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f1111111111111119 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f11111111111111110 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens1110 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f11111111111111111 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f11111111111111112 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f11111111111111113 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i31114 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i31114;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f11111111111111114 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f11111111111111115 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens1111 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f11111111111111116 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f11111111111111117 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f11111111111111118 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i31115 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i31115;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            }
                            c1086gP.U();
                            AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                            pVar13 = pVar10;
                            f13 = f12;
                            fVar3 = fVar2;
                            pVar14 = pVar12;
                            long j1115 = j15;
                            pVar15 = pVar11;
                            pVar16 = pVar6;
                            j18 = j1115;
                            androidx.compose.ui.h hVar110 = hVar2;
                            l0Var2 = l0VarA;
                            hVar3 = hVar110;
                        } else {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f11111111111111119 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f111111111111111110 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens1112 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f111111111111111111 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f111111111111111112 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f111111111111111113 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i31116 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i31116;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f111111111111111114 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f111111111111111115 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens1113 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f111111111111111116 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f111111111111111117 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f111111111111111118 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i31117 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i31117;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            }
                            c1086gP.U();
                            AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                            pVar13 = pVar10;
                            f13 = f12;
                            fVar3 = fVar2;
                            pVar14 = pVar12;
                            long j1116 = j15;
                            pVar15 = pVar11;
                            pVar16 = pVar6;
                            j18 = j1116;
                            androidx.compose.ui.h hVar111 = hVar2;
                            l0Var2 = l0VarA;
                            hVar3 = hVar111;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar115 = pVar13;
                            final androidx.compose.ui.graphics.l0 l0Var11 = l0Var2;
                            final long j21112 = j18;
                            final long j21113 = j16;
                            final long j21114 = j14;
                            final long j21115 = j17;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar115, l0Var11, j21112, j21113, j21114, j21115, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i25 |= 3072;
                    if ((306783379 & i13) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f111111111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f1111111111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens1114 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f1111111111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f1111111111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f1111111111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i31118 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i31118;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111111111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f1111111111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens1115 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f1111111111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f1111111111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f1111111111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i31119 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i31119;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j1117 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j1117;
                        androidx.compose.ui.h hVar112 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar112;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111111111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens1116 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311110 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311110;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f11111111111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens1117 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311111 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311111;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j1118 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j1118;
                        androidx.compose.ui.h hVar113 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar113;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar116 = pVar13;
                        final androidx.compose.ui.graphics.l0 l0Var12 = l0Var2;
                        final long j21116 = j18;
                        final long j21117 = j16;
                        final long j21118 = j14;
                        final long j21119 = j17;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar116, l0Var12, j21116, j21117, j21118, j21119, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar5)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i13 |= i23;
                }
                if ((i10 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i12 & 256) == 0) {
                        i33 = 33554432;
                    } else {
                        i33 = 33554432;
                    }
                    i13 |= i33;
                }
                if ((i10 & 805306368) != 0) {
                    if ((i12 & 512) == 0) {
                        i32 = 268435456;
                    } else {
                        i32 = 268435456;
                    }
                    i13 |= i32;
                }
                if ((i11 & 6) == 0) {
                    if ((i12 & 1024) == 0) {
                        j13 = j11;
                        if (c1086gP.i(j13)) {
                        }
                        i24 = i11 | i34;
                    } else {
                        j13 = j11;
                    }
                    i24 = i11 | i34;
                } else {
                    j13 = j11;
                    i24 = i11;
                }
                if ((i11 & 48) != 0) {
                    i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
                }
                i25 = i24;
                i26 = i12 & 4096;
                if (i26 != 0) {
                    i25 |= 384;
                } else if ((i11 & 384) != 0) {
                    if (c1086gP.g(f10)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i25 |= i27;
                }
                i28 = 8192 & i12;
                if (i28 != 0) {
                    if ((i11 & 3072) == 0) {
                        if (c1086gP.K(fVar)) {
                            i29 = 2048;
                        } else {
                            i29 = 1024;
                        }
                        i25 |= i29;
                    }
                    if ((306783379 & i13) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f11111111111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f111111111111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens1118 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f111111111111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f111111111111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f111111111111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311112 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311112;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f111111111111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f111111111111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens1119 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f111111111111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f111111111111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f111111111111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311113 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311113;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j1119 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j1119;
                        androidx.compose.ui.h hVar114 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar114;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f111111111111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f1111111111111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens11110 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f1111111111111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f1111111111111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f1111111111111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311114 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311114;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111111111111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f1111111111111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens11111 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f1111111111111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f1111111111111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f1111111111111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311115 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311115;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j11110 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j11110;
                        androidx.compose.ui.h hVar115 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar115;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar117 = pVar13;
                        final androidx.compose.ui.graphics.l0 l0Var13 = l0Var2;
                        final long j211110 = j18;
                        final long j211111 = j16;
                        final long j211112 = j14;
                        final long j211113 = j17;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar117, l0Var13, j211110, j211111, j211112, j211113, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i25 |= 3072;
                if ((306783379 & i13) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f1111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f11111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens11112 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f11111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f11111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f11111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i311116 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i311116;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f11111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f11111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens11113 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f11111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f11111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f11111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i311117 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i311117;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j11111 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j11111;
                    androidx.compose.ui.h hVar116 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar116;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f11111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens11114 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i311118 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i311118;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens11115 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i311119 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i311119;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j11112 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j11112;
                    androidx.compose.ui.h hVar117 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar117;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar118 = pVar13;
                    final androidx.compose.ui.graphics.l0 l0Var14 = l0Var2;
                    final long j211114 = j18;
                    final long j211115 = j16;
                    final long j211116 = j14;
                    final long j211117 = j17;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar118, l0Var14, j211114, j211115, j211116, j211117, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 3072;
            pVar6 = pVar2;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar5)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i13 |= i23;
                }
                if ((i10 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i12 & 256) == 0) {
                        i33 = 33554432;
                    } else {
                        i33 = 33554432;
                    }
                    i13 |= i33;
                }
                if ((i10 & 805306368) != 0) {
                    if ((i12 & 512) == 0) {
                        i32 = 268435456;
                    } else {
                        i32 = 268435456;
                    }
                    i13 |= i32;
                }
                if ((i11 & 6) == 0) {
                    if ((i12 & 1024) == 0) {
                        j13 = j11;
                        if (c1086gP.i(j13)) {
                        }
                        i24 = i11 | i34;
                    } else {
                        j13 = j11;
                    }
                    i24 = i11 | i34;
                } else {
                    j13 = j11;
                    i24 = i11;
                }
                if ((i11 & 48) != 0) {
                    i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
                }
                i25 = i24;
                i26 = i12 & 4096;
                if (i26 != 0) {
                    i25 |= 384;
                } else if ((i11 & 384) != 0) {
                    if (c1086gP.g(f10)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i25 |= i27;
                }
                i28 = 8192 & i12;
                if (i28 != 0) {
                    if ((i11 & 3072) == 0) {
                        if (c1086gP.K(fVar)) {
                            i29 = 2048;
                        } else {
                            i29 = 1024;
                        }
                        i25 |= i29;
                    }
                    if ((306783379 & i13) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f111111111111111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f1111111111111111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens11116 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f1111111111111111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f1111111111111111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f1111111111111111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3111110 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3111110;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111111111111111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f1111111111111111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens11117 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f1111111111111111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f1111111111111111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f1111111111111111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3111111 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3111111;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j11113 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j11113;
                        androidx.compose.ui.h hVar118 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar118;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111111111111111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111111111111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens11118 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111111111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111111111111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111111111111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3111112 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3111112;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f11111111111111111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111111111111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens11119 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111111111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111111111111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111111111111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3111113 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3111113;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j11114 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j11114;
                        androidx.compose.ui.h hVar119 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar119;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar119 = pVar13;
                        final androidx.compose.ui.graphics.l0 l0Var15 = l0Var2;
                        final long j211118 = j18;
                        final long j211119 = j16;
                        final long j2111110 = j14;
                        final long j2111111 = j17;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar119, l0Var15, j211118, j211119, j2111110, j2111111, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i25 |= 3072;
                if ((306783379 & i13) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f11111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111110 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111114 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111114;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111111 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111115 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111115;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j11115 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j11115;
                    androidx.compose.ui.h hVar1110 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar1110;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f1111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111112 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f1111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f1111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f1111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111116 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111116;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f1111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f1111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111113 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f1111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f1111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f1111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111117 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111117;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j11116 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j11116;
                    androidx.compose.ui.h hVar1111 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar1111;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1110 = pVar13;
                    final androidx.compose.ui.graphics.l0 l0Var16 = l0Var2;
                    final long j2111112 = j18;
                    final long j2111113 = j16;
                    final long j2111114 = j14;
                    final long j2111115 = j17;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar1110, l0Var16, j2111112, j2111113, j2111114, j2111115, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(pVar4)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            i22 = i12 & 64;
            if (i22 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(pVar5)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i13 |= i23;
            }
            if ((i10 & 12582912) != 0) {
                i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
            }
            if ((i10 & 100663296) != 0) {
                if ((i12 & 256) == 0) {
                    i33 = 33554432;
                } else {
                    i33 = 33554432;
                }
                i13 |= i33;
            }
            if ((i10 & 805306368) != 0) {
                if ((i12 & 512) == 0) {
                    i32 = 268435456;
                } else {
                    i32 = 268435456;
                }
                i13 |= i32;
            }
            if ((i11 & 6) == 0) {
                if ((i12 & 1024) == 0) {
                    j13 = j11;
                    if (c1086gP.i(j13)) {
                    }
                    i24 = i11 | i34;
                } else {
                    j13 = j11;
                }
                i24 = i11 | i34;
            } else {
                j13 = j11;
                i24 = i11;
            }
            if ((i11 & 48) != 0) {
                i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
            }
            i25 = i24;
            i26 = i12 & 4096;
            if (i26 != 0) {
                i25 |= 384;
            } else if ((i11 & 384) != 0) {
                if (c1086gP.g(f10)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i25 |= i27;
            }
            i28 = 8192 & i12;
            if (i28 != 0) {
                if ((i11 & 3072) == 0) {
                    if (c1086gP.K(fVar)) {
                        i29 = 2048;
                    } else {
                        i29 = 1024;
                    }
                    i25 |= i29;
                }
                if ((306783379 & i13) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f1111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f11111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111114 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f11111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f11111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f11111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111118 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111118;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f11111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f11111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111115 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f11111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f11111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f11111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111119 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111119;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j11117 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j11117;
                    androidx.compose.ui.h hVar1112 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar1112;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f11111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111116 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i31111110 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i31111110;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111117 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i31111111 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i31111111;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j11118 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j11118;
                    androidx.compose.ui.h hVar1113 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar1113;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111 = pVar13;
                    final androidx.compose.ui.graphics.l0 l0Var17 = l0Var2;
                    final long j2111116 = j18;
                    final long j2111117 = j16;
                    final long j2111118 = j14;
                    final long j2111119 = j17;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar1111, l0Var17, j2111116, j2111117, j2111118, j2111119, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i25 |= 3072;
            if ((306783379 & i13) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f111111111111111111111111111119 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f1111111111111111111111111111110 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens111118 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f1111111111111111111111111111111 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f1111111111111111111111111111112 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f1111111111111111111111111111113 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i31111112 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i31111112;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                } else {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f1111111111111111111111111111114 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f1111111111111111111111111111115 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens111119 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f1111111111111111111111111111116 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f1111111111111111111111111111117 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f1111111111111111111111111111118 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i31111113 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i31111113;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                }
                c1086gP.U();
                AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                pVar13 = pVar10;
                f13 = f12;
                fVar3 = fVar2;
                pVar14 = pVar12;
                long j11119 = j15;
                pVar15 = pVar11;
                pVar16 = pVar6;
                j18 = j11119;
                androidx.compose.ui.h hVar1114 = hVar2;
                l0Var2 = l0VarA;
                hVar3 = hVar1114;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f1111111111111111111111111111119 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f11111111111111111111111111111110 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens1111110 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f11111111111111111111111111111111 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f11111111111111111111111111111112 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f11111111111111111111111111111113 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i31111114 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i31111114;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                } else {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f11111111111111111111111111111114 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f11111111111111111111111111111115 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens1111111 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f11111111111111111111111111111116 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f11111111111111111111111111111117 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f11111111111111111111111111111118 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i31111115 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i31111115;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                }
                c1086gP.U();
                AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                pVar13 = pVar10;
                f13 = f12;
                fVar3 = fVar2;
                pVar14 = pVar12;
                long j111110 = j15;
                pVar15 = pVar11;
                pVar16 = pVar6;
                j18 = j111110;
                androidx.compose.ui.h hVar1115 = hVar2;
                l0Var2 = l0VarA;
                hVar3 = hVar1115;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1112 = pVar13;
                final androidx.compose.ui.graphics.l0 l0Var18 = l0Var2;
                final long j21111110 = j18;
                final long j21111111 = j16;
                final long j21111112 = j14;
                final long j21111113 = j17;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar1112, l0Var18, j21111110, j21111111, j21111112, j21111113, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 48;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i10 & 384) == 0) {
                hVar2 = hVar;
                if (c1086gP.K(hVar2)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i10 & 3072) == 0) {
                    pVar6 = pVar2;
                    if (c1086gP.k(pVar6)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.k(pVar3)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.k(pVar4)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    i22 = i12 & 64;
                    if (i22 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.k(pVar5)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i13 |= i23;
                    }
                    if ((i10 & 12582912) != 0) {
                        i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
                    }
                    if ((i10 & 100663296) != 0) {
                        if ((i12 & 256) == 0) {
                            i33 = 33554432;
                        } else {
                            i33 = 33554432;
                        }
                        i13 |= i33;
                    }
                    if ((i10 & 805306368) != 0) {
                        if ((i12 & 512) == 0) {
                            i32 = 268435456;
                        } else {
                            i32 = 268435456;
                        }
                        i13 |= i32;
                    }
                    if ((i11 & 6) == 0) {
                        if ((i12 & 1024) == 0) {
                            j13 = j11;
                            if (c1086gP.i(j13)) {
                            }
                            i24 = i11 | i34;
                        } else {
                            j13 = j11;
                        }
                        i24 = i11 | i34;
                    } else {
                        j13 = j11;
                        i24 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
                    }
                    i25 = i24;
                    i26 = i12 & 4096;
                    if (i26 != 0) {
                        i25 |= 384;
                    } else if ((i11 & 384) != 0) {
                        if (c1086gP.g(f10)) {
                            i27 = 256;
                        } else {
                            i27 = 128;
                        }
                        i25 |= i27;
                    }
                    i28 = 8192 & i12;
                    if (i28 != 0) {
                        if ((i11 & 3072) == 0) {
                            if (c1086gP.K(fVar)) {
                                i29 = 2048;
                            } else {
                                i29 = 1024;
                            }
                            i25 |= i29;
                        }
                        if ((306783379 & i13) != 306783378) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f11111111111111111111111111111119 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f111111111111111111111111111111110 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens1111112 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f111111111111111111111111111111111 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f111111111111111111111111111111112 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f111111111111111111111111111111113 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i31111116 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i31111116;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f111111111111111111111111111111114 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f111111111111111111111111111111115 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens1111113 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f111111111111111111111111111111116 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f111111111111111111111111111111117 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f111111111111111111111111111111118 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i31111117 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i31111117;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            }
                            c1086gP.U();
                            AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                            pVar13 = pVar10;
                            f13 = f12;
                            fVar3 = fVar2;
                            pVar14 = pVar12;
                            long j111111 = j15;
                            pVar15 = pVar11;
                            pVar16 = pVar6;
                            j18 = j111111;
                            androidx.compose.ui.h hVar1116 = hVar2;
                            l0Var2 = l0VarA;
                            hVar3 = hVar1116;
                        } else {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f111111111111111111111111111111119 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f1111111111111111111111111111111110 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens1111114 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f1111111111111111111111111111111111 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f1111111111111111111111111111111112 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f1111111111111111111111111111111113 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i31111118 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i31111118;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            } else {
                                if (i14 != 0) {
                                    hVar2 = androidx.compose.ui.h.a.f13984b;
                                }
                                if (i16 != 0) {
                                    pVar6 = null;
                                }
                                if (i18 != 0) {
                                    pVar7 = null;
                                } else {
                                    pVar7 = pVar3;
                                }
                                if (i20 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar4;
                                }
                                if (i22 == 0) {
                                }
                                if ((128 & i12) != 0) {
                                    float f1111111111111111111111111111111114 = C1046a.f12418a;
                                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                    i13 &= -29360129;
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((256 & i12) != 0) {
                                    float f1111111111111111111111111111111115 = C1046a.f12418a;
                                    ShapeKeyTokens shapeKeyTokens1111115 = C0610e.f1258a;
                                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                    i13 &= -234881025;
                                } else {
                                    jD = j;
                                }
                                if ((i12 & 512) != 0) {
                                    float f1111111111111111111111111111111116 = C1046a.f12418a;
                                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                    i13 = (-1879048193) & i13;
                                } else {
                                    jD2 = j10;
                                }
                                if ((1024 & i12) != 0) {
                                    float f1111111111111111111111111111111117 = C1046a.f12418a;
                                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                    i25 &= -15;
                                } else {
                                    jD3 = j13;
                                }
                                if ((2048 & i12) != 0) {
                                    float f1111111111111111111111111111111118 = C1046a.f12418a;
                                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                    i25 &= -113;
                                } else {
                                    jD4 = j12;
                                }
                                if (i26 != 0) {
                                    f11 = C1046a.f12418a;
                                } else {
                                    f11 = f10;
                                }
                                if (i28 != 0) {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    int i31111119 = i13;
                                    fVar2 = new androidx.compose.ui.window.f(7);
                                    pVar10 = pVar9;
                                    i31 = i31111119;
                                } else {
                                    i30 = i25;
                                    f12 = f11;
                                    j14 = jD3;
                                    pVar10 = pVar9;
                                    pVar11 = pVar7;
                                    pVar12 = pVar8;
                                    j15 = jD;
                                    j16 = jD2;
                                    j17 = jD4;
                                    i31 = i13;
                                    fVar2 = fVar;
                                }
                            }
                            c1086gP.U();
                            AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                            pVar13 = pVar10;
                            f13 = f12;
                            fVar3 = fVar2;
                            pVar14 = pVar12;
                            long j111112 = j15;
                            pVar15 = pVar11;
                            pVar16 = pVar6;
                            j18 = j111112;
                            androidx.compose.ui.h hVar1117 = hVar2;
                            l0Var2 = l0VarA;
                            hVar3 = hVar1117;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1113 = pVar13;
                            final androidx.compose.ui.graphics.l0 l0Var19 = l0Var2;
                            final long j21111114 = j18;
                            final long j21111115 = j16;
                            final long j21111116 = j14;
                            final long j21111117 = j17;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar1113, l0Var19, j21111114, j21111115, j21111116, j21111117, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i25 |= 3072;
                    if ((306783379 & i13) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111111111111111111111111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111111111111111111111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens1111116 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111111111111111111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111111111111111111111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111111111111111111111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311111110 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311111110;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f11111111111111111111111111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111111111111111111111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens1111117 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111111111111111111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111111111111111111111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111111111111111111111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311111111 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311111111;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j111113 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j111113;
                        androidx.compose.ui.h hVar1118 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar1118;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f11111111111111111111111111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f111111111111111111111111111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens1111118 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f111111111111111111111111111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f111111111111111111111111111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f111111111111111111111111111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311111112 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311111112;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f111111111111111111111111111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f111111111111111111111111111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens1111119 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f111111111111111111111111111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f111111111111111111111111111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f111111111111111111111111111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311111113 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311111113;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j111114 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j111114;
                        androidx.compose.ui.h hVar1119 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar1119;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1114 = pVar13;
                        final androidx.compose.ui.graphics.l0 l0Var110 = l0Var2;
                        final long j21111118 = j18;
                        final long j21111119 = j16;
                        final long j211111110 = j14;
                        final long j211111111 = j17;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar1114, l0Var110, j21111118, j21111119, j211111110, j211111111, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar5)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i13 |= i23;
                }
                if ((i10 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i12 & 256) == 0) {
                        i33 = 33554432;
                    } else {
                        i33 = 33554432;
                    }
                    i13 |= i33;
                }
                if ((i10 & 805306368) != 0) {
                    if ((i12 & 512) == 0) {
                        i32 = 268435456;
                    } else {
                        i32 = 268435456;
                    }
                    i13 |= i32;
                }
                if ((i11 & 6) == 0) {
                    if ((i12 & 1024) == 0) {
                        j13 = j11;
                        if (c1086gP.i(j13)) {
                        }
                        i24 = i11 | i34;
                    } else {
                        j13 = j11;
                    }
                    i24 = i11 | i34;
                } else {
                    j13 = j11;
                    i24 = i11;
                }
                if ((i11 & 48) != 0) {
                    i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
                }
                i25 = i24;
                i26 = i12 & 4096;
                if (i26 != 0) {
                    i25 |= 384;
                } else if ((i11 & 384) != 0) {
                    if (c1086gP.g(f10)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i25 |= i27;
                }
                i28 = 8192 & i12;
                if (i28 != 0) {
                    if ((i11 & 3072) == 0) {
                        if (c1086gP.K(fVar)) {
                            i29 = 2048;
                        } else {
                            i29 = 1024;
                        }
                        i25 |= i29;
                    }
                    if ((306783379 & i13) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f111111111111111111111111111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f1111111111111111111111111111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens11111110 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f1111111111111111111111111111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f1111111111111111111111111111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f1111111111111111111111111111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311111114 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311111114;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111111111111111111111111111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f1111111111111111111111111111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens11111111 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f1111111111111111111111111111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f1111111111111111111111111111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f1111111111111111111111111111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311111115 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311111115;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j111115 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j111115;
                        androidx.compose.ui.h hVar11110 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar11110;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111111111111111111111111111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111111111111111111111111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens11111112 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111111111111111111111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111111111111111111111111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111111111111111111111111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311111116 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311111116;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f11111111111111111111111111111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111111111111111111111111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens11111113 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111111111111111111111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111111111111111111111111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111111111111111111111111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311111117 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311111117;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j111116 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j111116;
                        androidx.compose.ui.h hVar11111 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar11111;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1115 = pVar13;
                        final androidx.compose.ui.graphics.l0 l0Var111 = l0Var2;
                        final long j211111112 = j18;
                        final long j211111113 = j16;
                        final long j211111114 = j14;
                        final long j211111115 = j17;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar1115, l0Var111, j211111112, j211111113, j211111114, j211111115, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i25 |= 3072;
                if ((306783379 & i13) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f11111111111111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens11111114 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i311111118 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i311111118;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens11111115 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i311111119 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i311111119;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j111117 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j111117;
                    androidx.compose.ui.h hVar11112 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar11112;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f1111111111111111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens11111116 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f1111111111111111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f1111111111111111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f1111111111111111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111111110 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111111110;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f1111111111111111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f1111111111111111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens11111117 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f1111111111111111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f1111111111111111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f1111111111111111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111111111 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111111111;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j111118 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j111118;
                    androidx.compose.ui.h hVar11113 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar11113;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1116 = pVar13;
                    final androidx.compose.ui.graphics.l0 l0Var112 = l0Var2;
                    final long j211111116 = j18;
                    final long j211111117 = j16;
                    final long j211111118 = j14;
                    final long j211111119 = j17;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar1116, l0Var112, j211111116, j211111117, j211111118, j211111119, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 3072;
            pVar6 = pVar2;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar5)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i13 |= i23;
                }
                if ((i10 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i12 & 256) == 0) {
                        i33 = 33554432;
                    } else {
                        i33 = 33554432;
                    }
                    i13 |= i33;
                }
                if ((i10 & 805306368) != 0) {
                    if ((i12 & 512) == 0) {
                        i32 = 268435456;
                    } else {
                        i32 = 268435456;
                    }
                    i13 |= i32;
                }
                if ((i11 & 6) == 0) {
                    if ((i12 & 1024) == 0) {
                        j13 = j11;
                        if (c1086gP.i(j13)) {
                        }
                        i24 = i11 | i34;
                    } else {
                        j13 = j11;
                    }
                    i24 = i11 | i34;
                } else {
                    j13 = j11;
                    i24 = i11;
                }
                if ((i11 & 48) != 0) {
                    i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
                }
                i25 = i24;
                i26 = i12 & 4096;
                if (i26 != 0) {
                    i25 |= 384;
                } else if ((i11 & 384) != 0) {
                    if (c1086gP.g(f10)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i25 |= i27;
                }
                i28 = 8192 & i12;
                if (i28 != 0) {
                    if ((i11 & 3072) == 0) {
                        if (c1086gP.K(fVar)) {
                            i29 = 2048;
                        } else {
                            i29 = 1024;
                        }
                        i25 |= i29;
                    }
                    if ((306783379 & i13) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111111111111111111111111111111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111111111111111111111111111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens11111118 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111111111111111111111111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111111111111111111111111111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111111111111111111111111111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3111111112 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3111111112;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f11111111111111111111111111111111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111111111111111111111111111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens11111119 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111111111111111111111111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111111111111111111111111111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111111111111111111111111111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3111111113 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3111111113;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j111119 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j111119;
                        androidx.compose.ui.h hVar11114 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar11114;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f11111111111111111111111111111111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f111111111111111111111111111111111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens111111110 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f111111111111111111111111111111111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f111111111111111111111111111111111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f111111111111111111111111111111111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3111111114 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3111111114;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f111111111111111111111111111111111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f111111111111111111111111111111111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens111111111 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f111111111111111111111111111111111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f111111111111111111111111111111111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f111111111111111111111111111111111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i3111111115 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i3111111115;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j1111110 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j1111110;
                        androidx.compose.ui.h hVar11115 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar11115;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1117 = pVar13;
                        final androidx.compose.ui.graphics.l0 l0Var113 = l0Var2;
                        final long j2111111110 = j18;
                        final long j2111111111 = j16;
                        final long j2111111112 = j14;
                        final long j2111111113 = j17;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar1117, l0Var113, j2111111110, j2111111111, j2111111112, j2111111113, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i25 |= 3072;
                if ((306783379 & i13) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111111111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f1111111111111111111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111111112 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f1111111111111111111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f1111111111111111111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f1111111111111111111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111111116 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111111116;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f1111111111111111111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f1111111111111111111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111111113 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f1111111111111111111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f1111111111111111111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f1111111111111111111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111111117 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111111117;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j1111111 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j1111111;
                    androidx.compose.ui.h hVar11116 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar11116;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f1111111111111111111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f11111111111111111111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111111114 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f11111111111111111111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f11111111111111111111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f11111111111111111111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111111118 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111111118;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f11111111111111111111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f11111111111111111111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111111115 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f11111111111111111111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f11111111111111111111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f11111111111111111111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111111119 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111111119;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j1111112 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j1111112;
                    androidx.compose.ui.h hVar11117 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar11117;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1118 = pVar13;
                    final androidx.compose.ui.graphics.l0 l0Var114 = l0Var2;
                    final long j2111111114 = j18;
                    final long j2111111115 = j16;
                    final long j2111111116 = j14;
                    final long j2111111117 = j17;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar1118, l0Var114, j2111111114, j2111111115, j2111111116, j2111111117, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(pVar4)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            i22 = i12 & 64;
            if (i22 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(pVar5)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i13 |= i23;
            }
            if ((i10 & 12582912) != 0) {
                i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
            }
            if ((i10 & 100663296) != 0) {
                if ((i12 & 256) == 0) {
                    i33 = 33554432;
                } else {
                    i33 = 33554432;
                }
                i13 |= i33;
            }
            if ((i10 & 805306368) != 0) {
                if ((i12 & 512) == 0) {
                    i32 = 268435456;
                } else {
                    i32 = 268435456;
                }
                i13 |= i32;
            }
            if ((i11 & 6) == 0) {
                if ((i12 & 1024) == 0) {
                    j13 = j11;
                    if (c1086gP.i(j13)) {
                    }
                    i24 = i11 | i34;
                } else {
                    j13 = j11;
                }
                i24 = i11 | i34;
            } else {
                j13 = j11;
                i24 = i11;
            }
            if ((i11 & 48) != 0) {
                i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
            }
            i25 = i24;
            i26 = i12 & 4096;
            if (i26 != 0) {
                i25 |= 384;
            } else if ((i11 & 384) != 0) {
                if (c1086gP.g(f10)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i25 |= i27;
            }
            i28 = 8192 & i12;
            if (i28 != 0) {
                if ((i11 & 3072) == 0) {
                    if (c1086gP.K(fVar)) {
                        i29 = 2048;
                    } else {
                        i29 = 1024;
                    }
                    i25 |= i29;
                }
                if ((306783379 & i13) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f11111111111111111111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111111116 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i31111111110 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i31111111110;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111111111111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111111117 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i31111111111 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i31111111111;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j1111113 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j1111113;
                    androidx.compose.ui.h hVar11118 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar11118;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111111111111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111111118 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f1111111111111111111111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i31111111112 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i31111111112;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111111119 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f1111111111111111111111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i31111111113 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i31111111113;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j1111114 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j1111114;
                    androidx.compose.ui.h hVar11119 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar11119;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1119 = pVar13;
                    final androidx.compose.ui.graphics.l0 l0Var115 = l0Var2;
                    final long j2111111118 = j18;
                    final long j2111111119 = j16;
                    final long j21111111110 = j14;
                    final long j21111111111 = j17;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar1119, l0Var115, j2111111118, j2111111119, j21111111110, j21111111111, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i25 |= 3072;
            if ((306783379 & i13) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111119 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111110 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens1111111110 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f11111111111111111111111111111111111111111111111 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111112 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111113 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i31111111114 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i31111111114;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                } else {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111114 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111115 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens1111111111 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f11111111111111111111111111111111111111111111116 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111117 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111118 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i31111111115 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i31111111115;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                }
                c1086gP.U();
                AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                pVar13 = pVar10;
                f13 = f12;
                fVar3 = fVar2;
                pVar14 = pVar12;
                long j1111115 = j15;
                pVar15 = pVar11;
                pVar16 = pVar6;
                j18 = j1111115;
                androidx.compose.ui.h hVar111110 = hVar2;
                l0Var2 = l0VarA;
                hVar3 = hVar111110;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111119 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens1111111112 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i31111111116 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i31111111116;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                } else {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens1111111113 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i31111111117 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i31111111117;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                }
                c1086gP.U();
                AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                pVar13 = pVar10;
                f13 = f12;
                fVar3 = fVar2;
                pVar14 = pVar12;
                long j1111116 = j15;
                pVar15 = pVar11;
                pVar16 = pVar6;
                j18 = j1111116;
                androidx.compose.ui.h hVar111111 = hVar2;
                l0Var2 = l0VarA;
                hVar3 = hVar111111;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11110 = pVar13;
                final androidx.compose.ui.graphics.l0 l0Var116 = l0Var2;
                final long j21111111112 = j18;
                final long j21111111113 = j16;
                final long j21111111114 = j14;
                final long j21111111115 = j17;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar11110, l0Var116, j21111111112, j21111111113, j21111111114, j21111111115, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 384;
        hVar2 = hVar;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i10 & 3072) == 0) {
                pVar6 = pVar2;
                if (c1086gP.k(pVar6)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.k(pVar5)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i13 |= i23;
                }
                if ((i10 & 12582912) != 0) {
                    i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
                }
                if ((i10 & 100663296) != 0) {
                    if ((i12 & 256) == 0) {
                        i33 = 33554432;
                    } else {
                        i33 = 33554432;
                    }
                    i13 |= i33;
                }
                if ((i10 & 805306368) != 0) {
                    if ((i12 & 512) == 0) {
                        i32 = 268435456;
                    } else {
                        i32 = 268435456;
                    }
                    i13 |= i32;
                }
                if ((i11 & 6) == 0) {
                    if ((i12 & 1024) == 0) {
                        j13 = j11;
                        if (c1086gP.i(j13)) {
                        }
                        i24 = i11 | i34;
                    } else {
                        j13 = j11;
                    }
                    i24 = i11 | i34;
                } else {
                    j13 = j11;
                    i24 = i11;
                }
                if ((i11 & 48) != 0) {
                    i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
                }
                i25 = i24;
                i26 = i12 & 4096;
                if (i26 != 0) {
                    i25 |= 384;
                } else if ((i11 & 384) != 0) {
                    if (c1086gP.g(f10)) {
                        i27 = 256;
                    } else {
                        i27 = 128;
                    }
                    i25 |= i27;
                }
                i28 = 8192 & i12;
                if (i28 != 0) {
                    if ((i11 & 3072) == 0) {
                        if (c1086gP.K(fVar)) {
                            i29 = 2048;
                        } else {
                            i29 = 1024;
                        }
                        i25 |= i29;
                    }
                    if ((306783379 & i13) != 306783378) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f1111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens1111111114 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f1111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f1111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f1111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i31111111118 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i31111111118;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f1111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens1111111115 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f1111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f1111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f1111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i31111111119 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i31111111119;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j1111117 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j1111117;
                        androidx.compose.ui.h hVar111112 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar111112;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f1111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens1111111116 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311111111110 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311111111110;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        } else {
                            if (i14 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i16 != 0) {
                                pVar6 = null;
                            }
                            if (i18 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            if (i20 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i22 == 0) {
                            }
                            if ((128 & i12) != 0) {
                                float f11111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                                l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                                i13 &= -29360129;
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((256 & i12) != 0) {
                                float f11111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                                ShapeKeyTokens shapeKeyTokens1111111117 = C0610e.f1258a;
                                jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                                i13 &= -234881025;
                            } else {
                                jD = j;
                            }
                            if ((i12 & 512) != 0) {
                                float f11111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                                jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                                i13 = (-1879048193) & i13;
                            } else {
                                jD2 = j10;
                            }
                            if ((1024 & i12) != 0) {
                                float f11111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                                jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                                i25 &= -15;
                            } else {
                                jD3 = j13;
                            }
                            if ((2048 & i12) != 0) {
                                float f11111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                                jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                                i25 &= -113;
                            } else {
                                jD4 = j12;
                            }
                            if (i26 != 0) {
                                f11 = C1046a.f12418a;
                            } else {
                                f11 = f10;
                            }
                            if (i28 != 0) {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                int i311111111111 = i13;
                                fVar2 = new androidx.compose.ui.window.f(7);
                                pVar10 = pVar9;
                                i31 = i311111111111;
                            } else {
                                i30 = i25;
                                f12 = f11;
                                j14 = jD3;
                                pVar10 = pVar9;
                                pVar11 = pVar7;
                                pVar12 = pVar8;
                                j15 = jD;
                                j16 = jD2;
                                j17 = jD4;
                                i31 = i13;
                                fVar2 = fVar;
                            }
                        }
                        c1086gP.U();
                        AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                        pVar13 = pVar10;
                        f13 = f12;
                        fVar3 = fVar2;
                        pVar14 = pVar12;
                        long j1111118 = j15;
                        pVar15 = pVar11;
                        pVar16 = pVar6;
                        j18 = j1111118;
                        androidx.compose.ui.h hVar111113 = hVar2;
                        l0Var2 = l0VarA;
                        hVar3 = hVar111113;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111 = pVar13;
                        final androidx.compose.ui.graphics.l0 l0Var117 = l0Var2;
                        final long j21111111116 = j18;
                        final long j21111111117 = j16;
                        final long j21111111118 = j14;
                        final long j21111111119 = j17;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar11111, l0Var117, j21111111116, j21111111117, j21111111118, j21111111119, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i25 |= 3072;
                if ((306783379 & i13) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f11111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens1111111118 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i311111111112 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i311111111112;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens1111111119 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i311111111113 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i311111111113;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j1111119 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j1111119;
                    androidx.compose.ui.h hVar111114 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar111114;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens11111111110 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f1111111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i311111111114 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i311111111114;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens11111111111 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f1111111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i311111111115 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i311111111115;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j11111110 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j11111110;
                    androidx.compose.ui.h hVar111115 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar111115;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11112 = pVar13;
                    final androidx.compose.ui.graphics.l0 l0Var118 = l0Var2;
                    final long j211111111110 = j18;
                    final long j211111111111 = j16;
                    final long j211111111112 = j14;
                    final long j211111111113 = j17;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar11112, l0Var118, j211111111110, j211111111111, j211111111112, j211111111113, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(pVar4)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            i22 = i12 & 64;
            if (i22 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(pVar5)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i13 |= i23;
            }
            if ((i10 & 12582912) != 0) {
                i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
            }
            if ((i10 & 100663296) != 0) {
                if ((i12 & 256) == 0) {
                    i33 = 33554432;
                } else {
                    i33 = 33554432;
                }
                i13 |= i33;
            }
            if ((i10 & 805306368) != 0) {
                if ((i12 & 512) == 0) {
                    i32 = 268435456;
                } else {
                    i32 = 268435456;
                }
                i13 |= i32;
            }
            if ((i11 & 6) == 0) {
                if ((i12 & 1024) == 0) {
                    j13 = j11;
                    if (c1086gP.i(j13)) {
                    }
                    i24 = i11 | i34;
                } else {
                    j13 = j11;
                }
                i24 = i11 | i34;
            } else {
                j13 = j11;
                i24 = i11;
            }
            if ((i11 & 48) != 0) {
                i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
            }
            i25 = i24;
            i26 = i12 & 4096;
            if (i26 != 0) {
                i25 |= 384;
            } else if ((i11 & 384) != 0) {
                if (c1086gP.g(f10)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i25 |= i27;
            }
            i28 = 8192 & i12;
            if (i28 != 0) {
                if ((i11 & 3072) == 0) {
                    if (c1086gP.K(fVar)) {
                        i29 = 2048;
                    } else {
                        i29 = 1024;
                    }
                    i25 |= i29;
                }
                if ((306783379 & i13) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f11111111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens11111111112 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f11111111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f11111111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f11111111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i311111111116 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i311111111116;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f11111111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f11111111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens11111111113 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f11111111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f11111111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f11111111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i311111111117 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i311111111117;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j11111111 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j11111111;
                    androidx.compose.ui.h hVar111116 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar111116;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f11111111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens11111111114 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i311111111118 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i311111111118;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens11111111115 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i311111111119 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i311111111119;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j11111112 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j11111112;
                    androidx.compose.ui.h hVar111117 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar111117;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11113 = pVar13;
                    final androidx.compose.ui.graphics.l0 l0Var119 = l0Var2;
                    final long j211111111114 = j18;
                    final long j211111111115 = j16;
                    final long j211111111116 = j14;
                    final long j211111111117 = j17;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar11113, l0Var119, j211111111114, j211111111115, j211111111116, j211111111117, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i25 |= 3072;
            if ((306783379 & i13) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens11111111116 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f1111111111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i3111111111110 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i3111111111110;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                } else {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens11111111117 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f1111111111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i3111111111111 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i3111111111111;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                }
                c1086gP.U();
                AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                pVar13 = pVar10;
                f13 = f12;
                fVar3 = fVar2;
                pVar14 = pVar12;
                long j11111113 = j15;
                pVar15 = pVar11;
                pVar16 = pVar6;
                j18 = j11111113;
                androidx.compose.ui.h hVar111118 = hVar2;
                l0Var2 = l0VarA;
                hVar3 = hVar111118;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens11111111118 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i3111111111112 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i3111111111112;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                } else {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens11111111119 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f11111111111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i3111111111113 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i3111111111113;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                }
                c1086gP.U();
                AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                pVar13 = pVar10;
                f13 = f12;
                fVar3 = fVar2;
                pVar14 = pVar12;
                long j11111114 = j15;
                pVar15 = pVar11;
                pVar16 = pVar6;
                j18 = j11111114;
                androidx.compose.ui.h hVar111119 = hVar2;
                l0Var2 = l0VarA;
                hVar3 = hVar111119;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11114 = pVar13;
                final androidx.compose.ui.graphics.l0 l0Var1110 = l0Var2;
                final long j211111111118 = j18;
                final long j211111111119 = j16;
                final long j2111111111110 = j14;
                final long j2111111111111 = j17;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar11114, l0Var1110, j211111111118, j211111111119, j2111111111110, j2111111111111, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 3072;
        pVar6 = pVar2;
        i18 = i12 & 16;
        if (i18 != 0) {
            if ((i10 & 24576) == 0) {
                if (c1086gP.k(pVar3)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i13 |= i19;
            }
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.k(pVar4)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            i22 = i12 & 64;
            if (i22 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.k(pVar5)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i13 |= i23;
            }
            if ((i10 & 12582912) != 0) {
                i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
            }
            if ((i10 & 100663296) != 0) {
                if ((i12 & 256) == 0) {
                    i33 = 33554432;
                } else {
                    i33 = 33554432;
                }
                i13 |= i33;
            }
            if ((i10 & 805306368) != 0) {
                if ((i12 & 512) == 0) {
                    i32 = 268435456;
                } else {
                    i32 = 268435456;
                }
                i13 |= i32;
            }
            if ((i11 & 6) == 0) {
                if ((i12 & 1024) == 0) {
                    j13 = j11;
                    if (c1086gP.i(j13)) {
                    }
                    i24 = i11 | i34;
                } else {
                    j13 = j11;
                }
                i24 = i11 | i34;
            } else {
                j13 = j11;
                i24 = i11;
            }
            if ((i11 & 48) != 0) {
                i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
            }
            i25 = i24;
            i26 = i12 & 4096;
            if (i26 != 0) {
                i25 |= 384;
            } else if ((i11 & 384) != 0) {
                if (c1086gP.g(f10)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i25 |= i27;
            }
            i28 = 8192 & i12;
            if (i28 != 0) {
                if ((i11 & 3072) == 0) {
                    if (c1086gP.K(fVar)) {
                        i29 = 2048;
                    } else {
                        i29 = 1024;
                    }
                    i25 |= i29;
                }
                if ((306783379 & i13) != 306783378) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f11111111111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111111111110 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111111111114 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111111111114;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111111111111 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f111111111111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111111111115 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111111111115;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j11111115 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j11111115;
                    androidx.compose.ui.h hVar1111110 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar1111110;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f111111111111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111111111112 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f1111111111111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111111111116 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111111111116;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    } else {
                        if (i14 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i16 != 0) {
                            pVar6 = null;
                        }
                        if (i18 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i20 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i22 == 0) {
                        }
                        if ((128 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                            l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                            i13 &= -29360129;
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((256 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                            ShapeKeyTokens shapeKeyTokens111111111113 = C0610e.f1258a;
                            jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                            i13 &= -234881025;
                        } else {
                            jD = j;
                        }
                        if ((i12 & 512) != 0) {
                            float f1111111111111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                            jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                            i13 = (-1879048193) & i13;
                        } else {
                            jD2 = j10;
                        }
                        if ((1024 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                            jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                            i25 &= -15;
                        } else {
                            jD3 = j13;
                        }
                        if ((2048 & i12) != 0) {
                            float f1111111111111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                            jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                            i25 &= -113;
                        } else {
                            jD4 = j12;
                        }
                        if (i26 != 0) {
                            f11 = C1046a.f12418a;
                        } else {
                            f11 = f10;
                        }
                        if (i28 != 0) {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            int i3111111111117 = i13;
                            fVar2 = new androidx.compose.ui.window.f(7);
                            pVar10 = pVar9;
                            i31 = i3111111111117;
                        } else {
                            i30 = i25;
                            f12 = f11;
                            j14 = jD3;
                            pVar10 = pVar9;
                            pVar11 = pVar7;
                            pVar12 = pVar8;
                            j15 = jD;
                            j16 = jD2;
                            j17 = jD4;
                            i31 = i13;
                            fVar2 = fVar;
                        }
                    }
                    c1086gP.U();
                    AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                    pVar13 = pVar10;
                    f13 = f12;
                    fVar3 = fVar2;
                    pVar14 = pVar12;
                    long j11111116 = j15;
                    pVar15 = pVar11;
                    pVar16 = pVar6;
                    j18 = j11111116;
                    androidx.compose.ui.h hVar1111111 = hVar2;
                    l0Var2 = l0VarA;
                    hVar3 = hVar1111111;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11115 = pVar13;
                    final androidx.compose.ui.graphics.l0 l0Var1111 = l0Var2;
                    final long j2111111111112 = j18;
                    final long j2111111111113 = j16;
                    final long j2111111111114 = j14;
                    final long j2111111111115 = j17;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar11115, l0Var1111, j2111111111112, j2111111111113, j2111111111114, j2111111111115, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i25 |= 3072;
            if ((306783379 & i13) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens111111111114 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i3111111111118 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i3111111111118;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                } else {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens111111111115 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i3111111111119 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i3111111111119;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                }
                c1086gP.U();
                AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                pVar13 = pVar10;
                f13 = f12;
                fVar3 = fVar2;
                pVar14 = pVar12;
                long j11111117 = j15;
                pVar15 = pVar11;
                pVar16 = pVar6;
                j18 = j11111117;
                androidx.compose.ui.h hVar1111112 = hVar2;
                l0Var2 = l0VarA;
                hVar3 = hVar1111112;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens111111111116 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f111111111111111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i31111111111110 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i31111111111110;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                } else {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens111111111117 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f111111111111111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i31111111111111 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i31111111111111;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                }
                c1086gP.U();
                AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                pVar13 = pVar10;
                f13 = f12;
                fVar3 = fVar2;
                pVar14 = pVar12;
                long j11111118 = j15;
                pVar15 = pVar11;
                pVar16 = pVar6;
                j18 = j11111118;
                androidx.compose.ui.h hVar1111113 = hVar2;
                l0Var2 = l0VarA;
                hVar3 = hVar1111113;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11116 = pVar13;
                final androidx.compose.ui.graphics.l0 l0Var1112 = l0Var2;
                final long j2111111111116 = j18;
                final long j2111111111117 = j16;
                final long j2111111111118 = j14;
                final long j2111111111119 = j17;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar11116, l0Var1112, j2111111111116, j2111111111117, j2111111111118, j2111111111119, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 24576;
        i20 = i12 & 32;
        if (i20 != 0) {
            i13 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.k(pVar4)) {
                i21 = 131072;
            } else {
                i21 = 65536;
            }
            i13 |= i21;
        }
        i22 = i12 & 64;
        if (i22 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c1086gP.k(pVar5)) {
                i23 = 1048576;
            } else {
                i23 = 524288;
            }
            i13 |= i23;
        }
        if ((i10 & 12582912) != 0) {
            i13 |= ((i12 & 128) == 0 || !c1086gP.K(l0Var)) ? 4194304 : 8388608;
        }
        if ((i10 & 100663296) != 0) {
            if ((i12 & 256) == 0) {
                i33 = 33554432;
            } else {
                i33 = 33554432;
            }
            i13 |= i33;
        }
        if ((i10 & 805306368) != 0) {
            if ((i12 & 512) == 0) {
                i32 = 268435456;
            } else {
                i32 = 268435456;
            }
            i13 |= i32;
        }
        if ((i11 & 6) == 0) {
            if ((i12 & 1024) == 0) {
                j13 = j11;
                if (c1086gP.i(j13)) {
                }
                i24 = i11 | i34;
            } else {
                j13 = j11;
            }
            i24 = i11 | i34;
        } else {
            j13 = j11;
            i24 = i11;
        }
        if ((i11 & 48) != 0) {
            i24 |= ((i12 & 2048) == 0 || !c1086gP.i(j12)) ? 16 : 32;
        }
        i25 = i24;
        i26 = i12 & 4096;
        if (i26 != 0) {
            i25 |= 384;
        } else if ((i11 & 384) != 0) {
            if (c1086gP.g(f10)) {
                i27 = 256;
            } else {
                i27 = 128;
            }
            i25 |= i27;
        }
        i28 = 8192 & i12;
        if (i28 != 0) {
            if ((i11 & 3072) == 0) {
                if (c1086gP.K(fVar)) {
                    i29 = 2048;
                } else {
                    i29 = 1024;
                }
                i25 |= i29;
            }
            if ((306783379 & i13) != 306783378) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f111111111111111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens111111111118 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f1111111111111111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i31111111111112 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i31111111111112;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                } else {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens111111111119 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f1111111111111111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i31111111111113 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i31111111111113;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                }
                c1086gP.U();
                AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                pVar13 = pVar10;
                f13 = f12;
                fVar3 = fVar2;
                pVar14 = pVar12;
                long j11111119 = j15;
                pVar15 = pVar11;
                pVar16 = pVar6;
                j18 = j11111119;
                androidx.compose.ui.h hVar1111114 = hVar2;
                l0Var2 = l0VarA;
                hVar3 = hVar1111114;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f1111111111111111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens1111111111110 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i31111111111114 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i31111111111114;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                } else {
                    if (i14 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i16 != 0) {
                        pVar6 = null;
                    }
                    if (i18 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i20 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i22 == 0) {
                    }
                    if ((128 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                        l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                        i13 &= -29360129;
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((256 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                        ShapeKeyTokens shapeKeyTokens1111111111111 = C0610e.f1258a;
                        jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                        i13 &= -234881025;
                    } else {
                        jD = j;
                    }
                    if ((i12 & 512) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                        jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                        i13 = (-1879048193) & i13;
                    } else {
                        jD2 = j10;
                    }
                    if ((1024 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                        jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                        i25 &= -15;
                    } else {
                        jD3 = j13;
                    }
                    if ((2048 & i12) != 0) {
                        float f11111111111111111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                        jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                        i25 &= -113;
                    } else {
                        jD4 = j12;
                    }
                    if (i26 != 0) {
                        f11 = C1046a.f12418a;
                    } else {
                        f11 = f10;
                    }
                    if (i28 != 0) {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        int i31111111111115 = i13;
                        fVar2 = new androidx.compose.ui.window.f(7);
                        pVar10 = pVar9;
                        i31 = i31111111111115;
                    } else {
                        i30 = i25;
                        f12 = f11;
                        j14 = jD3;
                        pVar10 = pVar9;
                        pVar11 = pVar7;
                        pVar12 = pVar8;
                        j15 = jD;
                        j16 = jD2;
                        j17 = jD4;
                        i31 = i13;
                        fVar2 = fVar;
                    }
                }
                c1086gP.U();
                AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
                pVar13 = pVar10;
                f13 = f12;
                fVar3 = fVar2;
                pVar14 = pVar12;
                long j111111110 = j15;
                pVar15 = pVar11;
                pVar16 = pVar6;
                j18 = j111111110;
                androidx.compose.ui.h hVar1111115 = hVar2;
                l0Var2 = l0VarA;
                hVar3 = hVar1111115;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11117 = pVar13;
                final androidx.compose.ui.graphics.l0 l0Var1113 = l0Var2;
                final long j21111111111110 = j18;
                final long j21111111111111 = j16;
                final long j21111111111112 = j14;
                final long j21111111111113 = j17;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar11117, l0Var1113, j21111111111110, j21111111111111, j21111111111112, j21111111111113, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i25 |= 3072;
        if ((306783379 & i13) != 306783378) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i16 != 0) {
                    pVar6 = null;
                }
                if (i18 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i20 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar4;
                }
                if (i22 == 0) {
                }
                if ((128 & i12) != 0) {
                    float f11111111111111111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                    i13 &= -29360129;
                } else {
                    l0VarA = l0Var;
                }
                if ((256 & i12) != 0) {
                    float f111111111111111111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                    ShapeKeyTokens shapeKeyTokens1111111111112 = C0610e.f1258a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                    i13 &= -234881025;
                } else {
                    jD = j;
                }
                if ((i12 & 512) != 0) {
                    float f111111111111111111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                    i13 = (-1879048193) & i13;
                } else {
                    jD2 = j10;
                }
                if ((1024 & i12) != 0) {
                    float f111111111111111111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                    i25 &= -15;
                } else {
                    jD3 = j13;
                }
                if ((2048 & i12) != 0) {
                    float f111111111111111111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                    i25 &= -113;
                } else {
                    jD4 = j12;
                }
                if (i26 != 0) {
                    f11 = C1046a.f12418a;
                } else {
                    f11 = f10;
                }
                if (i28 != 0) {
                    i30 = i25;
                    f12 = f11;
                    j14 = jD3;
                    pVar11 = pVar7;
                    pVar12 = pVar8;
                    j15 = jD;
                    j16 = jD2;
                    j17 = jD4;
                    int i31111111111116 = i13;
                    fVar2 = new androidx.compose.ui.window.f(7);
                    pVar10 = pVar9;
                    i31 = i31111111111116;
                } else {
                    i30 = i25;
                    f12 = f11;
                    j14 = jD3;
                    pVar10 = pVar9;
                    pVar11 = pVar7;
                    pVar12 = pVar8;
                    j15 = jD;
                    j16 = jD2;
                    j17 = jD4;
                    i31 = i13;
                    fVar2 = fVar;
                }
            } else {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i16 != 0) {
                    pVar6 = null;
                }
                if (i18 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i20 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar4;
                }
                if (i22 == 0) {
                }
                if ((128 & i12) != 0) {
                    float f111111111111111111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                    i13 &= -29360129;
                } else {
                    l0VarA = l0Var;
                }
                if ((256 & i12) != 0) {
                    float f111111111111111111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                    ShapeKeyTokens shapeKeyTokens1111111111113 = C0610e.f1258a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                    i13 &= -234881025;
                } else {
                    jD = j;
                }
                if ((i12 & 512) != 0) {
                    float f111111111111111111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                    i13 = (-1879048193) & i13;
                } else {
                    jD2 = j10;
                }
                if ((1024 & i12) != 0) {
                    float f111111111111111111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                    i25 &= -15;
                } else {
                    jD3 = j13;
                }
                if ((2048 & i12) != 0) {
                    float f111111111111111111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                    i25 &= -113;
                } else {
                    jD4 = j12;
                }
                if (i26 != 0) {
                    f11 = C1046a.f12418a;
                } else {
                    f11 = f10;
                }
                if (i28 != 0) {
                    i30 = i25;
                    f12 = f11;
                    j14 = jD3;
                    pVar11 = pVar7;
                    pVar12 = pVar8;
                    j15 = jD;
                    j16 = jD2;
                    j17 = jD4;
                    int i31111111111117 = i13;
                    fVar2 = new androidx.compose.ui.window.f(7);
                    pVar10 = pVar9;
                    i31 = i31111111111117;
                } else {
                    i30 = i25;
                    f12 = f11;
                    j14 = jD3;
                    pVar10 = pVar9;
                    pVar11 = pVar7;
                    pVar12 = pVar8;
                    j15 = jD;
                    j16 = jD2;
                    j17 = jD4;
                    i31 = i13;
                    fVar2 = fVar;
                }
            }
            c1086gP.U();
            AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
            pVar13 = pVar10;
            f13 = f12;
            fVar3 = fVar2;
            pVar14 = pVar12;
            long j111111111 = j15;
            pVar15 = pVar11;
            pVar16 = pVar6;
            j18 = j111111111;
            androidx.compose.ui.h hVar1111116 = hVar2;
            l0Var2 = l0VarA;
            hVar3 = hVar1111116;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i16 != 0) {
                    pVar6 = null;
                }
                if (i18 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i20 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar4;
                }
                if (i22 == 0) {
                }
                if ((128 & i12) != 0) {
                    float f111111111111111111111111111111111111111111111111111111111111119 = C1046a.f12418a;
                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                    i13 &= -29360129;
                } else {
                    l0VarA = l0Var;
                }
                if ((256 & i12) != 0) {
                    float f1111111111111111111111111111111111111111111111111111111111111110 = C1046a.f12418a;
                    ShapeKeyTokens shapeKeyTokens1111111111114 = C0610e.f1258a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                    i13 &= -234881025;
                } else {
                    jD = j;
                }
                if ((i12 & 512) != 0) {
                    float f1111111111111111111111111111111111111111111111111111111111111111 = C1046a.f12418a;
                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                    i13 = (-1879048193) & i13;
                } else {
                    jD2 = j10;
                }
                if ((1024 & i12) != 0) {
                    float f1111111111111111111111111111111111111111111111111111111111111112 = C1046a.f12418a;
                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                    i25 &= -15;
                } else {
                    jD3 = j13;
                }
                if ((2048 & i12) != 0) {
                    float f1111111111111111111111111111111111111111111111111111111111111113 = C1046a.f12418a;
                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                    i25 &= -113;
                } else {
                    jD4 = j12;
                }
                if (i26 != 0) {
                    f11 = C1046a.f12418a;
                } else {
                    f11 = f10;
                }
                if (i28 != 0) {
                    i30 = i25;
                    f12 = f11;
                    j14 = jD3;
                    pVar11 = pVar7;
                    pVar12 = pVar8;
                    j15 = jD;
                    j16 = jD2;
                    j17 = jD4;
                    int i31111111111118 = i13;
                    fVar2 = new androidx.compose.ui.window.f(7);
                    pVar10 = pVar9;
                    i31 = i31111111111118;
                } else {
                    i30 = i25;
                    f12 = f11;
                    j14 = jD3;
                    pVar10 = pVar9;
                    pVar11 = pVar7;
                    pVar12 = pVar8;
                    j15 = jD;
                    j16 = jD2;
                    j17 = jD4;
                    i31 = i13;
                    fVar2 = fVar;
                }
            } else {
                if (i14 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i16 != 0) {
                    pVar6 = null;
                }
                if (i18 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i20 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar4;
                }
                if (i22 == 0) {
                }
                if ((128 & i12) != 0) {
                    float f1111111111111111111111111111111111111111111111111111111111111114 = C1046a.f12418a;
                    l0VarA = ShapesKt.a(C0610e.f1258a, c1086gP);
                    i13 &= -29360129;
                } else {
                    l0VarA = l0Var;
                }
                if ((256 & i12) != 0) {
                    float f1111111111111111111111111111111111111111111111111111111111111115 = C1046a.f12418a;
                    ShapeKeyTokens shapeKeyTokens1111111111115 = C0610e.f1258a;
                    jD = ColorSchemeKt.d(ColorSchemeKeyTokens.f12728u, c1086gP);
                    i13 &= -234881025;
                } else {
                    jD = j;
                }
                if ((i12 & 512) != 0) {
                    float f1111111111111111111111111111111111111111111111111111111111111116 = C1046a.f12418a;
                    jD2 = ColorSchemeKt.d(C0610e.f1263f, c1086gP);
                    i13 = (-1879048193) & i13;
                } else {
                    jD2 = j10;
                }
                if ((1024 & i12) != 0) {
                    float f1111111111111111111111111111111111111111111111111111111111111117 = C1046a.f12418a;
                    jD3 = ColorSchemeKt.d(C0610e.f1259b, c1086gP);
                    i25 &= -15;
                } else {
                    jD3 = j13;
                }
                if ((2048 & i12) != 0) {
                    float f1111111111111111111111111111111111111111111111111111111111111118 = C1046a.f12418a;
                    jD4 = ColorSchemeKt.d(C0610e.f1261d, c1086gP);
                    i25 &= -113;
                } else {
                    jD4 = j12;
                }
                if (i26 != 0) {
                    f11 = C1046a.f12418a;
                } else {
                    f11 = f10;
                }
                if (i28 != 0) {
                    i30 = i25;
                    f12 = f11;
                    j14 = jD3;
                    pVar11 = pVar7;
                    pVar12 = pVar8;
                    j15 = jD;
                    j16 = jD2;
                    j17 = jD4;
                    int i31111111111119 = i13;
                    fVar2 = new androidx.compose.ui.window.f(7);
                    pVar10 = pVar9;
                    i31 = i31111111111119;
                } else {
                    i30 = i25;
                    f12 = f11;
                    j14 = jD3;
                    pVar10 = pVar9;
                    pVar11 = pVar7;
                    pVar12 = pVar8;
                    j15 = jD;
                    j16 = jD2;
                    j17 = jD4;
                    i31 = i13;
                    fVar2 = fVar;
                }
            }
            c1086gP.U();
            AlertDialogKt.c(aVar, pVar, hVar2, pVar6, pVar11, pVar12, pVar10, l0VarA, j15, j16, j14, j17, f12, fVar2, c1086gP, i31 & 2147483646, i30 & 8190);
            pVar13 = pVar10;
            f13 = f12;
            fVar3 = fVar2;
            pVar14 = pVar12;
            long j111111112 = j15;
            pVar15 = pVar11;
            pVar16 = pVar6;
            j18 = j111111112;
            androidx.compose.ui.h hVar1111117 = hVar2;
            l0Var2 = l0VarA;
            hVar3 = hVar1111117;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11118 = pVar13;
            final androidx.compose.ui.graphics.l0 l0Var1114 = l0Var2;
            final long j21111111111114 = j18;
            final long j21111111111115 = j16;
            final long j21111111111116 = j14;
            final long j21111111111117 = j17;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$AlertDialog$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    AndroidAlertDialog_androidKt.a(aVar, pVar, hVar3, pVar16, pVar15, pVar14, pVar11118, l0Var1114, j21111111111114, j21111111111115, j21111111111116, j21111111111117, f13, fVar3, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
