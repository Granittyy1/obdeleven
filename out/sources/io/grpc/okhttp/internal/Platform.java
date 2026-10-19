package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p318zb.C2839f;

/* JADX INFO: loaded from: classes3.dex */
public class Platform {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f37948b = Logger.getLogger(Platform.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f37949c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Platform f37950d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f37951a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TlsExtensionType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TlsExtensionType f37952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final TlsExtensionType f37953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final TlsExtensionType f37954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ TlsExtensionType[] f37955e;

        static {
            TlsExtensionType tlsExtensionType = new TlsExtensionType("ALPN_AND_NPN", 0);
            f37952b = tlsExtensionType;
            TlsExtensionType tlsExtensionType2 = new TlsExtensionType("NPN", 1);
            f37953c = tlsExtensionType2;
            TlsExtensionType tlsExtensionType3 = new TlsExtensionType("NONE", 2);
            f37954d = tlsExtensionType3;
            f37955e = new TlsExtensionType[]{tlsExtensionType, tlsExtensionType2, tlsExtensionType3};
        }

        public TlsExtensionType() {
            throw null;
        }

        public static TlsExtensionType valueOf(String str) {
            return (TlsExtensionType) Enum.valueOf(TlsExtensionType.class, str);
        }

        public static TlsExtensionType[] values() {
            return (TlsExtensionType[]) f37955e.clone();
        }
    }

    public static class a extends Platform {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e<Socket> f37956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e<Socket> f37957f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e<Socket> f37958g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e<Socket> f37959h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final TlsExtensionType f37960i;

        public a(e eVar, e eVar2, e eVar3, e eVar4, Provider provider, TlsExtensionType tlsExtensionType) {
            super(provider);
            this.f37956e = eVar;
            this.f37957f = eVar2;
            this.f37958g = eVar3;
            this.f37959h = eVar4;
            this.f37960i = tlsExtensionType;
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final void c(SSLSocket sSLSocket, String str, List<Protocol> list) {
            if (str != null) {
                this.f37956e.d(sSLSocket, Boolean.TRUE);
                this.f37957f.d(sSLSocket, str);
            }
            e<Socket> eVar = this.f37959h;
            if (eVar.a(sSLSocket.getClass()) != null) {
                eVar.e(sSLSocket, Platform.b(list));
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final String d(SSLSocket sSLSocket) {
            byte[] bArr;
            e<Socket> eVar = this.f37958g;
            if ((eVar.a(sSLSocket.getClass()) != null) && (bArr = (byte[]) eVar.e(sSLSocket, new Object[0])) != null) {
                return new String(bArr, j.f38021b);
            }
            return null;
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final TlsExtensionType e() {
            return this.f37960i;
        }
    }

    public static class b extends Platform {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Method f37961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Method f37962f;

        public b(Provider provider, Method method, Method method2) {
            super(provider);
            this.f37961e = method;
            this.f37962f = method2;
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final void c(SSLSocket sSLSocket, String str, List<Protocol> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (Protocol protocol : list) {
                if (protocol != Protocol.HTTP_1_0) {
                    arrayList.add(protocol.toString());
                }
            }
            try {
                this.f37961e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final String d(SSLSocket sSLSocket) {
            try {
                return (String) this.f37962f.invoke(sSLSocket, null);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final TlsExtensionType e() {
            return TlsExtensionType.f37952b;
        }
    }

    public static class c extends Platform {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Method f37963e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Method f37964f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Method f37965g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Class<?> f37966h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Class<?> f37967i;

        public c(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f37963e = method;
            this.f37964f = method2;
            this.f37965g = method3;
            this.f37966h = cls;
            this.f37967i = cls2;
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final void a(SSLSocket sSLSocket) {
            try {
                this.f37965g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e10) {
                Platform.f37948b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e10);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final void c(SSLSocket sSLSocket, String str, List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Protocol protocol = list.get(i10);
                if (protocol != Protocol.HTTP_1_0) {
                    arrayList.add(protocol.toString());
                }
            }
            try {
                this.f37963e.invoke(null, sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f37966h, this.f37967i}, new d(arrayList)));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final String d(SSLSocket sSLSocket) {
            try {
                d dVar = (d) Proxy.getInvocationHandler(this.f37964f.invoke(null, sSLSocket));
                boolean z10 = dVar.f37969b;
                if (!z10 && dVar.f37970c == null) {
                    Platform.f37948b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (z10) {
                    return null;
                }
                return dVar.f37970c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // io.grpc.okhttp.internal.Platform
        public final TlsExtensionType e() {
            return TlsExtensionType.f37952b;
        }
    }

    public static class d implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f37968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f37969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f37970c;

        public d(ArrayList arrayList) {
            this.f37968a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = j.f38020a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f37969b = true;
                return null;
            }
            boolean zEquals = name.equals("protocols");
            ArrayList arrayList = this.f37968a;
            if (zEquals && objArr.length == 0) {
                return arrayList;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (arrayList.contains(list.get(i10))) {
                            String str = (String) list.get(i10);
                            this.f37970c = str;
                            return str;
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.f37970c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f37970c = (String) objArr[0];
            return null;
        }
    }

    static {
        Logger logger;
        Provider provider;
        Platform platform;
        TlsExtensionType tlsExtensionType;
        TlsExtensionType tlsExtensionType2;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i10 = 0;
        loop0: while (true) {
            logger = f37948b;
            if (i10 >= length) {
                logger.log(Level.WARNING, "Unable to find Conscrypt");
                provider = null;
                break;
            }
            Provider provider2 = providers[i10];
            for (String str : f37949c) {
                if (str.equals(provider2.getClass().getName())) {
                    logger.log(Level.FINE, "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i10++;
        }
        if (provider != null) {
            e eVar = new e(null, "setUseSessionTickets", Boolean.TYPE);
            e eVar2 = new e(null, "setHostname", String.class);
            e eVar3 = new e(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            e eVar4 = new e(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            boolean zEquals = provider.getName().equals("GmsCore_OpenSSL");
            TlsExtensionType tlsExtensionType3 = TlsExtensionType.f37952b;
            if (!zEquals && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
                try {
                    Platform.class.getClassLoader().loadClass("android.net.Network");
                } catch (ClassNotFoundException e10) {
                    logger.log(Level.FINE, "Can't find class", (Throwable) e10);
                    try {
                        Platform.class.getClassLoader().loadClass("android.app.ActivityOptions");
                        tlsExtensionType2 = TlsExtensionType.f37953c;
                    } catch (ClassNotFoundException e11) {
                        logger.log(Level.FINE, "Can't find class", (Throwable) e11);
                        tlsExtensionType2 = TlsExtensionType.f37954d;
                    }
                    tlsExtensionType = tlsExtensionType2;
                }
            }
            tlsExtensionType = tlsExtensionType3;
            platform = new a(eVar, eVar2, eVar3, eVar4, provider, tlsExtensionType);
        } else {
            try {
                Provider provider3 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                        sSLContext.init(null, null, null);
                        ((Method) AccessController.doPrivileged(new f())).invoke(sSLContext.createSSLEngine(), null);
                        platform = new b(provider3, (Method) AccessController.doPrivileged(new g()), (Method) AccessController.doPrivileged(new h()));
                    } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused2) {
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                        platform = new c(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider")), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    platform = new Platform(provider3);
                }
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(e12);
            }
        }
        f37950d = platform;
    }

    public Platform(Provider provider) {
        this.f37951a = provider;
    }

    public static byte[] b(List<Protocol> list) {
        C2839f c2839f = new C2839f();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Protocol protocol = list.get(i10);
            if (protocol != Protocol.HTTP_1_0) {
                c2839f.Z0(protocol.toString().length());
                c2839f.f1(protocol.toString());
            }
        }
        return c2839f.N(c2839f.f49074c);
    }

    public String d(SSLSocket sSLSocket) {
        return null;
    }

    public TlsExtensionType e() {
        return TlsExtensionType.f37954d;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }
}
