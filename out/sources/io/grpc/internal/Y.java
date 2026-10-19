package io.grpc.internal;

import io.grpc.ConnectivityState;
import io.grpc.Status;

/* JADX INFO: compiled from: InternalSubchannel.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Y implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Status f37495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U f37496c;

    public Y(U u10, Status status) {
        this.f37496c = u10;
        this.f37495b = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConnectivityState connectivityState = this.f37496c.f37468v.f2882a;
        ConnectivityState connectivityState2 = ConnectivityState.f36871f;
        if (connectivityState == connectivityState2) {
            return;
        }
        U u10 = this.f37496c;
        u10.f37469w = this.f37495b;
        InterfaceC2243s interfaceC2243s = u10.f37467u;
        U u11 = this.f37496c;
        U.b bVar = u11.f37466t;
        u11.f37467u = null;
        U u12 = this.f37496c;
        u12.f37466t = null;
        U.f(u12, connectivityState2);
        this.f37496c.f37457k.a();
        if (this.f37496c.f37464r.isEmpty()) {
            U u13 = this.f37496c;
            u13.getClass();
            u13.j.execute(new Z(u13));
        }
        U u14 = this.f37496c;
        u14.j.d();
        D9.w.c cVar = u14.f37461o;
        if (cVar != null) {
            cVar.a();
            u14.f37461o = null;
            u14.f37459m = null;
        }
        D9.w.c cVar2 = this.f37496c.f37462p;
        if (cVar2 != null) {
            cVar2.a();
            this.f37496c.f37463q.c(this.f37495b);
            U u15 = this.f37496c;
            u15.f37462p = null;
            u15.f37463q = null;
        }
        if (interfaceC2243s != null) {
            interfaceC2243s.c(this.f37495b);
        }
        if (bVar != null) {
            bVar.c(this.f37495b);
        }
    }
}
