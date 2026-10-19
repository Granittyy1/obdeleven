package com.voltasit.obdeleven.presentation.main;

import Ia.p;
import K8.o;
import androidx.lifecycle.C;
import com.voltasit.obdeleven.domain.usecases.LoadVehicleIntoCacheUseCase;
import com.voltasit.obdeleven.presentation.models.StartView;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: MainViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.main.MainViewModel$showCar$1", f = "MainViewModel.kt", l = {318}, m = "invokeSuspend")
final class MainViewModel$showCar$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ List<E> $items;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainViewModel$showCar$1(MainViewModel mainViewModel, List<? extends E> list, kotlin.coroutines.c<? super MainViewModel$showCar$1> cVar) {
        super(2, cVar);
        this.this$0 = mainViewModel;
        this.$items = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainViewModel$showCar$1(this.this$0, this.$items, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((MainViewModel$showCar$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.voltasit.obdeleven.presentation.components.coverLayout.a c0332a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            LoadVehicleIntoCacheUseCase loadVehicleIntoCacheUseCase = this.this$0.f32616z;
            List<E> list = this.$items;
            this.label = 1;
            o oVar = loadVehicleIntoCacheUseCase.f30617c;
            StartView startViewA0 = oVar.a0();
            StartView startView = StartView.CAR;
            p279w9.a aVar = p279w9.a.f47808e;
            K8.b bVar = loadVehicleIntoCacheUseCase.f30618d;
            if (startViewA0 == startView) {
                String strO0 = oVar.o0();
                Iterator<E> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = new C8.a.C0024a(new LoadVehicleIntoCacheUseCase.NoCarForStartViewException());
                        break;
                    }
                    E next = it.next();
                    if (kotlin.jvm.internal.i.a(next.getObjectId(), strO0)) {
                        bVar.j(aVar, next);
                        obj = new C8.a.b(next);
                        break;
                    }
                }
            } else {
                if (oVar.a0() != StartView.AUTO || list.size() != 1) {
                    obj = new C8.a.C0024a(new LoadVehicleIntoCacheUseCase.NoCarForStartViewException());
                    break;
                }
                bVar.j(aVar, list.get(0));
                obj = new C8.a.b(list.get(0));
            }
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
        C<com.voltasit.obdeleven.presentation.components.coverLayout.a> c10 = this.this$0.f32585e0;
        if (aVar2 instanceof C8.a.b) {
            c0332a = new com.voltasit.obdeleven.presentation.components.coverLayout.a.C0332a((E) ((C8.a.b) aVar2).f2463a);
        } else {
            if (!(aVar2 instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            c0332a = com.voltasit.obdeleven.presentation.components.coverLayout.a.b.f31382a;
        }
        c10.j(c0332a);
        return r.f47939a;
    }
}
