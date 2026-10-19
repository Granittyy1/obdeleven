package io.grpc.internal;

import io.grpc.ConnectivityState;
import io.grpc.Status;
import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: InternalSubchannel.java */
/* JADX INFO: loaded from: classes3.dex */
public final class X implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f37492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U f37493c;

    /* JADX INFO: compiled from: InternalSubchannel.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            U u10 = X.this.f37493c;
            InterfaceC2239p0 interfaceC2239p0 = u10.f37463q;
            u10.f37462p = null;
            u10.f37463q = null;
            interfaceC2239p0.c(Status.f36905l.h("InternalSubchannel closed transport due to address change"));
        }
    }

    public X(U u10, List list) {
        this.f37493c = u10;
        this.f37492b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2243s interfaceC2243s;
        U.d dVar = this.f37493c.f37457k;
        SocketAddress socketAddress = dVar.f37477a.get(dVar.f37478b).f36959a.get(dVar.f37479c);
        U.d dVar2 = this.f37493c.f37457k;
        dVar2.f37477a = this.f37492b;
        dVar2.a();
        this.f37493c.f37458l = this.f37492b;
        ConnectivityState connectivityState = this.f37493c.f37468v.f2882a;
        ConnectivityState connectivityState2 = ConnectivityState.f36868c;
        if (connectivityState != connectivityState2 && this.f37493c.f37468v.f2882a != ConnectivityState.f36867b) {
            interfaceC2243s = null;
            break;
        }
        U.d dVar3 = this.f37493c.f37457k;
        int i10 = 0;
        while (true) {
            if (i10 < dVar3.f37477a.size()) {
                int iIndexOf = dVar3.f37477a.get(i10).f36959a.indexOf(socketAddress);
                if (iIndexOf == -1) {
                    i10++;
                } else {
                    dVar3.f37478b = i10;
                    dVar3.f37479c = iIndexOf;
                }
            } else {
                if (this.f37493c.f37468v.f2882a == connectivityState2) {
                    interfaceC2243s = this.f37493c.f37467u;
                    this.f37493c.f37467u = null;
                    this.f37493c.f37457k.a();
                    U.f(this.f37493c, ConnectivityState.f36870e);
                    break;
                }
                this.f37493c.f37466t.c(Status.f36905l.h("InternalSubchannel closed pending transport due to address change"));
                U u10 = this.f37493c;
                u10.f37466t = null;
                u10.f37457k.a();
                U.g(this.f37493c);
            }
            interfaceC2243s = null;
            break;
        }
        if (interfaceC2243s != null) {
            U u11 = this.f37493c;
            if (u11.f37462p != null) {
                u11.f37463q.c(Status.f36905l.h("InternalSubchannel closed transport early due to address change"));
                this.f37493c.f37462p.a();
                U u12 = this.f37493c;
                u12.f37462p = null;
                u12.f37463q = null;
            }
            U u13 = this.f37493c;
            u13.f37463q = interfaceC2243s;
            u13.f37462p = u13.j.c(new a(), 5L, TimeUnit.SECONDS, u13.f37453f);
        }
    }
}
