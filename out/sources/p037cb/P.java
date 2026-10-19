package p037cb;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class P extends AbstractC1540n0<long[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f22574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22575b;

    @Override // p037cb.AbstractC1540n0
    public final long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f22574a, this.f22575b);
        i.d(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // p037cb.AbstractC1540n0
    public final void b(int i10) {
        long[] jArr = this.f22574a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
            i.d(jArrCopyOf, "copyOf(...)");
            this.f22574a = jArrCopyOf;
        }
    }

    @Override // p037cb.AbstractC1540n0
    public final int d() {
        return this.f22575b;
    }
}
