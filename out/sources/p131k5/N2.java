package p131k5;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class N2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f41919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o3 f41920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f41921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41922g;

    public N2(C2587y2 c2587y2, AtomicReference atomicReference, String str, String str2, o3 o3Var, boolean z10) {
        this.f41917b = atomicReference;
        this.f41918c = str;
        this.f41919d = str2;
        this.f41920e = o3Var;
        this.f41921f = z10;
        this.f41922g = c2587y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41917b) {
            try {
                try {
                    C2587y2 c2587y2 = this.f41922g;
                    InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
                    if (interfaceC2561s0 == null) {
                        c2587y2.d().f41712f.d("(legacy) Failed to get user properties; not connected to service", null, this.f41918c, this.f41919d);
                        this.f41917b.set(Collections.emptyList());
                        this.f41917b.notify();
                    } else {
                        if (TextUtils.isEmpty(null)) {
                            this.f41917b.set(interfaceC2561s0.t(this.f41918c, this.f41919d, this.f41921f, this.f41920e));
                        } else {
                            this.f41917b.set(interfaceC2561s0.m(null, this.f41918c, this.f41919d, this.f41921f));
                        }
                        this.f41922g.I();
                        this.f41917b.notify();
                    }
                } catch (RemoteException e10) {
                    this.f41922g.d().f41712f.d("(legacy) Failed to get user properties; remote exception", null, this.f41918c, e10);
                    this.f41917b.set(Collections.emptyList());
                    this.f41917b.notify();
                }
            } catch (Throwable th) {
                this.f41917b.notify();
                throw th;
            }
        }
    }
}
