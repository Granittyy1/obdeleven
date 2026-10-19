package com.voltasit.obdeleven.data.providers;

import com.obdeleven.service.interfaces.IDevice;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: BluetoothProviderImpl.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.data.providers.BluetoothProviderImpl$onBluetoothStateChanged$1", f = "BluetoothProviderImpl.kt", l = {136}, m = "invokeSuspend")
public final class BluetoothProviderImpl$onBluetoothStateChanged$1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ IDevice $device;
    final /* synthetic */ Throwable $exception;
    final /* synthetic */ int $state;
    int label;
    final /* synthetic */ BluetoothProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothProviderImpl$onBluetoothStateChanged$1(Throwable th, BluetoothProviderImpl bluetoothProviderImpl, IDevice iDevice, int i10, kotlin.coroutines.c<? super BluetoothProviderImpl$onBluetoothStateChanged$1> cVar) {
        super(2, cVar);
        this.$exception = th;
        this.this$0 = bluetoothProviderImpl;
        this.$device = iDevice;
        this.$state = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BluetoothProviderImpl$onBluetoothStateChanged$1(this.$exception, this.this$0, this.$device, this.$state, cVar);
    }

    @Override // Ia.p
    public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((BluetoothProviderImpl$onBluetoothStateChanged$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.b.b(obj);
            Throwable th = this.$exception;
            Throwable thA = th != null ? this.this$0.f30204c.a(th) : null;
            kotlinx.coroutines.flow.v vVar = this.this$0.f30205d;
            G8.k kVar = new G8.k(this.$state, this.$device, thA);
            this.label = 1;
            if (vVar.emit(kVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return p293xa.r.f47939a;
    }
}
