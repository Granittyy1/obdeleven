package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChartValueDialogBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0627g extends AbstractC0625f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f1918x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f1919w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1918x = sparseIntArray;
        sparseIntArray.put(R.id.dialog_chart_title, 1);
        sparseIntArray.put(R.id.measurements, 2);
        sparseIntArray.put(R.id.values, 3);
        sparseIntArray.put(R.id.dialog_positive_button, 4);
        sparseIntArray.put(R.id.dialog_negative_button, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0627g(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 6, null, f1918x);
        super(dVar, view, (TextView) objArrK[1], (Button) objArrK[5], (Button) objArrK[4], (AppCompatSpinner) objArrK[2], (AppCompatSpinner) objArrK[3]);
        this.f1919w = -1L;
        ((LinearLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1919w = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1919w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1919w = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
