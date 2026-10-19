package com.voltasit.obdeleven.presentation.startup;

import Aa.c;
import C8.a;
import Ia.p;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.F;
import kotlinx.coroutines.G;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: StartupActivityViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.startup.StartupActivityViewModel$fetchData$1", f = "StartupActivityViewModel.kt", l = {R.styleable.AppCompatTheme_colorPrimaryDark, R.styleable.AppCompatTheme_colorSwitchThumbNormal, R.styleable.AppCompatTheme_controlBackground, R.styleable.AppCompatTheme_dialogCornerRadius}, m = "invokeSuspend")
final class StartupActivityViewModel$fetchData$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ StartupActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartupActivityViewModel$fetchData$1(StartupActivityViewModel startupActivityViewModel, kotlin.coroutines.c<? super StartupActivityViewModel$fetchData$1> cVar) {
        super(2, cVar);
        this.this$0 = startupActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        StartupActivityViewModel$fetchData$1 startupActivityViewModel$fetchData$1 = new StartupActivityViewModel$fetchData$1(this.this$0, cVar);
        startupActivityViewModel$fetchData$1.L$0 = obj;
        return startupActivityViewModel$fetchData$1;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((StartupActivityViewModel$fetchData$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bf A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        F f10;
        F f11;
        a aVar;
        F f12;
        a aVar2;
        Object objS;
        a aVar3;
        a aVar4;
        StartupActivityViewModel startupActivityViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                f11 = (F) this.L$1;
                f10 = (F) this.L$0;
                b.b(obj);
            } else if (i10 == 2) {
                aVar = (a) this.L$1;
                f12 = (F) this.L$0;
                b.b(obj);
                aVar2 = (a) obj;
                this.L$0 = aVar;
                this.L$1 = aVar2;
                this.label = 3;
                objS = f12.s(this);
                if (objS == coroutineSingletons) {
                    return coroutineSingletons;
                }
                a aVar5 = aVar;
                aVar3 = aVar2;
                obj = objS;
                aVar4 = aVar5;
                startupActivityViewModel = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (StartupActivityViewModel.b(startupActivityViewModel, aVar4, aVar3, (a) obj, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i10 == 3) {
                aVar3 = (a) this.L$1;
                aVar4 = (a) this.L$0;
                b.b(obj);
                startupActivityViewModel = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                if (StartupActivityViewModel.b(startupActivityViewModel, aVar4, aVar3, (a) obj, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return r.f47939a;
        }
        b.b(obj);
        A a10 = (A) this.L$0;
        this.this$0.f33284t.f("StartupActivityViewModel", "fetchData()");
        G gA = C2680e.a(a10, null, new StartupActivityViewModel$fetchData$1$getParseConfigAsync$1(this.this$0, null), 3);
        G gA2 = C2680e.a(a10, null, new StartupActivityViewModel$fetchData$1$getUserPermissionAsync$1(this.this$0, null), 3);
        G gA3 = C2680e.a(a10, null, new StartupActivityViewModel$fetchData$1$updateUserDetailsAsync$1(this.this$0, null), 3);
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
        a aVar6 = (a) obj;
        this.L$0 = f11;
        this.L$1 = aVar6;
        this.label = 2;
        Object objS2 = f10.s(this);
        if (objS2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        F f13 = f11;
        aVar = aVar6;
        obj = objS2;
        f12 = f13;
        aVar2 = (a) obj;
        this.L$0 = aVar;
        this.L$1 = aVar2;
        this.label = 3;
        objS = f12.s(this);
        if (objS == coroutineSingletons) {
            return coroutineSingletons;
        }
        a aVar7 = aVar;
        aVar3 = aVar2;
        obj = objS;
        aVar4 = aVar7;
        startupActivityViewModel = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 4;
        if (StartupActivityViewModel.b(startupActivityViewModel, aVar4, aVar3, (a) obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return r.f47939a;
    }
}
