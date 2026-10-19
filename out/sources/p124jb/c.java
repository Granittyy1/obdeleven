package p124jb;

import java.io.IOException;
import java.io.InputStream;
import net.lingala.zip4j.exception.ZipException;
import p149lb.a;

/* JADX INFO: compiled from: ZipInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f41213b;

    public c(b bVar) {
        this.f41213b = bVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.f41213b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        b bVar = this.f41213b;
        try {
            bVar.close();
            if (bVar.c() != null) {
                bVar.c().a();
            }
        } catch (ZipException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        b bVar = this.f41213b;
        int i10 = bVar.read();
        if (i10 != -1) {
            bVar.c().f44518f.update(i10);
        }
        return i10;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        return this.f41213b.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        b bVar = this.f41213b;
        int i12 = bVar.read(bArr, i10, i11);
        if (i12 > 0 && bVar.c() != null) {
            a aVarC = bVar.c();
            if (bArr != null) {
                aVarC.f44518f.update(bArr, i10, i12);
            } else {
                aVarC.getClass();
            }
        }
        return i12;
    }
}
