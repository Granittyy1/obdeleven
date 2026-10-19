package P3;

import D3.o;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: BitmapBytesTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.CompressFormat f4912a = Bitmap.CompressFormat.JPEG;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4913b = 100;

    @Override // P3.e
    public final o<byte[]> b(o<Bitmap> oVar, A3.d dVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        oVar.get().compress(this.f4912a, this.f4913b, byteArrayOutputStream);
        oVar.a();
        return new L3.b(byteArrayOutputStream.toByteArray());
    }
}
