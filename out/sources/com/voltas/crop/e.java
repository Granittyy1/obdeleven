package com.voltas.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.work.i;

/* JADX INFO: compiled from: ImageViewTouchBase.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends ImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f29623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f29624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f29625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f29626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p278w8.f f29627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f29630i;
    public i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Handler f29631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f29632l;

    /* JADX INFO: compiled from: ImageViewTouchBase.java */
    public interface a {
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29623b = new Matrix();
        this.f29624c = new Matrix();
        this.f29625d = new Matrix();
        this.f29626e = new float[9];
        this.f29627f = new p278w8.f(null, 0);
        this.f29628g = -1;
        this.f29629h = -1;
        this.f29631k = new Handler();
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void a() {
        float height;
        float f10;
        Bitmap bitmap = this.f29627f.f47804a;
        if (bitmap == null) {
            return;
        }
        Matrix imageViewMatrix = getImageViewMatrix();
        float f11 = 0.0f;
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        imageViewMatrix.mapRect(rectF);
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        float height2 = getHeight();
        if (fHeight < height2) {
            height = ((height2 - fHeight) / 2.0f) - rectF.top;
        } else {
            float f12 = rectF.top;
            if (f12 > 0.0f) {
                height = -f12;
            } else {
                height = rectF.bottom < height2 ? getHeight() - rectF.bottom : 0.0f;
            }
        }
        float width = getWidth();
        if (fWidth >= width) {
            float f13 = rectF.left;
            if (f13 > 0.0f) {
                f11 = -f13;
            } else {
                f10 = rectF.right;
                if (f10 < width) {
                }
            }
            c(f11, height);
            setImageMatrix(getImageViewMatrix());
        }
        width = (width - fWidth) / 2.0f;
        f10 = rectF.left;
        f11 = width - f10;
        c(f11, height);
        setImageMatrix(getImageViewMatrix());
    }

    public final void b(p278w8.f fVar, Matrix matrix, boolean z10) {
        float width = getWidth();
        float height = getHeight();
        float fB = fVar.b();
        float fA = fVar.a();
        matrix.reset();
        float fMin = Math.min(Math.min(width / fB, 3.0f), Math.min(height / fA, 3.0f));
        if (z10) {
            Matrix matrix2 = new Matrix();
            Bitmap bitmap = fVar.f47804a;
            if (bitmap != null && fVar.f47805b != 0) {
                matrix2.preTranslate(-(bitmap.getWidth() / 2), -(fVar.f47804a.getHeight() / 2));
                matrix2.postRotate(fVar.f47805b);
                matrix2.postTranslate(fVar.b() / 2, fVar.a() / 2);
            }
            matrix.postConcat(matrix2);
        }
        matrix.postScale(fMin, fMin);
        matrix.postTranslate((width - (fB * fMin)) / 2.0f, (height - (fA * fMin)) / 2.0f);
    }

    public void c(float f10, float f11) {
        this.f29624c.postTranslate(f10, f11);
    }

    public final void d(Bitmap bitmap, int i10) {
        a aVar;
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
        }
        p278w8.f fVar = this.f29627f;
        Bitmap bitmap2 = fVar.f47804a;
        fVar.f47804a = bitmap;
        fVar.f47805b = i10;
        if (bitmap2 == null || bitmap2 == bitmap || (aVar = this.f29632l) == null) {
            return;
        }
        ((com.voltas.crop.a) aVar).getClass();
        bitmap2.recycle();
        System.gc();
    }

    public final void e(p278w8.f fVar) {
        if (getWidth() <= 0) {
            this.j = new i(this, 2, fVar);
            return;
        }
        Bitmap bitmap = fVar.f47804a;
        Matrix matrix = this.f29623b;
        if (bitmap != null) {
            b(fVar, matrix, true);
            d(fVar.f47804a, fVar.f47805b);
        } else {
            matrix.reset();
            setImageBitmap(null);
        }
        this.f29624c.reset();
        setImageMatrix(getImageViewMatrix());
        p278w8.f fVar2 = this.f29627f;
        this.f29630i = fVar2.f47804a == null ? 1.0f : Math.max(fVar2.b() / this.f29628g, fVar2.a() / this.f29629h) * 4.0f;
    }

    public void f(float f10, float f11, float f12) {
        float f13 = this.f29630i;
        if (f10 > f13) {
            f10 = f13;
        }
        float scale = f10 / getScale();
        this.f29624c.postScale(scale, scale, f11, f12);
        setImageMatrix(getImageViewMatrix());
        a();
    }

    public Matrix getImageViewMatrix() {
        Matrix matrix = this.f29625d;
        matrix.set(this.f29623b);
        matrix.postConcat(this.f29624c);
        return matrix;
    }

    public float getScale() {
        Matrix matrix = this.f29624c;
        float[] fArr = this.f29626e;
        matrix.getValues(fArr);
        return fArr[0];
    }

    public Matrix getUnrotatedMatrix() {
        Matrix matrix = new Matrix();
        b(this.f29627f, matrix, false);
        matrix.postConcat(this.f29624c);
        return matrix;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !keyEvent.isTracking() || keyEvent.isCanceled() || getScale() <= 1.0f) {
            return super.onKeyUp(i10, keyEvent);
        }
        f(1.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        return true;
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f29628g = i12 - i10;
        this.f29629h = i13 - i11;
        i iVar = this.j;
        if (iVar != null) {
            this.j = null;
            iVar.run();
        }
        p278w8.f fVar = this.f29627f;
        if (fVar.f47804a != null) {
            b(fVar, this.f29623b, true);
            setImageMatrix(getImageViewMatrix());
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        d(bitmap, 0);
    }

    public void setRecycler(a aVar) {
        this.f29632l = aVar;
    }
}
