package okhttp3.internal.connection;

import com.google.android.gms.internal.measurement.M1;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.k;
import okhttp3.C;
import okhttp3.C2750a;
import okhttp3.InterfaceC2754e;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.m;
import okhttp3.p;
import p293xa.r;

/* JADX INFO: compiled from: ExchangeFinder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f45468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2750a f45469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f45470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f45471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j.a f45472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f45473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45476i;
    public C j;

    public d(i connectionPool, C2750a c2750a, e call, m eventListener) {
        kotlin.jvm.internal.i.e(connectionPool, "connectionPool");
        kotlin.jvm.internal.i.e(call, "call");
        kotlin.jvm.internal.i.e(eventListener, "eventListener");
        this.f45468a = connectionPool;
        this.f45469b = c2750a;
        this.f45470c = call;
        this.f45471d = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0280  */
    /* JADX WARN: Code duplicated, block: B:123:0x0297  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:128:0x02be  */
    /* JADX WARN: Code duplicated, block: B:137:0x030a  */
    /* JADX WARN: Code duplicated, block: B:138:0x032a  */
    /* JADX WARN: Code duplicated, block: B:181:0x032b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x02f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x039e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x025a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0390 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:74:0x0162  */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.List] */
    public final f a(int i10, int i11, int i12, boolean z10, boolean z11) throws IOException {
        C c10;
        j.a aVar;
        j jVar;
        ArrayList arrayList;
        j.a aVar2;
        boolean z12;
        C2750a c2750a;
        Proxy proxy;
        String hostName;
        int port;
        List listK;
        boolean zContains;
        F3.e eVar;
        C route;
        Socket socketH;
        while (!this.f45470c.f45491q) {
            f fVar = this.f45470c.f45485k;
            if (fVar != null) {
                synchronized (fVar) {
                    try {
                        socketH = (fVar.j || !b(fVar.f45499b.f45278a.f45308h)) ? this.f45470c.h() : null;
                        r rVar = r.f47939a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f45470c.f45485k == null) {
                    if (socketH != null) {
                        p172nb.b.d(socketH);
                    }
                    m mVar = this.f45471d;
                    e call = this.f45470c;
                    mVar.getClass();
                    kotlin.jvm.internal.i.e(call, "call");
                    this.f45474g = 0;
                    this.f45475h = 0;
                    this.f45476i = 0;
                    if (this.f45468a.a(this.f45469b, this.f45470c, null, false)) {
                        fVar = this.f45470c.f45485k;
                        kotlin.jvm.internal.i.b(fVar);
                        m mVar2 = this.f45471d;
                        e call2 = this.f45470c;
                        mVar2.getClass();
                        kotlin.jvm.internal.i.e(call2, "call");
                    } else {
                        c10 = this.j;
                        try {
                            if (c10 != null) {
                                this.j = null;
                            } else {
                                aVar = this.f45472e;
                                if (aVar == null && aVar.a()) {
                                    j.a aVar3 = this.f45472e;
                                    kotlin.jvm.internal.i.b(aVar3);
                                    if (!aVar3.a()) {
                                        throw new NoSuchElementException();
                                    }
                                    int i13 = aVar3.f45530b;
                                    aVar3.f45530b = i13 + 1;
                                    c10 = (C) aVar3.f45529a.get(i13);
                                } else {
                                    jVar = this.f45473f;
                                    if (jVar == null) {
                                        C2750a c2750a2 = this.f45469b;
                                        e eVar2 = this.f45470c;
                                        jVar = new j(c2750a2, eVar2.f45477b.f45610B, eVar2, this.f45471d);
                                        this.f45473f = jVar;
                                    }
                                    if (jVar.a()) {
                                        throw new NoSuchElementException();
                                    }
                                    arrayList = new ArrayList();
                                    while (jVar.f45526f < jVar.f45525e.size()) {
                                        if (jVar.f45526f < jVar.f45525e.size()) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        c2750a = jVar.f45521a;
                                        if (z12) {
                                            throw new SocketException("No route to " + c2750a.f45308h.f45574d + "; exhausted proxy configurations: " + jVar.f45525e);
                                        }
                                        List<? extends Proxy> list = jVar.f45525e;
                                        int i14 = jVar.f45526f;
                                        jVar.f45526f = i14 + 1;
                                        proxy = list.get(i14);
                                        ArrayList arrayList2 = new ArrayList();
                                        jVar.f45527g = arrayList2;
                                        if (proxy.type() != Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                                            p pVar = c2750a.f45308h;
                                            hostName = pVar.f45574d;
                                            port = pVar.f45575e;
                                        } else {
                                            SocketAddress proxyAddress = proxy.address();
                                            if (!(proxyAddress instanceof InetSocketAddress)) {
                                                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
                                            }
                                            kotlin.jvm.internal.i.d(proxyAddress, "proxyAddress");
                                            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                                            kotlin.jvm.internal.i.e(inetSocketAddress, "<this>");
                                            InetAddress address = inetSocketAddress.getAddress();
                                            if (address == null) {
                                                hostName = inetSocketAddress.getHostName();
                                                kotlin.jvm.internal.i.d(hostName, "hostName");
                                            } else {
                                                hostName = address.getHostAddress();
                                                kotlin.jvm.internal.i.d(hostName, "address.hostAddress");
                                            }
                                            port = inetSocketAddress.getPort();
                                        }
                                        if (1 <= port || port >= 65536) {
                                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                                        }
                                        if (proxy.type() == Proxy.Type.SOCKS) {
                                            arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
                                        } else {
                                            byte[] bArr = p172nb.b.f45026a;
                                            kotlin.jvm.internal.i.e(hostName, "<this>");
                                            if (p172nb.b.f45031f.e(hostName)) {
                                                listK = M1.k(InetAddress.getByName(hostName));
                                            } else {
                                                jVar.f45524d.getClass();
                                                InterfaceC2754e call3 = jVar.f45523c;
                                                kotlin.jvm.internal.i.e(call3, "call");
                                                c2750a.f45301a.getClass();
                                                try {
                                                    InetAddress[] allByName = InetAddress.getAllByName(hostName);
                                                    kotlin.jvm.internal.i.d(allByName, "getAllByName(hostname)");
                                                    List listD0 = k.d0(allByName);
                                                    if (listD0.isEmpty()) {
                                                        throw new UnknownHostException(c2750a.f45301a + " returned no addresses for " + hostName);
                                                    }
                                                    listK = listD0;
                                                } catch (NullPointerException e10) {
                                                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                                                    unknownHostException.initCause(e10);
                                                    throw unknownHostException;
                                                }
                                            }
                                            Iterator it = listK.iterator();
                                            while (it.hasNext()) {
                                                arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                                            }
                                        }
                                        Iterator it2 = jVar.f45527g.iterator();
                                        while (it2.hasNext()) {
                                            C c11 = new C(jVar.f45521a, proxy, (InetSocketAddress) it2.next());
                                            F3.e eVar3 = jVar.f45522b;
                                            synchronized (eVar3) {
                                                zContains = ((LinkedHashSet) eVar3.f3221b).contains(c11);
                                            }
                                            if (zContains) {
                                                jVar.f45528h.add(c11);
                                            } else {
                                                arrayList.add(c11);
                                            }
                                        }
                                        if (!arrayList.isEmpty()) {
                                            break;
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                        kotlin.collections.p.z(arrayList, jVar.f45528h);
                                        jVar.f45528h.clear();
                                    }
                                    aVar2 = new j.a(arrayList);
                                    this.f45472e = aVar2;
                                    if (!this.f45470c.f45491q) {
                                        throw new IOException("Canceled");
                                    }
                                    if (this.f45468a.a(this.f45469b, this.f45470c, arrayList, false)) {
                                        fVar = this.f45470c.f45485k;
                                        kotlin.jvm.internal.i.b(fVar);
                                        m mVar3 = this.f45471d;
                                        e call4 = this.f45470c;
                                        mVar3.getClass();
                                        kotlin.jvm.internal.i.e(call4, "call");
                                    } else {
                                        if (aVar2.a()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i15 = aVar2.f45530b;
                                        aVar2.f45530b = i15 + 1;
                                        c10 = (C) arrayList.get(i15);
                                        fVar = new f(this.f45468a, c10);
                                        this.f45470c.f45493s = fVar;
                                        fVar.c(i10, i11, i12, z10, this.f45470c, this.f45471d);
                                        this.f45470c.f45493s = null;
                                        eVar = this.f45470c.f45477b.f45610B;
                                        route = fVar.f45499b;
                                        synchronized (eVar) {
                                            kotlin.jvm.internal.i.e(route, "route");
                                            ((LinkedHashSet) eVar.f3221b).remove(route);
                                        }
                                        if (this.f45468a.a(this.f45469b, this.f45470c, arrayList, true)) {
                                            f fVar2 = this.f45470c.f45485k;
                                            kotlin.jvm.internal.i.b(fVar2);
                                            this.j = c10;
                                            Socket socket = fVar.f45501d;
                                            kotlin.jvm.internal.i.b(socket);
                                            p172nb.b.d(socket);
                                            m mVar4 = this.f45471d;
                                            e call5 = this.f45470c;
                                            mVar4.getClass();
                                            kotlin.jvm.internal.i.e(call5, "call");
                                            fVar = fVar2;
                                        } else {
                                            synchronized (fVar) {
                                                i iVar = this.f45468a;
                                                iVar.getClass();
                                                byte[] bArr2 = p172nb.b.f45026a;
                                                iVar.f45520d.add(fVar);
                                                iVar.f45518b.c(iVar.f45519c, 0L);
                                                this.f45470c.b(fVar);
                                                r rVar2 = r.f47939a;
                                            }
                                            m mVar5 = this.f45471d;
                                            e call6 = this.f45470c;
                                            mVar5.getClass();
                                            kotlin.jvm.internal.i.e(call6, "call");
                                        }
                                    }
                                }
                            }
                            fVar.c(i10, i11, i12, z10, this.f45470c, this.f45471d);
                            this.f45470c.f45493s = null;
                            eVar = this.f45470c.f45477b.f45610B;
                            route = fVar.f45499b;
                            synchronized (eVar) {
                                kotlin.jvm.internal.i.e(route, "route");
                                ((LinkedHashSet) eVar.f3221b).remove(route);
                                if (this.f45468a.a(this.f45469b, this.f45470c, arrayList, true)) {
                                    f fVar3 = this.f45470c.f45485k;
                                    kotlin.jvm.internal.i.b(fVar3);
                                    this.j = c10;
                                    Socket socket2 = fVar.f45501d;
                                    kotlin.jvm.internal.i.b(socket2);
                                    p172nb.b.d(socket2);
                                    m mVar6 = this.f45471d;
                                    e call7 = this.f45470c;
                                    mVar6.getClass();
                                    kotlin.jvm.internal.i.e(call7, "call");
                                    fVar = fVar3;
                                } else {
                                    synchronized (fVar) {
                                        i iVar2 = this.f45468a;
                                        iVar2.getClass();
                                        byte[] bArr3 = p172nb.b.f45026a;
                                        iVar2.f45520d.add(fVar);
                                        iVar2.f45518b.c(iVar2.f45519c, 0L);
                                        this.f45470c.b(fVar);
                                        r rVar3 = r.f47939a;
                                        m mVar7 = this.f45471d;
                                        e call8 = this.f45470c;
                                        mVar7.getClass();
                                        kotlin.jvm.internal.i.e(call8, "call");
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            this.f45470c.f45493s = null;
                            throw th2;
                        }
                        arrayList = null;
                        fVar = new f(this.f45468a, c10);
                        this.f45470c.f45493s = fVar;
                    }
                } else if (socketH != null) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                this.f45474g = 0;
                this.f45475h = 0;
                this.f45476i = 0;
                if (this.f45468a.a(this.f45469b, this.f45470c, null, false)) {
                    fVar = this.f45470c.f45485k;
                    kotlin.jvm.internal.i.b(fVar);
                    m mVar8 = this.f45471d;
                    e call9 = this.f45470c;
                    mVar8.getClass();
                    kotlin.jvm.internal.i.e(call9, "call");
                } else {
                    c10 = this.j;
                    if (c10 != null) {
                        this.j = null;
                    } else {
                        aVar = this.f45472e;
                        if (aVar == null) {
                        }
                        jVar = this.f45473f;
                        if (jVar == null) {
                            C2750a c2750a3 = this.f45469b;
                            e eVar4 = this.f45470c;
                            jVar = new j(c2750a3, eVar4.f45477b.f45610B, eVar4, this.f45471d);
                            this.f45473f = jVar;
                        }
                        if (jVar.a()) {
                            throw new NoSuchElementException();
                        }
                        arrayList = new ArrayList();
                        while (jVar.f45526f < jVar.f45525e.size()) {
                            if (jVar.f45526f < jVar.f45525e.size()) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            c2750a = jVar.f45521a;
                            if (z12) {
                                throw new SocketException("No route to " + c2750a.f45308h.f45574d + "; exhausted proxy configurations: " + jVar.f45525e);
                            }
                            List<? extends Proxy> list2 = jVar.f45525e;
                            int i16 = jVar.f45526f;
                            jVar.f45526f = i16 + 1;
                            proxy = list2.get(i16);
                            ArrayList arrayList3 = new ArrayList();
                            jVar.f45527g = arrayList3;
                            if (proxy.type() != Proxy.Type.DIRECT) {
                                p pVar2 = c2750a.f45308h;
                                hostName = pVar2.f45574d;
                                port = pVar2.f45575e;
                            } else {
                                p pVar3 = c2750a.f45308h;
                                hostName = pVar3.f45574d;
                                port = pVar3.f45575e;
                            }
                            if (1 <= port) {
                            }
                            throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                        }
                        if (arrayList.isEmpty()) {
                            kotlin.collections.p.z(arrayList, jVar.f45528h);
                            jVar.f45528h.clear();
                        }
                        aVar2 = new j.a(arrayList);
                        this.f45472e = aVar2;
                        if (!this.f45470c.f45491q) {
                            throw new IOException("Canceled");
                        }
                        if (this.f45468a.a(this.f45469b, this.f45470c, arrayList, false)) {
                            fVar = this.f45470c.f45485k;
                            kotlin.jvm.internal.i.b(fVar);
                            m mVar9 = this.f45471d;
                            e call10 = this.f45470c;
                            mVar9.getClass();
                            kotlin.jvm.internal.i.e(call10, "call");
                        } else {
                            if (aVar2.a()) {
                                throw new NoSuchElementException();
                            }
                            int i17 = aVar2.f45530b;
                            aVar2.f45530b = i17 + 1;
                            c10 = (C) arrayList.get(i17);
                            fVar = new f(this.f45468a, c10);
                            this.f45470c.f45493s = fVar;
                            fVar.c(i10, i11, i12, z10, this.f45470c, this.f45471d);
                            this.f45470c.f45493s = null;
                            eVar = this.f45470c.f45477b.f45610B;
                            route = fVar.f45499b;
                            synchronized (eVar) {
                                kotlin.jvm.internal.i.e(route, "route");
                                ((LinkedHashSet) eVar.f3221b).remove(route);
                                if (this.f45468a.a(this.f45469b, this.f45470c, arrayList, true)) {
                                    f fVar4 = this.f45470c.f45485k;
                                    kotlin.jvm.internal.i.b(fVar4);
                                    this.j = c10;
                                    Socket socket3 = fVar.f45501d;
                                    kotlin.jvm.internal.i.b(socket3);
                                    p172nb.b.d(socket3);
                                    m mVar10 = this.f45471d;
                                    e call11 = this.f45470c;
                                    mVar10.getClass();
                                    kotlin.jvm.internal.i.e(call11, "call");
                                    fVar = fVar4;
                                } else {
                                    synchronized (fVar) {
                                        i iVar3 = this.f45468a;
                                        iVar3.getClass();
                                        byte[] bArr4 = p172nb.b.f45026a;
                                        iVar3.f45520d.add(fVar);
                                        iVar3.f45518b.c(iVar3.f45519c, 0L);
                                        this.f45470c.b(fVar);
                                        r rVar4 = r.f47939a;
                                        m mVar11 = this.f45471d;
                                        e call12 = this.f45470c;
                                        mVar11.getClass();
                                        kotlin.jvm.internal.i.e(call12, "call");
                                    }
                                }
                            }
                        }
                    }
                    arrayList = null;
                    fVar = new f(this.f45468a, c10);
                    this.f45470c.f45493s = fVar;
                    fVar.c(i10, i11, i12, z10, this.f45470c, this.f45471d);
                    this.f45470c.f45493s = null;
                    eVar = this.f45470c.f45477b.f45610B;
                    route = fVar.f45499b;
                    synchronized (eVar) {
                        kotlin.jvm.internal.i.e(route, "route");
                        ((LinkedHashSet) eVar.f3221b).remove(route);
                        if (this.f45468a.a(this.f45469b, this.f45470c, arrayList, true)) {
                            f fVar5 = this.f45470c.f45485k;
                            kotlin.jvm.internal.i.b(fVar5);
                            this.j = c10;
                            Socket socket4 = fVar.f45501d;
                            kotlin.jvm.internal.i.b(socket4);
                            p172nb.b.d(socket4);
                            m mVar12 = this.f45471d;
                            e call13 = this.f45470c;
                            mVar12.getClass();
                            kotlin.jvm.internal.i.e(call13, "call");
                            fVar = fVar5;
                        } else {
                            synchronized (fVar) {
                                i iVar4 = this.f45468a;
                                iVar4.getClass();
                                byte[] bArr5 = p172nb.b.f45026a;
                                iVar4.f45520d.add(fVar);
                                iVar4.f45518b.c(iVar4.f45519c, 0L);
                                this.f45470c.b(fVar);
                                r rVar5 = r.f47939a;
                                m mVar13 = this.f45471d;
                                e call14 = this.f45470c;
                                mVar13.getClass();
                                kotlin.jvm.internal.i.e(call14, "call");
                            }
                        }
                    }
                }
            }
            if (fVar.i(z11)) {
                return fVar;
            }
            fVar.k();
            if (this.j == null) {
                j.a aVar4 = this.f45472e;
                if (aVar4 != null ? aVar4.a() : true) {
                    continue;
                } else {
                    j jVar2 = this.f45473f;
                    if (!(jVar2 != null ? jVar2.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean b(p url) {
        kotlin.jvm.internal.i.e(url, "url");
        p pVar = this.f45469b.f45308h;
        return url.f45575e == pVar.f45575e && kotlin.jvm.internal.i.a(url.f45574d, pVar.f45574d);
    }

    public final void c(IOException e10) {
        kotlin.jvm.internal.i.e(e10, "e");
        this.j = null;
        if ((e10 instanceof StreamResetException) && ((StreamResetException) e10).errorCode == ErrorCode.REFUSED_STREAM) {
            this.f45474g++;
        } else if (e10 instanceof ConnectionShutdownException) {
            this.f45475h++;
        } else {
            this.f45476i++;
        }
    }
}
