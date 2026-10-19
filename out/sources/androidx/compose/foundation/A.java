package androidx.compose.foundation;

import android.os.Build;

/* JADX INFO: compiled from: Magnifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.semantics.v<Ia.a<I.d>> f9677a = new androidx.compose.ui.semantics.v<>("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
