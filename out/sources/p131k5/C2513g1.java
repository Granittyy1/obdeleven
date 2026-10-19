package p131k5;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: k5.g1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2513g1<V> extends FutureTask<V> implements Comparable<C2513g1<V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f42177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f42178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2493c1 f42179e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2513g1(C2493c1 c2493c1, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        this.f42179e = c2493c1;
        long andIncrement = C2493c1.f42109k.getAndIncrement();
        this.f42176b = andIncrement;
        this.f42178d = str;
        this.f42177c = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c2493c1.d().f41712f.c("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2513g1 c2513g1 = (C2513g1) obj;
        boolean z10 = c2513g1.f42177c;
        boolean z11 = this.f42177c;
        if (z11 != z10) {
            return z11 ? -1 : 1;
        }
        long j = c2513g1.f42176b;
        long j10 = this.f42176b;
        if (j10 < j) {
            return -1;
        }
        if (j10 > j) {
            return 1;
        }
        this.f42179e.d().f41713g.b(Long.valueOf(j10), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        B0 b0D = this.f42179e.d();
        b0D.f41712f.b(th, this.f42178d);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2513g1(C2493c1 c2493c1, Callable callable, boolean z10) {
        super(callable);
        this.f42179e = c2493c1;
        long andIncrement = C2493c1.f42109k.getAndIncrement();
        this.f42176b = andIncrement;
        this.f42178d = "Task exception on worker thread";
        this.f42177c = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c2493c1.d().f41712f.c("Tasks index overflow");
        }
    }
}
