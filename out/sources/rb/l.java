package rb;

import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends p184ob.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f46608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f46609f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, d dVar, int i10, ErrorCode errorCode) {
        super(str, true);
        this.f46608e = dVar;
        this.f46609f = i10;
    }

    @Override // p184ob.a
    public final long a() {
        this.f46608e.f46558l.getClass();
        synchronized (this.f46608e) {
            this.f46608e.f46572z.remove(Integer.valueOf(this.f46609f));
            p293xa.r rVar = p293xa.r.f47939a;
        }
        return -1L;
    }
}
