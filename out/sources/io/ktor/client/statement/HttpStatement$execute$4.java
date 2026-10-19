package io.ktor.client.statement;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: HttpStatement.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "io.ktor.client.statement.HttpStatement$execute$4", f = "HttpStatement.kt", l = {R.styleable.AppCompatTheme_dialogTheme}, m = "invokeSuspend")
final class HttpStatement$execute$4 extends SuspendLambda implements p<c, kotlin.coroutines.c<? super c>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public HttpStatement$execute$4() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        HttpStatement$execute$4 httpStatement$execute$4 = new HttpStatement$execute$4(2, cVar);
        httpStatement$execute$4.L$0 = obj;
        return httpStatement$execute$4;
    }

    @Override // Ia.p
    public final Object invoke(c cVar, kotlin.coroutines.c<? super c> cVar2) {
        return ((HttpStatement$execute$4) create(cVar, cVar2)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            io.ktor.client.call.a aVarB = ((c) this.L$0).b();
            this.label = 1;
            obj = io.ktor.client.call.b.a(aVarB, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return ((io.ktor.client.call.a) obj).d();
    }
}
