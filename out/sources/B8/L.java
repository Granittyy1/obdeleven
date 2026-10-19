package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: DialogTwitterLoginBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class L extends F {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final SparseIntArray f1741s;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f1742r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1741s = sparseIntArray;
        sparseIntArray.put(R.id.webView, 1);
        sparseIntArray.put(R.id.progress, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M0.d dVar, View view) {
        super(view, 0, dVar);
        Object[] objArrK = M0.h.k(dVar, view, 3, null, f1741s);
        this.f1742r = -1L;
        ((FrameLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1742r = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1742r != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1742r = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
