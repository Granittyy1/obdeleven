package androidx.compose.material;

import androidx.compose.foundation.layout.C0958s;
import androidx.compose.foundation.layout.C0959t;
import androidx.compose.foundation.layout.InterfaceC0954n;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.a0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.Y;
import androidx.compose.ui.layout.e0;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ScaffoldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O0 f11798a = new O0(new Ia.a<z>() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        @Override // Ia.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11799b = 16;

    /* JADX WARN: Code duplicated, block: B:100:0x0133  */
    /* JADX WARN: Code duplicated, block: B:102:0x0139  */
    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0142  */
    /* JADX WARN: Code duplicated, block: B:109:0x014a  */
    /* JADX WARN: Code duplicated, block: B:111:0x014e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x0160  */
    /* JADX WARN: Code duplicated, block: B:120:0x0168  */
    /* JADX WARN: Code duplicated, block: B:121:0x016d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0173  */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:126:0x017c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0184  */
    /* JADX WARN: Code duplicated, block: B:132:0x0188  */
    /* JADX WARN: Code duplicated, block: B:135:0x0193 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x019a  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:154:0x01be  */
    /* JADX WARN: Code duplicated, block: B:157:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:165:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:168:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:170:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:173:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:175:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:179:0x0202  */
    /* JADX WARN: Code duplicated, block: B:182:0x0208  */
    /* JADX WARN: Code duplicated, block: B:183:0x020d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0213  */
    /* JADX WARN: Code duplicated, block: B:187:0x0219  */
    /* JADX WARN: Code duplicated, block: B:191:0x0227  */
    /* JADX WARN: Code duplicated, block: B:195:0x0234  */
    /* JADX WARN: Code duplicated, block: B:198:0x023d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0244  */
    /* JADX WARN: Code duplicated, block: B:225:0x02a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:227:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:230:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:231:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:233:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:234:0x02be  */
    /* JADX WARN: Code duplicated, block: B:236:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:237:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:239:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:240:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:242:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:243:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:245:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:246:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:248:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:250:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:251:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:253:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:254:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:257:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:259:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:261:0x0302  */
    /* JADX WARN: Code duplicated, block: B:262:0x0305  */
    /* JADX WARN: Code duplicated, block: B:265:0x030d  */
    /* JADX WARN: Code duplicated, block: B:266:0x0320  */
    /* JADX WARN: Code duplicated, block: B:269:0x032a  */
    /* JADX WARN: Code duplicated, block: B:270:0x0331  */
    /* JADX WARN: Code duplicated, block: B:273:0x0337  */
    /* JADX WARN: Code duplicated, block: B:274:0x0340  */
    /* JADX WARN: Code duplicated, block: B:277:0x0346  */
    /* JADX WARN: Code duplicated, block: B:278:0x035e  */
    /* JADX WARN: Code duplicated, block: B:281:0x0366  */
    /* JADX WARN: Code duplicated, block: B:282:0x0388  */
    /* JADX WARN: Code duplicated, block: B:284:0x0429  */
    /* JADX WARN: Code duplicated, block: B:287:0x0454  */
    /* JADX WARN: Code duplicated, block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0103  */
    /* JADX WARN: Code duplicated, block: B:85:0x0106  */
    /* JADX WARN: Code duplicated, block: B:89:0x0110  */
    /* JADX WARN: Code duplicated, block: B:90:0x0115  */
    /* JADX WARN: Code duplicated, block: B:92:0x011b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0121  */
    /* JADX WARN: Code duplicated, block: B:95:0x0124  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e  */
    public static final void a(androidx.compose.ui.h hVar, M m7, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, int i10, boolean z10, Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2, boolean z11, l0 l0Var, float f10, long j, long j10, long j11, long j12, long j13, final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3, InterfaceC1084f interfaceC1084f, final int i11, final int i12, final int i13) {
        int i14;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z12;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        boolean z13;
        C1086g c1086g;
        final androidx.compose.ui.h hVar2;
        final M m10;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5;
        final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar4;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6;
        final int i33;
        final Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar5;
        final boolean z14;
        final long j14;
        long j15;
        final long j16;
        final long j17;
        final long j18;
        final boolean z15;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7;
        final l0 l0Var2;
        final float f11;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar3;
        M mD;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9;
        Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar6;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar10;
        int i34;
        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar7;
        boolean z16;
        l0 l0Var3;
        int i35;
        float f12;
        androidx.compose.ui.h hVar4;
        long jH;
        boolean z17;
        long jB;
        long jA;
        long j19;
        long jA2;
        long jB2;
        long j20;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11;
        long j21;
        long j22;
        int i36;
        long j23;
        int i37;
        int i38;
        boolean z18;
        float f13;
        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar8;
        int i39;
        C1086g c1086gP = interfaceC1084f.p(1037492569);
        int i40 = i13 & 1;
        if (i40 != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (c1086gP.K(hVar) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= ((i13 & 2) == 0 && c1086gP.K(m7)) ? 32 : 16;
        }
        int i41 = i13 & 4;
        if (i41 == 0) {
            if ((i11 & 384) == 0) {
                pVar4 = pVar;
                i14 |= c1086gP.k(pVar4) ? 256 : 128;
            }
            i15 = i13 & 8;
            if (i15 != 0) {
                if ((i11 & 3072) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 16;
                if (i17 != 0) {
                    if ((i11 & 24576) == 0) {
                        if (c1086gP.k(qVar)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 32;
                    if (i19 != 0) {
                        i14 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        if (c1086gP.k(pVar3)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 64;
                    i22 = 524288;
                    if (i21 != 0) {
                        i14 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        if (c1086gP.h(i10)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 128;
                    if (i24 != 0) {
                        i14 |= 12582912;
                        z12 = z10;
                    } else {
                        z12 = z10;
                        if ((i11 & 12582912) == 0) {
                            if (c1086gP.c(z12)) {
                                i25 = 8388608;
                            } else {
                                i25 = 4194304;
                            }
                            i14 |= i25;
                        }
                    }
                    i26 = i13 & 256;
                    if (i26 != 0) {
                        i14 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        if (c1086gP.k(qVar2)) {
                            i27 = 67108864;
                        } else {
                            i27 = 33554432;
                        }
                        i14 |= i27;
                    }
                    i28 = i13 & 512;
                    if (i28 != 0) {
                        i14 |= 805306368;
                    } else if ((i11 & 805306368) == 0) {
                        if (c1086gP.c(z11)) {
                            i29 = 536870912;
                        } else {
                            i29 = 268435456;
                        }
                        i14 |= i29;
                    }
                    if ((i12 & 6) == 0) {
                        i30 = i12 | (((i13 & 1024) == 0 || !c1086gP.K(l0Var)) ? 2 : 4);
                    } else {
                        i30 = i12;
                    }
                    i31 = i13 & 2048;
                    if (i31 != 0) {
                        i30 |= 48;
                    } else if ((i12 & 48) == 0) {
                        if (c1086gP.g(f10)) {
                            i32 = 32;
                        } else {
                            i32 = 16;
                        }
                        i30 |= i32;
                    }
                    if ((i12 & 384) != 0) {
                        i30 |= ((i13 & 4096) == 0 || !c1086gP.i(j)) ? 128 : 256;
                    }
                    if ((i12 & 3072) != 0) {
                        i30 |= ((i13 & 8192) == 0 || !c1086gP.i(j10)) ? 1024 : 2048;
                    }
                    if ((i12 & 24576) != 0) {
                        i30 |= ((i13 & 16384) == 0 || !c1086gP.i(j11)) ? 8192 : 16384;
                    }
                    if ((i12 & 196608) != 0) {
                        if ((i13 & 32768) == 0 || !c1086gP.i(j12)) {
                            i39 = 65536;
                        } else {
                            i39 = 131072;
                        }
                        i30 |= i39;
                    }
                    if ((i12 & 1572864) != 0) {
                        if ((i13 & 65536) == 0 && c1086gP.i(j13)) {
                            i22 = 1048576;
                        }
                        i30 |= i22;
                    }
                    if ((i13 & 131072) != 0) {
                        i30 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        i30 |= c1086gP.k(qVar3) ? 8388608 : 4194304;
                    }
                    if ((i14 & 306783379) == 306783378 || (i30 & 4793491) != 4793490) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c1086gP.C(i14 & 1, z13)) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0 || c1086gP.a0()) {
                            if (i40 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i13 & 2) != 0) {
                                mD = d(c1086gP);
                                i14 &= -113;
                            } else {
                                mD = m7;
                            }
                            if (i41 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                            } else {
                                pVar8 = pVar4;
                            }
                            if (i15 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i17 != 0) {
                                qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                            } else {
                                qVar6 = qVar;
                            }
                            if (i19 != 0) {
                                pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i21 != 0) {
                                i34 = 2;
                            } else {
                                i34 = i10;
                            }
                            if (i24 != 0) {
                                z12 = false;
                            }
                            if (i26 != 0) {
                                qVar7 = null;
                            } else {
                                qVar7 = qVar2;
                            }
                            if (i28 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                            if ((i13 & 1024) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                                i30 &= -15;
                            } else {
                                l0Var3 = l0Var;
                            }
                            i35 = i30;
                            if (i31 != 0) {
                                f12 = w.f12028a;
                            } else {
                                f12 = f10;
                            }
                            hVar4 = hVar3;
                            if ((i13 & 4096) != 0) {
                                i35 &= -897;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            z17 = z16;
                            if ((i13 & 8192) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i35 &= -7169;
                            } else {
                                jB = j10;
                            }
                            if ((i13 & 16384) != 0) {
                                jA = w.a(c1086gP);
                                i35 &= -57345;
                            } else {
                                jA = j11;
                            }
                            if ((i13 & 32768) != 0) {
                                i35 = (-458753) & i35;
                                long j24 = jH;
                                jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                                j19 = j24;
                            } else {
                                j19 = jH;
                                jA2 = j12;
                            }
                            if ((i13 & 65536) != 0) {
                                int i42 = (-3670017) & i35;
                                j20 = jA2;
                                f13 = f12;
                                pVar11 = pVar10;
                                j21 = j19;
                                j22 = jB;
                                j23 = jA;
                                jB2 = ColorsKt.b(jA2, c1086gP);
                                hVar2 = hVar4;
                                qVar8 = qVar7;
                                i38 = i42;
                                i37 = i14;
                                i36 = i34;
                                z18 = z17;
                            } else {
                                jB2 = j13;
                                j20 = jA2;
                                pVar11 = pVar10;
                                j21 = j19;
                                j22 = jB;
                                i36 = i34;
                                j23 = jA;
                                hVar2 = hVar4;
                                i37 = i14;
                                i38 = i35;
                                z18 = z17;
                                f13 = f12;
                                qVar8 = qVar7;
                            }
                        } else {
                            c1086gP.w();
                            if ((i13 & 2) != 0) {
                                i14 &= -113;
                            }
                            if ((i13 & 1024) != 0) {
                                i30 &= -15;
                            }
                            int i43 = i30;
                            if ((i13 & 4096) != 0) {
                                i43 &= -897;
                            }
                            if ((i13 & 8192) != 0) {
                                i43 &= -7169;
                            }
                            if ((i13 & 16384) != 0) {
                                i43 &= -57345;
                            }
                            if ((i13 & 32768) != 0) {
                                i43 &= -458753;
                            }
                            if ((i13 & 65536) != 0) {
                                i43 &= -3670017;
                            }
                            mD = m7;
                            pVar9 = pVar2;
                            pVar11 = pVar3;
                            i36 = i10;
                            qVar8 = qVar2;
                            l0Var3 = l0Var;
                            f13 = f10;
                            j21 = j;
                            j22 = j10;
                            j23 = j11;
                            j20 = j12;
                            jB2 = j13;
                            i38 = i43;
                            i37 = i14;
                            pVar8 = pVar4;
                            hVar2 = hVar;
                            qVar6 = qVar;
                            z18 = z11;
                        }
                        c1086gP.U();
                        float f14 = 0;
                        int i44 = i38 << 3;
                        c1086g = c1086gP;
                        b(new C0959t(f14, f14, f14, f14), hVar2, mD, pVar8, pVar9, qVar6, pVar11, i36, z12, qVar8, z18, l0Var3, f13, j21, j22, j23, j20, jB2, qVar3, c1086g, (i37 << 3) & 2147483632, (i44 & 896) | ((i37 >> 27) & 14) | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i44 & 7168) | (57344 & i44) | (458752 & i44) | (3670016 & i44) | (29360128 & i44) | (234881024 & i44), 0);
                        j14 = j21;
                        j15 = j22;
                        j16 = j23;
                        j17 = j20;
                        j18 = jB2;
                        M m11 = mD;
                        pVar6 = pVar11;
                        m10 = m11;
                        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar8;
                        i33 = i36;
                        pVar7 = pVar12;
                        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13 = pVar9;
                        qVar5 = qVar8;
                        pVar5 = pVar13;
                        l0 l0Var4 = l0Var3;
                        z14 = z18;
                        qVar4 = qVar6;
                        f11 = f13;
                        z15 = z12;
                        l0Var2 = l0Var4;
                    } else {
                        c1086g = c1086gP;
                        c1086g.w();
                        hVar2 = hVar;
                        m10 = m7;
                        pVar5 = pVar2;
                        qVar4 = qVar;
                        pVar6 = pVar3;
                        i33 = i10;
                        qVar5 = qVar2;
                        z14 = z11;
                        j14 = j;
                        j15 = j10;
                        j16 = j11;
                        j17 = j12;
                        j18 = j13;
                        z15 = z12;
                        pVar7 = pVar4;
                        l0Var2 = l0Var;
                        f11 = f10;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        final long j25 = j15;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.a(hVar2, m10, pVar7, pVar5, qVar4, pVar6, i33, z15, qVar5, z14, l0Var2, f11, j14, j25, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 24576;
                i19 = i13 & 32;
                if (i19 != 0) {
                    i14 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 64;
                i22 = 524288;
                if (i21 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c1086gP.h(i10)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 128;
                if (i24 != 0) {
                    i14 |= 12582912;
                    z12 = z10;
                } else {
                    z12 = z10;
                    if ((i11 & 12582912) == 0) {
                        if (c1086gP.c(z12)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                }
                i26 = i13 & 256;
                if (i26 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c1086gP.k(qVar2)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i14 |= i27;
                }
                i28 = i13 & 512;
                if (i28 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (c1086gP.c(z11)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i14 |= i29;
                }
                if ((i12 & 6) == 0) {
                    i30 = i12 | (((i13 & 1024) == 0 || !c1086gP.K(l0Var)) ? 2 : 4);
                } else {
                    i30 = i12;
                }
                i31 = i13 & 2048;
                if (i31 != 0) {
                    i30 |= 48;
                } else if ((i12 & 48) == 0) {
                    if (c1086gP.g(f10)) {
                        i32 = 32;
                    } else {
                        i32 = 16;
                    }
                    i30 |= i32;
                }
                if ((i12 & 384) != 0) {
                    i30 |= ((i13 & 4096) == 0 || !c1086gP.i(j)) ? 128 : 256;
                }
                if ((i12 & 3072) != 0) {
                    i30 |= ((i13 & 8192) == 0 || !c1086gP.i(j10)) ? 1024 : 2048;
                }
                if ((i12 & 24576) != 0) {
                    i30 |= ((i13 & 16384) == 0 || !c1086gP.i(j11)) ? 8192 : 16384;
                }
                if ((i12 & 196608) != 0) {
                    if ((i13 & 32768) == 0) {
                        i39 = 65536;
                    } else {
                        i39 = 65536;
                    }
                    i30 |= i39;
                }
                if ((i12 & 1572864) != 0) {
                    if ((i13 & 65536) == 0) {
                        i22 = 1048576;
                    }
                    i30 |= i22;
                }
                if ((i13 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    i30 |= c1086gP.k(qVar3) ? 8388608 : 4194304;
                }
                if ((i14 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i14 & 1, z13)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i40 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 2) != 0) {
                            mD = d(c1086gP);
                            i14 &= -113;
                        } else {
                            mD = m7;
                        }
                        if (i41 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i15 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i17 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i19 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i21 != 0) {
                            i34 = 2;
                        } else {
                            i34 = i10;
                        }
                        if (i24 != 0) {
                            z12 = false;
                        }
                        if (i26 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 1024) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i30 &= -15;
                        } else {
                            l0Var3 = l0Var;
                        }
                        i35 = i30;
                        if (i31 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        hVar4 = hVar3;
                        if ((i13 & 4096) != 0) {
                            i35 &= -897;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        z17 = z16;
                        if ((i13 & 8192) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i35 &= -7169;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 16384) != 0) {
                            jA = w.a(c1086gP);
                            i35 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 32768) != 0) {
                            i35 = (-458753) & i35;
                            long j26 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j26;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 65536) != 0) {
                            int i45 = (-3670017) & i35;
                            j20 = jA2;
                            f13 = f12;
                            pVar11 = pVar10;
                            j21 = j19;
                            j22 = jB;
                            j23 = jA;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                            hVar2 = hVar4;
                            qVar8 = qVar7;
                            i38 = i45;
                            i37 = i14;
                            i36 = i34;
                            z18 = z17;
                        } else {
                            jB2 = j13;
                            j20 = jA2;
                            pVar11 = pVar10;
                            j21 = j19;
                            j22 = jB;
                            i36 = i34;
                            j23 = jA;
                            hVar2 = hVar4;
                            i37 = i14;
                            i38 = i35;
                            z18 = z17;
                            f13 = f12;
                            qVar8 = qVar7;
                        }
                    } else {
                        if (i40 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 2) != 0) {
                            mD = d(c1086gP);
                            i14 &= -113;
                        } else {
                            mD = m7;
                        }
                        if (i41 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i15 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i17 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i19 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i21 != 0) {
                            i34 = 2;
                        } else {
                            i34 = i10;
                        }
                        if (i24 != 0) {
                            z12 = false;
                        }
                        if (i26 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 1024) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i30 &= -15;
                        } else {
                            l0Var3 = l0Var;
                        }
                        i35 = i30;
                        if (i31 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        hVar4 = hVar3;
                        if ((i13 & 4096) != 0) {
                            i35 &= -897;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        z17 = z16;
                        if ((i13 & 8192) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i35 &= -7169;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 16384) != 0) {
                            jA = w.a(c1086gP);
                            i35 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 32768) != 0) {
                            i35 = (-458753) & i35;
                            long j27 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j27;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 65536) != 0) {
                            int i46 = (-3670017) & i35;
                            j20 = jA2;
                            f13 = f12;
                            pVar11 = pVar10;
                            j21 = j19;
                            j22 = jB;
                            j23 = jA;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                            hVar2 = hVar4;
                            qVar8 = qVar7;
                            i38 = i46;
                            i37 = i14;
                            i36 = i34;
                            z18 = z17;
                        } else {
                            jB2 = j13;
                            j20 = jA2;
                            pVar11 = pVar10;
                            j21 = j19;
                            j22 = jB;
                            i36 = i34;
                            j23 = jA;
                            hVar2 = hVar4;
                            i37 = i14;
                            i38 = i35;
                            z18 = z17;
                            f13 = f12;
                            qVar8 = qVar7;
                        }
                    }
                    c1086gP.U();
                    float f15 = 0;
                    int i47 = i38 << 3;
                    c1086g = c1086gP;
                    b(new C0959t(f15, f15, f15, f15), hVar2, mD, pVar8, pVar9, qVar6, pVar11, i36, z12, qVar8, z18, l0Var3, f13, j21, j22, j23, j20, jB2, qVar3, c1086g, (i37 << 3) & 2147483632, (i47 & 896) | ((i37 >> 27) & 14) | (i47 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i47 & 7168) | (57344 & i47) | (458752 & i47) | (3670016 & i47) | (29360128 & i47) | (234881024 & i47), 0);
                    j14 = j21;
                    j15 = j22;
                    j16 = j23;
                    j17 = j20;
                    j18 = jB2;
                    M m12 = mD;
                    pVar6 = pVar11;
                    m10 = m12;
                    Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14 = pVar8;
                    i33 = i36;
                    pVar7 = pVar14;
                    Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15 = pVar9;
                    qVar5 = qVar8;
                    pVar5 = pVar15;
                    l0 l0Var5 = l0Var3;
                    z14 = z18;
                    qVar4 = qVar6;
                    f11 = f13;
                    z15 = z12;
                    l0Var2 = l0Var5;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    hVar2 = hVar;
                    m10 = m7;
                    pVar5 = pVar2;
                    qVar4 = qVar;
                    pVar6 = pVar3;
                    i33 = i10;
                    qVar5 = qVar2;
                    z14 = z11;
                    j14 = j;
                    j15 = j10;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                    z15 = z12;
                    pVar7 = pVar4;
                    l0Var2 = l0Var;
                    f11 = f10;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    final long j28 = j15;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.a(hVar2, m10, pVar7, pVar5, qVar4, pVar6, i33, z15, qVar5, z14, l0Var2, f11, j14, j28, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 3072;
            i17 = i13 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    if (c1086gP.k(qVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 32;
                if (i19 != 0) {
                    i14 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 64;
                i22 = 524288;
                if (i21 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c1086gP.h(i10)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 128;
                if (i24 != 0) {
                    i14 |= 12582912;
                    z12 = z10;
                } else {
                    z12 = z10;
                    if ((i11 & 12582912) == 0) {
                        if (c1086gP.c(z12)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                }
                i26 = i13 & 256;
                if (i26 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c1086gP.k(qVar2)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i14 |= i27;
                }
                i28 = i13 & 512;
                if (i28 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (c1086gP.c(z11)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i14 |= i29;
                }
                if ((i12 & 6) == 0) {
                    i30 = i12 | (((i13 & 1024) == 0 || !c1086gP.K(l0Var)) ? 2 : 4);
                } else {
                    i30 = i12;
                }
                i31 = i13 & 2048;
                if (i31 != 0) {
                    i30 |= 48;
                } else if ((i12 & 48) == 0) {
                    if (c1086gP.g(f10)) {
                        i32 = 32;
                    } else {
                        i32 = 16;
                    }
                    i30 |= i32;
                }
                if ((i12 & 384) != 0) {
                    i30 |= ((i13 & 4096) == 0 || !c1086gP.i(j)) ? 128 : 256;
                }
                if ((i12 & 3072) != 0) {
                    i30 |= ((i13 & 8192) == 0 || !c1086gP.i(j10)) ? 1024 : 2048;
                }
                if ((i12 & 24576) != 0) {
                    i30 |= ((i13 & 16384) == 0 || !c1086gP.i(j11)) ? 8192 : 16384;
                }
                if ((i12 & 196608) != 0) {
                    if ((i13 & 32768) == 0) {
                        i39 = 65536;
                    } else {
                        i39 = 65536;
                    }
                    i30 |= i39;
                }
                if ((i12 & 1572864) != 0) {
                    if ((i13 & 65536) == 0) {
                        i22 = 1048576;
                    }
                    i30 |= i22;
                }
                if ((i13 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    i30 |= c1086gP.k(qVar3) ? 8388608 : 4194304;
                }
                if ((i14 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i14 & 1, z13)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i40 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 2) != 0) {
                            mD = d(c1086gP);
                            i14 &= -113;
                        } else {
                            mD = m7;
                        }
                        if (i41 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i15 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i17 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i19 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i21 != 0) {
                            i34 = 2;
                        } else {
                            i34 = i10;
                        }
                        if (i24 != 0) {
                            z12 = false;
                        }
                        if (i26 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 1024) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i30 &= -15;
                        } else {
                            l0Var3 = l0Var;
                        }
                        i35 = i30;
                        if (i31 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        hVar4 = hVar3;
                        if ((i13 & 4096) != 0) {
                            i35 &= -897;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        z17 = z16;
                        if ((i13 & 8192) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i35 &= -7169;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 16384) != 0) {
                            jA = w.a(c1086gP);
                            i35 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 32768) != 0) {
                            i35 = (-458753) & i35;
                            long j29 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j29;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 65536) != 0) {
                            int i48 = (-3670017) & i35;
                            j20 = jA2;
                            f13 = f12;
                            pVar11 = pVar10;
                            j21 = j19;
                            j22 = jB;
                            j23 = jA;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                            hVar2 = hVar4;
                            qVar8 = qVar7;
                            i38 = i48;
                            i37 = i14;
                            i36 = i34;
                            z18 = z17;
                        } else {
                            jB2 = j13;
                            j20 = jA2;
                            pVar11 = pVar10;
                            j21 = j19;
                            j22 = jB;
                            i36 = i34;
                            j23 = jA;
                            hVar2 = hVar4;
                            i37 = i14;
                            i38 = i35;
                            z18 = z17;
                            f13 = f12;
                            qVar8 = qVar7;
                        }
                    } else {
                        if (i40 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 2) != 0) {
                            mD = d(c1086gP);
                            i14 &= -113;
                        } else {
                            mD = m7;
                        }
                        if (i41 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i15 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i17 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i19 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i21 != 0) {
                            i34 = 2;
                        } else {
                            i34 = i10;
                        }
                        if (i24 != 0) {
                            z12 = false;
                        }
                        if (i26 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 1024) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i30 &= -15;
                        } else {
                            l0Var3 = l0Var;
                        }
                        i35 = i30;
                        if (i31 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        hVar4 = hVar3;
                        if ((i13 & 4096) != 0) {
                            i35 &= -897;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        z17 = z16;
                        if ((i13 & 8192) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i35 &= -7169;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 16384) != 0) {
                            jA = w.a(c1086gP);
                            i35 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 32768) != 0) {
                            i35 = (-458753) & i35;
                            long j210 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j210;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 65536) != 0) {
                            int i49 = (-3670017) & i35;
                            j20 = jA2;
                            f13 = f12;
                            pVar11 = pVar10;
                            j21 = j19;
                            j22 = jB;
                            j23 = jA;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                            hVar2 = hVar4;
                            qVar8 = qVar7;
                            i38 = i49;
                            i37 = i14;
                            i36 = i34;
                            z18 = z17;
                        } else {
                            jB2 = j13;
                            j20 = jA2;
                            pVar11 = pVar10;
                            j21 = j19;
                            j22 = jB;
                            i36 = i34;
                            j23 = jA;
                            hVar2 = hVar4;
                            i37 = i14;
                            i38 = i35;
                            z18 = z17;
                            f13 = f12;
                            qVar8 = qVar7;
                        }
                    }
                    c1086gP.U();
                    float f16 = 0;
                    int i410 = i38 << 3;
                    c1086g = c1086gP;
                    b(new C0959t(f16, f16, f16, f16), hVar2, mD, pVar8, pVar9, qVar6, pVar11, i36, z12, qVar8, z18, l0Var3, f13, j21, j22, j23, j20, jB2, qVar3, c1086g, (i37 << 3) & 2147483632, (i410 & 896) | ((i37 >> 27) & 14) | (i410 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i410 & 7168) | (57344 & i410) | (458752 & i410) | (3670016 & i410) | (29360128 & i410) | (234881024 & i410), 0);
                    j14 = j21;
                    j15 = j22;
                    j16 = j23;
                    j17 = j20;
                    j18 = jB2;
                    M m13 = mD;
                    pVar6 = pVar11;
                    m10 = m13;
                    Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16 = pVar8;
                    i33 = i36;
                    pVar7 = pVar16;
                    Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17 = pVar9;
                    qVar5 = qVar8;
                    pVar5 = pVar17;
                    l0 l0Var6 = l0Var3;
                    z14 = z18;
                    qVar4 = qVar6;
                    f11 = f13;
                    z15 = z12;
                    l0Var2 = l0Var6;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    hVar2 = hVar;
                    m10 = m7;
                    pVar5 = pVar2;
                    qVar4 = qVar;
                    pVar6 = pVar3;
                    i33 = i10;
                    qVar5 = qVar2;
                    z14 = z11;
                    j14 = j;
                    j15 = j10;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                    z15 = z12;
                    pVar7 = pVar4;
                    l0Var2 = l0Var;
                    f11 = f10;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    final long j211 = j15;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.a(hVar2, m10, pVar7, pVar5, qVar4, pVar6, i33, z15, qVar5, z14, l0Var2, f11, j14, j211, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 24576;
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (c1086gP.k(pVar3)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i14 |= i20;
            }
            i21 = i13 & 64;
            i22 = 524288;
            if (i21 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c1086gP.h(i10)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i14 |= i23;
            }
            i24 = i13 & 128;
            if (i24 != 0) {
                i14 |= 12582912;
                z12 = z10;
            } else {
                z12 = z10;
                if ((i11 & 12582912) == 0) {
                    if (c1086gP.c(z12)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
            }
            i26 = i13 & 256;
            if (i26 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c1086gP.k(qVar2)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i14 |= i27;
            }
            i28 = i13 & 512;
            if (i28 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (c1086gP.c(z11)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i14 |= i29;
            }
            if ((i12 & 6) == 0) {
                i30 = i12 | (((i13 & 1024) == 0 || !c1086gP.K(l0Var)) ? 2 : 4);
            } else {
                i30 = i12;
            }
            i31 = i13 & 2048;
            if (i31 != 0) {
                i30 |= 48;
            } else if ((i12 & 48) == 0) {
                if (c1086gP.g(f10)) {
                    i32 = 32;
                } else {
                    i32 = 16;
                }
                i30 |= i32;
            }
            if ((i12 & 384) != 0) {
                i30 |= ((i13 & 4096) == 0 || !c1086gP.i(j)) ? 128 : 256;
            }
            if ((i12 & 3072) != 0) {
                i30 |= ((i13 & 8192) == 0 || !c1086gP.i(j10)) ? 1024 : 2048;
            }
            if ((i12 & 24576) != 0) {
                i30 |= ((i13 & 16384) == 0 || !c1086gP.i(j11)) ? 8192 : 16384;
            }
            if ((i12 & 196608) != 0) {
                if ((i13 & 32768) == 0) {
                    i39 = 65536;
                } else {
                    i39 = 65536;
                }
                i30 |= i39;
            }
            if ((i12 & 1572864) != 0) {
                if ((i13 & 65536) == 0) {
                    i22 = 1048576;
                }
                i30 |= i22;
            }
            if ((i13 & 131072) != 0) {
                i30 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                i30 |= c1086gP.k(qVar3) ? 8388608 : 4194304;
            }
            if ((i14 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c1086gP.C(i14 & 1, z13)) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i40 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i13 & 2) != 0) {
                        mD = d(c1086gP);
                        i14 &= -113;
                    } else {
                        mD = m7;
                    }
                    if (i41 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i15 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i17 != 0) {
                        qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                    } else {
                        qVar6 = qVar;
                    }
                    if (i19 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i21 != 0) {
                        i34 = 2;
                    } else {
                        i34 = i10;
                    }
                    if (i24 != 0) {
                        z12 = false;
                    }
                    if (i26 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar2;
                    }
                    if (i28 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if ((i13 & 1024) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        i30 &= -15;
                    } else {
                        l0Var3 = l0Var;
                    }
                    i35 = i30;
                    if (i31 != 0) {
                        f12 = w.f12028a;
                    } else {
                        f12 = f10;
                    }
                    hVar4 = hVar3;
                    if ((i13 & 4096) != 0) {
                        i35 &= -897;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    z17 = z16;
                    if ((i13 & 8192) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i35 &= -7169;
                    } else {
                        jB = j10;
                    }
                    if ((i13 & 16384) != 0) {
                        jA = w.a(c1086gP);
                        i35 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if ((i13 & 32768) != 0) {
                        i35 = (-458753) & i35;
                        long j212 = jH;
                        jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                        j19 = j212;
                    } else {
                        j19 = jH;
                        jA2 = j12;
                    }
                    if ((i13 & 65536) != 0) {
                        int i411 = (-3670017) & i35;
                        j20 = jA2;
                        f13 = f12;
                        pVar11 = pVar10;
                        j21 = j19;
                        j22 = jB;
                        j23 = jA;
                        jB2 = ColorsKt.b(jA2, c1086gP);
                        hVar2 = hVar4;
                        qVar8 = qVar7;
                        i38 = i411;
                        i37 = i14;
                        i36 = i34;
                        z18 = z17;
                    } else {
                        jB2 = j13;
                        j20 = jA2;
                        pVar11 = pVar10;
                        j21 = j19;
                        j22 = jB;
                        i36 = i34;
                        j23 = jA;
                        hVar2 = hVar4;
                        i37 = i14;
                        i38 = i35;
                        z18 = z17;
                        f13 = f12;
                        qVar8 = qVar7;
                    }
                } else {
                    if (i40 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i13 & 2) != 0) {
                        mD = d(c1086gP);
                        i14 &= -113;
                    } else {
                        mD = m7;
                    }
                    if (i41 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i15 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i17 != 0) {
                        qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                    } else {
                        qVar6 = qVar;
                    }
                    if (i19 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i21 != 0) {
                        i34 = 2;
                    } else {
                        i34 = i10;
                    }
                    if (i24 != 0) {
                        z12 = false;
                    }
                    if (i26 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar2;
                    }
                    if (i28 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if ((i13 & 1024) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        i30 &= -15;
                    } else {
                        l0Var3 = l0Var;
                    }
                    i35 = i30;
                    if (i31 != 0) {
                        f12 = w.f12028a;
                    } else {
                        f12 = f10;
                    }
                    hVar4 = hVar3;
                    if ((i13 & 4096) != 0) {
                        i35 &= -897;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    z17 = z16;
                    if ((i13 & 8192) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i35 &= -7169;
                    } else {
                        jB = j10;
                    }
                    if ((i13 & 16384) != 0) {
                        jA = w.a(c1086gP);
                        i35 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if ((i13 & 32768) != 0) {
                        i35 = (-458753) & i35;
                        long j213 = jH;
                        jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                        j19 = j213;
                    } else {
                        j19 = jH;
                        jA2 = j12;
                    }
                    if ((i13 & 65536) != 0) {
                        int i412 = (-3670017) & i35;
                        j20 = jA2;
                        f13 = f12;
                        pVar11 = pVar10;
                        j21 = j19;
                        j22 = jB;
                        j23 = jA;
                        jB2 = ColorsKt.b(jA2, c1086gP);
                        hVar2 = hVar4;
                        qVar8 = qVar7;
                        i38 = i412;
                        i37 = i14;
                        i36 = i34;
                        z18 = z17;
                    } else {
                        jB2 = j13;
                        j20 = jA2;
                        pVar11 = pVar10;
                        j21 = j19;
                        j22 = jB;
                        i36 = i34;
                        j23 = jA;
                        hVar2 = hVar4;
                        i37 = i14;
                        i38 = i35;
                        z18 = z17;
                        f13 = f12;
                        qVar8 = qVar7;
                    }
                }
                c1086gP.U();
                float f17 = 0;
                int i413 = i38 << 3;
                c1086g = c1086gP;
                b(new C0959t(f17, f17, f17, f17), hVar2, mD, pVar8, pVar9, qVar6, pVar11, i36, z12, qVar8, z18, l0Var3, f13, j21, j22, j23, j20, jB2, qVar3, c1086g, (i37 << 3) & 2147483632, (i413 & 896) | ((i37 >> 27) & 14) | (i413 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i413 & 7168) | (57344 & i413) | (458752 & i413) | (3670016 & i413) | (29360128 & i413) | (234881024 & i413), 0);
                j14 = j21;
                j15 = j22;
                j16 = j23;
                j17 = j20;
                j18 = jB2;
                M m14 = mD;
                pVar6 = pVar11;
                m10 = m14;
                Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18 = pVar8;
                i33 = i36;
                pVar7 = pVar18;
                Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19 = pVar9;
                qVar5 = qVar8;
                pVar5 = pVar19;
                l0 l0Var7 = l0Var3;
                z14 = z18;
                qVar4 = qVar6;
                f11 = f13;
                z15 = z12;
                l0Var2 = l0Var7;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                hVar2 = hVar;
                m10 = m7;
                pVar5 = pVar2;
                qVar4 = qVar;
                pVar6 = pVar3;
                i33 = i10;
                qVar5 = qVar2;
                z14 = z11;
                j14 = j;
                j15 = j10;
                j16 = j11;
                j17 = j12;
                j18 = j13;
                z15 = z12;
                pVar7 = pVar4;
                l0Var2 = l0Var;
                f11 = f10;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                final long j214 = j15;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ScaffoldKt.a(hVar2, m10, pVar7, pVar5, qVar4, pVar6, i33, z15, qVar5, z14, l0Var2, f11, j14, j214, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 384;
        pVar4 = pVar;
        i15 = i13 & 8;
        if (i15 != 0) {
            if ((i11 & 3072) == 0) {
                if (c1086gP.k(pVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i14 |= i16;
            }
            i17 = i13 & 16;
            if (i17 != 0) {
                if ((i11 & 24576) == 0) {
                    if (c1086gP.k(qVar)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 32;
                if (i19 != 0) {
                    i14 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 64;
                i22 = 524288;
                if (i21 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c1086gP.h(i10)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 128;
                if (i24 != 0) {
                    i14 |= 12582912;
                    z12 = z10;
                } else {
                    z12 = z10;
                    if ((i11 & 12582912) == 0) {
                        if (c1086gP.c(z12)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                }
                i26 = i13 & 256;
                if (i26 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c1086gP.k(qVar2)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i14 |= i27;
                }
                i28 = i13 & 512;
                if (i28 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (c1086gP.c(z11)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i14 |= i29;
                }
                if ((i12 & 6) == 0) {
                    i30 = i12 | (((i13 & 1024) == 0 || !c1086gP.K(l0Var)) ? 2 : 4);
                } else {
                    i30 = i12;
                }
                i31 = i13 & 2048;
                if (i31 != 0) {
                    i30 |= 48;
                } else if ((i12 & 48) == 0) {
                    if (c1086gP.g(f10)) {
                        i32 = 32;
                    } else {
                        i32 = 16;
                    }
                    i30 |= i32;
                }
                if ((i12 & 384) != 0) {
                    i30 |= ((i13 & 4096) == 0 || !c1086gP.i(j)) ? 128 : 256;
                }
                if ((i12 & 3072) != 0) {
                    i30 |= ((i13 & 8192) == 0 || !c1086gP.i(j10)) ? 1024 : 2048;
                }
                if ((i12 & 24576) != 0) {
                    i30 |= ((i13 & 16384) == 0 || !c1086gP.i(j11)) ? 8192 : 16384;
                }
                if ((i12 & 196608) != 0) {
                    if ((i13 & 32768) == 0) {
                        i39 = 65536;
                    } else {
                        i39 = 65536;
                    }
                    i30 |= i39;
                }
                if ((i12 & 1572864) != 0) {
                    if ((i13 & 65536) == 0) {
                        i22 = 1048576;
                    }
                    i30 |= i22;
                }
                if ((i13 & 131072) != 0) {
                    i30 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    i30 |= c1086gP.k(qVar3) ? 8388608 : 4194304;
                }
                if ((i14 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i14 & 1, z13)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i40 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 2) != 0) {
                            mD = d(c1086gP);
                            i14 &= -113;
                        } else {
                            mD = m7;
                        }
                        if (i41 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i15 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i17 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i19 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i21 != 0) {
                            i34 = 2;
                        } else {
                            i34 = i10;
                        }
                        if (i24 != 0) {
                            z12 = false;
                        }
                        if (i26 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 1024) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i30 &= -15;
                        } else {
                            l0Var3 = l0Var;
                        }
                        i35 = i30;
                        if (i31 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        hVar4 = hVar3;
                        if ((i13 & 4096) != 0) {
                            i35 &= -897;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        z17 = z16;
                        if ((i13 & 8192) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i35 &= -7169;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 16384) != 0) {
                            jA = w.a(c1086gP);
                            i35 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 32768) != 0) {
                            i35 = (-458753) & i35;
                            long j215 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j215;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 65536) != 0) {
                            int i414 = (-3670017) & i35;
                            j20 = jA2;
                            f13 = f12;
                            pVar11 = pVar10;
                            j21 = j19;
                            j22 = jB;
                            j23 = jA;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                            hVar2 = hVar4;
                            qVar8 = qVar7;
                            i38 = i414;
                            i37 = i14;
                            i36 = i34;
                            z18 = z17;
                        } else {
                            jB2 = j13;
                            j20 = jA2;
                            pVar11 = pVar10;
                            j21 = j19;
                            j22 = jB;
                            i36 = i34;
                            j23 = jA;
                            hVar2 = hVar4;
                            i37 = i14;
                            i38 = i35;
                            z18 = z17;
                            f13 = f12;
                            qVar8 = qVar7;
                        }
                    } else {
                        if (i40 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 2) != 0) {
                            mD = d(c1086gP);
                            i14 &= -113;
                        } else {
                            mD = m7;
                        }
                        if (i41 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                        } else {
                            pVar8 = pVar4;
                        }
                        if (i15 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i17 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i19 != 0) {
                            pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i21 != 0) {
                            i34 = 2;
                        } else {
                            i34 = i10;
                        }
                        if (i24 != 0) {
                            z12 = false;
                        }
                        if (i26 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i28 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 1024) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i30 &= -15;
                        } else {
                            l0Var3 = l0Var;
                        }
                        i35 = i30;
                        if (i31 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        hVar4 = hVar3;
                        if ((i13 & 4096) != 0) {
                            i35 &= -897;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        z17 = z16;
                        if ((i13 & 8192) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i35 &= -7169;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 16384) != 0) {
                            jA = w.a(c1086gP);
                            i35 &= -57345;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 32768) != 0) {
                            i35 = (-458753) & i35;
                            long j216 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j216;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 65536) != 0) {
                            int i415 = (-3670017) & i35;
                            j20 = jA2;
                            f13 = f12;
                            pVar11 = pVar10;
                            j21 = j19;
                            j22 = jB;
                            j23 = jA;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                            hVar2 = hVar4;
                            qVar8 = qVar7;
                            i38 = i415;
                            i37 = i14;
                            i36 = i34;
                            z18 = z17;
                        } else {
                            jB2 = j13;
                            j20 = jA2;
                            pVar11 = pVar10;
                            j21 = j19;
                            j22 = jB;
                            i36 = i34;
                            j23 = jA;
                            hVar2 = hVar4;
                            i37 = i14;
                            i38 = i35;
                            z18 = z17;
                            f13 = f12;
                            qVar8 = qVar7;
                        }
                    }
                    c1086gP.U();
                    float f18 = 0;
                    int i416 = i38 << 3;
                    c1086g = c1086gP;
                    b(new C0959t(f18, f18, f18, f18), hVar2, mD, pVar8, pVar9, qVar6, pVar11, i36, z12, qVar8, z18, l0Var3, f13, j21, j22, j23, j20, jB2, qVar3, c1086g, (i37 << 3) & 2147483632, (i416 & 896) | ((i37 >> 27) & 14) | (i416 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i416 & 7168) | (57344 & i416) | (458752 & i416) | (3670016 & i416) | (29360128 & i416) | (234881024 & i416), 0);
                    j14 = j21;
                    j15 = j22;
                    j16 = j23;
                    j17 = j20;
                    j18 = jB2;
                    M m15 = mD;
                    pVar6 = pVar11;
                    m10 = m15;
                    Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar110 = pVar8;
                    i33 = i36;
                    pVar7 = pVar110;
                    Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111 = pVar9;
                    qVar5 = qVar8;
                    pVar5 = pVar111;
                    l0 l0Var8 = l0Var3;
                    z14 = z18;
                    qVar4 = qVar6;
                    f11 = f13;
                    z15 = z12;
                    l0Var2 = l0Var8;
                } else {
                    c1086g = c1086gP;
                    c1086g.w();
                    hVar2 = hVar;
                    m10 = m7;
                    pVar5 = pVar2;
                    qVar4 = qVar;
                    pVar6 = pVar3;
                    i33 = i10;
                    qVar5 = qVar2;
                    z14 = z11;
                    j14 = j;
                    j15 = j10;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                    z15 = z12;
                    pVar7 = pVar4;
                    l0Var2 = l0Var;
                    f11 = f10;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    final long j217 = j15;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.a(hVar2, m10, pVar7, pVar5, qVar4, pVar6, i33, z15, qVar5, z14, l0Var2, f11, j14, j217, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 24576;
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (c1086gP.k(pVar3)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i14 |= i20;
            }
            i21 = i13 & 64;
            i22 = 524288;
            if (i21 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c1086gP.h(i10)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i14 |= i23;
            }
            i24 = i13 & 128;
            if (i24 != 0) {
                i14 |= 12582912;
                z12 = z10;
            } else {
                z12 = z10;
                if ((i11 & 12582912) == 0) {
                    if (c1086gP.c(z12)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
            }
            i26 = i13 & 256;
            if (i26 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c1086gP.k(qVar2)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i14 |= i27;
            }
            i28 = i13 & 512;
            if (i28 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (c1086gP.c(z11)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i14 |= i29;
            }
            if ((i12 & 6) == 0) {
                i30 = i12 | (((i13 & 1024) == 0 || !c1086gP.K(l0Var)) ? 2 : 4);
            } else {
                i30 = i12;
            }
            i31 = i13 & 2048;
            if (i31 != 0) {
                i30 |= 48;
            } else if ((i12 & 48) == 0) {
                if (c1086gP.g(f10)) {
                    i32 = 32;
                } else {
                    i32 = 16;
                }
                i30 |= i32;
            }
            if ((i12 & 384) != 0) {
                i30 |= ((i13 & 4096) == 0 || !c1086gP.i(j)) ? 128 : 256;
            }
            if ((i12 & 3072) != 0) {
                i30 |= ((i13 & 8192) == 0 || !c1086gP.i(j10)) ? 1024 : 2048;
            }
            if ((i12 & 24576) != 0) {
                i30 |= ((i13 & 16384) == 0 || !c1086gP.i(j11)) ? 8192 : 16384;
            }
            if ((i12 & 196608) != 0) {
                if ((i13 & 32768) == 0) {
                    i39 = 65536;
                } else {
                    i39 = 65536;
                }
                i30 |= i39;
            }
            if ((i12 & 1572864) != 0) {
                if ((i13 & 65536) == 0) {
                    i22 = 1048576;
                }
                i30 |= i22;
            }
            if ((i13 & 131072) != 0) {
                i30 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                i30 |= c1086gP.k(qVar3) ? 8388608 : 4194304;
            }
            if ((i14 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c1086gP.C(i14 & 1, z13)) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i40 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i13 & 2) != 0) {
                        mD = d(c1086gP);
                        i14 &= -113;
                    } else {
                        mD = m7;
                    }
                    if (i41 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i15 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i17 != 0) {
                        qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                    } else {
                        qVar6 = qVar;
                    }
                    if (i19 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i21 != 0) {
                        i34 = 2;
                    } else {
                        i34 = i10;
                    }
                    if (i24 != 0) {
                        z12 = false;
                    }
                    if (i26 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar2;
                    }
                    if (i28 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if ((i13 & 1024) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        i30 &= -15;
                    } else {
                        l0Var3 = l0Var;
                    }
                    i35 = i30;
                    if (i31 != 0) {
                        f12 = w.f12028a;
                    } else {
                        f12 = f10;
                    }
                    hVar4 = hVar3;
                    if ((i13 & 4096) != 0) {
                        i35 &= -897;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    z17 = z16;
                    if ((i13 & 8192) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i35 &= -7169;
                    } else {
                        jB = j10;
                    }
                    if ((i13 & 16384) != 0) {
                        jA = w.a(c1086gP);
                        i35 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if ((i13 & 32768) != 0) {
                        i35 = (-458753) & i35;
                        long j218 = jH;
                        jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                        j19 = j218;
                    } else {
                        j19 = jH;
                        jA2 = j12;
                    }
                    if ((i13 & 65536) != 0) {
                        int i417 = (-3670017) & i35;
                        j20 = jA2;
                        f13 = f12;
                        pVar11 = pVar10;
                        j21 = j19;
                        j22 = jB;
                        j23 = jA;
                        jB2 = ColorsKt.b(jA2, c1086gP);
                        hVar2 = hVar4;
                        qVar8 = qVar7;
                        i38 = i417;
                        i37 = i14;
                        i36 = i34;
                        z18 = z17;
                    } else {
                        jB2 = j13;
                        j20 = jA2;
                        pVar11 = pVar10;
                        j21 = j19;
                        j22 = jB;
                        i36 = i34;
                        j23 = jA;
                        hVar2 = hVar4;
                        i37 = i14;
                        i38 = i35;
                        z18 = z17;
                        f13 = f12;
                        qVar8 = qVar7;
                    }
                } else {
                    if (i40 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i13 & 2) != 0) {
                        mD = d(c1086gP);
                        i14 &= -113;
                    } else {
                        mD = m7;
                    }
                    if (i41 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i15 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i17 != 0) {
                        qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                    } else {
                        qVar6 = qVar;
                    }
                    if (i19 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i21 != 0) {
                        i34 = 2;
                    } else {
                        i34 = i10;
                    }
                    if (i24 != 0) {
                        z12 = false;
                    }
                    if (i26 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar2;
                    }
                    if (i28 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if ((i13 & 1024) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        i30 &= -15;
                    } else {
                        l0Var3 = l0Var;
                    }
                    i35 = i30;
                    if (i31 != 0) {
                        f12 = w.f12028a;
                    } else {
                        f12 = f10;
                    }
                    hVar4 = hVar3;
                    if ((i13 & 4096) != 0) {
                        i35 &= -897;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    z17 = z16;
                    if ((i13 & 8192) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i35 &= -7169;
                    } else {
                        jB = j10;
                    }
                    if ((i13 & 16384) != 0) {
                        jA = w.a(c1086gP);
                        i35 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if ((i13 & 32768) != 0) {
                        i35 = (-458753) & i35;
                        long j219 = jH;
                        jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                        j19 = j219;
                    } else {
                        j19 = jH;
                        jA2 = j12;
                    }
                    if ((i13 & 65536) != 0) {
                        int i418 = (-3670017) & i35;
                        j20 = jA2;
                        f13 = f12;
                        pVar11 = pVar10;
                        j21 = j19;
                        j22 = jB;
                        j23 = jA;
                        jB2 = ColorsKt.b(jA2, c1086gP);
                        hVar2 = hVar4;
                        qVar8 = qVar7;
                        i38 = i418;
                        i37 = i14;
                        i36 = i34;
                        z18 = z17;
                    } else {
                        jB2 = j13;
                        j20 = jA2;
                        pVar11 = pVar10;
                        j21 = j19;
                        j22 = jB;
                        i36 = i34;
                        j23 = jA;
                        hVar2 = hVar4;
                        i37 = i14;
                        i38 = i35;
                        z18 = z17;
                        f13 = f12;
                        qVar8 = qVar7;
                    }
                }
                c1086gP.U();
                float f19 = 0;
                int i419 = i38 << 3;
                c1086g = c1086gP;
                b(new C0959t(f19, f19, f19, f19), hVar2, mD, pVar8, pVar9, qVar6, pVar11, i36, z12, qVar8, z18, l0Var3, f13, j21, j22, j23, j20, jB2, qVar3, c1086g, (i37 << 3) & 2147483632, (i419 & 896) | ((i37 >> 27) & 14) | (i419 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i419 & 7168) | (57344 & i419) | (458752 & i419) | (3670016 & i419) | (29360128 & i419) | (234881024 & i419), 0);
                j14 = j21;
                j15 = j22;
                j16 = j23;
                j17 = j20;
                j18 = jB2;
                M m16 = mD;
                pVar6 = pVar11;
                m10 = m16;
                Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar112 = pVar8;
                i33 = i36;
                pVar7 = pVar112;
                Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar113 = pVar9;
                qVar5 = qVar8;
                pVar5 = pVar113;
                l0 l0Var9 = l0Var3;
                z14 = z18;
                qVar4 = qVar6;
                f11 = f13;
                z15 = z12;
                l0Var2 = l0Var9;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                hVar2 = hVar;
                m10 = m7;
                pVar5 = pVar2;
                qVar4 = qVar;
                pVar6 = pVar3;
                i33 = i10;
                qVar5 = qVar2;
                z14 = z11;
                j14 = j;
                j15 = j10;
                j16 = j11;
                j17 = j12;
                j18 = j13;
                z15 = z12;
                pVar7 = pVar4;
                l0Var2 = l0Var;
                f11 = f10;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                final long j2110 = j15;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ScaffoldKt.a(hVar2, m10, pVar7, pVar5, qVar4, pVar6, i33, z15, qVar5, z14, l0Var2, f11, j14, j2110, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 3072;
        i17 = i13 & 16;
        if (i17 != 0) {
            if ((i11 & 24576) == 0) {
                if (c1086gP.k(qVar)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i14 |= i18;
            }
            i19 = i13 & 32;
            if (i19 != 0) {
                i14 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (c1086gP.k(pVar3)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i14 |= i20;
            }
            i21 = i13 & 64;
            i22 = 524288;
            if (i21 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c1086gP.h(i10)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i14 |= i23;
            }
            i24 = i13 & 128;
            if (i24 != 0) {
                i14 |= 12582912;
                z12 = z10;
            } else {
                z12 = z10;
                if ((i11 & 12582912) == 0) {
                    if (c1086gP.c(z12)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
            }
            i26 = i13 & 256;
            if (i26 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c1086gP.k(qVar2)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i14 |= i27;
            }
            i28 = i13 & 512;
            if (i28 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (c1086gP.c(z11)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i14 |= i29;
            }
            if ((i12 & 6) == 0) {
                i30 = i12 | (((i13 & 1024) == 0 || !c1086gP.K(l0Var)) ? 2 : 4);
            } else {
                i30 = i12;
            }
            i31 = i13 & 2048;
            if (i31 != 0) {
                i30 |= 48;
            } else if ((i12 & 48) == 0) {
                if (c1086gP.g(f10)) {
                    i32 = 32;
                } else {
                    i32 = 16;
                }
                i30 |= i32;
            }
            if ((i12 & 384) != 0) {
                i30 |= ((i13 & 4096) == 0 || !c1086gP.i(j)) ? 128 : 256;
            }
            if ((i12 & 3072) != 0) {
                i30 |= ((i13 & 8192) == 0 || !c1086gP.i(j10)) ? 1024 : 2048;
            }
            if ((i12 & 24576) != 0) {
                i30 |= ((i13 & 16384) == 0 || !c1086gP.i(j11)) ? 8192 : 16384;
            }
            if ((i12 & 196608) != 0) {
                if ((i13 & 32768) == 0) {
                    i39 = 65536;
                } else {
                    i39 = 65536;
                }
                i30 |= i39;
            }
            if ((i12 & 1572864) != 0) {
                if ((i13 & 65536) == 0) {
                    i22 = 1048576;
                }
                i30 |= i22;
            }
            if ((i13 & 131072) != 0) {
                i30 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                i30 |= c1086gP.k(qVar3) ? 8388608 : 4194304;
            }
            if ((i14 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c1086gP.C(i14 & 1, z13)) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i40 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i13 & 2) != 0) {
                        mD = d(c1086gP);
                        i14 &= -113;
                    } else {
                        mD = m7;
                    }
                    if (i41 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i15 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i17 != 0) {
                        qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                    } else {
                        qVar6 = qVar;
                    }
                    if (i19 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i21 != 0) {
                        i34 = 2;
                    } else {
                        i34 = i10;
                    }
                    if (i24 != 0) {
                        z12 = false;
                    }
                    if (i26 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar2;
                    }
                    if (i28 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if ((i13 & 1024) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        i30 &= -15;
                    } else {
                        l0Var3 = l0Var;
                    }
                    i35 = i30;
                    if (i31 != 0) {
                        f12 = w.f12028a;
                    } else {
                        f12 = f10;
                    }
                    hVar4 = hVar3;
                    if ((i13 & 4096) != 0) {
                        i35 &= -897;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    z17 = z16;
                    if ((i13 & 8192) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i35 &= -7169;
                    } else {
                        jB = j10;
                    }
                    if ((i13 & 16384) != 0) {
                        jA = w.a(c1086gP);
                        i35 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if ((i13 & 32768) != 0) {
                        i35 = (-458753) & i35;
                        long j2111 = jH;
                        jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                        j19 = j2111;
                    } else {
                        j19 = jH;
                        jA2 = j12;
                    }
                    if ((i13 & 65536) != 0) {
                        int i4110 = (-3670017) & i35;
                        j20 = jA2;
                        f13 = f12;
                        pVar11 = pVar10;
                        j21 = j19;
                        j22 = jB;
                        j23 = jA;
                        jB2 = ColorsKt.b(jA2, c1086gP);
                        hVar2 = hVar4;
                        qVar8 = qVar7;
                        i38 = i4110;
                        i37 = i14;
                        i36 = i34;
                        z18 = z17;
                    } else {
                        jB2 = j13;
                        j20 = jA2;
                        pVar11 = pVar10;
                        j21 = j19;
                        j22 = jB;
                        i36 = i34;
                        j23 = jA;
                        hVar2 = hVar4;
                        i37 = i14;
                        i38 = i35;
                        z18 = z17;
                        f13 = f12;
                        qVar8 = qVar7;
                    }
                } else {
                    if (i40 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i13 & 2) != 0) {
                        mD = d(c1086gP);
                        i14 &= -113;
                    } else {
                        mD = m7;
                    }
                    if (i41 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                    } else {
                        pVar8 = pVar4;
                    }
                    if (i15 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i17 != 0) {
                        qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                    } else {
                        qVar6 = qVar;
                    }
                    if (i19 != 0) {
                        pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i21 != 0) {
                        i34 = 2;
                    } else {
                        i34 = i10;
                    }
                    if (i24 != 0) {
                        z12 = false;
                    }
                    if (i26 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar2;
                    }
                    if (i28 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if ((i13 & 1024) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        i30 &= -15;
                    } else {
                        l0Var3 = l0Var;
                    }
                    i35 = i30;
                    if (i31 != 0) {
                        f12 = w.f12028a;
                    } else {
                        f12 = f10;
                    }
                    hVar4 = hVar3;
                    if ((i13 & 4096) != 0) {
                        i35 &= -897;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    z17 = z16;
                    if ((i13 & 8192) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i35 &= -7169;
                    } else {
                        jB = j10;
                    }
                    if ((i13 & 16384) != 0) {
                        jA = w.a(c1086gP);
                        i35 &= -57345;
                    } else {
                        jA = j11;
                    }
                    if ((i13 & 32768) != 0) {
                        i35 = (-458753) & i35;
                        long j2112 = jH;
                        jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                        j19 = j2112;
                    } else {
                        j19 = jH;
                        jA2 = j12;
                    }
                    if ((i13 & 65536) != 0) {
                        int i4111 = (-3670017) & i35;
                        j20 = jA2;
                        f13 = f12;
                        pVar11 = pVar10;
                        j21 = j19;
                        j22 = jB;
                        j23 = jA;
                        jB2 = ColorsKt.b(jA2, c1086gP);
                        hVar2 = hVar4;
                        qVar8 = qVar7;
                        i38 = i4111;
                        i37 = i14;
                        i36 = i34;
                        z18 = z17;
                    } else {
                        jB2 = j13;
                        j20 = jA2;
                        pVar11 = pVar10;
                        j21 = j19;
                        j22 = jB;
                        i36 = i34;
                        j23 = jA;
                        hVar2 = hVar4;
                        i37 = i14;
                        i38 = i35;
                        z18 = z17;
                        f13 = f12;
                        qVar8 = qVar7;
                    }
                }
                c1086gP.U();
                float f110 = 0;
                int i4112 = i38 << 3;
                c1086g = c1086gP;
                b(new C0959t(f110, f110, f110, f110), hVar2, mD, pVar8, pVar9, qVar6, pVar11, i36, z12, qVar8, z18, l0Var3, f13, j21, j22, j23, j20, jB2, qVar3, c1086g, (i37 << 3) & 2147483632, (i4112 & 896) | ((i37 >> 27) & 14) | (i4112 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4112 & 7168) | (57344 & i4112) | (458752 & i4112) | (3670016 & i4112) | (29360128 & i4112) | (234881024 & i4112), 0);
                j14 = j21;
                j15 = j22;
                j16 = j23;
                j17 = j20;
                j18 = jB2;
                M m17 = mD;
                pVar6 = pVar11;
                m10 = m17;
                Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar114 = pVar8;
                i33 = i36;
                pVar7 = pVar114;
                Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar115 = pVar9;
                qVar5 = qVar8;
                pVar5 = pVar115;
                l0 l0Var10 = l0Var3;
                z14 = z18;
                qVar4 = qVar6;
                f11 = f13;
                z15 = z12;
                l0Var2 = l0Var10;
            } else {
                c1086g = c1086gP;
                c1086g.w();
                hVar2 = hVar;
                m10 = m7;
                pVar5 = pVar2;
                qVar4 = qVar;
                pVar6 = pVar3;
                i33 = i10;
                qVar5 = qVar2;
                z14 = z11;
                j14 = j;
                j15 = j10;
                j16 = j11;
                j17 = j12;
                j18 = j13;
                z15 = z12;
                pVar7 = pVar4;
                l0Var2 = l0Var;
                f11 = f10;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                final long j2113 = j15;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ScaffoldKt.a(hVar2, m10, pVar7, pVar5, qVar4, pVar6, i33, z15, qVar5, z14, l0Var2, f11, j14, j2113, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 24576;
        i19 = i13 & 32;
        if (i19 != 0) {
            i14 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (c1086gP.k(pVar3)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i14 |= i20;
        }
        i21 = i13 & 64;
        i22 = 524288;
        if (i21 != 0) {
            i14 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (c1086gP.h(i10)) {
                i23 = 1048576;
            } else {
                i23 = 524288;
            }
            i14 |= i23;
        }
        i24 = i13 & 128;
        if (i24 != 0) {
            i14 |= 12582912;
            z12 = z10;
        } else {
            z12 = z10;
            if ((i11 & 12582912) == 0) {
                if (c1086gP.c(z12)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
        }
        i26 = i13 & 256;
        if (i26 != 0) {
            i14 |= 100663296;
        } else if ((i11 & 100663296) == 0) {
            if (c1086gP.k(qVar2)) {
                i27 = 67108864;
            } else {
                i27 = 33554432;
            }
            i14 |= i27;
        }
        i28 = i13 & 512;
        if (i28 != 0) {
            i14 |= 805306368;
        } else if ((i11 & 805306368) == 0) {
            if (c1086gP.c(z11)) {
                i29 = 536870912;
            } else {
                i29 = 268435456;
            }
            i14 |= i29;
        }
        if ((i12 & 6) == 0) {
            i30 = i12 | (((i13 & 1024) == 0 || !c1086gP.K(l0Var)) ? 2 : 4);
        } else {
            i30 = i12;
        }
        i31 = i13 & 2048;
        if (i31 != 0) {
            i30 |= 48;
        } else if ((i12 & 48) == 0) {
            if (c1086gP.g(f10)) {
                i32 = 32;
            } else {
                i32 = 16;
            }
            i30 |= i32;
        }
        if ((i12 & 384) != 0) {
            i30 |= ((i13 & 4096) == 0 || !c1086gP.i(j)) ? 128 : 256;
        }
        if ((i12 & 3072) != 0) {
            i30 |= ((i13 & 8192) == 0 || !c1086gP.i(j10)) ? 1024 : 2048;
        }
        if ((i12 & 24576) != 0) {
            i30 |= ((i13 & 16384) == 0 || !c1086gP.i(j11)) ? 8192 : 16384;
        }
        if ((i12 & 196608) != 0) {
            if ((i13 & 32768) == 0) {
                i39 = 65536;
            } else {
                i39 = 65536;
            }
            i30 |= i39;
        }
        if ((i12 & 1572864) != 0) {
            if ((i13 & 65536) == 0) {
                i22 = 1048576;
            }
            i30 |= i22;
        }
        if ((i13 & 131072) != 0) {
            i30 |= 12582912;
        } else if ((i12 & 12582912) == 0) {
            i30 |= c1086gP.k(qVar3) ? 8388608 : 4194304;
        }
        if ((i14 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c1086gP.C(i14 & 1, z13)) {
            c1086gP.r0();
            if ((i11 & 1) != 0) {
                if (i40 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if ((i13 & 2) != 0) {
                    mD = d(c1086gP);
                    i14 &= -113;
                } else {
                    mD = m7;
                }
                if (i41 != 0) {
                    pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                } else {
                    pVar8 = pVar4;
                }
                if (i15 != 0) {
                    pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                } else {
                    pVar9 = pVar2;
                }
                if (i17 != 0) {
                    qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                } else {
                    qVar6 = qVar;
                }
                if (i19 != 0) {
                    pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                } else {
                    pVar10 = pVar3;
                }
                if (i21 != 0) {
                    i34 = 2;
                } else {
                    i34 = i10;
                }
                if (i24 != 0) {
                    z12 = false;
                }
                if (i26 != 0) {
                    qVar7 = null;
                } else {
                    qVar7 = qVar2;
                }
                if (i28 != 0) {
                    z16 = true;
                } else {
                    z16 = z11;
                }
                if ((i13 & 1024) != 0) {
                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                    i30 &= -15;
                } else {
                    l0Var3 = l0Var;
                }
                i35 = i30;
                if (i31 != 0) {
                    f12 = w.f12028a;
                } else {
                    f12 = f10;
                }
                hVar4 = hVar3;
                if ((i13 & 4096) != 0) {
                    i35 &= -897;
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                } else {
                    jH = j;
                }
                z17 = z16;
                if ((i13 & 8192) != 0) {
                    jB = ColorsKt.b(jH, c1086gP);
                    i35 &= -7169;
                } else {
                    jB = j10;
                }
                if ((i13 & 16384) != 0) {
                    jA = w.a(c1086gP);
                    i35 &= -57345;
                } else {
                    jA = j11;
                }
                if ((i13 & 32768) != 0) {
                    i35 = (-458753) & i35;
                    long j2114 = jH;
                    jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                    j19 = j2114;
                } else {
                    j19 = jH;
                    jA2 = j12;
                }
                if ((i13 & 65536) != 0) {
                    int i4113 = (-3670017) & i35;
                    j20 = jA2;
                    f13 = f12;
                    pVar11 = pVar10;
                    j21 = j19;
                    j22 = jB;
                    j23 = jA;
                    jB2 = ColorsKt.b(jA2, c1086gP);
                    hVar2 = hVar4;
                    qVar8 = qVar7;
                    i38 = i4113;
                    i37 = i14;
                    i36 = i34;
                    z18 = z17;
                } else {
                    jB2 = j13;
                    j20 = jA2;
                    pVar11 = pVar10;
                    j21 = j19;
                    j22 = jB;
                    i36 = i34;
                    j23 = jA;
                    hVar2 = hVar4;
                    i37 = i14;
                    i38 = i35;
                    z18 = z17;
                    f13 = f12;
                    qVar8 = qVar7;
                }
            } else {
                if (i40 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if ((i13 & 2) != 0) {
                    mD = d(c1086gP);
                    i14 &= -113;
                } else {
                    mD = m7;
                }
                if (i41 != 0) {
                    pVar8 = ComposableSingletons$ScaffoldKt.f11699e;
                } else {
                    pVar8 = pVar4;
                }
                if (i15 != 0) {
                    pVar9 = ComposableSingletons$ScaffoldKt.f11700f;
                } else {
                    pVar9 = pVar2;
                }
                if (i17 != 0) {
                    qVar6 = ComposableSingletons$ScaffoldKt.f11701g;
                } else {
                    qVar6 = qVar;
                }
                if (i19 != 0) {
                    pVar10 = ComposableSingletons$ScaffoldKt.f11702h;
                } else {
                    pVar10 = pVar3;
                }
                if (i21 != 0) {
                    i34 = 2;
                } else {
                    i34 = i10;
                }
                if (i24 != 0) {
                    z12 = false;
                }
                if (i26 != 0) {
                    qVar7 = null;
                } else {
                    qVar7 = qVar2;
                }
                if (i28 != 0) {
                    z16 = true;
                } else {
                    z16 = z11;
                }
                if ((i13 & 1024) != 0) {
                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                    i30 &= -15;
                } else {
                    l0Var3 = l0Var;
                }
                i35 = i30;
                if (i31 != 0) {
                    f12 = w.f12028a;
                } else {
                    f12 = f10;
                }
                hVar4 = hVar3;
                if ((i13 & 4096) != 0) {
                    i35 &= -897;
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                } else {
                    jH = j;
                }
                z17 = z16;
                if ((i13 & 8192) != 0) {
                    jB = ColorsKt.b(jH, c1086gP);
                    i35 &= -7169;
                } else {
                    jB = j10;
                }
                if ((i13 & 16384) != 0) {
                    jA = w.a(c1086gP);
                    i35 &= -57345;
                } else {
                    jA = j11;
                }
                if ((i13 & 32768) != 0) {
                    i35 = (-458753) & i35;
                    long j2115 = jH;
                    jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                    j19 = j2115;
                } else {
                    j19 = jH;
                    jA2 = j12;
                }
                if ((i13 & 65536) != 0) {
                    int i4114 = (-3670017) & i35;
                    j20 = jA2;
                    f13 = f12;
                    pVar11 = pVar10;
                    j21 = j19;
                    j22 = jB;
                    j23 = jA;
                    jB2 = ColorsKt.b(jA2, c1086gP);
                    hVar2 = hVar4;
                    qVar8 = qVar7;
                    i38 = i4114;
                    i37 = i14;
                    i36 = i34;
                    z18 = z17;
                } else {
                    jB2 = j13;
                    j20 = jA2;
                    pVar11 = pVar10;
                    j21 = j19;
                    j22 = jB;
                    i36 = i34;
                    j23 = jA;
                    hVar2 = hVar4;
                    i37 = i14;
                    i38 = i35;
                    z18 = z17;
                    f13 = f12;
                    qVar8 = qVar7;
                }
            }
            c1086gP.U();
            float f111 = 0;
            int i4115 = i38 << 3;
            c1086g = c1086gP;
            b(new C0959t(f111, f111, f111, f111), hVar2, mD, pVar8, pVar9, qVar6, pVar11, i36, z12, qVar8, z18, l0Var3, f13, j21, j22, j23, j20, jB2, qVar3, c1086g, (i37 << 3) & 2147483632, (i4115 & 896) | ((i37 >> 27) & 14) | (i4115 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4115 & 7168) | (57344 & i4115) | (458752 & i4115) | (3670016 & i4115) | (29360128 & i4115) | (234881024 & i4115), 0);
            j14 = j21;
            j15 = j22;
            j16 = j23;
            j17 = j20;
            j18 = jB2;
            M m18 = mD;
            pVar6 = pVar11;
            m10 = m18;
            Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar116 = pVar8;
            i33 = i36;
            pVar7 = pVar116;
            Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar117 = pVar9;
            qVar5 = qVar8;
            pVar5 = pVar117;
            l0 l0Var11 = l0Var3;
            z14 = z18;
            qVar4 = qVar6;
            f11 = f13;
            z15 = z12;
            l0Var2 = l0Var11;
        } else {
            c1086g = c1086gP;
            c1086g.w();
            hVar2 = hVar;
            m10 = m7;
            pVar5 = pVar2;
            qVar4 = qVar;
            pVar6 = pVar3;
            i33 = i10;
            qVar5 = qVar2;
            z14 = z11;
            j14 = j;
            j15 = j10;
            j16 = j11;
            j17 = j12;
            j18 = j13;
            z15 = z12;
            pVar7 = pVar4;
            l0Var2 = l0Var;
            f11 = f10;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            final long j2116 = j15;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ScaffoldKt.a(hVar2, m10, pVar7, pVar5, qVar4, pVar6, i33, z15, qVar5, z14, l0Var2, f11, j14, j2116, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0127  */
    /* JADX WARN: Code duplicated, block: B:102:0x012d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:112:0x0149  */
    /* JADX WARN: Code duplicated, block: B:114:0x014f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0152  */
    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    /* JADX WARN: Code duplicated, block: B:120:0x015d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0161  */
    /* JADX WARN: Code duplicated, block: B:125:0x016c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x0175  */
    /* JADX WARN: Code duplicated, block: B:132:0x017c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0181  */
    /* JADX WARN: Code duplicated, block: B:136:0x0185  */
    /* JADX WARN: Code duplicated, block: B:138:0x018d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0190  */
    /* JADX WARN: Code duplicated, block: B:143:0x0198  */
    /* JADX WARN: Code duplicated, block: B:145:0x019c  */
    /* JADX WARN: Code duplicated, block: B:148:0x01a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:153:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:155:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:158:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:164:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:166:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:169:0x01de  */
    /* JADX WARN: Code duplicated, block: B:171:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:174:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:176:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:179:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:181:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:184:0x0201  */
    /* JADX WARN: Code duplicated, block: B:186:0x0207  */
    /* JADX WARN: Code duplicated, block: B:189:0x0210  */
    /* JADX WARN: Code duplicated, block: B:191:0x0215  */
    /* JADX WARN: Code duplicated, block: B:194:0x021d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0222  */
    /* JADX WARN: Code duplicated, block: B:197:0x0228  */
    /* JADX WARN: Code duplicated, block: B:199:0x022e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0231  */
    /* JADX WARN: Code duplicated, block: B:204:0x0241  */
    /* JADX WARN: Code duplicated, block: B:208:0x024d  */
    /* JADX WARN: Code duplicated, block: B:211:0x0257  */
    /* JADX WARN: Code duplicated, block: B:213:0x025e  */
    /* JADX WARN: Code duplicated, block: B:238:0x02bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:239:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:240:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:243:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:244:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:246:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:247:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:249:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:250:0x02df  */
    /* JADX WARN: Code duplicated, block: B:252:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:253:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:255:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:256:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:258:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:259:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:261:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:262:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:264:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:265:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:267:0x0303  */
    /* JADX WARN: Code duplicated, block: B:268:0x0306  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:271:0x030c  */
    /* JADX WARN: Code duplicated, block: B:272:0x0319  */
    /* JADX WARN: Code duplicated, block: B:274:0x031d  */
    /* JADX WARN: Code duplicated, block: B:275:0x0320  */
    /* JADX WARN: Code duplicated, block: B:278:0x0328  */
    /* JADX WARN: Code duplicated, block: B:279:0x033b  */
    /* JADX WARN: Code duplicated, block: B:282:0x0345  */
    /* JADX WARN: Code duplicated, block: B:283:0x034e  */
    /* JADX WARN: Code duplicated, block: B:286:0x0354  */
    /* JADX WARN: Code duplicated, block: B:287:0x035d  */
    /* JADX WARN: Code duplicated, block: B:290:0x0363  */
    /* JADX WARN: Code duplicated, block: B:291:0x037b  */
    /* JADX WARN: Code duplicated, block: B:294:0x0383  */
    /* JADX WARN: Code duplicated, block: B:296:0x0396  */
    /* JADX WARN: Code duplicated, block: B:300:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:303:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:305:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:308:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:309:0x043c  */
    /* JADX WARN: Code duplicated, block: B:311:0x046c  */
    /* JADX WARN: Code duplicated, block: B:314:0x0497  */
    /* JADX WARN: Code duplicated, block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x0122  */
    public static final void b(final a0 a0Var, androidx.compose.ui.h hVar, M m7, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, int i10, boolean z10, Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2, boolean z11, l0 l0Var, float f10, long j, long j10, long j11, long j12, long j13, final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3, InterfaceC1084f interfaceC1084f, final int i11, final int i12, final int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        boolean z12;
        final androidx.compose.ui.h hVar2;
        final M m10;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5;
        final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar4;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6;
        final int i37;
        final boolean z13;
        final Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar5;
        final boolean z14;
        final l0 l0Var2;
        final float f11;
        final long j14;
        final long j15;
        final long j16;
        final long j17;
        final long j18;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar3;
        M mD;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8;
        Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar6;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9;
        int i38;
        boolean z15;
        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar7;
        boolean z16;
        l0 l0Var3;
        float f12;
        int i39;
        long jH;
        long jB;
        long jA;
        long j19;
        long jA2;
        long jB2;
        long j20;
        boolean z17;
        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar8;
        boolean z18;
        Object objF;
        final ComposableLambdaImpl composableLambdaImplB;
        int i40;
        int i41;
        C1086g c1086gP = interfaceC1084f.p(-1288630565);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (c1086gP.K(a0Var) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        int i42 = i13 & 2;
        if (i42 == 0) {
            if ((i11 & 48) == 0) {
                i14 |= c1086gP.K(hVar) ? 32 : 16;
            }
            if ((i11 & 384) != 0) {
                i14 |= ((i13 & 4) == 0 || !c1086gP.K(m7)) ? 128 : 256;
            }
            i15 = i13 & 8;
            i16 = 1024;
            if (i15 != 0) {
                if ((i11 & 3072) == 0) {
                    if (c1086gP.k(pVar)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i14 |= i17;
                }
                i18 = i13 & 16;
                if (i18 != 0) {
                    if ((i11 & 24576) == 0) {
                        if (c1086gP.k(pVar2)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i14 |= i19;
                    }
                    i20 = i13 & 32;
                    if (i20 != 0) {
                        i14 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        if (c1086gP.k(qVar)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 64;
                    if (i22 != 0) {
                        i14 |= 1572864;
                    } else if ((i11 & 1572864) == 0) {
                        if (c1086gP.k(pVar3)) {
                            i23 = 1048576;
                        } else {
                            i23 = 524288;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 128;
                    if (i24 != 0) {
                        i14 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        if (c1086gP.h(i10)) {
                            i25 = 8388608;
                        } else {
                            i25 = 4194304;
                        }
                        i14 |= i25;
                    }
                    i26 = i13 & 256;
                    if (i26 != 0) {
                        i14 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        if (c1086gP.c(z10)) {
                            i27 = 67108864;
                        } else {
                            i27 = 33554432;
                        }
                        i14 |= i27;
                    }
                    i28 = i13 & 512;
                    if (i28 != 0) {
                        i14 |= 805306368;
                    } else if ((i11 & 805306368) == 0) {
                        if (c1086gP.k(qVar2)) {
                            i29 = 536870912;
                        } else {
                            i29 = 268435456;
                        }
                        i14 |= i29;
                    }
                    i30 = i13 & 1024;
                    if (i30 != 0) {
                        i31 = i12 | 6;
                    } else if ((i12 & 6) == 0) {
                        if (c1086gP.c(z11)) {
                            i32 = 4;
                        } else {
                            i32 = 2;
                        }
                        i31 = i12 | i32;
                    } else {
                        i31 = i12;
                    }
                    if ((i12 & 48) != 0) {
                        i31 |= ((i13 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                    }
                    i33 = i31;
                    i34 = i13 & 4096;
                    if (i34 != 0) {
                        if ((i12 & 384) == 0) {
                            if (c1086gP.g(f10)) {
                                i35 = 256;
                            } else {
                                i35 = 128;
                            }
                            i33 |= i35;
                        }
                        if ((i12 & 3072) != 0) {
                            if ((i13 & 8192) == 0 && c1086gP.i(j)) {
                                i16 = 2048;
                            }
                            i33 |= i16;
                        }
                        if ((i12 & 24576) != 0) {
                            i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
                        }
                        if ((i12 & 196608) != 0) {
                            if ((i13 & 32768) == 0 || !c1086gP.i(j11)) {
                                i41 = 65536;
                            } else {
                                i41 = 131072;
                            }
                            i33 |= i41;
                        }
                        if ((i12 & 1572864) != 0) {
                            i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
                        }
                        if ((i12 & 12582912) != 0) {
                            if ((i13 & 131072) == 0 || !c1086gP.i(j13)) {
                                i40 = 4194304;
                            } else {
                                i40 = 8388608;
                            }
                            i33 |= i40;
                        }
                        if ((i13 & 262144) != 0) {
                            i33 |= 100663296;
                        } else if ((i12 & 100663296) == 0) {
                            if (c1086gP.k(qVar3)) {
                                i36 = 67108864;
                            } else {
                                i36 = 33554432;
                            }
                            i33 |= i36;
                        }
                        if ((i14 & 306783379) == 306783378 || (38347923 & i33) != 38347922) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c1086gP.C(i14 & 1, z12)) {
                            c1086gP.r0();
                            if ((i11 & 1) != 0 || c1086gP.a0()) {
                                if (i42 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar;
                                }
                                if ((i13 & 4) != 0) {
                                    mD = d(c1086gP);
                                    i14 &= -897;
                                } else {
                                    mD = m7;
                                }
                                if (i15 != 0) {
                                    pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                                } else {
                                    pVar7 = pVar;
                                }
                                if (i18 != 0) {
                                    pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                                } else {
                                    pVar8 = pVar2;
                                }
                                if (i20 != 0) {
                                    qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                                } else {
                                    qVar6 = qVar;
                                }
                                if (i22 != 0) {
                                    pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                                } else {
                                    pVar9 = pVar3;
                                }
                                if (i24 != 0) {
                                    i38 = 2;
                                } else {
                                    i38 = i10;
                                }
                                if (i26 != 0) {
                                    z15 = false;
                                } else {
                                    z15 = z10;
                                }
                                if (i28 != 0) {
                                    qVar7 = null;
                                } else {
                                    qVar7 = qVar2;
                                }
                                if (i30 != 0) {
                                    z16 = true;
                                } else {
                                    z16 = z11;
                                }
                                if ((i13 & 2048) != 0) {
                                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                                    i33 &= -113;
                                } else {
                                    l0Var3 = l0Var;
                                }
                                if (i34 != 0) {
                                    f12 = w.f12028a;
                                } else {
                                    f12 = f10;
                                }
                                i39 = i14;
                                if ((i13 & 8192) != 0) {
                                    i33 &= -7169;
                                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                                } else {
                                    jH = j;
                                }
                                Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar9 = qVar7;
                                if ((i13 & 16384) != 0) {
                                    jB = ColorsKt.b(jH, c1086gP);
                                    i33 &= -57345;
                                } else {
                                    jB = j10;
                                }
                                if ((i13 & 32768) != 0) {
                                    jA = w.a(c1086gP);
                                    i33 &= -458753;
                                } else {
                                    jA = j11;
                                }
                                if ((i13 & 65536) != 0) {
                                    i33 = (-3670017) & i33;
                                    long j21 = jH;
                                    jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                                    j19 = j21;
                                } else {
                                    j19 = jH;
                                    jA2 = j12;
                                }
                                if ((i13 & 131072) != 0) {
                                    i33 &= -29360129;
                                    jB2 = ColorsKt.b(jA2, c1086gP);
                                } else {
                                    jB2 = j13;
                                }
                                j20 = jA2;
                                z17 = z15;
                                qVar8 = qVar9;
                            } else {
                                c1086gP.w();
                                if ((i13 & 4) != 0) {
                                    i14 &= -897;
                                }
                                if ((i13 & 2048) != 0) {
                                    i33 &= -113;
                                }
                                if ((i13 & 8192) != 0) {
                                    i33 &= -7169;
                                }
                                if ((i13 & 16384) != 0) {
                                    i33 &= -57345;
                                }
                                if ((i13 & 32768) != 0) {
                                    i33 &= -458753;
                                }
                                if ((i13 & 65536) != 0) {
                                    i33 &= -3670017;
                                }
                                if ((i13 & 131072) != 0) {
                                    i33 &= -29360129;
                                }
                                hVar3 = hVar;
                                mD = m7;
                                pVar7 = pVar;
                                pVar8 = pVar2;
                                qVar6 = qVar;
                                pVar9 = pVar3;
                                i38 = i10;
                                qVar8 = qVar2;
                                z16 = z11;
                                l0Var3 = l0Var;
                                f12 = f10;
                                j19 = j;
                                jB = j10;
                                jA = j11;
                                j20 = j12;
                                jB2 = j13;
                                i39 = i14;
                                z17 = z10;
                            }
                            c1086gP.U();
                            z18 = (i39 & 14) == 4;
                            objF = c1086gP.f();
                            if (z18 || objF == InterfaceC1084f.a.f12980a) {
                                objF = new G(a0Var);
                                c1086gP.E(objF);
                            }
                            final G g10 = (G) objF;
                            final long j22 = j20;
                            final long j23 = jB2;
                            final boolean z19 = z17;
                            final int i43 = i38;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar10 = pVar7;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11 = pVar9;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12 = pVar8;
                            final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar10 = qVar6;
                            final M m11 = mD;
                            composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // Ia.q
                                public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                                    androidx.compose.ui.h hVar5 = hVar4;
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                                    }
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        boolean zK = interfaceC1084f3.K(g10) | interfaceC1084f3.K(a0Var);
                                        final G g11 = g10;
                                        final a0 a0Var2 = a0Var;
                                        Object objF2 = interfaceC1084f3.f();
                                        if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                            objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // Ia.l
                                                public final p293xa.r invoke(a0 a0Var3) {
                                                    G g12 = g11;
                                                    g12.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                                    return p293xa.r.f47939a;
                                                }
                                            };
                                            interfaceC1084f3.E(objF2);
                                        }
                                        androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                                        long j24 = j22;
                                        long j25 = j23;
                                        final boolean z20 = z19;
                                        final int i44 = i43;
                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar13 = pVar10;
                                        final Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar11 = qVar3;
                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar14 = pVar11;
                                        final G g12 = g10;
                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar15 = pVar12;
                                        final Ia.q<P, InterfaceC1084f, Integer, p293xa.r> qVar12 = qVar10;
                                        final M m12 = m11;
                                        SurfaceKt.a(hVarB, null, j24, j25, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                                    boolean z21 = z20;
                                                    int i45 = i44;
                                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar16 = pVar13;
                                                    Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar13 = qVar11;
                                                    final Ia.q<P, InterfaceC1084f, Integer, p293xa.r> qVar14 = qVar12;
                                                    final M m13 = m12;
                                                    ScaffoldKt.c(z21, i45, pVar16, qVar13, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                                qVar14.invoke(m13.f11773b, interfaceC1084f7, 0);
                                                            } else {
                                                                interfaceC1084f7.w();
                                                            }
                                                            return p293xa.r.f47939a;
                                                        }
                                                    }, interfaceC1084f5), pVar14, g12, pVar15, interfaceC1084f5, 24576);
                                                } else {
                                                    interfaceC1084f5.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP);
                            if (qVar8 != null) {
                                c1086gP.L(651765711);
                                int i44 = i33 << 9;
                                DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                        int iIntValue = num.intValue();
                                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                                        } else {
                                            interfaceC1084f3.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i44 & 7168) | (57344 & i44) | (458752 & i44) | (3670016 & i44) | (29360128 & i44) | (i44 & 234881024), 0);
                                c1086gP.T(false);
                            } else {
                                c1086gP.L(652256007);
                                composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                                c1086gP.T(false);
                            }
                            f11 = f12;
                            pVar4 = pVar7;
                            i37 = i38;
                            pVar6 = pVar9;
                            j15 = jB;
                            j17 = j20;
                            qVar5 = qVar8;
                            z14 = z16;
                            m10 = mD;
                            qVar4 = qVar6;
                            j16 = jA;
                            j18 = jB2;
                            z13 = z17;
                            hVar2 = hVar3;
                            pVar5 = pVar8;
                            l0Var2 = l0Var3;
                            j14 = j19;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            m10 = m7;
                            pVar4 = pVar;
                            pVar5 = pVar2;
                            qVar4 = qVar;
                            pVar6 = pVar3;
                            i37 = i10;
                            z13 = z10;
                            qVar5 = qVar2;
                            z14 = z11;
                            l0Var2 = l0Var;
                            f11 = f10;
                            j14 = j;
                            j15 = j10;
                            j16 = j11;
                            j17 = j12;
                            j18 = j13;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i33 |= 384;
                    if ((i12 & 3072) != 0) {
                        if ((i13 & 8192) == 0) {
                            i16 = 2048;
                        }
                        i33 |= i16;
                    }
                    if ((i12 & 24576) != 0) {
                        i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
                    }
                    if ((i12 & 196608) != 0) {
                        if ((i13 & 32768) == 0) {
                            i41 = 65536;
                        } else {
                            i41 = 65536;
                        }
                        i33 |= i41;
                    }
                    if ((i12 & 1572864) != 0) {
                        i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
                    }
                    if ((i12 & 12582912) != 0) {
                        if ((i13 & 131072) == 0) {
                            i40 = 4194304;
                        } else {
                            i40 = 4194304;
                        }
                        i33 |= i40;
                    }
                    if ((i13 & 262144) != 0) {
                        i33 |= 100663296;
                    } else if ((i12 & 100663296) == 0) {
                        if (c1086gP.k(qVar3)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i33 |= i36;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c1086gP.C(i14 & 1, z12)) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i42 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i13 & 4) != 0) {
                                mD = d(c1086gP);
                                i14 &= -897;
                            } else {
                                mD = m7;
                            }
                            if (i15 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                            } else {
                                pVar7 = pVar;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                            } else {
                                pVar8 = pVar2;
                            }
                            if (i20 != 0) {
                                qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                            } else {
                                qVar6 = qVar;
                            }
                            if (i22 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i24 != 0) {
                                i38 = 2;
                            } else {
                                i38 = i10;
                            }
                            if (i26 != 0) {
                                z15 = false;
                            } else {
                                z15 = z10;
                            }
                            if (i28 != 0) {
                                qVar7 = null;
                            } else {
                                qVar7 = qVar2;
                            }
                            if (i30 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                            if ((i13 & 2048) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                                i33 &= -113;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if (i34 != 0) {
                                f12 = w.f12028a;
                            } else {
                                f12 = f10;
                            }
                            i39 = i14;
                            if ((i13 & 8192) != 0) {
                                i33 &= -7169;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11 = qVar7;
                            if ((i13 & 16384) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i33 &= -57345;
                            } else {
                                jB = j10;
                            }
                            if ((i13 & 32768) != 0) {
                                jA = w.a(c1086gP);
                                i33 &= -458753;
                            } else {
                                jA = j11;
                            }
                            if ((i13 & 65536) != 0) {
                                i33 = (-3670017) & i33;
                                long j24 = jH;
                                jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                                j19 = j24;
                            } else {
                                j19 = jH;
                                jA2 = j12;
                            }
                            if ((i13 & 131072) != 0) {
                                i33 &= -29360129;
                                jB2 = ColorsKt.b(jA2, c1086gP);
                            } else {
                                jB2 = j13;
                            }
                            j20 = jA2;
                            z17 = z15;
                            qVar8 = qVar11;
                        } else {
                            if (i42 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i13 & 4) != 0) {
                                mD = d(c1086gP);
                                i14 &= -897;
                            } else {
                                mD = m7;
                            }
                            if (i15 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                            } else {
                                pVar7 = pVar;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                            } else {
                                pVar8 = pVar2;
                            }
                            if (i20 != 0) {
                                qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                            } else {
                                qVar6 = qVar;
                            }
                            if (i22 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i24 != 0) {
                                i38 = 2;
                            } else {
                                i38 = i10;
                            }
                            if (i26 != 0) {
                                z15 = false;
                            } else {
                                z15 = z10;
                            }
                            if (i28 != 0) {
                                qVar7 = null;
                            } else {
                                qVar7 = qVar2;
                            }
                            if (i30 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                            if ((i13 & 2048) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                                i33 &= -113;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if (i34 != 0) {
                                f12 = w.f12028a;
                            } else {
                                f12 = f10;
                            }
                            i39 = i14;
                            if ((i13 & 8192) != 0) {
                                i33 &= -7169;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar12 = qVar7;
                            if ((i13 & 16384) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i33 &= -57345;
                            } else {
                                jB = j10;
                            }
                            if ((i13 & 32768) != 0) {
                                jA = w.a(c1086gP);
                                i33 &= -458753;
                            } else {
                                jA = j11;
                            }
                            if ((i13 & 65536) != 0) {
                                i33 = (-3670017) & i33;
                                long j25 = jH;
                                jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                                j19 = j25;
                            } else {
                                j19 = jH;
                                jA2 = j12;
                            }
                            if ((i13 & 131072) != 0) {
                                i33 &= -29360129;
                                jB2 = ColorsKt.b(jA2, c1086gP);
                            } else {
                                jB2 = j13;
                            }
                            j20 = jA2;
                            z17 = z15;
                            qVar8 = qVar12;
                        }
                        c1086gP.U();
                        if ((i39 & 14) == 4) {
                        }
                        objF = c1086gP.f();
                        if (z18) {
                            objF = new G(a0Var);
                            c1086gP.E(objF);
                        } else {
                            objF = new G(a0Var);
                            c1086gP.E(objF);
                        }
                        final G g11 = (G) objF;
                        final long j26 = j20;
                        final long j27 = jB2;
                        final boolean z110 = z17;
                        final int i45 = i38;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15 = pVar8;
                        final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar13 = qVar6;
                        final M m12 = mD;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // Ia.q
                            public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                                androidx.compose.ui.h hVar5 = hVar4;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                                }
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    boolean zK = interfaceC1084f3.K(g11) | interfaceC1084f3.K(a0Var);
                                    final G g12 = g11;
                                    final a0 a0Var2 = a0Var;
                                    Object objF2 = interfaceC1084f3.f();
                                    if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                        objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(a0 a0Var3) {
                                                G g13 = g12;
                                                g13.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF2);
                                    }
                                    androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                                    long j28 = j26;
                                    long j29 = j27;
                                    final boolean z20 = z110;
                                    final int i46 = i45;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16 = pVar13;
                                    final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar14 = qVar3;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17 = pVar14;
                                    final G g13 = g11;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18 = pVar15;
                                    final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar15 = qVar13;
                                    final M m13 = m12;
                                    SurfaceKt.a(hVarB, null, j28, j29, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                                boolean z21 = z20;
                                                int i47 = i46;
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar19 = pVar16;
                                                Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar16 = qVar14;
                                                final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar17 = qVar15;
                                                final M m14 = m13;
                                                ScaffoldKt.c(z21, i47, pVar19, qVar16, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                            qVar17.invoke(m14.f11773b, interfaceC1084f7, 0);
                                                        } else {
                                                            interfaceC1084f7.w();
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }, interfaceC1084f5), pVar17, g13, pVar18, interfaceC1084f5, 24576);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                        if (qVar8 != null) {
                            c1086gP.L(651765711);
                            int i46 = i33 << 9;
                            DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i46 & 7168) | (57344 & i46) | (458752 & i46) | (3670016 & i46) | (29360128 & i46) | (i46 & 234881024), 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(652256007);
                            composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                            c1086gP.T(false);
                        }
                        f11 = f12;
                        pVar4 = pVar7;
                        i37 = i38;
                        pVar6 = pVar9;
                        j15 = jB;
                        j17 = j20;
                        qVar5 = qVar8;
                        z14 = z16;
                        m10 = mD;
                        qVar4 = qVar6;
                        j16 = jA;
                        j18 = jB2;
                        z13 = z17;
                        hVar2 = hVar3;
                        pVar5 = pVar8;
                        l0Var2 = l0Var3;
                        j14 = j19;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        m10 = m7;
                        pVar4 = pVar;
                        pVar5 = pVar2;
                        qVar4 = qVar;
                        pVar6 = pVar3;
                        i37 = i10;
                        z13 = z10;
                        qVar5 = qVar2;
                        z14 = z11;
                        l0Var2 = l0Var;
                        f11 = f10;
                        j14 = j;
                        j15 = j10;
                        j16 = j11;
                        j17 = j12;
                        j18 = j13;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i14 |= 24576;
                i20 = i13 & 32;
                if (i20 != 0) {
                    i14 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 64;
                if (i22 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 128;
                if (i24 != 0) {
                    i14 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (c1086gP.h(i10)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                i26 = i13 & 256;
                if (i26 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c1086gP.c(z10)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i14 |= i27;
                }
                i28 = i13 & 512;
                if (i28 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (c1086gP.k(qVar2)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i14 |= i29;
                }
                i30 = i13 & 1024;
                if (i30 != 0) {
                    i31 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (c1086gP.c(z11)) {
                        i32 = 4;
                    } else {
                        i32 = 2;
                    }
                    i31 = i12 | i32;
                } else {
                    i31 = i12;
                }
                if ((i12 & 48) != 0) {
                    i31 |= ((i13 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                }
                i33 = i31;
                i34 = i13 & 4096;
                if (i34 != 0) {
                    if ((i12 & 384) == 0) {
                        if (c1086gP.g(f10)) {
                            i35 = 256;
                        } else {
                            i35 = 128;
                        }
                        i33 |= i35;
                    }
                    if ((i12 & 3072) != 0) {
                        if ((i13 & 8192) == 0) {
                            i16 = 2048;
                        }
                        i33 |= i16;
                    }
                    if ((i12 & 24576) != 0) {
                        i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
                    }
                    if ((i12 & 196608) != 0) {
                        if ((i13 & 32768) == 0) {
                            i41 = 65536;
                        } else {
                            i41 = 65536;
                        }
                        i33 |= i41;
                    }
                    if ((i12 & 1572864) != 0) {
                        i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
                    }
                    if ((i12 & 12582912) != 0) {
                        if ((i13 & 131072) == 0) {
                            i40 = 4194304;
                        } else {
                            i40 = 4194304;
                        }
                        i33 |= i40;
                    }
                    if ((i13 & 262144) != 0) {
                        i33 |= 100663296;
                    } else if ((i12 & 100663296) == 0) {
                        if (c1086gP.k(qVar3)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i33 |= i36;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c1086gP.C(i14 & 1, z12)) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i42 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i13 & 4) != 0) {
                                mD = d(c1086gP);
                                i14 &= -897;
                            } else {
                                mD = m7;
                            }
                            if (i15 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                            } else {
                                pVar7 = pVar;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                            } else {
                                pVar8 = pVar2;
                            }
                            if (i20 != 0) {
                                qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                            } else {
                                qVar6 = qVar;
                            }
                            if (i22 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i24 != 0) {
                                i38 = 2;
                            } else {
                                i38 = i10;
                            }
                            if (i26 != 0) {
                                z15 = false;
                            } else {
                                z15 = z10;
                            }
                            if (i28 != 0) {
                                qVar7 = null;
                            } else {
                                qVar7 = qVar2;
                            }
                            if (i30 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                            if ((i13 & 2048) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                                i33 &= -113;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if (i34 != 0) {
                                f12 = w.f12028a;
                            } else {
                                f12 = f10;
                            }
                            i39 = i14;
                            if ((i13 & 8192) != 0) {
                                i33 &= -7169;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar14 = qVar7;
                            if ((i13 & 16384) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i33 &= -57345;
                            } else {
                                jB = j10;
                            }
                            if ((i13 & 32768) != 0) {
                                jA = w.a(c1086gP);
                                i33 &= -458753;
                            } else {
                                jA = j11;
                            }
                            if ((i13 & 65536) != 0) {
                                i33 = (-3670017) & i33;
                                long j28 = jH;
                                jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                                j19 = j28;
                            } else {
                                j19 = jH;
                                jA2 = j12;
                            }
                            if ((i13 & 131072) != 0) {
                                i33 &= -29360129;
                                jB2 = ColorsKt.b(jA2, c1086gP);
                            } else {
                                jB2 = j13;
                            }
                            j20 = jA2;
                            z17 = z15;
                            qVar8 = qVar14;
                        } else {
                            if (i42 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i13 & 4) != 0) {
                                mD = d(c1086gP);
                                i14 &= -897;
                            } else {
                                mD = m7;
                            }
                            if (i15 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                            } else {
                                pVar7 = pVar;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                            } else {
                                pVar8 = pVar2;
                            }
                            if (i20 != 0) {
                                qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                            } else {
                                qVar6 = qVar;
                            }
                            if (i22 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i24 != 0) {
                                i38 = 2;
                            } else {
                                i38 = i10;
                            }
                            if (i26 != 0) {
                                z15 = false;
                            } else {
                                z15 = z10;
                            }
                            if (i28 != 0) {
                                qVar7 = null;
                            } else {
                                qVar7 = qVar2;
                            }
                            if (i30 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                            if ((i13 & 2048) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                                i33 &= -113;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if (i34 != 0) {
                                f12 = w.f12028a;
                            } else {
                                f12 = f10;
                            }
                            i39 = i14;
                            if ((i13 & 8192) != 0) {
                                i33 &= -7169;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar15 = qVar7;
                            if ((i13 & 16384) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i33 &= -57345;
                            } else {
                                jB = j10;
                            }
                            if ((i13 & 32768) != 0) {
                                jA = w.a(c1086gP);
                                i33 &= -458753;
                            } else {
                                jA = j11;
                            }
                            if ((i13 & 65536) != 0) {
                                i33 = (-3670017) & i33;
                                long j29 = jH;
                                jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                                j19 = j29;
                            } else {
                                j19 = jH;
                                jA2 = j12;
                            }
                            if ((i13 & 131072) != 0) {
                                i33 &= -29360129;
                                jB2 = ColorsKt.b(jA2, c1086gP);
                            } else {
                                jB2 = j13;
                            }
                            j20 = jA2;
                            z17 = z15;
                            qVar8 = qVar15;
                        }
                        c1086gP.U();
                        if ((i39 & 14) == 4) {
                        }
                        objF = c1086gP.f();
                        if (z18) {
                            objF = new G(a0Var);
                            c1086gP.E(objF);
                        } else {
                            objF = new G(a0Var);
                            c1086gP.E(objF);
                        }
                        final G g12 = (G) objF;
                        final long j210 = j20;
                        final long j211 = jB2;
                        final boolean z111 = z17;
                        final int i47 = i38;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18 = pVar8;
                        final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar16 = qVar6;
                        final M m13 = mD;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // Ia.q
                            public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                                androidx.compose.ui.h hVar5 = hVar4;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                                }
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    boolean zK = interfaceC1084f3.K(g12) | interfaceC1084f3.K(a0Var);
                                    final G g13 = g12;
                                    final a0 a0Var2 = a0Var;
                                    Object objF2 = interfaceC1084f3.f();
                                    if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                        objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(a0 a0Var3) {
                                                G g14 = g13;
                                                g14.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF2);
                                    }
                                    androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                                    long j212 = j210;
                                    long j213 = j211;
                                    final boolean z20 = z111;
                                    final int i48 = i47;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19 = pVar16;
                                    final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar17 = qVar3;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar110 = pVar17;
                                    final G g14 = g12;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111 = pVar18;
                                    final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar18 = qVar16;
                                    final M m14 = m13;
                                    SurfaceKt.a(hVarB, null, j212, j213, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                                boolean z21 = z20;
                                                int i49 = i48;
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar112 = pVar19;
                                                Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar19 = qVar17;
                                                final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar110 = qVar18;
                                                final M m15 = m14;
                                                ScaffoldKt.c(z21, i49, pVar112, qVar19, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                            qVar110.invoke(m15.f11773b, interfaceC1084f7, 0);
                                                        } else {
                                                            interfaceC1084f7.w();
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }, interfaceC1084f5), pVar110, g14, pVar111, interfaceC1084f5, 24576);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                        if (qVar8 != null) {
                            c1086gP.L(651765711);
                            int i48 = i33 << 9;
                            DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i48 & 7168) | (57344 & i48) | (458752 & i48) | (3670016 & i48) | (29360128 & i48) | (i48 & 234881024), 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(652256007);
                            composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                            c1086gP.T(false);
                        }
                        f11 = f12;
                        pVar4 = pVar7;
                        i37 = i38;
                        pVar6 = pVar9;
                        j15 = jB;
                        j17 = j20;
                        qVar5 = qVar8;
                        z14 = z16;
                        m10 = mD;
                        qVar4 = qVar6;
                        j16 = jA;
                        j18 = jB2;
                        z13 = z17;
                        hVar2 = hVar3;
                        pVar5 = pVar8;
                        l0Var2 = l0Var3;
                        j14 = j19;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        m10 = m7;
                        pVar4 = pVar;
                        pVar5 = pVar2;
                        qVar4 = qVar;
                        pVar6 = pVar3;
                        i37 = i10;
                        z13 = z10;
                        qVar5 = qVar2;
                        z14 = z11;
                        l0Var2 = l0Var;
                        f11 = f10;
                        j14 = j;
                        j15 = j10;
                        j16 = j11;
                        j17 = j12;
                        j18 = j13;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i33 |= 384;
                if ((i12 & 3072) != 0) {
                    if ((i13 & 8192) == 0) {
                        i16 = 2048;
                    }
                    i33 |= i16;
                }
                if ((i12 & 24576) != 0) {
                    i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
                }
                if ((i12 & 196608) != 0) {
                    if ((i13 & 32768) == 0) {
                        i41 = 65536;
                    } else {
                        i41 = 65536;
                    }
                    i33 |= i41;
                }
                if ((i12 & 1572864) != 0) {
                    i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
                }
                if ((i12 & 12582912) != 0) {
                    if ((i13 & 131072) == 0) {
                        i40 = 4194304;
                    } else {
                        i40 = 4194304;
                    }
                    i33 |= i40;
                }
                if ((i13 & 262144) != 0) {
                    i33 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (c1086gP.k(qVar3)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i33 |= i36;
                }
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c1086gP.C(i14 & 1, z12)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i42 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 4) != 0) {
                            mD = d(c1086gP);
                            i14 &= -897;
                        } else {
                            mD = m7;
                        }
                        if (i15 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                        } else {
                            pVar7 = pVar;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                        } else {
                            pVar8 = pVar2;
                        }
                        if (i20 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i22 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i24 != 0) {
                            i38 = 2;
                        } else {
                            i38 = i10;
                        }
                        if (i26 != 0) {
                            z15 = false;
                        } else {
                            z15 = z10;
                        }
                        if (i28 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i30 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 2048) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i33 &= -113;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if (i34 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        i39 = i14;
                        if ((i13 & 8192) != 0) {
                            i33 &= -7169;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar17 = qVar7;
                        if ((i13 & 16384) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i33 &= -57345;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 32768) != 0) {
                            jA = w.a(c1086gP);
                            i33 &= -458753;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 65536) != 0) {
                            i33 = (-3670017) & i33;
                            long j212 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j212;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 131072) != 0) {
                            i33 &= -29360129;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                        } else {
                            jB2 = j13;
                        }
                        j20 = jA2;
                        z17 = z15;
                        qVar8 = qVar17;
                    } else {
                        if (i42 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 4) != 0) {
                            mD = d(c1086gP);
                            i14 &= -897;
                        } else {
                            mD = m7;
                        }
                        if (i15 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                        } else {
                            pVar7 = pVar;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                        } else {
                            pVar8 = pVar2;
                        }
                        if (i20 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i22 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i24 != 0) {
                            i38 = 2;
                        } else {
                            i38 = i10;
                        }
                        if (i26 != 0) {
                            z15 = false;
                        } else {
                            z15 = z10;
                        }
                        if (i28 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i30 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 2048) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i33 &= -113;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if (i34 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        i39 = i14;
                        if ((i13 & 8192) != 0) {
                            i33 &= -7169;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar18 = qVar7;
                        if ((i13 & 16384) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i33 &= -57345;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 32768) != 0) {
                            jA = w.a(c1086gP);
                            i33 &= -458753;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 65536) != 0) {
                            i33 = (-3670017) & i33;
                            long j213 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j213;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 131072) != 0) {
                            i33 &= -29360129;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                        } else {
                            jB2 = j13;
                        }
                        j20 = jA2;
                        z17 = z15;
                        qVar8 = qVar18;
                    }
                    c1086gP.U();
                    if ((i39 & 14) == 4) {
                    }
                    objF = c1086gP.f();
                    if (z18) {
                        objF = new G(a0Var);
                        c1086gP.E(objF);
                    } else {
                        objF = new G(a0Var);
                        c1086gP.E(objF);
                    }
                    final G g13 = (G) objF;
                    final long j214 = j20;
                    final long j215 = jB2;
                    final boolean z112 = z17;
                    final int i49 = i38;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar110 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111 = pVar8;
                    final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar19 = qVar6;
                    final M m14 = mD;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // Ia.q
                        public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                            androidx.compose.ui.h hVar5 = hVar4;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                            }
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                boolean zK = interfaceC1084f3.K(g13) | interfaceC1084f3.K(a0Var);
                                final G g14 = g13;
                                final a0 a0Var2 = a0Var;
                                Object objF2 = interfaceC1084f3.f();
                                if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                    objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(a0 a0Var3) {
                                            G g15 = g14;
                                            g15.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF2);
                                }
                                androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                                long j216 = j214;
                                long j217 = j215;
                                final boolean z20 = z112;
                                final int i410 = i49;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar112 = pVar19;
                                final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar110 = qVar3;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar113 = pVar110;
                                final G g15 = g13;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar114 = pVar111;
                                final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111 = qVar19;
                                final M m15 = m14;
                                SurfaceKt.a(hVarB, null, j216, j217, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                            boolean z21 = z20;
                                            int i411 = i410;
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar115 = pVar112;
                                            Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar112 = qVar110;
                                            final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar113 = qVar111;
                                            final M m16 = m15;
                                            ScaffoldKt.c(z21, i411, pVar115, qVar112, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                        qVar113.invoke(m16.f11773b, interfaceC1084f7, 0);
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), pVar113, g15, pVar114, interfaceC1084f5, 24576);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    if (qVar8 != null) {
                        c1086gP.L(651765711);
                        int i410 = i33 << 9;
                        DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i410 & 7168) | (57344 & i410) | (458752 & i410) | (3670016 & i410) | (29360128 & i410) | (i410 & 234881024), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(652256007);
                        composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                        c1086gP.T(false);
                    }
                    f11 = f12;
                    pVar4 = pVar7;
                    i37 = i38;
                    pVar6 = pVar9;
                    j15 = jB;
                    j17 = j20;
                    qVar5 = qVar8;
                    z14 = z16;
                    m10 = mD;
                    qVar4 = qVar6;
                    j16 = jA;
                    j18 = jB2;
                    z13 = z17;
                    hVar2 = hVar3;
                    pVar5 = pVar8;
                    l0Var2 = l0Var3;
                    j14 = j19;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    m10 = m7;
                    pVar4 = pVar;
                    pVar5 = pVar2;
                    qVar4 = qVar;
                    pVar6 = pVar3;
                    i37 = i10;
                    z13 = z10;
                    qVar5 = qVar2;
                    z14 = z11;
                    l0Var2 = l0Var;
                    f11 = f10;
                    j14 = j;
                    j15 = j10;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 3072;
            i18 = i13 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i14 |= i19;
                }
                i20 = i13 & 32;
                if (i20 != 0) {
                    i14 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 64;
                if (i22 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 128;
                if (i24 != 0) {
                    i14 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (c1086gP.h(i10)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                i26 = i13 & 256;
                if (i26 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c1086gP.c(z10)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i14 |= i27;
                }
                i28 = i13 & 512;
                if (i28 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (c1086gP.k(qVar2)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i14 |= i29;
                }
                i30 = i13 & 1024;
                if (i30 != 0) {
                    i31 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (c1086gP.c(z11)) {
                        i32 = 4;
                    } else {
                        i32 = 2;
                    }
                    i31 = i12 | i32;
                } else {
                    i31 = i12;
                }
                if ((i12 & 48) != 0) {
                    i31 |= ((i13 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                }
                i33 = i31;
                i34 = i13 & 4096;
                if (i34 != 0) {
                    if ((i12 & 384) == 0) {
                        if (c1086gP.g(f10)) {
                            i35 = 256;
                        } else {
                            i35 = 128;
                        }
                        i33 |= i35;
                    }
                    if ((i12 & 3072) != 0) {
                        if ((i13 & 8192) == 0) {
                            i16 = 2048;
                        }
                        i33 |= i16;
                    }
                    if ((i12 & 24576) != 0) {
                        i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
                    }
                    if ((i12 & 196608) != 0) {
                        if ((i13 & 32768) == 0) {
                            i41 = 65536;
                        } else {
                            i41 = 65536;
                        }
                        i33 |= i41;
                    }
                    if ((i12 & 1572864) != 0) {
                        i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
                    }
                    if ((i12 & 12582912) != 0) {
                        if ((i13 & 131072) == 0) {
                            i40 = 4194304;
                        } else {
                            i40 = 4194304;
                        }
                        i33 |= i40;
                    }
                    if ((i13 & 262144) != 0) {
                        i33 |= 100663296;
                    } else if ((i12 & 100663296) == 0) {
                        if (c1086gP.k(qVar3)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i33 |= i36;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c1086gP.C(i14 & 1, z12)) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i42 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i13 & 4) != 0) {
                                mD = d(c1086gP);
                                i14 &= -897;
                            } else {
                                mD = m7;
                            }
                            if (i15 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                            } else {
                                pVar7 = pVar;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                            } else {
                                pVar8 = pVar2;
                            }
                            if (i20 != 0) {
                                qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                            } else {
                                qVar6 = qVar;
                            }
                            if (i22 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i24 != 0) {
                                i38 = 2;
                            } else {
                                i38 = i10;
                            }
                            if (i26 != 0) {
                                z15 = false;
                            } else {
                                z15 = z10;
                            }
                            if (i28 != 0) {
                                qVar7 = null;
                            } else {
                                qVar7 = qVar2;
                            }
                            if (i30 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                            if ((i13 & 2048) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                                i33 &= -113;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if (i34 != 0) {
                                f12 = w.f12028a;
                            } else {
                                f12 = f10;
                            }
                            i39 = i14;
                            if ((i13 & 8192) != 0) {
                                i33 &= -7169;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar110 = qVar7;
                            if ((i13 & 16384) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i33 &= -57345;
                            } else {
                                jB = j10;
                            }
                            if ((i13 & 32768) != 0) {
                                jA = w.a(c1086gP);
                                i33 &= -458753;
                            } else {
                                jA = j11;
                            }
                            if ((i13 & 65536) != 0) {
                                i33 = (-3670017) & i33;
                                long j216 = jH;
                                jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                                j19 = j216;
                            } else {
                                j19 = jH;
                                jA2 = j12;
                            }
                            if ((i13 & 131072) != 0) {
                                i33 &= -29360129;
                                jB2 = ColorsKt.b(jA2, c1086gP);
                            } else {
                                jB2 = j13;
                            }
                            j20 = jA2;
                            z17 = z15;
                            qVar8 = qVar110;
                        } else {
                            if (i42 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i13 & 4) != 0) {
                                mD = d(c1086gP);
                                i14 &= -897;
                            } else {
                                mD = m7;
                            }
                            if (i15 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                            } else {
                                pVar7 = pVar;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                            } else {
                                pVar8 = pVar2;
                            }
                            if (i20 != 0) {
                                qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                            } else {
                                qVar6 = qVar;
                            }
                            if (i22 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i24 != 0) {
                                i38 = 2;
                            } else {
                                i38 = i10;
                            }
                            if (i26 != 0) {
                                z15 = false;
                            } else {
                                z15 = z10;
                            }
                            if (i28 != 0) {
                                qVar7 = null;
                            } else {
                                qVar7 = qVar2;
                            }
                            if (i30 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                            if ((i13 & 2048) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                                i33 &= -113;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if (i34 != 0) {
                                f12 = w.f12028a;
                            } else {
                                f12 = f10;
                            }
                            i39 = i14;
                            if ((i13 & 8192) != 0) {
                                i33 &= -7169;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111 = qVar7;
                            if ((i13 & 16384) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i33 &= -57345;
                            } else {
                                jB = j10;
                            }
                            if ((i13 & 32768) != 0) {
                                jA = w.a(c1086gP);
                                i33 &= -458753;
                            } else {
                                jA = j11;
                            }
                            if ((i13 & 65536) != 0) {
                                i33 = (-3670017) & i33;
                                long j217 = jH;
                                jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                                j19 = j217;
                            } else {
                                j19 = jH;
                                jA2 = j12;
                            }
                            if ((i13 & 131072) != 0) {
                                i33 &= -29360129;
                                jB2 = ColorsKt.b(jA2, c1086gP);
                            } else {
                                jB2 = j13;
                            }
                            j20 = jA2;
                            z17 = z15;
                            qVar8 = qVar111;
                        }
                        c1086gP.U();
                        if ((i39 & 14) == 4) {
                        }
                        objF = c1086gP.f();
                        if (z18) {
                            objF = new G(a0Var);
                            c1086gP.E(objF);
                        } else {
                            objF = new G(a0Var);
                            c1086gP.E(objF);
                        }
                        final G g14 = (G) objF;
                        final long j218 = j20;
                        final long j219 = jB2;
                        final boolean z113 = z17;
                        final int i411 = i38;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar112 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar113 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar114 = pVar8;
                        final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar112 = qVar6;
                        final M m15 = mD;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // Ia.q
                            public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                                androidx.compose.ui.h hVar5 = hVar4;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                                }
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    boolean zK = interfaceC1084f3.K(g14) | interfaceC1084f3.K(a0Var);
                                    final G g15 = g14;
                                    final a0 a0Var2 = a0Var;
                                    Object objF2 = interfaceC1084f3.f();
                                    if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                        objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(a0 a0Var3) {
                                                G g16 = g15;
                                                g16.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF2);
                                    }
                                    androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                                    long j2110 = j218;
                                    long j2111 = j219;
                                    final boolean z20 = z113;
                                    final int i412 = i411;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar115 = pVar112;
                                    final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar113 = qVar3;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar116 = pVar113;
                                    final G g16 = g14;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar117 = pVar114;
                                    final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar114 = qVar112;
                                    final M m16 = m15;
                                    SurfaceKt.a(hVarB, null, j2110, j2111, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                                boolean z21 = z20;
                                                int i413 = i412;
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar118 = pVar115;
                                                Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar115 = qVar113;
                                                final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar116 = qVar114;
                                                final M m17 = m16;
                                                ScaffoldKt.c(z21, i413, pVar118, qVar115, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                            qVar116.invoke(m17.f11773b, interfaceC1084f7, 0);
                                                        } else {
                                                            interfaceC1084f7.w();
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }, interfaceC1084f5), pVar116, g16, pVar117, interfaceC1084f5, 24576);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                        if (qVar8 != null) {
                            c1086gP.L(651765711);
                            int i412 = i33 << 9;
                            DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i412 & 7168) | (57344 & i412) | (458752 & i412) | (3670016 & i412) | (29360128 & i412) | (i412 & 234881024), 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(652256007);
                            composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                            c1086gP.T(false);
                        }
                        f11 = f12;
                        pVar4 = pVar7;
                        i37 = i38;
                        pVar6 = pVar9;
                        j15 = jB;
                        j17 = j20;
                        qVar5 = qVar8;
                        z14 = z16;
                        m10 = mD;
                        qVar4 = qVar6;
                        j16 = jA;
                        j18 = jB2;
                        z13 = z17;
                        hVar2 = hVar3;
                        pVar5 = pVar8;
                        l0Var2 = l0Var3;
                        j14 = j19;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        m10 = m7;
                        pVar4 = pVar;
                        pVar5 = pVar2;
                        qVar4 = qVar;
                        pVar6 = pVar3;
                        i37 = i10;
                        z13 = z10;
                        qVar5 = qVar2;
                        z14 = z11;
                        l0Var2 = l0Var;
                        f11 = f10;
                        j14 = j;
                        j15 = j10;
                        j16 = j11;
                        j17 = j12;
                        j18 = j13;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i33 |= 384;
                if ((i12 & 3072) != 0) {
                    if ((i13 & 8192) == 0) {
                        i16 = 2048;
                    }
                    i33 |= i16;
                }
                if ((i12 & 24576) != 0) {
                    i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
                }
                if ((i12 & 196608) != 0) {
                    if ((i13 & 32768) == 0) {
                        i41 = 65536;
                    } else {
                        i41 = 65536;
                    }
                    i33 |= i41;
                }
                if ((i12 & 1572864) != 0) {
                    i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
                }
                if ((i12 & 12582912) != 0) {
                    if ((i13 & 131072) == 0) {
                        i40 = 4194304;
                    } else {
                        i40 = 4194304;
                    }
                    i33 |= i40;
                }
                if ((i13 & 262144) != 0) {
                    i33 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (c1086gP.k(qVar3)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i33 |= i36;
                }
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c1086gP.C(i14 & 1, z12)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i42 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 4) != 0) {
                            mD = d(c1086gP);
                            i14 &= -897;
                        } else {
                            mD = m7;
                        }
                        if (i15 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                        } else {
                            pVar7 = pVar;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                        } else {
                            pVar8 = pVar2;
                        }
                        if (i20 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i22 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i24 != 0) {
                            i38 = 2;
                        } else {
                            i38 = i10;
                        }
                        if (i26 != 0) {
                            z15 = false;
                        } else {
                            z15 = z10;
                        }
                        if (i28 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i30 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 2048) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i33 &= -113;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if (i34 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        i39 = i14;
                        if ((i13 & 8192) != 0) {
                            i33 &= -7169;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar113 = qVar7;
                        if ((i13 & 16384) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i33 &= -57345;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 32768) != 0) {
                            jA = w.a(c1086gP);
                            i33 &= -458753;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 65536) != 0) {
                            i33 = (-3670017) & i33;
                            long j2110 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j2110;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 131072) != 0) {
                            i33 &= -29360129;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                        } else {
                            jB2 = j13;
                        }
                        j20 = jA2;
                        z17 = z15;
                        qVar8 = qVar113;
                    } else {
                        if (i42 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 4) != 0) {
                            mD = d(c1086gP);
                            i14 &= -897;
                        } else {
                            mD = m7;
                        }
                        if (i15 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                        } else {
                            pVar7 = pVar;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                        } else {
                            pVar8 = pVar2;
                        }
                        if (i20 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i22 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i24 != 0) {
                            i38 = 2;
                        } else {
                            i38 = i10;
                        }
                        if (i26 != 0) {
                            z15 = false;
                        } else {
                            z15 = z10;
                        }
                        if (i28 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i30 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 2048) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i33 &= -113;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if (i34 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        i39 = i14;
                        if ((i13 & 8192) != 0) {
                            i33 &= -7169;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar114 = qVar7;
                        if ((i13 & 16384) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i33 &= -57345;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 32768) != 0) {
                            jA = w.a(c1086gP);
                            i33 &= -458753;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 65536) != 0) {
                            i33 = (-3670017) & i33;
                            long j2111 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j2111;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 131072) != 0) {
                            i33 &= -29360129;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                        } else {
                            jB2 = j13;
                        }
                        j20 = jA2;
                        z17 = z15;
                        qVar8 = qVar114;
                    }
                    c1086gP.U();
                    if ((i39 & 14) == 4) {
                    }
                    objF = c1086gP.f();
                    if (z18) {
                        objF = new G(a0Var);
                        c1086gP.E(objF);
                    } else {
                        objF = new G(a0Var);
                        c1086gP.E(objF);
                    }
                    final G g15 = (G) objF;
                    final long j2112 = j20;
                    final long j2113 = jB2;
                    final boolean z114 = z17;
                    final int i413 = i38;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar115 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar116 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar117 = pVar8;
                    final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar115 = qVar6;
                    final M m16 = mD;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // Ia.q
                        public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                            androidx.compose.ui.h hVar5 = hVar4;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                            }
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                boolean zK = interfaceC1084f3.K(g15) | interfaceC1084f3.K(a0Var);
                                final G g16 = g15;
                                final a0 a0Var2 = a0Var;
                                Object objF2 = interfaceC1084f3.f();
                                if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                    objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(a0 a0Var3) {
                                            G g17 = g16;
                                            g17.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF2);
                                }
                                androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                                long j2114 = j2112;
                                long j2115 = j2113;
                                final boolean z20 = z114;
                                final int i414 = i413;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar118 = pVar115;
                                final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar116 = qVar3;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar119 = pVar116;
                                final G g17 = g15;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1110 = pVar117;
                                final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar117 = qVar115;
                                final M m17 = m16;
                                SurfaceKt.a(hVarB, null, j2114, j2115, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                            boolean z21 = z20;
                                            int i415 = i414;
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar1111 = pVar118;
                                            Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar118 = qVar116;
                                            final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar119 = qVar117;
                                            final M m18 = m17;
                                            ScaffoldKt.c(z21, i415, pVar1111, qVar118, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                        qVar119.invoke(m18.f11773b, interfaceC1084f7, 0);
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), pVar119, g17, pVar1110, interfaceC1084f5, 24576);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    if (qVar8 != null) {
                        c1086gP.L(651765711);
                        int i414 = i33 << 9;
                        DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i414 & 7168) | (57344 & i414) | (458752 & i414) | (3670016 & i414) | (29360128 & i414) | (i414 & 234881024), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(652256007);
                        composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                        c1086gP.T(false);
                    }
                    f11 = f12;
                    pVar4 = pVar7;
                    i37 = i38;
                    pVar6 = pVar9;
                    j15 = jB;
                    j17 = j20;
                    qVar5 = qVar8;
                    z14 = z16;
                    m10 = mD;
                    qVar4 = qVar6;
                    j16 = jA;
                    j18 = jB2;
                    z13 = z17;
                    hVar2 = hVar3;
                    pVar5 = pVar8;
                    l0Var2 = l0Var3;
                    j14 = j19;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    m10 = m7;
                    pVar4 = pVar;
                    pVar5 = pVar2;
                    qVar4 = qVar;
                    pVar6 = pVar3;
                    i37 = i10;
                    z13 = z10;
                    qVar5 = qVar2;
                    z14 = z11;
                    l0Var2 = l0Var;
                    f11 = f10;
                    j14 = j;
                    j15 = j10;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 24576;
            i20 = i13 & 32;
            if (i20 != 0) {
                i14 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i14 |= i21;
            }
            i22 = i13 & 64;
            if (i22 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c1086gP.k(pVar3)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i14 |= i23;
            }
            i24 = i13 & 128;
            if (i24 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (c1086gP.h(i10)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            i26 = i13 & 256;
            if (i26 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c1086gP.c(z10)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i14 |= i27;
            }
            i28 = i13 & 512;
            if (i28 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (c1086gP.k(qVar2)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i14 |= i29;
            }
            i30 = i13 & 1024;
            if (i30 != 0) {
                i31 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (c1086gP.c(z11)) {
                    i32 = 4;
                } else {
                    i32 = 2;
                }
                i31 = i12 | i32;
            } else {
                i31 = i12;
            }
            if ((i12 & 48) != 0) {
                i31 |= ((i13 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
            }
            i33 = i31;
            i34 = i13 & 4096;
            if (i34 != 0) {
                if ((i12 & 384) == 0) {
                    if (c1086gP.g(f10)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i33 |= i35;
                }
                if ((i12 & 3072) != 0) {
                    if ((i13 & 8192) == 0) {
                        i16 = 2048;
                    }
                    i33 |= i16;
                }
                if ((i12 & 24576) != 0) {
                    i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
                }
                if ((i12 & 196608) != 0) {
                    if ((i13 & 32768) == 0) {
                        i41 = 65536;
                    } else {
                        i41 = 65536;
                    }
                    i33 |= i41;
                }
                if ((i12 & 1572864) != 0) {
                    i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
                }
                if ((i12 & 12582912) != 0) {
                    if ((i13 & 131072) == 0) {
                        i40 = 4194304;
                    } else {
                        i40 = 4194304;
                    }
                    i33 |= i40;
                }
                if ((i13 & 262144) != 0) {
                    i33 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (c1086gP.k(qVar3)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i33 |= i36;
                }
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c1086gP.C(i14 & 1, z12)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i42 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 4) != 0) {
                            mD = d(c1086gP);
                            i14 &= -897;
                        } else {
                            mD = m7;
                        }
                        if (i15 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                        } else {
                            pVar7 = pVar;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                        } else {
                            pVar8 = pVar2;
                        }
                        if (i20 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i22 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i24 != 0) {
                            i38 = 2;
                        } else {
                            i38 = i10;
                        }
                        if (i26 != 0) {
                            z15 = false;
                        } else {
                            z15 = z10;
                        }
                        if (i28 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i30 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 2048) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i33 &= -113;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if (i34 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        i39 = i14;
                        if ((i13 & 8192) != 0) {
                            i33 &= -7169;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar116 = qVar7;
                        if ((i13 & 16384) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i33 &= -57345;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 32768) != 0) {
                            jA = w.a(c1086gP);
                            i33 &= -458753;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 65536) != 0) {
                            i33 = (-3670017) & i33;
                            long j2114 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j2114;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 131072) != 0) {
                            i33 &= -29360129;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                        } else {
                            jB2 = j13;
                        }
                        j20 = jA2;
                        z17 = z15;
                        qVar8 = qVar116;
                    } else {
                        if (i42 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 4) != 0) {
                            mD = d(c1086gP);
                            i14 &= -897;
                        } else {
                            mD = m7;
                        }
                        if (i15 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                        } else {
                            pVar7 = pVar;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                        } else {
                            pVar8 = pVar2;
                        }
                        if (i20 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i22 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i24 != 0) {
                            i38 = 2;
                        } else {
                            i38 = i10;
                        }
                        if (i26 != 0) {
                            z15 = false;
                        } else {
                            z15 = z10;
                        }
                        if (i28 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i30 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 2048) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i33 &= -113;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if (i34 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        i39 = i14;
                        if ((i13 & 8192) != 0) {
                            i33 &= -7169;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar117 = qVar7;
                        if ((i13 & 16384) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i33 &= -57345;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 32768) != 0) {
                            jA = w.a(c1086gP);
                            i33 &= -458753;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 65536) != 0) {
                            i33 = (-3670017) & i33;
                            long j2115 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j2115;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 131072) != 0) {
                            i33 &= -29360129;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                        } else {
                            jB2 = j13;
                        }
                        j20 = jA2;
                        z17 = z15;
                        qVar8 = qVar117;
                    }
                    c1086gP.U();
                    if ((i39 & 14) == 4) {
                    }
                    objF = c1086gP.f();
                    if (z18) {
                        objF = new G(a0Var);
                        c1086gP.E(objF);
                    } else {
                        objF = new G(a0Var);
                        c1086gP.E(objF);
                    }
                    final G g16 = (G) objF;
                    final long j2116 = j20;
                    final long j2117 = jB2;
                    final boolean z115 = z17;
                    final int i415 = i38;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar118 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar119 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1110 = pVar8;
                    final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar118 = qVar6;
                    final M m17 = mD;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // Ia.q
                        public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                            androidx.compose.ui.h hVar5 = hVar4;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                            }
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                boolean zK = interfaceC1084f3.K(g16) | interfaceC1084f3.K(a0Var);
                                final G g17 = g16;
                                final a0 a0Var2 = a0Var;
                                Object objF2 = interfaceC1084f3.f();
                                if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                    objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(a0 a0Var3) {
                                            G g18 = g17;
                                            g18.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF2);
                                }
                                androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                                long j2118 = j2116;
                                long j2119 = j2117;
                                final boolean z20 = z115;
                                final int i416 = i415;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111 = pVar118;
                                final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar119 = qVar3;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1112 = pVar119;
                                final G g18 = g16;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1113 = pVar1110;
                                final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1110 = qVar118;
                                final M m18 = m17;
                                SurfaceKt.a(hVarB, null, j2118, j2119, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                            boolean z21 = z20;
                                            int i417 = i416;
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar1114 = pVar1111;
                                            Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar1111 = qVar119;
                                            final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1112 = qVar1110;
                                            final M m19 = m18;
                                            ScaffoldKt.c(z21, i417, pVar1114, qVar1111, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                        qVar1112.invoke(m19.f11773b, interfaceC1084f7, 0);
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), pVar1112, g18, pVar1113, interfaceC1084f5, 24576);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    if (qVar8 != null) {
                        c1086gP.L(651765711);
                        int i416 = i33 << 9;
                        DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i416 & 7168) | (57344 & i416) | (458752 & i416) | (3670016 & i416) | (29360128 & i416) | (i416 & 234881024), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(652256007);
                        composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                        c1086gP.T(false);
                    }
                    f11 = f12;
                    pVar4 = pVar7;
                    i37 = i38;
                    pVar6 = pVar9;
                    j15 = jB;
                    j17 = j20;
                    qVar5 = qVar8;
                    z14 = z16;
                    m10 = mD;
                    qVar4 = qVar6;
                    j16 = jA;
                    j18 = jB2;
                    z13 = z17;
                    hVar2 = hVar3;
                    pVar5 = pVar8;
                    l0Var2 = l0Var3;
                    j14 = j19;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    m10 = m7;
                    pVar4 = pVar;
                    pVar5 = pVar2;
                    qVar4 = qVar;
                    pVar6 = pVar3;
                    i37 = i10;
                    z13 = z10;
                    qVar5 = qVar2;
                    z14 = z11;
                    l0Var2 = l0Var;
                    f11 = f10;
                    j14 = j;
                    j15 = j10;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i33 |= 384;
            if ((i12 & 3072) != 0) {
                if ((i13 & 8192) == 0) {
                    i16 = 2048;
                }
                i33 |= i16;
            }
            if ((i12 & 24576) != 0) {
                i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
            }
            if ((i12 & 196608) != 0) {
                if ((i13 & 32768) == 0) {
                    i41 = 65536;
                } else {
                    i41 = 65536;
                }
                i33 |= i41;
            }
            if ((i12 & 1572864) != 0) {
                i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
            }
            if ((i12 & 12582912) != 0) {
                if ((i13 & 131072) == 0) {
                    i40 = 4194304;
                } else {
                    i40 = 4194304;
                }
                i33 |= i40;
            }
            if ((i13 & 262144) != 0) {
                i33 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (c1086gP.k(qVar3)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i33 |= i36;
            }
            if ((i14 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c1086gP.C(i14 & 1, z12)) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i42 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i13 & 4) != 0) {
                        mD = d(c1086gP);
                        i14 &= -897;
                    } else {
                        mD = m7;
                    }
                    if (i15 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                    } else {
                        pVar7 = pVar;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                    } else {
                        pVar8 = pVar2;
                    }
                    if (i20 != 0) {
                        qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                    } else {
                        qVar6 = qVar;
                    }
                    if (i22 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i24 != 0) {
                        i38 = 2;
                    } else {
                        i38 = i10;
                    }
                    if (i26 != 0) {
                        z15 = false;
                    } else {
                        z15 = z10;
                    }
                    if (i28 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar2;
                    }
                    if (i30 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if ((i13 & 2048) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        i33 &= -113;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if (i34 != 0) {
                        f12 = w.f12028a;
                    } else {
                        f12 = f10;
                    }
                    i39 = i14;
                    if ((i13 & 8192) != 0) {
                        i33 &= -7169;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar119 = qVar7;
                    if ((i13 & 16384) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i33 &= -57345;
                    } else {
                        jB = j10;
                    }
                    if ((i13 & 32768) != 0) {
                        jA = w.a(c1086gP);
                        i33 &= -458753;
                    } else {
                        jA = j11;
                    }
                    if ((i13 & 65536) != 0) {
                        i33 = (-3670017) & i33;
                        long j2118 = jH;
                        jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                        j19 = j2118;
                    } else {
                        j19 = jH;
                        jA2 = j12;
                    }
                    if ((i13 & 131072) != 0) {
                        i33 &= -29360129;
                        jB2 = ColorsKt.b(jA2, c1086gP);
                    } else {
                        jB2 = j13;
                    }
                    j20 = jA2;
                    z17 = z15;
                    qVar8 = qVar119;
                } else {
                    if (i42 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i13 & 4) != 0) {
                        mD = d(c1086gP);
                        i14 &= -897;
                    } else {
                        mD = m7;
                    }
                    if (i15 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                    } else {
                        pVar7 = pVar;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                    } else {
                        pVar8 = pVar2;
                    }
                    if (i20 != 0) {
                        qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                    } else {
                        qVar6 = qVar;
                    }
                    if (i22 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i24 != 0) {
                        i38 = 2;
                    } else {
                        i38 = i10;
                    }
                    if (i26 != 0) {
                        z15 = false;
                    } else {
                        z15 = z10;
                    }
                    if (i28 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar2;
                    }
                    if (i30 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if ((i13 & 2048) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        i33 &= -113;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if (i34 != 0) {
                        f12 = w.f12028a;
                    } else {
                        f12 = f10;
                    }
                    i39 = i14;
                    if ((i13 & 8192) != 0) {
                        i33 &= -7169;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1110 = qVar7;
                    if ((i13 & 16384) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i33 &= -57345;
                    } else {
                        jB = j10;
                    }
                    if ((i13 & 32768) != 0) {
                        jA = w.a(c1086gP);
                        i33 &= -458753;
                    } else {
                        jA = j11;
                    }
                    if ((i13 & 65536) != 0) {
                        i33 = (-3670017) & i33;
                        long j2119 = jH;
                        jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                        j19 = j2119;
                    } else {
                        j19 = jH;
                        jA2 = j12;
                    }
                    if ((i13 & 131072) != 0) {
                        i33 &= -29360129;
                        jB2 = ColorsKt.b(jA2, c1086gP);
                    } else {
                        jB2 = j13;
                    }
                    j20 = jA2;
                    z17 = z15;
                    qVar8 = qVar1110;
                }
                c1086gP.U();
                if ((i39 & 14) == 4) {
                }
                objF = c1086gP.f();
                if (z18) {
                    objF = new G(a0Var);
                    c1086gP.E(objF);
                } else {
                    objF = new G(a0Var);
                    c1086gP.E(objF);
                }
                final G g17 = (G) objF;
                final long j21110 = j20;
                final long j21111 = jB2;
                final boolean z116 = z17;
                final int i417 = i38;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111 = pVar7;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1112 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1113 = pVar8;
                final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1111 = qVar6;
                final M m18 = mD;
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                        androidx.compose.ui.h hVar5 = hVar4;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                        }
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                            boolean zK = interfaceC1084f3.K(g17) | interfaceC1084f3.K(a0Var);
                            final G g18 = g17;
                            final a0 a0Var2 = a0Var;
                            Object objF2 = interfaceC1084f3.f();
                            if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(a0 a0Var3) {
                                        G g19 = g18;
                                        g19.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF2);
                            }
                            androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                            long j21112 = j21110;
                            long j21113 = j21111;
                            final boolean z20 = z116;
                            final int i418 = i417;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1114 = pVar1111;
                            final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1112 = qVar3;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1115 = pVar1112;
                            final G g19 = g17;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1116 = pVar1113;
                            final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1113 = qVar1111;
                            final M m19 = m18;
                            SurfaceKt.a(hVarB, null, j21112, j21113, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                        boolean z21 = z20;
                                        int i419 = i418;
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar1117 = pVar1114;
                                        Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar1114 = qVar1112;
                                        final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1115 = qVar1113;
                                        final M m110 = m19;
                                        ScaffoldKt.c(z21, i419, pVar1117, qVar1114, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                    qVar1115.invoke(m110.f11773b, interfaceC1084f7, 0);
                                                } else {
                                                    interfaceC1084f7.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f5), pVar1115, g19, pVar1116, interfaceC1084f5, 24576);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                if (qVar8 != null) {
                    c1086gP.L(651765711);
                    int i418 = i33 << 9;
                    DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i418 & 7168) | (57344 & i418) | (458752 & i418) | (3670016 & i418) | (29360128 & i418) | (i418 & 234881024), 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(652256007);
                    composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                    c1086gP.T(false);
                }
                f11 = f12;
                pVar4 = pVar7;
                i37 = i38;
                pVar6 = pVar9;
                j15 = jB;
                j17 = j20;
                qVar5 = qVar8;
                z14 = z16;
                m10 = mD;
                qVar4 = qVar6;
                j16 = jA;
                j18 = jB2;
                z13 = z17;
                hVar2 = hVar3;
                pVar5 = pVar8;
                l0Var2 = l0Var3;
                j14 = j19;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                m10 = m7;
                pVar4 = pVar;
                pVar5 = pVar2;
                qVar4 = qVar;
                pVar6 = pVar3;
                i37 = i10;
                z13 = z10;
                qVar5 = qVar2;
                z14 = z11;
                l0Var2 = l0Var;
                f11 = f10;
                j14 = j;
                j15 = j10;
                j16 = j11;
                j17 = j12;
                j18 = j13;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 48;
        if ((i11 & 384) != 0) {
            i14 |= ((i13 & 4) == 0 || !c1086gP.K(m7)) ? 128 : 256;
        }
        i15 = i13 & 8;
        i16 = 1024;
        if (i15 != 0) {
            if ((i11 & 3072) == 0) {
                if (c1086gP.k(pVar)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i14 |= i17;
            }
            i18 = i13 & 16;
            if (i18 != 0) {
                if ((i11 & 24576) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i14 |= i19;
                }
                i20 = i13 & 32;
                if (i20 != 0) {
                    i14 |= 196608;
                } else if ((i11 & 196608) == 0) {
                    if (c1086gP.k(qVar)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 64;
                if (i22 != 0) {
                    i14 |= 1572864;
                } else if ((i11 & 1572864) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i23 = 1048576;
                    } else {
                        i23 = 524288;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 128;
                if (i24 != 0) {
                    i14 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    if (c1086gP.h(i10)) {
                        i25 = 8388608;
                    } else {
                        i25 = 4194304;
                    }
                    i14 |= i25;
                }
                i26 = i13 & 256;
                if (i26 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    if (c1086gP.c(z10)) {
                        i27 = 67108864;
                    } else {
                        i27 = 33554432;
                    }
                    i14 |= i27;
                }
                i28 = i13 & 512;
                if (i28 != 0) {
                    i14 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    if (c1086gP.k(qVar2)) {
                        i29 = 536870912;
                    } else {
                        i29 = 268435456;
                    }
                    i14 |= i29;
                }
                i30 = i13 & 1024;
                if (i30 != 0) {
                    i31 = i12 | 6;
                } else if ((i12 & 6) == 0) {
                    if (c1086gP.c(z11)) {
                        i32 = 4;
                    } else {
                        i32 = 2;
                    }
                    i31 = i12 | i32;
                } else {
                    i31 = i12;
                }
                if ((i12 & 48) != 0) {
                    i31 |= ((i13 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                }
                i33 = i31;
                i34 = i13 & 4096;
                if (i34 != 0) {
                    if ((i12 & 384) == 0) {
                        if (c1086gP.g(f10)) {
                            i35 = 256;
                        } else {
                            i35 = 128;
                        }
                        i33 |= i35;
                    }
                    if ((i12 & 3072) != 0) {
                        if ((i13 & 8192) == 0) {
                            i16 = 2048;
                        }
                        i33 |= i16;
                    }
                    if ((i12 & 24576) != 0) {
                        i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
                    }
                    if ((i12 & 196608) != 0) {
                        if ((i13 & 32768) == 0) {
                            i41 = 65536;
                        } else {
                            i41 = 65536;
                        }
                        i33 |= i41;
                    }
                    if ((i12 & 1572864) != 0) {
                        i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
                    }
                    if ((i12 & 12582912) != 0) {
                        if ((i13 & 131072) == 0) {
                            i40 = 4194304;
                        } else {
                            i40 = 4194304;
                        }
                        i33 |= i40;
                    }
                    if ((i13 & 262144) != 0) {
                        i33 |= 100663296;
                    } else if ((i12 & 100663296) == 0) {
                        if (c1086gP.k(qVar3)) {
                            i36 = 67108864;
                        } else {
                            i36 = 33554432;
                        }
                        i33 |= i36;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        z12 = true;
                    } else {
                        z12 = true;
                    }
                    if (c1086gP.C(i14 & 1, z12)) {
                        c1086gP.r0();
                        if ((i11 & 1) != 0) {
                            if (i42 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i13 & 4) != 0) {
                                mD = d(c1086gP);
                                i14 &= -897;
                            } else {
                                mD = m7;
                            }
                            if (i15 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                            } else {
                                pVar7 = pVar;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                            } else {
                                pVar8 = pVar2;
                            }
                            if (i20 != 0) {
                                qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                            } else {
                                qVar6 = qVar;
                            }
                            if (i22 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i24 != 0) {
                                i38 = 2;
                            } else {
                                i38 = i10;
                            }
                            if (i26 != 0) {
                                z15 = false;
                            } else {
                                z15 = z10;
                            }
                            if (i28 != 0) {
                                qVar7 = null;
                            } else {
                                qVar7 = qVar2;
                            }
                            if (i30 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                            if ((i13 & 2048) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                                i33 &= -113;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if (i34 != 0) {
                                f12 = w.f12028a;
                            } else {
                                f12 = f10;
                            }
                            i39 = i14;
                            if ((i13 & 8192) != 0) {
                                i33 &= -7169;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1112 = qVar7;
                            if ((i13 & 16384) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i33 &= -57345;
                            } else {
                                jB = j10;
                            }
                            if ((i13 & 32768) != 0) {
                                jA = w.a(c1086gP);
                                i33 &= -458753;
                            } else {
                                jA = j11;
                            }
                            if ((i13 & 65536) != 0) {
                                i33 = (-3670017) & i33;
                                long j21112 = jH;
                                jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                                j19 = j21112;
                            } else {
                                j19 = jH;
                                jA2 = j12;
                            }
                            if ((i13 & 131072) != 0) {
                                i33 &= -29360129;
                                jB2 = ColorsKt.b(jA2, c1086gP);
                            } else {
                                jB2 = j13;
                            }
                            j20 = jA2;
                            z17 = z15;
                            qVar8 = qVar1112;
                        } else {
                            if (i42 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if ((i13 & 4) != 0) {
                                mD = d(c1086gP);
                                i14 &= -897;
                            } else {
                                mD = m7;
                            }
                            if (i15 != 0) {
                                pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                            } else {
                                pVar7 = pVar;
                            }
                            if (i18 != 0) {
                                pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                            } else {
                                pVar8 = pVar2;
                            }
                            if (i20 != 0) {
                                qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                            } else {
                                qVar6 = qVar;
                            }
                            if (i22 != 0) {
                                pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                            } else {
                                pVar9 = pVar3;
                            }
                            if (i24 != 0) {
                                i38 = 2;
                            } else {
                                i38 = i10;
                            }
                            if (i26 != 0) {
                                z15 = false;
                            } else {
                                z15 = z10;
                            }
                            if (i28 != 0) {
                                qVar7 = null;
                            } else {
                                qVar7 = qVar2;
                            }
                            if (i30 != 0) {
                                z16 = true;
                            } else {
                                z16 = z11;
                            }
                            if ((i13 & 2048) != 0) {
                                l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                                i33 &= -113;
                            } else {
                                l0Var3 = l0Var;
                            }
                            if (i34 != 0) {
                                f12 = w.f12028a;
                            } else {
                                f12 = f10;
                            }
                            i39 = i14;
                            if ((i13 & 8192) != 0) {
                                i33 &= -7169;
                                jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                            } else {
                                jH = j;
                            }
                            Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1113 = qVar7;
                            if ((i13 & 16384) != 0) {
                                jB = ColorsKt.b(jH, c1086gP);
                                i33 &= -57345;
                            } else {
                                jB = j10;
                            }
                            if ((i13 & 32768) != 0) {
                                jA = w.a(c1086gP);
                                i33 &= -458753;
                            } else {
                                jA = j11;
                            }
                            if ((i13 & 65536) != 0) {
                                i33 = (-3670017) & i33;
                                long j21113 = jH;
                                jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                                j19 = j21113;
                            } else {
                                j19 = jH;
                                jA2 = j12;
                            }
                            if ((i13 & 131072) != 0) {
                                i33 &= -29360129;
                                jB2 = ColorsKt.b(jA2, c1086gP);
                            } else {
                                jB2 = j13;
                            }
                            j20 = jA2;
                            z17 = z15;
                            qVar8 = qVar1113;
                        }
                        c1086gP.U();
                        if ((i39 & 14) == 4) {
                        }
                        objF = c1086gP.f();
                        if (z18) {
                            objF = new G(a0Var);
                            c1086gP.E(objF);
                        } else {
                            objF = new G(a0Var);
                            c1086gP.E(objF);
                        }
                        final G g18 = (G) objF;
                        final long j21114 = j20;
                        final long j21115 = jB2;
                        final boolean z117 = z17;
                        final int i419 = i38;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1114 = pVar7;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1115 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1116 = pVar8;
                        final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1114 = qVar6;
                        final M m19 = mD;
                        composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // Ia.q
                            public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                                androidx.compose.ui.h hVar5 = hVar4;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                                }
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    boolean zK = interfaceC1084f3.K(g18) | interfaceC1084f3.K(a0Var);
                                    final G g19 = g18;
                                    final a0 a0Var2 = a0Var;
                                    Object objF2 = interfaceC1084f3.f();
                                    if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                        objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // Ia.l
                                            public final p293xa.r invoke(a0 a0Var3) {
                                                G g110 = g19;
                                                g110.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                                return p293xa.r.f47939a;
                                            }
                                        };
                                        interfaceC1084f3.E(objF2);
                                    }
                                    androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                                    long j21116 = j21114;
                                    long j21117 = j21115;
                                    final boolean z20 = z117;
                                    final int i4110 = i419;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1117 = pVar1114;
                                    final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1115 = qVar3;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1118 = pVar1115;
                                    final G g110 = g18;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1119 = pVar1116;
                                    final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1116 = qVar1114;
                                    final M m110 = m19;
                                    SurfaceKt.a(hVarB, null, j21116, j21117, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                                boolean z21 = z20;
                                                int i4111 = i4110;
                                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11110 = pVar1117;
                                                Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar1117 = qVar1115;
                                                final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1118 = qVar1116;
                                                final M m111 = m110;
                                                ScaffoldKt.c(z21, i4111, pVar11110, qVar1117, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                            qVar1118.invoke(m111.f11773b, interfaceC1084f7, 0);
                                                        } else {
                                                            interfaceC1084f7.w();
                                                        }
                                                        return p293xa.r.f47939a;
                                                    }
                                                }, interfaceC1084f5), pVar1118, g110, pVar1119, interfaceC1084f5, 24576);
                                            } else {
                                                interfaceC1084f5.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP);
                        if (qVar8 != null) {
                            c1086gP.L(651765711);
                            int i4110 = i33 << 9;
                            DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i4110 & 7168) | (57344 & i4110) | (458752 & i4110) | (3670016 & i4110) | (29360128 & i4110) | (i4110 & 234881024), 0);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(652256007);
                            composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                            c1086gP.T(false);
                        }
                        f11 = f12;
                        pVar4 = pVar7;
                        i37 = i38;
                        pVar6 = pVar9;
                        j15 = jB;
                        j17 = j20;
                        qVar5 = qVar8;
                        z14 = z16;
                        m10 = mD;
                        qVar4 = qVar6;
                        j16 = jA;
                        j18 = jB2;
                        z13 = z17;
                        hVar2 = hVar3;
                        pVar5 = pVar8;
                        l0Var2 = l0Var3;
                        j14 = j19;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        m10 = m7;
                        pVar4 = pVar;
                        pVar5 = pVar2;
                        qVar4 = qVar;
                        pVar6 = pVar3;
                        i37 = i10;
                        z13 = z10;
                        qVar5 = qVar2;
                        z14 = z11;
                        l0Var2 = l0Var;
                        f11 = f10;
                        j14 = j;
                        j15 = j10;
                        j16 = j11;
                        j17 = j12;
                        j18 = j13;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i33 |= 384;
                if ((i12 & 3072) != 0) {
                    if ((i13 & 8192) == 0) {
                        i16 = 2048;
                    }
                    i33 |= i16;
                }
                if ((i12 & 24576) != 0) {
                    i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
                }
                if ((i12 & 196608) != 0) {
                    if ((i13 & 32768) == 0) {
                        i41 = 65536;
                    } else {
                        i41 = 65536;
                    }
                    i33 |= i41;
                }
                if ((i12 & 1572864) != 0) {
                    i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
                }
                if ((i12 & 12582912) != 0) {
                    if ((i13 & 131072) == 0) {
                        i40 = 4194304;
                    } else {
                        i40 = 4194304;
                    }
                    i33 |= i40;
                }
                if ((i13 & 262144) != 0) {
                    i33 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (c1086gP.k(qVar3)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i33 |= i36;
                }
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c1086gP.C(i14 & 1, z12)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i42 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 4) != 0) {
                            mD = d(c1086gP);
                            i14 &= -897;
                        } else {
                            mD = m7;
                        }
                        if (i15 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                        } else {
                            pVar7 = pVar;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                        } else {
                            pVar8 = pVar2;
                        }
                        if (i20 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i22 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i24 != 0) {
                            i38 = 2;
                        } else {
                            i38 = i10;
                        }
                        if (i26 != 0) {
                            z15 = false;
                        } else {
                            z15 = z10;
                        }
                        if (i28 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i30 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 2048) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i33 &= -113;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if (i34 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        i39 = i14;
                        if ((i13 & 8192) != 0) {
                            i33 &= -7169;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1115 = qVar7;
                        if ((i13 & 16384) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i33 &= -57345;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 32768) != 0) {
                            jA = w.a(c1086gP);
                            i33 &= -458753;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 65536) != 0) {
                            i33 = (-3670017) & i33;
                            long j21116 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j21116;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 131072) != 0) {
                            i33 &= -29360129;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                        } else {
                            jB2 = j13;
                        }
                        j20 = jA2;
                        z17 = z15;
                        qVar8 = qVar1115;
                    } else {
                        if (i42 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 4) != 0) {
                            mD = d(c1086gP);
                            i14 &= -897;
                        } else {
                            mD = m7;
                        }
                        if (i15 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                        } else {
                            pVar7 = pVar;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                        } else {
                            pVar8 = pVar2;
                        }
                        if (i20 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i22 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i24 != 0) {
                            i38 = 2;
                        } else {
                            i38 = i10;
                        }
                        if (i26 != 0) {
                            z15 = false;
                        } else {
                            z15 = z10;
                        }
                        if (i28 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i30 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 2048) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i33 &= -113;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if (i34 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        i39 = i14;
                        if ((i13 & 8192) != 0) {
                            i33 &= -7169;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1116 = qVar7;
                        if ((i13 & 16384) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i33 &= -57345;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 32768) != 0) {
                            jA = w.a(c1086gP);
                            i33 &= -458753;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 65536) != 0) {
                            i33 = (-3670017) & i33;
                            long j21117 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j21117;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 131072) != 0) {
                            i33 &= -29360129;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                        } else {
                            jB2 = j13;
                        }
                        j20 = jA2;
                        z17 = z15;
                        qVar8 = qVar1116;
                    }
                    c1086gP.U();
                    if ((i39 & 14) == 4) {
                    }
                    objF = c1086gP.f();
                    if (z18) {
                        objF = new G(a0Var);
                        c1086gP.E(objF);
                    } else {
                        objF = new G(a0Var);
                        c1086gP.E(objF);
                    }
                    final G g19 = (G) objF;
                    final long j21118 = j20;
                    final long j21119 = jB2;
                    final boolean z118 = z17;
                    final int i4111 = i38;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1117 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1118 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1119 = pVar8;
                    final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1117 = qVar6;
                    final M m110 = mD;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // Ia.q
                        public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                            androidx.compose.ui.h hVar5 = hVar4;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                            }
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                boolean zK = interfaceC1084f3.K(g19) | interfaceC1084f3.K(a0Var);
                                final G g110 = g19;
                                final a0 a0Var2 = a0Var;
                                Object objF2 = interfaceC1084f3.f();
                                if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                    objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(a0 a0Var3) {
                                            G g111 = g110;
                                            g111.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF2);
                                }
                                androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                                long j211110 = j21118;
                                long j211111 = j21119;
                                final boolean z20 = z118;
                                final int i4112 = i4111;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11110 = pVar1117;
                                final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1118 = qVar3;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111 = pVar1118;
                                final G g111 = g19;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11112 = pVar1119;
                                final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1119 = qVar1117;
                                final M m111 = m110;
                                SurfaceKt.a(hVarB, null, j211110, j211111, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                            boolean z21 = z20;
                                            int i4113 = i4112;
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11113 = pVar11110;
                                            Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar11110 = qVar1118;
                                            final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11111 = qVar1119;
                                            final M m112 = m111;
                                            ScaffoldKt.c(z21, i4113, pVar11113, qVar11110, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                        qVar11111.invoke(m112.f11773b, interfaceC1084f7, 0);
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), pVar11111, g111, pVar11112, interfaceC1084f5, 24576);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    if (qVar8 != null) {
                        c1086gP.L(651765711);
                        int i4112 = i33 << 9;
                        DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i4112 & 7168) | (57344 & i4112) | (458752 & i4112) | (3670016 & i4112) | (29360128 & i4112) | (i4112 & 234881024), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(652256007);
                        composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                        c1086gP.T(false);
                    }
                    f11 = f12;
                    pVar4 = pVar7;
                    i37 = i38;
                    pVar6 = pVar9;
                    j15 = jB;
                    j17 = j20;
                    qVar5 = qVar8;
                    z14 = z16;
                    m10 = mD;
                    qVar4 = qVar6;
                    j16 = jA;
                    j18 = jB2;
                    z13 = z17;
                    hVar2 = hVar3;
                    pVar5 = pVar8;
                    l0Var2 = l0Var3;
                    j14 = j19;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    m10 = m7;
                    pVar4 = pVar;
                    pVar5 = pVar2;
                    qVar4 = qVar;
                    pVar6 = pVar3;
                    i37 = i10;
                    z13 = z10;
                    qVar5 = qVar2;
                    z14 = z11;
                    l0Var2 = l0Var;
                    f11 = f10;
                    j14 = j;
                    j15 = j10;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i14 |= 24576;
            i20 = i13 & 32;
            if (i20 != 0) {
                i14 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i14 |= i21;
            }
            i22 = i13 & 64;
            if (i22 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c1086gP.k(pVar3)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i14 |= i23;
            }
            i24 = i13 & 128;
            if (i24 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (c1086gP.h(i10)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            i26 = i13 & 256;
            if (i26 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c1086gP.c(z10)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i14 |= i27;
            }
            i28 = i13 & 512;
            if (i28 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (c1086gP.k(qVar2)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i14 |= i29;
            }
            i30 = i13 & 1024;
            if (i30 != 0) {
                i31 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (c1086gP.c(z11)) {
                    i32 = 4;
                } else {
                    i32 = 2;
                }
                i31 = i12 | i32;
            } else {
                i31 = i12;
            }
            if ((i12 & 48) != 0) {
                i31 |= ((i13 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
            }
            i33 = i31;
            i34 = i13 & 4096;
            if (i34 != 0) {
                if ((i12 & 384) == 0) {
                    if (c1086gP.g(f10)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i33 |= i35;
                }
                if ((i12 & 3072) != 0) {
                    if ((i13 & 8192) == 0) {
                        i16 = 2048;
                    }
                    i33 |= i16;
                }
                if ((i12 & 24576) != 0) {
                    i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
                }
                if ((i12 & 196608) != 0) {
                    if ((i13 & 32768) == 0) {
                        i41 = 65536;
                    } else {
                        i41 = 65536;
                    }
                    i33 |= i41;
                }
                if ((i12 & 1572864) != 0) {
                    i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
                }
                if ((i12 & 12582912) != 0) {
                    if ((i13 & 131072) == 0) {
                        i40 = 4194304;
                    } else {
                        i40 = 4194304;
                    }
                    i33 |= i40;
                }
                if ((i13 & 262144) != 0) {
                    i33 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (c1086gP.k(qVar3)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i33 |= i36;
                }
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c1086gP.C(i14 & 1, z12)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i42 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 4) != 0) {
                            mD = d(c1086gP);
                            i14 &= -897;
                        } else {
                            mD = m7;
                        }
                        if (i15 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                        } else {
                            pVar7 = pVar;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                        } else {
                            pVar8 = pVar2;
                        }
                        if (i20 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i22 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i24 != 0) {
                            i38 = 2;
                        } else {
                            i38 = i10;
                        }
                        if (i26 != 0) {
                            z15 = false;
                        } else {
                            z15 = z10;
                        }
                        if (i28 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i30 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 2048) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i33 &= -113;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if (i34 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        i39 = i14;
                        if ((i13 & 8192) != 0) {
                            i33 &= -7169;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1118 = qVar7;
                        if ((i13 & 16384) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i33 &= -57345;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 32768) != 0) {
                            jA = w.a(c1086gP);
                            i33 &= -458753;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 65536) != 0) {
                            i33 = (-3670017) & i33;
                            long j211110 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j211110;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 131072) != 0) {
                            i33 &= -29360129;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                        } else {
                            jB2 = j13;
                        }
                        j20 = jA2;
                        z17 = z15;
                        qVar8 = qVar1118;
                    } else {
                        if (i42 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 4) != 0) {
                            mD = d(c1086gP);
                            i14 &= -897;
                        } else {
                            mD = m7;
                        }
                        if (i15 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                        } else {
                            pVar7 = pVar;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                        } else {
                            pVar8 = pVar2;
                        }
                        if (i20 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i22 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i24 != 0) {
                            i38 = 2;
                        } else {
                            i38 = i10;
                        }
                        if (i26 != 0) {
                            z15 = false;
                        } else {
                            z15 = z10;
                        }
                        if (i28 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i30 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 2048) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i33 &= -113;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if (i34 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        i39 = i14;
                        if ((i13 & 8192) != 0) {
                            i33 &= -7169;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar1119 = qVar7;
                        if ((i13 & 16384) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i33 &= -57345;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 32768) != 0) {
                            jA = w.a(c1086gP);
                            i33 &= -458753;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 65536) != 0) {
                            i33 = (-3670017) & i33;
                            long j211111 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j211111;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 131072) != 0) {
                            i33 &= -29360129;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                        } else {
                            jB2 = j13;
                        }
                        j20 = jA2;
                        z17 = z15;
                        qVar8 = qVar1119;
                    }
                    c1086gP.U();
                    if ((i39 & 14) == 4) {
                    }
                    objF = c1086gP.f();
                    if (z18) {
                        objF = new G(a0Var);
                        c1086gP.E(objF);
                    } else {
                        objF = new G(a0Var);
                        c1086gP.E(objF);
                    }
                    final G g110 = (G) objF;
                    final long j211112 = j20;
                    final long j211113 = jB2;
                    final boolean z119 = z17;
                    final int i4113 = i38;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11110 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11112 = pVar8;
                    final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11110 = qVar6;
                    final M m111 = mD;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // Ia.q
                        public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                            androidx.compose.ui.h hVar5 = hVar4;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                            }
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                boolean zK = interfaceC1084f3.K(g110) | interfaceC1084f3.K(a0Var);
                                final G g111 = g110;
                                final a0 a0Var2 = a0Var;
                                Object objF2 = interfaceC1084f3.f();
                                if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                    objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(a0 a0Var3) {
                                            G g112 = g111;
                                            g112.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF2);
                                }
                                androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                                long j211114 = j211112;
                                long j211115 = j211113;
                                final boolean z20 = z119;
                                final int i4114 = i4113;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11113 = pVar11110;
                                final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11111 = qVar3;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11114 = pVar11111;
                                final G g112 = g110;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11115 = pVar11112;
                                final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11112 = qVar11110;
                                final M m112 = m111;
                                SurfaceKt.a(hVarB, null, j211114, j211115, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                            boolean z21 = z20;
                                            int i4115 = i4114;
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11116 = pVar11113;
                                            Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar11113 = qVar11111;
                                            final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11114 = qVar11112;
                                            final M m113 = m112;
                                            ScaffoldKt.c(z21, i4115, pVar11116, qVar11113, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                        qVar11114.invoke(m113.f11773b, interfaceC1084f7, 0);
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), pVar11114, g112, pVar11115, interfaceC1084f5, 24576);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    if (qVar8 != null) {
                        c1086gP.L(651765711);
                        int i4114 = i33 << 9;
                        DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i4114 & 7168) | (57344 & i4114) | (458752 & i4114) | (3670016 & i4114) | (29360128 & i4114) | (i4114 & 234881024), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(652256007);
                        composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                        c1086gP.T(false);
                    }
                    f11 = f12;
                    pVar4 = pVar7;
                    i37 = i38;
                    pVar6 = pVar9;
                    j15 = jB;
                    j17 = j20;
                    qVar5 = qVar8;
                    z14 = z16;
                    m10 = mD;
                    qVar4 = qVar6;
                    j16 = jA;
                    j18 = jB2;
                    z13 = z17;
                    hVar2 = hVar3;
                    pVar5 = pVar8;
                    l0Var2 = l0Var3;
                    j14 = j19;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    m10 = m7;
                    pVar4 = pVar;
                    pVar5 = pVar2;
                    qVar4 = qVar;
                    pVar6 = pVar3;
                    i37 = i10;
                    z13 = z10;
                    qVar5 = qVar2;
                    z14 = z11;
                    l0Var2 = l0Var;
                    f11 = f10;
                    j14 = j;
                    j15 = j10;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i33 |= 384;
            if ((i12 & 3072) != 0) {
                if ((i13 & 8192) == 0) {
                    i16 = 2048;
                }
                i33 |= i16;
            }
            if ((i12 & 24576) != 0) {
                i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
            }
            if ((i12 & 196608) != 0) {
                if ((i13 & 32768) == 0) {
                    i41 = 65536;
                } else {
                    i41 = 65536;
                }
                i33 |= i41;
            }
            if ((i12 & 1572864) != 0) {
                i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
            }
            if ((i12 & 12582912) != 0) {
                if ((i13 & 131072) == 0) {
                    i40 = 4194304;
                } else {
                    i40 = 4194304;
                }
                i33 |= i40;
            }
            if ((i13 & 262144) != 0) {
                i33 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (c1086gP.k(qVar3)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i33 |= i36;
            }
            if ((i14 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c1086gP.C(i14 & 1, z12)) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i42 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i13 & 4) != 0) {
                        mD = d(c1086gP);
                        i14 &= -897;
                    } else {
                        mD = m7;
                    }
                    if (i15 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                    } else {
                        pVar7 = pVar;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                    } else {
                        pVar8 = pVar2;
                    }
                    if (i20 != 0) {
                        qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                    } else {
                        qVar6 = qVar;
                    }
                    if (i22 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i24 != 0) {
                        i38 = 2;
                    } else {
                        i38 = i10;
                    }
                    if (i26 != 0) {
                        z15 = false;
                    } else {
                        z15 = z10;
                    }
                    if (i28 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar2;
                    }
                    if (i30 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if ((i13 & 2048) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        i33 &= -113;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if (i34 != 0) {
                        f12 = w.f12028a;
                    } else {
                        f12 = f10;
                    }
                    i39 = i14;
                    if ((i13 & 8192) != 0) {
                        i33 &= -7169;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11111 = qVar7;
                    if ((i13 & 16384) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i33 &= -57345;
                    } else {
                        jB = j10;
                    }
                    if ((i13 & 32768) != 0) {
                        jA = w.a(c1086gP);
                        i33 &= -458753;
                    } else {
                        jA = j11;
                    }
                    if ((i13 & 65536) != 0) {
                        i33 = (-3670017) & i33;
                        long j211114 = jH;
                        jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                        j19 = j211114;
                    } else {
                        j19 = jH;
                        jA2 = j12;
                    }
                    if ((i13 & 131072) != 0) {
                        i33 &= -29360129;
                        jB2 = ColorsKt.b(jA2, c1086gP);
                    } else {
                        jB2 = j13;
                    }
                    j20 = jA2;
                    z17 = z15;
                    qVar8 = qVar11111;
                } else {
                    if (i42 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i13 & 4) != 0) {
                        mD = d(c1086gP);
                        i14 &= -897;
                    } else {
                        mD = m7;
                    }
                    if (i15 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                    } else {
                        pVar7 = pVar;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                    } else {
                        pVar8 = pVar2;
                    }
                    if (i20 != 0) {
                        qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                    } else {
                        qVar6 = qVar;
                    }
                    if (i22 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i24 != 0) {
                        i38 = 2;
                    } else {
                        i38 = i10;
                    }
                    if (i26 != 0) {
                        z15 = false;
                    } else {
                        z15 = z10;
                    }
                    if (i28 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar2;
                    }
                    if (i30 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if ((i13 & 2048) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        i33 &= -113;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if (i34 != 0) {
                        f12 = w.f12028a;
                    } else {
                        f12 = f10;
                    }
                    i39 = i14;
                    if ((i13 & 8192) != 0) {
                        i33 &= -7169;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11112 = qVar7;
                    if ((i13 & 16384) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i33 &= -57345;
                    } else {
                        jB = j10;
                    }
                    if ((i13 & 32768) != 0) {
                        jA = w.a(c1086gP);
                        i33 &= -458753;
                    } else {
                        jA = j11;
                    }
                    if ((i13 & 65536) != 0) {
                        i33 = (-3670017) & i33;
                        long j211115 = jH;
                        jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                        j19 = j211115;
                    } else {
                        j19 = jH;
                        jA2 = j12;
                    }
                    if ((i13 & 131072) != 0) {
                        i33 &= -29360129;
                        jB2 = ColorsKt.b(jA2, c1086gP);
                    } else {
                        jB2 = j13;
                    }
                    j20 = jA2;
                    z17 = z15;
                    qVar8 = qVar11112;
                }
                c1086gP.U();
                if ((i39 & 14) == 4) {
                }
                objF = c1086gP.f();
                if (z18) {
                    objF = new G(a0Var);
                    c1086gP.E(objF);
                } else {
                    objF = new G(a0Var);
                    c1086gP.E(objF);
                }
                final G g111 = (G) objF;
                final long j211116 = j20;
                final long j211117 = jB2;
                final boolean z1110 = z17;
                final int i4115 = i38;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11113 = pVar7;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11114 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11115 = pVar8;
                final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11113 = qVar6;
                final M m112 = mD;
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                        androidx.compose.ui.h hVar5 = hVar4;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                        }
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                            boolean zK = interfaceC1084f3.K(g111) | interfaceC1084f3.K(a0Var);
                            final G g112 = g111;
                            final a0 a0Var2 = a0Var;
                            Object objF2 = interfaceC1084f3.f();
                            if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(a0 a0Var3) {
                                        G g113 = g112;
                                        g113.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF2);
                            }
                            androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                            long j211118 = j211116;
                            long j211119 = j211117;
                            final boolean z20 = z1110;
                            final int i4116 = i4115;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11116 = pVar11113;
                            final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11114 = qVar3;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11117 = pVar11114;
                            final G g113 = g111;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11118 = pVar11115;
                            final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11115 = qVar11113;
                            final M m113 = m112;
                            SurfaceKt.a(hVarB, null, j211118, j211119, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                        boolean z21 = z20;
                                        int i4117 = i4116;
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11119 = pVar11116;
                                        Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar11116 = qVar11114;
                                        final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11117 = qVar11115;
                                        final M m114 = m113;
                                        ScaffoldKt.c(z21, i4117, pVar11119, qVar11116, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                    qVar11117.invoke(m114.f11773b, interfaceC1084f7, 0);
                                                } else {
                                                    interfaceC1084f7.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f5), pVar11117, g113, pVar11118, interfaceC1084f5, 24576);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                if (qVar8 != null) {
                    c1086gP.L(651765711);
                    int i4116 = i33 << 9;
                    DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i4116 & 7168) | (57344 & i4116) | (458752 & i4116) | (3670016 & i4116) | (29360128 & i4116) | (i4116 & 234881024), 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(652256007);
                    composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                    c1086gP.T(false);
                }
                f11 = f12;
                pVar4 = pVar7;
                i37 = i38;
                pVar6 = pVar9;
                j15 = jB;
                j17 = j20;
                qVar5 = qVar8;
                z14 = z16;
                m10 = mD;
                qVar4 = qVar6;
                j16 = jA;
                j18 = jB2;
                z13 = z17;
                hVar2 = hVar3;
                pVar5 = pVar8;
                l0Var2 = l0Var3;
                j14 = j19;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                m10 = m7;
                pVar4 = pVar;
                pVar5 = pVar2;
                qVar4 = qVar;
                pVar6 = pVar3;
                i37 = i10;
                z13 = z10;
                qVar5 = qVar2;
                z14 = z11;
                l0Var2 = l0Var;
                f11 = f10;
                j14 = j;
                j15 = j10;
                j16 = j11;
                j17 = j12;
                j18 = j13;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 3072;
        i18 = i13 & 16;
        if (i18 != 0) {
            if ((i11 & 24576) == 0) {
                if (c1086gP.k(pVar2)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i14 |= i19;
            }
            i20 = i13 & 32;
            if (i20 != 0) {
                i14 |= 196608;
            } else if ((i11 & 196608) == 0) {
                if (c1086gP.k(qVar)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i14 |= i21;
            }
            i22 = i13 & 64;
            if (i22 != 0) {
                i14 |= 1572864;
            } else if ((i11 & 1572864) == 0) {
                if (c1086gP.k(pVar3)) {
                    i23 = 1048576;
                } else {
                    i23 = 524288;
                }
                i14 |= i23;
            }
            i24 = i13 & 128;
            if (i24 != 0) {
                i14 |= 12582912;
            } else if ((i11 & 12582912) == 0) {
                if (c1086gP.h(i10)) {
                    i25 = 8388608;
                } else {
                    i25 = 4194304;
                }
                i14 |= i25;
            }
            i26 = i13 & 256;
            if (i26 != 0) {
                i14 |= 100663296;
            } else if ((i11 & 100663296) == 0) {
                if (c1086gP.c(z10)) {
                    i27 = 67108864;
                } else {
                    i27 = 33554432;
                }
                i14 |= i27;
            }
            i28 = i13 & 512;
            if (i28 != 0) {
                i14 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (c1086gP.k(qVar2)) {
                    i29 = 536870912;
                } else {
                    i29 = 268435456;
                }
                i14 |= i29;
            }
            i30 = i13 & 1024;
            if (i30 != 0) {
                i31 = i12 | 6;
            } else if ((i12 & 6) == 0) {
                if (c1086gP.c(z11)) {
                    i32 = 4;
                } else {
                    i32 = 2;
                }
                i31 = i12 | i32;
            } else {
                i31 = i12;
            }
            if ((i12 & 48) != 0) {
                i31 |= ((i13 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
            }
            i33 = i31;
            i34 = i13 & 4096;
            if (i34 != 0) {
                if ((i12 & 384) == 0) {
                    if (c1086gP.g(f10)) {
                        i35 = 256;
                    } else {
                        i35 = 128;
                    }
                    i33 |= i35;
                }
                if ((i12 & 3072) != 0) {
                    if ((i13 & 8192) == 0) {
                        i16 = 2048;
                    }
                    i33 |= i16;
                }
                if ((i12 & 24576) != 0) {
                    i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
                }
                if ((i12 & 196608) != 0) {
                    if ((i13 & 32768) == 0) {
                        i41 = 65536;
                    } else {
                        i41 = 65536;
                    }
                    i33 |= i41;
                }
                if ((i12 & 1572864) != 0) {
                    i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
                }
                if ((i12 & 12582912) != 0) {
                    if ((i13 & 131072) == 0) {
                        i40 = 4194304;
                    } else {
                        i40 = 4194304;
                    }
                    i33 |= i40;
                }
                if ((i13 & 262144) != 0) {
                    i33 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (c1086gP.k(qVar3)) {
                        i36 = 67108864;
                    } else {
                        i36 = 33554432;
                    }
                    i33 |= i36;
                }
                if ((i14 & 306783379) == 306783378) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (c1086gP.C(i14 & 1, z12)) {
                    c1086gP.r0();
                    if ((i11 & 1) != 0) {
                        if (i42 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 4) != 0) {
                            mD = d(c1086gP);
                            i14 &= -897;
                        } else {
                            mD = m7;
                        }
                        if (i15 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                        } else {
                            pVar7 = pVar;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                        } else {
                            pVar8 = pVar2;
                        }
                        if (i20 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i22 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i24 != 0) {
                            i38 = 2;
                        } else {
                            i38 = i10;
                        }
                        if (i26 != 0) {
                            z15 = false;
                        } else {
                            z15 = z10;
                        }
                        if (i28 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i30 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 2048) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i33 &= -113;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if (i34 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        i39 = i14;
                        if ((i13 & 8192) != 0) {
                            i33 &= -7169;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11114 = qVar7;
                        if ((i13 & 16384) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i33 &= -57345;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 32768) != 0) {
                            jA = w.a(c1086gP);
                            i33 &= -458753;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 65536) != 0) {
                            i33 = (-3670017) & i33;
                            long j211118 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j211118;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 131072) != 0) {
                            i33 &= -29360129;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                        } else {
                            jB2 = j13;
                        }
                        j20 = jA2;
                        z17 = z15;
                        qVar8 = qVar11114;
                    } else {
                        if (i42 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if ((i13 & 4) != 0) {
                            mD = d(c1086gP);
                            i14 &= -897;
                        } else {
                            mD = m7;
                        }
                        if (i15 != 0) {
                            pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                        } else {
                            pVar7 = pVar;
                        }
                        if (i18 != 0) {
                            pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                        } else {
                            pVar8 = pVar2;
                        }
                        if (i20 != 0) {
                            qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                        } else {
                            qVar6 = qVar;
                        }
                        if (i22 != 0) {
                            pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                        } else {
                            pVar9 = pVar3;
                        }
                        if (i24 != 0) {
                            i38 = 2;
                        } else {
                            i38 = i10;
                        }
                        if (i26 != 0) {
                            z15 = false;
                        } else {
                            z15 = z10;
                        }
                        if (i28 != 0) {
                            qVar7 = null;
                        } else {
                            qVar7 = qVar2;
                        }
                        if (i30 != 0) {
                            z16 = true;
                        } else {
                            z16 = z11;
                        }
                        if ((i13 & 2048) != 0) {
                            l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                            i33 &= -113;
                        } else {
                            l0Var3 = l0Var;
                        }
                        if (i34 != 0) {
                            f12 = w.f12028a;
                        } else {
                            f12 = f10;
                        }
                        i39 = i14;
                        if ((i13 & 8192) != 0) {
                            i33 &= -7169;
                            jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                        } else {
                            jH = j;
                        }
                        Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11115 = qVar7;
                        if ((i13 & 16384) != 0) {
                            jB = ColorsKt.b(jH, c1086gP);
                            i33 &= -57345;
                        } else {
                            jB = j10;
                        }
                        if ((i13 & 32768) != 0) {
                            jA = w.a(c1086gP);
                            i33 &= -458753;
                        } else {
                            jA = j11;
                        }
                        if ((i13 & 65536) != 0) {
                            i33 = (-3670017) & i33;
                            long j211119 = jH;
                            jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                            j19 = j211119;
                        } else {
                            j19 = jH;
                            jA2 = j12;
                        }
                        if ((i13 & 131072) != 0) {
                            i33 &= -29360129;
                            jB2 = ColorsKt.b(jA2, c1086gP);
                        } else {
                            jB2 = j13;
                        }
                        j20 = jA2;
                        z17 = z15;
                        qVar8 = qVar11115;
                    }
                    c1086gP.U();
                    if ((i39 & 14) == 4) {
                    }
                    objF = c1086gP.f();
                    if (z18) {
                        objF = new G(a0Var);
                        c1086gP.E(objF);
                    } else {
                        objF = new G(a0Var);
                        c1086gP.E(objF);
                    }
                    final G g112 = (G) objF;
                    final long j2111110 = j20;
                    final long j2111111 = jB2;
                    final boolean z1111 = z17;
                    final int i4117 = i38;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11116 = pVar7;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11117 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11118 = pVar8;
                    final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11116 = qVar6;
                    final M m113 = mD;
                    composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // Ia.q
                        public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                            androidx.compose.ui.h hVar5 = hVar4;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                            }
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                                boolean zK = interfaceC1084f3.K(g112) | interfaceC1084f3.K(a0Var);
                                final G g113 = g112;
                                final a0 a0Var2 = a0Var;
                                Object objF2 = interfaceC1084f3.f();
                                if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                    objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(a0 a0Var3) {
                                            G g114 = g113;
                                            g114.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                            return p293xa.r.f47939a;
                                        }
                                    };
                                    interfaceC1084f3.E(objF2);
                                }
                                androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                                long j2111112 = j2111110;
                                long j2111113 = j2111111;
                                final boolean z20 = z1111;
                                final int i4118 = i4117;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11119 = pVar11116;
                                final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11117 = qVar3;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111110 = pVar11117;
                                final G g114 = g112;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111 = pVar11118;
                                final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11118 = qVar11116;
                                final M m114 = m113;
                                SurfaceKt.a(hVarB, null, j2111112, j2111113, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                            boolean z21 = z20;
                                            int i4119 = i4118;
                                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar111112 = pVar11119;
                                            Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar11119 = qVar11117;
                                            final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111110 = qVar11118;
                                            final M m115 = m114;
                                            ScaffoldKt.c(z21, i4119, pVar111112, qVar11119, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                        qVar111110.invoke(m115.f11773b, interfaceC1084f7, 0);
                                                    } else {
                                                        interfaceC1084f7.w();
                                                    }
                                                    return p293xa.r.f47939a;
                                                }
                                            }, interfaceC1084f5), pVar111110, g114, pVar111111, interfaceC1084f5, 24576);
                                        } else {
                                            interfaceC1084f5.w();
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP);
                    if (qVar8 != null) {
                        c1086gP.L(651765711);
                        int i4118 = i33 << 9;
                        DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i4118 & 7168) | (57344 & i4118) | (458752 & i4118) | (3670016 & i4118) | (29360128 & i4118) | (i4118 & 234881024), 0);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(652256007);
                        composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                        c1086gP.T(false);
                    }
                    f11 = f12;
                    pVar4 = pVar7;
                    i37 = i38;
                    pVar6 = pVar9;
                    j15 = jB;
                    j17 = j20;
                    qVar5 = qVar8;
                    z14 = z16;
                    m10 = mD;
                    qVar4 = qVar6;
                    j16 = jA;
                    j18 = jB2;
                    z13 = z17;
                    hVar2 = hVar3;
                    pVar5 = pVar8;
                    l0Var2 = l0Var3;
                    j14 = j19;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    m10 = m7;
                    pVar4 = pVar;
                    pVar5 = pVar2;
                    qVar4 = qVar;
                    pVar6 = pVar3;
                    i37 = i10;
                    z13 = z10;
                    qVar5 = qVar2;
                    z14 = z11;
                    l0Var2 = l0Var;
                    f11 = f10;
                    j14 = j;
                    j15 = j10;
                    j16 = j11;
                    j17 = j12;
                    j18 = j13;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i33 |= 384;
            if ((i12 & 3072) != 0) {
                if ((i13 & 8192) == 0) {
                    i16 = 2048;
                }
                i33 |= i16;
            }
            if ((i12 & 24576) != 0) {
                i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
            }
            if ((i12 & 196608) != 0) {
                if ((i13 & 32768) == 0) {
                    i41 = 65536;
                } else {
                    i41 = 65536;
                }
                i33 |= i41;
            }
            if ((i12 & 1572864) != 0) {
                i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
            }
            if ((i12 & 12582912) != 0) {
                if ((i13 & 131072) == 0) {
                    i40 = 4194304;
                } else {
                    i40 = 4194304;
                }
                i33 |= i40;
            }
            if ((i13 & 262144) != 0) {
                i33 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (c1086gP.k(qVar3)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i33 |= i36;
            }
            if ((i14 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c1086gP.C(i14 & 1, z12)) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i42 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i13 & 4) != 0) {
                        mD = d(c1086gP);
                        i14 &= -897;
                    } else {
                        mD = m7;
                    }
                    if (i15 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                    } else {
                        pVar7 = pVar;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                    } else {
                        pVar8 = pVar2;
                    }
                    if (i20 != 0) {
                        qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                    } else {
                        qVar6 = qVar;
                    }
                    if (i22 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i24 != 0) {
                        i38 = 2;
                    } else {
                        i38 = i10;
                    }
                    if (i26 != 0) {
                        z15 = false;
                    } else {
                        z15 = z10;
                    }
                    if (i28 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar2;
                    }
                    if (i30 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if ((i13 & 2048) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        i33 &= -113;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if (i34 != 0) {
                        f12 = w.f12028a;
                    } else {
                        f12 = f10;
                    }
                    i39 = i14;
                    if ((i13 & 8192) != 0) {
                        i33 &= -7169;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11117 = qVar7;
                    if ((i13 & 16384) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i33 &= -57345;
                    } else {
                        jB = j10;
                    }
                    if ((i13 & 32768) != 0) {
                        jA = w.a(c1086gP);
                        i33 &= -458753;
                    } else {
                        jA = j11;
                    }
                    if ((i13 & 65536) != 0) {
                        i33 = (-3670017) & i33;
                        long j2111112 = jH;
                        jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                        j19 = j2111112;
                    } else {
                        j19 = jH;
                        jA2 = j12;
                    }
                    if ((i13 & 131072) != 0) {
                        i33 &= -29360129;
                        jB2 = ColorsKt.b(jA2, c1086gP);
                    } else {
                        jB2 = j13;
                    }
                    j20 = jA2;
                    z17 = z15;
                    qVar8 = qVar11117;
                } else {
                    if (i42 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i13 & 4) != 0) {
                        mD = d(c1086gP);
                        i14 &= -897;
                    } else {
                        mD = m7;
                    }
                    if (i15 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                    } else {
                        pVar7 = pVar;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                    } else {
                        pVar8 = pVar2;
                    }
                    if (i20 != 0) {
                        qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                    } else {
                        qVar6 = qVar;
                    }
                    if (i22 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i24 != 0) {
                        i38 = 2;
                    } else {
                        i38 = i10;
                    }
                    if (i26 != 0) {
                        z15 = false;
                    } else {
                        z15 = z10;
                    }
                    if (i28 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar2;
                    }
                    if (i30 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if ((i13 & 2048) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        i33 &= -113;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if (i34 != 0) {
                        f12 = w.f12028a;
                    } else {
                        f12 = f10;
                    }
                    i39 = i14;
                    if ((i13 & 8192) != 0) {
                        i33 &= -7169;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11118 = qVar7;
                    if ((i13 & 16384) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i33 &= -57345;
                    } else {
                        jB = j10;
                    }
                    if ((i13 & 32768) != 0) {
                        jA = w.a(c1086gP);
                        i33 &= -458753;
                    } else {
                        jA = j11;
                    }
                    if ((i13 & 65536) != 0) {
                        i33 = (-3670017) & i33;
                        long j2111113 = jH;
                        jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                        j19 = j2111113;
                    } else {
                        j19 = jH;
                        jA2 = j12;
                    }
                    if ((i13 & 131072) != 0) {
                        i33 &= -29360129;
                        jB2 = ColorsKt.b(jA2, c1086gP);
                    } else {
                        jB2 = j13;
                    }
                    j20 = jA2;
                    z17 = z15;
                    qVar8 = qVar11118;
                }
                c1086gP.U();
                if ((i39 & 14) == 4) {
                }
                objF = c1086gP.f();
                if (z18) {
                    objF = new G(a0Var);
                    c1086gP.E(objF);
                } else {
                    objF = new G(a0Var);
                    c1086gP.E(objF);
                }
                final G g113 = (G) objF;
                final long j2111114 = j20;
                final long j2111115 = jB2;
                final boolean z1112 = z17;
                final int i4119 = i38;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11119 = pVar7;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111110 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111 = pVar8;
                final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar11119 = qVar6;
                final M m114 = mD;
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                        androidx.compose.ui.h hVar5 = hVar4;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                        }
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                            boolean zK = interfaceC1084f3.K(g113) | interfaceC1084f3.K(a0Var);
                            final G g114 = g113;
                            final a0 a0Var2 = a0Var;
                            Object objF2 = interfaceC1084f3.f();
                            if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(a0 a0Var3) {
                                        G g115 = g114;
                                        g115.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF2);
                            }
                            androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                            long j2111116 = j2111114;
                            long j2111117 = j2111115;
                            final boolean z20 = z1112;
                            final int i41110 = i4119;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111112 = pVar11119;
                            final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111110 = qVar3;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111113 = pVar111110;
                            final G g115 = g113;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111114 = pVar111111;
                            final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111111 = qVar11119;
                            final M m115 = m114;
                            SurfaceKt.a(hVarB, null, j2111116, j2111117, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                        boolean z21 = z20;
                                        int i41111 = i41110;
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar111115 = pVar111112;
                                        Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar111112 = qVar111110;
                                        final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111113 = qVar111111;
                                        final M m116 = m115;
                                        ScaffoldKt.c(z21, i41111, pVar111115, qVar111112, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                    qVar111113.invoke(m116.f11773b, interfaceC1084f7, 0);
                                                } else {
                                                    interfaceC1084f7.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f5), pVar111113, g115, pVar111114, interfaceC1084f5, 24576);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                if (qVar8 != null) {
                    c1086gP.L(651765711);
                    int i41110 = i33 << 9;
                    DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i41110 & 7168) | (57344 & i41110) | (458752 & i41110) | (3670016 & i41110) | (29360128 & i41110) | (i41110 & 234881024), 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(652256007);
                    composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                    c1086gP.T(false);
                }
                f11 = f12;
                pVar4 = pVar7;
                i37 = i38;
                pVar6 = pVar9;
                j15 = jB;
                j17 = j20;
                qVar5 = qVar8;
                z14 = z16;
                m10 = mD;
                qVar4 = qVar6;
                j16 = jA;
                j18 = jB2;
                z13 = z17;
                hVar2 = hVar3;
                pVar5 = pVar8;
                l0Var2 = l0Var3;
                j14 = j19;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                m10 = m7;
                pVar4 = pVar;
                pVar5 = pVar2;
                qVar4 = qVar;
                pVar6 = pVar3;
                i37 = i10;
                z13 = z10;
                qVar5 = qVar2;
                z14 = z11;
                l0Var2 = l0Var;
                f11 = f10;
                j14 = j;
                j15 = j10;
                j16 = j11;
                j17 = j12;
                j18 = j13;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i14 |= 24576;
        i20 = i13 & 32;
        if (i20 != 0) {
            i14 |= 196608;
        } else if ((i11 & 196608) == 0) {
            if (c1086gP.k(qVar)) {
                i21 = 131072;
            } else {
                i21 = 65536;
            }
            i14 |= i21;
        }
        i22 = i13 & 64;
        if (i22 != 0) {
            i14 |= 1572864;
        } else if ((i11 & 1572864) == 0) {
            if (c1086gP.k(pVar3)) {
                i23 = 1048576;
            } else {
                i23 = 524288;
            }
            i14 |= i23;
        }
        i24 = i13 & 128;
        if (i24 != 0) {
            i14 |= 12582912;
        } else if ((i11 & 12582912) == 0) {
            if (c1086gP.h(i10)) {
                i25 = 8388608;
            } else {
                i25 = 4194304;
            }
            i14 |= i25;
        }
        i26 = i13 & 256;
        if (i26 != 0) {
            i14 |= 100663296;
        } else if ((i11 & 100663296) == 0) {
            if (c1086gP.c(z10)) {
                i27 = 67108864;
            } else {
                i27 = 33554432;
            }
            i14 |= i27;
        }
        i28 = i13 & 512;
        if (i28 != 0) {
            i14 |= 805306368;
        } else if ((i11 & 805306368) == 0) {
            if (c1086gP.k(qVar2)) {
                i29 = 536870912;
            } else {
                i29 = 268435456;
            }
            i14 |= i29;
        }
        i30 = i13 & 1024;
        if (i30 != 0) {
            i31 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            if (c1086gP.c(z11)) {
                i32 = 4;
            } else {
                i32 = 2;
            }
            i31 = i12 | i32;
        } else {
            i31 = i12;
        }
        if ((i12 & 48) != 0) {
            i31 |= ((i13 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
        }
        i33 = i31;
        i34 = i13 & 4096;
        if (i34 != 0) {
            if ((i12 & 384) == 0) {
                if (c1086gP.g(f10)) {
                    i35 = 256;
                } else {
                    i35 = 128;
                }
                i33 |= i35;
            }
            if ((i12 & 3072) != 0) {
                if ((i13 & 8192) == 0) {
                    i16 = 2048;
                }
                i33 |= i16;
            }
            if ((i12 & 24576) != 0) {
                i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
            }
            if ((i12 & 196608) != 0) {
                if ((i13 & 32768) == 0) {
                    i41 = 65536;
                } else {
                    i41 = 65536;
                }
                i33 |= i41;
            }
            if ((i12 & 1572864) != 0) {
                i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
            }
            if ((i12 & 12582912) != 0) {
                if ((i13 & 131072) == 0) {
                    i40 = 4194304;
                } else {
                    i40 = 4194304;
                }
                i33 |= i40;
            }
            if ((i13 & 262144) != 0) {
                i33 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (c1086gP.k(qVar3)) {
                    i36 = 67108864;
                } else {
                    i36 = 33554432;
                }
                i33 |= i36;
            }
            if ((i14 & 306783379) == 306783378) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (c1086gP.C(i14 & 1, z12)) {
                c1086gP.r0();
                if ((i11 & 1) != 0) {
                    if (i42 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i13 & 4) != 0) {
                        mD = d(c1086gP);
                        i14 &= -897;
                    } else {
                        mD = m7;
                    }
                    if (i15 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                    } else {
                        pVar7 = pVar;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                    } else {
                        pVar8 = pVar2;
                    }
                    if (i20 != 0) {
                        qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                    } else {
                        qVar6 = qVar;
                    }
                    if (i22 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i24 != 0) {
                        i38 = 2;
                    } else {
                        i38 = i10;
                    }
                    if (i26 != 0) {
                        z15 = false;
                    } else {
                        z15 = z10;
                    }
                    if (i28 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar2;
                    }
                    if (i30 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if ((i13 & 2048) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        i33 &= -113;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if (i34 != 0) {
                        f12 = w.f12028a;
                    } else {
                        f12 = f10;
                    }
                    i39 = i14;
                    if ((i13 & 8192) != 0) {
                        i33 &= -7169;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111110 = qVar7;
                    if ((i13 & 16384) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i33 &= -57345;
                    } else {
                        jB = j10;
                    }
                    if ((i13 & 32768) != 0) {
                        jA = w.a(c1086gP);
                        i33 &= -458753;
                    } else {
                        jA = j11;
                    }
                    if ((i13 & 65536) != 0) {
                        i33 = (-3670017) & i33;
                        long j2111116 = jH;
                        jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                        j19 = j2111116;
                    } else {
                        j19 = jH;
                        jA2 = j12;
                    }
                    if ((i13 & 131072) != 0) {
                        i33 &= -29360129;
                        jB2 = ColorsKt.b(jA2, c1086gP);
                    } else {
                        jB2 = j13;
                    }
                    j20 = jA2;
                    z17 = z15;
                    qVar8 = qVar111110;
                } else {
                    if (i42 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if ((i13 & 4) != 0) {
                        mD = d(c1086gP);
                        i14 &= -897;
                    } else {
                        mD = m7;
                    }
                    if (i15 != 0) {
                        pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                    } else {
                        pVar7 = pVar;
                    }
                    if (i18 != 0) {
                        pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                    } else {
                        pVar8 = pVar2;
                    }
                    if (i20 != 0) {
                        qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                    } else {
                        qVar6 = qVar;
                    }
                    if (i22 != 0) {
                        pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                    } else {
                        pVar9 = pVar3;
                    }
                    if (i24 != 0) {
                        i38 = 2;
                    } else {
                        i38 = i10;
                    }
                    if (i26 != 0) {
                        z15 = false;
                    } else {
                        z15 = z10;
                    }
                    if (i28 != 0) {
                        qVar7 = null;
                    } else {
                        qVar7 = qVar2;
                    }
                    if (i30 != 0) {
                        z16 = true;
                    } else {
                        z16 = z11;
                    }
                    if ((i13 & 2048) != 0) {
                        l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                        i33 &= -113;
                    } else {
                        l0Var3 = l0Var;
                    }
                    if (i34 != 0) {
                        f12 = w.f12028a;
                    } else {
                        f12 = f10;
                    }
                    i39 = i14;
                    if ((i13 & 8192) != 0) {
                        i33 &= -7169;
                        jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                    } else {
                        jH = j;
                    }
                    Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111111 = qVar7;
                    if ((i13 & 16384) != 0) {
                        jB = ColorsKt.b(jH, c1086gP);
                        i33 &= -57345;
                    } else {
                        jB = j10;
                    }
                    if ((i13 & 32768) != 0) {
                        jA = w.a(c1086gP);
                        i33 &= -458753;
                    } else {
                        jA = j11;
                    }
                    if ((i13 & 65536) != 0) {
                        i33 = (-3670017) & i33;
                        long j2111117 = jH;
                        jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                        j19 = j2111117;
                    } else {
                        j19 = jH;
                        jA2 = j12;
                    }
                    if ((i13 & 131072) != 0) {
                        i33 &= -29360129;
                        jB2 = ColorsKt.b(jA2, c1086gP);
                    } else {
                        jB2 = j13;
                    }
                    j20 = jA2;
                    z17 = z15;
                    qVar8 = qVar111111;
                }
                c1086gP.U();
                if ((i39 & 14) == 4) {
                }
                objF = c1086gP.f();
                if (z18) {
                    objF = new G(a0Var);
                    c1086gP.E(objF);
                } else {
                    objF = new G(a0Var);
                    c1086gP.E(objF);
                }
                final G g114 = (G) objF;
                final long j2111118 = j20;
                final long j2111119 = jB2;
                final boolean z1113 = z17;
                final int i41111 = i38;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111112 = pVar7;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111113 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111114 = pVar8;
                final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111112 = qVar6;
                final M m115 = mD;
                composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // Ia.q
                    public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                        androidx.compose.ui.h hVar5 = hVar4;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                        }
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                            boolean zK = interfaceC1084f3.K(g114) | interfaceC1084f3.K(a0Var);
                            final G g115 = g114;
                            final a0 a0Var2 = a0Var;
                            Object objF2 = interfaceC1084f3.f();
                            if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                                objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(a0 a0Var3) {
                                        G g116 = g115;
                                        g116.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                        return p293xa.r.f47939a;
                                    }
                                };
                                interfaceC1084f3.E(objF2);
                            }
                            androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                            long j21111110 = j2111118;
                            long j21111111 = j2111119;
                            final boolean z20 = z1113;
                            final int i41112 = i41111;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111115 = pVar111112;
                            final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111113 = qVar3;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111116 = pVar111113;
                            final G g116 = g114;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111117 = pVar111114;
                            final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111114 = qVar111112;
                            final M m116 = m115;
                            SurfaceKt.a(hVarB, null, j21111110, j21111111, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                        boolean z21 = z20;
                                        int i41113 = i41112;
                                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar111118 = pVar111115;
                                        Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar111115 = qVar111113;
                                        final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111116 = qVar111114;
                                        final M m117 = m116;
                                        ScaffoldKt.c(z21, i41113, pVar111118, qVar111115, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                    qVar111116.invoke(m117.f11773b, interfaceC1084f7, 0);
                                                } else {
                                                    interfaceC1084f7.w();
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f5), pVar111116, g116, pVar111117, interfaceC1084f5, 24576);
                                    } else {
                                        interfaceC1084f5.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP);
                if (qVar8 != null) {
                    c1086gP.L(651765711);
                    int i41112 = i33 << 9;
                    DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                                composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i41112 & 7168) | (57344 & i41112) | (458752 & i41112) | (3670016 & i41112) | (29360128 & i41112) | (i41112 & 234881024), 0);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(652256007);
                    composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                    c1086gP.T(false);
                }
                f11 = f12;
                pVar4 = pVar7;
                i37 = i38;
                pVar6 = pVar9;
                j15 = jB;
                j17 = j20;
                qVar5 = qVar8;
                z14 = z16;
                m10 = mD;
                qVar4 = qVar6;
                j16 = jA;
                j18 = jB2;
                z13 = z17;
                hVar2 = hVar3;
                pVar5 = pVar8;
                l0Var2 = l0Var3;
                j14 = j19;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                m10 = m7;
                pVar4 = pVar;
                pVar5 = pVar2;
                qVar4 = qVar;
                pVar6 = pVar3;
                i37 = i10;
                z13 = z10;
                qVar5 = qVar2;
                z14 = z11;
                l0Var2 = l0Var;
                f11 = f10;
                j14 = j;
                j15 = j10;
                j16 = j11;
                j17 = j12;
                j18 = j13;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i33 |= 384;
        if ((i12 & 3072) != 0) {
            if ((i13 & 8192) == 0) {
                i16 = 2048;
            }
            i33 |= i16;
        }
        if ((i12 & 24576) != 0) {
            i33 |= ((i13 & 16384) == 0 || !c1086gP.i(j10)) ? 8192 : 16384;
        }
        if ((i12 & 196608) != 0) {
            if ((i13 & 32768) == 0) {
                i41 = 65536;
            } else {
                i41 = 65536;
            }
            i33 |= i41;
        }
        if ((i12 & 1572864) != 0) {
            i33 |= ((i13 & 65536) == 0 || !c1086gP.i(j12)) ? 524288 : 1048576;
        }
        if ((i12 & 12582912) != 0) {
            if ((i13 & 131072) == 0) {
                i40 = 4194304;
            } else {
                i40 = 4194304;
            }
            i33 |= i40;
        }
        if ((i13 & 262144) != 0) {
            i33 |= 100663296;
        } else if ((i12 & 100663296) == 0) {
            if (c1086gP.k(qVar3)) {
                i36 = 67108864;
            } else {
                i36 = 33554432;
            }
            i33 |= i36;
        }
        if ((i14 & 306783379) == 306783378) {
            z12 = true;
        } else {
            z12 = true;
        }
        if (c1086gP.C(i14 & 1, z12)) {
            c1086gP.r0();
            if ((i11 & 1) != 0) {
                if (i42 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if ((i13 & 4) != 0) {
                    mD = d(c1086gP);
                    i14 &= -897;
                } else {
                    mD = m7;
                }
                if (i15 != 0) {
                    pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                } else {
                    pVar7 = pVar;
                }
                if (i18 != 0) {
                    pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                } else {
                    pVar8 = pVar2;
                }
                if (i20 != 0) {
                    qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                } else {
                    qVar6 = qVar;
                }
                if (i22 != 0) {
                    pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                } else {
                    pVar9 = pVar3;
                }
                if (i24 != 0) {
                    i38 = 2;
                } else {
                    i38 = i10;
                }
                if (i26 != 0) {
                    z15 = false;
                } else {
                    z15 = z10;
                }
                if (i28 != 0) {
                    qVar7 = null;
                } else {
                    qVar7 = qVar2;
                }
                if (i30 != 0) {
                    z16 = true;
                } else {
                    z16 = z11;
                }
                if ((i13 & 2048) != 0) {
                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                    i33 &= -113;
                } else {
                    l0Var3 = l0Var;
                }
                if (i34 != 0) {
                    f12 = w.f12028a;
                } else {
                    f12 = f10;
                }
                i39 = i14;
                if ((i13 & 8192) != 0) {
                    i33 &= -7169;
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                } else {
                    jH = j;
                }
                Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111113 = qVar7;
                if ((i13 & 16384) != 0) {
                    jB = ColorsKt.b(jH, c1086gP);
                    i33 &= -57345;
                } else {
                    jB = j10;
                }
                if ((i13 & 32768) != 0) {
                    jA = w.a(c1086gP);
                    i33 &= -458753;
                } else {
                    jA = j11;
                }
                if ((i13 & 65536) != 0) {
                    i33 = (-3670017) & i33;
                    long j21111110 = jH;
                    jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                    j19 = j21111110;
                } else {
                    j19 = jH;
                    jA2 = j12;
                }
                if ((i13 & 131072) != 0) {
                    i33 &= -29360129;
                    jB2 = ColorsKt.b(jA2, c1086gP);
                } else {
                    jB2 = j13;
                }
                j20 = jA2;
                z17 = z15;
                qVar8 = qVar111113;
            } else {
                if (i42 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if ((i13 & 4) != 0) {
                    mD = d(c1086gP);
                    i14 &= -897;
                } else {
                    mD = m7;
                }
                if (i15 != 0) {
                    pVar7 = ComposableSingletons$ScaffoldKt.f11695a;
                } else {
                    pVar7 = pVar;
                }
                if (i18 != 0) {
                    pVar8 = ComposableSingletons$ScaffoldKt.f11696b;
                } else {
                    pVar8 = pVar2;
                }
                if (i20 != 0) {
                    qVar6 = ComposableSingletons$ScaffoldKt.f11697c;
                } else {
                    qVar6 = qVar;
                }
                if (i22 != 0) {
                    pVar9 = ComposableSingletons$ScaffoldKt.f11698d;
                } else {
                    pVar9 = pVar3;
                }
                if (i24 != 0) {
                    i38 = 2;
                } else {
                    i38 = i10;
                }
                if (i26 != 0) {
                    z15 = false;
                } else {
                    z15 = z10;
                }
                if (i28 != 0) {
                    qVar7 = null;
                } else {
                    qVar7 = qVar2;
                }
                if (i30 != 0) {
                    z16 = true;
                } else {
                    z16 = z11;
                }
                if ((i13 & 2048) != 0) {
                    l0Var3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11777c;
                    i33 &= -113;
                } else {
                    l0Var3 = l0Var;
                }
                if (i34 != 0) {
                    f12 = w.f12028a;
                } else {
                    f12 = f10;
                }
                i39 = i14;
                if ((i13 & 8192) != 0) {
                    i33 &= -7169;
                    jH = ((C1034j) c1086gP.x(ColorsKt.f11693a)).h();
                } else {
                    jH = j;
                }
                Ia.q<? super InterfaceC0954n, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111114 = qVar7;
                if ((i13 & 16384) != 0) {
                    jB = ColorsKt.b(jH, c1086gP);
                    i33 &= -57345;
                } else {
                    jB = j10;
                }
                if ((i13 & 32768) != 0) {
                    jA = w.a(c1086gP);
                    i33 &= -458753;
                } else {
                    jA = j11;
                }
                if ((i13 & 65536) != 0) {
                    i33 = (-3670017) & i33;
                    long j21111111 = jH;
                    jA2 = ((C1034j) c1086gP.x(ColorsKt.f11693a)).a();
                    j19 = j21111111;
                } else {
                    j19 = jH;
                    jA2 = j12;
                }
                if ((i13 & 131072) != 0) {
                    i33 &= -29360129;
                    jB2 = ColorsKt.b(jA2, c1086gP);
                } else {
                    jB2 = j13;
                }
                j20 = jA2;
                z17 = z15;
                qVar8 = qVar111114;
            }
            c1086gP.U();
            if ((i39 & 14) == 4) {
            }
            objF = c1086gP.f();
            if (z18) {
                objF = new G(a0Var);
                c1086gP.E(objF);
            } else {
                objF = new G(a0Var);
                c1086gP.E(objF);
            }
            final G g115 = (G) objF;
            final long j21111112 = j20;
            final long j21111113 = jB2;
            final boolean z1114 = z17;
            final int i41113 = i38;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111115 = pVar7;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111116 = pVar9;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111117 = pVar8;
            final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111115 = qVar6;
            final M m116 = mD;
            composableLambdaImplB = androidx.compose.runtime.internal.a.b(-219833176, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // Ia.q
                public final p293xa.r invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                    androidx.compose.ui.h hVar5 = hVar4;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= interfaceC1084f3.K(hVar5) ? 4 : 2;
                    }
                    if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 19) != 18)) {
                        boolean zK = interfaceC1084f3.K(g115) | interfaceC1084f3.K(a0Var);
                        final G g116 = g115;
                        final a0 a0Var2 = a0Var;
                        Object objF2 = interfaceC1084f3.f();
                        if (zK || objF2 == InterfaceC1084f.a.f12980a) {
                            objF2 = new Ia.l<a0, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(a0 a0Var3) {
                                    G g117 = g116;
                                    g117.f11753a.setValue(new C0958s(a0Var2, a0Var3));
                                    return p293xa.r.f47939a;
                                }
                            };
                            interfaceC1084f3.E(objF2);
                        }
                        androidx.compose.ui.h hVarB = WindowInsetsPaddingKt.b(hVar5, (Ia.l) objF2);
                        long j21111114 = j21111112;
                        long j21111115 = j21111113;
                        final boolean z20 = z1114;
                        final int i41114 = i41113;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111118 = pVar111115;
                        final Ia.q<? super androidx.compose.foundation.layout.L, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111116 = qVar3;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111119 = pVar111116;
                        final G g117 = g115;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111110 = pVar111117;
                        final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111117 = qVar111115;
                        final M m117 = m116;
                        SurfaceKt.a(hVarB, null, j21111114, j21111115, null, 0.0f, androidx.compose.runtime.internal.a.b(1772955108, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$child$1.2
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
                                    boolean z21 = z20;
                                    int i41115 = i41114;
                                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar1111111 = pVar111118;
                                    Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar111118 = qVar111116;
                                    final Ia.q<? super P, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar111119 = qVar111117;
                                    final M m118 = m117;
                                    ScaffoldKt.c(z21, i41115, pVar1111111, qVar111118, androidx.compose.runtime.internal.a.b(433906483, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt.Scaffold.child.1.2.1
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
                                                qVar111119.invoke(m118.f11773b, interfaceC1084f7, 0);
                                            } else {
                                                interfaceC1084f7.w();
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f5), pVar111119, g117, pVar1111110, interfaceC1084f5, 24576);
                                } else {
                                    interfaceC1084f5.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 1572864, 50);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP);
            if (qVar8 != null) {
                c1086gP.L(651765711);
                int i41114 = i33 << 9;
                DrawerKt.a(qVar8, hVar3, mD.f11772a, z16, l0Var3, f12, j19, jB, jA, androidx.compose.runtime.internal.a.b(-1409196448, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if (interfaceC1084f3.C(iIntValue & 1, (iIntValue & 3) != 2)) {
                            composableLambdaImplB.invoke(androidx.compose.ui.h.a.f13984b, interfaceC1084f3, 54);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i39 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i39 >> 27) & 14) | 805306368 | (i41114 & 7168) | (57344 & i41114) | (458752 & i41114) | (3670016 & i41114) | (29360128 & i41114) | (i41114 & 234881024), 0);
                c1086gP.T(false);
            } else {
                c1086gP.L(652256007);
                composableLambdaImplB.invoke(hVar3, c1086gP, Integer.valueOf(((i39 >> 3) & 14) | 48));
                c1086gP.T(false);
            }
            f11 = f12;
            pVar4 = pVar7;
            i37 = i38;
            pVar6 = pVar9;
            j15 = jB;
            j17 = j20;
            qVar5 = qVar8;
            z14 = z16;
            m10 = mD;
            qVar4 = qVar6;
            j16 = jA;
            j18 = jB2;
            z13 = z17;
            hVar2 = hVar3;
            pVar5 = pVar8;
            l0Var2 = l0Var3;
            j14 = j19;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            m10 = m7;
            pVar4 = pVar;
            pVar5 = pVar2;
            qVar4 = qVar;
            pVar6 = pVar3;
            i37 = i10;
            z13 = z10;
            qVar5 = qVar2;
            z14 = z11;
            l0Var2 = l0Var;
            f11 = f10;
            j14 = j;
            j15 = j10;
            j16 = j11;
            j17 = j12;
            j18 = j13;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$Scaffold$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ScaffoldKt.b(a0Var, hVar2, m10, pVar4, pVar5, qVar4, pVar6, i37, z13, qVar5, z14, l0Var2, f11, j14, j15, j16, j17, j18, qVar3, interfaceC1084f2, L4.b.l(i11 | 1), L4.b.l(i12), i13);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void c(final boolean z10, final int i10, final Ia.p pVar, final Ia.q qVar, final Ia.p pVar2, final Ia.p pVar3, final a0 a0Var, final Ia.p pVar4, InterfaceC1084f interfaceC1084f, final int i11) {
        int i12;
        int i13;
        int i14;
        C1086g c1086gP = interfaceC1084f.p(-468424875);
        if ((i11 & 6) == 0) {
            i12 = (c1086gP.c(z10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c1086gP.h(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c1086gP.k(pVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c1086gP.k(qVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c1086gP.k(pVar2) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= c1086gP.k(pVar3) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= c1086gP.K(a0Var) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= c1086gP.k(pVar4) ? 8388608 : 4194304;
        }
        if (c1086gP.C(i12 & 1, (i12 & 4793491) != 4793490)) {
            Object objF = c1086gP.f();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = new L();
                c1086gP.E(objF);
            }
            final L l10 = (L) objF;
            boolean z11 = ((i12 & 7168) == 2048) | ((i12 & 896) == 256) | ((57344 & i12) == 16384) | ((3670016 & i12) == 1048576) | ((458752 & i12) == 131072) | ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) | ((i12 & 14) == 4) | ((29360128 & i12) == 8388608);
            Object objF2 = c1086gP.f();
            if (z11 || objF2 == c0153a) {
                i13 = 0;
                i14 = 1;
                objF2 = new Ia.p<e0, p013b0.a, androidx.compose.ui.layout.F>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX WARN: Code duplicated, block: B:94:0x0212  */
                    @Override // Ia.p
                    public final androidx.compose.ui.layout.F invoke(e0 e0Var, p013b0.a aVar) {
                        Object obj;
                        Object obj2;
                        final z zVar;
                        Object obj3;
                        Integer numValueOf;
                        final int iIntValue;
                        Object obj4;
                        Object obj5;
                        int iE1;
                        int iE2;
                        e0 e0Var2 = e0Var;
                        long j = aVar.f20475a;
                        int iH = p013b0.a.h(j);
                        final int iG = p013b0.a.g(j);
                        long jA = p013b0.a.a(j, 0, 0, 0, 0, 10);
                        List<androidx.compose.ui.layout.D> listR0 = e0Var2.R0(ScaffoldLayoutContent.f11801b, pVar);
                        final ArrayList arrayList = new ArrayList(listR0.size());
                        int size = listR0.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            arrayList.add(listR0.get(i15).Q(jA));
                        }
                        if (!arrayList.isEmpty()) {
                            obj = arrayList.get(0);
                            int i16 = ((Y) obj).f14221c;
                            int iR = kotlin.collections.l.r(arrayList);
                            if (1 <= iR) {
                                int i17 = 1;
                                while (true) {
                                    Object obj6 = arrayList.get(i17);
                                    int i18 = ((Y) obj6).f14221c;
                                    if (i16 < i18) {
                                        obj = obj6;
                                        i16 = i18;
                                    }
                                    if (i17 == iR) {
                                        break;
                                    }
                                    i17++;
                                }
                            }
                        } else {
                            obj = null;
                        }
                        Y y10 = (Y) obj;
                        final int i19 = y10 != null ? y10.f14221c : 0;
                        List<androidx.compose.ui.layout.D> listR1 = e0Var2.R0(ScaffoldLayoutContent.f11803d, pVar2);
                        a0 a0Var2 = a0Var;
                        ArrayList arrayList2 = new ArrayList(listR1.size());
                        int size2 = listR1.size();
                        int i20 = 0;
                        while (i20 < size2) {
                            arrayList2.add(listR1.get(i20).Q(p013b0.b.i(jA, (-a0Var2.a(e0Var2, e0Var2.getLayoutDirection())) - a0Var2.c(e0Var2, e0Var2.getLayoutDirection()), -a0Var2.b(e0Var2))));
                            i20++;
                            listR1 = listR1;
                        }
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            obj2 = arrayList2.get(0);
                            int i21 = ((Y) obj2).f14221c;
                            int iR2 = kotlin.collections.l.r(arrayList2);
                            if (1 <= iR2) {
                                Object obj7 = obj2;
                                int i22 = i21;
                                int i23 = 1;
                                while (true) {
                                    Object obj8 = arrayList2.get(i23);
                                    int i24 = ((Y) obj8).f14221c;
                                    if (i22 < i24) {
                                        obj7 = obj8;
                                        i22 = i24;
                                    }
                                    if (i23 == iR2) {
                                        break;
                                    }
                                    i23++;
                                }
                                obj2 = obj7;
                            }
                        }
                        Y y11 = (Y) obj2;
                        int i25 = y11 != null ? y11.f14221c : 0;
                        List<androidx.compose.ui.layout.D> listR2 = e0Var2.R0(ScaffoldLayoutContent.f11804e, pVar3);
                        a0 a0Var3 = a0Var;
                        final ArrayList arrayList3 = new ArrayList(listR2.size());
                        int size3 = listR2.size();
                        int i26 = 0;
                        while (i26 < size3) {
                            arrayList3.add(listR2.get(i26).Q(p013b0.b.i(jA, (-a0Var3.a(e0Var2, e0Var2.getLayoutDirection())) - a0Var3.c(e0Var2, e0Var2.getLayoutDirection()), -a0Var3.b(e0Var2))));
                            i26++;
                            a0Var3 = a0Var3;
                            listR2 = listR2;
                            size3 = size3;
                            arrayList2 = arrayList2;
                        }
                        final ArrayList arrayList4 = arrayList2;
                        if (arrayList3.isEmpty()) {
                            zVar = null;
                        } else {
                            if (arrayList3.isEmpty()) {
                                obj4 = null;
                            } else {
                                obj4 = arrayList3.get(0);
                                int i27 = ((Y) obj4).f14220b;
                                int iR3 = kotlin.collections.l.r(arrayList3);
                                if (1 <= iR3) {
                                    Object obj9 = obj4;
                                    int i28 = i27;
                                    int i29 = 1;
                                    while (true) {
                                        Object obj10 = arrayList3.get(i29);
                                        int i30 = ((Y) obj10).f14220b;
                                        if (i28 < i30) {
                                            i28 = i30;
                                            obj9 = obj10;
                                        }
                                        if (i29 == iR3) {
                                            break;
                                        }
                                        i29++;
                                    }
                                    obj4 = obj9;
                                }
                            }
                            Y y12 = (Y) obj4;
                            int i31 = y12 != null ? y12.f14220b : 0;
                            if (arrayList3.isEmpty()) {
                                obj5 = null;
                            } else {
                                obj5 = arrayList3.get(0);
                                int i32 = ((Y) obj5).f14221c;
                                int iR4 = kotlin.collections.l.r(arrayList3);
                                if (1 <= iR4) {
                                    Object obj11 = obj5;
                                    int i33 = i32;
                                    int i34 = 1;
                                    while (true) {
                                        Object obj12 = arrayList3.get(i34);
                                        Object obj13 = obj11;
                                        int i35 = ((Y) obj12).f14221c;
                                        if (i33 < i35) {
                                            i33 = i35;
                                            obj11 = obj12;
                                        } else {
                                            obj11 = obj13;
                                        }
                                        if (i34 == iR4) {
                                            break;
                                        }
                                        i34++;
                                    }
                                    obj5 = obj11;
                                }
                            }
                            Y y13 = (Y) obj5;
                            int i36 = y13 != null ? y13.f14221c : 0;
                            if (i31 == 0 || i36 == 0) {
                                zVar = null;
                            } else {
                                int i37 = i10;
                                if (i37 == 0) {
                                    if (e0Var2.getLayoutDirection() == LayoutDirection.f15717b) {
                                        iE1 = e0Var2.e1(ScaffoldKt.f11799b);
                                    } else {
                                        iE2 = e0Var2.e1(ScaffoldKt.f11799b);
                                        iE1 = (iH - iE2) - i31;
                                    }
                                } else if (i37 != 2) {
                                    iE1 = (iH - i31) / 2;
                                } else if (e0Var2.getLayoutDirection() == LayoutDirection.f15717b) {
                                    iE2 = e0Var2.e1(ScaffoldKt.f11799b);
                                    iE1 = (iH - iE2) - i31;
                                } else {
                                    iE1 = e0Var2.e1(ScaffoldKt.f11799b);
                                }
                                zVar = new z(iE1, i36);
                            }
                        }
                        ScaffoldLayoutContent scaffoldLayoutContent = ScaffoldLayoutContent.f11805f;
                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar5 = pVar4;
                        List<androidx.compose.ui.layout.D> listR3 = e0Var2.R0(scaffoldLayoutContent, new ComposableLambdaImpl(true, 424088350, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bottomBarPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue2 = num.intValue();
                                if (interfaceC1084f3.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    CompositionLocalKt.a(ScaffoldKt.f11798a.b(zVar), pVar5, interfaceC1084f3, 8);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        final ArrayList arrayList5 = new ArrayList(listR3.size());
                        int size4 = listR3.size();
                        for (int i38 = 0; i38 < size4; i38++) {
                            arrayList5.add(listR3.get(i38).Q(jA));
                        }
                        if (!arrayList5.isEmpty()) {
                            obj3 = arrayList5.get(0);
                            int i39 = ((Y) obj3).f14221c;
                            int iR5 = kotlin.collections.l.r(arrayList5);
                            if (1 <= iR5) {
                                int i40 = 1;
                                while (true) {
                                    Object obj14 = arrayList5.get(i40);
                                    Object obj15 = obj3;
                                    int i41 = ((Y) obj14).f14221c;
                                    if (i39 < i41) {
                                        i39 = i41;
                                        obj3 = obj14;
                                    } else {
                                        obj3 = obj15;
                                    }
                                    if (i40 == iR5) {
                                        break;
                                    }
                                    i40++;
                                }
                            }
                        } else {
                            obj3 = null;
                        }
                        Y y14 = (Y) obj3;
                        Integer numValueOf2 = y14 != null ? Integer.valueOf(y14.f14221c) : null;
                        if (zVar != null) {
                            a0 a0Var4 = a0Var;
                            boolean z12 = z10;
                            int i42 = zVar.f12033b;
                            numValueOf = Integer.valueOf(numValueOf2 == null ? a0Var4.b(e0Var2) + e0Var2.e1(ScaffoldKt.f11799b) + i42 : z12 ? numValueOf2.intValue() + (i42 / 2) : numValueOf2.intValue() + i42 + e0Var2.e1(ScaffoldKt.f11799b));
                        } else {
                            numValueOf = null;
                        }
                        if (i25 != 0) {
                            iIntValue = i25 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : a0Var.b(e0Var2));
                        } else {
                            iIntValue = 0;
                        }
                        androidx.compose.foundation.layout.D d10 = new androidx.compose.foundation.layout.D(a0Var, e0Var2);
                        final z zVar2 = zVar;
                        l10.f11771a.setValue(new androidx.compose.foundation.layout.N(PaddingKt.d(d10, e0Var2.getLayoutDirection()), arrayList.isEmpty() ? d10.d() : 0, PaddingKt.c(d10, e0Var2.getLayoutDirection()), (arrayList5.isEmpty() || numValueOf2 == null) ? d10.a() : e0Var2.u(numValueOf2.intValue())));
                        int i43 = iG - i19;
                        ScaffoldLayoutContent scaffoldLayoutContent2 = ScaffoldLayoutContent.f11802c;
                        final Ia.q<androidx.compose.foundation.layout.L, InterfaceC1084f, Integer, p293xa.r> qVar2 = qVar;
                        final L l11 = l10;
                        List<androidx.compose.ui.layout.D> listR4 = e0Var2.R0(scaffoldLayoutContent2, new ComposableLambdaImpl(true, -570781649, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1$bodyContentPlaceables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue2 = num.intValue();
                                if (interfaceC1084f3.C(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    qVar2.invoke(l11, interfaceC1084f3, 6);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }));
                        final ArrayList arrayList6 = new ArrayList(listR4.size());
                        int size5 = listR4.size();
                        int i44 = 0;
                        while (i44 < size5) {
                            arrayList6.add(listR4.get(i44).Q(p013b0.a.a(jA, 0, 0, 0, i43, 7)));
                            i44++;
                            i43 = i43;
                            jA = jA;
                        }
                        final Integer num = numValueOf2;
                        final Integer num2 = numValueOf;
                        return e0Var2.y1(iH, iG, kotlin.collections.y.p(), new Ia.l<Y.a, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(Y.a aVar2) {
                                Y.a aVar3 = aVar2;
                                List<Y> list = arrayList6;
                                int i45 = i19;
                                int size6 = list.size();
                                for (int i46 = 0; i46 < size6; i46++) {
                                    aVar3.d(list.get(i46), 0, i45, 0.0f);
                                }
                                List<Y> list2 = arrayList;
                                int size7 = list2.size();
                                for (int i47 = 0; i47 < size7; i47++) {
                                    aVar3.d(list2.get(i47), 0, 0, 0.0f);
                                }
                                List<Y> list3 = arrayList4;
                                int i48 = iG;
                                int i49 = iIntValue;
                                int size8 = list3.size();
                                for (int i50 = 0; i50 < size8; i50++) {
                                    aVar3.d(list3.get(i50), 0, i48 - i49, 0.0f);
                                }
                                List<Y> list4 = arrayList5;
                                int i51 = iG;
                                Integer num3 = num;
                                int size9 = list4.size();
                                for (int i52 = 0; i52 < size9; i52++) {
                                    aVar3.d(list4.get(i52), 0, i51 - (num3 != null ? num3.intValue() : 0), 0.0f);
                                }
                                List<Y> list5 = arrayList3;
                                z zVar3 = zVar2;
                                int i53 = iG;
                                Integer num4 = num2;
                                int size10 = list5.size();
                                for (int i54 = 0; i54 < size10; i54++) {
                                    aVar3.d(list5.get(i54), zVar3 != null ? zVar3.f12032a : 0, i53 - (num4 != null ? num4.intValue() : 0), 0.0f);
                                }
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                };
                c1086gP.E(objF2);
            } else {
                i14 = 1;
                i13 = 0;
            }
            SubcomposeLayoutKt.a(null, (Ia.p) objF2, c1086gP, i13, i14);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ScaffoldKt.c(z10, i10, pVar, qVar, pVar2, pVar3, a0Var, pVar4, interfaceC1084f2, L4.b.l(i11 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final M d(InterfaceC1084f interfaceC1084f) {
        DrawerValue drawerValue = DrawerValue.f11736b;
        DrawerState drawerStateC = DrawerKt.c(interfaceC1084f);
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        Object objF = interfaceC1084f.f();
        if (objF == c0153a) {
            objF = new P();
            interfaceC1084f.E(objF);
        }
        P p10 = (P) objF;
        Object objF2 = interfaceC1084f.f();
        if (objF2 == c0153a) {
            objF2 = new M(drawerStateC, p10);
            interfaceC1084f.E(objF2);
        }
        return (M) objF2;
    }
}
