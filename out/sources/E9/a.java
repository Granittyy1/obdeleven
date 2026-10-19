package E9;

import A8.p;
import io.grpc.internal.J0;
import io.grpc.okhttp.internal.framed.ErrorCode;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.net.Socket;
import p237t3.x;
import p318zb.C2836c;
import p318zb.C2839f;
import p318zb.F;
import p318zb.I;

/* JADX INFO: compiled from: AsyncSink.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements F {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J0 f3129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.grpc.okhttp.d f3130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3131f;
    public C2836c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Socket f3135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3138n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3127b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2839f f3128c = new C2839f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3132g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3133h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3134i = false;

    /* JADX INFO: renamed from: E9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsyncSink.java */
    public class C0031a extends e {
        public C0031a() {
            super();
            p111ia.b.b();
        }

        @Override // E9.a.e
        public final void a() throws IOException {
            a aVar;
            int i10;
            C2839f c2839f = new C2839f();
            p111ia.b.c();
            try {
                p111ia.a aVar2 = p111ia.b.f36850a;
                aVar2.getClass();
                synchronized (a.this.f3127b) {
                    C2839f c2839f2 = a.this.f3128c;
                    c2839f.t0(c2839f2, c2839f2.h());
                    aVar = a.this;
                    aVar.f3132g = false;
                    i10 = aVar.f3138n;
                }
                aVar.j.t0(c2839f, c2839f.f49074c);
                synchronized (a.this.f3127b) {
                    a.this.f3138n -= i10;
                }
                aVar2.getClass();
            } catch (Throwable th) {
                try {
                    p111ia.b.f36850a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: AsyncSink.java */
    public class b extends e {
        public b() {
            super();
            p111ia.b.b();
        }

        @Override // E9.a.e
        public final void a() throws IOException {
            a aVar;
            C2839f c2839f = new C2839f();
            p111ia.b.c();
            try {
                p111ia.a aVar2 = p111ia.b.f36850a;
                aVar2.getClass();
                synchronized (a.this.f3127b) {
                    C2839f c2839f2 = a.this.f3128c;
                    c2839f.t0(c2839f2, c2839f2.f49074c);
                    aVar = a.this;
                    aVar.f3133h = false;
                }
                aVar.j.t0(c2839f, c2839f.f49074c);
                a.this.j.flush();
                aVar2.getClass();
            } catch (Throwable th) {
                try {
                    p111ia.b.f36850a.getClass();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: AsyncSink.java */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            try {
                C2836c c2836c = aVar.j;
                if (c2836c != null) {
                    C2839f c2839f = aVar.f3128c;
                    long j = c2839f.f49074c;
                    if (j > 0) {
                        c2836c.t0(c2839f, j);
                    }
                }
            } catch (IOException e10) {
                aVar.f3130e.n(e10);
            }
            C2839f c2839f2 = aVar.f3128c;
            io.grpc.okhttp.d dVar = aVar.f3130e;
            c2839f2.getClass();
            try {
                C2836c c2836c2 = aVar.j;
                if (c2836c2 != null) {
                    c2836c2.close();
                }
            } catch (IOException e11) {
                dVar.n(e11);
            }
            try {
                Socket socket = aVar.f3135k;
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e12) {
                dVar.n(e12);
            }
        }
    }

    /* JADX INFO: compiled from: AsyncSink.java */
    public class d extends E9.b {
        public d(F9.b bVar) {
            super(bVar);
        }

        @Override // F9.b
        public final void D(x xVar) throws IOException {
            a.this.f3137m++;
            this.f3144b.D(xVar);
        }

        @Override // F9.b
        public final void W(int i10, int i11, boolean z10) throws IOException {
            if (z10) {
                a.this.f3137m++;
            }
            this.f3144b.W(i10, i11, z10);
        }

        @Override // F9.b
        public final void Y0(int i10, ErrorCode errorCode) throws IOException {
            a.this.f3137m++;
            this.f3144b.Y0(i10, errorCode);
        }
    }

    /* JADX INFO: compiled from: AsyncSink.java */
    public abstract class e implements Runnable {
        public e() {
        }

        public abstract void a() throws IOException;

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            try {
                if (aVar.j == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                a();
            } catch (Exception e10) {
                aVar.f3130e.n(e10);
            }
        }
    }

    public a(J0 j10, io.grpc.okhttp.d dVar) {
        p.j(j10, "executor");
        this.f3129d = j10;
        this.f3130e = dVar;
        this.f3131f = 10000;
    }

    public final void b(C2836c c2836c, Socket socket) {
        p.p("AsyncSink's becomeConnected should only be called once.", this.j == null);
        this.j = c2836c;
        this.f3135k = socket;
    }

    @Override // p318zb.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3134i) {
            return;
        }
        this.f3134i = true;
        this.f3129d.execute(new c());
    }

    @Override // p318zb.F, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f3134i) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        p111ia.b.c();
        try {
            synchronized (this.f3127b) {
                if (this.f3133h) {
                    p111ia.b.f36850a.getClass();
                    return;
                }
                this.f3133h = true;
                this.f3129d.execute(new b());
                p111ia.b.f36850a.getClass();
            }
        } catch (Throwable th) {
            try {
                p111ia.b.f36850a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p318zb.F
    public final void t0(C2839f c2839f, long j) throws IOException {
        p.j(c2839f, "source");
        if (this.f3134i) {
            throw new IOException(MetricTracker.Action.CLOSED);
        }
        p111ia.b.c();
        try {
            synchronized (this.f3127b) {
                try {
                    this.f3128c.t0(c2839f, j);
                    int i10 = this.f3138n + this.f3137m;
                    this.f3138n = i10;
                    boolean z10 = false;
                    this.f3137m = 0;
                    if (this.f3136l || i10 <= this.f3131f) {
                        if (!this.f3132g && !this.f3133h && this.f3128c.h() > 0) {
                            this.f3132g = true;
                        }
                        p111ia.b.f36850a.getClass();
                        return;
                    }
                    this.f3136l = true;
                    z10 = true;
                    if (!z10) {
                        this.f3129d.execute(new C0031a());
                        p111ia.b.f36850a.getClass();
                    } else {
                        try {
                            this.f3135k.close();
                        } catch (IOException e10) {
                            this.f3130e.n(e10);
                        }
                        p111ia.b.f36850a.getClass();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                p111ia.b.f36850a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // p318zb.F
    public final I timeout() {
        return I.f49052d;
    }
}
