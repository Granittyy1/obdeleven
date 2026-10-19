package com.voltasit.obdeleven.presentation.dialogs.bonus;

import Ia.p;
import com.voltasit.obdeleven.domain.usecases.user.D;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: BonusDialogViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialogViewModel$updateUserDetails$1", f = "BonusDialogViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "invokeSuspend")
final class BonusDialogViewModel$updateUserDetails$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ BonusDialogViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BonusDialogViewModel$updateUserDetails$1(BonusDialogViewModel bonusDialogViewModel, kotlin.coroutines.c<? super BonusDialogViewModel$updateUserDetails$1> cVar) {
        super(2, cVar);
        this.this$0 = bonusDialogViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BonusDialogViewModel$updateUserDetails$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((BonusDialogViewModel$updateUserDetails$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            D d10 = this.this$0.f32202o;
            this.label = 1;
            obj = d10.a(false, this);
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
            B7.b.h(com.voltasit.obdeleven.R.string.common_bonus_added, this.this$0.f32122l);
            this.this$0.f32206s.j(r.f47939a);
        } else if (aVar instanceof C8.a.C0024a) {
            B7.b.h(com.voltasit.obdeleven.R.string.common_something_went_wrong, this.this$0.f32119h);
            this.this$0.f32206s.j(r.f47939a);
        }
        return r.f47939a;
    }
}
