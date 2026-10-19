package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ItemControlUnitBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class X0 extends W0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f1832z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f1833y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1832z = sparseIntArray;
        sparseIntArray.put(R.id.image_frame, 3);
        sparseIntArray.put(R.id.image, 4);
        sparseIntArray.put(R.id.progress, 5);
    }

    @Override // M0.h
    public final void d() {
        long j;
        String str;
        String strF;
        synchronized (this) {
            j = this.f1833y;
            this.f1833y = 0L;
        }
        G8.C c10 = this.f1830w;
        long j10 = j & 3;
        if (j10 == 0 || c10 == null) {
            str = null;
            strF = null;
        } else {
            str = c10.f3408c;
            strF = E8.a.f(65535 & c10.f3406a);
        }
        if (j10 != 0) {
            N0.c.a(this.f1827t, str);
            N0.c.a(this.f1828u, strF);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1833y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1833y = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.W0
    public final void t(G8.C c10) {
        this.f1830w = c10;
        synchronized (this) {
            this.f1833y |= 1;
        }
        c(5);
        n();
    }
}
