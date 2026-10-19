package p257ub;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.i;
import kotlin.text.a;
import okhttp3.Protocol;
import p244tb.b;
import p244tb.h;

/* JADX INFO: compiled from: AndroidSocketAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public class f implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f47506f = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? super SSLSocket> f47507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f47508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f47509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f47510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f47511e;

    public f(Class<? super SSLSocket> cls) throws NoSuchMethodException {
        this.f47507a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        i.d(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f47508b = declaredMethod;
        this.f47509c = cls.getMethod("setHostname", String.class);
        this.f47510d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f47511e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p257ub.j
    public final boolean a() {
        boolean z10 = b.f47363e;
        return b.f47363e;
    }

    @Override // p257ub.j
    public final boolean b(SSLSocket sSLSocket) {
        return this.f47507a.isInstance(sSLSocket);
    }

    @Override // p257ub.j
    public final String c(SSLSocket sSLSocket) {
        if (!this.f47507a.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f47510d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, a.f43120b);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && i.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // p257ub.j
    public final void d(SSLSocket sSLSocket, String str, List<? extends Protocol> protocols) {
        i.e(protocols, "protocols");
        if (this.f47507a.isInstance(sSLSocket)) {
            try {
                this.f47508b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f47509c.invoke(sSLSocket, str);
                }
                Method method = this.f47511e;
                h hVar = h.f47384a;
                method.invoke(sSLSocket, h.a.b(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
