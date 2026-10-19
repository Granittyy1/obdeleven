package com.voltasit.obdeleven.presentation.appList;

import Ia.p;
import com.voltasit.obdeleven.domain.models.AgreementType;
import com.voltasit.obdeleven.domain.repositories.AgreementRepository;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: AppListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.appList.AppListViewModel$signAgreement$1", f = "AppListViewModel.kt", l = {253}, m = "invokeSuspend")
final class AppListViewModel$signAgreement$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ AppListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppListViewModel$signAgreement$1(AppListViewModel appListViewModel, kotlin.coroutines.c<? super AppListViewModel$signAgreement$1> cVar) {
        super(2, cVar);
        this.this$0 = appListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AppListViewModel$signAgreement$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((AppListViewModel$signAgreement$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            AgreementRepository agreementRepository = this.this$0.f31279s;
            int iA = AgreementType.OCA_AGREEMENT.a();
            this.label = 1;
            obj = agreementRepository.i(iA, this);
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
            this.this$0.b();
        } else if (aVar instanceof C8.a.C0024a) {
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            this.this$0.f31257N.j("tag_sign_agreement");
            this.this$0.f31280t.c("AppListViewModel", "Unable to get agreement: " + ((C8.a.C0024a) aVar).f2462a.getMessage());
        }
        return r.f47939a;
    }
}
