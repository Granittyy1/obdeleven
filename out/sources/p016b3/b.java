package p016b3;

import Z2.e;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.coroutines.c;

/* JADX INFO: compiled from: CircleCropTransformation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20542a = b.class.getName();

    public final boolean equals(Object obj) {
        return obj instanceof b;
    }

    @Override // p016b3.d
    public final String getCacheKey() {
        return this.f20542a;
    }

    public final int hashCode() {
        return b.class.hashCode();
    }

    @Override // p016b3.d
    public final Object transform(Bitmap bitmap, e eVar, c<? super Bitmap> cVar) {
        Paint paint = new Paint(3);
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f10 = iMin / 2.0f;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawCircle(f10, f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f10 - (bitmap.getWidth() / 2.0f), f10 - (bitmap.getHeight() / 2.0f), paint);
        return bitmapCreateBitmap;
    }
}
