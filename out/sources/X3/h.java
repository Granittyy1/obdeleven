package X3;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: MarkEnforcingInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class h extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7210b;

    public h(d dVar) {
        super(dVar);
        this.f7210b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i10 = this.f7210b;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    public final long b(long j) {
        int i10 = this.f7210b;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j <= ((long) i10)) ? j : i10;
    }

    public final void c(long j) {
        int i10 = this.f7210b;
        if (i10 == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f7210b = (int) (((long) i10) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        super.mark(i10);
        this.f7210b = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (b(1L) == -1) {
            return -1;
        }
        int i10 = super.read();
        c(1L);
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        super.reset();
        this.f7210b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jB = b(j);
        if (jB == -1) {
            return 0L;
        }
        long jSkip = super.skip(jB);
        c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int iB = (int) b(i11);
        if (iB == -1) {
            return -1;
        }
        int i12 = super.read(bArr, i10, iB);
        c(i12);
        return i12;
    }
}
