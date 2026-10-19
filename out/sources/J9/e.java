package J9;

import io.grpc.ConnectivityState;
import io.grpc.Status;
import io.grpc.internal.C2250v0;

/* JADX INFO: compiled from: GracefulSwitchLoadBalancer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends J9.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f4049l = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f4050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g.c f4051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public io.grpc.i.b f4052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public io.grpc.i f4053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public io.grpc.i.b f4054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public io.grpc.i f4055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ConnectivityState f4056i;
    public io.grpc.i.h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4057k;

    /* JADX INFO: compiled from: GracefulSwitchLoadBalancer.java */
    public class b extends io.grpc.i.h {
        @Override // io.grpc.i.h
        public final io.grpc.i.d a(C2250v0 c2250v0) {
            return io.grpc.i.d.f36978e;
        }

        public final String toString() {
            return "BUFFER_PICKER";
        }
    }

    public e(g.c cVar) {
        a aVar = new a();
        this.f4050c = aVar;
        this.f4053f = aVar;
        this.f4055h = aVar;
        this.f4051d = cVar;
    }

    @Override // io.grpc.i
    public final void e() {
        this.f4055h.e();
        this.f4053f.e();
    }

    public final void f() {
        this.f4051d.f(this.f4056i, this.j);
        this.f4053f.e();
        this.f4053f = this.f4055h;
        this.f4052e = this.f4054g;
        this.f4055h = this.f4050c;
        this.f4054g = null;
    }

    /* JADX INFO: compiled from: GracefulSwitchLoadBalancer.java */
    public class a extends io.grpc.i {

        /* JADX INFO: renamed from: J9.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: GracefulSwitchLoadBalancer.java */
        public class C0054a extends io.grpc.i.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Status f4059a;

            public C0054a(Status status) {
                this.f4059a = status;
            }

            @Override // io.grpc.i.h
            public final io.grpc.i.d a(C2250v0 c2250v0) {
                return io.grpc.i.d.a(this.f4059a);
            }

            public final String toString() {
                com.google.common.base.d.a aVar = new com.google.common.base.d.a(C0054a.class.getSimpleName());
                aVar.c(this.f4059a, "error");
                return aVar.toString();
            }
        }

        public a() {
        }

        @Override // io.grpc.i
        public final void c(Status status) {
            e.this.f4051d.f(ConnectivityState.f36869d, new C0054a(status));
        }

        @Override // io.grpc.i
        public final void d(io.grpc.i.f fVar) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // io.grpc.i
        public final void e() {
        }
    }
}
