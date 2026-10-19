package io.intercom.android.sdk.m5.push.ui;

import android.app.Notification;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.s;
import androidx.core.app.t;
import androidx.core.app.v;
import androidx.core.graphics.drawable.IconCompat;
import io.intercom.android.sdk.m5.push.ConversationDeepLinkRouterKt;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.m5.push.NotificationChannel;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: DeepLinkStylePushUI.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DeepLinkStylePushUIKt {
    public static final Notification buildDeepLinkNotification(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData, Bitmap bitmap, TaskStackBuilder taskStackBuilder) {
        i.e(context, "context");
        i.e(deepLinkPushData, "deepLinkPushData");
        v vVarCreateBaseNotificationBuilder = BasePushUIKt.createBaseNotificationBuilder(context, deepLinkPushData.getContentTitle(), deepLinkPushData.getContentText(), NotificationChannel.ACTIONS_CHANNEL);
        if (bitmap != null) {
            s sVar = new s();
            sVar.f16782a = IconCompat.c(bitmap);
            sVar.f16783b = null;
            sVar.f16784c = true;
            sVar.b(deepLinkPushData.getContentTitle());
            sVar.c(deepLinkPushData.getContentText());
            vVarCreateBaseNotificationBuilder.g(sVar);
            vVarCreateBaseNotificationBuilder.e(bitmap);
        } else {
            t tVar = new t();
            tVar.a(deepLinkPushData.getContentTitle());
            tVar.f16786a = v.b(deepLinkPushData.getContentText());
            vVarCreateBaseNotificationBuilder.g(tVar);
        }
        vVarCreateBaseNotificationBuilder.f16802g = ConversationDeepLinkRouterKt.buildIntentForDeepLinkScreen(context, deepLinkPushData.getUri(), deepLinkPushData.getInstanceId(), taskStackBuilder);
        Notification notificationA = vVarCreateBaseNotificationBuilder.a();
        i.d(notificationA, "build(...)");
        return notificationA;
    }

    public static /* synthetic */ Notification buildDeepLinkNotification$default(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData, Bitmap bitmap, TaskStackBuilder taskStackBuilder, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            taskStackBuilder = null;
        }
        return buildDeepLinkNotification(context, deepLinkPushData, bitmap, taskStackBuilder);
    }
}
