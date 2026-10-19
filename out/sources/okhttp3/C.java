package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: Route.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2750a f45278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f45279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f45280c;

    public C(C2750a c2750a, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.i.e(socketAddress, "socketAddress");
        this.f45278a = c2750a;
        this.f45279b = proxy;
        this.f45280c = socketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C) {
            C c10 = (C) obj;
            if (kotlin.jvm.internal.i.a(c10.f45278a, this.f45278a) && kotlin.jvm.internal.i.a(c10.f45279b, this.f45279b) && kotlin.jvm.internal.i.a(c10.f45280c, this.f45280c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f45280c.hashCode() + ((this.f45279b.hashCode() + ((this.f45278a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f45280c + '}';
    }
}
