package p244tb;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.k;
import okhttp3.Protocol;
import p257ub.b;
import p257ub.f;
import p257ub.g;
import p257ub.h;
import p257ub.i;
import p257ub.j;
import p281wb.c;

/* JADX INFO: compiled from: Android10Platform.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f47361d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f47362c;

    static {
        f47361d = h.a.c() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList arrayListO = k.O(new j[]{(!h.a.c() || Build.VERSION.SDK_INT < 29) ? null : new p257ub.a(), new i(f.f47506f), new i(h.f47513a), new i(g.f47512a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListO) {
            if (((j) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f47362c = arrayList;
    }

    @Override // p244tb.h
    public final c b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        b bVar = x509TrustManagerExtensions != null ? new b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new p281wb.a(c(x509TrustManager));
    }

    @Override // p244tb.h
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        Object next;
        kotlin.jvm.internal.i.e(protocols, "protocols");
        Iterator it = this.f47362c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((j) next).b(sSLSocket));
        j jVar = (j) next;
        if (jVar != null) {
            jVar.d(sSLSocket, str, protocols);
        }
    }

    @Override // p244tb.h
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f47362c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((j) next).b(sSLSocket));
        j jVar = (j) next;
        if (jVar != null) {
            return jVar.c(sSLSocket);
        }
        return null;
    }

    @Override // p244tb.h
    public final boolean h(String hostname) {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
