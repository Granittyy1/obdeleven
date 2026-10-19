package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LogInUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.user.LogInUC$downloadUserData$2$getParseConfigAsync$1", f = "LogInUC.kt", l = {R.styleable.AppCompatTheme_dialogTheme}, m = "invokeSuspend")
public final class LogInUC$downloadUserData$2$getParseConfigAsync$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super C8.a<? extends p293xa.r>>, Object> {
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogInUC$downloadUserData$2$getParseConfigAsync$1(r rVar, kotlin.coroutines.c<? super LogInUC$downloadUserData$2$getParseConfigAsync$1> cVar) {
        super(2, cVar);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LogInUC$downloadUserData$2$getParseConfigAsync$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super C8.a<? extends p293xa.r>> cVar) {
        return ((LogInUC$downloadUserData$2$getParseConfigAsync$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.domain.usecases.n nVar = this.this$0.f31007c;
            this.label = 1;
            obj = nVar.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
