package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: ProxyNotificationInitializer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C {
    public static void a(Context context) {
        boolean z10;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (E.a(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            z10 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT >= 29) {
            new B(context, z10, new p191p5.h()).run();
        } else {
            p191p5.j.e(null);
        }
    }

    public static boolean b(Context context) {
        if (!(Build.VERSION.SDK_INT >= 29)) {
            Log.isLoggable("FirebaseMessaging", 3);
            return false;
        }
        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
            if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        }
        Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
        return false;
    }
}
