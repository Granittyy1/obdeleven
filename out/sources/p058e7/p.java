package p058e7;

import T6.b;
import com.google.android.gms.internal.measurement.C1787c0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ExecutorsModule_ProvidesLightWeightExecutorFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements b<Executor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f34815a;

    public p(m mVar) {
        this.f34815a = mVar;
    }

    @Override // p268va.a
    public final Object get() {
        Executor executor = this.f34815a.f34812c;
        C1787c0.f(executor);
        return executor;
    }
}
