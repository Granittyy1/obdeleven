package Sa;

import kotlinx.coroutines.Y;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
public class e extends Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScheduler f5708c;

    public e(String str, int i10, long j, int i11) {
        this.f5708c = new CoroutineScheduler(str, i10, j, i11);
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final void Z0(kotlin.coroutines.e eVar, Runnable runnable) {
        CoroutineScheduler.h(this.f5708c, runnable, false, 6);
    }

    @Override // kotlinx.coroutines.AbstractC2712w
    public final void a1(kotlin.coroutines.e eVar, Runnable runnable) {
        CoroutineScheduler.h(this.f5708c, runnable, true, 2);
    }
}
