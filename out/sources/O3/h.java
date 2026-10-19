package O3;

import D3.o;
import android.graphics.Bitmap;
import java.io.IOException;

/* JADX INFO: compiled from: GifFrameResourceDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class h implements A3.e<p310z3.a, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E3.c f4839a;

    public h(E3.c cVar) {
        this.f4839a = cVar;
    }

    @Override // A3.e
    public final /* bridge */ /* synthetic */ boolean a(p310z3.a aVar, A3.d dVar) throws IOException {
        return true;
    }

    @Override // A3.e
    public final o<Bitmap> b(p310z3.a aVar, int i10, int i11, A3.d dVar) throws IOException {
        return K3.d.d(this.f4839a, aVar.a());
    }
}
