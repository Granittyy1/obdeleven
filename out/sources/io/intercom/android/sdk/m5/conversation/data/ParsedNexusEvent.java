package io.intercom.android.sdk.m5.conversation.data;

import Q8.d;
import Z3.o;
import androidx.compose.animation.D;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p005a4.q;

/* JADX INFO: compiled from: NexusEventAsFlow.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ParsedNexusEvent {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: NexusEventAsFlow.kt */
    public static class ConversationNexusEvent extends ParsedNexusEvent {
        public static final int $stable = 0;
        private final String conversationId;
        private final NexusEventType eventType;

        /* JADX INFO: compiled from: NexusEventAsFlow.kt */
        public static final class AdminIsTyping extends ConversationNexusEvent {
            public static final int $stable = 8;
            private final Avatar avatar;
            private final String clientId;
            private final String conversationId;
            private final String createdByUser;
            private final boolean isBot;
            private final boolean showAvatar;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AdminIsTyping(String conversationId, String createdByUser, Avatar avatar, boolean z10, boolean z11, String clientId) {
                super(conversationId, NexusEventType.AdminIsTyping);
                i.e(conversationId, "conversationId");
                i.e(createdByUser, "createdByUser");
                i.e(avatar, "avatar");
                i.e(clientId, "clientId");
                this.conversationId = conversationId;
                this.createdByUser = createdByUser;
                this.avatar = avatar;
                this.isBot = z10;
                this.showAvatar = z11;
                this.clientId = clientId;
            }

            public static /* synthetic */ AdminIsTyping copy$default(AdminIsTyping adminIsTyping, String str, String str2, Avatar avatar, boolean z10, boolean z11, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = adminIsTyping.conversationId;
                }
                if ((i10 & 2) != 0) {
                    str2 = adminIsTyping.createdByUser;
                }
                String str4 = str2;
                if ((i10 & 4) != 0) {
                    avatar = adminIsTyping.avatar;
                }
                Avatar avatar2 = avatar;
                if ((i10 & 8) != 0) {
                    z10 = adminIsTyping.isBot;
                }
                boolean z12 = z10;
                if ((i10 & 16) != 0) {
                    z11 = adminIsTyping.showAvatar;
                }
                boolean z13 = z11;
                if ((i10 & 32) != 0) {
                    str3 = adminIsTyping.clientId;
                }
                return adminIsTyping.copy(str, str4, avatar2, z12, z13, str3);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String component2() {
                return this.createdByUser;
            }

            public final Avatar component3() {
                return this.avatar;
            }

            public final boolean component4() {
                return this.isBot;
            }

            public final boolean component5() {
                return this.showAvatar;
            }

            public final String component6() {
                return this.clientId;
            }

            public final AdminIsTyping copy(String conversationId, String createdByUser, Avatar avatar, boolean z10, boolean z11, String clientId) {
                i.e(conversationId, "conversationId");
                i.e(createdByUser, "createdByUser");
                i.e(avatar, "avatar");
                i.e(clientId, "clientId");
                return new AdminIsTyping(conversationId, createdByUser, avatar, z10, z11, clientId);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AdminIsTyping)) {
                    return false;
                }
                AdminIsTyping adminIsTyping = (AdminIsTyping) obj;
                return i.a(this.conversationId, adminIsTyping.conversationId) && i.a(this.createdByUser, adminIsTyping.createdByUser) && i.a(this.avatar, adminIsTyping.avatar) && this.isBot == adminIsTyping.isBot && this.showAvatar == adminIsTyping.showAvatar && i.a(this.clientId, adminIsTyping.clientId);
            }

            public final Avatar getAvatar() {
                return this.avatar;
            }

            public final String getClientId() {
                return this.clientId;
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            public String getConversationId() {
                return this.conversationId;
            }

            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public final boolean getShowAvatar() {
                return this.showAvatar;
            }

            public int hashCode() {
                return this.clientId.hashCode() + D.b(D.b((this.avatar.hashCode() + B1.a.b(this.createdByUser, this.conversationId.hashCode() * 31, 31)) * 31, 31, this.isBot), 31, this.showAvatar);
            }

            public final boolean isBot() {
                return this.isBot;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("AdminIsTyping(conversationId=");
                sb2.append(this.conversationId);
                sb2.append(", createdByUser=");
                sb2.append(this.createdByUser);
                sb2.append(", avatar=");
                sb2.append(this.avatar);
                sb2.append(", isBot=");
                sb2.append(this.isBot);
                sb2.append(", showAvatar=");
                sb2.append(this.showAvatar);
                sb2.append(", clientId=");
                return B7.b.g(sb2, this.clientId, ')');
            }
        }

        /* JADX INFO: compiled from: NexusEventAsFlow.kt */
        public static final class FinStreaming extends ConversationNexusEvent {
            public static final int $stable = 8;
            private final List<Block> blocks;
            private final String clientAssignedUUID;
            private final String conversationId;
            private final String partType;
            private final int tokenSequenceIndex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public FinStreaming(String conversationId, String clientAssignedUUID, String partType, int i10, List<? extends Block> blocks) {
                super(conversationId, NexusEventType.ConversationPartToken);
                i.e(conversationId, "conversationId");
                i.e(clientAssignedUUID, "clientAssignedUUID");
                i.e(partType, "partType");
                i.e(blocks, "blocks");
                this.conversationId = conversationId;
                this.clientAssignedUUID = clientAssignedUUID;
                this.partType = partType;
                this.tokenSequenceIndex = i10;
                this.blocks = blocks;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FinStreaming copy$default(FinStreaming finStreaming, String str, String str2, String str3, int i10, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = finStreaming.conversationId;
                }
                if ((i11 & 2) != 0) {
                    str2 = finStreaming.clientAssignedUUID;
                }
                String str4 = str2;
                if ((i11 & 4) != 0) {
                    str3 = finStreaming.partType;
                }
                String str5 = str3;
                if ((i11 & 8) != 0) {
                    i10 = finStreaming.tokenSequenceIndex;
                }
                int i12 = i10;
                if ((i11 & 16) != 0) {
                    list = finStreaming.blocks;
                }
                return finStreaming.copy(str, str4, str5, i12, list);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String component2() {
                return this.clientAssignedUUID;
            }

            public final String component3() {
                return this.partType;
            }

            public final int component4() {
                return this.tokenSequenceIndex;
            }

            public final List<Block> component5() {
                return this.blocks;
            }

            public final FinStreaming copy(String conversationId, String clientAssignedUUID, String partType, int i10, List<? extends Block> blocks) {
                i.e(conversationId, "conversationId");
                i.e(clientAssignedUUID, "clientAssignedUUID");
                i.e(partType, "partType");
                i.e(blocks, "blocks");
                return new FinStreaming(conversationId, clientAssignedUUID, partType, i10, blocks);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FinStreaming)) {
                    return false;
                }
                FinStreaming finStreaming = (FinStreaming) obj;
                return i.a(this.conversationId, finStreaming.conversationId) && i.a(this.clientAssignedUUID, finStreaming.clientAssignedUUID) && i.a(this.partType, finStreaming.partType) && this.tokenSequenceIndex == finStreaming.tokenSequenceIndex && i.a(this.blocks, finStreaming.blocks);
            }

            public final List<Block> getBlocks() {
                return this.blocks;
            }

            public final String getClientAssignedUUID() {
                return this.clientAssignedUUID;
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            public String getConversationId() {
                return this.conversationId;
            }

            public final String getPartType() {
                return this.partType;
            }

            public final int getTokenSequenceIndex() {
                return this.tokenSequenceIndex;
            }

            public int hashCode() {
                return this.blocks.hashCode() + q.b(this.tokenSequenceIndex, B1.a.b(this.partType, B1.a.b(this.clientAssignedUUID, this.conversationId.hashCode() * 31, 31), 31), 31);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("FinStreaming(conversationId=");
                sb2.append(this.conversationId);
                sb2.append(", clientAssignedUUID=");
                sb2.append(this.clientAssignedUUID);
                sb2.append(", partType=");
                sb2.append(this.partType);
                sb2.append(", tokenSequenceIndex=");
                sb2.append(this.tokenSequenceIndex);
                sb2.append(", blocks=");
                return d.b(sb2, this.blocks, ')');
            }
        }

        /* JADX INFO: compiled from: NexusEventAsFlow.kt */
        public static final class NewComment extends ConversationNexusEvent {
            public static final int $stable = 0;
            private final String conversationId;
            private final String createdByUser;
            private final String ticketId;

            public /* synthetic */ NewComment(String str, String str2, String str3, int i10, e eVar) {
                this(str, str2, (i10 & 4) != 0 ? null : str3);
            }

            public static /* synthetic */ NewComment copy$default(NewComment newComment, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = newComment.conversationId;
                }
                if ((i10 & 2) != 0) {
                    str2 = newComment.createdByUser;
                }
                if ((i10 & 4) != 0) {
                    str3 = newComment.ticketId;
                }
                return newComment.copy(str, str2, str3);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String component2() {
                return this.createdByUser;
            }

            public final String component3() {
                return this.ticketId;
            }

            public final NewComment copy(String conversationId, String createdByUser, String str) {
                i.e(conversationId, "conversationId");
                i.e(createdByUser, "createdByUser");
                return new NewComment(conversationId, createdByUser, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NewComment)) {
                    return false;
                }
                NewComment newComment = (NewComment) obj;
                return i.a(this.conversationId, newComment.conversationId) && i.a(this.createdByUser, newComment.createdByUser) && i.a(this.ticketId, newComment.ticketId);
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            public String getConversationId() {
                return this.conversationId;
            }

            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public final String getTicketId() {
                return this.ticketId;
            }

            public int hashCode() {
                int iB = B1.a.b(this.createdByUser, this.conversationId.hashCode() * 31, 31);
                String str = this.ticketId;
                return iB + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("NewComment(conversationId=");
                sb2.append(this.conversationId);
                sb2.append(", createdByUser=");
                sb2.append(this.createdByUser);
                sb2.append(", ticketId=");
                return B7.b.g(sb2, this.ticketId, ')');
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NewComment(String conversationId, String createdByUser, String str) {
                super(conversationId, NexusEventType.NewComment);
                i.e(conversationId, "conversationId");
                i.e(createdByUser, "createdByUser");
                this.conversationId = conversationId;
                this.createdByUser = createdByUser;
                this.ticketId = str;
            }
        }

        /* JADX INFO: compiled from: NexusEventAsFlow.kt */
        public static final class UserContentSeenByAdmin extends ConversationNexusEvent {
            public static final int $stable = 8;
            private final Avatar avatar;
            private final String conversationId;
            private final String createdByUser;
            private final boolean isBot;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserContentSeenByAdmin(String conversationId, String createdByUser, Avatar avatar, boolean z10) {
                super(conversationId, NexusEventType.AdminIsTyping);
                i.e(conversationId, "conversationId");
                i.e(createdByUser, "createdByUser");
                i.e(avatar, "avatar");
                this.conversationId = conversationId;
                this.createdByUser = createdByUser;
                this.avatar = avatar;
                this.isBot = z10;
            }

            public static /* synthetic */ UserContentSeenByAdmin copy$default(UserContentSeenByAdmin userContentSeenByAdmin, String str, String str2, Avatar avatar, boolean z10, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = userContentSeenByAdmin.conversationId;
                }
                if ((i10 & 2) != 0) {
                    str2 = userContentSeenByAdmin.createdByUser;
                }
                if ((i10 & 4) != 0) {
                    avatar = userContentSeenByAdmin.avatar;
                }
                if ((i10 & 8) != 0) {
                    z10 = userContentSeenByAdmin.isBot;
                }
                return userContentSeenByAdmin.copy(str, str2, avatar, z10);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String component2() {
                return this.createdByUser;
            }

            public final Avatar component3() {
                return this.avatar;
            }

            public final boolean component4() {
                return this.isBot;
            }

            public final UserContentSeenByAdmin copy(String conversationId, String createdByUser, Avatar avatar, boolean z10) {
                i.e(conversationId, "conversationId");
                i.e(createdByUser, "createdByUser");
                i.e(avatar, "avatar");
                return new UserContentSeenByAdmin(conversationId, createdByUser, avatar, z10);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UserContentSeenByAdmin)) {
                    return false;
                }
                UserContentSeenByAdmin userContentSeenByAdmin = (UserContentSeenByAdmin) obj;
                return i.a(this.conversationId, userContentSeenByAdmin.conversationId) && i.a(this.createdByUser, userContentSeenByAdmin.createdByUser) && i.a(this.avatar, userContentSeenByAdmin.avatar) && this.isBot == userContentSeenByAdmin.isBot;
            }

            public final Avatar getAvatar() {
                return this.avatar;
            }

            @Override // io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent.ConversationNexusEvent
            public String getConversationId() {
                return this.conversationId;
            }

            public final String getCreatedByUser() {
                return this.createdByUser;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isBot) + ((this.avatar.hashCode() + B1.a.b(this.createdByUser, this.conversationId.hashCode() * 31, 31)) * 31);
            }

            public final boolean isBot() {
                return this.isBot;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("UserContentSeenByAdmin(conversationId=");
                sb2.append(this.conversationId);
                sb2.append(", createdByUser=");
                sb2.append(this.createdByUser);
                sb2.append(", avatar=");
                sb2.append(this.avatar);
                sb2.append(", isBot=");
                return o.d(sb2, this.isBot, ')');
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConversationNexusEvent(String conversationId, NexusEventType eventType) {
            super(null);
            i.e(conversationId, "conversationId");
            i.e(eventType, "eventType");
            this.conversationId = conversationId;
            this.eventType = eventType;
        }

        public String getConversationId() {
            return this.conversationId;
        }

        public final NexusEventType getEventType() {
            return this.eventType;
        }
    }

    /* JADX INFO: compiled from: NexusEventAsFlow.kt */
    public static final class NexusConnected extends ParsedNexusEvent {
        public static final int $stable = 0;
        public static final NexusConnected INSTANCE = new NexusConnected();

        private NexusConnected() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NexusConnected);
        }

        public int hashCode() {
            return -1135156447;
        }

        public String toString() {
            return "NexusConnected";
        }
    }

    /* JADX INFO: compiled from: NexusEventAsFlow.kt */
    public static final class UnSupportedEvent extends ParsedNexusEvent {
        public static final int $stable = 0;
        public static final UnSupportedEvent INSTANCE = new UnSupportedEvent();

        private UnSupportedEvent() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof UnSupportedEvent);
        }

        public int hashCode() {
            return -2056396516;
        }

        public String toString() {
            return "UnSupportedEvent";
        }
    }

    public /* synthetic */ ParsedNexusEvent(e eVar) {
        this();
    }

    private ParsedNexusEvent() {
    }
}
