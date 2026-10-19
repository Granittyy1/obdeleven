package androidx.compose.foundation.lazy.grid;

import com.braze.support.BrazeLogger;
import java.util.List;

/* JADX INFO: compiled from: LazyGridMeasuredLineProvider.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f10525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f10528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LazyGridSpanLayoutProvider f10529f;

    public t(boolean z10, x xVar, int i10, int i11, m mVar, LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        this.f10524a = z10;
        this.f10525b = xVar;
        this.f10526c = i10;
        this.f10527d = i11;
        this.f10528e = mVar;
        this.f10529f = lazyGridSpanLayoutProvider;
    }

    public final long a(int i10, int i11) {
        int i12;
        x xVar = this.f10525b;
        if (i11 == 1) {
            i12 = ((int[]) xVar.f10535a)[i10];
        } else {
            int i13 = (i11 + i10) - 1;
            int[] iArr = (int[]) xVar.f10536b;
            i12 = (iArr[i13] + ((int[]) xVar.f10535a)[i13]) - iArr[i10];
        }
        if (i12 < 0) {
            i12 = 0;
        }
        if (this.f10524a) {
            if (!(i12 >= 0)) {
                p013b0.i.a("width must be >= 0");
            }
            return p013b0.b.h(i12, i12, 0, BrazeLogger.SUPPRESS);
        }
        if (!(i12 >= 0)) {
            p013b0.i.a("height must be >= 0");
        }
        return p013b0.b.h(0, BrazeLogger.SUPPRESS, i12, i12);
    }

    public abstract s b(int i10, q[] qVarArr, List<c> list, int i11);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final s c(int i10) {
        LazyGridSpanLayoutProvider.c cVarB = this.f10529f.b(i10);
        ?? r10 = cVarB.f10415b;
        int size = r10.size();
        int i11 = cVarB.f10414a;
        int i12 = (size == 0 || i11 + size == this.f10526c) ? 0 : this.f10527d;
        q[] qVarArr = new q[size];
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            int i15 = (int) ((c) r10.get(i14)).f10449a;
            q qVarC = this.f10528e.c(i11 + i14, i13, i15, i12, a(i13, i15));
            i13 += i15;
            p293xa.r rVar = p293xa.r.f47939a;
            qVarArr[i14] = qVarC;
        }
        return b(i10, qVarArr, r10, i12);
    }
}
