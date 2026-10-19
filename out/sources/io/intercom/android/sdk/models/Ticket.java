package io.intercom.android.sdk.models;

import Ba.a;
import I7.b;
import androidx.compose.animation.D;
import com.braze.Constants;
import com.braze.models.inappmessage.InAppMessageBase;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import p005a4.p;
import p005a4.q;

/* JADX INFO: compiled from: Ticket.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class Ticket {

    @b("assignee")
    private final Participant.Builder assignee;

    @b("attributes")
    private final List<TicketAttribute> attributes;

    @b("conversation_button")
    private final ConversationButton conversationButton;

    @b(CreateTicketDestinationKt.CONVERSATION_ID)
    private final String conversationId;

    @b("current_status")
    private final Status currentStatus;

    @b("description")
    private final String description;

    @b("emoji")
    private final String emoji;

    @b("icon_url")
    private final String iconUrl;

    @b("id")
    private final String id;

    @b("read")
    private final Boolean isRead;

    @b("latest_status_updated_at")
    private final long latestStatusUpdatedAt;

    @b("public_ticket_id")
    private final String publicId;

    @b("status_list")
    private final List<Status> statusList;

    @b(CreateTicketDestinationKt.TICKET_TYPE_ID)
    private final int ticketTypeId;

    @b("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Ticket NULL = new Ticket(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, 0, 32767, null);

    /* JADX INFO: compiled from: Ticket.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final Ticket getNULL() {
            return Ticket.NULL;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: Ticket.kt */
    public static final class ConversationButton {
        public static final int $stable = 0;

        @b(InAppMessageBase.ICON)
        private final IconType icon;

        @b(AttributeType.TEXT)
        private final String text;

        /* JADX INFO: compiled from: Ticket.kt */
        public enum IconType {
            SEND,
            CONVERSATION;

            private static final /* synthetic */ a $ENTRIES = kotlin.enums.a.a(values());

            public static a<IconType> getEntries() {
                return $ENTRIES;
            }
        }

        public ConversationButton(IconType iconType, String text) {
            i.e(text, "text");
            this.icon = iconType;
            this.text = text;
        }

        public static /* synthetic */ ConversationButton copy$default(ConversationButton conversationButton, IconType iconType, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                iconType = conversationButton.icon;
            }
            if ((i10 & 2) != 0) {
                str = conversationButton.text;
            }
            return conversationButton.copy(iconType, str);
        }

        public final IconType component1() {
            return this.icon;
        }

        public final String component2() {
            return this.text;
        }

        public final ConversationButton copy(IconType iconType, String text) {
            i.e(text, "text");
            return new ConversationButton(iconType, text);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationButton)) {
                return false;
            }
            ConversationButton conversationButton = (ConversationButton) obj;
            return this.icon == conversationButton.icon && i.a(this.text, conversationButton.text);
        }

        public final IconType getIcon() {
            return this.icon;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            IconType iconType = this.icon;
            return this.text.hashCode() + ((iconType == null ? 0 : iconType.hashCode()) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ConversationButton(icon=");
            sb2.append(this.icon);
            sb2.append(", text=");
            return B7.b.g(sb2, this.text, ')');
        }
    }

    /* JADX INFO: compiled from: Ticket.kt */
    public static final class Status {
        public static final int $stable = 0;

        @b("created_date")
        private final long createdDate;

        @b("is_current_status")
        private final boolean isCurrentStatus;

        @b("status_detail")
        private final String statusDetail;

        @b("title")
        private final String title;

        @b("type")
        private final String type;

        public Status() {
            this(null, null, null, false, 0L, 31, null);
        }

        public static /* synthetic */ Status copy$default(Status status, String str, String str2, String str3, boolean z10, long j, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = status.title;
            }
            if ((i10 & 2) != 0) {
                str2 = status.type;
            }
            String str4 = str2;
            if ((i10 & 4) != 0) {
                str3 = status.statusDetail;
            }
            String str5 = str3;
            if ((i10 & 8) != 0) {
                z10 = status.isCurrentStatus;
            }
            boolean z11 = z10;
            if ((i10 & 16) != 0) {
                j = status.createdDate;
            }
            return status.copy(str, str4, str5, z11, j);
        }

        public final String component1() {
            return this.title;
        }

        public final String component2() {
            return this.type;
        }

        public final String component3() {
            return this.statusDetail;
        }

        public final boolean component4() {
            return this.isCurrentStatus;
        }

        public final long component5() {
            return this.createdDate;
        }

        public final Status copy(String title, String type, String statusDetail, boolean z10, long j) {
            i.e(title, "title");
            i.e(type, "type");
            i.e(statusDetail, "statusDetail");
            return new Status(title, type, statusDetail, z10, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status)) {
                return false;
            }
            Status status = (Status) obj;
            return i.a(this.title, status.title) && i.a(this.type, status.type) && i.a(this.statusDetail, status.statusDetail) && this.isCurrentStatus == status.isCurrentStatus && this.createdDate == status.createdDate;
        }

        public final long getCreatedDate() {
            return this.createdDate;
        }

        public final String getStatusDetail() {
            return this.statusDetail;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return Long.hashCode(this.createdDate) + D.b(B1.a.b(this.statusDetail, B1.a.b(this.type, this.title.hashCode() * 31, 31), 31), 31, this.isCurrentStatus);
        }

        public final boolean isCurrentStatus() {
            return this.isCurrentStatus;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Status(title=");
            sb2.append(this.title);
            sb2.append(", type=");
            sb2.append(this.type);
            sb2.append(", statusDetail=");
            sb2.append(this.statusDetail);
            sb2.append(", isCurrentStatus=");
            sb2.append(this.isCurrentStatus);
            sb2.append(", createdDate=");
            return C4.a.h(sb2, this.createdDate, ')');
        }

        public Status(String title, String type, String statusDetail, boolean z10, long j) {
            i.e(title, "title");
            i.e(type, "type");
            i.e(statusDetail, "statusDetail");
            this.title = title;
            this.type = type;
            this.statusDetail = statusDetail;
            this.isCurrentStatus = z10;
            this.createdDate = j;
        }

        public /* synthetic */ Status(String str, String str2, String str3, boolean z10, long j, int i10, e eVar) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) == 0 ? str3 : "", (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? 0L : j);
        }
    }

    /* JADX INFO: compiled from: Ticket.kt */
    public static abstract class TicketAttribute {
        public static final int $stable = 0;

        @b("id")
        private final String id;

        @b("identifier")
        private final String identifier;

        @b("name")
        private final String name;

        @b("required")
        private final boolean required;

        @b("type")
        private final TicketAttributeType type;

        /* JADX INFO: compiled from: Ticket.kt */
        public static final class DateTimeAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @b("value")
            private final String value;

            public DateTimeAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !n.S(this.value);
            }

            public /* synthetic */ DateTimeAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, String str4, int i10, e eVar) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? TicketAttributeType.DATETIME : ticketAttributeType, (i10 & 32) != 0 ? "" : str4);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DateTimeAttribute(String id, String identifier, String name, boolean z10, TicketAttributeType type, String value) {
                super(id, identifier, name, z10, type, null);
                i.e(id, "id");
                i.e(identifier, "identifier");
                i.e(name, "name");
                i.e(type, "type");
                i.e(value, "value");
                this.value = value;
            }
        }

        /* JADX INFO: compiled from: Ticket.kt */
        public static final class FilesAttribute extends TicketAttribute {
            public static final int $stable = 8;

            @b("value")
            private final List<File> value;

            /* JADX INFO: compiled from: Ticket.kt */
            public static final class File {
                public static final int $stable = 0;

                @b("media_type")
                private final FileType fileType;

                @b("id")
                private final String id;

                @b("name")
                private final String name;

                @b(Constants.BRAZE_WEBVIEW_URL_EXTRA)
                private final String url;

                public File(String id, String name, String url, FileType fileType) {
                    i.e(id, "id");
                    i.e(name, "name");
                    i.e(url, "url");
                    i.e(fileType, "fileType");
                    this.id = id;
                    this.name = name;
                    this.url = url;
                    this.fileType = fileType;
                }

                public static /* synthetic */ File copy$default(File file, String str, String str2, String str3, FileType fileType, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = file.id;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = file.name;
                    }
                    if ((i10 & 4) != 0) {
                        str3 = file.url;
                    }
                    if ((i10 & 8) != 0) {
                        fileType = file.fileType;
                    }
                    return file.copy(str, str2, str3, fileType);
                }

                public final String component1() {
                    return this.id;
                }

                public final String component2() {
                    return this.name;
                }

                public final String component3() {
                    return this.url;
                }

                public final FileType component4() {
                    return this.fileType;
                }

                public final File copy(String id, String name, String url, FileType fileType) {
                    i.e(id, "id");
                    i.e(name, "name");
                    i.e(url, "url");
                    i.e(fileType, "fileType");
                    return new File(id, name, url, fileType);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof File)) {
                        return false;
                    }
                    File file = (File) obj;
                    return i.a(this.id, file.id) && i.a(this.name, file.name) && i.a(this.url, file.url) && this.fileType == file.fileType;
                }

                public final FileType getFileType() {
                    return this.fileType;
                }

                public final String getId() {
                    return this.id;
                }

                public final String getName() {
                    return this.name;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return this.fileType.hashCode() + B1.a.b(this.url, B1.a.b(this.name, this.id.hashCode() * 31, 31), 31);
                }

                public String toString() {
                    return "File(id=" + this.id + ", name=" + this.name + ", url=" + this.url + ", fileType=" + this.fileType + ')';
                }
            }

            public /* synthetic */ FilesAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, List list, int i10, e eVar) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, ticketAttributeType, list);
            }

            public final List<File> getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !this.value.isEmpty();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FilesAttribute(String id, String identifier, String name, boolean z10, TicketAttributeType type, List<File> value) {
                super(id, identifier, name, z10, type, null);
                i.e(id, "id");
                i.e(identifier, "identifier");
                i.e(name, "name");
                i.e(type, "type");
                i.e(value, "value");
                this.value = value;
            }
        }

        /* JADX INFO: compiled from: Ticket.kt */
        public static final class ListAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @b("value")
            private final String value;

            public ListAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !n.S(this.value);
            }

            public /* synthetic */ ListAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, String str4, int i10, e eVar) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? TicketAttributeType.LIST : ticketAttributeType, (i10 & 32) != 0 ? "" : str4);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ListAttribute(String id, String identifier, String name, boolean z10, TicketAttributeType type, String value) {
                super(id, identifier, name, z10, type, null);
                i.e(id, "id");
                i.e(identifier, "identifier");
                i.e(name, "name");
                i.e(type, "type");
                i.e(value, "value");
                this.value = value;
            }
        }

        /* JADX INFO: compiled from: Ticket.kt */
        public static final class PrimitiveAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @b("value")
            private final String value;

            public PrimitiveAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            public final String getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !n.S(this.value);
            }

            public /* synthetic */ PrimitiveAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, String str4, int i10, e eVar) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? TicketAttributeType.STRING : ticketAttributeType, (i10 & 32) != 0 ? "" : str4);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PrimitiveAttribute(String id, String identifier, String name, boolean z10, TicketAttributeType type, String value) {
                super(id, identifier, name, z10, type, null);
                i.e(id, "id");
                i.e(identifier, "identifier");
                i.e(name, "name");
                i.e(type, "type");
                i.e(value, "value");
                this.value = value;
            }
        }

        public /* synthetic */ TicketAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, e eVar) {
            this(str, str2, str3, z10, ticketAttributeType);
        }

        public final String getId() {
            return this.id;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getRequired() {
            return this.required;
        }

        public final TicketAttributeType getType() {
            return this.type;
        }

        public abstract boolean hasValue();

        /* JADX INFO: compiled from: Ticket.kt */
        public static final class UnSupported extends TicketAttribute {
            public static final int $stable = 8;

            @b("value")
            private final Object value;

            public /* synthetic */ UnSupported(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, String str4, int i10, e eVar) {
                this(str, str2, str3, z10, ticketAttributeType, (i10 & 32) != 0 ? "" : str4);
            }

            public final Object getValue() {
                return this.value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !n.S(this.value.toString());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnSupported(String id, String identifier, String name, boolean z10, TicketAttributeType type, Object value) {
                super(id, identifier, name, z10, type, null);
                i.e(id, "id");
                i.e(identifier, "identifier");
                i.e(name, "name");
                i.e(type, "type");
                i.e(value, "value");
                this.value = value;
            }
        }

        private TicketAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType) {
            this.id = str;
            this.identifier = str2;
            this.name = str3;
            this.required = z10;
            this.type = ticketAttributeType;
        }

        public /* synthetic */ TicketAttribute(String str, String str2, String str3, boolean z10, TicketAttributeType ticketAttributeType, int i10, e eVar) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, ticketAttributeType, null);
        }
    }

    public Ticket() {
        this(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, 0L, 32767, null);
    }

    public final String component1() {
        return this.id;
    }

    public final int component10() {
        return this.ticketTypeId;
    }

    public final Participant.Builder component11() {
        return this.assignee;
    }

    public final String component12() {
        return this.conversationId;
    }

    public final ConversationButton component13() {
        return this.conversationButton;
    }

    public final Boolean component14() {
        return this.isRead;
    }

    public final long component15() {
        return this.latestStatusUpdatedAt;
    }

    public final String component2() {
        return this.publicId;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.iconUrl;
    }

    public final String component6() {
        return this.emoji;
    }

    public final Status component7() {
        return this.currentStatus;
    }

    public final List<Status> component8() {
        return this.statusList;
    }

    public final List<TicketAttribute> component9() {
        return this.attributes;
    }

    public final Ticket copy(String id, String str, String title, String description, String iconUrl, String emoji, Status currentStatus, List<Status> statusList, List<? extends TicketAttribute> attributes, int i10, Participant.Builder assignee, String str2, ConversationButton conversationButton, Boolean bool, long j) {
        i.e(id, "id");
        i.e(title, "title");
        i.e(description, "description");
        i.e(iconUrl, "iconUrl");
        i.e(emoji, "emoji");
        i.e(currentStatus, "currentStatus");
        i.e(statusList, "statusList");
        i.e(attributes, "attributes");
        i.e(assignee, "assignee");
        return new Ticket(id, str, title, description, iconUrl, emoji, currentStatus, statusList, attributes, i10, assignee, str2, conversationButton, bool, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ticket)) {
            return false;
        }
        Ticket ticket = (Ticket) obj;
        return i.a(this.id, ticket.id) && i.a(this.publicId, ticket.publicId) && i.a(this.title, ticket.title) && i.a(this.description, ticket.description) && i.a(this.iconUrl, ticket.iconUrl) && i.a(this.emoji, ticket.emoji) && i.a(this.currentStatus, ticket.currentStatus) && i.a(this.statusList, ticket.statusList) && i.a(this.attributes, ticket.attributes) && this.ticketTypeId == ticket.ticketTypeId && i.a(this.assignee, ticket.assignee) && i.a(this.conversationId, ticket.conversationId) && i.a(this.conversationButton, ticket.conversationButton) && i.a(this.isRead, ticket.isRead) && this.latestStatusUpdatedAt == ticket.latestStatusUpdatedAt;
    }

    public final Participant.Builder getAssignee() {
        return this.assignee;
    }

    public final List<TicketAttribute> getAttributes() {
        return this.attributes;
    }

    public final ConversationButton getConversationButton() {
        return this.conversationButton;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final Status getCurrentStatus() {
        return this.currentStatus;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final long getLatestStatusUpdatedAt() {
        return this.latestStatusUpdatedAt;
    }

    public final String getPublicId() {
        return this.publicId;
    }

    public final List<Status> getStatusList() {
        return this.statusList;
    }

    public final int getTicketTypeId() {
        return this.ticketTypeId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.publicId;
        int iHashCode2 = (this.assignee.hashCode() + q.b(this.ticketTypeId, p.d(p.d((this.currentStatus.hashCode() + B1.a.b(this.emoji, B1.a.b(this.iconUrl, B1.a.b(this.description, B1.a.b(this.title, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31)) * 31, 31, this.statusList), 31, this.attributes), 31)) * 31;
        String str2 = this.conversationId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConversationButton conversationButton = this.conversationButton;
        int iHashCode4 = (iHashCode3 + (conversationButton == null ? 0 : conversationButton.hashCode())) * 31;
        Boolean bool = this.isRead;
        return Long.hashCode(this.latestStatusUpdatedAt) + ((iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final Boolean isRead() {
        return this.isRead;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Ticket(id=");
        sb2.append(this.id);
        sb2.append(", publicId=");
        sb2.append(this.publicId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", iconUrl=");
        sb2.append(this.iconUrl);
        sb2.append(", emoji=");
        sb2.append(this.emoji);
        sb2.append(", currentStatus=");
        sb2.append(this.currentStatus);
        sb2.append(", statusList=");
        sb2.append(this.statusList);
        sb2.append(", attributes=");
        sb2.append(this.attributes);
        sb2.append(", ticketTypeId=");
        sb2.append(this.ticketTypeId);
        sb2.append(", assignee=");
        sb2.append(this.assignee);
        sb2.append(", conversationId=");
        sb2.append(this.conversationId);
        sb2.append(", conversationButton=");
        sb2.append(this.conversationButton);
        sb2.append(", isRead=");
        sb2.append(this.isRead);
        sb2.append(", latestStatusUpdatedAt=");
        return C4.a.h(sb2, this.latestStatusUpdatedAt, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ticket(String id, String str, String title, String description, String iconUrl, String emoji, Status currentStatus, List<Status> statusList, List<? extends TicketAttribute> attributes, int i10, Participant.Builder assignee, String str2, ConversationButton conversationButton, Boolean bool, long j) {
        i.e(id, "id");
        i.e(title, "title");
        i.e(description, "description");
        i.e(iconUrl, "iconUrl");
        i.e(emoji, "emoji");
        i.e(currentStatus, "currentStatus");
        i.e(statusList, "statusList");
        i.e(attributes, "attributes");
        i.e(assignee, "assignee");
        this.id = id;
        this.publicId = str;
        this.title = title;
        this.description = description;
        this.iconUrl = iconUrl;
        this.emoji = emoji;
        this.currentStatus = currentStatus;
        this.statusList = statusList;
        this.attributes = attributes;
        this.ticketTypeId = i10;
        this.assignee = assignee;
        this.conversationId = str2;
        this.conversationButton = conversationButton;
        this.isRead = bool;
        this.latestStatusUpdatedAt = j;
    }

    public Ticket(String str, String str2, String str3, String str4, String str5, String str6, Status status, List list, List list2, int i10, Participant.Builder builder, String str7, ConversationButton conversationButton, Boolean bool, long j, int i11, e eVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) == 0 ? str6 : "", (i11 & 64) != 0 ? new Status(null, null, null, false, 0L, 31, null) : status, (i11 & 128) != 0 ? EmptyList.f42983b : list, (i11 & 256) != 0 ? EmptyList.f42983b : list2, (i11 & 512) != 0 ? 0 : i10, (i11 & 1024) != 0 ? new Participant.Builder() : builder, (i11 & 2048) != 0 ? null : str7, (i11 & 4096) != 0 ? null : conversationButton, (i11 & 8192) == 0 ? bool : null, (i11 & 16384) != 0 ? 0L : j);
    }
}
