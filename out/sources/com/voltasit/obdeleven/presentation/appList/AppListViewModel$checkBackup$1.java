package com.voltasit.obdeleven.presentation.appList;

import Ia.p;
import com.voltasit.obdeleven.domain.exceptions.VehicleNotConnectedException;
import com.voltasit.obdeleven.domain.usecases.g;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: AppListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.appList.AppListViewModel$checkBackup$1", f = "AppListViewModel.kt", l = {189}, m = "invokeSuspend")
final class AppListViewModel$checkBackup$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ AppListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppListViewModel$checkBackup$1(AppListViewModel appListViewModel, kotlin.coroutines.c<? super AppListViewModel$checkBackup$1> cVar) {
        super(2, cVar);
        this.this$0 = appListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AppListViewModel$checkBackup$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((AppListViewModel$checkBackup$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            PreloaderState preloaderStateD = this.this$0.f32113b.d();
            PreloaderState.c cVar = PreloaderState.c.f32642a;
            if (!i.a(preloaderStateD, cVar)) {
                this.this$0.f32113b.j(cVar);
            }
            g gVar = this.this$0.f31278r;
            r rVar = r.f47939a;
            this.label = 1;
            obj = gVar.i0(this);
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
            if (((Boolean) ((C8.a.b) aVar).f2463a).booleanValue()) {
                AppListViewModel.f(this.this$0, null, null, false, 3);
                this.this$0.f31265V.j(r.f47939a);
            } else {
                this.this$0.f31251H.j(r.f47939a);
            }
        } else if (aVar instanceof C8.a.C0024a) {
            if (((C8.a.C0024a) aVar).f2462a instanceof VehicleNotConnectedException) {
                AppListViewModel.f(this.this$0, null, null, false, 3);
                this.this$0.f31265V.j(r.f47939a);
            } else {
                this.this$0.f31249F.j(r.f47939a);
            }
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
