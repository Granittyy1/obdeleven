package com.voltasit.obdeleven.ui.dialogs;

import B8.AbstractC0656v;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: ChangeDevicePasswordDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class r extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f34014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AbstractC0656v f34015t;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f34015t = (AbstractC0656v) M0.e.a(layoutInflater, R.layout.dialog_change_device_password, viewGroup, false, null);
        this.f17606m.getWindow().requestFeature(1);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f34014s = bundle;
        this.f34015t.f2168r.getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        this.f34015t.f2169s.getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        if (this.f34014s.containsKey("key_title")) {
            this.f34015t.f2172v.setText(this.f34014s.getInt("key_title"));
        }
        if (this.f34014s.containsKey("key_positive_text")) {
            this.f34015t.f2171u.setText(this.f34014s.getInt("key_positive_text"));
        }
        if (this.f34014s.containsKey("key_negative_text")) {
            this.f34015t.f2170t.setText(this.f34014s.getInt("key_negative_text"));
        }
        this.f34015t.f2171u.setOnClickListener(new ViewOnClickListenerC2163p(0, this));
        this.f34015t.f2170t.setOnClickListener(new ViewOnClickListenerC2165q(this, 0));
        return this.f34015t.f4488d;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f34014s;
        if (bundle2 == null) {
            return;
        }
        bundle.putInt("key_title", bundle2.getInt("key_title"));
        bundle.putInt("key_positive_text", this.f34014s.getInt("key_positive_text"));
        bundle.putInt("key_negative_text", this.f34014s.getInt("key_negative_text"));
        bundle.putString("key_tag", this.f34014s.getString("key_tag"));
        bundle.putBundle("key_bundle", this.f34014s.getBundle("key_bundle"));
    }
}
