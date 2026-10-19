package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: DialogUpdateBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class N extends M {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f1756y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f1757x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1756y = sparseIntArray;
        sparseIntArray.put(R.id.requirements, 1);
        sparseIntArray.put(R.id.divider, 2);
        sparseIntArray.put(R.id.updateProgress, 3);
        sparseIntArray.put(R.id.ok, 4);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1757x = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1757x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1757x = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
