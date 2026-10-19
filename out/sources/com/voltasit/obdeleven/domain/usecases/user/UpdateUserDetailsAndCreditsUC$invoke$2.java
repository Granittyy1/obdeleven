package com.voltasit.obdeleven.domain.usecases.user;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: UpdateUserDetailsAndCreditsUC.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.domain.usecases.user.UpdateUserDetailsAndCreditsUC$invoke$2", f = "UpdateUserDetailsAndCreditsUC.kt", l = {29, R.styleable.AppCompatTheme_actionModeTheme}, m = "invokeSuspend")
final class UpdateUserDetailsAndCreditsUC$invoke$2 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super C8.a<? extends p293xa.r>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateUserDetailsAndCreditsUC$invoke$2(C c10, kotlin.coroutines.c<? super UpdateUserDetailsAndCreditsUC$invoke$2> cVar) {
        super(2, cVar);
        this.this$0 = c10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        UpdateUserDetailsAndCreditsUC$invoke$2 updateUserDetailsAndCreditsUC$invoke$2 = new UpdateUserDetailsAndCreditsUC$invoke$2(this.this$0, cVar);
        updateUserDetailsAndCreditsUC$invoke$2.L$0 = obj;
        return updateUserDetailsAndCreditsUC$invoke$2;
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super C8.a<? extends p293xa.r>> cVar) {
        return ((UpdateUserDetailsAndCreditsUC$invoke$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.F f10;
        C8.a aVar;
        C8.a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                f10 = (kotlinx.coroutines.F) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (C8.a) this.L$0;
                kotlin.b.b(obj);
            }
            aVar2 = (C8.a) obj;
            if (aVar instanceof C8.a.C0024a) {
                return aVar;
            }
            if (aVar2 instanceof C8.a.C0024a) {
                return aVar2;
            }
            this.this$0.f30965b.a();
            return new C8.a.b(p293xa.r.f47939a);
        }
        kotlin.b.b(obj);
        kotlinx.coroutines.A a10 = (kotlinx.coroutines.A) this.L$0;
        kotlinx.coroutines.G gA = C2680e.a(a10, null, new UpdateUserDetailsAndCreditsUC$invoke$2$updateUserDetailsOutputDeffered$1(this.this$0, null), 3);
        kotlinx.coroutines.G gA2 = C2680e.a(a10, null, new UpdateUserDetailsAndCreditsUC$invoke$2$getUserOutputDeffered$1(this.this$0, null), 3);
        this.L$0 = gA2;
        this.label = 1;
        Object objD = gA.D(this);
        if (objD == coroutineSingletons) {
            return coroutineSingletons;
        }
        f10 = gA2;
        obj = objD;
        C8.a aVar3 = (C8.a) obj;
        this.L$0 = aVar3;
        this.label = 2;
        Object objS = f10.s(this);
        if (objS == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = aVar3;
        obj = objS;
        aVar2 = (C8.a) obj;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        if (aVar2 instanceof C8.a.C0024a) {
            return aVar2;
        }
        this.this$0.f30965b.a();
        return new C8.a.b(p293xa.r.f47939a);
    }
}
