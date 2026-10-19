package com.google.android.material.tabs;

import android.view.View;

/* JADX INFO: compiled from: TabLayout.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f27528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabLayout.i f27529b;

    public c(TabLayout.i iVar, View view) {
        this.f27529b = iVar;
        this.f27528a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f27528a;
        if (view2.getVisibility() == 0) {
            this.f27529b.c(view2);
        }
    }
}
