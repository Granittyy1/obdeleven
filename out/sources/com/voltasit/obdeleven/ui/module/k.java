package com.voltasit.obdeleven.ui.module;

import android.text.Editable;
import android.text.TextWatcher;

/* JADX INFO: compiled from: SupportedModelFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f34124b;

    public k(l lVar) {
        this.f34124b = lVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String strValueOf = String.valueOf(charSequence);
        l lVar = this.f34124b;
        lVar.f34139z = strValueOf;
        lVar.f34138y.e(strValueOf);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
