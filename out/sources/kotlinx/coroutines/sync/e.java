package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.v;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends v<e> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f43610f;

    public e(long j, e eVar, int i10) {
        super(j, eVar, i10);
        this.f43610f = new AtomicReferenceArray(d.f43609f);
    }

    @Override // kotlinx.coroutines.internal.v
    public final int g() {
        return d.f43609f;
    }

    @Override // kotlinx.coroutines.internal.v
    public final void h(int i10, kotlin.coroutines.e eVar) {
        this.f43610f.set(i10, d.f43608e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f43504d + ", hashCode=" + hashCode() + ']';
    }
}
