package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: TopicsSyncTask.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Q implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f28321g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f28322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Boolean f28323i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f28325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PowerManager.WakeLock f28326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P f28327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f28328f;

    /* JADX INFO: compiled from: TopicsSyncTask.java */
    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Q f28329a;

        @Override // android.content.BroadcastReceiver
        public final synchronized void onReceive(Context context, Intent intent) {
            Q q10 = this.f28329a;
            if (q10 == null) {
                return;
            }
            if (q10.c()) {
                Log.isLoggable("FirebaseMessaging", 3);
                Q q11 = this.f28329a;
                q11.f28327e.f28318f.schedule(q11, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f28329a = null;
            }
        }
    }

    public Q(P p10, Context context, z zVar, long j) {
        this.f28327e = p10;
        this.f28324b = context;
        this.f28328f = j;
        this.f28325c = zVar;
        this.f28326d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f28321g) {
            try {
                Boolean bool = f28323i;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                f28323i = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (f28321g) {
            try {
                Boolean bool = f28322h;
                if (bool == null && bool == null) {
                    zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                    if (!zBooleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else {
                    zBooleanValue = bool.booleanValue();
                }
                f28322h = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final synchronized boolean c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f28324b.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zB;
        P p10 = this.f28327e;
        Context context = this.f28324b;
        boolean zB2 = b(context);
        PowerManager.WakeLock wakeLock = this.f28326d;
        if (zB2) {
            wakeLock.acquire(C2043f.f28366a);
        }
        try {
            p10.e(true);
            if (!this.f28325c.c()) {
                p10.e(false);
            } else {
                if (!a(context) || c()) {
                    if (p10.g()) {
                        p10.e(false);
                    } else {
                        p10.h(this.f28328f);
                    }
                    if (!zB) {
                        return;
                    }
                    try {
                        return;
                    } catch (RuntimeException unused) {
                        return;
                    }
                }
                a aVar = new a();
                aVar.f28329a = this;
                Log.isLoggable("FirebaseMessaging", 3);
                context.registerReceiver(aVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
            p10.e(false);
        } finally {
            if (b(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused2) {
                }
            }
        }
    }
}
