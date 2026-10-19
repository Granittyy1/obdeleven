package B8;

import android.util.SparseIntArray;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ListDeviceNameBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 extends q1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f2133w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f2134v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2133w = sparseIntArray;
        sparseIntArray.put(R.id.icon, 3);
    }

    @Override // M0.h
    public final void d() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.f2134v;
            this.f2134v = 0L;
        }
        Q8.b bVar = this.f2108u;
        long j10 = j & 3;
        if (j10 == 0 || bVar == null) {
            str = null;
            str2 = null;
        } else {
            str = bVar.f5127b;
            str2 = bVar.f5128c;
        }
        if (j10 != 0) {
            N0.c.a(this.f2105r, str2);
            N0.c.a(this.f2106s, str);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2134v != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2134v = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.q1
    public final void t(Q8.b bVar) {
        this.f2108u = bVar;
        synchronized (this) {
            this.f2134v |= 1;
        }
        c(11);
        n();
    }
}
