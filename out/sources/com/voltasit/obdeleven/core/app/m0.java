package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ControlUnit f30126b;

    public /* synthetic */ m0(int i10, ControlUnit controlUnit) {
        this.f30125a = i10;
        this.f30126b = controlUnit;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        switch (this.f30125a) {
            case 0:
                return this.f30126b.t0("F198", "077328F6".concat(I.b.j()));
            default:
                return this.f30126b.f29324f.g("1089");
        }
    }
}
