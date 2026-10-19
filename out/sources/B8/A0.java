package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: FragmentTwoFactorAuthVerifyBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class A0 extends AbstractC0665z0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f1607A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f1608z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1607A = sparseIntArray;
        sparseIntArray.put(R.id.appBar, 2);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.enterCodeText, 4);
        sparseIntArray.put(R.id.codeInputLayout, 5);
        sparseIntArray.put(R.id.codeInput, 6);
        sparseIntArray.put(R.id.errorText, 7);
        sparseIntArray.put(R.id.needHelpButton, 8);
        sparseIntArray.put(R.id.backupButton, 9);
        sparseIntArray.put(R.id.spacer, 10);
    }

    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f1608z;
            this.f1608z = 0L;
        }
        if ((j & 1) != 0) {
            W8.d.e(this.f2213t, false);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1608z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1608z = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
