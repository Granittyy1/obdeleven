package K3;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class o implements A3.e<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.a f4267a;

    public o(com.bumptech.glide.load.resource.bitmap.a aVar) {
        this.f4267a = aVar;
    }

    @Override // A3.e
    public final boolean a(ParcelFileDescriptor parcelFileDescriptor, A3.d dVar) throws IOException {
        return true;
    }

    @Override // A3.e
    public final D3.o<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, A3.d dVar) throws IOException {
        com.bumptech.glide.load.resource.bitmap.a aVar = this.f4267a;
        return aVar.a(new com.bumptech.glide.load.resource.bitmap.b.C0261b(parcelFileDescriptor, aVar.f24686d, aVar.f24685c), i10, i11, dVar, com.bumptech.glide.load.resource.bitmap.a.f24680k);
    }
}
