package okhttp3;

import java.io.Closeable;

/* JADX INFO: compiled from: Response.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f45680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Protocol f45681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handshake f45684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f45685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A f45686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z f45687i;
    public final z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z f45688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f45689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f45690m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final okhttp3.internal.connection.c f45691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C2753d f45692o;

    /* JADX INFO: compiled from: Response.kt */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u f45693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Protocol f45694b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f45696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Handshake f45697e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public A f45699g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public z f45700h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public z f45701i;
        public z j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f45702k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f45703l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public okhttp3.internal.connection.c f45704m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45695c = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public o.a f45698f = new o.a();

        public static void b(String str, z zVar) {
            if (zVar != null) {
                if (zVar.f45686h != null) {
                    throw new IllegalArgumentException(str.concat(".body != null").toString());
                }
                if (zVar.f45687i != null) {
                    throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
                }
                if (zVar.j != null) {
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                if (zVar.f45688k != null) {
                    throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                }
            }
        }

        public final z a() {
            int i10 = this.f45695c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f45695c).toString());
            }
            u uVar = this.f45693a;
            if (uVar == null) {
                throw new IllegalStateException("request == null");
            }
            Protocol protocol = this.f45694b;
            if (protocol == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f45696d;
            if (str != null) {
                return new z(uVar, protocol, str, i10, this.f45697e, this.f45698f.e(), this.f45699g, this.f45700h, this.f45701i, this.j, this.f45702k, this.f45703l, this.f45704m);
            }
            throw new IllegalStateException("message == null");
        }

        public final void c(o headers) {
            kotlin.jvm.internal.i.e(headers, "headers");
            this.f45698f = headers.q();
        }
    }

    public z(u request, Protocol protocol, String message, int i10, Handshake handshake, o oVar, A a10, z zVar, z zVar2, z zVar3, long j, long j10, okhttp3.internal.connection.c cVar) {
        kotlin.jvm.internal.i.e(request, "request");
        kotlin.jvm.internal.i.e(protocol, "protocol");
        kotlin.jvm.internal.i.e(message, "message");
        this.f45680b = request;
        this.f45681c = protocol;
        this.f45682d = message;
        this.f45683e = i10;
        this.f45684f = handshake;
        this.f45685g = oVar;
        this.f45686h = a10;
        this.f45687i = zVar;
        this.j = zVar2;
        this.f45688k = zVar3;
        this.f45689l = j;
        this.f45690m = j10;
        this.f45691n = cVar;
    }

    public static String c(String str, z zVar) {
        zVar.getClass();
        String strE = zVar.f45685g.e(str);
        if (strE == null) {
            return null;
        }
        return strE;
    }

    public final C2753d b() {
        C2753d c2753d = this.f45692o;
        if (c2753d != null) {
            return c2753d;
        }
        C2753d c2753d2 = C2753d.f45335n;
        C2753d c2753dA = C2753d.b.a(this.f45685g);
        this.f45692o = c2753dA;
        return c2753dA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        A a10 = this.f45686h;
        if (a10 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        a10.close();
    }

    public final boolean h() {
        int i10 = this.f45683e;
        return 200 <= i10 && i10 < 300;
    }

    public final a i() {
        a aVar = new a();
        aVar.f45693a = this.f45680b;
        aVar.f45694b = this.f45681c;
        aVar.f45695c = this.f45683e;
        aVar.f45696d = this.f45682d;
        aVar.f45697e = this.f45684f;
        aVar.f45698f = this.f45685g.q();
        aVar.f45699g = this.f45686h;
        aVar.f45700h = this.f45687i;
        aVar.f45701i = this.j;
        aVar.j = this.f45688k;
        aVar.f45702k = this.f45689l;
        aVar.f45703l = this.f45690m;
        aVar.f45704m = this.f45691n;
        return aVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f45681c + ", code=" + this.f45683e + ", message=" + this.f45682d + ", url=" + this.f45680b.f45661a + '}';
    }
}
