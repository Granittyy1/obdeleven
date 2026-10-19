package T4;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p191p5.h f5959b;

    public i0(p191p5.h hVar) {
        super(4);
        this.f5959b = hVar;
    }

    @Override // T4.m0
    public final void a(Status status) {
        this.f5959b.c(new ApiException(status));
    }

    @Override // T4.m0
    public final void b(RuntimeException runtimeException) {
        this.f5959b.c(runtimeException);
    }

    @Override // T4.m0
    public final void c(T t8) throws DeadObjectException {
        try {
            h(t8);
        } catch (DeadObjectException e10) {
            a(m0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(m0.e(e11));
        } catch (RuntimeException e12) {
            this.f5959b.c(e12);
        }
    }

    public abstract void h(T t8) throws RemoteException;
}
