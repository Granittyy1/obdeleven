package io.intercom.android.sdk.m5.push.ui;

import android.app.Notification;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import androidx.core.app.A;
import androidx.core.app.F;
import androidx.core.app.r;
import androidx.core.app.v;
import androidx.core.app.z;
import androidx.core.graphics.drawable.IconCompat;
import com.braze.Constants;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.push.ConversationActionHandlerKt;
import io.intercom.android.sdk.m5.push.ConversationDeepLinkRouterKt;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.m5.push.NotificationChannel;
import io.intercom.android.sdk.utilities.Phrase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.p;
import kotlin.jvm.internal.i;
import p186p0.b;
import p199q0.c;

/* JADX INFO: compiled from: ConversationStylePushUI.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationStylePushUIKt {
    public static final String KEY_GROUP_CONVERSATION = "io.intercom.android.sdk.INTERCOM_KEY_GROUP_CONVERSATION";
    public static final int SUMMARY_NOTIFICATION_ID = 9999997;

    public static final Notification buildConversationStyleNotification(Context context, IntercomPushConversation conversation, c cVar, IntercomPushData.ConversationPushData conversationPushData, NotificationChannel notificationChannel, boolean z10, TaskStackBuilder taskStackBuilder) {
        r rVarBuildContextualAction;
        boolean z11;
        i.e(context, "context");
        i.e(conversation, "conversation");
        i.e(conversationPushData, "conversationPushData");
        i.e(notificationChannel, "notificationChannel");
        String string = context.getString(R.string.intercom_new_notifications);
        i.d(string, "getString(...)");
        String messagesContentText = getMessagesContentText(context, conversation.getMessages().size());
        String string2 = context.getString(R.string.intercom_you);
        i.d(string2, "getString(...)");
        F f10 = new F();
        f10.f16682a = string2;
        f10.f16683b = null;
        f10.f16684c = null;
        f10.f16685d = null;
        f10.f16686e = false;
        f10.f16687f = false;
        A a10 = new A(f10);
        for (IntercomPushConversation.Message message : conversation.getMessages()) {
            A.d dVar = new A.d(message.getMessage(), message.getTimestamp(), message.getPerson());
            Uri contentImageUri = message.getContentImageUri();
            if (contentImageUri != null) {
                dVar.f16675e = "image/";
                dVar.f16676f = contentImageUri;
            }
            ArrayList arrayList = a10.f16666a;
            arrayList.add(dVar);
            if (arrayList.size() > 25) {
                z11 = false;
                arrayList.remove(0);
            } else {
                z11 = false;
            }
        }
        v vVarCreateBaseNotificationBuilder = BasePushUIKt.createBaseNotificationBuilder(context, string, messagesContentText, notificationChannel);
        vVarCreateBaseNotificationBuilder.g(a10);
        if (cVar != null) {
            String str = cVar.f45961b;
            vVarCreateBaseNotificationBuilder.f16819y = str;
            if (vVarCreateBaseNotificationBuilder.f16820z == null) {
                b bVar = cVar.f45969k;
                if (bVar != null) {
                    vVarCreateBaseNotificationBuilder.f16820z = bVar;
                } else if (str != null) {
                    vVarCreateBaseNotificationBuilder.f16820z = new b(str);
                }
            }
            if (vVarCreateBaseNotificationBuilder.f16800e == null) {
                vVarCreateBaseNotificationBuilder.f16800e = v.b(cVar.f45964e);
            }
        }
        vVarCreateBaseNotificationBuilder.f16802g = ConversationDeepLinkRouterKt.buildIntentForConversationScreen(context, conversation.getConversationId(), taskStackBuilder);
        int i10 = Build.VERSION.SDK_INT;
        r rVarBuildReplyAction = ConversationActionHandlerKt.buildReplyAction(context, conversation.getConversationId(), taskStackBuilder);
        if (rVarBuildReplyAction != null) {
            vVarCreateBaseNotificationBuilder.f16797b.add(rVarBuildReplyAction);
        }
        if ((conversationPushData.getMessageData() instanceof IntercomPushData.ConversationPushData.MessageData.Attachment) && (rVarBuildContextualAction = ConversationActionHandlerKt.buildContextualAction(context, ((IntercomPushData.ConversationPushData.MessageData.Attachment) conversationPushData.getMessageData()).getUrl())) != null) {
            vVarCreateBaseNotificationBuilder.f16797b.add(rVarBuildContextualAction);
        }
        if (i10 >= 31) {
            vVarCreateBaseNotificationBuilder.f16792B = BubbleMetaDataKt.getBubbleMetaData(context, conversation);
        }
        vVarCreateBaseNotificationBuilder.f16808n = KEY_GROUP_CONVERSATION;
        vVarCreateBaseNotificationBuilder.f16794D = z10;
        Notification notificationA = vVarCreateBaseNotificationBuilder.a();
        i.d(notificationA, "build(...)");
        return notificationA;
    }

    public static /* synthetic */ Notification buildConversationStyleNotification$default(Context context, IntercomPushConversation intercomPushConversation, c cVar, IntercomPushData.ConversationPushData conversationPushData, NotificationChannel notificationChannel, boolean z10, TaskStackBuilder taskStackBuilder, int i10, Object obj) {
        if ((i10 & 64) != 0) {
            taskStackBuilder = null;
        }
        return buildConversationStyleNotification(context, intercomPushConversation, cVar, conversationPushData, notificationChannel, z10, taskStackBuilder);
    }

    public static final Notification buildConversationStyleSummaryNotification(Context context, List<IntercomPushConversation> conversations, NotificationChannel notificationChannel, TaskStackBuilder taskStackBuilder) {
        CharSequence charSequence;
        i.e(context, "context");
        i.e(conversations, "conversations");
        i.e(notificationChannel, "notificationChannel");
        String string = context.getString(R.string.intercom_new_notifications);
        i.d(string, "getString(...)");
        List<IntercomPushConversation> list = conversations;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            p.z(arrayList, ((IntercomPushConversation) it.next()).getMessages());
        }
        String messagesContentText = getMessagesContentText(context, arrayList.size());
        z zVar = new z();
        zVar.a(string);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            for (IntercomPushConversation.Message message : ((IntercomPushConversation) it2.next()).getMessages()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                F person = message.getPerson();
                if (person != null && (charSequence = person.f16682a) != null) {
                    StyleSpan styleSpan = new StyleSpan(1);
                    int length = spannableStringBuilder.length();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) charSequence);
                    sb2.append(' ');
                    spannableStringBuilder.append((CharSequence) sb2.toString());
                    spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                }
                spannableStringBuilder.append((CharSequence) message.getMessage());
                zVar.f16830a.add(v.b(new SpannedString(spannableStringBuilder)));
            }
        }
        v vVarCreateBaseNotificationBuilder = BasePushUIKt.createBaseNotificationBuilder(context, string, messagesContentText, notificationChannel);
        vVarCreateBaseNotificationBuilder.f16802g = ConversationDeepLinkRouterKt.buildIntentForMessagesScreen(context, taskStackBuilder);
        vVarCreateBaseNotificationBuilder.f16808n = KEY_GROUP_CONVERSATION;
        vVarCreateBaseNotificationBuilder.f16809o = true;
        vVarCreateBaseNotificationBuilder.g(zVar);
        Notification notificationA = vVarCreateBaseNotificationBuilder.a();
        i.d(notificationA, "build(...)");
        return notificationA;
    }

    private static final String getMessagesContentText(Context context, int i10) {
        String string = i10 == 1 ? context.getString(R.string.intercom_one_new_message) : Phrase.from(context, R.string.intercom_new_messages).put(Constants.BRAZE_PUSH_CUSTOM_NOTIFICATION_ID, i10).format().toString();
        i.b(string);
        return string;
    }

    public static final IntercomPushConversation.Message toMessage(IntercomPushData.ConversationPushData conversationPushData, long j, Bitmap bitmap, Uri uri) {
        F f10;
        String title;
        i.e(conversationPushData, "<this>");
        if (conversationPushData.isCurrentUser()) {
            f10 = null;
        } else {
            String authorName = conversationPushData.getAuthorName();
            String str = conversationPushData.getAuthorName() + conversationPushData.getAvatarUrl();
            IconCompat iconCompatC = bitmap != null ? IconCompat.c(bitmap) : null;
            F f11 = new F();
            f11.f16682a = authorName;
            f11.f16683b = iconCompatC;
            f11.f16684c = null;
            f11.f16685d = str;
            f11.f16686e = false;
            f11.f16687f = false;
            f10 = f11;
        }
        IntercomPushData.ConversationPushData.MessageData messageData = conversationPushData.getMessageData();
        if (messageData instanceof IntercomPushData.ConversationPushData.MessageData.Text) {
            title = ((IntercomPushData.ConversationPushData.MessageData.Text) conversationPushData.getMessageData()).getMessage();
        } else if (messageData instanceof IntercomPushData.ConversationPushData.MessageData.Image) {
            title = ((IntercomPushData.ConversationPushData.MessageData.Image) conversationPushData.getMessageData()).getTitle();
        } else {
            if (!(messageData instanceof IntercomPushData.ConversationPushData.MessageData.Attachment)) {
                throw new NoWhenBranchMatchedException();
            }
            title = ((IntercomPushData.ConversationPushData.MessageData.Attachment) conversationPushData.getMessageData()).getTitle();
        }
        return new IntercomPushConversation.Message(f10, j, title, uri);
    }

    public static /* synthetic */ IntercomPushConversation.Message toMessage$default(IntercomPushData.ConversationPushData conversationPushData, long j, Bitmap bitmap, Uri uri, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bitmap = null;
        }
        if ((i10 & 4) != 0) {
            uri = null;
        }
        return toMessage(conversationPushData, j, bitmap, uri);
    }
}
