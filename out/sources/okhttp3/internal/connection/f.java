package okhttp3.internal.connection;

import com.braze.support.BrazeLogger;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.q;
import okhttp3.C;
import okhttp3.C2750a;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.InterfaceC2754e;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.m;
import okhttp3.t;
import okhttp3.u;
import okhttp3.z;
import okio.ByteString;
import p318zb.B;
import p318zb.v;
import rb.n;
import rb.p;

/* JADX INFO: compiled from: RealConnection.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends rb.d.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f45499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Socket f45500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f45501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handshake f45502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Protocol f45503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public rb.d f45504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p318zb.C f45505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public B f45506i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f45508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f45510n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f45511o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f45512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f45513q;

    /* JADX INFO: compiled from: RealConnection.kt */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45514a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f45514a = iArr;
        }
    }

    public f(i connectionPool, C route) {
        kotlin.jvm.internal.i.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.e(route, "route");
        this.f45499b = route;
        this.f45511o = 1;
        this.f45512p = new ArrayList();
        this.f45513q = Long.MAX_VALUE;
    }

    public static void d(t client, C failedRoute, IOException failure) {
        kotlin.jvm.internal.i.e(client, "client");
        kotlin.jvm.internal.i.e(failedRoute, "failedRoute");
        kotlin.jvm.internal.i.e(failure, "failure");
        if (failedRoute.f45279b.type() != Proxy.Type.DIRECT) {
            C2750a c2750a = failedRoute.f45278a;
            c2750a.f45307g.connectFailed(c2750a.f45308h.i(), failedRoute.f45279b.address(), failure);
        }
        F3.e eVar = client.f45610B;
        synchronized (eVar) {
            ((LinkedHashSet) eVar.f3221b).add(failedRoute);
        }
    }

    @Override // rb.d.b
    public final synchronized void a(rb.d connection, rb.t settings) {
        kotlin.jvm.internal.i.e(connection, "connection");
        kotlin.jvm.internal.i.e(settings, "settings");
        this.f45511o = (settings.f46666a & 16) != 0 ? settings.f46667b[4] : BrazeLogger.SUPPRESS;
    }

    @Override // rb.d.b
    public final void b(p pVar) throws IOException {
        pVar.c(ErrorCode.REFUSED_STREAM, null);
    }

    public final void c(int i10, int i11, int i12, boolean z10, InterfaceC2754e call, m eventListener) throws Throwable {
        kotlin.jvm.internal.i.e(call, "call");
        kotlin.jvm.internal.i.e(eventListener, "eventListener");
        if (this.f45503f != null) {
            throw new IllegalStateException("already connected");
        }
        List<okhttp3.h> list = this.f45499b.f45278a.j;
        b bVar = new b(list);
        C2750a c2750a = this.f45499b.f45278a;
        if (c2750a.f45303c == null) {
            if (!list.contains(okhttp3.h.f45373f)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f45499b.f45278a.f45308h.f45574d;
            p244tb.h hVar = p244tb.h.f47384a;
            if (!p244tb.h.f47384a.h(str)) {
                throw new RouteException(new UnknownServiceException(androidx.compose.foundation.gestures.d.b("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c2750a.f45309i.contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        while (true) {
            try {
                C c10 = this.f45499b;
                if (c10.f45278a.f45303c != null && c10.f45279b.type() == Proxy.Type.HTTP) {
                    f(i10, i11, i12, call, eventListener);
                    if (this.f45500c == null) {
                        break;
                    }
                } else {
                    try {
                        e(i10, i11, call, eventListener);
                    } catch (IOException e10) {
                        e = e10;
                        Socket socket = this.f45501d;
                        if (socket != null) {
                            p172nb.b.d(socket);
                        }
                        Socket socket2 = this.f45500c;
                        if (socket2 != null) {
                            p172nb.b.d(socket2);
                        }
                        this.f45501d = null;
                        this.f45500c = null;
                        this.f45505h = null;
                        this.f45506i = null;
                        this.f45502e = null;
                        this.f45503f = null;
                        this.f45504g = null;
                        this.f45511o = 1;
                        InetSocketAddress inetSocketAddress = this.f45499b.f45280c;
                        kotlin.jvm.internal.i.e(inetSocketAddress, "inetSocketAddress");
                        if (routeException == null) {
                            routeException = new RouteException(e);
                        } else {
                            routeException.a(e);
                        }
                        if (!z10) {
                            throw routeException;
                        }
                        bVar.f45449d = true;
                        if (!bVar.f45448c) {
                            throw routeException;
                        }
                        if (e instanceof ProtocolException) {
                            throw routeException;
                        }
                        if (e instanceof InterruptedIOException) {
                            throw routeException;
                        }
                        if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                            throw routeException;
                        }
                        if (e instanceof SSLPeerUnverifiedException) {
                            throw routeException;
                        }
                        if (!(e instanceof SSLException)) {
                            throw routeException;
                        }
                    }
                }
                g(bVar, call, eventListener);
                InetSocketAddress inetSocketAddress2 = this.f45499b.f45280c;
                m.a aVar = m.f45561a;
                kotlin.jvm.internal.i.e(inetSocketAddress2, "inetSocketAddress");
                break;
            } catch (IOException e11) {
                e = e11;
            }
        }
        C c11 = this.f45499b;
        if (c11.f45278a.f45303c != null && c11.f45279b.type() == Proxy.Type.HTTP && this.f45500c == null) {
            throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f45513q = System.nanoTime();
    }

    public final void e(int i10, int i11, InterfaceC2754e call, m mVar) throws IOException {
        Socket socketCreateSocket;
        C c10 = this.f45499b;
        Proxy proxy = c10.f45279b;
        C2750a c2750a = c10.f45278a;
        Proxy.Type type = proxy.type();
        int i12 = type == null ? -1 : a.f45514a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            socketCreateSocket = c2750a.f45302b.createSocket();
            kotlin.jvm.internal.i.b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f45500c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f45499b.f45280c;
        mVar.getClass();
        kotlin.jvm.internal.i.e(call, "call");
        kotlin.jvm.internal.i.e(inetSocketAddress, "inetSocketAddress");
        socketCreateSocket.setSoTimeout(i11);
        try {
            p244tb.h hVar = p244tb.h.f47384a;
            p244tb.h.f47384a.e(socketCreateSocket, this.f45499b.f45280c, i10);
            try {
                this.f45505h = v.b(v.e(socketCreateSocket));
                this.f45506i = v.a(v.d(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (kotlin.jvm.internal.i.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f45499b.f45280c);
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i10, int i11, int i12, InterfaceC2754e interfaceC2754e, m mVar) throws IOException {
        u.a aVar = new u.a();
        C c10 = this.f45499b;
        okhttp3.p url = c10.f45278a.f45308h;
        kotlin.jvm.internal.i.e(url, "url");
        aVar.f45667a = url;
        aVar.e("CONNECT", null);
        C2750a c2750a = c10.f45278a;
        aVar.c("Host", p172nb.b.w(c2750a.f45308h, true));
        aVar.c("Proxy-Connection", "Keep-Alive");
        aVar.c("User-Agent", "okhttp/4.12.0");
        u uVarA = aVar.a();
        z.a aVar2 = new z.a();
        aVar2.f45693a = uVarA;
        aVar2.f45694b = Protocol.HTTP_1_1;
        aVar2.f45695c = 407;
        aVar2.f45696d = "Preemptive Authenticate";
        aVar2.f45699g = p172nb.b.f45028c;
        aVar2.f45702k = -1L;
        aVar2.f45703l = -1L;
        aVar2.f45698f.h("Proxy-Authenticate", "OkHttp-Preemptive");
        aVar2.a();
        c2750a.f45306f.getClass();
        e(i10, i11, interfaceC2754e, mVar);
        String str = "CONNECT " + p172nb.b.w(uVarA.f45661a, true) + " HTTP/1.1";
        p318zb.C c11 = this.f45505h;
        kotlin.jvm.internal.i.b(c11);
        B b10 = this.f45506i;
        kotlin.jvm.internal.i.b(b10);
        p209qb.b bVar = new p209qb.b(null, this, c11, b10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c11.f49037b.timeout().g(i11, timeUnit);
        b10.f49033b.timeout().g(i12, timeUnit);
        bVar.k(uVarA.f45663c, str);
        bVar.a();
        z.a aVarD = bVar.d(false);
        kotlin.jvm.internal.i.b(aVarD);
        aVarD.f45693a = uVarA;
        z zVarA = aVarD.a();
        long jK = p172nb.b.k(zVarA);
        if (jK != -1) {
            qb.b.d dVarJ = bVar.j(jK);
            p172nb.b.u(dVarJ, BrazeLogger.SUPPRESS, timeUnit);
            dVarJ.close();
        }
        int i13 = zVarA.f45683e;
        if (i13 != 200) {
            if (i13 != 407) {
                throw new IOException(J4.i.b(i13, "Unexpected response code for CONNECT: "));
            }
            c2750a.f45306f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!c11.f49038c.j() || !b10.f49034c.j()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(b bVar, InterfaceC2754e call, m mVar) throws Throwable {
        C2750a c2750a = this.f45499b.f45278a;
        SSLSocketFactory sSLSocketFactory = c2750a.f45303c;
        Protocol protocolA = Protocol.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List<Protocol> list = c2750a.f45309i;
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol)) {
                this.f45501d = this.f45500c;
                this.f45503f = protocolA;
                return;
            } else {
                this.f45501d = this.f45500c;
                this.f45503f = protocol;
                l();
                return;
            }
        }
        mVar.getClass();
        kotlin.jvm.internal.i.e(call, "call");
        final C2750a c2750a2 = this.f45499b.f45278a;
        SSLSocketFactory sSLSocketFactory2 = c2750a2.f45303c;
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            kotlin.jvm.internal.i.b(sSLSocketFactory2);
            Socket socket = this.f45500c;
            okhttp3.p pVar = c2750a2.f45308h;
            Socket socketCreateSocket = sSLSocketFactory2.createSocket(socket, pVar.f45574d, pVar.f45575e, true);
            kotlin.jvm.internal.i.c(socketCreateSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                okhttp3.h hVarA = bVar.a(sSLSocket2);
                if (hVarA.f45375b) {
                    p244tb.h hVar = p244tb.h.f47384a;
                    p244tb.h.f47384a.d(sSLSocket2, c2750a2.f45308h.f45574d, c2750a2.f45309i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                kotlin.jvm.internal.i.d(sslSocketSession, "sslSocketSession");
                final Handshake handshakeA = Handshake.Companion.a(sslSocketSession);
                HostnameVerifier hostnameVerifier = c2750a2.f45304d;
                kotlin.jvm.internal.i.b(hostnameVerifier);
                if (hostnameVerifier.verify(c2750a2.f45308h.f45574d, sslSocketSession)) {
                    final CertificatePinner certificatePinner = c2750a2.f45305e;
                    kotlin.jvm.internal.i.b(certificatePinner);
                    this.f45502e = new Handshake(handshakeA.f45284a, handshakeA.f45285b, handshakeA.f45286c, new Ia.a<List<? extends Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final List<? extends Certificate> invoke() {
                            p281wb.c cVar = certificatePinner.f45283b;
                            kotlin.jvm.internal.i.b(cVar);
                            return cVar.a(c2750a2.f45308h.f45574d, handshakeA.a());
                        }
                    });
                    certificatePinner.b(new Ia.a<List<? extends X509Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$2
                        {
                            super(0);
                        }

                        @Override // Ia.a
                        public final List<? extends X509Certificate> invoke() {
                            Handshake handshake = this.this$0.f45502e;
                            kotlin.jvm.internal.i.b(handshake);
                            List<Certificate> listA = handshake.a();
                            ArrayList arrayList = new ArrayList(kotlin.collections.m.y(listA, 10));
                            for (Certificate certificate : listA) {
                                kotlin.jvm.internal.i.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                arrayList.add((X509Certificate) certificate);
                            }
                            return arrayList;
                        }
                    }, c2750a2.f45308h.f45574d);
                    if (hVarA.f45375b) {
                        p244tb.h hVar2 = p244tb.h.f47384a;
                        strF = p244tb.h.f47384a.f(sSLSocket2);
                    }
                    this.f45501d = sSLSocket2;
                    this.f45505h = v.b(v.e(sSLSocket2));
                    this.f45506i = v.a(v.d(sSLSocket2));
                    if (strF != null) {
                        protocolA = Protocol.a.a(strF);
                    }
                    this.f45503f = protocolA;
                    p244tb.h hVar3 = p244tb.h.f47384a;
                    p244tb.h.f47384a.a(sSLSocket2);
                    if (this.f45503f == Protocol.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List<Certificate> listA = handshakeA.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c2750a2.f45308h.f45574d + " not verified (no certificates)");
                }
                Certificate certificate = listA.get(0);
                kotlin.jvm.internal.i.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) certificate;
                StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                sb2.append(c2750a2.f45308h.f45574d);
                sb2.append(" not verified:\n              |    certificate: ");
                CertificatePinner certificatePinner2 = CertificatePinner.f45281c;
                StringBuilder sb3 = new StringBuilder("sha256/");
                ByteString byteString = ByteString.f45705d;
                byte[] encoded = x509Certificate.getPublicKey().getEncoded();
                kotlin.jvm.internal.i.d(encoded, "publicKey.encoded");
                sb3.append(ByteString.a.d(encoded).c("SHA-256").a());
                sb2.append(sb3.toString());
                sb2.append("\n              |    DN: ");
                sb2.append(x509Certificate.getSubjectDN().getName());
                sb2.append("\n              |    subjectAltNames: ");
                sb2.append(q.c0(p281wb.d.a(x509Certificate, 7), p281wb.d.a(x509Certificate, 2)));
                sb2.append("\n              ");
                throw new SSLPeerUnverifiedException(kotlin.text.i.w(sb2.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    p244tb.h hVar4 = p244tb.h.f47384a;
                    p244tb.h.f47384a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    p172nb.b.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean h(C2750a c2750a, ArrayList arrayList) {
        Handshake handshake;
        byte[] bArr = p172nb.b.f45026a;
        if (this.f45512p.size() < this.f45511o && !this.j) {
            C c10 = this.f45499b;
            if (!c10.f45278a.a(c2750a)) {
                return false;
            }
            okhttp3.p pVar = c2750a.f45308h;
            String str = pVar.f45574d;
            C2750a c2750a2 = c10.f45278a;
            if (kotlin.jvm.internal.i.a(str, c2750a2.f45308h.f45574d)) {
                return true;
            }
            if (this.f45504g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C c11 = (C) it.next();
                    Proxy.Type type = c11.f45279b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && c10.f45279b.type() == type2) {
                        if (kotlin.jvm.internal.i.a(c10.f45280c, c11.f45280c)) {
                            if (c2750a.f45304d == p281wb.d.f47837a) {
                                byte[] bArr2 = p172nb.b.f45026a;
                                okhttp3.p pVar2 = c2750a2.f45308h;
                                if (pVar.f45575e != pVar2.f45575e) {
                                    break;
                                }
                                String str2 = pVar2.f45574d;
                                String str3 = pVar.f45574d;
                                if (!kotlin.jvm.internal.i.a(str3, str2)) {
                                    if (!this.f45507k && (handshake = this.f45502e) != null) {
                                        List<Certificate> listA = handshake.a();
                                        if (!listA.isEmpty()) {
                                            Certificate certificate = listA.get(0);
                                            kotlin.jvm.internal.i.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            if (!p281wb.d.c(str3, (X509Certificate) certificate)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    CertificatePinner certificatePinner = c2750a.f45305e;
                                    kotlin.jvm.internal.i.b(certificatePinner);
                                    Handshake handshake2 = this.f45502e;
                                    kotlin.jvm.internal.i.b(handshake2);
                                    certificatePinner.a(str3, handshake2.a());
                                    return true;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z10) {
        long j;
        byte[] bArr = p172nb.b.f45026a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f45500c;
        kotlin.jvm.internal.i.b(socket);
        Socket socket2 = this.f45501d;
        kotlin.jvm.internal.i.b(socket2);
        p318zb.C c10 = this.f45505h;
        kotlin.jvm.internal.i.b(c10);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        rb.d dVar = this.f45504g;
        if (dVar != null) {
            synchronized (dVar) {
                if (dVar.f46554g) {
                    return false;
                }
                return dVar.f46561o >= dVar.f46560n || jNanoTime < dVar.f46562p;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f45513q;
        }
        if (j < 10000000000L || !z10) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !c10.b();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final p197pb.d j(t client, p197pb.f fVar) throws SocketException {
        kotlin.jvm.internal.i.e(client, "client");
        Socket socket = this.f45501d;
        kotlin.jvm.internal.i.b(socket);
        p318zb.C c10 = this.f45505h;
        kotlin.jvm.internal.i.b(c10);
        B b10 = this.f45506i;
        kotlin.jvm.internal.i.b(b10);
        rb.d dVar = this.f45504g;
        if (dVar != null) {
            return new n(client, this, fVar, dVar);
        }
        int i10 = fVar.f45949g;
        socket.setSoTimeout(i10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c10.f49037b.timeout().g(i10, timeUnit);
        b10.f49033b.timeout().g(fVar.f45950h, timeUnit);
        return new p209qb.b(client, this, c10, b10);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() throws IOException {
        int i10;
        Socket socket = this.f45501d;
        kotlin.jvm.internal.i.b(socket);
        p318zb.C c10 = this.f45505h;
        kotlin.jvm.internal.i.b(c10);
        B b10 = this.f45506i;
        kotlin.jvm.internal.i.b(b10);
        socket.setSoTimeout(0);
        p184ob.d dVar = p184ob.d.f45260h;
        rb.d.a aVar = new rb.d.a(dVar);
        String peerName = this.f45499b.f45278a.f45308h.f45574d;
        kotlin.jvm.internal.i.e(peerName, "peerName");
        aVar.f46574b = socket;
        String str = p172nb.b.f45032g + ' ' + peerName;
        kotlin.jvm.internal.i.e(str, "<set-?>");
        aVar.f46575c = str;
        aVar.f46576d = c10;
        aVar.f46577e = b10;
        aVar.f46578f = this;
        rb.d dVar2 = new rb.d(aVar);
        this.f45504g = dVar2;
        rb.t tVar = rb.d.f46548A;
        this.f45511o = (tVar.f46666a & 16) != 0 ? tVar.f46667b[4] : BrazeLogger.SUPPRESS;
        rb.q qVar = dVar2.f46570x;
        synchronized (qVar) {
            try {
                if (qVar.f46657e) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                Logger logger = rb.q.f46653g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(p172nb.b.i(">> CONNECTION " + rb.c.f46544b.f(), new Object[0]));
                }
                qVar.f46654b.z0(rb.c.f46544b);
                qVar.f46654b.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        rb.q qVar2 = dVar2.f46570x;
        rb.t settings = dVar2.f46563q;
        synchronized (qVar2) {
            try {
                kotlin.jvm.internal.i.e(settings, "settings");
                if (qVar2.f46657e) {
                    throw new IOException(MetricTracker.Action.CLOSED);
                }
                qVar2.c(0, Integer.bitCount(settings.f46666a) * 6, 4, 0);
                int i11 = 0;
                while (i11 < 10) {
                    boolean z10 = true;
                    if (((1 << i11) & settings.f46666a) == 0) {
                        z10 = false;
                    }
                    if (z10) {
                        if (i11 != 4) {
                            i10 = i11 != 7 ? i11 : 4;
                        } else {
                            i10 = 3;
                        }
                        qVar2.f46654b.h(i10);
                        qVar2.f46654b.c(settings.f46667b[i11]);
                    }
                    i11++;
                }
                qVar2.f46654b.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iA = dVar2.f46563q.a();
        if (iA != 65535) {
            dVar2.f46570x.Q(0, iA - 65535);
        }
        dVar.e().c(new p184ob.b(dVar2.f46551d, dVar2.f46571y), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connection{");
        C c10 = this.f45499b;
        sb2.append(c10.f45278a.f45308h.f45574d);
        sb2.append(':');
        sb2.append(c10.f45278a.f45308h.f45575e);
        sb2.append(", proxy=");
        sb2.append(c10.f45279b);
        sb2.append(" hostAddress=");
        sb2.append(c10.f45280c);
        sb2.append(" cipherSuite=");
        Handshake handshake = this.f45502e;
        if (handshake == null || (obj = handshake.f45285b) == null) {
            obj = "none";
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f45503f);
        sb2.append('}');
        return sb2.toString();
    }
}
