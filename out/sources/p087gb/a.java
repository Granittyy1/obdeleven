package p087gb;

import androidx.compose.runtime.snapshots.m;
import javax.crypto.Mac;
import net.lingala.zip4j.exception.ZipException;

/* JADX INFO: compiled from: AESDecrypter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p112ib.a f35674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f35675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f35679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f35680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f35681h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f35682i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f35683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f35684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f35685m;

    @Override // p087gb.b
    public final int a(byte[] bArr, int i10, int i11) throws ZipException {
        byte[] bArr2 = this.f35684l;
        byte[] bArr3 = this.f35683k;
        if (this.f35674a == null) {
            throw new ZipException("AES not initialized properly");
        }
        int i12 = i10;
        while (true) {
            int i13 = i10 + i11;
            if (i12 >= i13) {
                return i11;
            }
            int i14 = i12 + 16;
            int i15 = i14 <= i13 ? 16 : i13 - i12;
            try {
                this.f35685m = i15;
                m mVar = this.f35675b;
                mVar.getClass();
                try {
                    ((Mac) mVar.f13218b).update(bArr, i12, i15);
                    p159mb.a.a(this.j, bArr3);
                    this.f35674a.a(bArr3, bArr2);
                    for (int i16 = 0; i16 < this.f35685m; i16++) {
                        int i17 = i12 + i16;
                        bArr[i17] = (byte) (bArr[i17] ^ bArr2[i16]);
                    }
                    this.j++;
                    i12 = i14;
                } catch (IllegalStateException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (ZipException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new ZipException(e12);
            }
        }
    }
}
