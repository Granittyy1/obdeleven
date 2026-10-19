package com.voltasit.obdeleven.ui.dialogs;

import B8.AbstractC0625f;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import java.util.ArrayList;

/* JADX INFO: compiled from: LiveDataChartDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public class Y extends com.voltasit.obdeleven.presentation.dialogs.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f33862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f33863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AbstractC0625f f33864u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayAdapter<String> f33865v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayAdapter<String> f33866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f33867x;

    public void B(ArrayList arrayList) {
        this.f33865v.addAll(arrayList);
    }

    public final void C(ArrayList arrayList) {
        this.f33866w.clear();
        int i10 = 0;
        if (arrayList.isEmpty()) {
            this.f33866w.add(getString(R.string.common_not_available));
        } else {
            this.f33866w.add(getString(R.string.common_select_value));
            if (arrayList.size() == 1) {
                this.f33866w.add((String) arrayList.get(0));
                this.f33864u.f1907v.setVisibility(8);
                i10 = 1;
            } else {
                this.f33866w.addAll(arrayList);
            }
        }
        this.f33864u.f1907v.setSelection(i10);
        this.f33864u.f1907v.setEnabled(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f33864u = (AbstractC0625f) M0.e.a(layoutInflater, R.layout.chart_value_dialog, null, false, null);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f33862s = bundle;
        if (bundle.containsKey("key_title")) {
            this.f33863t = this.f33862s.getString("key_title");
        }
        this.f33867x = this.f33862s.getStringArrayList("items");
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.i.d(contextRequireContext, "requireContext(...)");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(contextRequireContext, R.layout.item_dropdown);
        this.f33865v = arrayAdapter;
        arrayAdapter.add(getString(R.string.dialog_live_data_chart_select_measurement));
        B(this.f33867x);
        this.f33864u.f1903r.setText(this.f33863t);
        this.f33864u.f1906u.setAdapter((SpinnerAdapter) this.f33865v);
        this.f33864u.f1905t.setVisibility(0);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(z(), R.layout.item_dropdown);
        this.f33866w = arrayAdapter2;
        this.f33864u.f1907v.setAdapter((SpinnerAdapter) arrayAdapter2);
        this.f33866w.add(getString(R.string.common_not_available));
        this.f33864u.f1906u.setOnItemSelectedListener(new a());
        this.f33864u.f1905t.setOnClickListener(new com.voltasit.obdeleven.presentation.profile.g(3, this));
        this.f33864u.f1904s.setOnClickListener(new com.voltasit.obdeleven.presentation.profile.h(2, this));
        return this.f33864u.f4488d;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundle2 = this.f33862s;
        if (bundle2 == null) {
            return;
        }
        bundle.putString("key_title", bundle2.getString("key_title"));
        bundle.putStringArrayList("items", this.f33862s.getStringArrayList("items"));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1342g
    public final Dialog r(Bundle bundle) {
        Dialog dialogR = super.r(bundle);
        dialogR.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.voltasit.obdeleven.ui.dialogs.X
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                Y y10 = this.f33860b;
                if (i10 == 4) {
                    y10.y();
                    return false;
                }
                y10.getClass();
                return false;
            }
        });
        return dialogR;
    }

    /* JADX INFO: compiled from: LiveDataChartDialog.java */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j) {
            Y y10 = Y.this;
            y10.f33866w.clear();
            y10.f33864u.f1907v.setVisibility(0);
            y10.f33864u.f1907v.setEnabled(false);
            if (i10 == 0) {
                y10.f33866w.add(y10.getString(R.string.common_not_available));
                y10.f33864u.f1907v.setSelection(0);
                return;
            }
            y10.f33866w.add(y10.getString(R.string.common_loading));
            y10.f33864u.f1907v.setSelection(0);
            Bundle bundle = new Bundle();
            bundle.putInt("position", i10);
            y10.w("OBDIILiveDataChartDialog", DialogCallback.CallbackType.f31103d, bundle);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
