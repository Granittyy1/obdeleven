package io.grpc.internal;

import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.grpc.internal.k0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ManagedChannelImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2229k0<ReqT> extends B0<ReqT> {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ MethodDescriptor f37566E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ io.grpc.b f37567F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ D9.i f37568G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ ManagedChannelImpl.d f37569H;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2229k0(ManagedChannelImpl.d dVar, MethodDescriptor methodDescriptor, io.grpc.m mVar, io.grpc.b bVar, F0 f10, O o10, D9.i iVar) {
        this.f37569H = dVar;
        this.f37566E = methodDescriptor;
        this.f37567F = bVar;
        this.f37568G = iVar;
        ManagedChannelImpl managedChannelImpl = ManagedChannelImpl.this;
        B0.o oVar = managedChannelImpl.f37301T;
        long j = managedChannelImpl.f37302U;
        long j10 = managedChannelImpl.f37303V;
        Executor executor = bVar.f36939b;
        super(methodDescriptor, mVar, oVar, j, j10, executor == null ? managedChannelImpl.f37315h : executor, managedChannelImpl.f37313f.f37553b.G0(), f10, o10, dVar.f37338a);
    }

    @Override // io.grpc.internal.B0
    public final InterfaceC2236o t(io.grpc.m mVar, B0.j jVar, int i10, boolean z10) {
        io.grpc.b bVar = this.f37567F;
        bVar.getClass();
        List<io.grpc.c.a> list = bVar.f36941d;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(jVar);
        io.grpc.b.a aVarB = io.grpc.b.b(bVar);
        aVarB.f36948d = Collections.unmodifiableList(arrayList);
        io.grpc.b bVar2 = new io.grpc.b(aVarB);
        io.grpc.c[] cVarArrC = GrpcUtil.c(bVar2, mVar, i10, z10);
        MethodDescriptor<?, ?> methodDescriptor = this.f37566E;
        InterfaceC2238p interfaceC2238pA = this.f37569H.a(new C2250v0(methodDescriptor, mVar, bVar2));
        D9.i iVar = this.f37568G;
        iVar.getClass();
        D9.i iVarC = D9.i.a.f2886a.c(iVar);
        if (iVarC == null) {
            iVarC = D9.i.f2885b;
        }
        try {
            return interfaceC2238pA.b(methodDescriptor, mVar, bVar2, cVarArrC);
        } finally {
            iVar.b(iVarC);
        }
    }

    @Override // io.grpc.internal.B0
    public final void u() {
        Status status;
        ManagedChannelImpl.o oVar = ManagedChannelImpl.this.f37286E;
        synchronized (oVar.f37393a) {
            try {
                oVar.f37394b.remove(this);
                if (oVar.f37394b.isEmpty()) {
                    status = oVar.f37395c;
                    oVar.f37394b = new HashSet();
                } else {
                    status = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (status != null) {
            ManagedChannelImpl.this.f37285D.c(status);
        }
    }

    @Override // io.grpc.internal.B0
    public final Status v() {
        ManagedChannelImpl.o oVar = ManagedChannelImpl.this.f37286E;
        synchronized (oVar.f37393a) {
            try {
                Status status = oVar.f37395c;
                if (status != null) {
                    return status;
                }
                oVar.f37394b.add(this);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
