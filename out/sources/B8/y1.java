package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: UdsDataListFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y1 extends x1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f2195u;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f2196t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2195u = sparseIntArray;
        sparseIntArray.put(R.id.udsDataListFragment_list, 1);
        sparseIntArray.put(R.id.udsDataListFragment_fab, 2);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f2196t = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2196t != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2196t = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
