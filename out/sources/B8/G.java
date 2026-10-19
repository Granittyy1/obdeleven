package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: DialogProBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class G extends F {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final SparseIntArray f1673s;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f1674r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1673s = sparseIntArray;
        sparseIntArray.put(R.id.message_text, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(M0.d dVar, View view) {
        super(view, 0, dVar);
        Object[] objArrK = M0.h.k(dVar, view, 2, null, f1673s);
        this.f1674r = -1L;
        ((LinearLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1674r = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1674r != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1674r = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
