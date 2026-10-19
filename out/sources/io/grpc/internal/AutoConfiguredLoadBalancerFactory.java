package io.grpc.internal;

import io.grpc.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoConfiguredLoadBalancerFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.grpc.k f36996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36997b;

    public static final class PolicyException extends Exception {
        private static final long serialVersionUID = 1;
    }

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ManagedChannelImpl.j f36998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public io.grpc.i f36999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.grpc.j f37000c;

        public a(ManagedChannelImpl.j jVar) {
            this.f36998a = jVar;
            io.grpc.k kVar = AutoConfiguredLoadBalancerFactory.this.f36996a;
            String str = AutoConfiguredLoadBalancerFactory.this.f36997b;
            io.grpc.j jVarB = kVar.b(str);
            this.f37000c = jVarB;
            if (jVarB == null) {
                throw new IllegalStateException(androidx.compose.foundation.gestures.d.b("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
            }
            this.f36999b = jVarB.a(jVar);
        }
    }

    public static final class b extends io.grpc.i.h {
        @Override // io.grpc.i.h
        public final io.grpc.i.d a(C2250v0 c2250v0) {
            return io.grpc.i.d.f36978e;
        }

        public final String toString() {
            return new com.google.common.base.d.a(b.class.getSimpleName()).toString();
        }
    }

    public static final class c extends io.grpc.i.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Status f37002a;

        public c(Status status) {
            this.f37002a = status;
        }

        @Override // io.grpc.i.h
        public final io.grpc.i.d a(C2250v0 c2250v0) {
            return io.grpc.i.d.a(this.f37002a);
        }
    }

    public AutoConfiguredLoadBalancerFactory(String str) {
        io.grpc.k kVarA = io.grpc.k.a();
        A8.p.j(kVarA, "registry");
        this.f36996a = kVarA;
        A8.p.j(str, "defaultPolicy");
        this.f36997b = str;
    }

    public static final class d extends io.grpc.i {
        @Override // io.grpc.i
        public final boolean a(io.grpc.i.f fVar) {
            return true;
        }

        @Override // io.grpc.i
        public final void e() {
        }

        @Override // io.grpc.i
        public final void c(Status status) {
        }

        @Override // io.grpc.i
        @Deprecated
        public final void d(io.grpc.i.f fVar) {
        }
    }
}
