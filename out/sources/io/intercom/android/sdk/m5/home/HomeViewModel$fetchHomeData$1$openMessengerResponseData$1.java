package io.intercom.android.sdk.m5.home;

import Aa.c;
import Ia.p;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: HomeViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1$openMessengerResponseData$1", f = "HomeViewModel.kt", l = {R.styleable.AppCompatTheme_viewInflaterClass}, m = "invokeSuspend")
public final class HomeViewModel$fetchHomeData$1$openMessengerResponseData$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super OpenMessengerResponse>, Object> {
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$fetchHomeData$1$openMessengerResponseData$1(HomeViewModel homeViewModel, kotlin.coroutines.c<? super HomeViewModel$fetchHomeData$1$openMessengerResponseData$1> cVar) {
        super(2, cVar);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new HomeViewModel$fetchHomeData$1$openMessengerResponseData$1(this.this$0, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            CommonRepository commonRepository = this.this$0.commonRepository;
            this.label = 1;
            obj = commonRepository.openMessenger(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return obj;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super OpenMessengerResponse> cVar) {
        return ((HomeViewModel$fetchHomeData$1$openMessengerResponseData$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }
}
