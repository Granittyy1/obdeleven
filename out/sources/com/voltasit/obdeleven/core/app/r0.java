package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import p134k8.D1;

/* JADX INFO: compiled from: SubCodingCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends AbstractC2107w {
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC2107w f30151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String[] f30152l;

    /* JADX INFO: compiled from: SubCodingCommand.java */
    public class a extends AbstractC2102q {
        public a(I8.b bVar) {
            super(bVar, true);
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
        public final String b() {
            return r0.this.j;
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
        public final Task<Integer> g(ControlUnit controlUnit) {
            r0 r0Var = r0.this;
            return r0Var.j(controlUnit, r0Var.f30152l[0]).continueWithTask(new p009a8.c(1, r0Var));
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
        public final Task<Integer> i(ControlUnit controlUnit) {
            r0 r0Var = r0.this;
            return r0Var.j(controlUnit, r0Var.f30152l[0]).continueWithTask(new p010a9.a(1, r0Var));
        }
    }

    /* JADX INFO: compiled from: SubCodingCommand.java */
    public class b extends K {
        public b(I8.b bVar) {
            super(bVar, true);
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
        public final String b() {
            return r0.this.j;
        }
    }

    /* JADX INFO: compiled from: SubCodingCommand.java */
    public class c extends L {
        public c(I8.b bVar) {
            super(bVar);
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
        public final String b() {
            return r0.this.j;
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
        public final Task<Integer> g(ControlUnit controlUnit) {
            r0 r0Var = r0.this;
            return r0Var.j(controlUnit, r0Var.f30152l[0]).continueWithTask(new p009a8.c(1, r0Var));
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
        public final Task<Integer> i(ControlUnit controlUnit) {
            r0 r0Var = r0.this;
            return r0Var.j(controlUnit, r0Var.f30152l[0]).continueWithTask(new p010a9.a(1, r0Var));
        }
    }

    public r0(I8.b bVar, String str) {
        super(bVar, false);
        this.j = str;
        String[] strArrSplit = bVar.f3916b.split("/");
        this.f30152l = strArrSplit;
        if (Integer.parseInt(strArrSplit[1]) == 0) {
            this.f30151k = new a(bVar);
        } else if (Integer.parseInt(strArrSplit[1]) == 2) {
            this.f30151k = new b(bVar);
        } else {
            this.f30151k = new c(bVar);
        }
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String b() {
        return this.f30151k.b();
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String c() {
        return this.f30151k.c();
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final boolean e(int i10) {
        return this.f30151k.e(i10);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return this.f30151k.g(controlUnit);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final void h(int i10) {
        this.f30151k.h(i10);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        return this.f30151k.i(controlUnit);
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
            return controlUnit.c().continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.core.app.o0
                @Override // com.parse.boltsinternal.Continuation
                public final Object then(Task task) {
                    r0 r0Var = this.f30132a;
                    r0Var.getClass();
                    if (!((Boolean) task.getResult()).booleanValue()) {
                        return Task.forResult(null);
                    }
                    ControlUnit controlUnit2 = controlUnit;
                    return controlUnit2.h0(controlUnit2.c0(false)).continueWithTask(new q0(r0Var, controlUnit2, str, 0));
                }
            });
        }
    }
}
