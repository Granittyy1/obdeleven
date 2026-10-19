package androidx.compose.ui.platform;

import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class X0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.platform.W0, androidx.lifecycle.s] */
    public static final Ia.a a(final AbstractComposeView abstractComposeView, final Lifecycle lifecycle) {
        if (lifecycle.b().compareTo(Lifecycle.State.f17749b) > 0) {
            final ?? r10 = new androidx.lifecycle.r() { // from class: androidx.compose.ui.platform.W0
                @Override // androidx.lifecycle.r
                public final void h(InterfaceC1376t interfaceC1376t, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        abstractComposeView.disposeComposition();
                    }
                }
            };
            lifecycle.a(r10);
            return new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // Ia.a
                public final p293xa.r invoke() {
                    lifecycle.c(r10);
                    return p293xa.r.f47939a;
                }
            };
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }
}
