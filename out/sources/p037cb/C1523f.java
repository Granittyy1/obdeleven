package p037cb;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX INFO: renamed from: cb.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1523f extends AbstractC1540n0<boolean[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f22606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22607b;

    @Override // p037cb.AbstractC1540n0
    public final boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f22606a, this.f22607b);
        i.d(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // p037cb.AbstractC1540n0
    public final void b(int i10) {
        boolean[] zArr = this.f22606a;
        if (zArr.length < i10) {
            int length = zArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i10);
            i.d(zArrCopyOf, "copyOf(...)");
            this.f22606a = zArrCopyOf;
        }
    }

    @Override // p037cb.AbstractC1540n0
    public final int d() {
        return this.f22607b;
    }
}
