package B8;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: B8.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DialogChangeDevicePasswordBindingImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C0658w extends AbstractC0656v {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f2176x;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f2177w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2176x = sparseIntArray;
        sparseIntArray.put(R.id.password_dialog_input_title, 1);
        sparseIntArray.put(R.id.dialogChangePassword_passwordInputLayout, 2);
        sparseIntArray.put(R.id.dialogChangePassword_rptPasswordInputLayout, 3);
        sparseIntArray.put(R.id.list_buttons, 4);
        sparseIntArray.put(R.id.item_button_positive, 5);
        sparseIntArray.put(R.id.item_button_negative, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0658w(M0.d dVar, View view) {
        Object[] objArrK = M0.h.k(dVar, view, 7, null, f2176x);
        TextInputLayout textInputLayout = (TextInputLayout) objArrK[2];
        TextInputLayout textInputLayout2 = (TextInputLayout) objArrK[3];
        Button button = (Button) objArrK[6];
        Button button2 = (Button) objArrK[5];
        super(dVar, view, textInputLayout, textInputLayout2, button, button2, (TextView) objArrK[1]);
        this.f2177w = -1L;
        ((LinearLayout) objArrK[0]).setTag(null);
        r(view);
        i();
    }

    @Override // M0.h
    public final void d() {
        synchronized (this) {
            this.f2177w = 0L;
        }
    }

    @Override // M0.h
    public final boolean g() {
        synchronized (this) {
            try {
                return this.f2177w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.h
    public final void i() {
        synchronized (this) {
            this.f2177w = 1L;
        }
        n();
    }

    @Override // M0.h
    public final boolean l(int i10, int i11, Object obj) {
        return false;
    }
}
