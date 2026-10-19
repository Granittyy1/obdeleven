package p131k5;

import S4.C0760b;
import U4.AbstractC0794b;
import U4.C0804l;
import X4.b;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import io.grpc.internal.RunnableC2252x;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class P2 implements ServiceConnection, AbstractC0794b.a, AbstractC0794b.InterfaceC0086b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f41956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C2585y0 f41957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2587y2 f41958d;

    public P2(C2587y2 c2587y2) {
        this.f41958d = c2587y2;
    }

    @Override // U4.AbstractC0794b.a
    public final void a() {
        C0804l.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C0804l.h(this.f41957c);
                this.f41958d.i().z(new T0(this, 2, this.f41957c.A()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f41957c = null;
                this.f41956b = false;
            }
        }
    }

    @Override // U4.AbstractC0794b.a
    public final void e(int i10) {
        C0804l.d("MeasurementServiceConnection.onConnectionSuspended");
        C2587y2 c2587y2 = this.f41958d;
        c2587y2.d().f41718m.c("Service connection suspended");
        c2587y2.i().z(new R2(this));
    }

    @Override // U4.AbstractC0794b.InterfaceC0086b
    public final void g(C0760b c0760b) {
        C0804l.d("MeasurementServiceConnection.onConnectionFailed");
        B0 b10 = ((C2523i1) this.f41958d.f3968a).f42220i;
        if (b10 == null || !b10.f41749b) {
            b10 = null;
        }
        if (b10 != null) {
            b10.f41715i.b(c0760b, "Service connection failed");
        }
        synchronized (this) {
            this.f41956b = false;
            this.f41957c = null;
        }
        this.f41958d.i().z(new Q2(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0804l.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f41956b = false;
                this.f41958d.d().f41712f.c("Service connected with null binder");
                return;
            }
            Object c2565t0 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c2565t0 = iInterfaceQueryLocalInterface instanceof InterfaceC2561s0 ? (InterfaceC2561s0) iInterfaceQueryLocalInterface : new C2565t0(iBinder);
                    this.f41958d.d().f41719n.c("Bound to IMeasurementService interface");
                } else {
                    this.f41958d.d().f41712f.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                this.f41958d.d().f41712f.c("Service connect failed to get IMeasurementService");
            }
            if (c2565t0 == null) {
                this.f41956b = false;
                try {
                    b bVarB = b.b();
                    C2587y2 c2587y2 = this.f41958d;
                    bVarB.c(((C2523i1) c2587y2.f3968a).f42212a, c2587y2.f42535c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f41958d.i().z(new RunnableC2252x(this, 2, c2565t0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C0804l.d("MeasurementServiceConnection.onServiceDisconnected");
        C2587y2 c2587y2 = this.f41958d;
        c2587y2.d().f41718m.c("Service disconnected");
        c2587y2.i().z(new RunnableC2519h2(this, componentName, 1));
    }
}
