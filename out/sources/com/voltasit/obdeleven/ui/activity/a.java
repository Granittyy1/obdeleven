package com.voltasit.obdeleven.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/* JADX INFO: compiled from: ActivityExtentions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final void a(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "<this>");
        PackageManager packageManager = activity.getPackageManager();
        kotlin.jvm.internal.i.d(packageManager, "getPackageManager(...)");
        try {
            try {
                packageManager.getPackageInfo("com.voltasit.obdeleven.basic", 0);
                activity.startActivity(activity.getPackageManager().getLaunchIntentForPackage("com.voltasit.obdeleven.basic"));
            } catch (PackageManager.NameNotFoundException unused) {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.voltasit.obdeleven.basic")));
            }
        } catch (Exception unused2) {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.voltasit.obdeleven.basic")));
        }
    }
}
