package p087gb;

import net.lingala.zip4j.exception.ZipException;
import p112ib.b;

/* JADX INFO: compiled from: StandardDecrypter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f35686a;

    @Override // p087gb.b
    public final int a(byte[] bArr, int i10, int i11) throws ZipException {
        b bVar = this.f35686a;
        if (i10 < 0 || i11 < 0) {
            throw new ZipException("one of the input parameters were null in standard decrpyt data");
        }
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            try {
                int i13 = bArr[i12] & 255;
                int i14 = bVar.f36861a[2] | 2;
                byte b10 = (byte) ((i13 ^ ((byte) ((i14 * (i14 ^ 1)) >>> 8))) & 255);
                bVar.a(b10);
                bArr[i12] = b10;
            } catch (Exception e10) {
                throw new ZipException(e10);
            }
        }
        return i11;
    }
}
