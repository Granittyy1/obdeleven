package io.intercom.android.sdk.m5.push;

import K2.K;
import Q2.z;
import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.H;
import androidx.work.NetworkType;
import androidx.work.m;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.collections.q;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ConversationReplyReceiver.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationReplyReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        String string;
        String stringExtra;
        TaskStackBuilder taskStackBuilder;
        i.e(context, "context");
        i.e(intent, "intent");
        Bundle bundleB = H.a.b(intent);
        if (bundleB == null || (string = bundleB.getString(ConversationActionHandlerKt.KEY_TEXT_REPLY)) == null || (stringExtra = intent.getStringExtra(ConversationActionHandlerKt.KEY_CONVERSATION_ID)) == null) {
            return;
        }
        Intent[] intentArr = (Intent[]) intent.getParcelableArrayExtra(ConversationActionHandlerKt.KEY_CUSTOM_STACK_INTENTS, Intent.class);
        if (intentArr != null) {
            TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
            for (Intent intent2 : intentArr) {
                taskStackBuilderCreate.addNextIntent(intent2);
            }
            taskStackBuilder = taskStackBuilderCreate;
        } else {
            taskStackBuilder = null;
        }
        HashMap map = new HashMap();
        map.put(ConversationActionHandlerKt.KEY_TEXT_REPLY, string);
        map.put(ConversationActionHandlerKt.KEY_CONVERSATION_ID, stringExtra);
        androidx.work.d dVar = new androidx.work.d(map);
        androidx.work.d.b(dVar);
        androidx.work.c cVar = new androidx.work.c(NetworkType.f20297c, false, false, false, false, -1L, -1L, q.s0(new LinkedHashSet()));
        K kB = K.b(context);
        m.a aVar = new m.a(SendMessageWorker.class);
        z zVar = aVar.f20470b;
        zVar.f5040e = dVar;
        zVar.j = cVar;
        m mVarA = aVar.a();
        kB.getClass();
        kB.a(Collections.singletonList(mVarA));
        IntercomNotificationHandler.processConversationPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler.INSTANCE, context, new IntercomPushData.ConversationPushData("", "", stringExtra, new IntercomPushData.ConversationPushData.MessageData.Text(string), true, false), taskStackBuilder, true, null, 16, null);
    }
}
