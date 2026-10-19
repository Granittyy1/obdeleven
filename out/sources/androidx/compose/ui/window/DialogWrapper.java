package androidx.compose.ui.window;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.q;
import androidx.activity.y;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.b0;
import com.voltasit.obdeleven.R;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import p293xa.r;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DialogWrapper extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Ia.a<r> f15797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f15798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f15799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f15800h;

    /* JADX INFO: compiled from: AndroidDialog.android.kt */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    public DialogWrapper(Ia.a<r> aVar, f fVar, View view, LayoutDirection layoutDirection, p013b0.c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), fVar.f15837e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f15797e = aVar;
        this.f15798f = fVar;
        this.f15799g = view;
        float f10 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        b0.a(window, this.f15798f.f15837e);
        window.setGravity(17);
        e eVar = new e(getContext(), window);
        eVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        eVar.setClipChildren(false);
        eVar.setElevation(cVar.T0(f10));
        eVar.setOutlineProvider(new a());
        this.f15800h = eVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(eVar);
        P3.d.u(eVar, P3.d.g(view));
        kotlin.jvm.internal.h.h(eVar, kotlin.jvm.internal.h.f(view));
        I2.e.p(eVar, I2.e.i(view));
        e(this.f15797e, this.f15798f, layoutDirection);
        L4.b.c(this.f8251d, this, new Ia.l<y, r>() { // from class: androidx.compose.ui.window.DialogWrapper.2
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(y yVar) {
                DialogWrapper dialogWrapper = DialogWrapper.this;
                if (dialogWrapper.f15798f.f15833a) {
                    dialogWrapper.f15797e.invoke();
                }
                return r.f47939a;
            }
        });
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof e) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    public final void e(Ia.a<r> aVar, f fVar, LayoutDirection layoutDirection) {
        int i10;
        this.f15797e = aVar;
        this.f15798f = fVar;
        SecureFlagPolicy secureFlagPolicy = fVar.f15835c;
        boolean zB = AndroidPopup_androidKt.b(this.f15799g);
        int iOrdinal = secureFlagPolicy.ordinal();
        int i11 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zB = false;
            }
        }
        Window window = getWindow();
        kotlin.jvm.internal.i.b(window);
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = layoutDirection.ordinal();
        if (iOrdinal2 == 0) {
            i10 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 1;
        }
        e eVar = this.f15800h;
        eVar.setLayoutDirection(i10);
        boolean z10 = eVar.f15830f;
        boolean z11 = fVar.f15837e;
        boolean z12 = fVar.f15836d;
        boolean z13 = (z10 && z12 == eVar.f15828d && z11 == eVar.f15829e) ? false : true;
        eVar.f15828d = z12;
        eVar.f15829e = z11;
        if (z13) {
            Window window2 = eVar.f15826b;
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i12 = z12 ? -2 : -1;
            if (i12 != attributes.width || !eVar.f15830f) {
                window2.setLayout(i12, -2);
                eVar.f15830f = true;
            }
        }
        setCanceledOnTouchOutside(fVar.f15834b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z11) {
                i11 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i11);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (!this.f15798f.f15833a || !keyEvent.isTracking() || keyEvent.isCanceled() || i10 != 111) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.f15797e.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        int iB;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f15798f.f15834b) {
            return zOnTouchEvent;
        }
        e eVar = this.f15800h;
        eVar.getClass();
        float x10 = motionEvent.getX();
        if (!Float.isInfinite(x10) && !Float.isNaN(x10)) {
            float y10 = motionEvent.getY();
            if (!Float.isInfinite(y10) && !Float.isNaN(y10) && (childAt = eVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + eVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + eVar.getTop();
                int height = childAt.getHeight() + top;
                int iB2 = Ka.a.b(motionEvent.getX());
                if (left <= iB2 && iB2 <= width && top <= (iB = Ka.a.b(motionEvent.getY())) && iB <= height) {
                    return zOnTouchEvent;
                }
            }
        }
        this.f15797e.invoke();
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
