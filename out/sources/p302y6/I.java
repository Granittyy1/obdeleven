package p302y6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p144l6.e;
import p191p5.h;

/* JADX INFO: compiled from: DataCollectionArbiter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f48325a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f48328d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f48326b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h<Void> f48327c = new h<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h<Void> f48329e = new h<>();

    public I(e eVar) {
        Boolean boolValueOf;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        eVar.a();
        Context context = eVar.f44388a;
        this.f48325a = eVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        Boolean boolValueOf2 = sharedPreferences.contains("firebase_crashlytics_collection_enabled") ? Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true)) : null;
        if (boolValueOf2 == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e10);
            }
            boolValueOf2 = boolValueOf == null ? null : Boolean.valueOf(Boolean.TRUE.equals(boolValueOf));
        }
        this.f48328d = boolValueOf2;
        synchronized (this.f48326b) {
            try {
                if (a()) {
                    this.f48327c.d(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean a() {
        boolean zG;
        Boolean bool = this.f48328d;
        if (bool != null) {
            zG = bool.booleanValue();
        } else {
            try {
                zG = this.f48325a.g();
            } catch (IllegalStateException unused) {
                zG = false;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        return zG;
    }
}
