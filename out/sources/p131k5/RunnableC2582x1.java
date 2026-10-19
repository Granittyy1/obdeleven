package p131k5;

import V4.a;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: renamed from: k5.x1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2582x1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f42526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f42527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f42529e;

    public /* synthetic */ RunnableC2582x1(Object obj, a aVar, Object obj2, int i10) {
        this.f42526b = i10;
        this.f42527c = aVar;
        this.f42528d = obj2;
        this.f42529e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f42526b) {
            case 0:
                BinderC2535l1 binderC2535l1 = (BinderC2535l1) this.f42529e;
                binderC2535l1.f42293c.Y();
                binderC2535l1.f42293c.u((C2588z) this.f42527c, (String) this.f42528d);
                break;
            default:
                o3 o3Var = (o3) this.f42527c;
                C2587y2 c2587y2 = (C2587y2) this.f42529e;
                InterfaceC2561s0 interfaceC2561s0 = c2587y2.f42536d;
                if (interfaceC2561s0 == null) {
                    c2587y2.d().f41712f.c("Failed to send default event parameters to service");
                } else {
                    try {
                        interfaceC2561s0.mo705d((Bundle) this.f42528d, o3Var);
                    } catch (RemoteException e10) {
                        c2587y2.d().f41712f.b(e10, "Failed to send default event parameters to service");
                    }
                }
                break;
        }
    }
}
