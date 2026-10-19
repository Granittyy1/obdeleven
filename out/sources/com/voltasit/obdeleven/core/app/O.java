package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class O implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f30057b;

    public /* synthetic */ O(int i10, ControlUnit controlUnit) {
        this.f30056a = i10;
        this.f30057b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30056a) {
            case 0:
                return this.f30057b.t0("F198", "077328F6".concat(I.b.j()));
            default:
                ControlUnit controlUnit = this.f30057b;
                controlUnit.f29325g = controlUnit.f29320b.getControlUnitBase().getString("udsExtReqId").split(":")[0];
                return null;
        }
    }
}
