package com.voltasit.obdeleven.presentation.dialogs.devicePassword;

import Ia.l;
import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: PasswordEnterViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.dialogs.devicePassword.PasswordEnterViewModel$onOkClick$1", f = "PasswordEnterViewModel.kt", l = {22}, m = "invokeSuspend")
final class PasswordEnterViewModel$onOkClick$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ l<Boolean, r> $callback;
    final /* synthetic */ String $deviceId;
    final /* synthetic */ String $pin;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PasswordEnterViewModel$onOkClick$1(g gVar, String str, String str2, l<? super Boolean, r> lVar, kotlin.coroutines.c<? super PasswordEnterViewModel$onOkClick$1> cVar) {
        super(2, cVar);
        this.this$0 = gVar;
        this.$deviceId = str;
        this.$pin = str2;
        this.$callback = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PasswordEnterViewModel$onOkClick$1(this.this$0, this.$deviceId, this.$pin, this.$callback, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((PasswordEnterViewModel$onOkClick$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            K8.f fVar = this.this$0.f32260p;
            String str = this.$deviceId;
            String str2 = this.$pin;
            this.label = 1;
            obj = fVar.p(str, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        this.$callback.invoke(Boolean.valueOf(((C8.a) obj) instanceof C8.a.b));
        return r.f47939a;
    }
}
