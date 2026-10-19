package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.home.states.HomeItemBadge;
import io.intercom.android.sdk.m5.shapes.CutIconWithIndicatorShape;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: HomeItem.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeItemKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0140  */
    /* JADX WARN: Code duplicated, block: B:104:0x0158  */
    /* JADX WARN: Code duplicated, block: B:106:0x015c  */
    /* JADX WARN: Code duplicated, block: B:107:0x015e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0161  */
    /* JADX WARN: Code duplicated, block: B:111:0x0164  */
    /* JADX WARN: Code duplicated, block: B:112:0x016b  */
    /* JADX WARN: Code duplicated, block: B:114:0x016e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0177  */
    /* JADX WARN: Code duplicated, block: B:117:0x017b  */
    /* JADX WARN: Code duplicated, block: B:119:0x017e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0181  */
    /* JADX WARN: Code duplicated, block: B:123:0x0184  */
    /* JADX WARN: Code duplicated, block: B:124:0x0187  */
    /* JADX WARN: Code duplicated, block: B:126:0x018b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0191  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:141:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:145:0x0212  */
    /* JADX WARN: Code duplicated, block: B:148:0x0223  */
    /* JADX WARN: Code duplicated, block: B:153:0x0237  */
    /* JADX WARN: Code duplicated, block: B:156:0x026b  */
    /* JADX WARN: Code duplicated, block: B:157:0x026f  */
    /* JADX WARN: Code duplicated, block: B:160:0x027c  */
    /* JADX WARN: Code duplicated, block: B:162:0x028a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0298  */
    /* JADX WARN: Code duplicated, block: B:168:0x02a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:176:0x0344  */
    /* JADX WARN: Code duplicated, block: B:178:0x036a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0370  */
    /* JADX WARN: Code duplicated, block: B:182:0x037d  */
    /* JADX WARN: Code duplicated, block: B:184:0x038b  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:190:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:192:0x0407  */
    /* JADX WARN: Code duplicated, block: B:194:0x040f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0419  */
    /* JADX WARN: Code duplicated, block: B:197:0x0437  */
    /* JADX WARN: Code duplicated, block: B:198:0x043b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0448  */
    /* JADX WARN: Code duplicated, block: B:203:0x0456  */
    /* JADX WARN: Code duplicated, block: B:206:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:208:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:212:0x055e  */
    /* JADX WARN: Code duplicated, block: B:214:0x056c  */
    /* JADX WARN: Code duplicated, block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00af  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0106  */
    /* JADX WARN: Code duplicated, block: B:84:0x010c  */
    /* JADX WARN: Code duplicated, block: B:85:0x010f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0119  */
    /* JADX WARN: Code duplicated, block: B:91:0x0122  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x012e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0131  */
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
    public static final void HomeItem(androidx.compose.ui.h hVar, Integer num, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, androidx.compose.ui.h hVar2, Integer num2, String str, String str2, HomeItemBadge homeItemBadge, Ia.a<p293xa.r> aVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        androidx.compose.ui.h hVar3;
        int i12;
        Integer num3;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2;
        int i13;
        int i14;
        int i15;
        Integer num4;
        int i16;
        int i17;
        String str3;
        int i18;
        int i19;
        String str4;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        androidx.compose.ui.h.a aVar2;
        androidx.compose.ui.h hVar4;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVarM92getLambda1$intercom_sdk_base_release;
        androidx.compose.ui.h hVarM;
        HomeItemBadge homeItemBadge2;
        Ia.a<p293xa.r> c2299p0;
        boolean z10;
        Object objF;
        boolean z11;
        androidx.compose.ui.h hVar5;
        androidx.compose.ui.f.b bVar;
        int i26;
        Ia.a<ComposeUiNode> aVar3;
        Ia.p<ComposeUiNode, androidx.compose.ui.layout.E, p293xa.r> pVar3;
        Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar4;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar5;
        androidx.compose.ui.h hVar6;
        Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar6;
        Integer num5;
        int i27;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar7;
        String str5;
        String strP;
        IntercomTheme intercomTheme;
        int i28;
        Integer num6;
        boolean z12;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar8;
        int i29;
        boolean z13;
        Ia.a<p293xa.r> aVar4;
        final Integer num7;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar9;
        final androidx.compose.ui.h hVar7;
        final String str6;
        final Integer num8;
        final String str7;
        final HomeItemBadge homeItemBadge3;
        final androidx.compose.ui.h hVar8;
        int i30;
        C1105p0 c1105p0V;
        C1086g c1086gP = interfaceC1084f.p(-360748364);
        int i31 = i11 & 1;
        if (i31 != 0) {
            i12 = i10 | 6;
            hVar3 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar3 = hVar;
            i12 = i10 | (c1086gP.K(hVar3) ? 4 : 2);
        } else {
            hVar3 = hVar;
            i12 = i10;
        }
        int i32 = 2 & i11;
        if (i32 != 0) {
            i12 |= 48;
            num3 = num;
        } else {
            num3 = num;
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i12 |= c1086gP.K(num3) ? 32 : 16;
            }
        }
        int i33 = i12;
        int i34 = i11 & 4;
        if (i34 == 0) {
            if ((i10 & 896) == 0) {
                pVar2 = pVar;
                i33 |= c1086gP.k(pVar2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    if (c1086gP.K(hVar2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i33 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    i33 |= 24576;
                    num4 = num2;
                } else {
                    num4 = num2;
                    if ((i10 & 57344) == 0) {
                        if (c1086gP.K(num4)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i33 |= i16;
                    }
                }
                i17 = 32 & i11;
                if (i17 != 0) {
                    i33 |= 196608;
                    str3 = str;
                } else {
                    str3 = str;
                    if ((i10 & 458752) == 0) {
                        if (c1086gP.K(str3)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i33 |= i18;
                    }
                }
                i19 = i11 & 64;
                if (i19 != 0) {
                    i33 |= 1572864;
                    str4 = str2;
                } else {
                    str4 = str2;
                    if ((i10 & 3670016) == 0) {
                        if (c1086gP.K(str4)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i33 |= i20;
                    }
                }
                i21 = 128 & i11;
                if (i21 != 0) {
                    i33 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (c1086gP.K(homeItemBadge)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i33 |= i22;
                }
                i23 = 256 & i11;
                if (i23 != 0) {
                    i33 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (c1086gP.k(aVar)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i33 |= i24;
                }
                i25 = i33;
                if ((i25 & 191739611) == 38347922 || !c1086gP.s()) {
                    aVar2 = androidx.compose.ui.h.a.f13984b;
                    if (i31 != 0) {
                        hVar4 = aVar2;
                    } else {
                        hVar4 = hVar3;
                    }
                    if (i32 != 0) {
                        num3 = null;
                    }
                    if (i34 != 0) {
                        pVarM92getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m92getLambda1$intercom_sdk_base_release();
                    } else {
                        pVarM92getLambda1$intercom_sdk_base_release = pVar2;
                    }
                    if (i13 != 0) {
                        hVarM = androidx.compose.foundation.layout.W.m(aVar2, 16);
                    } else {
                        hVarM = hVar2;
                    }
                    if (i15 != 0) {
                        num4 = null;
                    }
                    if (i17 != 0) {
                        str3 = null;
                    }
                    if (i19 != 0) {
                        str4 = null;
                    }
                    if (i21 != 0) {
                        homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                    } else {
                        homeItemBadge2 = homeItemBadge;
                    }
                    if (i23 != 0) {
                        c2299p0 = new C2299p0();
                    } else {
                        c2299p0 = aVar;
                    }
                    androidx.compose.ui.h hVarD = androidx.compose.foundation.layout.W.d(hVar4, 1.0f);
                    c1086gP.L(-244013531);
                    if ((i25 & 234881024) == 67108864) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objF = c1086gP.f();
                    if (!z10 || objF == InterfaceC1084f.a.f12980a) {
                        z11 = false;
                        objF = new q0(0 == true ? 1 : 0, c2299p0);
                        c1086gP.E(objF);
                    } else {
                        z11 = false;
                    }
                    c1086gP.T(z11);
                    hVar5 = hVarM;
                    Ia.a<p293xa.r> aVar5 = c2299p0;
                    androidx.compose.ui.h hVarG = PaddingKt.g(16, 12, ClickableKt.c(hVarD, z11, null, (Ia.a) objF, 7));
                    bVar = androidx.compose.ui.d.a.f13344k;
                    androidx.compose.foundation.layout.T tA = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, c1086gP, 48);
                    i26 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarG);
                    ComposeUiNode.f14331c0.getClass();
                    aVar3 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    pVar3 = ComposeUiNode.Companion.f14337f;
                    R0.a(pVar3, c1086gP, tA);
                    pVar4 = ComposeUiNode.Companion.f14336e;
                    R0.a(pVar4, c1086gP, interfaceC1089h0P);
                    pVar5 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        hVar6 = hVar4;
                    } else {
                        hVar6 = hVar4;
                        if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i26))) {
                        }
                        pVar6 = ComposeUiNode.Companion.f14335d;
                        R0.a(pVar6, c1086gP, hVarC);
                        if (2.0f <= 0.0d) {
                            p258v.a.a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
                        num5 = num3;
                        C0953m c0953mA = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
                        i27 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, layoutWeightElement);
                        c1086gP.r();
                        pVar7 = pVarM92getLambda1$intercom_sdk_base_release;
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar3, c1086gP, c0953mA);
                        R0.a(pVar4, c1086gP, interfaceC1089h0P2);
                        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i27))) {
                            J4.i.d(i27, c1086gP, i27, pVar5);
                        }
                        R0.a(pVar6, c1086gP, hVarC2);
                        c1086gP.L(-1379228937);
                        if (num4 != null) {
                            strP = S4.o.p(c1086gP, num4.intValue());
                        } else {
                            if (str3 == null) {
                                strP = "";
                            } else {
                                str5 = str3;
                            }
                            c1086gP.T(false);
                            intercomTheme = IntercomTheme.INSTANCE;
                            i28 = IntercomTheme.$stable;
                            androidx.compose.ui.h hVar9 = hVar6;
                            TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                            c1086gP.L(-1379221164);
                            if (str4 != null) {
                                TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                            }
                            c1086gP.T(false);
                            c1086gP.T(true);
                            if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                                c1086gP.L(941879891);
                                androidx.compose.foundation.layout.T tA2 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                                i30 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, aVar2);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar3);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar3, c1086gP, tA2);
                                R0.a(pVar4, c1086gP, interfaceC1089h0P3);
                                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i30))) {
                                    J4.i.d(i30, c1086gP, i30, pVar5);
                                }
                                R0.a(pVar6, c1086gP, hVarC3);
                                pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                                c1086gP.L(-1379205196);
                                if (num5 != null) {
                                    IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                    p293xa.r rVar = p293xa.r.f47939a;
                                }
                                c1086gP.T(false);
                                c1086gP.T(true);
                                c1086gP.T(false);
                                p293xa.r rVar2 = p293xa.r.f47939a;
                                num6 = num4;
                                str4 = str4;
                                str3 = str3;
                                pVar8 = pVar7;
                                z12 = true;
                            } else {
                                num6 = num4;
                                if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                    c1086gP.L(942534549);
                                    if (num5 == null) {
                                        z12 = true;
                                        z13 = false;
                                    } else {
                                        androidx.compose.ui.layout.E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                        i29 = c1086gP.f12996P;
                                        InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                                        androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, aVar2);
                                        c1086gP.r();
                                        if (c1086gP.f12995O) {
                                            c1086gP.v(aVar3);
                                        } else {
                                            c1086gP.A();
                                        }
                                        R0.a(pVar3, c1086gP, eD);
                                        R0.a(pVar4, c1086gP, interfaceC1089h0P4);
                                        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i29))) {
                                            J4.i.d(i29, c1086gP, i29, pVar5);
                                        }
                                        R0.a(pVar6, c1086gP, hVarC4);
                                        C0949i c0949i = C0949i.f10304a;
                                        IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                        androidx.compose.ui.h hVarF = c0949i.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                        z13 = false;
                                        BoxKt.a(hVarF, c1086gP, 0);
                                        z12 = true;
                                        c1086gP.T(true);
                                        p293xa.r rVar3 = p293xa.r.f47939a;
                                    }
                                    c1086gP.T(z13);
                                    pVar8 = pVar7;
                                } else {
                                    str4 = str4;
                                    str3 = str3;
                                    z12 = true;
                                    if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                        c1086gP.L(861667097);
                                        c1086gP.T(false);
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    c1086gP.L(943331838);
                                    pVar8 = pVar7;
                                    TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                                    c1086gP.T(false);
                                    p293xa.r rVar4 = p293xa.r.f47939a;
                                }
                            }
                            c1086gP.T(z12);
                            aVar4 = aVar5;
                            num7 = num6;
                            pVar9 = pVar8;
                            hVar7 = hVar5;
                            str6 = str4;
                            num8 = num5;
                            str7 = str3;
                            homeItemBadge3 = homeItemBadge2;
                            hVar8 = hVar9;
                        }
                        str5 = strP;
                        c1086gP.T(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i28 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVar10 = hVar6;
                        TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                        c1086gP.L(-1379221164);
                        if (str4 != null) {
                            TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                            c1086gP.L(941879891);
                            androidx.compose.foundation.layout.T tA3 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                            i30 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                            androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, aVar2);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar3, c1086gP, tA3);
                            R0.a(pVar4, c1086gP, interfaceC1089h0P5);
                            if (c1086gP.f12995O) {
                                J4.i.d(i30, c1086gP, i30, pVar5);
                            } else {
                                J4.i.d(i30, c1086gP, i30, pVar5);
                            }
                            R0.a(pVar6, c1086gP, hVarC5);
                            pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                            c1086gP.L(-1379205196);
                            if (num5 != null) {
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                p293xa.r rVar5 = p293xa.r.f47939a;
                            }
                            c1086gP.T(false);
                            c1086gP.T(true);
                            c1086gP.T(false);
                            p293xa.r rVar6 = p293xa.r.f47939a;
                            num6 = num4;
                            str4 = str4;
                            str3 = str3;
                            pVar8 = pVar7;
                            z12 = true;
                        } else {
                            num6 = num4;
                            if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                c1086gP.L(942534549);
                                if (num5 == null) {
                                    z12 = true;
                                    z13 = false;
                                } else {
                                    androidx.compose.ui.layout.E eD2 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    i29 = c1086gP.f12996P;
                                    InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                                    androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, aVar2);
                                    c1086gP.r();
                                    if (c1086gP.f12995O) {
                                        c1086gP.v(aVar3);
                                    } else {
                                        c1086gP.A();
                                    }
                                    R0.a(pVar3, c1086gP, eD2);
                                    R0.a(pVar4, c1086gP, interfaceC1089h0P6);
                                    if (c1086gP.f12995O) {
                                        J4.i.d(i29, c1086gP, i29, pVar5);
                                    } else {
                                        J4.i.d(i29, c1086gP, i29, pVar5);
                                    }
                                    R0.a(pVar6, c1086gP, hVarC6);
                                    C0949i c0949i2 = C0949i.f10304a;
                                    IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                    androidx.compose.ui.h hVarF2 = c0949i2.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                    z13 = false;
                                    BoxKt.a(hVarF2, c1086gP, 0);
                                    z12 = true;
                                    c1086gP.T(true);
                                    p293xa.r rVar7 = p293xa.r.f47939a;
                                }
                                c1086gP.T(z13);
                                pVar8 = pVar7;
                            } else {
                                str4 = str4;
                                str3 = str3;
                                z12 = true;
                                if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                    c1086gP.L(861667097);
                                    c1086gP.T(false);
                                    throw new NoWhenBranchMatchedException();
                                }
                                c1086gP.L(943331838);
                                pVar8 = pVar7;
                                TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                                c1086gP.T(false);
                                p293xa.r rVar8 = p293xa.r.f47939a;
                            }
                        }
                        c1086gP.T(z12);
                        aVar4 = aVar5;
                        num7 = num6;
                        pVar9 = pVar8;
                        hVar7 = hVar5;
                        str6 = str4;
                        num8 = num5;
                        str7 = str3;
                        homeItemBadge3 = homeItemBadge2;
                        hVar8 = hVar10;
                    }
                    J4.i.d(i26, c1086gP, i26, pVar5);
                    pVar6 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar6, c1086gP, hVarC);
                    if (2.0f <= 0.0d) {
                        p258v.a.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
                    num5 = num3;
                    C0953m c0953mA2 = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                    androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, layoutWeightElement2);
                    c1086gP.r();
                    pVar7 = pVarM92getLambda1$intercom_sdk_base_release;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar3, c1086gP, c0953mA2);
                    R0.a(pVar4, c1086gP, interfaceC1089h0P7);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar5);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar5);
                    }
                    R0.a(pVar6, c1086gP, hVarC7);
                    c1086gP.L(-1379228937);
                    if (num4 != null) {
                        strP = S4.o.p(c1086gP, num4.intValue());
                    } else {
                        if (str3 == null) {
                            strP = "";
                        } else {
                            str5 = str3;
                        }
                        c1086gP.T(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i28 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVar11 = hVar6;
                        TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                        c1086gP.L(-1379221164);
                        if (str4 != null) {
                            TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                            c1086gP.L(941879891);
                            androidx.compose.foundation.layout.T tA4 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                            i30 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                            androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, aVar2);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar3, c1086gP, tA4);
                            R0.a(pVar4, c1086gP, interfaceC1089h0P8);
                            if (c1086gP.f12995O) {
                                J4.i.d(i30, c1086gP, i30, pVar5);
                            } else {
                                J4.i.d(i30, c1086gP, i30, pVar5);
                            }
                            R0.a(pVar6, c1086gP, hVarC8);
                            pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                            c1086gP.L(-1379205196);
                            if (num5 != null) {
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                p293xa.r rVar9 = p293xa.r.f47939a;
                            }
                            c1086gP.T(false);
                            c1086gP.T(true);
                            c1086gP.T(false);
                            p293xa.r rVar10 = p293xa.r.f47939a;
                            num6 = num4;
                            str4 = str4;
                            str3 = str3;
                            pVar8 = pVar7;
                            z12 = true;
                        } else {
                            num6 = num4;
                            if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                c1086gP.L(942534549);
                                if (num5 == null) {
                                    z12 = true;
                                    z13 = false;
                                } else {
                                    androidx.compose.ui.layout.E eD3 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    i29 = c1086gP.f12996P;
                                    InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                                    androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, aVar2);
                                    c1086gP.r();
                                    if (c1086gP.f12995O) {
                                        c1086gP.v(aVar3);
                                    } else {
                                        c1086gP.A();
                                    }
                                    R0.a(pVar3, c1086gP, eD3);
                                    R0.a(pVar4, c1086gP, interfaceC1089h0P9);
                                    if (c1086gP.f12995O) {
                                        J4.i.d(i29, c1086gP, i29, pVar5);
                                    } else {
                                        J4.i.d(i29, c1086gP, i29, pVar5);
                                    }
                                    R0.a(pVar6, c1086gP, hVarC9);
                                    C0949i c0949i3 = C0949i.f10304a;
                                    IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                    androidx.compose.ui.h hVarF3 = c0949i3.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                    z13 = false;
                                    BoxKt.a(hVarF3, c1086gP, 0);
                                    z12 = true;
                                    c1086gP.T(true);
                                    p293xa.r rVar11 = p293xa.r.f47939a;
                                }
                                c1086gP.T(z13);
                                pVar8 = pVar7;
                            } else {
                                str4 = str4;
                                str3 = str3;
                                z12 = true;
                                if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                    c1086gP.L(861667097);
                                    c1086gP.T(false);
                                    throw new NoWhenBranchMatchedException();
                                }
                                c1086gP.L(943331838);
                                pVar8 = pVar7;
                                TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                                c1086gP.T(false);
                                p293xa.r rVar12 = p293xa.r.f47939a;
                            }
                        }
                        c1086gP.T(z12);
                        aVar4 = aVar5;
                        num7 = num6;
                        pVar9 = pVar8;
                        hVar7 = hVar5;
                        str6 = str4;
                        num8 = num5;
                        str7 = str3;
                        homeItemBadge3 = homeItemBadge2;
                        hVar8 = hVar11;
                    }
                    str5 = strP;
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i28 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVar12 = hVar6;
                    TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                    c1086gP.L(-1379221164);
                    if (str4 != null) {
                        TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                        c1086gP.L(941879891);
                        androidx.compose.foundation.layout.T tA5 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                        i30 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                        androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, aVar2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar3, c1086gP, tA5);
                        R0.a(pVar4, c1086gP, interfaceC1089h0P10);
                        if (c1086gP.f12995O) {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        } else {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        }
                        R0.a(pVar6, c1086gP, hVarC10);
                        pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                        c1086gP.L(-1379205196);
                        if (num5 != null) {
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            p293xa.r rVar13 = p293xa.r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        c1086gP.T(false);
                        p293xa.r rVar14 = p293xa.r.f47939a;
                        num6 = num4;
                        str4 = str4;
                        str3 = str3;
                        pVar8 = pVar7;
                        z12 = true;
                    } else {
                        num6 = num4;
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            c1086gP.L(942534549);
                            if (num5 == null) {
                                z12 = true;
                                z13 = false;
                            } else {
                                androidx.compose.ui.layout.E eD4 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                i29 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                                androidx.compose.ui.h hVarC11 = ComposedModifierKt.c(c1086gP, aVar2);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar3);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar3, c1086gP, eD4);
                                R0.a(pVar4, c1086gP, interfaceC1089h0P11);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                } else {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                }
                                R0.a(pVar6, c1086gP, hVarC11);
                                C0949i c0949i4 = C0949i.f10304a;
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                androidx.compose.ui.h hVarF4 = c0949i4.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                z13 = false;
                                BoxKt.a(hVarF4, c1086gP, 0);
                                z12 = true;
                                c1086gP.T(true);
                                p293xa.r rVar15 = p293xa.r.f47939a;
                            }
                            c1086gP.T(z13);
                            pVar8 = pVar7;
                        } else {
                            str4 = str4;
                            str3 = str3;
                            z12 = true;
                            if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                c1086gP.L(861667097);
                                c1086gP.T(false);
                                throw new NoWhenBranchMatchedException();
                            }
                            c1086gP.L(943331838);
                            pVar8 = pVar7;
                            TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                            c1086gP.T(false);
                            p293xa.r rVar16 = p293xa.r.f47939a;
                        }
                    }
                    c1086gP.T(z12);
                    aVar4 = aVar5;
                    num7 = num6;
                    pVar9 = pVar8;
                    hVar7 = hVar5;
                    str6 = str4;
                    num8 = num5;
                    str7 = str3;
                    homeItemBadge3 = homeItemBadge2;
                    hVar8 = hVar12;
                } else {
                    c1086gP.w();
                    aVar4 = aVar;
                    str7 = str3;
                    num8 = num3;
                    pVar9 = pVar2;
                    hVar8 = hVar3;
                    homeItemBadge3 = homeItemBadge;
                    str6 = str4;
                    num7 = num4;
                    hVar7 = hVar2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    final Ia.a<p293xa.r> aVar6 = aVar4;
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.s0
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return HomeItemKt.HomeItem$lambda$10(hVar8, num8, pVar9, hVar7, num7, str7, str6, homeItemBadge3, aVar6, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i33 |= 3072;
            i15 = i11 & 16;
            if (i15 != 0) {
                i33 |= 24576;
                num4 = num2;
            } else {
                num4 = num2;
                if ((i10 & 57344) == 0) {
                    if (c1086gP.K(num4)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i33 |= i16;
                }
            }
            i17 = 32 & i11;
            if (i17 != 0) {
                i33 |= 196608;
                str3 = str;
            } else {
                str3 = str;
                if ((i10 & 458752) == 0) {
                    if (c1086gP.K(str3)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i33 |= i18;
                }
            }
            i19 = i11 & 64;
            if (i19 != 0) {
                i33 |= 1572864;
                str4 = str2;
            } else {
                str4 = str2;
                if ((i10 & 3670016) == 0) {
                    if (c1086gP.K(str4)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i33 |= i20;
                }
            }
            i21 = 128 & i11;
            if (i21 != 0) {
                i33 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (c1086gP.K(homeItemBadge)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i33 |= i22;
            }
            i23 = 256 & i11;
            if (i23 != 0) {
                i33 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (c1086gP.k(aVar)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i33 |= i24;
            }
            i25 = i33;
            if ((i25 & 191739611) == 38347922) {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i31 != 0) {
                    hVar4 = aVar2;
                } else {
                    hVar4 = hVar3;
                }
                if (i32 != 0) {
                    num3 = null;
                }
                if (i34 != 0) {
                    pVarM92getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m92getLambda1$intercom_sdk_base_release();
                } else {
                    pVarM92getLambda1$intercom_sdk_base_release = pVar2;
                }
                if (i13 != 0) {
                    hVarM = androidx.compose.foundation.layout.W.m(aVar2, 16);
                } else {
                    hVarM = hVar2;
                }
                if (i15 != 0) {
                    num4 = null;
                }
                if (i17 != 0) {
                    str3 = null;
                }
                if (i19 != 0) {
                    str4 = null;
                }
                if (i21 != 0) {
                    homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                } else {
                    homeItemBadge2 = homeItemBadge;
                }
                if (i23 != 0) {
                    c2299p0 = new C2299p0();
                } else {
                    c2299p0 = aVar;
                }
                androidx.compose.ui.h hVarD2 = androidx.compose.foundation.layout.W.d(hVar4, 1.0f);
                c1086gP.L(-244013531);
                if ((i25 & 234881024) == 67108864) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    z11 = false;
                    objF = new q0(0 == true ? 1 : 0, c2299p0);
                    c1086gP.E(objF);
                } else {
                    z11 = false;
                    objF = new q0(0 == true ? 1 : 0, c2299p0);
                    c1086gP.E(objF);
                }
                c1086gP.T(z11);
                hVar5 = hVarM;
                Ia.a<p293xa.r> aVar7 = c2299p0;
                androidx.compose.ui.h hVarG2 = PaddingKt.g(16, 12, ClickableKt.c(hVarD2, z11, null, (Ia.a) objF, 7));
                bVar = androidx.compose.ui.d.a.f13344k;
                androidx.compose.foundation.layout.T tA6 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, c1086gP, 48);
                i26 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, hVarG2);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                pVar3 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar3, c1086gP, tA6);
                pVar4 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar4, c1086gP, interfaceC1089h0P12);
                pVar5 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    hVar6 = hVar4;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i26))) {
                    }
                    pVar6 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar6, c1086gP, hVarC12);
                    if (2.0f <= 0.0d) {
                        p258v.a.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
                    num5 = num3;
                    C0953m c0953mA3 = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
                    androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086gP, layoutWeightElement3);
                    c1086gP.r();
                    pVar7 = pVarM92getLambda1$intercom_sdk_base_release;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar3, c1086gP, c0953mA3);
                    R0.a(pVar4, c1086gP, interfaceC1089h0P13);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar5);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar5);
                    }
                    R0.a(pVar6, c1086gP, hVarC13);
                    c1086gP.L(-1379228937);
                    if (num4 != null) {
                        strP = S4.o.p(c1086gP, num4.intValue());
                    } else {
                        if (str3 == null) {
                            strP = "";
                        } else {
                            str5 = str3;
                        }
                        c1086gP.T(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i28 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVar13 = hVar6;
                        TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                        c1086gP.L(-1379221164);
                        if (str4 != null) {
                            TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                            c1086gP.L(941879891);
                            androidx.compose.foundation.layout.T tA7 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                            i30 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
                            androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, aVar2);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar3, c1086gP, tA7);
                            R0.a(pVar4, c1086gP, interfaceC1089h0P14);
                            if (c1086gP.f12995O) {
                                J4.i.d(i30, c1086gP, i30, pVar5);
                            } else {
                                J4.i.d(i30, c1086gP, i30, pVar5);
                            }
                            R0.a(pVar6, c1086gP, hVarC14);
                            pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                            c1086gP.L(-1379205196);
                            if (num5 != null) {
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                p293xa.r rVar17 = p293xa.r.f47939a;
                            }
                            c1086gP.T(false);
                            c1086gP.T(true);
                            c1086gP.T(false);
                            p293xa.r rVar18 = p293xa.r.f47939a;
                            num6 = num4;
                            str4 = str4;
                            str3 = str3;
                            pVar8 = pVar7;
                            z12 = true;
                        } else {
                            num6 = num4;
                            if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                c1086gP.L(942534549);
                                if (num5 == null) {
                                    z12 = true;
                                    z13 = false;
                                } else {
                                    androidx.compose.ui.layout.E eD5 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    i29 = c1086gP.f12996P;
                                    InterfaceC1089h0 interfaceC1089h0P15 = c1086gP.P();
                                    androidx.compose.ui.h hVarC15 = ComposedModifierKt.c(c1086gP, aVar2);
                                    c1086gP.r();
                                    if (c1086gP.f12995O) {
                                        c1086gP.v(aVar3);
                                    } else {
                                        c1086gP.A();
                                    }
                                    R0.a(pVar3, c1086gP, eD5);
                                    R0.a(pVar4, c1086gP, interfaceC1089h0P15);
                                    if (c1086gP.f12995O) {
                                        J4.i.d(i29, c1086gP, i29, pVar5);
                                    } else {
                                        J4.i.d(i29, c1086gP, i29, pVar5);
                                    }
                                    R0.a(pVar6, c1086gP, hVarC15);
                                    C0949i c0949i5 = C0949i.f10304a;
                                    IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                    androidx.compose.ui.h hVarF5 = c0949i5.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                    z13 = false;
                                    BoxKt.a(hVarF5, c1086gP, 0);
                                    z12 = true;
                                    c1086gP.T(true);
                                    p293xa.r rVar19 = p293xa.r.f47939a;
                                }
                                c1086gP.T(z13);
                                pVar8 = pVar7;
                            } else {
                                str4 = str4;
                                str3 = str3;
                                z12 = true;
                                if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                    c1086gP.L(861667097);
                                    c1086gP.T(false);
                                    throw new NoWhenBranchMatchedException();
                                }
                                c1086gP.L(943331838);
                                pVar8 = pVar7;
                                TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                                c1086gP.T(false);
                                p293xa.r rVar110 = p293xa.r.f47939a;
                            }
                        }
                        c1086gP.T(z12);
                        aVar4 = aVar7;
                        num7 = num6;
                        pVar9 = pVar8;
                        hVar7 = hVar5;
                        str6 = str4;
                        num8 = num5;
                        str7 = str3;
                        homeItemBadge3 = homeItemBadge2;
                        hVar8 = hVar13;
                    }
                    str5 = strP;
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i28 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVar14 = hVar6;
                    TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                    c1086gP.L(-1379221164);
                    if (str4 != null) {
                        TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                        c1086gP.L(941879891);
                        androidx.compose.foundation.layout.T tA8 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                        i30 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P16 = c1086gP.P();
                        androidx.compose.ui.h hVarC16 = ComposedModifierKt.c(c1086gP, aVar2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar3, c1086gP, tA8);
                        R0.a(pVar4, c1086gP, interfaceC1089h0P16);
                        if (c1086gP.f12995O) {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        } else {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        }
                        R0.a(pVar6, c1086gP, hVarC16);
                        pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                        c1086gP.L(-1379205196);
                        if (num5 != null) {
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            p293xa.r rVar111 = p293xa.r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        c1086gP.T(false);
                        p293xa.r rVar112 = p293xa.r.f47939a;
                        num6 = num4;
                        str4 = str4;
                        str3 = str3;
                        pVar8 = pVar7;
                        z12 = true;
                    } else {
                        num6 = num4;
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            c1086gP.L(942534549);
                            if (num5 == null) {
                                z12 = true;
                                z13 = false;
                            } else {
                                androidx.compose.ui.layout.E eD6 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                i29 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P17 = c1086gP.P();
                                androidx.compose.ui.h hVarC17 = ComposedModifierKt.c(c1086gP, aVar2);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar3);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar3, c1086gP, eD6);
                                R0.a(pVar4, c1086gP, interfaceC1089h0P17);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                } else {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                }
                                R0.a(pVar6, c1086gP, hVarC17);
                                C0949i c0949i6 = C0949i.f10304a;
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                androidx.compose.ui.h hVarF6 = c0949i6.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                z13 = false;
                                BoxKt.a(hVarF6, c1086gP, 0);
                                z12 = true;
                                c1086gP.T(true);
                                p293xa.r rVar113 = p293xa.r.f47939a;
                            }
                            c1086gP.T(z13);
                            pVar8 = pVar7;
                        } else {
                            str4 = str4;
                            str3 = str3;
                            z12 = true;
                            if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                c1086gP.L(861667097);
                                c1086gP.T(false);
                                throw new NoWhenBranchMatchedException();
                            }
                            c1086gP.L(943331838);
                            pVar8 = pVar7;
                            TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                            c1086gP.T(false);
                            p293xa.r rVar114 = p293xa.r.f47939a;
                        }
                    }
                    c1086gP.T(z12);
                    aVar4 = aVar7;
                    num7 = num6;
                    pVar9 = pVar8;
                    hVar7 = hVar5;
                    str6 = str4;
                    num8 = num5;
                    str7 = str3;
                    homeItemBadge3 = homeItemBadge2;
                    hVar8 = hVar14;
                } else {
                    hVar6 = hVar4;
                }
                J4.i.d(i26, c1086gP, i26, pVar5);
                pVar6 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar6, c1086gP, hVarC12);
                if (2.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
                num5 = num3;
                C0953m c0953mA4 = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
                i27 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P18 = c1086gP.P();
                androidx.compose.ui.h hVarC18 = ComposedModifierKt.c(c1086gP, layoutWeightElement4);
                c1086gP.r();
                pVar7 = pVarM92getLambda1$intercom_sdk_base_release;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar3, c1086gP, c0953mA4);
                R0.a(pVar4, c1086gP, interfaceC1089h0P18);
                if (c1086gP.f12995O) {
                    J4.i.d(i27, c1086gP, i27, pVar5);
                } else {
                    J4.i.d(i27, c1086gP, i27, pVar5);
                }
                R0.a(pVar6, c1086gP, hVarC18);
                c1086gP.L(-1379228937);
                if (num4 != null) {
                    strP = S4.o.p(c1086gP, num4.intValue());
                } else {
                    if (str3 == null) {
                        strP = "";
                    } else {
                        str5 = str3;
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i28 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVar15 = hVar6;
                    TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                    c1086gP.L(-1379221164);
                    if (str4 != null) {
                        TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                        c1086gP.L(941879891);
                        androidx.compose.foundation.layout.T tA9 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                        i30 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P19 = c1086gP.P();
                        androidx.compose.ui.h hVarC19 = ComposedModifierKt.c(c1086gP, aVar2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar3, c1086gP, tA9);
                        R0.a(pVar4, c1086gP, interfaceC1089h0P19);
                        if (c1086gP.f12995O) {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        } else {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        }
                        R0.a(pVar6, c1086gP, hVarC19);
                        pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                        c1086gP.L(-1379205196);
                        if (num5 != null) {
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            p293xa.r rVar115 = p293xa.r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        c1086gP.T(false);
                        p293xa.r rVar116 = p293xa.r.f47939a;
                        num6 = num4;
                        str4 = str4;
                        str3 = str3;
                        pVar8 = pVar7;
                        z12 = true;
                    } else {
                        num6 = num4;
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            c1086gP.L(942534549);
                            if (num5 == null) {
                                z12 = true;
                                z13 = false;
                            } else {
                                androidx.compose.ui.layout.E eD7 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                i29 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P110 = c1086gP.P();
                                androidx.compose.ui.h hVarC110 = ComposedModifierKt.c(c1086gP, aVar2);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar3);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar3, c1086gP, eD7);
                                R0.a(pVar4, c1086gP, interfaceC1089h0P110);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                } else {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                }
                                R0.a(pVar6, c1086gP, hVarC110);
                                C0949i c0949i7 = C0949i.f10304a;
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                androidx.compose.ui.h hVarF7 = c0949i7.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                z13 = false;
                                BoxKt.a(hVarF7, c1086gP, 0);
                                z12 = true;
                                c1086gP.T(true);
                                p293xa.r rVar117 = p293xa.r.f47939a;
                            }
                            c1086gP.T(z13);
                            pVar8 = pVar7;
                        } else {
                            str4 = str4;
                            str3 = str3;
                            z12 = true;
                            if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                c1086gP.L(861667097);
                                c1086gP.T(false);
                                throw new NoWhenBranchMatchedException();
                            }
                            c1086gP.L(943331838);
                            pVar8 = pVar7;
                            TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                            c1086gP.T(false);
                            p293xa.r rVar118 = p293xa.r.f47939a;
                        }
                    }
                    c1086gP.T(z12);
                    aVar4 = aVar7;
                    num7 = num6;
                    pVar9 = pVar8;
                    hVar7 = hVar5;
                    str6 = str4;
                    num8 = num5;
                    str7 = str3;
                    homeItemBadge3 = homeItemBadge2;
                    hVar8 = hVar15;
                }
                str5 = strP;
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i28 = IntercomTheme.$stable;
                androidx.compose.ui.h hVar16 = hVar6;
                TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                c1086gP.L(-1379221164);
                if (str4 != null) {
                    TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                    c1086gP.L(941879891);
                    androidx.compose.foundation.layout.T tA10 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                    i30 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111 = c1086gP.P();
                    androidx.compose.ui.h hVarC111 = ComposedModifierKt.c(c1086gP, aVar2);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar3, c1086gP, tA10);
                    R0.a(pVar4, c1086gP, interfaceC1089h0P111);
                    if (c1086gP.f12995O) {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    } else {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    }
                    R0.a(pVar6, c1086gP, hVarC111);
                    pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                    c1086gP.L(-1379205196);
                    if (num5 != null) {
                        IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                        p293xa.r rVar119 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.T(false);
                    p293xa.r rVar1110 = p293xa.r.f47939a;
                    num6 = num4;
                    str4 = str4;
                    str3 = str3;
                    pVar8 = pVar7;
                    z12 = true;
                } else {
                    num6 = num4;
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        c1086gP.L(942534549);
                        if (num5 == null) {
                            z12 = true;
                            z13 = false;
                        } else {
                            androidx.compose.ui.layout.E eD8 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i29 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P112 = c1086gP.P();
                            androidx.compose.ui.h hVarC112 = ComposedModifierKt.c(c1086gP, aVar2);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar3, c1086gP, eD8);
                            R0.a(pVar4, c1086gP, interfaceC1089h0P112);
                            if (c1086gP.f12995O) {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            } else {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            }
                            R0.a(pVar6, c1086gP, hVarC112);
                            C0949i c0949i8 = C0949i.f10304a;
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            androidx.compose.ui.h hVarF8 = c0949i8.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                            z13 = false;
                            BoxKt.a(hVarF8, c1086gP, 0);
                            z12 = true;
                            c1086gP.T(true);
                            p293xa.r rVar1111 = p293xa.r.f47939a;
                        }
                        c1086gP.T(z13);
                        pVar8 = pVar7;
                    } else {
                        str4 = str4;
                        str3 = str3;
                        z12 = true;
                        if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                            c1086gP.L(861667097);
                            c1086gP.T(false);
                            throw new NoWhenBranchMatchedException();
                        }
                        c1086gP.L(943331838);
                        pVar8 = pVar7;
                        TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                        c1086gP.T(false);
                        p293xa.r rVar1112 = p293xa.r.f47939a;
                    }
                }
                c1086gP.T(z12);
                aVar4 = aVar7;
                num7 = num6;
                pVar9 = pVar8;
                hVar7 = hVar5;
                str6 = str4;
                num8 = num5;
                str7 = str3;
                homeItemBadge3 = homeItemBadge2;
                hVar8 = hVar16;
            } else {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i31 != 0) {
                    hVar4 = aVar2;
                } else {
                    hVar4 = hVar3;
                }
                if (i32 != 0) {
                    num3 = null;
                }
                if (i34 != 0) {
                    pVarM92getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m92getLambda1$intercom_sdk_base_release();
                } else {
                    pVarM92getLambda1$intercom_sdk_base_release = pVar2;
                }
                if (i13 != 0) {
                    hVarM = androidx.compose.foundation.layout.W.m(aVar2, 16);
                } else {
                    hVarM = hVar2;
                }
                if (i15 != 0) {
                    num4 = null;
                }
                if (i17 != 0) {
                    str3 = null;
                }
                if (i19 != 0) {
                    str4 = null;
                }
                if (i21 != 0) {
                    homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                } else {
                    homeItemBadge2 = homeItemBadge;
                }
                if (i23 != 0) {
                    c2299p0 = new C2299p0();
                } else {
                    c2299p0 = aVar;
                }
                androidx.compose.ui.h hVarD3 = androidx.compose.foundation.layout.W.d(hVar4, 1.0f);
                c1086gP.L(-244013531);
                if ((i25 & 234881024) == 67108864) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    z11 = false;
                    objF = new q0(0 == true ? 1 : 0, c2299p0);
                    c1086gP.E(objF);
                } else {
                    z11 = false;
                    objF = new q0(0 == true ? 1 : 0, c2299p0);
                    c1086gP.E(objF);
                }
                c1086gP.T(z11);
                hVar5 = hVarM;
                Ia.a<p293xa.r> aVar8 = c2299p0;
                androidx.compose.ui.h hVarG3 = PaddingKt.g(16, 12, ClickableKt.c(hVarD3, z11, null, (Ia.a) objF, 7));
                bVar = androidx.compose.ui.d.a.f13344k;
                androidx.compose.foundation.layout.T tA11 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, c1086gP, 48);
                i26 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P113 = c1086gP.P();
                androidx.compose.ui.h hVarC113 = ComposedModifierKt.c(c1086gP, hVarG3);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                pVar3 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar3, c1086gP, tA11);
                pVar4 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar4, c1086gP, interfaceC1089h0P113);
                pVar5 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    hVar6 = hVar4;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i26))) {
                    }
                    pVar6 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar6, c1086gP, hVarC113);
                    if (2.0f <= 0.0d) {
                        p258v.a.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
                    num5 = num3;
                    C0953m c0953mA5 = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P114 = c1086gP.P();
                    androidx.compose.ui.h hVarC114 = ComposedModifierKt.c(c1086gP, layoutWeightElement5);
                    c1086gP.r();
                    pVar7 = pVarM92getLambda1$intercom_sdk_base_release;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar3, c1086gP, c0953mA5);
                    R0.a(pVar4, c1086gP, interfaceC1089h0P114);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar5);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar5);
                    }
                    R0.a(pVar6, c1086gP, hVarC114);
                    c1086gP.L(-1379228937);
                    if (num4 != null) {
                        strP = S4.o.p(c1086gP, num4.intValue());
                    } else {
                        if (str3 == null) {
                            strP = "";
                        } else {
                            str5 = str3;
                        }
                        c1086gP.T(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i28 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVar17 = hVar6;
                        TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                        c1086gP.L(-1379221164);
                        if (str4 != null) {
                            TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                            c1086gP.L(941879891);
                            androidx.compose.foundation.layout.T tA12 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                            i30 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P115 = c1086gP.P();
                            androidx.compose.ui.h hVarC115 = ComposedModifierKt.c(c1086gP, aVar2);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar3, c1086gP, tA12);
                            R0.a(pVar4, c1086gP, interfaceC1089h0P115);
                            if (c1086gP.f12995O) {
                                J4.i.d(i30, c1086gP, i30, pVar5);
                            } else {
                                J4.i.d(i30, c1086gP, i30, pVar5);
                            }
                            R0.a(pVar6, c1086gP, hVarC115);
                            pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                            c1086gP.L(-1379205196);
                            if (num5 != null) {
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                p293xa.r rVar1113 = p293xa.r.f47939a;
                            }
                            c1086gP.T(false);
                            c1086gP.T(true);
                            c1086gP.T(false);
                            p293xa.r rVar1114 = p293xa.r.f47939a;
                            num6 = num4;
                            str4 = str4;
                            str3 = str3;
                            pVar8 = pVar7;
                            z12 = true;
                        } else {
                            num6 = num4;
                            if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                c1086gP.L(942534549);
                                if (num5 == null) {
                                    z12 = true;
                                    z13 = false;
                                } else {
                                    androidx.compose.ui.layout.E eD9 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    i29 = c1086gP.f12996P;
                                    InterfaceC1089h0 interfaceC1089h0P116 = c1086gP.P();
                                    androidx.compose.ui.h hVarC116 = ComposedModifierKt.c(c1086gP, aVar2);
                                    c1086gP.r();
                                    if (c1086gP.f12995O) {
                                        c1086gP.v(aVar3);
                                    } else {
                                        c1086gP.A();
                                    }
                                    R0.a(pVar3, c1086gP, eD9);
                                    R0.a(pVar4, c1086gP, interfaceC1089h0P116);
                                    if (c1086gP.f12995O) {
                                        J4.i.d(i29, c1086gP, i29, pVar5);
                                    } else {
                                        J4.i.d(i29, c1086gP, i29, pVar5);
                                    }
                                    R0.a(pVar6, c1086gP, hVarC116);
                                    C0949i c0949i9 = C0949i.f10304a;
                                    IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                    androidx.compose.ui.h hVarF9 = c0949i9.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                    z13 = false;
                                    BoxKt.a(hVarF9, c1086gP, 0);
                                    z12 = true;
                                    c1086gP.T(true);
                                    p293xa.r rVar1115 = p293xa.r.f47939a;
                                }
                                c1086gP.T(z13);
                                pVar8 = pVar7;
                            } else {
                                str4 = str4;
                                str3 = str3;
                                z12 = true;
                                if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                    c1086gP.L(861667097);
                                    c1086gP.T(false);
                                    throw new NoWhenBranchMatchedException();
                                }
                                c1086gP.L(943331838);
                                pVar8 = pVar7;
                                TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                                c1086gP.T(false);
                                p293xa.r rVar1116 = p293xa.r.f47939a;
                            }
                        }
                        c1086gP.T(z12);
                        aVar4 = aVar8;
                        num7 = num6;
                        pVar9 = pVar8;
                        hVar7 = hVar5;
                        str6 = str4;
                        num8 = num5;
                        str7 = str3;
                        homeItemBadge3 = homeItemBadge2;
                        hVar8 = hVar17;
                    }
                    str5 = strP;
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i28 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVar18 = hVar6;
                    TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                    c1086gP.L(-1379221164);
                    if (str4 != null) {
                        TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                        c1086gP.L(941879891);
                        androidx.compose.foundation.layout.T tA13 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                        i30 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P117 = c1086gP.P();
                        androidx.compose.ui.h hVarC117 = ComposedModifierKt.c(c1086gP, aVar2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar3, c1086gP, tA13);
                        R0.a(pVar4, c1086gP, interfaceC1089h0P117);
                        if (c1086gP.f12995O) {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        } else {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        }
                        R0.a(pVar6, c1086gP, hVarC117);
                        pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                        c1086gP.L(-1379205196);
                        if (num5 != null) {
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            p293xa.r rVar1117 = p293xa.r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        c1086gP.T(false);
                        p293xa.r rVar1118 = p293xa.r.f47939a;
                        num6 = num4;
                        str4 = str4;
                        str3 = str3;
                        pVar8 = pVar7;
                        z12 = true;
                    } else {
                        num6 = num4;
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            c1086gP.L(942534549);
                            if (num5 == null) {
                                z12 = true;
                                z13 = false;
                            } else {
                                androidx.compose.ui.layout.E eD10 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                i29 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P118 = c1086gP.P();
                                androidx.compose.ui.h hVarC118 = ComposedModifierKt.c(c1086gP, aVar2);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar3);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar3, c1086gP, eD10);
                                R0.a(pVar4, c1086gP, interfaceC1089h0P118);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                } else {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                }
                                R0.a(pVar6, c1086gP, hVarC118);
                                C0949i c0949i10 = C0949i.f10304a;
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                androidx.compose.ui.h hVarF10 = c0949i10.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                z13 = false;
                                BoxKt.a(hVarF10, c1086gP, 0);
                                z12 = true;
                                c1086gP.T(true);
                                p293xa.r rVar1119 = p293xa.r.f47939a;
                            }
                            c1086gP.T(z13);
                            pVar8 = pVar7;
                        } else {
                            str4 = str4;
                            str3 = str3;
                            z12 = true;
                            if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                c1086gP.L(861667097);
                                c1086gP.T(false);
                                throw new NoWhenBranchMatchedException();
                            }
                            c1086gP.L(943331838);
                            pVar8 = pVar7;
                            TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                            c1086gP.T(false);
                            p293xa.r rVar11110 = p293xa.r.f47939a;
                        }
                    }
                    c1086gP.T(z12);
                    aVar4 = aVar8;
                    num7 = num6;
                    pVar9 = pVar8;
                    hVar7 = hVar5;
                    str6 = str4;
                    num8 = num5;
                    str7 = str3;
                    homeItemBadge3 = homeItemBadge2;
                    hVar8 = hVar18;
                } else {
                    hVar6 = hVar4;
                }
                J4.i.d(i26, c1086gP, i26, pVar5);
                pVar6 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar6, c1086gP, hVarC113);
                if (2.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
                num5 = num3;
                C0953m c0953mA6 = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
                i27 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P119 = c1086gP.P();
                androidx.compose.ui.h hVarC119 = ComposedModifierKt.c(c1086gP, layoutWeightElement6);
                c1086gP.r();
                pVar7 = pVarM92getLambda1$intercom_sdk_base_release;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar3, c1086gP, c0953mA6);
                R0.a(pVar4, c1086gP, interfaceC1089h0P119);
                if (c1086gP.f12995O) {
                    J4.i.d(i27, c1086gP, i27, pVar5);
                } else {
                    J4.i.d(i27, c1086gP, i27, pVar5);
                }
                R0.a(pVar6, c1086gP, hVarC119);
                c1086gP.L(-1379228937);
                if (num4 != null) {
                    strP = S4.o.p(c1086gP, num4.intValue());
                } else {
                    if (str3 == null) {
                        strP = "";
                    } else {
                        str5 = str3;
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i28 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVar19 = hVar6;
                    TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                    c1086gP.L(-1379221164);
                    if (str4 != null) {
                        TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                        c1086gP.L(941879891);
                        androidx.compose.foundation.layout.T tA14 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                        i30 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1110 = c1086gP.P();
                        androidx.compose.ui.h hVarC1110 = ComposedModifierKt.c(c1086gP, aVar2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar3, c1086gP, tA14);
                        R0.a(pVar4, c1086gP, interfaceC1089h0P1110);
                        if (c1086gP.f12995O) {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        } else {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        }
                        R0.a(pVar6, c1086gP, hVarC1110);
                        pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                        c1086gP.L(-1379205196);
                        if (num5 != null) {
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            p293xa.r rVar11111 = p293xa.r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        c1086gP.T(false);
                        p293xa.r rVar11112 = p293xa.r.f47939a;
                        num6 = num4;
                        str4 = str4;
                        str3 = str3;
                        pVar8 = pVar7;
                        z12 = true;
                    } else {
                        num6 = num4;
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            c1086gP.L(942534549);
                            if (num5 == null) {
                                z12 = true;
                                z13 = false;
                            } else {
                                androidx.compose.ui.layout.E eD11 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                i29 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P1111 = c1086gP.P();
                                androidx.compose.ui.h hVarC1111 = ComposedModifierKt.c(c1086gP, aVar2);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar3);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar3, c1086gP, eD11);
                                R0.a(pVar4, c1086gP, interfaceC1089h0P1111);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                } else {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                }
                                R0.a(pVar6, c1086gP, hVarC1111);
                                C0949i c0949i11 = C0949i.f10304a;
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                androidx.compose.ui.h hVarF11 = c0949i11.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                z13 = false;
                                BoxKt.a(hVarF11, c1086gP, 0);
                                z12 = true;
                                c1086gP.T(true);
                                p293xa.r rVar11113 = p293xa.r.f47939a;
                            }
                            c1086gP.T(z13);
                            pVar8 = pVar7;
                        } else {
                            str4 = str4;
                            str3 = str3;
                            z12 = true;
                            if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                c1086gP.L(861667097);
                                c1086gP.T(false);
                                throw new NoWhenBranchMatchedException();
                            }
                            c1086gP.L(943331838);
                            pVar8 = pVar7;
                            TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                            c1086gP.T(false);
                            p293xa.r rVar11114 = p293xa.r.f47939a;
                        }
                    }
                    c1086gP.T(z12);
                    aVar4 = aVar8;
                    num7 = num6;
                    pVar9 = pVar8;
                    hVar7 = hVar5;
                    str6 = str4;
                    num8 = num5;
                    str7 = str3;
                    homeItemBadge3 = homeItemBadge2;
                    hVar8 = hVar19;
                }
                str5 = strP;
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i28 = IntercomTheme.$stable;
                androidx.compose.ui.h hVar110 = hVar6;
                TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                c1086gP.L(-1379221164);
                if (str4 != null) {
                    TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                    c1086gP.L(941879891);
                    androidx.compose.foundation.layout.T tA15 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                    i30 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1112 = c1086gP.P();
                    androidx.compose.ui.h hVarC1112 = ComposedModifierKt.c(c1086gP, aVar2);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar3, c1086gP, tA15);
                    R0.a(pVar4, c1086gP, interfaceC1089h0P1112);
                    if (c1086gP.f12995O) {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    } else {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    }
                    R0.a(pVar6, c1086gP, hVarC1112);
                    pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                    c1086gP.L(-1379205196);
                    if (num5 != null) {
                        IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                        p293xa.r rVar11115 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.T(false);
                    p293xa.r rVar11116 = p293xa.r.f47939a;
                    num6 = num4;
                    str4 = str4;
                    str3 = str3;
                    pVar8 = pVar7;
                    z12 = true;
                } else {
                    num6 = num4;
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        c1086gP.L(942534549);
                        if (num5 == null) {
                            z12 = true;
                            z13 = false;
                        } else {
                            androidx.compose.ui.layout.E eD12 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i29 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P1113 = c1086gP.P();
                            androidx.compose.ui.h hVarC1113 = ComposedModifierKt.c(c1086gP, aVar2);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar3, c1086gP, eD12);
                            R0.a(pVar4, c1086gP, interfaceC1089h0P1113);
                            if (c1086gP.f12995O) {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            } else {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            }
                            R0.a(pVar6, c1086gP, hVarC1113);
                            C0949i c0949i12 = C0949i.f10304a;
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            androidx.compose.ui.h hVarF12 = c0949i12.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                            z13 = false;
                            BoxKt.a(hVarF12, c1086gP, 0);
                            z12 = true;
                            c1086gP.T(true);
                            p293xa.r rVar11117 = p293xa.r.f47939a;
                        }
                        c1086gP.T(z13);
                        pVar8 = pVar7;
                    } else {
                        str4 = str4;
                        str3 = str3;
                        z12 = true;
                        if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                            c1086gP.L(861667097);
                            c1086gP.T(false);
                            throw new NoWhenBranchMatchedException();
                        }
                        c1086gP.L(943331838);
                        pVar8 = pVar7;
                        TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                        c1086gP.T(false);
                        p293xa.r rVar11118 = p293xa.r.f47939a;
                    }
                }
                c1086gP.T(z12);
                aVar4 = aVar8;
                num7 = num6;
                pVar9 = pVar8;
                hVar7 = hVar5;
                str6 = str4;
                num8 = num5;
                str7 = str3;
                homeItemBadge3 = homeItemBadge2;
                hVar8 = hVar110;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.a aVar9 = aVar4;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.s0
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HomeItemKt.HomeItem$lambda$10(hVar8, num8, pVar9, hVar7, num7, str7, str6, homeItemBadge3, aVar9, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i33 |= 384;
        pVar2 = pVar;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                if (c1086gP.K(hVar2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i33 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                i33 |= 24576;
                num4 = num2;
            } else {
                num4 = num2;
                if ((i10 & 57344) == 0) {
                    if (c1086gP.K(num4)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i33 |= i16;
                }
            }
            i17 = 32 & i11;
            if (i17 != 0) {
                i33 |= 196608;
                str3 = str;
            } else {
                str3 = str;
                if ((i10 & 458752) == 0) {
                    if (c1086gP.K(str3)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i33 |= i18;
                }
            }
            i19 = i11 & 64;
            if (i19 != 0) {
                i33 |= 1572864;
                str4 = str2;
            } else {
                str4 = str2;
                if ((i10 & 3670016) == 0) {
                    if (c1086gP.K(str4)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i33 |= i20;
                }
            }
            i21 = 128 & i11;
            if (i21 != 0) {
                i33 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (c1086gP.K(homeItemBadge)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i33 |= i22;
            }
            i23 = 256 & i11;
            if (i23 != 0) {
                i33 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (c1086gP.k(aVar)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i33 |= i24;
            }
            i25 = i33;
            if ((i25 & 191739611) == 38347922) {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i31 != 0) {
                    hVar4 = aVar2;
                } else {
                    hVar4 = hVar3;
                }
                if (i32 != 0) {
                    num3 = null;
                }
                if (i34 != 0) {
                    pVarM92getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m92getLambda1$intercom_sdk_base_release();
                } else {
                    pVarM92getLambda1$intercom_sdk_base_release = pVar2;
                }
                if (i13 != 0) {
                    hVarM = androidx.compose.foundation.layout.W.m(aVar2, 16);
                } else {
                    hVarM = hVar2;
                }
                if (i15 != 0) {
                    num4 = null;
                }
                if (i17 != 0) {
                    str3 = null;
                }
                if (i19 != 0) {
                    str4 = null;
                }
                if (i21 != 0) {
                    homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                } else {
                    homeItemBadge2 = homeItemBadge;
                }
                if (i23 != 0) {
                    c2299p0 = new C2299p0();
                } else {
                    c2299p0 = aVar;
                }
                androidx.compose.ui.h hVarD4 = androidx.compose.foundation.layout.W.d(hVar4, 1.0f);
                c1086gP.L(-244013531);
                if ((i25 & 234881024) == 67108864) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    z11 = false;
                    objF = new q0(0 == true ? 1 : 0, c2299p0);
                    c1086gP.E(objF);
                } else {
                    z11 = false;
                    objF = new q0(0 == true ? 1 : 0, c2299p0);
                    c1086gP.E(objF);
                }
                c1086gP.T(z11);
                hVar5 = hVarM;
                Ia.a<p293xa.r> aVar10 = c2299p0;
                androidx.compose.ui.h hVarG4 = PaddingKt.g(16, 12, ClickableKt.c(hVarD4, z11, null, (Ia.a) objF, 7));
                bVar = androidx.compose.ui.d.a.f13344k;
                androidx.compose.foundation.layout.T tA16 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, c1086gP, 48);
                i26 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1114 = c1086gP.P();
                androidx.compose.ui.h hVarC1114 = ComposedModifierKt.c(c1086gP, hVarG4);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                pVar3 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar3, c1086gP, tA16);
                pVar4 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar4, c1086gP, interfaceC1089h0P1114);
                pVar5 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    hVar6 = hVar4;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i26))) {
                    }
                    pVar6 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar6, c1086gP, hVarC1114);
                    if (2.0f <= 0.0d) {
                        p258v.a.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
                    num5 = num3;
                    C0953m c0953mA7 = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1115 = c1086gP.P();
                    androidx.compose.ui.h hVarC1115 = ComposedModifierKt.c(c1086gP, layoutWeightElement7);
                    c1086gP.r();
                    pVar7 = pVarM92getLambda1$intercom_sdk_base_release;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar3, c1086gP, c0953mA7);
                    R0.a(pVar4, c1086gP, interfaceC1089h0P1115);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar5);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar5);
                    }
                    R0.a(pVar6, c1086gP, hVarC1115);
                    c1086gP.L(-1379228937);
                    if (num4 != null) {
                        strP = S4.o.p(c1086gP, num4.intValue());
                    } else {
                        if (str3 == null) {
                            strP = "";
                        } else {
                            str5 = str3;
                        }
                        c1086gP.T(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i28 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVar111 = hVar6;
                        TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                        c1086gP.L(-1379221164);
                        if (str4 != null) {
                            TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                            c1086gP.L(941879891);
                            androidx.compose.foundation.layout.T tA17 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                            i30 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P1116 = c1086gP.P();
                            androidx.compose.ui.h hVarC1116 = ComposedModifierKt.c(c1086gP, aVar2);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar3, c1086gP, tA17);
                            R0.a(pVar4, c1086gP, interfaceC1089h0P1116);
                            if (c1086gP.f12995O) {
                                J4.i.d(i30, c1086gP, i30, pVar5);
                            } else {
                                J4.i.d(i30, c1086gP, i30, pVar5);
                            }
                            R0.a(pVar6, c1086gP, hVarC1116);
                            pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                            c1086gP.L(-1379205196);
                            if (num5 != null) {
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                p293xa.r rVar11119 = p293xa.r.f47939a;
                            }
                            c1086gP.T(false);
                            c1086gP.T(true);
                            c1086gP.T(false);
                            p293xa.r rVar111110 = p293xa.r.f47939a;
                            num6 = num4;
                            str4 = str4;
                            str3 = str3;
                            pVar8 = pVar7;
                            z12 = true;
                        } else {
                            num6 = num4;
                            if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                c1086gP.L(942534549);
                                if (num5 == null) {
                                    z12 = true;
                                    z13 = false;
                                } else {
                                    androidx.compose.ui.layout.E eD13 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    i29 = c1086gP.f12996P;
                                    InterfaceC1089h0 interfaceC1089h0P1117 = c1086gP.P();
                                    androidx.compose.ui.h hVarC1117 = ComposedModifierKt.c(c1086gP, aVar2);
                                    c1086gP.r();
                                    if (c1086gP.f12995O) {
                                        c1086gP.v(aVar3);
                                    } else {
                                        c1086gP.A();
                                    }
                                    R0.a(pVar3, c1086gP, eD13);
                                    R0.a(pVar4, c1086gP, interfaceC1089h0P1117);
                                    if (c1086gP.f12995O) {
                                        J4.i.d(i29, c1086gP, i29, pVar5);
                                    } else {
                                        J4.i.d(i29, c1086gP, i29, pVar5);
                                    }
                                    R0.a(pVar6, c1086gP, hVarC1117);
                                    C0949i c0949i13 = C0949i.f10304a;
                                    IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                    androidx.compose.ui.h hVarF13 = c0949i13.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                    z13 = false;
                                    BoxKt.a(hVarF13, c1086gP, 0);
                                    z12 = true;
                                    c1086gP.T(true);
                                    p293xa.r rVar111111 = p293xa.r.f47939a;
                                }
                                c1086gP.T(z13);
                                pVar8 = pVar7;
                            } else {
                                str4 = str4;
                                str3 = str3;
                                z12 = true;
                                if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                    c1086gP.L(861667097);
                                    c1086gP.T(false);
                                    throw new NoWhenBranchMatchedException();
                                }
                                c1086gP.L(943331838);
                                pVar8 = pVar7;
                                TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                                c1086gP.T(false);
                                p293xa.r rVar111112 = p293xa.r.f47939a;
                            }
                        }
                        c1086gP.T(z12);
                        aVar4 = aVar10;
                        num7 = num6;
                        pVar9 = pVar8;
                        hVar7 = hVar5;
                        str6 = str4;
                        num8 = num5;
                        str7 = str3;
                        homeItemBadge3 = homeItemBadge2;
                        hVar8 = hVar111;
                    }
                    str5 = strP;
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i28 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVar112 = hVar6;
                    TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                    c1086gP.L(-1379221164);
                    if (str4 != null) {
                        TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                        c1086gP.L(941879891);
                        androidx.compose.foundation.layout.T tA18 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                        i30 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1118 = c1086gP.P();
                        androidx.compose.ui.h hVarC1118 = ComposedModifierKt.c(c1086gP, aVar2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar3, c1086gP, tA18);
                        R0.a(pVar4, c1086gP, interfaceC1089h0P1118);
                        if (c1086gP.f12995O) {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        } else {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        }
                        R0.a(pVar6, c1086gP, hVarC1118);
                        pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                        c1086gP.L(-1379205196);
                        if (num5 != null) {
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            p293xa.r rVar111113 = p293xa.r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        c1086gP.T(false);
                        p293xa.r rVar111114 = p293xa.r.f47939a;
                        num6 = num4;
                        str4 = str4;
                        str3 = str3;
                        pVar8 = pVar7;
                        z12 = true;
                    } else {
                        num6 = num4;
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            c1086gP.L(942534549);
                            if (num5 == null) {
                                z12 = true;
                                z13 = false;
                            } else {
                                androidx.compose.ui.layout.E eD14 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                i29 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P1119 = c1086gP.P();
                                androidx.compose.ui.h hVarC1119 = ComposedModifierKt.c(c1086gP, aVar2);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar3);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar3, c1086gP, eD14);
                                R0.a(pVar4, c1086gP, interfaceC1089h0P1119);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                } else {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                }
                                R0.a(pVar6, c1086gP, hVarC1119);
                                C0949i c0949i14 = C0949i.f10304a;
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                androidx.compose.ui.h hVarF14 = c0949i14.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                z13 = false;
                                BoxKt.a(hVarF14, c1086gP, 0);
                                z12 = true;
                                c1086gP.T(true);
                                p293xa.r rVar111115 = p293xa.r.f47939a;
                            }
                            c1086gP.T(z13);
                            pVar8 = pVar7;
                        } else {
                            str4 = str4;
                            str3 = str3;
                            z12 = true;
                            if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                c1086gP.L(861667097);
                                c1086gP.T(false);
                                throw new NoWhenBranchMatchedException();
                            }
                            c1086gP.L(943331838);
                            pVar8 = pVar7;
                            TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                            c1086gP.T(false);
                            p293xa.r rVar111116 = p293xa.r.f47939a;
                        }
                    }
                    c1086gP.T(z12);
                    aVar4 = aVar10;
                    num7 = num6;
                    pVar9 = pVar8;
                    hVar7 = hVar5;
                    str6 = str4;
                    num8 = num5;
                    str7 = str3;
                    homeItemBadge3 = homeItemBadge2;
                    hVar8 = hVar112;
                } else {
                    hVar6 = hVar4;
                }
                J4.i.d(i26, c1086gP, i26, pVar5);
                pVar6 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar6, c1086gP, hVarC1114);
                if (2.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
                num5 = num3;
                C0953m c0953mA8 = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
                i27 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11110 = c1086gP.P();
                androidx.compose.ui.h hVarC11110 = ComposedModifierKt.c(c1086gP, layoutWeightElement8);
                c1086gP.r();
                pVar7 = pVarM92getLambda1$intercom_sdk_base_release;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar3, c1086gP, c0953mA8);
                R0.a(pVar4, c1086gP, interfaceC1089h0P11110);
                if (c1086gP.f12995O) {
                    J4.i.d(i27, c1086gP, i27, pVar5);
                } else {
                    J4.i.d(i27, c1086gP, i27, pVar5);
                }
                R0.a(pVar6, c1086gP, hVarC11110);
                c1086gP.L(-1379228937);
                if (num4 != null) {
                    strP = S4.o.p(c1086gP, num4.intValue());
                } else {
                    if (str3 == null) {
                        strP = "";
                    } else {
                        str5 = str3;
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i28 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVar113 = hVar6;
                    TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                    c1086gP.L(-1379221164);
                    if (str4 != null) {
                        TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                        c1086gP.L(941879891);
                        androidx.compose.foundation.layout.T tA19 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                        i30 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111 = ComposedModifierKt.c(c1086gP, aVar2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar3, c1086gP, tA19);
                        R0.a(pVar4, c1086gP, interfaceC1089h0P11111);
                        if (c1086gP.f12995O) {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        } else {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        }
                        R0.a(pVar6, c1086gP, hVarC11111);
                        pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                        c1086gP.L(-1379205196);
                        if (num5 != null) {
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            p293xa.r rVar111117 = p293xa.r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        c1086gP.T(false);
                        p293xa.r rVar111118 = p293xa.r.f47939a;
                        num6 = num4;
                        str4 = str4;
                        str3 = str3;
                        pVar8 = pVar7;
                        z12 = true;
                    } else {
                        num6 = num4;
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            c1086gP.L(942534549);
                            if (num5 == null) {
                                z12 = true;
                                z13 = false;
                            } else {
                                androidx.compose.ui.layout.E eD15 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                i29 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P11112 = c1086gP.P();
                                androidx.compose.ui.h hVarC11112 = ComposedModifierKt.c(c1086gP, aVar2);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar3);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar3, c1086gP, eD15);
                                R0.a(pVar4, c1086gP, interfaceC1089h0P11112);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                } else {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                }
                                R0.a(pVar6, c1086gP, hVarC11112);
                                C0949i c0949i15 = C0949i.f10304a;
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                androidx.compose.ui.h hVarF15 = c0949i15.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                z13 = false;
                                BoxKt.a(hVarF15, c1086gP, 0);
                                z12 = true;
                                c1086gP.T(true);
                                p293xa.r rVar111119 = p293xa.r.f47939a;
                            }
                            c1086gP.T(z13);
                            pVar8 = pVar7;
                        } else {
                            str4 = str4;
                            str3 = str3;
                            z12 = true;
                            if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                c1086gP.L(861667097);
                                c1086gP.T(false);
                                throw new NoWhenBranchMatchedException();
                            }
                            c1086gP.L(943331838);
                            pVar8 = pVar7;
                            TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                            c1086gP.T(false);
                            p293xa.r rVar1111110 = p293xa.r.f47939a;
                        }
                    }
                    c1086gP.T(z12);
                    aVar4 = aVar10;
                    num7 = num6;
                    pVar9 = pVar8;
                    hVar7 = hVar5;
                    str6 = str4;
                    num8 = num5;
                    str7 = str3;
                    homeItemBadge3 = homeItemBadge2;
                    hVar8 = hVar113;
                }
                str5 = strP;
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i28 = IntercomTheme.$stable;
                androidx.compose.ui.h hVar114 = hVar6;
                TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                c1086gP.L(-1379221164);
                if (str4 != null) {
                    TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                    c1086gP.L(941879891);
                    androidx.compose.foundation.layout.T tA110 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                    i30 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11113 = c1086gP.P();
                    androidx.compose.ui.h hVarC11113 = ComposedModifierKt.c(c1086gP, aVar2);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar3, c1086gP, tA110);
                    R0.a(pVar4, c1086gP, interfaceC1089h0P11113);
                    if (c1086gP.f12995O) {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    } else {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    }
                    R0.a(pVar6, c1086gP, hVarC11113);
                    pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                    c1086gP.L(-1379205196);
                    if (num5 != null) {
                        IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                        p293xa.r rVar1111111 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.T(false);
                    p293xa.r rVar1111112 = p293xa.r.f47939a;
                    num6 = num4;
                    str4 = str4;
                    str3 = str3;
                    pVar8 = pVar7;
                    z12 = true;
                } else {
                    num6 = num4;
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        c1086gP.L(942534549);
                        if (num5 == null) {
                            z12 = true;
                            z13 = false;
                        } else {
                            androidx.compose.ui.layout.E eD16 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i29 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P11114 = c1086gP.P();
                            androidx.compose.ui.h hVarC11114 = ComposedModifierKt.c(c1086gP, aVar2);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar3, c1086gP, eD16);
                            R0.a(pVar4, c1086gP, interfaceC1089h0P11114);
                            if (c1086gP.f12995O) {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            } else {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            }
                            R0.a(pVar6, c1086gP, hVarC11114);
                            C0949i c0949i16 = C0949i.f10304a;
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            androidx.compose.ui.h hVarF16 = c0949i16.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                            z13 = false;
                            BoxKt.a(hVarF16, c1086gP, 0);
                            z12 = true;
                            c1086gP.T(true);
                            p293xa.r rVar1111113 = p293xa.r.f47939a;
                        }
                        c1086gP.T(z13);
                        pVar8 = pVar7;
                    } else {
                        str4 = str4;
                        str3 = str3;
                        z12 = true;
                        if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                            c1086gP.L(861667097);
                            c1086gP.T(false);
                            throw new NoWhenBranchMatchedException();
                        }
                        c1086gP.L(943331838);
                        pVar8 = pVar7;
                        TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                        c1086gP.T(false);
                        p293xa.r rVar1111114 = p293xa.r.f47939a;
                    }
                }
                c1086gP.T(z12);
                aVar4 = aVar10;
                num7 = num6;
                pVar9 = pVar8;
                hVar7 = hVar5;
                str6 = str4;
                num8 = num5;
                str7 = str3;
                homeItemBadge3 = homeItemBadge2;
                hVar8 = hVar114;
            } else {
                aVar2 = androidx.compose.ui.h.a.f13984b;
                if (i31 != 0) {
                    hVar4 = aVar2;
                } else {
                    hVar4 = hVar3;
                }
                if (i32 != 0) {
                    num3 = null;
                }
                if (i34 != 0) {
                    pVarM92getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m92getLambda1$intercom_sdk_base_release();
                } else {
                    pVarM92getLambda1$intercom_sdk_base_release = pVar2;
                }
                if (i13 != 0) {
                    hVarM = androidx.compose.foundation.layout.W.m(aVar2, 16);
                } else {
                    hVarM = hVar2;
                }
                if (i15 != 0) {
                    num4 = null;
                }
                if (i17 != 0) {
                    str3 = null;
                }
                if (i19 != 0) {
                    str4 = null;
                }
                if (i21 != 0) {
                    homeItemBadge2 = HomeItemBadge.None.INSTANCE;
                } else {
                    homeItemBadge2 = homeItemBadge;
                }
                if (i23 != 0) {
                    c2299p0 = new C2299p0();
                } else {
                    c2299p0 = aVar;
                }
                androidx.compose.ui.h hVarD5 = androidx.compose.foundation.layout.W.d(hVar4, 1.0f);
                c1086gP.L(-244013531);
                if ((i25 & 234881024) == 67108864) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objF = c1086gP.f();
                if (z10) {
                    z11 = false;
                    objF = new q0(0 == true ? 1 : 0, c2299p0);
                    c1086gP.E(objF);
                } else {
                    z11 = false;
                    objF = new q0(0 == true ? 1 : 0, c2299p0);
                    c1086gP.E(objF);
                }
                c1086gP.T(z11);
                hVar5 = hVarM;
                Ia.a<p293xa.r> aVar11 = c2299p0;
                androidx.compose.ui.h hVarG5 = PaddingKt.g(16, 12, ClickableKt.c(hVarD5, z11, null, (Ia.a) objF, 7));
                bVar = androidx.compose.ui.d.a.f13344k;
                androidx.compose.foundation.layout.T tA111 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, c1086gP, 48);
                i26 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11115 = c1086gP.P();
                androidx.compose.ui.h hVarC11115 = ComposedModifierKt.c(c1086gP, hVarG5);
                ComposeUiNode.f14331c0.getClass();
                aVar3 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                pVar3 = ComposeUiNode.Companion.f14337f;
                R0.a(pVar3, c1086gP, tA111);
                pVar4 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar4, c1086gP, interfaceC1089h0P11115);
                pVar5 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    hVar6 = hVar4;
                    if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i26))) {
                    }
                    pVar6 = ComposeUiNode.Companion.f14335d;
                    R0.a(pVar6, c1086gP, hVarC11115);
                    if (2.0f <= 0.0d) {
                        p258v.a.a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement9 = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
                    num5 = num3;
                    C0953m c0953mA9 = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
                    i27 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11116 = c1086gP.P();
                    androidx.compose.ui.h hVarC11116 = ComposedModifierKt.c(c1086gP, layoutWeightElement9);
                    c1086gP.r();
                    pVar7 = pVarM92getLambda1$intercom_sdk_base_release;
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar3, c1086gP, c0953mA9);
                    R0.a(pVar4, c1086gP, interfaceC1089h0P11116);
                    if (c1086gP.f12995O) {
                        J4.i.d(i27, c1086gP, i27, pVar5);
                    } else {
                        J4.i.d(i27, c1086gP, i27, pVar5);
                    }
                    R0.a(pVar6, c1086gP, hVarC11116);
                    c1086gP.L(-1379228937);
                    if (num4 != null) {
                        strP = S4.o.p(c1086gP, num4.intValue());
                    } else {
                        if (str3 == null) {
                            strP = "";
                        } else {
                            str5 = str3;
                        }
                        c1086gP.T(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i28 = IntercomTheme.$stable;
                        androidx.compose.ui.h hVar115 = hVar6;
                        TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                        c1086gP.L(-1379221164);
                        if (str4 != null) {
                            TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                            c1086gP.L(941879891);
                            androidx.compose.foundation.layout.T tA112 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                            i30 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P11117 = c1086gP.P();
                            androidx.compose.ui.h hVarC11117 = ComposedModifierKt.c(c1086gP, aVar2);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar3, c1086gP, tA112);
                            R0.a(pVar4, c1086gP, interfaceC1089h0P11117);
                            if (c1086gP.f12995O) {
                                J4.i.d(i30, c1086gP, i30, pVar5);
                            } else {
                                J4.i.d(i30, c1086gP, i30, pVar5);
                            }
                            R0.a(pVar6, c1086gP, hVarC11117);
                            pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                            c1086gP.L(-1379205196);
                            if (num5 != null) {
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                p293xa.r rVar1111115 = p293xa.r.f47939a;
                            }
                            c1086gP.T(false);
                            c1086gP.T(true);
                            c1086gP.T(false);
                            p293xa.r rVar1111116 = p293xa.r.f47939a;
                            num6 = num4;
                            str4 = str4;
                            str3 = str3;
                            pVar8 = pVar7;
                            z12 = true;
                        } else {
                            num6 = num4;
                            if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                                c1086gP.L(942534549);
                                if (num5 == null) {
                                    z12 = true;
                                    z13 = false;
                                } else {
                                    androidx.compose.ui.layout.E eD17 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                    i29 = c1086gP.f12996P;
                                    InterfaceC1089h0 interfaceC1089h0P11118 = c1086gP.P();
                                    androidx.compose.ui.h hVarC11118 = ComposedModifierKt.c(c1086gP, aVar2);
                                    c1086gP.r();
                                    if (c1086gP.f12995O) {
                                        c1086gP.v(aVar3);
                                    } else {
                                        c1086gP.A();
                                    }
                                    R0.a(pVar3, c1086gP, eD17);
                                    R0.a(pVar4, c1086gP, interfaceC1089h0P11118);
                                    if (c1086gP.f12995O) {
                                        J4.i.d(i29, c1086gP, i29, pVar5);
                                    } else {
                                        J4.i.d(i29, c1086gP, i29, pVar5);
                                    }
                                    R0.a(pVar6, c1086gP, hVarC11118);
                                    C0949i c0949i17 = C0949i.f10304a;
                                    IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                    androidx.compose.ui.h hVarF17 = c0949i17.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                    z13 = false;
                                    BoxKt.a(hVarF17, c1086gP, 0);
                                    z12 = true;
                                    c1086gP.T(true);
                                    p293xa.r rVar1111117 = p293xa.r.f47939a;
                                }
                                c1086gP.T(z13);
                                pVar8 = pVar7;
                            } else {
                                str4 = str4;
                                str3 = str3;
                                z12 = true;
                                if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                    c1086gP.L(861667097);
                                    c1086gP.T(false);
                                    throw new NoWhenBranchMatchedException();
                                }
                                c1086gP.L(943331838);
                                pVar8 = pVar7;
                                TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                                c1086gP.T(false);
                                p293xa.r rVar1111118 = p293xa.r.f47939a;
                            }
                        }
                        c1086gP.T(z12);
                        aVar4 = aVar11;
                        num7 = num6;
                        pVar9 = pVar8;
                        hVar7 = hVar5;
                        str6 = str4;
                        num8 = num5;
                        str7 = str3;
                        homeItemBadge3 = homeItemBadge2;
                        hVar8 = hVar115;
                    }
                    str5 = strP;
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i28 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVar116 = hVar6;
                    TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                    c1086gP.L(-1379221164);
                    if (str4 != null) {
                        TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                        c1086gP.L(941879891);
                        androidx.compose.foundation.layout.T tA113 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                        i30 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11119 = c1086gP.P();
                        androidx.compose.ui.h hVarC11119 = ComposedModifierKt.c(c1086gP, aVar2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar3, c1086gP, tA113);
                        R0.a(pVar4, c1086gP, interfaceC1089h0P11119);
                        if (c1086gP.f12995O) {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        } else {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        }
                        R0.a(pVar6, c1086gP, hVarC11119);
                        pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                        c1086gP.L(-1379205196);
                        if (num5 != null) {
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            p293xa.r rVar1111119 = p293xa.r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        c1086gP.T(false);
                        p293xa.r rVar11111110 = p293xa.r.f47939a;
                        num6 = num4;
                        str4 = str4;
                        str3 = str3;
                        pVar8 = pVar7;
                        z12 = true;
                    } else {
                        num6 = num4;
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            c1086gP.L(942534549);
                            if (num5 == null) {
                                z12 = true;
                                z13 = false;
                            } else {
                                androidx.compose.ui.layout.E eD18 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                i29 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P111110 = c1086gP.P();
                                androidx.compose.ui.h hVarC111110 = ComposedModifierKt.c(c1086gP, aVar2);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar3);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar3, c1086gP, eD18);
                                R0.a(pVar4, c1086gP, interfaceC1089h0P111110);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                } else {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                }
                                R0.a(pVar6, c1086gP, hVarC111110);
                                C0949i c0949i18 = C0949i.f10304a;
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                androidx.compose.ui.h hVarF18 = c0949i18.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                z13 = false;
                                BoxKt.a(hVarF18, c1086gP, 0);
                                z12 = true;
                                c1086gP.T(true);
                                p293xa.r rVar11111111 = p293xa.r.f47939a;
                            }
                            c1086gP.T(z13);
                            pVar8 = pVar7;
                        } else {
                            str4 = str4;
                            str3 = str3;
                            z12 = true;
                            if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                c1086gP.L(861667097);
                                c1086gP.T(false);
                                throw new NoWhenBranchMatchedException();
                            }
                            c1086gP.L(943331838);
                            pVar8 = pVar7;
                            TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                            c1086gP.T(false);
                            p293xa.r rVar11111112 = p293xa.r.f47939a;
                        }
                    }
                    c1086gP.T(z12);
                    aVar4 = aVar11;
                    num7 = num6;
                    pVar9 = pVar8;
                    hVar7 = hVar5;
                    str6 = str4;
                    num8 = num5;
                    str7 = str3;
                    homeItemBadge3 = homeItemBadge2;
                    hVar8 = hVar116;
                } else {
                    hVar6 = hVar4;
                }
                J4.i.d(i26, c1086gP, i26, pVar5);
                pVar6 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar6, c1086gP, hVarC11115);
                if (2.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement10 = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
                num5 = num3;
                C0953m c0953mA10 = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
                i27 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P111111 = c1086gP.P();
                androidx.compose.ui.h hVarC111111 = ComposedModifierKt.c(c1086gP, layoutWeightElement10);
                c1086gP.r();
                pVar7 = pVarM92getLambda1$intercom_sdk_base_release;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar3, c1086gP, c0953mA10);
                R0.a(pVar4, c1086gP, interfaceC1089h0P111111);
                if (c1086gP.f12995O) {
                    J4.i.d(i27, c1086gP, i27, pVar5);
                } else {
                    J4.i.d(i27, c1086gP, i27, pVar5);
                }
                R0.a(pVar6, c1086gP, hVarC111111);
                c1086gP.L(-1379228937);
                if (num4 != null) {
                    strP = S4.o.p(c1086gP, num4.intValue());
                } else {
                    if (str3 == null) {
                        strP = "";
                    } else {
                        str5 = str3;
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i28 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVar117 = hVar6;
                    TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                    c1086gP.L(-1379221164);
                    if (str4 != null) {
                        TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                        c1086gP.L(941879891);
                        androidx.compose.foundation.layout.T tA114 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                        i30 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111112 = c1086gP.P();
                        androidx.compose.ui.h hVarC111112 = ComposedModifierKt.c(c1086gP, aVar2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar3, c1086gP, tA114);
                        R0.a(pVar4, c1086gP, interfaceC1089h0P111112);
                        if (c1086gP.f12995O) {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        } else {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        }
                        R0.a(pVar6, c1086gP, hVarC111112);
                        pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                        c1086gP.L(-1379205196);
                        if (num5 != null) {
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            p293xa.r rVar11111113 = p293xa.r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        c1086gP.T(false);
                        p293xa.r rVar11111114 = p293xa.r.f47939a;
                        num6 = num4;
                        str4 = str4;
                        str3 = str3;
                        pVar8 = pVar7;
                        z12 = true;
                    } else {
                        num6 = num4;
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            c1086gP.L(942534549);
                            if (num5 == null) {
                                z12 = true;
                                z13 = false;
                            } else {
                                androidx.compose.ui.layout.E eD19 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                i29 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P111113 = c1086gP.P();
                                androidx.compose.ui.h hVarC111113 = ComposedModifierKt.c(c1086gP, aVar2);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar3);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar3, c1086gP, eD19);
                                R0.a(pVar4, c1086gP, interfaceC1089h0P111113);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                } else {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                }
                                R0.a(pVar6, c1086gP, hVarC111113);
                                C0949i c0949i19 = C0949i.f10304a;
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                androidx.compose.ui.h hVarF19 = c0949i19.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                z13 = false;
                                BoxKt.a(hVarF19, c1086gP, 0);
                                z12 = true;
                                c1086gP.T(true);
                                p293xa.r rVar11111115 = p293xa.r.f47939a;
                            }
                            c1086gP.T(z13);
                            pVar8 = pVar7;
                        } else {
                            str4 = str4;
                            str3 = str3;
                            z12 = true;
                            if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                c1086gP.L(861667097);
                                c1086gP.T(false);
                                throw new NoWhenBranchMatchedException();
                            }
                            c1086gP.L(943331838);
                            pVar8 = pVar7;
                            TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                            c1086gP.T(false);
                            p293xa.r rVar11111116 = p293xa.r.f47939a;
                        }
                    }
                    c1086gP.T(z12);
                    aVar4 = aVar11;
                    num7 = num6;
                    pVar9 = pVar8;
                    hVar7 = hVar5;
                    str6 = str4;
                    num8 = num5;
                    str7 = str3;
                    homeItemBadge3 = homeItemBadge2;
                    hVar8 = hVar117;
                }
                str5 = strP;
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i28 = IntercomTheme.$stable;
                androidx.compose.ui.h hVar118 = hVar6;
                TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                c1086gP.L(-1379221164);
                if (str4 != null) {
                    TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                    c1086gP.L(941879891);
                    androidx.compose.foundation.layout.T tA115 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                    i30 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111114 = c1086gP.P();
                    androidx.compose.ui.h hVarC111114 = ComposedModifierKt.c(c1086gP, aVar2);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar3, c1086gP, tA115);
                    R0.a(pVar4, c1086gP, interfaceC1089h0P111114);
                    if (c1086gP.f12995O) {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    } else {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    }
                    R0.a(pVar6, c1086gP, hVarC111114);
                    pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                    c1086gP.L(-1379205196);
                    if (num5 != null) {
                        IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                        p293xa.r rVar11111117 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.T(false);
                    p293xa.r rVar11111118 = p293xa.r.f47939a;
                    num6 = num4;
                    str4 = str4;
                    str3 = str3;
                    pVar8 = pVar7;
                    z12 = true;
                } else {
                    num6 = num4;
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        c1086gP.L(942534549);
                        if (num5 == null) {
                            z12 = true;
                            z13 = false;
                        } else {
                            androidx.compose.ui.layout.E eD110 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i29 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P111115 = c1086gP.P();
                            androidx.compose.ui.h hVarC111115 = ComposedModifierKt.c(c1086gP, aVar2);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar3, c1086gP, eD110);
                            R0.a(pVar4, c1086gP, interfaceC1089h0P111115);
                            if (c1086gP.f12995O) {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            } else {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            }
                            R0.a(pVar6, c1086gP, hVarC111115);
                            C0949i c0949i110 = C0949i.f10304a;
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            androidx.compose.ui.h hVarF110 = c0949i110.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                            z13 = false;
                            BoxKt.a(hVarF110, c1086gP, 0);
                            z12 = true;
                            c1086gP.T(true);
                            p293xa.r rVar11111119 = p293xa.r.f47939a;
                        }
                        c1086gP.T(z13);
                        pVar8 = pVar7;
                    } else {
                        str4 = str4;
                        str3 = str3;
                        z12 = true;
                        if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                            c1086gP.L(861667097);
                            c1086gP.T(false);
                            throw new NoWhenBranchMatchedException();
                        }
                        c1086gP.L(943331838);
                        pVar8 = pVar7;
                        TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                        c1086gP.T(false);
                        p293xa.r rVar111111110 = p293xa.r.f47939a;
                    }
                }
                c1086gP.T(z12);
                aVar4 = aVar11;
                num7 = num6;
                pVar9 = pVar8;
                hVar7 = hVar5;
                str6 = str4;
                num8 = num5;
                str7 = str3;
                homeItemBadge3 = homeItemBadge2;
                hVar8 = hVar118;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final Ia.a aVar12 = aVar4;
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.s0
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HomeItemKt.HomeItem$lambda$10(hVar8, num8, pVar9, hVar7, num7, str7, str6, homeItemBadge3, aVar12, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i33 |= 3072;
        i15 = i11 & 16;
        if (i15 != 0) {
            i33 |= 24576;
            num4 = num2;
        } else {
            num4 = num2;
            if ((i10 & 57344) == 0) {
                if (c1086gP.K(num4)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i33 |= i16;
            }
        }
        i17 = 32 & i11;
        if (i17 != 0) {
            i33 |= 196608;
            str3 = str;
        } else {
            str3 = str;
            if ((i10 & 458752) == 0) {
                if (c1086gP.K(str3)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i33 |= i18;
            }
        }
        i19 = i11 & 64;
        if (i19 != 0) {
            i33 |= 1572864;
            str4 = str2;
        } else {
            str4 = str2;
            if ((i10 & 3670016) == 0) {
                if (c1086gP.K(str4)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i33 |= i20;
            }
        }
        i21 = 128 & i11;
        if (i21 != 0) {
            i33 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (c1086gP.K(homeItemBadge)) {
                i22 = 8388608;
            } else {
                i22 = 4194304;
            }
            i33 |= i22;
        }
        i23 = 256 & i11;
        if (i23 != 0) {
            i33 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (c1086gP.k(aVar)) {
                i24 = 67108864;
            } else {
                i24 = 33554432;
            }
            i33 |= i24;
        }
        i25 = i33;
        if ((i25 & 191739611) == 38347922) {
            aVar2 = androidx.compose.ui.h.a.f13984b;
            if (i31 != 0) {
                hVar4 = aVar2;
            } else {
                hVar4 = hVar3;
            }
            if (i32 != 0) {
                num3 = null;
            }
            if (i34 != 0) {
                pVarM92getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m92getLambda1$intercom_sdk_base_release();
            } else {
                pVarM92getLambda1$intercom_sdk_base_release = pVar2;
            }
            if (i13 != 0) {
                hVarM = androidx.compose.foundation.layout.W.m(aVar2, 16);
            } else {
                hVarM = hVar2;
            }
            if (i15 != 0) {
                num4 = null;
            }
            if (i17 != 0) {
                str3 = null;
            }
            if (i19 != 0) {
                str4 = null;
            }
            if (i21 != 0) {
                homeItemBadge2 = HomeItemBadge.None.INSTANCE;
            } else {
                homeItemBadge2 = homeItemBadge;
            }
            if (i23 != 0) {
                c2299p0 = new C2299p0();
            } else {
                c2299p0 = aVar;
            }
            androidx.compose.ui.h hVarD6 = androidx.compose.foundation.layout.W.d(hVar4, 1.0f);
            c1086gP.L(-244013531);
            if ((i25 & 234881024) == 67108864) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF = c1086gP.f();
            if (z10) {
                z11 = false;
                objF = new q0(0 == true ? 1 : 0, c2299p0);
                c1086gP.E(objF);
            } else {
                z11 = false;
                objF = new q0(0 == true ? 1 : 0, c2299p0);
                c1086gP.E(objF);
            }
            c1086gP.T(z11);
            hVar5 = hVarM;
            Ia.a<p293xa.r> aVar13 = c2299p0;
            androidx.compose.ui.h hVarG6 = PaddingKt.g(16, 12, ClickableKt.c(hVarD6, z11, null, (Ia.a) objF, 7));
            bVar = androidx.compose.ui.d.a.f13344k;
            androidx.compose.foundation.layout.T tA116 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, c1086gP, 48);
            i26 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P111116 = c1086gP.P();
            androidx.compose.ui.h hVarC111116 = ComposedModifierKt.c(c1086gP, hVarG6);
            ComposeUiNode.f14331c0.getClass();
            aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            pVar3 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar3, c1086gP, tA116);
            pVar4 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar4, c1086gP, interfaceC1089h0P111116);
            pVar5 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                hVar6 = hVar4;
                if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i26))) {
                }
                pVar6 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar6, c1086gP, hVarC111116);
                if (2.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement11 = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
                num5 = num3;
                C0953m c0953mA11 = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
                i27 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P111117 = c1086gP.P();
                androidx.compose.ui.h hVarC111117 = ComposedModifierKt.c(c1086gP, layoutWeightElement11);
                c1086gP.r();
                pVar7 = pVarM92getLambda1$intercom_sdk_base_release;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar3, c1086gP, c0953mA11);
                R0.a(pVar4, c1086gP, interfaceC1089h0P111117);
                if (c1086gP.f12995O) {
                    J4.i.d(i27, c1086gP, i27, pVar5);
                } else {
                    J4.i.d(i27, c1086gP, i27, pVar5);
                }
                R0.a(pVar6, c1086gP, hVarC111117);
                c1086gP.L(-1379228937);
                if (num4 != null) {
                    strP = S4.o.p(c1086gP, num4.intValue());
                } else {
                    if (str3 == null) {
                        strP = "";
                    } else {
                        str5 = str3;
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i28 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVar119 = hVar6;
                    TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                    c1086gP.L(-1379221164);
                    if (str4 != null) {
                        TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                        c1086gP.L(941879891);
                        androidx.compose.foundation.layout.T tA117 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                        i30 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P111118 = c1086gP.P();
                        androidx.compose.ui.h hVarC111118 = ComposedModifierKt.c(c1086gP, aVar2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar3, c1086gP, tA117);
                        R0.a(pVar4, c1086gP, interfaceC1089h0P111118);
                        if (c1086gP.f12995O) {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        } else {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        }
                        R0.a(pVar6, c1086gP, hVarC111118);
                        pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                        c1086gP.L(-1379205196);
                        if (num5 != null) {
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            p293xa.r rVar111111111 = p293xa.r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        c1086gP.T(false);
                        p293xa.r rVar111111112 = p293xa.r.f47939a;
                        num6 = num4;
                        str4 = str4;
                        str3 = str3;
                        pVar8 = pVar7;
                        z12 = true;
                    } else {
                        num6 = num4;
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            c1086gP.L(942534549);
                            if (num5 == null) {
                                z12 = true;
                                z13 = false;
                            } else {
                                androidx.compose.ui.layout.E eD111 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                i29 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P111119 = c1086gP.P();
                                androidx.compose.ui.h hVarC111119 = ComposedModifierKt.c(c1086gP, aVar2);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar3);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar3, c1086gP, eD111);
                                R0.a(pVar4, c1086gP, interfaceC1089h0P111119);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                } else {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                }
                                R0.a(pVar6, c1086gP, hVarC111119);
                                C0949i c0949i111 = C0949i.f10304a;
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                androidx.compose.ui.h hVarF111 = c0949i111.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                z13 = false;
                                BoxKt.a(hVarF111, c1086gP, 0);
                                z12 = true;
                                c1086gP.T(true);
                                p293xa.r rVar111111113 = p293xa.r.f47939a;
                            }
                            c1086gP.T(z13);
                            pVar8 = pVar7;
                        } else {
                            str4 = str4;
                            str3 = str3;
                            z12 = true;
                            if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                c1086gP.L(861667097);
                                c1086gP.T(false);
                                throw new NoWhenBranchMatchedException();
                            }
                            c1086gP.L(943331838);
                            pVar8 = pVar7;
                            TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                            c1086gP.T(false);
                            p293xa.r rVar111111114 = p293xa.r.f47939a;
                        }
                    }
                    c1086gP.T(z12);
                    aVar4 = aVar13;
                    num7 = num6;
                    pVar9 = pVar8;
                    hVar7 = hVar5;
                    str6 = str4;
                    num8 = num5;
                    str7 = str3;
                    homeItemBadge3 = homeItemBadge2;
                    hVar8 = hVar119;
                }
                str5 = strP;
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i28 = IntercomTheme.$stable;
                androidx.compose.ui.h hVar1110 = hVar6;
                TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                c1086gP.L(-1379221164);
                if (str4 != null) {
                    TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                    c1086gP.L(941879891);
                    androidx.compose.foundation.layout.T tA118 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                    i30 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111110 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111110 = ComposedModifierKt.c(c1086gP, aVar2);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar3, c1086gP, tA118);
                    R0.a(pVar4, c1086gP, interfaceC1089h0P1111110);
                    if (c1086gP.f12995O) {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    } else {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    }
                    R0.a(pVar6, c1086gP, hVarC1111110);
                    pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                    c1086gP.L(-1379205196);
                    if (num5 != null) {
                        IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                        p293xa.r rVar111111115 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.T(false);
                    p293xa.r rVar111111116 = p293xa.r.f47939a;
                    num6 = num4;
                    str4 = str4;
                    str3 = str3;
                    pVar8 = pVar7;
                    z12 = true;
                } else {
                    num6 = num4;
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        c1086gP.L(942534549);
                        if (num5 == null) {
                            z12 = true;
                            z13 = false;
                        } else {
                            androidx.compose.ui.layout.E eD112 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i29 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P1111111 = c1086gP.P();
                            androidx.compose.ui.h hVarC1111111 = ComposedModifierKt.c(c1086gP, aVar2);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar3, c1086gP, eD112);
                            R0.a(pVar4, c1086gP, interfaceC1089h0P1111111);
                            if (c1086gP.f12995O) {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            } else {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            }
                            R0.a(pVar6, c1086gP, hVarC1111111);
                            C0949i c0949i112 = C0949i.f10304a;
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            androidx.compose.ui.h hVarF112 = c0949i112.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                            z13 = false;
                            BoxKt.a(hVarF112, c1086gP, 0);
                            z12 = true;
                            c1086gP.T(true);
                            p293xa.r rVar111111117 = p293xa.r.f47939a;
                        }
                        c1086gP.T(z13);
                        pVar8 = pVar7;
                    } else {
                        str4 = str4;
                        str3 = str3;
                        z12 = true;
                        if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                            c1086gP.L(861667097);
                            c1086gP.T(false);
                            throw new NoWhenBranchMatchedException();
                        }
                        c1086gP.L(943331838);
                        pVar8 = pVar7;
                        TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                        c1086gP.T(false);
                        p293xa.r rVar111111118 = p293xa.r.f47939a;
                    }
                }
                c1086gP.T(z12);
                aVar4 = aVar13;
                num7 = num6;
                pVar9 = pVar8;
                hVar7 = hVar5;
                str6 = str4;
                num8 = num5;
                str7 = str3;
                homeItemBadge3 = homeItemBadge2;
                hVar8 = hVar1110;
            } else {
                hVar6 = hVar4;
            }
            J4.i.d(i26, c1086gP, i26, pVar5);
            pVar6 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar6, c1086gP, hVarC111116);
            if (2.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement12 = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
            num5 = num3;
            C0953m c0953mA12 = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
            i27 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P1111112 = c1086gP.P();
            androidx.compose.ui.h hVarC1111112 = ComposedModifierKt.c(c1086gP, layoutWeightElement12);
            c1086gP.r();
            pVar7 = pVarM92getLambda1$intercom_sdk_base_release;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(pVar3, c1086gP, c0953mA12);
            R0.a(pVar4, c1086gP, interfaceC1089h0P1111112);
            if (c1086gP.f12995O) {
                J4.i.d(i27, c1086gP, i27, pVar5);
            } else {
                J4.i.d(i27, c1086gP, i27, pVar5);
            }
            R0.a(pVar6, c1086gP, hVarC1111112);
            c1086gP.L(-1379228937);
            if (num4 != null) {
                strP = S4.o.p(c1086gP, num4.intValue());
            } else {
                if (str3 == null) {
                    strP = "";
                } else {
                    str5 = str3;
                }
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i28 = IntercomTheme.$stable;
                androidx.compose.ui.h hVar1111 = hVar6;
                TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                c1086gP.L(-1379221164);
                if (str4 != null) {
                    TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                    c1086gP.L(941879891);
                    androidx.compose.foundation.layout.T tA119 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                    i30 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P1111113 = c1086gP.P();
                    androidx.compose.ui.h hVarC1111113 = ComposedModifierKt.c(c1086gP, aVar2);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar3, c1086gP, tA119);
                    R0.a(pVar4, c1086gP, interfaceC1089h0P1111113);
                    if (c1086gP.f12995O) {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    } else {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    }
                    R0.a(pVar6, c1086gP, hVarC1111113);
                    pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                    c1086gP.L(-1379205196);
                    if (num5 != null) {
                        IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                        p293xa.r rVar111111119 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.T(false);
                    p293xa.r rVar1111111110 = p293xa.r.f47939a;
                    num6 = num4;
                    str4 = str4;
                    str3 = str3;
                    pVar8 = pVar7;
                    z12 = true;
                } else {
                    num6 = num4;
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        c1086gP.L(942534549);
                        if (num5 == null) {
                            z12 = true;
                            z13 = false;
                        } else {
                            androidx.compose.ui.layout.E eD113 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i29 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P1111114 = c1086gP.P();
                            androidx.compose.ui.h hVarC1111114 = ComposedModifierKt.c(c1086gP, aVar2);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar3, c1086gP, eD113);
                            R0.a(pVar4, c1086gP, interfaceC1089h0P1111114);
                            if (c1086gP.f12995O) {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            } else {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            }
                            R0.a(pVar6, c1086gP, hVarC1111114);
                            C0949i c0949i113 = C0949i.f10304a;
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            androidx.compose.ui.h hVarF113 = c0949i113.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                            z13 = false;
                            BoxKt.a(hVarF113, c1086gP, 0);
                            z12 = true;
                            c1086gP.T(true);
                            p293xa.r rVar1111111111 = p293xa.r.f47939a;
                        }
                        c1086gP.T(z13);
                        pVar8 = pVar7;
                    } else {
                        str4 = str4;
                        str3 = str3;
                        z12 = true;
                        if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                            c1086gP.L(861667097);
                            c1086gP.T(false);
                            throw new NoWhenBranchMatchedException();
                        }
                        c1086gP.L(943331838);
                        pVar8 = pVar7;
                        TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                        c1086gP.T(false);
                        p293xa.r rVar1111111112 = p293xa.r.f47939a;
                    }
                }
                c1086gP.T(z12);
                aVar4 = aVar13;
                num7 = num6;
                pVar9 = pVar8;
                hVar7 = hVar5;
                str6 = str4;
                num8 = num5;
                str7 = str3;
                homeItemBadge3 = homeItemBadge2;
                hVar8 = hVar1111;
            }
            str5 = strP;
            c1086gP.T(false);
            intercomTheme = IntercomTheme.INSTANCE;
            i28 = IntercomTheme.$stable;
            androidx.compose.ui.h hVar1112 = hVar6;
            TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
            c1086gP.L(-1379221164);
            if (str4 != null) {
                TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                c1086gP.L(941879891);
                androidx.compose.foundation.layout.T tA1110 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                i30 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111115 = c1086gP.P();
                androidx.compose.ui.h hVarC1111115 = ComposedModifierKt.c(c1086gP, aVar2);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar3, c1086gP, tA1110);
                R0.a(pVar4, c1086gP, interfaceC1089h0P1111115);
                if (c1086gP.f12995O) {
                    J4.i.d(i30, c1086gP, i30, pVar5);
                } else {
                    J4.i.d(i30, c1086gP, i30, pVar5);
                }
                R0.a(pVar6, c1086gP, hVarC1111115);
                pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                c1086gP.L(-1379205196);
                if (num5 != null) {
                    IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                    p293xa.r rVar1111111113 = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.T(false);
                p293xa.r rVar1111111114 = p293xa.r.f47939a;
                num6 = num4;
                str4 = str4;
                str3 = str3;
                pVar8 = pVar7;
                z12 = true;
            } else {
                num6 = num4;
                if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                    c1086gP.L(942534549);
                    if (num5 == null) {
                        z12 = true;
                        z13 = false;
                    } else {
                        androidx.compose.ui.layout.E eD114 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i29 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111116 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111116 = ComposedModifierKt.c(c1086gP, aVar2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar3, c1086gP, eD114);
                        R0.a(pVar4, c1086gP, interfaceC1089h0P1111116);
                        if (c1086gP.f12995O) {
                            J4.i.d(i29, c1086gP, i29, pVar5);
                        } else {
                            J4.i.d(i29, c1086gP, i29, pVar5);
                        }
                        R0.a(pVar6, c1086gP, hVarC1111116);
                        C0949i c0949i114 = C0949i.f10304a;
                        IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                        androidx.compose.ui.h hVarF114 = c0949i114.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                        z13 = false;
                        BoxKt.a(hVarF114, c1086gP, 0);
                        z12 = true;
                        c1086gP.T(true);
                        p293xa.r rVar1111111115 = p293xa.r.f47939a;
                    }
                    c1086gP.T(z13);
                    pVar8 = pVar7;
                } else {
                    str4 = str4;
                    str3 = str3;
                    z12 = true;
                    if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                        c1086gP.L(861667097);
                        c1086gP.T(false);
                        throw new NoWhenBranchMatchedException();
                    }
                    c1086gP.L(943331838);
                    pVar8 = pVar7;
                    TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                    c1086gP.T(false);
                    p293xa.r rVar1111111116 = p293xa.r.f47939a;
                }
            }
            c1086gP.T(z12);
            aVar4 = aVar13;
            num7 = num6;
            pVar9 = pVar8;
            hVar7 = hVar5;
            str6 = str4;
            num8 = num5;
            str7 = str3;
            homeItemBadge3 = homeItemBadge2;
            hVar8 = hVar1112;
        } else {
            aVar2 = androidx.compose.ui.h.a.f13984b;
            if (i31 != 0) {
                hVar4 = aVar2;
            } else {
                hVar4 = hVar3;
            }
            if (i32 != 0) {
                num3 = null;
            }
            if (i34 != 0) {
                pVarM92getLambda1$intercom_sdk_base_release = ComposableSingletons$HomeItemKt.INSTANCE.m92getLambda1$intercom_sdk_base_release();
            } else {
                pVarM92getLambda1$intercom_sdk_base_release = pVar2;
            }
            if (i13 != 0) {
                hVarM = androidx.compose.foundation.layout.W.m(aVar2, 16);
            } else {
                hVarM = hVar2;
            }
            if (i15 != 0) {
                num4 = null;
            }
            if (i17 != 0) {
                str3 = null;
            }
            if (i19 != 0) {
                str4 = null;
            }
            if (i21 != 0) {
                homeItemBadge2 = HomeItemBadge.None.INSTANCE;
            } else {
                homeItemBadge2 = homeItemBadge;
            }
            if (i23 != 0) {
                c2299p0 = new C2299p0();
            } else {
                c2299p0 = aVar;
            }
            androidx.compose.ui.h hVarD7 = androidx.compose.foundation.layout.W.d(hVar4, 1.0f);
            c1086gP.L(-244013531);
            if ((i25 & 234881024) == 67108864) {
                z10 = true;
            } else {
                z10 = false;
            }
            objF = c1086gP.f();
            if (z10) {
                z11 = false;
                objF = new q0(0 == true ? 1 : 0, c2299p0);
                c1086gP.E(objF);
            } else {
                z11 = false;
                objF = new q0(0 == true ? 1 : 0, c2299p0);
                c1086gP.E(objF);
            }
            c1086gP.T(z11);
            hVar5 = hVarM;
            Ia.a<p293xa.r> aVar14 = c2299p0;
            androidx.compose.ui.h hVarG7 = PaddingKt.g(16, 12, ClickableKt.c(hVarD7, z11, null, (Ia.a) objF, 7));
            bVar = androidx.compose.ui.d.a.f13344k;
            androidx.compose.foundation.layout.T tA1111 = androidx.compose.foundation.layout.S.a(C0945e.f10284a, bVar, c1086gP, 48);
            i26 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P1111117 = c1086gP.P();
            androidx.compose.ui.h hVarC1111117 = ComposedModifierKt.c(c1086gP, hVarG7);
            ComposeUiNode.f14331c0.getClass();
            aVar3 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            pVar3 = ComposeUiNode.Companion.f14337f;
            R0.a(pVar3, c1086gP, tA1111);
            pVar4 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar4, c1086gP, interfaceC1089h0P1111117);
            pVar5 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                hVar6 = hVar4;
                if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i26))) {
                }
                pVar6 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar6, c1086gP, hVarC1111117);
                if (2.0f <= 0.0d) {
                    p258v.a.a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement13 = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
                num5 = num3;
                C0953m c0953mA13 = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
                i27 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P1111118 = c1086gP.P();
                androidx.compose.ui.h hVarC1111118 = ComposedModifierKt.c(c1086gP, layoutWeightElement13);
                c1086gP.r();
                pVar7 = pVarM92getLambda1$intercom_sdk_base_release;
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar3, c1086gP, c0953mA13);
                R0.a(pVar4, c1086gP, interfaceC1089h0P1111118);
                if (c1086gP.f12995O) {
                    J4.i.d(i27, c1086gP, i27, pVar5);
                } else {
                    J4.i.d(i27, c1086gP, i27, pVar5);
                }
                R0.a(pVar6, c1086gP, hVarC1111118);
                c1086gP.L(-1379228937);
                if (num4 != null) {
                    strP = S4.o.p(c1086gP, num4.intValue());
                } else {
                    if (str3 == null) {
                        strP = "";
                    } else {
                        str5 = str3;
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i28 = IntercomTheme.$stable;
                    androidx.compose.ui.h hVar1113 = hVar6;
                    TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                    c1086gP.L(-1379221164);
                    if (str4 != null) {
                        TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                        c1086gP.L(941879891);
                        androidx.compose.foundation.layout.T tA1112 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                        i30 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P1111119 = c1086gP.P();
                        androidx.compose.ui.h hVarC1111119 = ComposedModifierKt.c(c1086gP, aVar2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar3, c1086gP, tA1112);
                        R0.a(pVar4, c1086gP, interfaceC1089h0P1111119);
                        if (c1086gP.f12995O) {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        } else {
                            J4.i.d(i30, c1086gP, i30, pVar5);
                        }
                        R0.a(pVar6, c1086gP, hVarC1111119);
                        pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                        c1086gP.L(-1379205196);
                        if (num5 != null) {
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            p293xa.r rVar1111111117 = p293xa.r.f47939a;
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        c1086gP.T(false);
                        p293xa.r rVar1111111118 = p293xa.r.f47939a;
                        num6 = num4;
                        str4 = str4;
                        str3 = str3;
                        pVar8 = pVar7;
                        z12 = true;
                    } else {
                        num6 = num4;
                        if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                            c1086gP.L(942534549);
                            if (num5 == null) {
                                z12 = true;
                                z13 = false;
                            } else {
                                androidx.compose.ui.layout.E eD115 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                                i29 = c1086gP.f12996P;
                                InterfaceC1089h0 interfaceC1089h0P11111110 = c1086gP.P();
                                androidx.compose.ui.h hVarC11111110 = ComposedModifierKt.c(c1086gP, aVar2);
                                c1086gP.r();
                                if (c1086gP.f12995O) {
                                    c1086gP.v(aVar3);
                                } else {
                                    c1086gP.A();
                                }
                                R0.a(pVar3, c1086gP, eD115);
                                R0.a(pVar4, c1086gP, interfaceC1089h0P11111110);
                                if (c1086gP.f12995O) {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                } else {
                                    J4.i.d(i29, c1086gP, i29, pVar5);
                                }
                                R0.a(pVar6, c1086gP, hVarC11111110);
                                C0949i c0949i115 = C0949i.f10304a;
                                IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                                androidx.compose.ui.h hVarF115 = c0949i115.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                                z13 = false;
                                BoxKt.a(hVarF115, c1086gP, 0);
                                z12 = true;
                                c1086gP.T(true);
                                p293xa.r rVar1111111119 = p293xa.r.f47939a;
                            }
                            c1086gP.T(z13);
                            pVar8 = pVar7;
                        } else {
                            str4 = str4;
                            str3 = str3;
                            z12 = true;
                            if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                                c1086gP.L(861667097);
                                c1086gP.T(false);
                                throw new NoWhenBranchMatchedException();
                            }
                            c1086gP.L(943331838);
                            pVar8 = pVar7;
                            TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                            c1086gP.T(false);
                            p293xa.r rVar11111111110 = p293xa.r.f47939a;
                        }
                    }
                    c1086gP.T(z12);
                    aVar4 = aVar14;
                    num7 = num6;
                    pVar9 = pVar8;
                    hVar7 = hVar5;
                    str6 = str4;
                    num8 = num5;
                    str7 = str3;
                    homeItemBadge3 = homeItemBadge2;
                    hVar8 = hVar1113;
                }
                str5 = strP;
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i28 = IntercomTheme.$stable;
                androidx.compose.ui.h hVar1114 = hVar6;
                TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                c1086gP.L(-1379221164);
                if (str4 != null) {
                    TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                    c1086gP.L(941879891);
                    androidx.compose.foundation.layout.T tA1113 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                    i30 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111111 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111111 = ComposedModifierKt.c(c1086gP, aVar2);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar3, c1086gP, tA1113);
                    R0.a(pVar4, c1086gP, interfaceC1089h0P11111111);
                    if (c1086gP.f12995O) {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    } else {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    }
                    R0.a(pVar6, c1086gP, hVarC11111111);
                    pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                    c1086gP.L(-1379205196);
                    if (num5 != null) {
                        IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                        p293xa.r rVar11111111111 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.T(false);
                    p293xa.r rVar11111111112 = p293xa.r.f47939a;
                    num6 = num4;
                    str4 = str4;
                    str3 = str3;
                    pVar8 = pVar7;
                    z12 = true;
                } else {
                    num6 = num4;
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        c1086gP.L(942534549);
                        if (num5 == null) {
                            z12 = true;
                            z13 = false;
                        } else {
                            androidx.compose.ui.layout.E eD116 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i29 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P11111112 = c1086gP.P();
                            androidx.compose.ui.h hVarC11111112 = ComposedModifierKt.c(c1086gP, aVar2);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar3, c1086gP, eD116);
                            R0.a(pVar4, c1086gP, interfaceC1089h0P11111112);
                            if (c1086gP.f12995O) {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            } else {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            }
                            R0.a(pVar6, c1086gP, hVarC11111112);
                            C0949i c0949i116 = C0949i.f10304a;
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            androidx.compose.ui.h hVarF116 = c0949i116.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                            z13 = false;
                            BoxKt.a(hVarF116, c1086gP, 0);
                            z12 = true;
                            c1086gP.T(true);
                            p293xa.r rVar11111111113 = p293xa.r.f47939a;
                        }
                        c1086gP.T(z13);
                        pVar8 = pVar7;
                    } else {
                        str4 = str4;
                        str3 = str3;
                        z12 = true;
                        if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                            c1086gP.L(861667097);
                            c1086gP.T(false);
                            throw new NoWhenBranchMatchedException();
                        }
                        c1086gP.L(943331838);
                        pVar8 = pVar7;
                        TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                        c1086gP.T(false);
                        p293xa.r rVar11111111114 = p293xa.r.f47939a;
                    }
                }
                c1086gP.T(z12);
                aVar4 = aVar14;
                num7 = num6;
                pVar9 = pVar8;
                hVar7 = hVar5;
                str6 = str4;
                num8 = num5;
                str7 = str3;
                homeItemBadge3 = homeItemBadge2;
                hVar8 = hVar1114;
            } else {
                hVar6 = hVar4;
            }
            J4.i.d(i26, c1086gP, i26, pVar5);
            pVar6 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar6, c1086gP, hVarC1111117);
            if (2.0f <= 0.0d) {
                p258v.a.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement14 = new LayoutWeightElement(true, Na.l.z(2.0f, Float.MAX_VALUE));
            num5 = num3;
            C0953m c0953mA14 = C0952l.a(C0945e.g(4), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
            i27 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P11111113 = c1086gP.P();
            androidx.compose.ui.h hVarC11111113 = ComposedModifierKt.c(c1086gP, layoutWeightElement14);
            c1086gP.r();
            pVar7 = pVarM92getLambda1$intercom_sdk_base_release;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar3);
            } else {
                c1086gP.A();
            }
            R0.a(pVar3, c1086gP, c0953mA14);
            R0.a(pVar4, c1086gP, interfaceC1089h0P11111113);
            if (c1086gP.f12995O) {
                J4.i.d(i27, c1086gP, i27, pVar5);
            } else {
                J4.i.d(i27, c1086gP, i27, pVar5);
            }
            R0.a(pVar6, c1086gP, hVarC11111113);
            c1086gP.L(-1379228937);
            if (num4 != null) {
                strP = S4.o.p(c1086gP, num4.intValue());
            } else {
                if (str3 == null) {
                    strP = "";
                } else {
                    str5 = str3;
                }
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i28 = IntercomTheme.$stable;
                androidx.compose.ui.h hVar1115 = hVar6;
                TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
                c1086gP.L(-1379221164);
                if (str4 != null) {
                    TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                    c1086gP.L(941879891);
                    androidx.compose.foundation.layout.T tA1114 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                    i30 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11111114 = c1086gP.P();
                    androidx.compose.ui.h hVarC11111114 = ComposedModifierKt.c(c1086gP, aVar2);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar3);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar3, c1086gP, tA1114);
                    R0.a(pVar4, c1086gP, interfaceC1089h0P11111114);
                    if (c1086gP.f12995O) {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    } else {
                        J4.i.d(i30, c1086gP, i30, pVar5);
                    }
                    R0.a(pVar6, c1086gP, hVarC11111114);
                    pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                    c1086gP.L(-1379205196);
                    if (num5 != null) {
                        IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                        p293xa.r rVar11111111115 = p293xa.r.f47939a;
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    c1086gP.T(false);
                    p293xa.r rVar11111111116 = p293xa.r.f47939a;
                    num6 = num4;
                    str4 = str4;
                    str3 = str3;
                    pVar8 = pVar7;
                    z12 = true;
                } else {
                    num6 = num4;
                    if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                        c1086gP.L(942534549);
                        if (num5 == null) {
                            z12 = true;
                            z13 = false;
                        } else {
                            androidx.compose.ui.layout.E eD117 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                            i29 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P11111115 = c1086gP.P();
                            androidx.compose.ui.h hVarC11111115 = ComposedModifierKt.c(c1086gP, aVar2);
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar3);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(pVar3, c1086gP, eD117);
                            R0.a(pVar4, c1086gP, interfaceC1089h0P11111115);
                            if (c1086gP.f12995O) {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            } else {
                                J4.i.d(i29, c1086gP, i29, pVar5);
                            }
                            R0.a(pVar6, c1086gP, hVarC11111115);
                            C0949i c0949i117 = C0949i.f10304a;
                            IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                            androidx.compose.ui.h hVarF117 = c0949i117.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                            z13 = false;
                            BoxKt.a(hVarF117, c1086gP, 0);
                            z12 = true;
                            c1086gP.T(true);
                            p293xa.r rVar11111111117 = p293xa.r.f47939a;
                        }
                        c1086gP.T(z13);
                        pVar8 = pVar7;
                    } else {
                        str4 = str4;
                        str3 = str3;
                        z12 = true;
                        if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                            c1086gP.L(861667097);
                            c1086gP.T(false);
                            throw new NoWhenBranchMatchedException();
                        }
                        c1086gP.L(943331838);
                        pVar8 = pVar7;
                        TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                        c1086gP.T(false);
                        p293xa.r rVar11111111118 = p293xa.r.f47939a;
                    }
                }
                c1086gP.T(z12);
                aVar4 = aVar14;
                num7 = num6;
                pVar9 = pVar8;
                hVar7 = hVar5;
                str6 = str4;
                num8 = num5;
                str7 = str3;
                homeItemBadge3 = homeItemBadge2;
                hVar8 = hVar1115;
            }
            str5 = strP;
            c1086gP.T(false);
            intercomTheme = IntercomTheme.INSTANCE;
            i28 = IntercomTheme.$stable;
            androidx.compose.ui.h hVar1116 = hVar6;
            TextKt.b(str5, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04SemiBold(), c1086gP, 0, 3120, 55294);
            c1086gP.L(-1379221164);
            if (str4 != null) {
                TextKt.b(str4, null, Q3.d.e(4285887861L), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i28).getType04(), c1086gP, ((i25 >> 18) & 14) | 384, 0, 65530);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.None.INSTANCE)) {
                c1086gP.L(941879891);
                androidx.compose.foundation.layout.T tA1115 = androidx.compose.foundation.layout.S.a(C0945e.g(8), bVar, c1086gP, 54);
                i30 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P11111116 = c1086gP.P();
                androidx.compose.ui.h hVarC11111116 = ComposedModifierKt.c(c1086gP, aVar2);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar3);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar3, c1086gP, tA1115);
                R0.a(pVar4, c1086gP, interfaceC1089h0P11111116);
                if (c1086gP.f12995O) {
                    J4.i.d(i30, c1086gP, i30, pVar5);
                } else {
                    J4.i.d(i30, c1086gP, i30, pVar5);
                }
                R0.a(pVar6, c1086gP, hVarC11111116);
                pVar7.invoke(c1086gP, Integer.valueOf((i25 >> 6) & 14));
                c1086gP.L(-1379205196);
                if (num5 != null) {
                    IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(hVar5, num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                    p293xa.r rVar11111111119 = p293xa.r.f47939a;
                }
                c1086gP.T(false);
                c1086gP.T(true);
                c1086gP.T(false);
                p293xa.r rVar111111111110 = p293xa.r.f47939a;
                num6 = num4;
                str4 = str4;
                str3 = str3;
                pVar8 = pVar7;
                z12 = true;
            } else {
                num6 = num4;
                if (kotlin.jvm.internal.i.a(homeItemBadge2, HomeItemBadge.IconWithIndicator.INSTANCE)) {
                    c1086gP.L(942534549);
                    if (num5 == null) {
                        z12 = true;
                        z13 = false;
                    } else {
                        androidx.compose.ui.layout.E eD118 = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
                        i29 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P11111117 = c1086gP.P();
                        androidx.compose.ui.h hVarC11111117 = ComposedModifierKt.c(c1086gP, aVar2);
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar3);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(pVar3, c1086gP, eD118);
                        R0.a(pVar4, c1086gP, interfaceC1089h0P11111117);
                        if (c1086gP.f12995O) {
                            J4.i.d(i29, c1086gP, i29, pVar5);
                        } else {
                            J4.i.d(i29, c1086gP, i29, pVar5);
                        }
                        R0.a(pVar6, c1086gP, hVarC11111117);
                        C0949i c0949i118 = C0949i.f10304a;
                        IconKt.a(U.c.a(num5.intValue(), c1086gP, (i25 >> 3) & 14), null, androidx.compose.ui.platform.N0.a(A8.p.r(hVar5, new CutIconWithIndicatorShape(0.0f, 1, null)), num5.toString()), intercomTheme.getColors(c1086gP, i28).m616getActionContrastWhite0d7_KjU(), c1086gP, 56, 0);
                        androidx.compose.ui.h hVarF118 = c0949i118.f(androidx.compose.foundation.layout.W.m(C0932d.b(aVar2, Q3.d.e(4292544041L), p270w.g.f47680a), 7), androidx.compose.ui.d.a.f13337c);
                        z13 = false;
                        BoxKt.a(hVarF118, c1086gP, 0);
                        z12 = true;
                        c1086gP.T(true);
                        p293xa.r rVar111111111111 = p293xa.r.f47939a;
                    }
                    c1086gP.T(z13);
                    pVar8 = pVar7;
                } else {
                    str4 = str4;
                    str3 = str3;
                    z12 = true;
                    if (homeItemBadge2 instanceof HomeItemBadge.IndicatorWithCount) {
                        c1086gP.L(861667097);
                        c1086gP.T(false);
                        throw new NoWhenBranchMatchedException();
                    }
                    c1086gP.L(943331838);
                    pVar8 = pVar7;
                    TextKt.b(String.valueOf(((HomeItemBadge.IndicatorWithCount) homeItemBadge2).getCount()), androidx.compose.ui.draw.f.a(PaddingKt.j(aVar2, 0.0f, 0.0f, 6, 0.0f, 11), new r0(0)).i(new VerticalAlignElement(bVar)), androidx.compose.ui.graphics.H.f13499f, G0.a.g(11), null, androidx.compose.ui.text.font.l.f15440e, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c1086gP, 200064, 0, 131024);
                    c1086gP.T(false);
                    p293xa.r rVar111111111112 = p293xa.r.f47939a;
                }
            }
            c1086gP.T(z12);
            aVar4 = aVar14;
            num7 = num6;
            pVar9 = pVar8;
            hVar7 = hVar5;
            str6 = str4;
            num8 = num5;
            str7 = str3;
            homeItemBadge3 = homeItemBadge2;
            hVar8 = hVar1116;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final Ia.a aVar15 = aVar4;
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.s0
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeItemKt.HomeItem$lambda$10(hVar8, num8, pVar9, hVar7, num7, str7, str6, homeItemBadge3, aVar15, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HomeItem$lambda$10(androidx.compose.ui.h hVar, Integer num, Ia.p pVar, androidx.compose.ui.h hVar2, Integer num2, String str, String str2, HomeItemBadge homeItemBadge, Ia.a aVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        HomeItem(hVar, num, pVar, hVar2, num2, str, str2, homeItemBadge, aVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HomeItem$lambda$2$lambda$1(Ia.a aVar) {
        aVar.invoke();
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HomeItem$lambda$9$lambda$8(J.e drawBehind) {
        kotlin.jvm.internal.i.e(drawBehind, "$this$drawBehind");
        drawBehind.S(Q3.d.e(4292544041L), (R.styleable.AppCompatTheme_windowFixedWidthMajor & 2) != 0 ? I.h.c(drawBehind.j()) / 2.0f : 22.0f, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 4) != 0 ? drawBehind.j1() : 0L, 1.0f, J.h.f3954a, null, (R.styleable.AppCompatTheme_windowFixedWidthMajor & 64) != 0 ? 3 : 0);
        return p293xa.r.f47939a;
    }

    private static final void HomeMessagesPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1318695433);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.m96getLambda5$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2293m0(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HomeMessagesPreview$lambda$12(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HomeMessagesPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    private static final void HomeSendMessagePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(861055120);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.m94getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2295n0(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HomeSendMessagePreview$lambda$11(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HomeSendMessagePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    private static final void HomeTicketsPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-279860840);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.m98getLambda7$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new J(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HomeTicketsPreview$lambda$13(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HomeTicketsPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    private static final void HomeTicketsRTLPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1844314002);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeItemKt.INSTANCE.m100getLambda9$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2297o0(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r HomeTicketsRTLPreview$lambda$14(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HomeTicketsRTLPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
