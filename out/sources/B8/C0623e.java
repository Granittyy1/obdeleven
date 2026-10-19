package B8;

import android.util.SparseIntArray;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BottomSheetDeviceSelectionBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0623e extends AbstractC0621d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseIntArray f1895t;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f1896s;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1895t = sparseIntArray;
        sparseIntArray.put(R.id.bottom_sheet_devices_selection_list, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0623e(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 2, null, f1895t);
        super(dVar, view, (RecyclerView) objArrK[1]);
        this.f1896s = -1L;
        ((CoordinatorLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1896s = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1896s != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1896s = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
