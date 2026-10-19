package io.ktor.utils.io.internal;

import io.ktor.utils.io.pool.DefaultPool;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ObjectPool.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f40609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p086ga.b f40610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f40611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f40612d;

    /* JADX INFO: compiled from: ObjectPool.kt */
    public static final class a extends p086ga.c<e.c> {
        @Override // p086ga.d
        public final Object y() {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(d.f40609a);
            i.d(byteBufferAllocateDirect, "allocateDirect(BUFFER_SIZE)");
            return new e.c(8, byteBufferAllocateDirect);
        }
    }

    /* JADX INFO: compiled from: ObjectPool.kt */
    public static final class b extends DefaultPool<e.c> {
        @Override // io.ktor.utils.io.pool.DefaultPool
        public final void i(e.c cVar) {
            e.c instance = cVar;
            i.e(instance, "instance");
            d.f40610b.H0(instance.f40613a);
        }

        @Override // io.ktor.utils.io.pool.DefaultPool
        public final e.c j() {
            return new e.c(8, d.f40610b.y());
        }
    }

    static {
        int iC = p019b6.d.c(4096, "BufferSize");
        f40609a = iC;
        int iC2 = p019b6.d.c(2048, "BufferPoolSize");
        int iC3 = p019b6.d.c(1024, "BufferObjectPoolSize");
        f40610b = new p086ga.b(iC2, iC);
        f40611c = new b(iC3);
        f40612d = new a();
    }
}
