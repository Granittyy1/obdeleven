package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@Aa.c(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {R.styleable.AppCompatTheme_colorError}, m = "invokeSuspend")
final class ChannelFlow$collectToFun$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.channels.n<Object>, kotlin.coroutines.c<? super r>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(d<Object> dVar, kotlin.coroutines.c<? super ChannelFlow$collectToFun$1> cVar) {
        super(2, cVar);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.this$0, cVar);
        channelFlow$collectToFun$1.L$0 = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.channels.n<Object> nVar, kotlin.coroutines.c<? super r> cVar) {
        return ((ChannelFlow$collectToFun$1) create(nVar, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            kotlinx.coroutines.channels.n<? super Object> nVar = (kotlinx.coroutines.channels.n) this.L$0;
            d<Object> dVar = this.this$0;
            this.label = 1;
            if (dVar.g(nVar, this) == coroutineSingletons) {
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
