package io.intercom.android.sdk.m5.push.ui;

import android.content.Context;
import androidx.core.app.v;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.push.NotificationChannel;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BasePushUI.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class BasePushUIKt {
    public static final v createBaseNotificationBuilder(Context context, String contentTitle, String contentText, NotificationChannel notificationChannel) {
        i.e(context, "context");
        i.e(contentTitle, "contentTitle");
        i.e(contentText, "contentText");
        i.e(notificationChannel, "notificationChannel");
        v vVar = new v(context, notificationChannel.getChannelName());
        vVar.f16800e = v.b(contentTitle);
        vVar.f16801f = v.b(contentText);
        vVar.f16793C.icon = R.drawable.intercom_push_icon;
        vVar.d(16, true);
        return vVar;
    }
}
