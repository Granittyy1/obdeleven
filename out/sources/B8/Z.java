package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: FragmentControlUnitInfoBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Z extends Y {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f1843x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f1844w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1843x = sparseIntArray;
        sparseIntArray.put(R.id.controlUnitInfoFragment_header, 1);
        sparseIntArray.put(R.id.controlUnitInfoFragment_image, 2);
        sparseIntArray.put(R.id.controlUnitInfoFragment_name, 3);
        sparseIntArray.put(R.id.controlUnitInfoFragment_number, 4);
        sparseIntArray.put(R.id.vehicleInfoFragment_engine, 5);
        sparseIntArray.put(R.id.controlUnitInfoFragment_list, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Z(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 7, null, f1843x);
        FrameLayout frameLayout = (FrameLayout) objArrK[1];
        ShapeableImageView shapeableImageView = (ShapeableImageView) objArrK[2];
        RecyclerView recyclerView = (RecyclerView) objArrK[6];
        TextView textView = (TextView) objArrK[3];
        TextView textView2 = (TextView) objArrK[4];
        super(dVar, view, frameLayout, shapeableImageView, recyclerView, textView, textView2);
        this.f1844w = -1L;
        ((LinearLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1844w = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1844w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1844w = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
