package com.voltasit.obdeleven.presentation.screens.emailVerification;

import Aa.c;
import Ia.p;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import p293xa.r;

/* JADX INFO: compiled from: EmailVerificationConfirmationScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$1", f = "EmailVerificationConfirmationScreen.kt", l = {}, m = "invokeSuspend")
public final class EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ Ia.a<r> $onComplete;
    final /* synthetic */ EmailVerificationViewModel $viewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: EmailVerificationConfirmationScreen.kt */
    @c(c = "com.voltasit.obdeleven.presentation.screens.emailVerification.EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$1$1", f = "EmailVerificationConfirmationScreen.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<r, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Ia.a<r> $onComplete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ia.a<r> aVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$onComplete = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$onComplete, cVar);
        }

        @Override // Ia.p
        public final Object invoke(r rVar, kotlin.coroutines.c<? super r> cVar) {
            return ((AnonymousClass1) create(rVar, cVar)).invokeSuspend(r.f47939a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            this.$onComplete.invoke();
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$1(EmailVerificationViewModel emailVerificationViewModel, Ia.a<r> aVar, kotlin.coroutines.c<? super EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$1> cVar) {
        super(2, cVar);
        this.$viewModel = emailVerificationViewModel;
        this.$onComplete = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$1 emailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$1 = new EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$1(this.$viewModel, this.$onComplete, cVar);
        emailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$1.L$0 = obj;
        return emailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$1;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((EmailVerificationConfirmationScreenKt$EmailVerificationConfirmationScreen$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj);
        C2688e.l(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(this.$onComplete, null), this.$viewModel.f32943v), (A) this.L$0);
        return r.f47939a;
    }
}
