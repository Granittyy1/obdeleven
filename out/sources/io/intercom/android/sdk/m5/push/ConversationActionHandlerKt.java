package io.intercom.android.sdk.m5.push;

import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.H;
import androidx.core.app.r;
import androidx.core.graphics.drawable.IconCompat;
import io.intercom.android.sdk.R;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationActionHandler.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationActionHandlerKt {
    public static final String KEY_CONVERSATION_ID = "io.intercom.android.sdk.INTERCOM_KEY_CONVERSATION_ID";
    public static final String KEY_CUSTOM_STACK_INTENTS = "io.intercom.android.sdk.INTERCOM_KEY_CUSTOM_STACK_INTENTS";
    public static final String KEY_TEXT_REPLY = "io.intercom.android.sdk.INTERCOM_KEY_TEXT_REPLY";

    public static final r buildContextualAction(Context context, String url) {
        i.e(context, "context");
        i.e(url, "url");
        r.a aVar = new r.a(IconCompat.d(context, R.drawable.intercom_ic_attachment), "Open Attachment", getAttachmentIntent(context, url));
        aVar.f16781h = true;
        return aVar.a();
    }

    public static final r buildReplyAction(Context context, String conversationId, TaskStackBuilder taskStackBuilder) {
        i.e(context, "context");
        i.e(conversationId, "conversationId");
        HashSet hashSet = new HashSet();
        Bundle bundle = new Bundle();
        int i10 = R.string.intercom_reply;
        H h8 = new H(context.getString(i10), bundle, hashSet);
        r.a aVar = new r.a(io.intercom.android.sdk.ui.R.drawable.intercom_send, getReplyIntent(context, conversationId, taskStackBuilder), context.getString(i10));
        aVar.f16779f = new ArrayList<>();
        aVar.f16779f.add(h8);
        return aVar.a();
    }

    private static final PendingIntent getAttachmentIntent(Context context, String str) {
        int iHashCode = str.hashCode();
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        PendingIntent activity = PendingIntent.getActivity(context, iHashCode, intent, 201326592);
        i.d(activity, "getActivity(...)");
        return activity;
    }

    private static final PendingIntent getReplyIntent(Context context, String str, TaskStackBuilder taskStackBuilder) {
        int iHashCode = str.hashCode();
        int i10 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent(context, (Class<?>) ConversationReplyReceiver.class);
        intent.putExtra(KEY_CONVERSATION_ID, str);
        if (taskStackBuilder != null) {
            intent.putExtra(KEY_CUSTOM_STACK_INTENTS, taskStackBuilder.getIntents());
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, iHashCode, intent, i10);
        i.d(broadcast, "getBroadcast(...)");
        return broadcast;
    }
}
