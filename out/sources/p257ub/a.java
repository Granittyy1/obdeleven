package p257ub;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.i;
import okhttp3.Protocol;
import p244tb.h;

/* JADX INFO: compiled from: Android10SocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements j {
    @Override // p257ub.j
    public final boolean a() {
        h hVar = h.f47384a;
        return h.a.c() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // p257ub.j
    public final boolean b(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // p257ub.j
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p257ub.j
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) throws IOException {
        i.e(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            h hVar = h.f47384a;
            sSLParameters.setApplicationProtocols((String[]) h.a.a(protocols).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }
}
