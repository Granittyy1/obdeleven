package coil.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import coil.decode.DataSource;
import coil.util.p;

/* JADX INFO: compiled from: DrawableFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f22981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final coil.request.k f22982b;

    /* JADX INFO: compiled from: DrawableFetcher.kt */
    public static final class a implements h.a<Drawable> {
        @Override // coil.fetch.h.a
        public final h a(Object obj, coil.request.k kVar) {
            return new e((Drawable) obj, kVar);
        }
    }

    public e(Drawable drawable, coil.request.k kVar) {
        this.f22981a = drawable;
        this.f22982b = kVar;
    }

    @Override // coil.fetch.h
    public final Object a(kotlin.coroutines.c<? super g> cVar) {
        Drawable bitmapDrawable = this.f22981a;
        Bitmap.Config[] configArr = coil.util.k.f23160a;
        boolean z10 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof E2.g);
        if (z10) {
            coil.request.k kVar = this.f22982b;
            bitmapDrawable = new BitmapDrawable(kVar.f23098a.getResources(), p.a(bitmapDrawable, kVar.f23099b, kVar.f23101d, kVar.f23102e, kVar.f23103f));
        }
        return new f(bitmapDrawable, z10, DataSource.f22858c);
    }
}
