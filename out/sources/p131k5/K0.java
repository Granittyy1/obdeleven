package p131k5;

import U4.C0804l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.h;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class K0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f41849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41851c;

    public K0(h hVar) {
        C0804l.h(hVar);
        this.f41849a = hVar;
    }

    public final void a() {
        h hVar = this.f41849a;
        hVar.Z();
        hVar.i().p();
        hVar.i().p();
        if (this.f41850b) {
            hVar.d().f41719n.c("Unregistering connectivity change receiver");
            this.f41850b = false;
            this.f41851c = false;
            try {
                hVar.f26609l.f42212a.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                hVar.d().f41712f.b(e10, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        h hVar = this.f41849a;
        hVar.Z();
        String action = intent.getAction();
        hVar.d().f41719n.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            hVar.d().f41715i.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        E0 e10 = hVar.f26600b;
        h.y(e10);
        boolean zY = e10.y();
        if (this.f41851c != zY) {
            this.f41851c = zY;
            hVar.i().z(new J0(this, zY));
        }
    }
}
