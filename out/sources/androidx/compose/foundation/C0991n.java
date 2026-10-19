package androidx.compose.foundation;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: androidx.compose.foundation.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: EdgeEffectCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0991n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10903a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f10904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f10905c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f10904b = dLog;
        f10905c = dLog - 1.0d;
    }
}
