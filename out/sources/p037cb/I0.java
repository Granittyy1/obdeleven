package p037cb;

import java.util.Arrays;
import kotlin.jvm.internal.i;
import p293xa.n;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class I0 extends AbstractC1540n0<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f22557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22558b;

    @Override // p037cb.AbstractC1540n0
    public final n a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f22557a, this.f22558b);
        i.d(jArrCopyOf, "copyOf(...)");
        return new n(jArrCopyOf);
    }

    @Override // p037cb.AbstractC1540n0
    public final void b(int i10) {
        long[] jArr = this.f22557a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
            i.d(jArrCopyOf, "copyOf(...)");
            this.f22557a = jArrCopyOf;
        }
    }

    @Override // p037cb.AbstractC1540n0
    public final int d() {
        return this.f22558b;
    }
}
