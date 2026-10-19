package io.ktor.utils.io;

import Ia.l;
import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: ByteWriteChannel.kt */
/* JADX INFO: loaded from: classes.dex */
public interface d {
    boolean a(Throwable th);

    Object b(p074fa.a aVar, kotlin.coroutines.c cVar);

    Object d(byte[] bArr, int i10, SuspendLambda suspendLambda);

    Object e(int i10, l<? super ByteBuffer, r> lVar, kotlin.coroutines.c<? super r> cVar);

    boolean f();

    void flush();
}
