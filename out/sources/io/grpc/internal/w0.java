package io.grpc.internal;

import io.grpc.HttpConnectProxiedSocketAddress;
import io.grpc.ProxiedSocketAddress;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: ProxyDetectorImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f37733d = Logger.getLogger(w0.class.getName());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f37734e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f37735f = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f37736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f37737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f37738c;

    /* JADX INFO: compiled from: ProxyDetectorImpl.java */
    public class a {
    }

    /* JADX INFO: compiled from: ProxyDetectorImpl.java */
    public class b implements com.google.common.base.j<ProxySelector> {
        @Override // com.google.common.base.j
        public final ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    public w0() {
        String str = System.getenv("GRPC_PROXY_EXP");
        b bVar = f37735f;
        bVar.getClass();
        this.f37736a = bVar;
        a aVar = f37734e;
        aVar.getClass();
        this.f37737b = aVar;
        if (str == null) {
            this.f37738c = null;
            return;
        }
        String[] strArrSplit = str.split(":", 2);
        int i10 = strArrSplit.length > 1 ? Integer.parseInt(strArrSplit[1]) : 80;
        f37733d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        this.f37738c = new InetSocketAddress(strArrSplit[0], i10);
    }

    public final ProxiedSocketAddress a(InetSocketAddress inetSocketAddress) throws IOException {
        URL url;
        HttpConnectProxiedSocketAddress httpConnectProxiedSocketAddress;
        Logger logger = f37733d;
        if (inetSocketAddress == null) {
            return null;
        }
        InetSocketAddress inetSocketAddress2 = this.f37738c;
        if (inetSocketAddress2 != null) {
            int i10 = HttpConnectProxiedSocketAddress.f36873b;
            A8.p.j(inetSocketAddress, "targetAddress");
            return new HttpConnectProxiedSocketAddress(inetSocketAddress2, inetSocketAddress, null, null);
        }
        try {
            try {
                URI uri = new URI("https", null, GrpcUtil.d(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                this.f37736a.getClass();
                ProxySelector proxySelector = ProxySelector.getDefault();
                if (proxySelector == null) {
                    logger.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> listSelect = proxySelector.select(uri);
                if (listSelect.size() > 1) {
                    logger.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = listSelect.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress3 = (InetSocketAddress) proxy.address();
                String strD = GrpcUtil.d(inetSocketAddress3);
                InetAddress address = inetSocketAddress3.getAddress();
                int port = inetSocketAddress3.getPort();
                this.f37737b.getClass();
                try {
                    url = new URL("https", strD, port, "");
                } catch (MalformedURLException unused) {
                    logger.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{"https", strD});
                    url = null;
                }
                PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strD, address, port, "https", "", null, url, Authenticator.RequestorType.PROXY);
                if (inetSocketAddress3.isUnresolved()) {
                    inetSocketAddress3 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress3.getHostName()), inetSocketAddress3.getPort());
                }
                int i11 = HttpConnectProxiedSocketAddress.f36873b;
                if (passwordAuthenticationRequestPasswordAuthentication == null) {
                    httpConnectProxiedSocketAddress = new HttpConnectProxiedSocketAddress(inetSocketAddress3, inetSocketAddress, null, null);
                } else {
                    httpConnectProxiedSocketAddress = new HttpConnectProxiedSocketAddress(inetSocketAddress3, inetSocketAddress, passwordAuthenticationRequestPasswordAuthentication.getUserName(), passwordAuthenticationRequestPasswordAuthentication.getPassword() != null ? new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()) : null);
                }
                return httpConnectProxiedSocketAddress;
            } catch (URISyntaxException e10) {
                logger.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e10);
                return null;
            }
        } catch (Throwable th) {
            logger.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }
}
