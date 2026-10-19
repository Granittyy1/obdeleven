package p058e7;

import D9.a;
import D9.c;
import D9.d;
import N7.f;
import N7.g;
import T6.b;
import io.grpc.m;
import java.util.Arrays;
import java.util.Iterator;
import p046d7.j;

/* JADX INFO: compiled from: GrpcClientModule_ProvidesInAppMessagingSdkServingStubFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements b<g.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f34823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f34824b;

    public w(u uVar, j jVar, v vVar) {
        this.f34823a = jVar;
        this.f34824b = vVar;
    }

    @Override // p268va.a
    public final Object get() {
        a bVar = (a) this.f34823a.get();
        c[] cVarArr = {new I9.b((m) this.f34824b.get())};
        int i10 = d.f2876a;
        Iterator it = Arrays.asList(cVarArr).iterator();
        while (it.hasNext()) {
            bVar = new d.b(bVar, (c) it.next());
        }
        return io.grpc.stub.a.a(new f(), bVar);
    }
}
