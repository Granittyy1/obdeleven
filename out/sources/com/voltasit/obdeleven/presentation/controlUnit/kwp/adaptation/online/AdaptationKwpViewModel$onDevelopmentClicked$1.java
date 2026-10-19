package com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online;

import G8.D;
import Ia.p;
import Na.i;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: AdaptationKwpViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.controlUnit.kwp.adaptation.online.AdaptationKwpViewModel$onDevelopmentClicked$1", f = "AdaptationKwpViewModel.kt", l = {R.styleable.AppCompatTheme_alertDialogStyle}, m = "invokeSuspend")
final class AdaptationKwpViewModel$onDevelopmentClicked$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdaptationKwpViewModel$onDevelopmentClicked$1(a aVar, kotlin.coroutines.c<? super AdaptationKwpViewModel$onDevelopmentClicked$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new AdaptationKwpViewModel$onDevelopmentClicked$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((AdaptationKwpViewModel$onDevelopmentClicked$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            GetUserDetailsUC getUserDetailsUC = this.this$0.f31698o;
            this.label = 1;
            obj = getUserDetailsUC.a(this);
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
            if (((D) ((C8.a.b) aVar).f2463a).f3410a.c()) {
                this.this$0.f31705v.j(r.f47939a);
            } else {
                this.this$0.f31703t.j(r.f47939a);
            }
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f31707x.j(r.f47939a);
        }
        r rVar = r.f47939a;
        i iVar = E8.a.f3126a;
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return rVar;
    }
}
