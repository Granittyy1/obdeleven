package rb;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.u;
import okhttp3.z;
import okio.ByteString;
import p318zb.F;
import p318zb.H;

/* JADX INFO: compiled from: Http2ExchangeCodec.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements p197pb.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List<String> f46611g = p172nb.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List<String> f46612h = p172nb.b.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okhttp3.internal.connection.f f46613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p197pb.f f46614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f46615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile p f46616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Protocol f46617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f46618f;

    public n(okhttp3.t client, okhttp3.internal.connection.f connection, p197pb.f fVar, d http2Connection) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(connection, "connection");
        kotlin.jvm.internal.i.e(http2Connection, "http2Connection");
        this.f46613a = connection;
        this.f46614b = fVar;
        this.f46615c = http2Connection;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f46617e = client.f45628t.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // p197pb.d
    public final void a() throws IOException {
        p pVar = this.f46616d;
        kotlin.jvm.internal.i.b(pVar);
        pVar.f().close();
    }

    @Override // p197pb.d
    public final void b(u request) throws IOException {
        int i10;
        p pVar;
        boolean z10 = true;
        kotlin.jvm.internal.i.e(request, "request");
        if (this.f46616d != null) {
            return;
        }
        boolean z11 = request.f45664d != null;
        okhttp3.o oVar = request.f45663c;
        ArrayList arrayList = new ArrayList(oVar.size() + 4);
        arrayList.add(new a(a.f46518f, request.f45662b));
        ByteString byteString = a.f46519g;
        okhttp3.p url = request.f45661a;
        kotlin.jvm.internal.i.e(url, "url");
        String strB = url.b();
        String strD = url.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new a(byteString, strB));
        String strE = request.f45663c.e("Host");
        if (strE != null) {
            arrayList.add(new a(a.f46521i, strE));
        }
        arrayList.add(new a(a.f46520h, url.f45571a));
        int size = oVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strK = oVar.k(i11);
            Locale locale = Locale.US;
            String strD2 = J4.n.d(locale, "US", strK, locale, "this as java.lang.String).toLowerCase(locale)");
            if (!f46611g.contains(strD2) || (strD2.equals("te") && kotlin.jvm.internal.i.a(oVar.v(i11), "trailers"))) {
                arrayList.add(new a(strD2, oVar.v(i11)));
            }
        }
        d dVar = this.f46615c;
        dVar.getClass();
        boolean z12 = !z11;
        synchronized (dVar.f46570x) {
            synchronized (dVar) {
                try {
                    if (dVar.f46553f > 1073741823) {
                        dVar.j(ErrorCode.REFUSED_STREAM);
                    }
                    if (dVar.f46554g) {
                        throw new ConnectionShutdownException();
                    }
                    i10 = dVar.f46553f;
                    dVar.f46553f = i10 + 2;
                    pVar = new p(i10, dVar, z12, false, null);
                    if (z11 && dVar.f46567u < dVar.f46568v && pVar.f46633e < pVar.f46634f) {
                        z10 = false;
                    }
                    if (pVar.h()) {
                        dVar.f46550c.put(Integer.valueOf(i10), pVar);
                    }
                    p293xa.r rVar = p293xa.r.f47939a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            dVar.f46570x.i(z12, i10, arrayList);
        }
        if (z10) {
            dVar.f46570x.flush();
        }
        this.f46616d = pVar;
        if (this.f46618f) {
            p pVar2 = this.f46616d;
            kotlin.jvm.internal.i.b(pVar2);
            pVar2.e(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        p pVar3 = this.f46616d;
        kotlin.jvm.internal.i.b(pVar3);
        p.c cVar = pVar3.f46638k;
        long j = this.f46614b.f45949g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar.g(j, timeUnit);
        p pVar4 = this.f46616d;
        kotlin.jvm.internal.i.b(pVar4);
        pVar4.f46639l.g(this.f46614b.f45950h, timeUnit);
    }

    @Override // p197pb.d
    public final H c(z zVar) {
        p pVar = this.f46616d;
        kotlin.jvm.internal.i.b(pVar);
        return pVar.f46637i;
    }

    @Override // p197pb.d
    public final void cancel() {
        this.f46618f = true;
        p pVar = this.f46616d;
        if (pVar != null) {
            pVar.e(ErrorCode.CANCEL);
        }
    }

    @Override // p197pb.d
    public final z.a d(boolean z10) throws IOException {
        okhttp3.o oVar;
        p pVar = this.f46616d;
        if (pVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (pVar) {
            pVar.f46638k.i();
            while (pVar.f46635g.isEmpty() && pVar.f46640m == null) {
                try {
                    pVar.k();
                } catch (Throwable th) {
                    pVar.f46638k.l();
                    throw th;
                }
            }
            pVar.f46638k.l();
            if (pVar.f46635g.isEmpty()) {
                IOException iOException = pVar.f46641n;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCode = pVar.f46640m;
                kotlin.jvm.internal.i.b(errorCode);
                throw new StreamResetException(errorCode);
            }
            okhttp3.o oVarRemoveFirst = pVar.f46635g.removeFirst();
            kotlin.jvm.internal.i.d(oVarRemoveFirst, "headersQueue.removeFirst()");
            oVar = oVarRemoveFirst;
        }
        Protocol protocol = this.f46617e;
        kotlin.jvm.internal.i.e(protocol, "protocol");
        okhttp3.o.a aVar = new okhttp3.o.a();
        int size = oVar.size();
        p197pb.i iVarA = null;
        for (int i10 = 0; i10 < size; i10++) {
            String strK = oVar.k(i10);
            String strV = oVar.v(i10);
            if (kotlin.jvm.internal.i.a(strK, ":status")) {
                iVarA = pb.i.a.a("HTTP/1.1 " + strV);
            } else if (!f46612h.contains(strK)) {
                aVar.c(strK, strV);
            }
        }
        if (iVarA == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        z.a aVar2 = new z.a();
        aVar2.f45694b = protocol;
        aVar2.f45695c = iVarA.f45957b;
        aVar2.f45696d = iVarA.f45958c;
        aVar2.c(aVar.e());
        if (z10 && aVar2.f45695c == 100) {
            return null;
        }
        return aVar2;
    }

    @Override // p197pb.d
    public final okhttp3.internal.connection.f e() {
        return this.f46613a;
    }

    @Override // p197pb.d
    public final void f() throws IOException {
        this.f46615c.f46570x.flush();
    }

    @Override // p197pb.d
    public final long g(z zVar) {
        if (p197pb.e.a(zVar)) {
            return p172nb.b.k(zVar);
        }
        return 0L;
    }

    @Override // p197pb.d
    public final F h(u request, long j) {
        kotlin.jvm.internal.i.e(request, "request");
        p pVar = this.f46616d;
        kotlin.jvm.internal.i.b(pVar);
        return pVar.f();
    }
}
