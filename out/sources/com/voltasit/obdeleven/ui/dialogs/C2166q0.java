package com.voltasit.obdeleven.ui.dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1347l;
import androidx.media3.exoplayer.C1406y;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.view.FloatingEditText;
import com.voltasit.parse.model.ControlUnitLabelDB;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NumberLabelDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class C2166q0 extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f34006s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f34007t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f34008u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ControlUnit f34009v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ControlUnitLabelDB.Type f34010w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f34011x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public B8.D f34012y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayAdapter<String> f34013z;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = 2;
        this.f34012y = (B8.D) M0.e.a(layoutInflater, R.layout.dialog_number_label, viewGroup, false, null);
        ActivityC1347l activity = getActivity();
        if (activity == null) {
            y();
            return this.f34012y.f4488d;
        }
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle != null && bundle.containsKey("key_title") && bundle.containsKey("key_min") && bundle.containsKey("key_max") && bundle.containsKey("key_type")) {
            this.f34006s = bundle.getInt("key_title");
            this.f34007t = bundle.getInt("key_min");
            this.f34008u = bundle.getInt("key_max");
            String string = bundle.getString("key_type");
            if (string != null) {
                this.f34010w = ControlUnitLabelDB.Type.valueOf(string);
            }
            if (this.f34010w != null && this.f34009v != null) {
                this.f34013z = new ArrayAdapter<>(activity, android.R.layout.simple_spinner_dropdown_item);
                this.f34012y.f1639w.setText(this.f34006s);
                this.f34012y.f1638v.setAdapter((SpinnerAdapter) this.f34013z);
                this.f34013z.add(getString(R.string.common_loading));
                this.f34012y.f1638v.setEnabled(false);
                this.f34009v.m0(this.f34010w, new C1406y(this));
                this.f34012y.f1635s.setOnClickListener(new com.facebook.login.d(this, 4));
                this.f34012y.f1634r.setOnClickListener(new com.voltasit.obdeleven.presentation.twofactorauth.verify.c(i10, this));
                this.f34012y.f1636t.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.voltasit.obdeleven.ui.dialogs.o0
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                        C2166q0 c2166q0 = this.f33999a;
                        if (i11 == 6) {
                            c2166q0.f34012y.f1635s.callOnClick();
                            return true;
                        }
                        c2166q0.getClass();
                        return false;
                    }
                });
                this.f34012y.f1636t.setFilters(new InputFilter[]{new InputFilter.LengthFilter(String.valueOf(this.f34008u).length())});
                FloatingEditText floatingEditText = this.f34012y.f1636t;
                Locale locale = Locale.US;
                floatingEditText.setHint(this.f34007t + " - " + this.f34008u);
                this.f34012y.f1636t.setInputType(2);
                D9.o.p(this.f34012y.f1636t);
                return this.f34012y.f4488d;
            }
        }
        P8.c.a(5, "NumberLabelDialog", "Not all parameters provided for NumberLabelDialog", new Object[0]);
        y();
        return this.f34012y.f4488d;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Dialog dialogR = super.r(bundle);
        dialogR.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.voltasit.obdeleven.ui.dialogs.n0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                C2166q0 c2166q0 = this.f33994b;
                if (i10 == 4) {
                    c2166q0.f34012y.f1634r.callOnClick();
                    return false;
                }
                c2166q0.getClass();
                return false;
            }
        });
        return dialogR;
    }
}
