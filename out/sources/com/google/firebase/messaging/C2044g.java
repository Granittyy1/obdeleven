package com.google.firebase.messaging;

import U4.C0804l;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.braze.models.FeatureFlag;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.google.firebase.messaging.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DisplayNotification.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2044g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f28367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseMessagingService f28368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.l f28369c;

    public C2044g(FirebaseMessagingService firebaseMessagingService, J2.l lVar, ExecutorService executorService) {
        this.f28367a = executorService;
        this.f28368b = firebaseMessagingService;
        this.f28369c = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x030e  */
    /* JADX WARN: Code duplicated, block: B:255:0x0305 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v150 */
    /* JADX WARN: Type inference failed for: r0v82 */
    public final boolean a() {
        x xVar;
        Bundle bundle;
        int identifier;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        Long lValueOf;
        long[] jArr;
        int[] iArr;
        int i10;
        String string;
        int i11 = 1;
        if (this.f28369c.e("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = this.f28368b;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strJ = this.f28369c.j("gcm.n.image");
        if (TextUtils.isEmpty(strJ)) {
            xVar = null;
        } else {
            try {
                xVar = new x(new URL(strJ));
            } catch (MalformedURLException unused) {
                xVar = null;
            }
        }
        if (xVar != null) {
            ExecutorService executorService = this.f28367a;
            p191p5.h hVar = new p191p5.h();
            xVar.f28425c = executorService.submit(new androidx.activity.n(xVar, i11, hVar));
            xVar.f28426d = hVar.f45811a;
        }
        FirebaseMessagingService firebaseMessagingService2 = this.f28368b;
        J2.l lVar = this.f28369c;
        AtomicInteger atomicInteger = C2042e.f28365a;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e10.toString();
        }
        Bundle bundle2 = bundle;
        String strJ2 = lVar.j("gcm.n.android_channel_id");
        try {
            if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                strJ2 = null;
            } else {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                if (TextUtils.isEmpty(strJ2) || notificationManager.getNotificationChannel(strJ2) == null) {
                    strJ2 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                    if (TextUtils.isEmpty(strJ2) || notificationManager.getNotificationChannel(strJ2) == null) {
                        strJ2 = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            int identifier2 = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", FeatureFlag.PROPERTIES_TYPE_STRING, firebaseMessagingService2.getPackageName());
                            if (identifier2 == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService2.getString(identifier2);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        androidx.core.app.v vVar = new androidx.core.app.v(firebaseMessagingService2, strJ2);
        String strH = lVar.h(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strH)) {
            vVar.f16800e = androidx.core.app.v.b(strH);
        }
        String strH2 = lVar.h(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strH2)) {
            vVar.f16801f = androidx.core.app.v.b(strH2);
            androidx.core.app.t tVar = new androidx.core.app.t();
            tVar.f16786a = androidx.core.app.v.b(strH2);
            vVar.g(tVar);
        }
        String strJ3 = lVar.j("gcm.n.icon");
        if (TextUtils.isEmpty(strJ3) || (((identifier = resources.getIdentifier(strJ3, "drawable", packageName)) == 0 || !C2042e.a(resources, identifier)) && ((identifier = resources.getIdentifier(strJ3, "mipmap", packageName)) == 0 || !C2042e.a(resources, identifier)))) {
            identifier = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (identifier == 0 || !C2042e.a(resources, identifier)) {
                try {
                    identifier = packageManager.getApplicationInfo(packageName, 0).icon;
                } catch (PackageManager.NameNotFoundException e11) {
                    e11.toString();
                }
            }
            if (identifier == 0 || !C2042e.a(resources, identifier)) {
                identifier = 17301651;
            }
        }
        vVar.f16793C.icon = identifier;
        String strJ4 = lVar.j("gcm.n.sound2");
        if (TextUtils.isEmpty(strJ4)) {
            strJ4 = lVar.j("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strJ4)) {
            defaultUri = null;
        } else if ("default".equals(strJ4) || resources.getIdentifier(strJ4, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strJ4);
        }
        if (defaultUri != null) {
            vVar.f(defaultUri);
        }
        String strJ5 = lVar.j("gcm.n.click_action");
        if (TextUtils.isEmpty(strJ5)) {
            String strJ6 = lVar.j("gcm.n.link_android");
            if (TextUtils.isEmpty(strJ6)) {
                strJ6 = lVar.j("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strJ6) ? Uri.parse(strJ6) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
            }
        } else {
            launchIntentForPackage = new Intent(strJ5);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        AtomicInteger atomicInteger2 = C2042e.f28365a;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = (Bundle) lVar.f3968a;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle4);
            if (lVar.e("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", lVar.l());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger2.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        vVar.f16802g = activity;
        PendingIntent broadcast = !lVar.e("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger2.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService2.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(lVar.l())), 1140850688);
        if (broadcast != null) {
            vVar.f16793C.deleteIntent = broadcast;
        }
        String strJ7 = lVar.j("gcm.n.color");
        if (TextUtils.isEmpty(strJ7)) {
            i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i10 != 0) {
                numValueOf = Integer.valueOf(p0.a.b.a(firebaseMessagingService2, i10));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strJ7));
            } catch (IllegalArgumentException unused3) {
                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i10 != 0) {
                    try {
                        numValueOf = Integer.valueOf(p0.a.b.a(firebaseMessagingService2, i10));
                    } catch (Resources.NotFoundException unused4) {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            vVar.f16813s = numValueOf.intValue();
        }
        vVar.d(16, !lVar.e("gcm.n.sticky"));
        vVar.f16810p = lVar.e("gcm.n.local_only");
        String strJ8 = lVar.j("gcm.n.ticker");
        if (strJ8 != null) {
            vVar.f16793C.tickerText = androidx.core.app.v.b(strJ8);
        }
        Integer numF = lVar.f("gcm.n.notification_priority");
        if (numF == null || numF.intValue() < -2 || numF.intValue() > 2) {
            numF = null;
        }
        if (numF != null) {
            vVar.j = numF.intValue();
        }
        Integer numF2 = lVar.f("gcm.n.visibility");
        if (numF2 == null || numF2.intValue() < -1 || numF2.intValue() > 1) {
            numF2 = null;
        }
        if (numF2 != null) {
            vVar.f16814t = numF2.intValue();
        }
        Integer numF3 = lVar.f("gcm.n.notification_count");
        if (numF3 == null || numF3.intValue() < 0) {
            numF3 = null;
        }
        if (numF3 != null) {
            vVar.f16804i = numF3.intValue();
        }
        String strJ9 = lVar.j("gcm.n.event_time");
        if (TextUtils.isEmpty(strJ9)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strJ9));
            } catch (NumberFormatException unused5) {
                J2.l.m("gcm.n.event_time");
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            vVar.f16805k = true;
            vVar.f16793C.when = lValueOf.longValue();
        }
        JSONArray jSONArrayG = lVar.g("gcm.n.vibrate_timings");
        if (jSONArrayG == null) {
            jArr = null;
        } else {
            try {
                if (jSONArrayG.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int length = jSONArrayG.length();
                jArr = new long[length];
                for (int i12 = 0; i12 < length; i12++) {
                    jArr[i12] = jSONArrayG.optLong(i12);
                }
            } catch (NumberFormatException | JSONException unused6) {
                jSONArrayG.toString();
                jArr = null;
            }
        }
        if (jArr != null) {
            vVar.f16793C.vibrate = jArr;
        }
        JSONArray jSONArrayG2 = lVar.g("gcm.n.light_settings");
        if (jSONArrayG2 == null) {
            iArr = null;
        } else {
            iArr = new int[3];
            try {
                if (jSONArrayG2.length() != 3) {
                    throw new JSONException("lightSettings don't have all three fields");
                }
                int color = Color.parseColor(jSONArrayG2.optString(0));
                if (color == -16777216) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                iArr[0] = color;
                iArr[1] = jSONArrayG2.optInt(1);
                iArr[2] = jSONArrayG2.optInt(2);
            } catch (IllegalArgumentException e12) {
                jSONArrayG2.toString();
                e12.getMessage();
                iArr = null;
            } catch (JSONException unused7) {
                jSONArrayG2.toString();
                iArr = null;
            }
        }
        if (iArr != null) {
            int i13 = iArr[0];
            int i14 = iArr[1];
            int i15 = iArr[2];
            Notification notification = vVar.f16793C;
            notification.ledARGB = i13;
            notification.ledOnMS = i14;
            notification.ledOffMS = i15;
            notification.flags = ((i14 == 0 || i15 == 0) ? 0 : 1) | ((-2) & notification.flags);
        }
        boolean zE = lVar.e("gcm.n.default_sound");
        ?? r10 = zE;
        if (lVar.e("gcm.n.default_vibrate_timings")) {
            r10 = (zE ? 1 : 0) | 2;
        }
        int i16 = r10;
        if (lVar.e("gcm.n.default_light_settings")) {
            i16 = (r10 == true ? 1 : 0) | 4;
        }
        vVar.c(i16);
        String strJ10 = lVar.j("gcm.n.tag");
        if (TextUtils.isEmpty(strJ10)) {
            strJ10 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str2 = strJ10;
        if (xVar != null) {
            try {
                p191p5.B b10 = xVar.f28426d;
                C0804l.h(b10);
                Bitmap bitmap = (Bitmap) p191p5.j.b(b10, 5L, TimeUnit.SECONDS);
                vVar.e(bitmap);
                androidx.core.app.s sVar = new androidx.core.app.s();
                sVar.f16782a = bitmap == null ? null : IconCompat.c(bitmap);
                sVar.f16783b = null;
                sVar.f16784c = true;
                vVar.g(sVar);
            } catch (InterruptedException unused8) {
                xVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e13) {
                Objects.toString(e13.getCause());
            } catch (TimeoutException unused9) {
                xVar.close();
            }
        }
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) this.f28368b.getSystemService("notification")).notify(str2, 0, vVar.a());
        return true;
    }
}
