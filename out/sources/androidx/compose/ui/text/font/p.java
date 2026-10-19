package androidx.compose.ui.text.font;

import android.os.Build;

/* JADX INFO: compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f15451a;

    public p() {
        this.f15451a = Build.VERSION.SDK_INT >= 28 ? new O3.d() : new A0.f();
    }
}
