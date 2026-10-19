package io.ktor.util.pipeline;

import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: StackWalkingFailedFrame.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Aa.b, kotlin.coroutines.c<?> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f40566b = new g();

    @Override // Aa.b
    public final Aa.b getCallerFrame() {
        return null;
    }

    @Override // kotlin.coroutines.c
    public final kotlin.coroutines.e getContext() {
        return EmptyCoroutineContext.f43032b;
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        f.f40565a.getClass();
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
