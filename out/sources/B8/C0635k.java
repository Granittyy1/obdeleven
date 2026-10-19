package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnitFragmentBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0635k extends AbstractC0633j {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f1987w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f1988v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1987w = sparseIntArray;
        sparseIntArray.put(R.id.controlUnitFragment_image, 1);
        sparseIntArray.put(R.id.controlUnitFragment_name, 2);
        sparseIntArray.put(R.id.controlUnitFragment_number, 3);
        sparseIntArray.put(R.id.controlUnitFragment_buttons, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0635k(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 5, null, f1987w);
        super(dVar, view, (LinearLayout) objArrK[4], (ShapeableImageView) objArrK[1], (TextView) objArrK[2], (TextView) objArrK[3]);
        this.f1988v = -1L;
        ((LinearLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1988v = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1988v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1988v = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
