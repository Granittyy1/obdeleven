package P3;

import D3.o;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: DrawableBytesTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e<Drawable, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E3.c f4916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f4918c;

    public c(E3.c cVar, a aVar, d dVar) {
        this.f4916a = cVar;
        this.f4917b = aVar;
        this.f4918c = dVar;
    }

    @Override // P3.e
    public final o<byte[]> b(o<Drawable> oVar, A3.d dVar) {
        Drawable drawable = oVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f4917b.b(K3.d.d(this.f4916a, ((BitmapDrawable) drawable).getBitmap()), dVar);
        }
        if (drawable instanceof O3.c) {
            return this.f4918c.b(oVar, dVar);
        }
        return null;
    }
}
