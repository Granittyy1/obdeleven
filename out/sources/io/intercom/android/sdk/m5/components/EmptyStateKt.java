package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: EmptyState.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class EmptyStateKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0250  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:82:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x011e  */
    /* JADX WARN: Code duplicated, block: B:87:0x012f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0133  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:97:0x0229  */
    public static final void EmptyState(final String title, androidx.compose.ui.h hVar, String str, Integer num, Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        int i13;
        String str2;
        int i14;
        int i15;
        Integer num2;
        int i16;
        int i17;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar2;
        int i18;
        androidx.compose.ui.h.a aVar;
        androidx.compose.ui.h hVar3;
        String str3;
        Integer num3;
        int i19;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3;
        IntercomTheme intercomTheme;
        int i20;
        Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar4;
        androidx.compose.ui.h.a aVar3;
        final Ia.p<? super InterfaceC1084f, ? super Integer, p293xa.r> pVar5;
        final String str4;
        final Integer num4;
        final androidx.compose.ui.h hVar4;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(title, "title");
        C1086g c1086gP = interfaceC1084f.p(728499887);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(title) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
            if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    str2 = str;
                    if (c1086gP.K(str2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        num2 = num;
                        if (c1086gP.K(num2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((57344 & i10) == 0) {
                            pVar2 = pVar;
                            if (c1086gP.k(pVar2)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((46811 & i12) == 9362 || !c1086gP.s()) {
                            aVar = androidx.compose.ui.h.a.f13984b;
                            if (i21 != 0) {
                                hVar3 = aVar;
                            } else {
                                hVar3 = hVar2;
                            }
                            if (i13 != 0) {
                                str3 = null;
                            } else {
                                str3 = str2;
                            }
                            if (i15 != 0) {
                                num3 = null;
                            } else {
                                num3 = num2;
                            }
                            if (i17 != 0) {
                                pVar2 = null;
                            }
                            androidx.compose.ui.h hVarI = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                            C0953m c0953mA = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                            i19 = c1086gP.f12996P;
                            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarI);
                            ComposeUiNode.f14331c0.getClass();
                            aVar2 = ComposeUiNode.Companion.f14333b;
                            c1086gP.r();
                            if (c1086gP.f12995O) {
                                c1086gP.v(aVar2);
                            } else {
                                c1086gP.A();
                            }
                            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
                            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
                            pVar3 = ComposeUiNode.Companion.f14338g;
                            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i19))) {
                                J4.i.d(i19, c1086gP, i19, pVar3);
                            }
                            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                            c1086gP.L(-1239346793);
                            if (num3 != null) {
                                IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                            }
                            c1086gP.T(false);
                            intercomTheme = IntercomTheme.INSTANCE;
                            i20 = IntercomTheme.$stable;
                            pVar4 = pVar2;
                            androidx.compose.ui.h hVar5 = hVar3;
                            TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                            c1086gP.L(-1239330071);
                            if (str3 == null) {
                                c1086gP = c1086gP;
                                aVar3 = aVar;
                            } else {
                                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                                aVar3 = aVar;
                                TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                                c1086gP = c1086gP;
                            }
                            c1086gP.T(false);
                            c1086gP.L(-1239320282);
                            if (pVar4 != null) {
                                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                                pVar4.invoke(c1086gP, 0);
                            }
                            c1086gP.T(false);
                            c1086gP.T(true);
                            pVar5 = pVar4;
                            str4 = str3;
                            num4 = num3;
                            hVar4 = hVar5;
                        } else {
                            c1086gP.w();
                            hVar4 = hVar2;
                            str4 = str2;
                            num4 = num2;
                            pVar5 = pVar2;
                        }
                        c1105p0V = c1086gP.V();
                        if (c1105p0V != null) {
                            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                                @Override // Ia.p
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                                }
                            };
                        }
                    }
                    i12 |= 24576;
                    pVar2 = pVar;
                    if ((46811 & i12) == 9362) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        androidx.compose.ui.h hVarI2 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                        C0953m c0953mA2 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                        i19 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                        androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarI2);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA2);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P2);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        } else {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                        c1086gP.L(-1239346793);
                        if (num3 != null) {
                            IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                        }
                        c1086gP.T(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i20 = IntercomTheme.$stable;
                        pVar4 = pVar2;
                        androidx.compose.ui.h hVar6 = hVar3;
                        TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                        c1086gP.L(-1239330071);
                        if (str3 == null) {
                            c1086gP = c1086gP;
                            aVar3 = aVar;
                        } else {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                            aVar3 = aVar;
                            TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                            c1086gP = c1086gP;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-1239320282);
                        if (pVar4 != null) {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                            pVar4.invoke(c1086gP, 0);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        pVar5 = pVar4;
                        str4 = str3;
                        num4 = num3;
                        hVar4 = hVar6;
                    } else {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        androidx.compose.ui.h hVarI3 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                        C0953m c0953mA3 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                        i19 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarI3);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA3);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P3);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        } else {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                        c1086gP.L(-1239346793);
                        if (num3 != null) {
                            IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                        }
                        c1086gP.T(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i20 = IntercomTheme.$stable;
                        pVar4 = pVar2;
                        androidx.compose.ui.h hVar7 = hVar3;
                        TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                        c1086gP.L(-1239330071);
                        if (str3 == null) {
                            c1086gP = c1086gP;
                            aVar3 = aVar;
                        } else {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                            aVar3 = aVar;
                            TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                            c1086gP = c1086gP;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-1239320282);
                        if (pVar4 != null) {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                            pVar4.invoke(c1086gP, 0);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        pVar5 = pVar4;
                        str4 = str3;
                        num4 = num3;
                        hVar4 = hVar7;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 3072;
                num2 = num;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        pVar2 = pVar;
                        if (c1086gP.k(pVar2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((46811 & i12) == 9362) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        androidx.compose.ui.h hVarI4 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                        C0953m c0953mA4 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                        i19 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                        androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarI4);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA4);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P4);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        } else {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                        c1086gP.L(-1239346793);
                        if (num3 != null) {
                            IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                        }
                        c1086gP.T(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i20 = IntercomTheme.$stable;
                        pVar4 = pVar2;
                        androidx.compose.ui.h hVar8 = hVar3;
                        TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                        c1086gP.L(-1239330071);
                        if (str3 == null) {
                            c1086gP = c1086gP;
                            aVar3 = aVar;
                        } else {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                            aVar3 = aVar;
                            TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                            c1086gP = c1086gP;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-1239320282);
                        if (pVar4 != null) {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                            pVar4.invoke(c1086gP, 0);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        pVar5 = pVar4;
                        str4 = str3;
                        num4 = num3;
                        hVar4 = hVar8;
                    } else {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        androidx.compose.ui.h hVarI5 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                        C0953m c0953mA5 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                        i19 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                        androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarI5);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA5);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P5);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        } else {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                        c1086gP.L(-1239346793);
                        if (num3 != null) {
                            IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                        }
                        c1086gP.T(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i20 = IntercomTheme.$stable;
                        pVar4 = pVar2;
                        androidx.compose.ui.h hVar9 = hVar3;
                        TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                        c1086gP.L(-1239330071);
                        if (str3 == null) {
                            c1086gP = c1086gP;
                            aVar3 = aVar;
                        } else {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                            aVar3 = aVar;
                            TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                            c1086gP = c1086gP;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-1239320282);
                        if (pVar4 != null) {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                            pVar4.invoke(c1086gP, 0);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        pVar5 = pVar4;
                        str4 = str3;
                        num4 = num3;
                        hVar4 = hVar9;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 24576;
                pVar2 = pVar;
                if ((46811 & i12) == 9362) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    androidx.compose.ui.h hVarI6 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                    C0953m c0953mA6 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                    androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarI6);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA6);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P6);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
                    c1086gP.L(-1239346793);
                    if (num3 != null) {
                        IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i20 = IntercomTheme.$stable;
                    pVar4 = pVar2;
                    androidx.compose.ui.h hVar10 = hVar3;
                    TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                    c1086gP.L(-1239330071);
                    if (str3 == null) {
                        c1086gP = c1086gP;
                        aVar3 = aVar;
                    } else {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                        aVar3 = aVar;
                        TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                        c1086gP = c1086gP;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-1239320282);
                    if (pVar4 != null) {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                        pVar4.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    pVar5 = pVar4;
                    str4 = str3;
                    num4 = num3;
                    hVar4 = hVar10;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    androidx.compose.ui.h hVarI7 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                    C0953m c0953mA7 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
                    androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarI7);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA7);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P7);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
                    c1086gP.L(-1239346793);
                    if (num3 != null) {
                        IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i20 = IntercomTheme.$stable;
                    pVar4 = pVar2;
                    androidx.compose.ui.h hVar11 = hVar3;
                    TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                    c1086gP.L(-1239330071);
                    if (str3 == null) {
                        c1086gP = c1086gP;
                        aVar3 = aVar;
                    } else {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                        aVar3 = aVar;
                        TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                        c1086gP = c1086gP;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-1239320282);
                    if (pVar4 != null) {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                        pVar4.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    pVar5 = pVar4;
                    str4 = str3;
                    num4 = num3;
                    hVar4 = hVar11;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 384;
            str2 = str;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    num2 = num;
                    if (c1086gP.K(num2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        pVar2 = pVar;
                        if (c1086gP.k(pVar2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((46811 & i12) == 9362) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        androidx.compose.ui.h hVarI8 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                        C0953m c0953mA8 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                        i19 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
                        androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarI8);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA8);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P8);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        } else {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC8);
                        c1086gP.L(-1239346793);
                        if (num3 != null) {
                            IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                        }
                        c1086gP.T(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i20 = IntercomTheme.$stable;
                        pVar4 = pVar2;
                        androidx.compose.ui.h hVar12 = hVar3;
                        TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                        c1086gP.L(-1239330071);
                        if (str3 == null) {
                            c1086gP = c1086gP;
                            aVar3 = aVar;
                        } else {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                            aVar3 = aVar;
                            TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                            c1086gP = c1086gP;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-1239320282);
                        if (pVar4 != null) {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                            pVar4.invoke(c1086gP, 0);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        pVar5 = pVar4;
                        str4 = str3;
                        num4 = num3;
                        hVar4 = hVar12;
                    } else {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        androidx.compose.ui.h hVarI9 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                        C0953m c0953mA9 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                        i19 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                        androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, hVarI9);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA9);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P9);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        } else {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC9);
                        c1086gP.L(-1239346793);
                        if (num3 != null) {
                            IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                        }
                        c1086gP.T(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i20 = IntercomTheme.$stable;
                        pVar4 = pVar2;
                        androidx.compose.ui.h hVar13 = hVar3;
                        TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                        c1086gP.L(-1239330071);
                        if (str3 == null) {
                            c1086gP = c1086gP;
                            aVar3 = aVar;
                        } else {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                            aVar3 = aVar;
                            TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                            c1086gP = c1086gP;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-1239320282);
                        if (pVar4 != null) {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                            pVar4.invoke(c1086gP, 0);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        pVar5 = pVar4;
                        str4 = str3;
                        num4 = num3;
                        hVar4 = hVar13;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 24576;
                pVar2 = pVar;
                if ((46811 & i12) == 9362) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    androidx.compose.ui.h hVarI10 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                    C0953m c0953mA10 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P10 = c1086gP.P();
                    androidx.compose.ui.h hVarC10 = ComposedModifierKt.c(c1086gP, hVarI10);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA10);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P10);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC10);
                    c1086gP.L(-1239346793);
                    if (num3 != null) {
                        IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i20 = IntercomTheme.$stable;
                    pVar4 = pVar2;
                    androidx.compose.ui.h hVar14 = hVar3;
                    TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                    c1086gP.L(-1239330071);
                    if (str3 == null) {
                        c1086gP = c1086gP;
                        aVar3 = aVar;
                    } else {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                        aVar3 = aVar;
                        TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                        c1086gP = c1086gP;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-1239320282);
                    if (pVar4 != null) {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                        pVar4.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    pVar5 = pVar4;
                    str4 = str3;
                    num4 = num3;
                    hVar4 = hVar14;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    androidx.compose.ui.h hVarI11 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                    C0953m c0953mA11 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P11 = c1086gP.P();
                    androidx.compose.ui.h hVarC11 = ComposedModifierKt.c(c1086gP, hVarI11);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA11);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P11);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC11);
                    c1086gP.L(-1239346793);
                    if (num3 != null) {
                        IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i20 = IntercomTheme.$stable;
                    pVar4 = pVar2;
                    androidx.compose.ui.h hVar15 = hVar3;
                    TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                    c1086gP.L(-1239330071);
                    if (str3 == null) {
                        c1086gP = c1086gP;
                        aVar3 = aVar;
                    } else {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                        aVar3 = aVar;
                        TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                        c1086gP = c1086gP;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-1239320282);
                    if (pVar4 != null) {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                        pVar4.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    pVar5 = pVar4;
                    str4 = str3;
                    num4 = num3;
                    hVar4 = hVar15;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 3072;
            num2 = num;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    pVar2 = pVar;
                    if (c1086gP.k(pVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((46811 & i12) == 9362) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    androidx.compose.ui.h hVarI12 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                    C0953m c0953mA12 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P12 = c1086gP.P();
                    androidx.compose.ui.h hVarC12 = ComposedModifierKt.c(c1086gP, hVarI12);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA12);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P12);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC12);
                    c1086gP.L(-1239346793);
                    if (num3 != null) {
                        IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i20 = IntercomTheme.$stable;
                    pVar4 = pVar2;
                    androidx.compose.ui.h hVar16 = hVar3;
                    TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                    c1086gP.L(-1239330071);
                    if (str3 == null) {
                        c1086gP = c1086gP;
                        aVar3 = aVar;
                    } else {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                        aVar3 = aVar;
                        TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                        c1086gP = c1086gP;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-1239320282);
                    if (pVar4 != null) {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                        pVar4.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    pVar5 = pVar4;
                    str4 = str3;
                    num4 = num3;
                    hVar4 = hVar16;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    androidx.compose.ui.h hVarI13 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                    C0953m c0953mA13 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P13 = c1086gP.P();
                    androidx.compose.ui.h hVarC13 = ComposedModifierKt.c(c1086gP, hVarI13);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA13);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P13);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC13);
                    c1086gP.L(-1239346793);
                    if (num3 != null) {
                        IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i20 = IntercomTheme.$stable;
                    pVar4 = pVar2;
                    androidx.compose.ui.h hVar17 = hVar3;
                    TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                    c1086gP.L(-1239330071);
                    if (str3 == null) {
                        c1086gP = c1086gP;
                        aVar3 = aVar;
                    } else {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                        aVar3 = aVar;
                        TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                        c1086gP = c1086gP;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-1239320282);
                    if (pVar4 != null) {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                        pVar4.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    pVar5 = pVar4;
                    str4 = str3;
                    num4 = num3;
                    hVar4 = hVar17;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 24576;
            pVar2 = pVar;
            if ((46811 & i12) == 9362) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    pVar2 = null;
                }
                androidx.compose.ui.h hVarI14 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                C0953m c0953mA14 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P14 = c1086gP.P();
                androidx.compose.ui.h hVarC14 = ComposedModifierKt.c(c1086gP, hVarI14);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA14);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P14);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC14);
                c1086gP.L(-1239346793);
                if (num3 != null) {
                    IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                }
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i20 = IntercomTheme.$stable;
                pVar4 = pVar2;
                androidx.compose.ui.h hVar18 = hVar3;
                TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                c1086gP.L(-1239330071);
                if (str3 == null) {
                    c1086gP = c1086gP;
                    aVar3 = aVar;
                } else {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                    aVar3 = aVar;
                    TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                    c1086gP = c1086gP;
                }
                c1086gP.T(false);
                c1086gP.L(-1239320282);
                if (pVar4 != null) {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                    pVar4.invoke(c1086gP, 0);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                pVar5 = pVar4;
                str4 = str3;
                num4 = num3;
                hVar4 = hVar18;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    pVar2 = null;
                }
                androidx.compose.ui.h hVarI15 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                C0953m c0953mA15 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P15 = c1086gP.P();
                androidx.compose.ui.h hVarC15 = ComposedModifierKt.c(c1086gP, hVarI15);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA15);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P15);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC15);
                c1086gP.L(-1239346793);
                if (num3 != null) {
                    IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                }
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i20 = IntercomTheme.$stable;
                pVar4 = pVar2;
                androidx.compose.ui.h hVar19 = hVar3;
                TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                c1086gP.L(-1239330071);
                if (str3 == null) {
                    c1086gP = c1086gP;
                    aVar3 = aVar;
                } else {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                    aVar3 = aVar;
                    TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                    c1086gP = c1086gP;
                }
                c1086gP.T(false);
                c1086gP.L(-1239320282);
                if (pVar4 != null) {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                    pVar4.invoke(c1086gP, 0);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                pVar5 = pVar4;
                str4 = str3;
                num4 = num3;
                hVar4 = hVar19;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 48;
        hVar2 = hVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                str2 = str;
                if (c1086gP.K(str2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    num2 = num;
                    if (c1086gP.K(num2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        pVar2 = pVar;
                        if (c1086gP.k(pVar2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((46811 & i12) == 9362) {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        androidx.compose.ui.h hVarI16 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                        C0953m c0953mA16 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                        i19 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P16 = c1086gP.P();
                        androidx.compose.ui.h hVarC16 = ComposedModifierKt.c(c1086gP, hVarI16);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA16);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P16);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        } else {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC16);
                        c1086gP.L(-1239346793);
                        if (num3 != null) {
                            IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                        }
                        c1086gP.T(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i20 = IntercomTheme.$stable;
                        pVar4 = pVar2;
                        androidx.compose.ui.h hVar110 = hVar3;
                        TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                        c1086gP.L(-1239330071);
                        if (str3 == null) {
                            c1086gP = c1086gP;
                            aVar3 = aVar;
                        } else {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                            aVar3 = aVar;
                            TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                            c1086gP = c1086gP;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-1239320282);
                        if (pVar4 != null) {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                            pVar4.invoke(c1086gP, 0);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        pVar5 = pVar4;
                        str4 = str3;
                        num4 = num3;
                        hVar4 = hVar110;
                    } else {
                        aVar = androidx.compose.ui.h.a.f13984b;
                        if (i21 != 0) {
                            hVar3 = aVar;
                        } else {
                            hVar3 = hVar2;
                        }
                        if (i13 != 0) {
                            str3 = null;
                        } else {
                            str3 = str2;
                        }
                        if (i15 != 0) {
                            num3 = null;
                        } else {
                            num3 = num2;
                        }
                        if (i17 != 0) {
                            pVar2 = null;
                        }
                        androidx.compose.ui.h hVarI17 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                        C0953m c0953mA17 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                        i19 = c1086gP.f12996P;
                        InterfaceC1089h0 interfaceC1089h0P17 = c1086gP.P();
                        androidx.compose.ui.h hVarC17 = ComposedModifierKt.c(c1086gP, hVarI17);
                        ComposeUiNode.f14331c0.getClass();
                        aVar2 = ComposeUiNode.Companion.f14333b;
                        c1086gP.r();
                        if (c1086gP.f12995O) {
                            c1086gP.v(aVar2);
                        } else {
                            c1086gP.A();
                        }
                        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA17);
                        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P17);
                        pVar3 = ComposeUiNode.Companion.f14338g;
                        if (c1086gP.f12995O) {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        } else {
                            J4.i.d(i19, c1086gP, i19, pVar3);
                        }
                        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC17);
                        c1086gP.L(-1239346793);
                        if (num3 != null) {
                            IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                        }
                        c1086gP.T(false);
                        intercomTheme = IntercomTheme.INSTANCE;
                        i20 = IntercomTheme.$stable;
                        pVar4 = pVar2;
                        androidx.compose.ui.h hVar111 = hVar3;
                        TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                        c1086gP.L(-1239330071);
                        if (str3 == null) {
                            c1086gP = c1086gP;
                            aVar3 = aVar;
                        } else {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                            aVar3 = aVar;
                            TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                            c1086gP = c1086gP;
                        }
                        c1086gP.T(false);
                        c1086gP.L(-1239320282);
                        if (pVar4 != null) {
                            Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                            pVar4.invoke(c1086gP, 0);
                        }
                        c1086gP.T(false);
                        c1086gP.T(true);
                        pVar5 = pVar4;
                        str4 = str3;
                        num4 = num3;
                        hVar4 = hVar111;
                    }
                    c1105p0V = c1086gP.V();
                    if (c1105p0V != null) {
                        c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                            @Override // Ia.p
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                            }
                        };
                    }
                }
                i12 |= 24576;
                pVar2 = pVar;
                if ((46811 & i12) == 9362) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    androidx.compose.ui.h hVarI18 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                    C0953m c0953mA18 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P18 = c1086gP.P();
                    androidx.compose.ui.h hVarC18 = ComposedModifierKt.c(c1086gP, hVarI18);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA18);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P18);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC18);
                    c1086gP.L(-1239346793);
                    if (num3 != null) {
                        IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i20 = IntercomTheme.$stable;
                    pVar4 = pVar2;
                    androidx.compose.ui.h hVar112 = hVar3;
                    TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                    c1086gP.L(-1239330071);
                    if (str3 == null) {
                        c1086gP = c1086gP;
                        aVar3 = aVar;
                    } else {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                        aVar3 = aVar;
                        TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                        c1086gP = c1086gP;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-1239320282);
                    if (pVar4 != null) {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                        pVar4.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    pVar5 = pVar4;
                    str4 = str3;
                    num4 = num3;
                    hVar4 = hVar112;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    androidx.compose.ui.h hVarI19 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                    C0953m c0953mA19 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P19 = c1086gP.P();
                    androidx.compose.ui.h hVarC19 = ComposedModifierKt.c(c1086gP, hVarI19);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA19);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P19);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC19);
                    c1086gP.L(-1239346793);
                    if (num3 != null) {
                        IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i20 = IntercomTheme.$stable;
                    pVar4 = pVar2;
                    androidx.compose.ui.h hVar113 = hVar3;
                    TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                    c1086gP.L(-1239330071);
                    if (str3 == null) {
                        c1086gP = c1086gP;
                        aVar3 = aVar;
                    } else {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                        aVar3 = aVar;
                        TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                        c1086gP = c1086gP;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-1239320282);
                    if (pVar4 != null) {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                        pVar4.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    pVar5 = pVar4;
                    str4 = str3;
                    num4 = num3;
                    hVar4 = hVar113;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 3072;
            num2 = num;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    pVar2 = pVar;
                    if (c1086gP.k(pVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((46811 & i12) == 9362) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    androidx.compose.ui.h hVarI110 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                    C0953m c0953mA110 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P110 = c1086gP.P();
                    androidx.compose.ui.h hVarC110 = ComposedModifierKt.c(c1086gP, hVarI110);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA110);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P110);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC110);
                    c1086gP.L(-1239346793);
                    if (num3 != null) {
                        IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i20 = IntercomTheme.$stable;
                    pVar4 = pVar2;
                    androidx.compose.ui.h hVar114 = hVar3;
                    TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                    c1086gP.L(-1239330071);
                    if (str3 == null) {
                        c1086gP = c1086gP;
                        aVar3 = aVar;
                    } else {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                        aVar3 = aVar;
                        TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                        c1086gP = c1086gP;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-1239320282);
                    if (pVar4 != null) {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                        pVar4.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    pVar5 = pVar4;
                    str4 = str3;
                    num4 = num3;
                    hVar4 = hVar114;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    androidx.compose.ui.h hVarI111 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                    C0953m c0953mA111 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P111 = c1086gP.P();
                    androidx.compose.ui.h hVarC111 = ComposedModifierKt.c(c1086gP, hVarI111);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA111);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P111);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC111);
                    c1086gP.L(-1239346793);
                    if (num3 != null) {
                        IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i20 = IntercomTheme.$stable;
                    pVar4 = pVar2;
                    androidx.compose.ui.h hVar115 = hVar3;
                    TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                    c1086gP.L(-1239330071);
                    if (str3 == null) {
                        c1086gP = c1086gP;
                        aVar3 = aVar;
                    } else {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                        aVar3 = aVar;
                        TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                        c1086gP = c1086gP;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-1239320282);
                    if (pVar4 != null) {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                        pVar4.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    pVar5 = pVar4;
                    str4 = str3;
                    num4 = num3;
                    hVar4 = hVar115;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 24576;
            pVar2 = pVar;
            if ((46811 & i12) == 9362) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    pVar2 = null;
                }
                androidx.compose.ui.h hVarI112 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                C0953m c0953mA112 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P112 = c1086gP.P();
                androidx.compose.ui.h hVarC112 = ComposedModifierKt.c(c1086gP, hVarI112);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA112);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P112);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC112);
                c1086gP.L(-1239346793);
                if (num3 != null) {
                    IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                }
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i20 = IntercomTheme.$stable;
                pVar4 = pVar2;
                androidx.compose.ui.h hVar116 = hVar3;
                TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                c1086gP.L(-1239330071);
                if (str3 == null) {
                    c1086gP = c1086gP;
                    aVar3 = aVar;
                } else {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                    aVar3 = aVar;
                    TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                    c1086gP = c1086gP;
                }
                c1086gP.T(false);
                c1086gP.L(-1239320282);
                if (pVar4 != null) {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                    pVar4.invoke(c1086gP, 0);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                pVar5 = pVar4;
                str4 = str3;
                num4 = num3;
                hVar4 = hVar116;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    pVar2 = null;
                }
                androidx.compose.ui.h hVarI113 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                C0953m c0953mA113 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P113 = c1086gP.P();
                androidx.compose.ui.h hVarC113 = ComposedModifierKt.c(c1086gP, hVarI113);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA113);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P113);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC113);
                c1086gP.L(-1239346793);
                if (num3 != null) {
                    IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                }
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i20 = IntercomTheme.$stable;
                pVar4 = pVar2;
                androidx.compose.ui.h hVar117 = hVar3;
                TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                c1086gP.L(-1239330071);
                if (str3 == null) {
                    c1086gP = c1086gP;
                    aVar3 = aVar;
                } else {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                    aVar3 = aVar;
                    TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                    c1086gP = c1086gP;
                }
                c1086gP.T(false);
                c1086gP.L(-1239320282);
                if (pVar4 != null) {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                    pVar4.invoke(c1086gP, 0);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                pVar5 = pVar4;
                str4 = str3;
                num4 = num3;
                hVar4 = hVar117;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        str2 = str;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                num2 = num;
                if (c1086gP.K(num2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    pVar2 = pVar;
                    if (c1086gP.k(pVar2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((46811 & i12) == 9362) {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    androidx.compose.ui.h hVarI114 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                    C0953m c0953mA114 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P114 = c1086gP.P();
                    androidx.compose.ui.h hVarC114 = ComposedModifierKt.c(c1086gP, hVarI114);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA114);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P114);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC114);
                    c1086gP.L(-1239346793);
                    if (num3 != null) {
                        IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i20 = IntercomTheme.$stable;
                    pVar4 = pVar2;
                    androidx.compose.ui.h hVar118 = hVar3;
                    TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                    c1086gP.L(-1239330071);
                    if (str3 == null) {
                        c1086gP = c1086gP;
                        aVar3 = aVar;
                    } else {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                        aVar3 = aVar;
                        TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                        c1086gP = c1086gP;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-1239320282);
                    if (pVar4 != null) {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                        pVar4.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    pVar5 = pVar4;
                    str4 = str3;
                    num4 = num3;
                    hVar4 = hVar118;
                } else {
                    aVar = androidx.compose.ui.h.a.f13984b;
                    if (i21 != 0) {
                        hVar3 = aVar;
                    } else {
                        hVar3 = hVar2;
                    }
                    if (i13 != 0) {
                        str3 = null;
                    } else {
                        str3 = str2;
                    }
                    if (i15 != 0) {
                        num3 = null;
                    } else {
                        num3 = num2;
                    }
                    if (i17 != 0) {
                        pVar2 = null;
                    }
                    androidx.compose.ui.h hVarI115 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                    C0953m c0953mA115 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                    i19 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P115 = c1086gP.P();
                    androidx.compose.ui.h hVarC115 = ComposedModifierKt.c(c1086gP, hVarI115);
                    ComposeUiNode.f14331c0.getClass();
                    aVar2 = ComposeUiNode.Companion.f14333b;
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA115);
                    R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P115);
                    pVar3 = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O) {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    } else {
                        J4.i.d(i19, c1086gP, i19, pVar3);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC115);
                    c1086gP.L(-1239346793);
                    if (num3 != null) {
                        IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                    }
                    c1086gP.T(false);
                    intercomTheme = IntercomTheme.INSTANCE;
                    i20 = IntercomTheme.$stable;
                    pVar4 = pVar2;
                    androidx.compose.ui.h hVar119 = hVar3;
                    TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                    c1086gP.L(-1239330071);
                    if (str3 == null) {
                        c1086gP = c1086gP;
                        aVar3 = aVar;
                    } else {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                        aVar3 = aVar;
                        TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                        c1086gP = c1086gP;
                    }
                    c1086gP.T(false);
                    c1086gP.L(-1239320282);
                    if (pVar4 != null) {
                        Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                        pVar4.invoke(c1086gP, 0);
                    }
                    c1086gP.T(false);
                    c1086gP.T(true);
                    pVar5 = pVar4;
                    str4 = str3;
                    num4 = num3;
                    hVar4 = hVar119;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 24576;
            pVar2 = pVar;
            if ((46811 & i12) == 9362) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    pVar2 = null;
                }
                androidx.compose.ui.h hVarI116 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                C0953m c0953mA116 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P116 = c1086gP.P();
                androidx.compose.ui.h hVarC116 = ComposedModifierKt.c(c1086gP, hVarI116);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA116);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P116);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC116);
                c1086gP.L(-1239346793);
                if (num3 != null) {
                    IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                }
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i20 = IntercomTheme.$stable;
                pVar4 = pVar2;
                androidx.compose.ui.h hVar1110 = hVar3;
                TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                c1086gP.L(-1239330071);
                if (str3 == null) {
                    c1086gP = c1086gP;
                    aVar3 = aVar;
                } else {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                    aVar3 = aVar;
                    TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                    c1086gP = c1086gP;
                }
                c1086gP.T(false);
                c1086gP.L(-1239320282);
                if (pVar4 != null) {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                    pVar4.invoke(c1086gP, 0);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                pVar5 = pVar4;
                str4 = str3;
                num4 = num3;
                hVar4 = hVar1110;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    pVar2 = null;
                }
                androidx.compose.ui.h hVarI117 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                C0953m c0953mA117 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P117 = c1086gP.P();
                androidx.compose.ui.h hVarC117 = ComposedModifierKt.c(c1086gP, hVarI117);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA117);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P117);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC117);
                c1086gP.L(-1239346793);
                if (num3 != null) {
                    IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                }
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i20 = IntercomTheme.$stable;
                pVar4 = pVar2;
                androidx.compose.ui.h hVar1111 = hVar3;
                TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                c1086gP.L(-1239330071);
                if (str3 == null) {
                    c1086gP = c1086gP;
                    aVar3 = aVar;
                } else {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                    aVar3 = aVar;
                    TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                    c1086gP = c1086gP;
                }
                c1086gP.T(false);
                c1086gP.L(-1239320282);
                if (pVar4 != null) {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                    pVar4.invoke(c1086gP, 0);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                pVar5 = pVar4;
                str4 = str3;
                num4 = num3;
                hVar4 = hVar1111;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 3072;
        num2 = num;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((57344 & i10) == 0) {
                pVar2 = pVar;
                if (c1086gP.k(pVar2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((46811 & i12) == 9362) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    pVar2 = null;
                }
                androidx.compose.ui.h hVarI118 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                C0953m c0953mA118 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P118 = c1086gP.P();
                androidx.compose.ui.h hVarC118 = ComposedModifierKt.c(c1086gP, hVarI118);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA118);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P118);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC118);
                c1086gP.L(-1239346793);
                if (num3 != null) {
                    IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                }
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i20 = IntercomTheme.$stable;
                pVar4 = pVar2;
                androidx.compose.ui.h hVar1112 = hVar3;
                TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                c1086gP.L(-1239330071);
                if (str3 == null) {
                    c1086gP = c1086gP;
                    aVar3 = aVar;
                } else {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                    aVar3 = aVar;
                    TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                    c1086gP = c1086gP;
                }
                c1086gP.T(false);
                c1086gP.L(-1239320282);
                if (pVar4 != null) {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                    pVar4.invoke(c1086gP, 0);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                pVar5 = pVar4;
                str4 = str3;
                num4 = num3;
                hVar4 = hVar1112;
            } else {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i21 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                if (i13 != 0) {
                    str3 = null;
                } else {
                    str3 = str2;
                }
                if (i15 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                if (i17 != 0) {
                    pVar2 = null;
                }
                androidx.compose.ui.h hVarI119 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
                C0953m c0953mA119 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
                i19 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P119 = c1086gP.P();
                androidx.compose.ui.h hVarC119 = ComposedModifierKt.c(c1086gP, hVarI119);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA119);
                R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P119);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                } else {
                    J4.i.d(i19, c1086gP, i19, pVar3);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC119);
                c1086gP.L(-1239346793);
                if (num3 != null) {
                    IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
                }
                c1086gP.T(false);
                intercomTheme = IntercomTheme.INSTANCE;
                i20 = IntercomTheme.$stable;
                pVar4 = pVar2;
                androidx.compose.ui.h hVar1113 = hVar3;
                TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
                c1086gP.L(-1239330071);
                if (str3 == null) {
                    c1086gP = c1086gP;
                    aVar3 = aVar;
                } else {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                    aVar3 = aVar;
                    TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                    c1086gP = c1086gP;
                }
                c1086gP.T(false);
                c1086gP.L(-1239320282);
                if (pVar4 != null) {
                    Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                    pVar4.invoke(c1086gP, 0);
                }
                c1086gP.T(false);
                c1086gP.T(true);
                pVar5 = pVar4;
                str4 = str3;
                num4 = num3;
                hVar4 = hVar1113;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 24576;
        pVar2 = pVar;
        if ((46811 & i12) == 9362) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i21 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (i13 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (i15 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i17 != 0) {
                pVar2 = null;
            }
            androidx.compose.ui.h hVarI1110 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
            C0953m c0953mA1110 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
            i19 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P1110 = c1086gP.P();
            androidx.compose.ui.h hVarC1110 = ComposedModifierKt.c(c1086gP, hVarI1110);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA1110);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P1110);
            pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i19, c1086gP, i19, pVar3);
            } else {
                J4.i.d(i19, c1086gP, i19, pVar3);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1110);
            c1086gP.L(-1239346793);
            if (num3 != null) {
                IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
            }
            c1086gP.T(false);
            intercomTheme = IntercomTheme.INSTANCE;
            i20 = IntercomTheme.$stable;
            pVar4 = pVar2;
            androidx.compose.ui.h hVar1114 = hVar3;
            TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
            c1086gP.L(-1239330071);
            if (str3 == null) {
                c1086gP = c1086gP;
                aVar3 = aVar;
            } else {
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                aVar3 = aVar;
                TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                c1086gP = c1086gP;
            }
            c1086gP.T(false);
            c1086gP.L(-1239320282);
            if (pVar4 != null) {
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                pVar4.invoke(c1086gP, 0);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            pVar5 = pVar4;
            str4 = str3;
            num4 = num3;
            hVar4 = hVar1114;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i21 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            if (i13 != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if (i15 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            if (i17 != 0) {
                pVar2 = null;
            }
            androidx.compose.ui.h hVarI1111 = PaddingKt.f(hVar3, 24).i(androidx.compose.foundation.layout.W.f10226c);
            C0953m c0953mA1111 = C0952l.a(C0945e.f10288e, androidx.compose.ui.d.a.f13347n, c1086gP, 54);
            i19 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P1111 = c1086gP.P();
            androidx.compose.ui.h hVarC1111 = ComposedModifierKt.c(c1086gP, hVarI1111);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA1111);
            R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P1111);
            pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i19, c1086gP, i19, pVar3);
            } else {
                J4.i.d(i19, c1086gP, i19, pVar3);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC1111);
            c1086gP.L(-1239346793);
            if (num3 != null) {
                IconKt.a(U.c.a(num3.intValue(), c1086gP, 0), null, androidx.compose.foundation.layout.W.m(aVar, 32), IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m645getPrimaryText0d7_KjU(), c1086gP, 440, 0);
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 16));
            }
            c1086gP.T(false);
            intercomTheme = IntercomTheme.INSTANCE;
            i20 = IntercomTheme.$stable;
            pVar4 = pVar2;
            androidx.compose.ui.h hVar1115 = hVar3;
            TextKt.b(title, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType03(), c1086gP, i12 & 14, 0, 65018);
            c1086gP.L(-1239330071);
            if (str3 == null) {
                c1086gP = c1086gP;
                aVar3 = aVar;
            } else {
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar, 6));
                aVar3 = aVar;
                TextKt.b(str3, null, intercomTheme.getColors(c1086gP, i20).m645getPrimaryText0d7_KjU(), 0L, null, null, null, 0L, null, new androidx.compose.ui.text.style.g(3), 0L, 0, false, 0, 0, null, intercomTheme.getTypography(c1086gP, i20).getType04(), c1086gP, 0, 0, 65018);
                c1086gP = c1086gP;
            }
            c1086gP.T(false);
            c1086gP.L(-1239320282);
            if (pVar4 != null) {
                Lb.a.a(c1086gP, androidx.compose.foundation.layout.W.e(aVar3, 16));
                pVar4.invoke(c1086gP, 0);
            }
            c1086gP.T(false);
            c1086gP.T(true);
            pVar5 = pVar4;
            str4 = str3;
            num4 = num3;
            hVar4 = hVar1115;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.components.Z
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return EmptyStateKt.EmptyState$lambda$4(title, hVar4, str4, num4, pVar5, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r EmptyState$lambda$4(String title, androidx.compose.ui.h hVar, String str, Integer num, Ia.p pVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(title, "$title");
        EmptyState(title, hVar, str, num, pVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void EmptyStatePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1885515198);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$EmptyStateKt.INSTANCE.m81getLambda3$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2269a0(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r EmptyStatePreview$lambda$5(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        EmptyStatePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    private static final void EmptyStateWithOutlinedButtonPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-484307592);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$EmptyStateKt.INSTANCE.m84getLambda6$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Y(i10, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r EmptyStateWithOutlinedButtonPreview$lambda$6(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        EmptyStateWithOutlinedButtonPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
