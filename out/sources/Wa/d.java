package Wa;

import Ia.l;
import androidx.core.view.C1293h;
import java.util.List;

/* JADX INFO: compiled from: FormatterOperation.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<T, Va.a> f7079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Integer> f7082d;

    public d(int i10, int i11, l lVar, List list) {
        this.f7079a = lVar;
        this.f7080b = i10;
        this.f7081c = i11;
        this.f7082d = list;
        if (1 > i10 || i10 >= 10) {
            throw new IllegalArgumentException(J4.i.c(i10, "The minimum number of digits (", ") is not in range 1..9").toString());
        }
        if (i10 > i11 || i11 >= 10) {
            throw new IllegalArgumentException(C1293h.h("The maximum number of digits (", ") is not in range ", "..9", i11, i10).toString());
        }
    }

    @Override // Wa.e
    public final void a(kotlinx.datetime.internal.format.parser.c cVar, StringBuilder sb2, boolean z10) {
        int[] iArr;
        Va.a aVarInvoke = this.f7079a.invoke(cVar);
        int i10 = this.f7081c;
        int iA = aVarInvoke.a(i10);
        int i11 = 0;
        while (true) {
            int i12 = this.f7080b + i11;
            iArr = Va.b.f6876a;
            if (i10 <= i12) {
                break;
            }
            int i13 = i11 + 1;
            if (iA % iArr[i13] != 0) {
                break;
            } else {
                i11 = i13;
            }
        }
        int iIntValue = this.f7082d.get((i10 - i11) - 1).intValue();
        if (i11 >= iIntValue) {
            i11 -= iIntValue;
        }
        String strSubstring = String.valueOf((iA / iArr[i11]) + iArr[i10 - i11]).substring(1);
        kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
        sb2.append((CharSequence) strSubstring);
    }
}
