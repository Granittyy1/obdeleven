package S4;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import io.intercom.android.sdk.models.Participant;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: S4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public class C0764f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f5540b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f5541c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final AtomicBoolean f5539a = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f5542d = new AtomicBoolean();

    public static boolean a(Context context) {
        if (!f5541c) {
            try {
                PackageInfo packageInfoB = p006a5.c.a(context).b(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                j.a(context);
                if (packageInfoB == null || j.c(packageInfoB, false) || !j.c(packageInfoB, true)) {
                    f5540b = false;
                } else {
                    f5540b = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                f5541c = true;
            }
        }
        return f5540b || !Participant.USER_TYPE.equals(Build.TYPE);
    }

    public static boolean b(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
