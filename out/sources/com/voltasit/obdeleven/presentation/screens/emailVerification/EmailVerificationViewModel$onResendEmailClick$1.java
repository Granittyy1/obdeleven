package com.voltasit.obdeleven.presentation.screens.emailVerification;

import Aa.c;
import Ia.p;
import androidx.compose.runtime.C1085f0;
import com.voltasit.obdeleven.domain.usecases.user.G;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: EmailVerificationViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationViewModel$onResendEmailClick$1", f = "EmailVerificationViewModel.kt", l = {R.styleable.AppCompatTheme_textColorAlertDialogListItem}, m = "invokeSuspend")
public final class EmailVerificationViewModel$onResendEmailClick$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ EmailVerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailVerificationViewModel$onResendEmailClick$1(EmailVerificationViewModel emailVerificationViewModel, kotlin.coroutines.c<? super EmailVerificationViewModel$onResendEmailClick$1> cVar) {
        super(2, cVar);
        this.this$0 = emailVerificationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new EmailVerificationViewModel$onResendEmailClick$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((EmailVerificationViewModel$onResendEmailClick$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            C1085f0 c1085f0 = this.this$0.f32940s;
            c1085f0.setValue(a.a((a) c1085f0.getValue(), null, null, false, true, null, 23));
            EmailVerificationViewModel emailVerificationViewModel = this.this$0;
            G g10 = emailVerificationViewModel.f32938q;
            String str = ((a) emailVerificationViewModel.f32940s.getValue()).f32948a;
            this.label = 1;
            obj = g10.a(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        C1085f0 c1085f1 = this.this$0.f32940s;
        c1085f1.setValue(a.a((a) c1085f1.getValue(), null, null, false, false, null, 23));
        if (aVar instanceof C8.a.b) {
            C1085f0 c1085f2 = this.this$0.f32940s;
            c1085f2.setValue(a.a((a) c1085f2.getValue(), null, null, false, false, null, 29));
        } else if (aVar instanceof C8.a.C0024a) {
            EmailVerificationViewModel.b(this.this$0, (C8.a.C0024a) aVar);
        }
        return r.f47939a;
    }
}
