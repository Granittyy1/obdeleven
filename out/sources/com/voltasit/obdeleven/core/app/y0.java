package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f30186b;

    public /* synthetic */ y0(int i10, ControlUnit controlUnit) {
        this.f30185a = i10;
        this.f30186b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30185a) {
            case 0:
                return this.f30186b.t0("F198", "077328F6".concat(I.b.j()));
            default:
                ControlUnit controlUnit = this.f30186b;
                return ((com.obdeleven.service.core.c) controlUnit.f29339v).b("01" + com.obdeleven.service.util.b.g(Integer.parseInt(controlUnit.f29320b.getControlUnitBase().getString("udsExtReqId").split(":")[0], 16) | Integer.MIN_VALUE));
        }
    }
}
