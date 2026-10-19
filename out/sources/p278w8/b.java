package p278w8;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.voltas.crop.CropImageActivity;
import com.voltas.crop.HighlightView;
import com.voltas.crop.d;
import com.voltasit.obdeleven.R;

/* JADX INFO: compiled from: CropImageActivity.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CropImageActivity f47794b;

    public b(CropImageActivity cropImageActivity) {
        this.f47794b = cropImageActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        int i10;
        CropImageActivity cropImageActivity = this.f47794b;
        HighlightView highlightView = cropImageActivity.f29577p;
        if (highlightView == null || cropImageActivity.f29573l) {
            return;
        }
        cropImageActivity.f29573l = true;
        float f10 = cropImageActivity.f29574m;
        RectF rectF = highlightView.f29589b;
        Rect rectB = HighlightView.b(new Rect((int) (rectF.left * f10), (int) (rectF.top * f10), (int) (rectF.right * f10), (int) (rectF.bottom * f10)), cropImageActivity.f29578q);
        int iWidth = rectB.width();
        int iHeight = rectB.height();
        int i11 = cropImageActivity.f29568f;
        if (i11 > 0 && (i10 = cropImageActivity.f29569g) > 0 && (iWidth > i11 || iHeight > i10)) {
            float f11 = iWidth / iHeight;
            float f12 = i11;
            float f13 = i10;
            if (f12 / f13 > f11) {
                iWidth = (int) ((f13 * f11) + 0.5f);
                iHeight = i10;
            } else {
                iHeight = (int) ((f12 / f11) + 0.5f);
                iWidth = i11;
            }
        }
        if (cropImageActivity.f29578q && iHeight <= iWidth) {
            iHeight = iWidth;
        }
        try {
            Bitmap bitmapB = cropImageActivity.b(rectB, iWidth, iHeight);
            if (bitmapB != null) {
                cropImageActivity.f29576o.e(new f(bitmapB, cropImageActivity.f29570h));
                cropImageActivity.f29576o.a();
                cropImageActivity.f29576o.f29580m.clear();
            }
            if (bitmapB == null) {
                cropImageActivity.finish();
            } else {
                new Thread(new d.a(cropImageActivity, new c(cropImageActivity, bitmapB), ProgressDialog.show(cropImageActivity, null, cropImageActivity.getResources().getString(R.string.crop__saving), true, false), cropImageActivity.f29565c)).start();
            }
        } catch (IllegalArgumentException e10) {
            cropImageActivity.c(e10);
            cropImageActivity.finish();
        }
    }
}
