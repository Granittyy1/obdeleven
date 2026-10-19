package H4;

import I4.u;
import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;

/* JADX INFO: compiled from: SchedulingModule_WorkSchedulerFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class g implements E4.b<u> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E4.c f3727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p268va.a<J4.d> f3728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f3729c;

    public g(E4.c cVar, p268va.a aVar, f fVar) {
        this.f3727a = cVar;
        this.f3728b = aVar;
        this.f3729c = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p268va.a
    public final Object get() {
        return new I4.b((Context) this.f3727a.f3085a, this.f3728b.get(), (SchedulerConfig) this.f3729c.get());
    }
}
