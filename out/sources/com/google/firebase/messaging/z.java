package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: Metadata.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28431e = 0;

    public z(Context context) {
        this.f28427a = context;
    }

    public static String b(p144l6.e eVar) {
        eVar.a();
        p144l6.f fVar = eVar.f44390c;
        String str = fVar.f44404e;
        if (str != null) {
            return str;
        }
        eVar.a();
        String str2 = fVar.f44401b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final synchronized String a() {
        try {
            if (this.f28428b == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f28428b;
    }

    public final boolean c() {
        int i10;
        synchronized (this) {
            i10 = this.f28431e;
            if (i10 == 0) {
                PackageManager packageManager = this.f28427a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        this.f28431e = 2;
                    } else {
                        this.f28431e = 2;
                    }
                    i10 = 2;
                }
            }
        }
        return i10 != 0;
    }

    public final synchronized void d() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f28427a.getPackageManager().getPackageInfo(this.f28427a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f28428b = Integer.toString(packageInfo.versionCode);
            this.f28429c = packageInfo.versionName;
        }
    }
}
