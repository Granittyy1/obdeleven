package O2;

import R2.o;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: compiled from: NetworkStateTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f4788a;

    static {
        String strD = androidx.work.k.d("NetworkStateTracker");
        kotlin.jvm.internal.i.d(strD, "tagWithPrefix(\"NetworkStateTracker\")");
        f4788a = strD;
    }

    public static final androidx.work.impl.constraints.c a(ConnectivityManager connectivityManager) {
        boolean zB;
        kotlin.jvm.internal.i.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilitiesA = R2.n.a(connectivityManager, o.a(connectivityManager));
            zB = networkCapabilitiesA != null ? R2.n.b(networkCapabilitiesA, 16) : false;
        } catch (SecurityException e10) {
            androidx.work.k.c().b(f4788a, "Unable to validate active network", e10);
        }
        return new androidx.work.impl.constraints.c(z10, zB, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
