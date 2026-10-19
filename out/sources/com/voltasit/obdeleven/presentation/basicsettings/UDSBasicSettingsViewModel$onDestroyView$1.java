package com.voltasit.obdeleven.presentation.basicsettings;

import Aa.c;
import Ia.p;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: UDSBasicSettingsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsViewModel$onDestroyView$1", f = "UDSBasicSettingsViewModel.kt", l = {235}, m = "invokeSuspend")
final class UDSBasicSettingsViewModel$onDestroyView$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ ControlUnit $controlUnit;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDSBasicSettingsViewModel$onDestroyView$1(a aVar, ControlUnit controlUnit, kotlin.coroutines.c<? super UDSBasicSettingsViewModel$onDestroyView$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
        this.$controlUnit = controlUnit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UDSBasicSettingsViewModel$onDestroyView$1(this.this$0, this.$controlUnit, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((UDSBasicSettingsViewModel$onDestroyView$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            this.this$0.f32113b.k(PreloaderState.c.f32642a);
            a aVar = this.this$0;
            ControlUnit controlUnit = this.$controlUnit;
            this.label = 1;
            if (a.d(aVar, controlUnit, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        this.this$0.f32113b.k(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
