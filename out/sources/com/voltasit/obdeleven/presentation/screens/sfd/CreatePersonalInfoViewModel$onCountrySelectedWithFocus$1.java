package com.voltasit.obdeleven.presentation.screens.sfd;

import Aa.c;
import Ia.p;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.I;
import kotlinx.coroutines.flow.v;
import p293xa.r;

/* JADX INFO: compiled from: CreatePersonalInfoViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.sfd.CreatePersonalInfoViewModel$onCountrySelectedWithFocus$1", f = "CreatePersonalInfoViewModel.kt", l = {213}, m = "invokeSuspend")
final class CreatePersonalInfoViewModel$onCountrySelectedWithFocus$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ CreatePersonalInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePersonalInfoViewModel$onCountrySelectedWithFocus$1(CreatePersonalInfoViewModel createPersonalInfoViewModel, kotlin.coroutines.c<? super CreatePersonalInfoViewModel$onCountrySelectedWithFocus$1> cVar) {
        super(2, cVar);
        this.this$0 = createPersonalInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new CreatePersonalInfoViewModel$onCountrySelectedWithFocus$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((CreatePersonalInfoViewModel$onCountrySelectedWithFocus$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            b.b(obj);
            this.label = 1;
            if (I.b(100L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        v vVar = this.this$0.f33012z;
        r rVar = r.f47939a;
        vVar.f(rVar);
        return rVar;
    }
}
