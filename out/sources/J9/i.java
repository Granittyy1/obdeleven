package J9;

import A8.p;
import io.grpc.ConnectivityState;
import io.grpc.Status;
import io.grpc.internal.C2250v0;
import io.intercom.android.sdk.models.AttributeType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.C;

/* JADX INFO: compiled from: RoundRobinLoadBalancer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends io.grpc.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final io.grpc.a.b<d<D9.h>> f4118h = new io.grpc.a.b<>("state-info");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Status f4119i = Status.f36899e.h("no subchannels ready");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.grpc.i.c f4120c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ConnectivityState f4123f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f4121d = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f4124g = new b(f4119i);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f4122e = new Random();

    /* JADX INFO: compiled from: RoundRobinLoadBalancer.java */
    public class a implements io.grpc.i.InterfaceC0390i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.grpc.i.g f4125a;

        public a(io.grpc.i.g gVar) {
            this.f4125a = gVar;
        }

        @Override // io.grpc.i.InterfaceC0390i
        public final void a(D9.h hVar) {
            i iVar = i.this;
            HashMap map = iVar.f4121d;
            io.grpc.i.g gVar = this.f4125a;
            if (map.get(new io.grpc.d(gVar.a().f36959a, io.grpc.a.f36932b)) != gVar) {
                return;
            }
            ConnectivityState connectivityState = hVar.f2882a;
            ConnectivityState connectivityState2 = ConnectivityState.f36869d;
            ConnectivityState connectivityState3 = ConnectivityState.f36870e;
            if (connectivityState == connectivityState2 || connectivityState == connectivityState3) {
                iVar.f4120c.e();
            }
            ConnectivityState connectivityState4 = hVar.f2882a;
            if (connectivityState4 == connectivityState3) {
                gVar.f();
            }
            d<D9.h> dVarF = i.f(gVar);
            if (dVarF.f4131a.f2882a.equals(connectivityState2) && (connectivityState4.equals(ConnectivityState.f36867b) || connectivityState4.equals(connectivityState3))) {
                return;
            }
            dVarF.f4131a = hVar;
            iVar.g();
        }
    }

    /* JADX INFO: compiled from: RoundRobinLoadBalancer.java */
    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Status f4127a;

        public b(Status status) {
            p.j(status, "status");
            this.f4127a = status;
        }

        @Override // io.grpc.i.h
        public final io.grpc.i.d a(C2250v0 c2250v0) {
            Status status = this.f4127a;
            return status.f() ? io.grpc.i.d.f36978e : io.grpc.i.d.a(status);
        }

        @Override // J9.i.e
        public final boolean b(e eVar) {
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                Status status = bVar.f4127a;
                Status status2 = this.f4127a;
                if (C.j(status2, status) || (status2.f() && bVar.f4127a.f())) {
                    return true;
                }
            }
            return false;
        }

        public final String toString() {
            com.google.common.base.d.a aVar = new com.google.common.base.d.a(b.class.getSimpleName());
            aVar.c(this.f4127a, "status");
            return aVar.toString();
        }
    }

    /* JADX INFO: compiled from: RoundRobinLoadBalancer.java */
    public static class c extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater<c> f4128c = AtomicIntegerFieldUpdater.newUpdater(c.class, "b");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f4129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile int f4130b;

        public c(int i10, ArrayList arrayList) {
            p.f("empty list", !arrayList.isEmpty());
            this.f4129a = arrayList;
            this.f4130b = i10 - 1;
        }

        @Override // io.grpc.i.h
        public final io.grpc.i.d a(C2250v0 c2250v0) {
            ArrayList arrayList = this.f4129a;
            int size = arrayList.size();
            AtomicIntegerFieldUpdater<c> atomicIntegerFieldUpdater = f4128c;
            int iIncrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (iIncrementAndGet >= size) {
                int i10 = iIncrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, iIncrementAndGet, i10);
                iIncrementAndGet = i10;
            }
            return io.grpc.i.d.b((io.grpc.i.g) arrayList.get(iIncrementAndGet), null);
        }

        @Override // J9.i.e
        public final boolean b(e eVar) {
            if (!(eVar instanceof c)) {
                return false;
            }
            c cVar = (c) eVar;
            if (cVar != this) {
                ArrayList arrayList = this.f4129a;
                if (arrayList.size() != cVar.f4129a.size() || !new HashSet(arrayList).containsAll(cVar.f4129a)) {
                    return false;
                }
            }
            return true;
        }

        public final String toString() {
            com.google.common.base.d.a aVar = new com.google.common.base.d.a(c.class.getSimpleName());
            aVar.c(this.f4129a, AttributeType.LIST);
            return aVar.toString();
        }
    }

    /* JADX INFO: compiled from: RoundRobinLoadBalancer.java */
    public static final class d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public D9.h f4131a;

        public d() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: RoundRobinLoadBalancer.java */
    public static abstract class e extends io.grpc.i.h {
        public abstract boolean b(e eVar);
    }

    public i(io.grpc.i.c cVar) {
        this.f4120c = cVar;
    }

    public static d<D9.h> f(io.grpc.i.g gVar) {
        io.grpc.a aVarC = gVar.c();
        d<D9.h> dVar = (d) aVarC.f36933a.get(f4118h);
        p.j(dVar, "STATE_INFO");
        return dVar;
    }

    @Override // io.grpc.i
    public final boolean a(io.grpc.i.f fVar) {
        List<io.grpc.d> list = fVar.f36983a;
        if (list.isEmpty()) {
            c(Status.f36905l.h("NameResolver returned no usable address. addrs=" + list + ", attrs=" + fVar.f36984b));
            return false;
        }
        HashMap map = this.f4121d;
        Set setKeySet = map.keySet();
        HashMap map2 = new HashMap(list.size() * 2);
        for (io.grpc.d dVar : list) {
            map2.put(new io.grpc.d(dVar.f36959a, io.grpc.a.f36932b), dVar);
        }
        Set setKeySet2 = map2.keySet();
        HashSet hashSet = new HashSet(setKeySet);
        hashSet.removeAll(setKeySet2);
        for (Map.Entry entry : map2.entrySet()) {
            io.grpc.d dVar2 = (io.grpc.d) entry.getKey();
            io.grpc.d dVar3 = (io.grpc.d) entry.getValue();
            io.grpc.i.g gVar = (io.grpc.i.g) map.get(dVar2);
            if (gVar != null) {
                gVar.i(Collections.singletonList(dVar3));
            } else {
                io.grpc.a aVar = io.grpc.a.f36932b;
                io.grpc.a.b<d<D9.h>> bVar = f4118h;
                D9.h hVarA = D9.h.a(ConnectivityState.f36870e);
                d dVar4 = new d();
                dVar4.f4131a = hVarA;
                IdentityHashMap identityHashMap = new IdentityHashMap(1);
                identityHashMap.put(bVar, dVar4);
                io.grpc.i.a.C0389a c0389aA = io.grpc.i.a.a();
                c0389aA.f36975a = Collections.singletonList(dVar3);
                for (Map.Entry<io.grpc.a.b<?>, Object> entry2 : aVar.f36933a.entrySet()) {
                    if (!identityHashMap.containsKey(entry2.getKey())) {
                        identityHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                io.grpc.a aVar2 = new io.grpc.a(identityHashMap);
                c0389aA.f36976b = aVar2;
                io.grpc.i.g gVarA = this.f4120c.a(new io.grpc.i.a(c0389aA.f36975a, aVar2, c0389aA.f36977c));
                p.j(gVarA, "subchannel");
                gVarA.h(new a(gVarA));
                map.put(dVar2, gVarA);
                gVarA.f();
            }
        }
        ArrayList<io.grpc.i.g> arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add((io.grpc.i.g) map.remove((io.grpc.d) it.next()));
        }
        g();
        for (io.grpc.i.g gVar2 : arrayList) {
            gVar2.g();
            f(gVar2).f4131a = D9.h.a(ConnectivityState.f36871f);
        }
        return true;
    }

    @Override // io.grpc.i
    public final void c(Status status) {
        if (this.f4123f != ConnectivityState.f36868c) {
            h(ConnectivityState.f36869d, new b(status));
        }
    }

    @Override // io.grpc.i
    public final void e() {
        HashMap map = this.f4121d;
        for (io.grpc.i.g gVar : map.values()) {
            gVar.g();
            f(gVar).f4131a = D9.h.a(ConnectivityState.f36871f);
        }
        map.clear();
    }

    public final void g() {
        ConnectivityState connectivityState;
        ConnectivityState connectivityState2;
        HashMap map = this.f4121d;
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList(collectionValues.size());
        Iterator it = collectionValues.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            connectivityState = ConnectivityState.f36868c;
            if (!zHasNext) {
                break;
            }
            io.grpc.i.g gVar = (io.grpc.i.g) it.next();
            if (f(gVar).f4131a.f2882a == connectivityState) {
                arrayList.add(gVar);
            }
        }
        if (!arrayList.isEmpty()) {
            h(connectivityState, new c(this.f4122e.nextInt(arrayList.size()), arrayList));
            return;
        }
        Iterator it2 = map.values().iterator();
        Status status = f4119i;
        boolean z10 = false;
        Status status2 = status;
        while (true) {
            boolean zHasNext2 = it2.hasNext();
            connectivityState2 = ConnectivityState.f36867b;
            if (!zHasNext2) {
                break;
            }
            D9.h hVar = f((io.grpc.i.g) it2.next()).f4131a;
            ConnectivityState connectivityState3 = hVar.f2882a;
            if (connectivityState3 == connectivityState2 || connectivityState3 == ConnectivityState.f36870e) {
                z10 = true;
            }
            if (status2 == status || !status2.f()) {
                status2 = hVar.f2883b;
            }
        }
        if (!z10) {
            connectivityState2 = ConnectivityState.f36869d;
        }
        h(connectivityState2, new b(status2));
    }

    public final void h(ConnectivityState connectivityState, e eVar) {
        if (connectivityState == this.f4123f && eVar.b(this.f4124g)) {
            return;
        }
        this.f4120c.f(connectivityState, eVar);
        this.f4123f = connectivityState;
        this.f4124g = eVar;
    }
}
