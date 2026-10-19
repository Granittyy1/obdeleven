package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.enums.SupportedFunction;
import com.obdeleven.service.enums.ValueUnit;
import com.obdeleven.service.model.ControlUnit;
import com.obdeleven.service.model.measurement.MeasurementException;
import com.parse.ControlUnitDB;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.List;
import p134k8.C1;
import p134k8.D1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class I implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30047c;

    public /* synthetic */ I(Object obj, int i10, Object obj2) {
        this.f30045a = i10;
        this.f30046b = obj;
        this.f30047c = obj2;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws MeasurementException {
        switch (this.f30045a) {
            case 0:
                K k10 = (K) this.f30046b;
                k10.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return -3;
                }
                k10.f((String) ((ControlUnit) this.f30047c).Q().f10040b);
                return 0;
            case 1:
                p170n9.m this$0 = (p170n9.m) this.f30046b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                ArrayList arrayList = (ArrayList) this.f30047c;
                kotlin.jvm.internal.i.e(task, "task");
                if (!task.isFaulted()) {
                    for (ControlUnitDB controlUnitDB : (List) task.getResult()) {
                        C1 c10 = new C1(this$0.f31429o, controlUnitDB);
                        this$0.f45020E.getClass();
                        if (controlUnitDB.getSWNumber() != null) {
                            List<D1> list = this$0.f31434t;
                            kotlin.jvm.internal.i.b(list);
                            list.add(c10);
                        }
                    }
                    List<D1> list2 = this$0.f31434t;
                    kotlin.jvm.internal.i.b(list2);
                    if (list2.size() > 0) {
                        arrayList.add(SupportedFunction.f29284e);
                    }
                }
                this$0.V(arrayList);
                return null;
            default:
                final p194p8.f fVar = (p194p8.f) this.f30046b;
                fVar.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    throw new MeasurementException(1);
                }
                final int i10 = fVar.f45911b;
                Task<String> taskD = fVar.f45910a.f29335r.d(String.format("21%02X", Integer.valueOf(i10 < 128 ? i10 : i10 - 127)));
                final ValueUnit valueUnit = (ValueUnit) this.f30047c;
                return taskD.continueWith(new Continuation() { // from class: p8.e
                    @Override // com.parse.boltsinternal.Continuation
                    public final Object then(Task task2) throws MeasurementException {
                        f fVar2 = fVar;
                        fVar2.getClass();
                        String str = (String) task2.getResult();
                        ControlUnitDB controlUnitDB2 = fVar2.f45910a.f29320b;
                        int i11 = i10;
                        if (i11 >= 128) {
                            i11 -= 127;
                        }
                        controlUnitDB2.saveKWP2000Measurement(i11, str);
                        if (!str.startsWith("61")) {
                            throw new MeasurementException(2);
                        }
                        a aVarJ = fVar2.j(str.substring(4));
                        if (aVarJ != null) {
                            fVar2.f(aVarJ.f45888a, 3, aVarJ.f45889b);
                        }
                        return fVar2.a(valueUnit);
                    }
                });
        }
    }
}
