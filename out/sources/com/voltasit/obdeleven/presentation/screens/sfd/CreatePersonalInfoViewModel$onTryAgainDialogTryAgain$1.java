package com.voltasit.obdeleven.presentation.screens.sfd;

import Aa.c;
import Ia.p;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: CreatePersonalInfoViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.sfd.CreatePersonalInfoViewModel$onTryAgainDialogTryAgain$1", f = "CreatePersonalInfoViewModel.kt", l = {R.styleable.AppCompatTheme_windowMinWidthMinor}, m = "invokeSuspend")
final class CreatePersonalInfoViewModel$onTryAgainDialogTryAgain$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ CreatePersonalInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePersonalInfoViewModel$onTryAgainDialogTryAgain$1(CreatePersonalInfoViewModel createPersonalInfoViewModel, kotlin.coroutines.c<? super CreatePersonalInfoViewModel$onTryAgainDialogTryAgain$1> cVar) {
        super(2, cVar);
        this.this$0 = createPersonalInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CreatePersonalInfoViewModel$onTryAgainDialogTryAgain$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((CreatePersonalInfoViewModel$onTryAgainDialogTryAgain$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            this.this$0.f33008v.setValue(Boolean.FALSE);
            CreatePersonalInfoViewModel createPersonalInfoViewModel = this.this$0;
            this.label = 1;
            if (CreatePersonalInfoViewModel.b(createPersonalInfoViewModel, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return r.f47939a;
    }
}
