package io.ktor.client.call;

import io.ktor.utils.io.ByteReadChannel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SavedCall.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        SavedCallKt$save$1 savedCallKt$save$1;
        if (continuationImpl instanceof SavedCallKt$save$1) {
            savedCallKt$save$1 = (SavedCallKt$save$1) continuationImpl;
            int i10 = savedCallKt$save$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                savedCallKt$save$1.label = i10 - Integer.MIN_VALUE;
            } else {
                savedCallKt$save$1 = new SavedCallKt$save$1(continuationImpl);
            }
        } else {
            savedCallKt$save$1 = new SavedCallKt$save$1(continuationImpl);
        }
        Object objT = savedCallKt$save$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = savedCallKt$save$1.label;
        if (i11 == 0) {
            kotlin.b.b(objT);
            ByteReadChannel byteReadChannelC = aVar.d().c();
            savedCallKt$save$1.L$0 = aVar;
            savedCallKt$save$1.label = 1;
            objT = byteReadChannelC.t(Long.MAX_VALUE, savedCallKt$save$1);
            if (objT == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) savedCallKt$save$1.L$0;
            kotlin.b.b(objT);
        }
        return new c(aVar.f40262b, aVar.c(), aVar.d(), C.e.l((p061ea.d) objT));
    }
}
