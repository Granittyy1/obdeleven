package K3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.gms.internal.measurement.M1;

/* JADX INFO: compiled from: LazyBitmapDrawableResource.java */
/* JADX INFO: loaded from: classes.dex */
public final class n implements D3.o<BitmapDrawable>, D3.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f4265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D3.o<Bitmap> f4266c;

    public n(Resources resources, D3.o<Bitmap> oVar) {
        M1.d(resources, "Argument must not be null");
        this.f4265b = resources;
        M1.d(oVar, "Argument must not be null");
        this.f4266c = oVar;
    }

    @Override // D3.o
    public final void a() {
        this.f4266c.a();
    }

    @Override // D3.k
    public final void b() {
        D3.o<Bitmap> oVar = this.f4266c;
        if (oVar instanceof D3.k) {
            ((D3.k) oVar).b();
        }
    }

    @Override // D3.o
    public final Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    @Override // D3.o
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.f4265b, this.f4266c.get());
    }

    @Override // D3.o
    public final int getSize() {
        return this.f4266c.getSize();
    }
}
