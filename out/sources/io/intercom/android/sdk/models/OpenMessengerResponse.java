package io.intercom.android.sdk.models;

import Ba.a;
import I7.b;
import com.braze.models.inappmessage.InAppMessageBase;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: OpenMessengerResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class OpenMessengerResponse {
    public static final int $stable = 8;

    @b("composer_state")
    private final ComposerState composerState;

    @b(MetricTracker.Object.COMPOSER_SUGGESTIONS)
    private final ComposerSuggestions composerSuggestions;

    @b("new_conversation")
    private final NewConversationData newConversationData;

    @b("open_inbound_conversation_ids")
    private final List<String> openInboundConversations;

    @b("powered_by")
    private final PoweredBy poweredBy;

    @b("privacy_policy_notice")
    private final PrivacyNotice privacyNotice;

    @b("request_id")
    private final String requestId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: OpenMessengerResponse.kt */
    public static final class IconType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ IconType[] $VALUES;

        @b("chevron")
        public static final IconType CHEVRON = new CHEVRON("CHEVRON", 0);

        @b("question_bubble")
        public static final IconType QUESTION_BUBBLE = new QUESTION_BUBBLE("QUESTION_BUBBLE", 1);

        @b("paper_plane")
        public static final IconType PAPER_PLANE = new PAPER_PLANE("PAPER_PLANE", 2);

        /* JADX INFO: compiled from: OpenMessengerResponse.kt */
        public static final class CHEVRON extends IconType {
            public CHEVRON(String str, int i10) {
                super(str, i10, null);
            }

            @Override // io.intercom.android.sdk.models.OpenMessengerResponse.IconType
            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_chevron);
            }
        }

        /* JADX INFO: compiled from: OpenMessengerResponse.kt */
        public static final class PAPER_PLANE extends IconType {
            public PAPER_PLANE(String str, int i10) {
                super(str, i10, null);
            }

            @Override // io.intercom.android.sdk.models.OpenMessengerResponse.IconType
            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_send_message_icon);
            }
        }

        /* JADX INFO: compiled from: OpenMessengerResponse.kt */
        public static final class QUESTION_BUBBLE extends IconType {
            public QUESTION_BUBBLE(String str, int i10) {
                super(str, i10, null);
            }

            @Override // io.intercom.android.sdk.models.OpenMessengerResponse.IconType
            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_conversation_card_question);
            }
        }

        private static final /* synthetic */ IconType[] $values() {
            return new IconType[]{CHEVRON, QUESTION_BUBBLE, PAPER_PLANE};
        }

        static {
            IconType[] iconTypeArr$values = $values();
            $VALUES = iconTypeArr$values;
            $ENTRIES = kotlin.enums.a.a(iconTypeArr$values);
        }

        public /* synthetic */ IconType(String str, int i10, e eVar) {
            this(str, i10);
        }

        public static a<IconType> getEntries() {
            return $ENTRIES;
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) $VALUES.clone();
        }

        public abstract Integer getIcon();

        private IconType(String str, int i10) {
            super(str, i10);
        }
    }

    public OpenMessengerResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenMessengerResponse copy$default(OpenMessengerResponse openMessengerResponse, ComposerSuggestions composerSuggestions, NewConversationData newConversationData, ComposerState composerState, String str, PoweredBy poweredBy, List list, PrivacyNotice privacyNotice, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            composerSuggestions = openMessengerResponse.composerSuggestions;
        }
        if ((i10 & 2) != 0) {
            newConversationData = openMessengerResponse.newConversationData;
        }
        NewConversationData newConversationData2 = newConversationData;
        if ((i10 & 4) != 0) {
            composerState = openMessengerResponse.composerState;
        }
        ComposerState composerState2 = composerState;
        if ((i10 & 8) != 0) {
            str = openMessengerResponse.requestId;
        }
        String str2 = str;
        if ((i10 & 16) != 0) {
            poweredBy = openMessengerResponse.poweredBy;
        }
        PoweredBy poweredBy2 = poweredBy;
        if ((i10 & 32) != 0) {
            list = openMessengerResponse.openInboundConversations;
        }
        List list2 = list;
        if ((i10 & 64) != 0) {
            privacyNotice = openMessengerResponse.privacyNotice;
        }
        return openMessengerResponse.copy(composerSuggestions, newConversationData2, composerState2, str2, poweredBy2, list2, privacyNotice);
    }

    public final ComposerSuggestions component1() {
        return this.composerSuggestions;
    }

    public final NewConversationData component2() {
        return this.newConversationData;
    }

    public final ComposerState component3() {
        return this.composerState;
    }

    public final String component4() {
        return this.requestId;
    }

    public final PoweredBy component5() {
        return this.poweredBy;
    }

    public final List<String> component6() {
        return this.openInboundConversations;
    }

    public final PrivacyNotice component7() {
        return this.privacyNotice;
    }

    public final OpenMessengerResponse copy(ComposerSuggestions composerSuggestions, NewConversationData newConversationData, ComposerState composerState, String str, PoweredBy poweredBy, List<String> openInboundConversations, PrivacyNotice privacyNotice) {
        i.e(composerState, "composerState");
        i.e(openInboundConversations, "openInboundConversations");
        return new OpenMessengerResponse(composerSuggestions, newConversationData, composerState, str, poweredBy, openInboundConversations, privacyNotice);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenMessengerResponse)) {
            return false;
        }
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) obj;
        return i.a(this.composerSuggestions, openMessengerResponse.composerSuggestions) && i.a(this.newConversationData, openMessengerResponse.newConversationData) && i.a(this.composerState, openMessengerResponse.composerState) && i.a(this.requestId, openMessengerResponse.requestId) && i.a(this.poweredBy, openMessengerResponse.poweredBy) && i.a(this.openInboundConversations, openMessengerResponse.openInboundConversations) && i.a(this.privacyNotice, openMessengerResponse.privacyNotice);
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final ComposerSuggestions getComposerSuggestions() {
        return this.composerSuggestions;
    }

    public final NewConversationData getNewConversationData() {
        return this.newConversationData;
    }

    public final List<String> getOpenInboundConversations() {
        return this.openInboundConversations;
    }

    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    public final PrivacyNotice getPrivacyNotice() {
        return this.privacyNotice;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        ComposerSuggestions composerSuggestions = this.composerSuggestions;
        int iHashCode = (composerSuggestions == null ? 0 : composerSuggestions.hashCode()) * 31;
        NewConversationData newConversationData = this.newConversationData;
        int iHashCode2 = (this.composerState.hashCode() + ((iHashCode + (newConversationData == null ? 0 : newConversationData.hashCode())) * 31)) * 31;
        String str = this.requestId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PoweredBy poweredBy = this.poweredBy;
        int iD = p.d((iHashCode3 + (poweredBy == null ? 0 : poweredBy.hashCode())) * 31, 31, this.openInboundConversations);
        PrivacyNotice privacyNotice = this.privacyNotice;
        return iD + (privacyNotice != null ? privacyNotice.hashCode() : 0);
    }

    public String toString() {
        return "OpenMessengerResponse(composerSuggestions=" + this.composerSuggestions + ", newConversationData=" + this.newConversationData + ", composerState=" + this.composerState + ", requestId=" + this.requestId + ", poweredBy=" + this.poweredBy + ", openInboundConversations=" + this.openInboundConversations + ", privacyNotice=" + this.privacyNotice + ')';
    }

    public OpenMessengerResponse(ComposerSuggestions composerSuggestions, NewConversationData newConversationData, ComposerState composerState, String str, PoweredBy poweredBy, List<String> openInboundConversations, PrivacyNotice privacyNotice) {
        i.e(composerState, "composerState");
        i.e(openInboundConversations, "openInboundConversations");
        this.composerSuggestions = composerSuggestions;
        this.newConversationData = newConversationData;
        this.composerState = composerState;
        this.requestId = str;
        this.poweredBy = poweredBy;
        this.openInboundConversations = openInboundConversations;
        this.privacyNotice = privacyNotice;
    }

    /* JADX INFO: compiled from: OpenMessengerResponse.kt */
    public static final class NewConversationData {
        public static final int $stable = 8;

        @b("cta")
        private final Cta cta;

        @b("header")
        private final Header header;

        @b("home_card")
        private final HomeCard homeCard;

        @b("participants")
        private final List<Participant.Builder> participants;

        @b("parts")
        private final List<Part.Builder> parts;

        @b("special_notice")
        private final String specialNotice;

        @b("team_intro")
        private final String teamIntro;

        public NewConversationData(Cta cta, HomeCard homeCard, List<Part.Builder> parts, List<Participant.Builder> participants, Header header, String str, String str2) {
            i.e(cta, "cta");
            i.e(homeCard, "homeCard");
            i.e(parts, "parts");
            i.e(participants, "participants");
            this.cta = cta;
            this.homeCard = homeCard;
            this.parts = parts;
            this.participants = participants;
            this.header = header;
            this.teamIntro = str;
            this.specialNotice = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NewConversationData copy$default(NewConversationData newConversationData, Cta cta, HomeCard homeCard, List list, List list2, Header header, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cta = newConversationData.cta;
            }
            if ((i10 & 2) != 0) {
                homeCard = newConversationData.homeCard;
            }
            HomeCard homeCard2 = homeCard;
            if ((i10 & 4) != 0) {
                list = newConversationData.parts;
            }
            List list3 = list;
            if ((i10 & 8) != 0) {
                list2 = newConversationData.participants;
            }
            List list4 = list2;
            if ((i10 & 16) != 0) {
                header = newConversationData.header;
            }
            Header header2 = header;
            if ((i10 & 32) != 0) {
                str = newConversationData.teamIntro;
            }
            String str3 = str;
            if ((i10 & 64) != 0) {
                str2 = newConversationData.specialNotice;
            }
            return newConversationData.copy(cta, homeCard2, list3, list4, header2, str3, str2);
        }

        public final Cta component1() {
            return this.cta;
        }

        public final HomeCard component2() {
            return this.homeCard;
        }

        public final List<Part.Builder> component3() {
            return this.parts;
        }

        public final List<Participant.Builder> component4() {
            return this.participants;
        }

        public final Header component5() {
            return this.header;
        }

        public final String component6() {
            return this.teamIntro;
        }

        public final String component7() {
            return this.specialNotice;
        }

        public final NewConversationData copy(Cta cta, HomeCard homeCard, List<Part.Builder> parts, List<Participant.Builder> participants, Header header, String str, String str2) {
            i.e(cta, "cta");
            i.e(homeCard, "homeCard");
            i.e(parts, "parts");
            i.e(participants, "participants");
            return new NewConversationData(cta, homeCard, parts, participants, header, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewConversationData)) {
                return false;
            }
            NewConversationData newConversationData = (NewConversationData) obj;
            return i.a(this.cta, newConversationData.cta) && i.a(this.homeCard, newConversationData.homeCard) && i.a(this.parts, newConversationData.parts) && i.a(this.participants, newConversationData.participants) && i.a(this.header, newConversationData.header) && i.a(this.teamIntro, newConversationData.teamIntro) && i.a(this.specialNotice, newConversationData.specialNotice);
        }

        public final Cta getCta() {
            return this.cta;
        }

        public final Header getHeader() {
            return this.header;
        }

        public final HomeCard getHomeCard() {
            return this.homeCard;
        }

        public final List<Participant.Builder> getParticipants() {
            return this.participants;
        }

        public final List<Part.Builder> getParts() {
            return this.parts;
        }

        public final String getSpecialNotice() {
            return this.specialNotice;
        }

        public final String getTeamIntro() {
            return this.teamIntro;
        }

        public int hashCode() {
            int iD = p.d(p.d((this.homeCard.hashCode() + (this.cta.hashCode() * 31)) * 31, 31, this.parts), 31, this.participants);
            Header header = this.header;
            int iHashCode = (iD + (header == null ? 0 : header.hashCode())) * 31;
            String str = this.teamIntro;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.specialNotice;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("NewConversationData(cta=");
            sb2.append(this.cta);
            sb2.append(", homeCard=");
            sb2.append(this.homeCard);
            sb2.append(", parts=");
            sb2.append(this.parts);
            sb2.append(", participants=");
            sb2.append(this.participants);
            sb2.append(", header=");
            sb2.append(this.header);
            sb2.append(", teamIntro=");
            sb2.append(this.teamIntro);
            sb2.append(", specialNotice=");
            return B7.b.g(sb2, this.specialNotice, ')');
        }

        /* JADX INFO: compiled from: OpenMessengerResponse.kt */
        public static final class Cta {
            public static final int $stable = 0;

            @b(InAppMessageBase.ICON)
            private final IconType icon;

            @b("subtitle")
            private final String subtitle;

            @b(AttributeType.TEXT)
            private final String text;

            public Cta(String text, String str, IconType icon) {
                i.e(text, "text");
                i.e(icon, "icon");
                this.text = text;
                this.subtitle = str;
                this.icon = icon;
            }

            public static /* synthetic */ Cta copy$default(Cta cta, String str, String str2, IconType iconType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = cta.text;
                }
                if ((i10 & 2) != 0) {
                    str2 = cta.subtitle;
                }
                if ((i10 & 4) != 0) {
                    iconType = cta.icon;
                }
                return cta.copy(str, str2, iconType);
            }

            public final String component1() {
                return this.text;
            }

            public final String component2() {
                return this.subtitle;
            }

            public final IconType component3() {
                return this.icon;
            }

            public final Cta copy(String text, String str, IconType icon) {
                i.e(text, "text");
                i.e(icon, "icon");
                return new Cta(text, str, icon);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Cta)) {
                    return false;
                }
                Cta cta = (Cta) obj;
                return i.a(this.text, cta.text) && i.a(this.subtitle, cta.subtitle) && this.icon == cta.icon;
            }

            public final IconType getIcon() {
                return this.icon;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                String str = this.subtitle;
                return this.icon.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public String toString() {
                return "Cta(text=" + this.text + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ')';
            }

            public /* synthetic */ Cta(String str, String str2, IconType iconType, int i10, e eVar) {
                this(str, (i10 & 2) != 0 ? null : str2, iconType);
            }
        }

        /* JADX INFO: compiled from: OpenMessengerResponse.kt */
        public static final class HomeCard {
            public static final int $stable = 8;

            @b("avatar_details")
            private final AvatarDetails avatarDetails;

            @b(InAppMessageBase.ICON)
            private final IconType icon;

            @b("subtitle")
            private final String subtitle;

            @b(AttributeType.TEXT)
            private final String text;

            public HomeCard(String text, String str, AvatarDetails avatarDetails, IconType iconType) {
                i.e(text, "text");
                this.text = text;
                this.subtitle = str;
                this.avatarDetails = avatarDetails;
                this.icon = iconType;
            }

            public static /* synthetic */ HomeCard copy$default(HomeCard homeCard, String str, String str2, AvatarDetails avatarDetails, IconType iconType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = homeCard.text;
                }
                if ((i10 & 2) != 0) {
                    str2 = homeCard.subtitle;
                }
                if ((i10 & 4) != 0) {
                    avatarDetails = homeCard.avatarDetails;
                }
                if ((i10 & 8) != 0) {
                    iconType = homeCard.icon;
                }
                return homeCard.copy(str, str2, avatarDetails, iconType);
            }

            public final String component1() {
                return this.text;
            }

            public final String component2() {
                return this.subtitle;
            }

            public final AvatarDetails component3() {
                return this.avatarDetails;
            }

            public final IconType component4() {
                return this.icon;
            }

            public final HomeCard copy(String text, String str, AvatarDetails avatarDetails, IconType iconType) {
                i.e(text, "text");
                return new HomeCard(text, str, avatarDetails, iconType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof HomeCard)) {
                    return false;
                }
                HomeCard homeCard = (HomeCard) obj;
                return i.a(this.text, homeCard.text) && i.a(this.subtitle, homeCard.subtitle) && i.a(this.avatarDetails, homeCard.avatarDetails) && this.icon == homeCard.icon;
            }

            public final AvatarDetails getAvatarDetails() {
                return this.avatarDetails;
            }

            public final IconType getIcon() {
                return this.icon;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final String getText() {
                return this.text;
            }

            public int hashCode() {
                int iHashCode = this.text.hashCode() * 31;
                String str = this.subtitle;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                AvatarDetails avatarDetails = this.avatarDetails;
                int iHashCode3 = (iHashCode2 + (avatarDetails == null ? 0 : avatarDetails.hashCode())) * 31;
                IconType iconType = this.icon;
                return iHashCode3 + (iconType != null ? iconType.hashCode() : 0);
            }

            public String toString() {
                return "HomeCard(text=" + this.text + ", subtitle=" + this.subtitle + ", avatarDetails=" + this.avatarDetails + ", icon=" + this.icon + ')';
            }

            public /* synthetic */ HomeCard(String str, String str2, AvatarDetails avatarDetails, IconType iconType, int i10, e eVar) {
                this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : avatarDetails, (i10 & 8) != 0 ? null : iconType);
            }
        }

        public NewConversationData(Cta cta, HomeCard homeCard, List list, List list2, Header header, String str, String str2, int i10, e eVar) {
            this(cta, homeCard, (i10 & 4) != 0 ? EmptyList.f42983b : list, (i10 & 8) != 0 ? EmptyList.f42983b : list2, (i10 & 16) != 0 ? null : header, (i10 & 32) != 0 ? null : str, (i10 & 64) != 0 ? null : str2);
        }
    }

    public OpenMessengerResponse(ComposerSuggestions composerSuggestions, NewConversationData newConversationData, ComposerState composerState, String str, PoweredBy poweredBy, List list, PrivacyNotice privacyNotice, int i10, e eVar) {
        this((i10 & 1) != 0 ? null : composerSuggestions, (i10 & 2) != 0 ? null : newConversationData, (i10 & 4) != 0 ? ComposerState.Companion.getNULL() : composerState, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : poweredBy, (i10 & 32) != 0 ? EmptyList.f42983b : list, (i10 & 64) != 0 ? null : privacyNotice);
    }
}
