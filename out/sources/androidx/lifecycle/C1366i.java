package androidx.lifecycle;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.InterfaceC2686c;

/* JADX INFO: renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1366i {
    public static final CallbackFlowBuilder a(InterfaceC2686c interfaceC2686c, Lifecycle lifecycle) {
        Lifecycle.State state = Lifecycle.State.f17753f;
        kotlin.jvm.internal.i.e(interfaceC2686c, "<this>");
        kotlin.jvm.internal.i.e(lifecycle, "lifecycle");
        return new CallbackFlowBuilder(new FlowExtKt$flowWithLifecycle$1(lifecycle, state, interfaceC2686c, null), EmptyCoroutineContext.f43032b, -2, BufferOverflow.f43243b);
    }
}
