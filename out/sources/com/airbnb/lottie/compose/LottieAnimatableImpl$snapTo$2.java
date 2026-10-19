package com.airbnb.lottie.compose;

import Ia.l;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: LottieAnimatable.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", l = {}, m = "invokeSuspend")
public final class LottieAnimatableImpl$snapTo$2 extends SuspendLambda implements l<kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ p079g3.b $composition;
    final /* synthetic */ int $iteration;
    final /* synthetic */ float $progress;
    final /* synthetic */ boolean $resetLastFrameNanos;
    int label;
    final /* synthetic */ LottieAnimatableImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$snapTo$2(LottieAnimatableImpl lottieAnimatableImpl, p079g3.b bVar, float f10, int i10, boolean z10, kotlin.coroutines.c<? super LottieAnimatableImpl$snapTo$2> cVar) {
        super(1, cVar);
        this.this$0 = lottieAnimatableImpl;
        this.$composition = bVar;
        this.$progress = f10;
        this.$iteration = i10;
        this.$resetLastFrameNanos = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(kotlin.coroutines.c<?> cVar) {
        return new LottieAnimatableImpl$snapTo$2(this.this$0, this.$composition, this.$progress, this.$iteration, this.$resetLastFrameNanos, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super r> cVar) {
        return ((LottieAnimatableImpl$snapTo$2) create(cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        LottieAnimatableImpl lottieAnimatableImpl = this.this$0;
        lottieAnimatableImpl.j.setValue(this.$composition);
        this.this$0.s(this.$progress);
        this.this$0.q(this.$iteration);
        LottieAnimatableImpl.g(this.this$0, false);
        if (this.$resetLastFrameNanos) {
            this.this$0.f23352m.setValue(Long.MIN_VALUE);
        }
        return r.f47939a;
    }
}
