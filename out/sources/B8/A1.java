package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: VehicleHistoryScanFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class A1 extends z1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f1609t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f1610s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1609t = sparseIntArray;
        sparseIntArray.put(R.id.vehicleHistoryScanFragment_list, 1);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1610s = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1610s != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1610s = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
