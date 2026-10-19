package coil.decode;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: ExifUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f22878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22879c = 1073741824;

    public f(InputStream inputStream) {
        this.f22878b = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f22879c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f22878b.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i10 = this.f22878b.read();
        if (i10 == -1) {
            this.f22879c = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.f22878b.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i10 = this.f22878b.read(bArr);
        if (i10 == -1) {
            this.f22879c = 0;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f22878b.read(bArr, i10, i11);
        if (i12 == -1) {
            this.f22879c = 0;
        }
        return i12;
    }
}
