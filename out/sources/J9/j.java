package J9;

import io.grpc.n;
import java.util.Map;

/* JADX INFO: compiled from: SecretRoundRobinLoadBalancerProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends io.grpc.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4132b = 0;

    @Override // io.grpc.i.b
    public final io.grpc.i a(io.grpc.i.c cVar) {
        return new i(cVar);
    }

    @Override // io.grpc.j
    public String b() {
        return "round_robin";
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
    public n.b e(Map<String, ?> map) {
        return new n.b("no service config");
    }
}
