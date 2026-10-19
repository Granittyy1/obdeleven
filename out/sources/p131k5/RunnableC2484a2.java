package p131k5;

import com.google.android.gms.measurement.internal.e;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: k5.a2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@21.6.1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2484a2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f42081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f42082c;

    public RunnableC2484a2(e eVar, long j) {
        this.f42081b = j;
        this.f42082c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.f42081b;
        e eVar = this.f42082c;
        eVar.z(j, true);
        ((C2523i1) eVar.f3968a).r().y(new AtomicReference<>());
    }
}
