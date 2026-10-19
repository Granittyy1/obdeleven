package p040d1;

import kotlin.coroutines.e;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2702l0;

/* JADX INFO: compiled from: CloseableCoroutineScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements AutoCloseable, A {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f34478b;

    public a(e coroutineContext) {
        i.e(coroutineContext, "coroutineContext");
        this.f34478b = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C2702l0.b(this.f34478b, null);
    }

    @Override // kotlinx.coroutines.A
    public final e getCoroutineContext() {
        return this.f34478b;
    }
}
