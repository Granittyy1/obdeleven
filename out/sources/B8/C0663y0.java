package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentTwoFactorAuthSetupBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0663y0 extends AbstractC0661x0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f2193w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f2194v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2193w = sparseIntArray;
        sparseIntArray.put(R.id.title, 1);
        sparseIntArray.put(R.id.tip, 2);
        sparseIntArray.put(R.id.codeText, 3);
        sparseIntArray.put(R.id.spacer, 4);
        sparseIntArray.put(R.id.copyCodeButton, 5);
        sparseIntArray.put(R.id.continueButton, 6);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f2194v = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2194v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2194v = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
