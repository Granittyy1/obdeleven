package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.InterfaceC1309y;
import androidx.core.view.n0;

/* JADX INFO: compiled from: MaterialDatePicker.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements InterfaceC1309y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f27109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f27110d;

    public r(View view, int i10, int i11) {
        this.f27108b = i10;
        this.f27109c = view;
        this.f27110d = i11;
    }

    @Override // androidx.core.view.InterfaceC1309y
    public final n0 g(View view, n0 n0Var) {
        int i10 = n0Var.f16948a.g(7).f46852b;
        View view2 = this.f27109c;
        int i11 = this.f27108b;
        if (i11 >= 0) {
            view2.getLayoutParams().height = i11 + i10;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f27110d + i10, view2.getPaddingRight(), view2.getPaddingBottom());
        return n0Var;
    }
}
