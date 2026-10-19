package com.voltasit.obdeleven.core.app;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: SfdUnlockCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.core.app.SfdUnlockCommand$isCuUnlocked$sfdProtectionStatusOutput$1", f = "SfdUnlockCommand.kt", l = {R.styleable.AppCompatTheme_dropDownListViewStyle}, m = "invokeSuspend")
final class SfdUnlockCommand$isCuUnlocked$sfdProtectionStatusOutput$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super C8.a<? extends G8.w>>, Object> {
    final /* synthetic */ short $klineId;
    int label;
    final /* synthetic */ l0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfdUnlockCommand$isCuUnlocked$sfdProtectionStatusOutput$1(l0 l0Var, short s10, kotlin.coroutines.c<? super SfdUnlockCommand$isCuUnlocked$sfdProtectionStatusOutput$1> cVar) {
        super(2, cVar);
        this.this$0 = l0Var;
        this.$klineId = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SfdUnlockCommand$isCuUnlocked$sfdProtectionStatusOutput$1(this.this$0, this.$klineId, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super C8.a<? extends G8.w>> cVar) {
        return ((SfdUnlockCommand$isCuUnlocked$sfdProtectionStatusOutput$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            com.voltasit.obdeleven.domain.usecases.sfd.d dVar = this.this$0.f30115l;
            short s10 = this.$klineId;
            this.label = 1;
            obj = dVar.a(s10, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return obj;
    }
}
