package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ItemCountryBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Z0 extends Y0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f1845w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f1846v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1845w = sparseIntArray;
        sparseIntArray.put(R.id.flagCard, 1);
        sparseIntArray.put(R.id.flag, 2);
        sparseIntArray.put(R.id.title, 3);
        sparseIntArray.put(R.id.phoneCode, 4);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1846v = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1846v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1846v = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
