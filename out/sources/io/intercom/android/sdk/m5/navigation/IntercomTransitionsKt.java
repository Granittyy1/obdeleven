package io.intercom.android.sdk.m5.navigation;

import androidx.compose.animation.InterfaceC0927e;
import androidx.compose.animation.core.C0907g;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import io.intercom.android.sdk.m5.conversation.ui.C2410z;
import p141l2.C2749t;

/* JADX INFO: compiled from: IntercomTransitions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomTransitionsKt {
    private static final Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> slideUpEnterTransition = new Q9.b(2);
    private static final Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> slideDownExitTransition = new C2410z(1);

    public static final Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.o> getSlideDownExitTransition() {
        return slideDownExitTransition;
    }

    public static final Ia.l<InterfaceC0927e<C2749t>, androidx.compose.animation.m> getSlideUpEnterTransition() {
        return slideUpEnterTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.o slideDownExitTransition$lambda$1(InterfaceC0927e interfaceC0927e) {
        kotlin.jvm.internal.i.e(interfaceC0927e, "<this>");
        return InterfaceC0927e.f(interfaceC0927e, C0907g.d(CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS, 0, null, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.animation.m slideUpEnterTransition$lambda$0(InterfaceC0927e interfaceC0927e) {
        kotlin.jvm.internal.i.e(interfaceC0927e, "<this>");
        return InterfaceC0927e.g(interfaceC0927e, C0907g.d(CarouselScreenFragment.CAROUSEL_ANIMATION_DELAY_MS, 0, null, 6));
    }
}
