package K2;

import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: WorkLauncher.kt */
/* JADX INFO: loaded from: classes.dex */
public final class J implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f4139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S2.b f4140b;

    public J(r processor, S2.b workTaskExecutor) {
        kotlin.jvm.internal.i.e(processor, "processor");
        kotlin.jvm.internal.i.e(workTaskExecutor, "workTaskExecutor");
        this.f4139a = processor;
        this.f4140b = workTaskExecutor;
    }

    @Override // K2.I
    public final void a(x workSpecId, int i10) {
        kotlin.jvm.internal.i.e(workSpecId, "workSpecId");
        this.f4140b.d(new R2.v(this.f4139a, workSpecId, false, i10));
    }

    public final void c(x xVar, WorkerParameters.a aVar) {
        this.f4140b.d(new R2.u(this.f4139a, xVar, aVar));
    }
}
