package p131k5;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1843k0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class A2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o3 f41600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f41601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1843k0 f41602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41603g;

    public A2(C2587y2 c2587y2, String str, String str2, o3 o3Var, boolean z10, InterfaceC1843k0 interfaceC1843k0) {
        this.f41598b = str;
        this.f41599c = str2;
        this.f41600d = o3Var;
        this.f41601e = z10;
        this.f41602f = interfaceC1843k0;
        this.f41603g = c2587y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o3 o3Var = this.f41600d;
        String str = this.f41598b;
        InterfaceC1843k0 interfaceC1843k0 = this.f41602f;
        C2587y2 c2587y2 = this.f41603g;
        Bundle bundle = new Bundle();
        try {
            try {
                InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
                String str2 = this.f41599c;
                if (interfaceC2561s0 == null) {
                    c2587y2.d().f41712f.a(str, str2, "Failed to get user properties; not connected to service");
                    c2587y2.o().M(interfaceC1843k0, bundle);
                } else {
                    Bundle bundleC = z3.C(interfaceC2561s0.t(str, str2, this.f41601e, o3Var));
                    c2587y2.I();
                    c2587y2.o().M(interfaceC1843k0, bundleC);
                }
            } catch (RemoteException e10) {
                c2587y2.d().f41712f.a(str, e10, "Failed to get user properties; remote exception");
                c2587y2.o().M(interfaceC1843k0, bundle);
            }
        } catch (Throwable th) {
            c2587y2.o().M(interfaceC1843k0, bundle);
            throw th;
        }
    }
}
