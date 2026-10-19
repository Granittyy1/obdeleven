package p037cb;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC1540n0<double[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f22647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22648b;

    @Override // p037cb.AbstractC1540n0
    public final double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f22647a, this.f22648b);
        i.d(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // p037cb.AbstractC1540n0
    public final void b(int i10) {
        double[] dArr = this.f22647a;
        if (dArr.length < i10) {
            int length = dArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
            i.d(dArrCopyOf, "copyOf(...)");
            this.f22647a = dArrCopyOf;
        }
    }

    @Override // p037cb.AbstractC1540n0
    public final int d() {
        return this.f22648b;
    }
}
