package X3;

import J4.n;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: ContentLengthInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7199c;

    public c(InputStream inputStream, long j) {
        super(inputStream);
        this.f7198b = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        return (int) Math.max(this.f7198b - ((long) this.f7199c), ((FilterInputStream) this).in.available());
    }

    public final void b(int i10) throws IOException {
        if (i10 >= 0) {
            this.f7199c += i10;
            return;
        }
        long j = this.f7199c;
        long j10 = this.f7198b;
        if (j10 - j <= 0) {
            return;
        }
        StringBuilder sbF = n.f("Failed to read all expected data, expected: ", ", but read: ", j10);
        sbF.append(this.f7199c);
        throw new IOException(sbF.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        int i10;
        i10 = super.read();
        b(i10 >= 0 ? 1 : -1);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        i12 = super.read(bArr, i10, i11);
        b(i12);
        return i12;
    }
}
