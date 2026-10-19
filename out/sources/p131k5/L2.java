package p131k5;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class L2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f41887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f41888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o3 f41889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41890f;

    public L2(C2587y2 c2587y2, AtomicReference atomicReference, String str, String str2, o3 o3Var) {
        this.f41886b = atomicReference;
        this.f41887c = str;
        this.f41888d = str2;
        this.f41889e = o3Var;
        this.f41890f = c2587y2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41886b) {
            try {
                try {
                    C2587y2 c2587y2 = this.f41890f;
                    InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
                    if (interfaceC2561s0 == null) {
                        c2587y2.d().f41712f.d("(legacy) Failed to get conditional properties; not connected to service", null, this.f41887c, this.f41888d);
                        this.f41886b.set(Collections.emptyList());
                        this.f41886b.notify();
                    } else {
                        if (TextUtils.isEmpty(null)) {
                            this.f41886b.set(interfaceC2561s0.D(this.f41887c, this.f41888d, this.f41889e));
                        } else {
                            this.f41886b.set(interfaceC2561s0.E(null, this.f41887c, this.f41888d));
                        }
                        this.f41890f.I();
                        this.f41886b.notify();
                    }
                } catch (RemoteException e10) {
                    this.f41890f.d().f41712f.d("(legacy) Failed to get conditional properties; remote exception", null, this.f41887c, e10);
                    this.f41886b.set(Collections.emptyList());
                    this.f41886b.notify();
                }
            } catch (Throwable th) {
                this.f41886b.notify();
                throw th;
            }
        }
    }
}
