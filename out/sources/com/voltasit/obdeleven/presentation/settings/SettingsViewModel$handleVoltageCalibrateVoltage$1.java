package com.voltasit.obdeleven.presentation.settings;

import Ia.p;
import J8.g;
import Na.i;
import com.voltasit.obdeleven.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p293xa.r;

/* JADX INFO: compiled from: SettingsViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.settings.SettingsViewModel$handleVoltageCalibrateVoltage$1", f = "SettingsViewModel.kt", l = {562}, m = "invokeSuspend")
final class SettingsViewModel$handleVoltageCalibrateVoltage$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ String $voltage;
    int label;
    final /* synthetic */ SettingsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$handleVoltageCalibrateVoltage$1(SettingsViewModel settingsViewModel, String str, kotlin.coroutines.c<? super SettingsViewModel$handleVoltageCalibrateVoltage$1> cVar) {
        super(2, cVar);
        this.this$0 = settingsViewModel;
        this.$voltage = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new SettingsViewModel$handleVoltageCalibrateVoltage$1(this.this$0, this.$voltage, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((SettingsViewModel$handleVoltageCalibrateVoltage$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0.f33162p;
            String str = this.$voltage;
            this.label = 1;
            obj = gVar.f(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            B7.b.h(R.string.view_settings_calibration_complete, this.this$0.f32122l);
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            B7.b.h(R.string.view_settings_calibration_failed, this.this$0.f32119h);
        }
        r rVar = r.f47939a;
        i iVar = E8.a.f3126a;
        return rVar;
    }
}
