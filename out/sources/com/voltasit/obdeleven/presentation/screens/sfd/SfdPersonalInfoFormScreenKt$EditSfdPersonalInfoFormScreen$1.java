package com.voltasit.obdeleven.presentation.screens.sfd;

import Aa.c;
import Ia.l;
import Ia.p;
import androidx.lifecycle.InterfaceC1376t;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: SfdPersonalInfoFormScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$1", f = "SfdPersonalInfoFormScreen.kt", l = {}, m = "invokeSuspend")
public final class SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ InterfaceC1376t $lifecycleOwner;
    final /* synthetic */ l<Integer, r> $onNegativeAlert;
    final /* synthetic */ CreatePersonalInfoViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$1(CreatePersonalInfoViewModel createPersonalInfoViewModel, InterfaceC1376t interfaceC1376t, l<? super Integer, r> lVar, kotlin.coroutines.c<? super SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$1> cVar) {
        super(2, cVar);
        this.$viewModel = createPersonalInfoViewModel;
        this.$lifecycleOwner = interfaceC1376t;
        this.$onNegativeAlert = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$1(this.$viewModel, this.$lifecycleOwner, this.$onNegativeAlert, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj);
        U7.a aVar = this.$viewModel.f32120i;
        InterfaceC1376t interfaceC1376t = this.$lifecycleOwner;
        final l<Integer, r> lVar = this.$onNegativeAlert;
        aVar.e(interfaceC1376t, new SfdPersonalInfoFormScreenKt.a(new l<Integer, r>() { // from class: com.voltasit.obdeleven.presentation.screens.sfd.SfdPersonalInfoFormScreenKt$EditSfdPersonalInfoFormScreen$1.1
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
