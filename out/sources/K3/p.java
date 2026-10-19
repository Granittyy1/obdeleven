package K3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;

/* JADX INFO: compiled from: ResourceBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class p implements A3.e<Uri, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M3.d f4268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E3.c f4269b;

    public p(M3.d dVar, E3.c cVar) {
        this.f4268a = dVar;
        this.f4269b = cVar;
    }

    @Override // A3.e
    public final boolean a(Uri uri, A3.d dVar) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // A3.e
    public final D3.o<Bitmap> b(Uri uri, int i10, int i11, A3.d dVar) throws IOException {
        D3.o oVarC = this.f4268a.c(uri);
        if (oVarC == null) {
            return null;
        }
        return i.a(this.f4269b, (Drawable) ((M3.b) oVarC).get(), i10, i11);
    }
}
