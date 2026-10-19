package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.C0932d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.W;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.graphics.C1144u;
import androidx.compose.ui.graphics.C1146w;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.h0;
import androidx.compose.ui.layout.E;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.F;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.components.A0;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.m5.components.z0;
import io.intercom.android.sdk.m5.conversation.ui.components.row.v;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomButton;
import io.intercom.android.sdk.ui.component.IntercomButtonKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;

/* JADX INFO: compiled from: TeamPresenceComponent.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TeamPresenceComponentKt {
    private static final ArticleViewState.TeamPresenceState mockTeamPresenceState;

    static {
        int i10 = R.string.intercom_the_team_can_help_if_needed;
        mockTeamPresenceState = new ArticleViewState.TeamPresenceState(null, null, Integer.valueOf(i10), R.string.intercom_send_us_a_message, R.drawable.intercom_new_conversation_send_button, -16777216, "article", MetricTracker.Context.STYLE_HUMAN, false, new OpenMessengerResponse.NewConversationData.Cta("Send us a message", "The team can help if needed", OpenMessengerResponse.IconType.PAPER_PLANE));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x012b  */
    /* JADX WARN: Code duplicated, block: B:63:0x012d  */
    /* JADX WARN: Code duplicated, block: B:66:0x013e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0155  */
    /* JADX WARN: Code duplicated, block: B:73:0x016e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0183  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x0248  */
    /* JADX WARN: Code duplicated, block: B:85:0x025a  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final void TeamPresenceComponent(final ArticleViewState.TeamPresenceState teamPresenceState, boolean z10, TeamPresenceButtonStyle teamPresenceButtonStyle, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        int i12;
        boolean z11;
        int i13;
        TeamPresenceButtonStyle teamPresenceButtonStyle2;
        int i14;
        boolean z12;
        TeamPresenceButtonStyle teamPresenceButtonStyle3;
        final Context context;
        androidx.compose.ui.h.a aVar;
        int i15;
        Ia.a<ComposeUiNode> aVar2;
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar;
        String strP;
        Integer numValueOf;
        Integer subtitleText;
        String strP2;
        Integer num;
        String str;
        String str2;
        boolean z13;
        int i16;
        final boolean z14;
        final TeamPresenceButtonStyle teamPresenceButtonStyle4;
        Integer icon;
        C1105p0 c1105p0V;
        kotlin.jvm.internal.i.e(teamPresenceState, "teamPresenceState");
        C1086g c1086gP = interfaceC1084f.p(-696298916);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (c1086gP.K(teamPresenceState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                z11 = z10;
                i12 |= c1086gP.c(z11) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    teamPresenceButtonStyle2 = teamPresenceButtonStyle;
                    if (c1086gP.K(teamPresenceButtonStyle2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i12 & 731) == 146 || !c1086gP.s()) {
                    if (i17 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i13 != 0) {
                        teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                    } else {
                        teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                    }
                    context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                    aVar = androidx.compose.ui.h.a.f13984b;
                    androidx.compose.ui.h hVarH = PaddingKt.h(W.d(aVar, 1.0f), 0.0f, 24, 1);
                    C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
                    i15 = c1086gP.f12996P;
                    InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
                    androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarH);
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
                    pVar = ComposeUiNode.Companion.f14338g;
                    if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i15))) {
                        J4.i.d(i15, c1086gP, i15, pVar);
                    }
                    R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
                    c1086gP.L(-937558243);
                    if (z12) {
                        IntercomDividerKt.IntercomDivider(PaddingKt.j(W.q(aVar, 100), 0.0f, 0.0f, 0.0f, 16, 7), c1086gP, 6, 0);
                    }
                    c1086gP.T(false);
                    strP = S4.o.p(c1086gP, teamPresenceState.getMessageButtonText());
                    numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                    subtitleText = teamPresenceState.getSubtitleText();
                    c1086gP.L(-937545761);
                    if (subtitleText == null) {
                        strP2 = null;
                    } else {
                        strP2 = S4.o.p(c1086gP, subtitleText.intValue());
                    }
                    c1086gP.T(false);
                    if (teamPresenceState.getCtaData() != null) {
                        strP = teamPresenceState.getCtaData().getText();
                        icon = teamPresenceState.getCtaData().getIcon().getIcon();
                        if (icon != null) {
                            numValueOf = icon;
                        }
                        strP2 = teamPresenceState.getCtaData().getSubtitle();
                    }
                    num = numValueOf;
                    str = strP2;
                    c1086gP.L(-937533382);
                    if (teamPresenceState.getConversationState() != null) {
                        strP = S4.o.p(c1086gP, teamPresenceState.getConversationState().getMessageButtonText());
                    }
                    str2 = strP;
                    c1086gP.T(false);
                    if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                        c1086gP.L(1001451744);
                        z13 = false;
                        IntercomPrimaryButtonKt.IntercomPrimaryButton(str2, null, num, new v(teamPresenceState, 1, context), c1086gP, 0, 2);
                        c1086gP.T(false);
                        i16 = 16;
                    } else {
                        z13 = false;
                        c1086gP.L(1001651663);
                        IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m522outlinedStyleKlgxPg(0L, 0L, null, c1086gP, IntercomButton.$stable << 9, 7), str2, num, new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.q
                            @Override // Ia.a
                            public final Object invoke() {
                                return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(teamPresenceState, context);
                            }
                        }, c1086gP, IntercomButton.Style.$stable << 3, 1);
                        c1086gP.T(false);
                        i16 = 16;
                    }
                    Lb.a.a(c1086gP, W.e(aVar, i16));
                    c1086gP.L(-937510359);
                    if (str != null) {
                        TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5(), Q3.d.e(4285887861L), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, 0, 0, 65534);
                    }
                    c1086gP.T(z13);
                    c1086gP.T(true);
                    z14 = z12;
                    teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                } else {
                    c1086gP.w();
                    z14 = z11;
                    teamPresenceButtonStyle4 = teamPresenceButtonStyle2;
                }
                c1105p0V = c1086gP.V();
                if (c1105p0V != null) {
                    c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.r
                        @Override // Ia.p
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$4(teamPresenceState, z14, teamPresenceButtonStyle4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                        }
                    };
                }
            }
            i12 |= 384;
            teamPresenceButtonStyle2 = teamPresenceButtonStyle;
            if ((i12 & 731) == 146) {
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i13 != 0) {
                    teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                } else {
                    teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                }
                context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                aVar = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarH2 = PaddingKt.h(W.d(aVar, 1.0f), 0.0f, 24, 1);
                C0953m c0953mA2 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
                androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarH2);
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
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                } else {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC2);
                c1086gP.L(-937558243);
                if (z12) {
                    IntercomDividerKt.IntercomDivider(PaddingKt.j(W.q(aVar, 100), 0.0f, 0.0f, 0.0f, 16, 7), c1086gP, 6, 0);
                }
                c1086gP.T(false);
                strP = S4.o.p(c1086gP, teamPresenceState.getMessageButtonText());
                numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                subtitleText = teamPresenceState.getSubtitleText();
                c1086gP.L(-937545761);
                if (subtitleText == null) {
                    strP2 = null;
                } else {
                    strP2 = S4.o.p(c1086gP, subtitleText.intValue());
                }
                c1086gP.T(false);
                if (teamPresenceState.getCtaData() != null) {
                    strP = teamPresenceState.getCtaData().getText();
                    icon = teamPresenceState.getCtaData().getIcon().getIcon();
                    if (icon != null) {
                        numValueOf = icon;
                    }
                    strP2 = teamPresenceState.getCtaData().getSubtitle();
                }
                num = numValueOf;
                str = strP2;
                c1086gP.L(-937533382);
                if (teamPresenceState.getConversationState() != null) {
                    strP = S4.o.p(c1086gP, teamPresenceState.getConversationState().getMessageButtonText());
                }
                str2 = strP;
                c1086gP.T(false);
                if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                    c1086gP.L(1001451744);
                    z13 = false;
                    IntercomPrimaryButtonKt.IntercomPrimaryButton(str2, null, num, new v(teamPresenceState, 1, context), c1086gP, 0, 2);
                    c1086gP.T(false);
                    i16 = 16;
                } else {
                    z13 = false;
                    c1086gP.L(1001651663);
                    IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m522outlinedStyleKlgxPg(0L, 0L, null, c1086gP, IntercomButton.$stable << 9, 7), str2, num, new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.q
                        @Override // Ia.a
                        public final Object invoke() {
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(teamPresenceState, context);
                        }
                    }, c1086gP, IntercomButton.Style.$stable << 3, 1);
                    c1086gP.T(false);
                    i16 = 16;
                }
                Lb.a.a(c1086gP, W.e(aVar, i16));
                c1086gP.L(-937510359);
                if (str != null) {
                    TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5(), Q3.d.e(4285887861L), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, 0, 0, 65534);
                }
                c1086gP.T(z13);
                c1086gP.T(true);
                z14 = z12;
                teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
            } else {
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i13 != 0) {
                    teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                } else {
                    teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                }
                context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                aVar = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarH3 = PaddingKt.h(W.d(aVar, 1.0f), 0.0f, 24, 1);
                C0953m c0953mA3 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P3 = c1086gP.P();
                androidx.compose.ui.h hVarC3 = ComposedModifierKt.c(c1086gP, hVarH3);
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
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                } else {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC3);
                c1086gP.L(-937558243);
                if (z12) {
                    IntercomDividerKt.IntercomDivider(PaddingKt.j(W.q(aVar, 100), 0.0f, 0.0f, 0.0f, 16, 7), c1086gP, 6, 0);
                }
                c1086gP.T(false);
                strP = S4.o.p(c1086gP, teamPresenceState.getMessageButtonText());
                numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                subtitleText = teamPresenceState.getSubtitleText();
                c1086gP.L(-937545761);
                if (subtitleText == null) {
                    strP2 = null;
                } else {
                    strP2 = S4.o.p(c1086gP, subtitleText.intValue());
                }
                c1086gP.T(false);
                if (teamPresenceState.getCtaData() != null) {
                    strP = teamPresenceState.getCtaData().getText();
                    icon = teamPresenceState.getCtaData().getIcon().getIcon();
                    if (icon != null) {
                        numValueOf = icon;
                    }
                    strP2 = teamPresenceState.getCtaData().getSubtitle();
                }
                num = numValueOf;
                str = strP2;
                c1086gP.L(-937533382);
                if (teamPresenceState.getConversationState() != null) {
                    strP = S4.o.p(c1086gP, teamPresenceState.getConversationState().getMessageButtonText());
                }
                str2 = strP;
                c1086gP.T(false);
                if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                    c1086gP.L(1001451744);
                    z13 = false;
                    IntercomPrimaryButtonKt.IntercomPrimaryButton(str2, null, num, new v(teamPresenceState, 1, context), c1086gP, 0, 2);
                    c1086gP.T(false);
                    i16 = 16;
                } else {
                    z13 = false;
                    c1086gP.L(1001651663);
                    IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m522outlinedStyleKlgxPg(0L, 0L, null, c1086gP, IntercomButton.$stable << 9, 7), str2, num, new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.q
                        @Override // Ia.a
                        public final Object invoke() {
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(teamPresenceState, context);
                        }
                    }, c1086gP, IntercomButton.Style.$stable << 3, 1);
                    c1086gP.T(false);
                    i16 = 16;
                }
                Lb.a.a(c1086gP, W.e(aVar, i16));
                c1086gP.L(-937510359);
                if (str != null) {
                    TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5(), Q3.d.e(4285887861L), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, 0, 0, 65534);
                }
                c1086gP.T(z13);
                c1086gP.T(true);
                z14 = z12;
                teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.r
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TeamPresenceComponentKt.TeamPresenceComponent$lambda$4(teamPresenceState, z14, teamPresenceButtonStyle4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 48;
        z11 = z10;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                teamPresenceButtonStyle2 = teamPresenceButtonStyle;
                if (c1086gP.K(teamPresenceButtonStyle2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i12 & 731) == 146) {
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i13 != 0) {
                    teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                } else {
                    teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                }
                context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                aVar = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarH4 = PaddingKt.h(W.d(aVar, 1.0f), 0.0f, 24, 1);
                C0953m c0953mA4 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P4 = c1086gP.P();
                androidx.compose.ui.h hVarC4 = ComposedModifierKt.c(c1086gP, hVarH4);
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
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                } else {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC4);
                c1086gP.L(-937558243);
                if (z12) {
                    IntercomDividerKt.IntercomDivider(PaddingKt.j(W.q(aVar, 100), 0.0f, 0.0f, 0.0f, 16, 7), c1086gP, 6, 0);
                }
                c1086gP.T(false);
                strP = S4.o.p(c1086gP, teamPresenceState.getMessageButtonText());
                numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                subtitleText = teamPresenceState.getSubtitleText();
                c1086gP.L(-937545761);
                if (subtitleText == null) {
                    strP2 = null;
                } else {
                    strP2 = S4.o.p(c1086gP, subtitleText.intValue());
                }
                c1086gP.T(false);
                if (teamPresenceState.getCtaData() != null) {
                    strP = teamPresenceState.getCtaData().getText();
                    icon = teamPresenceState.getCtaData().getIcon().getIcon();
                    if (icon != null) {
                        numValueOf = icon;
                    }
                    strP2 = teamPresenceState.getCtaData().getSubtitle();
                }
                num = numValueOf;
                str = strP2;
                c1086gP.L(-937533382);
                if (teamPresenceState.getConversationState() != null) {
                    strP = S4.o.p(c1086gP, teamPresenceState.getConversationState().getMessageButtonText());
                }
                str2 = strP;
                c1086gP.T(false);
                if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                    c1086gP.L(1001451744);
                    z13 = false;
                    IntercomPrimaryButtonKt.IntercomPrimaryButton(str2, null, num, new v(teamPresenceState, 1, context), c1086gP, 0, 2);
                    c1086gP.T(false);
                    i16 = 16;
                } else {
                    z13 = false;
                    c1086gP.L(1001651663);
                    IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m522outlinedStyleKlgxPg(0L, 0L, null, c1086gP, IntercomButton.$stable << 9, 7), str2, num, new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.q
                        @Override // Ia.a
                        public final Object invoke() {
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(teamPresenceState, context);
                        }
                    }, c1086gP, IntercomButton.Style.$stable << 3, 1);
                    c1086gP.T(false);
                    i16 = 16;
                }
                Lb.a.a(c1086gP, W.e(aVar, i16));
                c1086gP.L(-937510359);
                if (str != null) {
                    TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5(), Q3.d.e(4285887861L), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, 0, 0, 65534);
                }
                c1086gP.T(z13);
                c1086gP.T(true);
                z14 = z12;
                teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
            } else {
                if (i17 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i13 != 0) {
                    teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
                } else {
                    teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
                }
                context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
                aVar = androidx.compose.ui.h.a.f13984b;
                androidx.compose.ui.h hVarH5 = PaddingKt.h(W.d(aVar, 1.0f), 0.0f, 24, 1);
                C0953m c0953mA5 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
                i15 = c1086gP.f12996P;
                InterfaceC1089h0 interfaceC1089h0P5 = c1086gP.P();
                androidx.compose.ui.h hVarC5 = ComposedModifierKt.c(c1086gP, hVarH5);
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
                pVar = ComposeUiNode.Companion.f14338g;
                if (c1086gP.f12995O) {
                    J4.i.d(i15, c1086gP, i15, pVar);
                } else {
                    J4.i.d(i15, c1086gP, i15, pVar);
                }
                R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC5);
                c1086gP.L(-937558243);
                if (z12) {
                    IntercomDividerKt.IntercomDivider(PaddingKt.j(W.q(aVar, 100), 0.0f, 0.0f, 0.0f, 16, 7), c1086gP, 6, 0);
                }
                c1086gP.T(false);
                strP = S4.o.p(c1086gP, teamPresenceState.getMessageButtonText());
                numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                subtitleText = teamPresenceState.getSubtitleText();
                c1086gP.L(-937545761);
                if (subtitleText == null) {
                    strP2 = null;
                } else {
                    strP2 = S4.o.p(c1086gP, subtitleText.intValue());
                }
                c1086gP.T(false);
                if (teamPresenceState.getCtaData() != null) {
                    strP = teamPresenceState.getCtaData().getText();
                    icon = teamPresenceState.getCtaData().getIcon().getIcon();
                    if (icon != null) {
                        numValueOf = icon;
                    }
                    strP2 = teamPresenceState.getCtaData().getSubtitle();
                }
                num = numValueOf;
                str = strP2;
                c1086gP.L(-937533382);
                if (teamPresenceState.getConversationState() != null) {
                    strP = S4.o.p(c1086gP, teamPresenceState.getConversationState().getMessageButtonText());
                }
                str2 = strP;
                c1086gP.T(false);
                if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                    c1086gP.L(1001451744);
                    z13 = false;
                    IntercomPrimaryButtonKt.IntercomPrimaryButton(str2, null, num, new v(teamPresenceState, 1, context), c1086gP, 0, 2);
                    c1086gP.T(false);
                    i16 = 16;
                } else {
                    z13 = false;
                    c1086gP.L(1001651663);
                    IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m522outlinedStyleKlgxPg(0L, 0L, null, c1086gP, IntercomButton.$stable << 9, 7), str2, num, new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.q
                        @Override // Ia.a
                        public final Object invoke() {
                            return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(teamPresenceState, context);
                        }
                    }, c1086gP, IntercomButton.Style.$stable << 3, 1);
                    c1086gP.T(false);
                    i16 = 16;
                }
                Lb.a.a(c1086gP, W.e(aVar, i16));
                c1086gP.L(-937510359);
                if (str != null) {
                    TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5(), Q3.d.e(4285887861L), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, 0, 0, 65534);
                }
                c1086gP.T(z13);
                c1086gP.T(true);
                z14 = z12;
                teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
            }
            c1105p0V = c1086gP.V();
            if (c1105p0V != null) {
                c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.r
                    @Override // Ia.p
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return TeamPresenceComponentKt.TeamPresenceComponent$lambda$4(teamPresenceState, z14, teamPresenceButtonStyle4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                    }
                };
            }
        }
        i12 |= 384;
        teamPresenceButtonStyle2 = teamPresenceButtonStyle;
        if ((i12 & 731) == 146) {
            if (i17 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i13 != 0) {
                teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
            } else {
                teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
            }
            context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarH6 = PaddingKt.h(W.d(aVar, 1.0f), 0.0f, 24, 1);
            C0953m c0953mA6 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P6 = c1086gP.P();
            androidx.compose.ui.h hVarC6 = ComposedModifierKt.c(c1086gP, hVarH6);
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
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC6);
            c1086gP.L(-937558243);
            if (z12) {
                IntercomDividerKt.IntercomDivider(PaddingKt.j(W.q(aVar, 100), 0.0f, 0.0f, 0.0f, 16, 7), c1086gP, 6, 0);
            }
            c1086gP.T(false);
            strP = S4.o.p(c1086gP, teamPresenceState.getMessageButtonText());
            numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
            subtitleText = teamPresenceState.getSubtitleText();
            c1086gP.L(-937545761);
            if (subtitleText == null) {
                strP2 = null;
            } else {
                strP2 = S4.o.p(c1086gP, subtitleText.intValue());
            }
            c1086gP.T(false);
            if (teamPresenceState.getCtaData() != null) {
                strP = teamPresenceState.getCtaData().getText();
                icon = teamPresenceState.getCtaData().getIcon().getIcon();
                if (icon != null) {
                    numValueOf = icon;
                }
                strP2 = teamPresenceState.getCtaData().getSubtitle();
            }
            num = numValueOf;
            str = strP2;
            c1086gP.L(-937533382);
            if (teamPresenceState.getConversationState() != null) {
                strP = S4.o.p(c1086gP, teamPresenceState.getConversationState().getMessageButtonText());
            }
            str2 = strP;
            c1086gP.T(false);
            if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                c1086gP.L(1001451744);
                z13 = false;
                IntercomPrimaryButtonKt.IntercomPrimaryButton(str2, null, num, new v(teamPresenceState, 1, context), c1086gP, 0, 2);
                c1086gP.T(false);
                i16 = 16;
            } else {
                z13 = false;
                c1086gP.L(1001651663);
                IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m522outlinedStyleKlgxPg(0L, 0L, null, c1086gP, IntercomButton.$stable << 9, 7), str2, num, new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.q
                    @Override // Ia.a
                    public final Object invoke() {
                        return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(teamPresenceState, context);
                    }
                }, c1086gP, IntercomButton.Style.$stable << 3, 1);
                c1086gP.T(false);
                i16 = 16;
            }
            Lb.a.a(c1086gP, W.e(aVar, i16));
            c1086gP.L(-937510359);
            if (str != null) {
                TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5(), Q3.d.e(4285887861L), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, 0, 0, 65534);
            }
            c1086gP.T(z13);
            c1086gP.T(true);
            z14 = z12;
            teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
        } else {
            if (i17 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i13 != 0) {
                teamPresenceButtonStyle3 = TeamPresenceButtonStyle.SECONDARY;
            } else {
                teamPresenceButtonStyle3 = teamPresenceButtonStyle2;
            }
            context = (Context) c1086gP.x(AndroidCompositionLocals_androidKt.f14793b);
            aVar = androidx.compose.ui.h.a.f13984b;
            androidx.compose.ui.h hVarH7 = PaddingKt.h(W.d(aVar, 1.0f), 0.0f, 24, 1);
            C0953m c0953mA7 = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13347n, c1086gP, 48);
            i15 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P7 = c1086gP.P();
            androidx.compose.ui.h hVarC7 = ComposedModifierKt.c(c1086gP, hVarH7);
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
            pVar = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O) {
                J4.i.d(i15, c1086gP, i15, pVar);
            } else {
                J4.i.d(i15, c1086gP, i15, pVar);
            }
            R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC7);
            c1086gP.L(-937558243);
            if (z12) {
                IntercomDividerKt.IntercomDivider(PaddingKt.j(W.q(aVar, 100), 0.0f, 0.0f, 0.0f, 16, 7), c1086gP, 6, 0);
            }
            c1086gP.T(false);
            strP = S4.o.p(c1086gP, teamPresenceState.getMessageButtonText());
            numValueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
            subtitleText = teamPresenceState.getSubtitleText();
            c1086gP.L(-937545761);
            if (subtitleText == null) {
                strP2 = null;
            } else {
                strP2 = S4.o.p(c1086gP, subtitleText.intValue());
            }
            c1086gP.T(false);
            if (teamPresenceState.getCtaData() != null) {
                strP = teamPresenceState.getCtaData().getText();
                icon = teamPresenceState.getCtaData().getIcon().getIcon();
                if (icon != null) {
                    numValueOf = icon;
                }
                strP2 = teamPresenceState.getCtaData().getSubtitle();
            }
            num = numValueOf;
            str = strP2;
            c1086gP.L(-937533382);
            if (teamPresenceState.getConversationState() != null) {
                strP = S4.o.p(c1086gP, teamPresenceState.getConversationState().getMessageButtonText());
            }
            str2 = strP;
            c1086gP.T(false);
            if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                c1086gP.L(1001451744);
                z13 = false;
                IntercomPrimaryButtonKt.IntercomPrimaryButton(str2, null, num, new v(teamPresenceState, 1, context), c1086gP, 0, 2);
                c1086gP.T(false);
                i16 = 16;
            } else {
                z13 = false;
                c1086gP.L(1001651663);
                IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m522outlinedStyleKlgxPg(0L, 0L, null, c1086gP, IntercomButton.$stable << 9, 7), str2, num, new Ia.a() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.q
                    @Override // Ia.a
                    public final Object invoke() {
                        return TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(teamPresenceState, context);
                    }
                }, c1086gP, IntercomButton.Style.$stable << 3, 1);
                c1086gP.T(false);
                i16 = 16;
            }
            Lb.a.a(c1086gP, W.e(aVar, i16));
            c1086gP.L(-937510359);
            if (str != null) {
                TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, F.a(IntercomTheme.INSTANCE.getTypography(c1086gP, IntercomTheme.$stable).getType04Point5(), Q3.d.e(4285887861L), 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), c1086gP, 0, 0, 65534);
            }
            c1086gP.T(z13);
            c1086gP.T(true);
            z14 = z12;
            teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
        }
        c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.r
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TeamPresenceComponentKt.TeamPresenceComponent$lambda$4(teamPresenceState, z14, teamPresenceButtonStyle4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeamPresenceComponent$lambda$3$lambda$1(ArticleViewState.TeamPresenceState teamPresenceState, Context context) {
        kotlin.jvm.internal.i.e(teamPresenceState, "$teamPresenceState");
        kotlin.jvm.internal.i.e(context, "$context");
        TeamPresenceComponent$onClick(context, teamPresenceState);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeamPresenceComponent$lambda$3$lambda$2(ArticleViewState.TeamPresenceState teamPresenceState, Context context) {
        kotlin.jvm.internal.i.e(teamPresenceState, "$teamPresenceState");
        kotlin.jvm.internal.i.e(context, "$context");
        TeamPresenceComponent$onClick(context, teamPresenceState);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeamPresenceComponent$lambda$4(ArticleViewState.TeamPresenceState teamPresenceState, boolean z10, TeamPresenceButtonStyle teamPresenceButtonStyle, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(teamPresenceState, "$teamPresenceState");
        TeamPresenceComponent(teamPresenceState, z10, teamPresenceButtonStyle, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }

    private static final void TeamPresenceComponent$onClick(Context context, ArticleViewState.TeamPresenceState teamPresenceState) {
        Injector.get().getMetricTracker().clickedNewConversation(teamPresenceState.getMetricPlace(), teamPresenceState.getMetricContext(), teamPresenceState.isFromSearchBrowse());
        if (teamPresenceState.getConversationState() != null) {
            ConversationScreenOpenerKt.openComposer$default(context, null, false, null, teamPresenceState.getConversationState().getConversationId(), 14, null);
        } else if (teamPresenceState.getArticleMetadata() != null) {
            ConversationScreenOpenerKt.openComposer$default(context, null, false, teamPresenceState.getArticleMetadata(), null, 22, null);
        } else {
            ConversationScreenOpenerKt.openComposer$default(context, null, false, null, null, 30, null);
        }
    }

    public static final void TeamPresenceComponentWithBubble(final ArticleViewState.TeamPresenceState teamPresenceState, InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        boolean z10;
        kotlin.jvm.internal.i.e(teamPresenceState, "teamPresenceState");
        C1086g c1086gP = interfaceC1084f.p(1539837505);
        if ((i10 & 14) == 0) {
            i11 = (c1086gP.K(teamPresenceState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            float f10 = ((Configuration) c1086gP.x(AndroidCompositionLocals_androidKt.f14792a)).screenWidthDp;
            final long jM624getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m624getBubbleBackground0d7_KjU();
            androidx.compose.ui.h.a aVar = androidx.compose.ui.h.a.f13984b;
            C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
            int i12 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
            androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar);
            ComposeUiNode.f14331c0.getClass();
            Ia.a<ComposeUiNode> aVar2 = ComposeUiNode.Companion.f14333b;
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            Ia.p<ComposeUiNode, E, p293xa.r> pVar = ComposeUiNode.Companion.f14337f;
            R0.a(pVar, c1086gP, c0953mA);
            Ia.p<ComposeUiNode, androidx.compose.runtime.r, p293xa.r> pVar2 = ComposeUiNode.Companion.f14336e;
            R0.a(pVar2, c1086gP, interfaceC1089h0P);
            Ia.p<ComposeUiNode, Integer, p293xa.r> pVar3 = ComposeUiNode.Companion.f14338g;
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i12))) {
                J4.i.d(i12, c1086gP, i12, pVar3);
            }
            Ia.p<ComposeUiNode, androidx.compose.ui.h, p293xa.r> pVar4 = ComposeUiNode.Companion.f14335d;
            R0.a(pVar4, c1086gP, hVarC);
            c1086gP.L(-745953431);
            Integer subtitleText = teamPresenceState.getSubtitleText();
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (subtitleText != null) {
                androidx.compose.ui.h hVarB = OffsetKt.b((f10 / 2.0f) - 60, 0, aVar);
                c1086gP.L(-745947382);
                boolean zI = c1086gP.i(jM624getBubbleBackground0d7_KjU);
                Object objF = c1086gP.f();
                if (zI || objF == c0153a) {
                    objF = new Ia.l() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.m
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6(jM624getBubbleBackground0d7_KjU, (CacheDrawScope) obj);
                        }
                    };
                    c1086gP.E(objF);
                }
                z10 = false;
                c1086gP.T(false);
                Lb.a.a(c1086gP, W.m(androidx.compose.ui.draw.f.b(hVarB, (Ia.l) objF), 16));
            } else {
                z10 = false;
            }
            c1086gP.T(z10);
            float f11 = 24;
            androidx.compose.ui.h hVarR = A8.p.r(PaddingKt.j(aVar, f11, 0.0f, f11, f11, 2), p270w.g.b(8));
            boolean z11 = teamPresenceState.getSubtitleText() != null;
            c1086gP.L(-745925551);
            boolean zI2 = c1086gP.i(jM624getBubbleBackground0d7_KjU);
            Object objF2 = c1086gP.f();
            if (zI2 || objF2 == c0153a) {
                objF2 = new Ia.l() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.n
                    @Override // Ia.l
                    public final Object invoke(Object obj) {
                        return TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$11$lambda$9$lambda$8(jM624getBubbleBackground0d7_KjU, (androidx.compose.ui.h) obj);
                    }
                };
                c1086gP.E(objF2);
            }
            c1086gP.T(false);
            androidx.compose.ui.h hVarIfTrue = ModifierExtensionsKt.ifTrue(hVarR, z11, (Ia.l) objF2);
            E eD = BoxKt.d(androidx.compose.ui.d.a.f13335a, false);
            int i13 = c1086gP.f12996P;
            InterfaceC1089h0 interfaceC1089h0P2 = c1086gP.P();
            androidx.compose.ui.h hVarC2 = ComposedModifierKt.c(c1086gP, hVarIfTrue);
            c1086gP.r();
            if (c1086gP.f12995O) {
                c1086gP.v(aVar2);
            } else {
                c1086gP.A();
            }
            R0.a(pVar, c1086gP, eD);
            R0.a(pVar2, c1086gP, interfaceC1089h0P2);
            if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
                J4.i.d(i13, c1086gP, i13, pVar3);
            }
            R0.a(pVar4, c1086gP, hVarC2);
            TeamPresenceComponent(teamPresenceState, false, TeamPresenceButtonStyle.PRIMARY, c1086gP, (i11 & 14) | 432, 0);
            c1086gP.T(true);
            c1086gP.T(true);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.o
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$12(teamPresenceState, i10, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.draw.g TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6(final long j, CacheDrawScope drawWithCache) {
        kotlin.jvm.internal.i.e(drawWithCache, "$this$drawWithCache");
        final C1144u c1144uA = C1146w.a();
        c1144uA.l(0.0f, Float.intBitsToFloat((int) (drawWithCache.f13369b.j() & 4294967295L)));
        c1144uA.t(Float.intBitsToFloat((int) (drawWithCache.f13369b.j() >> 32)) / 2.0f, Float.intBitsToFloat((int) (drawWithCache.f13369b.j() & 4294967295L)) / 2.0f);
        c1144uA.t(Float.intBitsToFloat((int) (drawWithCache.f13369b.j() >> 32)), Float.intBitsToFloat((int) (drawWithCache.f13369b.j() & 4294967295L)));
        c1144uA.close();
        return drawWithCache.c(new Ia.l() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.p
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6$lambda$5(c1144uA, j, (J.e) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6$lambda$5(Path path, long j, J.e onDrawBehind) {
        kotlin.jvm.internal.i.e(path, "$path");
        kotlin.jvm.internal.i.e(onDrawBehind, "$this$onDrawBehind");
        J.e.N(onDrawBehind, path, j, null, null, 60);
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.h TeamPresenceComponentWithBubble$lambda$11$lambda$9$lambda$8(long j, androidx.compose.ui.h ifTrue) {
        kotlin.jvm.internal.i.e(ifTrue, "$this$ifTrue");
        return C0932d.b(ifTrue, j, h0.f13629a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeamPresenceComponentWithBubble$lambda$12(ArticleViewState.TeamPresenceState teamPresenceState, int i10, InterfaceC1084f interfaceC1084f, int i11) {
        kotlin.jvm.internal.i.e(teamPresenceState, "$teamPresenceState");
        TeamPresenceComponentWithBubble(teamPresenceState, interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TeamPresencePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-161512363);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamPresenceComponentKt.INSTANCE.m289getLambda4$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new A0(i10, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeamPresencePreview$lambda$14(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TeamPresencePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }

    @IntercomPreviews
    public static final void TeamPresenceWithBubblePreview(InterfaceC1084f interfaceC1084f, int i10) {
        C1086g c1086gP = interfaceC1084f.p(-1128132221);
        if (i10 == 0 && c1086gP.s()) {
            c1086gP.w();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamPresenceComponentKt.INSTANCE.m287getLambda2$intercom_sdk_base_release(), c1086gP, 3072, 7);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new z0(i10, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r TeamPresenceWithBubblePreview$lambda$13(int i10, InterfaceC1084f interfaceC1084f, int i11) {
        TeamPresenceWithBubblePreview(interfaceC1084f, L4.b.l(i10 | 1));
        return p293xa.r.f47939a;
    }
}
