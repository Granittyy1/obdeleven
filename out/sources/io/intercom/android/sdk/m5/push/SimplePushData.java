package io.intercom.android.sdk.m5.push;

import android.content.Context;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.ui.common.ActualStringOrResKt;
import kotlin.Pair;
import kotlin.collections.l;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import p050db.AbstractC2184a;
import p050db.s;
import p293xa.r;

/* JADX INFO: compiled from: IntercomPushData.kt */
/* JADX INFO: loaded from: classes3.dex */
final class SimplePushData {
    private final String appName;
    private final String authorName;
    private final String body;
    private final String contentImageUrl;
    private final String conversationId;
    private final String conversationPartType;
    private final String imageUrl;
    private final String instanceId;
    private final String intercomPushType;
    private final AbstractC2184a json;
    private final String message;
    private final String messageData;
    private final String receiver;
    private final String title;
    private final Twig twig;
    private final String uri;

    public SimplePushData(String intercomPushType, String conversationId, String title, String message, String body, String receiver, String authorName, String appName, String contentImageUrl, String imageUrl, String uri, String instanceId, String conversationPartType, String messageData) {
        i.e(intercomPushType, "intercomPushType");
        i.e(conversationId, "conversationId");
        i.e(title, "title");
        i.e(message, "message");
        i.e(body, "body");
        i.e(receiver, "receiver");
        i.e(authorName, "authorName");
        i.e(appName, "appName");
        i.e(contentImageUrl, "contentImageUrl");
        i.e(imageUrl, "imageUrl");
        i.e(uri, "uri");
        i.e(instanceId, "instanceId");
        i.e(conversationPartType, "conversationPartType");
        i.e(messageData, "messageData");
        this.intercomPushType = intercomPushType;
        this.conversationId = conversationId;
        this.title = title;
        this.message = message;
        this.body = body;
        this.receiver = receiver;
        this.authorName = authorName;
        this.appName = appName;
        this.contentImageUrl = contentImageUrl;
        this.imageUrl = imageUrl;
        this.uri = uri;
        this.instanceId = instanceId;
        this.conversationPartType = conversationPartType;
        this.messageData = messageData;
        this.json = s.a(new d());
        this.twig = LumberMill.getLogger();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r json$lambda$0(p050db.d Json) {
        i.e(Json, "$this$Json");
        Json.f34653c = true;
        return r.f47939a;
    }

    public final String component1() {
        return this.intercomPushType;
    }

    public final String component10() {
        return this.imageUrl;
    }

    public final String component11() {
        return this.uri;
    }

    public final String component12() {
        return this.instanceId;
    }

    public final String component13() {
        return this.conversationPartType;
    }

    public final String component14() {
        return this.messageData;
    }

    public final String component2() {
        return this.conversationId;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.message;
    }

    public final String component5() {
        return this.body;
    }

    public final String component6() {
        return this.receiver;
    }

    public final String component7() {
        return this.authorName;
    }

    public final String component8() {
        return this.appName;
    }

    public final String component9() {
        return this.contentImageUrl;
    }

    public final SimplePushData copy(String intercomPushType, String conversationId, String title, String message, String body, String receiver, String authorName, String appName, String contentImageUrl, String imageUrl, String uri, String instanceId, String conversationPartType, String messageData) {
        i.e(intercomPushType, "intercomPushType");
        i.e(conversationId, "conversationId");
        i.e(title, "title");
        i.e(message, "message");
        i.e(body, "body");
        i.e(receiver, "receiver");
        i.e(authorName, "authorName");
        i.e(appName, "appName");
        i.e(contentImageUrl, "contentImageUrl");
        i.e(imageUrl, "imageUrl");
        i.e(uri, "uri");
        i.e(instanceId, "instanceId");
        i.e(conversationPartType, "conversationPartType");
        i.e(messageData, "messageData");
        return new SimplePushData(intercomPushType, conversationId, title, message, body, receiver, authorName, appName, contentImageUrl, imageUrl, uri, instanceId, conversationPartType, messageData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimplePushData)) {
            return false;
        }
        SimplePushData simplePushData = (SimplePushData) obj;
        return i.a(this.intercomPushType, simplePushData.intercomPushType) && i.a(this.conversationId, simplePushData.conversationId) && i.a(this.title, simplePushData.title) && i.a(this.message, simplePushData.message) && i.a(this.body, simplePushData.body) && i.a(this.receiver, simplePushData.receiver) && i.a(this.authorName, simplePushData.authorName) && i.a(this.appName, simplePushData.appName) && i.a(this.contentImageUrl, simplePushData.contentImageUrl) && i.a(this.imageUrl, simplePushData.imageUrl) && i.a(this.uri, simplePushData.uri) && i.a(this.instanceId, simplePushData.instanceId) && i.a(this.conversationPartType, simplePushData.conversationPartType) && i.a(this.messageData, simplePushData.messageData);
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getContentImageUrl() {
        return this.contentImageUrl;
    }

    public final String getContentText() {
        String str = this.message;
        return n.S(str) ? this.body : str;
    }

    public final String getContentTitle(Context context) {
        i.e(context, "context");
        if (!n.S(this.title)) {
            return this.title;
        }
        if (n.S(this.authorName) || n.S(this.appName)) {
            return !n.S(this.authorName) ? this.authorName : this.appName;
        }
        return ActualStringOrResKt.parseString(context, R.string.intercom_teammate_from_company, l.s(new Pair("name", this.authorName), new Pair("company", this.appName)));
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getConversationPartType() {
        return this.conversationPartType;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final String getIntercomPushType() {
        return this.intercomPushType;
    }

    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: getMessageData, reason: collision with other method in class */
    public final String m344getMessageData() {
        return this.messageData;
    }

    public final String getReceiver() {
        return this.receiver;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return this.messageData.hashCode() + B1.a.b(this.conversationPartType, B1.a.b(this.instanceId, B1.a.b(this.uri, B1.a.b(this.imageUrl, B1.a.b(this.contentImageUrl, B1.a.b(this.appName, B1.a.b(this.authorName, B1.a.b(this.receiver, B1.a.b(this.body, B1.a.b(this.message, B1.a.b(this.title, B1.a.b(this.conversationId, this.intercomPushType.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isIntercomPush() {
        return !n.S(this.intercomPushType) && Intercom.PUSH_RECEIVER.equals(this.receiver);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SimplePushData(intercomPushType=");
        sb2.append(this.intercomPushType);
        sb2.append(", conversationId=");
        sb2.append(this.conversationId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", message=");
        sb2.append(this.message);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", receiver=");
        sb2.append(this.receiver);
        sb2.append(", authorName=");
        sb2.append(this.authorName);
        sb2.append(", appName=");
        sb2.append(this.appName);
        sb2.append(", contentImageUrl=");
        sb2.append(this.contentImageUrl);
        sb2.append(", imageUrl=");
        sb2.append(this.imageUrl);
        sb2.append(", uri=");
        sb2.append(this.uri);
        sb2.append(", instanceId=");
        sb2.append(this.instanceId);
        sb2.append(", conversationPartType=");
        sb2.append(this.conversationPartType);
        sb2.append(", messageData=");
        return B7.b.g(sb2, this.messageData, ')');
    }

    public final IntercomPushData.ConversationPushData.MessageData getMessageData() {
        if (!n.S(this.body)) {
            return new IntercomPushData.ConversationPushData.MessageData.Text(this.body);
        }
        if (!n.S(this.messageData)) {
            try {
                AbstractC2184a abstractC2184a = this.json;
                String str = this.messageData;
                abstractC2184a.getClass();
                return (IntercomPushData.ConversationPushData.MessageData) abstractC2184a.a(Za.a.c(IntercomPushData.ConversationPushData.MessageData.Companion.serializer()), str);
            } catch (IllegalArgumentException e10) {
                this.twig.e(e10);
            }
        }
        return null;
    }
}
