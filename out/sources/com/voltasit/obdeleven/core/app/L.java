package com.voltasit.obdeleven.core.app;

/* JADX INFO: compiled from: DigitFieldCommand.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class L extends AbstractC2107w {
    public final String[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f30053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f30054l;

    public L(I8.b bVar) {
        super(bVar, false);
        String strA = bVar.f3915a.a();
        String[] strArrSplit = bVar.f3916b.split("/");
        this.j = bVar.f3918d.split("/");
        strA.getClass();
        if (strA.equals("SUB_CODING")) {
            this.f30053k = Integer.parseInt(strArrSplit[2]);
            this.f30054l = Integer.parseInt(strArrSplit[3]);
        } else if (strA.equals("CODING")) {
            this.f30053k = Integer.parseInt(strArrSplit[1]);
            this.f30054l = Integer.parseInt(strArrSplit[2]);
        } else {
            this.f30053k = 0;
            this.f30054l = 0;
        }
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final String c() {
        String strA = a();
        int i10 = this.f30054l;
        int i11 = this.f30053k;
        return strA.substring(i11, i10 + i11);
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final boolean e(int i10) {
        return this.f30181e || this.j[i10].equals(c());
    }

    @Override // com.voltasit.obdeleven.core.app.AbstractC2107w
    public final void h(int i10) {
        String str = this.j[i10];
        String strA = a();
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.f30053k;
        sb2.append(strA.substring(0, i11));
        sb2.append(str);
        sb2.append(strA.substring(i11 + this.f30054l));
        f(sb2.toString());
    }
}
