package com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo;

import G8.G;
import Ia.p;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.user.B;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: PersonalInformationUpdateViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateViewModel$onThatsCorrectClick$1", f = "PersonalInformationUpdateViewModel.kt", l = {85}, m = "invokeSuspend")
final class PersonalInformationUpdateViewModel$onThatsCorrectClick$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalInformationUpdateViewModel$onThatsCorrectClick$1(c cVar, kotlin.coroutines.c<? super PersonalInformationUpdateViewModel$onThatsCorrectClick$1> cVar2) {
        super(2, cVar2);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PersonalInformationUpdateViewModel$onThatsCorrectClick$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((PersonalInformationUpdateViewModel$onThatsCorrectClick$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            G g10 = ((b) this.this$0.f32989v.getValue()).f32977a;
            B b10 = this.this$0.f32982o;
            this.label = 1;
            obj = b10.a(g10, this);
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
            this.this$0.f32987t.f(r.f47939a);
        } else if (aVar instanceof C8.a.C0024a) {
            B7.b.h(R.string.common_check_network_connection, this.this$0.f32119h);
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
