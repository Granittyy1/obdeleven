package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: renamed from: androidx.compose.animation.core.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Animatable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C0904d<T, V extends AbstractC0913m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0908h<T, V> f9529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimationEndReason f9530b;

    public C0904d(C0908h<T, V> c0908h, AnimationEndReason animationEndReason) {
        this.f9529a = c0908h;
        this.f9530b = animationEndReason;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.f9530b + ", endState=" + this.f9529a + ')';
    }
}
