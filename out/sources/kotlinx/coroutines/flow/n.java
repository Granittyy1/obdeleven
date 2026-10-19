package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements InterfaceC2686c<kotlin.collections.s<Object>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2686c f43413b;

    public n(InterfaceC2686c interfaceC2686c) {
        this.f43413b = interfaceC2686c;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC2686c
    public final Object collect(InterfaceC2687d<? super kotlin.collections.s<Object>> interfaceC2687d, kotlin.coroutines.c<? super p293xa.r> cVar) {
        Object objCollect = this.f43413b.collect(new FlowKt__TransformKt$withIndex$1$1(new Ref$IntRef(), interfaceC2687d), cVar);
        return objCollect == CoroutineSingletons.f43038b ? objCollect : p293xa.r.f47939a;
    }
}
