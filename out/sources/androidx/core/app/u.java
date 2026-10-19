package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PendingIntent f16787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f16788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16790d;

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class a {
        public static Notification.BubbleMetadata a(u uVar) {
            PendingIntent pendingIntent;
            if (uVar == null || (pendingIntent = uVar.f16787a) == null) {
                return null;
            }
            Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder();
            IconCompat iconCompat = uVar.f16788b;
            iconCompat.getClass();
            Notification.BubbleMetadata.Builder suppressNotification = builder.setIcon(IconCompat.a.f(iconCompat, null)).setIntent(pendingIntent).setDeleteIntent(null).setAutoExpandBubble((uVar.f16790d & 1) != 0).setSuppressNotification((uVar.f16790d & 2) != 0);
            int i10 = uVar.f16789c;
            if (i10 != 0) {
                suppressNotification.setDesiredHeight(i10);
            }
            return suppressNotification.build();
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class b {
        public static Notification.BubbleMetadata a(u uVar) {
            if (uVar == null) {
                return null;
            }
            IconCompat iconCompat = uVar.f16788b;
            iconCompat.getClass();
            Notification.BubbleMetadata.Builder builder = new Notification.BubbleMetadata.Builder(uVar.f16787a, IconCompat.a.f(iconCompat, null));
            builder.setDeleteIntent(null).setAutoExpandBubble((uVar.f16790d & 1) != 0).setSuppressNotification((uVar.f16790d & 2) != 0);
            int i10 = uVar.f16789c;
            if (i10 != 0) {
                builder.setDesiredHeight(i10);
            }
            return builder.build();
        }
    }
}
