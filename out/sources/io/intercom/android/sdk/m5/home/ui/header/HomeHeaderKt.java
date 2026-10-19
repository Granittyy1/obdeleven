package io.intercom.android.sdk.m5.home.ui.header;

import Ia.p;
import S4.o;
import android.content.Context;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0949i;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.V;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.X;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.layout.InterfaceC1161g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.F;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.Y;
import io.intercom.android.sdk.m5.conversation.ui.I;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.O;
import io.intercom.android.sdk.m5.conversation.ui.components.row.u;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.components.WrapReportingTextKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ThemeUtils;
import kotlin.Pair;
import kotlin.text.n;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: HomeHeader.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeHeaderKt {
    /* JADX WARN: Code duplicated, block: B:25:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:31:0x0117  */
    /* JADX WARN: Code duplicated, block: B:34:0x012b  */
    /* JADX WARN: Code duplicated, block: B:36:0x019b  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x020f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0228  */
    /* JADX WARN: Code duplicated, block: B:54:0x0267  */
    /* JADX WARN: Code duplicated, block: B:58:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:66:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:70:0x0326  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void HomeContentHeader(androidx.compose.ui.h hVar, final HomeUiState.Content.ContentHeader header, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        float f10;
        int i12;
        V v10;
        int i13;
        boolean z10;
        HomeUiState.Content.ContentHeader.ColoredText greeting;
        HomeUiState.Content.ContentHeader.ColoredText intro;
        C1105p0 c1105p0V;
        String textColorLight;
        Object objF;
        String textColorLight2;
        Object objF2;
        kotlin.jvm.internal.i.e(header, "header");
        C1086g c1086gP = interfaceC1084f.p(-1992208830);
        int i14 = i11 & 1;
        androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
        androidx.compose.ui.h hVar2 = i14 != 0 ? aVar : hVar;
        F type02 = IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType02();
        c1086gP.L(-1302173877);
        Object objF3 = c1086gP.f();
        InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
        if (objF3 == c0153a) {
            objF3 = J0.f(type02);
            c1086gP.E(objF3);
        }
        X x10 = (X) objF3;
        c1086gP.T(false);
        c1086gP.L(-1302171579);
        Object objF4 = c1086gP.f();
        if (objF4 == c0153a) {
            objF4 = J0.f(Boolean.FALSE);
            c1086gP.E(objF4);
        }
        X x11 = (X) objF4;
        c1086gP.T(false);
        float f11 = 32;
        float f12 = 24;
        androidx.compose.ui.h hVarJ = PaddingKt.j(PaddingKt.j(hVar2, 0.0f, 10, 0.0f, f11, 5), f11, 0.0f, f12, 0.0f, 10);
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i15 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarJ);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        p<ComposeUiNode, E, r> pVar = ComposeUiNode.Companion.f14337f;
        R0.a(pVar, c1086gP, c0953mA);
        p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
        R0.a(pVar2, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
        if (!c1086gP.f12995O) {
            f10 = f11;
            if (!kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
            }
            p<ComposeUiNode, androidx.compose.ui.h, r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC);
            androidx.compose.ui.h hVarD = W.d(aVar, 1.0f);
            T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
            i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarD);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, tA);
            R0.a(pVar2, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC2);
            v10 = V.f10222a;
            c1086gP.L(-827693038);
            if (header.getShowLogo()) {
                Context context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                String strSelectUrlForThemeCompose$intercom_sdk_base_release = ThemeUtils.INSTANCE.selectUrlForThemeCompose$intercom_sdk_base_release(header.getLogoUrl(), header.getLogoDarkUrl(), c1086gP, 384);
                coil.request.g.a aVar3 = new coil.request.g.a(context);
                aVar3.f23074c = strSelectUrlForThemeCompose$intercom_sdk_base_release;
                aVar3.b();
                i13 = 48;
                ImageKt.a(coil.compose.f.a(aVar3.a(), IntercomImageLoaderKt.getImageLoader(context), null, null, null, 0, c1086gP, R.styleable.AppCompatTheme_windowMinWidthMajor), null, W.e(PaddingKt.j(v10.b(aVar, true), 0.0f, 0.0f, 16, 0.0f, 11), f10), androidx.compose.ui.d.a.f13338d, InterfaceC1161g.a.f14245c, 0.0f, null, c1086gP, 27696, 96);
            } else {
                i13 = 48;
            }
            c1086gP.T(false);
            c1086gP.L(-827663238);
            if (header.getShowAvatars()) {
                AvatarGroupKt.m59AvatarGroupJ8mCjc(header.getAdminsAvatars(), null, 0.0f, 0L, c1086gP, 8, 14);
            }
            c1086gP.T(false);
            c1086gP.L(-827659971);
            if (header.getShowLogo()) {
                z10 = true;
            } else {
                z10 = true;
                Lb.a.a(c1086gP, v10.b(aVar, true));
            }
            c1086gP.T(false);
            Lb.a.a(c1086gP, W.m(aVar, f12));
            c1086gP.T(z10);
            Lb.a.a(c1086gP, W.e(aVar, i13));
            c1086gP.L(-2011771705);
            greeting = header.getGreeting();
            c1086gP.L(-2011770599);
            if (!n.S(greeting.getText())) {
                c1086gP.L(-827645152);
                if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(c1086gP, 6) || greeting.getTextColorDark() == null) {
                    textColorLight2 = greeting.getTextColorLight();
                } else {
                    textColorLight2 = greeting.getTextColorDark();
                }
                Pair pair = new Pair(textColorLight2, Float.valueOf(greeting.getOpacity()));
                c1086gP.T(false);
                String str = (String) pair.a();
                float fFloatValue = ((Number) pair.b()).floatValue();
                String text = greeting.getText();
                F f13 = (F) x10.getValue();
                long composeColor = ColorExtensionsKt.toComposeColor(str, fFloatValue);
                c1086gP.L(-827626962);
                objF2 = c1086gP.f();
                if (objF2 == c0153a) {
                    objF2 = new I(1, x11);
                    c1086gP.E(objF2);
                }
                c1086gP.T(false);
                WrapReportingTextKt.m311WrapReportingTextT042LqI(null, text, composeColor, f13, (Ia.l) objF2, c1086gP, 24576, 1);
            }
            c1086gP.T(false);
            r rVar = r.f47939a;
            c1086gP.T(false);
            c1086gP.L(-2011741532);
            intro = header.getIntro();
            c1086gP.L(-2011740519);
            if (!n.S(intro.getText())) {
                c1086gP.L(-827615072);
                if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(c1086gP, 6) || intro.getTextColorDark() == null) {
                    textColorLight = intro.getTextColorLight();
                } else {
                    textColorLight = intro.getTextColorDark();
                }
                Pair pair2 = new Pair(textColorLight, Float.valueOf(intro.getOpacity()));
                c1086gP.T(false);
                String str2 = (String) pair2.a();
                float fFloatValue2 = ((Number) pair2.b()).floatValue();
                String text2 = intro.getText();
                F f14 = (F) x10.getValue();
                long composeColor2 = ColorExtensionsKt.toComposeColor(str2, fFloatValue2);
                c1086gP.L(-827596882);
                objF = c1086gP.f();
                if (objF == r18) {
                    objF = new p011ab.g(2, x11);
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                WrapReportingTextKt.m311WrapReportingTextT042LqI(null, text2, composeColor2, f14, (Ia.l) objF, c1086gP, 24576, 1);
            }
            c1086gP.T(false);
            c1086gP.T(false);
            c1086gP.T(true);
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                final androidx.compose.ui.h hVar3 = hVar2;
                c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.home.ui.header.k
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return HomeHeaderKt.HomeContentHeader$lambda$12(hVar3, header, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        f10 = f11;
        J4.i.d(i15, c1086gP, i15, pVar3);
        p<ComposeUiNode, androidx.compose.ui.h, r> pVar5 = ComposeUiNode.Companion.f14335d;
        R0.a(pVar5, c1086gP, hVarC);
        androidx.compose.ui.h hVarD2 = W.d(aVar, 1.0f);
        T tA2 = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 48);
        i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
        androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarD2);
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar2);
        } else {
            c1086gP.A();
        }
        R0.a(pVar, c1086gP, tA2);
        R0.a(pVar2, c1086gP, interfaceC1089h0P3);
        if (c1086gP.f12995O) {
            J4.i.d(i12, c1086gP, i12, pVar3);
        } else {
            J4.i.d(i12, c1086gP, i12, pVar3);
        }
        R0.a(pVar5, c1086gP, hVarC3);
        v10 = V.f10222a;
        c1086gP.L(-827693038);
        if (header.getShowLogo()) {
            Context context2 = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            String strSelectUrlForThemeCompose$intercom_sdk_base_release2 = ThemeUtils.INSTANCE.selectUrlForThemeCompose$intercom_sdk_base_release(header.getLogoUrl(), header.getLogoDarkUrl(), c1086gP, 384);
            coil.request.g.a aVar4 = new coil.request.g.a(context2);
            aVar4.f23074c = strSelectUrlForThemeCompose$intercom_sdk_base_release2;
            aVar4.b();
            i13 = 48;
            ImageKt.a(coil.compose.f.a(aVar4.a(), IntercomImageLoaderKt.getImageLoader(context2), null, null, null, 0, c1086gP, R.styleable.AppCompatTheme_windowMinWidthMajor), null, W.e(PaddingKt.j(v10.b(aVar, true), 0.0f, 0.0f, 16, 0.0f, 11), f10), androidx.compose.ui.d.a.f13338d, InterfaceC1161g.a.f14245c, 0.0f, null, c1086gP, 27696, 96);
        } else {
            i13 = 48;
        }
        c1086gP.T(false);
        c1086gP.L(-827663238);
        if (header.getShowAvatars()) {
            AvatarGroupKt.m59AvatarGroupJ8mCjc(header.getAdminsAvatars(), null, 0.0f, 0L, c1086gP, 8, 14);
        }
        c1086gP.T(false);
        c1086gP.L(-827659971);
        if (header.getShowLogo()) {
            z10 = true;
            Lb.a.a(c1086gP, v10.b(aVar, true));
        } else {
            z10 = true;
        }
        c1086gP.T(false);
        Lb.a.a(c1086gP, W.m(aVar, f12));
        c1086gP.T(z10);
        Lb.a.a(c1086gP, W.e(aVar, i13));
        c1086gP.L(-2011771705);
        greeting = header.getGreeting();
        c1086gP.L(-2011770599);
        if (!n.S(greeting.getText())) {
            c1086gP.L(-827645152);
            if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(c1086gP, 6)) {
                textColorLight2 = greeting.getTextColorLight();
            } else {
                textColorLight2 = greeting.getTextColorLight();
            }
            Pair pair3 = new Pair(textColorLight2, Float.valueOf(greeting.getOpacity()));
            c1086gP.T(false);
            String str3 = (String) pair3.a();
            float fFloatValue3 = ((Number) pair3.b()).floatValue();
            String text3 = greeting.getText();
            F f15 = (F) x10.getValue();
            long composeColor3 = ColorExtensionsKt.toComposeColor(str3, fFloatValue3);
            c1086gP.L(-827626962);
            objF2 = c1086gP.f();
            if (objF2 == c0153a) {
                objF2 = new I(1, x11);
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            WrapReportingTextKt.m311WrapReportingTextT042LqI(null, text3, composeColor3, f15, (Ia.l) objF2, c1086gP, 24576, 1);
        }
        c1086gP.T(false);
        r rVar2 = r.f47939a;
        c1086gP.T(false);
        c1086gP.L(-2011741532);
        intro = header.getIntro();
        c1086gP.L(-2011740519);
        if (!n.S(intro.getText())) {
            c1086gP.L(-827615072);
            if (ThemeUtils.INSTANCE.isDarkModeCompose$intercom_sdk_base_release(c1086gP, 6)) {
                textColorLight = intro.getTextColorLight();
            } else {
                textColorLight = intro.getTextColorLight();
            }
            Pair pair4 = new Pair(textColorLight, Float.valueOf(intro.getOpacity()));
            c1086gP.T(false);
            String str4 = (String) pair4.a();
            float fFloatValue4 = ((Number) pair4.b()).floatValue();
            String text4 = intro.getText();
            F f16 = (F) x10.getValue();
            long composeColor4 = ColorExtensionsKt.toComposeColor(str4, fFloatValue4);
            c1086gP.L(-827596882);
            objF = c1086gP.f();
            if (objF == r18) {
                objF = new p011ab.g(2, x11);
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            WrapReportingTextKt.m311WrapReportingTextT042LqI(null, text4, composeColor4, f16, (Ia.l) objF, c1086gP, 24576, 1);
        }
        c1086gP.T(false);
        c1086gP.T(false);
        c1086gP.T(true);
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            final androidx.compose.ui.h hVar4 = hVar2;
            c1105p0V.f13109d = new p() { // from class: io.intercom.android.sdk.m5.home.ui.header.k
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeHeaderKt.HomeContentHeader$lambda$12(hVar4, header, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final r HomeContentHeader$lambda$11$lambda$10$lambda$9$lambda$8(X hasEitherTextWrapped, boolean z10) {
        kotlin.jvm.internal.i.e(hasEitherTextWrapped, "$hasEitherTextWrapped");
        hasEitherTextWrapped.setValue(Boolean.valueOf(z10 | ((Boolean) hasEitherTextWrapped.getValue()).booleanValue()));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final r HomeContentHeader$lambda$11$lambda$6$lambda$5$lambda$4(X hasEitherTextWrapped, boolean z10) {
        kotlin.jvm.internal.i.e(hasEitherTextWrapped, "$hasEitherTextWrapped");
        hasEitherTextWrapped.setValue(Boolean.valueOf(z10 | ((Boolean) hasEitherTextWrapped.getValue()).booleanValue()));
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeContentHeader$lambda$12(androidx.compose.ui.h hVar, HomeUiState.Content.ContentHeader header, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(header, "$header");
        HomeContentHeader(hVar, header, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    @IntercomPreviews
    public static final void HomeContentHeaderPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1555491493);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m320getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new O(i10, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeContentHeaderPreview$lambda$19(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HomeContentHeaderPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void HomeErrorHeader(androidx.compose.ui.h hVar, HomeUiState.Error.ErrorHeader header, final Ia.a<r> onCloseClick, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        androidx.compose.ui.h hVar2;
        int i12;
        androidx.compose.ui.h hVar3;
        kotlin.jvm.internal.i.e(header, "header");
        kotlin.jvm.internal.i.e(onCloseClick, "onCloseClick");
        C1086g c1086gP = interfaceC1084f.p(964565742);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            hVar2 = hVar;
        } else if ((i10 & 14) == 0) {
            hVar2 = hVar;
            i12 = (c1086gP.K(hVar2) ? 4 : 2) | i10;
        } else {
            hVar2 = hVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.K(header) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= c1086gP.k(onCloseClick) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && c1086gP.s()) {
            c1086gP.w();
            hVar3 = hVar2;
        } else {
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVar4 = i13 != 0 ? aVar : hVar2;
            androidx.compose.ui.h hVarE = W.e(PaddingKt.h(C0932d.b(W.d(hVar4, 1.0f), ColorExtensionsKt.toComposeColor$default(header.getBackgroundColor(), 0.0f, 1, null), h0.f13629a), 16, 0.0f, 2), 56);
            T tA = S.a(C0945e.f10284a, androidx.compose.ui.d.a.f13344k, c1086gP, 54);
            int i14 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarE);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            p<ComposeUiNode, E, r> pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, tA);
            p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P);
            p<ComposeUiNode, Integer, r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                J4.i.d(i14, c1086gP, i14, pVar3);
            }
            p<ComposeUiNode, androidx.compose.ui.h, r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC);
            c1086gP.L(941715246);
            String foregroundColor = header.getForegroundColor();
            c1086gP.L(1204042178);
            boolean z10 = (i12 & 896) == 256;
            Object objF = c1086gP.f();
            if (z10 || objF == InterfaceC1084f.a.f12980a) {
                objF = new Ia.a() { // from class: io.intercom.android.sdk.m5.home.ui.header.l
                    @Override // Ia.a
                    public final Object invoke() {
                        return HomeHeaderKt.HomeErrorHeader$lambda$17$lambda$16$lambda$14$lambda$13(onCloseClick);
                    }
                };
                c1086gP.E(objF);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarC2 = ClickableKt.c(aVar, false, null, (Ia.a) objF, 7);
            E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarC2);
            c1086gP.r();
            androidx.compose.ui.h hVar5 = hVar4;
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, eD);
            R0.a(pVar2, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                J4.i.d(i15, c1086gP, i15, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC3);
            IconKt.b(p306z.d.a(), o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_close), C0949i.f10304a.f(aVar, androidx.compose.ui.d.a.f13339e), ColorExtensionsKt.toComposeColor$default(foregroundColor, 0.0f, 1, null), c1086gP, 0, 0);
            c1086gP.T(true);
            c1086gP.T(false);
            c1086gP.T(true);
            hVar3 = hVar5;
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new u(hVar3, header, onCloseClick, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeErrorHeader$lambda$17$lambda$16$lambda$14$lambda$13(Ia.a onCloseClick) {
        kotlin.jvm.internal.i.e(onCloseClick, "$onCloseClick");
        onCloseClick.invoke();
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeErrorHeader$lambda$18(androidx.compose.ui.h hVar, HomeUiState.Error.ErrorHeader header, Ia.a onCloseClick, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(header, "$header");
        kotlin.jvm.internal.i.e(onCloseClick, "$onCloseClick");
        HomeErrorHeader(hVar, header, onCloseClick, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    private static final void HomeErrorHeaderPreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-484536790);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m322getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Y(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeErrorHeaderPreview$lambda$20(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        HomeErrorHeaderPreview(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }
}
