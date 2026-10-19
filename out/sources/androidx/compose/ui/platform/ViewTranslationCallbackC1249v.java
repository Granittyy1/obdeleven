package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: renamed from: androidx.compose.ui.platform.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTranslationCallbackC1249v implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewTranslationCallbackC1249v f15107a = new ViewTranslationCallbackC1249v();

    public final boolean onClearTranslation(View view) {
        kotlin.jvm.internal.i.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().j();
        return true;
    }

    public final boolean onHideTranslation(View view) {
        kotlin.jvm.internal.i.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().k();
        return true;
    }

    public final boolean onShowTranslation(View view) {
        kotlin.jvm.internal.i.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().l();
        return true;
    }
}
