package Wa;

import Ia.l;
import kotlin.text.m;

/* JADX INFO: compiled from: FormatterOperation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<T, Integer> f7083a;

    public f(l lVar) {
        this.f7083a = lVar;
    }

    @Override // Wa.e
    public final void a(kotlinx.datetime.internal.format.parser.c cVar, StringBuilder sb2, boolean z10) {
        int iIntValue = this.f7083a.invoke(cVar).intValue();
        int i10 = Va.b.f6876a[2];
        int i11 = iIntValue - 2000;
        if (i11 < 0 || i11 >= i10) {
            if (iIntValue >= 0) {
                sb2.append("+");
            }
            sb2.append(String.valueOf(iIntValue));
        } else {
            String strValueOf = String.valueOf(iIntValue % i10);
            CharSequence[] charSequenceArr = {m.F(Math.max(0, 2 - strValueOf.length()), "0"), strValueOf};
            for (int i12 = 0; i12 < 2; i12++) {
                sb2.append(charSequenceArr[i12]);
            }
        }
    }
}
