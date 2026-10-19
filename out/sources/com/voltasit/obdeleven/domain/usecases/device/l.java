package com.voltasit.obdeleven.domain.usecases.device;

import G8.C0702d;
import com.obdeleven.service.interfaces.IDevice;
import com.voltasit.obdeleven.utils.bluetooth.LeBluetoothDevice;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: IsBluetoothUpdateNeededUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.o f30795b;

    public l(J8.p pVar, K8.o oVar) {
        this.f30794a = pVar;
        this.f30795b = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(IDevice iDevice, ContinuationImpl continuationImpl) throws Throwable {
        IsBluetoothUpdateNeededUC$invoke$1 isBluetoothUpdateNeededUC$invoke$1;
        Object next;
        C0702d c0702d;
        l lVar;
        if (continuationImpl instanceof IsBluetoothUpdateNeededUC$invoke$1) {
            isBluetoothUpdateNeededUC$invoke$1 = (IsBluetoothUpdateNeededUC$invoke$1) continuationImpl;
            int i10 = isBluetoothUpdateNeededUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                isBluetoothUpdateNeededUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                isBluetoothUpdateNeededUC$invoke$1 = new IsBluetoothUpdateNeededUC$invoke$1(this, continuationImpl);
            }
        } else {
            isBluetoothUpdateNeededUC$invoke$1 = new IsBluetoothUpdateNeededUC$invoke$1(this, continuationImpl);
        }
        Object objN = isBluetoothUpdateNeededUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = isBluetoothUpdateNeededUC$invoke$1.label;
        boolean z10 = false;
        if (i11 == 0) {
            kotlin.b.b(objN);
            this.f30794a.f("IsBluetoothUpdateNeededUC", androidx.compose.foundation.gestures.d.b("isBtUpdateNeeded(device: ", iDevice.f(), ")"));
            String strB = iDevice.b();
            kotlin.jvm.internal.i.d(strB, "getSerialNumber(...)");
            String strI = O.h.i(strB);
            Iterator it = this.f30795b.W().f3548d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!kotlin.text.m.I(strI, ((C0702d) next).f3448a, false));
            c0702d = (C0702d) next;
            if (c0702d == null) {
                return Boolean.FALSE;
            }
            com.voltasit.obdeleven.utils.bluetooth.g gVar = W7.c.f7065c;
            if (!(gVar instanceof LeBluetoothDevice)) {
                return Boolean.FALSE;
            }
            isBluetoothUpdateNeededUC$invoke$1.L$0 = this;
            isBluetoothUpdateNeededUC$invoke$1.L$1 = c0702d;
            isBluetoothUpdateNeededUC$invoke$1.label = 1;
            objN = ((LeBluetoothDevice) gVar).n(isBluetoothUpdateNeededUC$invoke$1);
            if (objN == coroutineSingletons) {
                return coroutineSingletons;
            }
            lVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0702d = (C0702d) isBluetoothUpdateNeededUC$invoke$1.L$1;
            lVar = (l) isBluetoothUpdateNeededUC$invoke$1.L$0;
            kotlin.b.b(objN);
        }
        String str = (String) objN;
        lVar.f30794a.e("IsBluetoothUpdateNeededUC", B6.c.d("Current ble fw version: ", str, ". Available ble fw version: ", c0702d.f3449b));
        if (!kotlin.text.n.S(str) && !str.equals(c0702d.f3449b)) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
