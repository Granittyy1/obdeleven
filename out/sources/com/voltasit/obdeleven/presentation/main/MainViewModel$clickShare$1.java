package com.voltasit.obdeleven.presentation.main;

import Ia.p;
import android.content.Intent;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.A;
import p134k8.a2;
import p220r9.B;
import p220r9.z;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: MainViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.main.MainViewModel$clickShare$1", f = "MainViewModel.kt", l = {685}, m = "invokeSuspend")
final class MainViewModel$clickShare$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ a2 $vehicle;
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$clickShare$1(MainViewModel mainViewModel, a2 a2Var, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$vehicle = a2Var;
        this.this$0 = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainViewModel$clickShare$1(this.this$0, this.$vehicle, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((MainViewModel$clickShare$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            a2 vehicle = this.$vehicle;
            kotlin.jvm.internal.i.e(vehicle, "vehicle");
            com.voltasit.obdeleven.domain.usecases.A a10 = this.this$0.f32527B;
            this.label = 1;
            obj = a10.i0(this);
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
            MainViewModel mainViewModel = this.this$0;
            a2 a2Var = this.$vehicle;
            List list = (List) ((C8.a.b) aVar).f2463a;
            J8.d dVar = mainViewModel.f32595o;
            String strH = B.h(dVar.getContext(), a2Var, o.b(q.p0(list)));
            String strH0 = mainViewModel.f32601r.h0();
            z zVar = new z(dVar.getContext());
            zVar.c(R.string.view_main_share_dtcs);
            zVar.f46510c = strH0;
            E e10 = a2Var.f42726c;
            zVar.f46515h = e10.k();
            zVar.f46513f = e10.d();
            zVar.f46514g = e10.e();
            zVar.b(strH);
            Intent intentA = zVar.a();
            UserTrackingUtils.c(UserTrackingUtils.Key.f34243D, 1);
            mainViewModel.f32113b.j(PreloaderState.d.f32643a);
            mainViewModel.f32570W0.j(intentA);
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            this.this$0.f32537G.d(((C8.a.C0024a) aVar).f2462a, false);
        }
        r rVar = r.f47939a;
        Na.i iVar = E8.a.f3126a;
        return rVar;
    }
}
