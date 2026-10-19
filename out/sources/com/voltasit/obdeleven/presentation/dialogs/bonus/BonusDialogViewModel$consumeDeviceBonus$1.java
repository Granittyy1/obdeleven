package com.voltasit.obdeleven.presentation.dialogs.bonus;

import G8.m;
import Ia.p;
import androidx.lifecycle.C;
import androidx.lifecycle.Z;
import com.voltasit.obdeleven.utils.CreditUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: BonusDialogViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.dialogs.bonus.BonusDialogViewModel$consumeDeviceBonus$1", f = "BonusDialogViewModel.kt", l = {R.styleable.AppCompatTheme_dialogPreferredPadding}, m = "invokeSuspend")
final class BonusDialogViewModel$consumeDeviceBonus$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ boolean $isCreditsChecked;
    final /* synthetic */ boolean $isProChecked;
    Object L$0;
    int label;
    final /* synthetic */ BonusDialogViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BonusDialogViewModel$consumeDeviceBonus$1(boolean z10, boolean z11, BonusDialogViewModel bonusDialogViewModel, kotlin.coroutines.c<? super BonusDialogViewModel$consumeDeviceBonus$1> cVar) {
        super(2, cVar);
        this.$isCreditsChecked = z10;
        this.$isProChecked = z11;
        this.this$0 = bonusDialogViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BonusDialogViewModel$consumeDeviceBonus$1(this.$isCreditsChecked, this.$isProChecked, this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((BonusDialogViewModel$consumeDeviceBonus$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m mVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            if (!this.$isCreditsChecked && !this.$isProChecked) {
                C<r> c10 = this.this$0.f32206s;
                r rVar = r.f47939a;
                c10.j(rVar);
                return rVar;
            }
            c cVar = (c) this.this$0.f32205r.d();
            if (cVar == null) {
                return r.f47939a;
            }
            boolean z10 = this.$isProChecked;
            boolean z11 = this.$isCreditsChecked;
            m mVar2 = new m(cVar.f32218a, cVar.f32220c, cVar.f32219b, z10, z11);
            com.voltasit.obdeleven.domain.usecases.bonus.a aVar = this.this$0.f32203p;
            this.L$0 = mVar2;
            this.label = 1;
            obj = aVar.f30639a.n(mVar2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            mVar = mVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (m) this.L$0;
            kotlin.b.b(obj);
        }
        C8.a aVar2 = (C8.a) obj;
        if (aVar2 instanceof C8.a.b) {
            CreditUtils.b(this.this$0.f32204q.L());
            if (mVar.f3523d) {
                BonusDialogViewModel bonusDialogViewModel = this.this$0;
                bonusDialogViewModel.getClass();
                C2680e.c(Z.a(bonusDialogViewModel), bonusDialogViewModel.f32112a, null, new BonusDialogViewModel$updateUserDetails$1(bonusDialogViewModel, null), 2);
            } else {
                B7.b.h(com.voltasit.obdeleven.R.string.common_bonus_added, this.this$0.f32122l);
                this.this$0.f32206s.j(r.f47939a);
            }
        } else if (aVar2 instanceof C8.a.C0024a) {
            B7.b.h(com.voltasit.obdeleven.R.string.common_something_went_wrong, this.this$0.f32119h);
            this.this$0.f32206s.j(r.f47939a);
        }
        return r.f47939a;
    }
}
