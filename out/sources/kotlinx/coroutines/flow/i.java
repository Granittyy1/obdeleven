package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements InterfaceC2686c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f43371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f43372c;

    public i(v vVar, int i10) {
        this.f43371b = vVar;
        this.f43372c = i10;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) throws Throwable {
        this.f43371b.collect(new FlowKt__LimitKt$drop$2$1(new Ref$IntRef(), this.f43372c, interfaceC2687d), cVar);
        return CoroutineSingletons.f43038b;
    }
}
