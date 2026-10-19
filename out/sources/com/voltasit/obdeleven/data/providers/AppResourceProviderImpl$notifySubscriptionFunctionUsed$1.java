package com.voltasit.obdeleven.data.providers;

import com.voltasit.obdeleven.domain.models.SubscriptionType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: AppResourceProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.AppResourceProviderImpl$notifySubscriptionFunctionUsed$1", f = "AppResourceProviderImpl.kt", l = {R.styleable.AppCompatTheme_ratingBarStyleIndicator}, m = "invokeSuspend")
public final class AppResourceProviderImpl$notifySubscriptionFunctionUsed$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ AppResourceProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppResourceProviderImpl$notifySubscriptionFunctionUsed$1(AppResourceProviderImpl appResourceProviderImpl, kotlin.coroutines.c<? super AppResourceProviderImpl$notifySubscriptionFunctionUsed$1> cVar) {
        super(2, cVar);
        this.this$0 = appResourceProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AppResourceProviderImpl$notifySubscriptionFunctionUsed$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((AppResourceProviderImpl$notifySubscriptionFunctionUsed$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.domain.usecases.user.v vVar = this.this$0.f30199e;
            SubscriptionType subscriptionType = SubscriptionType.Pro;
            this.label = 1;
            if (vVar.a(subscriptionType, this) == coroutineSingletons) {
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
