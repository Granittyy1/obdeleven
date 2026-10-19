package Y2;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: compiled from: NetworkObserver.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f7594a;

    public f(g gVar) {
        this.f7594a = gVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        g.b(this.f7594a, network, true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        g.b(this.f7594a, network, false);
    }
}
