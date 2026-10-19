package kotlinx.coroutines.sync;

import Ia.p;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class SemaphoreImpl$addAcquireToQueue$createNewSegment$1 extends FunctionReferenceImpl implements p<Long, e, e> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SemaphoreImpl$addAcquireToQueue$createNewSegment$1 f43601b = new SemaphoreImpl$addAcquireToQueue$createNewSegment$1();

    public SemaphoreImpl$addAcquireToQueue$createNewSegment$1() {
        super(2, d.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // Ia.p
    public final e invoke(Long l10, e eVar) {
        int i10 = d.f43604a;
        return new e(l10.longValue(), eVar, 0);
    }
}
