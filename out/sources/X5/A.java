package X5;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: PasswordToggleEndIconDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EditText f7221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z f7222g;

    public A(com.google.android.material.textfield.a aVar, int i10) {
        super(aVar);
        this.f7220e = R.drawable.design_password_eye;
        this.f7222g = new z(0, this);
        if (i10 != 0) {
            this.f7220e = i10;
        }
    }

    @Override // X5.s
    public final void b() {
        q();
    }

    @Override // X5.s
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // X5.s
    public final int d() {
        return this.f7220e;
    }

    @Override // X5.s
    public final View.OnClickListener f() {
        return this.f7222g;
    }

    @Override // X5.s
    public final boolean k() {
        return true;
    }

    @Override // X5.s
    public final boolean l() {
        EditText editText = this.f7221f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // X5.s
    public final void m(EditText editText) {
        this.f7221f = editText;
        q();
    }

    @Override // X5.s
    public final void r() {
        EditText editText = this.f7221f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f7221f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // X5.s
    public final void s() {
        EditText editText = this.f7221f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
