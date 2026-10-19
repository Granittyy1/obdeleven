package p244tb;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.m;
import kotlin.jvm.internal.i;
import okhttp3.Protocol;

/* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f47373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f47374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f47375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class<?> f47376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class<?> f47377g;

    /* JADX INFO: compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f47378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f47379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f47380c;

        public a(ArrayList arrayList) {
            this.f47378a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object proxy, Method method, Object[] objArr) throws Throwable {
            i.e(proxy, "proxy");
            i.e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (i.a(name, "supports") && i.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (i.a(name, "unsupported") && i.a(Void.TYPE, returnType)) {
                this.f47379b = true;
                return null;
            }
            boolean zA = i.a(name, "protocols");
            ArrayList arrayList = this.f47378a;
            if (zA && objArr.length == 0) {
                return arrayList;
            }
            if ((i.a(name, "selectProtocol") || i.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    i.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            Object obj2 = list.get(i10);
                            i.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (arrayList.contains(str)) {
                                this.f47380c = str;
                                return str;
                            }
                            if (i10 != size) {
                                i10++;
                            }
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.f47380c = str2;
                    return str2;
                }
            }
            if ((!i.a(name, "protocolSelected") && !i.a(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            i.c(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f47380c = (String) obj3;
            return null;
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f47373c = method;
        this.f47374d = method2;
        this.f47375e = method3;
        this.f47376f = cls;
        this.f47377g = cls2;
    }

    @Override // p244tb.h
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f47375e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // p244tb.h
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
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
        try {
            this.f47373c.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f47376f, this.f47377g}, new a(arrayList2)));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // p244tb.h
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f47374d.invoke(null, sSLSocket));
            i.c(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            boolean z10 = aVar.f47379b;
            if (!z10 && aVar.f47380c == null) {
                h.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            }
            if (z10) {
                return null;
            }
            return aVar.f47380c;
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
