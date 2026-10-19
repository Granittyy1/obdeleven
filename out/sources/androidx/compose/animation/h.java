package androidx.compose.animation;

import androidx.compose.animation.core.c0;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f9641a;

    static {
        long j = Integer.MIN_VALUE;
        f9641a = (j & 4294967295L) | (j << 32);
    }

    public static androidx.compose.ui.h a(androidx.compose.ui.h hVar, c0 c0Var) {
        return A8.p.s(hVar).i(new SizeAnimationModifierElement(c0Var, null));
    }
}
