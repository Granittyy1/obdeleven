package com.voltasit.obdeleven.presentation.signIn;

import Ia.p;
import com.parse.ParseException;
import com.voltasit.obdeleven.domain.exceptions.EmailAlreadyExistsException;
import com.voltasit.obdeleven.domain.exceptions.TemporaryPasswordMissingException;
import com.voltasit.obdeleven.domain.exceptions.TooManySessionsException;
import com.voltasit.obdeleven.domain.exceptions.TwitterAccessDenied;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import java.util.Date;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p220r9.J;
import p293xa.r;

/* JADX INFO: compiled from: SignInViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.signIn.SignInViewModel$onFacebookAuthSuccess$1", f = "SignInViewModel.kt", l = {R.styleable.AppCompatTheme_windowFixedWidthMajor}, m = "invokeSuspend")
final class SignInViewModel$onFacebookAuthSuccess$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ Date $expirationDate;
    final /* synthetic */ String $token;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInViewModel$onFacebookAuthSuccess$1(b bVar, String str, String str2, Date date, kotlin.coroutines.c<? super SignInViewModel$onFacebookAuthSuccess$1> cVar) {
        super(2, cVar);
        this.this$0 = bVar;
        this.$userId = str;
        this.$token = str2;
        this.$expirationDate = date;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SignInViewModel$onFacebookAuthSuccess$1(this.this$0, this.$userId, this.$token, this.$expirationDate, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SignInViewModel$onFacebookAuthSuccess$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f33239r.f("SignInViewModel", "onFacebookAuthSuccess()");
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            com.voltasit.obdeleven.domain.usecases.user.r rVar = this.this$0.f33237p;
            G8.r.b bVar = new G8.r.b(this.$userId, this.$token, this.$expirationDate);
            this.label = 1;
            obj = com.voltasit.obdeleven.domain.usecases.user.r.b(rVar, bVar, null, null, this, 4);
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
            this.this$0.f33242u.j(r.f47939a);
        } else if (aVar instanceof C8.a.C0024a) {
            Throwable th = ((C8.a.C0024a) aVar).f2462a;
            if (kotlin.jvm.internal.i.a(th, TemporaryPasswordMissingException.f30435b)) {
                this.this$0.f33232G.j(new G8.r.b(this.$userId, this.$token, this.$expirationDate));
            } else {
                b bVar2 = this.this$0;
                J8.p pVar = bVar2.f33239r;
                pVar.d(th, false);
                if (th instanceof TooManySessionsException) {
                    bVar2.f33234I.j(Integer.valueOf(((TooManySessionsException) th).a()));
                } else {
                    boolean z10 = th instanceof ParseException;
                    J8.d dVar = bVar2.f33238q;
                    U7.a<String> aVar2 = bVar2.j;
                    if (z10) {
                        aVar2.j(dVar.a(J.h(((ParseException) th).getCode()), new Object[0]));
                    } else if (th instanceof TwitterAccessDenied) {
                        pVar.d(th, false);
                    } else if (th instanceof EmailAlreadyExistsException) {
                        aVar2.j(dVar.a(com.voltasit.obdeleven.R.string.view_signin_account_with_this_email_exists, ((EmailAlreadyExistsException) th).a()));
                    } else {
                        pVar.d(th, false);
                        aVar2.j(dVar.a(com.voltasit.obdeleven.R.string.common_something_went_wrong, new Object[0]));
                    }
                }
            }
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
