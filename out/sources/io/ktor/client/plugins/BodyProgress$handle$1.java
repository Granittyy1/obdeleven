package io.ktor.client.plugins;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: BodyProgress.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.plugins.BodyProgress$handle$1", f = "BodyProgress.kt", l = {R.styleable.AppCompatTheme_alertDialogTheme}, m = "invokeSuspend")
final class BodyProgress$handle$1 extends SuspendLambda implements Ia.q<io.ktor.util.pipeline.c<Object, io.ktor.client.request.a>, Object, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // Ia.q
    public final Object invoke(io.ktor.util.pipeline.c<Object, io.ktor.client.request.a> cVar, Object obj, kotlin.coroutines.c<? super p293xa.r> cVar2) {
        BodyProgress$handle$1 bodyProgress$handle$1 = new BodyProgress$handle$1(3, cVar2);
        bodyProgress$handle$1.L$0 = cVar;
        bodyProgress$handle$1.L$1 = obj;
        return bodyProgress$handle$1.invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            io.ktor.util.pipeline.c cVar = (io.ktor.util.pipeline.c) this.L$0;
            Object obj2 = this.L$1;
            Ia.q qVar = (Ia.q) ((io.ktor.client.request.a) cVar.f40561b).f40415f.d(b.f40349a);
            if (qVar == null) {
                return p293xa.r.f47939a;
            }
            kotlin.jvm.internal.i.c(obj2, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
            io.ktor.client.content.a aVar = new io.ktor.client.content.a((X9.b) obj2, ((io.ktor.client.request.a) cVar.f40561b).f40414e, qVar);
            this.L$0 = null;
            this.label = 1;
            if (cVar.d(aVar, this) == coroutineSingletons) {
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
