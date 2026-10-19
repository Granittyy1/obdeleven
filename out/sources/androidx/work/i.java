package androidx.work;

import android.os.RemoteException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C2693i;
import p131k5.C2587y2;
import p131k5.InterfaceC2561s0;
import p131k5.o3;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20362d;

    public /* synthetic */ i(Object obj, int i10, Object obj2) {
        this.f20360b = i10;
        this.f20361c = obj2;
        this.f20362d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20360b) {
            case 0:
                C2693i c2693i = (C2693i) this.f20361c;
                try {
                    c2693i.resumeWith(((p107i6.f) this.f20362d).get());
                    break;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        cause = th;
                    }
                    if (th instanceof CancellationException) {
                        c2693i.o(cause);
                        return;
                    } else {
                        c2693i.resumeWith(kotlin.b.a(cause));
                        return;
                    }
                }
                break;
            case 1:
                o3 o3Var = (o3) this.f20361c;
                C2587y2 c2587y2 = (C2587y2) this.f20362d;
                InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
                if (interfaceC2561s0 != null) {
                    try {
                        interfaceC2561s0.G(o3Var);
                    } catch (RemoteException e10) {
                        c2587y2.d().f41712f.b(e10, "Failed to reset data on the service: remote exception");
                    }
                    c2587y2.I();
                } else {
                    c2587y2.d().f41712f.c("Failed to reset data on the service: not connected to service");
                }
                break;
            default:
                ((com.voltas.crop.e) this.f20362d).e((p278w8.f) this.f20361c);
                break;
        }
    }

    public i(C2693i c2693i, p107i6.f fVar) {
        this.f20360b = 0;
        this.f20361c = c2693i;
        this.f20362d = fVar;
    }
}
