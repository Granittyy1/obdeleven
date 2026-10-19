package p077g0;

import java.util.Arrays;

/* JADX INFO: compiled from: Oscillator.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f35136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f35137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f35138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f35139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35140e;

    public final void a(double d10, float f10) {
        int length = this.f35136a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f35137b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f35137b = Arrays.copyOf(this.f35137b, length);
        this.f35136a = Arrays.copyOf(this.f35136a, length);
        this.f35138c = new double[length];
        double[] dArr = this.f35137b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f35137b[iBinarySearch] = d10;
        this.f35136a[iBinarySearch] = f10;
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.f35137b) + " period=" + Arrays.toString(this.f35136a);
    }
}
