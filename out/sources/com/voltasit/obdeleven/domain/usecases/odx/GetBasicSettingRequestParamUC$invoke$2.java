package com.voltasit.obdeleven.domain.usecases.odx;

import Ia.p;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.Param;
import com.obdeleven.service.odx.model.DOPBASE;
import com.obdeleven.service.odx.model.STRUCTURE;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.presentation.basicsettings.BasicSettingsNotAvailable;
import com.voltasit.obdeleven.presentation.basicsettings.CheckNetworkConnection;
import com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsNotSupported;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.N;
import p293xa.r;

/* JADX INFO: compiled from: GetBasicSettingRequestParamUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.odx.GetBasicSettingRequestParamUC$invoke$2", f = "GetBasicSettingRequestParamUC.kt", l = {23}, m = "invokeSuspend")
public final class GetBasicSettingRequestParamUC$invoke$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super C8.a<? extends Param>>, Object> {
    final /* synthetic */ int $channel;
    final /* synthetic */ ControlUnit $controlUnit;
    Object L$0;
    int label;
    final /* synthetic */ GetBasicSettingRequestParamUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBasicSettingRequestParamUC$invoke$2(ControlUnit controlUnit, GetBasicSettingRequestParamUC getBasicSettingRequestParamUC, int i10, kotlin.coroutines.c<? super GetBasicSettingRequestParamUC$invoke$2> cVar) {
        super(2, cVar);
        this.$controlUnit = controlUnit;
        this.this$0 = getBasicSettingRequestParamUC;
        this.$channel = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new GetBasicSettingRequestParamUC$invoke$2(this.$controlUnit, this.this$0, this.$channel, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super C8.a<? extends Param>> cVar) {
        return ((GetBasicSettingRequestParamUC$invoke$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        com.obdeleven.service.odx.e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.b.b(obj);
                Task<com.obdeleven.service.odx.e> taskX = this.$controlUnit.X();
                taskX.waitForCompletion();
                if (taskX.isFaulted()) {
                    GetBasicSettingRequestParamUC getBasicSettingRequestParamUC = this.this$0;
                    Exception error = taskX.getError();
                    kotlin.jvm.internal.i.d(error, "getError(...)");
                    return GetBasicSettingRequestParamUC.a(getBasicSettingRequestParamUC, error);
                }
                com.obdeleven.service.odx.e result = taskX.getResult();
                GetBasicSettingRequestParamUC getBasicSettingRequestParamUC2 = this.this$0;
                kotlin.jvm.internal.i.b(result);
                this.L$0 = result;
                this.label = 1;
                getBasicSettingRequestParamUC2.getClass();
                Object objF = C2680e.f(N.f43198a, new GetBasicSettingRequestParamUC$getTableResult$2(result, null), this);
                if (objF == coroutineSingletons) {
                    return coroutineSingletons;
                }
                eVar = result;
                obj = objF;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (com.obdeleven.service.odx.e) this.L$0;
                kotlin.b.b(obj);
            }
            C8.a aVar = (C8.a) obj;
            if (!(aVar instanceof C8.a.b)) {
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                throw new NoWhenBranchMatchedException();
            }
            com.obdeleven.service.odx.e.g gVar = (com.obdeleven.service.odx.e.g) ((C8.a.b) aVar).f2463a;
            com.obdeleven.service.odx.e.c cVarB = eVar.B(gVar.f29508b, gVar.f29507a, this.$channel);
            if (cVarB == null) {
                return new C8.a.C0024a(new BasicSettingsNotAvailable());
            }
            DOPBASE dopbase = cVarB.f29499a;
            Param paramL = eVar.L(cVarB.f29500b, ((STRUCTURE) dopbase).getPARAMS().getPARAM(), new byte[0], true);
            ((STRUCTURE) dopbase).isISVISIBLE();
            return new C8.a.b(paramL);
        } catch (OdxFactory$Exception unused) {
            return new C8.a.C0024a(new CheckNetworkConnection());
        } catch (UnsupportedOperationException unused2) {
            return new C8.a.C0024a(new UDSBasicSettingsNotSupported());
        }
    }
}
