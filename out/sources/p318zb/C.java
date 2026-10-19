package p318zb;

import com.braze.support.BrazeLogger;
import com.google.gson.internal.b;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.i;
import okio.ByteString;

/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C implements InterfaceC2841h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f49037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2839f f49038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f49039d;

    public C(H source) {
        i.e(source, "source");
        this.f49037b = source;
        this.f49038c = new C2839f();
    }

    @Override // p318zb.InterfaceC2841h
    public final byte[] A() throws IOException {
        H h8 = this.f49037b;
        C2839f c2839f = this.f49038c;
        c2839f.k0(h8);
        return c2839f.N(c2839f.f49074c);
    }

    @Override // p318zb.InterfaceC2841h
    public final short B0() throws EOFException {
        N0(2L);
        return this.f49038c.B0();
    }

    @Override // p318zb.InterfaceC2841h
    public final long F0() throws EOFException {
        N0(8L);
        return this.f49038c.F0();
    }

    @Override // p318zb.InterfaceC2841h
    public final int H(x options) throws EOFException {
        C2839f c2839f;
        i.e(options, "options");
        if (this.f49039d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        do {
            c2839f = this.f49038c;
            int iB = okio.internal.a.b(c2839f, options, true);
            if (iB != -2) {
                if (iB == -1) {
                    break;
                }
                c2839f.skip(options.f49118b[iB].e());
                return iB;
            }
        } while (this.f49037b.l0(c2839f, 8192L) != -1);
        return -1;
    }

    @Override // p318zb.InterfaceC2841h
    public final void N0(long j) throws EOFException {
        if (!g(j)) {
            throw new EOFException();
        }
    }

    @Override // p318zb.InterfaceC2841h
    public final InputStream X0() {
        return new a();
    }

    public final boolean b() {
        if (this.f49039d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        C2839f c2839f = this.f49038c;
        return c2839f.j() && this.f49037b.l0(c2839f, 8192L) == -1;
    }

    public final long c(byte b10, long j, long j10) {
        if (this.f49039d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        long jMax = 0;
        if (0 > j10) {
            throw new IllegalArgumentException(b.b(j10, "fromIndex=0 toIndex=").toString());
        }
        while (jMax < j10) {
            long jS = this.f49038c.s(b10, jMax, j10);
            if (jS != -1) {
                return jS;
            }
            C2839f c2839f = this.f49038c;
            long j11 = c2839f.f49074c;
            if (j11 >= j10 || this.f49037b.l0(c2839f, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j11);
        }
        return -1L;
    }

    @Override // p318zb.InterfaceC2841h
    public final boolean c0(long j, ByteString bytes) {
        i.e(bytes, "bytes");
        int iE = bytes.e();
        if (this.f49039d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (j < 0 || iE < 0 || bytes.e() < iE) {
            return false;
        }
        for (int i10 = 0; i10 < iE; i10++) {
            long j10 = ((long) i10) + j;
            if (!g(1 + j10) || this.f49038c.p(j10) != bytes.k(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f49039d) {
            return;
        }
        this.f49039d = true;
        this.f49037b.close();
        this.f49038c.b();
    }

    @Override // p318zb.InterfaceC2841h
    public final String d0(Charset charset) throws IOException {
        C2839f c2839f = this.f49038c;
        c2839f.k0(this.f49037b);
        return c2839f.o0(c2839f.f49074c, charset);
    }

    @Override // p318zb.InterfaceC2841h
    public final C2839f f() {
        return this.f49038c;
    }

    @Override // p318zb.InterfaceC2841h
    public final boolean g(long j) {
        C2839f c2839f;
        if (j < 0) {
            throw new IllegalArgumentException(b.b(j, "byteCount < 0: ").toString());
        }
        if (this.f49039d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        do {
            c2839f = this.f49038c;
            if (c2839f.f49074c >= j) {
                return true;
            }
        } while (this.f49037b.l0(c2839f, 8192L) != -1);
        return false;
    }

    public final long h(ByteString targetBytes) {
        i.e(targetBytes, "targetBytes");
        if (this.f49039d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        long jMax = 0;
        while (true) {
            C2839f c2839f = this.f49038c;
            long jX = c2839f.x(jMax, targetBytes);
            if (jX != -1) {
                return jX;
            }
            long j = c2839f.f49074c;
            if (this.f49037b.l0(c2839f, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    public final ByteString i(long j) throws EOFException {
        N0(j);
        return this.f49038c.R(j);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f49039d;
    }

    public final void j(C2839f sink, long j) throws IOException {
        C2839f c2839f = this.f49038c;
        i.e(sink, "sink");
        try {
            N0(j);
            c2839f.getClass();
            i.e(sink, "sink");
            long j10 = c2839f.f49074c;
            if (j10 >= j) {
                sink.t0(c2839f, j);
            } else {
                sink.t0(c2839f, j10);
                throw new EOFException();
            }
        } catch (EOFException e10) {
            sink.k0(c2839f);
            throw e10;
        }
    }

    public final int k() throws EOFException {
        N0(4L);
        return this.f49038c.j0();
    }

    @Override // p318zb.H
    public final long l0(C2839f sink, long j) {
        i.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(b.b(j, "byteCount < 0: ").toString());
        }
        if (this.f49039d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        C2839f c2839f = this.f49038c;
        if (c2839f.f49074c == 0 && this.f49037b.l0(c2839f, 8192L) == -1) {
            return -1L;
        }
        return c2839f.l0(sink, Math.min(j, c2839f.f49074c));
    }

    @Override // p318zb.InterfaceC2841h
    public final long o(InterfaceC2840g interfaceC2840g) throws IOException {
        C2839f c2839f;
        long j = 0;
        while (true) {
            H h8 = this.f49037b;
            c2839f = this.f49038c;
            if (h8.l0(c2839f, 8192L) == -1) {
                break;
            }
            long jH = c2839f.h();
            if (jH > 0) {
                j += jH;
                interfaceC2840g.t0(c2839f, jH);
            }
        }
        long j10 = c2839f.f49074c;
        if (j10 <= 0) {
            return j;
        }
        long j11 = j + j10;
        interfaceC2840g.t0(c2839f, j10);
        return j11;
    }

    public final short p() throws EOFException {
        N0(2L);
        return this.f49038c.n0();
    }

    @Override // p318zb.InterfaceC2841h
    public final int q0() throws EOFException {
        N0(4L);
        return this.f49038c.q0();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        i.e(sink, "sink");
        C2839f c2839f = this.f49038c;
        if (c2839f.f49074c == 0 && this.f49037b.l0(c2839f, 8192L) == -1) {
            return -1;
        }
        return c2839f.read(sink);
    }

    @Override // p318zb.InterfaceC2841h
    public final byte readByte() throws EOFException {
        N0(1L);
        return this.f49038c.readByte();
    }

    public final String s(long j) throws EOFException {
        N0(j);
        C2839f c2839f = this.f49038c;
        c2839f.getClass();
        return c2839f.o0(j, kotlin.text.a.f43120b);
    }

    @Override // p318zb.InterfaceC2841h
    public final void skip(long j) throws EOFException {
        if (this.f49039d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        while (j > 0) {
            C2839f c2839f = this.f49038c;
            if (c2839f.f49074c == 0 && this.f49037b.l0(c2839f, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c2839f.f49074c);
            c2839f.skip(jMin);
            j -= jMin;
        }
    }

    @Override // p318zb.H
    public final I timeout() {
        return this.f49037b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f49037b + ')';
    }

    public final String x(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(b.b(j, "limit < 0: ").toString());
        }
        long j10 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jC = c((byte) 10, 0L, j10);
        C2839f c2839f = this.f49038c;
        if (jC != -1) {
            return okio.internal.a.a(c2839f, jC);
        }
        if (j10 < Long.MAX_VALUE && g(j10) && c2839f.p(j10 - 1) == 13 && g(1 + j10) && c2839f.p(j10) == 10) {
            return okio.internal.a.a(c2839f, j10);
        }
        C2839f c2839f2 = new C2839f();
        c2839f.i(c2839f2, 0L, Math.min(32, c2839f.f49074c));
        throw new EOFException("\\n not found: limit=" + Math.min(c2839f.f49074c, j) + " content=" + c2839f2.R(c2839f2.f49074c).f() + (char) 8230);
    }

    /* JADX INFO: compiled from: RealBufferedSource.kt */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            C c10 = C.this;
            if (c10.f49039d) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            return (int) Math.min(c10.f49038c.f49074c, BrazeLogger.SUPPRESS);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            C.this.close();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            C c10 = C.this;
            if (c10.f49039d) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            C2839f c2839f = c10.f49038c;
            if (c2839f.f49074c == 0 && c10.f49037b.l0(c2839f, 8192L) == -1) {
                return -1;
            }
            return c2839f.readByte() & 255;
        }

        public final String toString() {
            return C.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(byte[] data, int i10, int i11) throws IOException {
            i.e(data, "data");
            C c10 = C.this;
            if (!c10.f49039d) {
                C2834a.b(data.length, i10, i11);
                C2839f c2839f = c10.f49038c;
                if (c2839f.f49074c == 0 && c10.f49037b.l0(c2839f, 8192L) == -1) {
                    return -1;
                }
                return c2839f.read(data, i10, i11);
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }
}
