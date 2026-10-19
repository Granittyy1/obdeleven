package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC2694i0;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: CancelableChannelFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", l = {R.styleable.AppCompatTheme_actionOverflowMenuStyle}, m = "invokeSuspend")
final class CancelableChannelFlowKt$cancelableChannelFlow$1 extends SuspendLambda implements Ia.p<C<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ia.p<C<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> $block;
    final /* synthetic */ InterfaceC2694i0 $controller;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CancelableChannelFlowKt$cancelableChannelFlow$1(InterfaceC2694i0 interfaceC2694i0, Ia.p<? super C<Object>, ? super kotlin.coroutines.c<? super p293xa.r>, ? extends Object> pVar, kotlin.coroutines.c<? super CancelableChannelFlowKt$cancelableChannelFlow$1> cVar) {
        super(2, cVar);
        this.$controller = interfaceC2694i0;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        CancelableChannelFlowKt$cancelableChannelFlow$1 cancelableChannelFlowKt$cancelableChannelFlow$1 = new CancelableChannelFlowKt$cancelableChannelFlow$1(this.$controller, this.$block, cVar);
        cancelableChannelFlowKt$cancelableChannelFlow$1.L$0 = obj;
        return cancelableChannelFlowKt$cancelableChannelFlow$1;
    }

    @Override // Ia.p
    public final Object invoke(C<Object> c10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((CancelableChannelFlowKt$cancelableChannelFlow$1) create(c10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            final C<Object> c10 = (C) this.L$0;
            this.$controller.B(new Ia.l<Throwable, p293xa.r>() { // from class: androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(Throwable th) {
                    c10.a(null);
                    return p293xa.r.f47939a;
                }
            });
            Ia.p<C<Object>, kotlin.coroutines.c<? super p293xa.r>, Object> pVar = this.$block;
            this.label = 1;
            if (pVar.invoke(c10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
