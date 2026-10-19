package com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo;

import G8.G;
import Ia.p;
import J8.f;
import androidx.compose.runtime.C1085f0;
import com.voltasit.obdeleven.domain.usecases.i;
import com.voltasit.obdeleven.domain.usecases.user.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: PersonalInformationUpdateViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateViewModel$loadData$1", f = "PersonalInformationUpdateViewModel.kt", l = {R.styleable.AppCompatTheme_colorAccent}, m = "invokeSuspend")
final class PersonalInformationUpdateViewModel$loadData$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalInformationUpdateViewModel$loadData$1(c cVar, kotlin.coroutines.c<? super PersonalInformationUpdateViewModel$loadData$1> cVar2) {
        super(2, cVar2);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new PersonalInformationUpdateViewModel$loadData$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((PersonalInformationUpdateViewModel$loadData$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            C1085f0 c1085f0 = this.this$0.f32989v;
            c1085f0.setValue(b.a((b) c1085f0.getValue(), null, null, true, null, false, 27));
            h hVar = this.this$0.f32984q;
            this.label = 1;
            obj = hVar.f30992a.h(this);
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
            c cVar = this.this$0;
            G g10 = (G) ((C8.a.b) aVar).f2463a;
            cVar.getClass();
            String countryCode = g10.f3422f;
            i iVar = cVar.f32985r;
            iVar.getClass();
            kotlin.jvm.internal.i.e(countryCode, "countryCode");
            String strA = iVar.f30852a.a(countryCode);
            f fVar = cVar.f32986s.f30905a;
            String strA2 = fVar.a(fVar.e(g10.f3425i));
            C1085f0 c1085f1 = cVar.f32989v;
            c1085f1.setValue(b.a((b) c1085f1.getValue(), g10, strA, false, strA2, false, 20));
        } else if (aVar instanceof C8.a.C0024a) {
            C1085f0 c1085f2 = this.this$0.f32989v;
            c1085f2.setValue(b.a((b) c1085f2.getValue(), null, null, false, null, true, 11));
        }
        C1085f0 c1085f3 = this.this$0.f32989v;
        c1085f3.setValue(b.a((b) c1085f3.getValue(), null, null, false, null, false, 27));
        return r.f47939a;
    }
}
