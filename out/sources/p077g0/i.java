package p077g0;

/* JADX INFO: compiled from: Schlick.java */
/* JADX INFO: loaded from: classes.dex */
public final class i extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f35141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f35142e;

    @Override // p077g0.c
    public final double a(double d10) {
        double d11 = this.f35142e;
        double d12 = this.f35141d;
        if (d10 < d11) {
            return (d11 * d10) / (((d11 - d10) * d12) + d10);
        }
        return ((d10 - 1.0d) * (1.0d - d11)) / ((1.0d - d10) - ((d11 - d10) * d12));
    }

    @Override // p077g0.c
    public final double b(double d10) {
        double d11 = this.f35142e;
        double d12 = this.f35141d;
        if (d10 < d11) {
            double d13 = d12 * d11 * d11;
            double d14 = ((d11 - d10) * d12) + d10;
            return d13 / (d14 * d14);
        }
        double d15 = d11 - 1.0d;
        double d16 = (((d11 - d10) * (-d12)) - d10) + 1.0d;
        return ((d15 * d12) * d15) / (d16 * d16);
    }
}
