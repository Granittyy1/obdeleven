package com.voltasit.obdeleven.domain.usecases.odx;

import Ia.p;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.OdxFactory$Exception;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.odx.model.DATAOBJECTPROP;
import com.obdeleven.service.odx.model.ODXLINK;
import com.obdeleven.service.odx.model.PARAM;
import com.obdeleven.service.odx.model.SNREF;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.presentation.basicsettings.BasicSettingsNotAvailable;
import com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsNotSupported;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: GetBasicSettingsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.odx.GetBasicSettingsUC$invoke$2", f = "GetBasicSettingsUC.kt", l = {R.styleable.AppCompatTheme_dialogCornerRadius}, m = "invokeSuspend")
public final class GetBasicSettingsUC$invoke$2 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super C8.a<? extends List<? extends p207q8.a>>>, Object> {
    final /* synthetic */ ControlUnit $controlUnit;
    int label;
    final /* synthetic */ GetBasicSettingsUC this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBasicSettingsUC$invoke$2(ControlUnit controlUnit, GetBasicSettingsUC getBasicSettingsUC, kotlin.coroutines.c<? super GetBasicSettingsUC$invoke$2> cVar) {
        super(2, cVar);
        this.$controlUnit = controlUnit;
        this.this$0 = getBasicSettingsUC;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new GetBasicSettingsUC$invoke$2(this.$controlUnit, this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super C8.a<? extends List<? extends p207q8.a>>> cVar) {
        return ((GetBasicSettingsUC$invoke$2) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws InterruptedException, OdxFactory$Exception {
        com.obdeleven.service.odx.e.g gVarH;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.b.b(obj);
                Task<com.obdeleven.service.odx.e> taskX = this.$controlUnit.X();
                taskX.waitForCompletion();
                if (taskX.isFaulted()) {
                    GetBasicSettingsUC getBasicSettingsUC = this.this$0;
                    Exception error = taskX.getError();
                    kotlin.jvm.internal.i.d(error, "getError(...)");
                    return GetBasicSettingsUC.a(getBasicSettingsUC, error);
                }
                com.obdeleven.service.odx.e result = taskX.getResult();
                SNREF snref = new SNREF();
                snref.setSHORTNAME("DiagnServi_RoutiContrStartBasicSetti");
                com.obdeleven.service.odx.e.b bVarF = result.f(snref);
                if (bVarF == null) {
                    return new C8.a.C0024a(new BasicSettingsNotAvailable());
                }
                com.obdeleven.service.odx.e.f fVarY = result.y(bVarF.f29497a.getREQUESTREF(), bVarF.f29498b);
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
                    gVarH = result.E(tableref, fVarY.f29506b);
                } else if (tablesnref != null) {
                    gVarH = result.H(tablesnref);
                }
                if (gVarH == null) {
                    return new C8.a.C0024a(new BasicSettingsNotAvailable());
                }
                com.obdeleven.service.odx.e.c cVarL = result.l(gVarH.f29507a.getKEYDOPREF(), gVarH.f29508b);
                if (cVarL == null) {
                    return new C8.a.C0024a(new BasicSettingsNotAvailable());
                }
                List<COMPUSCALE> compuscale = ((DATAOBJECTPROP) cVarL.f29499a).getCOMPUMETHOD().getCOMPUINTERNALTOPHYS().getCOMPUSCALES().getCOMPUSCALE();
                j jVar = this.this$0.f30888b;
                kotlin.jvm.internal.i.b(compuscale);
                this.label = 1;
                obj = jVar.a(compuscale, this);
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
            if (!(aVar instanceof C8.a.b)) {
                if (aVar instanceof C8.a.C0024a) {
                    return aVar;
                }
                throw new NoWhenBranchMatchedException();
            }
            List list = (List) ((C8.a.b) aVar).f2463a;
            if (list.isEmpty()) {
                return new C8.a.C0024a(new BasicSettingsNotAvailable());
            }
            List<COMPUSCALE> list2 = list;
            GetBasicSettingsUC getBasicSettingsUC2 = this.this$0;
            ArrayList arrayList = new ArrayList(m.y(list2, 10));
            for (COMPUSCALE compuscale2 : list2) {
                A8.b bVar = getBasicSettingsUC2.f30887a;
                arrayList.add(A8.b.a(compuscale2));
            }
            return new C8.a.b(arrayList);
        } catch (UnsupportedOperationException unused) {
            return new C8.a.C0024a(new UDSBasicSettingsNotSupported());
        }
    }
}
