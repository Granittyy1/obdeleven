package com.voltasit.obdeleven.ui.activity;

import com.voltasit.obdeleven.domain.usecases.user.SaveUserVehicleFromModificationUC;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.A;
import p255u9.E;
import p255u9.F;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$saveVehicle$1", f = "MainActivityViewModel.kt", l = {429}, m = "invokeSuspend")
final class MainActivityViewModel$saveVehicle$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ Ref$ObjectRef<E> $vehicleDB;
    final /* synthetic */ F $vehicleModificationDB;
    Object L$0;
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$saveVehicle$1(Ref$ObjectRef<E> ref$ObjectRef, MainActivityViewModel mainActivityViewModel, F f10, kotlin.coroutines.c<? super MainActivityViewModel$saveVehicle$1> cVar) {
        super(2, cVar);
        this.$vehicleDB = ref$ObjectRef;
        this.this$0 = mainActivityViewModel;
        this.$vehicleModificationDB = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainActivityViewModel$saveVehicle$1(this.$vehicleDB, this.this$0, this.$vehicleModificationDB, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MainActivityViewModel$saveVehicle$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef<E> ref$ObjectRef;
        T t8;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            Ref$ObjectRef<E> ref$ObjectRef2 = this.$vehicleDB;
            SaveUserVehicleFromModificationUC saveUserVehicleFromModificationUC = this.this$0.f33654u;
            F f10 = this.$vehicleModificationDB;
            this.L$0 = ref$ObjectRef2;
            this.label = 1;
            Object objA = saveUserVehicleFromModificationUC.a(f10, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$ObjectRef = ref$ObjectRef2;
            obj = objA;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$0;
            kotlin.b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            t8 = (E) ((C8.a.b) aVar).f2463a;
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f33649r0.j(p293xa.r.f47939a);
            t8 = 0;
        }
        ref$ObjectRef.element = t8;
        return p293xa.r.f47939a;
    }
}
