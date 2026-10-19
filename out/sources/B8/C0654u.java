package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialogViewModel;

/* JADX INFO: renamed from: B8.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DialogBonusBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0654u extends AbstractC0652t {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final SparseIntArray f2160A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f2161z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2160A = sparseIntArray;
        sparseIntArray.put(R.id.bonusDialog_root, 3);
        sparseIntArray.put(R.id.bonusDialog_title, 4);
        sparseIntArray.put(R.id.bonusDialog_progress_bar, 5);
        sparseIntArray.put(R.id.bonusDialog_add, 6);
        sparseIntArray.put(R.id.bonusDialog_cancel, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0654u(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 8, null, f2160A);
        Button button = (Button) objArrK[6];
        Button button2 = (Button) objArrK[7];
        ProgressBar progressBar = (ProgressBar) objArrK[5];
        super(dVar, view, button, button2, progressBar, (TextView) objArrK[4], (AppCompatCheckBox) objArrK[1], (AppCompatCheckBox) objArrK[2]);
        this.f2161z = -1L;
        this.f2151v.setTag(null);
        this.f2152w.setTag(null);
        ((LinearLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // M0.h
    public final void d() {
        long j;
        boolean z10;
        boolean zP;
        boolean z11;
        boolean zP2;
        boolean zP3;
        boolean z12;
        boolean zP4;
        synchronized (this) {
            j = this.f2161z;
            this.f2161z = 0L;
        }
        BonusDialogViewModel bonusDialogViewModel = this.f2153x;
        if ((127 & j) != 0) {
            if ((j & 97) != 0) {
                androidx.lifecycle.B b10 = bonusDialogViewModel != null ? bonusDialogViewModel.f32208u : null;
                s(0, b10);
                zP = M0.h.p(b10 != null ? (Boolean) b10.d() : null);
            } else {
                zP = false;
            }
            if ((j & 98) == 0) {
                z12 = false;
            } else {
                androidx.lifecycle.K.a aVar = bonusDialogViewModel != null ? bonusDialogViewModel.f32205r : null;
                s(1, aVar);
                com.voltasit.obdeleven.presentation.dialogs.bonus.c cVar = aVar != null ? (com.voltasit.obdeleven.presentation.dialogs.bonus.c) aVar.d() : null;
                if (cVar != null) {
                    z12 = cVar.f32222e;
                } else {
                    z12 = false;
                }
            }
            if ((j & 100) != 0) {
                androidx.lifecycle.B b11 = bonusDialogViewModel != null ? bonusDialogViewModel.f32209v : null;
                s(2, b11);
                zP4 = M0.h.p(b11 != null ? (Boolean) b11.d() : null);
            } else {
                zP4 = false;
            }
            if ((j & 104) != 0) {
                androidx.lifecycle.C<Boolean> c10 = bonusDialogViewModel != null ? bonusDialogViewModel.f32211x : null;
                s(3, c10);
                zP3 = M0.h.p(c10 != null ? c10.d() : null);
            } else {
                zP3 = false;
            }
            if ((j & 112) != 0) {
                androidx.lifecycle.C<Boolean> c11 = bonusDialogViewModel != null ? bonusDialogViewModel.f32212y : null;
                s(4, c11);
                boolean z13 = zP4;
                zP2 = M0.h.p(c11 != null ? c11.d() : null);
                z10 = z12;
                z11 = z13;
            } else {
                z10 = z12;
                z11 = zP4;
                zP2 = false;
            }
        } else {
            z10 = false;
            zP = false;
            z11 = false;
            zP2 = false;
            zP3 = false;
        }
        if ((100 & j) != 0) {
            AppCompatCheckBox appCompatCheckBox = this.f2151v;
            if (appCompatCheckBox.isChecked() != z11) {
                appCompatCheckBox.setChecked(z11);
            }
        }
        if ((j & 97) != 0) {
            W8.d.f(this.f2151v, zP);
        }
        if ((j & 104) != 0) {
            AppCompatCheckBox appCompatCheckBox2 = this.f2152w;
            if (appCompatCheckBox2.isChecked() != zP3) {
                appCompatCheckBox2.setChecked(zP3);
            }
        }
        if ((98 & j) != 0) {
            W8.d.e(this.f2152w, z10);
        }
        if ((j & 112) != 0) {
            W8.d.f(this.f2152w, zP2);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2161z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2161z = 64L;
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
                this.f2161z |= 1;
            }
            return true;
        }
        if (i10 == 1) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f2161z |= 2;
            }
            return true;
        }
        if (i10 == 2) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f2161z |= 4;
            }
            return true;
        }
        if (i10 == 3) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f2161z |= 8;
            }
            return true;
        }
        if (i10 != 4) {
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f2161z |= 16;
        }
        return true;
    }

    @Override // B8.AbstractC0652t
    public final void t(BonusDialogViewModel bonusDialogViewModel) {
        this.f2153x = bonusDialogViewModel;
        synchronized (this) {
            this.f2161z |= 32;
        }
        c(4);
        n();
    }
}
