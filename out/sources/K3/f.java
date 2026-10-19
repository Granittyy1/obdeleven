package K3;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteBufferBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class f implements A3.e<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.a f4251a;

    public f(com.bumptech.glide.load.resource.bitmap.a aVar) {
        this.f4251a = aVar;
    }

    @Override // A3.e
    public final boolean a(ByteBuffer byteBuffer, A3.d dVar) throws IOException {
        return true;
    }

    @Override // A3.e
    public final D3.o<Bitmap> b(ByteBuffer byteBuffer, int i10, int i11, A3.d dVar) throws IOException {
        int i12 = X3.a.f7191a;
        X3.a.C0102a c0102a = new X3.a.C0102a(byteBuffer);
        com.bumptech.glide.load.resource.bitmap.a.C0260a c0260a = com.bumptech.glide.load.resource.bitmap.a.f24680k;
        com.bumptech.glide.load.resource.bitmap.a aVar = this.f4251a;
        return aVar.a(new com.bumptech.glide.load.resource.bitmap.b.a(aVar.f24685c, c0102a, aVar.f24686d), i10, i11, dVar, c0260a);
    }
}
