package okhttp3.internal.connection;

import J4.n;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.m;
import okhttp3.u;
import okhttp3.y;
import okhttp3.z;
import p318zb.B;
import p318zb.C;
import p318zb.C2839f;
import p318zb.F;
import p318zb.H;
import p318zb.v;

/* JADX INFO: compiled from: Exchange.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f45450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f45451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f45452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p197pb.d f45453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f45456g;

    /* JADX INFO: compiled from: Exchange.kt */
    public final class a extends p318zb.m {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f45457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f45458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f45459e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f45460f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c f45461g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, F delegate, long j) {
            super(delegate);
            kotlin.jvm.internal.i.e(delegate, "delegate");
            this.f45461g = cVar;
            this.f45457c = j;
        }

        public final <E extends IOException> E b(E e10) {
            if (this.f45458d) {
                return e10;
            }
            this.f45458d = true;
            return (E) this.f45461g.a(false, true, e10);
        }

        @Override // p318zb.m, p318zb.F, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f45460f) {
                return;
            }
            this.f45460f = true;
            long j = this.f45457c;
            if (j != -1 && this.f45459e != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        @Override // p318zb.m, p318zb.F, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        @Override // p318zb.m, p318zb.F
        public final void t0(C2839f source, long j) throws IOException {
            kotlin.jvm.internal.i.e(source, "source");
            if (this.f45460f) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            long j10 = this.f45457c;
            if (j10 != -1 && this.f45459e + j > j10) {
                StringBuilder sbF = n.f("expected ", " bytes but received ", j10);
                sbF.append(this.f45459e + j);
                throw new ProtocolException(sbF.toString());
            }
            try {
                super.t0(source, j);
                this.f45459e += j;
            } catch (IOException e10) {
                throw b(e10);
            }
        }
    }

    /* JADX INFO: compiled from: Exchange.kt */
    public final class b extends p318zb.n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f45462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f45463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f45464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f45465f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f45466g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ c f45467h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, H delegate, long j) {
            super(delegate);
            kotlin.jvm.internal.i.e(delegate, "delegate");
            this.f45467h = cVar;
            this.f45462c = j;
            this.f45464e = true;
            if (j == 0) {
                b(null);
            }
        }

        public final <E extends IOException> E b(E e10) {
            if (this.f45465f) {
                return e10;
            }
            this.f45465f = true;
            c cVar = this.f45467h;
            if (e10 == null && this.f45464e) {
                this.f45464e = false;
                cVar.f45451b.getClass();
                e call = cVar.f45450a;
                kotlin.jvm.internal.i.e(call, "call");
            }
            return (E) cVar.a(true, false, e10);
        }

        @Override // p318zb.n, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f45466g) {
                return;
            }
            this.f45466g = true;
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        @Override // p318zb.n, p318zb.H
        public final long l0(C2839f sink, long j) throws IOException {
            kotlin.jvm.internal.i.e(sink, "sink");
            if (this.f45466g) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            try {
                long jL0 = this.f49103b.l0(sink, j);
                if (this.f45464e) {
                    this.f45464e = false;
                    c cVar = this.f45467h;
                    m mVar = cVar.f45451b;
                    e call = cVar.f45450a;
                    mVar.getClass();
                    kotlin.jvm.internal.i.e(call, "call");
                }
                if (jL0 == -1) {
                    b(null);
                    return -1L;
                }
                long j10 = this.f45463d + jL0;
                long j11 = this.f45462c;
                if (j11 == -1 || j10 <= j11) {
                    this.f45463d = j10;
                    if (j10 == j11) {
                        b(null);
                    }
                    return jL0;
                }
                throw new ProtocolException("expected " + j11 + " bytes but received " + j10);
            } catch (IOException e10) {
                throw b(e10);
            }
        }
    }

    public c(e call, m eventListener, d finder, p197pb.d dVar) {
        kotlin.jvm.internal.i.e(call, "call");
        kotlin.jvm.internal.i.e(eventListener, "eventListener");
        kotlin.jvm.internal.i.e(finder, "finder");
        this.f45450a = call;
        this.f45451b = eventListener;
        this.f45452c = finder;
        this.f45453d = dVar;
        this.f45456g = dVar.e();
    }

    public final IOException a(boolean z10, boolean z11, IOException iOException) {
        if (iOException != null) {
            f(iOException);
        }
        m mVar = this.f45451b;
        e call = this.f45450a;
        if (z11) {
            if (iOException != null) {
                mVar.getClass();
                kotlin.jvm.internal.i.e(call, "call");
            } else {
                mVar.getClass();
                kotlin.jvm.internal.i.e(call, "call");
            }
        }
        if (z10) {
            if (iOException != null) {
                mVar.getClass();
                kotlin.jvm.internal.i.e(call, "call");
            } else {
                mVar.getClass();
                kotlin.jvm.internal.i.e(call, "call");
            }
        }
        return call.f(this, z11, z10, iOException);
    }

    public final a b(u request, boolean z10) throws IOException {
        kotlin.jvm.internal.i.e(request, "request");
        this.f45454e = z10;
        y yVar = request.f45664d;
        kotlin.jvm.internal.i.b(yVar);
        long jContentLength = yVar.contentLength();
        this.f45451b.getClass();
        e call = this.f45450a;
        kotlin.jvm.internal.i.e(call, "call");
        return new a(this, this.f45453d.h(request, jContentLength), jContentLength);
    }

    public final g c() throws SocketException {
        e eVar = this.f45450a;
        if (eVar.f45486l) {
            throw new IllegalStateException("Check failed.");
        }
        eVar.f45486l = true;
        eVar.f45482g.j();
        f fVarE = this.f45453d.e();
        fVarE.getClass();
        Socket socket = fVarE.f45501d;
        kotlin.jvm.internal.i.b(socket);
        C c10 = fVarE.f45505h;
        kotlin.jvm.internal.i.b(c10);
        B b10 = fVarE.f45506i;
        kotlin.jvm.internal.i.b(b10);
        socket.setSoTimeout(0);
        fVarE.k();
        return new g(c10, b10, this);
    }

    public final p197pb.g d(z zVar) throws IOException {
        p197pb.d dVar = this.f45453d;
        try {
            String strC = z.c("Content-Type", zVar);
            long jG = dVar.g(zVar);
            return new p197pb.g(strC, jG, v.b(new b(this, dVar.c(zVar), jG)));
        } catch (IOException e10) {
            this.f45451b.getClass();
            e call = this.f45450a;
            kotlin.jvm.internal.i.e(call, "call");
            f(e10);
            throw e10;
        }
    }

    public final z.a e(boolean z10) throws IOException {
        try {
            z.a aVarD = this.f45453d.d(z10);
            if (aVarD != null) {
                aVarD.f45704m = this;
            }
            return aVarD;
        } catch (IOException e10) {
            this.f45451b.getClass();
            e call = this.f45450a;
            kotlin.jvm.internal.i.e(call, "call");
            f(e10);
            throw e10;
        }
    }

    public final void f(IOException iOException) {
        this.f45455f = true;
        this.f45452c.c(iOException);
        f fVarE = this.f45453d.e();
        e call = this.f45450a;
        synchronized (fVarE) {
            try {
                kotlin.jvm.internal.i.e(call, "call");
                if (!(iOException instanceof StreamResetException)) {
                    if (!(fVarE.f45504g != null) || (iOException instanceof ConnectionShutdownException)) {
                        fVarE.j = true;
                        if (fVarE.f45509m == 0) {
                            f.d(call.f45477b, fVarE.f45499b, iOException);
                            fVarE.f45508l++;
                        }
                    }
                } else if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i10 = fVarE.f45510n + 1;
                    fVarE.f45510n = i10;
                    if (i10 > 1) {
                        fVarE.j = true;
                        fVarE.f45508l++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !call.f45491q) {
                    fVarE.j = true;
                    fVarE.f45508l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
