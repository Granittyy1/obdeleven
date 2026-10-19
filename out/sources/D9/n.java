package D9;

/* JADX INFO: compiled from: ForwardingClientCall.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n<ReqT, RespT> extends v<ReqT, RespT> {

    /* JADX INFO: compiled from: ForwardingClientCall.java */
    public static abstract class a<ReqT, RespT> extends n<ReqT, RespT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b<ReqT, RespT> f2900a;

        public a(b<ReqT, RespT> bVar) {
            this.f2900a = bVar;
        }

        @Override // D9.v
        public final b<ReqT, RespT> f() {
            return this.f2900a;
        }
    }

    @Override // D9.b
    public final void d(N7.d dVar) {
        f().d(dVar);
    }
}
