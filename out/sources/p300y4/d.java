package p300y4;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: ShimmerFrameLayout.java */
/* JADX INFO: loaded from: classes.dex */
public class d extends FrameLayout {
    private final Paint mContentPaint;
    private final c mShimmerDrawable;
    private boolean mShowShimmer;

    public d(Context context) {
        super(context);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new c();
        this.mShowShimmer = true;
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        b.AbstractC0557b aVar;
        setWillNotDraw(false);
        this.mShimmerDrawable.setCallback(this);
        if (attributeSet == null) {
            setShimmer(new b.a().a());
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f48264a, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(4) && typedArrayObtainStyledAttributes.getBoolean(4, false)) {
                aVar = new b.c();
                aVar.f48284a.f48279p = false;
            } else {
                aVar = new b.a();
            }
            setShimmer(aVar.b(typedArrayObtainStyledAttributes).a());
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.mShowShimmer) {
            this.mShimmerDrawable.draw(canvas);
        }
    }

    public void hideShimmer() {
        if (this.mShowShimmer) {
            stopShimmer();
            this.mShowShimmer = false;
            invalidate();
        }
    }

    public boolean isShimmerStarted() {
        ValueAnimator valueAnimator = this.mShimmerDrawable.f48289e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public boolean isShimmerVisible() {
        return this.mShowShimmer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mShimmerDrawable.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopShimmer();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.mShimmerDrawable.setBounds(0, 0, getWidth(), getHeight());
    }

    public d setShimmer(b bVar) {
        boolean zIsStarted;
        c cVar = this.mShimmerDrawable;
        cVar.f48290f = bVar;
        if (bVar != null) {
            cVar.f48286b.setXfermode(new PorterDuffXfermode(cVar.f48290f.f48279p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        cVar.b();
        if (cVar.f48290f != null) {
            ValueAnimator valueAnimator = cVar.f48289e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                cVar.f48289e.cancel();
                cVar.f48289e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            b bVar2 = cVar.f48290f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (bVar2.f48283t / bVar2.f48282s) + 1.0f);
            cVar.f48289e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(cVar.f48290f.f48281r);
            cVar.f48289e.setRepeatCount(cVar.f48290f.f48280q);
            ValueAnimator valueAnimator2 = cVar.f48289e;
            b bVar3 = cVar.f48290f;
            valueAnimator2.setDuration(bVar3.f48282s + bVar3.f48283t);
            cVar.f48289e.addUpdateListener(cVar.f48285a);
            if (zIsStarted) {
                cVar.f48289e.start();
            }
        }
        cVar.invalidateSelf();
        if (bVar == null || !bVar.f48277n) {
            setLayerType(0, null);
        } else {
            setLayerType(2, this.mContentPaint);
        }
        return this;
    }

    public void showShimmer(boolean z10) {
        if (this.mShowShimmer) {
            return;
        }
        this.mShowShimmer = true;
        if (z10) {
            startShimmer();
        }
    }

    public void startShimmer() {
        c cVar = this.mShimmerDrawable;
        ValueAnimator valueAnimator = cVar.f48289e;
        if (valueAnimator != null) {
            if ((valueAnimator == null || !valueAnimator.isStarted()) && cVar.getCallback() != null) {
                cVar.f48289e.start();
            }
        }
    }

    public void stopShimmer() {
        c cVar = this.mShimmerDrawable;
        ValueAnimator valueAnimator = cVar.f48289e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        cVar.f48289e.cancel();
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mShimmerDrawable;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new c();
        this.mShowShimmer = true;
        init(context, attributeSet);
    }

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new c();
        this.mShowShimmer = true;
        init(context, attributeSet);
    }

    public d(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mContentPaint = new Paint();
        this.mShimmerDrawable = new c();
        this.mShowShimmer = true;
        init(context, attributeSet);
    }
}
