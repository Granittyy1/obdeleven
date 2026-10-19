package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DialogAutocodeProgressBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0647q extends AbstractC0645p {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f2101v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f2102u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2101v = sparseIntArray;
        sparseIntArray.put(R.id.dialog_autocode_list, 1);
        sparseIntArray.put(R.id.list_buttons, 2);
        sparseIntArray.put(R.id.button_start, 3);
        sparseIntArray.put(R.id.button_cancel, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0647q(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 5, null, f2101v);
        Button button = (Button) objArrK[4];
        Button button2 = (Button) objArrK[3];
        RecyclerView recyclerView = (RecyclerView) objArrK[1];
        super(dVar, view, button, button2, recyclerView);
        this.f2102u = -1L;
        ((LinearLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f2102u = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2102u != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2102u = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
