package io.grpc.internal;

import io.grpc.Status;
import java.util.Map;

/* JADX INFO: renamed from: io.grpc.internal.u0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PickFirstLoadBalancerProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2248u0 extends io.grpc.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f37699b = !Cb.a.m(System.getenv("GRPC_EXPERIMENTAL_PICKFIRST_LB_CONFIG"));

    @Override // io.grpc.i.b
    public final io.grpc.i a(io.grpc.i.c cVar) {
        return new C2244s0(cVar);
    }

    @Override // io.grpc.j
    public String b() {
        return "pick_first";
    }

    @Override // io.grpc.j
    public int c() {
        return 5;
    }

    @Override // io.grpc.j
    public boolean d() {
        return true;
    }

    @Override // io.grpc.j
    public io.grpc.n.b e(Map<String, ?> map) {
        if (!f37699b) {
            return new io.grpc.n.b("no service config");
        }
        try {
            return new io.grpc.n.b(new C2244s0.b(C2217e0.b("shuffleAddressList", map)));
        } catch (RuntimeException e10) {
            return new io.grpc.n.b(Status.f36905l.g(e10).h("Failed parsing configuration for " + b()));
        }
    }
}
