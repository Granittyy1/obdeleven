package io.intercom.android.sdk.models;

import Ba.a;
import I7.b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationEndedButton.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationEndedButton {
    public static final int $stable = 0;

    @b(AttributeType.TEXT)
    private final String ctaTitle;

    @b("title")
    private final String message;
    private final Metadata metadata;
    private final Reason reason;

    /* JADX INFO: compiled from: ConversationEndedButton.kt */
    public static final class Metadata {
        public static final int $stable = 0;

        @b("merged_into_conversation_id")
        private final String mergedIntoConversationId;

        public Metadata(String mergedIntoConversationId) {
            i.e(mergedIntoConversationId, "mergedIntoConversationId");
            this.mergedIntoConversationId = mergedIntoConversationId;
        }

        public static /* synthetic */ Metadata copy$default(Metadata metadata, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = metadata.mergedIntoConversationId;
            }
            return metadata.copy(str);
        }

        public final String component1() {
            return this.mergedIntoConversationId;
        }

        public final Metadata copy(String mergedIntoConversationId) {
            i.e(mergedIntoConversationId, "mergedIntoConversationId");
            return new Metadata(mergedIntoConversationId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Metadata) && i.a(this.mergedIntoConversationId, ((Metadata) obj).mergedIntoConversationId);
        }

        public final String getMergedIntoConversationId() {
            return this.mergedIntoConversationId;
        }

        public int hashCode() {
            return this.mergedIntoConversationId.hashCode();
        }

        public String toString() {
            return B7.b.g(new StringBuilder("Metadata(mergedIntoConversationId="), this.mergedIntoConversationId, ')');
        }
    }

    /* JADX INFO: compiled from: ConversationEndedButton.kt */
    public enum Reason {
        UNKNOWN,
        MERGED_INTO_CONVERSATION;

        private static final /* synthetic */ a $ENTRIES = kotlin.enums.a.a(values());

        public static a<Reason> getEntries() {
            return $ENTRIES;
        }
    }

    public ConversationEndedButton(String message, String ctaTitle, Reason reason, Metadata metadata) {
        i.e(message, "message");
        i.e(ctaTitle, "ctaTitle");
        i.e(reason, "reason");
        this.message = message;
        this.ctaTitle = ctaTitle;
        this.reason = reason;
        this.metadata = metadata;
    }

    public static /* synthetic */ ConversationEndedButton copy$default(ConversationEndedButton conversationEndedButton, String str, String str2, Reason reason, Metadata metadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = conversationEndedButton.message;
        }
        if ((i10 & 2) != 0) {
            str2 = conversationEndedButton.ctaTitle;
        }
        if ((i10 & 4) != 0) {
            reason = conversationEndedButton.reason;
        }
        if ((i10 & 8) != 0) {
            metadata = conversationEndedButton.metadata;
        }
        return conversationEndedButton.copy(str, str2, reason, metadata);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.ctaTitle;
    }

    public final Reason component3() {
        return this.reason;
    }

    public final Metadata component4() {
        return this.metadata;
    }

    public final ConversationEndedButton copy(String message, String ctaTitle, Reason reason, Metadata metadata) {
        i.e(message, "message");
        i.e(ctaTitle, "ctaTitle");
        i.e(reason, "reason");
        return new ConversationEndedButton(message, ctaTitle, reason, metadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationEndedButton)) {
            return false;
        }
        ConversationEndedButton conversationEndedButton = (ConversationEndedButton) obj;
        return i.a(this.message, conversationEndedButton.message) && i.a(this.ctaTitle, conversationEndedButton.ctaTitle) && this.reason == conversationEndedButton.reason && i.a(this.metadata, conversationEndedButton.metadata);
    }

    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final Reason getReason() {
        return this.reason;
    }

    public int hashCode() {
        int iHashCode = (this.reason.hashCode() + B1.a.b(this.ctaTitle, this.message.hashCode() * 31, 31)) * 31;
        Metadata metadata = this.metadata;
        return iHashCode + (metadata == null ? 0 : metadata.hashCode());
    }

    public String toString() {
        return "ConversationEndedButton(message=" + this.message + ", ctaTitle=" + this.ctaTitle + ", reason=" + this.reason + ", metadata=" + this.metadata + ')';
    }

    public /* synthetic */ ConversationEndedButton(String str, String str2, Reason reason, Metadata metadata, int i10, e eVar) {
        this(str, str2, reason, (i10 & 8) != 0 ? null : metadata);
    }
}
