package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.enums.TransportProtocol;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2104t implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30159a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f30160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30161c;

    public /* synthetic */ C2104t(ControlUnit controlUnit, ArrayList arrayList) {
        this.f30160b = controlUnit;
        this.f30161c = arrayList;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws ControlUnitException {
        switch (this.f30159a) {
            case 0:
                C2106v c2106v = (C2106v) this.f30161c;
                c2106v.getClass();
                if (!((Boolean) task.getResult()).booleanValue()) {
                    return -3;
                }
                androidx.compose.foundation.gestures.snapping.f fVarQ = this.f30160b.Q();
                int i10 = Integer.parseInt(c2106v.f30169l[0]);
                String strG = (String) fVarQ.f10040b;
                if (i10 == 0) {
                    strG = kotlin.jvm.internal.n.g(strG);
                }
                c2106v.f(strG);
                return 0;
            default:
                ControlUnit controlUnit = this.f30160b;
                controlUnit.getClass();
                if (((Boolean) task.getResult()).booleanValue()) {
                    return task;
                }
                controlUnit.f29326h = (TransportProtocol) ((ArrayList) this.f30161c).get(3);
                return controlUnit.H();
        }
    }

    public /* synthetic */ C2104t(C2106v c2106v, ControlUnit controlUnit) {
        this.f30161c = c2106v;
        this.f30160b = controlUnit;
    }
}
