package io.intercom.android.sdk.models;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationResponse extends BaseResponse {
    public static final int $stable = 8;
    private final Builder builder;
    private final Conversation conversation;

    /* JADX INFO: compiled from: ConversationResponse.kt */
    public static final class Builder extends BaseResponse.Builder {
        public static final int $stable = 8;
        private ComposerState composer_state;
        private List<Part.Builder> conversation_parts;
        private List<String> group_conversation_participant_ids;
        private String id;
        private boolean inbound_conversations_disabled;
        private boolean is_inbound;
        private LastParticipatingAdmin.Builder last_participating_admin;
        private String notification_status;
        private List<Participant.Builder> participants;
        private boolean prevent_end_user_replies;
        private boolean read;
        private String state;
        private Ticket ticket;
        private ConversationUiFlags ui_flags;

        public Builder() {
            EmptyList emptyList = EmptyList.f42983b;
            this.participants = emptyList;
            this.conversation_parts = emptyList;
            this.group_conversation_participant_ids = emptyList;
            this.last_participating_admin = new LastParticipatingAdmin.Builder();
        }

        public final ComposerState getComposer_state() {
            return this.composer_state;
        }

        public final List<Part.Builder> getConversation_parts() {
            return this.conversation_parts;
        }

        public final List<String> getGroup_conversation_participant_ids() {
            return this.group_conversation_participant_ids;
        }

        public final String getId() {
            return this.id;
        }

        public final boolean getInbound_conversations_disabled() {
            return this.inbound_conversations_disabled;
        }

        public final LastParticipatingAdmin.Builder getLast_participating_admin() {
            return this.last_participating_admin;
        }

        public final String getNotification_status() {
            return this.notification_status;
        }

        public final List<Participant.Builder> getParticipants() {
            return this.participants;
        }

        public final boolean getPrevent_end_user_replies() {
            return this.prevent_end_user_replies;
        }

        public final boolean getRead() {
            return this.read;
        }

        public final String getState() {
            return this.state;
        }

        public final Ticket getTicket() {
            return this.ticket;
        }

        public final ConversationUiFlags getUi_flags() {
            return this.ui_flags;
        }

        public final boolean is_inbound() {
            return this.is_inbound;
        }

        public final void setComposer_state(ComposerState composerState) {
            this.composer_state = composerState;
        }

        public final void setConversation_parts(List<Part.Builder> list) {
            i.e(list, "<set-?>");
            this.conversation_parts = list;
        }

        public final void setGroup_conversation_participant_ids(List<String> list) {
            i.e(list, "<set-?>");
            this.group_conversation_participant_ids = list;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setInbound_conversations_disabled(boolean z10) {
            this.inbound_conversations_disabled = z10;
        }

        public final void setLast_participating_admin(LastParticipatingAdmin.Builder builder) {
            i.e(builder, "<set-?>");
            this.last_participating_admin = builder;
        }

        public final void setNotification_status(String str) {
            this.notification_status = str;
        }

        public final void setParticipants(List<Participant.Builder> list) {
            i.e(list, "<set-?>");
            this.participants = list;
        }

        public final void setPrevent_end_user_replies(boolean z10) {
            this.prevent_end_user_replies = z10;
        }

        public final void setRead(boolean z10) {
            this.read = z10;
        }

        public final void setState(String str) {
            this.state = str;
        }

        public final void setTicket(Ticket ticket) {
            this.ticket = ticket;
        }

        public final void setUi_flags(ConversationUiFlags conversationUiFlags) {
            this.ui_flags = conversationUiFlags;
        }

        public final void set_inbound(boolean z10) {
            this.is_inbound = z10;
        }

        @Override // io.intercom.android.sdk.models.BaseResponse.Builder
        public ConversationResponse build() {
            return new ConversationResponse(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationResponse(Builder builder) {
        super(builder);
        i.e(builder, "builder");
        this.builder = builder;
        String id = builder.getId();
        String str = id == null ? "" : id;
        boolean read = builder.getRead();
        List<Participant.Builder> participants = builder.getParticipants();
        List<Part.Builder> conversation_parts = builder.getConversation_parts();
        List<String> group_conversation_participant_ids = builder.getGroup_conversation_participant_ids();
        LastParticipatingAdmin.Builder last_participating_admin = builder.getLast_participating_admin();
        ComposerState composer_state = builder.getComposer_state();
        ComposerState composerState = composer_state == null ? ComposerState.Companion.getNULL() : composer_state;
        boolean prevent_end_user_replies = builder.getPrevent_end_user_replies();
        boolean inbound_conversations_disabled = builder.getInbound_conversations_disabled();
        String notification_status = builder.getNotification_status();
        String str2 = notification_status == null ? "" : notification_status;
        String state = builder.getState();
        String str3 = state == null ? "" : state;
        boolean zIs_inbound = builder.is_inbound();
        Ticket ticket = builder.getTicket();
        ConversationUiFlags ui_flags = builder.getUi_flags();
        this.conversation = new Conversation(str, read, participants, conversation_parts, group_conversation_participant_ids, last_participating_admin, composerState, prevent_end_user_replies, inbound_conversations_disabled, str2, str3, zIs_inbound, ticket, ui_flags == null ? ConversationUiFlags.Companion.getDEFAULT() : ui_flags, null, null, null, null, null, null, 1032192, null);
    }

    public final Builder getBuilder() {
        return this.builder;
    }

    public final Conversation getConversation() {
        return this.conversation;
    }
}
