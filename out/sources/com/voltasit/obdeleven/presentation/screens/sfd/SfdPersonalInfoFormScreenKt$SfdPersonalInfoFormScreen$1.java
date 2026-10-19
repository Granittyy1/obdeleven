package com.voltasit.obdeleven.presentation.screens.sfd;

import Aa.c;
import Ia.p;
import androidx.compose.ui.focus.FocusRequester;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import p293xa.r;

/* JADX INFO: compiled from: SfdPersonalInfoFormScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$1", f = "SfdPersonalInfoFormScreen.kt", l = {}, m = "invokeSuspend")
public final class SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ List<FocusRequester> $focusRequesters;
    final /* synthetic */ CreatePersonalInfoViewModel $viewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SfdPersonalInfoFormScreen.kt */
    @c(c = "com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$1$1", f = "SfdPersonalInfoFormScreen.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<r, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ List<FocusRequester> $focusRequesters;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<FocusRequester> list, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$focusRequesters = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$focusRequesters, cVar);
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
            this.$focusRequesters.get(1).b(7);
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$1(CreatePersonalInfoViewModel createPersonalInfoViewModel, List<FocusRequester> list, kotlin.coroutines.c<? super SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$1> cVar) {
        super(2, cVar);
        this.$viewModel = createPersonalInfoViewModel;
        this.$focusRequesters = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$1 sfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$1 = new SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$1(this.$viewModel, this.$focusRequesters, cVar);
        sfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$1.L$0 = obj;
        return sfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$1;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SfdPersonalInfoFormScreenKt$SfdPersonalInfoFormScreen$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj);
        C2688e.l(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(this.$focusRequesters, null), this.$viewModel.f32997A), (A) this.L$0);
        return r.f47939a;
    }
}
