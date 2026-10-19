package io.grpc;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
import kotlinx.coroutines.C;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpConnectProxiedSocketAddress extends ProxiedSocketAddress {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f36873b = 0;
    private static final long serialVersionUID = 0;
    private final String password;
    private final SocketAddress proxyAddress;
    private final InetSocketAddress targetAddress;
    private final String username;

    public HttpConnectProxiedSocketAddress(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        A8.p.j(inetSocketAddress, "proxyAddress");
        A8.p.j(inetSocketAddress2, "targetAddress");
        A8.p.o(inetSocketAddress, "The proxy address %s is not resolved", !inetSocketAddress.isUnresolved());
        this.proxyAddress = inetSocketAddress;
        this.targetAddress = inetSocketAddress2;
        this.username = str;
        this.password = str2;
    }

    public final String a() {
        return this.password;
    }

    public final SocketAddress b() {
        return this.proxyAddress;
    }

    public final InetSocketAddress c() {
        return this.targetAddress;
    }

    public final String d() {
        return this.username;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HttpConnectProxiedSocketAddress)) {
            return false;
        }
        HttpConnectProxiedSocketAddress httpConnectProxiedSocketAddress = (HttpConnectProxiedSocketAddress) obj;
        return C.j(this.proxyAddress, httpConnectProxiedSocketAddress.proxyAddress) && C.j(this.targetAddress, httpConnectProxiedSocketAddress.targetAddress) && C.j(this.username, httpConnectProxiedSocketAddress.username) && C.j(this.password, httpConnectProxiedSocketAddress.password);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.proxyAddress, this.targetAddress, this.username, this.password});
    }

    public final String toString() {
        com.google.common.base.d.a aVarB = com.google.common.base.d.b(this);
        aVarB.c(this.proxyAddress, "proxyAddr");
        aVarB.c(this.targetAddress, "targetAddr");
        aVarB.c(this.username, "username");
        aVarB.d("hasPassword", this.password != null);
        return aVarB.toString();
    }
}
