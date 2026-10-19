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
import com.voltasit.obdeleven.R;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ChangeCarNameDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2161o extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f33995s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public EditText f33996t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public EditText f33997u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p255u9.E f33998v;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_car_name, viewGroup, false);
        this.f17606m.getWindow().requestFeature(1);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_input_title);
        this.f33996t = (EditText) viewInflate.findViewById(R.id.carNameDialog_makeInput);
        this.f33997u = (EditText) viewInflate.findViewById(R.id.carNameDialog_modelInput);
        Button button = (Button) viewInflate.findViewById(R.id.item_button_positive);
        Button button2 = (Button) viewInflate.findViewById(R.id.item_button_negative);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f33995s = bundle;
        if (bundle.containsKey("key_title")) {
            textView.setText(this.f33995s.getInt("key_title"));
        }
        if (this.f33995s.containsKey("key_positive_text")) {
            button.setText(this.f33995s.getInt("key_positive_text"));
        }
        if (this.f33995s.containsKey("key_negative_text")) {
            button2.setText(this.f33995s.getInt("key_negative_text"));
        }
        if (this.f33995s.containsKey("key_bundle") && (bundle2 = this.f33995s.getBundle("key_bundle")) != null) {
            p255u9.E e10 = (p255u9.E) bundle2.getParcelable("key_vehicle_db");
            this.f33998v = e10;
            this.f33996t.setText(e10.d());
            this.f33997u.setText(this.f33998v.e());
        }
        button.setOnClickListener(new X5.n(1, this));
        button2.setOnClickListener(new com.voltasit.obdeleven.presentation.controlUnit.u(3, this));
        return viewInflate;
    }

    @Override // com.voltasit.obdeleven.presentation.dialogs.e, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EditText editText = this.f33996t;
        if (editText != null) {
            editText.setCursorVisible(false);
        }
        EditText editText2 = this.f33997u;
        if (editText2 != null) {
            editText2.setCursorVisible(false);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f33995s;
        if (bundle2 == null) {
            return;
        }
        bundle.putInt("key_title", bundle2.getInt("key_title"));
        bundle.putInt("key_positive_text", this.f33995s.getInt("key_positive_text"));
        bundle.putInt("key_negative_text", this.f33995s.getInt("key_negative_text"));
        bundle.putString("key_message", this.f33995s.getString("key_message"));
        bundle.putString("key_tag", this.f33995s.getString("key_tag"));
        bundle.putBundle("key_bundle", this.f33995s.getBundle("key_bundle"));
        bundle.putStringArray("item_array", this.f33995s.getStringArray("item_array"));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Dialog dialogR = super.r(bundle);
        dialogR.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.voltasit.obdeleven.ui.dialogs.n
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                C2161o c2161o = this.f33993b;
                if (i10 == 4) {
                    EditText editText = c2161o.f33996t;
                    if (editText != null) {
                        editText.setCursorVisible(false);
                    }
                    EditText editText2 = c2161o.f33997u;
                    if (editText2 != null) {
                        editText2.setCursorVisible(false);
                    }
                    c2161o.y();
                } else {
                    c2161o.getClass();
                }
                return false;
            }
        });
        return dialogR;
    }
}
