package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.braze.support.BrazeLogger;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f28509a;

    public static boolean a(Context context) {
        Boolean bool = f28509a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean z10 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false);
            f28509a = Boolean.valueOf(z10);
            return z10;
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            p241t7.a aVarD = p241t7.a.d();
            e10.getMessage();
            aVarD.a();
            return false;
        }
    }

    public static int b(long j) {
        if (j > 2147483647L) {
            return BrazeLogger.SUPPRESS;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
