package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.exception.VehicleException;
import com.obdeleven.service.model.measurement.MeasurementException;
import com.parse.ParseException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Map;
import p134k8.a2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class V implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30068c;

    public /* synthetic */ V(Object obj, int i10, Object obj2) {
        this.f30066a = i10;
        this.f30067b = obj;
        this.f30068c = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws Exception {
        switch (this.f30066a) {
            case 0:
                return ((p146l8.v) this.f30068c).h(((W) this.f30067b).a());
            case 1:
                a2 a2Var = (a2) this.f30067b;
                a2Var.getClass();
                if (task.isFaulted() && (task.getError() instanceof ParseException)) {
                    throw new VehicleException(3);
                }
                if (task.isFaulted()) {
                    O.e.m(task.getError());
                    throw task.getError();
                }
                Map map = (Map) task.getResult();
                com.obdeleven.service.model.f fVar = (com.obdeleven.service.model.f) this.f30068c;
                if (!map.containsKey(fVar.n())) {
                    fVar.D0(true);
                    fVar.f29338u.f(true);
                }
                a2Var.f42724a.putAll(map);
                if (fVar.n().shortValue() != 25) {
                    return null;
                }
                a2Var.f42729f = map.isEmpty();
                return null;
            default:
                p194p8.m mVar = (p194p8.m) this.f30067b;
                mVar.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    throw new MeasurementException(1);
                }
                return mVar.f45922a.Q0(mVar.f45923b).continueWith(new C2084a(mVar, 1, (ValueUnit) this.f30068c));
        }
    }
}
