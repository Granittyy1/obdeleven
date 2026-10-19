package E9;

import io.grpc.internal.AbstractC2212c;
import io.grpc.internal.x0;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p318zb.C2834a;
import p318zb.C2839f;
import p318zb.D;
import p318zb.E;

/* JADX INFO: compiled from: OkHttpReadableBuffer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends AbstractC2212c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2839f f3166b;

    public f(C2839f c2839f) {
        this.f3166b = c2839f;
    }

    @Override // io.grpc.internal.x0
    public final void D0(OutputStream out, int i10) throws IOException {
        long j = i10;
        C2839f c2839f = this.f3166b;
        c2839f.getClass();
        kotlin.jvm.internal.i.e(out, "out");
        C2834a.b(c2839f.f49074c, 0L, j);
        D d10 = c2839f.f49073b;
        while (j > 0) {
            kotlin.jvm.internal.i.b(d10);
            int iMin = (int) Math.min(j, d10.f49043c - d10.f49042b);
            out.write(d10.f49041a, d10.f49042b, iMin);
            int i11 = d10.f49042b + iMin;
            d10.f49042b = i11;
            long j10 = iMin;
            c2839f.f49074c -= j10;
            j -= j10;
            if (i11 == d10.f49043c) {
                D dA = d10.a();
                c2839f.f49073b = dA;
                E.a(d10);
                d10 = dA;
            }
        }
    }

    @Override // io.grpc.internal.x0
    public final void O0(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.AbstractC2212c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.f3166b.b();
    }

    @Override // io.grpc.internal.x0
    public final int e() {
        return (int) this.f3166b.f49074c;
    }

    @Override // io.grpc.internal.x0
    public final void e0(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int i12 = this.f3166b.read(bArr, i10, i11);
            if (i12 == -1) {
                throw new IndexOutOfBoundsException(J4.i.c(i11, "EOF trying to read ", " bytes"));
            }
            i11 -= i12;
            i10 += i12;
        }
    }

    @Override // io.grpc.internal.x0
    public final int readUnsignedByte() {
        try {
            return this.f3166b.readByte() & 255;
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // io.grpc.internal.x0
    public final void skipBytes(int i10) {
        try {
            this.f3166b.skip(i10);
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // io.grpc.internal.x0
    public final x0 w(int i10) {
        C2839f c2839f = new C2839f();
        c2839f.t0(this.f3166b, i10);
        return new f(c2839f);
    }
}
