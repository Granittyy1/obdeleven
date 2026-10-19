package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: FragmentVehicleHistoryBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class H0 extends G0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f1699y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f1700x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1699y = sparseIntArray;
        sparseIntArray.put(R.id.vehicleHistoryFragment_list, 1);
        sparseIntArray.put(R.id.vehicleHistoryFragment_empty, 2);
        sparseIntArray.put(R.id.vehicleHistoryFragment_imageFrame, 3);
        sparseIntArray.put(R.id.vehicleHistoryFragment_image, 4);
        sparseIntArray.put(R.id.vehicleHistoryFragment_name, 5);
        sparseIntArray.put(R.id.vehicleHistoryFragment_year, 6);
        sparseIntArray.put(R.id.charts_fab, 7);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1700x = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1700x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1700x = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
