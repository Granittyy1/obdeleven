package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;
import p220r9.C2782n;

/* JADX INFO: compiled from: ListDialogBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t1 extends s1 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f2158y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f2159x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2158y = sparseIntArray;
        sparseIntArray.put(R.id.dialog_input, 3);
        sparseIntArray.put(R.id.item_button_positive, 4);
        sparseIntArray.put(R.id.item_button_neutral, 5);
    }

    @Override // M0.h
    public final void d() {
        long j;
        int i10;
        synchronized (this) {
            j = this.f2159x;
            this.f2159x = 0L;
        }
        p110i9.l lVar = this.f2145w;
        long j10 = j & 3;
        int i11 = 0;
        if (j10 != 0) {
            boolean z10 = lVar == null || lVar.f36779a.size() == 0;
            if (j10 != 0) {
                j |= z10 ? 40L : 20L;
            }
            i10 = z10 ? 0 : 8;
            if (z10) {
                i11 = 8;
            }
        } else {
            i10 = 0;
        }
        if ((j & 3) != 0) {
            this.f2143u.setVisibility(i11);
            C2782n.a(this.f2143u, lVar);
            this.f2144v.setVisibility(i10);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2159x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2159x = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.s1
    public final void t(p110i9.l lVar) {
        this.f2145w = lVar;
        synchronized (this) {
            this.f2159x |= 1;
        }
        c(2);
        n();
    }
}
