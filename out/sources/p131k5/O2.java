package p131k5;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC1843k0;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class O2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o3 f41939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1843k0 f41940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41941f;

    public O2(C2587y2 c2587y2, String str, String str2, o3 o3Var, InterfaceC1843k0 interfaceC1843k0) {
        this.f41937b = str;
        this.f41938c = str2;
        this.f41939d = o3Var;
        this.f41940e = interfaceC1843k0;
        this.f41941f = c2587y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o3 o3Var = this.f41939d;
        String str = this.f41938c;
        String str2 = this.f41937b;
        InterfaceC1843k0 interfaceC1843k0 = this.f41940e;
        C2587y2 c2587y2 = this.f41941f;
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
                if (interfaceC2561s0 == null) {
                    c2587y2.d().f41712f.a(str2, str, "Failed to get conditional properties; not connected to service");
                    c2587y2.o().N(interfaceC1843k0, arrayList);
                } else {
                    ArrayList<Bundle> arrayListK0 = z3.k0(interfaceC2561s0.D(str2, str, o3Var));
                    c2587y2.I();
                    c2587y2.o().N(interfaceC1843k0, arrayListK0);
                }
            } catch (RemoteException e10) {
                c2587y2.d().f41712f.d("Failed to get conditional properties; remote exception", str2, str, e10);
                c2587y2.o().N(interfaceC1843k0, arrayList);
            }
        } catch (Throwable th) {
            c2587y2.o().N(interfaceC1843k0, arrayList);
            throw th;
        }
    }
}
