package com.voltasit.obdeleven.presentation.appList;

import G8.C0699a;
import Ia.p;
import com.voltasit.obdeleven.domain.repositories.AgreementRepository;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: AppListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.appList.AppListViewModel$checkOcaPolicy$1", f = "AppListViewModel.kt", l = {216}, m = "invokeSuspend")
final class AppListViewModel$checkOcaPolicy$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ AppListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppListViewModel$checkOcaPolicy$1(AppListViewModel appListViewModel, kotlin.coroutines.c<? super AppListViewModel$checkOcaPolicy$1> cVar) {
        super(2, cVar);
        this.this$0 = appListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AppListViewModel$checkOcaPolicy$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((AppListViewModel$checkOcaPolicy$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            com.voltasit.obdeleven.domain.usecases.agreement.a aVar = this.this$0.f31281u;
            this.label = 1;
            obj = aVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        C8.a aVar2 = (C8.a) obj;
        if (aVar2 instanceof C8.a.b) {
            C8.a.b bVar = (C8.a.b) aVar2;
            if (((C0699a) bVar.f2463a).f3440b) {
                this.this$0.b();
            } else {
                this.this$0.f32113b.j(PreloaderState.d.f32643a);
                this.this$0.f31255L.j(((C0699a) bVar.f2463a).f3441c);
            }
        } else if (aVar2 instanceof C8.a.C0024a) {
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            if (((C8.a.C0024a) aVar2).f2462a instanceof AgreementRepository.AgreementNotFound) {
                this.this$0.f31259P.j(r.f47939a);
            } else {
                this.this$0.f31257N.j("tag_check_policy");
            }
        }
        return r.f47939a;
    }
}
