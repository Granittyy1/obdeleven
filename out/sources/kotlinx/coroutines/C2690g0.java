package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: kotlinx.coroutines.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2690g0 extends AbstractC2698j0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43441g = AtomicIntegerFieldUpdater.newUpdater(C2690g0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC2681e0 f43442f;

    public C2690g0(InterfaceC2681e0 interfaceC2681e0) {
        this.f43442f = interfaceC2681e0;
    }

    @Override // kotlinx.coroutines.InterfaceC2681e0
    public final void a(Throwable th) {
        if (f43441g.compareAndSet(this, 0, 1)) {
            this.f43442f.a(th);
        }
    }
}
