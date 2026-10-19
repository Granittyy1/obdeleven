package p155m4;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: DeviceRequestsHelper.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements NsdManager.RegistrationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f44592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44593b;

    public a(String str, String str2) {
        this.f44592a = str;
        this.f44593b = str2;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo serviceInfo, int i10) {
        i.e(serviceInfo, "serviceInfo");
        b bVar = b.f44594a;
        b.a(this.f44593b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo NsdServiceInfo) {
        i.e(NsdServiceInfo, "NsdServiceInfo");
        if (i.a(this.f44592a, NsdServiceInfo.getServiceName())) {
            return;
        }
        b bVar = b.f44594a;
        b.a(this.f44593b);
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo serviceInfo) {
        i.e(serviceInfo, "serviceInfo");
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo serviceInfo, int i10) {
        i.e(serviceInfo, "serviceInfo");
    }
}
