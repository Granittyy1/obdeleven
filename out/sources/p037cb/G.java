package p037cb;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class G extends AbstractC1540n0<int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f22549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22550b;

    @Override // p037cb.AbstractC1540n0
    public final int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f22549a, this.f22550b);
        i.d(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // p037cb.AbstractC1540n0
    public final void b(int i10) {
        int[] iArr = this.f22549a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            i.d(iArrCopyOf, "copyOf(...)");
            this.f22549a = iArrCopyOf;
        }
    }

    @Override // p037cb.AbstractC1540n0
    public final int d() {
        return this.f22550b;
    }
}
