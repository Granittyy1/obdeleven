package com.voltasit.obdeleven.ui.activity;

import com.obdeleven.service.interfaces.IDevice;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.exceptions.NotFoundException;
import com.voltasit.obdeleven.domain.usecases.device.C;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: MainActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.ui.activity.MainActivityViewModel$handleConnectionFailed$1", f = "MainActivityViewModel.kt", l = {294}, m = "invokeSuspend")
final class MainActivityViewModel$handleConnectionFailed$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ IDevice $device;
    final /* synthetic */ Throwable $exception;
    int label;
    final /* synthetic */ MainActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivityViewModel$handleConnectionFailed$1(MainActivityViewModel mainActivityViewModel, IDevice iDevice, Throwable th, kotlin.coroutines.c<? super MainActivityViewModel$handleConnectionFailed$1> cVar) {
        super(2, cVar);
        this.this$0 = mainActivityViewModel;
        this.$device = iDevice;
        this.$exception = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new MainActivityViewModel$handleConnectionFailed$1(this.this$0, this.$device, this.$exception, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((MainActivityViewModel$handleConnectionFailed$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C c10 = this.this$0.f33588G;
            String strF = this.$device.f();
            kotlin.jvm.internal.i.d(strF, "getAddress(...)");
            this.label = 1;
            c10.getClass();
            obj = c10.f30759a.k(kotlin.text.m.G(strF, ":", ""), this);
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
        if ((aVar instanceof C8.a.C0024a) && (((C8.a.C0024a) aVar).f2462a instanceof NotFoundException)) {
            this.this$0.f33652t.e("MainActivityViewModel", "Showing bad selected bluetooth device warning");
            this.this$0.f33591H0.j(Boolean.TRUE);
        } else {
            MainActivityViewModel mainActivityViewModel = this.this$0;
            Throwable th = this.$exception;
            if (th != null) {
                mainActivityViewModel.f33652t.d(th, false);
            }
            mainActivityViewModel.f32119h.j(Integer.valueOf(R.string.common_unable_to_connect));
            W7.c.g(0);
        }
        return p293xa.r.f47939a;
    }
}
