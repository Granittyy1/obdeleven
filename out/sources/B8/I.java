package B8;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.B0.a;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import com.voltasit.parse.Parse;

/* JADX INFO: compiled from: DialogSecurityBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class I extends H implements N8.b.a {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final SparseIntArray f1701N;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final N8.b f1702J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final N8.b f1703K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final N8.b f1704L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f1705M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1701N = sparseIntArray;
        sparseIntArray.put(R.id.securityAccessDialog_inputLayout, 7);
        sparseIntArray.put(R.id.securityAccessDialog_input, 8);
        sparseIntArray.put(R.id.securityAccessDialog_inputProgress, 9);
        sparseIntArray.put(R.id.securityAccessDialog_searchTitle, 10);
        sparseIntArray.put(R.id.securityAccessDialog_searchProgress, 11);
        sparseIntArray.put(R.id.securityAccessDialog_searchTime, 12);
        sparseIntArray.put(R.id.securityAccessDialog_list, 13);
        sparseIntArray.put(R.id.securityAccessDialog_listProgress, 14);
        sparseIntArray.put(R.id.list_buttons, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public I(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 16, null, f1701N);
        Button button = (Button) objArrK[6];
        Button button2 = (Button) objArrK[4];
        Button button3 = (Button) objArrK[5];
        super(dVar, view, button, button2, button3, (EditText) objArrK[8], (TextInputLayout) objArrK[7], (ProgressBar) objArrK[9], (FrameLayout) objArrK[2], (ListView) objArrK[13], (ProgressBar) objArrK[14], (ProgressBar) objArrK[11], (TextView) objArrK[12], (TextView) objArrK[10], (LinearLayout) objArrK[3], (TextView) objArrK[1]);
        this.f1705M = -1L;
        this.f1690r.setTag(null);
        this.f1691s.setTag(null);
        this.f1692t.setTag(null);
        ((LinearLayout) objArrK[0]).setTag(null);
        this.f1696x.setTag(null);
        this.f1684D.setTag(null);
        this.f1685E.setTag(null);
        r(view);
        this.f1702J = new N8.b(this, 2);
        this.f1703K = new N8.b(this, 3);
        this.f1704L = new N8.b(this, 1);
        i();
    }

    @Override // N8.b.a
    public final void a(int i10) {
        com.voltasit.obdeleven.ui.dialogs.B0 b10;
        if (i10 != 1) {
            if (i10 == 2) {
                com.voltasit.obdeleven.ui.dialogs.B0 b11 = this.f1686F;
                if (b11 != null) {
                    b11.D();
                    return;
                }
                return;
            }
            if (i10 == 3 && (b10 = this.f1686F) != null) {
                b10.y();
                Bundle bundle = new Bundle();
                bundle.putBundle("key_bundle", b10.f33747A);
                b10.w("SecurityAccessDialogFragment", DialogCallback.CallbackType.f31101b, bundle);
                return;
            }
            return;
        }
        com.voltasit.obdeleven.ui.dialogs.B0 b12 = this.f1686F;
        if (b12 != null) {
            String string = b12.f33751u.f1693u.getText().toString();
            if (string.length() < 5 && b12.E(string)) {
                b12.f33751u.f1694v.setError(b12.f33750t.getString(R.string.view_security_access_login_length));
            } else if (b12.E(string)) {
                D9.o.m(b12.f33751u.f1693u);
                b12.f33751u.f1684D.setKeepScreenOn(true);
                b12.f33751u.f1681A.setMax(65536);
                b12.f33751u.v(Boolean.FALSE);
                com.voltasit.obdeleven.ui.dialogs.B0.a aVar = b12.new a(string, new com.voltasit.obdeleven.ui.dialogs.A0(b12));
                b12.f33752v = aVar;
                int i11 = b12.f33753w.f29320b.getInt("scannedLogins");
                aVar.f33763g = 0;
                aVar.f33762f = 0;
                if (i11 < 1) {
                    i11 = 1;
                }
                aVar.f33761e = i11;
                aVar.f33760d = System.currentTimeMillis();
                aVar.f33765i = true;
                b12.f33753w.a().continueWith(new V8.j(3, aVar));
                Parse.f34395b.e();
            } else {
                b12.f33751u.f1694v.setError(b12.f33750t.getString(R.string.dialog_security_access_must_know_login));
            }
            UserTrackingUtils.c(UserTrackingUtils.Key.f34275t, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ac A[PHI: r2
      0x00ac: PHI (r2v4 long) = (r2v3 long), (r2v17 long) binds: [B:45:0x0092, B:54:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // M0.h
    public final void d() {
        long j;
        int i10;
        boolean zP;
        boolean zP2;
        int i11;
        boolean zP3;
        String string;
        int i12;
        String string2;
        Resources resources;
        int i13;
        synchronized (this) {
            j = this.f1705M;
            this.f1705M = 0L;
        }
        Boolean bool = this.f1687G;
        Boolean bool2 = this.f1688H;
        Boolean bool3 = this.f1689I;
        long j10 = j & 21;
        boolean z10 = false;
        if (j10 != 0) {
            zP = M0.h.p(bool);
            if (j10 != 0) {
                j = zP ? j | 16384 : j | 8192;
            }
            if ((j & 17) != 0) {
                j = zP ? j | 65536 : j | 32768;
            }
            i10 = ((j & 17) == 0 || !zP) ? 0 : 8;
        } else {
            i10 = 0;
            zP = false;
        }
        long j11 = j & 19;
        if (j11 != 0) {
            zP2 = M0.h.p(bool2);
            if (j11 != 0) {
                j = zP2 ? j | 256 : j | 128;
            }
        } else {
            zP2 = false;
        }
        if ((j & 256) != 0) {
            zP = M0.h.p(bool);
            if ((j & 21) != 0) {
                j = zP ? j | 16384 : j | 8192;
            }
            if ((j & 17) != 0) {
                j = zP ? j | 65536 : j | 32768;
            }
        }
        long j12 = j & 19;
        if (j12 == 0) {
            i11 = 0;
        } else {
            boolean z11 = zP2 ? zP : false;
            if (j12 != 0) {
                j |= z11 ? 64L : 32L;
            }
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
        }
        if ((j & 16384) != 0) {
            zP3 = M0.h.p(bool3);
            if ((j & 2048) != 0) {
                j = zP3 ? j | 262144 : j | 131072;
            }
        } else {
            zP3 = false;
        }
        long j13 = j & 21;
        String str = null;
        if (j13 != 0) {
            if (!zP) {
                zP3 = false;
            }
            if (j13 != 0) {
                j |= zP3 ? 1053696L : 526848L;
            }
            string = this.f1692t.getResources().getString(zP3 ? R.string.common_ok : R.string.common_cancel);
            z10 = zP3;
            i12 = zP3 ? 0 : 8;
        } else {
            string = null;
            i12 = 0;
        }
        long j14 = 2048 & j;
        if (j14 != 0) {
            boolean zP4 = M0.h.p(bool3);
            if (j14 != 0) {
                j = zP4 ? j | 262144 : j | 131072;
            }
            if (zP4) {
                resources = this.f1685E.getResources();
                i13 = R.string.dialog_security_access_login_search;
            } else {
                resources = this.f1685E.getResources();
                i13 = R.string.common_login_code;
            }
            string2 = resources.getString(i13);
        } else {
            string2 = null;
        }
        long j15 = 21 & j;
        if (j15 != 0) {
            if (z10) {
                string2 = this.f1685E.getResources().getString(R.string.common_enter_login);
            }
            str = string2;
        }
        String str2 = str;
        if ((16 & j) != 0) {
            this.f1690r.setOnClickListener(this.f1703K);
            this.f1691s.setOnClickListener(this.f1704L);
            this.f1692t.setOnClickListener(this.f1702J);
        }
        if (j15 != 0) {
            this.f1690r.setVisibility(i12);
            N0.c.a(this.f1692t, string);
            this.f1696x.setVisibility(i12);
            N0.c.a(this.f1685E, str2);
        }
        if ((j & 19) != 0) {
            this.f1691s.setVisibility(i11);
        }
        if ((j & 17) != 0) {
            this.f1684D.setVisibility(i10);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1705M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1705M = 16L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.H
    public final void t(Boolean bool) {
        this.f1689I = bool;
        synchronized (this) {
            this.f1705M |= 4;
        }
        c(10);
        n();
    }

    @Override // B8.H
    public final void u(Boolean bool) {
        this.f1688H = bool;
        synchronized (this) {
            this.f1705M |= 2;
        }
        c(14);
        n();
    }

    @Override // B8.H
    public final void v(Boolean bool) {
        this.f1687G = bool;
        synchronized (this) {
            this.f1705M |= 1;
        }
        c(23);
        n();
    }

    @Override // B8.H
    public final void w(com.voltasit.obdeleven.ui.dialogs.B0 b10) {
        this.f1686F = b10;
        synchronized (this) {
            this.f1705M |= 8;
        }
        c(33);
        n();
    }
}
