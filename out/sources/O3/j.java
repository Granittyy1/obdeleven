package O3;

import D3.o;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: StreamGifDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class j implements A3.e<InputStream, c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E3.h f4844c;

    public j(ArrayList arrayList, a aVar, E3.h hVar) {
        this.f4842a = arrayList;
        this.f4843b = aVar;
        this.f4844c = hVar;
    }

    @Override // A3.e
    public final boolean a(InputStream inputStream, A3.d dVar) throws IOException {
        InputStream inputStream2 = inputStream;
        if (!((Boolean) dVar.c(i.f4841b)).booleanValue()) {
            if (com.bumptech.glide.load.a.b(this.f4844c, inputStream2, this.f4842a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Override // A3.e
    public final o<c> b(InputStream inputStream, int i10, int i11, A3.d dVar) throws IOException {
        byte[] byteArray;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i12 = inputStream2.read(bArr);
                if (i12 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i12);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Log.isLoggable("StreamGifDecoder", 5);
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f4843b.b(ByteBuffer.wrap(byteArray), i10, i11, dVar);
    }
}
