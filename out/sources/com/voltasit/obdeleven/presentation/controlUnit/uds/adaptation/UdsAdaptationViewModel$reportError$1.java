package com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation;

import Ia.p;
import com.voltasit.obdeleven.domain.usecases.v;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: UdsAdaptationViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation.UdsAdaptationViewModel$reportError$1", f = "UdsAdaptationViewModel.kt", l = {R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated}, m = "invokeSuspend")
final class UdsAdaptationViewModel$reportError$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UdsAdaptationViewModel$reportError$1(i iVar, kotlin.coroutines.c<? super UdsAdaptationViewModel$reportError$1> cVar) {
        super(2, cVar);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UdsAdaptationViewModel$reportError$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((UdsAdaptationViewModel$reportError$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            v vVar = this.this$0.f31943o;
            this.label = 1;
            if (vVar.a("compuscales_null", this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return r.f47939a;
    }
}
