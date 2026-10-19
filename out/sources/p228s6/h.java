package p228s6;

import A8.A;
import H7.b;
import K6.a;
import P6.c;
import P6.d;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.messaging.RunnableC2056t;
import com.google.firebase.messaging.RunnableC2057u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ComponentRuntime.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements b, a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f46949h = new e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f46950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f46951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f46952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f46953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f46954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<Boolean> f46955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f46956g;

    public h(ArrayList arrayList, ArrayList arrayList2, b bVar) {
        UiExecutor uiExecutor = UiExecutor.f28070b;
        this.f46950a = new HashMap();
        this.f46951b = new HashMap();
        this.f46952c = new HashMap();
        this.f46953d = new HashSet();
        this.f46955f = new AtomicReference<>();
        k kVar = new k();
        this.f46954e = kVar;
        this.f46956g = bVar;
        ArrayList<a> arrayList3 = new ArrayList();
        arrayList3.add(a.c(kVar, k.class, d.class, c.class));
        arrayList3.add(a.c(this, a.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((p096h7.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f46956g.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException unused) {
                    it3.remove();
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((a) it4.next()).f46931b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f46953d.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.f46953d.add(obj.toString());
                    }
                }
            }
            if (this.f46950a.isEmpty()) {
                i.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f46950a.keySet());
                arrayList6.addAll(arrayList3);
                i.a(arrayList6);
            }
            for (final a aVar2 : arrayList3) {
                this.f46950a.put(aVar2, new l(new p096h7.b() { // from class: s6.f
                    @Override // p096h7.b
                    public final Object get() {
                        h hVar = this.f46946a;
                        hVar.getClass();
                        a aVar3 = aVar2;
                        return aVar3.f46935f.f(new q(aVar3, hVar));
                    }
                }));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = this.f46955f.get();
        if (bool != null) {
            i(this.f46950a, bool.booleanValue());
        }
    }

    @Override // p228s6.b
    public final synchronized <T> p096h7.b<Set<T>> b(p<T> pVar) {
        m mVar = (m) this.f46952c.get(pVar);
        if (mVar != null) {
            return mVar;
        }
        return f46949h;
    }

    @Override // p228s6.b
    public final <T> p096h7.a<T> f(p<T> pVar) {
        p096h7.b<T> bVarG = g(pVar);
        if (bVarG == null) {
            return new o(o.f46973c, o.f46974d);
        }
        return bVarG instanceof o ? (o) bVarG : new o(null, bVarG);
    }

    @Override // p228s6.b
    public final synchronized <T> p096h7.b<T> g(p<T> pVar) {
        A.d(pVar, "Null interface requested.");
        return (p096h7.b) this.f46951b.get(pVar);
    }

    public final void i(HashMap map, boolean z10) {
        ArrayDeque<P6.a> arrayDeque;
        Set<Map.Entry> setEmptySet;
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getKey();
            p096h7.b bVar = (p096h7.b) entry.getValue();
            int i10 = aVar.f46933d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar.get();
            }
        }
        k kVar = this.f46954e;
        synchronized (kVar) {
            arrayDeque = kVar.f46966b;
            if (arrayDeque != null) {
                kVar.f46966b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            for (P6.a aVar2 : arrayDeque) {
                aVar2.getClass();
                synchronized (kVar) {
                    try {
                        ArrayDeque arrayDeque2 = kVar.f46966b;
                        if (arrayDeque2 != null) {
                            arrayDeque2.add(aVar2);
                        } else {
                            synchronized (kVar) {
                                try {
                                    Map map2 = (Map) kVar.f46965a.get(null);
                                    setEmptySet = map2 == null ? Collections.emptySet() : map2.entrySet();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            for (Map.Entry entry2 : setEmptySet) {
                                ((Executor) entry2.getValue()).execute(new com.voltasit.obdeleven.presentation.history.child.b(entry2, 3, aVar2));
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void j() {
        for (a aVar : this.f46950a.keySet()) {
            for (j jVar : aVar.f46932c) {
                boolean z10 = jVar.f46963b == 2;
                p<?> pVar = jVar.f46962a;
                if (z10) {
                    HashMap map = this.f46952c;
                    if (!map.containsKey(pVar)) {
                        Set setEmptySet = Collections.emptySet();
                        m mVar = new m();
                        mVar.f46972b = null;
                        mVar.f46971a = Collections.newSetFromMap(new ConcurrentHashMap());
                        mVar.f46971a.addAll(setEmptySet);
                        map.put(pVar, mVar);
                    }
                }
                HashMap map2 = this.f46951b;
                if (map2.containsKey(pVar)) {
                    continue;
                } else {
                    int i10 = jVar.f46963b;
                    if (i10 == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + aVar + ": " + pVar);
                    }
                    if (i10 != 2) {
                        map2.put(pVar, new o(o.f46973c, o.f46974d));
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f46934e == 0) {
                p096h7.b bVar = (p096h7.b) this.f46950a.get(aVar);
                Iterator it2 = aVar.f46931b.iterator();
                while (it2.hasNext()) {
                    p pVar = (p) it2.next();
                    HashMap map = this.f46951b;
                    if (map.containsKey(pVar)) {
                        arrayList2.add(new RunnableC2056t((o) ((p096h7.b) map.get(pVar)), 4, bVar));
                    } else {
                        map.put(pVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f46950a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f46934e != 0) {
                p096h7.b bVar = (p096h7.b) entry.getValue();
                Iterator it = aVar.f46931b.iterator();
                while (it.hasNext()) {
                    p pVar = (p) it.next();
                    if (!map.containsKey(pVar)) {
                        map.put(pVar, new HashSet());
                    }
                    ((Set) map.get(pVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            HashMap map2 = this.f46952c;
            if (map2.containsKey(key)) {
                m mVar = (m) map2.get(entry2.getKey());
                Iterator it2 = ((Set) entry2.getValue()).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new RunnableC2057u(mVar, 2, (p096h7.b) it2.next()));
                }
            } else {
                p pVar2 = (p) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                m mVar2 = new m();
                mVar2.f46972b = null;
                mVar2.f46971a = Collections.newSetFromMap(new ConcurrentHashMap());
                mVar2.f46971a.addAll(set);
                map2.put(pVar2, mVar2);
            }
        }
        return arrayList;
    }
}
