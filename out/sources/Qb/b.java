package Qb;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ScopeRegistry.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pb.b f5141c = new Pb.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<Pb.a> f5142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final org.koin.core.scope.a f5143b;

    /* JADX INFO: compiled from: ScopeRegistry.kt */
    public static final class a {
        public static Pb.b a() {
            return b.f5141c;
        }
    }

    public b(Ib.a _koin) {
        i.e(_koin, "_koin");
        HashSet<Pb.a> hashSet = new HashSet<>();
        this.f5142a = hashSet;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Pb.b bVar = f5141c;
        org.koin.core.scope.a aVar = new org.koin.core.scope.a(bVar, _koin);
        this.f5143b = aVar;
        hashSet.add(bVar);
        concurrentHashMap.put("_root_", aVar);
    }
}
