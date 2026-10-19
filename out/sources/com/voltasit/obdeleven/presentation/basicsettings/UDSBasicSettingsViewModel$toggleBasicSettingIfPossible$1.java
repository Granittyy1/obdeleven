package com.voltasit.obdeleven.presentation.basicsettings;

import Aa.c;
import Ia.p;
import com.obdeleven.service.model.ControlUnit;
import com.voltasit.obdeleven.presentation.models.PreloaderState;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: UDSBasicSettingsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@c(c = "com.voltasit.obdeleven.presentation.basicsettings.UDSBasicSettingsViewModel$toggleBasicSettingIfPossible$1", f = "UDSBasicSettingsViewModel.kt", l = {162, 171, 174}, m = "invokeSuspend")
final class UDSBasicSettingsViewModel$toggleBasicSettingIfPossible$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ ControlUnit $controlUnit;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDSBasicSettingsViewModel$toggleBasicSettingIfPossible$1(a aVar, ControlUnit controlUnit, kotlin.coroutines.c<? super UDSBasicSettingsViewModel$toggleBasicSettingIfPossible$1> cVar) {
        super(2, cVar);
        this.this$0 = aVar;
        this.$controlUnit = controlUnit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new UDSBasicSettingsViewModel$toggleBasicSettingIfPossible$1(this.this$0, this.$controlUnit, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((UDSBasicSettingsViewModel$toggleBasicSettingIfPossible$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                b.b(obj);
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            return r.f47939a;
        }
        b.b(obj);
        this.this$0.f32113b.j(PreloaderState.c.f32642a);
        a aVar = this.this$0;
        this.label = 1;
        obj = a.b(aVar, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (((Boolean) obj).booleanValue()) {
            U7.a<r> aVar2 = this.this$0.f31355R;
            r rVar = r.f47939a;
            aVar2.j(rVar);
            this.this$0.f32113b.j(PreloaderState.d.f32643a);
            return rVar;
        }
        a.C0329a c0329a = (a.C0329a) this.this$0.f31339B.d();
        if (c0329a == null || !c0329a.f31370b) {
            UserTrackingUtils.c(UserTrackingUtils.Key.f34280y, 1);
            a aVar3 = this.this$0;
            ControlUnit controlUnit = this.$controlUnit;
            this.label = 3;
            if (a.c(aVar3, controlUnit, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            a aVar4 = this.this$0;
            ControlUnit controlUnit2 = this.$controlUnit;
            this.label = 2;
            if (a.d(aVar4, controlUnit2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.this$0.f32113b.j(PreloaderState.d.f32643a);
        return r.f47939a;
    }
}
