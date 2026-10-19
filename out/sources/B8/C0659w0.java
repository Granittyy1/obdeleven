package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentTwoFactorAuthIntroBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0659w0 extends AbstractC0657v0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final SparseIntArray f2178u;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f2179t;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2178u = sparseIntArray;
        sparseIntArray.put(R.id.twoFaImage, 1);
        sparseIntArray.put(R.id.titleText, 2);
        sparseIntArray.put(R.id.lockImage, 3);
        sparseIntArray.put(R.id.lockText, 4);
        sparseIntArray.put(R.id.lockBarrier, 5);
        sparseIntArray.put(R.id.gearImage, 6);
        sparseIntArray.put(R.id.gearText, 7);
        sparseIntArray.put(R.id.gearBarrier, 8);
        sparseIntArray.put(R.id.learnMoreButton, 9);
        sparseIntArray.put(R.id.startButton, 10);
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f2179t = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2179t != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2179t = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
