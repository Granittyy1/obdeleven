package E3;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: BitmapPoolAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class d implements c {
    @Override // E3.c
    public final Bitmap b(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // E3.c
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // E3.c
    public final Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // E3.c
    public final void e() {
    }

    @Override // E3.c
    public final void a(int i10) {
    }
}
