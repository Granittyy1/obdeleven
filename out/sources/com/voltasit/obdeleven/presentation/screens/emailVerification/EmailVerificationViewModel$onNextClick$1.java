package com.voltasit.obdeleven.presentation.screens.emailVerification;

import Aa.c;
import G8.C0707i;
import Ia.p;
import androidx.compose.runtime.C1085f0;
import com.voltasit.obdeleven.domain.models.Screen;
import com.voltasit.obdeleven.domain.usecases.user.G;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: EmailVerificationViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationViewModel$onNextClick$1", f = "EmailVerificationViewModel.kt", l = {R.styleable.AppCompatTheme_colorButtonNormal}, m = "invokeSuspend")
public final class EmailVerificationViewModel$onNextClick$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ EmailVerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailVerificationViewModel$onNextClick$1(EmailVerificationViewModel emailVerificationViewModel, kotlin.coroutines.c<? super EmailVerificationViewModel$onNextClick$1> cVar) {
        super(2, cVar);
        this.this$0 = emailVerificationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new EmailVerificationViewModel$onNextClick$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((EmailVerificationViewModel$onNextClick$1) create(a10, cVar)).invokeSuspend(r.f47939a);
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
            EmailVerificationViewModel emailVerificationViewModel2 = this.this$0;
            emailVerificationViewModel2.f32939r.a(new C0707i(Screen.f30525f, x.o(new Pair("email", ((a) emailVerificationViewModel2.f32940s.getValue()).f32948a)), false, null, 12));
        } else if (aVar instanceof C8.a.C0024a) {
            EmailVerificationViewModel.b(this.this$0, (C8.a.C0024a) aVar);
        }
        return r.f47939a;
    }
}
