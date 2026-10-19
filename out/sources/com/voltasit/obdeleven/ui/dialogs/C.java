package com.voltasit.obdeleven.ui.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: DeviceAlertDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f33766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f33767t;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_device_alert, viewGroup, false);
        this.f17606m.getWindow().requestFeature(1);
        TextView textView = (TextView) viewInflate.findViewById(R.id.content);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.device_alert_title);
        Button button = (Button) viewInflate.findViewById(R.id.simple_button_positive);
        Button button2 = (Button) viewInflate.findViewById(R.id.simple_button_negative);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.checkbox);
        textView2.setText(R.string.common_device_alert);
        textView.setText(R.string.common_device_left_in_car);
        checkBox.setText(R.string.common_do_not_show_again);
        button.setText(R.string.common_ok);
        button2.setText(R.string.common_cancel);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f33766s = bundle;
        if (bundle.containsKey("key_finish")) {
            this.f33767t = this.f33766s.getBoolean("key_finish");
        }
        button.setOnClickListener(new com.braze.ui.widget.c(this, 3, checkBox));
        button2.setOnClickListener(new com.voltasit.obdeleven.presentation.controlUnit.i(2, this));
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f33766s;
        if (bundle2 == null) {
            return;
        }
        bundle.putBoolean("key_finish", bundle2.getBoolean("key_finish"));
    }
}
