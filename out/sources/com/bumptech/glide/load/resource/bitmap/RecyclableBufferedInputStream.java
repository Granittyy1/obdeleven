package com.bumptech.glide.load.resource.bitmap;

import E3.h;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class RecyclableBufferedInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile byte[] f24670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f24675g;

    public static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;
    }

    public RecyclableBufferedInputStream(InputStream inputStream, h hVar) {
        super(inputStream);
        this.f24673e = -1;
        this.f24675g = hVar;
        this.f24670b = (byte[]) hVar.d(byte[].class, 65536);
    }

    public static void h() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f24670b == null || inputStream == null) {
            h();
            throw null;
        }
        return (this.f24671c - this.f24674f) + inputStream.available();
    }

    public final int b(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f24673e;
        if (i10 != -1) {
            int i11 = this.f24674f - i10;
            int i12 = this.f24672d;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f24671c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f24675g.d(byte[].class, i12);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f24670b = bArr2;
                    this.f24675g.h(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f24674f - this.f24673e;
                this.f24674f = i13;
                this.f24673e = 0;
                this.f24671c = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f24674f;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f24671c = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f24673e = -1;
            this.f24674f = 0;
            this.f24671c = i16;
        }
        return i16;
    }

    public final synchronized void c() {
        if (this.f24670b != null) {
            this.f24675g.h(this.f24670b);
            this.f24670b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f24670b != null) {
            this.f24675g.h(this.f24670b);
            this.f24670b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f24672d = Math.max(this.f24672d, i10);
        this.f24673e = this.f24674f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        byte[] bArr = this.f24670b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            h();
            throw null;
        }
        if (this.f24674f >= this.f24671c && b(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f24670b && (bArr = this.f24670b) == null) {
            h();
            throw null;
        }
        int i10 = this.f24671c;
        int i11 = this.f24674f;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f24674f = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (this.f24670b == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f24673e;
        if (-1 == i10) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f24674f + " markLimit: " + this.f24672d);
        }
        this.f24674f = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f24670b;
        if (bArr == null) {
            h();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            h();
            throw null;
        }
        int i10 = this.f24671c;
        int i11 = this.f24674f;
        if (i10 - i11 >= j) {
            this.f24674f = (int) (((long) i11) + j);
            return j;
        }
        long j10 = ((long) i10) - ((long) i11);
        this.f24674f = i10;
        if (this.f24673e == -1 || j > this.f24672d) {
            return j10 + inputStream.skip(j - j10);
        }
        if (b(inputStream, bArr) == -1) {
            return j10;
        }
        int i12 = this.f24671c;
        int i13 = this.f24674f;
        if (i12 - i13 >= j - j10) {
            this.f24674f = (int) ((((long) i13) + j) - j10);
            return j;
        }
        long j11 = (j10 + ((long) i12)) - ((long) i13);
        this.f24674f = i12;
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13;
        byte[] bArr2 = this.f24670b;
        if (bArr2 == null) {
            h();
            throw null;
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f24674f;
            int i15 = this.f24671c;
            if (i14 < i15) {
                int i16 = i15 - i14;
                if (i16 >= i11) {
                    i16 = i11;
                }
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f24674f += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f24673e == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (b(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f24670b && (bArr2 = this.f24670b) == null) {
                        h();
                        throw null;
                    }
                    int i17 = this.f24671c;
                    int i18 = this.f24674f;
                    i13 = i17 - i18;
                    if (i13 >= i12) {
                        i13 = i12;
                    }
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f24674f += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            h();
            throw null;
        }
    }
}
