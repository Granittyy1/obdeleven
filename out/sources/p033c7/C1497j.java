package p033c7;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import p144l6.e;

/* JADX INFO: renamed from: c7.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DataCollectionHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1497j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f22460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicBoolean f22461b;

    public final boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        ApplicationInfo applicationInfo2;
        Bundle bundle2;
        i0 i0Var = this.f22460a;
        e eVar = i0Var.f22459a;
        eVar.a();
        if (((Application) eVar.f44388a).getSharedPreferences("com.google.firebase.inappmessaging", 0).contains("auto_init")) {
            e eVar2 = i0Var.f22459a;
            eVar2.a();
            SharedPreferences sharedPreferences = ((Application) eVar2.f44388a).getSharedPreferences("com.google.firebase.inappmessaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return sharedPreferences.getBoolean("auto_init", true);
            }
            return true;
        }
        e eVar3 = i0Var.f22459a;
        eVar3.a();
        Application application = (Application) eVar3.f44388a;
        try {
            PackageManager packageManager = application.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_inapp_messaging_auto_data_collection_enabled")) {
                e eVar4 = i0Var.f22459a;
                eVar4.a();
                Application application2 = (Application) eVar4.f44388a;
                try {
                    PackageManager packageManager2 = application2.getPackageManager();
                    if (packageManager2 == null || (applicationInfo2 = packageManager2.getApplicationInfo(application2.getPackageName(), 128)) == null || (bundle2 = applicationInfo2.metaData) == null || !bundle2.containsKey("firebase_inapp_messaging_auto_data_collection_enabled")) {
                        return true;
                    }
                    return applicationInfo2.metaData.getBoolean("firebase_inapp_messaging_auto_data_collection_enabled");
                } catch (PackageManager.NameNotFoundException unused) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return this.f22461b.get();
    }
}
