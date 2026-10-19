package com.voltasit.obdeleven.presentation.controlunitlist.offline;

import Aa.c;
import Ia.p;
import K8.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: OfflineControlUnitListViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.controlunitlist.offline.OfflineControlUnitListViewModel$loadVehicle$1", f = "OfflineControlUnitListViewModel.kt", l = {R.styleable.AppCompatTheme_checkboxStyle}, m = "invokeSuspend")
final class OfflineControlUnitListViewModel$loadVehicle$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineControlUnitListViewModel$loadVehicle$1(a aVar, kotlin.coroutines.c<? super OfflineControlUnitListViewModel$loadVehicle$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OfflineControlUnitListViewModel$loadVehicle$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((OfflineControlUnitListViewModel$loadVehicle$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            a aVar = this.this$0;
            x xVar = aVar.f32050u;
            T tD = aVar.f32040p.d();
            i.b(tD);
            this.label = 1;
            obj = xVar.i((String) tD, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        C8.a aVar2 = (C8.a) obj;
        if (aVar2 instanceof C8.a.b) {
            this.this$0.f32047D = (E) ((C8.a.b) aVar2).f2463a;
        } else {
            if (!(aVar2 instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f32052w.j(r.f47939a);
        }
        r rVar = r.f47939a;
        Na.i iVar = E8.a.f3126a;
        return rVar;
    }
}
