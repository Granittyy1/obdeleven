package com.voltas.crop;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CropImageActivity.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CropImageActivity.a f29616b;

    public c(CropImageActivity.a aVar) {
        this.f29616b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        CropImageActivity cropImageActivity = CropImageActivity.this;
        if (cropImageActivity.f29575n != null) {
            HighlightView highlightView = new HighlightView(cropImageActivity.f29576o, cropImageActivity.f29578q);
            int iB = cropImageActivity.f29575n.b();
            int iA = cropImageActivity.f29575n.a();
            Rect rect = new Rect(0, 0, iB, iA);
            int iMin = (Math.min(iB, iA) * 4) / 5;
            int i12 = cropImageActivity.f29566d;
            if (i12 == 0 || (i11 = cropImageActivity.f29567e) == 0) {
                i10 = iMin;
            } else if (i12 > i11) {
                i10 = (i11 * iMin) / i12;
            } else {
                int i13 = (i12 * iMin) / i11;
                i10 = iMin;
                iMin = i13;
            }
            int i14 = (iB - iMin) / 2;
            int i15 = (iA - i10) / 2;
            RectF rectF = new RectF(i14, i15, i14 + iMin, i15 + i10);
            Matrix unrotatedMatrix = cropImageActivity.f29576o.getUnrotatedMatrix();
            boolean z10 = (cropImageActivity.f29566d == 0 || cropImageActivity.f29567e == 0) ? false : true;
            highlightView.f29591d = new Matrix(unrotatedMatrix);
            highlightView.f29589b = rectF;
            highlightView.f29592e = new RectF(rect);
            highlightView.f29601o = z10;
            highlightView.f29602p = highlightView.f29589b.width() / highlightView.f29589b.height();
            highlightView.f29590c = highlightView.a();
            highlightView.f29593f.setARGB(R.styleable.AppCompatTheme_windowMinWidthMinor, 50, 50, 50);
            Paint paint = highlightView.f29594g;
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            highlightView.f29604r = 2.0f * highlightView.f29596i.getResources().getDisplayMetrics().density;
            Paint paint2 = highlightView.f29595h;
            paint2.setColor(highlightView.f29598l);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            highlightView.f29603q = 12.0f * highlightView.f29596i.getResources().getDisplayMetrics().density;
            highlightView.f29599m = HighlightView.ModifyMode.f29609b;
            CropImageView cropImageView = cropImageActivity.f29576o;
            cropImageView.f29580m.add(highlightView);
            cropImageView.invalidate();
        }
        cropImageActivity.f29576o.invalidate();
        if (cropImageActivity.f29576o.f29580m.size() == 1) {
            cropImageActivity.f29577p = cropImageActivity.f29576o.f29580m.get(0);
            cropImageActivity.f29577p.f29605s = true;
        }
    }
}
