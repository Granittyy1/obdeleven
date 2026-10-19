package p257ub;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.i;
import okhttp3.Protocol;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p244tb.c;
import p244tb.h;

/* JADX INFO: compiled from: BouncyCastleSocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47512a = new a();

    /* JADX INFO: compiled from: BouncyCastleSocketAdapter.kt */
    public static final class a implements i.a {
        @Override // ub.i.a
        public final boolean b(SSLSocket sSLSocket) {
            boolean z10 = c.f47368d;
            c.a.a();
            return false;
        }

        @Override // ub.i.a
        public final j c(SSLSocket sSLSocket) {
            return new g();
        }
    }

    @Override // p257ub.j
    public final boolean a() {
        boolean z10 = c.f47368d;
        return c.f47368d;
    }

    @Override // p257ub.j
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p257ub.j
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : i.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p257ub.j
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        i.e(protocols, "protocols");
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            h hVar = h.f47384a;
            parameters.setApplicationProtocols((String[]) h.a.a(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
