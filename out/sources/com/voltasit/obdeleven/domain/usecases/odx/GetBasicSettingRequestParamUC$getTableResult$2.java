package com.voltasit.obdeleven.domain.usecases.odx;

import Ia.p;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.model.ODXLINK;
import com.obdeleven.service.odx.model.PARAM;
import com.obdeleven.service.odx.model.SNREF;
import com.voltasit.obdeleven.presentation.basicsettings.BasicSettingsNotAvailable;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: GetBasicSettingRequestParamUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.odx.GetBasicSettingRequestParamUC$getTableResult$2", f = "GetBasicSettingRequestParamUC.kt", l = {}, m = "invokeSuspend")
final class GetBasicSettingRequestParamUC$getTableResult$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super C8.a<? extends com.obdeleven.service.odx.e.g>>, Object> {
    final /* synthetic */ com.obdeleven.service.odx.e $odxWorker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBasicSettingRequestParamUC$getTableResult$2(com.obdeleven.service.odx.e eVar, kotlin.coroutines.c<? super GetBasicSettingRequestParamUC$getTableResult$2> cVar) {
        super(2, cVar);
        this.$odxWorker = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new GetBasicSettingRequestParamUC$getTableResult$2(this.$odxWorker, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super C8.a<? extends com.obdeleven.service.odx.e.g>> cVar) {
        return ((GetBasicSettingRequestParamUC$getTableResult$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws OdxFactory$Exception {
        com.obdeleven.service.odx.e.g gVarH;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        SNREF snref = new SNREF();
        snref.setSHORTNAME("DiagnServi_RoutiContrStartBasicSetti");
        com.obdeleven.service.odx.e.b bVarF = this.$odxWorker.f(snref);
        if (bVarF == null) {
            return new C8.a.C0024a(new BasicSettingsNotAvailable());
        }
        com.obdeleven.service.odx.e.f fVarY = this.$odxWorker.y(bVarF.f29497a.getREQUESTREF(), bVarF.f29498b);
        if (fVarY == null) {
            return new C8.a.C0024a(new BasicSettingsNotAvailable());
        }
        List<PARAM> param = fVarY.f29505a.getPARAMS().getPARAM();
        kotlin.jvm.internal.i.d(param, "getPARAM(...)");
        Iterator<T> it = param.iterator();
        do {
            gVarH = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.i.a(((PARAM) next).getType(), "TABLE-KEY"));
        PARAM param2 = (PARAM) next;
        if (param2 == null) {
            return new C8.a.C0024a(new BasicSettingsNotAvailable());
        }
        ODXLINK tableref = param2.getTableref();
        SNREF tablesnref = param2.getTablesnref();
        if (tableref != null) {
            gVarH = this.$odxWorker.E(tableref, fVarY.f29506b);
        } else if (tablesnref != null) {
            gVarH = this.$odxWorker.H(tablesnref);
        }
        return gVarH == null ? new C8.a.C0024a(new BasicSettingsNotAvailable()) : new C8.a.b(gVarH);
    }
}
