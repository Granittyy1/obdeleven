package com.voltasit.obdeleven.presentation.deviceupdate;

import Ia.p;
import com.voltasit.obdeleven.domain.usecases.device.ForceDeviceUpdateUC;
import com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice;
import com.voltasit.obdeleven.utils.bluetooth.g;
import com.voltasit.obdeleven.utils.bluetooth.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: DeviceUpdateViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.deviceupdate.DeviceUpdateViewModel$forceFwUpdate$1", f = "DeviceUpdateViewModel.kt", l = {R.styleable.AppCompatTheme_dialogCornerRadius}, m = "invokeSuspend")
final class DeviceUpdateViewModel$forceFwUpdate$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    int label;
    final /* synthetic */ DeviceUpdateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceUpdateViewModel$forceFwUpdate$1(DeviceUpdateViewModel deviceUpdateViewModel, kotlin.coroutines.c<? super DeviceUpdateViewModel$forceFwUpdate$1> cVar) {
        super(2, cVar);
        this.this$0 = deviceUpdateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new DeviceUpdateViewModel$forceFwUpdate$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((DeviceUpdateViewModel$forceFwUpdate$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            this.this$0.f32139s.j(DeviceUpdateViewModel.State.f32145c);
            DeviceUpdateViewModel deviceUpdateViewModel = this.this$0;
            ForceDeviceUpdateUC forceDeviceUpdateUC = deviceUpdateViewModel.f32135o;
            o oVar = deviceUpdateViewModel.f32143w;
            if (oVar == null) {
                i.m("bootloaderTimeoutDevice");
                throw null;
            }
            this.label = 1;
            obj = forceDeviceUpdateUC.a(oVar, this);
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
            g gVar = W7.c.f7065c;
            i.c(gVar, "null cannot be cast to non-null type com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice");
            ((LeBluetoothDevice) gVar).f34323z = true;
            this.this$0.f32139s.j(DeviceUpdateViewModel.State.f32147e);
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.this$0.f32139s.j(DeviceUpdateViewModel.State.f32146d);
        }
        r rVar = r.f47939a;
        Na.i iVar = E8.a.f3126a;
        return rVar;
    }
}
