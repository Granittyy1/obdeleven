package com.voltasit.obdeleven.presentation.controlUnit;

import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: ControlUnitViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.ControlUnitViewModel$clickProFunction$1", f = "ControlUnitViewModel.kt", l = {R.styleable.AppCompatTheme_buttonStyle}, m = "invokeSuspend")
public final class ControlUnitViewModel$clickProFunction$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ ProCuScreen $function;
    int label;
    final /* synthetic */ ControlUnitViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlUnitViewModel$clickProFunction$1(ControlUnitViewModel controlUnitViewModel, ProCuScreen proCuScreen, kotlin.coroutines.c<? super ControlUnitViewModel$clickProFunction$1> cVar) {
        super(2, cVar);
        this.this$0 = controlUnitViewModel;
        this.$function = proCuScreen;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ControlUnitViewModel$clickProFunction$1(this.this$0, this.$function, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((ControlUnitViewModel$clickProFunction$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            GetUserDetailsUC getUserDetailsUC = this.this$0.f31447o;
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
            if (((G8.D) ((C8.a.b) aVar).f2463a).f3410a.c()) {
                this.this$0.f31450r.j(this.$function);
            } else {
                this.this$0.f31454v.j(p293xa.r.f47939a);
            }
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f31452t.j(p293xa.r.f47939a);
        }
        p293xa.r rVar = p293xa.r.f47939a;
        Na.i iVar = E8.a.f3126a;
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return rVar;
    }
}
