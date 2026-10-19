package p046d7;

import com.google.android.gms.internal.measurement.C1787c0;
import java.util.concurrent.Executor;
import p268va.a;

/* JADX INFO: compiled from: DaggerAppComponent.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements a<Executor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f34585a;

    public e(o oVar) {
        this.f34585a = oVar;
    }

    @Override // p268va.a
    public final Executor get() {
        Executor executor = this.f34585a.f34599C.get();
        C1787c0.e(executor);
        return executor;
    }
}
