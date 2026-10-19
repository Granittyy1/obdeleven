package com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest;

import Ia.p;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: UDSOutputTestViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.uds.outputtest.UDSOutputTestViewModel$startOutputTestIfPossible$1", f = "UDSOutputTestViewModel.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle}, m = "invokeSuspend")
final class UDSOutputTestViewModel$startOutputTestIfPossible$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDSOutputTestViewModel$startOutputTestIfPossible$1(e eVar, kotlin.coroutines.c<? super UDSOutputTestViewModel$startOutputTestIfPossible$1> cVar) {
        super(2, cVar);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UDSOutputTestViewModel$startOutputTestIfPossible$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((UDSOutputTestViewModel$startOutputTestIfPossible$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            e eVar = this.this$0;
            this.label = 1;
            obj = e.b(eVar, this);
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
            U7.a<r> aVar = this.this$0.f31993s;
            r rVar = r.f47939a;
            aVar.j(rVar);
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            return rVar;
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        U7.a<r> aVar2 = this.this$0.f31991q;
        r rVar2 = r.f47939a;
        aVar2.j(rVar2);
        return rVar2;
    }
}
