package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f16791A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public u f16792B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Notification f16793C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f16794D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Deprecated
    public final ArrayList<String> f16795E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16796a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f16800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f16801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PendingIntent f16802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f16803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16804i;
    public int j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public B f16806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f16807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f16808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f16809o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f16811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bundle f16812r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Notification f16815u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RemoteViews f16816v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RemoteViews f16817w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f16818x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f16819y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p186p0.b f16820z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<r> f16797b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<F> f16798c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<r> f16799d = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16805k = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16810p = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16813s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16814t = 0;

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class a {
        public static AudioAttributes a(AudioAttributes.Builder builder) {
            return builder.build();
        }

        public static AudioAttributes.Builder b() {
            return new AudioAttributes.Builder();
        }

        public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
            return builder.setContentType(i10);
        }

        public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
            return builder.setLegacyStreamType(i10);
        }

        public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
            return builder.setUsage(i10);
        }
    }

    public v(Context context, String str) {
        Notification notification = new Notification();
        this.f16793C = notification;
        this.f16796a = context;
        this.f16818x = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.f16795E = new ArrayList<>();
        this.f16791A = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final Notification a() {
        Bundle bundle;
        RemoteViews remoteViewsMakeHeadsUpContentView;
        RemoteViews remoteViewsMakeBigContentView;
        C c10 = new C(this);
        v vVar = c10.f16679c;
        B b10 = vVar.f16806l;
        if (b10 != null) {
            b10.apply(c10);
        }
        RemoteViews remoteViewsMakeContentView = b10 != null ? b10.makeContentView(c10) : null;
        Notification notificationBuild = c10.f16678b.build();
        if (remoteViewsMakeContentView != null) {
            notificationBuild.contentView = remoteViewsMakeContentView;
        } else {
            RemoteViews remoteViews = vVar.f16816v;
            if (remoteViews != null) {
                notificationBuild.contentView = remoteViews;
            }
        }
        if (b10 != null && (remoteViewsMakeBigContentView = b10.makeBigContentView(c10)) != null) {
            notificationBuild.bigContentView = remoteViewsMakeBigContentView;
        }
        if (b10 != null && (remoteViewsMakeHeadsUpContentView = vVar.f16806l.makeHeadsUpContentView(c10)) != null) {
            notificationBuild.headsUpContentView = remoteViewsMakeHeadsUpContentView;
        }
        if (b10 != null && (bundle = notificationBuild.extras) != null) {
            b10.addCompatExtras(bundle);
        }
        return notificationBuild;
    }

    public final void c(int i10) {
        Notification notification = this.f16793C;
        notification.defaults = i10;
        if ((i10 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void d(int i10, boolean z10) {
        Notification notification = this.f16793C;
        if (z10) {
            notification.flags = i10 | notification.flags;
        } else {
            notification.flags = (~i10) & notification.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompatC;
        if (bitmap == null) {
            iconCompatC = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f16796a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            iconCompatC = IconCompat.c(bitmap);
        }
        this.f16803h = iconCompatC;
    }

    public final void f(Uri uri) {
        Notification notification = this.f16793C;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = a.a(a.e(a.c(a.b(), 4), 5));
    }

    public final void g(B b10) {
        if (this.f16806l != b10) {
            this.f16806l = b10;
            if (b10 != null) {
                b10.setBuilder(this);
            }
        }
    }
}
