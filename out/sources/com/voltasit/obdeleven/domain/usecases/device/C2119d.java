package com.voltasit.obdeleven.domain.usecases.device;

import com.obdeleven.service.interfaces.IDevice;
import com.voltasit.obdeleven.domain.exceptions.DeviceNotConnectedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.voltasit.obdeleven.domain.usecases.device.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CreateDevicePinUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C2119d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.f f30776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.g f30777b;

    public C2119d(K8.f fVar, J8.g gVar) {
        this.f30776a = fVar;
        this.f30777b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CreateDevicePinUC$invoke$1 createDevicePinUC$invoke$1;
        C2119d c2119d;
        String str2;
        IDevice iDevice;
        if (continuationImpl instanceof CreateDevicePinUC$invoke$1) {
            createDevicePinUC$invoke$1 = (CreateDevicePinUC$invoke$1) continuationImpl;
            int i10 = createDevicePinUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                createDevicePinUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                createDevicePinUC$invoke$1 = new CreateDevicePinUC$invoke$1(this, continuationImpl);
            }
        } else {
            createDevicePinUC$invoke$1 = new CreateDevicePinUC$invoke$1(this, continuationImpl);
        }
        Object objB = createDevicePinUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = createDevicePinUC$invoke$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                iDevice = (IDevice) createDevicePinUC$invoke$1.L$2;
                str2 = (String) createDevicePinUC$invoke$1.L$1;
                c2119d = (C2119d) createDevicePinUC$invoke$1.L$0;
                kotlin.b.b(objB);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(objB);
            }
        }
        kotlin.b.b(objB);
        J8.g gVar = this.f30777b;
        IDevice iDeviceD = gVar.d();
        if (iDeviceD == null) {
            return new C8.a.C0024a(new DeviceNotConnectedException());
        }
        createDevicePinUC$invoke$1.L$0 = this;
        createDevicePinUC$invoke$1.L$1 = str;
        createDevicePinUC$invoke$1.L$2 = iDeviceD;
        createDevicePinUC$invoke$1.label = 1;
        objB = gVar.b(str, createDevicePinUC$invoke$1);
        if (objB == coroutineSingletons) {
            return coroutineSingletons;
        }
        c2119d = this;
        str2 = str;
        iDevice = iDeviceD;
        C8.a aVar = (C8.a) objB;
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        K8.f fVar = c2119d.f30776a;
        String str3 = iDevice.e().f3516a;
        createDevicePinUC$invoke$1.L$0 = null;
        createDevicePinUC$invoke$1.L$1 = null;
        createDevicePinUC$invoke$1.L$2 = null;
        createDevicePinUC$invoke$1.label = 2;
        objB = fVar.m(str3, str2, createDevicePinUC$invoke$1);
        return objB == coroutineSingletons ? coroutineSingletons : objB;
    }
}
