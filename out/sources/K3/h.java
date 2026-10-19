package K3;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: compiled from: CenterInside.java */
/* JADX INFO: loaded from: classes.dex */
public final class h extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f4253b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(A3.b.f574a);

    @Override // A3.b
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f4253b);
    }

    @Override // K3.e
    public final Bitmap c(E3.c cVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = q.f4270a;
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            Log.isLoggable("TransformationUtils", 2);
            return q.b(cVar, bitmap, i10, i11);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    @Override // A3.b
    public final boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // A3.b
    public final int hashCode() {
        return -670243078;
    }
}
