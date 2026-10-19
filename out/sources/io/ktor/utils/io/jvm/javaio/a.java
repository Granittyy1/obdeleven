package io.ktor.utils.io.jvm.javaio;

import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: Pollers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c<Thread> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40643a = new a();

    @Override // io.ktor.utils.io.jvm.javaio.c
    public final void a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LockSupport.parkNanos(j);
    }

    @Override // io.ktor.utils.io.jvm.javaio.c
    public final void b(Thread thread) {
        Thread token = thread;
        i.e(token, "token");
        LockSupport.unpark(token);
    }
}
