package com.google.android.material.appbar;

import B0.u;
import android.view.View;

/* JADX INFO: compiled from: AppBarLayout.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f26713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26714b;

    public c(AppBarLayout appBarLayout, boolean z10) {
        this.f26713a = appBarLayout;
        this.f26714b = z10;
    }

    @Override // B0.u
    public final boolean a(View view) {
        this.f26713a.setExpanded(this.f26714b);
        return true;
    }
}
