package p318zb;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.i;
import okio.ByteString;

/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class B implements InterfaceC2840g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f49033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2839f f49034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f49035d;

    public B(F sink) {
        i.e(sink, "sink");
        this.f49033b = sink;
        this.f49034c = new C2839f();
    }

    @Override // p318zb.InterfaceC2840g
    public final InterfaceC2840g E(int i10) {
        if (this.f49035d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f49034c.Z0(i10);
        b();
        return this;
    }

    @Override // p318zb.InterfaceC2840g
    public final InterfaceC2840g Q0(long j) throws IOException {
        if (this.f49035d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f49034c.a1(j);
        b();
        return this;
    }

    @Override // p318zb.InterfaceC2840g
    public final OutputStream U0() {
        return new a();
    }

    @Override // p318zb.InterfaceC2840g
    public final InterfaceC2840g Z(String string) {
        i.e(string, "string");
        if (this.f49035d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f49034c.f1(string);
        b();
        return this;
    }

    @Override // p318zb.InterfaceC2840g
    public final InterfaceC2840g a(byte[] source, int i10, int i11) throws IOException {
        i.e(source, "source");
        if (this.f49035d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f49034c.S0(source, i10, i11);
        b();
        return this;
    }

    public final InterfaceC2840g b() throws IOException {
        if (this.f49035d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        C2839f c2839f = this.f49034c;
        long jH = c2839f.h();
        if (jH > 0) {
            this.f49033b.t0(c2839f, jH);
        }
        return this;
    }

    public final InterfaceC2840g c(int i10) throws IOException {
        if (this.f49035d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f49034c.c1(i10);
        b();
        return this;
    }

    @Override // p318zb.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        F f10 = this.f49033b;
        if (this.f49035d) {
            return;
        }
        C2839f c2839f = this.f49034c;
        long j = c2839f.f49074c;
        if (j > 0) {
            f10.t0(c2839f, j);
        }
        th = null;
        try {
            f10.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f49035d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p318zb.InterfaceC2840g
    public final C2839f f() {
        return this.f49034c;
    }

    @Override // p318zb.F, java.io.Flushable
    public final void flush() {
        if (this.f49035d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        C2839f c2839f = this.f49034c;
        long j = c2839f.f49074c;
        F f10 = this.f49033b;
        if (j > 0) {
            f10.t0(c2839f, j);
        }
        f10.flush();
    }

    public final InterfaceC2840g h(int i10) throws IOException {
        if (this.f49035d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f49034c.d1(i10);
        b();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f49035d;
    }

    @Override // p318zb.InterfaceC2840g
    public final long k0(H source) throws IOException {
        i.e(source, "source");
        long j = 0;
        while (true) {
            long jL0 = source.l0(this.f49034c, 8192L);
            if (jL0 == -1) {
                return j;
            }
            j += jL0;
            b();
        }
    }

    @Override // p318zb.F
    public final void t0(C2839f source, long j) throws IOException {
        i.e(source, "source");
        if (this.f49035d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f49034c.t0(source, j);
        b();
    }

    @Override // p318zb.F
    public final I timeout() {
        return this.f49033b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f49033b + ')';
    }

    @Override // p318zb.InterfaceC2840g
    public final InterfaceC2840g w0(byte[] source) throws IOException {
        i.e(source, "source");
        if (this.f49035d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f49034c.P0(source);
        b();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) throws IOException {
        i.e(source, "source");
        if (this.f49035d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        int iWrite = this.f49034c.write(source);
        b();
        return iWrite;
    }

    @Override // p318zb.InterfaceC2840g
    public final InterfaceC2840g z0(ByteString byteString) throws IOException {
        i.e(byteString, "byteString");
        if (this.f49035d) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        this.f49034c.K0(byteString);
        b();
        return this;
    }

    /* JADX INFO: compiled from: RealBufferedSink.kt */
    public static final class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws Throwable {
            B.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            B b10 = B.this;
            if (b10.f49035d) {
                return;
            }
            b10.flush();
        }

        public final String toString() {
            return B.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i10) throws IOException {
            B b10 = B.this;
            if (b10.f49035d) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            b10.f49034c.Z0((byte) i10);
            b10.b();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] data, int i10, int i11) throws IOException {
            i.e(data, "data");
            B b10 = B.this;
            if (!b10.f49035d) {
                b10.f49034c.S0(data, i10, i11);
                b10.b();
                return;
            }
            throw new IOException(MetricTracker.Action.CLOSED);
        }
    }
}
