package com.voltasit.obdeleven.presentation.main;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.datepicker.p;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: BatteryVoltageDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f32623s;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_battery_voltage, viewGroup, false);
        this.f17606m.getWindow().requestFeature(1);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_title);
        Button button = (Button) viewInflate.findViewById(R.id.dialog_positive_button);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f32623s = bundle;
        if (bundle.containsKey("key_title")) {
            textView.setText(this.f32623s.getInt("key_title"));
        }
        if (this.f32623s.containsKey("key_positive_text")) {
            button.setText(this.f32623s.getInt("key_positive_text"));
        }
        button.setOnClickListener(new p(this, 2));
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f32623s;
        if (bundle2 == null) {
            return;
        }
        bundle.putInt("key_title", bundle2.getInt("key_title"));
        bundle.putInt("key_positive_text", this.f32623s.getInt("key_positive_text"));
        bundle.putString("key_tag", this.f32623s.getString("key_tag"));
    }

    @Override // com.voltasit.obdeleven.presentation.dialogs.e, androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.f17606m.getWindow() == null) {
            return;
        }
        if (z().E()) {
            this.f17606m.getWindow().setLayout(getContext().getResources().getDimensionPixelSize(R.dimen.default_dialog_width), -2);
        } else {
            this.f17606m.getWindow().setLayout(-1, -2);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Dialog dialogR = super.r(bundle);
        dialogR.setOnKeyListener(new a(this, 0));
        return dialogR;
    }
}
