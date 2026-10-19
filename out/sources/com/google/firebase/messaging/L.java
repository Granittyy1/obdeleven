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
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: SyncTask.java */
/* JADX INFO: loaded from: classes3.dex */
public final class L implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f28296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f28297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f28298d;

    /* JADX INFO: compiled from: SyncTask.java */
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public L f28299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Context f28300b;

        public final void a() {
            Log.isLoggable("FirebaseMessaging", 3);
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            L l10 = this.f28299a;
            if (l10 != null) {
                Context applicationContext = l10.f28298d.getApplicationContext();
                this.f28300b = applicationContext;
                applicationContext.registerReceiver(this, intentFilter);
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            L l10 = this.f28299a;
            if (l10 != null && l10.a()) {
                Log.isLoggable("FirebaseMessaging", 3);
                L l11 = this.f28299a;
                l11.f28298d.enqueueTaskWithDelaySeconds(l11, 0L);
                Context context2 = this.f28300b;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f28299a = null;
            }
        }
    }

    public L(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new Z4.a("firebase-iid-executor"));
        this.f28298d = firebaseMessaging;
        this.f28296b = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.getApplicationContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f28297c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f28298d.getApplicationContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.f28298d.blockingGetToken() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e10.getMessage();
                return false;
            }
            if (e10.getMessage() == null) {
                return false;
            }
            throw e10;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zC;
        I iA = I.a();
        FirebaseMessaging firebaseMessaging = this.f28298d;
        boolean zC2 = iA.c(firebaseMessaging.getApplicationContext());
        PowerManager.WakeLock wakeLock = this.f28297c;
        if (zC2) {
            wakeLock.acquire();
        }
        try {
            firebaseMessaging.setSyncScheduledOrRunning(true);
            if (!firebaseMessaging.isGmsCorePresent()) {
                firebaseMessaging.setSyncScheduledOrRunning(false);
                if (zC) {
                    return;
                } else {
                    return;
                }
            }
            if (!I.a().b(firebaseMessaging.getApplicationContext()) || a()) {
                if (b()) {
                    firebaseMessaging.setSyncScheduledOrRunning(false);
                } else {
                    firebaseMessaging.syncWithDelaySecondsInternal(this.f28296b);
                }
                if (!zC) {
                    return;
                }
                return;
            }
            a aVar = new a();
            aVar.f28299a = this;
            aVar.a();
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
            firebaseMessaging.setSyncScheduledOrRunning(false);
        } finally {
            if (I.a().c(firebaseMessaging.getApplicationContext())) {
                wakeLock.release();
            }
        }
    }
}
