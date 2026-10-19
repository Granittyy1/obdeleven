package com.parse;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
class ParseNotificationManager {
    private final AtomicInteger notificationCount = new AtomicInteger(0);

    public static class Singleton {
        private static final ParseNotificationManager INSTANCE = new ParseNotificationManager();
    }

    public static ParseNotificationManager getInstance() {
        return Singleton.INSTANCE;
    }

    public void showNotification(Context context, Notification notification) {
        if (context == null || notification == null) {
            return;
        }
        this.notificationCount.incrementAndGet();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        try {
            notificationManager.notify(iCurrentTimeMillis, notification);
        } catch (SecurityException unused) {
            notification.defaults = 5;
            notificationManager.notify(iCurrentTimeMillis, notification);
        }
    }
}
