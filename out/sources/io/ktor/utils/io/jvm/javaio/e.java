package io.ktor.utils.io.jvm.javaio;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Pollers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e implements c<Thread> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f40650a = new e();

    @Override // io.ktor.utils.io.jvm.javaio.c
    public final void a(long j) {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    @Override // io.ktor.utils.io.jvm.javaio.c
    public final void b(Thread thread) {
        Thread token = thread;
        i.e(token, "token");
        LockSupport.unpark(token);
    }
}
