package com.voltasit.obdeleven.domain.usecases.user;

import com.voltasit.obdeleven.domain.exceptions.UserSetupErrorException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: LogInUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.user.LogInUC$downloadUserData$2", f = "LogInUC.kt", l = {R.styleable.AppCompatTheme_dropDownListViewStyle, R.styleable.AppCompatTheme_dropdownListPreferredItemHeight, R.styleable.AppCompatTheme_editTextBackground, R.styleable.AppCompatTheme_listChoiceBackgroundIndicator}, m = "invokeSuspend")
final class LogInUC$downloadUserData$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super C8.a<? extends p293xa.r>>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogInUC$downloadUserData$2(r rVar, kotlin.coroutines.c<? super LogInUC$downloadUserData$2> cVar) {
        super(2, cVar);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        LogInUC$downloadUserData$2 logInUC$downloadUserData$2 = new LogInUC$downloadUserData$2(this.this$0, cVar);
        logInUC$downloadUserData$2.L$0 = obj;
        return logInUC$downloadUserData$2;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super C8.a<? extends p293xa.r>> cVar) {
        return ((LogInUC$downloadUserData$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ca  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.F f10;
        kotlinx.coroutines.F f11;
        C8.a aVar;
        kotlinx.coroutines.F f12;
        C8.a aVar2;
        Object objS;
        C8.a aVar3;
        C8.a aVar4;
        Object objJ;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                f11 = (kotlinx.coroutines.F) this.L$1;
                f10 = (kotlinx.coroutines.F) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (i10 == 2) {
                    aVar = (C8.a) this.L$1;
                    f12 = (kotlinx.coroutines.F) this.L$0;
                    kotlin.b.b(obj);
                    aVar2 = (C8.a) obj;
                    this.L$0 = aVar;
                    this.L$1 = aVar2;
                    this.label = 3;
                    objS = f12.s(this);
                    if (objS == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    C8.a aVar5 = aVar;
                    aVar3 = aVar2;
                    obj = objS;
                    aVar4 = aVar5;
                    C8.a aVar6 = (C8.a) obj;
                    if (aVar4 instanceof C8.a.b) {
                    }
                    return new C8.a.C0024a(UserSetupErrorException.f30438b);
                }
                if (i10 == 3) {
                    aVar3 = (C8.a) this.L$1;
                    aVar4 = (C8.a) this.L$0;
                    kotlin.b.b(obj);
                    C8.a aVar7 = (C8.a) obj;
                    if ((aVar4 instanceof C8.a.b) || !(aVar3 instanceof C8.a.b) || !(aVar7 instanceof C8.a.b)) {
                        return new C8.a.C0024a(UserSetupErrorException.f30438b);
                    }
                    com.voltasit.obdeleven.domain.usecases.vehicle.o oVar = this.this$0.f31009e;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    if (!oVar.f31065a.z() || (objJ = oVar.f31066b.j(this)) != coroutineSingletons) {
                        objJ = p293xa.r.f47939a;
                    }
                    if (objJ == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.b.b(obj);
                }
            }
            this.this$0.f31014k.e0(new J8.r("user_logged_in"));
            return new C8.a.b(p293xa.r.f47939a);
        }
        kotlin.b.b(obj);
        kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
        r rVar = this.this$0;
        rVar.f31012h.a(rVar.f31011g.L().getSessionToken());
        this.this$0.j.a();
        this.this$0.f31010f.a();
        kotlinx.coroutines.G gA = C2680e.a(a10, null, new LogInUC$downloadUserData$2$getParseConfigAsync$1(this.this$0, null), 3);
        kotlinx.coroutines.G gA2 = C2680e.a(a10, null, new LogInUC$downloadUserData$2$getUserPermissionAsync$1(this.this$0, null), 3);
        kotlinx.coroutines.G gA3 = C2680e.a(a10, null, new LogInUC$downloadUserData$2$updateUserDetailsAsync$1(this.this$0, null), 3);
        this.L$0 = gA2;
        this.L$1 = gA3;
        this.label = 1;
        Object objD = gA.D(this);
        if (objD == coroutineSingletons) {
            return coroutineSingletons;
        }
        f10 = gA2;
        f11 = gA3;
        obj = objD;
        C8.a aVar8 = (C8.a) obj;
        this.L$0 = f11;
        this.L$1 = aVar8;
        this.label = 2;
        Object objS2 = f10.s(this);
        if (objS2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        kotlinx.coroutines.F f13 = f11;
        aVar = aVar8;
        obj = objS2;
        f12 = f13;
        aVar2 = (C8.a) obj;
        this.L$0 = aVar;
        this.L$1 = aVar2;
        this.label = 3;
        objS = f12.s(this);
        if (objS == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar9 = aVar;
        aVar3 = aVar2;
        obj = objS;
        aVar4 = aVar9;
        C8.a aVar10 = (C8.a) obj;
        if (aVar4 instanceof C8.a.b) {
        }
        return new C8.a.C0024a(UserSetupErrorException.f30438b);
    }
}
