package p037cb;

import java.util.Arrays;
import kotlin.jvm.internal.i;
import p293xa.l;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class F0 extends AbstractC1540n0<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f22547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22548b;

    @Override // p037cb.AbstractC1540n0
    public final l a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f22547a, this.f22548b);
        i.d(iArrCopyOf, "copyOf(...)");
        return new l(iArrCopyOf);
    }

    @Override // p037cb.AbstractC1540n0
    public final void b(int i10) {
        int[] iArr = this.f22547a;
        if (iArr.length < i10) {
            int length = iArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i10);
            i.d(iArrCopyOf, "copyOf(...)");
            this.f22547a = iArrCopyOf;
        }
    }

    @Override // p037cb.AbstractC1540n0
    public final int d() {
        return this.f22548b;
    }
}
