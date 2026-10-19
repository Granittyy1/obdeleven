package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: kotlinx.coroutines.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2676c<T> extends AbstractC2672a<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Thread f43235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final U f43236f;

    public C2676c(kotlin.coroutines.e eVar, Thread thread, U u10) {
        super(eVar, true, true);
        this.f43235e = thread;
        this.f43236f = u10;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void z(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f43235e;
        if (kotlin.jvm.internal.i.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
