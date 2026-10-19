package com.voltasit.obdeleven.presentation.appList;

import Ia.p;
import com.voltasit.obdeleven.domain.exceptions.VehicleNotConnectedException;
import com.voltasit.obdeleven.domain.usecases.C;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: AppListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.appList.AppListViewModel$backupCompleted$1", f = "AppListViewModel.kt", l = {180}, m = "invokeSuspend")
final class AppListViewModel$backupCompleted$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ AppListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppListViewModel$backupCompleted$1(AppListViewModel appListViewModel, kotlin.coroutines.c<? super AppListViewModel$backupCompleted$1> cVar) {
        super(2, cVar);
        this.this$0 = appListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AppListViewModel$backupCompleted$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((AppListViewModel$backupCompleted$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8.a c0024a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C c10 = this.this$0.f31277q;
            r rVar = r.f47939a;
            this.label = 1;
            c10.getClass();
            try {
                String objectId = c10.f30613c.k().f42726c.getObjectId();
                String objectId2 = c10.f30614d.L().getObjectId();
                p084g8.b bVar = c10.f30615e;
                i.b(objectId2);
                i.b(objectId);
                bVar.c(objectId2, objectId);
                c0024a = new C8.a.b(Boolean.TRUE);
            } catch (VehicleNotConnectedException e10) {
                c0024a = new C8.a.C0024a(e10);
            }
            if (c0024a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        AppListViewModel.f(this.this$0, null, null, false, 3);
        U7.a<r> aVar = this.this$0.f31265V;
        r rVar2 = r.f47939a;
        aVar.j(rVar2);
        return rVar2;
    }
}
