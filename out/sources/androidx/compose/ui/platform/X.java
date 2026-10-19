package androidx.compose.ui.platform;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PlatformTextInputModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
public final class X {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(androidx.compose.ui.node.U u10, Ia.p pVar, ContinuationImpl continuationImpl) {
        ChainedPlatformTextInputInterceptor$textInputSession$1 chainedPlatformTextInputInterceptor$textInputSession$1;
        if (continuationImpl instanceof ChainedPlatformTextInputInterceptor$textInputSession$1) {
            chainedPlatformTextInputInterceptor$textInputSession$1 = (ChainedPlatformTextInputInterceptor$textInputSession$1) continuationImpl;
            int i10 = chainedPlatformTextInputInterceptor$textInputSession$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                chainedPlatformTextInputInterceptor$textInputSession$1.label = i10 - Integer.MIN_VALUE;
            } else {
                chainedPlatformTextInputInterceptor$textInputSession$1 = new ChainedPlatformTextInputInterceptor$textInputSession$1(this, continuationImpl);
            }
        } else {
            chainedPlatformTextInputInterceptor$textInputSession$1 = new ChainedPlatformTextInputInterceptor$textInputSession$1(this, continuationImpl);
        }
        Object obj = chainedPlatformTextInputInterceptor$textInputSession$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = chainedPlatformTextInputInterceptor$textInputSession$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            throw new KotlinNothingValueException();
        }
        kotlin.b.b(obj);
        ChainedPlatformTextInputInterceptor$textInputSession$2 chainedPlatformTextInputInterceptor$textInputSession$2 = new ChainedPlatformTextInputInterceptor$textInputSession$2(pVar, this, null);
        chainedPlatformTextInputInterceptor$textInputSession$1.label = 1;
        PlatformTextInputModifierNodeKt.b(u10, null, chainedPlatformTextInputInterceptor$textInputSession$2, chainedPlatformTextInputInterceptor$textInputSession$1);
    }
}
