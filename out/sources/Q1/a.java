package Q1;

import p005a4.o;

/* JADX INFO: compiled from: PrivateCommand.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4986b;

    public a(long j, long j10) {
        this.f4985a = j10;
        this.f4986b = j;
    }

    @Override // Q1.b
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb2.append(this.f4985a);
        sb2.append(", identifier= ");
        return o.d(this.f4986b, " }", sb2);
    }
}
