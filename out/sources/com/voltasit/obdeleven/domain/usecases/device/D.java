package com.voltasit.obdeleven.domain.usecases.device;

import com.obdeleven.service.interfaces.IDevice;
import com.voltasit.obdeleven.domain.exceptions.DeviceNotConnectedException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: VerifyDeviceUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J8.p f30760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K8.f f30761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.g f30762c;

    public D(J8.p pVar, K8.f fVar, J8.g gVar) {
        this.f30760a = pVar;
        this.f30761b = fVar;
        this.f30762c = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(G8.j jVar, ContinuationImpl continuationImpl) {
        VerifyDeviceUC$invoke$1 verifyDeviceUC$invoke$1;
        IDevice iDevice;
        if (continuationImpl instanceof VerifyDeviceUC$invoke$1) {
            verifyDeviceUC$invoke$1 = (VerifyDeviceUC$invoke$1) continuationImpl;
            int i10 = verifyDeviceUC$invoke$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                verifyDeviceUC$invoke$1.label = i10 - Integer.MIN_VALUE;
            } else {
                verifyDeviceUC$invoke$1 = new VerifyDeviceUC$invoke$1(this, continuationImpl);
            }
        } else {
            verifyDeviceUC$invoke$1 = new VerifyDeviceUC$invoke$1(this, continuationImpl);
        }
        Object obj = verifyDeviceUC$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i11 = verifyDeviceUC$invoke$1.label;
        if (i11 == 0) {
            kotlin.b.b(obj);
            this.f30760a.f("VerifyDeviceUC", "VerifyDeviceUC(device=" + jVar + ")");
            IDevice iDeviceD = this.f30762c.d();
            if (iDeviceD == null) {
                return new C8.a.C0024a(new DeviceNotConnectedException());
            }
            verifyDeviceUC$invoke$1.L$0 = iDeviceD;
            verifyDeviceUC$invoke$1.label = 1;
            Object objO = this.f30761b.o(jVar, verifyDeviceUC$invoke$1);
            if (objO == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objO;
            iDevice = iDeviceD;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iDevice = (IDevice) verifyDeviceUC$invoke$1.L$0;
            kotlin.b.b(obj);
        }
        C8.a aVar = (C8.a) obj;
        if (aVar instanceof C8.a.b) {
            iDevice.d((G8.l) ((C8.a.b) aVar).f2463a);
            return new C8.a.b(p293xa.r.f47939a);
        }
        if (aVar instanceof C8.a.C0024a) {
            return aVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
