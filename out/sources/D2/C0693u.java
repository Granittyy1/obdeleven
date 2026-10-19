package D2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.voltasit.obdeleven.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: D2.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: GhostViewPort.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0693u extends ViewGroup implements r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f2698h = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f2699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f2700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f2701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Matrix f2703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f2704g;

    /* JADX INFO: renamed from: D2.u$a */
    /* JADX INFO: compiled from: GhostViewPort.java */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view;
            WeakHashMap<View, androidx.core.view.Z> weakHashMap = androidx.core.view.O.f16859a;
            C0693u c0693u = C0693u.this;
            c0693u.postInvalidateOnAnimation();
            ViewGroup viewGroup = c0693u.f2699b;
            if (viewGroup == null || (view = c0693u.f2700c) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            c0693u.f2699b.postInvalidateOnAnimation();
            c0693u.f2699b = null;
            c0693u.f2700c = null;
            return true;
        }
    }

    public C0693u(View view) {
        super(view.getContext());
        this.f2704g = new a();
        this.f2701d = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    @Override // D2.r
    public final void a(View view, ViewGroup viewGroup) {
        this.f2699b = viewGroup;
        this.f2700c = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.f2701d;
        view.setTag(R.id.ghost_view, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.f2704g);
        T.c(4, view);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.f2701d;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f2704g);
        T.c(0, view);
        view.setTag(R.id.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C0676c.a(canvas, true);
        canvas.setMatrix(this.f2703f);
        View view = this.f2701d;
        T.c(0, view);
        view.invalidate();
        T.c(4, view);
        drawChild(canvas, view, getDrawingTime());
        C0676c.a(canvas, false);
    }

    @Override // android.view.View, D2.r
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f2701d;
        if (((C0693u) view.getTag(R.id.ghost_view)) == this) {
            T.c(i10 == 0 ? 4 : 0, view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
