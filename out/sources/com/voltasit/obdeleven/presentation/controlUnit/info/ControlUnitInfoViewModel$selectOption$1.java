package com.voltasit.obdeleven.presentation.controlUnit.info;

import Ia.p;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.controlUnit.UpdateControlUnitOdxVersionUC;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: ControlUnitInfoViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.info.ControlUnitInfoViewModel$selectOption$1", f = "ControlUnitInfoViewModel.kt", l = {226}, m = "invokeSuspend")
final class ControlUnitInfoViewModel$selectOption$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ p109i8.e $controlUnit;
    final /* synthetic */ String $option;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlUnitInfoViewModel$selectOption$1(c cVar, p109i8.e eVar, String str, kotlin.coroutines.c<? super ControlUnitInfoViewModel$selectOption$1> cVar2) {
        super(2, cVar2);
        this.this$0 = cVar;
        this.$controlUnit = eVar;
        this.$option = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ControlUnitInfoViewModel$selectOption$1(this.this$0, this.$controlUnit, this.$option, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((ControlUnitInfoViewModel$selectOption$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            UpdateControlUnitOdxVersionUC updateControlUnitOdxVersionUC = this.this$0.f31634r;
            p109i8.e eVar = this.$controlUnit;
            String str = this.$option;
            this.label = 1;
            if (updateControlUnitOdxVersionUC.a(eVar, str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        String strA = this.this$0.f31632p.a(R.string.common_odx_file, new Object[0]);
        c cVar = this.this$0;
        cVar.e(strA, h.a(cVar.c(strA), this.$option, null, 23));
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        String objectId = this.$controlUnit.d().getControlUnitBase().getObjectId();
        J8.a aVar = this.this$0.f31637u;
        kotlin.jvm.internal.i.b(objectId);
        aVar.B(objectId, this.$option);
        return r.f47939a;
    }
}
