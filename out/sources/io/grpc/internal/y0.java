package io.grpc.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* JADX INFO: compiled from: ReadableBuffers.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f37743a = new b(new byte[0], 0, 0);

    /* JADX INFO: compiled from: ReadableBuffers.java */
    public static class b extends AbstractC2212c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f37745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f37746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f37747d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f37748e = -1;

        public b(byte[] bArr, int i10, int i11) {
            A8.p.f("offset must be >= 0", i10 >= 0);
            A8.p.f("length must be >= 0", i11 >= 0);
            int i12 = i11 + i10;
            A8.p.f("offset + length exceeds array boundary", i12 <= bArr.length);
            this.f37747d = bArr;
            this.f37745b = i10;
            this.f37746c = i12;
        }

        @Override // io.grpc.internal.x0
        public final void D0(OutputStream outputStream, int i10) throws IOException {
            b(i10);
            outputStream.write(this.f37747d, this.f37745b, i10);
            this.f37745b += i10;
        }

        @Override // io.grpc.internal.x0
        public final void O0(ByteBuffer byteBuffer) {
            A8.p.j(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            b(iRemaining);
            byteBuffer.put(this.f37747d, this.f37745b, iRemaining);
            this.f37745b += iRemaining;
        }

        @Override // io.grpc.internal.x0
        public final int e() {
            return this.f37746c - this.f37745b;
        }

        @Override // io.grpc.internal.x0
        public final void e0(byte[] bArr, int i10, int i11) {
            System.arraycopy(this.f37747d, this.f37745b, bArr, i10, i11);
            this.f37745b += i11;
        }

        @Override // io.grpc.internal.AbstractC2212c, io.grpc.internal.x0
        public final void i0() {
            this.f37748e = this.f37745b;
        }

        @Override // io.grpc.internal.x0
        public final int readUnsignedByte() {
            b(1);
            int i10 = this.f37745b;
            this.f37745b = i10 + 1;
            return this.f37747d[i10] & 255;
        }

        @Override // io.grpc.internal.AbstractC2212c, io.grpc.internal.x0
        public final void reset() {
            int i10 = this.f37748e;
            if (i10 == -1) {
                throw new InvalidMarkException();
            }
            this.f37745b = i10;
        }

        @Override // io.grpc.internal.x0
        public final void skipBytes(int i10) {
            b(i10);
            this.f37745b += i10;
        }

        @Override // io.grpc.internal.x0
        public final x0 w(int i10) {
            b(i10);
            int i11 = this.f37745b;
            this.f37745b = i11 + i10;
            return new b(this.f37747d, i11, i10);
        }
    }

    /* JADX INFO: compiled from: ReadableBuffers.java */
    public static final class a extends InputStream implements D9.s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public x0 f37744b;

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.f37744b.e();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f37744b.close();
        }

        @Override // java.io.InputStream
        public final void mark(int i10) {
            this.f37744b.i0();
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return this.f37744b.markSupported();
        }

        @Override // java.io.InputStream
        public final int read() {
            x0 x0Var = this.f37744b;
            if (x0Var.e() == 0) {
                return -1;
            }
            return x0Var.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public final void reset() throws IOException {
            this.f37744b.reset();
        }

        @Override // java.io.InputStream
        public final long skip(long j) throws IOException {
            x0 x0Var = this.f37744b;
            int iMin = (int) Math.min(x0Var.e(), j);
            x0Var.skipBytes(iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            x0 x0Var = this.f37744b;
            if (x0Var.e() == 0) {
                return -1;
            }
            int iMin = Math.min(x0Var.e(), i11);
            x0Var.e0(bArr, i10, iMin);
            return iMin;
        }
    }
}
