package com.voltasit.obdeleven.presentation.controlUnit;

import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ControlUnitViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.ControlUnitViewModel$onEnterLoginClick$1", f = "ControlUnitViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeight}, m = "invokeSuspend")
final class ControlUnitViewModel$onEnterLoginClick$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ ControlUnitViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlUnitViewModel$onEnterLoginClick$1(ControlUnitViewModel controlUnitViewModel, kotlin.coroutines.c<? super ControlUnitViewModel$onEnterLoginClick$1> cVar) {
        super(2, cVar);
        this.this$0 = controlUnitViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ControlUnitViewModel$onEnterLoginClick$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ControlUnitViewModel$onEnterLoginClick$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            ControlUnitViewModel controlUnitViewModel = this.this$0;
            this.label = 1;
            obj = ControlUnitViewModel.b(controlUnitViewModel, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.f31456x.j("SECURITY_POP_THE_HOOD");
        } else {
            this.this$0.f31445D.j(p293xa.r.f47939a);
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return p293xa.r.f47939a;
    }
}
