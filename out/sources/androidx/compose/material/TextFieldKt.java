package androidx.compose.material;

import androidx.compose.animation.core.C0902b;
import androidx.compose.animation.core.C0907g;
import androidx.compose.foundation.C0937i;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.unit.LayoutDirection;
import com.braze.support.BrazeLogger;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11841a = 20;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11842b = 10;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11843c = 2;

    /* JADX WARN: Code duplicated, block: B:101:0x0137  */
    /* JADX WARN: Code duplicated, block: B:103:0x013d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0143  */
    /* JADX WARN: Code duplicated, block: B:106:0x0146  */
    /* JADX WARN: Code duplicated, block: B:110:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0154  */
    /* JADX WARN: Code duplicated, block: B:114:0x015a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0160  */
    /* JADX WARN: Code duplicated, block: B:118:0x0165  */
    /* JADX WARN: Code duplicated, block: B:121:0x016c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0171  */
    /* JADX WARN: Code duplicated, block: B:125:0x0177  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0180  */
    /* JADX WARN: Code duplicated, block: B:132:0x0189  */
    /* JADX WARN: Code duplicated, block: B:133:0x018c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0190  */
    /* JADX WARN: Code duplicated, block: B:137:0x0198  */
    /* JADX WARN: Code duplicated, block: B:138:0x019b  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01be  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:160:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:165:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:170:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:172:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:175:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:176:0x0203  */
    /* JADX WARN: Code duplicated, block: B:178:0x0209  */
    /* JADX WARN: Code duplicated, block: B:180:0x020f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0212  */
    /* JADX WARN: Code duplicated, block: B:185:0x021a  */
    /* JADX WARN: Code duplicated, block: B:186:0x021f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0225  */
    /* JADX WARN: Code duplicated, block: B:190:0x022b  */
    /* JADX WARN: Code duplicated, block: B:191:0x022e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0238  */
    /* JADX WARN: Code duplicated, block: B:197:0x023e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0247  */
    /* JADX WARN: Code duplicated, block: B:202:0x024c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0252  */
    /* JADX WARN: Code duplicated, block: B:207:0x0258  */
    /* JADX WARN: Code duplicated, block: B:210:0x0261  */
    /* JADX WARN: Code duplicated, block: B:212:0x0266  */
    /* JADX WARN: Code duplicated, block: B:215:0x0272  */
    /* JADX WARN: Code duplicated, block: B:219:0x027f  */
    /* JADX WARN: Code duplicated, block: B:222:0x0289  */
    /* JADX WARN: Code duplicated, block: B:224:0x0293  */
    /* JADX WARN: Code duplicated, block: B:243:0x02e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:244:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:245:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:247:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:248:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:250:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:251:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:254:0x0301  */
    /* JADX WARN: Code duplicated, block: B:255:0x030b  */
    /* JADX WARN: Code duplicated, block: B:257:0x030f  */
    /* JADX WARN: Code duplicated, block: B:258:0x0312  */
    /* JADX WARN: Code duplicated, block: B:260:0x0316  */
    /* JADX WARN: Code duplicated, block: B:261:0x0318  */
    /* JADX WARN: Code duplicated, block: B:263:0x031c  */
    /* JADX WARN: Code duplicated, block: B:264:0x031e  */
    /* JADX WARN: Code duplicated, block: B:266:0x0322  */
    /* JADX WARN: Code duplicated, block: B:267:0x0324  */
    /* JADX WARN: Code duplicated, block: B:269:0x0328  */
    /* JADX WARN: Code duplicated, block: B:270:0x032a  */
    /* JADX WARN: Code duplicated, block: B:272:0x032e  */
    /* JADX WARN: Code duplicated, block: B:273:0x0331  */
    /* JADX WARN: Code duplicated, block: B:275:0x0335  */
    /* JADX WARN: Code duplicated, block: B:277:0x033a  */
    /* JADX WARN: Code duplicated, block: B:280:0x0340  */
    /* JADX WARN: Code duplicated, block: B:281:0x034f  */
    /* JADX WARN: Code duplicated, block: B:283:0x0358  */
    /* JADX WARN: Code duplicated, block: B:284:0x035a  */
    /* JADX WARN: Code duplicated, block: B:287:0x0360 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:288:0x0362  */
    /* JADX WARN: Code duplicated, block: B:290:0x0367  */
    /* JADX WARN: Code duplicated, block: B:292:0x036e  */
    /* JADX WARN: Code duplicated, block: B:294:0x0372  */
    /* JADX WARN: Code duplicated, block: B:295:0x0375  */
    /* JADX WARN: Code duplicated, block: B:298:0x037a  */
    /* JADX WARN: Code duplicated, block: B:301:0x0380  */
    /* JADX WARN: Code duplicated, block: B:302:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:305:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:307:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:310:0x0411  */
    /* JADX WARN: Code duplicated, block: B:312:0x041f  */
    /* JADX WARN: Code duplicated, block: B:314:0x0430  */
    /* JADX WARN: Code duplicated, block: B:318:0x0450  */
    /* JADX WARN: Code duplicated, block: B:321:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:323:0x054f  */
    /* JADX WARN: Code duplicated, block: B:326:0x057c  */
    /* JADX WARN: Code duplicated, block: B:328:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0101  */
    /* JADX WARN: Code duplicated, block: B:84:0x0107  */
    /* JADX WARN: Code duplicated, block: B:85:0x010a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:0x011f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0125  */
    /* JADX WARN: Code duplicated, block: B:95:0x0128  */
    /* JADX WARN: Code duplicated, block: B:99:0x0132  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final Ia.l<? super String, p293xa.r> lVar, androidx.compose.ui.h hVar, boolean z10, boolean z11, androidx.compose.ui.text.F f10, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, boolean z12, androidx.compose.ui.text.input.E e10, androidx.compose.foundation.text.k kVar, androidx.compose.foundation.text.j jVar, boolean z13, int i10, int i11, androidx.compose.foundation.interaction.k kVar2, l0 l0Var, U u10, InterfaceC1084f interfaceC1084f, final int i12, final int i13, final int i14) {
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
        int i37;
        int i38;
        int i39;
        int i40;
        boolean z14;
        boolean z15;
        final androidx.compose.ui.h hVar2;
        final boolean z16;
        final boolean z17;
        final androidx.compose.ui.text.F f11;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8;
        final boolean z18;
        final androidx.compose.ui.text.input.E e11;
        final androidx.compose.foundation.text.k kVar3;
        final androidx.compose.foundation.text.j jVar2;
        final boolean z19;
        final int i41;
        final int i42;
        final androidx.compose.foundation.interaction.k kVar4;
        final l0 l0Var2;
        final U u11;
        C1105p0 c1105p0V;
        androidx.compose.ui.h hVar3;
        boolean z20;
        boolean z21;
        androidx.compose.ui.text.F f12;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar10;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12;
        boolean z22;
        androidx.compose.ui.text.input.E e12;
        androidx.compose.foundation.text.k kVar5;
        androidx.compose.foundation.interaction.k kVar6;
        androidx.compose.foundation.text.j jVar3;
        boolean z23;
        int i43;
        l0 l0VarB;
        U uB;
        boolean z24;
        int i44;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13;
        androidx.compose.foundation.interaction.k kVar7;
        long jB;
        androidx.compose.ui.h hVarA;
        final String strK;
        Object objF;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        C1086g c1086gP = interfaceC1084f.p(-1504264404);
        if ((i14 & 1) != 0) {
            i15 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i15 = i12 | (c1086gP.K(str) ? 4 : 2);
        } else {
            i15 = i12;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i12 & 48) == 0) {
            i15 |= c1086gP.k(lVar) ? 32 : 16;
        }
        int i50 = i15;
        int i51 = i14 & 4;
        if (i51 == 0) {
            if ((i12 & 384) == 0) {
                i50 |= c1086gP.K(hVar) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i12 & 3072) == 0) {
                    if (c1086gP.c(z10)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i50 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i12 & 24576) == 0) {
                        if (c1086gP.c(z11)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i50 |= i19;
                    }
                    if ((i12 & 196608) != 0) {
                        if ((i14 & 32) == 0 || !c1086gP.K(f10)) {
                            i49 = 65536;
                        } else {
                            i49 = 131072;
                        }
                        i50 |= i49;
                    }
                    i20 = i14 & 64;
                    if (i20 != 0) {
                        i50 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c1086gP.k(pVar)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i50 |= i21;
                    }
                    i22 = i14 & 128;
                    if (i22 != 0) {
                        i50 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c1086gP.k(pVar2)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i50 |= i23;
                    }
                    i24 = i14 & 256;
                    if (i24 != 0) {
                        i50 |= 100663296;
                    } else if ((i12 & 100663296) == 0) {
                        if (c1086gP.k(pVar3)) {
                            i25 = 67108864;
                        } else {
                            i25 = 33554432;
                        }
                        i50 |= i25;
                    }
                    i26 = i14 & 512;
                    if (i26 != 0) {
                        i50 |= 805306368;
                    } else if ((i12 & 805306368) == 0) {
                        if (c1086gP.k(pVar4)) {
                            i27 = 536870912;
                        } else {
                            i27 = 268435456;
                        }
                        i50 |= i27;
                    }
                    i28 = i14 & 1024;
                    if (i28 != 0) {
                        i29 = i13 | 6;
                    } else if ((i13 & 6) == 0) {
                        i29 = i13 | (c1086gP.c(z12) ? 4 : 2);
                    } else {
                        i29 = i13;
                    }
                    i30 = i14 & 2048;
                    if (i30 != 0) {
                        i29 |= 48;
                    } else if ((i13 & 48) == 0) {
                        if (c1086gP.K(e10)) {
                            i31 = 32;
                        } else {
                            i31 = 16;
                        }
                        i29 |= i31;
                    }
                    i32 = i29;
                    i33 = i14 & 4096;
                    if (i33 != 0) {
                        i32 |= 384;
                    } else if ((i13 & 384) != 0) {
                        if (c1086gP.K(kVar)) {
                            i34 = 256;
                        } else {
                            i34 = 128;
                        }
                        i32 |= i34;
                    }
                    if ((i13 & 3072) != 0) {
                        if ((i14 & 8192) == 0 || !c1086gP.K(jVar)) {
                            i48 = 1024;
                        } else {
                            i48 = 2048;
                        }
                        i32 |= i48;
                    }
                    i35 = i14 & 16384;
                    if (i35 != 0) {
                        if ((i13 & 24576) == 0) {
                            if (c1086gP.c(z13)) {
                                i36 = 16384;
                            } else {
                                i36 = 8192;
                            }
                            i32 |= i36;
                        }
                        if ((i13 & 196608) != 0) {
                            if ((i14 & 32768) == 0 || !c1086gP.h(i10)) {
                                i47 = 65536;
                            } else {
                                i47 = 131072;
                            }
                            i32 |= i47;
                        }
                        i37 = i14 & 65536;
                        if (i37 != 0) {
                            i32 |= 1572864;
                        } else if ((i13 & 1572864) == 0) {
                            if (c1086gP.h(i11)) {
                                i38 = 1048576;
                            } else {
                                i38 = 524288;
                            }
                            i32 |= i38;
                        }
                        i39 = i14 & 131072;
                        if (i39 != 0) {
                            i32 |= 12582912;
                        } else if ((i13 & 12582912) == 0) {
                            if (c1086gP.K(kVar2)) {
                                i40 = 8388608;
                            } else {
                                i40 = 4194304;
                            }
                            i32 |= i40;
                        }
                        if ((i13 & 100663296) != 0) {
                            if ((i14 & 262144) == 0 || !c1086gP.K(l0Var)) {
                                i46 = 33554432;
                            } else {
                                i46 = 67108864;
                            }
                            i32 |= i46;
                        }
                        if ((i13 & 805306368) != 0) {
                            if ((i14 & 524288) == 0 || !c1086gP.K(u10)) {
                                i45 = 268435456;
                            } else {
                                i45 = 536870912;
                            }
                            i32 |= i45;
                        }
                        if ((i50 & 306783379) == 306783378 || (306783379 & i32) != 306783378) {
                            z14 = true;
                            z15 = true;
                        } else {
                            z14 = true;
                            z15 = false;
                        }
                        if (c1086gP.C(i50 & 1, z15)) {
                            c1086gP.r0();
                            if ((i12 & 1) != 0 || c1086gP.a0()) {
                                if (i51 != 0) {
                                    hVar3 = androidx.compose.ui.h.a.f13984b;
                                } else {
                                    hVar3 = hVar;
                                }
                                if (i16 != 0) {
                                    z20 = z14;
                                } else {
                                    z20 = z10;
                                }
                                if (i18 != 0) {
                                    z21 = false;
                                } else {
                                    z21 = z11;
                                }
                                if ((i14 & 32) != 0) {
                                    f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                                    i50 &= -458753;
                                } else {
                                    f12 = f10;
                                }
                                if (i20 != 0) {
                                    pVar9 = null;
                                } else {
                                    pVar9 = pVar;
                                }
                                if (i22 != 0) {
                                    pVar10 = null;
                                } else {
                                    pVar10 = pVar2;
                                }
                                if (i24 != 0) {
                                    pVar11 = null;
                                } else {
                                    pVar11 = pVar3;
                                }
                                if (i26 != 0) {
                                    pVar12 = null;
                                } else {
                                    pVar12 = pVar4;
                                }
                                if (i28 != 0) {
                                    z22 = false;
                                } else {
                                    z22 = z12;
                                }
                                if (i30 != 0) {
                                    e12 = androidx.compose.ui.text.input.E.a.f15486a;
                                } else {
                                    e12 = e10;
                                }
                                if (i33 != 0) {
                                    kVar5 = androidx.compose.foundation.text.k.f11351g;
                                } else {
                                    kVar5 = kVar;
                                }
                                if ((8192 & i14) != 0) {
                                    kVar6 = null;
                                    jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                                    i32 &= -7169;
                                } else {
                                    kVar6 = null;
                                    jVar3 = jVar;
                                }
                                if (i35 != 0) {
                                    z23 = false;
                                } else {
                                    z23 = z13;
                                }
                                if ((i14 & 32768) != 0) {
                                    if (z23) {
                                        i43 = 1;
                                    } else {
                                        i43 = BrazeLogger.SUPPRESS;
                                    }
                                    i32 &= -458753;
                                } else {
                                    i43 = i10;
                                }
                                if (i37 != 0) {
                                    i42 = 1;
                                } else {
                                    i42 = i11;
                                }
                                if (i39 == 0) {
                                    kVar6 = kVar2;
                                }
                                if ((i14 & 262144) != 0) {
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f11834a;
                                    p270w.a aVar = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                    w.c.a aVar2 = p270w.c.f47677a;
                                    l0VarB = p270w.a.b(aVar, null, null, aVar2, aVar2, 3);
                                    i32 &= -234881025;
                                } else {
                                    l0VarB = l0Var;
                                }
                                if ((i14 & 524288) != 0) {
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f11834a;
                                    i32 &= -1879048193;
                                    uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                                } else {
                                    uB = u10;
                                }
                                i41 = i43;
                                z24 = z23;
                                i44 = i32;
                                pVar13 = pVar9;
                            } else {
                                c1086gP.w();
                                if ((i14 & 32) != 0) {
                                    i50 &= -458753;
                                }
                                if ((8192 & i14) != 0) {
                                    i32 &= -7169;
                                }
                                if ((i14 & 32768) != 0) {
                                    i32 &= -458753;
                                }
                                if ((i14 & 262144) != 0) {
                                    i32 &= -234881025;
                                }
                                if ((i14 & 524288) != 0) {
                                    i32 &= -1879048193;
                                }
                                hVar3 = hVar;
                                z20 = z10;
                                z21 = z11;
                                f12 = f10;
                                pVar10 = pVar2;
                                pVar11 = pVar3;
                                pVar12 = pVar4;
                                e12 = e10;
                                kVar5 = kVar;
                                jVar3 = jVar;
                                z24 = z13;
                                i41 = i10;
                                i42 = i11;
                                kVar6 = kVar2;
                                l0VarB = l0Var;
                                uB = u10;
                                i44 = i32;
                                i50 = i50;
                                pVar13 = pVar;
                                z22 = z12;
                            }
                            c1086gP.U();
                            if (kVar6 == null) {
                                c1086gP.L(-1665803660);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                c1086gP.T(false);
                                kVar7 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                c1086gP.L(-53736253);
                                c1086gP.T(false);
                                kVar7 = kVar6;
                            }
                            c1086gP.L(-53730507);
                            jB = f12.b();
                            if (jB == 16) {
                                jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                            }
                            androidx.compose.foundation.text.j jVar4 = jVar3;
                            c1086gP.T(false);
                            androidx.compose.ui.text.F fD = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                            final float f13 = TextFieldDefaults.f11838e;
                            final float f14 = TextFieldDefaults.f11837d;
                            androidx.compose.ui.text.F f15 = f12;
                            final boolean z25 = z20;
                            final boolean z26 = z22;
                            final androidx.compose.foundation.interaction.k kVar8 = kVar7;
                            final U u12 = uB;
                            hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // Ia.q
                                public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                                    N0 n0I;
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    num.intValue();
                                    interfaceC1084f3.L(1398930845);
                                    boolean z27 = z25;
                                    boolean z28 = z26;
                                    androidx.compose.foundation.interaction.j jVar5 = kVar8;
                                    U u13 = u12;
                                    float f16 = f13;
                                    float f17 = f14;
                                    X xA = androidx.compose.foundation.interaction.f.a(jVar5, interfaceC1084f3, 0);
                                    N0<androidx.compose.ui.graphics.H> n0E = u13.e(z27, z28, jVar5, interfaceC1084f3, 0);
                                    if (!((Boolean) xA.getValue()).booleanValue()) {
                                        f16 = f17;
                                    }
                                    if (z27) {
                                        interfaceC1084f3.L(773088894);
                                        n0I = C0902b.a(f16, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                                        interfaceC1084f3.D();
                                    } else {
                                        interfaceC1084f3.L(773193116);
                                        n0I = J0.i(new p013b0.f(f17), interfaceC1084f3);
                                        interfaceC1084f3.D();
                                    }
                                    X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                                    androidx.compose.ui.h.a aVar3 = androidx.compose.ui.h.a.f13984b;
                                    final C0937i c0937i = (C0937i) xI.getValue();
                                    float f18 = TextFieldKt.f11841a;
                                    final float f19 = c0937i.f10065a;
                                    androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar3, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // Ia.l
                                        public final p293xa.r invoke(J.c cVar) {
                                            J.c cVar2 = cVar;
                                            cVar2.A1();
                                            if (!p013b0.f.a(f19, 0.0f)) {
                                                float density = cVar2.getDensity() * f19;
                                                float fB = I.h.b(cVar2.j()) - (density / 2);
                                                cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    });
                                    interfaceC1084f3.D();
                                    return hVarC;
                                }
                            });
                            strK = P3.d.k(c1086gP, 3);
                            float f16 = TextFieldImplKt.f11839a;
                            if (z22) {
                                hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                        String str2 = strK;
                                        Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                        wVar.e(SemanticsProperties.f15144J, str2);
                                        return p293xa.r.f47939a;
                                    }
                                });
                            }
                            final boolean z27 = z20;
                            final boolean z28 = z24;
                            final androidx.compose.ui.text.input.E e13 = e12;
                            final androidx.compose.foundation.interaction.k kVar9 = kVar7;
                            final boolean z29 = z22;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14 = pVar13;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15 = pVar10;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16 = pVar11;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17 = pVar12;
                            final l0 l0Var3 = l0VarB;
                            final U u13 = uB;
                            int i52 = i44 << 12;
                            BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD, kVar5, jVar4, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                 */
                                @Override // Ia.q
                                public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar18, InterfaceC1084f interfaceC1084f2, Integer num) {
                                    Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar19 = pVar18;
                                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                    int iIntValue = num.intValue();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= interfaceC1084f3.k(pVar19) ? 4 : 2;
                                    }
                                    int i53 = iIntValue;
                                    if (interfaceC1084f3.C(i53 & 1, (i53 & 19) != 18)) {
                                        TextFieldDefaults.f11834a.a(str, pVar19, z27, z28, e13, kVar9, z29, pVar14, pVar15, pVar16, pVar17, l0Var3, u13, null, interfaceC1084f3, (i53 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                                    } else {
                                        interfaceC1084f3.w();
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i52) | (29360128 & i52) | (234881024 & i52) | (i52 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                            jVar2 = jVar4;
                            pVar8 = pVar12;
                            e11 = e12;
                            z19 = z24;
                            hVar2 = hVar3;
                            u11 = uB;
                            z17 = z21;
                            kVar4 = kVar6;
                            l0Var2 = l0VarB;
                            z18 = z22;
                            kVar3 = kVar5;
                            pVar7 = pVar11;
                            f11 = f15;
                            z16 = z20;
                            pVar6 = pVar10;
                            pVar5 = pVar13;
                        } else {
                            c1086gP.w();
                            hVar2 = hVar;
                            z16 = z10;
                            z17 = z11;
                            f11 = f10;
                            pVar5 = pVar;
                            pVar6 = pVar2;
                            pVar7 = pVar3;
                            pVar8 = pVar4;
                            z18 = z12;
                            e11 = e10;
                            kVar3 = kVar;
                            jVar2 = jVar;
                            z19 = z13;
                            i41 = i10;
                            i42 = i11;
                            kVar4 = kVar2;
                            l0Var2 = l0Var;
                            u11 = u10;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i32 |= 24576;
                    if ((i13 & 196608) != 0) {
                        if ((i14 & 32768) == 0) {
                            i47 = 65536;
                        } else {
                            i47 = 65536;
                        }
                        i32 |= i47;
                    }
                    i37 = i14 & 65536;
                    if (i37 != 0) {
                        i32 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c1086gP.h(i11)) {
                            i38 = 1048576;
                        } else {
                            i38 = 524288;
                        }
                        i32 |= i38;
                    }
                    i39 = i14 & 131072;
                    if (i39 != 0) {
                        i32 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c1086gP.K(kVar2)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i32 |= i40;
                    }
                    if ((i13 & 100663296) != 0) {
                        if ((i14 & 262144) == 0) {
                            i46 = 33554432;
                        } else {
                            i46 = 33554432;
                        }
                        i32 |= i46;
                    }
                    if ((i13 & 805306368) != 0) {
                        if ((i14 & 524288) == 0) {
                            i45 = 268435456;
                        } else {
                            i45 = 268435456;
                        }
                        i32 |= i45;
                    }
                    if ((i50 & 306783379) == 306783378) {
                        z14 = true;
                        z15 = true;
                    } else {
                        z14 = true;
                        z15 = true;
                    }
                    if (c1086gP.C(i50 & 1, z15)) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i16 != 0) {
                                z20 = z14;
                            } else {
                                z20 = z10;
                            }
                            if (i18 != 0) {
                                z21 = false;
                            } else {
                                z21 = z11;
                            }
                            if ((i14 & 32) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                                i50 &= -458753;
                            } else {
                                f12 = f10;
                            }
                            if (i20 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i22 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i26 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                z22 = false;
                            } else {
                                z22 = z12;
                            }
                            if (i30 != 0) {
                                e12 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e12 = e10;
                            }
                            if (i33 != 0) {
                                kVar5 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar5 = kVar;
                            }
                            if ((8192 & i14) != 0) {
                                kVar6 = null;
                                jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                                i32 &= -7169;
                            } else {
                                kVar6 = null;
                                jVar3 = jVar;
                            }
                            if (i35 != 0) {
                                z23 = false;
                            } else {
                                z23 = z13;
                            }
                            if ((i14 & 32768) != 0) {
                                if (z23) {
                                    i43 = 1;
                                } else {
                                    i43 = BrazeLogger.SUPPRESS;
                                }
                                i32 &= -458753;
                            } else {
                                i43 = i10;
                            }
                            if (i37 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i11;
                            }
                            if (i39 == 0) {
                                kVar6 = kVar2;
                            }
                            if ((i14 & 262144) != 0) {
                                TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f11834a;
                                p270w.a aVar3 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar4 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar3, null, null, aVar4, aVar4, 3);
                                i32 &= -234881025;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i14 & 524288) != 0) {
                                TextFieldDefaults textFieldDefaults4 = TextFieldDefaults.f11834a;
                                i32 &= -1879048193;
                                uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            } else {
                                uB = u10;
                            }
                            i41 = i43;
                            z24 = z23;
                            i44 = i32;
                            pVar13 = pVar9;
                        } else {
                            if (i51 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i16 != 0) {
                                z20 = z14;
                            } else {
                                z20 = z10;
                            }
                            if (i18 != 0) {
                                z21 = false;
                            } else {
                                z21 = z11;
                            }
                            if ((i14 & 32) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                                i50 &= -458753;
                            } else {
                                f12 = f10;
                            }
                            if (i20 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i22 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i26 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                z22 = false;
                            } else {
                                z22 = z12;
                            }
                            if (i30 != 0) {
                                e12 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e12 = e10;
                            }
                            if (i33 != 0) {
                                kVar5 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar5 = kVar;
                            }
                            if ((8192 & i14) != 0) {
                                kVar6 = null;
                                jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                                i32 &= -7169;
                            } else {
                                kVar6 = null;
                                jVar3 = jVar;
                            }
                            if (i35 != 0) {
                                z23 = false;
                            } else {
                                z23 = z13;
                            }
                            if ((i14 & 32768) != 0) {
                                if (z23) {
                                    i43 = 1;
                                } else {
                                    i43 = BrazeLogger.SUPPRESS;
                                }
                                i32 &= -458753;
                            } else {
                                i43 = i10;
                            }
                            if (i37 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i11;
                            }
                            if (i39 == 0) {
                                kVar6 = kVar2;
                            }
                            if ((i14 & 262144) != 0) {
                                TextFieldDefaults textFieldDefaults5 = TextFieldDefaults.f11834a;
                                p270w.a aVar5 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar6 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar5, null, null, aVar6, aVar6, 3);
                                i32 &= -234881025;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i14 & 524288) != 0) {
                                TextFieldDefaults textFieldDefaults6 = TextFieldDefaults.f11834a;
                                i32 &= -1879048193;
                                uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            } else {
                                uB = u10;
                            }
                            i41 = i43;
                            z24 = z23;
                            i44 = i32;
                            pVar13 = pVar9;
                        }
                        c1086gP.U();
                        if (kVar6 == null) {
                            c1086gP.L(-1665803660);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            kVar7 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            c1086gP.L(-53736253);
                            c1086gP.T(false);
                            kVar7 = kVar6;
                        }
                        c1086gP.L(-53730507);
                        jB = f12.b();
                        if (jB == 16) {
                            jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                        }
                        androidx.compose.foundation.text.j jVar5 = jVar3;
                        c1086gP.T(false);
                        androidx.compose.ui.text.F fD2 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                        final float f17 = TextFieldDefaults.f11838e;
                        final float f18 = TextFieldDefaults.f11837d;
                        androidx.compose.ui.text.F f19 = f12;
                        final boolean z210 = z20;
                        final boolean z211 = z22;
                        final androidx.compose.foundation.interaction.k kVar10 = kVar7;
                        final U u14 = uB;
                        hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.q
                            public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                                N0 n0I;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                num.intValue();
                                interfaceC1084f3.L(1398930845);
                                boolean z212 = z210;
                                boolean z213 = z211;
                                androidx.compose.foundation.interaction.j jVar6 = kVar10;
                                U u15 = u14;
                                float f110 = f17;
                                float f111 = f18;
                                X xA = androidx.compose.foundation.interaction.f.a(jVar6, interfaceC1084f3, 0);
                                N0<androidx.compose.ui.graphics.H> n0E = u15.e(z212, z213, jVar6, interfaceC1084f3, 0);
                                if (!((Boolean) xA.getValue()).booleanValue()) {
                                    f110 = f111;
                                }
                                if (z212) {
                                    interfaceC1084f3.L(773088894);
                                    n0I = C0902b.a(f110, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                                    interfaceC1084f3.D();
                                } else {
                                    interfaceC1084f3.L(773193116);
                                    n0I = J0.i(new p013b0.f(f111), interfaceC1084f3);
                                    interfaceC1084f3.D();
                                }
                                X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                                androidx.compose.ui.h.a aVar7 = androidx.compose.ui.h.a.f13984b;
                                final C0937i c0937i = (C0937i) xI.getValue();
                                float f112 = TextFieldKt.f11841a;
                                final float f113 = c0937i.f10065a;
                                androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar7, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(J.c cVar) {
                                        J.c cVar2 = cVar;
                                        cVar2.A1();
                                        if (!p013b0.f.a(f113, 0.0f)) {
                                            float density = cVar2.getDensity() * f113;
                                            float fB = I.h.b(cVar2.j()) - (density / 2);
                                            cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                });
                                interfaceC1084f3.D();
                                return hVarC;
                            }
                        });
                        strK = P3.d.k(c1086gP, 3);
                        float f110 = TextFieldImplKt.f11839a;
                        if (z22) {
                            hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    String str2 = strK;
                                    Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                    wVar.e(SemanticsProperties.f15144J, str2);
                                    return p293xa.r.f47939a;
                                }
                            });
                        }
                        final boolean z212 = z20;
                        final boolean z213 = z24;
                        final androidx.compose.ui.text.input.E e14 = e12;
                        final androidx.compose.foundation.interaction.k kVar11 = kVar7;
                        final boolean z214 = z22;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18 = pVar13;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19 = pVar10;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar110 = pVar11;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111 = pVar12;
                        final l0 l0Var4 = l0VarB;
                        final U u15 = uB;
                        int i53 = i44 << 12;
                        BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD2, kVar5, jVar5, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // Ia.q
                            public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar112, InterfaceC1084f interfaceC1084f2, Integer num) {
                                Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar113 = pVar112;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= interfaceC1084f3.k(pVar113) ? 4 : 2;
                                }
                                int i54 = iIntValue;
                                if (interfaceC1084f3.C(i54 & 1, (i54 & 19) != 18)) {
                                    TextFieldDefaults.f11834a.a(str, pVar113, z212, z213, e14, kVar11, z214, pVar18, pVar19, pVar110, pVar111, l0Var4, u15, null, interfaceC1084f3, (i54 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i53) | (29360128 & i53) | (234881024 & i53) | (i53 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                        jVar2 = jVar5;
                        pVar8 = pVar12;
                        e11 = e12;
                        z19 = z24;
                        hVar2 = hVar3;
                        u11 = uB;
                        z17 = z21;
                        kVar4 = kVar6;
                        l0Var2 = l0VarB;
                        z18 = z22;
                        kVar3 = kVar5;
                        pVar7 = pVar11;
                        f11 = f19;
                        z16 = z20;
                        pVar6 = pVar10;
                        pVar5 = pVar13;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        z16 = z10;
                        z17 = z11;
                        f11 = f10;
                        pVar5 = pVar;
                        pVar6 = pVar2;
                        pVar7 = pVar3;
                        pVar8 = pVar4;
                        z18 = z12;
                        e11 = e10;
                        kVar3 = kVar;
                        jVar2 = jVar;
                        z19 = z13;
                        i41 = i10;
                        i42 = i11;
                        kVar4 = kVar2;
                        l0Var2 = l0Var;
                        u11 = u10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i50 |= 24576;
                if ((i12 & 196608) != 0) {
                    if ((i14 & 32) == 0) {
                        i49 = 65536;
                    } else {
                        i49 = 65536;
                    }
                    i50 |= i49;
                }
                i20 = i14 & 64;
                if (i20 != 0) {
                    i50 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i50 |= i21;
                }
                i22 = i14 & 128;
                if (i22 != 0) {
                    i50 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i50 |= i23;
                }
                i24 = i14 & 256;
                if (i24 != 0) {
                    i50 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i50 |= i25;
                }
                i26 = i14 & 512;
                if (i26 != 0) {
                    i50 |= 805306368;
                } else if ((i12 & 805306368) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i50 |= i27;
                }
                i28 = i14 & 1024;
                if (i28 != 0) {
                    i29 = i13 | 6;
                } else if ((i13 & 6) == 0) {
                    i29 = i13 | (c1086gP.c(z12) ? 4 : 2);
                } else {
                    i29 = i13;
                }
                i30 = i14 & 2048;
                if (i30 != 0) {
                    i29 |= 48;
                } else if ((i13 & 48) == 0) {
                    if (c1086gP.K(e10)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i29 |= i31;
                }
                i32 = i29;
                i33 = i14 & 4096;
                if (i33 != 0) {
                    i32 |= 384;
                } else if ((i13 & 384) != 0) {
                    if (c1086gP.K(kVar)) {
                        i34 = 256;
                    } else {
                        i34 = 128;
                    }
                    i32 |= i34;
                }
                if ((i13 & 3072) != 0) {
                    if ((i14 & 8192) == 0) {
                        i48 = 1024;
                    } else {
                        i48 = 1024;
                    }
                    i32 |= i48;
                }
                i35 = i14 & 16384;
                if (i35 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c1086gP.c(z13)) {
                            i36 = 16384;
                        } else {
                            i36 = 8192;
                        }
                        i32 |= i36;
                    }
                    if ((i13 & 196608) != 0) {
                        if ((i14 & 32768) == 0) {
                            i47 = 65536;
                        } else {
                            i47 = 65536;
                        }
                        i32 |= i47;
                    }
                    i37 = i14 & 65536;
                    if (i37 != 0) {
                        i32 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c1086gP.h(i11)) {
                            i38 = 1048576;
                        } else {
                            i38 = 524288;
                        }
                        i32 |= i38;
                    }
                    i39 = i14 & 131072;
                    if (i39 != 0) {
                        i32 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c1086gP.K(kVar2)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i32 |= i40;
                    }
                    if ((i13 & 100663296) != 0) {
                        if ((i14 & 262144) == 0) {
                            i46 = 33554432;
                        } else {
                            i46 = 33554432;
                        }
                        i32 |= i46;
                    }
                    if ((i13 & 805306368) != 0) {
                        if ((i14 & 524288) == 0) {
                            i45 = 268435456;
                        } else {
                            i45 = 268435456;
                        }
                        i32 |= i45;
                    }
                    if ((i50 & 306783379) == 306783378) {
                        z14 = true;
                        z15 = true;
                    } else {
                        z14 = true;
                        z15 = true;
                    }
                    if (c1086gP.C(i50 & 1, z15)) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i16 != 0) {
                                z20 = z14;
                            } else {
                                z20 = z10;
                            }
                            if (i18 != 0) {
                                z21 = false;
                            } else {
                                z21 = z11;
                            }
                            if ((i14 & 32) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                                i50 &= -458753;
                            } else {
                                f12 = f10;
                            }
                            if (i20 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i22 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i26 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                z22 = false;
                            } else {
                                z22 = z12;
                            }
                            if (i30 != 0) {
                                e12 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e12 = e10;
                            }
                            if (i33 != 0) {
                                kVar5 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar5 = kVar;
                            }
                            if ((8192 & i14) != 0) {
                                kVar6 = null;
                                jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                                i32 &= -7169;
                            } else {
                                kVar6 = null;
                                jVar3 = jVar;
                            }
                            if (i35 != 0) {
                                z23 = false;
                            } else {
                                z23 = z13;
                            }
                            if ((i14 & 32768) != 0) {
                                if (z23) {
                                    i43 = 1;
                                } else {
                                    i43 = BrazeLogger.SUPPRESS;
                                }
                                i32 &= -458753;
                            } else {
                                i43 = i10;
                            }
                            if (i37 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i11;
                            }
                            if (i39 == 0) {
                                kVar6 = kVar2;
                            }
                            if ((i14 & 262144) != 0) {
                                TextFieldDefaults textFieldDefaults7 = TextFieldDefaults.f11834a;
                                p270w.a aVar7 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar8 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar7, null, null, aVar8, aVar8, 3);
                                i32 &= -234881025;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i14 & 524288) != 0) {
                                TextFieldDefaults textFieldDefaults8 = TextFieldDefaults.f11834a;
                                i32 &= -1879048193;
                                uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            } else {
                                uB = u10;
                            }
                            i41 = i43;
                            z24 = z23;
                            i44 = i32;
                            pVar13 = pVar9;
                        } else {
                            if (i51 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i16 != 0) {
                                z20 = z14;
                            } else {
                                z20 = z10;
                            }
                            if (i18 != 0) {
                                z21 = false;
                            } else {
                                z21 = z11;
                            }
                            if ((i14 & 32) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                                i50 &= -458753;
                            } else {
                                f12 = f10;
                            }
                            if (i20 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i22 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i26 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                z22 = false;
                            } else {
                                z22 = z12;
                            }
                            if (i30 != 0) {
                                e12 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e12 = e10;
                            }
                            if (i33 != 0) {
                                kVar5 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar5 = kVar;
                            }
                            if ((8192 & i14) != 0) {
                                kVar6 = null;
                                jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                                i32 &= -7169;
                            } else {
                                kVar6 = null;
                                jVar3 = jVar;
                            }
                            if (i35 != 0) {
                                z23 = false;
                            } else {
                                z23 = z13;
                            }
                            if ((i14 & 32768) != 0) {
                                if (z23) {
                                    i43 = 1;
                                } else {
                                    i43 = BrazeLogger.SUPPRESS;
                                }
                                i32 &= -458753;
                            } else {
                                i43 = i10;
                            }
                            if (i37 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i11;
                            }
                            if (i39 == 0) {
                                kVar6 = kVar2;
                            }
                            if ((i14 & 262144) != 0) {
                                TextFieldDefaults textFieldDefaults9 = TextFieldDefaults.f11834a;
                                p270w.a aVar9 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar10 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar9, null, null, aVar10, aVar10, 3);
                                i32 &= -234881025;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i14 & 524288) != 0) {
                                TextFieldDefaults textFieldDefaults10 = TextFieldDefaults.f11834a;
                                i32 &= -1879048193;
                                uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            } else {
                                uB = u10;
                            }
                            i41 = i43;
                            z24 = z23;
                            i44 = i32;
                            pVar13 = pVar9;
                        }
                        c1086gP.U();
                        if (kVar6 == null) {
                            c1086gP.L(-1665803660);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            kVar7 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            c1086gP.L(-53736253);
                            c1086gP.T(false);
                            kVar7 = kVar6;
                        }
                        c1086gP.L(-53730507);
                        jB = f12.b();
                        if (jB == 16) {
                            jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                        }
                        androidx.compose.foundation.text.j jVar6 = jVar3;
                        c1086gP.T(false);
                        androidx.compose.ui.text.F fD3 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                        final float f111 = TextFieldDefaults.f11838e;
                        final float f112 = TextFieldDefaults.f11837d;
                        androidx.compose.ui.text.F f113 = f12;
                        final boolean z215 = z20;
                        final boolean z216 = z22;
                        final androidx.compose.foundation.interaction.k kVar12 = kVar7;
                        final U u16 = uB;
                        hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.q
                            public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                                N0 n0I;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                num.intValue();
                                interfaceC1084f3.L(1398930845);
                                boolean z217 = z215;
                                boolean z218 = z216;
                                androidx.compose.foundation.interaction.j jVar7 = kVar12;
                                U u17 = u16;
                                float f114 = f111;
                                float f115 = f112;
                                X xA = androidx.compose.foundation.interaction.f.a(jVar7, interfaceC1084f3, 0);
                                N0<androidx.compose.ui.graphics.H> n0E = u17.e(z217, z218, jVar7, interfaceC1084f3, 0);
                                if (!((Boolean) xA.getValue()).booleanValue()) {
                                    f114 = f115;
                                }
                                if (z217) {
                                    interfaceC1084f3.L(773088894);
                                    n0I = C0902b.a(f114, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                                    interfaceC1084f3.D();
                                } else {
                                    interfaceC1084f3.L(773193116);
                                    n0I = J0.i(new p013b0.f(f115), interfaceC1084f3);
                                    interfaceC1084f3.D();
                                }
                                X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                                androidx.compose.ui.h.a aVar11 = androidx.compose.ui.h.a.f13984b;
                                final C0937i c0937i = (C0937i) xI.getValue();
                                float f116 = TextFieldKt.f11841a;
                                final float f117 = c0937i.f10065a;
                                androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar11, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(J.c cVar) {
                                        J.c cVar2 = cVar;
                                        cVar2.A1();
                                        if (!p013b0.f.a(f117, 0.0f)) {
                                            float density = cVar2.getDensity() * f117;
                                            float fB = I.h.b(cVar2.j()) - (density / 2);
                                            cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                });
                                interfaceC1084f3.D();
                                return hVarC;
                            }
                        });
                        strK = P3.d.k(c1086gP, 3);
                        float f114 = TextFieldImplKt.f11839a;
                        if (z22) {
                            hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    String str2 = strK;
                                    Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                    wVar.e(SemanticsProperties.f15144J, str2);
                                    return p293xa.r.f47939a;
                                }
                            });
                        }
                        final boolean z217 = z20;
                        final boolean z218 = z24;
                        final androidx.compose.ui.text.input.E e15 = e12;
                        final androidx.compose.foundation.interaction.k kVar13 = kVar7;
                        final boolean z219 = z22;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar112 = pVar13;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar113 = pVar10;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar114 = pVar11;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar115 = pVar12;
                        final l0 l0Var5 = l0VarB;
                        final U u17 = uB;
                        int i54 = i44 << 12;
                        BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD3, kVar5, jVar6, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // Ia.q
                            public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar116, InterfaceC1084f interfaceC1084f2, Integer num) {
                                Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar117 = pVar116;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= interfaceC1084f3.k(pVar117) ? 4 : 2;
                                }
                                int i55 = iIntValue;
                                if (interfaceC1084f3.C(i55 & 1, (i55 & 19) != 18)) {
                                    TextFieldDefaults.f11834a.a(str, pVar117, z217, z218, e15, kVar13, z219, pVar112, pVar113, pVar114, pVar115, l0Var5, u17, null, interfaceC1084f3, (i55 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i54) | (29360128 & i54) | (234881024 & i54) | (i54 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                        jVar2 = jVar6;
                        pVar8 = pVar12;
                        e11 = e12;
                        z19 = z24;
                        hVar2 = hVar3;
                        u11 = uB;
                        z17 = z21;
                        kVar4 = kVar6;
                        l0Var2 = l0VarB;
                        z18 = z22;
                        kVar3 = kVar5;
                        pVar7 = pVar11;
                        f11 = f113;
                        z16 = z20;
                        pVar6 = pVar10;
                        pVar5 = pVar13;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        z16 = z10;
                        z17 = z11;
                        f11 = f10;
                        pVar5 = pVar;
                        pVar6 = pVar2;
                        pVar7 = pVar3;
                        pVar8 = pVar4;
                        z18 = z12;
                        e11 = e10;
                        kVar3 = kVar;
                        jVar2 = jVar;
                        z19 = z13;
                        i41 = i10;
                        i42 = i11;
                        kVar4 = kVar2;
                        l0Var2 = l0Var;
                        u11 = u10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i32 |= 24576;
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i47 = 65536;
                    } else {
                        i47 = 65536;
                    }
                    i32 |= i47;
                }
                i37 = i14 & 65536;
                if (i37 != 0) {
                    i32 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c1086gP.h(i11)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i32 |= i38;
                }
                i39 = i14 & 131072;
                if (i39 != 0) {
                    i32 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c1086gP.K(kVar2)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i32 |= i40;
                }
                if ((i13 & 100663296) != 0) {
                    if ((i14 & 262144) == 0) {
                        i46 = 33554432;
                    } else {
                        i46 = 33554432;
                    }
                    i32 |= i46;
                }
                if ((i13 & 805306368) != 0) {
                    if ((i14 & 524288) == 0) {
                        i45 = 268435456;
                    } else {
                        i45 = 268435456;
                    }
                    i32 |= i45;
                }
                if ((i50 & 306783379) == 306783378) {
                    z14 = true;
                    z15 = true;
                } else {
                    z14 = true;
                    z15 = true;
                }
                if (c1086gP.C(i50 & 1, z15)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i16 != 0) {
                            z20 = z14;
                        } else {
                            z20 = z10;
                        }
                        if (i18 != 0) {
                            z21 = false;
                        } else {
                            z21 = z11;
                        }
                        if ((i14 & 32) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                            i50 &= -458753;
                        } else {
                            f12 = f10;
                        }
                        if (i20 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i22 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i26 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            z22 = false;
                        } else {
                            z22 = z12;
                        }
                        if (i30 != 0) {
                            e12 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e12 = e10;
                        }
                        if (i33 != 0) {
                            kVar5 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar5 = kVar;
                        }
                        if ((8192 & i14) != 0) {
                            kVar6 = null;
                            jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                            i32 &= -7169;
                        } else {
                            kVar6 = null;
                            jVar3 = jVar;
                        }
                        if (i35 != 0) {
                            z23 = false;
                        } else {
                            z23 = z13;
                        }
                        if ((i14 & 32768) != 0) {
                            if (z23) {
                                i43 = 1;
                            } else {
                                i43 = BrazeLogger.SUPPRESS;
                            }
                            i32 &= -458753;
                        } else {
                            i43 = i10;
                        }
                        if (i37 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i11;
                        }
                        if (i39 == 0) {
                            kVar6 = kVar2;
                        }
                        if ((i14 & 262144) != 0) {
                            TextFieldDefaults textFieldDefaults11 = TextFieldDefaults.f11834a;
                            p270w.a aVar11 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar12 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar11, null, null, aVar12, aVar12, 3);
                            i32 &= -234881025;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i14 & 524288) != 0) {
                            TextFieldDefaults textFieldDefaults12 = TextFieldDefaults.f11834a;
                            i32 &= -1879048193;
                            uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        } else {
                            uB = u10;
                        }
                        i41 = i43;
                        z24 = z23;
                        i44 = i32;
                        pVar13 = pVar9;
                    } else {
                        if (i51 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i16 != 0) {
                            z20 = z14;
                        } else {
                            z20 = z10;
                        }
                        if (i18 != 0) {
                            z21 = false;
                        } else {
                            z21 = z11;
                        }
                        if ((i14 & 32) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                            i50 &= -458753;
                        } else {
                            f12 = f10;
                        }
                        if (i20 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i22 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i26 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            z22 = false;
                        } else {
                            z22 = z12;
                        }
                        if (i30 != 0) {
                            e12 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e12 = e10;
                        }
                        if (i33 != 0) {
                            kVar5 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar5 = kVar;
                        }
                        if ((8192 & i14) != 0) {
                            kVar6 = null;
                            jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                            i32 &= -7169;
                        } else {
                            kVar6 = null;
                            jVar3 = jVar;
                        }
                        if (i35 != 0) {
                            z23 = false;
                        } else {
                            z23 = z13;
                        }
                        if ((i14 & 32768) != 0) {
                            if (z23) {
                                i43 = 1;
                            } else {
                                i43 = BrazeLogger.SUPPRESS;
                            }
                            i32 &= -458753;
                        } else {
                            i43 = i10;
                        }
                        if (i37 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i11;
                        }
                        if (i39 == 0) {
                            kVar6 = kVar2;
                        }
                        if ((i14 & 262144) != 0) {
                            TextFieldDefaults textFieldDefaults13 = TextFieldDefaults.f11834a;
                            p270w.a aVar13 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar14 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar13, null, null, aVar14, aVar14, 3);
                            i32 &= -234881025;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i14 & 524288) != 0) {
                            TextFieldDefaults textFieldDefaults14 = TextFieldDefaults.f11834a;
                            i32 &= -1879048193;
                            uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        } else {
                            uB = u10;
                        }
                        i41 = i43;
                        z24 = z23;
                        i44 = i32;
                        pVar13 = pVar9;
                    }
                    c1086gP.U();
                    if (kVar6 == null) {
                        c1086gP.L(-1665803660);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        kVar7 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        c1086gP.L(-53736253);
                        c1086gP.T(false);
                        kVar7 = kVar6;
                    }
                    c1086gP.L(-53730507);
                    jB = f12.b();
                    if (jB == 16) {
                        jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                    }
                    androidx.compose.foundation.text.j jVar7 = jVar3;
                    c1086gP.T(false);
                    androidx.compose.ui.text.F fD4 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final float f115 = TextFieldDefaults.f11838e;
                    final float f116 = TextFieldDefaults.f11837d;
                    androidx.compose.ui.text.F f117 = f12;
                    final boolean z2110 = z20;
                    final boolean z2111 = z22;
                    final androidx.compose.foundation.interaction.k kVar14 = kVar7;
                    final U u18 = uB;
                    hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.q
                        public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                            N0 n0I;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            num.intValue();
                            interfaceC1084f3.L(1398930845);
                            boolean z2112 = z2110;
                            boolean z2113 = z2111;
                            androidx.compose.foundation.interaction.j jVar8 = kVar14;
                            U u19 = u18;
                            float f118 = f115;
                            float f119 = f116;
                            X xA = androidx.compose.foundation.interaction.f.a(jVar8, interfaceC1084f3, 0);
                            N0<androidx.compose.ui.graphics.H> n0E = u19.e(z2112, z2113, jVar8, interfaceC1084f3, 0);
                            if (!((Boolean) xA.getValue()).booleanValue()) {
                                f118 = f119;
                            }
                            if (z2112) {
                                interfaceC1084f3.L(773088894);
                                n0I = C0902b.a(f118, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                                interfaceC1084f3.D();
                            } else {
                                interfaceC1084f3.L(773193116);
                                n0I = J0.i(new p013b0.f(f119), interfaceC1084f3);
                                interfaceC1084f3.D();
                            }
                            X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                            androidx.compose.ui.h.a aVar15 = androidx.compose.ui.h.a.f13984b;
                            final C0937i c0937i = (C0937i) xI.getValue();
                            float f1110 = TextFieldKt.f11841a;
                            final float f1111 = c0937i.f10065a;
                            androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar15, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.c cVar) {
                                    J.c cVar2 = cVar;
                                    cVar2.A1();
                                    if (!p013b0.f.a(f1111, 0.0f)) {
                                        float density = cVar2.getDensity() * f1111;
                                        float fB = I.h.b(cVar2.j()) - (density / 2);
                                        cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            });
                            interfaceC1084f3.D();
                            return hVarC;
                        }
                    });
                    strK = P3.d.k(c1086gP, 3);
                    float f118 = TextFieldImplKt.f11839a;
                    if (z22) {
                        hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                String str2 = strK;
                                Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                wVar.e(SemanticsProperties.f15144J, str2);
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                    final boolean z2112 = z20;
                    final boolean z2113 = z24;
                    final androidx.compose.ui.text.input.E e16 = e12;
                    final androidx.compose.foundation.interaction.k kVar15 = kVar7;
                    final boolean z2114 = z22;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar116 = pVar13;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar117 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar118 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar119 = pVar12;
                    final l0 l0Var6 = l0VarB;
                    final U u19 = uB;
                    int i55 = i44 << 12;
                    BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD4, kVar5, jVar7, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // Ia.q
                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1110, InterfaceC1084f interfaceC1084f2, Integer num) {
                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1111 = pVar1110;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= interfaceC1084f3.k(pVar1111) ? 4 : 2;
                            }
                            int i56 = iIntValue;
                            if (interfaceC1084f3.C(i56 & 1, (i56 & 19) != 18)) {
                                TextFieldDefaults.f11834a.a(str, pVar1111, z2112, z2113, e16, kVar15, z2114, pVar116, pVar117, pVar118, pVar119, l0Var6, u19, null, interfaceC1084f3, (i56 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i55) | (29360128 & i55) | (234881024 & i55) | (i55 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                    jVar2 = jVar7;
                    pVar8 = pVar12;
                    e11 = e12;
                    z19 = z24;
                    hVar2 = hVar3;
                    u11 = uB;
                    z17 = z21;
                    kVar4 = kVar6;
                    l0Var2 = l0VarB;
                    z18 = z22;
                    kVar3 = kVar5;
                    pVar7 = pVar11;
                    f11 = f117;
                    z16 = z20;
                    pVar6 = pVar10;
                    pVar5 = pVar13;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    z16 = z10;
                    z17 = z11;
                    f11 = f10;
                    pVar5 = pVar;
                    pVar6 = pVar2;
                    pVar7 = pVar3;
                    pVar8 = pVar4;
                    z18 = z12;
                    e11 = e10;
                    kVar3 = kVar;
                    jVar2 = jVar;
                    z19 = z13;
                    i41 = i10;
                    i42 = i11;
                    kVar4 = kVar2;
                    l0Var2 = l0Var;
                    u11 = u10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i50 |= 3072;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i12 & 24576) == 0) {
                    if (c1086gP.c(z11)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i50 |= i19;
                }
                if ((i12 & 196608) != 0) {
                    if ((i14 & 32) == 0) {
                        i49 = 65536;
                    } else {
                        i49 = 65536;
                    }
                    i50 |= i49;
                }
                i20 = i14 & 64;
                if (i20 != 0) {
                    i50 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i50 |= i21;
                }
                i22 = i14 & 128;
                if (i22 != 0) {
                    i50 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i50 |= i23;
                }
                i24 = i14 & 256;
                if (i24 != 0) {
                    i50 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i50 |= i25;
                }
                i26 = i14 & 512;
                if (i26 != 0) {
                    i50 |= 805306368;
                } else if ((i12 & 805306368) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i50 |= i27;
                }
                i28 = i14 & 1024;
                if (i28 != 0) {
                    i29 = i13 | 6;
                } else if ((i13 & 6) == 0) {
                    i29 = i13 | (c1086gP.c(z12) ? 4 : 2);
                } else {
                    i29 = i13;
                }
                i30 = i14 & 2048;
                if (i30 != 0) {
                    i29 |= 48;
                } else if ((i13 & 48) == 0) {
                    if (c1086gP.K(e10)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i29 |= i31;
                }
                i32 = i29;
                i33 = i14 & 4096;
                if (i33 != 0) {
                    i32 |= 384;
                } else if ((i13 & 384) != 0) {
                    if (c1086gP.K(kVar)) {
                        i34 = 256;
                    } else {
                        i34 = 128;
                    }
                    i32 |= i34;
                }
                if ((i13 & 3072) != 0) {
                    if ((i14 & 8192) == 0) {
                        i48 = 1024;
                    } else {
                        i48 = 1024;
                    }
                    i32 |= i48;
                }
                i35 = i14 & 16384;
                if (i35 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c1086gP.c(z13)) {
                            i36 = 16384;
                        } else {
                            i36 = 8192;
                        }
                        i32 |= i36;
                    }
                    if ((i13 & 196608) != 0) {
                        if ((i14 & 32768) == 0) {
                            i47 = 65536;
                        } else {
                            i47 = 65536;
                        }
                        i32 |= i47;
                    }
                    i37 = i14 & 65536;
                    if (i37 != 0) {
                        i32 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c1086gP.h(i11)) {
                            i38 = 1048576;
                        } else {
                            i38 = 524288;
                        }
                        i32 |= i38;
                    }
                    i39 = i14 & 131072;
                    if (i39 != 0) {
                        i32 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c1086gP.K(kVar2)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i32 |= i40;
                    }
                    if ((i13 & 100663296) != 0) {
                        if ((i14 & 262144) == 0) {
                            i46 = 33554432;
                        } else {
                            i46 = 33554432;
                        }
                        i32 |= i46;
                    }
                    if ((i13 & 805306368) != 0) {
                        if ((i14 & 524288) == 0) {
                            i45 = 268435456;
                        } else {
                            i45 = 268435456;
                        }
                        i32 |= i45;
                    }
                    if ((i50 & 306783379) == 306783378) {
                        z14 = true;
                        z15 = true;
                    } else {
                        z14 = true;
                        z15 = true;
                    }
                    if (c1086gP.C(i50 & 1, z15)) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i16 != 0) {
                                z20 = z14;
                            } else {
                                z20 = z10;
                            }
                            if (i18 != 0) {
                                z21 = false;
                            } else {
                                z21 = z11;
                            }
                            if ((i14 & 32) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                                i50 &= -458753;
                            } else {
                                f12 = f10;
                            }
                            if (i20 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i22 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i26 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                z22 = false;
                            } else {
                                z22 = z12;
                            }
                            if (i30 != 0) {
                                e12 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e12 = e10;
                            }
                            if (i33 != 0) {
                                kVar5 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar5 = kVar;
                            }
                            if ((8192 & i14) != 0) {
                                kVar6 = null;
                                jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                                i32 &= -7169;
                            } else {
                                kVar6 = null;
                                jVar3 = jVar;
                            }
                            if (i35 != 0) {
                                z23 = false;
                            } else {
                                z23 = z13;
                            }
                            if ((i14 & 32768) != 0) {
                                if (z23) {
                                    i43 = 1;
                                } else {
                                    i43 = BrazeLogger.SUPPRESS;
                                }
                                i32 &= -458753;
                            } else {
                                i43 = i10;
                            }
                            if (i37 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i11;
                            }
                            if (i39 == 0) {
                                kVar6 = kVar2;
                            }
                            if ((i14 & 262144) != 0) {
                                TextFieldDefaults textFieldDefaults15 = TextFieldDefaults.f11834a;
                                p270w.a aVar15 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar16 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar15, null, null, aVar16, aVar16, 3);
                                i32 &= -234881025;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i14 & 524288) != 0) {
                                TextFieldDefaults textFieldDefaults16 = TextFieldDefaults.f11834a;
                                i32 &= -1879048193;
                                uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            } else {
                                uB = u10;
                            }
                            i41 = i43;
                            z24 = z23;
                            i44 = i32;
                            pVar13 = pVar9;
                        } else {
                            if (i51 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i16 != 0) {
                                z20 = z14;
                            } else {
                                z20 = z10;
                            }
                            if (i18 != 0) {
                                z21 = false;
                            } else {
                                z21 = z11;
                            }
                            if ((i14 & 32) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                                i50 &= -458753;
                            } else {
                                f12 = f10;
                            }
                            if (i20 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i22 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i26 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                z22 = false;
                            } else {
                                z22 = z12;
                            }
                            if (i30 != 0) {
                                e12 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e12 = e10;
                            }
                            if (i33 != 0) {
                                kVar5 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar5 = kVar;
                            }
                            if ((8192 & i14) != 0) {
                                kVar6 = null;
                                jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                                i32 &= -7169;
                            } else {
                                kVar6 = null;
                                jVar3 = jVar;
                            }
                            if (i35 != 0) {
                                z23 = false;
                            } else {
                                z23 = z13;
                            }
                            if ((i14 & 32768) != 0) {
                                if (z23) {
                                    i43 = 1;
                                } else {
                                    i43 = BrazeLogger.SUPPRESS;
                                }
                                i32 &= -458753;
                            } else {
                                i43 = i10;
                            }
                            if (i37 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i11;
                            }
                            if (i39 == 0) {
                                kVar6 = kVar2;
                            }
                            if ((i14 & 262144) != 0) {
                                TextFieldDefaults textFieldDefaults17 = TextFieldDefaults.f11834a;
                                p270w.a aVar17 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar18 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar17, null, null, aVar18, aVar18, 3);
                                i32 &= -234881025;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i14 & 524288) != 0) {
                                TextFieldDefaults textFieldDefaults18 = TextFieldDefaults.f11834a;
                                i32 &= -1879048193;
                                uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            } else {
                                uB = u10;
                            }
                            i41 = i43;
                            z24 = z23;
                            i44 = i32;
                            pVar13 = pVar9;
                        }
                        c1086gP.U();
                        if (kVar6 == null) {
                            c1086gP.L(-1665803660);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            kVar7 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            c1086gP.L(-53736253);
                            c1086gP.T(false);
                            kVar7 = kVar6;
                        }
                        c1086gP.L(-53730507);
                        jB = f12.b();
                        if (jB == 16) {
                            jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                        }
                        androidx.compose.foundation.text.j jVar8 = jVar3;
                        c1086gP.T(false);
                        androidx.compose.ui.text.F fD5 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                        final float f119 = TextFieldDefaults.f11838e;
                        final float f1110 = TextFieldDefaults.f11837d;
                        androidx.compose.ui.text.F f1111 = f12;
                        final boolean z2115 = z20;
                        final boolean z2116 = z22;
                        final androidx.compose.foundation.interaction.k kVar16 = kVar7;
                        final U u110 = uB;
                        hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.q
                            public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                                N0 n0I;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                num.intValue();
                                interfaceC1084f3.L(1398930845);
                                boolean z2117 = z2115;
                                boolean z2118 = z2116;
                                androidx.compose.foundation.interaction.j jVar9 = kVar16;
                                U u111 = u110;
                                float f1112 = f119;
                                float f1113 = f1110;
                                X xA = androidx.compose.foundation.interaction.f.a(jVar9, interfaceC1084f3, 0);
                                N0<androidx.compose.ui.graphics.H> n0E = u111.e(z2117, z2118, jVar9, interfaceC1084f3, 0);
                                if (!((Boolean) xA.getValue()).booleanValue()) {
                                    f1112 = f1113;
                                }
                                if (z2117) {
                                    interfaceC1084f3.L(773088894);
                                    n0I = C0902b.a(f1112, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                                    interfaceC1084f3.D();
                                } else {
                                    interfaceC1084f3.L(773193116);
                                    n0I = J0.i(new p013b0.f(f1113), interfaceC1084f3);
                                    interfaceC1084f3.D();
                                }
                                X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                                androidx.compose.ui.h.a aVar19 = androidx.compose.ui.h.a.f13984b;
                                final C0937i c0937i = (C0937i) xI.getValue();
                                float f1114 = TextFieldKt.f11841a;
                                final float f1115 = c0937i.f10065a;
                                androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar19, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(J.c cVar) {
                                        J.c cVar2 = cVar;
                                        cVar2.A1();
                                        if (!p013b0.f.a(f1115, 0.0f)) {
                                            float density = cVar2.getDensity() * f1115;
                                            float fB = I.h.b(cVar2.j()) - (density / 2);
                                            cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                });
                                interfaceC1084f3.D();
                                return hVarC;
                            }
                        });
                        strK = P3.d.k(c1086gP, 3);
                        float f1112 = TextFieldImplKt.f11839a;
                        if (z22) {
                            hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    String str2 = strK;
                                    Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                    wVar.e(SemanticsProperties.f15144J, str2);
                                    return p293xa.r.f47939a;
                                }
                            });
                        }
                        final boolean z2117 = z20;
                        final boolean z2118 = z24;
                        final androidx.compose.ui.text.input.E e17 = e12;
                        final androidx.compose.foundation.interaction.k kVar17 = kVar7;
                        final boolean z2119 = z22;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1110 = pVar13;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111 = pVar10;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1112 = pVar11;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1113 = pVar12;
                        final l0 l0Var7 = l0VarB;
                        final U u111 = uB;
                        int i56 = i44 << 12;
                        BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD5, kVar5, jVar8, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // Ia.q
                            public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1114, InterfaceC1084f interfaceC1084f2, Integer num) {
                                Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1115 = pVar1114;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= interfaceC1084f3.k(pVar1115) ? 4 : 2;
                                }
                                int i57 = iIntValue;
                                if (interfaceC1084f3.C(i57 & 1, (i57 & 19) != 18)) {
                                    TextFieldDefaults.f11834a.a(str, pVar1115, z2117, z2118, e17, kVar17, z2119, pVar1110, pVar1111, pVar1112, pVar1113, l0Var7, u111, null, interfaceC1084f3, (i57 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i56) | (29360128 & i56) | (234881024 & i56) | (i56 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                        jVar2 = jVar8;
                        pVar8 = pVar12;
                        e11 = e12;
                        z19 = z24;
                        hVar2 = hVar3;
                        u11 = uB;
                        z17 = z21;
                        kVar4 = kVar6;
                        l0Var2 = l0VarB;
                        z18 = z22;
                        kVar3 = kVar5;
                        pVar7 = pVar11;
                        f11 = f1111;
                        z16 = z20;
                        pVar6 = pVar10;
                        pVar5 = pVar13;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        z16 = z10;
                        z17 = z11;
                        f11 = f10;
                        pVar5 = pVar;
                        pVar6 = pVar2;
                        pVar7 = pVar3;
                        pVar8 = pVar4;
                        z18 = z12;
                        e11 = e10;
                        kVar3 = kVar;
                        jVar2 = jVar;
                        z19 = z13;
                        i41 = i10;
                        i42 = i11;
                        kVar4 = kVar2;
                        l0Var2 = l0Var;
                        u11 = u10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i32 |= 24576;
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i47 = 65536;
                    } else {
                        i47 = 65536;
                    }
                    i32 |= i47;
                }
                i37 = i14 & 65536;
                if (i37 != 0) {
                    i32 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c1086gP.h(i11)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i32 |= i38;
                }
                i39 = i14 & 131072;
                if (i39 != 0) {
                    i32 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c1086gP.K(kVar2)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i32 |= i40;
                }
                if ((i13 & 100663296) != 0) {
                    if ((i14 & 262144) == 0) {
                        i46 = 33554432;
                    } else {
                        i46 = 33554432;
                    }
                    i32 |= i46;
                }
                if ((i13 & 805306368) != 0) {
                    if ((i14 & 524288) == 0) {
                        i45 = 268435456;
                    } else {
                        i45 = 268435456;
                    }
                    i32 |= i45;
                }
                if ((i50 & 306783379) == 306783378) {
                    z14 = true;
                    z15 = true;
                } else {
                    z14 = true;
                    z15 = true;
                }
                if (c1086gP.C(i50 & 1, z15)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i16 != 0) {
                            z20 = z14;
                        } else {
                            z20 = z10;
                        }
                        if (i18 != 0) {
                            z21 = false;
                        } else {
                            z21 = z11;
                        }
                        if ((i14 & 32) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                            i50 &= -458753;
                        } else {
                            f12 = f10;
                        }
                        if (i20 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i22 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i26 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            z22 = false;
                        } else {
                            z22 = z12;
                        }
                        if (i30 != 0) {
                            e12 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e12 = e10;
                        }
                        if (i33 != 0) {
                            kVar5 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar5 = kVar;
                        }
                        if ((8192 & i14) != 0) {
                            kVar6 = null;
                            jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                            i32 &= -7169;
                        } else {
                            kVar6 = null;
                            jVar3 = jVar;
                        }
                        if (i35 != 0) {
                            z23 = false;
                        } else {
                            z23 = z13;
                        }
                        if ((i14 & 32768) != 0) {
                            if (z23) {
                                i43 = 1;
                            } else {
                                i43 = BrazeLogger.SUPPRESS;
                            }
                            i32 &= -458753;
                        } else {
                            i43 = i10;
                        }
                        if (i37 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i11;
                        }
                        if (i39 == 0) {
                            kVar6 = kVar2;
                        }
                        if ((i14 & 262144) != 0) {
                            TextFieldDefaults textFieldDefaults19 = TextFieldDefaults.f11834a;
                            p270w.a aVar19 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar110 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar19, null, null, aVar110, aVar110, 3);
                            i32 &= -234881025;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i14 & 524288) != 0) {
                            TextFieldDefaults textFieldDefaults110 = TextFieldDefaults.f11834a;
                            i32 &= -1879048193;
                            uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        } else {
                            uB = u10;
                        }
                        i41 = i43;
                        z24 = z23;
                        i44 = i32;
                        pVar13 = pVar9;
                    } else {
                        if (i51 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i16 != 0) {
                            z20 = z14;
                        } else {
                            z20 = z10;
                        }
                        if (i18 != 0) {
                            z21 = false;
                        } else {
                            z21 = z11;
                        }
                        if ((i14 & 32) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                            i50 &= -458753;
                        } else {
                            f12 = f10;
                        }
                        if (i20 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i22 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i26 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            z22 = false;
                        } else {
                            z22 = z12;
                        }
                        if (i30 != 0) {
                            e12 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e12 = e10;
                        }
                        if (i33 != 0) {
                            kVar5 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar5 = kVar;
                        }
                        if ((8192 & i14) != 0) {
                            kVar6 = null;
                            jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                            i32 &= -7169;
                        } else {
                            kVar6 = null;
                            jVar3 = jVar;
                        }
                        if (i35 != 0) {
                            z23 = false;
                        } else {
                            z23 = z13;
                        }
                        if ((i14 & 32768) != 0) {
                            if (z23) {
                                i43 = 1;
                            } else {
                                i43 = BrazeLogger.SUPPRESS;
                            }
                            i32 &= -458753;
                        } else {
                            i43 = i10;
                        }
                        if (i37 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i11;
                        }
                        if (i39 == 0) {
                            kVar6 = kVar2;
                        }
                        if ((i14 & 262144) != 0) {
                            TextFieldDefaults textFieldDefaults111 = TextFieldDefaults.f11834a;
                            p270w.a aVar111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar112 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar111, null, null, aVar112, aVar112, 3);
                            i32 &= -234881025;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i14 & 524288) != 0) {
                            TextFieldDefaults textFieldDefaults112 = TextFieldDefaults.f11834a;
                            i32 &= -1879048193;
                            uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        } else {
                            uB = u10;
                        }
                        i41 = i43;
                        z24 = z23;
                        i44 = i32;
                        pVar13 = pVar9;
                    }
                    c1086gP.U();
                    if (kVar6 == null) {
                        c1086gP.L(-1665803660);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        kVar7 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        c1086gP.L(-53736253);
                        c1086gP.T(false);
                        kVar7 = kVar6;
                    }
                    c1086gP.L(-53730507);
                    jB = f12.b();
                    if (jB == 16) {
                        jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                    }
                    androidx.compose.foundation.text.j jVar9 = jVar3;
                    c1086gP.T(false);
                    androidx.compose.ui.text.F fD6 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final float f1113 = TextFieldDefaults.f11838e;
                    final float f1114 = TextFieldDefaults.f11837d;
                    androidx.compose.ui.text.F f1115 = f12;
                    final boolean z21110 = z20;
                    final boolean z21111 = z22;
                    final androidx.compose.foundation.interaction.k kVar18 = kVar7;
                    final U u112 = uB;
                    hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.q
                        public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                            N0 n0I;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            num.intValue();
                            interfaceC1084f3.L(1398930845);
                            boolean z21112 = z21110;
                            boolean z21113 = z21111;
                            androidx.compose.foundation.interaction.j jVar10 = kVar18;
                            U u113 = u112;
                            float f1116 = f1113;
                            float f1117 = f1114;
                            X xA = androidx.compose.foundation.interaction.f.a(jVar10, interfaceC1084f3, 0);
                            N0<androidx.compose.ui.graphics.H> n0E = u113.e(z21112, z21113, jVar10, interfaceC1084f3, 0);
                            if (!((Boolean) xA.getValue()).booleanValue()) {
                                f1116 = f1117;
                            }
                            if (z21112) {
                                interfaceC1084f3.L(773088894);
                                n0I = C0902b.a(f1116, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                                interfaceC1084f3.D();
                            } else {
                                interfaceC1084f3.L(773193116);
                                n0I = J0.i(new p013b0.f(f1117), interfaceC1084f3);
                                interfaceC1084f3.D();
                            }
                            X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                            androidx.compose.ui.h.a aVar113 = androidx.compose.ui.h.a.f13984b;
                            final C0937i c0937i = (C0937i) xI.getValue();
                            float f1118 = TextFieldKt.f11841a;
                            final float f1119 = c0937i.f10065a;
                            androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar113, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.c cVar) {
                                    J.c cVar2 = cVar;
                                    cVar2.A1();
                                    if (!p013b0.f.a(f1119, 0.0f)) {
                                        float density = cVar2.getDensity() * f1119;
                                        float fB = I.h.b(cVar2.j()) - (density / 2);
                                        cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            });
                            interfaceC1084f3.D();
                            return hVarC;
                        }
                    });
                    strK = P3.d.k(c1086gP, 3);
                    float f1116 = TextFieldImplKt.f11839a;
                    if (z22) {
                        hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                String str2 = strK;
                                Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                wVar.e(SemanticsProperties.f15144J, str2);
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                    final boolean z21112 = z20;
                    final boolean z21113 = z24;
                    final androidx.compose.ui.text.input.E e18 = e12;
                    final androidx.compose.foundation.interaction.k kVar19 = kVar7;
                    final boolean z21114 = z22;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1114 = pVar13;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1115 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1116 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1117 = pVar12;
                    final l0 l0Var8 = l0VarB;
                    final U u113 = uB;
                    int i57 = i44 << 12;
                    BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD6, kVar5, jVar9, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // Ia.q
                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1118, InterfaceC1084f interfaceC1084f2, Integer num) {
                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1119 = pVar1118;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= interfaceC1084f3.k(pVar1119) ? 4 : 2;
                            }
                            int i58 = iIntValue;
                            if (interfaceC1084f3.C(i58 & 1, (i58 & 19) != 18)) {
                                TextFieldDefaults.f11834a.a(str, pVar1119, z21112, z21113, e18, kVar19, z21114, pVar1114, pVar1115, pVar1116, pVar1117, l0Var8, u113, null, interfaceC1084f3, (i58 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i57) | (29360128 & i57) | (234881024 & i57) | (i57 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                    jVar2 = jVar9;
                    pVar8 = pVar12;
                    e11 = e12;
                    z19 = z24;
                    hVar2 = hVar3;
                    u11 = uB;
                    z17 = z21;
                    kVar4 = kVar6;
                    l0Var2 = l0VarB;
                    z18 = z22;
                    kVar3 = kVar5;
                    pVar7 = pVar11;
                    f11 = f1115;
                    z16 = z20;
                    pVar6 = pVar10;
                    pVar5 = pVar13;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    z16 = z10;
                    z17 = z11;
                    f11 = f10;
                    pVar5 = pVar;
                    pVar6 = pVar2;
                    pVar7 = pVar3;
                    pVar8 = pVar4;
                    z18 = z12;
                    e11 = e10;
                    kVar3 = kVar;
                    jVar2 = jVar;
                    z19 = z13;
                    i41 = i10;
                    i42 = i11;
                    kVar4 = kVar2;
                    l0Var2 = l0Var;
                    u11 = u10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i50 |= 24576;
            if ((i12 & 196608) != 0) {
                if ((i14 & 32) == 0) {
                    i49 = 65536;
                } else {
                    i49 = 65536;
                }
                i50 |= i49;
            }
            i20 = i14 & 64;
            if (i20 != 0) {
                i50 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c1086gP.k(pVar)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i50 |= i21;
            }
            i22 = i14 & 128;
            if (i22 != 0) {
                i50 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c1086gP.k(pVar2)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i50 |= i23;
            }
            i24 = i14 & 256;
            if (i24 != 0) {
                i50 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (c1086gP.k(pVar3)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i50 |= i25;
            }
            i26 = i14 & 512;
            if (i26 != 0) {
                i50 |= 805306368;
            } else if ((i12 & 805306368) == 0) {
                if (c1086gP.k(pVar4)) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
                i50 |= i27;
            }
            i28 = i14 & 1024;
            if (i28 != 0) {
                i29 = i13 | 6;
            } else if ((i13 & 6) == 0) {
                i29 = i13 | (c1086gP.c(z12) ? 4 : 2);
            } else {
                i29 = i13;
            }
            i30 = i14 & 2048;
            if (i30 != 0) {
                i29 |= 48;
            } else if ((i13 & 48) == 0) {
                if (c1086gP.K(e10)) {
                    i31 = 32;
                } else {
                    i31 = 16;
                }
                i29 |= i31;
            }
            i32 = i29;
            i33 = i14 & 4096;
            if (i33 != 0) {
                i32 |= 384;
            } else if ((i13 & 384) != 0) {
                if (c1086gP.K(kVar)) {
                    i34 = 256;
                } else {
                    i34 = 128;
                }
                i32 |= i34;
            }
            if ((i13 & 3072) != 0) {
                if ((i14 & 8192) == 0) {
                    i48 = 1024;
                } else {
                    i48 = 1024;
                }
                i32 |= i48;
            }
            i35 = i14 & 16384;
            if (i35 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c1086gP.c(z13)) {
                        i36 = 16384;
                    } else {
                        i36 = 8192;
                    }
                    i32 |= i36;
                }
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i47 = 65536;
                    } else {
                        i47 = 65536;
                    }
                    i32 |= i47;
                }
                i37 = i14 & 65536;
                if (i37 != 0) {
                    i32 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c1086gP.h(i11)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i32 |= i38;
                }
                i39 = i14 & 131072;
                if (i39 != 0) {
                    i32 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c1086gP.K(kVar2)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i32 |= i40;
                }
                if ((i13 & 100663296) != 0) {
                    if ((i14 & 262144) == 0) {
                        i46 = 33554432;
                    } else {
                        i46 = 33554432;
                    }
                    i32 |= i46;
                }
                if ((i13 & 805306368) != 0) {
                    if ((i14 & 524288) == 0) {
                        i45 = 268435456;
                    } else {
                        i45 = 268435456;
                    }
                    i32 |= i45;
                }
                if ((i50 & 306783379) == 306783378) {
                    z14 = true;
                    z15 = true;
                } else {
                    z14 = true;
                    z15 = true;
                }
                if (c1086gP.C(i50 & 1, z15)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i16 != 0) {
                            z20 = z14;
                        } else {
                            z20 = z10;
                        }
                        if (i18 != 0) {
                            z21 = false;
                        } else {
                            z21 = z11;
                        }
                        if ((i14 & 32) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                            i50 &= -458753;
                        } else {
                            f12 = f10;
                        }
                        if (i20 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i22 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i26 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            z22 = false;
                        } else {
                            z22 = z12;
                        }
                        if (i30 != 0) {
                            e12 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e12 = e10;
                        }
                        if (i33 != 0) {
                            kVar5 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar5 = kVar;
                        }
                        if ((8192 & i14) != 0) {
                            kVar6 = null;
                            jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                            i32 &= -7169;
                        } else {
                            kVar6 = null;
                            jVar3 = jVar;
                        }
                        if (i35 != 0) {
                            z23 = false;
                        } else {
                            z23 = z13;
                        }
                        if ((i14 & 32768) != 0) {
                            if (z23) {
                                i43 = 1;
                            } else {
                                i43 = BrazeLogger.SUPPRESS;
                            }
                            i32 &= -458753;
                        } else {
                            i43 = i10;
                        }
                        if (i37 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i11;
                        }
                        if (i39 == 0) {
                            kVar6 = kVar2;
                        }
                        if ((i14 & 262144) != 0) {
                            TextFieldDefaults textFieldDefaults113 = TextFieldDefaults.f11834a;
                            p270w.a aVar113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar114 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar113, null, null, aVar114, aVar114, 3);
                            i32 &= -234881025;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i14 & 524288) != 0) {
                            TextFieldDefaults textFieldDefaults114 = TextFieldDefaults.f11834a;
                            i32 &= -1879048193;
                            uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        } else {
                            uB = u10;
                        }
                        i41 = i43;
                        z24 = z23;
                        i44 = i32;
                        pVar13 = pVar9;
                    } else {
                        if (i51 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i16 != 0) {
                            z20 = z14;
                        } else {
                            z20 = z10;
                        }
                        if (i18 != 0) {
                            z21 = false;
                        } else {
                            z21 = z11;
                        }
                        if ((i14 & 32) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                            i50 &= -458753;
                        } else {
                            f12 = f10;
                        }
                        if (i20 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i22 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i26 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            z22 = false;
                        } else {
                            z22 = z12;
                        }
                        if (i30 != 0) {
                            e12 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e12 = e10;
                        }
                        if (i33 != 0) {
                            kVar5 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar5 = kVar;
                        }
                        if ((8192 & i14) != 0) {
                            kVar6 = null;
                            jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                            i32 &= -7169;
                        } else {
                            kVar6 = null;
                            jVar3 = jVar;
                        }
                        if (i35 != 0) {
                            z23 = false;
                        } else {
                            z23 = z13;
                        }
                        if ((i14 & 32768) != 0) {
                            if (z23) {
                                i43 = 1;
                            } else {
                                i43 = BrazeLogger.SUPPRESS;
                            }
                            i32 &= -458753;
                        } else {
                            i43 = i10;
                        }
                        if (i37 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i11;
                        }
                        if (i39 == 0) {
                            kVar6 = kVar2;
                        }
                        if ((i14 & 262144) != 0) {
                            TextFieldDefaults textFieldDefaults115 = TextFieldDefaults.f11834a;
                            p270w.a aVar115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar116 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar115, null, null, aVar116, aVar116, 3);
                            i32 &= -234881025;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i14 & 524288) != 0) {
                            TextFieldDefaults textFieldDefaults116 = TextFieldDefaults.f11834a;
                            i32 &= -1879048193;
                            uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        } else {
                            uB = u10;
                        }
                        i41 = i43;
                        z24 = z23;
                        i44 = i32;
                        pVar13 = pVar9;
                    }
                    c1086gP.U();
                    if (kVar6 == null) {
                        c1086gP.L(-1665803660);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        kVar7 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        c1086gP.L(-53736253);
                        c1086gP.T(false);
                        kVar7 = kVar6;
                    }
                    c1086gP.L(-53730507);
                    jB = f12.b();
                    if (jB == 16) {
                        jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                    }
                    androidx.compose.foundation.text.j jVar10 = jVar3;
                    c1086gP.T(false);
                    androidx.compose.ui.text.F fD7 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final float f1117 = TextFieldDefaults.f11838e;
                    final float f1118 = TextFieldDefaults.f11837d;
                    androidx.compose.ui.text.F f1119 = f12;
                    final boolean z21115 = z20;
                    final boolean z21116 = z22;
                    final androidx.compose.foundation.interaction.k kVar110 = kVar7;
                    final U u114 = uB;
                    hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.q
                        public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                            N0 n0I;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            num.intValue();
                            interfaceC1084f3.L(1398930845);
                            boolean z21117 = z21115;
                            boolean z21118 = z21116;
                            androidx.compose.foundation.interaction.j jVar11 = kVar110;
                            U u115 = u114;
                            float f11110 = f1117;
                            float f11111 = f1118;
                            X xA = androidx.compose.foundation.interaction.f.a(jVar11, interfaceC1084f3, 0);
                            N0<androidx.compose.ui.graphics.H> n0E = u115.e(z21117, z21118, jVar11, interfaceC1084f3, 0);
                            if (!((Boolean) xA.getValue()).booleanValue()) {
                                f11110 = f11111;
                            }
                            if (z21117) {
                                interfaceC1084f3.L(773088894);
                                n0I = C0902b.a(f11110, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                                interfaceC1084f3.D();
                            } else {
                                interfaceC1084f3.L(773193116);
                                n0I = J0.i(new p013b0.f(f11111), interfaceC1084f3);
                                interfaceC1084f3.D();
                            }
                            X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                            androidx.compose.ui.h.a aVar117 = androidx.compose.ui.h.a.f13984b;
                            final C0937i c0937i = (C0937i) xI.getValue();
                            float f11112 = TextFieldKt.f11841a;
                            final float f11113 = c0937i.f10065a;
                            androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar117, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.c cVar) {
                                    J.c cVar2 = cVar;
                                    cVar2.A1();
                                    if (!p013b0.f.a(f11113, 0.0f)) {
                                        float density = cVar2.getDensity() * f11113;
                                        float fB = I.h.b(cVar2.j()) - (density / 2);
                                        cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            });
                            interfaceC1084f3.D();
                            return hVarC;
                        }
                    });
                    strK = P3.d.k(c1086gP, 3);
                    float f11110 = TextFieldImplKt.f11839a;
                    if (z22) {
                        hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                String str2 = strK;
                                Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                wVar.e(SemanticsProperties.f15144J, str2);
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                    final boolean z21117 = z20;
                    final boolean z21118 = z24;
                    final androidx.compose.ui.text.input.E e19 = e12;
                    final androidx.compose.foundation.interaction.k kVar111 = kVar7;
                    final boolean z21119 = z22;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1118 = pVar13;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1119 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11110 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111 = pVar12;
                    final l0 l0Var9 = l0VarB;
                    final U u115 = uB;
                    int i58 = i44 << 12;
                    BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD7, kVar5, jVar10, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // Ia.q
                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar11112, InterfaceC1084f interfaceC1084f2, Integer num) {
                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar11113 = pVar11112;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= interfaceC1084f3.k(pVar11113) ? 4 : 2;
                            }
                            int i59 = iIntValue;
                            if (interfaceC1084f3.C(i59 & 1, (i59 & 19) != 18)) {
                                TextFieldDefaults.f11834a.a(str, pVar11113, z21117, z21118, e19, kVar111, z21119, pVar1118, pVar1119, pVar11110, pVar11111, l0Var9, u115, null, interfaceC1084f3, (i59 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i58) | (29360128 & i58) | (234881024 & i58) | (i58 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                    jVar2 = jVar10;
                    pVar8 = pVar12;
                    e11 = e12;
                    z19 = z24;
                    hVar2 = hVar3;
                    u11 = uB;
                    z17 = z21;
                    kVar4 = kVar6;
                    l0Var2 = l0VarB;
                    z18 = z22;
                    kVar3 = kVar5;
                    pVar7 = pVar11;
                    f11 = f1119;
                    z16 = z20;
                    pVar6 = pVar10;
                    pVar5 = pVar13;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    z16 = z10;
                    z17 = z11;
                    f11 = f10;
                    pVar5 = pVar;
                    pVar6 = pVar2;
                    pVar7 = pVar3;
                    pVar8 = pVar4;
                    z18 = z12;
                    e11 = e10;
                    kVar3 = kVar;
                    jVar2 = jVar;
                    z19 = z13;
                    i41 = i10;
                    i42 = i11;
                    kVar4 = kVar2;
                    l0Var2 = l0Var;
                    u11 = u10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i32 |= 24576;
            if ((i13 & 196608) != 0) {
                if ((i14 & 32768) == 0) {
                    i47 = 65536;
                } else {
                    i47 = 65536;
                }
                i32 |= i47;
            }
            i37 = i14 & 65536;
            if (i37 != 0) {
                i32 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c1086gP.h(i11)) {
                    i38 = 1048576;
                } else {
                    i38 = 524288;
                }
                i32 |= i38;
            }
            i39 = i14 & 131072;
            if (i39 != 0) {
                i32 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c1086gP.K(kVar2)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i32 |= i40;
            }
            if ((i13 & 100663296) != 0) {
                if ((i14 & 262144) == 0) {
                    i46 = 33554432;
                } else {
                    i46 = 33554432;
                }
                i32 |= i46;
            }
            if ((i13 & 805306368) != 0) {
                if ((i14 & 524288) == 0) {
                    i45 = 268435456;
                } else {
                    i45 = 268435456;
                }
                i32 |= i45;
            }
            if ((i50 & 306783379) == 306783378) {
                z14 = true;
                z15 = true;
            } else {
                z14 = true;
                z15 = true;
            }
            if (c1086gP.C(i50 & 1, z15)) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i16 != 0) {
                        z20 = z14;
                    } else {
                        z20 = z10;
                    }
                    if (i18 != 0) {
                        z21 = false;
                    } else {
                        z21 = z11;
                    }
                    if ((i14 & 32) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                        i50 &= -458753;
                    } else {
                        f12 = f10;
                    }
                    if (i20 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i22 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i26 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        z22 = false;
                    } else {
                        z22 = z12;
                    }
                    if (i30 != 0) {
                        e12 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e12 = e10;
                    }
                    if (i33 != 0) {
                        kVar5 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar5 = kVar;
                    }
                    if ((8192 & i14) != 0) {
                        kVar6 = null;
                        jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                        i32 &= -7169;
                    } else {
                        kVar6 = null;
                        jVar3 = jVar;
                    }
                    if (i35 != 0) {
                        z23 = false;
                    } else {
                        z23 = z13;
                    }
                    if ((i14 & 32768) != 0) {
                        if (z23) {
                            i43 = 1;
                        } else {
                            i43 = BrazeLogger.SUPPRESS;
                        }
                        i32 &= -458753;
                    } else {
                        i43 = i10;
                    }
                    if (i37 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i11;
                    }
                    if (i39 == 0) {
                        kVar6 = kVar2;
                    }
                    if ((i14 & 262144) != 0) {
                        TextFieldDefaults textFieldDefaults117 = TextFieldDefaults.f11834a;
                        p270w.a aVar117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar118 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar117, null, null, aVar118, aVar118, 3);
                        i32 &= -234881025;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i14 & 524288) != 0) {
                        TextFieldDefaults textFieldDefaults118 = TextFieldDefaults.f11834a;
                        i32 &= -1879048193;
                        uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                    } else {
                        uB = u10;
                    }
                    i41 = i43;
                    z24 = z23;
                    i44 = i32;
                    pVar13 = pVar9;
                } else {
                    if (i51 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i16 != 0) {
                        z20 = z14;
                    } else {
                        z20 = z10;
                    }
                    if (i18 != 0) {
                        z21 = false;
                    } else {
                        z21 = z11;
                    }
                    if ((i14 & 32) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                        i50 &= -458753;
                    } else {
                        f12 = f10;
                    }
                    if (i20 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i22 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i26 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        z22 = false;
                    } else {
                        z22 = z12;
                    }
                    if (i30 != 0) {
                        e12 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e12 = e10;
                    }
                    if (i33 != 0) {
                        kVar5 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar5 = kVar;
                    }
                    if ((8192 & i14) != 0) {
                        kVar6 = null;
                        jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                        i32 &= -7169;
                    } else {
                        kVar6 = null;
                        jVar3 = jVar;
                    }
                    if (i35 != 0) {
                        z23 = false;
                    } else {
                        z23 = z13;
                    }
                    if ((i14 & 32768) != 0) {
                        if (z23) {
                            i43 = 1;
                        } else {
                            i43 = BrazeLogger.SUPPRESS;
                        }
                        i32 &= -458753;
                    } else {
                        i43 = i10;
                    }
                    if (i37 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i11;
                    }
                    if (i39 == 0) {
                        kVar6 = kVar2;
                    }
                    if ((i14 & 262144) != 0) {
                        TextFieldDefaults textFieldDefaults119 = TextFieldDefaults.f11834a;
                        p270w.a aVar119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar1110 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar119, null, null, aVar1110, aVar1110, 3);
                        i32 &= -234881025;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i14 & 524288) != 0) {
                        TextFieldDefaults textFieldDefaults1110 = TextFieldDefaults.f11834a;
                        i32 &= -1879048193;
                        uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                    } else {
                        uB = u10;
                    }
                    i41 = i43;
                    z24 = z23;
                    i44 = i32;
                    pVar13 = pVar9;
                }
                c1086gP.U();
                if (kVar6 == null) {
                    c1086gP.L(-1665803660);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    kVar7 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    c1086gP.L(-53736253);
                    c1086gP.T(false);
                    kVar7 = kVar6;
                }
                c1086gP.L(-53730507);
                jB = f12.b();
                if (jB == 16) {
                    jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                }
                androidx.compose.foundation.text.j jVar11 = jVar3;
                c1086gP.T(false);
                androidx.compose.ui.text.F fD8 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                final float f11111 = TextFieldDefaults.f11838e;
                final float f11112 = TextFieldDefaults.f11837d;
                androidx.compose.ui.text.F f11113 = f12;
                final boolean z211110 = z20;
                final boolean z211111 = z22;
                final androidx.compose.foundation.interaction.k kVar112 = kVar7;
                final U u116 = uB;
                hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // Ia.q
                    public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                        N0 n0I;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        interfaceC1084f3.L(1398930845);
                        boolean z211112 = z211110;
                        boolean z211113 = z211111;
                        androidx.compose.foundation.interaction.j jVar12 = kVar112;
                        U u117 = u116;
                        float f11114 = f11111;
                        float f11115 = f11112;
                        X xA = androidx.compose.foundation.interaction.f.a(jVar12, interfaceC1084f3, 0);
                        N0<androidx.compose.ui.graphics.H> n0E = u117.e(z211112, z211113, jVar12, interfaceC1084f3, 0);
                        if (!((Boolean) xA.getValue()).booleanValue()) {
                            f11114 = f11115;
                        }
                        if (z211112) {
                            interfaceC1084f3.L(773088894);
                            n0I = C0902b.a(f11114, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                            interfaceC1084f3.D();
                        } else {
                            interfaceC1084f3.L(773193116);
                            n0I = J0.i(new p013b0.f(f11115), interfaceC1084f3);
                            interfaceC1084f3.D();
                        }
                        X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                        androidx.compose.ui.h.a aVar1111 = androidx.compose.ui.h.a.f13984b;
                        final C0937i c0937i = (C0937i) xI.getValue();
                        float f11116 = TextFieldKt.f11841a;
                        final float f11117 = c0937i.f10065a;
                        androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar1111, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.c cVar) {
                                J.c cVar2 = cVar;
                                cVar2.A1();
                                if (!p013b0.f.a(f11117, 0.0f)) {
                                    float density = cVar2.getDensity() * f11117;
                                    float fB = I.h.b(cVar2.j()) - (density / 2);
                                    cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                }
                                return p293xa.r.f47939a;
                            }
                        });
                        interfaceC1084f3.D();
                        return hVarC;
                    }
                });
                strK = P3.d.k(c1086gP, 3);
                float f11114 = TextFieldImplKt.f11839a;
                if (z22) {
                    hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            String str2 = strK;
                            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                            wVar.e(SemanticsProperties.f15144J, str2);
                            return p293xa.r.f47939a;
                        }
                    });
                }
                final boolean z211112 = z20;
                final boolean z211113 = z24;
                final androidx.compose.ui.text.input.E e110 = e12;
                final androidx.compose.foundation.interaction.k kVar113 = kVar7;
                final boolean z211114 = z22;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11112 = pVar13;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11113 = pVar10;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11114 = pVar11;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11115 = pVar12;
                final l0 l0Var10 = l0VarB;
                final U u117 = uB;
                int i59 = i44 << 12;
                BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD8, kVar5, jVar11, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // Ia.q
                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar11116, InterfaceC1084f interfaceC1084f2, Integer num) {
                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar11117 = pVar11116;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= interfaceC1084f3.k(pVar11117) ? 4 : 2;
                        }
                        int i510 = iIntValue;
                        if (interfaceC1084f3.C(i510 & 1, (i510 & 19) != 18)) {
                            TextFieldDefaults.f11834a.a(str, pVar11117, z211112, z211113, e110, kVar113, z211114, pVar11112, pVar11113, pVar11114, pVar11115, l0Var10, u117, null, interfaceC1084f3, (i510 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i59) | (29360128 & i59) | (234881024 & i59) | (i59 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                jVar2 = jVar11;
                pVar8 = pVar12;
                e11 = e12;
                z19 = z24;
                hVar2 = hVar3;
                u11 = uB;
                z17 = z21;
                kVar4 = kVar6;
                l0Var2 = l0VarB;
                z18 = z22;
                kVar3 = kVar5;
                pVar7 = pVar11;
                f11 = f11113;
                z16 = z20;
                pVar6 = pVar10;
                pVar5 = pVar13;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                z16 = z10;
                z17 = z11;
                f11 = f10;
                pVar5 = pVar;
                pVar6 = pVar2;
                pVar7 = pVar3;
                pVar8 = pVar4;
                z18 = z12;
                e11 = e10;
                kVar3 = kVar;
                jVar2 = jVar;
                z19 = z13;
                i41 = i10;
                i42 = i11;
                kVar4 = kVar2;
                l0Var2 = l0Var;
                u11 = u10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i50 |= 384;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i12 & 3072) == 0) {
                if (c1086gP.c(z10)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i50 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i12 & 24576) == 0) {
                    if (c1086gP.c(z11)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i50 |= i19;
                }
                if ((i12 & 196608) != 0) {
                    if ((i14 & 32) == 0) {
                        i49 = 65536;
                    } else {
                        i49 = 65536;
                    }
                    i50 |= i49;
                }
                i20 = i14 & 64;
                if (i20 != 0) {
                    i50 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i50 |= i21;
                }
                i22 = i14 & 128;
                if (i22 != 0) {
                    i50 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i50 |= i23;
                }
                i24 = i14 & 256;
                if (i24 != 0) {
                    i50 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i50 |= i25;
                }
                i26 = i14 & 512;
                if (i26 != 0) {
                    i50 |= 805306368;
                } else if ((i12 & 805306368) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i50 |= i27;
                }
                i28 = i14 & 1024;
                if (i28 != 0) {
                    i29 = i13 | 6;
                } else if ((i13 & 6) == 0) {
                    i29 = i13 | (c1086gP.c(z12) ? 4 : 2);
                } else {
                    i29 = i13;
                }
                i30 = i14 & 2048;
                if (i30 != 0) {
                    i29 |= 48;
                } else if ((i13 & 48) == 0) {
                    if (c1086gP.K(e10)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i29 |= i31;
                }
                i32 = i29;
                i33 = i14 & 4096;
                if (i33 != 0) {
                    i32 |= 384;
                } else if ((i13 & 384) != 0) {
                    if (c1086gP.K(kVar)) {
                        i34 = 256;
                    } else {
                        i34 = 128;
                    }
                    i32 |= i34;
                }
                if ((i13 & 3072) != 0) {
                    if ((i14 & 8192) == 0) {
                        i48 = 1024;
                    } else {
                        i48 = 1024;
                    }
                    i32 |= i48;
                }
                i35 = i14 & 16384;
                if (i35 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c1086gP.c(z13)) {
                            i36 = 16384;
                        } else {
                            i36 = 8192;
                        }
                        i32 |= i36;
                    }
                    if ((i13 & 196608) != 0) {
                        if ((i14 & 32768) == 0) {
                            i47 = 65536;
                        } else {
                            i47 = 65536;
                        }
                        i32 |= i47;
                    }
                    i37 = i14 & 65536;
                    if (i37 != 0) {
                        i32 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c1086gP.h(i11)) {
                            i38 = 1048576;
                        } else {
                            i38 = 524288;
                        }
                        i32 |= i38;
                    }
                    i39 = i14 & 131072;
                    if (i39 != 0) {
                        i32 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c1086gP.K(kVar2)) {
                            i40 = 8388608;
                        } else {
                            i40 = 4194304;
                        }
                        i32 |= i40;
                    }
                    if ((i13 & 100663296) != 0) {
                        if ((i14 & 262144) == 0) {
                            i46 = 33554432;
                        } else {
                            i46 = 33554432;
                        }
                        i32 |= i46;
                    }
                    if ((i13 & 805306368) != 0) {
                        if ((i14 & 524288) == 0) {
                            i45 = 268435456;
                        } else {
                            i45 = 268435456;
                        }
                        i32 |= i45;
                    }
                    if ((i50 & 306783379) == 306783378) {
                        z14 = true;
                        z15 = true;
                    } else {
                        z14 = true;
                        z15 = true;
                    }
                    if (c1086gP.C(i50 & 1, z15)) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i51 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i16 != 0) {
                                z20 = z14;
                            } else {
                                z20 = z10;
                            }
                            if (i18 != 0) {
                                z21 = false;
                            } else {
                                z21 = z11;
                            }
                            if ((i14 & 32) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                                i50 &= -458753;
                            } else {
                                f12 = f10;
                            }
                            if (i20 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i22 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i26 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                z22 = false;
                            } else {
                                z22 = z12;
                            }
                            if (i30 != 0) {
                                e12 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e12 = e10;
                            }
                            if (i33 != 0) {
                                kVar5 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar5 = kVar;
                            }
                            if ((8192 & i14) != 0) {
                                kVar6 = null;
                                jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                                i32 &= -7169;
                            } else {
                                kVar6 = null;
                                jVar3 = jVar;
                            }
                            if (i35 != 0) {
                                z23 = false;
                            } else {
                                z23 = z13;
                            }
                            if ((i14 & 32768) != 0) {
                                if (z23) {
                                    i43 = 1;
                                } else {
                                    i43 = BrazeLogger.SUPPRESS;
                                }
                                i32 &= -458753;
                            } else {
                                i43 = i10;
                            }
                            if (i37 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i11;
                            }
                            if (i39 == 0) {
                                kVar6 = kVar2;
                            }
                            if ((i14 & 262144) != 0) {
                                TextFieldDefaults textFieldDefaults1111 = TextFieldDefaults.f11834a;
                                p270w.a aVar1111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar1112 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar1111, null, null, aVar1112, aVar1112, 3);
                                i32 &= -234881025;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i14 & 524288) != 0) {
                                TextFieldDefaults textFieldDefaults1112 = TextFieldDefaults.f11834a;
                                i32 &= -1879048193;
                                uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            } else {
                                uB = u10;
                            }
                            i41 = i43;
                            z24 = z23;
                            i44 = i32;
                            pVar13 = pVar9;
                        } else {
                            if (i51 != 0) {
                                hVar3 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar3 = hVar;
                            }
                            if (i16 != 0) {
                                z20 = z14;
                            } else {
                                z20 = z10;
                            }
                            if (i18 != 0) {
                                z21 = false;
                            } else {
                                z21 = z11;
                            }
                            if ((i14 & 32) != 0) {
                                f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                                i50 &= -458753;
                            } else {
                                f12 = f10;
                            }
                            if (i20 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar;
                            }
                            if (i22 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar2;
                            }
                            if (i24 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar3;
                            }
                            if (i26 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar4;
                            }
                            if (i28 != 0) {
                                z22 = false;
                            } else {
                                z22 = z12;
                            }
                            if (i30 != 0) {
                                e12 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e12 = e10;
                            }
                            if (i33 != 0) {
                                kVar5 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar5 = kVar;
                            }
                            if ((8192 & i14) != 0) {
                                kVar6 = null;
                                jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                                i32 &= -7169;
                            } else {
                                kVar6 = null;
                                jVar3 = jVar;
                            }
                            if (i35 != 0) {
                                z23 = false;
                            } else {
                                z23 = z13;
                            }
                            if ((i14 & 32768) != 0) {
                                if (z23) {
                                    i43 = 1;
                                } else {
                                    i43 = BrazeLogger.SUPPRESS;
                                }
                                i32 &= -458753;
                            } else {
                                i43 = i10;
                            }
                            if (i37 != 0) {
                                i42 = 1;
                            } else {
                                i42 = i11;
                            }
                            if (i39 == 0) {
                                kVar6 = kVar2;
                            }
                            if ((i14 & 262144) != 0) {
                                TextFieldDefaults textFieldDefaults1113 = TextFieldDefaults.f11834a;
                                p270w.a aVar1113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                                w.c.a aVar1114 = p270w.c.f47677a;
                                l0VarB = p270w.a.b(aVar1113, null, null, aVar1114, aVar1114, 3);
                                i32 &= -234881025;
                            } else {
                                l0VarB = l0Var;
                            }
                            if ((i14 & 524288) != 0) {
                                TextFieldDefaults textFieldDefaults1114 = TextFieldDefaults.f11834a;
                                i32 &= -1879048193;
                                uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                            } else {
                                uB = u10;
                            }
                            i41 = i43;
                            z24 = z23;
                            i44 = i32;
                            pVar13 = pVar9;
                        }
                        c1086gP.U();
                        if (kVar6 == null) {
                            c1086gP.L(-1665803660);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            c1086gP.T(false);
                            kVar7 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            c1086gP.L(-53736253);
                            c1086gP.T(false);
                            kVar7 = kVar6;
                        }
                        c1086gP.L(-53730507);
                        jB = f12.b();
                        if (jB == 16) {
                            jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                        }
                        androidx.compose.foundation.text.j jVar12 = jVar3;
                        c1086gP.T(false);
                        androidx.compose.ui.text.F fD9 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                        final float f11115 = TextFieldDefaults.f11838e;
                        final float f11116 = TextFieldDefaults.f11837d;
                        androidx.compose.ui.text.F f11117 = f12;
                        final boolean z211115 = z20;
                        final boolean z211116 = z22;
                        final androidx.compose.foundation.interaction.k kVar114 = kVar7;
                        final U u118 = uB;
                        hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // Ia.q
                            public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                                N0 n0I;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                num.intValue();
                                interfaceC1084f3.L(1398930845);
                                boolean z211117 = z211115;
                                boolean z211118 = z211116;
                                androidx.compose.foundation.interaction.j jVar13 = kVar114;
                                U u119 = u118;
                                float f11118 = f11115;
                                float f11119 = f11116;
                                X xA = androidx.compose.foundation.interaction.f.a(jVar13, interfaceC1084f3, 0);
                                N0<androidx.compose.ui.graphics.H> n0E = u119.e(z211117, z211118, jVar13, interfaceC1084f3, 0);
                                if (!((Boolean) xA.getValue()).booleanValue()) {
                                    f11118 = f11119;
                                }
                                if (z211117) {
                                    interfaceC1084f3.L(773088894);
                                    n0I = C0902b.a(f11118, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                                    interfaceC1084f3.D();
                                } else {
                                    interfaceC1084f3.L(773193116);
                                    n0I = J0.i(new p013b0.f(f11119), interfaceC1084f3);
                                    interfaceC1084f3.D();
                                }
                                X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                                androidx.compose.ui.h.a aVar1115 = androidx.compose.ui.h.a.f13984b;
                                final C0937i c0937i = (C0937i) xI.getValue();
                                float f111110 = TextFieldKt.f11841a;
                                final float f111111 = c0937i.f10065a;
                                androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar1115, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // Ia.l
                                    public final p293xa.r invoke(J.c cVar) {
                                        J.c cVar2 = cVar;
                                        cVar2.A1();
                                        if (!p013b0.f.a(f111111, 0.0f)) {
                                            float density = cVar2.getDensity() * f111111;
                                            float fB = I.h.b(cVar2.j()) - (density / 2);
                                            cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                });
                                interfaceC1084f3.D();
                                return hVarC;
                            }
                        });
                        strK = P3.d.k(c1086gP, 3);
                        float f11118 = TextFieldImplKt.f11839a;
                        if (z22) {
                            hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                    String str2 = strK;
                                    Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                    wVar.e(SemanticsProperties.f15144J, str2);
                                    return p293xa.r.f47939a;
                                }
                            });
                        }
                        final boolean z211117 = z20;
                        final boolean z211118 = z24;
                        final androidx.compose.ui.text.input.E e111 = e12;
                        final androidx.compose.foundation.interaction.k kVar115 = kVar7;
                        final boolean z211119 = z22;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11116 = pVar13;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11117 = pVar10;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11118 = pVar11;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11119 = pVar12;
                        final l0 l0Var11 = l0VarB;
                        final U u119 = uB;
                        int i510 = i44 << 12;
                        BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD9, kVar5, jVar12, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // Ia.q
                            public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar111110, InterfaceC1084f interfaceC1084f2, Integer num) {
                                Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar111111 = pVar111110;
                                InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                                int iIntValue = num.intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= interfaceC1084f3.k(pVar111111) ? 4 : 2;
                                }
                                int i511 = iIntValue;
                                if (interfaceC1084f3.C(i511 & 1, (i511 & 19) != 18)) {
                                    TextFieldDefaults.f11834a.a(str, pVar111111, z211117, z211118, e111, kVar115, z211119, pVar11116, pVar11117, pVar11118, pVar11119, l0Var11, u119, null, interfaceC1084f3, (i511 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                                } else {
                                    interfaceC1084f3.w();
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i510) | (29360128 & i510) | (234881024 & i510) | (i510 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                        jVar2 = jVar12;
                        pVar8 = pVar12;
                        e11 = e12;
                        z19 = z24;
                        hVar2 = hVar3;
                        u11 = uB;
                        z17 = z21;
                        kVar4 = kVar6;
                        l0Var2 = l0VarB;
                        z18 = z22;
                        kVar3 = kVar5;
                        pVar7 = pVar11;
                        f11 = f11117;
                        z16 = z20;
                        pVar6 = pVar10;
                        pVar5 = pVar13;
                    } else {
                        c1086gP.w();
                        hVar2 = hVar;
                        z16 = z10;
                        z17 = z11;
                        f11 = f10;
                        pVar5 = pVar;
                        pVar6 = pVar2;
                        pVar7 = pVar3;
                        pVar8 = pVar4;
                        z18 = z12;
                        e11 = e10;
                        kVar3 = kVar;
                        jVar2 = jVar;
                        z19 = z13;
                        i41 = i10;
                        i42 = i11;
                        kVar4 = kVar2;
                        l0Var2 = l0Var;
                        u11 = u10;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i32 |= 24576;
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i47 = 65536;
                    } else {
                        i47 = 65536;
                    }
                    i32 |= i47;
                }
                i37 = i14 & 65536;
                if (i37 != 0) {
                    i32 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c1086gP.h(i11)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i32 |= i38;
                }
                i39 = i14 & 131072;
                if (i39 != 0) {
                    i32 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c1086gP.K(kVar2)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i32 |= i40;
                }
                if ((i13 & 100663296) != 0) {
                    if ((i14 & 262144) == 0) {
                        i46 = 33554432;
                    } else {
                        i46 = 33554432;
                    }
                    i32 |= i46;
                }
                if ((i13 & 805306368) != 0) {
                    if ((i14 & 524288) == 0) {
                        i45 = 268435456;
                    } else {
                        i45 = 268435456;
                    }
                    i32 |= i45;
                }
                if ((i50 & 306783379) == 306783378) {
                    z14 = true;
                    z15 = true;
                } else {
                    z14 = true;
                    z15 = true;
                }
                if (c1086gP.C(i50 & 1, z15)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i16 != 0) {
                            z20 = z14;
                        } else {
                            z20 = z10;
                        }
                        if (i18 != 0) {
                            z21 = false;
                        } else {
                            z21 = z11;
                        }
                        if ((i14 & 32) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                            i50 &= -458753;
                        } else {
                            f12 = f10;
                        }
                        if (i20 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i22 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i26 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            z22 = false;
                        } else {
                            z22 = z12;
                        }
                        if (i30 != 0) {
                            e12 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e12 = e10;
                        }
                        if (i33 != 0) {
                            kVar5 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar5 = kVar;
                        }
                        if ((8192 & i14) != 0) {
                            kVar6 = null;
                            jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                            i32 &= -7169;
                        } else {
                            kVar6 = null;
                            jVar3 = jVar;
                        }
                        if (i35 != 0) {
                            z23 = false;
                        } else {
                            z23 = z13;
                        }
                        if ((i14 & 32768) != 0) {
                            if (z23) {
                                i43 = 1;
                            } else {
                                i43 = BrazeLogger.SUPPRESS;
                            }
                            i32 &= -458753;
                        } else {
                            i43 = i10;
                        }
                        if (i37 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i11;
                        }
                        if (i39 == 0) {
                            kVar6 = kVar2;
                        }
                        if ((i14 & 262144) != 0) {
                            TextFieldDefaults textFieldDefaults1115 = TextFieldDefaults.f11834a;
                            p270w.a aVar1115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar1116 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar1115, null, null, aVar1116, aVar1116, 3);
                            i32 &= -234881025;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i14 & 524288) != 0) {
                            TextFieldDefaults textFieldDefaults1116 = TextFieldDefaults.f11834a;
                            i32 &= -1879048193;
                            uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        } else {
                            uB = u10;
                        }
                        i41 = i43;
                        z24 = z23;
                        i44 = i32;
                        pVar13 = pVar9;
                    } else {
                        if (i51 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i16 != 0) {
                            z20 = z14;
                        } else {
                            z20 = z10;
                        }
                        if (i18 != 0) {
                            z21 = false;
                        } else {
                            z21 = z11;
                        }
                        if ((i14 & 32) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                            i50 &= -458753;
                        } else {
                            f12 = f10;
                        }
                        if (i20 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i22 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i26 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            z22 = false;
                        } else {
                            z22 = z12;
                        }
                        if (i30 != 0) {
                            e12 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e12 = e10;
                        }
                        if (i33 != 0) {
                            kVar5 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar5 = kVar;
                        }
                        if ((8192 & i14) != 0) {
                            kVar6 = null;
                            jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                            i32 &= -7169;
                        } else {
                            kVar6 = null;
                            jVar3 = jVar;
                        }
                        if (i35 != 0) {
                            z23 = false;
                        } else {
                            z23 = z13;
                        }
                        if ((i14 & 32768) != 0) {
                            if (z23) {
                                i43 = 1;
                            } else {
                                i43 = BrazeLogger.SUPPRESS;
                            }
                            i32 &= -458753;
                        } else {
                            i43 = i10;
                        }
                        if (i37 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i11;
                        }
                        if (i39 == 0) {
                            kVar6 = kVar2;
                        }
                        if ((i14 & 262144) != 0) {
                            TextFieldDefaults textFieldDefaults1117 = TextFieldDefaults.f11834a;
                            p270w.a aVar1117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar1118 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar1117, null, null, aVar1118, aVar1118, 3);
                            i32 &= -234881025;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i14 & 524288) != 0) {
                            TextFieldDefaults textFieldDefaults1118 = TextFieldDefaults.f11834a;
                            i32 &= -1879048193;
                            uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        } else {
                            uB = u10;
                        }
                        i41 = i43;
                        z24 = z23;
                        i44 = i32;
                        pVar13 = pVar9;
                    }
                    c1086gP.U();
                    if (kVar6 == null) {
                        c1086gP.L(-1665803660);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        kVar7 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        c1086gP.L(-53736253);
                        c1086gP.T(false);
                        kVar7 = kVar6;
                    }
                    c1086gP.L(-53730507);
                    jB = f12.b();
                    if (jB == 16) {
                        jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                    }
                    androidx.compose.foundation.text.j jVar13 = jVar3;
                    c1086gP.T(false);
                    androidx.compose.ui.text.F fD10 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final float f11119 = TextFieldDefaults.f11838e;
                    final float f111110 = TextFieldDefaults.f11837d;
                    androidx.compose.ui.text.F f111111 = f12;
                    final boolean z2111110 = z20;
                    final boolean z2111111 = z22;
                    final androidx.compose.foundation.interaction.k kVar116 = kVar7;
                    final U u1110 = uB;
                    hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.q
                        public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                            N0 n0I;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            num.intValue();
                            interfaceC1084f3.L(1398930845);
                            boolean z2111112 = z2111110;
                            boolean z2111113 = z2111111;
                            androidx.compose.foundation.interaction.j jVar14 = kVar116;
                            U u1111 = u1110;
                            float f111112 = f11119;
                            float f111113 = f111110;
                            X xA = androidx.compose.foundation.interaction.f.a(jVar14, interfaceC1084f3, 0);
                            N0<androidx.compose.ui.graphics.H> n0E = u1111.e(z2111112, z2111113, jVar14, interfaceC1084f3, 0);
                            if (!((Boolean) xA.getValue()).booleanValue()) {
                                f111112 = f111113;
                            }
                            if (z2111112) {
                                interfaceC1084f3.L(773088894);
                                n0I = C0902b.a(f111112, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                                interfaceC1084f3.D();
                            } else {
                                interfaceC1084f3.L(773193116);
                                n0I = J0.i(new p013b0.f(f111113), interfaceC1084f3);
                                interfaceC1084f3.D();
                            }
                            X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                            androidx.compose.ui.h.a aVar1119 = androidx.compose.ui.h.a.f13984b;
                            final C0937i c0937i = (C0937i) xI.getValue();
                            float f111114 = TextFieldKt.f11841a;
                            final float f111115 = c0937i.f10065a;
                            androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar1119, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.c cVar) {
                                    J.c cVar2 = cVar;
                                    cVar2.A1();
                                    if (!p013b0.f.a(f111115, 0.0f)) {
                                        float density = cVar2.getDensity() * f111115;
                                        float fB = I.h.b(cVar2.j()) - (density / 2);
                                        cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            });
                            interfaceC1084f3.D();
                            return hVarC;
                        }
                    });
                    strK = P3.d.k(c1086gP, 3);
                    float f111112 = TextFieldImplKt.f11839a;
                    if (z22) {
                        hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                String str2 = strK;
                                Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                wVar.e(SemanticsProperties.f15144J, str2);
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                    final boolean z2111112 = z20;
                    final boolean z2111113 = z24;
                    final androidx.compose.ui.text.input.E e112 = e12;
                    final androidx.compose.foundation.interaction.k kVar117 = kVar7;
                    final boolean z2111114 = z22;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111110 = pVar13;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111112 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111113 = pVar12;
                    final l0 l0Var12 = l0VarB;
                    final U u1111 = uB;
                    int i511 = i44 << 12;
                    BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD10, kVar5, jVar13, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // Ia.q
                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar111114, InterfaceC1084f interfaceC1084f2, Integer num) {
                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar111115 = pVar111114;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= interfaceC1084f3.k(pVar111115) ? 4 : 2;
                            }
                            int i512 = iIntValue;
                            if (interfaceC1084f3.C(i512 & 1, (i512 & 19) != 18)) {
                                TextFieldDefaults.f11834a.a(str, pVar111115, z2111112, z2111113, e112, kVar117, z2111114, pVar111110, pVar111111, pVar111112, pVar111113, l0Var12, u1111, null, interfaceC1084f3, (i512 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i511) | (29360128 & i511) | (234881024 & i511) | (i511 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                    jVar2 = jVar13;
                    pVar8 = pVar12;
                    e11 = e12;
                    z19 = z24;
                    hVar2 = hVar3;
                    u11 = uB;
                    z17 = z21;
                    kVar4 = kVar6;
                    l0Var2 = l0VarB;
                    z18 = z22;
                    kVar3 = kVar5;
                    pVar7 = pVar11;
                    f11 = f111111;
                    z16 = z20;
                    pVar6 = pVar10;
                    pVar5 = pVar13;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    z16 = z10;
                    z17 = z11;
                    f11 = f10;
                    pVar5 = pVar;
                    pVar6 = pVar2;
                    pVar7 = pVar3;
                    pVar8 = pVar4;
                    z18 = z12;
                    e11 = e10;
                    kVar3 = kVar;
                    jVar2 = jVar;
                    z19 = z13;
                    i41 = i10;
                    i42 = i11;
                    kVar4 = kVar2;
                    l0Var2 = l0Var;
                    u11 = u10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i50 |= 24576;
            if ((i12 & 196608) != 0) {
                if ((i14 & 32) == 0) {
                    i49 = 65536;
                } else {
                    i49 = 65536;
                }
                i50 |= i49;
            }
            i20 = i14 & 64;
            if (i20 != 0) {
                i50 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c1086gP.k(pVar)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i50 |= i21;
            }
            i22 = i14 & 128;
            if (i22 != 0) {
                i50 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c1086gP.k(pVar2)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i50 |= i23;
            }
            i24 = i14 & 256;
            if (i24 != 0) {
                i50 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (c1086gP.k(pVar3)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i50 |= i25;
            }
            i26 = i14 & 512;
            if (i26 != 0) {
                i50 |= 805306368;
            } else if ((i12 & 805306368) == 0) {
                if (c1086gP.k(pVar4)) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
                i50 |= i27;
            }
            i28 = i14 & 1024;
            if (i28 != 0) {
                i29 = i13 | 6;
            } else if ((i13 & 6) == 0) {
                i29 = i13 | (c1086gP.c(z12) ? 4 : 2);
            } else {
                i29 = i13;
            }
            i30 = i14 & 2048;
            if (i30 != 0) {
                i29 |= 48;
            } else if ((i13 & 48) == 0) {
                if (c1086gP.K(e10)) {
                    i31 = 32;
                } else {
                    i31 = 16;
                }
                i29 |= i31;
            }
            i32 = i29;
            i33 = i14 & 4096;
            if (i33 != 0) {
                i32 |= 384;
            } else if ((i13 & 384) != 0) {
                if (c1086gP.K(kVar)) {
                    i34 = 256;
                } else {
                    i34 = 128;
                }
                i32 |= i34;
            }
            if ((i13 & 3072) != 0) {
                if ((i14 & 8192) == 0) {
                    i48 = 1024;
                } else {
                    i48 = 1024;
                }
                i32 |= i48;
            }
            i35 = i14 & 16384;
            if (i35 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c1086gP.c(z13)) {
                        i36 = 16384;
                    } else {
                        i36 = 8192;
                    }
                    i32 |= i36;
                }
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i47 = 65536;
                    } else {
                        i47 = 65536;
                    }
                    i32 |= i47;
                }
                i37 = i14 & 65536;
                if (i37 != 0) {
                    i32 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c1086gP.h(i11)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i32 |= i38;
                }
                i39 = i14 & 131072;
                if (i39 != 0) {
                    i32 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c1086gP.K(kVar2)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i32 |= i40;
                }
                if ((i13 & 100663296) != 0) {
                    if ((i14 & 262144) == 0) {
                        i46 = 33554432;
                    } else {
                        i46 = 33554432;
                    }
                    i32 |= i46;
                }
                if ((i13 & 805306368) != 0) {
                    if ((i14 & 524288) == 0) {
                        i45 = 268435456;
                    } else {
                        i45 = 268435456;
                    }
                    i32 |= i45;
                }
                if ((i50 & 306783379) == 306783378) {
                    z14 = true;
                    z15 = true;
                } else {
                    z14 = true;
                    z15 = true;
                }
                if (c1086gP.C(i50 & 1, z15)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i16 != 0) {
                            z20 = z14;
                        } else {
                            z20 = z10;
                        }
                        if (i18 != 0) {
                            z21 = false;
                        } else {
                            z21 = z11;
                        }
                        if ((i14 & 32) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                            i50 &= -458753;
                        } else {
                            f12 = f10;
                        }
                        if (i20 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i22 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i26 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            z22 = false;
                        } else {
                            z22 = z12;
                        }
                        if (i30 != 0) {
                            e12 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e12 = e10;
                        }
                        if (i33 != 0) {
                            kVar5 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar5 = kVar;
                        }
                        if ((8192 & i14) != 0) {
                            kVar6 = null;
                            jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                            i32 &= -7169;
                        } else {
                            kVar6 = null;
                            jVar3 = jVar;
                        }
                        if (i35 != 0) {
                            z23 = false;
                        } else {
                            z23 = z13;
                        }
                        if ((i14 & 32768) != 0) {
                            if (z23) {
                                i43 = 1;
                            } else {
                                i43 = BrazeLogger.SUPPRESS;
                            }
                            i32 &= -458753;
                        } else {
                            i43 = i10;
                        }
                        if (i37 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i11;
                        }
                        if (i39 == 0) {
                            kVar6 = kVar2;
                        }
                        if ((i14 & 262144) != 0) {
                            TextFieldDefaults textFieldDefaults1119 = TextFieldDefaults.f11834a;
                            p270w.a aVar1119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar11110 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar1119, null, null, aVar11110, aVar11110, 3);
                            i32 &= -234881025;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i14 & 524288) != 0) {
                            TextFieldDefaults textFieldDefaults11110 = TextFieldDefaults.f11834a;
                            i32 &= -1879048193;
                            uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        } else {
                            uB = u10;
                        }
                        i41 = i43;
                        z24 = z23;
                        i44 = i32;
                        pVar13 = pVar9;
                    } else {
                        if (i51 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i16 != 0) {
                            z20 = z14;
                        } else {
                            z20 = z10;
                        }
                        if (i18 != 0) {
                            z21 = false;
                        } else {
                            z21 = z11;
                        }
                        if ((i14 & 32) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                            i50 &= -458753;
                        } else {
                            f12 = f10;
                        }
                        if (i20 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i22 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i26 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            z22 = false;
                        } else {
                            z22 = z12;
                        }
                        if (i30 != 0) {
                            e12 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e12 = e10;
                        }
                        if (i33 != 0) {
                            kVar5 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar5 = kVar;
                        }
                        if ((8192 & i14) != 0) {
                            kVar6 = null;
                            jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                            i32 &= -7169;
                        } else {
                            kVar6 = null;
                            jVar3 = jVar;
                        }
                        if (i35 != 0) {
                            z23 = false;
                        } else {
                            z23 = z13;
                        }
                        if ((i14 & 32768) != 0) {
                            if (z23) {
                                i43 = 1;
                            } else {
                                i43 = BrazeLogger.SUPPRESS;
                            }
                            i32 &= -458753;
                        } else {
                            i43 = i10;
                        }
                        if (i37 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i11;
                        }
                        if (i39 == 0) {
                            kVar6 = kVar2;
                        }
                        if ((i14 & 262144) != 0) {
                            TextFieldDefaults textFieldDefaults11111 = TextFieldDefaults.f11834a;
                            p270w.a aVar11111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar11112 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar11111, null, null, aVar11112, aVar11112, 3);
                            i32 &= -234881025;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i14 & 524288) != 0) {
                            TextFieldDefaults textFieldDefaults11112 = TextFieldDefaults.f11834a;
                            i32 &= -1879048193;
                            uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        } else {
                            uB = u10;
                        }
                        i41 = i43;
                        z24 = z23;
                        i44 = i32;
                        pVar13 = pVar9;
                    }
                    c1086gP.U();
                    if (kVar6 == null) {
                        c1086gP.L(-1665803660);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        kVar7 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        c1086gP.L(-53736253);
                        c1086gP.T(false);
                        kVar7 = kVar6;
                    }
                    c1086gP.L(-53730507);
                    jB = f12.b();
                    if (jB == 16) {
                        jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                    }
                    androidx.compose.foundation.text.j jVar14 = jVar3;
                    c1086gP.T(false);
                    androidx.compose.ui.text.F fD11 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final float f111113 = TextFieldDefaults.f11838e;
                    final float f111114 = TextFieldDefaults.f11837d;
                    androidx.compose.ui.text.F f111115 = f12;
                    final boolean z2111115 = z20;
                    final boolean z2111116 = z22;
                    final androidx.compose.foundation.interaction.k kVar118 = kVar7;
                    final U u1112 = uB;
                    hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.q
                        public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                            N0 n0I;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            num.intValue();
                            interfaceC1084f3.L(1398930845);
                            boolean z2111117 = z2111115;
                            boolean z2111118 = z2111116;
                            androidx.compose.foundation.interaction.j jVar15 = kVar118;
                            U u1113 = u1112;
                            float f111116 = f111113;
                            float f111117 = f111114;
                            X xA = androidx.compose.foundation.interaction.f.a(jVar15, interfaceC1084f3, 0);
                            N0<androidx.compose.ui.graphics.H> n0E = u1113.e(z2111117, z2111118, jVar15, interfaceC1084f3, 0);
                            if (!((Boolean) xA.getValue()).booleanValue()) {
                                f111116 = f111117;
                            }
                            if (z2111117) {
                                interfaceC1084f3.L(773088894);
                                n0I = C0902b.a(f111116, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                                interfaceC1084f3.D();
                            } else {
                                interfaceC1084f3.L(773193116);
                                n0I = J0.i(new p013b0.f(f111117), interfaceC1084f3);
                                interfaceC1084f3.D();
                            }
                            X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                            androidx.compose.ui.h.a aVar11113 = androidx.compose.ui.h.a.f13984b;
                            final C0937i c0937i = (C0937i) xI.getValue();
                            float f111118 = TextFieldKt.f11841a;
                            final float f111119 = c0937i.f10065a;
                            androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar11113, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.c cVar) {
                                    J.c cVar2 = cVar;
                                    cVar2.A1();
                                    if (!p013b0.f.a(f111119, 0.0f)) {
                                        float density = cVar2.getDensity() * f111119;
                                        float fB = I.h.b(cVar2.j()) - (density / 2);
                                        cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            });
                            interfaceC1084f3.D();
                            return hVarC;
                        }
                    });
                    strK = P3.d.k(c1086gP, 3);
                    float f111116 = TextFieldImplKt.f11839a;
                    if (z22) {
                        hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                String str2 = strK;
                                Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                wVar.e(SemanticsProperties.f15144J, str2);
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                    final boolean z2111117 = z20;
                    final boolean z2111118 = z24;
                    final androidx.compose.ui.text.input.E e113 = e12;
                    final androidx.compose.foundation.interaction.k kVar119 = kVar7;
                    final boolean z2111119 = z22;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111114 = pVar13;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111115 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111116 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111117 = pVar12;
                    final l0 l0Var13 = l0VarB;
                    final U u1113 = uB;
                    int i512 = i44 << 12;
                    BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD11, kVar5, jVar14, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // Ia.q
                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar111118, InterfaceC1084f interfaceC1084f2, Integer num) {
                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar111119 = pVar111118;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= interfaceC1084f3.k(pVar111119) ? 4 : 2;
                            }
                            int i513 = iIntValue;
                            if (interfaceC1084f3.C(i513 & 1, (i513 & 19) != 18)) {
                                TextFieldDefaults.f11834a.a(str, pVar111119, z2111117, z2111118, e113, kVar119, z2111119, pVar111114, pVar111115, pVar111116, pVar111117, l0Var13, u1113, null, interfaceC1084f3, (i513 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i512) | (29360128 & i512) | (234881024 & i512) | (i512 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                    jVar2 = jVar14;
                    pVar8 = pVar12;
                    e11 = e12;
                    z19 = z24;
                    hVar2 = hVar3;
                    u11 = uB;
                    z17 = z21;
                    kVar4 = kVar6;
                    l0Var2 = l0VarB;
                    z18 = z22;
                    kVar3 = kVar5;
                    pVar7 = pVar11;
                    f11 = f111115;
                    z16 = z20;
                    pVar6 = pVar10;
                    pVar5 = pVar13;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    z16 = z10;
                    z17 = z11;
                    f11 = f10;
                    pVar5 = pVar;
                    pVar6 = pVar2;
                    pVar7 = pVar3;
                    pVar8 = pVar4;
                    z18 = z12;
                    e11 = e10;
                    kVar3 = kVar;
                    jVar2 = jVar;
                    z19 = z13;
                    i41 = i10;
                    i42 = i11;
                    kVar4 = kVar2;
                    l0Var2 = l0Var;
                    u11 = u10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i32 |= 24576;
            if ((i13 & 196608) != 0) {
                if ((i14 & 32768) == 0) {
                    i47 = 65536;
                } else {
                    i47 = 65536;
                }
                i32 |= i47;
            }
            i37 = i14 & 65536;
            if (i37 != 0) {
                i32 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c1086gP.h(i11)) {
                    i38 = 1048576;
                } else {
                    i38 = 524288;
                }
                i32 |= i38;
            }
            i39 = i14 & 131072;
            if (i39 != 0) {
                i32 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c1086gP.K(kVar2)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i32 |= i40;
            }
            if ((i13 & 100663296) != 0) {
                if ((i14 & 262144) == 0) {
                    i46 = 33554432;
                } else {
                    i46 = 33554432;
                }
                i32 |= i46;
            }
            if ((i13 & 805306368) != 0) {
                if ((i14 & 524288) == 0) {
                    i45 = 268435456;
                } else {
                    i45 = 268435456;
                }
                i32 |= i45;
            }
            if ((i50 & 306783379) == 306783378) {
                z14 = true;
                z15 = true;
            } else {
                z14 = true;
                z15 = true;
            }
            if (c1086gP.C(i50 & 1, z15)) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i16 != 0) {
                        z20 = z14;
                    } else {
                        z20 = z10;
                    }
                    if (i18 != 0) {
                        z21 = false;
                    } else {
                        z21 = z11;
                    }
                    if ((i14 & 32) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                        i50 &= -458753;
                    } else {
                        f12 = f10;
                    }
                    if (i20 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i22 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i26 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        z22 = false;
                    } else {
                        z22 = z12;
                    }
                    if (i30 != 0) {
                        e12 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e12 = e10;
                    }
                    if (i33 != 0) {
                        kVar5 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar5 = kVar;
                    }
                    if ((8192 & i14) != 0) {
                        kVar6 = null;
                        jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                        i32 &= -7169;
                    } else {
                        kVar6 = null;
                        jVar3 = jVar;
                    }
                    if (i35 != 0) {
                        z23 = false;
                    } else {
                        z23 = z13;
                    }
                    if ((i14 & 32768) != 0) {
                        if (z23) {
                            i43 = 1;
                        } else {
                            i43 = BrazeLogger.SUPPRESS;
                        }
                        i32 &= -458753;
                    } else {
                        i43 = i10;
                    }
                    if (i37 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i11;
                    }
                    if (i39 == 0) {
                        kVar6 = kVar2;
                    }
                    if ((i14 & 262144) != 0) {
                        TextFieldDefaults textFieldDefaults11113 = TextFieldDefaults.f11834a;
                        p270w.a aVar11113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar11114 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar11113, null, null, aVar11114, aVar11114, 3);
                        i32 &= -234881025;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i14 & 524288) != 0) {
                        TextFieldDefaults textFieldDefaults11114 = TextFieldDefaults.f11834a;
                        i32 &= -1879048193;
                        uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                    } else {
                        uB = u10;
                    }
                    i41 = i43;
                    z24 = z23;
                    i44 = i32;
                    pVar13 = pVar9;
                } else {
                    if (i51 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i16 != 0) {
                        z20 = z14;
                    } else {
                        z20 = z10;
                    }
                    if (i18 != 0) {
                        z21 = false;
                    } else {
                        z21 = z11;
                    }
                    if ((i14 & 32) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                        i50 &= -458753;
                    } else {
                        f12 = f10;
                    }
                    if (i20 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i22 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i26 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        z22 = false;
                    } else {
                        z22 = z12;
                    }
                    if (i30 != 0) {
                        e12 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e12 = e10;
                    }
                    if (i33 != 0) {
                        kVar5 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar5 = kVar;
                    }
                    if ((8192 & i14) != 0) {
                        kVar6 = null;
                        jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                        i32 &= -7169;
                    } else {
                        kVar6 = null;
                        jVar3 = jVar;
                    }
                    if (i35 != 0) {
                        z23 = false;
                    } else {
                        z23 = z13;
                    }
                    if ((i14 & 32768) != 0) {
                        if (z23) {
                            i43 = 1;
                        } else {
                            i43 = BrazeLogger.SUPPRESS;
                        }
                        i32 &= -458753;
                    } else {
                        i43 = i10;
                    }
                    if (i37 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i11;
                    }
                    if (i39 == 0) {
                        kVar6 = kVar2;
                    }
                    if ((i14 & 262144) != 0) {
                        TextFieldDefaults textFieldDefaults11115 = TextFieldDefaults.f11834a;
                        p270w.a aVar11115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar11116 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar11115, null, null, aVar11116, aVar11116, 3);
                        i32 &= -234881025;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i14 & 524288) != 0) {
                        TextFieldDefaults textFieldDefaults11116 = TextFieldDefaults.f11834a;
                        i32 &= -1879048193;
                        uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                    } else {
                        uB = u10;
                    }
                    i41 = i43;
                    z24 = z23;
                    i44 = i32;
                    pVar13 = pVar9;
                }
                c1086gP.U();
                if (kVar6 == null) {
                    c1086gP.L(-1665803660);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    kVar7 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    c1086gP.L(-53736253);
                    c1086gP.T(false);
                    kVar7 = kVar6;
                }
                c1086gP.L(-53730507);
                jB = f12.b();
                if (jB == 16) {
                    jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                }
                androidx.compose.foundation.text.j jVar15 = jVar3;
                c1086gP.T(false);
                androidx.compose.ui.text.F fD12 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                final float f111117 = TextFieldDefaults.f11838e;
                final float f111118 = TextFieldDefaults.f11837d;
                androidx.compose.ui.text.F f111119 = f12;
                final boolean z21111110 = z20;
                final boolean z21111111 = z22;
                final androidx.compose.foundation.interaction.k kVar1110 = kVar7;
                final U u1114 = uB;
                hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // Ia.q
                    public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                        N0 n0I;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        interfaceC1084f3.L(1398930845);
                        boolean z21111112 = z21111110;
                        boolean z21111113 = z21111111;
                        androidx.compose.foundation.interaction.j jVar16 = kVar1110;
                        U u1115 = u1114;
                        float f1111110 = f111117;
                        float f1111111 = f111118;
                        X xA = androidx.compose.foundation.interaction.f.a(jVar16, interfaceC1084f3, 0);
                        N0<androidx.compose.ui.graphics.H> n0E = u1115.e(z21111112, z21111113, jVar16, interfaceC1084f3, 0);
                        if (!((Boolean) xA.getValue()).booleanValue()) {
                            f1111110 = f1111111;
                        }
                        if (z21111112) {
                            interfaceC1084f3.L(773088894);
                            n0I = C0902b.a(f1111110, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                            interfaceC1084f3.D();
                        } else {
                            interfaceC1084f3.L(773193116);
                            n0I = J0.i(new p013b0.f(f1111111), interfaceC1084f3);
                            interfaceC1084f3.D();
                        }
                        X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                        androidx.compose.ui.h.a aVar11117 = androidx.compose.ui.h.a.f13984b;
                        final C0937i c0937i = (C0937i) xI.getValue();
                        float f1111112 = TextFieldKt.f11841a;
                        final float f1111113 = c0937i.f10065a;
                        androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar11117, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.c cVar) {
                                J.c cVar2 = cVar;
                                cVar2.A1();
                                if (!p013b0.f.a(f1111113, 0.0f)) {
                                    float density = cVar2.getDensity() * f1111113;
                                    float fB = I.h.b(cVar2.j()) - (density / 2);
                                    cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                }
                                return p293xa.r.f47939a;
                            }
                        });
                        interfaceC1084f3.D();
                        return hVarC;
                    }
                });
                strK = P3.d.k(c1086gP, 3);
                float f1111110 = TextFieldImplKt.f11839a;
                if (z22) {
                    hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            String str2 = strK;
                            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                            wVar.e(SemanticsProperties.f15144J, str2);
                            return p293xa.r.f47939a;
                        }
                    });
                }
                final boolean z21111112 = z20;
                final boolean z21111113 = z24;
                final androidx.compose.ui.text.input.E e114 = e12;
                final androidx.compose.foundation.interaction.k kVar1111 = kVar7;
                final boolean z21111114 = z22;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111118 = pVar13;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111119 = pVar10;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111110 = pVar11;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111 = pVar12;
                final l0 l0Var14 = l0VarB;
                final U u1115 = uB;
                int i513 = i44 << 12;
                BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD12, kVar5, jVar15, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // Ia.q
                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1111112, InterfaceC1084f interfaceC1084f2, Integer num) {
                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1111113 = pVar1111112;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= interfaceC1084f3.k(pVar1111113) ? 4 : 2;
                        }
                        int i514 = iIntValue;
                        if (interfaceC1084f3.C(i514 & 1, (i514 & 19) != 18)) {
                            TextFieldDefaults.f11834a.a(str, pVar1111113, z21111112, z21111113, e114, kVar1111, z21111114, pVar111118, pVar111119, pVar1111110, pVar1111111, l0Var14, u1115, null, interfaceC1084f3, (i514 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i513) | (29360128 & i513) | (234881024 & i513) | (i513 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                jVar2 = jVar15;
                pVar8 = pVar12;
                e11 = e12;
                z19 = z24;
                hVar2 = hVar3;
                u11 = uB;
                z17 = z21;
                kVar4 = kVar6;
                l0Var2 = l0VarB;
                z18 = z22;
                kVar3 = kVar5;
                pVar7 = pVar11;
                f11 = f111119;
                z16 = z20;
                pVar6 = pVar10;
                pVar5 = pVar13;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                z16 = z10;
                z17 = z11;
                f11 = f10;
                pVar5 = pVar;
                pVar6 = pVar2;
                pVar7 = pVar3;
                pVar8 = pVar4;
                z18 = z12;
                e11 = e10;
                kVar3 = kVar;
                jVar2 = jVar;
                z19 = z13;
                i41 = i10;
                i42 = i11;
                kVar4 = kVar2;
                l0Var2 = l0Var;
                u11 = u10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i50 |= 3072;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i12 & 24576) == 0) {
                if (c1086gP.c(z11)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i50 |= i19;
            }
            if ((i12 & 196608) != 0) {
                if ((i14 & 32) == 0) {
                    i49 = 65536;
                } else {
                    i49 = 65536;
                }
                i50 |= i49;
            }
            i20 = i14 & 64;
            if (i20 != 0) {
                i50 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c1086gP.k(pVar)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i50 |= i21;
            }
            i22 = i14 & 128;
            if (i22 != 0) {
                i50 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c1086gP.k(pVar2)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i50 |= i23;
            }
            i24 = i14 & 256;
            if (i24 != 0) {
                i50 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (c1086gP.k(pVar3)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i50 |= i25;
            }
            i26 = i14 & 512;
            if (i26 != 0) {
                i50 |= 805306368;
            } else if ((i12 & 805306368) == 0) {
                if (c1086gP.k(pVar4)) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
                i50 |= i27;
            }
            i28 = i14 & 1024;
            if (i28 != 0) {
                i29 = i13 | 6;
            } else if ((i13 & 6) == 0) {
                i29 = i13 | (c1086gP.c(z12) ? 4 : 2);
            } else {
                i29 = i13;
            }
            i30 = i14 & 2048;
            if (i30 != 0) {
                i29 |= 48;
            } else if ((i13 & 48) == 0) {
                if (c1086gP.K(e10)) {
                    i31 = 32;
                } else {
                    i31 = 16;
                }
                i29 |= i31;
            }
            i32 = i29;
            i33 = i14 & 4096;
            if (i33 != 0) {
                i32 |= 384;
            } else if ((i13 & 384) != 0) {
                if (c1086gP.K(kVar)) {
                    i34 = 256;
                } else {
                    i34 = 128;
                }
                i32 |= i34;
            }
            if ((i13 & 3072) != 0) {
                if ((i14 & 8192) == 0) {
                    i48 = 1024;
                } else {
                    i48 = 1024;
                }
                i32 |= i48;
            }
            i35 = i14 & 16384;
            if (i35 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c1086gP.c(z13)) {
                        i36 = 16384;
                    } else {
                        i36 = 8192;
                    }
                    i32 |= i36;
                }
                if ((i13 & 196608) != 0) {
                    if ((i14 & 32768) == 0) {
                        i47 = 65536;
                    } else {
                        i47 = 65536;
                    }
                    i32 |= i47;
                }
                i37 = i14 & 65536;
                if (i37 != 0) {
                    i32 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c1086gP.h(i11)) {
                        i38 = 1048576;
                    } else {
                        i38 = 524288;
                    }
                    i32 |= i38;
                }
                i39 = i14 & 131072;
                if (i39 != 0) {
                    i32 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c1086gP.K(kVar2)) {
                        i40 = 8388608;
                    } else {
                        i40 = 4194304;
                    }
                    i32 |= i40;
                }
                if ((i13 & 100663296) != 0) {
                    if ((i14 & 262144) == 0) {
                        i46 = 33554432;
                    } else {
                        i46 = 33554432;
                    }
                    i32 |= i46;
                }
                if ((i13 & 805306368) != 0) {
                    if ((i14 & 524288) == 0) {
                        i45 = 268435456;
                    } else {
                        i45 = 268435456;
                    }
                    i32 |= i45;
                }
                if ((i50 & 306783379) == 306783378) {
                    z14 = true;
                    z15 = true;
                } else {
                    z14 = true;
                    z15 = true;
                }
                if (c1086gP.C(i50 & 1, z15)) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i51 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i16 != 0) {
                            z20 = z14;
                        } else {
                            z20 = z10;
                        }
                        if (i18 != 0) {
                            z21 = false;
                        } else {
                            z21 = z11;
                        }
                        if ((i14 & 32) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                            i50 &= -458753;
                        } else {
                            f12 = f10;
                        }
                        if (i20 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i22 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i26 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            z22 = false;
                        } else {
                            z22 = z12;
                        }
                        if (i30 != 0) {
                            e12 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e12 = e10;
                        }
                        if (i33 != 0) {
                            kVar5 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar5 = kVar;
                        }
                        if ((8192 & i14) != 0) {
                            kVar6 = null;
                            jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                            i32 &= -7169;
                        } else {
                            kVar6 = null;
                            jVar3 = jVar;
                        }
                        if (i35 != 0) {
                            z23 = false;
                        } else {
                            z23 = z13;
                        }
                        if ((i14 & 32768) != 0) {
                            if (z23) {
                                i43 = 1;
                            } else {
                                i43 = BrazeLogger.SUPPRESS;
                            }
                            i32 &= -458753;
                        } else {
                            i43 = i10;
                        }
                        if (i37 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i11;
                        }
                        if (i39 == 0) {
                            kVar6 = kVar2;
                        }
                        if ((i14 & 262144) != 0) {
                            TextFieldDefaults textFieldDefaults11117 = TextFieldDefaults.f11834a;
                            p270w.a aVar11117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar11118 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar11117, null, null, aVar11118, aVar11118, 3);
                            i32 &= -234881025;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i14 & 524288) != 0) {
                            TextFieldDefaults textFieldDefaults11118 = TextFieldDefaults.f11834a;
                            i32 &= -1879048193;
                            uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        } else {
                            uB = u10;
                        }
                        i41 = i43;
                        z24 = z23;
                        i44 = i32;
                        pVar13 = pVar9;
                    } else {
                        if (i51 != 0) {
                            hVar3 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar3 = hVar;
                        }
                        if (i16 != 0) {
                            z20 = z14;
                        } else {
                            z20 = z10;
                        }
                        if (i18 != 0) {
                            z21 = false;
                        } else {
                            z21 = z11;
                        }
                        if ((i14 & 32) != 0) {
                            f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                            i50 &= -458753;
                        } else {
                            f12 = f10;
                        }
                        if (i20 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar;
                        }
                        if (i22 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar2;
                        }
                        if (i24 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar3;
                        }
                        if (i26 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar4;
                        }
                        if (i28 != 0) {
                            z22 = false;
                        } else {
                            z22 = z12;
                        }
                        if (i30 != 0) {
                            e12 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e12 = e10;
                        }
                        if (i33 != 0) {
                            kVar5 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar5 = kVar;
                        }
                        if ((8192 & i14) != 0) {
                            kVar6 = null;
                            jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                            i32 &= -7169;
                        } else {
                            kVar6 = null;
                            jVar3 = jVar;
                        }
                        if (i35 != 0) {
                            z23 = false;
                        } else {
                            z23 = z13;
                        }
                        if ((i14 & 32768) != 0) {
                            if (z23) {
                                i43 = 1;
                            } else {
                                i43 = BrazeLogger.SUPPRESS;
                            }
                            i32 &= -458753;
                        } else {
                            i43 = i10;
                        }
                        if (i37 != 0) {
                            i42 = 1;
                        } else {
                            i42 = i11;
                        }
                        if (i39 == 0) {
                            kVar6 = kVar2;
                        }
                        if ((i14 & 262144) != 0) {
                            TextFieldDefaults textFieldDefaults11119 = TextFieldDefaults.f11834a;
                            p270w.a aVar11119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                            w.c.a aVar111110 = p270w.c.f47677a;
                            l0VarB = p270w.a.b(aVar11119, null, null, aVar111110, aVar111110, 3);
                            i32 &= -234881025;
                        } else {
                            l0VarB = l0Var;
                        }
                        if ((i14 & 524288) != 0) {
                            TextFieldDefaults textFieldDefaults111110 = TextFieldDefaults.f11834a;
                            i32 &= -1879048193;
                            uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                        } else {
                            uB = u10;
                        }
                        i41 = i43;
                        z24 = z23;
                        i44 = i32;
                        pVar13 = pVar9;
                    }
                    c1086gP.U();
                    if (kVar6 == null) {
                        c1086gP.L(-1665803660);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        c1086gP.T(false);
                        kVar7 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        c1086gP.L(-53736253);
                        c1086gP.T(false);
                        kVar7 = kVar6;
                    }
                    c1086gP.L(-53730507);
                    jB = f12.b();
                    if (jB == 16) {
                        jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                    }
                    androidx.compose.foundation.text.j jVar16 = jVar3;
                    c1086gP.T(false);
                    androidx.compose.ui.text.F fD13 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final float f1111111 = TextFieldDefaults.f11838e;
                    final float f1111112 = TextFieldDefaults.f11837d;
                    androidx.compose.ui.text.F f1111113 = f12;
                    final boolean z21111115 = z20;
                    final boolean z21111116 = z22;
                    final androidx.compose.foundation.interaction.k kVar1112 = kVar7;
                    final U u1116 = uB;
                    hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // Ia.q
                        public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                            N0 n0I;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            num.intValue();
                            interfaceC1084f3.L(1398930845);
                            boolean z21111117 = z21111115;
                            boolean z21111118 = z21111116;
                            androidx.compose.foundation.interaction.j jVar17 = kVar1112;
                            U u1117 = u1116;
                            float f1111114 = f1111111;
                            float f1111115 = f1111112;
                            X xA = androidx.compose.foundation.interaction.f.a(jVar17, interfaceC1084f3, 0);
                            N0<androidx.compose.ui.graphics.H> n0E = u1117.e(z21111117, z21111118, jVar17, interfaceC1084f3, 0);
                            if (!((Boolean) xA.getValue()).booleanValue()) {
                                f1111114 = f1111115;
                            }
                            if (z21111117) {
                                interfaceC1084f3.L(773088894);
                                n0I = C0902b.a(f1111114, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                                interfaceC1084f3.D();
                            } else {
                                interfaceC1084f3.L(773193116);
                                n0I = J0.i(new p013b0.f(f1111115), interfaceC1084f3);
                                interfaceC1084f3.D();
                            }
                            X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                            androidx.compose.ui.h.a aVar111111 = androidx.compose.ui.h.a.f13984b;
                            final C0937i c0937i = (C0937i) xI.getValue();
                            float f1111116 = TextFieldKt.f11841a;
                            final float f1111117 = c0937i.f10065a;
                            androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar111111, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // Ia.l
                                public final p293xa.r invoke(J.c cVar) {
                                    J.c cVar2 = cVar;
                                    cVar2.A1();
                                    if (!p013b0.f.a(f1111117, 0.0f)) {
                                        float density = cVar2.getDensity() * f1111117;
                                        float fB = I.h.b(cVar2.j()) - (density / 2);
                                        cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            });
                            interfaceC1084f3.D();
                            return hVarC;
                        }
                    });
                    strK = P3.d.k(c1086gP, 3);
                    float f1111114 = TextFieldImplKt.f11839a;
                    if (z22) {
                        hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                                String str2 = strK;
                                Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                                wVar.e(SemanticsProperties.f15144J, str2);
                                return p293xa.r.f47939a;
                            }
                        });
                    }
                    final boolean z21111117 = z20;
                    final boolean z21111118 = z24;
                    final androidx.compose.ui.text.input.E e115 = e12;
                    final androidx.compose.foundation.interaction.k kVar1113 = kVar7;
                    final boolean z21111119 = z22;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111112 = pVar13;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111113 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111114 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111115 = pVar12;
                    final l0 l0Var15 = l0VarB;
                    final U u1117 = uB;
                    int i514 = i44 << 12;
                    BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD13, kVar5, jVar16, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // Ia.q
                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1111116, InterfaceC1084f interfaceC1084f2, Integer num) {
                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1111117 = pVar1111116;
                            InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                            int iIntValue = num.intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= interfaceC1084f3.k(pVar1111117) ? 4 : 2;
                            }
                            int i515 = iIntValue;
                            if (interfaceC1084f3.C(i515 & 1, (i515 & 19) != 18)) {
                                TextFieldDefaults.f11834a.a(str, pVar1111117, z21111117, z21111118, e115, kVar1113, z21111119, pVar1111112, pVar1111113, pVar1111114, pVar1111115, l0Var15, u1117, null, interfaceC1084f3, (i515 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                            } else {
                                interfaceC1084f3.w();
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i514) | (29360128 & i514) | (234881024 & i514) | (i514 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                    jVar2 = jVar16;
                    pVar8 = pVar12;
                    e11 = e12;
                    z19 = z24;
                    hVar2 = hVar3;
                    u11 = uB;
                    z17 = z21;
                    kVar4 = kVar6;
                    l0Var2 = l0VarB;
                    z18 = z22;
                    kVar3 = kVar5;
                    pVar7 = pVar11;
                    f11 = f1111113;
                    z16 = z20;
                    pVar6 = pVar10;
                    pVar5 = pVar13;
                } else {
                    c1086gP.w();
                    hVar2 = hVar;
                    z16 = z10;
                    z17 = z11;
                    f11 = f10;
                    pVar5 = pVar;
                    pVar6 = pVar2;
                    pVar7 = pVar3;
                    pVar8 = pVar4;
                    z18 = z12;
                    e11 = e10;
                    kVar3 = kVar;
                    jVar2 = jVar;
                    z19 = z13;
                    i41 = i10;
                    i42 = i11;
                    kVar4 = kVar2;
                    l0Var2 = l0Var;
                    u11 = u10;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i32 |= 24576;
            if ((i13 & 196608) != 0) {
                if ((i14 & 32768) == 0) {
                    i47 = 65536;
                } else {
                    i47 = 65536;
                }
                i32 |= i47;
            }
            i37 = i14 & 65536;
            if (i37 != 0) {
                i32 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c1086gP.h(i11)) {
                    i38 = 1048576;
                } else {
                    i38 = 524288;
                }
                i32 |= i38;
            }
            i39 = i14 & 131072;
            if (i39 != 0) {
                i32 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c1086gP.K(kVar2)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i32 |= i40;
            }
            if ((i13 & 100663296) != 0) {
                if ((i14 & 262144) == 0) {
                    i46 = 33554432;
                } else {
                    i46 = 33554432;
                }
                i32 |= i46;
            }
            if ((i13 & 805306368) != 0) {
                if ((i14 & 524288) == 0) {
                    i45 = 268435456;
                } else {
                    i45 = 268435456;
                }
                i32 |= i45;
            }
            if ((i50 & 306783379) == 306783378) {
                z14 = true;
                z15 = true;
            } else {
                z14 = true;
                z15 = true;
            }
            if (c1086gP.C(i50 & 1, z15)) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i16 != 0) {
                        z20 = z14;
                    } else {
                        z20 = z10;
                    }
                    if (i18 != 0) {
                        z21 = false;
                    } else {
                        z21 = z11;
                    }
                    if ((i14 & 32) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                        i50 &= -458753;
                    } else {
                        f12 = f10;
                    }
                    if (i20 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i22 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i26 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        z22 = false;
                    } else {
                        z22 = z12;
                    }
                    if (i30 != 0) {
                        e12 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e12 = e10;
                    }
                    if (i33 != 0) {
                        kVar5 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar5 = kVar;
                    }
                    if ((8192 & i14) != 0) {
                        kVar6 = null;
                        jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                        i32 &= -7169;
                    } else {
                        kVar6 = null;
                        jVar3 = jVar;
                    }
                    if (i35 != 0) {
                        z23 = false;
                    } else {
                        z23 = z13;
                    }
                    if ((i14 & 32768) != 0) {
                        if (z23) {
                            i43 = 1;
                        } else {
                            i43 = BrazeLogger.SUPPRESS;
                        }
                        i32 &= -458753;
                    } else {
                        i43 = i10;
                    }
                    if (i37 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i11;
                    }
                    if (i39 == 0) {
                        kVar6 = kVar2;
                    }
                    if ((i14 & 262144) != 0) {
                        TextFieldDefaults textFieldDefaults111111 = TextFieldDefaults.f11834a;
                        p270w.a aVar111111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar111112 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar111111, null, null, aVar111112, aVar111112, 3);
                        i32 &= -234881025;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i14 & 524288) != 0) {
                        TextFieldDefaults textFieldDefaults111112 = TextFieldDefaults.f11834a;
                        i32 &= -1879048193;
                        uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                    } else {
                        uB = u10;
                    }
                    i41 = i43;
                    z24 = z23;
                    i44 = i32;
                    pVar13 = pVar9;
                } else {
                    if (i51 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i16 != 0) {
                        z20 = z14;
                    } else {
                        z20 = z10;
                    }
                    if (i18 != 0) {
                        z21 = false;
                    } else {
                        z21 = z11;
                    }
                    if ((i14 & 32) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                        i50 &= -458753;
                    } else {
                        f12 = f10;
                    }
                    if (i20 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i22 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i26 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        z22 = false;
                    } else {
                        z22 = z12;
                    }
                    if (i30 != 0) {
                        e12 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e12 = e10;
                    }
                    if (i33 != 0) {
                        kVar5 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar5 = kVar;
                    }
                    if ((8192 & i14) != 0) {
                        kVar6 = null;
                        jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                        i32 &= -7169;
                    } else {
                        kVar6 = null;
                        jVar3 = jVar;
                    }
                    if (i35 != 0) {
                        z23 = false;
                    } else {
                        z23 = z13;
                    }
                    if ((i14 & 32768) != 0) {
                        if (z23) {
                            i43 = 1;
                        } else {
                            i43 = BrazeLogger.SUPPRESS;
                        }
                        i32 &= -458753;
                    } else {
                        i43 = i10;
                    }
                    if (i37 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i11;
                    }
                    if (i39 == 0) {
                        kVar6 = kVar2;
                    }
                    if ((i14 & 262144) != 0) {
                        TextFieldDefaults textFieldDefaults111113 = TextFieldDefaults.f11834a;
                        p270w.a aVar111113 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar111114 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar111113, null, null, aVar111114, aVar111114, 3);
                        i32 &= -234881025;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i14 & 524288) != 0) {
                        TextFieldDefaults textFieldDefaults111114 = TextFieldDefaults.f11834a;
                        i32 &= -1879048193;
                        uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                    } else {
                        uB = u10;
                    }
                    i41 = i43;
                    z24 = z23;
                    i44 = i32;
                    pVar13 = pVar9;
                }
                c1086gP.U();
                if (kVar6 == null) {
                    c1086gP.L(-1665803660);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    kVar7 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    c1086gP.L(-53736253);
                    c1086gP.T(false);
                    kVar7 = kVar6;
                }
                c1086gP.L(-53730507);
                jB = f12.b();
                if (jB == 16) {
                    jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                }
                androidx.compose.foundation.text.j jVar17 = jVar3;
                c1086gP.T(false);
                androidx.compose.ui.text.F fD14 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                final float f1111115 = TextFieldDefaults.f11838e;
                final float f1111116 = TextFieldDefaults.f11837d;
                androidx.compose.ui.text.F f1111117 = f12;
                final boolean z211111110 = z20;
                final boolean z211111111 = z22;
                final androidx.compose.foundation.interaction.k kVar1114 = kVar7;
                final U u1118 = uB;
                hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // Ia.q
                    public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                        N0 n0I;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        interfaceC1084f3.L(1398930845);
                        boolean z211111112 = z211111110;
                        boolean z211111113 = z211111111;
                        androidx.compose.foundation.interaction.j jVar18 = kVar1114;
                        U u1119 = u1118;
                        float f1111118 = f1111115;
                        float f1111119 = f1111116;
                        X xA = androidx.compose.foundation.interaction.f.a(jVar18, interfaceC1084f3, 0);
                        N0<androidx.compose.ui.graphics.H> n0E = u1119.e(z211111112, z211111113, jVar18, interfaceC1084f3, 0);
                        if (!((Boolean) xA.getValue()).booleanValue()) {
                            f1111118 = f1111119;
                        }
                        if (z211111112) {
                            interfaceC1084f3.L(773088894);
                            n0I = C0902b.a(f1111118, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                            interfaceC1084f3.D();
                        } else {
                            interfaceC1084f3.L(773193116);
                            n0I = J0.i(new p013b0.f(f1111119), interfaceC1084f3);
                            interfaceC1084f3.D();
                        }
                        X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                        androidx.compose.ui.h.a aVar111115 = androidx.compose.ui.h.a.f13984b;
                        final C0937i c0937i = (C0937i) xI.getValue();
                        float f11111110 = TextFieldKt.f11841a;
                        final float f11111111 = c0937i.f10065a;
                        androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar111115, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.c cVar) {
                                J.c cVar2 = cVar;
                                cVar2.A1();
                                if (!p013b0.f.a(f11111111, 0.0f)) {
                                    float density = cVar2.getDensity() * f11111111;
                                    float fB = I.h.b(cVar2.j()) - (density / 2);
                                    cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                }
                                return p293xa.r.f47939a;
                            }
                        });
                        interfaceC1084f3.D();
                        return hVarC;
                    }
                });
                strK = P3.d.k(c1086gP, 3);
                float f1111118 = TextFieldImplKt.f11839a;
                if (z22) {
                    hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            String str2 = strK;
                            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                            wVar.e(SemanticsProperties.f15144J, str2);
                            return p293xa.r.f47939a;
                        }
                    });
                }
                final boolean z211111112 = z20;
                final boolean z211111113 = z24;
                final androidx.compose.ui.text.input.E e116 = e12;
                final androidx.compose.foundation.interaction.k kVar1115 = kVar7;
                final boolean z211111114 = z22;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111116 = pVar13;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111117 = pVar10;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111118 = pVar11;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111119 = pVar12;
                final l0 l0Var16 = l0VarB;
                final U u1119 = uB;
                int i515 = i44 << 12;
                BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD14, kVar5, jVar17, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // Ia.q
                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar11111110, InterfaceC1084f interfaceC1084f2, Integer num) {
                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar11111111 = pVar11111110;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= interfaceC1084f3.k(pVar11111111) ? 4 : 2;
                        }
                        int i516 = iIntValue;
                        if (interfaceC1084f3.C(i516 & 1, (i516 & 19) != 18)) {
                            TextFieldDefaults.f11834a.a(str, pVar11111111, z211111112, z211111113, e116, kVar1115, z211111114, pVar1111116, pVar1111117, pVar1111118, pVar1111119, l0Var16, u1119, null, interfaceC1084f3, (i516 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i515) | (29360128 & i515) | (234881024 & i515) | (i515 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                jVar2 = jVar17;
                pVar8 = pVar12;
                e11 = e12;
                z19 = z24;
                hVar2 = hVar3;
                u11 = uB;
                z17 = z21;
                kVar4 = kVar6;
                l0Var2 = l0VarB;
                z18 = z22;
                kVar3 = kVar5;
                pVar7 = pVar11;
                f11 = f1111117;
                z16 = z20;
                pVar6 = pVar10;
                pVar5 = pVar13;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                z16 = z10;
                z17 = z11;
                f11 = f10;
                pVar5 = pVar;
                pVar6 = pVar2;
                pVar7 = pVar3;
                pVar8 = pVar4;
                z18 = z12;
                e11 = e10;
                kVar3 = kVar;
                jVar2 = jVar;
                z19 = z13;
                i41 = i10;
                i42 = i11;
                kVar4 = kVar2;
                l0Var2 = l0Var;
                u11 = u10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i50 |= 24576;
        if ((i12 & 196608) != 0) {
            if ((i14 & 32) == 0) {
                i49 = 65536;
            } else {
                i49 = 65536;
            }
            i50 |= i49;
        }
        i20 = i14 & 64;
        if (i20 != 0) {
            i50 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            if (c1086gP.k(pVar)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i50 |= i21;
        }
        i22 = i14 & 128;
        if (i22 != 0) {
            i50 |= 12582912;
        } else if ((i12 & 12582912) == 0) {
            if (c1086gP.k(pVar2)) {
                i23 = 8388608;
            } else {
                i23 = 4194304;
            }
            i50 |= i23;
        }
        i24 = i14 & 256;
        if (i24 != 0) {
            i50 |= 100663296;
        } else if ((i12 & 100663296) == 0) {
            if (c1086gP.k(pVar3)) {
                i25 = 67108864;
            } else {
                i25 = 33554432;
            }
            i50 |= i25;
        }
        i26 = i14 & 512;
        if (i26 != 0) {
            i50 |= 805306368;
        } else if ((i12 & 805306368) == 0) {
            if (c1086gP.k(pVar4)) {
                i27 = 536870912;
            } else {
                i27 = 268435456;
            }
            i50 |= i27;
        }
        i28 = i14 & 1024;
        if (i28 != 0) {
            i29 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i29 = i13 | (c1086gP.c(z12) ? 4 : 2);
        } else {
            i29 = i13;
        }
        i30 = i14 & 2048;
        if (i30 != 0) {
            i29 |= 48;
        } else if ((i13 & 48) == 0) {
            if (c1086gP.K(e10)) {
                i31 = 32;
            } else {
                i31 = 16;
            }
            i29 |= i31;
        }
        i32 = i29;
        i33 = i14 & 4096;
        if (i33 != 0) {
            i32 |= 384;
        } else if ((i13 & 384) != 0) {
            if (c1086gP.K(kVar)) {
                i34 = 256;
            } else {
                i34 = 128;
            }
            i32 |= i34;
        }
        if ((i13 & 3072) != 0) {
            if ((i14 & 8192) == 0) {
                i48 = 1024;
            } else {
                i48 = 1024;
            }
            i32 |= i48;
        }
        i35 = i14 & 16384;
        if (i35 != 0) {
            if ((i13 & 24576) == 0) {
                if (c1086gP.c(z13)) {
                    i36 = 16384;
                } else {
                    i36 = 8192;
                }
                i32 |= i36;
            }
            if ((i13 & 196608) != 0) {
                if ((i14 & 32768) == 0) {
                    i47 = 65536;
                } else {
                    i47 = 65536;
                }
                i32 |= i47;
            }
            i37 = i14 & 65536;
            if (i37 != 0) {
                i32 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c1086gP.h(i11)) {
                    i38 = 1048576;
                } else {
                    i38 = 524288;
                }
                i32 |= i38;
            }
            i39 = i14 & 131072;
            if (i39 != 0) {
                i32 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c1086gP.K(kVar2)) {
                    i40 = 8388608;
                } else {
                    i40 = 4194304;
                }
                i32 |= i40;
            }
            if ((i13 & 100663296) != 0) {
                if ((i14 & 262144) == 0) {
                    i46 = 33554432;
                } else {
                    i46 = 33554432;
                }
                i32 |= i46;
            }
            if ((i13 & 805306368) != 0) {
                if ((i14 & 524288) == 0) {
                    i45 = 268435456;
                } else {
                    i45 = 268435456;
                }
                i32 |= i45;
            }
            if ((i50 & 306783379) == 306783378) {
                z14 = true;
                z15 = true;
            } else {
                z14 = true;
                z15 = true;
            }
            if (c1086gP.C(i50 & 1, z15)) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i51 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i16 != 0) {
                        z20 = z14;
                    } else {
                        z20 = z10;
                    }
                    if (i18 != 0) {
                        z21 = false;
                    } else {
                        z21 = z11;
                    }
                    if ((i14 & 32) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                        i50 &= -458753;
                    } else {
                        f12 = f10;
                    }
                    if (i20 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i22 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i26 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        z22 = false;
                    } else {
                        z22 = z12;
                    }
                    if (i30 != 0) {
                        e12 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e12 = e10;
                    }
                    if (i33 != 0) {
                        kVar5 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar5 = kVar;
                    }
                    if ((8192 & i14) != 0) {
                        kVar6 = null;
                        jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                        i32 &= -7169;
                    } else {
                        kVar6 = null;
                        jVar3 = jVar;
                    }
                    if (i35 != 0) {
                        z23 = false;
                    } else {
                        z23 = z13;
                    }
                    if ((i14 & 32768) != 0) {
                        if (z23) {
                            i43 = 1;
                        } else {
                            i43 = BrazeLogger.SUPPRESS;
                        }
                        i32 &= -458753;
                    } else {
                        i43 = i10;
                    }
                    if (i37 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i11;
                    }
                    if (i39 == 0) {
                        kVar6 = kVar2;
                    }
                    if ((i14 & 262144) != 0) {
                        TextFieldDefaults textFieldDefaults111115 = TextFieldDefaults.f11834a;
                        p270w.a aVar111115 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar111116 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar111115, null, null, aVar111116, aVar111116, 3);
                        i32 &= -234881025;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i14 & 524288) != 0) {
                        TextFieldDefaults textFieldDefaults111116 = TextFieldDefaults.f11834a;
                        i32 &= -1879048193;
                        uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                    } else {
                        uB = u10;
                    }
                    i41 = i43;
                    z24 = z23;
                    i44 = i32;
                    pVar13 = pVar9;
                } else {
                    if (i51 != 0) {
                        hVar3 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar3 = hVar;
                    }
                    if (i16 != 0) {
                        z20 = z14;
                    } else {
                        z20 = z10;
                    }
                    if (i18 != 0) {
                        z21 = false;
                    } else {
                        z21 = z11;
                    }
                    if ((i14 & 32) != 0) {
                        f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                        i50 &= -458753;
                    } else {
                        f12 = f10;
                    }
                    if (i20 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar;
                    }
                    if (i22 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar2;
                    }
                    if (i24 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar3;
                    }
                    if (i26 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar4;
                    }
                    if (i28 != 0) {
                        z22 = false;
                    } else {
                        z22 = z12;
                    }
                    if (i30 != 0) {
                        e12 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e12 = e10;
                    }
                    if (i33 != 0) {
                        kVar5 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar5 = kVar;
                    }
                    if ((8192 & i14) != 0) {
                        kVar6 = null;
                        jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                        i32 &= -7169;
                    } else {
                        kVar6 = null;
                        jVar3 = jVar;
                    }
                    if (i35 != 0) {
                        z23 = false;
                    } else {
                        z23 = z13;
                    }
                    if ((i14 & 32768) != 0) {
                        if (z23) {
                            i43 = 1;
                        } else {
                            i43 = BrazeLogger.SUPPRESS;
                        }
                        i32 &= -458753;
                    } else {
                        i43 = i10;
                    }
                    if (i37 != 0) {
                        i42 = 1;
                    } else {
                        i42 = i11;
                    }
                    if (i39 == 0) {
                        kVar6 = kVar2;
                    }
                    if ((i14 & 262144) != 0) {
                        TextFieldDefaults textFieldDefaults111117 = TextFieldDefaults.f11834a;
                        p270w.a aVar111117 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                        w.c.a aVar111118 = p270w.c.f47677a;
                        l0VarB = p270w.a.b(aVar111117, null, null, aVar111118, aVar111118, 3);
                        i32 &= -234881025;
                    } else {
                        l0VarB = l0Var;
                    }
                    if ((i14 & 524288) != 0) {
                        TextFieldDefaults textFieldDefaults111118 = TextFieldDefaults.f11834a;
                        i32 &= -1879048193;
                        uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                    } else {
                        uB = u10;
                    }
                    i41 = i43;
                    z24 = z23;
                    i44 = i32;
                    pVar13 = pVar9;
                }
                c1086gP.U();
                if (kVar6 == null) {
                    c1086gP.L(-1665803660);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    c1086gP.T(false);
                    kVar7 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    c1086gP.L(-53736253);
                    c1086gP.T(false);
                    kVar7 = kVar6;
                }
                c1086gP.L(-53730507);
                jB = f12.b();
                if (jB == 16) {
                    jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
                }
                androidx.compose.foundation.text.j jVar18 = jVar3;
                c1086gP.T(false);
                androidx.compose.ui.text.F fD15 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                final float f1111119 = TextFieldDefaults.f11838e;
                final float f11111110 = TextFieldDefaults.f11837d;
                androidx.compose.ui.text.F f11111111 = f12;
                final boolean z211111115 = z20;
                final boolean z211111116 = z22;
                final androidx.compose.foundation.interaction.k kVar1116 = kVar7;
                final U u11110 = uB;
                hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // Ia.q
                    public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                        N0 n0I;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        num.intValue();
                        interfaceC1084f3.L(1398930845);
                        boolean z211111117 = z211111115;
                        boolean z211111118 = z211111116;
                        androidx.compose.foundation.interaction.j jVar19 = kVar1116;
                        U u11111 = u11110;
                        float f11111112 = f1111119;
                        float f11111113 = f11111110;
                        X xA = androidx.compose.foundation.interaction.f.a(jVar19, interfaceC1084f3, 0);
                        N0<androidx.compose.ui.graphics.H> n0E = u11111.e(z211111117, z211111118, jVar19, interfaceC1084f3, 0);
                        if (!((Boolean) xA.getValue()).booleanValue()) {
                            f11111112 = f11111113;
                        }
                        if (z211111117) {
                            interfaceC1084f3.L(773088894);
                            n0I = C0902b.a(f11111112, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                            interfaceC1084f3.D();
                        } else {
                            interfaceC1084f3.L(773193116);
                            n0I = J0.i(new p013b0.f(f11111113), interfaceC1084f3);
                            interfaceC1084f3.D();
                        }
                        X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                        androidx.compose.ui.h.a aVar111119 = androidx.compose.ui.h.a.f13984b;
                        final C0937i c0937i = (C0937i) xI.getValue();
                        float f11111114 = TextFieldKt.f11841a;
                        final float f11111115 = c0937i.f10065a;
                        androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar111119, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final p293xa.r invoke(J.c cVar) {
                                J.c cVar2 = cVar;
                                cVar2.A1();
                                if (!p013b0.f.a(f11111115, 0.0f)) {
                                    float density = cVar2.getDensity() * f11111115;
                                    float fB = I.h.b(cVar2.j()) - (density / 2);
                                    cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                                }
                                return p293xa.r.f47939a;
                            }
                        });
                        interfaceC1084f3.D();
                        return hVarC;
                    }
                });
                strK = P3.d.k(c1086gP, 3);
                float f11111112 = TextFieldImplKt.f11839a;
                if (z22) {
                    hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                            String str2 = strK;
                            Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                            wVar.e(SemanticsProperties.f15144J, str2);
                            return p293xa.r.f47939a;
                        }
                    });
                }
                final boolean z211111117 = z20;
                final boolean z211111118 = z24;
                final androidx.compose.ui.text.input.E e117 = e12;
                final androidx.compose.foundation.interaction.k kVar1117 = kVar7;
                final boolean z211111119 = z22;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111110 = pVar13;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111 = pVar10;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111112 = pVar11;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111113 = pVar12;
                final l0 l0Var17 = l0VarB;
                final U u11111 = uB;
                int i516 = i44 << 12;
                BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD15, kVar5, jVar18, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // Ia.q
                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar11111114, InterfaceC1084f interfaceC1084f2, Integer num) {
                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar11111115 = pVar11111114;
                        InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                        int iIntValue = num.intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= interfaceC1084f3.k(pVar11111115) ? 4 : 2;
                        }
                        int i517 = iIntValue;
                        if (interfaceC1084f3.C(i517 & 1, (i517 & 19) != 18)) {
                            TextFieldDefaults.f11834a.a(str, pVar11111115, z211111117, z211111118, e117, kVar1117, z211111119, pVar11111110, pVar11111111, pVar11111112, pVar11111113, l0Var17, u11111, null, interfaceC1084f3, (i517 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                        } else {
                            interfaceC1084f3.w();
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i516) | (29360128 & i516) | (234881024 & i516) | (i516 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
                jVar2 = jVar18;
                pVar8 = pVar12;
                e11 = e12;
                z19 = z24;
                hVar2 = hVar3;
                u11 = uB;
                z17 = z21;
                kVar4 = kVar6;
                l0Var2 = l0VarB;
                z18 = z22;
                kVar3 = kVar5;
                pVar7 = pVar11;
                f11 = f11111111;
                z16 = z20;
                pVar6 = pVar10;
                pVar5 = pVar13;
            } else {
                c1086gP.w();
                hVar2 = hVar;
                z16 = z10;
                z17 = z11;
                f11 = f10;
                pVar5 = pVar;
                pVar6 = pVar2;
                pVar7 = pVar3;
                pVar8 = pVar4;
                z18 = z12;
                e11 = e10;
                kVar3 = kVar;
                jVar2 = jVar;
                z19 = z13;
                i41 = i10;
                i42 = i11;
                kVar4 = kVar2;
                l0Var2 = l0Var;
                u11 = u10;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i32 |= 24576;
        if ((i13 & 196608) != 0) {
            if ((i14 & 32768) == 0) {
                i47 = 65536;
            } else {
                i47 = 65536;
            }
            i32 |= i47;
        }
        i37 = i14 & 65536;
        if (i37 != 0) {
            i32 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c1086gP.h(i11)) {
                i38 = 1048576;
            } else {
                i38 = 524288;
            }
            i32 |= i38;
        }
        i39 = i14 & 131072;
        if (i39 != 0) {
            i32 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c1086gP.K(kVar2)) {
                i40 = 8388608;
            } else {
                i40 = 4194304;
            }
            i32 |= i40;
        }
        if ((i13 & 100663296) != 0) {
            if ((i14 & 262144) == 0) {
                i46 = 33554432;
            } else {
                i46 = 33554432;
            }
            i32 |= i46;
        }
        if ((i13 & 805306368) != 0) {
            if ((i14 & 524288) == 0) {
                i45 = 268435456;
            } else {
                i45 = 268435456;
            }
            i32 |= i45;
        }
        if ((i50 & 306783379) == 306783378) {
            z14 = true;
            z15 = true;
        } else {
            z14 = true;
            z15 = true;
        }
        if (c1086gP.C(i50 & 1, z15)) {
            c1086gP.r0();
            if ((i12 & 1) != 0) {
                if (i51 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if (i16 != 0) {
                    z20 = z14;
                } else {
                    z20 = z10;
                }
                if (i18 != 0) {
                    z21 = false;
                } else {
                    z21 = z11;
                }
                if ((i14 & 32) != 0) {
                    f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                    i50 &= -458753;
                } else {
                    f12 = f10;
                }
                if (i20 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar;
                }
                if (i22 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar2;
                }
                if (i24 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar3;
                }
                if (i26 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar4;
                }
                if (i28 != 0) {
                    z22 = false;
                } else {
                    z22 = z12;
                }
                if (i30 != 0) {
                    e12 = androidx.compose.ui.text.input.E.a.f15486a;
                } else {
                    e12 = e10;
                }
                if (i33 != 0) {
                    kVar5 = androidx.compose.foundation.text.k.f11351g;
                } else {
                    kVar5 = kVar;
                }
                if ((8192 & i14) != 0) {
                    kVar6 = null;
                    jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                    i32 &= -7169;
                } else {
                    kVar6 = null;
                    jVar3 = jVar;
                }
                if (i35 != 0) {
                    z23 = false;
                } else {
                    z23 = z13;
                }
                if ((i14 & 32768) != 0) {
                    if (z23) {
                        i43 = 1;
                    } else {
                        i43 = BrazeLogger.SUPPRESS;
                    }
                    i32 &= -458753;
                } else {
                    i43 = i10;
                }
                if (i37 != 0) {
                    i42 = 1;
                } else {
                    i42 = i11;
                }
                if (i39 == 0) {
                    kVar6 = kVar2;
                }
                if ((i14 & 262144) != 0) {
                    TextFieldDefaults textFieldDefaults111119 = TextFieldDefaults.f11834a;
                    p270w.a aVar111119 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    w.c.a aVar1111110 = p270w.c.f47677a;
                    l0VarB = p270w.a.b(aVar111119, null, null, aVar1111110, aVar1111110, 3);
                    i32 &= -234881025;
                } else {
                    l0VarB = l0Var;
                }
                if ((i14 & 524288) != 0) {
                    TextFieldDefaults textFieldDefaults1111110 = TextFieldDefaults.f11834a;
                    i32 &= -1879048193;
                    uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                } else {
                    uB = u10;
                }
                i41 = i43;
                z24 = z23;
                i44 = i32;
                pVar13 = pVar9;
            } else {
                if (i51 != 0) {
                    hVar3 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar3 = hVar;
                }
                if (i16 != 0) {
                    z20 = z14;
                } else {
                    z20 = z10;
                }
                if (i18 != 0) {
                    z21 = false;
                } else {
                    z21 = z11;
                }
                if ((i14 & 32) != 0) {
                    f12 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f11859a);
                    i50 &= -458753;
                } else {
                    f12 = f10;
                }
                if (i20 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar;
                }
                if (i22 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar2;
                }
                if (i24 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar3;
                }
                if (i26 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar4;
                }
                if (i28 != 0) {
                    z22 = false;
                } else {
                    z22 = z12;
                }
                if (i30 != 0) {
                    e12 = androidx.compose.ui.text.input.E.a.f15486a;
                } else {
                    e12 = e10;
                }
                if (i33 != 0) {
                    kVar5 = androidx.compose.foundation.text.k.f11351g;
                } else {
                    kVar5 = kVar;
                }
                if ((8192 & i14) != 0) {
                    kVar6 = null;
                    jVar3 = new androidx.compose.foundation.text.j(null, null, null, 63);
                    i32 &= -7169;
                } else {
                    kVar6 = null;
                    jVar3 = jVar;
                }
                if (i35 != 0) {
                    z23 = false;
                } else {
                    z23 = z13;
                }
                if ((i14 & 32768) != 0) {
                    if (z23) {
                        i43 = 1;
                    } else {
                        i43 = BrazeLogger.SUPPRESS;
                    }
                    i32 &= -458753;
                } else {
                    i43 = i10;
                }
                if (i37 != 0) {
                    i42 = 1;
                } else {
                    i42 = i11;
                }
                if (i39 == 0) {
                    kVar6 = kVar2;
                }
                if ((i14 & 262144) != 0) {
                    TextFieldDefaults textFieldDefaults1111111 = TextFieldDefaults.f11834a;
                    p270w.a aVar1111111 = ((N) c1086gP.x(ShapesKt.f11807a)).f11775a;
                    w.c.a aVar1111112 = p270w.c.f47677a;
                    l0VarB = p270w.a.b(aVar1111111, null, null, aVar1111112, aVar1111112, 3);
                    i32 &= -234881025;
                } else {
                    l0VarB = l0Var;
                }
                if ((i14 & 524288) != 0) {
                    TextFieldDefaults textFieldDefaults1111112 = TextFieldDefaults.f11834a;
                    i32 &= -1879048193;
                    uB = TextFieldDefaults.b(0L, 0L, 0L, 0L, 0L, 0L, 0L, c1086gP, 2097151);
                } else {
                    uB = u10;
                }
                i41 = i43;
                z24 = z23;
                i44 = i32;
                pVar13 = pVar9;
            }
            c1086gP.U();
            if (kVar6 == null) {
                c1086gP.L(-1665803660);
                objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                kVar7 = (androidx.compose.foundation.interaction.k) objF;
            } else {
                c1086gP.L(-53736253);
                c1086gP.T(false);
                kVar7 = kVar6;
            }
            c1086gP.L(-53730507);
            jB = f12.b();
            if (jB == 16) {
                jB = ((androidx.compose.ui.graphics.H) uB.f(z20, c1086gP).getValue()).f13506a;
            }
            androidx.compose.foundation.text.j jVar19 = jVar3;
            c1086gP.T(false);
            androidx.compose.ui.text.F fD16 = f12.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
            final float f11111113 = TextFieldDefaults.f11838e;
            final float f11111114 = TextFieldDefaults.f11837d;
            androidx.compose.ui.text.F f11111115 = f12;
            final boolean z2111111110 = z20;
            final boolean z2111111111 = z22;
            final androidx.compose.foundation.interaction.k kVar1118 = kVar7;
            final U u11112 = uB;
            hVarA = ComposedModifierKt.a(hVar3, InspectableValueKt.f14929a, new Ia.q<androidx.compose.ui.h, InterfaceC1084f, Integer, androidx.compose.ui.h>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ia.q
                public final androidx.compose.ui.h invoke(androidx.compose.ui.h hVar4, InterfaceC1084f interfaceC1084f2, Integer num) {
                    N0 n0I;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    num.intValue();
                    interfaceC1084f3.L(1398930845);
                    boolean z2111111112 = z2111111110;
                    boolean z2111111113 = z2111111111;
                    androidx.compose.foundation.interaction.j jVar110 = kVar1118;
                    U u11113 = u11112;
                    float f11111116 = f11111113;
                    float f11111117 = f11111114;
                    X xA = androidx.compose.foundation.interaction.f.a(jVar110, interfaceC1084f3, 0);
                    N0<androidx.compose.ui.graphics.H> n0E = u11113.e(z2111111112, z2111111113, jVar110, interfaceC1084f3, 0);
                    if (!((Boolean) xA.getValue()).booleanValue()) {
                        f11111116 = f11111117;
                    }
                    if (z2111111112) {
                        interfaceC1084f3.L(773088894);
                        n0I = C0902b.a(f11111116, C0907g.d(150, 0, null, 6), interfaceC1084f3, 48, 12);
                        interfaceC1084f3.D();
                    } else {
                        interfaceC1084f3.L(773193116);
                        n0I = J0.i(new p013b0.f(f11111117), interfaceC1084f3);
                        interfaceC1084f3.D();
                    }
                    X xI = J0.i(new C0937i(((p013b0.f) n0I.getValue()).f20481b, new m0(n0E.getValue().f13506a)), interfaceC1084f3);
                    androidx.compose.ui.h.a aVar1111113 = androidx.compose.ui.h.a.f13984b;
                    final C0937i c0937i = (C0937i) xI.getValue();
                    float f11111118 = TextFieldKt.f11841a;
                    final float f11111119 = c0937i.f10065a;
                    androidx.compose.ui.h hVarC = androidx.compose.ui.draw.f.c(aVar1111113, new Ia.l<J.c, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // Ia.l
                        public final p293xa.r invoke(J.c cVar) {
                            J.c cVar2 = cVar;
                            cVar2.A1();
                            if (!p013b0.f.a(f11111119, 0.0f)) {
                                float density = cVar2.getDensity() * f11111119;
                                float fB = I.h.b(cVar2.j()) - (density / 2);
                                cVar2.f0(c0937i.f10066b, I.e.c(0.0f, fB), I.e.c(I.h.d(cVar2.j()), fB), density, 0, null, (496 & 64) != 0 ? 1.0f : 0.0f, null, 3);
                            }
                            return p293xa.r.f47939a;
                        }
                    });
                    interfaceC1084f3.D();
                    return hVarC;
                }
            });
            strK = P3.d.k(c1086gP, 3);
            float f11111116 = TextFieldImplKt.f11839a;
            if (z22) {
                hVarA = androidx.compose.ui.semantics.p.b(hVarA, false, new Ia.l<androidx.compose.ui.semantics.w, p293xa.r>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.ui.semantics.w wVar) {
                        String str2 = strK;
                        Oa.l<Object>[] lVarArr = androidx.compose.ui.semantics.t.f15251a;
                        wVar.e(SemanticsProperties.f15144J, str2);
                        return p293xa.r.f47939a;
                    }
                });
            }
            final boolean z2111111112 = z20;
            final boolean z2111111113 = z24;
            final androidx.compose.ui.text.input.E e118 = e12;
            final androidx.compose.foundation.interaction.k kVar1119 = kVar7;
            final boolean z2111111114 = z22;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111114 = pVar13;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111115 = pVar10;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111116 = pVar11;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111117 = pVar12;
            final l0 l0Var18 = l0VarB;
            final U u11113 = uB;
            int i517 = i44 << 12;
            BasicTextFieldKt.b(str, lVar, W.a(TextFieldDefaults.f11836c, TextFieldDefaults.f11835b, hVarA), z20, z21, fD16, kVar5, jVar19, z24, i41, i42, e12, null, kVar7, new m0(((androidx.compose.ui.graphics.H) uB.g(z22, c1086gP).getValue()).f13506a), androidx.compose.runtime.internal.a.b(989834338, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // Ia.q
                public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar11111118, InterfaceC1084f interfaceC1084f2, Integer num) {
                    Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar11111119 = pVar11111118;
                    InterfaceC1084f interfaceC1084f3 = interfaceC1084f2;
                    int iIntValue = num.intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= interfaceC1084f3.k(pVar11111119) ? 4 : 2;
                    }
                    int i518 = iIntValue;
                    if (interfaceC1084f3.C(i518 & 1, (i518 & 19) != 18)) {
                        TextFieldDefaults.f11834a.a(str, pVar11111119, z2111111112, z2111111113, e118, kVar1119, z2111111114, pVar11111114, pVar11111115, pVar11111116, pVar11111117, l0Var18, u11113, null, interfaceC1084f3, (i518 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 24576, 8192);
                    } else {
                        interfaceC1084f3.w();
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, (i50 & 64638) | (3670016 & i517) | (29360128 & i517) | (234881024 & i517) | (i517 & 1879048192), ((i44 >> 18) & 14) | 196608 | (i44 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle), 4096);
            jVar2 = jVar19;
            pVar8 = pVar12;
            e11 = e12;
            z19 = z24;
            hVar2 = hVar3;
            u11 = uB;
            z17 = z21;
            kVar4 = kVar6;
            l0Var2 = l0VarB;
            z18 = z22;
            kVar3 = kVar5;
            pVar7 = pVar11;
            f11 = f11111115;
            z16 = z20;
            pVar6 = pVar10;
            pVar5 = pVar13;
        } else {
            c1086gP.w();
            hVar2 = hVar;
            z16 = z10;
            z17 = z11;
            f11 = f10;
            pVar5 = pVar;
            pVar6 = pVar2;
            pVar7 = pVar3;
            pVar8 = pVar4;
            z18 = z12;
            e11 = e10;
            kVar3 = kVar;
            jVar2 = jVar;
            z19 = z13;
            i41 = i10;
            i42 = i11;
            kVar4 = kVar2;
            l0Var2 = l0Var;
            u11 = u10;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextField$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TextFieldKt.a(str, lVar, hVar2, z16, z17, f11, pVar5, pVar6, pVar7, pVar8, z18, e11, kVar3, jVar2, z19, i41, i42, kVar4, l0Var2, u11, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), i14);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final void b(final androidx.compose.ui.h hVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, final Ia.q<? super androidx.compose.ui.h, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, final boolean z10, final float f10, final androidx.compose.foundation.layout.L l10, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        int i12;
        boolean z11;
        C1086g c1086gP = interfaceC1084f.p(-2112507061);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= c1086gP.k(pVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c1086gP.k(qVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c1086gP.k(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c1086gP.k(pVar4) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c1086gP.c(z10) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c1086gP.g(f10) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c1086gP.K(l10) ? 67108864 : 33554432;
        }
        if (c1086gP.C(i11 & 1, (38347923 & i11) != 38347922)) {
            boolean z12 = ((29360128 & i11) == 8388608) | ((3670016 & i11) == 1048576) | ((234881024 & i11) == 67108864);
            Object objF = c1086gP.f();
            if (z12 || objF == InterfaceC1084f.a.f12980a) {
                objF = new TextFieldMeasurePolicy(z10, f10, l10);
                c1086gP.E(objF);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objF;
            LayoutDirection layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
            int i13 = c1086gP.f12996P;
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
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar5 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar5, c1086gP, textFieldMeasurePolicy);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar6 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar6, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar7 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar7);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar8 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar8, c1086gP, hVarC);
            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            if (pVar3 != null) {
                c1086gP.L(79117075);
                androidx.compose.ui.h hVarB = C1171q.b(aVar2, "Leading");
                O0 o10 = InteractiveComponentSizeKt.f11762a;
                androidx.compose.ui.h hVarI = hVarB.i(MinimumInteractiveModifier.f11774b);
                androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                int i14 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarI);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar5, c1086gP, eD);
                R0.a(pVar6, c1086gP, interfaceC1089h0P2);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar7);
                }
                R0.a(pVar8, c1086gP, hVarC2);
                pVar3.invoke(c1086gP, Integer.valueOf((i11 >> 12) & 14));
                c1086gP.T(true);
                c1086gP.T(false);
            } else {
                c1086gP.L(79362130);
                c1086gP.T(false);
            }
            if (pVar4 != null) {
                c1086gP.L(79404817);
                androidx.compose.ui.h hVarB2 = C1171q.b(aVar2, "Trailing");
                O0 o11 = InteractiveComponentSizeKt.f11762a;
                androidx.compose.ui.h hVarI2 = hVarB2.i(MinimumInteractiveModifier.f11774b);
                androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
                int i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarI2);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar5, c1086gP, eD2);
                R0.a(pVar6, c1086gP, interfaceC1089h0P3);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                    J4.i.d(i15, c1086gP, i15, pVar7);
                }
                R0.a(pVar8, c1086gP, hVarC3);
                pVar4.invoke(c1086gP, Integer.valueOf((i11 >> 15) & 14));
                c1086gP.T(true);
                i12 = 0;
                c1086gP.T(false);
            } else {
                i12 = 0;
                c1086gP.L(79651794);
                c1086gP.T(false);
            }
            float fD = PaddingKt.d(l10, layoutDirection);
            float fC = PaddingKt.c(l10, layoutDirection);
            if (pVar3 != null) {
                fD = Na.l.x(fD - TextFieldImplKt.f11840b, i12);
            }
            androidx.compose.ui.h hVarJ = PaddingKt.j(aVar2, fD, 0.0f, pVar4 != null ? Na.l.x(fC - TextFieldImplKt.f11840b, i12) : fC, 0.0f, 10);
            if (qVar != null) {
                c1086gP.L(80502775);
                qVar.invoke(C1171q.b(aVar2, "Hint").i(hVarJ), c1086gP, Integer.valueOf((i11 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
                z11 = false;
                c1086gP.T(false);
            } else {
                z11 = false;
                c1086gP.L(80590226);
                c1086gP.T(false);
            }
            androidx.compose.ui.f fVar2 = androidx.compose.ui.d.a.f13335a;
            if (pVar2 != null) {
                c1086gP.L(80624729);
                androidx.compose.ui.h hVarI3 = C1171q.b(aVar2, "Label").i(hVarJ);
                androidx.compose.ui.layout.E eD3 = BoxKt.d(fVar2, false);
                int i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarI3);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar5, c1086gP, eD3);
                R0.a(pVar6, c1086gP, interfaceC1089h0P4);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
                    J4.i.d(i16, c1086gP, i16, pVar7);
                }
                R0.a(pVar8, c1086gP, hVarC4);
                pVar2.invoke(c1086gP, Integer.valueOf((i11 >> 6) & 14));
                c1086gP.T(true);
                c1086gP.T(false);
            } else {
                c1086gP.L(80710258);
                c1086gP.T(z11);
            }
            androidx.compose.ui.h hVarI4 = C1171q.b(aVar2, "TextField").i(hVarJ);
            androidx.compose.ui.layout.E eD4 = BoxKt.d(fVar2, true);
            int i17 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
            androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarI4);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(pVar5, c1086gP, eD4);
            R0.a(pVar6, c1086gP, interfaceC1089h0P5);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i17))) {
                J4.i.d(i17, c1086gP, i17, pVar7);
            }
            R0.a(pVar8, c1086gP, hVarC5);
            pVar.invoke(c1086gP, Integer.valueOf((i11 >> 3) & 14));
            c1086gP.T(true);
            c1086gP.T(true);
        } else {
            c1086gP.w();
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material.TextFieldKt$TextFieldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TextFieldKt.b(hVar, pVar, pVar2, qVar, pVar3, pVar4, z10, f10, l10, interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final int c(int i10, boolean z10, int i11, int i12, int i13, int i14, long j, float f10, androidx.compose.foundation.layout.L l10) {
        float f11 = f11843c * f10;
        float fD = l10.d() * f10;
        float fA = l10.a() * f10;
        int iMax = Math.max(i10, i14);
        return p013b0.b.f(Math.max(Ka.a.b(z10 ? i11 + f11 + iMax + fA : fD + iMax + fA), Math.max(i12, i13)), j);
    }
}
