package T4;

import S4.C0762d;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0774g f5973c;

    public l0(C0774g c0774g, p191p5.h hVar) {
        super(hVar);
        this.f5973c = c0774g;
    }

    @Override // T4.a0
    public final boolean f(T t8) {
        if (((f0) t8.f5893h.get(this.f5973c)) == null) {
            return false;
        }
        throw null;
    }

    @Override // T4.a0
    public final C0762d[] g(T t8) {
        if (((f0) t8.f5893h.get(this.f5973c)) == null) {
            return null;
        }
        throw null;
    }

    @Override // T4.i0
    public final void h(T t8) throws RemoteException {
        if (((f0) t8.f5893h.remove(this.f5973c)) != null) {
            throw null;
        }
        this.f5959b.d(Boolean.FALSE);
    }

    @Override // T4.m0
    public final /* bridge */ /* synthetic */ void d(C0781n c0781n, boolean z10) {
    }
}
