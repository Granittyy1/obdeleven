package p299y3;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: StrictLineReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileInputStream f48258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f48259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f48261e;

    /* JADX INFO: compiled from: StrictLineReader.java */
    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (((ByteArrayOutputStream) this).buf[i11] == 13) {
                    i10 = i11;
                }
            }
            try {
                byte[] bArr = ((ByteArrayOutputStream) this).buf;
                b.this.getClass();
                return new String(bArr, 0, i10, c.f48263a.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(FileInputStream fileInputStream) {
        Charset charset = c.f48263a;
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(charset)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f48258b = fileInputStream;
        this.f48259c = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String b() throws IOException {
        int i10;
        synchronized (this.f48258b) {
            try {
                byte[] bArr = this.f48259c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f48260d >= this.f48261e) {
                    int i11 = this.f48258b.read(bArr, 0, bArr.length);
                    if (i11 == -1) {
                        throw new EOFException();
                    }
                    this.f48260d = 0;
                    this.f48261e = i11;
                }
                for (int i12 = this.f48260d; i12 != this.f48261e; i12++) {
                    byte[] bArr2 = this.f48259c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f48260d;
                        if (i12 != i13) {
                            i10 = i12 - 1;
                            if (bArr2[i10] != 13) {
                                i10 = i12;
                            }
                        } else {
                            i10 = i12;
                        }
                        String str = new String(bArr2, i13, i10 - i13, c.f48263a.name());
                        this.f48260d = i12 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f48261e - this.f48260d) + 80);
                while (true) {
                    byte[] bArr3 = this.f48259c;
                    int i14 = this.f48260d;
                    aVar.write(bArr3, i14, this.f48261e - i14);
                    this.f48261e = -1;
                    byte[] bArr4 = this.f48259c;
                    int i15 = this.f48258b.read(bArr4, 0, bArr4.length);
                    if (i15 == -1) {
                        throw new EOFException();
                    }
                    this.f48260d = 0;
                    this.f48261e = i15;
                    for (int i16 = 0; i16 != this.f48261e; i16++) {
                        byte[] bArr5 = this.f48259c;
                        if (bArr5[i16] == 10) {
                            int i17 = this.f48260d;
                            if (i16 != i17) {
                                aVar.write(bArr5, i17, i16 - i17);
                            }
                            this.f48260d = i16 + 1;
                            return aVar.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f48258b) {
            try {
                if (this.f48259c != null) {
                    this.f48259c = null;
                    this.f48258b.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
