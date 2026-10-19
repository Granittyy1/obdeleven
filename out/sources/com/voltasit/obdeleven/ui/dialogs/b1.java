package com.voltasit.obdeleven.ui.dialogs;

import android.view.View;
import android.widget.Button;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.exceptions.TextualDataInputLengthInvalidException;
import java.util.Locale;

/* JADX INFO: compiled from: UdsDataInputDialogFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class b1 extends M {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.f f33908x;

    @Override // com.voltasit.obdeleven.ui.dialogs.M
    public final void B(Button button) {
        button.setOnClickListener(new ViewOnClickListenerC2165q(this, 1));
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M
    public final void C(final TextInputLayout textInputLayout, final Button button) {
        button.setOnClickListener(new View.OnClickListener(textInputLayout, button) { // from class: com.voltasit.obdeleven.ui.dialogs.a1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TextInputLayout f33885c;

            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, xa.g] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.f fVar;
                b1 b1Var = this.f33884b;
                if (b1Var.f33823u.containsKey("key_enabled")) {
                    if (!b1Var.f33823u.getBoolean("key_enabled") || (fVar = b1Var.f33908x) == null) {
                        b1Var.y();
                        return;
                    }
                    Param param = fVar.f31911c;
                    b1 b1Var2 = fVar.f31912d;
                    int i10 = fVar.f31913e;
                    com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.h hVar = fVar.f31909a;
                    hVar.getClass();
                    TextInputLayout textInputLayout2 = this.f33885c;
                    TextInputEditText textInputEditText = (TextInputEditText) textInputLayout2.getEditText();
                    String string = textInputEditText.getText().toString();
                    com.voltasit.obdeleven.domain.usecases.odx.e eVar = (com.voltasit.obdeleven.domain.usecases.odx.e) hVar.f31918D.getValue();
                    DATAOBJECTPROP dataobjectprop = fVar.f31910b;
                    C8.a aVarA = eVar.a(dataobjectprop, string);
                    if (aVarA instanceof C8.a.C0024a) {
                        Throwable th = ((C8.a.C0024a) aVarA).f2462a;
                        if (th instanceof TextualDataInputLengthInvalidException) {
                            Locale locale = Locale.US;
                            textInputLayout2.setError(hVar.getString(R.string.common_value_length_must_be) + " " + ((TextualDataInputLengthInvalidException) th).a());
                            return;
                        }
                    }
                    try {
                        com.obdeleven.service.odx.a aVarPhysicalToInternal = dataobjectprop.physicalToInternal(string);
                        param.f29454b = aVarPhysicalToInternal.f29475a;
                        param.f29465n = aVarPhysicalToInternal.f29476b;
                        param.f29459g = string;
                        b1Var2.y();
                        hVar.f31926r.notifyItemChanged(i10);
                        D9.o.m(textInputEditText);
                    } catch (Exception unused) {
                        textInputLayout2.setError(hVar.getText(R.string.common_wrong_value));
                    }
                }
            }
        });
    }
}
