package p058e7;

import T6.b;
import com.google.android.gms.internal.measurement.C1787c0;
import p123ja.o;
import p136ka.a;

/* JADX INFO: compiled from: SchedulerModule_ProvidesMainThreadSchedulerFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class F implements b<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1787c0 f34779a;

    public F(C1787c0 c1787c0) {
        this.f34779a = c1787c0;
    }

    @Override // p268va.a
    public final Object get() {
        this.f34779a.getClass();
        p136ka.b bVar = a.f42909a;
        if (bVar != null) {
            return bVar;
        }
        throw new NullPointerException("scheduler == null");
    }
}
