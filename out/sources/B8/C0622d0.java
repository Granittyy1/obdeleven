package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.twofactorauth.backupCode.DisableTwoFactorBackupCodeViewModel;

/* JADX INFO: renamed from: B8.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentDisableTwoFactorAuthBackupBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0622d0 extends AbstractC0619c0 implements N8.b.a {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f1887D;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final N8.b f1888A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final a f1889B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f1890C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final N8.b f1891z;

    /* JADX INFO: renamed from: B8.d0$a */
    /* JADX INFO: compiled from: FragmentDisableTwoFactorAuthBackupBindingImpl.java */
    public class a implements M0.f {
        public a() {
        }

        @Override // M0.f
        public final void a() {
            androidx.lifecycle.C<String> c10;
            C0622d0 c0622d0 = C0622d0.this;
            String string = c0622d0.f1877r.getText().toString();
            DisableTwoFactorBackupCodeViewModel disableTwoFactorBackupCodeViewModel = c0622d0.f1883x;
            if (disableTwoFactorBackupCodeViewModel == null || (c10 = disableTwoFactorBackupCodeViewModel.f33306s) == null) {
                return;
            }
            c10.j(string);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1887D = sparseIntArray;
        sparseIntArray.put(R.id.appBar, 4);
        sparseIntArray.put(R.id.toolbar, 5);
        sparseIntArray.put(R.id.disableBackupTitle, 6);
        sparseIntArray.put(R.id.disableBackupTip, 7);
        sparseIntArray.put(R.id.errorText, 8);
        sparseIntArray.put(R.id.codeInputLayout, 9);
        sparseIntArray.put(R.id.spacer, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0622d0(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 11, null, f1887D);
        TextInputEditText textInputEditText = (TextInputEditText) objArrK[1];
        Button button = (Button) objArrK[3];
        super(dVar, view, textInputEditText, button, (TextView) objArrK[8], (TextView) objArrK[2], (View) objArrK[10], (Toolbar) objArrK[5]);
        this.f1889B = new a();
        this.f1890C = -1L;
        this.f1877r.setTag(null);
        this.f1878s.setTag(null);
        ((FrameLayout) objArrK[0]).setTag(null);
        this.f1880u.setTag(null);
        r(view);
        this.f1891z = new N8.b(this, 1);
        this.f1888A = new N8.b(this, 2);
        i();
    }

    @Override // N8.b.a
    public final void a(int i10) {
        DisableTwoFactorBackupCodeViewModel disableTwoFactorBackupCodeViewModel;
        if (i10 != 1) {
            if (i10 == 2 && (disableTwoFactorBackupCodeViewModel = this.f1883x) != null) {
                disableTwoFactorBackupCodeViewModel.b();
                return;
            }
            return;
        }
        DisableTwoFactorBackupCodeViewModel disableTwoFactorBackupCodeViewModel2 = this.f1883x;
        if (disableTwoFactorBackupCodeViewModel2 != null) {
            disableTwoFactorBackupCodeViewModel2.f33308u.j(p293xa.r.f47939a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // M0.h
    public final void d() {
        long j;
        String strD;
        synchronized (this) {
            j = this.f1890C;
            this.f1890C = 0L;
        }
        DisableTwoFactorBackupCodeViewModel disableTwoFactorBackupCodeViewModel = this.f1883x;
        boolean zP = false;
        if ((15 & j) != 0) {
            if ((j & 13) == 0) {
                strD = null;
            } else {
                androidx.lifecycle.C<String> c10 = disableTwoFactorBackupCodeViewModel != null ? disableTwoFactorBackupCodeViewModel.f33306s : null;
                s(0, c10);
                if (c10 != null) {
                    strD = c10.d();
                } else {
                    strD = null;
                }
            }
            if ((j & 14) != 0) {
                androidx.lifecycle.B b10 = disableTwoFactorBackupCodeViewModel != null ? disableTwoFactorBackupCodeViewModel.f33307t : null;
                s(1, b10);
                zP = M0.h.p(b10 != null ? (Boolean) b10.d() : null);
            }
        } else {
            strD = null;
        }
        if ((13 & j) != 0) {
            N0.c.a(this.f1877r, strD);
        }
        if ((8 & j) != 0) {
            N0.c.b(this.f1877r, null, this.f1889B);
            this.f1878s.setOnClickListener(this.f1888A);
            this.f1880u.setOnClickListener(this.f1891z);
        }
        if ((j & 14) != 0) {
            W8.d.e(this.f1878s, zP);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1890C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1890C = 8L;
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
                this.f1890C |= 1;
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f1890C |= 2;
        }
        return true;
    }

    @Override // B8.AbstractC0619c0
    public final void t(DisableTwoFactorBackupCodeViewModel disableTwoFactorBackupCodeViewModel) {
        this.f1883x = disableTwoFactorBackupCodeViewModel;
        synchronized (this) {
            this.f1890C |= 4;
        }
        c(7);
        n();
    }
}
