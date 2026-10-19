package com.voltasit.obdeleven.utils.bluetooth;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;

/* JADX INFO: compiled from: LeBluetoothDevice.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice$loadUpdateFile$2", f = "LeBluetoothDevice.kt", l = {}, m = "invokeSuspend")
public final class LeBluetoothDevice$loadUpdateFile$2 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    final /* synthetic */ byte[] $binary;
    int label;
    final /* synthetic */ LeBluetoothDevice this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeBluetoothDevice$loadUpdateFile$2(LeBluetoothDevice leBluetoothDevice, byte[] bArr, kotlin.coroutines.c<? super LeBluetoothDevice$loadUpdateFile$2> cVar) {
        super(2, cVar);
        this.this$0 = leBluetoothDevice;
        this.$binary = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new LeBluetoothDevice$loadUpdateFile$2(this.this$0, this.$binary, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((LeBluetoothDevice$loadUpdateFile$2) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        LeBluetoothDevice leBluetoothDevice = this.this$0;
        byte[] bArr = this.$binary;
        leBluetoothDevice.f34311n = bArr;
        O.e.j("LeBluetoothDevice", "Total update size: " + bArr.length);
        byte[] bArrT = Q3.d.t(this.this$0.f34311n, 4, 8);
        Na.i iVar = E8.a.f3126a;
        kotlin.collections.k.Y(bArrT);
        this.this$0.f34312o = E8.a.h(bArrT);
        LeBluetoothDevice leBluetoothDevice2 = this.this$0;
        leBluetoothDevice2.f34314q = E8.a.a(132, Q3.d.t(leBluetoothDevice2.f34311n, 0, leBluetoothDevice2.f34312o));
        LeBluetoothDevice leBluetoothDevice3 = this.this$0;
        byte[] bArr2 = leBluetoothDevice3.f34311n;
        int i10 = leBluetoothDevice3.f34312o;
        byte[] bArrT2 = Q3.d.t(bArr2, 4 + i10, i10 + 8);
        kotlin.collections.k.Y(bArrT2);
        this.this$0.f34313p = E8.a.h(bArrT2);
        LeBluetoothDevice leBluetoothDevice4 = this.this$0;
        byte[] bArr3 = leBluetoothDevice4.f34311n;
        int i11 = leBluetoothDevice4.f34312o;
        leBluetoothDevice4.f34315r = E8.a.a(132, Q3.d.t(bArr3, i11, leBluetoothDevice4.f34313p + i11));
        return p293xa.r.f47939a;
    }
}
