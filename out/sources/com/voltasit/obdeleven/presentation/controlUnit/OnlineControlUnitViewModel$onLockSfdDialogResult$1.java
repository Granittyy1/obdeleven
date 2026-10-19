package com.voltasit.obdeleven.presentation.controlUnit;

import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: OnlineControlUnitViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitViewModel$onLockSfdDialogResult$1", f = "OnlineControlUnitViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeight}, m = "invokeSuspend")
final class OnlineControlUnitViewModel$onLockSfdDialogResult$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ short $klineId;
    int label;
    final /* synthetic */ F this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineControlUnitViewModel$onLockSfdDialogResult$1(F f10, short s10, kotlin.coroutines.c<? super OnlineControlUnitViewModel$onLockSfdDialogResult$1> cVar) {
        super(2, cVar);
        this.this$0 = f10;
        this.$klineId = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OnlineControlUnitViewModel$onLockSfdDialogResult$1(this.this$0, this.$klineId, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((OnlineControlUnitViewModel$onLockSfdDialogResult$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(new PreloaderState.a(com.voltasit.obdeleven.R.string.dialog_sfd_unlocking));
            com.voltasit.obdeleven.domain.usecases.sfd.g gVar = this.this$0.f31470t;
            short s10 = this.$klineId;
            this.label = 1;
            obj = gVar.a(s10, this);
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
        if (aVar instanceof C8.a.C0024a) {
            B7.b.h(com.voltasit.obdeleven.R.string.common_something_went_wrong, this.this$0.f32119h);
        } else if (aVar instanceof C8.a.b) {
            B7.b.h(com.voltasit.obdeleven.R.string.common_success, this.this$0.f32122l);
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return p293xa.r.f47939a;
    }
}
