package com.voltasit.obdeleven.presentation.basicsettings;

import Aa.c;
import Ia.p;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.Param;
import com.voltasit.obdeleven.domain.usecases.odx.GetBasicSettingRequestParamUC;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: UDSBasicSettingsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsViewModel$getBasicSettingRequestParameters$1", f = "UDSBasicSettingsViewModel.kt", l = {144}, m = "invokeSuspend")
final class UDSBasicSettingsViewModel$getBasicSettingRequestParameters$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ int $channel;
    final /* synthetic */ ControlUnit $controlUnit;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDSBasicSettingsViewModel$getBasicSettingRequestParameters$1(a aVar, ControlUnit controlUnit, int i10, kotlin.coroutines.c<? super UDSBasicSettingsViewModel$getBasicSettingRequestParameters$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
        this.$controlUnit = controlUnit;
        this.$channel = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UDSBasicSettingsViewModel$getBasicSettingRequestParameters$1(this.this$0, this.$controlUnit, this.$channel, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((UDSBasicSettingsViewModel$getBasicSettingRequestParameters$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            GetBasicSettingRequestParamUC getBasicSettingRequestParamUC = this.this$0.f31360r;
            ControlUnit controlUnit = this.$controlUnit;
            int i11 = this.$channel;
            this.label = 1;
            obj = getBasicSettingRequestParamUC.b(controlUnit, i11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            a aVar2 = this.this$0;
            Param param = (Param) ((C8.a.b) aVar).f2463a;
            aVar2.f31348K = param;
            this.this$0.f31367y.j(new Pair<>(param.c(false), Boolean.TRUE));
        } else if (aVar instanceof C8.a.C0024a) {
            a aVar3 = this.this$0;
            aVar3.f31348K = null;
            aVar3.f31367y.j(new Pair<>(EmptyList.f42983b, Boolean.FALSE));
            this.this$0.e(((C8.a.C0024a) aVar).f2462a, false);
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
