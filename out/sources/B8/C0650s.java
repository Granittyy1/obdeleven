package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC1376t;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DialogBackupBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0650s extends r {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final M0.h.d f2135O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final SparseIntArray f2136P;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f2137N;

    static {
        M0.h.d dVar = new M0.h.d(23);
        f2135O = dVar;
        dVar.a(1, new String[]{"item_labeled_checkbox", "item_labeled_checkbox", "item_labeled_checkbox", "item_labeled_checkbox", "item_labeled_checkbox"}, new int[]{2, 3, 4, 5, 6}, new int[]{R.layout.item_labeled_checkbox, R.layout.item_labeled_checkbox, R.layout.item_labeled_checkbox, R.layout.item_labeled_checkbox, R.layout.item_labeled_checkbox});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2136P = sparseIntArray;
        sparseIntArray.put(R.id.title, 7);
        sparseIntArray.put(R.id.backupDialog_inputLayout, 8);
        sparseIntArray.put(R.id.backupDialog_progressView, 9);
        sparseIntArray.put(R.id.backupDialog_batteryLayout, 10);
        sparseIntArray.put(R.id.backupDialog_batteryVoltageIcon, 11);
        sparseIntArray.put(R.id.backupDialog_voltage, 12);
        sparseIntArray.put(R.id.backupDialog_progressText, 13);
        sparseIntArray.put(R.id.backupDialog_progress, 14);
        sparseIntArray.put(R.id.backupDialog_percentage, 15);
        sparseIntArray.put(R.id.backupDialog_progressTextCus, 16);
        sparseIntArray.put(R.id.backupDialog_progressCus, 17);
        sparseIntArray.put(R.id.backupDialog_cus, 18);
        sparseIntArray.put(R.id.backup_disclaimer, 19);
        sparseIntArray.put(R.id.backupDialog_loginsLabel, 20);
        sparseIntArray.put(R.id.backupDialog_loginsListView, 21);
        sparseIntArray.put(R.id.backupDialog_listProgress, 22);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0650s(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 23, f2135O, f2136P);
        g1 g1Var = (g1) objArrK[3];
        g1 g1Var2 = (g1) objArrK[5];
        super(dVar, view, g1Var, g1Var2, (ImageView) objArrK[11], (LinearLayout) objArrK[1], (g1) objArrK[2], (TextView) objArrK[18], (TextInputLayout) objArrK[8], (ProgressBar) objArrK[22], (g1) objArrK[6], (TextView) objArrK[20], (ListView) objArrK[21], (TextView) objArrK[15], (ProgressBar) objArrK[14], (ProgressBar) objArrK[17], (TextView) objArrK[13], (TextView) objArrK[16], (LinearLayout) objArrK[9], (g1) objArrK[4], (TextView) objArrK[12], (TextView) objArrK[19], (TextView) objArrK[7]);
        this.f2137N = -1L;
        g1 g1Var3 = this.f2122r;
        if (g1Var3 != null) {
            g1Var3.j = this;
        }
        g1 g1Var4 = this.f2123s;
        if (g1Var4 != null) {
            g1Var4.j = this;
        }
        this.f2125u.setTag(null);
        g1 g1Var5 = this.f2126v;
        if (g1Var5 != null) {
            g1Var5.j = this;
        }
        g1 g1Var6 = this.f2130z;
        if (g1Var6 != null) {
            g1Var6.j = this;
        }
        g1 g1Var7 = this.f2118I;
        if (g1Var7 != null) {
            g1Var7.j = this;
        }
        ((LinearLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f2137N = 0L;
        }
        this.f2126v.e();
        this.f2122r.e();
        this.f2118I.e();
        this.f2123s.e();
        this.f2130z.e();
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                if (this.f2137N != 0) {
                    return true;
                }
                return this.f2126v.g() || this.f2122r.g() || this.f2118I.g() || this.f2123s.g() || this.f2130z.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2137N = 64L;
        }
        this.f2126v.i();
        this.f2122r.i();
        this.f2118I.i();
        this.f2123s.i();
        this.f2130z.i();
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        if (i10 == 0) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f2137N |= 1;
            }
            return true;
        }
        if (i10 == 1) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f2137N |= 2;
            }
            return true;
        }
        if (i10 == 2) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f2137N |= 4;
            }
            return true;
        }
        if (i10 == 3) {
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f2137N |= 8;
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
            this.f2137N |= 16;
        }
        return true;
    }

    @Override // M0.h
    public final void q(InterfaceC1376t interfaceC1376t) {
        super.q(interfaceC1376t);
        this.f2126v.q(interfaceC1376t);
        this.f2122r.q(interfaceC1376t);
        this.f2118I.q(interfaceC1376t);
        this.f2123s.q(interfaceC1376t);
        this.f2130z.q(interfaceC1376t);
    }
}
