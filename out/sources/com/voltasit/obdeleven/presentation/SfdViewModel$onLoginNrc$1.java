package com.voltasit.obdeleven.presentation;

import Ia.p;
import K8.o;
import com.voltasit.obdeleven.domain.models.AccessAuthorizationType;
import com.voltasit.obdeleven.domain.models.Feature;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: SfdViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.SfdViewModel$onLoginNrc$1", f = "SfdViewModel.kt", l = {R.styleable.AppCompatTheme_buttonBarStyle, R.styleable.AppCompatTheme_colorAccent}, m = "invokeSuspend")
public final class SfdViewModel$onLoginNrc$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ short $klineId;
    int label;
    final /* synthetic */ SfdViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfdViewModel$onLoginNrc$1(SfdViewModel sfdViewModel, short s10, kotlin.coroutines.c<? super SfdViewModel$onLoginNrc$1> cVar) {
        super(2, cVar);
        this.this$0 = sfdViewModel;
        this.$klineId = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SfdViewModel$onLoginNrc$1(this.this$0, this.$klineId, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SfdViewModel$onLoginNrc$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            return r.f47939a;
        }
        kotlin.b.b(obj);
        this.this$0.f32113b.j(PreloaderState.c.f32642a);
        com.voltasit.obdeleven.domain.usecases.sfd.a aVar = this.this$0.f31214q;
        short s10 = this.$klineId;
        Feature feature = Feature.LongCoding;
        this.label = 1;
        obj = aVar.a(s10, feature, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar2 = (C8.a) obj;
        if (aVar2 instanceof C8.a.C0024a) {
            B7.b.h(com.voltasit.obdeleven.R.string.common_something_went_wrong, this.this$0.f32119h);
        } else if (aVar2 instanceof C8.a.b) {
            SfdViewModel sfdViewModel = this.this$0;
            AccessAuthorizationType accessAuthorizationType = (AccessAuthorizationType) ((C8.a.b) aVar2).f2463a;
            this.label = 2;
            sfdViewModel.getClass();
            if (accessAuthorizationType == AccessAuthorizationType.f30439b) {
                objF = r.f47939a;
                sfdViewModel.f31219v.j((r) objF);
            } else if (accessAuthorizationType != AccessAuthorizationType.f30440c) {
                sfdViewModel.f32119h.j(new Integer(com.voltasit.obdeleven.R.string.common_something_went_wrong));
                objF = r.f47939a;
            } else {
                o oVar = sfdViewModel.f31215r.f4469a;
                if (oVar.c0() && oVar.C()) {
                    objF = sfdViewModel.f(this);
                    if (objF != coroutineSingletons) {
                        objF = r.f47939a;
                    }
                } else {
                    objF = r.f47939a;
                    sfdViewModel.f31208B.j((r) objF);
                }
                if (objF != coroutineSingletons) {
                    objF = r.f47939a;
                }
            }
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
