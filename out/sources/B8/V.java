package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: FragmentAppListBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class V extends U {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f1819z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f1820y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1819z = sparseIntArray;
        sparseIntArray.put(R.id.category_adjustments, 2);
        sparseIntArray.put(R.id.category_retrofits, 3);
        sparseIntArray.put(R.id.category_workshop, 4);
        sparseIntArray.put(R.id.appListFragment_list, 5);
        sparseIntArray.put(R.id.appListFragment_empty, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public V(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 7, null, f1819z);
        super(dVar, view, (TextView) objArrK[1], (TextView) objArrK[6], (RecyclerView) objArrK[5], (Button) objArrK[2], (Button) objArrK[3], (Button) objArrK[4]);
        this.f1820y = -1L;
        this.f1811r.setTag(null);
        ((LinearLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f1820y;
            this.f1820y = 0L;
        }
        String str = this.f1817x;
        long j10 = j & 10;
        int i10 = 0;
        if (j10 != 0) {
            boolean z10 = str != null;
            if (j10 != 0) {
                j |= z10 ? 32L : 16L;
            }
            if (!z10) {
                i10 = 8;
            }
        }
        if ((j & 10) != 0) {
            N0.c.a(this.f1811r, str);
            this.f1811r.setVisibility(i10);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1820y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1820y = 8L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.U
    public final void t(String str) {
        this.f1817x = str;
        synchronized (this) {
            this.f1820y |= 2;
        }
        c(16);
        n();
    }
}
