package rb;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import okhttp3.internal.http2.ErrorCode;
import p318zb.B;
import p318zb.C;
import p318zb.C2839f;

/* JADX INFO: compiled from: Http2Connection.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Closeable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final t f46548A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f46549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f46550c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f46554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p184ob.d f46555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p184ob.c f46556i;
    public final p184ob.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p184ob.c f46557k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f46558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f46559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f46560n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f46561o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f46562p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f46563q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public t f46564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f46565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f46566t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f46567u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f46568v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Socket f46569w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final q f46570x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f46571y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final LinkedHashSet f46572z;

    /* JADX INFO: compiled from: Http2Connection.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p184ob.d f46573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Socket f46574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f46575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C f46576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public B f46577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f46578f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final s f46579g;

        public a(p184ob.d taskRunner) {
            kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
            this.f46573a = taskRunner;
            this.f46578f = b.f46580a;
            this.f46579g = s.f46665a;
        }
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46580a = new a();

        /* JADX INFO: compiled from: Http2Connection.kt */
        public static final class a extends b {
            @Override // rb.d.b
            public final void b(p pVar) throws IOException {
                pVar.c(ErrorCode.REFUSED_STREAM, null);
            }
        }

        public void a(d connection, t settings) {
            kotlin.jvm.internal.i.e(connection, "connection");
            kotlin.jvm.internal.i.e(settings, "settings");
        }

        public abstract void b(p pVar) throws IOException;
    }

    /* JADX INFO: compiled from: Http2Connection.kt */
    public final class c implements Ia.a<p293xa.r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f46581b;

        public c(o oVar) {
            this.f46581b = oVar;
        }

        public final void a(boolean z10, int i10, C source, int i11) throws IOException {
            boolean z11;
            boolean z12;
            kotlin.jvm.internal.i.e(source, "source");
            d.this.getClass();
            if (i10 != 0 && (i10 & 1) == 0) {
                d dVar = d.this;
                dVar.getClass();
                C2839f c2839f = new C2839f();
                long j = i11;
                source.N0(j);
                source.l0(c2839f, j);
                dVar.j.c(new i(dVar.f46551d + '[' + i10 + "] onData", dVar, i10, c2839f, i11, z10), 0L);
                return;
            }
            p pVarH = d.this.h(i10);
            if (pVarH == null) {
                d.this.s(i10, ErrorCode.PROTOCOL_ERROR);
                long j10 = i11;
                d.this.k(j10);
                source.skip(j10);
                return;
            }
            byte[] bArr = p172nb.b.f45026a;
            p.b bVar = pVarH.f46637i;
            long j11 = i11;
            bVar.getClass();
            long j12 = j11;
            while (true) {
                if (j12 <= 0) {
                    byte[] bArr2 = p172nb.b.f45026a;
                    p.this.f46630b.k(j11);
                    break;
                }
                synchronized (p.this) {
                    z11 = bVar.f46647c;
                    z12 = bVar.f46649e.f49074c + j12 > bVar.f46646b;
                    p293xa.r rVar = p293xa.r.f47939a;
                }
                if (z12) {
                    source.skip(j12);
                    p.this.e(ErrorCode.FLOW_CONTROL_ERROR);
                    break;
                }
                if (z11) {
                    source.skip(j12);
                    break;
                }
                long jL0 = source.l0(bVar.f46648d, j12);
                if (jL0 == -1) {
                    throw new EOFException();
                }
                j12 -= jL0;
                p pVar = p.this;
                synchronized (pVar) {
                    try {
                        if (bVar.f46650f) {
                            bVar.f46648d.b();
                        } else {
                            C2839f c2839f2 = bVar.f46649e;
                            boolean z13 = c2839f2.f49074c == 0;
                            c2839f2.k0(bVar.f46648d);
                            if (z13) {
                                pVar.notifyAll();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z10) {
                pVarH.i(p172nb.b.f45027b, true);
            }
        }

        public final void c(boolean z10, int i10, List headerBlock) {
            kotlin.jvm.internal.i.e(headerBlock, "headerBlock");
            d.this.getClass();
            if (i10 != 0 && (i10 & 1) == 0) {
                d dVar = d.this;
                dVar.getClass();
                dVar.j.c(new j(dVar.f46551d + '[' + i10 + "] onHeaders", dVar, i10, headerBlock, z10), 0L);
                return;
            }
            d dVar2 = d.this;
            synchronized (dVar2) {
                p pVarH = dVar2.h(i10);
                if (pVarH != null) {
                    p293xa.r rVar = p293xa.r.f47939a;
                    pVarH.i(p172nb.b.v(headerBlock), z10);
                    return;
                }
                if (dVar2.f46554g) {
                    return;
                }
                if (i10 <= dVar2.f46552e) {
                    return;
                }
                if (i10 % 2 == dVar2.f46553f % 2) {
                    return;
                }
                p pVar = new p(i10, dVar2, false, z10, p172nb.b.v(headerBlock));
                dVar2.f46552e = i10;
                dVar2.f46550c.put(Integer.valueOf(i10), pVar);
                dVar2.f46555h.e().c(new f(dVar2.f46551d + '[' + i10 + "] onStream", dVar2, pVar), 0L);
            }
        }

        public final void d(int i10, List requestHeaders) {
            kotlin.jvm.internal.i.e(requestHeaders, "requestHeaders");
            d dVar = d.this;
            dVar.getClass();
            synchronized (dVar) {
                if (dVar.f46572z.contains(Integer.valueOf(i10))) {
                    dVar.s(i10, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                dVar.f46572z.add(Integer.valueOf(i10));
                dVar.j.c(new k(dVar.f46551d + '[' + i10 + "] onRequest", dVar, i10, requestHeaders), 0L);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [rb.d] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // Ia.a
        public final p293xa.r invoke() throws Throwable {
            Throwable th;
            ErrorCode errorCode;
            ?? r10 = d.this;
            o oVar = this.f46581b;
            ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
            ?? r11 = 1;
            IOException e10 = null;
            try {
                try {
                    try {
                        if (!oVar.b(true, this)) {
                            throw new IOException("Required SETTINGS preface not received");
                        }
                        do {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } while (oVar.b(false, this));
                        errorCode = ErrorCode.NO_ERROR;
                        try {
                            errorCode2 = ErrorCode.CANCEL;
                            r10.b(errorCode, errorCode2, null);
                            r11 = errorCode;
                        } catch (IOException e11) {
                            e10 = e11;
                            errorCode2 = ErrorCode.PROTOCOL_ERROR;
                            r10.b(errorCode2, errorCode2, e10);
                            r11 = errorCode;
                        }
                        p172nb.b.c(oVar);
                        return p293xa.r.f47939a;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e12) {
                    e10 = e12;
                    errorCode = errorCode2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            r11 = errorCode2;
            r10.b(r11, errorCode2, e10);
            p172nb.b.c(oVar);
            throw th;
        }
    }

    /* JADX INFO: renamed from: rb.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class C0527d extends p184ob.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f46583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f46584f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ErrorCode f46585g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0527d(String str, d dVar, int i10, ErrorCode errorCode) {
            super(str, true);
            this.f46583e = dVar;
            this.f46584f = i10;
            this.f46585g = errorCode;
        }

        @Override // p184ob.a
        public final long a() {
            d dVar = this.f46583e;
            try {
                dVar.f46570x.j(this.f46584f, this.f46585g);
                return -1L;
            } catch (IOException e10) {
                dVar.c(e10);
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: TaskQueue.kt */
    public static final class e extends p184ob.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f46586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f46587f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f46588g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, d dVar, int i10, long j) {
            super(str, true);
            this.f46586e = dVar;
            this.f46587f = i10;
            this.f46588g = j;
        }

        @Override // p184ob.a
        public final long a() {
            d dVar = this.f46586e;
            try {
                dVar.f46570x.Q(this.f46587f, this.f46588g);
                return -1L;
            } catch (IOException e10) {
                dVar.c(e10);
                return -1L;
            }
        }
    }

    static {
        t tVar = new t();
        tVar.c(7, 65535);
        tVar.c(5, 16384);
        f46548A = tVar;
    }

    public d(a aVar) {
        this.f46549b = aVar.f46578f;
        String str = aVar.f46575c;
        if (str == null) {
            kotlin.jvm.internal.i.m("connectionName");
            throw null;
        }
        this.f46551d = str;
        this.f46553f = 3;
        p184ob.d dVar = aVar.f46573a;
        this.f46555h = dVar;
        this.f46556i = dVar.e();
        this.j = dVar.e();
        this.f46557k = dVar.e();
        this.f46558l = aVar.f46579g;
        t tVar = new t();
        tVar.c(7, 16777216);
        this.f46563q = tVar;
        t tVar2 = f46548A;
        this.f46564r = tVar2;
        this.f46568v = tVar2.a();
        Socket socket = aVar.f46574b;
        if (socket == null) {
            kotlin.jvm.internal.i.m("socket");
            throw null;
        }
        this.f46569w = socket;
        B b10 = aVar.f46577e;
        if (b10 == null) {
            kotlin.jvm.internal.i.m("sink");
            throw null;
        }
        this.f46570x = new q(b10);
        C c10 = aVar.f46576d;
        if (c10 == null) {
            kotlin.jvm.internal.i.m("source");
            throw null;
        }
        this.f46571y = new c(new o(c10));
        this.f46572z = new LinkedHashSet();
    }

    public final void b(ErrorCode errorCode, ErrorCode errorCode2, IOException iOException) {
        int i10;
        Object[] array;
        byte[] bArr = p172nb.b.f45026a;
        try {
            j(errorCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f46550c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f46550c.values().toArray(new p[0]);
                    this.f46550c.clear();
                }
                p293xa.r rVar = p293xa.r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
        p[] pVarArr = (p[]) array;
        if (pVarArr != null) {
            for (p pVar : pVarArr) {
                try {
                    pVar.c(errorCode2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f46570x.close();
        } catch (IOException unused3) {
        }
        try {
            this.f46569w.close();
        } catch (IOException unused4) {
        }
        this.f46556i.f();
        this.j.f();
        this.f46557k.f();
    }

    public final void c(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        b(errorCode, errorCode, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final synchronized p h(int i10) {
        return (p) this.f46550c.get(Integer.valueOf(i10));
    }

    public final synchronized p i(int i10) {
        p pVar;
        pVar = (p) this.f46550c.remove(Integer.valueOf(i10));
        notifyAll();
        return pVar;
    }

    public final void j(ErrorCode errorCode) throws IOException {
        synchronized (this.f46570x) {
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            synchronized (this) {
                if (this.f46554g) {
                    return;
                }
                this.f46554g = true;
                int i10 = this.f46552e;
                ref$IntRef.element = i10;
                p293xa.r rVar = p293xa.r.f47939a;
                this.f46570x.h(i10, errorCode, p172nb.b.f45026a);
            }
        }
    }

    public final synchronized void k(long j) {
        long j10 = this.f46565s + j;
        this.f46565s = j10;
        long j11 = j10 - this.f46566t;
        if (j11 >= this.f46563q.a() / 2) {
            x(0, j11);
            this.f46566t += j11;
        }
    }

    public final void p(int i10, boolean z10, C2839f c2839f, long j) throws IOException {
        long j10;
        long j11;
        int iMin;
        long j12;
        if (j == 0) {
            this.f46570x.v(z10, i10, c2839f, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j10 = this.f46567u;
                            j11 = this.f46568v;
                            if (j10 >= j11) {
                                if (!this.f46550c.containsKey(Integer.valueOf(i10))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j11 - j10), this.f46570x.f46656d);
                j12 = iMin;
                this.f46567u += j12;
                p293xa.r rVar = p293xa.r.f47939a;
            }
            j -= j12;
            this.f46570x.v(z10 && j == 0, i10, c2839f, iMin);
        }
    }

    public final void s(int i10, ErrorCode errorCode) {
        this.f46556i.c(new C0527d(this.f46551d + '[' + i10 + "] writeSynReset", this, i10, errorCode), 0L);
    }

    public final void x(int i10, long j) {
        this.f46556i.c(new e(this.f46551d + '[' + i10 + "] windowUpdate", this, i10, j), 0L);
    }
}
