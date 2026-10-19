package com.google.android.material.appbar;

import B0.u;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: AppBarLayout.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f26708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f26709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f26710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f26712e;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
        this.f26712e = baseBehavior;
        this.f26708a = coordinatorLayout;
        this.f26709b = appBarLayout;
        this.f26710c = view;
        this.f26711d = i10;
    }

    @Override // B0.u
    public final boolean a(View view) {
        View view2 = this.f26710c;
        int i10 = this.f26711d;
        this.f26712e.H(this.f26708a, this.f26709b, view2, i10, new int[]{0, 0});
        return true;
    }
}
