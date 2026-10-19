package com.voltasit.obdeleven.ui.dialogs;

import com.afollestad.materialdialogs.MaterialDialog;
import com.parse.boltsinternal.TaskCompletionSource;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.view.FloatingEditText;

/* JADX INFO: renamed from: com.voltasit.obdeleven.ui.dialogs.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: NumberDialog.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2156l0 extends MaterialDialog.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f33990b;

    public C2156l0(int i10, TaskCompletionSource taskCompletionSource) {
        this.f33989a = i10;
        this.f33990b = taskCompletionSource;
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.b
    public final void a(MaterialDialog materialDialog) {
        this.f33990b.setResult(-1);
        materialDialog.dismiss();
    }

    @Override // com.afollestad.materialdialogs.MaterialDialog.b
    public final void c(MaterialDialog materialDialog) {
        FloatingEditText floatingEditText = (FloatingEditText) materialDialog.f34552b.findViewById(R.id.editText);
        String string = floatingEditText.getText().toString();
        if (string.isEmpty()) {
            floatingEditText.c(R.string.common_enter_value);
            return;
        }
        int i10 = Integer.parseInt(string);
        if (i10 < 0 || i10 > this.f33989a) {
            floatingEditText.c(R.string.common_wrong_value);
            return;
        }
        D9.o.m(floatingEditText);
        this.f33990b.setResult(Integer.valueOf(i10));
        materialDialog.dismiss();
    }
}
