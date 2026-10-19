package com.airbnb.lottie.compose;

import Ia.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: rememberLottieComposition.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
final class RememberLottieCompositionKt$rememberLottieComposition$1 extends SuspendLambda implements q<Integer, Throwable, kotlin.coroutines.c<? super Boolean>, Object> {
    int label;

    @Override // Ia.q
    public final Object invoke(Integer num, Throwable th, kotlin.coroutines.c<? super Boolean> cVar) {
        num.intValue();
        new RememberLottieCompositionKt$rememberLottieComposition$1(3, cVar).invokeSuspend(r.f47939a);
        return Boolean.FALSE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return Boolean.FALSE;
    }
}
