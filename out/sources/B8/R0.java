package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ItemAutocodeProgressBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class R0 extends Q0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f1795v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f1796u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1795v = sparseIntArray;
        sparseIntArray.put(R.id.item_autocode_image, 1);
        sparseIntArray.put(R.id.item_autocode_progress, 2);
        sparseIntArray.put(R.id.item_autocode_text, 3);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1796u = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1796u != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1796u = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
