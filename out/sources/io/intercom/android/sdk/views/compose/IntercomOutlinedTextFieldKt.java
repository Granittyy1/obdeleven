package io.intercom.android.sdk.views.compose;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.N;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.semantics.w;
import androidx.compose.ui.text.F;
import androidx.compose.ui.text.input.E;
import androidx.navigation.compose.D;
import com.braze.support.BrazeLogger;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: IntercomOutlinedTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class IntercomOutlinedTextFieldKt {
    private static final float OutlinedTextFieldTopPadding = 8;

    /* JADX WARN: Code duplicated, block: B:101:0x014a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0150  */
    /* JADX WARN: Code duplicated, block: B:105:0x0156  */
    /* JADX WARN: Code duplicated, block: B:106:0x0159  */
    /* JADX WARN: Code duplicated, block: B:109:0x0160  */
    /* JADX WARN: Code duplicated, block: B:111:0x0169  */
    /* JADX WARN: Code duplicated, block: B:113:0x016f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0175  */
    /* JADX WARN: Code duplicated, block: B:116:0x0178  */
    /* JADX WARN: Code duplicated, block: B:118:0x017d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0184  */
    /* JADX WARN: Code duplicated, block: B:123:0x0189  */
    /* JADX WARN: Code duplicated, block: B:125:0x018f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0195  */
    /* JADX WARN: Code duplicated, block: B:128:0x0198  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:153:0x01da  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:166:0x0205  */
    /* JADX WARN: Code duplicated, block: B:168:0x020b  */
    /* JADX WARN: Code duplicated, block: B:171:0x0214  */
    /* JADX WARN: Code duplicated, block: B:173:0x0219  */
    /* JADX WARN: Code duplicated, block: B:176:0x021f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0226  */
    /* JADX WARN: Code duplicated, block: B:179:0x022c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0232  */
    /* JADX WARN: Code duplicated, block: B:182:0x0235  */
    /* JADX WARN: Code duplicated, block: B:186:0x023d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0244  */
    /* JADX WARN: Code duplicated, block: B:189:0x024a  */
    /* JADX WARN: Code duplicated, block: B:191:0x0250  */
    /* JADX WARN: Code duplicated, block: B:192:0x0253  */
    /* JADX WARN: Code duplicated, block: B:196:0x025d  */
    /* JADX WARN: Code duplicated, block: B:198:0x0263  */
    /* JADX WARN: Code duplicated, block: B:201:0x026c  */
    /* JADX WARN: Code duplicated, block: B:203:0x0271  */
    /* JADX WARN: Code duplicated, block: B:206:0x0277  */
    /* JADX WARN: Code duplicated, block: B:208:0x027d  */
    /* JADX WARN: Code duplicated, block: B:211:0x0286  */
    /* JADX WARN: Code duplicated, block: B:213:0x028b  */
    /* JADX WARN: Code duplicated, block: B:216:0x0291  */
    /* JADX WARN: Code duplicated, block: B:217:0x0298  */
    /* JADX WARN: Code duplicated, block: B:219:0x029e  */
    /* JADX WARN: Code duplicated, block: B:222:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:224:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:227:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:235:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:237:0x0301  */
    /* JADX WARN: Code duplicated, block: B:253:0x0352 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:254:0x0354  */
    /* JADX WARN: Code duplicated, block: B:255:0x0357  */
    /* JADX WARN: Code duplicated, block: B:257:0x035b  */
    /* JADX WARN: Code duplicated, block: B:258:0x035e  */
    /* JADX WARN: Code duplicated, block: B:260:0x0362  */
    /* JADX WARN: Code duplicated, block: B:262:0x0367  */
    /* JADX WARN: Code duplicated, block: B:265:0x036e  */
    /* JADX WARN: Code duplicated, block: B:266:0x037c  */
    /* JADX WARN: Code duplicated, block: B:269:0x0382  */
    /* JADX WARN: Code duplicated, block: B:270:0x0385  */
    /* JADX WARN: Code duplicated, block: B:272:0x0389  */
    /* JADX WARN: Code duplicated, block: B:273:0x038c  */
    /* JADX WARN: Code duplicated, block: B:275:0x0390  */
    /* JADX WARN: Code duplicated, block: B:276:0x0393  */
    /* JADX WARN: Code duplicated, block: B:279:0x0398  */
    /* JADX WARN: Code duplicated, block: B:281:0x039c  */
    /* JADX WARN: Code duplicated, block: B:282:0x039e  */
    /* JADX WARN: Code duplicated, block: B:284:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:285:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:287:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:288:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:290:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:291:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:293:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:294:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:297:0x03bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:298:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:300:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:302:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:304:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:305:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:308:0x03da  */
    /* JADX WARN: Code duplicated, block: B:310:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:312:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:315:0x0401  */
    /* JADX WARN: Code duplicated, block: B:316:0x0412  */
    /* JADX WARN: Code duplicated, block: B:319:0x041a  */
    /* JADX WARN: Code duplicated, block: B:320:0x048b  */
    /* JADX WARN: Code duplicated, block: B:322:0x0497  */
    /* JADX WARN: Code duplicated, block: B:324:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:328:0x04cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:329:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:331:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:334:0x0500  */
    /* JADX WARN: Code duplicated, block: B:335:0x0528  */
    /* JADX WARN: Code duplicated, block: B:337:0x052d  */
    /* JADX WARN: Code duplicated, block: B:338:0x0533  */
    /* JADX WARN: Code duplicated, block: B:341:0x0549  */
    /* JADX WARN: Code duplicated, block: B:342:0x054f  */
    /* JADX WARN: Code duplicated, block: B:346:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:348:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0085  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:78:0x0103  */
    /* JADX WARN: Code duplicated, block: B:79:0x010a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0110  */
    /* JADX WARN: Code duplicated, block: B:83:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:0x0119  */
    /* JADX WARN: Code duplicated, block: B:88:0x0123  */
    /* JADX WARN: Code duplicated, block: B:89:0x012a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0130  */
    /* JADX WARN: Code duplicated, block: B:93:0x0136  */
    /* JADX WARN: Code duplicated, block: B:94:0x0139  */
    /* JADX WARN: Code duplicated, block: B:98:0x0143  */
    public static final void IntercomOutlinedTextField(final String value, final Ia.l<? super String, p293xa.r> onValueChange, androidx.compose.ui.h hVar, boolean z10, boolean z11, F f10, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, boolean z12, E e10, androidx.compose.foundation.text.k kVar, androidx.compose.foundation.text.j jVar, boolean z13, int i10, int i11, androidx.compose.foundation.interaction.k kVar2, l0 l0Var, TextFieldColors textFieldColors, L l10, InterfaceC1084f interfaceC1084f, final int i12, final int i13, final int i14, final int i15) {
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
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        androidx.compose.ui.h hVar2;
        boolean z14;
        boolean z15;
        F f11;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8;
        boolean z16;
        E e11;
        androidx.compose.foundation.text.k kVar3;
        androidx.compose.foundation.text.j jVar2;
        boolean z17;
        int i47;
        int i48;
        androidx.compose.foundation.interaction.k kVar4;
        l0 l0Var2;
        TextFieldColors textFieldColorsA;
        L n10;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9;
        int i49;
        boolean z18;
        Object objF;
        long jB;
        androidx.compose.ui.h hVarJ;
        long j;
        long j10;
        androidx.compose.foundation.text.k kVar5;
        final l0 l0Var3;
        androidx.compose.foundation.text.j jVar3;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar10;
        final L l11;
        final boolean z19;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11;
        final F f12;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12;
        boolean z20;
        final androidx.compose.foundation.interaction.k kVar6;
        final int i50;
        final boolean z21;
        boolean z22;
        final TextFieldColors textFieldColors2;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13;
        E e12;
        long j11;
        C1105p0 c1105p0V;
        int i51;
        int i52;
        int i53;
        int i54;
        kotlin.jvm.internal.i.e(value, "value");
        kotlin.jvm.internal.i.e(onValueChange, "onValueChange");
        C1086g c1086gP = interfaceC1084f.p(967048125);
        if ((i15 & 1) != 0) {
            i16 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i16 = i12 | (c1086gP.K(value) ? 4 : 2);
        } else {
            i16 = i12;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i16 |= c1086gP.k(onValueChange) ? 32 : 16;
        }
        int i55 = i16;
        int i56 = i15 & 4;
        if (i56 == 0) {
            if ((i12 & 896) == 0) {
                i55 |= c1086gP.K(hVar) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i12 & 7168) == 0) {
                    if (c1086gP.c(z10)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i55 |= i18;
                }
                i19 = i15 & 16;
                if (i19 != 0) {
                    i55 |= 24576;
                } else if ((i12 & 57344) == 0) {
                    if (c1086gP.c(z11)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i55 |= i20;
                }
                if ((i12 & 458752) != 0) {
                    if ((i15 & 32) == 0 || !c1086gP.K(f10)) {
                        i54 = 65536;
                    } else {
                        i54 = 131072;
                    }
                    i55 |= i54;
                }
                i21 = i15 & 64;
                if (i21 != 0) {
                    i55 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (c1086gP.k(pVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i55 |= i22;
                }
                i23 = i15 & 128;
                if (i23 != 0) {
                    i55 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i55 |= i24;
                }
                i25 = i15 & 256;
                if (i25 != 0) {
                    i55 |= 100663296;
                } else if ((i12 & 234881024) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i26 = 67108864;
                    } else {
                        i26 = 33554432;
                    }
                    i55 |= i26;
                }
                i27 = i15 & 512;
                if (i27 != 0) {
                    if ((i12 & 1879048192) == 0) {
                        if (c1086gP.k(pVar4)) {
                            i28 = 536870912;
                        } else {
                            i28 = 268435456;
                        }
                    }
                    i29 = i15 & 1024;
                    if (i29 != 0) {
                        i30 = i13 | 6;
                    } else if ((i13 & 14) == 0) {
                        if (c1086gP.c(z12)) {
                            i31 = 4;
                        } else {
                            i31 = 2;
                        }
                        i30 = i13 | i31;
                    } else {
                        i30 = i13;
                    }
                    i32 = i15 & 2048;
                    if (i32 != 0) {
                        i30 |= 48;
                    } else if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                        if (c1086gP.K(e10)) {
                            i33 = 32;
                        } else {
                            i33 = 16;
                        }
                        i30 |= i33;
                    }
                    i34 = i30;
                    i35 = i15 & 4096;
                    if (i35 != 0) {
                        i34 |= 384;
                    } else if ((i13 & 896) != 0) {
                        if (c1086gP.K(kVar)) {
                            i36 = 256;
                        } else {
                            i36 = 128;
                        }
                        i34 |= i36;
                    }
                    i37 = i15 & 8192;
                    if (i37 != 0) {
                        i34 |= 3072;
                    } else if ((i13 & 7168) != 0) {
                        if (c1086gP.K(jVar)) {
                            i38 = 2048;
                        } else {
                            i38 = 1024;
                        }
                        i34 |= i38;
                    }
                    i39 = i15 & 16384;
                    if (i39 != 0) {
                        i34 |= 24576;
                    } else if ((i13 & 57344) == 0) {
                        if (c1086gP.c(z13)) {
                            i40 = 16384;
                        } else {
                            i40 = 8192;
                        }
                        i34 |= i40;
                    }
                    if ((i13 & 458752) != 0) {
                        if ((i15 & 32768) == 0 || !c1086gP.h(i10)) {
                            i53 = 65536;
                        } else {
                            i53 = 131072;
                        }
                        i34 |= i53;
                    }
                    i41 = i15 & 65536;
                    if (i41 != 0) {
                        i34 |= 1572864;
                    } else if ((i13 & 3670016) == 0) {
                        if (c1086gP.h(i11)) {
                            i42 = 1048576;
                        } else {
                            i42 = 524288;
                        }
                        i34 |= i42;
                    }
                    i43 = i15 & 131072;
                    if (i43 != 0) {
                        i34 |= 12582912;
                    } else if ((i13 & 29360128) == 0) {
                        if (c1086gP.K(kVar2)) {
                            i44 = 8388608;
                        } else {
                            i44 = 4194304;
                        }
                        i34 |= i44;
                    }
                    if ((i13 & 234881024) != 0) {
                        if ((i15 & 262144) == 0 || !c1086gP.K(l0Var)) {
                            i52 = 33554432;
                        } else {
                            i52 = 67108864;
                        }
                        i34 |= i52;
                    }
                    if ((i13 & 1879048192) != 0) {
                        if ((i15 & 524288) == 0 || !c1086gP.K(textFieldColors)) {
                            i51 = 268435456;
                        } else {
                            i51 = 536870912;
                        }
                        i34 |= i51;
                    }
                    i45 = i15 & 1048576;
                    if (i45 != 0) {
                        i46 = i14 | 6;
                    } else if ((i14 & 14) == 0) {
                        i46 = i14 | (c1086gP.K(l10) ? 4 : 2);
                    } else {
                        i46 = i14;
                    }
                    if ((i55 & 1533916891) != 306783378 && (1533916891 & i34) == 306783378 && (i46 & 11) == 2 && c1086gP.s()) {
                        c1086gP.w();
                        hVar2 = hVar;
                        z19 = z10;
                        z21 = z11;
                        f12 = f10;
                        pVar12 = pVar;
                        pVar10 = pVar2;
                        pVar13 = pVar3;
                        pVar11 = pVar4;
                        z20 = z12;
                        e12 = e10;
                        kVar5 = kVar;
                        jVar3 = jVar;
                        z22 = z13;
                        i47 = i10;
                        i50 = i11;
                        kVar6 = kVar2;
                        l0Var3 = l0Var;
                        textFieldColors2 = textFieldColors;
                        l11 = l10;
                    } else {
                        c1086gP.r0();
                        if ((i12 & 1) != 0 || c1086gP.a0()) {
                            if (i56 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            } else {
                                hVar2 = hVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            } else {
                                z14 = z10;
                            }
                            if (i19 != 0) {
                                z15 = false;
                            } else {
                                z15 = z11;
                            }
                            if ((i15 & 32) != 0) {
                                f11 = (F) c1086gP.x(TextKt.f12383a);
                                i55 &= -458753;
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar5 = null;
                            } else {
                                pVar5 = pVar;
                            }
                            if (i23 != 0) {
                                pVar6 = null;
                            } else {
                                pVar6 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar7 = null;
                            } else {
                                pVar7 = pVar3;
                            }
                            pVar8 = i27 == 0 ? pVar4 : null;
                            if (i29 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i32 != 0) {
                                e11 = E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i35 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i37 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i39 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 32768) != 0) {
                                if (z17) {
                                    i47 = 1;
                                } else {
                                    i47 = BrazeLogger.SUPPRESS;
                                }
                                i34 &= -458753;
                            } else {
                                i47 = i10;
                            }
                            if (i41 != 0) {
                                i48 = 1;
                            } else {
                                i48 = i11;
                            }
                            boolean z23 = z16;
                            if (i43 != 0) {
                                c1086gP.L(1299418141);
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                kVar4 = (androidx.compose.foundation.interaction.k) objF;
                                c1086gP.T(false);
                            } else {
                                kVar4 = kVar2;
                            }
                            if ((i15 & 262144) != 0) {
                                l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                                i34 &= -234881025;
                            } else {
                                l0Var2 = l0Var;
                            }
                            if ((i15 & 524288) != 0) {
                                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f12253a;
                                TextFieldColors textFieldColorsC = OutlinedTextFieldDefaults.c(c1086gP, 6);
                                IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                                int i57 = IntercomTheme.$stable;
                                textFieldColorsA = textFieldColorsC.a(((-14837) & 1) != 0 ? textFieldColorsC.f12344a : intercomTheme.getColors(c1086gP, i57).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC.f12345b : intercomTheme.getColors(c1086gP, i57).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme.getColors(c1086gP, i57).m645getPrimaryText0d7_KjU()), textFieldColorsC.f12347d, intercomTheme.getColors(c1086gP, i57).m637getInputAlt0d7_KjU(), intercomTheme.getColors(c1086gP, i57).m637getInputAlt0d7_KjU(), intercomTheme.getColors(c1086gP, i57).m637getInputAlt0d7_KjU(), intercomTheme.getColors(c1086gP, i57).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC.f12352i : 0L, textFieldColorsC.j, textFieldColorsC.f12353k, intercomTheme.getColors(c1086gP, i57).m627getCollectorBorder0d7_KjU(), intercomTheme.getColors(c1086gP, i57).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC.f12356n : 0L, textFieldColorsC.f12357o, textFieldColorsC.f12358p, textFieldColorsC.f12359q, textFieldColorsC.f12360r, textFieldColorsC.f12361s, textFieldColorsC.f12362t, textFieldColorsC.f12363u, textFieldColorsC.f12364v, textFieldColorsC.f12365w, textFieldColorsC.f12366x, textFieldColorsC.f12367y, textFieldColorsC.f12368z, textFieldColorsC.f12327A, textFieldColorsC.f12328B, textFieldColorsC.f12329C, textFieldColorsC.f12330D, textFieldColorsC.f12331E, textFieldColorsC.f12332F, textFieldColorsC.f12333G, textFieldColorsC.f12334H, textFieldColorsC.f12335I, textFieldColorsC.f12336J, textFieldColorsC.f12337K, textFieldColorsC.f12338L, textFieldColorsC.f12339M, textFieldColorsC.f12340N, textFieldColorsC.f12341O, textFieldColorsC.f12342P, textFieldColorsC.f12343Q);
                                i34 &= -1879048193;
                            } else {
                                textFieldColorsA = textFieldColors;
                            }
                            if (i45 != 0) {
                                float f13 = 8;
                                n10 = new N(f13, f13, f13, f13);
                            } else {
                                n10 = l10;
                            }
                            pVar9 = pVar7;
                            i49 = i34;
                            z18 = z23;
                        } else {
                            c1086gP.w();
                            if ((32 & i15) != 0) {
                                i55 &= -458753;
                            }
                            if ((i15 & 32768) != 0) {
                                i34 &= -458753;
                            }
                            if ((i15 & 262144) != 0) {
                                i34 &= -234881025;
                            }
                            if ((i15 & 524288) != 0) {
                                i34 &= -1879048193;
                            }
                            hVar2 = hVar;
                            z14 = z10;
                            z15 = z11;
                            f11 = f10;
                            pVar5 = pVar;
                            pVar6 = pVar2;
                            pVar9 = pVar3;
                            pVar8 = pVar4;
                            e11 = e10;
                            jVar2 = jVar;
                            z17 = z13;
                            i47 = i10;
                            i48 = i11;
                            kVar4 = kVar2;
                            l0Var2 = l0Var;
                            textFieldColorsA = textFieldColors;
                            n10 = l10;
                            i49 = i34;
                            i55 = i55;
                            z18 = z12;
                            kVar3 = kVar;
                        }
                        c1086gP.U();
                        jB = f11.b();
                        if (jB == 16) {
                            if (z14) {
                                j11 = textFieldColorsA.f12345b;
                            } else {
                                j11 = textFieldColorsA.f12346c;
                            }
                            jB = j11;
                        }
                        F fD = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
                        if (pVar5 != null) {
                            hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
                        } else {
                            hVarJ = hVar2;
                        }
                        if (z14) {
                            j = textFieldColorsA.f12349f;
                        } else {
                            j = textFieldColorsA.f12350g;
                        }
                        androidx.compose.ui.h hVarA = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
                        if (z18) {
                            j10 = textFieldColorsA.j;
                        } else {
                            j10 = textFieldColorsA.f12352i;
                        }
                        final boolean z24 = z14;
                        final boolean z25 = z17;
                        final E e13 = e11;
                        final androidx.compose.foundation.interaction.k kVar7 = kVar4;
                        final boolean z26 = z18;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14 = pVar5;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15 = pVar6;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17 = pVar8;
                        final TextFieldColors textFieldColors3 = textFieldColorsA;
                        final L l12 = n10;
                        final l0 l0Var4 = l0Var2;
                        int i58 = i49 << 12;
                        BasicTextFieldKt.b(value, onValueChange, hVarA, z14, z15, fD, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                            @Override // Ia.q
                            public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar18, InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar18, interfaceC1084f2, num.intValue());
                                return p293xa.r.f47939a;
                            }

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
                            public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i59) {
                                int i60;
                                kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                                if ((i59 & 14) == 0) {
                                    i60 = i59 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                                } else {
                                    i60 = i59;
                                }
                                if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                    return;
                                }
                                OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.f12253a;
                                String str = value;
                                final boolean z27 = z24;
                                boolean z28 = z25;
                                E e14 = e13;
                                final androidx.compose.foundation.interaction.k kVar8 = kVar7;
                                final boolean z29 = z26;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar18 = pVar14;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar19 = pVar15;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar16;
                                Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar17;
                                final TextFieldColors textFieldColors4 = textFieldColors3;
                                L l13 = l12;
                                final l0 l0Var5 = l0Var4;
                                outlinedTextFieldDefaults2.b(str, innerTextField, z27, z28, e14, kVar8, z29, pVar18, pVar19, pVar20, pVar21, null, null, null, textFieldColors4, l13, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                                    @Override // Ia.p
                                    public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                        invoke(interfaceC1084f3, num.intValue());
                                        return p293xa.r.f47939a;
                                    }

                                    public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                                        if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                            interfaceC1084f3.w();
                                        } else {
                                            float f14 = 1;
                                            OutlinedTextFieldDefaults.f12253a.a(z27, z29, kVar8, null, textFieldColors4, l0Var5, f14, f14, interfaceC1084f3, 114819072, 8);
                                        }
                                    }
                                }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                            }
                        }, c1086gP), c1086gP, (i55 & 64638) | (i58 & 3670016) | (i58 & 29360128) | (i58 & 234881024) | (i58 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
                        kVar5 = kVar3;
                        l0Var3 = l0Var2;
                        jVar3 = jVar2;
                        pVar10 = pVar6;
                        l11 = n10;
                        z19 = z14;
                        pVar11 = pVar8;
                        f12 = f11;
                        pVar12 = pVar5;
                        z20 = z18;
                        kVar6 = kVar4;
                        i50 = i48;
                        z21 = z15;
                        z22 = z17;
                        textFieldColors2 = textFieldColorsA;
                        pVar13 = pVar9;
                        e12 = e11;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final androidx.compose.ui.h hVar3 = hVar2;
                        final boolean z27 = z20;
                        final E e14 = e12;
                        final androidx.compose.foundation.text.k kVar8 = kVar5;
                        final androidx.compose.foundation.text.j jVar4 = jVar3;
                        final boolean z28 = z22;
                        final int i59 = i47;
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.views.compose.i
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return IntercomOutlinedTextFieldKt.IntercomOutlinedTextField$lambda$3(value, onValueChange, hVar3, z19, z21, f12, pVar12, pVar10, pVar13, pVar11, z27, e14, kVar8, jVar4, z28, i59, i50, kVar6, l0Var3, textFieldColors2, l11, i12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i28 = 805306368;
                i55 |= i28;
                i29 = i15 & 1024;
                if (i29 != 0) {
                    i30 = i13 | 6;
                } else if ((i13 & 14) == 0) {
                    if (c1086gP.c(z12)) {
                        i31 = 4;
                    } else {
                        i31 = 2;
                    }
                    i30 = i13 | i31;
                } else {
                    i30 = i13;
                }
                i32 = i15 & 2048;
                if (i32 != 0) {
                    i30 |= 48;
                } else if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                    if (c1086gP.K(e10)) {
                        i33 = 32;
                    } else {
                        i33 = 16;
                    }
                    i30 |= i33;
                }
                i34 = i30;
                i35 = i15 & 4096;
                if (i35 != 0) {
                    i34 |= 384;
                } else if ((i13 & 896) != 0) {
                    if (c1086gP.K(kVar)) {
                        i36 = 256;
                    } else {
                        i36 = 128;
                    }
                    i34 |= i36;
                }
                i37 = i15 & 8192;
                if (i37 != 0) {
                    i34 |= 3072;
                } else if ((i13 & 7168) != 0) {
                    if (c1086gP.K(jVar)) {
                        i38 = 2048;
                    } else {
                        i38 = 1024;
                    }
                    i34 |= i38;
                }
                i39 = i15 & 16384;
                if (i39 != 0) {
                    i34 |= 24576;
                } else if ((i13 & 57344) == 0) {
                    if (c1086gP.c(z13)) {
                        i40 = 16384;
                    } else {
                        i40 = 8192;
                    }
                    i34 |= i40;
                }
                if ((i13 & 458752) != 0) {
                    if ((i15 & 32768) == 0) {
                        i53 = 65536;
                    } else {
                        i53 = 65536;
                    }
                    i34 |= i53;
                }
                i41 = i15 & 65536;
                if (i41 != 0) {
                    i34 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (c1086gP.h(i11)) {
                        i42 = 1048576;
                    } else {
                        i42 = 524288;
                    }
                    i34 |= i42;
                }
                i43 = i15 & 131072;
                if (i43 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (c1086gP.K(kVar2)) {
                        i44 = 8388608;
                    } else {
                        i44 = 4194304;
                    }
                    i34 |= i44;
                }
                if ((i13 & 234881024) != 0) {
                    if ((i15 & 262144) == 0) {
                        i52 = 33554432;
                    } else {
                        i52 = 33554432;
                    }
                    i34 |= i52;
                }
                if ((i13 & 1879048192) != 0) {
                    if ((i15 & 524288) == 0) {
                        i51 = 268435456;
                    } else {
                        i51 = 268435456;
                    }
                    i34 |= i51;
                }
                i45 = i15 & 1048576;
                if (i45 != 0) {
                    i46 = i14 | 6;
                } else if ((i14 & 14) == 0) {
                    i46 = i14 | (c1086gP.K(l10) ? 4 : 2);
                } else {
                    i46 = i14;
                }
                if ((i55 & 1533916891) != 306783378) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i56 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if ((i15 & 32) != 0) {
                            f11 = (F) c1086gP.x(TextKt.f12383a);
                            i55 &= -458753;
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i23 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i32 != 0) {
                            e11 = E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i35 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i37 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i39 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 32768) != 0) {
                            if (z17) {
                                i47 = 1;
                            } else {
                                i47 = BrazeLogger.SUPPRESS;
                            }
                            i34 &= -458753;
                        } else {
                            i47 = i10;
                        }
                        if (i41 != 0) {
                            i48 = 1;
                        } else {
                            i48 = i11;
                        }
                        boolean z29 = z16;
                        if (i43 != 0) {
                            c1086gP.L(1299418141);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar4 = (androidx.compose.foundation.interaction.k) objF;
                            c1086gP.T(false);
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i15 & 262144) != 0) {
                            l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                            i34 &= -234881025;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i15 & 524288) != 0) {
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.f12253a;
                            TextFieldColors textFieldColorsC2 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                            IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                            int i510 = IntercomTheme.$stable;
                            textFieldColorsA = textFieldColorsC2.a(((-14837) & 1) != 0 ? textFieldColorsC2.f12344a : intercomTheme2.getColors(c1086gP, i510).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC2.f12345b : intercomTheme2.getColors(c1086gP, i510).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme2.getColors(c1086gP, i510).m645getPrimaryText0d7_KjU()), textFieldColorsC2.f12347d, intercomTheme2.getColors(c1086gP, i510).m637getInputAlt0d7_KjU(), intercomTheme2.getColors(c1086gP, i510).m637getInputAlt0d7_KjU(), intercomTheme2.getColors(c1086gP, i510).m637getInputAlt0d7_KjU(), intercomTheme2.getColors(c1086gP, i510).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC2.f12352i : 0L, textFieldColorsC2.j, textFieldColorsC2.f12353k, intercomTheme2.getColors(c1086gP, i510).m627getCollectorBorder0d7_KjU(), intercomTheme2.getColors(c1086gP, i510).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC2.f12356n : 0L, textFieldColorsC2.f12357o, textFieldColorsC2.f12358p, textFieldColorsC2.f12359q, textFieldColorsC2.f12360r, textFieldColorsC2.f12361s, textFieldColorsC2.f12362t, textFieldColorsC2.f12363u, textFieldColorsC2.f12364v, textFieldColorsC2.f12365w, textFieldColorsC2.f12366x, textFieldColorsC2.f12367y, textFieldColorsC2.f12368z, textFieldColorsC2.f12327A, textFieldColorsC2.f12328B, textFieldColorsC2.f12329C, textFieldColorsC2.f12330D, textFieldColorsC2.f12331E, textFieldColorsC2.f12332F, textFieldColorsC2.f12333G, textFieldColorsC2.f12334H, textFieldColorsC2.f12335I, textFieldColorsC2.f12336J, textFieldColorsC2.f12337K, textFieldColorsC2.f12338L, textFieldColorsC2.f12339M, textFieldColorsC2.f12340N, textFieldColorsC2.f12341O, textFieldColorsC2.f12342P, textFieldColorsC2.f12343Q);
                            i34 &= -1879048193;
                        } else {
                            textFieldColorsA = textFieldColors;
                        }
                        if (i45 != 0) {
                            float f14 = 8;
                            n10 = new N(f14, f14, f14, f14);
                        } else {
                            n10 = l10;
                        }
                        pVar9 = pVar7;
                        i49 = i34;
                        z18 = z29;
                    } else {
                        if (i56 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if ((i15 & 32) != 0) {
                            f11 = (F) c1086gP.x(TextKt.f12383a);
                            i55 &= -458753;
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i23 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i32 != 0) {
                            e11 = E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i35 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i37 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i39 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 32768) != 0) {
                            if (z17) {
                                i47 = 1;
                            } else {
                                i47 = BrazeLogger.SUPPRESS;
                            }
                            i34 &= -458753;
                        } else {
                            i47 = i10;
                        }
                        if (i41 != 0) {
                            i48 = 1;
                        } else {
                            i48 = i11;
                        }
                        boolean z210 = z16;
                        if (i43 != 0) {
                            c1086gP.L(1299418141);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar4 = (androidx.compose.foundation.interaction.k) objF;
                            c1086gP.T(false);
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i15 & 262144) != 0) {
                            l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                            i34 &= -234881025;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i15 & 524288) != 0) {
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults3 = OutlinedTextFieldDefaults.f12253a;
                            TextFieldColors textFieldColorsC3 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                            IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                            int i511 = IntercomTheme.$stable;
                            textFieldColorsA = textFieldColorsC3.a(((-14837) & 1) != 0 ? textFieldColorsC3.f12344a : intercomTheme3.getColors(c1086gP, i511).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC3.f12345b : intercomTheme3.getColors(c1086gP, i511).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme3.getColors(c1086gP, i511).m645getPrimaryText0d7_KjU()), textFieldColorsC3.f12347d, intercomTheme3.getColors(c1086gP, i511).m637getInputAlt0d7_KjU(), intercomTheme3.getColors(c1086gP, i511).m637getInputAlt0d7_KjU(), intercomTheme3.getColors(c1086gP, i511).m637getInputAlt0d7_KjU(), intercomTheme3.getColors(c1086gP, i511).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC3.f12352i : 0L, textFieldColorsC3.j, textFieldColorsC3.f12353k, intercomTheme3.getColors(c1086gP, i511).m627getCollectorBorder0d7_KjU(), intercomTheme3.getColors(c1086gP, i511).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC3.f12356n : 0L, textFieldColorsC3.f12357o, textFieldColorsC3.f12358p, textFieldColorsC3.f12359q, textFieldColorsC3.f12360r, textFieldColorsC3.f12361s, textFieldColorsC3.f12362t, textFieldColorsC3.f12363u, textFieldColorsC3.f12364v, textFieldColorsC3.f12365w, textFieldColorsC3.f12366x, textFieldColorsC3.f12367y, textFieldColorsC3.f12368z, textFieldColorsC3.f12327A, textFieldColorsC3.f12328B, textFieldColorsC3.f12329C, textFieldColorsC3.f12330D, textFieldColorsC3.f12331E, textFieldColorsC3.f12332F, textFieldColorsC3.f12333G, textFieldColorsC3.f12334H, textFieldColorsC3.f12335I, textFieldColorsC3.f12336J, textFieldColorsC3.f12337K, textFieldColorsC3.f12338L, textFieldColorsC3.f12339M, textFieldColorsC3.f12340N, textFieldColorsC3.f12341O, textFieldColorsC3.f12342P, textFieldColorsC3.f12343Q);
                            i34 &= -1879048193;
                        } else {
                            textFieldColorsA = textFieldColors;
                        }
                        if (i45 != 0) {
                            float f15 = 8;
                            n10 = new N(f15, f15, f15, f15);
                        } else {
                            n10 = l10;
                        }
                        pVar9 = pVar7;
                        i49 = i34;
                        z18 = z210;
                    }
                    c1086gP.U();
                    jB = f11.b();
                    if (jB == 16) {
                        if (z14) {
                            j11 = textFieldColorsA.f12345b;
                        } else {
                            j11 = textFieldColorsA.f12346c;
                        }
                        jB = j11;
                    }
                    F fD2 = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    if (pVar5 != null) {
                        hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
                    } else {
                        hVarJ = hVar2;
                    }
                    if (z14) {
                        j = textFieldColorsA.f12349f;
                    } else {
                        j = textFieldColorsA.f12350g;
                    }
                    androidx.compose.ui.h hVarA2 = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
                    if (z18) {
                        j10 = textFieldColorsA.j;
                    } else {
                        j10 = textFieldColorsA.f12352i;
                    }
                    final boolean z211 = z14;
                    final boolean z212 = z17;
                    final E e15 = e11;
                    final androidx.compose.foundation.interaction.k kVar9 = kVar4;
                    final boolean z213 = z18;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18 = pVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19 = pVar6;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar110 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111 = pVar8;
                    final TextFieldColors textFieldColors4 = textFieldColorsA;
                    final L l13 = n10;
                    final l0 l0Var5 = l0Var2;
                    int i512 = i49 << 12;
                    BasicTextFieldKt.b(value, onValueChange, hVarA2, z14, z15, fD2, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar112, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar112, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

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
                        public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i513) {
                            int i60;
                            kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                            if ((i513 & 14) == 0) {
                                i60 = i513 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                            } else {
                                i60 = i513;
                            }
                            if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults4 = OutlinedTextFieldDefaults.f12253a;
                            String str = value;
                            final boolean z214 = z211;
                            boolean z215 = z212;
                            E e16 = e15;
                            final androidx.compose.foundation.interaction.k kVar10 = kVar9;
                            final boolean z216 = z213;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar112 = pVar18;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar113 = pVar19;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar110;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar111;
                            final TextFieldColors textFieldColors5 = textFieldColors4;
                            L l14 = l13;
                            final l0 l0Var6 = l0Var5;
                            outlinedTextFieldDefaults4.b(str, innerTextField, z214, z215, e16, kVar10, z216, pVar112, pVar113, pVar20, pVar21, null, null, null, textFieldColors5, l14, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                                    if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        float f16 = 1;
                                        OutlinedTextFieldDefaults.f12253a.a(z214, z216, kVar10, null, textFieldColors5, l0Var6, f16, f16, interfaceC1084f3, 114819072, 8);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                        }
                    }, c1086gP), c1086gP, (i55 & 64638) | (i512 & 3670016) | (i512 & 29360128) | (i512 & 234881024) | (i512 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
                    kVar5 = kVar3;
                    l0Var3 = l0Var2;
                    jVar3 = jVar2;
                    pVar10 = pVar6;
                    l11 = n10;
                    z19 = z14;
                    pVar11 = pVar8;
                    f12 = f11;
                    pVar12 = pVar5;
                    z20 = z18;
                    kVar6 = kVar4;
                    i50 = i48;
                    z21 = z15;
                    z22 = z17;
                    textFieldColors2 = textFieldColorsA;
                    pVar13 = pVar9;
                    e12 = e11;
                } else {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i56 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if ((i15 & 32) != 0) {
                            f11 = (F) c1086gP.x(TextKt.f12383a);
                            i55 &= -458753;
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i23 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i32 != 0) {
                            e11 = E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i35 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i37 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i39 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 32768) != 0) {
                            if (z17) {
                                i47 = 1;
                            } else {
                                i47 = BrazeLogger.SUPPRESS;
                            }
                            i34 &= -458753;
                        } else {
                            i47 = i10;
                        }
                        if (i41 != 0) {
                            i48 = 1;
                        } else {
                            i48 = i11;
                        }
                        boolean z214 = z16;
                        if (i43 != 0) {
                            c1086gP.L(1299418141);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar4 = (androidx.compose.foundation.interaction.k) objF;
                            c1086gP.T(false);
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i15 & 262144) != 0) {
                            l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                            i34 &= -234881025;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i15 & 524288) != 0) {
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults4 = OutlinedTextFieldDefaults.f12253a;
                            TextFieldColors textFieldColorsC4 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                            IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                            int i513 = IntercomTheme.$stable;
                            textFieldColorsA = textFieldColorsC4.a(((-14837) & 1) != 0 ? textFieldColorsC4.f12344a : intercomTheme4.getColors(c1086gP, i513).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC4.f12345b : intercomTheme4.getColors(c1086gP, i513).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme4.getColors(c1086gP, i513).m645getPrimaryText0d7_KjU()), textFieldColorsC4.f12347d, intercomTheme4.getColors(c1086gP, i513).m637getInputAlt0d7_KjU(), intercomTheme4.getColors(c1086gP, i513).m637getInputAlt0d7_KjU(), intercomTheme4.getColors(c1086gP, i513).m637getInputAlt0d7_KjU(), intercomTheme4.getColors(c1086gP, i513).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC4.f12352i : 0L, textFieldColorsC4.j, textFieldColorsC4.f12353k, intercomTheme4.getColors(c1086gP, i513).m627getCollectorBorder0d7_KjU(), intercomTheme4.getColors(c1086gP, i513).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC4.f12356n : 0L, textFieldColorsC4.f12357o, textFieldColorsC4.f12358p, textFieldColorsC4.f12359q, textFieldColorsC4.f12360r, textFieldColorsC4.f12361s, textFieldColorsC4.f12362t, textFieldColorsC4.f12363u, textFieldColorsC4.f12364v, textFieldColorsC4.f12365w, textFieldColorsC4.f12366x, textFieldColorsC4.f12367y, textFieldColorsC4.f12368z, textFieldColorsC4.f12327A, textFieldColorsC4.f12328B, textFieldColorsC4.f12329C, textFieldColorsC4.f12330D, textFieldColorsC4.f12331E, textFieldColorsC4.f12332F, textFieldColorsC4.f12333G, textFieldColorsC4.f12334H, textFieldColorsC4.f12335I, textFieldColorsC4.f12336J, textFieldColorsC4.f12337K, textFieldColorsC4.f12338L, textFieldColorsC4.f12339M, textFieldColorsC4.f12340N, textFieldColorsC4.f12341O, textFieldColorsC4.f12342P, textFieldColorsC4.f12343Q);
                            i34 &= -1879048193;
                        } else {
                            textFieldColorsA = textFieldColors;
                        }
                        if (i45 != 0) {
                            float f16 = 8;
                            n10 = new N(f16, f16, f16, f16);
                        } else {
                            n10 = l10;
                        }
                        pVar9 = pVar7;
                        i49 = i34;
                        z18 = z214;
                    } else {
                        if (i56 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if ((i15 & 32) != 0) {
                            f11 = (F) c1086gP.x(TextKt.f12383a);
                            i55 &= -458753;
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i23 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i32 != 0) {
                            e11 = E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i35 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i37 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i39 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 32768) != 0) {
                            if (z17) {
                                i47 = 1;
                            } else {
                                i47 = BrazeLogger.SUPPRESS;
                            }
                            i34 &= -458753;
                        } else {
                            i47 = i10;
                        }
                        if (i41 != 0) {
                            i48 = 1;
                        } else {
                            i48 = i11;
                        }
                        boolean z215 = z16;
                        if (i43 != 0) {
                            c1086gP.L(1299418141);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar4 = (androidx.compose.foundation.interaction.k) objF;
                            c1086gP.T(false);
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i15 & 262144) != 0) {
                            l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                            i34 &= -234881025;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i15 & 524288) != 0) {
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults5 = OutlinedTextFieldDefaults.f12253a;
                            TextFieldColors textFieldColorsC5 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                            IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                            int i514 = IntercomTheme.$stable;
                            textFieldColorsA = textFieldColorsC5.a(((-14837) & 1) != 0 ? textFieldColorsC5.f12344a : intercomTheme5.getColors(c1086gP, i514).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC5.f12345b : intercomTheme5.getColors(c1086gP, i514).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme5.getColors(c1086gP, i514).m645getPrimaryText0d7_KjU()), textFieldColorsC5.f12347d, intercomTheme5.getColors(c1086gP, i514).m637getInputAlt0d7_KjU(), intercomTheme5.getColors(c1086gP, i514).m637getInputAlt0d7_KjU(), intercomTheme5.getColors(c1086gP, i514).m637getInputAlt0d7_KjU(), intercomTheme5.getColors(c1086gP, i514).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC5.f12352i : 0L, textFieldColorsC5.j, textFieldColorsC5.f12353k, intercomTheme5.getColors(c1086gP, i514).m627getCollectorBorder0d7_KjU(), intercomTheme5.getColors(c1086gP, i514).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC5.f12356n : 0L, textFieldColorsC5.f12357o, textFieldColorsC5.f12358p, textFieldColorsC5.f12359q, textFieldColorsC5.f12360r, textFieldColorsC5.f12361s, textFieldColorsC5.f12362t, textFieldColorsC5.f12363u, textFieldColorsC5.f12364v, textFieldColorsC5.f12365w, textFieldColorsC5.f12366x, textFieldColorsC5.f12367y, textFieldColorsC5.f12368z, textFieldColorsC5.f12327A, textFieldColorsC5.f12328B, textFieldColorsC5.f12329C, textFieldColorsC5.f12330D, textFieldColorsC5.f12331E, textFieldColorsC5.f12332F, textFieldColorsC5.f12333G, textFieldColorsC5.f12334H, textFieldColorsC5.f12335I, textFieldColorsC5.f12336J, textFieldColorsC5.f12337K, textFieldColorsC5.f12338L, textFieldColorsC5.f12339M, textFieldColorsC5.f12340N, textFieldColorsC5.f12341O, textFieldColorsC5.f12342P, textFieldColorsC5.f12343Q);
                            i34 &= -1879048193;
                        } else {
                            textFieldColorsA = textFieldColors;
                        }
                        if (i45 != 0) {
                            float f17 = 8;
                            n10 = new N(f17, f17, f17, f17);
                        } else {
                            n10 = l10;
                        }
                        pVar9 = pVar7;
                        i49 = i34;
                        z18 = z215;
                    }
                    c1086gP.U();
                    jB = f11.b();
                    if (jB == 16) {
                        if (z14) {
                            j11 = textFieldColorsA.f12345b;
                        } else {
                            j11 = textFieldColorsA.f12346c;
                        }
                        jB = j11;
                    }
                    F fD3 = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    if (pVar5 != null) {
                        hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
                    } else {
                        hVarJ = hVar2;
                    }
                    if (z14) {
                        j = textFieldColorsA.f12349f;
                    } else {
                        j = textFieldColorsA.f12350g;
                    }
                    androidx.compose.ui.h hVarA3 = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
                    if (z18) {
                        j10 = textFieldColorsA.j;
                    } else {
                        j10 = textFieldColorsA.f12352i;
                    }
                    final boolean z216 = z14;
                    final boolean z217 = z17;
                    final E e16 = e11;
                    final androidx.compose.foundation.interaction.k kVar10 = kVar4;
                    final boolean z218 = z18;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar112 = pVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar113 = pVar6;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar114 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar115 = pVar8;
                    final TextFieldColors textFieldColors5 = textFieldColorsA;
                    final L l14 = n10;
                    final l0 l0Var6 = l0Var2;
                    int i515 = i49 << 12;
                    BasicTextFieldKt.b(value, onValueChange, hVarA3, z14, z15, fD3, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar116, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar116, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

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
                        public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i516) {
                            int i60;
                            kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                            if ((i516 & 14) == 0) {
                                i60 = i516 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                            } else {
                                i60 = i516;
                            }
                            if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults6 = OutlinedTextFieldDefaults.f12253a;
                            String str = value;
                            final boolean z219 = z216;
                            boolean z2110 = z217;
                            E e17 = e16;
                            final androidx.compose.foundation.interaction.k kVar11 = kVar10;
                            final boolean z2111 = z218;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar116 = pVar112;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar117 = pVar113;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar114;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar115;
                            final TextFieldColors textFieldColors6 = textFieldColors5;
                            L l15 = l14;
                            final l0 l0Var7 = l0Var6;
                            outlinedTextFieldDefaults6.b(str, innerTextField, z219, z2110, e17, kVar11, z2111, pVar116, pVar117, pVar20, pVar21, null, null, null, textFieldColors6, l15, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                                    if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        float f18 = 1;
                                        OutlinedTextFieldDefaults.f12253a.a(z219, z2111, kVar11, null, textFieldColors6, l0Var7, f18, f18, interfaceC1084f3, 114819072, 8);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                        }
                    }, c1086gP), c1086gP, (i55 & 64638) | (i515 & 3670016) | (i515 & 29360128) | (i515 & 234881024) | (i515 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
                    kVar5 = kVar3;
                    l0Var3 = l0Var2;
                    jVar3 = jVar2;
                    pVar10 = pVar6;
                    l11 = n10;
                    z19 = z14;
                    pVar11 = pVar8;
                    f12 = f11;
                    pVar12 = pVar5;
                    z20 = z18;
                    kVar6 = kVar4;
                    i50 = i48;
                    z21 = z15;
                    z22 = z17;
                    textFieldColors2 = textFieldColorsA;
                    pVar13 = pVar9;
                    e12 = e11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.h hVar4 = hVar2;
                    final boolean z219 = z20;
                    final E e17 = e12;
                    final androidx.compose.foundation.text.k kVar11 = kVar5;
                    final androidx.compose.foundation.text.j jVar5 = jVar3;
                    final boolean z220 = z22;
                    final int i516 = i47;
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.views.compose.i
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomOutlinedTextFieldKt.IntercomOutlinedTextField$lambda$3(value, onValueChange, hVar4, z19, z21, f12, pVar12, pVar10, pVar13, pVar11, z219, e17, kVar11, jVar5, z220, i516, i50, kVar6, l0Var3, textFieldColors2, l11, i12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i55 |= 3072;
            i19 = i15 & 16;
            if (i19 != 0) {
                i55 |= 24576;
            } else if ((i12 & 57344) == 0) {
                if (c1086gP.c(z11)) {
                    i20 = 16384;
                } else {
                    i20 = 8192;
                }
                i55 |= i20;
            }
            if ((i12 & 458752) != 0) {
                if ((i15 & 32) == 0) {
                    i54 = 65536;
                } else {
                    i54 = 65536;
                }
                i55 |= i54;
            }
            i21 = i15 & 64;
            if (i21 != 0) {
                i55 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (c1086gP.k(pVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i55 |= i22;
            }
            i23 = i15 & 128;
            if (i23 != 0) {
                i55 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (c1086gP.k(pVar2)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i55 |= i24;
            }
            i25 = i15 & 256;
            if (i25 != 0) {
                i55 |= 100663296;
            } else if ((i12 & 234881024) == 0) {
                if (c1086gP.k(pVar3)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i55 |= i26;
            }
            i27 = i15 & 512;
            if (i27 != 0) {
                if ((i12 & 1879048192) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                }
                i29 = i15 & 1024;
                if (i29 != 0) {
                    i30 = i13 | 6;
                } else if ((i13 & 14) == 0) {
                    if (c1086gP.c(z12)) {
                        i31 = 4;
                    } else {
                        i31 = 2;
                    }
                    i30 = i13 | i31;
                } else {
                    i30 = i13;
                }
                i32 = i15 & 2048;
                if (i32 != 0) {
                    i30 |= 48;
                } else if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                    if (c1086gP.K(e10)) {
                        i33 = 32;
                    } else {
                        i33 = 16;
                    }
                    i30 |= i33;
                }
                i34 = i30;
                i35 = i15 & 4096;
                if (i35 != 0) {
                    i34 |= 384;
                } else if ((i13 & 896) != 0) {
                    if (c1086gP.K(kVar)) {
                        i36 = 256;
                    } else {
                        i36 = 128;
                    }
                    i34 |= i36;
                }
                i37 = i15 & 8192;
                if (i37 != 0) {
                    i34 |= 3072;
                } else if ((i13 & 7168) != 0) {
                    if (c1086gP.K(jVar)) {
                        i38 = 2048;
                    } else {
                        i38 = 1024;
                    }
                    i34 |= i38;
                }
                i39 = i15 & 16384;
                if (i39 != 0) {
                    i34 |= 24576;
                } else if ((i13 & 57344) == 0) {
                    if (c1086gP.c(z13)) {
                        i40 = 16384;
                    } else {
                        i40 = 8192;
                    }
                    i34 |= i40;
                }
                if ((i13 & 458752) != 0) {
                    if ((i15 & 32768) == 0) {
                        i53 = 65536;
                    } else {
                        i53 = 65536;
                    }
                    i34 |= i53;
                }
                i41 = i15 & 65536;
                if (i41 != 0) {
                    i34 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (c1086gP.h(i11)) {
                        i42 = 1048576;
                    } else {
                        i42 = 524288;
                    }
                    i34 |= i42;
                }
                i43 = i15 & 131072;
                if (i43 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (c1086gP.K(kVar2)) {
                        i44 = 8388608;
                    } else {
                        i44 = 4194304;
                    }
                    i34 |= i44;
                }
                if ((i13 & 234881024) != 0) {
                    if ((i15 & 262144) == 0) {
                        i52 = 33554432;
                    } else {
                        i52 = 33554432;
                    }
                    i34 |= i52;
                }
                if ((i13 & 1879048192) != 0) {
                    if ((i15 & 524288) == 0) {
                        i51 = 268435456;
                    } else {
                        i51 = 268435456;
                    }
                    i34 |= i51;
                }
                i45 = i15 & 1048576;
                if (i45 != 0) {
                    i46 = i14 | 6;
                } else if ((i14 & 14) == 0) {
                    i46 = i14 | (c1086gP.K(l10) ? 4 : 2);
                } else {
                    i46 = i14;
                }
                if ((i55 & 1533916891) != 306783378) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i56 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if ((i15 & 32) != 0) {
                            f11 = (F) c1086gP.x(TextKt.f12383a);
                            i55 &= -458753;
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i23 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i32 != 0) {
                            e11 = E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i35 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i37 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i39 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 32768) != 0) {
                            if (z17) {
                                i47 = 1;
                            } else {
                                i47 = BrazeLogger.SUPPRESS;
                            }
                            i34 &= -458753;
                        } else {
                            i47 = i10;
                        }
                        if (i41 != 0) {
                            i48 = 1;
                        } else {
                            i48 = i11;
                        }
                        boolean z2110 = z16;
                        if (i43 != 0) {
                            c1086gP.L(1299418141);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar4 = (androidx.compose.foundation.interaction.k) objF;
                            c1086gP.T(false);
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i15 & 262144) != 0) {
                            l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                            i34 &= -234881025;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i15 & 524288) != 0) {
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults6 = OutlinedTextFieldDefaults.f12253a;
                            TextFieldColors textFieldColorsC6 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                            IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                            int i517 = IntercomTheme.$stable;
                            textFieldColorsA = textFieldColorsC6.a(((-14837) & 1) != 0 ? textFieldColorsC6.f12344a : intercomTheme6.getColors(c1086gP, i517).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC6.f12345b : intercomTheme6.getColors(c1086gP, i517).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme6.getColors(c1086gP, i517).m645getPrimaryText0d7_KjU()), textFieldColorsC6.f12347d, intercomTheme6.getColors(c1086gP, i517).m637getInputAlt0d7_KjU(), intercomTheme6.getColors(c1086gP, i517).m637getInputAlt0d7_KjU(), intercomTheme6.getColors(c1086gP, i517).m637getInputAlt0d7_KjU(), intercomTheme6.getColors(c1086gP, i517).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC6.f12352i : 0L, textFieldColorsC6.j, textFieldColorsC6.f12353k, intercomTheme6.getColors(c1086gP, i517).m627getCollectorBorder0d7_KjU(), intercomTheme6.getColors(c1086gP, i517).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC6.f12356n : 0L, textFieldColorsC6.f12357o, textFieldColorsC6.f12358p, textFieldColorsC6.f12359q, textFieldColorsC6.f12360r, textFieldColorsC6.f12361s, textFieldColorsC6.f12362t, textFieldColorsC6.f12363u, textFieldColorsC6.f12364v, textFieldColorsC6.f12365w, textFieldColorsC6.f12366x, textFieldColorsC6.f12367y, textFieldColorsC6.f12368z, textFieldColorsC6.f12327A, textFieldColorsC6.f12328B, textFieldColorsC6.f12329C, textFieldColorsC6.f12330D, textFieldColorsC6.f12331E, textFieldColorsC6.f12332F, textFieldColorsC6.f12333G, textFieldColorsC6.f12334H, textFieldColorsC6.f12335I, textFieldColorsC6.f12336J, textFieldColorsC6.f12337K, textFieldColorsC6.f12338L, textFieldColorsC6.f12339M, textFieldColorsC6.f12340N, textFieldColorsC6.f12341O, textFieldColorsC6.f12342P, textFieldColorsC6.f12343Q);
                            i34 &= -1879048193;
                        } else {
                            textFieldColorsA = textFieldColors;
                        }
                        if (i45 != 0) {
                            float f18 = 8;
                            n10 = new N(f18, f18, f18, f18);
                        } else {
                            n10 = l10;
                        }
                        pVar9 = pVar7;
                        i49 = i34;
                        z18 = z2110;
                    } else {
                        if (i56 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if ((i15 & 32) != 0) {
                            f11 = (F) c1086gP.x(TextKt.f12383a);
                            i55 &= -458753;
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i23 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i32 != 0) {
                            e11 = E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i35 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i37 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i39 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 32768) != 0) {
                            if (z17) {
                                i47 = 1;
                            } else {
                                i47 = BrazeLogger.SUPPRESS;
                            }
                            i34 &= -458753;
                        } else {
                            i47 = i10;
                        }
                        if (i41 != 0) {
                            i48 = 1;
                        } else {
                            i48 = i11;
                        }
                        boolean z2111 = z16;
                        if (i43 != 0) {
                            c1086gP.L(1299418141);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar4 = (androidx.compose.foundation.interaction.k) objF;
                            c1086gP.T(false);
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i15 & 262144) != 0) {
                            l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                            i34 &= -234881025;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i15 & 524288) != 0) {
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults7 = OutlinedTextFieldDefaults.f12253a;
                            TextFieldColors textFieldColorsC7 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                            IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                            int i518 = IntercomTheme.$stable;
                            textFieldColorsA = textFieldColorsC7.a(((-14837) & 1) != 0 ? textFieldColorsC7.f12344a : intercomTheme7.getColors(c1086gP, i518).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC7.f12345b : intercomTheme7.getColors(c1086gP, i518).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme7.getColors(c1086gP, i518).m645getPrimaryText0d7_KjU()), textFieldColorsC7.f12347d, intercomTheme7.getColors(c1086gP, i518).m637getInputAlt0d7_KjU(), intercomTheme7.getColors(c1086gP, i518).m637getInputAlt0d7_KjU(), intercomTheme7.getColors(c1086gP, i518).m637getInputAlt0d7_KjU(), intercomTheme7.getColors(c1086gP, i518).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC7.f12352i : 0L, textFieldColorsC7.j, textFieldColorsC7.f12353k, intercomTheme7.getColors(c1086gP, i518).m627getCollectorBorder0d7_KjU(), intercomTheme7.getColors(c1086gP, i518).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC7.f12356n : 0L, textFieldColorsC7.f12357o, textFieldColorsC7.f12358p, textFieldColorsC7.f12359q, textFieldColorsC7.f12360r, textFieldColorsC7.f12361s, textFieldColorsC7.f12362t, textFieldColorsC7.f12363u, textFieldColorsC7.f12364v, textFieldColorsC7.f12365w, textFieldColorsC7.f12366x, textFieldColorsC7.f12367y, textFieldColorsC7.f12368z, textFieldColorsC7.f12327A, textFieldColorsC7.f12328B, textFieldColorsC7.f12329C, textFieldColorsC7.f12330D, textFieldColorsC7.f12331E, textFieldColorsC7.f12332F, textFieldColorsC7.f12333G, textFieldColorsC7.f12334H, textFieldColorsC7.f12335I, textFieldColorsC7.f12336J, textFieldColorsC7.f12337K, textFieldColorsC7.f12338L, textFieldColorsC7.f12339M, textFieldColorsC7.f12340N, textFieldColorsC7.f12341O, textFieldColorsC7.f12342P, textFieldColorsC7.f12343Q);
                            i34 &= -1879048193;
                        } else {
                            textFieldColorsA = textFieldColors;
                        }
                        if (i45 != 0) {
                            float f19 = 8;
                            n10 = new N(f19, f19, f19, f19);
                        } else {
                            n10 = l10;
                        }
                        pVar9 = pVar7;
                        i49 = i34;
                        z18 = z2111;
                    }
                    c1086gP.U();
                    jB = f11.b();
                    if (jB == 16) {
                        if (z14) {
                            j11 = textFieldColorsA.f12345b;
                        } else {
                            j11 = textFieldColorsA.f12346c;
                        }
                        jB = j11;
                    }
                    F fD4 = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    if (pVar5 != null) {
                        hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
                    } else {
                        hVarJ = hVar2;
                    }
                    if (z14) {
                        j = textFieldColorsA.f12349f;
                    } else {
                        j = textFieldColorsA.f12350g;
                    }
                    androidx.compose.ui.h hVarA4 = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
                    if (z18) {
                        j10 = textFieldColorsA.j;
                    } else {
                        j10 = textFieldColorsA.f12352i;
                    }
                    final boolean z2112 = z14;
                    final boolean z2113 = z17;
                    final E e18 = e11;
                    final androidx.compose.foundation.interaction.k kVar12 = kVar4;
                    final boolean z2114 = z18;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar116 = pVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar117 = pVar6;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar118 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar119 = pVar8;
                    final TextFieldColors textFieldColors6 = textFieldColorsA;
                    final L l15 = n10;
                    final l0 l0Var7 = l0Var2;
                    int i519 = i49 << 12;
                    BasicTextFieldKt.b(value, onValueChange, hVarA4, z14, z15, fD4, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1110, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar1110, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

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
                        public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i5110) {
                            int i60;
                            kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                            if ((i5110 & 14) == 0) {
                                i60 = i5110 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                            } else {
                                i60 = i5110;
                            }
                            if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults8 = OutlinedTextFieldDefaults.f12253a;
                            String str = value;
                            final boolean z2115 = z2112;
                            boolean z2116 = z2113;
                            E e19 = e18;
                            final androidx.compose.foundation.interaction.k kVar13 = kVar12;
                            final boolean z2117 = z2114;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar1110 = pVar116;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar1111 = pVar117;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar118;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar119;
                            final TextFieldColors textFieldColors7 = textFieldColors6;
                            L l16 = l15;
                            final l0 l0Var8 = l0Var7;
                            outlinedTextFieldDefaults8.b(str, innerTextField, z2115, z2116, e19, kVar13, z2117, pVar1110, pVar1111, pVar20, pVar21, null, null, null, textFieldColors7, l16, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                                    if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        float f110 = 1;
                                        OutlinedTextFieldDefaults.f12253a.a(z2115, z2117, kVar13, null, textFieldColors7, l0Var8, f110, f110, interfaceC1084f3, 114819072, 8);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                        }
                    }, c1086gP), c1086gP, (i55 & 64638) | (i519 & 3670016) | (i519 & 29360128) | (i519 & 234881024) | (i519 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
                    kVar5 = kVar3;
                    l0Var3 = l0Var2;
                    jVar3 = jVar2;
                    pVar10 = pVar6;
                    l11 = n10;
                    z19 = z14;
                    pVar11 = pVar8;
                    f12 = f11;
                    pVar12 = pVar5;
                    z20 = z18;
                    kVar6 = kVar4;
                    i50 = i48;
                    z21 = z15;
                    z22 = z17;
                    textFieldColors2 = textFieldColorsA;
                    pVar13 = pVar9;
                    e12 = e11;
                } else {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i56 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if ((i15 & 32) != 0) {
                            f11 = (F) c1086gP.x(TextKt.f12383a);
                            i55 &= -458753;
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i23 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i32 != 0) {
                            e11 = E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i35 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i37 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i39 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 32768) != 0) {
                            if (z17) {
                                i47 = 1;
                            } else {
                                i47 = BrazeLogger.SUPPRESS;
                            }
                            i34 &= -458753;
                        } else {
                            i47 = i10;
                        }
                        if (i41 != 0) {
                            i48 = 1;
                        } else {
                            i48 = i11;
                        }
                        boolean z2115 = z16;
                        if (i43 != 0) {
                            c1086gP.L(1299418141);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar4 = (androidx.compose.foundation.interaction.k) objF;
                            c1086gP.T(false);
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i15 & 262144) != 0) {
                            l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                            i34 &= -234881025;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i15 & 524288) != 0) {
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults8 = OutlinedTextFieldDefaults.f12253a;
                            TextFieldColors textFieldColorsC8 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                            IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                            int i5110 = IntercomTheme.$stable;
                            textFieldColorsA = textFieldColorsC8.a(((-14837) & 1) != 0 ? textFieldColorsC8.f12344a : intercomTheme8.getColors(c1086gP, i5110).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC8.f12345b : intercomTheme8.getColors(c1086gP, i5110).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme8.getColors(c1086gP, i5110).m645getPrimaryText0d7_KjU()), textFieldColorsC8.f12347d, intercomTheme8.getColors(c1086gP, i5110).m637getInputAlt0d7_KjU(), intercomTheme8.getColors(c1086gP, i5110).m637getInputAlt0d7_KjU(), intercomTheme8.getColors(c1086gP, i5110).m637getInputAlt0d7_KjU(), intercomTheme8.getColors(c1086gP, i5110).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC8.f12352i : 0L, textFieldColorsC8.j, textFieldColorsC8.f12353k, intercomTheme8.getColors(c1086gP, i5110).m627getCollectorBorder0d7_KjU(), intercomTheme8.getColors(c1086gP, i5110).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC8.f12356n : 0L, textFieldColorsC8.f12357o, textFieldColorsC8.f12358p, textFieldColorsC8.f12359q, textFieldColorsC8.f12360r, textFieldColorsC8.f12361s, textFieldColorsC8.f12362t, textFieldColorsC8.f12363u, textFieldColorsC8.f12364v, textFieldColorsC8.f12365w, textFieldColorsC8.f12366x, textFieldColorsC8.f12367y, textFieldColorsC8.f12368z, textFieldColorsC8.f12327A, textFieldColorsC8.f12328B, textFieldColorsC8.f12329C, textFieldColorsC8.f12330D, textFieldColorsC8.f12331E, textFieldColorsC8.f12332F, textFieldColorsC8.f12333G, textFieldColorsC8.f12334H, textFieldColorsC8.f12335I, textFieldColorsC8.f12336J, textFieldColorsC8.f12337K, textFieldColorsC8.f12338L, textFieldColorsC8.f12339M, textFieldColorsC8.f12340N, textFieldColorsC8.f12341O, textFieldColorsC8.f12342P, textFieldColorsC8.f12343Q);
                            i34 &= -1879048193;
                        } else {
                            textFieldColorsA = textFieldColors;
                        }
                        if (i45 != 0) {
                            float f110 = 8;
                            n10 = new N(f110, f110, f110, f110);
                        } else {
                            n10 = l10;
                        }
                        pVar9 = pVar7;
                        i49 = i34;
                        z18 = z2115;
                    } else {
                        if (i56 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if ((i15 & 32) != 0) {
                            f11 = (F) c1086gP.x(TextKt.f12383a);
                            i55 &= -458753;
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i23 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i32 != 0) {
                            e11 = E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i35 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i37 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i39 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 32768) != 0) {
                            if (z17) {
                                i47 = 1;
                            } else {
                                i47 = BrazeLogger.SUPPRESS;
                            }
                            i34 &= -458753;
                        } else {
                            i47 = i10;
                        }
                        if (i41 != 0) {
                            i48 = 1;
                        } else {
                            i48 = i11;
                        }
                        boolean z2116 = z16;
                        if (i43 != 0) {
                            c1086gP.L(1299418141);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar4 = (androidx.compose.foundation.interaction.k) objF;
                            c1086gP.T(false);
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i15 & 262144) != 0) {
                            l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                            i34 &= -234881025;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i15 & 524288) != 0) {
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults9 = OutlinedTextFieldDefaults.f12253a;
                            TextFieldColors textFieldColorsC9 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                            IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                            int i5111 = IntercomTheme.$stable;
                            textFieldColorsA = textFieldColorsC9.a(((-14837) & 1) != 0 ? textFieldColorsC9.f12344a : intercomTheme9.getColors(c1086gP, i5111).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC9.f12345b : intercomTheme9.getColors(c1086gP, i5111).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme9.getColors(c1086gP, i5111).m645getPrimaryText0d7_KjU()), textFieldColorsC9.f12347d, intercomTheme9.getColors(c1086gP, i5111).m637getInputAlt0d7_KjU(), intercomTheme9.getColors(c1086gP, i5111).m637getInputAlt0d7_KjU(), intercomTheme9.getColors(c1086gP, i5111).m637getInputAlt0d7_KjU(), intercomTheme9.getColors(c1086gP, i5111).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC9.f12352i : 0L, textFieldColorsC9.j, textFieldColorsC9.f12353k, intercomTheme9.getColors(c1086gP, i5111).m627getCollectorBorder0d7_KjU(), intercomTheme9.getColors(c1086gP, i5111).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC9.f12356n : 0L, textFieldColorsC9.f12357o, textFieldColorsC9.f12358p, textFieldColorsC9.f12359q, textFieldColorsC9.f12360r, textFieldColorsC9.f12361s, textFieldColorsC9.f12362t, textFieldColorsC9.f12363u, textFieldColorsC9.f12364v, textFieldColorsC9.f12365w, textFieldColorsC9.f12366x, textFieldColorsC9.f12367y, textFieldColorsC9.f12368z, textFieldColorsC9.f12327A, textFieldColorsC9.f12328B, textFieldColorsC9.f12329C, textFieldColorsC9.f12330D, textFieldColorsC9.f12331E, textFieldColorsC9.f12332F, textFieldColorsC9.f12333G, textFieldColorsC9.f12334H, textFieldColorsC9.f12335I, textFieldColorsC9.f12336J, textFieldColorsC9.f12337K, textFieldColorsC9.f12338L, textFieldColorsC9.f12339M, textFieldColorsC9.f12340N, textFieldColorsC9.f12341O, textFieldColorsC9.f12342P, textFieldColorsC9.f12343Q);
                            i34 &= -1879048193;
                        } else {
                            textFieldColorsA = textFieldColors;
                        }
                        if (i45 != 0) {
                            float f111 = 8;
                            n10 = new N(f111, f111, f111, f111);
                        } else {
                            n10 = l10;
                        }
                        pVar9 = pVar7;
                        i49 = i34;
                        z18 = z2116;
                    }
                    c1086gP.U();
                    jB = f11.b();
                    if (jB == 16) {
                        if (z14) {
                            j11 = textFieldColorsA.f12345b;
                        } else {
                            j11 = textFieldColorsA.f12346c;
                        }
                        jB = j11;
                    }
                    F fD5 = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    if (pVar5 != null) {
                        hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
                    } else {
                        hVarJ = hVar2;
                    }
                    if (z14) {
                        j = textFieldColorsA.f12349f;
                    } else {
                        j = textFieldColorsA.f12350g;
                    }
                    androidx.compose.ui.h hVarA5 = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
                    if (z18) {
                        j10 = textFieldColorsA.j;
                    } else {
                        j10 = textFieldColorsA.f12352i;
                    }
                    final boolean z2117 = z14;
                    final boolean z2118 = z17;
                    final E e19 = e11;
                    final androidx.compose.foundation.interaction.k kVar13 = kVar4;
                    final boolean z2119 = z18;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1110 = pVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111 = pVar6;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1112 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1113 = pVar8;
                    final TextFieldColors textFieldColors7 = textFieldColorsA;
                    final L l16 = n10;
                    final l0 l0Var8 = l0Var2;
                    int i5112 = i49 << 12;
                    BasicTextFieldKt.b(value, onValueChange, hVarA5, z14, z15, fD5, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1114, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar1114, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

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
                        public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i5113) {
                            int i60;
                            kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                            if ((i5113 & 14) == 0) {
                                i60 = i5113 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                            } else {
                                i60 = i5113;
                            }
                            if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults10 = OutlinedTextFieldDefaults.f12253a;
                            String str = value;
                            final boolean z21110 = z2117;
                            boolean z21111 = z2118;
                            E e110 = e19;
                            final androidx.compose.foundation.interaction.k kVar14 = kVar13;
                            final boolean z21112 = z2119;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar1114 = pVar1110;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar1115 = pVar1111;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar1112;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar1113;
                            final TextFieldColors textFieldColors8 = textFieldColors7;
                            L l17 = l16;
                            final l0 l0Var9 = l0Var8;
                            outlinedTextFieldDefaults10.b(str, innerTextField, z21110, z21111, e110, kVar14, z21112, pVar1114, pVar1115, pVar20, pVar21, null, null, null, textFieldColors8, l17, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                                    if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        float f112 = 1;
                                        OutlinedTextFieldDefaults.f12253a.a(z21110, z21112, kVar14, null, textFieldColors8, l0Var9, f112, f112, interfaceC1084f3, 114819072, 8);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                        }
                    }, c1086gP), c1086gP, (i55 & 64638) | (i5112 & 3670016) | (i5112 & 29360128) | (i5112 & 234881024) | (i5112 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
                    kVar5 = kVar3;
                    l0Var3 = l0Var2;
                    jVar3 = jVar2;
                    pVar10 = pVar6;
                    l11 = n10;
                    z19 = z14;
                    pVar11 = pVar8;
                    f12 = f11;
                    pVar12 = pVar5;
                    z20 = z18;
                    kVar6 = kVar4;
                    i50 = i48;
                    z21 = z15;
                    z22 = z17;
                    textFieldColors2 = textFieldColorsA;
                    pVar13 = pVar9;
                    e12 = e11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.h hVar5 = hVar2;
                    final boolean z2120 = z20;
                    final E e110 = e12;
                    final androidx.compose.foundation.text.k kVar14 = kVar5;
                    final androidx.compose.foundation.text.j jVar6 = jVar3;
                    final boolean z221 = z22;
                    final int i5113 = i47;
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.views.compose.i
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomOutlinedTextFieldKt.IntercomOutlinedTextField$lambda$3(value, onValueChange, hVar5, z19, z21, f12, pVar12, pVar10, pVar13, pVar11, z2120, e110, kVar14, jVar6, z221, i5113, i50, kVar6, l0Var3, textFieldColors2, l11, i12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i28 = 805306368;
            i55 |= i28;
            i29 = i15 & 1024;
            if (i29 != 0) {
                i30 = i13 | 6;
            } else if ((i13 & 14) == 0) {
                if (c1086gP.c(z12)) {
                    i31 = 4;
                } else {
                    i31 = 2;
                }
                i30 = i13 | i31;
            } else {
                i30 = i13;
            }
            i32 = i15 & 2048;
            if (i32 != 0) {
                i30 |= 48;
            } else if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                if (c1086gP.K(e10)) {
                    i33 = 32;
                } else {
                    i33 = 16;
                }
                i30 |= i33;
            }
            i34 = i30;
            i35 = i15 & 4096;
            if (i35 != 0) {
                i34 |= 384;
            } else if ((i13 & 896) != 0) {
                if (c1086gP.K(kVar)) {
                    i36 = 256;
                } else {
                    i36 = 128;
                }
                i34 |= i36;
            }
            i37 = i15 & 8192;
            if (i37 != 0) {
                i34 |= 3072;
            } else if ((i13 & 7168) != 0) {
                if (c1086gP.K(jVar)) {
                    i38 = 2048;
                } else {
                    i38 = 1024;
                }
                i34 |= i38;
            }
            i39 = i15 & 16384;
            if (i39 != 0) {
                i34 |= 24576;
            } else if ((i13 & 57344) == 0) {
                if (c1086gP.c(z13)) {
                    i40 = 16384;
                } else {
                    i40 = 8192;
                }
                i34 |= i40;
            }
            if ((i13 & 458752) != 0) {
                if ((i15 & 32768) == 0) {
                    i53 = 65536;
                } else {
                    i53 = 65536;
                }
                i34 |= i53;
            }
            i41 = i15 & 65536;
            if (i41 != 0) {
                i34 |= 1572864;
            } else if ((i13 & 3670016) == 0) {
                if (c1086gP.h(i11)) {
                    i42 = 1048576;
                } else {
                    i42 = 524288;
                }
                i34 |= i42;
            }
            i43 = i15 & 131072;
            if (i43 != 0) {
                i34 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (c1086gP.K(kVar2)) {
                    i44 = 8388608;
                } else {
                    i44 = 4194304;
                }
                i34 |= i44;
            }
            if ((i13 & 234881024) != 0) {
                if ((i15 & 262144) == 0) {
                    i52 = 33554432;
                } else {
                    i52 = 33554432;
                }
                i34 |= i52;
            }
            if ((i13 & 1879048192) != 0) {
                if ((i15 & 524288) == 0) {
                    i51 = 268435456;
                } else {
                    i51 = 268435456;
                }
                i34 |= i51;
            }
            i45 = i15 & 1048576;
            if (i45 != 0) {
                i46 = i14 | 6;
            } else if ((i14 & 14) == 0) {
                i46 = i14 | (c1086gP.K(l10) ? 4 : 2);
            } else {
                i46 = i14;
            }
            if ((i55 & 1533916891) != 306783378) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i56 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if ((i15 & 32) != 0) {
                        f11 = (F) c1086gP.x(TextKt.f12383a);
                        i55 &= -458753;
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i23 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i32 != 0) {
                        e11 = E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i35 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i37 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i39 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 32768) != 0) {
                        if (z17) {
                            i47 = 1;
                        } else {
                            i47 = BrazeLogger.SUPPRESS;
                        }
                        i34 &= -458753;
                    } else {
                        i47 = i10;
                    }
                    if (i41 != 0) {
                        i48 = 1;
                    } else {
                        i48 = i11;
                    }
                    boolean z21110 = z16;
                    if (i43 != 0) {
                        c1086gP.L(1299418141);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objF;
                        c1086gP.T(false);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i15 & 262144) != 0) {
                        l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        i34 &= -234881025;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i15 & 524288) != 0) {
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults10 = OutlinedTextFieldDefaults.f12253a;
                        TextFieldColors textFieldColorsC10 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                        IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                        int i5114 = IntercomTheme.$stable;
                        textFieldColorsA = textFieldColorsC10.a(((-14837) & 1) != 0 ? textFieldColorsC10.f12344a : intercomTheme10.getColors(c1086gP, i5114).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC10.f12345b : intercomTheme10.getColors(c1086gP, i5114).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme10.getColors(c1086gP, i5114).m645getPrimaryText0d7_KjU()), textFieldColorsC10.f12347d, intercomTheme10.getColors(c1086gP, i5114).m637getInputAlt0d7_KjU(), intercomTheme10.getColors(c1086gP, i5114).m637getInputAlt0d7_KjU(), intercomTheme10.getColors(c1086gP, i5114).m637getInputAlt0d7_KjU(), intercomTheme10.getColors(c1086gP, i5114).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC10.f12352i : 0L, textFieldColorsC10.j, textFieldColorsC10.f12353k, intercomTheme10.getColors(c1086gP, i5114).m627getCollectorBorder0d7_KjU(), intercomTheme10.getColors(c1086gP, i5114).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC10.f12356n : 0L, textFieldColorsC10.f12357o, textFieldColorsC10.f12358p, textFieldColorsC10.f12359q, textFieldColorsC10.f12360r, textFieldColorsC10.f12361s, textFieldColorsC10.f12362t, textFieldColorsC10.f12363u, textFieldColorsC10.f12364v, textFieldColorsC10.f12365w, textFieldColorsC10.f12366x, textFieldColorsC10.f12367y, textFieldColorsC10.f12368z, textFieldColorsC10.f12327A, textFieldColorsC10.f12328B, textFieldColorsC10.f12329C, textFieldColorsC10.f12330D, textFieldColorsC10.f12331E, textFieldColorsC10.f12332F, textFieldColorsC10.f12333G, textFieldColorsC10.f12334H, textFieldColorsC10.f12335I, textFieldColorsC10.f12336J, textFieldColorsC10.f12337K, textFieldColorsC10.f12338L, textFieldColorsC10.f12339M, textFieldColorsC10.f12340N, textFieldColorsC10.f12341O, textFieldColorsC10.f12342P, textFieldColorsC10.f12343Q);
                        i34 &= -1879048193;
                    } else {
                        textFieldColorsA = textFieldColors;
                    }
                    if (i45 != 0) {
                        float f112 = 8;
                        n10 = new N(f112, f112, f112, f112);
                    } else {
                        n10 = l10;
                    }
                    pVar9 = pVar7;
                    i49 = i34;
                    z18 = z21110;
                } else {
                    if (i56 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if ((i15 & 32) != 0) {
                        f11 = (F) c1086gP.x(TextKt.f12383a);
                        i55 &= -458753;
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i23 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i32 != 0) {
                        e11 = E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i35 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i37 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i39 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 32768) != 0) {
                        if (z17) {
                            i47 = 1;
                        } else {
                            i47 = BrazeLogger.SUPPRESS;
                        }
                        i34 &= -458753;
                    } else {
                        i47 = i10;
                    }
                    if (i41 != 0) {
                        i48 = 1;
                    } else {
                        i48 = i11;
                    }
                    boolean z21111 = z16;
                    if (i43 != 0) {
                        c1086gP.L(1299418141);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objF;
                        c1086gP.T(false);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i15 & 262144) != 0) {
                        l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        i34 &= -234881025;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i15 & 524288) != 0) {
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults11 = OutlinedTextFieldDefaults.f12253a;
                        TextFieldColors textFieldColorsC11 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                        IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                        int i5115 = IntercomTheme.$stable;
                        textFieldColorsA = textFieldColorsC11.a(((-14837) & 1) != 0 ? textFieldColorsC11.f12344a : intercomTheme11.getColors(c1086gP, i5115).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC11.f12345b : intercomTheme11.getColors(c1086gP, i5115).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme11.getColors(c1086gP, i5115).m645getPrimaryText0d7_KjU()), textFieldColorsC11.f12347d, intercomTheme11.getColors(c1086gP, i5115).m637getInputAlt0d7_KjU(), intercomTheme11.getColors(c1086gP, i5115).m637getInputAlt0d7_KjU(), intercomTheme11.getColors(c1086gP, i5115).m637getInputAlt0d7_KjU(), intercomTheme11.getColors(c1086gP, i5115).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC11.f12352i : 0L, textFieldColorsC11.j, textFieldColorsC11.f12353k, intercomTheme11.getColors(c1086gP, i5115).m627getCollectorBorder0d7_KjU(), intercomTheme11.getColors(c1086gP, i5115).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC11.f12356n : 0L, textFieldColorsC11.f12357o, textFieldColorsC11.f12358p, textFieldColorsC11.f12359q, textFieldColorsC11.f12360r, textFieldColorsC11.f12361s, textFieldColorsC11.f12362t, textFieldColorsC11.f12363u, textFieldColorsC11.f12364v, textFieldColorsC11.f12365w, textFieldColorsC11.f12366x, textFieldColorsC11.f12367y, textFieldColorsC11.f12368z, textFieldColorsC11.f12327A, textFieldColorsC11.f12328B, textFieldColorsC11.f12329C, textFieldColorsC11.f12330D, textFieldColorsC11.f12331E, textFieldColorsC11.f12332F, textFieldColorsC11.f12333G, textFieldColorsC11.f12334H, textFieldColorsC11.f12335I, textFieldColorsC11.f12336J, textFieldColorsC11.f12337K, textFieldColorsC11.f12338L, textFieldColorsC11.f12339M, textFieldColorsC11.f12340N, textFieldColorsC11.f12341O, textFieldColorsC11.f12342P, textFieldColorsC11.f12343Q);
                        i34 &= -1879048193;
                    } else {
                        textFieldColorsA = textFieldColors;
                    }
                    if (i45 != 0) {
                        float f113 = 8;
                        n10 = new N(f113, f113, f113, f113);
                    } else {
                        n10 = l10;
                    }
                    pVar9 = pVar7;
                    i49 = i34;
                    z18 = z21111;
                }
                c1086gP.U();
                jB = f11.b();
                if (jB == 16) {
                    if (z14) {
                        j11 = textFieldColorsA.f12345b;
                    } else {
                        j11 = textFieldColorsA.f12346c;
                    }
                    jB = j11;
                }
                F fD6 = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
                if (pVar5 != null) {
                    hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
                } else {
                    hVarJ = hVar2;
                }
                if (z14) {
                    j = textFieldColorsA.f12349f;
                } else {
                    j = textFieldColorsA.f12350g;
                }
                androidx.compose.ui.h hVarA6 = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
                if (z18) {
                    j10 = textFieldColorsA.j;
                } else {
                    j10 = textFieldColorsA.f12352i;
                }
                final boolean z21112 = z14;
                final boolean z21113 = z17;
                final E e111 = e11;
                final androidx.compose.foundation.interaction.k kVar15 = kVar4;
                final boolean z21114 = z18;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1114 = pVar5;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1115 = pVar6;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1116 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1117 = pVar8;
                final TextFieldColors textFieldColors8 = textFieldColorsA;
                final L l17 = n10;
                final l0 l0Var9 = l0Var2;
                int i5116 = i49 << 12;
                BasicTextFieldKt.b(value, onValueChange, hVarA6, z14, z15, fD6, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1118, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar1118, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

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
                    public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i5117) {
                        int i60;
                        kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                        if ((i5117 & 14) == 0) {
                            i60 = i5117 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                        } else {
                            i60 = i5117;
                        }
                        if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults12 = OutlinedTextFieldDefaults.f12253a;
                        String str = value;
                        final boolean z21115 = z21112;
                        boolean z21116 = z21113;
                        E e112 = e111;
                        final androidx.compose.foundation.interaction.k kVar16 = kVar15;
                        final boolean z21117 = z21114;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar1118 = pVar1114;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar1119 = pVar1115;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar1116;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar1117;
                        final TextFieldColors textFieldColors9 = textFieldColors8;
                        L l18 = l17;
                        final l0 l0Var10 = l0Var9;
                        outlinedTextFieldDefaults12.b(str, innerTextField, z21115, z21116, e112, kVar16, z21117, pVar1118, pVar1119, pVar20, pVar21, null, null, null, textFieldColors9, l18, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                                if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    float f114 = 1;
                                    OutlinedTextFieldDefaults.f12253a.a(z21115, z21117, kVar16, null, textFieldColors9, l0Var10, f114, f114, interfaceC1084f3, 114819072, 8);
                                }
                            }
                        }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                    }
                }, c1086gP), c1086gP, (i55 & 64638) | (i5116 & 3670016) | (i5116 & 29360128) | (i5116 & 234881024) | (i5116 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
                kVar5 = kVar3;
                l0Var3 = l0Var2;
                jVar3 = jVar2;
                pVar10 = pVar6;
                l11 = n10;
                z19 = z14;
                pVar11 = pVar8;
                f12 = f11;
                pVar12 = pVar5;
                z20 = z18;
                kVar6 = kVar4;
                i50 = i48;
                z21 = z15;
                z22 = z17;
                textFieldColors2 = textFieldColorsA;
                pVar13 = pVar9;
                e12 = e11;
            } else {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i56 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if ((i15 & 32) != 0) {
                        f11 = (F) c1086gP.x(TextKt.f12383a);
                        i55 &= -458753;
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i23 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i32 != 0) {
                        e11 = E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i35 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i37 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i39 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 32768) != 0) {
                        if (z17) {
                            i47 = 1;
                        } else {
                            i47 = BrazeLogger.SUPPRESS;
                        }
                        i34 &= -458753;
                    } else {
                        i47 = i10;
                    }
                    if (i41 != 0) {
                        i48 = 1;
                    } else {
                        i48 = i11;
                    }
                    boolean z21115 = z16;
                    if (i43 != 0) {
                        c1086gP.L(1299418141);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objF;
                        c1086gP.T(false);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i15 & 262144) != 0) {
                        l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        i34 &= -234881025;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i15 & 524288) != 0) {
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults12 = OutlinedTextFieldDefaults.f12253a;
                        TextFieldColors textFieldColorsC12 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                        IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                        int i5117 = IntercomTheme.$stable;
                        textFieldColorsA = textFieldColorsC12.a(((-14837) & 1) != 0 ? textFieldColorsC12.f12344a : intercomTheme12.getColors(c1086gP, i5117).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC12.f12345b : intercomTheme12.getColors(c1086gP, i5117).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme12.getColors(c1086gP, i5117).m645getPrimaryText0d7_KjU()), textFieldColorsC12.f12347d, intercomTheme12.getColors(c1086gP, i5117).m637getInputAlt0d7_KjU(), intercomTheme12.getColors(c1086gP, i5117).m637getInputAlt0d7_KjU(), intercomTheme12.getColors(c1086gP, i5117).m637getInputAlt0d7_KjU(), intercomTheme12.getColors(c1086gP, i5117).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC12.f12352i : 0L, textFieldColorsC12.j, textFieldColorsC12.f12353k, intercomTheme12.getColors(c1086gP, i5117).m627getCollectorBorder0d7_KjU(), intercomTheme12.getColors(c1086gP, i5117).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC12.f12356n : 0L, textFieldColorsC12.f12357o, textFieldColorsC12.f12358p, textFieldColorsC12.f12359q, textFieldColorsC12.f12360r, textFieldColorsC12.f12361s, textFieldColorsC12.f12362t, textFieldColorsC12.f12363u, textFieldColorsC12.f12364v, textFieldColorsC12.f12365w, textFieldColorsC12.f12366x, textFieldColorsC12.f12367y, textFieldColorsC12.f12368z, textFieldColorsC12.f12327A, textFieldColorsC12.f12328B, textFieldColorsC12.f12329C, textFieldColorsC12.f12330D, textFieldColorsC12.f12331E, textFieldColorsC12.f12332F, textFieldColorsC12.f12333G, textFieldColorsC12.f12334H, textFieldColorsC12.f12335I, textFieldColorsC12.f12336J, textFieldColorsC12.f12337K, textFieldColorsC12.f12338L, textFieldColorsC12.f12339M, textFieldColorsC12.f12340N, textFieldColorsC12.f12341O, textFieldColorsC12.f12342P, textFieldColorsC12.f12343Q);
                        i34 &= -1879048193;
                    } else {
                        textFieldColorsA = textFieldColors;
                    }
                    if (i45 != 0) {
                        float f114 = 8;
                        n10 = new N(f114, f114, f114, f114);
                    } else {
                        n10 = l10;
                    }
                    pVar9 = pVar7;
                    i49 = i34;
                    z18 = z21115;
                } else {
                    if (i56 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if ((i15 & 32) != 0) {
                        f11 = (F) c1086gP.x(TextKt.f12383a);
                        i55 &= -458753;
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i23 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i32 != 0) {
                        e11 = E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i35 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i37 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i39 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 32768) != 0) {
                        if (z17) {
                            i47 = 1;
                        } else {
                            i47 = BrazeLogger.SUPPRESS;
                        }
                        i34 &= -458753;
                    } else {
                        i47 = i10;
                    }
                    if (i41 != 0) {
                        i48 = 1;
                    } else {
                        i48 = i11;
                    }
                    boolean z21116 = z16;
                    if (i43 != 0) {
                        c1086gP.L(1299418141);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objF;
                        c1086gP.T(false);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i15 & 262144) != 0) {
                        l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        i34 &= -234881025;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i15 & 524288) != 0) {
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults13 = OutlinedTextFieldDefaults.f12253a;
                        TextFieldColors textFieldColorsC13 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                        IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                        int i5118 = IntercomTheme.$stable;
                        textFieldColorsA = textFieldColorsC13.a(((-14837) & 1) != 0 ? textFieldColorsC13.f12344a : intercomTheme13.getColors(c1086gP, i5118).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC13.f12345b : intercomTheme13.getColors(c1086gP, i5118).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme13.getColors(c1086gP, i5118).m645getPrimaryText0d7_KjU()), textFieldColorsC13.f12347d, intercomTheme13.getColors(c1086gP, i5118).m637getInputAlt0d7_KjU(), intercomTheme13.getColors(c1086gP, i5118).m637getInputAlt0d7_KjU(), intercomTheme13.getColors(c1086gP, i5118).m637getInputAlt0d7_KjU(), intercomTheme13.getColors(c1086gP, i5118).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC13.f12352i : 0L, textFieldColorsC13.j, textFieldColorsC13.f12353k, intercomTheme13.getColors(c1086gP, i5118).m627getCollectorBorder0d7_KjU(), intercomTheme13.getColors(c1086gP, i5118).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC13.f12356n : 0L, textFieldColorsC13.f12357o, textFieldColorsC13.f12358p, textFieldColorsC13.f12359q, textFieldColorsC13.f12360r, textFieldColorsC13.f12361s, textFieldColorsC13.f12362t, textFieldColorsC13.f12363u, textFieldColorsC13.f12364v, textFieldColorsC13.f12365w, textFieldColorsC13.f12366x, textFieldColorsC13.f12367y, textFieldColorsC13.f12368z, textFieldColorsC13.f12327A, textFieldColorsC13.f12328B, textFieldColorsC13.f12329C, textFieldColorsC13.f12330D, textFieldColorsC13.f12331E, textFieldColorsC13.f12332F, textFieldColorsC13.f12333G, textFieldColorsC13.f12334H, textFieldColorsC13.f12335I, textFieldColorsC13.f12336J, textFieldColorsC13.f12337K, textFieldColorsC13.f12338L, textFieldColorsC13.f12339M, textFieldColorsC13.f12340N, textFieldColorsC13.f12341O, textFieldColorsC13.f12342P, textFieldColorsC13.f12343Q);
                        i34 &= -1879048193;
                    } else {
                        textFieldColorsA = textFieldColors;
                    }
                    if (i45 != 0) {
                        float f115 = 8;
                        n10 = new N(f115, f115, f115, f115);
                    } else {
                        n10 = l10;
                    }
                    pVar9 = pVar7;
                    i49 = i34;
                    z18 = z21116;
                }
                c1086gP.U();
                jB = f11.b();
                if (jB == 16) {
                    if (z14) {
                        j11 = textFieldColorsA.f12345b;
                    } else {
                        j11 = textFieldColorsA.f12346c;
                    }
                    jB = j11;
                }
                F fD7 = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
                if (pVar5 != null) {
                    hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
                } else {
                    hVarJ = hVar2;
                }
                if (z14) {
                    j = textFieldColorsA.f12349f;
                } else {
                    j = textFieldColorsA.f12350g;
                }
                androidx.compose.ui.h hVarA7 = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
                if (z18) {
                    j10 = textFieldColorsA.j;
                } else {
                    j10 = textFieldColorsA.f12352i;
                }
                final boolean z21117 = z14;
                final boolean z21118 = z17;
                final E e112 = e11;
                final androidx.compose.foundation.interaction.k kVar16 = kVar4;
                final boolean z21119 = z18;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1118 = pVar5;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1119 = pVar6;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11110 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111 = pVar8;
                final TextFieldColors textFieldColors9 = textFieldColorsA;
                final L l18 = n10;
                final l0 l0Var10 = l0Var2;
                int i5119 = i49 << 12;
                BasicTextFieldKt.b(value, onValueChange, hVarA7, z14, z15, fD7, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar11112, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar11112, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

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
                    public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i51110) {
                        int i60;
                        kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                        if ((i51110 & 14) == 0) {
                            i60 = i51110 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                        } else {
                            i60 = i51110;
                        }
                        if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults14 = OutlinedTextFieldDefaults.f12253a;
                        String str = value;
                        final boolean z211110 = z21117;
                        boolean z211111 = z21118;
                        E e113 = e112;
                        final androidx.compose.foundation.interaction.k kVar17 = kVar16;
                        final boolean z211112 = z21119;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11112 = pVar1118;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11113 = pVar1119;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar11110;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar11111;
                        final TextFieldColors textFieldColors10 = textFieldColors9;
                        L l19 = l18;
                        final l0 l0Var11 = l0Var10;
                        outlinedTextFieldDefaults14.b(str, innerTextField, z211110, z211111, e113, kVar17, z211112, pVar11112, pVar11113, pVar20, pVar21, null, null, null, textFieldColors10, l19, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                                if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    float f116 = 1;
                                    OutlinedTextFieldDefaults.f12253a.a(z211110, z211112, kVar17, null, textFieldColors10, l0Var11, f116, f116, interfaceC1084f3, 114819072, 8);
                                }
                            }
                        }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                    }
                }, c1086gP), c1086gP, (i55 & 64638) | (i5119 & 3670016) | (i5119 & 29360128) | (i5119 & 234881024) | (i5119 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
                kVar5 = kVar3;
                l0Var3 = l0Var2;
                jVar3 = jVar2;
                pVar10 = pVar6;
                l11 = n10;
                z19 = z14;
                pVar11 = pVar8;
                f12 = f11;
                pVar12 = pVar5;
                z20 = z18;
                kVar6 = kVar4;
                i50 = i48;
                z21 = z15;
                z22 = z17;
                textFieldColors2 = textFieldColorsA;
                pVar13 = pVar9;
                e12 = e11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar6 = hVar2;
                final boolean z2121 = z20;
                final E e113 = e12;
                final androidx.compose.foundation.text.k kVar17 = kVar5;
                final androidx.compose.foundation.text.j jVar7 = jVar3;
                final boolean z222 = z22;
                final int i51110 = i47;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.views.compose.i
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomOutlinedTextFieldKt.IntercomOutlinedTextField$lambda$3(value, onValueChange, hVar6, z19, z21, f12, pVar12, pVar10, pVar13, pVar11, z2121, e113, kVar17, jVar7, z222, i51110, i50, kVar6, l0Var3, textFieldColors2, l11, i12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i55 |= 384;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i12 & 7168) == 0) {
                if (c1086gP.c(z10)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i55 |= i18;
            }
            i19 = i15 & 16;
            if (i19 != 0) {
                i55 |= 24576;
            } else if ((i12 & 57344) == 0) {
                if (c1086gP.c(z11)) {
                    i20 = 16384;
                } else {
                    i20 = 8192;
                }
                i55 |= i20;
            }
            if ((i12 & 458752) != 0) {
                if ((i15 & 32) == 0) {
                    i54 = 65536;
                } else {
                    i54 = 65536;
                }
                i55 |= i54;
            }
            i21 = i15 & 64;
            if (i21 != 0) {
                i55 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (c1086gP.k(pVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i55 |= i22;
            }
            i23 = i15 & 128;
            if (i23 != 0) {
                i55 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (c1086gP.k(pVar2)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i55 |= i24;
            }
            i25 = i15 & 256;
            if (i25 != 0) {
                i55 |= 100663296;
            } else if ((i12 & 234881024) == 0) {
                if (c1086gP.k(pVar3)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i55 |= i26;
            }
            i27 = i15 & 512;
            if (i27 != 0) {
                if ((i12 & 1879048192) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                }
                i29 = i15 & 1024;
                if (i29 != 0) {
                    i30 = i13 | 6;
                } else if ((i13 & 14) == 0) {
                    if (c1086gP.c(z12)) {
                        i31 = 4;
                    } else {
                        i31 = 2;
                    }
                    i30 = i13 | i31;
                } else {
                    i30 = i13;
                }
                i32 = i15 & 2048;
                if (i32 != 0) {
                    i30 |= 48;
                } else if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                    if (c1086gP.K(e10)) {
                        i33 = 32;
                    } else {
                        i33 = 16;
                    }
                    i30 |= i33;
                }
                i34 = i30;
                i35 = i15 & 4096;
                if (i35 != 0) {
                    i34 |= 384;
                } else if ((i13 & 896) != 0) {
                    if (c1086gP.K(kVar)) {
                        i36 = 256;
                    } else {
                        i36 = 128;
                    }
                    i34 |= i36;
                }
                i37 = i15 & 8192;
                if (i37 != 0) {
                    i34 |= 3072;
                } else if ((i13 & 7168) != 0) {
                    if (c1086gP.K(jVar)) {
                        i38 = 2048;
                    } else {
                        i38 = 1024;
                    }
                    i34 |= i38;
                }
                i39 = i15 & 16384;
                if (i39 != 0) {
                    i34 |= 24576;
                } else if ((i13 & 57344) == 0) {
                    if (c1086gP.c(z13)) {
                        i40 = 16384;
                    } else {
                        i40 = 8192;
                    }
                    i34 |= i40;
                }
                if ((i13 & 458752) != 0) {
                    if ((i15 & 32768) == 0) {
                        i53 = 65536;
                    } else {
                        i53 = 65536;
                    }
                    i34 |= i53;
                }
                i41 = i15 & 65536;
                if (i41 != 0) {
                    i34 |= 1572864;
                } else if ((i13 & 3670016) == 0) {
                    if (c1086gP.h(i11)) {
                        i42 = 1048576;
                    } else {
                        i42 = 524288;
                    }
                    i34 |= i42;
                }
                i43 = i15 & 131072;
                if (i43 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 29360128) == 0) {
                    if (c1086gP.K(kVar2)) {
                        i44 = 8388608;
                    } else {
                        i44 = 4194304;
                    }
                    i34 |= i44;
                }
                if ((i13 & 234881024) != 0) {
                    if ((i15 & 262144) == 0) {
                        i52 = 33554432;
                    } else {
                        i52 = 33554432;
                    }
                    i34 |= i52;
                }
                if ((i13 & 1879048192) != 0) {
                    if ((i15 & 524288) == 0) {
                        i51 = 268435456;
                    } else {
                        i51 = 268435456;
                    }
                    i34 |= i51;
                }
                i45 = i15 & 1048576;
                if (i45 != 0) {
                    i46 = i14 | 6;
                } else if ((i14 & 14) == 0) {
                    i46 = i14 | (c1086gP.K(l10) ? 4 : 2);
                } else {
                    i46 = i14;
                }
                if ((i55 & 1533916891) != 306783378) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i56 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if ((i15 & 32) != 0) {
                            f11 = (F) c1086gP.x(TextKt.f12383a);
                            i55 &= -458753;
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i23 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i32 != 0) {
                            e11 = E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i35 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i37 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i39 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 32768) != 0) {
                            if (z17) {
                                i47 = 1;
                            } else {
                                i47 = BrazeLogger.SUPPRESS;
                            }
                            i34 &= -458753;
                        } else {
                            i47 = i10;
                        }
                        if (i41 != 0) {
                            i48 = 1;
                        } else {
                            i48 = i11;
                        }
                        boolean z211110 = z16;
                        if (i43 != 0) {
                            c1086gP.L(1299418141);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar4 = (androidx.compose.foundation.interaction.k) objF;
                            c1086gP.T(false);
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i15 & 262144) != 0) {
                            l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                            i34 &= -234881025;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i15 & 524288) != 0) {
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults14 = OutlinedTextFieldDefaults.f12253a;
                            TextFieldColors textFieldColorsC14 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                            IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
                            int i51111 = IntercomTheme.$stable;
                            textFieldColorsA = textFieldColorsC14.a(((-14837) & 1) != 0 ? textFieldColorsC14.f12344a : intercomTheme14.getColors(c1086gP, i51111).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC14.f12345b : intercomTheme14.getColors(c1086gP, i51111).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme14.getColors(c1086gP, i51111).m645getPrimaryText0d7_KjU()), textFieldColorsC14.f12347d, intercomTheme14.getColors(c1086gP, i51111).m637getInputAlt0d7_KjU(), intercomTheme14.getColors(c1086gP, i51111).m637getInputAlt0d7_KjU(), intercomTheme14.getColors(c1086gP, i51111).m637getInputAlt0d7_KjU(), intercomTheme14.getColors(c1086gP, i51111).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC14.f12352i : 0L, textFieldColorsC14.j, textFieldColorsC14.f12353k, intercomTheme14.getColors(c1086gP, i51111).m627getCollectorBorder0d7_KjU(), intercomTheme14.getColors(c1086gP, i51111).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC14.f12356n : 0L, textFieldColorsC14.f12357o, textFieldColorsC14.f12358p, textFieldColorsC14.f12359q, textFieldColorsC14.f12360r, textFieldColorsC14.f12361s, textFieldColorsC14.f12362t, textFieldColorsC14.f12363u, textFieldColorsC14.f12364v, textFieldColorsC14.f12365w, textFieldColorsC14.f12366x, textFieldColorsC14.f12367y, textFieldColorsC14.f12368z, textFieldColorsC14.f12327A, textFieldColorsC14.f12328B, textFieldColorsC14.f12329C, textFieldColorsC14.f12330D, textFieldColorsC14.f12331E, textFieldColorsC14.f12332F, textFieldColorsC14.f12333G, textFieldColorsC14.f12334H, textFieldColorsC14.f12335I, textFieldColorsC14.f12336J, textFieldColorsC14.f12337K, textFieldColorsC14.f12338L, textFieldColorsC14.f12339M, textFieldColorsC14.f12340N, textFieldColorsC14.f12341O, textFieldColorsC14.f12342P, textFieldColorsC14.f12343Q);
                            i34 &= -1879048193;
                        } else {
                            textFieldColorsA = textFieldColors;
                        }
                        if (i45 != 0) {
                            float f116 = 8;
                            n10 = new N(f116, f116, f116, f116);
                        } else {
                            n10 = l10;
                        }
                        pVar9 = pVar7;
                        i49 = i34;
                        z18 = z211110;
                    } else {
                        if (i56 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if ((i15 & 32) != 0) {
                            f11 = (F) c1086gP.x(TextKt.f12383a);
                            i55 &= -458753;
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i23 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i32 != 0) {
                            e11 = E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i35 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i37 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i39 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 32768) != 0) {
                            if (z17) {
                                i47 = 1;
                            } else {
                                i47 = BrazeLogger.SUPPRESS;
                            }
                            i34 &= -458753;
                        } else {
                            i47 = i10;
                        }
                        if (i41 != 0) {
                            i48 = 1;
                        } else {
                            i48 = i11;
                        }
                        boolean z211111 = z16;
                        if (i43 != 0) {
                            c1086gP.L(1299418141);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar4 = (androidx.compose.foundation.interaction.k) objF;
                            c1086gP.T(false);
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i15 & 262144) != 0) {
                            l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                            i34 &= -234881025;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i15 & 524288) != 0) {
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults15 = OutlinedTextFieldDefaults.f12253a;
                            TextFieldColors textFieldColorsC15 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                            IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
                            int i51112 = IntercomTheme.$stable;
                            textFieldColorsA = textFieldColorsC15.a(((-14837) & 1) != 0 ? textFieldColorsC15.f12344a : intercomTheme15.getColors(c1086gP, i51112).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC15.f12345b : intercomTheme15.getColors(c1086gP, i51112).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme15.getColors(c1086gP, i51112).m645getPrimaryText0d7_KjU()), textFieldColorsC15.f12347d, intercomTheme15.getColors(c1086gP, i51112).m637getInputAlt0d7_KjU(), intercomTheme15.getColors(c1086gP, i51112).m637getInputAlt0d7_KjU(), intercomTheme15.getColors(c1086gP, i51112).m637getInputAlt0d7_KjU(), intercomTheme15.getColors(c1086gP, i51112).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC15.f12352i : 0L, textFieldColorsC15.j, textFieldColorsC15.f12353k, intercomTheme15.getColors(c1086gP, i51112).m627getCollectorBorder0d7_KjU(), intercomTheme15.getColors(c1086gP, i51112).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC15.f12356n : 0L, textFieldColorsC15.f12357o, textFieldColorsC15.f12358p, textFieldColorsC15.f12359q, textFieldColorsC15.f12360r, textFieldColorsC15.f12361s, textFieldColorsC15.f12362t, textFieldColorsC15.f12363u, textFieldColorsC15.f12364v, textFieldColorsC15.f12365w, textFieldColorsC15.f12366x, textFieldColorsC15.f12367y, textFieldColorsC15.f12368z, textFieldColorsC15.f12327A, textFieldColorsC15.f12328B, textFieldColorsC15.f12329C, textFieldColorsC15.f12330D, textFieldColorsC15.f12331E, textFieldColorsC15.f12332F, textFieldColorsC15.f12333G, textFieldColorsC15.f12334H, textFieldColorsC15.f12335I, textFieldColorsC15.f12336J, textFieldColorsC15.f12337K, textFieldColorsC15.f12338L, textFieldColorsC15.f12339M, textFieldColorsC15.f12340N, textFieldColorsC15.f12341O, textFieldColorsC15.f12342P, textFieldColorsC15.f12343Q);
                            i34 &= -1879048193;
                        } else {
                            textFieldColorsA = textFieldColors;
                        }
                        if (i45 != 0) {
                            float f117 = 8;
                            n10 = new N(f117, f117, f117, f117);
                        } else {
                            n10 = l10;
                        }
                        pVar9 = pVar7;
                        i49 = i34;
                        z18 = z211111;
                    }
                    c1086gP.U();
                    jB = f11.b();
                    if (jB == 16) {
                        if (z14) {
                            j11 = textFieldColorsA.f12345b;
                        } else {
                            j11 = textFieldColorsA.f12346c;
                        }
                        jB = j11;
                    }
                    F fD8 = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    if (pVar5 != null) {
                        hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
                    } else {
                        hVarJ = hVar2;
                    }
                    if (z14) {
                        j = textFieldColorsA.f12349f;
                    } else {
                        j = textFieldColorsA.f12350g;
                    }
                    androidx.compose.ui.h hVarA8 = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
                    if (z18) {
                        j10 = textFieldColorsA.j;
                    } else {
                        j10 = textFieldColorsA.f12352i;
                    }
                    final boolean z211112 = z14;
                    final boolean z211113 = z17;
                    final E e114 = e11;
                    final androidx.compose.foundation.interaction.k kVar18 = kVar4;
                    final boolean z211114 = z18;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11112 = pVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11113 = pVar6;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11114 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11115 = pVar8;
                    final TextFieldColors textFieldColors10 = textFieldColorsA;
                    final L l19 = n10;
                    final l0 l0Var11 = l0Var2;
                    int i51113 = i49 << 12;
                    BasicTextFieldKt.b(value, onValueChange, hVarA8, z14, z15, fD8, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar11116, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar11116, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

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
                        public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i51114) {
                            int i60;
                            kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                            if ((i51114 & 14) == 0) {
                                i60 = i51114 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                            } else {
                                i60 = i51114;
                            }
                            if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults16 = OutlinedTextFieldDefaults.f12253a;
                            String str = value;
                            final boolean z211115 = z211112;
                            boolean z211116 = z211113;
                            E e115 = e114;
                            final androidx.compose.foundation.interaction.k kVar19 = kVar18;
                            final boolean z211117 = z211114;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11116 = pVar11112;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11117 = pVar11113;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar11114;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar11115;
                            final TextFieldColors textFieldColors11 = textFieldColors10;
                            L l110 = l19;
                            final l0 l0Var12 = l0Var11;
                            outlinedTextFieldDefaults16.b(str, innerTextField, z211115, z211116, e115, kVar19, z211117, pVar11116, pVar11117, pVar20, pVar21, null, null, null, textFieldColors11, l110, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                                    if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        float f118 = 1;
                                        OutlinedTextFieldDefaults.f12253a.a(z211115, z211117, kVar19, null, textFieldColors11, l0Var12, f118, f118, interfaceC1084f3, 114819072, 8);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                        }
                    }, c1086gP), c1086gP, (i55 & 64638) | (i51113 & 3670016) | (i51113 & 29360128) | (i51113 & 234881024) | (i51113 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
                    kVar5 = kVar3;
                    l0Var3 = l0Var2;
                    jVar3 = jVar2;
                    pVar10 = pVar6;
                    l11 = n10;
                    z19 = z14;
                    pVar11 = pVar8;
                    f12 = f11;
                    pVar12 = pVar5;
                    z20 = z18;
                    kVar6 = kVar4;
                    i50 = i48;
                    z21 = z15;
                    z22 = z17;
                    textFieldColors2 = textFieldColorsA;
                    pVar13 = pVar9;
                    e12 = e11;
                } else {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i56 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if ((i15 & 32) != 0) {
                            f11 = (F) c1086gP.x(TextKt.f12383a);
                            i55 &= -458753;
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i23 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i32 != 0) {
                            e11 = E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i35 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i37 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i39 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 32768) != 0) {
                            if (z17) {
                                i47 = 1;
                            } else {
                                i47 = BrazeLogger.SUPPRESS;
                            }
                            i34 &= -458753;
                        } else {
                            i47 = i10;
                        }
                        if (i41 != 0) {
                            i48 = 1;
                        } else {
                            i48 = i11;
                        }
                        boolean z211115 = z16;
                        if (i43 != 0) {
                            c1086gP.L(1299418141);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar4 = (androidx.compose.foundation.interaction.k) objF;
                            c1086gP.T(false);
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i15 & 262144) != 0) {
                            l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                            i34 &= -234881025;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i15 & 524288) != 0) {
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults16 = OutlinedTextFieldDefaults.f12253a;
                            TextFieldColors textFieldColorsC16 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                            IntercomTheme intercomTheme16 = IntercomTheme.INSTANCE;
                            int i51114 = IntercomTheme.$stable;
                            textFieldColorsA = textFieldColorsC16.a(((-14837) & 1) != 0 ? textFieldColorsC16.f12344a : intercomTheme16.getColors(c1086gP, i51114).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC16.f12345b : intercomTheme16.getColors(c1086gP, i51114).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme16.getColors(c1086gP, i51114).m645getPrimaryText0d7_KjU()), textFieldColorsC16.f12347d, intercomTheme16.getColors(c1086gP, i51114).m637getInputAlt0d7_KjU(), intercomTheme16.getColors(c1086gP, i51114).m637getInputAlt0d7_KjU(), intercomTheme16.getColors(c1086gP, i51114).m637getInputAlt0d7_KjU(), intercomTheme16.getColors(c1086gP, i51114).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC16.f12352i : 0L, textFieldColorsC16.j, textFieldColorsC16.f12353k, intercomTheme16.getColors(c1086gP, i51114).m627getCollectorBorder0d7_KjU(), intercomTheme16.getColors(c1086gP, i51114).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC16.f12356n : 0L, textFieldColorsC16.f12357o, textFieldColorsC16.f12358p, textFieldColorsC16.f12359q, textFieldColorsC16.f12360r, textFieldColorsC16.f12361s, textFieldColorsC16.f12362t, textFieldColorsC16.f12363u, textFieldColorsC16.f12364v, textFieldColorsC16.f12365w, textFieldColorsC16.f12366x, textFieldColorsC16.f12367y, textFieldColorsC16.f12368z, textFieldColorsC16.f12327A, textFieldColorsC16.f12328B, textFieldColorsC16.f12329C, textFieldColorsC16.f12330D, textFieldColorsC16.f12331E, textFieldColorsC16.f12332F, textFieldColorsC16.f12333G, textFieldColorsC16.f12334H, textFieldColorsC16.f12335I, textFieldColorsC16.f12336J, textFieldColorsC16.f12337K, textFieldColorsC16.f12338L, textFieldColorsC16.f12339M, textFieldColorsC16.f12340N, textFieldColorsC16.f12341O, textFieldColorsC16.f12342P, textFieldColorsC16.f12343Q);
                            i34 &= -1879048193;
                        } else {
                            textFieldColorsA = textFieldColors;
                        }
                        if (i45 != 0) {
                            float f118 = 8;
                            n10 = new N(f118, f118, f118, f118);
                        } else {
                            n10 = l10;
                        }
                        pVar9 = pVar7;
                        i49 = i34;
                        z18 = z211115;
                    } else {
                        if (i56 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        } else {
                            hVar2 = hVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        } else {
                            z14 = z10;
                        }
                        if (i19 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if ((i15 & 32) != 0) {
                            f11 = (F) c1086gP.x(TextKt.f12383a);
                            i55 &= -458753;
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar5 = null;
                        } else {
                            pVar5 = pVar;
                        }
                        if (i23 != 0) {
                            pVar6 = null;
                        } else {
                            pVar6 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar7 = null;
                        } else {
                            pVar7 = pVar3;
                        }
                        if (i27 == 0) {
                        }
                        if (i29 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i32 != 0) {
                            e11 = E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i35 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i37 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i39 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 32768) != 0) {
                            if (z17) {
                                i47 = 1;
                            } else {
                                i47 = BrazeLogger.SUPPRESS;
                            }
                            i34 &= -458753;
                        } else {
                            i47 = i10;
                        }
                        if (i41 != 0) {
                            i48 = 1;
                        } else {
                            i48 = i11;
                        }
                        boolean z211116 = z16;
                        if (i43 != 0) {
                            c1086gP.L(1299418141);
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar4 = (androidx.compose.foundation.interaction.k) objF;
                            c1086gP.T(false);
                        } else {
                            kVar4 = kVar2;
                        }
                        if ((i15 & 262144) != 0) {
                            l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                            i34 &= -234881025;
                        } else {
                            l0Var2 = l0Var;
                        }
                        if ((i15 & 524288) != 0) {
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults17 = OutlinedTextFieldDefaults.f12253a;
                            TextFieldColors textFieldColorsC17 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                            IntercomTheme intercomTheme17 = IntercomTheme.INSTANCE;
                            int i51115 = IntercomTheme.$stable;
                            textFieldColorsA = textFieldColorsC17.a(((-14837) & 1) != 0 ? textFieldColorsC17.f12344a : intercomTheme17.getColors(c1086gP, i51115).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC17.f12345b : intercomTheme17.getColors(c1086gP, i51115).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme17.getColors(c1086gP, i51115).m645getPrimaryText0d7_KjU()), textFieldColorsC17.f12347d, intercomTheme17.getColors(c1086gP, i51115).m637getInputAlt0d7_KjU(), intercomTheme17.getColors(c1086gP, i51115).m637getInputAlt0d7_KjU(), intercomTheme17.getColors(c1086gP, i51115).m637getInputAlt0d7_KjU(), intercomTheme17.getColors(c1086gP, i51115).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC17.f12352i : 0L, textFieldColorsC17.j, textFieldColorsC17.f12353k, intercomTheme17.getColors(c1086gP, i51115).m627getCollectorBorder0d7_KjU(), intercomTheme17.getColors(c1086gP, i51115).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC17.f12356n : 0L, textFieldColorsC17.f12357o, textFieldColorsC17.f12358p, textFieldColorsC17.f12359q, textFieldColorsC17.f12360r, textFieldColorsC17.f12361s, textFieldColorsC17.f12362t, textFieldColorsC17.f12363u, textFieldColorsC17.f12364v, textFieldColorsC17.f12365w, textFieldColorsC17.f12366x, textFieldColorsC17.f12367y, textFieldColorsC17.f12368z, textFieldColorsC17.f12327A, textFieldColorsC17.f12328B, textFieldColorsC17.f12329C, textFieldColorsC17.f12330D, textFieldColorsC17.f12331E, textFieldColorsC17.f12332F, textFieldColorsC17.f12333G, textFieldColorsC17.f12334H, textFieldColorsC17.f12335I, textFieldColorsC17.f12336J, textFieldColorsC17.f12337K, textFieldColorsC17.f12338L, textFieldColorsC17.f12339M, textFieldColorsC17.f12340N, textFieldColorsC17.f12341O, textFieldColorsC17.f12342P, textFieldColorsC17.f12343Q);
                            i34 &= -1879048193;
                        } else {
                            textFieldColorsA = textFieldColors;
                        }
                        if (i45 != 0) {
                            float f119 = 8;
                            n10 = new N(f119, f119, f119, f119);
                        } else {
                            n10 = l10;
                        }
                        pVar9 = pVar7;
                        i49 = i34;
                        z18 = z211116;
                    }
                    c1086gP.U();
                    jB = f11.b();
                    if (jB == 16) {
                        if (z14) {
                            j11 = textFieldColorsA.f12345b;
                        } else {
                            j11 = textFieldColorsA.f12346c;
                        }
                        jB = j11;
                    }
                    F fD9 = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    if (pVar5 != null) {
                        hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
                    } else {
                        hVarJ = hVar2;
                    }
                    if (z14) {
                        j = textFieldColorsA.f12349f;
                    } else {
                        j = textFieldColorsA.f12350g;
                    }
                    androidx.compose.ui.h hVarA9 = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
                    if (z18) {
                        j10 = textFieldColorsA.j;
                    } else {
                        j10 = textFieldColorsA.f12352i;
                    }
                    final boolean z211117 = z14;
                    final boolean z211118 = z17;
                    final E e115 = e11;
                    final androidx.compose.foundation.interaction.k kVar19 = kVar4;
                    final boolean z211119 = z18;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11116 = pVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11117 = pVar6;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11118 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11119 = pVar8;
                    final TextFieldColors textFieldColors11 = textFieldColorsA;
                    final L l110 = n10;
                    final l0 l0Var12 = l0Var2;
                    int i51116 = i49 << 12;
                    BasicTextFieldKt.b(value, onValueChange, hVarA9, z14, z15, fD9, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                        @Override // Ia.q
                        public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar111110, InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar111110, interfaceC1084f2, num.intValue());
                            return p293xa.r.f47939a;
                        }

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
                        public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i51117) {
                            int i60;
                            kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                            if ((i51117 & 14) == 0) {
                                i60 = i51117 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                            } else {
                                i60 = i51117;
                            }
                            if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                                return;
                            }
                            OutlinedTextFieldDefaults outlinedTextFieldDefaults18 = OutlinedTextFieldDefaults.f12253a;
                            String str = value;
                            final boolean z2111110 = z211117;
                            boolean z2111111 = z211118;
                            E e116 = e115;
                            final androidx.compose.foundation.interaction.k kVar110 = kVar19;
                            final boolean z2111112 = z211119;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar111110 = pVar11116;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar111111 = pVar11117;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar11118;
                            Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar11119;
                            final TextFieldColors textFieldColors12 = textFieldColors11;
                            L l111 = l110;
                            final l0 l0Var13 = l0Var12;
                            outlinedTextFieldDefaults18.b(str, innerTextField, z2111110, z2111111, e116, kVar110, z2111112, pVar111110, pVar111111, pVar20, pVar21, null, null, null, textFieldColors12, l111, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                    invoke(interfaceC1084f3, num.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                                    if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                        interfaceC1084f3.w();
                                    } else {
                                        float f1110 = 1;
                                        OutlinedTextFieldDefaults.f12253a.a(z2111110, z2111112, kVar110, null, textFieldColors12, l0Var13, f1110, f1110, interfaceC1084f3, 114819072, 8);
                                    }
                                }
                            }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                        }
                    }, c1086gP), c1086gP, (i55 & 64638) | (i51116 & 3670016) | (i51116 & 29360128) | (i51116 & 234881024) | (i51116 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
                    kVar5 = kVar3;
                    l0Var3 = l0Var2;
                    jVar3 = jVar2;
                    pVar10 = pVar6;
                    l11 = n10;
                    z19 = z14;
                    pVar11 = pVar8;
                    f12 = f11;
                    pVar12 = pVar5;
                    z20 = z18;
                    kVar6 = kVar4;
                    i50 = i48;
                    z21 = z15;
                    z22 = z17;
                    textFieldColors2 = textFieldColorsA;
                    pVar13 = pVar9;
                    e12 = e11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final androidx.compose.ui.h hVar7 = hVar2;
                    final boolean z2122 = z20;
                    final E e116 = e12;
                    final androidx.compose.foundation.text.k kVar110 = kVar5;
                    final androidx.compose.foundation.text.j jVar8 = jVar3;
                    final boolean z223 = z22;
                    final int i51117 = i47;
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.views.compose.i
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return IntercomOutlinedTextFieldKt.IntercomOutlinedTextField$lambda$3(value, onValueChange, hVar7, z19, z21, f12, pVar12, pVar10, pVar13, pVar11, z2122, e116, kVar110, jVar8, z223, i51117, i50, kVar6, l0Var3, textFieldColors2, l11, i12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i28 = 805306368;
            i55 |= i28;
            i29 = i15 & 1024;
            if (i29 != 0) {
                i30 = i13 | 6;
            } else if ((i13 & 14) == 0) {
                if (c1086gP.c(z12)) {
                    i31 = 4;
                } else {
                    i31 = 2;
                }
                i30 = i13 | i31;
            } else {
                i30 = i13;
            }
            i32 = i15 & 2048;
            if (i32 != 0) {
                i30 |= 48;
            } else if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                if (c1086gP.K(e10)) {
                    i33 = 32;
                } else {
                    i33 = 16;
                }
                i30 |= i33;
            }
            i34 = i30;
            i35 = i15 & 4096;
            if (i35 != 0) {
                i34 |= 384;
            } else if ((i13 & 896) != 0) {
                if (c1086gP.K(kVar)) {
                    i36 = 256;
                } else {
                    i36 = 128;
                }
                i34 |= i36;
            }
            i37 = i15 & 8192;
            if (i37 != 0) {
                i34 |= 3072;
            } else if ((i13 & 7168) != 0) {
                if (c1086gP.K(jVar)) {
                    i38 = 2048;
                } else {
                    i38 = 1024;
                }
                i34 |= i38;
            }
            i39 = i15 & 16384;
            if (i39 != 0) {
                i34 |= 24576;
            } else if ((i13 & 57344) == 0) {
                if (c1086gP.c(z13)) {
                    i40 = 16384;
                } else {
                    i40 = 8192;
                }
                i34 |= i40;
            }
            if ((i13 & 458752) != 0) {
                if ((i15 & 32768) == 0) {
                    i53 = 65536;
                } else {
                    i53 = 65536;
                }
                i34 |= i53;
            }
            i41 = i15 & 65536;
            if (i41 != 0) {
                i34 |= 1572864;
            } else if ((i13 & 3670016) == 0) {
                if (c1086gP.h(i11)) {
                    i42 = 1048576;
                } else {
                    i42 = 524288;
                }
                i34 |= i42;
            }
            i43 = i15 & 131072;
            if (i43 != 0) {
                i34 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (c1086gP.K(kVar2)) {
                    i44 = 8388608;
                } else {
                    i44 = 4194304;
                }
                i34 |= i44;
            }
            if ((i13 & 234881024) != 0) {
                if ((i15 & 262144) == 0) {
                    i52 = 33554432;
                } else {
                    i52 = 33554432;
                }
                i34 |= i52;
            }
            if ((i13 & 1879048192) != 0) {
                if ((i15 & 524288) == 0) {
                    i51 = 268435456;
                } else {
                    i51 = 268435456;
                }
                i34 |= i51;
            }
            i45 = i15 & 1048576;
            if (i45 != 0) {
                i46 = i14 | 6;
            } else if ((i14 & 14) == 0) {
                i46 = i14 | (c1086gP.K(l10) ? 4 : 2);
            } else {
                i46 = i14;
            }
            if ((i55 & 1533916891) != 306783378) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i56 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if ((i15 & 32) != 0) {
                        f11 = (F) c1086gP.x(TextKt.f12383a);
                        i55 &= -458753;
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i23 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i32 != 0) {
                        e11 = E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i35 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i37 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i39 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 32768) != 0) {
                        if (z17) {
                            i47 = 1;
                        } else {
                            i47 = BrazeLogger.SUPPRESS;
                        }
                        i34 &= -458753;
                    } else {
                        i47 = i10;
                    }
                    if (i41 != 0) {
                        i48 = 1;
                    } else {
                        i48 = i11;
                    }
                    boolean z2111110 = z16;
                    if (i43 != 0) {
                        c1086gP.L(1299418141);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objF;
                        c1086gP.T(false);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i15 & 262144) != 0) {
                        l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        i34 &= -234881025;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i15 & 524288) != 0) {
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults18 = OutlinedTextFieldDefaults.f12253a;
                        TextFieldColors textFieldColorsC18 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                        IntercomTheme intercomTheme18 = IntercomTheme.INSTANCE;
                        int i51118 = IntercomTheme.$stable;
                        textFieldColorsA = textFieldColorsC18.a(((-14837) & 1) != 0 ? textFieldColorsC18.f12344a : intercomTheme18.getColors(c1086gP, i51118).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC18.f12345b : intercomTheme18.getColors(c1086gP, i51118).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme18.getColors(c1086gP, i51118).m645getPrimaryText0d7_KjU()), textFieldColorsC18.f12347d, intercomTheme18.getColors(c1086gP, i51118).m637getInputAlt0d7_KjU(), intercomTheme18.getColors(c1086gP, i51118).m637getInputAlt0d7_KjU(), intercomTheme18.getColors(c1086gP, i51118).m637getInputAlt0d7_KjU(), intercomTheme18.getColors(c1086gP, i51118).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC18.f12352i : 0L, textFieldColorsC18.j, textFieldColorsC18.f12353k, intercomTheme18.getColors(c1086gP, i51118).m627getCollectorBorder0d7_KjU(), intercomTheme18.getColors(c1086gP, i51118).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC18.f12356n : 0L, textFieldColorsC18.f12357o, textFieldColorsC18.f12358p, textFieldColorsC18.f12359q, textFieldColorsC18.f12360r, textFieldColorsC18.f12361s, textFieldColorsC18.f12362t, textFieldColorsC18.f12363u, textFieldColorsC18.f12364v, textFieldColorsC18.f12365w, textFieldColorsC18.f12366x, textFieldColorsC18.f12367y, textFieldColorsC18.f12368z, textFieldColorsC18.f12327A, textFieldColorsC18.f12328B, textFieldColorsC18.f12329C, textFieldColorsC18.f12330D, textFieldColorsC18.f12331E, textFieldColorsC18.f12332F, textFieldColorsC18.f12333G, textFieldColorsC18.f12334H, textFieldColorsC18.f12335I, textFieldColorsC18.f12336J, textFieldColorsC18.f12337K, textFieldColorsC18.f12338L, textFieldColorsC18.f12339M, textFieldColorsC18.f12340N, textFieldColorsC18.f12341O, textFieldColorsC18.f12342P, textFieldColorsC18.f12343Q);
                        i34 &= -1879048193;
                    } else {
                        textFieldColorsA = textFieldColors;
                    }
                    if (i45 != 0) {
                        float f1110 = 8;
                        n10 = new N(f1110, f1110, f1110, f1110);
                    } else {
                        n10 = l10;
                    }
                    pVar9 = pVar7;
                    i49 = i34;
                    z18 = z2111110;
                } else {
                    if (i56 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if ((i15 & 32) != 0) {
                        f11 = (F) c1086gP.x(TextKt.f12383a);
                        i55 &= -458753;
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i23 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i32 != 0) {
                        e11 = E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i35 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i37 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i39 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 32768) != 0) {
                        if (z17) {
                            i47 = 1;
                        } else {
                            i47 = BrazeLogger.SUPPRESS;
                        }
                        i34 &= -458753;
                    } else {
                        i47 = i10;
                    }
                    if (i41 != 0) {
                        i48 = 1;
                    } else {
                        i48 = i11;
                    }
                    boolean z2111111 = z16;
                    if (i43 != 0) {
                        c1086gP.L(1299418141);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objF;
                        c1086gP.T(false);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i15 & 262144) != 0) {
                        l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        i34 &= -234881025;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i15 & 524288) != 0) {
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults19 = OutlinedTextFieldDefaults.f12253a;
                        TextFieldColors textFieldColorsC19 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                        IntercomTheme intercomTheme19 = IntercomTheme.INSTANCE;
                        int i51119 = IntercomTheme.$stable;
                        textFieldColorsA = textFieldColorsC19.a(((-14837) & 1) != 0 ? textFieldColorsC19.f12344a : intercomTheme19.getColors(c1086gP, i51119).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC19.f12345b : intercomTheme19.getColors(c1086gP, i51119).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme19.getColors(c1086gP, i51119).m645getPrimaryText0d7_KjU()), textFieldColorsC19.f12347d, intercomTheme19.getColors(c1086gP, i51119).m637getInputAlt0d7_KjU(), intercomTheme19.getColors(c1086gP, i51119).m637getInputAlt0d7_KjU(), intercomTheme19.getColors(c1086gP, i51119).m637getInputAlt0d7_KjU(), intercomTheme19.getColors(c1086gP, i51119).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC19.f12352i : 0L, textFieldColorsC19.j, textFieldColorsC19.f12353k, intercomTheme19.getColors(c1086gP, i51119).m627getCollectorBorder0d7_KjU(), intercomTheme19.getColors(c1086gP, i51119).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC19.f12356n : 0L, textFieldColorsC19.f12357o, textFieldColorsC19.f12358p, textFieldColorsC19.f12359q, textFieldColorsC19.f12360r, textFieldColorsC19.f12361s, textFieldColorsC19.f12362t, textFieldColorsC19.f12363u, textFieldColorsC19.f12364v, textFieldColorsC19.f12365w, textFieldColorsC19.f12366x, textFieldColorsC19.f12367y, textFieldColorsC19.f12368z, textFieldColorsC19.f12327A, textFieldColorsC19.f12328B, textFieldColorsC19.f12329C, textFieldColorsC19.f12330D, textFieldColorsC19.f12331E, textFieldColorsC19.f12332F, textFieldColorsC19.f12333G, textFieldColorsC19.f12334H, textFieldColorsC19.f12335I, textFieldColorsC19.f12336J, textFieldColorsC19.f12337K, textFieldColorsC19.f12338L, textFieldColorsC19.f12339M, textFieldColorsC19.f12340N, textFieldColorsC19.f12341O, textFieldColorsC19.f12342P, textFieldColorsC19.f12343Q);
                        i34 &= -1879048193;
                    } else {
                        textFieldColorsA = textFieldColors;
                    }
                    if (i45 != 0) {
                        float f1111 = 8;
                        n10 = new N(f1111, f1111, f1111, f1111);
                    } else {
                        n10 = l10;
                    }
                    pVar9 = pVar7;
                    i49 = i34;
                    z18 = z2111111;
                }
                c1086gP.U();
                jB = f11.b();
                if (jB == 16) {
                    if (z14) {
                        j11 = textFieldColorsA.f12345b;
                    } else {
                        j11 = textFieldColorsA.f12346c;
                    }
                    jB = j11;
                }
                F fD10 = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
                if (pVar5 != null) {
                    hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
                } else {
                    hVarJ = hVar2;
                }
                if (z14) {
                    j = textFieldColorsA.f12349f;
                } else {
                    j = textFieldColorsA.f12350g;
                }
                androidx.compose.ui.h hVarA10 = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
                if (z18) {
                    j10 = textFieldColorsA.j;
                } else {
                    j10 = textFieldColorsA.f12352i;
                }
                final boolean z2111112 = z14;
                final boolean z2111113 = z17;
                final E e117 = e11;
                final androidx.compose.foundation.interaction.k kVar111 = kVar4;
                final boolean z2111114 = z18;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111110 = pVar5;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111111 = pVar6;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111112 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111113 = pVar8;
                final TextFieldColors textFieldColors12 = textFieldColorsA;
                final L l111 = n10;
                final l0 l0Var13 = l0Var2;
                int i511110 = i49 << 12;
                BasicTextFieldKt.b(value, onValueChange, hVarA10, z14, z15, fD10, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar111114, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar111114, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

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
                    public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i511111) {
                        int i60;
                        kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                        if ((i511111 & 14) == 0) {
                            i60 = i511111 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                        } else {
                            i60 = i511111;
                        }
                        if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults110 = OutlinedTextFieldDefaults.f12253a;
                        String str = value;
                        final boolean z2111115 = z2111112;
                        boolean z2111116 = z2111113;
                        E e118 = e117;
                        final androidx.compose.foundation.interaction.k kVar112 = kVar111;
                        final boolean z2111117 = z2111114;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar111114 = pVar111110;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar111115 = pVar111111;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar111112;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar111113;
                        final TextFieldColors textFieldColors13 = textFieldColors12;
                        L l112 = l111;
                        final l0 l0Var14 = l0Var13;
                        outlinedTextFieldDefaults110.b(str, innerTextField, z2111115, z2111116, e118, kVar112, z2111117, pVar111114, pVar111115, pVar20, pVar21, null, null, null, textFieldColors13, l112, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                                if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    float f1112 = 1;
                                    OutlinedTextFieldDefaults.f12253a.a(z2111115, z2111117, kVar112, null, textFieldColors13, l0Var14, f1112, f1112, interfaceC1084f3, 114819072, 8);
                                }
                            }
                        }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                    }
                }, c1086gP), c1086gP, (i55 & 64638) | (i511110 & 3670016) | (i511110 & 29360128) | (i511110 & 234881024) | (i511110 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
                kVar5 = kVar3;
                l0Var3 = l0Var2;
                jVar3 = jVar2;
                pVar10 = pVar6;
                l11 = n10;
                z19 = z14;
                pVar11 = pVar8;
                f12 = f11;
                pVar12 = pVar5;
                z20 = z18;
                kVar6 = kVar4;
                i50 = i48;
                z21 = z15;
                z22 = z17;
                textFieldColors2 = textFieldColorsA;
                pVar13 = pVar9;
                e12 = e11;
            } else {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i56 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if ((i15 & 32) != 0) {
                        f11 = (F) c1086gP.x(TextKt.f12383a);
                        i55 &= -458753;
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i23 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i32 != 0) {
                        e11 = E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i35 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i37 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i39 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 32768) != 0) {
                        if (z17) {
                            i47 = 1;
                        } else {
                            i47 = BrazeLogger.SUPPRESS;
                        }
                        i34 &= -458753;
                    } else {
                        i47 = i10;
                    }
                    if (i41 != 0) {
                        i48 = 1;
                    } else {
                        i48 = i11;
                    }
                    boolean z2111115 = z16;
                    if (i43 != 0) {
                        c1086gP.L(1299418141);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objF;
                        c1086gP.T(false);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i15 & 262144) != 0) {
                        l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        i34 &= -234881025;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i15 & 524288) != 0) {
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults110 = OutlinedTextFieldDefaults.f12253a;
                        TextFieldColors textFieldColorsC110 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                        IntercomTheme intercomTheme110 = IntercomTheme.INSTANCE;
                        int i511111 = IntercomTheme.$stable;
                        textFieldColorsA = textFieldColorsC110.a(((-14837) & 1) != 0 ? textFieldColorsC110.f12344a : intercomTheme110.getColors(c1086gP, i511111).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC110.f12345b : intercomTheme110.getColors(c1086gP, i511111).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme110.getColors(c1086gP, i511111).m645getPrimaryText0d7_KjU()), textFieldColorsC110.f12347d, intercomTheme110.getColors(c1086gP, i511111).m637getInputAlt0d7_KjU(), intercomTheme110.getColors(c1086gP, i511111).m637getInputAlt0d7_KjU(), intercomTheme110.getColors(c1086gP, i511111).m637getInputAlt0d7_KjU(), intercomTheme110.getColors(c1086gP, i511111).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC110.f12352i : 0L, textFieldColorsC110.j, textFieldColorsC110.f12353k, intercomTheme110.getColors(c1086gP, i511111).m627getCollectorBorder0d7_KjU(), intercomTheme110.getColors(c1086gP, i511111).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC110.f12356n : 0L, textFieldColorsC110.f12357o, textFieldColorsC110.f12358p, textFieldColorsC110.f12359q, textFieldColorsC110.f12360r, textFieldColorsC110.f12361s, textFieldColorsC110.f12362t, textFieldColorsC110.f12363u, textFieldColorsC110.f12364v, textFieldColorsC110.f12365w, textFieldColorsC110.f12366x, textFieldColorsC110.f12367y, textFieldColorsC110.f12368z, textFieldColorsC110.f12327A, textFieldColorsC110.f12328B, textFieldColorsC110.f12329C, textFieldColorsC110.f12330D, textFieldColorsC110.f12331E, textFieldColorsC110.f12332F, textFieldColorsC110.f12333G, textFieldColorsC110.f12334H, textFieldColorsC110.f12335I, textFieldColorsC110.f12336J, textFieldColorsC110.f12337K, textFieldColorsC110.f12338L, textFieldColorsC110.f12339M, textFieldColorsC110.f12340N, textFieldColorsC110.f12341O, textFieldColorsC110.f12342P, textFieldColorsC110.f12343Q);
                        i34 &= -1879048193;
                    } else {
                        textFieldColorsA = textFieldColors;
                    }
                    if (i45 != 0) {
                        float f1112 = 8;
                        n10 = new N(f1112, f1112, f1112, f1112);
                    } else {
                        n10 = l10;
                    }
                    pVar9 = pVar7;
                    i49 = i34;
                    z18 = z2111115;
                } else {
                    if (i56 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if ((i15 & 32) != 0) {
                        f11 = (F) c1086gP.x(TextKt.f12383a);
                        i55 &= -458753;
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i23 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i32 != 0) {
                        e11 = E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i35 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i37 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i39 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 32768) != 0) {
                        if (z17) {
                            i47 = 1;
                        } else {
                            i47 = BrazeLogger.SUPPRESS;
                        }
                        i34 &= -458753;
                    } else {
                        i47 = i10;
                    }
                    if (i41 != 0) {
                        i48 = 1;
                    } else {
                        i48 = i11;
                    }
                    boolean z2111116 = z16;
                    if (i43 != 0) {
                        c1086gP.L(1299418141);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objF;
                        c1086gP.T(false);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i15 & 262144) != 0) {
                        l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        i34 &= -234881025;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i15 & 524288) != 0) {
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults111 = OutlinedTextFieldDefaults.f12253a;
                        TextFieldColors textFieldColorsC111 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                        IntercomTheme intercomTheme111 = IntercomTheme.INSTANCE;
                        int i511112 = IntercomTheme.$stable;
                        textFieldColorsA = textFieldColorsC111.a(((-14837) & 1) != 0 ? textFieldColorsC111.f12344a : intercomTheme111.getColors(c1086gP, i511112).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC111.f12345b : intercomTheme111.getColors(c1086gP, i511112).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme111.getColors(c1086gP, i511112).m645getPrimaryText0d7_KjU()), textFieldColorsC111.f12347d, intercomTheme111.getColors(c1086gP, i511112).m637getInputAlt0d7_KjU(), intercomTheme111.getColors(c1086gP, i511112).m637getInputAlt0d7_KjU(), intercomTheme111.getColors(c1086gP, i511112).m637getInputAlt0d7_KjU(), intercomTheme111.getColors(c1086gP, i511112).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC111.f12352i : 0L, textFieldColorsC111.j, textFieldColorsC111.f12353k, intercomTheme111.getColors(c1086gP, i511112).m627getCollectorBorder0d7_KjU(), intercomTheme111.getColors(c1086gP, i511112).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC111.f12356n : 0L, textFieldColorsC111.f12357o, textFieldColorsC111.f12358p, textFieldColorsC111.f12359q, textFieldColorsC111.f12360r, textFieldColorsC111.f12361s, textFieldColorsC111.f12362t, textFieldColorsC111.f12363u, textFieldColorsC111.f12364v, textFieldColorsC111.f12365w, textFieldColorsC111.f12366x, textFieldColorsC111.f12367y, textFieldColorsC111.f12368z, textFieldColorsC111.f12327A, textFieldColorsC111.f12328B, textFieldColorsC111.f12329C, textFieldColorsC111.f12330D, textFieldColorsC111.f12331E, textFieldColorsC111.f12332F, textFieldColorsC111.f12333G, textFieldColorsC111.f12334H, textFieldColorsC111.f12335I, textFieldColorsC111.f12336J, textFieldColorsC111.f12337K, textFieldColorsC111.f12338L, textFieldColorsC111.f12339M, textFieldColorsC111.f12340N, textFieldColorsC111.f12341O, textFieldColorsC111.f12342P, textFieldColorsC111.f12343Q);
                        i34 &= -1879048193;
                    } else {
                        textFieldColorsA = textFieldColors;
                    }
                    if (i45 != 0) {
                        float f1113 = 8;
                        n10 = new N(f1113, f1113, f1113, f1113);
                    } else {
                        n10 = l10;
                    }
                    pVar9 = pVar7;
                    i49 = i34;
                    z18 = z2111116;
                }
                c1086gP.U();
                jB = f11.b();
                if (jB == 16) {
                    if (z14) {
                        j11 = textFieldColorsA.f12345b;
                    } else {
                        j11 = textFieldColorsA.f12346c;
                    }
                    jB = j11;
                }
                F fD11 = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
                if (pVar5 != null) {
                    hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
                } else {
                    hVarJ = hVar2;
                }
                if (z14) {
                    j = textFieldColorsA.f12349f;
                } else {
                    j = textFieldColorsA.f12350g;
                }
                androidx.compose.ui.h hVarA11 = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
                if (z18) {
                    j10 = textFieldColorsA.j;
                } else {
                    j10 = textFieldColorsA.f12352i;
                }
                final boolean z2111117 = z14;
                final boolean z2111118 = z17;
                final E e118 = e11;
                final androidx.compose.foundation.interaction.k kVar112 = kVar4;
                final boolean z2111119 = z18;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111114 = pVar5;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111115 = pVar6;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111116 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111117 = pVar8;
                final TextFieldColors textFieldColors13 = textFieldColorsA;
                final L l112 = n10;
                final l0 l0Var14 = l0Var2;
                int i511113 = i49 << 12;
                BasicTextFieldKt.b(value, onValueChange, hVarA11, z14, z15, fD11, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar111118, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar111118, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

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
                    public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i511114) {
                        int i60;
                        kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                        if ((i511114 & 14) == 0) {
                            i60 = i511114 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                        } else {
                            i60 = i511114;
                        }
                        if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults112 = OutlinedTextFieldDefaults.f12253a;
                        String str = value;
                        final boolean z21111110 = z2111117;
                        boolean z21111111 = z2111118;
                        E e119 = e118;
                        final androidx.compose.foundation.interaction.k kVar113 = kVar112;
                        final boolean z21111112 = z2111119;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar111118 = pVar111114;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar111119 = pVar111115;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar111116;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar111117;
                        final TextFieldColors textFieldColors14 = textFieldColors13;
                        L l113 = l112;
                        final l0 l0Var15 = l0Var14;
                        outlinedTextFieldDefaults112.b(str, innerTextField, z21111110, z21111111, e119, kVar113, z21111112, pVar111118, pVar111119, pVar20, pVar21, null, null, null, textFieldColors14, l113, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                                if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    float f1114 = 1;
                                    OutlinedTextFieldDefaults.f12253a.a(z21111110, z21111112, kVar113, null, textFieldColors14, l0Var15, f1114, f1114, interfaceC1084f3, 114819072, 8);
                                }
                            }
                        }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                    }
                }, c1086gP), c1086gP, (i55 & 64638) | (i511113 & 3670016) | (i511113 & 29360128) | (i511113 & 234881024) | (i511113 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
                kVar5 = kVar3;
                l0Var3 = l0Var2;
                jVar3 = jVar2;
                pVar10 = pVar6;
                l11 = n10;
                z19 = z14;
                pVar11 = pVar8;
                f12 = f11;
                pVar12 = pVar5;
                z20 = z18;
                kVar6 = kVar4;
                i50 = i48;
                z21 = z15;
                z22 = z17;
                textFieldColors2 = textFieldColorsA;
                pVar13 = pVar9;
                e12 = e11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar8 = hVar2;
                final boolean z2123 = z20;
                final E e119 = e12;
                final androidx.compose.foundation.text.k kVar113 = kVar5;
                final androidx.compose.foundation.text.j jVar9 = jVar3;
                final boolean z224 = z22;
                final int i511114 = i47;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.views.compose.i
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomOutlinedTextFieldKt.IntercomOutlinedTextField$lambda$3(value, onValueChange, hVar8, z19, z21, f12, pVar12, pVar10, pVar13, pVar11, z2123, e119, kVar113, jVar9, z224, i511114, i50, kVar6, l0Var3, textFieldColors2, l11, i12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i55 |= 3072;
        i19 = i15 & 16;
        if (i19 != 0) {
            i55 |= 24576;
        } else if ((i12 & 57344) == 0) {
            if (c1086gP.c(z11)) {
                i20 = 16384;
            } else {
                i20 = 8192;
            }
            i55 |= i20;
        }
        if ((i12 & 458752) != 0) {
            if ((i15 & 32) == 0) {
                i54 = 65536;
            } else {
                i54 = 65536;
            }
            i55 |= i54;
        }
        i21 = i15 & 64;
        if (i21 != 0) {
            i55 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (c1086gP.k(pVar)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i55 |= i22;
        }
        i23 = i15 & 128;
        if (i23 != 0) {
            i55 |= 12582912;
        } else if ((i12 & 29360128) == 0) {
            if (c1086gP.k(pVar2)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i55 |= i24;
        }
        i25 = i15 & 256;
        if (i25 != 0) {
            i55 |= 100663296;
        } else if ((i12 & 234881024) == 0) {
            if (c1086gP.k(pVar3)) {
                i26 = 67108864;
            } else {
                i26 = 33554432;
            }
            i55 |= i26;
        }
        i27 = i15 & 512;
        if (i27 != 0) {
            if ((i12 & 1879048192) == 0) {
                if (c1086gP.k(pVar4)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
            }
            i29 = i15 & 1024;
            if (i29 != 0) {
                i30 = i13 | 6;
            } else if ((i13 & 14) == 0) {
                if (c1086gP.c(z12)) {
                    i31 = 4;
                } else {
                    i31 = 2;
                }
                i30 = i13 | i31;
            } else {
                i30 = i13;
            }
            i32 = i15 & 2048;
            if (i32 != 0) {
                i30 |= 48;
            } else if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                if (c1086gP.K(e10)) {
                    i33 = 32;
                } else {
                    i33 = 16;
                }
                i30 |= i33;
            }
            i34 = i30;
            i35 = i15 & 4096;
            if (i35 != 0) {
                i34 |= 384;
            } else if ((i13 & 896) != 0) {
                if (c1086gP.K(kVar)) {
                    i36 = 256;
                } else {
                    i36 = 128;
                }
                i34 |= i36;
            }
            i37 = i15 & 8192;
            if (i37 != 0) {
                i34 |= 3072;
            } else if ((i13 & 7168) != 0) {
                if (c1086gP.K(jVar)) {
                    i38 = 2048;
                } else {
                    i38 = 1024;
                }
                i34 |= i38;
            }
            i39 = i15 & 16384;
            if (i39 != 0) {
                i34 |= 24576;
            } else if ((i13 & 57344) == 0) {
                if (c1086gP.c(z13)) {
                    i40 = 16384;
                } else {
                    i40 = 8192;
                }
                i34 |= i40;
            }
            if ((i13 & 458752) != 0) {
                if ((i15 & 32768) == 0) {
                    i53 = 65536;
                } else {
                    i53 = 65536;
                }
                i34 |= i53;
            }
            i41 = i15 & 65536;
            if (i41 != 0) {
                i34 |= 1572864;
            } else if ((i13 & 3670016) == 0) {
                if (c1086gP.h(i11)) {
                    i42 = 1048576;
                } else {
                    i42 = 524288;
                }
                i34 |= i42;
            }
            i43 = i15 & 131072;
            if (i43 != 0) {
                i34 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (c1086gP.K(kVar2)) {
                    i44 = 8388608;
                } else {
                    i44 = 4194304;
                }
                i34 |= i44;
            }
            if ((i13 & 234881024) != 0) {
                if ((i15 & 262144) == 0) {
                    i52 = 33554432;
                } else {
                    i52 = 33554432;
                }
                i34 |= i52;
            }
            if ((i13 & 1879048192) != 0) {
                if ((i15 & 524288) == 0) {
                    i51 = 268435456;
                } else {
                    i51 = 268435456;
                }
                i34 |= i51;
            }
            i45 = i15 & 1048576;
            if (i45 != 0) {
                i46 = i14 | 6;
            } else if ((i14 & 14) == 0) {
                i46 = i14 | (c1086gP.K(l10) ? 4 : 2);
            } else {
                i46 = i14;
            }
            if ((i55 & 1533916891) != 306783378) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i56 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if ((i15 & 32) != 0) {
                        f11 = (F) c1086gP.x(TextKt.f12383a);
                        i55 &= -458753;
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i23 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i32 != 0) {
                        e11 = E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i35 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i37 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i39 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 32768) != 0) {
                        if (z17) {
                            i47 = 1;
                        } else {
                            i47 = BrazeLogger.SUPPRESS;
                        }
                        i34 &= -458753;
                    } else {
                        i47 = i10;
                    }
                    if (i41 != 0) {
                        i48 = 1;
                    } else {
                        i48 = i11;
                    }
                    boolean z21111110 = z16;
                    if (i43 != 0) {
                        c1086gP.L(1299418141);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objF;
                        c1086gP.T(false);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i15 & 262144) != 0) {
                        l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        i34 &= -234881025;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i15 & 524288) != 0) {
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults112 = OutlinedTextFieldDefaults.f12253a;
                        TextFieldColors textFieldColorsC112 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                        IntercomTheme intercomTheme112 = IntercomTheme.INSTANCE;
                        int i511115 = IntercomTheme.$stable;
                        textFieldColorsA = textFieldColorsC112.a(((-14837) & 1) != 0 ? textFieldColorsC112.f12344a : intercomTheme112.getColors(c1086gP, i511115).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC112.f12345b : intercomTheme112.getColors(c1086gP, i511115).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme112.getColors(c1086gP, i511115).m645getPrimaryText0d7_KjU()), textFieldColorsC112.f12347d, intercomTheme112.getColors(c1086gP, i511115).m637getInputAlt0d7_KjU(), intercomTheme112.getColors(c1086gP, i511115).m637getInputAlt0d7_KjU(), intercomTheme112.getColors(c1086gP, i511115).m637getInputAlt0d7_KjU(), intercomTheme112.getColors(c1086gP, i511115).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC112.f12352i : 0L, textFieldColorsC112.j, textFieldColorsC112.f12353k, intercomTheme112.getColors(c1086gP, i511115).m627getCollectorBorder0d7_KjU(), intercomTheme112.getColors(c1086gP, i511115).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC112.f12356n : 0L, textFieldColorsC112.f12357o, textFieldColorsC112.f12358p, textFieldColorsC112.f12359q, textFieldColorsC112.f12360r, textFieldColorsC112.f12361s, textFieldColorsC112.f12362t, textFieldColorsC112.f12363u, textFieldColorsC112.f12364v, textFieldColorsC112.f12365w, textFieldColorsC112.f12366x, textFieldColorsC112.f12367y, textFieldColorsC112.f12368z, textFieldColorsC112.f12327A, textFieldColorsC112.f12328B, textFieldColorsC112.f12329C, textFieldColorsC112.f12330D, textFieldColorsC112.f12331E, textFieldColorsC112.f12332F, textFieldColorsC112.f12333G, textFieldColorsC112.f12334H, textFieldColorsC112.f12335I, textFieldColorsC112.f12336J, textFieldColorsC112.f12337K, textFieldColorsC112.f12338L, textFieldColorsC112.f12339M, textFieldColorsC112.f12340N, textFieldColorsC112.f12341O, textFieldColorsC112.f12342P, textFieldColorsC112.f12343Q);
                        i34 &= -1879048193;
                    } else {
                        textFieldColorsA = textFieldColors;
                    }
                    if (i45 != 0) {
                        float f1114 = 8;
                        n10 = new N(f1114, f1114, f1114, f1114);
                    } else {
                        n10 = l10;
                    }
                    pVar9 = pVar7;
                    i49 = i34;
                    z18 = z21111110;
                } else {
                    if (i56 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if ((i15 & 32) != 0) {
                        f11 = (F) c1086gP.x(TextKt.f12383a);
                        i55 &= -458753;
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i23 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i32 != 0) {
                        e11 = E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i35 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i37 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i39 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 32768) != 0) {
                        if (z17) {
                            i47 = 1;
                        } else {
                            i47 = BrazeLogger.SUPPRESS;
                        }
                        i34 &= -458753;
                    } else {
                        i47 = i10;
                    }
                    if (i41 != 0) {
                        i48 = 1;
                    } else {
                        i48 = i11;
                    }
                    boolean z21111111 = z16;
                    if (i43 != 0) {
                        c1086gP.L(1299418141);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objF;
                        c1086gP.T(false);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i15 & 262144) != 0) {
                        l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        i34 &= -234881025;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i15 & 524288) != 0) {
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults113 = OutlinedTextFieldDefaults.f12253a;
                        TextFieldColors textFieldColorsC113 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                        IntercomTheme intercomTheme113 = IntercomTheme.INSTANCE;
                        int i511116 = IntercomTheme.$stable;
                        textFieldColorsA = textFieldColorsC113.a(((-14837) & 1) != 0 ? textFieldColorsC113.f12344a : intercomTheme113.getColors(c1086gP, i511116).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC113.f12345b : intercomTheme113.getColors(c1086gP, i511116).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme113.getColors(c1086gP, i511116).m645getPrimaryText0d7_KjU()), textFieldColorsC113.f12347d, intercomTheme113.getColors(c1086gP, i511116).m637getInputAlt0d7_KjU(), intercomTheme113.getColors(c1086gP, i511116).m637getInputAlt0d7_KjU(), intercomTheme113.getColors(c1086gP, i511116).m637getInputAlt0d7_KjU(), intercomTheme113.getColors(c1086gP, i511116).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC113.f12352i : 0L, textFieldColorsC113.j, textFieldColorsC113.f12353k, intercomTheme113.getColors(c1086gP, i511116).m627getCollectorBorder0d7_KjU(), intercomTheme113.getColors(c1086gP, i511116).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC113.f12356n : 0L, textFieldColorsC113.f12357o, textFieldColorsC113.f12358p, textFieldColorsC113.f12359q, textFieldColorsC113.f12360r, textFieldColorsC113.f12361s, textFieldColorsC113.f12362t, textFieldColorsC113.f12363u, textFieldColorsC113.f12364v, textFieldColorsC113.f12365w, textFieldColorsC113.f12366x, textFieldColorsC113.f12367y, textFieldColorsC113.f12368z, textFieldColorsC113.f12327A, textFieldColorsC113.f12328B, textFieldColorsC113.f12329C, textFieldColorsC113.f12330D, textFieldColorsC113.f12331E, textFieldColorsC113.f12332F, textFieldColorsC113.f12333G, textFieldColorsC113.f12334H, textFieldColorsC113.f12335I, textFieldColorsC113.f12336J, textFieldColorsC113.f12337K, textFieldColorsC113.f12338L, textFieldColorsC113.f12339M, textFieldColorsC113.f12340N, textFieldColorsC113.f12341O, textFieldColorsC113.f12342P, textFieldColorsC113.f12343Q);
                        i34 &= -1879048193;
                    } else {
                        textFieldColorsA = textFieldColors;
                    }
                    if (i45 != 0) {
                        float f1115 = 8;
                        n10 = new N(f1115, f1115, f1115, f1115);
                    } else {
                        n10 = l10;
                    }
                    pVar9 = pVar7;
                    i49 = i34;
                    z18 = z21111111;
                }
                c1086gP.U();
                jB = f11.b();
                if (jB == 16) {
                    if (z14) {
                        j11 = textFieldColorsA.f12345b;
                    } else {
                        j11 = textFieldColorsA.f12346c;
                    }
                    jB = j11;
                }
                F fD12 = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
                if (pVar5 != null) {
                    hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
                } else {
                    hVarJ = hVar2;
                }
                if (z14) {
                    j = textFieldColorsA.f12349f;
                } else {
                    j = textFieldColorsA.f12350g;
                }
                androidx.compose.ui.h hVarA12 = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
                if (z18) {
                    j10 = textFieldColorsA.j;
                } else {
                    j10 = textFieldColorsA.f12352i;
                }
                final boolean z21111112 = z14;
                final boolean z21111113 = z17;
                final E e1110 = e11;
                final androidx.compose.foundation.interaction.k kVar114 = kVar4;
                final boolean z21111114 = z18;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111118 = pVar5;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar111119 = pVar6;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111110 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111111 = pVar8;
                final TextFieldColors textFieldColors14 = textFieldColorsA;
                final L l113 = n10;
                final l0 l0Var15 = l0Var2;
                int i511117 = i49 << 12;
                BasicTextFieldKt.b(value, onValueChange, hVarA12, z14, z15, fD12, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1111112, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar1111112, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

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
                    public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i511118) {
                        int i60;
                        kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                        if ((i511118 & 14) == 0) {
                            i60 = i511118 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                        } else {
                            i60 = i511118;
                        }
                        if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults114 = OutlinedTextFieldDefaults.f12253a;
                        String str = value;
                        final boolean z21111115 = z21111112;
                        boolean z21111116 = z21111113;
                        E e1111 = e1110;
                        final androidx.compose.foundation.interaction.k kVar115 = kVar114;
                        final boolean z21111117 = z21111114;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar1111112 = pVar111118;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar1111113 = pVar111119;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar1111110;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar1111111;
                        final TextFieldColors textFieldColors15 = textFieldColors14;
                        L l114 = l113;
                        final l0 l0Var16 = l0Var15;
                        outlinedTextFieldDefaults114.b(str, innerTextField, z21111115, z21111116, e1111, kVar115, z21111117, pVar1111112, pVar1111113, pVar20, pVar21, null, null, null, textFieldColors15, l114, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                                if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    float f1116 = 1;
                                    OutlinedTextFieldDefaults.f12253a.a(z21111115, z21111117, kVar115, null, textFieldColors15, l0Var16, f1116, f1116, interfaceC1084f3, 114819072, 8);
                                }
                            }
                        }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                    }
                }, c1086gP), c1086gP, (i55 & 64638) | (i511117 & 3670016) | (i511117 & 29360128) | (i511117 & 234881024) | (i511117 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
                kVar5 = kVar3;
                l0Var3 = l0Var2;
                jVar3 = jVar2;
                pVar10 = pVar6;
                l11 = n10;
                z19 = z14;
                pVar11 = pVar8;
                f12 = f11;
                pVar12 = pVar5;
                z20 = z18;
                kVar6 = kVar4;
                i50 = i48;
                z21 = z15;
                z22 = z17;
                textFieldColors2 = textFieldColorsA;
                pVar13 = pVar9;
                e12 = e11;
            } else {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i56 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if ((i15 & 32) != 0) {
                        f11 = (F) c1086gP.x(TextKt.f12383a);
                        i55 &= -458753;
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i23 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i32 != 0) {
                        e11 = E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i35 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i37 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i39 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 32768) != 0) {
                        if (z17) {
                            i47 = 1;
                        } else {
                            i47 = BrazeLogger.SUPPRESS;
                        }
                        i34 &= -458753;
                    } else {
                        i47 = i10;
                    }
                    if (i41 != 0) {
                        i48 = 1;
                    } else {
                        i48 = i11;
                    }
                    boolean z21111115 = z16;
                    if (i43 != 0) {
                        c1086gP.L(1299418141);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objF;
                        c1086gP.T(false);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i15 & 262144) != 0) {
                        l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        i34 &= -234881025;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i15 & 524288) != 0) {
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults114 = OutlinedTextFieldDefaults.f12253a;
                        TextFieldColors textFieldColorsC114 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                        IntercomTheme intercomTheme114 = IntercomTheme.INSTANCE;
                        int i511118 = IntercomTheme.$stable;
                        textFieldColorsA = textFieldColorsC114.a(((-14837) & 1) != 0 ? textFieldColorsC114.f12344a : intercomTheme114.getColors(c1086gP, i511118).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC114.f12345b : intercomTheme114.getColors(c1086gP, i511118).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme114.getColors(c1086gP, i511118).m645getPrimaryText0d7_KjU()), textFieldColorsC114.f12347d, intercomTheme114.getColors(c1086gP, i511118).m637getInputAlt0d7_KjU(), intercomTheme114.getColors(c1086gP, i511118).m637getInputAlt0d7_KjU(), intercomTheme114.getColors(c1086gP, i511118).m637getInputAlt0d7_KjU(), intercomTheme114.getColors(c1086gP, i511118).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC114.f12352i : 0L, textFieldColorsC114.j, textFieldColorsC114.f12353k, intercomTheme114.getColors(c1086gP, i511118).m627getCollectorBorder0d7_KjU(), intercomTheme114.getColors(c1086gP, i511118).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC114.f12356n : 0L, textFieldColorsC114.f12357o, textFieldColorsC114.f12358p, textFieldColorsC114.f12359q, textFieldColorsC114.f12360r, textFieldColorsC114.f12361s, textFieldColorsC114.f12362t, textFieldColorsC114.f12363u, textFieldColorsC114.f12364v, textFieldColorsC114.f12365w, textFieldColorsC114.f12366x, textFieldColorsC114.f12367y, textFieldColorsC114.f12368z, textFieldColorsC114.f12327A, textFieldColorsC114.f12328B, textFieldColorsC114.f12329C, textFieldColorsC114.f12330D, textFieldColorsC114.f12331E, textFieldColorsC114.f12332F, textFieldColorsC114.f12333G, textFieldColorsC114.f12334H, textFieldColorsC114.f12335I, textFieldColorsC114.f12336J, textFieldColorsC114.f12337K, textFieldColorsC114.f12338L, textFieldColorsC114.f12339M, textFieldColorsC114.f12340N, textFieldColorsC114.f12341O, textFieldColorsC114.f12342P, textFieldColorsC114.f12343Q);
                        i34 &= -1879048193;
                    } else {
                        textFieldColorsA = textFieldColors;
                    }
                    if (i45 != 0) {
                        float f1116 = 8;
                        n10 = new N(f1116, f1116, f1116, f1116);
                    } else {
                        n10 = l10;
                    }
                    pVar9 = pVar7;
                    i49 = i34;
                    z18 = z21111115;
                } else {
                    if (i56 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    } else {
                        hVar2 = hVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    } else {
                        z14 = z10;
                    }
                    if (i19 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if ((i15 & 32) != 0) {
                        f11 = (F) c1086gP.x(TextKt.f12383a);
                        i55 &= -458753;
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar5 = null;
                    } else {
                        pVar5 = pVar;
                    }
                    if (i23 != 0) {
                        pVar6 = null;
                    } else {
                        pVar6 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar7 = null;
                    } else {
                        pVar7 = pVar3;
                    }
                    if (i27 == 0) {
                    }
                    if (i29 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i32 != 0) {
                        e11 = E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i35 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i37 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i39 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 32768) != 0) {
                        if (z17) {
                            i47 = 1;
                        } else {
                            i47 = BrazeLogger.SUPPRESS;
                        }
                        i34 &= -458753;
                    } else {
                        i47 = i10;
                    }
                    if (i41 != 0) {
                        i48 = 1;
                    } else {
                        i48 = i11;
                    }
                    boolean z21111116 = z16;
                    if (i43 != 0) {
                        c1086gP.L(1299418141);
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar4 = (androidx.compose.foundation.interaction.k) objF;
                        c1086gP.T(false);
                    } else {
                        kVar4 = kVar2;
                    }
                    if ((i15 & 262144) != 0) {
                        l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                        i34 &= -234881025;
                    } else {
                        l0Var2 = l0Var;
                    }
                    if ((i15 & 524288) != 0) {
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults115 = OutlinedTextFieldDefaults.f12253a;
                        TextFieldColors textFieldColorsC115 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                        IntercomTheme intercomTheme115 = IntercomTheme.INSTANCE;
                        int i511119 = IntercomTheme.$stable;
                        textFieldColorsA = textFieldColorsC115.a(((-14837) & 1) != 0 ? textFieldColorsC115.f12344a : intercomTheme115.getColors(c1086gP, i511119).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC115.f12345b : intercomTheme115.getColors(c1086gP, i511119).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme115.getColors(c1086gP, i511119).m645getPrimaryText0d7_KjU()), textFieldColorsC115.f12347d, intercomTheme115.getColors(c1086gP, i511119).m637getInputAlt0d7_KjU(), intercomTheme115.getColors(c1086gP, i511119).m637getInputAlt0d7_KjU(), intercomTheme115.getColors(c1086gP, i511119).m637getInputAlt0d7_KjU(), intercomTheme115.getColors(c1086gP, i511119).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC115.f12352i : 0L, textFieldColorsC115.j, textFieldColorsC115.f12353k, intercomTheme115.getColors(c1086gP, i511119).m627getCollectorBorder0d7_KjU(), intercomTheme115.getColors(c1086gP, i511119).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC115.f12356n : 0L, textFieldColorsC115.f12357o, textFieldColorsC115.f12358p, textFieldColorsC115.f12359q, textFieldColorsC115.f12360r, textFieldColorsC115.f12361s, textFieldColorsC115.f12362t, textFieldColorsC115.f12363u, textFieldColorsC115.f12364v, textFieldColorsC115.f12365w, textFieldColorsC115.f12366x, textFieldColorsC115.f12367y, textFieldColorsC115.f12368z, textFieldColorsC115.f12327A, textFieldColorsC115.f12328B, textFieldColorsC115.f12329C, textFieldColorsC115.f12330D, textFieldColorsC115.f12331E, textFieldColorsC115.f12332F, textFieldColorsC115.f12333G, textFieldColorsC115.f12334H, textFieldColorsC115.f12335I, textFieldColorsC115.f12336J, textFieldColorsC115.f12337K, textFieldColorsC115.f12338L, textFieldColorsC115.f12339M, textFieldColorsC115.f12340N, textFieldColorsC115.f12341O, textFieldColorsC115.f12342P, textFieldColorsC115.f12343Q);
                        i34 &= -1879048193;
                    } else {
                        textFieldColorsA = textFieldColors;
                    }
                    if (i45 != 0) {
                        float f1117 = 8;
                        n10 = new N(f1117, f1117, f1117, f1117);
                    } else {
                        n10 = l10;
                    }
                    pVar9 = pVar7;
                    i49 = i34;
                    z18 = z21111116;
                }
                c1086gP.U();
                jB = f11.b();
                if (jB == 16) {
                    if (z14) {
                        j11 = textFieldColorsA.f12345b;
                    } else {
                        j11 = textFieldColorsA.f12346c;
                    }
                    jB = j11;
                }
                F fD13 = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
                if (pVar5 != null) {
                    hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
                } else {
                    hVarJ = hVar2;
                }
                if (z14) {
                    j = textFieldColorsA.f12349f;
                } else {
                    j = textFieldColorsA.f12350g;
                }
                androidx.compose.ui.h hVarA13 = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
                if (z18) {
                    j10 = textFieldColorsA.j;
                } else {
                    j10 = textFieldColorsA.f12352i;
                }
                final boolean z21111117 = z14;
                final boolean z21111118 = z17;
                final E e1111 = e11;
                final androidx.compose.foundation.interaction.k kVar115 = kVar4;
                final boolean z21111119 = z18;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111112 = pVar5;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111113 = pVar6;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111114 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111115 = pVar8;
                final TextFieldColors textFieldColors15 = textFieldColorsA;
                final L l114 = n10;
                final l0 l0Var16 = l0Var2;
                int i5111110 = i49 << 12;
                BasicTextFieldKt.b(value, onValueChange, hVarA13, z14, z15, fD13, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                    @Override // Ia.q
                    public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar1111116, InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar1111116, interfaceC1084f2, num.intValue());
                        return p293xa.r.f47939a;
                    }

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
                    public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i5111111) {
                        int i60;
                        kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                        if ((i5111111 & 14) == 0) {
                            i60 = i5111111 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                        } else {
                            i60 = i5111111;
                        }
                        if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                            return;
                        }
                        OutlinedTextFieldDefaults outlinedTextFieldDefaults116 = OutlinedTextFieldDefaults.f12253a;
                        String str = value;
                        final boolean z211111110 = z21111117;
                        boolean z211111111 = z21111118;
                        E e1112 = e1111;
                        final androidx.compose.foundation.interaction.k kVar116 = kVar115;
                        final boolean z211111112 = z21111119;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar1111116 = pVar1111112;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar1111117 = pVar1111113;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar1111114;
                        Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar1111115;
                        final TextFieldColors textFieldColors16 = textFieldColors15;
                        L l115 = l114;
                        final l0 l0Var17 = l0Var16;
                        outlinedTextFieldDefaults116.b(str, innerTextField, z211111110, z211111111, e1112, kVar116, z211111112, pVar1111116, pVar1111117, pVar20, pVar21, null, null, null, textFieldColors16, l115, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                                invoke(interfaceC1084f3, num.intValue());
                                return p293xa.r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                                if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                    interfaceC1084f3.w();
                                } else {
                                    float f1118 = 1;
                                    OutlinedTextFieldDefaults.f12253a.a(z211111110, z211111112, kVar116, null, textFieldColors16, l0Var17, f1118, f1118, interfaceC1084f3, 114819072, 8);
                                }
                            }
                        }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                    }
                }, c1086gP), c1086gP, (i55 & 64638) | (i5111110 & 3670016) | (i5111110 & 29360128) | (i5111110 & 234881024) | (i5111110 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
                kVar5 = kVar3;
                l0Var3 = l0Var2;
                jVar3 = jVar2;
                pVar10 = pVar6;
                l11 = n10;
                z19 = z14;
                pVar11 = pVar8;
                f12 = f11;
                pVar12 = pVar5;
                z20 = z18;
                kVar6 = kVar4;
                i50 = i48;
                z21 = z15;
                z22 = z17;
                textFieldColors2 = textFieldColorsA;
                pVar13 = pVar9;
                e12 = e11;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar9 = hVar2;
                final boolean z2124 = z20;
                final E e1112 = e12;
                final androidx.compose.foundation.text.k kVar116 = kVar5;
                final androidx.compose.foundation.text.j jVar10 = jVar3;
                final boolean z225 = z22;
                final int i5111111 = i47;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.views.compose.i
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return IntercomOutlinedTextFieldKt.IntercomOutlinedTextField$lambda$3(value, onValueChange, hVar9, z19, z21, f12, pVar12, pVar10, pVar13, pVar11, z2124, e1112, kVar116, jVar10, z225, i5111111, i50, kVar6, l0Var3, textFieldColors2, l11, i12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i28 = 805306368;
        i55 |= i28;
        i29 = i15 & 1024;
        if (i29 != 0) {
            i30 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            if (c1086gP.c(z12)) {
                i31 = 4;
            } else {
                i31 = 2;
            }
            i30 = i13 | i31;
        } else {
            i30 = i13;
        }
        i32 = i15 & 2048;
        if (i32 != 0) {
            i30 |= 48;
        } else if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            if (c1086gP.K(e10)) {
                i33 = 32;
            } else {
                i33 = 16;
            }
            i30 |= i33;
        }
        i34 = i30;
        i35 = i15 & 4096;
        if (i35 != 0) {
            i34 |= 384;
        } else if ((i13 & 896) != 0) {
            if (c1086gP.K(kVar)) {
                i36 = 256;
            } else {
                i36 = 128;
            }
            i34 |= i36;
        }
        i37 = i15 & 8192;
        if (i37 != 0) {
            i34 |= 3072;
        } else if ((i13 & 7168) != 0) {
            if (c1086gP.K(jVar)) {
                i38 = 2048;
            } else {
                i38 = 1024;
            }
            i34 |= i38;
        }
        i39 = i15 & 16384;
        if (i39 != 0) {
            i34 |= 24576;
        } else if ((i13 & 57344) == 0) {
            if (c1086gP.c(z13)) {
                i40 = 16384;
            } else {
                i40 = 8192;
            }
            i34 |= i40;
        }
        if ((i13 & 458752) != 0) {
            if ((i15 & 32768) == 0) {
                i53 = 65536;
            } else {
                i53 = 65536;
            }
            i34 |= i53;
        }
        i41 = i15 & 65536;
        if (i41 != 0) {
            i34 |= 1572864;
        } else if ((i13 & 3670016) == 0) {
            if (c1086gP.h(i11)) {
                i42 = 1048576;
            } else {
                i42 = 524288;
            }
            i34 |= i42;
        }
        i43 = i15 & 131072;
        if (i43 != 0) {
            i34 |= 12582912;
        } else if ((i13 & 29360128) == 0) {
            if (c1086gP.K(kVar2)) {
                i44 = 8388608;
            } else {
                i44 = 4194304;
            }
            i34 |= i44;
        }
        if ((i13 & 234881024) != 0) {
            if ((i15 & 262144) == 0) {
                i52 = 33554432;
            } else {
                i52 = 33554432;
            }
            i34 |= i52;
        }
        if ((i13 & 1879048192) != 0) {
            if ((i15 & 524288) == 0) {
                i51 = 268435456;
            } else {
                i51 = 268435456;
            }
            i34 |= i51;
        }
        i45 = i15 & 1048576;
        if (i45 != 0) {
            i46 = i14 | 6;
        } else if ((i14 & 14) == 0) {
            i46 = i14 | (c1086gP.K(l10) ? 4 : 2);
        } else {
            i46 = i14;
        }
        if ((i55 & 1533916891) != 306783378) {
            c1086gP.r0();
            if ((i12 & 1) != 0) {
                if (i56 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z10;
                }
                if (i19 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if ((i15 & 32) != 0) {
                    f11 = (F) c1086gP.x(TextKt.f12383a);
                    i55 &= -458753;
                } else {
                    f11 = f10;
                }
                if (i21 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i23 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar2;
                }
                if (i25 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i27 == 0) {
                }
                if (i29 != 0) {
                    z16 = false;
                } else {
                    z16 = z12;
                }
                if (i32 != 0) {
                    e11 = E.a.f15486a;
                } else {
                    e11 = e10;
                }
                if (i35 != 0) {
                    kVar3 = androidx.compose.foundation.text.k.f11351g;
                } else {
                    kVar3 = kVar;
                }
                if (i37 != 0) {
                    jVar2 = androidx.compose.foundation.text.j.f11344g;
                } else {
                    jVar2 = jVar;
                }
                if (i39 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if ((i15 & 32768) != 0) {
                    if (z17) {
                        i47 = 1;
                    } else {
                        i47 = BrazeLogger.SUPPRESS;
                    }
                    i34 &= -458753;
                } else {
                    i47 = i10;
                }
                if (i41 != 0) {
                    i48 = 1;
                } else {
                    i48 = i11;
                }
                boolean z211111110 = z16;
                if (i43 != 0) {
                    c1086gP.L(1299418141);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar4 = (androidx.compose.foundation.interaction.k) objF;
                    c1086gP.T(false);
                } else {
                    kVar4 = kVar2;
                }
                if ((i15 & 262144) != 0) {
                    l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    i34 &= -234881025;
                } else {
                    l0Var2 = l0Var;
                }
                if ((i15 & 524288) != 0) {
                    OutlinedTextFieldDefaults outlinedTextFieldDefaults116 = OutlinedTextFieldDefaults.f12253a;
                    TextFieldColors textFieldColorsC116 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                    IntercomTheme intercomTheme116 = IntercomTheme.INSTANCE;
                    int i5111112 = IntercomTheme.$stable;
                    textFieldColorsA = textFieldColorsC116.a(((-14837) & 1) != 0 ? textFieldColorsC116.f12344a : intercomTheme116.getColors(c1086gP, i5111112).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC116.f12345b : intercomTheme116.getColors(c1086gP, i5111112).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme116.getColors(c1086gP, i5111112).m645getPrimaryText0d7_KjU()), textFieldColorsC116.f12347d, intercomTheme116.getColors(c1086gP, i5111112).m637getInputAlt0d7_KjU(), intercomTheme116.getColors(c1086gP, i5111112).m637getInputAlt0d7_KjU(), intercomTheme116.getColors(c1086gP, i5111112).m637getInputAlt0d7_KjU(), intercomTheme116.getColors(c1086gP, i5111112).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC116.f12352i : 0L, textFieldColorsC116.j, textFieldColorsC116.f12353k, intercomTheme116.getColors(c1086gP, i5111112).m627getCollectorBorder0d7_KjU(), intercomTheme116.getColors(c1086gP, i5111112).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC116.f12356n : 0L, textFieldColorsC116.f12357o, textFieldColorsC116.f12358p, textFieldColorsC116.f12359q, textFieldColorsC116.f12360r, textFieldColorsC116.f12361s, textFieldColorsC116.f12362t, textFieldColorsC116.f12363u, textFieldColorsC116.f12364v, textFieldColorsC116.f12365w, textFieldColorsC116.f12366x, textFieldColorsC116.f12367y, textFieldColorsC116.f12368z, textFieldColorsC116.f12327A, textFieldColorsC116.f12328B, textFieldColorsC116.f12329C, textFieldColorsC116.f12330D, textFieldColorsC116.f12331E, textFieldColorsC116.f12332F, textFieldColorsC116.f12333G, textFieldColorsC116.f12334H, textFieldColorsC116.f12335I, textFieldColorsC116.f12336J, textFieldColorsC116.f12337K, textFieldColorsC116.f12338L, textFieldColorsC116.f12339M, textFieldColorsC116.f12340N, textFieldColorsC116.f12341O, textFieldColorsC116.f12342P, textFieldColorsC116.f12343Q);
                    i34 &= -1879048193;
                } else {
                    textFieldColorsA = textFieldColors;
                }
                if (i45 != 0) {
                    float f1118 = 8;
                    n10 = new N(f1118, f1118, f1118, f1118);
                } else {
                    n10 = l10;
                }
                pVar9 = pVar7;
                i49 = i34;
                z18 = z211111110;
            } else {
                if (i56 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z10;
                }
                if (i19 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if ((i15 & 32) != 0) {
                    f11 = (F) c1086gP.x(TextKt.f12383a);
                    i55 &= -458753;
                } else {
                    f11 = f10;
                }
                if (i21 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i23 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar2;
                }
                if (i25 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i27 == 0) {
                }
                if (i29 != 0) {
                    z16 = false;
                } else {
                    z16 = z12;
                }
                if (i32 != 0) {
                    e11 = E.a.f15486a;
                } else {
                    e11 = e10;
                }
                if (i35 != 0) {
                    kVar3 = androidx.compose.foundation.text.k.f11351g;
                } else {
                    kVar3 = kVar;
                }
                if (i37 != 0) {
                    jVar2 = androidx.compose.foundation.text.j.f11344g;
                } else {
                    jVar2 = jVar;
                }
                if (i39 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if ((i15 & 32768) != 0) {
                    if (z17) {
                        i47 = 1;
                    } else {
                        i47 = BrazeLogger.SUPPRESS;
                    }
                    i34 &= -458753;
                } else {
                    i47 = i10;
                }
                if (i41 != 0) {
                    i48 = 1;
                } else {
                    i48 = i11;
                }
                boolean z211111111 = z16;
                if (i43 != 0) {
                    c1086gP.L(1299418141);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar4 = (androidx.compose.foundation.interaction.k) objF;
                    c1086gP.T(false);
                } else {
                    kVar4 = kVar2;
                }
                if ((i15 & 262144) != 0) {
                    l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    i34 &= -234881025;
                } else {
                    l0Var2 = l0Var;
                }
                if ((i15 & 524288) != 0) {
                    OutlinedTextFieldDefaults outlinedTextFieldDefaults117 = OutlinedTextFieldDefaults.f12253a;
                    TextFieldColors textFieldColorsC117 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                    IntercomTheme intercomTheme117 = IntercomTheme.INSTANCE;
                    int i5111113 = IntercomTheme.$stable;
                    textFieldColorsA = textFieldColorsC117.a(((-14837) & 1) != 0 ? textFieldColorsC117.f12344a : intercomTheme117.getColors(c1086gP, i5111113).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC117.f12345b : intercomTheme117.getColors(c1086gP, i5111113).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme117.getColors(c1086gP, i5111113).m645getPrimaryText0d7_KjU()), textFieldColorsC117.f12347d, intercomTheme117.getColors(c1086gP, i5111113).m637getInputAlt0d7_KjU(), intercomTheme117.getColors(c1086gP, i5111113).m637getInputAlt0d7_KjU(), intercomTheme117.getColors(c1086gP, i5111113).m637getInputAlt0d7_KjU(), intercomTheme117.getColors(c1086gP, i5111113).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC117.f12352i : 0L, textFieldColorsC117.j, textFieldColorsC117.f12353k, intercomTheme117.getColors(c1086gP, i5111113).m627getCollectorBorder0d7_KjU(), intercomTheme117.getColors(c1086gP, i5111113).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC117.f12356n : 0L, textFieldColorsC117.f12357o, textFieldColorsC117.f12358p, textFieldColorsC117.f12359q, textFieldColorsC117.f12360r, textFieldColorsC117.f12361s, textFieldColorsC117.f12362t, textFieldColorsC117.f12363u, textFieldColorsC117.f12364v, textFieldColorsC117.f12365w, textFieldColorsC117.f12366x, textFieldColorsC117.f12367y, textFieldColorsC117.f12368z, textFieldColorsC117.f12327A, textFieldColorsC117.f12328B, textFieldColorsC117.f12329C, textFieldColorsC117.f12330D, textFieldColorsC117.f12331E, textFieldColorsC117.f12332F, textFieldColorsC117.f12333G, textFieldColorsC117.f12334H, textFieldColorsC117.f12335I, textFieldColorsC117.f12336J, textFieldColorsC117.f12337K, textFieldColorsC117.f12338L, textFieldColorsC117.f12339M, textFieldColorsC117.f12340N, textFieldColorsC117.f12341O, textFieldColorsC117.f12342P, textFieldColorsC117.f12343Q);
                    i34 &= -1879048193;
                } else {
                    textFieldColorsA = textFieldColors;
                }
                if (i45 != 0) {
                    float f1119 = 8;
                    n10 = new N(f1119, f1119, f1119, f1119);
                } else {
                    n10 = l10;
                }
                pVar9 = pVar7;
                i49 = i34;
                z18 = z211111111;
            }
            c1086gP.U();
            jB = f11.b();
            if (jB == 16) {
                if (z14) {
                    j11 = textFieldColorsA.f12345b;
                } else {
                    j11 = textFieldColorsA.f12346c;
                }
                jB = j11;
            }
            F fD14 = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
            if (pVar5 != null) {
                hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
            } else {
                hVarJ = hVar2;
            }
            if (z14) {
                j = textFieldColorsA.f12349f;
            } else {
                j = textFieldColorsA.f12350g;
            }
            androidx.compose.ui.h hVarA14 = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
            if (z18) {
                j10 = textFieldColorsA.j;
            } else {
                j10 = textFieldColorsA.f12352i;
            }
            final boolean z211111112 = z14;
            final boolean z211111113 = z17;
            final E e1113 = e11;
            final androidx.compose.foundation.interaction.k kVar117 = kVar4;
            final boolean z211111114 = z18;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111116 = pVar5;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111117 = pVar6;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111118 = pVar9;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar1111119 = pVar8;
            final TextFieldColors textFieldColors16 = textFieldColorsA;
            final L l115 = n10;
            final l0 l0Var17 = l0Var2;
            int i5111114 = i49 << 12;
            BasicTextFieldKt.b(value, onValueChange, hVarA14, z14, z15, fD14, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar11111110, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar11111110, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

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
                public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i5111115) {
                    int i60;
                    kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                    if ((i5111115 & 14) == 0) {
                        i60 = i5111115 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                    } else {
                        i60 = i5111115;
                    }
                    if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    OutlinedTextFieldDefaults outlinedTextFieldDefaults118 = OutlinedTextFieldDefaults.f12253a;
                    String str = value;
                    final boolean z211111115 = z211111112;
                    boolean z211111116 = z211111113;
                    E e1114 = e1113;
                    final androidx.compose.foundation.interaction.k kVar118 = kVar117;
                    final boolean z211111117 = z211111114;
                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11111110 = pVar1111116;
                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11111111 = pVar1111117;
                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar1111118;
                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar1111119;
                    final TextFieldColors textFieldColors17 = textFieldColors16;
                    L l116 = l115;
                    final l0 l0Var18 = l0Var17;
                    outlinedTextFieldDefaults118.b(str, innerTextField, z211111115, z211111116, e1114, kVar118, z211111117, pVar11111110, pVar11111111, pVar20, pVar21, null, null, null, textFieldColors17, l116, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                            invoke(interfaceC1084f3, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                            if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                float f11110 = 1;
                                OutlinedTextFieldDefaults.f12253a.a(z211111115, z211111117, kVar118, null, textFieldColors17, l0Var18, f11110, f11110, interfaceC1084f3, 114819072, 8);
                            }
                        }
                    }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                }
            }, c1086gP), c1086gP, (i55 & 64638) | (i5111114 & 3670016) | (i5111114 & 29360128) | (i5111114 & 234881024) | (i5111114 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
            kVar5 = kVar3;
            l0Var3 = l0Var2;
            jVar3 = jVar2;
            pVar10 = pVar6;
            l11 = n10;
            z19 = z14;
            pVar11 = pVar8;
            f12 = f11;
            pVar12 = pVar5;
            z20 = z18;
            kVar6 = kVar4;
            i50 = i48;
            z21 = z15;
            z22 = z17;
            textFieldColors2 = textFieldColorsA;
            pVar13 = pVar9;
            e12 = e11;
        } else {
            c1086gP.r0();
            if ((i12 & 1) != 0) {
                if (i56 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z10;
                }
                if (i19 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if ((i15 & 32) != 0) {
                    f11 = (F) c1086gP.x(TextKt.f12383a);
                    i55 &= -458753;
                } else {
                    f11 = f10;
                }
                if (i21 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i23 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar2;
                }
                if (i25 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i27 == 0) {
                }
                if (i29 != 0) {
                    z16 = false;
                } else {
                    z16 = z12;
                }
                if (i32 != 0) {
                    e11 = E.a.f15486a;
                } else {
                    e11 = e10;
                }
                if (i35 != 0) {
                    kVar3 = androidx.compose.foundation.text.k.f11351g;
                } else {
                    kVar3 = kVar;
                }
                if (i37 != 0) {
                    jVar2 = androidx.compose.foundation.text.j.f11344g;
                } else {
                    jVar2 = jVar;
                }
                if (i39 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if ((i15 & 32768) != 0) {
                    if (z17) {
                        i47 = 1;
                    } else {
                        i47 = BrazeLogger.SUPPRESS;
                    }
                    i34 &= -458753;
                } else {
                    i47 = i10;
                }
                if (i41 != 0) {
                    i48 = 1;
                } else {
                    i48 = i11;
                }
                boolean z211111115 = z16;
                if (i43 != 0) {
                    c1086gP.L(1299418141);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar4 = (androidx.compose.foundation.interaction.k) objF;
                    c1086gP.T(false);
                } else {
                    kVar4 = kVar2;
                }
                if ((i15 & 262144) != 0) {
                    l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    i34 &= -234881025;
                } else {
                    l0Var2 = l0Var;
                }
                if ((i15 & 524288) != 0) {
                    OutlinedTextFieldDefaults outlinedTextFieldDefaults118 = OutlinedTextFieldDefaults.f12253a;
                    TextFieldColors textFieldColorsC118 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                    IntercomTheme intercomTheme118 = IntercomTheme.INSTANCE;
                    int i5111115 = IntercomTheme.$stable;
                    textFieldColorsA = textFieldColorsC118.a(((-14837) & 1) != 0 ? textFieldColorsC118.f12344a : intercomTheme118.getColors(c1086gP, i5111115).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC118.f12345b : intercomTheme118.getColors(c1086gP, i5111115).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme118.getColors(c1086gP, i5111115).m645getPrimaryText0d7_KjU()), textFieldColorsC118.f12347d, intercomTheme118.getColors(c1086gP, i5111115).m637getInputAlt0d7_KjU(), intercomTheme118.getColors(c1086gP, i5111115).m637getInputAlt0d7_KjU(), intercomTheme118.getColors(c1086gP, i5111115).m637getInputAlt0d7_KjU(), intercomTheme118.getColors(c1086gP, i5111115).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC118.f12352i : 0L, textFieldColorsC118.j, textFieldColorsC118.f12353k, intercomTheme118.getColors(c1086gP, i5111115).m627getCollectorBorder0d7_KjU(), intercomTheme118.getColors(c1086gP, i5111115).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC118.f12356n : 0L, textFieldColorsC118.f12357o, textFieldColorsC118.f12358p, textFieldColorsC118.f12359q, textFieldColorsC118.f12360r, textFieldColorsC118.f12361s, textFieldColorsC118.f12362t, textFieldColorsC118.f12363u, textFieldColorsC118.f12364v, textFieldColorsC118.f12365w, textFieldColorsC118.f12366x, textFieldColorsC118.f12367y, textFieldColorsC118.f12368z, textFieldColorsC118.f12327A, textFieldColorsC118.f12328B, textFieldColorsC118.f12329C, textFieldColorsC118.f12330D, textFieldColorsC118.f12331E, textFieldColorsC118.f12332F, textFieldColorsC118.f12333G, textFieldColorsC118.f12334H, textFieldColorsC118.f12335I, textFieldColorsC118.f12336J, textFieldColorsC118.f12337K, textFieldColorsC118.f12338L, textFieldColorsC118.f12339M, textFieldColorsC118.f12340N, textFieldColorsC118.f12341O, textFieldColorsC118.f12342P, textFieldColorsC118.f12343Q);
                    i34 &= -1879048193;
                } else {
                    textFieldColorsA = textFieldColors;
                }
                if (i45 != 0) {
                    float f11110 = 8;
                    n10 = new N(f11110, f11110, f11110, f11110);
                } else {
                    n10 = l10;
                }
                pVar9 = pVar7;
                i49 = i34;
                z18 = z211111115;
            } else {
                if (i56 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                } else {
                    hVar2 = hVar;
                }
                if (i17 != 0) {
                    z14 = true;
                } else {
                    z14 = z10;
                }
                if (i19 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if ((i15 & 32) != 0) {
                    f11 = (F) c1086gP.x(TextKt.f12383a);
                    i55 &= -458753;
                } else {
                    f11 = f10;
                }
                if (i21 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar;
                }
                if (i23 != 0) {
                    pVar6 = null;
                } else {
                    pVar6 = pVar2;
                }
                if (i25 != 0) {
                    pVar7 = null;
                } else {
                    pVar7 = pVar3;
                }
                if (i27 == 0) {
                }
                if (i29 != 0) {
                    z16 = false;
                } else {
                    z16 = z12;
                }
                if (i32 != 0) {
                    e11 = E.a.f15486a;
                } else {
                    e11 = e10;
                }
                if (i35 != 0) {
                    kVar3 = androidx.compose.foundation.text.k.f11351g;
                } else {
                    kVar3 = kVar;
                }
                if (i37 != 0) {
                    jVar2 = androidx.compose.foundation.text.j.f11344g;
                } else {
                    jVar2 = jVar;
                }
                if (i39 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if ((i15 & 32768) != 0) {
                    if (z17) {
                        i47 = 1;
                    } else {
                        i47 = BrazeLogger.SUPPRESS;
                    }
                    i34 &= -458753;
                } else {
                    i47 = i10;
                }
                if (i41 != 0) {
                    i48 = 1;
                } else {
                    i48 = i11;
                }
                boolean z211111116 = z16;
                if (i43 != 0) {
                    c1086gP.L(1299418141);
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar4 = (androidx.compose.foundation.interaction.k) objF;
                    c1086gP.T(false);
                } else {
                    kVar4 = kVar2;
                }
                if ((i15 & 262144) != 0) {
                    l0Var2 = IntercomTheme.INSTANCE.getShapes(c1086gP, IntercomTheme.$stable).f12430b;
                    i34 &= -234881025;
                } else {
                    l0Var2 = l0Var;
                }
                if ((i15 & 524288) != 0) {
                    OutlinedTextFieldDefaults outlinedTextFieldDefaults119 = OutlinedTextFieldDefaults.f12253a;
                    TextFieldColors textFieldColorsC119 = OutlinedTextFieldDefaults.c(c1086gP, 6);
                    IntercomTheme intercomTheme119 = IntercomTheme.INSTANCE;
                    int i5111116 = IntercomTheme.$stable;
                    textFieldColorsA = textFieldColorsC119.a(((-14837) & 1) != 0 ? textFieldColorsC119.f12344a : intercomTheme119.getColors(c1086gP, i5111116).m645getPrimaryText0d7_KjU(), ((-14837) & 2) != 0 ? textFieldColorsC119.f12345b : intercomTheme119.getColors(c1086gP, i5111116).m645getPrimaryText0d7_KjU(), H.b(0.38f, intercomTheme119.getColors(c1086gP, i5111116).m645getPrimaryText0d7_KjU()), textFieldColorsC119.f12347d, intercomTheme119.getColors(c1086gP, i5111116).m637getInputAlt0d7_KjU(), intercomTheme119.getColors(c1086gP, i5111116).m637getInputAlt0d7_KjU(), intercomTheme119.getColors(c1086gP, i5111116).m637getInputAlt0d7_KjU(), intercomTheme119.getColors(c1086gP, i5111116).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC119.f12352i : 0L, textFieldColorsC119.j, textFieldColorsC119.f12353k, intercomTheme119.getColors(c1086gP, i5111116).m627getCollectorBorder0d7_KjU(), intercomTheme119.getColors(c1086gP, i5111116).m627getCollectorBorder0d7_KjU(), ((-14837) & 8192) != 0 ? textFieldColorsC119.f12356n : 0L, textFieldColorsC119.f12357o, textFieldColorsC119.f12358p, textFieldColorsC119.f12359q, textFieldColorsC119.f12360r, textFieldColorsC119.f12361s, textFieldColorsC119.f12362t, textFieldColorsC119.f12363u, textFieldColorsC119.f12364v, textFieldColorsC119.f12365w, textFieldColorsC119.f12366x, textFieldColorsC119.f12367y, textFieldColorsC119.f12368z, textFieldColorsC119.f12327A, textFieldColorsC119.f12328B, textFieldColorsC119.f12329C, textFieldColorsC119.f12330D, textFieldColorsC119.f12331E, textFieldColorsC119.f12332F, textFieldColorsC119.f12333G, textFieldColorsC119.f12334H, textFieldColorsC119.f12335I, textFieldColorsC119.f12336J, textFieldColorsC119.f12337K, textFieldColorsC119.f12338L, textFieldColorsC119.f12339M, textFieldColorsC119.f12340N, textFieldColorsC119.f12341O, textFieldColorsC119.f12342P, textFieldColorsC119.f12343Q);
                    i34 &= -1879048193;
                } else {
                    textFieldColorsA = textFieldColors;
                }
                if (i45 != 0) {
                    float f11111 = 8;
                    n10 = new N(f11111, f11111, f11111, f11111);
                } else {
                    n10 = l10;
                }
                pVar9 = pVar7;
                i49 = i34;
                z18 = z211111116;
            }
            c1086gP.U();
            jB = f11.b();
            if (jB == 16) {
                if (z14) {
                    j11 = textFieldColorsA.f12345b;
                } else {
                    j11 = textFieldColorsA.f12346c;
                }
                jB = j11;
            }
            F fD15 = f11.d(new F(jB, 0L, null, 0L, 0, 0L, 16777214));
            if (pVar5 != null) {
                hVarJ = PaddingKt.j(androidx.compose.ui.semantics.p.b(hVar2, true, new D(7)), 0.0f, OutlinedTextFieldTopPadding, 0.0f, 0.0f, 13);
            } else {
                hVarJ = hVar2;
            }
            if (z14) {
                j = textFieldColorsA.f12349f;
            } else {
                j = textFieldColorsA.f12350g;
            }
            androidx.compose.ui.h hVarA15 = W.a(TextFieldDefaults.f12371c, 40, C0932d.b(hVarJ, j, l0Var2));
            if (z18) {
                j10 = textFieldColorsA.j;
            } else {
                j10 = textFieldColorsA.f12352i;
            }
            final boolean z211111117 = z14;
            final boolean z211111118 = z17;
            final E e1114 = e11;
            final androidx.compose.foundation.interaction.k kVar118 = kVar4;
            final boolean z211111119 = z18;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111110 = pVar5;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111111 = pVar6;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111112 = pVar9;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11111113 = pVar8;
            final TextFieldColors textFieldColors17 = textFieldColorsA;
            final L l116 = n10;
            final l0 l0Var18 = l0Var2;
            int i5111117 = i49 << 12;
            BasicTextFieldKt.b(value, onValueChange, hVarA15, z14, z15, fD15, kVar3, jVar2, z17, i47, i48, e11, null, kVar4, new m0(j10), androidx.compose.runtime.internal.a.b(491720992, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3
                @Override // Ia.q
                public /* bridge */ /* synthetic */ p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar11111114, InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke((Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r>) pVar11111114, interfaceC1084f2, num.intValue());
                    return p293xa.r.f47939a;
                }

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
                public final void invoke(Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> innerTextField, InterfaceC1084f interfaceC1084f2, int i5111118) {
                    int i60;
                    kotlin.jvm.internal.i.e(innerTextField, "innerTextField");
                    if ((i5111118 & 14) == 0) {
                        i60 = i5111118 | (interfaceC1084f2.k(innerTextField) ? 4 : 2);
                    } else {
                        i60 = i5111118;
                    }
                    if ((i60 & 91) == 18 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                        return;
                    }
                    OutlinedTextFieldDefaults outlinedTextFieldDefaults1110 = OutlinedTextFieldDefaults.f12253a;
                    String str = value;
                    final boolean z2111111110 = z211111117;
                    boolean z2111111111 = z211111118;
                    E e1115 = e1114;
                    final androidx.compose.foundation.interaction.k kVar119 = kVar118;
                    final boolean z2111111112 = z211111119;
                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11111114 = pVar11111110;
                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar11111115 = pVar11111111;
                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar20 = pVar11111112;
                    Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar21 = pVar11111113;
                    final TextFieldColors textFieldColors18 = textFieldColors17;
                    L l117 = l116;
                    final l0 l0Var19 = l0Var18;
                    outlinedTextFieldDefaults1110.b(str, innerTextField, z2111111110, z2111111111, e1115, kVar119, z2111111112, pVar11111114, pVar11111115, pVar20, pVar21, null, null, null, textFieldColors18, l117, androidx.compose.runtime.internal.a.b(888607277, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.views.compose.IntercomOutlinedTextFieldKt.IntercomOutlinedTextField.3.1
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f3, Integer num) {
                            invoke(interfaceC1084f3, num.intValue());
                            return p293xa.r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f3, int i61) {
                            if ((i61 & 11) == 2 && interfaceC1084f3.s()) {
                                interfaceC1084f3.w();
                            } else {
                                float f11112 = 1;
                                OutlinedTextFieldDefaults.f12253a.a(z2111111110, z2111111112, kVar119, null, textFieldColors18, l0Var19, f11112, f11112, interfaceC1084f3, 114819072, 8);
                            }
                        }
                    }, interfaceC1084f2), interfaceC1084f2, (i60 << 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14155776, 14336);
                }
            }, c1086gP), c1086gP, (i55 & 64638) | (i5111117 & 3670016) | (i5111117 & 29360128) | (i5111117 & 234881024) | (i5111117 & 1879048192), ((i49 >> 18) & 14) | 196608 | (i49 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 >> 12) & 7168), 4096);
            kVar5 = kVar3;
            l0Var3 = l0Var2;
            jVar3 = jVar2;
            pVar10 = pVar6;
            l11 = n10;
            z19 = z14;
            pVar11 = pVar8;
            f12 = f11;
            pVar12 = pVar5;
            z20 = z18;
            kVar6 = kVar4;
            i50 = i48;
            z21 = z15;
            z22 = z17;
            textFieldColors2 = textFieldColorsA;
            pVar13 = pVar9;
            e12 = e11;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar10 = hVar2;
            final boolean z2125 = z20;
            final E e1115 = e12;
            final androidx.compose.foundation.text.k kVar119 = kVar5;
            final androidx.compose.foundation.text.j jVar11 = jVar3;
            final boolean z226 = z22;
            final int i5111118 = i47;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.views.compose.i
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return IntercomOutlinedTextFieldKt.IntercomOutlinedTextField$lambda$3(value, onValueChange, hVar10, z19, z21, f12, pVar12, pVar10, pVar13, pVar11, z2125, e1115, kVar119, jVar11, z226, i5111118, i50, kVar6, l0Var3, textFieldColors2, l11, i12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IntercomOutlinedTextField$lambda$2(w semantics) {
        kotlin.jvm.internal.i.e(semantics, "$this$semantics");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r IntercomOutlinedTextField$lambda$3(String value, Ia.l onValueChange, androidx.compose.ui.h hVar, boolean z10, boolean z11, F f10, Ia.p pVar, Ia.p pVar2, Ia.p pVar3, Ia.p pVar4, boolean z12, E e10, androidx.compose.foundation.text.k kVar, androidx.compose.foundation.text.j jVar, boolean z13, int i10, int i11, androidx.compose.foundation.interaction.k kVar2, l0 l0Var, TextFieldColors textFieldColors, L l10, int i12, int i13, int i14, int i15, InterfaceC1084f interfaceC1084f, int i16) {
        kotlin.jvm.internal.i.e(value, "$value");
        kotlin.jvm.internal.i.e(onValueChange, "$onValueChange");
        IntercomOutlinedTextField(value, onValueChange, hVar, z10, z11, f10, pVar, pVar2, pVar3, pVar4, z12, e10, kVar, jVar, z13, i10, i11, kVar2, l0Var, textFieldColors, l10, interfaceC1084f, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
        return p293xa.r.f47939a;
    }
}
