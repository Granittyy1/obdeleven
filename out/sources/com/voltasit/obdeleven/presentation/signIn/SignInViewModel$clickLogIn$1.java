package com.voltasit.obdeleven.presentation.signIn;

import Ia.p;
import androidx.lifecycle.C;
import com.voltasit.obdeleven.domain.exceptions.AccountLockedDueToMultipleAttemptsException;
import com.voltasit.obdeleven.domain.exceptions.EmailEmptyException;
import com.voltasit.obdeleven.domain.exceptions.EmailNotVerifiedException;
import com.voltasit.obdeleven.domain.exceptions.EmailPasswordIncorrectException;
import com.voltasit.obdeleven.domain.exceptions.HttpException;
import com.voltasit.obdeleven.domain.exceptions.InvalidEmailException;
import com.voltasit.obdeleven.domain.exceptions.PasswordEmptyException;
import com.voltasit.obdeleven.domain.exceptions.TemporaryPasswordMissingException;
import com.voltasit.obdeleven.domain.exceptions.TooManySessionsException;
import com.voltasit.obdeleven.domain.exceptions.UnknownErrorException;
import com.voltasit.obdeleven.domain.exceptions.UserSetupErrorException;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SignInViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.signIn.SignInViewModel$clickLogIn$1", f = "SignInViewModel.kt", l = {R.styleable.AppCompatTheme_dividerVertical}, m = "invokeSuspend")
final class SignInViewModel$clickLogIn$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ String $email;
    final /* synthetic */ String $password;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInViewModel$clickLogIn$1(b bVar, String str, String str2, kotlin.coroutines.c<? super SignInViewModel$clickLogIn$1> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
        this.$email = str;
        this.$password = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SignInViewModel$clickLogIn$1(this.this$0, this.$email, this.$password, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SignInViewModel$clickLogIn$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            com.voltasit.obdeleven.domain.usecases.user.r rVar = this.this$0.f33237p;
            G8.r.a aVar = new G8.r.a(this.$email, this.$password);
            this.label = 1;
            obj = com.voltasit.obdeleven.domain.usecases.user.r.b(rVar, aVar, null, null, this, 6);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        C8.a aVar2 = (C8.a) obj;
        if (aVar2 instanceof C8.a.b) {
            this.this$0.f33242u.j(r.f47939a);
        } else if (aVar2 instanceof C8.a.C0024a) {
            b bVar = this.this$0;
            C8.a.C0024a c0024a = (C8.a.C0024a) aVar2;
            String str = this.$email;
            String str2 = this.$password;
            bVar.getClass();
            Throwable th = c0024a.f2462a;
            if (kotlin.jvm.internal.i.a(th, EmailNotVerifiedException.f30402b)) {
                bVar.f33226A.j(new b.a(str, str2));
            } else {
                boolean zA = kotlin.jvm.internal.i.a(th, EmailPasswordIncorrectException.f30403b);
                U7.a<Integer> aVar3 = bVar.f32119h;
                if (zA) {
                    bVar.f33228C.j(r.f47939a);
                    aVar3.j(Integer.valueOf(com.voltasit.obdeleven.R.string.view_signin_username_and_password_dont_match));
                } else if (kotlin.jvm.internal.i.a(th, TemporaryPasswordMissingException.f30435b)) {
                    bVar.f33232G.j(new G8.r.a(str, str2));
                } else if (kotlin.jvm.internal.i.a(th, UnknownErrorException.f30436b)) {
                    aVar3.j(Integer.valueOf(com.voltasit.obdeleven.R.string.view_signin_could_not_login));
                } else if (kotlin.jvm.internal.i.a(th, UserSetupErrorException.f30438b)) {
                    bVar.f33240s.j(Boolean.TRUE);
                } else {
                    boolean zA2 = kotlin.jvm.internal.i.a(th, EmailEmptyException.f30401b);
                    C<Integer> c10 = bVar.f33244w;
                    if (zA2) {
                        c10.j(Integer.valueOf(com.voltasit.obdeleven.R.string.common_please_enter_email));
                    } else {
                        boolean zA3 = kotlin.jvm.internal.i.a(th, PasswordEmptyException.f30415b);
                        J8.d dVar = bVar.f33238q;
                        if (zA3) {
                            bVar.f33246y.j(dVar.getContext().getString(com.voltasit.obdeleven.R.string.common_please_enter_password));
                        } else if (kotlin.jvm.internal.i.a(th, InvalidEmailException.f30409b)) {
                            c10.j(Integer.valueOf(com.voltasit.obdeleven.R.string.common_email_invalid));
                        } else {
                            boolean z10 = th instanceof AccountLockedDueToMultipleAttemptsException;
                            U7.a<String> aVar4 = bVar.j;
                            if (z10) {
                                aVar4.j(dVar.a(com.voltasit.obdeleven.R.string.view_login_account_locked_try_again, ((AccountLockedDueToMultipleAttemptsException) th).a()));
                            } else if (th instanceof TooManySessionsException) {
                                bVar.f33234I.j(Integer.valueOf(((TooManySessionsException) th).a()));
                            } else if (kotlin.jvm.internal.i.a(th, HttpException.Forbidden.f30406b)) {
                                aVar3.j(Integer.valueOf(com.voltasit.obdeleven.R.string.something_went_wrong));
                            } else if (kotlin.jvm.internal.i.a(th, HttpException.TooManyRequests.f30407b)) {
                                aVar4.j(dVar.a(com.voltasit.obdeleven.R.string.view_login_account_locked_try_again, 60));
                            } else {
                                aVar3.j(Integer.valueOf(E8.b.a(c0024a.f2462a)));
                            }
                        }
                    }
                }
            }
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
