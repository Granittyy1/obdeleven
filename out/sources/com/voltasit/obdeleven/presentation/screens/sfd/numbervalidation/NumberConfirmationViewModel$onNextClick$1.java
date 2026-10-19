package com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation;

import Aa.c;
import G8.C0707i;
import Ia.p;
import K8.v;
import com.voltasit.obdeleven.domain.models.Screen;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: NumberConfirmationViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.sfd.numbervalidation.NumberConfirmationViewModel$onNextClick$1", f = "NumberConfirmationViewModel.kt", l = {R.styleable.AppCompatTheme_colorPrimaryDark}, m = "invokeSuspend")
final class NumberConfirmationViewModel$onNextClick$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ NumberConfirmationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberConfirmationViewModel$onNextClick$1(NumberConfirmationViewModel numberConfirmationViewModel, kotlin.coroutines.c<? super NumberConfirmationViewModel$onNextClick$1> cVar) {
        super(2, cVar);
        this.this$0 = numberConfirmationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new NumberConfirmationViewModel$onNextClick$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((NumberConfirmationViewModel$onNextClick$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            NumberConfirmationViewModel numberConfirmationViewModel = this.this$0;
            numberConfirmationViewModel.f33066d.setValue(a.a(numberConfirmationViewModel.b(), null, true, "", 3));
            NumberConfirmationViewModel numberConfirmationViewModel2 = this.this$0;
            v vVar = numberConfirmationViewModel2.f33065c;
            String str = numberConfirmationViewModel2.b().f33070b;
            this.label = 1;
            obj = vVar.s(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        if (!(((C8.a) obj) instanceof C8.a.C0024a)) {
            NumberConfirmationViewModel numberConfirmationViewModel3 = this.this$0;
            numberConfirmationViewModel3.f33064b.a(new C0707i(Screen.PhoneNumberConfirmationSuccess, x.o(new Pair("mobile", numberConfirmationViewModel3.b().f33069a)), false, null, 12));
            return r.f47939a;
        }
        NumberConfirmationViewModel numberConfirmationViewModel4 = this.this$0;
        numberConfirmationViewModel4.f33066d.setValue(a.a(numberConfirmationViewModel4.b(), null, false, this.this$0.f33063a.a(com.voltasit.obdeleven.R.string.view_number_confirmation_invalid_code, new Object[0]), 3));
        return r.f47939a;
    }
}
