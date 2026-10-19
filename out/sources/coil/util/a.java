package coil.util;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: Bitmaps.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final int a(Bitmap bitmap) {
        int i10;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config = bitmap.getConfig();
            if (config == Bitmap.Config.ALPHA_8) {
                i10 = 1;
            } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                i10 = 2;
            } else {
                i10 = config == Bitmap.Config.RGBA_F16 ? 8 : 4;
            }
            return i10 * height;
        }
    }
}
