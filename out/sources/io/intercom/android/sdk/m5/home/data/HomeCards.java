package io.intercom.android.sdk.m5.home.data;

import I7.b;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Ticket;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: HomeV2Response.kt */
/* JADX INFO: loaded from: classes3.dex */
public class HomeCards {
    public static final int $stable = 0;

    @b("card_title")
    private final String cardTitle;

    @b("type")
    private final HomeCardType type;

    /* JADX INFO: compiled from: HomeV2Response.kt */
    public static final class HomeExternalLinkData extends HomeCards {
        public static final int $stable = 8;

        @b("links")
        private final List<Link> links;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeExternalLinkData(String cardTitle, HomeCardType type, List<Link> links) {
            super(cardTitle, type);
            i.e(cardTitle, "cardTitle");
            i.e(type, "type");
            i.e(links, "links");
            this.links = links;
        }

        public final List<Link> getLinks() {
            return this.links;
        }
    }

    /* JADX INFO: compiled from: HomeV2Response.kt */
    public static final class HomeHelpCenterData extends HomeCards {
        public static final int $stable = 8;

        @b("suggested_articles")
        private final List<SuggestedArticle> suggestedArticles;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeHelpCenterData(String cardTitle, HomeCardType type, List<SuggestedArticle> suggestedArticles) {
            super(cardTitle, type);
            i.e(cardTitle, "cardTitle");
            i.e(type, "type");
            i.e(suggestedArticles, "suggestedArticles");
            this.suggestedArticles = suggestedArticles;
        }

        public final List<SuggestedArticle> getSuggestedArticles() {
            return this.suggestedArticles;
        }
    }

    /* JADX INFO: compiled from: HomeV2Response.kt */
    public static final class HomeMessengerAppData extends HomeCards {
        public static final int $stable = 0;

        @b("fallback_url")
        private final String fallbackUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeMessengerAppData(String cardTitle, HomeCardType type, String fallbackUrl) {
            super(cardTitle, type);
            i.e(cardTitle, "cardTitle");
            i.e(type, "type");
            i.e(fallbackUrl, "fallbackUrl");
            this.fallbackUrl = fallbackUrl;
        }

        public final String getFallbackUrl() {
            return this.fallbackUrl;
        }
    }

    /* JADX INFO: compiled from: HomeV2Response.kt */
    public static final class HomeNewConversationData extends HomeCards {
        public static final int $stable = 8;

        @b("action")
        private final Action action;
        private final OpenMessengerResponse.NewConversationData.HomeCard homeCard;

        @b("open_inbound_conversation_ids")
        private final List<String> openInboundConversationsIds;

        @b("prevent_multiple_inbound_conversations_enabled")
        private final boolean preventMultipleInboundConversationsEnabled;

        @b("show_fin_avatar")
        private final boolean showFinAvatar;

        @b("show_teammate_expectations")
        private final boolean showTeammateExpectations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeNewConversationData(String cardTitle, HomeCardType type, Action action, boolean z10, List<String> openInboundConversationsIds, boolean z11, boolean z12, OpenMessengerResponse.NewConversationData.HomeCard homeCard) {
            super(cardTitle, type);
            i.e(cardTitle, "cardTitle");
            i.e(type, "type");
            i.e(action, "action");
            i.e(openInboundConversationsIds, "openInboundConversationsIds");
            this.action = action;
            this.preventMultipleInboundConversationsEnabled = z10;
            this.openInboundConversationsIds = openInboundConversationsIds;
            this.showFinAvatar = z11;
            this.showTeammateExpectations = z12;
            this.homeCard = homeCard;
        }

        public final Action getAction() {
            return this.action;
        }

        public final OpenMessengerResponse.NewConversationData.HomeCard getHomeCard() {
            return this.homeCard;
        }

        public final List<String> getOpenInboundConversationsIds() {
            return this.openInboundConversationsIds;
        }

        public final boolean getPreventMultipleInboundConversationsEnabled() {
            return this.preventMultipleInboundConversationsEnabled;
        }

        public final boolean getShowFinAvatar() {
            return this.showFinAvatar;
        }

        public final boolean getShowTeammateExpectations() {
            return this.showTeammateExpectations;
        }
    }

    /* JADX INFO: compiled from: HomeV2Response.kt */
    public static final class HomeRecentConversationData extends HomeCards {
        public static final int $stable = 8;

        @b("conversations")
        private final List<Conversation> conversations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeRecentConversationData(String cardTitle, HomeCardType type, List<Conversation> conversations) {
            super(cardTitle, type);
            i.e(cardTitle, "cardTitle");
            i.e(type, "type");
            i.e(conversations, "conversations");
            this.conversations = conversations;
        }

        public final List<Conversation> getConversations() {
            return this.conversations;
        }
    }

    /* JADX INFO: compiled from: HomeV2Response.kt */
    public static final class HomeRecentTicketsData extends HomeCards {
        public static final int $stable = 8;

        @b("tickets")
        private final List<Ticket> tickets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeRecentTicketsData(String cardTitle, HomeCardType type, List<Ticket> tickets) {
            super(cardTitle, type);
            i.e(cardTitle, "cardTitle");
            i.e(type, "type");
            i.e(tickets, "tickets");
            this.tickets = tickets;
        }

        public final List<Ticket> getTickets() {
            return this.tickets;
        }
    }

    /* JADX INFO: compiled from: HomeV2Response.kt */
    public static final class HomeSpacesData extends HomeCards {
        public static final int $stable = 8;

        @b("space_items")
        private final List<SpaceItem> spaceItems;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeSpacesData(String cardTitle, HomeCardType type, List<SpaceItem> spaceItems) {
            super(cardTitle, type);
            i.e(cardTitle, "cardTitle");
            i.e(type, "type");
            i.e(spaceItems, "spaceItems");
            this.spaceItems = spaceItems;
        }

        public final List<SpaceItem> getSpaceItems() {
            return this.spaceItems;
        }
    }

    /* JADX INFO: compiled from: HomeV2Response.kt */
    public static final class UnSupported extends HomeCards {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnSupported(String cardTitle, HomeCardType type) {
            super(cardTitle, type);
            i.e(cardTitle, "cardTitle");
            i.e(type, "type");
        }
    }

    public HomeCards(String cardTitle, HomeCardType type) {
        i.e(cardTitle, "cardTitle");
        i.e(type, "type");
        this.cardTitle = cardTitle;
        this.type = type;
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final HomeCardType getType() {
        return this.type;
    }

    /* JADX INFO: compiled from: HomeV2Response.kt */
    public static final class HomeTicketLinksData extends HomeCards {
        public static final int $stable = 8;

        @b("links")
        private final List<TicketLink> links;

        public /* synthetic */ HomeTicketLinksData(String str, HomeCardType homeCardType, List list, int i10, e eVar) {
            this((i10 & 1) != 0 ? "" : str, homeCardType, list);
        }

        public final List<TicketLink> getLinks() {
            return this.links;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HomeTicketLinksData(String cardTitle, HomeCardType type, List<TicketLink> links) {
            super(cardTitle, type);
            i.e(cardTitle, "cardTitle");
            i.e(type, "type");
            i.e(links, "links");
            this.links = links;
        }
    }
}
