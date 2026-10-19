package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ItemVehicleBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends m1 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f2082z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f2083y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2082z = sparseIntArray;
        sparseIntArray.put(R.id.imageFrame, 1);
        sparseIntArray.put(R.id.image, 2);
        sparseIntArray.put(R.id.progress, 3);
        sparseIntArray.put(R.id.modelText, 4);
        sparseIntArray.put(R.id.yearText, 5);
        sparseIntArray.put(R.id.vinText, 6);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f2083y = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2083y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2083y = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
