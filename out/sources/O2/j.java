package O2;

import R2.p;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: NetworkStateTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h<androidx.work.impl.constraints.c> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f4785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f4786g;

    /* JADX INFO: compiled from: NetworkStateTracker.kt */
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            kotlin.jvm.internal.i.e(network, "network");
            kotlin.jvm.internal.i.e(capabilities, "capabilities");
            androidx.work.k kVarC = androidx.work.k.c();
            String str = k.f4788a;
            capabilities.toString();
            kVarC.getClass();
            j jVar = j.this;
            jVar.b(k.a(jVar.f4785f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            kotlin.jvm.internal.i.e(network, "network");
            androidx.work.k kVarC = androidx.work.k.c();
            String str = k.f4788a;
            kVarC.getClass();
            j jVar = j.this;
            jVar.b(k.a(jVar.f4785f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, S2.b taskExecutor) {
        super(context, taskExecutor);
        kotlin.jvm.internal.i.e(taskExecutor, "taskExecutor");
        Object systemService = this.f4780b.getSystemService("connectivity");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f4785f = (ConnectivityManager) systemService;
        this.f4786g = new a();
    }

    @Override // O2.h
    public final androidx.work.impl.constraints.c a() {
        return k.a(this.f4785f);
    }

    @Override // O2.h
    public final void c() {
        try {
            androidx.work.k kVarC = androidx.work.k.c();
            String str = k.f4788a;
            kVarC.getClass();
            p.a(this.f4785f, this.f4786g);
        } catch (IllegalArgumentException e10) {
            androidx.work.k.c().b(k.f4788a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            androidx.work.k.c().b(k.f4788a, "Received exception while registering network callback", e11);
        }
    }

    @Override // O2.h
    public final void d() {
        try {
            androidx.work.k kVarC = androidx.work.k.c();
            String str = k.f4788a;
            kVarC.getClass();
            R2.n.c(this.f4785f, this.f4786g);
        } catch (IllegalArgumentException e10) {
            androidx.work.k.c().b(k.f4788a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            androidx.work.k.c().b(k.f4788a, "Received exception while unregistering network callback", e11);
        }
    }
}
