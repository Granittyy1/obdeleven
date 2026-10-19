package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.m5.conversation.states.TicketProgressRowState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.tickets.TicketProgressBannerKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.NoWhenBranchMatchedException;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ConversationTopAppBar.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationTopAppBarKt {

    /* JADX INFO: compiled from: ConversationTopAppBar.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ConversationTopAppBar(final TopAppBarUiState topAppBarUiState, Ia.a<p293xa.r> aVar, Ia.a<p293xa.r> aVar2, Ia.a<p293xa.r> aVar3, Ia.l<? super HeaderMenuItem, p293xa.r> lVar, Ia.l<? super MetricData, p293xa.r> lVar2, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        boolean z10;
        long jM635getHeader0d7_KjU;
        long jM642getOnHeader0d7_KjU;
        long jM630getDescriptionText0d7_KjU;
        kotlin.jvm.internal.i.e(topAppBarUiState, "topAppBarUiState");
        C1086g c1086gP = interfaceC1084f.p(1613129219);
        Ia.a<p293xa.r> aVar4 = (i11 & 2) != 0 ? null : aVar;
        Ia.a<p293xa.r> aVar5 = (i11 & 4) != 0 ? new O9.a(2) : aVar2;
        Ia.a<p293xa.r> mVar = (i11 & 8) != 0 ? new p050db.m(1) : aVar3;
        Ia.l<? super HeaderMenuItem, p293xa.r> c2365n = (i11 & 16) != 0 ? new C2365n(0) : lVar;
        Ia.l<? super MetricData, p293xa.r> c2366o = (i11 & 32) != 0 ? new C2366o(0) : lVar2;
        boolean zW = O.e.w(c1086gP);
        int i12 = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        if (i12 == 1) {
            z10 = true;
        } else if (i12 == 2) {
            z10 = false;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z10 = zW;
        }
        c1086gP.L(-287873620);
        if (!z10 || topAppBarUiState.m148getBackgroundColorDarkQN2ZGVo() == null) {
            androidx.compose.ui.graphics.H hM147getBackgroundColorQN2ZGVo = topAppBarUiState.m147getBackgroundColorQN2ZGVo();
            jM635getHeader0d7_KjU = hM147getBackgroundColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m635getHeader0d7_KjU() : hM147getBackgroundColorQN2ZGVo.f13506a;
        } else {
            jM635getHeader0d7_KjU = topAppBarUiState.m148getBackgroundColorDarkQN2ZGVo().f13506a;
        }
        c1086gP.T(false);
        N0 n0A = androidx.compose.animation.x.a(jM635getHeader0d7_KjU, null, "bgColorState", c1086gP, 384, 10);
        c1086gP.L(-287862139);
        if (!z10 || topAppBarUiState.m150getContentColorDarkQN2ZGVo() == null) {
            androidx.compose.ui.graphics.H hM149getContentColorQN2ZGVo = topAppBarUiState.m149getContentColorQN2ZGVo();
            jM642getOnHeader0d7_KjU = hM149getContentColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m642getOnHeader0d7_KjU() : hM149getContentColorQN2ZGVo.f13506a;
        } else {
            jM642getOnHeader0d7_KjU = topAppBarUiState.m150getContentColorDarkQN2ZGVo().f13506a;
        }
        c1086gP.T(false);
        N0 n0A2 = androidx.compose.animation.x.a(jM642getOnHeader0d7_KjU, null, "contentColorState", c1086gP, 384, 10);
        c1086gP.L(-287850801);
        if (!z10 || topAppBarUiState.m152getSubTitleColorDarkQN2ZGVo() == null) {
            androidx.compose.ui.graphics.H hM151getSubTitleColorQN2ZGVo = topAppBarUiState.m151getSubTitleColorQN2ZGVo();
            jM630getDescriptionText0d7_KjU = hM151getSubTitleColorQN2ZGVo == null ? IntercomTheme.INSTANCE.getColors(c1086gP, IntercomTheme.$stable).m630getDescriptionText0d7_KjU() : hM151getSubTitleColorQN2ZGVo.f13506a;
        } else {
            jM630getDescriptionText0d7_KjU = topAppBarUiState.m152getSubTitleColorDarkQN2ZGVo().f13506a;
        }
        c1086gP.T(false);
        N0 n0A3 = androidx.compose.animation.x.a(jM630getDescriptionText0d7_KjU, null, "subTitleColorState", c1086gP, 384, 10);
        androidx.compose.ui.h.a aVar6 = androidx.compose.ui.h.a.f13984b;
        C0953m c0953mA = C0952l.a(C0945e.f10286c, androidx.compose.ui.d.a.f13346m, c1086gP, 0);
        int i13 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, aVar6);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar7 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar7);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        Ia.p<ComposeUiNode, Integer, p293xa.r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !kotlin.jvm.internal.i.a(c1086gP.f(), Integer.valueOf(i13))) {
            J4.i.d(i13, c1086gP, i13, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        StringProvider title = topAppBarUiState.getTitle();
        int i14 = StringProvider.$stable;
        String text = title.getText(c1086gP, i14);
        StringProvider subTitle = topAppBarUiState.getSubTitle();
        c1086gP.L(603575221);
        String text2 = subTitle == null ? null : subTitle.getText(c1086gP, i14);
        c1086gP.T(false);
        final Ia.l<? super HeaderMenuItem, p293xa.r> lVar3 = c2365n;
        final Ia.l<? super MetricData, p293xa.r> lVar4 = c2366o;
        TopActionBarKt.m130TopActionBarNpQZenA(null, text, text2, topAppBarUiState.getSubTitleLeadingIcon(), topAppBarUiState.getAvatars(), aVar4, topAppBarUiState.getNavIcon(), topAppBarUiState.getDisplayActiveIndicator(), ((androidx.compose.ui.graphics.H) n0A.getValue()).f13506a, ((androidx.compose.ui.graphics.H) n0A2.getValue()).f13506a, ((androidx.compose.ui.graphics.H) n0A3.getValue()).f13506a, aVar5, androidx.compose.runtime.internal.a.b(-69139937, new ConversationTopAppBarKt$ConversationTopAppBar$5$1(topAppBarUiState, c2365n, n0A2, c2366o), c1086gP), c1086gP, ((i10 << 12) & 458752) | 32768, ((i10 >> 3) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 384, 1);
        TicketProgressRowState ticketStatusState = topAppBarUiState.getTicketStatusState();
        c1086gP.L(603606749);
        if (ticketStatusState != null) {
            TicketProgressBannerKt.TicketProgressBanner(topAppBarUiState.getTicketStatusState().getName(), mVar, true, null, c1086gP, ((i10 >> 6) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 384, 8);
        }
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            final Ia.a<p293xa.r> aVar8 = aVar4;
            final Ia.a<p293xa.r> aVar9 = aVar5;
            final Ia.a<p293xa.r> aVar10 = mVar;
            c1105p0A.f13109d = new Ia.p() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.p
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ConversationTopAppBarKt.ConversationTopAppBar$lambda$6(topAppBarUiState, aVar8, aVar9, aVar10, lVar3, lVar4, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationTopAppBar$lambda$2(HeaderMenuItem it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationTopAppBar$lambda$3(MetricData it) {
        kotlin.jvm.internal.i.e(it, "it");
        return p293xa.r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p293xa.r ConversationTopAppBar$lambda$6(TopAppBarUiState topAppBarUiState, Ia.a aVar, Ia.a aVar2, Ia.a aVar3, Ia.l lVar, Ia.l lVar2, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        kotlin.jvm.internal.i.e(topAppBarUiState, "$topAppBarUiState");
        ConversationTopAppBar(topAppBarUiState, aVar, aVar2, aVar3, lVar, lVar2, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return p293xa.r.f47939a;
    }
}
