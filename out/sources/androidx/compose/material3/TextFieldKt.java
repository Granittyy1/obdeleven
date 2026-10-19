package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.C1171q;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.C1293h;
import com.braze.support.BrazeLogger;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: TextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12375a = 8;

    /* JADX WARN: Code duplicated, block: B:101:0x013e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0144  */
    /* JADX WARN: Code duplicated, block: B:105:0x014a  */
    /* JADX WARN: Code duplicated, block: B:106:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0158  */
    /* JADX WARN: Code duplicated, block: B:112:0x015f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0165  */
    /* JADX WARN: Code duplicated, block: B:116:0x016b  */
    /* JADX WARN: Code duplicated, block: B:117:0x016e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0173  */
    /* JADX WARN: Code duplicated, block: B:122:0x017a  */
    /* JADX WARN: Code duplicated, block: B:124:0x017f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0185  */
    /* JADX WARN: Code duplicated, block: B:128:0x018b  */
    /* JADX WARN: Code duplicated, block: B:129:0x018e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0197  */
    /* JADX WARN: Code duplicated, block: B:135:0x019c  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:159:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:164:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:168:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:169:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:171:0x0201  */
    /* JADX WARN: Code duplicated, block: B:173:0x0207  */
    /* JADX WARN: Code duplicated, block: B:174:0x020a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0212  */
    /* JADX WARN: Code duplicated, block: B:179:0x0217  */
    /* JADX WARN: Code duplicated, block: B:181:0x021d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0223  */
    /* JADX WARN: Code duplicated, block: B:184:0x0226  */
    /* JADX WARN: Code duplicated, block: B:188:0x022e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0233  */
    /* JADX WARN: Code duplicated, block: B:191:0x0239  */
    /* JADX WARN: Code duplicated, block: B:193:0x023f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0242  */
    /* JADX WARN: Code duplicated, block: B:198:0x024a  */
    /* JADX WARN: Code duplicated, block: B:200:0x0252  */
    /* JADX WARN: Code duplicated, block: B:203:0x025b  */
    /* JADX WARN: Code duplicated, block: B:205:0x0260  */
    /* JADX WARN: Code duplicated, block: B:208:0x0266  */
    /* JADX WARN: Code duplicated, block: B:209:0x026b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0271  */
    /* JADX WARN: Code duplicated, block: B:213:0x0277  */
    /* JADX WARN: Code duplicated, block: B:214:0x027a  */
    /* JADX WARN: Code duplicated, block: B:218:0x0284  */
    /* JADX WARN: Code duplicated, block: B:219:0x0289  */
    /* JADX WARN: Code duplicated, block: B:221:0x028f  */
    /* JADX WARN: Code duplicated, block: B:223:0x0295  */
    /* JADX WARN: Code duplicated, block: B:225:0x029a  */
    /* JADX WARN: Code duplicated, block: B:228:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:230:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:234:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:237:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:239:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:242:0x02c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:246:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:249:0x02de  */
    /* JADX WARN: Code duplicated, block: B:257:0x0323  */
    /* JADX WARN: Code duplicated, block: B:259:0x032b  */
    /* JADX WARN: Code duplicated, block: B:263:0x0361 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:264:0x0363  */
    /* JADX WARN: Code duplicated, block: B:265:0x0366  */
    /* JADX WARN: Code duplicated, block: B:267:0x036a  */
    /* JADX WARN: Code duplicated, block: B:268:0x036c  */
    /* JADX WARN: Code duplicated, block: B:270:0x0370  */
    /* JADX WARN: Code duplicated, block: B:271:0x0373  */
    /* JADX WARN: Code duplicated, block: B:274:0x0379  */
    /* JADX WARN: Code duplicated, block: B:275:0x0382  */
    /* JADX WARN: Code duplicated, block: B:278:0x0388  */
    /* JADX WARN: Code duplicated, block: B:279:0x038b  */
    /* JADX WARN: Code duplicated, block: B:281:0x038f  */
    /* JADX WARN: Code duplicated, block: B:282:0x0392  */
    /* JADX WARN: Code duplicated, block: B:284:0x0396  */
    /* JADX WARN: Code duplicated, block: B:285:0x0399  */
    /* JADX WARN: Code duplicated, block: B:287:0x039d  */
    /* JADX WARN: Code duplicated, block: B:288:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:290:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:291:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:293:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:294:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:296:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:297:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:299:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:300:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:302:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:303:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:305:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:306:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:308:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:309:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:311:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:313:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:316:0x03e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:317:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:318:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:319:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:321:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:322:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:325:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:328:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:329:0x0406  */
    /* JADX WARN: Code duplicated, block: B:332:0x040c  */
    /* JADX WARN: Code duplicated, block: B:333:0x041d  */
    /* JADX WARN: Code duplicated, block: B:336:0x0430  */
    /* JADX WARN: Code duplicated, block: B:338:0x0438  */
    /* JADX WARN: Code duplicated, block: B:341:0x0444  */
    /* JADX WARN: Code duplicated, block: B:344:0x045a  */
    /* JADX WARN: Code duplicated, block: B:346:0x0460  */
    /* JADX WARN: Code duplicated, block: B:348:0x0471  */
    /* JADX WARN: Code duplicated, block: B:350:0x047a  */
    /* JADX WARN: Code duplicated, block: B:352:0x0480  */
    /* JADX WARN: Code duplicated, block: B:353:0x0483 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:354:0x0485  */
    /* JADX WARN: Code duplicated, block: B:355:0x0488  */
    /* JADX WARN: Code duplicated, block: B:359:0x051d  */
    /* JADX WARN: Code duplicated, block: B:361:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0102  */
    /* JADX WARN: Code duplicated, block: B:82:0x0108  */
    /* JADX WARN: Code duplicated, block: B:84:0x010e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0111  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:0x0126  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:95:0x012f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0139  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final Ia.l<? super String, p293xa.r> lVar, androidx.compose.ui.h hVar, boolean z10, boolean z11, androidx.compose.ui.text.F f10, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7, boolean z12, androidx.compose.ui.text.input.E e10, androidx.compose.foundation.text.k kVar, androidx.compose.foundation.text.j jVar, boolean z13, int i10, int i11, androidx.compose.foundation.interaction.k kVar2, androidx.compose.ui.graphics.l0 l0Var, TextFieldColors textFieldColors, InterfaceC1084f interfaceC1084f, final int i12, final int i13, final int i14, final int i15) {
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
        int i47;
        int i48;
        int i49;
        int i50;
        androidx.compose.ui.h hVar2;
        boolean z14;
        boolean z15;
        androidx.compose.ui.text.F f11;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar10;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar11;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar12;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar13;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar14;
        boolean z16;
        androidx.compose.ui.text.input.E e11;
        androidx.compose.foundation.text.k kVar3;
        androidx.compose.foundation.text.j jVar2;
        boolean z17;
        int i51;
        final int i52;
        androidx.compose.foundation.interaction.k kVar4;
        androidx.compose.ui.graphics.l0 l0VarA;
        TextFieldColors textFieldColorsC;
        androidx.compose.ui.graphics.l0 l0Var2;
        int i53;
        androidx.compose.foundation.interaction.k kVar5;
        long jB;
        boolean zBooleanValue;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar15;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar16;
        long j;
        final androidx.compose.ui.text.F f12;
        final androidx.compose.ui.h hVar3;
        final boolean z18;
        final androidx.compose.ui.text.input.E e12;
        final boolean z19;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar17;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar18;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar19;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar20;
        final int i54;
        final boolean z20;
        final androidx.compose.foundation.text.k kVar6;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21;
        final androidx.compose.foundation.interaction.k kVar7;
        final androidx.compose.foundation.text.j jVar3;
        final androidx.compose.ui.graphics.l0 l0Var3;
        final boolean z21;
        final TextFieldColors textFieldColors2;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar22;
        Object objF;
        C1105p0 c1105p0V;
        int i55;
        int i56;
        int i57 = 16;
        C1086g c1086gP = interfaceC1084f.p(-676242365);
        if ((i15 & 1) != 0) {
            i16 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i16 = i12 | (c1086gP.K(str) ? 4 : 2);
        } else {
            i16 = i12;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i12 & 48) == 0) {
            i16 |= c1086gP.k(lVar) ? 32 : 16;
        }
        int i58 = i16;
        int i59 = i15 & 4;
        if (i59 == 0) {
            if ((i12 & 384) == 0) {
                i58 |= c1086gP.K(hVar) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    if (c1086gP.c(z10)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i58 |= i18;
                }
                i19 = i15 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        if (c1086gP.c(z11)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i58 |= i20;
                    }
                    if ((i12 & 196608) != 0) {
                        if ((i15 & 32) == 0 || !c1086gP.K(f10)) {
                            i56 = 65536;
                        } else {
                            i56 = 131072;
                        }
                        i58 |= i56;
                    }
                    i21 = i15 & 64;
                    if (i21 != 0) {
                        i58 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c1086gP.k(pVar)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i58 |= i22;
                    }
                    i23 = i15 & 128;
                    if (i23 != 0) {
                        i58 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c1086gP.k(pVar2)) {
                            i24 = 8388608;
                        } else {
                            i24 = 4194304;
                        }
                        i58 |= i24;
                    }
                    i25 = i15 & 256;
                    if (i25 != 0) {
                        i58 |= 100663296;
                    } else if ((i12 & 100663296) == 0) {
                        if (c1086gP.k(pVar3)) {
                            i26 = 67108864;
                        } else {
                            i26 = 33554432;
                        }
                        i58 |= i26;
                    }
                    i27 = i15 & 512;
                    if (i27 != 0) {
                        i58 |= 805306368;
                    } else if ((i12 & 805306368) == 0) {
                        if (c1086gP.k(pVar4)) {
                            i28 = 536870912;
                        } else {
                            i28 = 268435456;
                        }
                        i58 |= i28;
                    }
                    i29 = i15 & 1024;
                    if (i29 != 0) {
                        i30 = i13 | 6;
                    } else if ((i13 & 6) == 0) {
                        if (c1086gP.k(pVar5)) {
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
                    } else if ((i13 & 48) == 0) {
                        if (c1086gP.k(pVar6)) {
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
                    } else if ((i13 & 384) != 0) {
                        if (c1086gP.k(pVar7)) {
                            i36 = 256;
                        } else {
                            i36 = 128;
                        }
                        i34 |= i36;
                    }
                    i37 = i15 & 8192;
                    if (i37 != 0) {
                        i34 |= 3072;
                    } else if ((i13 & 3072) != 0) {
                        if (c1086gP.c(z12)) {
                            i38 = 2048;
                        } else {
                            i38 = 1024;
                        }
                        i34 |= i38;
                    }
                    i39 = i15 & 16384;
                    if (i39 != 0) {
                        if ((i13 & 24576) == 0) {
                            if (c1086gP.K(e10)) {
                                i40 = 16384;
                            } else {
                                i40 = 8192;
                            }
                            i34 |= i40;
                        }
                        i41 = i15 & 32768;
                        if (i41 != 0) {
                            i34 |= 196608;
                        } else if ((i13 & 196608) == 0) {
                            if (c1086gP.K(kVar)) {
                                i42 = 131072;
                            } else {
                                i42 = 65536;
                            }
                            i34 |= i42;
                        }
                        i43 = i15 & 65536;
                        if (i43 != 0) {
                            i34 |= 1572864;
                        } else if ((i13 & 1572864) == 0) {
                            if (c1086gP.K(jVar)) {
                                i44 = 1048576;
                            } else {
                                i44 = 524288;
                            }
                            i34 |= i44;
                        }
                        i45 = i15 & 131072;
                        if (i45 != 0) {
                            i34 |= 12582912;
                        } else if ((i13 & 12582912) == 0) {
                            if (c1086gP.c(z13)) {
                                i46 = 8388608;
                            } else {
                                i46 = 4194304;
                            }
                            i34 |= i46;
                        }
                        if ((i13 & 100663296) != 0) {
                            if ((i15 & 262144) == 0 || !c1086gP.h(i10)) {
                                i55 = 33554432;
                            } else {
                                i55 = 67108864;
                            }
                            i34 |= i55;
                        }
                        i47 = i15 & 524288;
                        if (i47 != 0) {
                            i34 |= 805306368;
                        } else if ((i13 & 805306368) == 0) {
                            if (c1086gP.h(i11)) {
                                i48 = 536870912;
                            } else {
                                i48 = 268435456;
                            }
                            i34 |= i48;
                        }
                        i49 = i15 & 1048576;
                        if (i49 != 0) {
                            i50 = i14 | 6;
                        } else if ((i14 & 6) == 0) {
                            i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
                        } else {
                            i50 = i14;
                        }
                        if ((i14 & 48) != 0) {
                            if ((i15 & 2097152) == 0 && c1086gP.K(l0Var)) {
                                i57 = 32;
                            }
                            i50 |= i57;
                        }
                        if ((i14 & 384) != 0) {
                            i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
                        }
                        int i60 = i50;
                        if ((i58 & 306783379) != 306783378 && (306783379 & i34) == 306783378 && (i60 & 147) == 146 && c1086gP.s()) {
                            c1086gP.w();
                            hVar3 = hVar;
                            z19 = z10;
                            z20 = z11;
                            f12 = f10;
                            pVar17 = pVar;
                            pVar9 = pVar2;
                            pVar21 = pVar3;
                            pVar19 = pVar4;
                            pVar20 = pVar5;
                            pVar22 = pVar6;
                            pVar18 = pVar7;
                            z18 = z12;
                            e12 = e10;
                            kVar6 = kVar;
                            jVar3 = jVar;
                            z21 = z13;
                            i54 = i10;
                            i52 = i11;
                            kVar7 = kVar2;
                            l0Var3 = l0Var;
                            textFieldColors2 = textFieldColors;
                        } else {
                            c1086gP.r0();
                            if ((i12 & 1) != 0 || c1086gP.a0()) {
                                if (i59 != 0) {
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
                                    f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                                } else {
                                    f11 = f10;
                                }
                                if (i21 != 0) {
                                    pVar8 = null;
                                } else {
                                    pVar8 = pVar;
                                }
                                if (i23 != 0) {
                                    pVar9 = null;
                                } else {
                                    pVar9 = pVar2;
                                }
                                if (i25 != 0) {
                                    pVar10 = null;
                                } else {
                                    pVar10 = pVar3;
                                }
                                if (i27 != 0) {
                                    pVar11 = null;
                                } else {
                                    pVar11 = pVar4;
                                }
                                if (i29 != 0) {
                                    pVar12 = null;
                                } else {
                                    pVar12 = pVar5;
                                }
                                if (i32 != 0) {
                                    pVar13 = null;
                                } else {
                                    pVar13 = pVar6;
                                }
                                if (i35 != 0) {
                                    pVar14 = null;
                                } else {
                                    pVar14 = pVar7;
                                }
                                if (i37 != 0) {
                                    z16 = false;
                                } else {
                                    z16 = z12;
                                }
                                if (i39 != 0) {
                                    e11 = androidx.compose.ui.text.input.E.a.f15486a;
                                } else {
                                    e11 = e10;
                                }
                                if (i41 != 0) {
                                    kVar3 = androidx.compose.foundation.text.k.f11351g;
                                } else {
                                    kVar3 = kVar;
                                }
                                if (i43 != 0) {
                                    jVar2 = androidx.compose.foundation.text.j.f11344g;
                                } else {
                                    jVar2 = jVar;
                                }
                                if (i45 != 0) {
                                    z17 = false;
                                } else {
                                    z17 = z13;
                                }
                                if ((i15 & 262144) == 0) {
                                    i51 = i10;
                                } else if (z17) {
                                    i51 = 1;
                                } else {
                                    i51 = BrazeLogger.SUPPRESS;
                                }
                                if (i47 != 0) {
                                    i52 = 1;
                                } else {
                                    i52 = i11;
                                }
                                kVar4 = i49 == 0 ? kVar2 : null;
                                if ((i15 & 2097152) != 0) {
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.f12369a;
                                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                                } else {
                                    l0VarA = l0Var;
                                }
                                if ((i15 & 4194304) != 0) {
                                    TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f12369a;
                                    textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                    l0Var2 = l0VarA;
                                    i53 = i51;
                                    pVar10 = pVar10;
                                } else {
                                    textFieldColorsC = textFieldColors;
                                    l0Var2 = l0VarA;
                                    i53 = i51;
                                }
                            } else {
                                c1086gP.w();
                                hVar2 = hVar;
                                z14 = z10;
                                z15 = z11;
                                f11 = f10;
                                pVar8 = pVar;
                                pVar9 = pVar2;
                                pVar10 = pVar3;
                                pVar11 = pVar4;
                                pVar12 = pVar5;
                                pVar13 = pVar6;
                                pVar14 = pVar7;
                                z16 = z12;
                                e11 = e10;
                                kVar3 = kVar;
                                jVar2 = jVar;
                                z17 = z13;
                                i53 = i10;
                                i52 = i11;
                                kVar4 = kVar2;
                                l0Var2 = l0Var;
                                textFieldColorsC = textFieldColors;
                            }
                            c1086gP.U();
                            c1086gP.L(-508515290);
                            if (kVar4 == null) {
                                objF = c1086gP.f();
                                if (objF == InterfaceC1084f.a.f12980a) {
                                    objF = new androidx.compose.foundation.interaction.l();
                                    c1086gP.E(objF);
                                }
                                kVar5 = (androidx.compose.foundation.interaction.k) objF;
                            } else {
                                kVar5 = kVar4;
                            }
                            c1086gP.T(false);
                            c1086gP.L(-508509180);
                            jB = f11.b();
                            if (jB != 16) {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                            } else {
                                zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                                if (z14) {
                                    pVar15 = pVar13;
                                    pVar16 = pVar14;
                                    if (z16) {
                                        j = textFieldColorsC.f12347d;
                                    } else if (zBooleanValue) {
                                        j = textFieldColorsC.f12344a;
                                    } else {
                                        j = textFieldColorsC.f12345b;
                                    }
                                } else {
                                    pVar15 = pVar13;
                                    pVar16 = pVar14;
                                    j = textFieldColorsC.f12346c;
                                }
                                jB = j;
                            }
                            c1086gP.T(false);
                            final androidx.compose.ui.text.F fD = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                            final androidx.compose.ui.h hVar4 = hVar2;
                            final boolean z22 = z16;
                            final TextFieldColors textFieldColors3 = textFieldColorsC;
                            final boolean z23 = z14;
                            final boolean z24 = z15;
                            final androidx.compose.foundation.text.k kVar8 = kVar3;
                            final androidx.compose.foundation.text.j jVar4 = jVar2;
                            final boolean z25 = z17;
                            final int i61 = i53;
                            final int i62 = i52;
                            final androidx.compose.ui.text.input.E e13 = e11;
                            final androidx.compose.foundation.interaction.k kVar9 = kVar5;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar23 = pVar8;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar24 = pVar9;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar25 = pVar10;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar26 = pVar11;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar27 = pVar12;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar28 = pVar15;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar29 = pVar16;
                            final androidx.compose.ui.graphics.l0 l0Var4 = l0Var2;
                            CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                        androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar4, z22, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                        TextFieldColors textFieldColors4 = textFieldColors3;
                                        androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z22 ? textFieldColors4.j : textFieldColors4.f12352i);
                                        final String str2 = str;
                                        Ia.l<String, p293xa.r> lVar2 = lVar;
                                        final boolean z26 = z23;
                                        boolean z27 = z24;
                                        androidx.compose.ui.text.F f13 = fD;
                                        androidx.compose.foundation.text.k kVar10 = kVar8;
                                        androidx.compose.foundation.text.j jVar5 = jVar4;
                                        final boolean z28 = z25;
                                        int i63 = i61;
                                        int i64 = i62;
                                        final androidx.compose.ui.text.input.E e14 = e13;
                                        final androidx.compose.foundation.interaction.k kVar11 = kVar9;
                                        final boolean z29 = z22;
                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar30 = pVar23;
                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar31 = pVar24;
                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar32 = pVar25;
                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar33 = pVar26;
                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar34 = pVar27;
                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar35 = pVar28;
                                        final Ia.p<InterfaceC1084f, Integer, p293xa.r> pVar36 = pVar29;
                                        final androidx.compose.ui.graphics.l0 l0Var5 = l0Var4;
                                        final TextFieldColors textFieldColors5 = textFieldColors3;
                                        BasicTextFieldKt.b(str2, lVar2, hVarA, z26, z27, f13, kVar10, jVar5, z28, i63, i64, e14, null, kVar11, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                            public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                                Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                                int iIntValue = num2.intValue();
                                                if ((iIntValue & 6) == 0) {
                                                    iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                                }
                                                int i65 = iIntValue;
                                                if ((i65 & 19) == 18 && interfaceC1084f5.s()) {
                                                    interfaceC1084f5.w();
                                                } else {
                                                    TextFieldDefaults.f12369a.b(str2, pVar38, z26, z28, e14, kVar11, z29, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var5, textFieldColors5, null, null, interfaceC1084f5, (i65 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                                }
                                                return p293xa.r.f47939a;
                                            }
                                        }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, c1086gP), c1086gP, 56);
                            f12 = f11;
                            hVar3 = hVar2;
                            z18 = z16;
                            e12 = e11;
                            z19 = z14;
                            pVar17 = pVar8;
                            pVar18 = pVar16;
                            pVar19 = pVar11;
                            pVar20 = pVar12;
                            i54 = i53;
                            z20 = z15;
                            kVar6 = kVar3;
                            pVar21 = pVar10;
                            kVar7 = kVar4;
                            jVar3 = jVar2;
                            l0Var3 = l0Var2;
                            z21 = z17;
                            textFieldColors2 = textFieldColorsC;
                            pVar22 = pVar15;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // Ia.p
                                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    num.intValue();
                                    TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                                    return p293xa.r.f47939a;
                                }
                            };
                        }
                    }
                    i34 |= 24576;
                    i41 = i15 & 32768;
                    if (i41 != 0) {
                        i34 |= 196608;
                    } else if ((i13 & 196608) == 0) {
                        if (c1086gP.K(kVar)) {
                            i42 = 131072;
                        } else {
                            i42 = 65536;
                        }
                        i34 |= i42;
                    }
                    i43 = i15 & 65536;
                    if (i43 != 0) {
                        i34 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c1086gP.K(jVar)) {
                            i44 = 1048576;
                        } else {
                            i44 = 524288;
                        }
                        i34 |= i44;
                    }
                    i45 = i15 & 131072;
                    if (i45 != 0) {
                        i34 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c1086gP.c(z13)) {
                            i46 = 8388608;
                        } else {
                            i46 = 4194304;
                        }
                        i34 |= i46;
                    }
                    if ((i13 & 100663296) != 0) {
                        if ((i15 & 262144) == 0) {
                            i55 = 33554432;
                        } else {
                            i55 = 33554432;
                        }
                        i34 |= i55;
                    }
                    i47 = i15 & 524288;
                    if (i47 != 0) {
                        i34 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c1086gP.h(i11)) {
                            i48 = 536870912;
                        } else {
                            i48 = 268435456;
                        }
                        i34 |= i48;
                    }
                    i49 = i15 & 1048576;
                    if (i49 != 0) {
                        i50 = i14 | 6;
                    } else if ((i14 & 6) == 0) {
                        i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
                    } else {
                        i50 = i14;
                    }
                    if ((i14 & 48) != 0) {
                        if ((i15 & 2097152) == 0) {
                            i57 = 32;
                        }
                        i50 |= i57;
                    }
                    if ((i14 & 384) != 0) {
                        i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
                    }
                    int i63 = i50;
                    if ((i58 & 306783379) != 306783378) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults4 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        } else {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults5 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults6 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        }
                        c1086gP.U();
                        c1086gP.L(-508515290);
                        if (kVar4 == null) {
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar5 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            kVar5 = kVar4;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-508509180);
                        jB = f11.b();
                        if (jB != 16) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                        } else {
                            zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                            if (z14) {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                j = textFieldColorsC.f12346c;
                            } else {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                if (z16) {
                                    j = textFieldColorsC.f12347d;
                                } else if (zBooleanValue) {
                                    j = textFieldColorsC.f12344a;
                                } else {
                                    j = textFieldColorsC.f12345b;
                                }
                            }
                            jB = j;
                        }
                        c1086gP.T(false);
                        final androidx.compose.ui.text.F fD2 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                        final androidx.compose.ui.h hVar5 = hVar2;
                        final boolean z26 = z16;
                        final TextFieldColors textFieldColors4 = textFieldColorsC;
                        final boolean z27 = z14;
                        final boolean z28 = z15;
                        final androidx.compose.foundation.text.k kVar10 = kVar3;
                        final androidx.compose.foundation.text.j jVar5 = jVar2;
                        final boolean z29 = z17;
                        final int i64 = i53;
                        final int i65 = i52;
                        final androidx.compose.ui.text.input.E e14 = e11;
                        final androidx.compose.foundation.interaction.k kVar11 = kVar5;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar210 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar212 = pVar10;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar213 = pVar11;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar214 = pVar12;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar215 = pVar15;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar216 = pVar16;
                        final androidx.compose.ui.graphics.l0 l0Var5 = l0Var2;
                        CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                    androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar5, z26, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                    TextFieldColors textFieldColors5 = textFieldColors4;
                                    androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z26 ? textFieldColors5.j : textFieldColors5.f12352i);
                                    final String str2 = str;
                                    Ia.l<String, p293xa.r> lVar2 = lVar;
                                    final boolean z210 = z27;
                                    boolean z211 = z28;
                                    androidx.compose.ui.text.F f13 = fD2;
                                    androidx.compose.foundation.text.k kVar12 = kVar10;
                                    androidx.compose.foundation.text.j jVar6 = jVar5;
                                    final boolean z212 = z29;
                                    int i66 = i64;
                                    int i67 = i65;
                                    final androidx.compose.ui.text.input.E e15 = e14;
                                    final androidx.compose.foundation.interaction.k kVar13 = kVar11;
                                    final boolean z213 = z26;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar210;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar211;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar212;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar213;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar214;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar215;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar216;
                                    final androidx.compose.ui.graphics.l0 l0Var6 = l0Var5;
                                    final TextFieldColors textFieldColors6 = textFieldColors4;
                                    BasicTextFieldKt.b(str2, lVar2, hVarA, z210, z211, f13, kVar12, jVar6, z212, i66, i67, e15, null, kVar13, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            int iIntValue = num2.intValue();
                                            if ((iIntValue & 6) == 0) {
                                                iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                            }
                                            int i68 = iIntValue;
                                            if ((i68 & 19) == 18 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                TextFieldDefaults.f12369a.b(str2, pVar38, z210, z212, e15, kVar13, z213, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var6, textFieldColors6, null, null, interfaceC1084f5, (i68 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        f12 = f11;
                        hVar3 = hVar2;
                        z18 = z16;
                        e12 = e11;
                        z19 = z14;
                        pVar17 = pVar8;
                        pVar18 = pVar16;
                        pVar19 = pVar11;
                        pVar20 = pVar12;
                        i54 = i53;
                        z20 = z15;
                        kVar6 = kVar3;
                        pVar21 = pVar10;
                        kVar7 = kVar4;
                        jVar3 = jVar2;
                        l0Var3 = l0Var2;
                        z21 = z17;
                        textFieldColors2 = textFieldColorsC;
                        pVar22 = pVar15;
                    } else {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults7 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults8 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        } else {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults9 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults10 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        }
                        c1086gP.U();
                        c1086gP.L(-508515290);
                        if (kVar4 == null) {
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar5 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            kVar5 = kVar4;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-508509180);
                        jB = f11.b();
                        if (jB != 16) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                        } else {
                            zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                            if (z14) {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                j = textFieldColorsC.f12346c;
                            } else {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                if (z16) {
                                    j = textFieldColorsC.f12347d;
                                } else if (zBooleanValue) {
                                    j = textFieldColorsC.f12344a;
                                } else {
                                    j = textFieldColorsC.f12345b;
                                }
                            }
                            jB = j;
                        }
                        c1086gP.T(false);
                        final androidx.compose.ui.text.F fD3 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                        final androidx.compose.ui.h hVar6 = hVar2;
                        final boolean z210 = z16;
                        final TextFieldColors textFieldColors5 = textFieldColorsC;
                        final boolean z211 = z14;
                        final boolean z212 = z15;
                        final androidx.compose.foundation.text.k kVar12 = kVar3;
                        final androidx.compose.foundation.text.j jVar6 = jVar2;
                        final boolean z213 = z17;
                        final int i66 = i53;
                        final int i67 = i52;
                        final androidx.compose.ui.text.input.E e15 = e11;
                        final androidx.compose.foundation.interaction.k kVar13 = kVar5;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar217 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar218 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar219 = pVar10;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2110 = pVar11;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111 = pVar12;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2112 = pVar15;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2113 = pVar16;
                        final androidx.compose.ui.graphics.l0 l0Var6 = l0Var2;
                        CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                    androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar6, z210, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                    TextFieldColors textFieldColors6 = textFieldColors5;
                                    androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z210 ? textFieldColors6.j : textFieldColors6.f12352i);
                                    final String str2 = str;
                                    Ia.l<String, p293xa.r> lVar2 = lVar;
                                    final boolean z214 = z211;
                                    boolean z215 = z212;
                                    androidx.compose.ui.text.F f13 = fD3;
                                    androidx.compose.foundation.text.k kVar14 = kVar12;
                                    androidx.compose.foundation.text.j jVar7 = jVar6;
                                    final boolean z216 = z213;
                                    int i68 = i66;
                                    int i69 = i67;
                                    final androidx.compose.ui.text.input.E e16 = e15;
                                    final androidx.compose.foundation.interaction.k kVar15 = kVar13;
                                    final boolean z217 = z210;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar217;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar218;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar219;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar2110;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar2111;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar2112;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar2113;
                                    final androidx.compose.ui.graphics.l0 l0Var7 = l0Var6;
                                    final TextFieldColors textFieldColors7 = textFieldColors5;
                                    BasicTextFieldKt.b(str2, lVar2, hVarA, z214, z215, f13, kVar14, jVar7, z216, i68, i69, e16, null, kVar15, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            int iIntValue = num2.intValue();
                                            if ((iIntValue & 6) == 0) {
                                                iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                            }
                                            int i610 = iIntValue;
                                            if ((i610 & 19) == 18 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                TextFieldDefaults.f12369a.b(str2, pVar38, z214, z216, e16, kVar15, z217, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var7, textFieldColors7, null, null, interfaceC1084f5, (i610 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        f12 = f11;
                        hVar3 = hVar2;
                        z18 = z16;
                        e12 = e11;
                        z19 = z14;
                        pVar17 = pVar8;
                        pVar18 = pVar16;
                        pVar19 = pVar11;
                        pVar20 = pVar12;
                        i54 = i53;
                        z20 = z15;
                        kVar6 = kVar3;
                        pVar21 = pVar10;
                        kVar7 = kVar4;
                        jVar3 = jVar2;
                        l0Var3 = l0Var2;
                        z21 = z17;
                        textFieldColors2 = textFieldColorsC;
                        pVar22 = pVar15;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i58 |= 24576;
                if ((i12 & 196608) != 0) {
                    if ((i15 & 32) == 0) {
                        i56 = 65536;
                    } else {
                        i56 = 65536;
                    }
                    i58 |= i56;
                }
                i21 = i15 & 64;
                if (i21 != 0) {
                    i58 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i58 |= i22;
                }
                i23 = i15 & 128;
                if (i23 != 0) {
                    i58 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i58 |= i24;
                }
                i25 = i15 & 256;
                if (i25 != 0) {
                    i58 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i26 = 67108864;
                    } else {
                        i26 = 33554432;
                    }
                    i58 |= i26;
                }
                i27 = i15 & 512;
                if (i27 != 0) {
                    i58 |= 805306368;
                } else if ((i12 & 805306368) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i58 |= i28;
                }
                i29 = i15 & 1024;
                if (i29 != 0) {
                    i30 = i13 | 6;
                } else if ((i13 & 6) == 0) {
                    if (c1086gP.k(pVar5)) {
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
                } else if ((i13 & 48) == 0) {
                    if (c1086gP.k(pVar6)) {
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
                } else if ((i13 & 384) != 0) {
                    if (c1086gP.k(pVar7)) {
                        i36 = 256;
                    } else {
                        i36 = 128;
                    }
                    i34 |= i36;
                }
                i37 = i15 & 8192;
                if (i37 != 0) {
                    i34 |= 3072;
                } else if ((i13 & 3072) != 0) {
                    if (c1086gP.c(z12)) {
                        i38 = 2048;
                    } else {
                        i38 = 1024;
                    }
                    i34 |= i38;
                }
                i39 = i15 & 16384;
                if (i39 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c1086gP.K(e10)) {
                            i40 = 16384;
                        } else {
                            i40 = 8192;
                        }
                        i34 |= i40;
                    }
                    i41 = i15 & 32768;
                    if (i41 != 0) {
                        i34 |= 196608;
                    } else if ((i13 & 196608) == 0) {
                        if (c1086gP.K(kVar)) {
                            i42 = 131072;
                        } else {
                            i42 = 65536;
                        }
                        i34 |= i42;
                    }
                    i43 = i15 & 65536;
                    if (i43 != 0) {
                        i34 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c1086gP.K(jVar)) {
                            i44 = 1048576;
                        } else {
                            i44 = 524288;
                        }
                        i34 |= i44;
                    }
                    i45 = i15 & 131072;
                    if (i45 != 0) {
                        i34 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c1086gP.c(z13)) {
                            i46 = 8388608;
                        } else {
                            i46 = 4194304;
                        }
                        i34 |= i46;
                    }
                    if ((i13 & 100663296) != 0) {
                        if ((i15 & 262144) == 0) {
                            i55 = 33554432;
                        } else {
                            i55 = 33554432;
                        }
                        i34 |= i55;
                    }
                    i47 = i15 & 524288;
                    if (i47 != 0) {
                        i34 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c1086gP.h(i11)) {
                            i48 = 536870912;
                        } else {
                            i48 = 268435456;
                        }
                        i34 |= i48;
                    }
                    i49 = i15 & 1048576;
                    if (i49 != 0) {
                        i50 = i14 | 6;
                    } else if ((i14 & 6) == 0) {
                        i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
                    } else {
                        i50 = i14;
                    }
                    if ((i14 & 48) != 0) {
                        if ((i15 & 2097152) == 0) {
                            i57 = 32;
                        }
                        i50 |= i57;
                    }
                    if ((i14 & 384) != 0) {
                        i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
                    }
                    int i68 = i50;
                    if ((i58 & 306783379) != 306783378) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults11 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults12 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        } else {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults13 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults14 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        }
                        c1086gP.U();
                        c1086gP.L(-508515290);
                        if (kVar4 == null) {
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar5 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            kVar5 = kVar4;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-508509180);
                        jB = f11.b();
                        if (jB != 16) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                        } else {
                            zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                            if (z14) {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                j = textFieldColorsC.f12346c;
                            } else {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                if (z16) {
                                    j = textFieldColorsC.f12347d;
                                } else if (zBooleanValue) {
                                    j = textFieldColorsC.f12344a;
                                } else {
                                    j = textFieldColorsC.f12345b;
                                }
                            }
                            jB = j;
                        }
                        c1086gP.T(false);
                        final androidx.compose.ui.text.F fD4 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                        final androidx.compose.ui.h hVar7 = hVar2;
                        final boolean z214 = z16;
                        final TextFieldColors textFieldColors6 = textFieldColorsC;
                        final boolean z215 = z14;
                        final boolean z216 = z15;
                        final androidx.compose.foundation.text.k kVar14 = kVar3;
                        final androidx.compose.foundation.text.j jVar7 = jVar2;
                        final boolean z217 = z17;
                        final int i69 = i53;
                        final int i610 = i52;
                        final androidx.compose.ui.text.input.E e16 = e11;
                        final androidx.compose.foundation.interaction.k kVar15 = kVar5;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2114 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2115 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2116 = pVar10;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2117 = pVar11;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2118 = pVar12;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2119 = pVar15;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21110 = pVar16;
                        final androidx.compose.ui.graphics.l0 l0Var7 = l0Var2;
                        CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                    androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar7, z214, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                    TextFieldColors textFieldColors7 = textFieldColors6;
                                    androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z214 ? textFieldColors7.j : textFieldColors7.f12352i);
                                    final String str2 = str;
                                    Ia.l<String, p293xa.r> lVar2 = lVar;
                                    final boolean z218 = z215;
                                    boolean z219 = z216;
                                    androidx.compose.ui.text.F f13 = fD4;
                                    androidx.compose.foundation.text.k kVar16 = kVar14;
                                    androidx.compose.foundation.text.j jVar8 = jVar7;
                                    final boolean z2110 = z217;
                                    int i611 = i69;
                                    int i612 = i610;
                                    final androidx.compose.ui.text.input.E e17 = e16;
                                    final androidx.compose.foundation.interaction.k kVar17 = kVar15;
                                    final boolean z2111 = z214;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar2114;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar2115;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar2116;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar2117;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar2118;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar2119;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar21110;
                                    final androidx.compose.ui.graphics.l0 l0Var8 = l0Var7;
                                    final TextFieldColors textFieldColors8 = textFieldColors6;
                                    BasicTextFieldKt.b(str2, lVar2, hVarA, z218, z219, f13, kVar16, jVar8, z2110, i611, i612, e17, null, kVar17, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            int iIntValue = num2.intValue();
                                            if ((iIntValue & 6) == 0) {
                                                iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                            }
                                            int i613 = iIntValue;
                                            if ((i613 & 19) == 18 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                TextFieldDefaults.f12369a.b(str2, pVar38, z218, z2110, e17, kVar17, z2111, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var8, textFieldColors8, null, null, interfaceC1084f5, (i613 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        f12 = f11;
                        hVar3 = hVar2;
                        z18 = z16;
                        e12 = e11;
                        z19 = z14;
                        pVar17 = pVar8;
                        pVar18 = pVar16;
                        pVar19 = pVar11;
                        pVar20 = pVar12;
                        i54 = i53;
                        z20 = z15;
                        kVar6 = kVar3;
                        pVar21 = pVar10;
                        kVar7 = kVar4;
                        jVar3 = jVar2;
                        l0Var3 = l0Var2;
                        z21 = z17;
                        textFieldColors2 = textFieldColorsC;
                        pVar22 = pVar15;
                    } else {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults15 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults16 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        } else {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults17 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults18 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        }
                        c1086gP.U();
                        c1086gP.L(-508515290);
                        if (kVar4 == null) {
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar5 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            kVar5 = kVar4;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-508509180);
                        jB = f11.b();
                        if (jB != 16) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                        } else {
                            zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                            if (z14) {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                j = textFieldColorsC.f12346c;
                            } else {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                if (z16) {
                                    j = textFieldColorsC.f12347d;
                                } else if (zBooleanValue) {
                                    j = textFieldColorsC.f12344a;
                                } else {
                                    j = textFieldColorsC.f12345b;
                                }
                            }
                            jB = j;
                        }
                        c1086gP.T(false);
                        final androidx.compose.ui.text.F fD5 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                        final androidx.compose.ui.h hVar8 = hVar2;
                        final boolean z218 = z16;
                        final TextFieldColors textFieldColors7 = textFieldColorsC;
                        final boolean z219 = z14;
                        final boolean z2110 = z15;
                        final androidx.compose.foundation.text.k kVar16 = kVar3;
                        final androidx.compose.foundation.text.j jVar8 = jVar2;
                        final boolean z2111 = z17;
                        final int i611 = i53;
                        final int i612 = i52;
                        final androidx.compose.ui.text.input.E e17 = e11;
                        final androidx.compose.foundation.interaction.k kVar17 = kVar5;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21112 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21113 = pVar10;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21114 = pVar11;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21115 = pVar12;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21116 = pVar15;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21117 = pVar16;
                        final androidx.compose.ui.graphics.l0 l0Var8 = l0Var2;
                        CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                    androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar8, z218, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                    TextFieldColors textFieldColors8 = textFieldColors7;
                                    androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z218 ? textFieldColors8.j : textFieldColors8.f12352i);
                                    final String str2 = str;
                                    Ia.l<String, p293xa.r> lVar2 = lVar;
                                    final boolean z2112 = z219;
                                    boolean z2113 = z2110;
                                    androidx.compose.ui.text.F f13 = fD5;
                                    androidx.compose.foundation.text.k kVar18 = kVar16;
                                    androidx.compose.foundation.text.j jVar9 = jVar8;
                                    final boolean z2114 = z2111;
                                    int i613 = i611;
                                    int i614 = i612;
                                    final androidx.compose.ui.text.input.E e18 = e17;
                                    final androidx.compose.foundation.interaction.k kVar19 = kVar17;
                                    final boolean z2115 = z218;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar21111;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar21112;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar21113;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar21114;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar21115;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar21116;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar21117;
                                    final androidx.compose.ui.graphics.l0 l0Var9 = l0Var8;
                                    final TextFieldColors textFieldColors9 = textFieldColors7;
                                    BasicTextFieldKt.b(str2, lVar2, hVarA, z2112, z2113, f13, kVar18, jVar9, z2114, i613, i614, e18, null, kVar19, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            int iIntValue = num2.intValue();
                                            if ((iIntValue & 6) == 0) {
                                                iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                            }
                                            int i615 = iIntValue;
                                            if ((i615 & 19) == 18 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                TextFieldDefaults.f12369a.b(str2, pVar38, z2112, z2114, e18, kVar19, z2115, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var9, textFieldColors9, null, null, interfaceC1084f5, (i615 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        f12 = f11;
                        hVar3 = hVar2;
                        z18 = z16;
                        e12 = e11;
                        z19 = z14;
                        pVar17 = pVar8;
                        pVar18 = pVar16;
                        pVar19 = pVar11;
                        pVar20 = pVar12;
                        i54 = i53;
                        z20 = z15;
                        kVar6 = kVar3;
                        pVar21 = pVar10;
                        kVar7 = kVar4;
                        jVar3 = jVar2;
                        l0Var3 = l0Var2;
                        z21 = z17;
                        textFieldColors2 = textFieldColorsC;
                        pVar22 = pVar15;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i34 |= 24576;
                i41 = i15 & 32768;
                if (i41 != 0) {
                    i34 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (c1086gP.K(kVar)) {
                        i42 = 131072;
                    } else {
                        i42 = 65536;
                    }
                    i34 |= i42;
                }
                i43 = i15 & 65536;
                if (i43 != 0) {
                    i34 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c1086gP.K(jVar)) {
                        i44 = 1048576;
                    } else {
                        i44 = 524288;
                    }
                    i34 |= i44;
                }
                i45 = i15 & 131072;
                if (i45 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c1086gP.c(z13)) {
                        i46 = 8388608;
                    } else {
                        i46 = 4194304;
                    }
                    i34 |= i46;
                }
                if ((i13 & 100663296) != 0) {
                    if ((i15 & 262144) == 0) {
                        i55 = 33554432;
                    } else {
                        i55 = 33554432;
                    }
                    i34 |= i55;
                }
                i47 = i15 & 524288;
                if (i47 != 0) {
                    i34 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c1086gP.h(i11)) {
                        i48 = 536870912;
                    } else {
                        i48 = 268435456;
                    }
                    i34 |= i48;
                }
                i49 = i15 & 1048576;
                if (i49 != 0) {
                    i50 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
                } else {
                    i50 = i14;
                }
                if ((i14 & 48) != 0) {
                    if ((i15 & 2097152) == 0) {
                        i57 = 32;
                    }
                    i50 |= i57;
                }
                if ((i14 & 384) != 0) {
                    i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
                }
                int i613 = i50;
                if ((i58 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults19 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults110 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    } else {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults111 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults112 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    }
                    c1086gP.U();
                    c1086gP.L(-508515290);
                    if (kVar4 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar5 = kVar4;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-508509180);
                    jB = f11.b();
                    if (jB != 16) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                    } else {
                        zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                        if (z14) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            j = textFieldColorsC.f12346c;
                        } else {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            if (z16) {
                                j = textFieldColorsC.f12347d;
                            } else if (zBooleanValue) {
                                j = textFieldColorsC.f12344a;
                            } else {
                                j = textFieldColorsC.f12345b;
                            }
                        }
                        jB = j;
                    }
                    c1086gP.T(false);
                    final androidx.compose.ui.text.F fD6 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final androidx.compose.ui.h hVar9 = hVar2;
                    final boolean z2112 = z16;
                    final TextFieldColors textFieldColors8 = textFieldColorsC;
                    final boolean z2113 = z14;
                    final boolean z2114 = z15;
                    final androidx.compose.foundation.text.k kVar18 = kVar3;
                    final androidx.compose.foundation.text.j jVar9 = jVar2;
                    final boolean z2115 = z17;
                    final int i614 = i53;
                    final int i615 = i52;
                    final androidx.compose.ui.text.input.E e18 = e11;
                    final androidx.compose.foundation.interaction.k kVar19 = kVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21118 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21119 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211110 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211112 = pVar12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211113 = pVar15;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211114 = pVar16;
                    final androidx.compose.ui.graphics.l0 l0Var9 = l0Var2;
                    CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar9, z2112, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                TextFieldColors textFieldColors9 = textFieldColors8;
                                androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z2112 ? textFieldColors9.j : textFieldColors9.f12352i);
                                final String str2 = str;
                                Ia.l<String, p293xa.r> lVar2 = lVar;
                                final boolean z2116 = z2113;
                                boolean z2117 = z2114;
                                androidx.compose.ui.text.F f13 = fD6;
                                androidx.compose.foundation.text.k kVar110 = kVar18;
                                androidx.compose.foundation.text.j jVar10 = jVar9;
                                final boolean z2118 = z2115;
                                int i616 = i614;
                                int i617 = i615;
                                final androidx.compose.ui.text.input.E e19 = e18;
                                final androidx.compose.foundation.interaction.k kVar111 = kVar19;
                                final boolean z2119 = z2112;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar21118;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar21119;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar211110;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar211111;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar211112;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar211113;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar211114;
                                final androidx.compose.ui.graphics.l0 l0Var10 = l0Var9;
                                final TextFieldColors textFieldColors10 = textFieldColors8;
                                BasicTextFieldKt.b(str2, lVar2, hVarA, z2116, z2117, f13, kVar110, jVar10, z2118, i616, i617, e19, null, kVar111, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue = num2.intValue();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                        }
                                        int i618 = iIntValue;
                                        if ((i618 & 19) == 18 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextFieldDefaults.f12369a.b(str2, pVar38, z2116, z2118, e19, kVar111, z2119, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var10, textFieldColors10, null, null, interfaceC1084f5, (i618 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    f12 = f11;
                    hVar3 = hVar2;
                    z18 = z16;
                    e12 = e11;
                    z19 = z14;
                    pVar17 = pVar8;
                    pVar18 = pVar16;
                    pVar19 = pVar11;
                    pVar20 = pVar12;
                    i54 = i53;
                    z20 = z15;
                    kVar6 = kVar3;
                    pVar21 = pVar10;
                    kVar7 = kVar4;
                    jVar3 = jVar2;
                    l0Var3 = l0Var2;
                    z21 = z17;
                    textFieldColors2 = textFieldColorsC;
                    pVar22 = pVar15;
                } else {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults113 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults114 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    } else {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults115 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults116 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    }
                    c1086gP.U();
                    c1086gP.L(-508515290);
                    if (kVar4 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar5 = kVar4;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-508509180);
                    jB = f11.b();
                    if (jB != 16) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                    } else {
                        zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                        if (z14) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            j = textFieldColorsC.f12346c;
                        } else {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            if (z16) {
                                j = textFieldColorsC.f12347d;
                            } else if (zBooleanValue) {
                                j = textFieldColorsC.f12344a;
                            } else {
                                j = textFieldColorsC.f12345b;
                            }
                        }
                        jB = j;
                    }
                    c1086gP.T(false);
                    final androidx.compose.ui.text.F fD7 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final androidx.compose.ui.h hVar10 = hVar2;
                    final boolean z2116 = z16;
                    final TextFieldColors textFieldColors9 = textFieldColorsC;
                    final boolean z2117 = z14;
                    final boolean z2118 = z15;
                    final androidx.compose.foundation.text.k kVar110 = kVar3;
                    final androidx.compose.foundation.text.j jVar10 = jVar2;
                    final boolean z2119 = z17;
                    final int i616 = i53;
                    final int i617 = i52;
                    final androidx.compose.ui.text.input.E e19 = e11;
                    final androidx.compose.foundation.interaction.k kVar111 = kVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211115 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211116 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211117 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211118 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211119 = pVar12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111110 = pVar15;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111 = pVar16;
                    final androidx.compose.ui.graphics.l0 l0Var10 = l0Var2;
                    CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar10, z2116, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                TextFieldColors textFieldColors10 = textFieldColors9;
                                androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z2116 ? textFieldColors10.j : textFieldColors10.f12352i);
                                final String str2 = str;
                                Ia.l<String, p293xa.r> lVar2 = lVar;
                                final boolean z21110 = z2117;
                                boolean z21111 = z2118;
                                androidx.compose.ui.text.F f13 = fD7;
                                androidx.compose.foundation.text.k kVar112 = kVar110;
                                androidx.compose.foundation.text.j jVar11 = jVar10;
                                final boolean z21112 = z2119;
                                int i618 = i616;
                                int i619 = i617;
                                final androidx.compose.ui.text.input.E e110 = e19;
                                final androidx.compose.foundation.interaction.k kVar113 = kVar111;
                                final boolean z21113 = z2116;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar211115;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar211116;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar211117;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar211118;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar211119;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar2111110;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar2111111;
                                final androidx.compose.ui.graphics.l0 l0Var11 = l0Var10;
                                final TextFieldColors textFieldColors11 = textFieldColors9;
                                BasicTextFieldKt.b(str2, lVar2, hVarA, z21110, z21111, f13, kVar112, jVar11, z21112, i618, i619, e110, null, kVar113, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue = num2.intValue();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                        }
                                        int i6110 = iIntValue;
                                        if ((i6110 & 19) == 18 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextFieldDefaults.f12369a.b(str2, pVar38, z21110, z21112, e110, kVar113, z21113, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var11, textFieldColors11, null, null, interfaceC1084f5, (i6110 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    f12 = f11;
                    hVar3 = hVar2;
                    z18 = z16;
                    e12 = e11;
                    z19 = z14;
                    pVar17 = pVar8;
                    pVar18 = pVar16;
                    pVar19 = pVar11;
                    pVar20 = pVar12;
                    i54 = i53;
                    z20 = z15;
                    kVar6 = kVar3;
                    pVar21 = pVar10;
                    kVar7 = kVar4;
                    jVar3 = jVar2;
                    l0Var3 = l0Var2;
                    z21 = z17;
                    textFieldColors2 = textFieldColorsC;
                    pVar22 = pVar15;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i58 |= 3072;
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    if (c1086gP.c(z11)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i58 |= i20;
                }
                if ((i12 & 196608) != 0) {
                    if ((i15 & 32) == 0) {
                        i56 = 65536;
                    } else {
                        i56 = 65536;
                    }
                    i58 |= i56;
                }
                i21 = i15 & 64;
                if (i21 != 0) {
                    i58 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i58 |= i22;
                }
                i23 = i15 & 128;
                if (i23 != 0) {
                    i58 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i58 |= i24;
                }
                i25 = i15 & 256;
                if (i25 != 0) {
                    i58 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i26 = 67108864;
                    } else {
                        i26 = 33554432;
                    }
                    i58 |= i26;
                }
                i27 = i15 & 512;
                if (i27 != 0) {
                    i58 |= 805306368;
                } else if ((i12 & 805306368) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i58 |= i28;
                }
                i29 = i15 & 1024;
                if (i29 != 0) {
                    i30 = i13 | 6;
                } else if ((i13 & 6) == 0) {
                    if (c1086gP.k(pVar5)) {
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
                } else if ((i13 & 48) == 0) {
                    if (c1086gP.k(pVar6)) {
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
                } else if ((i13 & 384) != 0) {
                    if (c1086gP.k(pVar7)) {
                        i36 = 256;
                    } else {
                        i36 = 128;
                    }
                    i34 |= i36;
                }
                i37 = i15 & 8192;
                if (i37 != 0) {
                    i34 |= 3072;
                } else if ((i13 & 3072) != 0) {
                    if (c1086gP.c(z12)) {
                        i38 = 2048;
                    } else {
                        i38 = 1024;
                    }
                    i34 |= i38;
                }
                i39 = i15 & 16384;
                if (i39 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c1086gP.K(e10)) {
                            i40 = 16384;
                        } else {
                            i40 = 8192;
                        }
                        i34 |= i40;
                    }
                    i41 = i15 & 32768;
                    if (i41 != 0) {
                        i34 |= 196608;
                    } else if ((i13 & 196608) == 0) {
                        if (c1086gP.K(kVar)) {
                            i42 = 131072;
                        } else {
                            i42 = 65536;
                        }
                        i34 |= i42;
                    }
                    i43 = i15 & 65536;
                    if (i43 != 0) {
                        i34 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c1086gP.K(jVar)) {
                            i44 = 1048576;
                        } else {
                            i44 = 524288;
                        }
                        i34 |= i44;
                    }
                    i45 = i15 & 131072;
                    if (i45 != 0) {
                        i34 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c1086gP.c(z13)) {
                            i46 = 8388608;
                        } else {
                            i46 = 4194304;
                        }
                        i34 |= i46;
                    }
                    if ((i13 & 100663296) != 0) {
                        if ((i15 & 262144) == 0) {
                            i55 = 33554432;
                        } else {
                            i55 = 33554432;
                        }
                        i34 |= i55;
                    }
                    i47 = i15 & 524288;
                    if (i47 != 0) {
                        i34 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c1086gP.h(i11)) {
                            i48 = 536870912;
                        } else {
                            i48 = 268435456;
                        }
                        i34 |= i48;
                    }
                    i49 = i15 & 1048576;
                    if (i49 != 0) {
                        i50 = i14 | 6;
                    } else if ((i14 & 6) == 0) {
                        i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
                    } else {
                        i50 = i14;
                    }
                    if ((i14 & 48) != 0) {
                        if ((i15 & 2097152) == 0) {
                            i57 = 32;
                        }
                        i50 |= i57;
                    }
                    if ((i14 & 384) != 0) {
                        i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
                    }
                    int i618 = i50;
                    if ((i58 & 306783379) != 306783378) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults117 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults118 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        } else {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults119 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults1110 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        }
                        c1086gP.U();
                        c1086gP.L(-508515290);
                        if (kVar4 == null) {
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar5 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            kVar5 = kVar4;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-508509180);
                        jB = f11.b();
                        if (jB != 16) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                        } else {
                            zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                            if (z14) {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                j = textFieldColorsC.f12346c;
                            } else {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                if (z16) {
                                    j = textFieldColorsC.f12347d;
                                } else if (zBooleanValue) {
                                    j = textFieldColorsC.f12344a;
                                } else {
                                    j = textFieldColorsC.f12345b;
                                }
                            }
                            jB = j;
                        }
                        c1086gP.T(false);
                        final androidx.compose.ui.text.F fD8 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                        final androidx.compose.ui.h hVar11 = hVar2;
                        final boolean z21110 = z16;
                        final TextFieldColors textFieldColors10 = textFieldColorsC;
                        final boolean z21111 = z14;
                        final boolean z21112 = z15;
                        final androidx.compose.foundation.text.k kVar112 = kVar3;
                        final androidx.compose.foundation.text.j jVar11 = jVar2;
                        final boolean z21113 = z17;
                        final int i619 = i53;
                        final int i6110 = i52;
                        final androidx.compose.ui.text.input.E e110 = e11;
                        final androidx.compose.foundation.interaction.k kVar113 = kVar5;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111112 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111113 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111114 = pVar10;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111115 = pVar11;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111116 = pVar12;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111117 = pVar15;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111118 = pVar16;
                        final androidx.compose.ui.graphics.l0 l0Var11 = l0Var2;
                        CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                    androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar11, z21110, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                    TextFieldColors textFieldColors11 = textFieldColors10;
                                    androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z21110 ? textFieldColors11.j : textFieldColors11.f12352i);
                                    final String str2 = str;
                                    Ia.l<String, p293xa.r> lVar2 = lVar;
                                    final boolean z21114 = z21111;
                                    boolean z21115 = z21112;
                                    androidx.compose.ui.text.F f13 = fD8;
                                    androidx.compose.foundation.text.k kVar114 = kVar112;
                                    androidx.compose.foundation.text.j jVar12 = jVar11;
                                    final boolean z21116 = z21113;
                                    int i6111 = i619;
                                    int i6112 = i6110;
                                    final androidx.compose.ui.text.input.E e111 = e110;
                                    final androidx.compose.foundation.interaction.k kVar115 = kVar113;
                                    final boolean z21117 = z21110;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar2111112;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar2111113;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar2111114;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar2111115;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar2111116;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar2111117;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar2111118;
                                    final androidx.compose.ui.graphics.l0 l0Var12 = l0Var11;
                                    final TextFieldColors textFieldColors12 = textFieldColors10;
                                    BasicTextFieldKt.b(str2, lVar2, hVarA, z21114, z21115, f13, kVar114, jVar12, z21116, i6111, i6112, e111, null, kVar115, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            int iIntValue = num2.intValue();
                                            if ((iIntValue & 6) == 0) {
                                                iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                            }
                                            int i6113 = iIntValue;
                                            if ((i6113 & 19) == 18 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                TextFieldDefaults.f12369a.b(str2, pVar38, z21114, z21116, e111, kVar115, z21117, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var12, textFieldColors12, null, null, interfaceC1084f5, (i6113 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        f12 = f11;
                        hVar3 = hVar2;
                        z18 = z16;
                        e12 = e11;
                        z19 = z14;
                        pVar17 = pVar8;
                        pVar18 = pVar16;
                        pVar19 = pVar11;
                        pVar20 = pVar12;
                        i54 = i53;
                        z20 = z15;
                        kVar6 = kVar3;
                        pVar21 = pVar10;
                        kVar7 = kVar4;
                        jVar3 = jVar2;
                        l0Var3 = l0Var2;
                        z21 = z17;
                        textFieldColors2 = textFieldColorsC;
                        pVar22 = pVar15;
                    } else {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults1111 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults1112 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        } else {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults1113 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults1114 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        }
                        c1086gP.U();
                        c1086gP.L(-508515290);
                        if (kVar4 == null) {
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar5 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            kVar5 = kVar4;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-508509180);
                        jB = f11.b();
                        if (jB != 16) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                        } else {
                            zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                            if (z14) {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                j = textFieldColorsC.f12346c;
                            } else {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                if (z16) {
                                    j = textFieldColorsC.f12347d;
                                } else if (zBooleanValue) {
                                    j = textFieldColorsC.f12344a;
                                } else {
                                    j = textFieldColorsC.f12345b;
                                }
                            }
                            jB = j;
                        }
                        c1086gP.T(false);
                        final androidx.compose.ui.text.F fD9 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                        final androidx.compose.ui.h hVar12 = hVar2;
                        final boolean z21114 = z16;
                        final TextFieldColors textFieldColors11 = textFieldColorsC;
                        final boolean z21115 = z14;
                        final boolean z21116 = z15;
                        final androidx.compose.foundation.text.k kVar114 = kVar3;
                        final androidx.compose.foundation.text.j jVar12 = jVar2;
                        final boolean z21117 = z17;
                        final int i6111 = i53;
                        final int i6112 = i52;
                        final androidx.compose.ui.text.input.E e111 = e11;
                        final androidx.compose.foundation.interaction.k kVar115 = kVar5;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111119 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111110 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111 = pVar10;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111112 = pVar11;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111113 = pVar12;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111114 = pVar15;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111115 = pVar16;
                        final androidx.compose.ui.graphics.l0 l0Var12 = l0Var2;
                        CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                    androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar12, z21114, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                    TextFieldColors textFieldColors12 = textFieldColors11;
                                    androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z21114 ? textFieldColors12.j : textFieldColors12.f12352i);
                                    final String str2 = str;
                                    Ia.l<String, p293xa.r> lVar2 = lVar;
                                    final boolean z21118 = z21115;
                                    boolean z21119 = z21116;
                                    androidx.compose.ui.text.F f13 = fD9;
                                    androidx.compose.foundation.text.k kVar116 = kVar114;
                                    androidx.compose.foundation.text.j jVar13 = jVar12;
                                    final boolean z211110 = z21117;
                                    int i6113 = i6111;
                                    int i6114 = i6112;
                                    final androidx.compose.ui.text.input.E e112 = e111;
                                    final androidx.compose.foundation.interaction.k kVar117 = kVar115;
                                    final boolean z211111 = z21114;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar2111119;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar21111110;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar21111111;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar21111112;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar21111113;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar21111114;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar21111115;
                                    final androidx.compose.ui.graphics.l0 l0Var13 = l0Var12;
                                    final TextFieldColors textFieldColors13 = textFieldColors11;
                                    BasicTextFieldKt.b(str2, lVar2, hVarA, z21118, z21119, f13, kVar116, jVar13, z211110, i6113, i6114, e112, null, kVar117, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            int iIntValue = num2.intValue();
                                            if ((iIntValue & 6) == 0) {
                                                iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                            }
                                            int i6115 = iIntValue;
                                            if ((i6115 & 19) == 18 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                TextFieldDefaults.f12369a.b(str2, pVar38, z21118, z211110, e112, kVar117, z211111, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var13, textFieldColors13, null, null, interfaceC1084f5, (i6115 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        f12 = f11;
                        hVar3 = hVar2;
                        z18 = z16;
                        e12 = e11;
                        z19 = z14;
                        pVar17 = pVar8;
                        pVar18 = pVar16;
                        pVar19 = pVar11;
                        pVar20 = pVar12;
                        i54 = i53;
                        z20 = z15;
                        kVar6 = kVar3;
                        pVar21 = pVar10;
                        kVar7 = kVar4;
                        jVar3 = jVar2;
                        l0Var3 = l0Var2;
                        z21 = z17;
                        textFieldColors2 = textFieldColorsC;
                        pVar22 = pVar15;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i34 |= 24576;
                i41 = i15 & 32768;
                if (i41 != 0) {
                    i34 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (c1086gP.K(kVar)) {
                        i42 = 131072;
                    } else {
                        i42 = 65536;
                    }
                    i34 |= i42;
                }
                i43 = i15 & 65536;
                if (i43 != 0) {
                    i34 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c1086gP.K(jVar)) {
                        i44 = 1048576;
                    } else {
                        i44 = 524288;
                    }
                    i34 |= i44;
                }
                i45 = i15 & 131072;
                if (i45 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c1086gP.c(z13)) {
                        i46 = 8388608;
                    } else {
                        i46 = 4194304;
                    }
                    i34 |= i46;
                }
                if ((i13 & 100663296) != 0) {
                    if ((i15 & 262144) == 0) {
                        i55 = 33554432;
                    } else {
                        i55 = 33554432;
                    }
                    i34 |= i55;
                }
                i47 = i15 & 524288;
                if (i47 != 0) {
                    i34 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c1086gP.h(i11)) {
                        i48 = 536870912;
                    } else {
                        i48 = 268435456;
                    }
                    i34 |= i48;
                }
                i49 = i15 & 1048576;
                if (i49 != 0) {
                    i50 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
                } else {
                    i50 = i14;
                }
                if ((i14 & 48) != 0) {
                    if ((i15 & 2097152) == 0) {
                        i57 = 32;
                    }
                    i50 |= i57;
                }
                if ((i14 & 384) != 0) {
                    i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
                }
                int i6113 = i50;
                if ((i58 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults1115 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults1116 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    } else {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults1117 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults1118 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    }
                    c1086gP.U();
                    c1086gP.L(-508515290);
                    if (kVar4 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar5 = kVar4;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-508509180);
                    jB = f11.b();
                    if (jB != 16) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                    } else {
                        zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                        if (z14) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            j = textFieldColorsC.f12346c;
                        } else {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            if (z16) {
                                j = textFieldColorsC.f12347d;
                            } else if (zBooleanValue) {
                                j = textFieldColorsC.f12344a;
                            } else {
                                j = textFieldColorsC.f12345b;
                            }
                        }
                        jB = j;
                    }
                    c1086gP.T(false);
                    final androidx.compose.ui.text.F fD10 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final androidx.compose.ui.h hVar13 = hVar2;
                    final boolean z21118 = z16;
                    final TextFieldColors textFieldColors12 = textFieldColorsC;
                    final boolean z21119 = z14;
                    final boolean z211110 = z15;
                    final androidx.compose.foundation.text.k kVar116 = kVar3;
                    final androidx.compose.foundation.text.j jVar13 = jVar2;
                    final boolean z211111 = z17;
                    final int i6114 = i53;
                    final int i6115 = i52;
                    final androidx.compose.ui.text.input.E e112 = e11;
                    final androidx.compose.foundation.interaction.k kVar117 = kVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111116 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111117 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111118 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111119 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111110 = pVar12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111 = pVar15;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111112 = pVar16;
                    final androidx.compose.ui.graphics.l0 l0Var13 = l0Var2;
                    CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar13, z21118, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                TextFieldColors textFieldColors13 = textFieldColors12;
                                androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z21118 ? textFieldColors13.j : textFieldColors13.f12352i);
                                final String str2 = str;
                                Ia.l<String, p293xa.r> lVar2 = lVar;
                                final boolean z211112 = z21119;
                                boolean z211113 = z211110;
                                androidx.compose.ui.text.F f13 = fD10;
                                androidx.compose.foundation.text.k kVar118 = kVar116;
                                androidx.compose.foundation.text.j jVar14 = jVar13;
                                final boolean z211114 = z211111;
                                int i6116 = i6114;
                                int i6117 = i6115;
                                final androidx.compose.ui.text.input.E e113 = e112;
                                final androidx.compose.foundation.interaction.k kVar119 = kVar117;
                                final boolean z211115 = z21118;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar21111116;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar21111117;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar21111118;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar21111119;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar211111110;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar211111111;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar211111112;
                                final androidx.compose.ui.graphics.l0 l0Var14 = l0Var13;
                                final TextFieldColors textFieldColors14 = textFieldColors12;
                                BasicTextFieldKt.b(str2, lVar2, hVarA, z211112, z211113, f13, kVar118, jVar14, z211114, i6116, i6117, e113, null, kVar119, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue = num2.intValue();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                        }
                                        int i6118 = iIntValue;
                                        if ((i6118 & 19) == 18 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextFieldDefaults.f12369a.b(str2, pVar38, z211112, z211114, e113, kVar119, z211115, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var14, textFieldColors14, null, null, interfaceC1084f5, (i6118 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    f12 = f11;
                    hVar3 = hVar2;
                    z18 = z16;
                    e12 = e11;
                    z19 = z14;
                    pVar17 = pVar8;
                    pVar18 = pVar16;
                    pVar19 = pVar11;
                    pVar20 = pVar12;
                    i54 = i53;
                    z20 = z15;
                    kVar6 = kVar3;
                    pVar21 = pVar10;
                    kVar7 = kVar4;
                    jVar3 = jVar2;
                    l0Var3 = l0Var2;
                    z21 = z17;
                    textFieldColors2 = textFieldColorsC;
                    pVar22 = pVar15;
                } else {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults1119 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults11110 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    } else {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults11111 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults11112 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    }
                    c1086gP.U();
                    c1086gP.L(-508515290);
                    if (kVar4 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar5 = kVar4;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-508509180);
                    jB = f11.b();
                    if (jB != 16) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                    } else {
                        zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                        if (z14) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            j = textFieldColorsC.f12346c;
                        } else {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            if (z16) {
                                j = textFieldColorsC.f12347d;
                            } else if (zBooleanValue) {
                                j = textFieldColorsC.f12344a;
                            } else {
                                j = textFieldColorsC.f12345b;
                            }
                        }
                        jB = j;
                    }
                    c1086gP.T(false);
                    final androidx.compose.ui.text.F fD11 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final androidx.compose.ui.h hVar14 = hVar2;
                    final boolean z211112 = z16;
                    final TextFieldColors textFieldColors13 = textFieldColorsC;
                    final boolean z211113 = z14;
                    final boolean z211114 = z15;
                    final androidx.compose.foundation.text.k kVar118 = kVar3;
                    final androidx.compose.foundation.text.j jVar14 = jVar2;
                    final boolean z211115 = z17;
                    final int i6116 = i53;
                    final int i6117 = i52;
                    final androidx.compose.ui.text.input.E e113 = e11;
                    final androidx.compose.foundation.interaction.k kVar119 = kVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111113 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111114 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111115 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111116 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111117 = pVar12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111118 = pVar15;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111119 = pVar16;
                    final androidx.compose.ui.graphics.l0 l0Var14 = l0Var2;
                    CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar14, z211112, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                TextFieldColors textFieldColors14 = textFieldColors13;
                                androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z211112 ? textFieldColors14.j : textFieldColors14.f12352i);
                                final String str2 = str;
                                Ia.l<String, p293xa.r> lVar2 = lVar;
                                final boolean z211116 = z211113;
                                boolean z211117 = z211114;
                                androidx.compose.ui.text.F f13 = fD11;
                                androidx.compose.foundation.text.k kVar1110 = kVar118;
                                androidx.compose.foundation.text.j jVar15 = jVar14;
                                final boolean z211118 = z211115;
                                int i6118 = i6116;
                                int i6119 = i6117;
                                final androidx.compose.ui.text.input.E e114 = e113;
                                final androidx.compose.foundation.interaction.k kVar1111 = kVar119;
                                final boolean z211119 = z211112;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar211111113;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar211111114;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar211111115;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar211111116;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar211111117;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar211111118;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar211111119;
                                final androidx.compose.ui.graphics.l0 l0Var15 = l0Var14;
                                final TextFieldColors textFieldColors15 = textFieldColors13;
                                BasicTextFieldKt.b(str2, lVar2, hVarA, z211116, z211117, f13, kVar1110, jVar15, z211118, i6118, i6119, e114, null, kVar1111, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue = num2.intValue();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                        }
                                        int i61110 = iIntValue;
                                        if ((i61110 & 19) == 18 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextFieldDefaults.f12369a.b(str2, pVar38, z211116, z211118, e114, kVar1111, z211119, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var15, textFieldColors15, null, null, interfaceC1084f5, (i61110 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    f12 = f11;
                    hVar3 = hVar2;
                    z18 = z16;
                    e12 = e11;
                    z19 = z14;
                    pVar17 = pVar8;
                    pVar18 = pVar16;
                    pVar19 = pVar11;
                    pVar20 = pVar12;
                    i54 = i53;
                    z20 = z15;
                    kVar6 = kVar3;
                    pVar21 = pVar10;
                    kVar7 = kVar4;
                    jVar3 = jVar2;
                    l0Var3 = l0Var2;
                    z21 = z17;
                    textFieldColors2 = textFieldColorsC;
                    pVar22 = pVar15;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i58 |= 24576;
            if ((i12 & 196608) != 0) {
                if ((i15 & 32) == 0) {
                    i56 = 65536;
                } else {
                    i56 = 65536;
                }
                i58 |= i56;
            }
            i21 = i15 & 64;
            if (i21 != 0) {
                i58 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c1086gP.k(pVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i58 |= i22;
            }
            i23 = i15 & 128;
            if (i23 != 0) {
                i58 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c1086gP.k(pVar2)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i58 |= i24;
            }
            i25 = i15 & 256;
            if (i25 != 0) {
                i58 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (c1086gP.k(pVar3)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i58 |= i26;
            }
            i27 = i15 & 512;
            if (i27 != 0) {
                i58 |= 805306368;
            } else if ((i12 & 805306368) == 0) {
                if (c1086gP.k(pVar4)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i58 |= i28;
            }
            i29 = i15 & 1024;
            if (i29 != 0) {
                i30 = i13 | 6;
            } else if ((i13 & 6) == 0) {
                if (c1086gP.k(pVar5)) {
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
            } else if ((i13 & 48) == 0) {
                if (c1086gP.k(pVar6)) {
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
            } else if ((i13 & 384) != 0) {
                if (c1086gP.k(pVar7)) {
                    i36 = 256;
                } else {
                    i36 = 128;
                }
                i34 |= i36;
            }
            i37 = i15 & 8192;
            if (i37 != 0) {
                i34 |= 3072;
            } else if ((i13 & 3072) != 0) {
                if (c1086gP.c(z12)) {
                    i38 = 2048;
                } else {
                    i38 = 1024;
                }
                i34 |= i38;
            }
            i39 = i15 & 16384;
            if (i39 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c1086gP.K(e10)) {
                        i40 = 16384;
                    } else {
                        i40 = 8192;
                    }
                    i34 |= i40;
                }
                i41 = i15 & 32768;
                if (i41 != 0) {
                    i34 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (c1086gP.K(kVar)) {
                        i42 = 131072;
                    } else {
                        i42 = 65536;
                    }
                    i34 |= i42;
                }
                i43 = i15 & 65536;
                if (i43 != 0) {
                    i34 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c1086gP.K(jVar)) {
                        i44 = 1048576;
                    } else {
                        i44 = 524288;
                    }
                    i34 |= i44;
                }
                i45 = i15 & 131072;
                if (i45 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c1086gP.c(z13)) {
                        i46 = 8388608;
                    } else {
                        i46 = 4194304;
                    }
                    i34 |= i46;
                }
                if ((i13 & 100663296) != 0) {
                    if ((i15 & 262144) == 0) {
                        i55 = 33554432;
                    } else {
                        i55 = 33554432;
                    }
                    i34 |= i55;
                }
                i47 = i15 & 524288;
                if (i47 != 0) {
                    i34 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c1086gP.h(i11)) {
                        i48 = 536870912;
                    } else {
                        i48 = 268435456;
                    }
                    i34 |= i48;
                }
                i49 = i15 & 1048576;
                if (i49 != 0) {
                    i50 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
                } else {
                    i50 = i14;
                }
                if ((i14 & 48) != 0) {
                    if ((i15 & 2097152) == 0) {
                        i57 = 32;
                    }
                    i50 |= i57;
                }
                if ((i14 & 384) != 0) {
                    i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
                }
                int i6118 = i50;
                if ((i58 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults11113 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults11114 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    } else {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults11115 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults11116 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    }
                    c1086gP.U();
                    c1086gP.L(-508515290);
                    if (kVar4 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar5 = kVar4;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-508509180);
                    jB = f11.b();
                    if (jB != 16) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                    } else {
                        zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                        if (z14) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            j = textFieldColorsC.f12346c;
                        } else {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            if (z16) {
                                j = textFieldColorsC.f12347d;
                            } else if (zBooleanValue) {
                                j = textFieldColorsC.f12344a;
                            } else {
                                j = textFieldColorsC.f12345b;
                            }
                        }
                        jB = j;
                    }
                    c1086gP.T(false);
                    final androidx.compose.ui.text.F fD12 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final androidx.compose.ui.h hVar15 = hVar2;
                    final boolean z211116 = z16;
                    final TextFieldColors textFieldColors14 = textFieldColorsC;
                    final boolean z211117 = z14;
                    final boolean z211118 = z15;
                    final androidx.compose.foundation.text.k kVar1110 = kVar3;
                    final androidx.compose.foundation.text.j jVar15 = jVar2;
                    final boolean z211119 = z17;
                    final int i6119 = i53;
                    final int i61110 = i52;
                    final androidx.compose.ui.text.input.E e114 = e11;
                    final androidx.compose.foundation.interaction.k kVar1111 = kVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111110 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111112 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111113 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111114 = pVar12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111115 = pVar15;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111116 = pVar16;
                    final androidx.compose.ui.graphics.l0 l0Var15 = l0Var2;
                    CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar15, z211116, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                TextFieldColors textFieldColors15 = textFieldColors14;
                                androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z211116 ? textFieldColors15.j : textFieldColors15.f12352i);
                                final String str2 = str;
                                Ia.l<String, p293xa.r> lVar2 = lVar;
                                final boolean z2111110 = z211117;
                                boolean z2111111 = z211118;
                                androidx.compose.ui.text.F f13 = fD12;
                                androidx.compose.foundation.text.k kVar1112 = kVar1110;
                                androidx.compose.foundation.text.j jVar16 = jVar15;
                                final boolean z2111112 = z211119;
                                int i61111 = i6119;
                                int i61112 = i61110;
                                final androidx.compose.ui.text.input.E e115 = e114;
                                final androidx.compose.foundation.interaction.k kVar1113 = kVar1111;
                                final boolean z2111113 = z211116;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar2111111110;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar2111111111;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar2111111112;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar2111111113;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar2111111114;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar2111111115;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar2111111116;
                                final androidx.compose.ui.graphics.l0 l0Var16 = l0Var15;
                                final TextFieldColors textFieldColors16 = textFieldColors14;
                                BasicTextFieldKt.b(str2, lVar2, hVarA, z2111110, z2111111, f13, kVar1112, jVar16, z2111112, i61111, i61112, e115, null, kVar1113, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue = num2.intValue();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                        }
                                        int i61113 = iIntValue;
                                        if ((i61113 & 19) == 18 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextFieldDefaults.f12369a.b(str2, pVar38, z2111110, z2111112, e115, kVar1113, z2111113, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var16, textFieldColors16, null, null, interfaceC1084f5, (i61113 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    f12 = f11;
                    hVar3 = hVar2;
                    z18 = z16;
                    e12 = e11;
                    z19 = z14;
                    pVar17 = pVar8;
                    pVar18 = pVar16;
                    pVar19 = pVar11;
                    pVar20 = pVar12;
                    i54 = i53;
                    z20 = z15;
                    kVar6 = kVar3;
                    pVar21 = pVar10;
                    kVar7 = kVar4;
                    jVar3 = jVar2;
                    l0Var3 = l0Var2;
                    z21 = z17;
                    textFieldColors2 = textFieldColorsC;
                    pVar22 = pVar15;
                } else {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults11117 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults11118 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    } else {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults11119 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults111110 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    }
                    c1086gP.U();
                    c1086gP.L(-508515290);
                    if (kVar4 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar5 = kVar4;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-508509180);
                    jB = f11.b();
                    if (jB != 16) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                    } else {
                        zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                        if (z14) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            j = textFieldColorsC.f12346c;
                        } else {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            if (z16) {
                                j = textFieldColorsC.f12347d;
                            } else if (zBooleanValue) {
                                j = textFieldColorsC.f12344a;
                            } else {
                                j = textFieldColorsC.f12345b;
                            }
                        }
                        jB = j;
                    }
                    c1086gP.T(false);
                    final androidx.compose.ui.text.F fD13 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final androidx.compose.ui.h hVar16 = hVar2;
                    final boolean z2111110 = z16;
                    final TextFieldColors textFieldColors15 = textFieldColorsC;
                    final boolean z2111111 = z14;
                    final boolean z2111112 = z15;
                    final androidx.compose.foundation.text.k kVar1112 = kVar3;
                    final androidx.compose.foundation.text.j jVar16 = jVar2;
                    final boolean z2111113 = z17;
                    final int i61111 = i53;
                    final int i61112 = i52;
                    final androidx.compose.ui.text.input.E e115 = e11;
                    final androidx.compose.foundation.interaction.k kVar1113 = kVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111117 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111118 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111119 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111110 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111 = pVar12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111112 = pVar15;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111113 = pVar16;
                    final androidx.compose.ui.graphics.l0 l0Var16 = l0Var2;
                    CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar16, z2111110, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                TextFieldColors textFieldColors16 = textFieldColors15;
                                androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z2111110 ? textFieldColors16.j : textFieldColors16.f12352i);
                                final String str2 = str;
                                Ia.l<String, p293xa.r> lVar2 = lVar;
                                final boolean z2111114 = z2111111;
                                boolean z2111115 = z2111112;
                                androidx.compose.ui.text.F f13 = fD13;
                                androidx.compose.foundation.text.k kVar1114 = kVar1112;
                                androidx.compose.foundation.text.j jVar17 = jVar16;
                                final boolean z2111116 = z2111113;
                                int i61113 = i61111;
                                int i61114 = i61112;
                                final androidx.compose.ui.text.input.E e116 = e115;
                                final androidx.compose.foundation.interaction.k kVar1115 = kVar1113;
                                final boolean z2111117 = z2111110;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar2111111117;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar2111111118;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar2111111119;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar21111111110;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar21111111111;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar21111111112;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar21111111113;
                                final androidx.compose.ui.graphics.l0 l0Var17 = l0Var16;
                                final TextFieldColors textFieldColors17 = textFieldColors15;
                                BasicTextFieldKt.b(str2, lVar2, hVarA, z2111114, z2111115, f13, kVar1114, jVar17, z2111116, i61113, i61114, e116, null, kVar1115, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue = num2.intValue();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                        }
                                        int i61115 = iIntValue;
                                        if ((i61115 & 19) == 18 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextFieldDefaults.f12369a.b(str2, pVar38, z2111114, z2111116, e116, kVar1115, z2111117, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var17, textFieldColors17, null, null, interfaceC1084f5, (i61115 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    f12 = f11;
                    hVar3 = hVar2;
                    z18 = z16;
                    e12 = e11;
                    z19 = z14;
                    pVar17 = pVar8;
                    pVar18 = pVar16;
                    pVar19 = pVar11;
                    pVar20 = pVar12;
                    i54 = i53;
                    z20 = z15;
                    kVar6 = kVar3;
                    pVar21 = pVar10;
                    kVar7 = kVar4;
                    jVar3 = jVar2;
                    l0Var3 = l0Var2;
                    z21 = z17;
                    textFieldColors2 = textFieldColorsC;
                    pVar22 = pVar15;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i34 |= 24576;
            i41 = i15 & 32768;
            if (i41 != 0) {
                i34 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (c1086gP.K(kVar)) {
                    i42 = 131072;
                } else {
                    i42 = 65536;
                }
                i34 |= i42;
            }
            i43 = i15 & 65536;
            if (i43 != 0) {
                i34 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c1086gP.K(jVar)) {
                    i44 = 1048576;
                } else {
                    i44 = 524288;
                }
                i34 |= i44;
            }
            i45 = i15 & 131072;
            if (i45 != 0) {
                i34 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c1086gP.c(z13)) {
                    i46 = 8388608;
                } else {
                    i46 = 4194304;
                }
                i34 |= i46;
            }
            if ((i13 & 100663296) != 0) {
                if ((i15 & 262144) == 0) {
                    i55 = 33554432;
                } else {
                    i55 = 33554432;
                }
                i34 |= i55;
            }
            i47 = i15 & 524288;
            if (i47 != 0) {
                i34 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c1086gP.h(i11)) {
                    i48 = 536870912;
                } else {
                    i48 = 268435456;
                }
                i34 |= i48;
            }
            i49 = i15 & 1048576;
            if (i49 != 0) {
                i50 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
            } else {
                i50 = i14;
            }
            if ((i14 & 48) != 0) {
                if ((i15 & 2097152) == 0) {
                    i57 = 32;
                }
                i50 |= i57;
            }
            if ((i14 & 384) != 0) {
                i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
            }
            int i61113 = i50;
            if ((i58 & 306783379) != 306783378) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults111111 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults111112 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                } else {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults111113 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults111114 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                }
                c1086gP.U();
                c1086gP.L(-508515290);
                if (kVar4 == null) {
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar5 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    kVar5 = kVar4;
                }
                c1086gP.T(false);
                c1086gP.L(-508509180);
                jB = f11.b();
                if (jB != 16) {
                    pVar15 = pVar13;
                    pVar16 = pVar14;
                } else {
                    zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                    if (z14) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        j = textFieldColorsC.f12346c;
                    } else {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        if (z16) {
                            j = textFieldColorsC.f12347d;
                        } else if (zBooleanValue) {
                            j = textFieldColorsC.f12344a;
                        } else {
                            j = textFieldColorsC.f12345b;
                        }
                    }
                    jB = j;
                }
                c1086gP.T(false);
                final androidx.compose.ui.text.F fD14 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                final androidx.compose.ui.h hVar17 = hVar2;
                final boolean z2111114 = z16;
                final TextFieldColors textFieldColors16 = textFieldColorsC;
                final boolean z2111115 = z14;
                final boolean z2111116 = z15;
                final androidx.compose.foundation.text.k kVar1114 = kVar3;
                final androidx.compose.foundation.text.j jVar17 = jVar2;
                final boolean z2111117 = z17;
                final int i61114 = i53;
                final int i61115 = i52;
                final androidx.compose.ui.text.input.E e116 = e11;
                final androidx.compose.foundation.interaction.k kVar1115 = kVar5;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111114 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111115 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111116 = pVar10;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111117 = pVar11;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111118 = pVar12;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111119 = pVar15;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111110 = pVar16;
                final androidx.compose.ui.graphics.l0 l0Var17 = l0Var2;
                CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                            androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar17, z2111114, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                            TextFieldColors textFieldColors17 = textFieldColors16;
                            androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z2111114 ? textFieldColors17.j : textFieldColors17.f12352i);
                            final String str2 = str;
                            Ia.l<String, p293xa.r> lVar2 = lVar;
                            final boolean z2111118 = z2111115;
                            boolean z2111119 = z2111116;
                            androidx.compose.ui.text.F f13 = fD14;
                            androidx.compose.foundation.text.k kVar1116 = kVar1114;
                            androidx.compose.foundation.text.j jVar18 = jVar17;
                            final boolean z21111110 = z2111117;
                            int i61116 = i61114;
                            int i61117 = i61115;
                            final androidx.compose.ui.text.input.E e117 = e116;
                            final androidx.compose.foundation.interaction.k kVar1117 = kVar1115;
                            final boolean z21111111 = z2111114;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar21111111114;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar21111111115;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar21111111116;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar21111111117;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar21111111118;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar21111111119;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar211111111110;
                            final androidx.compose.ui.graphics.l0 l0Var18 = l0Var17;
                            final TextFieldColors textFieldColors18 = textFieldColors16;
                            BasicTextFieldKt.b(str2, lVar2, hVarA, z2111118, z2111119, f13, kVar1116, jVar18, z21111110, i61116, i61117, e117, null, kVar1117, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue = num2.intValue();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                    }
                                    int i61118 = iIntValue;
                                    if ((i61118 & 19) == 18 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        TextFieldDefaults.f12369a.b(str2, pVar38, z2111118, z21111110, e117, kVar1117, z21111111, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var18, textFieldColors18, null, null, interfaceC1084f5, (i61118 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                f12 = f11;
                hVar3 = hVar2;
                z18 = z16;
                e12 = e11;
                z19 = z14;
                pVar17 = pVar8;
                pVar18 = pVar16;
                pVar19 = pVar11;
                pVar20 = pVar12;
                i54 = i53;
                z20 = z15;
                kVar6 = kVar3;
                pVar21 = pVar10;
                kVar7 = kVar4;
                jVar3 = jVar2;
                l0Var3 = l0Var2;
                z21 = z17;
                textFieldColors2 = textFieldColorsC;
                pVar22 = pVar15;
            } else {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults111115 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults111116 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                } else {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults111117 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults111118 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                }
                c1086gP.U();
                c1086gP.L(-508515290);
                if (kVar4 == null) {
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar5 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    kVar5 = kVar4;
                }
                c1086gP.T(false);
                c1086gP.L(-508509180);
                jB = f11.b();
                if (jB != 16) {
                    pVar15 = pVar13;
                    pVar16 = pVar14;
                } else {
                    zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                    if (z14) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        j = textFieldColorsC.f12346c;
                    } else {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        if (z16) {
                            j = textFieldColorsC.f12347d;
                        } else if (zBooleanValue) {
                            j = textFieldColorsC.f12344a;
                        } else {
                            j = textFieldColorsC.f12345b;
                        }
                    }
                    jB = j;
                }
                c1086gP.T(false);
                final androidx.compose.ui.text.F fD15 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                final androidx.compose.ui.h hVar18 = hVar2;
                final boolean z2111118 = z16;
                final TextFieldColors textFieldColors17 = textFieldColorsC;
                final boolean z2111119 = z14;
                final boolean z21111110 = z15;
                final androidx.compose.foundation.text.k kVar1116 = kVar3;
                final androidx.compose.foundation.text.j jVar18 = jVar2;
                final boolean z21111111 = z17;
                final int i61116 = i53;
                final int i61117 = i52;
                final androidx.compose.ui.text.input.E e117 = e11;
                final androidx.compose.foundation.interaction.k kVar1117 = kVar5;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111112 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111113 = pVar10;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111114 = pVar11;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111115 = pVar12;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111116 = pVar15;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111117 = pVar16;
                final androidx.compose.ui.graphics.l0 l0Var18 = l0Var2;
                CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                            androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar18, z2111118, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                            TextFieldColors textFieldColors18 = textFieldColors17;
                            androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z2111118 ? textFieldColors18.j : textFieldColors18.f12352i);
                            final String str2 = str;
                            Ia.l<String, p293xa.r> lVar2 = lVar;
                            final boolean z21111112 = z2111119;
                            boolean z21111113 = z21111110;
                            androidx.compose.ui.text.F f13 = fD15;
                            androidx.compose.foundation.text.k kVar1118 = kVar1116;
                            androidx.compose.foundation.text.j jVar19 = jVar18;
                            final boolean z21111114 = z21111111;
                            int i61118 = i61116;
                            int i61119 = i61117;
                            final androidx.compose.ui.text.input.E e118 = e117;
                            final androidx.compose.foundation.interaction.k kVar1119 = kVar1117;
                            final boolean z21111115 = z2111118;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar211111111111;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar211111111112;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar211111111113;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar211111111114;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar211111111115;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar211111111116;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar211111111117;
                            final androidx.compose.ui.graphics.l0 l0Var19 = l0Var18;
                            final TextFieldColors textFieldColors19 = textFieldColors17;
                            BasicTextFieldKt.b(str2, lVar2, hVarA, z21111112, z21111113, f13, kVar1118, jVar19, z21111114, i61118, i61119, e118, null, kVar1119, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue = num2.intValue();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                    }
                                    int i611110 = iIntValue;
                                    if ((i611110 & 19) == 18 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        TextFieldDefaults.f12369a.b(str2, pVar38, z21111112, z21111114, e118, kVar1119, z21111115, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var19, textFieldColors19, null, null, interfaceC1084f5, (i611110 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                f12 = f11;
                hVar3 = hVar2;
                z18 = z16;
                e12 = e11;
                z19 = z14;
                pVar17 = pVar8;
                pVar18 = pVar16;
                pVar19 = pVar11;
                pVar20 = pVar12;
                i54 = i53;
                z20 = z15;
                kVar6 = kVar3;
                pVar21 = pVar10;
                kVar7 = kVar4;
                jVar3 = jVar2;
                l0Var3 = l0Var2;
                z21 = z17;
                textFieldColors2 = textFieldColorsC;
                pVar22 = pVar15;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i58 |= 384;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i12 & 3072) == 0) {
                if (c1086gP.c(z10)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i58 |= i18;
            }
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    if (c1086gP.c(z11)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i58 |= i20;
                }
                if ((i12 & 196608) != 0) {
                    if ((i15 & 32) == 0) {
                        i56 = 65536;
                    } else {
                        i56 = 65536;
                    }
                    i58 |= i56;
                }
                i21 = i15 & 64;
                if (i21 != 0) {
                    i58 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c1086gP.k(pVar)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i58 |= i22;
                }
                i23 = i15 & 128;
                if (i23 != 0) {
                    i58 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c1086gP.k(pVar2)) {
                        i24 = 8388608;
                    } else {
                        i24 = 4194304;
                    }
                    i58 |= i24;
                }
                i25 = i15 & 256;
                if (i25 != 0) {
                    i58 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (c1086gP.k(pVar3)) {
                        i26 = 67108864;
                    } else {
                        i26 = 33554432;
                    }
                    i58 |= i26;
                }
                i27 = i15 & 512;
                if (i27 != 0) {
                    i58 |= 805306368;
                } else if ((i12 & 805306368) == 0) {
                    if (c1086gP.k(pVar4)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i58 |= i28;
                }
                i29 = i15 & 1024;
                if (i29 != 0) {
                    i30 = i13 | 6;
                } else if ((i13 & 6) == 0) {
                    if (c1086gP.k(pVar5)) {
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
                } else if ((i13 & 48) == 0) {
                    if (c1086gP.k(pVar6)) {
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
                } else if ((i13 & 384) != 0) {
                    if (c1086gP.k(pVar7)) {
                        i36 = 256;
                    } else {
                        i36 = 128;
                    }
                    i34 |= i36;
                }
                i37 = i15 & 8192;
                if (i37 != 0) {
                    i34 |= 3072;
                } else if ((i13 & 3072) != 0) {
                    if (c1086gP.c(z12)) {
                        i38 = 2048;
                    } else {
                        i38 = 1024;
                    }
                    i34 |= i38;
                }
                i39 = i15 & 16384;
                if (i39 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c1086gP.K(e10)) {
                            i40 = 16384;
                        } else {
                            i40 = 8192;
                        }
                        i34 |= i40;
                    }
                    i41 = i15 & 32768;
                    if (i41 != 0) {
                        i34 |= 196608;
                    } else if ((i13 & 196608) == 0) {
                        if (c1086gP.K(kVar)) {
                            i42 = 131072;
                        } else {
                            i42 = 65536;
                        }
                        i34 |= i42;
                    }
                    i43 = i15 & 65536;
                    if (i43 != 0) {
                        i34 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c1086gP.K(jVar)) {
                            i44 = 1048576;
                        } else {
                            i44 = 524288;
                        }
                        i34 |= i44;
                    }
                    i45 = i15 & 131072;
                    if (i45 != 0) {
                        i34 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c1086gP.c(z13)) {
                            i46 = 8388608;
                        } else {
                            i46 = 4194304;
                        }
                        i34 |= i46;
                    }
                    if ((i13 & 100663296) != 0) {
                        if ((i15 & 262144) == 0) {
                            i55 = 33554432;
                        } else {
                            i55 = 33554432;
                        }
                        i34 |= i55;
                    }
                    i47 = i15 & 524288;
                    if (i47 != 0) {
                        i34 |= 805306368;
                    } else if ((i13 & 805306368) == 0) {
                        if (c1086gP.h(i11)) {
                            i48 = 536870912;
                        } else {
                            i48 = 268435456;
                        }
                        i34 |= i48;
                    }
                    i49 = i15 & 1048576;
                    if (i49 != 0) {
                        i50 = i14 | 6;
                    } else if ((i14 & 6) == 0) {
                        i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
                    } else {
                        i50 = i14;
                    }
                    if ((i14 & 48) != 0) {
                        if ((i15 & 2097152) == 0) {
                            i57 = 32;
                        }
                        i50 |= i57;
                    }
                    if ((i14 & 384) != 0) {
                        i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
                    }
                    int i61118 = i50;
                    if ((i58 & 306783379) != 306783378) {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults111119 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults1111110 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        } else {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults1111111 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults1111112 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        }
                        c1086gP.U();
                        c1086gP.L(-508515290);
                        if (kVar4 == null) {
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar5 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            kVar5 = kVar4;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-508509180);
                        jB = f11.b();
                        if (jB != 16) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                        } else {
                            zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                            if (z14) {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                j = textFieldColorsC.f12346c;
                            } else {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                if (z16) {
                                    j = textFieldColorsC.f12347d;
                                } else if (zBooleanValue) {
                                    j = textFieldColorsC.f12344a;
                                } else {
                                    j = textFieldColorsC.f12345b;
                                }
                            }
                            jB = j;
                        }
                        c1086gP.T(false);
                        final androidx.compose.ui.text.F fD16 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                        final androidx.compose.ui.h hVar19 = hVar2;
                        final boolean z21111112 = z16;
                        final TextFieldColors textFieldColors18 = textFieldColorsC;
                        final boolean z21111113 = z14;
                        final boolean z21111114 = z15;
                        final androidx.compose.foundation.text.k kVar1118 = kVar3;
                        final androidx.compose.foundation.text.j jVar19 = jVar2;
                        final boolean z21111115 = z17;
                        final int i61119 = i53;
                        final int i611110 = i52;
                        final androidx.compose.ui.text.input.E e118 = e11;
                        final androidx.compose.foundation.interaction.k kVar1119 = kVar5;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111118 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111119 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111110 = pVar10;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111 = pVar11;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111112 = pVar12;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111113 = pVar15;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111114 = pVar16;
                        final androidx.compose.ui.graphics.l0 l0Var19 = l0Var2;
                        CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                    androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar19, z21111112, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                    TextFieldColors textFieldColors19 = textFieldColors18;
                                    androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z21111112 ? textFieldColors19.j : textFieldColors19.f12352i);
                                    final String str2 = str;
                                    Ia.l<String, p293xa.r> lVar2 = lVar;
                                    final boolean z21111116 = z21111113;
                                    boolean z21111117 = z21111114;
                                    androidx.compose.ui.text.F f13 = fD16;
                                    androidx.compose.foundation.text.k kVar11110 = kVar1118;
                                    androidx.compose.foundation.text.j jVar110 = jVar19;
                                    final boolean z21111118 = z21111115;
                                    int i611111 = i61119;
                                    int i611112 = i611110;
                                    final androidx.compose.ui.text.input.E e119 = e118;
                                    final androidx.compose.foundation.interaction.k kVar11111 = kVar1119;
                                    final boolean z21111119 = z21111112;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar211111111118;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar211111111119;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar2111111111110;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar2111111111111;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar2111111111112;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar2111111111113;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar2111111111114;
                                    final androidx.compose.ui.graphics.l0 l0Var110 = l0Var19;
                                    final TextFieldColors textFieldColors110 = textFieldColors18;
                                    BasicTextFieldKt.b(str2, lVar2, hVarA, z21111116, z21111117, f13, kVar11110, jVar110, z21111118, i611111, i611112, e119, null, kVar11111, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            int iIntValue = num2.intValue();
                                            if ((iIntValue & 6) == 0) {
                                                iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                            }
                                            int i611113 = iIntValue;
                                            if ((i611113 & 19) == 18 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                TextFieldDefaults.f12369a.b(str2, pVar38, z21111116, z21111118, e119, kVar11111, z21111119, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var110, textFieldColors110, null, null, interfaceC1084f5, (i611113 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        f12 = f11;
                        hVar3 = hVar2;
                        z18 = z16;
                        e12 = e11;
                        z19 = z14;
                        pVar17 = pVar8;
                        pVar18 = pVar16;
                        pVar19 = pVar11;
                        pVar20 = pVar12;
                        i54 = i53;
                        z20 = z15;
                        kVar6 = kVar3;
                        pVar21 = pVar10;
                        kVar7 = kVar4;
                        jVar3 = jVar2;
                        l0Var3 = l0Var2;
                        z21 = z17;
                        textFieldColors2 = textFieldColorsC;
                        pVar22 = pVar15;
                    } else {
                        c1086gP.r0();
                        if ((i12 & 1) != 0) {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults1111113 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults1111114 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        } else {
                            if (i59 != 0) {
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
                                f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                            } else {
                                f11 = f10;
                            }
                            if (i21 != 0) {
                                pVar8 = null;
                            } else {
                                pVar8 = pVar;
                            }
                            if (i23 != 0) {
                                pVar9 = null;
                            } else {
                                pVar9 = pVar2;
                            }
                            if (i25 != 0) {
                                pVar10 = null;
                            } else {
                                pVar10 = pVar3;
                            }
                            if (i27 != 0) {
                                pVar11 = null;
                            } else {
                                pVar11 = pVar4;
                            }
                            if (i29 != 0) {
                                pVar12 = null;
                            } else {
                                pVar12 = pVar5;
                            }
                            if (i32 != 0) {
                                pVar13 = null;
                            } else {
                                pVar13 = pVar6;
                            }
                            if (i35 != 0) {
                                pVar14 = null;
                            } else {
                                pVar14 = pVar7;
                            }
                            if (i37 != 0) {
                                z16 = false;
                            } else {
                                z16 = z12;
                            }
                            if (i39 != 0) {
                                e11 = androidx.compose.ui.text.input.E.a.f15486a;
                            } else {
                                e11 = e10;
                            }
                            if (i41 != 0) {
                                kVar3 = androidx.compose.foundation.text.k.f11351g;
                            } else {
                                kVar3 = kVar;
                            }
                            if (i43 != 0) {
                                jVar2 = androidx.compose.foundation.text.j.f11344g;
                            } else {
                                jVar2 = jVar;
                            }
                            if (i45 != 0) {
                                z17 = false;
                            } else {
                                z17 = z13;
                            }
                            if ((i15 & 262144) == 0) {
                                i51 = i10;
                            } else if (z17) {
                                i51 = 1;
                            } else {
                                i51 = BrazeLogger.SUPPRESS;
                            }
                            if (i47 != 0) {
                                i52 = 1;
                            } else {
                                i52 = i11;
                            }
                            if (i49 == 0) {
                            }
                            if ((i15 & 2097152) != 0) {
                                TextFieldDefaults textFieldDefaults1111115 = TextFieldDefaults.f12369a;
                                l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                            } else {
                                l0VarA = l0Var;
                            }
                            if ((i15 & 4194304) != 0) {
                                TextFieldDefaults textFieldDefaults1111116 = TextFieldDefaults.f12369a;
                                textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                                l0Var2 = l0VarA;
                                i53 = i51;
                                pVar10 = pVar10;
                            } else {
                                textFieldColorsC = textFieldColors;
                                l0Var2 = l0VarA;
                                i53 = i51;
                            }
                        }
                        c1086gP.U();
                        c1086gP.L(-508515290);
                        if (kVar4 == null) {
                            objF = c1086gP.f();
                            if (objF == InterfaceC1084f.a.f12980a) {
                                objF = new androidx.compose.foundation.interaction.l();
                                c1086gP.E(objF);
                            }
                            kVar5 = (androidx.compose.foundation.interaction.k) objF;
                        } else {
                            kVar5 = kVar4;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-508509180);
                        jB = f11.b();
                        if (jB != 16) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                        } else {
                            zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                            if (z14) {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                j = textFieldColorsC.f12346c;
                            } else {
                                pVar15 = pVar13;
                                pVar16 = pVar14;
                                if (z16) {
                                    j = textFieldColorsC.f12347d;
                                } else if (zBooleanValue) {
                                    j = textFieldColorsC.f12344a;
                                } else {
                                    j = textFieldColorsC.f12345b;
                                }
                            }
                            jB = j;
                        }
                        c1086gP.T(false);
                        final androidx.compose.ui.text.F fD17 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                        final androidx.compose.ui.h hVar110 = hVar2;
                        final boolean z21111116 = z16;
                        final TextFieldColors textFieldColors19 = textFieldColorsC;
                        final boolean z21111117 = z14;
                        final boolean z21111118 = z15;
                        final androidx.compose.foundation.text.k kVar11110 = kVar3;
                        final androidx.compose.foundation.text.j jVar110 = jVar2;
                        final boolean z21111119 = z17;
                        final int i611111 = i53;
                        final int i611112 = i52;
                        final androidx.compose.ui.text.input.E e119 = e11;
                        final androidx.compose.foundation.interaction.k kVar11111 = kVar5;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111115 = pVar8;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111116 = pVar9;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111117 = pVar10;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111118 = pVar11;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111119 = pVar12;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111110 = pVar15;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111 = pVar16;
                        final androidx.compose.ui.graphics.l0 l0Var110 = l0Var2;
                        CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                    androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar110, z21111116, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                    TextFieldColors textFieldColors110 = textFieldColors19;
                                    androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z21111116 ? textFieldColors110.j : textFieldColors110.f12352i);
                                    final String str2 = str;
                                    Ia.l<String, p293xa.r> lVar2 = lVar;
                                    final boolean z211111110 = z21111117;
                                    boolean z211111111 = z21111118;
                                    androidx.compose.ui.text.F f13 = fD17;
                                    androidx.compose.foundation.text.k kVar11112 = kVar11110;
                                    androidx.compose.foundation.text.j jVar111 = jVar110;
                                    final boolean z211111112 = z21111119;
                                    int i611113 = i611111;
                                    int i611114 = i611112;
                                    final androidx.compose.ui.text.input.E e1110 = e119;
                                    final androidx.compose.foundation.interaction.k kVar11113 = kVar11111;
                                    final boolean z211111113 = z21111116;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar2111111111115;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar2111111111116;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar2111111111117;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar2111111111118;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar2111111111119;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar21111111111110;
                                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar21111111111111;
                                    final androidx.compose.ui.graphics.l0 l0Var111 = l0Var110;
                                    final TextFieldColors textFieldColors111 = textFieldColors19;
                                    BasicTextFieldKt.b(str2, lVar2, hVarA, z211111110, z211111111, f13, kVar11112, jVar111, z211111112, i611113, i611114, e1110, null, kVar11113, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                        public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                            Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                            InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                            int iIntValue = num2.intValue();
                                            if ((iIntValue & 6) == 0) {
                                                iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                            }
                                            int i611115 = iIntValue;
                                            if ((i611115 & 19) == 18 && interfaceC1084f5.s()) {
                                                interfaceC1084f5.w();
                                            } else {
                                                TextFieldDefaults.f12369a.b(str2, pVar38, z211111110, z211111112, e1110, kVar11113, z211111113, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var111, textFieldColors111, null, null, interfaceC1084f5, (i611115 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                            }
                                            return p293xa.r.f47939a;
                                        }
                                    }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, c1086gP), c1086gP, 56);
                        f12 = f11;
                        hVar3 = hVar2;
                        z18 = z16;
                        e12 = e11;
                        z19 = z14;
                        pVar17 = pVar8;
                        pVar18 = pVar16;
                        pVar19 = pVar11;
                        pVar20 = pVar12;
                        i54 = i53;
                        z20 = z15;
                        kVar6 = kVar3;
                        pVar21 = pVar10;
                        kVar7 = kVar4;
                        jVar3 = jVar2;
                        l0Var3 = l0Var2;
                        z21 = z17;
                        textFieldColors2 = textFieldColorsC;
                        pVar22 = pVar15;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // Ia.p
                            public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                num.intValue();
                                TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                                return p293xa.r.f47939a;
                            }
                        };
                    }
                }
                i34 |= 24576;
                i41 = i15 & 32768;
                if (i41 != 0) {
                    i34 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (c1086gP.K(kVar)) {
                        i42 = 131072;
                    } else {
                        i42 = 65536;
                    }
                    i34 |= i42;
                }
                i43 = i15 & 65536;
                if (i43 != 0) {
                    i34 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c1086gP.K(jVar)) {
                        i44 = 1048576;
                    } else {
                        i44 = 524288;
                    }
                    i34 |= i44;
                }
                i45 = i15 & 131072;
                if (i45 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c1086gP.c(z13)) {
                        i46 = 8388608;
                    } else {
                        i46 = 4194304;
                    }
                    i34 |= i46;
                }
                if ((i13 & 100663296) != 0) {
                    if ((i15 & 262144) == 0) {
                        i55 = 33554432;
                    } else {
                        i55 = 33554432;
                    }
                    i34 |= i55;
                }
                i47 = i15 & 524288;
                if (i47 != 0) {
                    i34 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c1086gP.h(i11)) {
                        i48 = 536870912;
                    } else {
                        i48 = 268435456;
                    }
                    i34 |= i48;
                }
                i49 = i15 & 1048576;
                if (i49 != 0) {
                    i50 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
                } else {
                    i50 = i14;
                }
                if ((i14 & 48) != 0) {
                    if ((i15 & 2097152) == 0) {
                        i57 = 32;
                    }
                    i50 |= i57;
                }
                if ((i14 & 384) != 0) {
                    i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
                }
                int i611113 = i50;
                if ((i58 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults1111117 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults1111118 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    } else {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults1111119 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults11111110 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    }
                    c1086gP.U();
                    c1086gP.L(-508515290);
                    if (kVar4 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar5 = kVar4;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-508509180);
                    jB = f11.b();
                    if (jB != 16) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                    } else {
                        zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                        if (z14) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            j = textFieldColorsC.f12346c;
                        } else {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            if (z16) {
                                j = textFieldColorsC.f12347d;
                            } else if (zBooleanValue) {
                                j = textFieldColorsC.f12344a;
                            } else {
                                j = textFieldColorsC.f12345b;
                            }
                        }
                        jB = j;
                    }
                    c1086gP.T(false);
                    final androidx.compose.ui.text.F fD18 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final androidx.compose.ui.h hVar111 = hVar2;
                    final boolean z211111110 = z16;
                    final TextFieldColors textFieldColors110 = textFieldColorsC;
                    final boolean z211111111 = z14;
                    final boolean z211111112 = z15;
                    final androidx.compose.foundation.text.k kVar11112 = kVar3;
                    final androidx.compose.foundation.text.j jVar111 = jVar2;
                    final boolean z211111113 = z17;
                    final int i611114 = i53;
                    final int i611115 = i52;
                    final androidx.compose.ui.text.input.E e1110 = e11;
                    final androidx.compose.foundation.interaction.k kVar11113 = kVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111112 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111113 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111114 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111115 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111116 = pVar12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111117 = pVar15;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111118 = pVar16;
                    final androidx.compose.ui.graphics.l0 l0Var111 = l0Var2;
                    CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar111, z211111110, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                TextFieldColors textFieldColors111 = textFieldColors110;
                                androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z211111110 ? textFieldColors111.j : textFieldColors111.f12352i);
                                final String str2 = str;
                                Ia.l<String, p293xa.r> lVar2 = lVar;
                                final boolean z211111114 = z211111111;
                                boolean z211111115 = z211111112;
                                androidx.compose.ui.text.F f13 = fD18;
                                androidx.compose.foundation.text.k kVar11114 = kVar11112;
                                androidx.compose.foundation.text.j jVar112 = jVar111;
                                final boolean z211111116 = z211111113;
                                int i611116 = i611114;
                                int i611117 = i611115;
                                final androidx.compose.ui.text.input.E e1111 = e1110;
                                final androidx.compose.foundation.interaction.k kVar11115 = kVar11113;
                                final boolean z211111117 = z211111110;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar21111111111112;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar21111111111113;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar21111111111114;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar21111111111115;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar21111111111116;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar21111111111117;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar21111111111118;
                                final androidx.compose.ui.graphics.l0 l0Var112 = l0Var111;
                                final TextFieldColors textFieldColors112 = textFieldColors110;
                                BasicTextFieldKt.b(str2, lVar2, hVarA, z211111114, z211111115, f13, kVar11114, jVar112, z211111116, i611116, i611117, e1111, null, kVar11115, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue = num2.intValue();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                        }
                                        int i611118 = iIntValue;
                                        if ((i611118 & 19) == 18 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextFieldDefaults.f12369a.b(str2, pVar38, z211111114, z211111116, e1111, kVar11115, z211111117, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var112, textFieldColors112, null, null, interfaceC1084f5, (i611118 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    f12 = f11;
                    hVar3 = hVar2;
                    z18 = z16;
                    e12 = e11;
                    z19 = z14;
                    pVar17 = pVar8;
                    pVar18 = pVar16;
                    pVar19 = pVar11;
                    pVar20 = pVar12;
                    i54 = i53;
                    z20 = z15;
                    kVar6 = kVar3;
                    pVar21 = pVar10;
                    kVar7 = kVar4;
                    jVar3 = jVar2;
                    l0Var3 = l0Var2;
                    z21 = z17;
                    textFieldColors2 = textFieldColorsC;
                    pVar22 = pVar15;
                } else {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults11111111 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults11111112 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    } else {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults11111113 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults11111114 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    }
                    c1086gP.U();
                    c1086gP.L(-508515290);
                    if (kVar4 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar5 = kVar4;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-508509180);
                    jB = f11.b();
                    if (jB != 16) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                    } else {
                        zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                        if (z14) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            j = textFieldColorsC.f12346c;
                        } else {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            if (z16) {
                                j = textFieldColorsC.f12347d;
                            } else if (zBooleanValue) {
                                j = textFieldColorsC.f12344a;
                            } else {
                                j = textFieldColorsC.f12345b;
                            }
                        }
                        jB = j;
                    }
                    c1086gP.T(false);
                    final androidx.compose.ui.text.F fD19 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final androidx.compose.ui.h hVar112 = hVar2;
                    final boolean z211111114 = z16;
                    final TextFieldColors textFieldColors111 = textFieldColorsC;
                    final boolean z211111115 = z14;
                    final boolean z211111116 = z15;
                    final androidx.compose.foundation.text.k kVar11114 = kVar3;
                    final androidx.compose.foundation.text.j jVar112 = jVar2;
                    final boolean z211111117 = z17;
                    final int i611116 = i53;
                    final int i611117 = i52;
                    final androidx.compose.ui.text.input.E e1111 = e11;
                    final androidx.compose.foundation.interaction.k kVar11115 = kVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111119 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111110 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111112 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111113 = pVar12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111114 = pVar15;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111115 = pVar16;
                    final androidx.compose.ui.graphics.l0 l0Var112 = l0Var2;
                    CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar112, z211111114, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                TextFieldColors textFieldColors112 = textFieldColors111;
                                androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z211111114 ? textFieldColors112.j : textFieldColors112.f12352i);
                                final String str2 = str;
                                Ia.l<String, p293xa.r> lVar2 = lVar;
                                final boolean z211111118 = z211111115;
                                boolean z211111119 = z211111116;
                                androidx.compose.ui.text.F f13 = fD19;
                                androidx.compose.foundation.text.k kVar11116 = kVar11114;
                                androidx.compose.foundation.text.j jVar113 = jVar112;
                                final boolean z2111111110 = z211111117;
                                int i611118 = i611116;
                                int i611119 = i611117;
                                final androidx.compose.ui.text.input.E e1112 = e1111;
                                final androidx.compose.foundation.interaction.k kVar11117 = kVar11115;
                                final boolean z2111111111 = z211111114;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar21111111111119;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar211111111111110;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar211111111111111;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar211111111111112;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar211111111111113;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar211111111111114;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar211111111111115;
                                final androidx.compose.ui.graphics.l0 l0Var113 = l0Var112;
                                final TextFieldColors textFieldColors113 = textFieldColors111;
                                BasicTextFieldKt.b(str2, lVar2, hVarA, z211111118, z211111119, f13, kVar11116, jVar113, z2111111110, i611118, i611119, e1112, null, kVar11117, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue = num2.intValue();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                        }
                                        int i6111110 = iIntValue;
                                        if ((i6111110 & 19) == 18 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextFieldDefaults.f12369a.b(str2, pVar38, z211111118, z2111111110, e1112, kVar11117, z2111111111, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var113, textFieldColors113, null, null, interfaceC1084f5, (i6111110 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    f12 = f11;
                    hVar3 = hVar2;
                    z18 = z16;
                    e12 = e11;
                    z19 = z14;
                    pVar17 = pVar8;
                    pVar18 = pVar16;
                    pVar19 = pVar11;
                    pVar20 = pVar12;
                    i54 = i53;
                    z20 = z15;
                    kVar6 = kVar3;
                    pVar21 = pVar10;
                    kVar7 = kVar4;
                    jVar3 = jVar2;
                    l0Var3 = l0Var2;
                    z21 = z17;
                    textFieldColors2 = textFieldColorsC;
                    pVar22 = pVar15;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i58 |= 24576;
            if ((i12 & 196608) != 0) {
                if ((i15 & 32) == 0) {
                    i56 = 65536;
                } else {
                    i56 = 65536;
                }
                i58 |= i56;
            }
            i21 = i15 & 64;
            if (i21 != 0) {
                i58 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c1086gP.k(pVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i58 |= i22;
            }
            i23 = i15 & 128;
            if (i23 != 0) {
                i58 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c1086gP.k(pVar2)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i58 |= i24;
            }
            i25 = i15 & 256;
            if (i25 != 0) {
                i58 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (c1086gP.k(pVar3)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i58 |= i26;
            }
            i27 = i15 & 512;
            if (i27 != 0) {
                i58 |= 805306368;
            } else if ((i12 & 805306368) == 0) {
                if (c1086gP.k(pVar4)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i58 |= i28;
            }
            i29 = i15 & 1024;
            if (i29 != 0) {
                i30 = i13 | 6;
            } else if ((i13 & 6) == 0) {
                if (c1086gP.k(pVar5)) {
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
            } else if ((i13 & 48) == 0) {
                if (c1086gP.k(pVar6)) {
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
            } else if ((i13 & 384) != 0) {
                if (c1086gP.k(pVar7)) {
                    i36 = 256;
                } else {
                    i36 = 128;
                }
                i34 |= i36;
            }
            i37 = i15 & 8192;
            if (i37 != 0) {
                i34 |= 3072;
            } else if ((i13 & 3072) != 0) {
                if (c1086gP.c(z12)) {
                    i38 = 2048;
                } else {
                    i38 = 1024;
                }
                i34 |= i38;
            }
            i39 = i15 & 16384;
            if (i39 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c1086gP.K(e10)) {
                        i40 = 16384;
                    } else {
                        i40 = 8192;
                    }
                    i34 |= i40;
                }
                i41 = i15 & 32768;
                if (i41 != 0) {
                    i34 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (c1086gP.K(kVar)) {
                        i42 = 131072;
                    } else {
                        i42 = 65536;
                    }
                    i34 |= i42;
                }
                i43 = i15 & 65536;
                if (i43 != 0) {
                    i34 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c1086gP.K(jVar)) {
                        i44 = 1048576;
                    } else {
                        i44 = 524288;
                    }
                    i34 |= i44;
                }
                i45 = i15 & 131072;
                if (i45 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c1086gP.c(z13)) {
                        i46 = 8388608;
                    } else {
                        i46 = 4194304;
                    }
                    i34 |= i46;
                }
                if ((i13 & 100663296) != 0) {
                    if ((i15 & 262144) == 0) {
                        i55 = 33554432;
                    } else {
                        i55 = 33554432;
                    }
                    i34 |= i55;
                }
                i47 = i15 & 524288;
                if (i47 != 0) {
                    i34 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c1086gP.h(i11)) {
                        i48 = 536870912;
                    } else {
                        i48 = 268435456;
                    }
                    i34 |= i48;
                }
                i49 = i15 & 1048576;
                if (i49 != 0) {
                    i50 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
                } else {
                    i50 = i14;
                }
                if ((i14 & 48) != 0) {
                    if ((i15 & 2097152) == 0) {
                        i57 = 32;
                    }
                    i50 |= i57;
                }
                if ((i14 & 384) != 0) {
                    i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
                }
                int i611118 = i50;
                if ((i58 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults11111115 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults11111116 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    } else {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults11111117 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults11111118 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    }
                    c1086gP.U();
                    c1086gP.L(-508515290);
                    if (kVar4 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar5 = kVar4;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-508509180);
                    jB = f11.b();
                    if (jB != 16) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                    } else {
                        zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                        if (z14) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            j = textFieldColorsC.f12346c;
                        } else {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            if (z16) {
                                j = textFieldColorsC.f12347d;
                            } else if (zBooleanValue) {
                                j = textFieldColorsC.f12344a;
                            } else {
                                j = textFieldColorsC.f12345b;
                            }
                        }
                        jB = j;
                    }
                    c1086gP.T(false);
                    final androidx.compose.ui.text.F fD110 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final androidx.compose.ui.h hVar113 = hVar2;
                    final boolean z211111118 = z16;
                    final TextFieldColors textFieldColors112 = textFieldColorsC;
                    final boolean z211111119 = z14;
                    final boolean z2111111110 = z15;
                    final androidx.compose.foundation.text.k kVar11116 = kVar3;
                    final androidx.compose.foundation.text.j jVar113 = jVar2;
                    final boolean z2111111111 = z17;
                    final int i611119 = i53;
                    final int i6111110 = i52;
                    final androidx.compose.ui.text.input.E e1112 = e11;
                    final androidx.compose.foundation.interaction.k kVar11117 = kVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111116 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111117 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111118 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111119 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111110 = pVar12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111 = pVar15;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111112 = pVar16;
                    final androidx.compose.ui.graphics.l0 l0Var113 = l0Var2;
                    CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar113, z211111118, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                TextFieldColors textFieldColors113 = textFieldColors112;
                                androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z211111118 ? textFieldColors113.j : textFieldColors113.f12352i);
                                final String str2 = str;
                                Ia.l<String, p293xa.r> lVar2 = lVar;
                                final boolean z2111111112 = z211111119;
                                boolean z2111111113 = z2111111110;
                                androidx.compose.ui.text.F f13 = fD110;
                                androidx.compose.foundation.text.k kVar11118 = kVar11116;
                                androidx.compose.foundation.text.j jVar114 = jVar113;
                                final boolean z2111111114 = z2111111111;
                                int i6111111 = i611119;
                                int i6111112 = i6111110;
                                final androidx.compose.ui.text.input.E e1113 = e1112;
                                final androidx.compose.foundation.interaction.k kVar11119 = kVar11117;
                                final boolean z2111111115 = z211111118;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar211111111111116;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar211111111111117;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar211111111111118;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar211111111111119;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar2111111111111110;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar2111111111111111;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar2111111111111112;
                                final androidx.compose.ui.graphics.l0 l0Var114 = l0Var113;
                                final TextFieldColors textFieldColors114 = textFieldColors112;
                                BasicTextFieldKt.b(str2, lVar2, hVarA, z2111111112, z2111111113, f13, kVar11118, jVar114, z2111111114, i6111111, i6111112, e1113, null, kVar11119, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue = num2.intValue();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                        }
                                        int i6111113 = iIntValue;
                                        if ((i6111113 & 19) == 18 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextFieldDefaults.f12369a.b(str2, pVar38, z2111111112, z2111111114, e1113, kVar11119, z2111111115, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var114, textFieldColors114, null, null, interfaceC1084f5, (i6111113 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    f12 = f11;
                    hVar3 = hVar2;
                    z18 = z16;
                    e12 = e11;
                    z19 = z14;
                    pVar17 = pVar8;
                    pVar18 = pVar16;
                    pVar19 = pVar11;
                    pVar20 = pVar12;
                    i54 = i53;
                    z20 = z15;
                    kVar6 = kVar3;
                    pVar21 = pVar10;
                    kVar7 = kVar4;
                    jVar3 = jVar2;
                    l0Var3 = l0Var2;
                    z21 = z17;
                    textFieldColors2 = textFieldColorsC;
                    pVar22 = pVar15;
                } else {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults11111119 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults111111110 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    } else {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults111111111 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults111111112 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    }
                    c1086gP.U();
                    c1086gP.L(-508515290);
                    if (kVar4 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar5 = kVar4;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-508509180);
                    jB = f11.b();
                    if (jB != 16) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                    } else {
                        zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                        if (z14) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            j = textFieldColorsC.f12346c;
                        } else {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            if (z16) {
                                j = textFieldColorsC.f12347d;
                            } else if (zBooleanValue) {
                                j = textFieldColorsC.f12344a;
                            } else {
                                j = textFieldColorsC.f12345b;
                            }
                        }
                        jB = j;
                    }
                    c1086gP.T(false);
                    final androidx.compose.ui.text.F fD111 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final androidx.compose.ui.h hVar114 = hVar2;
                    final boolean z2111111112 = z16;
                    final TextFieldColors textFieldColors113 = textFieldColorsC;
                    final boolean z2111111113 = z14;
                    final boolean z2111111114 = z15;
                    final androidx.compose.foundation.text.k kVar11118 = kVar3;
                    final androidx.compose.foundation.text.j jVar114 = jVar2;
                    final boolean z2111111115 = z17;
                    final int i6111111 = i53;
                    final int i6111112 = i52;
                    final androidx.compose.ui.text.input.E e1113 = e11;
                    final androidx.compose.foundation.interaction.k kVar11119 = kVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111113 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111114 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111115 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111116 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111117 = pVar12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111118 = pVar15;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111119 = pVar16;
                    final androidx.compose.ui.graphics.l0 l0Var114 = l0Var2;
                    CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar114, z2111111112, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                TextFieldColors textFieldColors114 = textFieldColors113;
                                androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z2111111112 ? textFieldColors114.j : textFieldColors114.f12352i);
                                final String str2 = str;
                                Ia.l<String, p293xa.r> lVar2 = lVar;
                                final boolean z2111111116 = z2111111113;
                                boolean z2111111117 = z2111111114;
                                androidx.compose.ui.text.F f13 = fD111;
                                androidx.compose.foundation.text.k kVar111110 = kVar11118;
                                androidx.compose.foundation.text.j jVar115 = jVar114;
                                final boolean z2111111118 = z2111111115;
                                int i6111113 = i6111111;
                                int i6111114 = i6111112;
                                final androidx.compose.ui.text.input.E e1114 = e1113;
                                final androidx.compose.foundation.interaction.k kVar111111 = kVar11119;
                                final boolean z2111111119 = z2111111112;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar2111111111111113;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar2111111111111114;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar2111111111111115;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar2111111111111116;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar2111111111111117;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar2111111111111118;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar2111111111111119;
                                final androidx.compose.ui.graphics.l0 l0Var115 = l0Var114;
                                final TextFieldColors textFieldColors115 = textFieldColors113;
                                BasicTextFieldKt.b(str2, lVar2, hVarA, z2111111116, z2111111117, f13, kVar111110, jVar115, z2111111118, i6111113, i6111114, e1114, null, kVar111111, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue = num2.intValue();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                        }
                                        int i6111115 = iIntValue;
                                        if ((i6111115 & 19) == 18 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextFieldDefaults.f12369a.b(str2, pVar38, z2111111116, z2111111118, e1114, kVar111111, z2111111119, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var115, textFieldColors115, null, null, interfaceC1084f5, (i6111115 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    f12 = f11;
                    hVar3 = hVar2;
                    z18 = z16;
                    e12 = e11;
                    z19 = z14;
                    pVar17 = pVar8;
                    pVar18 = pVar16;
                    pVar19 = pVar11;
                    pVar20 = pVar12;
                    i54 = i53;
                    z20 = z15;
                    kVar6 = kVar3;
                    pVar21 = pVar10;
                    kVar7 = kVar4;
                    jVar3 = jVar2;
                    l0Var3 = l0Var2;
                    z21 = z17;
                    textFieldColors2 = textFieldColorsC;
                    pVar22 = pVar15;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i34 |= 24576;
            i41 = i15 & 32768;
            if (i41 != 0) {
                i34 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (c1086gP.K(kVar)) {
                    i42 = 131072;
                } else {
                    i42 = 65536;
                }
                i34 |= i42;
            }
            i43 = i15 & 65536;
            if (i43 != 0) {
                i34 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c1086gP.K(jVar)) {
                    i44 = 1048576;
                } else {
                    i44 = 524288;
                }
                i34 |= i44;
            }
            i45 = i15 & 131072;
            if (i45 != 0) {
                i34 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c1086gP.c(z13)) {
                    i46 = 8388608;
                } else {
                    i46 = 4194304;
                }
                i34 |= i46;
            }
            if ((i13 & 100663296) != 0) {
                if ((i15 & 262144) == 0) {
                    i55 = 33554432;
                } else {
                    i55 = 33554432;
                }
                i34 |= i55;
            }
            i47 = i15 & 524288;
            if (i47 != 0) {
                i34 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c1086gP.h(i11)) {
                    i48 = 536870912;
                } else {
                    i48 = 268435456;
                }
                i34 |= i48;
            }
            i49 = i15 & 1048576;
            if (i49 != 0) {
                i50 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
            } else {
                i50 = i14;
            }
            if ((i14 & 48) != 0) {
                if ((i15 & 2097152) == 0) {
                    i57 = 32;
                }
                i50 |= i57;
            }
            if ((i14 & 384) != 0) {
                i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
            }
            int i6111113 = i50;
            if ((i58 & 306783379) != 306783378) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults111111113 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults111111114 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                } else {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults111111115 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults111111116 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                }
                c1086gP.U();
                c1086gP.L(-508515290);
                if (kVar4 == null) {
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar5 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    kVar5 = kVar4;
                }
                c1086gP.T(false);
                c1086gP.L(-508509180);
                jB = f11.b();
                if (jB != 16) {
                    pVar15 = pVar13;
                    pVar16 = pVar14;
                } else {
                    zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                    if (z14) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        j = textFieldColorsC.f12346c;
                    } else {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        if (z16) {
                            j = textFieldColorsC.f12347d;
                        } else if (zBooleanValue) {
                            j = textFieldColorsC.f12344a;
                        } else {
                            j = textFieldColorsC.f12345b;
                        }
                    }
                    jB = j;
                }
                c1086gP.T(false);
                final androidx.compose.ui.text.F fD112 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                final androidx.compose.ui.h hVar115 = hVar2;
                final boolean z2111111116 = z16;
                final TextFieldColors textFieldColors114 = textFieldColorsC;
                final boolean z2111111117 = z14;
                final boolean z2111111118 = z15;
                final androidx.compose.foundation.text.k kVar111110 = kVar3;
                final androidx.compose.foundation.text.j jVar115 = jVar2;
                final boolean z2111111119 = z17;
                final int i6111114 = i53;
                final int i6111115 = i52;
                final androidx.compose.ui.text.input.E e1114 = e11;
                final androidx.compose.foundation.interaction.k kVar111111 = kVar5;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111110 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111112 = pVar10;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111113 = pVar11;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111114 = pVar12;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111115 = pVar15;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111116 = pVar16;
                final androidx.compose.ui.graphics.l0 l0Var115 = l0Var2;
                CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                            androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar115, z2111111116, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                            TextFieldColors textFieldColors115 = textFieldColors114;
                            androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z2111111116 ? textFieldColors115.j : textFieldColors115.f12352i);
                            final String str2 = str;
                            Ia.l<String, p293xa.r> lVar2 = lVar;
                            final boolean z21111111110 = z2111111117;
                            boolean z21111111111 = z2111111118;
                            androidx.compose.ui.text.F f13 = fD112;
                            androidx.compose.foundation.text.k kVar111112 = kVar111110;
                            androidx.compose.foundation.text.j jVar116 = jVar115;
                            final boolean z21111111112 = z2111111119;
                            int i6111116 = i6111114;
                            int i6111117 = i6111115;
                            final androidx.compose.ui.text.input.E e1115 = e1114;
                            final androidx.compose.foundation.interaction.k kVar111113 = kVar111111;
                            final boolean z21111111113 = z2111111116;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar21111111111111110;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar21111111111111111;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar21111111111111112;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar21111111111111113;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar21111111111111114;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar21111111111111115;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar21111111111111116;
                            final androidx.compose.ui.graphics.l0 l0Var116 = l0Var115;
                            final TextFieldColors textFieldColors116 = textFieldColors114;
                            BasicTextFieldKt.b(str2, lVar2, hVarA, z21111111110, z21111111111, f13, kVar111112, jVar116, z21111111112, i6111116, i6111117, e1115, null, kVar111113, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue = num2.intValue();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                    }
                                    int i6111118 = iIntValue;
                                    if ((i6111118 & 19) == 18 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        TextFieldDefaults.f12369a.b(str2, pVar38, z21111111110, z21111111112, e1115, kVar111113, z21111111113, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var116, textFieldColors116, null, null, interfaceC1084f5, (i6111118 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                f12 = f11;
                hVar3 = hVar2;
                z18 = z16;
                e12 = e11;
                z19 = z14;
                pVar17 = pVar8;
                pVar18 = pVar16;
                pVar19 = pVar11;
                pVar20 = pVar12;
                i54 = i53;
                z20 = z15;
                kVar6 = kVar3;
                pVar21 = pVar10;
                kVar7 = kVar4;
                jVar3 = jVar2;
                l0Var3 = l0Var2;
                z21 = z17;
                textFieldColors2 = textFieldColorsC;
                pVar22 = pVar15;
            } else {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults111111117 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults111111118 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                } else {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults111111119 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults1111111110 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                }
                c1086gP.U();
                c1086gP.L(-508515290);
                if (kVar4 == null) {
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar5 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    kVar5 = kVar4;
                }
                c1086gP.T(false);
                c1086gP.L(-508509180);
                jB = f11.b();
                if (jB != 16) {
                    pVar15 = pVar13;
                    pVar16 = pVar14;
                } else {
                    zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                    if (z14) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        j = textFieldColorsC.f12346c;
                    } else {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        if (z16) {
                            j = textFieldColorsC.f12347d;
                        } else if (zBooleanValue) {
                            j = textFieldColorsC.f12344a;
                        } else {
                            j = textFieldColorsC.f12345b;
                        }
                    }
                    jB = j;
                }
                c1086gP.T(false);
                final androidx.compose.ui.text.F fD113 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                final androidx.compose.ui.h hVar116 = hVar2;
                final boolean z21111111110 = z16;
                final TextFieldColors textFieldColors115 = textFieldColorsC;
                final boolean z21111111111 = z14;
                final boolean z21111111112 = z15;
                final androidx.compose.foundation.text.k kVar111112 = kVar3;
                final androidx.compose.foundation.text.j jVar116 = jVar2;
                final boolean z21111111113 = z17;
                final int i6111116 = i53;
                final int i6111117 = i52;
                final androidx.compose.ui.text.input.E e1115 = e11;
                final androidx.compose.foundation.interaction.k kVar111113 = kVar5;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111117 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111118 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111119 = pVar10;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111110 = pVar11;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111111 = pVar12;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111112 = pVar15;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111113 = pVar16;
                final androidx.compose.ui.graphics.l0 l0Var116 = l0Var2;
                CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                            androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar116, z21111111110, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                            TextFieldColors textFieldColors116 = textFieldColors115;
                            androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z21111111110 ? textFieldColors116.j : textFieldColors116.f12352i);
                            final String str2 = str;
                            Ia.l<String, p293xa.r> lVar2 = lVar;
                            final boolean z21111111114 = z21111111111;
                            boolean z21111111115 = z21111111112;
                            androidx.compose.ui.text.F f13 = fD113;
                            androidx.compose.foundation.text.k kVar111114 = kVar111112;
                            androidx.compose.foundation.text.j jVar117 = jVar116;
                            final boolean z21111111116 = z21111111113;
                            int i6111118 = i6111116;
                            int i6111119 = i6111117;
                            final androidx.compose.ui.text.input.E e1116 = e1115;
                            final androidx.compose.foundation.interaction.k kVar111115 = kVar111113;
                            final boolean z21111111117 = z21111111110;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar21111111111111117;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar21111111111111118;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar21111111111111119;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar211111111111111110;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar211111111111111111;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar211111111111111112;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar211111111111111113;
                            final androidx.compose.ui.graphics.l0 l0Var117 = l0Var116;
                            final TextFieldColors textFieldColors117 = textFieldColors115;
                            BasicTextFieldKt.b(str2, lVar2, hVarA, z21111111114, z21111111115, f13, kVar111114, jVar117, z21111111116, i6111118, i6111119, e1116, null, kVar111115, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue = num2.intValue();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                    }
                                    int i61111110 = iIntValue;
                                    if ((i61111110 & 19) == 18 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        TextFieldDefaults.f12369a.b(str2, pVar38, z21111111114, z21111111116, e1116, kVar111115, z21111111117, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var117, textFieldColors117, null, null, interfaceC1084f5, (i61111110 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                f12 = f11;
                hVar3 = hVar2;
                z18 = z16;
                e12 = e11;
                z19 = z14;
                pVar17 = pVar8;
                pVar18 = pVar16;
                pVar19 = pVar11;
                pVar20 = pVar12;
                i54 = i53;
                z20 = z15;
                kVar6 = kVar3;
                pVar21 = pVar10;
                kVar7 = kVar4;
                jVar3 = jVar2;
                l0Var3 = l0Var2;
                z21 = z17;
                textFieldColors2 = textFieldColorsC;
                pVar22 = pVar15;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i58 |= 3072;
        i19 = i15 & 16;
        if (i19 != 0) {
            if ((i12 & 24576) == 0) {
                if (c1086gP.c(z11)) {
                    i20 = 16384;
                } else {
                    i20 = 8192;
                }
                i58 |= i20;
            }
            if ((i12 & 196608) != 0) {
                if ((i15 & 32) == 0) {
                    i56 = 65536;
                } else {
                    i56 = 65536;
                }
                i58 |= i56;
            }
            i21 = i15 & 64;
            if (i21 != 0) {
                i58 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c1086gP.k(pVar)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i58 |= i22;
            }
            i23 = i15 & 128;
            if (i23 != 0) {
                i58 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c1086gP.k(pVar2)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i58 |= i24;
            }
            i25 = i15 & 256;
            if (i25 != 0) {
                i58 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (c1086gP.k(pVar3)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i58 |= i26;
            }
            i27 = i15 & 512;
            if (i27 != 0) {
                i58 |= 805306368;
            } else if ((i12 & 805306368) == 0) {
                if (c1086gP.k(pVar4)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i58 |= i28;
            }
            i29 = i15 & 1024;
            if (i29 != 0) {
                i30 = i13 | 6;
            } else if ((i13 & 6) == 0) {
                if (c1086gP.k(pVar5)) {
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
            } else if ((i13 & 48) == 0) {
                if (c1086gP.k(pVar6)) {
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
            } else if ((i13 & 384) != 0) {
                if (c1086gP.k(pVar7)) {
                    i36 = 256;
                } else {
                    i36 = 128;
                }
                i34 |= i36;
            }
            i37 = i15 & 8192;
            if (i37 != 0) {
                i34 |= 3072;
            } else if ((i13 & 3072) != 0) {
                if (c1086gP.c(z12)) {
                    i38 = 2048;
                } else {
                    i38 = 1024;
                }
                i34 |= i38;
            }
            i39 = i15 & 16384;
            if (i39 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c1086gP.K(e10)) {
                        i40 = 16384;
                    } else {
                        i40 = 8192;
                    }
                    i34 |= i40;
                }
                i41 = i15 & 32768;
                if (i41 != 0) {
                    i34 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    if (c1086gP.K(kVar)) {
                        i42 = 131072;
                    } else {
                        i42 = 65536;
                    }
                    i34 |= i42;
                }
                i43 = i15 & 65536;
                if (i43 != 0) {
                    i34 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c1086gP.K(jVar)) {
                        i44 = 1048576;
                    } else {
                        i44 = 524288;
                    }
                    i34 |= i44;
                }
                i45 = i15 & 131072;
                if (i45 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c1086gP.c(z13)) {
                        i46 = 8388608;
                    } else {
                        i46 = 4194304;
                    }
                    i34 |= i46;
                }
                if ((i13 & 100663296) != 0) {
                    if ((i15 & 262144) == 0) {
                        i55 = 33554432;
                    } else {
                        i55 = 33554432;
                    }
                    i34 |= i55;
                }
                i47 = i15 & 524288;
                if (i47 != 0) {
                    i34 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c1086gP.h(i11)) {
                        i48 = 536870912;
                    } else {
                        i48 = 268435456;
                    }
                    i34 |= i48;
                }
                i49 = i15 & 1048576;
                if (i49 != 0) {
                    i50 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
                } else {
                    i50 = i14;
                }
                if ((i14 & 48) != 0) {
                    if ((i15 & 2097152) == 0) {
                        i57 = 32;
                    }
                    i50 |= i57;
                }
                if ((i14 & 384) != 0) {
                    i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
                }
                int i6111118 = i50;
                if ((i58 & 306783379) != 306783378) {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults1111111111 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults1111111112 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    } else {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults1111111113 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults1111111114 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    }
                    c1086gP.U();
                    c1086gP.L(-508515290);
                    if (kVar4 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar5 = kVar4;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-508509180);
                    jB = f11.b();
                    if (jB != 16) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                    } else {
                        zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                        if (z14) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            j = textFieldColorsC.f12346c;
                        } else {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            if (z16) {
                                j = textFieldColorsC.f12347d;
                            } else if (zBooleanValue) {
                                j = textFieldColorsC.f12344a;
                            } else {
                                j = textFieldColorsC.f12345b;
                            }
                        }
                        jB = j;
                    }
                    c1086gP.T(false);
                    final androidx.compose.ui.text.F fD114 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final androidx.compose.ui.h hVar117 = hVar2;
                    final boolean z21111111114 = z16;
                    final TextFieldColors textFieldColors116 = textFieldColorsC;
                    final boolean z21111111115 = z14;
                    final boolean z21111111116 = z15;
                    final androidx.compose.foundation.text.k kVar111114 = kVar3;
                    final androidx.compose.foundation.text.j jVar117 = jVar2;
                    final boolean z21111111117 = z17;
                    final int i6111119 = i53;
                    final int i61111110 = i52;
                    final androidx.compose.ui.text.input.E e1116 = e11;
                    final androidx.compose.foundation.interaction.k kVar111115 = kVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111114 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111115 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111116 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111117 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111118 = pVar12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111119 = pVar15;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111110 = pVar16;
                    final androidx.compose.ui.graphics.l0 l0Var117 = l0Var2;
                    CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar117, z21111111114, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                TextFieldColors textFieldColors117 = textFieldColors116;
                                androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z21111111114 ? textFieldColors117.j : textFieldColors117.f12352i);
                                final String str2 = str;
                                Ia.l<String, p293xa.r> lVar2 = lVar;
                                final boolean z21111111118 = z21111111115;
                                boolean z21111111119 = z21111111116;
                                androidx.compose.ui.text.F f13 = fD114;
                                androidx.compose.foundation.text.k kVar111116 = kVar111114;
                                androidx.compose.foundation.text.j jVar118 = jVar117;
                                final boolean z211111111110 = z21111111117;
                                int i61111111 = i6111119;
                                int i61111112 = i61111110;
                                final androidx.compose.ui.text.input.E e1117 = e1116;
                                final androidx.compose.foundation.interaction.k kVar111117 = kVar111115;
                                final boolean z211111111111 = z21111111114;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar211111111111111114;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar211111111111111115;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar211111111111111116;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar211111111111111117;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar211111111111111118;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar211111111111111119;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar2111111111111111110;
                                final androidx.compose.ui.graphics.l0 l0Var118 = l0Var117;
                                final TextFieldColors textFieldColors118 = textFieldColors116;
                                BasicTextFieldKt.b(str2, lVar2, hVarA, z21111111118, z21111111119, f13, kVar111116, jVar118, z211111111110, i61111111, i61111112, e1117, null, kVar111117, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue = num2.intValue();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                        }
                                        int i61111113 = iIntValue;
                                        if ((i61111113 & 19) == 18 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextFieldDefaults.f12369a.b(str2, pVar38, z21111111118, z211111111110, e1117, kVar111117, z211111111111, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var118, textFieldColors118, null, null, interfaceC1084f5, (i61111113 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    f12 = f11;
                    hVar3 = hVar2;
                    z18 = z16;
                    e12 = e11;
                    z19 = z14;
                    pVar17 = pVar8;
                    pVar18 = pVar16;
                    pVar19 = pVar11;
                    pVar20 = pVar12;
                    i54 = i53;
                    z20 = z15;
                    kVar6 = kVar3;
                    pVar21 = pVar10;
                    kVar7 = kVar4;
                    jVar3 = jVar2;
                    l0Var3 = l0Var2;
                    z21 = z17;
                    textFieldColors2 = textFieldColorsC;
                    pVar22 = pVar15;
                } else {
                    c1086gP.r0();
                    if ((i12 & 1) != 0) {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults1111111115 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults1111111116 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    } else {
                        if (i59 != 0) {
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
                            f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                        } else {
                            f11 = f10;
                        }
                        if (i21 != 0) {
                            pVar8 = null;
                        } else {
                            pVar8 = pVar;
                        }
                        if (i23 != 0) {
                            pVar9 = null;
                        } else {
                            pVar9 = pVar2;
                        }
                        if (i25 != 0) {
                            pVar10 = null;
                        } else {
                            pVar10 = pVar3;
                        }
                        if (i27 != 0) {
                            pVar11 = null;
                        } else {
                            pVar11 = pVar4;
                        }
                        if (i29 != 0) {
                            pVar12 = null;
                        } else {
                            pVar12 = pVar5;
                        }
                        if (i32 != 0) {
                            pVar13 = null;
                        } else {
                            pVar13 = pVar6;
                        }
                        if (i35 != 0) {
                            pVar14 = null;
                        } else {
                            pVar14 = pVar7;
                        }
                        if (i37 != 0) {
                            z16 = false;
                        } else {
                            z16 = z12;
                        }
                        if (i39 != 0) {
                            e11 = androidx.compose.ui.text.input.E.a.f15486a;
                        } else {
                            e11 = e10;
                        }
                        if (i41 != 0) {
                            kVar3 = androidx.compose.foundation.text.k.f11351g;
                        } else {
                            kVar3 = kVar;
                        }
                        if (i43 != 0) {
                            jVar2 = androidx.compose.foundation.text.j.f11344g;
                        } else {
                            jVar2 = jVar;
                        }
                        if (i45 != 0) {
                            z17 = false;
                        } else {
                            z17 = z13;
                        }
                        if ((i15 & 262144) == 0) {
                            i51 = i10;
                        } else if (z17) {
                            i51 = 1;
                        } else {
                            i51 = BrazeLogger.SUPPRESS;
                        }
                        if (i47 != 0) {
                            i52 = 1;
                        } else {
                            i52 = i11;
                        }
                        if (i49 == 0) {
                        }
                        if ((i15 & 2097152) != 0) {
                            TextFieldDefaults textFieldDefaults1111111117 = TextFieldDefaults.f12369a;
                            l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                        } else {
                            l0VarA = l0Var;
                        }
                        if ((i15 & 4194304) != 0) {
                            TextFieldDefaults textFieldDefaults1111111118 = TextFieldDefaults.f12369a;
                            textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            l0Var2 = l0VarA;
                            i53 = i51;
                            pVar10 = pVar10;
                        } else {
                            textFieldColorsC = textFieldColors;
                            l0Var2 = l0VarA;
                            i53 = i51;
                        }
                    }
                    c1086gP.U();
                    c1086gP.L(-508515290);
                    if (kVar4 == null) {
                        objF = c1086gP.f();
                        if (objF == InterfaceC1084f.a.f12980a) {
                            objF = new androidx.compose.foundation.interaction.l();
                            c1086gP.E(objF);
                        }
                        kVar5 = (androidx.compose.foundation.interaction.k) objF;
                    } else {
                        kVar5 = kVar4;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-508509180);
                    jB = f11.b();
                    if (jB != 16) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                    } else {
                        zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                        if (z14) {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            j = textFieldColorsC.f12346c;
                        } else {
                            pVar15 = pVar13;
                            pVar16 = pVar14;
                            if (z16) {
                                j = textFieldColorsC.f12347d;
                            } else if (zBooleanValue) {
                                j = textFieldColorsC.f12344a;
                            } else {
                                j = textFieldColorsC.f12345b;
                            }
                        }
                        jB = j;
                    }
                    c1086gP.T(false);
                    final androidx.compose.ui.text.F fD115 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                    final androidx.compose.ui.h hVar118 = hVar2;
                    final boolean z21111111118 = z16;
                    final TextFieldColors textFieldColors117 = textFieldColorsC;
                    final boolean z21111111119 = z14;
                    final boolean z211111111110 = z15;
                    final androidx.compose.foundation.text.k kVar111116 = kVar3;
                    final androidx.compose.foundation.text.j jVar118 = jVar2;
                    final boolean z211111111111 = z17;
                    final int i61111111 = i53;
                    final int i61111112 = i52;
                    final androidx.compose.ui.text.input.E e1117 = e11;
                    final androidx.compose.foundation.interaction.k kVar111117 = kVar5;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111111 = pVar8;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111112 = pVar9;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111113 = pVar10;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111114 = pVar11;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111115 = pVar12;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111116 = pVar15;
                    final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111117 = pVar16;
                    final androidx.compose.ui.graphics.l0 l0Var118 = l0Var2;
                    CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                                androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar118, z21111111118, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                                TextFieldColors textFieldColors118 = textFieldColors117;
                                androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z21111111118 ? textFieldColors118.j : textFieldColors118.f12352i);
                                final String str2 = str;
                                Ia.l<String, p293xa.r> lVar2 = lVar;
                                final boolean z211111111112 = z21111111119;
                                boolean z211111111113 = z211111111110;
                                androidx.compose.ui.text.F f13 = fD115;
                                androidx.compose.foundation.text.k kVar111118 = kVar111116;
                                androidx.compose.foundation.text.j jVar119 = jVar118;
                                final boolean z211111111114 = z211111111111;
                                int i61111113 = i61111111;
                                int i61111114 = i61111112;
                                final androidx.compose.ui.text.input.E e1118 = e1117;
                                final androidx.compose.foundation.interaction.k kVar111119 = kVar111117;
                                final boolean z211111111115 = z21111111118;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar2111111111111111111;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar2111111111111111112;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar2111111111111111113;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar2111111111111111114;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar2111111111111111115;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar2111111111111111116;
                                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar2111111111111111117;
                                final androidx.compose.ui.graphics.l0 l0Var119 = l0Var118;
                                final TextFieldColors textFieldColors119 = textFieldColors117;
                                BasicTextFieldKt.b(str2, lVar2, hVarA, z211111111112, z211111111113, f13, kVar111118, jVar119, z211111111114, i61111113, i61111114, e1118, null, kVar111119, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                    public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                        Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                        InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                        int iIntValue = num2.intValue();
                                        if ((iIntValue & 6) == 0) {
                                            iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                        }
                                        int i61111115 = iIntValue;
                                        if ((i61111115 & 19) == 18 && interfaceC1084f5.s()) {
                                            interfaceC1084f5.w();
                                        } else {
                                            TextFieldDefaults.f12369a.b(str2, pVar38, z211111111112, z211111111114, e1118, kVar111119, z211111111115, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var119, textFieldColors119, null, null, interfaceC1084f5, (i61111115 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                        }
                                        return p293xa.r.f47939a;
                                    }
                                }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                            }
                            return p293xa.r.f47939a;
                        }
                    }, c1086gP), c1086gP, 56);
                    f12 = f11;
                    hVar3 = hVar2;
                    z18 = z16;
                    e12 = e11;
                    z19 = z14;
                    pVar17 = pVar8;
                    pVar18 = pVar16;
                    pVar19 = pVar11;
                    pVar20 = pVar12;
                    i54 = i53;
                    z20 = z15;
                    kVar6 = kVar3;
                    pVar21 = pVar10;
                    kVar7 = kVar4;
                    jVar3 = jVar2;
                    l0Var3 = l0Var2;
                    z21 = z17;
                    textFieldColors2 = textFieldColorsC;
                    pVar22 = pVar15;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // Ia.p
                        public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            num.intValue();
                            TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                            return p293xa.r.f47939a;
                        }
                    };
                }
            }
            i34 |= 24576;
            i41 = i15 & 32768;
            if (i41 != 0) {
                i34 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (c1086gP.K(kVar)) {
                    i42 = 131072;
                } else {
                    i42 = 65536;
                }
                i34 |= i42;
            }
            i43 = i15 & 65536;
            if (i43 != 0) {
                i34 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c1086gP.K(jVar)) {
                    i44 = 1048576;
                } else {
                    i44 = 524288;
                }
                i34 |= i44;
            }
            i45 = i15 & 131072;
            if (i45 != 0) {
                i34 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c1086gP.c(z13)) {
                    i46 = 8388608;
                } else {
                    i46 = 4194304;
                }
                i34 |= i46;
            }
            if ((i13 & 100663296) != 0) {
                if ((i15 & 262144) == 0) {
                    i55 = 33554432;
                } else {
                    i55 = 33554432;
                }
                i34 |= i55;
            }
            i47 = i15 & 524288;
            if (i47 != 0) {
                i34 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c1086gP.h(i11)) {
                    i48 = 536870912;
                } else {
                    i48 = 268435456;
                }
                i34 |= i48;
            }
            i49 = i15 & 1048576;
            if (i49 != 0) {
                i50 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
            } else {
                i50 = i14;
            }
            if ((i14 & 48) != 0) {
                if ((i15 & 2097152) == 0) {
                    i57 = 32;
                }
                i50 |= i57;
            }
            if ((i14 & 384) != 0) {
                i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
            }
            int i61111113 = i50;
            if ((i58 & 306783379) != 306783378) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults1111111119 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults11111111110 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                } else {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults11111111111 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults11111111112 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                }
                c1086gP.U();
                c1086gP.L(-508515290);
                if (kVar4 == null) {
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar5 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    kVar5 = kVar4;
                }
                c1086gP.T(false);
                c1086gP.L(-508509180);
                jB = f11.b();
                if (jB != 16) {
                    pVar15 = pVar13;
                    pVar16 = pVar14;
                } else {
                    zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                    if (z14) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        j = textFieldColorsC.f12346c;
                    } else {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        if (z16) {
                            j = textFieldColorsC.f12347d;
                        } else if (zBooleanValue) {
                            j = textFieldColorsC.f12344a;
                        } else {
                            j = textFieldColorsC.f12345b;
                        }
                    }
                    jB = j;
                }
                c1086gP.T(false);
                final androidx.compose.ui.text.F fD116 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                final androidx.compose.ui.h hVar119 = hVar2;
                final boolean z211111111112 = z16;
                final TextFieldColors textFieldColors118 = textFieldColorsC;
                final boolean z211111111113 = z14;
                final boolean z211111111114 = z15;
                final androidx.compose.foundation.text.k kVar111118 = kVar3;
                final androidx.compose.foundation.text.j jVar119 = jVar2;
                final boolean z211111111115 = z17;
                final int i61111114 = i53;
                final int i61111115 = i52;
                final androidx.compose.ui.text.input.E e1118 = e11;
                final androidx.compose.foundation.interaction.k kVar111119 = kVar5;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111118 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111119 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111110 = pVar10;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111111 = pVar11;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111112 = pVar12;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111113 = pVar15;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111114 = pVar16;
                final androidx.compose.ui.graphics.l0 l0Var119 = l0Var2;
                CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                            androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar119, z211111111112, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                            TextFieldColors textFieldColors119 = textFieldColors118;
                            androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z211111111112 ? textFieldColors119.j : textFieldColors119.f12352i);
                            final String str2 = str;
                            Ia.l<String, p293xa.r> lVar2 = lVar;
                            final boolean z211111111116 = z211111111113;
                            boolean z211111111117 = z211111111114;
                            androidx.compose.ui.text.F f13 = fD116;
                            androidx.compose.foundation.text.k kVar1111110 = kVar111118;
                            androidx.compose.foundation.text.j jVar1110 = jVar119;
                            final boolean z211111111118 = z211111111115;
                            int i61111116 = i61111114;
                            int i61111117 = i61111115;
                            final androidx.compose.ui.text.input.E e1119 = e1118;
                            final androidx.compose.foundation.interaction.k kVar1111111 = kVar111119;
                            final boolean z211111111119 = z211111111112;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar2111111111111111118;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar2111111111111111119;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar21111111111111111110;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar21111111111111111111;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar21111111111111111112;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar21111111111111111113;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar21111111111111111114;
                            final androidx.compose.ui.graphics.l0 l0Var1110 = l0Var119;
                            final TextFieldColors textFieldColors1110 = textFieldColors118;
                            BasicTextFieldKt.b(str2, lVar2, hVarA, z211111111116, z211111111117, f13, kVar1111110, jVar1110, z211111111118, i61111116, i61111117, e1119, null, kVar1111111, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue = num2.intValue();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                    }
                                    int i61111118 = iIntValue;
                                    if ((i61111118 & 19) == 18 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        TextFieldDefaults.f12369a.b(str2, pVar38, z211111111116, z211111111118, e1119, kVar1111111, z211111111119, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var1110, textFieldColors1110, null, null, interfaceC1084f5, (i61111118 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                f12 = f11;
                hVar3 = hVar2;
                z18 = z16;
                e12 = e11;
                z19 = z14;
                pVar17 = pVar8;
                pVar18 = pVar16;
                pVar19 = pVar11;
                pVar20 = pVar12;
                i54 = i53;
                z20 = z15;
                kVar6 = kVar3;
                pVar21 = pVar10;
                kVar7 = kVar4;
                jVar3 = jVar2;
                l0Var3 = l0Var2;
                z21 = z17;
                textFieldColors2 = textFieldColorsC;
                pVar22 = pVar15;
            } else {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults11111111113 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults11111111114 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                } else {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults11111111115 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults11111111116 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                }
                c1086gP.U();
                c1086gP.L(-508515290);
                if (kVar4 == null) {
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar5 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    kVar5 = kVar4;
                }
                c1086gP.T(false);
                c1086gP.L(-508509180);
                jB = f11.b();
                if (jB != 16) {
                    pVar15 = pVar13;
                    pVar16 = pVar14;
                } else {
                    zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                    if (z14) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        j = textFieldColorsC.f12346c;
                    } else {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        if (z16) {
                            j = textFieldColorsC.f12347d;
                        } else if (zBooleanValue) {
                            j = textFieldColorsC.f12344a;
                        } else {
                            j = textFieldColorsC.f12345b;
                        }
                    }
                    jB = j;
                }
                c1086gP.T(false);
                final androidx.compose.ui.text.F fD117 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                final androidx.compose.ui.h hVar1110 = hVar2;
                final boolean z211111111116 = z16;
                final TextFieldColors textFieldColors119 = textFieldColorsC;
                final boolean z211111111117 = z14;
                final boolean z211111111118 = z15;
                final androidx.compose.foundation.text.k kVar1111110 = kVar3;
                final androidx.compose.foundation.text.j jVar1110 = jVar2;
                final boolean z211111111119 = z17;
                final int i61111116 = i53;
                final int i61111117 = i52;
                final androidx.compose.ui.text.input.E e1119 = e11;
                final androidx.compose.foundation.interaction.k kVar1111111 = kVar5;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111115 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111116 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111117 = pVar10;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111118 = pVar11;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111119 = pVar12;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111111110 = pVar15;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111111111 = pVar16;
                final androidx.compose.ui.graphics.l0 l0Var1110 = l0Var2;
                CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                            androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar1110, z211111111116, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                            TextFieldColors textFieldColors1110 = textFieldColors119;
                            androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z211111111116 ? textFieldColors1110.j : textFieldColors1110.f12352i);
                            final String str2 = str;
                            Ia.l<String, p293xa.r> lVar2 = lVar;
                            final boolean z2111111111110 = z211111111117;
                            boolean z2111111111111 = z211111111118;
                            androidx.compose.ui.text.F f13 = fD117;
                            androidx.compose.foundation.text.k kVar1111112 = kVar1111110;
                            androidx.compose.foundation.text.j jVar1111 = jVar1110;
                            final boolean z2111111111112 = z211111111119;
                            int i61111118 = i61111116;
                            int i61111119 = i61111117;
                            final androidx.compose.ui.text.input.E e11110 = e1119;
                            final androidx.compose.foundation.interaction.k kVar1111113 = kVar1111111;
                            final boolean z2111111111113 = z211111111116;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar21111111111111111115;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar21111111111111111116;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar21111111111111111117;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar21111111111111111118;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar21111111111111111119;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar211111111111111111110;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar211111111111111111111;
                            final androidx.compose.ui.graphics.l0 l0Var1111 = l0Var1110;
                            final TextFieldColors textFieldColors1111 = textFieldColors119;
                            BasicTextFieldKt.b(str2, lVar2, hVarA, z2111111111110, z2111111111111, f13, kVar1111112, jVar1111, z2111111111112, i61111118, i61111119, e11110, null, kVar1111113, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue = num2.intValue();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                    }
                                    int i611111110 = iIntValue;
                                    if ((i611111110 & 19) == 18 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        TextFieldDefaults.f12369a.b(str2, pVar38, z2111111111110, z2111111111112, e11110, kVar1111113, z2111111111113, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var1111, textFieldColors1111, null, null, interfaceC1084f5, (i611111110 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                f12 = f11;
                hVar3 = hVar2;
                z18 = z16;
                e12 = e11;
                z19 = z14;
                pVar17 = pVar8;
                pVar18 = pVar16;
                pVar19 = pVar11;
                pVar20 = pVar12;
                i54 = i53;
                z20 = z15;
                kVar6 = kVar3;
                pVar21 = pVar10;
                kVar7 = kVar4;
                jVar3 = jVar2;
                l0Var3 = l0Var2;
                z21 = z17;
                textFieldColors2 = textFieldColorsC;
                pVar22 = pVar15;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i58 |= 24576;
        if ((i12 & 196608) != 0) {
            if ((i15 & 32) == 0) {
                i56 = 65536;
            } else {
                i56 = 65536;
            }
            i58 |= i56;
        }
        i21 = i15 & 64;
        if (i21 != 0) {
            i58 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            if (c1086gP.k(pVar)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i58 |= i22;
        }
        i23 = i15 & 128;
        if (i23 != 0) {
            i58 |= 12582912;
        } else if ((i12 & 12582912) == 0) {
            if (c1086gP.k(pVar2)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i58 |= i24;
        }
        i25 = i15 & 256;
        if (i25 != 0) {
            i58 |= 100663296;
        } else if ((i12 & 100663296) == 0) {
            if (c1086gP.k(pVar3)) {
                i26 = 67108864;
            } else {
                i26 = 33554432;
            }
            i58 |= i26;
        }
        i27 = i15 & 512;
        if (i27 != 0) {
            i58 |= 805306368;
        } else if ((i12 & 805306368) == 0) {
            if (c1086gP.k(pVar4)) {
                i28 = 536870912;
            } else {
                i28 = 268435456;
            }
            i58 |= i28;
        }
        i29 = i15 & 1024;
        if (i29 != 0) {
            i30 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            if (c1086gP.k(pVar5)) {
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
        } else if ((i13 & 48) == 0) {
            if (c1086gP.k(pVar6)) {
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
        } else if ((i13 & 384) != 0) {
            if (c1086gP.k(pVar7)) {
                i36 = 256;
            } else {
                i36 = 128;
            }
            i34 |= i36;
        }
        i37 = i15 & 8192;
        if (i37 != 0) {
            i34 |= 3072;
        } else if ((i13 & 3072) != 0) {
            if (c1086gP.c(z12)) {
                i38 = 2048;
            } else {
                i38 = 1024;
            }
            i34 |= i38;
        }
        i39 = i15 & 16384;
        if (i39 != 0) {
            if ((i13 & 24576) == 0) {
                if (c1086gP.K(e10)) {
                    i40 = 16384;
                } else {
                    i40 = 8192;
                }
                i34 |= i40;
            }
            i41 = i15 & 32768;
            if (i41 != 0) {
                i34 |= 196608;
            } else if ((i13 & 196608) == 0) {
                if (c1086gP.K(kVar)) {
                    i42 = 131072;
                } else {
                    i42 = 65536;
                }
                i34 |= i42;
            }
            i43 = i15 & 65536;
            if (i43 != 0) {
                i34 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c1086gP.K(jVar)) {
                    i44 = 1048576;
                } else {
                    i44 = 524288;
                }
                i34 |= i44;
            }
            i45 = i15 & 131072;
            if (i45 != 0) {
                i34 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c1086gP.c(z13)) {
                    i46 = 8388608;
                } else {
                    i46 = 4194304;
                }
                i34 |= i46;
            }
            if ((i13 & 100663296) != 0) {
                if ((i15 & 262144) == 0) {
                    i55 = 33554432;
                } else {
                    i55 = 33554432;
                }
                i34 |= i55;
            }
            i47 = i15 & 524288;
            if (i47 != 0) {
                i34 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c1086gP.h(i11)) {
                    i48 = 536870912;
                } else {
                    i48 = 268435456;
                }
                i34 |= i48;
            }
            i49 = i15 & 1048576;
            if (i49 != 0) {
                i50 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
            } else {
                i50 = i14;
            }
            if ((i14 & 48) != 0) {
                if ((i15 & 2097152) == 0) {
                    i57 = 32;
                }
                i50 |= i57;
            }
            if ((i14 & 384) != 0) {
                i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
            }
            int i61111118 = i50;
            if ((i58 & 306783379) != 306783378) {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults11111111117 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults11111111118 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                } else {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults11111111119 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults111111111110 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                }
                c1086gP.U();
                c1086gP.L(-508515290);
                if (kVar4 == null) {
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar5 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    kVar5 = kVar4;
                }
                c1086gP.T(false);
                c1086gP.L(-508509180);
                jB = f11.b();
                if (jB != 16) {
                    pVar15 = pVar13;
                    pVar16 = pVar14;
                } else {
                    zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                    if (z14) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        j = textFieldColorsC.f12346c;
                    } else {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        if (z16) {
                            j = textFieldColorsC.f12347d;
                        } else if (zBooleanValue) {
                            j = textFieldColorsC.f12344a;
                        } else {
                            j = textFieldColorsC.f12345b;
                        }
                    }
                    jB = j;
                }
                c1086gP.T(false);
                final androidx.compose.ui.text.F fD118 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                final androidx.compose.ui.h hVar1111 = hVar2;
                final boolean z2111111111110 = z16;
                final TextFieldColors textFieldColors1110 = textFieldColorsC;
                final boolean z2111111111111 = z14;
                final boolean z2111111111112 = z15;
                final androidx.compose.foundation.text.k kVar1111112 = kVar3;
                final androidx.compose.foundation.text.j jVar1111 = jVar2;
                final boolean z2111111111113 = z17;
                final int i61111119 = i53;
                final int i611111110 = i52;
                final androidx.compose.ui.text.input.E e11110 = e11;
                final androidx.compose.foundation.interaction.k kVar1111113 = kVar5;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111111112 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111111113 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111111114 = pVar10;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111111115 = pVar11;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111111116 = pVar12;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111111117 = pVar15;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111111118 = pVar16;
                final androidx.compose.ui.graphics.l0 l0Var1111 = l0Var2;
                CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                            androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar1111, z2111111111110, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                            TextFieldColors textFieldColors1111 = textFieldColors1110;
                            androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z2111111111110 ? textFieldColors1111.j : textFieldColors1111.f12352i);
                            final String str2 = str;
                            Ia.l<String, p293xa.r> lVar2 = lVar;
                            final boolean z2111111111114 = z2111111111111;
                            boolean z2111111111115 = z2111111111112;
                            androidx.compose.ui.text.F f13 = fD118;
                            androidx.compose.foundation.text.k kVar1111114 = kVar1111112;
                            androidx.compose.foundation.text.j jVar1112 = jVar1111;
                            final boolean z2111111111116 = z2111111111113;
                            int i611111111 = i61111119;
                            int i611111112 = i611111110;
                            final androidx.compose.ui.text.input.E e11111 = e11110;
                            final androidx.compose.foundation.interaction.k kVar1111115 = kVar1111113;
                            final boolean z2111111111117 = z2111111111110;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar211111111111111111112;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar211111111111111111113;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar211111111111111111114;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar211111111111111111115;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar211111111111111111116;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar211111111111111111117;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar211111111111111111118;
                            final androidx.compose.ui.graphics.l0 l0Var1112 = l0Var1111;
                            final TextFieldColors textFieldColors1112 = textFieldColors1110;
                            BasicTextFieldKt.b(str2, lVar2, hVarA, z2111111111114, z2111111111115, f13, kVar1111114, jVar1112, z2111111111116, i611111111, i611111112, e11111, null, kVar1111115, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue = num2.intValue();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                    }
                                    int i611111113 = iIntValue;
                                    if ((i611111113 & 19) == 18 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        TextFieldDefaults.f12369a.b(str2, pVar38, z2111111111114, z2111111111116, e11111, kVar1111115, z2111111111117, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var1112, textFieldColors1112, null, null, interfaceC1084f5, (i611111113 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                f12 = f11;
                hVar3 = hVar2;
                z18 = z16;
                e12 = e11;
                z19 = z14;
                pVar17 = pVar8;
                pVar18 = pVar16;
                pVar19 = pVar11;
                pVar20 = pVar12;
                i54 = i53;
                z20 = z15;
                kVar6 = kVar3;
                pVar21 = pVar10;
                kVar7 = kVar4;
                jVar3 = jVar2;
                l0Var3 = l0Var2;
                z21 = z17;
                textFieldColors2 = textFieldColorsC;
                pVar22 = pVar15;
            } else {
                c1086gP.r0();
                if ((i12 & 1) != 0) {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults111111111111 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults111111111112 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                } else {
                    if (i59 != 0) {
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
                        f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                    } else {
                        f11 = f10;
                    }
                    if (i21 != 0) {
                        pVar8 = null;
                    } else {
                        pVar8 = pVar;
                    }
                    if (i23 != 0) {
                        pVar9 = null;
                    } else {
                        pVar9 = pVar2;
                    }
                    if (i25 != 0) {
                        pVar10 = null;
                    } else {
                        pVar10 = pVar3;
                    }
                    if (i27 != 0) {
                        pVar11 = null;
                    } else {
                        pVar11 = pVar4;
                    }
                    if (i29 != 0) {
                        pVar12 = null;
                    } else {
                        pVar12 = pVar5;
                    }
                    if (i32 != 0) {
                        pVar13 = null;
                    } else {
                        pVar13 = pVar6;
                    }
                    if (i35 != 0) {
                        pVar14 = null;
                    } else {
                        pVar14 = pVar7;
                    }
                    if (i37 != 0) {
                        z16 = false;
                    } else {
                        z16 = z12;
                    }
                    if (i39 != 0) {
                        e11 = androidx.compose.ui.text.input.E.a.f15486a;
                    } else {
                        e11 = e10;
                    }
                    if (i41 != 0) {
                        kVar3 = androidx.compose.foundation.text.k.f11351g;
                    } else {
                        kVar3 = kVar;
                    }
                    if (i43 != 0) {
                        jVar2 = androidx.compose.foundation.text.j.f11344g;
                    } else {
                        jVar2 = jVar;
                    }
                    if (i45 != 0) {
                        z17 = false;
                    } else {
                        z17 = z13;
                    }
                    if ((i15 & 262144) == 0) {
                        i51 = i10;
                    } else if (z17) {
                        i51 = 1;
                    } else {
                        i51 = BrazeLogger.SUPPRESS;
                    }
                    if (i47 != 0) {
                        i52 = 1;
                    } else {
                        i52 = i11;
                    }
                    if (i49 == 0) {
                    }
                    if ((i15 & 2097152) != 0) {
                        TextFieldDefaults textFieldDefaults111111111113 = TextFieldDefaults.f12369a;
                        l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                    } else {
                        l0VarA = l0Var;
                    }
                    if ((i15 & 4194304) != 0) {
                        TextFieldDefaults textFieldDefaults111111111114 = TextFieldDefaults.f12369a;
                        textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                        l0Var2 = l0VarA;
                        i53 = i51;
                        pVar10 = pVar10;
                    } else {
                        textFieldColorsC = textFieldColors;
                        l0Var2 = l0VarA;
                        i53 = i51;
                    }
                }
                c1086gP.U();
                c1086gP.L(-508515290);
                if (kVar4 == null) {
                    objF = c1086gP.f();
                    if (objF == InterfaceC1084f.a.f12980a) {
                        objF = new androidx.compose.foundation.interaction.l();
                        c1086gP.E(objF);
                    }
                    kVar5 = (androidx.compose.foundation.interaction.k) objF;
                } else {
                    kVar5 = kVar4;
                }
                c1086gP.T(false);
                c1086gP.L(-508509180);
                jB = f11.b();
                if (jB != 16) {
                    pVar15 = pVar13;
                    pVar16 = pVar14;
                } else {
                    zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                    if (z14) {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        j = textFieldColorsC.f12346c;
                    } else {
                        pVar15 = pVar13;
                        pVar16 = pVar14;
                        if (z16) {
                            j = textFieldColorsC.f12347d;
                        } else if (zBooleanValue) {
                            j = textFieldColorsC.f12344a;
                        } else {
                            j = textFieldColorsC.f12345b;
                        }
                    }
                    jB = j;
                }
                c1086gP.T(false);
                final androidx.compose.ui.text.F fD119 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
                final androidx.compose.ui.h hVar1112 = hVar2;
                final boolean z2111111111114 = z16;
                final TextFieldColors textFieldColors1111 = textFieldColorsC;
                final boolean z2111111111115 = z14;
                final boolean z2111111111116 = z15;
                final androidx.compose.foundation.text.k kVar1111114 = kVar3;
                final androidx.compose.foundation.text.j jVar1112 = jVar2;
                final boolean z2111111111117 = z17;
                final int i611111111 = i53;
                final int i611111112 = i52;
                final androidx.compose.ui.text.input.E e11111 = e11;
                final androidx.compose.foundation.interaction.k kVar1111115 = kVar5;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar211111111111111111119 = pVar8;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111111110 = pVar9;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111111111 = pVar10;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111111112 = pVar11;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111111113 = pVar12;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111111114 = pVar15;
                final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111111115 = pVar16;
                final androidx.compose.ui.graphics.l0 l0Var1112 = l0Var2;
                CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                            androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar1112, z2111111111114, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                            TextFieldColors textFieldColors1112 = textFieldColors1111;
                            androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z2111111111114 ? textFieldColors1112.j : textFieldColors1112.f12352i);
                            final String str2 = str;
                            Ia.l<String, p293xa.r> lVar2 = lVar;
                            final boolean z2111111111118 = z2111111111115;
                            boolean z2111111111119 = z2111111111116;
                            androidx.compose.ui.text.F f13 = fD119;
                            androidx.compose.foundation.text.k kVar1111116 = kVar1111114;
                            androidx.compose.foundation.text.j jVar1113 = jVar1112;
                            final boolean z21111111111110 = z2111111111117;
                            int i611111113 = i611111111;
                            int i611111114 = i611111112;
                            final androidx.compose.ui.text.input.E e11112 = e11111;
                            final androidx.compose.foundation.interaction.k kVar1111117 = kVar1111115;
                            final boolean z21111111111111 = z2111111111114;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar211111111111111111119;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar2111111111111111111110;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar2111111111111111111111;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar2111111111111111111112;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar2111111111111111111113;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar2111111111111111111114;
                            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar2111111111111111111115;
                            final androidx.compose.ui.graphics.l0 l0Var1113 = l0Var1112;
                            final TextFieldColors textFieldColors1113 = textFieldColors1111;
                            BasicTextFieldKt.b(str2, lVar2, hVarA, z2111111111118, z2111111111119, f13, kVar1111116, jVar1113, z21111111111110, i611111113, i611111114, e11112, null, kVar1111117, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                                public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                    Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                    InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                    int iIntValue = num2.intValue();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                    }
                                    int i611111115 = iIntValue;
                                    if ((i611111115 & 19) == 18 && interfaceC1084f5.s()) {
                                        interfaceC1084f5.w();
                                    } else {
                                        TextFieldDefaults.f12369a.b(str2, pVar38, z2111111111118, z21111111111110, e11112, kVar1111117, z21111111111111, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var1113, textFieldColors1113, null, null, interfaceC1084f5, (i611111115 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                    }
                                    return p293xa.r.f47939a;
                                }
                            }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                        }
                        return p293xa.r.f47939a;
                    }
                }, c1086gP), c1086gP, 56);
                f12 = f11;
                hVar3 = hVar2;
                z18 = z16;
                e12 = e11;
                z19 = z14;
                pVar17 = pVar8;
                pVar18 = pVar16;
                pVar19 = pVar11;
                pVar20 = pVar12;
                i54 = i53;
                z20 = z15;
                kVar6 = kVar3;
                pVar21 = pVar10;
                kVar7 = kVar4;
                jVar3 = jVar2;
                l0Var3 = l0Var2;
                z21 = z17;
                textFieldColors2 = textFieldColorsC;
                pVar22 = pVar15;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // Ia.p
                    public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        num.intValue();
                        TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                        return p293xa.r.f47939a;
                    }
                };
            }
        }
        i34 |= 24576;
        i41 = i15 & 32768;
        if (i41 != 0) {
            i34 |= 196608;
        } else if ((i13 & 196608) == 0) {
            if (c1086gP.K(kVar)) {
                i42 = 131072;
            } else {
                i42 = 65536;
            }
            i34 |= i42;
        }
        i43 = i15 & 65536;
        if (i43 != 0) {
            i34 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c1086gP.K(jVar)) {
                i44 = 1048576;
            } else {
                i44 = 524288;
            }
            i34 |= i44;
        }
        i45 = i15 & 131072;
        if (i45 != 0) {
            i34 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c1086gP.c(z13)) {
                i46 = 8388608;
            } else {
                i46 = 4194304;
            }
            i34 |= i46;
        }
        if ((i13 & 100663296) != 0) {
            if ((i15 & 262144) == 0) {
                i55 = 33554432;
            } else {
                i55 = 33554432;
            }
            i34 |= i55;
        }
        i47 = i15 & 524288;
        if (i47 != 0) {
            i34 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if (c1086gP.h(i11)) {
                i48 = 536870912;
            } else {
                i48 = 268435456;
            }
            i34 |= i48;
        }
        i49 = i15 & 1048576;
        if (i49 != 0) {
            i50 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i50 = i14 | (c1086gP.K(kVar2) ? 4 : 2);
        } else {
            i50 = i14;
        }
        if ((i14 & 48) != 0) {
            if ((i15 & 2097152) == 0) {
                i57 = 32;
            }
            i50 |= i57;
        }
        if ((i14 & 384) != 0) {
            i50 |= ((i15 & 4194304) == 0 || !c1086gP.K(textFieldColors)) ? 128 : 256;
        }
        int i611111113 = i50;
        if ((i58 & 306783379) != 306783378) {
            c1086gP.r0();
            if ((i12 & 1) != 0) {
                if (i59 != 0) {
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
                    f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                } else {
                    f11 = f10;
                }
                if (i21 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar;
                }
                if (i23 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar2;
                }
                if (i25 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar3;
                }
                if (i27 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i29 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar5;
                }
                if (i32 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar6;
                }
                if (i35 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar7;
                }
                if (i37 != 0) {
                    z16 = false;
                } else {
                    z16 = z12;
                }
                if (i39 != 0) {
                    e11 = androidx.compose.ui.text.input.E.a.f15486a;
                } else {
                    e11 = e10;
                }
                if (i41 != 0) {
                    kVar3 = androidx.compose.foundation.text.k.f11351g;
                } else {
                    kVar3 = kVar;
                }
                if (i43 != 0) {
                    jVar2 = androidx.compose.foundation.text.j.f11344g;
                } else {
                    jVar2 = jVar;
                }
                if (i45 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if ((i15 & 262144) == 0) {
                    i51 = i10;
                } else if (z17) {
                    i51 = 1;
                } else {
                    i51 = BrazeLogger.SUPPRESS;
                }
                if (i47 != 0) {
                    i52 = 1;
                } else {
                    i52 = i11;
                }
                if (i49 == 0) {
                }
                if ((i15 & 2097152) != 0) {
                    TextFieldDefaults textFieldDefaults111111111115 = TextFieldDefaults.f12369a;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                } else {
                    l0VarA = l0Var;
                }
                if ((i15 & 4194304) != 0) {
                    TextFieldDefaults textFieldDefaults111111111116 = TextFieldDefaults.f12369a;
                    textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                    l0Var2 = l0VarA;
                    i53 = i51;
                    pVar10 = pVar10;
                } else {
                    textFieldColorsC = textFieldColors;
                    l0Var2 = l0VarA;
                    i53 = i51;
                }
            } else {
                if (i59 != 0) {
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
                    f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                } else {
                    f11 = f10;
                }
                if (i21 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar;
                }
                if (i23 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar2;
                }
                if (i25 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar3;
                }
                if (i27 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i29 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar5;
                }
                if (i32 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar6;
                }
                if (i35 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar7;
                }
                if (i37 != 0) {
                    z16 = false;
                } else {
                    z16 = z12;
                }
                if (i39 != 0) {
                    e11 = androidx.compose.ui.text.input.E.a.f15486a;
                } else {
                    e11 = e10;
                }
                if (i41 != 0) {
                    kVar3 = androidx.compose.foundation.text.k.f11351g;
                } else {
                    kVar3 = kVar;
                }
                if (i43 != 0) {
                    jVar2 = androidx.compose.foundation.text.j.f11344g;
                } else {
                    jVar2 = jVar;
                }
                if (i45 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if ((i15 & 262144) == 0) {
                    i51 = i10;
                } else if (z17) {
                    i51 = 1;
                } else {
                    i51 = BrazeLogger.SUPPRESS;
                }
                if (i47 != 0) {
                    i52 = 1;
                } else {
                    i52 = i11;
                }
                if (i49 == 0) {
                }
                if ((i15 & 2097152) != 0) {
                    TextFieldDefaults textFieldDefaults111111111117 = TextFieldDefaults.f12369a;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                } else {
                    l0VarA = l0Var;
                }
                if ((i15 & 4194304) != 0) {
                    TextFieldDefaults textFieldDefaults111111111118 = TextFieldDefaults.f12369a;
                    textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                    l0Var2 = l0VarA;
                    i53 = i51;
                    pVar10 = pVar10;
                } else {
                    textFieldColorsC = textFieldColors;
                    l0Var2 = l0VarA;
                    i53 = i51;
                }
            }
            c1086gP.U();
            c1086gP.L(-508515290);
            if (kVar4 == null) {
                objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF);
                }
                kVar5 = (androidx.compose.foundation.interaction.k) objF;
            } else {
                kVar5 = kVar4;
            }
            c1086gP.T(false);
            c1086gP.L(-508509180);
            jB = f11.b();
            if (jB != 16) {
                pVar15 = pVar13;
                pVar16 = pVar14;
            } else {
                zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                if (z14) {
                    pVar15 = pVar13;
                    pVar16 = pVar14;
                    j = textFieldColorsC.f12346c;
                } else {
                    pVar15 = pVar13;
                    pVar16 = pVar14;
                    if (z16) {
                        j = textFieldColorsC.f12347d;
                    } else if (zBooleanValue) {
                        j = textFieldColorsC.f12344a;
                    } else {
                        j = textFieldColorsC.f12345b;
                    }
                }
                jB = j;
            }
            c1086gP.T(false);
            final androidx.compose.ui.text.F fD1110 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
            final androidx.compose.ui.h hVar1113 = hVar2;
            final boolean z2111111111118 = z16;
            final TextFieldColors textFieldColors1112 = textFieldColorsC;
            final boolean z2111111111119 = z14;
            final boolean z21111111111110 = z15;
            final androidx.compose.foundation.text.k kVar1111116 = kVar3;
            final androidx.compose.foundation.text.j jVar1113 = jVar2;
            final boolean z21111111111111 = z17;
            final int i611111114 = i53;
            final int i611111115 = i52;
            final androidx.compose.ui.text.input.E e11112 = e11;
            final androidx.compose.foundation.interaction.k kVar1111117 = kVar5;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111111116 = pVar8;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111111117 = pVar9;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111111118 = pVar10;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2111111111111111111119 = pVar11;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111111110 = pVar12;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111111111 = pVar15;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111111112 = pVar16;
            final androidx.compose.ui.graphics.l0 l0Var1113 = l0Var2;
            CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                        androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar1113, z2111111111118, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                        TextFieldColors textFieldColors1113 = textFieldColors1112;
                        androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z2111111111118 ? textFieldColors1113.j : textFieldColors1113.f12352i);
                        final String str2 = str;
                        Ia.l<String, p293xa.r> lVar2 = lVar;
                        final boolean z21111111111112 = z2111111111119;
                        boolean z21111111111113 = z21111111111110;
                        androidx.compose.ui.text.F f13 = fD1110;
                        androidx.compose.foundation.text.k kVar1111118 = kVar1111116;
                        androidx.compose.foundation.text.j jVar1114 = jVar1113;
                        final boolean z21111111111114 = z21111111111111;
                        int i611111116 = i611111114;
                        int i611111117 = i611111115;
                        final androidx.compose.ui.text.input.E e11113 = e11112;
                        final androidx.compose.foundation.interaction.k kVar1111119 = kVar1111117;
                        final boolean z21111111111115 = z2111111111118;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar2111111111111111111116;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar2111111111111111111117;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar2111111111111111111118;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar2111111111111111111119;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar21111111111111111111110;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar21111111111111111111111;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar21111111111111111111112;
                        final androidx.compose.ui.graphics.l0 l0Var1114 = l0Var1113;
                        final TextFieldColors textFieldColors1114 = textFieldColors1112;
                        BasicTextFieldKt.b(str2, lVar2, hVarA, z21111111111112, z21111111111113, f13, kVar1111118, jVar1114, z21111111111114, i611111116, i611111117, e11113, null, kVar1111119, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                            public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                int iIntValue = num2.intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                }
                                int i611111118 = iIntValue;
                                if ((i611111118 & 19) == 18 && interfaceC1084f5.s()) {
                                    interfaceC1084f5.w();
                                } else {
                                    TextFieldDefaults.f12369a.b(str2, pVar38, z21111111111112, z21111111111114, e11113, kVar1111119, z21111111111115, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var1114, textFieldColors1114, null, null, interfaceC1084f5, (i611111118 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 56);
            f12 = f11;
            hVar3 = hVar2;
            z18 = z16;
            e12 = e11;
            z19 = z14;
            pVar17 = pVar8;
            pVar18 = pVar16;
            pVar19 = pVar11;
            pVar20 = pVar12;
            i54 = i53;
            z20 = z15;
            kVar6 = kVar3;
            pVar21 = pVar10;
            kVar7 = kVar4;
            jVar3 = jVar2;
            l0Var3 = l0Var2;
            z21 = z17;
            textFieldColors2 = textFieldColorsC;
            pVar22 = pVar15;
        } else {
            c1086gP.r0();
            if ((i12 & 1) != 0) {
                if (i59 != 0) {
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
                    f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                } else {
                    f11 = f10;
                }
                if (i21 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar;
                }
                if (i23 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar2;
                }
                if (i25 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar3;
                }
                if (i27 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i29 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar5;
                }
                if (i32 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar6;
                }
                if (i35 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar7;
                }
                if (i37 != 0) {
                    z16 = false;
                } else {
                    z16 = z12;
                }
                if (i39 != 0) {
                    e11 = androidx.compose.ui.text.input.E.a.f15486a;
                } else {
                    e11 = e10;
                }
                if (i41 != 0) {
                    kVar3 = androidx.compose.foundation.text.k.f11351g;
                } else {
                    kVar3 = kVar;
                }
                if (i43 != 0) {
                    jVar2 = androidx.compose.foundation.text.j.f11344g;
                } else {
                    jVar2 = jVar;
                }
                if (i45 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if ((i15 & 262144) == 0) {
                    i51 = i10;
                } else if (z17) {
                    i51 = 1;
                } else {
                    i51 = BrazeLogger.SUPPRESS;
                }
                if (i47 != 0) {
                    i52 = 1;
                } else {
                    i52 = i11;
                }
                if (i49 == 0) {
                }
                if ((i15 & 2097152) != 0) {
                    TextFieldDefaults textFieldDefaults111111111119 = TextFieldDefaults.f12369a;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                } else {
                    l0VarA = l0Var;
                }
                if ((i15 & 4194304) != 0) {
                    TextFieldDefaults textFieldDefaults1111111111110 = TextFieldDefaults.f12369a;
                    textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                    l0Var2 = l0VarA;
                    i53 = i51;
                    pVar10 = pVar10;
                } else {
                    textFieldColorsC = textFieldColors;
                    l0Var2 = l0VarA;
                    i53 = i51;
                }
            } else {
                if (i59 != 0) {
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
                    f11 = (androidx.compose.ui.text.F) c1086gP.x(TextKt.f12383a);
                } else {
                    f11 = f10;
                }
                if (i21 != 0) {
                    pVar8 = null;
                } else {
                    pVar8 = pVar;
                }
                if (i23 != 0) {
                    pVar9 = null;
                } else {
                    pVar9 = pVar2;
                }
                if (i25 != 0) {
                    pVar10 = null;
                } else {
                    pVar10 = pVar3;
                }
                if (i27 != 0) {
                    pVar11 = null;
                } else {
                    pVar11 = pVar4;
                }
                if (i29 != 0) {
                    pVar12 = null;
                } else {
                    pVar12 = pVar5;
                }
                if (i32 != 0) {
                    pVar13 = null;
                } else {
                    pVar13 = pVar6;
                }
                if (i35 != 0) {
                    pVar14 = null;
                } else {
                    pVar14 = pVar7;
                }
                if (i37 != 0) {
                    z16 = false;
                } else {
                    z16 = z12;
                }
                if (i39 != 0) {
                    e11 = androidx.compose.ui.text.input.E.a.f15486a;
                } else {
                    e11 = e10;
                }
                if (i41 != 0) {
                    kVar3 = androidx.compose.foundation.text.k.f11351g;
                } else {
                    kVar3 = kVar;
                }
                if (i43 != 0) {
                    jVar2 = androidx.compose.foundation.text.j.f11344g;
                } else {
                    jVar2 = jVar;
                }
                if (i45 != 0) {
                    z17 = false;
                } else {
                    z17 = z13;
                }
                if ((i15 & 262144) == 0) {
                    i51 = i10;
                } else if (z17) {
                    i51 = 1;
                } else {
                    i51 = BrazeLogger.SUPPRESS;
                }
                if (i47 != 0) {
                    i52 = 1;
                } else {
                    i52 = i11;
                }
                if (i49 == 0) {
                }
                if ((i15 & 2097152) != 0) {
                    TextFieldDefaults textFieldDefaults1111111111111 = TextFieldDefaults.f12369a;
                    l0VarA = ShapesKt.a(ShapeKeyTokens.f12737e, c1086gP);
                } else {
                    l0VarA = l0Var;
                }
                if ((i15 & 4194304) != 0) {
                    TextFieldDefaults textFieldDefaults1111111111112 = TextFieldDefaults.f12369a;
                    textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                    l0Var2 = l0VarA;
                    i53 = i51;
                    pVar10 = pVar10;
                } else {
                    textFieldColorsC = textFieldColors;
                    l0Var2 = l0VarA;
                    i53 = i51;
                }
            }
            c1086gP.U();
            c1086gP.L(-508515290);
            if (kVar4 == null) {
                objF = c1086gP.f();
                if (objF == InterfaceC1084f.a.f12980a) {
                    objF = new androidx.compose.foundation.interaction.l();
                    c1086gP.E(objF);
                }
                kVar5 = (androidx.compose.foundation.interaction.k) objF;
            } else {
                kVar5 = kVar4;
            }
            c1086gP.T(false);
            c1086gP.L(-508509180);
            jB = f11.b();
            if (jB != 16) {
                pVar15 = pVar13;
                pVar16 = pVar14;
            } else {
                zBooleanValue = ((Boolean) androidx.compose.foundation.interaction.f.a(kVar5, c1086gP, 0).getValue()).booleanValue();
                if (z14) {
                    pVar15 = pVar13;
                    pVar16 = pVar14;
                    j = textFieldColorsC.f12346c;
                } else {
                    pVar15 = pVar13;
                    pVar16 = pVar14;
                    if (z16) {
                        j = textFieldColorsC.f12347d;
                    } else if (zBooleanValue) {
                        j = textFieldColorsC.f12344a;
                    } else {
                        j = textFieldColorsC.f12345b;
                    }
                }
                jB = j;
            }
            c1086gP.T(false);
            final androidx.compose.ui.text.F fD1111 = f11.d(new androidx.compose.ui.text.F(jB, 0L, null, 0L, 0, 0L, 16777214));
            final androidx.compose.ui.h hVar1114 = hVar2;
            final boolean z21111111111112 = z16;
            final TextFieldColors textFieldColors1113 = textFieldColorsC;
            final boolean z21111111111113 = z14;
            final boolean z21111111111114 = z15;
            final androidx.compose.foundation.text.k kVar1111118 = kVar3;
            final androidx.compose.foundation.text.j jVar1114 = jVar2;
            final boolean z21111111111115 = z17;
            final int i611111116 = i53;
            final int i611111117 = i52;
            final androidx.compose.ui.text.input.E e11113 = e11;
            final androidx.compose.foundation.interaction.k kVar1111119 = kVar5;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111111113 = pVar8;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111111114 = pVar9;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111111115 = pVar10;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111111116 = pVar11;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111111117 = pVar12;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111111118 = pVar15;
            final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar21111111111111111111119 = pVar16;
            final androidx.compose.ui.graphics.l0 l0Var1114 = l0Var2;
            CompositionLocalKt.a(TextSelectionColorsKt.f11582a.b(textFieldColorsC.f12353k), androidx.compose.runtime.internal.a.b(1859145987, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1
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
                        androidx.compose.ui.h hVarA = androidx.compose.foundation.layout.W.a(TextFieldDefaults.f12371c, TextFieldDefaults.f12370b, TextFieldImplKt.e(hVar1114, z21111111111112, com.voltasit.obdeleven.domain.usecases.device.v.g(interfaceC1084f3, R.string.default_error_message)));
                        TextFieldColors textFieldColors1114 = textFieldColors1113;
                        androidx.compose.ui.graphics.m0 m0Var = new androidx.compose.ui.graphics.m0(z21111111111112 ? textFieldColors1114.j : textFieldColors1114.f12352i);
                        final String str2 = str;
                        Ia.l<String, p293xa.r> lVar2 = lVar;
                        final boolean z21111111111116 = z21111111111113;
                        boolean z21111111111117 = z21111111111114;
                        androidx.compose.ui.text.F f13 = fD1111;
                        androidx.compose.foundation.text.k kVar11111110 = kVar1111118;
                        androidx.compose.foundation.text.j jVar1115 = jVar1114;
                        final boolean z21111111111118 = z21111111111115;
                        int i611111118 = i611111116;
                        int i611111119 = i611111117;
                        final androidx.compose.ui.text.input.E e11114 = e11113;
                        final androidx.compose.foundation.interaction.k kVar11111111 = kVar1111119;
                        final boolean z21111111111119 = z21111111111112;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar30 = pVar21111111111111111111113;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar31 = pVar21111111111111111111114;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar32 = pVar21111111111111111111115;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar33 = pVar21111111111111111111116;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar34 = pVar21111111111111111111117;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar35 = pVar21111111111111111111118;
                        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar36 = pVar21111111111111111111119;
                        final androidx.compose.ui.graphics.l0 l0Var1115 = l0Var1114;
                        final TextFieldColors textFieldColors1115 = textFieldColors1113;
                        BasicTextFieldKt.b(str2, lVar2, hVarA, z21111111111116, z21111111111117, f13, kVar11111110, jVar1115, z21111111111118, i611111118, i611111119, e11114, null, kVar11111111, m0Var, androidx.compose.runtime.internal.a.b(-288211827, new Ia.q<Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r>, InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$1.1
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
                            public final p293xa.r invoke(Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar37, InterfaceC1084f interfaceC1084f4, Integer num2) {
                                Ia.p<? super InterfaceC1084f, ? super Integer, ? extends p293xa.r> pVar38 = pVar37;
                                InterfaceC1084f interfaceC1084f5 = interfaceC1084f4;
                                int iIntValue = num2.intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= interfaceC1084f5.k(pVar38) ? 4 : 2;
                                }
                                int i6111111110 = iIntValue;
                                if ((i6111111110 & 19) == 18 && interfaceC1084f5.s()) {
                                    interfaceC1084f5.w();
                                } else {
                                    TextFieldDefaults.f12369a.b(str2, pVar38, z21111111111116, z21111111111118, e11114, kVar11111111, z21111111111119, pVar30, pVar31, pVar32, pVar33, pVar34, pVar35, pVar36, l0Var1115, textFieldColors1115, null, null, interfaceC1084f5, (i6111111110 << 3) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 100663296, 196608);
                                }
                                return p293xa.r.f47939a;
                            }
                        }, interfaceC1084f3), interfaceC1084f3, 0, 196608, 4096);
                    }
                    return p293xa.r.f47939a;
                }
            }, c1086gP), c1086gP, 56);
            f12 = f11;
            hVar3 = hVar2;
            z18 = z16;
            e12 = e11;
            z19 = z14;
            pVar17 = pVar8;
            pVar18 = pVar16;
            pVar19 = pVar11;
            pVar20 = pVar12;
            i54 = i53;
            z20 = z15;
            kVar6 = kVar3;
            pVar21 = pVar10;
            kVar7 = kVar4;
            jVar3 = jVar2;
            l0Var3 = l0Var2;
            z21 = z17;
            textFieldColors2 = textFieldColorsC;
            pVar22 = pVar15;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextField$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TextFieldKt.a(str, lVar, hVar3, z19, z20, f12, pVar17, pVar9, pVar21, pVar19, pVar20, pVar22, pVar18, z18, e12, kVar6, jVar3, z21, i54, i52, kVar7, l0Var3, textFieldColors2, interfaceC1084f2, L4.b.l(i12 | 1), L4.b.l(i13), L4.b.l(i14), i15);
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    public static final void b(final androidx.compose.ui.h hVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2, final Ia.q<? super androidx.compose.ui.h, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar3, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar6, final boolean z10, final float f10, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7, final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8, final androidx.compose.foundation.layout.L l10, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.foundation.layout.L l11;
        boolean z11;
        C1086g c1086gP = interfaceC1084f.p(-1830307184);
        if ((i10 & 6) == 0) {
            i12 = (c1086gP.K(hVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c1086gP.k(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c1086gP.k(pVar2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c1086gP.k(qVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c1086gP.k(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= c1086gP.k(pVar4) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= c1086gP.k(pVar5) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= c1086gP.k(pVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= c1086gP.c(z10) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i12 |= c1086gP.g(f10) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c1086gP.k(pVar7) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c1086gP.k(pVar8) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            l11 = l10;
            i13 |= c1086gP.K(l11) ? 256 : 128;
        } else {
            l11 = l10;
        }
        if ((i12 & 306783379) == 306783378 && (i13 & 147) == 146 && c1086gP.s()) {
            c1086gP.w();
        } else {
            boolean z12 = ((234881024 & i12) == 67108864) | ((1879048192 & i12) == 536870912) | ((i13 & 896) == 256);
            Object objF = c1086gP.f();
            if (z12 || objF == InterfaceC1084f.a.f12980a) {
                objF = new TextFieldMeasurePolicy(z10, f10, l11);
                c1086gP.E(objF);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objF;
            LayoutDirection layoutDirection = (LayoutDirection) c1086gP.x(CompositionLocalsKt.f14852n);
            int i14 = c1086gP.f12996P;
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
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar9 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar9, c1086gP, textFieldMeasurePolicy);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar10 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar10, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar11 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar11);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar12 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar12, c1086gP, hVarC);
            pVar7.invoke(c1086gP, Integer.valueOf(i13 & 14));
            c1086gP.L(1341517187);
            androidx.compose.ui.f fVar = androidx.compose.ui.d.a.f13339e;
            androidx.compose.ui.h.a aVar2 = androidx.compose.ui.h.a.f13984b;
            if (pVar3 != null) {
                androidx.compose.ui.h hVarI = C1171q.b(aVar2, "Leading").i(TextFieldImplKt.f12505i);
                androidx.compose.ui.layout.E eD = BoxKt.d(fVar, false);
                int i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarI);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar9, c1086gP, eD);
                R0.a(pVar10, c1086gP, interfaceC1089h0P2);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                    J4.i.d(i15, c1086gP, i15, pVar11);
                }
                R0.a(pVar12, c1086gP, hVarC2);
                C7.g.b((i12 >> 12) & 14, pVar3, c1086gP, true);
            }
            ?? r10 = 0;
            c1086gP.T(false);
            c1086gP.L(1341526310);
            if (pVar4 != null) {
                androidx.compose.ui.h hVarI2 = C1171q.b(aVar2, "Trailing").i(TextFieldImplKt.f12505i);
                androidx.compose.ui.layout.E eD2 = BoxKt.d(fVar, false);
                int i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarI2);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar9, c1086gP, eD2);
                R0.a(pVar10, c1086gP, interfaceC1089h0P3);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
                    J4.i.d(i16, c1086gP, i16, pVar11);
                }
                R0.a(pVar12, c1086gP, hVarC3);
                C7.g.b((i12 >> 15) & 14, pVar4, c1086gP, true);
                r10 = 0;
            }
            c1086gP.T(r10);
            float fD = PaddingKt.d(l10, layoutDirection);
            float fC = PaddingKt.c(l10, layoutDirection);
            if (pVar3 != null) {
                fD = Na.l.x(fD - TextFieldImplKt.f12499c, (float) r10);
            }
            if (pVar4 != null) {
                fC = Na.l.x(fC - TextFieldImplKt.f12499c, (float) r10);
            }
            c1086gP.L(1341556924);
            androidx.compose.ui.f fVar2 = androidx.compose.ui.d.a.f13335a;
            if (pVar5 != null) {
                androidx.compose.ui.h hVarJ = PaddingKt.j(androidx.compose.foundation.layout.W.s(androidx.compose.foundation.layout.W.g(C1171q.b(aVar2, "Prefix"), TextFieldImplKt.f12502f, 0.0f, 2)), fD, 0.0f, TextFieldImplKt.f12501e, 0.0f, 10);
                androidx.compose.ui.layout.E eD3 = BoxKt.d(fVar2, false);
                int i17 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarJ);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar9, c1086gP, eD3);
                R0.a(pVar10, c1086gP, interfaceC1089h0P4);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i17))) {
                    J4.i.d(i17, c1086gP, i17, pVar11);
                }
                R0.a(pVar12, c1086gP, hVarC4);
                C7.g.b((i12 >> 18) & 14, pVar5, c1086gP, true);
            }
            c1086gP.T(false);
            c1086gP.L(1341568890);
            if (pVar6 != null) {
                androidx.compose.ui.h hVarJ2 = PaddingKt.j(androidx.compose.foundation.layout.W.s(androidx.compose.foundation.layout.W.g(C1171q.b(aVar2, "Suffix"), TextFieldImplKt.f12502f, 0.0f, 2)), TextFieldImplKt.f12501e, 0.0f, fC, 0.0f, 10);
                androidx.compose.ui.layout.E eD4 = BoxKt.d(fVar2, false);
                int i18 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarJ2);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar9, c1086gP, eD4);
                R0.a(pVar10, c1086gP, interfaceC1089h0P5);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i18))) {
                    J4.i.d(i18, c1086gP, i18, pVar11);
                }
                R0.a(pVar12, c1086gP, hVarC5);
                C7.g.b((i12 >> 21) & 14, pVar6, c1086gP, true);
            }
            c1086gP.T(false);
            c1086gP.L(1341581092);
            if (pVar2 != null) {
                androidx.compose.ui.h hVarJ3 = PaddingKt.j(androidx.compose.foundation.layout.W.s(androidx.compose.foundation.layout.W.g(C1171q.b(aVar2, "Label"), D9.o.n(TextFieldImplKt.f12502f, TextFieldImplKt.f12503g, f10), 0.0f, 2)), fD, 0.0f, fC, 0.0f, 10);
                androidx.compose.ui.layout.E eD5 = BoxKt.d(fVar2, false);
                int i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarJ3);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar9, c1086gP, eD5);
                R0.a(pVar10, c1086gP, interfaceC1089h0P6);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i19))) {
                    J4.i.d(i19, c1086gP, i19, pVar11);
                }
                R0.a(pVar12, c1086gP, hVarC6);
                C7.g.b((i12 >> 6) & 14, pVar2, c1086gP, true);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarJ4 = PaddingKt.j(androidx.compose.foundation.layout.W.s(androidx.compose.foundation.layout.W.g(aVar2, TextFieldImplKt.f12502f, 0.0f, 2)), pVar5 == null ? fD : 0, 0.0f, pVar6 == null ? fC : 0, 0.0f, 10);
            c1086gP.L(1341611627);
            if (qVar != null) {
                qVar.invoke(C1171q.b(aVar2, "Hint").i(hVarJ4), c1086gP, Integer.valueOf((i12 >> 6) & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarI3 = C1171q.b(aVar2, "TextField").i(hVarJ4);
            androidx.compose.ui.layout.E eD6 = BoxKt.d(fVar2, true);
            int i20 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
            androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarI3);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar);
            } else {
                c1086gP.A();
            }
            R0.a(pVar9, c1086gP, eD6);
            R0.a(pVar10, c1086gP, interfaceC1089h0P7);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i20))) {
                J4.i.d(i20, c1086gP, i20, pVar11);
            }
            R0.a(pVar12, c1086gP, hVarC7);
            pVar.invoke(c1086gP, Integer.valueOf((i12 >> 3) & 14));
            c1086gP.T(true);
            c1086gP.L(1341622624);
            if (pVar8 != null) {
                androidx.compose.ui.h hVarE = PaddingKt.e(androidx.compose.foundation.layout.W.s(androidx.compose.foundation.layout.W.g(C1171q.b(aVar2, "Supporting"), TextFieldImplKt.f12504h, 0.0f, 2)), TextFieldDefaults.f());
                androidx.compose.ui.layout.E eD7 = BoxKt.d(fVar2, false);
                int i21 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarE);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar9, c1086gP, eD7);
                R0.a(pVar10, c1086gP, interfaceC1089h0P8);
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i21))) {
                    J4.i.d(i21, c1086gP, i21, pVar11);
                }
                R0.a(pVar12, c1086gP, hVarC8);
                z11 = true;
                C7.g.b((i13 >> 3) & 14, pVar8, c1086gP, true);
            } else {
                z11 = true;
            }
            c1086gP.T(false);
            c1086gP.T(z11);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.TextFieldKt$TextFieldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    TextFieldKt.b(hVar, pVar, pVar2, qVar, pVar3, pVar4, pVar5, pVar6, z10, f10, pVar7, pVar8, l10, interfaceC1084f2, L4.b.l(i10 | 1), L4.b.l(i11));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    public static final int c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, long j, float f11, androidx.compose.foundation.layout.L l10) {
        boolean z10 = i11 > 0;
        float fA = (l10.a() + l10.d()) * f11;
        if (z10) {
            fA = D9.o.n(TextFieldImplKt.f12498b * 2 * f11, fA, f10);
        }
        int[] iArr = {i16, i14, i15, D9.o.o(f10, i11, 0)};
        for (int i18 = 0; i18 < 4; i18++) {
            i10 = Math.max(i10, iArr[i18]);
        }
        return Math.max(p013b0.a.i(j), Math.max(i12, Math.max(i13, Ka.a.b(fA + D9.o.o(f10, 0, i11) + i10))) + i17);
    }

    public static final int d(boolean z10, int i10, int i11, androidx.compose.ui.layout.Y y10) {
        if (!z10) {
            return i11;
        }
        return C1293h.f(1, 0.0f, (i10 - y10.f14221c) / 2.0f);
    }
}
