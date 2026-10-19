package Wa;

import Ia.l;

/* JADX INFO: compiled from: FormatterOperation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class k<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<T, Integer> f7091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7092b;

    /* JADX WARN: Multi-variable type inference failed */
    public k(l<? super T, Integer> lVar, int i10) {
        this.f7091a = lVar;
        this.f7092b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(J4.i.c(i10, "The minimum number of digits (", ") is negative").toString());
        }
        if (i10 > 9) {
            throw new IllegalArgumentException(J4.i.c(i10, "The minimum number of digits (", ") exceeds the length of an Int").toString());
        }
    }

    @Override // Wa.e
    public final void a(kotlinx.datetime.internal.format.parser.c cVar, StringBuilder sb2, boolean z10) {
        String strValueOf = String.valueOf(this.f7091a.invoke(cVar).intValue());
        int length = this.f7092b - strValueOf.length();
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append('0');
        }
        sb2.append((CharSequence) strValueOf);
    }
}
