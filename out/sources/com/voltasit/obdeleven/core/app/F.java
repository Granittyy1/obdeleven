package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: DataByIdCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class F extends AbstractC2107w {
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f30040k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f30041l;

    /* JADX INFO: compiled from: DataByIdCommand.java */
    public class a extends AbstractC2102q {
        public a(I8.b bVar) {
            super(bVar, false);
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
        public final String b() {
            return F.this.j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(I8.b bVar, String str) {
        super(bVar, false);
        this.f30041l = new ArrayList();
        this.j = str;
        String str2 = bVar.f3916b;
        this.f30040k = str2.substring(0, 4);
        String[] strArrSplit = str2.substring(5).split(";");
        String[] strArrSplit2 = bVar.f3918d.split(";");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            this.f30041l.add(new a(new I8.b(bVar.f3915a, this.f30040k + "/" + strArrSplit[i10], bVar.f3917c, strArrSplit2[i10])));
        }
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String b() {
        return this.j;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        for (AbstractC2102q abstractC2102q : this.f30041l) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(abstractC2102q.c());
        }
        return sb2.toString();
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final boolean e(int i10) {
        Iterator it = this.f30041l.iterator();
        while (it.hasNext()) {
            if (!((AbstractC2102q) it.next()).e(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return controlUnit.s0(this.f30040k).continueWith(new B(0, this));
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final void h(int i10) {
        Iterator it = this.f30041l.iterator();
        while (it.hasNext()) {
            ((AbstractC2102q) it.next()).h(i10);
        }
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(final ControlUnit controlUnit) {
        Calendar calendar = Calendar.getInstance();
        return controlUnit.t0("F199", String.format(Locale.US, "%ty%tm%td", calendar, calendar, calendar)).continueWithTask(new C(0, controlUnit)).continueWithTask(new Continuation() { // from class: com.voltasit.obdeleven.core.app.D
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                F f10 = this.f30037a;
                return controlUnit.t0(f10.f30040k, f10.a());
            }
        }).continueWith(new E(0));
    }
}
