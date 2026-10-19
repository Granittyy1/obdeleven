package androidx.compose.ui.graphics;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: AndroidImageBitmap.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final Bitmap a(W w3) {
        if (w3 instanceof C1141q) {
            return ((C1141q) w3).f13790a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final Bitmap.Config b(int i10) {
        if (X.a(i10, 0)) {
            return Bitmap.Config.ARGB_8888;
        }
        if (X.a(i10, 1)) {
            return Bitmap.Config.ALPHA_8;
        }
        if (X.a(i10, 2)) {
            return Bitmap.Config.RGB_565;
        }
        if (X.a(i10, 3)) {
            return Bitmap.Config.RGBA_F16;
        }
        return X.a(i10, 4) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }
}
