package R4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5260c = 0;

    public B(Context context) {
        this.f5258a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfoB;
        if (this.f5259b == 0) {
            try {
                packageInfoB = p006a5.c.a(this.f5258a).b(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e10) {
                "Failed to find package ".concat(e10.toString());
                packageInfoB = null;
            }
            if (packageInfoB != null) {
                this.f5259b = packageInfoB.versionCode;
            }
        }
        return this.f5259b;
    }

    public final synchronized int b() {
        int i10 = this.f5260c;
        if (i10 != 0) {
            return i10;
        }
        Context context = this.f5258a;
        PackageManager packageManager = context.getPackageManager();
        if (p006a5.c.a(context).f8057a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
            this.f5260c = 2;
            return 2;
        }
        this.f5260c = 2;
        return 2;
    }
}
