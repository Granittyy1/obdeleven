package com.voltasit.obdeleven.ui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;

/* JADX INFO: compiled from: EditTextDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class E extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f33775s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f33776t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f33777u;

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f33775s;
        if (bundle2 == null) {
            return;
        }
        bundle.putString("key_title", bundle2.getString("key_title"));
        bundle.putString("key_value", this.f33775s.getString("key_value"));
        bundle.putBundle("key_bundle", this.f33775s.getBundle("key_bundle"));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f33775s = bundle;
        if (bundle == null) {
            return new AlertDialog.Builder(getActivity()).create();
        }
        if (bundle.containsKey("key_title")) {
            this.f33776t = this.f33775s.getString("key_title");
        }
        if (this.f33775s.containsKey("key_value")) {
            this.f33777u = this.f33775s.getString("key_value");
        }
        final EditText editText = new EditText(z());
        String str = this.f33777u;
        if (str == null) {
            str = "";
        }
        editText.setText(str);
        return new AlertDialog.Builder(getActivity()).setTitle(this.f33776t).setView(editText).setPositiveButton(R.string.common_save, new DialogInterface.OnClickListener() { // from class: com.voltasit.obdeleven.ui.dialogs.D
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                E e10 = this.f33772b;
                e10.getClass();
                Bundle bundle2 = new Bundle();
                if (e10.f33775s.containsKey("key_bundle")) {
                    bundle2.putBundle("key_bundle", e10.f33775s.getBundle("key_bundle"));
                }
                String string = editText.getText().toString();
                if (TextUtils.isEmpty(string)) {
                    string = e10.getString(R.string.common_unknown);
                }
                bundle2.putString("key_new_value", string);
                e10.w("EditTextDialog", DialogCallback.CallbackType.f31102c, bundle2);
            }
        }).setNegativeButton(R.string.common_cancel, new com.voltasit.obdeleven.presentation.twofactorauth.backupCode.a(this, 1)).create();
    }
}
