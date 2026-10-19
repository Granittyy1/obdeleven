package io.ktor.utils.io;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.AbstractC2712w;
import kotlinx.coroutines.InterfaceC2694i0;
import kotlinx.coroutines.N;
import p293xa.r;

/* JADX INFO: compiled from: Coroutines.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.utils.io.CoroutinesKt$launchChannel$job$1", f = "Coroutines.kt", l = {147}, m = "invokeSuspend")
final class CoroutinesKt$launchChannel$job$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ boolean $attachJob;
    final /* synthetic */ p<Object, kotlin.coroutines.c<? super r>, Object> $block;
    final /* synthetic */ a $channel;
    final /* synthetic */ AbstractC2712w $dispatcher;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutinesKt$launchChannel$job$1(boolean z10, a aVar, p<Object, ? super kotlin.coroutines.c<? super r>, ? extends Object> pVar, AbstractC2712w abstractC2712w, kotlin.coroutines.c<? super CoroutinesKt$launchChannel$job$1> cVar) {
        super(2, cVar);
        this.$attachJob = z10;
        this.$channel = aVar;
        this.$block = pVar;
        this.$dispatcher = abstractC2712w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        CoroutinesKt$launchChannel$job$1 coroutinesKt$launchChannel$job$1 = new CoroutinesKt$launchChannel$job$1(this.$attachJob, this.$channel, this.$block, this.$dispatcher, cVar);
        coroutinesKt$launchChannel$job$1.L$0 = obj;
        return coroutinesKt$launchChannel$job$1;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((CoroutinesKt$launchChannel$job$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.b.b(obj);
                A a10 = (A) this.L$0;
                if (this.$attachJob) {
                    a aVar = this.$channel;
                    kotlin.coroutines.e.a aVar2 = a10.getCoroutineContext().get(InterfaceC2694i0.b.f43449b);
                    kotlin.jvm.internal.i.b(aVar2);
                    aVar.c((InterfaceC2694i0) aVar2);
                }
                f fVar = new f(a10, this.$channel);
                p<Object, kotlin.coroutines.c<? super r>, Object> pVar = this.$block;
                this.label = 1;
                if (pVar.invoke(fVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
        } catch (Throwable th) {
            if (!kotlin.jvm.internal.i.a(this.$dispatcher, N.f43199b) && this.$dispatcher != null) {
                throw th;
            }
            this.$channel.o(th);
        }
        return r.f47939a;
    }
}
