package com.google.android.material.snackbar;

import android.view.View;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f27439a;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.f27439a = baseTransientBottomBar;
    }

    public final void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f27439a.b(0);
    }
}
