package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ActivityNotificationBindingLandImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0618c extends AbstractC0612a implements N8.b.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final SparseIntArray f1871C;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final N8.b f1872A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f1873B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final N8.b f1874y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final N8.b f1875z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1871C = sparseIntArray;
        sparseIntArray.put(R.id.loadingProgressBar, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0618c(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 5, null, f1871C);
        super(dVar, view, (Button) objArrK[2], (ProgressBar) objArrK[4], (ImageView) objArrK[1], (ConstraintLayout) objArrK[0], (Button) objArrK[3]);
        this.f1873B = -1L;
        this.f1848r.setTag(null);
        this.f1850t.setTag(null);
        this.f1851u.setTag(null);
        this.f1852v.setTag(null);
        r(view);
        this.f1874y = new N8.b(this, 2);
        this.f1875z = new N8.b(this, 3);
        this.f1872A = new N8.b(this, 1);
        i();
    }

    @Override // N8.b.a
    public final void a(int i10) {
        com.voltasit.obdeleven.presentation.notification.b bVar;
        if (i10 == 1) {
            com.voltasit.obdeleven.presentation.notification.b bVar2 = this.f1853w;
            if (bVar2 != null) {
                bVar2.b();
                return;
            }
            return;
        }
        if (i10 == 2) {
            com.voltasit.obdeleven.presentation.notification.b bVar3 = this.f1853w;
            if (bVar3 != null) {
                if (!bVar3.f32671y) {
                    bVar3.f32671y = true;
                    bVar3.f32661o.l(bVar3.f32668v);
                }
                bVar3.f32662p.j(Boolean.valueOf(bVar3.f32668v));
                return;
            }
            return;
        }
        if (i10 == 3 && (bVar = this.f1853w) != null) {
            String str = bVar.f32660B;
            if (str != null) {
                bVar.f32666t.j(str);
            } else {
                kotlin.jvm.internal.i.m("imageURL");
                throw null;
            }
        }
    }

    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f1873B;
            this.f1873B = 0L;
        }
        if ((j & 2) != 0) {
            this.f1848r.setOnClickListener(this.f1874y);
            this.f1850t.setOnClickListener(this.f1872A);
            this.f1852v.setOnClickListener(this.f1875z);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1873B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1873B = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.AbstractC0612a
    public final void t(com.voltasit.obdeleven.presentation.notification.b bVar) {
        this.f1853w = bVar;
        synchronized (this) {
            this.f1873B |= 1;
        }
        c(17);
        n();
    }
}
