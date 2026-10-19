package com.voltasit.obdeleven.domain.usecases.device;

import com.obdeleven.service.interfaces.IDevice;
import com.voltasit.obdeleven.domain.models.FirmwareUpdateResponse;

/* JADX INFO: compiled from: LogDeviceUpdateUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K8.v f30801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J8.g f30802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J8.a f30803c;

    public n(K8.v vVar, J8.g gVar, J8.a aVar) {
        this.f30801a = vVar;
        this.f30802b = gVar;
        this.f30803c = aVar;
    }

    public final void a(FirmwareUpdateResponse firmwareUpdateResponse, String str, String str2) {
        K8.v vVar = this.f30801a;
        if (vVar.z()) {
            p255u9.z zVarL = vVar.L();
            IDevice iDeviceD = this.f30802b.d();
            String strB = iDeviceD != null ? iDeviceD.b() : null;
            if (strB == null) {
                strB = "FFFFFFFFFFFFFFFFFFFFFF";
            }
            String str3 = strB;
            String objectId = zVarL.getObjectId();
            kotlin.jvm.internal.i.d(objectId, "getObjectId(...)");
            this.f30803c.j(objectId, str3, firmwareUpdateResponse.a(), str == null ? "FF" : str, str2 == null ? "FF" : str2);
        }
    }
}
