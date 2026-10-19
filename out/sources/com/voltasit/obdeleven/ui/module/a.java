package com.voltasit.obdeleven.ui.module;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: BaseFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseFragment<M0.h> f34092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f34093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f34094d;

    public a(BaseFragment<M0.h> baseFragment, View view, Runnable runnable) {
        this.f34092b = baseFragment;
        this.f34093c = view;
        this.f34094d = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.f34092b.isVisible()) {
            this.f34093c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f34094d.run();
        }
    }
}
