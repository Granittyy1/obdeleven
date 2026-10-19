package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.view.FloatingEditText;

/* JADX INFO: compiled from: DialogNumberLabelBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class E extends D {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f1657y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f1658x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1657y = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.numberLabelDialog_spinner, 2);
        sparseIntArray.put(R.id.numberLabelDialog_input, 3);
        sparseIntArray.put(R.id.numberLabelDialog_neutral, 4);
        sparseIntArray.put(R.id.dialog_positive_button, 5);
        sparseIntArray.put(R.id.dialog_negative_button, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public E(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 7, null, f1657y);
        super(dVar, view, (Button) objArrK[6], (Button) objArrK[5], (FloatingEditText) objArrK[3], (Button) objArrK[4], (AppCompatSpinner) objArrK[2], (TextView) objArrK[1]);
        this.f1658x = -1L;
        ((LinearLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1658x = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1658x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1658x = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
