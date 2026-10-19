package T4;

import S4.C0762d;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f5963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p191p5.h f5964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q3.d f5965d;

    public k0(int i10, h0 h0Var, p191p5.h hVar, Q3.d dVar) {
        super(i10);
        this.f5964c = hVar;
        this.f5963b = h0Var;
        this.f5965d = dVar;
        if (i10 == 2 && h0Var.f5967b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // T4.m0
    public final void a(Status status) {
        this.f5965d.getClass();
        this.f5964c.c(status.f25310d != null ? new ResolvableApiException(status) : new ApiException(status));
    }

    @Override // T4.m0
    public final void b(RuntimeException runtimeException) {
        this.f5964c.c(runtimeException);
    }

    @Override // T4.m0
    public final void c(T t8) throws DeadObjectException {
        p191p5.h hVar = this.f5964c;
        try {
            h0 h0Var = this.f5963b;
            h0Var.f5958d.f5969a.b(t8.f5889d, hVar);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(m0.e(e11));
        } catch (RuntimeException e12) {
            hVar.c(e12);
        }
    }

    @Override // T4.m0
    public final void d(C0781n c0781n, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Map map = c0781n.f5988b;
        p191p5.h hVar = this.f5964c;
        map.put(hVar, boolValueOf);
        hVar.f45811a.c(new K3.b(c0781n, hVar));
    }

    @Override // T4.a0
    public final boolean f(T t8) {
        return this.f5963b.f5967b;
    }

    @Override // T4.a0
    public final C0762d[] g(T t8) {
        return this.f5963b.f5966a;
    }
}
