package com.voltasit.obdeleven.ui.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;

/* JADX INFO: compiled from: InputDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class M extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextInputLayout f33821s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f33822t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Bundle f33823u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextInputEditText f33824v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f33825w;

    public void B(Button button) {
        button.setOnClickListener(new com.voltasit.obdeleven.presentation.oca.f(this, 2));
    }

    public void C(final TextInputLayout textInputLayout, Button button) {
        button.setOnClickListener(new View.OnClickListener() { // from class: com.voltasit.obdeleven.ui.dialogs.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                M m7 = this.f33818b;
                String string = m7.f33824v.getText().toString();
                if (string == null || string.isEmpty()) {
                    textInputLayout.setError(m7.getString(R.string.dialog_input_input_is_empty));
                } else {
                    m7.w(m7.f33822t.isEmpty() ? "InputDialog" : m7.f33822t, DialogCallback.CallbackType.f31102c, C4.v.d("key_input", string));
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_fragment_input, viewGroup, false);
        this.f17606m.getWindow().requestFeature(1);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_input_title);
        this.f33824v = (TextInputEditText) viewInflate.findViewById(R.id.dialog_frag_input);
        this.f33825w = (TextView) viewInflate.findViewById(R.id.dialog_input_message);
        this.f33821s = (TextInputLayout) viewInflate.findViewById(R.id.textInputLayout);
        Button button = (Button) viewInflate.findViewById(R.id.item_button_positive);
        Button button2 = (Button) viewInflate.findViewById(R.id.item_button_negative);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f33823u = bundle;
        if (bundle.containsKey("key_title")) {
            textView.setText(this.f33823u.getInt("key_title"));
        } else if (this.f33823u.containsKey("key_title_string")) {
            textView.setText(this.f33823u.getString("key_title_string"));
        }
        if (this.f33823u.containsKey("key_enabled")) {
            this.f33821s.setEnabled(this.f33823u.getBoolean("key_enabled"));
        }
        if (this.f33823u.containsKey("key_input_type")) {
            this.f33824v.setInputType(this.f33823u.getInt("key_input_type"));
        }
        if (this.f33823u.containsKey("key_input_hint_str") && this.f33823u.containsKey("key_hint_above_text")) {
            if (this.f33823u.getBoolean("key_hint_above_text")) {
                this.f33821s.setHint(this.f33823u.getString("key_input_hint_str"));
            } else {
                this.f33824v.setHint(this.f33823u.getString("key_input_hint_str"));
            }
        }
        if (this.f33823u.containsKey("key_input_hint_res") && this.f33823u.containsKey("key_hint_above_text")) {
            if (this.f33823u.getBoolean("key_hint_above_text")) {
                this.f33821s.setHint(getString(this.f33823u.getInt("key_input_hint_res")));
            } else {
                this.f33824v.setHint(getString(this.f33823u.getInt("key_input_hint_res")));
            }
        }
        if (this.f33823u.containsKey("key_tag")) {
            this.f33822t = this.f33823u.getString("key_tag");
        }
        if (this.f33823u.containsKey("key_positive_text")) {
            button.setText(this.f33823u.getInt("key_positive_text"));
        }
        if (this.f33823u.containsKey("key_negative_text")) {
            button2.setText(this.f33823u.getInt("key_negative_text"));
        }
        if (this.f33823u.containsKey("key_message")) {
            this.f33825w.setVisibility(0);
            this.f33825w.setText(this.f33823u.getInt("key_message"));
        }
        if (this.f33823u.containsKey("key_counter_max")) {
            this.f33821s.setCounterEnabled(true);
            this.f33821s.setCounterMaxLength(this.f33823u.getInt("key_counter_max"));
            InputFilter[] filters = this.f33824v.getFilters();
            InputFilter[] inputFilterArr = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, inputFilterArr, 0, filters.length);
            inputFilterArr[filters.length] = new InputFilter.LengthFilter(this.f33823u.getInt("key_counter_max"));
            this.f33824v.setFilters(inputFilterArr);
        }
        C(this.f33821s, button);
        B(button2);
        return viewInflate;
    }

    @Override // com.voltasit.obdeleven.presentation.dialogs.e, androidx.fragment.app.Fragment
    public final void onDestroy() {
        TextInputEditText textInputEditText = this.f33824v;
        if (textInputEditText != null) {
            textInputEditText.setCursorVisible(false);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f33823u;
        if (bundle2 == null) {
            return;
        }
        bundle.putInt("key_title", bundle2.getInt("key_title"));
        bundle.putInt("key_positive_text", this.f33823u.getInt("key_positive_text"));
        bundle.putInt("key_negative_text", this.f33823u.getInt("key_negative_text"));
        bundle.putInt("key_neutral_text", this.f33823u.getInt("key_neutral_text"));
        bundle.putInt("key_checked_position", this.f33823u.getInt("key_checked_position"));
        bundle.putString("key_message", this.f33823u.getString("key_message"));
        bundle.putString("key_tag", this.f33823u.getString("key_tag"));
        bundle.putBundle("key_bundle", this.f33823u.getBundle("key_bundle"));
        bundle.putStringArray("item_array", this.f33823u.getStringArray("item_array"));
        bundle.putInt("key_counter_max", this.f33823u.getInt("key_counter_max"));
        bundle.putInt("key_input_hint_res", this.f33823u.getInt("key_input_hint_res"));
        bundle.putString("key_input_hint_str", this.f33823u.getString("key_input_hint_str"));
        bundle.putBoolean("key_hint_above_text", this.f33823u.getBoolean("key_hint_above_text"));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Dialog dialogR = super.r(bundle);
        dialogR.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.voltasit.obdeleven.ui.dialogs.K
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                M m7 = this.f33817b;
                if (i10 == 4) {
                    TextInputEditText textInputEditText = m7.f33824v;
                    if (textInputEditText != null) {
                        textInputEditText.setCursorVisible(false);
                    }
                    m7.y();
                } else {
                    m7.getClass();
                }
                return false;
            }
        });
        return dialogR;
    }
}
