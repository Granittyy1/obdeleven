package rb;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import p318zb.C2835b;
import p318zb.C2839f;
import p318zb.F;
import p318zb.H;
import p318zb.I;

/* JADX INFO: compiled from: Http2Stream.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f46630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f46631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f46632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f46633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f46634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque<okhttp3.o> f46635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f46636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f46637i;
    public final a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f46638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f46639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ErrorCode f46640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IOException f46641n;

    /* JADX INFO: compiled from: Http2Stream.kt */
    public final class a implements F {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f46642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C2839f f46643c = new C2839f();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f46644d;

        public a(boolean z10) {
            this.f46642b = z10;
        }

        public final void b(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            p pVar = p.this;
            synchronized (pVar) {
                try {
                    pVar.f46639l.i();
                    while (pVar.f46633e >= pVar.f46634f && !this.f46642b && !this.f46644d) {
                        try {
                            synchronized (pVar) {
                                ErrorCode errorCode = pVar.f46640m;
                                if (errorCode != null) {
                                    break;
                                } else {
                                    pVar.k();
                                }
                            }
                        } catch (Throwable th) {
                            pVar.f46639l.l();
                            throw th;
                        }
                    }
                    pVar.f46639l.l();
                    pVar.b();
                    jMin = Math.min(pVar.f46634f - pVar.f46633e, this.f46643c.f49074c);
                    pVar.f46633e += jMin;
                    z11 = z10 && jMin == this.f46643c.f49074c;
                    p293xa.r rVar = p293xa.r.f47939a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            p.this.f46639l.i();
            try {
                p pVar2 = p.this;
                pVar2.f46630b.p(pVar2.f46629a, z11, this.f46643c, jMin);
            } finally {
                p.this.f46639l.l();
            }
        }

        @Override // p318zb.F, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            boolean z10;
            p pVar = p.this;
            byte[] bArr = p172nb.b.f45026a;
            synchronized (pVar) {
                if (this.f46644d) {
                    return;
                }
                synchronized (pVar) {
                    z10 = pVar.f46640m == null;
                    p293xa.r rVar = p293xa.r.f47939a;
                }
                p pVar2 = p.this;
                if (!pVar2.j.f46642b) {
                    if (this.f46643c.f49074c > 0) {
                        while (this.f46643c.f49074c > 0) {
                            b(true);
                        }
                    } else if (z10) {
                        pVar2.f46630b.p(pVar2.f46629a, true, null, 0L);
                    }
                }
                synchronized (p.this) {
                    this.f46644d = true;
                    p293xa.r rVar2 = p293xa.r.f47939a;
                }
                p.this.f46630b.f46570x.flush();
                p.this.a();
            }
        }

        @Override // p318zb.F, java.io.Flushable
        public final void flush() throws IOException {
            p pVar = p.this;
            byte[] bArr = p172nb.b.f45026a;
            synchronized (pVar) {
                pVar.b();
                p293xa.r rVar = p293xa.r.f47939a;
            }
            while (this.f46643c.f49074c > 0) {
                b(false);
                p.this.f46630b.f46570x.flush();
            }
        }

        @Override // p318zb.F
        public final void t0(C2839f source, long j) throws IOException {
            kotlin.jvm.internal.i.e(source, "source");
            byte[] bArr = p172nb.b.f45026a;
            C2839f c2839f = this.f46643c;
            c2839f.t0(source, j);
            while (c2839f.f49074c >= 16384) {
                b(false);
            }
        }

        @Override // p318zb.F
        public final I timeout() {
            return p.this.f46639l;
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    public final class b implements H {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f46646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f46647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C2839f f46648d = new C2839f();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C2839f f46649e = new C2839f();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f46650f;

        public b(long j, boolean z10) {
            this.f46646b = j;
            this.f46647c = z10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j;
            p pVar = p.this;
            synchronized (pVar) {
                this.f46650f = true;
                C2839f c2839f = this.f46649e;
                j = c2839f.f49074c;
                c2839f.b();
                pVar.notifyAll();
                p293xa.r rVar = p293xa.r.f47939a;
            }
            if (j > 0) {
                byte[] bArr = p172nb.b.f45026a;
                p.this.f46630b.k(j);
            }
            p.this.a();
        }

        /* JADX WARN: Code duplicated, block: B:45:0x008b A[LOOP:0: B:4:0x0010->B:45:0x008b, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:48:0x0092 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:49:0x0093 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:50:0x0095 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:51:0x0096  */
        /* JADX WARN: Code duplicated, block: B:72:0x008e A[SYNTHETIC] */
        @Override // p318zb.H
        public final long l0(C2839f sink, long j) throws Throwable {
            ErrorCode errorCode;
            Throwable streamResetException;
            boolean z10;
            long jL0;
            kotlin.jvm.internal.i.e(sink, "sink");
            long j10 = 0;
            if (j < 0) {
                throw new IllegalArgumentException(com.google.gson.internal.b.b(j, "byteCount < 0: ").toString());
            }
            while (true) {
                p pVar = p.this;
                synchronized (pVar) {
                    pVar.f46638k.i();
                    try {
                        synchronized (pVar) {
                            errorCode = pVar.f46640m;
                        }
                        if (z10) {
                            if (jL0 != -1) {
                                return jL0;
                            }
                            if (streamResetException == null) {
                                return -1L;
                            }
                            throw streamResetException;
                        }
                        j10 = 0;
                    } catch (Throwable th) {
                        pVar.f46638k.l();
                        throw th;
                    }
                }
                if (errorCode == null || this.f46647c) {
                    streamResetException = null;
                } else {
                    streamResetException = pVar.f46641n;
                    if (streamResetException == null) {
                        synchronized (pVar) {
                            ErrorCode errorCode2 = pVar.f46640m;
                            kotlin.jvm.internal.i.b(errorCode2);
                            streamResetException = new StreamResetException(errorCode2);
                        }
                    }
                }
                if (this.f46650f) {
                    throw new IOException("stream closed");
                }
                C2839f c2839f = this.f46649e;
                long j11 = c2839f.f49074c;
                z10 = false;
                if (j11 > j10) {
                    jL0 = c2839f.l0(sink, Math.min(j, j11));
                    long j12 = pVar.f46631c + jL0;
                    pVar.f46631c = j12;
                    long j13 = j12 - pVar.f46632d;
                    if (streamResetException == null && j13 >= pVar.f46630b.f46563q.a() / 2) {
                        pVar.f46630b.x(pVar.f46629a, j13);
                        pVar.f46632d = pVar.f46631c;
                    }
                } else {
                    if (!this.f46647c && streamResetException == null) {
                        pVar.k();
                        z10 = true;
                    }
                    jL0 = -1;
                }
                pVar.f46638k.l();
                p293xa.r rVar = p293xa.r.f47939a;
                if (z10) {
                    if (jL0 != -1) {
                        return jL0;
                    }
                    if (streamResetException == null) {
                        return -1L;
                    }
                    throw streamResetException;
                }
                j10 = 0;
            }
        }

        @Override // p318zb.H
        public final I timeout() {
            return p.this.f46638k;
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    public final class c extends C2835b {
        public c() {
        }

        @Override // p318zb.C2835b
        public final void k() {
            p.this.e(ErrorCode.CANCEL);
            d dVar = p.this.f46630b;
            synchronized (dVar) {
                long j = dVar.f46561o;
                long j10 = dVar.f46560n;
                if (j < j10) {
                    return;
                }
                dVar.f46560n = j10 + 1;
                dVar.f46562p = System.nanoTime() + ((long) 1000000000);
                p293xa.r rVar = p293xa.r.f47939a;
                dVar.f46556i.c(new m(Q8.d.a(new StringBuilder(), dVar.f46551d, " ping"), dVar), 0L);
            }
        }

        public final void l() throws IOException {
            if (j()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public p(int i10, d connection, boolean z10, boolean z11, okhttp3.o oVar) {
        kotlin.jvm.internal.i.e(connection, "connection");
        this.f46629a = i10;
        this.f46630b = connection;
        this.f46634f = connection.f46564r.a();
        ArrayDeque<okhttp3.o> arrayDeque = new ArrayDeque<>();
        this.f46635g = arrayDeque;
        this.f46637i = new b(connection.f46563q.a(), z11);
        this.j = new a(z10);
        this.f46638k = new c();
        this.f46639l = new c();
        if (oVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(oVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001b  */
    public final void a() throws IOException {
        boolean z10;
        boolean zH;
        byte[] bArr = p172nb.b.f45026a;
        synchronized (this) {
            try {
                b bVar = this.f46637i;
                if (bVar.f46647c || !bVar.f46650f) {
                    z10 = false;
                } else {
                    a aVar = this.j;
                    if (aVar.f46642b || aVar.f46644d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                zH = h();
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            c(ErrorCode.CANCEL, null);
        } else {
            if (zH) {
                return;
            }
            this.f46630b.i(this.f46629a);
        }
    }

    public final void b() throws IOException {
        a aVar = this.j;
        if (aVar.f46644d) {
            throw new IOException("stream closed");
        }
        if (aVar.f46642b) {
            throw new IOException("stream finished");
        }
        if (this.f46640m != null) {
            IOException iOException = this.f46641n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f46640m;
            kotlin.jvm.internal.i.b(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void c(ErrorCode errorCode, IOException iOException) throws IOException {
        if (d(errorCode, iOException)) {
            this.f46630b.f46570x.j(this.f46629a, errorCode);
        }
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = p172nb.b.f45026a;
        synchronized (this) {
            if (this.f46640m != null) {
                return false;
            }
            this.f46640m = errorCode;
            this.f46641n = iOException;
            notifyAll();
            if (this.f46637i.f46647c && this.j.f46642b) {
                return false;
            }
            p293xa.r rVar = p293xa.r.f47939a;
            this.f46630b.i(this.f46629a);
            return true;
        }
    }

    public final void e(ErrorCode errorCode) {
        if (d(errorCode, null)) {
            this.f46630b.s(this.f46629a, errorCode);
        }
    }

    public final a f() {
        synchronized (this) {
            try {
                if (!this.f46636h && !g()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z10 = (this.f46629a & 1) == 1;
        this.f46630b.getClass();
        return true == z10;
    }

    public final synchronized boolean h() {
        if (this.f46640m != null) {
            return false;
        }
        b bVar = this.f46637i;
        if (bVar.f46647c || bVar.f46650f) {
            a aVar = this.j;
            if ((aVar.f46642b || aVar.f46644d) && this.f46636h) {
                return false;
            }
        }
        return true;
    }

    public final void i(okhttp3.o headers, boolean z10) {
        boolean zH;
        kotlin.jvm.internal.i.e(headers, "headers");
        byte[] bArr = p172nb.b.f45026a;
        synchronized (this) {
            try {
                if (this.f46636h && z10) {
                    this.f46637i.getClass();
                } else {
                    this.f46636h = true;
                    this.f46635g.add(headers);
                }
                if (z10) {
                    this.f46637i.f46647c = true;
                }
                zH = h();
                notifyAll();
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.f46630b.i(this.f46629a);
    }

    public final synchronized void j(ErrorCode errorCode) {
        if (this.f46640m == null) {
            this.f46640m = errorCode;
            notifyAll();
        }
    }

    public final void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
