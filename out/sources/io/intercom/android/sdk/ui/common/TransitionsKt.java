package io.intercom.android.sdk.ui.common;

import Ia.l;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.C0907g;
import androidx.compose.animation.m;

/* JADX INFO: compiled from: Transitions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TransitionsKt {
    public static final m floatingButtonEnterTransition(final int i10) {
        return EnterExitTransitionKt.g(null, 0.8f, 5).b(EnterExitTransitionKt.m(new l() { // from class: io.intercom.android.sdk.ui.common.a
            @Override // Ia.l
            public final Object invoke(Object obj) {
                return Integer.valueOf(TransitionsKt.floatingButtonEnterTransition$lambda$0(i10, ((Integer) obj).intValue()));
            }
        }, C0907g.c(0.75f, 500.0f, null, 4)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int floatingButtonEnterTransition$lambda$0(int i10, int i11) {
        return i11 + i10;
    }
}
