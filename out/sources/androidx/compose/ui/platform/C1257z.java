package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: renamed from: androidx.compose.ui.platform.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1257z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1257z f15110a = new C1257z();

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        ViewTranslationCallbackC1249v viewTranslationCallbackC1249v = ViewTranslationCallbackC1249v.f15107a;
        ViewTranslationCallbackC1249v viewTranslationCallbackC1249v2 = ViewTranslationCallbackC1249v.f15107a;
        view.setViewTranslationCallback(ViewTranslationCallbackC1249v.f15107a);
    }
}
