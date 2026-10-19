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
import com.obdeleven.service.enums.SupportedFunction;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.util.Texttabe;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.controlUnit.ViewOnClickListenerC2130d;
import com.voltasit.obdeleven.ui.view.FloatingEditText;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: SelectiveOutputDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class F0 extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f33781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f33782t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f33783u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f33784v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ControlUnit f33785w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public B8.D f33786x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayAdapter<String> f33787y;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = 1;
        this.f33786x = (B8.D) M0.e.a(layoutInflater, R.layout.dialog_number_label, viewGroup, false, null);
        ActivityC1347l activity = getActivity();
        if (activity == null) {
            y();
            return this.f33786x.f4488d;
        }
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle != null && bundle.containsKey("key_title") && bundle.containsKey("key_min") && bundle.containsKey("key_max")) {
            this.f33781s = bundle.getInt("key_title");
            this.f33782t = bundle.getInt("key_min");
            this.f33783u = bundle.getInt("key_max");
            this.f33784v = bundle.getBoolean("isSequantialOutputSupported");
            if (this.f33785w != null) {
                this.f33787y = new ArrayAdapter<>(activity, android.R.layout.simple_spinner_dropdown_item);
                this.f33786x.f1639w.setText(this.f33781s);
                this.f33786x.f1638v.setAdapter((SpinnerAdapter) this.f33787y);
                this.f33786x.f1638v.setEnabled(false);
                List<String> outputTestCodesAsList = this.f33785w.f29320b.getOutputTestCodesAsList();
                O.e.j("SelectiveOutputDialog", "Output test codes: " + outputTestCodesAsList);
                if (outputTestCodesAsList.isEmpty()) {
                    this.f33787y.add(getString(R.string.common_not_available));
                } else {
                    this.f33787y.add(getString(R.string.common_select_value));
                    boolean zContains = this.f33785w.M().contains(SupportedFunction.f29300v);
                    for (String str : outputTestCodesAsList) {
                        String strC = Texttabe.c(O.h.e(O.h.d(str, zContains)));
                        O.e.j("SelectiveOutputDialog", "Translation for " + str + ": " + strC);
                        ArrayAdapter<String> arrayAdapter = this.f33787y;
                        if (strC == null) {
                            strC = getString(R.string.common_unknown);
                        }
                        arrayAdapter.add(strC);
                    }
                    this.f33786x.f1638v.setOnItemSelectedListener(new E0(this, outputTestCodesAsList));
                    this.f33786x.f1638v.setEnabled(true);
                }
                this.f33786x.f1635s.setOnClickListener(new com.voltasit.obdeleven.presentation.profile.k(this, i10));
                if (this.f33784v) {
                    this.f33786x.f1637u.setText(R.string.dialog_selective_output_sequential);
                    this.f33786x.f1637u.setVisibility(0);
                    this.f33786x.f1637u.setOnClickListener(new com.braze.ui.inappmessage.views.d(2, this));
                }
                this.f33786x.f1634r.setOnClickListener(new ViewOnClickListenerC2130d(this, 2));
                this.f33786x.f1636t.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.voltasit.obdeleven.ui.dialogs.C0
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                        F0 f10 = this.f33768a;
                        if (i11 == 6) {
                            f10.f33786x.f1635s.callOnClick();
                            return true;
                        }
                        f10.getClass();
                        return false;
                    }
                });
                this.f33786x.f1636t.setFilters(new InputFilter[]{new InputFilter.LengthFilter(String.valueOf(this.f33783u).length())});
                FloatingEditText floatingEditText = this.f33786x.f1636t;
                Locale locale = Locale.US;
                floatingEditText.setHint(this.f33782t + " - " + this.f33783u);
                this.f33786x.f1636t.setInputType(2);
                D9.o.p(this.f33786x.f1636t);
                return this.f33786x.f4488d;
            }
        }
        P8.c.a(5, "SelectiveOutputDialog", "Not all parameters provided for %s", "SelectiveOutputDialog");
        y();
        return this.f33786x.f4488d;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Dialog dialogR = super.r(bundle);
        dialogR.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.voltasit.obdeleven.ui.dialogs.D0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                F0 f10 = this.f33774b;
                if (i10 == 4) {
                    f10.f33786x.f1634r.callOnClick();
                    return false;
                }
                f10.getClass();
                return false;
            }
        });
        return dialogR;
    }
}
