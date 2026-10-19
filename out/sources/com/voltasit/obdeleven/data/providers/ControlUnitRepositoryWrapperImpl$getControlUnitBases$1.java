package com.voltasit.obdeleven.data.providers;

import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;
import p255u9.C2801d;

/* JADX INFO: compiled from: ControlUnitRepositoryWrapperImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.ControlUnitRepositoryWrapperImpl$getControlUnitBases$1", f = "ControlUnitRepositoryWrapperImpl.kt", l = {R.styleable.AppCompatTheme_actionModeTheme}, m = "invokeSuspend")
public final class ControlUnitRepositoryWrapperImpl$getControlUnitBases$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super C8.a<? extends Map<Short, ? extends C2801d>>>, Object> {
    int label;
    final /* synthetic */ ControlUnitRepositoryWrapperImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlUnitRepositoryWrapperImpl$getControlUnitBases$1(ControlUnitRepositoryWrapperImpl controlUnitRepositoryWrapperImpl, kotlin.coroutines.c<? super ControlUnitRepositoryWrapperImpl$getControlUnitBases$1> cVar) {
        super(2, cVar);
        this.this$0 = controlUnitRepositoryWrapperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new ControlUnitRepositoryWrapperImpl$getControlUnitBases$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super C8.a<? extends Map<Short, ? extends C2801d>>> cVar) {
        return ((ControlUnitRepositoryWrapperImpl$getControlUnitBases$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            K8.d dVar = this.this$0.f30213a;
            this.label = 1;
            obj = dVar.f(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
