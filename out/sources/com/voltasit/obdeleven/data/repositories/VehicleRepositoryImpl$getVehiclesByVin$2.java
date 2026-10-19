package com.voltasit.obdeleven.data.repositories;

import com.google.android.gms.internal.measurement.M1;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p255u9.E;

/* JADX INFO: compiled from: VehicleRepositoryImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.repositories.VehicleRepositoryImpl$getVehiclesByVin$2", f = "VehicleRepositoryImpl.kt", l = {}, m = "invokeSuspend")
public final class VehicleRepositoryImpl$getVehiclesByVin$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super C8.a<? extends List<? extends Object>>>, Object> {
    final /* synthetic */ Task<Object> $task;
    int label;
    final /* synthetic */ VehicleRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleRepositoryImpl$getVehiclesByVin$2(Task<Object> task, VehicleRepositoryImpl vehicleRepositoryImpl, kotlin.coroutines.c<? super VehicleRepositoryImpl$getVehiclesByVin$2> cVar) {
        super(2, cVar);
        this.$task = task;
        this.this$0 = vehicleRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new VehicleRepositoryImpl$getVehiclesByVin$2(this.$task, this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super C8.a<? extends List<? extends Object>>> cVar) {
        return ((VehicleRepositoryImpl$getVehiclesByVin$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c0024a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        try {
            this.$task.waitForCompletion(5L, TimeUnit.MINUTES);
            if (this.$task.isFaulted()) {
                F8.c cVar = this.this$0.f30328f;
                Exception error = this.$task.getError();
                kotlin.jvm.internal.i.d(error, "getError(...)");
                c0024a = new C8.a.C0024a(cVar.a(error));
            } else {
                Object result = this.$task.getResult();
                if (result instanceof ArrayList) {
                    c0024a = new C8.a.b((List) result);
                } else if (result instanceof E) {
                    A8.A a10 = this.this$0.f30323a;
                    c0024a = new C8.a.b(M1.k(A8.A.i((E) result)));
                } else {
                    c0024a = new C8.a.b(EmptyList.f42983b);
                }
            }
            return c0024a;
        } catch (Exception e10) {
            return new C8.a.C0024a(this.this$0.f30328f.a(e10));
        }
    }
}
