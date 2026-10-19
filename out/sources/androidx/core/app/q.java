package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: NotificationChannelGroupCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f16762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<p> f16764d;

    /* JADX INFO: compiled from: NotificationChannelGroupCompat.java */
    public static class a {
        public static NotificationChannelGroup a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        public static List<NotificationChannel> b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getChannels();
        }

        public static String c(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getName();
        }
    }

    /* JADX INFO: compiled from: NotificationChannelGroupCompat.java */
    public static class b {
        public static String a(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getDescription();
        }

        public static boolean b(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.isBlocked();
        }

        public static void c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    public q(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannel = (NotificationChannel) it.next();
            if (this.f16761a.equals(a.c(notificationChannel))) {
                arrayList.add(new p(notificationChannel));
            }
        }
        return arrayList;
    }

    public q(NotificationChannelGroup notificationChannelGroup, List<NotificationChannel> list) {
        String strD = a.d(notificationChannelGroup);
        this.f16764d = Collections.emptyList();
        strD.getClass();
        this.f16761a = strD;
        this.f16762b = a.e(notificationChannelGroup);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f16763c = b.a(notificationChannelGroup);
        }
        if (i10 < 28) {
            a(list);
        } else {
            b.b(notificationChannelGroup);
            a(a.b(notificationChannelGroup));
        }
    }
}
