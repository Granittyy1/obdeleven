package bo.app;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class d6 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f20869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f20870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f20871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20873e;

    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (((ByteArrayOutputStream) this).buf[i11] == 13) {
                    i10 = i11;
                }
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, d6.this.f20870b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public d6(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public boolean b() {
        return this.f20873e == -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public String c() {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f20869a) {
            try {
                if (this.f20871c == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f20872d >= this.f20873e) {
                    a();
                }
                for (int i12 = this.f20872d; i12 != this.f20873e; i12++) {
                    byte[] bArr2 = this.f20871c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f20872d;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] != 13) {
                                i11 = i12;
                            }
                        } else {
                            i11 = i12;
                        }
                        String str = new String(bArr2, i13, i11 - i13, this.f20870b.name());
                        this.f20872d = i12 + 1;
                        return str;
                    }
                }
                a aVar = new a((this.f20873e - this.f20872d) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f20871c;
                    int i14 = this.f20872d;
                    aVar.write(bArr3, i14, this.f20873e - i14);
                    this.f20873e = -1;
                    a();
                    i10 = this.f20872d;
                    while (i10 != this.f20873e) {
                        bArr = this.f20871c;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f20872d;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f20872d = i10 + 1;
                return aVar.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f20869a) {
            try {
                if (this.f20871c != null) {
                    this.f20871c = null;
                    this.f20869a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public d6(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(g7.f21152a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f20869a = inputStream;
        this.f20870b = charset;
        this.f20871c = new byte[i10];
    }

    private void a() throws IOException {
        InputStream inputStream = this.f20869a;
        byte[] bArr = this.f20871c;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f20872d = 0;
        this.f20873e = i10;
    }
}
