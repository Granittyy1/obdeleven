package io.grpc.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: SharedResourceHolder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class L0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final L0 f37264d = new L0(new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentityHashMap<c<?>, b> f37265a = new IdentityHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f37266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledExecutorService f37267c;

    /* JADX INFO: compiled from: SharedResourceHolder.java */
    public class a {
    }

    /* JADX INFO: compiled from: SharedResourceHolder.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f37268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f37269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ScheduledFuture<?> f37270c;

        public b(Object obj) {
            this.f37268a = obj;
        }
    }

    /* JADX INFO: compiled from: SharedResourceHolder.java */
    public interface c<T> {
        T a();

        void b(T t8);
    }

    public L0(a aVar) {
        this.f37266b = aVar;
    }

    public static <T> T a(c<T> cVar) {
        T t8;
        L0 l10 = f37264d;
        synchronized (l10) {
            try {
                b bVar = l10.f37265a.get(cVar);
                if (bVar == null) {
                    bVar = new b(cVar.a());
                    l10.f37265a.put(cVar, bVar);
                }
                ScheduledFuture<?> scheduledFuture = bVar.f37270c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    bVar.f37270c = null;
                }
                bVar.f37269b++;
                t8 = (T) bVar.f37268a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return t8;
    }

    public static void b(c cVar, Object obj) {
        L0 l10 = f37264d;
        synchronized (l10) {
            try {
                b bVar = l10.f37265a.get(cVar);
                if (bVar == null) {
                    throw new IllegalArgumentException("No cached instance found for " + cVar);
                }
                A8.p.f("Releasing the wrong instance", obj == bVar.f37268a);
                A8.p.p("Refcount has already reached zero", bVar.f37269b > 0);
                int i10 = bVar.f37269b - 1;
                bVar.f37269b = i10;
                if (i10 == 0) {
                    A8.p.p("Destroy task already scheduled", bVar.f37270c == null);
                    if (l10.f37267c == null) {
                        l10.f37266b.getClass();
                        l10.f37267c = Executors.newSingleThreadScheduledExecutor(GrpcUtil.e("grpc-shared-destroyer-%d"));
                    }
                    bVar.f37270c = l10.f37267c.schedule(new RunnableC2221g0(new M0(l10, bVar, cVar, obj)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
