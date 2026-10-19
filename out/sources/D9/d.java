package D9;

import io.grpc.MethodDescriptor;

/* JADX INFO: compiled from: ClientInterceptors.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2876a = 0;

    /* JADX INFO: compiled from: ClientInterceptors.java */
    public static class b extends D9.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final D9.a f2877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f2878b;

        public b(D9.a aVar, c cVar) {
            this.f2877a = aVar;
            A8.p.j(cVar, "interceptor");
            this.f2878b = cVar;
        }

        @Override // D9.a
        public final String a() {
            return this.f2877a.a();
        }

        @Override // D9.a
        public final <ReqT, RespT> D9.b<ReqT, RespT> f(MethodDescriptor<ReqT, RespT> methodDescriptor, io.grpc.b bVar) {
            return this.f2878b.a(methodDescriptor, bVar, this.f2877a);
        }
    }

    static {
        new a();
    }

    /* JADX INFO: compiled from: ClientInterceptors.java */
    public class a extends D9.b<Object, Object> {
        @Override // D9.b
        public final void b() {
        }

        @Override // D9.b
        public final void c() {
        }

        @Override // D9.b
        public final void d(N7.d dVar) {
        }

        @Override // D9.b
        public final void a(String str, Throwable th) {
        }

        @Override // D9.b
        public final void e(D9.b.a<Object> aVar, io.grpc.m mVar) {
        }
    }
}
