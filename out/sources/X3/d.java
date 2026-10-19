package X3;

import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: ExceptionCatchingInputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayDeque f7200d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclableBufferedInputStream f7201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f7202c;

    static {
        char[] cArr = j.f7214a;
        f7200d = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.f7201b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7201b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f7201b.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f7201b.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f7201b.read(bArr);
        } catch (IOException e10) {
            this.f7202c = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f7201b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        try {
            return this.f7201b.skip(j);
        } catch (IOException e10) {
            this.f7202c = e10;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f7201b.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f7202c = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f7201b.read();
        } catch (IOException e10) {
            this.f7202c = e10;
            return -1;
        }
    }
}
