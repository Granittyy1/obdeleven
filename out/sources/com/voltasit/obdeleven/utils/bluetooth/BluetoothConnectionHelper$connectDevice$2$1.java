package com.voltasit.obdeleven.utils.bluetooth;

import androidx.fragment.app.RunnableC1341f;
import com.obdeleven.service.interfaces.IDevice;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.exceptions.NoNetworkException;
import com.voltasit.obdeleven.domain.usecases.device.D;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import p255u9.z;

/* JADX INFO: compiled from: BluetoothConnectionHelper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Aa.c(c = "com.voltasit.obdeleven.utils.bluetooth.BluetoothConnectionHelper$connectDevice$2$1", f = "BluetoothConnectionHelper.kt", l = {203, 208, 251}, m = "invokeSuspend")
final class BluetoothConnectionHelper$connectDevice$2$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super Task<Boolean>>, Object> {
    final /* synthetic */ IDevice $device;
    final /* synthetic */ z $user;
    Object L$0;
    int label;
    final /* synthetic */ BluetoothConnectionHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothConnectionHelper$connectDevice$2$1(IDevice iDevice, BluetoothConnectionHelper bluetoothConnectionHelper, z zVar, kotlin.coroutines.c<? super BluetoothConnectionHelper$connectDevice$2$1> cVar) {
        super(2, cVar);
        this.$device = iDevice;
        this.this$0 = bluetoothConnectionHelper;
        this.$user = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new BluetoothConnectionHelper$connectDevice$2$1(this.$device, this.this$0, this.$user, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super Task<Boolean>> cVar) {
        return ((BluetoothConnectionHelper$connectDevice$2$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:58:0x014f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i10;
        C8.a aVar;
        C8.a.C0024a c0024a;
        z zVar;
        C8.a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            IDevice iDevice = this.$device;
            if (iDevice instanceof o) {
                this.label = 1;
                obj = com.voltasit.obdeleven.domain.usecases.device.A.a((o) iDevice, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                i10 = 1;
            }
            D d10 = this.this$0.f34298e;
            String strF = this.$device.f();
            kotlin.jvm.internal.i.d(strF, "getAddress(...)");
            String strG = kotlin.text.m.G(strF, ":", "");
            String strB = this.$device.b();
            kotlin.jvm.internal.i.d(strB, "getSerialNumber(...)");
            String strC = this.$device.c();
            kotlin.jvm.internal.i.d(strC, "getCpuId(...)");
            String version = this.$device.getVersion();
            kotlin.jvm.internal.i.d(version, "getVersion(...)");
            G8.j jVar = new G8.j(i10, strG, strB, strC, version);
            this.label = 2;
            obj = d10.a(jVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = (C8.a) obj;
            if (aVar instanceof C8.a.b) {
                return Task.forResult(Boolean.TRUE);
            }
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            c0024a = (C8.a.C0024a) aVar;
            if (c0024a.f2462a instanceof NoNetworkException) {
                BluetoothConnectionHelper bluetoothConnectionHelper = this.this$0;
                bluetoothConnectionHelper.f34294a.runOnUiThread(new RunnableC1341f(4, bluetoothConnectionHelper));
                return Task.forResult(Boolean.FALSE);
            }
            if (!(this.$device instanceof o)) {
            }
            O.e.D("BluetoothConnectionHelper", "Device is not authorized");
            O.e.m(c0024a.f2462a);
            BluetoothConnectionHelper bluetoothConnectionHelper2 = this.this$0;
            bluetoothConnectionHelper2.f34294a.runOnUiThread(new T5.h(4, bluetoothConnectionHelper2));
            return Task.forResult(Boolean.FALSE);
        }
        if (i11 == 1) {
            kotlin.b.b(obj);
        } else if (i11 == 2) {
            kotlin.b.b(obj);
            aVar = (C8.a) obj;
            if (aVar instanceof C8.a.b) {
                return Task.forResult(Boolean.TRUE);
            }
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            c0024a = (C8.a.C0024a) aVar;
            if (c0024a.f2462a instanceof NoNetworkException) {
                BluetoothConnectionHelper bluetoothConnectionHelper3 = this.this$0;
                bluetoothConnectionHelper3.f34294a.runOnUiThread(new RunnableC1341f(4, bluetoothConnectionHelper3));
                return Task.forResult(Boolean.FALSE);
            }
            if (!(this.$device instanceof o) || (zVar = this.$user) == null || !zVar.getBoolean("allowValidateDevice")) {
                O.e.D("BluetoothConnectionHelper", "Device is not authorized");
                O.e.m(c0024a.f2462a);
                BluetoothConnectionHelper bluetoothConnectionHelper4 = this.this$0;
                bluetoothConnectionHelper4.f34294a.runOnUiThread(new T5.h(4, bluetoothConnectionHelper4));
                return Task.forResult(Boolean.FALSE);
            }
            com.voltasit.obdeleven.domain.usecases.device.e eVar = this.this$0.f34299f;
            String strF2 = this.$device.f();
            kotlin.jvm.internal.i.d(strF2, "getAddress(...)");
            String version2 = this.$device.getVersion();
            kotlin.jvm.internal.i.d(version2, "getVersion(...)");
            this.L$0 = aVar;
            this.label = 3;
            Object objA = eVar.a(strF2, version2, this);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar2 = aVar;
            obj = objA;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (C8.a) this.L$0;
            kotlin.b.b(obj);
        }
        C8.a aVar3 = (C8.a) obj;
        if (aVar3 instanceof C8.a.b) {
            return Task.forResult(Boolean.TRUE);
        }
        if (!(aVar3 instanceof C8.a.C0024a)) {
            throw new NoWhenBranchMatchedException();
        }
        C8.a.C0024a c0024a2 = (C8.a.C0024a) aVar2;
        O.e.m(c0024a2.f2462a);
        BluetoothConnectionHelper bluetoothConnectionHelper5 = this.this$0;
        bluetoothConnectionHelper5.f34294a.runOnUiThread(new com.voltasit.obdeleven.ui.activity.o(1, bluetoothConnectionHelper5));
        return Task.forError(new Exception(c0024a2.f2462a.getMessage()));
        i10 = ((Boolean) obj).booleanValue() ? 3 : 2;
        D d11 = this.this$0.f34298e;
        String strF3 = this.$device.f();
        kotlin.jvm.internal.i.d(strF3, "getAddress(...)");
        String strG2 = kotlin.text.m.G(strF3, ":", "");
        String strB2 = this.$device.b();
        kotlin.jvm.internal.i.d(strB2, "getSerialNumber(...)");
        String strC2 = this.$device.c();
        kotlin.jvm.internal.i.d(strC2, "getCpuId(...)");
        String version3 = this.$device.getVersion();
        kotlin.jvm.internal.i.d(version3, "getVersion(...)");
        G8.j jVar2 = new G8.j(i10, strG2, strB2, strC2, version3);
        this.label = 2;
        obj = d11.a(jVar2, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            return Task.forResult(Boolean.TRUE);
        }
        if (!(aVar instanceof C8.a.C0024a)) {
            throw new NoWhenBranchMatchedException();
        }
        c0024a = (C8.a.C0024a) aVar;
        if (c0024a.f2462a instanceof NoNetworkException) {
            BluetoothConnectionHelper bluetoothConnectionHelper6 = this.this$0;
            bluetoothConnectionHelper6.f34294a.runOnUiThread(new RunnableC1341f(4, bluetoothConnectionHelper6));
            return Task.forResult(Boolean.FALSE);
        }
        if (!(this.$device instanceof o)) {
        }
        O.e.D("BluetoothConnectionHelper", "Device is not authorized");
        O.e.m(c0024a.f2462a);
        BluetoothConnectionHelper bluetoothConnectionHelper7 = this.this$0;
        bluetoothConnectionHelper7.f34294a.runOnUiThread(new T5.h(4, bluetoothConnectionHelper7));
        return Task.forResult(Boolean.FALSE);
    }
}
