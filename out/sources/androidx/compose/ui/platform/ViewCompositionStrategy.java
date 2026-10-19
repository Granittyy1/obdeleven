package androidx.compose.ui.platform;

import android.view.View;
import androidx.lifecycle.InterfaceC1376t;
import androidx.lifecycle.Lifecycle;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
/* JADX INFO: loaded from: classes.dex */
public interface ViewCompositionStrategy {

    /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
    public static final class a implements ViewCompositionStrategy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f14976a;

        public a(InterfaceC1376t interfaceC1376t) {
            this.f14976a = interfaceC1376t.getLifecycle();
        }

        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public final Ia.a<p293xa.r> a(AbstractComposeView abstractComposeView) {
            return X0.a(abstractComposeView, this.f14976a);
        }
    }

    Ia.a<p293xa.r> a(AbstractComposeView abstractComposeView);

    /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DisposeOnViewTreeLifecycleDestroyed f14973a = new DisposeOnViewTreeLifecycleDestroyed();

        /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public final Ia.a<p293xa.r> a(final AbstractComposeView abstractComposeView) {
            if (!abstractComposeView.isAttachedToWindow()) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                final a aVar = new a(abstractComposeView, ref$ObjectRef);
                abstractComposeView.addOnAttachStateChangeListener(aVar);
                ref$ObjectRef.element = new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        abstractComposeView.removeOnAttachStateChangeListener(aVar);
                        return p293xa.r.f47939a;
                    }
                };
                return new Ia.a<p293xa.r>() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // Ia.a
                    public final p293xa.r invoke() {
                        ref$ObjectRef.element.invoke();
                        return p293xa.r.f47939a;
                    }
                };
            }
            InterfaceC1376t interfaceC1376tG = P3.d.g(abstractComposeView);
            if (interfaceC1376tG != null) {
                return X0.a(abstractComposeView, interfaceC1376tG.getLifecycle());
            }
            R.a.c("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
            throw new KotlinNothingValueException();
        }

        /* JADX INFO: compiled from: ViewCompositionStrategy.android.kt */
        public static final class a implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractComposeView f14974b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Ref$ObjectRef<Ia.a<p293xa.r>> f14975c;

            public a(AbstractComposeView abstractComposeView, Ref$ObjectRef<Ia.a<p293xa.r>> ref$ObjectRef) {
                this.f14974b = abstractComposeView;
                this.f14975c = ref$ObjectRef;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [Ia.a, T] */
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                AbstractComposeView abstractComposeView = this.f14974b;
                InterfaceC1376t interfaceC1376tG = P3.d.g(abstractComposeView);
                if (interfaceC1376tG != null) {
                    this.f14975c.element = X0.a(abstractComposeView, interfaceC1376tG.getLifecycle());
                    abstractComposeView.removeOnAttachStateChangeListener(this);
                } else {
                    R.a.c("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
                    throw new KotlinNothingValueException();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
            }
        }
    }
}
