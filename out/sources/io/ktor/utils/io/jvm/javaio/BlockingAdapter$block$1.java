package io.ktor.utils.io.jvm.javaio;

import Ia.l;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p293xa.r;

/* JADX INFO: compiled from: Blocking.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.utils.io.jvm.javaio.BlockingAdapter$block$1", f = "Blocking.kt", l = {186}, m = "invokeSuspend")
public final class BlockingAdapter$block$1 extends SuspendLambda implements l<kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ BlockingAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingAdapter$block$1(BlockingAdapter blockingAdapter, kotlin.coroutines.c<? super BlockingAdapter$block$1> cVar) {
        super(1, cVar);
        this.this$0 = blockingAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(kotlin.coroutines.c<?> cVar) {
        return new BlockingAdapter$block$1(this.this$0, cVar);
    }

    @Override // Ia.l
    public final Object invoke(kotlin.coroutines.c<? super r> cVar) {
        return ((BlockingAdapter$block$1) create(cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            BlockingAdapter blockingAdapter = this.this$0;
            this.label = 1;
            if (blockingAdapter.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return r.f47939a;
    }
}
