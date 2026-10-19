package io.grpc.internal;

import androidx.compose.ui.platform.RunnableC1240q;
import io.grpc.Status;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: compiled from: RetryingNameResolver.java */
/* JADX INFO: loaded from: classes3.dex */
public final class G0 extends L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final io.grpc.a.b<b> f37192d = new io.grpc.a.b<>("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2222h f37193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D9.w f37194c;

    /* JADX INFO: compiled from: RetryingNameResolver.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            G0.this.b();
        }
    }

    /* JADX INFO: compiled from: RetryingNameResolver.java */
    public class b {
        public b() {
        }
    }

    /* JADX INFO: compiled from: RetryingNameResolver.java */
    public class c extends io.grpc.n.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.grpc.n.d f37197a;

        public c(io.grpc.n.d dVar) {
            this.f37197a = dVar;
        }

        @Override // io.grpc.n.e
        public final void a(Status status) {
            this.f37197a.a(status);
            G0.this.f37194c.execute(new RunnableC1240q(3, this));
        }

        @Override // io.grpc.n.d
        public final void b(io.grpc.n.f fVar) {
            io.grpc.a.b<b> bVar = G0.f37192d;
            io.grpc.a aVar = fVar.f37801b;
            if (aVar.f36933a.get(bVar) != null) {
                throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
            }
            Collections.emptyList();
            io.grpc.a aVar2 = io.grpc.a.f36932b;
            aVar.getClass();
            b bVar2 = G0.this.new b();
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(bVar, bVar2);
            for (Map.Entry<io.grpc.a.b<?>, Object> entry : aVar.f36933a.entrySet()) {
                if (!identityHashMap.containsKey(entry.getKey())) {
                    identityHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            this.f37197a.b(new io.grpc.n.f(fVar.f37800a, new io.grpc.a(identityHashMap), fVar.f37802c));
        }
    }

    public G0(io.grpc.n nVar, C2222h c2222h, D9.w wVar) {
        super(nVar);
        this.f37193b = c2222h;
        this.f37194c = wVar;
    }

    @Override // io.grpc.internal.L, io.grpc.n
    public final void c() {
        super.c();
        C2222h c2222h = this.f37193b;
        D9.w wVar = c2222h.f37549b;
        wVar.d();
        wVar.execute(new N5.d(2, c2222h));
    }

    @Override // io.grpc.internal.L, io.grpc.n
    public final void d(io.grpc.n.d dVar) {
        super.d(new c(dVar));
    }
}
