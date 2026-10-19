package com.voltasit.obdeleven.ui.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: SimpleDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class I0 extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f33793s = "";

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        B8.J j = (B8.J) M0.e.a(layoutInflater, R.layout.dialog_simple, null, false, null);
        this.f17606m.getWindow().requestFeature(1);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle.containsKey("key_tag")) {
            this.f33793s = bundle.getString("key_tag");
        }
        if (bundle.containsKey("key_title")) {
            j.f1726s.setText(bundle.getInt("key_title"));
        }
        if (bundle.containsKey("key_positive_text")) {
            j.f1729v.setText(bundle.getInt("key_positive_text"));
        }
        if (bundle.containsKey("key_negative_text")) {
            j.f1727t.setText(bundle.getInt("key_negative_text"));
        }
        if (bundle.containsKey("key_neutral_text")) {
            j.f1728u.setText(bundle.getInt("key_neutral_text"));
        }
        if (bundle.containsKey("key_message_res")) {
            j.f1725r.setText(bundle.getInt("key_message_res"));
        } else if (bundle.containsKey("key_message")) {
            j.f1725r.setText(bundle.getString("key_message"));
        }
        j.f1729v.setOnClickListener(new com.google.android.material.datepicker.p(this, 4));
        j.f1727t.setOnClickListener(new H0(0, this));
        j.f1728u.setOnClickListener(new com.voltasit.obdeleven.presentation.controlUnit.h(this, 2));
        return j.f4488d;
    }
}
