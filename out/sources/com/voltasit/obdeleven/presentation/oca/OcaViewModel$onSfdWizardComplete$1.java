package com.voltasit.obdeleven.presentation.oca;

import Ia.p;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.core.app.C2098m;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import p255u9.E;
import p293xa.r;

/* JADX INFO: compiled from: OcaViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.oca.OcaViewModel$onSfdWizardComplete$1", f = "OcaViewModel.kt", l = {}, m = "invokeSuspend")
final class OcaViewModel$onSfdWizardComplete$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcaViewModel$onSfdWizardComplete$1(k kVar, kotlin.coroutines.c<? super OcaViewModel$onSfdWizardComplete$1> cVar) {
        super(2, cVar);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new OcaViewModel$onSfdWizardComplete$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((OcaViewModel$onSfdWizardComplete$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        this.this$0.f32763r.f("OcaViewModel", "onSfdWizardComplete()");
        this.this$0.f32113b.j(PreloaderState.c.f32642a);
        k kVar = this.this$0;
        m mVar = kVar.f32736T;
        if (mVar == null) {
            kVar.i(2);
            return r.f47939a;
        }
        kotlin.jvm.internal.i.b(mVar);
        m mVar2 = this.this$0.f32736T;
        kotlin.jvm.internal.i.b(mVar2);
        m mVar3 = this.this$0.f32736T;
        kotlin.jvm.internal.i.b(mVar3);
        C2098m appWorker = mVar.f32786a;
        kotlin.jvm.internal.i.e(appWorker, "appWorker");
        E vehicle = mVar3.f32789d;
        kotlin.jvm.internal.i.e(vehicle, "vehicle");
        C2680e.c(Z.a(kVar), kVar.f32112a, null, new OcaViewModel$writeValue$1(kVar, mVar.f32787b, mVar2.f32788c, appWorker, vehicle, null), 2);
        return r.f47939a;
    }
}
