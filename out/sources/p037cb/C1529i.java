package p037cb;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX INFO: renamed from: cb.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1529i extends AbstractC1540n0<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f22615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22616b;

    @Override // p037cb.AbstractC1540n0
    public final byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f22615a, this.f22616b);
        i.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // p037cb.AbstractC1540n0
    public final void b(int i10) {
        byte[] bArr = this.f22615a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            i.d(bArrCopyOf, "copyOf(...)");
            this.f22615a = bArrCopyOf;
        }
    }

    @Override // p037cb.AbstractC1540n0
    public final int d() {
        return this.f22616b;
    }
}
