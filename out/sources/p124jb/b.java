package p124jb;

import com.braze.support.BrazeLogger;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import net.lingala.zip4j.exception.ZipException;
import p137kb.e;
import p149lb.a;

/* JADX INFO: compiled from: PartInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public class b extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RandomAccessFile f41204b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f41206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f41207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p087gb.b f41208f;
    public final boolean j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f41209g = new byte[1];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f41210h = new byte[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f41211i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41212k = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f41205c = 0;

    public b(RandomAccessFile randomAccessFile, long j, a aVar) {
        this.j = false;
        this.f41204b = randomAccessFile;
        this.f41207e = aVar;
        this.f41208f = aVar.f44517e;
        this.f41206d = j;
        e eVar = aVar.f44514b;
        this.j = eVar.j && eVar.f42935k == 99;
    }

    @Override // java.io.InputStream
    public int available() {
        long j = this.f41206d - this.f41205c;
        return j > 2147483647L ? BrazeLogger.SUPPRESS : (int) j;
    }

    public final void b() throws IOException {
        p087gb.b bVar;
        if (this.j && (bVar = this.f41208f) != null && (bVar instanceof p087gb.a) && ((p087gb.a) bVar).f35682i == null) {
            byte[] bArr = new byte[10];
            int i10 = this.f41204b.read(bArr);
            a aVar = this.f41207e;
            if (i10 != 10) {
                if (!aVar.f44513a.f42966f) {
                    throw new IOException("Error occured while reading stored AES authentication bytes");
                }
                this.f41204b.close();
                RandomAccessFile randomAccessFileG = aVar.g();
                this.f41204b = randomAccessFileG;
                randomAccessFileG.read(bArr, i10, 10 - i10);
            }
            ((p087gb.a) aVar.f44517e).f35682i = bArr;
        }
    }

    public a c() {
        return this.f41207e;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41204b.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f41205c >= this.f41206d) {
            return -1;
        }
        if (!this.j) {
            byte[] bArr = this.f41209g;
            if (read(bArr, 0, 1) == -1) {
                return -1;
            }
            return bArr[0] & 255;
        }
        int i10 = this.f41211i;
        byte[] bArr2 = this.f41210h;
        if (i10 == 0 || i10 == 16) {
            if (read(bArr2) == -1) {
                return -1;
            }
            this.f41211i = 0;
        }
        int i11 = this.f41211i;
        this.f41211i = i11 + 1;
        return bArr2[i11] & 255;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        long j10 = this.f41205c;
        long j11 = this.f41206d;
        if (j > j11 - j10) {
            j = j11 - j10;
        }
        this.f41205c = j10 + j;
        return j;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j = i11;
        long j10 = this.f41206d;
        long j11 = this.f41205c;
        long j12 = j10 - j11;
        if (j > j12 && (i11 = (int) j12) == 0) {
            b();
            return -1;
        }
        if ((this.f41207e.f44517e instanceof p087gb.a) && j11 + ((long) i11) < j10 && (i12 = i11 % 16) != 0) {
            i11 -= i12;
        }
        synchronized (this.f41204b) {
            try {
                int i13 = this.f41204b.read(bArr, i10, i11);
                this.f41212k = i13;
                if (i13 < i11 && this.f41207e.f44513a.f42966f) {
                    this.f41204b.close();
                    RandomAccessFile randomAccessFileG = this.f41207e.g();
                    this.f41204b = randomAccessFileG;
                    if (this.f41212k < 0) {
                        this.f41212k = 0;
                    }
                    int i14 = this.f41212k;
                    int i15 = randomAccessFileG.read(bArr, i14, i11 - i14);
                    if (i15 > 0) {
                        this.f41212k += i15;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i16 = this.f41212k;
        if (i16 > 0) {
            p087gb.b bVar = this.f41208f;
            if (bVar != null) {
                try {
                    bVar.a(bArr, i10, i16);
                } catch (ZipException e10) {
                    throw new IOException(e10.getMessage());
                }
            }
            this.f41205c += (long) this.f41212k;
        }
        if (this.f41205c >= this.f41206d) {
            b();
        }
        return this.f41212k;
    }
}
