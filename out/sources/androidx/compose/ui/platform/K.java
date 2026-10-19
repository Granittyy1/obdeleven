package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: AndroidViewConfiguration.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class K implements Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f14936a;

    public K(ViewConfiguration viewConfiguration) {
        this.f14936a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.Y0
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.Y0
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.Y0
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f14936a.getScaledHandwritingSlop();
        }
        return 2.0f;
    }

    @Override // androidx.compose.ui.platform.Y0
    public final float e() {
        return this.f14936a.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.compose.ui.platform.Y0
    public final float f() {
        return this.f14936a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.Y0
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return this.f14936a.getScaledHandwritingGestureLineMargin();
        }
        return 16.0f;
    }
}
