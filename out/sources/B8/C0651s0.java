package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.core.widget.NestedScrollView;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentTwoFactorAuthActivatedBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0651s0 extends AbstractC0649r0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f2138u;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f2139t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2138u = sparseIntArray;
        sparseIntArray.put(R.id.twoFaImage, 1);
        sparseIntArray.put(R.id.titleText, 2);
        sparseIntArray.put(R.id.lockText, 3);
        sparseIntArray.put(R.id.spacer, 4);
        sparseIntArray.put(R.id.finishButton, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0651s0(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 6, null, f2138u);
        Button button = (Button) objArrK[5];
        View view2 = (View) objArrK[4];
        super(dVar, view, button, view2);
        this.f2139t = -1L;
        ((NestedScrollView) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f2139t = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2139t != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2139t = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
