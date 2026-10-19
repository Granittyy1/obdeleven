package p037cb;

import java.util.Arrays;
import kotlin.jvm.internal.i;
import p293xa.j;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C0 extends AbstractC1540n0<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f22540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22541b;

    @Override // p037cb.AbstractC1540n0
    public final j a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f22540a, this.f22541b);
        i.d(bArrCopyOf, "copyOf(...)");
        return new j(bArrCopyOf);
    }

    @Override // p037cb.AbstractC1540n0
    public final void b(int i10) {
        byte[] bArr = this.f22540a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            i.d(bArrCopyOf, "copyOf(...)");
            this.f22540a = bArrCopyOf;
        }
    }

    @Override // p037cb.AbstractC1540n0
    public final int d() {
        return this.f22541b;
    }
}
