package Z3;

import android.os.Handler;

/* JADX INFO: compiled from: RequestProgress.kt */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f7762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f7763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f7765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7767f;

    public G(Handler handler, r request) {
        kotlin.jvm.internal.i.e(request, "request");
        this.f7762a = handler;
        this.f7763b = request;
        q qVar = q.f7852a;
        p165n4.t.e();
        this.f7764c = q.f7859h.get();
    }

    public final void a() {
        long j = this.f7765d;
        if (j > this.f7766e) {
            r.b bVar = this.f7763b.f7879g;
            long j10 = this.f7767f;
            if (j10 <= 0 || !(bVar instanceof r.f)) {
                return;
            }
            Handler handler = this.f7762a;
            if ((handler == null ? null : Boolean.valueOf(handler.post(new F(bVar, j, j10)))) == null) {
                ((r.f) bVar).a();
            }
            this.f7766e = this.f7765d;
        }
    }
}
