package R4;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5295b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5297d;

    public /* synthetic */ p(v vVar, IBinder iBinder) {
        this.f5296c = vVar;
        this.f5297d = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5295b) {
            case 0:
                v vVar = (v) this.f5296c;
                IBinder iBinder = (IBinder) this.f5297d;
                synchronized (vVar) {
                    if (iBinder == null) {
                        vVar.a(0, "Null service connection");
                    } else {
                        try {
                            vVar.f5309d = new w(iBinder);
                            vVar.f5307b = 2;
                            vVar.f5312g.f5255b.execute(new q(vVar));
                        } catch (RemoteException e10) {
                            vVar.a(0, e10.getMessage());
                        }
                    }
                }
                return;
            default:
                synchronized (((p191p5.u) this.f5297d).f45845c) {
                    try {
                        p191p5.e eVar = ((p191p5.u) this.f5297d).f45846d;
                        if (eVar != null) {
                            eVar.onSuccess(((p191p5.g) this.f5296c).k());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    public p(p191p5.u uVar, p191p5.g gVar) {
        this.f5297d = uVar;
        this.f5296c = gVar;
    }
}
