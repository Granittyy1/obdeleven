package androidx.compose.material3;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C0909i;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.v0;
import com.voltasit.obdeleven.R;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ModalBottomSheetDialogWrapper extends androidx.activity.q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ia.a<p293xa.r> f12231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public S f12232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f12233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ModalBottomSheetDialogLayout f12234h;

    /* JADX INFO: compiled from: ModalBottomSheet.android.kt */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    public ModalBottomSheetDialogWrapper(Ia.a<p293xa.r> aVar, S s10, View view, LayoutDirection layoutDirection, p013b0.c cVar, UUID uuid, Animatable<Float, C0909i> animatable, kotlinx.coroutines.A a10, boolean z10) {
        v0.e cVar2;
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.f12231e = aVar;
        this.f12232f = s10;
        this.f12233g = view;
        float f10 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        androidx.core.view.b0.a(window, false);
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = new ModalBottomSheetDialogLayout(getContext(), window, this.f12232f.f12290b, this.f12231e, animatable, a10);
        modalBottomSheetDialogLayout.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        modalBottomSheetDialogLayout.setClipChildren(false);
        modalBottomSheetDialogLayout.setElevation(cVar.T0(f10));
        modalBottomSheetDialogLayout.setOutlineProvider(new a());
        this.f12234h = modalBottomSheetDialogLayout;
        setContentView(modalBottomSheetDialogLayout);
        P3.d.u(modalBottomSheetDialogLayout, P3.d.g(view));
        kotlin.jvm.internal.h.h(modalBottomSheetDialogLayout, kotlin.jvm.internal.h.f(view));
        I2.e.p(modalBottomSheetDialogLayout, I2.e.i(view));
        d(this.f12231e, this.f12232f, layoutDirection);
        androidx.core.view.D d10 = new androidx.core.view.D(window.getDecorView());
        if (Build.VERSION.SDK_INT >= 30) {
            v0.d dVar = new v0.d(window.getInsetsController(), d10);
            dVar.f16996b = window;
            cVar2 = dVar;
        } else {
            cVar2 = new v0.c(window, d10);
        }
        boolean z11 = !z10;
        cVar2.c(z11);
        cVar2.b(z11);
        L4.b.c(this.f8251d, this, new Ia.l<androidx.activity.y, p293xa.r>() { // from class: androidx.compose.material3.ModalBottomSheetDialogWrapper.3
            {
                super(1);
            }

            @Override // Ia.l
            public final p293xa.r invoke(androidx.activity.y yVar) {
                ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = ModalBottomSheetDialogWrapper.this;
                if (modalBottomSheetDialogWrapper.f12232f.f12290b) {
                    modalBottomSheetDialogWrapper.f12231e.invoke();
                }
                return p293xa.r.f47939a;
            }
        });
    }

    public final void d(Ia.a<p293xa.r> aVar, S s10, LayoutDirection layoutDirection) {
        this.f12231e = aVar;
        this.f12232f = s10;
        SecureFlagPolicy secureFlagPolicy = s10.f12289a;
        ViewGroup.LayoutParams layoutParams = this.f12233g.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i10 = 0;
        boolean z10 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = secureFlagPolicy.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z10 = true;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z10 = false;
            }
        }
        Window window = getWindow();
        kotlin.jvm.internal.i.b(window);
        window.setFlags(z10 ? 8192 : -8193, 8192);
        int iOrdinal2 = layoutDirection.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 1;
        }
        this.f12234h.setLayoutDirection(i10);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f12231e.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
