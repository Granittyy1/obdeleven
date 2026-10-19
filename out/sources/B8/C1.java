package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ViewSimpleYesNoDialogBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1 extends B1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f1632w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f1633v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1632w = sparseIntArray;
        sparseIntArray.put(R.id.descriptionText, 2);
    }

    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f1633v;
            this.f1633v = 0L;
        }
        String str = this.f1627t;
        long j10 = j & 3;
        boolean z10 = false;
        if (j10 != 0) {
            z10 = !(str != null ? str.isEmpty() : false);
        }
        if (j10 != 0) {
            N0.c.a(this.f1626s, str);
            W8.d.f(this.f1626s, z10);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1633v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1633v = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.B1
    public final void t(String str) {
        this.f1627t = str;
        synchronized (this) {
            this.f1633v |= 1;
        }
        c(28);
        n();
    }
}
