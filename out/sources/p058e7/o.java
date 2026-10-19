package p058e7;

import T6.b;
import com.google.android.gms.internal.measurement.C1787c0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ExecutorsModule_ProvidesBlockingExecutorFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements b<Executor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f34814a;

    public o(m mVar) {
        this.f34814a = mVar;
    }

    @Override // p268va.a
    public final Object get() {
        Executor executor = this.f34814a.f34811b;
        C1787c0.f(executor);
        return executor;
    }
}
