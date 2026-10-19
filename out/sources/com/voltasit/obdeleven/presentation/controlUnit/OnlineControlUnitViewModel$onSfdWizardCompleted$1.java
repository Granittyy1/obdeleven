package com.voltasit.obdeleven.presentation.controlUnit;

import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: OnlineControlUnitViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.OnlineControlUnitViewModel$onSfdWizardCompleted$1", f = "OnlineControlUnitViewModel.kt", l = {R.styleable.AppCompatTheme_homeAsUpIndicator}, m = "invokeSuspend")
final class OnlineControlUnitViewModel$onSfdWizardCompleted$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ String $cuBaseId;
    final /* synthetic */ short $klineId;
    int label;
    final /* synthetic */ F this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineControlUnitViewModel$onSfdWizardCompleted$1(F f10, String str, short s10, kotlin.coroutines.c<? super OnlineControlUnitViewModel$onSfdWizardCompleted$1> cVar) {
        super(2, cVar);
        this.this$0 = f10;
        this.$cuBaseId = str;
        this.$klineId = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OnlineControlUnitViewModel$onSfdWizardCompleted$1(this.this$0, this.$cuBaseId, this.$klineId, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((OnlineControlUnitViewModel$onSfdWizardCompleted$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            F f10 = this.this$0;
            String str = this.$cuBaseId;
            short s10 = this.$klineId;
            this.label = 1;
            if (F.b(f10, str, s10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return p293xa.r.f47939a;
    }
}
