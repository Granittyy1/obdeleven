package io.intercom.android.sdk.m5.components;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import androidx.activity.compose.LocalActivityKt;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectableValueKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.List;
import kotlin.collections.EmptyList;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TopActionBar.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TopActionBarKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0138  */
    /* JADX WARN: Code duplicated, block: B:103:0x013e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0150  */
    /* JADX WARN: Code duplicated, block: B:112:0x0157  */
    /* JADX WARN: Code duplicated, block: B:114:0x015d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0161  */
    /* JADX WARN: Code duplicated, block: B:118:0x0169  */
    /* JADX WARN: Code duplicated, block: B:119:0x016c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0174  */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0185  */
    /* JADX WARN: Code duplicated, block: B:130:0x0188  */
    /* JADX WARN: Code duplicated, block: B:132:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0192  */
    /* JADX WARN: Code duplicated, block: B:142:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:161:0x0213  */
    /* JADX WARN: Code duplicated, block: B:163:0x0217  */
    /* JADX WARN: Code duplicated, block: B:164:0x021a  */
    /* JADX WARN: Code duplicated, block: B:166:0x021e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0221  */
    /* JADX WARN: Code duplicated, block: B:169:0x0225  */
    /* JADX WARN: Code duplicated, block: B:170:0x0228  */
    /* JADX WARN: Code duplicated, block: B:172:0x022c  */
    /* JADX WARN: Code duplicated, block: B:173:0x022f  */
    /* JADX WARN: Code duplicated, block: B:175:0x0233  */
    /* JADX WARN: Code duplicated, block: B:178:0x0238  */
    /* JADX WARN: Code duplicated, block: B:180:0x0245  */
    /* JADX WARN: Code duplicated, block: B:182:0x0249  */
    /* JADX WARN: Code duplicated, block: B:185:0x024f  */
    /* JADX WARN: Code duplicated, block: B:186:0x0261  */
    /* JADX WARN: Code duplicated, block: B:189:0x0266  */
    /* JADX WARN: Code duplicated, block: B:191:0x027c  */
    /* JADX WARN: Code duplicated, block: B:194:0x0282  */
    /* JADX WARN: Code duplicated, block: B:195:0x0291  */
    /* JADX WARN: Code duplicated, block: B:197:0x0296  */
    /* JADX WARN: Code duplicated, block: B:198:0x029d  */
    /* JADX WARN: Code duplicated, block: B:200:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:202:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:205:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:210:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:213:0x0324  */
    /* JADX WARN: Code duplicated, block: B:214:0x0328  */
    /* JADX WARN: Code duplicated, block: B:217:0x033d  */
    /* JADX WARN: Code duplicated, block: B:219:0x034b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0398  */
    /* JADX WARN: Code duplicated, block: B:223:0x039a  */
    /* JADX WARN: Code duplicated, block: B:226:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:230:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:233:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:234:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:237:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:239:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:242:0x0413 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:245:0x044a  */
    /* JADX WARN: Code duplicated, block: B:248:0x0452  */
    /* JADX WARN: Code duplicated, block: B:250:0x0456  */
    /* JADX WARN: Code duplicated, block: B:253:0x0462  */
    /* JADX WARN: Code duplicated, block: B:255:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:257:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:258:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:261:0x051a  */
    /* JADX WARN: Code duplicated, block: B:262:0x051e  */
    /* JADX WARN: Code duplicated, block: B:265:0x052b  */
    /* JADX WARN: Code duplicated, block: B:267:0x0539  */
    /* JADX WARN: Code duplicated, block: B:270:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:272:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:289:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:291:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:294:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:298:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00af  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:83:0x0106  */
    /* JADX WARN: Code duplicated, block: B:86:0x010f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0114  */
    /* JADX WARN: Code duplicated, block: B:91:0x011e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0124  */
    /* JADX WARN: Code duplicated, block: B:96:0x012d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0132  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: TopActionBar-NpQZenA, reason: not valid java name */
    public static final void m130TopActionBarNpQZenA(androidx.compose.ui.h hVar, String str, String str2, Integer num, List<AvatarWrapper> list, Ia.a<p293xa.r> aVar, Integer num2, boolean z10, long j, long j10, long j11, Ia.a<p293xa.r> aVar2, Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11, final int i12) {
        androidx.compose.ui.h hVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        final Ia.a<p293xa.r> aVar3;
        int i18;
        final Integer numValueOf;
        int i19;
        int i20;
        int i21;
        long j12;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        String str3;
        String str4;
        Integer num3;
        List<AvatarWrapper> list2;
        boolean z11;
        long jM635getHeader0d7_KjU;
        final long jM642getOnHeader0d7_KjU;
        long jM642getOnHeader0d7_KjU2;
        int i28;
        Ia.a<p293xa.r> eVar;
        Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar2;
        boolean z12;
        Integer num4;
        Activity activity;
        final Window window;
        androidx.compose.ui.h.a aVar4;
        String str5;
        String str6;
        int i29;
        boolean z13;
        Ia.a<ComposeUiNode> aVar5;
        List<AvatarWrapper> list3;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        long j13;
        boolean z14;
        Object objF;
        boolean z15;
        int i30;
        androidx.compose.foundation.layout.V v10;
        final long j14;
        int i31;
        float f10;
        int i32;
        boolean z16;
        Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar3;
        final long j15;
        final Ia.q<? super androidx.compose.foundation.layout.U, ? super InterfaceC1084f, ? super Integer, p293xa.r> qVar4;
        final long j16;
        final Integer num5;
        final String str7;
        final boolean z17;
        final List<AvatarWrapper> list4;
        final androidx.compose.ui.h hVar3;
        final Ia.a<p293xa.r> aVar6;
        final long j17;
        C1105p0 c1105p0V;
        int i33;
        int i34;
        int i35;
        C1086g c1086gP = interfaceC1084f.p(-1160200926);
        int i36 = i12 & 1;
        int i37 = 2;
        if (i36 != 0) {
            i13 = i10 | 6;
            hVar2 = hVar;
        } else {
            hVar2 = hVar;
            if ((i10 & 14) == 0) {
                i13 = i10 | (c1086gP.K(hVar2) ? 4 : 2);
            } else {
                i13 = i10;
            }
        }
        int i38 = i12 & 2;
        if (i38 != 0) {
            i13 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i13 |= c1086gP.K(str) ? 32 : 16;
        }
        int i39 = i13;
        int i40 = i12 & 4;
        if (i40 == 0) {
            if ((i10 & 896) == 0) {
                i39 |= c1086gP.K(str2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    if (c1086gP.K(num)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i39 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    i39 |= 8192;
                }
                i17 = i12 & 32;
                if (i17 != 0) {
                    i39 |= 196608;
                    aVar3 = aVar;
                } else {
                    aVar3 = aVar;
                    if ((i10 & 458752) == 0) {
                        if (c1086gP.k(aVar3)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i39 |= i18;
                    }
                }
                if ((i10 & 3670016) == 0) {
                    numValueOf = num2;
                    if ((i12 & 64) == 0 || !c1086gP.K(numValueOf)) {
                        i35 = 524288;
                    } else {
                        i35 = 1048576;
                    }
                    i39 |= i35;
                } else {
                    numValueOf = num2;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i39 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (c1086gP.c(z10)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i39 |= i20;
                }
                if ((i10 & 234881024) == 0) {
                    int i41 = i39;
                    j12 = j;
                    if ((i12 & 256) == 0 || !c1086gP.i(j12)) {
                        i34 = 33554432;
                    } else {
                        i34 = 67108864;
                    }
                    i21 = i41 | i34;
                } else {
                    i21 = i39;
                    j12 = j;
                }
                if ((i10 & 1879048192) != 0) {
                    if ((i12 & 512) == 0 || !c1086gP.i(j10)) {
                        i33 = 268435456;
                    } else {
                        i33 = 536870912;
                    }
                    i21 |= i33;
                }
                if ((i11 & 14) == 0) {
                    if ((i12 & 1024) == 0 && c1086gP.i(j11)) {
                        i37 = 4;
                    }
                    i22 = i11 | i37;
                } else {
                    i22 = i11;
                }
                i23 = 2048 & i12;
                if (i23 != 0) {
                    if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                        if (c1086gP.k(aVar2)) {
                            i24 = 32;
                        } else {
                            i24 = 16;
                        }
                        i22 |= i24;
                    }
                    i25 = i12 & 4096;
                    if (i25 != 0) {
                        i22 |= 384;
                    } else if ((i11 & 896) != 0) {
                        if (c1086gP.k(qVar)) {
                            i26 = 256;
                        } else {
                            i26 = 128;
                        }
                        i22 |= i26;
                    }
                    if (i16 != 16 && (i21 & 1533916891) == 306783378 && (i22 & 731) == 146 && c1086gP.s()) {
                        c1086gP.w();
                        str6 = str;
                        str7 = str2;
                        num5 = num;
                        list4 = list;
                        z17 = z10;
                        j16 = j11;
                        aVar6 = aVar2;
                        qVar4 = qVar;
                        hVar3 = hVar2;
                        j17 = j12;
                        j15 = j10;
                    } else {
                        c1086gP.r0();
                        if ((i10 & 1) != 0 || c1086gP.a0()) {
                            i27 = i22;
                            if (i36 != 0) {
                                hVar2 = androidx.compose.ui.h.a.f13984b;
                            }
                            if (i38 != 0) {
                                str3 = "";
                            } else {
                                str3 = str;
                            }
                            if (i40 != 0) {
                                str4 = null;
                            } else {
                                str4 = str2;
                            }
                            if (i14 != 0) {
                                num3 = null;
                            } else {
                                num3 = num;
                            }
                            if (i16 != 0) {
                                list2 = EmptyList.f42983b;
                            } else {
                                list2 = list;
                            }
                            if (i17 != 0) {
                                aVar3 = null;
                            }
                            if ((i12 & 64) != 0) {
                                numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                                i21 &= -3670017;
                            }
                            if (i19 != 0) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            if ((256 & i12) != 0) {
                                jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                                i21 &= -234881025;
                            } else {
                                jM635getHeader0d7_KjU = j12;
                            }
                            if ((i12 & 512) != 0) {
                                jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                                i21 &= -1879048193;
                            } else {
                                jM642getOnHeader0d7_KjU = j10;
                            }
                            if ((1024 & i12) != 0) {
                                jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                                i28 = i27 & (-15);
                            } else {
                                jM642getOnHeader0d7_KjU2 = j11;
                                i28 = i27;
                            }
                            if (i23 != 0) {
                                eVar = new coil.e(1);
                            } else {
                                eVar = aVar2;
                            }
                            if (i25 != 0) {
                                qVar2 = null;
                            } else {
                                qVar2 = qVar;
                            }
                            z12 = z11;
                            num4 = num3;
                        } else {
                            c1086gP.w();
                            if ((i12 & 64) != 0) {
                                i21 &= -3670017;
                            }
                            if ((256 & i12) != 0) {
                                i21 &= -234881025;
                            }
                            if ((i12 & 512) != 0) {
                                i21 &= -1879048193;
                            }
                            if ((1024 & i12) != 0) {
                                i22 &= -15;
                            }
                            str3 = str;
                            str4 = str2;
                            num4 = num;
                            list2 = list;
                            z12 = z10;
                            jM642getOnHeader0d7_KjU2 = j11;
                            eVar = aVar2;
                            qVar2 = qVar;
                            i28 = i22;
                            jM635getHeader0d7_KjU = j12;
                            i21 = i21;
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        c1086gP.U();
                        activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
                        if (activity != null) {
                            window = activity.getWindow();
                        } else {
                            window = null;
                        }
                        c1086gP.L(-1152540944);
                        if (window != null) {
                            Ia.a<p293xa.r> aVar7 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                                @Override // Ia.a
                                public final Object invoke() {
                                    return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                                }
                            };
                            androidx.compose.runtime.B b10 = androidx.compose.runtime.E.f12831a;
                            c1086gP.l(aVar7);
                            p293xa.r rVar = p293xa.r.f47939a;
                        }
                        c1086gP.T(false);
                        aVar4 = androidx.compose.ui.h.a.f13984b;
                        Integer num6 = num4;
                        C0945e.k kVar = C0945e.f10286c;
                        str5 = str4;
                        androidx.compose.ui.f.a aVar8 = androidx.compose.ui.d.a.f13346m;
                        str6 = str3;
                        C0953m c0953mA = C0952l.a(kVar, aVar8, c1086gP, 0);
                        i29 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar4);
                        ComposeUiNode.f14331c0.getClass();
                        z13 = z12;
                        aVar5 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        list3 = list2;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar2 = ComposeUiNode.Companion.f14337f;
                        R0.a(pVar2, c1086gP, c0953mA);
                        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar3 = ComposeUiNode.Companion.f14336e;
                        R0.a(pVar3, c1086gP, interfaceC1089h0P);
                        pVar = ComposeUiNode.Companion.f14338g;
                        j13 = jM642getOnHeader0d7_KjU;
                        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i29))) {
                            J4.i.d(i29, c1086gP, i29, pVar);
                        }
                        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar4, c1086gP, hVarC);
                        float f11 = 4;
                        androidx.compose.ui.h hVarJ = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f11, 0.0f, 11);
                        c1086gP.L(369283361);
                        androidx.compose.ui.h hVar4 = hVar2;
                        if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objF = c1086gP.f();
                        if (!z14 || objF == InterfaceC1084f.a.f12980a) {
                            z15 = false;
                            objF = new O0(0 == true ? 1 : 0, eVar);
                            c1086gP.E(objF);
                        } else {
                            z15 = false;
                        }
                        c1086gP.T(z15);
                        Ia.a<p293xa.r> aVar9 = eVar;
                        long j18 = jM635getHeader0d7_KjU;
                        androidx.compose.ui.h hVarC2 = ClickableKt.c(hVarJ, z15, null, (Ia.a) objF, 7);
                        androidx.compose.ui.f.b bVar = androidx.compose.ui.d.a.f13344k;
                        C0945e.j jVar = C0945e.f10284a;
                        androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(jVar, bVar, c1086gP, 48);
                        i30 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarC2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar2, c1086gP, tA);
                        R0.a(pVar3, c1086gP, interfaceC1089h0P2);
                        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i30))) {
                            J4.i.d(i30, c1086gP, i30, pVar);
                        }
                        R0.a(pVar4, c1086gP, hVarC3);
                        v10 = androidx.compose.foundation.layout.V.f10222a;
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f11));
                        c1086gP.L(-1851695824);
                        if (aVar3 != null || numValueOf == null) {
                            j14 = j13;
                        } else {
                            j14 = j13;
                            IconButtonKt.b(aVar3, null, false, null, null, androidx.compose.runtime.internal.a.b(1988527504, new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: io.intercom.android.sdk.m5.components.TopActionBarKt$TopActionBar$3$2$1
                                @Override // Ia.p
                                public /* bridge */ /* synthetic */ p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num7) {
                                    invoke(interfaceC1084f2, num7.intValue());
                                    return p293xa.r.f47939a;
                                }

                                public final void invoke(InterfaceC1084f interfaceC1084f2, int i42) {
                                    if ((i42 & 11) == 2 && interfaceC1084f2.s()) {
                                        interfaceC1084f2.w();
                                    } else {
                                        IconKt.a(U.c.a(numValueOf.intValue(), interfaceC1084f2, 0), S4.o.p(interfaceC1084f2, io.intercom.android.sdk.R.string.intercom_navigation_back), androidx.compose.foundation.layout.W.m(androidx.compose.ui.h.a.f13984b, 24), j14, interfaceC1084f2, 392, 0);
                                    }
                                }
                            }, c1086gP), c1086gP, ((i21 >> 15) & 14) | 196608, 30);
                        }
                        c1086gP.T(false);
                        if (aVar3 != null) {
                            i31 = 8;
                        } else {
                            i31 = 16;
                        }
                        f10 = i31;
                        Ia.a<p293xa.r> aVar10 = aVar3;
                        if (list3.size() == 1) {
                            c1086gP.L(-1567408864);
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                            AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                            c1086gP.T(false);
                        } else if (list3.size() > 1) {
                            c1086gP.L(-1567107141);
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                            AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                            c1086gP.T(false);
                        } else {
                            c1086gP.L(-1566896682);
                            c1086gP.T(false);
                        }
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
                        androidx.compose.ui.h hVarB = v10.b(aVar4, true);
                        Integer num7 = numValueOf;
                        C0953m c0953mA2 = C0952l.a(kVar, aVar8, c1086gP, 48);
                        i32 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                        androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarB);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar5);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar2, c1086gP, c0953mA2);
                        R0.a(pVar3, c1086gP, interfaceC1089h0P3);
                        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i32))) {
                            J4.i.d(i32, c1086gP, i32, pVar);
                        }
                        R0.a(pVar4, c1086gP, hVarC4);
                        IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                        int i42 = IntercomTheme.$stable;
                        TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme.getTypography(c1086gP, i42).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
                        c1086gP.L(1212144132);
                        if (str5 != null || str5.length() == 0) {
                            z16 = true;
                        } else {
                            androidx.compose.foundation.layout.T tA2 = androidx.compose.foundation.layout.S.a(jVar, bVar, c1086gP, 48);
                            int i43 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                            androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, aVar4);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar5);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar2, c1086gP, tA2);
                            R0.a(pVar3, c1086gP, interfaceC1089h0P4);
                            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i43))) {
                                J4.i.d(i43, c1086gP, i43, pVar);
                            }
                            R0.a(pVar4, c1086gP, hVarC5);
                            c1086gP.L(559059820);
                            if (num6 != null) {
                                IconKt.a(U.c.a(num6.intValue(), c1086gP, (i21 >> 9) & 14), null, null, jM642getOnHeader0d7_KjU2, c1086gP, ((i28 << 9) & 7168) | 56, 4);
                                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f11));
                                p293xa.r rVar2 = p293xa.r.f47939a;
                            }
                            c1086gP.T(false);
                            TextKt.b(str5, null, jM642getOnHeader0d7_KjU2, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, intercomTheme.getTypography(c1086gP, i42).getType05(), c1086gP, ((i21 >> 6) & 14) | ((i28 << 6) & 896), 3120, 54778);
                            z16 = true;
                            c1086gP.T(true);
                        }
                        c1086gP.T(false);
                        c1086gP.T(z16);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
                        c1086gP.L(-1851611912);
                        if (qVar2 == 0) {
                            qVar3 = qVar2;
                        } else {
                            qVar3 = qVar2;
                            qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                            p293xa.r rVar3 = p293xa.r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        c1086gP.L(369373838);
                        if (!kotlin.text.n.S(str6)) {
                            IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        j15 = j14;
                        qVar4 = qVar3;
                        j16 = jM642getOnHeader0d7_KjU2;
                        num5 = num6;
                        str7 = str5;
                        z17 = z13;
                        list4 = list3;
                        aVar3 = aVar10;
                        hVar3 = hVar4;
                        aVar6 = aVar9;
                        j17 = j18;
                        numValueOf = num7;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        final String str8 = str6;
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.P0
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(hVar3, str8, str7, num5, list4, aVar3, numValueOf, z17, j17, j15, j16, aVar6, qVar4, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i22 |= 48;
                i25 = i12 & 4096;
                if (i25 != 0) {
                    i22 |= 384;
                } else if ((i11 & 896) != 0) {
                    if (c1086gP.k(qVar)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i22 |= i26;
                }
                if (i16 != 16) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        i27 = i22;
                        if (i36 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i38 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i40 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i16 != 0) {
                            list2 = EmptyList.f42983b;
                        } else {
                            list2 = list;
                        }
                        if (i17 != 0) {
                            aVar3 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                            i21 &= -3670017;
                        }
                        if (i19 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((256 & i12) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                            i21 &= -234881025;
                        } else {
                            jM635getHeader0d7_KjU = j12;
                        }
                        if ((i12 & 512) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i21 &= -1879048193;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if ((1024 & i12) != 0) {
                            jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i28 = i27 & (-15);
                        } else {
                            jM642getOnHeader0d7_KjU2 = j11;
                            i28 = i27;
                        }
                        if (i23 != 0) {
                            eVar = new coil.e(1);
                        } else {
                            eVar = aVar2;
                        }
                        if (i25 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        z12 = z11;
                        num4 = num3;
                    } else {
                        i27 = i22;
                        if (i36 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i38 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i40 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i16 != 0) {
                            list2 = EmptyList.f42983b;
                        } else {
                            list2 = list;
                        }
                        if (i17 != 0) {
                            aVar3 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                            i21 &= -3670017;
                        }
                        if (i19 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((256 & i12) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                            i21 &= -234881025;
                        } else {
                            jM635getHeader0d7_KjU = j12;
                        }
                        if ((i12 & 512) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i21 &= -1879048193;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if ((1024 & i12) != 0) {
                            jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i28 = i27 & (-15);
                        } else {
                            jM642getOnHeader0d7_KjU2 = j11;
                            i28 = i27;
                        }
                        if (i23 != 0) {
                            eVar = new coil.e(1);
                        } else {
                            eVar = aVar2;
                        }
                        if (i25 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        z12 = z11;
                        num4 = num3;
                    }
                    c1086gP.U();
                    activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
                    if (activity != null) {
                        window = activity.getWindow();
                    } else {
                        window = null;
                    }
                    c1086gP.L(-1152540944);
                    if (window != null) {
                        Ia.a<p293xa.r> aVar11 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                            @Override // Ia.a
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                            }
                        };
                        androidx.compose.runtime.B b11 = androidx.compose.runtime.E.f12831a;
                        c1086gP.l(aVar11);
                        p293xa.r rVar4 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    Integer num8 = num4;
                    C0945e.k kVar2 = C0945e.f10286c;
                    str5 = str4;
                    androidx.compose.ui.f.a aVar12 = androidx.compose.ui.d.a.f13346m;
                    str6 = str3;
                    C0953m c0953mA3 = C0952l.a(kVar2, aVar12, c1086gP, 0);
                    i29 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                    androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    z13 = z12;
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    list3 = list2;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar5 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar5, c1086gP, c0953mA3);
                    Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar6 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar6, c1086gP, interfaceC1089h0P5);
                    pVar = ComposeUiNode.Companion.f14338g;
                    j13 = jM642getOnHeader0d7_KjU;
                    if (c1086gP.f12995O) {
                        J4.i.d(i29, c1086gP, i29, pVar);
                    } else {
                        J4.i.d(i29, c1086gP, i29, pVar);
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar7 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar7, c1086gP, hVarC6);
                    float f12 = 4;
                    androidx.compose.ui.h hVarJ2 = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f12, 0.0f, 11);
                    c1086gP.L(369283361);
                    androidx.compose.ui.h hVar5 = hVar2;
                    if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objF = c1086gP.f();
                    if (z14) {
                        z15 = false;
                        objF = new O0(0 == true ? 1 : 0, eVar);
                        c1086gP.E(objF);
                    } else {
                        z15 = false;
                        objF = new O0(0 == true ? 1 : 0, eVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(z15);
                    Ia.a<p293xa.r> aVar13 = eVar;
                    long j19 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC7 = ClickableKt.c(hVarJ2, z15, null, (Ia.a) objF, 7);
                    androidx.compose.ui.f.b bVar2 = androidx.compose.ui.d.a.f13344k;
                    C0945e.j jVar2 = C0945e.f10284a;
                    androidx.compose.foundation.layout.T tA3 = androidx.compose.foundation.layout.S.a(jVar2, bVar2, c1086gP, 48);
                    i30 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                    androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarC7);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar5, c1086gP, tA3);
                    R0.a(pVar6, c1086gP, interfaceC1089h0P6);
                    if (c1086gP.f12995O) {
                        J4.i.d(i30, c1086gP, i30, pVar);
                    } else {
                        J4.i.d(i30, c1086gP, i30, pVar);
                    }
                    R0.a(pVar7, c1086gP, hVarC8);
                    v10 = androidx.compose.foundation.layout.V.f10222a;
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f12));
                    c1086gP.L(-1851695824);
                    if (aVar3 != null) {
                        j14 = j13;
                    } else {
                        j14 = j13;
                    }
                    c1086gP.T(false);
                    if (aVar3 != null) {
                        i31 = 8;
                    } else {
                        i31 = 16;
                    }
                    f10 = i31;
                    Ia.a<p293xa.r> aVar14 = aVar3;
                    if (list3.size() == 1) {
                        c1086gP.L(-1567408864);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                        AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                        c1086gP.T(false);
                    } else if (list3.size() > 1) {
                        c1086gP.L(-1567107141);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                        AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1566896682);
                        c1086gP.T(false);
                    }
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
                    androidx.compose.ui.h hVarB2 = v10.b(aVar4, true);
                    Integer num9 = numValueOf;
                    C0953m c0953mA4 = C0952l.a(kVar2, aVar12, c1086gP, 48);
                    i32 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                    androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVarB2);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar5, c1086gP, c0953mA4);
                    R0.a(pVar6, c1086gP, interfaceC1089h0P7);
                    if (c1086gP.f12995O) {
                        J4.i.d(i32, c1086gP, i32, pVar);
                    } else {
                        J4.i.d(i32, c1086gP, i32, pVar);
                    }
                    R0.a(pVar7, c1086gP, hVarC9);
                    IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                    int i44 = IntercomTheme.$stable;
                    TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme2.getTypography(c1086gP, i44).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
                    c1086gP.L(1212144132);
                    if (str5 != null) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    c1086gP.T(false);
                    c1086gP.T(z16);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
                    c1086gP.L(-1851611912);
                    if (qVar2 == 0) {
                        qVar3 = qVar2;
                    } else {
                        qVar3 = qVar2;
                        qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        p293xa.r rVar5 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.L(369373838);
                    if (!kotlin.text.n.S(str6)) {
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    j15 = j14;
                    qVar4 = qVar3;
                    j16 = jM642getOnHeader0d7_KjU2;
                    num5 = num8;
                    str7 = str5;
                    z17 = z13;
                    list4 = list3;
                    aVar3 = aVar14;
                    hVar3 = hVar5;
                    aVar6 = aVar13;
                    j17 = j19;
                    numValueOf = num9;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        i27 = i22;
                        if (i36 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i38 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i40 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i16 != 0) {
                            list2 = EmptyList.f42983b;
                        } else {
                            list2 = list;
                        }
                        if (i17 != 0) {
                            aVar3 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                            i21 &= -3670017;
                        }
                        if (i19 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((256 & i12) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                            i21 &= -234881025;
                        } else {
                            jM635getHeader0d7_KjU = j12;
                        }
                        if ((i12 & 512) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i21 &= -1879048193;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if ((1024 & i12) != 0) {
                            jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i28 = i27 & (-15);
                        } else {
                            jM642getOnHeader0d7_KjU2 = j11;
                            i28 = i27;
                        }
                        if (i23 != 0) {
                            eVar = new coil.e(1);
                        } else {
                            eVar = aVar2;
                        }
                        if (i25 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        z12 = z11;
                        num4 = num3;
                    } else {
                        i27 = i22;
                        if (i36 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i38 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i40 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i16 != 0) {
                            list2 = EmptyList.f42983b;
                        } else {
                            list2 = list;
                        }
                        if (i17 != 0) {
                            aVar3 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                            i21 &= -3670017;
                        }
                        if (i19 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((256 & i12) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                            i21 &= -234881025;
                        } else {
                            jM635getHeader0d7_KjU = j12;
                        }
                        if ((i12 & 512) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i21 &= -1879048193;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if ((1024 & i12) != 0) {
                            jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i28 = i27 & (-15);
                        } else {
                            jM642getOnHeader0d7_KjU2 = j11;
                            i28 = i27;
                        }
                        if (i23 != 0) {
                            eVar = new coil.e(1);
                        } else {
                            eVar = aVar2;
                        }
                        if (i25 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        z12 = z11;
                        num4 = num3;
                    }
                    c1086gP.U();
                    activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
                    if (activity != null) {
                        window = activity.getWindow();
                    } else {
                        window = null;
                    }
                    c1086gP.L(-1152540944);
                    if (window != null) {
                        Ia.a<p293xa.r> aVar15 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                            @Override // Ia.a
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                            }
                        };
                        androidx.compose.runtime.B b12 = androidx.compose.runtime.E.f12831a;
                        c1086gP.l(aVar15);
                        p293xa.r rVar6 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    Integer num10 = num4;
                    C0945e.k kVar3 = C0945e.f10286c;
                    str5 = str4;
                    androidx.compose.ui.f.a aVar16 = androidx.compose.ui.d.a.f13346m;
                    str6 = str3;
                    C0953m c0953mA5 = C0952l.a(kVar3, aVar16, c1086gP, 0);
                    i29 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                    androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    z13 = z12;
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    list3 = list2;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar8 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar8, c1086gP, c0953mA5);
                    Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar9 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar9, c1086gP, interfaceC1089h0P8);
                    pVar = ComposeUiNode.Companion.f14338g;
                    j13 = jM642getOnHeader0d7_KjU;
                    if (c1086gP.f12995O) {
                        J4.i.d(i29, c1086gP, i29, pVar);
                    } else {
                        J4.i.d(i29, c1086gP, i29, pVar);
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar10 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar10, c1086gP, hVarC10);
                    float f13 = 4;
                    androidx.compose.ui.h hVarJ3 = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f13, 0.0f, 11);
                    c1086gP.L(369283361);
                    androidx.compose.ui.h hVar6 = hVar2;
                    if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objF = c1086gP.f();
                    if (z14) {
                        z15 = false;
                        objF = new O0(0 == true ? 1 : 0, eVar);
                        c1086gP.E(objF);
                    } else {
                        z15 = false;
                        objF = new O0(0 == true ? 1 : 0, eVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(z15);
                    Ia.a<p293xa.r> aVar17 = eVar;
                    long j110 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC11 = ClickableKt.c(hVarJ3, z15, null, (Ia.a) objF, 7);
                    androidx.compose.ui.f.b bVar3 = androidx.compose.ui.d.a.f13344k;
                    C0945e.j jVar3 = C0945e.f10284a;
                    androidx.compose.foundation.layout.T tA4 = androidx.compose.foundation.layout.S.a(jVar3, bVar3, c1086gP, 48);
                    i30 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                    androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, hVarC11);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar8, c1086gP, tA4);
                    R0.a(pVar9, c1086gP, interfaceC1089h0P9);
                    if (c1086gP.f12995O) {
                        J4.i.d(i30, c1086gP, i30, pVar);
                    } else {
                        J4.i.d(i30, c1086gP, i30, pVar);
                    }
                    R0.a(pVar10, c1086gP, hVarC12);
                    v10 = androidx.compose.foundation.layout.V.f10222a;
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f13));
                    c1086gP.L(-1851695824);
                    if (aVar3 != null) {
                        j14 = j13;
                    } else {
                        j14 = j13;
                    }
                    c1086gP.T(false);
                    if (aVar3 != null) {
                        i31 = 8;
                    } else {
                        i31 = 16;
                    }
                    f10 = i31;
                    Ia.a<p293xa.r> aVar18 = aVar3;
                    if (list3.size() == 1) {
                        c1086gP.L(-1567408864);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                        AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                        c1086gP.T(false);
                    } else if (list3.size() > 1) {
                        c1086gP.L(-1567107141);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                        AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1566896682);
                        c1086gP.T(false);
                    }
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
                    androidx.compose.ui.h hVarB3 = v10.b(aVar4, true);
                    Integer num11 = numValueOf;
                    C0953m c0953mA6 = C0952l.a(kVar3, aVar16, c1086gP, 48);
                    i32 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                    androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086gP, hVarB3);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar8, c1086gP, c0953mA6);
                    R0.a(pVar9, c1086gP, interfaceC1089h0P10);
                    if (c1086gP.f12995O) {
                        J4.i.d(i32, c1086gP, i32, pVar);
                    } else {
                        J4.i.d(i32, c1086gP, i32, pVar);
                    }
                    R0.a(pVar10, c1086gP, hVarC13);
                    IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                    int i45 = IntercomTheme.$stable;
                    TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme3.getTypography(c1086gP, i45).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
                    c1086gP.L(1212144132);
                    if (str5 != null) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    c1086gP.T(false);
                    c1086gP.T(z16);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
                    c1086gP.L(-1851611912);
                    if (qVar2 == 0) {
                        qVar3 = qVar2;
                    } else {
                        qVar3 = qVar2;
                        qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        p293xa.r rVar7 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.L(369373838);
                    if (!kotlin.text.n.S(str6)) {
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    j15 = j14;
                    qVar4 = qVar3;
                    j16 = jM642getOnHeader0d7_KjU2;
                    num5 = num10;
                    str7 = str5;
                    z17 = z13;
                    list4 = list3;
                    aVar3 = aVar18;
                    hVar3 = hVar6;
                    aVar6 = aVar17;
                    j17 = j110;
                    numValueOf = num11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final String str9 = str6;
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.P0
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(hVar3, str9, str7, num5, list4, aVar3, numValueOf, z17, j17, j15, j16, aVar6, qVar4, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i39 |= 3072;
            i16 = i12 & 16;
            if (i16 != 0) {
                i39 |= 8192;
            }
            i17 = i12 & 32;
            if (i17 != 0) {
                i39 |= 196608;
                aVar3 = aVar;
            } else {
                aVar3 = aVar;
                if ((i10 & 458752) == 0) {
                    if (c1086gP.k(aVar3)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i39 |= i18;
                }
            }
            if ((i10 & 3670016) == 0) {
                numValueOf = num2;
                if ((i12 & 64) == 0) {
                    i35 = 524288;
                } else {
                    i35 = 524288;
                }
                i39 |= i35;
            } else {
                numValueOf = num2;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i39 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (c1086gP.c(z10)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i39 |= i20;
            }
            if ((i10 & 234881024) == 0) {
                int i46 = i39;
                j12 = j;
                if ((i12 & 256) == 0) {
                    i34 = 33554432;
                } else {
                    i34 = 33554432;
                }
                i21 = i46 | i34;
            } else {
                i21 = i39;
                j12 = j;
            }
            if ((i10 & 1879048192) != 0) {
                if ((i12 & 512) == 0) {
                    i33 = 268435456;
                } else {
                    i33 = 268435456;
                }
                i21 |= i33;
            }
            if ((i11 & 14) == 0) {
                if ((i12 & 1024) == 0) {
                    i37 = 4;
                }
                i22 = i11 | i37;
            } else {
                i22 = i11;
            }
            i23 = 2048 & i12;
            if (i23 != 0) {
                if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                    if (c1086gP.k(aVar2)) {
                        i24 = 32;
                    } else {
                        i24 = 16;
                    }
                    i22 |= i24;
                }
                i25 = i12 & 4096;
                if (i25 != 0) {
                    i22 |= 384;
                } else if ((i11 & 896) != 0) {
                    if (c1086gP.k(qVar)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i22 |= i26;
                }
                if (i16 != 16) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        i27 = i22;
                        if (i36 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i38 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i40 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i16 != 0) {
                            list2 = EmptyList.f42983b;
                        } else {
                            list2 = list;
                        }
                        if (i17 != 0) {
                            aVar3 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                            i21 &= -3670017;
                        }
                        if (i19 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((256 & i12) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                            i21 &= -234881025;
                        } else {
                            jM635getHeader0d7_KjU = j12;
                        }
                        if ((i12 & 512) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i21 &= -1879048193;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if ((1024 & i12) != 0) {
                            jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i28 = i27 & (-15);
                        } else {
                            jM642getOnHeader0d7_KjU2 = j11;
                            i28 = i27;
                        }
                        if (i23 != 0) {
                            eVar = new coil.e(1);
                        } else {
                            eVar = aVar2;
                        }
                        if (i25 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        z12 = z11;
                        num4 = num3;
                    } else {
                        i27 = i22;
                        if (i36 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i38 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i40 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i16 != 0) {
                            list2 = EmptyList.f42983b;
                        } else {
                            list2 = list;
                        }
                        if (i17 != 0) {
                            aVar3 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                            i21 &= -3670017;
                        }
                        if (i19 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((256 & i12) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                            i21 &= -234881025;
                        } else {
                            jM635getHeader0d7_KjU = j12;
                        }
                        if ((i12 & 512) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i21 &= -1879048193;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if ((1024 & i12) != 0) {
                            jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i28 = i27 & (-15);
                        } else {
                            jM642getOnHeader0d7_KjU2 = j11;
                            i28 = i27;
                        }
                        if (i23 != 0) {
                            eVar = new coil.e(1);
                        } else {
                            eVar = aVar2;
                        }
                        if (i25 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        z12 = z11;
                        num4 = num3;
                    }
                    c1086gP.U();
                    activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
                    if (activity != null) {
                        window = activity.getWindow();
                    } else {
                        window = null;
                    }
                    c1086gP.L(-1152540944);
                    if (window != null) {
                        Ia.a<p293xa.r> aVar19 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                            @Override // Ia.a
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                            }
                        };
                        androidx.compose.runtime.B b13 = androidx.compose.runtime.E.f12831a;
                        c1086gP.l(aVar19);
                        p293xa.r rVar8 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    Integer num12 = num4;
                    C0945e.k kVar4 = C0945e.f10286c;
                    str5 = str4;
                    androidx.compose.ui.f.a aVar110 = androidx.compose.ui.d.a.f13346m;
                    str6 = str3;
                    C0953m c0953mA7 = C0952l.a(kVar4, aVar110, c1086gP, 0);
                    i29 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                    androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    z13 = z12;
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    list3 = list2;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar11 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar11, c1086gP, c0953mA7);
                    Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar12 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar12, c1086gP, interfaceC1089h0P11);
                    pVar = ComposeUiNode.Companion.f14338g;
                    j13 = jM642getOnHeader0d7_KjU;
                    if (c1086gP.f12995O) {
                        J4.i.d(i29, c1086gP, i29, pVar);
                    } else {
                        J4.i.d(i29, c1086gP, i29, pVar);
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar13 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar13, c1086gP, hVarC14);
                    float f14 = 4;
                    androidx.compose.ui.h hVarJ4 = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f14, 0.0f, 11);
                    c1086gP.L(369283361);
                    androidx.compose.ui.h hVar7 = hVar2;
                    if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objF = c1086gP.f();
                    if (z14) {
                        z15 = false;
                        objF = new O0(0 == true ? 1 : 0, eVar);
                        c1086gP.E(objF);
                    } else {
                        z15 = false;
                        objF = new O0(0 == true ? 1 : 0, eVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(z15);
                    Ia.a<p293xa.r> aVar111 = eVar;
                    long j111 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC15 = ClickableKt.c(hVarJ4, z15, null, (Ia.a) objF, 7);
                    androidx.compose.ui.f.b bVar4 = androidx.compose.ui.d.a.f13344k;
                    C0945e.j jVar4 = C0945e.f10284a;
                    androidx.compose.foundation.layout.T tA5 = androidx.compose.foundation.layout.S.a(jVar4, bVar4, c1086gP, 48);
                    i30 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                    androidx.compose.ui.h hVarC16 = ComposedModifierKt.c(c1086gP, hVarC15);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar11, c1086gP, tA5);
                    R0.a(pVar12, c1086gP, interfaceC1089h0P12);
                    if (c1086gP.f12995O) {
                        J4.i.d(i30, c1086gP, i30, pVar);
                    } else {
                        J4.i.d(i30, c1086gP, i30, pVar);
                    }
                    R0.a(pVar13, c1086gP, hVarC16);
                    v10 = androidx.compose.foundation.layout.V.f10222a;
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f14));
                    c1086gP.L(-1851695824);
                    if (aVar3 != null) {
                        j14 = j13;
                    } else {
                        j14 = j13;
                    }
                    c1086gP.T(false);
                    if (aVar3 != null) {
                        i31 = 8;
                    } else {
                        i31 = 16;
                    }
                    f10 = i31;
                    Ia.a<p293xa.r> aVar112 = aVar3;
                    if (list3.size() == 1) {
                        c1086gP.L(-1567408864);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                        AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                        c1086gP.T(false);
                    } else if (list3.size() > 1) {
                        c1086gP.L(-1567107141);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                        AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1566896682);
                        c1086gP.T(false);
                    }
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
                    androidx.compose.ui.h hVarB4 = v10.b(aVar4, true);
                    Integer num13 = numValueOf;
                    C0953m c0953mA8 = C0952l.a(kVar4, aVar110, c1086gP, 48);
                    i32 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
                    androidx.compose.ui.h hVarC17 = ComposedModifierKt.c(c1086gP, hVarB4);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar11, c1086gP, c0953mA8);
                    R0.a(pVar12, c1086gP, interfaceC1089h0P13);
                    if (c1086gP.f12995O) {
                        J4.i.d(i32, c1086gP, i32, pVar);
                    } else {
                        J4.i.d(i32, c1086gP, i32, pVar);
                    }
                    R0.a(pVar13, c1086gP, hVarC17);
                    IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                    int i47 = IntercomTheme.$stable;
                    TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme4.getTypography(c1086gP, i47).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
                    c1086gP.L(1212144132);
                    if (str5 != null) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    c1086gP.T(false);
                    c1086gP.T(z16);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
                    c1086gP.L(-1851611912);
                    if (qVar2 == 0) {
                        qVar3 = qVar2;
                    } else {
                        qVar3 = qVar2;
                        qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        p293xa.r rVar9 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.L(369373838);
                    if (!kotlin.text.n.S(str6)) {
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    j15 = j14;
                    qVar4 = qVar3;
                    j16 = jM642getOnHeader0d7_KjU2;
                    num5 = num12;
                    str7 = str5;
                    z17 = z13;
                    list4 = list3;
                    aVar3 = aVar112;
                    hVar3 = hVar7;
                    aVar6 = aVar111;
                    j17 = j111;
                    numValueOf = num13;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        i27 = i22;
                        if (i36 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i38 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i40 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i16 != 0) {
                            list2 = EmptyList.f42983b;
                        } else {
                            list2 = list;
                        }
                        if (i17 != 0) {
                            aVar3 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                            i21 &= -3670017;
                        }
                        if (i19 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((256 & i12) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                            i21 &= -234881025;
                        } else {
                            jM635getHeader0d7_KjU = j12;
                        }
                        if ((i12 & 512) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i21 &= -1879048193;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if ((1024 & i12) != 0) {
                            jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i28 = i27 & (-15);
                        } else {
                            jM642getOnHeader0d7_KjU2 = j11;
                            i28 = i27;
                        }
                        if (i23 != 0) {
                            eVar = new coil.e(1);
                        } else {
                            eVar = aVar2;
                        }
                        if (i25 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        z12 = z11;
                        num4 = num3;
                    } else {
                        i27 = i22;
                        if (i36 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i38 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i40 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i16 != 0) {
                            list2 = EmptyList.f42983b;
                        } else {
                            list2 = list;
                        }
                        if (i17 != 0) {
                            aVar3 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                            i21 &= -3670017;
                        }
                        if (i19 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((256 & i12) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                            i21 &= -234881025;
                        } else {
                            jM635getHeader0d7_KjU = j12;
                        }
                        if ((i12 & 512) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i21 &= -1879048193;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if ((1024 & i12) != 0) {
                            jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i28 = i27 & (-15);
                        } else {
                            jM642getOnHeader0d7_KjU2 = j11;
                            i28 = i27;
                        }
                        if (i23 != 0) {
                            eVar = new coil.e(1);
                        } else {
                            eVar = aVar2;
                        }
                        if (i25 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        z12 = z11;
                        num4 = num3;
                    }
                    c1086gP.U();
                    activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
                    if (activity != null) {
                        window = activity.getWindow();
                    } else {
                        window = null;
                    }
                    c1086gP.L(-1152540944);
                    if (window != null) {
                        Ia.a<p293xa.r> aVar113 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                            @Override // Ia.a
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                            }
                        };
                        androidx.compose.runtime.B b14 = androidx.compose.runtime.E.f12831a;
                        c1086gP.l(aVar113);
                        p293xa.r rVar10 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    Integer num14 = num4;
                    C0945e.k kVar5 = C0945e.f10286c;
                    str5 = str4;
                    androidx.compose.ui.f.a aVar114 = androidx.compose.ui.d.a.f13346m;
                    str6 = str3;
                    C0953m c0953mA9 = C0952l.a(kVar5, aVar114, c1086gP, 0);
                    i29 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
                    androidx.compose.ui.h hVarC18 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    z13 = z12;
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    list3 = list2;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar14 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar14, c1086gP, c0953mA9);
                    Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar15 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar15, c1086gP, interfaceC1089h0P14);
                    pVar = ComposeUiNode.Companion.f14338g;
                    j13 = jM642getOnHeader0d7_KjU;
                    if (c1086gP.f12995O) {
                        J4.i.d(i29, c1086gP, i29, pVar);
                    } else {
                        J4.i.d(i29, c1086gP, i29, pVar);
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar16 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar16, c1086gP, hVarC18);
                    float f15 = 4;
                    androidx.compose.ui.h hVarJ5 = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f15, 0.0f, 11);
                    c1086gP.L(369283361);
                    androidx.compose.ui.h hVar8 = hVar2;
                    if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objF = c1086gP.f();
                    if (z14) {
                        z15 = false;
                        objF = new O0(0 == true ? 1 : 0, eVar);
                        c1086gP.E(objF);
                    } else {
                        z15 = false;
                        objF = new O0(0 == true ? 1 : 0, eVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(z15);
                    Ia.a<p293xa.r> aVar115 = eVar;
                    long j112 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC19 = ClickableKt.c(hVarJ5, z15, null, (Ia.a) objF, 7);
                    androidx.compose.ui.f.b bVar5 = androidx.compose.ui.d.a.f13344k;
                    C0945e.j jVar5 = C0945e.f10284a;
                    androidx.compose.foundation.layout.T tA6 = androidx.compose.foundation.layout.S.a(jVar5, bVar5, c1086gP, 48);
                    i30 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P15 = c1086gP.P();
                    androidx.compose.ui.h hVarC110 = ComposedModifierKt.c(c1086gP, hVarC19);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar14, c1086gP, tA6);
                    R0.a(pVar15, c1086gP, interfaceC1089h0P15);
                    if (c1086gP.f12995O) {
                        J4.i.d(i30, c1086gP, i30, pVar);
                    } else {
                        J4.i.d(i30, c1086gP, i30, pVar);
                    }
                    R0.a(pVar16, c1086gP, hVarC110);
                    v10 = androidx.compose.foundation.layout.V.f10222a;
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f15));
                    c1086gP.L(-1851695824);
                    if (aVar3 != null) {
                        j14 = j13;
                    } else {
                        j14 = j13;
                    }
                    c1086gP.T(false);
                    if (aVar3 != null) {
                        i31 = 8;
                    } else {
                        i31 = 16;
                    }
                    f10 = i31;
                    Ia.a<p293xa.r> aVar116 = aVar3;
                    if (list3.size() == 1) {
                        c1086gP.L(-1567408864);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                        AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                        c1086gP.T(false);
                    } else if (list3.size() > 1) {
                        c1086gP.L(-1567107141);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                        AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1566896682);
                        c1086gP.T(false);
                    }
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
                    androidx.compose.ui.h hVarB5 = v10.b(aVar4, true);
                    Integer num15 = numValueOf;
                    C0953m c0953mA10 = C0952l.a(kVar5, aVar114, c1086gP, 48);
                    i32 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P16 = c1086gP.P();
                    androidx.compose.ui.h hVarC111 = ComposedModifierKt.c(c1086gP, hVarB5);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar14, c1086gP, c0953mA10);
                    R0.a(pVar15, c1086gP, interfaceC1089h0P16);
                    if (c1086gP.f12995O) {
                        J4.i.d(i32, c1086gP, i32, pVar);
                    } else {
                        J4.i.d(i32, c1086gP, i32, pVar);
                    }
                    R0.a(pVar16, c1086gP, hVarC111);
                    IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                    int i48 = IntercomTheme.$stable;
                    TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme5.getTypography(c1086gP, i48).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
                    c1086gP.L(1212144132);
                    if (str5 != null) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    c1086gP.T(false);
                    c1086gP.T(z16);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
                    c1086gP.L(-1851611912);
                    if (qVar2 == 0) {
                        qVar3 = qVar2;
                    } else {
                        qVar3 = qVar2;
                        qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        p293xa.r rVar11 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.L(369373838);
                    if (!kotlin.text.n.S(str6)) {
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    j15 = j14;
                    qVar4 = qVar3;
                    j16 = jM642getOnHeader0d7_KjU2;
                    num5 = num14;
                    str7 = str5;
                    z17 = z13;
                    list4 = list3;
                    aVar3 = aVar116;
                    hVar3 = hVar8;
                    aVar6 = aVar115;
                    j17 = j112;
                    numValueOf = num15;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final String str10 = str6;
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.P0
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(hVar3, str10, str7, num5, list4, aVar3, numValueOf, z17, j17, j15, j16, aVar6, qVar4, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i22 |= 48;
            i25 = i12 & 4096;
            if (i25 != 0) {
                i22 |= 384;
            } else if ((i11 & 896) != 0) {
                if (c1086gP.k(qVar)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i22 |= i26;
            }
            if (i16 != 16) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    i27 = i22;
                    if (i36 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i38 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i40 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i16 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                        i21 &= -3670017;
                    }
                    if (i19 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((256 & i12) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                        i21 &= -234881025;
                    } else {
                        jM635getHeader0d7_KjU = j12;
                    }
                    if ((i12 & 512) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i21 &= -1879048193;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if ((1024 & i12) != 0) {
                        jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i28 = i27 & (-15);
                    } else {
                        jM642getOnHeader0d7_KjU2 = j11;
                        i28 = i27;
                    }
                    if (i23 != 0) {
                        eVar = new coil.e(1);
                    } else {
                        eVar = aVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    z12 = z11;
                    num4 = num3;
                } else {
                    i27 = i22;
                    if (i36 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i38 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i40 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i16 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                        i21 &= -3670017;
                    }
                    if (i19 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((256 & i12) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                        i21 &= -234881025;
                    } else {
                        jM635getHeader0d7_KjU = j12;
                    }
                    if ((i12 & 512) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i21 &= -1879048193;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if ((1024 & i12) != 0) {
                        jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i28 = i27 & (-15);
                    } else {
                        jM642getOnHeader0d7_KjU2 = j11;
                        i28 = i27;
                    }
                    if (i23 != 0) {
                        eVar = new coil.e(1);
                    } else {
                        eVar = aVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    z12 = z11;
                    num4 = num3;
                }
                c1086gP.U();
                activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                c1086gP.L(-1152540944);
                if (window != null) {
                    Ia.a<p293xa.r> aVar117 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                        @Override // Ia.a
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                        }
                    };
                    androidx.compose.runtime.B b15 = androidx.compose.runtime.E.f12831a;
                    c1086gP.l(aVar117);
                    p293xa.r rVar12 = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                aVar4 = androidx.compose.ui.h.a.f13984b;
                Integer num16 = num4;
                C0945e.k kVar6 = C0945e.f10286c;
                str5 = str4;
                androidx.compose.ui.f.a aVar118 = androidx.compose.ui.d.a.f13346m;
                str6 = str3;
                C0953m c0953mA11 = C0952l.a(kVar6, aVar118, c1086gP, 0);
                i29 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P17 = c1086gP.P();
                androidx.compose.ui.h hVarC112 = ComposedModifierKt.c(c1086gP, aVar4);
                ComposeUiNode.f14331c0.getClass();
                z13 = z12;
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                list3 = list2;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar17 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar17, c1086gP, c0953mA11);
                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar18 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar18, c1086gP, interfaceC1089h0P17);
                pVar = ComposeUiNode.Companion.f14338g;
                j13 = jM642getOnHeader0d7_KjU;
                if (c1086gP.f12995O) {
                    J4.i.d(i29, c1086gP, i29, pVar);
                } else {
                    J4.i.d(i29, c1086gP, i29, pVar);
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar19 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar19, c1086gP, hVarC112);
                float f16 = 4;
                androidx.compose.ui.h hVarJ6 = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f16, 0.0f, 11);
                c1086gP.L(369283361);
                androidx.compose.ui.h hVar9 = hVar2;
                if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objF = c1086gP.f();
                if (z14) {
                    z15 = false;
                    objF = new O0(0 == true ? 1 : 0, eVar);
                    c1086gP.E(objF);
                } else {
                    z15 = false;
                    objF = new O0(0 == true ? 1 : 0, eVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(z15);
                Ia.a<p293xa.r> aVar119 = eVar;
                long j113 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC113 = ClickableKt.c(hVarJ6, z15, null, (Ia.a) objF, 7);
                androidx.compose.ui.f.b bVar6 = androidx.compose.ui.d.a.f13344k;
                C0945e.j jVar6 = C0945e.f10284a;
                androidx.compose.foundation.layout.T tA7 = androidx.compose.foundation.layout.S.a(jVar6, bVar6, c1086gP, 48);
                i30 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P18 = c1086gP.P();
                androidx.compose.ui.h hVarC114 = ComposedModifierKt.c(c1086gP, hVarC113);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar17, c1086gP, tA7);
                R0.a(pVar18, c1086gP, interfaceC1089h0P18);
                if (c1086gP.f12995O) {
                    J4.i.d(i30, c1086gP, i30, pVar);
                } else {
                    J4.i.d(i30, c1086gP, i30, pVar);
                }
                R0.a(pVar19, c1086gP, hVarC114);
                v10 = androidx.compose.foundation.layout.V.f10222a;
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f16));
                c1086gP.L(-1851695824);
                if (aVar3 != null) {
                    j14 = j13;
                } else {
                    j14 = j13;
                }
                c1086gP.T(false);
                if (aVar3 != null) {
                    i31 = 8;
                } else {
                    i31 = 16;
                }
                f10 = i31;
                Ia.a<p293xa.r> aVar1110 = aVar3;
                if (list3.size() == 1) {
                    c1086gP.L(-1567408864);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                    AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                    c1086gP.T(false);
                } else if (list3.size() > 1) {
                    c1086gP.L(-1567107141);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                    AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1566896682);
                    c1086gP.T(false);
                }
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
                androidx.compose.ui.h hVarB6 = v10.b(aVar4, true);
                Integer num17 = numValueOf;
                C0953m c0953mA12 = C0952l.a(kVar6, aVar118, c1086gP, 48);
                i32 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P19 = c1086gP.P();
                androidx.compose.ui.h hVarC115 = ComposedModifierKt.c(c1086gP, hVarB6);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar17, c1086gP, c0953mA12);
                R0.a(pVar18, c1086gP, interfaceC1089h0P19);
                if (c1086gP.f12995O) {
                    J4.i.d(i32, c1086gP, i32, pVar);
                } else {
                    J4.i.d(i32, c1086gP, i32, pVar);
                }
                R0.a(pVar19, c1086gP, hVarC115);
                IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
                int i49 = IntercomTheme.$stable;
                TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme6.getTypography(c1086gP, i49).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
                c1086gP.L(1212144132);
                if (str5 != null) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                c1086gP.T(false);
                c1086gP.T(z16);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
                c1086gP.L(-1851611912);
                if (qVar2 == 0) {
                    qVar3 = qVar2;
                } else {
                    qVar3 = qVar2;
                    qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    p293xa.r rVar13 = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.L(369373838);
                if (!kotlin.text.n.S(str6)) {
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                j15 = j14;
                qVar4 = qVar3;
                j16 = jM642getOnHeader0d7_KjU2;
                num5 = num16;
                str7 = str5;
                z17 = z13;
                list4 = list3;
                aVar3 = aVar1110;
                hVar3 = hVar9;
                aVar6 = aVar119;
                j17 = j113;
                numValueOf = num17;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    i27 = i22;
                    if (i36 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i38 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i40 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i16 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                        i21 &= -3670017;
                    }
                    if (i19 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((256 & i12) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                        i21 &= -234881025;
                    } else {
                        jM635getHeader0d7_KjU = j12;
                    }
                    if ((i12 & 512) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i21 &= -1879048193;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if ((1024 & i12) != 0) {
                        jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i28 = i27 & (-15);
                    } else {
                        jM642getOnHeader0d7_KjU2 = j11;
                        i28 = i27;
                    }
                    if (i23 != 0) {
                        eVar = new coil.e(1);
                    } else {
                        eVar = aVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    z12 = z11;
                    num4 = num3;
                } else {
                    i27 = i22;
                    if (i36 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i38 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i40 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i16 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                        i21 &= -3670017;
                    }
                    if (i19 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((256 & i12) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                        i21 &= -234881025;
                    } else {
                        jM635getHeader0d7_KjU = j12;
                    }
                    if ((i12 & 512) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i21 &= -1879048193;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if ((1024 & i12) != 0) {
                        jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i28 = i27 & (-15);
                    } else {
                        jM642getOnHeader0d7_KjU2 = j11;
                        i28 = i27;
                    }
                    if (i23 != 0) {
                        eVar = new coil.e(1);
                    } else {
                        eVar = aVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    z12 = z11;
                    num4 = num3;
                }
                c1086gP.U();
                activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                c1086gP.L(-1152540944);
                if (window != null) {
                    Ia.a<p293xa.r> aVar1111 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                        @Override // Ia.a
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                        }
                    };
                    androidx.compose.runtime.B b16 = androidx.compose.runtime.E.f12831a;
                    c1086gP.l(aVar1111);
                    p293xa.r rVar14 = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                aVar4 = androidx.compose.ui.h.a.f13984b;
                Integer num18 = num4;
                C0945e.k kVar7 = C0945e.f10286c;
                str5 = str4;
                androidx.compose.ui.f.a aVar1112 = androidx.compose.ui.d.a.f13346m;
                str6 = str3;
                C0953m c0953mA13 = C0952l.a(kVar7, aVar1112, c1086gP, 0);
                i29 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P110 = c1086gP.P();
                androidx.compose.ui.h hVarC116 = ComposedModifierKt.c(c1086gP, aVar4);
                ComposeUiNode.f14331c0.getClass();
                z13 = z12;
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                list3 = list2;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar110 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar110, c1086gP, c0953mA13);
                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar111 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar111, c1086gP, interfaceC1089h0P110);
                pVar = ComposeUiNode.Companion.f14338g;
                j13 = jM642getOnHeader0d7_KjU;
                if (c1086gP.f12995O) {
                    J4.i.d(i29, c1086gP, i29, pVar);
                } else {
                    J4.i.d(i29, c1086gP, i29, pVar);
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar112 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar112, c1086gP, hVarC116);
                float f17 = 4;
                androidx.compose.ui.h hVarJ7 = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f17, 0.0f, 11);
                c1086gP.L(369283361);
                androidx.compose.ui.h hVar10 = hVar2;
                if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objF = c1086gP.f();
                if (z14) {
                    z15 = false;
                    objF = new O0(0 == true ? 1 : 0, eVar);
                    c1086gP.E(objF);
                } else {
                    z15 = false;
                    objF = new O0(0 == true ? 1 : 0, eVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(z15);
                Ia.a<p293xa.r> aVar1113 = eVar;
                long j114 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC117 = ClickableKt.c(hVarJ7, z15, null, (Ia.a) objF, 7);
                androidx.compose.ui.f.b bVar7 = androidx.compose.ui.d.a.f13344k;
                C0945e.j jVar7 = C0945e.f10284a;
                androidx.compose.foundation.layout.T tA8 = androidx.compose.foundation.layout.S.a(jVar7, bVar7, c1086gP, 48);
                i30 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P111 = c1086gP.P();
                androidx.compose.ui.h hVarC118 = ComposedModifierKt.c(c1086gP, hVarC117);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar110, c1086gP, tA8);
                R0.a(pVar111, c1086gP, interfaceC1089h0P111);
                if (c1086gP.f12995O) {
                    J4.i.d(i30, c1086gP, i30, pVar);
                } else {
                    J4.i.d(i30, c1086gP, i30, pVar);
                }
                R0.a(pVar112, c1086gP, hVarC118);
                v10 = androidx.compose.foundation.layout.V.f10222a;
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f17));
                c1086gP.L(-1851695824);
                if (aVar3 != null) {
                    j14 = j13;
                } else {
                    j14 = j13;
                }
                c1086gP.T(false);
                if (aVar3 != null) {
                    i31 = 8;
                } else {
                    i31 = 16;
                }
                f10 = i31;
                Ia.a<p293xa.r> aVar1114 = aVar3;
                if (list3.size() == 1) {
                    c1086gP.L(-1567408864);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                    AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                    c1086gP.T(false);
                } else if (list3.size() > 1) {
                    c1086gP.L(-1567107141);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                    AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1566896682);
                    c1086gP.T(false);
                }
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
                androidx.compose.ui.h hVarB7 = v10.b(aVar4, true);
                Integer num19 = numValueOf;
                C0953m c0953mA14 = C0952l.a(kVar7, aVar1112, c1086gP, 48);
                i32 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P112 = c1086gP.P();
                androidx.compose.ui.h hVarC119 = ComposedModifierKt.c(c1086gP, hVarB7);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar110, c1086gP, c0953mA14);
                R0.a(pVar111, c1086gP, interfaceC1089h0P112);
                if (c1086gP.f12995O) {
                    J4.i.d(i32, c1086gP, i32, pVar);
                } else {
                    J4.i.d(i32, c1086gP, i32, pVar);
                }
                R0.a(pVar112, c1086gP, hVarC119);
                IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
                int i410 = IntercomTheme.$stable;
                TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme7.getTypography(c1086gP, i410).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
                c1086gP.L(1212144132);
                if (str5 != null) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                c1086gP.T(false);
                c1086gP.T(z16);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
                c1086gP.L(-1851611912);
                if (qVar2 == 0) {
                    qVar3 = qVar2;
                } else {
                    qVar3 = qVar2;
                    qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    p293xa.r rVar15 = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.L(369373838);
                if (!kotlin.text.n.S(str6)) {
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                j15 = j14;
                qVar4 = qVar3;
                j16 = jM642getOnHeader0d7_KjU2;
                num5 = num18;
                str7 = str5;
                z17 = z13;
                list4 = list3;
                aVar3 = aVar1114;
                hVar3 = hVar10;
                aVar6 = aVar1113;
                j17 = j114;
                numValueOf = num19;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final String str11 = str6;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.P0
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(hVar3, str11, str7, num5, list4, aVar3, numValueOf, z17, j17, j15, j16, aVar6, qVar4, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i39 |= 384;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                if (c1086gP.K(num)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i39 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                i39 |= 8192;
            }
            i17 = i12 & 32;
            if (i17 != 0) {
                i39 |= 196608;
                aVar3 = aVar;
            } else {
                aVar3 = aVar;
                if ((i10 & 458752) == 0) {
                    if (c1086gP.k(aVar3)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i39 |= i18;
                }
            }
            if ((i10 & 3670016) == 0) {
                numValueOf = num2;
                if ((i12 & 64) == 0) {
                    i35 = 524288;
                } else {
                    i35 = 524288;
                }
                i39 |= i35;
            } else {
                numValueOf = num2;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i39 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (c1086gP.c(z10)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i39 |= i20;
            }
            if ((i10 & 234881024) == 0) {
                int i411 = i39;
                j12 = j;
                if ((i12 & 256) == 0) {
                    i34 = 33554432;
                } else {
                    i34 = 33554432;
                }
                i21 = i411 | i34;
            } else {
                i21 = i39;
                j12 = j;
            }
            if ((i10 & 1879048192) != 0) {
                if ((i12 & 512) == 0) {
                    i33 = 268435456;
                } else {
                    i33 = 268435456;
                }
                i21 |= i33;
            }
            if ((i11 & 14) == 0) {
                if ((i12 & 1024) == 0) {
                    i37 = 4;
                }
                i22 = i11 | i37;
            } else {
                i22 = i11;
            }
            i23 = 2048 & i12;
            if (i23 != 0) {
                if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                    if (c1086gP.k(aVar2)) {
                        i24 = 32;
                    } else {
                        i24 = 16;
                    }
                    i22 |= i24;
                }
                i25 = i12 & 4096;
                if (i25 != 0) {
                    i22 |= 384;
                } else if ((i11 & 896) != 0) {
                    if (c1086gP.k(qVar)) {
                        i26 = 256;
                    } else {
                        i26 = 128;
                    }
                    i22 |= i26;
                }
                if (i16 != 16) {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        i27 = i22;
                        if (i36 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i38 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i40 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i16 != 0) {
                            list2 = EmptyList.f42983b;
                        } else {
                            list2 = list;
                        }
                        if (i17 != 0) {
                            aVar3 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                            i21 &= -3670017;
                        }
                        if (i19 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((256 & i12) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                            i21 &= -234881025;
                        } else {
                            jM635getHeader0d7_KjU = j12;
                        }
                        if ((i12 & 512) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i21 &= -1879048193;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if ((1024 & i12) != 0) {
                            jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i28 = i27 & (-15);
                        } else {
                            jM642getOnHeader0d7_KjU2 = j11;
                            i28 = i27;
                        }
                        if (i23 != 0) {
                            eVar = new coil.e(1);
                        } else {
                            eVar = aVar2;
                        }
                        if (i25 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        z12 = z11;
                        num4 = num3;
                    } else {
                        i27 = i22;
                        if (i36 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i38 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i40 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i16 != 0) {
                            list2 = EmptyList.f42983b;
                        } else {
                            list2 = list;
                        }
                        if (i17 != 0) {
                            aVar3 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                            i21 &= -3670017;
                        }
                        if (i19 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((256 & i12) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                            i21 &= -234881025;
                        } else {
                            jM635getHeader0d7_KjU = j12;
                        }
                        if ((i12 & 512) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i21 &= -1879048193;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if ((1024 & i12) != 0) {
                            jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i28 = i27 & (-15);
                        } else {
                            jM642getOnHeader0d7_KjU2 = j11;
                            i28 = i27;
                        }
                        if (i23 != 0) {
                            eVar = new coil.e(1);
                        } else {
                            eVar = aVar2;
                        }
                        if (i25 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        z12 = z11;
                        num4 = num3;
                    }
                    c1086gP.U();
                    activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
                    if (activity != null) {
                        window = activity.getWindow();
                    } else {
                        window = null;
                    }
                    c1086gP.L(-1152540944);
                    if (window != null) {
                        Ia.a<p293xa.r> aVar1115 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                            @Override // Ia.a
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                            }
                        };
                        androidx.compose.runtime.B b17 = androidx.compose.runtime.E.f12831a;
                        c1086gP.l(aVar1115);
                        p293xa.r rVar16 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    Integer num110 = num4;
                    C0945e.k kVar8 = C0945e.f10286c;
                    str5 = str4;
                    androidx.compose.ui.f.a aVar1116 = androidx.compose.ui.d.a.f13346m;
                    str6 = str3;
                    C0953m c0953mA15 = C0952l.a(kVar8, aVar1116, c1086gP, 0);
                    i29 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P113 = c1086gP.P();
                    androidx.compose.ui.h hVarC1110 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    z13 = z12;
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    list3 = list2;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar113 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar113, c1086gP, c0953mA15);
                    Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar114 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar114, c1086gP, interfaceC1089h0P113);
                    pVar = ComposeUiNode.Companion.f14338g;
                    j13 = jM642getOnHeader0d7_KjU;
                    if (c1086gP.f12995O) {
                        J4.i.d(i29, c1086gP, i29, pVar);
                    } else {
                        J4.i.d(i29, c1086gP, i29, pVar);
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar115 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar115, c1086gP, hVarC1110);
                    float f18 = 4;
                    androidx.compose.ui.h hVarJ8 = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f18, 0.0f, 11);
                    c1086gP.L(369283361);
                    androidx.compose.ui.h hVar11 = hVar2;
                    if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objF = c1086gP.f();
                    if (z14) {
                        z15 = false;
                        objF = new O0(0 == true ? 1 : 0, eVar);
                        c1086gP.E(objF);
                    } else {
                        z15 = false;
                        objF = new O0(0 == true ? 1 : 0, eVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(z15);
                    Ia.a<p293xa.r> aVar1117 = eVar;
                    long j115 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC1111 = ClickableKt.c(hVarJ8, z15, null, (Ia.a) objF, 7);
                    androidx.compose.ui.f.b bVar8 = androidx.compose.ui.d.a.f13344k;
                    C0945e.j jVar8 = C0945e.f10284a;
                    androidx.compose.foundation.layout.T tA9 = androidx.compose.foundation.layout.S.a(jVar8, bVar8, c1086gP, 48);
                    i30 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P114 = c1086gP.P();
                    androidx.compose.ui.h hVarC1112 = ComposedModifierKt.c(c1086gP, hVarC1111);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar113, c1086gP, tA9);
                    R0.a(pVar114, c1086gP, interfaceC1089h0P114);
                    if (c1086gP.f12995O) {
                        J4.i.d(i30, c1086gP, i30, pVar);
                    } else {
                        J4.i.d(i30, c1086gP, i30, pVar);
                    }
                    R0.a(pVar115, c1086gP, hVarC1112);
                    v10 = androidx.compose.foundation.layout.V.f10222a;
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f18));
                    c1086gP.L(-1851695824);
                    if (aVar3 != null) {
                        j14 = j13;
                    } else {
                        j14 = j13;
                    }
                    c1086gP.T(false);
                    if (aVar3 != null) {
                        i31 = 8;
                    } else {
                        i31 = 16;
                    }
                    f10 = i31;
                    Ia.a<p293xa.r> aVar1118 = aVar3;
                    if (list3.size() == 1) {
                        c1086gP.L(-1567408864);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                        AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                        c1086gP.T(false);
                    } else if (list3.size() > 1) {
                        c1086gP.L(-1567107141);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                        AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1566896682);
                        c1086gP.T(false);
                    }
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
                    androidx.compose.ui.h hVarB8 = v10.b(aVar4, true);
                    Integer num111 = numValueOf;
                    C0953m c0953mA16 = C0952l.a(kVar8, aVar1116, c1086gP, 48);
                    i32 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P115 = c1086gP.P();
                    androidx.compose.ui.h hVarC1113 = ComposedModifierKt.c(c1086gP, hVarB8);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar113, c1086gP, c0953mA16);
                    R0.a(pVar114, c1086gP, interfaceC1089h0P115);
                    if (c1086gP.f12995O) {
                        J4.i.d(i32, c1086gP, i32, pVar);
                    } else {
                        J4.i.d(i32, c1086gP, i32, pVar);
                    }
                    R0.a(pVar115, c1086gP, hVarC1113);
                    IntercomTheme intercomTheme8 = IntercomTheme.INSTANCE;
                    int i412 = IntercomTheme.$stable;
                    TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme8.getTypography(c1086gP, i412).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
                    c1086gP.L(1212144132);
                    if (str5 != null) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    c1086gP.T(false);
                    c1086gP.T(z16);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
                    c1086gP.L(-1851611912);
                    if (qVar2 == 0) {
                        qVar3 = qVar2;
                    } else {
                        qVar3 = qVar2;
                        qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        p293xa.r rVar17 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.L(369373838);
                    if (!kotlin.text.n.S(str6)) {
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    j15 = j14;
                    qVar4 = qVar3;
                    j16 = jM642getOnHeader0d7_KjU2;
                    num5 = num110;
                    str7 = str5;
                    z17 = z13;
                    list4 = list3;
                    aVar3 = aVar1118;
                    hVar3 = hVar11;
                    aVar6 = aVar1117;
                    j17 = j115;
                    numValueOf = num111;
                } else {
                    c1086gP.r0();
                    if ((i10 & 1) != 0) {
                        i27 = i22;
                        if (i36 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i38 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i40 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i16 != 0) {
                            list2 = EmptyList.f42983b;
                        } else {
                            list2 = list;
                        }
                        if (i17 != 0) {
                            aVar3 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                            i21 &= -3670017;
                        }
                        if (i19 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((256 & i12) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                            i21 &= -234881025;
                        } else {
                            jM635getHeader0d7_KjU = j12;
                        }
                        if ((i12 & 512) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i21 &= -1879048193;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if ((1024 & i12) != 0) {
                            jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i28 = i27 & (-15);
                        } else {
                            jM642getOnHeader0d7_KjU2 = j11;
                            i28 = i27;
                        }
                        if (i23 != 0) {
                            eVar = new coil.e(1);
                        } else {
                            eVar = aVar2;
                        }
                        if (i25 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        z12 = z11;
                        num4 = num3;
                    } else {
                        i27 = i22;
                        if (i36 != 0) {
                            hVar2 = androidx.compose.ui.h.a.f13984b;
                        }
                        if (i38 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i40 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i14 != 0) {
                            num3 = null;
                        } else {
                            num3 = num;
                        }
                        if (i16 != 0) {
                            list2 = EmptyList.f42983b;
                        } else {
                            list2 = list;
                        }
                        if (i17 != 0) {
                            aVar3 = null;
                        }
                        if ((i12 & 64) != 0) {
                            numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                            i21 &= -3670017;
                        }
                        if (i19 != 0) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                        if ((256 & i12) != 0) {
                            jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                            i21 &= -234881025;
                        } else {
                            jM635getHeader0d7_KjU = j12;
                        }
                        if ((i12 & 512) != 0) {
                            jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i21 &= -1879048193;
                        } else {
                            jM642getOnHeader0d7_KjU = j10;
                        }
                        if ((1024 & i12) != 0) {
                            jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                            i28 = i27 & (-15);
                        } else {
                            jM642getOnHeader0d7_KjU2 = j11;
                            i28 = i27;
                        }
                        if (i23 != 0) {
                            eVar = new coil.e(1);
                        } else {
                            eVar = aVar2;
                        }
                        if (i25 != 0) {
                            qVar2 = null;
                        } else {
                            qVar2 = qVar;
                        }
                        z12 = z11;
                        num4 = num3;
                    }
                    c1086gP.U();
                    activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
                    if (activity != null) {
                        window = activity.getWindow();
                    } else {
                        window = null;
                    }
                    c1086gP.L(-1152540944);
                    if (window != null) {
                        Ia.a<p293xa.r> aVar1119 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                            @Override // Ia.a
                            public final Object invoke() {
                                return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                            }
                        };
                        androidx.compose.runtime.B b18 = androidx.compose.runtime.E.f12831a;
                        c1086gP.l(aVar1119);
                        p293xa.r rVar18 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    aVar4 = androidx.compose.ui.h.a.f13984b;
                    Integer num112 = num4;
                    C0945e.k kVar9 = C0945e.f10286c;
                    str5 = str4;
                    androidx.compose.ui.f.a aVar11110 = androidx.compose.ui.d.a.f13346m;
                    str6 = str3;
                    C0953m c0953mA17 = C0952l.a(kVar9, aVar11110, c1086gP, 0);
                    i29 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P116 = c1086gP.P();
                    androidx.compose.ui.h hVarC1114 = ComposedModifierKt.c(c1086gP, aVar4);
                    ComposeUiNode.f14331c0.getClass();
                    z13 = z12;
                    aVar5 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    list3 = list2;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar116 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar116, c1086gP, c0953mA17);
                    Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar117 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar117, c1086gP, interfaceC1089h0P116);
                    pVar = ComposeUiNode.Companion.f14338g;
                    j13 = jM642getOnHeader0d7_KjU;
                    if (c1086gP.f12995O) {
                        J4.i.d(i29, c1086gP, i29, pVar);
                    } else {
                        J4.i.d(i29, c1086gP, i29, pVar);
                    }
                    Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar118 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar118, c1086gP, hVarC1114);
                    float f19 = 4;
                    androidx.compose.ui.h hVarJ9 = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f19, 0.0f, 11);
                    c1086gP.L(369283361);
                    androidx.compose.ui.h hVar12 = hVar2;
                    if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objF = c1086gP.f();
                    if (z14) {
                        z15 = false;
                        objF = new O0(0 == true ? 1 : 0, eVar);
                        c1086gP.E(objF);
                    } else {
                        z15 = false;
                        objF = new O0(0 == true ? 1 : 0, eVar);
                        c1086gP.E(objF);
                    }
                    c1086gP.T(z15);
                    Ia.a<p293xa.r> aVar11111 = eVar;
                    long j116 = jM635getHeader0d7_KjU;
                    androidx.compose.ui.h hVarC1115 = ClickableKt.c(hVarJ9, z15, null, (Ia.a) objF, 7);
                    androidx.compose.ui.f.b bVar9 = androidx.compose.ui.d.a.f13344k;
                    C0945e.j jVar9 = C0945e.f10284a;
                    androidx.compose.foundation.layout.T tA10 = androidx.compose.foundation.layout.S.a(jVar9, bVar9, c1086gP, 48);
                    i30 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P117 = c1086gP.P();
                    androidx.compose.ui.h hVarC1116 = ComposedModifierKt.c(c1086gP, hVarC1115);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar116, c1086gP, tA10);
                    R0.a(pVar117, c1086gP, interfaceC1089h0P117);
                    if (c1086gP.f12995O) {
                        J4.i.d(i30, c1086gP, i30, pVar);
                    } else {
                        J4.i.d(i30, c1086gP, i30, pVar);
                    }
                    R0.a(pVar118, c1086gP, hVarC1116);
                    v10 = androidx.compose.foundation.layout.V.f10222a;
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f19));
                    c1086gP.L(-1851695824);
                    if (aVar3 != null) {
                        j14 = j13;
                    } else {
                        j14 = j13;
                    }
                    c1086gP.T(false);
                    if (aVar3 != null) {
                        i31 = 8;
                    } else {
                        i31 = 16;
                    }
                    f10 = i31;
                    Ia.a<p293xa.r> aVar11112 = aVar3;
                    if (list3.size() == 1) {
                        c1086gP.L(-1567408864);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                        AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                        c1086gP.T(false);
                    } else if (list3.size() > 1) {
                        c1086gP.L(-1567107141);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                        AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(-1566896682);
                        c1086gP.T(false);
                    }
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
                    androidx.compose.ui.h hVarB9 = v10.b(aVar4, true);
                    Integer num113 = numValueOf;
                    C0953m c0953mA18 = C0952l.a(kVar9, aVar11110, c1086gP, 48);
                    i32 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P118 = c1086gP.P();
                    androidx.compose.ui.h hVarC1117 = ComposedModifierKt.c(c1086gP, hVarB9);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar5);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar116, c1086gP, c0953mA18);
                    R0.a(pVar117, c1086gP, interfaceC1089h0P118);
                    if (c1086gP.f12995O) {
                        J4.i.d(i32, c1086gP, i32, pVar);
                    } else {
                        J4.i.d(i32, c1086gP, i32, pVar);
                    }
                    R0.a(pVar118, c1086gP, hVarC1117);
                    IntercomTheme intercomTheme9 = IntercomTheme.INSTANCE;
                    int i413 = IntercomTheme.$stable;
                    TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme9.getTypography(c1086gP, i413).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
                    c1086gP.L(1212144132);
                    if (str5 != null) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    c1086gP.T(false);
                    c1086gP.T(z16);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
                    c1086gP.L(-1851611912);
                    if (qVar2 == 0) {
                        qVar3 = qVar2;
                    } else {
                        qVar3 = qVar2;
                        qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                        p293xa.r rVar19 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.L(369373838);
                    if (!kotlin.text.n.S(str6)) {
                        IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    j15 = j14;
                    qVar4 = qVar3;
                    j16 = jM642getOnHeader0d7_KjU2;
                    num5 = num112;
                    str7 = str5;
                    z17 = z13;
                    list4 = list3;
                    aVar3 = aVar11112;
                    hVar3 = hVar12;
                    aVar6 = aVar11111;
                    j17 = j116;
                    numValueOf = num113;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final String str12 = str6;
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.P0
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(hVar3, str12, str7, num5, list4, aVar3, numValueOf, z17, j17, j15, j16, aVar6, qVar4, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i22 |= 48;
            i25 = i12 & 4096;
            if (i25 != 0) {
                i22 |= 384;
            } else if ((i11 & 896) != 0) {
                if (c1086gP.k(qVar)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i22 |= i26;
            }
            if (i16 != 16) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    i27 = i22;
                    if (i36 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i38 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i40 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i16 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                        i21 &= -3670017;
                    }
                    if (i19 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((256 & i12) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                        i21 &= -234881025;
                    } else {
                        jM635getHeader0d7_KjU = j12;
                    }
                    if ((i12 & 512) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i21 &= -1879048193;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if ((1024 & i12) != 0) {
                        jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i28 = i27 & (-15);
                    } else {
                        jM642getOnHeader0d7_KjU2 = j11;
                        i28 = i27;
                    }
                    if (i23 != 0) {
                        eVar = new coil.e(1);
                    } else {
                        eVar = aVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    z12 = z11;
                    num4 = num3;
                } else {
                    i27 = i22;
                    if (i36 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i38 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i40 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i16 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                        i21 &= -3670017;
                    }
                    if (i19 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((256 & i12) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                        i21 &= -234881025;
                    } else {
                        jM635getHeader0d7_KjU = j12;
                    }
                    if ((i12 & 512) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i21 &= -1879048193;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if ((1024 & i12) != 0) {
                        jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i28 = i27 & (-15);
                    } else {
                        jM642getOnHeader0d7_KjU2 = j11;
                        i28 = i27;
                    }
                    if (i23 != 0) {
                        eVar = new coil.e(1);
                    } else {
                        eVar = aVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    z12 = z11;
                    num4 = num3;
                }
                c1086gP.U();
                activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                c1086gP.L(-1152540944);
                if (window != null) {
                    Ia.a<p293xa.r> aVar11113 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                        @Override // Ia.a
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                        }
                    };
                    androidx.compose.runtime.B b19 = androidx.compose.runtime.E.f12831a;
                    c1086gP.l(aVar11113);
                    p293xa.r rVar110 = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                aVar4 = androidx.compose.ui.h.a.f13984b;
                Integer num114 = num4;
                C0945e.k kVar10 = C0945e.f10286c;
                str5 = str4;
                androidx.compose.ui.f.a aVar11114 = androidx.compose.ui.d.a.f13346m;
                str6 = str3;
                C0953m c0953mA19 = C0952l.a(kVar10, aVar11114, c1086gP, 0);
                i29 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P119 = c1086gP.P();
                androidx.compose.ui.h hVarC1118 = ComposedModifierKt.c(c1086gP, aVar4);
                ComposeUiNode.f14331c0.getClass();
                z13 = z12;
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                list3 = list2;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar119 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar119, c1086gP, c0953mA19);
                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar1110 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar1110, c1086gP, interfaceC1089h0P119);
                pVar = ComposeUiNode.Companion.f14338g;
                j13 = jM642getOnHeader0d7_KjU;
                if (c1086gP.f12995O) {
                    J4.i.d(i29, c1086gP, i29, pVar);
                } else {
                    J4.i.d(i29, c1086gP, i29, pVar);
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar1111 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar1111, c1086gP, hVarC1118);
                float f110 = 4;
                androidx.compose.ui.h hVarJ10 = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f110, 0.0f, 11);
                c1086gP.L(369283361);
                androidx.compose.ui.h hVar13 = hVar2;
                if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objF = c1086gP.f();
                if (z14) {
                    z15 = false;
                    objF = new O0(0 == true ? 1 : 0, eVar);
                    c1086gP.E(objF);
                } else {
                    z15 = false;
                    objF = new O0(0 == true ? 1 : 0, eVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(z15);
                Ia.a<p293xa.r> aVar11115 = eVar;
                long j117 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC1119 = ClickableKt.c(hVarJ10, z15, null, (Ia.a) objF, 7);
                androidx.compose.ui.f.b bVar10 = androidx.compose.ui.d.a.f13344k;
                C0945e.j jVar10 = C0945e.f10284a;
                androidx.compose.foundation.layout.T tA11 = androidx.compose.foundation.layout.S.a(jVar10, bVar10, c1086gP, 48);
                i30 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1110 = c1086gP.P();
                androidx.compose.ui.h hVarC11110 = ComposedModifierKt.c(c1086gP, hVarC1119);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar119, c1086gP, tA11);
                R0.a(pVar1110, c1086gP, interfaceC1089h0P1110);
                if (c1086gP.f12995O) {
                    J4.i.d(i30, c1086gP, i30, pVar);
                } else {
                    J4.i.d(i30, c1086gP, i30, pVar);
                }
                R0.a(pVar1111, c1086gP, hVarC11110);
                v10 = androidx.compose.foundation.layout.V.f10222a;
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f110));
                c1086gP.L(-1851695824);
                if (aVar3 != null) {
                    j14 = j13;
                } else {
                    j14 = j13;
                }
                c1086gP.T(false);
                if (aVar3 != null) {
                    i31 = 8;
                } else {
                    i31 = 16;
                }
                f10 = i31;
                Ia.a<p293xa.r> aVar11116 = aVar3;
                if (list3.size() == 1) {
                    c1086gP.L(-1567408864);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                    AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                    c1086gP.T(false);
                } else if (list3.size() > 1) {
                    c1086gP.L(-1567107141);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                    AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1566896682);
                    c1086gP.T(false);
                }
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
                androidx.compose.ui.h hVarB10 = v10.b(aVar4, true);
                Integer num115 = numValueOf;
                C0953m c0953mA110 = C0952l.a(kVar10, aVar11114, c1086gP, 48);
                i32 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111 = c1086gP.P();
                androidx.compose.ui.h hVarC11111 = ComposedModifierKt.c(c1086gP, hVarB10);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar119, c1086gP, c0953mA110);
                R0.a(pVar1110, c1086gP, interfaceC1089h0P1111);
                if (c1086gP.f12995O) {
                    J4.i.d(i32, c1086gP, i32, pVar);
                } else {
                    J4.i.d(i32, c1086gP, i32, pVar);
                }
                R0.a(pVar1111, c1086gP, hVarC11111);
                IntercomTheme intercomTheme10 = IntercomTheme.INSTANCE;
                int i414 = IntercomTheme.$stable;
                TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme10.getTypography(c1086gP, i414).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
                c1086gP.L(1212144132);
                if (str5 != null) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                c1086gP.T(false);
                c1086gP.T(z16);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
                c1086gP.L(-1851611912);
                if (qVar2 == 0) {
                    qVar3 = qVar2;
                } else {
                    qVar3 = qVar2;
                    qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    p293xa.r rVar111 = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.L(369373838);
                if (!kotlin.text.n.S(str6)) {
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                j15 = j14;
                qVar4 = qVar3;
                j16 = jM642getOnHeader0d7_KjU2;
                num5 = num114;
                str7 = str5;
                z17 = z13;
                list4 = list3;
                aVar3 = aVar11116;
                hVar3 = hVar13;
                aVar6 = aVar11115;
                j17 = j117;
                numValueOf = num115;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    i27 = i22;
                    if (i36 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i38 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i40 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i16 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                        i21 &= -3670017;
                    }
                    if (i19 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((256 & i12) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                        i21 &= -234881025;
                    } else {
                        jM635getHeader0d7_KjU = j12;
                    }
                    if ((i12 & 512) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i21 &= -1879048193;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if ((1024 & i12) != 0) {
                        jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i28 = i27 & (-15);
                    } else {
                        jM642getOnHeader0d7_KjU2 = j11;
                        i28 = i27;
                    }
                    if (i23 != 0) {
                        eVar = new coil.e(1);
                    } else {
                        eVar = aVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    z12 = z11;
                    num4 = num3;
                } else {
                    i27 = i22;
                    if (i36 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i38 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i40 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i16 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                        i21 &= -3670017;
                    }
                    if (i19 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((256 & i12) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                        i21 &= -234881025;
                    } else {
                        jM635getHeader0d7_KjU = j12;
                    }
                    if ((i12 & 512) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i21 &= -1879048193;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if ((1024 & i12) != 0) {
                        jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i28 = i27 & (-15);
                    } else {
                        jM642getOnHeader0d7_KjU2 = j11;
                        i28 = i27;
                    }
                    if (i23 != 0) {
                        eVar = new coil.e(1);
                    } else {
                        eVar = aVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    z12 = z11;
                    num4 = num3;
                }
                c1086gP.U();
                activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                c1086gP.L(-1152540944);
                if (window != null) {
                    Ia.a<p293xa.r> aVar11117 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                        @Override // Ia.a
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                        }
                    };
                    androidx.compose.runtime.B b110 = androidx.compose.runtime.E.f12831a;
                    c1086gP.l(aVar11117);
                    p293xa.r rVar112 = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                aVar4 = androidx.compose.ui.h.a.f13984b;
                Integer num116 = num4;
                C0945e.k kVar11 = C0945e.f10286c;
                str5 = str4;
                androidx.compose.ui.f.a aVar11118 = androidx.compose.ui.d.a.f13346m;
                str6 = str3;
                C0953m c0953mA111 = C0952l.a(kVar11, aVar11118, c1086gP, 0);
                i29 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1112 = c1086gP.P();
                androidx.compose.ui.h hVarC11112 = ComposedModifierKt.c(c1086gP, aVar4);
                ComposeUiNode.f14331c0.getClass();
                z13 = z12;
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                list3 = list2;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar1112 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar1112, c1086gP, c0953mA111);
                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar1113 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar1113, c1086gP, interfaceC1089h0P1112);
                pVar = ComposeUiNode.Companion.f14338g;
                j13 = jM642getOnHeader0d7_KjU;
                if (c1086gP.f12995O) {
                    J4.i.d(i29, c1086gP, i29, pVar);
                } else {
                    J4.i.d(i29, c1086gP, i29, pVar);
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar1114 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar1114, c1086gP, hVarC11112);
                float f111 = 4;
                androidx.compose.ui.h hVarJ11 = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f111, 0.0f, 11);
                c1086gP.L(369283361);
                androidx.compose.ui.h hVar14 = hVar2;
                if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objF = c1086gP.f();
                if (z14) {
                    z15 = false;
                    objF = new O0(0 == true ? 1 : 0, eVar);
                    c1086gP.E(objF);
                } else {
                    z15 = false;
                    objF = new O0(0 == true ? 1 : 0, eVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(z15);
                Ia.a<p293xa.r> aVar11119 = eVar;
                long j118 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC11113 = ClickableKt.c(hVarJ11, z15, null, (Ia.a) objF, 7);
                androidx.compose.ui.f.b bVar11 = androidx.compose.ui.d.a.f13344k;
                C0945e.j jVar11 = C0945e.f10284a;
                androidx.compose.foundation.layout.T tA12 = androidx.compose.foundation.layout.S.a(jVar11, bVar11, c1086gP, 48);
                i30 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1113 = c1086gP.P();
                androidx.compose.ui.h hVarC11114 = ComposedModifierKt.c(c1086gP, hVarC11113);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar1112, c1086gP, tA12);
                R0.a(pVar1113, c1086gP, interfaceC1089h0P1113);
                if (c1086gP.f12995O) {
                    J4.i.d(i30, c1086gP, i30, pVar);
                } else {
                    J4.i.d(i30, c1086gP, i30, pVar);
                }
                R0.a(pVar1114, c1086gP, hVarC11114);
                v10 = androidx.compose.foundation.layout.V.f10222a;
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f111));
                c1086gP.L(-1851695824);
                if (aVar3 != null) {
                    j14 = j13;
                } else {
                    j14 = j13;
                }
                c1086gP.T(false);
                if (aVar3 != null) {
                    i31 = 8;
                } else {
                    i31 = 16;
                }
                f10 = i31;
                Ia.a<p293xa.r> aVar111110 = aVar3;
                if (list3.size() == 1) {
                    c1086gP.L(-1567408864);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                    AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                    c1086gP.T(false);
                } else if (list3.size() > 1) {
                    c1086gP.L(-1567107141);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                    AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1566896682);
                    c1086gP.T(false);
                }
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
                androidx.compose.ui.h hVarB11 = v10.b(aVar4, true);
                Integer num117 = numValueOf;
                C0953m c0953mA112 = C0952l.a(kVar11, aVar11118, c1086gP, 48);
                i32 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1114 = c1086gP.P();
                androidx.compose.ui.h hVarC11115 = ComposedModifierKt.c(c1086gP, hVarB11);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar1112, c1086gP, c0953mA112);
                R0.a(pVar1113, c1086gP, interfaceC1089h0P1114);
                if (c1086gP.f12995O) {
                    J4.i.d(i32, c1086gP, i32, pVar);
                } else {
                    J4.i.d(i32, c1086gP, i32, pVar);
                }
                R0.a(pVar1114, c1086gP, hVarC11115);
                IntercomTheme intercomTheme11 = IntercomTheme.INSTANCE;
                int i415 = IntercomTheme.$stable;
                TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme11.getTypography(c1086gP, i415).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
                c1086gP.L(1212144132);
                if (str5 != null) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                c1086gP.T(false);
                c1086gP.T(z16);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
                c1086gP.L(-1851611912);
                if (qVar2 == 0) {
                    qVar3 = qVar2;
                } else {
                    qVar3 = qVar2;
                    qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    p293xa.r rVar113 = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.L(369373838);
                if (!kotlin.text.n.S(str6)) {
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                j15 = j14;
                qVar4 = qVar3;
                j16 = jM642getOnHeader0d7_KjU2;
                num5 = num116;
                str7 = str5;
                z17 = z13;
                list4 = list3;
                aVar3 = aVar111110;
                hVar3 = hVar14;
                aVar6 = aVar11119;
                j17 = j118;
                numValueOf = num117;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final String str13 = str6;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.P0
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(hVar3, str13, str7, num5, list4, aVar3, numValueOf, z17, j17, j15, j16, aVar6, qVar4, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i39 |= 3072;
        i16 = i12 & 16;
        if (i16 != 0) {
            i39 |= 8192;
        }
        i17 = i12 & 32;
        if (i17 != 0) {
            i39 |= 196608;
            aVar3 = aVar;
        } else {
            aVar3 = aVar;
            if ((i10 & 458752) == 0) {
                if (c1086gP.k(aVar3)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i39 |= i18;
            }
        }
        if ((i10 & 3670016) == 0) {
            numValueOf = num2;
            if ((i12 & 64) == 0) {
                i35 = 524288;
            } else {
                i35 = 524288;
            }
            i39 |= i35;
        } else {
            numValueOf = num2;
        }
        i19 = i12 & 128;
        if (i19 != 0) {
            i39 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (c1086gP.c(z10)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i39 |= i20;
        }
        if ((i10 & 234881024) == 0) {
            int i416 = i39;
            j12 = j;
            if ((i12 & 256) == 0) {
                i34 = 33554432;
            } else {
                i34 = 33554432;
            }
            i21 = i416 | i34;
        } else {
            i21 = i39;
            j12 = j;
        }
        if ((i10 & 1879048192) != 0) {
            if ((i12 & 512) == 0) {
                i33 = 268435456;
            } else {
                i33 = 268435456;
            }
            i21 |= i33;
        }
        if ((i11 & 14) == 0) {
            if ((i12 & 1024) == 0) {
                i37 = 4;
            }
            i22 = i11 | i37;
        } else {
            i22 = i11;
        }
        i23 = 2048 & i12;
        if (i23 != 0) {
            if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                if (c1086gP.k(aVar2)) {
                    i24 = 32;
                } else {
                    i24 = 16;
                }
                i22 |= i24;
            }
            i25 = i12 & 4096;
            if (i25 != 0) {
                i22 |= 384;
            } else if ((i11 & 896) != 0) {
                if (c1086gP.k(qVar)) {
                    i26 = 256;
                } else {
                    i26 = 128;
                }
                i22 |= i26;
            }
            if (i16 != 16) {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    i27 = i22;
                    if (i36 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i38 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i40 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i16 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                        i21 &= -3670017;
                    }
                    if (i19 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((256 & i12) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                        i21 &= -234881025;
                    } else {
                        jM635getHeader0d7_KjU = j12;
                    }
                    if ((i12 & 512) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i21 &= -1879048193;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if ((1024 & i12) != 0) {
                        jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i28 = i27 & (-15);
                    } else {
                        jM642getOnHeader0d7_KjU2 = j11;
                        i28 = i27;
                    }
                    if (i23 != 0) {
                        eVar = new coil.e(1);
                    } else {
                        eVar = aVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    z12 = z11;
                    num4 = num3;
                } else {
                    i27 = i22;
                    if (i36 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i38 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i40 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i16 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                        i21 &= -3670017;
                    }
                    if (i19 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((256 & i12) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                        i21 &= -234881025;
                    } else {
                        jM635getHeader0d7_KjU = j12;
                    }
                    if ((i12 & 512) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i21 &= -1879048193;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if ((1024 & i12) != 0) {
                        jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i28 = i27 & (-15);
                    } else {
                        jM642getOnHeader0d7_KjU2 = j11;
                        i28 = i27;
                    }
                    if (i23 != 0) {
                        eVar = new coil.e(1);
                    } else {
                        eVar = aVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    z12 = z11;
                    num4 = num3;
                }
                c1086gP.U();
                activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                c1086gP.L(-1152540944);
                if (window != null) {
                    Ia.a<p293xa.r> aVar111111 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                        @Override // Ia.a
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                        }
                    };
                    androidx.compose.runtime.B b111 = androidx.compose.runtime.E.f12831a;
                    c1086gP.l(aVar111111);
                    p293xa.r rVar114 = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                aVar4 = androidx.compose.ui.h.a.f13984b;
                Integer num118 = num4;
                C0945e.k kVar12 = C0945e.f10286c;
                str5 = str4;
                androidx.compose.ui.f.a aVar111112 = androidx.compose.ui.d.a.f13346m;
                str6 = str3;
                C0953m c0953mA113 = C0952l.a(kVar12, aVar111112, c1086gP, 0);
                i29 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1115 = c1086gP.P();
                androidx.compose.ui.h hVarC11116 = ComposedModifierKt.c(c1086gP, aVar4);
                ComposeUiNode.f14331c0.getClass();
                z13 = z12;
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                list3 = list2;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar1115 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar1115, c1086gP, c0953mA113);
                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar1116 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar1116, c1086gP, interfaceC1089h0P1115);
                pVar = ComposeUiNode.Companion.f14338g;
                j13 = jM642getOnHeader0d7_KjU;
                if (c1086gP.f12995O) {
                    J4.i.d(i29, c1086gP, i29, pVar);
                } else {
                    J4.i.d(i29, c1086gP, i29, pVar);
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar1117 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar1117, c1086gP, hVarC11116);
                float f112 = 4;
                androidx.compose.ui.h hVarJ12 = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f112, 0.0f, 11);
                c1086gP.L(369283361);
                androidx.compose.ui.h hVar15 = hVar2;
                if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objF = c1086gP.f();
                if (z14) {
                    z15 = false;
                    objF = new O0(0 == true ? 1 : 0, eVar);
                    c1086gP.E(objF);
                } else {
                    z15 = false;
                    objF = new O0(0 == true ? 1 : 0, eVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(z15);
                Ia.a<p293xa.r> aVar111113 = eVar;
                long j119 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC11117 = ClickableKt.c(hVarJ12, z15, null, (Ia.a) objF, 7);
                androidx.compose.ui.f.b bVar12 = androidx.compose.ui.d.a.f13344k;
                C0945e.j jVar12 = C0945e.f10284a;
                androidx.compose.foundation.layout.T tA13 = androidx.compose.foundation.layout.S.a(jVar12, bVar12, c1086gP, 48);
                i30 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1116 = c1086gP.P();
                androidx.compose.ui.h hVarC11118 = ComposedModifierKt.c(c1086gP, hVarC11117);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar1115, c1086gP, tA13);
                R0.a(pVar1116, c1086gP, interfaceC1089h0P1116);
                if (c1086gP.f12995O) {
                    J4.i.d(i30, c1086gP, i30, pVar);
                } else {
                    J4.i.d(i30, c1086gP, i30, pVar);
                }
                R0.a(pVar1117, c1086gP, hVarC11118);
                v10 = androidx.compose.foundation.layout.V.f10222a;
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f112));
                c1086gP.L(-1851695824);
                if (aVar3 != null) {
                    j14 = j13;
                } else {
                    j14 = j13;
                }
                c1086gP.T(false);
                if (aVar3 != null) {
                    i31 = 8;
                } else {
                    i31 = 16;
                }
                f10 = i31;
                Ia.a<p293xa.r> aVar111114 = aVar3;
                if (list3.size() == 1) {
                    c1086gP.L(-1567408864);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                    AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                    c1086gP.T(false);
                } else if (list3.size() > 1) {
                    c1086gP.L(-1567107141);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                    AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1566896682);
                    c1086gP.T(false);
                }
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
                androidx.compose.ui.h hVarB12 = v10.b(aVar4, true);
                Integer num119 = numValueOf;
                C0953m c0953mA114 = C0952l.a(kVar12, aVar111112, c1086gP, 48);
                i32 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1117 = c1086gP.P();
                androidx.compose.ui.h hVarC11119 = ComposedModifierKt.c(c1086gP, hVarB12);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar1115, c1086gP, c0953mA114);
                R0.a(pVar1116, c1086gP, interfaceC1089h0P1117);
                if (c1086gP.f12995O) {
                    J4.i.d(i32, c1086gP, i32, pVar);
                } else {
                    J4.i.d(i32, c1086gP, i32, pVar);
                }
                R0.a(pVar1117, c1086gP, hVarC11119);
                IntercomTheme intercomTheme12 = IntercomTheme.INSTANCE;
                int i417 = IntercomTheme.$stable;
                TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme12.getTypography(c1086gP, i417).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
                c1086gP.L(1212144132);
                if (str5 != null) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                c1086gP.T(false);
                c1086gP.T(z16);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
                c1086gP.L(-1851611912);
                if (qVar2 == 0) {
                    qVar3 = qVar2;
                } else {
                    qVar3 = qVar2;
                    qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    p293xa.r rVar115 = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.L(369373838);
                if (!kotlin.text.n.S(str6)) {
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                j15 = j14;
                qVar4 = qVar3;
                j16 = jM642getOnHeader0d7_KjU2;
                num5 = num118;
                str7 = str5;
                z17 = z13;
                list4 = list3;
                aVar3 = aVar111114;
                hVar3 = hVar15;
                aVar6 = aVar111113;
                j17 = j119;
                numValueOf = num119;
            } else {
                c1086gP.r0();
                if ((i10 & 1) != 0) {
                    i27 = i22;
                    if (i36 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i38 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i40 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i16 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                        i21 &= -3670017;
                    }
                    if (i19 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((256 & i12) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                        i21 &= -234881025;
                    } else {
                        jM635getHeader0d7_KjU = j12;
                    }
                    if ((i12 & 512) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i21 &= -1879048193;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if ((1024 & i12) != 0) {
                        jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i28 = i27 & (-15);
                    } else {
                        jM642getOnHeader0d7_KjU2 = j11;
                        i28 = i27;
                    }
                    if (i23 != 0) {
                        eVar = new coil.e(1);
                    } else {
                        eVar = aVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    z12 = z11;
                    num4 = num3;
                } else {
                    i27 = i22;
                    if (i36 != 0) {
                        hVar2 = androidx.compose.ui.h.a.f13984b;
                    }
                    if (i38 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i40 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i14 != 0) {
                        num3 = null;
                    } else {
                        num3 = num;
                    }
                    if (i16 != 0) {
                        list2 = EmptyList.f42983b;
                    } else {
                        list2 = list;
                    }
                    if (i17 != 0) {
                        aVar3 = null;
                    }
                    if ((i12 & 64) != 0) {
                        numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                        i21 &= -3670017;
                    }
                    if (i19 != 0) {
                        z11 = false;
                    } else {
                        z11 = z10;
                    }
                    if ((256 & i12) != 0) {
                        jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                        i21 &= -234881025;
                    } else {
                        jM635getHeader0d7_KjU = j12;
                    }
                    if ((i12 & 512) != 0) {
                        jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i21 &= -1879048193;
                    } else {
                        jM642getOnHeader0d7_KjU = j10;
                    }
                    if ((1024 & i12) != 0) {
                        jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                        i28 = i27 & (-15);
                    } else {
                        jM642getOnHeader0d7_KjU2 = j11;
                        i28 = i27;
                    }
                    if (i23 != 0) {
                        eVar = new coil.e(1);
                    } else {
                        eVar = aVar2;
                    }
                    if (i25 != 0) {
                        qVar2 = null;
                    } else {
                        qVar2 = qVar;
                    }
                    z12 = z11;
                    num4 = num3;
                }
                c1086gP.U();
                activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
                if (activity != null) {
                    window = activity.getWindow();
                } else {
                    window = null;
                }
                c1086gP.L(-1152540944);
                if (window != null) {
                    Ia.a<p293xa.r> aVar111115 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                        @Override // Ia.a
                        public final Object invoke() {
                            return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                        }
                    };
                    androidx.compose.runtime.B b112 = androidx.compose.runtime.E.f12831a;
                    c1086gP.l(aVar111115);
                    p293xa.r rVar116 = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                aVar4 = androidx.compose.ui.h.a.f13984b;
                Integer num1110 = num4;
                C0945e.k kVar13 = C0945e.f10286c;
                str5 = str4;
                androidx.compose.ui.f.a aVar111116 = androidx.compose.ui.d.a.f13346m;
                str6 = str3;
                C0953m c0953mA115 = C0952l.a(kVar13, aVar111116, c1086gP, 0);
                i29 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1118 = c1086gP.P();
                androidx.compose.ui.h hVarC111110 = ComposedModifierKt.c(c1086gP, aVar4);
                ComposeUiNode.f14331c0.getClass();
                z13 = z12;
                aVar5 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                list3 = list2;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar1118 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar1118, c1086gP, c0953mA115);
                Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar1119 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar1119, c1086gP, interfaceC1089h0P1118);
                pVar = ComposeUiNode.Companion.f14338g;
                j13 = jM642getOnHeader0d7_KjU;
                if (c1086gP.f12995O) {
                    J4.i.d(i29, c1086gP, i29, pVar);
                } else {
                    J4.i.d(i29, c1086gP, i29, pVar);
                }
                Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar11110 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar11110, c1086gP, hVarC111110);
                float f113 = 4;
                androidx.compose.ui.h hVarJ13 = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f113, 0.0f, 11);
                c1086gP.L(369283361);
                androidx.compose.ui.h hVar16 = hVar2;
                if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objF = c1086gP.f();
                if (z14) {
                    z15 = false;
                    objF = new O0(0 == true ? 1 : 0, eVar);
                    c1086gP.E(objF);
                } else {
                    z15 = false;
                    objF = new O0(0 == true ? 1 : 0, eVar);
                    c1086gP.E(objF);
                }
                c1086gP.T(z15);
                Ia.a<p293xa.r> aVar111117 = eVar;
                long j1110 = jM635getHeader0d7_KjU;
                androidx.compose.ui.h hVarC111111 = ClickableKt.c(hVarJ13, z15, null, (Ia.a) objF, 7);
                androidx.compose.ui.f.b bVar13 = androidx.compose.ui.d.a.f13344k;
                C0945e.j jVar13 = C0945e.f10284a;
                androidx.compose.foundation.layout.T tA14 = androidx.compose.foundation.layout.S.a(jVar13, bVar13, c1086gP, 48);
                i30 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1119 = c1086gP.P();
                androidx.compose.ui.h hVarC111112 = ComposedModifierKt.c(c1086gP, hVarC111111);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar1118, c1086gP, tA14);
                R0.a(pVar1119, c1086gP, interfaceC1089h0P1119);
                if (c1086gP.f12995O) {
                    J4.i.d(i30, c1086gP, i30, pVar);
                } else {
                    J4.i.d(i30, c1086gP, i30, pVar);
                }
                R0.a(pVar11110, c1086gP, hVarC111112);
                v10 = androidx.compose.foundation.layout.V.f10222a;
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f113));
                c1086gP.L(-1851695824);
                if (aVar3 != null) {
                    j14 = j13;
                } else {
                    j14 = j13;
                }
                c1086gP.T(false);
                if (aVar3 != null) {
                    i31 = 8;
                } else {
                    i31 = 16;
                }
                f10 = i31;
                Ia.a<p293xa.r> aVar111118 = aVar3;
                if (list3.size() == 1) {
                    c1086gP.L(-1567408864);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                    AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                    c1086gP.T(false);
                } else if (list3.size() > 1) {
                    c1086gP.L(-1567107141);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                    AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                    c1086gP.T(false);
                } else {
                    c1086gP.L(-1566896682);
                    c1086gP.T(false);
                }
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
                androidx.compose.ui.h hVarB13 = v10.b(aVar4, true);
                Integer num1111 = numValueOf;
                C0953m c0953mA116 = C0952l.a(kVar13, aVar111116, c1086gP, 48);
                i32 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11110 = c1086gP.P();
                androidx.compose.ui.h hVarC111113 = ComposedModifierKt.c(c1086gP, hVarB13);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar5);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar1118, c1086gP, c0953mA116);
                R0.a(pVar1119, c1086gP, interfaceC1089h0P11110);
                if (c1086gP.f12995O) {
                    J4.i.d(i32, c1086gP, i32, pVar);
                } else {
                    J4.i.d(i32, c1086gP, i32, pVar);
                }
                R0.a(pVar11110, c1086gP, hVarC111113);
                IntercomTheme intercomTheme13 = IntercomTheme.INSTANCE;
                int i418 = IntercomTheme.$stable;
                TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme13.getTypography(c1086gP, i418).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
                c1086gP.L(1212144132);
                if (str5 != null) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                c1086gP.T(false);
                c1086gP.T(z16);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
                c1086gP.L(-1851611912);
                if (qVar2 == 0) {
                    qVar3 = qVar2;
                } else {
                    qVar3 = qVar2;
                    qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                    p293xa.r rVar117 = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.L(369373838);
                if (!kotlin.text.n.S(str6)) {
                    IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                j15 = j14;
                qVar4 = qVar3;
                j16 = jM642getOnHeader0d7_KjU2;
                num5 = num1110;
                str7 = str5;
                z17 = z13;
                list4 = list3;
                aVar3 = aVar111118;
                hVar3 = hVar16;
                aVar6 = aVar111117;
                j17 = j1110;
                numValueOf = num1111;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final String str14 = str6;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.P0
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(hVar3, str14, str7, num5, list4, aVar3, numValueOf, z17, j17, j15, j16, aVar6, qVar4, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i22 |= 48;
        i25 = i12 & 4096;
        if (i25 != 0) {
            i22 |= 384;
        } else if ((i11 & 896) != 0) {
            if (c1086gP.k(qVar)) {
                i26 = 256;
            } else {
                i26 = 128;
            }
            i22 |= i26;
        }
        if (i16 != 16) {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                i27 = i22;
                if (i36 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i38 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i40 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i14 != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                if (i16 != 0) {
                    list2 = EmptyList.f42983b;
                } else {
                    list2 = list;
                }
                if (i17 != 0) {
                    aVar3 = null;
                }
                if ((i12 & 64) != 0) {
                    numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                    i21 &= -3670017;
                }
                if (i19 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((256 & i12) != 0) {
                    jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                    i21 &= -234881025;
                } else {
                    jM635getHeader0d7_KjU = j12;
                }
                if ((i12 & 512) != 0) {
                    jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                    i21 &= -1879048193;
                } else {
                    jM642getOnHeader0d7_KjU = j10;
                }
                if ((1024 & i12) != 0) {
                    jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                    i28 = i27 & (-15);
                } else {
                    jM642getOnHeader0d7_KjU2 = j11;
                    i28 = i27;
                }
                if (i23 != 0) {
                    eVar = new coil.e(1);
                } else {
                    eVar = aVar2;
                }
                if (i25 != 0) {
                    qVar2 = null;
                } else {
                    qVar2 = qVar;
                }
                z12 = z11;
                num4 = num3;
            } else {
                i27 = i22;
                if (i36 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i38 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i40 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i14 != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                if (i16 != 0) {
                    list2 = EmptyList.f42983b;
                } else {
                    list2 = list;
                }
                if (i17 != 0) {
                    aVar3 = null;
                }
                if ((i12 & 64) != 0) {
                    numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                    i21 &= -3670017;
                }
                if (i19 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((256 & i12) != 0) {
                    jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                    i21 &= -234881025;
                } else {
                    jM635getHeader0d7_KjU = j12;
                }
                if ((i12 & 512) != 0) {
                    jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                    i21 &= -1879048193;
                } else {
                    jM642getOnHeader0d7_KjU = j10;
                }
                if ((1024 & i12) != 0) {
                    jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                    i28 = i27 & (-15);
                } else {
                    jM642getOnHeader0d7_KjU2 = j11;
                    i28 = i27;
                }
                if (i23 != 0) {
                    eVar = new coil.e(1);
                } else {
                    eVar = aVar2;
                }
                if (i25 != 0) {
                    qVar2 = null;
                } else {
                    qVar2 = qVar;
                }
                z12 = z11;
                num4 = num3;
            }
            c1086gP.U();
            activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
            if (activity != null) {
                window = activity.getWindow();
            } else {
                window = null;
            }
            c1086gP.L(-1152540944);
            if (window != null) {
                Ia.a<p293xa.r> aVar111119 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                    @Override // Ia.a
                    public final Object invoke() {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                    }
                };
                androidx.compose.runtime.B b113 = androidx.compose.runtime.E.f12831a;
                c1086gP.l(aVar111119);
                p293xa.r rVar118 = p293xa.r.f47939a;
            }
            c1086gP.T(false);
            aVar4 = androidx.compose.ui.h.a.f13984b;
            Integer num1112 = num4;
            C0945e.k kVar14 = C0945e.f10286c;
            str5 = str4;
            androidx.compose.ui.f.a aVar1111110 = androidx.compose.ui.d.a.f13346m;
            str6 = str3;
            C0953m c0953mA117 = C0952l.a(kVar14, aVar1111110, c1086gP, 0);
            i29 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P11111 = c1086gP.P();
            androidx.compose.ui.h hVarC111114 = ComposedModifierKt.c(c1086gP, aVar4);
            ComposeUiNode.f14331c0.getClass();
            z13 = z12;
            aVar5 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            list3 = list2;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar11111 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar11111, c1086gP, c0953mA117);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar11112 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar11112, c1086gP, interfaceC1089h0P11111);
            pVar = ComposeUiNode.Companion.f14338g;
            j13 = jM642getOnHeader0d7_KjU;
            if (c1086gP.f12995O) {
                J4.i.d(i29, c1086gP, i29, pVar);
            } else {
                J4.i.d(i29, c1086gP, i29, pVar);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar11113 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar11113, c1086gP, hVarC111114);
            float f114 = 4;
            androidx.compose.ui.h hVarJ14 = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f114, 0.0f, 11);
            c1086gP.L(369283361);
            androidx.compose.ui.h hVar17 = hVar2;
            if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objF = c1086gP.f();
            if (z14) {
                z15 = false;
                objF = new O0(0 == true ? 1 : 0, eVar);
                c1086gP.E(objF);
            } else {
                z15 = false;
                objF = new O0(0 == true ? 1 : 0, eVar);
                c1086gP.E(objF);
            }
            c1086gP.T(z15);
            Ia.a<p293xa.r> aVar1111111 = eVar;
            long j1111 = jM635getHeader0d7_KjU;
            androidx.compose.ui.h hVarC111115 = ClickableKt.c(hVarJ14, z15, null, (Ia.a) objF, 7);
            androidx.compose.ui.f.b bVar14 = androidx.compose.ui.d.a.f13344k;
            C0945e.j jVar14 = C0945e.f10284a;
            androidx.compose.foundation.layout.T tA15 = androidx.compose.foundation.layout.S.a(jVar14, bVar14, c1086gP, 48);
            i30 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P11112 = c1086gP.P();
            androidx.compose.ui.h hVarC111116 = ComposedModifierKt.c(c1086gP, hVarC111115);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(pVar11111, c1086gP, tA15);
            R0.a(pVar11112, c1086gP, interfaceC1089h0P11112);
            if (c1086gP.f12995O) {
                J4.i.d(i30, c1086gP, i30, pVar);
            } else {
                J4.i.d(i30, c1086gP, i30, pVar);
            }
            R0.a(pVar11113, c1086gP, hVarC111116);
            v10 = androidx.compose.foundation.layout.V.f10222a;
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f114));
            c1086gP.L(-1851695824);
            if (aVar3 != null) {
                j14 = j13;
            } else {
                j14 = j13;
            }
            c1086gP.T(false);
            if (aVar3 != null) {
                i31 = 8;
            } else {
                i31 = 16;
            }
            f10 = i31;
            Ia.a<p293xa.r> aVar1111112 = aVar3;
            if (list3.size() == 1) {
                c1086gP.L(-1567408864);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                c1086gP.T(false);
            } else if (list3.size() > 1) {
                c1086gP.L(-1567107141);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                c1086gP.T(false);
            } else {
                c1086gP.L(-1566896682);
                c1086gP.T(false);
            }
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
            androidx.compose.ui.h hVarB14 = v10.b(aVar4, true);
            Integer num1113 = numValueOf;
            C0953m c0953mA118 = C0952l.a(kVar14, aVar1111110, c1086gP, 48);
            i32 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P11113 = c1086gP.P();
            androidx.compose.ui.h hVarC111117 = ComposedModifierKt.c(c1086gP, hVarB14);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(pVar11111, c1086gP, c0953mA118);
            R0.a(pVar11112, c1086gP, interfaceC1089h0P11113);
            if (c1086gP.f12995O) {
                J4.i.d(i32, c1086gP, i32, pVar);
            } else {
                J4.i.d(i32, c1086gP, i32, pVar);
            }
            R0.a(pVar11113, c1086gP, hVarC111117);
            IntercomTheme intercomTheme14 = IntercomTheme.INSTANCE;
            int i419 = IntercomTheme.$stable;
            TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme14.getTypography(c1086gP, i419).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
            c1086gP.L(1212144132);
            if (str5 != null) {
                z16 = true;
            } else {
                z16 = true;
            }
            c1086gP.T(false);
            c1086gP.T(z16);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
            c1086gP.L(-1851611912);
            if (qVar2 == 0) {
                qVar3 = qVar2;
            } else {
                qVar3 = qVar2;
                qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                p293xa.r rVar119 = p293xa.r.f47939a;
            }
            c1086gP.T(false);
            c1086gP.T(true);
            c1086gP.L(369373838);
            if (!kotlin.text.n.S(str6)) {
                IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            j15 = j14;
            qVar4 = qVar3;
            j16 = jM642getOnHeader0d7_KjU2;
            num5 = num1112;
            str7 = str5;
            z17 = z13;
            list4 = list3;
            aVar3 = aVar1111112;
            hVar3 = hVar17;
            aVar6 = aVar1111111;
            j17 = j1111;
            numValueOf = num1113;
        } else {
            c1086gP.r0();
            if ((i10 & 1) != 0) {
                i27 = i22;
                if (i36 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i38 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i40 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i14 != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                if (i16 != 0) {
                    list2 = EmptyList.f42983b;
                } else {
                    list2 = list;
                }
                if (i17 != 0) {
                    aVar3 = null;
                }
                if ((i12 & 64) != 0) {
                    numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                    i21 &= -3670017;
                }
                if (i19 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((256 & i12) != 0) {
                    jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                    i21 &= -234881025;
                } else {
                    jM635getHeader0d7_KjU = j12;
                }
                if ((i12 & 512) != 0) {
                    jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                    i21 &= -1879048193;
                } else {
                    jM642getOnHeader0d7_KjU = j10;
                }
                if ((1024 & i12) != 0) {
                    jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                    i28 = i27 & (-15);
                } else {
                    jM642getOnHeader0d7_KjU2 = j11;
                    i28 = i27;
                }
                if (i23 != 0) {
                    eVar = new coil.e(1);
                } else {
                    eVar = aVar2;
                }
                if (i25 != 0) {
                    qVar2 = null;
                } else {
                    qVar2 = qVar;
                }
                z12 = z11;
                num4 = num3;
            } else {
                i27 = i22;
                if (i36 != 0) {
                    hVar2 = androidx.compose.ui.h.a.f13984b;
                }
                if (i38 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i40 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i14 != 0) {
                    num3 = null;
                } else {
                    num3 = num;
                }
                if (i16 != 0) {
                    list2 = EmptyList.f42983b;
                } else {
                    list2 = list;
                }
                if (i17 != 0) {
                    aVar3 = null;
                }
                if ((i12 & 64) != 0) {
                    numValueOf = Integer.valueOf(io.intercom.android.sdk.R.drawable.intercom_back);
                    i21 &= -3670017;
                }
                if (i19 != 0) {
                    z11 = false;
                } else {
                    z11 = z10;
                }
                if ((256 & i12) != 0) {
                    jM635getHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU();
                    i21 &= -234881025;
                } else {
                    jM635getHeader0d7_KjU = j12;
                }
                if ((i12 & 512) != 0) {
                    jM642getOnHeader0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                    i21 &= -1879048193;
                } else {
                    jM642getOnHeader0d7_KjU = j10;
                }
                if ((1024 & i12) != 0) {
                    jM642getOnHeader0d7_KjU2 = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU();
                    i28 = i27 & (-15);
                } else {
                    jM642getOnHeader0d7_KjU2 = j11;
                    i28 = i27;
                }
                if (i23 != 0) {
                    eVar = new coil.e(1);
                } else {
                    eVar = aVar2;
                }
                if (i25 != 0) {
                    qVar2 = null;
                } else {
                    qVar2 = qVar;
                }
                z12 = z11;
                num4 = num3;
            }
            c1086gP.U();
            activity = (Activity) c1086gP.x(LocalActivityKt.f8205a);
            if (activity != null) {
                window = activity.getWindow();
            } else {
                window = null;
            }
            c1086gP.L(-1152540944);
            if (window != null) {
                Ia.a<p293xa.r> aVar1111113 = new Ia.a() { // from class: io.intercom.android.sdk.m5.components.N0
                    @Override // Ia.a
                    public final Object invoke() {
                        return TopActionBarKt.TopActionBar_NpQZenA$lambda$2$lambda$1(window, jM642getOnHeader0d7_KjU);
                    }
                };
                androidx.compose.runtime.B b114 = androidx.compose.runtime.E.f12831a;
                c1086gP.l(aVar1111113);
                p293xa.r rVar1110 = p293xa.r.f47939a;
            }
            c1086gP.T(false);
            aVar4 = androidx.compose.ui.h.a.f13984b;
            Integer num1114 = num4;
            C0945e.k kVar15 = C0945e.f10286c;
            str5 = str4;
            androidx.compose.ui.f.a aVar1111114 = androidx.compose.ui.d.a.f13346m;
            str6 = str3;
            C0953m c0953mA119 = C0952l.a(kVar15, aVar1111114, c1086gP, 0);
            i29 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P11114 = c1086gP.P();
            androidx.compose.ui.h hVarC111118 = ComposedModifierKt.c(c1086gP, aVar4);
            ComposeUiNode.f14331c0.getClass();
            z13 = z12;
            aVar5 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            list3 = list2;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar11114 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar11114, c1086gP, c0953mA119);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar11115 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar11115, c1086gP, interfaceC1089h0P11114);
            pVar = ComposeUiNode.Companion.f14338g;
            j13 = jM642getOnHeader0d7_KjU;
            if (c1086gP.f12995O) {
                J4.i.d(i29, c1086gP, i29, pVar);
            } else {
                J4.i.d(i29, c1086gP, i29, pVar);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar11116 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar11116, c1086gP, hVarC111118);
            float f115 = 4;
            androidx.compose.ui.h hVarJ15 = PaddingKt.j(androidx.compose.foundation.layout.W.e(ComposedModifierKt.a(C0932d.b(androidx.compose.foundation.layout.W.d(hVar2, 1.0f), jM635getHeader0d7_KjU, androidx.compose.ui.graphics.h0.f13629a), InspectableValueKt.f14929a, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1()), 56), 0.0f, 0.0f, f115, 0.0f, 11);
            c1086gP.L(369283361);
            androidx.compose.ui.h hVar18 = hVar2;
            if ((i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objF = c1086gP.f();
            if (z14) {
                z15 = false;
                objF = new O0(0 == true ? 1 : 0, eVar);
                c1086gP.E(objF);
            } else {
                z15 = false;
                objF = new O0(0 == true ? 1 : 0, eVar);
                c1086gP.E(objF);
            }
            c1086gP.T(z15);
            Ia.a<p293xa.r> aVar1111115 = eVar;
            long j1112 = jM635getHeader0d7_KjU;
            androidx.compose.ui.h hVarC111119 = ClickableKt.c(hVarJ15, z15, null, (Ia.a) objF, 7);
            androidx.compose.ui.f.b bVar15 = androidx.compose.ui.d.a.f13344k;
            C0945e.j jVar15 = C0945e.f10284a;
            androidx.compose.foundation.layout.T tA16 = androidx.compose.foundation.layout.S.a(jVar15, bVar15, c1086gP, 48);
            i30 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P11115 = c1086gP.P();
            androidx.compose.ui.h hVarC1111110 = ComposedModifierKt.c(c1086gP, hVarC111119);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(pVar11114, c1086gP, tA16);
            R0.a(pVar11115, c1086gP, interfaceC1089h0P11115);
            if (c1086gP.f12995O) {
                J4.i.d(i30, c1086gP, i30, pVar);
            } else {
                J4.i.d(i30, c1086gP, i30, pVar);
            }
            R0.a(pVar11116, c1086gP, hVarC1111110);
            v10 = androidx.compose.foundation.layout.V.f10222a;
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f115));
            c1086gP.L(-1851695824);
            if (aVar3 != null) {
                j14 = j13;
            } else {
                j14 = j13;
            }
            c1086gP.T(false);
            if (aVar3 != null) {
                i31 = 8;
            } else {
                i31 = 16;
            }
            f10 = i31;
            Ia.a<p293xa.r> aVar1111116 = aVar3;
            if (list3.size() == 1) {
                c1086gP.L(-1567408864);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                AvatarIconKt.m131AvatarIconRd90Nhg(androidx.compose.foundation.layout.W.m(aVar4, 24), (AvatarWrapper) kotlin.collections.q.O(list3), null, z13, 0L, null, c1086gP, ((i21 >> 12) & 7168) | 70, 52);
                c1086gP.T(false);
            } else if (list3.size() > 1) {
                c1086gP.L(-1567107141);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, f10));
                AvatarGroupKt.m59AvatarGroupJ8mCjc(kotlin.collections.q.i0(list3, 3), null, 24, 0L, c1086gP, 392, 10);
                c1086gP.T(false);
            } else {
                c1086gP.L(-1566896682);
                c1086gP.T(false);
            }
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 8));
            androidx.compose.ui.h hVarB15 = v10.b(aVar4, true);
            Integer num1115 = numValueOf;
            C0953m c0953mA1110 = C0952l.a(kVar15, aVar1111114, c1086gP, 48);
            i32 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P11116 = c1086gP.P();
            androidx.compose.ui.h hVarC1111111 = ComposedModifierKt.c(c1086gP, hVarB15);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar5);
            } else {
                c1086gP.A();
            }
            R0.a(pVar11114, c1086gP, c0953mA1110);
            R0.a(pVar11115, c1086gP, interfaceC1089h0P11116);
            if (c1086gP.f12995O) {
                J4.i.d(i32, c1086gP, i32, pVar);
            } else {
                J4.i.d(i32, c1086gP, i32, pVar);
            }
            R0.a(pVar11116, c1086gP, hVarC1111111);
            IntercomTheme intercomTheme15 = IntercomTheme.INSTANCE;
            int i4110 = IntercomTheme.$stable;
            TextKt.b(str6, null, j14, 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(5), 0L, 2, false, 1, 0, null, androidx.compose.ui.text.F.a(intercomTheme15.getTypography(c1086gP, i4110).getType03(), j14, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, ((i21 >> 3) & 14) | ((i21 >> 21) & 896), 3120, 54778);
            c1086gP.L(1212144132);
            if (str5 != null) {
                z16 = true;
            } else {
                z16 = true;
            }
            c1086gP.T(false);
            c1086gP.T(z16);
            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.q(aVar4, 16));
            c1086gP.L(-1851611912);
            if (qVar2 == 0) {
                qVar3 = qVar2;
            } else {
                qVar3 = qVar2;
                qVar3.invoke(v10, c1086gP, Integer.valueOf(((i28 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 6));
                p293xa.r rVar1111 = p293xa.r.f47939a;
            }
            c1086gP.T(false);
            c1086gP.T(true);
            c1086gP.L(369373838);
            if (!kotlin.text.n.S(str6)) {
                IntercomDividerKt.IntercomDivider(null, c1086gP, 0, 1);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            j15 = j14;
            qVar4 = qVar3;
            j16 = jM642getOnHeader0d7_KjU2;
            num5 = num1114;
            str7 = str5;
            z17 = z13;
            list4 = list3;
            aVar3 = aVar1111116;
            hVar3 = hVar18;
            aVar6 = aVar1111115;
            j17 = j1112;
            numValueOf = num1115;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final String str15 = str6;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.P0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TopActionBarKt.TopActionBar_NpQZenA$lambda$10(hVar3, str15, str7, num5, list4, aVar3, numValueOf, z17, j17, j15, j16, aVar6, qVar4, i10, i11, i12, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    @IntercomPreviews
    public static final void TopActionBarAvatarPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-876643721);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m119getLambda1$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new U(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TopActionBarAvatarPreview$lambda$11(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TopActionBarAvatarPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TopActionBarBackButtonPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1611748073);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m123getLambda5$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2282h(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TopActionBarBackButtonPreview$lambda$15(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TopActionBarBackButtonPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TopActionBarEndContentPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1992822204);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m127getLambda9$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new L(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TopActionBarEndContentPreview$lambda$17(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TopActionBarEndContentPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TopActionBarGroupChatPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(86306281);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m120getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new T(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TopActionBarGroupChatPreview$lambda$12(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TopActionBarGroupChatPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TopActionBarMultipleAvatarsPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1436789380);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m122getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2278f(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TopActionBarMultipleAvatarsPreview$lambda$14(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TopActionBarMultipleAvatarsPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TopActionBarTeamReplyTimePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(500144364);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m121getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new io.intercom.android.sdk.helpcenter.articles.u(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TopActionBarTeamReplyTimePreview$lambda$13(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TopActionBarTeamReplyTimePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TopActionBarTitlePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1648201034);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TopActionBarKt.INSTANCE.m124getLambda6$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2280g(i10, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TopActionBarTitlePreview$lambda$16(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TopActionBarTitlePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TopActionBar_NpQZenA$lambda$10(androidx.compose.ui.h hVar, String str, String str2, Integer num, List list, Ia.a aVar, Integer num2, boolean z10, long j, long j10, long j11, Ia.a aVar2, Ia.q qVar, int i10, int i11, int i12, InterfaceC1084f interfaceC1084f, int i13) {
        m130TopActionBarNpQZenA(hVar, str, str2, num, list, aVar, num2, z10, j, j10, j11, aVar2, qVar, interfaceC1084f, L4.b.l(i10 | 1), L4.b.l(i11), i12);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TopActionBar_NpQZenA$lambda$2$lambda$1(Window it, long j) {
        androidx.core.view.v0.e cVar;
        kotlin.jvm.internal.i.e(it, "$it");
        androidx.core.view.D d10 = new androidx.core.view.D(it.getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.v0.d dVar = new androidx.core.view.v0.d(it.getInsetsController(), d10);
            dVar.f16996b = it;
            cVar = dVar;
        } else {
            cVar = new androidx.core.view.v0.c(it, d10);
        }
        cVar.c(ColorExtensionsKt.m664isDarkColor8_81llA(j));
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TopActionBar_NpQZenA$lambda$9$lambda$4$lambda$3(Ia.a aVar) {
        aVar.invoke();
        return p293xa.r.f47939a;
    }
}
