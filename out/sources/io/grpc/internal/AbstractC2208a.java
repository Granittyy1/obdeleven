package io.grpc.internal;

import io.grpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p318zb.C2839f;

/* JADX INFO: renamed from: io.grpc.internal.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AbstractClientStream.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2208a extends AbstractC2216e implements InterfaceC2236o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f37498g = Logger.getLogger(AbstractC2208a.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U0 f37499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f37500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.grpc.m f37503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f37504f;

    /* JADX INFO: renamed from: io.grpc.internal.a$b */
    /* JADX INFO: compiled from: AbstractClientStream.java */
    public static abstract class b extends AbstractC2216e.a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final O0 f37510h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f37511i;
        public ClientStreamListener j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public D9.l f37512k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f37513l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public RunnableC0393a f37514m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public volatile boolean f37515n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f37516o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f37517p;

        /* JADX INFO: renamed from: io.grpc.internal.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbstractClientStream.java */
        public class RunnableC0393a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Status f37518b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ClientStreamListener.RpcProgress f37519c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ io.grpc.m f37520d;

            public RunnableC0393a(Status status, ClientStreamListener.RpcProgress rpcProgress, io.grpc.m mVar) {
                this.f37518b = status;
                this.f37519c = rpcProgress;
                this.f37520d = mVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b.this.f(this.f37518b, this.f37519c, this.f37520d);
            }
        }

        public b(int i10, O0 o10, U0 u10) {
            super(i10, o10, u10);
            this.f37512k = D9.l.f2895d;
            this.f37513l = false;
            this.f37510h = o10;
        }

        public final void f(Status status, ClientStreamListener.RpcProgress rpcProgress, io.grpc.m mVar) {
            if (this.f37511i) {
                return;
            }
            this.f37511i = true;
            O0 o10 = this.f37510h;
            if (o10.f37430b.compareAndSet(false, true)) {
                for (C.g gVar : o10.f37429a) {
                    gVar.g0(status);
                }
            }
            this.j.d(status, rpcProgress, mVar);
            if (this.f37533c != null) {
                status.f();
            }
        }

        public final void g(io.grpc.m mVar) {
            A8.p.p("Received headers on closed stream", !this.f37516o);
            for (C.g gVar : this.f37510h.f37429a) {
                ((io.grpc.c) gVar).j0();
            }
            D9.e.b bVar = D9.e.b.f2879a;
            String str = (String) mVar.c(GrpcUtil.f37202d);
            if (str != null) {
                D9.l.a aVar = this.f37512k.f2896a.get(str);
                D9.e eVar = aVar != null ? aVar.f2898a : null;
                if (eVar == null) {
                    ((io.grpc.okhttp.c.b) this).o(Status.f36904k.h("Can't find decompressor for ".concat(str)).a());
                    return;
                } else if (eVar != bVar) {
                    this.f37531a.h(eVar);
                }
            }
            this.j.b(mVar);
        }

        public final void h(Status status, ClientStreamListener.RpcProgress rpcProgress, boolean z10, io.grpc.m mVar) {
            A8.p.j(status, "status");
            if (!this.f37516o || z10) {
                this.f37516o = true;
                this.f37517p = status.f();
                synchronized (this.f37532b) {
                    this.f37537g = true;
                }
                if (this.f37513l) {
                    this.f37514m = null;
                    f(status, rpcProgress, mVar);
                    return;
                }
                this.f37514m = new RunnableC0393a(status, rpcProgress, mVar);
                if (z10) {
                    this.f37531a.close();
                } else {
                    this.f37531a.b();
                }
            }
        }

        public final void i(Status status, boolean z10, io.grpc.m mVar) {
            h(status, ClientStreamListener.RpcProgress.f37134b, z10, mVar);
        }
    }

    public AbstractC2208a(C.e eVar, O0 o10, U0 u10, io.grpc.m mVar, io.grpc.b bVar, boolean z10) {
        A8.p.j(mVar, "headers");
        A8.p.j(u10, "transportTracer");
        this.f37499a = u10;
        this.f37501c = !Boolean.TRUE.equals(bVar.a(GrpcUtil.f37211n));
        this.f37502d = z10;
        if (z10) {
            this.f37500b = new C0392a(mVar, o10);
        } else {
            this.f37500b = new C2241q0(this, eVar, o10);
            this.f37503e = mVar;
        }
    }

    @Override // io.grpc.internal.P0
    public final boolean b() {
        return m().e() && !this.f37504f;
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void c(int i10) {
        m().f37531a.c(i10);
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void d(int i10) {
        this.f37500b.d(i10);
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void e(androidx.compose.runtime.snapshots.j jVar) {
        jVar.a(((io.grpc.okhttp.c) this).f37849n.f36933a.get(io.grpc.e.f36962a), "remote_addr");
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void f(Status status) {
        A8.p.f("Should not cancel with OK status", !status.f());
        this.f37504f = true;
        io.grpc.okhttp.c.a aVarN = n();
        aVarN.getClass();
        p111ia.b.c();
        try {
            synchronized (io.grpc.okhttp.c.this.f37847l.f37865w) {
                io.grpc.okhttp.c.this.f37847l.n(status, true, null);
            }
            p111ia.b.f36850a.getClass();
        } catch (Throwable th) {
            try {
                p111ia.b.f36850a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void g(D9.j jVar) {
        io.grpc.m mVar = this.f37503e;
        io.grpc.m.b bVar = GrpcUtil.f37201c;
        mVar.a(bVar);
        this.f37503e.e(bVar, Long.valueOf(Math.max(0L, jVar.c(TimeUnit.NANOSECONDS))));
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void h(D9.l lVar) {
        io.grpc.okhttp.c.b bVarM = m();
        A8.p.p("Already called start", bVarM.j == null);
        A8.p.j(lVar, "decompressorRegistry");
        bVarM.f37512k = lVar;
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void i() {
        if (m().f37515n) {
            return;
        }
        m().f37515n = true;
        this.f37500b.close();
    }

    @Override // io.grpc.internal.InterfaceC2236o
    public final void j(ClientStreamListener clientStreamListener) {
        io.grpc.okhttp.c.b bVarM = m();
        A8.p.p("Already called setListener", bVarM.j == null);
        A8.p.j(clientStreamListener, "listener");
        bVarM.j = clientStreamListener;
        if (this.f37502d) {
            return;
        }
        n().a(this.f37503e, null);
        this.f37503e = null;
    }

    public abstract io.grpc.okhttp.c.a n();

    public final void o(V0 v0, boolean z10, boolean z11, int i10) {
        C2839f c2839f;
        A8.p.f("null frame before EOS", v0 != null || z10);
        io.grpc.okhttp.c.a aVarN = n();
        aVarN.getClass();
        p111ia.b.c();
        try {
            if (v0 == null) {
                c2839f = io.grpc.okhttp.c.f37843p;
            } else {
                c2839f = ((E9.h) v0).f3168a;
                int i11 = (int) c2839f.f49074c;
                if (i11 > 0) {
                    io.grpc.okhttp.c.b bVar = io.grpc.okhttp.c.this.f37847l;
                    synchronized (bVar.f37532b) {
                        bVar.f37535e += i11;
                    }
                }
            }
            synchronized (io.grpc.okhttp.c.this.f37847l.f37865w) {
                io.grpc.okhttp.c.b.m(io.grpc.okhttp.c.this.f37847l, c2839f, z10, z11);
                U0 u10 = io.grpc.okhttp.c.this.f37499a;
                if (i10 == 0) {
                    u10.getClass();
                } else {
                    u10.getClass();
                    u10.f37488a.a();
                }
            }
            p111ia.b.f36850a.getClass();
        } catch (Throwable th) {
            try {
                p111ia.b.f36850a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.grpc.internal.AbstractC2216e
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract io.grpc.okhttp.c.b m();

    /* JADX INFO: renamed from: io.grpc.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractClientStream.java */
    public class C0392a implements M {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public io.grpc.m f37505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f37506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final O0 f37507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f37508d;

        public C0392a(io.grpc.m mVar, O0 o10) {
            A8.p.j(mVar, "headers");
            this.f37505a = mVar;
            this.f37507c = o10;
        }

        @Override // io.grpc.internal.M
        public final void b(InputStream inputStream) {
            A8.p.p("writePayload should not be called multiple times", this.f37508d == null);
            try {
                this.f37508d = p082g6.a.b(inputStream);
                O0 o10 = this.f37507c;
                for (C.g gVar : o10.f37429a) {
                    gVar.b0(0);
                }
                byte[] bArr = this.f37508d;
                long length = bArr.length;
                long length2 = bArr.length;
                for (C.g gVar2 : o10.f37429a) {
                    gVar2.c0(0, length, length2);
                }
                long length3 = this.f37508d.length;
                C.g[] gVarArr = o10.f37429a;
                for (C.g gVar3 : gVarArr) {
                    gVar3.d0(length3);
                }
                long length4 = this.f37508d.length;
                for (C.g gVar4 : gVarArr) {
                    gVar4.e0(length4);
                }
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // io.grpc.internal.M
        public final void close() {
            this.f37506b = true;
            A8.p.p("Lack of request message. GET request is only supported for unary requests", this.f37508d != null);
            AbstractC2208a.this.n().a(this.f37505a, this.f37508d);
            this.f37508d = null;
            this.f37505a = null;
        }

        @Override // io.grpc.internal.M
        public final boolean isClosed() {
            return this.f37506b;
        }

        @Override // io.grpc.internal.M
        public final void flush() {
        }

        @Override // io.grpc.internal.M
        public final M a(D9.f fVar) {
            return this;
        }

        @Override // io.grpc.internal.M
        public final void d(int i10) {
        }
    }
}
