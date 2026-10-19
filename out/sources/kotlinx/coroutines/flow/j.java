package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements InterfaceC2686c<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelFlowTransformLatest f43409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ia.p f43410c;

    public j(ChannelFlowTransformLatest channelFlowTransformLatest, Ia.p pVar) {
        this.f43409b = channelFlowTransformLatest;
        this.f43410c = pVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super Object> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objCollect = this.f43409b.collect(new FlowKt__LimitKt$dropWhile$1$1(new Ref$BooleanRef(), interfaceC2687d, this.f43410c), cVar);
        return objCollect == CoroutineSingletons.f43038b ? objCollect : p293xa.r.f47939a;
    }
}
