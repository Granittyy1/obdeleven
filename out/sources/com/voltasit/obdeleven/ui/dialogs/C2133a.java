package com.voltasit.obdeleven.ui.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.R;
import java.util.Locale;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AddVehicleDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2133a extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextInputEditText f33881s;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AddVehicleDialog.java */
    public class C0348a extends InputFilter.LengthFilter {
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_add_vehicle, viewGroup, false);
        this.f17606m.getWindow().requestFeature(1);
        this.f17606m.getWindow().setBackgroundDrawable(null);
        this.f33881s = (TextInputEditText) viewInflate.findViewById(R.id.add_vehicle_input);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.add_vehicle_layout);
        Button button = (Button) viewInflate.findViewById(R.id.add_vehicle_ok);
        Button button2 = (Button) viewInflate.findViewById(R.id.add_vehicle_cancel);
        this.f33881s.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new C0348a(17)});
        this.f33881s.addTextChangedListener(new b(textInputLayout));
        button.setOnClickListener(new com.braze.ui.widget.c(this, 2, textInputLayout));
        button2.setOnClickListener(new com.voltasit.obdeleven.presentation.controlUnit.i(1, this));
        return viewInflate;
    }

    @Override // com.voltasit.obdeleven.presentation.dialogs.e, androidx.fragment.app.Fragment
    public final void onDestroy() {
        TextInputEditText textInputEditText = this.f33881s;
        if (textInputEditText != null) {
            textInputEditText.setCursorVisible(false);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Dialog dialogR = super.r(bundle);
        dialogR.setOnKeyListener(new com.voltasit.obdeleven.presentation.main.a(this, 1));
        return dialogR;
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.a$b */
    /* JADX INFO: compiled from: AddVehicleDialog.java */
    public class b implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f33882b;

        public b(TextInputLayout textInputLayout) {
            this.f33882b = textInputLayout;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            int length = editable.toString().length();
            TextInputLayout textInputLayout = this.f33882b;
            if (length < 17) {
                Locale locale = Locale.US;
                String str = editable.toString().length() + " / 17";
                textInputLayout.setErrorEnabled(true);
                textInputLayout.setErrorTextAppearance(R.style.CounterStyleRed);
                textInputLayout.setError(str);
                return;
            }
            Locale locale2 = Locale.US;
            String str2 = editable.toString().length() + " / 17";
            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError(str2);
            textInputLayout.setErrorTextAppearance(R.style.CounterStyleBlue);
            textInputLayout.requestFocus();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
