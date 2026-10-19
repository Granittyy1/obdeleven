package com.voltasit.obdeleven.presentation.pro;

import Aa.c;
import Ia.p;
import com.voltasit.obdeleven.domain.models.SubscriptionType;
import com.voltasit.obdeleven.domain.usecases.user.v;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: ProViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.pro.ProViewModel$notifyProFunctionalityUsed$1", f = "ProViewModel.kt", l = {R.styleable.AppCompatTheme_popupWindowStyle}, m = "invokeSuspend")
final class ProViewModel$notifyProFunctionalityUsed$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ ProViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProViewModel$notifyProFunctionalityUsed$1(ProViewModel proViewModel, kotlin.coroutines.c<? super ProViewModel$notifyProFunctionalityUsed$1> cVar) {
        super(2, cVar);
        this.this$0 = proViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ProViewModel$notifyProFunctionalityUsed$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((ProViewModel$notifyProFunctionalityUsed$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            v vVar = this.this$0.f32800q;
            SubscriptionType subscriptionType = SubscriptionType.Pro;
            this.label = 1;
            if (vVar.a(subscriptionType, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return r.f47939a;
    }
}
