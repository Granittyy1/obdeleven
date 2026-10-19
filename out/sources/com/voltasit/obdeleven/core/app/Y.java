package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: LongCodingCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class Y extends AbstractC2107w {
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f30072k;

    /* JADX INFO: compiled from: LongCodingCommand.java */
    public class a extends AbstractC2102q {
        public a(I8.b bVar) {
            super(bVar, false);
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
        public final String b() {
            return Y.this.j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(I8.b bVar, String str) {
        super(bVar, false);
        this.f30072k = new ArrayList();
        this.j = str;
        String[] strArrSplit = bVar.f3916b.split(";");
        String[] strArrSplit2 = bVar.f3918d.split(";");
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            this.f30072k.add(new a(new I8.b(bVar.f3915a, strArrSplit[i10], bVar.f3917c, strArrSplit2[i10])));
        }
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String b() {
        return this.j;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        for (AbstractC2102q abstractC2102q : this.f30072k) {
            if (sb2.length() > 0) {
                sb2.append(";");
            }
            sb2.append(abstractC2102q.c());
        }
        return sb2.toString();
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final boolean e(int i10) {
        Iterator it = this.f30072k.iterator();
        while (it.hasNext()) {
            if (!((AbstractC2102q) it.next()).e(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return controlUnit.e().continueWith(new V8.z(this, 2, controlUnit));
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final void h(int i10) {
        Iterator it = this.f30072k.iterator();
        while (it.hasNext()) {
            ((AbstractC2102q) it.next()).h(i10);
        }
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(final ControlUnit controlUnit) {
        return Task.callInBackground(new Callable() { // from class: com.voltasit.obdeleven.core.app.X
            @Override // java.util.concurrent.Callable
            public final Object call() throws InterruptedException {
                Integer numM0 = controlUnit.M0(this.f30070b.a());
                if (numM0.intValue() == 0) {
                    return 0;
                }
                if (numM0.intValue() == -1) {
                    return -3;
                }
                if (numM0.intValue() > 128) {
                    return numM0;
                }
                return -1;
            }
        });
    }
}
