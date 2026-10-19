package com.voltasit.obdeleven.presentation.controlUnit;

import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: OnlineControlUnitViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitViewModel$requestInfo$1", f = "OnlineControlUnitViewModel.kt", l = {R.styleable.AppCompatTheme_checkedTextViewStyle}, m = "invokeSuspend")
final class OnlineControlUnitViewModel$requestInfo$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ F this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineControlUnitViewModel$requestInfo$1(F f10, kotlin.coroutines.c<? super OnlineControlUnitViewModel$requestInfo$1> cVar) {
        super(2, cVar);
        this.this$0 = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OnlineControlUnitViewModel$requestInfo$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((OnlineControlUnitViewModel$requestInfo$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            GetUserDetailsUC getUserDetailsUC = this.this$0.f31466p;
            this.label = 1;
            obj = getUserDetailsUC.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            this.this$0.f31464C = ((G8.D) ((C8.a.b) aVar).f2463a).f3410a.c();
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            this.this$0.f31473w.j(p293xa.r.f47939a);
        } else if (aVar instanceof C8.a.C0024a) {
            this.this$0.f31471u.j(p293xa.r.f47939a);
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
        }
        return p293xa.r.f47939a;
    }
}
