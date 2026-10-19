package E9;

import A8.p;
import io.grpc.okhttp.internal.Protocol;
import io.grpc.okhttp.internal.j;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: OkHttpTlsUpgrader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<Protocol> f3167a = Collections.unmodifiableList(Arrays.asList(Protocol.HTTP_2));

    public static SSLSocket a(SSLSocketFactory sSLSocketFactory, Socket socket, String str, int i10, io.grpc.okhttp.internal.a aVar) throws IOException {
        p.j(sSLSocketFactory, "sslSocketFactory");
        p.j(socket, "socket");
        p.j(aVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i10, true);
        String[] strArr = aVar.f37984b;
        String[] strArr2 = strArr != null ? (String[]) j.a(strArr, sSLSocket.getEnabledCipherSuites()) : null;
        String[] strArr3 = (String[]) j.a(aVar.f37985c, sSLSocket.getEnabledProtocols());
        io.grpc.okhttp.internal.a.C0397a c0397a = new io.grpc.okhttp.internal.a.C0397a(aVar);
        if (!c0397a.f37987a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr2 == null) {
            c0397a.f37988b = null;
        } else {
            c0397a.f37988b = (String[]) strArr2.clone();
        }
        if (!c0397a.f37987a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr3 == null) {
            c0397a.f37989c = null;
        } else {
            c0397a.f37989c = (String[]) strArr3.clone();
        }
        io.grpc.okhttp.internal.a aVar2 = new io.grpc.okhttp.internal.a(c0397a);
        sSLSocket.setEnabledProtocols(aVar2.f37985c);
        String[] strArr4 = aVar2.f37984b;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
        e eVar = e.f3152c;
        boolean z10 = aVar.f37986d;
        List<Protocol> list = f3167a;
        String strD = eVar.d(sSLSocket, str, z10 ? list : null);
        p.o(strD, "Only " + list + " are supported, but negotiated protocol is %s", list.contains(Protocol.a(strD)));
        if (io.grpc.okhttp.internal.d.f38000a.verify((str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str, sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(str));
    }
}
