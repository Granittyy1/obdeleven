package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: FragmentUdsDataBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0 extends B0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f1630z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f1631y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1630z = sparseIntArray;
        sparseIntArray.put(R.id.fragmentUdsData_statusLayout, 1);
        sparseIntArray.put(R.id.fragmentUdsData_statusTitle, 2);
        sparseIntArray.put(R.id.fragmentUdsData_statusValue, 3);
        sparseIntArray.put(R.id.fragmentUdsData_dataLayout, 4);
        sparseIntArray.put(R.id.fragmentUdsData_dataTitle, 5);
        sparseIntArray.put(R.id.fragmentUdsData_dataList, 6);
        sparseIntArray.put(R.id.fragmentUdsData_fab, 7);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1631y = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1631y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1631y = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
