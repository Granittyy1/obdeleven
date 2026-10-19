package E9;

import A8.p;
import io.grpc.internal.GrpcUtil;
import io.grpc.okhttp.internal.Platform;
import io.grpc.okhttp.internal.Protocol;
import io.grpc.okhttp.internal.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: OkHttpProtocolNegotiator.java */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f3151b = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f3152c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Platform f3153a;

    /* JADX INFO: compiled from: OkHttpProtocolNegotiator.java */
    public static final class a extends e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final io.grpc.okhttp.internal.e<Socket> f3154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final io.grpc.okhttp.internal.e<Socket> f3155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final io.grpc.okhttp.internal.e<Socket> f3156f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final io.grpc.okhttp.internal.e<Socket> f3157g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final io.grpc.okhttp.internal.e<Socket> f3158h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final io.grpc.okhttp.internal.e<Socket> f3159i;
        public static final Method j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final Method f3160k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final Method f3161l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final Method f3162m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Method f3163n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final Method f3164o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Constructor<?> f3165p;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Logger logger = e.f3151b;
            Class cls = Boolean.TYPE;
            Constructor<?> constructor = null;
            f3154d = new io.grpc.okhttp.internal.e<>(null, "setUseSessionTickets", cls);
            f3155e = new io.grpc.okhttp.internal.e<>(null, "setHostname", String.class);
            f3156f = new io.grpc.okhttp.internal.e<>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f3157g = new io.grpc.okhttp.internal.e<>(null, "setAlpnProtocols", byte[].class);
            f3158h = new io.grpc.okhttp.internal.e<>(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f3159i = new io.grpc.okhttp.internal.e<>(null, "setNpnProtocols", byte[].class);
            try {
                method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                    try {
                        method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                        try {
                            Class<?> cls2 = Class.forName("android.net.ssl.SSLSockets");
                            method4 = cls2.getMethod("isSupportedSocket", SSLSocket.class);
                            try {
                                method5 = cls2.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                            } catch (ClassNotFoundException e10) {
                                e = e10;
                                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                                method5 = null;
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                                method5 = null;
                            }
                        } catch (ClassNotFoundException e12) {
                            e = e12;
                            method4 = null;
                        } catch (NoSuchMethodException e13) {
                            e = e13;
                            method4 = null;
                        }
                    } catch (ClassNotFoundException e14) {
                        e = e14;
                        method3 = null;
                        method4 = method3;
                        logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f3161l = method;
                        f3162m = method2;
                        f3163n = method3;
                        j = method4;
                        f3160k = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f3164o = method6;
                        f3165p = constructor;
                    } catch (NoSuchMethodException e15) {
                        e = e15;
                        method3 = null;
                        method4 = method3;
                        logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f3161l = method;
                        f3162m = method2;
                        f3163n = method3;
                        j = method4;
                        f3160k = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f3164o = method6;
                        f3165p = constructor;
                    }
                } catch (ClassNotFoundException e16) {
                    e = e16;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f3161l = method;
                    f3162m = method2;
                    f3163n = method3;
                    j = method4;
                    f3160k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f3164o = method6;
                    f3165p = constructor;
                } catch (NoSuchMethodException e17) {
                    e = e17;
                    method2 = null;
                    method3 = method2;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    f3161l = method;
                    f3162m = method2;
                    f3163n = method3;
                    j = method4;
                    f3160k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    f3164o = method6;
                    f3165p = constructor;
                }
            } catch (ClassNotFoundException e18) {
                e = e18;
                method = null;
                method2 = null;
            } catch (NoSuchMethodException e19) {
                e = e19;
                method = null;
                method2 = null;
            }
            f3161l = method;
            f3162m = method2;
            f3163n = method3;
            j = method4;
            f3160k = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                try {
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                } catch (ClassNotFoundException e20) {
                    e = e20;
                    logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                } catch (NoSuchMethodException e21) {
                    e = e21;
                    logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                }
            } catch (ClassNotFoundException e22) {
                e = e22;
                method6 = null;
            } catch (NoSuchMethodException e23) {
                e = e23;
                method6 = null;
            }
            f3164o = method6;
            f3165p = constructor;
        }

        @Override // E9.e
        public final void a(SSLSocket sSLSocket, String str, List<Protocol> list) {
            Constructor<?> constructor;
            Method method;
            ArrayList arrayList = new ArrayList();
            Iterator<Protocol> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            boolean z10 = false;
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (str != null) {
                try {
                    try {
                        if (e.c(str)) {
                            Method method2 = j;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                f3154d.d(sSLSocket, Boolean.TRUE);
                            } else {
                                f3160k.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = f3164o;
                            if (method3 == null || (constructor = f3165p) == null) {
                                f3155e.d(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        }
                    } catch (InvocationTargetException e10) {
                        throw new RuntimeException(e10);
                    }
                } catch (IllegalAccessException e11) {
                    throw new RuntimeException(e11);
                } catch (InstantiationException e12) {
                    throw new RuntimeException(e12);
                }
            }
            Method method4 = f3163n;
            if (method4 != null) {
                try {
                    method4.invoke(sSLSocket, null);
                    f3161l.invoke(sSLParameters, strArr);
                    z10 = true;
                } catch (InvocationTargetException e13) {
                    if (!(e13.getTargetException() instanceof UnsupportedOperationException)) {
                        throw e13;
                    }
                    e.f3151b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                }
            }
            sSLSocket.setSSLParameters(sSLParameters);
            if (z10 && (method = f3162m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
                return;
            }
            Object[] objArr = {Platform.b(list)};
            Platform platform = this.f3153a;
            if (platform.e() == Platform.TlsExtensionType.f37952b) {
                f3157g.e(sSLSocket, objArr);
            }
            if (platform.e() == Platform.TlsExtensionType.f37954d) {
                throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
            }
            f3159i.e(sSLSocket, objArr);
        }

        @Override // E9.e
        public final String b(SSLSocket sSLSocket) {
            Logger logger = e.f3151b;
            Method method = f3163n;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, null);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    if (!(e11.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e11);
                    }
                    logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            Platform platform = this.f3153a;
            if (platform.e() == Platform.TlsExtensionType.f37952b) {
                try {
                    byte[] bArr = (byte[]) f3156f.e(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, j.f38021b);
                    }
                } catch (Exception e12) {
                    logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e12);
                }
            }
            if (platform.e() != Platform.TlsExtensionType.f37954d) {
                try {
                    byte[] bArr2 = (byte[]) f3158h.e(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, j.f38021b);
                    }
                } catch (Exception e13) {
                    logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e13);
                }
            }
            return null;
        }

        @Override // E9.e
        public final String d(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
            String strB = b(sSLSocket);
            return strB == null ? super.d(sSLSocket, str, list) : strB;
        }
    }

    static {
        e eVar;
        Platform platform = Platform.f37950d;
        ClassLoader classLoader = e.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e10) {
            Level level = Level.FINE;
            Logger logger = f3151b;
            logger.log(level, "Unable to find Conscrypt. Skipping", (Throwable) e10);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e11) {
                logger.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e11);
                eVar = new e(platform);
            }
        }
        eVar = new a(platform);
        f3152c = eVar;
    }

    public e(Platform platform) {
        p.j(platform, "platform");
        this.f3153a = platform;
    }

    public static boolean c(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            URI uriA = GrpcUtil.a(str);
            p.e(str, "No host in authority '%s'", uriA.getHost() != null);
            p.e(str, "Userinfo must not be present on authority: '%s'", uriA.getUserInfo() == null);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List<Protocol> list) {
        this.f3153a.c(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        return this.f3153a.d(sSLSocket);
    }

    public String d(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        Platform platform = this.f3153a;
        if (list != null) {
            a(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strB = b(sSLSocket);
            if (strB != null) {
                platform.a(sSLSocket);
                return strB;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } catch (Throwable th) {
            platform.a(sSLSocket);
            throw th;
        }
    }
}
