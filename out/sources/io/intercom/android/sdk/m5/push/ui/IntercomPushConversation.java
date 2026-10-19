package io.intercom.android.sdk.m5.push.ui;

import B1.a;
import C4.b;
import Q8.d;
import android.net.Uri;
import androidx.core.app.F;
import java.util.List;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationStylePushUI.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPushConversation {
    public static final int $stable = 8;
    private final String conversationId;
    private final String conversationTitle;
    private final List<Message> messages;

    /* JADX INFO: compiled from: ConversationStylePushUI.kt */
    public static final class Message {
        public static final int $stable = 8;
        private final Uri contentImageUri;
        private final boolean isCurrentUser;
        private final String message;
        private final F person;
        private final long timestamp;

        public Message(F f10, long j, String message, Uri uri) {
            i.e(message, "message");
            this.person = f10;
            this.timestamp = j;
            this.message = message;
            this.contentImageUri = uri;
            this.isCurrentUser = f10 == null;
        }

        public static /* synthetic */ Message copy$default(Message message, F f10, long j, String str, Uri uri, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = message.person;
            }
            if ((i10 & 2) != 0) {
                j = message.timestamp;
            }
            long j10 = j;
            if ((i10 & 4) != 0) {
                str = message.message;
            }
            String str2 = str;
            if ((i10 & 8) != 0) {
                uri = message.contentImageUri;
            }
            return message.copy(f10, j10, str2, uri);
        }

        public final F component1() {
            return this.person;
        }

        public final long component2() {
            return this.timestamp;
        }

        public final String component3() {
            return this.message;
        }

        public final Uri component4() {
            return this.contentImageUri;
        }

        public final Message copy(F f10, long j, String message, Uri uri) {
            i.e(message, "message");
            return new Message(f10, j, message, uri);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return i.a(this.person, message.person) && this.timestamp == message.timestamp && i.a(this.message, message.message) && i.a(this.contentImageUri, message.contentImageUri);
        }

        public final Uri getContentImageUri() {
            return this.contentImageUri;
        }

        public final String getMessage() {
            return this.message;
        }

        public final F getPerson() {
            return this.person;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            F f10 = this.person;
            int iB = a.b(this.message, b.c(this.timestamp, (f10 == null ? 0 : f10.hashCode()) * 31, 31), 31);
            Uri uri = this.contentImageUri;
            return iB + (uri != null ? uri.hashCode() : 0);
        }

        public final boolean isCurrentUser() {
            return this.isCurrentUser;
        }

        public String toString() {
            return "Message(person=" + this.person + ", timestamp=" + this.timestamp + ", message=" + this.message + ", contentImageUri=" + this.contentImageUri + ')';
        }
    }

    public IntercomPushConversation(String conversationId, String conversationTitle, List<Message> messages) {
        i.e(conversationId, "conversationId");
        i.e(conversationTitle, "conversationTitle");
        i.e(messages, "messages");
        this.conversationId = conversationId;
        this.conversationTitle = conversationTitle;
        this.messages = messages;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntercomPushConversation copy$default(IntercomPushConversation intercomPushConversation, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = intercomPushConversation.conversationId;
        }
        if ((i10 & 2) != 0) {
            str2 = intercomPushConversation.conversationTitle;
        }
        if ((i10 & 4) != 0) {
            list = intercomPushConversation.messages;
        }
        return intercomPushConversation.copy(str, str2, list);
    }

    public final String component1() {
        return this.conversationId;
    }

    public final String component2() {
        return this.conversationTitle;
    }

    public final List<Message> component3() {
        return this.messages;
    }

    public final IntercomPushConversation copy(String conversationId, String conversationTitle, List<Message> messages) {
        i.e(conversationId, "conversationId");
        i.e(conversationTitle, "conversationTitle");
        i.e(messages, "messages");
        return new IntercomPushConversation(conversationId, conversationTitle, messages);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntercomPushConversation)) {
            return false;
        }
        IntercomPushConversation intercomPushConversation = (IntercomPushConversation) obj;
        return i.a(this.conversationId, intercomPushConversation.conversationId) && i.a(this.conversationTitle, intercomPushConversation.conversationTitle) && i.a(this.messages, intercomPushConversation.messages);
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationTitle() {
        return this.conversationTitle;
    }

    public final List<Message> getMessages() {
        return this.messages;
    }

    public int hashCode() {
        return this.messages.hashCode() + a.b(this.conversationTitle, this.conversationId.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IntercomPushConversation(conversationId=");
        sb2.append(this.conversationId);
        sb2.append(", conversationTitle=");
        sb2.append(this.conversationTitle);
        sb2.append(", messages=");
        return d.b(sb2, this.messages, ')');
    }
}
