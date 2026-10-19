package J9;

import io.grpc.Status;

/* JADX INFO: compiled from: ForwardingLoadBalancer.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends io.grpc.i {
    @Override // io.grpc.i
    public final boolean b() {
        e eVar = (e) this;
        io.grpc.i iVar = eVar.f4055h;
        if (iVar == eVar.f4050c) {
            iVar = eVar.f4053f;
        }
        return iVar.b();
    }

    @Override // io.grpc.i
    public final void c(Status status) {
        e eVar = (e) this;
        io.grpc.i iVar = eVar.f4055h;
        if (iVar == eVar.f4050c) {
            iVar = eVar.f4053f;
        }
        iVar.c(status);
    }

    @Override // io.grpc.i
    public final void d(io.grpc.i.f fVar) {
        e eVar = (e) this;
        io.grpc.i iVar = eVar.f4055h;
        if (iVar == eVar.f4050c) {
            iVar = eVar.f4053f;
        }
        iVar.d(fVar);
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        e eVar = (e) this;
        io.grpc.i iVar = eVar.f4055h;
        if (iVar == eVar.f4050c) {
            iVar = eVar.f4053f;
        }
        aVarB.c(iVar, "delegate");
        return aVarB.toString();
    }
}
