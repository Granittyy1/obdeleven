package J9;

import D9.w;
import io.grpc.ChannelLogger;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: ForwardingLoadBalancerHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends io.grpc.i.c {
    @Override // io.grpc.i.c
    public io.grpc.i.g a(io.grpc.i.a aVar) {
        return g().a(aVar);
    }

    @Override // io.grpc.i.c
    public final ChannelLogger b() {
        return g().b();
    }

    @Override // io.grpc.i.c
    public final ScheduledExecutorService c() {
        return g().c();
    }

    @Override // io.grpc.i.c
    public final w d() {
        return g().d();
    }

    @Override // io.grpc.i.c
    public final void e() {
        g().e();
    }

    public abstract io.grpc.i.c g();

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(g(), "delegate");
        return aVarB.toString();
    }
}
