package p257ub;

import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* JADX INFO: compiled from: DeferredSocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f47514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f47515b;

    /* JADX INFO: compiled from: DeferredSocketAdapter.kt */
    public interface a {
        boolean b(SSLSocket sSLSocket);

        j c(SSLSocket sSLSocket);
    }

    public i(a aVar) {
        this.f47514a = aVar;
    }

    @Override // p257ub.j
    public final boolean a() {
        return true;
    }

    @Override // p257ub.j
    public final boolean b(SSLSocket sSLSocket) {
        return this.f47514a.b(sSLSocket);
    }

    @Override // p257ub.j
    public final String c(SSLSocket sSLSocket) {
        j jVarE = e(sSLSocket);
        if (jVarE != null) {
            return jVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // p257ub.j
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        j jVarE = e(sSLSocket);
        if (jVarE != null) {
            jVarE.d(sSLSocket, str, protocols);
        }
    }

    public final synchronized j e(SSLSocket sSLSocket) {
        try {
            if (this.f47515b == null && this.f47514a.b(sSLSocket)) {
                this.f47515b = this.f47514a.c(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f47515b;
    }
}
