package p131k5;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1843k0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class J2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2588z f41841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1843k0 f41843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41844e;

    public J2(C2587y2 c2587y2, C2588z c2588z, String str, InterfaceC1843k0 interfaceC1843k0) {
        this.f41841b = c2588z;
        this.f41842c = str;
        this.f41843d = interfaceC1843k0;
        this.f41844e = c2587y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1843k0 interfaceC1843k0 = this.f41843d;
        C2587y2 c2587y2 = this.f41844e;
        try {
            try {
                InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
                if (interfaceC2561s0 == null) {
                    c2587y2.d().f41712f.c("Discarding data. Failed to send event to service to bundle");
                    c2587y2.o().P(interfaceC1843k0, null);
                } else {
                    byte[] bArrP = interfaceC2561s0.P(this.f41841b, this.f41842c);
                    c2587y2.I();
                    c2587y2.o().P(interfaceC1843k0, bArrP);
                }
            } catch (RemoteException e10) {
                c2587y2.d().f41712f.b(e10, "Failed to send event to the service to bundle");
                c2587y2.o().P(interfaceC1843k0, null);
            }
        } catch (Throwable th) {
            c2587y2.o().P(interfaceC1843k0, null);
            throw th;
        }
    }
}
