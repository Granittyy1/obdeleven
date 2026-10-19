package com.voltasit.obdeleven.domain.usecases.device;

import G8.C0702d;
import com.obdeleven.service.interfaces.IDevice;
import com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: UpdateBluetoothUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.o f30822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.u f30823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.a f30824c;

    public x(K8.o oVar, K8.u uVar, J8.a aVar) {
        this.f30822a = oVar;
        this.f30823b = uVar;
        this.f30824c = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(IDevice iDevice, ContinuationImpl continuationImpl) throws Throwable {
        UpdateBluetoothUC$invoke$1 updateBluetoothUC$invoke$1;
        x xVar;
        if (continuationImpl instanceof UpdateBluetoothUC$invoke$1) {
            updateBluetoothUC$invoke$1 = (UpdateBluetoothUC$invoke$1) continuationImpl;
            int i10 = updateBluetoothUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                updateBluetoothUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                updateBluetoothUC$invoke$1 = new UpdateBluetoothUC$invoke$1(this, continuationImpl);
            }
        } else {
            updateBluetoothUC$invoke$1 = new UpdateBluetoothUC$invoke$1(this, continuationImpl);
        }
        Object objB = updateBluetoothUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = updateBluetoothUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(objB);
            updateBluetoothUC$invoke$1.L$0 = this;
            updateBluetoothUC$invoke$1.label = 1;
            objB = b(iDevice, updateBluetoothUC$invoke$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            xVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar = (x) updateBluetoothUC$invoke$1.L$0;
            kotlin.b.b(objB);
        }
        Boolean bool = (Boolean) objB;
        xVar.f30824c.n(bool.booleanValue());
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(IDevice iDevice, ContinuationImpl continuationImpl) throws Throwable {
        UpdateBluetoothUC$updateBluetooth$1 updateBluetoothUC$updateBluetooth$1;
        Object next;
        LeBluetoothDevice leBluetoothDevice;
        if (continuationImpl instanceof UpdateBluetoothUC$updateBluetooth$1) {
            updateBluetoothUC$updateBluetooth$1 = (UpdateBluetoothUC$updateBluetooth$1) continuationImpl;
            int i10 = updateBluetoothUC$updateBluetooth$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                updateBluetoothUC$updateBluetooth$1.label = i10 - Integer.MIN_VALUE;
            } else {
                updateBluetoothUC$updateBluetooth$1 = new UpdateBluetoothUC$updateBluetooth$1(this, continuationImpl);
            }
        } else {
            updateBluetoothUC$updateBluetooth$1 = new UpdateBluetoothUC$updateBluetooth$1(this, continuationImpl);
        }
        Object objA = updateBluetoothUC$updateBluetooth$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = updateBluetoothUC$updateBluetooth$1.label;
        boolean z10 = false;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.b.b(objA);
            } else if (i11 == 2) {
                leBluetoothDevice = (LeBluetoothDevice) updateBluetoothUC$updateBluetooth$1.L$0;
                kotlin.b.b(objA);
                updateBluetoothUC$updateBluetooth$1.L$0 = null;
                updateBluetoothUC$updateBluetooth$1.label = 3;
                objA = leBluetoothDevice.q(updateBluetoothUC$updateBluetooth$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objA);
            }
            if (((Boolean) objA).booleanValue()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        kotlin.b.b(objA);
        String strB = iDevice.b();
        kotlin.jvm.internal.i.d(strB, "getSerialNumber(...)");
        String strI = O.h.i(strB);
        Iterator it = this.f30822a.W().f3548d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.text.m.I(strI, ((C0702d) next).f3448a, false));
        C0702d c0702d = (C0702d) next;
        if (c0702d == null) {
            return Boolean.FALSE;
        }
        updateBluetoothUC$updateBluetooth$1.label = 1;
        objA = this.f30823b.a(c0702d.f3450c, updateBluetoothUC$updateBluetooth$1);
        if (objA == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8.a aVar = (C8.a) objA;
        if (aVar instanceof C8.a.b) {
            byte[] bArr = (byte[]) ((C8.a.b) aVar).f2463a;
            com.voltasit.obdeleven.utils.bluetooth.g gVar = W7.c.f7065c;
            kotlin.jvm.internal.i.c(gVar, "null cannot be cast to non-null type com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice");
            LeBluetoothDevice leBluetoothDevice2 = (LeBluetoothDevice) gVar;
            updateBluetoothUC$updateBluetooth$1.L$0 = leBluetoothDevice2;
            updateBluetoothUC$updateBluetooth$1.label = 2;
            if (leBluetoothDevice2.o(bArr, updateBluetoothUC$updateBluetooth$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            leBluetoothDevice = leBluetoothDevice2;
            updateBluetoothUC$updateBluetooth$1.L$0 = null;
            updateBluetoothUC$updateBluetooth$1.label = 3;
            objA = leBluetoothDevice.q(updateBluetoothUC$updateBluetooth$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            if (((Boolean) objA).booleanValue()) {
                z10 = true;
            }
        } else {
            if (!(aVar instanceof C8.a.C0024a)) {
                throw new NoWhenBranchMatchedException();
            }
            O.e.D("BluetoothConnectionHelper", "Unable to get binary");
            O.e.m(((C8.a.C0024a) aVar).f2462a);
        }
        return Boolean.valueOf(z10);
    }
}
