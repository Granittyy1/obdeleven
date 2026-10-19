package io.ktor.util;

import io.ktor.utils.io.ByteReadChannel;
import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: ByteChannels.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [byte[], java.io.Serializable] */
    public static final Serializable a(ByteReadChannel byteReadChannel, ContinuationImpl continuationImpl) {
        ByteChannelsKt$toByteArray$1 byteChannelsKt$toByteArray$1;
        if (continuationImpl instanceof ByteChannelsKt$toByteArray$1) {
            byteChannelsKt$toByteArray$1 = (ByteChannelsKt$toByteArray$1) continuationImpl;
            int i10 = byteChannelsKt$toByteArray$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                byteChannelsKt$toByteArray$1.label = i10 - Integer.MIN_VALUE;
            } else {
                byteChannelsKt$toByteArray$1 = new ByteChannelsKt$toByteArray$1(continuationImpl);
            }
        } else {
            byteChannelsKt$toByteArray$1 = new ByteChannelsKt$toByteArray$1(continuationImpl);
        }
        Object objT = byteChannelsKt$toByteArray$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = byteChannelsKt$toByteArray$1.label;
        if (i11 == 0) {
            kotlin.b.b(objT);
            byteChannelsKt$toByteArray$1.label = 1;
            objT = byteReadChannel.t(Long.MAX_VALUE, byteChannelsKt$toByteArray$1);
            if (objT == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(objT);
        }
        return C.e.l((p061ea.d) objT);
    }
}
