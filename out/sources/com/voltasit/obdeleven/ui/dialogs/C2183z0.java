package com.voltasit.obdeleven.ui.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ReportErrorDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2183z0 extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f34065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f34066t;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_fragment_input, viewGroup, false);
        if (this.f17606m.getWindow() != null) {
            this.f17606m.getWindow().requestFeature(1);
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_input_title);
        this.f34066t = (EditText) viewInflate.findViewById(R.id.dialog_frag_input);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.textInputLayout);
        Button button = (Button) viewInflate.findViewById(R.id.item_button_positive);
        Button button2 = (Button) viewInflate.findViewById(R.id.item_button_negative);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f34065s = bundle;
        if (bundle != null && bundle.containsKey("key_title")) {
            textView.setText(this.f34065s.getInt("key_title"));
        }
        Bundle bundle2 = this.f34065s;
        if (bundle2 != null && bundle2.containsKey("key_input_type")) {
            this.f34066t.setInputType(this.f34065s.getInt("key_input_type"));
        }
        Bundle bundle3 = this.f34065s;
        if (bundle3 != null && bundle3.containsKey("key_input_hint")) {
            textInputLayout.setHint(getString(this.f34065s.getInt("key_input_hint")));
        }
        Bundle bundle4 = this.f34065s;
        if (bundle4 != null && bundle4.containsKey("key_positive_text")) {
            button.setText(this.f34065s.getInt("key_positive_text"));
        }
        Bundle bundle5 = this.f34065s;
        if (bundle5 != null && bundle5.containsKey("key_negative_text")) {
            button2.setText(this.f34065s.getInt("key_negative_text"));
        }
        button.setOnClickListener(new ViewOnClickListenerC2181y0(this, 0, textInputLayout));
        button2.setOnClickListener(new ViewOnClickListenerC2163p(2, this));
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f34065s;
        if (bundle2 == null) {
            return;
        }
        bundle.putInt("key_title", bundle2.getInt("key_title"));
        bundle.putInt("key_positive_text", this.f34065s.getInt("key_positive_text"));
        bundle.putInt("key_negative_text", this.f34065s.getInt("key_negative_text"));
        bundle.putInt("key_input_type", this.f34065s.getInt("key_input_type"));
        bundle.putInt("key_input_hint", this.f34065s.getInt("key_input_hint"));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Dialog dialogR = super.r(bundle);
        dialogR.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.voltasit.obdeleven.ui.dialogs.x0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                C2183z0 c2183z0 = this.f34054b;
                if (i10 == 4) {
                    EditText editText = c2183z0.f34066t;
                    if (editText != null) {
                        editText.setCursorVisible(false);
                    }
                    c2183z0.y();
                } else {
                    c2183z0.getClass();
                }
                return false;
            }
        });
        return dialogR;
    }
}
