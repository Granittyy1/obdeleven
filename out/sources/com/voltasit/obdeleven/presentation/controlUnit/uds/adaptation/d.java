package com.voltasit.obdeleven.presentation.controlUnit.uds.adaptation;

import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.odx.model.COMPUSCALE;
import com.obdeleven.service.util.b;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.usecases.controlUnit.connect.q;
import p134k8.C2631n;
import p134k8.C2645s;
import p134k8.C2648t;
import p134k8.H;
import p134k8.I;
import p134k8.K;
import p134k8.M;
import p134k8.r;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31906b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f31905a = i10;
        this.f31906b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, xa.g] */
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f31905a) {
            case 0:
                h hVar = (h) this.f31906b;
                hVar.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return Task.forResult(null);
                }
                ControlUnit controlUnit = hVar.f31925q;
                COMPUSCALE compuscale = hVar.f31930v;
                com.obdeleven.service.odx.e.g gVar = ((i) hVar.f31919E.getValue()).f31938C;
                controlUnit.getClass();
                O.e.s("ControlUnit", "udsReadDataByIdentWithSaving");
                return controlUnit.I0(compuscale, gVar, true);
            case 1:
                final ControlUnit controlUnit2 = (ControlUnit) this.f31906b;
                controlUnit2.getClass();
                if (((Boolean) task.getResult()).booleanValue()) {
                    return Task.forResult(Boolean.TRUE);
                }
                if (controlUnit2.f29328k == ControlUnit.RequestSID.f29345c) {
                    return Task.forResult(Boolean.FALSE);
                }
                O.e.j(controlUnit2.f0(), "identifyInfo22()");
                ControlUnitDB controlUnitDB = controlUnit2.f29320b;
                final String hWNumber = controlUnitDB.getHWNumber();
                final String hWVersion = controlUnitDB.getHWVersion();
                final String sWNumber = controlUnitDB.getSWNumber();
                final String sWVersion = controlUnitDB.getSWVersion();
                return controlUnit2.f29335r.d("22F191").continueWith(new H(0, controlUnit2)).continueWithTask(new C2631n(1, controlUnit2)).continueWithTask(new com.parse.b(5, controlUnit2)).continueWithTask(new I(0, controlUnit2)).continueWithTask(new Continuation() { // from class: k8.J
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task2) {
                        final ControlUnit controlUnit3 = controlUnit2;
                        Task<String> taskD = controlUnit3.f29335r.d("22F197");
                        final String str = hWNumber;
                        final String str2 = hWVersion;
                        final String str3 = sWNumber;
                        final String str4 = sWVersion;
                        return taskD.continueWith(new Continuation() { // from class: k8.Q
                            @Override // com.parse.boltsinternal.Continuation
                            public final Object then(Task task3) {
                                ControlUnit controlUnit4 = controlUnit3;
                                controlUnit4.C(str, str2, str3, str4);
                                String str5 = (String) task3.getResult();
                                boolean zStartsWith = str5.startsWith("62F197");
                                ControlUnitDB controlUnitDB2 = controlUnit4.f29320b;
                                if (zStartsWith) {
                                    controlUnitDB2.setSystemDescription(b.b(str5.substring(6)));
                                    return null;
                                }
                                if (!str5.startsWith("7F22")) {
                                    return null;
                                }
                                controlUnitDB2.setSystemDescription("");
                                return null;
                            }
                        });
                    }
                }).continueWithTask(new K(0, controlUnit2)).continueWithTask(new M(0, controlUnit2)).continueWithTask(new r(1, controlUnit2)).continueWithTask(new C2645s(1, controlUnit2)).continueWithTask(new C2648t(1, controlUnit2)).continueWith(new q(1));
            default:
                return ((p135k9.e) this.f31906b).f42897b.a().makeVoid();
        }
    }
}
