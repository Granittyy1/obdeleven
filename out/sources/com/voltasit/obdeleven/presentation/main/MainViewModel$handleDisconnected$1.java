package com.voltasit.obdeleven.presentation.main;

import Ia.p;
import K8.x;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.presentation.models.StartView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import p293xa.r;

/* JADX INFO: compiled from: MainViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.main.MainViewModel$handleDisconnected$1", f = "MainViewModel.kt", l = {271}, m = "invokeSuspend")
public final class MainViewModel$handleDisconnected$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ MainViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$handleDisconnected$1(MainViewModel mainViewModel, kotlin.coroutines.c<? super MainViewModel$handleDisconnected$1> cVar) {
        super(2, cVar);
        this.this$0 = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainViewModel$handleDisconnected$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((MainViewModel$handleDisconnected$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            x xVar = this.this$0.f32614y;
            this.label = 1;
            obj = xVar.j(this);
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
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        if (aVar instanceof C8.a.b) {
            MainViewModel mainViewModel = this.this$0;
            List list = (List) ((C8.a.b) aVar).f2463a;
            mainViewModel.getClass();
            if (list.size() <= 1 || mainViewModel.f32601r.a0() != StartView.AUTO) {
                C2680e.c(Z.a(mainViewModel), mainViewModel.f32112a, null, new MainViewModel$showCar$1(mainViewModel, list, null), 2);
            } else {
                mainViewModel.f32585e0.j(com.voltasit.obdeleven.presentation.components.coverLayout.a.b.f31382a);
            }
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f32537G.d(((C8.a.C0024a) aVar).f2462a, false);
        }
        r rVar = r.f47939a;
        Na.i iVar = E8.a.f3126a;
        return rVar;
    }
}
