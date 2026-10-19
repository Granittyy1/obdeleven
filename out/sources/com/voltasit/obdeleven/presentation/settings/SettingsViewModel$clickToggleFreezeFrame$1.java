package com.voltasit.obdeleven.presentation.settings;

import G8.D;
import Ia.p;
import K8.o;
import Na.i;
import androidx.lifecycle.C;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.user.GetUserDetailsUC;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: SettingsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.settings.SettingsViewModel$clickToggleFreezeFrame$1", f = "SettingsViewModel.kt", l = {218}, m = "invokeSuspend")
final class SettingsViewModel$clickToggleFreezeFrame$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ SettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$clickToggleFreezeFrame$1(SettingsViewModel settingsViewModel, kotlin.coroutines.c<? super SettingsViewModel$clickToggleFreezeFrame$1> cVar) {
        super(2, cVar);
        this.this$0 = settingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SettingsViewModel$clickToggleFreezeFrame$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SettingsViewModel$clickToggleFreezeFrame$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32113b.j(PreloaderState.c.f32642a);
            GetUserDetailsUC getUserDetailsUC = this.this$0.f33177x;
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
            boolean zC = ((D) ((C8.a.b) aVar).f2463a).f3410a.c();
            int i11 = R.string.common_exclude;
            if (zC) {
                SettingsViewModel settingsViewModel = this.this$0;
                o oVar = settingsViewModel.f33160o;
                boolean zG = oVar.g();
                oVar.E(!zG);
                C<Y8.b> c10 = settingsViewModel.f33151f0;
                if (!zG) {
                    i11 = R.string.common_include;
                }
                c10.j(Y8.c.a(i11, true));
            } else {
                if (this.this$0.f33160o.g()) {
                    this.this$0.f33160o.E(false);
                    this.this$0.f33151f0.j(Y8.c.a(R.string.common_exclude, true));
                }
                this.this$0.f33131T0.j(r.f47939a);
            }
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f33139X0.j(r.f47939a);
        }
        r rVar = r.f47939a;
        i iVar = E8.a.f3126a;
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return rVar;
    }
}
