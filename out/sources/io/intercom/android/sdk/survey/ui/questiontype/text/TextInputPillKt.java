package io.intercom.android.sdk.survey.ui.questiontype.text;

import Ia.p;
import androidx.compose.foundation.C0935g;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.foundation.text.InterfaceC1000i;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.graphics.H;
import io.intercom.android.sdk.m5.components.C2270b;
import io.intercom.android.sdk.m5.components.C2272c;
import io.intercom.android.sdk.m5.components.C2274d;
import io.intercom.android.sdk.m5.components.C2282h;
import io.intercom.android.sdk.m5.components.J;
import io.intercom.android.sdk.m5.conversation.ui.C2326c;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: TextInputPill.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TextInputPillKt {
    /* JADX WARN: Code duplicated, block: B:100:0x013b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0143  */
    /* JADX WARN: Code duplicated, block: B:104:0x0149  */
    /* JADX WARN: Code duplicated, block: B:105:0x014c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0153  */
    /* JADX WARN: Code duplicated, block: B:110:0x015a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0160  */
    /* JADX WARN: Code duplicated, block: B:114:0x0166  */
    /* JADX WARN: Code duplicated, block: B:116:0x016b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0172  */
    /* JADX WARN: Code duplicated, block: B:121:0x0177  */
    /* JADX WARN: Code duplicated, block: B:123:0x017d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0183  */
    /* JADX WARN: Code duplicated, block: B:126:0x0186  */
    /* JADX WARN: Code duplicated, block: B:130:0x018f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0196  */
    /* JADX WARN: Code duplicated, block: B:135:0x019a  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:148:0x01be  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:159:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:161:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:162:0x0201  */
    /* JADX WARN: Code duplicated, block: B:164:0x0205  */
    /* JADX WARN: Code duplicated, block: B:165:0x0207  */
    /* JADX WARN: Code duplicated, block: B:167:0x020b  */
    /* JADX WARN: Code duplicated, block: B:168:0x020d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0211  */
    /* JADX WARN: Code duplicated, block: B:171:0x0217  */
    /* JADX WARN: Code duplicated, block: B:174:0x021c  */
    /* JADX WARN: Code duplicated, block: B:175:0x021f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0223  */
    /* JADX WARN: Code duplicated, block: B:178:0x022b  */
    /* JADX WARN: Code duplicated, block: B:180:0x022f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0231  */
    /* JADX WARN: Code duplicated, block: B:183:0x0235  */
    /* JADX WARN: Code duplicated, block: B:184:0x0237  */
    /* JADX WARN: Code duplicated, block: B:186:0x023b  */
    /* JADX WARN: Code duplicated, block: B:187:0x023d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0241  */
    /* JADX WARN: Code duplicated, block: B:190:0x0244  */
    /* JADX WARN: Code duplicated, block: B:192:0x0248  */
    /* JADX WARN: Code duplicated, block: B:193:0x024b  */
    /* JADX WARN: Code duplicated, block: B:195:0x024f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0253  */
    /* JADX WARN: Code duplicated, block: B:199:0x025d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0271  */
    /* JADX WARN: Code duplicated, block: B:203:0x0284  */
    /* JADX WARN: Code duplicated, block: B:206:0x0297  */
    /* JADX WARN: Code duplicated, block: B:210:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:82:0x0109  */
    /* JADX WARN: Code duplicated, block: B:83:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0116  */
    /* JADX WARN: Code duplicated, block: B:88:0x011d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0123  */
    /* JADX WARN: Code duplicated, block: B:92:0x0129  */
    /* JADX WARN: Code duplicated, block: B:93:0x012c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0134  */
    /* JADX INFO: renamed from: TextInputPill-g5ZjG94, reason: not valid java name */
    public static final void m457TextInputPillg5ZjG94(String str, String str2, final Ia.l<? super String, r> onTextChanged, H h8, final long j, int i10, boolean z10, Ia.l<? super InterfaceC1000i, r> lVar, int i11, int i12, boolean z11, p<? super InterfaceC1084f, ? super Integer, r> pVar, boolean z12, float f10, InterfaceC1084f interfaceC1084f, final int i13, final int i14, final int i15) {
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
        boolean z13;
        int i34;
        int i35;
        int i36;
        String str3;
        final String str4;
        H h10;
        int i37;
        boolean z14;
        Ia.l<? super InterfaceC1000i, r> c2326c;
        int i38;
        int i39;
        final boolean z15;
        p<? super InterfaceC1084f, ? super Integer, r> pVar2;
        boolean z16;
        float f11;
        long jB;
        Object objF;
        InterfaceC1084f.a.C0153a c0153a;
        Object objF2;
        C1086g c1086g;
        final int i40;
        final float f12;
        final H h11;
        final int i41;
        final Ia.l<? super InterfaceC1000i, r> lVar2;
        final String str5;
        final boolean z17;
        final String str6;
        final int i42;
        final boolean z18;
        final p<? super InterfaceC1084f, ? super Integer, r> pVar3;
        final boolean z19;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(onTextChanged, "onTextChanged");
        C1086g c1086gP = interfaceC1084f.p(701760197);
        int i43 = i15 & 1;
        if (i43 != 0) {
            i16 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i16 = i13 | (c1086gP.K(str) ? 4 : 2);
        } else {
            i16 = i13;
        }
        int i44 = i15 & 2;
        if (i44 != 0) {
            i16 |= 48;
        } else if ((i13 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i16 |= c1086gP.K(str2) ? 32 : 16;
        }
        int i45 = i16;
        if ((i15 & 4) != 0) {
            i45 |= 384;
        } else if ((i13 & 896) == 0) {
            i45 |= c1086gP.k(onTextChanged) ? 256 : 128;
        }
        int i46 = i15 & 8;
        if (i46 == 0) {
            if ((i13 & 7168) == 0) {
                i45 |= c1086gP.K(h8) ? 2048 : 1024;
            }
            if ((i15 & 16) != 0) {
                i45 |= 24576;
            } else if ((i13 & 57344) == 0) {
                if (c1086gP.i(j)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i45 |= i17;
            }
            i18 = i15 & 32;
            if (i18 != 0) {
                i45 |= 196608;
            } else if ((i13 & 458752) == 0) {
                if (c1086gP.h(i10)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i45 |= i19;
            }
            i20 = i15 & 64;
            if (i20 != 0) {
                i45 |= 1572864;
            } else if ((i13 & 3670016) == 0) {
                if (c1086gP.c(z10)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i45 |= i21;
            }
            i22 = i15 & 128;
            if (i22 != 0) {
                i45 |= 12582912;
            } else if ((i13 & 29360128) == 0) {
                if (c1086gP.k(lVar)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i45 |= i23;
            }
            i24 = i15 & 256;
            if (i24 != 0) {
                i45 |= 100663296;
            } else if ((i13 & 234881024) == 0) {
                if (c1086gP.h(i11)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i45 |= i25;
            }
            i26 = i15 & 512;
            if (i26 != 0) {
                if ((i13 & 1879048192) == 0) {
                    if (c1086gP.h(i12)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                }
                i28 = i15 & 1024;
                if (i28 != 0) {
                    i29 = i14 | 6;
                } else if ((i14 & 14) == 0) {
                    i29 = i14 | (c1086gP.c(z11) ? 4 : 2);
                } else {
                    i29 = i14;
                }
                i30 = i15 & 2048;
                if (i30 != 0) {
                    i29 |= 48;
                } else if ((i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                    if (c1086gP.k(pVar)) {
                        i31 = 32;
                    } else {
                        i31 = 16;
                    }
                    i29 |= i31;
                }
                i32 = i29;
                i33 = i15 & 4096;
                if (i33 != 0) {
                    if ((i14 & 896) == 0) {
                        z13 = z12;
                        if (c1086gP.c(z13)) {
                            i34 = 256;
                        } else {
                            i34 = 128;
                        }
                        i32 |= i34;
                    }
                    i35 = 8192 & i15;
                    if (i35 != 0) {
                        if ((i14 & 7168) == 0) {
                            if (c1086gP.g(f10)) {
                                i36 = 2048;
                            } else {
                                i36 = 1024;
                            }
                            i32 |= i36;
                        }
                        if ((i45 & 1533916891) != 306783378 && (i32 & 5851) == 1170 && c1086gP.s()) {
                            c1086gP.w();
                            str6 = str;
                            str5 = str2;
                            h11 = h8;
                            i42 = i10;
                            z18 = z10;
                            lVar2 = lVar;
                            i41 = i11;
                            z17 = z11;
                            pVar3 = pVar;
                            f12 = f10;
                            c1086g = c1086gP;
                            z19 = z13;
                            i40 = i12;
                        } else {
                            if (i43 != 0) {
                                str3 = "";
                            } else {
                                str3 = str;
                            }
                            if (i44 != 0) {
                                str4 = "";
                            } else {
                                str4 = str2;
                            }
                            if (i46 != 0) {
                                h10 = null;
                            } else {
                                h10 = h8;
                            }
                            if (i18 != 0) {
                                i37 = Integer.MAX_VALUE;
                            } else {
                                i37 = i10;
                            }
                            if (i20 != 0) {
                                z14 = false;
                            } else {
                                z14 = z10;
                            }
                            if (i22 != 0) {
                                c2326c = new C2326c(3);
                            } else {
                                c2326c = lVar;
                            }
                            if (i24 != 0) {
                                i38 = 1;
                            } else {
                                i38 = i11;
                            }
                            if (i26 != 0) {
                                i39 = 1;
                            } else {
                                i39 = i12;
                            }
                            if (i28 != 0) {
                                z15 = false;
                            } else {
                                z15 = z11;
                            }
                            if (i30 != 0) {
                                pVar2 = null;
                            } else {
                                pVar2 = pVar;
                            }
                            if (i33 != 0) {
                                z16 = true;
                            } else {
                                z16 = z13;
                            }
                            if (i35 != 0) {
                                f11 = Float.NaN;
                            } else {
                                f11 = f10;
                            }
                            c1086gP.L(-652106389);
                            if (h10 == null) {
                                jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                            } else {
                                jB = h10.f13506a;
                            }
                            c1086gP.T(false);
                            c1086gP.L(-652100754);
                            objF = c1086gP.f();
                            c0153a = InterfaceC1084f.a.f12980a;
                            if (objF == c0153a) {
                                objF = new androidx.compose.foundation.relocation.b();
                                c1086gP.E(objF);
                            }
                            final androidx.compose.foundation.relocation.a aVar = (androidx.compose.foundation.relocation.a) objF;
                            c1086gP.T(false);
                            objF2 = c1086gP.f();
                            if (objF2 == c0153a) {
                                objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                                c1086gP.E(objF2);
                            }
                            final A a10 = (A) objF2;
                            int i47 = i32;
                            H h12 = h10;
                            IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                            float f13 = f11;
                            int i48 = IntercomTheme.$stable;
                            androidx.compose.ui.h hVarA = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme.getShapes(c1086gP, i48).f12430b), intercomTheme.getShapes(c1086gP, i48).f12430b), aVar), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                                @Override // Ia.l
                                public final Object invoke(Object obj) {
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a10, aVar, (y) obj);
                                }
                            });
                            TextFieldDefaults textFieldDefaults = TextFieldDefaults.f12369a;
                            TextFieldColors textFieldColorsC = TextFieldDefaults.c(c1086gP, 6);
                            long j10 = H.f13503k;
                            c1086g = c1086gP;
                            TextFieldKt.a(str3, onTextChanged, hVarA, z16, false, intercomTheme.getTypography(c1086gP, i48).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i49) {
                                    if ((i49 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                                    }
                                }
                            }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                    invoke(interfaceC1084f2, num.intValue());
                                    return r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i49) {
                                    if ((i49 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else if (z15) {
                                        IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                                    }
                                }
                            }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme.getShapes(c1086gP, i48).f12430b, textFieldColorsC.a(((-14837) & 1) != 0 ? textFieldColorsC.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC.f12345b : 0L, intercomTheme.getColors(c1086gP, i48).m630getDescriptionText0d7_KjU(), textFieldColorsC.f12347d, intercomTheme.getColors(c1086gP, i48).m637getInputAlt0d7_KjU(), intercomTheme.getColors(c1086gP, i48).m637getInputAlt0d7_KjU(), intercomTheme.getColors(c1086gP, i48).m624getBubbleBackground0d7_KjU(), intercomTheme.getColors(c1086gP, i48).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC.f12352i : j, textFieldColorsC.j, textFieldColorsC.f12353k, j10, j10, ((-14837) & 8192) != 0 ? textFieldColorsC.f12356n : j10, textFieldColorsC.f12357o, textFieldColorsC.f12358p, textFieldColorsC.f12359q, textFieldColorsC.f12360r, textFieldColorsC.f12361s, textFieldColorsC.f12362t, textFieldColorsC.f12363u, textFieldColorsC.f12364v, textFieldColorsC.f12365w, textFieldColorsC.f12366x, textFieldColorsC.f12367y, textFieldColorsC.f12368z, textFieldColorsC.f12327A, textFieldColorsC.f12328B, textFieldColorsC.f12329C, textFieldColorsC.f12330D, textFieldColorsC.f12331E, textFieldColorsC.f12332F, textFieldColorsC.f12333G, textFieldColorsC.f12334H, textFieldColorsC.f12335I, textFieldColorsC.f12336J, textFieldColorsC.f12337K, textFieldColorsC.f12338L, textFieldColorsC.f12339M, textFieldColorsC.f12340N, textFieldColorsC.f12341O, textFieldColorsC.f12342P, textFieldColorsC.f12343Q), c1086g, ((i47 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i47 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                            i40 = i39;
                            f12 = f13;
                            h11 = h12;
                            i41 = i38;
                            lVar2 = c2326c;
                            str5 = str4;
                            z17 = z15;
                            str6 = str3;
                            i42 = i37;
                            z18 = z14;
                            pVar3 = pVar2;
                            z19 = z16;
                        }
                        c1105p0V = c1086g.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i32 |= 3072;
                    if ((i45 & 1533916891) != 306783378) {
                        if (i43 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i44 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        if (i46 != 0) {
                            h10 = null;
                        } else {
                            h10 = h8;
                        }
                        if (i18 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i10;
                        }
                        if (i20 != 0) {
                            z14 = false;
                        } else {
                            z14 = z10;
                        }
                        if (i22 != 0) {
                            c2326c = new C2326c(3);
                        } else {
                            c2326c = lVar;
                        }
                        if (i24 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i11;
                        }
                        if (i26 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i12;
                        }
                        if (i28 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i30 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar;
                        }
                        if (i33 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        if (i35 != 0) {
                            f11 = Float.NaN;
                        } else {
                            f11 = f10;
                        }
                        c1086gP.L(-652106389);
                        if (h10 == null) {
                            jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        } else {
                            jB = h10.f13506a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-652100754);
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = new androidx.compose.foundation.relocation.b();
                            c1086gP.E(objF);
                        }
                        final androidx.compose.foundation.relocation.a aVar2 = (androidx.compose.foundation.relocation.a) objF;
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF2);
                        }
                        final A a11 = (A) objF2;
                        int i49 = i32;
                        H h13 = h10;
                        IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                        float f14 = f11;
                        int i410 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVarA2 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme2.getShapes(c1086gP, i410).f12430b), intercomTheme2.getShapes(c1086gP, i410).f12430b), aVar2), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a11, aVar2, (y) obj);
                            }
                        });
                        TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f12369a;
                        TextFieldColors textFieldColorsC2 = TextFieldDefaults.c(c1086gP, 6);
                        long j11 = H.f13503k;
                        c1086g = c1086gP;
                        TextFieldKt.a(str3, onTextChanged, hVarA2, z16, false, intercomTheme2.getTypography(c1086gP, i410).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i411) {
                                if ((i411 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                                }
                            }
                        }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i411) {
                                if ((i411 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else if (z15) {
                                    IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                                }
                            }
                        }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme2.getShapes(c1086gP, i410).f12430b, textFieldColorsC2.a(((-14837) & 1) != 0 ? textFieldColorsC2.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC2.f12345b : 0L, intercomTheme2.getColors(c1086gP, i410).m630getDescriptionText0d7_KjU(), textFieldColorsC2.f12347d, intercomTheme2.getColors(c1086gP, i410).m637getInputAlt0d7_KjU(), intercomTheme2.getColors(c1086gP, i410).m637getInputAlt0d7_KjU(), intercomTheme2.getColors(c1086gP, i410).m624getBubbleBackground0d7_KjU(), intercomTheme2.getColors(c1086gP, i410).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC2.f12352i : j, textFieldColorsC2.j, textFieldColorsC2.f12353k, j11, j11, ((-14837) & 8192) != 0 ? textFieldColorsC2.f12356n : j11, textFieldColorsC2.f12357o, textFieldColorsC2.f12358p, textFieldColorsC2.f12359q, textFieldColorsC2.f12360r, textFieldColorsC2.f12361s, textFieldColorsC2.f12362t, textFieldColorsC2.f12363u, textFieldColorsC2.f12364v, textFieldColorsC2.f12365w, textFieldColorsC2.f12366x, textFieldColorsC2.f12367y, textFieldColorsC2.f12368z, textFieldColorsC2.f12327A, textFieldColorsC2.f12328B, textFieldColorsC2.f12329C, textFieldColorsC2.f12330D, textFieldColorsC2.f12331E, textFieldColorsC2.f12332F, textFieldColorsC2.f12333G, textFieldColorsC2.f12334H, textFieldColorsC2.f12335I, textFieldColorsC2.f12336J, textFieldColorsC2.f12337K, textFieldColorsC2.f12338L, textFieldColorsC2.f12339M, textFieldColorsC2.f12340N, textFieldColorsC2.f12341O, textFieldColorsC2.f12342P, textFieldColorsC2.f12343Q), c1086g, ((i49 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i49 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                        i40 = i39;
                        f12 = f14;
                        h11 = h13;
                        i41 = i38;
                        lVar2 = c2326c;
                        str5 = str4;
                        z17 = z15;
                        str6 = str3;
                        i42 = i37;
                        z18 = z14;
                        pVar3 = pVar2;
                        z19 = z16;
                    } else {
                        if (i43 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i44 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        if (i46 != 0) {
                            h10 = null;
                        } else {
                            h10 = h8;
                        }
                        if (i18 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i10;
                        }
                        if (i20 != 0) {
                            z14 = false;
                        } else {
                            z14 = z10;
                        }
                        if (i22 != 0) {
                            c2326c = new C2326c(3);
                        } else {
                            c2326c = lVar;
                        }
                        if (i24 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i11;
                        }
                        if (i26 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i12;
                        }
                        if (i28 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i30 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar;
                        }
                        if (i33 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        if (i35 != 0) {
                            f11 = Float.NaN;
                        } else {
                            f11 = f10;
                        }
                        c1086gP.L(-652106389);
                        if (h10 == null) {
                            jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        } else {
                            jB = h10.f13506a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-652100754);
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = new androidx.compose.foundation.relocation.b();
                            c1086gP.E(objF);
                        }
                        final androidx.compose.foundation.relocation.a aVar3 = (androidx.compose.foundation.relocation.a) objF;
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF2);
                        }
                        final A a12 = (A) objF2;
                        int i411 = i32;
                        H h14 = h10;
                        IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                        float f15 = f11;
                        int i412 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVarA3 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme3.getShapes(c1086gP, i412).f12430b), intercomTheme3.getShapes(c1086gP, i412).f12430b), aVar3), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a12, aVar3, (y) obj);
                            }
                        });
                        TextFieldDefaults textFieldDefaults3 = TextFieldDefaults.f12369a;
                        TextFieldColors textFieldColorsC3 = TextFieldDefaults.c(c1086gP, 6);
                        long j12 = H.f13503k;
                        c1086g = c1086gP;
                        TextFieldKt.a(str3, onTextChanged, hVarA3, z16, false, intercomTheme3.getTypography(c1086gP, i412).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i413) {
                                if ((i413 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                                }
                            }
                        }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i413) {
                                if ((i413 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else if (z15) {
                                    IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                                }
                            }
                        }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme3.getShapes(c1086gP, i412).f12430b, textFieldColorsC3.a(((-14837) & 1) != 0 ? textFieldColorsC3.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC3.f12345b : 0L, intercomTheme3.getColors(c1086gP, i412).m630getDescriptionText0d7_KjU(), textFieldColorsC3.f12347d, intercomTheme3.getColors(c1086gP, i412).m637getInputAlt0d7_KjU(), intercomTheme3.getColors(c1086gP, i412).m637getInputAlt0d7_KjU(), intercomTheme3.getColors(c1086gP, i412).m624getBubbleBackground0d7_KjU(), intercomTheme3.getColors(c1086gP, i412).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC3.f12352i : j, textFieldColorsC3.j, textFieldColorsC3.f12353k, j12, j12, ((-14837) & 8192) != 0 ? textFieldColorsC3.f12356n : j12, textFieldColorsC3.f12357o, textFieldColorsC3.f12358p, textFieldColorsC3.f12359q, textFieldColorsC3.f12360r, textFieldColorsC3.f12361s, textFieldColorsC3.f12362t, textFieldColorsC3.f12363u, textFieldColorsC3.f12364v, textFieldColorsC3.f12365w, textFieldColorsC3.f12366x, textFieldColorsC3.f12367y, textFieldColorsC3.f12368z, textFieldColorsC3.f12327A, textFieldColorsC3.f12328B, textFieldColorsC3.f12329C, textFieldColorsC3.f12330D, textFieldColorsC3.f12331E, textFieldColorsC3.f12332F, textFieldColorsC3.f12333G, textFieldColorsC3.f12334H, textFieldColorsC3.f12335I, textFieldColorsC3.f12336J, textFieldColorsC3.f12337K, textFieldColorsC3.f12338L, textFieldColorsC3.f12339M, textFieldColorsC3.f12340N, textFieldColorsC3.f12341O, textFieldColorsC3.f12342P, textFieldColorsC3.f12343Q), c1086g, ((i411 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i411 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                        i40 = i39;
                        f12 = f15;
                        h11 = h14;
                        i41 = i38;
                        lVar2 = c2326c;
                        str5 = str4;
                        z17 = z15;
                        str6 = str3;
                        i42 = i37;
                        z18 = z14;
                        pVar3 = pVar2;
                        z19 = z16;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i32 |= 384;
                z13 = z12;
                i35 = 8192 & i15;
                if (i35 != 0) {
                    if ((i14 & 7168) == 0) {
                        if (c1086gP.g(f10)) {
                            i36 = 2048;
                        } else {
                            i36 = 1024;
                        }
                        i32 |= i36;
                    }
                    if ((i45 & 1533916891) != 306783378) {
                        if (i43 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i44 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        if (i46 != 0) {
                            h10 = null;
                        } else {
                            h10 = h8;
                        }
                        if (i18 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i10;
                        }
                        if (i20 != 0) {
                            z14 = false;
                        } else {
                            z14 = z10;
                        }
                        if (i22 != 0) {
                            c2326c = new C2326c(3);
                        } else {
                            c2326c = lVar;
                        }
                        if (i24 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i11;
                        }
                        if (i26 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i12;
                        }
                        if (i28 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i30 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar;
                        }
                        if (i33 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        if (i35 != 0) {
                            f11 = Float.NaN;
                        } else {
                            f11 = f10;
                        }
                        c1086gP.L(-652106389);
                        if (h10 == null) {
                            jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        } else {
                            jB = h10.f13506a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-652100754);
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = new androidx.compose.foundation.relocation.b();
                            c1086gP.E(objF);
                        }
                        final androidx.compose.foundation.relocation.a aVar4 = (androidx.compose.foundation.relocation.a) objF;
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF2);
                        }
                        final A a13 = (A) objF2;
                        int i413 = i32;
                        H h15 = h10;
                        IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                        float f16 = f11;
                        int i414 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVarA4 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme4.getShapes(c1086gP, i414).f12430b), intercomTheme4.getShapes(c1086gP, i414).f12430b), aVar4), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a13, aVar4, (y) obj);
                            }
                        });
                        TextFieldDefaults textFieldDefaults4 = TextFieldDefaults.f12369a;
                        TextFieldColors textFieldColorsC4 = TextFieldDefaults.c(c1086gP, 6);
                        long j13 = H.f13503k;
                        c1086g = c1086gP;
                        TextFieldKt.a(str3, onTextChanged, hVarA4, z16, false, intercomTheme4.getTypography(c1086gP, i414).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i415) {
                                if ((i415 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                                }
                            }
                        }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i415) {
                                if ((i415 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else if (z15) {
                                    IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                                }
                            }
                        }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme4.getShapes(c1086gP, i414).f12430b, textFieldColorsC4.a(((-14837) & 1) != 0 ? textFieldColorsC4.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC4.f12345b : 0L, intercomTheme4.getColors(c1086gP, i414).m630getDescriptionText0d7_KjU(), textFieldColorsC4.f12347d, intercomTheme4.getColors(c1086gP, i414).m637getInputAlt0d7_KjU(), intercomTheme4.getColors(c1086gP, i414).m637getInputAlt0d7_KjU(), intercomTheme4.getColors(c1086gP, i414).m624getBubbleBackground0d7_KjU(), intercomTheme4.getColors(c1086gP, i414).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC4.f12352i : j, textFieldColorsC4.j, textFieldColorsC4.f12353k, j13, j13, ((-14837) & 8192) != 0 ? textFieldColorsC4.f12356n : j13, textFieldColorsC4.f12357o, textFieldColorsC4.f12358p, textFieldColorsC4.f12359q, textFieldColorsC4.f12360r, textFieldColorsC4.f12361s, textFieldColorsC4.f12362t, textFieldColorsC4.f12363u, textFieldColorsC4.f12364v, textFieldColorsC4.f12365w, textFieldColorsC4.f12366x, textFieldColorsC4.f12367y, textFieldColorsC4.f12368z, textFieldColorsC4.f12327A, textFieldColorsC4.f12328B, textFieldColorsC4.f12329C, textFieldColorsC4.f12330D, textFieldColorsC4.f12331E, textFieldColorsC4.f12332F, textFieldColorsC4.f12333G, textFieldColorsC4.f12334H, textFieldColorsC4.f12335I, textFieldColorsC4.f12336J, textFieldColorsC4.f12337K, textFieldColorsC4.f12338L, textFieldColorsC4.f12339M, textFieldColorsC4.f12340N, textFieldColorsC4.f12341O, textFieldColorsC4.f12342P, textFieldColorsC4.f12343Q), c1086g, ((i413 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i413 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                        i40 = i39;
                        f12 = f16;
                        h11 = h15;
                        i41 = i38;
                        lVar2 = c2326c;
                        str5 = str4;
                        z17 = z15;
                        str6 = str3;
                        i42 = i37;
                        z18 = z14;
                        pVar3 = pVar2;
                        z19 = z16;
                    } else {
                        if (i43 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i44 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        if (i46 != 0) {
                            h10 = null;
                        } else {
                            h10 = h8;
                        }
                        if (i18 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i10;
                        }
                        if (i20 != 0) {
                            z14 = false;
                        } else {
                            z14 = z10;
                        }
                        if (i22 != 0) {
                            c2326c = new C2326c(3);
                        } else {
                            c2326c = lVar;
                        }
                        if (i24 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i11;
                        }
                        if (i26 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i12;
                        }
                        if (i28 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i30 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar;
                        }
                        if (i33 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        if (i35 != 0) {
                            f11 = Float.NaN;
                        } else {
                            f11 = f10;
                        }
                        c1086gP.L(-652106389);
                        if (h10 == null) {
                            jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        } else {
                            jB = h10.f13506a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-652100754);
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = new androidx.compose.foundation.relocation.b();
                            c1086gP.E(objF);
                        }
                        final androidx.compose.foundation.relocation.a aVar5 = (androidx.compose.foundation.relocation.a) objF;
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF2);
                        }
                        final A a14 = (A) objF2;
                        int i415 = i32;
                        H h16 = h10;
                        IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                        float f17 = f11;
                        int i416 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVarA5 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme5.getShapes(c1086gP, i416).f12430b), intercomTheme5.getShapes(c1086gP, i416).f12430b), aVar5), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a14, aVar5, (y) obj);
                            }
                        });
                        TextFieldDefaults textFieldDefaults5 = TextFieldDefaults.f12369a;
                        TextFieldColors textFieldColorsC5 = TextFieldDefaults.c(c1086gP, 6);
                        long j14 = H.f13503k;
                        c1086g = c1086gP;
                        TextFieldKt.a(str3, onTextChanged, hVarA5, z16, false, intercomTheme5.getTypography(c1086gP, i416).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i417) {
                                if ((i417 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                                }
                            }
                        }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i417) {
                                if ((i417 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else if (z15) {
                                    IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                                }
                            }
                        }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme5.getShapes(c1086gP, i416).f12430b, textFieldColorsC5.a(((-14837) & 1) != 0 ? textFieldColorsC5.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC5.f12345b : 0L, intercomTheme5.getColors(c1086gP, i416).m630getDescriptionText0d7_KjU(), textFieldColorsC5.f12347d, intercomTheme5.getColors(c1086gP, i416).m637getInputAlt0d7_KjU(), intercomTheme5.getColors(c1086gP, i416).m637getInputAlt0d7_KjU(), intercomTheme5.getColors(c1086gP, i416).m624getBubbleBackground0d7_KjU(), intercomTheme5.getColors(c1086gP, i416).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC5.f12352i : j, textFieldColorsC5.j, textFieldColorsC5.f12353k, j14, j14, ((-14837) & 8192) != 0 ? textFieldColorsC5.f12356n : j14, textFieldColorsC5.f12357o, textFieldColorsC5.f12358p, textFieldColorsC5.f12359q, textFieldColorsC5.f12360r, textFieldColorsC5.f12361s, textFieldColorsC5.f12362t, textFieldColorsC5.f12363u, textFieldColorsC5.f12364v, textFieldColorsC5.f12365w, textFieldColorsC5.f12366x, textFieldColorsC5.f12367y, textFieldColorsC5.f12368z, textFieldColorsC5.f12327A, textFieldColorsC5.f12328B, textFieldColorsC5.f12329C, textFieldColorsC5.f12330D, textFieldColorsC5.f12331E, textFieldColorsC5.f12332F, textFieldColorsC5.f12333G, textFieldColorsC5.f12334H, textFieldColorsC5.f12335I, textFieldColorsC5.f12336J, textFieldColorsC5.f12337K, textFieldColorsC5.f12338L, textFieldColorsC5.f12339M, textFieldColorsC5.f12340N, textFieldColorsC5.f12341O, textFieldColorsC5.f12342P, textFieldColorsC5.f12343Q), c1086g, ((i415 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i415 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                        i40 = i39;
                        f12 = f17;
                        h11 = h16;
                        i41 = i38;
                        lVar2 = c2326c;
                        str5 = str4;
                        z17 = z15;
                        str6 = str3;
                        i42 = i37;
                        z18 = z14;
                        pVar3 = pVar2;
                        z19 = z16;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i32 |= 3072;
                if ((i45 & 1533916891) != 306783378) {
                    if (i43 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i44 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i46 != 0) {
                        h10 = null;
                    } else {
                        h10 = h8;
                    }
                    if (i18 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i10;
                    }
                    if (i20 != 0) {
                        z14 = false;
                    } else {
                        z14 = z10;
                    }
                    if (i22 != 0) {
                        c2326c = new C2326c(3);
                    } else {
                        c2326c = lVar;
                    }
                    if (i24 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i11;
                    }
                    if (i26 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i12;
                    }
                    if (i28 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i30 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar;
                    }
                    if (i33 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i35 != 0) {
                        f11 = Float.NaN;
                    } else {
                        f11 = f10;
                    }
                    c1086gP.L(-652106389);
                    if (h10 == null) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    } else {
                        jB = h10.f13506a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-652100754);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    final androidx.compose.foundation.relocation.a aVar6 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    final A a15 = (A) objF2;
                    int i417 = i32;
                    H h17 = h10;
                    IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                    float f18 = f11;
                    int i418 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVarA6 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme6.getShapes(c1086gP, i418).f12430b), intercomTheme6.getShapes(c1086gP, i418).f12430b), aVar6), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a15, aVar6, (y) obj);
                        }
                    });
                    TextFieldDefaults textFieldDefaults6 = TextFieldDefaults.f12369a;
                    TextFieldColors textFieldColorsC6 = TextFieldDefaults.c(c1086gP, 6);
                    long j15 = H.f13503k;
                    c1086g = c1086gP;
                    TextFieldKt.a(str3, onTextChanged, hVarA6, z16, false, intercomTheme6.getTypography(c1086gP, i418).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i419) {
                            if ((i419 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                            }
                        }
                    }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i419) {
                            if ((i419 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else if (z15) {
                                IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                        }
                    }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme6.getShapes(c1086gP, i418).f12430b, textFieldColorsC6.a(((-14837) & 1) != 0 ? textFieldColorsC6.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC6.f12345b : 0L, intercomTheme6.getColors(c1086gP, i418).m630getDescriptionText0d7_KjU(), textFieldColorsC6.f12347d, intercomTheme6.getColors(c1086gP, i418).m637getInputAlt0d7_KjU(), intercomTheme6.getColors(c1086gP, i418).m637getInputAlt0d7_KjU(), intercomTheme6.getColors(c1086gP, i418).m624getBubbleBackground0d7_KjU(), intercomTheme6.getColors(c1086gP, i418).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC6.f12352i : j, textFieldColorsC6.j, textFieldColorsC6.f12353k, j15, j15, ((-14837) & 8192) != 0 ? textFieldColorsC6.f12356n : j15, textFieldColorsC6.f12357o, textFieldColorsC6.f12358p, textFieldColorsC6.f12359q, textFieldColorsC6.f12360r, textFieldColorsC6.f12361s, textFieldColorsC6.f12362t, textFieldColorsC6.f12363u, textFieldColorsC6.f12364v, textFieldColorsC6.f12365w, textFieldColorsC6.f12366x, textFieldColorsC6.f12367y, textFieldColorsC6.f12368z, textFieldColorsC6.f12327A, textFieldColorsC6.f12328B, textFieldColorsC6.f12329C, textFieldColorsC6.f12330D, textFieldColorsC6.f12331E, textFieldColorsC6.f12332F, textFieldColorsC6.f12333G, textFieldColorsC6.f12334H, textFieldColorsC6.f12335I, textFieldColorsC6.f12336J, textFieldColorsC6.f12337K, textFieldColorsC6.f12338L, textFieldColorsC6.f12339M, textFieldColorsC6.f12340N, textFieldColorsC6.f12341O, textFieldColorsC6.f12342P, textFieldColorsC6.f12343Q), c1086g, ((i417 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i417 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                    i40 = i39;
                    f12 = f18;
                    h11 = h17;
                    i41 = i38;
                    lVar2 = c2326c;
                    str5 = str4;
                    z17 = z15;
                    str6 = str3;
                    i42 = i37;
                    z18 = z14;
                    pVar3 = pVar2;
                    z19 = z16;
                } else {
                    if (i43 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i44 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i46 != 0) {
                        h10 = null;
                    } else {
                        h10 = h8;
                    }
                    if (i18 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i10;
                    }
                    if (i20 != 0) {
                        z14 = false;
                    } else {
                        z14 = z10;
                    }
                    if (i22 != 0) {
                        c2326c = new C2326c(3);
                    } else {
                        c2326c = lVar;
                    }
                    if (i24 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i11;
                    }
                    if (i26 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i12;
                    }
                    if (i28 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i30 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar;
                    }
                    if (i33 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i35 != 0) {
                        f11 = Float.NaN;
                    } else {
                        f11 = f10;
                    }
                    c1086gP.L(-652106389);
                    if (h10 == null) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    } else {
                        jB = h10.f13506a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-652100754);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    final androidx.compose.foundation.relocation.a aVar7 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    final A a16 = (A) objF2;
                    int i419 = i32;
                    H h18 = h10;
                    IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                    float f19 = f11;
                    int i4110 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVarA7 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme7.getShapes(c1086gP, i4110).f12430b), intercomTheme7.getShapes(c1086gP, i4110).f12430b), aVar7), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a16, aVar7, (y) obj);
                        }
                    });
                    TextFieldDefaults textFieldDefaults7 = TextFieldDefaults.f12369a;
                    TextFieldColors textFieldColorsC7 = TextFieldDefaults.c(c1086gP, 6);
                    long j16 = H.f13503k;
                    c1086g = c1086gP;
                    TextFieldKt.a(str3, onTextChanged, hVarA7, z16, false, intercomTheme7.getTypography(c1086gP, i4110).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i4111) {
                            if ((i4111 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                            }
                        }
                    }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i4111) {
                            if ((i4111 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else if (z15) {
                                IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                        }
                    }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme7.getShapes(c1086gP, i4110).f12430b, textFieldColorsC7.a(((-14837) & 1) != 0 ? textFieldColorsC7.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC7.f12345b : 0L, intercomTheme7.getColors(c1086gP, i4110).m630getDescriptionText0d7_KjU(), textFieldColorsC7.f12347d, intercomTheme7.getColors(c1086gP, i4110).m637getInputAlt0d7_KjU(), intercomTheme7.getColors(c1086gP, i4110).m637getInputAlt0d7_KjU(), intercomTheme7.getColors(c1086gP, i4110).m624getBubbleBackground0d7_KjU(), intercomTheme7.getColors(c1086gP, i4110).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC7.f12352i : j, textFieldColorsC7.j, textFieldColorsC7.f12353k, j16, j16, ((-14837) & 8192) != 0 ? textFieldColorsC7.f12356n : j16, textFieldColorsC7.f12357o, textFieldColorsC7.f12358p, textFieldColorsC7.f12359q, textFieldColorsC7.f12360r, textFieldColorsC7.f12361s, textFieldColorsC7.f12362t, textFieldColorsC7.f12363u, textFieldColorsC7.f12364v, textFieldColorsC7.f12365w, textFieldColorsC7.f12366x, textFieldColorsC7.f12367y, textFieldColorsC7.f12368z, textFieldColorsC7.f12327A, textFieldColorsC7.f12328B, textFieldColorsC7.f12329C, textFieldColorsC7.f12330D, textFieldColorsC7.f12331E, textFieldColorsC7.f12332F, textFieldColorsC7.f12333G, textFieldColorsC7.f12334H, textFieldColorsC7.f12335I, textFieldColorsC7.f12336J, textFieldColorsC7.f12337K, textFieldColorsC7.f12338L, textFieldColorsC7.f12339M, textFieldColorsC7.f12340N, textFieldColorsC7.f12341O, textFieldColorsC7.f12342P, textFieldColorsC7.f12343Q), c1086g, ((i419 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i419 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                    i40 = i39;
                    f12 = f19;
                    h11 = h18;
                    i41 = i38;
                    lVar2 = c2326c;
                    str5 = str4;
                    z17 = z15;
                    str6 = str3;
                    i42 = i37;
                    z18 = z14;
                    pVar3 = pVar2;
                    z19 = z16;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i27 = 805306368;
            i45 |= i27;
            i28 = i15 & 1024;
            if (i28 != 0) {
                i29 = i14 | 6;
            } else if ((i14 & 14) == 0) {
                i29 = i14 | (c1086gP.c(z11) ? 4 : 2);
            } else {
                i29 = i14;
            }
            i30 = i15 & 2048;
            if (i30 != 0) {
                i29 |= 48;
            } else if ((i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                if (c1086gP.k(pVar)) {
                    i31 = 32;
                } else {
                    i31 = 16;
                }
                i29 |= i31;
            }
            i32 = i29;
            i33 = i15 & 4096;
            if (i33 != 0) {
                if ((i14 & 896) == 0) {
                    z13 = z12;
                    if (c1086gP.c(z13)) {
                        i34 = 256;
                    } else {
                        i34 = 128;
                    }
                    i32 |= i34;
                }
                i35 = 8192 & i15;
                if (i35 != 0) {
                    if ((i14 & 7168) == 0) {
                        if (c1086gP.g(f10)) {
                            i36 = 2048;
                        } else {
                            i36 = 1024;
                        }
                        i32 |= i36;
                    }
                    if ((i45 & 1533916891) != 306783378) {
                        if (i43 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i44 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        if (i46 != 0) {
                            h10 = null;
                        } else {
                            h10 = h8;
                        }
                        if (i18 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i10;
                        }
                        if (i20 != 0) {
                            z14 = false;
                        } else {
                            z14 = z10;
                        }
                        if (i22 != 0) {
                            c2326c = new C2326c(3);
                        } else {
                            c2326c = lVar;
                        }
                        if (i24 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i11;
                        }
                        if (i26 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i12;
                        }
                        if (i28 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i30 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar;
                        }
                        if (i33 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        if (i35 != 0) {
                            f11 = Float.NaN;
                        } else {
                            f11 = f10;
                        }
                        c1086gP.L(-652106389);
                        if (h10 == null) {
                            jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        } else {
                            jB = h10.f13506a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-652100754);
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = new androidx.compose.foundation.relocation.b();
                            c1086gP.E(objF);
                        }
                        final androidx.compose.foundation.relocation.a aVar8 = (androidx.compose.foundation.relocation.a) objF;
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF2);
                        }
                        final A a17 = (A) objF2;
                        int i4111 = i32;
                        H h19 = h10;
                        IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                        float f110 = f11;
                        int i4112 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVarA8 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme8.getShapes(c1086gP, i4112).f12430b), intercomTheme8.getShapes(c1086gP, i4112).f12430b), aVar8), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a17, aVar8, (y) obj);
                            }
                        });
                        TextFieldDefaults textFieldDefaults8 = TextFieldDefaults.f12369a;
                        TextFieldColors textFieldColorsC8 = TextFieldDefaults.c(c1086gP, 6);
                        long j17 = H.f13503k;
                        c1086g = c1086gP;
                        TextFieldKt.a(str3, onTextChanged, hVarA8, z16, false, intercomTheme8.getTypography(c1086gP, i4112).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i4113) {
                                if ((i4113 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                                }
                            }
                        }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i4113) {
                                if ((i4113 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else if (z15) {
                                    IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                                }
                            }
                        }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme8.getShapes(c1086gP, i4112).f12430b, textFieldColorsC8.a(((-14837) & 1) != 0 ? textFieldColorsC8.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC8.f12345b : 0L, intercomTheme8.getColors(c1086gP, i4112).m630getDescriptionText0d7_KjU(), textFieldColorsC8.f12347d, intercomTheme8.getColors(c1086gP, i4112).m637getInputAlt0d7_KjU(), intercomTheme8.getColors(c1086gP, i4112).m637getInputAlt0d7_KjU(), intercomTheme8.getColors(c1086gP, i4112).m624getBubbleBackground0d7_KjU(), intercomTheme8.getColors(c1086gP, i4112).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC8.f12352i : j, textFieldColorsC8.j, textFieldColorsC8.f12353k, j17, j17, ((-14837) & 8192) != 0 ? textFieldColorsC8.f12356n : j17, textFieldColorsC8.f12357o, textFieldColorsC8.f12358p, textFieldColorsC8.f12359q, textFieldColorsC8.f12360r, textFieldColorsC8.f12361s, textFieldColorsC8.f12362t, textFieldColorsC8.f12363u, textFieldColorsC8.f12364v, textFieldColorsC8.f12365w, textFieldColorsC8.f12366x, textFieldColorsC8.f12367y, textFieldColorsC8.f12368z, textFieldColorsC8.f12327A, textFieldColorsC8.f12328B, textFieldColorsC8.f12329C, textFieldColorsC8.f12330D, textFieldColorsC8.f12331E, textFieldColorsC8.f12332F, textFieldColorsC8.f12333G, textFieldColorsC8.f12334H, textFieldColorsC8.f12335I, textFieldColorsC8.f12336J, textFieldColorsC8.f12337K, textFieldColorsC8.f12338L, textFieldColorsC8.f12339M, textFieldColorsC8.f12340N, textFieldColorsC8.f12341O, textFieldColorsC8.f12342P, textFieldColorsC8.f12343Q), c1086g, ((i4111 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i4111 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                        i40 = i39;
                        f12 = f110;
                        h11 = h19;
                        i41 = i38;
                        lVar2 = c2326c;
                        str5 = str4;
                        z17 = z15;
                        str6 = str3;
                        i42 = i37;
                        z18 = z14;
                        pVar3 = pVar2;
                        z19 = z16;
                    } else {
                        if (i43 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i44 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        if (i46 != 0) {
                            h10 = null;
                        } else {
                            h10 = h8;
                        }
                        if (i18 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i10;
                        }
                        if (i20 != 0) {
                            z14 = false;
                        } else {
                            z14 = z10;
                        }
                        if (i22 != 0) {
                            c2326c = new C2326c(3);
                        } else {
                            c2326c = lVar;
                        }
                        if (i24 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i11;
                        }
                        if (i26 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i12;
                        }
                        if (i28 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i30 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar;
                        }
                        if (i33 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        if (i35 != 0) {
                            f11 = Float.NaN;
                        } else {
                            f11 = f10;
                        }
                        c1086gP.L(-652106389);
                        if (h10 == null) {
                            jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        } else {
                            jB = h10.f13506a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-652100754);
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = new androidx.compose.foundation.relocation.b();
                            c1086gP.E(objF);
                        }
                        final androidx.compose.foundation.relocation.a aVar9 = (androidx.compose.foundation.relocation.a) objF;
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF2);
                        }
                        final A a18 = (A) objF2;
                        int i4113 = i32;
                        H h110 = h10;
                        IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                        float f111 = f11;
                        int i4114 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVarA9 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme9.getShapes(c1086gP, i4114).f12430b), intercomTheme9.getShapes(c1086gP, i4114).f12430b), aVar9), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a18, aVar9, (y) obj);
                            }
                        });
                        TextFieldDefaults textFieldDefaults9 = TextFieldDefaults.f12369a;
                        TextFieldColors textFieldColorsC9 = TextFieldDefaults.c(c1086gP, 6);
                        long j18 = H.f13503k;
                        c1086g = c1086gP;
                        TextFieldKt.a(str3, onTextChanged, hVarA9, z16, false, intercomTheme9.getTypography(c1086gP, i4114).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i4115) {
                                if ((i4115 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                                }
                            }
                        }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i4115) {
                                if ((i4115 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else if (z15) {
                                    IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                                }
                            }
                        }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme9.getShapes(c1086gP, i4114).f12430b, textFieldColorsC9.a(((-14837) & 1) != 0 ? textFieldColorsC9.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC9.f12345b : 0L, intercomTheme9.getColors(c1086gP, i4114).m630getDescriptionText0d7_KjU(), textFieldColorsC9.f12347d, intercomTheme9.getColors(c1086gP, i4114).m637getInputAlt0d7_KjU(), intercomTheme9.getColors(c1086gP, i4114).m637getInputAlt0d7_KjU(), intercomTheme9.getColors(c1086gP, i4114).m624getBubbleBackground0d7_KjU(), intercomTheme9.getColors(c1086gP, i4114).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC9.f12352i : j, textFieldColorsC9.j, textFieldColorsC9.f12353k, j18, j18, ((-14837) & 8192) != 0 ? textFieldColorsC9.f12356n : j18, textFieldColorsC9.f12357o, textFieldColorsC9.f12358p, textFieldColorsC9.f12359q, textFieldColorsC9.f12360r, textFieldColorsC9.f12361s, textFieldColorsC9.f12362t, textFieldColorsC9.f12363u, textFieldColorsC9.f12364v, textFieldColorsC9.f12365w, textFieldColorsC9.f12366x, textFieldColorsC9.f12367y, textFieldColorsC9.f12368z, textFieldColorsC9.f12327A, textFieldColorsC9.f12328B, textFieldColorsC9.f12329C, textFieldColorsC9.f12330D, textFieldColorsC9.f12331E, textFieldColorsC9.f12332F, textFieldColorsC9.f12333G, textFieldColorsC9.f12334H, textFieldColorsC9.f12335I, textFieldColorsC9.f12336J, textFieldColorsC9.f12337K, textFieldColorsC9.f12338L, textFieldColorsC9.f12339M, textFieldColorsC9.f12340N, textFieldColorsC9.f12341O, textFieldColorsC9.f12342P, textFieldColorsC9.f12343Q), c1086g, ((i4113 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i4113 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                        i40 = i39;
                        f12 = f111;
                        h11 = h110;
                        i41 = i38;
                        lVar2 = c2326c;
                        str5 = str4;
                        z17 = z15;
                        str6 = str3;
                        i42 = i37;
                        z18 = z14;
                        pVar3 = pVar2;
                        z19 = z16;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i32 |= 3072;
                if ((i45 & 1533916891) != 306783378) {
                    if (i43 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i44 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i46 != 0) {
                        h10 = null;
                    } else {
                        h10 = h8;
                    }
                    if (i18 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i10;
                    }
                    if (i20 != 0) {
                        z14 = false;
                    } else {
                        z14 = z10;
                    }
                    if (i22 != 0) {
                        c2326c = new C2326c(3);
                    } else {
                        c2326c = lVar;
                    }
                    if (i24 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i11;
                    }
                    if (i26 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i12;
                    }
                    if (i28 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i30 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar;
                    }
                    if (i33 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i35 != 0) {
                        f11 = Float.NaN;
                    } else {
                        f11 = f10;
                    }
                    c1086gP.L(-652106389);
                    if (h10 == null) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    } else {
                        jB = h10.f13506a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-652100754);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    final androidx.compose.foundation.relocation.a aVar10 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    final A a19 = (A) objF2;
                    int i4115 = i32;
                    H h111 = h10;
                    IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                    float f112 = f11;
                    int i4116 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVarA10 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme10.getShapes(c1086gP, i4116).f12430b), intercomTheme10.getShapes(c1086gP, i4116).f12430b), aVar10), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a19, aVar10, (y) obj);
                        }
                    });
                    TextFieldDefaults textFieldDefaults10 = TextFieldDefaults.f12369a;
                    TextFieldColors textFieldColorsC10 = TextFieldDefaults.c(c1086gP, 6);
                    long j19 = H.f13503k;
                    c1086g = c1086gP;
                    TextFieldKt.a(str3, onTextChanged, hVarA10, z16, false, intercomTheme10.getTypography(c1086gP, i4116).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i4117) {
                            if ((i4117 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                            }
                        }
                    }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i4117) {
                            if ((i4117 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else if (z15) {
                                IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                        }
                    }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme10.getShapes(c1086gP, i4116).f12430b, textFieldColorsC10.a(((-14837) & 1) != 0 ? textFieldColorsC10.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC10.f12345b : 0L, intercomTheme10.getColors(c1086gP, i4116).m630getDescriptionText0d7_KjU(), textFieldColorsC10.f12347d, intercomTheme10.getColors(c1086gP, i4116).m637getInputAlt0d7_KjU(), intercomTheme10.getColors(c1086gP, i4116).m637getInputAlt0d7_KjU(), intercomTheme10.getColors(c1086gP, i4116).m624getBubbleBackground0d7_KjU(), intercomTheme10.getColors(c1086gP, i4116).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC10.f12352i : j, textFieldColorsC10.j, textFieldColorsC10.f12353k, j19, j19, ((-14837) & 8192) != 0 ? textFieldColorsC10.f12356n : j19, textFieldColorsC10.f12357o, textFieldColorsC10.f12358p, textFieldColorsC10.f12359q, textFieldColorsC10.f12360r, textFieldColorsC10.f12361s, textFieldColorsC10.f12362t, textFieldColorsC10.f12363u, textFieldColorsC10.f12364v, textFieldColorsC10.f12365w, textFieldColorsC10.f12366x, textFieldColorsC10.f12367y, textFieldColorsC10.f12368z, textFieldColorsC10.f12327A, textFieldColorsC10.f12328B, textFieldColorsC10.f12329C, textFieldColorsC10.f12330D, textFieldColorsC10.f12331E, textFieldColorsC10.f12332F, textFieldColorsC10.f12333G, textFieldColorsC10.f12334H, textFieldColorsC10.f12335I, textFieldColorsC10.f12336J, textFieldColorsC10.f12337K, textFieldColorsC10.f12338L, textFieldColorsC10.f12339M, textFieldColorsC10.f12340N, textFieldColorsC10.f12341O, textFieldColorsC10.f12342P, textFieldColorsC10.f12343Q), c1086g, ((i4115 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i4115 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                    i40 = i39;
                    f12 = f112;
                    h11 = h111;
                    i41 = i38;
                    lVar2 = c2326c;
                    str5 = str4;
                    z17 = z15;
                    str6 = str3;
                    i42 = i37;
                    z18 = z14;
                    pVar3 = pVar2;
                    z19 = z16;
                } else {
                    if (i43 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i44 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i46 != 0) {
                        h10 = null;
                    } else {
                        h10 = h8;
                    }
                    if (i18 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i10;
                    }
                    if (i20 != 0) {
                        z14 = false;
                    } else {
                        z14 = z10;
                    }
                    if (i22 != 0) {
                        c2326c = new C2326c(3);
                    } else {
                        c2326c = lVar;
                    }
                    if (i24 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i11;
                    }
                    if (i26 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i12;
                    }
                    if (i28 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i30 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar;
                    }
                    if (i33 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i35 != 0) {
                        f11 = Float.NaN;
                    } else {
                        f11 = f10;
                    }
                    c1086gP.L(-652106389);
                    if (h10 == null) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    } else {
                        jB = h10.f13506a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-652100754);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    final androidx.compose.foundation.relocation.a aVar11 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    final A a110 = (A) objF2;
                    int i4117 = i32;
                    H h112 = h10;
                    IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                    float f113 = f11;
                    int i4118 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVarA11 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme11.getShapes(c1086gP, i4118).f12430b), intercomTheme11.getShapes(c1086gP, i4118).f12430b), aVar11), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a110, aVar11, (y) obj);
                        }
                    });
                    TextFieldDefaults textFieldDefaults11 = TextFieldDefaults.f12369a;
                    TextFieldColors textFieldColorsC11 = TextFieldDefaults.c(c1086gP, 6);
                    long j110 = H.f13503k;
                    c1086g = c1086gP;
                    TextFieldKt.a(str3, onTextChanged, hVarA11, z16, false, intercomTheme11.getTypography(c1086gP, i4118).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i4119) {
                            if ((i4119 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                            }
                        }
                    }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i4119) {
                            if ((i4119 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else if (z15) {
                                IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                        }
                    }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme11.getShapes(c1086gP, i4118).f12430b, textFieldColorsC11.a(((-14837) & 1) != 0 ? textFieldColorsC11.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC11.f12345b : 0L, intercomTheme11.getColors(c1086gP, i4118).m630getDescriptionText0d7_KjU(), textFieldColorsC11.f12347d, intercomTheme11.getColors(c1086gP, i4118).m637getInputAlt0d7_KjU(), intercomTheme11.getColors(c1086gP, i4118).m637getInputAlt0d7_KjU(), intercomTheme11.getColors(c1086gP, i4118).m624getBubbleBackground0d7_KjU(), intercomTheme11.getColors(c1086gP, i4118).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC11.f12352i : j, textFieldColorsC11.j, textFieldColorsC11.f12353k, j110, j110, ((-14837) & 8192) != 0 ? textFieldColorsC11.f12356n : j110, textFieldColorsC11.f12357o, textFieldColorsC11.f12358p, textFieldColorsC11.f12359q, textFieldColorsC11.f12360r, textFieldColorsC11.f12361s, textFieldColorsC11.f12362t, textFieldColorsC11.f12363u, textFieldColorsC11.f12364v, textFieldColorsC11.f12365w, textFieldColorsC11.f12366x, textFieldColorsC11.f12367y, textFieldColorsC11.f12368z, textFieldColorsC11.f12327A, textFieldColorsC11.f12328B, textFieldColorsC11.f12329C, textFieldColorsC11.f12330D, textFieldColorsC11.f12331E, textFieldColorsC11.f12332F, textFieldColorsC11.f12333G, textFieldColorsC11.f12334H, textFieldColorsC11.f12335I, textFieldColorsC11.f12336J, textFieldColorsC11.f12337K, textFieldColorsC11.f12338L, textFieldColorsC11.f12339M, textFieldColorsC11.f12340N, textFieldColorsC11.f12341O, textFieldColorsC11.f12342P, textFieldColorsC11.f12343Q), c1086g, ((i4117 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i4117 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                    i40 = i39;
                    f12 = f113;
                    h11 = h112;
                    i41 = i38;
                    lVar2 = c2326c;
                    str5 = str4;
                    z17 = z15;
                    str6 = str3;
                    i42 = i37;
                    z18 = z14;
                    pVar3 = pVar2;
                    z19 = z16;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i32 |= 384;
            z13 = z12;
            i35 = 8192 & i15;
            if (i35 != 0) {
                if ((i14 & 7168) == 0) {
                    if (c1086gP.g(f10)) {
                        i36 = 2048;
                    } else {
                        i36 = 1024;
                    }
                    i32 |= i36;
                }
                if ((i45 & 1533916891) != 306783378) {
                    if (i43 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i44 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i46 != 0) {
                        h10 = null;
                    } else {
                        h10 = h8;
                    }
                    if (i18 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i10;
                    }
                    if (i20 != 0) {
                        z14 = false;
                    } else {
                        z14 = z10;
                    }
                    if (i22 != 0) {
                        c2326c = new C2326c(3);
                    } else {
                        c2326c = lVar;
                    }
                    if (i24 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i11;
                    }
                    if (i26 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i12;
                    }
                    if (i28 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i30 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar;
                    }
                    if (i33 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i35 != 0) {
                        f11 = Float.NaN;
                    } else {
                        f11 = f10;
                    }
                    c1086gP.L(-652106389);
                    if (h10 == null) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    } else {
                        jB = h10.f13506a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-652100754);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    final androidx.compose.foundation.relocation.a aVar12 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    final A a111 = (A) objF2;
                    int i4119 = i32;
                    H h113 = h10;
                    IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                    float f114 = f11;
                    int i41110 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVarA12 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme12.getShapes(c1086gP, i41110).f12430b), intercomTheme12.getShapes(c1086gP, i41110).f12430b), aVar12), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a111, aVar12, (y) obj);
                        }
                    });
                    TextFieldDefaults textFieldDefaults12 = TextFieldDefaults.f12369a;
                    TextFieldColors textFieldColorsC12 = TextFieldDefaults.c(c1086gP, 6);
                    long j111 = H.f13503k;
                    c1086g = c1086gP;
                    TextFieldKt.a(str3, onTextChanged, hVarA12, z16, false, intercomTheme12.getTypography(c1086gP, i41110).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i41111) {
                            if ((i41111 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                            }
                        }
                    }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i41111) {
                            if ((i41111 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else if (z15) {
                                IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                        }
                    }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme12.getShapes(c1086gP, i41110).f12430b, textFieldColorsC12.a(((-14837) & 1) != 0 ? textFieldColorsC12.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC12.f12345b : 0L, intercomTheme12.getColors(c1086gP, i41110).m630getDescriptionText0d7_KjU(), textFieldColorsC12.f12347d, intercomTheme12.getColors(c1086gP, i41110).m637getInputAlt0d7_KjU(), intercomTheme12.getColors(c1086gP, i41110).m637getInputAlt0d7_KjU(), intercomTheme12.getColors(c1086gP, i41110).m624getBubbleBackground0d7_KjU(), intercomTheme12.getColors(c1086gP, i41110).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC12.f12352i : j, textFieldColorsC12.j, textFieldColorsC12.f12353k, j111, j111, ((-14837) & 8192) != 0 ? textFieldColorsC12.f12356n : j111, textFieldColorsC12.f12357o, textFieldColorsC12.f12358p, textFieldColorsC12.f12359q, textFieldColorsC12.f12360r, textFieldColorsC12.f12361s, textFieldColorsC12.f12362t, textFieldColorsC12.f12363u, textFieldColorsC12.f12364v, textFieldColorsC12.f12365w, textFieldColorsC12.f12366x, textFieldColorsC12.f12367y, textFieldColorsC12.f12368z, textFieldColorsC12.f12327A, textFieldColorsC12.f12328B, textFieldColorsC12.f12329C, textFieldColorsC12.f12330D, textFieldColorsC12.f12331E, textFieldColorsC12.f12332F, textFieldColorsC12.f12333G, textFieldColorsC12.f12334H, textFieldColorsC12.f12335I, textFieldColorsC12.f12336J, textFieldColorsC12.f12337K, textFieldColorsC12.f12338L, textFieldColorsC12.f12339M, textFieldColorsC12.f12340N, textFieldColorsC12.f12341O, textFieldColorsC12.f12342P, textFieldColorsC12.f12343Q), c1086g, ((i4119 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i4119 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                    i40 = i39;
                    f12 = f114;
                    h11 = h113;
                    i41 = i38;
                    lVar2 = c2326c;
                    str5 = str4;
                    z17 = z15;
                    str6 = str3;
                    i42 = i37;
                    z18 = z14;
                    pVar3 = pVar2;
                    z19 = z16;
                } else {
                    if (i43 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i44 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i46 != 0) {
                        h10 = null;
                    } else {
                        h10 = h8;
                    }
                    if (i18 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i10;
                    }
                    if (i20 != 0) {
                        z14 = false;
                    } else {
                        z14 = z10;
                    }
                    if (i22 != 0) {
                        c2326c = new C2326c(3);
                    } else {
                        c2326c = lVar;
                    }
                    if (i24 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i11;
                    }
                    if (i26 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i12;
                    }
                    if (i28 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i30 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar;
                    }
                    if (i33 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i35 != 0) {
                        f11 = Float.NaN;
                    } else {
                        f11 = f10;
                    }
                    c1086gP.L(-652106389);
                    if (h10 == null) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    } else {
                        jB = h10.f13506a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-652100754);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    final androidx.compose.foundation.relocation.a aVar13 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    final A a112 = (A) objF2;
                    int i41111 = i32;
                    H h114 = h10;
                    IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                    float f115 = f11;
                    int i41112 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVarA13 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme13.getShapes(c1086gP, i41112).f12430b), intercomTheme13.getShapes(c1086gP, i41112).f12430b), aVar13), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a112, aVar13, (y) obj);
                        }
                    });
                    TextFieldDefaults textFieldDefaults13 = TextFieldDefaults.f12369a;
                    TextFieldColors textFieldColorsC13 = TextFieldDefaults.c(c1086gP, 6);
                    long j112 = H.f13503k;
                    c1086g = c1086gP;
                    TextFieldKt.a(str3, onTextChanged, hVarA13, z16, false, intercomTheme13.getTypography(c1086gP, i41112).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i41113) {
                            if ((i41113 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                            }
                        }
                    }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i41113) {
                            if ((i41113 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else if (z15) {
                                IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                        }
                    }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme13.getShapes(c1086gP, i41112).f12430b, textFieldColorsC13.a(((-14837) & 1) != 0 ? textFieldColorsC13.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC13.f12345b : 0L, intercomTheme13.getColors(c1086gP, i41112).m630getDescriptionText0d7_KjU(), textFieldColorsC13.f12347d, intercomTheme13.getColors(c1086gP, i41112).m637getInputAlt0d7_KjU(), intercomTheme13.getColors(c1086gP, i41112).m637getInputAlt0d7_KjU(), intercomTheme13.getColors(c1086gP, i41112).m624getBubbleBackground0d7_KjU(), intercomTheme13.getColors(c1086gP, i41112).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC13.f12352i : j, textFieldColorsC13.j, textFieldColorsC13.f12353k, j112, j112, ((-14837) & 8192) != 0 ? textFieldColorsC13.f12356n : j112, textFieldColorsC13.f12357o, textFieldColorsC13.f12358p, textFieldColorsC13.f12359q, textFieldColorsC13.f12360r, textFieldColorsC13.f12361s, textFieldColorsC13.f12362t, textFieldColorsC13.f12363u, textFieldColorsC13.f12364v, textFieldColorsC13.f12365w, textFieldColorsC13.f12366x, textFieldColorsC13.f12367y, textFieldColorsC13.f12368z, textFieldColorsC13.f12327A, textFieldColorsC13.f12328B, textFieldColorsC13.f12329C, textFieldColorsC13.f12330D, textFieldColorsC13.f12331E, textFieldColorsC13.f12332F, textFieldColorsC13.f12333G, textFieldColorsC13.f12334H, textFieldColorsC13.f12335I, textFieldColorsC13.f12336J, textFieldColorsC13.f12337K, textFieldColorsC13.f12338L, textFieldColorsC13.f12339M, textFieldColorsC13.f12340N, textFieldColorsC13.f12341O, textFieldColorsC13.f12342P, textFieldColorsC13.f12343Q), c1086g, ((i41111 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i41111 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                    i40 = i39;
                    f12 = f115;
                    h11 = h114;
                    i41 = i38;
                    lVar2 = c2326c;
                    str5 = str4;
                    z17 = z15;
                    str6 = str3;
                    i42 = i37;
                    z18 = z14;
                    pVar3 = pVar2;
                    z19 = z16;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i32 |= 3072;
            if ((i45 & 1533916891) != 306783378) {
                if (i43 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i44 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (i46 != 0) {
                    h10 = null;
                } else {
                    h10 = h8;
                }
                if (i18 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i10;
                }
                if (i20 != 0) {
                    z14 = false;
                } else {
                    z14 = z10;
                }
                if (i22 != 0) {
                    c2326c = new C2326c(3);
                } else {
                    c2326c = lVar;
                }
                if (i24 != 0) {
                    i38 = 1;
                } else {
                    i38 = i11;
                }
                if (i26 != 0) {
                    i39 = 1;
                } else {
                    i39 = i12;
                }
                if (i28 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i30 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar;
                }
                if (i33 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i35 != 0) {
                    f11 = Float.NaN;
                } else {
                    f11 = f10;
                }
                c1086gP.L(-652106389);
                if (h10 == null) {
                    jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                } else {
                    jB = h10.f13506a;
                }
                c1086gP.T(false);
                c1086gP.L(-652100754);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = new androidx.compose.foundation.relocation.b();
                    c1086gP.E(objF);
                }
                final androidx.compose.foundation.relocation.a aVar14 = (androidx.compose.foundation.relocation.a) objF;
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF2);
                }
                final A a113 = (A) objF2;
                int i41113 = i32;
                H h115 = h10;
                IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
                float f116 = f11;
                int i41114 = IntercomTheme.$stable;
                androidx.compose.ui.h hVarA14 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme14.getShapes(c1086gP, i41114).f12430b), intercomTheme14.getShapes(c1086gP, i41114).f12430b), aVar14), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a113, aVar14, (y) obj);
                    }
                });
                TextFieldDefaults textFieldDefaults14 = TextFieldDefaults.f12369a;
                TextFieldColors textFieldColorsC14 = TextFieldDefaults.c(c1086gP, 6);
                long j113 = H.f13503k;
                c1086g = c1086gP;
                TextFieldKt.a(str3, onTextChanged, hVarA14, z16, false, intercomTheme14.getTypography(c1086gP, i41114).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i41115) {
                        if ((i41115 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                        }
                    }
                }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i41115) {
                        if ((i41115 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else if (z15) {
                            IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                        }
                    }
                }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme14.getShapes(c1086gP, i41114).f12430b, textFieldColorsC14.a(((-14837) & 1) != 0 ? textFieldColorsC14.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC14.f12345b : 0L, intercomTheme14.getColors(c1086gP, i41114).m630getDescriptionText0d7_KjU(), textFieldColorsC14.f12347d, intercomTheme14.getColors(c1086gP, i41114).m637getInputAlt0d7_KjU(), intercomTheme14.getColors(c1086gP, i41114).m637getInputAlt0d7_KjU(), intercomTheme14.getColors(c1086gP, i41114).m624getBubbleBackground0d7_KjU(), intercomTheme14.getColors(c1086gP, i41114).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC14.f12352i : j, textFieldColorsC14.j, textFieldColorsC14.f12353k, j113, j113, ((-14837) & 8192) != 0 ? textFieldColorsC14.f12356n : j113, textFieldColorsC14.f12357o, textFieldColorsC14.f12358p, textFieldColorsC14.f12359q, textFieldColorsC14.f12360r, textFieldColorsC14.f12361s, textFieldColorsC14.f12362t, textFieldColorsC14.f12363u, textFieldColorsC14.f12364v, textFieldColorsC14.f12365w, textFieldColorsC14.f12366x, textFieldColorsC14.f12367y, textFieldColorsC14.f12368z, textFieldColorsC14.f12327A, textFieldColorsC14.f12328B, textFieldColorsC14.f12329C, textFieldColorsC14.f12330D, textFieldColorsC14.f12331E, textFieldColorsC14.f12332F, textFieldColorsC14.f12333G, textFieldColorsC14.f12334H, textFieldColorsC14.f12335I, textFieldColorsC14.f12336J, textFieldColorsC14.f12337K, textFieldColorsC14.f12338L, textFieldColorsC14.f12339M, textFieldColorsC14.f12340N, textFieldColorsC14.f12341O, textFieldColorsC14.f12342P, textFieldColorsC14.f12343Q), c1086g, ((i41113 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i41113 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                i40 = i39;
                f12 = f116;
                h11 = h115;
                i41 = i38;
                lVar2 = c2326c;
                str5 = str4;
                z17 = z15;
                str6 = str3;
                i42 = i37;
                z18 = z14;
                pVar3 = pVar2;
                z19 = z16;
            } else {
                if (i43 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i44 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (i46 != 0) {
                    h10 = null;
                } else {
                    h10 = h8;
                }
                if (i18 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i10;
                }
                if (i20 != 0) {
                    z14 = false;
                } else {
                    z14 = z10;
                }
                if (i22 != 0) {
                    c2326c = new C2326c(3);
                } else {
                    c2326c = lVar;
                }
                if (i24 != 0) {
                    i38 = 1;
                } else {
                    i38 = i11;
                }
                if (i26 != 0) {
                    i39 = 1;
                } else {
                    i39 = i12;
                }
                if (i28 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i30 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar;
                }
                if (i33 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i35 != 0) {
                    f11 = Float.NaN;
                } else {
                    f11 = f10;
                }
                c1086gP.L(-652106389);
                if (h10 == null) {
                    jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                } else {
                    jB = h10.f13506a;
                }
                c1086gP.T(false);
                c1086gP.L(-652100754);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = new androidx.compose.foundation.relocation.b();
                    c1086gP.E(objF);
                }
                final androidx.compose.foundation.relocation.a aVar15 = (androidx.compose.foundation.relocation.a) objF;
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF2);
                }
                final A a114 = (A) objF2;
                int i41115 = i32;
                H h116 = h10;
                IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
                float f117 = f11;
                int i41116 = IntercomTheme.$stable;
                androidx.compose.ui.h hVarA15 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme15.getShapes(c1086gP, i41116).f12430b), intercomTheme15.getShapes(c1086gP, i41116).f12430b), aVar15), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a114, aVar15, (y) obj);
                    }
                });
                TextFieldDefaults textFieldDefaults15 = TextFieldDefaults.f12369a;
                TextFieldColors textFieldColorsC15 = TextFieldDefaults.c(c1086gP, 6);
                long j114 = H.f13503k;
                c1086g = c1086gP;
                TextFieldKt.a(str3, onTextChanged, hVarA15, z16, false, intercomTheme15.getTypography(c1086gP, i41116).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i41117) {
                        if ((i41117 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                        }
                    }
                }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i41117) {
                        if ((i41117 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else if (z15) {
                            IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                        }
                    }
                }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme15.getShapes(c1086gP, i41116).f12430b, textFieldColorsC15.a(((-14837) & 1) != 0 ? textFieldColorsC15.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC15.f12345b : 0L, intercomTheme15.getColors(c1086gP, i41116).m630getDescriptionText0d7_KjU(), textFieldColorsC15.f12347d, intercomTheme15.getColors(c1086gP, i41116).m637getInputAlt0d7_KjU(), intercomTheme15.getColors(c1086gP, i41116).m637getInputAlt0d7_KjU(), intercomTheme15.getColors(c1086gP, i41116).m624getBubbleBackground0d7_KjU(), intercomTheme15.getColors(c1086gP, i41116).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC15.f12352i : j, textFieldColorsC15.j, textFieldColorsC15.f12353k, j114, j114, ((-14837) & 8192) != 0 ? textFieldColorsC15.f12356n : j114, textFieldColorsC15.f12357o, textFieldColorsC15.f12358p, textFieldColorsC15.f12359q, textFieldColorsC15.f12360r, textFieldColorsC15.f12361s, textFieldColorsC15.f12362t, textFieldColorsC15.f12363u, textFieldColorsC15.f12364v, textFieldColorsC15.f12365w, textFieldColorsC15.f12366x, textFieldColorsC15.f12367y, textFieldColorsC15.f12368z, textFieldColorsC15.f12327A, textFieldColorsC15.f12328B, textFieldColorsC15.f12329C, textFieldColorsC15.f12330D, textFieldColorsC15.f12331E, textFieldColorsC15.f12332F, textFieldColorsC15.f12333G, textFieldColorsC15.f12334H, textFieldColorsC15.f12335I, textFieldColorsC15.f12336J, textFieldColorsC15.f12337K, textFieldColorsC15.f12338L, textFieldColorsC15.f12339M, textFieldColorsC15.f12340N, textFieldColorsC15.f12341O, textFieldColorsC15.f12342P, textFieldColorsC15.f12343Q), c1086g, ((i41115 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i41115 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                i40 = i39;
                f12 = f117;
                h11 = h116;
                i41 = i38;
                lVar2 = c2326c;
                str5 = str4;
                z17 = z15;
                str6 = str3;
                i42 = i37;
                z18 = z14;
                pVar3 = pVar2;
                z19 = z16;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i45 |= 3072;
        if ((i15 & 16) != 0) {
            i45 |= 24576;
        } else if ((i13 & 57344) == 0) {
            if (c1086gP.i(j)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i45 |= i17;
        }
        i18 = i15 & 32;
        if (i18 != 0) {
            i45 |= 196608;
        } else if ((i13 & 458752) == 0) {
            if (c1086gP.h(i10)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i45 |= i19;
        }
        i20 = i15 & 64;
        if (i20 != 0) {
            i45 |= 1572864;
        } else if ((i13 & 3670016) == 0) {
            if (c1086gP.c(z10)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i45 |= i21;
        }
        i22 = i15 & 128;
        if (i22 != 0) {
            i45 |= 12582912;
        } else if ((i13 & 29360128) == 0) {
            if (c1086gP.k(lVar)) {
                i23 = 8388608;
            } else {
                i23 = 4194304;
            }
            i45 |= i23;
        }
        i24 = i15 & 256;
        if (i24 != 0) {
            i45 |= 100663296;
        } else if ((i13 & 234881024) == 0) {
            if (c1086gP.h(i11)) {
                i25 = 67108864;
            } else {
                i25 = 33554432;
            }
            i45 |= i25;
        }
        i26 = i15 & 512;
        if (i26 != 0) {
            if ((i13 & 1879048192) == 0) {
                if (c1086gP.h(i12)) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
            }
            i28 = i15 & 1024;
            if (i28 != 0) {
                i29 = i14 | 6;
            } else if ((i14 & 14) == 0) {
                i29 = i14 | (c1086gP.c(z11) ? 4 : 2);
            } else {
                i29 = i14;
            }
            i30 = i15 & 2048;
            if (i30 != 0) {
                i29 |= 48;
            } else if ((i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                if (c1086gP.k(pVar)) {
                    i31 = 32;
                } else {
                    i31 = 16;
                }
                i29 |= i31;
            }
            i32 = i29;
            i33 = i15 & 4096;
            if (i33 != 0) {
                if ((i14 & 896) == 0) {
                    z13 = z12;
                    if (c1086gP.c(z13)) {
                        i34 = 256;
                    } else {
                        i34 = 128;
                    }
                    i32 |= i34;
                }
                i35 = 8192 & i15;
                if (i35 != 0) {
                    if ((i14 & 7168) == 0) {
                        if (c1086gP.g(f10)) {
                            i36 = 2048;
                        } else {
                            i36 = 1024;
                        }
                        i32 |= i36;
                    }
                    if ((i45 & 1533916891) != 306783378) {
                        if (i43 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i44 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        if (i46 != 0) {
                            h10 = null;
                        } else {
                            h10 = h8;
                        }
                        if (i18 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i10;
                        }
                        if (i20 != 0) {
                            z14 = false;
                        } else {
                            z14 = z10;
                        }
                        if (i22 != 0) {
                            c2326c = new C2326c(3);
                        } else {
                            c2326c = lVar;
                        }
                        if (i24 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i11;
                        }
                        if (i26 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i12;
                        }
                        if (i28 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i30 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar;
                        }
                        if (i33 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        if (i35 != 0) {
                            f11 = Float.NaN;
                        } else {
                            f11 = f10;
                        }
                        c1086gP.L(-652106389);
                        if (h10 == null) {
                            jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        } else {
                            jB = h10.f13506a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-652100754);
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = new androidx.compose.foundation.relocation.b();
                            c1086gP.E(objF);
                        }
                        final androidx.compose.foundation.relocation.a aVar16 = (androidx.compose.foundation.relocation.a) objF;
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF2);
                        }
                        final A a115 = (A) objF2;
                        int i41117 = i32;
                        H h117 = h10;
                        IntercomTheme intercomTheme16 = IntercomTheme.INSTANCE;
                        float f118 = f11;
                        int i41118 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVarA16 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme16.getShapes(c1086gP, i41118).f12430b), intercomTheme16.getShapes(c1086gP, i41118).f12430b), aVar16), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a115, aVar16, (y) obj);
                            }
                        });
                        TextFieldDefaults textFieldDefaults16 = TextFieldDefaults.f12369a;
                        TextFieldColors textFieldColorsC16 = TextFieldDefaults.c(c1086gP, 6);
                        long j115 = H.f13503k;
                        c1086g = c1086gP;
                        TextFieldKt.a(str3, onTextChanged, hVarA16, z16, false, intercomTheme16.getTypography(c1086gP, i41118).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i41119) {
                                if ((i41119 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                                }
                            }
                        }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i41119) {
                                if ((i41119 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else if (z15) {
                                    IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                                }
                            }
                        }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme16.getShapes(c1086gP, i41118).f12430b, textFieldColorsC16.a(((-14837) & 1) != 0 ? textFieldColorsC16.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC16.f12345b : 0L, intercomTheme16.getColors(c1086gP, i41118).m630getDescriptionText0d7_KjU(), textFieldColorsC16.f12347d, intercomTheme16.getColors(c1086gP, i41118).m637getInputAlt0d7_KjU(), intercomTheme16.getColors(c1086gP, i41118).m637getInputAlt0d7_KjU(), intercomTheme16.getColors(c1086gP, i41118).m624getBubbleBackground0d7_KjU(), intercomTheme16.getColors(c1086gP, i41118).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC16.f12352i : j, textFieldColorsC16.j, textFieldColorsC16.f12353k, j115, j115, ((-14837) & 8192) != 0 ? textFieldColorsC16.f12356n : j115, textFieldColorsC16.f12357o, textFieldColorsC16.f12358p, textFieldColorsC16.f12359q, textFieldColorsC16.f12360r, textFieldColorsC16.f12361s, textFieldColorsC16.f12362t, textFieldColorsC16.f12363u, textFieldColorsC16.f12364v, textFieldColorsC16.f12365w, textFieldColorsC16.f12366x, textFieldColorsC16.f12367y, textFieldColorsC16.f12368z, textFieldColorsC16.f12327A, textFieldColorsC16.f12328B, textFieldColorsC16.f12329C, textFieldColorsC16.f12330D, textFieldColorsC16.f12331E, textFieldColorsC16.f12332F, textFieldColorsC16.f12333G, textFieldColorsC16.f12334H, textFieldColorsC16.f12335I, textFieldColorsC16.f12336J, textFieldColorsC16.f12337K, textFieldColorsC16.f12338L, textFieldColorsC16.f12339M, textFieldColorsC16.f12340N, textFieldColorsC16.f12341O, textFieldColorsC16.f12342P, textFieldColorsC16.f12343Q), c1086g, ((i41117 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i41117 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                        i40 = i39;
                        f12 = f118;
                        h11 = h117;
                        i41 = i38;
                        lVar2 = c2326c;
                        str5 = str4;
                        z17 = z15;
                        str6 = str3;
                        i42 = i37;
                        z18 = z14;
                        pVar3 = pVar2;
                        z19 = z16;
                    } else {
                        if (i43 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i44 != 0) {
                            str4 = "";
                        } else {
                            str4 = str2;
                        }
                        if (i46 != 0) {
                            h10 = null;
                        } else {
                            h10 = h8;
                        }
                        if (i18 != 0) {
                            i37 = Integer.MAX_VALUE;
                        } else {
                            i37 = i10;
                        }
                        if (i20 != 0) {
                            z14 = false;
                        } else {
                            z14 = z10;
                        }
                        if (i22 != 0) {
                            c2326c = new C2326c(3);
                        } else {
                            c2326c = lVar;
                        }
                        if (i24 != 0) {
                            i38 = 1;
                        } else {
                            i38 = i11;
                        }
                        if (i26 != 0) {
                            i39 = 1;
                        } else {
                            i39 = i12;
                        }
                        if (i28 != 0) {
                            z15 = false;
                        } else {
                            z15 = z11;
                        }
                        if (i30 != 0) {
                            pVar2 = null;
                        } else {
                            pVar2 = pVar;
                        }
                        if (i33 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        if (i35 != 0) {
                            f11 = Float.NaN;
                        } else {
                            f11 = f10;
                        }
                        c1086gP.L(-652106389);
                        if (h10 == null) {
                            jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                        } else {
                            jB = h10.f13506a;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-652100754);
                        objF = c1086gP.f();
                        c0153a = InterfaceC1084f.a.f12980a;
                        if (objF == c0153a) {
                            objF = new androidx.compose.foundation.relocation.b();
                            c1086gP.E(objF);
                        }
                        final androidx.compose.foundation.relocation.a aVar17 = (androidx.compose.foundation.relocation.a) objF;
                        c1086gP.T(false);
                        objF2 = c1086gP.f();
                        if (objF2 == c0153a) {
                            objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                            c1086gP.E(objF2);
                        }
                        final A a116 = (A) objF2;
                        int i41119 = i32;
                        H h118 = h10;
                        IntercomTheme intercomTheme17 = IntercomTheme.INSTANCE;
                        float f119 = f11;
                        int i411110 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVarA17 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme17.getShapes(c1086gP, i411110).f12430b), intercomTheme17.getShapes(c1086gP, i411110).f12430b), aVar17), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                            @Override // Ia.l
                            public final Object invoke(Object obj) {
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a116, aVar17, (y) obj);
                            }
                        });
                        TextFieldDefaults textFieldDefaults17 = TextFieldDefaults.f12369a;
                        TextFieldColors textFieldColorsC17 = TextFieldDefaults.c(c1086gP, 6);
                        long j116 = H.f13503k;
                        c1086g = c1086gP;
                        TextFieldKt.a(str3, onTextChanged, hVarA17, z16, false, intercomTheme17.getTypography(c1086gP, i411110).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i411111) {
                                if ((i411111 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else {
                                    TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                                }
                            }
                        }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                            @Override // Ia.p
                            public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                                invoke(interfaceC1084f2, num.intValue());
                                return r.f47939a;
                            }

                            public final void invoke(InterfaceC1084f interfaceC1084f2, int i411111) {
                                if ((i411111 & 11) == 2 && interfaceC1084f2.s()) {
                                    interfaceC1084f2.w();
                                } else if (z15) {
                                    IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                                }
                            }
                        }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme17.getShapes(c1086gP, i411110).f12430b, textFieldColorsC17.a(((-14837) & 1) != 0 ? textFieldColorsC17.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC17.f12345b : 0L, intercomTheme17.getColors(c1086gP, i411110).m630getDescriptionText0d7_KjU(), textFieldColorsC17.f12347d, intercomTheme17.getColors(c1086gP, i411110).m637getInputAlt0d7_KjU(), intercomTheme17.getColors(c1086gP, i411110).m637getInputAlt0d7_KjU(), intercomTheme17.getColors(c1086gP, i411110).m624getBubbleBackground0d7_KjU(), intercomTheme17.getColors(c1086gP, i411110).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC17.f12352i : j, textFieldColorsC17.j, textFieldColorsC17.f12353k, j116, j116, ((-14837) & 8192) != 0 ? textFieldColorsC17.f12356n : j116, textFieldColorsC17.f12357o, textFieldColorsC17.f12358p, textFieldColorsC17.f12359q, textFieldColorsC17.f12360r, textFieldColorsC17.f12361s, textFieldColorsC17.f12362t, textFieldColorsC17.f12363u, textFieldColorsC17.f12364v, textFieldColorsC17.f12365w, textFieldColorsC17.f12366x, textFieldColorsC17.f12367y, textFieldColorsC17.f12368z, textFieldColorsC17.f12327A, textFieldColorsC17.f12328B, textFieldColorsC17.f12329C, textFieldColorsC17.f12330D, textFieldColorsC17.f12331E, textFieldColorsC17.f12332F, textFieldColorsC17.f12333G, textFieldColorsC17.f12334H, textFieldColorsC17.f12335I, textFieldColorsC17.f12336J, textFieldColorsC17.f12337K, textFieldColorsC17.f12338L, textFieldColorsC17.f12339M, textFieldColorsC17.f12340N, textFieldColorsC17.f12341O, textFieldColorsC17.f12342P, textFieldColorsC17.f12343Q), c1086g, ((i41119 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i41119 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                        i40 = i39;
                        f12 = f119;
                        h11 = h118;
                        i41 = i38;
                        lVar2 = c2326c;
                        str5 = str4;
                        z17 = z15;
                        str6 = str3;
                        i42 = i37;
                        z18 = z14;
                        pVar3 = pVar2;
                        z19 = z16;
                    }
                    c1105p0V = c1086g.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i32 |= 3072;
                if ((i45 & 1533916891) != 306783378) {
                    if (i43 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i44 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i46 != 0) {
                        h10 = null;
                    } else {
                        h10 = h8;
                    }
                    if (i18 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i10;
                    }
                    if (i20 != 0) {
                        z14 = false;
                    } else {
                        z14 = z10;
                    }
                    if (i22 != 0) {
                        c2326c = new C2326c(3);
                    } else {
                        c2326c = lVar;
                    }
                    if (i24 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i11;
                    }
                    if (i26 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i12;
                    }
                    if (i28 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i30 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar;
                    }
                    if (i33 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i35 != 0) {
                        f11 = Float.NaN;
                    } else {
                        f11 = f10;
                    }
                    c1086gP.L(-652106389);
                    if (h10 == null) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    } else {
                        jB = h10.f13506a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-652100754);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    final androidx.compose.foundation.relocation.a aVar18 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    final A a117 = (A) objF2;
                    int i411111 = i32;
                    H h119 = h10;
                    IntercomTheme intercomTheme18 = IntercomTheme.INSTANCE;
                    float f1110 = f11;
                    int i411112 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVarA18 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme18.getShapes(c1086gP, i411112).f12430b), intercomTheme18.getShapes(c1086gP, i411112).f12430b), aVar18), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a117, aVar18, (y) obj);
                        }
                    });
                    TextFieldDefaults textFieldDefaults18 = TextFieldDefaults.f12369a;
                    TextFieldColors textFieldColorsC18 = TextFieldDefaults.c(c1086gP, 6);
                    long j117 = H.f13503k;
                    c1086g = c1086gP;
                    TextFieldKt.a(str3, onTextChanged, hVarA18, z16, false, intercomTheme18.getTypography(c1086gP, i411112).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i411113) {
                            if ((i411113 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                            }
                        }
                    }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i411113) {
                            if ((i411113 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else if (z15) {
                                IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                        }
                    }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme18.getShapes(c1086gP, i411112).f12430b, textFieldColorsC18.a(((-14837) & 1) != 0 ? textFieldColorsC18.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC18.f12345b : 0L, intercomTheme18.getColors(c1086gP, i411112).m630getDescriptionText0d7_KjU(), textFieldColorsC18.f12347d, intercomTheme18.getColors(c1086gP, i411112).m637getInputAlt0d7_KjU(), intercomTheme18.getColors(c1086gP, i411112).m637getInputAlt0d7_KjU(), intercomTheme18.getColors(c1086gP, i411112).m624getBubbleBackground0d7_KjU(), intercomTheme18.getColors(c1086gP, i411112).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC18.f12352i : j, textFieldColorsC18.j, textFieldColorsC18.f12353k, j117, j117, ((-14837) & 8192) != 0 ? textFieldColorsC18.f12356n : j117, textFieldColorsC18.f12357o, textFieldColorsC18.f12358p, textFieldColorsC18.f12359q, textFieldColorsC18.f12360r, textFieldColorsC18.f12361s, textFieldColorsC18.f12362t, textFieldColorsC18.f12363u, textFieldColorsC18.f12364v, textFieldColorsC18.f12365w, textFieldColorsC18.f12366x, textFieldColorsC18.f12367y, textFieldColorsC18.f12368z, textFieldColorsC18.f12327A, textFieldColorsC18.f12328B, textFieldColorsC18.f12329C, textFieldColorsC18.f12330D, textFieldColorsC18.f12331E, textFieldColorsC18.f12332F, textFieldColorsC18.f12333G, textFieldColorsC18.f12334H, textFieldColorsC18.f12335I, textFieldColorsC18.f12336J, textFieldColorsC18.f12337K, textFieldColorsC18.f12338L, textFieldColorsC18.f12339M, textFieldColorsC18.f12340N, textFieldColorsC18.f12341O, textFieldColorsC18.f12342P, textFieldColorsC18.f12343Q), c1086g, ((i411111 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i411111 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                    i40 = i39;
                    f12 = f1110;
                    h11 = h119;
                    i41 = i38;
                    lVar2 = c2326c;
                    str5 = str4;
                    z17 = z15;
                    str6 = str3;
                    i42 = i37;
                    z18 = z14;
                    pVar3 = pVar2;
                    z19 = z16;
                } else {
                    if (i43 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i44 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i46 != 0) {
                        h10 = null;
                    } else {
                        h10 = h8;
                    }
                    if (i18 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i10;
                    }
                    if (i20 != 0) {
                        z14 = false;
                    } else {
                        z14 = z10;
                    }
                    if (i22 != 0) {
                        c2326c = new C2326c(3);
                    } else {
                        c2326c = lVar;
                    }
                    if (i24 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i11;
                    }
                    if (i26 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i12;
                    }
                    if (i28 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i30 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar;
                    }
                    if (i33 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i35 != 0) {
                        f11 = Float.NaN;
                    } else {
                        f11 = f10;
                    }
                    c1086gP.L(-652106389);
                    if (h10 == null) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    } else {
                        jB = h10.f13506a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-652100754);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    final androidx.compose.foundation.relocation.a aVar19 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    final A a118 = (A) objF2;
                    int i411113 = i32;
                    H h1110 = h10;
                    IntercomTheme intercomTheme19 = IntercomTheme.INSTANCE;
                    float f1111 = f11;
                    int i411114 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVarA19 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme19.getShapes(c1086gP, i411114).f12430b), intercomTheme19.getShapes(c1086gP, i411114).f12430b), aVar19), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a118, aVar19, (y) obj);
                        }
                    });
                    TextFieldDefaults textFieldDefaults19 = TextFieldDefaults.f12369a;
                    TextFieldColors textFieldColorsC19 = TextFieldDefaults.c(c1086gP, 6);
                    long j118 = H.f13503k;
                    c1086g = c1086gP;
                    TextFieldKt.a(str3, onTextChanged, hVarA19, z16, false, intercomTheme19.getTypography(c1086gP, i411114).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i411115) {
                            if ((i411115 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                            }
                        }
                    }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i411115) {
                            if ((i411115 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else if (z15) {
                                IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                        }
                    }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme19.getShapes(c1086gP, i411114).f12430b, textFieldColorsC19.a(((-14837) & 1) != 0 ? textFieldColorsC19.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC19.f12345b : 0L, intercomTheme19.getColors(c1086gP, i411114).m630getDescriptionText0d7_KjU(), textFieldColorsC19.f12347d, intercomTheme19.getColors(c1086gP, i411114).m637getInputAlt0d7_KjU(), intercomTheme19.getColors(c1086gP, i411114).m637getInputAlt0d7_KjU(), intercomTheme19.getColors(c1086gP, i411114).m624getBubbleBackground0d7_KjU(), intercomTheme19.getColors(c1086gP, i411114).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC19.f12352i : j, textFieldColorsC19.j, textFieldColorsC19.f12353k, j118, j118, ((-14837) & 8192) != 0 ? textFieldColorsC19.f12356n : j118, textFieldColorsC19.f12357o, textFieldColorsC19.f12358p, textFieldColorsC19.f12359q, textFieldColorsC19.f12360r, textFieldColorsC19.f12361s, textFieldColorsC19.f12362t, textFieldColorsC19.f12363u, textFieldColorsC19.f12364v, textFieldColorsC19.f12365w, textFieldColorsC19.f12366x, textFieldColorsC19.f12367y, textFieldColorsC19.f12368z, textFieldColorsC19.f12327A, textFieldColorsC19.f12328B, textFieldColorsC19.f12329C, textFieldColorsC19.f12330D, textFieldColorsC19.f12331E, textFieldColorsC19.f12332F, textFieldColorsC19.f12333G, textFieldColorsC19.f12334H, textFieldColorsC19.f12335I, textFieldColorsC19.f12336J, textFieldColorsC19.f12337K, textFieldColorsC19.f12338L, textFieldColorsC19.f12339M, textFieldColorsC19.f12340N, textFieldColorsC19.f12341O, textFieldColorsC19.f12342P, textFieldColorsC19.f12343Q), c1086g, ((i411113 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i411113 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                    i40 = i39;
                    f12 = f1111;
                    h11 = h1110;
                    i41 = i38;
                    lVar2 = c2326c;
                    str5 = str4;
                    z17 = z15;
                    str6 = str3;
                    i42 = i37;
                    z18 = z14;
                    pVar3 = pVar2;
                    z19 = z16;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i32 |= 384;
            z13 = z12;
            i35 = 8192 & i15;
            if (i35 != 0) {
                if ((i14 & 7168) == 0) {
                    if (c1086gP.g(f10)) {
                        i36 = 2048;
                    } else {
                        i36 = 1024;
                    }
                    i32 |= i36;
                }
                if ((i45 & 1533916891) != 306783378) {
                    if (i43 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i44 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i46 != 0) {
                        h10 = null;
                    } else {
                        h10 = h8;
                    }
                    if (i18 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i10;
                    }
                    if (i20 != 0) {
                        z14 = false;
                    } else {
                        z14 = z10;
                    }
                    if (i22 != 0) {
                        c2326c = new C2326c(3);
                    } else {
                        c2326c = lVar;
                    }
                    if (i24 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i11;
                    }
                    if (i26 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i12;
                    }
                    if (i28 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i30 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar;
                    }
                    if (i33 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i35 != 0) {
                        f11 = Float.NaN;
                    } else {
                        f11 = f10;
                    }
                    c1086gP.L(-652106389);
                    if (h10 == null) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    } else {
                        jB = h10.f13506a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-652100754);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    final androidx.compose.foundation.relocation.a aVar110 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    final A a119 = (A) objF2;
                    int i411115 = i32;
                    H h1111 = h10;
                    IntercomTheme intercomTheme110 = IntercomTheme.INSTANCE;
                    float f1112 = f11;
                    int i411116 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVarA110 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme110.getShapes(c1086gP, i411116).f12430b), intercomTheme110.getShapes(c1086gP, i411116).f12430b), aVar110), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a119, aVar110, (y) obj);
                        }
                    });
                    TextFieldDefaults textFieldDefaults110 = TextFieldDefaults.f12369a;
                    TextFieldColors textFieldColorsC110 = TextFieldDefaults.c(c1086gP, 6);
                    long j119 = H.f13503k;
                    c1086g = c1086gP;
                    TextFieldKt.a(str3, onTextChanged, hVarA110, z16, false, intercomTheme110.getTypography(c1086gP, i411116).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i411117) {
                            if ((i411117 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                            }
                        }
                    }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i411117) {
                            if ((i411117 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else if (z15) {
                                IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                        }
                    }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme110.getShapes(c1086gP, i411116).f12430b, textFieldColorsC110.a(((-14837) & 1) != 0 ? textFieldColorsC110.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC110.f12345b : 0L, intercomTheme110.getColors(c1086gP, i411116).m630getDescriptionText0d7_KjU(), textFieldColorsC110.f12347d, intercomTheme110.getColors(c1086gP, i411116).m637getInputAlt0d7_KjU(), intercomTheme110.getColors(c1086gP, i411116).m637getInputAlt0d7_KjU(), intercomTheme110.getColors(c1086gP, i411116).m624getBubbleBackground0d7_KjU(), intercomTheme110.getColors(c1086gP, i411116).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC110.f12352i : j, textFieldColorsC110.j, textFieldColorsC110.f12353k, j119, j119, ((-14837) & 8192) != 0 ? textFieldColorsC110.f12356n : j119, textFieldColorsC110.f12357o, textFieldColorsC110.f12358p, textFieldColorsC110.f12359q, textFieldColorsC110.f12360r, textFieldColorsC110.f12361s, textFieldColorsC110.f12362t, textFieldColorsC110.f12363u, textFieldColorsC110.f12364v, textFieldColorsC110.f12365w, textFieldColorsC110.f12366x, textFieldColorsC110.f12367y, textFieldColorsC110.f12368z, textFieldColorsC110.f12327A, textFieldColorsC110.f12328B, textFieldColorsC110.f12329C, textFieldColorsC110.f12330D, textFieldColorsC110.f12331E, textFieldColorsC110.f12332F, textFieldColorsC110.f12333G, textFieldColorsC110.f12334H, textFieldColorsC110.f12335I, textFieldColorsC110.f12336J, textFieldColorsC110.f12337K, textFieldColorsC110.f12338L, textFieldColorsC110.f12339M, textFieldColorsC110.f12340N, textFieldColorsC110.f12341O, textFieldColorsC110.f12342P, textFieldColorsC110.f12343Q), c1086g, ((i411115 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i411115 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                    i40 = i39;
                    f12 = f1112;
                    h11 = h1111;
                    i41 = i38;
                    lVar2 = c2326c;
                    str5 = str4;
                    z17 = z15;
                    str6 = str3;
                    i42 = i37;
                    z18 = z14;
                    pVar3 = pVar2;
                    z19 = z16;
                } else {
                    if (i43 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i44 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i46 != 0) {
                        h10 = null;
                    } else {
                        h10 = h8;
                    }
                    if (i18 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i10;
                    }
                    if (i20 != 0) {
                        z14 = false;
                    } else {
                        z14 = z10;
                    }
                    if (i22 != 0) {
                        c2326c = new C2326c(3);
                    } else {
                        c2326c = lVar;
                    }
                    if (i24 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i11;
                    }
                    if (i26 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i12;
                    }
                    if (i28 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i30 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar;
                    }
                    if (i33 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i35 != 0) {
                        f11 = Float.NaN;
                    } else {
                        f11 = f10;
                    }
                    c1086gP.L(-652106389);
                    if (h10 == null) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    } else {
                        jB = h10.f13506a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-652100754);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    final androidx.compose.foundation.relocation.a aVar111 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    final A a1110 = (A) objF2;
                    int i411117 = i32;
                    H h1112 = h10;
                    IntercomTheme intercomTheme111 = IntercomTheme.INSTANCE;
                    float f1113 = f11;
                    int i411118 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVarA111 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme111.getShapes(c1086gP, i411118).f12430b), intercomTheme111.getShapes(c1086gP, i411118).f12430b), aVar111), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a1110, aVar111, (y) obj);
                        }
                    });
                    TextFieldDefaults textFieldDefaults111 = TextFieldDefaults.f12369a;
                    TextFieldColors textFieldColorsC111 = TextFieldDefaults.c(c1086gP, 6);
                    long j1110 = H.f13503k;
                    c1086g = c1086gP;
                    TextFieldKt.a(str3, onTextChanged, hVarA111, z16, false, intercomTheme111.getTypography(c1086gP, i411118).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i411119) {
                            if ((i411119 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                            }
                        }
                    }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i411119) {
                            if ((i411119 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else if (z15) {
                                IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                        }
                    }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme111.getShapes(c1086gP, i411118).f12430b, textFieldColorsC111.a(((-14837) & 1) != 0 ? textFieldColorsC111.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC111.f12345b : 0L, intercomTheme111.getColors(c1086gP, i411118).m630getDescriptionText0d7_KjU(), textFieldColorsC111.f12347d, intercomTheme111.getColors(c1086gP, i411118).m637getInputAlt0d7_KjU(), intercomTheme111.getColors(c1086gP, i411118).m637getInputAlt0d7_KjU(), intercomTheme111.getColors(c1086gP, i411118).m624getBubbleBackground0d7_KjU(), intercomTheme111.getColors(c1086gP, i411118).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC111.f12352i : j, textFieldColorsC111.j, textFieldColorsC111.f12353k, j1110, j1110, ((-14837) & 8192) != 0 ? textFieldColorsC111.f12356n : j1110, textFieldColorsC111.f12357o, textFieldColorsC111.f12358p, textFieldColorsC111.f12359q, textFieldColorsC111.f12360r, textFieldColorsC111.f12361s, textFieldColorsC111.f12362t, textFieldColorsC111.f12363u, textFieldColorsC111.f12364v, textFieldColorsC111.f12365w, textFieldColorsC111.f12366x, textFieldColorsC111.f12367y, textFieldColorsC111.f12368z, textFieldColorsC111.f12327A, textFieldColorsC111.f12328B, textFieldColorsC111.f12329C, textFieldColorsC111.f12330D, textFieldColorsC111.f12331E, textFieldColorsC111.f12332F, textFieldColorsC111.f12333G, textFieldColorsC111.f12334H, textFieldColorsC111.f12335I, textFieldColorsC111.f12336J, textFieldColorsC111.f12337K, textFieldColorsC111.f12338L, textFieldColorsC111.f12339M, textFieldColorsC111.f12340N, textFieldColorsC111.f12341O, textFieldColorsC111.f12342P, textFieldColorsC111.f12343Q), c1086g, ((i411117 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i411117 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                    i40 = i39;
                    f12 = f1113;
                    h11 = h1112;
                    i41 = i38;
                    lVar2 = c2326c;
                    str5 = str4;
                    z17 = z15;
                    str6 = str3;
                    i42 = i37;
                    z18 = z14;
                    pVar3 = pVar2;
                    z19 = z16;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i32 |= 3072;
            if ((i45 & 1533916891) != 306783378) {
                if (i43 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i44 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (i46 != 0) {
                    h10 = null;
                } else {
                    h10 = h8;
                }
                if (i18 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i10;
                }
                if (i20 != 0) {
                    z14 = false;
                } else {
                    z14 = z10;
                }
                if (i22 != 0) {
                    c2326c = new C2326c(3);
                } else {
                    c2326c = lVar;
                }
                if (i24 != 0) {
                    i38 = 1;
                } else {
                    i38 = i11;
                }
                if (i26 != 0) {
                    i39 = 1;
                } else {
                    i39 = i12;
                }
                if (i28 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i30 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar;
                }
                if (i33 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i35 != 0) {
                    f11 = Float.NaN;
                } else {
                    f11 = f10;
                }
                c1086gP.L(-652106389);
                if (h10 == null) {
                    jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                } else {
                    jB = h10.f13506a;
                }
                c1086gP.T(false);
                c1086gP.L(-652100754);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = new androidx.compose.foundation.relocation.b();
                    c1086gP.E(objF);
                }
                final androidx.compose.foundation.relocation.a aVar112 = (androidx.compose.foundation.relocation.a) objF;
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF2);
                }
                final A a1111 = (A) objF2;
                int i411119 = i32;
                H h1113 = h10;
                IntercomTheme intercomTheme112 = IntercomTheme.INSTANCE;
                float f1114 = f11;
                int i4111110 = IntercomTheme.$stable;
                androidx.compose.ui.h hVarA112 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme112.getShapes(c1086gP, i4111110).f12430b), intercomTheme112.getShapes(c1086gP, i4111110).f12430b), aVar112), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a1111, aVar112, (y) obj);
                    }
                });
                TextFieldDefaults textFieldDefaults112 = TextFieldDefaults.f12369a;
                TextFieldColors textFieldColorsC112 = TextFieldDefaults.c(c1086gP, 6);
                long j1111 = H.f13503k;
                c1086g = c1086gP;
                TextFieldKt.a(str3, onTextChanged, hVarA112, z16, false, intercomTheme112.getTypography(c1086gP, i4111110).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i4111111) {
                        if ((i4111111 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                        }
                    }
                }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i4111111) {
                        if ((i4111111 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else if (z15) {
                            IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                        }
                    }
                }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme112.getShapes(c1086gP, i4111110).f12430b, textFieldColorsC112.a(((-14837) & 1) != 0 ? textFieldColorsC112.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC112.f12345b : 0L, intercomTheme112.getColors(c1086gP, i4111110).m630getDescriptionText0d7_KjU(), textFieldColorsC112.f12347d, intercomTheme112.getColors(c1086gP, i4111110).m637getInputAlt0d7_KjU(), intercomTheme112.getColors(c1086gP, i4111110).m637getInputAlt0d7_KjU(), intercomTheme112.getColors(c1086gP, i4111110).m624getBubbleBackground0d7_KjU(), intercomTheme112.getColors(c1086gP, i4111110).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC112.f12352i : j, textFieldColorsC112.j, textFieldColorsC112.f12353k, j1111, j1111, ((-14837) & 8192) != 0 ? textFieldColorsC112.f12356n : j1111, textFieldColorsC112.f12357o, textFieldColorsC112.f12358p, textFieldColorsC112.f12359q, textFieldColorsC112.f12360r, textFieldColorsC112.f12361s, textFieldColorsC112.f12362t, textFieldColorsC112.f12363u, textFieldColorsC112.f12364v, textFieldColorsC112.f12365w, textFieldColorsC112.f12366x, textFieldColorsC112.f12367y, textFieldColorsC112.f12368z, textFieldColorsC112.f12327A, textFieldColorsC112.f12328B, textFieldColorsC112.f12329C, textFieldColorsC112.f12330D, textFieldColorsC112.f12331E, textFieldColorsC112.f12332F, textFieldColorsC112.f12333G, textFieldColorsC112.f12334H, textFieldColorsC112.f12335I, textFieldColorsC112.f12336J, textFieldColorsC112.f12337K, textFieldColorsC112.f12338L, textFieldColorsC112.f12339M, textFieldColorsC112.f12340N, textFieldColorsC112.f12341O, textFieldColorsC112.f12342P, textFieldColorsC112.f12343Q), c1086g, ((i411119 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i411119 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                i40 = i39;
                f12 = f1114;
                h11 = h1113;
                i41 = i38;
                lVar2 = c2326c;
                str5 = str4;
                z17 = z15;
                str6 = str3;
                i42 = i37;
                z18 = z14;
                pVar3 = pVar2;
                z19 = z16;
            } else {
                if (i43 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i44 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (i46 != 0) {
                    h10 = null;
                } else {
                    h10 = h8;
                }
                if (i18 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i10;
                }
                if (i20 != 0) {
                    z14 = false;
                } else {
                    z14 = z10;
                }
                if (i22 != 0) {
                    c2326c = new C2326c(3);
                } else {
                    c2326c = lVar;
                }
                if (i24 != 0) {
                    i38 = 1;
                } else {
                    i38 = i11;
                }
                if (i26 != 0) {
                    i39 = 1;
                } else {
                    i39 = i12;
                }
                if (i28 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i30 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar;
                }
                if (i33 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i35 != 0) {
                    f11 = Float.NaN;
                } else {
                    f11 = f10;
                }
                c1086gP.L(-652106389);
                if (h10 == null) {
                    jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                } else {
                    jB = h10.f13506a;
                }
                c1086gP.T(false);
                c1086gP.L(-652100754);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = new androidx.compose.foundation.relocation.b();
                    c1086gP.E(objF);
                }
                final androidx.compose.foundation.relocation.a aVar113 = (androidx.compose.foundation.relocation.a) objF;
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF2);
                }
                final A a1112 = (A) objF2;
                int i4111111 = i32;
                H h1114 = h10;
                IntercomTheme intercomTheme113 = IntercomTheme.INSTANCE;
                float f1115 = f11;
                int i4111112 = IntercomTheme.$stable;
                androidx.compose.ui.h hVarA113 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme113.getShapes(c1086gP, i4111112).f12430b), intercomTheme113.getShapes(c1086gP, i4111112).f12430b), aVar113), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a1112, aVar113, (y) obj);
                    }
                });
                TextFieldDefaults textFieldDefaults113 = TextFieldDefaults.f12369a;
                TextFieldColors textFieldColorsC113 = TextFieldDefaults.c(c1086gP, 6);
                long j1112 = H.f13503k;
                c1086g = c1086gP;
                TextFieldKt.a(str3, onTextChanged, hVarA113, z16, false, intercomTheme113.getTypography(c1086gP, i4111112).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i4111113) {
                        if ((i4111113 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                        }
                    }
                }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i4111113) {
                        if ((i4111113 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else if (z15) {
                            IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                        }
                    }
                }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme113.getShapes(c1086gP, i4111112).f12430b, textFieldColorsC113.a(((-14837) & 1) != 0 ? textFieldColorsC113.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC113.f12345b : 0L, intercomTheme113.getColors(c1086gP, i4111112).m630getDescriptionText0d7_KjU(), textFieldColorsC113.f12347d, intercomTheme113.getColors(c1086gP, i4111112).m637getInputAlt0d7_KjU(), intercomTheme113.getColors(c1086gP, i4111112).m637getInputAlt0d7_KjU(), intercomTheme113.getColors(c1086gP, i4111112).m624getBubbleBackground0d7_KjU(), intercomTheme113.getColors(c1086gP, i4111112).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC113.f12352i : j, textFieldColorsC113.j, textFieldColorsC113.f12353k, j1112, j1112, ((-14837) & 8192) != 0 ? textFieldColorsC113.f12356n : j1112, textFieldColorsC113.f12357o, textFieldColorsC113.f12358p, textFieldColorsC113.f12359q, textFieldColorsC113.f12360r, textFieldColorsC113.f12361s, textFieldColorsC113.f12362t, textFieldColorsC113.f12363u, textFieldColorsC113.f12364v, textFieldColorsC113.f12365w, textFieldColorsC113.f12366x, textFieldColorsC113.f12367y, textFieldColorsC113.f12368z, textFieldColorsC113.f12327A, textFieldColorsC113.f12328B, textFieldColorsC113.f12329C, textFieldColorsC113.f12330D, textFieldColorsC113.f12331E, textFieldColorsC113.f12332F, textFieldColorsC113.f12333G, textFieldColorsC113.f12334H, textFieldColorsC113.f12335I, textFieldColorsC113.f12336J, textFieldColorsC113.f12337K, textFieldColorsC113.f12338L, textFieldColorsC113.f12339M, textFieldColorsC113.f12340N, textFieldColorsC113.f12341O, textFieldColorsC113.f12342P, textFieldColorsC113.f12343Q), c1086g, ((i4111111 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i4111111 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                i40 = i39;
                f12 = f1115;
                h11 = h1114;
                i41 = i38;
                lVar2 = c2326c;
                str5 = str4;
                z17 = z15;
                str6 = str3;
                i42 = i37;
                z18 = z14;
                pVar3 = pVar2;
                z19 = z16;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i27 = 805306368;
        i45 |= i27;
        i28 = i15 & 1024;
        if (i28 != 0) {
            i29 = i14 | 6;
        } else if ((i14 & 14) == 0) {
            i29 = i14 | (c1086gP.c(z11) ? 4 : 2);
        } else {
            i29 = i14;
        }
        i30 = i15 & 2048;
        if (i30 != 0) {
            i29 |= 48;
        } else if ((i14 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            if (c1086gP.k(pVar)) {
                i31 = 32;
            } else {
                i31 = 16;
            }
            i29 |= i31;
        }
        i32 = i29;
        i33 = i15 & 4096;
        if (i33 != 0) {
            if ((i14 & 896) == 0) {
                z13 = z12;
                if (c1086gP.c(z13)) {
                    i34 = 256;
                } else {
                    i34 = 128;
                }
                i32 |= i34;
            }
            i35 = 8192 & i15;
            if (i35 != 0) {
                if ((i14 & 7168) == 0) {
                    if (c1086gP.g(f10)) {
                        i36 = 2048;
                    } else {
                        i36 = 1024;
                    }
                    i32 |= i36;
                }
                if ((i45 & 1533916891) != 306783378) {
                    if (i43 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i44 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i46 != 0) {
                        h10 = null;
                    } else {
                        h10 = h8;
                    }
                    if (i18 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i10;
                    }
                    if (i20 != 0) {
                        z14 = false;
                    } else {
                        z14 = z10;
                    }
                    if (i22 != 0) {
                        c2326c = new C2326c(3);
                    } else {
                        c2326c = lVar;
                    }
                    if (i24 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i11;
                    }
                    if (i26 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i12;
                    }
                    if (i28 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i30 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar;
                    }
                    if (i33 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i35 != 0) {
                        f11 = Float.NaN;
                    } else {
                        f11 = f10;
                    }
                    c1086gP.L(-652106389);
                    if (h10 == null) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    } else {
                        jB = h10.f13506a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-652100754);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    final androidx.compose.foundation.relocation.a aVar114 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    final A a1113 = (A) objF2;
                    int i4111113 = i32;
                    H h1115 = h10;
                    IntercomTheme intercomTheme114 = IntercomTheme.INSTANCE;
                    float f1116 = f11;
                    int i4111114 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVarA114 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme114.getShapes(c1086gP, i4111114).f12430b), intercomTheme114.getShapes(c1086gP, i4111114).f12430b), aVar114), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a1113, aVar114, (y) obj);
                        }
                    });
                    TextFieldDefaults textFieldDefaults114 = TextFieldDefaults.f12369a;
                    TextFieldColors textFieldColorsC114 = TextFieldDefaults.c(c1086gP, 6);
                    long j1113 = H.f13503k;
                    c1086g = c1086gP;
                    TextFieldKt.a(str3, onTextChanged, hVarA114, z16, false, intercomTheme114.getTypography(c1086gP, i4111114).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i4111115) {
                            if ((i4111115 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                            }
                        }
                    }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i4111115) {
                            if ((i4111115 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else if (z15) {
                                IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                        }
                    }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme114.getShapes(c1086gP, i4111114).f12430b, textFieldColorsC114.a(((-14837) & 1) != 0 ? textFieldColorsC114.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC114.f12345b : 0L, intercomTheme114.getColors(c1086gP, i4111114).m630getDescriptionText0d7_KjU(), textFieldColorsC114.f12347d, intercomTheme114.getColors(c1086gP, i4111114).m637getInputAlt0d7_KjU(), intercomTheme114.getColors(c1086gP, i4111114).m637getInputAlt0d7_KjU(), intercomTheme114.getColors(c1086gP, i4111114).m624getBubbleBackground0d7_KjU(), intercomTheme114.getColors(c1086gP, i4111114).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC114.f12352i : j, textFieldColorsC114.j, textFieldColorsC114.f12353k, j1113, j1113, ((-14837) & 8192) != 0 ? textFieldColorsC114.f12356n : j1113, textFieldColorsC114.f12357o, textFieldColorsC114.f12358p, textFieldColorsC114.f12359q, textFieldColorsC114.f12360r, textFieldColorsC114.f12361s, textFieldColorsC114.f12362t, textFieldColorsC114.f12363u, textFieldColorsC114.f12364v, textFieldColorsC114.f12365w, textFieldColorsC114.f12366x, textFieldColorsC114.f12367y, textFieldColorsC114.f12368z, textFieldColorsC114.f12327A, textFieldColorsC114.f12328B, textFieldColorsC114.f12329C, textFieldColorsC114.f12330D, textFieldColorsC114.f12331E, textFieldColorsC114.f12332F, textFieldColorsC114.f12333G, textFieldColorsC114.f12334H, textFieldColorsC114.f12335I, textFieldColorsC114.f12336J, textFieldColorsC114.f12337K, textFieldColorsC114.f12338L, textFieldColorsC114.f12339M, textFieldColorsC114.f12340N, textFieldColorsC114.f12341O, textFieldColorsC114.f12342P, textFieldColorsC114.f12343Q), c1086g, ((i4111113 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i4111113 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                    i40 = i39;
                    f12 = f1116;
                    h11 = h1115;
                    i41 = i38;
                    lVar2 = c2326c;
                    str5 = str4;
                    z17 = z15;
                    str6 = str3;
                    i42 = i37;
                    z18 = z14;
                    pVar3 = pVar2;
                    z19 = z16;
                } else {
                    if (i43 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i44 != 0) {
                        str4 = "";
                    } else {
                        str4 = str2;
                    }
                    if (i46 != 0) {
                        h10 = null;
                    } else {
                        h10 = h8;
                    }
                    if (i18 != 0) {
                        i37 = Integer.MAX_VALUE;
                    } else {
                        i37 = i10;
                    }
                    if (i20 != 0) {
                        z14 = false;
                    } else {
                        z14 = z10;
                    }
                    if (i22 != 0) {
                        c2326c = new C2326c(3);
                    } else {
                        c2326c = lVar;
                    }
                    if (i24 != 0) {
                        i38 = 1;
                    } else {
                        i38 = i11;
                    }
                    if (i26 != 0) {
                        i39 = 1;
                    } else {
                        i39 = i12;
                    }
                    if (i28 != 0) {
                        z15 = false;
                    } else {
                        z15 = z11;
                    }
                    if (i30 != 0) {
                        pVar2 = null;
                    } else {
                        pVar2 = pVar;
                    }
                    if (i33 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i35 != 0) {
                        f11 = Float.NaN;
                    } else {
                        f11 = f10;
                    }
                    c1086gP.L(-652106389);
                    if (h10 == null) {
                        jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                    } else {
                        jB = h10.f13506a;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-652100754);
                    objF = c1086gP.f();
                    c0153a = InterfaceC1084f.a.f12980a;
                    if (objF == c0153a) {
                        objF = new androidx.compose.foundation.relocation.b();
                        c1086gP.E(objF);
                    }
                    final androidx.compose.foundation.relocation.a aVar115 = (androidx.compose.foundation.relocation.a) objF;
                    c1086gP.T(false);
                    objF2 = c1086gP.f();
                    if (objF2 == c0153a) {
                        objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                        c1086gP.E(objF2);
                    }
                    final A a1114 = (A) objF2;
                    int i4111115 = i32;
                    H h1116 = h10;
                    IntercomTheme intercomTheme115 = IntercomTheme.INSTANCE;
                    float f1117 = f11;
                    int i4111116 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVarA115 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme115.getShapes(c1086gP, i4111116).f12430b), intercomTheme115.getShapes(c1086gP, i4111116).f12430b), aVar115), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a1114, aVar115, (y) obj);
                        }
                    });
                    TextFieldDefaults textFieldDefaults115 = TextFieldDefaults.f12369a;
                    TextFieldColors textFieldColorsC115 = TextFieldDefaults.c(c1086gP, 6);
                    long j1114 = H.f13503k;
                    c1086g = c1086gP;
                    TextFieldKt.a(str3, onTextChanged, hVarA115, z16, false, intercomTheme115.getTypography(c1086gP, i4111116).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i4111117) {
                            if ((i4111117 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else {
                                TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                            }
                        }
                    }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                        @Override // Ia.p
                        public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                            invoke(interfaceC1084f2, num.intValue());
                            return r.f47939a;
                        }

                        public final void invoke(InterfaceC1084f interfaceC1084f2, int i4111117) {
                            if ((i4111117 & 11) == 2 && interfaceC1084f2.s()) {
                                interfaceC1084f2.w();
                            } else if (z15) {
                                IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                            }
                        }
                    }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme115.getShapes(c1086gP, i4111116).f12430b, textFieldColorsC115.a(((-14837) & 1) != 0 ? textFieldColorsC115.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC115.f12345b : 0L, intercomTheme115.getColors(c1086gP, i4111116).m630getDescriptionText0d7_KjU(), textFieldColorsC115.f12347d, intercomTheme115.getColors(c1086gP, i4111116).m637getInputAlt0d7_KjU(), intercomTheme115.getColors(c1086gP, i4111116).m637getInputAlt0d7_KjU(), intercomTheme115.getColors(c1086gP, i4111116).m624getBubbleBackground0d7_KjU(), intercomTheme115.getColors(c1086gP, i4111116).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC115.f12352i : j, textFieldColorsC115.j, textFieldColorsC115.f12353k, j1114, j1114, ((-14837) & 8192) != 0 ? textFieldColorsC115.f12356n : j1114, textFieldColorsC115.f12357o, textFieldColorsC115.f12358p, textFieldColorsC115.f12359q, textFieldColorsC115.f12360r, textFieldColorsC115.f12361s, textFieldColorsC115.f12362t, textFieldColorsC115.f12363u, textFieldColorsC115.f12364v, textFieldColorsC115.f12365w, textFieldColorsC115.f12366x, textFieldColorsC115.f12367y, textFieldColorsC115.f12368z, textFieldColorsC115.f12327A, textFieldColorsC115.f12328B, textFieldColorsC115.f12329C, textFieldColorsC115.f12330D, textFieldColorsC115.f12331E, textFieldColorsC115.f12332F, textFieldColorsC115.f12333G, textFieldColorsC115.f12334H, textFieldColorsC115.f12335I, textFieldColorsC115.f12336J, textFieldColorsC115.f12337K, textFieldColorsC115.f12338L, textFieldColorsC115.f12339M, textFieldColorsC115.f12340N, textFieldColorsC115.f12341O, textFieldColorsC115.f12342P, textFieldColorsC115.f12343Q), c1086g, ((i4111115 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i4111115 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                    i40 = i39;
                    f12 = f1117;
                    h11 = h1116;
                    i41 = i38;
                    lVar2 = c2326c;
                    str5 = str4;
                    z17 = z15;
                    str6 = str3;
                    i42 = i37;
                    z18 = z14;
                    pVar3 = pVar2;
                    z19 = z16;
                }
                c1105p0V = c1086g.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i32 |= 3072;
            if ((i45 & 1533916891) != 306783378) {
                if (i43 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i44 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (i46 != 0) {
                    h10 = null;
                } else {
                    h10 = h8;
                }
                if (i18 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i10;
                }
                if (i20 != 0) {
                    z14 = false;
                } else {
                    z14 = z10;
                }
                if (i22 != 0) {
                    c2326c = new C2326c(3);
                } else {
                    c2326c = lVar;
                }
                if (i24 != 0) {
                    i38 = 1;
                } else {
                    i38 = i11;
                }
                if (i26 != 0) {
                    i39 = 1;
                } else {
                    i39 = i12;
                }
                if (i28 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i30 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar;
                }
                if (i33 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i35 != 0) {
                    f11 = Float.NaN;
                } else {
                    f11 = f10;
                }
                c1086gP.L(-652106389);
                if (h10 == null) {
                    jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                } else {
                    jB = h10.f13506a;
                }
                c1086gP.T(false);
                c1086gP.L(-652100754);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = new androidx.compose.foundation.relocation.b();
                    c1086gP.E(objF);
                }
                final androidx.compose.foundation.relocation.a aVar116 = (androidx.compose.foundation.relocation.a) objF;
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF2);
                }
                final A a1115 = (A) objF2;
                int i4111117 = i32;
                H h1117 = h10;
                IntercomTheme intercomTheme116 = IntercomTheme.INSTANCE;
                float f1118 = f11;
                int i4111118 = IntercomTheme.$stable;
                androidx.compose.ui.h hVarA116 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme116.getShapes(c1086gP, i4111118).f12430b), intercomTheme116.getShapes(c1086gP, i4111118).f12430b), aVar116), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a1115, aVar116, (y) obj);
                    }
                });
                TextFieldDefaults textFieldDefaults116 = TextFieldDefaults.f12369a;
                TextFieldColors textFieldColorsC116 = TextFieldDefaults.c(c1086gP, 6);
                long j1115 = H.f13503k;
                c1086g = c1086gP;
                TextFieldKt.a(str3, onTextChanged, hVarA116, z16, false, intercomTheme116.getTypography(c1086gP, i4111118).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i4111119) {
                        if ((i4111119 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                        }
                    }
                }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i4111119) {
                        if ((i4111119 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else if (z15) {
                            IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                        }
                    }
                }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme116.getShapes(c1086gP, i4111118).f12430b, textFieldColorsC116.a(((-14837) & 1) != 0 ? textFieldColorsC116.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC116.f12345b : 0L, intercomTheme116.getColors(c1086gP, i4111118).m630getDescriptionText0d7_KjU(), textFieldColorsC116.f12347d, intercomTheme116.getColors(c1086gP, i4111118).m637getInputAlt0d7_KjU(), intercomTheme116.getColors(c1086gP, i4111118).m637getInputAlt0d7_KjU(), intercomTheme116.getColors(c1086gP, i4111118).m624getBubbleBackground0d7_KjU(), intercomTheme116.getColors(c1086gP, i4111118).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC116.f12352i : j, textFieldColorsC116.j, textFieldColorsC116.f12353k, j1115, j1115, ((-14837) & 8192) != 0 ? textFieldColorsC116.f12356n : j1115, textFieldColorsC116.f12357o, textFieldColorsC116.f12358p, textFieldColorsC116.f12359q, textFieldColorsC116.f12360r, textFieldColorsC116.f12361s, textFieldColorsC116.f12362t, textFieldColorsC116.f12363u, textFieldColorsC116.f12364v, textFieldColorsC116.f12365w, textFieldColorsC116.f12366x, textFieldColorsC116.f12367y, textFieldColorsC116.f12368z, textFieldColorsC116.f12327A, textFieldColorsC116.f12328B, textFieldColorsC116.f12329C, textFieldColorsC116.f12330D, textFieldColorsC116.f12331E, textFieldColorsC116.f12332F, textFieldColorsC116.f12333G, textFieldColorsC116.f12334H, textFieldColorsC116.f12335I, textFieldColorsC116.f12336J, textFieldColorsC116.f12337K, textFieldColorsC116.f12338L, textFieldColorsC116.f12339M, textFieldColorsC116.f12340N, textFieldColorsC116.f12341O, textFieldColorsC116.f12342P, textFieldColorsC116.f12343Q), c1086g, ((i4111117 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i4111117 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                i40 = i39;
                f12 = f1118;
                h11 = h1117;
                i41 = i38;
                lVar2 = c2326c;
                str5 = str4;
                z17 = z15;
                str6 = str3;
                i42 = i37;
                z18 = z14;
                pVar3 = pVar2;
                z19 = z16;
            } else {
                if (i43 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i44 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (i46 != 0) {
                    h10 = null;
                } else {
                    h10 = h8;
                }
                if (i18 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i10;
                }
                if (i20 != 0) {
                    z14 = false;
                } else {
                    z14 = z10;
                }
                if (i22 != 0) {
                    c2326c = new C2326c(3);
                } else {
                    c2326c = lVar;
                }
                if (i24 != 0) {
                    i38 = 1;
                } else {
                    i38 = i11;
                }
                if (i26 != 0) {
                    i39 = 1;
                } else {
                    i39 = i12;
                }
                if (i28 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i30 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar;
                }
                if (i33 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i35 != 0) {
                    f11 = Float.NaN;
                } else {
                    f11 = f10;
                }
                c1086gP.L(-652106389);
                if (h10 == null) {
                    jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                } else {
                    jB = h10.f13506a;
                }
                c1086gP.T(false);
                c1086gP.L(-652100754);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = new androidx.compose.foundation.relocation.b();
                    c1086gP.E(objF);
                }
                final androidx.compose.foundation.relocation.a aVar117 = (androidx.compose.foundation.relocation.a) objF;
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF2);
                }
                final A a1116 = (A) objF2;
                int i4111119 = i32;
                H h1118 = h10;
                IntercomTheme intercomTheme117 = IntercomTheme.INSTANCE;
                float f1119 = f11;
                int i41111110 = IntercomTheme.$stable;
                androidx.compose.ui.h hVarA117 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme117.getShapes(c1086gP, i41111110).f12430b), intercomTheme117.getShapes(c1086gP, i41111110).f12430b), aVar117), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a1116, aVar117, (y) obj);
                    }
                });
                TextFieldDefaults textFieldDefaults117 = TextFieldDefaults.f12369a;
                TextFieldColors textFieldColorsC117 = TextFieldDefaults.c(c1086gP, 6);
                long j1116 = H.f13503k;
                c1086g = c1086gP;
                TextFieldKt.a(str3, onTextChanged, hVarA117, z16, false, intercomTheme117.getTypography(c1086gP, i41111110).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i41111111) {
                        if ((i41111111 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                        }
                    }
                }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i41111111) {
                        if ((i41111111 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else if (z15) {
                            IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                        }
                    }
                }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme117.getShapes(c1086gP, i41111110).f12430b, textFieldColorsC117.a(((-14837) & 1) != 0 ? textFieldColorsC117.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC117.f12345b : 0L, intercomTheme117.getColors(c1086gP, i41111110).m630getDescriptionText0d7_KjU(), textFieldColorsC117.f12347d, intercomTheme117.getColors(c1086gP, i41111110).m637getInputAlt0d7_KjU(), intercomTheme117.getColors(c1086gP, i41111110).m637getInputAlt0d7_KjU(), intercomTheme117.getColors(c1086gP, i41111110).m624getBubbleBackground0d7_KjU(), intercomTheme117.getColors(c1086gP, i41111110).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC117.f12352i : j, textFieldColorsC117.j, textFieldColorsC117.f12353k, j1116, j1116, ((-14837) & 8192) != 0 ? textFieldColorsC117.f12356n : j1116, textFieldColorsC117.f12357o, textFieldColorsC117.f12358p, textFieldColorsC117.f12359q, textFieldColorsC117.f12360r, textFieldColorsC117.f12361s, textFieldColorsC117.f12362t, textFieldColorsC117.f12363u, textFieldColorsC117.f12364v, textFieldColorsC117.f12365w, textFieldColorsC117.f12366x, textFieldColorsC117.f12367y, textFieldColorsC117.f12368z, textFieldColorsC117.f12327A, textFieldColorsC117.f12328B, textFieldColorsC117.f12329C, textFieldColorsC117.f12330D, textFieldColorsC117.f12331E, textFieldColorsC117.f12332F, textFieldColorsC117.f12333G, textFieldColorsC117.f12334H, textFieldColorsC117.f12335I, textFieldColorsC117.f12336J, textFieldColorsC117.f12337K, textFieldColorsC117.f12338L, textFieldColorsC117.f12339M, textFieldColorsC117.f12340N, textFieldColorsC117.f12341O, textFieldColorsC117.f12342P, textFieldColorsC117.f12343Q), c1086g, ((i4111119 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i4111119 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                i40 = i39;
                f12 = f1119;
                h11 = h1118;
                i41 = i38;
                lVar2 = c2326c;
                str5 = str4;
                z17 = z15;
                str6 = str3;
                i42 = i37;
                z18 = z14;
                pVar3 = pVar2;
                z19 = z16;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i32 |= 384;
        z13 = z12;
        i35 = 8192 & i15;
        if (i35 != 0) {
            if ((i14 & 7168) == 0) {
                if (c1086gP.g(f10)) {
                    i36 = 2048;
                } else {
                    i36 = 1024;
                }
                i32 |= i36;
            }
            if ((i45 & 1533916891) != 306783378) {
                if (i43 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i44 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (i46 != 0) {
                    h10 = null;
                } else {
                    h10 = h8;
                }
                if (i18 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i10;
                }
                if (i20 != 0) {
                    z14 = false;
                } else {
                    z14 = z10;
                }
                if (i22 != 0) {
                    c2326c = new C2326c(3);
                } else {
                    c2326c = lVar;
                }
                if (i24 != 0) {
                    i38 = 1;
                } else {
                    i38 = i11;
                }
                if (i26 != 0) {
                    i39 = 1;
                } else {
                    i39 = i12;
                }
                if (i28 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i30 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar;
                }
                if (i33 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i35 != 0) {
                    f11 = Float.NaN;
                } else {
                    f11 = f10;
                }
                c1086gP.L(-652106389);
                if (h10 == null) {
                    jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                } else {
                    jB = h10.f13506a;
                }
                c1086gP.T(false);
                c1086gP.L(-652100754);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = new androidx.compose.foundation.relocation.b();
                    c1086gP.E(objF);
                }
                final androidx.compose.foundation.relocation.a aVar118 = (androidx.compose.foundation.relocation.a) objF;
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF2);
                }
                final A a1117 = (A) objF2;
                int i41111111 = i32;
                H h1119 = h10;
                IntercomTheme intercomTheme118 = IntercomTheme.INSTANCE;
                float f11110 = f11;
                int i41111112 = IntercomTheme.$stable;
                androidx.compose.ui.h hVarA118 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme118.getShapes(c1086gP, i41111112).f12430b), intercomTheme118.getShapes(c1086gP, i41111112).f12430b), aVar118), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a1117, aVar118, (y) obj);
                    }
                });
                TextFieldDefaults textFieldDefaults118 = TextFieldDefaults.f12369a;
                TextFieldColors textFieldColorsC118 = TextFieldDefaults.c(c1086gP, 6);
                long j1117 = H.f13503k;
                c1086g = c1086gP;
                TextFieldKt.a(str3, onTextChanged, hVarA118, z16, false, intercomTheme118.getTypography(c1086gP, i41111112).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i41111113) {
                        if ((i41111113 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                        }
                    }
                }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i41111113) {
                        if ((i41111113 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else if (z15) {
                            IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                        }
                    }
                }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme118.getShapes(c1086gP, i41111112).f12430b, textFieldColorsC118.a(((-14837) & 1) != 0 ? textFieldColorsC118.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC118.f12345b : 0L, intercomTheme118.getColors(c1086gP, i41111112).m630getDescriptionText0d7_KjU(), textFieldColorsC118.f12347d, intercomTheme118.getColors(c1086gP, i41111112).m637getInputAlt0d7_KjU(), intercomTheme118.getColors(c1086gP, i41111112).m637getInputAlt0d7_KjU(), intercomTheme118.getColors(c1086gP, i41111112).m624getBubbleBackground0d7_KjU(), intercomTheme118.getColors(c1086gP, i41111112).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC118.f12352i : j, textFieldColorsC118.j, textFieldColorsC118.f12353k, j1117, j1117, ((-14837) & 8192) != 0 ? textFieldColorsC118.f12356n : j1117, textFieldColorsC118.f12357o, textFieldColorsC118.f12358p, textFieldColorsC118.f12359q, textFieldColorsC118.f12360r, textFieldColorsC118.f12361s, textFieldColorsC118.f12362t, textFieldColorsC118.f12363u, textFieldColorsC118.f12364v, textFieldColorsC118.f12365w, textFieldColorsC118.f12366x, textFieldColorsC118.f12367y, textFieldColorsC118.f12368z, textFieldColorsC118.f12327A, textFieldColorsC118.f12328B, textFieldColorsC118.f12329C, textFieldColorsC118.f12330D, textFieldColorsC118.f12331E, textFieldColorsC118.f12332F, textFieldColorsC118.f12333G, textFieldColorsC118.f12334H, textFieldColorsC118.f12335I, textFieldColorsC118.f12336J, textFieldColorsC118.f12337K, textFieldColorsC118.f12338L, textFieldColorsC118.f12339M, textFieldColorsC118.f12340N, textFieldColorsC118.f12341O, textFieldColorsC118.f12342P, textFieldColorsC118.f12343Q), c1086g, ((i41111111 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i41111111 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                i40 = i39;
                f12 = f11110;
                h11 = h1119;
                i41 = i38;
                lVar2 = c2326c;
                str5 = str4;
                z17 = z15;
                str6 = str3;
                i42 = i37;
                z18 = z14;
                pVar3 = pVar2;
                z19 = z16;
            } else {
                if (i43 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i44 != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                if (i46 != 0) {
                    h10 = null;
                } else {
                    h10 = h8;
                }
                if (i18 != 0) {
                    i37 = Integer.MAX_VALUE;
                } else {
                    i37 = i10;
                }
                if (i20 != 0) {
                    z14 = false;
                } else {
                    z14 = z10;
                }
                if (i22 != 0) {
                    c2326c = new C2326c(3);
                } else {
                    c2326c = lVar;
                }
                if (i24 != 0) {
                    i38 = 1;
                } else {
                    i38 = i11;
                }
                if (i26 != 0) {
                    i39 = 1;
                } else {
                    i39 = i12;
                }
                if (i28 != 0) {
                    z15 = false;
                } else {
                    z15 = z11;
                }
                if (i30 != 0) {
                    pVar2 = null;
                } else {
                    pVar2 = pVar;
                }
                if (i33 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i35 != 0) {
                    f11 = Float.NaN;
                } else {
                    f11 = f10;
                }
                c1086gP.L(-652106389);
                if (h10 == null) {
                    jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
                } else {
                    jB = h10.f13506a;
                }
                c1086gP.T(false);
                c1086gP.L(-652100754);
                objF = c1086gP.f();
                c0153a = InterfaceC1084f.a.f12980a;
                if (objF == c0153a) {
                    objF = new androidx.compose.foundation.relocation.b();
                    c1086gP.E(objF);
                }
                final androidx.compose.foundation.relocation.a aVar119 = (androidx.compose.foundation.relocation.a) objF;
                c1086gP.T(false);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                    c1086gP.E(objF2);
                }
                final A a1118 = (A) objF2;
                int i41111113 = i32;
                H h11110 = h10;
                IntercomTheme intercomTheme119 = IntercomTheme.INSTANCE;
                float f11111 = f11;
                int i41111114 = IntercomTheme.$stable;
                androidx.compose.ui.h hVarA119 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme119.getShapes(c1086gP, i41111114).f12430b), intercomTheme119.getShapes(c1086gP, i41111114).f12430b), aVar119), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a1118, aVar119, (y) obj);
                    }
                });
                TextFieldDefaults textFieldDefaults119 = TextFieldDefaults.f12369a;
                TextFieldColors textFieldColorsC119 = TextFieldDefaults.c(c1086gP, 6);
                long j1118 = H.f13503k;
                c1086g = c1086gP;
                TextFieldKt.a(str3, onTextChanged, hVarA119, z16, false, intercomTheme119.getTypography(c1086gP, i41111114).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i41111115) {
                        if ((i41111115 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else {
                            TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                        }
                    }
                }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                    @Override // Ia.p
                    public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                        invoke(interfaceC1084f2, num.intValue());
                        return r.f47939a;
                    }

                    public final void invoke(InterfaceC1084f interfaceC1084f2, int i41111115) {
                        if ((i41111115 & 11) == 2 && interfaceC1084f2.s()) {
                            interfaceC1084f2.w();
                        } else if (z15) {
                            IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                        }
                    }
                }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme119.getShapes(c1086gP, i41111114).f12430b, textFieldColorsC119.a(((-14837) & 1) != 0 ? textFieldColorsC119.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC119.f12345b : 0L, intercomTheme119.getColors(c1086gP, i41111114).m630getDescriptionText0d7_KjU(), textFieldColorsC119.f12347d, intercomTheme119.getColors(c1086gP, i41111114).m637getInputAlt0d7_KjU(), intercomTheme119.getColors(c1086gP, i41111114).m637getInputAlt0d7_KjU(), intercomTheme119.getColors(c1086gP, i41111114).m624getBubbleBackground0d7_KjU(), intercomTheme119.getColors(c1086gP, i41111114).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC119.f12352i : j, textFieldColorsC119.j, textFieldColorsC119.f12353k, j1118, j1118, ((-14837) & 8192) != 0 ? textFieldColorsC119.f12356n : j1118, textFieldColorsC119.f12357o, textFieldColorsC119.f12358p, textFieldColorsC119.f12359q, textFieldColorsC119.f12360r, textFieldColorsC119.f12361s, textFieldColorsC119.f12362t, textFieldColorsC119.f12363u, textFieldColorsC119.f12364v, textFieldColorsC119.f12365w, textFieldColorsC119.f12366x, textFieldColorsC119.f12367y, textFieldColorsC119.f12368z, textFieldColorsC119.f12327A, textFieldColorsC119.f12328B, textFieldColorsC119.f12329C, textFieldColorsC119.f12330D, textFieldColorsC119.f12331E, textFieldColorsC119.f12332F, textFieldColorsC119.f12333G, textFieldColorsC119.f12334H, textFieldColorsC119.f12335I, textFieldColorsC119.f12336J, textFieldColorsC119.f12337K, textFieldColorsC119.f12338L, textFieldColorsC119.f12339M, textFieldColorsC119.f12340N, textFieldColorsC119.f12341O, textFieldColorsC119.f12342P, textFieldColorsC119.f12343Q), c1086g, ((i41111113 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i41111113 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
                i40 = i39;
                f12 = f11111;
                h11 = h11110;
                i41 = i38;
                lVar2 = c2326c;
                str5 = str4;
                z17 = z15;
                str6 = str3;
                i42 = i37;
                z18 = z14;
                pVar3 = pVar2;
                z19 = z16;
            }
            c1105p0V = c1086g.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i32 |= 3072;
        if ((i45 & 1533916891) != 306783378) {
            if (i43 != 0) {
                str3 = "";
            } else {
                str3 = str;
            }
            if (i44 != 0) {
                str4 = "";
            } else {
                str4 = str2;
            }
            if (i46 != 0) {
                h10 = null;
            } else {
                h10 = h8;
            }
            if (i18 != 0) {
                i37 = Integer.MAX_VALUE;
            } else {
                i37 = i10;
            }
            if (i20 != 0) {
                z14 = false;
            } else {
                z14 = z10;
            }
            if (i22 != 0) {
                c2326c = new C2326c(3);
            } else {
                c2326c = lVar;
            }
            if (i24 != 0) {
                i38 = 1;
            } else {
                i38 = i11;
            }
            if (i26 != 0) {
                i39 = 1;
            } else {
                i39 = i12;
            }
            if (i28 != 0) {
                z15 = false;
            } else {
                z15 = z11;
            }
            if (i30 != 0) {
                pVar2 = null;
            } else {
                pVar2 = pVar;
            }
            if (i33 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            if (i35 != 0) {
                f11 = Float.NaN;
            } else {
                f11 = f10;
            }
            c1086gP.L(-652106389);
            if (h10 == null) {
                jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
            } else {
                jB = h10.f13506a;
            }
            c1086gP.T(false);
            c1086gP.L(-652100754);
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = new androidx.compose.foundation.relocation.b();
                c1086gP.E(objF);
            }
            final androidx.compose.foundation.relocation.a aVar1110 = (androidx.compose.foundation.relocation.a) objF;
            c1086gP.T(false);
            objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                c1086gP.E(objF2);
            }
            final A a1119 = (A) objF2;
            int i41111115 = i32;
            H h11111 = h10;
            IntercomTheme intercomTheme1110 = IntercomTheme.INSTANCE;
            float f11112 = f11;
            int i41111116 = IntercomTheme.$stable;
            androidx.compose.ui.h hVarA1110 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme1110.getShapes(c1086gP, i41111116).f12430b), intercomTheme1110.getShapes(c1086gP, i41111116).f12430b), aVar1110), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a1119, aVar1110, (y) obj);
                }
            });
            TextFieldDefaults textFieldDefaults1110 = TextFieldDefaults.f12369a;
            TextFieldColors textFieldColorsC1110 = TextFieldDefaults.c(c1086gP, 6);
            long j1119 = H.f13503k;
            c1086g = c1086gP;
            TextFieldKt.a(str3, onTextChanged, hVarA1110, z16, false, intercomTheme1110.getTypography(c1086gP, i41111116).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i41111117) {
                    if ((i41111117 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                    }
                }
            }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i41111117) {
                    if ((i41111117 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else if (z15) {
                        IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                    }
                }
            }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme1110.getShapes(c1086gP, i41111116).f12430b, textFieldColorsC1110.a(((-14837) & 1) != 0 ? textFieldColorsC1110.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC1110.f12345b : 0L, intercomTheme1110.getColors(c1086gP, i41111116).m630getDescriptionText0d7_KjU(), textFieldColorsC1110.f12347d, intercomTheme1110.getColors(c1086gP, i41111116).m637getInputAlt0d7_KjU(), intercomTheme1110.getColors(c1086gP, i41111116).m637getInputAlt0d7_KjU(), intercomTheme1110.getColors(c1086gP, i41111116).m624getBubbleBackground0d7_KjU(), intercomTheme1110.getColors(c1086gP, i41111116).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC1110.f12352i : j, textFieldColorsC1110.j, textFieldColorsC1110.f12353k, j1119, j1119, ((-14837) & 8192) != 0 ? textFieldColorsC1110.f12356n : j1119, textFieldColorsC1110.f12357o, textFieldColorsC1110.f12358p, textFieldColorsC1110.f12359q, textFieldColorsC1110.f12360r, textFieldColorsC1110.f12361s, textFieldColorsC1110.f12362t, textFieldColorsC1110.f12363u, textFieldColorsC1110.f12364v, textFieldColorsC1110.f12365w, textFieldColorsC1110.f12366x, textFieldColorsC1110.f12367y, textFieldColorsC1110.f12368z, textFieldColorsC1110.f12327A, textFieldColorsC1110.f12328B, textFieldColorsC1110.f12329C, textFieldColorsC1110.f12330D, textFieldColorsC1110.f12331E, textFieldColorsC1110.f12332F, textFieldColorsC1110.f12333G, textFieldColorsC1110.f12334H, textFieldColorsC1110.f12335I, textFieldColorsC1110.f12336J, textFieldColorsC1110.f12337K, textFieldColorsC1110.f12338L, textFieldColorsC1110.f12339M, textFieldColorsC1110.f12340N, textFieldColorsC1110.f12341O, textFieldColorsC1110.f12342P, textFieldColorsC1110.f12343Q), c1086g, ((i41111115 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i41111115 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
            i40 = i39;
            f12 = f11112;
            h11 = h11111;
            i41 = i38;
            lVar2 = c2326c;
            str5 = str4;
            z17 = z15;
            str6 = str3;
            i42 = i37;
            z18 = z14;
            pVar3 = pVar2;
            z19 = z16;
        } else {
            if (i43 != 0) {
                str3 = "";
            } else {
                str3 = str;
            }
            if (i44 != 0) {
                str4 = "";
            } else {
                str4 = str2;
            }
            if (i46 != 0) {
                h10 = null;
            } else {
                h10 = h8;
            }
            if (i18 != 0) {
                i37 = Integer.MAX_VALUE;
            } else {
                i37 = i10;
            }
            if (i20 != 0) {
                z14 = false;
            } else {
                z14 = z10;
            }
            if (i22 != 0) {
                c2326c = new C2326c(3);
            } else {
                c2326c = lVar;
            }
            if (i24 != 0) {
                i38 = 1;
            } else {
                i38 = i11;
            }
            if (i26 != 0) {
                i39 = 1;
            } else {
                i39 = i12;
            }
            if (i28 != 0) {
                z15 = false;
            } else {
                z15 = z11;
            }
            if (i30 != 0) {
                pVar2 = null;
            } else {
                pVar2 = pVar;
            }
            if (i33 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            if (i35 != 0) {
                f11 = Float.NaN;
            } else {
                f11 = f10;
            }
            c1086gP.L(-652106389);
            if (h10 == null) {
                jB = H.b(0.1f, IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU());
            } else {
                jB = h10.f13506a;
            }
            c1086gP.T(false);
            c1086gP.L(-652100754);
            objF = c1086gP.f();
            c0153a = InterfaceC1084f.a.f12980a;
            if (objF == c0153a) {
                objF = new androidx.compose.foundation.relocation.b();
                c1086gP.E(objF);
            }
            final androidx.compose.foundation.relocation.a aVar1111 = (androidx.compose.foundation.relocation.a) objF;
            c1086gP.T(false);
            objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = E.f(EmptyCoroutineContext.f43032b, c1086gP);
                c1086gP.E(objF2);
            }
            final A a11110 = (A) objF2;
            int i41111117 = i32;
            H h11112 = h10;
            IntercomTheme intercomTheme1111 = IntercomTheme.INSTANCE;
            float f11113 = f11;
            int i41111118 = IntercomTheme.$stable;
            androidx.compose.ui.h hVarA1111 = androidx.compose.ui.focus.h.a(androidx.compose.foundation.relocation.c.a(A8.p.r(C0935g.a(W.b(W.d(androidx.compose.ui.h.a.f13984b, 1.0f), 0.0f, f11, 1), 1, jB, intercomTheme1111.getShapes(c1086gP, i41111118).f12430b), intercomTheme1111.getShapes(c1086gP, i41111118).f12430b), aVar1111), new Ia.l() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.l
                @Override // Ia.l
                public final Object invoke(Object obj) {
                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$2(a11110, aVar1111, (y) obj);
                }
            });
            TextFieldDefaults textFieldDefaults1111 = TextFieldDefaults.f12369a;
            TextFieldColors textFieldColorsC1111 = TextFieldDefaults.c(c1086gP, 6);
            long j11110 = H.f13503k;
            c1086g = c1086gP;
            TextFieldKt.a(str3, onTextChanged, hVarA1111, z16, false, intercomTheme1111.getTypography(c1086gP, i41111118).getType04(), null, androidx.compose.runtime.internal.a.b(-712506390, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$3
                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i41111119) {
                    if ((i41111119 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else {
                        TextKt.b(str4, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(interfaceC1084f2, IntercomTheme.$stable).getType04(), interfaceC1084f2, 0, 0, 65534);
                    }
                }
            }, c1086gP), pVar2, androidx.compose.runtime.internal.a.b(583948524, new p<InterfaceC1084f, Integer, r>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt$TextInputPill$4
                @Override // Ia.p
                public /* bridge */ /* synthetic */ r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    invoke(interfaceC1084f2, num.intValue());
                    return r.f47939a;
                }

                public final void invoke(InterfaceC1084f interfaceC1084f2, int i41111119) {
                    if ((i41111119 & 11) == 2 && interfaceC1084f2.s()) {
                        interfaceC1084f2.w();
                    } else if (z15) {
                        IconKt.b(p306z.c.a(), "Looks good!", PaddingKt.f(androidx.compose.ui.h.a.f13984b, 16), IntercomTheme.INSTANCE.getColors(interfaceC1084f2, IntercomTheme.$stable).m617getActive0d7_KjU(), interfaceC1084f2, 432, 0);
                    }
                }
            }, c1086gP), null, null, null, false, null, new androidx.compose.foundation.text.k(null, i38, i39, R.styleable.AppCompatTheme_tooltipFrameBackground), new androidx.compose.foundation.text.j(null, c2326c, null, 59), z14, i37, 0, null, intercomTheme1111.getShapes(c1086gP, i41111118).f12430b, textFieldColorsC1111.a(((-14837) & 1) != 0 ? textFieldColorsC1111.f12344a : 0L, ((-14837) & 2) != 0 ? textFieldColorsC1111.f12345b : 0L, intercomTheme1111.getColors(c1086gP, i41111118).m630getDescriptionText0d7_KjU(), textFieldColorsC1111.f12347d, intercomTheme1111.getColors(c1086gP, i41111118).m637getInputAlt0d7_KjU(), intercomTheme1111.getColors(c1086gP, i41111118).m637getInputAlt0d7_KjU(), intercomTheme1111.getColors(c1086gP, i41111118).m624getBubbleBackground0d7_KjU(), intercomTheme1111.getColors(c1086gP, i41111118).m637getInputAlt0d7_KjU(), ((-14837) & 256) != 0 ? textFieldColorsC1111.f12352i : j, textFieldColorsC1111.j, textFieldColorsC1111.f12353k, j11110, j11110, ((-14837) & 8192) != 0 ? textFieldColorsC1111.f12356n : j11110, textFieldColorsC1111.f12357o, textFieldColorsC1111.f12358p, textFieldColorsC1111.f12359q, textFieldColorsC1111.f12360r, textFieldColorsC1111.f12361s, textFieldColorsC1111.f12362t, textFieldColorsC1111.f12363u, textFieldColorsC1111.f12364v, textFieldColorsC1111.f12365w, textFieldColorsC1111.f12366x, textFieldColorsC1111.f12367y, textFieldColorsC1111.f12368z, textFieldColorsC1111.f12327A, textFieldColorsC1111.f12328B, textFieldColorsC1111.f12329C, textFieldColorsC1111.f12330D, textFieldColorsC1111.f12331E, textFieldColorsC1111.f12332F, textFieldColorsC1111.f12333G, textFieldColorsC1111.f12334H, textFieldColorsC1111.f12335I, textFieldColorsC1111.f12336J, textFieldColorsC1111.f12337K, textFieldColorsC1111.f12338L, textFieldColorsC1111.f12339M, textFieldColorsC1111.f12340N, textFieldColorsC1111.f12341O, textFieldColorsC1111.f12342P, textFieldColorsC1111.f12343Q), c1086g, ((i41111117 << 3) & 7168) | (i45 & 14) | 817889280 | ((i45 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | ((i41111117 << 21) & 234881024), ((i45 << 3) & 29360128) | ((i45 << 9) & 234881024), 0, 1604688);
            i40 = i39;
            f12 = f11113;
            h11 = h11112;
            i41 = i38;
            lVar2 = c2326c;
            str5 = str4;
            z17 = z15;
            str6 = str3;
            i42 = i37;
            z18 = z14;
            pVar3 = pVar2;
            z19 = z16;
        }
        c1105p0V = c1086g.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.survey.ui.questiontype.text.m
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TextInputPillKt.TextInputPill_g5ZjG94$lambda$3(str6, str5, onTextChanged, h11, j, i42, z18, lVar2, i41, i40, z17, pVar3, z19, f12, i13, i14, i15, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    public static final void TextInputPillDisabled(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1100722979);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m456getLambda5$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2270b(i10, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TextInputPillDisabled$lambda$8(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TextInputPillDisabled(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void TextInputPillError(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-175520743);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m455getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new J(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TextInputPillError$lambda$7(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TextInputPillError(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void TextInputPillPlaceholder(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1437391364);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m452getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2282h(i10, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TextInputPillPlaceholder$lambda$4(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TextInputPillPlaceholder(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void TextInputPillUnchecked(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-869352961);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m453getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2272c(i10, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TextInputPillUnchecked$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TextInputPillUnchecked(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void TextInputPillValidated(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(559292703);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextInputPillKt.INSTANCE.m454getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2274d(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TextInputPillValidated$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TextInputPillValidated(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TextInputPill_g5ZjG94$lambda$0(InterfaceC1000i interfaceC1000i) {
        kotlin.jvm.internal.i.e(interfaceC1000i, "<this>");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TextInputPill_g5ZjG94$lambda$2(A coroutineScope, androidx.compose.foundation.relocation.a bringIntoViewRequester, y it) {
        kotlin.jvm.internal.i.e(coroutineScope, "$coroutineScope");
        kotlin.jvm.internal.i.e(bringIntoViewRequester, "$bringIntoViewRequester");
        kotlin.jvm.internal.i.e(it, "it");
        if (it.b()) {
            C2680e.c(coroutineScope, null, null, new TextInputPillKt$TextInputPill$2$1(bringIntoViewRequester, null), 3);
        }
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r TextInputPill_g5ZjG94$lambda$3(String str, String str2, Ia.l onTextChanged, H h8, long j, int i10, boolean z10, Ia.l lVar, int i11, int i12, boolean z11, p pVar, boolean z12, float f10, int i13, int i14, int i15, InterfaceC1084f interfaceC1084f, int i16) {
        kotlin.jvm.internal.i.e(onTextChanged, "$onTextChanged");
        m457TextInputPillg5ZjG94(str, str2, onTextChanged, h8, j, i10, z10, lVar, i11, i12, z11, pVar, z12, f10, interfaceC1084f, L4.b.l(i13 | 1), L4.b.l(i14), i15);
        return r.f47939a;
    }
}
