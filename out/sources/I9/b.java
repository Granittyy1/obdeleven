package I9;

import A8.p;
import D9.c;
import D9.n;
import io.grpc.MethodDescriptor;
import io.grpc.m;

/* JADX INFO: compiled from: MetadataUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f3933a;

    /* JADX INFO: compiled from: MetadataUtils.java */
    public final class a<ReqT, RespT> extends n.a<ReqT, RespT> {
        public a(D9.b<ReqT, RespT> bVar) {
            super(bVar);
        }

        @Override // D9.b
        public final void e(D9.b.a<RespT> aVar, m mVar) {
            mVar.d(b.this.f3933a);
            this.f2900a.e(aVar, mVar);
        }
    }

    public b(m mVar) {
        p.j(mVar, "extraHeaders");
        this.f3933a = mVar;
    }

    @Override // D9.c
    public final a a(MethodDescriptor methodDescriptor, io.grpc.b bVar, D9.a aVar) {
        return new a(aVar.f(methodDescriptor, bVar));
    }
}
