package io.grpc;

import io.grpc.internal.C2248u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: LoadBalancerRegistry.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f37775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static k f37776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f37777e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet<j> f37778a = new LinkedHashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap<String, j> f37779b = new LinkedHashMap<>();

    /* JADX INFO: compiled from: LoadBalancerRegistry.java */
    public static final class a implements r.a<j> {
        @Override // io.grpc.r.a
        public final boolean a(j jVar) {
            return jVar.d();
        }

        @Override // io.grpc.r.a
        public final int b(j jVar) {
            return jVar.c();
        }
    }

    static {
        Logger logger = Logger.getLogger(k.class.getName());
        f37775c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z10 = C2248u0.f37699b;
            arrayList.add(C2248u0.class);
        } catch (ClassNotFoundException e10) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e10);
        }
        try {
            int i10 = J9.j.f4132b;
            arrayList.add(J9.j.class);
        } catch (ClassNotFoundException e11) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e11);
        }
        f37777e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized k a() {
        try {
            if (f37776d == null) {
                List<j> listA = r.a(j.class, f37777e, j.class.getClassLoader(), new a());
                f37776d = new k();
                for (j jVar : listA) {
                    f37775c.fine("Service loader found " + jVar);
                    k kVar = f37776d;
                    synchronized (kVar) {
                        A8.p.f("isAvailable() returned false", jVar.d());
                        kVar.f37778a.add(jVar);
                    }
                }
                f37776d.c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f37776d;
    }

    public final synchronized j b(String str) {
        LinkedHashMap<String, j> linkedHashMap;
        linkedHashMap = this.f37779b;
        A8.p.j(str, "policy");
        return linkedHashMap.get(str);
    }

    public final synchronized void c() {
        try {
            this.f37779b.clear();
            for (j jVar : this.f37778a) {
                String strB = jVar.b();
                j jVar2 = this.f37779b.get(strB);
                if (jVar2 == null || jVar2.c() < jVar.c()) {
                    this.f37779b.put(strB, jVar);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
