package p142l3;

import android.graphics.PointF;

/* JADX INFO: compiled from: CubicCurveData.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF f44340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f44341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PointF f44342c;

    public a() {
        this.f44340a = new PointF();
        this.f44341b = new PointF();
        this.f44342c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f44342c;
        Float fValueOf = Float.valueOf(pointF.x);
        Float fValueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f44340a;
        Float fValueOf3 = Float.valueOf(pointF2.x);
        Float fValueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f44341b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", fValueOf, fValueOf2, fValueOf3, fValueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f44340a = pointF;
        this.f44341b = pointF2;
        this.f44342c = pointF3;
    }
}
