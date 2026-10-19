package com.voltasit.obdeleven.presentation.twofactorauth.backupCode;

import Aa.c;
import Ia.p;
import J4.n;
import com.voltasit.obdeleven.domain.exceptions.AccountLockedDueToMultipleAttemptsException;
import com.voltasit.obdeleven.domain.exceptions.TemporaryPasswordIncorrectException;
import com.voltasit.obdeleven.domain.exceptions.TooManySessionsException;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: LoginTwoFactorBackupCodeViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.twofactorauth.backupCode.LoginTwoFactorBackupCodeViewModel$buttonClick$1", f = "LoginTwoFactorBackupCodeViewModel.kt", l = {R.styleable.AppCompatTheme_buttonBarStyle}, m = "invokeSuspend")
final class LoginTwoFactorBackupCodeViewModel$buttonClick$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginTwoFactorBackupCodeViewModel$buttonClick$1(b bVar, kotlin.coroutines.c<? super LoginTwoFactorBackupCodeViewModel$buttonClick$1> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LoginTwoFactorBackupCodeViewModel$buttonClick$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((LoginTwoFactorBackupCodeViewModel$buttonClick$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            this.this$0.f33304q.j(new Integer(-1));
            b bVar = this.this$0;
            com.voltasit.obdeleven.domain.usecases.user.r rVar = bVar.f33325z;
            String strD = bVar.f33306s.d();
            i.b(strD);
            Locale locale = Locale.ROOT;
            String strD2 = n.d(locale, "ROOT", strD, locale, "toLowerCase(...)");
            this.label = 1;
            obj = com.voltasit.obdeleven.domain.usecases.user.r.b(rVar, bVar.f33324y, null, strD2, this, 2);
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
            this.this$0.f33320B.j(r.f47939a);
        } else if (aVar instanceof C8.a.C0024a) {
            Throwable th = ((C8.a.C0024a) aVar).f2462a;
            if (i.a(th, TemporaryPasswordIncorrectException.f30434b)) {
                this.this$0.f33304q.j(new Integer(com.voltasit.obdeleven.R.string.view_two_factor_invalid_backup_code));
            } else if (th instanceof AccountLockedDueToMultipleAttemptsException) {
                b bVar2 = this.this$0;
                bVar2.j.j(bVar2.f33319A.a(com.voltasit.obdeleven.R.string.view_login_account_locked_try_again, ((AccountLockedDueToMultipleAttemptsException) th).a()));
            } else if (th instanceof TooManySessionsException) {
                B7.b.h(((TooManySessionsException) th).a(), this.this$0.f33322D);
            } else {
                B7.b.h(com.voltasit.obdeleven.R.string.common_something_went_wrong, this.this$0.f32119h);
            }
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
