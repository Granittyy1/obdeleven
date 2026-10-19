package androidx.compose.material;

import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.O0;
import androidx.compose.ui.graphics.l0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldDefaults {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TextFieldDefaults f11834a = new TextFieldDefaults();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11835b = 56;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11836c = 280;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f11837d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f11838e = 2;

    public static r b(long j, long j10, long j11, long j12, long j13, long j14, long j15, InterfaceC1084f interfaceC1084f, int i10) {
        long jB;
        long jB2;
        androidx.compose.runtime.C c10;
        long jB3;
        long jB4;
        long jB5;
        if ((i10 & 1) != 0) {
            jB = androidx.compose.ui.graphics.H.b(((Number) interfaceC1084f.x(ContentAlphaKt.f11713a)).floatValue(), ((androidx.compose.ui.graphics.H) interfaceC1084f.x(ContentColorKt.f11715a)).f13506a);
        } else {
            jB = j;
        }
        if ((i10 & 2) != 0) {
            long j16 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(ContentColorKt.f11715a)).f13506a;
            if (((C1034j) interfaceC1084f.x(ColorsKt.f11693a)).i()) {
                Q3.d.D(j16);
            } else {
                Q3.d.D(j16);
            }
            jB2 = androidx.compose.ui.graphics.H.b(0.38f, jB);
        } else {
            jB2 = j10;
        }
        long jB6 = (i10 & 4) != 0 ? androidx.compose.ui.graphics.H.b(0.12f, ((C1034j) interfaceC1084f.x(ColorsKt.f11693a)).e()) : j11;
        O0 o10 = ColorsKt.f11693a;
        long jF = ((C1034j) interfaceC1084f.x(o10)).f();
        long jB7 = ((C1034j) interfaceC1084f.x(o10)).b();
        long jF2 = ((C1034j) interfaceC1084f.x(o10)).f();
        androidx.compose.runtime.C c11 = ContentColorKt.f11715a;
        long j17 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(c11)).f13506a;
        long jB8 = androidx.compose.ui.graphics.H.b((!((C1034j) interfaceC1084f.x(o10)).i() ? ((double) Q3.d.D(j17)) < 0.5d : ((double) Q3.d.D(j17)) > 0.5d) ? 0.87f : 1.0f, jF2);
        long jB9 = (i10 & 64) != 0 ? androidx.compose.ui.graphics.H.b(0.42f, ((C1034j) interfaceC1084f.x(o10)).e()) : j12;
        if ((i10 & 128) != 0) {
            c10 = c11;
            long j18 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(c10)).f13506a;
            if (((C1034j) interfaceC1084f.x(o10)).i()) {
                Q3.d.D(j18);
            } else {
                Q3.d.D(j18);
            }
            jB3 = androidx.compose.ui.graphics.H.b(0.38f, jB9);
        } else {
            c10 = c11;
            jB3 = j13;
        }
        long jB10 = ((C1034j) interfaceC1084f.x(o10)).b();
        long j19 = jB9;
        long jB11 = androidx.compose.ui.graphics.H.b(0.54f, ((C1034j) interfaceC1084f.x(o10)).e());
        long j20 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(c10)).f13506a;
        if (((C1034j) interfaceC1084f.x(o10)).i()) {
            Q3.d.D(j20);
        } else {
            Q3.d.D(j20);
        }
        long jB12 = androidx.compose.ui.graphics.H.b(0.38f, jB11);
        long jB13 = androidx.compose.ui.graphics.H.b(0.54f, ((C1034j) interfaceC1084f.x(o10)).e());
        long j21 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(c10)).f13506a;
        if (((C1034j) interfaceC1084f.x(o10)).i()) {
            Q3.d.D(j21);
        } else {
            Q3.d.D(j21);
        }
        long jB14 = androidx.compose.ui.graphics.H.b(0.38f, jB13);
        long jB15 = ((C1034j) interfaceC1084f.x(o10)).b();
        long jF3 = ((C1034j) interfaceC1084f.x(o10)).f();
        long j22 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(c10)).f13506a;
        long jB16 = androidx.compose.ui.graphics.H.b((!((C1034j) interfaceC1084f.x(o10)).i() ? ((double) Q3.d.D(j22)) < 0.5d : ((double) Q3.d.D(j22)) > 0.5d) ? 0.87f : 1.0f, jF3);
        if ((65536 & i10) != 0) {
            long jE = ((C1034j) interfaceC1084f.x(o10)).e();
            long j23 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(c10)).f13506a;
            jB4 = androidx.compose.ui.graphics.H.b((!((C1034j) interfaceC1084f.x(o10)).i() ? ((double) Q3.d.D(j23)) < 0.5d : ((double) Q3.d.D(j23)) > 0.5d) ? 0.6f : 0.74f, jE);
        } else {
            jB4 = j14;
        }
        if ((i10 & 131072) != 0) {
            long j24 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(c10)).f13506a;
            if (((C1034j) interfaceC1084f.x(o10)).i()) {
                Q3.d.D(j24);
            } else {
                Q3.d.D(j24);
            }
            jB5 = androidx.compose.ui.graphics.H.b(0.38f, jB4);
        } else {
            jB5 = j15;
        }
        long jB17 = ((C1034j) interfaceC1084f.x(o10)).b();
        long jE2 = ((C1034j) interfaceC1084f.x(o10)).e();
        long j25 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(c10)).f13506a;
        long jB18 = androidx.compose.ui.graphics.H.b((!((C1034j) interfaceC1084f.x(o10)).i() ? ((double) Q3.d.D(j25)) < 0.5d : ((double) Q3.d.D(j25)) > 0.5d) ? 0.6f : 0.74f, jE2);
        long j26 = ((androidx.compose.ui.graphics.H) interfaceC1084f.x(c10)).f13506a;
        if (((C1034j) interfaceC1084f.x(o10)).i()) {
            Q3.d.D(j26);
        } else {
            Q3.d.D(j26);
        }
        return new r(jB, jB2, jF, jB7, jB8, j19, jB10, jB3, jB11, jB12, jB11, jB13, jB14, jB15, jB6, jB16, jB4, jB5, jB17, jB18, androidx.compose.ui.graphics.H.b(0.38f, jB18));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:104:0x012d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0130  */
    /* JADX WARN: Code duplicated, block: B:109:0x0138  */
    /* JADX WARN: Code duplicated, block: B:110:0x013d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0143  */
    /* JADX WARN: Code duplicated, block: B:114:0x0149  */
    /* JADX WARN: Code duplicated, block: B:115:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0151  */
    /* JADX WARN: Code duplicated, block: B:120:0x0157  */
    /* JADX WARN: Code duplicated, block: B:122:0x015b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x016d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0173  */
    /* JADX WARN: Code duplicated, block: B:133:0x0177  */
    /* JADX WARN: Code duplicated, block: B:136:0x0182 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x0189  */
    /* JADX WARN: Code duplicated, block: B:142:0x018f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0193  */
    /* JADX WARN: Code duplicated, block: B:147:0x019c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:156:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:158:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:161:0x01be  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:169:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:172:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:174:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:187:0x0213 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:188:0x0215  */
    /* JADX WARN: Code duplicated, block: B:189:0x0218  */
    /* JADX WARN: Code duplicated, block: B:192:0x021d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0220  */
    /* JADX WARN: Code duplicated, block: B:196:0x0223  */
    /* JADX WARN: Code duplicated, block: B:197:0x0225  */
    /* JADX WARN: Code duplicated, block: B:200:0x022a  */
    /* JADX WARN: Code duplicated, block: B:203:0x0230  */
    /* JADX WARN: Code duplicated, block: B:204:0x0254  */
    /* JADX WARN: Code duplicated, block: B:207:0x025a  */
    /* JADX WARN: Code duplicated, block: B:208:0x0274  */
    /* JADX WARN: Code duplicated, block: B:211:0x027a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x027c  */
    /* JADX WARN: Code duplicated, block: B:213:0x028a  */
    /* JADX WARN: Code duplicated, block: B:215:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:217:0x033d  */
    /* JADX WARN: Code duplicated, block: B:220:0x0353  */
    /* JADX WARN: Code duplicated, block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
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
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    public final void a(final String str, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final boolean z10, final boolean z11, final androidx.compose.ui.text.input.E e10, final androidx.compose.foundation.interaction.j jVar, boolean z12, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5, l0 l0Var, U u10, androidx.compose.foundation.layout.L l10, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6;
        int i21;
        int i22;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z13;
        final boolean z14;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8;
        l0 l0Var2;
        U u11;
        androidx.compose.foundation.layout.L l11;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar10;
        C1105p0 c1105p0V;
        boolean z15;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12;
        l0 l0VarB;
        U uB;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13;
        androidx.compose.foundation.layout.L l12;
        boolean z16;
        int i30;
        l0 l0Var3;
        androidx.compose.foundation.layout.N n10;
        C1086g c1086gP = interfaceC1084f.p(-1391531252);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = (c1086gP.K(str) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i13 |= c1086gP.k(pVar) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                if ((i10 & 384) == 0) {
                    if (c1086gP.c(z10)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i13 |= i14;
                }
                if ((i12 & 8) != 0) {
                    if ((i10 & 3072) == 0) {
                        if (c1086gP.c(z11)) {
                            i15 = 2048;
                        } else {
                            i15 = 1024;
                        }
                        i13 |= i15;
                    }
                    if ((i12 & 16) != 0) {
                        if ((i10 & 24576) == 0) {
                            if (c1086gP.K(e10)) {
                                i16 = 16384;
                            } else {
                                i16 = 8192;
                            }
                            i13 |= i16;
                        }
                        if ((i12 & 32) != 0) {
                            i13 |= 196608;
                        } else if ((i10 & 196608) == 0) {
                            if (c1086gP.K(jVar)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                            i13 |= i17;
                        }
                        i18 = i12 & 64;
                        if (i18 != 0) {
                            i13 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (c1086gP.c(z12)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                            i13 |= i19;
                        }
                        i20 = i12 & 128;
                        if (i20 != 0) {
                            i13 |= 12582912;
                            pVar6 = pVar2;
                        } else {
                            pVar6 = pVar2;
                            if ((i10 & 12582912) == 0) {
                                if (c1086gP.k(pVar6)) {
                                    i21 = 8388608;
                                } else {
                                    i21 = 4194304;
                                }
                                i13 |= i21;
                            }
                        }
                        i22 = i12 & 256;
                        if (i22 != 0) {
                            i13 |= 100663296;
                            pVar7 = pVar3;
                        } else {
                            pVar7 = pVar3;
                            if ((i10 & 100663296) == 0) {
                                if (c1086gP.k(pVar7)) {
                                    i23 = 67108864;
                                } else {
                                    i23 = 33554432;
                                }
                                i13 |= i23;
                            }
                        }
                        i24 = i12 & 512;
                        if (i24 != 0) {
                            i13 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c1086gP.k(pVar4)) {
                                i25 = 536870912;
                            } else {
                                i25 = 268435456;
                            }
                            i13 |= i25;
                        }
                        i26 = i12 & 1024;
                        if (i26 != 0) {
                            i27 = i11 | 6;
                        } else if ((i11 & 6) == 0) {
                            if (c1086gP.k(pVar5)) {
                                i28 = 4;
                            } else {
                                i28 = 2;
                            }
                            i27 = i11 | i28;
                        } else {
                            i27 = i11;
                        }
                        if ((i11 & 48) != 0) {
                            i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                        }
                        if ((i11 & 384) != 0) {
                            i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
                        }
                        if ((i11 & 3072) != 0) {
                            i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
                        }
                        i29 = i27;
                        if ((i12 & 16384) != 0) {
                            if ((i11 & 24576) == 0) {
                                i29 |= c1086gP.K(this) ? 16384 : 8192;
                            }
                            if ((i13 & 306783379) == 306783378 || (i29 & 9363) != 9362) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (c1086gP.C(i13 & 1, z13)) {
                                c1086gP.r0();
                                if ((i10 & 1) != 0 || c1086gP.a0()) {
                                    if (i18 != 0) {
                                        z15 = false;
                                    } else {
                                        z15 = z12;
                                    }
                                    if (i20 != 0) {
                                        pVar6 = null;
                                    }
                                    if (i22 != 0) {
                                        pVar7 = null;
                                    }
                                    if (i24 != 0) {
                                        pVar11 = null;
                                    } else {
                                        pVar11 = pVar4;
                                    }
                                    pVar12 = i26 == 0 ? pVar5 : null;
                                    if ((i12 & 2048) != 0) {
                                        p270w.a aVar = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                        w.c.a aVar2 = p270w.c.f47677a;
                                        l0VarB = p270w.a.b(aVar, null, null, aVar2, aVar2, 3);
                                        i29 &= -113;
                                    } else {
                                        l0VarB = l0Var;
                                    }
                                    if ((i12 & 4096) != 0) {
                                        uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                        i29 &= -897;
                                    } else {
                                        uB = u10;
                                    }
                                    if ((i12 & 8192) != 0) {
                                        if (pVar6 == null) {
                                            float f10 = TextFieldImplKt.f11839a;
                                            n10 = new androidx.compose.foundation.layout.N(f10, f10, f10, f10);
                                        } else {
                                            float f11 = TextFieldImplKt.f11839a;
                                            n10 = new androidx.compose.foundation.layout.N(f11, TextFieldKt.f11841a, f11, TextFieldKt.f11842b);
                                        }
                                        pVar13 = pVar11;
                                        l12 = n10;
                                        i30 = i29 & (-7169);
                                        l0Var3 = l0VarB;
                                        z16 = z15;
                                    } else {
                                        l0 l0Var4 = l0VarB;
                                        boolean z17 = z15;
                                        pVar13 = pVar11;
                                        l12 = l10;
                                        z16 = z17;
                                        i30 = i29;
                                        l0Var3 = l0Var4;
                                    }
                                } else {
                                    c1086gP.w();
                                    if ((i12 & 2048) != 0) {
                                        i29 &= -113;
                                    }
                                    if ((i12 & 4096) != 0) {
                                        i29 &= -897;
                                    }
                                    if ((i12 & 8192) != 0) {
                                        i29 &= -7169;
                                    }
                                    z16 = z12;
                                    pVar13 = pVar4;
                                    pVar12 = pVar5;
                                    uB = u10;
                                    l12 = l10;
                                    i30 = i29;
                                    l0Var3 = l0Var;
                                }
                                c1086gP.U();
                                int i31 = i13 << 3;
                                int i32 = i13 >> 9;
                                int i33 = i30 << 6;
                                TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i31 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31 & 896) | ((i13 >> 3) & 7168) | (i32 & 57344) | (i32 & 458752) | (i32 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i33 & 7168) | (i33 & 57344));
                                z14 = z16;
                                pVar8 = pVar13;
                                l0Var2 = l0Var3;
                                l11 = l12;
                                u11 = uB;
                                pVar9 = pVar7;
                                pVar10 = pVar12;
                            } else {
                                c1086gP.w();
                                z14 = z12;
                                pVar8 = pVar4;
                                l0Var2 = l0Var;
                                u11 = u10;
                                l11 = l10;
                                pVar9 = pVar7;
                                pVar10 = pVar5;
                            }
                            c1105p0V = c1086gP.V();
                            if (c1105p0V != null) {
                                final l0 l0Var5 = l0Var2;
                                final U u12 = u11;
                                final androidx.compose.foundation.layout.L l13 = l11;
                                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // Ia.p
                                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                        num.intValue();
                                        this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var5, u12, l13, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                        return p293xa.r.f47939a;
                                    }
                                };
                            }
                        }
                        i29 |= 24576;
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c1086gP.C(i13 & 1, z13)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z15 = false;
                                } else {
                                    z15 = z12;
                                }
                                if (i20 != 0) {
                                    pVar6 = null;
                                }
                                if (i22 != 0) {
                                    pVar7 = null;
                                }
                                if (i24 != 0) {
                                    pVar11 = null;
                                } else {
                                    pVar11 = pVar4;
                                }
                                if (i26 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    p270w.a aVar3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                    w.c.a aVar4 = p270w.c.f47677a;
                                    l0VarB = p270w.a.b(aVar3, null, null, aVar4, aVar4, 3);
                                    i29 &= -113;
                                } else {
                                    l0VarB = l0Var;
                                }
                                if ((i12 & 4096) != 0) {
                                    uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                    i29 &= -897;
                                } else {
                                    uB = u10;
                                }
                                if ((i12 & 8192) != 0) {
                                    if (pVar6 == null) {
                                        float f12 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f12, f12, f12, f12);
                                    } else {
                                        float f13 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f13, TextFieldKt.f11841a, f13, TextFieldKt.f11842b);
                                    }
                                    pVar13 = pVar11;
                                    l12 = n10;
                                    i30 = i29 & (-7169);
                                    l0Var3 = l0VarB;
                                    z16 = z15;
                                } else {
                                    l0 l0Var6 = l0VarB;
                                    boolean z18 = z15;
                                    pVar13 = pVar11;
                                    l12 = l10;
                                    z16 = z18;
                                    i30 = i29;
                                    l0Var3 = l0Var6;
                                }
                            } else {
                                if (i18 != 0) {
                                    z15 = false;
                                } else {
                                    z15 = z12;
                                }
                                if (i20 != 0) {
                                    pVar6 = null;
                                }
                                if (i22 != 0) {
                                    pVar7 = null;
                                }
                                if (i24 != 0) {
                                    pVar11 = null;
                                } else {
                                    pVar11 = pVar4;
                                }
                                if (i26 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    p270w.a aVar5 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                    w.c.a aVar6 = p270w.c.f47677a;
                                    l0VarB = p270w.a.b(aVar5, null, null, aVar6, aVar6, 3);
                                    i29 &= -113;
                                } else {
                                    l0VarB = l0Var;
                                }
                                if ((i12 & 4096) != 0) {
                                    uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                    i29 &= -897;
                                } else {
                                    uB = u10;
                                }
                                if ((i12 & 8192) != 0) {
                                    if (pVar6 == null) {
                                        float f14 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f14, f14, f14, f14);
                                    } else {
                                        float f15 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f15, TextFieldKt.f11841a, f15, TextFieldKt.f11842b);
                                    }
                                    pVar13 = pVar11;
                                    l12 = n10;
                                    i30 = i29 & (-7169);
                                    l0Var3 = l0VarB;
                                    z16 = z15;
                                } else {
                                    l0 l0Var7 = l0VarB;
                                    boolean z19 = z15;
                                    pVar13 = pVar11;
                                    l12 = l10;
                                    z16 = z19;
                                    i30 = i29;
                                    l0Var3 = l0Var7;
                                }
                            }
                            c1086gP.U();
                            int i34 = i13 << 3;
                            int i35 = i13 >> 9;
                            int i36 = i30 << 6;
                            TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i34 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i34 & 896) | ((i13 >> 3) & 7168) | (i35 & 57344) | (i35 & 458752) | (i35 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i36 & 7168) | (i36 & 57344));
                            z14 = z16;
                            pVar8 = pVar13;
                            l0Var2 = l0Var3;
                            l11 = l12;
                            u11 = uB;
                            pVar9 = pVar7;
                            pVar10 = pVar12;
                        } else {
                            c1086gP.w();
                            z14 = z12;
                            pVar8 = pVar4;
                            l0Var2 = l0Var;
                            u11 = u10;
                            l11 = l10;
                            pVar9 = pVar7;
                            pVar10 = pVar5;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final l0 l0Var8 = l0Var2;
                            final U u13 = u11;
                            final androidx.compose.foundation.layout.L l14 = l11;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var8, u13, l14, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i13 |= 24576;
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.K(jVar)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 64;
                    if (i18 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.c(z12)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 128;
                    if (i20 != 0) {
                        i13 |= 12582912;
                        pVar6 = pVar2;
                    } else {
                        pVar6 = pVar2;
                        if ((i10 & 12582912) == 0) {
                            if (c1086gP.k(pVar6)) {
                                i21 = 8388608;
                            } else {
                                i21 = 4194304;
                            }
                            i13 |= i21;
                        }
                    }
                    i22 = i12 & 256;
                    if (i22 != 0) {
                        i13 |= 100663296;
                        pVar7 = pVar3;
                    } else {
                        pVar7 = pVar3;
                        if ((i10 & 100663296) == 0) {
                            if (c1086gP.k(pVar7)) {
                                i23 = 67108864;
                            } else {
                                i23 = 33554432;
                            }
                            i13 |= i23;
                        }
                    }
                    i24 = i12 & 512;
                    if (i24 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(pVar4)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i13 |= i25;
                    }
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c1086gP.k(pVar5)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                    }
                    if ((i11 & 384) != 0) {
                        i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
                    }
                    if ((i11 & 3072) != 0) {
                        i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
                    }
                    i29 = i27;
                    if ((i12 & 16384) != 0) {
                        if ((i11 & 24576) == 0) {
                            i29 |= c1086gP.K(this) ? 16384 : 8192;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c1086gP.C(i13 & 1, z13)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z15 = false;
                                } else {
                                    z15 = z12;
                                }
                                if (i20 != 0) {
                                    pVar6 = null;
                                }
                                if (i22 != 0) {
                                    pVar7 = null;
                                }
                                if (i24 != 0) {
                                    pVar11 = null;
                                } else {
                                    pVar11 = pVar4;
                                }
                                if (i26 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    p270w.a aVar7 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                    w.c.a aVar8 = p270w.c.f47677a;
                                    l0VarB = p270w.a.b(aVar7, null, null, aVar8, aVar8, 3);
                                    i29 &= -113;
                                } else {
                                    l0VarB = l0Var;
                                }
                                if ((i12 & 4096) != 0) {
                                    uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                    i29 &= -897;
                                } else {
                                    uB = u10;
                                }
                                if ((i12 & 8192) != 0) {
                                    if (pVar6 == null) {
                                        float f16 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f16, f16, f16, f16);
                                    } else {
                                        float f17 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f17, TextFieldKt.f11841a, f17, TextFieldKt.f11842b);
                                    }
                                    pVar13 = pVar11;
                                    l12 = n10;
                                    i30 = i29 & (-7169);
                                    l0Var3 = l0VarB;
                                    z16 = z15;
                                } else {
                                    l0 l0Var9 = l0VarB;
                                    boolean z110 = z15;
                                    pVar13 = pVar11;
                                    l12 = l10;
                                    z16 = z110;
                                    i30 = i29;
                                    l0Var3 = l0Var9;
                                }
                            } else {
                                if (i18 != 0) {
                                    z15 = false;
                                } else {
                                    z15 = z12;
                                }
                                if (i20 != 0) {
                                    pVar6 = null;
                                }
                                if (i22 != 0) {
                                    pVar7 = null;
                                }
                                if (i24 != 0) {
                                    pVar11 = null;
                                } else {
                                    pVar11 = pVar4;
                                }
                                if (i26 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    p270w.a aVar9 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                    w.c.a aVar10 = p270w.c.f47677a;
                                    l0VarB = p270w.a.b(aVar9, null, null, aVar10, aVar10, 3);
                                    i29 &= -113;
                                } else {
                                    l0VarB = l0Var;
                                }
                                if ((i12 & 4096) != 0) {
                                    uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                    i29 &= -897;
                                } else {
                                    uB = u10;
                                }
                                if ((i12 & 8192) != 0) {
                                    if (pVar6 == null) {
                                        float f18 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f18, f18, f18, f18);
                                    } else {
                                        float f19 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f19, TextFieldKt.f11841a, f19, TextFieldKt.f11842b);
                                    }
                                    pVar13 = pVar11;
                                    l12 = n10;
                                    i30 = i29 & (-7169);
                                    l0Var3 = l0VarB;
                                    z16 = z15;
                                } else {
                                    l0 l0Var10 = l0VarB;
                                    boolean z111 = z15;
                                    pVar13 = pVar11;
                                    l12 = l10;
                                    z16 = z111;
                                    i30 = i29;
                                    l0Var3 = l0Var10;
                                }
                            }
                            c1086gP.U();
                            int i37 = i13 << 3;
                            int i38 = i13 >> 9;
                            int i39 = i30 << 6;
                            TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i37 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i37 & 896) | ((i13 >> 3) & 7168) | (i38 & 57344) | (i38 & 458752) | (i38 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i39 & 7168) | (i39 & 57344));
                            z14 = z16;
                            pVar8 = pVar13;
                            l0Var2 = l0Var3;
                            l11 = l12;
                            u11 = uB;
                            pVar9 = pVar7;
                            pVar10 = pVar12;
                        } else {
                            c1086gP.w();
                            z14 = z12;
                            pVar8 = pVar4;
                            l0Var2 = l0Var;
                            u11 = u10;
                            l11 = l10;
                            pVar9 = pVar7;
                            pVar10 = pVar5;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final l0 l0Var11 = l0Var2;
                            final U u14 = u11;
                            final androidx.compose.foundation.layout.L l15 = l11;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var11, u14, l15, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i29 |= 24576;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c1086gP.C(i13 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar11 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar12 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar11, null, null, aVar12, aVar12, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f110 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f110, f110, f110, f110);
                                } else {
                                    float f111 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f111, TextFieldKt.f11841a, f111, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var12 = l0VarB;
                                boolean z112 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z112;
                                i30 = i29;
                                l0Var3 = l0Var12;
                            }
                        } else {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar13 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar14 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar13, null, null, aVar14, aVar14, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f112 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f112, f112, f112, f112);
                                } else {
                                    float f113 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f113, TextFieldKt.f11841a, f113, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var13 = l0VarB;
                                boolean z113 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z113;
                                i30 = i29;
                                l0Var3 = l0Var13;
                            }
                        }
                        c1086gP.U();
                        int i310 = i13 << 3;
                        int i311 = i13 >> 9;
                        int i312 = i30 << 6;
                        TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i310 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i310 & 896) | ((i13 >> 3) & 7168) | (i311 & 57344) | (i311 & 458752) | (i311 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i312 & 7168) | (i312 & 57344));
                        z14 = z16;
                        pVar8 = pVar13;
                        l0Var2 = l0Var3;
                        l11 = l12;
                        u11 = uB;
                        pVar9 = pVar7;
                        pVar10 = pVar12;
                    } else {
                        c1086gP.w();
                        z14 = z12;
                        pVar8 = pVar4;
                        l0Var2 = l0Var;
                        u11 = u10;
                        l11 = l10;
                        pVar9 = pVar7;
                        pVar10 = pVar5;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final l0 l0Var14 = l0Var2;
                        final U u15 = u11;
                        final androidx.compose.foundation.layout.L l16 = l11;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var14, u15, l16, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 3072;
                if ((i12 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.K(e10)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i13 |= i16;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.K(jVar)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 64;
                    if (i18 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.c(z12)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 128;
                    if (i20 != 0) {
                        i13 |= 12582912;
                        pVar6 = pVar2;
                    } else {
                        pVar6 = pVar2;
                        if ((i10 & 12582912) == 0) {
                            if (c1086gP.k(pVar6)) {
                                i21 = 8388608;
                            } else {
                                i21 = 4194304;
                            }
                            i13 |= i21;
                        }
                    }
                    i22 = i12 & 256;
                    if (i22 != 0) {
                        i13 |= 100663296;
                        pVar7 = pVar3;
                    } else {
                        pVar7 = pVar3;
                        if ((i10 & 100663296) == 0) {
                            if (c1086gP.k(pVar7)) {
                                i23 = 67108864;
                            } else {
                                i23 = 33554432;
                            }
                            i13 |= i23;
                        }
                    }
                    i24 = i12 & 512;
                    if (i24 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(pVar4)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i13 |= i25;
                    }
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c1086gP.k(pVar5)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                    }
                    if ((i11 & 384) != 0) {
                        i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
                    }
                    if ((i11 & 3072) != 0) {
                        i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
                    }
                    i29 = i27;
                    if ((i12 & 16384) != 0) {
                        if ((i11 & 24576) == 0) {
                            i29 |= c1086gP.K(this) ? 16384 : 8192;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c1086gP.C(i13 & 1, z13)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z15 = false;
                                } else {
                                    z15 = z12;
                                }
                                if (i20 != 0) {
                                    pVar6 = null;
                                }
                                if (i22 != 0) {
                                    pVar7 = null;
                                }
                                if (i24 != 0) {
                                    pVar11 = null;
                                } else {
                                    pVar11 = pVar4;
                                }
                                if (i26 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    p270w.a aVar15 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                    w.c.a aVar16 = p270w.c.f47677a;
                                    l0VarB = p270w.a.b(aVar15, null, null, aVar16, aVar16, 3);
                                    i29 &= -113;
                                } else {
                                    l0VarB = l0Var;
                                }
                                if ((i12 & 4096) != 0) {
                                    uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                    i29 &= -897;
                                } else {
                                    uB = u10;
                                }
                                if ((i12 & 8192) != 0) {
                                    if (pVar6 == null) {
                                        float f114 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f114, f114, f114, f114);
                                    } else {
                                        float f115 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f115, TextFieldKt.f11841a, f115, TextFieldKt.f11842b);
                                    }
                                    pVar13 = pVar11;
                                    l12 = n10;
                                    i30 = i29 & (-7169);
                                    l0Var3 = l0VarB;
                                    z16 = z15;
                                } else {
                                    l0 l0Var15 = l0VarB;
                                    boolean z114 = z15;
                                    pVar13 = pVar11;
                                    l12 = l10;
                                    z16 = z114;
                                    i30 = i29;
                                    l0Var3 = l0Var15;
                                }
                            } else {
                                if (i18 != 0) {
                                    z15 = false;
                                } else {
                                    z15 = z12;
                                }
                                if (i20 != 0) {
                                    pVar6 = null;
                                }
                                if (i22 != 0) {
                                    pVar7 = null;
                                }
                                if (i24 != 0) {
                                    pVar11 = null;
                                } else {
                                    pVar11 = pVar4;
                                }
                                if (i26 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    p270w.a aVar17 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                    w.c.a aVar18 = p270w.c.f47677a;
                                    l0VarB = p270w.a.b(aVar17, null, null, aVar18, aVar18, 3);
                                    i29 &= -113;
                                } else {
                                    l0VarB = l0Var;
                                }
                                if ((i12 & 4096) != 0) {
                                    uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                    i29 &= -897;
                                } else {
                                    uB = u10;
                                }
                                if ((i12 & 8192) != 0) {
                                    if (pVar6 == null) {
                                        float f116 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f116, f116, f116, f116);
                                    } else {
                                        float f117 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f117, TextFieldKt.f11841a, f117, TextFieldKt.f11842b);
                                    }
                                    pVar13 = pVar11;
                                    l12 = n10;
                                    i30 = i29 & (-7169);
                                    l0Var3 = l0VarB;
                                    z16 = z15;
                                } else {
                                    l0 l0Var16 = l0VarB;
                                    boolean z115 = z15;
                                    pVar13 = pVar11;
                                    l12 = l10;
                                    z16 = z115;
                                    i30 = i29;
                                    l0Var3 = l0Var16;
                                }
                            }
                            c1086gP.U();
                            int i313 = i13 << 3;
                            int i314 = i13 >> 9;
                            int i315 = i30 << 6;
                            TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i313 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i313 & 896) | ((i13 >> 3) & 7168) | (i314 & 57344) | (i314 & 458752) | (i314 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i315 & 7168) | (i315 & 57344));
                            z14 = z16;
                            pVar8 = pVar13;
                            l0Var2 = l0Var3;
                            l11 = l12;
                            u11 = uB;
                            pVar9 = pVar7;
                            pVar10 = pVar12;
                        } else {
                            c1086gP.w();
                            z14 = z12;
                            pVar8 = pVar4;
                            l0Var2 = l0Var;
                            u11 = u10;
                            l11 = l10;
                            pVar9 = pVar7;
                            pVar10 = pVar5;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final l0 l0Var17 = l0Var2;
                            final U u16 = u11;
                            final androidx.compose.foundation.layout.L l17 = l11;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var17, u16, l17, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i29 |= 24576;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c1086gP.C(i13 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar19 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar110 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar19, null, null, aVar110, aVar110, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f118 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f118, f118, f118, f118);
                                } else {
                                    float f119 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f119, TextFieldKt.f11841a, f119, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var18 = l0VarB;
                                boolean z116 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z116;
                                i30 = i29;
                                l0Var3 = l0Var18;
                            }
                        } else {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar112 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar111, null, null, aVar112, aVar112, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f1110 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f1110, f1110, f1110, f1110);
                                } else {
                                    float f1111 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f1111, TextFieldKt.f11841a, f1111, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var19 = l0VarB;
                                boolean z117 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z117;
                                i30 = i29;
                                l0Var3 = l0Var19;
                            }
                        }
                        c1086gP.U();
                        int i316 = i13 << 3;
                        int i317 = i13 >> 9;
                        int i318 = i30 << 6;
                        TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i316 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i316 & 896) | ((i13 >> 3) & 7168) | (i317 & 57344) | (i317 & 458752) | (i317 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i318 & 7168) | (i318 & 57344));
                        z14 = z16;
                        pVar8 = pVar13;
                        l0Var2 = l0Var3;
                        l11 = l12;
                        u11 = uB;
                        pVar9 = pVar7;
                        pVar10 = pVar12;
                    } else {
                        c1086gP.w();
                        z14 = z12;
                        pVar8 = pVar4;
                        l0Var2 = l0Var;
                        u11 = u10;
                        l11 = l10;
                        pVar9 = pVar7;
                        pVar10 = pVar5;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final l0 l0Var110 = l0Var2;
                        final U u17 = u11;
                        final androidx.compose.foundation.layout.L l18 = l11;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var110, u17, l18, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.K(jVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.c(z12)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    i13 |= 12582912;
                    pVar6 = pVar2;
                } else {
                    pVar6 = pVar2;
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.k(pVar6)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                    pVar7 = pVar3;
                } else {
                    pVar7 = pVar3;
                    if ((i10 & 100663296) == 0) {
                        if (c1086gP.k(pVar7)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i13 |= i23;
                    }
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i13 |= i25;
                }
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.k(pVar5)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i11 & 48) != 0) {
                    i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                }
                if ((i11 & 384) != 0) {
                    i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
                }
                if ((i11 & 3072) != 0) {
                    i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
                }
                i29 = i27;
                if ((i12 & 16384) != 0) {
                    if ((i11 & 24576) == 0) {
                        i29 |= c1086gP.K(this) ? 16384 : 8192;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c1086gP.C(i13 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar114 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar113, null, null, aVar114, aVar114, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f1112 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f1112, f1112, f1112, f1112);
                                } else {
                                    float f1113 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f1113, TextFieldKt.f11841a, f1113, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var111 = l0VarB;
                                boolean z118 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z118;
                                i30 = i29;
                                l0Var3 = l0Var111;
                            }
                        } else {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar116 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar115, null, null, aVar116, aVar116, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f1114 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f1114, f1114, f1114, f1114);
                                } else {
                                    float f1115 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f1115, TextFieldKt.f11841a, f1115, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var112 = l0VarB;
                                boolean z119 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z119;
                                i30 = i29;
                                l0Var3 = l0Var112;
                            }
                        }
                        c1086gP.U();
                        int i319 = i13 << 3;
                        int i3110 = i13 >> 9;
                        int i3111 = i30 << 6;
                        TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i319 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i319 & 896) | ((i13 >> 3) & 7168) | (i3110 & 57344) | (i3110 & 458752) | (i3110 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i3111 & 7168) | (i3111 & 57344));
                        z14 = z16;
                        pVar8 = pVar13;
                        l0Var2 = l0Var3;
                        l11 = l12;
                        u11 = uB;
                        pVar9 = pVar7;
                        pVar10 = pVar12;
                    } else {
                        c1086gP.w();
                        z14 = z12;
                        pVar8 = pVar4;
                        l0Var2 = l0Var;
                        u11 = u10;
                        l11 = l10;
                        pVar9 = pVar7;
                        pVar10 = pVar5;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final l0 l0Var113 = l0Var2;
                        final U u18 = u11;
                        final androidx.compose.foundation.layout.L l19 = l11;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var113, u18, l19, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i29 |= 24576;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i13 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar118 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar117, null, null, aVar118, aVar118, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f1116 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1116, f1116, f1116, f1116);
                            } else {
                                float f1117 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1117, TextFieldKt.f11841a, f1117, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var114 = l0VarB;
                            boolean z1110 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z1110;
                            i30 = i29;
                            l0Var3 = l0Var114;
                        }
                    } else {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar1110 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar119, null, null, aVar1110, aVar1110, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f1118 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1118, f1118, f1118, f1118);
                            } else {
                                float f1119 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1119, TextFieldKt.f11841a, f1119, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var115 = l0VarB;
                            boolean z1111 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z1111;
                            i30 = i29;
                            l0Var3 = l0Var115;
                        }
                    }
                    c1086gP.U();
                    int i3112 = i13 << 3;
                    int i3113 = i13 >> 9;
                    int i3114 = i30 << 6;
                    TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i3112 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3112 & 896) | ((i13 >> 3) & 7168) | (i3113 & 57344) | (i3113 & 458752) | (i3113 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i3114 & 7168) | (i3114 & 57344));
                    z14 = z16;
                    pVar8 = pVar13;
                    l0Var2 = l0Var3;
                    l11 = l12;
                    u11 = uB;
                    pVar9 = pVar7;
                    pVar10 = pVar12;
                } else {
                    c1086gP.w();
                    z14 = z12;
                    pVar8 = pVar4;
                    l0Var2 = l0Var;
                    u11 = u10;
                    l11 = l10;
                    pVar9 = pVar7;
                    pVar10 = pVar5;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final l0 l0Var116 = l0Var2;
                    final U u19 = u11;
                    final androidx.compose.foundation.layout.L l110 = l11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var116, u19, l110, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 384;
            if ((i12 & 8) != 0) {
                if ((i10 & 3072) == 0) {
                    if (c1086gP.c(z11)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i12 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.K(e10)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i13 |= i16;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.K(jVar)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 64;
                    if (i18 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.c(z12)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 128;
                    if (i20 != 0) {
                        i13 |= 12582912;
                        pVar6 = pVar2;
                    } else {
                        pVar6 = pVar2;
                        if ((i10 & 12582912) == 0) {
                            if (c1086gP.k(pVar6)) {
                                i21 = 8388608;
                            } else {
                                i21 = 4194304;
                            }
                            i13 |= i21;
                        }
                    }
                    i22 = i12 & 256;
                    if (i22 != 0) {
                        i13 |= 100663296;
                        pVar7 = pVar3;
                    } else {
                        pVar7 = pVar3;
                        if ((i10 & 100663296) == 0) {
                            if (c1086gP.k(pVar7)) {
                                i23 = 67108864;
                            } else {
                                i23 = 33554432;
                            }
                            i13 |= i23;
                        }
                    }
                    i24 = i12 & 512;
                    if (i24 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(pVar4)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i13 |= i25;
                    }
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c1086gP.k(pVar5)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                    }
                    if ((i11 & 384) != 0) {
                        i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
                    }
                    if ((i11 & 3072) != 0) {
                        i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
                    }
                    i29 = i27;
                    if ((i12 & 16384) != 0) {
                        if ((i11 & 24576) == 0) {
                            i29 |= c1086gP.K(this) ? 16384 : 8192;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c1086gP.C(i13 & 1, z13)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z15 = false;
                                } else {
                                    z15 = z12;
                                }
                                if (i20 != 0) {
                                    pVar6 = null;
                                }
                                if (i22 != 0) {
                                    pVar7 = null;
                                }
                                if (i24 != 0) {
                                    pVar11 = null;
                                } else {
                                    pVar11 = pVar4;
                                }
                                if (i26 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    p270w.a aVar1111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                    w.c.a aVar1112 = p270w.c.f47677a;
                                    l0VarB = p270w.a.b(aVar1111, null, null, aVar1112, aVar1112, 3);
                                    i29 &= -113;
                                } else {
                                    l0VarB = l0Var;
                                }
                                if ((i12 & 4096) != 0) {
                                    uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                    i29 &= -897;
                                } else {
                                    uB = u10;
                                }
                                if ((i12 & 8192) != 0) {
                                    if (pVar6 == null) {
                                        float f11110 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f11110, f11110, f11110, f11110);
                                    } else {
                                        float f11111 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f11111, TextFieldKt.f11841a, f11111, TextFieldKt.f11842b);
                                    }
                                    pVar13 = pVar11;
                                    l12 = n10;
                                    i30 = i29 & (-7169);
                                    l0Var3 = l0VarB;
                                    z16 = z15;
                                } else {
                                    l0 l0Var117 = l0VarB;
                                    boolean z1112 = z15;
                                    pVar13 = pVar11;
                                    l12 = l10;
                                    z16 = z1112;
                                    i30 = i29;
                                    l0Var3 = l0Var117;
                                }
                            } else {
                                if (i18 != 0) {
                                    z15 = false;
                                } else {
                                    z15 = z12;
                                }
                                if (i20 != 0) {
                                    pVar6 = null;
                                }
                                if (i22 != 0) {
                                    pVar7 = null;
                                }
                                if (i24 != 0) {
                                    pVar11 = null;
                                } else {
                                    pVar11 = pVar4;
                                }
                                if (i26 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    p270w.a aVar1113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                    w.c.a aVar1114 = p270w.c.f47677a;
                                    l0VarB = p270w.a.b(aVar1113, null, null, aVar1114, aVar1114, 3);
                                    i29 &= -113;
                                } else {
                                    l0VarB = l0Var;
                                }
                                if ((i12 & 4096) != 0) {
                                    uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                    i29 &= -897;
                                } else {
                                    uB = u10;
                                }
                                if ((i12 & 8192) != 0) {
                                    if (pVar6 == null) {
                                        float f11112 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f11112, f11112, f11112, f11112);
                                    } else {
                                        float f11113 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f11113, TextFieldKt.f11841a, f11113, TextFieldKt.f11842b);
                                    }
                                    pVar13 = pVar11;
                                    l12 = n10;
                                    i30 = i29 & (-7169);
                                    l0Var3 = l0VarB;
                                    z16 = z15;
                                } else {
                                    l0 l0Var118 = l0VarB;
                                    boolean z1113 = z15;
                                    pVar13 = pVar11;
                                    l12 = l10;
                                    z16 = z1113;
                                    i30 = i29;
                                    l0Var3 = l0Var118;
                                }
                            }
                            c1086gP.U();
                            int i3115 = i13 << 3;
                            int i3116 = i13 >> 9;
                            int i3117 = i30 << 6;
                            TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i3115 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3115 & 896) | ((i13 >> 3) & 7168) | (i3116 & 57344) | (i3116 & 458752) | (i3116 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i3117 & 7168) | (i3117 & 57344));
                            z14 = z16;
                            pVar8 = pVar13;
                            l0Var2 = l0Var3;
                            l11 = l12;
                            u11 = uB;
                            pVar9 = pVar7;
                            pVar10 = pVar12;
                        } else {
                            c1086gP.w();
                            z14 = z12;
                            pVar8 = pVar4;
                            l0Var2 = l0Var;
                            u11 = u10;
                            l11 = l10;
                            pVar9 = pVar7;
                            pVar10 = pVar5;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final l0 l0Var119 = l0Var2;
                            final U u110 = u11;
                            final androidx.compose.foundation.layout.L l111 = l11;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var119, u110, l111, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i29 |= 24576;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c1086gP.C(i13 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar1115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar1116 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar1115, null, null, aVar1116, aVar1116, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f11114 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f11114, f11114, f11114, f11114);
                                } else {
                                    float f11115 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f11115, TextFieldKt.f11841a, f11115, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var1110 = l0VarB;
                                boolean z1114 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z1114;
                                i30 = i29;
                                l0Var3 = l0Var1110;
                            }
                        } else {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar1117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar1118 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar1117, null, null, aVar1118, aVar1118, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f11116 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f11116, f11116, f11116, f11116);
                                } else {
                                    float f11117 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f11117, TextFieldKt.f11841a, f11117, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var1111 = l0VarB;
                                boolean z1115 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z1115;
                                i30 = i29;
                                l0Var3 = l0Var1111;
                            }
                        }
                        c1086gP.U();
                        int i3118 = i13 << 3;
                        int i3119 = i13 >> 9;
                        int i31110 = i30 << 6;
                        TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i3118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3118 & 896) | ((i13 >> 3) & 7168) | (i3119 & 57344) | (i3119 & 458752) | (i3119 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i31110 & 7168) | (i31110 & 57344));
                        z14 = z16;
                        pVar8 = pVar13;
                        l0Var2 = l0Var3;
                        l11 = l12;
                        u11 = uB;
                        pVar9 = pVar7;
                        pVar10 = pVar12;
                    } else {
                        c1086gP.w();
                        z14 = z12;
                        pVar8 = pVar4;
                        l0Var2 = l0Var;
                        u11 = u10;
                        l11 = l10;
                        pVar9 = pVar7;
                        pVar10 = pVar5;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final l0 l0Var1112 = l0Var2;
                        final U u111 = u11;
                        final androidx.compose.foundation.layout.L l112 = l11;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var1112, u111, l112, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.K(jVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.c(z12)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    i13 |= 12582912;
                    pVar6 = pVar2;
                } else {
                    pVar6 = pVar2;
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.k(pVar6)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                    pVar7 = pVar3;
                } else {
                    pVar7 = pVar3;
                    if ((i10 & 100663296) == 0) {
                        if (c1086gP.k(pVar7)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i13 |= i23;
                    }
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i13 |= i25;
                }
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.k(pVar5)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i11 & 48) != 0) {
                    i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                }
                if ((i11 & 384) != 0) {
                    i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
                }
                if ((i11 & 3072) != 0) {
                    i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
                }
                i29 = i27;
                if ((i12 & 16384) != 0) {
                    if ((i11 & 24576) == 0) {
                        i29 |= c1086gP.K(this) ? 16384 : 8192;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c1086gP.C(i13 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar1119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar11110 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar1119, null, null, aVar11110, aVar11110, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f11118 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f11118, f11118, f11118, f11118);
                                } else {
                                    float f11119 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f11119, TextFieldKt.f11841a, f11119, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var1113 = l0VarB;
                                boolean z1116 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z1116;
                                i30 = i29;
                                l0Var3 = l0Var1113;
                            }
                        } else {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar11111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar11112 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar11111, null, null, aVar11112, aVar11112, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f111110 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f111110, f111110, f111110, f111110);
                                } else {
                                    float f111111 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f111111, TextFieldKt.f11841a, f111111, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var1114 = l0VarB;
                                boolean z1117 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z1117;
                                i30 = i29;
                                l0Var3 = l0Var1114;
                            }
                        }
                        c1086gP.U();
                        int i31111 = i13 << 3;
                        int i31112 = i13 >> 9;
                        int i31113 = i30 << 6;
                        TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i31111 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31111 & 896) | ((i13 >> 3) & 7168) | (i31112 & 57344) | (i31112 & 458752) | (i31112 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i31113 & 7168) | (i31113 & 57344));
                        z14 = z16;
                        pVar8 = pVar13;
                        l0Var2 = l0Var3;
                        l11 = l12;
                        u11 = uB;
                        pVar9 = pVar7;
                        pVar10 = pVar12;
                    } else {
                        c1086gP.w();
                        z14 = z12;
                        pVar8 = pVar4;
                        l0Var2 = l0Var;
                        u11 = u10;
                        l11 = l10;
                        pVar9 = pVar7;
                        pVar10 = pVar5;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final l0 l0Var1115 = l0Var2;
                        final U u112 = u11;
                        final androidx.compose.foundation.layout.L l113 = l11;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var1115, u112, l113, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i29 |= 24576;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i13 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar11113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar11114 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar11113, null, null, aVar11114, aVar11114, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f111112 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f111112, f111112, f111112, f111112);
                            } else {
                                float f111113 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f111113, TextFieldKt.f11841a, f111113, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var1116 = l0VarB;
                            boolean z1118 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z1118;
                            i30 = i29;
                            l0Var3 = l0Var1116;
                        }
                    } else {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar11115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar11116 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar11115, null, null, aVar11116, aVar11116, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f111114 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f111114, f111114, f111114, f111114);
                            } else {
                                float f111115 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f111115, TextFieldKt.f11841a, f111115, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var1117 = l0VarB;
                            boolean z1119 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z1119;
                            i30 = i29;
                            l0Var3 = l0Var1117;
                        }
                    }
                    c1086gP.U();
                    int i31114 = i13 << 3;
                    int i31115 = i13 >> 9;
                    int i31116 = i30 << 6;
                    TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i31114 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31114 & 896) | ((i13 >> 3) & 7168) | (i31115 & 57344) | (i31115 & 458752) | (i31115 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i31116 & 7168) | (i31116 & 57344));
                    z14 = z16;
                    pVar8 = pVar13;
                    l0Var2 = l0Var3;
                    l11 = l12;
                    u11 = uB;
                    pVar9 = pVar7;
                    pVar10 = pVar12;
                } else {
                    c1086gP.w();
                    z14 = z12;
                    pVar8 = pVar4;
                    l0Var2 = l0Var;
                    u11 = u10;
                    l11 = l10;
                    pVar9 = pVar7;
                    pVar10 = pVar5;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final l0 l0Var1118 = l0Var2;
                    final U u113 = u11;
                    final androidx.compose.foundation.layout.L l114 = l11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var1118, u113, l114, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 3072;
            if ((i12 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.K(e10)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.K(jVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.c(z12)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    i13 |= 12582912;
                    pVar6 = pVar2;
                } else {
                    pVar6 = pVar2;
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.k(pVar6)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                    pVar7 = pVar3;
                } else {
                    pVar7 = pVar3;
                    if ((i10 & 100663296) == 0) {
                        if (c1086gP.k(pVar7)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i13 |= i23;
                    }
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i13 |= i25;
                }
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.k(pVar5)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i11 & 48) != 0) {
                    i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                }
                if ((i11 & 384) != 0) {
                    i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
                }
                if ((i11 & 3072) != 0) {
                    i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
                }
                i29 = i27;
                if ((i12 & 16384) != 0) {
                    if ((i11 & 24576) == 0) {
                        i29 |= c1086gP.K(this) ? 16384 : 8192;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c1086gP.C(i13 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar11117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar11118 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar11117, null, null, aVar11118, aVar11118, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f111116 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f111116, f111116, f111116, f111116);
                                } else {
                                    float f111117 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f111117, TextFieldKt.f11841a, f111117, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var1119 = l0VarB;
                                boolean z11110 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z11110;
                                i30 = i29;
                                l0Var3 = l0Var1119;
                            }
                        } else {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar11119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar111110 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar11119, null, null, aVar111110, aVar111110, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f111118 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f111118, f111118, f111118, f111118);
                                } else {
                                    float f111119 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f111119, TextFieldKt.f11841a, f111119, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var11110 = l0VarB;
                                boolean z11111 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z11111;
                                i30 = i29;
                                l0Var3 = l0Var11110;
                            }
                        }
                        c1086gP.U();
                        int i31117 = i13 << 3;
                        int i31118 = i13 >> 9;
                        int i31119 = i30 << 6;
                        TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i31117 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31117 & 896) | ((i13 >> 3) & 7168) | (i31118 & 57344) | (i31118 & 458752) | (i31118 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i31119 & 7168) | (i31119 & 57344));
                        z14 = z16;
                        pVar8 = pVar13;
                        l0Var2 = l0Var3;
                        l11 = l12;
                        u11 = uB;
                        pVar9 = pVar7;
                        pVar10 = pVar12;
                    } else {
                        c1086gP.w();
                        z14 = z12;
                        pVar8 = pVar4;
                        l0Var2 = l0Var;
                        u11 = u10;
                        l11 = l10;
                        pVar9 = pVar7;
                        pVar10 = pVar5;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final l0 l0Var11111 = l0Var2;
                        final U u114 = u11;
                        final androidx.compose.foundation.layout.L l115 = l11;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var11111, u114, l115, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i29 |= 24576;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i13 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar111111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar111112 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar111111, null, null, aVar111112, aVar111112, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f1111110 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111110, f1111110, f1111110, f1111110);
                            } else {
                                float f1111111 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111111, TextFieldKt.f11841a, f1111111, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var11112 = l0VarB;
                            boolean z11112 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z11112;
                            i30 = i29;
                            l0Var3 = l0Var11112;
                        }
                    } else {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar111113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar111114 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar111113, null, null, aVar111114, aVar111114, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f1111112 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111112, f1111112, f1111112, f1111112);
                            } else {
                                float f1111113 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111113, TextFieldKt.f11841a, f1111113, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var11113 = l0VarB;
                            boolean z11113 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z11113;
                            i30 = i29;
                            l0Var3 = l0Var11113;
                        }
                    }
                    c1086gP.U();
                    int i311110 = i13 << 3;
                    int i311111 = i13 >> 9;
                    int i311112 = i30 << 6;
                    TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i311110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311110 & 896) | ((i13 >> 3) & 7168) | (i311111 & 57344) | (i311111 & 458752) | (i311111 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i311112 & 7168) | (i311112 & 57344));
                    z14 = z16;
                    pVar8 = pVar13;
                    l0Var2 = l0Var3;
                    l11 = l12;
                    u11 = uB;
                    pVar9 = pVar7;
                    pVar10 = pVar12;
                } else {
                    c1086gP.w();
                    z14 = z12;
                    pVar8 = pVar4;
                    l0Var2 = l0Var;
                    u11 = u10;
                    l11 = l10;
                    pVar9 = pVar7;
                    pVar10 = pVar5;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final l0 l0Var11114 = l0Var2;
                    final U u115 = u11;
                    final androidx.compose.foundation.layout.L l116 = l11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var11114, u115, l116, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.K(jVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.c(z12)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            i20 = i12 & 128;
            if (i20 != 0) {
                i13 |= 12582912;
                pVar6 = pVar2;
            } else {
                pVar6 = pVar2;
                if ((i10 & 12582912) == 0) {
                    if (c1086gP.k(pVar6)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                i13 |= 100663296;
                pVar7 = pVar3;
            } else {
                pVar7 = pVar3;
                if ((i10 & 100663296) == 0) {
                    if (c1086gP.k(pVar7)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i13 |= i23;
                }
            }
            i24 = i12 & 512;
            if (i24 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(pVar4)) {
                    i25 = 536870912;
                } else {
                    i25 = 268435456;
                }
                i13 |= i25;
            }
            i26 = i12 & 1024;
            if (i26 != 0) {
                i27 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.k(pVar5)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i11 | i28;
            } else {
                i27 = i11;
            }
            if ((i11 & 48) != 0) {
                i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
            }
            if ((i11 & 384) != 0) {
                i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
            }
            if ((i11 & 3072) != 0) {
                i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
            }
            i29 = i27;
            if ((i12 & 16384) != 0) {
                if ((i11 & 24576) == 0) {
                    i29 |= c1086gP.K(this) ? 16384 : 8192;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i13 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar111115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar111116 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar111115, null, null, aVar111116, aVar111116, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f1111114 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111114, f1111114, f1111114, f1111114);
                            } else {
                                float f1111115 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111115, TextFieldKt.f11841a, f1111115, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var11115 = l0VarB;
                            boolean z11114 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z11114;
                            i30 = i29;
                            l0Var3 = l0Var11115;
                        }
                    } else {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar111117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar111118 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar111117, null, null, aVar111118, aVar111118, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f1111116 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111116, f1111116, f1111116, f1111116);
                            } else {
                                float f1111117 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111117, TextFieldKt.f11841a, f1111117, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var11116 = l0VarB;
                            boolean z11115 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z11115;
                            i30 = i29;
                            l0Var3 = l0Var11116;
                        }
                    }
                    c1086gP.U();
                    int i311113 = i13 << 3;
                    int i311114 = i13 >> 9;
                    int i311115 = i30 << 6;
                    TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i311113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311113 & 896) | ((i13 >> 3) & 7168) | (i311114 & 57344) | (i311114 & 458752) | (i311114 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i311115 & 7168) | (i311115 & 57344));
                    z14 = z16;
                    pVar8 = pVar13;
                    l0Var2 = l0Var3;
                    l11 = l12;
                    u11 = uB;
                    pVar9 = pVar7;
                    pVar10 = pVar12;
                } else {
                    c1086gP.w();
                    z14 = z12;
                    pVar8 = pVar4;
                    l0Var2 = l0Var;
                    u11 = u10;
                    l11 = l10;
                    pVar9 = pVar7;
                    pVar10 = pVar5;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final l0 l0Var11117 = l0Var2;
                    final U u116 = u11;
                    final androidx.compose.foundation.layout.L l117 = l11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var11117, u116, l117, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i29 |= 24576;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c1086gP.C(i13 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i20 != 0) {
                        pVar6 = null;
                    }
                    if (i22 != 0) {
                        pVar7 = null;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i26 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        p270w.a aVar111119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar1111110 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar111119, null, null, aVar1111110, aVar1111110, 3);
                        i29 &= -113;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i12 & 4096) != 0) {
                        uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        i29 &= -897;
                    } else {
                        uB = u10;
                    }
                    if ((i12 & 8192) != 0) {
                        if (pVar6 == null) {
                            float f1111118 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f1111118, f1111118, f1111118, f1111118);
                        } else {
                            float f1111119 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f1111119, TextFieldKt.f11841a, f1111119, TextFieldKt.f11842b);
                        }
                        pVar13 = pVar11;
                        l12 = n10;
                        i30 = i29 & (-7169);
                        l0Var3 = l0VarB;
                        z16 = z15;
                    } else {
                        l0 l0Var11118 = l0VarB;
                        boolean z11116 = z15;
                        pVar13 = pVar11;
                        l12 = l10;
                        z16 = z11116;
                        i30 = i29;
                        l0Var3 = l0Var11118;
                    }
                } else {
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i20 != 0) {
                        pVar6 = null;
                    }
                    if (i22 != 0) {
                        pVar7 = null;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i26 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        p270w.a aVar1111111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar1111112 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar1111111, null, null, aVar1111112, aVar1111112, 3);
                        i29 &= -113;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i12 & 4096) != 0) {
                        uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        i29 &= -897;
                    } else {
                        uB = u10;
                    }
                    if ((i12 & 8192) != 0) {
                        if (pVar6 == null) {
                            float f11111110 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f11111110, f11111110, f11111110, f11111110);
                        } else {
                            float f11111111 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f11111111, TextFieldKt.f11841a, f11111111, TextFieldKt.f11842b);
                        }
                        pVar13 = pVar11;
                        l12 = n10;
                        i30 = i29 & (-7169);
                        l0Var3 = l0VarB;
                        z16 = z15;
                    } else {
                        l0 l0Var11119 = l0VarB;
                        boolean z11117 = z15;
                        pVar13 = pVar11;
                        l12 = l10;
                        z16 = z11117;
                        i30 = i29;
                        l0Var3 = l0Var11119;
                    }
                }
                c1086gP.U();
                int i311116 = i13 << 3;
                int i311117 = i13 >> 9;
                int i311118 = i30 << 6;
                TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i311116 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311116 & 896) | ((i13 >> 3) & 7168) | (i311117 & 57344) | (i311117 & 458752) | (i311117 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i311118 & 7168) | (i311118 & 57344));
                z14 = z16;
                pVar8 = pVar13;
                l0Var2 = l0Var3;
                l11 = l12;
                u11 = uB;
                pVar9 = pVar7;
                pVar10 = pVar12;
            } else {
                c1086gP.w();
                z14 = z12;
                pVar8 = pVar4;
                l0Var2 = l0Var;
                u11 = u10;
                l11 = l10;
                pVar9 = pVar7;
                pVar10 = pVar5;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final l0 l0Var111110 = l0Var2;
                final U u117 = u11;
                final androidx.compose.foundation.layout.L l118 = l11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var111110, u117, l118, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 48;
        if ((i12 & 4) != 0) {
            if ((i10 & 384) == 0) {
                if (c1086gP.c(z10)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i12 & 8) != 0) {
                if ((i10 & 3072) == 0) {
                    if (c1086gP.c(z11)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i12 & 16) != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c1086gP.K(e10)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i13 |= i16;
                    }
                    if ((i12 & 32) != 0) {
                        i13 |= 196608;
                    } else if ((i10 & 196608) == 0) {
                        if (c1086gP.K(jVar)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 64;
                    if (i18 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c1086gP.c(z12)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 128;
                    if (i20 != 0) {
                        i13 |= 12582912;
                        pVar6 = pVar2;
                    } else {
                        pVar6 = pVar2;
                        if ((i10 & 12582912) == 0) {
                            if (c1086gP.k(pVar6)) {
                                i21 = 8388608;
                            } else {
                                i21 = 4194304;
                            }
                            i13 |= i21;
                        }
                    }
                    i22 = i12 & 256;
                    if (i22 != 0) {
                        i13 |= 100663296;
                        pVar7 = pVar3;
                    } else {
                        pVar7 = pVar3;
                        if ((i10 & 100663296) == 0) {
                            if (c1086gP.k(pVar7)) {
                                i23 = 67108864;
                            } else {
                                i23 = 33554432;
                            }
                            i13 |= i23;
                        }
                    }
                    i24 = i12 & 512;
                    if (i24 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c1086gP.k(pVar4)) {
                            i25 = 536870912;
                        } else {
                            i25 = 268435456;
                        }
                        i13 |= i25;
                    }
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 6) == 0) {
                        if (c1086gP.k(pVar5)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    if ((i11 & 48) != 0) {
                        i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                    }
                    if ((i11 & 384) != 0) {
                        i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
                    }
                    if ((i11 & 3072) != 0) {
                        i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
                    }
                    i29 = i27;
                    if ((i12 & 16384) != 0) {
                        if ((i11 & 24576) == 0) {
                            i29 |= c1086gP.K(this) ? 16384 : 8192;
                        }
                        if ((i13 & 306783379) == 306783378) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (c1086gP.C(i13 & 1, z13)) {
                            c1086gP.r0();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z15 = false;
                                } else {
                                    z15 = z12;
                                }
                                if (i20 != 0) {
                                    pVar6 = null;
                                }
                                if (i22 != 0) {
                                    pVar7 = null;
                                }
                                if (i24 != 0) {
                                    pVar11 = null;
                                } else {
                                    pVar11 = pVar4;
                                }
                                if (i26 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    p270w.a aVar1111113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                    w.c.a aVar1111114 = p270w.c.f47677a;
                                    l0VarB = p270w.a.b(aVar1111113, null, null, aVar1111114, aVar1111114, 3);
                                    i29 &= -113;
                                } else {
                                    l0VarB = l0Var;
                                }
                                if ((i12 & 4096) != 0) {
                                    uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                    i29 &= -897;
                                } else {
                                    uB = u10;
                                }
                                if ((i12 & 8192) != 0) {
                                    if (pVar6 == null) {
                                        float f11111112 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f11111112, f11111112, f11111112, f11111112);
                                    } else {
                                        float f11111113 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f11111113, TextFieldKt.f11841a, f11111113, TextFieldKt.f11842b);
                                    }
                                    pVar13 = pVar11;
                                    l12 = n10;
                                    i30 = i29 & (-7169);
                                    l0Var3 = l0VarB;
                                    z16 = z15;
                                } else {
                                    l0 l0Var111111 = l0VarB;
                                    boolean z11118 = z15;
                                    pVar13 = pVar11;
                                    l12 = l10;
                                    z16 = z11118;
                                    i30 = i29;
                                    l0Var3 = l0Var111111;
                                }
                            } else {
                                if (i18 != 0) {
                                    z15 = false;
                                } else {
                                    z15 = z12;
                                }
                                if (i20 != 0) {
                                    pVar6 = null;
                                }
                                if (i22 != 0) {
                                    pVar7 = null;
                                }
                                if (i24 != 0) {
                                    pVar11 = null;
                                } else {
                                    pVar11 = pVar4;
                                }
                                if (i26 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    p270w.a aVar1111115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                    w.c.a aVar1111116 = p270w.c.f47677a;
                                    l0VarB = p270w.a.b(aVar1111115, null, null, aVar1111116, aVar1111116, 3);
                                    i29 &= -113;
                                } else {
                                    l0VarB = l0Var;
                                }
                                if ((i12 & 4096) != 0) {
                                    uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                    i29 &= -897;
                                } else {
                                    uB = u10;
                                }
                                if ((i12 & 8192) != 0) {
                                    if (pVar6 == null) {
                                        float f11111114 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f11111114, f11111114, f11111114, f11111114);
                                    } else {
                                        float f11111115 = TextFieldImplKt.f11839a;
                                        n10 = new androidx.compose.foundation.layout.N(f11111115, TextFieldKt.f11841a, f11111115, TextFieldKt.f11842b);
                                    }
                                    pVar13 = pVar11;
                                    l12 = n10;
                                    i30 = i29 & (-7169);
                                    l0Var3 = l0VarB;
                                    z16 = z15;
                                } else {
                                    l0 l0Var111112 = l0VarB;
                                    boolean z11119 = z15;
                                    pVar13 = pVar11;
                                    l12 = l10;
                                    z16 = z11119;
                                    i30 = i29;
                                    l0Var3 = l0Var111112;
                                }
                            }
                            c1086gP.U();
                            int i311119 = i13 << 3;
                            int i3111110 = i13 >> 9;
                            int i3111111 = i30 << 6;
                            TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i311119 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311119 & 896) | ((i13 >> 3) & 7168) | (i3111110 & 57344) | (i3111110 & 458752) | (i3111110 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i3111111 & 7168) | (i3111111 & 57344));
                            z14 = z16;
                            pVar8 = pVar13;
                            l0Var2 = l0Var3;
                            l11 = l12;
                            u11 = uB;
                            pVar9 = pVar7;
                            pVar10 = pVar12;
                        } else {
                            c1086gP.w();
                            z14 = z12;
                            pVar8 = pVar4;
                            l0Var2 = l0Var;
                            u11 = u10;
                            l11 = l10;
                            pVar9 = pVar7;
                            pVar10 = pVar5;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            final l0 l0Var111113 = l0Var2;
                            final U u118 = u11;
                            final androidx.compose.foundation.layout.L l119 = l11;
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var111113, u118, l119, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i29 |= 24576;
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c1086gP.C(i13 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar1111117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar1111118 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar1111117, null, null, aVar1111118, aVar1111118, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f11111116 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f11111116, f11111116, f11111116, f11111116);
                                } else {
                                    float f11111117 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f11111117, TextFieldKt.f11841a, f11111117, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var111114 = l0VarB;
                                boolean z111110 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z111110;
                                i30 = i29;
                                l0Var3 = l0Var111114;
                            }
                        } else {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar1111119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar11111110 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar1111119, null, null, aVar11111110, aVar11111110, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f11111118 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f11111118, f11111118, f11111118, f11111118);
                                } else {
                                    float f11111119 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f11111119, TextFieldKt.f11841a, f11111119, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var111115 = l0VarB;
                                boolean z111111 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z111111;
                                i30 = i29;
                                l0Var3 = l0Var111115;
                            }
                        }
                        c1086gP.U();
                        int i3111112 = i13 << 3;
                        int i3111113 = i13 >> 9;
                        int i3111114 = i30 << 6;
                        TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i3111112 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3111112 & 896) | ((i13 >> 3) & 7168) | (i3111113 & 57344) | (i3111113 & 458752) | (i3111113 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i3111114 & 7168) | (i3111114 & 57344));
                        z14 = z16;
                        pVar8 = pVar13;
                        l0Var2 = l0Var3;
                        l11 = l12;
                        u11 = uB;
                        pVar9 = pVar7;
                        pVar10 = pVar12;
                    } else {
                        c1086gP.w();
                        z14 = z12;
                        pVar8 = pVar4;
                        l0Var2 = l0Var;
                        u11 = u10;
                        l11 = l10;
                        pVar9 = pVar7;
                        pVar10 = pVar5;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final l0 l0Var111116 = l0Var2;
                        final U u119 = u11;
                        final androidx.compose.foundation.layout.L l1110 = l11;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var111116, u119, l1110, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i13 |= 24576;
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.K(jVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.c(z12)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    i13 |= 12582912;
                    pVar6 = pVar2;
                } else {
                    pVar6 = pVar2;
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.k(pVar6)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                    pVar7 = pVar3;
                } else {
                    pVar7 = pVar3;
                    if ((i10 & 100663296) == 0) {
                        if (c1086gP.k(pVar7)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i13 |= i23;
                    }
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i13 |= i25;
                }
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.k(pVar5)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i11 & 48) != 0) {
                    i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                }
                if ((i11 & 384) != 0) {
                    i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
                }
                if ((i11 & 3072) != 0) {
                    i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
                }
                i29 = i27;
                if ((i12 & 16384) != 0) {
                    if ((i11 & 24576) == 0) {
                        i29 |= c1086gP.K(this) ? 16384 : 8192;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c1086gP.C(i13 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar11111111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar11111112 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar11111111, null, null, aVar11111112, aVar11111112, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f111111110 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f111111110, f111111110, f111111110, f111111110);
                                } else {
                                    float f111111111 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f111111111, TextFieldKt.f11841a, f111111111, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var111117 = l0VarB;
                                boolean z111112 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z111112;
                                i30 = i29;
                                l0Var3 = l0Var111117;
                            }
                        } else {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar11111113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar11111114 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar11111113, null, null, aVar11111114, aVar11111114, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f111111112 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f111111112, f111111112, f111111112, f111111112);
                                } else {
                                    float f111111113 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f111111113, TextFieldKt.f11841a, f111111113, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var111118 = l0VarB;
                                boolean z111113 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z111113;
                                i30 = i29;
                                l0Var3 = l0Var111118;
                            }
                        }
                        c1086gP.U();
                        int i3111115 = i13 << 3;
                        int i3111116 = i13 >> 9;
                        int i3111117 = i30 << 6;
                        TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i3111115 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3111115 & 896) | ((i13 >> 3) & 7168) | (i3111116 & 57344) | (i3111116 & 458752) | (i3111116 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i3111117 & 7168) | (i3111117 & 57344));
                        z14 = z16;
                        pVar8 = pVar13;
                        l0Var2 = l0Var3;
                        l11 = l12;
                        u11 = uB;
                        pVar9 = pVar7;
                        pVar10 = pVar12;
                    } else {
                        c1086gP.w();
                        z14 = z12;
                        pVar8 = pVar4;
                        l0Var2 = l0Var;
                        u11 = u10;
                        l11 = l10;
                        pVar9 = pVar7;
                        pVar10 = pVar5;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final l0 l0Var111119 = l0Var2;
                        final U u1110 = u11;
                        final androidx.compose.foundation.layout.L l1111 = l11;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var111119, u1110, l1111, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i29 |= 24576;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i13 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar11111115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar11111116 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar11111115, null, null, aVar11111116, aVar11111116, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f111111114 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f111111114, f111111114, f111111114, f111111114);
                            } else {
                                float f111111115 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f111111115, TextFieldKt.f11841a, f111111115, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var1111110 = l0VarB;
                            boolean z111114 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z111114;
                            i30 = i29;
                            l0Var3 = l0Var1111110;
                        }
                    } else {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar11111117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar11111118 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar11111117, null, null, aVar11111118, aVar11111118, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f111111116 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f111111116, f111111116, f111111116, f111111116);
                            } else {
                                float f111111117 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f111111117, TextFieldKt.f11841a, f111111117, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var1111111 = l0VarB;
                            boolean z111115 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z111115;
                            i30 = i29;
                            l0Var3 = l0Var1111111;
                        }
                    }
                    c1086gP.U();
                    int i3111118 = i13 << 3;
                    int i3111119 = i13 >> 9;
                    int i31111110 = i30 << 6;
                    TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i3111118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3111118 & 896) | ((i13 >> 3) & 7168) | (i3111119 & 57344) | (i3111119 & 458752) | (i3111119 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i31111110 & 7168) | (i31111110 & 57344));
                    z14 = z16;
                    pVar8 = pVar13;
                    l0Var2 = l0Var3;
                    l11 = l12;
                    u11 = uB;
                    pVar9 = pVar7;
                    pVar10 = pVar12;
                } else {
                    c1086gP.w();
                    z14 = z12;
                    pVar8 = pVar4;
                    l0Var2 = l0Var;
                    u11 = u10;
                    l11 = l10;
                    pVar9 = pVar7;
                    pVar10 = pVar5;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final l0 l0Var1111112 = l0Var2;
                    final U u1111 = u11;
                    final androidx.compose.foundation.layout.L l1112 = l11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var1111112, u1111, l1112, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 3072;
            if ((i12 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.K(e10)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.K(jVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.c(z12)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    i13 |= 12582912;
                    pVar6 = pVar2;
                } else {
                    pVar6 = pVar2;
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.k(pVar6)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                    pVar7 = pVar3;
                } else {
                    pVar7 = pVar3;
                    if ((i10 & 100663296) == 0) {
                        if (c1086gP.k(pVar7)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i13 |= i23;
                    }
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i13 |= i25;
                }
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.k(pVar5)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i11 & 48) != 0) {
                    i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                }
                if ((i11 & 384) != 0) {
                    i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
                }
                if ((i11 & 3072) != 0) {
                    i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
                }
                i29 = i27;
                if ((i12 & 16384) != 0) {
                    if ((i11 & 24576) == 0) {
                        i29 |= c1086gP.K(this) ? 16384 : 8192;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c1086gP.C(i13 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar11111119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar111111110 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar11111119, null, null, aVar111111110, aVar111111110, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f111111118 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f111111118, f111111118, f111111118, f111111118);
                                } else {
                                    float f111111119 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f111111119, TextFieldKt.f11841a, f111111119, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var1111113 = l0VarB;
                                boolean z111116 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z111116;
                                i30 = i29;
                                l0Var3 = l0Var1111113;
                            }
                        } else {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar111111111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar111111112 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar111111111, null, null, aVar111111112, aVar111111112, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f1111111110 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f1111111110, f1111111110, f1111111110, f1111111110);
                                } else {
                                    float f1111111111 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f1111111111, TextFieldKt.f11841a, f1111111111, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var1111114 = l0VarB;
                                boolean z111117 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z111117;
                                i30 = i29;
                                l0Var3 = l0Var1111114;
                            }
                        }
                        c1086gP.U();
                        int i31111111 = i13 << 3;
                        int i31111112 = i13 >> 9;
                        int i31111113 = i30 << 6;
                        TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i31111111 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31111111 & 896) | ((i13 >> 3) & 7168) | (i31111112 & 57344) | (i31111112 & 458752) | (i31111112 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i31111113 & 7168) | (i31111113 & 57344));
                        z14 = z16;
                        pVar8 = pVar13;
                        l0Var2 = l0Var3;
                        l11 = l12;
                        u11 = uB;
                        pVar9 = pVar7;
                        pVar10 = pVar12;
                    } else {
                        c1086gP.w();
                        z14 = z12;
                        pVar8 = pVar4;
                        l0Var2 = l0Var;
                        u11 = u10;
                        l11 = l10;
                        pVar9 = pVar7;
                        pVar10 = pVar5;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final l0 l0Var1111115 = l0Var2;
                        final U u1112 = u11;
                        final androidx.compose.foundation.layout.L l1113 = l11;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var1111115, u1112, l1113, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i29 |= 24576;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i13 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar111111113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar111111114 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar111111113, null, null, aVar111111114, aVar111111114, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f1111111112 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111111112, f1111111112, f1111111112, f1111111112);
                            } else {
                                float f1111111113 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111111113, TextFieldKt.f11841a, f1111111113, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var1111116 = l0VarB;
                            boolean z111118 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z111118;
                            i30 = i29;
                            l0Var3 = l0Var1111116;
                        }
                    } else {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar111111115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar111111116 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar111111115, null, null, aVar111111116, aVar111111116, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f1111111114 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111111114, f1111111114, f1111111114, f1111111114);
                            } else {
                                float f1111111115 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111111115, TextFieldKt.f11841a, f1111111115, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var1111117 = l0VarB;
                            boolean z111119 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z111119;
                            i30 = i29;
                            l0Var3 = l0Var1111117;
                        }
                    }
                    c1086gP.U();
                    int i31111114 = i13 << 3;
                    int i31111115 = i13 >> 9;
                    int i31111116 = i30 << 6;
                    TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i31111114 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31111114 & 896) | ((i13 >> 3) & 7168) | (i31111115 & 57344) | (i31111115 & 458752) | (i31111115 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i31111116 & 7168) | (i31111116 & 57344));
                    z14 = z16;
                    pVar8 = pVar13;
                    l0Var2 = l0Var3;
                    l11 = l12;
                    u11 = uB;
                    pVar9 = pVar7;
                    pVar10 = pVar12;
                } else {
                    c1086gP.w();
                    z14 = z12;
                    pVar8 = pVar4;
                    l0Var2 = l0Var;
                    u11 = u10;
                    l11 = l10;
                    pVar9 = pVar7;
                    pVar10 = pVar5;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final l0 l0Var1111118 = l0Var2;
                    final U u1113 = u11;
                    final androidx.compose.foundation.layout.L l1114 = l11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var1111118, u1113, l1114, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.K(jVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.c(z12)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            i20 = i12 & 128;
            if (i20 != 0) {
                i13 |= 12582912;
                pVar6 = pVar2;
            } else {
                pVar6 = pVar2;
                if ((i10 & 12582912) == 0) {
                    if (c1086gP.k(pVar6)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                i13 |= 100663296;
                pVar7 = pVar3;
            } else {
                pVar7 = pVar3;
                if ((i10 & 100663296) == 0) {
                    if (c1086gP.k(pVar7)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i13 |= i23;
                }
            }
            i24 = i12 & 512;
            if (i24 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(pVar4)) {
                    i25 = 536870912;
                } else {
                    i25 = 268435456;
                }
                i13 |= i25;
            }
            i26 = i12 & 1024;
            if (i26 != 0) {
                i27 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.k(pVar5)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i11 | i28;
            } else {
                i27 = i11;
            }
            if ((i11 & 48) != 0) {
                i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
            }
            if ((i11 & 384) != 0) {
                i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
            }
            if ((i11 & 3072) != 0) {
                i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
            }
            i29 = i27;
            if ((i12 & 16384) != 0) {
                if ((i11 & 24576) == 0) {
                    i29 |= c1086gP.K(this) ? 16384 : 8192;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i13 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar111111117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar111111118 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar111111117, null, null, aVar111111118, aVar111111118, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f1111111116 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111111116, f1111111116, f1111111116, f1111111116);
                            } else {
                                float f1111111117 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111111117, TextFieldKt.f11841a, f1111111117, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var1111119 = l0VarB;
                            boolean z1111110 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z1111110;
                            i30 = i29;
                            l0Var3 = l0Var1111119;
                        }
                    } else {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar111111119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar1111111110 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar111111119, null, null, aVar1111111110, aVar1111111110, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f1111111118 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111111118, f1111111118, f1111111118, f1111111118);
                            } else {
                                float f1111111119 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111111119, TextFieldKt.f11841a, f1111111119, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var11111110 = l0VarB;
                            boolean z1111111 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z1111111;
                            i30 = i29;
                            l0Var3 = l0Var11111110;
                        }
                    }
                    c1086gP.U();
                    int i31111117 = i13 << 3;
                    int i31111118 = i13 >> 9;
                    int i31111119 = i30 << 6;
                    TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i31111117 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31111117 & 896) | ((i13 >> 3) & 7168) | (i31111118 & 57344) | (i31111118 & 458752) | (i31111118 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i31111119 & 7168) | (i31111119 & 57344));
                    z14 = z16;
                    pVar8 = pVar13;
                    l0Var2 = l0Var3;
                    l11 = l12;
                    u11 = uB;
                    pVar9 = pVar7;
                    pVar10 = pVar12;
                } else {
                    c1086gP.w();
                    z14 = z12;
                    pVar8 = pVar4;
                    l0Var2 = l0Var;
                    u11 = u10;
                    l11 = l10;
                    pVar9 = pVar7;
                    pVar10 = pVar5;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final l0 l0Var11111111 = l0Var2;
                    final U u1114 = u11;
                    final androidx.compose.foundation.layout.L l1115 = l11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var11111111, u1114, l1115, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i29 |= 24576;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c1086gP.C(i13 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i20 != 0) {
                        pVar6 = null;
                    }
                    if (i22 != 0) {
                        pVar7 = null;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i26 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        p270w.a aVar1111111111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar1111111112 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar1111111111, null, null, aVar1111111112, aVar1111111112, 3);
                        i29 &= -113;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i12 & 4096) != 0) {
                        uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        i29 &= -897;
                    } else {
                        uB = u10;
                    }
                    if ((i12 & 8192) != 0) {
                        if (pVar6 == null) {
                            float f11111111110 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f11111111110, f11111111110, f11111111110, f11111111110);
                        } else {
                            float f11111111111 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f11111111111, TextFieldKt.f11841a, f11111111111, TextFieldKt.f11842b);
                        }
                        pVar13 = pVar11;
                        l12 = n10;
                        i30 = i29 & (-7169);
                        l0Var3 = l0VarB;
                        z16 = z15;
                    } else {
                        l0 l0Var11111112 = l0VarB;
                        boolean z1111112 = z15;
                        pVar13 = pVar11;
                        l12 = l10;
                        z16 = z1111112;
                        i30 = i29;
                        l0Var3 = l0Var11111112;
                    }
                } else {
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i20 != 0) {
                        pVar6 = null;
                    }
                    if (i22 != 0) {
                        pVar7 = null;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i26 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        p270w.a aVar1111111113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar1111111114 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar1111111113, null, null, aVar1111111114, aVar1111111114, 3);
                        i29 &= -113;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i12 & 4096) != 0) {
                        uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        i29 &= -897;
                    } else {
                        uB = u10;
                    }
                    if ((i12 & 8192) != 0) {
                        if (pVar6 == null) {
                            float f11111111112 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f11111111112, f11111111112, f11111111112, f11111111112);
                        } else {
                            float f11111111113 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f11111111113, TextFieldKt.f11841a, f11111111113, TextFieldKt.f11842b);
                        }
                        pVar13 = pVar11;
                        l12 = n10;
                        i30 = i29 & (-7169);
                        l0Var3 = l0VarB;
                        z16 = z15;
                    } else {
                        l0 l0Var11111113 = l0VarB;
                        boolean z1111113 = z15;
                        pVar13 = pVar11;
                        l12 = l10;
                        z16 = z1111113;
                        i30 = i29;
                        l0Var3 = l0Var11111113;
                    }
                }
                c1086gP.U();
                int i311111110 = i13 << 3;
                int i311111111 = i13 >> 9;
                int i311111112 = i30 << 6;
                TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i311111110 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311111110 & 896) | ((i13 >> 3) & 7168) | (i311111111 & 57344) | (i311111111 & 458752) | (i311111111 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i311111112 & 7168) | (i311111112 & 57344));
                z14 = z16;
                pVar8 = pVar13;
                l0Var2 = l0Var3;
                l11 = l12;
                u11 = uB;
                pVar9 = pVar7;
                pVar10 = pVar12;
            } else {
                c1086gP.w();
                z14 = z12;
                pVar8 = pVar4;
                l0Var2 = l0Var;
                u11 = u10;
                l11 = l10;
                pVar9 = pVar7;
                pVar10 = pVar5;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final l0 l0Var11111114 = l0Var2;
                final U u1115 = u11;
                final androidx.compose.foundation.layout.L l1116 = l11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var11111114, u1115, l1116, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 384;
        if ((i12 & 8) != 0) {
            if ((i10 & 3072) == 0) {
                if (c1086gP.c(z11)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i12 & 16) != 0) {
                if ((i10 & 24576) == 0) {
                    if (c1086gP.K(e10)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                if ((i12 & 32) != 0) {
                    i13 |= 196608;
                } else if ((i10 & 196608) == 0) {
                    if (c1086gP.K(jVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c1086gP.c(z12)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    i13 |= 12582912;
                    pVar6 = pVar2;
                } else {
                    pVar6 = pVar2;
                    if ((i10 & 12582912) == 0) {
                        if (c1086gP.k(pVar6)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                    pVar7 = pVar3;
                } else {
                    pVar7 = pVar3;
                    if ((i10 & 100663296) == 0) {
                        if (c1086gP.k(pVar7)) {
                            i23 = 67108864;
                        } else {
                            i23 = 33554432;
                        }
                        i13 |= i23;
                    }
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i25 = 536870912;
                    } else {
                        i25 = 268435456;
                    }
                    i13 |= i25;
                }
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 6) == 0) {
                    if (c1086gP.k(pVar5)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                if ((i11 & 48) != 0) {
                    i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
                }
                if ((i11 & 384) != 0) {
                    i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
                }
                if ((i11 & 3072) != 0) {
                    i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
                }
                i29 = i27;
                if ((i12 & 16384) != 0) {
                    if ((i11 & 24576) == 0) {
                        i29 |= c1086gP.K(this) ? 16384 : 8192;
                    }
                    if ((i13 & 306783379) == 306783378) {
                        z13 = true;
                    } else {
                        z13 = true;
                    }
                    if (c1086gP.C(i13 & 1, z13)) {
                        c1086gP.r0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar1111111115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar1111111116 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar1111111115, null, null, aVar1111111116, aVar1111111116, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f11111111114 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f11111111114, f11111111114, f11111111114, f11111111114);
                                } else {
                                    float f11111111115 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f11111111115, TextFieldKt.f11841a, f11111111115, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var11111115 = l0VarB;
                                boolean z1111114 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z1111114;
                                i30 = i29;
                                l0Var3 = l0Var11111115;
                            }
                        } else {
                            if (i18 != 0) {
                                z15 = false;
                            } else {
                                z15 = z12;
                            }
                            if (i20 != 0) {
                                pVar6 = null;
                            }
                            if (i22 != 0) {
                                pVar7 = null;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i26 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                p270w.a aVar1111111117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar1111111118 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar1111111117, null, null, aVar1111111118, aVar1111111118, 3);
                                i29 &= -113;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i12 & 4096) != 0) {
                                uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                i29 &= -897;
                            } else {
                                uB = u10;
                            }
                            if ((i12 & 8192) != 0) {
                                if (pVar6 == null) {
                                    float f11111111116 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f11111111116, f11111111116, f11111111116, f11111111116);
                                } else {
                                    float f11111111117 = TextFieldImplKt.f11839a;
                                    n10 = new androidx.compose.foundation.layout.N(f11111111117, TextFieldKt.f11841a, f11111111117, TextFieldKt.f11842b);
                                }
                                pVar13 = pVar11;
                                l12 = n10;
                                i30 = i29 & (-7169);
                                l0Var3 = l0VarB;
                                z16 = z15;
                            } else {
                                l0 l0Var11111116 = l0VarB;
                                boolean z1111115 = z15;
                                pVar13 = pVar11;
                                l12 = l10;
                                z16 = z1111115;
                                i30 = i29;
                                l0Var3 = l0Var11111116;
                            }
                        }
                        c1086gP.U();
                        int i311111113 = i13 << 3;
                        int i311111114 = i13 >> 9;
                        int i311111115 = i30 << 6;
                        TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i311111113 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311111113 & 896) | ((i13 >> 3) & 7168) | (i311111114 & 57344) | (i311111114 & 458752) | (i311111114 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i311111115 & 7168) | (i311111115 & 57344));
                        z14 = z16;
                        pVar8 = pVar13;
                        l0Var2 = l0Var3;
                        l11 = l12;
                        u11 = uB;
                        pVar9 = pVar7;
                        pVar10 = pVar12;
                    } else {
                        c1086gP.w();
                        z14 = z12;
                        pVar8 = pVar4;
                        l0Var2 = l0Var;
                        u11 = u10;
                        l11 = l10;
                        pVar9 = pVar7;
                        pVar10 = pVar5;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final l0 l0Var11111117 = l0Var2;
                        final U u1116 = u11;
                        final androidx.compose.foundation.layout.L l1117 = l11;
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var11111117, u1116, l1117, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i29 |= 24576;
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i13 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar1111111119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar11111111110 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar1111111119, null, null, aVar11111111110, aVar11111111110, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f11111111118 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f11111111118, f11111111118, f11111111118, f11111111118);
                            } else {
                                float f11111111119 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f11111111119, TextFieldKt.f11841a, f11111111119, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var11111118 = l0VarB;
                            boolean z1111116 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z1111116;
                            i30 = i29;
                            l0Var3 = l0Var11111118;
                        }
                    } else {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar11111111111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar11111111112 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar11111111111, null, null, aVar11111111112, aVar11111111112, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f111111111110 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f111111111110, f111111111110, f111111111110, f111111111110);
                            } else {
                                float f111111111111 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f111111111111, TextFieldKt.f11841a, f111111111111, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var11111119 = l0VarB;
                            boolean z1111117 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z1111117;
                            i30 = i29;
                            l0Var3 = l0Var11111119;
                        }
                    }
                    c1086gP.U();
                    int i311111116 = i13 << 3;
                    int i311111117 = i13 >> 9;
                    int i311111118 = i30 << 6;
                    TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i311111116 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311111116 & 896) | ((i13 >> 3) & 7168) | (i311111117 & 57344) | (i311111117 & 458752) | (i311111117 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i311111118 & 7168) | (i311111118 & 57344));
                    z14 = z16;
                    pVar8 = pVar13;
                    l0Var2 = l0Var3;
                    l11 = l12;
                    u11 = uB;
                    pVar9 = pVar7;
                    pVar10 = pVar12;
                } else {
                    c1086gP.w();
                    z14 = z12;
                    pVar8 = pVar4;
                    l0Var2 = l0Var;
                    u11 = u10;
                    l11 = l10;
                    pVar9 = pVar7;
                    pVar10 = pVar5;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final l0 l0Var111111110 = l0Var2;
                    final U u1117 = u11;
                    final androidx.compose.foundation.layout.L l1118 = l11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var111111110, u1117, l1118, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i13 |= 24576;
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.K(jVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.c(z12)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            i20 = i12 & 128;
            if (i20 != 0) {
                i13 |= 12582912;
                pVar6 = pVar2;
            } else {
                pVar6 = pVar2;
                if ((i10 & 12582912) == 0) {
                    if (c1086gP.k(pVar6)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                i13 |= 100663296;
                pVar7 = pVar3;
            } else {
                pVar7 = pVar3;
                if ((i10 & 100663296) == 0) {
                    if (c1086gP.k(pVar7)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i13 |= i23;
                }
            }
            i24 = i12 & 512;
            if (i24 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(pVar4)) {
                    i25 = 536870912;
                } else {
                    i25 = 268435456;
                }
                i13 |= i25;
            }
            i26 = i12 & 1024;
            if (i26 != 0) {
                i27 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.k(pVar5)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i11 | i28;
            } else {
                i27 = i11;
            }
            if ((i11 & 48) != 0) {
                i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
            }
            if ((i11 & 384) != 0) {
                i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
            }
            if ((i11 & 3072) != 0) {
                i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
            }
            i29 = i27;
            if ((i12 & 16384) != 0) {
                if ((i11 & 24576) == 0) {
                    i29 |= c1086gP.K(this) ? 16384 : 8192;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i13 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar11111111113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar11111111114 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar11111111113, null, null, aVar11111111114, aVar11111111114, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f111111111112 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f111111111112, f111111111112, f111111111112, f111111111112);
                            } else {
                                float f111111111113 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f111111111113, TextFieldKt.f11841a, f111111111113, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var111111111 = l0VarB;
                            boolean z1111118 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z1111118;
                            i30 = i29;
                            l0Var3 = l0Var111111111;
                        }
                    } else {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar11111111115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar11111111116 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar11111111115, null, null, aVar11111111116, aVar11111111116, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f111111111114 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f111111111114, f111111111114, f111111111114, f111111111114);
                            } else {
                                float f111111111115 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f111111111115, TextFieldKt.f11841a, f111111111115, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var111111112 = l0VarB;
                            boolean z1111119 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z1111119;
                            i30 = i29;
                            l0Var3 = l0Var111111112;
                        }
                    }
                    c1086gP.U();
                    int i311111119 = i13 << 3;
                    int i3111111110 = i13 >> 9;
                    int i3111111111 = i30 << 6;
                    TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i311111119 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i311111119 & 896) | ((i13 >> 3) & 7168) | (i3111111110 & 57344) | (i3111111110 & 458752) | (i3111111110 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i3111111111 & 7168) | (i3111111111 & 57344));
                    z14 = z16;
                    pVar8 = pVar13;
                    l0Var2 = l0Var3;
                    l11 = l12;
                    u11 = uB;
                    pVar9 = pVar7;
                    pVar10 = pVar12;
                } else {
                    c1086gP.w();
                    z14 = z12;
                    pVar8 = pVar4;
                    l0Var2 = l0Var;
                    u11 = u10;
                    l11 = l10;
                    pVar9 = pVar7;
                    pVar10 = pVar5;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final l0 l0Var111111113 = l0Var2;
                    final U u1118 = u11;
                    final androidx.compose.foundation.layout.L l1119 = l11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var111111113, u1118, l1119, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i29 |= 24576;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c1086gP.C(i13 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i20 != 0) {
                        pVar6 = null;
                    }
                    if (i22 != 0) {
                        pVar7 = null;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i26 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        p270w.a aVar11111111117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar11111111118 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar11111111117, null, null, aVar11111111118, aVar11111111118, 3);
                        i29 &= -113;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i12 & 4096) != 0) {
                        uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        i29 &= -897;
                    } else {
                        uB = u10;
                    }
                    if ((i12 & 8192) != 0) {
                        if (pVar6 == null) {
                            float f111111111116 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f111111111116, f111111111116, f111111111116, f111111111116);
                        } else {
                            float f111111111117 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f111111111117, TextFieldKt.f11841a, f111111111117, TextFieldKt.f11842b);
                        }
                        pVar13 = pVar11;
                        l12 = n10;
                        i30 = i29 & (-7169);
                        l0Var3 = l0VarB;
                        z16 = z15;
                    } else {
                        l0 l0Var111111114 = l0VarB;
                        boolean z11111110 = z15;
                        pVar13 = pVar11;
                        l12 = l10;
                        z16 = z11111110;
                        i30 = i29;
                        l0Var3 = l0Var111111114;
                    }
                } else {
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i20 != 0) {
                        pVar6 = null;
                    }
                    if (i22 != 0) {
                        pVar7 = null;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i26 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        p270w.a aVar11111111119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar111111111110 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar11111111119, null, null, aVar111111111110, aVar111111111110, 3);
                        i29 &= -113;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i12 & 4096) != 0) {
                        uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        i29 &= -897;
                    } else {
                        uB = u10;
                    }
                    if ((i12 & 8192) != 0) {
                        if (pVar6 == null) {
                            float f111111111118 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f111111111118, f111111111118, f111111111118, f111111111118);
                        } else {
                            float f111111111119 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f111111111119, TextFieldKt.f11841a, f111111111119, TextFieldKt.f11842b);
                        }
                        pVar13 = pVar11;
                        l12 = n10;
                        i30 = i29 & (-7169);
                        l0Var3 = l0VarB;
                        z16 = z15;
                    } else {
                        l0 l0Var111111115 = l0VarB;
                        boolean z11111111 = z15;
                        pVar13 = pVar11;
                        l12 = l10;
                        z16 = z11111111;
                        i30 = i29;
                        l0Var3 = l0Var111111115;
                    }
                }
                c1086gP.U();
                int i3111111112 = i13 << 3;
                int i3111111113 = i13 >> 9;
                int i3111111114 = i30 << 6;
                TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i3111111112 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3111111112 & 896) | ((i13 >> 3) & 7168) | (i3111111113 & 57344) | (i3111111113 & 458752) | (i3111111113 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i3111111114 & 7168) | (i3111111114 & 57344));
                z14 = z16;
                pVar8 = pVar13;
                l0Var2 = l0Var3;
                l11 = l12;
                u11 = uB;
                pVar9 = pVar7;
                pVar10 = pVar12;
            } else {
                c1086gP.w();
                z14 = z12;
                pVar8 = pVar4;
                l0Var2 = l0Var;
                u11 = u10;
                l11 = l10;
                pVar9 = pVar7;
                pVar10 = pVar5;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final l0 l0Var111111116 = l0Var2;
                final U u1119 = u11;
                final androidx.compose.foundation.layout.L l11110 = l11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var111111116, u1119, l11110, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 3072;
        if ((i12 & 16) != 0) {
            if ((i10 & 24576) == 0) {
                if (c1086gP.K(e10)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            if ((i12 & 32) != 0) {
                i13 |= 196608;
            } else if ((i10 & 196608) == 0) {
                if (c1086gP.K(jVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c1086gP.c(z12)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            i20 = i12 & 128;
            if (i20 != 0) {
                i13 |= 12582912;
                pVar6 = pVar2;
            } else {
                pVar6 = pVar2;
                if ((i10 & 12582912) == 0) {
                    if (c1086gP.k(pVar6)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                i13 |= 100663296;
                pVar7 = pVar3;
            } else {
                pVar7 = pVar3;
                if ((i10 & 100663296) == 0) {
                    if (c1086gP.k(pVar7)) {
                        i23 = 67108864;
                    } else {
                        i23 = 33554432;
                    }
                    i13 |= i23;
                }
            }
            i24 = i12 & 512;
            if (i24 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c1086gP.k(pVar4)) {
                    i25 = 536870912;
                } else {
                    i25 = 268435456;
                }
                i13 |= i25;
            }
            i26 = i12 & 1024;
            if (i26 != 0) {
                i27 = i11 | 6;
            } else if ((i11 & 6) == 0) {
                if (c1086gP.k(pVar5)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i11 | i28;
            } else {
                i27 = i11;
            }
            if ((i11 & 48) != 0) {
                i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
            }
            if ((i11 & 384) != 0) {
                i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
            }
            if ((i11 & 3072) != 0) {
                i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
            }
            i29 = i27;
            if ((i12 & 16384) != 0) {
                if ((i11 & 24576) == 0) {
                    i29 |= c1086gP.K(this) ? 16384 : 8192;
                }
                if ((i13 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c1086gP.C(i13 & 1, z13)) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar111111111111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar111111111112 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar111111111111, null, null, aVar111111111112, aVar111111111112, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f1111111111110 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111111111110, f1111111111110, f1111111111110, f1111111111110);
                            } else {
                                float f1111111111111 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111111111111, TextFieldKt.f11841a, f1111111111111, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var111111117 = l0VarB;
                            boolean z11111112 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z11111112;
                            i30 = i29;
                            l0Var3 = l0Var111111117;
                        }
                    } else {
                        if (i18 != 0) {
                            z15 = false;
                        } else {
                            z15 = z12;
                        }
                        if (i20 != 0) {
                            pVar6 = null;
                        }
                        if (i22 != 0) {
                            pVar7 = null;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i26 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            p270w.a aVar111111111113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar111111111114 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar111111111113, null, null, aVar111111111114, aVar111111111114, 3);
                            i29 &= -113;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i12 & 4096) != 0) {
                            uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            i29 &= -897;
                        } else {
                            uB = u10;
                        }
                        if ((i12 & 8192) != 0) {
                            if (pVar6 == null) {
                                float f1111111111112 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111111111112, f1111111111112, f1111111111112, f1111111111112);
                            } else {
                                float f1111111111113 = TextFieldImplKt.f11839a;
                                n10 = new androidx.compose.foundation.layout.N(f1111111111113, TextFieldKt.f11841a, f1111111111113, TextFieldKt.f11842b);
                            }
                            pVar13 = pVar11;
                            l12 = n10;
                            i30 = i29 & (-7169);
                            l0Var3 = l0VarB;
                            z16 = z15;
                        } else {
                            l0 l0Var111111118 = l0VarB;
                            boolean z11111113 = z15;
                            pVar13 = pVar11;
                            l12 = l10;
                            z16 = z11111113;
                            i30 = i29;
                            l0Var3 = l0Var111111118;
                        }
                    }
                    c1086gP.U();
                    int i3111111115 = i13 << 3;
                    int i3111111116 = i13 >> 9;
                    int i3111111117 = i30 << 6;
                    TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i3111111115 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3111111115 & 896) | ((i13 >> 3) & 7168) | (i3111111116 & 57344) | (i3111111116 & 458752) | (i3111111116 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i3111111117 & 7168) | (i3111111117 & 57344));
                    z14 = z16;
                    pVar8 = pVar13;
                    l0Var2 = l0Var3;
                    l11 = l12;
                    u11 = uB;
                    pVar9 = pVar7;
                    pVar10 = pVar12;
                } else {
                    c1086gP.w();
                    z14 = z12;
                    pVar8 = pVar4;
                    l0Var2 = l0Var;
                    u11 = u10;
                    l11 = l10;
                    pVar9 = pVar7;
                    pVar10 = pVar5;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final l0 l0Var111111119 = l0Var2;
                    final U u11110 = u11;
                    final androidx.compose.foundation.layout.L l11111 = l11;
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var111111119, u11110, l11111, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i29 |= 24576;
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c1086gP.C(i13 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i20 != 0) {
                        pVar6 = null;
                    }
                    if (i22 != 0) {
                        pVar7 = null;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i26 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        p270w.a aVar111111111115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar111111111116 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar111111111115, null, null, aVar111111111116, aVar111111111116, 3);
                        i29 &= -113;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i12 & 4096) != 0) {
                        uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        i29 &= -897;
                    } else {
                        uB = u10;
                    }
                    if ((i12 & 8192) != 0) {
                        if (pVar6 == null) {
                            float f1111111111114 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f1111111111114, f1111111111114, f1111111111114, f1111111111114);
                        } else {
                            float f1111111111115 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f1111111111115, TextFieldKt.f11841a, f1111111111115, TextFieldKt.f11842b);
                        }
                        pVar13 = pVar11;
                        l12 = n10;
                        i30 = i29 & (-7169);
                        l0Var3 = l0VarB;
                        z16 = z15;
                    } else {
                        l0 l0Var1111111110 = l0VarB;
                        boolean z11111114 = z15;
                        pVar13 = pVar11;
                        l12 = l10;
                        z16 = z11111114;
                        i30 = i29;
                        l0Var3 = l0Var1111111110;
                    }
                } else {
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i20 != 0) {
                        pVar6 = null;
                    }
                    if (i22 != 0) {
                        pVar7 = null;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i26 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        p270w.a aVar111111111117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar111111111118 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar111111111117, null, null, aVar111111111118, aVar111111111118, 3);
                        i29 &= -113;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i12 & 4096) != 0) {
                        uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        i29 &= -897;
                    } else {
                        uB = u10;
                    }
                    if ((i12 & 8192) != 0) {
                        if (pVar6 == null) {
                            float f1111111111116 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f1111111111116, f1111111111116, f1111111111116, f1111111111116);
                        } else {
                            float f1111111111117 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f1111111111117, TextFieldKt.f11841a, f1111111111117, TextFieldKt.f11842b);
                        }
                        pVar13 = pVar11;
                        l12 = n10;
                        i30 = i29 & (-7169);
                        l0Var3 = l0VarB;
                        z16 = z15;
                    } else {
                        l0 l0Var1111111111 = l0VarB;
                        boolean z11111115 = z15;
                        pVar13 = pVar11;
                        l12 = l10;
                        z16 = z11111115;
                        i30 = i29;
                        l0Var3 = l0Var1111111111;
                    }
                }
                c1086gP.U();
                int i3111111118 = i13 << 3;
                int i3111111119 = i13 >> 9;
                int i31111111110 = i30 << 6;
                TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i3111111118 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i3111111118 & 896) | ((i13 >> 3) & 7168) | (i3111111119 & 57344) | (i3111111119 & 458752) | (i3111111119 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i31111111110 & 7168) | (i31111111110 & 57344));
                z14 = z16;
                pVar8 = pVar13;
                l0Var2 = l0Var3;
                l11 = l12;
                u11 = uB;
                pVar9 = pVar7;
                pVar10 = pVar12;
            } else {
                c1086gP.w();
                z14 = z12;
                pVar8 = pVar4;
                l0Var2 = l0Var;
                u11 = u10;
                l11 = l10;
                pVar9 = pVar7;
                pVar10 = pVar5;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final l0 l0Var1111111112 = l0Var2;
                final U u11111 = u11;
                final androidx.compose.foundation.layout.L l11112 = l11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var1111111112, u11111, l11112, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i13 |= 24576;
        if ((i12 & 32) != 0) {
            i13 |= 196608;
        } else if ((i10 & 196608) == 0) {
            if (c1086gP.K(jVar)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i13 |= i17;
        }
        i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c1086gP.c(z12)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i13 |= i19;
        }
        i20 = i12 & 128;
        if (i20 != 0) {
            i13 |= 12582912;
            pVar6 = pVar2;
        } else {
            pVar6 = pVar2;
            if ((i10 & 12582912) == 0) {
                if (c1086gP.k(pVar6)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i13 |= i21;
            }
        }
        i22 = i12 & 256;
        if (i22 != 0) {
            i13 |= 100663296;
            pVar7 = pVar3;
        } else {
            pVar7 = pVar3;
            if ((i10 & 100663296) == 0) {
                if (c1086gP.k(pVar7)) {
                    i23 = 67108864;
                } else {
                    i23 = 33554432;
                }
                i13 |= i23;
            }
        }
        i24 = i12 & 512;
        if (i24 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c1086gP.k(pVar4)) {
                i25 = 536870912;
            } else {
                i25 = 268435456;
            }
            i13 |= i25;
        }
        i26 = i12 & 1024;
        if (i26 != 0) {
            i27 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            if (c1086gP.k(pVar5)) {
                i28 = 4;
            } else {
                i28 = 2;
            }
            i27 = i11 | i28;
        } else {
            i27 = i11;
        }
        if ((i11 & 48) != 0) {
            i27 |= ((i12 & 2048) == 0 || !c1086gP.K(l0Var)) ? 16 : 32;
        }
        if ((i11 & 384) != 0) {
            i27 |= ((i12 & 4096) == 0 || !c1086gP.K(u10)) ? 128 : 256;
        }
        if ((i11 & 3072) != 0) {
            i27 |= ((i12 & 8192) == 0 || !c1086gP.K(l10)) ? 1024 : 2048;
        }
        i29 = i27;
        if ((i12 & 16384) != 0) {
            if ((i11 & 24576) == 0) {
                i29 |= c1086gP.K(this) ? 16384 : 8192;
            }
            if ((i13 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c1086gP.C(i13 & 1, z13)) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i20 != 0) {
                        pVar6 = null;
                    }
                    if (i22 != 0) {
                        pVar7 = null;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i26 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        p270w.a aVar111111111119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar1111111111110 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar111111111119, null, null, aVar1111111111110, aVar1111111111110, 3);
                        i29 &= -113;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i12 & 4096) != 0) {
                        uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        i29 &= -897;
                    } else {
                        uB = u10;
                    }
                    if ((i12 & 8192) != 0) {
                        if (pVar6 == null) {
                            float f1111111111118 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f1111111111118, f1111111111118, f1111111111118, f1111111111118);
                        } else {
                            float f1111111111119 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f1111111111119, TextFieldKt.f11841a, f1111111111119, TextFieldKt.f11842b);
                        }
                        pVar13 = pVar11;
                        l12 = n10;
                        i30 = i29 & (-7169);
                        l0Var3 = l0VarB;
                        z16 = z15;
                    } else {
                        l0 l0Var1111111113 = l0VarB;
                        boolean z11111116 = z15;
                        pVar13 = pVar11;
                        l12 = l10;
                        z16 = z11111116;
                        i30 = i29;
                        l0Var3 = l0Var1111111113;
                    }
                } else {
                    if (i18 != 0) {
                        z15 = false;
                    } else {
                        z15 = z12;
                    }
                    if (i20 != 0) {
                        pVar6 = null;
                    }
                    if (i22 != 0) {
                        pVar7 = null;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i26 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        p270w.a aVar1111111111111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar1111111111112 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar1111111111111, null, null, aVar1111111111112, aVar1111111111112, 3);
                        i29 &= -113;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i12 & 4096) != 0) {
                        uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        i29 &= -897;
                    } else {
                        uB = u10;
                    }
                    if ((i12 & 8192) != 0) {
                        if (pVar6 == null) {
                            float f11111111111110 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f11111111111110, f11111111111110, f11111111111110, f11111111111110);
                        } else {
                            float f11111111111111 = TextFieldImplKt.f11839a;
                            n10 = new androidx.compose.foundation.layout.N(f11111111111111, TextFieldKt.f11841a, f11111111111111, TextFieldKt.f11842b);
                        }
                        pVar13 = pVar11;
                        l12 = n10;
                        i30 = i29 & (-7169);
                        l0Var3 = l0VarB;
                        z16 = z15;
                    } else {
                        l0 l0Var1111111114 = l0VarB;
                        boolean z11111117 = z15;
                        pVar13 = pVar11;
                        l12 = l10;
                        z16 = z11111117;
                        i30 = i29;
                        l0Var3 = l0Var1111111114;
                    }
                }
                c1086gP.U();
                int i31111111111 = i13 << 3;
                int i31111111112 = i13 >> 9;
                int i31111111113 = i30 << 6;
                TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i31111111111 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31111111111 & 896) | ((i13 >> 3) & 7168) | (i31111111112 & 57344) | (i31111111112 & 458752) | (i31111111112 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i31111111113 & 7168) | (i31111111113 & 57344));
                z14 = z16;
                pVar8 = pVar13;
                l0Var2 = l0Var3;
                l11 = l12;
                u11 = uB;
                pVar9 = pVar7;
                pVar10 = pVar12;
            } else {
                c1086gP.w();
                z14 = z12;
                pVar8 = pVar4;
                l0Var2 = l0Var;
                u11 = u10;
                l11 = l10;
                pVar9 = pVar7;
                pVar10 = pVar5;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final l0 l0Var1111111115 = l0Var2;
                final U u11112 = u11;
                final androidx.compose.foundation.layout.L l11113 = l11;
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var1111111115, u11112, l11113, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i29 |= 24576;
        if ((i13 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c1086gP.C(i13 & 1, z13)) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (i20 != 0) {
                    pVar6 = null;
                }
                if (i22 != 0) {
                    pVar7 = null;
                }
                if (i24 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i26 == 0) {
                }
                if ((i12 & 2048) != 0) {
                    p270w.a aVar1111111111113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    w.c.a aVar1111111111114 = p270w.c.f47677a;
                    l0VarB = p270w.a.b(aVar1111111111113, null, null, aVar1111111111114, aVar1111111111114, 3);
                    i29 &= -113;
                } else {
                    l0VarB = l0Var;
                }
                if ((i12 & 4096) != 0) {
                    uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                    i29 &= -897;
                } else {
                    uB = u10;
                }
                if ((i12 & 8192) != 0) {
                    if (pVar6 == null) {
                        float f11111111111112 = TextFieldImplKt.f11839a;
                        n10 = new androidx.compose.foundation.layout.N(f11111111111112, f11111111111112, f11111111111112, f11111111111112);
                    } else {
                        float f11111111111113 = TextFieldImplKt.f11839a;
                        n10 = new androidx.compose.foundation.layout.N(f11111111111113, TextFieldKt.f11841a, f11111111111113, TextFieldKt.f11842b);
                    }
                    pVar13 = pVar11;
                    l12 = n10;
                    i30 = i29 & (-7169);
                    l0Var3 = l0VarB;
                    z16 = z15;
                } else {
                    l0 l0Var1111111116 = l0VarB;
                    boolean z11111118 = z15;
                    pVar13 = pVar11;
                    l12 = l10;
                    z16 = z11111118;
                    i30 = i29;
                    l0Var3 = l0Var1111111116;
                }
            } else {
                if (i18 != 0) {
                    z15 = false;
                } else {
                    z15 = z12;
                }
                if (i20 != 0) {
                    pVar6 = null;
                }
                if (i22 != 0) {
                    pVar7 = null;
                }
                if (i24 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i26 == 0) {
                }
                if ((i12 & 2048) != 0) {
                    p270w.a aVar1111111111115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    w.c.a aVar1111111111116 = p270w.c.f47677a;
                    l0VarB = p270w.a.b(aVar1111111111115, null, null, aVar1111111111116, aVar1111111111116, 3);
                    i29 &= -113;
                } else {
                    l0VarB = l0Var;
                }
                if ((i12 & 4096) != 0) {
                    uB = b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                    i29 &= -897;
                } else {
                    uB = u10;
                }
                if ((i12 & 8192) != 0) {
                    if (pVar6 == null) {
                        float f11111111111114 = TextFieldImplKt.f11839a;
                        n10 = new androidx.compose.foundation.layout.N(f11111111111114, f11111111111114, f11111111111114, f11111111111114);
                    } else {
                        float f11111111111115 = TextFieldImplKt.f11839a;
                        n10 = new androidx.compose.foundation.layout.N(f11111111111115, TextFieldKt.f11841a, f11111111111115, TextFieldKt.f11842b);
                    }
                    pVar13 = pVar11;
                    l12 = n10;
                    i30 = i29 & (-7169);
                    l0Var3 = l0VarB;
                    z16 = z15;
                } else {
                    l0 l0Var1111111117 = l0VarB;
                    boolean z11111119 = z15;
                    pVar13 = pVar11;
                    l12 = l10;
                    z16 = z11111119;
                    i30 = i29;
                    l0Var3 = l0Var1111111117;
                }
            }
            c1086gP.U();
            int i31111111114 = i13 << 3;
            int i31111111115 = i13 >> 9;
            int i31111111116 = i30 << 6;
            TextFieldImplKt.a(TextFieldType.f11857b, str, pVar, e10, pVar6, pVar7, pVar13, pVar12, z11, z10, z16, jVar, l12, l0Var3, uB, null, c1086gP, (i31111111114 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6 | (i31111111114 & 896) | ((i13 >> 3) & 7168) | (i31111111115 & 57344) | (i31111111115 & 458752) | (i31111111115 & 3670016) | ((i30 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i13 >> 18) & 14) | 196608 | ((i30 >> 3) & 896) | (i31111111116 & 7168) | (i31111111116 & 57344));
            z14 = z16;
            pVar8 = pVar13;
            l0Var2 = l0Var3;
            l11 = l12;
            u11 = uB;
            pVar9 = pVar7;
            pVar10 = pVar12;
        } else {
            c1086gP.w();
            z14 = z12;
            pVar8 = pVar4;
            l0Var2 = l0Var;
            u11 = u10;
            l11 = l10;
            pVar9 = pVar7;
            pVar10 = pVar5;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final l0 l0Var1111111118 = l0Var2;
            final U u11113 = u11;
            final androidx.compose.foundation.layout.L l11114 = l11;
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    this.$tmp0_rcvr.a(str, pVar, z10, z11, e10, jVar, z14, pVar6, pVar9, pVar8, pVar10, l0Var1111111118, u11113, l11114, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11), i12);
                    return p293xa.r.f47939a;
                }
            };
        }
    }
}
