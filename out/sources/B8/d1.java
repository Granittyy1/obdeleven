package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ItemLabeledButtonBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends AbstractC0620c1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f1893u;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f1894t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1893u = sparseIntArray;
        sparseIntArray.put(R.id.secondaryText, 1);
        sparseIntArray.put(R.id.primaryText, 2);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1894t = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1894t != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1894t = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
