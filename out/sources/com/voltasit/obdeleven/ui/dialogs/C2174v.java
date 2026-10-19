package com.voltasit.obdeleven.ui.dialogs;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DeleteAccountDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2174v extends M {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bundle f34047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f34048y;

    @Override // com.voltasit.obdeleven.ui.dialogs.M, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_delete_account, viewGroup, false);
        this.f17606m.getWindow().requestFeature(1);
        TextView textView = (TextView) viewInflate.findViewById(R.id.delete_account_dialog_title);
        EditText editText = (EditText) viewInflate.findViewById(R.id.input);
        Button button = (Button) viewInflate.findViewById(R.id.delete_account_positive);
        Button button2 = (Button) viewInflate.findViewById(R.id.delete_account_negative);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f34047x = bundle;
        if (bundle.containsKey("key_title")) {
            textView.setText(this.f34047x.getInt("key_title"));
        }
        if (this.f34047x.containsKey("key_input_type")) {
            editText.setInputType(this.f34047x.getInt("key_input_type"));
        }
        if (this.f34047x.containsKey("key_tag")) {
            this.f34048y = this.f34047x.getString("key_tag");
        }
        if (this.f34047x.containsKey("key_positive_text")) {
            button.setText(this.f34047x.getInt("key_positive_text"));
        }
        if (this.f34047x.containsKey("key_negative_text")) {
            button2.setText(this.f34047x.getInt("key_negative_text"));
        }
        button.setEnabled(false);
        editText.addTextChangedListener(new a(button));
        button.setOnClickListener(new com.voltasit.obdeleven.presentation.profile.g(2, this));
        button2.setOnClickListener(new com.voltasit.obdeleven.presentation.profile.h(1, this));
        return viewInflate;
    }

    @Override // com.voltasit.obdeleven.ui.dialogs.M, androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f34047x;
        if (bundle2 == null) {
            return;
        }
        bundle.putInt("key_title", bundle2.getInt("key_title"));
        bundle.putInt("key_positive_text", this.f34047x.getInt("key_positive_text"));
        bundle.putInt("key_negative_text", this.f34047x.getInt("key_negative_text"));
        bundle.putInt("key_neutral_text", this.f34047x.getInt("key_neutral_text"));
        bundle.putString("key_message", this.f34047x.getString("key_message"));
        bundle.putString("key_tag", this.f34047x.getString("key_tag"));
        bundle.putBundle("key_bundle", this.f34047x.getBundle("key_bundle"));
        bundle.putStringArray("item_array", this.f34047x.getStringArray("item_array"));
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.v$a */
    /* JADX INFO: compiled from: DeleteAccountDialog.java */
    public class a implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Button f34049b;

        public a(Button button) {
            this.f34049b = button;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            this.f34049b.setEnabled(editable.toString().equals("DELETE"));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
