package com.voltasit.obdeleven.presentation.twofactorauth.verify;

import Ia.p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: TwoFactorVerifyViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.twofactorauth.verify.TwoFactorVerifyViewModel$clickContinue$1", f = "TwoFactorVerifyViewModel.kt", l = {R.styleable.AppCompatTheme_buttonStyle, R.styleable.AppCompatTheme_checkboxStyle}, m = "invokeSuspend")
final class TwoFactorVerifyViewModel$clickContinue$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoFactorVerifyViewModel$clickContinue$1(e eVar, String str, kotlin.coroutines.c<? super TwoFactorVerifyViewModel$clickContinue$1> cVar) {
        super(2, cVar);
        this.this$0 = eVar;
        this.$code = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new TwoFactorVerifyViewModel$clickContinue$1(this.this$0, this.$code, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((TwoFactorVerifyViewModel$clickContinue$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (i.a(this.this$0.f33348o, "value_enable_2fa")) {
                e eVar = this.this$0;
                String str = this.$code;
                this.label = 1;
                if (e.c(eVar, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                e eVar2 = this.this$0;
                String str2 = this.$code;
                this.label = 2;
                if (e.b(eVar2, str2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return r.f47939a;
    }
}
