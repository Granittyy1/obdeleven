package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC1376t;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: DialogEepromCodingBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends AbstractC0664z {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final M0.h.d f1604F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final SparseIntArray f1605G;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f1606E;

    static {
        M0.h.d dVar = new M0.h.d(14);
        f1604F = dVar;
        dVar.a(1, new String[]{"item_bit_checkbox", "item_bit_checkbox", "item_bit_checkbox", "item_bit_checkbox", "item_bit_checkbox", "item_bit_checkbox", "item_bit_checkbox", "item_bit_checkbox"}, new int[]{2, 3, 4, 5, 6, 7, 8, 9}, new int[]{R.layout.item_bit_checkbox, R.layout.item_bit_checkbox, R.layout.item_bit_checkbox, R.layout.item_bit_checkbox, R.layout.item_bit_checkbox, R.layout.item_bit_checkbox, R.layout.item_bit_checkbox, R.layout.item_bit_checkbox});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1605G = sparseIntArray;
        sparseIntArray.put(R.id.eeprom_dialog_title, 10);
        sparseIntArray.put(R.id.eeprom_list, 11);
        sparseIntArray.put(R.id.eeprom_coding_input_layout, 12);
        sparseIntArray.put(R.id.eeprom_coding_input, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 14, f1604F, f1605G);
        super(dVar, view, (S0) objArrK[2], (S0) objArrK[3], (S0) objArrK[4], (S0) objArrK[5], (S0) objArrK[6], (S0) objArrK[7], (S0) objArrK[8], (S0) objArrK[9], (TextInputEditText) objArrK[13], (TextInputLayout) objArrK[12], (TextView) objArrK[10], (RecyclerView) objArrK[11]);
        this.f1606E = -1L;
        S0 s10 = this.f2201r;
        if (s10 != null) {
            s10.j = this;
        }
        S0 s11 = this.f2202s;
        if (s11 != null) {
            s11.j = this;
        }
        S0 s12 = this.f2203t;
        if (s12 != null) {
            s12.j = this;
        }
        S0 s13 = this.f2204u;
        if (s13 != null) {
            s13.j = this;
        }
        S0 s14 = this.f2205v;
        if (s14 != null) {
            s14.j = this;
        }
        S0 s15 = this.f2206w;
        if (s15 != null) {
            s15.j = this;
        }
        S0 s16 = this.f2207x;
        if (s16 != null) {
            s16.j = this;
        }
        S0 s17 = this.f2208y;
        if (s17 != null) {
            s17.j = this;
        }
        ((LinearLayout) objArrK[0]).setTag(null);
        ((LinearLayout) objArrK[1]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f1606E = 0L;
        }
        this.f2201r.e();
        this.f2202s.e();
        this.f2203t.e();
        this.f2204u.e();
        this.f2205v.e();
        this.f2206w.e();
        this.f2207x.e();
        this.f2208y.e();
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                if (this.f1606E != 0) {
                    return true;
                }
                return this.f2201r.g() || this.f2202s.g() || this.f2203t.g() || this.f2204u.g() || this.f2205v.g() || this.f2206w.g() || this.f2207x.g() || this.f2208y.g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1606E = 256L;
        }
        this.f2201r.i();
        this.f2202s.i();
        this.f2203t.i();
        this.f2204u.i();
        this.f2205v.i();
        this.f2206w.i();
        this.f2207x.i();
        this.f2208y.i();
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        switch (i10) {
            case 0:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1606E |= 1;
                    break;
                }
                return true;
            case 1:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1606E |= 2;
                    break;
                }
                return true;
            case 2:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1606E |= 4;
                    break;
                }
                return true;
            case 3:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1606E |= 8;
                    break;
                }
                return true;
            case 4:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1606E |= 16;
                    break;
                }
                return true;
            case 5:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1606E |= 32;
                    break;
                }
                return true;
            case 6:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1606E |= 64;
                    break;
                }
                return true;
            case 7:
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f1606E |= 128;
                    break;
                }
                return true;
            default:
                return false;
        }
    }

    @Override // M0.h
    public final void q(InterfaceC1376t interfaceC1376t) {
        super.q(interfaceC1376t);
        this.f2201r.q(interfaceC1376t);
        this.f2202s.q(interfaceC1376t);
        this.f2203t.q(interfaceC1376t);
        this.f2204u.q(interfaceC1376t);
        this.f2205v.q(interfaceC1376t);
        this.f2206w.q(interfaceC1376t);
        this.f2207x.q(interfaceC1376t);
        this.f2208y.q(interfaceC1376t);
    }
}
