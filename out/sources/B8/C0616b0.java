package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentControlUnitListBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0616b0 extends AbstractC0613a0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f1866v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f1867u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1866v = sparseIntArray;
        sparseIntArray.put(R.id.controlUnitListFragment_list, 1);
        sparseIntArray.put(R.id.controlUnitListFragment_fab, 2);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1867u = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1867u != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1867u = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
