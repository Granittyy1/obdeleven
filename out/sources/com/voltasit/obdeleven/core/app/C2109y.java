package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2109y implements Continuation {
    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        if (task.isFaulted()) {
            O.e.m(task.getError());
        }
        if (task.getResult() == null) {
            O.e.j("DeviceCommand", "findControlUnitTask.getResult() == null");
            return Boolean.FALSE;
        }
        O.e.j("DeviceCommand", "ControlUnit found with id = ".concat(((ControlUnit) task.getResult()).t()));
        return Boolean.valueOf(((ControlUnit) task.getResult()).k0());
    }
}
