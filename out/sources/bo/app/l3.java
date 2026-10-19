package bo.app;

/* JADX INFO: loaded from: classes.dex */
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l3 f21472a = new l3();

    private l3() {
    }

    public static final double a(double d10, double d11, double d12, double d13) {
        double radians = Math.toRadians(d12 - d10);
        double radians2 = Math.toRadians(d13 - d11);
        double d14 = 2;
        return Math.asin(Math.sqrt((Math.cos(Math.toRadians(d12)) * Math.cos(Math.toRadians(d10)) * Math.pow(Math.sin(radians2 / d14), 2.0d)) + Math.pow(Math.sin(radians / d14), 2.0d))) * 1.2742E7d;
    }
}
