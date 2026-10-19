package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f30036b;

    public /* synthetic */ C(int i10, ControlUnit controlUnit) {
        this.f30035a = i10;
        this.f30036b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30035a) {
            case 0:
                return this.f30036b.t0("F198", "077328F6".concat(I.b.j()));
            case 1:
                ControlUnit controlUnit = this.f30036b;
                O.e.j(controlUnit.f0(), "connectUDSShort()");
                ControlUnitDB controlUnitDB = controlUnit.f29320b;
                return (controlUnitDB.getControlUnitBase().getString("udsReqId") == null || controlUnitDB.getControlUnitBase().getString("udsReqId").isEmpty() || controlUnitDB.getControlUnitBase().getString("udsRespId") == null || controlUnitDB.getControlUnitBase().getString("udsRespId").isEmpty()) ? Task.forError(new Exception("UDS requests or response ids missing")) : controlUnit.I(0).continueWithTask(new p134k8.M(1, controlUnit));
            default:
                ControlUnit controlUnit2 = this.f30036b;
                controlUnit2.getClass();
                String str = (String) task.getResult();
                boolean zStartsWith = str.startsWith("62F1A3");
                ControlUnitDB controlUnitDB2 = controlUnit2.f29320b;
                if (zStartsWith) {
                    controlUnitDB2.setHWVersion(com.obdeleven.service.util.b.b(str.substring(6)).trim());
                    return null;
                }
                if (!str.startsWith("7F22")) {
                    return null;
                }
                controlUnitDB2.setHWVersion("");
                return null;
        }
    }
}
