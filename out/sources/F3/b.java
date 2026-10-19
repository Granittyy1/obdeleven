package F3;

import com.google.android.gms.internal.measurement.M1;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: DiskCacheWriteLocker.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3210a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0034b f3211b = new C0034b();

    /* JADX INFO: compiled from: DiskCacheWriteLocker.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReentrantLock f3212a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3213b;
    }

    /* JADX INFO: renamed from: F3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DiskCacheWriteLocker.java */
    public static class C0034b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque f3214a = new ArrayDeque();
    }

    public final void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                Object obj = this.f3210a.get(str);
                M1.d(obj, "Argument must not be null");
                aVar = (a) obj;
                int i10 = aVar.f3213b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f3213b);
                }
                int i11 = i10 - 1;
                aVar.f3213b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f3210a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    C0034b c0034b = this.f3211b;
                    synchronized (c0034b.f3214a) {
                        try {
                            if (c0034b.f3214a.size() < 10) {
                                c0034b.f3214a.offer(aVar2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f3212a.unlock();
    }
}
