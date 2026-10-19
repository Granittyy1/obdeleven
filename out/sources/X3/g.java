package X3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: LruCache.java */
/* JADX INFO: loaded from: classes.dex */
public class g<T, Y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7207a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7209c;

    public g(long j) {
        this.f7208b = j;
    }

    public final synchronized Y a(T t8) {
        return (Y) this.f7207a.get(t8);
    }

    public int b(Y y10) {
        return 1;
    }

    public final synchronized Y d(T t8, Y y10) {
        long jB = b(y10);
        if (jB >= this.f7208b) {
            c(t8, y10);
            return null;
        }
        if (y10 != null) {
            this.f7209c += jB;
        }
        Y y11 = (Y) this.f7207a.put(t8, y10);
        if (y11 != null) {
            this.f7209c -= (long) b(y11);
            if (!y11.equals(y10)) {
                c(t8, y11);
            }
        }
        e(this.f7208b);
        return y11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(long j) {
        while (this.f7209c > j) {
            Iterator it = this.f7207a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            this.f7209c -= (long) b(value);
            Object key = entry.getKey();
            it.remove();
            c(key, value);
        }
    }

    public void c(T t8, Y y10) {
    }
}
