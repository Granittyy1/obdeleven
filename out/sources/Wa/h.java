package Wa;

import Ia.l;

/* JADX INFO: compiled from: FormatterOperation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<T, Integer> f7086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7087b;

    public h(l lVar, int i10) {
        this.f7086a = lVar;
        this.f7087b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.c(i10, "The minimum number of digits (", ") is negative").toString());
        }
        if (i10 > 9) {
            throw new IllegalArgumentException(J4.i.c(i10, "The minimum number of digits (", ") exceeds the length of an Int").toString());
        }
    }

    @Override // Wa.e
    public final void a(kotlinx.datetime.internal.format.parser.c cVar, StringBuilder sb2, boolean z10) {
        StringBuilder sb3 = new StringBuilder();
        int iIntValue = this.f7086a.invoke(cVar).intValue();
        if (z10 && iIntValue < 0) {
            iIntValue = -iIntValue;
        }
        int[] iArr = Va.b.f6876a;
        if (iIntValue >= iArr[4]) {
            sb3.append('+');
        }
        int iAbs = Math.abs(iIntValue);
        int i10 = this.f7087b;
        if (iAbs >= iArr[i10 - 1]) {
            sb3.append(iIntValue);
        } else if (iIntValue >= 0) {
            sb3.append(iIntValue + iArr[i10]);
            kotlin.jvm.internal.i.d(sb3.deleteCharAt(0), "deleteCharAt(...)");
        } else {
            sb3.append(iIntValue - iArr[i10]);
            kotlin.jvm.internal.i.d(sb3.deleteCharAt(1), "deleteCharAt(...)");
        }
        sb2.append((CharSequence) sb3);
    }
}
