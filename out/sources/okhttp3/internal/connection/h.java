package okhttp3.internal.connection;

import java.net.Socket;
import p293xa.r;

/* JADX INFO: compiled from: RealConnectionPool.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends p184ob.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f45516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, String str) {
        super(str, true);
        this.f45516e = iVar;
    }

    @Override // p184ob.a
    public final long a() {
        i iVar = this.f45516e;
        long jNanoTime = System.nanoTime();
        int i10 = 0;
        long j = Long.MIN_VALUE;
        f fVar = null;
        int i11 = 0;
        for (f connection : iVar.f45520d) {
            kotlin.jvm.internal.i.d(connection, "connection");
            synchronized (connection) {
                if (iVar.b(connection, jNanoTime) > 0) {
                    i11++;
                } else {
                    i10++;
                    long j10 = jNanoTime - connection.f45513q;
                    if (j10 > j) {
                        fVar = connection;
                        j = j10;
                    }
                    r rVar = r.f47939a;
                }
            }
        }
        long j11 = iVar.f45517a;
        if (j < j11 && i10 <= 5) {
            if (i10 > 0) {
                return j11 - j;
            }
            if (i11 > 0) {
                return j11;
            }
            return -1L;
        }
        kotlin.jvm.internal.i.b(fVar);
        synchronized (fVar) {
            if (!fVar.f45512p.isEmpty()) {
                return 0L;
            }
            if (fVar.f45513q + j != jNanoTime) {
                return 0L;
            }
            fVar.j = true;
            iVar.f45520d.remove(fVar);
            Socket socket = fVar.f45501d;
            kotlin.jvm.internal.i.b(socket);
            p172nb.b.d(socket);
            if (!iVar.f45520d.isEmpty()) {
                return 0L;
            }
            iVar.f45518b.a();
            return 0L;
        }
    }
}
