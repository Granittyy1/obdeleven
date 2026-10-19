package K3;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: compiled from: FitCenter.java */
/* JADX INFO: loaded from: classes.dex */
public final class l extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f4257b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(A3.b.f574a);

    @Override // A3.b
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f4257b);
    }

    @Override // K3.e
    public final Bitmap c(E3.c cVar, Bitmap bitmap, int i10, int i11) {
        return q.b(cVar, bitmap, i10, i11);
    }

    @Override // A3.b
    public final boolean equals(Object obj) {
        return obj instanceof l;
    }

    @Override // A3.b
    public final int hashCode() {
        return 1572326941;
    }
}
