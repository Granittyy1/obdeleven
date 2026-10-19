package p279w9;

import android.util.LruCache;
import java.util.Map;
import p255u9.E;

/* JADX INFO: compiled from: CacheHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LruCache<String, a> f47824a;

    /* JADX INFO: compiled from: CacheHelper.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f47825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f47826b;

        public a(Object obj, long j) {
            this.f47826b = obj;
            this.f47825a = System.currentTimeMillis() + j;
        }
    }

    public final synchronized void a(p279w9.a aVar) {
        this.f47824a.remove(aVar.f47822a);
    }

    public final synchronized void b() {
        this.f47824a.evictAll();
    }

    public final synchronized void c(p279w9.a aVar) {
        for (Map.Entry<String, a> entry : this.f47824a.snapshot().entrySet()) {
            if (entry.getKey() != null && entry.getKey().startsWith(aVar.f47822a)) {
                this.f47824a.remove(entry.getKey());
            }
        }
    }

    public final void d() {
        E.a().clearCachedResult();
        c(p279w9.a.f47807d);
        synchronized (this) {
            this.f47824a.remove("DEFAULT_CAR");
        }
        synchronized (this) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("VEHICLE_LIST");
                int i11 = i10 + 1;
                sb2.append(i10);
                String string = sb2.toString();
                if (this.f47824a.get(string) != null) {
                    this.f47824a.remove(string);
                    i10 = i11;
                }
            }
        }
        c(p279w9.a.f47817o);
    }

    public final synchronized <T> T e(p279w9.a aVar) {
        return (T) f(aVar, false);
    }

    public final synchronized <T> T f(p279w9.a aVar, boolean z10) {
        if (aVar == null) {
            return null;
        }
        if (aVar.f47823b <= 0) {
            return null;
        }
        a aVar2 = this.f47824a.get(aVar.f47822a);
        if (aVar2 != null) {
            if (!(System.currentTimeMillis() > aVar2.f47825a) || z10) {
                return (T) aVar2.f47826b;
            }
        }
        return null;
    }

    public final synchronized boolean g(p279w9.a aVar) {
        boolean z10 = true;
        if (aVar.f47823b <= 0) {
            return true;
        }
        a aVar2 = this.f47824a.get(aVar.f47822a);
        if (aVar2 != null) {
            if (!(System.currentTimeMillis() > aVar2.f47825a)) {
                z10 = false;
            }
        }
        return z10;
    }

    public final synchronized void h(p279w9.a aVar, Object obj) {
        long j = aVar.f47823b;
        if (j <= 0) {
            return;
        }
        this.f47824a.put(aVar.f47822a, new a(obj, j));
    }
}
