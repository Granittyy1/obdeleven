package p037cb;

import java.util.Arrays;
import kotlin.jvm.internal.i;
import p293xa.q;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class L0 extends AbstractC1540n0<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f22565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22566b;

    @Override // p037cb.AbstractC1540n0
    public final q a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f22565a, this.f22566b);
        i.d(sArrCopyOf, "copyOf(...)");
        return new q(sArrCopyOf);
    }

    @Override // p037cb.AbstractC1540n0
    public final void b(int i10) {
        short[] sArr = this.f22565a;
        if (sArr.length < i10) {
            int length = sArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
            i.d(sArrCopyOf, "copyOf(...)");
            this.f22565a = sArrCopyOf;
        }
    }

    @Override // p037cb.AbstractC1540n0
    public final int d() {
        return this.f22566b;
    }
}
