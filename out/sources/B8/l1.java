package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ItemUdsBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends k1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f2038w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f2039v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2038w = sparseIntArray;
        sparseIntArray.put(R.id.itemUds_title, 1);
        sparseIntArray.put(R.id.itemUds_remove, 2);
        sparseIntArray.put(R.id.itemUds_content, 3);
        sparseIntArray.put(R.id.itemUds_progress, 4);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f2039v = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2039v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2039v = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
