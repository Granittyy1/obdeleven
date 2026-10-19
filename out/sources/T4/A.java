package T4;

import S4.C0760b;
import U4.C0804l;
import android.os.Bundle;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class A implements com.google.android.gms.common.api.d.a, com.google.android.gms.common.api.d.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C f5818c;

    public /* synthetic */ A(C c10) {
        this.f5818c = c10;
    }

    @Override // T4.InterfaceC0770c
    public final void b0(Bundle bundle) {
        C c10 = this.f5818c;
        C0804l.h(c10.f5837r);
        p156m5.f fVar = c10.f5830k;
        C0804l.h(fVar);
        fVar.j(new BinderC0792z(c10));
    }

    @Override // T4.InterfaceC0776i
    public final void g(C0760b c0760b) {
        C c10 = this.f5818c;
        ReentrantLock reentrantLock = c10.f5822b;
        ReentrantLock reentrantLock2 = c10.f5822b;
        reentrantLock.lock();
        try {
            if (c10.f5831l && !c0760b.e()) {
                c10.a();
                c10.m();
            } else {
                c10.k(c0760b);
            }
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // T4.InterfaceC0770c
    public final void e(int i10) {
    }
}
