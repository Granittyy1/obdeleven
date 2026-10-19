package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.q;
import okhttp3.t;
import okhttp3.z;
import p293xa.r;

/* JADX INFO: compiled from: ConnectInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f45445a = new a();

    @Override // okhttp3.q
    public final z intercept(q.a aVar) throws IOException {
        p197pb.f fVar = (p197pb.f) aVar;
        e eVar = fVar.f45943a;
        eVar.getClass();
        synchronized (eVar) {
            if (!eVar.f45490p) {
                throw new IllegalStateException("released");
            }
            if (eVar.f45489o) {
                throw new IllegalStateException("Check failed.");
            }
            if (eVar.f45488n) {
                throw new IllegalStateException("Check failed.");
            }
            r rVar = r.f47939a;
        }
        d dVar = eVar.j;
        kotlin.jvm.internal.i.b(dVar);
        t client = eVar.f45477b;
        kotlin.jvm.internal.i.e(client, "client");
        try {
            c cVar = new c(eVar, eVar.f45481f, dVar, dVar.a(fVar.f45948f, fVar.f45949g, fVar.f45950h, client.f45616g, !kotlin.jvm.internal.i.a(fVar.f45947e.f45662b, "GET")).j(client, fVar));
            eVar.f45487m = cVar;
            eVar.f45492r = cVar;
            synchronized (eVar) {
                eVar.f45488n = true;
                eVar.f45489o = true;
            }
            if (eVar.f45491q) {
                throw new IOException("Canceled");
            }
            return p197pb.f.b(fVar, 0, cVar, null, 61).a(fVar.f45947e);
        } catch (IOException e10) {
            dVar.c(e10);
            throw new RouteException(e10);
        } catch (RouteException e11) {
            dVar.c(e11.c());
            throw e11;
        }
    }
}
