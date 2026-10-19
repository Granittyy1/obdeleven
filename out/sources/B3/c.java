package B3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: BufferedOutputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileOutputStream f1500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f1501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E3.h f1502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1503e;

    public c(FileOutputStream fileOutputStream, E3.h hVar) {
        this.f1500b = fileOutputStream;
        this.f1502d = hVar;
        this.f1501c = (byte[]) hVar.d(byte[].class, 65536);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f1500b;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f1501c;
            if (bArr != null) {
                this.f1502d.h(bArr);
                this.f1501c = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i10 = this.f1503e;
        FileOutputStream fileOutputStream = this.f1500b;
        if (i10 > 0) {
            fileOutputStream.write(this.f1501c, 0, i10);
            this.f1503e = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        byte[] bArr = this.f1501c;
        int i11 = this.f1503e;
        int i12 = i11 + 1;
        this.f1503e = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f1500b.write(bArr, 0, i12);
        this.f1503e = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f1503e;
            FileOutputStream fileOutputStream = this.f1500b;
            if (i15 == 0 && i13 >= this.f1501c.length) {
                fileOutputStream.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f1501c.length - i15);
            System.arraycopy(bArr, i14, this.f1501c, this.f1503e, iMin);
            int i16 = this.f1503e + iMin;
            this.f1503e = i16;
            i12 += iMin;
            byte[] bArr2 = this.f1501c;
            if (i16 == bArr2.length && i16 > 0) {
                fileOutputStream.write(bArr2, 0, i16);
                this.f1503e = 0;
            }
        } while (i12 < i11);
    }
}
