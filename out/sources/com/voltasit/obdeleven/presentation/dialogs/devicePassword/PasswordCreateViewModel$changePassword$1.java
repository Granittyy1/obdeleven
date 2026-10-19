package com.voltasit.obdeleven.presentation.dialogs.devicePassword;

import Ia.l;
import Ia.p;
import com.voltasit.obdeleven.domain.usecases.device.C2119d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: PasswordCreateViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.dialogs.devicePassword.PasswordCreateViewModel$changePassword$1", f = "PasswordCreateViewModel.kt", l = {18}, m = "invokeSuspend")
final class PasswordCreateViewModel$changePassword$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ l<C8.a<r>, r> $callback;
    final /* synthetic */ String $password;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PasswordCreateViewModel$changePassword$1(d dVar, String str, l<? super C8.a<r>, r> lVar, kotlin.coroutines.c<? super PasswordCreateViewModel$changePassword$1> cVar) {
        super(2, cVar);
        this.this$0 = dVar;
        this.$password = str;
        this.$callback = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PasswordCreateViewModel$changePassword$1(this.this$0, this.$password, this.$callback, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((PasswordCreateViewModel$changePassword$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C2119d c2119d = this.this$0.f32256o;
            String str = this.$password;
            this.label = 1;
            obj = c2119d.a(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        this.$callback.invoke((C8.a) obj);
        return r.f47939a;
    }
}
