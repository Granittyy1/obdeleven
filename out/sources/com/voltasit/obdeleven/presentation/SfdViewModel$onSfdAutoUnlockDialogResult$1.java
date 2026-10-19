package com.voltasit.obdeleven.presentation;

import Ia.p;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SfdViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.SfdViewModel$onSfdAutoUnlockDialogResult$1", f = "SfdViewModel.kt", l = {R.styleable.AppCompatTheme_dropDownListViewStyle}, m = "invokeSuspend")
final class SfdViewModel$onSfdAutoUnlockDialogResult$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ SfdViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfdViewModel$onSfdAutoUnlockDialogResult$1(SfdViewModel sfdViewModel, kotlin.coroutines.c<? super SfdViewModel$onSfdAutoUnlockDialogResult$1> cVar) {
        super(2, cVar);
        this.this$0 = sfdViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SfdViewModel$onSfdAutoUnlockDialogResult$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SfdViewModel$onSfdAutoUnlockDialogResult$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            SfdViewModel sfdViewModel = this.this$0;
            this.label = 1;
            if (sfdViewModel.f(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return r.f47939a;
    }
}
