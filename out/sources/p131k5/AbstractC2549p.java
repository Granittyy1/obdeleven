package p131k5;

import U4.C0804l;
import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC1801e0;

/* JADX INFO: renamed from: k5.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2549p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile HandlerC1801e0 f42356d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E1 f42357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RunnableC2545o f42358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f42359c;

    public AbstractC2549p(E1 e10) {
        C0804l.h(e10);
        this.f42357a = e10;
        this.f42358b = new RunnableC2545o(this, 0, e10);
    }

    public final void a() {
        this.f42359c = 0L;
        d().removeCallbacks(this.f42358b);
    }

    public final void b(long j) {
        a();
        if (j >= 0) {
            this.f42357a.x().getClass();
            this.f42359c = System.currentTimeMillis();
            if (d().postDelayed(this.f42358b, j)) {
                return;
            }
            this.f42357a.d().f41712f.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public abstract void c();

    public final Handler d() {
        HandlerC1801e0 handlerC1801e0;
        if (f42356d != null) {
            return f42356d;
        }
        synchronized (AbstractC2549p.class) {
            try {
                if (f42356d == null) {
                    f42356d = new HandlerC1801e0(this.f42357a.a().getMainLooper());
                }
                handlerC1801e0 = f42356d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handlerC1801e0;
    }
}
