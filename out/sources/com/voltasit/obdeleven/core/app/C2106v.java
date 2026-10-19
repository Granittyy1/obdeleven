package com.voltasit.obdeleven.core.app;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CodingCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2106v extends AbstractC2107w {
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC2107w f30168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String[] f30169l;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.v$a */
    /* JADX INFO: compiled from: CodingCommand.java */
    public class a extends AbstractC2102q {
        public a(I8.b bVar) {
            super(bVar, true);
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
        public final String b() {
            return C2106v.this.j;
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
        public final Task<Integer> g(ControlUnit controlUnit) {
            C2106v c2106v = C2106v.this;
            c2106v.getClass();
            return controlUnit.n0().continueWith(new C2104t(c2106v, controlUnit));
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2102q, com.voltasit.obdeleven.core.app.AbstractC2107w
        public final Task<Integer> i(ControlUnit controlUnit) {
            return C2106v.j(C2106v.this, controlUnit);
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.v$b */
    /* JADX INFO: compiled from: CodingCommand.java */
    public class b extends K {
        public b(I8.b bVar) {
            super(bVar, false);
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
        public final String b() {
            return C2106v.this.j;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.core.app.v$c */
    /* JADX INFO: compiled from: CodingCommand.java */
    public class c extends L {
        public c(I8.b bVar) {
            super(bVar);
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
        public final String b() {
            return C2106v.this.j;
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
        public final Task<Integer> g(ControlUnit controlUnit) {
            C2106v c2106v = C2106v.this;
            c2106v.getClass();
            return controlUnit.n0().continueWith(new C2104t(c2106v, controlUnit));
        }

        @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
        public final Task<Integer> i(ControlUnit controlUnit) {
            return C2106v.j(C2106v.this, controlUnit);
        }
    }

    public C2106v(I8.b bVar, String str) {
        super(bVar, false);
        this.j = str;
        String[] strArrSplit = bVar.f3916b.split("/");
        this.f30169l = strArrSplit;
        if (Integer.parseInt(strArrSplit[0]) == 0) {
            this.f30168k = new a(bVar);
        } else if (Integer.parseInt(strArrSplit[0]) == 2) {
            this.f30168k = new b(bVar);
        } else {
            this.f30168k = new c(bVar);
        }
    }

    public static Task j(C2106v c2106v, ControlUnit controlUnit) {
        String strA = c2106v.a();
        if (Integer.parseInt(c2106v.f30169l[0]) == 0) {
            strA = Integer.toString(Integer.parseInt(strA, 16));
        }
        return controlUnit.K0(strA).continueWith(new C2105u(0));
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String b() {
        return this.f30168k.b();
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String c() {
        return this.f30168k.c();
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final boolean e(int i10) {
        return this.f30168k.e(i10);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> g(ControlUnit controlUnit) {
        return this.f30168k.g(controlUnit);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final void h(int i10) {
        this.f30168k.h(i10);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final Task<Integer> i(ControlUnit controlUnit) {
        return this.f30168k.i(controlUnit);
    }
}
