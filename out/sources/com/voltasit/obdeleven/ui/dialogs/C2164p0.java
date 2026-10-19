package com.voltasit.obdeleven.ui.dialogs;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import com.voltasit.parse.model.ControlUnitLabelDB;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NumberLabelDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2164p0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f34002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2166q0 f34003c;

    public C2164p0(C2166q0 c2166q0, ArrayList arrayList) {
        this.f34003c = c2166q0;
        this.f34002b = arrayList;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j) {
        if (i10 <= 0) {
            return;
        }
        ControlUnitLabelDB controlUnitLabelDB = (ControlUnitLabelDB) this.f34002b.get(i10 - 1);
        C2166q0 c2166q0 = this.f34003c;
        D9.o.m(c2166q0.f34012y.f1636t);
        int i11 = controlUnitLabelDB.getInt("channel");
        Bundle bundle = new Bundle();
        bundle.putInt("key_channel", i11);
        c2166q0.w("NumberLabelDialog", DialogCallback.CallbackType.f31102c, bundle);
        c2166q0.y();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
