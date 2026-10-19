package L3;

import D3.o;
import com.google.android.gms.internal.measurement.M1;

/* JADX INFO: compiled from: BytesResource.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o<byte[]> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f4466b;

    public b(byte[] bArr) {
        M1.d(bArr, "Argument must not be null");
        this.f4466b = bArr;
    }

    @Override // D3.o
    public final Class<byte[]> c() {
        return byte[].class;
    }

    @Override // D3.o
    public final byte[] get() {
        return this.f4466b;
    }

    @Override // D3.o
    public final int getSize() {
        return this.f4466b.length;
    }

    @Override // D3.o
    public final void a() {
    }
}
