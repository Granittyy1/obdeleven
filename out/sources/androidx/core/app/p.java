package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: compiled from: NotificationChannelCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f16749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f16754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AudioAttributes f16755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f16756i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f16757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long[] f16758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f16759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f16760n;

    /* JADX INFO: compiled from: NotificationChannelCompat.java */
    public static class a {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        public static boolean b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        public static NotificationChannel c(String str, CharSequence charSequence, int i10) {
            return new NotificationChannel(str, charSequence, i10);
        }

        public static void d(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableLights(z10);
        }

        public static void e(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableVibration(z10);
        }

        public static AudioAttributes f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        public static String h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        public static String i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static int j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        public static int k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        public static int l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        public static CharSequence m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        public static Uri n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        public static long[] o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        public static void p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        public static void q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        public static void r(NotificationChannel notificationChannel, int i10) {
            notificationChannel.setLightColor(i10);
        }

        public static void s(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.setShowBadge(z10);
        }

        public static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        public static void u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        public static boolean v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        public static boolean w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    /* JADX INFO: compiled from: NotificationChannelCompat.java */
    public static class b {
        public static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    /* JADX INFO: compiled from: NotificationChannelCompat.java */
    public static class c {
        public static String a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        public static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        public static boolean c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        public static void d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    public p(String str, int i10) {
        this.f16753f = true;
        this.f16754g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.j = 0;
        str.getClass();
        this.f16748a = str;
        this.f16750c = i10;
        this.f16755h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public final NotificationChannel a() {
        String str;
        String str2;
        int i10 = Build.VERSION.SDK_INT;
        NotificationChannel notificationChannelC = a.c(this.f16748a, this.f16749b, this.f16750c);
        a.p(notificationChannelC, this.f16751d);
        a.q(notificationChannelC, this.f16752e);
        a.s(notificationChannelC, this.f16753f);
        a.t(notificationChannelC, this.f16754g, this.f16755h);
        a.d(notificationChannelC, this.f16756i);
        a.r(notificationChannelC, this.j);
        a.u(notificationChannelC, this.f16758l);
        a.e(notificationChannelC, this.f16757k);
        if (i10 >= 30 && (str = this.f16759m) != null && (str2 = this.f16760n) != null) {
            c.d(notificationChannelC, str, str2);
        }
        return notificationChannelC;
    }

    public p(NotificationChannel notificationChannel) {
        this(a.i(notificationChannel), a.j(notificationChannel));
        this.f16749b = a.m(notificationChannel);
        this.f16751d = a.g(notificationChannel);
        this.f16752e = a.h(notificationChannel);
        this.f16753f = a.b(notificationChannel);
        this.f16754g = a.n(notificationChannel);
        this.f16755h = a.f(notificationChannel);
        this.f16756i = a.v(notificationChannel);
        this.j = a.k(notificationChannel);
        this.f16757k = a.w(notificationChannel);
        this.f16758l = a.o(notificationChannel);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f16759m = c.b(notificationChannel);
            this.f16760n = c.a(notificationChannel);
        }
        a.a(notificationChannel);
        a.l(notificationChannel);
        if (i10 >= 29) {
            b.a(notificationChannel);
        }
        if (i10 >= 30) {
            c.c(notificationChannel);
        }
    }
}
