package com.voltasit.obdeleven.core.app;

import com.voltasit.obdeleven.domain.models.Feature;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: SfdUnlockCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.core.app.SfdUnlockCommand$unlockCu$output$1", f = "SfdUnlockCommand.kt", l = {44}, m = "invokeSuspend")
final class SfdUnlockCommand$unlockCu$output$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super C8.a<? extends Boolean>>, Object> {
    final /* synthetic */ String $cuBaseId;
    final /* synthetic */ short $klineId;
    int label;
    final /* synthetic */ l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfdUnlockCommand$unlockCu$output$1(l0 l0Var, String str, short s10, kotlin.coroutines.c<? super SfdUnlockCommand$unlockCu$output$1> cVar) {
        super(2, cVar);
        this.this$0 = l0Var;
        this.$cuBaseId = str;
        this.$klineId = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SfdUnlockCommand$unlockCu$output$1(this.this$0, this.$cuBaseId, this.$klineId, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super C8.a<? extends Boolean>> cVar) {
        return ((SfdUnlockCommand$unlockCu$output$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.domain.usecases.sfd.j jVar = this.this$0.f30114k;
            String str = this.$cuBaseId;
            short s10 = this.$klineId;
            Feature feature = Feature.Oca;
            this.label = 1;
            obj = jVar.a(str, s10, feature, this);
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
