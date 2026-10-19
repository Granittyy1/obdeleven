package io.ktor.utils.io;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ByteReadChannelJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public interface ByteReadChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Companion f40586a = Companion.f40587a;

    /* JADX INFO: compiled from: ByteReadChannelJVM.kt */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f40587a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p293xa.g<a> f40588b = kotlin.a.a(new Ia.a<a>() { // from class: io.ktor.utils.io.ByteReadChannel$Companion$Empty$2
            @Override // Ia.a
            public final a invoke() {
                ByteBufferChannel byteBufferChannel = new ByteBufferChannel(false);
                byteBufferChannel.a(null);
                return byteBufferChannel;
            }
        });
    }

    boolean o(Throwable th);

    Object p(p074fa.a aVar, ContinuationImpl continuationImpl);

    Throwable q();

    int r();

    Object s(byte[] bArr, int i10, int i11, ContinuationImpl continuationImpl);

    Object t(long j, ContinuationImpl continuationImpl);

    boolean u();
}
