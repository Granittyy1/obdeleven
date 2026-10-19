package p131k5;

import android.os.Bundle;

/* JADX INFO: renamed from: k5.s2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2563s2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f42451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2559r2 f42452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2559r2 f42453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f42454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2567t2 f42455f;

    public RunnableC2563s2(C2567t2 c2567t2, Bundle bundle, C2559r2 c2559r2, C2559r2 c2559r3, long j) {
        this.f42451b = bundle;
        this.f42452c = c2559r2;
        this.f42453d = c2559r3;
        this.f42454e = j;
        this.f42455f = c2567t2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = this.f42451b;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        C2567t2 c2567t2 = this.f42455f;
        c2567t2.B(this.f42452c, this.f42453d, this.f42454e, true, c2567t2.o().B("screen_view", bundle, null, false));
    }
}
