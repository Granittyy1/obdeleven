package J9;

import A8.p;
import io.grpc.ConnectivityState;

/* JADX INFO: compiled from: GracefulSwitchLoadBalancer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public io.grpc.i f4060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4061b;

    public f(e eVar) {
        this.f4061b = eVar;
    }

    @Override // io.grpc.i.c
    public final void f(ConnectivityState connectivityState, io.grpc.i.h hVar) {
        io.grpc.i iVar = this.f4060a;
        e eVar = this.f4061b;
        io.grpc.i iVar2 = eVar.f4055h;
        ConnectivityState connectivityState2 = ConnectivityState.f36868c;
        if (iVar == iVar2) {
            p.p("there's pending lb while current lb has been out of READY", eVar.f4057k);
            eVar.f4056i = connectivityState;
            eVar.j = hVar;
            if (connectivityState == connectivityState2) {
                eVar.f();
                return;
            }
            return;
        }
        if (iVar == eVar.f4053f) {
            boolean z10 = connectivityState == connectivityState2;
            eVar.f4057k = z10;
            if (z10 || iVar2 == eVar.f4050c) {
                eVar.f4051d.f(connectivityState, hVar);
            } else {
                eVar.f();
            }
        }
    }

    @Override // J9.c
    public final io.grpc.i.c g() {
        return this.f4061b.f4051d;
    }
}
