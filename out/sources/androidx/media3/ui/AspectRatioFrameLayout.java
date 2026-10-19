package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p128k2.n;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f18845e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f18846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18848d;

    public interface a {
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f18849b;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f18849b = false;
            int i10 = AspectRatioFrameLayout.f18845e;
            AspectRatioFrameLayout.this.getClass();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18848d = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, n.f41539a, 0, 0);
            try {
                this.f18848d = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f18846b = new b();
    }

    public int getResizeMode() {
        return this.f18848d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        super.onMeasure(i10, i11);
        if (this.f18847c <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = (this.f18847c / (f12 / f13)) - 1.0f;
        float fAbs = Math.abs(f14);
        b bVar = this.f18846b;
        if (fAbs <= 0.01f) {
            if (bVar.f18849b) {
                return;
            }
            bVar.f18849b = true;
            AspectRatioFrameLayout.this.post(bVar);
            return;
        }
        int i12 = this.f18848d;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    f10 = this.f18847c;
                } else if (i12 == 4) {
                    if (f14 > 0.0f) {
                        f10 = this.f18847c;
                    } else {
                        f11 = this.f18847c;
                    }
                }
                measuredWidth = (int) (f13 * f10);
            } else {
                f11 = this.f18847c;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f14 > 0.0f) {
            f11 = this.f18847c;
            measuredHeight = (int) (f12 / f11);
        } else {
            f10 = this.f18847c;
            measuredWidth = (int) (f13 * f10);
        }
        if (!bVar.f18849b) {
            bVar.f18849b = true;
            AspectRatioFrameLayout.this.post(bVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f10) {
        if (this.f18847c != f10) {
            this.f18847c = f10;
            requestLayout();
        }
    }

    public void setResizeMode(int i10) {
        if (this.f18848d != i10) {
            this.f18848d = i10;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }
}
