package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: LoginLogger.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f25174d = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a4.t f25176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25177c;

    /* JADX INFO: compiled from: LoginLogger.kt */
    public static final class a {
        public static final Bundle a(String str) {
            ScheduledExecutorService scheduledExecutorService = t.f25174d;
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }
    }

    public t(Context context, String applicationId) {
        PackageInfo packageInfo;
        kotlin.jvm.internal.i.e(applicationId, "applicationId");
        this.f25175a = applicationId;
        this.f25176b = new p005a4.t(context, applicationId);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.f25177c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(String str, String str2) {
        Bundle bundleA = a.a("");
        bundleA.putString("2_result", LoginClient.Result.Code.ERROR.a());
        bundleA.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
        bundleA.putString("3_method", str2);
        this.f25176b.a(bundleA, str);
    }
}
