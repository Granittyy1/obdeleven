package T4;

import S4.C0760b;
import U4.C0804l;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f5995a;

    public r(K k10) {
        this.f5995a = k10;
    }

    @Override // T4.H
    public final void e(int i10) {
        K k10 = this.f5995a;
        k10.f();
        k10.f5879p.d(i10);
    }

    @Override // T4.H
    public final boolean g() {
        K k10 = this.f5995a;
        k10.f5878o.getClass();
        k10.f();
        return true;
    }

    @Override // T4.H
    public final com.google.android.gms.common.api.internal.a h(com.google.android.gms.common.api.internal.a aVar) {
        K k10 = this.f5995a;
        try {
            j0 j0Var = k10.f5878o.f5864w;
            j0Var.f5961a.add(aVar);
            aVar.f25331d.set(j0Var.f5962b);
            com.google.android.gms.common.api.a.e eVar = (com.google.android.gms.common.api.a.e) k10.f5878o.f5857p.get(null);
            C0804l.i(eVar, "Appropriate Api was not requested.");
            if (eVar.b() || !k10.f5873i.containsKey(null)) {
                try {
                    aVar.h();
                } catch (DeadObjectException e10) {
                    aVar.i(new Status(8, e10.getLocalizedMessage(), null, null));
                    throw e10;
                } catch (RemoteException e11) {
                    aVar.i(new Status(8, e11.getLocalizedMessage(), null, null));
                }
            } else {
                aVar.i(new Status(17, null, null, null));
            }
        } catch (DeadObjectException unused) {
            C0784q c0784q = new C0784q(this, this);
            J j = k10.f5871g;
            j.sendMessage(j.obtainMessage(1, c0784q));
        }
        return aVar;
    }

    @Override // T4.H
    public final void c() {
    }

    @Override // T4.H
    public final void f() {
    }

    @Override // T4.H
    public final void b(Bundle bundle) {
    }

    @Override // T4.H
    public final void d(C0760b c0760b, com.google.android.gms.common.api.a aVar, boolean z10) {
    }
}
