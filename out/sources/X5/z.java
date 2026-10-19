package X5;

import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.obdeleven.ui.dialogs.d1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7324c;

    public /* synthetic */ z(int i10, Object obj) {
        this.f7323b = i10;
        this.f7324c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f7323b) {
            case 0:
                A a10 = (A) this.f7324c;
                EditText editText = a10.f7221f;
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    EditText editText2 = a10.f7221f;
                    if (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        a10.f7221f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        a10.f7221f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        a10.f7221f.setSelection(selectionEnd);
                    }
                    a10.q();
                    break;
                }
                break;
            case 1:
                d1 d1Var = (d1) this.f7324c;
                d1Var.getClass();
                d1Var.w(d1Var.f33915t.isEmpty() ? "VagRedirectDialog" : d1Var.f33915t, DialogCallback.CallbackType.f31101b, new Bundle());
                break;
            default:
                p073f9.h hVar = (p073f9.h) this.f7324c;
                EditText editText3 = hVar.f35049s.f2181r.getEditText();
                String string = editText3 != null ? editText3.getText().toString() : null;
                if (!TextUtils.isEmpty(string)) {
                    hVar.f35049s.f2181r.setError("");
                    Bundle bundle = new Bundle();
                    bundle.putString("key_name", string);
                    hVar.w("ChartSaveDialog", DialogCallback.CallbackType.f31102c, bundle);
                    hVar.y();
                } else {
                    hVar.f35049s.f2181r.setError(hVar.getString(R.string.common_enter_name));
                }
                break;
        }
    }
}
