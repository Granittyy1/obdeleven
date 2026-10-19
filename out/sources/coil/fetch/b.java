package coil.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.decode.DataSource;

/* JADX INFO: compiled from: BitmapFetcher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f22975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final coil.request.k f22976b;

    /* JADX INFO: compiled from: BitmapFetcher.kt */
    public static final class a implements h.a<Bitmap> {
        @Override // coil.fetch.h.a
        public final h a(Object obj, coil.request.k kVar) {
            return new b((Bitmap) obj, kVar);
        }
    }

    public b(Bitmap bitmap, coil.request.k kVar) {
        this.f22975a = bitmap;
        this.f22976b = kVar;
    }

    @Override // coil.fetch.h
    public final Object a(kotlin.coroutines.c<? super g> cVar) {
        return new f(new BitmapDrawable(this.f22976b.f23098a.getResources(), this.f22975a), false, DataSource.f22858c);
    }
}
