package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentTwoFactorAuthBackupBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0655u0 extends AbstractC0653t0 implements N8.b.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f2162x;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final N8.b f2163v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f2164w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2162x = sparseIntArray;
        sparseIntArray.put(R.id.saveBackupText, 3);
        sparseIntArray.put(R.id.screenshotOrCopyText, 4);
        sparseIntArray.put(R.id.spacer, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0655u0(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 6, null, f2162x);
        TextView textView = (TextView) objArrK[1];
        Button button = (Button) objArrK[2];
        super(dVar, view, textView, button, (View) objArrK[5]);
        this.f2164w = -1L;
        this.f2154r.setTag(null);
        this.f2155s.setTag(null);
        ((NestedScrollView) objArrK[0]).setTag(null);
        r(view);
        this.f2163v = new N8.b(this, 1);
        i();
    }

    @Override // N8.b.a
    public final void a(int i10) {
        com.voltasit.obdeleven.presentation.twofactorauth.backup.b bVar = this.f2157u;
        if (bVar != null) {
            bVar.f33296p.j(p293xa.r.f47939a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f2164w;
            this.f2164w = 0L;
        }
        com.voltasit.obdeleven.presentation.twofactorauth.backup.b bVar = this.f2157u;
        long j10 = 7 & j;
        String str = null;
        if (j10 != 0) {
            androidx.lifecycle.C c10 = bVar != null ? bVar.f33295o : null;
            s(0, c10);
            if (c10 != null) {
                str = (String) c10.d();
            }
        }
        if (j10 != 0) {
            N0.c.a(this.f2154r, str);
        }
        if ((j & 4) != 0) {
            this.f2155s.setOnClickListener(this.f2163v);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2164w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2164w = 4L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        if (i10 != 0) {
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f2164w |= 1;
        }
        return true;
    }

    @Override // B8.AbstractC0653t0
    public final void t(com.voltasit.obdeleven.presentation.twofactorauth.backup.b bVar) {
        this.f2157u = bVar;
        synchronized (this) {
            this.f2164w |= 2;
        }
        c(29);
        n();
    }
}
