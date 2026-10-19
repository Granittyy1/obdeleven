package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnitFaultsFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0631i extends AbstractC0629h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f1955A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f1956z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1955A = sparseIntArray;
        sparseIntArray.put(R.id.controlUnitFaultsFragment_list, 1);
        sparseIntArray.put(R.id.controlUnitFaultsFragment_empty, 2);
        sparseIntArray.put(R.id.controlUnitFaultsFragment_imageFrame, 3);
        sparseIntArray.put(R.id.controlUnitFaultsFragment_image, 4);
        sparseIntArray.put(R.id.controlUnitFaultsFragment_name, 5);
        sparseIntArray.put(R.id.controlUnitFaultsFragment_language, 6);
        sparseIntArray.put(R.id.controlUnitFaultsFragment_fab, 7);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1956z = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1956z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1956z = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
