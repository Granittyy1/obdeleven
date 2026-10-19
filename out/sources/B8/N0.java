package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: FullScreenDialogBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class N0 extends M0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f1758v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f1759u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1758v = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.compose_view, 2);
        sparseIntArray.put(R.id.fragment_view, 3);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1759u = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1759u != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1759u = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
