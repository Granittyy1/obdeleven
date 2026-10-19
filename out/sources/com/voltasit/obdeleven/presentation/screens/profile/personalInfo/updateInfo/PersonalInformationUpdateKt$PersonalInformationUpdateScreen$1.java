package com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo;

import Ia.l;
import Ia.p;
import androidx.lifecycle.InterfaceC1376t;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import kotlinx.coroutines.flow.C2688e;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import p293xa.r;

/* JADX INFO: compiled from: PersonalInformationUpdate.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$1", f = "PersonalInformationUpdate.kt", l = {}, m = "invokeSuspend")
public final class PersonalInformationUpdateKt$PersonalInformationUpdateScreen$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ InterfaceC1376t $lifecycleOwner;
    final /* synthetic */ l<Integer, r> $onNegativeAlert;
    final /* synthetic */ Ia.a<r> $onPersonalInfoSave;
    final /* synthetic */ c $viewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PersonalInformationUpdate.kt */
    @Aa.c(c = "com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$1$1", f = "PersonalInformationUpdate.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<r, kotlin.coroutines.c<? super r>, Object> {
        final /* synthetic */ Ia.a<r> $onPersonalInfoSave;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ia.a<r> aVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$onPersonalInfoSave = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.$onPersonalInfoSave, cVar);
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
            kotlin.b.b(obj);
            this.$onPersonalInfoSave.invoke();
            return r.f47939a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PersonalInformationUpdateKt$PersonalInformationUpdateScreen$1(c cVar, InterfaceC1376t interfaceC1376t, Ia.a<r> aVar, l<? super Integer, r> lVar, kotlin.coroutines.c<? super PersonalInformationUpdateKt$PersonalInformationUpdateScreen$1> cVar2) {
        super(2, cVar2);
        this.$viewModel = cVar;
        this.$lifecycleOwner = interfaceC1376t;
        this.$onPersonalInfoSave = aVar;
        this.$onNegativeAlert = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        PersonalInformationUpdateKt$PersonalInformationUpdateScreen$1 personalInformationUpdateKt$PersonalInformationUpdateScreen$1 = new PersonalInformationUpdateKt$PersonalInformationUpdateScreen$1(this.$viewModel, this.$lifecycleOwner, this.$onPersonalInfoSave, this.$onNegativeAlert, cVar);
        personalInformationUpdateKt$PersonalInformationUpdateScreen$1.L$0 = obj;
        return personalInformationUpdateKt$PersonalInformationUpdateScreen$1;
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((PersonalInformationUpdateKt$PersonalInformationUpdateScreen$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        C2688e.l(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(this.$onPersonalInfoSave, null), this.$viewModel.f32988u), (A) this.L$0);
        U7.a aVar = this.$viewModel.f32120i;
        InterfaceC1376t interfaceC1376t = this.$lifecycleOwner;
        final l<Integer, r> lVar = this.$onNegativeAlert;
        aVar.e(interfaceC1376t, new PersonalInformationUpdateKt.a(new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.profile.personalInfo.updateInfo.PersonalInformationUpdateKt$PersonalInformationUpdateScreen$1.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // Ia.l
            public final r invoke(Integer num) {
                Integer num2 = num;
                l<Integer, r> lVar2 = lVar;
                i.b(num2);
                lVar2.invoke(num2);
                return r.f47939a;
            }
        }));
        return r.f47939a;
    }
}
