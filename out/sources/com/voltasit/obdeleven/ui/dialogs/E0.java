package com.voltasit.obdeleven.ui.dialogs;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.voltasit.obdeleven.interfaces.DialogCallback;
import java.util.List;

/* JADX INFO: compiled from: SelectiveOutputDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public final class E0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f33778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F0 f33779c;

    public E0(F0 f10, List list) {
        this.f33779c = f10;
        this.f33778b = list;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j) {
        if (i10 <= 0) {
            return;
        }
        String str = (String) this.f33778b.get(i10 - 1);
        O.e.j("SelectiveOutputDialog", "Selecting with position: " + i10 + ", hex: " + str);
        F0 f10 = this.f33779c;
        D9.o.m(f10.f33786x.f1636t);
        Bundle bundle = new Bundle();
        bundle.putString("key_channel", str);
        f10.w("SelectiveOutputDialog", DialogCallback.CallbackType.f31102c, bundle);
        f10.y();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
