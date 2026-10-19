package O6;

import java.io.OutputStream;

/* JADX INFO: compiled from: LengthCountingOutputStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4862b;

    @Override // java.io.OutputStream
    public final void write(int i10) {
        this.f4862b++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f4862b += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f4862b += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
