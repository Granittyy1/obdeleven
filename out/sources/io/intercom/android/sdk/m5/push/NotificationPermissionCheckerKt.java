package io.intercom.android.sdk.m5.push;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.x;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NotificationPermissionChecker.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NotificationPermissionCheckerKt {
    public static final void showNotification(Context context, int i10, Notification notification) {
        i.e(context, "context");
        i.e(notification, "notification");
        showNotifications(context, x.o(new Pair(Integer.valueOf(i10), notification)));
    }

    public static final void showNotifications(Context context, Map<Integer, ? extends Notification> notifications) {
        i.e(context, "context");
        i.e(notifications, "notifications");
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
        if (Build.VERSION.SDK_INT < 33 || p186p0.a.a(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            for (Map.Entry<Integer, ? extends Notification> entry : notifications.entrySet()) {
                notificationManagerCompatFrom.notify(entry.getKey().intValue(), entry.getValue());
            }
        }
    }
}
