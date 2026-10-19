package p228s6;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: CycleDetector.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: compiled from: CycleDetector.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p228s6.a<?> f46957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashSet f46958b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashSet f46959c = new HashSet();

        public a(p228s6.a<?> aVar) {
            this.f46957a = aVar;
        }
    }

    /* JADX INFO: compiled from: CycleDetector.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p<?> f46960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f46961b;

        public b() {
            throw null;
        }

        public b(p pVar, boolean z10) {
            this.f46960a = pVar;
            this.f46961b = z10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f46960a.equals(this.f46960a) && bVar.f46961b == this.f46961b;
        }

        public final int hashCode() {
            return ((this.f46960a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f46961b).hashCode();
        }
    }

    public static void a(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (a aVar : (Set) it2.next()) {
                        for (j jVar : aVar.f46957a.f46932c) {
                            if (jVar.f46964c == 0) {
                                Set<a> set = (Set) map.get(new b(jVar.f46962a, jVar.f46963b == 2));
                                if (set != null) {
                                    for (a aVar2 : set) {
                                        aVar.f46958b.add(aVar2);
                                        aVar2.f46959c.add(aVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<a> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (a aVar3 : hashSet) {
                    if (aVar3.f46959c.isEmpty()) {
                        hashSet2.add(aVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    a aVar4 = (a) hashSet2.iterator().next();
                    hashSet2.remove(aVar4);
                    i10++;
                    for (a aVar5 : aVar4.f46958b) {
                        aVar5.f46959c.remove(aVar4);
                        if (aVar5.f46959c.isEmpty()) {
                            hashSet2.add(aVar5);
                        }
                    }
                }
                if (i10 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (a aVar6 : hashSet) {
                    if (!aVar6.f46959c.isEmpty() && !aVar6.f46958b.isEmpty()) {
                        arrayList2.add(aVar6.f46957a);
                    }
                }
                throw new DependencyCycleException(arrayList2);
            }
            p228s6.a aVar7 = (p228s6.a) it.next();
            a aVar8 = new a(aVar7);
            Iterator it4 = aVar7.f46931b.iterator();
            while (it4.hasNext()) {
                p pVar = (p) it4.next();
                boolean z10 = aVar7.f46934e == 0;
                b bVar = new b(pVar, !z10);
                if (!map.containsKey(bVar)) {
                    map.put(bVar, new HashSet());
                }
                Set set2 = (Set) map.get(bVar);
                if (!set2.isEmpty() && z10) {
                    throw new IllegalArgumentException("Multiple components provide " + pVar + ".");
                }
                set2.add(aVar8);
            }
        }
    }
}
