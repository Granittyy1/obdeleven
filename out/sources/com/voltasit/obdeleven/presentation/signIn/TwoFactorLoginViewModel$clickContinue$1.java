package com.voltasit.obdeleven.presentation.signIn;

import Ia.p;
import com.voltasit.obdeleven.domain.exceptions.AccountLockedDueToMultipleAttemptsException;
import com.voltasit.obdeleven.domain.exceptions.TemporaryPasswordIncorrectException;
import com.voltasit.obdeleven.domain.exceptions.TooManySessionsException;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: TwoFactorLoginViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.signIn.TwoFactorLoginViewModel$clickContinue$1", f = "TwoFactorLoginViewModel.kt", l = {R.styleable.AppCompatTheme_colorPrimary}, m = "invokeSuspend")
final class TwoFactorLoginViewModel$clickContinue$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoFactorLoginViewModel$clickContinue$1(l lVar, String str, kotlin.coroutines.c<? super TwoFactorLoginViewModel$clickContinue$1> cVar) {
        super(2, cVar);
        this.this$0 = lVar;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new TwoFactorLoginViewModel$clickContinue$1(this.this$0, this.$code, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((TwoFactorLoginViewModel$clickContinue$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            l lVar = this.this$0;
            com.voltasit.obdeleven.domain.usecases.user.r rVar = lVar.f33263p;
            String str = this.$code;
            this.label = 1;
            obj = com.voltasit.obdeleven.domain.usecases.user.r.b(rVar, lVar.f33262o, str, null, this, 4);
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
            this.this$0.f33265r.j(r.f47939a);
        } else if (aVar instanceof C8.a.C0024a) {
            Throwable th = ((C8.a.C0024a) aVar).f2462a;
            if (kotlin.jvm.internal.i.a(th, TemporaryPasswordIncorrectException.f30434b)) {
                this.this$0.f33267t.j(new Integer(com.voltasit.obdeleven.R.string.view_two_factor_invalid_auth_code));
            } else if (th instanceof AccountLockedDueToMultipleAttemptsException) {
                l lVar2 = this.this$0;
                lVar2.j.j(lVar2.f33264q.a(com.voltasit.obdeleven.R.string.view_login_account_locked_try_again, ((AccountLockedDueToMultipleAttemptsException) th).a()));
            } else if (th instanceof TooManySessionsException) {
                B7.b.h(((TooManySessionsException) th).a(), this.this$0.f33273z);
            } else {
                B7.b.h(com.voltasit.obdeleven.R.string.common_something_went_wrong, this.this$0.f32119h);
            }
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
