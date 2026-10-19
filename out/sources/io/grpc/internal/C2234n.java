package io.grpc.internal;

import io.grpc.Status;

/* JADX INFO: renamed from: io.grpc.internal.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ClientCallImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2234n extends T4.B {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Status f37632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.grpc.m f37633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2232m.a f37634f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234n(C2232m.a aVar, Status status, io.grpc.m mVar) {
        super(1, C2232m.this.f37583f);
        this.f37634f = aVar;
        this.f37632d = status;
        this.f37633e = mVar;
    }

    @Override // T4.B
    public final void a() {
        p111ia.b.c();
        try {
            p111ia.c cVar = C2232m.this.f37579b;
            p111ia.b.a();
            p111ia.a aVar = p111ia.b.f36850a;
            aVar.getClass();
            c();
            aVar.getClass();
        } catch (Throwable th) {
            try {
                p111ia.b.f36850a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        Status status = this.f37632d;
        io.grpc.m mVar = this.f37633e;
        Status status2 = this.f37634f.f37595b;
        if (status2 != null) {
            mVar = new io.grpc.m();
            status = status2;
        }
        C2232m.this.f37587k = true;
        try {
            C2232m.a aVar = this.f37634f;
            C2232m c2232m = C2232m.this;
            D9.b.a<RespT> aVar2 = aVar.f37594a;
            c2232m.getClass();
            aVar2.a(status, mVar);
        } finally {
            C2232m.this.g();
            C2226j c2226j = C2232m.this.f37582e;
            if (status.f()) {
                c2226j.f37561c.a();
            } else {
                c2226j.f37562d.a();
            }
        }
    }
}
