package p313z6;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p005a4.q;

/* JADX INFO: compiled from: QueueFile.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f48866h = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RandomAccessFile f48867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f48868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f48870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f48871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f48872g;

    /* JADX INFO: compiled from: QueueFile.java */
    public class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f48873a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f48874b;

        public a(StringBuilder sb2) {
            this.f48874b = sb2;
        }

        @Override // z6.h.d
        public final void a(c cVar, int i10) throws IOException {
            boolean z10 = this.f48873a;
            StringBuilder sb2 = this.f48874b;
            if (z10) {
                this.f48873a = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(i10);
        }
    }

    /* JADX INFO: compiled from: QueueFile.java */
    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f48875c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48877b;

        public b(int i10, int i11) {
            this.f48876a = i10;
            this.f48877b = i11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b.class.getSimpleName());
            sb2.append("[position = ");
            sb2.append(this.f48876a);
            sb2.append(", length = ");
            return q.c(sb2, this.f48877b, "]");
        }
    }

    /* JADX INFO: compiled from: QueueFile.java */
    public interface d {
        void a(c cVar, int i10) throws IOException;
    }

    public h(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f48872g = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    N(bArr2, i10, iArr[i11]);
                    i10 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f48867b = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iK = k(0, bArr);
        this.f48868c = iK;
        if (iK > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f48868c + ", Actual length: " + randomAccessFile2.length());
        }
        this.f48869d = k(4, bArr);
        int iK2 = k(8, bArr);
        int iK3 = k(12, bArr);
        this.f48870e = j(iK2);
        this.f48871f = j(iK3);
    }

    public static void N(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public static int k(int i10, byte[] bArr) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public final int B() {
        if (this.f48869d == 0) {
            return 16;
        }
        b bVar = this.f48871f;
        int i10 = bVar.f48876a;
        int i11 = this.f48870e.f48876a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f48877b + 16 : (((i10 + 4) + bVar.f48877b) + this.f48868c) - i11;
    }

    public final int C(int i10) {
        int i11 = this.f48868c;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void M(int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = {i10, i11, i12, i13};
        byte[] bArr = this.f48872g;
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            N(bArr, i14, iArr[i15]);
            i14 += 4;
        }
        RandomAccessFile randomAccessFile = this.f48867b;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    public final void b(byte[] bArr) throws IOException {
        int iC;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    c(length);
                    boolean zI = i();
                    if (zI) {
                        iC = 16;
                    } else {
                        b bVar = this.f48871f;
                        iC = C(bVar.f48876a + 4 + bVar.f48877b);
                    }
                    b bVar2 = new b(iC, length);
                    N(this.f48872g, 0, length);
                    x(this.f48872g, iC, 4);
                    x(bArr, iC + 4, length);
                    M(this.f48868c, this.f48869d + 1, zI ? iC : this.f48870e.f48876a, iC);
                    this.f48871f = bVar2;
                    this.f48869d++;
                    if (zI) {
                        this.f48870e = bVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void c(int i10) throws IOException {
        int i11 = i10 + 4;
        int iB = this.f48868c - B();
        if (iB >= i11) {
            return;
        }
        int i12 = this.f48868c;
        do {
            iB += i12;
            i12 <<= 1;
        } while (iB < i11);
        RandomAccessFile randomAccessFile = this.f48867b;
        randomAccessFile.setLength(i12);
        randomAccessFile.getChannel().force(true);
        b bVar = this.f48871f;
        int iC = C(bVar.f48876a + 4 + bVar.f48877b);
        if (iC < this.f48870e.f48876a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f48868c);
            long j = iC - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f48871f.f48876a;
        int i14 = this.f48870e.f48876a;
        if (i13 < i14) {
            int i15 = (this.f48868c + i13) - 16;
            M(i12, this.f48869d, i14, i15);
            this.f48871f = new b(i15, this.f48871f.f48877b);
        } else {
            M(i12, this.f48869d, i14, i13);
        }
        this.f48868c = i12;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f48867b.close();
    }

    public final synchronized void h(d dVar) throws IOException {
        int iC = this.f48870e.f48876a;
        for (int i10 = 0; i10 < this.f48869d; i10++) {
            b bVarJ = j(iC);
            dVar.a(new c(bVarJ), bVarJ.f48877b);
            iC = C(bVarJ.f48876a + 4 + bVarJ.f48877b);
        }
    }

    public final synchronized boolean i() {
        return this.f48869d == 0;
    }

    public final b j(int i10) throws IOException {
        if (i10 == 0) {
            return b.f48875c;
        }
        RandomAccessFile randomAccessFile = this.f48867b;
        randomAccessFile.seek(i10);
        return new b(i10, randomAccessFile.readInt());
    }

    public final synchronized void p() throws IOException {
        if (i()) {
            throw new NoSuchElementException();
        }
        if (this.f48869d == 1) {
            synchronized (this) {
                M(4096, 0, 0, 0);
                this.f48869d = 0;
                b bVar = b.f48875c;
                this.f48870e = bVar;
                this.f48871f = bVar;
                if (this.f48868c > 4096) {
                    RandomAccessFile randomAccessFile = this.f48867b;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f48868c = 4096;
            }
        } else {
            b bVar2 = this.f48870e;
            int iC = C(bVar2.f48876a + 4 + bVar2.f48877b);
            s(iC, 0, 4, this.f48872g);
            int iK = k(0, this.f48872g);
            M(this.f48868c, this.f48869d - 1, iC, this.f48871f.f48876a);
            this.f48869d--;
            this.f48870e = new b(iC, iK);
        }
    }

    public final void s(int i10, int i11, int i12, byte[] bArr) throws IOException {
        int iC = C(i10);
        int i13 = iC + i12;
        int i14 = this.f48868c;
        RandomAccessFile randomAccessFile = this.f48867b;
        if (i13 <= i14) {
            randomAccessFile.seek(iC);
            randomAccessFile.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iC;
        randomAccessFile.seek(iC);
        randomAccessFile.readFully(bArr, i11, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f48868c);
        sb2.append(", size=");
        sb2.append(this.f48869d);
        sb2.append(", first=");
        sb2.append(this.f48870e);
        sb2.append(", last=");
        sb2.append(this.f48871f);
        sb2.append(", element lengths=[");
        try {
            h(new a(sb2));
        } catch (IOException e10) {
            f48866h.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final void x(byte[] bArr, int i10, int i11) throws IOException {
        int iC = C(i10);
        int i12 = iC + i11;
        int i13 = this.f48868c;
        RandomAccessFile randomAccessFile = this.f48867b;
        if (i12 <= i13) {
            randomAccessFile.seek(iC);
            randomAccessFile.write(bArr, 0, i11);
            return;
        }
        int i14 = i13 - iC;
        randomAccessFile.seek(iC);
        randomAccessFile.write(bArr, 0, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i14, i11 - i14);
    }

    /* JADX INFO: compiled from: QueueFile.java */
    public final class c extends InputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f48878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48879c;

        public c(b bVar) {
            this.f48878b = h.this.C(bVar.f48876a + 4);
            this.f48879c = bVar.f48877b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f48879c;
            if (i12 <= 0) {
                return -1;
            }
            if (i11 > i12) {
                i11 = i12;
            }
            int i13 = this.f48878b;
            h hVar = h.this;
            hVar.s(i13, i10, i11, bArr);
            this.f48878b = hVar.C(this.f48878b + i11);
            this.f48879c -= i11;
            return i11;
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            if (this.f48879c == 0) {
                return -1;
            }
            h hVar = h.this;
            hVar.f48867b.seek(this.f48878b);
            int i10 = hVar.f48867b.read();
            this.f48878b = hVar.C(this.f48878b + 1);
            this.f48879c--;
            return i10;
        }
    }
}
