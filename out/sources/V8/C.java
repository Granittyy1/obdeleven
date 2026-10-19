package V8;

import android.text.InputFilter;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.internal.MDButton;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.view.FloatingEditText;
import java.util.Locale;

/* JADX INFO: compiled from: SubsystemLongCodingFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C extends MaterialDialog.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f6743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f6744b;

    public C(D d10, boolean z10) {
        this.f6744b = d10;
        this.f6743a = z10;
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.b
    public final void a(MaterialDialog materialDialog) {
        materialDialog.dismiss();
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.b
    public final void b(MaterialDialog materialDialog) {
        FloatingEditText floatingEditText = (FloatingEditText) materialDialog.f34552b.findViewById(R.id.editText);
        MDButton mDButtonC = materialDialog.c(DialogAction.f23185c);
        String string = floatingEditText.getText().toString();
        String string2 = mDButtonC.getText().toString();
        if (this.f6743a) {
            floatingEditText.setFilters(new InputFilter[0]);
            if (string2.equals("ASCII")) {
                try {
                    floatingEditText.setHint(R.string.common_value);
                    floatingEditText.setText(kotlin.jvm.internal.n.d(string));
                    mDButtonC.setText("HEX");
                } catch (NumberFormatException unused) {
                    floatingEditText.c(R.string.common_wrong_value);
                }
            } else {
                floatingEditText.setHint("00 - FF HEX");
                floatingEditText.setText(kotlin.jvm.internal.n.e(string));
                mDButtonC.setText("ASCII");
            }
        } else if (string2.equals("DEC")) {
            floatingEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            floatingEditText.setHint("0 - 255 DEC");
            floatingEditText.setInputType(2);
            if (!string.isEmpty()) {
                try {
                    Locale locale = Locale.US;
                    int i10 = Integer.parseInt(string, 16);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10);
                    floatingEditText.setText(sb2.toString());
                } catch (NumberFormatException unused2) {
                    floatingEditText.setText("");
                }
            }
            mDButtonC.setText("HEX");
        } else {
            floatingEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2)});
            floatingEditText.setHint("00 - FF HEX");
            floatingEditText.setInputType(1);
            if (!string.isEmpty()) {
                floatingEditText.setText(String.format(Locale.US, "%02X", Integer.valueOf(Integer.parseInt(string, 10))));
            }
            mDButtonC.setText("DEC");
        }
        floatingEditText.setSelection(floatingEditText.getText().length());
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.b
    public final void c(MaterialDialog materialDialog) {
        FloatingEditText floatingEditText = (FloatingEditText) materialDialog.f34552b.findViewById(R.id.editText);
        String string = floatingEditText.getText().toString();
        String string2 = materialDialog.c(DialogAction.f23185c).getText().toString();
        boolean z10 = this.f6743a;
        D d10 = this.f6744b;
        if (!z10) {
            try {
                d10.f6760x.f41191e.f(d10.f6745A, Integer.parseInt(string, string2.equals("HEX") ? 10 : 16));
                d10.X(d10.f6745A);
                materialDialog.dismiss();
                return;
            } catch (NumberFormatException unused) {
                floatingEditText.c(R.string.common_wrong_value);
                return;
            }
        }
        if (string2.equals("HEX")) {
            string = kotlin.jvm.internal.n.e(string);
        }
        if (string.length() / 2 != d10.f6760x.getItemCount() || !string.matches("^([0-9a-fA-F]{2})+")) {
            floatingEditText.c(R.string.common_wrong_value);
            return;
        }
        d10.f6760x.f41191e.f42831c = string;
        d10.X(d10.f6745A);
        materialDialog.dismiss();
    }
}
