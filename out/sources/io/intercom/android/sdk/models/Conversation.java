package io.intercom.android.sdk.models;

import B1.a;
import I7.b;
import androidx.compose.animation.D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.collections.q;
import kotlin.collections.x;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.p;

/* JADX INFO: compiled from: Conversation.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Conversation {
    public static final int $stable = 8;

    @b("composer_state")
    private final ComposerState composerState;

    @b("conversation_ended_button")
    private final ConversationEndedButton conversationEndedButton;

    @b("footer_notice")
    private final FooterNotice footerNotice;

    @b("group_conversation_participant_ids")
    private final List<String> groupConversationParticipantIds;
    private final Header header;
    private final String id;

    @b("inbound_conversations_disabled")
    private final boolean inboundConversationsDisabled;

    @b("is_inbound")
    private final boolean isInbound;

    @b("read")
    private final boolean isRead;

    @b("last_participating_admin")
    private final LastParticipatingAdmin.Builder lastParticipatingAdminBuilder;

    @b("notification_status")
    private final String notificationStatus;

    @b("conversation_parts")
    private final List<Part.Builder> partBuilderList;

    @b("participants")
    private final List<Participant.Builder> participantBuilderList;

    @b("powered_by")
    private final PoweredBy poweredBy;

    @b("prevent_end_user_replies")
    private final boolean preventEndUserReplies;

    @b("special_notice")
    private final String specialNotice;
    private final String state;

    @b("team_intro")
    private final String teamIntro;
    private final Ticket ticket;

    @b("ui_flags")
    private final ConversationUiFlags uiFlags;

    public Conversation() {
        this(null, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.notificationStatus;
    }

    public final String component11() {
        return this.state;
    }

    public final boolean component12() {
        return this.isInbound;
    }

    public final Ticket component13() {
        return this.ticket;
    }

    public final ConversationUiFlags component14() {
        return this.uiFlags;
    }

    public final Header component15() {
        return this.header;
    }

    public final ConversationEndedButton component16() {
        return this.conversationEndedButton;
    }

    public final FooterNotice component17() {
        return this.footerNotice;
    }

    public final PoweredBy component18() {
        return this.poweredBy;
    }

    public final String component19() {
        return this.teamIntro;
    }

    public final boolean component2() {
        return this.isRead;
    }

    public final String component20() {
        return this.specialNotice;
    }

    public final List<Participant.Builder> component3() {
        return this.participantBuilderList;
    }

    public final List<Part.Builder> component4() {
        return this.partBuilderList;
    }

    public final List<String> component5() {
        return this.groupConversationParticipantIds;
    }

    public final LastParticipatingAdmin.Builder component6() {
        return this.lastParticipatingAdminBuilder;
    }

    public final ComposerState component7() {
        return this.composerState;
    }

    public final boolean component8() {
        return this.preventEndUserReplies;
    }

    public final boolean component9() {
        return this.inboundConversationsDisabled;
    }

    public final Conversation copy(String id, boolean z10, List<Participant.Builder> participantBuilderList, List<Part.Builder> partBuilderList, List<String> groupConversationParticipantIds, LastParticipatingAdmin.Builder lastParticipatingAdminBuilder, ComposerState composerState, boolean z11, boolean z12, String notificationStatus, String state, boolean z13, Ticket ticket, ConversationUiFlags uiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str, String str2) {
        i.e(id, "id");
        i.e(participantBuilderList, "participantBuilderList");
        i.e(partBuilderList, "partBuilderList");
        i.e(groupConversationParticipantIds, "groupConversationParticipantIds");
        i.e(lastParticipatingAdminBuilder, "lastParticipatingAdminBuilder");
        i.e(composerState, "composerState");
        i.e(notificationStatus, "notificationStatus");
        i.e(state, "state");
        i.e(uiFlags, "uiFlags");
        return new Conversation(id, z10, participantBuilderList, partBuilderList, groupConversationParticipantIds, lastParticipatingAdminBuilder, composerState, z11, z12, notificationStatus, state, z13, ticket, uiFlags, header, conversationEndedButton, footerNotice, poweredBy, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) obj;
        return i.a(this.id, conversation.id) && this.isRead == conversation.isRead && i.a(this.participantBuilderList, conversation.participantBuilderList) && i.a(this.partBuilderList, conversation.partBuilderList) && i.a(this.groupConversationParticipantIds, conversation.groupConversationParticipantIds) && i.a(this.lastParticipatingAdminBuilder, conversation.lastParticipatingAdminBuilder) && i.a(this.composerState, conversation.composerState) && this.preventEndUserReplies == conversation.preventEndUserReplies && this.inboundConversationsDisabled == conversation.inboundConversationsDisabled && i.a(this.notificationStatus, conversation.notificationStatus) && i.a(this.state, conversation.state) && this.isInbound == conversation.isInbound && i.a(this.ticket, conversation.ticket) && i.a(this.uiFlags, conversation.uiFlags) && i.a(this.header, conversation.header) && i.a(this.conversationEndedButton, conversation.conversationEndedButton) && i.a(this.footerNotice, conversation.footerNotice) && i.a(this.poweredBy, conversation.poweredBy) && i.a(this.teamIntro, conversation.teamIntro) && i.a(this.specialNotice, conversation.specialNotice);
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final ConversationEndedButton getConversationEndedButton() {
        return this.conversationEndedButton;
    }

    public final FooterNotice getFooterNotice() {
        return this.footerNotice;
    }

    public final List<String> getGroupConversationParticipantIds() {
        return this.groupConversationParticipantIds;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.id;
    }

    public final boolean getInboundConversationsDisabled() {
        return this.inboundConversationsDisabled;
    }

    public final Part getLastAdminPart() {
        Part partPrevious;
        List<Part> listParts = parts();
        ListIterator<Part> listIterator = listParts.listIterator(listParts.size());
        do {
            if (!listIterator.hasPrevious()) {
                partPrevious = null;
                break;
            }
            partPrevious = listIterator.previous();
        } while (!partPrevious.isAdmin());
        Part part = partPrevious;
        if (part != null) {
            return part;
        }
        Part NULL = Part.NULL;
        i.d(NULL, "NULL");
        return NULL;
    }

    public final LastParticipatingAdmin.Builder getLastParticipatingAdminBuilder() {
        return this.lastParticipatingAdminBuilder;
    }

    public final String getNotificationStatus() {
        return this.notificationStatus;
    }

    public final List<Part.Builder> getPartBuilderList() {
        return this.partBuilderList;
    }

    public final List<Participant.Builder> getParticipantBuilderList() {
        return this.participantBuilderList;
    }

    public final Map<String, Participant> getParticipants() {
        List<Participant.Builder> list = this.participantBuilderList;
        int iN = x.n(m.y(list, 10));
        if (iN < 16) {
            iN = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iN);
        for (Participant.Builder builder : list) {
            Pair pair = new Pair(builder.build().getId(), builder.build());
            linkedHashMap.put(pair.c(), pair.d());
        }
        return linkedHashMap;
    }

    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    public final boolean getPreventEndUserReplies() {
        return this.preventEndUserReplies;
    }

    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTeamIntro() {
        return this.teamIntro;
    }

    public final Ticket getTicket() {
        return this.ticket;
    }

    public final ConversationUiFlags getUiFlags() {
        return this.uiFlags;
    }

    public final List<Participant> groupConversationParticipants() {
        List<String> list = this.groupConversationParticipantIds;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Participant participant = getParticipants().get((String) it.next());
            if (participant != null) {
                arrayList.add(participant);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        int iB = D.b(a.b(this.state, a.b(this.notificationStatus, D.b(D.b((this.composerState.hashCode() + ((this.lastParticipatingAdminBuilder.hashCode() + p.d(p.d(p.d(D.b(this.id.hashCode() * 31, 31, this.isRead), 31, this.participantBuilderList), 31, this.partBuilderList), 31, this.groupConversationParticipantIds)) * 31)) * 31, 31, this.preventEndUserReplies), 31, this.inboundConversationsDisabled), 31), 31), 31, this.isInbound);
        Ticket ticket = this.ticket;
        int iHashCode = (this.uiFlags.hashCode() + ((iB + (ticket == null ? 0 : ticket.hashCode())) * 31)) * 31;
        Header header = this.header;
        int iHashCode2 = (iHashCode + (header == null ? 0 : header.hashCode())) * 31;
        ConversationEndedButton conversationEndedButton = this.conversationEndedButton;
        int iHashCode3 = (iHashCode2 + (conversationEndedButton == null ? 0 : conversationEndedButton.hashCode())) * 31;
        FooterNotice footerNotice = this.footerNotice;
        int iHashCode4 = (iHashCode3 + (footerNotice == null ? 0 : footerNotice.hashCode())) * 31;
        PoweredBy poweredBy = this.poweredBy;
        int iHashCode5 = (iHashCode4 + (poweredBy == null ? 0 : poweredBy.hashCode())) * 31;
        String str = this.teamIntro;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.specialNotice;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isInbound() {
        return this.isInbound;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final Participant lastAdmin() {
        Object obj = null;
        for (Object obj2 : getParticipants().values()) {
            if (((Participant) obj2).isAdmin()) {
                obj = obj2;
            }
        }
        Participant participant = (Participant) obj;
        if (participant != null) {
            return participant;
        }
        Participant NULL = Participant.NULL;
        i.d(NULL, "NULL");
        return NULL;
    }

    public final Part lastPart() {
        Part part = (Part) q.W(parts());
        if (part != null) {
            return part;
        }
        Part NULL = Part.NULL;
        i.d(NULL, "NULL");
        return NULL;
    }

    public final LastParticipatingAdmin lastParticipatingAdmin() {
        LastParticipatingAdmin lastParticipatingAdminBuild = this.lastParticipatingAdminBuilder.build();
        i.d(lastParticipatingAdminBuild, "build(...)");
        return lastParticipatingAdminBuild;
    }

    public final List<Part> parts() {
        List<Part.Builder> list = this.partBuilderList;
        ArrayList arrayList = new ArrayList(m.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Part partBuild = ((Part.Builder) it.next()).build();
            Participant participant = getParticipants().get(partBuild.getParticipantId());
            if (participant != null) {
                partBuild.setParticipant(participant);
            }
            arrayList.add(partBuild);
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Conversation(id=");
        sb2.append(this.id);
        sb2.append(", isRead=");
        sb2.append(this.isRead);
        sb2.append(", participantBuilderList=");
        sb2.append(this.participantBuilderList);
        sb2.append(", partBuilderList=");
        sb2.append(this.partBuilderList);
        sb2.append(", groupConversationParticipantIds=");
        sb2.append(this.groupConversationParticipantIds);
        sb2.append(", lastParticipatingAdminBuilder=");
        sb2.append(this.lastParticipatingAdminBuilder);
        sb2.append(", composerState=");
        sb2.append(this.composerState);
        sb2.append(", preventEndUserReplies=");
        sb2.append(this.preventEndUserReplies);
        sb2.append(", inboundConversationsDisabled=");
        sb2.append(this.inboundConversationsDisabled);
        sb2.append(", notificationStatus=");
        sb2.append(this.notificationStatus);
        sb2.append(", state=");
        sb2.append(this.state);
        sb2.append(", isInbound=");
        sb2.append(this.isInbound);
        sb2.append(", ticket=");
        sb2.append(this.ticket);
        sb2.append(", uiFlags=");
        sb2.append(this.uiFlags);
        sb2.append(", header=");
        sb2.append(this.header);
        sb2.append(", conversationEndedButton=");
        sb2.append(this.conversationEndedButton);
        sb2.append(", footerNotice=");
        sb2.append(this.footerNotice);
        sb2.append(", poweredBy=");
        sb2.append(this.poweredBy);
        sb2.append(", teamIntro=");
        sb2.append(this.teamIntro);
        sb2.append(", specialNotice=");
        return B7.b.g(sb2, this.specialNotice, ')');
    }

    public Conversation(String id, boolean z10, List<Participant.Builder> participantBuilderList, List<Part.Builder> partBuilderList, List<String> groupConversationParticipantIds, LastParticipatingAdmin.Builder lastParticipatingAdminBuilder, ComposerState composerState, boolean z11, boolean z12, String notificationStatus, String state, boolean z13, Ticket ticket, ConversationUiFlags uiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str, String str2) {
        i.e(id, "id");
        i.e(participantBuilderList, "participantBuilderList");
        i.e(partBuilderList, "partBuilderList");
        i.e(groupConversationParticipantIds, "groupConversationParticipantIds");
        i.e(lastParticipatingAdminBuilder, "lastParticipatingAdminBuilder");
        i.e(composerState, "composerState");
        i.e(notificationStatus, "notificationStatus");
        i.e(state, "state");
        i.e(uiFlags, "uiFlags");
        this.id = id;
        this.isRead = z10;
        this.participantBuilderList = participantBuilderList;
        this.partBuilderList = partBuilderList;
        this.groupConversationParticipantIds = groupConversationParticipantIds;
        this.lastParticipatingAdminBuilder = lastParticipatingAdminBuilder;
        this.composerState = composerState;
        this.preventEndUserReplies = z11;
        this.inboundConversationsDisabled = z12;
        this.notificationStatus = notificationStatus;
        this.state = state;
        this.isInbound = z13;
        this.ticket = ticket;
        this.uiFlags = uiFlags;
        this.header = header;
        this.conversationEndedButton = conversationEndedButton;
        this.footerNotice = footerNotice;
        this.poweredBy = poweredBy;
        this.teamIntro = str;
        this.specialNotice = str2;
    }

    public Conversation(String str, boolean z10, List list, List list2, List list3, LastParticipatingAdmin.Builder builder, ComposerState composerState, boolean z11, boolean z12, String str2, String str3, boolean z13, Ticket ticket, ConversationUiFlags conversationUiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str4, String str5, int i10, e eVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? EmptyList.f42983b : list, (i10 & 8) != 0 ? EmptyList.f42983b : list2, (i10 & 16) != 0 ? EmptyList.f42983b : list3, (i10 & 32) != 0 ? new LastParticipatingAdmin.Builder() : builder, (i10 & 64) != 0 ? ComposerState.Companion.getNULL() : composerState, (i10 & 128) != 0 ? false : z11, (i10 & 256) != 0 ? false : z12, (i10 & 512) != 0 ? "" : str2, (i10 & 1024) == 0 ? str3 : "", (i10 & 2048) == 0 ? z13 : false, (i10 & 4096) != 0 ? null : ticket, (i10 & 8192) != 0 ? ConversationUiFlags.Companion.getDEFAULT() : conversationUiFlags, (i10 & 16384) != 0 ? null : header, (i10 & 32768) != 0 ? null : conversationEndedButton, (i10 & 65536) != 0 ? null : footerNotice, (i10 & 131072) != 0 ? null : poweredBy, (i10 & 262144) != 0 ? null : str4, (i10 & 524288) != 0 ? null : str5);
    }
}
