package K3;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: compiled from: CenterCrop.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f4252b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(A3.b.f574a);

    @Override // A3.b
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f4252b);
    }

    @Override // K3.e
    public final Bitmap c(E3.c cVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        Paint paint = q.f4270a;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            width2 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapD = cVar.d(i10, i11, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapD.setHasAlpha(bitmap.hasAlpha());
        q.a(bitmap, bitmapD, matrix);
        return bitmapD;
    }

    @Override // A3.b
    public final boolean equals(Object obj) {
        return obj instanceof g;
    }

    @Override // A3.b
    public final int hashCode() {
        return -599754482;
    }
}
