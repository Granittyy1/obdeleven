package p037cb;

import java.util.Arrays;
import kotlin.jvm.internal.i;

/* JADX INFO: renamed from: cb.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C1537m extends AbstractC1540n0<char[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f22636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22637b;

    @Override // p037cb.AbstractC1540n0
    public final char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f22636a, this.f22637b);
        i.d(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // p037cb.AbstractC1540n0
    public final void b(int i10) {
        char[] cArr = this.f22636a;
        if (cArr.length < i10) {
            int length = cArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i10);
            i.d(cArrCopyOf, "copyOf(...)");
            this.f22636a = cArrCopyOf;
        }
    }

    @Override // p037cb.AbstractC1540n0
    public final int d() {
        return this.f22637b;
    }
}
