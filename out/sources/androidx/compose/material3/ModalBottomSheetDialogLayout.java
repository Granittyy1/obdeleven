package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0909i;
import androidx.compose.runtime.C1085f0;
import androidx.compose.runtime.C1086g;
import androidx.compose.runtime.C1105p0;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.runtime.J0;
import androidx.compose.ui.platform.AbstractComposeView;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheetDialogLayout extends AbstractComposeView implements androidx.compose.ui.window.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window f12220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ia.a<p293xa.r> f12222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Animatable<Float, C0909i> f12223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.A f12224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1085f0 f12225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f12226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12227i;

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class Api34Impl {
        public static final OnBackAnimationCallback a(final Ia.a<p293xa.r> aVar, final Animatable<Float, C0909i> animatable, final kotlinx.coroutines.A a10) {
            return new OnBackAnimationCallback() { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1
                public final void onBackCancelled() {
                    C2680e.c(a10, null, null, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1(animatable, null), 3);
                }

                public final void onBackInvoked() {
                    aVar.invoke();
                }

                public final void onBackProgressed(BackEvent backEvent) {
                    C2680e.c(a10, null, null, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1(animatable, backEvent, null), 3);
                }

                public final void onBackStarted(BackEvent backEvent) {
                    C2680e.c(a10, null, null, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackStarted$1(animatable, backEvent, null), 3);
                }
            };
        }
    }

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class a {
        public static final OnBackInvokedCallback a(Ia.a<p293xa.r> aVar) {
            return new Q(0, aVar);
        }

        public static final void b(View view, Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj);
        }

        public static final void c(View view, Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }

    public ModalBottomSheetDialogLayout(Context context, Window window, boolean z10, Ia.a<p293xa.r> aVar, Animatable<Float, C0909i> animatable, kotlinx.coroutines.A a10) {
        super(context, null, 0, 6, null);
        this.f12220b = window;
        this.f12221c = z10;
        this.f12222d = aVar;
        this.f12223e = animatable;
        this.f12224f = a10;
        this.f12225g = J0.f(ComposableSingletons$ModalBottomSheet_androidKt.f12107a);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(InterfaceC1084f interfaceC1084f, final int i10) {
        int i11;
        C1086g c1086gP = interfaceC1084f.p(576708319);
        if ((i10 & 6) == 0) {
            i11 = (c1086gP.k(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c1086gP.s()) {
            c1086gP.w();
        } else {
            ((Ia.p) this.f12225g.getValue()).invoke(c1086gP, 0);
        }
        C1105p0 c1105p0V = c1086gP.V();
        if (c1105p0V != null) {
            c1105p0V.f13109d = new Ia.p<InterfaceC1084f, Integer, p293xa.r>() { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout.Content.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // Ia.p
                public final p293xa.r invoke(InterfaceC1084f interfaceC1084f2, Integer num) {
                    num.intValue();
                    ModalBottomSheetDialogLayout.this.Content(interfaceC1084f2, L4.b.l(i10 | 1));
                    return p293xa.r.f47939a;
                }
            };
        }
    }

    @Override // androidx.compose.ui.window.g
    public final Window a() {
        return this.f12220b;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f12227i;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        if (!this.f12221c || (i10 = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.f12226h == null) {
            Ia.a<p293xa.r> aVar = this.f12222d;
            this.f12226h = i10 >= 34 ? M5.c.b(Api34Impl.a(aVar, this.f12223e, this.f12224f)) : a.a(aVar);
        }
        a.b(this, this.f12226h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            a.c(this, this.f12226h);
        }
        this.f12226h = null;
    }
}
