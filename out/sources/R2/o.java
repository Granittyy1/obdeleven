package R2;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: compiled from: NetworkApi23.kt */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static final Network a(ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.i.e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
