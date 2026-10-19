package p257ub;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.i;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import p244tb.d;

/* JADX INFO: compiled from: ConscryptSocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47513a = new a();

    /* JADX INFO: compiled from: ConscryptSocketAdapter.kt */
    public static final class a implements i.a {
        @Override // ub.i.a
        public final boolean b(SSLSocket sSLSocket) {
            boolean z10 = d.f47370d;
            return d.a.b() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // ub.i.a
        public final j c(SSLSocket sSLSocket) {
            return new h();
        }
    }

    @Override // p257ub.j
    public final boolean a() {
        boolean z10 = d.f47370d;
        return d.f47370d;
    }

    @Override // p257ub.j
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p257ub.j
    public final String c(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p257ub.j
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        i.e(protocols, "protocols");
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            p244tb.h hVar = p244tb.h.f47384a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) tb.h.a.a(protocols).toArray(new String[0]));
        }
    }
}
