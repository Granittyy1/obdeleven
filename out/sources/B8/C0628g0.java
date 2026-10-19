package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlUnit.eeprom.EepromFragment;

/* JADX INFO: renamed from: B8.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FragmentInputEepromBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0628g0 extends AbstractC0626f0 implements N8.b.a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final SparseIntArray f1920B;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f1921A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final N8.b f1922z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1920B = sparseIntArray;
        sparseIntArray.put(R.id.eeprom_nested_scroll, 2);
        sparseIntArray.put(R.id.eeprom_inputs, 3);
        sparseIntArray.put(R.id.eeprom_address, 4);
        sparseIntArray.put(R.id.eeprom_byte_length, 5);
        sparseIntArray.put(R.id.eeprom_lfid, 6);
        sparseIntArray.put(R.id.eeprom_content_card, 7);
        sparseIntArray.put(R.id.eeprom_textView, 8);
        sparseIntArray.put(R.id.eeprom_result, 9);
        sparseIntArray.put(R.id.eeprom_list, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0628g0(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 11, null, f1920B);
        TextInputEditText textInputEditText = (TextInputEditText) objArrK[4];
        TextInputEditText textInputEditText2 = (TextInputEditText) objArrK[5];
        LinearLayout linearLayout = (LinearLayout) objArrK[7];
        FloatingActionButton floatingActionButton = (FloatingActionButton) objArrK[1];
        LinearLayout linearLayout2 = (LinearLayout) objArrK[3];
        TextInputEditText textInputEditText3 = (TextInputEditText) objArrK[6];
        RecyclerView recyclerView = (RecyclerView) objArrK[10];
        super(dVar, view, textInputEditText, textInputEditText2, linearLayout, floatingActionButton, linearLayout2, textInputEditText3, recyclerView);
        this.f1921A = -1L;
        this.f1911u.setTag(null);
        ((RelativeLayout) objArrK[0]).setTag(null);
        r(view);
        this.f1922z = new N8.b(this, 1);
        i();
    }

    @Override // N8.b.a
    public final void a(int i10) {
        EepromFragment eepromFragment = this.f1915y;
        if (eepromFragment != null) {
            if (eepromFragment.f31551x) {
                eepromFragment.Q();
            } else {
                eepromFragment.G(R.string.common_press_and_hold);
            }
        }
    }

    @Override // M0.h
    public final void d() {
        long j;
        synchronized (this) {
            j = this.f1921A;
            this.f1921A = 0L;
        }
        if ((j & 2) != 0) {
            this.f1911u.setOnClickListener(this.f1922z);
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f1921A != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f1921A = 2L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }

    @Override // B8.AbstractC0626f0
    public final void t(EepromFragment eepromFragment) {
        this.f1915y = eepromFragment;
        synchronized (this) {
            this.f1921A |= 1;
        }
        c(33);
        n();
    }
}
