package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ItemAddOcaBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class P0 extends O0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f1781u;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f1782t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1781u = sparseIntArray;
        sparseIntArray.put(R.id.text, 1);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1782t = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1782t != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1782t = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
