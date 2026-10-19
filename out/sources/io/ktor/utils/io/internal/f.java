package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ReadWriteBufferState.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f40627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f40628b;

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        i.d(byteBufferAllocate, "allocate(0)");
        f40627a = byteBufferAllocate;
        f40628b = new g(0);
    }
}
