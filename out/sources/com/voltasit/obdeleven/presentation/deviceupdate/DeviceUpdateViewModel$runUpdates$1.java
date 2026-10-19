package com.voltasit.obdeleven.presentation.deviceupdate;

import Ia.p;
import com.obdeleven.service.interfaces.IDevice;
import com.voltasit.obdeleven.domain.usecases.device.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: DeviceUpdateViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.presentation.deviceupdate.DeviceUpdateViewModel$runUpdates$1", f = "DeviceUpdateViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingEnd, R.styleable.AppCompatTheme_popupWindowStyle}, m = "invokeSuspend")
final class DeviceUpdateViewModel$runUpdates$1 extends SuspendLambda implements p<A, kotlin.coroutines.c<? super r>, Object> {
    final /* synthetic */ IDevice $device;
    final /* synthetic */ int $updateType;
    int label;
    final /* synthetic */ DeviceUpdateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceUpdateViewModel$runUpdates$1(DeviceUpdateViewModel deviceUpdateViewModel, int i10, IDevice iDevice, kotlin.coroutines.c<? super DeviceUpdateViewModel$runUpdates$1> cVar) {
        super(2, cVar);
        this.this$0 = deviceUpdateViewModel;
        this.$updateType = i10;
        this.$device = iDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new DeviceUpdateViewModel$runUpdates$1(this.this$0, this.$updateType, this.$device, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super r> cVar) {
        return ((DeviceUpdateViewModel$runUpdates$1) create(a10, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i10;
        DeviceUpdateViewModel deviceUpdateViewModel;
        IDevice iDevice;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.b.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            return r.f47939a;
        }
        kotlin.b.b(obj);
        this.this$0.f32139s.k(DeviceUpdateViewModel.State.f32145c);
        int i12 = this.$updateType;
        if (i12 == 3 || i12 == 4) {
            x xVar = this.this$0.f32137q;
            IDevice iDevice2 = this.$device;
            this.label = 1;
            obj = xVar.a(iDevice2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        i10 = this.$updateType;
        if (i10 == 1 && i10 != 4) {
            this.this$0.f32139s.k(DeviceUpdateViewModel.State.f32147e);
            return r.f47939a;
        }
        deviceUpdateViewModel = this.this$0;
        iDevice = this.$device;
        this.label = 2;
        if (DeviceUpdateViewModel.b(deviceUpdateViewModel, iDevice, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return r.f47939a;
        if (!((Boolean) obj).booleanValue()) {
            this.this$0.f32139s.k(DeviceUpdateViewModel.State.f32148f);
            return r.f47939a;
        }
        i10 = this.$updateType;
        if (i10 == 1) {
        }
        deviceUpdateViewModel = this.this$0;
        iDevice = this.$device;
        this.label = 2;
        if (DeviceUpdateViewModel.b(deviceUpdateViewModel, iDevice, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return r.f47939a;
    }
}
