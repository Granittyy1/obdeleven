package com.voltasit.obdeleven.ui.dialogs;

import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.parse.ParseException;
import com.parse.SaveCallback;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChangeEmailDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2172u extends M {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bundle f34027x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f34028y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p255u9.z f34029z;

    @Override // com.voltasit.obdeleven.ui.dialogs.M, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_fragment_input, viewGroup, false);
        this.f17606m.getWindow().requestFeature(1);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_input_title);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.dialog_frag_input);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.textInputLayout);
        final EditText editText2 = (EditText) viewInflate.findViewById(R.id.second_dialog_frag_input);
        final TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(R.id.second_textInputLayout);
        Button button = (Button) viewInflate.findViewById(R.id.item_button_positive);
        Button button2 = (Button) viewInflate.findViewById(R.id.item_button_negative);
        textInputLayout2.setVisibility(0);
        textInputLayout.setHint(getString(R.string.dialog_change_email_enter_new_email));
        textInputLayout2.setHint(getString(R.string.dialog_change_email_repeat_email));
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f34027x = bundle;
        if (bundle.containsKey("key_title")) {
            textView.setText(this.f34027x.getInt("key_title"));
        }
        if (this.f34027x.containsKey("key_input_type")) {
            editText.setInputType(this.f34027x.getInt("key_input_type"));
        }
        if (this.f34027x.containsKey("key_tag")) {
            this.f34028y = this.f34027x.getString("key_tag");
        }
        if (this.f34027x.containsKey("key_positive_text")) {
            button.setText(this.f34027x.getInt("key_positive_text"));
        }
        if (this.f34027x.containsKey("key_negative_text")) {
            button2.setText(this.f34027x.getInt("key_negative_text"));
        }
        if (this.f34027x.containsKey("key_user")) {
            this.f34029z = (p255u9.z) this.f34027x.getParcelable("key_user");
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.ui.dialogs.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C2172u c2172u = this.f34016b;
                c2172u.getClass();
                final TextInputLayout textInputLayout3 = textInputLayout;
                textInputLayout3.setError("");
                TextInputLayout textInputLayout4 = textInputLayout2;
                textInputLayout4.setError("");
                String email = c2172u.f34029z.getEmail();
                String string = editText.getText().toString();
                String string2 = editText2.getText().toString();
                if (string.isEmpty()) {
                    textInputLayout3.setError(c2172u.getString(R.string.dialog_change_email_email_is_required));
                    return;
                }
                if (!string2.equals(string)) {
                    textInputLayout4.setError(c2172u.getString(R.string.dialog_change_email_email_doesnt_match));
                    return;
                }
                if (!p220r9.C.a(email) && email.equals(string)) {
                    textInputLayout4.setError(c2172u.getString(R.string.dialog_change_email_your_current_email));
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(string).matches()) {
                    textInputLayout3.setError(c2172u.getString(R.string.common_invalid_email));
                    return;
                }
                c2172u.w(c2172u.f34028y.isEmpty() ? "InputDialog" : c2172u.f34028y, DialogCallback.CallbackType.f31102c, new Bundle());
                c2172u.f34029z.setEmail(string.toLowerCase());
                c2172u.f34029z.setUsername(string.toLowerCase());
                c2172u.f34029z.saveInBackground(new SaveCallback() { // from class: com.voltasit.obdeleven.ui.dialogs.t
                    @Override // com.parse.ParseCallback1
                    public final void done(Throwable th) {
                        ParseException parseException = (ParseException) th;
                        C2172u c2172u2 = c2172u;
                        if (parseException == null) {
                            p220r9.P.f(c2172u2.getActivity(), R.string.common_email_changed);
                            c2172u2.y();
                            c2172u2.z().S();
                        } else {
                            textInputLayout3.setError(p220r9.J.g(c2172u2.getActivity(), parseException));
                            c2172u2.f34029z.revert();
                        }
                    }
                });
            }
        });
        button2.setOnClickListener(new com.voltasit.obdeleven.presentation.controlUnit.w(this, 1));
        return viewInflate;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M, androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f34027x;
        if (bundle2 == null) {
            return;
        }
        bundle.putInt("key_title", bundle2.getInt("key_title"));
        bundle.putInt("key_positive_text", this.f34027x.getInt("key_positive_text"));
        bundle.putInt("key_negative_text", this.f34027x.getInt("key_negative_text"));
        bundle.putInt("key_neutral_text", this.f34027x.getInt("key_neutral_text"));
        bundle.putParcelable("key_user", this.f34027x.getParcelable("key_user"));
        bundle.putString("key_message", this.f34027x.getString("key_message"));
        bundle.putString("key_tag", this.f34027x.getString("key_tag"));
        bundle.putBundle("key_bundle", this.f34027x.getBundle("key_bundle"));
        bundle.putStringArray("item_array", this.f34027x.getStringArray("item_array"));
    }
}
