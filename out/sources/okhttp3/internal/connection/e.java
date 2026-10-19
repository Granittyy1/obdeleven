package okhttp3.internal.connection;

import D2.V;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.p;
import okhttp3.InterfaceC2754e;
import okhttp3.k;
import okhttp3.m;
import okhttp3.t;
import okhttp3.u;
import okhttp3.z;
import p293xa.r;
import p318zb.C2835b;

/* JADX INFO: compiled from: RealCall.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements InterfaceC2754e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f45477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f45478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f45479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f45480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f45481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f45482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f45483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f45484i;
    public d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f45485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public okhttp3.internal.connection.c f45487m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f45488n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45489o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45490p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile boolean f45491q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile okhttp3.internal.connection.c f45492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile f f45493s;

    /* JADX INFO: compiled from: RealCall.kt */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final okhttp3.f f45494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile AtomicInteger f45495c = new AtomicInteger(0);

        public a(okhttp3.f fVar) {
            this.f45494b = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            k kVar;
            String strConcat = "OkHttp ".concat(e.this.f45478c.f45661a.h());
            e eVar = e.this;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strConcat);
            try {
                eVar.f45482g.i();
                boolean z10 = false;
                try {
                    try {
                        try {
                            this.f45494b.onResponse(eVar, eVar.e());
                            kVar = eVar.f45477b.f45611b;
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            if (z10) {
                                p244tb.h hVar = p244tb.h.f47384a;
                                p244tb.h hVar2 = p244tb.h.f47384a;
                                String str = "Callback failure for " + e.a(eVar);
                                hVar2.getClass();
                                p244tb.h.i(4, str, e);
                            } else {
                                this.f45494b.onFailure(eVar, e);
                            }
                            kVar = eVar.f45477b.f45611b;
                        } catch (Throwable th) {
                            th = th;
                            z10 = true;
                            eVar.cancel();
                            if (!z10) {
                                IOException iOException = new IOException("canceled due to " + th);
                                V.e(iOException, th);
                                this.f45494b.onFailure(eVar, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        eVar.f45477b.f45611b.c(this);
                        throw th2;
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (Throwable th3) {
                    th = th3;
                }
                kVar.c(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th4) {
                threadCurrentThread.setName(name);
                throw th4;
            }
        }
    }

    /* JADX INFO: compiled from: RealCall.kt */
    public static final class b extends WeakReference<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f45497a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e referent, Object obj) {
            super(referent);
            kotlin.jvm.internal.i.e(referent, "referent");
            this.f45497a = obj;
        }
    }

    /* JADX INFO: compiled from: RealCall.kt */
    public static final class c extends C2835b {
        public c() {
        }

        @Override // p318zb.C2835b
        public final void k() {
            e.this.cancel();
        }
    }

    public e(t client, u originalRequest, boolean z10) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(originalRequest, "originalRequest");
        this.f45477b = client;
        this.f45478c = originalRequest;
        this.f45479d = z10;
        this.f45480e = (i) client.f45612c.f20561b;
        this.f45481f = client.f45615f.c(this);
        c cVar = new c();
        cVar.g(0, TimeUnit.MILLISECONDS);
        this.f45482g = cVar;
        this.f45483h = new AtomicBoolean();
        this.f45490p = true;
    }

    public static final String a(e eVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eVar.f45491q ? "canceled " : "");
        sb2.append(eVar.f45479d ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(eVar.f45478c.f45661a.h());
        return sb2.toString();
    }

    @Override // okhttp3.InterfaceC2754e
    public final void C(okhttp3.f fVar) {
        a next;
        if (!this.f45483h.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        p244tb.h hVar = p244tb.h.f47384a;
        this.f45484i = p244tb.h.f47384a.g();
        this.f45481f.getClass();
        k kVar = this.f45477b.f45611b;
        a aVar = new a(fVar);
        kVar.getClass();
        synchronized (kVar) {
            kVar.f45549d.add(aVar);
            if (!this.f45479d) {
                String str = this.f45478c.f45661a.f45574d;
                Iterator<a> it = kVar.f45550e.iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator<a> it2 = kVar.f45549d.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!kotlin.jvm.internal.i.a(e.this.f45478c.f45661a.f45574d, str));
                    } else {
                        next = it.next();
                    }
                } while (!kotlin.jvm.internal.i.a(e.this.f45478c.f45661a.f45574d, str));
                if (next != null) {
                    aVar.f45495c = next.f45495c;
                }
            }
            r rVar = r.f47939a;
        }
        kVar.d();
    }

    public final void b(f fVar) {
        byte[] bArr = p172nb.b.f45026a;
        if (this.f45485k != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f45485k = fVar;
        fVar.f45512p.add(new b(this, this.f45484i));
    }

    public final <E extends IOException> E c(E e10) {
        E interruptedIOException;
        Socket socketH;
        byte[] bArr = p172nb.b.f45026a;
        f fVar = this.f45485k;
        if (fVar != null) {
            synchronized (fVar) {
                socketH = h();
            }
            if (this.f45485k == null) {
                if (socketH != null) {
                    p172nb.b.d(socketH);
                }
                this.f45481f.getClass();
            } else if (socketH != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f45486l && this.f45482g.j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e10 != null) {
                interruptedIOException.initCause(e10);
            }
        } else {
            interruptedIOException = e10;
        }
        if (e10 != null) {
            m mVar = this.f45481f;
            kotlin.jvm.internal.i.b(interruptedIOException);
            mVar.getClass();
        } else {
            this.f45481f.getClass();
        }
        return interruptedIOException;
    }

    @Override // okhttp3.InterfaceC2754e
    public final void cancel() {
        Socket socket;
        if (this.f45491q) {
            return;
        }
        this.f45491q = true;
        okhttp3.internal.connection.c cVar = this.f45492r;
        if (cVar != null) {
            cVar.f45453d.cancel();
        }
        f fVar = this.f45493s;
        if (fVar != null && (socket = fVar.f45500c) != null) {
            p172nb.b.d(socket);
        }
        this.f45481f.getClass();
    }

    public final Object clone() {
        return new e(this.f45477b, this.f45478c, this.f45479d);
    }

    public final void d(boolean z10) {
        okhttp3.internal.connection.c cVar;
        synchronized (this) {
            if (!this.f45490p) {
                throw new IllegalStateException("released");
            }
            r rVar = r.f47939a;
        }
        if (z10 && (cVar = this.f45492r) != null) {
            cVar.f45453d.cancel();
            cVar.f45450a.f(cVar, true, true, null);
        }
        this.f45487m = null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    public final z e() throws Throwable {
        ArrayList arrayList = new ArrayList();
        p.z(arrayList, this.f45477b.f45613d);
        arrayList.add(new p197pb.h(this.f45477b));
        arrayList.add(new p197pb.a(this.f45477b.f45619k));
        arrayList.add(new okhttp3.internal.cache.a(this.f45477b.f45620l));
        arrayList.add(okhttp3.internal.connection.a.f45445a);
        if (!this.f45479d) {
            p.z(arrayList, this.f45477b.f45614e);
        }
        arrayList.add(new p197pb.b(this.f45479d));
        u uVar = this.f45478c;
        t tVar = this.f45477b;
        boolean z10 = false;
        try {
            z zVarA = new p197pb.f(this, arrayList, 0, null, uVar, tVar.f45632x, tVar.f45633y, tVar.f45634z).a(this.f45478c);
            if (this.f45491q) {
                p172nb.b.c(zVarA);
                throw new IOException("Canceled");
            }
            g(null);
            return zVarA;
        } catch (IOException e10) {
            try {
                IOException iOExceptionG = g(e10);
                kotlin.jvm.internal.i.c(iOExceptionG, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionG;
            } catch (Throwable th) {
                th = th;
                z10 = true;
                if (!z10) {
                    g(null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (!z10) {
                g(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001c), top: B:54:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001c), top: B:54:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final <E extends IOException> E f(okhttp3.internal.connection.c exchange, boolean z10, boolean z11, E e10) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        kotlin.jvm.internal.i.e(exchange, "exchange");
        if (!exchange.equals(this.f45492r)) {
            return e10;
        }
        synchronized (this) {
            z12 = false;
            if (z10) {
                try {
                    if (this.f45488n) {
                        if (z10) {
                            this.f45488n = false;
                        }
                        if (z11) {
                            this.f45489o = false;
                        }
                        z14 = this.f45488n;
                        if (z14) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        if (!z14) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                    } else if (z11 || !this.f45489o) {
                        z13 = false;
                    } else {
                        if (z10) {
                            this.f45488n = false;
                        }
                        if (z11) {
                            this.f45489o = false;
                        }
                        z14 = this.f45488n;
                        if (z14 || this.f45489o) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        if (!z14 && !this.f45489o && !this.f45490p) {
                            z12 = true;
                        }
                        z13 = z12;
                        z12 = z15;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z11) {
                }
                z13 = false;
            }
            r rVar = r.f47939a;
        }
        if (z12) {
            this.f45492r = null;
            f fVar = this.f45485k;
            if (fVar != null) {
                synchronized (fVar) {
                    fVar.f45509m++;
                }
            }
        }
        return z13 ? (E) c(e10) : e10;
    }

    public final IOException g(IOException iOException) {
        boolean z10;
        synchronized (this) {
            try {
                z10 = false;
                if (this.f45490p) {
                    this.f45490p = false;
                    if (!this.f45488n && !this.f45489o) {
                        z10 = true;
                    }
                }
                r rVar = r.f47939a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10 ? c(iOException) : iOException;
    }

    public final Socket h() {
        f fVar = this.f45485k;
        kotlin.jvm.internal.i.b(fVar);
        byte[] bArr = p172nb.b.f45026a;
        ArrayList arrayList = fVar.f45512p;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (kotlin.jvm.internal.i.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i10);
        this.f45485k = null;
        if (arrayList.isEmpty()) {
            fVar.f45513q = System.nanoTime();
            i iVar = this.f45480e;
            iVar.getClass();
            byte[] bArr2 = p172nb.b.f45026a;
            boolean z10 = fVar.j;
            p184ob.c cVar = iVar.f45518b;
            if (z10) {
                fVar.j = true;
                ConcurrentLinkedQueue<f> concurrentLinkedQueue = iVar.f45520d;
                concurrentLinkedQueue.remove(fVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    cVar.a();
                }
                Socket socket = fVar.f45501d;
                kotlin.jvm.internal.i.b(socket);
                return socket;
            }
            cVar.c(iVar.f45519c, 0L);
        }
        return null;
    }

    @Override // okhttp3.InterfaceC2754e
    public final boolean isCanceled() {
        return this.f45491q;
    }

    @Override // okhttp3.InterfaceC2754e
    public final z k() {
        if (!this.f45483h.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f45482g.i();
        p244tb.h hVar = p244tb.h.f47384a;
        this.f45484i = p244tb.h.f47384a.g();
        this.f45481f.getClass();
        try {
            k kVar = this.f45477b.f45611b;
            synchronized (kVar) {
                kVar.f45551f.add(this);
            }
            z zVarE = e();
            k kVar2 = this.f45477b.f45611b;
            kVar2.getClass();
            kVar2.b(kVar2.f45551f, this);
            return zVarE;
        } catch (Throwable th) {
            k kVar3 = this.f45477b.f45611b;
            kVar3.getClass();
            kVar3.b(kVar3.f45551f, this);
            throw th;
        }
    }

    @Override // okhttp3.InterfaceC2754e
    public final u request() {
        return this.f45478c;
    }

    @Override // okhttp3.InterfaceC2754e
    public final c timeout() {
        return this.f45482g;
    }
}
