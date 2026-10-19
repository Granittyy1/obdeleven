package bo.app;

import com.braze.support.BrazeLogger;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class f6 extends SSLSocketFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21049b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLSocketFactory f21050a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends Lambda implements Ia.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f21051b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f21051b = list;
        }

        @Override // Ia.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Enabling SSL protocols: " + this.f21051b;
        }
    }

    public f6() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        kotlin.jvm.internal.i.d(socketFactory, "sslContext.socketFactory");
        this.f21050a = socketFactory;
    }

    private final Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ArrayList arrayList = new ArrayList();
            SSLSocket sSLSocket = (SSLSocket) socket;
            String[] supportedProtocols = sSLSocket.getSupportedProtocols();
            kotlin.jvm.internal.i.d(supportedProtocols, "socket.supportedProtocols");
            for (String protocol : supportedProtocols) {
                if (!kotlin.jvm.internal.i.a(protocol, "SSLv3")) {
                    kotlin.jvm.internal.i.d(protocol, "protocol");
                    arrayList.add(protocol);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(arrayList), 2, (Object) null);
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.f21050a.createSocket();
        kotlin.jvm.internal.i.d(socketCreateSocket, "internalSSLSocketFactory.createSocket()");
        return a(socketCreateSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f21050a.getDefaultCipherSuites();
        kotlin.jvm.internal.i.d(defaultCipherSuites, "internalSSLSocketFactory.defaultCipherSuites");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f21050a.getSupportedCipherSuites();
        kotlin.jvm.internal.i.d(supportedCipherSuites, "internalSSLSocketFactory.supportedCipherSuites");
        return supportedCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String host, int i10, boolean z10) throws IOException {
        kotlin.jvm.internal.i.e(socket, "socket");
        kotlin.jvm.internal.i.e(host, "host");
        Socket socketCreateSocket = this.f21050a.createSocket(socket, host, i10, z10);
        kotlin.jvm.internal.i.d(socketCreateSocket, "internalSSLSocketFactory…t, host, port, autoClose)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i10) throws IOException {
        kotlin.jvm.internal.i.e(host, "host");
        Socket socketCreateSocket = this.f21050a.createSocket(host, i10);
        kotlin.jvm.internal.i.d(socketCreateSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String host, int i10, InetAddress localHost, int i11) throws IOException {
        kotlin.jvm.internal.i.e(host, "host");
        kotlin.jvm.internal.i.e(localHost, "localHost");
        Socket socketCreateSocket = this.f21050a.createSocket(host, i10, localHost, i11);
        kotlin.jvm.internal.i.d(socketCreateSocket, "internalSSLSocketFactory…rt, localHost, localPort)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress host, int i10) throws IOException {
        kotlin.jvm.internal.i.e(host, "host");
        Socket socketCreateSocket = this.f21050a.createSocket(host, i10);
        kotlin.jvm.internal.i.d(socketCreateSocket, "internalSSLSocketFactory.createSocket(host, port)");
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress address, int i10, InetAddress localAddress, int i11) throws IOException {
        kotlin.jvm.internal.i.e(address, "address");
        kotlin.jvm.internal.i.e(localAddress, "localAddress");
        Socket socketCreateSocket = this.f21050a.createSocket(address, i10, localAddress, i11);
        kotlin.jvm.internal.i.d(socketCreateSocket, "internalSSLSocketFactory… localAddress, localPort)");
        return a(socketCreateSocket);
    }
}
