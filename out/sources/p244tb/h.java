package p244tb;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.m;
import kotlin.jvm.internal.i;
import okhttp3.Protocol;
import okhttp3.t;
import p257ub.c;
import p257ub.d;
import p281wb.b;
import p281wb.e;
import p318zb.C2839f;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile h f47384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f47385b;

    /* JADX INFO: compiled from: Platform.kt */
    public static final class a {
        public static ArrayList a(List protocols) {
            i.e(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(m.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).toString());
            }
            return arrayList2;
        }

        public static byte[] b(List protocols) {
            i.e(protocols, "protocols");
            C2839f c2839f = new C2839f();
            for (String str : a(protocols)) {
                c2839f.Z0(str.length());
                c2839f.f1(str);
            }
            return c2839f.N(c2839f.f49074c);
        }

        public static boolean c() {
            return "Dalvik".equals(System.getProperty("java.vm.name"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0071 A[PHI: r1
      0x0071: PHI (r1v3 tb.h) = (r1v1 tb.h), (r1v4 tb.h) binds: [B:65:0x0155, B:25:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0159  */
    static {
        h hVar;
        String jvmVersion;
        h eVar = null;
        if (a.c()) {
            for (Map.Entry<String, String> entry : c.f47504b.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                Logger logger = Logger.getLogger(key);
                if (c.f47503a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(value, 3) ? Level.FINE : Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(d.f47505a);
                }
            }
            hVar = p244tb.a.f47361d ? new p244tb.a() : null;
            if (hVar == null) {
                eVar = b.f47363e ? new b() : null;
                i.b(eVar);
                hVar = eVar;
            }
        } else if ("Conscrypt".equals(Security.getProviders()[0].getName())) {
            hVar = d.f47370d ? new d() : null;
            if (hVar == null) {
                if (!"BC".equals(Security.getProviders()[0].getName())) {
                    if (c.f47368d) {
                        hVar = new c();
                    } else {
                        hVar = null;
                    }
                    if (hVar == null) {
                        if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                            if (g.f47382d) {
                                hVar = new g();
                            } else {
                                hVar = null;
                            }
                            if (hVar == null) {
                                if (f.f47381c) {
                                    hVar = new f();
                                } else {
                                    hVar = null;
                                }
                                if (hVar == null) {
                                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                                    i.d(jvmVersion, "jvmVersion");
                                    if (Integer.parseInt(jvmVersion) < 9) {
                                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                                        Method getMethod = cls.getMethod("get", SSLSocket.class);
                                        Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                                        i.d(putMethod, "putMethod");
                                        i.d(getMethod, "getMethod");
                                        i.d(removeMethod, "removeMethod");
                                        i.d(clientProviderClass, "clientProviderClass");
                                        i.d(serverProviderClass, "serverProviderClass");
                                        eVar = new e(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
                                    }
                                    if (eVar != null) {
                                        hVar = eVar;
                                    } else {
                                        hVar = new h();
                                    }
                                }
                            }
                        } else {
                            if (f.f47381c) {
                                hVar = new f();
                            } else {
                                hVar = null;
                            }
                            if (hVar == null) {
                                jvmVersion = System.getProperty("java.specification.version", "unknown");
                                i.d(jvmVersion, "jvmVersion");
                                if (Integer.parseInt(jvmVersion) < 9) {
                                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> clientProviderClass2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> serverProviderClass2 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method putMethod2 = cls3.getMethod("put", SSLSocket.class, cls4);
                                    Method getMethod2 = cls3.getMethod("get", SSLSocket.class);
                                    Method removeMethod2 = cls3.getMethod("remove", SSLSocket.class);
                                    i.d(putMethod2, "putMethod");
                                    i.d(getMethod2, "getMethod");
                                    i.d(removeMethod2, "removeMethod");
                                    i.d(clientProviderClass2, "clientProviderClass");
                                    i.d(serverProviderClass2, "serverProviderClass");
                                    eVar = new e(putMethod2, getMethod2, removeMethod2, clientProviderClass2, serverProviderClass2);
                                }
                                if (eVar != null) {
                                    hVar = eVar;
                                } else {
                                    hVar = new h();
                                }
                            }
                        }
                    }
                } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    if (f.f47381c) {
                        hVar = new f();
                    } else {
                        hVar = null;
                    }
                    if (hVar == null) {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        i.d(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod3 = cls5.getMethod("put", SSLSocket.class, cls6);
                            Method getMethod3 = cls5.getMethod("get", SSLSocket.class);
                            Method removeMethod3 = cls5.getMethod("remove", SSLSocket.class);
                            i.d(putMethod3, "putMethod");
                            i.d(getMethod3, "getMethod");
                            i.d(removeMethod3, "removeMethod");
                            i.d(clientProviderClass3, "clientProviderClass");
                            i.d(serverProviderClass3, "serverProviderClass");
                            eVar = new e(putMethod3, getMethod3, removeMethod3, clientProviderClass3, serverProviderClass3);
                        }
                        if (eVar != null) {
                            hVar = eVar;
                        } else {
                            hVar = new h();
                        }
                    }
                } else {
                    if (g.f47382d) {
                        hVar = new g();
                    } else {
                        hVar = null;
                    }
                    if (hVar == null) {
                        if (f.f47381c) {
                            hVar = new f();
                        } else {
                            hVar = null;
                        }
                        if (hVar == null) {
                            jvmVersion = System.getProperty("java.specification.version", "unknown");
                            i.d(jvmVersion, "jvmVersion");
                            if (Integer.parseInt(jvmVersion) < 9) {
                                Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> clientProviderClass4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> serverProviderClass4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method putMethod4 = cls7.getMethod("put", SSLSocket.class, cls8);
                                Method getMethod4 = cls7.getMethod("get", SSLSocket.class);
                                Method removeMethod4 = cls7.getMethod("remove", SSLSocket.class);
                                i.d(putMethod4, "putMethod");
                                i.d(getMethod4, "getMethod");
                                i.d(removeMethod4, "removeMethod");
                                i.d(clientProviderClass4, "clientProviderClass");
                                i.d(serverProviderClass4, "serverProviderClass");
                                eVar = new e(putMethod4, getMethod4, removeMethod4, clientProviderClass4, serverProviderClass4);
                            }
                            if (eVar != null) {
                                hVar = eVar;
                            } else {
                                hVar = new h();
                            }
                        }
                    }
                }
            }
        } else if (!"BC".equals(Security.getProviders()[0].getName())) {
            if (c.f47368d) {
                hVar = new c();
            } else {
                hVar = null;
            }
            if (hVar == null) {
                if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
                    if (f.f47381c) {
                        hVar = new f();
                    } else {
                        hVar = null;
                    }
                    if (hVar == null) {
                        jvmVersion = System.getProperty("java.specification.version", "unknown");
                        i.d(jvmVersion, "jvmVersion");
                        if (Integer.parseInt(jvmVersion) < 9) {
                            Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls10 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass5 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass5 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod5 = cls9.getMethod("put", SSLSocket.class, cls10);
                            Method getMethod5 = cls9.getMethod("get", SSLSocket.class);
                            Method removeMethod5 = cls9.getMethod("remove", SSLSocket.class);
                            i.d(putMethod5, "putMethod");
                            i.d(getMethod5, "getMethod");
                            i.d(removeMethod5, "removeMethod");
                            i.d(clientProviderClass5, "clientProviderClass");
                            i.d(serverProviderClass5, "serverProviderClass");
                            eVar = new e(putMethod5, getMethod5, removeMethod5, clientProviderClass5, serverProviderClass5);
                        }
                        if (eVar != null) {
                            hVar = eVar;
                        } else {
                            hVar = new h();
                        }
                    }
                } else {
                    if (g.f47382d) {
                        hVar = new g();
                    } else {
                        hVar = null;
                    }
                    if (hVar == null) {
                        if (f.f47381c) {
                            hVar = new f();
                        } else {
                            hVar = null;
                        }
                        if (hVar == null) {
                            jvmVersion = System.getProperty("java.specification.version", "unknown");
                            i.d(jvmVersion, "jvmVersion");
                            if (Integer.parseInt(jvmVersion) < 9) {
                                Class<?> cls11 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                Class<?> cls12 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                Class<?> clientProviderClass6 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                Class<?> serverProviderClass6 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                Method putMethod6 = cls11.getMethod("put", SSLSocket.class, cls12);
                                Method getMethod6 = cls11.getMethod("get", SSLSocket.class);
                                Method removeMethod6 = cls11.getMethod("remove", SSLSocket.class);
                                i.d(putMethod6, "putMethod");
                                i.d(getMethod6, "getMethod");
                                i.d(removeMethod6, "removeMethod");
                                i.d(clientProviderClass6, "clientProviderClass");
                                i.d(serverProviderClass6, "serverProviderClass");
                                eVar = new e(putMethod6, getMethod6, removeMethod6, clientProviderClass6, serverProviderClass6);
                            }
                            if (eVar != null) {
                                hVar = eVar;
                            } else {
                                hVar = new h();
                            }
                        }
                    }
                }
            }
        } else if ("OpenJSSE".equals(Security.getProviders()[0].getName())) {
            if (f.f47381c) {
                hVar = new f();
            } else {
                hVar = null;
            }
            if (hVar == null) {
                jvmVersion = System.getProperty("java.specification.version", "unknown");
                try {
                    i.d(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        try {
                            Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                            Class<?> cls14 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                            Class<?> clientProviderClass7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                            Class<?> serverProviderClass7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                            Method putMethod7 = cls13.getMethod("put", SSLSocket.class, cls14);
                            Method getMethod7 = cls13.getMethod("get", SSLSocket.class);
                            Method removeMethod7 = cls13.getMethod("remove", SSLSocket.class);
                            i.d(putMethod7, "putMethod");
                            i.d(getMethod7, "getMethod");
                            i.d(removeMethod7, "removeMethod");
                            i.d(clientProviderClass7, "clientProviderClass");
                            i.d(serverProviderClass7, "serverProviderClass");
                            eVar = new e(putMethod7, getMethod7, removeMethod7, clientProviderClass7, serverProviderClass7);
                        } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        }
                    }
                } catch (NumberFormatException unused2) {
                }
                if (eVar != null) {
                    hVar = eVar;
                } else {
                    hVar = new h();
                }
            }
        } else {
            if (g.f47382d) {
                hVar = new g();
            } else {
                hVar = null;
            }
            if (hVar == null) {
                if (f.f47381c) {
                    hVar = new f();
                } else {
                    hVar = null;
                }
                if (hVar == null) {
                    jvmVersion = System.getProperty("java.specification.version", "unknown");
                    i.d(jvmVersion, "jvmVersion");
                    if (Integer.parseInt(jvmVersion) < 9) {
                        Class<?> cls15 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls16 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> clientProviderClass8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> serverProviderClass8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method putMethod8 = cls15.getMethod("put", SSLSocket.class, cls16);
                        Method getMethod8 = cls15.getMethod("get", SSLSocket.class);
                        Method removeMethod8 = cls15.getMethod("remove", SSLSocket.class);
                        i.d(putMethod8, "putMethod");
                        i.d(getMethod8, "getMethod");
                        i.d(removeMethod8, "removeMethod");
                        i.d(clientProviderClass8, "clientProviderClass");
                        i.d(serverProviderClass8, "serverProviderClass");
                        eVar = new e(putMethod8, getMethod8, removeMethod8, clientProviderClass8, serverProviderClass8);
                    }
                    if (eVar != null) {
                        hVar = eVar;
                    } else {
                        hVar = new h();
                    }
                }
            }
        }
        f47384a = hVar;
        f47385b = Logger.getLogger(t.class.getName());
    }

    public static void i(int i10, String message, Throwable th) {
        i.e(message, "message");
        f47385b.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public static /* synthetic */ void j(h hVar, String str, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        hVar.getClass();
        i(i10, str, null);
    }

    public p281wb.c b(X509TrustManager x509TrustManager) {
        return new p281wb.a(c(x509TrustManager));
    }

    public e c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        i.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List<Protocol> protocols) {
        i.e(protocols, "protocols");
    }

    public void e(Socket socket, InetSocketAddress address, int i10) throws IOException {
        i.e(address, "address");
        socket.connect(address, i10);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (f47385b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String hostname) {
        i.e(hostname, "hostname");
        return true;
    }

    public void k(Object obj, String message) {
        i.e(message, "message");
        if (obj == null) {
            message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, message, (Throwable) obj);
    }

    public SSLContext l() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        i.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory m(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextL = l();
            sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
            i.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager n() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        i.b(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                i.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        String string = Arrays.toString(trustManagers);
        i.d(string, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }
}
