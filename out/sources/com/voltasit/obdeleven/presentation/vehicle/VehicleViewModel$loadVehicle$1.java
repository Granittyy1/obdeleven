package com.voltasit.obdeleven.presentation.vehicle;

import Ia.p;
import K8.x;
import Na.i;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: VehicleViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.vehicle.VehicleViewModel$loadVehicle$1", f = "VehicleViewModel.kt", l = {175, 178, 195}, m = "invokeSuspend")
final class VehicleViewModel$loadVehicle$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ VehicleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VehicleViewModel$loadVehicle$1(VehicleViewModel vehicleViewModel, String str, kotlin.coroutines.c<? super VehicleViewModel$loadVehicle$1> cVar) {
        super(2, cVar);
        this.this$0 = vehicleViewModel;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new VehicleViewModel$loadVehicle$1(this.this$0, this.$id, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((VehicleViewModel$loadVehicle$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d9 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
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
        r rVar;
        E e10;
        VehicleViewModel vehicleViewModel;
        C8.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else if (i10 == 2) {
                kotlin.b.b(obj);
                aVar = (C8.a) obj;
                if (aVar instanceof C8.a.b) {
                    this.this$0.f33418t.j(((C8.a.b) aVar).f2463a);
                } else {
                    this.this$0.f33413o.c("VehicleViewModel", "Unable to get Vehicle from VehicleDB");
                    this.this$0.f32115d.j(Boolean.TRUE);
                }
                rVar = r.f47939a;
                i iVar = E8.a.f3126a;
                this.this$0.f32113b.j(PreloaderState.d.f32643a);
                this.this$0.f33385I.j(Boolean.TRUE);
                e10 = this.this$0.f33423y;
                if (e10 == null) {
                    return rVar;
                }
                if (e10.j() == null) {
                    vehicleViewModel = this.this$0;
                    this.label = 3;
                    if (VehicleViewModel.b(vehicleViewModel, e10, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
        kotlin.b.b(obj);
        this.this$0.f32113b.j(PreloaderState.c.f32642a);
        x xVar = this.this$0.f33414p;
        String str = this.$id;
        this.label = 1;
        obj = xVar.i(str, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar2 = (C8.a) obj;
        if (aVar2 instanceof C8.a.b) {
            VehicleViewModel vehicleViewModel2 = this.this$0;
            vehicleViewModel2.f33423y = (E) ((C8.a.b) aVar2).f2463a;
            String str2 = this.$id;
            this.label = 2;
            obj = vehicleViewModel2.f33414p.d(str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = (C8.a) obj;
            if (aVar instanceof C8.a.b) {
                this.this$0.f33418t.j(((C8.a.b) aVar).f2463a);
            } else {
                this.this$0.f33413o.c("VehicleViewModel", "Unable to get Vehicle from VehicleDB");
                this.this$0.f32115d.j(Boolean.TRUE);
            }
        } else {
            if (!(aVar2 instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f33413o.c("VehicleViewModel", "Vehicle with id: " + this.$id + " not found");
            this.this$0.f32115d.j(Boolean.TRUE);
        }
        rVar = r.f47939a;
        i iVar2 = E8.a.f3126a;
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        this.this$0.f33385I.j(Boolean.TRUE);
        e10 = this.this$0.f33423y;
        if (e10 == null) {
            return rVar;
        }
        if (e10.j() == null) {
            vehicleViewModel = this.this$0;
            this.label = 3;
            if (VehicleViewModel.b(vehicleViewModel, e10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return r.f47939a;
    }
}
