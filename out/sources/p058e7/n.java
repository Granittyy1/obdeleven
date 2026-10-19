package p058e7;

import T6.b;
import com.google.android.gms.internal.measurement.C1787c0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ExecutorsModule_ProvidesBackgroundExecutorFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements b<Executor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f34813a;

    public n(m mVar) {
        this.f34813a = mVar;
    }

    @Override // p268va.a
    public final Object get() {
        Executor executor = this.f34813a.f34810a;
        C1787c0.f(executor);
        return executor;
    }
}
