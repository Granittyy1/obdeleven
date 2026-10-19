package com.voltas.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class CropImageView extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList<HighlightView> f29580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HighlightView f29581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CropImageActivity f29582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f29583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f29584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f29585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f29586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f29587t;

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29580m = new ArrayList<>();
    }

    @Override // com.voltas.crop.e
    public final void c(float f10, float f11) {
        super.c(f10, f11);
        for (HighlightView highlightView : this.f29580m) {
            highlightView.f29591d.postTranslate(f10, f11);
            highlightView.f29590c = highlightView.a();
        }
    }

    @Override // com.voltas.crop.e
    public final void f(float f10, float f11, float f12) {
        super.f(f10, f11, f12);
        for (HighlightView highlightView : this.f29580m) {
            highlightView.f29591d.set(getUnrotatedMatrix());
            highlightView.f29590c = highlightView.a();
        }
    }

    public final void g(HighlightView highlightView) {
        Rect rectB = HighlightView.b(highlightView.f29590c, this.f29587t);
        float fMax = Math.max(1.0f, getScale() * Math.min((getWidth() / rectB.width()) * 0.6f, (getHeight() / rectB.height()) * 0.6f));
        RectF rectF = highlightView.f29589b;
        Rect rectB2 = HighlightView.b(new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom), this.f29587t);
        if (Math.abs(fMax - getScale()) / fMax > 0.1d) {
            float[] fArr = {rectB2.centerX(), rectB2.centerY()};
            getUnrotatedMatrix().mapPoints(fArr);
            float f10 = fArr[0];
            float f11 = fArr[1];
            this.f29631k.post(new p278w8.d(this, System.currentTimeMillis(), getScale(), (fMax - getScale()) / 300.0f, f10, f11));
        }
        Rect rectB3 = HighlightView.b(highlightView.f29590c, this.f29587t);
        int iMax = Math.max(0, getLeft() - rectB3.left);
        int iMin = Math.min(0, getRight() - rectB3.right);
        int iMax2 = Math.max(0, getTop() - rectB3.top);
        int iMin2 = Math.min(0, getBottom() - rectB3.bottom);
        if (iMax == 0) {
            iMax = iMin;
        }
        if (iMax2 == 0) {
            iMax2 = iMin2;
        }
        if (iMax == 0 && iMax2 == 0) {
            return;
        }
        c(iMax, iMax2);
        setImageMatrix(getImageViewMatrix());
    }

    @Override // com.voltas.crop.e
    public /* bridge */ /* synthetic */ Matrix getUnrotatedMatrix() {
        return super.getUnrotatedMatrix();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (HighlightView highlightView : this.f29580m) {
            Rect rect = highlightView.f29590c;
            boolean z10 = highlightView.f29588a;
            if (z10) {
                int i10 = ((rect.bottom - rect.top) - (rect.right - rect.left)) / 2;
                rect = new Rect(rect.left - i10, rect.top + i10, rect.right + i10, rect.bottom - i10);
            }
            Path path = new Path();
            RectF rectF = new RectF(rect);
            Path.Direction direction = Path.Direction.CW;
            path.addRect(rectF, direction);
            canvas.save();
            Path path2 = new Path();
            Paint paint = highlightView.f29594g;
            paint.setStrokeWidth(highlightView.f29604r);
            if (highlightView.f29605s) {
                Rect rect2 = new Rect();
                highlightView.f29596i.getDrawingRect(rect2);
                path2.addRect(new RectF(highlightView.f29590c), direction);
                paint.setColor(highlightView.f29598l);
                Region.Op op = Region.Op.DIFFERENCE;
                canvas.clipPath(path2, op);
                canvas.clipPath(path, op);
                canvas.drawRect(rect2, highlightView.f29593f);
                canvas.restore();
                canvas.drawPath(path2, paint);
                if (z10) {
                    canvas.drawPath(path, paint);
                }
                if (highlightView.j) {
                    paint.setStrokeWidth(1.0f);
                    Rect rect3 = highlightView.f29590c;
                    int i11 = rect3.right;
                    int i12 = rect3.left;
                    float f10 = (i11 - i12) / 3;
                    int i13 = rect3.bottom;
                    int i14 = rect3.top;
                    float f11 = (i13 - i14) / 3;
                    float f12 = i12 + f10;
                    canvas.drawLine(f12, i14, f12, i13, paint);
                    Rect rect4 = highlightView.f29590c;
                    float f13 = (f10 * 2.0f) + rect4.left;
                    canvas.drawLine(f13, rect4.top, f13, rect4.bottom, paint);
                    Rect rect5 = highlightView.f29590c;
                    float f14 = rect5.left;
                    float f15 = rect5.top + f11;
                    canvas.drawLine(f14, f15, rect5.right, f15, paint);
                    Rect rect6 = highlightView.f29590c;
                    float f16 = rect6.left;
                    float f17 = (f11 * 2.0f) + rect6.top;
                    canvas.drawLine(f16, f17, rect6.right, f17, paint);
                }
                if (highlightView.f29597k) {
                    paint.setStrokeWidth(1.0f);
                    canvas.drawOval(new RectF(highlightView.f29590c), paint);
                }
                HighlightView.HandleMode handleMode = highlightView.f29600n;
                if (handleMode == HighlightView.HandleMode.f29607c || (handleMode == HighlightView.HandleMode.f29606b && highlightView.f29599m == HighlightView.ModifyMode.f29611d)) {
                    Rect rect7 = highlightView.f29590c;
                    int i15 = rect7.left;
                    int i16 = ((rect7.right - i15) / 2) + i15;
                    int i17 = rect7.top;
                    float f18 = ((rect7.bottom - i17) / 2) + i17;
                    float f19 = highlightView.f29603q;
                    Paint paint2 = highlightView.f29595h;
                    canvas.drawCircle(i15, f18, f19, paint2);
                    float f20 = i16;
                    canvas.drawCircle(f20, highlightView.f29590c.top, highlightView.f29603q, paint2);
                    canvas.drawCircle(highlightView.f29590c.right, f18, highlightView.f29603q, paint2);
                    canvas.drawCircle(f20, highlightView.f29590c.bottom, highlightView.f29603q, paint2);
                }
            } else {
                paint.setColor(-16777216);
                canvas.drawRect(highlightView.f29590c, paint);
                canvas.drawRect(rect, paint);
            }
        }
    }

    @Override // com.voltas.crop.e, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f29627f.f47804a != null) {
            for (HighlightView highlightView : this.f29580m) {
                highlightView.f29591d.set(getUnrotatedMatrix());
                highlightView.f29590c = highlightView.a();
                if (highlightView.f29605s) {
                    g(highlightView);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f29582o.f29573l) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            for (HighlightView highlightView : this.f29580m) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Rect rectA = highlightView.a();
                boolean z10 = y10 >= ((float) rectA.top) - 20.0f && y10 < ((float) rectA.bottom) + 20.0f;
                float f10 = rectA.left;
                boolean z11 = x10 >= f10 - 20.0f && x10 < ((float) rectA.right) + 20.0f;
                int i10 = (Math.abs(f10 - x10) >= 20.0f || !z10) ? 1 : 3;
                if (Math.abs(rectA.right - x10) < 20.0f && z10) {
                    i10 |= 4;
                }
                if (Math.abs(rectA.top - y10) < 20.0f && z11) {
                    i10 |= 8;
                }
                if (Math.abs(rectA.bottom - y10) < 20.0f && z11) {
                    i10 |= 16;
                }
                if (i10 == 1 && rectA.contains((int) x10, (int) y10)) {
                    i10 = 32;
                }
                if (i10 != 1) {
                    this.f29585r = i10;
                    this.f29581n = highlightView;
                    this.f29583p = motionEvent.getX();
                    this.f29584q = motionEvent.getY();
                    this.f29586s = motionEvent.getPointerId(motionEvent.getActionIndex());
                    HighlightView highlightView2 = this.f29581n;
                    HighlightView.ModifyMode modifyMode = i10 == 32 ? HighlightView.ModifyMode.f29610c : HighlightView.ModifyMode.f29611d;
                    if (modifyMode == highlightView2.f29599m) {
                        break;
                    }
                    highlightView2.f29599m = modifyMode;
                    highlightView2.f29596i.invalidate();
                    break;
                }
            }
        } else if (action == 1) {
            HighlightView highlightView3 = this.f29581n;
            if (highlightView3 != null) {
                g(highlightView3);
                HighlightView highlightView4 = this.f29581n;
                HighlightView.ModifyMode modifyMode2 = HighlightView.ModifyMode.f29609b;
                if (modifyMode2 != highlightView4.f29599m) {
                    highlightView4.f29599m = modifyMode2;
                    highlightView4.f29596i.invalidate();
                }
            }
            this.f29581n = null;
            a();
        } else if (action == 2) {
            if (this.f29581n != null && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f29586s) {
                HighlightView highlightView5 = this.f29581n;
                int i11 = this.f29585r;
                float x11 = motionEvent.getX() - this.f29583p;
                float y11 = motionEvent.getY() - this.f29584q;
                Rect rectA2 = highlightView5.a();
                boolean z12 = highlightView5.f29588a;
                Rect rectB = HighlightView.b(rectA2, z12);
                int iMax = Math.max(rectA2.width(), rectB.width());
                int iMax2 = Math.max(rectA2.height(), rectB.height());
                View view = highlightView5.f29596i;
                if (i11 == 32) {
                    float fWidth = (highlightView5.f29589b.width() / iMax) * x11;
                    float fHeight = (highlightView5.f29589b.height() / iMax2) * y11;
                    Rect rectB2 = HighlightView.b(highlightView5.f29590c, z12);
                    highlightView5.f29589b.offset(fWidth, fHeight);
                    RectF rectF = highlightView5.f29589b;
                    Rect rectB3 = HighlightView.b(new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom), z12);
                    highlightView5.f29589b.offset(Math.max(0.0f, highlightView5.f29592e.left - rectB3.left), Math.max(0.0f, highlightView5.f29592e.top - rectB3.top));
                    highlightView5.f29589b.offset(Math.min(0.0f, highlightView5.f29592e.right - rectB3.right), Math.min(0.0f, highlightView5.f29592e.bottom - rectB3.bottom));
                    Rect rectA3 = highlightView5.a();
                    highlightView5.f29590c = rectA3;
                    rectB2.union(rectA3);
                    int i12 = -((int) highlightView5.f29603q);
                    rectB2.inset(i12, i12);
                    view.invalidate(rectB2);
                } else {
                    if ((i11 & 6) == 0) {
                        x11 = 0.0f;
                    }
                    if ((i11 & 24) == 0) {
                        y11 = 0.0f;
                    }
                    float fWidth2 = (highlightView5.f29589b.width() / iMax) * x11;
                    float fHeight2 = (highlightView5.f29589b.height() / iMax2) * y11;
                    float fWidth3 = ((i11 & 2) != 0 ? -1 : 1) * fWidth2;
                    float fHeight3 = ((i11 & 8) == 0 ? 1 : -1) * fHeight2;
                    if (highlightView5.f29601o) {
                        if (fWidth3 != 0.0f) {
                            fHeight3 = fWidth3 / highlightView5.f29602p;
                        } else if (fHeight3 != 0.0f) {
                            fWidth3 = fHeight3 * highlightView5.f29602p;
                        }
                    }
                    RectF rectF2 = new RectF(highlightView5.f29589b);
                    RectF rectF3 = new RectF(HighlightView.b(new Rect((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom), z12));
                    if (fWidth3 > 0.0f) {
                        if ((fWidth3 * 2.0f) + rectF3.width() > highlightView5.f29592e.width()) {
                            fWidth3 = (highlightView5.f29592e.width() - rectF3.width()) / 2.0f;
                            if (highlightView5.f29601o) {
                                fHeight3 = fWidth3 / highlightView5.f29602p;
                            }
                        }
                    }
                    if (fHeight3 > 0.0f) {
                        if ((fHeight3 * 2.0f) + rectF3.height() > highlightView5.f29592e.height()) {
                            fHeight3 = (highlightView5.f29592e.height() - rectF3.height()) / 2.0f;
                            if (highlightView5.f29601o) {
                                fWidth3 = fHeight3 * highlightView5.f29602p;
                            }
                        }
                    }
                    rectF2.inset(-fWidth3, -fHeight3);
                    if (rectF2.width() < 25.0f) {
                        rectF2.inset((-(25.0f - rectF2.width())) / 2.0f, 0.0f);
                    }
                    float f11 = highlightView5.f29601o ? 25.0f / highlightView5.f29602p : 25.0f;
                    if (rectF2.height() < f11) {
                        rectF2.inset(0.0f, (-(f11 - rectF2.height())) / 2.0f);
                    }
                    RectF rectF4 = new RectF(HighlightView.b(new Rect((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom), z12));
                    float f12 = rectF4.left;
                    RectF rectF5 = highlightView5.f29592e;
                    float f13 = rectF5.left;
                    if (f12 < f13) {
                        rectF2.offset(f13 - f12, 0.0f);
                    } else {
                        float f14 = rectF4.right;
                        float f15 = rectF5.right;
                        if (f14 > f15) {
                            rectF2.offset(-(f14 - f15), 0.0f);
                        }
                    }
                    float f16 = rectF4.top;
                    RectF rectF6 = highlightView5.f29592e;
                    float f17 = rectF6.top;
                    if (f16 < f17) {
                        rectF2.offset(0.0f, f17 - f16);
                    } else {
                        float f18 = rectF4.bottom;
                        float f19 = rectF6.bottom;
                        if (f18 > f19) {
                            rectF2.offset(0.0f, -(f18 - f19));
                        }
                    }
                    highlightView5.f29589b.set(rectF2);
                    highlightView5.f29590c = highlightView5.a();
                    view.invalidate();
                }
                this.f29583p = motionEvent.getX();
                this.f29584q = motionEvent.getY();
            }
            if (getScale() == 1.0f) {
                a();
            }
        }
        return true;
    }

    @Override // com.voltas.crop.e, android.widget.ImageView
    public /* bridge */ /* synthetic */ void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    public void setMultiOrientationEnabled(boolean z10) {
        this.f29587t = z10;
    }

    @Override // com.voltas.crop.e
    public /* bridge */ /* synthetic */ void setRecycler(e.a aVar) {
        super.setRecycler(aVar);
    }
}
