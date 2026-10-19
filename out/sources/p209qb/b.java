package p209qb;

import O.h;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.i;
import kotlin.text.m;
import kotlin.text.n;
import okhttp3.o;
import okhttp3.p;
import okhttp3.t;
import okhttp3.u;
import okhttp3.y;
import okhttp3.z;
import p318zb.B;
import p318zb.C;
import p318zb.C2839f;
import p318zb.F;
import p318zb.H;
import p318zb.I;

/* JADX INFO: compiled from: Http1ExchangeCodec.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements p197pb.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f46199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okhttp3.internal.connection.f f46200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C f46201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f46202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p209qb.a f46204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f46205g;

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public abstract class a implements H {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p318zb.o f46206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f46207c;

        public a() {
            this.f46206b = new p318zb.o(b.this.f46201c.f49037b.timeout());
        }

        public final void b() {
            b bVar = b.this;
            int i10 = bVar.f46203e;
            if (i10 == 6) {
                return;
            }
            if (i10 == 5) {
                b.i(bVar, this.f46206b);
                bVar.f46203e = 6;
            } else {
                throw new IllegalStateException("state: " + bVar.f46203e);
            }
        }

        @Override // p318zb.H
        public long l0(C2839f sink, long j) throws IOException {
            b bVar = b.this;
            i.e(sink, "sink");
            try {
                return bVar.f46201c.l0(sink, j);
            } catch (IOException e10) {
                bVar.f46200b.k();
                b();
                throw e10;
            }
        }

        @Override // p318zb.H
        public final I timeout() {
            return this.f46206b;
        }
    }

    /* JADX INFO: renamed from: qb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public final class C0522b implements F {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p318zb.o f46209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f46210c;

        public C0522b() {
            this.f46209b = new p318zb.o(b.this.f46202d.f49033b.timeout());
        }

        @Override // p318zb.F, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f46210c) {
                return;
            }
            this.f46210c = true;
            b.this.f46202d.Z("0\r\n\r\n");
            b.i(b.this, this.f46209b);
            b.this.f46203e = 3;
        }

        @Override // p318zb.F, java.io.Flushable
        public final synchronized void flush() {
            if (this.f46210c) {
                return;
            }
            b.this.f46202d.flush();
        }

        @Override // p318zb.F
        public final void t0(C2839f source, long j) throws IOException {
            i.e(source, "source");
            if (this.f46210c) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            if (j == 0) {
                return;
            }
            b bVar = b.this;
            B b10 = bVar.f46202d;
            if (b10.f49035d) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            b10.f49034c.b1(j);
            b10.b();
            B b11 = bVar.f46202d;
            b11.Z("\r\n");
            b11.t0(source, j);
            b11.Z("\r\n");
        }

        @Override // p318zb.F
        public final I timeout() {
            return this.f46209b;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public final class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final p f46212e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f46213f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f46214g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ b f46215h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, p url) {
            super();
            i.e(url, "url");
            this.f46215h = bVar;
            this.f46212e = url;
            this.f46213f = -1L;
            this.f46214g = true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f46207c) {
                return;
            }
            if (this.f46214g && !p172nb.b.h(this, TimeUnit.MILLISECONDS)) {
                this.f46215h.f46200b.k();
                b();
            }
            this.f46207c = true;
        }

        @Override // qb.b.a, p318zb.H
        public final long l0(C2839f sink, long j) throws IOException {
            C2839f c2839f;
            long j10;
            i.e(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(com.google.gson.internal.b.b(j, "byteCount < 0: ").toString());
            }
            if (this.f46207c) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            if (!this.f46214g) {
                return -1L;
            }
            long j11 = this.f46213f;
            b bVar = this.f46215h;
            if (j11 == 0 || j11 == -1) {
                if (j11 != -1) {
                    bVar.f46201c.x(Long.MAX_VALUE);
                }
                try {
                    C c10 = bVar.f46201c;
                    c10.N0(1L);
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        boolean zG = c10.g(i11);
                        c2839f = c10.f49038c;
                        if (!zG) {
                            break;
                        }
                        byte bP = c2839f.p(i10);
                        if ((bP >= 48 && bP <= 57) || ((bP >= 97 && bP <= 102) || (bP >= 65 && bP <= 70))) {
                            i10 = i11;
                        }
                        if (i10 != 0) {
                            break;
                        }
                        h.c(16);
                        String string = Integer.toString(bP, 16);
                        i.d(string, "toString(...)");
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
                    }
                    this.f46213f = c2839f.f0();
                    String string2 = n.p0(bVar.f46201c.x(Long.MAX_VALUE)).toString();
                    if (this.f46213f < 0 || (string2.length() > 0 && !m.I(string2, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f46213f + string2 + '\"');
                    }
                    if (this.f46213f == 0) {
                        this.f46214g = false;
                        p209qb.a aVar = bVar.f46204f;
                        aVar.getClass();
                        o.a aVar2 = new o.a();
                        while (true) {
                            String strX = aVar.f46197a.x(aVar.f46198b);
                            aVar.f46198b -= (long) strX.length();
                            if (strX.length() == 0) {
                                break;
                            }
                            aVar2.b(strX);
                        }
                        bVar.f46205g = aVar2.e();
                        t tVar = bVar.f46199a;
                        i.b(tVar);
                        o oVar = bVar.f46205g;
                        i.b(oVar);
                        p197pb.e.b(tVar.f45619k, this.f46212e, oVar);
                        b();
                    }
                    if (!this.f46214g) {
                        return -1L;
                    }
                    j10 = -1;
                } catch (NumberFormatException e10) {
                    throw new ProtocolException(e10.getMessage());
                }
            } else {
                j10 = -1;
            }
            long jL0 = super.l0(sink, Math.min(j, this.f46213f));
            if (jL0 != j10) {
                this.f46213f -= jL0;
                return jL0;
            }
            bVar.f46200b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public final class d extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f46216e;

        public d(long j) {
            super();
            this.f46216e = j;
            if (j == 0) {
                b();
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f46207c) {
                return;
            }
            if (this.f46216e != 0 && !p172nb.b.h(this, TimeUnit.MILLISECONDS)) {
                b.this.f46200b.k();
                b();
            }
            this.f46207c = true;
        }

        @Override // qb.b.a, p318zb.H
        public final long l0(C2839f sink, long j) throws IOException {
            i.e(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(com.google.gson.internal.b.b(j, "byteCount < 0: ").toString());
            }
            if (this.f46207c) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            long j10 = this.f46216e;
            if (j10 == 0) {
                return -1L;
            }
            long jL0 = super.l0(sink, Math.min(j10, j));
            if (jL0 == -1) {
                b.this.f46200b.k();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j11 = this.f46216e - jL0;
            this.f46216e = j11;
            if (j11 == 0) {
                b();
            }
            return jL0;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public final class e implements F {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p318zb.o f46218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f46219c;

        public e() {
            this.f46218b = new p318zb.o(b.this.f46202d.f49033b.timeout());
        }

        @Override // p318zb.F, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f46219c) {
                return;
            }
            this.f46219c = true;
            b bVar = b.this;
            b.i(bVar, this.f46218b);
            bVar.f46203e = 3;
        }

        @Override // p318zb.F, java.io.Flushable
        public final void flush() {
            if (this.f46219c) {
                return;
            }
            b.this.f46202d.flush();
        }

        @Override // p318zb.F
        public final void t0(C2839f source, long j) throws IOException {
            i.e(source, "source");
            if (this.f46219c) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            long j10 = source.f49074c;
            byte[] bArr = p172nb.b.f45026a;
            if (j < 0 || 0 > j10 || j10 < j) {
                throw new ArrayIndexOutOfBoundsException();
            }
            b.this.f46202d.t0(source, j);
        }

        @Override // p318zb.F
        public final I timeout() {
            return this.f46218b;
        }
    }

    /* JADX INFO: compiled from: Http1ExchangeCodec.kt */
    public final class f extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f46221e;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f46207c) {
                return;
            }
            if (!this.f46221e) {
                b();
            }
            this.f46207c = true;
        }

        @Override // qb.b.a, p318zb.H
        public final long l0(C2839f sink, long j) throws IOException {
            i.e(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(com.google.gson.internal.b.b(j, "byteCount < 0: ").toString());
            }
            if (this.f46207c) {
                throw new IllegalStateException(MetricTracker.Action.CLOSED);
            }
            if (this.f46221e) {
                return -1L;
            }
            long jL0 = super.l0(sink, j);
            if (jL0 != -1) {
                return jL0;
            }
            this.f46221e = true;
            b();
            return -1L;
        }
    }

    public b(t tVar, okhttp3.internal.connection.f connection, C source, B sink) {
        i.e(connection, "connection");
        i.e(source, "source");
        i.e(sink, "sink");
        this.f46199a = tVar;
        this.f46200b = connection;
        this.f46201c = source;
        this.f46202d = sink;
        this.f46204f = new p209qb.a(source);
    }

    public static final void i(b bVar, p318zb.o oVar) {
        bVar.getClass();
        I i10 = oVar.f49104e;
        I.a delegate = I.f49052d;
        i.e(delegate, "delegate");
        oVar.f49104e = delegate;
        i10.a();
        i10.b();
    }

    @Override // p197pb.d
    public final void a() {
        this.f46202d.flush();
    }

    @Override // p197pb.d
    public final void b(u request) {
        i.e(request, "request");
        Proxy.Type type = this.f46200b.f45499b.f45279b.type();
        i.d(type, "connection.route().proxy.type()");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f45662b);
        sb2.append(' ');
        p pVar = request.f45661a;
        if (pVar.j || type != Proxy.Type.HTTP) {
            String strB = pVar.b();
            String strD = pVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb2.append(strB);
        } else {
            sb2.append(pVar);
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        i.d(string, "StringBuilder().apply(builderAction).toString()");
        k(request.f45663c, string);
    }

    @Override // p197pb.d
    public final H c(z zVar) {
        if (!p197pb.e.a(zVar)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(z.c("Transfer-Encoding", zVar))) {
            p pVar = zVar.f45680b.f45661a;
            if (this.f46203e == 4) {
                this.f46203e = 5;
                return new c(this, pVar);
            }
            throw new IllegalStateException(("state: " + this.f46203e).toString());
        }
        long jK = p172nb.b.k(zVar);
        if (jK != -1) {
            return j(jK);
        }
        if (this.f46203e == 4) {
            this.f46203e = 5;
            this.f46200b.k();
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f46203e).toString());
    }

    @Override // p197pb.d
    public final void cancel() {
        Socket socket = this.f46200b.f45500c;
        if (socket != null) {
            p172nb.b.d(socket);
        }
    }

    @Override // p197pb.d
    public final z.a d(boolean z10) {
        p209qb.a aVar = this.f46204f;
        int i10 = this.f46203e;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f46203e).toString());
        }
        try {
            String strX = aVar.f46197a.x(aVar.f46198b);
            aVar.f46198b -= (long) strX.length();
            p197pb.i iVarA = pb.i.a.a(strX);
            int i11 = iVarA.f45957b;
            z.a aVar2 = new z.a();
            aVar2.f45694b = iVarA.f45956a;
            aVar2.f45695c = i11;
            aVar2.f45696d = iVarA.f45958c;
            o.a aVar3 = new o.a();
            while (true) {
                String strX2 = aVar.f46197a.x(aVar.f46198b);
                aVar.f46198b -= (long) strX2.length();
                if (strX2.length() == 0) {
                    break;
                }
                aVar3.b(strX2);
            }
            aVar2.c(aVar3.e());
            if (z10 && i11 == 100) {
                return null;
            }
            if (i11 == 100) {
                this.f46203e = 3;
                return aVar2;
            }
            if (102 > i11 || i11 >= 200) {
                this.f46203e = 4;
                return aVar2;
            }
            this.f46203e = 3;
            return aVar2;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on ".concat(this.f46200b.f45499b.f45278a.f45308h.h()), e10);
        }
    }

    @Override // p197pb.d
    public final okhttp3.internal.connection.f e() {
        return this.f46200b;
    }

    @Override // p197pb.d
    public final void f() {
        this.f46202d.flush();
    }

    @Override // p197pb.d
    public final long g(z zVar) {
        if (!p197pb.e.a(zVar)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(z.c("Transfer-Encoding", zVar))) {
            return -1L;
        }
        return p172nb.b.k(zVar);
    }

    @Override // p197pb.d
    public final F h(u request, long j) throws ProtocolException {
        i.e(request, "request");
        y yVar = request.f45664d;
        if (yVar != null && yVar.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.f45663c.e("Transfer-Encoding"))) {
            if (this.f46203e == 1) {
                this.f46203e = 2;
                return new C0522b();
            }
            throw new IllegalStateException(("state: " + this.f46203e).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f46203e == 1) {
            this.f46203e = 2;
            return new e();
        }
        throw new IllegalStateException(("state: " + this.f46203e).toString());
    }

    public final d j(long j) {
        if (this.f46203e == 4) {
            this.f46203e = 5;
            return new d(j);
        }
        throw new IllegalStateException(("state: " + this.f46203e).toString());
    }

    public final void k(o oVar, String requestLine) {
        i.e(requestLine, "requestLine");
        if (this.f46203e != 0) {
            throw new IllegalStateException(("state: " + this.f46203e).toString());
        }
        B b10 = this.f46202d;
        b10.Z(requestLine);
        b10.Z("\r\n");
        int size = oVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            b10.Z(oVar.k(i10));
            b10.Z(": ");
            b10.Z(oVar.v(i10));
            b10.Z("\r\n");
        }
        b10.Z("\r\n");
        this.f46203e = 1;
    }
}
