package io.grpc.internal;

import io.grpc.ConnectivityState;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.grpc.internal.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PickFirstLoadBalancer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2244s0 extends io.grpc.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.grpc.i.c f37686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.grpc.i.g f37687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ConnectivityState f37688e = ConnectivityState.f36870e;

    /* JADX INFO: renamed from: io.grpc.internal.s0$a */
    /* JADX INFO: compiled from: PickFirstLoadBalancer.java */
    public class a implements io.grpc.i.InterfaceC0390i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.grpc.i.g f37689a;

        public a(io.grpc.i.g gVar) {
            this.f37689a = gVar;
        }

        @Override // io.grpc.i.InterfaceC0390i
        public final void a(D9.h hVar) {
            io.grpc.i.h cVar;
            C2244s0 c2244s0 = C2244s0.this;
            c2244s0.getClass();
            ConnectivityState connectivityState = hVar.f2882a;
            if (connectivityState == ConnectivityState.f36871f) {
                return;
            }
            ConnectivityState connectivityState2 = ConnectivityState.f36869d;
            ConnectivityState connectivityState3 = ConnectivityState.f36870e;
            io.grpc.i.c cVar2 = c2244s0.f37686c;
            if (connectivityState == connectivityState2 || connectivityState == connectivityState3) {
                cVar2.e();
            }
            if (c2244s0.f37688e == connectivityState2) {
                if (connectivityState == ConnectivityState.f36867b) {
                    return;
                }
                if (connectivityState == connectivityState3) {
                    io.grpc.i.g gVar = c2244s0.f37687d;
                    if (gVar != null) {
                        gVar.f();
                        return;
                    }
                    return;
                }
            }
            int iOrdinal = connectivityState.ordinal();
            if (iOrdinal != 0) {
                io.grpc.i.g gVar2 = this.f37689a;
                if (iOrdinal == 1) {
                    cVar = new c(io.grpc.i.d.b(gVar2, null));
                } else if (iOrdinal == 2) {
                    cVar = new c(io.grpc.i.d.a(hVar.f2883b));
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalArgumentException("Unsupported state:" + connectivityState);
                    }
                    cVar = c2244s0.new d(gVar2);
                }
            } else {
                cVar = new c(io.grpc.i.d.f36978e);
            }
            c2244s0.f37688e = connectivityState;
            cVar2.f(connectivityState, cVar);
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$b */
    /* JADX INFO: compiled from: PickFirstLoadBalancer.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f37691a;

        public b(Boolean bool) {
            this.f37691a = bool;
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$c */
    /* JADX INFO: compiled from: PickFirstLoadBalancer.java */
    public static final class c extends io.grpc.i.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.grpc.i.d f37692a;

        public c(io.grpc.i.d dVar) {
            A8.p.j(dVar, "result");
            this.f37692a = dVar;
        }

        @Override // io.grpc.i.h
        public final io.grpc.i.d a(C2250v0 c2250v0) {
            return this.f37692a;
        }

        public final String toString() {
            com.google.common.base.d.a aVar = new com.google.common.base.d.a(c.class.getSimpleName());
            aVar.c(this.f37692a, "result");
            return aVar.toString();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.s0$d */
    /* JADX INFO: compiled from: PickFirstLoadBalancer.java */
    public final class d extends io.grpc.i.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.grpc.i.g f37693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f37694b = new AtomicBoolean(false);

        public d(io.grpc.i.g gVar) {
            A8.p.j(gVar, "subchannel");
            this.f37693a = gVar;
        }

        @Override // io.grpc.i.h
        public final io.grpc.i.d a(C2250v0 c2250v0) {
            if (this.f37694b.compareAndSet(false, true)) {
                C2244s0.this.f37686c.d().execute(new RunnableC2246t0(this));
            }
            return io.grpc.i.d.f36978e;
        }
    }

    public C2244s0(io.grpc.i.c cVar) {
        this.f37686c = cVar;
    }

    @Override // io.grpc.i
    public final boolean a(io.grpc.i.f fVar) {
        Boolean bool;
        List<io.grpc.d> list = fVar.f36983a;
        if (list.isEmpty()) {
            c(Status.f36905l.h("NameResolver returned no usable address. addrs=" + list + ", attrs=" + fVar.f36984b));
            return false;
        }
        Object obj = fVar.f36985c;
        if ((obj instanceof b) && (bool = ((b) obj).f37691a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        io.grpc.i.g gVar = this.f37687d;
        if (gVar != null) {
            gVar.i(list);
            return true;
        }
        io.grpc.i.a.C0389a c0389aA = io.grpc.i.a.a();
        c0389aA.getClass();
        A8.p.f("addrs is empty", !list.isEmpty());
        c0389aA.f36975a = Collections.unmodifiableList(new ArrayList(list));
        io.grpc.i.a aVar = new io.grpc.i.a(c0389aA.f36975a, c0389aA.f36976b, c0389aA.f36977c);
        io.grpc.i.c cVar = this.f37686c;
        io.grpc.i.g gVarA = cVar.a(aVar);
        gVarA.h(new a(gVarA));
        this.f37687d = gVarA;
        ConnectivityState connectivityState = ConnectivityState.f36867b;
        c cVar2 = new c(io.grpc.i.d.b(gVarA, null));
        this.f37688e = connectivityState;
        cVar.f(connectivityState, cVar2);
        gVarA.f();
        return true;
    }

    @Override // io.grpc.i
    public final void c(Status status) {
        io.grpc.i.g gVar = this.f37687d;
        if (gVar != null) {
            gVar.g();
            this.f37687d = null;
        }
        ConnectivityState connectivityState = ConnectivityState.f36869d;
        c cVar = new c(io.grpc.i.d.a(status));
        this.f37688e = connectivityState;
        this.f37686c.f(connectivityState, cVar);
    }

    @Override // io.grpc.i
    public final void e() {
        io.grpc.i.g gVar = this.f37687d;
        if (gVar != null) {
            gVar.g();
        }
    }
}
