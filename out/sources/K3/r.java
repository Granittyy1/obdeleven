package K3;

import android.graphics.Bitmap;
import java.io.IOException;

/* JADX INFO: compiled from: UnitBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class r implements A3.e<Bitmap, Bitmap> {
    @Override // A3.e
    public final /* bridge */ /* synthetic */ boolean a(Bitmap bitmap, A3.d dVar) throws IOException {
        return true;
    }

    @Override // A3.e
    public final D3.o<Bitmap> b(Bitmap bitmap, int i10, int i11, A3.d dVar) throws IOException {
        return new a(bitmap);
    }

    /* JADX INFO: compiled from: UnitBitmapDecoder.java */
    public static final class a implements D3.o<Bitmap> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bitmap f4272b;

        public a(Bitmap bitmap) {
            this.f4272b = bitmap;
        }

        @Override // D3.o
        public final Class<Bitmap> c() {
            return Bitmap.class;
        }

        @Override // D3.o
        public final Bitmap get() {
            return this.f4272b;
        }

        @Override // D3.o
        public final int getSize() {
            return X3.j.c(this.f4272b);
        }

        @Override // D3.o
        public final void a() {
        }
    }
}
