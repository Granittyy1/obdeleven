package androidx.paging;

import kotlinx.coroutines.flow.InterfaceC2686c;
import kotlinx.coroutines.flow.InterfaceC2687d;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FlowExtKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f19234a = new Object();

    public static final <T, R> InterfaceC2686c<R> a(InterfaceC2686c<? extends T> interfaceC2686c, Ia.q<? super InterfaceC2687d<? super R>, ? super T, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> qVar) {
        kotlin.jvm.internal.i.e(interfaceC2686c, "<this>");
        return SimpleChannelFlowKt.a(new FlowExtKt$simpleTransformLatest$1(interfaceC2686c, qVar, null));
    }
}
