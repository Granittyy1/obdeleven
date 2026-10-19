package com.google.android.material.snackbar;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f27438b;

    public e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f27438b = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27438b.d(3);
    }
}
