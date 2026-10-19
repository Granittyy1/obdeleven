package p244tb;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;
import okhttp3.Protocol;
import p116j3.h;
import p257ub.f;
import p257ub.g;
import p257ub.j;
import p257ub.k;
import p281wb.c;
import p281wb.e;

/* JADX INFO: compiled from: AndroidPlatform.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f47363e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f47364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f47365d;

    /* JADX INFO: compiled from: AndroidPlatform.kt */
    public static final class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X509TrustManager f47366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f47367b;

        public a(X509TrustManager x509TrustManager, Method method) {
            this.f47366a = x509TrustManager;
            this.f47367b = method;
        }

        @Override // p281wb.e
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                Object objInvoke = this.f47367b.invoke(this.f47366a, x509Certificate);
                i.c(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.f47366a, aVar.f47366a) && i.a(this.f47367b, aVar.f47367b);
        }

        public final int hashCode() {
            return this.f47367b.hashCode() + (this.f47366a.hashCode() * 31);
        }

        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f47366a + ", findByIssuerAndSignatureMethod=" + this.f47367b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (h.a.c() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f47363e = z10;
    }

    public b() throws NoSuchMethodException {
        k kVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            kVar = new k(cls);
        } catch (Exception e10) {
            h.f47384a.getClass();
            h.i(5, "unable to load android socket classes", e10);
            kVar = null;
        }
        ArrayList arrayListO = kotlin.collections.k.O(new j[]{kVar, new p257ub.i(f.f47506f), new p257ub.i(p257ub.h.f47513a), new p257ub.i(g.f47512a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListO) {
            if (((j) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f47364c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f47365d = new h(method3, method2, method);
    }

    @Override // p244tb.h
    public final c b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        p257ub.b bVar = x509TrustManagerExtensions != null ? new p257ub.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : new p281wb.a(c(x509TrustManager));
    }

    @Override // p244tb.h
    public final e c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new a(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // p244tb.h
    public final void d(SSLSocket sSLSocket, String str, List<Protocol> protocols) {
        Object next;
        i.e(protocols, "protocols");
        Iterator it = this.f47364c.iterator();
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
    public final void e(Socket socket, InetSocketAddress address, int i10) throws IOException {
        i.e(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // p244tb.h
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f47364c.iterator();
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
    public final Object g() {
        h hVar = this.f47365d;
        hVar.getClass();
        Method method = (Method) hVar.f41103a;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, null);
            Method method2 = (Method) hVar.f41104b;
            i.b(method2);
            method2.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p244tb.h
    public final boolean h(String hostname) {
        i.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // p244tb.h
    public final void k(Object obj, String message) {
        i.e(message, "message");
        h hVar = this.f47365d;
        hVar.getClass();
        if (obj != null) {
            try {
                Method method = (Method) hVar.f41105c;
                i.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        h.j(this, message, 5, 4);
    }
}
