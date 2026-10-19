package p006a5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8057a;

    public b(Context context) {
        this.f8057a = context;
    }

    public final ApplicationInfo a(int i10, String str) throws PackageManager.NameNotFoundException {
        return this.f8057a.getPackageManager().getApplicationInfo(str, i10);
    }

    public final PackageInfo b(int i10, String str) throws PackageManager.NameNotFoundException {
        return this.f8057a.getPackageManager().getPackageInfo(str, i10);
    }

    public final boolean c() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f8057a;
        if (callingUid == iMyUid) {
            return a.c(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}
