package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.exception.OBDelevenException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import p134k8.a2;

/* JADX INFO: compiled from: ConnectCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class A extends T {
    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return j();
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        return j();
    }

    public final Task<Integer> j() {
        try {
            int i10 = W7.c.f7063a;
            O.e.j("OBDeleven", "getVehicle()");
            a2 a2Var = W7.c.f7067e;
            if (a2Var != null) {
                return a2Var.b(Integer.valueOf(this.j, 16).shortValue()).continueWithTask(new C2110z(0));
            }
            O.e.j("OBDeleven", "getVehicle().Exception");
            throw new OBDelevenException(1);
        } catch (OBDelevenException unused) {
            return Task.forResult(-3);
        }
    }
}
