package p294xb;

import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.i;
import okio.ByteString;
import p005a4.q;
import p184ob.a;
import p293xa.r;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f47981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f47982f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, d dVar, long j) {
        super(str, true);
        this.f47981e = dVar;
        this.f47982f = j;
    }

    @Override // p184ob.a
    public final long a() {
        j jVar;
        d dVar = this.f47981e;
        synchronized (dVar) {
            try {
                if (!dVar.f47968t && (jVar = dVar.j) != null) {
                    int i10 = dVar.f47970v ? dVar.f47969u : -1;
                    dVar.f47969u++;
                    dVar.f47970v = true;
                    r rVar = r.f47939a;
                    if (i10 != -1) {
                        StringBuilder sb2 = new StringBuilder("sent ping but didn't receive pong within ");
                        sb2.append(dVar.f47952c);
                        sb2.append("ms (after ");
                        dVar.b(new SocketTimeoutException(q.c(sb2, i10 - 1, " successful ping/pongs)")), null);
                    } else {
                        try {
                            ByteString payload = ByteString.f45705d;
                            i.e(payload, "payload");
                            jVar.b(9, payload);
                        } catch (IOException e10) {
                            dVar.b(e10, null);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f47982f;
    }
}
