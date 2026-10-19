package io.ktor.utils.io;

import kotlinx.coroutines.A;

/* JADX INFO: compiled from: Coroutines.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f implements A, j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f40598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f40599c;

    public f(A delegate, a channel) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        kotlin.jvm.internal.i.e(channel, "channel");
        this.f40598b = channel;
        this.f40599c = delegate;
    }

    @Override // io.ktor.utils.io.j
    public final a R() {
        return this.f40598b;
    }

    @Override // kotlinx.coroutines.A
    public final kotlin.coroutines.e getCoroutineContext() {
        return this.f40599c.getCoroutineContext();
    }
}
