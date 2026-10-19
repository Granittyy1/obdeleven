package io.ktor.utils.io;

import Ia.l;
import Ia.p;
import kotlinx.coroutines.A;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.z0;
import p293xa.r;

/* JADX INFO: compiled from: Coroutines.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final e a(A a10, kotlin.coroutines.e coroutineContext, boolean z10, p pVar) {
        kotlin.jvm.internal.i.e(a10, "<this>");
        kotlin.jvm.internal.i.e(coroutineContext, "coroutineContext");
        final ByteBufferChannel byteBufferChannel = new ByteBufferChannel(z10);
        z0 z0VarC = C2680e.c(a10, coroutineContext, null, new CoroutinesKt$launchChannel$job$1(true, byteBufferChannel, pVar, (AbstractC2712w) a10.getCoroutineContext().get(AbstractC2712w.f43614b), null), 2);
        z0VarC.B(new l<Throwable, r>() { // from class: io.ktor.utils.io.CoroutinesKt$launchChannel$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Throwable th) {
                byteBufferChannel.a(th);
                return r.f47939a;
            }
        });
        return new e(z0VarC, byteBufferChannel);
    }
}
