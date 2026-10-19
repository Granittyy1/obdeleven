package com.afollestad.materialdialogs;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: MaterialDialog.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDialog f23271b;

    /* JADX INFO: compiled from: MaterialDialog.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f23272b;

        public a(int i10) {
            this.f23272b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            bVar.f23271b.f23197i.requestFocus();
            bVar.f23271b.f23192d.f23221K.t0(this.f23272b);
        }
    }

    public b(MaterialDialog materialDialog) {
        this.f23271b = materialDialog;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        MaterialDialog materialDialog = this.f23271b;
        materialDialog.f23197i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        MaterialDialog.ListType listType = materialDialog.f23206s;
        MaterialDialog.ListType listType2 = MaterialDialog.ListType.f23208c;
        if (listType == listType2 || listType == MaterialDialog.ListType.f23209d) {
            if (listType != listType2) {
                materialDialog.getClass();
                return;
            }
            int i10 = materialDialog.f23192d.f23215E;
            if (i10 < 0) {
                return;
            }
            materialDialog.f23197i.post(new a(i10));
        }
    }
}
