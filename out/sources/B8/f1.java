package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ItemLabeledButtonInfoBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends e1 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f1916x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f1917w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1916x = sparseIntArray;
        sparseIntArray.put(R.id.descriptionText, 3);
    }

    @Override // M0.h
    public final void d() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.f1917w;
            this.f1917w = 0L;
        }
        com.voltasit.obdeleven.presentation.controlUnit.info.h hVar = this.f1902u;
        long j10 = j & 3;
        if (j10 == 0 || hVar == null) {
            str = null;
            str2 = null;
        } else {
            str = hVar.f31658a;
            str2 = hVar.f31660c;
        }
        if (j10 != 0) {
            N0.c.a(this.f1900s, str);
            N0.c.a(this.f1901t, str2);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1917w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1917w = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.e1
    public final void t(com.voltasit.obdeleven.presentation.controlUnit.info.h hVar) {
        this.f1902u = hVar;
        synchronized (this) {
            this.f1917w |= 1;
        }
        c(9);
        n();
    }
}
