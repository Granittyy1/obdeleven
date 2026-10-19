package p278w8;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: RotateBitmap.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap f47804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47805b;

    public f(Bitmap bitmap, int i10) {
        this.f47804a = bitmap;
        this.f47805b = i10 % 360;
    }

    public final int a() {
        Bitmap bitmap = this.f47804a;
        if (bitmap == null) {
            return 0;
        }
        return (this.f47805b / 90) % 2 != 0 ? bitmap.getWidth() : bitmap.getHeight();
    }

    public final int b() {
        Bitmap bitmap = this.f47804a;
        if (bitmap == null) {
            return 0;
        }
        return (this.f47805b / 90) % 2 != 0 ? bitmap.getHeight() : bitmap.getWidth();
    }
}
