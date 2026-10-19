package com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo;

import Ia.p;
import com.voltasit.obdeleven.domain.usecases.user.u;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: PersonalInformationUpdateDialogViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateDialogViewModel$onLogoutProceedClick$1", f = "PersonalInformationUpdateDialogViewModel.kt", l = {R.styleable.AppCompatTheme_colorPrimary}, m = "invokeSuspend")
final class PersonalInformationUpdateDialogViewModel$onLogoutProceedClick$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalInformationUpdateDialogViewModel$onLogoutProceedClick$1(a aVar, kotlin.coroutines.c<? super PersonalInformationUpdateDialogViewModel$onLogoutProceedClick$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PersonalInformationUpdateDialogViewModel$onLogoutProceedClick$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((PersonalInformationUpdateDialogViewModel$onLogoutProceedClick$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            u uVar = this.this$0.f32968p;
            this.label = 1;
            if (uVar.a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        U7.a<r> aVar = this.this$0.f32975w;
        r rVar = r.f47939a;
        aVar.j(rVar);
        return rVar;
    }
}
