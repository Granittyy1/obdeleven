package com.voltasit.obdeleven.ui.activity;

import com.voltasit.obdeleven.domain.exceptions.InvalidVinException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$connectToVehicle$1", f = "MainActivityViewModel.kt", l = {518}, m = "invokeSuspend")
final class MainActivityViewModel$connectToVehicle$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.ui.activity.MainActivityViewModel$connectToVehicle$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: MainActivityViewModel.kt */
    @Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$connectToVehicle$1$1", f = "MainActivityViewModel.kt", l = {517}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        int label;
        final /* synthetic */ MainActivityViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MainActivityViewModel mainActivityViewModel, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = mainActivityViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // Ia.p
        public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                J8.m mVar = this.this$0.f33626Z;
                this.label = 1;
                if (mVar.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return p293xa.r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$connectToVehicle$1(MainActivityViewModel mainActivityViewModel, kotlin.coroutines.c<? super MainActivityViewModel$connectToVehicle$1> cVar) {
        super(2, cVar);
        this.this$0 = mainActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        MainActivityViewModel$connectToVehicle$1 mainActivityViewModel$connectToVehicle$1 = new MainActivityViewModel$connectToVehicle$1(this.this$0, cVar);
        mainActivityViewModel$connectToVehicle$1.L$0 = obj;
        return mainActivityViewModel$connectToVehicle$1;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MainActivityViewModel$connectToVehicle$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C2680e.c((A) this.L$0, null, null, new AnonymousClass1(this.this$0, null), 3);
            com.voltasit.obdeleven.domain.usecases.device.k kVar = this.this$0.f33586F;
            this.label = 1;
            obj = kVar.b(this);
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
        if (aVar instanceof C8.a.b) {
            String str = (String) ((C8.a.b) aVar).f2463a;
            if (str.length() == 0) {
                this.this$0.f33652t.e("MainActivityViewModel", "VIN is empty. Showing garage list.");
                this.this$0.f33664z0.j(p293xa.r.f47939a);
            } else {
                this.this$0.f33652t.e("MainActivityViewModel", "VIN is valid. Identifying vehicle.");
                this.this$0.f33579B0.j(str);
            }
        } else if (aVar instanceof C8.a.C0024a) {
            MainActivityViewModel mainActivityViewModel = this.this$0;
            Throwable th = ((C8.a.C0024a) aVar).f2462a;
            J8.p pVar = mainActivityViewModel.f33652t;
            pVar.d(th, false);
            pVar.b("MainActivityViewModel", "VIN is invalid: " + th.getMessage());
            if (th instanceof InvalidVinException) {
                mainActivityViewModel.f33664z0.j(p293xa.r.f47939a);
            } else if (W7.c.c() != 0) {
                pVar.b("MainActivityViewModel", "Showing check ignition dialog");
                mainActivityViewModel.v0.j(Boolean.TRUE);
            }
        }
        return p293xa.r.f47939a;
    }
}
