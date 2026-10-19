package io.intercom.android.sdk.m5.push;

import Ya.j;
import Ya.k;
import Z3.o;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.D;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.l;
import kotlin.text.n;
import p037cb.u0;

/* JADX INFO: compiled from: IntercomPushData.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface IntercomPushData {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: IntercomPushData.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final IntercomPushData createFrom(Context context, Bundle bundle) {
            i.e(context, "context");
            i.e(bundle, "bundle");
            SimplePushData simplePushDataFromBundle = IntercomPushDataKt.getSimplePushDataFromBundle(bundle);
            if (!simplePushDataFromBundle.isIntercomPush()) {
                return null;
            }
            if (i.a(simplePushDataFromBundle.getIntercomPushType(), "push_only")) {
                return new DeepLinkPushData(simplePushDataFromBundle.getContentTitle(context), simplePushDataFromBundle.getContentText(), simplePushDataFromBundle.getUri(), simplePushDataFromBundle.getContentImageUrl(), simplePushDataFromBundle.getInstanceId());
            }
            String authorName = simplePushDataFromBundle.getAuthorName();
            String imageUrl = simplePushDataFromBundle.getImageUrl();
            String conversationId = simplePushDataFromBundle.getConversationId();
            boolean zA = i.a(simplePushDataFromBundle.getConversationPartType(), "message");
            ConversationPushData.MessageData messageData = simplePushDataFromBundle.getMessageData();
            if (messageData == null) {
                messageData = new ConversationPushData.MessageData.Text(n.p0(n.Z(simplePushDataFromBundle.getContentText(), simplePushDataFromBundle.getAuthorName() + ':')).toString());
            }
            return new ConversationPushData(authorName, imageUrl, conversationId, messageData, false, zA);
        }

        public final boolean isIntercomPush(Bundle bundle) {
            i.e(bundle, "bundle");
            return IntercomPushDataKt.getSimplePushDataFromBundle(bundle).isIntercomPush();
        }
    }

    /* JADX INFO: compiled from: IntercomPushData.kt */
    public static final class ConversationPushData implements IntercomPushData {
        public static final int $stable = 8;
        private final String authorName;
        private final String avatarUrl;
        private final String conversationId;
        private final boolean isCurrentUser;
        private final boolean isNewConversation;
        private final MessageData messageData;

        /* JADX INFO: compiled from: IntercomPushData.kt */
        @k
        public interface MessageData {
            public static final Companion Companion = Companion.$$INSTANCE;

            /* JADX INFO: compiled from: IntercomPushData.kt */
            @k
            public static final class Attachment implements MessageData {
                public static final int $stable = 0;
                public static final Companion Companion = new Companion(null);
                private final String title;
                private final String url;

                /* JADX INFO: compiled from: IntercomPushData.kt */
                public static final class Companion {
                    private Companion() {
                    }

                    public final Ya.b<Attachment> serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(e eVar) {
                        this();
                    }
                }

                public /* synthetic */ Attachment(int i10, String str, String str2, u0 u0Var) {
                    if (3 != (i10 & 3)) {
                        p241t7.b.w(i10, 3, IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.title = str;
                    this.url = str2;
                }

                public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, String str2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = attachment.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = attachment.url;
                    }
                    return attachment.copy(str, str2);
                }

                public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Attachment attachment, p024bb.b bVar, p011ab.e eVar) {
                    bVar.p(eVar, 0, attachment.title);
                    bVar.p(eVar, 1, attachment.url);
                }

                public final String component1() {
                    return this.title;
                }

                public final String component2() {
                    return this.url;
                }

                public final Attachment copy(String title, String url) {
                    i.e(title, "title");
                    i.e(url, "url");
                    return new Attachment(title, url);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Attachment)) {
                        return false;
                    }
                    Attachment attachment = (Attachment) obj;
                    return i.a(this.title, attachment.title) && i.a(this.url, attachment.url);
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return this.url.hashCode() + (this.title.hashCode() * 31);
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Attachment(title=");
                    sb2.append(this.title);
                    sb2.append(", url=");
                    return B7.b.g(sb2, this.url, ')');
                }

                public Attachment(String title, String url) {
                    i.e(title, "title");
                    i.e(url, "url");
                    this.title = title;
                    this.url = url;
                }
            }

            /* JADX INFO: compiled from: IntercomPushData.kt */
            public static final class Companion {
                static final /* synthetic */ Companion $$INSTANCE = new Companion();

                private Companion() {
                }

                public final Ya.b<MessageData> serializer() {
                    j jVar = new j("io.intercom.android.sdk.m5.push.IntercomPushData.ConversationPushData.MessageData", l.a(MessageData.class), new Oa.c[]{l.a(Attachment.class), l.a(Image.class), l.a(Text.class)}, new Ya.b[]{IntercomPushData$ConversationPushData$MessageData$Attachment$$serializer.INSTANCE, IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE, IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE});
                    jVar.f7651b = Q3.d.h(new Annotation[0]);
                    return jVar;
                }
            }

            /* JADX INFO: compiled from: IntercomPushData.kt */
            @k
            public static final class Image implements MessageData {
                public static final int $stable = 0;
                public static final Companion Companion = new Companion(null);
                private final String title;
                private final String url;

                /* JADX INFO: compiled from: IntercomPushData.kt */
                public static final class Companion {
                    private Companion() {
                    }

                    public final Ya.b<Image> serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(e eVar) {
                        this();
                    }
                }

                public /* synthetic */ Image(int i10, String str, String str2, u0 u0Var) {
                    if (3 != (i10 & 3)) {
                        p241t7.b.w(i10, 3, IntercomPushData$ConversationPushData$MessageData$Image$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.title = str;
                    this.url = str2;
                }

                public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = image.title;
                    }
                    if ((i10 & 2) != 0) {
                        str2 = image.url;
                    }
                    return image.copy(str, str2);
                }

                public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Image image, p024bb.b bVar, p011ab.e eVar) {
                    bVar.p(eVar, 0, image.title);
                    bVar.p(eVar, 1, image.url);
                }

                public final String component1() {
                    return this.title;
                }

                public final String component2() {
                    return this.url;
                }

                public final Image copy(String title, String url) {
                    i.e(title, "title");
                    i.e(url, "url");
                    return new Image(title, url);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Image)) {
                        return false;
                    }
                    Image image = (Image) obj;
                    return i.a(this.title, image.title) && i.a(this.url, image.url);
                }

                public final String getTitle() {
                    return this.title;
                }

                public final String getUrl() {
                    return this.url;
                }

                public int hashCode() {
                    return this.url.hashCode() + (this.title.hashCode() * 31);
                }

                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Image(title=");
                    sb2.append(this.title);
                    sb2.append(", url=");
                    return B7.b.g(sb2, this.url, ')');
                }

                public Image(String title, String url) {
                    i.e(title, "title");
                    i.e(url, "url");
                    this.title = title;
                    this.url = url;
                }
            }

            /* JADX INFO: compiled from: IntercomPushData.kt */
            @k
            public static final class Text implements MessageData {
                public static final int $stable = 0;
                public static final Companion Companion = new Companion(null);
                private final String message;

                /* JADX INFO: compiled from: IntercomPushData.kt */
                public static final class Companion {
                    private Companion() {
                    }

                    public final Ya.b<Text> serializer() {
                        return IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE;
                    }

                    public /* synthetic */ Companion(e eVar) {
                        this();
                    }
                }

                public /* synthetic */ Text(int i10, String str, u0 u0Var) {
                    if (1 == (i10 & 1)) {
                        this.message = str;
                    } else {
                        p241t7.b.w(i10, 1, IntercomPushData$ConversationPushData$MessageData$Text$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                }

                public static /* synthetic */ Text copy$default(Text text, String str, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        str = text.message;
                    }
                    return text.copy(str);
                }

                public final String component1() {
                    return this.message;
                }

                public final Text copy(String message) {
                    i.e(message, "message");
                    return new Text(message);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Text) && i.a(this.message, ((Text) obj).message);
                }

                public final String getMessage() {
                    return this.message;
                }

                public int hashCode() {
                    return this.message.hashCode();
                }

                public String toString() {
                    return B7.b.g(new StringBuilder("Text(message="), this.message, ')');
                }

                public Text(String message) {
                    i.e(message, "message");
                    this.message = message;
                }
            }
        }

        public ConversationPushData(String authorName, String avatarUrl, String conversationId, MessageData messageData, boolean z10, boolean z11) {
            i.e(authorName, "authorName");
            i.e(avatarUrl, "avatarUrl");
            i.e(conversationId, "conversationId");
            i.e(messageData, "messageData");
            this.authorName = authorName;
            this.avatarUrl = avatarUrl;
            this.conversationId = conversationId;
            this.messageData = messageData;
            this.isCurrentUser = z10;
            this.isNewConversation = z11;
        }

        public static /* synthetic */ ConversationPushData copy$default(ConversationPushData conversationPushData, String str, String str2, String str3, MessageData messageData, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = conversationPushData.authorName;
            }
            if ((i10 & 2) != 0) {
                str2 = conversationPushData.avatarUrl;
            }
            String str4 = str2;
            if ((i10 & 4) != 0) {
                str3 = conversationPushData.conversationId;
            }
            String str5 = str3;
            if ((i10 & 8) != 0) {
                messageData = conversationPushData.messageData;
            }
            MessageData messageData2 = messageData;
            if ((i10 & 16) != 0) {
                z10 = conversationPushData.isCurrentUser;
            }
            boolean z12 = z10;
            if ((i10 & 32) != 0) {
                z11 = conversationPushData.isNewConversation;
            }
            return conversationPushData.copy(str, str4, str5, messageData2, z12, z11);
        }

        public final String component1() {
            return this.authorName;
        }

        public final String component2() {
            return this.avatarUrl;
        }

        public final String component3() {
            return this.conversationId;
        }

        public final MessageData component4() {
            return this.messageData;
        }

        public final boolean component5() {
            return this.isCurrentUser;
        }

        public final boolean component6() {
            return this.isNewConversation;
        }

        public final ConversationPushData copy(String authorName, String avatarUrl, String conversationId, MessageData messageData, boolean z10, boolean z11) {
            i.e(authorName, "authorName");
            i.e(avatarUrl, "avatarUrl");
            i.e(conversationId, "conversationId");
            i.e(messageData, "messageData");
            return new ConversationPushData(authorName, avatarUrl, conversationId, messageData, z10, z11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConversationPushData)) {
                return false;
            }
            ConversationPushData conversationPushData = (ConversationPushData) obj;
            return i.a(this.authorName, conversationPushData.authorName) && i.a(this.avatarUrl, conversationPushData.avatarUrl) && i.a(this.conversationId, conversationPushData.conversationId) && i.a(this.messageData, conversationPushData.messageData) && this.isCurrentUser == conversationPushData.isCurrentUser && this.isNewConversation == conversationPushData.isNewConversation;
        }

        public final String getAuthorName() {
            return this.authorName;
        }

        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final MessageData getMessageData() {
            return this.messageData;
        }

        @Override // io.intercom.android.sdk.m5.push.IntercomPushData
        public int getNotificationId() {
            return this.conversationId.hashCode();
        }

        public int hashCode() {
            return Boolean.hashCode(this.isNewConversation) + D.b((this.messageData.hashCode() + B1.a.b(this.conversationId, B1.a.b(this.avatarUrl, this.authorName.hashCode() * 31, 31), 31)) * 31, 31, this.isCurrentUser);
        }

        public final boolean isCurrentUser() {
            return this.isCurrentUser;
        }

        public final boolean isNewConversation() {
            return this.isNewConversation;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("ConversationPushData(authorName=");
            sb2.append(this.authorName);
            sb2.append(", avatarUrl=");
            sb2.append(this.avatarUrl);
            sb2.append(", conversationId=");
            sb2.append(this.conversationId);
            sb2.append(", messageData=");
            sb2.append(this.messageData);
            sb2.append(", isCurrentUser=");
            sb2.append(this.isCurrentUser);
            sb2.append(", isNewConversation=");
            return o.d(sb2, this.isNewConversation, ')');
        }
    }

    /* JADX INFO: compiled from: IntercomPushData.kt */
    public static final class DeepLinkPushData implements IntercomPushData {
        public static final int $stable = 0;
        private final String contentImageUrl;
        private final String contentText;
        private final String contentTitle;
        private final String instanceId;
        private final String uri;

        public DeepLinkPushData(String contentTitle, String contentText, String uri, String contentImageUrl, String instanceId) {
            i.e(contentTitle, "contentTitle");
            i.e(contentText, "contentText");
            i.e(uri, "uri");
            i.e(contentImageUrl, "contentImageUrl");
            i.e(instanceId, "instanceId");
            this.contentTitle = contentTitle;
            this.contentText = contentText;
            this.uri = uri;
            this.contentImageUrl = contentImageUrl;
            this.instanceId = instanceId;
        }

        public static /* synthetic */ DeepLinkPushData copy$default(DeepLinkPushData deepLinkPushData, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = deepLinkPushData.contentTitle;
            }
            if ((i10 & 2) != 0) {
                str2 = deepLinkPushData.contentText;
            }
            String str6 = str2;
            if ((i10 & 4) != 0) {
                str3 = deepLinkPushData.uri;
            }
            String str7 = str3;
            if ((i10 & 8) != 0) {
                str4 = deepLinkPushData.contentImageUrl;
            }
            String str8 = str4;
            if ((i10 & 16) != 0) {
                str5 = deepLinkPushData.instanceId;
            }
            return deepLinkPushData.copy(str, str6, str7, str8, str5);
        }

        public final String component1() {
            return this.contentTitle;
        }

        public final String component2() {
            return this.contentText;
        }

        public final String component3() {
            return this.uri;
        }

        public final String component4() {
            return this.contentImageUrl;
        }

        public final String component5() {
            return this.instanceId;
        }

        public final DeepLinkPushData copy(String contentTitle, String contentText, String uri, String contentImageUrl, String instanceId) {
            i.e(contentTitle, "contentTitle");
            i.e(contentText, "contentText");
            i.e(uri, "uri");
            i.e(contentImageUrl, "contentImageUrl");
            i.e(instanceId, "instanceId");
            return new DeepLinkPushData(contentTitle, contentText, uri, contentImageUrl, instanceId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeepLinkPushData)) {
                return false;
            }
            DeepLinkPushData deepLinkPushData = (DeepLinkPushData) obj;
            return i.a(this.contentTitle, deepLinkPushData.contentTitle) && i.a(this.contentText, deepLinkPushData.contentText) && i.a(this.uri, deepLinkPushData.uri) && i.a(this.contentImageUrl, deepLinkPushData.contentImageUrl) && i.a(this.instanceId, deepLinkPushData.instanceId);
        }

        public final String getContentImageUrl() {
            return this.contentImageUrl;
        }

        public final String getContentText() {
            return this.contentText;
        }

        public final String getContentTitle() {
            return this.contentTitle;
        }

        public final String getInstanceId() {
            return this.instanceId;
        }

        @Override // io.intercom.android.sdk.m5.push.IntercomPushData
        public int getNotificationId() {
            return this.instanceId.hashCode();
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.instanceId.hashCode() + B1.a.b(this.contentImageUrl, B1.a.b(this.uri, B1.a.b(this.contentText, this.contentTitle.hashCode() * 31, 31), 31), 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("DeepLinkPushData(contentTitle=");
            sb2.append(this.contentTitle);
            sb2.append(", contentText=");
            sb2.append(this.contentText);
            sb2.append(", uri=");
            sb2.append(this.uri);
            sb2.append(", contentImageUrl=");
            sb2.append(this.contentImageUrl);
            sb2.append(", instanceId=");
            return B7.b.g(sb2, this.instanceId, ')');
        }
    }

    int getNotificationId();
}
