package com.voltasit.obdeleven.presentation.vehicle;

import G8.H;
import Ia.p;
import K8.x;
import androidx.lifecycle.C;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: VehicleViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.vehicle.VehicleViewModel$loadVehicleLegacy$1", f = "VehicleViewModel.kt", l = {132, 145}, m = "invokeSuspend")
final class VehicleViewModel$loadVehicleLegacy$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ VehicleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleViewModel$loadVehicleLegacy$1(VehicleViewModel vehicleViewModel, kotlin.coroutines.c<? super VehicleViewModel$loadVehicleLegacy$1> cVar) {
        super(2, cVar);
        this.this$0 = vehicleViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new VehicleViewModel$loadVehicleLegacy$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((VehicleViewModel$loadVehicleLegacy$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0090  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        E e10;
        VehicleViewModel vehicleViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                e10 = (E) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
        kotlin.b.b(obj);
        VehicleViewModel vehicleViewModel2 = this.this$0;
        e10 = vehicleViewModel2.f33423y;
        if (e10 == null) {
            return r.f47939a;
        }
        vehicleViewModel2.f33385I.j(Boolean.TRUE);
        if (e10.getObjectId() == null) {
            VehicleViewModel vehicleViewModel3 = this.this$0;
            C<H> c10 = vehicleViewModel3.f33418t;
            vehicleViewModel3.f33414p.a().getClass();
            c10.j(A8.A.i(e10));
        } else {
            this.this$0.f33414p.e(e10);
            x xVar = this.this$0.f33414p;
            String objectId = e10.getObjectId();
            i.d(objectId, "getObjectId(...)");
            this.L$0 = e10;
            this.label = 1;
            obj = xVar.d(objectId, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (e10.j() == null) {
            vehicleViewModel = this.this$0;
            this.L$0 = null;
            this.label = 2;
            if (VehicleViewModel.b(vehicleViewModel, e10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return r.f47939a;
        C8.a aVar = (C8.a) obj;
        if (!(aVar instanceof C8.a.b)) {
            this.this$0.f33413o.c("VehicleViewModel", "Vehicle not found in cache");
            return r.f47939a;
        }
        this.this$0.f33413o.e("VehicleViewModel", "Vehicle found in cache");
        this.this$0.f33418t.j(((C8.a.b) aVar).f2463a);
        if (e10.j() == null) {
            vehicleViewModel = this.this$0;
            this.L$0 = null;
            this.label = 2;
            if (VehicleViewModel.b(vehicleViewModel, e10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return r.f47939a;
    }
}
