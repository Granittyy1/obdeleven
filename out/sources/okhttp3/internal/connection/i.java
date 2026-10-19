package okhttp3.internal.connection;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.C2750a;
import p293xa.r;

/* JADX INFO: compiled from: RealConnectionPool.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p184ob.c f45518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f45519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentLinkedQueue<f> f45520d;

    public i(p184ob.d taskRunner, TimeUnit timeUnit) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        this.f45517a = timeUnit.toNanos(5L);
        this.f45518b = taskRunner.e();
        this.f45519c = new h(this, Q8.d.a(new StringBuilder(), p172nb.b.f45032g, " ConnectionPool"));
        this.f45520d = new ConcurrentLinkedQueue<>();
    }

    public final boolean a(C2750a c2750a, e call, ArrayList arrayList, boolean z10) {
        kotlin.jvm.internal.i.e(call, "call");
        Iterator<f> it = this.f45520d.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            f connection = it.next();
            kotlin.jvm.internal.i.d(connection, "connection");
            synchronized (connection) {
                if (z10) {
                    if (connection.f45504g != null) {
                    }
                    r rVar = r.f47939a;
                }
                if (connection.h(c2750a, arrayList)) {
                    call.b(connection);
                    return true;
                }
                r rVar2 = r.f47939a;
            }
        }
    }

    public final int b(f fVar, long j) {
        byte[] bArr = p172nb.b.f45026a;
        ArrayList arrayList = fVar.f45512p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                String str = "A connection to " + fVar.f45499b.f45278a.f45308h + " was leaked. Did you forget to close a response body?";
                p244tb.h hVar = p244tb.h.f47384a;
                p244tb.h.f47384a.k(((e.b) reference).f45497a, str);
                arrayList.remove(i10);
                fVar.j = true;
                if (arrayList.isEmpty()) {
                    fVar.f45513q = j - this.f45517a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
