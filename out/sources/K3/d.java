package K3;

import android.graphics.Bitmap;
import com.google.android.gms.internal.measurement.M1;

/* JADX INFO: compiled from: BitmapResource.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements D3.o<Bitmap>, D3.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f4249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E3.c f4250c;

    public d(E3.c cVar, Bitmap bitmap) {
        M1.d(bitmap, "Bitmap must not be null");
        this.f4249b = bitmap;
        M1.d(cVar, "BitmapPool must not be null");
        this.f4250c = cVar;
    }

    public static d d(E3.c cVar, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new d(cVar, bitmap);
    }

    @Override // D3.o
    public final void a() {
        this.f4250c.c(this.f4249b);
    }

    @Override // D3.k
    public final void b() {
        this.f4249b.prepareToDraw();
    }

    @Override // D3.o
    public final Class<Bitmap> c() {
        return Bitmap.class;
    }

    @Override // D3.o
    public final Bitmap get() {
        return this.f4249b;
    }

    @Override // D3.o
    public final int getSize() {
        return X3.j.c(this.f4249b);
    }
}
