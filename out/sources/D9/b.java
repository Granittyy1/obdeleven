package D9;

import io.grpc.Status;

/* JADX INFO: compiled from: ClientCall.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b<ReqT, RespT> {
    public abstract void a(String str, Throwable th);

    public abstract void b();

    public abstract void c();

    public abstract void d(N7.d dVar);

    public abstract void e(a<RespT> aVar, io.grpc.m mVar);

    /* JADX INFO: compiled from: ClientCall.java */
    public static abstract class a<T> {
        public abstract void a(Status status, io.grpc.m mVar);

        public abstract void b(io.grpc.m mVar);

        public abstract void c(T t8);

        public void d() {
        }
    }
}
