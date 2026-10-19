package p197pb;

import java.io.IOException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.i;
import okhttp3.A;
import okhttp3.j;
import okhttp3.o;
import okhttp3.p;
import okhttp3.q;
import okhttp3.r;
import okhttp3.u;
import okhttp3.y;
import okhttp3.z;
import p172nb.b;
import p318zb.v;

/* JADX INFO: compiled from: BridgeInterceptor.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f45938a;

    public a(j cookieJar) {
        i.e(cookieJar, "cookieJar");
        this.f45938a = cookieJar;
    }

    @Override // okhttp3.q
    public final z intercept(q.a aVar) throws IOException {
        A a10;
        f fVar = (f) aVar;
        u uVar = fVar.f45947e;
        u.a aVarB = uVar.b();
        y yVar = uVar.f45664d;
        if (yVar != null) {
            r rVarContentType = yVar.contentType();
            if (rVarContentType != null) {
                aVarB.c("Content-Type", rVarContentType.f45590a);
            }
            long jContentLength = yVar.contentLength();
            if (jContentLength != -1) {
                aVarB.c("Content-Length", String.valueOf(jContentLength));
                aVarB.f45669c.g("Transfer-Encoding");
            } else {
                aVarB.c("Transfer-Encoding", "chunked");
                aVarB.f45669c.g("Content-Length");
            }
        }
        o oVar = uVar.f45663c;
        String strE = oVar.e("Host");
        boolean z10 = false;
        p url = uVar.f45661a;
        if (strE == null) {
            aVarB.c("Host", b.w(url, false));
        }
        if (oVar.e("Connection") == null) {
            aVarB.c("Connection", "Keep-Alive");
        }
        if (oVar.e("Accept-Encoding") == null && oVar.e("Range") == null) {
            aVarB.c("Accept-Encoding", "gzip");
            z10 = true;
        }
        j jVar = this.f45938a;
        jVar.getClass();
        i.e(url, "url");
        EmptyList.f42983b.isEmpty();
        if (oVar.e("User-Agent") == null) {
            aVarB.c("User-Agent", "okhttp/4.12.0");
        }
        z zVarA = fVar.a(aVarB.a());
        o oVar2 = zVarA.f45685g;
        e.b(jVar, url, oVar2);
        z.a aVarI = zVarA.i();
        aVarI.f45693a = uVar;
        if (z10 && "gzip".equalsIgnoreCase(z.c("Content-Encoding", zVarA)) && e.a(zVarA) && (a10 = zVarA.f45686h) != null) {
            p318zb.p pVar = new p318zb.p(a10.h());
            o.a aVarQ = oVar2.q();
            aVarQ.g("Content-Encoding");
            aVarQ.g("Content-Length");
            aVarI.c(aVarQ.e());
            aVarI.f45699g = new g(z.c("Content-Type", zVarA), -1L, v.b(pVar));
        }
        return aVarI.a();
    }
}
