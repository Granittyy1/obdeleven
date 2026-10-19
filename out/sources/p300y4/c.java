package p300y4;

import Z3.n;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: ShimmerDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f48285a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f48286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f48287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f48288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ValueAnimator f48289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f48290f;

    /* JADX INFO: compiled from: ShimmerDrawable.java */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            c.this.invalidateSelf();
        }
    }

    public c() {
        Paint paint = new Paint();
        this.f48286b = paint;
        this.f48287c = new Rect();
        this.f48288d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        b bVar;
        ValueAnimator valueAnimator = this.f48289e;
        if (valueAnimator == null || valueAnimator.isStarted() || (bVar = this.f48290f) == null || !bVar.f48278o || getCallback() == null) {
            return;
        }
        this.f48289e.start();
    }

    public final void b() {
        b bVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (bVar = this.f48290f) == null) {
            return;
        }
        int iRound = bVar.f48271g;
        if (iRound <= 0) {
            iRound = Math.round(bVar.f48273i * iWidth);
        }
        b bVar2 = this.f48290f;
        int iRound2 = bVar2.f48272h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(bVar2.j * iHeight);
        }
        b bVar3 = this.f48290f;
        boolean z10 = true;
        if (bVar3.f48270f != 1) {
            int i10 = bVar3.f48267c;
            if (i10 != 1 && i10 != 3) {
                z10 = false;
            }
            if (z10) {
                iRound = 0;
            }
            if (!z10) {
                iRound2 = 0;
            }
            b bVar4 = this.f48290f;
            radialGradient = new LinearGradient(0.0f, 0.0f, iRound, iRound2, bVar4.f48266b, bVar4.f48265a, Shader.TileMode.CLAMP);
        } else {
            float f10 = iRound2 / 2.0f;
            float fMax = (float) (((double) Math.max(iRound, iRound2)) / Math.sqrt(2.0d));
            b bVar5 = this.f48290f;
            radialGradient = new RadialGradient(iRound / 2.0f, f10, fMax, bVar5.f48266b, bVar5.f48265a, Shader.TileMode.CLAMP);
        }
        this.f48286b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fB;
        float fB2;
        if (this.f48290f != null) {
            Paint paint = this.f48286b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.f48290f.f48276m));
            Rect rect = this.f48287c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.f48289e;
            float f10 = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i10 = this.f48290f.f48267c;
            if (i10 != 1) {
                if (i10 == 2) {
                    fB2 = n.b(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (i10 != 3) {
                    float f11 = -fHeight;
                    fB2 = n.b(fHeight, f11, animatedFraction, f11);
                } else {
                    fB = n.b(-fWidth, fWidth, animatedFraction, fWidth);
                }
                f10 = fB2;
                fB = 0.0f;
            } else {
                float f12 = -fWidth;
                fB = n.b(fWidth, f12, animatedFraction, f12);
            }
            Matrix matrix = this.f48288d;
            matrix.reset();
            matrix.setRotate(this.f48290f.f48276m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f10, fB);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        b bVar = this.f48290f;
        return (bVar == null || !(bVar.f48277n || bVar.f48279p)) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f48287c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
