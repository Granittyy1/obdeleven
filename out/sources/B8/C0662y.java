package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DialogChartSaveBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0662y extends AbstractC0660x {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f2191w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f2192v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2191w = sparseIntArray;
        sparseIntArray.put(R.id.dialogChart_inputLayout, 1);
        sparseIntArray.put(R.id.dialogChart_listView, 2);
        sparseIntArray.put(R.id.dialog_positive_button, 3);
        sparseIntArray.put(R.id.dialog_negative_button, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0662y(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 5, null, f2191w);
        super(dVar, view, (TextInputLayout) objArrK[1], (ListView) objArrK[2], (Button) objArrK[4], (Button) objArrK[3]);
        this.f2192v = -1L;
        ((LinearLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f2192v = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2192v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2192v = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
