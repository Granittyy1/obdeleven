package com.voltasit.obdeleven.presentation.signIn;

import android.app.Activity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.google.android.material.textfield.TextInputLayout;
import com.parse.ParseUser;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;

/* JADX INFO: compiled from: RecoverFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends Fragment implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextInputLayout f33223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EditText f33224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0345a f33225d;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.signIn.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RecoverFragment.java */
    public interface InterfaceC0345a {
        void c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof InterfaceC0345a)) {
            throw new IllegalArgumentException("Activity must implemement ParseOnLoginHelpSuccessListener");
        }
        this.f33225d = (InterfaceC0345a) activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strTrim = this.f33224c.getText().toString().trim();
        if (strTrim.isEmpty()) {
            this.f33223b.setError(getString(R.string.common_please_enter_email));
        } else {
            if (!Patterns.EMAIL_ADDRESS.matcher(strTrim).matches()) {
                this.f33223b.setError(getString(R.string.common_email_invalid));
                return;
            }
            this.f33223b.setError("");
            C2134a0.b(getContext(), R.string.common_loading);
            ParseUser.requestPasswordResetInBackground(strTrim, new S6.k(6, this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_recover, viewGroup, false);
        this.f33223b = (TextInputLayout) viewInflate.findViewById(R.id.recoverFragment_emailInputLayout);
        this.f33224c = (EditText) viewInflate.findViewById(R.id.recoverFragment_emailInput);
        Button button = (Button) viewInflate.findViewById(R.id.recoverFragment_signin);
        this.f33224c.setText(getArguments().getString("com.voltasit.obdeleven.login.EMAIL"));
        button.setOnClickListener(this);
        return viewInflate;
    }
}
