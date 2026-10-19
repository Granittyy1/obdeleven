package com.voltasit.obdeleven.presentation.appList;

import G8.C0700b;
import Ia.p;
import com.voltasit.obdeleven.core.DatabaseLanguage;
import com.voltasit.obdeleven.domain.models.UserPermission;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: AppListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.appList.AppListViewModel$downloadApps$1", f = "AppListViewModel.kt", l = {271, 287}, m = "invokeSuspend")
final class AppListViewModel$downloadApps$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ p279w9.a $appKey;
    final /* synthetic */ String $vehicleBaseId;
    Object L$0;
    int label;
    final /* synthetic */ AppListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppListViewModel$downloadApps$1(AppListViewModel appListViewModel, String str, p279w9.a aVar, kotlin.coroutines.c<? super AppListViewModel$downloadApps$1> cVar) {
        super(2, cVar);
        this.this$0 = appListViewModel;
        this.$vehicleBaseId = str;
        this.$appKey = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AppListViewModel$downloadApps$1(this.this$0, this.$vehicleBaseId, this.$appKey, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((AppListViewModel$downloadApps$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<I8.a> list;
        List<I8.a> list2;
        C8.a aVar;
        List<C0700b> list3;
        AppListViewModel appListViewModel;
        Iterator<I8.a> it;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.L$0;
                kotlin.b.b(obj);
            }
            aVar = (C8.a) obj;
            if (aVar instanceof C8.a.b) {
                list3 = (List) ((C8.a.b) aVar).f2463a;
            } else {
                if (aVar instanceof C8.a.C0024a) {
                    throw new NoWhenBranchMatchedException();
                }
                this.this$0.f31280t.d(((C8.a.C0024a) aVar).f2462a, false);
                list3 = EmptyList.f42983b;
            }
            AppListViewModel appListViewModel2 = this.this$0;
            appListViewModel2.getClass();
            i.e(list3, "<set-?>");
            appListViewModel2.f31271b0 = list3;
            appListViewModel = this.this$0;
            appListViewModel.getClass();
            it = list2.iterator();
            while (it.hasNext()) {
                j = it.next().f3912m;
                if (j > appListViewModel.f31272c0) {
                    appListViewModel.f31272c0 = j;
                }
            }
            this.this$0.f31246C.k(list2);
            return r.f47939a;
        }
        kotlin.b.b(obj);
        boolean zD = this.this$0.d(UserPermission.SEE_TESTING_OCA, UserPermission.SEE_NON_PUBLIC_OCAS);
        com.voltasit.obdeleven.domain.usecases.oca.d dVar = this.this$0.f31282v;
        String str = this.$vehicleBaseId;
        this.label = 1;
        obj = dVar.a(str, zD, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar2 = (C8.a) obj;
        if (aVar2 instanceof C8.a.b) {
            C8.a.b bVar = (C8.a.b) aVar2;
            this.this$0.f31283w.j(this.$appKey, bVar.f2463a);
            list = (List) bVar.f2463a;
        } else {
            if (!(aVar2 instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f31280t.d(((C8.a.C0024a) aVar2).f2462a, false);
            list = EmptyList.f42983b;
        }
        List<I8.a> list4 = list;
        ArrayList arrayList = new ArrayList(m.y(list4, 10));
        Iterator it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList.add(((I8.a) it2.next()).f3901a);
        }
        List<String> list5 = com.voltasit.obdeleven.a.f29638c;
        DatabaseLanguage databaseLanguageValueOf = DatabaseLanguage.valueOf(com.voltasit.obdeleven.a.C0320a.a(this.this$0.f31284x.getContext()).c());
        K8.a aVar3 = this.this$0.f31286z;
        this.L$0 = list;
        this.label = 2;
        Object objA = aVar3.a(arrayList, databaseLanguageValueOf, this);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        list2 = list;
        obj = objA;
        aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            list3 = (List) ((C8.a.b) aVar).f2463a;
        } else {
            if (aVar instanceof C8.a.C0024a) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f31280t.d(((C8.a.C0024a) aVar).f2462a, false);
            list3 = EmptyList.f42983b;
        }
        AppListViewModel appListViewModel3 = this.this$0;
        appListViewModel3.getClass();
        i.e(list3, "<set-?>");
        appListViewModel3.f31271b0 = list3;
        appListViewModel = this.this$0;
        appListViewModel.getClass();
        it = list2.iterator();
        while (it.hasNext()) {
            j = it.next().f3912m;
            if (j > appListViewModel.f31272c0) {
                appListViewModel.f31272c0 = j;
            }
        }
        this.this$0.f31246C.k(list2);
        return r.f47939a;
    }
}
