package R4;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import java.util.concurrent.TimeUnit;
import p131k5.B0;
import p131k5.C2523i1;
import p131k5.z3;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5298b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5299c;

    public /* synthetic */ q() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5298b) {
            case 0:
                break;
            default:
                C2523i1 c2523i1 = (C2523i1) this.f5299c;
                z3 z3Var = c2523i1.f42222l;
                C2523i1.e(z3Var);
                z3Var.p();
                if (z3Var.w0() != 1) {
                    B0 b10 = c2523i1.f42220i;
                    C2523i1.g(b10);
                    b10.f41715i.c("registerTrigger called but app not eligible");
                    return;
                } else {
                    com.google.android.gms.measurement.internal.e eVar = c2523i1.f42226p;
                    C2523i1.f(eVar);
                    r rVar = new r();
                    rVar.f5301c = eVar;
                    new Thread(rVar).start();
                    return;
                }
        }
        while (true) {
            final v vVar = (v) this.f5299c;
            synchronized (vVar) {
                try {
                    if (vVar.f5307b != 2) {
                        return;
                    }
                    if (vVar.f5310e.isEmpty()) {
                        vVar.c();
                        return;
                    }
                    final y yVar = (y) vVar.f5310e.poll();
                    vVar.f5311f.put(yVar.f5315a, yVar);
                    vVar.f5312g.f5255b.schedule(new Runnable() { // from class: R4.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            v vVar2 = vVar;
                            int i10 = yVar.f5315a;
                            synchronized (vVar2) {
                                y yVar2 = (y) vVar2.f5311f.get(i10);
                                if (yVar2 != null) {
                                    vVar2.f5311f.remove(i10);
                                    yVar2.c(new zzt("Timed out waiting for response", null));
                                    vVar2.c();
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(yVar));
                    }
                    A a10 = vVar.f5312g;
                    Messenger messenger = vVar.f5308c;
                    int i10 = yVar.f5317c;
                    Context context = a10.f5254a;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = yVar.f5315a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", yVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", yVar.f5318d);
                    messageObtain.setData(bundle);
                    try {
                        w wVar = vVar.f5309d;
                        Messenger messenger2 = wVar.f5313a;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            l lVar = wVar.f5314b;
                            if (lVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = lVar.f5285b;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e10) {
                        vVar.a(2, e10.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ q(v vVar) {
        this.f5299c = vVar;
    }
}
