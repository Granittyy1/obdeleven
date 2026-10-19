package com.voltasit.obdeleven.presentation.screens.emailVerification;

import Aa.c;
import Ia.p;
import K8.v;
import androidx.compose.runtime.C1085f0;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: EmailVerificationViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationViewModel$onConfirmationNextClick$1", f = "EmailVerificationViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "invokeSuspend")
final class EmailVerificationViewModel$onConfirmationNextClick$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ EmailVerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailVerificationViewModel$onConfirmationNextClick$1(EmailVerificationViewModel emailVerificationViewModel, kotlin.coroutines.c<? super EmailVerificationViewModel$onConfirmationNextClick$1> cVar) {
        super(2, cVar);
        this.this$0 = emailVerificationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new EmailVerificationViewModel$onConfirmationNextClick$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((EmailVerificationViewModel$onConfirmationNextClick$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            C1085f0 c1085f0 = this.this$0.f32940s;
            c1085f0.setValue(a.a((a) c1085f0.getValue(), null, null, false, true, TryAgainAction.f32944b, 7));
            v vVar = this.this$0.f32936o;
            this.label = 1;
            obj = vVar.F(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        C1085f0 c1085f1 = this.this$0.f32940s;
        c1085f1.setValue(a.a((a) c1085f1.getValue(), null, null, false, false, null, 23));
        if (((C8.a) obj) instanceof C8.a.C0024a) {
            C1085f0 c1085f2 = this.this$0.f32940s;
            c1085f2.setValue(a.a((a) c1085f2.getValue(), null, null, false, false, TryAgainAction.f32946d, 15));
            return r.f47939a;
        }
        if (this.this$0.f32936o.L().getBoolean("emailVerified")) {
            this.this$0.f32942u.f(r.f47939a);
        } else {
            C1085f0 c1085f3 = this.this$0.f32940s;
            c1085f3.setValue(a.a((a) c1085f3.getValue(), null, new Integer(com.voltasit.obdeleven.R.string.view_email_verification_not_confirmed_error), false, false, null, 29));
        }
        return r.f47939a;
    }
}
