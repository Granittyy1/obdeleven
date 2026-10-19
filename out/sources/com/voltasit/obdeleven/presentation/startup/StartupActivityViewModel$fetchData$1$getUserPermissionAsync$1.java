package com.voltasit.obdeleven.presentation.startup;

import Aa.c;
import C8.a;
import Ia.p;
import com.voltasit.obdeleven.domain.usecases.user.i;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: StartupActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.startup.StartupActivityViewModel$fetchData$1$getUserPermissionAsync$1", f = "StartupActivityViewModel.kt", l = {R.styleable.AppCompatTheme_colorError}, m = "invokeSuspend")
public final class StartupActivityViewModel$fetchData$1$getUserPermissionAsync$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super a<? extends r>>, Object> {
    int label;
    final /* synthetic */ StartupActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartupActivityViewModel$fetchData$1$getUserPermissionAsync$1(StartupActivityViewModel startupActivityViewModel, kotlin.coroutines.c<? super StartupActivityViewModel$fetchData$1$getUserPermissionAsync$1> cVar) {
        super(2, cVar);
        this.this$0 = startupActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new StartupActivityViewModel$fetchData$1$getUserPermissionAsync$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super a<? extends r>> cVar) {
        return ((StartupActivityViewModel$fetchData$1$getUserPermissionAsync$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            i iVar = this.this$0.f33282r;
            this.label = 1;
            obj = iVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return obj;
    }
}
