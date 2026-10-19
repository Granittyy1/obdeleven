package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.view.AppSpinnerDropDown;

/* JADX INFO: compiled from: FragmentAppBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class T extends S {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final SparseIntArray f1807B;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f1808A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1807B = sparseIntArray;
        sparseIntArray.put(R.id.ocaImageView, 2);
        sparseIntArray.put(R.id.ocaNameTextView, 3);
        sparseIntArray.put(R.id.ocaCreditsTextView, 4);
        sparseIntArray.put(R.id.ocaVideoImageView, 5);
        sparseIntArray.put(R.id.ocaValueSpinner, 6);
        sparseIntArray.put(R.id.ocaDescriptionTextView, 7);
        sparseIntArray.put(R.id.fab, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public T(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 9, null, f1807B);
        super(dVar, view, (LinearLayout) objArrK[1], (FloatingActionButton) objArrK[8], (TextView) objArrK[4], (TextView) objArrK[7], (ShapeableImageView) objArrK[2], (TextView) objArrK[3], (AppSpinnerDropDown) objArrK[6], (ImageView) objArrK[5]);
        this.f1808A = -1L;
        this.f1797r.setTag(null);
        ((FrameLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f1808A;
            this.f1808A = 0L;
        }
        com.voltasit.obdeleven.presentation.oca.k kVar = this.f1805z;
        long j10 = j & 7;
        boolean zP = false;
        if (j10 != 0) {
            androidx.lifecycle.C c10 = kVar != null ? kVar.f32733Q : null;
            s(0, c10);
            zP = M0.h.p(c10 != null ? (Boolean) c10.d() : null);
        }
        if (j10 != 0) {
            W8.d.f(this.f1797r, zP);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1808A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1808A = 4L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        if (i10 != 0) {
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f1808A |= 1;
        }
        return true;
    }

    @Override // B8.S
    public final void t(com.voltasit.obdeleven.presentation.oca.k kVar) {
        this.f1805z = kVar;
        synchronized (this) {
            this.f1808A |= 2;
        }
        c(18);
        n();
    }
}
