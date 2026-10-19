package androidx.compose.animation.core;

import androidx.compose.animation.core.AbstractC0913m;

/* JADX INFO: renamed from: androidx.compose.animation.core.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Animation.kt */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0903c<T, V extends AbstractC0913m> {
    boolean a();

    long b();

    d0<T, V> c();

    V d(long j);

    default boolean e(long j) {
        return j >= b();
    }

    T f(long j);

    T g();
}
