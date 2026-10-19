package io.intercom.android.sdk.m5.home;

import Aa.c;
import Ia.p;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.home.data.HomeRepository;
import io.intercom.android.sdk.m5.home.data.HomeV2Response;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: HomeViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1$homeResponse$1", f = "HomeViewModel.kt", l = {R.styleable.AppCompatTheme_tooltipFrameBackground}, m = "invokeSuspend")
public final class HomeViewModel$fetchHomeData$1$homeResponse$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super NetworkResponse<? extends HomeV2Response>>, Object> {
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$fetchHomeData$1$homeResponse$1(HomeViewModel homeViewModel, kotlin.coroutines.c<? super HomeViewModel$fetchHomeData$1$homeResponse$1> cVar) {
        super(2, cVar);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new HomeViewModel$fetchHomeData$1$homeResponse$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public /* bridge */ /* synthetic */ Object invoke(A a10, kotlin.coroutines.c<? super NetworkResponse<? extends HomeV2Response>> cVar) {
        return invoke2(a10, (kotlin.coroutines.c<? super NetworkResponse<HomeV2Response>>) cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            HomeRepository homeRepository = this.this$0.homeRepository;
            this.label = 1;
            obj = homeRepository.getHomeCards(this);
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

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(A a10, kotlin.coroutines.c<? super NetworkResponse<HomeV2Response>> cVar) {
        return ((HomeViewModel$fetchHomeData$1$homeResponse$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }
}
