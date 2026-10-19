package T4;

import S4.C0760b;
import U4.C0804l;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements com.google.android.gms.common.api.d.a, com.google.android.gms.common.api.d.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.common.api.a f6003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public K f6005e;

    public u0(com.google.android.gms.common.api.a aVar, boolean z10) {
        this.f6003c = aVar;
        this.f6004d = z10;
    }

    @Override // T4.InterfaceC0770c
    public final void b0(Bundle bundle) {
        C0804l.i(this.f6005e, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f6005e.b0(bundle);
    }

    @Override // T4.InterfaceC0770c
    public final void e(int i10) {
        C0804l.i(this.f6005e, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f6005e.e(i10);
    }

    @Override // T4.InterfaceC0776i
    public final void g(C0760b c0760b) {
        boolean z10 = this.f6004d;
        C0804l.i(this.f6005e, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        K k10 = this.f6005e;
        com.google.android.gms.common.api.a aVar = this.f6003c;
        k10.f5867c.lock();
        try {
            k10.f5876m.d(c0760b, aVar, z10);
        } finally {
            k10.f5867c.unlock();
        }
    }
}
