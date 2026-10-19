package Y2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import coil.util.v;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: NetworkObserver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f7595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f7596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f7597c;

    public g(ConnectivityManager connectivityManager, v vVar) {
        this.f7595a = connectivityManager;
        this.f7596b = vVar;
        f fVar = new f(this);
        this.f7597c = fVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), fVar);
    }

    public static final void b(g gVar, Network network, boolean z10) {
        boolean z11;
        boolean z12 = false;
        for (Network network2 : gVar.f7595a.getAllNetworks()) {
            if (i.a(network2, network)) {
                z11 = z10;
            } else {
                NetworkCapabilities networkCapabilities = gVar.f7595a.getNetworkCapabilities(network2);
                z11 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z11) {
                z12 = true;
                break;
            }
        }
        v vVar = gVar.f7596b;
        synchronized (vVar) {
            try {
                if (vVar.f23179b.get() != null) {
                    vVar.f23183f = z12;
                } else {
                    vVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Y2.e
    public final boolean a() {
        ConnectivityManager connectivityManager = this.f7595a;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // Y2.e
    public final void shutdown() {
        this.f7595a.unregisterNetworkCallback(this.f7597c);
    }
}
