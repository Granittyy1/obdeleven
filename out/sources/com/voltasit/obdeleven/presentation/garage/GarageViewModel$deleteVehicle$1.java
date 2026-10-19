package com.voltasit.obdeleven.presentation.garage;

import G8.H;
import K8.v;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: GarageViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.garage.GarageViewModel$deleteVehicle$1", f = "GarageViewModel.kt", l = {217}, m = "invokeSuspend")
final class GarageViewModel$deleteVehicle$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ int $vehicleIndex;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GarageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GarageViewModel$deleteVehicle$1(GarageViewModel garageViewModel, int i10, kotlin.coroutines.c<? super GarageViewModel$deleteVehicle$1> cVar) {
        super(2, cVar);
        this.this$0 = garageViewModel;
        this.$vehicleIndex = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new GarageViewModel$deleteVehicle$1(this.this$0, this.$vehicleIndex, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((GarageViewModel$deleteVehicle$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

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
        H h8;
        List<H> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (!this.this$0.f32341r.z()) {
                return p293xa.r.f47939a;
            }
            List<H> listD = this.this$0.f32348y.d();
            if (listD == null) {
                return p293xa.r.f47939a;
            }
            ArrayList arrayListP0 = kotlin.collections.q.p0(listD);
            H h10 = (H) arrayListP0.get(this.$vehicleIndex);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            v vVar = this.this$0.f32341r;
            this.L$0 = arrayListP0;
            this.L$1 = h10;
            this.label = 1;
            Object objT = vVar.t(h10, this);
            if (objT == coroutineSingletons) {
                return coroutineSingletons;
            }
            h8 = h10;
            obj = objT;
            list = arrayListP0;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h8 = (H) this.L$1;
            List<H> list2 = (List) this.L$0;
            kotlin.b.b(obj);
            list = list2;
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            if (list.size() % 50 == 0) {
                this.this$0.f32335b0.j(Boolean.TRUE);
            }
            list.remove(h8);
            this.this$0.f32343t.i();
            this.this$0.f32348y.j(list);
            if (list.isEmpty()) {
                GarageViewModel.d(this.this$0, R.string.view_garage_no_vehicles);
            }
        } else if (aVar instanceof C8.a.C0024a) {
            this.this$0.f32338o.d(((C8.a.C0024a) aVar).f2462a, false);
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        this.this$0.f32319L.j(Boolean.TRUE);
        UserTrackingUtils.c(UserTrackingUtils.Key.f34241B, 1);
        return p293xa.r.f47939a;
    }
}
