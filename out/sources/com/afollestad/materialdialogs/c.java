package com.afollestad.materialdialogs;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import p055e3.e;

/* JADX INFO: compiled from: MaterialDialog.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDialog f23274b;

    public c(MaterialDialog materialDialog) {
        this.f23274b = materialDialog;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int length = charSequence.toString().length();
        MaterialDialog materialDialog = this.f23274b;
        materialDialog.f23192d.getClass();
        boolean z10 = length == 0;
        DialogAction dialogAction = DialogAction.f23184b;
        materialDialog.c(dialogAction).setEnabled(!z10);
        TextView textView = materialDialog.f23201n;
        MaterialDialog.a aVar = materialDialog.f23192d;
        if (textView != null) {
            aVar.getClass();
            materialDialog.f23201n.setVisibility(8);
            boolean z11 = (z10 && length == 0) || length < -1;
            e.a(materialDialog.f23196h, z11 ? 0 : aVar.f23247q);
            materialDialog.c(dialogAction).setEnabled(!z11);
        }
        aVar.getClass();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
