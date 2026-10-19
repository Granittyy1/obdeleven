package com.voltasit.obdeleven.domain.usecases.vehicle;

import com.obdeleven.service.model.fault.Fault;
import com.voltasit.parse.model.HistoryDB;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: ScanVehicleUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.vehicle.ScanVehicleUC$scanControlUnits$2", f = "ScanVehicleUC.kt", l = {}, m = "invokeSuspend")
final class ScanVehicleUC$scanControlUnits$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super Boolean>, Object> {
    final /* synthetic */ p109i8.e $cu;
    final /* synthetic */ List<HistoryDB> $result;
    final /* synthetic */ C8.a<List<Fault>> $scanOutput;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScanVehicleUC$scanControlUnits$2(List<HistoryDB> list, p109i8.e eVar, C8.a<? extends List<? extends Fault>> aVar, kotlin.coroutines.c<? super ScanVehicleUC$scanControlUnits$2> cVar) {
        super(2, cVar);
        this.$result = list;
        this.$cu = eVar;
        this.$scanOutput = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ScanVehicleUC$scanControlUnits$2(this.$result, this.$cu, this.$scanOutput, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super Boolean> cVar) {
        return ((ScanVehicleUC$scanControlUnits$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        List<HistoryDB> list = this.$result;
        HistoryDB historyDBU = this.$cu.u((List) ((C8.a.b) this.$scanOutput).f2463a);
        kotlin.jvm.internal.i.d(historyDBU, "createFaultHistoryItem(...)");
        return Boolean.valueOf(list.add(historyDBU));
    }
}
