package io.intercom.android.sdk.m5.home.ui;

import Ia.l;
import Ia.p;
import Z3.o;
import androidx.compose.foundation.layout.C0945e;
import androidx.compose.foundation.layout.C0952l;
import androidx.compose.foundation.layout.C0953m;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.E;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.InterfaceC1089h0;
import androidx.compose.runtime.R0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ConversationHistoryCardKt;
import io.intercom.android.sdk.m5.components.SearchBrowseCardKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.ui.C2403s;
import io.intercom.android.sdk.m5.conversation.ui.U;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.SpaceItemType;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.components.ExternalLinkCardKt;
import io.intercom.android.sdk.m5.home.ui.components.LegacyMessengerAppCardKt;
import io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt;
import io.intercom.android.sdk.m5.home.ui.components.SpacesCardKt;
import io.intercom.android.sdk.m5.home.ui.components.TicketLinksCardKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.tickets.RecentTicketsCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.m;
import kotlin.jvm.internal.i;
import me.zhanghai.android.materialprogressbar.R;
import p050db.j;
import p050db.k;
import p293xa.r;

/* JADX INFO: compiled from: HomeContentScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HomeContentScreenKt {

    /* JADX INFO: compiled from: HomeContentScreen.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpaceItemType.values().length];
            try {
                iArr[SpaceItemType.MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpaceItemType.HELP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SpaceItemType.TICKETS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void HomeContentScreen(androidx.compose.ui.h hVar, final HomeUiState.Content content, Ia.a<r> aVar, Ia.a<r> aVar2, Ia.a<r> aVar3, l<? super String, r> lVar, Ia.a<r> aVar4, l<? super Conversation, r> lVar2, l<? super TicketType, r> lVar3, InterfaceC1084f interfaceC1084f, final int i10, final int i11) {
        Iterator it;
        l<? super Conversation, r> lVar4;
        i.e(content, "content");
        C1086g c1086gP = interfaceC1084f.p(-1476773966);
        final androidx.compose.ui.h hVar2 = (i11 & 1) != 0 ? androidx.compose.ui.h.a.f13984b : hVar;
        final Ia.a<r> c2403s = (i11 & 4) != 0 ? new C2403s(1) : aVar;
        final Ia.a<r> aVar5 = (i11 & 8) != 0 ? new M9.a(1) : aVar2;
        final Ia.a<r> bVar = (i11 & 16) != 0 ? new M9.b(1) : aVar3;
        final l<? super String, r> jVar = (i11 & 32) != 0 ? new j(1) : lVar;
        final Ia.a<r> kVar = (i11 & 64) != 0 ? new k(2) : aVar4;
        l<? super Conversation, r> u10 = (i11 & 128) != 0 ? new U(2) : lVar2;
        final l<? super TicketType, r> bVar2 = (i11 & 256) != 0 ? new b(0) : lVar3;
        androidx.compose.ui.h hVarH = PaddingKt.h(hVar2, 16, 0.0f, 2);
        C0953m c0953mA = C0952l.a(C0945e.g(10), androidx.compose.ui.d.a.f13346m, c1086gP, 6);
        int i12 = c1086gP.f12996P;
        InterfaceC1089h0 interfaceC1089h0P = c1086gP.P();
        androidx.compose.ui.h hVarC = ComposedModifierKt.c(c1086gP, hVarH);
        ComposeUiNode.f14331c0.getClass();
        Ia.a<ComposeUiNode> aVar6 = ComposeUiNode.Companion.f14333b;
        c1086gP.r();
        if (c1086gP.f12995O) {
            c1086gP.v(aVar6);
        } else {
            c1086gP.A();
        }
        R0.a(ComposeUiNode.Companion.f14337f, c1086gP, c0953mA);
        R0.a(ComposeUiNode.Companion.f14336e, c1086gP, interfaceC1089h0P);
        p<ComposeUiNode, Integer, r> pVar = ComposeUiNode.Companion.f14338g;
        if (c1086gP.f12995O || !i.a(c1086gP.f(), Integer.valueOf(i12))) {
            J4.i.d(i12, c1086gP, i12, pVar);
        }
        R0.a(ComposeUiNode.Companion.f14335d, c1086gP, hVarC);
        c1086gP.L(-1359903615);
        Iterator it2 = content.getCards().iterator();
        int i13 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.l.x();
                throw null;
            }
            HomeCards homeCards = (HomeCards) next;
            boolean z10 = homeCards instanceof HomeCards.HomeSpacesData;
            InterfaceC1084f.a.C0153a c0153a = InterfaceC1084f.a.f12980a;
            if (z10) {
                c1086gP.L(1732177237);
                HomeCards.HomeSpacesData homeSpacesData = (HomeCards.HomeSpacesData) homeCards;
                c1086gP.L(55880488);
                boolean z11 = ((((i10 & 7168) ^ 3072) > 2048 && c1086gP.K(aVar5)) || (i10 & 3072) == 2048) | ((((i10 & 896) ^ 384) > 256 && c1086gP.K(c2403s)) || (i10 & 384) == 256) | ((((57344 & i10) ^ 24576) > 16384 && c1086gP.K(bVar)) || (i10 & 24576) == 16384);
                Object objF = c1086gP.f();
                if (z11 || objF == c0153a) {
                    objF = new l() { // from class: io.intercom.android.sdk.m5.home.ui.c
                        @Override // Ia.l
                        public final Object invoke(Object obj) {
                            return HomeContentScreenKt.HomeContentScreen$lambda$12$lambda$11$lambda$8$lambda$7(c2403s, aVar5, bVar, (SpaceItemType) obj);
                        }
                    };
                    c1086gP.E(objF);
                }
                c1086gP.T(false);
                SpacesCardKt.SpacesCard(homeSpacesData, (l) objF, c1086gP, 8);
                c1086gP.T(false);
            } else if (homeCards instanceof HomeCards.HomeRecentTicketsData) {
                c1086gP.L(1732700610);
                HomeCards.HomeRecentTicketsData homeRecentTicketsData = (HomeCards.HomeRecentTicketsData) homeCards;
                if (!homeRecentTicketsData.getTickets().isEmpty()) {
                    RecentTicketsCardKt.RecentTicketsCard(null, homeCards.getCardTitle(), homeRecentTicketsData.getTickets(), jVar, c1086gP, ((i10 >> 6) & 7168) | 512, 1);
                }
                c1086gP.T(false);
            } else if (homeCards instanceof HomeCards.HomeRecentConversationData) {
                c1086gP.L(1733094620);
                HomeCards.HomeRecentConversationData homeRecentConversationData = (HomeCards.HomeRecentConversationData) homeCards;
                if (!homeRecentConversationData.getConversations().isEmpty()) {
                    ConversationHistoryCardKt.ConversationHistoryCard(null, homeCards.getCardTitle(), homeRecentConversationData.getConversations(), u10, c1086gP, ((i10 >> 12) & 7168) | 512, 1);
                }
                c1086gP.T(false);
            } else {
                if (homeCards instanceof HomeCards.HomeNewConversationData) {
                    c1086gP.L(1733520498);
                    NewConversationCardKt.NewConversationCard((HomeCards.HomeNewConversationData) homeCards, content.getAdminsAvatars(), content.getBotAvatar(), kVar, c1086gP, ((i10 >> 9) & 7168) | 584, 0);
                    c1086gP.T(false);
                } else if (homeCards instanceof HomeCards.HomeHelpCenterData) {
                    c1086gP.L(1733905797);
                    c1086gP.L(55935065);
                    boolean zH = c1086gP.h(i13);
                    Object objF2 = c1086gP.f();
                    if (zH || objF2 == c0153a) {
                        objF2 = new HomeContentScreenKt$HomeContentScreen$8$1$2$1(i13, null);
                        c1086gP.E(objF2);
                    }
                    c1086gP.T(false);
                    E.d((p) objF2, c1086gP, "");
                    HomeCards.HomeHelpCenterData homeHelpCenterData = (HomeCards.HomeHelpCenterData) homeCards;
                    boolean zIsHelpCenterRequireSearchEnabled = ((AppConfig) o.b()).isHelpCenterRequireSearchEnabled();
                    List<Participant> builtActiveAdmins = Injector.get().getDataLayer().getTeamPresence().getValue().getBuiltActiveAdmins();
                    it = it2;
                    ArrayList arrayList = new ArrayList(m.y(builtActiveAdmins, 10));
                    Iterator it3 = builtActiveAdmins.iterator();
                    while (it3.hasNext()) {
                        Participant participant = (Participant) it3.next();
                        Iterator it4 = it3;
                        Avatar avatar = participant.getAvatar();
                        l<? super Conversation, r> lVar5 = u10;
                        i.d(avatar, "getAvatar(...)");
                        Boolean boolIsBot = participant.isBot();
                        i.d(boolIsBot, "isBot(...)");
                        arrayList.add(new AvatarWrapper(avatar, boolIsBot.booleanValue()));
                        it3 = it4;
                        u10 = lVar5;
                    }
                    lVar4 = u10;
                    boolean zIsAccessToTeammateEnabled = ((AppConfig) o.b()).isAccessToTeammateEnabled();
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    i.d(metricTracker, "getMetricTracker(...)");
                    SearchBrowseCardKt.SearchBrowseCard(homeHelpCenterData, zIsHelpCenterRequireSearchEnabled, arrayList, zIsAccessToTeammateEnabled, metricTracker, c1086gP, 33288);
                    c1086gP.T(false);
                } else {
                    it = it2;
                    lVar4 = u10;
                    if (homeCards instanceof HomeCards.HomeExternalLinkData) {
                        c1086gP.L(1734773921);
                        ExternalLinkCardKt.ExternalLinkCard((HomeCards.HomeExternalLinkData) homeCards, c1086gP, 8);
                        c1086gP.T(false);
                    } else if (homeCards instanceof HomeCards.HomeMessengerAppData) {
                        c1086gP.L(1734912770);
                        LegacyMessengerAppCardKt.LegacyMessengerAppCard(((HomeCards.HomeMessengerAppData) homeCards).getFallbackUrl(), IntercomCardStyle.INSTANCE.m531defaultStyleqUnfpCA(null, 0L, 0L, 0.0f, null, 0L, c1086gP, IntercomCardStyle.$stable << 18, 63), true, c1086gP, (IntercomCardStyle.Style.$stable << 3) | 384);
                        c1086gP.T(false);
                    } else if (homeCards instanceof HomeCards.HomeTicketLinksData) {
                        c1086gP.L(1735201845);
                        TicketLinksCardKt.TicketLinksCard((HomeCards.HomeTicketLinksData) homeCards, bVar2, c1086gP, ((i10 >> 21) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8);
                        c1086gP.T(false);
                    } else {
                        c1086gP.L(1735406011);
                        c1086gP.T(false);
                    }
                }
                it2 = it;
                i13 = i14;
                u10 = lVar4;
            }
            it = it2;
            lVar4 = u10;
            it2 = it;
            i13 = i14;
            u10 = lVar4;
        }
        final l<? super Conversation, r> lVar6 = u10;
        C1105p0 c1105p0A = C4.a.a(c1086gP, false, true);
        if (c1105p0A != null) {
            c1105p0A.f13109d = new p() { // from class: io.intercom.android.sdk.m5.home.ui.d
                @Override // Ia.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return HomeContentScreenKt.HomeContentScreen$lambda$13(hVar2, content, c2403s, aVar5, bVar, jVar, kVar, lVar6, bVar2, i10, i11, (InterfaceC1084f) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeContentScreen$lambda$12$lambda$11$lambda$8$lambda$7(Ia.a aVar, Ia.a aVar2, Ia.a aVar3, SpaceItemType it) {
        i.e(it, "it");
        int i10 = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
        if (i10 == 1) {
            aVar.invoke();
        } else if (i10 == 2) {
            aVar2.invoke();
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            aVar3.invoke();
        }
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeContentScreen$lambda$13(androidx.compose.ui.h hVar, HomeUiState.Content content, Ia.a aVar, Ia.a aVar2, Ia.a aVar3, l lVar, Ia.a aVar4, l lVar2, l lVar3, int i10, int i11, InterfaceC1084f interfaceC1084f, int i12) {
        i.e(content, "$content");
        HomeContentScreen(hVar, content, aVar, aVar2, aVar3, lVar, aVar4, lVar2, lVar3, interfaceC1084f, L4.b.l(i10 | 1), i11);
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeContentScreen$lambda$3(String it) {
        i.e(it, "it");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeContentScreen$lambda$5(Conversation it) {
        i.e(it, "it");
        return r.f47939a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r HomeContentScreen$lambda$6(TicketType it) {
        i.e(it, "it");
        return r.f47939a;
    }
}
