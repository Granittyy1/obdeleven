package R2;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: NetworkApi24.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        kotlin.jvm.internal.i.e(connectivityManager, "<this>");
        kotlin.jvm.internal.i.e(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
