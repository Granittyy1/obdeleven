package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.ControlUnitDB;
import com.parse.ParseException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.CodingType;
import p134k8.D1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class P implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30058a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f30059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30060c;

    public /* synthetic */ P(ControlUnit controlUnit, D1 d10) {
        this.f30059b = controlUnit;
        this.f30060c = d10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30058a) {
            case 0:
                S s10 = (S) this.f30060c;
                String[] strArr = s10.j;
                int i10 = Integer.parseInt(strArr[0], 16);
                int i11 = Integer.parseInt(strArr[1], 16);
                return this.f30059b.L0(s10.a(), i10, i11).continueWith(new Q(0));
            default:
                final ControlUnit controlUnit = this.f30059b;
                controlUnit.getClass();
                final D1 d10 = (D1) this.f30060c;
                return d10.c().continueWithTask(new p010a9.a(5, d10)).continueWith((Continuation<TContinuationResult, TContinuationResult>) new Continuation() { // from class: k8.C
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task2) throws ParseException {
                        ControlUnit controlUnit2 = controlUnit;
                        controlUnit2.getClass();
                        ControlUnitDB controlUnitDB = new ControlUnitDB();
                        controlUnitDB.setParent(controlUnit2.f29320b);
                        controlUnitDB.setVehicle(controlUnit2.f29321c.f42726c);
                        D1 d11 = d10;
                        controlUnitDB.setHWNumber(d11.o());
                        controlUnitDB.setHWVersion(d11.m());
                        CodingType codingTypeK = d11.k();
                        CodingType codingType = CodingType.f34403c;
                        if (codingTypeK == null || codingTypeK == CodingType.f34402b || codingTypeK == codingType) {
                            controlUnitDB.setCoding(codingType, "");
                        } else if (codingTypeK == CodingType.f34406f) {
                            controlUnitDB.setCoding(codingTypeK, d11.r().f42831c);
                        } else if (codingTypeK == CodingType.f34405e) {
                            controlUnitDB.setCoding(codingTypeK, (String) d11.y().f10040b);
                        }
                        controlUnitDB.setSystemDescription(d11.d());
                        controlUnitDB.setSWVersion(d11.i());
                        controlUnitDB.setSWNumber(d11.j());
                        controlUnitDB.setSerialNumber(d11.p());
                        controlUnitDB.setSubsystemId(d11.getId());
                        ControlUnitDB.saveSubsystem(controlUnitDB);
                        return null;
                    }
                }, Task.BACKGROUND_EXECUTOR);
        }
    }

    public /* synthetic */ P(S s10, ControlUnit controlUnit) {
        this.f30060c = s10;
        this.f30059b = controlUnit;
    }
}
