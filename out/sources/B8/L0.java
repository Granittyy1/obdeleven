package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.garage.GarageViewModel;

/* JADX INFO: compiled from: FragmentVehicleListBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class L0 extends K0 implements N8.d.a, N8.b.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f1743A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final N8.d f1744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final N8.b f1745y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f1746z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1743A = sparseIntArray;
        sparseIntArray.put(R.id.emptyListImageView, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public L0(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 6, null, f1743A);
        super(dVar, view, (LinearLayout) objArrK[2], (TextView) objArrK[3], (FloatingActionButton) objArrK[4], (RecyclerView) objArrK[1], (SwipeRefreshLayout) objArrK[0]);
        this.f1746z = -1L;
        this.f1735r.setTag(null);
        this.f1736s.setTag(null);
        this.f1737t.setTag(null);
        this.f1738u.setTag(null);
        this.f1739v.setTag(null);
        r(view);
        this.f1744x = new N8.d(this);
        this.f1745y = new N8.b(this, 2);
        i();
    }

    @Override // N8.b.a
    public final void a(int i10) {
        GarageViewModel garageViewModel = this.f1740w;
        if (garageViewModel != null) {
            garageViewModel.f32323P.j(Boolean.TRUE);
        }
    }

    @Override // N8.d.a
    public final void b() {
        GarageViewModel garageViewModel = this.f1740w;
        if (garageViewModel != null) {
            garageViewModel.g(false, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // M0.h
    public final void d() {
        long j;
        String str;
        boolean zP;
        boolean zP2;
        boolean zP3;
        boolean z10;
        boolean z11;
        synchronized (this) {
            j = this.f1746z;
            this.f1746z = 0L;
        }
        GarageViewModel garageViewModel = this.f1740w;
        if ((63 & j) != 0) {
            if ((j & 49) == 0) {
                str = null;
            } else {
                androidx.lifecycle.C c10 = garageViewModel != null ? garageViewModel.f32309B : null;
                s(0, c10);
                if (c10 != null) {
                    str = (String) c10.d();
                } else {
                    str = null;
                }
            }
            if ((j & 50) != 0) {
                androidx.lifecycle.C c11 = garageViewModel != null ? garageViewModel.f32315H : null;
                s(1, c11);
                zP3 = M0.h.p(c11 != null ? (Boolean) c11.d() : null);
                z11 = !zP3;
            } else {
                zP3 = false;
                z11 = false;
            }
            if ((j & 52) != 0) {
                androidx.lifecycle.C c12 = garageViewModel != null ? garageViewModel.f32317J : null;
                s(2, c12);
                zP2 = M0.h.p(c12 != null ? (Boolean) c12.d() : null);
            } else {
                zP2 = false;
            }
            if ((j & 56) != 0) {
                androidx.lifecycle.C c13 = garageViewModel != null ? garageViewModel.f32313F : null;
                s(3, c13);
                zP = M0.h.p(c13 != null ? (Boolean) c13.d() : null);
                z10 = z11;
            } else {
                z10 = z11;
                zP = false;
            }
        } else {
            str = null;
            zP = false;
            zP2 = false;
            zP3 = false;
            z10 = false;
        }
        if ((j & 50) != 0) {
            W8.d.f(this.f1735r, z10);
            W8.d.f(this.f1738u, zP3);
        }
        if ((49 & j) != 0) {
            N0.c.a(this.f1736s, str);
        }
        if ((32 & j) != 0) {
            this.f1737t.setOnClickListener(this.f1745y);
            this.f1739v.setOnRefreshListener(this.f1744x);
        }
        if ((52 & j) != 0) {
            W8.d.f(this.f1737t, zP2);
        }
        if ((j & 56) != 0) {
            this.f1739v.setRefreshing(zP);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1746z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1746z = 32L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        if (i10 == 0) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f1746z |= 1;
            }
            return true;
        }
        if (i10 == 1) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f1746z |= 2;
            }
            return true;
        }
        if (i10 == 2) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f1746z |= 4;
            }
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f1746z |= 8;
        }
        return true;
    }

    @Override // B8.K0
    public final void t(GarageViewModel garageViewModel) {
        this.f1740w = garageViewModel;
        synchronized (this) {
            this.f1746z |= 16;
        }
        c(8);
        n();
    }
}
