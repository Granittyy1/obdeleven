package io.intercom.android.sdk.utilities.coil;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import kotlin.coroutines.c;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p016b3.d;

/* JADX INFO: compiled from: GrayscaleTransformation.kt */
/* JADX INFO: loaded from: classes.dex */
public final class GrayscaleTransformation implements d {
    public static final int $stable = 0;
    private static final ColorMatrixColorFilter COLOR_FILTER;
    private static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: GrayscaleTransformation.kt */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final ColorMatrixColorFilter getCOLOR_FILTER() {
            return GrayscaleTransformation.COLOR_FILTER;
        }

        private Companion() {
        }
    }

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        COLOR_FILTER = new ColorMatrixColorFilter(colorMatrix);
    }

    public boolean equals(Object obj) {
        return obj instanceof GrayscaleTransformation;
    }

    @Override // p016b3.d
    public String getCacheKey() {
        return GrayscaleTransformation.class.getName();
    }

    public int hashCode() {
        return GrayscaleTransformation.class.hashCode();
    }

    public String toString() {
        return "GrayscaleTransformation()";
    }

    @Override // p016b3.d
    public Object transform(Bitmap bitmap, Z2.e eVar, c<? super Bitmap> cVar) {
        Paint paint = new Paint(3);
        paint.setColorFilter(COLOR_FILTER);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        i.d(bitmapCreateBitmap, "createBitmap(...)");
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}
