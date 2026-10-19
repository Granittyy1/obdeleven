package p124jb;

import androidx.compose.ui.text.font.s;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p137kb.f;

/* JADX INFO: compiled from: InflaterInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Inflater f41198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f41199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f41200n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p149lb.a f41201o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f41202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f41203q;

    public a(RandomAccessFile randomAccessFile, long j, long j10, p149lb.a aVar) {
        super(randomAccessFile, j10, aVar);
        this.f41200n = new byte[1];
        this.f41198l = new Inflater(true);
        this.f41199m = new byte[4096];
        this.f41201o = aVar;
        this.f41202p = 0L;
        this.f41203q = aVar.f44514b.f42930e;
    }

    @Override // p124jb.b, java.io.InputStream
    public final int available() {
        return !this.f41198l.finished() ? 1 : 0;
    }

    @Override // p124jb.b
    public final p149lb.a c() {
        return this.f41207e;
    }

    @Override // p124jb.b, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f41198l.end();
        super.close();
    }

    @Override // p124jb.b, java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f41200n;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // p124jb.b, java.io.InputStream
    public final long skip(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("negative skip length");
        }
        int iMin = (int) Math.min(j, 2147483647L);
        byte[] bArr = new byte[512];
        int i10 = 0;
        while (i10 < iMin) {
            int i11 = iMin - i10;
            if (i11 > 512) {
                i11 = 512;
            }
            int i12 = read(bArr, 0, i11);
            if (i12 == -1) {
                break;
            }
            i10 += i12;
        }
        return i10;
    }

    @Override // p124jb.b, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        throw new NullPointerException("input buffer is null");
    }

    @Override // p124jb.b, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        String strB;
        if (bArr != null) {
            if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
                throw new IndexOutOfBoundsException();
            }
            if (i11 == 0) {
                return 0;
            }
            try {
                if (this.f41202p >= this.f41203q) {
                    while (super.read(new byte[1024], 0, 1024) != -1) {
                    }
                    b();
                    return -1;
                }
                while (true) {
                    Inflater inflater = this.f41198l;
                    int iInflate = inflater.inflate(bArr, i10, i11);
                    if (iInflate == 0) {
                        if (!inflater.finished() && !inflater.needsDictionary()) {
                            if (inflater.needsInput()) {
                                byte[] bArr2 = this.f41199m;
                                int i12 = super.read(bArr2, 0, bArr2.length);
                                if (i12 != -1) {
                                    inflater.setInput(bArr2, 0, i12);
                                } else {
                                    throw new EOFException("Unexpected end of ZLIB input stream");
                                }
                            }
                        }
                        while (super.read(new byte[1024], 0, 1024) != -1) {
                        }
                        b();
                        return -1;
                    }
                    this.f41202p += (long) iInflate;
                    return iInflate;
                }
            } catch (DataFormatException e10) {
                if (e10.getMessage() != null) {
                    strB = e10.getMessage();
                } else {
                    strB = "Invalid ZLIB data format";
                }
                p149lb.a aVar = this.f41201o;
                if (aVar != null) {
                    f fVar = aVar.f44516d;
                    if (fVar.f42948h && fVar.f42949i == 0) {
                        strB = s.b(strB, " - Wrong Password?");
                    }
                }
                throw new IOException(strB);
            }
        }
        throw new NullPointerException("input buffer is null");
    }
}
