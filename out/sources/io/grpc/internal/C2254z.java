package io.grpc.internal;

import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.grpc.internal.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: DelayedClientTransport.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2254z implements InterfaceC2239p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f37751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D9.w f37752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f37753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f37754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f37755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ManagedChannelImpl.f f37756h;
    public Status j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public io.grpc.i.h f37758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f37759l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D9.r f37749a = D9.r.a(C2254z.class, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f37750b = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Collection<e> f37757i = new LinkedHashSet();

    /* JADX INFO: renamed from: io.grpc.internal.z$a */
    /* JADX INFO: compiled from: DelayedClientTransport.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ManagedChannelImpl.f f37760b;

        public a(ManagedChannelImpl.f fVar) {
            this.f37760b = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f37760b.a(true);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.z$b */
    /* JADX INFO: compiled from: DelayedClientTransport.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ManagedChannelImpl.f f37761b;

        public b(ManagedChannelImpl.f fVar) {
            this.f37761b = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f37761b.a(false);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.z$c */
    /* JADX INFO: compiled from: DelayedClientTransport.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ManagedChannelImpl.f f37762b;

        public c(ManagedChannelImpl.f fVar) {
            this.f37762b = fVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
            A8.p.p("Channel must have been shut down", managedChannelImpl.f37287F.get());
            managedChannelImpl.f37288G = true;
            managedChannelImpl.k(false);
            ManagedChannelImpl.g(managedChannelImpl);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.z$d */
    /* JADX INFO: compiled from: DelayedClientTransport.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Status f37763b;

        public d(Status status) {
            this.f37763b = status;
        }

        @Override // java.lang.Runnable
        public final void run() {
            A8.p.p("Channel must have been shut down", ManagedChannelImpl.this.f37287F.get());
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.z$e */
    /* JADX INFO: compiled from: DelayedClientTransport.java */
    public class e extends B {
        public final C2250v0 j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final D9.i f37765k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final io.grpc.c[] f37766l;

        public e(C2250v0 c2250v0, io.grpc.c[] cVarArr) {
            this.f37007e = new ArrayList();
            this.f37011i = new ArrayList();
            this.f37765k = D9.i.a();
            this.j = c2250v0;
            this.f37766l = cVarArr;
        }

        @Override // io.grpc.internal.B, io.grpc.internal.InterfaceC2236o
        public final void e(androidx.compose.runtime.snapshots.j jVar) {
            if (Boolean.TRUE.equals(this.j.f37701a.f36942e)) {
                ((ArrayList) jVar.f13215b).add("wait_for_ready");
            }
            super.e(jVar);
        }

        @Override // io.grpc.internal.B, io.grpc.internal.InterfaceC2236o
        public final void f(Status status) {
            super.f(status);
            synchronized (C2254z.this.f37750b) {
                try {
                    C2254z c2254z = C2254z.this;
                    if (c2254z.f37755g != null) {
                        boolean zRemove = c2254z.f37757i.remove(this);
                        if (!C2254z.this.f() && zRemove) {
                            C2254z c2254z2 = C2254z.this;
                            c2254z2.f37752d.b(c2254z2.f37754f);
                            C2254z c2254z3 = C2254z.this;
                            if (c2254z3.j != null) {
                                c2254z3.f37752d.b(c2254z3.f37755g);
                                C2254z.this.f37755g = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            C2254z.this.f37752d.a();
        }

        @Override // io.grpc.internal.B
        public final void p(Status status) {
            for (io.grpc.c cVar : this.f37766l) {
                cVar.g0(status);
            }
        }
    }

    public C2254z(Executor executor, D9.w wVar) {
        this.f37751c = executor;
        this.f37752d = wVar;
    }

    public final e a(C2250v0 c2250v0, io.grpc.c[] cVarArr) {
        int size;
        e eVar = new e(c2250v0, cVarArr);
        this.f37757i.add(eVar);
        synchronized (this.f37750b) {
            size = this.f37757i.size();
        }
        if (size == 1) {
            this.f37752d.b(this.f37753e);
        }
        for (io.grpc.c cVar : cVarArr) {
            cVar.i0();
        }
        return eVar;
    }

    @Override // io.grpc.internal.InterfaceC2238p
    public final InterfaceC2236o b(MethodDescriptor<?, ?> methodDescriptor, io.grpc.m mVar, io.grpc.b bVar, io.grpc.c[] cVarArr) {
        InterfaceC2236o f10;
        try {
            C2250v0 c2250v0 = new C2250v0(methodDescriptor, mVar, bVar);
            io.grpc.i.h hVar = null;
            long j = -1;
            while (true) {
                synchronized (this.f37750b) {
                    Status status = this.j;
                    if (status == null) {
                        io.grpc.i.h hVar2 = this.f37758k;
                        if (hVar2 != null) {
                            if (hVar != null && j == this.f37759l) {
                                f10 = a(c2250v0, cVarArr);
                                break;
                            }
                            j = this.f37759l;
                            InterfaceC2238p interfaceC2238pF = GrpcUtil.f(hVar2.a(c2250v0), Boolean.TRUE.equals(bVar.f36942e));
                            if (interfaceC2238pF != null) {
                                f10 = interfaceC2238pF.b(c2250v0.f37703c, c2250v0.f37702b, c2250v0.f37701a, cVarArr);
                                break;
                            }
                            hVar = hVar2;
                        } else {
                            f10 = a(c2250v0, cVarArr);
                            break;
                        }
                    } else {
                        f10 = new F(status, ClientStreamListener.RpcProgress.f37134b, cVarArr);
                        break;
                    }
                }
            }
            this.f37752d.a();
            return f10;
        } catch (Throwable th) {
            this.f37752d.a();
            throw th;
        }
    }

    @Override // io.grpc.internal.InterfaceC2239p0
    public final void c(Status status) {
        c cVar;
        synchronized (this.f37750b) {
            try {
                if (this.j != null) {
                    return;
                }
                this.j = status;
                this.f37752d.b(new d(status));
                if (!f() && (cVar = this.f37755g) != null) {
                    this.f37752d.b(cVar);
                    this.f37755g = null;
                }
                this.f37752d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC2239p0
    public final Runnable d(InterfaceC2239p0.a aVar) {
        ManagedChannelImpl.f fVar = (ManagedChannelImpl.f) aVar;
        this.f37756h = fVar;
        this.f37753e = new a(fVar);
        this.f37754f = new b(fVar);
        this.f37755g = new c(fVar);
        return null;
    }

    @Override // D9.q
    public final D9.r e() {
        return this.f37749a;
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.f37750b) {
            z10 = !this.f37757i.isEmpty();
        }
        return z10;
    }

    public final void g(io.grpc.i.h hVar) {
        c cVar;
        C c10;
        synchronized (this.f37750b) {
            this.f37758k = hVar;
            this.f37759l++;
            if (hVar != null && f()) {
                ArrayList<e> arrayList = new ArrayList(this.f37757i);
                ArrayList arrayList2 = new ArrayList();
                for (e eVar : arrayList) {
                    io.grpc.i.d dVarA = hVar.a(eVar.j);
                    io.grpc.b bVar = eVar.j.f37701a;
                    InterfaceC2238p interfaceC2238pF = GrpcUtil.f(dVarA, Boolean.TRUE.equals(bVar.f36942e));
                    if (interfaceC2238pF != null) {
                        Executor executor = this.f37751c;
                        Executor executor2 = bVar.f36939b;
                        if (executor2 != null) {
                            executor = executor2;
                        }
                        D9.i iVar = eVar.f37765k;
                        iVar.getClass();
                        D9.i iVarC = D9.i.a.f2886a.c(iVar);
                        if (iVarC == null) {
                            iVarC = D9.i.f2885b;
                        }
                        try {
                            C2250v0 c2250v0 = eVar.j;
                            InterfaceC2236o interfaceC2236oB = interfaceC2238pF.b(c2250v0.f37703c, c2250v0.f37702b, c2250v0.f37701a, eVar.f37766l);
                            iVar.b(iVarC);
                            synchronized (eVar) {
                                try {
                                    c10 = null;
                                    if (eVar.f37005c == null) {
                                        A8.p.j(interfaceC2236oB, "stream");
                                        InterfaceC2236o interfaceC2236o = eVar.f37005c;
                                        A8.p.o(interfaceC2236o, "realStream already set to %s", interfaceC2236o == null);
                                        eVar.f37005c = interfaceC2236oB;
                                        eVar.f37010h = System.nanoTime();
                                        ClientStreamListener clientStreamListener = eVar.f37004b;
                                        if (clientStreamListener == null) {
                                            eVar.f37007e = null;
                                            eVar.f37003a = true;
                                        }
                                        if (clientStreamListener != null) {
                                            eVar.o(clientStreamListener);
                                            c10 = new C(0, eVar);
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (c10 != null) {
                                executor.execute(c10);
                            }
                            arrayList2.add(eVar);
                        } catch (Throwable th2) {
                            iVar.b(iVarC);
                            throw th2;
                        }
                    }
                }
                synchronized (this.f37750b) {
                    try {
                        if (f()) {
                            this.f37757i.removeAll(arrayList2);
                            if (this.f37757i.isEmpty()) {
                                this.f37757i = new LinkedHashSet();
                            }
                            if (!f()) {
                                this.f37752d.b(this.f37754f);
                                if (this.j != null && (cVar = this.f37755g) != null) {
                                    this.f37752d.b(cVar);
                                    this.f37755g = null;
                                }
                            }
                            this.f37752d.a();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }
}
