package com.google.accompanist.placeholder;

import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.core.E;
import androidx.compose.animation.core.RepeatMode;
import androidx.recyclerview.widget.t;
import p293xa.d;
import p293xa.g;

/* JADX INFO: compiled from: Placeholder.kt */
/* JADX INFO: loaded from: classes.dex */
@d
public final class PlaceholderDefaults {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f25223a;

    static {
        kotlin.a.a(new Ia.a<E<Float>>() { // from class: com.google.accompanist.placeholder.PlaceholderDefaults$fadeAnimationSpec$2
            @Override // Ia.a
            public final E<Float> invoke() {
                return C0907g.a(C0907g.d(600, t.d.DEFAULT_DRAG_ANIMATION_DURATION, null, 4), RepeatMode.f9399c, 4);
            }
        });
        f25223a = kotlin.a.a(new Ia.a<E<Float>>() { // from class: com.google.accompanist.placeholder.PlaceholderDefaults$shimmerAnimationSpec$2
            @Override // Ia.a
            public final E<Float> invoke() {
                return C0907g.a(C0907g.d(1700, t.d.DEFAULT_DRAG_ANIMATION_DURATION, null, 4), RepeatMode.f9398b, 4);
            }
        });
    }
}
