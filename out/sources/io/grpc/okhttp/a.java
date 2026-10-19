package io.grpc.okhttp;

import io.grpc.okhttp.internal.framed.ErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import p237t3.x;
import p318zb.C2839f;

/* JADX INFO: compiled from: ExceptionHandlingFrameWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements F9.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f37838e = Logger.getLogger(d.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f37839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E9.a.d f37840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OkHttpFrameLogger f37841d = new OkHttpFrameLogger(Level.FINE);

    public a(d dVar, E9.a.d dVar2) {
        this.f37839b = dVar;
        this.f37840c = dVar2;
    }

    @Override // F9.b
    public final void D(x xVar) {
        OkHttpFrameLogger.Direction direction = OkHttpFrameLogger.Direction.f37835c;
        OkHttpFrameLogger okHttpFrameLogger = this.f37841d;
        if (okHttpFrameLogger.a()) {
            okHttpFrameLogger.f37832a.log(okHttpFrameLogger.f37833b, direction + " SETTINGS: ack=true");
        }
        try {
            this.f37840c.D(xVar);
        } catch (IOException e10) {
            this.f37839b.n(e10);
        }
    }

    @Override // F9.b
    public final void F() {
        try {
            this.f37840c.F();
        } catch (IOException e10) {
            this.f37839b.n(e10);
        }
    }

    @Override // F9.b
    public final void K(ErrorCode errorCode, byte[] bArr) {
        E9.a.d dVar = this.f37840c;
        this.f37841d.c(OkHttpFrameLogger.Direction.f37835c, 0, errorCode, ByteString.n(bArr));
        try {
            dVar.K(errorCode, bArr);
            dVar.flush();
        } catch (IOException e10) {
            this.f37839b.n(e10);
        }
    }

    @Override // F9.b
    public final int M0() {
        return this.f37840c.f3144b.M0();
    }

    @Override // F9.b
    public final void Q(int i10, long j) {
        this.f37841d.g(OkHttpFrameLogger.Direction.f37835c, i10, j);
        try {
            this.f37840c.Q(i10, j);
        } catch (IOException e10) {
            this.f37839b.n(e10);
        }
    }

    @Override // F9.b
    public final void W(int i10, int i11, boolean z10) {
        OkHttpFrameLogger.Direction direction = OkHttpFrameLogger.Direction.f37835c;
        OkHttpFrameLogger okHttpFrameLogger = this.f37841d;
        if (z10) {
            long j = (4294967295L & ((long) i11)) | (((long) i10) << 32);
            if (okHttpFrameLogger.a()) {
                okHttpFrameLogger.f37832a.log(okHttpFrameLogger.f37833b, direction + " PING: ack=true bytes=" + j);
            }
        } else {
            okHttpFrameLogger.d(direction, (4294967295L & ((long) i11)) | (((long) i10) << 32));
        }
        try {
            this.f37840c.W(i10, i11, z10);
        } catch (IOException e10) {
            this.f37839b.n(e10);
        }
    }

    @Override // F9.b
    public final void W0(boolean z10, int i10, ArrayList arrayList) {
        try {
            this.f37840c.W0(z10, i10, arrayList);
        } catch (IOException e10) {
            this.f37839b.n(e10);
        }
    }

    @Override // F9.b
    public final void Y0(int i10, ErrorCode errorCode) {
        this.f37841d.e(OkHttpFrameLogger.Direction.f37835c, i10, errorCode);
        try {
            this.f37840c.Y0(i10, errorCode);
        } catch (IOException e10) {
            this.f37839b.n(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f37840c.close();
        } catch (IOException e10) {
            f37838e.log(e10.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e10);
        }
    }

    @Override // F9.b
    public final void flush() {
        try {
            this.f37840c.flush();
        } catch (IOException e10) {
            this.f37839b.n(e10);
        }
    }

    @Override // F9.b
    public final void n(x xVar) {
        this.f37841d.f(OkHttpFrameLogger.Direction.f37835c, xVar);
        try {
            this.f37840c.n(xVar);
        } catch (IOException e10) {
            this.f37839b.n(e10);
        }
    }

    @Override // F9.b
    public final void v(boolean z10, int i10, C2839f c2839f, int i11) {
        OkHttpFrameLogger.Direction direction = OkHttpFrameLogger.Direction.f37835c;
        c2839f.getClass();
        this.f37841d.b(direction, i10, c2839f, i11, z10);
        try {
            this.f37840c.v(z10, i10, c2839f, i11);
        } catch (IOException e10) {
            this.f37839b.n(e10);
        }
    }
}
