package okhttp3.internal.connection;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import okhttp3.C2750a;
import okhttp3.InterfaceC2754e;
import okhttp3.m;
import okhttp3.p;

/* JADX INFO: compiled from: RouteSelector.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2750a f45521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F3.e f45522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2754e f45523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f45524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<? extends Proxy> f45525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f45527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f45528h;

    /* JADX INFO: compiled from: RouteSelector.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f45529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f45530b;

        public a(ArrayList arrayList) {
            this.f45529a = arrayList;
        }

        public final boolean a() {
            return this.f45530b < this.f45529a.size();
        }
    }

    public j(C2750a c2750a, F3.e routeDatabase, InterfaceC2754e call, m eventListener) {
        List<? extends Proxy> listL;
        kotlin.jvm.internal.i.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.i.e(call, "call");
        kotlin.jvm.internal.i.e(eventListener, "eventListener");
        this.f45521a = c2750a;
        this.f45522b = routeDatabase;
        this.f45523c = call;
        this.f45524d = eventListener;
        EmptyList emptyList = EmptyList.f42983b;
        this.f45525e = emptyList;
        this.f45527g = emptyList;
        this.f45528h = new ArrayList();
        p url = c2750a.f45308h;
        kotlin.jvm.internal.i.e(url, "url");
        URI uriI = url.i();
        if (uriI.getHost() == null) {
            listL = p172nb.b.l(Proxy.NO_PROXY);
        } else {
            List<Proxy> proxiesOrNull = c2750a.f45307g.select(uriI);
            List<Proxy> list = proxiesOrNull;
            if (list == null || list.isEmpty()) {
                listL = p172nb.b.l(Proxy.NO_PROXY);
            } else {
                kotlin.jvm.internal.i.d(proxiesOrNull, "proxiesOrNull");
                listL = p172nb.b.x(proxiesOrNull);
            }
        }
        this.f45525e = listL;
        this.f45526f = 0;
    }

    public final boolean a() {
        return this.f45526f < this.f45525e.size() || !this.f45528h.isEmpty();
    }
}
