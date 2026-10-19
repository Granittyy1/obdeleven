package com.voltasit.obdeleven.presentation.controlUnit.faults;

import Aa.c;
import Ia.p;
import com.voltasit.obdeleven.domain.usecases.controlUnit.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: FaultsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.controlUnit.faults.FaultsViewModel$updateControlUnitList$1", f = "FaultsViewModel.kt", l = {R.styleable.AppCompatTheme_buttonStyleSmall}, m = "invokeSuspend")
final class FaultsViewModel$updateControlUnitList$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ short $controlUnitId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultsViewModel$updateControlUnitList$1(b bVar, short s10, kotlin.coroutines.c<? super FaultsViewModel$updateControlUnitList$1> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
        this.$controlUnitId = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new FaultsViewModel$updateControlUnitList$1(this.this$0, this.$controlUnitId, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((FaultsViewModel$updateControlUnitList$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0.f31599o;
            short s10 = this.$controlUnitId;
            this.label = 1;
            Object objB = dVar.f30746a.b(s10, this);
            if (objB != coroutineSingletons) {
                objB = r.f47939a;
            }
            if (objB == coroutineSingletons) {
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
