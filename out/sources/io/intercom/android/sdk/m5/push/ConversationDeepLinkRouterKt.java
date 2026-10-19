package io.intercom.android.sdk.m5.push;

import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;
import kotlin.Pair;
import kotlin.jvm.internal.i;
import kotlin.text.n;

/* JADX INFO: compiled from: ConversationDeepLinkRouter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ConversationDeepLinkRouterKt {
    private static final int DEFAULT_REQUEST_CODE = 0;
    public static final String INTERCOM_PUSH_INSTANCE_ID = "io.intercom.android.sdk.INTERCOM_PUSH_INSTANCE_ID";

    private static final PendingIntent buildBasePendingIntent(Context context, Integer num, Intent intent, TaskStackBuilder taskStackBuilder, Bundle bundle) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        if (bundle != null) {
            if (intent != null) {
                intent.putExtras(bundle);
            }
            launchIntentForPackage.putExtras(bundle);
        }
        int iIntValue = num != null ? num.intValue() : 0;
        if (taskStackBuilder == null) {
            return intent != null ? PendingIntent.getActivity(context, iIntValue, intent, 201326592) : PendingIntent.getActivity(context, iIntValue, launchIntentForPackage, 201326592);
        }
        if (intent != null) {
            Intent[] intents = taskStackBuilder.getIntents();
            i.d(intents, "getIntents(...)");
            for (Intent intent2 : intents) {
                if (!i.a(intent2.getComponent(), intent.getComponent())) {
                }
            }
            taskStackBuilder.addNextIntent(intent);
        }
        return taskStackBuilder.getPendingIntent(iIntValue, 201326592);
    }

    public static /* synthetic */ PendingIntent buildBasePendingIntent$default(Context context, Integer num, Intent intent, TaskStackBuilder taskStackBuilder, Bundle bundle, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            bundle = null;
        }
        return buildBasePendingIntent(context, num, intent, taskStackBuilder, bundle);
    }

    public static final PendingIntent buildIntentForConversationScreen(Context context, String conversationId, TaskStackBuilder taskStackBuilder) {
        i.e(context, "context");
        i.e(conversationId, "conversationId");
        Intent intentForArgs$default = !n.S(conversationId) ? IntercomRootActivityArgsKt.getIntentForArgs$default(context, new IntercomRootActivityArgs.ConversationScreenArgs(conversationId, "", false, null, null, null, 48, null), null, null, 4, null) : null;
        return buildBasePendingIntent(context, intentForArgs$default != null ? Integer.valueOf(conversationId.hashCode()) : null, intentForArgs$default, taskStackBuilder, null);
    }

    public static final PendingIntent buildIntentForDeepLinkScreen(Context context, String uri, String instanceId, TaskStackBuilder taskStackBuilder) {
        Intent intent;
        i.e(context, "context");
        i.e(uri, "uri");
        i.e(instanceId, "instanceId");
        if (n.S(uri)) {
            intent = null;
        } else {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(uri));
            intent.addCategory("android.intent.category.BROWSABLE");
        }
        return buildBasePendingIntent(context, intent != null ? Integer.valueOf(uri.hashCode()) : null, intent, taskStackBuilder, p271w0.c.b(new Pair(INTERCOM_PUSH_INSTANCE_ID, instanceId)));
    }

    public static final PendingIntent buildIntentForMessagesScreen(Context context, TaskStackBuilder taskStackBuilder) {
        i.e(context, "context");
        return buildBasePendingIntent(context, 0, IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, null, null, 4, null), taskStackBuilder, null);
    }
}
