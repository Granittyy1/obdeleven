package R2;

import android.content.Context;
import androidx.work.impl.utils.futures.AbstractFuture;
import java.util.UUID;

/* JADX INFO: compiled from: WorkForegroundUpdater.java */
/* JADX INFO: loaded from: classes.dex */
public final class B implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.utils.futures.a f5199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UUID f5200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.work.e f5201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f5202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C f5203f;

    public B(C c10, androidx.work.impl.utils.futures.a aVar, UUID uuid, androidx.work.e eVar, Context context) {
        this.f5203f = c10;
        this.f5199b = aVar;
        this.f5200c = uuid;
        this.f5201d = eVar;
        this.f5202e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!(this.f5199b.f20427b instanceof AbstractFuture.b)) {
                String string = this.f5200c.toString();
                Q2.z zVarT = this.f5203f.f5206c.t(string);
                if (zVarT == null || zVarT.f5037b.a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                this.f5203f.f5205b.f(string, this.f5201d);
                this.f5202e.startService(P2.b.c(this.f5202e, Lb.a.g(zVarT), this.f5201d));
            }
            this.f5199b.k(null);
        } catch (Throwable th) {
            this.f5199b.l(th);
        }
    }
}
