package p037cb;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class A extends AbstractC1540n0<float[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f22530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22531b;

    @Override // p037cb.AbstractC1540n0
    public final float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f22530a, this.f22531b);
        i.d(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // p037cb.AbstractC1540n0
    public final void b(int i10) {
        float[] fArr = this.f22530a;
        if (fArr.length < i10) {
            int length = fArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i10);
            i.d(fArrCopyOf, "copyOf(...)");
            this.f22530a = fArrCopyOf;
        }
    }

    @Override // p037cb.AbstractC1540n0
    public final int d() {
        return this.f22531b;
    }
}
