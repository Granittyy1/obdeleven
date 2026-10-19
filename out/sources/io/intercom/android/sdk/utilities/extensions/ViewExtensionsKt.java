package io.intercom.android.sdk.utilities.extensions;

import android.view.View;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ViewExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewExtensionsKt {
    public static final void hide(View view) {
        i.e(view, "<this>");
        view.setVisibility(8);
    }

    public static final void show(View view) {
        i.e(view, "<this>");
        view.setVisibility(0);
    }
}
