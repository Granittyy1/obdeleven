package io.intercom.android.sdk.survey.ui.components;

import S4.o;
import X8.p;
import android.content.Context;
import androidx.compose.animation.core.C0902b;
import androidx.compose.animation.core.C0907g;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.l;
import androidx.recyclerview.widget.t;
import io.intercom.android.sdk.helpcenter.articles.k;
import io.intercom.android.sdk.m5.components.C2278f;
import io.intercom.android.sdk.m5.components.J;
import io.intercom.android.sdk.m5.components.K;
import io.intercom.android.sdk.m5.conversation.ui.components.M;
import io.intercom.android.sdk.m5.navigation.L;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.survey.ProgressBarState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SurveyTopBarComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyTopBarComponentKt {
    public static final void NoTopBar(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1502798722);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            boolean z10 = false;
            float f10 = 0.0f;
            SurveyTopBar(new TopBarState.NoTopBarState(true, C4.a.g(null, null, 3, null), new ProgressBarState(z10, f10, 3, null)), new p(4), null, c1086gP, 48, 4);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new J(i10, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r NoTopBar$lambda$12(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        NoTopBar(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    public static final void SurveyAvatarBar(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(1511683997);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            Avatar avatarBuild = new Avatar.Builder().withInitials("VR").build();
            kotlin.jvm.internal.i.d(avatarBuild, "build(...)");
            String str = "Vinesh";
            SurveyTopBar(new TopBarState.SenderTopBarState(avatarBuild, str, SurveyComponentKt.getEmptyAppConfig(), false, C4.a.g(null, null, 3, null), null, 32, null), new M(1), null, c1086gP, 56, 4);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new C2278f(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyAvatarBar$lambda$10(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        SurveyAvatarBar(interfaceC1084f, L4.b.l(i10 | 1));
        return r.f47939a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0303  */
    /* JADX WARN: Code duplicated, block: B:105:0x030a  */
    /* JADX WARN: Code duplicated, block: B:110:0x033e  */
    /* JADX WARN: Code duplicated, block: B:112:0x034f  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x0106  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:61:0x0121  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x018a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0198  */
    /* JADX WARN: Code duplicated, block: B:74:0x0208  */
    /* JADX WARN: Code duplicated, block: B:76:0x020f  */
    /* JADX WARN: Code duplicated, block: B:79:0x022d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0267  */
    /* JADX WARN: Code duplicated, block: B:84:0x028e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0297  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:93:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static final void SurveyTopBar(TopBarState topBarState, Ia.a<r> onClose, androidx.compose.ui.h hVar, InterfaceC1084f interfaceC1084f, int i10, int i11) {
        int i12;
        androidx.compose.ui.h hVar2;
        androidx.compose.ui.h.a aVar;
        androidx.compose.ui.h hVar3;
        int i13;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, E, r> pVar;
        Ia.p<ComposeUiNode, androidx.compose.runtime.r, r> pVar2;
        Ia.p<ComposeUiNode, Integer, r> pVar3;
        Ia.p<ComposeUiNode, androidx.compose.ui.h, r> pVar4;
        float f10;
        androidx.compose.ui.f.b bVar;
        int i14;
        androidx.compose.ui.h.a aVar3;
        ?? r10;
        boolean z10;
        ProgressBarState progressBarState;
        androidx.compose.ui.h hVar4;
        N0 n0B;
        long jD;
        SurveyUiColors surveyUiColors;
        long jM357getButton0d7_KjU;
        boolean zK;
        Object objF;
        int i15;
        int i16;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(topBarState, "topBarState");
        kotlin.jvm.internal.i.e(onClose, "onClose");
        C1086g c1086gP = interfaceC1084f.p(-295801747);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(topBarState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
            i12 |= c1086gP.k(onClose) ? 32 : 16;
        }
        int i17 = i11 & 4;
        if (i17 == 0) {
            if ((i10 & 896) == 0) {
                hVar2 = hVar;
                i12 |= c1086gP.K(hVar2) ? 256 : 128;
            }
            if ((i12 & 731) == 146 || !c1086gP.s()) {
                aVar = androidx.compose.ui.h.a.f13984b;
                if (i17 != 0) {
                    hVar3 = aVar;
                } else {
                    hVar3 = hVar2;
                }
                C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
                i13 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVar3);
                ComposeUiNode.f14331c0.getClass();
                aVar2 = ComposeUiNode.Companion.f14333b;
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                pVar = ComposeUiNode.Companion.f14337f;
                R0.a(pVar, c1086gP, c0953mA);
                pVar2 = ComposeUiNode.Companion.f14336e;
                R0.a(pVar2, c1086gP, interfaceC1089h0P);
                pVar3 = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                    J4.i.d(i13, c1086gP, i13, pVar3);
                }
                pVar4 = ComposeUiNode.Companion.f14335d;
                R0.a(pVar4, c1086gP, hVarC);
                f10 = 16;
                Lb.a.a(c1086gP, W.e(aVar, f10));
                bVar = androidx.compose.ui.d.a.f13344k;
                androidx.compose.ui.h hVarD = W.d(PaddingKt.h(aVar, f10, 0.0f, 2), 1.0f);
                T tA = S.a(C0945e.f10290g, bVar, c1086gP, 54);
                i14 = c1086gP.f12996P;
                androidx.compose.ui.h hVar5 = hVar3;
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
                if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i14))) {
                    J4.i.d(i14, c1086gP, i14, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC2);
                if (topBarState instanceof TopBarState.SenderTopBarState) {
                    c1086gP.L(359796343);
                    TopBarState.SenderTopBarState senderTopBarState = (TopBarState.SenderTopBarState) topBarState;
                    CharSequence charSequence = Phrase.from((Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_teammate_from_company).put("name", senderTopBarState.getSenderName()).put("company", senderTopBarState.getAppConfig().getName()).format();
                    T tA2 = S.a(C0945e.f10284a, bVar, c1086gP, 48);
                    i16 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                    androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, aVar);
                    c1086gP.r();
                    if (c1086gP.f12995O) {
                        c1086gP.v(aVar2);
                    } else {
                        c1086gP.A();
                    }
                    R0.a(pVar, c1086gP, tA2);
                    R0.a(pVar2, c1086gP, interfaceC1089h0P3);
                    if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i16))) {
                        J4.i.d(i16, c1086gP, i16, pVar3);
                    }
                    R0.a(pVar4, c1086gP, hVarC3);
                    r10 = 0;
                    CircularAvatarComponentKt.m401CircularAvataraMcp0Q(senderTopBarState.getAvatar(), Q3.d.d(senderTopBarState.getAppConfig().getSecondaryColor()), 0.0f, c1086gP, 8, 4);
                    Lb.a.a(c1086gP, W.q(aVar, 8));
                    String string = charSequence.toString();
                    long jG = G0.a.g(14);
                    l lVar = l.f15442g;
                    long jM360getOnBackground0d7_KjU = senderTopBarState.getSurveyUiColors().m360getOnBackground0d7_KjU();
                    aVar3 = aVar;
                    z10 = true;
                    TextKt.b(string, null, jM360getOnBackground0d7_KjU, jG, null, lVar, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c1086gP, 199680, 3120, 120786);
                    c1086gP.T(true);
                    c1086gP.T(false);
                } else {
                    aVar3 = aVar;
                    r10 = 0;
                    z10 = true;
                    if (!(topBarState instanceof TopBarState.NoTopBarState)) {
                        c1086gP.L(1535625226);
                        c1086gP.T(false);
                        throw new NoWhenBranchMatchedException();
                    }
                    c1086gP.L(360841663);
                    Lb.a.a(c1086gP, W.q(aVar3, 1));
                    c1086gP.T(false);
                }
                c1086gP.L(1535664392);
                if (topBarState.getShowDismissButton()) {
                    IconKt.b(p306z.d.a(), o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_dismiss), ClickableKt.c(aVar3, r10, null, onClose, 7), topBarState.getSurveyUiColors().m360getOnBackground0d7_KjU(), c1086gP, 0, 0);
                }
                c1086gP.T(r10);
                c1086gP.T(z10);
                c1086gP.L(-1116808288);
                progressBarState = topBarState.getProgressBarState();
                c1086gP.L(-1116806779);
                if (progressBarState.isVisible()) {
                    Lb.a.a(c1086gP, W.e(aVar3, f10));
                    n0B = C0902b.b(progressBarState.getProgress(), C0907g.d(t.d.DEFAULT_DRAG_ANIMATION_DURATION, r10, null, 6), c1086gP, 48);
                    if (ColorExtensionsKt.m664isDarkColor8_81llA(topBarState.getSurveyUiColors().m356getBackground0d7_KjU())) {
                        jD = Q3.d.d(1728053247);
                    } else {
                        jD = Q3.d.d(1291845632);
                    }
                    long j = jD;
                    surveyUiColors = topBarState.getSurveyUiColors();
                    if (!H.c(surveyUiColors.m356getBackground0d7_KjU(), surveyUiColors.m357getButton0d7_KjU()) && ColorExtensionsKt.m666isWhite8_81llA(surveyUiColors.m356getBackground0d7_KjU())) {
                        jM357getButton0d7_KjU = Q3.d.e(3439329279L);
                    } else if (H.c(surveyUiColors.m356getBackground0d7_KjU(), surveyUiColors.m357getButton0d7_KjU()) || !ColorExtensionsKt.m662isBlack8_81llA(surveyUiColors.m356getBackground0d7_KjU())) {
                        jM357getButton0d7_KjU = surveyUiColors.m357getButton0d7_KjU();
                    } else {
                        jM357getButton0d7_KjU = Q3.d.e(2147483648L);
                    }
                    long j10 = jM357getButton0d7_KjU;
                    androidx.compose.ui.h hVarD2 = W.d(aVar3, 1.0f);
                    float f11 = (float) r10;
                    c1086gP.L(1535711889);
                    zK = c1086gP.K(n0B);
                    objF = c1086gP.f();
                    if (!zK || objF == InterfaceC1084f.a.f12980a) {
                        i15 = 2;
                        objF = new k(i15, n0B);
                        c1086gP.E(objF);
                    } else {
                        i15 = 2;
                    }
                    c1086gP.T(r10);
                    ProgressIndicatorKt.b((Ia.a) objF, hVarD2, j10, j, 2, f11, new L(i15), c1086gP, 1769520, 0);
                }
                c1086gP.T(r10);
                r rVar = r.f47939a;
                c1086gP.T(r10);
                c1086gP.T(z10);
                hVar4 = hVar5;
            } else {
                c1086gP.w();
                hVar4 = hVar2;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new K(topBarState, onClose, hVar4, i10, i11);
            }
        }
        i12 |= 384;
        hVar2 = hVar;
        if ((i12 & 731) == 146) {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i17 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
            androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVar3);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, c0953mA2);
            pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P4);
            pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar3);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar3);
            }
            pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC4);
            f10 = 16;
            Lb.a.a(c1086gP, W.e(aVar, f10));
            bVar = androidx.compose.ui.d.a.f13344k;
            androidx.compose.ui.h hVarD3 = W.d(PaddingKt.h(aVar, f10, 0.0f, 2), 1.0f);
            T tA3 = S.a(C0945e.f10290g, bVar, c1086gP, 54);
            i14 = c1086gP.f12996P;
            androidx.compose.ui.h hVar6 = hVar3;
            InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
            androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarD3);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, tA3);
            R0.a(pVar2, c1086gP, interfaceC1089h0P5);
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar3);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC5);
            if (topBarState instanceof TopBarState.SenderTopBarState) {
                c1086gP.L(359796343);
                TopBarState.SenderTopBarState senderTopBarState2 = (TopBarState.SenderTopBarState) topBarState;
                CharSequence charSequence2 = Phrase.from((Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_teammate_from_company).put("name", senderTopBarState2.getSenderName()).put("company", senderTopBarState2.getAppConfig().getName()).format();
                T tA4 = S.a(C0945e.f10284a, bVar, c1086gP, 48);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
                androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, tA4);
                R0.a(pVar2, c1086gP, interfaceC1089h0P6);
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar3);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC6);
                r10 = 0;
                CircularAvatarComponentKt.m401CircularAvataraMcp0Q(senderTopBarState2.getAvatar(), Q3.d.d(senderTopBarState2.getAppConfig().getSecondaryColor()), 0.0f, c1086gP, 8, 4);
                Lb.a.a(c1086gP, W.q(aVar, 8));
                String string2 = charSequence2.toString();
                long jG2 = G0.a.g(14);
                l lVar2 = l.f15442g;
                long jM360getOnBackground0d7_KjU2 = senderTopBarState2.getSurveyUiColors().m360getOnBackground0d7_KjU();
                aVar3 = aVar;
                z10 = true;
                TextKt.b(string2, null, jM360getOnBackground0d7_KjU2, jG2, null, lVar2, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c1086gP, 199680, 3120, 120786);
                c1086gP.T(true);
                c1086gP.T(false);
            } else {
                aVar3 = aVar;
                r10 = 0;
                z10 = true;
                if (!(topBarState instanceof TopBarState.NoTopBarState)) {
                    c1086gP.L(1535625226);
                    c1086gP.T(false);
                    throw new NoWhenBranchMatchedException();
                }
                c1086gP.L(360841663);
                Lb.a.a(c1086gP, W.q(aVar3, 1));
                c1086gP.T(false);
            }
            c1086gP.L(1535664392);
            if (topBarState.getShowDismissButton()) {
                IconKt.b(p306z.d.a(), o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_dismiss), ClickableKt.c(aVar3, r10, null, onClose, 7), topBarState.getSurveyUiColors().m360getOnBackground0d7_KjU(), c1086gP, 0, 0);
            }
            c1086gP.T(r10);
            c1086gP.T(z10);
            c1086gP.L(-1116808288);
            progressBarState = topBarState.getProgressBarState();
            c1086gP.L(-1116806779);
            if (progressBarState.isVisible()) {
                Lb.a.a(c1086gP, W.e(aVar3, f10));
                n0B = C0902b.b(progressBarState.getProgress(), C0907g.d(t.d.DEFAULT_DRAG_ANIMATION_DURATION, r10, null, 6), c1086gP, 48);
                if (ColorExtensionsKt.m664isDarkColor8_81llA(topBarState.getSurveyUiColors().m356getBackground0d7_KjU())) {
                    jD = Q3.d.d(1728053247);
                } else {
                    jD = Q3.d.d(1291845632);
                }
                long j11 = jD;
                surveyUiColors = topBarState.getSurveyUiColors();
                if (!H.c(surveyUiColors.m356getBackground0d7_KjU(), surveyUiColors.m357getButton0d7_KjU())) {
                    if (H.c(surveyUiColors.m356getBackground0d7_KjU(), surveyUiColors.m357getButton0d7_KjU())) {
                        jM357getButton0d7_KjU = surveyUiColors.m357getButton0d7_KjU();
                    } else {
                        jM357getButton0d7_KjU = surveyUiColors.m357getButton0d7_KjU();
                    }
                } else if (H.c(surveyUiColors.m356getBackground0d7_KjU(), surveyUiColors.m357getButton0d7_KjU())) {
                    jM357getButton0d7_KjU = surveyUiColors.m357getButton0d7_KjU();
                } else {
                    jM357getButton0d7_KjU = surveyUiColors.m357getButton0d7_KjU();
                }
                long j12 = jM357getButton0d7_KjU;
                androidx.compose.ui.h hVarD4 = W.d(aVar3, 1.0f);
                float f12 = (float) r10;
                c1086gP.L(1535711889);
                zK = c1086gP.K(n0B);
                objF = c1086gP.f();
                if (zK) {
                    i15 = 2;
                    objF = new k(i15, n0B);
                    c1086gP.E(objF);
                } else {
                    i15 = 2;
                    objF = new k(i15, n0B);
                    c1086gP.E(objF);
                }
                c1086gP.T(r10);
                ProgressIndicatorKt.b((Ia.a) objF, hVarD4, j12, j11, 2, f12, new L(i15), c1086gP, 1769520, 0);
            }
            c1086gP.T(r10);
            r rVar2 = r.f47939a;
            c1086gP.T(r10);
            c1086gP.T(z10);
            hVar4 = hVar6;
        } else {
            aVar = androidx.compose.ui.h.a.f13984b;
            if (i17 != 0) {
                hVar3 = aVar;
            } else {
                hVar3 = hVar2;
            }
            C0953m c0953mA3 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
            androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVar3);
            ComposeUiNode.f14331c0.getClass();
            aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, c0953mA3);
            pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P7);
            pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i13, c1086gP, i13, pVar3);
            } else {
                J4.i.d(i13, c1086gP, i13, pVar3);
            }
            pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC7);
            f10 = 16;
            Lb.a.a(c1086gP, W.e(aVar, f10));
            bVar = androidx.compose.ui.d.a.f13344k;
            androidx.compose.ui.h hVarD5 = W.d(PaddingKt.h(aVar, f10, 0.0f, 2), 1.0f);
            T tA5 = S.a(C0945e.f10290g, bVar, c1086gP, 54);
            i14 = c1086gP.f12996P;
            androidx.compose.ui.h hVar7 = hVar3;
            InterfaceC1089h0 interfaceC1089h0P8 = c1086gP.P();
            androidx.compose.ui.h hVarC8 = ComposedModifierKt.c(c1086gP, hVarD5);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, tA5);
            R0.a(pVar2, c1086gP, interfaceC1089h0P8);
            if (c1086gP.f12995O) {
                J4.i.d(i14, c1086gP, i14, pVar3);
            } else {
                J4.i.d(i14, c1086gP, i14, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC8);
            if (topBarState instanceof TopBarState.SenderTopBarState) {
                c1086gP.L(359796343);
                TopBarState.SenderTopBarState senderTopBarState3 = (TopBarState.SenderTopBarState) topBarState;
                CharSequence charSequence3 = Phrase.from((Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b), io.intercom.android.sdk.R.string.intercom_teammate_from_company).put("name", senderTopBarState3.getSenderName()).put("company", senderTopBarState3.getAppConfig().getName()).format();
                T tA6 = S.a(C0945e.f10284a, bVar, c1086gP, 48);
                i16 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P9 = c1086gP.P();
                androidx.compose.ui.h hVarC9 = ComposedModifierKt.c(c1086gP, aVar);
                c1086gP.r();
                if (c1086gP.f12995O) {
                    c1086gP.v(aVar2);
                } else {
                    c1086gP.A();
                }
                R0.a(pVar, c1086gP, tA6);
                R0.a(pVar2, c1086gP, interfaceC1089h0P9);
                if (c1086gP.f12995O) {
                    J4.i.d(i16, c1086gP, i16, pVar3);
                } else {
                    J4.i.d(i16, c1086gP, i16, pVar3);
                }
                R0.a(pVar4, c1086gP, hVarC9);
                r10 = 0;
                CircularAvatarComponentKt.m401CircularAvataraMcp0Q(senderTopBarState3.getAvatar(), Q3.d.d(senderTopBarState3.getAppConfig().getSecondaryColor()), 0.0f, c1086gP, 8, 4);
                Lb.a.a(c1086gP, W.q(aVar, 8));
                String string3 = charSequence3.toString();
                long jG3 = G0.a.g(14);
                l lVar3 = l.f15442g;
                long jM360getOnBackground0d7_KjU3 = senderTopBarState3.getSurveyUiColors().m360getOnBackground0d7_KjU();
                aVar3 = aVar;
                z10 = true;
                TextKt.b(string3, null, jM360getOnBackground0d7_KjU3, jG3, null, lVar3, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, c1086gP, 199680, 3120, 120786);
                c1086gP.T(true);
                c1086gP.T(false);
            } else {
                aVar3 = aVar;
                r10 = 0;
                z10 = true;
                if (!(topBarState instanceof TopBarState.NoTopBarState)) {
                    c1086gP.L(1535625226);
                    c1086gP.T(false);
                    throw new NoWhenBranchMatchedException();
                }
                c1086gP.L(360841663);
                Lb.a.a(c1086gP, W.q(aVar3, 1));
                c1086gP.T(false);
            }
            c1086gP.L(1535664392);
            if (topBarState.getShowDismissButton()) {
                IconKt.b(p306z.d.a(), o.p(c1086gP, io.intercom.android.sdk.R.string.intercom_dismiss), ClickableKt.c(aVar3, r10, null, onClose, 7), topBarState.getSurveyUiColors().m360getOnBackground0d7_KjU(), c1086gP, 0, 0);
            }
            c1086gP.T(r10);
            c1086gP.T(z10);
            c1086gP.L(-1116808288);
            progressBarState = topBarState.getProgressBarState();
            c1086gP.L(-1116806779);
            if (progressBarState.isVisible()) {
                Lb.a.a(c1086gP, W.e(aVar3, f10));
                n0B = C0902b.b(progressBarState.getProgress(), C0907g.d(t.d.DEFAULT_DRAG_ANIMATION_DURATION, r10, null, 6), c1086gP, 48);
                if (ColorExtensionsKt.m664isDarkColor8_81llA(topBarState.getSurveyUiColors().m356getBackground0d7_KjU())) {
                    jD = Q3.d.d(1728053247);
                } else {
                    jD = Q3.d.d(1291845632);
                }
                long j13 = jD;
                surveyUiColors = topBarState.getSurveyUiColors();
                if (!H.c(surveyUiColors.m356getBackground0d7_KjU(), surveyUiColors.m357getButton0d7_KjU())) {
                    if (H.c(surveyUiColors.m356getBackground0d7_KjU(), surveyUiColors.m357getButton0d7_KjU())) {
                        jM357getButton0d7_KjU = surveyUiColors.m357getButton0d7_KjU();
                    } else {
                        jM357getButton0d7_KjU = surveyUiColors.m357getButton0d7_KjU();
                    }
                } else if (H.c(surveyUiColors.m356getBackground0d7_KjU(), surveyUiColors.m357getButton0d7_KjU())) {
                    jM357getButton0d7_KjU = surveyUiColors.m357getButton0d7_KjU();
                } else {
                    jM357getButton0d7_KjU = surveyUiColors.m357getButton0d7_KjU();
                }
                long j14 = jM357getButton0d7_KjU;
                androidx.compose.ui.h hVarD6 = W.d(aVar3, 1.0f);
                float f13 = (float) r10;
                c1086gP.L(1535711889);
                zK = c1086gP.K(n0B);
                objF = c1086gP.f();
                if (zK) {
                    i15 = 2;
                    objF = new k(i15, n0B);
                    c1086gP.E(objF);
                } else {
                    i15 = 2;
                    objF = new k(i15, n0B);
                    c1086gP.E(objF);
                }
                c1086gP.T(r10);
                ProgressIndicatorKt.b((Ia.a) objF, hVarD6, j14, j13, 2, f13, new L(i15), c1086gP, 1769520, 0);
            }
            c1086gP.T(r10);
            r rVar3 = r.f47939a;
            c1086gP.T(r10);
            c1086gP.T(z10);
            hVar4 = hVar7;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new K(topBarState, onClose, hVar4, i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SurveyTopBar$lambda$7$lambda$6$lambda$4$lambda$3(N0 animateFloatAsState) {
        kotlin.jvm.internal.i.e(animateFloatAsState, "$animateFloatAsState");
        return ((Number) animateFloatAsState.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyTopBar$lambda$7$lambda$6$lambda$5(J.e LinearProgressIndicator) {
        kotlin.jvm.internal.i.e(LinearProgressIndicator, "$this$LinearProgressIndicator");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r SurveyTopBar$lambda$8(TopBarState topBarState, Ia.a onClose, androidx.compose.ui.h hVar, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(topBarState, "$topBarState");
        kotlin.jvm.internal.i.e(onClose, "$onClose");
        SurveyTopBar(topBarState, onClose, hVar, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }
}
