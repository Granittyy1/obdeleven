package com.voltasit.obdeleven.presentation.startup;

import Aa.c;
import Ia.p;
import androidx.lifecycle.C;
import com.voltasit.obdeleven.domain.usecases.vehicle.o;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: StartupActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.startup.StartupActivityViewModel$prepareGarage$1", f = "StartupActivityViewModel.kt", l = {R.styleable.AppCompatTheme_editTextColor}, m = "invokeSuspend")
final class StartupActivityViewModel$prepareGarage$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ StartupActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartupActivityViewModel$prepareGarage$1(StartupActivityViewModel startupActivityViewModel, kotlin.coroutines.c<? super StartupActivityViewModel$prepareGarage$1> cVar) {
        super(2, cVar);
        this.this$0 = startupActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new StartupActivityViewModel$prepareGarage$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((StartupActivityViewModel$prepareGarage$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            o oVar = this.this$0.f33283s;
            this.label = 1;
            if (!oVar.f31065a.z() || (objJ = oVar.f31066b.j(this)) != coroutineSingletons) {
                objJ = r.f47939a;
            }
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        C<r> c10 = this.this$0.f33289y;
        r rVar = r.f47939a;
        c10.j(rVar);
        return rVar;
    }
}
