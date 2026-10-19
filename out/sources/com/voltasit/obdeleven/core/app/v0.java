package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import p134k8.D1;

/* JADX INFO: compiled from: SubLongCodingCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends AbstractC2102q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f30173p;

    public v0(I8.b bVar, String str) {
        super(bVar, false);
        this.f30173p = str;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String b() {
        return this.f30173p;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return j(controlUnit, this.j[0]).continueWithTask(new S8.a(2, this));
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        return j(controlUnit, this.j[0]).continueWithTask(new V8.l(3, this));
    }

    public final Task<D1> j(final ControlUnit controlUnit, final String str) {
        try {
            for (D1 d10 : controlUnit.c0(true)) {
                if (d10.getId() == Integer.parseInt(str)) {
                    return Task.forResult(d10);
                }
            }
            return Task.forResult(null);
        } catch (ControlUnitException unused) {
            return controlUnit.c().continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.core.app.s0
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task) {
                    final v0 v0Var = this.f30156a;
                    v0Var.getClass();
                    if (!((Boolean) task.getResult()).booleanValue()) {
                        return Task.forResult(null);
                    }
                    final ControlUnit controlUnit2 = controlUnit;
                    Task<Void> taskH0 = controlUnit2.h0(controlUnit2.c0(false));
                    final String str2 = str;
                    return taskH0.continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.core.app.u0
                        @Override // com.parse.boltsinternal.Continuation
                        public final Object then(Task task2) {
                            return v0Var.j(controlUnit2, str2);
                        }
                    });
                }
            });
        }
    }
}
